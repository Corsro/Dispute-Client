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

public enum iiIIIilIIlIIil {
   iliiillIiIiiiillIi,
   IliiillIilliiillIi,
   IIIIIilIilIIIIilIi,
   iIIIIilIiIlIIIilIi,
   liiiillIiiiiiillIi;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -577414566752464043L ^ Long.rotateLeft(1418435088291282931L, 14) ^ -4915277119105589671L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6845984003208915964L ^ Long.rotateLeft(-2299005070115609733L, 3) ^ 4038557306729019876L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2349783166724277266L ^ Long.rotateLeft(-7195241678323156249L, 23) ^ 7783101119954906250L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8653082778977114564L ^ Long.rotateLeft(-7845583903661770525L, 7) ^ -5200618450484854859L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2046194917558314231L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5279215315273749268L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6745756988019058438L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6056412690209818583L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3114564822758329744L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5241006392233439497L;
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '褻') ^ var5) - '麀') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '褻') ^ var5) - '麀') ^ var5) << 5) ^ var5) - var5) + 32293) ^ '낏') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '褻') ^ var5) - '麀') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '褻') ^ var5) - '麀') ^ var5) << 5) ^ var5) - var5) + 32293) ^ '낏') << 7) + '頫'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 7 | (char)(var4[var5] - var5) << 9) - 29662))))) ^ 3276) + '阸') ^ '\udb6c') << 10 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 7 | (char)(var4[var5] - var5) << 9) - 29662))))) ^ 3276) + '阸') ^ '\udb6c') >>> 6) - 21847) + 2476) ^ var5) - var5) + var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 7 | (char)(var4[var5] - var5) << 9) - 29662))))) ^ 3276) + '阸') ^ '\udb6c') << 10 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 7 | (char)(var4[var5] - var5) << 9) - 29662))))) ^ 3276) + '阸') ^ '\udb6c') >>> 6) - 21847) + 2476) ^ var5) - var5) + var5) << 14) + var5) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static iiIIIilIIlIIil[] IliIlllilIi() {
      return new iiIIIilIIlIIil[]{IliiillIilliiillIi, iliiillIiIiiiillIi, liiiillIiiiiiillIi, IIIIIilIilIIIIilIi, iIIIIilIiIlIIIilIi};
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 31103) - var5) - 4398) - '똢') >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 31103) - var5) - 4398) - '똢') << 12) ^ var5) - '\ue2ad') - var5) - '펃'))))))));
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
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') << 14 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') >>> 2) >>> 11 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') << 14 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') >>> 2) << 5))) - 21813) << 9 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') << 14 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') >>> 2) >>> 11 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') << 14 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ 30671) >>> 6 | (char)(var4[var5] ^ 30671) << 10))) ^ var5) + 10865))) - 6552) ^ var5))) ^ '觭') - '쭠') >>> 2) << 5))) - 21813) >>> 7))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16510) + 20406) - '﵈') + 'Ａ') ^ var5) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] ^ 16510) + 20406) - '﵈') + 'Ａ') ^ var5) << 10))) ^ '뮱') ^ 14020) ^ 3632) - var5) ^ 26770));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
