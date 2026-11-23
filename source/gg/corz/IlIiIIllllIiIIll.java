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

public enum IlIiIIllllIiIIll {
   iilllIllll,
   lilllIllll,
   IIillIllll;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -724466970779196343L ^ Long.rotateLeft(-5360079322851522512L, 54) ^ 7723990144296380456L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4054794829571999746L ^ Long.rotateLeft(3017857583242332930L, 1) ^ -2241481690873805123L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2918991547382096863L ^ Long.rotateLeft(3148609161962403750L, 33) ^ 5090140697369924374L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1263006318365928415L ^ Long.rotateLeft(-668037643208641276L, 56) ^ 8199242818952661310L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4581416055702487277L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7749308980940657802L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8320545860697402866L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5835878667314815081L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1973338188543936247L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1662328581297334801L;
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
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - '\udcc3') - var5))) + '늂') - var5) + var5) + 18204))))) ^ 23320) ^ 23107))) - '\uf2e1') + '蹊') >>> 5 | (char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - '\udcc3') - var5))) + '늂') - var5) + var5) + 18204))))) ^ 23320) ^ 23107))) - '\uf2e1') + '蹊') << 11))))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') >>> 14) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') >>> 14) << 11))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') >>> 14) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - var5) - var5) >>> 5) ^ '酮') >>> 14) << 11))) << 10) + var5) - var5) ^ '볉') + var5) - '駏') + 12210) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static IlIiIIllllIiIIll[] IliIlllilIi() {
      return new IlIiIIllllIiIIll[]{lilllIllll, iilllIllll, IIillIllll};
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ 21475) - 25854) ^ var5) + var5))) ^ 31041) - 21672) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) << 7) + var5) - 28217) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) << 7) + var5) - 28217) ^ var5) << 1) - var5) ^ '착') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) << 7) + var5) - 28217) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) << 13 | (char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ '表') + '킮') + 11246) >>> 3) + 2866) + 22991) ^ 5595) - 15670))) << 7) + var5) - 28217) ^ var5) << 1) - var5) ^ '착') << 10));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) >>> 2 | (char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) << 14) + var5) + '＜') + var5) - '臑') ^ var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) >>> 2 | (char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) << 14) + var5) + '＜') + var5) - '臑') ^ var5) + var5) << 13) + 21977) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) >>> 2 | (char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) << 14) + var5) + '＜') + var5) - '臑') ^ var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) >>> 2 | (char)((char)(var4[var5] ^ '\uf2ef') >>> 9 | (char)(var4[var5] ^ '\uf2ef') << 7) << 14) + var5) + '＜') + var5) - '臑') ^ var5) + var5) << 13) + 21977) << 15) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
