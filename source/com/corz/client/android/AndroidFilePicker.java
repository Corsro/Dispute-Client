package com.corz.client.android;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * Cross-platform file picker abstraction replacing hard dependencies on java.awt.FileDialog.
 *
 * On desktop JVMs with a non-headless display, invokes java.awt.FileDialog reflectively so no
 * direct AWT Frame classlinking fails on Android/headless runtimes. On Android / Mojo Launcher,
 * falls back to scanning Mojo/Pojav/game-directory schematic & config locations.
 */
public final class AndroidFilePicker {
   private AndroidFilePicker() {
   }

   public static Path pickFile(String title, String globPattern, Path gameDir, String... extensions) {
      if (!AndroidRuntimeEnv.isAndroid() && !isHeadlessSafe()) {
         Path awtSelection = tryDesktopAwtFileDialog(title, globPattern);
         if (awtSelection != null) {
            return awtSelection;
         }
      }
      return findLatestMatchingFile(gameDir, extensions);
   }

   /**
    * Convenience wrapper for ASM-patched FileDialog call sites expecting String[]{dir, filename}.
    */
   public static String[] pickFileParts(String title, String filterPattern, String... extensions) {
      Path selected = pickFile(title, filterPattern, Path.of("."), extensions);
      if (selected == null || selected.getParent() == null) {
         return null;
      }
      return new String[]{selected.getParent().toString(), selected.getFileName().toString()};
   }

   private static boolean isHeadlessSafe() {
      try {
         Class<?> geClass = Class.forName("java.awt.GraphicsEnvironment");
         Object res = geClass.getMethod("isHeadless").invoke(null);
         return Boolean.TRUE.equals(res);
      } catch (Throwable ignored) {
         return true;
      }
   }

   private static Path tryDesktopAwtFileDialog(String title, String filterPattern) {
      try {
         Class<?> frameCls = Class.forName("java.awt.Frame");
         Class<?> dialogCls = Class.forName("java.awt.FileDialog");
         Object dialog = dialogCls.getConstructor(frameCls, String.class, int.class).newInstance(null, title, 0);
         if (filterPattern != null && !filterPattern.isEmpty()) {
            Method setFile = dialogCls.getMethod("setFile", String.class);
            setFile.invoke(dialog, filterPattern);
         }
         dialogCls.getMethod("setVisible", boolean.class).invoke(dialog, Boolean.TRUE);
         String dir = (String) dialogCls.getMethod("getDirectory").invoke(dialog);
         String file = (String) dialogCls.getMethod("getFile").invoke(dialog);
         if (dir != null && file != null) {
            return Path.of(dir, file);
         }
      } catch (Throwable ignored) {
      }
      return null;
   }

   public static Path findLatestMatchingFile(Path gameDir, String... extensions) {
      Path storage = AndroidRuntimeEnv.resolveExternalStorageDir();
      List<Path> searchRoots = List.of(
         gameDir != null ? gameDir.resolve("schematics") : storage,
         gameDir != null ? gameDir.resolve("corzclient") : storage,
         storage.resolve("Download"),
         storage.resolve("Documents"),
         storage
      );

      for (Path root : searchRoots) {
         if (root == null || !Files.isDirectory(root)) {
            continue;
         }
         try (Stream<Path> stream = Files.walk(root, 2)) {
            Path candidate = stream
               .filter(Files::isRegularFile)
               .filter(p -> matchesExtension(p.getFileName().toString(), extensions))
               .max(Comparator.comparingLong(AndroidFilePicker::safeLastModified))
               .orElse(null);
            if (candidate != null) {
               return candidate;
            }
         } catch (IOException | SecurityException ignored) {
         }
      }
      return null;
   }

   private static boolean matchesExtension(String filename, String... extensions) {
      if (extensions == null || extensions.length == 0) {
         return true;
      }
      String lower = filename.toLowerCase(Locale.ROOT);
      for (String ext : extensions) {
         if (ext != null && lower.endsWith(ext.toLowerCase(Locale.ROOT))) {
            return true;
         }
      }
      return false;
   }

   private static long safeLastModified(Path p) {
      try {
         return Files.getLastModifiedTime(p).toMillis();
      } catch (IOException ignored) {
         return 0L;
      }
   }
}
