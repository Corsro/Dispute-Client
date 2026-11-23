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

public enum iIillilIlillil {
   IliilIIlilliilIIli,
   lllilIIliillilIIli,
   lIiilIIliiIiilIIli,
   IililIIlilililIIli,
   iililIIliIIiilIIli;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) + var5) + var5))) ^ var5) << 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) + var5) + var5))) ^ var5) >>> 8) - var5) - var5) ^ 19745))) + var5) + var5) ^ var5) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) + var5) + var5))) ^ var5) << 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) + var5) + var5))) ^ var5) >>> 8) - var5) - var5) ^ 19745))) + var5) + var5) ^ var5) << 3) - '둫'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] ^ 'ꆯ'))) ^ 25435) - '詭') << 14 | (char)((char)((char)(-((char)((char)var4[var5] ^ 'ꆯ'))) ^ 25435) - '詭') >>> 2) ^ '\ue4c5')) - 24826))) ^ var5) - var5) ^ var5) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] ^ 'ꆯ'))) ^ 25435) - '詭') << 14 | (char)((char)((char)(-((char)((char)var4[var5] ^ 'ꆯ'))) ^ 25435) - '詭') >>> 2) ^ '\ue4c5')) - 24826))) ^ var5) - var5) ^ var5) << 10) - var5) + var5) + var5) ^ var5));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(~((char)(var4[var5] ^ '읢'))))))))) + var5)) - var5) + var5) ^ '\uf1cf') >>> 7 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(~((char)(var4[var5] ^ '읢'))))))))) + var5)) - var5) + var5) ^ '\uf1cf') << 9))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1734883458129253911L ^ Long.rotateLeft(5451566140862080469L, 51) ^ -1904447830921221120L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4228878028929806654L ^ Long.rotateLeft(8503046878945192139L, 46) ^ -4956112084863783501L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5347004645361790269L ^ Long.rotateLeft(6414371930114471178L, 36) ^ 7786867138715502887L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6271701843570463585L ^ Long.rotateLeft(-7486882196096359548L, 56) ^ -8375066430517162022L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3330278872628362540L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1654952642214981587L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1124001754065965198L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7710057274970555944L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8079527197395206438L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8253932864285614520L;
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
   private static iIillilIlillil[] IliIlllilIi() {
      return new iIillilIlillil[]{lllilIIliillilIIli, IililIIlilililIIli, iililIIliIIiilIIli, lIiilIIliiIiilIIli, IliilIIlilliilIIli};
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') << 6) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') << 6) >>> 12) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') << 6) << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) >>> 3 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ 18508))))))) ^ var5) - 22876) + var5) << 13) - '\uec0d') << 6) >>> 12) >>> 5) - '\uf29e'))) - '蠟') - 11296) - var5) - '\ufb12'));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) << 10 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) >>> 6) - '꼊') - var5) >>> 4 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) << 10 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) >>> 6) - '꼊') - var5) << 12))) >>> 7 | (char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) << 10 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) >>> 6) - '꼊') - var5) >>> 4 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) << 10 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 16673) + var5))) - 4423) - '푶') ^ 'ꪓ') + 28216) << 14) - var5))))) >>> 6) - '꼊') - var5) << 12))) << 9) ^ 25129));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
