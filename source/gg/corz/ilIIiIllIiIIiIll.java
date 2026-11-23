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

public enum ilIIiIllIiIIiIll {
   Iiilllilll,
   liilllilll,
   iiilllilll,
   llilllilll,
   ililllilll,
   IIIillilll;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 5158))) >>> 6 | (char)(~((char)(var4[var5] ^ 5158))) << 10) ^ var5) ^ var5) ^ var5) + '譗'))) ^ var5))) - '쿜') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static ilIIiIllIiIIiIll[] IliIlllilIi() {
      ilIIiIllIiIIiIll[] var10000 = new ilIIiIllIiIIiIll[(~(~181542819) >>> 31 | ~(~181542819) << 1) * 123 ^ 1709860516];
      var10000[0] = llilllilll;
      var10000[1] = ililllilll;
      var10000[2] = Iiilllilll;
      var10000[3] = liilllilll;
      var10000[4] = iiilllilll;
      var10000[5] = IIIillilll;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) << 2 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) >>> 14) >>> 2 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) << 2 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) >>> 14) << 14) ^ var5) + 30377) ^ '\ueeb6'))) + '즟') ^ 2551) - 12038) - var5) >>> 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) << 2 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) >>> 14) >>> 2 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) << 2 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\uf611') >>> 10 | (char)(var4[var5] + '\uf611') << 6))) - 17651))) - 20184) >>> 14) << 14) ^ var5) + 30377) ^ '\ueeb6'))) + '즟') ^ 2551) - 12038) - var5) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3958108279969827730L ^ Long.rotateLeft(1610594673764268042L, 48) ^ -3574354753928590262L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6242225202107634106L ^ Long.rotateLeft(8146510176681836969L, 19) ^ 2046040350841588553L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4543215960772337577L ^ Long.rotateLeft(-8847615824202911380L, 51) ^ 4331818121098319824L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9171786724891129705L ^ Long.rotateLeft(-418439859643779020L, 37) ^ -2713265481056925807L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 80357564516686687L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6303784359230487080L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4130902215304111568L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3699975531279217725L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1425926854904696213L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4300222131660498129L;
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) << 2 | (char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) >>> 14))))) + var5) - 13918) - '鸺') >>> 9 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) << 2 | (char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) >>> 14))))) + var5) - 13918) - '鸺') << 7) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) << 2 | (char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) >>> 14))))) + var5) - 13918) - '鸺') >>> 9 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) << 2 | (char)((char)((char)(var4[var5] ^ 31687) >>> 4 | (char)(var4[var5] ^ 31687) << 12) ^ 2572) >>> 14))))) + var5) - 13918) - '鸺') << 7) ^ var5) << 14) + var5));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + var5) - 6218) << 8 | (char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + var5) - 6218) >>> 8) ^ var5) ^ '\udf3d'))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + var5) - 6218) << 8 | (char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + var5) - 6218) >>> 8) ^ var5) ^ '\udf3d'))) >>> 7));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '\uf3b5') + 31530))) ^ var5) ^ 27084) ^ var5))) << 9 | (char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '\uf3b5') + 31530))) ^ var5) ^ 27084) ^ var5))) >>> 7) + var5) ^ '\uea20') - var5) + 7008))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
