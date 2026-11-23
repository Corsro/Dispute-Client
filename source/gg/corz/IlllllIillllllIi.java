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

public final class IlllllIillllllIi {
   public static final double lIiIiiIIIi = 0.98;
   public static final double IliIiiIIIi = 0.7;
   public static final int liiIiiIIIi = 40;
   public static final double iliIiiIIIi = 0.01;
   public static final double lIIliiIIIi = 0.05;
   public static final double IiiIiiIIIi = 0.004;
   public static final double IIiIiiIIIi = 0.98;
   public static final double iIiIiiIIIi = 0.989;
   public static final double iilIiiIIIi = 0.6;
   public static final double lliIiiIIIi = 0.03;
   public static final double IIIliiIIIi = (double)0.5F;
   public static final int iiiIiiIIIi = 70;

   static boolean IIIllIIliIIl(iilliIilIIiliIil interval, double sz, double pz, double sx, double px) {
      if (interval.liiiIIllIl(sx, px)) {
         return false;
      } else {
         double[] var9 = IlIlllIlilIl(interval, sz, pz);
         double var10 = var9[0] - sz;
         double var12 = var9[1] - pz;
         double var14 = var9[0] - sx;
         double var16 = var9[1] - px;
         return var10 * var14 + var12 * var16 < (double)0.0F;
      }
   }

   static double[] IlIlllIlilIl(iilliIilIIiliIil interval, double z, double x) {
      double var5 = interval.lIiiIiIlilli() == 2 ? x : z;
      double var7 = interval.lIiiIiIlilli() == 2 ? z : x;
      double var9 = Math.max(interval.iliIiiliiiii(), Math.min(interval.IIIllIIliIIl(), var5));
      double var11 = Math.max(interval.IlIlllIlilIl(), Math.min(interval.IiIlliIliiIl(), var7));
      return interval.lIiiIiIlilli() == 2 ? new double[]{var11, var9} : new double[]{var9, var11};
   }

