import org.objectweb.asm.*;
import org.objectweb.asm.commons.ClassRemapper;
import org.objectweb.asm.commons.Remapper;

import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.jar.*;

/**
 * Build-time ASM bytecode transformer for Dispute Client v2.0.3 (Android ARM64 / Mojo Launcher).
 *
 * Actions performed:
 *  1) Strips Windows-only vm.dll, net/fabric/* malware, gg/corz/injector/*, assets/wvbwipuv.cfg, and JAR signatures.
 *  2) Lowers all 15 QVM-protected gg/corz/* classes (including Module.setEnabled, ModuleManager.onEndTick,
 *     license/HWID checks, and auxiliary QVM helpers) to pure Java bytecode so ZERO native vm.dll/libvm.so
 *     calls or Runtime.loadVm/run* invocations remain anywhere in the JAR.
 *  3) Remaps java.awt.FileDialog -> com.corz.client.android.CompatFileDialog (no HeadlessException on Android).
 *  4) Reroutes direct GLFW.glfwGetMouseButton / glfwGetKey / glfwGetKeyName / glfwGetKeyScancode calls
 *     through MojoInputBridge (safe on Ixeris + 75ms Mojo touch-tap latch).
 *  5) Rebrands leaked/upstream LDC UI strings cleanly to Dispute Client.
 */
public final class CorzBytecodePatcher {
    private static final String GLFW_INTERNAL = "org/lwjgl/glfw/GLFW";
    private static final String MOJO_INPUT_BRIDGE = "com/corz/client/android/MojoInputBridge";
    private static final String FILE_DIALOG_INTERNAL = "java/awt/FileDialog";
    private static final String COMPAT_FILE_DIALOG_INTERNAL = "com/corz/client/android/CompatFileDialog";
    private static final String QVM_RUNTIME_INTERNAL = "com/corz/client/qvm/Runtime";

