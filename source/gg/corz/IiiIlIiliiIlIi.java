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

public record IiiIlIiliiIlIi(String kind, int expected, double cost, long representative, String alternativeOwner, long alternativeMissionId, long alternativeAssetId, long alternativeRegion) {
   private final long iilIllIiiIIiIllIii;
   private final int ilIIllIiiIiIIllIii;
   private final String IlIIllIiillIIllIii;
   private final long IIlIllIiilIlIllIii;
   private final double liIIllIiiiiIIllIii;
   private final long lllIllIiiillIllIii;
   private final String iIlIllIiiIllIllIii;
   private final long IilIllIiililIllIii;

   public double iliIiiliiiii() {
      return this.liIIllIiiiiIIllIii;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) >>> 11))) ^ var5))) - 16851) >>> 4 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) >>> 11))) ^ var5))) - 16851) << 12))) >>> 5 | (char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) >>> 11))) ^ var5))) - 16851) >>> 4 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 6 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 10)) ^ var5)) - 18195) >>> 11))) ^ var5))) - 16851) << 12))) << 11))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) >>> 13) >>> 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) >>> 13) << 14))) - '\ue847') << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) >>> 13) >>> 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') >>> 6 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uf3ec') + 27785) - '\ue2a1') << 10) >>> 13) << 14))) - '\ue847') >>> 11))) + var5))) + 8740));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) << 13) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) << 13) >>> 14) + var5) + '큱'))))) << 11 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) << 13) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) << 15 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) << 13 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) << 11 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - var5) >>> 5) >>> 3) >>> 1) << 13) >>> 14) + var5) + '큱'))))) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8262864331523923298L ^ Long.rotateLeft(-8260837627045938549L, 1) ^ 5057069428582355931L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8306694212462466083L ^ Long.rotateLeft(-7161287932619328888L, 34) ^ -8552627135650216192L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8075241406752078971L ^ Long.rotateLeft(9105743416678322836L, 35) ^ 8736801408354771713L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2314821899623796241L ^ Long.rotateLeft(-3216657182992459519L, 37) ^ -2157239585493710102L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1261469559007465513L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7468747109040775409L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7774778390263031802L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -165180021062064537L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7177784824959740726L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6849828976857089092L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) << 2 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) >>> 14) - var5) - var5))) - '멚'))) << 6 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) << 2 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) >>> 14) - var5) - var5))) - '멚'))) >>> 10) - var5) >>> 13 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) << 2 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) >>> 14) - var5) - var5))) - '멚'))) << 6 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) << 2 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '跺'))) - var5) - 22212)) >>> 14) - var5) - var5))) - '멚'))) >>> 10) - var5) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IlIlllIlilIl() {
      return this.iIlIllIiiIllIllIii;
   }

   public boolean IliIlllilIi(Illillillllillil intent) {
      return this.IlIIllIiillIIllIii.equals(Iilllilliill<invokedynamic>()) && this.IilIllIiililIllIii != 0L && this.lllIllIiiillIllIii != 0L && this.iIlIllIiiIllIllIii.equals(intent.lIiiIiIlilli().name()) && this.lllIllIiiillIllIii == intent.iliIiiliiiii();
   }

   public long IIIllIIliIIl() {
      return this.IIlIllIiilIlIllIii;
   }

   public long IIlllIlliIll() {
      return this.IilIllIiililIllIii;
   }

   public String iIlIlllllill() {
      return this.IlIIllIiillIIllIii + Iilllilliill<invokedynamic>() + this.ilIIllIiiIiIIllIii + Iilllilliill<invokedynamic>() + String.format(Locale.ROOT, Iilllilliill<invokedynamic>(), this.liIIllIiiiiIIllIii) + Iilllilliill<invokedynamic>() + String.format(Locale.ROOT, Iilllilliill<invokedynamic>(), this.liiiIIllIl()) + Iilllilliill<invokedynamic>() + this.lllIllIiiillIllIii + Iilllilliill<invokedynamic>() + this.IilIllIiililIllIii + Iilllilliill<invokedynamic>() + this.iIlIllIiiIllIllIii + Iilllilliill<invokedynamic>() + this.iilIllIiiIIiIllIii + Iilllilliill<invokedynamic>();
   }

   public String IilliliilIIi() {
      return this.IlIIllIiillIIllIii;
   }

   public double liiiIIllIl() {
      return this.ilIIllIiiIiIIllIii <= 0 ? (double)0.0F : (double)this.ilIIllIiiIiIIllIii / ((double)1.0F + Math.max((double)0.0F, this.liIIllIiiiiIIllIii));
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ 25800))) - var5)) << 5 | (char)((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ 25800))) - var5)) >>> 11) ^ 27304) + var5) + '\uecbe') - var5) ^ '豲'))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiiIlIiliiIlIi(String kind, int alternativeMissionId, double alternativeRegion, long expected, String alternativeOwner, long representative, long alternativeAssetId, long cost) {
      this.IlIIllIiillIIllIii = kind;
      this.ilIIllIiiIiIIllIii = alternativeMissionId;
      this.liIIllIiiiiIIllIii = alternativeRegion;
      this.IIlIllIiilIlIllIii = expected;
      this.iIlIllIiiIllIllIii = alternativeOwner;
      this.lllIllIiiillIllIii = representative;
      this.IilIllIiililIllIii = alternativeAssetId;
      this.iilIllIiiIIiIllIii = cost;
   }

   public long Illlllllilll() {
      return this.iilIllIiiIIiIllIii;
   }

   public long IiIlliIliiIl() {
      return this.lllIllIiiillIllIii;
   }

   public int lIiiIiIlilli() {
      return this.ilIIllIiiIiIIllIii;
   }

   public IiiIlIiliiIlIi(String representative, int expected, double kind, long cost) {
      this(representative, expected, kind, cost, Iilllilliill<invokedynamic>(), 0L, 0L, 0L);
   }
}
