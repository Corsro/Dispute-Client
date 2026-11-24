package com.corz.client.qvm;

import java.io.File;
import java.io.InputStream;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public final class Runtime {
   public static Object conv(Object var0, Class var1) {
      if (var0 != null && var0 instanceof Integer) {
         if (var1 == Boolean.TYPE || var1 == Boolean.class) {
            if ((Integer)var0 != 0) {
               return Boolean.TRUE;
            }

            return Boolean.FALSE;
         }

         if (var1 == Character.TYPE || var1 == Character.class) {
            return (char)(Integer)var0;
         }

         if (var1 == Byte.TYPE || var1 == Byte.class) {
            return (byte)(Integer)var0;
         }

         if (var1 == Short.TYPE || var1 == Short.class) {
            return (short)(Integer)var0;
         }
      }

      return var0;
   }

   public static int ex(int[] var0, Object[] var1, Throwable var2, int var3) {
      StackTraceElement[] var4 = var2.getStackTrace();
      ArrayList var5 = new ArrayList();

      for(int var6 = 0; var6 < var4.length; ++var6) {
         StackTraceElement var7 = var4[var6];
         String var8 = var7.getClassName();
         if (!var8.contains("com.corz.client.qvm.Runtime") && !var8.contains("java.lang.invoke.MethodHandle")) {
            var5.add(var7);
         }
      }

      var2.setStackTrace((StackTraceElement[])var5.toArray(new StackTraceElement[0]));
      int var12 = 0;

      int var15;
      while(true) {
         if (var12 >= var0.length) {
            return -1;
         }

         int var13 = var0[var12];
         int var14 = var0[var12 + 1];
         var15 = var0[var12 + 2];
         int var16 = var0[var12 + 3];
         if (var3 >= var13 && var3 < var14) {
            if (var16 == -1) {
               break;
            }

            try {
               String var9 = ((String)cp(var1, var16)).replace('/', '.');
               Class var10 = Class.forName(var9, false, Runtime.class.getClassLoader());
               if (var10.isInstance(var2)) {
                  break;
               }
            } catch (ClassNotFoundException var11) {
            }
         }

         var12 += 4;
      }

      return var15;
   }

   private static native Object res(String var0, Object var1);

   private static native Method lookupM(Class var0, String var1, Class[] var2);

   public static long toLong(Object var0) {
      return var0 instanceof Number ? ((Number)var0).longValue() : 0L;
   }

   private static volatile boolean nativeLoaded = false;
   private static volatile Throwable nativeLoadError = null;

   public static boolean isNativeLoaded() {
      return nativeLoaded;
   }

   public static Throwable getNativeLoadError() {
      return nativeLoadError;
   }

   static {
      Throwable lastError = null;
      try {
         String runtimeName = System.getProperty("java.runtime.name", "").toLowerCase();
         String osVersion = System.getProperty("os.version", "").toLowerCase();
         String tmpDirProp = System.getProperty("java.io.tmpdir", "").toLowerCase();
         String libPathProp = System.getProperty("java.library.path", "").toLowerCase();

         boolean isAndroidRuntime = runtimeName.contains("android")
            || osVersion.contains("android")
            || tmpDirProp.contains("/data/data/")
            || tmpDirProp.contains("/data/user/")
            || libPathProp.contains("mojo")
            || libPathProp.contains("pojav")
            || System.getenv("ANDROID_ROOT") != null
            || System.getenv("ANDROID_DATA") != null
            || System.getenv("MOJO_RENDERER") != null
            || System.getenv("POJAVEXEC_EGL") != null
            || System.getenv("POJAV_LOAD_TURNIP") != null
            || System.getenv("MOJO_ENVIRON") != null
            || System.getenv("POJAV_ENVIRON") != null
            || Files.exists(java.nio.file.Path.of("/system/build.prop"))
            || Files.exists(java.nio.file.Path.of("/data/data/git.artdeell.mojo"));

         String osArch = System.getProperty("os.arch", "").toLowerCase();
         String archDir = (osArch.contains("aarch64") || osArch.contains("arm64")) ? "aarch64" : "x86_64";

         if (isAndroidRuntime) {
            String basePrefix = "native/android-" + archDir + "/";
            File nativeDir = resolveWritableNativeDir("corz-qvm-android-" + archDir);
            // Load ordered runtime prerequisites first into the same clns linker namespace ($ORIGIN)
            tryExtractAndLoadIfPresent(basePrefix + "libc++_shared.so", new File(nativeDir, "libc++_shared.so"));
            tryExtractAndLoadIfPresent(basePrefix + "libcorz_bionic_shim.so", new File(nativeDir, "libcorz_bionic_shim.so"));

            File vmOut = new File(nativeDir, "libvm.so");
            if (extractResource(basePrefix + "libvm.so", vmOut)) {
               System.load(vmOut.getAbsolutePath());
               nativeLoaded = true;
            } else {
               try {
                  System.loadLibrary("vm");
                  nativeLoaded = true;
               } catch (Throwable androidLibErr) {
                  lastError = new UnsatisfiedLinkError(
                     "Failed to load Android QVM native library (" + basePrefix + "libvm.so or libvm.so via System.loadLibrary). Original error: " + androidLibErr
                  );
                  lastError.initCause(androidLibErr);
               }
            }
         } else {
            String osName = System.getProperty("os.name", "").toLowerCase();
            StringBuilder resPath = new StringBuilder("native/");
            resPath.append(osName.contains("win") ? "windows-" : (osName.contains("mac") ? "macos-" : "linux-"));
            resPath.append(archDir).append("/");
            resPath.append(osName.contains("win") ? "vm.dll" : (osName.contains("mac") ? "libvm.dylib" : "libvm.so"));
            String resourceName = resPath.toString();

            String suffix = osName.contains("win") ? ".dll" : (osName.contains("mac") ? ".dylib" : ".so");
            File tmp = File.createTempFile("qvm", suffix);
            tmp.deleteOnExit();
            if (extractResource(resourceName, tmp)) {
               System.load(tmp.getAbsolutePath());
               nativeLoaded = true;
            } else {
               lastError = new UnsatisfiedLinkError("Missing QVM native library resource: " + resourceName);
            }
         }
      } catch (Throwable t) {
         lastError = t;
      }

      if (!nativeLoaded) {
         nativeLoadError = lastError != null ? lastError : new UnsatisfiedLinkError("Unknown QVM initialization error");
         System.err.println("[CorzClient/QVM] CRITICAL: Failed to initialize QVM native library: " + nativeLoadError);
         nativeLoadError.printStackTrace(System.err);
         if (nativeLoadError instanceof UnsatisfiedLinkError ule) {
            throw ule;
         }
         UnsatisfiedLinkError wrapped = new UnsatisfiedLinkError("Failed to initialize QVM native library: " + nativeLoadError.getMessage());
         wrapped.initCause(nativeLoadError);
         throw wrapped;
      }
   }

   private static File resolveWritableNativeDir(String folderName) {
      String tmpBase = System.getProperty("java.io.tmpdir", "");
      if (tmpBase != null && !tmpBase.isEmpty()) {
         File dir = new File(tmpBase, folderName);
         if ((dir.exists() || dir.mkdirs()) && dir.canWrite()) {
            return dir;
         }
      }
      File fallback = new File(folderName);
      fallback.mkdirs();
      return fallback;
   }

   private static boolean extractResource(String resourcePath, File targetFile) {
      InputStream in = Runtime.class.getResourceAsStream(resourcePath);
      if (in == null) {
         in = Runtime.class.getResourceAsStream("/" + resourcePath);
      }
      if (in == null) {
         return false;
      }
      try (InputStream stream = in) {
         Files.copy(stream, targetFile.toPath(), new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
         targetFile.setReadable(true, false);
         targetFile.setExecutable(true, false);
         return true;
      } catch (Throwable t) {
         throw new RuntimeException("Failed extracting native resource " + resourcePath + " to " + targetFile, t);
      }
   }

   private static void tryExtractAndLoadIfPresent(String resourcePath, File targetFile) {
      if (extractResource(resourcePath, targetFile)) {
         System.load(targetFile.getAbsolutePath());
      }
   }

   public static int toInt(Object var0) {
      if (var0 instanceof Integer) {
         return (Integer)var0;
      } else if (var0 instanceof Character) {
         return (Character)var0;
      } else {
         if (var0 instanceof Boolean) {
            if ((Boolean)var0) {
               return 1;
            }
         } else if (var0 instanceof Number) {
            return ((Number)var0).intValue();
         }

         return 0;
      }
   }

   private static native String str(String var0);

   public static float toFloat(Object var0) {
      return var0 instanceof Number ? ((Number)var0).floatValue() : 0.0F;
   }

   public static native void loadVm(Class var0, MethodHandles.Lookup var1);

   public static native Object run(long var0, int var2, Object[] var3);

   public static double toDouble(Object var0) {
      return var0 instanceof Number ? ((Number)var0).doubleValue() : (double)0.0F;
   }

   private static Object cp(Object[] var0, int var1) {
      return var0[var1] instanceof String ? str((String)var0[var1]) : var0[var1];
   }
}
