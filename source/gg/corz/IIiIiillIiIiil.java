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

public enum IIiIiillIiIiil {
   IliiliIlilliiliIli,
   iililiIliIIiiliIli,
   lIiiliIliiIiiliIli,
   IlIiliIlillIiliIli,
   IIliliIlilIliliIli,
   iIliliIliIlliliIli,
   liIiliIliiiIiliIli,
   llliliIliilliliIli,
   ilIiliIliIiIiliIli,
   IililiIlilililiIli;

   // $FF: synthetic method
   private static IIiIiillIiIiil[] IliIlllilIi() {
      IIiIiillIiIiil[] var10000 = new IIiIiillIiIiil[(~402196102 + -11 >>> 29 | ~402196102 + -11 << 3) + 111 ^ 1077398508];
      var10000[0] = IlIiliIlillIiliIli;
      var10000[1] = ilIiliIliIiIiliIli;
      var10000[2] = liIiliIliiiIiliIli;
      var10000[3] = IIliliIlilIliliIli;
      var10000[4] = iIliliIliIlliliIli;
      var10000[5] = llliliIliilliliIli;
      var10000[-((-1933439804 >>> 29 | -1933439804 << 3) * 723362913) ^ 877018202] = IililiIlilililiIli;
      var10000[~(--1111430656) * -33 ^ -1977493978] = iililiIliIIiiliIli;
      var10000[-(-(1940188193 ^ 105)) * -125 ^ -2005360432] = lIiiliIliiIiiliIli;
      var10000[(-1167809220 * 654471207 - -57) * -1736263375 ^ 1292169924] = IliiliIlilliiliIli;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) << 11) >>> 1 | (char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) << 11) << 15))) ^ 26889) + var5) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) << 11) >>> 1 | (char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) << 11) << 15))) ^ 26889) + var5) >>> 15))))))) ^ 15052) ^ 12213)) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1487913231384787639L ^ Long.rotateLeft(775622554288439375L, 15) ^ 3744407375159024474L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6824838475102508020L ^ Long.rotateLeft(4303784104789526408L, 46) ^ 6093846395895157522L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4483977973087693535L ^ Long.rotateLeft(-5132566004280771134L, 9) ^ 1685047040503710812L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4283275740500019756L ^ Long.rotateLeft(6848984989661385427L, 28) ^ 6068028110599451516L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7120332996789868546L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6589830607113637230L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2982268122736279645L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3660600303344120043L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2641349392952337660L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7095579133550966451L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iliIiiliiiii<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9))) ^ var5) >>> 7 | (char)((char)(-((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9))) ^ var5) << 9) - '\uf2e7') ^ var5) >>> 14 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9))) ^ var5) >>> 7 | (char)((char)(-((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9))) ^ var5) << 9) - '\uf2e7') ^ var5) << 2))) + 28168));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(~((char)(var4[var5] - var5))))) + var5) << 14 | (char)((char)(~((char)(~((char)(var4[var5] - var5))))) + var5) >>> 2) ^ 9260))) ^ var5) << 14 | (char)((char)(~((char)((char)((char)((char)(~((char)(~((char)(var4[var5] - var5))))) + var5) << 14 | (char)((char)(~((char)(~((char)(var4[var5] - var5))))) + var5) >>> 2) ^ 9260))) ^ var5) >>> 2) ^ var5) - 24981));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - var5) - '贁') - 29089))) ^ var5) ^ '鵌') + '\ud8dd') - 28005))) - 25817) + '\uee60'))) ^ var5)) ^ '땱'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(~((char)(~((char)(~var4[var5]))))) + 21880))) + var5))))) ^ var5) + 10530) ^ var5) + '慄') + 27605))))) >>> 5 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(~((char)(~((char)(~var4[var5]))))) + 21880))) + var5))))) ^ var5) + 10530) ^ var5) + '慄') + 27605))))) << 11) ^ 21419));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
