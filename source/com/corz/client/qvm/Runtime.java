package com.corz.client.qvm;

import java.lang.invoke.MethodHandles;

/**
 * Pure-Java Android/Mojo-safe QVM Runtime stub.
 *
 * All QVM-protected methods in Dispute Client v2.0.3 (Module.setEnabled, auth/HWID getters,
 * etc.) are lowered to pure Java bytecode at build time, eliminating all native Windows vm.dll
 * and Linux glibc libvm.so dependencies on Android ARM64.
 */
public final class Runtime {
   private Runtime() {
   }

   public static boolean isNativeLoaded() {
      return false;
   }

   public static Throwable getNativeLoadError() {
      return null;
   }

   public static void loadVm(Class<?> cls, MethodHandles.Lookup lookup) {
   }

   public static Object run(long id, int flags, Object[] args) {
      return null;
   }

   public static int runI(long id, int flags, Object[] args) {
      return 0;
   }

   public static long runJ(long id, int flags, Object[] args) {
      return 0L;
   }

   public static float runF(long id, int flags, Object[] args) {
      return 0.0F;
   }

   public static double runD(long id, int flags, Object[] args) {
      return 0.0D;
   }
}
