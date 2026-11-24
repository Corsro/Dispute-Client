import org.objectweb.asm.*;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;

/**
 * Build-time ASM bytecode transformer for CorzClient's original JAR.
 *
 * Preserves all QVM calls and <invokedynamic> string decryption intact while:
 *  1) Rerouting direct GLFW.glfwGetMouseButton / glfwGetKey / glfwGetKeyName calls in gg.corz.*
 *     through MojoInputBridge (safe on Ixeris + 75ms Mojo touch-tap latch).
 *  2) Replacing java.awt.FileDialog construction/invocations with CompatFileDialog (zero HeadlessException).
 *  3) Auditing and reporting any remaining AWT, ProcessBuilder, Desktop, JNA, or native library references.
 */
public final class CorzBytecodePatcher {
    private static final String GLFW_INTERNAL = "org/lwjgl/glfw/GLFW";
    private static final String MOJO_INPUT_BRIDGE = "com/corz/client/android/MojoInputBridge";
    private static final String FILE_DIALOG_INTERNAL = "java/awt/FileDialog";
    private static final String COMPAT_FILE_DIALOG_INTERNAL = "com/corz/client/android/CompatFileDialog";

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("Usage: CorzBytecodePatcher <input-jar> <output-jar> <report-file>");
            System.exit(1);
        }
        Path inputJar = Path.of(args[0]);
        Path outputJar = Path.of(args[1]);
        Path reportFile = Path.of(args[2]);

        Stats stats = new Stats();
        try (JarFile inJar = new JarFile(inputJar.toFile());
             JarOutputStream outJar = new JarOutputStream(new BufferedOutputStream(Files.newOutputStream(outputJar)))) {

            Enumeration<JarEntry> entries = inJar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                // Strip signatures if any so overlaid/patched classes never trigger SecurityException
                if (name.startsWith("META-INF/") && (name.endsWith(".SF") || name.endsWith(".DSA") || name.endsWith(".RSA"))) {
                    stats.auditLines.add("STRIPPED_SIG: " + name);
                    continue;
                }

                JarEntry newEntry = new JarEntry(name);
                if (entry.getTime() > 0) {
                    newEntry.setTime(entry.getTime());
                }
                outJar.putNextEntry(newEntry);

                try (InputStream is = inJar.getInputStream(entry)) {
                    if (name.endsWith(".class") && name.startsWith("gg/corz/")) {
                        byte[] raw = is.readAllBytes();
                        byte[] transformed = transformClass(name, raw, stats);
                        outJar.write(transformed);
                        stats.classesScanned++;
                    } else {
                        is.transferTo(outJar);
                    }
                }
                outJar.closeEntry();
            }
        }

        String summary = String.join("\n",
            "CorzBytecodePatcher Report",
            "==========================",
            "gg/corz classes scanned: " + stats.classesScanned,
            "glfwGetMouseButton patched: " + stats.mouseButtonRewrites,
            "glfwGetKey patched: " + stats.keyRewrites,
            "glfwGetKeyName patched: " + stats.keyNameRewrites,
            "FileDialog refs patched: " + stats.fileDialogRewrites,
            "",
            "--- Audit Findings ---"
        ) + "\n" + String.join("\n", stats.auditLines) + "\n";

        Files.createDirectories(reportFile.getParent());
        Files.writeString(reportFile, summary);
        System.out.println(summary);
    }

    private static byte[] transformClass(String entryName, byte[] raw, Stats stats) {
        ClassReader cr = new ClassReader(raw);
        // Preserve original frames cleanly using COMPUTE_MAXS without recomputing frames across <invokedynamic>/obfuscation
        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);

        // First remap FileDialog internal type cleanly via ClassRemapper
        ClassVisitor remappingVisitor = new ClassRemapper(cw, new Remapper() {
            @Override
            public String map(String internalName) {
                if (FILE_DIALOG_INTERNAL.equals(internalName)) {
                    stats.fileDialogRewrites++;
                    stats.auditLines.add("PATCHED_FILE_DIALOG_TYPE: " + entryName);
                    return COMPAT_FILE_DIALOG_INTERNAL;
                }
                return super.map(internalName);
            }
        });

        ClassVisitor methodPatcher = new ClassVisitor(Opcodes.ASM9, remappingVisitor) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);
                return new MethodVisitor(Opcodes.ASM9, mv) {
                    @Override
                    public void visitLdcInsn(Object value) {
                        if (value instanceof String) {
                            String s = (String) value;
                            if (!s.contains("assets/") && !s.contains("corzclient") && !s.startsWith("gg/corz/") && !s.startsWith("com/corz/")) {
                                if (s.equals("Corz") || s.equals("CorzClient")) {
                                    super.visitLdcInsn("Dispute");
                                    return;
                                }
                                if (s.equals("CORZ") || s.equals("CORZ CLIENT")) {
                                    super.visitLdcInsn("DISPUTE");
                                    return;
                                }
                                if (s.contains("Corz Client")) {
                                    super.visitLdcInsn(s.replace("Corz Client", "Dispute Client"));
                                    return;
                                }
                                if (s.contains("corz.gg")) {
                                    super.visitLdcInsn(s.replace("corz.gg", "dispute.gg"));
                                    return;
                                }
                            }
                        }
                        super.visitLdcInsn(value);
                    }

                    @Override
                    public void visitMethodInsn(int opcode, String owner, String mName, String mDesc, boolean isInterface) {
                        if (GLFW_INTERNAL.equals(owner)) {
                            if ("glfwGetMouseButton".equals(mName) && "(JI)I".equals(mDesc)) {
                                stats.mouseButtonRewrites++;
                                stats.auditLines.add("PATCHED_GLFW_MOUSE: " + entryName + "#" + name);
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, MOJO_INPUT_BRIDGE, "glfwGetMouseButtonCompat", mDesc, false);
                                return;
                            }
                            if ("glfwGetKey".equals(mName) && "(JI)I".equals(mDesc)) {
                                stats.keyRewrites++;
                                stats.auditLines.add("PATCHED_GLFW_KEY: " + entryName + "#" + name);
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, MOJO_INPUT_BRIDGE, "glfwGetKeyCompat", mDesc, false);
                                return;
                            }
                            if ("glfwGetKeyName".equals(mName) && "(II)Ljava/lang/String;".equals(mDesc)) {
                                stats.keyNameRewrites++;
                                stats.auditLines.add("PATCHED_GLFW_KEY_NAME: " + entryName + "#" + name);
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, MOJO_INPUT_BRIDGE, "glfwGetKeyNameCompat", mDesc, false);
                                return;
                            }
                        }

                        if (owner != null && (
                            (owner.startsWith("java/awt/") && !owner.equals("java/awt/Color") && !owner.equals("java/awt/Font")
                             && !owner.equals("java/awt/FontMetrics") && !owner.equals("java/awt/Graphics2D")
                             && !owner.equals("java/awt/RenderingHints") && !owner.equals("java/awt/RenderingHints$Key")
                             && !owner.equals("java/awt/geom/Rectangle2D") && !owner.equals("java/awt/image/BufferedImage")
                             && !owner.equals("java/awt/Graphics"))
                            || owner.startsWith("javax/swing/")
                            || owner.equals("java/lang/ProcessBuilder")
                            || (owner.equals("java/lang/Runtime") && "exec".equals(mName))
                            || owner.startsWith("com/sun/jna/")
                        )) {
                            stats.auditLines.add("AUDIT_API: " + entryName + "#" + name + " -> " + owner + "." + mName + mDesc);
                        }
                        super.visitMethodInsn(opcode, owner, mName, mDesc, isInterface);
                    }
                };
            }
        };

        cr.accept(methodPatcher, 0);
        return cw.toByteArray();
    }

    private static final class Stats {
        int classesScanned;
        int mouseButtonRewrites;
        int keyRewrites;
        int keyNameRewrites;
        int fileDialogRewrites;
        final List<String> auditLines = new ArrayList<>();
    }
}
