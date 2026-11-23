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

public enum lliIiIIliliIiIIl {
   IIIllIilIl(iIlIlllllill<invokedynamic>()),
   ilIllIilIl(iIlIlllllill<invokedynamic>()),
   iIIllIilIl(iIlIlllllill<invokedynamic>()),
   lIIllIilIl(iIlIlllllill<invokedynamic>()),
   IlIllIilIl(iIlIlllllill<invokedynamic>()),
   IiIllIilIl(iIlIlllllill<invokedynamic>()),
   llIllIilIl(iIlIlllllill<invokedynamic>());

   public final String liIllIilIl;

   public static lliIiIIliliIiIIl IliIlllilIi(String name) {
      long var5 = -5842039592053430014L;
      if (name != null) {
         lliIiIIliliIiIIl[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            lliIiIIliliIiIIl var4 = var1[(int)var8];
            if (var4.name().equalsIgnoreCase(name)) {
               return var4;
            }
         }
      }

      return IIIllIilIl;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2539198706740714471L ^ Long.rotateLeft(-5002567096990524772L, 29) ^ -459627611606175080L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2505285285428489222L ^ Long.rotateLeft(5179317674755296771L, 25) ^ -3565765504185359432L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7246698981260907167L ^ Long.rotateLeft(-8653405246674367844L, 48) ^ -4044945024262046911L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6593225469690167703L ^ Long.rotateLeft(7745166544976607790L, 59) ^ 158370964731270302L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8823030996911504689L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3046165829519352439L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1139937592460864856L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6541151663753383136L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5409397113131111L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4682566831491951292L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIllIIliIIl<invokedynamic>());
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 8438) - var5))) ^ var5) - '갿') + '똺') - 3148) ^ 16614) >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 8438) - var5))) ^ var5) - '갿') + '똺') - 3148) ^ 16614) << 4) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 8438) - var5))) ^ var5) - '갿') + '똺') - 3148) ^ 16614) >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 8438) - var5))) ^ var5) - '갿') + '똺') - 3148) ^ 16614) << 4) << 10) ^ '솥'))) ^ '둥') + 5865) + '뽒'));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 25911) + var5) + 9213) - '\uea58') ^ var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] + 25911) + var5) + 9213) - '\uea58') ^ var5) - var5) >>> 11) ^ '\uddfb') + var5) + '뎠') - 22485) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 25911) + var5) + 9213) - '\uea58') ^ var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] + 25911) + var5) + 9213) - '\uea58') ^ var5) - var5) >>> 11) ^ '\uddfb') + var5) + '뎠') - 22485) >>> 6) ^ 6433) - var5))) ^ '빕') + var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) - 25515) + var5) ^ 30723) ^ '闚'))) ^ 28480) ^ var5) ^ var5) ^ '릞') - '軏') - '핔'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ '\ue8b7') ^ '雮') + '겂') ^ 25374))))) << 2 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ '\ue8b7') ^ '雮') + '겂') ^ 25374))))) >>> 14) ^ 5215) - 2006) << 12 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ '\ue8b7') ^ '雮') + '겂') ^ 25374))))) << 2 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ '\ue8b7') ^ '雮') + '겂') ^ 25374))))) >>> 14) ^ 5215) - 2006) >>> 4) - 7728) - 1181) - var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) + var5)) ^ var5) + var5))) - var5) + var5) - 'ﵷ'))))) - 5024) >>> 2 | (char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) + var5)) ^ var5) + var5))) - var5) + var5) - 'ﵷ'))))) - 5024) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static lliIiIIliliIiIIl[] liiiIIllIl() {
      return new lliIiIIliliIiIIl[]{IIIllIilIl, lIIllIilIl, iIIllIilIl, IlIllIilIl, llIllIilIl, ilIllIilIl, IiIllIilIl};
   }

   private lliIiIIliliIiIIl(String var3) {
      this.liIllIilIl = var3;
   }
}