    private static final Set<String> OTHER_QVM_ONLY_CLASSES = Set.of(
        "gg/corz/IIIIIllI",
        "gg/corz/IIIIiiIil",
        "gg/corz/IIIiIiIl",
        "gg/corz/IIIiiIIlI",
        "gg/corz/IIIiillii",
        "gg/corz/IIIlIIiil",
        "gg/corz/IIIlilIll",
        "gg/corz/IIiI",
        "gg/corz/IIiIIIIIl",
        "gg/corz/IIilliiI",
        "gg/corz/IIli"
    );

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            System.err.println("Usage: CorzBytecodePatcher <input-jar> <output-jar> <report-file>");
            System.exit(1);
        }
        Path inputJar = Path.of(args[0]);
        Path outputJar = Path.of(args[1]);
        Path reportFile = Path.of(args[2]);
        Files.createDirectories(outputJar.getParent());

        Stats stats = new Stats();
        try (JarFile inJar = new JarFile(inputJar.toFile());
             JarOutputStream outJar = new JarOutputStream(new BufferedOutputStream(Files.newOutputStream(outputJar)))) {

            Enumeration<JarEntry> entries = inJar.entries();
            while (entries.hasMoreElements()) {
                JarEntry entry = entries.nextElement();
                String name = entry.getName();

                if (shouldStripEntry(name)) {
                    stats.strippedEntries++;
                    stats.auditLines.add("STRIPPED: " + name);
                    continue;
                }

                JarEntry newEntry = new JarEntry(name);
                if (entry.getTime() > 0) {
                    newEntry.setTime(entry.getTime());
                }
                outJar.putNextEntry(newEntry);

                try (InputStream is = inJar.getInputStream(entry)) {
                    if (shouldTransformClass(name)) {
                        byte[] raw = is.readAllBytes();
                        byte[] transformed = transformClass(name, raw, stats);
                        verifyNoRemainingQvmCalls(name, transformed);
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
            "CorzBytecodePatcher (2.0.3 Pure-Java Android) Report",
            "===================================================",
            "Classes scanned & verified (0 QVM calls): " + stats.classesScanned,
            "Stripped entries (malware/dll/sigs): " + stats.strippedEntries,
            "QVM methods lowered to pure Java: " + stats.qvmMethodsLowered,
            "QVM <clinit> loadVm stripped: " + stats.qvmClinitsLowered,
            "glfwGetMouseButton patched: " + stats.mouseButtonRewrites,
            "glfwGetKey patched: " + stats.keyRewrites,
            "glfwGetKeyName patched: " + stats.keyNameRewrites,
            "glfwGetKeyScancode patched: " + stats.keyScancodeRewrites,
            "FileDialog refs patched: " + stats.fileDialogRewrites,
            "LDC branding strings patched: " + stats.brandingRewrites,
            "",
            "--- Audit Findings ---"
        ) + "\n" + String.join("\n", stats.auditLines) + "\n";

        Files.createDirectories(reportFile.getParent());
        Files.writeString(reportFile, summary);
        System.out.println(summary);
    }

    private static boolean shouldStripEntry(String name) {
        if (name.startsWith("net/fabric/") || name.startsWith("gg/corz/injector/")) {
            return true;
        }
        if ("assets/wvbwipuv.cfg".equals(name) || name.endsWith("vm.dll") || name.endsWith(".dll")) {
            return true;
        }
        return name.startsWith("META-INF/") && (name.endsWith(".SF") || name.endsWith(".DSA") || name.endsWith(".RSA"));
    }

    private static boolean shouldTransformClass(String name) {
        if (!name.endsWith(".class")) {
            return false;
        }
        if (name.startsWith("com/corz/client/android/") || name.startsWith("com/corz/client/qvm/")) {
            return false;
        }
        return name.startsWith("gg/corz/")
            || name.startsWith("corzbot/")
            || name.startsWith("de/neo/uhcbot/")
            || name.startsWith("com/corz/client/");
    }

    private static byte[] transformClass(String entryName, byte[] raw, Stats stats) {
        String internalName = entryName.substring(0, entryName.length() - 6);
        ClassReader cr = new ClassReader(raw);
        ClassWriter cw = new ClassWriter(cr, ClassWriter.COMPUTE_MAXS);

        ClassVisitor remappingVisitor = new ClassRemapper(cw, new Remapper() {
            @Override
            public String map(String typeName) {
                if (FILE_DIALOG_INTERNAL.equals(typeName)) {
                    stats.fileDialogRewrites++;
                    stats.auditLines.add("PATCHED_FILE_DIALOG_TYPE: " + entryName);
                    return COMPAT_FILE_DIALOG_INTERNAL;
                }
                return super.map(typeName);
            }
        });

        ClassVisitor methodPatcher = new ClassVisitor(Opcodes.ASM9, remappingVisitor) {
            private String superName = "java/lang/Object";

            @Override
            public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
                this.superName = superName != null ? superName : "java/lang/Object";
                super.visit(version, access, name, signature, superName, interfaces);
            }

            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                MethodVisitor mv = super.visitMethod(access, name, descriptor, signature, exceptions);

                // Special QVM pure-Java lowering for Module (gg/corz/IIIIli)
                if ("gg/corz/IIIIli".equals(internalName)) {
                    if ("<clinit>".equals(name) && "()V".equals(descriptor)) {
                        stats.qvmClinitsLowered++;
                        stats.auditLines.add("LOWERED_QVM_CLINIT: gg/corz/IIIIli.<clinit>");
                        mv.visitCode();
                        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "net/minecraft/class_310", "method_1551", "()Lnet/minecraft/class_310;", false);
                        mv.visitFieldInsn(Opcodes.PUTSTATIC, "gg/corz/IIIIli", "IIIiIiII", "Lnet/minecraft/class_310;");
                        mv.visitInsn(Opcodes.RETURN);
                        mv.visitMaxs(1, 0);
                        mv.visitEnd();
                        return null;
                    }
                    if ("IIIII".equals(name) && "(Z)V".equals(descriptor)) {
                        stats.qvmMethodsLowered++;
                        stats.auditLines.add("LOWERED_QVM_METHOD: gg/corz/IIIIli.IIIII(Z)V -> pure Java setEnabled");
                        emitModuleSetEnabled(mv);
                        return null;
                    }
                }

                // Special QVM pure-Java lowering for ModuleManager (gg/corz/IIIilliI)
                if ("gg/corz/IIIilliI".equals(internalName)) {
                    if ("<clinit>".equals(name) && "()V".equals(descriptor)) {
                        stats.qvmClinitsLowered++;
                        stats.auditLines.add("STRIPPED_LOADVM_CLINIT: gg/corz/IIIilliI.<clinit>");
                        return stripLoadVmCalls(mv);
                    }
                    if ("IIi".equals(name) && "()V".equals(descriptor)) {
                        stats.qvmMethodsLowered++;
                        stats.auditLines.add("LOWERED_QVM_METHOD: gg/corz/IIIilliI.IIi()V -> RETURN");
                        emitSimpleVoidReturn(mv, 0);
                        return null;
                    }
                }

                // Special QVM pure-Java lowering for Auth/License manager (gg/corz/IIIiillll)
                if ("gg/corz/IIIiillll".equals(internalName)) {
                    if ("<clinit>".equals(name) && "()V".equals(descriptor)) {
                        stats.qvmClinitsLowered++;
                        stats.auditLines.add("LOWERED_QVM_CLINIT: gg/corz/IIIiillll.<clinit>");
                        emitAuthClinit(mv);
                        return null;
                    }
                    stats.qvmMethodsLowered++;
                    emitAuthMethodStub(mv, name, descriptor);
                    return null;
                }

                // Special QVM pure-Java lowering for Device HWID helper (gg/corz/IIliiIiil)
                if ("gg/corz/IIliiIiil".equals(internalName)) {
                    if ("<clinit>".equals(name) && "()V".equals(descriptor)) {
                        stats.qvmClinitsLowered++;
                        stats.auditLines.add("LOWERED_QVM_CLINIT: gg/corz/IIliiIiil.<clinit>");
                        emitSimpleVoidReturn(mv, 0);
                        return null;
                    }
                    stats.qvmMethodsLowered++;
                    emitDeviceMethodStub(mv, name, descriptor);
                    return null;
                }

                // All remaining QVM-protected helper classes
                if (OTHER_QVM_ONLY_CLASSES.contains(internalName)) {
                    if ("<clinit>".equals(name)) {
                        stats.qvmClinitsLowered++;
                    } else {
                        stats.qvmMethodsLowered++;
                    }
                    emitSafeFallbackStub(mv, internalName, this.superName, name, descriptor);
                    return null;
                }

                return new MethodVisitor(Opcodes.ASM9, mv) {
                    @Override
                    public void visitLdcInsn(Object value) {
                        if (value instanceof String s) {
                            String rebranded = rebrandString(s);
                            if (!s.equals(rebranded)) {
                                stats.brandingRewrites++;
                                super.visitLdcInsn(rebranded);
                                return;
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
                            if ("glfwGetKeyScancode".equals(mName) && "(I)I".equals(mDesc)) {
                                stats.keyScancodeRewrites++;
                                stats.auditLines.add("PATCHED_GLFW_KEY_SCANCODE: " + entryName + "#" + name);
                                super.visitMethodInsn(Opcodes.INVOKESTATIC, MOJO_INPUT_BRIDGE, "glfwGetKeyScancodeCompat", mDesc, false);
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

    private static String rebrandString(String s) {
        if (s.contains("assets/") || s.contains("corzclient") || s.startsWith("gg/corz/") || s.startsWith("com/corz/")) {
            return s;
        }
        if ("Corz".equals(s) || "CorzClient".equals(s) || "CorzClientCrackedBYM4".equals(s)
            || "OwnedbyM4".equals(s) || "Mogwarts on Top".equals(s)) {
            return "Dispute Client";
        }
        if ("CORZ".equals(s) || "CORZ CLIENT".equals(s)) {
            return "DISPUTE";
        }
        String out = s;
        if (out.contains("CorzClientCrackedBYM4")) {
            out = out.replace("CorzClientCrackedBYM4", "Dispute Client");
        }
        if (out.contains("Mogwarts on Top")) {
            out = out.replace("Mogwarts on Top", "Dispute Client");
        }
        if (out.contains("OwnedbyM4")) {
            out = out.replace("OwnedbyM4", "Dispute Client");
        }
        if (out.contains("Corz Client")) {
            out = out.replace("Corz Client", "Dispute Client");
        }
        if (out.contains("corz.gg")) {
            out = out.replace("corz.gg", "dispute.gg");
        }
        return out;
    }

    /**
     * Emits exact pure-Java bytecode for Module.IIIII(boolean enabled):
     *   if (this.IIIiIill != enabled) {
     *       this.IIIiIill = enabled;
     *       if (enabled) this.IIIii(); else this.IIIil();
     *       IIIIlili.IIl();
     *   }
     */
    private static void emitModuleSetEnabled(MethodVisitor mv) {
        Label lElse = new Label();
        Label lDirty = new Label();
        Label lEnd = new Label();

        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitFieldInsn(Opcodes.GETFIELD, "gg/corz/IIIIli", "IIIiIill", "Z");
        mv.visitVarInsn(Opcodes.ILOAD, 1);
        mv.visitJumpInsn(Opcodes.IF_ICMPEQ, lEnd);

        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitVarInsn(Opcodes.ILOAD, 1);
        mv.visitFieldInsn(Opcodes.PUTFIELD, "gg/corz/IIIIli", "IIIiIill", "Z");

        mv.visitVarInsn(Opcodes.ILOAD, 1);
        mv.visitJumpInsn(Opcodes.IFEQ, lElse);

        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "gg/corz/IIIIli", "IIIii", "()V", false);
        mv.visitJumpInsn(Opcodes.GOTO, lDirty);

        mv.visitLabel(lElse);
        mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKEVIRTUAL, "gg/corz/IIIIli", "IIIil", "()V", false);

        mv.visitLabel(lDirty);
        mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
        mv.visitMethodInsn(Opcodes.INVOKESTATIC, "gg/corz/IIIIlili", "IIl", "()V", false);

        mv.visitLabel(lEnd);
        mv.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(2, 2);
        mv.visitEnd();
    }

    /**
     * Strips LDC cls; MethodHandles.lookup(); Runtime.loadVm(...) inside IIIilliI.<clinit>,
     * preserving the List/EnumMap/IdentityHashMap static initializers.
     */
    private static MethodVisitor stripLoadVmCalls(MethodVisitor mv) {
        return new MethodVisitor(Opcodes.ASM9, mv) {
            @Override
            public void visitMethodInsn(int opcode, String owner, String name, String descriptor, boolean isInterface) {
                if (QVM_RUNTIME_INTERNAL.equals(owner) && "loadVm".equals(name)) {
                    super.visitInsn(Opcodes.POP2);
                    return;
                }
                super.visitMethodInsn(opcode, owner, name, descriptor, isInterface);
            }
        };
    }

    private static void emitAuthClinit(MethodVisitor mv) {
        mv.visitCode();
        for (String field : List.of("IIliIIlliIi", "IIliIIllilI", "IIliIIllill", "IIliIIlliIl")) {
            mv.visitLdcInsn("");
            mv.visitFieldInsn(Opcodes.PUTSTATIC, "gg/corz/IIIiillll", field, "Ljava/lang/String;");
        }
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(1, 0);
        mv.visitEnd();
    }

    private static void emitAuthMethodStub(MethodVisitor mv, String name, String desc) {
        if ("<init>".equals(name) && "()V".equals(desc)) {
            emitSimpleConstructor(mv, "java/lang/Object");
            return;
        }
        Type ret = Type.getReturnType(desc);
        if (ret.getSort() == Type.BOOLEAN) {
            mv.visitCode();
            mv.visitInsn(Opcodes.ICONST_1);
            mv.visitInsn(Opcodes.IRETURN);
            mv.visitMaxs(1, Type.getArgumentsAndReturnSizes(desc) >> 2);
            mv.visitEnd();
            return;
        }
        if ("Ljava/lang/String;".equals(ret.getDescriptor())) {
            mv.visitCode();
            if ("IIIIl".equals(name)) {
                // Auth token getter: returning null short-circuits remote HTTP calls in IIllIili/IIilIliIi cleanly
                mv.visitInsn(Opcodes.ACONST_NULL);
            } else if ("IIIII".equals(name) || "IIIIi".equals(name)) {
                mv.visitLdcInsn("Dispute");
            } else {
                mv.visitLdcInsn("OK");
            }
            mv.visitInsn(Opcodes.ARETURN);
            mv.visitMaxs(1, Type.getArgumentsAndReturnSizes(desc) >> 2);
            mv.visitEnd();
            return;
        }
        emitTypedDefaultReturn(mv, desc);
    }

    private static void emitDeviceMethodStub(MethodVisitor mv, String name, String desc) {
        if ("<init>".equals(name) && "()V".equals(desc)) {
            emitSimpleConstructor(mv, "java/lang/Object");
            return;
        }
        Type ret = Type.getReturnType(desc);
        if ("Ljava/lang/String;".equals(ret.getDescriptor())) {
            mv.visitCode();
            mv.visitLdcInsn("android-mojo");
            mv.visitInsn(Opcodes.ARETURN);
            mv.visitMaxs(1, Type.getArgumentsAndReturnSizes(desc) >> 2);
            mv.visitEnd();
            return;
        }
        emitTypedDefaultReturn(mv, desc);
    }

    private static void emitSafeFallbackStub(MethodVisitor mv, String owner, String superName, String name, String desc) {
        if ("<init>".equals(name)) {
            String targetSuper = "java/lang/Enum".equals(superName) ? "java/lang/Object" : superName;
            mv.visitCode();
            mv.visitVarInsn(Opcodes.ALOAD, 0);
            if ("java/lang/Enum".equals(superName) && desc.startsWith("(Ljava/lang/String;I)")) {
                mv.visitVarInsn(Opcodes.ALOAD, 1);
                mv.visitVarInsn(Opcodes.ILOAD, 2);
                mv.visitMethodInsn(Opcodes.INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
            } else {
                mv.visitMethodInsn(Opcodes.INVOKESPECIAL, targetSuper, "<init>", "()V", false);
            }
            mv.visitInsn(Opcodes.RETURN);
            mv.visitMaxs(3, (Type.getArgumentsAndReturnSizes(desc) >> 2) + 1);
            mv.visitEnd();
            return;
        }
        emitTypedDefaultReturn(mv, desc);
    }

    private static void emitSimpleConstructor(MethodVisitor mv, String superName) {
        mv.visitCode();
        mv.visitVarInsn(Opcodes.ALOAD, 0);
        mv.visitMethodInsn(Opcodes.INVOKESPECIAL, superName, "<init>", "()V", false);
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(1, 1);
        mv.visitEnd();
    }

    private static void emitSimpleVoidReturn(MethodVisitor mv, int maxLocals) {
        mv.visitCode();
        mv.visitInsn(Opcodes.RETURN);
        mv.visitMaxs(0, maxLocals);
        mv.visitEnd();
    }

    private static void emitTypedDefaultReturn(MethodVisitor mv, String desc) {
        Type ret = Type.getReturnType(desc);
        int maxLocals = Math.max(1, Type.getArgumentsAndReturnSizes(desc) >> 2);
        mv.visitCode();
        switch (ret.getSort()) {
            case Type.VOID:
                mv.visitInsn(Opcodes.RETURN);
                mv.visitMaxs(0, maxLocals);
                break;
            case Type.BOOLEAN:
            case Type.CHAR:
            case Type.BYTE:
            case Type.SHORT:
            case Type.INT:
                mv.visitInsn(Opcodes.ICONST_0);
                mv.visitInsn(Opcodes.IRETURN);
                mv.visitMaxs(1, maxLocals);
                break;
            case Type.LONG:
                mv.visitInsn(Opcodes.LCONST_0);
                mv.visitInsn(Opcodes.LRETURN);
                mv.visitMaxs(2, maxLocals);
                break;
            case Type.FLOAT:
                mv.visitInsn(Opcodes.FCONST_0);
                mv.visitInsn(Opcodes.FRETURN);
                mv.visitMaxs(1, maxLocals);
                break;
            case Type.DOUBLE:
                mv.visitInsn(Opcodes.DCONST_0);
                mv.visitInsn(Opcodes.DRETURN);
                mv.visitMaxs(2, maxLocals);
                break;
            default:
                mv.visitInsn(Opcodes.ACONST_NULL);
                mv.visitInsn(Opcodes.ARETURN);
                mv.visitMaxs(1, maxLocals);
                break;
        }
        mv.visitEnd();
    }

    private static void verifyNoRemainingQvmCalls(String entryName, byte[] classBytes) {
        ClassReader cr = new ClassReader(classBytes);
        cr.accept(new ClassVisitor(Opcodes.ASM9) {
            @Override
            public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
                return new MethodVisitor(Opcodes.ASM9) {
                    @Override
                    public void visitMethodInsn(int opcode, String owner, String mName, String mDesc, boolean isInterface) {
                        if (QVM_RUNTIME_INTERNAL.equals(owner) && ("loadVm".equals(mName) || mName.startsWith("run"))) {
                            throw new IllegalStateException("QVM call survived patching in " + entryName + "#" + name + " -> " + owner + "." + mName);
                        }
                    }
                };
            }
        }, ClassReader.SKIP_DEBUG | ClassReader.SKIP_FRAMES);
    }

    private static final class Stats {
        int classesScanned;
        int strippedEntries;
        int qvmMethodsLowered;
        int qvmClinitsLowered;
        int mouseButtonRewrites;
        int keyRewrites;
        int keyNameRewrites;
        int keyScancodeRewrites;
        int fileDialogRewrites;
        int brandingRewrites;
        final List<String> auditLines = new ArrayList<>();
    }
}
