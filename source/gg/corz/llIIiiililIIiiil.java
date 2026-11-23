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

public enum llIIiiililIIiiil {
   iiIliIIiil,
   lilliIIiil,
   iIlliIIiil,
   iIiliIIiil,
   IIiliIIiil,
   ililiIIiil,
   lllliIIiil,
   liIliIIiil,
   IIlliIIiil,
   lIiliIIiil,
   lliliIIiil,
   iilliIIiil,
   IilliIIiil,
   IliliIIiil,
   iiiliIIiil,
   liiliIIiil,
   IllliIIiil,
   lIlliIIiil,
   illliIIiil,
   IiiliIIiil;

   // $FF: synthetic method
   private static llIIiiililIIiiil[] liiiIIllIl() {
      return new llIIiiililIIiiil[]{liIliIIiil, iiIliIIiil, IIlliIIiil, lIlliIIiil, iIlliIIiil, IllliIIiil, lllliIIiil, illliIIiil, IilliIIiil, lilliIIiil, iilliIIiil, IIiliIIiil, lIiliIIiil, iIiliIIiil, IliliIIiil, lliliIIiil, ililiIIiil, IiiliIIiil, liiliIIiil, iiiliIIiil};
   }

   public boolean IliIlllilIi() {
      return this.ordinal() <= lllliIIiil.ordinal();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 17005) - '\ue9c6') ^ var5) ^ '\uefbf') + var5)) ^ var5) + var5) - '鼣') + 21517) + 16603) + 20959) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 17005) - '\ue9c6') ^ var5) ^ '\uefbf') + var5)) ^ var5) + var5) - '鼣') + 21517) + 16603) + 20959) << 13) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 17005) - '\ue9c6') ^ var5) ^ '\uefbf') + var5)) ^ var5) + var5) - '鼣') + 21517) + 16603) + 20959) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 17005) - '\ue9c6') ^ var5) ^ '\uefbf') + var5)) ^ var5) + var5) - '鼣') + 21517) + 16603) + 20959) << 13) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2778076480040958835L ^ Long.rotateLeft(2307256777670170470L, 2) ^ 1795330400495220955L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8451352307010165705L ^ Long.rotateLeft(8606641212888451054L, 44) ^ -3187762060523384991L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7308833388381813104L ^ Long.rotateLeft(1425562352270409843L, 11) ^ 2941647537943359840L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5303575414503574321L ^ Long.rotateLeft(-9165622673615669920L, 43) ^ -1768483675757028256L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 9015204104924548809L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6013165994129717489L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1428816670509702554L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1458315659001530858L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1985275700263041265L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8926319394333240668L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIllIIliIIl<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) ^ var5) ^ 26200) - '\ue369') - var5) - 22338) ^ 14458) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) ^ var5) ^ 26200) - '\ue369') - var5) - 22338) ^ 14458) >>> 8) ^ '錸'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) >>> 11) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) >>> 11) << 13) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) >>> 11) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') << 14 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - 22097) ^ '츪') + 4906))) - var5) ^ 16982))) + 'ꦞ') + '\uf1c5') >>> 2) + '뀺') + var5) - var5) ^ var5) >>> 11) << 13) << 2) ^ var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) << 10 | (char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) >>> 6) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) << 10 | (char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) >>> 6) << 11))) - var5))))) - var5) ^ 17022) + '\ud917') >>> 7 | (char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) << 10 | (char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) >>> 6) >>> 5 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) << 10 | (char)((char)(-((char)((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2) + '\ue4af'))) + var5) >>> 6) << 11))) - var5))))) - var5) ^ 17022) + '\ud917') << 9));
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
         var4[var5] = (char)((char)(~((char)(~((char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '茣') - var5) + var5) - '銅') + '鲜'))) - 4141))) >>> 3 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '茣') - var5) + var5) - '銅') + '鲜'))) - 4141))) << 13))) >>> 7 | (char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '茣') - var5) + var5) - '銅') + '鲜'))) - 4141))) >>> 3 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '茣') - var5) + var5) - '銅') + '鲜'))) - 4141))) << 13))) << 9))))))) ^ '菠'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
