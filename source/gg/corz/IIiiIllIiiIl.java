package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIiiIllIiiIl {
   private static final Set<String> iiliililIIiiilil;
   private static final Map<String, String> Iiliililliliilil;

   public static Class lIiiIiIlilli(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   public static String liiiIIllIl(String rawId) {
      int[] var8 = new int[9];
      int var4 = System.identityHashCode(var8) + -1646733911;
      int var6 = (System.identityHashCode(var8) ^ 1856065716) + -1937523043;
      int var7 = System.identityHashCode(var8) + 1894855939;
      if (rawId == null) {
         return "";
      } else {
         String var10000 = rawId.1oy2lgr8zaz07<invokedynamic>(rawId, 0);
         String var1 = var10000.3c33wlqfqbyy7<invokedynamic>(var10000, Locale.ROOT, 0);
         String var2 = (String)Iiliililliliilil.2b88hy27757fa<invokedynamic>(Iiliililliliilil, var1, 0);
         if (var2 != null) {
            var10000 = var2;
            if ((System.identityHashCode(rawId) ^ System.identityHashCode(rawId) ^ 1) == 0) {
               throw null;
            }
         } else {
            var10000 = var1;
         }

         return var10000;
      }
   }

   public static boolean IilliliilIIi(String rawId) {
      if (rawId == null) {
         return false;
      } else {
         Map var10000 = Iiliililliliilil;
         return var10000.94483v27zh75<invokedynamic>(var10000, rawId.1oy2lgr8zaz07<invokedynamic>(rawId, 0).3c33wlqfqbyy7<invokedynamic>(rawId.1oy2lgr8zaz07<invokedynamic>(rawId, 0), Locale.ROOT, 0), 0);
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[30];
      int var8;
      int var9 = (var8 = System.identityHashCode(var13)) + 142347588;
      int var11 = (System.identityHashCode(var13) ^ 78873653) + -1899703169;
      int var12 = System.identityHashCode(var13) + 459360462;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) << 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) >>> 7) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) << 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) >>> 7) << 11) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) << 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) >>> 7) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) << 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) >>> 2 | (char)((char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) << 1 | (char)(-((char)(~((char)(~((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 5 | (char)((char)(var4[var5] + var5) - var5) << 11) - var5))))))))) >>> 15) << 14) + var5) + var5) + var5) >>> 10) >>> 7) << 11) + var5) << 15));
         ++var5;
         if (var9 - var8 - 142347588 != 0) {
            IliIlllilIi = ~IliIlllilIi;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[5];
      int var9 = System.identityHashCode(var13) + 690032246;
      int var10;
      int var11 = (var10 = System.identityHashCode(var13) ^ 1277093173) + -942803466;
      int var12 = System.identityHashCode(var13) + 532521392;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) >>> 4 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) << 12) - var5) ^ var5))) + var5) - 20214) + '븓'))) << 14 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) >>> 4 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) << 12) - var5) ^ var5))) + var5) - 20214) + '븓'))) >>> 2) ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) >>> 4 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) << 12) - var5) ^ var5))) + var5) - 20214) + '븓'))) << 14 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) >>> 4 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5))) + var5) << 13) << 12) - var5) ^ var5))) + var5) - 20214) + '븓'))) >>> 2) ^ var5) >>> 13));
         ++var5;
         if ((var11 - var10 - -942803466 ^ 1) == 0) {
            liiiIIllIl = ~liiiIIllIl;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      String var15 = var1;
      int[] var13 = new int[27];
      int var9 = System.identityHashCode(var13) + 1198068230;
      int var11 = (System.identityHashCode(var13) ^ 235767738) + -1717636208;
      int var12 = System.identityHashCode(var13) + 267529214;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) << 10 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) >>> 6)))) - 27260))) + var5) << 5 | (char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) << 10 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) >>> 6)))) - 27260))) + var5) >>> 11) ^ '鋿') + var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) << 10 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) >>> 6)))) - 27260))) + var5) << 5 | (char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) << 10 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') << 5 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 13 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 3) + '\ue7a0') >>> 11))) >>> 6)))) - 27260))) + var5) >>> 11) ^ '鋿') + var5) << 1) ^ var5));
         ++var5;
         if (var15 != var15) {
            throw new VerifyError("Inconsistent flow at 60629");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IIiiIllIiiIl() {
   }

   private static String IlIlllIlilIl(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var3[var5] = (byte)((var3[var5] ^ var1 ^ var2) + var5);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }

   private static Object IIIllIIliIIl(MutableCallSite var0, MethodHandles.Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = IlIlllIlilIl(var3, var4 ^ var6, 66).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -2002747337) != (Integer.rotateLeft(1582548410 ^ var16, var16 & 31) ^ -2002747337)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -41209475) != (Integer.rotateLeft(-1091446947 ^ var16, var16 & 31) ^ -41209475)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1596519847) != (Integer.rotateLeft(809724811 ^ var16, var16 & 31) ^ -1596519847)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1554165469) != (Integer.rotateLeft(-580046853 ^ var16, var16 & 31) ^ -1554165469)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 2063849490) != (Integer.rotateLeft(-1587861898 ^ var16, var16 & 31) ^ 2063849490)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1272985910) != (Integer.rotateLeft(-15708207 ^ var16, var16 & 31) ^ -1272985910)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -943013399) != (Integer.rotateLeft(-886023167 ^ var16, var16 & 31) ^ -943013399)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
                     } else {
                        var12 = var1.findGetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
                     }
                  } else {
                     var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                  }
               } else {
                  var12 = var1.findStaticGetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
               }
            } else {
               var12 = var1.findStaticSetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
            }
         } else {
            var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
         }
      } else {
         var12 = var1.findSetter(var9, var7[2], lIiiIiIlilli(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), new Class[]{Integer.TYPE});
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[16];
      int var9 = System.identityHashCode(var13) + -1921910378;
      int var11 = System.identityHashCode(var13) ^ 576905492 ^ 555771173;
      int var12 = System.identityHashCode(var13) + 1930783349;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 430) - 13939) - var5) ^ '谘') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 430) - 13939) - var5) ^ '谘') >>> 5) ^ var5) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 430) - 13939) - var5) ^ '谘') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 430) - 13939) - var5) ^ '谘') >>> 5) ^ var5) ^ var5) << 12) - var5));
         ++var5;
         if ((var12 ^ var12) != 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(String rawId) {
      Set var10000 = iiliililIIiiilil;
      return var10000.18vl1ci4f0sy6<invokedynamic>(var10000, rawId.srqi6m8iwa00<invokedynamic>(rawId, 0), 0);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5474707131772020228L ^ Long.rotateLeft(-3072028436451181489L, 22) ^ 6220658130296316184L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1994648592172915237L ^ Long.rotateLeft(7526292178190901523L, 57) ^ 3968833536642126669L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8222730548895402980L ^ Long.rotateLeft(-7122084064340951494L, 16) ^ 3432830647942316929L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5086557130716992846L ^ Long.rotateLeft(2708819941576146024L, 53) ^ 1827063531007122245L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1528753566851443863L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6039143677231029125L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4266089435591605660L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6138790400817933669L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6674396420688161757L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2099305945629764577L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
      byte[] var13 = var11.decode(var3);
      var12.init(2, var10, new GCMParameterSpec(128, var13, 0, 12));
      byte[] var15 = var12.doFinal(var13, 12, var13.length - 12);
      String var16 = new String(var15, StandardCharsets.UTF_8);
      Arrays.fill(var4, (byte)0);
      Arrays.fill(var5, (byte)0);
      Arrays.fill(var6, (byte)0);
      Arrays.fill(var8, (byte)0);
      Arrays.fill(var9, (byte)0);
      Arrays.fill(var15, (byte)0);
      MethodHandle var17 = MethodHandles.constant(String.class, var16);
      return new ConstantCallSite(var17);
   }

   public static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "IIIllIIliIIl";
         Object[] var6 = new Object[]{var4, var0, var2, var3, var1.hashCode()};
         MethodHandle var7 = MethodHandles.insertArguments(var5, 0, var6).asCollector(Object[].class, var2.parameterCount()).asType(var2);
         if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
            throw new BootstrapMethodError();
         } else {
            var4.setTarget(var7);
            return var4;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      String var15 = var1;
      int[] var13 = new int[29];
      int var9 = System.identityHashCode(var13) + 270864271;
      int var11 = (System.identityHashCode(var13) ^ -1619538095) + -674527599;
      int var12 = System.identityHashCode(var13) + 1979465510;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(~((char)(-((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] - 29071) + var5))) - 'ꮶ'))))))))))) ^ var5) - var5) - var5))) ^ var5) + var5));
         ++var5;
         if ((System.identityHashCode(var15) ^ System.identityHashCode(var15)) != 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IliIlllilIi(String simpleName) {
      String var19 = simpleName;
      int[] var18 = new int[31];
      int var14 = System.identityHashCode(var18) ^ 487153166;
      int var15;
      int var16 = (var15 = System.identityHashCode(var18) ^ 183351297) ^ 2093812326;
      int var17 = System.identityHashCode(var18) + 1801538748;
      long var7 = 2024680511712617786L;
      long var9 = 7338604231476299151L;
      long var11 = -7920474191114440760L;
      if (simpleName != null && !simpleName.1axtxfpyibgvf<invokedynamic>(simpleName, 0)) {
         StringBuilder var1 = new StringBuilder(simpleName.1ukgba3jb7y8p<invokedynamic>(simpleName, 0) + (~(-1417467746 + 3) - -67 ^ 1417467817));
         var7 ^= ((long)simpleName.1ukgba3jb7y8p<invokedynamic>(simpleName, 0) << 32 ^ var7) & -1L << 32;
         var7 ^= (0L ^ var7) & -1L >>> 32;

         while((int)var7 < (int)(var7 >>> 32)) {
            var9 ^= ((long)simpleName.9x5k5e7jxy4x<invokedynamic>(simpleName, (int)var7, 0) << 32 ^ var9) & -1L << 32;
            if (((int)(var9 >>> 32)).2da4fzss68z21<invokedynamic>((char)((int)(var9 >>> 32)), 0)) {
               int var22;
               label82: {
                  if ((int)var7 > 0) {
                     var22 = simpleName.9x5k5e7jxy4x<invokedynamic>(simpleName, (int)var7 - 1, 0);
                     if (var22.191wdqem5p4iv<invokedynamic>((char)var22, 0)) {
                        var22 = 1;
                        if (var19 != var19) {
                           throw new VerifyError("Inconsistent flow at 36469");
                        }
                        break label82;
                     }
                  }

                  var22 = 0;
               }

               label77: {
                  var9 ^= ((long)var22 ^ var9) & -1L >>> 32;
                  if ((int)var7 + 1 < (int)(var7 >>> 32)) {
                     var22 = simpleName.9x5k5e7jxy4x<invokedynamic>(simpleName, (int)var7 + 1, 0);
                     if (var22.191wdqem5p4iv<invokedynamic>((char)var22, 0)) {
                        var22 = 1;
                        if ((var17 | -249152788) + (var17 & -249152788) - (var17 + -249152788) != 0) {
                           iIlIlllllill = ~iIlIlllllill;
                           throw null;
                        }
                        break label77;
                     }
                  }

                  var22 = 0;
               }

               var11 ^= ((long)var22 << 32 ^ var11) & -1L << 32;
               if ((int)var7 > 0 && ((int)var9 != 0 || (int)(var11 >>> 32) != 0)) {
                  var1.1qo8ca0i2nttu<invokedynamic>(var1, (char)(~(~((1835514952 ^ -63) << 23 | (1835514952 ^ -63) >>> 9)) ^ -993440642), 0);
               }

               var1.1qo8ca0i2nttu<invokedynamic>(var1, ((int)(var9 >>> 32)).vva2ejglt9e9<invokedynamic>((char)((int)(var9 >>> 32)), 0), 0);
               if ((var16 ^ var15 ^ 2093812326) != 0) {
                  throw null;
               }
            } else if (((int)(var9 >>> 32)).gj4ilrt83ou8<invokedynamic>((char)((int)(var9 >>> 32)), 0)) {
               var1.1qo8ca0i2nttu<invokedynamic>(var1, (char)((int)(var9 >>> 32)), 0);
               if ((var17 ^ var17) != 0) {
                  throw null;
               }
            } else {
               var1.1qo8ca0i2nttu<invokedynamic>(var1, (char)(334070908 * 1963413621 * -3 ^ -462218845), 0);
            }

            var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
            if ((var17 & ~var17 ^ 1) == 0) {
               throw new VerifyError("Inconsistent flow at 24392");
            }
         }

         return var1.amnr31j8r6t5<invokedynamic>(var1, 0);
      } else {
         return "";
      }
   }

   static {
      Class var10000 = IiIlliIliiIl<invokedynamic>();
      Iiliililliliilil = var10000.2z4lihiai2tcu<invokedynamic>(var10000, IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), 0);
      var10000 = new String[~(-(1874106661 << 27 | 1874106661 >>> 5) << 17 | -(1874106661 << 27 | 1874106661 >>> 5) >>> 15) ^ 1234196215];
      ((Object[])var10000)[0] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[1] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[2] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[3] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[4] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[5] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[(1650104517 ^ -3) * 1056139499 ^ 1928101998] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[(368916886 * -97 >>> 7 | 368916886 * -97 << 25) ^ 1431706203] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[(-169606949 >>> 29 | -169606949 << 3) - 83 - -63 ^ -1356855613] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[-(--818318881) ^ 75 ^ -818318947] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[~(~1414937765 ^ -7) ^ -1414937770] = IiIlliIliiIl<invokedynamic>();
      ((Object[])var10000)[((-1675101553 >>> 17 | -1675101553 << 15) >>> 5 | (-1675101553 >>> 17 | -1675101553 << 15) << 27) + -19 ^ -1612038570] = IiIlliIliiIl<invokedynamic>();
      iiliililIIiiilil = var10000.3jwws4srakv9m<invokedynamic>(var10000, 0);
   }
}
