package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

enum iiilllIiIIIillIi {
   IiliiiIIIi,
   liliiiIIIi,
   llliiiIIIi,
   IlliiiIIIi,
   lIliiiIIIi,
   illiiiIIIi,
   iiliiiIIIi,
   iIliiiIIIi,
   IIliiiIIIi;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) + 17759) - var5) - var5) ^ var5))) - 30700) - var5) ^ '騅') ^ 25251))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5223385127980557181L ^ Long.rotateLeft(-891438658134974939L, 50) ^ -4961781740281509797L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8815038378981440707L ^ Long.rotateLeft(7514893597456423120L, 14) ^ -202998785947879740L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6371518319651925825L ^ Long.rotateLeft(468171371942699499L, 43) ^ -6923455193159892791L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1476313811241190819L ^ Long.rotateLeft(4944578460502716351L, 37) ^ 6204553461261655508L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8211772152236429947L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1611709792231422247L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8897908665503479022L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6846868143291820899L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8189426753984324075L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6637000777253544155L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIlIlllllill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IilliliilIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIiiIiIlilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iliIiiliiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIllIIliIIl<invokedynamic>());
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(var4[var5] + '閯'))) >>> 4 | (char)(~((char)(var4[var5] + '閯'))) << 12) - '뇏'))) ^ var5))) - var5) ^ var5) + 26522) ^ var5) ^ 27811) ^ var5) ^ var5) ^ 4331) + var5) + var5) + 15369));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) >>> 15 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) << 1) + var5))) << 7 | (char)(~((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) >>> 15 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) << 1) + var5))) >>> 9))) - var5) ^ var5) ^ 11220) + '鞂') << 8 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) >>> 15 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) << 1) + var5))) << 7 | (char)(~((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) >>> 15 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) << 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 7) << 1) + var5))) >>> 9))) - var5) ^ var5) ^ 11220) + '鞂') >>> 8))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static iiilllIiIIIillIi[] IliIlllilIi() {
      iiilllIiIIIillIi[] var10000 = new iiilllIiIIIillIi[(-1432264035 + -69) * -125 * -1227133513 ^ 1647041201];
      var10000[0] = IIliiiIIIi;
      var10000[1] = lIliiiIIIi;
      var10000[2] = iIliiiIIIi;
      var10000[3] = IlliiiIIIi;
      var10000[4] = llliiiIIIi;
      var10000[5] = illiiiIIIi;
      var10000[((-218562932 * -109 ^ -61) >>> 29 | (-218562932 * -109 ^ -61) << 3) * 57 ^ -1479675355] = IiliiiIIIi;
      var10000[(-1959476535 << 11 | -1959476535 >>> 21) ^ -1508488098] = liliiiIIIi;
      var10000[(-397322408 ^ -85) * -51 ^ 1211389855] = iiliiiIIIi;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) >>> 4 | (char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) << 12) >>> 12 | (char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) >>> 4 | (char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) << 12) << 4) + var5) << 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) >>> 4 | (char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) << 12) >>> 12 | (char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) >>> 4 | (char)((char)(-((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11))) ^ var5) << 12) << 4) + var5) >>> 5) + var5) ^ 32251) + var5) + var5))) - '鏋'))));
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
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) << 4) - var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) << 4) - var5) << 15) >>> 7 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) << 4) - var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) << 9 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) << 10 | (char)((char)((char)((char)(var4[var5] + 27952) - 20869) ^ var5) - 8346) >>> 6) ^ var5))) ^ '웑'))) >>> 7) ^ var5) << 4) - var5) << 15) << 9))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
