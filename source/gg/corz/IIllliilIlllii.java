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

enum IIllliilIlllii {
   ilIlIliIIl,
   llIlIliIIl,
   iIIlIliIIl,
   IiIlIliIIl,
   IlIlIliIIl,
   liIlIliIIl,
   lIIlIliIIl;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7703260691308968834L ^ Long.rotateLeft(-3205952350698649852L, 14) ^ 116316772226423820L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1372161988934408812L ^ Long.rotateLeft(-7672136539088625563L, 8) ^ -3605075585502900910L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7897021491560759216L ^ Long.rotateLeft(280098649339134764L, 2) ^ -7963398704272479449L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1038595011819636203L ^ Long.rotateLeft(8096657620660331352L, 48) ^ -3115047746124649999L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6762449914716278887L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1331407613562759285L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 569283379417900786L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6061927288282021845L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 880490226425687952L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1587557499995706554L;
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 16151) >>> 2 | (char)(var4[var5] ^ 16151) << 14) >>> 14 | (char)((char)(var4[var5] ^ 16151) >>> 2 | (char)(var4[var5] ^ 16151) << 14) << 2))) ^ var5) >>> 2 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 16151) >>> 2 | (char)(var4[var5] ^ 16151) << 14) >>> 14 | (char)((char)(var4[var5] ^ 16151) >>> 2 | (char)(var4[var5] ^ 16151) << 14) << 2))) ^ var5) << 14) - var5) ^ var5) - var5) - var5) + var5) - var5))) + var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) >>> 10 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) << 6))) >>> 11 | (char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) >>> 10 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) << 6))) << 5))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) >>> 10 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) << 6))) >>> 11 | (char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) >>> 10 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 31573) ^ 25739) - var5) ^ '낎'))))) ^ var5) << 6))) << 5))) << 11) - '酙') + var5) + var5) ^ '胁'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static IIllliilIlllii[] IliIlllilIi() {
      IIllliilIlllii[] var10000 = new IIllliilIlllii[(-1010064397 + 57 >>> 15 | -1010064397 + 57 << 17) ^ 1213826960];
      var10000[0] = lIIlIliIIl;
      var10000[1] = iIIlIliIIl;
      var10000[2] = IlIlIliIIl;
      var10000[3] = llIlIliIIl;
      var10000[4] = ilIlIliIIl;
      var10000[5] = IiIlIliIIl;
      var10000[(-(1315916314 - -75) >>> 15 | -(1315916314 - -75) << 17) * -723362913 ^ 516246649] = liIlIliIIl;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) >>> 9))))) >>> 14 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) >>> 9))))) << 2) << 7 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) >>> 9))))) >>> 14 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + 7706) >>> 1 | (char)((char)((char)(var4[var5] + var5) + var5) + 7706) << 15) + '\uf32c') - var5) << 4) >>> 9))))) << 2) >>> 9) + var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ '옟') + var5))) + 7535))) ^ '\uf6de') - 20202) + 'ﲪ') ^ '覆'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') >>> 5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') >>> 5) << 11) ^ var5) + '\ud87a') + 21053) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') >>> 5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) << 4 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - var5) ^ '뷳') ^ 14653) >>> 12) ^ '\ua63d') >>> 5) << 11) ^ var5) + '\ud87a') + 21053) + var5) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
