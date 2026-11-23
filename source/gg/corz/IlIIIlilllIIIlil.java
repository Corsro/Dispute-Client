package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum IlIIIlilllIIIlil {
   liiIiilIil,
   IiiIiilIil,
   iliIiilIil;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) - '룾') << 4 | (char)((char)(var4[var5] + var5) - '룾') >>> 12))) ^ '蜵') - 1441) - '\ua7eb') >>> 13 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) - '룾') << 4 | (char)((char)(var4[var5] + var5) - '룾') >>> 12))) ^ '蜵') - 1441) - '\ua7eb') << 3))))) ^ var5) - '멑'))) - var5) >>> 5 | (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) - '룾') << 4 | (char)((char)(var4[var5] + var5) - '룾') >>> 12))) ^ '蜵') - 1441) - '\ua7eb') >>> 13 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) - '룾') << 4 | (char)((char)(var4[var5] + var5) - '룾') >>> 12))) ^ '蜵') - 1441) - '\ua7eb') << 3))))) ^ var5) - '멑'))) - var5) << 11) ^ '쳖'))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4523377247832939121L ^ Long.rotateLeft(-4758731280605309989L, 18) ^ -8766438672755288535L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7115672799260086129L ^ Long.rotateLeft(-1954135575405087016L, 30) ^ -7920268324330386225L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2720122874868743580L ^ Long.rotateLeft(-8273720942636740456L, 14) ^ 2807660994888942268L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1916773957399114229L ^ Long.rotateLeft(7108004106199985254L, 15) ^ 5243833748284198071L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5504871631501545888L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4586216328685937070L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -10986924824168851L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4705768341659598098L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5847756294099336336L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -886755399990420859L;
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

   public static IlIIIlilllIIIlil IliIlllilIi(String setting) {
      long var3 = 6575629930053438273L;
      if (setting == null) {
         return iliIiilIil;
      } else {
         String var1 = setting.trim().toLowerCase(Locale.ROOT);
         var3 ^= (-4294967296L ^ var3) & -1L << 32;
         switch (var1.hashCode()) {
            case -1924829944:
               if (var1.equals(iIlIlllllill<invokedynamic>())) {
                  var3 ^= (0L ^ var3) & -1L << 32;
               }
               break;
            case 553970892:
               if (var1.equals(iIlIlllllill<invokedynamic>())) {
                  var3 ^= (4294967296L ^ var3) & -1L << 32;
               }
         }

         IlIIIlilllIIIlil var10000;
         switch ((int)(var3 >>> 32)) {
            case 0 -> var10000 = IiiIiilIil;
            case 1 -> var10000 = liiIiilIil;
            default -> var10000 = iliIiilIil;
         }

         return var10000;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ 25837))) >>> 12 | (char)(-((char)(var4[var5] ^ 25837))) << 4) >>> 4 | (char)((char)(-((char)(var4[var5] ^ 25837))) >>> 12 | (char)(-((char)(var4[var5] ^ 25837))) << 4) << 12) - var5))) + var5) ^ '蹩') + var5) ^ var5) + var5) + '뿴') + var5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ 25837))) >>> 12 | (char)(-((char)(var4[var5] ^ 25837))) << 4) >>> 4 | (char)((char)(-((char)(var4[var5] ^ 25837))) >>> 12 | (char)(-((char)(var4[var5] ^ 25837))) << 4) << 12) - var5))) + var5) ^ '蹩') + var5) ^ var5) + var5) + '뿴') + var5) - var5) >>> 11))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 5001) - var5) >>> 7 | (char)((char)(var4[var5] + 5001) - var5) << 9) + var5) ^ var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] + 5001) - var5) >>> 7 | (char)((char)(var4[var5] + 5001) - var5) << 9) + var5) ^ var5) >>> 6))) + var5) + '胦') >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 5001) - var5) >>> 7 | (char)((char)(var4[var5] + 5001) - var5) << 9) + var5) ^ var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] + 5001) - var5) >>> 7 | (char)((char)(var4[var5] + 5001) - var5) << 9) + var5) ^ var5) >>> 6))) + var5) + '胦') << 15) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static IlIIIlilllIIIlil[] liiiIIllIl() {
      return new IlIIIlilllIIIlil[]{iliIiilIil, IiiIiilIil, liiIiilIil};
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '谽') + 29596) + var5) ^ var5) + 'ﵗ'))) ^ var5) << 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '谽') + 29596) + var5) ^ var5) + 'ﵗ'))) ^ var5) >>> 5) - var5) ^ 25132) + '镕') - var5) + '쨟') + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 'ꑇ') + var5) << 11 | (char)((char)((char)(var4[var5] ^ var5) ^ 'ꑇ') + var5) >>> 5) - var5) ^ var5)))) ^ var5) - 21952) - var5) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 'ꑇ') + var5) << 11 | (char)((char)((char)(var4[var5] ^ var5) ^ 'ꑇ') + var5) >>> 5) - var5) ^ var5)))) ^ var5) - 21952) - var5) << 8) - '엥'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
