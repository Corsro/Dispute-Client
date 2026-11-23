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

public final class liiIIiiiiIIi {
   public static final int[] iIiliiiiIliliiii = new int[]{-15724009, -1841430, -8541460, -10773956};
   public static final int lilliiiiiilliiii = 4;
   public static final int lIlliiiiiIlliiii = 1;
   public static final int iiIliiiiIIlliiii = 0;
   public static final int Illliiiilllliiii = 2;
   public static final int Iiiliiiiliiliiii = 160;
   public static final int illliiiiIilliiii = 3;
   public static final int lliliiiiililiiii = 256;
   public static final String[] IIiliiiilIiliiii = new String[]{IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>()};

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - '겇') >>> 9 | (char)(var4[var5] - '겇') << 7))) - var5) + 23491) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] - '겇') >>> 9 | (char)(var4[var5] - '겇') << 7))) - var5) + 23491) >>> 1) - '웎') ^ var5) + '\ue9cd') ^ var5) ^ '籠') ^ 9389))) - '\ueb17'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static float IIIllIIliIIl(float octaves, float seed, int y, int x) {
      long var8 = -2988136846196374236L;
      float var4 = 0.0F;
      float var5 = 0.5F;
      float var6 = 0.0F;

      for(long var10 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var10 >>> 32) < y; var10 += 4294967296L) {
         var4 += var5 * IlIlllIlilIl(octaves, seed, x + (int)(var10 >>> 32) * 17);
         var6 += var5;
         octaves *= 2.03F;
         seed *= 2.03F;
         var5 *= 0.5F;
      }

      return var4 / var6;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8934329292396464325L ^ Long.rotateLeft(4128152726012448749L, 3) ^ -4761442816617894254L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2633000037274887559L ^ Long.rotateLeft(3050233451621584646L, 7) ^ -6149333839777124474L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2754421119499494404L ^ Long.rotateLeft(-2072271096380586249L, 59) ^ 5613326323237655975L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2778855256615842476L ^ Long.rotateLeft(7312373384033831678L, 42) ^ -8058135053381099879L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5356217920531217512L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3978563246686648614L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2850227672374824968L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6490120479039298849L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4408244017945227226L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6811985950072253554L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   public static float liiiIIllIl(float aspect) {
      float var1 = 1.6F;
      return aspect >= var1 ? 1.0F : Math.max(0.05F, aspect / var1);
   }

   private static float lIiiIiIlilli(float b, float t, float a) {
      return b + (t - b) * a;
   }

   public static int IliIlllilIi(int y, int kind, int h, int x, int w) {
      float var5 = ((float)kind + 0.5F) / (float)x;
      float var6 = ((float)h + 0.5F) / (float)w;
      float var7;
      float var8;
      float var9;
      switch (y) {
         case 1:
            float var18 = IIIllIIliIIl((float)kind * 0.018F, (float)h * 0.018F, 3, 71) - 0.5F;
            var7 = lIiiIiIlilli(238.0F, 216.0F, var6) + var18 * 7.0F;
            var8 = lIiiIiIlilli(240.0F, 220.0F, var6) + var18 * 7.0F;
            var9 = lIiiIiIlilli(243.0F, 226.0F, var6) + var18 * 6.0F;
            break;
         case 2:
            float var17 = (float)Math.pow((double)var6, 0.85);
            var7 = lIiiIiIlilli(76.0F, 169.0F, var17);
            var8 = lIiiIiIlilli(132.0F, 203.0F, var17);
            var9 = lIiiIiIlilli(223.0F, 244.0F, var17);
            float var21 = IIIllIIliIIl((float)kind * 0.011F, (float)h * 0.026F, 4, 13);
            float var23 = iliIiiliiiii((var21 - 0.5F) / 0.2F) * (0.92F - 0.45F * var6);
            var7 = lIiiIiIlilli(var7, 246.0F, var23);
            var8 = lIiiIiIlilli(var8, 248.0F, var23);
            var9 = lIiiIiIlilli(var9, 252.0F, var23);
            break;
         case 3:
            float var10 = IIIllIIliIIl((float)kind * 0.022F, (float)h * 0.022F, 4, 29);
            float var11 = IIIllIIliIIl((float)kind * 0.21F, (float)h * 0.045F, 2, 47) - 0.5F;
            float var12 = IiIlliIliiIl(kind, h, 5) - 0.5F;
            float var13 = 1.06F - 0.14F * var6;
            var7 = (lIiiIiIlilli(71.0F, 116.0F, var10) + var11 * 18.0F + var12 * 6.0F) * var13;
            var8 = (lIiiIiIlilli(127.0F, 178.0F, var10) + var11 * 26.0F + var12 * 8.0F) * var13;
            var9 = (lIiiIiIlilli(46.0F, 74.0F, var10) + var11 * 12.0F + var12 * 4.0F) * var13;
            break;
         default:
            float var19 = var5 - 0.5F;
            float var22 = var6 - 0.48F;
            float var24 = 1.0F - 0.32F * Math.min(1.0F, (var19 * var19 + var22 * var22) * 2.4F);
            var7 = lIiiIiIlilli(21.0F, 10.0F, var6) * var24;
            var8 = lIiiIiIlilli(23.0F, 11.0F, var6) * var24;
            var9 = lIiiIiIlilli(29.0F, 14.0F, var6) * var24;
      }

      float var20 = IiIlliIliiIl(kind, h, 101 + y) + IiIlliIliiIl(kind, h, 211 + y) - 1.0F;
      return -16777216 | IilliliilIIi(var7 + var20) << 16 | IilliliilIIi(var8 + var20) << 8 | IilliliilIIi(var9 + var20);
   }

   public static float iIlIlllllill(float aspect) {
      float var1 = 1.6F;
      return aspect <= var1 ? 1.0F : Math.max(0.05F, var1 / aspect);
   }

   private static float iliIiiliiiii(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      return t * t * (3.0F - 2.0F * t);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) + '뚎'))))))) - '\ud8a6') - 16826))) >>> 12 | (char)(~((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) + '뚎'))))))) - '\ud8a6') - 16826))) << 4) ^ var5) >>> 6 | (char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) + '뚎'))))))) - '\ud8a6') - 16826))) >>> 12 | (char)(~((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) + '뚎'))))))) - '\ud8a6') - 16826))) << 4) ^ var5) << 10) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int IilliliilIIi(float v) {
      long var2 = 6189491659504294122L;
      var2 ^= ((long)Math.round(v) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) < 0 ? 0 : ((int)(var2 >>> 32) > 255 ? 255 : (int)(var2 >>> 32));
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ 16538) << 1 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ 16538) >>> 15) ^ var5) << 2 | (char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ 16538) << 1 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ 16538) >>> 15) ^ var5) >>> 14) - 13626))))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float IlIlllIlilIl(float x, float y, int seed) {
      long var11 = -8067424639592216937L;
      var11 ^= ((long)((int)Math.floor((double)x)) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)((int)Math.floor((double)y)) ^ var11) & -1L >>> 32;
      float var5 = iliIiiliiiii(x - (float)((int)(var11 >>> 32)));
      float var6 = iliIiiliiiii(y - (float)((int)var11));
      float var7 = IiIlliIliiIl((int)(var11 >>> 32), (int)var11, seed);
      float var8 = IiIlliIliiIl((int)(var11 >>> 32) + 1, (int)var11, seed);
      float var9 = IiIlliIliiIl((int)(var11 >>> 32), (int)var11 + 1, seed);
      float var10 = IiIlliIliiIl((int)(var11 >>> 32) + 1, (int)var11 + 1, seed);
      return lIiiIiIlilli(lIiiIiIlilli(var7, var8, var5), lIiiIiIlilli(var9, var10, var5), var6);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) << 8 | (char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) >>> 8) ^ '\ue138') + '꛴') - var5) - '鷛') + '\uf161') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) << 8 | (char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) >>> 8) ^ '\ue138') + '꛴') - var5) - '鷛') + '\uf161') << 10))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) << 8 | (char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) >>> 8) ^ '\ue138') + '꛴') - var5) - '鷛') + '\uf161') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) << 8 | (char)((char)(var4[var5] ^ var5) >>> 3 | (char)(var4[var5] ^ var5) << 13) >>> 8) ^ '\ue138') + '꛴') - var5) - '鷛') + '\uf161') << 10))) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) << 1 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) >>> 15) - 24019) << 9 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) << 1 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) >>> 15) - 24019) >>> 7) << 13 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) << 1 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) >>> 15) - 24019) << 9 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) << 1 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '闂'))))) - 5380) >>> 15) - 24019) >>> 7) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private liiIIiiiiIIi() {
   }

   static float IiIlliIliiIl(int x, int y, int seed) {
      long var4 = -3996251538744306411L;
      var4 ^= ((long)(x * 668265261 ^ y * 374761393 ^ seed * 1540483477) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 15) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) * 739982445) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 12) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) * 695872825) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)((int)(var4 >>> 32) ^ (int)(var4 >>> 32) >>> 15) << 32 ^ var4) & -1L << 32;
      return (float)((int)(var4 >>> 32) & 16777215) / 1.6777216E7F;
   }
}
