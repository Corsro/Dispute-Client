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

public final class IlIliiIlllIliiIl {
   public int IilIllIlll;
   public int iIlIllIlll;
   public int lIlIllIlll;
   public int IIlIllIlll;
   public int lllIllIlll;
   public int illIllIlll;
   public int IllIllIlll;
   public int iilIllIlll;
   public int lilIllIlll;

   public boolean iIlIlllllill() {
      return this.IIlIllIlll > 0;
   }

   public void IliIlllilIi() {
      this.IIlIllIlll = this.lIlIllIlll = this.iIlIllIlll = this.IllIllIlll = this.lllIllIlll = this.illIllIlll = this.IilIllIlll = this.lilIllIlll = this.iilIllIlll = 0;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) << 12 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) >>> 4) << 12 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) << 12 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) >>> 4) >>> 4) ^ var5) << 9 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) << 12 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) >>> 4) << 12 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) << 12 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) - 'ﭳ') - '\ue71a') + 16122))) + var5))) << 11) + var5) ^ var5) << 2))) >>> 4) >>> 4) ^ var5) >>> 7) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) >>> 15) - var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) >>> 15) - var5) + var5) >>> 13))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) >>> 15) - var5) + var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - '黖') + 'ퟕ') ^ var5) - var5) - var5) >>> 15) - var5) ^ var5) - var5) >>> 15) - var5) + var5) >>> 13))) << 7))) + '襘') + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 7217))) - var5) << 10 | (char)((char)(-((char)(var4[var5] + 7217))) - var5) >>> 6) ^ 7177) - 2882) - 7789))))))) + '調'))) ^ var5) >>> 5 | (char)((char)(~((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 7217))) - var5) << 10 | (char)((char)(-((char)(var4[var5] + 7217))) - var5) >>> 6) ^ 7177) - 2882) - 7789))))))) + '調'))) ^ var5) << 11) >>> 7 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 7217))) - var5) << 10 | (char)((char)(-((char)(var4[var5] + 7217))) - var5) >>> 6) ^ 7177) - 2882) - 7789))))))) + '調'))) ^ var5) >>> 5 | (char)((char)(~((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 7217))) - var5) << 10 | (char)((char)(-((char)(var4[var5] + 7217))) - var5) >>> 6) ^ 7177) - 2882) - 7789))))))) + '調'))) ^ var5) << 11) << 9))) ^ var5) ^ var5) - '\uf8a6'));
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
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) - '\udf60') + var5))) - var5) ^ var5))))))) + '航') + '\ud986'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7261774017633024029L ^ Long.rotateLeft(981371333388542807L, 18) ^ -8718865321075415594L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2302841248614815764L ^ Long.rotateLeft(-8478457341820334309L, 10) ^ 4955583718320430314L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4475510811295081177L ^ Long.rotateLeft(1620024662920407909L, 2) ^ 5905556360330216583L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2054809624551628798L ^ Long.rotateLeft(-1417621653957061450L, 45) ^ -1953753353772590927L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8125242946523040704L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5718000120511931234L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6294066434232673254L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -649571677983206898L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7385581921357184965L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1144052224483008073L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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

   public String liiiIIllIl() {
      return IilliliilIIi<invokedynamic>() + this.IIlIllIlll + IilliliilIIi<invokedynamic>() + this.lIlIllIlll + IilliliilIIi<invokedynamic>() + this.lilIllIlll + IilliliilIIi<invokedynamic>() + this.iilIllIlll + IilliliilIIi<invokedynamic>() + this.iIlIllIlll + IilliliilIIi<invokedynamic>() + this.IllIllIlll + IilliliilIIi<invokedynamic>() + this.lllIllIlll + IilliliilIIi<invokedynamic>() + this.illIllIlll + IilliliilIIi<invokedynamic>() + this.IilIllIlll;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) ^ '胊'))) ^ '읓') + var5) >>> 9 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) ^ '胊'))) ^ '읓') + var5) << 7) ^ var5) ^ '阖') ^ 12009) - 24856));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
