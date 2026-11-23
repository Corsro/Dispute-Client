package gg.corz;

import java.awt.Color;
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

public enum iIIlIillIlIlIill {
   iliiillill,
   iiiiillill,
   Iiiiillill,
   liiiillill;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) << 13) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) << 13) << 11) + '觪') ^ var5))) << 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) << 13) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '븩') + '鷛') ^ var5) + var5) - 10854) ^ var5) << 13) << 11) + '觪') ^ var5))) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static iIIlIillIlIlIill[] liiiIIllIl() {
      return new iIIlIillIlIlIill[]{iliiillill, Iiiiillill, liiiillill, iiiiillill};
   }

   public Color IliIlllilIi() {
      Color var10000;
      switch (this.ordinal()) {
         case 1 -> var10000 = new Color(255, 255, 0);
         case 2 -> var10000 = new Color(255, 165, 0);
         case 3 -> var10000 = new Color(255, 50, 50);
         default -> var10000 = new Color(200, 200, 200);
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1540827575328291625L ^ Long.rotateLeft(-4230548267273373868L, 26) ^ 5024139396807197906L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2566601150950342589L ^ Long.rotateLeft(-3859911731693251654L, 42) ^ -5370502610816361650L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7984528246397480865L ^ Long.rotateLeft(-55336724360138117L, 9) ^ -551766585728925026L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8779269762680753927L ^ Long.rotateLeft(-2389510294194953850L, 14) ^ -5521366755562375426L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4618605163881543210L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9203225944315911777L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8976280138062768255L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1785856064856823151L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8093946915147956313L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2390788752952708236L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '跠') - var5)) - 8889) + 9884) - var5) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - '跠') - var5)) - 8889) + 9884) - var5) + var5) << 5) - var5) + var5) - var5) ^ var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 15 | (char)(~((char)(var4[var5] - var5))) >>> 1) + var5) ^ var5) ^ var5) + var5) - 14063) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 15 | (char)(~((char)(var4[var5] - var5))) >>> 1) + var5) ^ var5) ^ var5) + var5) - 14063) << 13))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ var5) ^ '숺') + '탘') - var5))) + '\ue094') ^ var5) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ var5) ^ '숺') + '탘') - var5))) + '\ue094') ^ var5) >>> 12) + var5) + '쏸') ^ '풫'));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) << 10) - 12710))))) << 12 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) << 10) - 12710))))) >>> 4) - 'ｘ') << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) << 10) - 12710))))) << 12 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) ^ var5))) - '鸚') + var5) ^ '꘏') - var5) - '饕') << 4) << 10) - 12710))))) >>> 4) - 'ｘ') >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