   public static double liiiIIllIl(double speed, double slipperiness) {
      double var4 = IliIlllilIi(slipperiness);
      return speed * var4 / ((double)1.0F - var4);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 13431) << 7 | (char)(var4[var5] - 13431) >>> 9) ^ '쭴') ^ 31199) ^ var5))) >>> 14 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - 13431) << 7 | (char)(var4[var5] - 13431) >>> 9) ^ '쭴') ^ 31199) ^ var5))) << 2) << 7 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 13431) << 7 | (char)(var4[var5] - 13431) >>> 9) ^ '쭴') ^ 31199) ^ var5))) >>> 14 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - 13431) << 7 | (char)(var4[var5] - 13431) >>> 9) ^ '쭴') ^ 31199) ^ var5))) << 2) >>> 9) ^ '鞴') + '\uf542'))) ^ 12527) ^ 9366) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double iIlIlllllill(double slipperiness) {
      double var2 = IliIlllilIi(0.6);
      double var4 = IliIlllilIi(slipperiness);
      double var6 = var2 / var4;
      return 0.03 * var6 * var6 * var6;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 13848) - var5) << 6 | (char)((char)(var4[var5] ^ 13848) - var5) >>> 10))) + var5) ^ '큘'))) ^ var5))))))) - var5))) >>> 5 | (char)(-((char)((char)(~((char)(-((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 13848) - var5) << 6 | (char)((char)(var4[var5] ^ 13848) - var5) >>> 10))) + var5) ^ '큘'))) ^ var5))))))) - var5))) << 11) ^ var5) >>> 3 | (char)((char)((char)(-((char)((char)(~((char)(-((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 13848) - var5) << 6 | (char)((char)(var4[var5] ^ 13848) - var5) >>> 10))) + var5) ^ '큘'))) ^ var5))))))) - var5))) >>> 5 | (char)(-((char)((char)(~((char)(-((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 13848) - var5) << 6 | (char)((char)(var4[var5] ^ 13848) - var5) >>> 10))) + var5) ^ '큘'))) ^ var5))))))) - var5))) << 11) ^ var5) << 13) + '脃'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5)) << 6 | (char)((char)((char)(var4[var5] - var5) ^ var5)) >>> 10) + 11554) - var5))) + var5) ^ 8170) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5)) << 6 | (char)((char)((char)(var4[var5] - var5) ^ var5)) >>> 10) + 11554) - var5))) + var5) ^ 8170) >>> 15))) ^ '黺') ^ var5) - var5) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5)) << 6 | (char)((char)((char)(var4[var5] - var5) ^ var5)) >>> 10) + 11554) - var5))) + var5) ^ 8170) << 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5)) << 6 | (char)((char)((char)(var4[var5] - var5) ^ var5)) >>> 10) + 11554) - var5))) + var5) ^ 8170) >>> 15))) ^ '黺') ^ var5) - var5) >>> 15) - '袮'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static double IiIlliIliiIl(iilliIilIIiliIil px, double interval, double pz) {
      long var18 = -3390504483094944849L;
      double var5 = px.IIlllIlliIll() - interval;
      double var7 = px.Illlllllilll() - pz;
      double var9 = Math.hypot(var5, var7);
      if (var9 < 1.0E-9) {
         return (double)0.0F;
      } else {
         var5 /= var9;
         var7 /= var9;
         double[][] var11 = px.lIiiIiIlilli() == 2 ? new double[][]{{px.IlIlllIlilIl(), px.iliIiiliiiii()}, {px.IlIlllIlilIl(), px.IIIllIIliIIl()}, {px.IiIlliIliiIl(), px.iliIiiliiiii()}, {px.IiIlliIliiIl(), px.IIIllIIliIIl()}} : new double[][]{{px.iliIiiliiiii(), px.IlIlllIlilIl()}, {px.iliIiiliiiii(), px.IiIlliIliiIl()}, {px.IIIllIIliIIl(), px.IlIlllIlilIl()}, {px.IIIllIIliIIl(), px.IiIlliIliiIl()}};
         double var12 = (double)0.0F;
         double[][] var14 = var11;
         var18 ^= ((long)var11.length << 32 ^ var18) & -1L << 32;

         for(long var23 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            double[] var17 = var14[(int)var23];
            var12 = Math.max(var12, (var17[0] - interval) * var5 + (var17[1] - pz) * var7);
         }

         return var12;
      }
   }

   private IlllllIillllllIi() {
   }

   public static double IliIlllilIi(double slipperiness) {
      return Math.min(0.995, slipperiness * 0.91);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) << 4) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) << 4) << 5) - '鐈') - var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) << 4) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) << 8 | (char)((char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)(var4[var5] + '\ue886')))) + var5))) << 5) >>> 8) + var5) << 7) << 4) << 5) - '鐈') - var5) << 9))) - var5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IilliliilIIi(double slipperiness) {
      return slipperiness > 0.7;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') << 9 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') >>> 7) ^ 25837) - var5) - var5))) - var5) - var5) << 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') << 9 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') >>> 7) ^ 25837) - var5) - var5))) - var5) - var5) >>> 4) - 16250) + 16646) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') << 9 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') >>> 7) ^ 25837) - var5) - var5))) - var5) - var5) << 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') << 9 | (char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '\ud899') >>> 7) ^ 25837) - var5) - var5))) - var5) - var5) >>> 4) - 16250) + 16646) >>> 8))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int lIiiIiIlilli(double slipperiness) {
      return IilliliilIIi(slipperiness) ? 70 : 40;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1413876901692677316L ^ Long.rotateLeft(-8144748742799698120L, 35) ^ 3321097566688087956L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8812853758984763279L ^ Long.rotateLeft(2511449779992214543L, 52) ^ -5263271866741445063L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5538972196454759892L ^ Long.rotateLeft(-2758780957202374250L, 28) ^ 420911626338694028L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2307076150929798756L ^ Long.rotateLeft(624288719739038832L, 62) ^ -6136049076399434089L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1818579960691202505L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2769379257607782147L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7914316274085244000L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4959755824487063773L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8819103412476776730L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6357204398584849168L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Ililllililil<invokedynamic>());
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

   public static IIIIiiillIIIiiil iliIiiliiiii(iilliIilIIiliIil pz, double px, double slipperiness, double interval, double vx, double vz) {
      long var32 = 2033727718866800923L;
      long var30 = 8941123294303749509L;
      double var11 = Math.hypot(interval, vx);
      var30 ^= ((long)pz.liiiIIllIl(px, slipperiness) << 32 ^ var30) & -1L << 32;
      double var14 = var11 > 1.0E-9 ? liiiIIllIl(var11, vz) : (double)0.0F;
      double var16 = var11 > 1.0E-9 ? px + interval / var11 * var14 : px;
      double var18 = var11 > 1.0E-9 ? slipperiness + vx / var11 * var14 : slipperiness;
      var30 ^= ((long)(var11 > 0.001 && pz.liiiIIllIl(var16, var18) ? 1 : 0) ^ var30) & -1L >>> 32;
      if (!IilliliilIIi(vz)) {
         if ((int)(var30 >>> 32) != 0) {
            return var11 > 0.01 ? new IIIIiiillIIIiiil(lliilIiiliilIi.iiliIlliiIIiiIllii, IIlIlIIllIlIlIIl.iiIIIillIl, true, var14, (boolean)((int)var30), false, IIlllIlliIll<invokedynamic>()) : new IIIIiiillIIIiiil(lliilIiiliilIi.lIiiIlliiiIiiIllii, IIlIlIIllIlIlIIl.IIlIIillIl, true, var14, (boolean)((int)var30), false, IIlllIlliIll<invokedynamic>());
         } else {
            return (int)var30 != 0 ? new IIIIiiillIIIiiil(lliilIiiliilIi.llliIlliiilliIllii, IIlIlIIllIlIlIIl.IiIIIillIl, false, var14, true, false, IIlllIlliIll<invokedynamic>()) : new IIIIiiillIIIiiil(lliilIiiliilIi.iIliIlliiIlliIllii, IIlIlIIllIlIlIIl.llIIIillIl, false, var14, false, false, IIlllIlliIll<invokedynamic>());
         }
      } else {
         var32 ^= ((long)(var11 > 0.001 && (int)var30 == 0 && IIIllIIliIIl(pz, px, slipperiness, var16, var18) ? 1 : 0) << 32 ^ var32) & -1L << 32;
         if ((int)(var30 >>> 32) != 0) {
            return var11 <= 0.004 ? new IIIIiiillIIIiiil(lliilIiiliilIi.lIiiIlliiiIiiIllii, IIlIlIIllIlIlIIl.IIlIIillIl, true, var14, (boolean)((int)var30), false, IIlllIlliIll<invokedynamic>()) : new IIIIiiillIIIiiil(lliilIiiliilIi.IiliIlliililiIllii, IIlIlIIllIlIlIIl.ilIIIillIl, true, var14, (boolean)((int)var30), (int)var30 == 0, IIlllIlliIll<invokedynamic>());
         } else {
            double var22 = IiIlliIliiIl(pz, px, slipperiness);
            double var24 = var11 + iIlIlllllill(vz);
            double var26 = var24 + liiiIIllIl(var24, vz);
            if ((int)var30 != 0) {
               double var34 = (pz.IIlllIlliIll() - var16) * (var11 > 1.0E-9 ? interval / var11 : (double)0.0F) + (pz.Illlllllilll() - var18) * (var11 > 1.0E-9 ? vx / var11 : (double)0.0F);
               return var34 > 0.05 && var26 <= var22 ? new IIIIiiillIIIiiil(lliilIiiliilIi.iIliIlliiIlliIllii, IIlIlIIllIlIlIIl.liIIIillIl, false, var14, true, false, IIlllIlliIll<invokedynamic>()) : new IIIIiiillIIIiiil(lliilIiiliilIi.llliIlliiilliIllii, IIlIlIIllIlIlIIl.IiIIIillIl, false, var14, true, false, IIlllIlliIll<invokedynamic>());
            } else if ((int)(var32 >>> 32) != 0) {
               return new IIIIiiillIIIiiil(lliilIiiliilIi.IiliIlliililiIllii, IIlIlIIllIlIlIIl.ilIIIillIl, false, var14, false, true, IIlllIlliIll<invokedynamic>());
            } else {
               double var28 = pz.iIlIlllllill(px, slipperiness);
               return var26 > var22 ? new IIIIiiillIIIiiil(lliilIiiliilIi.llliIlliiilliIllii, IIlIlIIllIlIlIIl.liIIIillIl, false, var14, false, false, IIlllIlliIll<invokedynamic>()) : new IIIIiiillIIIiiil(lliilIiiliilIi.iIliIlliiIlliIllii, var28 <= (double)0.5F ? IIlIlIIllIlIlIIl.liIIIillIl : IIlIlIIllIlIlIIl.llIIIillIl, false, var14, false, false, IIlllIlliIll<invokedynamic>());
            }
         }
      }
   }
}
