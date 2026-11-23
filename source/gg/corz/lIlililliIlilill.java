package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIlililliIlilill {
   public static double liiiIIllIl(long feet, boolean sneaking, long target) {
      double var5 = (double)llIiIiililIiIiil.IiIlliIliiIl(feet) + (double)0.5F;
      double var7 = (double)llIiIiililIiIiil.IIlllIlliIll(feet) + IliIlllilIi(sneaking);
      double var9 = (double)llIiIiililIiIiil.Illlllllilll(feet) + (double)0.5F;
      double var11 = (double)llIiIiililIiIiil.IiIlliIliiIl(target) + (double)0.5F - var5;
      double var13 = (double)llIiIiililIiIiil.IIlllIlliIll(target) + (double)0.5F - var7;
      double var15 = (double)llIiIiililIiIiil.Illlllllilll(target) + (double)0.5F - var9;
      return Math.sqrt(var11 * var11 + var13 * var13 + var15 * var15);
   }

   public static double IliIlllilIi(boolean sneaking) {
      return sneaking ? 1.27 : 1.62;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1186766290409228773L ^ Long.rotateLeft(-5402726187756211548L, 31) ^ 3443776967183080583L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5201801011876798121L ^ Long.rotateLeft(-6924241025125936278L, 39) ^ 5171424096952554045L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5588150371781660751L ^ Long.rotateLeft(-3838982130262782762L, 41) ^ 1904902607497336401L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8824312947434209085L ^ Long.rotateLeft(3706934424582085484L, 17) ^ 7373511769801780163L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3436380057389030515L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8602017769378958821L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5203095694219771057L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3822333236688636706L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4985570873386070906L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2316998996554172206L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] ^ '툞'))))) + '젳') ^ 17105) ^ 16590) << 9 | (char)((char)((char)((char)(-((char)(-((char)(var4[var5] ^ '툞'))))) + '젳') ^ 17105) ^ 16590) >>> 7) - var5) ^ var5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) << 6 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) >>> 10) + '\uea4f') ^ '\ue7b2') << 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) << 6 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) >>> 10) + '\uea4f') ^ '\ue7b2') >>> 10) ^ '럥') << 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) << 6 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) >>> 10) + '\uea4f') ^ '\ue7b2') << 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) << 6 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))) ^ 22013) ^ '\uf5ef') - var5) >>> 8))) >>> 10) + '\uea4f') ^ '\ue7b2') >>> 10) ^ '럥') >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) + var5)) ^ var5) << 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + var5) + var5)) ^ var5) >>> 1))) - 13629) ^ 1916) ^ 12493) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String lIiiIiIlilli(liIllIIiiiIllIIi liveFeet, long v, lIIlliIiiIIlliIi c) {
      return iliIiiliiiii<invokedynamic>() + (liveFeet == null ? iliIiiliiiii<invokedynamic>() : llIiIiililIiIiil.IlIlllIlilIl(liveFeet.iIlIlllllill())) + iliIiiliiiii<invokedynamic>() + llIiIiililIiIiil.IlIlllIlilIl(v) + iliIiiliiiii<invokedynamic>() + (liveFeet == null ? iliIiiliiiii<invokedynamic>() : llIiIiililIiIiil.IlIlllIlilIl(liveFeet.liiiIIllIl())) + iliIiiliiiii<invokedynamic>() + (liveFeet != null && liveFeet.IilliliilIIi() ? iliIiiliiiii<invokedynamic>() : iliIiiliiiii<invokedynamic>()) + iliIiiliiiii<invokedynamic>() + String.format(Locale.ROOT, iliIiiliiiii<invokedynamic>(), c.iIlIlllllill()) + iliIiiliiiii<invokedynamic>() + String.format(Locale.ROOT, iliIiiliiiii<invokedynamic>(), c.IilliliilIIi()) + iliIiiliiiii<invokedynamic>() + c.liiiIIllIl();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) << 1) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) << 1) << 3)))))) + '稜'))) - var5) ^ '靼') ^ var5) << 12 | (char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) << 1) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] ^ 12762) - 30304) ^ var5) ^ var5) ^ var5) << 1) << 3)))))) + '稜'))) - var5) ^ '靼') ^ var5) >>> 4) - var5) + 14509));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIIlliIiiIIlliIi IilliliilIIi(liIllIIiiiIllIIi c, long liveFeet, boolean reach, double liveSneaking) {
      return iIlIlllllill(c, liveFeet, c == null ? Double.NaN : liiiIIllIl(liveFeet, reach, c.liiiIIllIl()), liveSneaking);
   }

   public static lIIlliIiiIIlliIi iIlIlllllill(liIllIIiiiIllIIi liveDistance, long liveFeet, double c, double reach) {
      if (liveDistance == null) {
         return new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.iiIilliiil, Double.NaN, c);
      } else {
         double var7 = liveDistance.IliIlllilIi();
         if (liveFeet != liveDistance.iIlIlllllill()) {
            return new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.IiIilliiil, var7, c);
         } else {
            return c > reach ? new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.liIilliiil, var7, c) : new lIIlliIiiIIlliIi(iIIliIIiIlIliIIi.ilIilliiil, var7, c);
         }
      }
   }

   private lIlililliIlilill() {
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) << 12) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) << 12) >>> 7) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) << 12) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') << 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) << 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) - '辋') + var5) ^ '칡') + var5)))) ^ var5) >>> 13) + var5) - '\uec7f') >>> 15) - var5) << 12) >>> 7) ^ var5) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
