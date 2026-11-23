package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class lIIIiIiiIIIiIi {
   final TreeMap<Float, Float> llllllliiillllllii = new TreeMap();

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) << 9) + 27986) + '\ue661') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) << 9) + 27986) + '\ue661') << 4) ^ var5) + var5) - 26535) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) << 9) + 27986) + '\ue661') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '芏') ^ var5) - var5) >>> 5) << 9) + 27986) + '\ue661') << 4) ^ var5) + var5) - 26535) >>> 14))) + 25596));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIIIiIiiIIIiIi() {
   }

   lIIIiIiiIIIiIi IliIlllilIi(float t, float v) {
      if (this.llllllliiillllllii.put(t, v) != null) {
         throw new IllegalStateException(iIlIlllllill<invokedynamic>() + t);
      } else {
         return this;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6727474375131467087L ^ Long.rotateLeft(9134681200827739138L, 2) ^ -6229242648851136605L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2416167031186433625L ^ Long.rotateLeft(2499442610059399424L, 45) ^ -3947592095382166573L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3219434257625121989L ^ Long.rotateLeft(-8336809687831010983L, 35) ^ -2036389206694381532L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1636962129743116739L ^ Long.rotateLeft(-1145811877418705139L, 20) ^ 7570234932959893332L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -536715413315305254L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2099005803598951667L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6928114676315334697L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -72445799392789125L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3764082537424898983L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 492489441559217933L;
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

   void liiiIIllIl(iliiiIiiii ch, int c, float end) {
      float[] var4 = new float[this.llllllliiillllllii.size() * 2];
      int var5 = 0;

      for(Map.Entry var7 : this.llllllliiillllllii.entrySet()) {
         var4[var5++] = (Float)var7.getKey() / end;
         var4[var5++] = (Float)var7.getValue();
      }

      ch.iIlIlllllill(c, var4);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') << 6 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') >>> 10) ^ var5) ^ var5) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') << 6 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') >>> 10) ^ var5) ^ var5) << 5)) + '죎') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') << 6 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') >>> 10) ^ var5) ^ var5) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') << 6 | (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) >>> 14 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) + '\ue3f4') ^ 29720) - '軮') ^ var5))) - var5) - var5))))) << 2) ^ '굲') >>> 10) ^ var5) ^ var5) << 5)) + '죎') >>> 9));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) << 8) ^ '鑣') + var5) + var5) ^ 21820) + 28695) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) << 8) ^ '鑣') + var5) + var5) ^ 21820) + 28695) << 10) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) << 8) ^ '鑣') + var5) + var5) ^ 21820) + 28695) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 8 | (char)(var4[var5] ^ var5) << 8) - 25733)) ^ var5))) + var5) << 8) ^ '鑣') + var5) + var5) ^ 21820) + 28695) << 10) << 1))) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') >>> 9) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') >>> 9) << 14) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') >>> 9) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') << 10 | (char)((char)((char)((char)(-var4[var5]) + var5) << 9 | (char)((char)(-var4[var5]) + var5) >>> 7) + '뛩') >>> 6) ^ var5) >>> 11) ^ '괣') >>> 9) << 14) + var5) >>> 5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) >>> 6))) ^ var5) + var5) + '\ude12') ^ var5) >>> 9 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) >>> 6))) ^ var5) + var5) + '\ude12') ^ var5) << 7) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) >>> 6))) ^ var5) + var5) + '\ude12') ^ var5) >>> 9 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) << 10 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '鮬') ^ 25045) + '\uf45a') + 'ﳳ') + var5) << 4) >>> 6))) ^ var5) + var5) + '\ude12') ^ var5) << 7) - var5) << 8) ^ '\udc01') + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
