package com.corz.client.android;

import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.class_1041;
import net.minecraft.class_3675;
import org.lwjgl.glfw.GLFW;

/**
 * Input and UI scaling bridge for Mojo Launcher's virtual touch + physical/BT input layer.
 *
 * On Mojo Launcher, fast touch taps frequently emit a PRESS + RELEASE callback within a single
 * frame/tick before tick-end polling runs (CorzClient.bindDown), and GLFW.glfwGetKeyName may
 * return null or throw on synthetic Android keycodes. This bridge mirrors callback states and
 * provides guarded GLFW queries and mobile-friendly GUI scale clamping.
 */
public final class MojoInputBridge {
   private static final long TOUCH_TAP_LATCH_NANOS = 75_000_000L; // 75ms latch for 20 TPS polling
   private static final int MAX_TRACKED_BUTTONS = 16;

   private static final boolean[] MOUSE_HELD = new boolean[MAX_TRACKED_BUTTONS];
   private static final long[] MOUSE_PRESS_LATCH_UNTIL = new long[MAX_TRACKED_BUTTONS];
   private static final ConcurrentHashMap<Integer, Boolean> KEY_HELD = new ConcurrentHashMap<>();
   private static final ConcurrentHashMap<Integer, Long> KEY_PRESS_LATCH_UNTIL = new ConcurrentHashMap<>();

   private MojoInputBridge() {
   }

   public static void onMouseButtonCallback(int button, int action) {
      if (button < 0 || button >= MAX_TRACKED_BUTTONS) {
         return;
      }
      if (action == GLFW.GLFW_PRESS) {
         MOUSE_HELD[button] = true;
         if (AndroidRuntimeEnv.isMojoLauncher()) {
            MOUSE_PRESS_LATCH_UNTIL[button] = System.nanoTime() + TOUCH_TAP_LATCH_NANOS;
         }
      } else if (action == GLFW.GLFW_RELEASE) {
         MOUSE_HELD[button] = false;
      }
   }

   public static void onKeyCallback(int keyCode, int action) {
      if (keyCode < 0) {
         return;
      }
      if (action == GLFW.GLFW_PRESS || action == GLFW.GLFW_REPEAT) {
         KEY_HELD.put(keyCode, Boolean.TRUE);
         if (AndroidRuntimeEnv.isMojoLauncher() && action == GLFW.GLFW_PRESS) {
            KEY_PRESS_LATCH_UNTIL.put(keyCode, System.nanoTime() + TOUCH_TAP_LATCH_NANOS);
         }
      } else if (action == GLFW.GLFW_RELEASE) {
         KEY_HELD.put(keyCode, Boolean.FALSE);
      }
   }

   public static boolean isMouseButtonDown(class_1041 window, int glfwButton) {
      if (glfwButton < 0) {
         return false;
      }
      if (glfwButton < MAX_TRACKED_BUTTONS) {
         if (MOUSE_HELD[glfwButton]) {
            return true;
         }
         if (AndroidRuntimeEnv.isMojoLauncher()) {
            long until = MOUSE_PRESS_LATCH_UNTIL[glfwButton];
            if (until != 0L && System.nanoTime() <= until) {
               MOUSE_PRESS_LATCH_UNTIL[glfwButton] = 0L;
               return true;
            }
         }
      }
      if (window == null) {
         return false;
      }
      try {
         return GLFW.glfwGetMouseButton(window.method_4490(), glfwButton) == GLFW.GLFW_PRESS;
      } catch (Throwable ignored) {
         return false;
      }
   }

   public static boolean isKeyDown(class_1041 window, int glfwKey) {
      if (glfwKey < 0) {
         return false;
      }
      if (Boolean.TRUE.equals(KEY_HELD.get(glfwKey))) {
         return true;
      }
      if (AndroidRuntimeEnv.isMojoLauncher()) {
         Long until = KEY_PRESS_LATCH_UNTIL.get(glfwKey);
         if (until != null && System.nanoTime() <= until) {
            KEY_PRESS_LATCH_UNTIL.remove(glfwKey);
            return true;
         }
      }
      if (window == null) {
         return false;
      }
      try {
         return class_3675.method_15987(window, glfwKey);
      } catch (Throwable ignored) {
         return false;
      }
   }

