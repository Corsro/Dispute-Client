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

final class liilIIIliiilIIIl {
   final float[] IlIiIIllIl;
   final float[] lIIiIIllIl;
   final float[] iIIiIIllIl;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))))) << 1 | (char)(~((char)(-((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))))) >>> 15) ^ '饦') ^ var5) - var5) - var5) + 'ꓶ') + '빲'))) ^ var5) - var5) - var5) - 14698) ^ 11625) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) << 1 | (char)(-var4[var5]) >>> 15) ^ 27279) ^ var5))) + 20741) - var5) ^ 5885) ^ 22942) - 29487) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   liilIIIliiilIIIl(float... tv) {
      if (tv.length >= 4 && (tv.length & 1) == 0) {
         int var2 = tv.length / 2;
         this.lIIiIIllIl = new float[var2];
         this.iIIiIIllIl = new float[var2];
         this.IlIiIIllIl = new float[var2];

         for(int var3 = 0; var3 < var2; ++var3) {
            this.lIIiIIllIl[var3] = tv[2 * var3];
            this.iIIiIIllIl[var3] = tv[2 * var3 + 1];
            if (var3 > 0 && this.lIIiIIllIl[var3] <= this.lIIiIIllIl[var3 - 1]) {
               throw new IllegalArgumentException(IilliliilIIi<invokedynamic>());
            }
         }

         float[] var9 = new float[var2 - 1];

         for(int var4 = 0; var4 < var2 - 1; ++var4) {
            var9[var4] = (this.iIIiIIllIl[var4 + 1] - this.iIIiIIllIl[var4]) / (this.lIIiIIllIl[var4 + 1] - this.lIIiIIllIl[var4]);
         }

         for(int var10 = 1; var10 < var2 - 1; ++var10) {
            this.IlIiIIllIl[var10] = var9[var10 - 1] * var9[var10] <= 0.0F ? 0.0F : (var9[var10 - 1] + var9[var10]) * 0.5F;
         }

         for(int var11 = 0; var11 < var2 - 1; ++var11) {
            if (var9[var11] == 0.0F) {
               this.IlIiIIllIl[var11] = 0.0F;
               this.IlIiIIllIl[var11 + 1] = 0.0F;
            } else {
               float var5 = this.IlIiIIllIl[var11] / var9[var11];
               float var6 = this.IlIiIIllIl[var11 + 1] / var9[var11];
               float var7 = var5 * var5 + var6 * var6;
               if (var7 > 9.0F) {
                  float var8 = 3.0F / (float)Math.sqrt((double)var7);
                  this.IlIiIIllIl[var11] = var8 * var5 * var9[var11];
                  this.IlIiIIllIl[var11 + 1] = var8 * var6 * var9[var11];
               }
            }
         }

      } else {
         throw new IllegalArgumentException(IilliliilIIi<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) >>> 9) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) >>> 9) << 1))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) >>> 9) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) >>> 2 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 15 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 1) + var5) << 14) ^ var5) ^ '濾'))) + var5) - var5) >>> 9) << 1))) ^ var5) << 8) ^ '衰') ^ var5))));
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
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '밶') + 26005) << 1 | (char)((char)(var4[var5] - '밶') + 26005) >>> 15) - 7459))) + var5) >>> 9 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - '밶') + 26005) << 1 | (char)((char)(var4[var5] - '밶') + 26005) >>> 15) - 7459))) + var5) << 7))) << 12 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '밶') + 26005) << 1 | (char)((char)(var4[var5] - '밶') + 26005) >>> 15) - 7459))) + var5) >>> 9 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - '밶') + 26005) << 1 | (char)((char)(var4[var5] - '밶') + 26005) >>> 15) - 7459))) + var5) << 7))) >>> 4))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3352004282178893315L ^ Long.rotateLeft(1482421946391140957L, 6) ^ -6363436078368280811L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7849236759750636282L ^ Long.rotateLeft(550854510695597593L, 32) ^ -8521688051693375902L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5256066177937834900L ^ Long.rotateLeft(-3221674217601606509L, 20) ^ -6053641162782185938L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5265343212862207200L ^ Long.rotateLeft(-6634581607419472664L, 14) ^ 2255937031030000557L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4237890063591156558L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3866059505265922856L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1171169790996043455L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4916892777429984018L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6129828327524867846L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3234735632249184042L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
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

   float IliIlllilIi(float x) {
      int var2 = this.lIIiIIllIl.length;
      if (x <= this.lIIiIIllIl[0]) {
         return this.iIIiIIllIl[0];
      } else if (x >= this.lIIiIIllIl[var2 - 1]) {
         return this.iIIiIIllIl[var2 - 1];
      } else {
         int var3;
         for(var3 = 0; x > this.lIIiIIllIl[var3 + 1]; ++var3) {
         }

         float var4 = this.lIIiIIllIl[var3 + 1] - this.lIIiIIllIl[var3];
         float var5 = (x - this.lIIiIIllIl[var3]) / var4;
         float var6 = var5 * var5;
         float var7 = var6 * var5;
         return (2.0F * var7 - 3.0F * var6 + 1.0F) * this.iIIiIIllIl[var3] + (var7 - 2.0F * var6 + var5) * var4 * this.IlIiIIllIl[var3] + (-2.0F * var7 + 3.0F * var6) * this.iIIiIIllIl[var3 + 1] + (var7 - var6) * var4 * this.IlIiIIllIl[var3 + 1];
      }
   }

   float liiiIIllIl() {
      return this.iIIiIIllIl[0];
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) + 15483))))) ^ 'ꗽ') ^ 30157) ^ 14271) - var5) << 14 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) + 15483))))) ^ 'ꗽ') ^ 30157) ^ 14271) - var5) >>> 2) + var5) - '\ue411') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) + 15483))))) ^ 'ꗽ') ^ 30157) ^ 14271) - var5) << 14 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) + 15483))))) ^ 'ꗽ') ^ 30157) ^ 14271) - var5) >>> 2) + var5) - '\ue411') >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   float iIlIlllllill() {
      return this.iIIiIIllIl[this.iIIiIIllIl.length - 1];
   }
}
