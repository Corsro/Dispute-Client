package com.corz.client.android;

/**
 * Coordinates blur and post-processing budgets for Mojo Launcher / Android OpenGL ES translators.
 *
 * Mobile tile-based deferred rendering (TBDR) GPUs (Adreno/Mali/PowerVR) and GL->GLES translators
 * (LTW, MobileGlues, Zink, GL4ES) suffer severe frame drops, FBO stalls, or black screens when
 * Corz UI layers execute per-panel multi-pass Kawase + MotionBlur FBO ping-pong every frame.
 *
 * This coordinator enforces:
 *  1. Capability-aware blur mode selection (FULL_CACHED, SINGLE_SHARED_PASS, TINT_FALLBACK).
 *  2. At most ONE shared downsampled Kawase blur capture per frame (reused across all HUD/GUI panels).
 *  3. Optional MotionBlur suppression during open ClickGUI / heavy blur frames to avoid double-FBO churn.
 *  4. Automatic circuit-breaker fallback to translucent tinted rendering if any shader/FBO pass throws.
 */
public final class MojoBlurCoordinator {
   public enum BlurMode {
      FULL_CACHED,
      SINGLE_SHARED_PASS,
      TINT_FALLBACK
   }

   private static volatile long currentFrameIndex = 0L;
   private static volatile boolean sharedBlurComputedThisFrame = false;
   private static volatile boolean screenHasBlurThisFrame = false;
   private static volatile boolean runtimeFailureTripped = false;
   private static volatile String failureReason = "";

   private MojoBlurCoordinator() {
   }

   public static void beginFrame() {
      currentFrameIndex++;
      sharedBlurComputedThisFrame = false;
      screenHasBlurThisFrame = false;
   }

   public static long getCurrentFrameIndex() {
      return currentFrameIndex;
   }

   public static BlurMode getActiveBlurMode() {
      if (runtimeFailureTripped) {
         return BlurMode.TINT_FALLBACK;
      }
      if (!AndroidRuntimeEnv.supportsModernUboAndBlurShaders()) {
         return BlurMode.TINT_FALLBACK;
      }
      if (AndroidRuntimeEnv.isMojoLauncher()) {
         return BlurMode.SINGLE_SHARED_PASS;
      }
      return BlurMode.FULL_CACHED;
   }

   /**
    * Returns true if the caller may execute a Kawase / Gaussian background blur FBO pass for the
    * current frame. On Mojo Launcher, once one shared background blur pass has completed for this
    * frame, subsequent panels reuse the cached downsampled texture instead of re-ping-ponging FBOs.
    */
   public static boolean tryAcquireBlurPass() {
      BlurMode mode = getActiveBlurMode();
      if (mode == BlurMode.TINT_FALLBACK) {
         return false;
      }
      screenHasBlurThisFrame = true;
      if (mode == BlurMode.SINGLE_SHARED_PASS && sharedBlurComputedThisFrame) {
         return false;
      }
      sharedBlurComputedThisFrame = true;
      return true;
   }

   /**
    * Recommended Kawase ping-pong iteration count for current hardware/translator.
    * Desktop default is typically 3-4 iterations; Mojo ES translators run cleanly at 1-2 iterations
    * on a half/quarter-res shared target.
    */
   public static int getRecommendedBlurPasses(int requestedPasses) {
      BlurMode mode = getActiveBlurMode();
      if (mode == BlurMode.TINT_FALLBACK) {
         return 0;
      }
      if (mode == BlurMode.SINGLE_SHARED_PASS) {
         return Math.max(1, Math.min(requestedPasses, 2));
      }
      return Math.max(1, requestedPasses);
   }

   /**
    * Motion blur allocates/samples a full-screen HistorySampler via texelFetch each frame.
    * On Mojo Launcher we keep it enabled for gameplay unless GL4ES/failure forces fallback, or
    * while active screen blur is already consuming full-screen FBO bandwidth.
    */
   public static boolean shouldAllowMotionBlur(boolean hasActiveGuiScreen) {
      if (runtimeFailureTripped || !AndroidRuntimeEnv.supportsModernUboAndBlurShaders()) {
         return false;
      }
      if (AndroidRuntimeEnv.isMojoLauncher() && (hasActiveGuiScreen || screenHasBlurThisFrame)) {
         return false;
      }
      return true;
   }

   public static void markBlurOrPostFailure(Throwable error) {
      runtimeFailureTripped = true;
      failureReason = error != null ? (error.getClass().getSimpleName() + ": " + error.getMessage()) : "unknown";
   }

   public static boolean isFallbackActive() {
      return getActiveBlurMode() == BlurMode.TINT_FALLBACK;
   }

   public static String getFailureReason() {
      return failureReason;
   }
}
