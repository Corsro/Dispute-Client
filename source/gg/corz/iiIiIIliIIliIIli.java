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

enum iiIiIIliIIliIIli {
   lIIlIiIlIi,
   IiIlIiIlIi,
   ilIlIiIlIi,
   IIIlIiIlIi,
   liIlIiIlIi,
   IlIlIiIlIi,
   iIIlIiIlIi,
   llIlIiIlIi;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) + var5))) << 9 | (char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) + var5))) >>> 7) ^ var5))) ^ '꿏') ^ '鈯') ^ var5) ^ '븗') - 17343) - '梁'));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 13298) - var5) - '롌') >>> 5 | (char)((char)((char)(var4[var5] + 13298) - var5) - '롌') << 11) - '\ueb19') + '썹') - var5) - var5))) - var5) + 25343))))) ^ 2436) ^ var5))) ^ 9445));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) >>> 5 | (char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) << 11) >>> 4 | (char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) >>> 5 | (char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) << 11) << 12) << 8 | (char)((char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) >>> 5 | (char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) << 11) >>> 4 | (char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) >>> 5 | (char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) << 15 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 1 | (char)(var4[var5] >>> 10 | var4[var5] << 6) << 15) - 852) >>> 1))) + 8866))))))) + var5) << 11) << 12) >>> 8));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '來') >>> 8 | (char)(var4[var5] - '來') << 8))) + 8524) - '죕') ^ var5) ^ 28153) + var5) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '來') >>> 8 | (char)(var4[var5] - '來') << 8))) + 8524) - '죕') ^ var5) ^ 28153) + var5) + var5) + var5) - var5) >>> 13));
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
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ 20591) ^ 24683) ^ var5))) - '銤'))) + 'ꃺ') ^ 5649) << 13 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ 20591) ^ 24683) ^ var5))) - '銤'))) + 'ꃺ') ^ 5649) >>> 3))))) + '굝'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static iiIiIIliIIliIIli[] IliIlllilIi() {
      iiIiIIliIIliIIli[] var10000 = new iiIiIIliIIliIIli[-1848099016 * 1736263375 * -128207979 + 39 ^ 1444972551];
      var10000[0] = IIIlIiIlIi;
      var10000[1] = lIIlIiIlIi;
      var10000[2] = iIIlIiIlIi;
      var10000[3] = IlIlIiIlIi;
      var10000[4] = llIlIiIlIi;
      var10000[5] = ilIlIiIlIi;
      var10000[~(851858775 * 286331153 * 33) - 73 ^ 1874089225] = IiIlIiIlIi;
      var10000[(~471957406 >>> 13 | ~471957406 << 19) ^ 51322611] = liIlIiIlIi;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7528928435850882557L ^ Long.rotateLeft(8278449581360325838L, 38) ^ 2663598698265760840L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3422397595765859302L ^ Long.rotateLeft(1990719289318246390L, 3) ^ -8526000998008638613L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5098050301890860279L ^ Long.rotateLeft(292226320559996979L, 38) ^ 7305221605666659310L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1090225646448922380L ^ Long.rotateLeft(-6752185194279904781L, 26) ^ 3099785828496956045L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6834648930873969867L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2333905475689256910L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5968520184010576204L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3411991523095939323L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4964962460274031851L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7396702725366121387L;
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
}