   public static String safeGetKeyName(int keyCode, String fallbackName) {
      try {
         String name = GLFW.glfwGetKeyName(keyCode, 0);
         if (name != null && !name.isBlank()) {
            return name;
         }
      } catch (Throwable ignored) {
      }
      return fallbackName;
   }

   /**
    * Drop-in ASM replacement target for org.lwjgl.glfw.GLFW.glfwGetMouseButton(JI)I.
    */
   public static int glfwGetMouseButtonCompat(long windowHandle, int glfwButton) {
      if (glfwButton >= 0 && glfwButton < MAX_TRACKED_BUTTONS) {
         if (MOUSE_HELD[glfwButton]) {
            return GLFW.GLFW_PRESS;
         }
         if (AndroidRuntimeEnv.isMojoLauncher()) {
            long until = MOUSE_PRESS_LATCH_UNTIL[glfwButton];
            if (until != 0L && System.nanoTime() <= until) {
               MOUSE_PRESS_LATCH_UNTIL[glfwButton] = 0L;
               return GLFW.GLFW_PRESS;
            }
         }
      }
      if (windowHandle == 0L) {
         return GLFW.GLFW_RELEASE;
      }
      try {
         return GLFW.glfwGetMouseButton(windowHandle, glfwButton);
      } catch (Throwable ignored) {
         return GLFW.GLFW_RELEASE;
      }
   }

   /**
    * Drop-in ASM replacement target for org.lwjgl.glfw.GLFW.glfwGetKey(JI)I.
    */
   public static int glfwGetKeyCompat(long windowHandle, int glfwKey) {
      if (glfwKey >= 0) {
         if (Boolean.TRUE.equals(KEY_HELD.get(glfwKey))) {
            return GLFW.GLFW_PRESS;
         }
         if (AndroidRuntimeEnv.isMojoLauncher()) {
            Long until = KEY_PRESS_LATCH_UNTIL.get(glfwKey);
            if (until != null && System.nanoTime() <= until) {
               KEY_PRESS_LATCH_UNTIL.remove(glfwKey);
               return GLFW.GLFW_PRESS;
            }
         }
      }
      if (windowHandle == 0L) {
         return GLFW.GLFW_RELEASE;
      }
      try {
         return GLFW.glfwGetKey(windowHandle, glfwKey);
      } catch (Throwable ignored) {
         return GLFW.GLFW_RELEASE;
      }
   }

   /**
    * Drop-in ASM replacement target for org.lwjgl.glfw.GLFW.glfwGetKeyName(II)Ljava/lang/String;.
    */
   public static String glfwGetKeyNameCompat(int key, int scancode) {
      try {
         return GLFW.glfwGetKeyName(key, scancode);
      } catch (Throwable ignored) {
         return null;
      }
   }

   /**
    * Drop-in ASM replacement target for org.lwjgl.glfw.GLFW.glfwGetKeyScancode(I)I.
    */
   public static int glfwGetKeyScancodeCompat(int key) {
      try {
         return GLFW.glfwGetKeyScancode(key);
      } catch (Throwable ignored) {
         return 0;
      }
   }

   /**
    * Ensures Corz ClickGUI remains readable and touch-interactive on high-DPI Android screens
    * (e.g., 2400x1080 or 1280x720 scaled render targets inside Mojo Launcher).
    */
   public static int adaptGuiScaleForMobile(int computedScale, int framebufferWidth, int framebufferHeight) {
      if (!AndroidRuntimeEnv.isMojoLauncher()) {
         return computedScale;
      }
      int safeScale = Math.max(1, computedScale);
      if (framebufferWidth <= 0 || framebufferHeight <= 0) {
         return safeScale;
      }
      // Keep logical ClickGUI canvas at least ~640x360 dp so panels and touch targets never clip off-screen.
      while (safeScale > 1 && (framebufferWidth / safeScale < 640 || framebufferHeight / safeScale < 360)) {
         safeScale--;
      }
      return safeScale;
   }
}
