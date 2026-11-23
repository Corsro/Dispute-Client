package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class llIiiIlilIiiIl {
   final String iIIiliillIlIiliill;
   iliiiIiiii iiIiliillIIliliill;
   float Illiliillllliliill;
   List<iIiiiilIliiiil> Iiiiliillliiiliill;
   int illiliillIililiill;
   List<iIIIIIliIlIIIIli> iiiiliillIIIIiiill;
   int lililiilliililiill;
   String llIiliillilIiliill;
   long iIiiliillIliiliill;
   float lIliliilliIliliill;
   String IiIiliillliIiliill;
   float[] lliiliilliliiliill;
   // $FF: synthetic field
   final ilillllIiillll lIIIiiilliIIIiiill;
   int IIiiliilllIiiliill;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7686234739374848748L ^ Long.rotateLeft(-5623532859464703148L, 49) ^ 5919897620008598007L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -846713353932133241L ^ Long.rotateLeft(-9032458863038870898L, 19) ^ -163720803061525220L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8612582461605747070L ^ Long.rotateLeft(-3842977929170928045L, 46) ^ 4125054348406199176L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5799396760432670796L ^ Long.rotateLeft(1324219939951457781L, 51) ^ -7374541295424546743L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7663279527803301591L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3533826290105880110L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8456351506721273878L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7584094153190862757L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7986747689415130708L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4586684983592476221L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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

   void IliIlllilIi() {
      this.lIliliilliIliliill = 0.0F;
      this.illiliillIililiill = 0;
      this.iIlIlllllill();
   }

   llIiiIlilIiiIl(final ilillllIiillll var1, String item) {
      this.lIIIiiilliIIIiiill = var1;
      this.lliiliilliliiliill = ilillllIiillll.iiIilIIIiIIlilIIIi;
      this.Iiiiliillliiiliill = List.of();
      this.iiiiliillIIIIiiill = List.of();
      this.iIIiliillIlIiliill = item;
      this.llIiliillilIiliill = item;
   }

   void IilliliilIIi(int k) {
      String var2;
      float var3;
      float var4;
      if (!this.Iiiiliillliiiliill.isEmpty()) {
         if (k < 0 || k >= this.Iiiiliillliiiliill.size()) {
            return;
         }

         iIiiiilIliiiil var5 = (iIiiiilIliiiil)this.Iiiiliillliiiliill.get(k);
         var2 = var5.liiiIIllIl();
         var3 = var5.iIlIlllllill();
         var4 = var5.IilliliilIIi();
      } else {
         if (k < 0 || k >= this.iiiiliillIIIIiiill.size()) {
            return;
         }

         iIIIIIliIlIIIIli var6 = (iIIIIIliIlIIIIli)this.iiiiliillIIIIiiill.get(k);
         var2 = var6.liiiIIllIl();
         var3 = var6.iIlIlllllill();
         var4 = var6.IilliliilIIi();
      }

      IIiiIIlilIiiIIli.liiiIIllIl(this.lIIIiiilliIIIiiill.IIiilIIIilIiilIIIi.llliiillii(), var2, var3 * this.lIIIiiilliIIIiiill.IIiilIIIilIiilIIIi.Iiliililii() * 0.6F, var4, this.iIiiliillIliiliill);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) >>> 8) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) >>> 8) + var5) << 5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) >>> 8) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) >>> 4 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 10 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 6) << 12))) - 30085) - var5) ^ var5) + var5) - var5) - 11012) + var5) + var5) + 5322) >>> 8) + var5) << 5) << 11) ^ 8828) - 13940));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) << 10))) + var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) << 10))) + var5) << 6))) + 30083))) << 7 | (char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) << 10))) + var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) >>> 1 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) ^ '蟥'))) - '）') ^ 26388) << 15) + var5) << 7)) << 10))) + var5) << 6))) + 30083))) >>> 9));
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
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) >>> 12 | (char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) << 4) - var5) - var5) >>> 10 | (char)((char)((char)((char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) >>> 12 | (char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) << 4) - var5) - var5) << 6))))) << 3 | (char)(-((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) >>> 12 | (char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) << 4) - var5) - var5) >>> 10 | (char)((char)((char)((char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) >>> 12 | (char)(-((char)(~((char)(-((char)(-((char)(var4[var5] + var5))))))))) << 4) - var5) - var5) << 6))))) >>> 13))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) << 5 | (char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) >>> 11) - var5) - 18165) + var5) ^ var5) - var5) + var5) - var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) << 5 | (char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) >>> 11) - var5) - 18165) + var5) ^ var5) - var5) + var5) - var5) >>> 5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) << 5 | (char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) >>> 11) - var5) - 18165) + var5) ^ var5) - var5) + var5) - var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) << 5 | (char)((char)((char)((char)(var4[var5] ^ var5) << 15 | (char)(var4[var5] ^ var5) >>> 1) ^ var5) - var5) >>> 11) - var5) - 18165) + var5) ^ var5) - var5) + var5) - var5) >>> 5) << 12) ^ 19035));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) << 8) ^ var5) + var5))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) << 8) ^ var5) + var5))) << 2) << 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) << 8) ^ var5) + var5))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ '鞡') + 7634)) + var5) << 8) ^ var5) + var5))) << 2) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   void iIlIlllllill() {
      long var4 = 5806473689136608980L;
      this.llIiliillilIiliill = this.iIIiliillIlIiliill;
      if (lIiiIiIlilli<invokedynamic>().equals(this.iIIiliillIlIiliill)) {
         String[] var1 = this.lIIIiiilliIIIiiill.IIiilIIIilIiilIIIi.IlIiillIii() ? ilillllIiillll.iIIilIIIiIlIilIIIi : ilillllIiillll.IiIilIIIiliIilIIIi;
         this.llIiliillilIiliill = var1[Math.floorMod(this.illiliillIililiill, var1.length)];
      }

      this.IiIiliillliIiliill = null;
      this.iiIiliillIIliliill = null;
      this.Iiiiliillliiiliill = List.of();
      this.iiiiliillIIIIiiill = List.of();
      this.lililiilliililiill = 0;
      this.IIiiliilllIiiliill = 0;
      iiIiliiIIlilii var6 = ilillllIiillll.IiIilliIil(this.llIiliillilIiliill);
      if (var6 != null) {
         List var2 = llIiilIiilIiilIi.IiIlliIliiIl(var6);
         this.IIiiliilllIiiliill = var2.size();
         if (this.IIiiliilllIiiliill > 0) {
            this.lililiilliililiill = Math.floorMod(lIiiIiIlilli<invokedynamic>().equals(this.iIIiliillIlIiliill) ? this.illiliillIililiill / ilillllIiillll.iIIilIIIiIlIilIIIi.length : this.illiliillIililiill, this.IIiiliilllIiiliill);
            this.IiIiliillliIiliill = (String)var2.get(this.lililiilliililiill);
            this.Illiliillllliliill = llIiilIiilIiilIi.Illlllllilll(var6, this.IiIiliillliIiliill);
            this.Iiiiliillliiiliill = llIiilIiilIiilIi.IIillIiliIil(var6, this.IiIiliillliIiliill);
         } else {
            this.Illiliillllliliill = IIlllIIilIlllIIi.lilliiilli(lIiiIiIlilli<invokedynamic>());
         }
      } else if (iliiiIiiii.lIiiIiIlilli(this.llIiliillilIiliill)) {
         this.iiIiliillIIliliill = IIlllIIilIlllIIi.IIililIili(this.llIiliillilIiliill);
         this.Illiliillllliliill = IIlllIIilIlllIIi.lilliiilli(this.llIiliillilIiliill);
         this.iiiiliillIIIIiiill = iilliliIIilili.IilliliilIIi(this.llIiliillilIiliill, this.iiIiliillIIliliill, (double)this.Illiliillllliliill);
      } else {
         this.Illiliillllliliill = IIlllIIilIlllIIi.lilliiilli(this.llIiliillilIiliill);
      }

      var4 ^= ((long)(this.Iiiiliillliiiliill.isEmpty() ? this.iiiiliillIIIIiiill.size() : this.Iiiiliillliiiliill.size()) << 32 ^ var4) & -1L << 32;
      this.lliiliilliliiliill = (int)(var4 >>> 32) == 0 ? ilillllIiillll.iiIilIIIiIIlilIIIi : new float[(int)(var4 >>> 32)];

      for(long var8 = var4 ^ (0L ^ var4) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         this.lliiliilliliiliill[(int)var8] = this.Iiiiliillliiiliill.isEmpty() ? ((iIIIIIliIlIIIIli)this.iiiiliillIIIIiiill.get((int)var8)).IliIlllilIi() * this.Illiliillllliliill : ((iIiiiilIliiiil)this.Iiiiliillliiiliill.get((int)var8)).IliIlllilIi();
      }

      this.iIiiliillIliiliill = IIiiIIlilIiiIIli.IilliliilIIi();
   }

   void liiiIIllIl(float dt) {
      iiIiliiIIlilii var2 = ilillllIiillll.IiIilliIil(this.llIiliillilIiliill);
      if (var2 != null && this.IiIiliillliIiliill == null && llIiilIiilIiilIi.lIiiIiIlilli(var2)) {
         this.lIliliilliIliliill = 0.0F;
         this.iIlIlllllill();
         if (this == this.lIIIiiilliIIIiiill.lliilIIIiiliilIIIi[Math.max(0, this.lIIIiiilliIIIiiill.lIiIiIIIiiIiIiIIIi)]) {
            ilillllIiillll.Illillllil(this.lIIIiiilliIIIiiill).Ililllililil();
         }
      }

      this.lIliliilliIliliill += dt;
      float var3 = 0.35F + this.Illiliillllliliill + 0.8F;
      if (this.lIliliilliIliliill >= var3) {
         this.lIliliilliIliliill -= var3;
         ++this.illiliillIililiill;
         String var4 = this.llIiliillilIiliill;
         this.iIlIlllllill();
         if (!Objects.equals(var4, this.llIiliillilIiliill) && this.lIIIiiilliIIIiiill.lIiIiIIIiiIiIiIIIi >= 0 && this == this.lIIIiiilliIIIiiill.lliilIIIiiliilIIIi[this.lIIIiiilliIIIiiill.lIiIiIIIiiIiIiIIIi]) {
            ilillllIiillll.illilIilil(this.lIIIiiilliIIIiiill).Ililllililil();
         }
      }

   }
}
