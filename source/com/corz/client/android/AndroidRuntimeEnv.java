package com.corz.client.android;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Locale;

/**
 * Runtime environment & Mojo Launcher / Android GL translator detection.
 * Used to preserve desktop behavior while adapting rendering, input, native
 * loading, and file access safely on Android ARM64 / Mojo Launcher.
 */
public final class AndroidRuntimeEnv {
   public enum GlTranslator {
      DESKTOP_NATIVE,
      MOJO_MOBILEGLUES,
      MOJO_LTW,
      MOJO_ZINK,
      MOJO_GL4ES,
      ANDROID_GLES_UNKNOWN
   }

   private static final boolean ANDROID = detectAndroid();
   private static final boolean MOJO_LAUNCHER = detectMojoLauncher();
   private static final GlTranslator GL_TRANSLATOR = detectGlTranslator();

   private AndroidRuntimeEnv() {
   }

   private static boolean detectAndroid() {
      String runtimeName = System.getProperty("java.runtime.name", "").toLowerCase(Locale.ROOT);
      String vmName = System.getProperty("java.vm.name", "").toLowerCase(Locale.ROOT);
      String vmVendor = System.getProperty("java.vm.vendor", "").toLowerCase(Locale.ROOT);
      String osName = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
      String osVersion = System.getProperty("os.version", "").toLowerCase(Locale.ROOT);
      String tmpDir = System.getProperty("java.io.tmpdir", "").toLowerCase(Locale.ROOT);
      if (runtimeName.contains("android") || vmName.contains("dalvik") || vmName.contains("art") || vmVendor.contains("android")) {
         return true;
      }
      if (osVersion.contains("android") || tmpDir.contains("/data/data/") || tmpDir.contains("/data/user/")) {
         return true;
      }
      if (System.getenv("ANDROID_ROOT") != null || System.getenv("ANDROID_DATA") != null
         || System.getenv("MOJO_RENDERER") != null || System.getenv("POJAVEXEC_EGL") != null
         || System.getenv("POJAV_LOAD_TURNIP") != null || System.getenv("POJAV_RENDERER") != null) {
         return true;
      }
      if (osName.contains("linux") && (System.getenv("POJAV_ENVIRON") != null || System.getenv("MOJO_ENVIRON") != null || System.getenv("MOJO_DATA_DIR") != null)) {
         return true;
      }
      try {
         if (Files.exists(Path.of("/system/build.prop")) || Files.exists(Path.of("/data/data/git.artdeell.mojo"))) {
            return true;
         }
      } catch (Throwable ignored) {
      }
      return false;
   }

   private static boolean detectMojoLauncher() {
      if (System.getenv("MOJO_ENVIRON") != null || System.getenv("MOJO_DATA_DIR") != null
         || System.getenv("MOJO_RENDERER") != null || System.getenv("POJAVEXEC_EGL") != null
         || System.getenv("POJAV_LOAD_TURNIP") != null) {
         return true;
      }
      if (System.getenv("POJAV_ENVIRON") != null || System.getenv("POJAV_RENDERER") != null || System.getenv("POJAV_NATIVEDIR") != null) {
         return true;
      }
      String mesaCache = System.getenv("MESA_GLSL_CACHE_DIR");
      if (mesaCache != null && (mesaCache.contains("mojo") || mesaCache.contains("pojav"))) {
         return true;
      }
      String propRenderer = System.getProperty("pojav.renderer", System.getProperty("mojo.renderer", ""));
      if (!propRenderer.isEmpty()) {
         return true;
      }
      String jniDir = System.getProperty("java.library.path", "").toLowerCase(Locale.ROOT);
      String tmpDir = System.getProperty("java.io.tmpdir", "").toLowerCase(Locale.ROOT);
      return jniDir.contains("mojo") || jniDir.contains("pojav") || tmpDir.contains("mojo") || tmpDir.contains("pojav");
   }

   /**
    * Mojo Launcher runs OpenJDK 21 without an X11 DISPLAY server or -Djava.awt.headless=true.
    * Enabling headless mode prior to java.awt initialization prevents AWTError while still allowing
    * offscreen BufferedImage/Font rasterization when libawt_headless is available.
    */
   public static void ensureAndroidHeadlessAwtIfNeeded() {
      if (isMojoLauncher() && System.getProperty("java.awt.headless") == null) {
         System.setProperty("java.awt.headless", "true");
      }
   }

   private static GlTranslator detectGlTranslator() {
      String rendererHint = firstNonEmpty(
         System.getenv("MOJO_RENDERER"),
         System.getenv("POJAV_RENDERER"),
         System.getProperty("mojo.renderer"),
         System.getProperty("pojav.renderer"),
         System.getenv("POJAVEXEC_EGL"),
         System.getenv("LIBGL_ES") != null ? "gl4es" : "",
         System.getenv("MG_CONFIG") != null ? "mobileglues" : "",
         System.getenv("MESA_GL_VERSION_OVERRIDE") != null ? "zink" : ""
      ).toLowerCase(Locale.ROOT);

      if (rendererHint.contains("mobileglues") || rendererHint.contains("mg_") || rendererHint.contains("opengles3_mg")) {
         return GlTranslator.MOJO_MOBILEGLUES;
      }
      if (rendererHint.contains("ltw") || rendererHint.contains("opengles3_ltw")) {
         return GlTranslator.MOJO_LTW;
      }
      if (rendererHint.contains("zink") || rendererHint.contains("vulkan")) {
         return GlTranslator.MOJO_ZINK;
      }
      if (rendererHint.contains("gl4es") || rendererHint.contains("opengles2") || rendererHint.contains("holy")) {
         return GlTranslator.MOJO_GL4ES;
      }
      if (ANDROID || MOJO_LAUNCHER) {
         return GlTranslator.ANDROID_GLES_UNKNOWN;
      }
      return GlTranslator.DESKTOP_NATIVE;
   }

   private static String firstNonEmpty(String... values) {
      if (values == null) {
         return "";
      }
      for (String v : values) {
         if (v != null && !v.isBlank()) {
            return v;
         }
      }
      return "";
   }

   public static boolean isAndroid() {
      return ANDROID;
   }

   public static boolean isMojoLauncher() {
      return MOJO_LAUNCHER || ANDROID;
   }

   public static boolean isArm64() {
      String arch = System.getProperty("os.arch", "").toLowerCase(Locale.ROOT);
      return arch.contains("aarch64") || arch.contains("arm64");
   }

   public static GlTranslator getGlTranslator() {
      return GL_TRANSLATOR;
   }

   /**
    * GL4ES exposes OpenGL 2.x/compat paths where GLSL 3.30 UBOs (layout(std140))
    * and gl_VertexID full-screen passes are commonly unsupported or unstable.
    */
   public static boolean supportsModernUboAndBlurShaders() {
      return GL_TRANSLATOR != GlTranslator.MOJO_GL4ES;
   }

   public static Path resolveExternalStorageDir() {
      String ext = System.getenv("EXTERNAL_STORAGE");
      if (ext != null && !ext.isBlank()) {
         Path p = Path.of(ext);
         if (Files.isDirectory(p)) {
            return p;
         }
      }
      Path sdcard = Path.of("/sdcard");
      if (Files.isDirectory(sdcard)) {
         return sdcard;
      }
      return Path.of(System.getProperty("user.home", "."));
   }
}
