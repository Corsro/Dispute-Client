package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class iIIlliilIlIlliil {
   private iIiIllilIliIllil iiilililil;
   private double IlIiililil;
   private boolean iIiiililil;
   public static final double lilillilil = (double)0.25F;
   public static final double lllillilil = 0.9;
   private boolean ilIlililil;
   private boolean lIilililil;
   private static final double iiiillilil = 0.001;
   public static final double iiIiIlilil = 0.6;
   private boolean liIIililil;
   public static final double lIlIllilil = 0.1;
   public static final long iIIIllilil = 150L;
   private long Iiiiililil;
   private double IiIlililil;
   private static final double liiillilil = 1.0E-6;
   private int IliIililil;
   public static final double lillIlilil = (double)2.0F;
   public static final double IillIlilil = (double)0.75F;
   public static final double illlIlilil = 0.4;
   public static final int IIIiIlilil = 5;
   public static final int iiilllilil = 24;
   public static final int IIIillilil = 4;
   private double IIlIililil;
   private long lliIililil;
   private iIilIiIiIlilIiIi llliililil;
   public static final int IlIiIlilil = 6;
   public static final double IIlillilil = (double)0.5F;
   public static final double liIillilil = (double)0.5F;
   public static final double Iillllilil = (double)2.5F;
   public static final int lIiIllilil = 10;
   private double[] IIiiililil;
   private final liIIliliiIIlil iIIIililil;
   private boolean illlililil;
   public static final double lilIllilil = 0.3;
   public static final int llIIllilil = 6;
   private boolean IiIIililil;
   public static final double IlIIllilil = (double)96.0F;
   private double Iiilililil;
   private double IIliililil;
   public static final int IIIlllilil = 2;
   public static final int IIlIllilil = 14;
   private class_243 lIiIililil;
   public static final double iIIlllilil = 0.4;
   public static final double iIlIllilil = 0.3;
   public static final double llIillilil = (double)8.0F;
   public static final double lIilIlilil = 0.6;
   public static final double IlllIlilil = 0.6;
   private final Random lIIIililil;
   private long IIIlililil;
   public static final int iIiIllilil = 20;
   private illiIiIlIiliIiIl ilIIililil;
   private boolean IIIiililil;
   public static final int iIllIlilil = 50;
   private boolean lilIililil;
   public static final double[] Ililllilil = new double[]{(double)2.0F, 2.4, 2.8, 3.2};
   public static final double iiilIlilil = 0.6;
   public static final double liiIllilil = 1.0E-4;
   public static final int llliIlilil = 2;
   public static final double iliIllilil = (double)0.5F;
   public static final double iiIlllilil = 0.15;
   public static final int lIIillilil = 2;
   private long iIIlililil;
   private long iIlIililil;
   private long Ililililil;
   public static final int IliiIlilil = 8;
   public static final double liIlllilil = (double)2.5F;
   private double ililililil;
   public static final double IiilIlilil = (double)3.0F;
   public static final int IllIllilil = 6;
   public static final double IiIiIlilil = 0.9;
   public static final double iIllllilil = (double)0.0F;
   public static final int lIIiIlilil = 12;
   public static final double liIiIlilil = 0.4;
   public static final int lIIIllilil = 5;
   public static final double illillilil = (double)1.0F;
   public static final double iillllilil = (double)0.25F;
   public static final double iilillilil = (double)1.0F;
   public static final double Illillilil = (double)1.0F;
   private int ilIiililil;
   public static final double iIliIlilil = (double)4.0F;
   private int Illiililil;
   public static final double iilIllilil = 3.2;
   public static final double lIllllilil = 0.7;
   public static final double Iilillilil = (double)0.5F;
   private long iiiIililil;
   private class_243 IiIiililil;
   public static final double IiIlllilil = (double)12.0F;
   private long liIiililil;
   private int iiIlililil;
   public static final double illIllilil = 1.6;
   public static final double illlllilil = 0.3;
   private boolean liiIililil;
   public static final double iliiIlilil = 0.8;
   public static final double liilIlilil = 0.35;
   public static final double llllIlilil = 0.2;
   public static final double lIlillilil = (double)60.0F;
   private boolean iiIIililil;
   private long Iiliililil;
   public static final double lIliIlilil = 0.2;
   private int iiliililil;
   public static final double llllllilil = 3.2;
   public static final double IiIillilil = (double)1.0F;
   private IiliIililiIi iIllililil;
   public static final double IIllllilil = (double)1.0F;
   private static final int IIllililil = 2;
   private double IilIililil;
   public static final int IIIIllilil = 80;
   private boolean liliililil;
   public static final double iIilllilil = (double)-1.5F;
   private int lIIiililil;
   public static final int llilIlilil = 3;
   public static final double IiiIllilil = (double)1.5F;
   private long Illlililil;
   private final iIIIllilIlIIllil llIIililil;
   public static final int iiiiIlilil = 4;
   public static final double iIlillilil = (double)24.0F;
   private double[] iliiililil;
   private double IIiIililil;
   public static final double iiIillilil = (double)1.5F;
   private double IllIililil;
   private boolean iillililil;
   public static final double lIilllilil = (double)-0.5F;
   public static final int liiiIlilil = 7;
   public static final double IIilIlilil = 0.4;
   public static final double llIlllilil = (double)3.0F;
   private double lllIililil;
   private long llIiililil;
   public static final double llIiIlilil = (double)0.0F;
   private boolean liiiililil;
   public static final int ililllilil = 4;
   public static final double IIiillilil = (double)3.0F;
   public static final double lliiIlilil = (double)2.0F;
   public static final float ilIIllilil = 0.3F;
   private boolean iIiIililil;
   private long lIiiililil;
   private boolean llIlililil;
   private final IllIllIllllIllIl IlIIililil;
   private double lIlIililil;
   private long lillililil;
   private double[] illiililil;
   public static final long IiiiIlilil = 300L;
   private int IlIlililil;
   public static final double liliIlilil = 0.35;
   public static final int lliillilil = 10;
   public static final int IlliIlilil = 3;
   public static final double ililIlilil = (double)16.0F;
   private float Iillililil;
   private boolean iIliililil;
   public static final double IIilllilil = (double)10.0F;
   private iIiIllilIliIllil liilililil;
   private boolean iliIililil;
   public static final double iIIillilil = (double)1.0F;
   public static final double IlIlllilil = 0.28;
   public static final int IIiiIlilil = 273;
   private double illIililil;
   private long llllililil;
   public static final int iiIIllilil = 12;
   public static final double lliIllilil = 0.3;
   public static final double IiliIlilil = (double)0.25F;
   public static final double[] liilllilil = new double[]{1.2, 1.6, (double)2.0F, 2.4, 2.8, 3.2};
   private long llilililil;
   public static final int lllIllilil = 351;
   private static final double lIllililil = 0.08;
   public static final double iIilIlilil = (double)1.0F;
   public static final double IilIllilil = (double)1.5F;
   public static final int illiIlilil = 4;
   public static final int lIiiIlilil = 1309;
   private long iIilililil;
   public static final int iliillilil = 12;
   public static final double ilIillilil = (double)0.5F;
   public static final double IlIillilil = 1.2;
   private int iiiiililil;
   private double lIliililil;
   public static final int Iliillilil = 48;
   public static final int llilllilil = 24;
   public static final double iiliIlilil = 0.15;
   public static final double lIIlllilil = 0.08;
   public static final double lIiillilil = 0.05;
   public static final double ilIiIlilil = 0.08;
   public static final int iIIiIlilil = 3;
   public static final double IIliIlilil = (double)6.0F;
   private int lliiililil;
   private boolean IiiIililil;
   private boolean IIilililil;
   public static final double IliIllilil = 0.05;
   private boolean Iliiililil;
   public static final float liIIllilil = 0.9F;
   public static final double Illlllilil = (double)2.0F;
   public static final int iiiIllilil = 3;
   public static final double iIiillilil = (double)8.0F;
   private static final double Iiiillilil = 0.001;
   public static final double iIiiIlilil = 0.05;
   public static final double IlilIlilil = 1.8;
   public static final double IiIIllilil = 2.8;
   private static final double[] IIIIililil = new double[]{(double)0.0F, (double)0.0F};
   private double liIlililil;
   public static final int Iiilllilil = 1407;
   public static final double IIiIllilil = 3.8;
   private long iiIiililil;
   private double iilIililil;
   public static final double ilIlllilil = (double)3.0F;
   private double iIIiililil;
   private boolean lIIlililil;
   public static final double lillllilil = (double)6.0F;
   public static final double iillIlilil = 0.546;

   public boolean IIlilIliiIli() {
      return this.Iliiililil;
   }

   private void ilIiiIiIii(long pos, class_243 advice, iiiIilllIIIlilll tick) {
      if (tick != null) {
         switch (tick) {
            case IlillIlill -> this.liiIililil = true;
            case llillIlill -> this.liIiiiiIii(pos, advice);
            case ilillIlill -> this.IIliilIlii(pos, advice);
            case IiillIlill -> this.llIIililil.lilIliilIl(pos);
         }

      }
   }

   static double lliIliliIl(liIIliliiIIlil z, int env, int x, class_243 a, iIilIiIiIlilIiIi spot) {
      return IiiIlliiIl(z, env, x, a, spot, (double)0.5F, (double)-0.5F);
   }

   static boolean lIlIliIlIl(liIIliliiIIlil spot, double[] a, class_243 cell, class_243 env, iIilIiIiIlilIiIi want) {
      return IllIllllIl(spot, a, cell, env, want, false);
   }

   static boolean lililiilil(iiliiiIiIIiiiiIi lane, iIlIIIIiIllIIIIi c) {
      if (lane != null && lane.IlIlllIlilIl() == null && lane.Illlllllilll() == null && lane.IIlllIlliIll() == null) {
         return c != iIlIIIIiIllIIIIi.lIIIiiIiil && c != iIlIIIIiIllIIIIi.ilIIiiIiil && lane.IIIllIIliIIl() != iIlIIIIiIllIIIIi.lIIIiiIiil && lane.IIIllIIliIIl() != iIlIIIIiIllIIIIi.ilIIiiIiil;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite ilIlIlIiIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '︡') >>> 1 | (char)(var4[var5] + '︡') << 15) ^ var5) - 13106) - var5) - '뙒') << 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + '︡') >>> 1 | (char)(var4[var5] + '︡') << 15) ^ var5) - 13106) - var5) - '뙒') >>> 3) ^ var5) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '︡') >>> 1 | (char)(var4[var5] + '︡') << 15) ^ var5) - 13106) - var5) - '뙒') << 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + '︡') >>> 1 | (char)(var4[var5] + '︡') << 15) ^ var5) - 13106) - var5) - '뙒') >>> 3) ^ var5) + var5) >>> 12))) ^ '\ue70a'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   double[] Ililllililil() {
      return new double[]{this.IIliililil, this.lIliililil};
   }

   int IiIiliIiiiIi() {
      return this.lliiililil;
   }

   private boolean IilliliilIIi(long pearls, IiiIliliiIli tick, int d) {
      long var10 = 975935712556777246L;
      long var12 = 5436949080971358184L;
      long var14 = 8153121652727849074L;
      if (this.IlIlililil >= 0 && d >= 0 && d < this.IlIlililil) {
         this.iIIlililil = pearls;
      }

      this.IlIlililil = d;
      if (this.iIIIililil.IIlllIlliIll()) {
         return false;
      } else {
         var10 ^= ((long)this.iIIIililil.Iiilliiliiil() << 32 ^ var10) & -1L << 32;
         var10 ^= ((long)(this.iIIlililil != Long.MIN_VALUE && pearls >= this.iIIlililil && pearls - this.iIIlililil < 5L ? 1 : 0) ^ var10) & -1L >>> 32;
         var12 ^= ((long)((int)(var10 >>> 32) >= 0 && (int)(var10 >>> 32) <= 7 ? 1 : 0) << 32 ^ var12) & -1L << 32;
         var12 ^= ((long)((int)(var12 >>> 32) == 0 && ((int)(var10 >>> 32) >= 0 || (int)var10 == 0) ? 0 : 1) ^ var12) & -1L >>> 32;
         var14 ^= ((long)(tick != null && tick.IilliliilIIi() == iIlIIIIiIllIIIIi.lIIIiiIiil && tick.lIiiIiIlilli() == IlIIIillllIIIill.iIIilllill ? 1 : 0) << 32 ^ var14) & -1L << 32;
         if ((int)(var12 >>> 32) != 0) {
            this.iiiIililil = pearls;
         }

         return (int)var12 != 0 || (int)(var14 >>> 32) != 0;
      }
   }

   static double IIiIIllIiIIl(liIIliliiIIlil from, class_243 maxLen, class_243 maxDrop, boolean to, double allowJump, int env) {
      long var38 = 5117461649100827559L;
      if (from != null && maxLen != null && maxDrop != null && iiiIIlIIIlIl(maxLen) && iiiIIlIIIlIl(maxDrop)) {
         double var7 = maxDrop.field_1352 - maxLen.field_1352;
         double var9 = maxDrop.field_1350 - maxLen.field_1350;
         double var11 = Math.hypot(var7, var9);
         if (var11 < 1.0E-6) {
            double var40 = lliIIliliIIl(from, maxLen.field_1352, maxLen.field_1350, maxLen.field_1351, env);
            return Double.isFinite(var40) ? var40 : maxLen.field_1351;
         } else {
            double var13 = Math.min(var11, allowJump);
            var38 ^= ((long)Math.max(1, (int)Math.ceil(var13 / 0.4)) << 32 ^ var38) & -1L << 32;
            double var16 = maxLen.field_1351;
            double var18 = maxLen.field_1352;
            double var20 = maxLen.field_1350;
            long var22 = class_2338.method_49637(maxLen.field_1352, maxLen.field_1351 + 0.001, maxLen.field_1350).method_10063();

            for(long var42 = var38 ^ (1L ^ var38) & -1L >>> 32; (int)var42 <= (int)(var42 >>> 32); var42 ^= (var42 ^ var42 + (long)1) & -1L >>> 32) {
               double var25 = var13 * (double)((int)var42) / (double)((int)(var42 >>> 32)) / var11;
               double var27 = maxLen.field_1352 + var7 * var25;
               double var29 = maxLen.field_1350 + var9 * var25;
               double var31 = lliIIliliIIl(from, var27, var29, var16, env);
               if (!Double.isFinite(var31)) {
                  return Double.NaN;
               }

               double var33 = var31 - var16;
               if (var33 > 1.001) {
                  return Double.NaN;
               }

               if (var33 > 0.601) {
                  if (!to) {
                     return Double.NaN;
                  }

                  if (from.iIlIlllllill((int)Math.floor(var18), (int)Math.floor(var16 + 0.001) + 2, (int)Math.floor(var20))) {
                     return Double.NaN;
                  }
               }

               class_2338 var35 = class_2338.method_49637(var27, var31 + 0.001, var29);
               long var36 = var35.method_10063();
               if (var36 != var22) {
                  var22 = var36;
                  if ((from.lIiiIiIlilli(var35) & 1373) != 0) {
                     return Double.NaN;
                  }
               }

               var16 = var31;
               var18 = var27;
               var20 = var29;
            }

            return var16;
         }
      } else {
         return Double.NaN;
      }
   }

   private void lIIiiiIIii(double[] u) {
      if (u != null) {
         this.illIililil = u[0];
         this.IilIililil = u[1];
      }
   }

   private boolean lliliilili(class_243 z, double pos, double x) {
      long var8 = 690376575885232456L;
      class_2338 var6 = class_2338.method_49637(pos, z.field_1351 + 0.001, x);
      if (this.llIIililil.IIiIllIiIl(var6.method_10263(), var6.method_10260())) {
         return false;
      } else {
         var8 ^= ((long)this.llIIililil.lIiiIiIlilli() << 32 ^ var8) & -1L << 32;
         if (this.iIIIililil.IIIllIIliIIl(var6, (int)(var8 >>> 32) + 1) > (int)(var8 >>> 32)) {
            return true;
         } else {
            return (this.iIIIililil.lIiiIiIlilli(var6) & 337) != 0;
         }
      }
   }

   iIIlliilIlIlliil(Random env, liIIliliiIIlil rnd) {
      iIIIllilIlIIllil var10003;
      if (rnd instanceof IlIIlIilllIIlIil var3) {
         var10003 = new iIIIllilIlIIllil(var3, llIiililIiil.IlIllIiillIllIii, iilIiiIIiIii.liIiIilIliiIiIilIl);
      } else {
         var10003 = iIIIllilIlIIllil.IlIlllIlilIl();
      }

      this(env, rnd, var10003);
   }

   private boolean iIIIIlIlIIIl(class_243 pos) {
      return this.iIIIililil.iIlIlllllill((int)Math.floor(pos.field_1352), (int)Math.floor(pos.field_1351 + 0.001) + 2, (int)Math.floor(pos.field_1350));
   }

   private boolean lilliiilli() {
      long var18 = 4535105707831596593L;
      long var20 = 8937962458880397550L;
      long var22 = -1477491624697405368L;
      long var24 = -174704771659859072L;
      illiIiIlIiliIiIl var15 = this.ilIIililil;
      boolean var64;
      if (var15 instanceof illiIiIlIiliIiIl) {
         illiIiIlIiliIiIl var10000 = var15;

         try {
            var45 = var10000.IliIlllilIi();
         } catch (Throwable var35) {
            throw new MatchException(var35.toString(), var35);
         }

         var18 ^= ((long)var45 << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)((int)(var18 >>> 32)) ^ var18) & -1L >>> 32;
         var10000 = var15;

         try {
            var10000.liiiIIllIl();
         } catch (Throwable var34) {
            throw new MatchException(var34.toString(), var34);
         }

         var10000 = var15;

         try {
            var10000.iIlIlllllill();
         } catch (Throwable var33) {
            throw new MatchException(var33.toString(), var33);
         }

         var10000 = var15;

         try {
            var49 = var10000.IilliliilIIi();
         } catch (Throwable var32) {
            throw new MatchException(var32.toString(), var32);
         }

         var18 ^= ((long)var49 << 32 ^ var18) & -1L << 32;
         var20 ^= ((long)((int)(var18 >>> 32)) << 32 ^ var20) & -1L << 32;
         var10000 = var15;

         try {
            var51 = var10000.lIiiIiIlilli();
         } catch (Throwable var31) {
            throw new MatchException(var31.toString(), var31);
         }

         var18 ^= ((long)var51 << 32 ^ var18) & -1L << 32;
         long var52 = var20 ^ ((long)((int)(var18 >>> 32)) ^ var20) & -1L >>> 32;
         illiIiIlIiliIiIl var53 = var15;

         try {
            var54 = var53.iliIiiliiiii();
         } catch (Throwable var30) {
            throw new MatchException(var30.toString(), var30);
         }

         var18 ^= ((long)var54 << 32 ^ var18) & -1L << 32;
         var22 ^= ((long)((int)(var18 >>> 32)) << 32 ^ var22) & -1L << 32;
         var53 = var15;

         try {
            var56 = var53.IIIllIIliIIl();
         } catch (Throwable var29) {
            throw new MatchException(var29.toString(), var29);
         }

         var18 ^= ((long)var56 << 32 ^ var18) & -1L << 32;
         long var57 = var22 ^ ((long)((int)(var18 >>> 32)) ^ var22) & -1L >>> 32;
         illiIiIlIiliIiIl var58 = var15;

         try {
            var59 = var58.IlIlllIlilIl();
         } catch (Throwable var28) {
            throw new MatchException(var28.toString(), var28);
         }

         var18 ^= ((long)var59 << 32 ^ var18) & -1L << 32;
         long var60 = var24 ^ ((long)((int)(var18 >>> 32)) << 32 ^ var24) & -1L << 32;
         illiIiIlIiliIiIl var61 = var15;

         try {
            var61.IiIlliIliiIl();
         } catch (Throwable var27) {
            throw new MatchException(var27.toString(), var27);
         }

         var61 = var15;

         try {
            var63 = var61.IIlllIlliIll();
         } catch (Throwable var26) {
            throw new MatchException(var26.toString(), var26);
         }

         iIIIliIlIIli var16 = var63;
         if ((int)var18 != 0 && (var16 == iIIIliIlIIli.IiililIIlliililIIl || var16 == iIIIliIlIIli.iiililIIlIIIiilIIl)) {
            var64 = true;
            return var64;
         }
      }

      var64 = false;
      return var64;
   }

   private iIllllIlIlllllIl liilliiill(lliiilIiiliiilIi tol, class_243 self, double feet) {
      class_243 var5 = tol.liiiIIllIl();
      double var6 = self.field_1352 - var5.field_1352;
      double var8 = self.field_1350 - var5.field_1350;
      double var10 = Math.hypot(var6, var8);
      this.lIlIililil = var10;
      if (!(var10 > feet)) {
         this.liilililil = iIiIllilIliIllil.iliilliIil;
         return this.illliIilli(tol, Illlilllli(false, (double)0.0F, (double)0.0F, true, false, false));
      } else {
         this.IiIIililil = true;
         double[] var12 = IiiIIlliiIIl(var6, var8);
         this.lIIiiiIIii(var12);
         return var12 == null ? this.illliIilli(tol, Illlilllli(false, (double)0.0F, (double)0.0F, true, false, false)) : this.illliIilli(tol, Illlilllli(true, var12[0], var12[1], true, false, false));
      }
   }

   double lIliliIlil() {
      return Math.hypot(this.IIliililil, this.lIliililil);
   }

   private void Iiiiliiiiiii() {
      this.illiililil = null;
      this.Iiliililil = Long.MIN_VALUE;
   }

   private boolean lIiiiiIiii(lliiilIiiliiilIi dz, double collided, double self, boolean dx) {
      class_243 var7 = dz.liiiIIllIl();
      if (this.iIIIIlIlIIIl(var7)) {
         return false;
      } else if (this.iIIIililil.Ililllililil()) {
         return false;
      } else if (dx) {
         return !this.iIIIililil.IIillIiliIil();
      } else {
         return this.Iliiilliii(var7, collided, self, 0.35) || this.Iliiilliii(var7, collided, self, 0.6);
      }
   }

   public boolean Iiilliiliiil() {
      return this.liliililil;
   }

   // $FF: synthetic method
   private static CallSite iIllIlIlllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) ^ var5) + 9361) + '\uf0cc') - 29764) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) ^ var5) + 9361) + '\uf0cc') - 29764) - var5) >>> 12) - 28931) - 3540) ^ 7513))) - 15538));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean IIIlilIIli(long tick) {
      return !this.illlililil && this.llllililil != Long.MIN_VALUE && tick - this.llllililil <= 6L;
   }

   int Illlllllilll() {
      return this.ilIiililil;
   }

   public void IIiilIiiiIii(iIilIiIiIlilIiIi spot) {
      this.llliililil = spot;
   }

   public iIllllIlIlllllIl IliIlllilIi(long dodge, lliiilIiiliiilIi d, IlIIlIlllIIlIl self, class_243 goal, IiliIililiIi tick, IiiIliliiIli anchorDetonatePending, boolean facePoint) {
      long var33 = 5872794754278961579L;
      long var25 = -1053838440281571393L;
      long var27 = 5820076718552900247L;
      long var29 = 3916358402044561602L;
      long var31 = 1186370567874961713L;
      this.ilIIililil = null;
      this.liilililil = null;
      this.IIIiililil = false;
      this.iIliililil = false;
      this.liliililil = false;
      this.iIiiililil = false;
      this.liiiililil = false;
      this.Iliiililil = false;
      var25 ^= ((long)this.ilIlililil << 32 ^ var25) & -1L << 32;
      this.ilIlililil = false;
      this.iiIilIIlil(dodge, goal);
      if (d != null && d.liiiIIllIl() != null && iiiIIlIIIlIl(d.liiiIIllIl())) {
         if (IlIIillIIi(anchorDetonatePending)) {
            tick = null;
            this.iIllililil = null;
            this.Illlililil = Long.MIN_VALUE;
         }

         class_243 var10 = d.liiiIIllIl();
         var25 ^= ((long)this.iIIIililil.IiIlliIliiIl() ^ var25) & -1L >>> 32;
         this.ilIiiIiIii(dodge, var10, this.IlIIililil.liiiIIllIl(this.liIIililil, var10.field_1352, var10.field_1350, this.IIlIililil, (boolean)((int)var25), d.iliIiiliiiii()));
         var27 ^= ((long)(!this.liiIililil || (int)var25 != 0 && this.iIIIililil.IIillIiliIil() ? 0 : 1) << 32 ^ var27) & -1L << 32;
         this.liiIililil = false;
         float var13 = d.Iliilliiilii();
         var27 ^= ((long)(!Float.isNaN(this.Iillililil) && !Float.isNaN(var13) && var13 + 0.3F < this.Iillililil ? 1 : 0) ^ var27) & -1L >>> 32;
         this.Iillililil = var13;
         class_243 var15 = d.lIiiIiIlilli();
         var29 ^= ((long)(!d.iliIiiliiiii() || var15 != null && !(Math.abs(var15.field_1351) < 0.08) ? 0 : 1) << 32 ^ var29) & -1L << 32;
         this.iiIlililil = (int)(var29 >>> 32) != 0 ? Math.min(this.iiIlililil + 1, 10) : 0;
         var29 ^= ((long)(this.llIlililil && this.iiIlililil >= 2 ? 1 : 0) ^ var29) & -1L >>> 32;
         if ((int)var29 != 0) {
            this.llIlililil = false;
         }

         var31 ^= ((long)(!this.iIIIililil.IliIlllilIi() && !d.IllIllllIl() ? 0 : 1) << 32 ^ var31) & -1L << 32;
         var31 ^= ((long)this.IilliliilIIi(dodge, anchorDetonatePending, d.Illillliilli()) ^ var31) & -1L >>> 32;
         long var20 = this.iIIIililil.liiiIIllIl();
         var33 ^= ((long)(var20 < this.lIiiIiIlilli(dodge, var20) ? 1 : 0) << 32 ^ var33) & -1L << 32;
         if ((int)(var31 >>> 32) == 0 && (int)(var33 >>> 32) == 0) {
            if ((int)var31 != 0 && !this.iliIiiliiiii(dodge, tick)) {
               this.iillililil = false;
               this.IilIililIi();
               this.liilililil = iIiIllilIliIllil.IIiilliIil;
               return this.IiIIIlliIIIl(this.illliIilli(d, iIllllIlIlllllIl.IliIlllilIi().iliIiiliiiii()));
            } else {
               IlliIiIlllliIiIl var23 = IiIilliIil(anchorDetonatePending);
               if (var23 == null) {
                  this.IilIililIi();
               }

               iIllllIlIlllllIl var24 = var23 != null ? this.lIIIiiIIIi(dodge, d, var23, goal, tick, anchorDetonatePending, facePoint, (boolean)((int)var29), (boolean)((int)var27), (boolean)((int)var25), (boolean)((int)(var27 >>> 32))) : this.iiiilIIIIi(dodge, d, self, goal, tick, anchorDetonatePending, (boolean)((int)var29), (boolean)((int)var25), (boolean)((int)(var27 >>> 32)));
               if ((int)(var25 >>> 32) != 0 && this.liilililil != iIiIllilIliIllil.lliilliIil && iIlIlllllill(var24, this.IiIlililil, this.liIlililil)) {
                  this.liilililil = iIiIllilIliIllil.iIiilliIil;
                  this.IiIIililil = false;
                  return this.IiIIIlliIIIl(var24.IIIllIIliIIl());
               } else {
                  return this.IiIIIlliIIIl(var24);
               }
            }
         } else {
            this.iillililil = false;
            this.IilIililIi();
            this.liilililil = (int)(var31 >>> 32) != 0 ? iIiIllilIliIllil.lililliIil : iIiIllilIliIllil.iililliIil;
            return this.IiIIIlliIIIl(iIllllIlIlllllIl.IliIlllilIi());
         }
      } else {
         this.iillililil = false;
         this.liiIililil = false;
         this.IilIililIi();
         return this.IiIIIlliIIIl(iIllllIlIlllllIl.IliIlllilIi());
      }
   }

   private IiliIililiIi IiIliliIli(long dodge, IiliIililiIi tick) {
      if (tick != null) {
         this.iIllililil = tick;
         this.Illlililil = dodge + (long)Math.max(1, tick.IilliliilIIi());
         return tick;
      } else if (this.iIllililil != null && dodge < this.Illlililil) {
         return this.iIllililil;
      } else {
         this.iIllililil = null;
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite lIIlIliIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5088100711105102003L ^ Long.rotateLeft(4080242471380770768L, 40) ^ -4172314128919921067L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -280413456467791616L ^ Long.rotateLeft(-1523757227518958789L, 26) ^ 2813056027928660685L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3262427272395456305L ^ Long.rotateLeft(-1535946878203136054L, 15) ^ -4398653703035854544L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 875115823405421956L ^ Long.rotateLeft(6271388158246011769L, 56) ^ -8550685579770259025L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4719154685118496455L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8492273817416520464L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5284718365652699304L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6976032157646188520L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3451916402886799714L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6137347230116775406L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlIlllIlIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, ilIlIlIiIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, liIlIliiIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIllIllIllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIllIlIlllIl<invokedynamic>());
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

   static double iIiIIlIliIIl(liIIliliiIIlil x, double z, double env, double feetY) {
      return lliIIliliIIl(x, z, env, feetY, 3);
   }

   private void lIIlliIIll() {
      this.IIiiililil = null;
      this.lIiiililil = Long.MIN_VALUE;
   }

   static double IlIiillIii(class_243 v) {
      if (v == null) {
         return (double)0.0F;
      } else {
         double var1 = Math.hypot(v.field_1352, v.field_1350);
         return Double.isFinite(var1) ? var1 / 0.45399999999999996 : (double)0.0F;
      }
   }

   private double[] iliIiIiiIi(class_243 keep, class_243 pos) {
      long var19 = 6529322977590843179L;
      long var21 = 6706250978779034379L;
      var19 ^= ((long)((int)Math.floor(keep.field_1352)) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)((int)Math.floor(keep.field_1350)) ^ var19) & -1L >>> 32;
      double var5 = Double.POSITIVE_INFINITY;
      double[] var7 = null;

      for(var21 ^= (-4294967296L ^ var21) & -1L << 32; (int)(var21 >>> 32) <= 1; var21 += 4294967296L) {
         for(var21 ^= ~var21 & -1L >>> 32; (int)var21 <= 1; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
            if ((int)(var21 >>> 32) != 0 || (int)var21 != 0) {
               double var10 = (double)((int)(var19 >>> 32) + (int)(var21 >>> 32)) + (double)0.5F;
               double var12 = (double)((int)var19 + (int)var21) + (double)0.5F;
               double var14 = lliIIliliIIl(this.iIIIililil, var10, var12, keep.field_1351, 1);
               if (Double.isFinite(var14) && !(Math.abs(var14 - keep.field_1351) > 0.601) && (this.iIIIililil.lIiiIiIlilli(class_2338.method_49637(var10, var14 + 0.001, var12)) & 351) == 0 && IllIIllllIIl(this.iIIIililil, keep, new class_243(var10, keep.field_1351, var12), false, (double)1.5F, 1)) {
                  double var16 = ((int)(var21 >>> 32) != 0 && (int)var21 != 0 ? 0.3 : (double)0.0F) + (pos != null && iiiIIlIIIlIl(pos) ? Math.hypot(var10 - pos.field_1352, var12 - pos.field_1350) : (double)0.0F);
                  if (var16 < var5) {
                     double[] var18 = IiiIIlliiIIl(var10 - keep.field_1352, var12 - keep.field_1350);
                     if (var18 != null) {
                        var5 = var16;
                        var7 = var18;
                     }
                  }
               }
            }
         }
      }

      return var7;
   }

   static double lliIIliliIIl(liIIliliiIIlil env, double feetY, double x, double z, int maxDrop) {
      long var19 = 5317785895992355992L;
      long var21 = 3417809530087669315L;
      long var23 = 853006237463400391L;
      long var25 = -3372525729341859936L;
      long var27 = -7537086582235647914L;
      var19 ^= ((long)((int)Math.floor(feetY)) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)((int)Math.floor(x)) ^ var19) & -1L >>> 32;
      var21 ^= ((long)Math.max(0, maxDrop) << 32 ^ var21) & -1L << 32;
      var21 ^= ((long)((int)Math.floor(z + (double)1.0F)) ^ var21) & -1L >>> 32;
      var23 ^= ((long)((int)Math.floor(z + 0.001) - (int)(var21 >>> 32) - 1) << 32 ^ var23) & -1L << 32;

      for(long var34 = var23 ^ ((long)((int)var21) ^ var23) & -1L >>> 32; (int)var34 >= (int)(var34 >>> 32); var34 ^= (var34 ^ var34 + (long)-1) & -1L >>> 32) {
         if (env.iIlIlllllill((int)(var19 >>> 32), (int)var34, (int)var19)) {
            double var14 = env.IilliliilIIi((int)(var19 >>> 32), (int)var34, (int)var19);
            if (!Double.isNaN(var14)) {
               if (var14 > z + (double)1.0F + 0.001) {
                  return Double.POSITIVE_INFINITY;
               }

               if (z - var14 > (double)((int)(var21 >>> 32)) + 0.001) {
                  return Double.NaN;
               }

               var25 ^= ((long)Math.max((int)var34 + 1, (int)Math.floor(var14 + 0.001)) << 32 ^ var25) & -1L << 32;
               var25 ^= ((long)((int)Math.floor(var14 + 1.8 - 0.001)) ^ var25) & -1L >>> 32;

               for(long var37 = var27 ^ ((long)((int)(var25 >>> 32)) << 32 ^ var27) & -1L << 32; (int)(var37 >>> 32) <= (int)var25; var37 += 4294967296L) {
                  if (env.iIlIlllllill((int)(var19 >>> 32), (int)(var37 >>> 32), (int)var19)) {
                     return Double.POSITIVE_INFINITY;
                  }
               }

               return var14;
            }
         }
      }

      return Double.NaN;
   }

   private class_243 iilllIIill(long tick, class_243 want, class_243 swim, class_243 him, boolean pos) {
      double[] var7 = this.IIiiililil;
      if (var7 != null && lIilliIill(this.iIIIililil, var7, want, swim, this.llliililil, pos)) {
         return new class_243(var7[0], var7[1], var7[2]);
      } else {
         this.IIiiililil = null;
         if (this.lIiiililil != Long.MIN_VALUE && tick >= this.lIiiililil && tick - this.lIiiililil < 4L) {
            return null;
         } else {
            this.lIiiililil = tick;
            double[] var8 = Ilillllill(this.iIIIililil, want, swim, him, this.llliililil, this.llIIililil.lIiiIiIlilli(), pos);
            this.IIiiililil = var8;
            return var8 == null ? null : new class_243(var8[0], var8[1], var8[2]);
         }
      }
   }

   static boolean iIlIlllllill(iIllllIlIlllllIl out, double kz, double kx) {
      return out != null && out.IlIlllIlilIl() && !out.Ililllililil() && out.IiIlliIliiIl() * kz + out.IIlllIlliIll() * kx > 0.001;
   }

   public boolean IlIillIiilIi() {
      return this.iIiiililil;
   }

   static boolean IIllllIlll(liIIliliiIIlil pos, double[] cell, class_243 swim, boolean env) {
      if (pos != null && cell != null && cell.length >= 3 && swim != null && iiiIIlIIIlIl(swim)) {
         if (env && cell[1] > lllllillll(pos, swim) + 1.2 + 0.001) {
            return false;
         } else if (Math.hypot(cell[0] - swim.field_1352, cell[2] - swim.field_1350) > (double)25.0F) {
            return false;
         } else {
            double var4 = Iillllilll(pos, (int)Math.floor(cell[0]), (int)Math.floor(cell[2]), cell[1]);
            return Double.isFinite(var4) && Math.abs(var4 - cell[1]) < 1.0E-6;
         }
      } else {
         return false;
      }
   }

   int IIIilIIiiIIi() {
      return this.iiliililil;
   }

   private void iiiliIIIii(class_243 target) {
      if (this.lIiIililil == null || Math.hypot(this.lIiIililil.field_1352 - target.field_1352, this.lIiIililil.field_1350 - target.field_1350) > (double)0.75F || Math.abs(this.lIiIililil.field_1351 - target.field_1351) > (double)1.0F) {
         this.lIiIililil = target;
         this.iIiIililil = false;
      }

   }

   private void iiIilIIlil(long tick, class_243 face) {
      long var14 = -3467827921810646644L;
      if (face != null && iiiIIlIIIlIl(face)) {
         if (tick != this.iiIiililil || this.IiIiililil == null) {
            var14 ^= ((long)(this.IiIiililil != null && this.liIiililil != Long.MIN_VALUE && this.iiIiililil != Long.MIN_VALUE && tick == this.iiIiililil + 1L ? 1 : 0) << 32 ^ var14) & -1L << 32;
            this.iiIiililil = tick;
            if ((int)(var14 >>> 32) == 0) {
               this.IiIiililil = face;
               this.liIiililil = tick;
               this.IIliililil = (double)0.0F;
               this.lIliililil = (double)0.0F;
            } else {
               double var5 = face.field_1352 - this.IiIiililil.field_1352;
               double var7 = face.field_1350 - this.IiIiililil.field_1350;
               double var9 = Math.hypot(var5, var7);
               long var11 = Math.max(1L, tick - this.liIiililil);
               if (!(var9 > 1.0E-4)) {
                  if (var11 >= 3L) {
                     this.IIliililil *= (double)0.5F;
                     this.lIliililil *= (double)0.5F;
                  }

               } else {
                  var14 ^= ((long)((int)Math.min(var11, 2L)) ^ var14) & -1L >>> 32;
                  if (var9 > (double)1.5F * (double)((int)var14)) {
                     this.IIliililil = (double)0.0F;
                     this.lIliililil = (double)0.0F;
                  } else {
                     this.IIliililil += (double)0.5F * (var5 / (double)((int)var14) - this.IIliililil);
                     this.lIliililil += (double)0.5F * (var7 / (double)((int)var14) - this.lIliililil);
                  }

                  this.IiIiililil = face;
                  this.liIiililil = tick;
               }
            }
         }
      } else {
         this.IiIiililil = null;
         this.liIiililil = Long.MIN_VALUE;
         this.iiIiililil = Long.MIN_VALUE;
         this.IIliililil = (double)0.0F;
         this.lIliililil = (double)0.0F;
      }
   }

   static boolean IiIIlliIIl(class_243 face, class_243 a) {
      double var2 = face.field_1351 - a.field_1351;
      return var2 >= (double)-0.25F && var2 <= (double)1.5F;
   }

   static boolean iilIiIIiIi(iIllIlllIlllIlll feetY, double standY, double nt) {
      if (feetY != null && feetY.IIIllIIliIIl() == iiIIllIlIIlIllIl.iIililIiIl && Double.isFinite(standY)) {
         return nt <= standY + 0.6 + 0.001;
      } else {
         return true;
      }
   }

   private iIllllIlIlllllIl lIiIiiIiIi(long tick, lliiilIiiliiilIi self, class_243 d, IiiIliliiIli keep) {
      long var9 = -2513261371520972777L;
      var9 ^= ((long)(this.iIilililil != Long.MIN_VALUE && tick >= this.iIilililil && tick - this.iIilililil <= 1L ? 0 : 1) << 32 ^ var9) & -1L << 32;
      this.iIilililil = tick;
      if ((int)(var9 >>> 32) != 0) {
         this.lIilililil = false;
         this.llilililil = Long.MIN_VALUE;
      }

      if (keep != null && keep.IilliliilIIi() == iIlIIIIiIllIIIIi.lIIIiiIiil) {
         return null;
      } else {
         class_243 var7 = self.liiiIIllIl();
         if (!this.IliIilliIi(var7)) {
            this.lIilililil = false;
            return null;
         } else {
            if (this.lIilililil && (tick < this.Ililililil || tick - this.Ililililil >= 6L)) {
               this.lIilililil = false;
               this.llilililil = tick + 6L;
            }

            if (!this.lIilililil) {
               if (this.llilililil != Long.MIN_VALUE && tick < this.llilililil) {
                  return null;
               }

               double[] var8 = this.iliIiIiiIi(var7, d);
               if (var8 == null) {
                  return null;
               }

               this.lIilililil = true;
               this.Ililililil = tick;
               this.ililililil = var8[0];
               this.Iiilililil = var8[1];
            }

            this.liilililil = iIiIllilIliIllil.lliilliIil;
            return this.illliIilli(self, Illlilllli(true, this.ililililil, this.Iiilililil, false, false, false));
         }
      }
   }

   private static iIllllIlIlllllIl Illlilllli(boolean sprint, double jump, double move, boolean urgent, boolean dz, boolean dx) {
      long var10 = 4832836310118804177L;
      double[] var8 = sprint ? IiiIIlliiIIl(jump, move) : null;
      var10 ^= ((long)(var8 != null ? 1 : 0) << 32 ^ var10) & -1L << 32;
      return new iIllllIlIlllllIl((boolean)((int)(var10 >>> 32)), (int)(var10 >>> 32) != 0 ? var8[0] : (double)0.0F, (int)(var10 >>> 32) != 0 ? var8[1] : (double)0.0F, urgent ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, (int)(var10 >>> 32) != 0 && dz ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili, dx);
   }

   int Iilililiiili() {
      return this.iiiiililil;
   }

   static double[] illIlIilIl(liIIliliiIIlil a, class_243 spot, class_243 want, class_243 pos, iIilIiIiIlilIiIi maxDrop, int env) {
      return lilIliilIl(a, spot, want, pos, maxDrop, env, false);
   }

   private boolean Iliiilliii(class_243 dx, double ahead, double dz, double pos) {
      return iliiiIiiii(this.iIIIililil, dx, ahead, dz, pos);
   }

   private iIllllIlIlllllIl illliIilli(lliiilIiiliiilIi in, iIllllIlIlllllIl self) {
      long var22 = 1952098115194282713L;
      long var24 = 4340004499782033815L;
      if (self instanceof iIllllIlIlllllIl) {
         iIllllIlIlllllIl var10000 = self;

         try {
            var44 = var10000.IlIlllIlilIl();
         } catch (Throwable var32) {
            throw new MatchException(var32.toString(), var32);
         }

         var22 ^= ((long)var44 << 32 ^ var22) & -1L << 32;
         var22 ^= ((long)((int)(var22 >>> 32)) ^ var22) & -1L >>> 32;
         var10000 = self;

         try {
            var46 = var10000.IiIlliIliiIl();
         } catch (Throwable var31) {
            throw new MatchException(var31.toString(), var31);
         }

         double var13 = var46;
         double var4 = var13;
         var10000 = self;

         try {
            var48 = var10000.IIlllIlliIll();
         } catch (Throwable var30) {
            throw new MatchException(var30.toString(), var30);
         }

         var13 = var48;
         double var6 = var13;
         var10000 = self;

         try {
            var50 = var10000.Illlllllilll();
         } catch (Throwable var29) {
            throw new MatchException(var29.toString(), var29);
         }

         IilIIIililIIIi var34 = var50;
         IilIIIililIIIi var8 = var34;
         var10000 = self;

         try {
            var10000.Iilllilliill();
         } catch (Throwable var28) {
            throw new MatchException(var28.toString(), var28);
         }

         var10000 = self;

         try {
            var53 = var10000.IIillIiliIil();
         } catch (Throwable var27) {
            throw new MatchException(var27.toString(), var27);
         }

         var34 = var53;
         var10000 = self;

         try {
            var55 = var10000.Ililllililil();
         } catch (Throwable var26) {
            throw new MatchException(var26.toString(), var26);
         }

         var22 ^= ((long)var55 << 32 ^ var22) & -1L << 32;
         var24 ^= ((long)((int)(var22 >>> 32)) << 32 ^ var24) & -1L << 32;
         if ((int)var22 == 0 || !this.lilliiilli() || var8 != IilIIIililIIIi.IIillIililIillIili && in.iliIiiliiiii()) {
            iIiiIlIliiIl var12 = this.IIililIili(in, (int)var22 != 0 ? var4 : (double)0.0F, (int)var22 != 0 ? var6 : (double)0.0F, (boolean)((int)var22));
            if (!var12.iIlIlllllill()) {
               return new iIllllIlIlllllIl((boolean)((int)var22), var4, var6, var8, IilIIIililIIIi.iIillIiliIlillIili, var34, (boolean)((int)(var24 >>> 32)));
            } else {
               this.liilililil = iIiIllilIliIllil.liiilliIil;
               if ((int)var22 != 0 && this.IiIIililil) {
                  this.iiIIililil = true;
               }

               var22 ^= ((long)((int)var22) << 32 ^ var22) & -1L << 32;
               double var14 = var4;
               double var16 = var6;
               double var18 = var4 * var12.IilliliilIIi() + var6 * var12.lIiiIiIlilli();
               if ((int)(var22 >>> 32) != 0 && var18 > (double)0.0F) {
                  var14 = var4 - var18 * var12.IilliliilIIi();
                  var16 = var6 - var18 * var12.lIiiIiIlilli();
                  double var20 = Math.hypot(var14, var16);
                  if (var20 < 0.15) {
                     var22 ^= (0L ^ var22) & -1L << 32;
                     var14 = (double)0.0F;
                     var16 = (double)0.0F;
                  } else {
                     var14 /= var20;
                     var16 /= var20;
                  }
               }

               class_243 var38 = in.lIiiIiIlilli();
               return (int)(var22 >>> 32) == 0 && var38 != null && Double.isFinite(var38.field_1352) && Double.isFinite(var38.field_1350) && Math.hypot(var12.IilliliilIIi(), var12.lIiiIiIlilli()) > (double)0.5F && var38.field_1352 * var12.IilliliilIIi() + var38.field_1350 * var12.lIiiIiIlilli() > 0.05 ? new iIllllIlIlllllIl(true, -var12.IilliliilIIi(), -var12.lIiiIiIlilli(), IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, true) : new iIllllIlIlllllIl((boolean)((int)(var22 >>> 32)), var14, var16, var8 == IilIIIililIIIi.IIillIililIillIili ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, (int)(var22 >>> 32) != 0 && var34 == IilIIIililIIIi.IIillIililIillIili ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili, true);
            }
         } else {
            return new iIllllIlIlllllIl((boolean)((int)var22), var4, var6, var8, IilIIIililIIIi.iIillIiliIlillIili, var34, (boolean)((int)(var24 >>> 32)));
         }
      } else {
         return iIllllIlIlllllIl.IliIlllilIi();
      }
   }

   private boolean liiiiiiiii(lliiilIiiliiilIi self, double dx, double dist, double dz) {
      return this.IIIIIllIIIIl(self, dx, dist, dz, false);
   }

   private static boolean lliililiil(iIlIIIIiIllIIIIi lane) {
      return lane == null || lane == iIlIIIIiIllIIIIi.lliiliIiil || lane == iIlIIIIiIllIIIIi.liiiliIiil;
   }

   private iIllllIlIlllllIl IiIIIlliIIIl(iIllllIlIlllllIl out) {
      this.liIIililil = this.IiIIililil || this.iiIIililil;
      this.IIlIililil = this.lIlIililil;
      this.IiIIililil = false;
      this.iiIIililil = false;
      this.lIlIililil = Double.NaN;
      iIllllIlIlllllIl var2 = this.iiIIIlIIlIIl(out);
      this.iiilililil = this.IIIiililil ? iIiIllilIliIllil.iiiilliIil : (this.liilililil != null ? this.liilililil : (var2.IlIlllIlilIl() ? iIiIllilIliIllil.IIIIiliIil : iIiIllilIliIllil.lIIIiliIil));
      return var2;
   }

   private iiIIliIiIIlIliIi Iiililiili(long leave, lliiilIiiliiilIi nt, class_243 target, double tick, double self, iIllIlllIlllIlll tolerance) {
      long var49 = 5789950425295079052L;
      long var51 = -2445385696854159143L;
      long var53 = -6491436591258182209L;
      long var43 = -6072270202630771616L;
      long var45 = 7575453296123391945L;
      long var47 = -5772483928679593596L;
      class_243 var10 = nt.liiiIIllIl();
      double var11 = target.field_1352 - var10.field_1352;
      double var13 = target.field_1350 - var10.field_1350;
      double var15 = Math.hypot(var11, var13);
      var43 ^= ((long)((!Double.isFinite(target.field_1351) || Math.abs(target.field_1351 - var10.field_1351) <= 1.1) && iilIiIIiIi(tolerance, target.field_1351, var10.field_1351) ? 1 : 0) << 32 ^ var43) & -1L << 32;
      var43 ^= ((long)(this.IliIilliIi(target) && !this.IliIilliIi(var10) ? 1 : 0) ^ var43) & -1L >>> 32;
      double var19 = (int)var43 != 0 ? Math.max(tick, 1.6) : tick;
      double var21 = (int)var43 != 0 ? Math.max(self, (double)2.0F) : self;
      var45 ^= ((long)IIlIilIlIi(tolerance, var10, target, tick) << 32 ^ var45) & -1L << 32;
      this.iiiliIIIii(target);
      if (this.iIiIililil && (var15 > var21 || (int)(var43 >>> 32) == 0 && nt.iliIiiliiiii() || (int)(var45 >>> 32) == 0)) {
         this.iIiIililil = false;
      }

      if (!this.iIiIililil && var15 <= var19 && (int)(var43 >>> 32) != 0 && (int)(var45 >>> 32) != 0) {
         this.iIiIililil = true;
         this.lliIililil = Long.MIN_VALUE;
      }

      if (this.iIiIililil) {
         this.ilIIililil = null;
         this.lIlIililil = var15;
         this.liilililil = iIiIllilIliIllil.iliilliIil;
         return new iiIIliIiIIlIliIi(false, (double)0.0F, (double)0.0F, true, var15, false, false);
      } else {
         this.IiIIililil = true;
         iIllIlllIlllIlll var24 = tolerance != null ? tolerance : iIllIlllIlllIlll.IliIlllilIi(target);
         if (this.llIIililil.Iilllilliill(leave, var10, var24)) {
            this.ilIIililil = null;
            this.lIlIililil = var15;
            double[] var65 = IiiIIlliiIIl(var11, var13);
            this.lIIiiiIIii(var65);
            class_243 var26 = nt.lIiiIiIlilli();
            var45 ^= ((long)(leave < this.iIlIililil ? 1 : 0) ^ var45) & -1L >>> 32;
            var47 ^= ((long)(iIiilIliil(var24) && this.lIliliIlil() >= 0.08 ? 1 : 0) << 32 ^ var47) & -1L << 32;
            if ((int)var45 == 0 && !this.iIliililil && (int)(var47 >>> 32) == 0 && nt.iliIiiliiiii() && var26 != null && var26.field_1352 * var11 + var26.field_1350 * var13 > (double)0.0F && var15 <= IlIiillIii(var26)) {
               this.liilililil = iIiIllilIliIllil.IiiilliIil;
               return new iiIIliIiIIlIliIi(false, (double)0.0F, (double)0.0F, false, var15, false, false);
            } else {
               double[] var29 = (int)var45 != 0 ? new double[]{this.IllIililil, this.lllIililil} : (var65 == null ? IIIIililil : var65);
               return new iiIIliIiIIlIliIi(true, var29[0], var29[1], false, var15, false, false);
            }
         } else {
            illiIiIlIiliIiIl var25 = this.llIIililil.Ililllililil(leave, var10, nt.lIiiIiIlilli(), nt.iliIiiliiiii(), this.iIIIililil.IiIlliIliiIl(), this.iIIIililil.IIlllIlliIll(), var24);
            this.ilIIililil = var25;
            var47 ^= ((long)(leave < this.iIlIililil ? 1 : 0) ^ var47) & -1L >>> 32;
            if (var25 instanceof illiIiIlIiliIiIl) {
               illiIiIlIiliIiIl var10000 = var25;

               try {
                  var86 = var10000.IliIlllilIi();
               } catch (Throwable var64) {
                  throw new MatchException(var64.toString(), var64);
               }

               var49 ^= ((long)var86 << 32 ^ var49) & -1L << 32;
               var45 ^= ((long)((int)(var49 >>> 32)) ^ var45) & -1L >>> 32;
               var10000 = var25;

               try {
                  var88 = var10000.liiiIIllIl();
               } catch (Throwable var63) {
                  throw new MatchException(var63.toString(), var63);
               }

               double var41 = var88;
               double var28 = var41;
               var10000 = var25;

               try {
                  var90 = var10000.iIlIlllllill();
               } catch (Throwable var62) {
                  throw new MatchException(var62.toString(), var62);
               }

               var41 = var90;
               double var30 = var41;
               var10000 = var25;

               try {
                  var92 = var10000.IilliliilIIi();
               } catch (Throwable var61) {
                  throw new MatchException(var61.toString(), var61);
               }

               var49 ^= ((long)var92 << 32 ^ var49) & -1L << 32;
               var49 ^= ((long)((int)(var49 >>> 32)) ^ var49) & -1L >>> 32;
               var10000 = var25;

               try {
                  var94 = var10000.lIiiIiIlilli();
               } catch (Throwable var60) {
                  throw new MatchException(var60.toString(), var60);
               }

               var49 ^= ((long)var94 << 32 ^ var49) & -1L << 32;
               var51 ^= ((long)((int)(var49 >>> 32)) << 32 ^ var51) & -1L << 32;
               var10000 = var25;

               try {
                  var96 = var10000.iliIiiliiiii();
               } catch (Throwable var59) {
                  throw new MatchException(var59.toString(), var59);
               }

               var49 ^= ((long)var96 << 32 ^ var49) & -1L << 32;
               var51 ^= ((long)((int)(var49 >>> 32)) ^ var51) & -1L >>> 32;
               var10000 = var25;

               try {
                  var98 = var10000.IIIllIIliIIl();
               } catch (Throwable var58) {
                  throw new MatchException(var58.toString(), var58);
               }

               var49 ^= ((long)var98 << 32 ^ var49) & -1L << 32;
               var53 ^= ((long)((int)(var49 >>> 32)) << 32 ^ var53) & -1L << 32;
               var10000 = var25;

               try {
                  var100 = var10000.IlIlllIlilIl();
               } catch (Throwable var57) {
                  throw new MatchException(var57.toString(), var57);
               }

               var49 ^= ((long)var100 << 32 ^ var49) & -1L << 32;
               long var101 = var53 ^ ((long)((int)(var49 >>> 32)) ^ var53) & -1L >>> 32;
               illiIiIlIiliIiIl var102 = var25;

               try {
                  var103 = var102.IiIlliIliiIl();
               } catch (Throwable var56) {
                  throw new MatchException(var56.toString(), var56);
               }

               var41 = var103;
               var102 = var25;

               try {
                  var102.IIlllIlliIll();
               } catch (Throwable var55) {
                  throw new MatchException(var55.toString(), var55);
               }

               this.lIlIililil = Double.isFinite(var41) ? var41 : var15;
               if ((int)var51 != 0) {
                  this.IiIIililil = false;
                  this.liilililil = iIiIllilIliIllil.iliilliIil;
                  return new iiIIliIiIIlIliIi(false, (double)0.0F, (double)0.0F, true, this.lIlIililil, false, false);
               } else if ((int)var45 == 0) {
                  return (int)var47 != 0 ? new iiIIliIiIIlIliIi(true, this.IllIililil, this.lllIililil, false, this.lIlIililil, false, false) : new iiIIliIiIIlIliIi(false, (double)0.0F, (double)0.0F, false, this.lIlIililil, false, false);
               } else {
                  double[] var40 = IiiIIlliiIIl(var28, var30);
                  this.lIIiiiIIii(var40);
                  double[] var68 = (int)var47 != 0 ? new double[]{this.IllIililil, this.lllIililil} : (var40 == null ? IIIIililil : var40);
                  return new iiIIliIiIIlIliIi(true, var68[0], var68[1], false, this.lIlIililil, (boolean)((int)var49), (boolean)((int)(var51 >>> 32)));
               }
            } else {
               this.lIlIililil = var15;
               return (int)var47 != 0 ? new iiIIliIiIIlIliIi(true, this.IllIililil, this.lllIililil, false, var15, false, false) : new iiIIliIiIIlIliIi(false, (double)0.0F, (double)0.0F, false, var15, false, false);
            }
         }
      }
   }

   static boolean IllIllllIl(liIIliliiIIlil high, double[] env, class_243 cell, class_243 a, iIilIiIiIlilIiIi spot, boolean want) {
      long var16 = -1557445164401031708L;
      long var14 = -2104101574156753531L;
      if (env != null && env.length >= 3) {
         var14 ^= ((long)(env.length > 3 && env[3] > (double)0.5F ? 1 : 0) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)(env.length > 4 && env[4] > (double)0.5F ? 1 : 0) ^ var14) & -1L >>> 32;
         if (((int)(var14 >>> 32) != 0 || (int)var14 != 0) && !want) {
            return false;
         } else {
            double var8 = Math.hypot(env[0] - cell.field_1352, env[2] - cell.field_1350);
            if (!(var8 < 1.7) && !(var8 > (double)3.5F)) {
               if ((int)var14 == 0 && Math.hypot(env[0] - a.field_1352, env[2] - a.field_1350) > 2.8) {
                  return false;
               } else {
                  var16 ^= ((long)((int)Math.floor(env[0])) << 32 ^ var16) & -1L << 32;
                  var16 ^= ((long)((int)Math.floor(env[2])) ^ var16) & -1L >>> 32;
                  double var12 = (int)(var14 >>> 32) != 0 ? lliIliliIl(high, (int)(var16 >>> 32), (int)var16, cell, spot) : iIiIlIliIl(high, (int)(var16 >>> 32), (int)var16, cell, spot);
                  return Double.isFinite(var12) && Math.abs(var12 - env[1]) < 1.0E-6;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   static double lllllillll(liIIliliiIIlil env, class_243 pos) {
      long var7 = -362093145827120942L;
      long var9 = 3357564629845088724L;
      long var11 = 4020386058583456933L;
      var7 ^= ((long)((int)Math.floor(pos.field_1352)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((int)Math.floor(pos.field_1350)) ^ var7) & -1L >>> 32;
      var9 ^= ((long)((int)Math.floor(pos.field_1351 + 0.001)) << 32 ^ var9) & -1L << 32;
      var9 ^= (-2147483648L ^ var9) & -1L >>> 32;

      for(long var17 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var17 >>> 32) < 12 && (env.lIiiIiIlilli(new class_2338((int)(var7 >>> 32), (int)(var9 >>> 32) + (int)(var17 >>> 32), (int)var7)) & 32) != 0; var17 += 4294967296L) {
         var9 ^= ((long)((int)(var9 >>> 32) + (int)(var17 >>> 32)) ^ var9) & -1L >>> 32;
      }

      return (int)var9 == Integer.MIN_VALUE ? pos.field_1351 : Math.max(pos.field_1351, (double)((int)var9));
   }

   private iIiiIlIliiIl iIiliIlili(class_243 projected, double ox, double oz, boolean pos) {
      long var14 = -5408313077553735823L;
      var14 ^= ((long)(Math.abs(ox) > 1.0E-6 && this.lliliilili(projected, projected.field_1352 + ox, projected.field_1350) ? 1 : 0) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)(Math.abs(oz) > 1.0E-6 && this.lliliilili(projected, projected.field_1352, projected.field_1350 + oz) ? 1 : 0) ^ var14) & -1L >>> 32;
      double var9;
      double var11;
      if ((int)var14 != 0 && (int)(var14 >>> 32) == 0) {
         var9 = (double)0.0F;
         var11 = Math.signum(oz);
      } else if ((int)(var14 >>> 32) != 0 && (int)var14 == 0) {
         var9 = Math.signum(ox);
         var11 = (double)0.0F;
      } else {
         double[] var13 = IiiIIlliiIIl(ox, oz);
         var9 = var13 == null ? (double)0.0F : var13[0];
         var11 = var13 == null ? (double)0.0F : var13[1];
      }

      return new iIiiIlIliiIl(pos, !pos, true, var9, var11);
   }

   static int iiliiIIiii(iIilIiIiIlilIiIi pos, class_243 lz, double lx, double spot) {
      if (pos != null && lz != null && iiiIIlIIIlIl(lz)) {
         double var6 = lz.field_1352 - pos.IliIlllilIi();
         double var8 = lz.field_1350 - pos.iIlIlllllill();
         if (!(Math.hypot(var6, var8) <= (double)6.0F)) {
            return 0;
         } else {
            double var10 = var6 * lx + var8 * spot;
            return var10 > 0.001 ? 1 : (var10 < -0.001 ? -1 : 0);
         }
      } else {
         return 0;
      }
   }

   static double[] lilIliilIl(liIIliliiIIlil pos, class_243 spot, class_243 maxDrop, class_243 a, iIilIiIiIlilIiIi high, int env, boolean want) {
      double[] var7 = IIiIllIiIl(pos, spot, maxDrop, a, high, env, false, false);
      if (var7 == null && want) {
         var7 = IIiIllIiIl(pos, spot, maxDrop, a, high, env, false, true);
         return var7 != null ? var7 : IIiIllIiIl(pos, spot, maxDrop, a, high, env, true, true);
      } else {
         return var7;
      }
   }

   public float[] iIIilIlIil(float preYaw) {
      return this.ilIIililil == null ? null : this.llIIililil.lliIliliIl(preYaw);
   }

   static boolean IlIIillIIi(IiiIliliiIli d) {
      return d != null && lIIlIliIIlIl<invokedynamic>().equals(d.Ililllililil());
   }

   private void liiIiiiiIi(long release, long chargeDropped, iIliIiIiIlliIiIi tick, boolean state) {
      if (chargeDropped != this.llllililil) {
         this.llllililil = chargeDropped;
         this.illlililil = false;
      }

      if (chargeDropped != Long.MIN_VALUE && release > chargeDropped) {
         if (state || tick == iIliIiIiIlliIiIi.IilIiIiIIi || tick == iIliIiIiIlliIiIi.lilIiIiIIi) {
            this.illlililil = true;
         }

      }
   }

   public String IIlllIlliIll() {
      iIiIllilIliIllil var1 = this.iiilililil;
      return var1 == null ? lIIlIliIIlIl<invokedynamic>() : var1.name().toLowerCase(Locale.ROOT);
   }

   static double[] IIiIllIiIl(liIIliliiIIlil spot, class_243 maxDrop, class_243 level, class_243 a, iIilIiIiIlilIiIi pos, int want, boolean wide, boolean env) {
      long var38 = -5932897567380386952L;
      long var40 = 5229371230892379464L;
      long var42 = 1010895373295212709L;
      if (spot != null && maxDrop != null && level != null && a != null && iiiIIlIIIlIl(maxDrop) && iiiIIlIIIlIl(level) && iiiIIlIIIlIl(a)) {
         HashSet var8 = new HashSet();
         double var9 = Double.POSITIVE_INFINITY;
         double[] var11 = null;

         for(var38 ^= (0L ^ var38) & -1L << 32; (int)(var38 >>> 32) < 24; var38 += 4294967296L) {
            double var13 = (Math.PI * 2D) * (double)((int)(var38 >>> 32)) / (double)24.0F;
            double var15 = Math.cos(var13);
            double var17 = Math.sin(var13);
            double[] var19 = Ililllilil;
            var38 ^= ((long)var19.length ^ var38) & -1L >>> 32;

            for(var40 ^= (0L ^ var40) & -1L << 32; (int)(var40 >>> 32) < (int)var38; var40 += 4294967296L) {
               double var22 = var19[(int)(var40 >>> 32)];
               var40 ^= ((long)((int)Math.floor(level.field_1352 + var15 * var22)) ^ var40) & -1L >>> 32;
               var42 ^= ((long)((int)Math.floor(level.field_1350 + var17 * var22)) << 32 ^ var42) & -1L << 32;
               if (var8.add((long)((int)var40) << 32 ^ (long)((int)(var42 >>> 32)) & 4294967295L)) {
                  double var26 = (double)((int)var40) + (double)0.5F;
                  double var28 = (double)((int)(var42 >>> 32)) + (double)0.5F;
                  double var30 = Math.hypot(var26 - level.field_1352, var28 - level.field_1350);
                  if (!(var30 < 1.999) && !(var30 > 3.201)) {
                     double var32 = Math.hypot(var26 - a.field_1352, var28 - a.field_1350);
                     if (env || !(var32 > 2.501)) {
                        double var34 = env ? Math.hypot(var26 - maxDrop.field_1352, var28 - maxDrop.field_1350) + (double)0.5F * var32 : var32;
                        if (!(var34 >= var9)) {
                           double var36 = wide ? lliIliliIl(spot, (int)var40, (int)(var42 >>> 32), level, pos) : iIiIlIliIl(spot, (int)var40, (int)(var42 >>> 32), level, pos);
                           if (Double.isFinite(var36) && lilIIliilIIl(spot, maxDrop, new class_243(var26, var36, var28), true, (double)10.0F, Math.max(0, want))) {
                              var9 = var34;
                              var11 = new double[]{var26, var36, var28, wide ? (double)1.0F : (double)0.0F, env ? (double)1.0F : (double)0.0F};
                           }
                        }
                     }
                  }
               }
            }
         }

         return var11;
      } else {
         return null;
      }
   }

   private class_243 llIIlilIIl(long want, class_243 pos, iIllIlllIlllIlll nt, class_243 face, class_243 grounded, boolean tick) {
      long var12 = 4522965899045256895L;
      class_243 var8 = nt.iliIiiliiiii();
      if (var8 != null && face != null && pos != null && grounded != null && iiiIIlIIIlIl(var8) && iiiIIlIIIlIl(face) && iiiIIlIIIlIl(grounded) && IiIIlliIIl(face, var8) && !(Math.hypot(face.field_1352 - pos.field_1352, face.field_1350 - pos.field_1350) > (double)6.0F)) {
         var12 ^= ((long)iiIIlIIlIl(this.iIIIililil, pos, var8, grounded, tick) << 32 ^ var12) & -1L << 32;
         double[] var10 = this.illiililil;
         if (var10 != null && IllIllllIl(this.iIIIililil, var10, var8, grounded, this.llliililil, (boolean)((int)(var12 >>> 32)))) {
            return new class_243(var10[0], var10[1], var10[2]);
         } else {
            this.illiililil = null;
            if (this.Iiliililil != Long.MIN_VALUE && want >= this.Iiliililil && want - this.Iiliililil < 4L) {
               return null;
            } else {
               this.Iiliililil = want;
               double[] var11 = lilIliilIl(this.iIIIililil, pos, var8, grounded, this.llliililil, this.llIIililil.lIiiIiIlilli(), (boolean)((int)(var12 >>> 32)));
               this.illiililil = var11;
               return var11 == null ? null : new class_243(var11[0], var11[1], var11[2]);
            }
         }
      } else {
         this.Iiiiliiiiiii();
         return null;
      }
   }

   static boolean iIiilIliil(iIllIlllIlllIlll nt) {
      return nt != null && (nt.IIIllIIliIIl() == iiIIllIlIIlIllIl.iillilIiIl || nt.IIIllIIliIIl() == iiIIllIlIIlIllIl.iIililIiIl);
   }

   static boolean IllIIllllIIl(liIIliliiIIlil maxLen, class_243 maxDrop, class_243 allowJump, boolean env, double from, int to) {
      return !Double.isNaN(IIiIIllIiIIl(maxLen, maxDrop, allowJump, env, from, to));
   }

   static boolean iiIIlIIlIl(liIIliliiIIlil a, class_243 env, class_243 grounded, class_243 pos, boolean want) {
      if (a != null && env != null && grounded != null && pos != null && iiiIIlIIIlIl(env) && iiiIIlIIIlIl(grounded) && iiiIIlIIIlIl(pos)) {
         if (want && env.field_1351 - grounded.field_1351 > 0.501) {
            return true;
         } else {
            double var5 = lliIIliliIIl(a, pos.field_1352, pos.field_1350, Math.max(env.field_1351, grounded.field_1351), 3);
            return Double.isFinite(var5) && var5 - grounded.field_1351 > 0.501;
         }
      } else {
         return false;
      }
   }

   static boolean lIlIIliIlIIl(liIIliliiIIlil maxLen, class_243 from, class_243 env, boolean to, double allowJump) {
      return IllIIllllIIl(maxLen, from, env, to, allowJump, 3);
   }

   private boolean iliIiiliiiii(long tick, IiliIililiIi dodge) {
      return dodge != null || this.iIllililil != null && tick < this.Illlililil;
   }

   static boolean iiiIlIIIll(liIIliliiIIlil env, class_243 p) {
      if (env != null && p != null && iiiIIlIIIlIl(p)) {
         return (env.lIiiIiIlilli(class_2338.method_49637(p.field_1352, p.field_1351 + 0.001, p.field_1350)) & 32) != 0;
      } else {
         return false;
      }
   }

   static double ilillIiill(liIIliliiIIlil z, int spot, int x, class_243 env, iIilIiIiIlilIiIi him) {
      long var19 = -4129983264326328977L;
      long var21 = -434314437137009341L;
      double var5 = lliIIliliIIl(z, (double)spot + (double)0.5F, (double)x + (double)0.5F, env.field_1351, 2);
      if (!Double.isFinite(var5)) {
         return Double.NaN;
      } else {
         var19 ^= ((long)((int)Math.floor(var5 + 0.001)) << 32 ^ var19) & -1L << 32;
         if ((z.lIiiIiIlilli(new class_2338(spot, (int)(var19 >>> 32), x)) & 1407) != 0) {
            return Double.NaN;
         } else if (!z.Iilllilliill(spot, (int)(var19 >>> 32) - 1, x) && !z.Iilllilliill(spot, (int)(var19 >>> 32), x) && !z.Iilllilliill(spot, (int)(var19 >>> 32) + 1, x)) {
            double var8 = (double)spot + (double)0.5F;
            double var10 = (double)x + (double)0.5F;
            if (!iIIlillIlIlill.Iilililiiili(var8, var5 + 1.62, var10, env.field_1352, env.field_1351, env.field_1350)) {
               return Double.NaN;
            } else {
               var19 ^= ((long)((int)Math.floor(Math.max(var5, env.field_1351) + (double)1.0F + 0.001)) ^ var19) & -1L >>> 32;

               for(long var25 = var21 ^ (4294967296L ^ var21) & -1L << 32; (int)(var25 >>> 32) <= 3; var25 += 4294967296L) {
                  double var14 = (double)((int)(var25 >>> 32)) / (double)4.0F;
                  if (z.iIlIlllllill((int)Math.floor(var8 + (env.field_1352 - var8) * var14), (int)var19, (int)Math.floor(var10 + (env.field_1350 - var10) * var14))) {
                     return Double.NaN;
                  }
               }

               if (him != null) {
                  double var13 = var8 - him.IliIlllilIi();
                  double var15 = var5 - him.liiiIIllIl();
                  double var17 = var10 - him.iIlIlllllill();
                  if (lilliiiillii.IiIlliIliiIl(var5, Math.sqrt(var13 * var13 + var15 * var15 + var17 * var17), him.IilliliilIIi()) >= (double)0.25F) {
                     return Double.NaN;
                  }
               }

               return var5;
            }
         } else {
            return Double.NaN;
         }
      }
   }

   static boolean iIIIlIlIIl(class_243 nt, iIllIlllIlllIlll feet) {
      if (nt != null && feet != null && feet.iliIiiliiiii() != null && iiiIIlIIIlIl(nt) && iiiIIlIIIlIl(feet.iliIiiliiiii())) {
         class_243 var2 = feet.iliIiiliiiii();
         return Math.hypot(nt.field_1352 - var2.field_1352, nt.field_1350 - var2.field_1350) < 1.7 && nt.field_1351 - var2.field_1351 <= 0.501;
      } else {
         return false;
      }
   }

   static boolean lllIiillIi(iiilllIIIill mode) {
      return mode == iiilllIIIill.IiilllIiliilllIi || mode == iiilllIIIill.IIilllIilIilllIi || mode == iiilllIIIill.llilllIiililllIi;
   }

   static double[] iIlllIllll(liIIliliiIIlil swim, class_243 hvx, class_243 maxDrop, double hvz, double env, int pos, boolean him) {
      long var43 = -7188443201105835236L;
      long var45 = 4267712635177105765L;
      long var47 = 1228777410062526551L;
      if (swim != null && hvx != null && maxDrop != null && iiiIIlIIIlIl(hvx) && iiiIIlIIIlIl(maxDrop)) {
         double var9 = him ? (double)1.0F : (double)0.25F;
         double var11 = him ? (double)0.5F : (double)1.0F;
         double var13 = Double.isFinite(hvz) && Double.isFinite(env) ? Math.hypot(hvz, env) : (double)0.0F;
         var43 ^= ((long)(var13 >= 0.05 ? 1 : 0) << 32 ^ var43) & -1L << 32;
         double var16 = him ? lllllillll(swim, hvx) : hvx.field_1351;
         HashSet var18 = new HashSet();
         double var19 = Double.POSITIVE_INFINITY;
         double[] var21 = null;

         for(double var22 = (double)1.0F; var22 <= 24.001 && !(var9 * (var22 - (double)1.0F) - (double)3.0F >= var19); ++var22) {
            var43 ^= ((long)Math.max(8, Math.min(48, (int)Math.ceil((Math.PI * 2D) * var22 / 0.9))) ^ var43) & -1L >>> 32;

            for(var45 ^= (0L ^ var45) & -1L << 32; (int)(var45 >>> 32) < (int)var43; var45 += 4294967296L) {
               double var26 = (Math.PI * 2D) * (double)((int)(var45 >>> 32)) / (double)((int)var43);
               var45 ^= ((long)((int)Math.floor(hvx.field_1352 + Math.cos(var26) * var22)) ^ var45) & -1L >>> 32;
               var47 ^= ((long)((int)Math.floor(hvx.field_1350 + Math.sin(var26) * var22)) << 32 ^ var47) & -1L << 32;
               if (var18.add((long)((int)var45) << 32 ^ (long)((int)(var47 >>> 32)) & 4294967295L)) {
                  double var30 = (double)((int)var45) + (double)0.5F;
                  double var32 = (double)((int)(var47 >>> 32)) + (double)0.5F;
                  double var34 = Math.hypot(var30 - maxDrop.field_1352, var32 - maxDrop.field_1350);
                  double var36 = (int)(var43 >>> 32) != 0 && var34 > 1.0E-6 ? Math.max((double)0.0F, (hvz * (var30 - maxDrop.field_1352) + env * (var32 - maxDrop.field_1350)) / (var13 * var34)) : (double)0.0F;
                  double var38 = var9 * Math.hypot(var30 - hvx.field_1352, var32 - hvx.field_1350) + var11 * var34 - (double)3.0F * var36;
                  if (!(var38 >= var19)) {
                     double var40 = Iillllilll(swim, (int)var45, (int)(var47 >>> 32), var16);
                     if (Double.isFinite(var40)) {
                        class_243 var42 = new class_243(var30, var40, var32);
                        if (him) {
                           if (var40 > var16 + 1.2 + 0.001) {
                              continue;
                           }
                        } else if (!IllIIllllIIl(swim, hvx, var42, true, (double)8.0F, Math.max(0, pos))) {
                           continue;
                        }

                        var19 = var38;
                        var21 = new double[]{var30, var40, var32};
                     }
                  }
               }
            }
         }

         return var21;
      } else {
         return null;
      }
   }

   private void IIliilIlii(long pos, class_243 tick) {
      long var13 = -5246977176013009103L;
      long var15 = 7544298403051472680L;
      double[] var4 = IiiIIlliiIIl(this.illIililil, this.IilIililil);
      if (var4 == null) {
         var4 = IiiIIlliiIIl(this.iilIililil, this.IIiIililil);
      }

      if (var4 != null) {
         double var5 = -var4[1];
         double var7 = var4[0];
         var13 ^= ((long)this.llIIililil.lIiiIiIlilli() << 32 ^ var13) & -1L << 32;
         var13 ^= ((long)IllIIllllIIl(this.iIIIililil, tick, new class_243(tick.field_1352 + var5 * (double)2.0F, tick.field_1351, tick.field_1350 + var7 * (double)2.0F), true, (double)2.0F, (int)(var13 >>> 32)) ^ var13) & -1L >>> 32;
         var15 ^= ((long)IllIIllllIIl(this.iIIIililil, tick, new class_243(tick.field_1352 - var5 * (double)2.0F, tick.field_1351, tick.field_1350 - var7 * (double)2.0F), true, (double)2.0F, (int)(var13 >>> 32)) << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)((int)var13 == (int)(var15 >>> 32) ? (this.lIIIililil.nextBoolean() ? 1 : -1) : ((int)var13 != 0 ? 1 : -1)) ^ var15) & -1L >>> 32;
         this.IllIililil = var5 * (double)((int)var15);
         this.lllIililil = var7 * (double)((int)var15);
         this.iIlIililil = pos + 8L;
      }
   }

   iIIlliilIlIlliil(Random env, liIIliliiIIlil rnd, iIIIllilIlIIllil nav) {
      this.IlIIililil = new IllIllIllllIllIl();
      this.IIlIililil = Double.NaN;
      this.lIlIililil = Double.NaN;
      this.iIlIililil = Long.MIN_VALUE;
      this.IliIililil = 1;
      this.lliIililil = Long.MIN_VALUE;
      this.iiiIililil = Long.MIN_VALUE;
      this.IIIlililil = Long.MAX_VALUE;
      this.iIIlililil = Long.MIN_VALUE;
      this.IlIlililil = -1;
      this.Illlililil = Long.MIN_VALUE;
      this.llllililil = Long.MIN_VALUE;
      this.Iillililil = Float.NaN;
      this.lillililil = Long.MIN_VALUE;
      this.iIilililil = Long.MIN_VALUE;
      this.Ililililil = Long.MIN_VALUE;
      this.llilililil = Long.MIN_VALUE;
      this.iiilililil = iIiIllilIliIllil.lIIIiliIil;
      this.llIiililil = Long.MIN_VALUE;
      this.liIiililil = Long.MIN_VALUE;
      this.iiIiililil = Long.MIN_VALUE;
      this.Iiliililil = Long.MIN_VALUE;
      this.lIiiililil = Long.MIN_VALUE;
      this.Iiiiililil = Long.MIN_VALUE;
      this.lIIIililil = env == null ? new Random() : env;
      this.iIIIililil = (liIIliliiIIlil)(rnd == null ? new IIlIlillIlIlil() : rnd);
      this.llIIililil = nav == null ? iIIIllilIlIIllil.IlIlllIlilIl() : nav;
   }

   private iIllllIlIlllllIl iiIIIlIIlIIl(iIllllIlIlllllIl out) {
      long var17 = 1211010264473597844L;
      long var15 = 2024623795365554154L;
      iIllllIlIlllllIl var2 = out == null ? iIllllIlIlllllIl.IliIlllilIi() : out;
      if (var2 instanceof iIllllIlIlllllIl) {
         iIllllIlIlllllIl var10000 = var2;

         try {
            var31 = var10000.IlIlllIlilIl();
         } catch (Throwable var25) {
            throw new MatchException(var25.toString(), var25);
         }

         var15 ^= ((long)var31 << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)((int)(var15 >>> 32)) ^ var15) & -1L >>> 32;
         var10000 = var2;

         try {
            var33 = var10000.IiIlliIliiIl();
         } catch (Throwable var24) {
            throw new MatchException(var24.toString(), var24);
         }

         double var13 = var33;
         double var4 = var13;
         var10000 = var2;

         try {
            var35 = var10000.IIlllIlliIll();
         } catch (Throwable var23) {
            throw new MatchException(var23.toString(), var23);
         }

         var13 = var35;
         double var6 = var13;
         var10000 = var2;

         try {
            var37 = var10000.Illlllllilll();
         } catch (Throwable var22) {
            throw new MatchException(var22.toString(), var22);
         }

         IilIIIililIIIi var27 = var37;
         var10000 = var2;

         try {
            var10000.Iilllilliill();
         } catch (Throwable var21) {
            throw new MatchException(var21.toString(), var21);
         }

         var10000 = var2;

         try {
            var10000.IIillIiliIil();
         } catch (Throwable var20) {
            throw new MatchException(var20.toString(), var20);
         }

         var10000 = var2;

         try {
            var41 = var10000.Ililllililil();
         } catch (Throwable var19) {
            throw new MatchException(var19.toString(), var19);
         }

         var15 ^= ((long)var41 << 32 ^ var15) & -1L << 32;
         long var42 = var17 ^ ((long)((int)(var15 >>> 32)) << 32 ^ var17) & -1L << 32;
         this.lilIililil = (int)var15 != 0 || var27 == IilIIIililIIIi.IIillIililIillIili;
         if ((int)var15 != 0) {
            this.iilIililil = var4;
            this.IIiIililil = var6;
         }

         return var2;
      } else {
         this.lilIililil = false;
         return iIllllIlIlllllIl.IliIlllilIi();
      }
   }

   private long lIiiIiIlilli(long tick, long since) {
      if (since < this.IIIlililil) {
         this.lIIlililil = this.iiiIililil != Long.MIN_VALUE && tick >= this.iiiIililil && tick - this.iiiIililil <= 4L;
         if (this.lIIlililil) {
            this.iiiIililil = Long.MIN_VALUE;
         }
      }

      this.IIIlililil = since;
      return this.lIIlililil ? 150L : 300L;
   }

   static boolean illilIilil(class_243 eating, iIllIlllIlllIlll d, iiliiiIiIIiiiiIi face, IiiIliliiIli nt, boolean c) {
      if (!c && eating != null && iiiIIlIIIlIl(eating) && d != null && face != null && nt != null) {
         if (d.IIIllIIliIIl() != iiIIllIlIIlIllIl.iillilIiIl && d.IIIllIIliIIl() != iiIIllIlIIlIllIl.iIililIiIl) {
            return false;
         } else if (face.IlIlllIlilIl() == null && face.Illlllllilll() == null && face.IIlllIlliIll() == null) {
            return lliililiil(nt.IilliliilIIi()) && lliililiil(face.IIIllIIliIIl());
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private int Iiliililii(class_243 pos, double lz, double lx) {
      return iiliiIIiii(this.llliililil, pos, lz, lx);
   }

   static double iIiIlIliIl(liIIliliiIIlil z, int a, int env, class_243 x, iIilIiIiIlilIiIi spot) {
      return IiiIlliiIl(z, a, env, x, spot, (double)-0.5F, (double)-1.5F);
   }

   private iIllllIlIlllllIl lIlliiIlli(lliiilIiiliiilIi self, boolean jump) {
      return this.illliIilli(self, Illlilllli(false, (double)0.0F, (double)0.0F, jump, false, false));
   }

   private boolean IIIIIllIIIIl(lliiilIiiliiilIi dx, double dist, double chase, double self, boolean dz) {
      long var27 = 2689018973991372732L;
      long var29 = -2220145699115487853L;
      long var31 = -6275378247867558704L;
      if (!this.IIilililil && dx.iliIiiliiiii() && self > (dz ? (double)2.5F : (double)4.0F)) {
         class_243 var9 = dx.lIiiIiIlilli();
         if (var9 != null && Math.hypot(var9.field_1352, var9.field_1350) > (dz ? 0.15 : 0.2)) {
            if (this.iIIIililil.Ililllililil()) {
               return false;
            } else {
               class_243 var10 = dx.liiiIIllIl();
               if (this.iIIIIlIlIIIl(var10)) {
                  return false;
               } else {
                  var27 ^= ((long)((int)Math.floor(var10.field_1351 + 0.001)) << 32 ^ var27) & -1L << 32;
                  double var12 = dz ? -1.001 : -0.01;
                  var27 ^= (3L ^ var27) & -1L >>> 32;

                  for(var29 ^= (4294967296L ^ var29) & -1L << 32; (int)(var29 >>> 32) <= (int)var27; var29 += 4294967296L) {
                     double var16 = var10.field_1352 + dist * (double)((int)(var29 >>> 32));
                     double var18 = var10.field_1350 + chase * (double)((int)(var29 >>> 32));
                     double var20 = iIiIIlIliIIl(this.iIIIililil, var16, var18, var10.field_1351);
                     if (!Double.isFinite(var20)) {
                        return false;
                     }

                     double var22 = var20 - var10.field_1351;
                     if (var22 > 0.01 || var22 < var12) {
                        return false;
                     }

                     if (var22 < -0.01) {
                        var27 ^= (5L ^ var27) & -1L >>> 32;
                     }

                     var29 ^= ((long)((int)Math.floor(var16)) ^ var29) & -1L >>> 32;
                     var31 ^= ((long)((int)Math.floor(var18)) << 32 ^ var31) & -1L << 32;
                     var31 ^= ((long)((int)Math.floor(var20 + 0.001)) ^ var31) & -1L >>> 32;
                     if (this.iIIIililil.iIlIlllllill((int)var29, (int)(var27 >>> 32) + 2, (int)(var31 >>> 32))) {
                        return false;
                     }

                     if ((this.iIIIililil.lIiiIiIlilli(new class_2338((int)var29, (int)var31, (int)(var31 >>> 32))) & 1375) != 0) {
                        return false;
                     }

                     if ((int)var31 != (int)(var27 >>> 32) && (this.iIIIililil.lIiiIiIlilli(new class_2338((int)var29, (int)(var27 >>> 32), (int)(var31 >>> 32))) & 1375) != 0) {
                        return false;
                     }
                  }

                  return true;
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void IilIililIi() {
      this.lIIiililil = 0;
      this.iIIiililil = (double)0.0F;
      this.IlIiililil = (double)0.0F;
   }

   private void iIlIiIllIi(long stand, class_243 tick, class_243 tol, double pos) {
      long var12 = 3955298242354921972L;
      var12 ^= ((long)(this.iIllililil != null && stand < this.Illlililil ? 1 : 0) << 32 ^ var12) & -1L << 32;
      double var8 = this.IliIilliIi(tol) && !this.IliIilliIi(tick) ? Math.max(pos, 1.6) : pos;
      double var10 = Math.hypot(tol.field_1352 - tick.field_1352, tol.field_1350 - tick.field_1350);
      if ((int)(var12 >>> 32) == 0 && !lllIiillIi(this.llIIililil.IliIlllilIi()) && var10 > var8 + 0.3) {
         if (this.lIIiililil != 0 && Math.hypot(tick.field_1352 - this.iIIiililil, tick.field_1350 - this.IlIiililil) < 0.05) {
            ++this.lIIiililil;
            if (this.lIIiililil >= 10) {
               if (this.llIiililil == Long.MIN_VALUE || stand < this.llIiililil || stand - this.llIiililil >= 20L) {
                  this.llIiililil = stand;
                  this.lIIiililil = 0;
                  ++this.ilIiililil;
                  this.IIIiililil = true;
                  this.iIiIililil = false;
                  this.iIllililil = null;
                  this.Illlililil = Long.MIN_VALUE;
                  this.iIlIililil = Long.MIN_VALUE;
                  this.llIIililil.IiiIlliiIl();
               }
            }
         } else {
            this.iIIiililil = tick.field_1352;
            this.IlIiililil = tick.field_1350;
            this.lIIiililil = 1;
         }
      } else {
         this.IilIililIi();
      }
   }

   static boolean illIIlIilIIl(liIIliliiIIlil allowJump, class_243 env, class_243 from, boolean to, double maxLen) {
      return lilIIliilIIl(allowJump, env, from, to, maxLen, 3);
   }

   public boolean Illillliilli() {
      return this.liiiililil;
   }

   public Iiliiililiii IiIlliIliiIl() {
      return this.llIIililil;
   }

   static boolean ilIIiIiIIi(IIliIilIliIi decisionDodge, boolean kind) {
      boolean var10000;
      switch (decisionDodge) {
         case iiiiiIIIlIIIIIlIIl:
         case lIIIIlIIliIIIIlIIl:
            var10000 = kind;
            break;
         case iIiiiIIIlIliiiIIIl:
         case lliiiIIIliliiiIIIl:
         case IiiiiIIIlliiiiIIIl:
            var10000 = true;
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   static boolean iliiiIiiii(liIIliliiIIlil ahead, class_243 dz, double dx, double pos, double env) {
      double var8 = dz.field_1352 + dx * env;
      double var10 = dz.field_1350 + pos * env;
      double var12 = iIiIIlIliIIl(ahead, var8, var10, dz.field_1351);
      if (!Double.isFinite(var12)) {
         return false;
      } else {
         double var14 = var12 - dz.field_1351;
         if (var14 > 0.601 && var14 <= 1.001) {
            return !ahead.Iilllilliill((int)Math.floor(var8), (int)Math.floor(var12 - 0.001), (int)Math.floor(var10));
         } else {
            return false;
         }
      }
   }

   static double Iillllilll(liIIliliiIIlil env, int fromY, int x, double z) {
      long var8 = 1171691556061175254L;
      double var5 = lliIIliliIIl(env, (double)fromY + (double)0.5F, (double)x + (double)0.5F, z, 2);
      if (!Double.isFinite(var5)) {
         return Double.NaN;
      } else {
         var8 ^= ((long)((int)Math.floor(var5 + 0.001)) << 32 ^ var8) & -1L << 32;
         if ((env.lIiiIiIlilli(new class_2338(fromY, (int)(var8 >>> 32), x)) & 1407) != 0) {
            return Double.NaN;
         } else if ((env.lIiiIiIlilli(new class_2338(fromY, (int)(var8 >>> 32) + 1, x)) & 32) != 0) {
            return Double.NaN;
         } else {
            return !env.Iilllilliill(fromY, (int)(var8 >>> 32) - 1, x) && !env.Iilllilliill(fromY, (int)(var8 >>> 32), x) && !env.Iilllilliill(fromY, (int)(var8 >>> 32) + 1, x) ? var5 : Double.NaN;
         }
      }
   }

   private static double IiiIlliiIl(liIIliliiIIlil x, int env, int spot, class_243 z, iIilIiIiIlilIiIi hi, double a, double lo) {
      long var32 = 5554941154324937995L;
      long var26 = -2160962591498658267L;
      long var28 = -1185153545346646602L;
      long var30 = 1350665895556242700L;
      var26 ^= ((long)((int)Math.floor(z.field_1351 + 0.001)) << 32 ^ var26) & -1L << 32;
      double var10 = lliIIliliIIl(x, (double)env + (double)0.5F, (double)spot + (double)0.5F, (double)((int)(var26 >>> 32)) - (double)1.0F, 0);
      if (!Double.isFinite(var10)) {
         return Double.NaN;
      } else {
         double var12 = var10 - z.field_1351;
         if (!(var12 > a + 0.001) && !(var12 < lo - 0.001)) {
            var26 ^= ((long)((int)Math.floor(var10 + 0.001)) ^ var26) & -1L >>> 32;
            if ((x.lIiiIiIlilli(new class_2338(env, (int)var26, spot)) & 1407) != 0) {
               return Double.NaN;
            } else if (!x.Iilllilliill(env, (int)var26 - 1, spot) && !x.Iilllilliill(env, (int)var26, spot) && !x.Iilllilliill(env, (int)var26 + 1, spot)) {
               var28 ^= (0L ^ var28) & -1L << 32;

               for(var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < 4; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
                  var30 ^= ((long)(env + ((int)var28 == 0 ? 1 : ((int)var28 == 1 ? -1 : 0))) << 32 ^ var30) & -1L << 32;
                  var30 ^= ((long)(spot + ((int)var28 == 2 ? 1 : ((int)var28 == 3 ? -1 : 0))) ^ var30) & -1L >>> 32;
                  if (!x.iIlIlllllill((int)(var30 >>> 32), (int)var26, (int)var30) && !x.iIlIlllllill((int)(var30 >>> 32), (int)var26 + 1, (int)var30)) {
                     var28 += 4294967296L;
                  }
               }

               if ((int)(var28 >>> 32) < 2) {
                  return Double.NaN;
               } else {
                  double var16 = (double)env + (double)0.5F;
                  double var18 = (double)spot + (double)0.5F;
                  if (!iIIlillIlIlill.Iilililiiili(var16, var10 + 1.62, var18, z.field_1352, z.field_1351, z.field_1350)) {
                     return Double.NaN;
                  } else {
                     for(long var39 = var32 ^ (4294967296L ^ var32) & -1L << 32; (int)(var39 >>> 32) <= 3; var39 += 4294967296L) {
                        double var21 = (double)((int)(var39 >>> 32)) / (double)4.0F;
                        if (x.iIlIlllllill((int)Math.floor(var16 + (z.field_1352 - var16) * var21), (int)(var26 >>> 32), (int)Math.floor(var18 + (z.field_1350 - var18) * var21))) {
                           return Double.NaN;
                        }
                     }

                     if (hi != null) {
                        double var20 = var16 - hi.IliIlllilIi();
                        double var22 = var10 - hi.liiiIIllIl();
                        double var24 = var18 - hi.iIlIlllllill();
                        if (lilliiiillii.IiIlliIliiIl(var10, Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24), hi.IilliliilIIi()) >= (double)0.25F) {
                           return Double.NaN;
                        }
                     }

                     return var10;
                  }
               }
            } else {
               return Double.NaN;
            }
         } else {
            return Double.NaN;
         }
      }
   }

   static double[] Illillllil(class_243 vz, iIllIlllIlllIlll face, class_243 pos, double nt, double vx) {
      if (vz != null && face != null && pos != null && face.iliIiiliiiii() != null) {
         if (face.IIIllIIliIIl() != iiIIllIlIIlIllIl.iillilIiIl && face.IIIllIIliIIl() != iiIIllIlIIlIllIl.iIililIiIl) {
            return null;
         } else {
            class_243 var7 = face.iliIiiliiiii();
            if (iiiIIlIIIlIl(var7) && iiiIIlIIIlIl(pos) && iiiIIlIIIlIl(vz) && Double.isFinite(nt) && Double.isFinite(vx)) {
               if (Math.hypot(var7.field_1352 - pos.field_1352, var7.field_1350 - pos.field_1350) > (double)3.0F) {
                  return null;
               } else {
                  double var8 = Math.hypot(nt, vx);
                  if (!(var8 >= 0.08)) {
                     return null;
                  } else {
                     double var10 = var7.field_1352 - vz.field_1352;
                     double var12 = var7.field_1350 - vz.field_1350;
                     double var14 = Math.hypot(var10, var12);
                     if (!(var14 > 1.0E-6)) {
                        return null;
                     } else {
                        double var16 = (nt * var10 + vx * var12) / (var8 * var14);
                        if (var16 < 0.4 && var14 <= 3.2) {
                           return null;
                        } else {
                           double var18 = Math.max((double)3.0F, Math.min((double)12.0F, var14 / 0.28)) * Math.min((double)1.0F, (double)1.0F + var16);
                           double var20 = Math.max((double)0.0F, ((var7.field_1352 - pos.field_1352) * nt + (var7.field_1350 - pos.field_1350) * vx) / var8);
                           double var22 = var8 * var18 - var20;
                           return !(var22 > 0.001) ? null : new double[]{nt / var8 * var22, vx / var8 * var22};
                        }
                     }
                  }
               }
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   static boolean IIIIllIIIl(class_243 feet, iIllIlllIlllIlll nt) {
      if (feet != null && nt != null && nt.iliIiiliiiii() != null && Double.isFinite(feet.field_1351) && Double.isFinite(nt.iliIiiliiiii().field_1351)) {
         return feet.field_1351 - nt.iliIiiliiiii().field_1351 <= -0.499;
      } else {
         return false;
      }
   }

   private iIiiIlIliiIl IIililIili(lliiilIiiliiilIi self, double dz, double move, boolean dx) {
      long var18 = 7940992985721439272L;
      class_243 var7 = self.liiiIIllIl();
      class_243 var8 = self.lIiiIiIlilli();
      double var9 = var8 != null && Double.isFinite(var8.field_1352) ? var8.field_1352 : (double)0.0F;
      double var11 = var8 != null && Double.isFinite(var8.field_1350) ? var8.field_1350 : (double)0.0F;
      if (!dx && Math.hypot(var9, var11) < 1.0E-4) {
         return new iIiiIlIliiIl(false, false, false, (double)0.0F, (double)0.0F);
      } else {
         if (dx) {
            double var13 = dz * 0.35;
            double var15 = move * 0.35;
            if (this.lliliilili(var7, var7.field_1352 + var13, var7.field_1350 + var15)) {
               return this.iIiliIlili(var7, var13, var15, false);
            }
         }

         for(long var20 = var18 ^ (4294967296L ^ var18) & -1L << 32; (int)(var20 >>> 32) <= 4; var20 += 4294967296L) {
            double var14 = var9 * (double)((int)(var20 >>> 32)) + dz * (double)0.25F * (double)((int)(var20 >>> 32));
            double var16 = var11 * (double)((int)(var20 >>> 32)) + move * (double)0.25F * (double)((int)(var20 >>> 32));
            if (this.lliliilili(var7, var7.field_1352 + var14, var7.field_1350 + var16)) {
               return this.iIiliIlili(var7, var14, var16, true);
            }
         }

         return new iIiiIlIliiIl(false, false, false, (double)0.0F, (double)0.0F);
      }
   }

   static double[] Ilillllill(liIIliliiIIlil swim, class_243 want, class_243 env, class_243 him, iIilIiIiIlilIiIi maxDrop, int spot, boolean pos) {
      long var36 = 7490740250023856213L;
      long var38 = 1190856762531720474L;
      long var40 = 2771742317938737467L;
      if (swim != null && want != null && env != null && him != null && iiiIIlIIIlIl(want) && iiiIIlIIIlIl(env) && iiiIIlIIIlIl(him)) {
         HashSet var7 = new HashSet();
         double var8 = Double.POSITIVE_INFINITY;
         double[] var10 = null;

         for(var36 ^= (0L ^ var36) & -1L << 32; (int)(var36 >>> 32) < 24; var36 += 4294967296L) {
            double var12 = (Math.PI * 2D) * (double)((int)(var36 >>> 32)) / (double)24.0F;
            double var14 = Math.cos(var12);
            double var16 = Math.sin(var12);
            double[] var18 = liilllilil;
            var36 ^= ((long)var18.length ^ var36) & -1L >>> 32;

            for(var38 ^= (0L ^ var38) & -1L << 32; (int)(var38 >>> 32) < (int)var36; var38 += 4294967296L) {
               double var21 = var18[(int)(var38 >>> 32)];
               var38 ^= ((long)((int)Math.floor(env.field_1352 + var14 * var21)) ^ var38) & -1L >>> 32;
               var40 ^= ((long)((int)Math.floor(env.field_1350 + var16 * var21)) << 32 ^ var40) & -1L << 32;
               if (var7.add((long)((int)var38) << 32 ^ (long)((int)(var40 >>> 32)) & 4294967295L)) {
                  double var25 = (double)((int)var38) + (double)0.5F;
                  double var27 = (double)((int)(var40 >>> 32)) + (double)0.5F;
                  double var29 = Math.hypot(var25 - env.field_1352, var27 - env.field_1350);
                  if (!(var29 < 0.999) && !(var29 > 3.201)) {
                     double var31 = Math.hypot(var25 - him.field_1352, var27 - him.field_1350) + (double)0.5F * Math.hypot(var25 - want.field_1352, var27 - want.field_1350);
                     if (!(var31 >= var8)) {
                        double var33 = ilillIiill(swim, (int)var38, (int)(var40 >>> 32), env, maxDrop);
                        if (Double.isFinite(var33)) {
                           var31 += (double)1.0F * Math.max((double)0.0F, var33 - env.field_1351);
                           if (!(var31 >= var8)) {
                              class_243 var35 = new class_243(var25, var33, var27);
                              if (pos) {
                                 if (var33 > want.field_1351 + 1.2 + 0.001) {
                                    continue;
                                 }
                              } else if (!IllIIllllIIl(swim, want, var35, true, (double)8.0F, Math.max(0, spot))) {
                                 continue;
                              }

                              var8 = var31;
                              var10 = new double[]{var25, var33, var27};
                           }
                        }
                     }
                  }
               }
            }
         }

         return var10;
      } else {
         return null;
      }
   }

   private iIllllIlIlllllIl iiiilIIIIi(long self, lliiilIiiliiilIi stuckJ, IlIIlIlllIIlIl d, class_243 reset, IiliIililiIi dodge, IiiIliliiIli tick, boolean collided, boolean goal, boolean face) {
      long var33 = 7959249375450593504L;
      long var27 = 1807080809642672669L;
      long var29 = 1332500877564411968L;
      long var31 = 4024385310346431518L;
      var27 ^= ((long)stuckJ.iiIIlIIlIl() << 32 ^ var27) & -1L << 32;
      IiliIililiIi var12 = this.IiIliliIli(self, dodge);
      if (var12 != null) {
         this.iillililil = false;
         return this.iiIliIIlli(stuckJ, var12, true);
      } else {
         if (this.iillililil) {
            if ((self <= this.lillililil + 1L || !stuckJ.iliIiiliiiii()) && self - this.lillililil <= 14L) {
               return iIllllIlIlllllIl.IliIlllilIi();
            }

            this.iillililil = false;
         }

         var27 ^= ((long)((int)(var27 >>> 32) == 0 ? 1 : 0) ^ var27) & -1L >>> 32;
         var29 ^= ((long)this.iIIIililil.IIlllIlliIll() << 32 ^ var29) & -1L << 32;
         if (d != null && d.IliIlllilIi() != null && iiiIIlIIIlIl(d.IliIlllilIi())) {
            IlIIIillllIIIill var35 = tick != null && tick.lIiiIiIlilli() != null ? tick.lIiiIiIlilli() : (d.IilliliilIIi() != null ? d.IilliliilIIi() : IlIIIillllIIIill.llIilllill);
            if (this.llIliilIli(self, stuckJ, reset, tick, var35)) {
               this.lillililil = self;
               this.iillililil = true;
               return iIllllIlIlllllIl.IliIlllilIi().iIlIlllllill(IilIIIililIIIi.IIillIililIillIili);
            } else {
               double var18 = (double)0.0F;
               var29 ^= (0L ^ var29) & -1L >>> 32;
               var31 ^= (0L ^ var31) & -1L << 32;
               var31 ^= (0L ^ var31) & -1L >>> 32;
               double var16;
               switch (var35) {
                  case IlIilllill:
                     var16 = 0.6;
                     var18 = 0.9;
                     var29 ^= (1L ^ var29) & -1L >>> 32;
                     var31 ^= ((long)((int)var27 != 0 && !llIIIlilIIIl(stuckJ) ? 1 : 0) << 32 ^ var31) & -1L << 32;
                     break;
                  case iIIilllill:
                     var16 = 0.6;
                     break;
                  case ilIilllill:
                     var16 = 0.6;
                     var31 ^= (1L ^ var31) & -1L >>> 32;
                     break;
                  case IiIilllill:
                     var16 = 0.6;
                     var31 ^= (1L ^ var31) & -1L >>> 32;
                     var18 = 0.9;
                     var29 ^= (1L ^ var29) & -1L >>> 32;
                     break;
                  case iiIilllill:
                     if (lIIlIliIIlIl<invokedynamic>().equals(d.lIiiIiIlilli())) {
                        var16 = 0.2;
                     } else {
                        var16 = 0.6;
                        var18 = 0.9;
                        var29 ^= (1L ^ var29) & -1L >>> 32;
                     }
                     break;
                  default:
                     var16 = 0.2;
               }

               iiIIliIiIIlIliIi var23 = this.Iiililiili(self, stuckJ, d.IliIlllilIi(), var16, var16 + var18 + 0.4, iIllIlllIlllIlll.IliIlllilIi(d.IliIlllilIi()));
               if (var23.IilliliilIIi()) {
                  iIllllIlIlllllIl var24 = this.lIiIiiIiIi(self, stuckJ, d.IliIlllilIi(), tick);
                  if (var24 != null) {
                     return var24;
                  } else if ((int)var29 != 0) {
                     liIiIlliiIiIll var25 = this.iIliiIllii(self, stuckJ, d.IliIlllilIi(), reset, var18, (boolean)((int)(var31 >>> 32)));
                     var33 ^= ((long)((int)var27 == 0 || !var25.IilliliilIIi() && !collided && (int)(var29 >>> 32) == 0 ? 0 : 1) << 32 ^ var33) & -1L << 32;
                     return this.illliIilli(stuckJ, Illlilllli(var25.IliIlllilIi(), var25.liiiIIllIl(), var25.iIlIlllllill(), (boolean)((int)(var33 >>> 32)), false, false));
                  } else {
                     return this.lIlliiIlli(stuckJ, (int)var27 != 0 && (collided || (int)(var29 >>> 32) != 0));
                  }
               } else if (!var23.IliIlllilIi()) {
                  return this.lIlliiIlli(stuckJ, (int)var27 != 0 && (collided || (int)(var29 >>> 32) != 0));
               } else {
                  var33 ^= ((long)((int)var27 == 0 || !this.lIiiiiIiii(stuckJ, var23.liiiIIllIl(), var23.iIlIlllllill(), goal) && (int)(var29 >>> 32) == 0 && !face && !collided && !var23.iliIiiliiiii() && ((int)var31 == 0 || !this.liiiiiiiii(stuckJ, var23.liiiIIllIl(), var23.iIlIlllllill(), var23.lIiiIiIlilli())) ? 0 : 1) ^ var33) & -1L >>> 32;
                  return this.illliIilli(stuckJ, Illlilllli(true, var23.liiiIIllIl(), var23.iIlIlllllill(), (boolean)((int)var33), (var23.IIIllIIliIIl() || var23.lIiiIiIlilli() > (double)2.0F) && (int)(var27 >>> 32) == 0, false));
               }
            }
         } else {
            iIllllIlIlllllIl var15 = this.lIiIiiIiIi(self, stuckJ, (class_243)null, tick);
            return var15 != null ? var15 : this.lIlliiIlli(stuckJ, (int)var27 != 0 && (collided || (int)(var29 >>> 32) != 0));
         }
      }
   }

   public void IIIillIIil(lIlIilIiiIlIilIi s) {
      this.llIIililil.IiIlliIliiIl(s == null ? lIlIilIiiIlIilIi.liIiiIlIIi : s);
   }

   private static boolean llIIIlilIIIl(lliiilIiiliiilIi self) {
      IlillIllllillIll var1 = self.illIlIilIl();
      return var1 != null && var1.liiiIIllIl() != iiIIiilIIlIiil.IliIliIlilliIliIli && var1.iIlIlllllill() == 0;
   }

   int Iilllilliill() {
      return this.Illiililil;
   }

   private iIllllIlIlllllIl lIIIiiIIIi(long chargeDropped, lliiilIiiliiilIi st, IlliIiIlllliIiIl stuckJ, class_243 tick, IiliIililiIi d, IiiIliliiIli face, boolean dodge, boolean self, boolean collided, boolean reset, boolean anchorPending) {
      long var32 = -7918951181962291263L;
      long var34 = 8575292369305841772L;
      long var36 = -5005827812726034526L;
      long var38 = -6507598916477763431L;
      long var40 = -6356645217202262275L;
      long var30 = 7507643957323199743L;
      this.iillililil = false;
      iiliiiIiIIiiiiIi var13 = face.Iiilliiliiil();
      IIliIilIliIi var14 = stuckJ.IliIlllilIi() == null ? IIliIilIliIi.lIIIIlIIliIIIIlIIl : stuckJ.IliIlllilIi();
      class_243 var15 = stuckJ.liiiIIllIl() != null && iiiIIlIIIlIl(stuckJ.liiiIIllIl()) ? stuckJ.liiiIIllIl() : st.liiiIIllIl();
      double var16 = stuckJ.iIlIlllllill() > (double)0.0F && Double.isFinite(stuckJ.iIlIlllllill()) ? stuckJ.iIlIlllllill() : 0.6;
      var30 ^= ((long)stuckJ.lIiiIiIlilli() << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)st.iiIIlIIlIl() ^ var30) & -1L >>> 32;
      var32 ^= ((long)this.iIIIililil.IIlllIlliIll() << 32 ^ var32) & -1L << 32;
      this.liiIiiiiIi(chargeDropped, stuckJ.iliIiiliiiii(), var13.iIlIlllllill(), collided);
      if (ilIIiIiIIi(var14, face.iliIiiliiiii()) && !dodge) {
         IiliIililiIi var21 = this.IiIliliIli(chargeDropped, d);
         if (var21 != null) {
            return this.iiIliIIlli(st, var21, (int)(var30 >>> 32) == 0);
         }
      }

      if (var14 == IIliIilIliIi.lIIIIlIIliIIIIlIIl) {
         this.IilIililIi();
         iIllllIlIlllllIl var43 = this.lIiIiiIiIi(chargeDropped, st, var15, face);
         if (var43 == null && !st.iliIiiliiiii() && lililiilil(var13, face.IilliliilIIi()) && tick != null && iiiIIlIIIlIl(tick) && iiIIlIIlIl(this.iIIIililil, st.liiiIIllIl(), tick, st.liiiIIllIl(), false)) {
            class_243 var44 = this.llIIlilIIl(chargeDropped, st.liiiIIllIl(), new iIllIlllIlllIlll(tick, iiIIllIlIIlIllIl.iIililIiIl, st.liiiIIllIl()), tick, st.liiiIIllIl(), false);
            if (var44 != null) {
               ++this.iiliililil;
               return this.illliIilli(st, Illlilllli(true, var44.field_1352 - st.liiiIIllIl().field_1352, var44.field_1350 - st.liiiIIllIl().field_1350, false, this.iIIIililil.IIIilIIiiIIi() && IIiillIiil(this.iIIIililil.IlIillIiilIi(), var44.field_1352 - st.liiiIIllIl().field_1352, var44.field_1350 - st.liiiIIllIl().field_1350), false));
            }
         }

         if (var43 == null) {
            this.liilililil = iIiIllilIliIllil.iIiilliIil;
         }

         return var43 != null ? var43 : iIllllIlIlllllIl.IliIlllilIi();
      } else {
         iIllIlllIlllIlll var42 = Iiiilliiil(stuckJ, var15);
         if (var14 == IIliIilIliIi.IiiiiIIIlliiiiIIIl && illilIilil(tick, var42, face == null ? null : face.Iiilliiliiil(), face, st.iiIIlIIlIl())) {
            var32 ^= ((long)IIIIllIIIl(var15, var42) ^ var32) & -1L >>> 32;
            var34 ^= ((long)iIIIlIlIIl(var15, var42) << 32 ^ var34) & -1L << 32;
            double[] var24 = Illillllil(st.liiiIIllIl(), var42, tick, this.IIliililil, this.lIliililil);
            if (var24 != null) {
               class_243 var25 = var42.iliIiiliiiii();
               var15 = new class_243(var15.field_1352 + var24[0], var15.field_1351, var15.field_1350 + var24[1]);
               var42 = new iIllIlllIlllIlll(new class_243(var25.field_1352 + var24[0], var25.field_1351, var25.field_1350 + var24[1]), var42.IIIllIIliIIl(), var15);
               this.iIliililil = true;
               ++this.Illiililil;
            }

            if ((int)(var34 >>> 32) == 0 && (this.iIliililil || (int)var32 == 0)) {
               class_243 var49 = this.llIIlilIIl(chargeDropped, st.liiiIIllIl(), var42, tick, var15, st.iliIiiliiiii());
               if (var49 != null) {
                  var15 = var49;
                  var42 = new iIllIlllIlllIlll(var42.iliIiiliiiii(), var42.IIIllIIliIIl(), var49);
                  this.liliililil = true;
                  ++this.iiliililil;
               }
            }
         } else if (var14 == IIliIilIliIi.IiiiiIIIlliiiiIIIl && !st.iliIiiliiiii() && !this.iIIIililil.IIlllIlliIll() && !st.iiIIlIIlIl() && iIiilIliil(var42) && lililiilil(var13, face.IilliliilIIi()) && tick != null && iiiIIlIIIlIl(tick) && iiIIlIIlIl(this.iIIIililil, st.liiiIIllIl(), tick, st.liiiIIllIl(), false)) {
            class_243 var22 = this.llIIlilIIl(chargeDropped, st.liiiIIllIl(), new iIllIlllIlllIlll(tick, iiIIllIlIIlIllIl.iIililIiIl, st.liiiIIllIl()), tick, st.liiiIIllIl(), false);
            var34 ^= ((long)this.iIIIililil.IIIilIIiiIIi() << 32 ^ var34) & -1L << 32;
            if (var22 != null && ((int)(var34 >>> 32) == 0 || IIiillIiil(this.iIIIililil.IlIillIiilIi(), var22.field_1352 - st.liiiIIllIl().field_1352, var22.field_1350 - st.liiiIIllIl().field_1350))) {
               ++this.iiliililil;
               return this.illliIilli(st, Illlilllli(true, var22.field_1352 - st.liiiIIllIl().field_1352, var22.field_1350 - st.liiiIIllIl().field_1350, false, (boolean)((int)(var34 >>> 32)), false));
            }
         } else if (var14 == IIliIilIliIi.IiiiiIIIlliiiiIIIl && iIiilIliil(var42)) {
            this.Iiliililil = Long.MIN_VALUE;
         } else {
            this.Iiiiliiiiiii();
         }

         var32 ^= (0L ^ var32) & -1L >>> 32;
         var34 ^= ((long)(this.iIIIililil.IIlllIlliIll() && !st.iliIiiliiiii() ? 1 : 0) << 32 ^ var34) & -1L << 32;
         if (var14 == IIliIilIliIi.IiiiiIIIlliiiiIIIl && tick != null && iiiIIlIIIlIl(tick) && iIiilIliil(var42) && ((int)(var34 >>> 32) != 0 || iiiIlIIIll(this.iIIIililil, var15))) {
            class_243 var45 = this.iilllIIill(chargeDropped, st.liiiIIllIl(), tick, var15, (boolean)((int)(var34 >>> 32)));
            if (var45 != null) {
               var15 = var45;
               var42 = iIllIlllIlllIlll.IliIlllilIi(var45);
               this.iIiiililil = true;
               ++this.lliiililil;
               var32 ^= (1L ^ var32) & -1L >>> 32;
            }

            var34 ^= ((long)iiiIlIIIll(this.iIIIililil, tick) ^ var34) & -1L >>> 32;
            class_243 var26 = var45 != null || (int)(var34 >>> 32) == 0 && (int)var34 == 0 ? null : this.ilIllIiIll(chargeDropped, st.liiiIIllIl(), tick, (boolean)((int)(var34 >>> 32)));
            if (var26 != null) {
               var15 = var26;
               var42 = iIllIlllIlllIlll.IliIlllilIi(var26);
               this.liiiililil = true;
               ++this.iiiiililil;
               var32 ^= (1L ^ var32) & -1L >>> 32;
            } else if (var45 != null) {
               this.IlIllllIll();
            }

            this.Iliiililil = (int)(var34 >>> 32) != 0 && (var45 != null || var26 != null || (int)var34 != 0);
         } else {
            this.lIIlliIIll();
            this.IlIllllIll();
         }

         this.iIlIiIllIi(chargeDropped, st.liiiIIllIl(), var15, var16);
         if (var14 == IIliIilIliIi.iiiiiIIIlIIIIIlIIl || var14 == IIliIilIliIi.IiiiiIIIlliiiiIIIl) {
            lIIlillliIIlilll var46 = iilIIillIIiIIill.liiiIIllIl(chargeDropped, stuckJ.iliIiiliiiii());
            if (var46 == lIIlillliIIlilll.IIIilIlill) {
               this.liilililil = iIiIllilIliIllil.IliilliIil;
               return new iIllllIlIlllllIl(false, (double)0.0F, (double)0.0F, IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, true);
            }

            if (var46 == lIIlillliIIlilll.lIIilIlill && this.IIIlilIIli(chargeDropped)) {
               this.liilililil = iIiIllilIliIllil.IliilliIil;
               double[] var54 = iIIliIlIli(st.liiiIIllIl(), tick, var13, var15);
               iIllllIlIlllllIl var56 = iIllllIlIlllllIl.liiiIIllIl(var54[0], var54[1], true).iIlIlllllill(IilIIIililIIIi.iIillIiliIlillIili).IilliliilIIi(IilIIIililIIIi.iIillIiliIlillIili).iliIiiliiiii();
               return this.illliIilli(st, (int)var30 != 0 ? var56.lIiiIiIlilli(IilIIIililIIIi.iIillIiliIlillIili) : var56);
            }
         }

         switch (var14) {
            case iiiiiIIIlIIIIIlIIl:
               iiIIliIiIIlIliIi var48 = this.Iiililiili(chargeDropped, st, var15, var16, var16 + 0.4, var42);
               if (!var48.IliIlllilIi()) {
                  iIllllIlIlllllIl var53 = var48.IilliliilIIi() ? this.lIiIiiIiIi(chargeDropped, st, var15, face) : null;
                  return var53 != null ? var53 : this.lIlliiIlli(st, false);
               }

               return this.illliIilli(st, Illlilllli(true, var48.liiiIIllIl(), var48.iIlIlllllill(), false, false, false));
            case iIiiiIIIlIliiiIIIl:
               var36 ^= ((long)((int)(var30 >>> 32) == 0 && (int)var30 == 0 ? 1 : 0) << 32 ^ var36) & -1L << 32;
               iiIIliIiIIlIliIi var52 = this.Iiililiili(chargeDropped, st, var15, var16, var16 + 0.4 + 0.4, var42);
               if (var52.IilliliilIIi()) {
                  iIllllIlIlllllIl var55 = this.lIiIiiIiIi(chargeDropped, st, var15, face);
                  if (var55 != null) {
                     return var55;
                  }

                  liIiIlliiIiIll var57 = this.iIliiIllii(chargeDropped, st, var15, tick, 0.4, false);
                  return this.illliIilli(st, Illlilllli(var57.IliIlllilIi(), var57.liiiIIllIl(), var57.iIlIlllllill(), (int)(var36 >>> 32) != 0 && (self || (int)(var32 >>> 32) != 0), false, false));
               } else {
                  if (!var52.IliIlllilIi()) {
                     return this.lIlliiIlli(st, (int)(var36 >>> 32) != 0 && (self || (int)(var32 >>> 32) != 0));
                  }

                  var36 ^= ((long)((int)(var36 >>> 32) == 0 || !this.lIiiiiIiii(st, var52.liiiIIllIl(), var52.iIlIlllllill(), reset) && (int)(var32 >>> 32) == 0 && !anchorPending && !self && !var52.iliIiiliiiii() ? 0 : 1) ^ var36) & -1L >>> 32;
                  return this.illliIilli(st, Illlilllli(true, var52.liiiIIllIl(), var52.iIlIlllllill(), (boolean)((int)var36), (var52.IIIllIIliIIl() || var52.lIiiIiIlilli() > (double)2.0F) && (int)var30 == 0, false));
               }
            case lliiiIIIliliiiIIIl:
               iiIIliIiIIlIliIi var47 = this.Iiililiili(chargeDropped, st, var15, var16, var16 + 0.4, var42);
               if (!var47.IliIlllilIi()) {
                  iIllllIlIlllllIl var51 = var47.IilliliilIIi() ? this.lIiIiiIiIi(chargeDropped, st, var15, face) : null;
                  return var51 != null ? var51 : iIllllIlIlllllIl.IliIlllilIi();
               }

               return this.illliIilli(st, Illlilllli(true, var47.liiiIIllIl(), var47.iIlIlllllill(), false, (var47.IIIllIIliIIl() || var47.lIiiIiIlilli() > (double)2.0F) && (int)var30 == 0, false));
            case IiiiiIIIlliiiiIIIl:
               if (this.Iliiililil) {
                  return this.liilliiill(st, var15, var16);
               } else {
                  var36 ^= ((long)((int)var32 == 0 && illilIilil(tick, var42, var13, face, (boolean)((int)var30)) ? 1 : 0) << 32 ^ var36) & -1L << 32;
                  iiIIliIiIIlIliIi var50 = this.Iiililiili(chargeDropped, st, var15, var16, var16 + ((int)(var36 >>> 32) != 0 ? 0.7 : (double)0.0F) + 0.4, var42);
                  var36 ^= ((long)((int)(var30 >>> 32) == 0 && (int)var30 == 0 ? 1 : 0) ^ var36) & -1L >>> 32;
                  if (!var50.IliIlllilIi()) {
                     iIllllIlIlllllIl var27 = var50.IilliliilIIi() ? this.lIiIiiIiIi(chargeDropped, st, var15, face) : null;
                     if (var27 != null) {
                        return var27;
                     }

                     if (var50.IilliliilIIi() && (int)(var36 >>> 32) != 0) {
                        liIiIlliiIiIll var28 = this.llliiillii(chargeDropped, st, var15, tick, 0.7, false, (double)0.0F);
                        return this.illliIilli(st, Illlilllli(var28.IliIlllilIi(), var28.liiiIIllIl(), var28.iIlIlllllill(), (int)var36 != 0 && (self || (int)(var32 >>> 32) != 0), false, false));
                     }

                     return this.lIlliiIlli(st, (int)var36 != 0 && (self || (int)(var32 >>> 32) != 0));
                  }

                  var38 ^= ((long)((int)var30 != 0 || !this.lIiiiiIiii(st, var50.liiiIIllIl(), var50.iIlIlllllill(), reset) && !var50.iliIiiliiiii() && !anchorPending ? 0 : 1) << 32 ^ var38) & -1L << 32;
                  var38 ^= ((long)((int)var36 == 0 || (int)(var32 >>> 32) == 0 && !self && !this.IIIIIllIIIIl(st, var50.liiiIIllIl(), var50.iIlIlllllill(), var50.lIiiIiIlilli(), this.iIliililil) ? 0 : 1) ^ var38) & -1L >>> 32;
                  var40 ^= ((long)((this.iIliililil || stuckJ.IilliliilIIi() || var50.IIIllIIliIIl() || var50.lIiiIiIlilli() > (double)2.0F) && (int)var30 == 0 ? 1 : 0) << 32 ^ var40) & -1L << 32;
                  return this.illliIilli(st, Illlilllli(true, var50.liiiIIllIl(), var50.iIlIlllllill(), (int)(var38 >>> 32) != 0 || (int)var38 != 0, (boolean)((int)(var40 >>> 32)), false));
               }
            default:
               return iIllllIlIlllllIl.IliIlllilIi();
         }
      }
   }

   static boolean IIlIilIlIi(iIllIlllIlllIlll stand, class_243 pos, class_243 nt, double tolerance) {
      double var5 = liIIiiiIIi(stand);
      if (Double.isFinite(var5) && stand.iliIiiliiiii() != null && iiiIIlIIIlIl(stand.iliIiiliiiii()) && pos != null && iiiIIlIIIlIl(pos)) {
         class_243 var7 = stand.iliIiiliiiii();
         if (nt != null && iiiIIlIIIlIl(nt) && Double.isFinite(tolerance)) {
            var5 = Math.max(var5, Math.hypot(nt.field_1352 - var7.field_1352, nt.field_1350 - var7.field_1350) + Math.max((double)0.0F, tolerance));
         }

         return Math.hypot(pos.field_1352 - var7.field_1352, pos.field_1350 - var7.field_1350) <= var5 + 0.001;
      } else {
         return true;
      }
   }

   public boolean IIIllIIliIIl() {
      return this.lilIililil;
   }

   static boolean liIlliiIll(double[] spot, iIilIiIiIlilIiIi cell) {
      if (cell != null && spot != null && spot.length >= 3) {
         double var2 = spot[0] - cell.IliIlllilIi();
         double var4 = spot[1] - cell.liiiIIllIl();
         double var6 = spot[2] - cell.iIlIlllllill();
         return lilliiiillii.IiIlliIliiIl(spot[1], Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6), cell.IilliliilIIi()) < (double)0.25F;
      } else {
         return true;
      }
   }

   private static double[] iIIliIlIli(class_243 pos, class_243 face, iiliiiIiIIiiiiIi c, class_243 feet) {
      if (face != null && iiiIIlIIIlIl(face)) {
         double[] var4 = IiiIIlliiIIl(face.field_1352 - pos.field_1352, face.field_1350 - pos.field_1350);
         if (var4 != null) {
            return var4;
         }
      }

      if (c != null && c.IiIlliIliiIl() != null && Float.isFinite(c.IiIlliIliiIl().iIlIlllllill())) {
         double var7 = Math.toRadians((double)c.IiIlliIliiIl().iIlIlllllill());
         return new double[]{-Math.sin(var7), Math.cos(var7)};
      } else {
         double[] var6 = IiiIIlliiIIl(feet.field_1352 - pos.field_1352, feet.field_1350 - pos.field_1350);
         return var6 != null ? var6 : new double[]{(double)0.0F, (double)0.0F};
      }
   }

   private liIiIlliiIiIll iIliiIllii(long self, lliiilIiiliiilIi jumpsOk, class_243 tick, class_243 goal, double face, boolean amp) {
      return this.llliiillii(self, jumpsOk, tick, goal, face, amp, (double)0.0F);
   }

   static boolean lIilliIill(liIIliliiIIlil env, double[] spot, class_243 cell, class_243 swim, iIilIiIiIlilIiIi him, boolean pos) {
      if (spot != null && spot.length >= 3 && cell != null && swim != null) {
         double var6 = Math.hypot(spot[0] - swim.field_1352, spot[2] - swim.field_1350);
         if (!(var6 < 0.7) && !(var6 > (double)3.5F)) {
            if (pos && spot[1] > cell.field_1351 + 1.2 + 0.001) {
               return false;
            } else {
               double var8 = ilillIiill(env, (int)Math.floor(spot[0]), (int)Math.floor(spot[2]), swim, him);
               return Double.isFinite(var8) && Math.abs(var8 - spot[1]) < 1.0E-6;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void IlIllllIll() {
      this.iliiililil = null;
      this.Iiiiililil = Long.MIN_VALUE;
   }

   private void liIiiiiIii(long pos, class_243 tick) {
      int[] var4 = this.llIIililil.iIiIlIliIl();
      if (var4 != null && var4.length >= 3) {
         this.llIIililil.illIlIilIl(var4[0], var4[1], var4[2], pos);
      } else {
         double[] var5 = IiiIIlliiIIl(this.illIililil, this.IilIililil);
         if (var5 != null) {
            class_2338 var6 = class_2338.method_49637(tick.field_1352 + var5[0] * 0.8, tick.field_1351 + 0.001, tick.field_1350 + var5[1] * 0.8);
            this.llIIililil.illIlIilIl(var6.method_10263(), var6.method_10264(), var6.method_10260(), pos);
         }
      }
   }

   public void liiiIIllIl(class_243 velocity, boolean explosion) {
      this.llIlililil = false;
      if (!explosion && velocity != null && Math.hypot(velocity.field_1352, velocity.field_1350) >= 0.3) {
         this.ilIlililil = true;
         this.IiIlililil = velocity.field_1352;
         this.liIlililil = velocity.field_1350;
      }
   }

   private class_243 ilIllIiIll(long him, class_243 swim, class_243 pos, boolean tick) {
      long var9 = 1991791365048977741L;
      var9 ^= ((long)(this.Iiiiililil != Long.MIN_VALUE && him >= this.Iiiiililil && him - this.Iiiiililil < 10L ? 0 : 1) << 32 ^ var9) & -1L << 32;
      double[] var7 = this.iliiililil;
      if (var7 != null && !IIllllIlll(this.iIIIililil, var7, swim, tick)) {
         var7 = null;
         var9 ^= (4294967296L ^ var9) & -1L << 32;
      }

      if ((int)(var9 >>> 32) != 0) {
         this.Iiiiililil = him;
         double[] var8 = iIlllIllll(this.iIIIililil, swim, pos, this.IIliililil, this.lIliililil, this.llIIililil.lIiiIiIlilli(), tick);
         if (var8 != null) {
            var7 = var8;
         }
      }

      if (var7 != null && !liIlliiIll(var7, this.llliililil)) {
         var7 = null;
      }

      this.iliiililil = var7;
      return var7 == null ? null : new class_243(var7[0], var7[1], var7[2]);
   }

   public void llIililIil() {
      this.IlIIililil.IliIlllilIi();
      this.llIIililil.IiiIlliiIl();
      this.ilIIililil = null;
      this.IiIIililil = false;
      this.liIIililil = false;
      this.iiIIililil = false;
      this.IIlIililil = Double.NaN;
      this.lIlIililil = Double.NaN;
      this.iIlIililil = Long.MIN_VALUE;
      this.IllIililil = (double)0.0F;
      this.lllIililil = (double)0.0F;
      this.illIililil = (double)0.0F;
      this.IilIililil = (double)0.0F;
      this.lilIililil = false;
      this.iilIililil = (double)0.0F;
      this.IIiIililil = (double)0.0F;
      this.lIiIililil = null;
      this.iIiIililil = false;
      this.IliIililil = 1;
      this.lliIililil = Long.MIN_VALUE;
      this.iliIililil = false;
      this.IiiIililil = false;
      this.liiIililil = false;
      this.iiiIililil = Long.MIN_VALUE;
      this.IIIlililil = Long.MAX_VALUE;
      this.lIIlililil = false;
      this.iIIlililil = Long.MIN_VALUE;
      this.IlIlililil = -1;
      this.llIlililil = false;
      this.ilIlililil = false;
      this.iiIlililil = 0;
      this.iIllililil = null;
      this.Illlililil = Long.MIN_VALUE;
      this.llllililil = Long.MIN_VALUE;
      this.illlililil = false;
      this.Iillililil = Float.NaN;
      this.lillililil = Long.MIN_VALUE;
      this.iillililil = false;
      this.lIilililil = false;
      this.iIilililil = Long.MIN_VALUE;
      this.Ililililil = Long.MIN_VALUE;
      this.llilililil = Long.MIN_VALUE;
      this.ililililil = (double)0.0F;
      this.Iiilililil = (double)0.0F;
      this.liilililil = null;
      this.iiilililil = iIiIllilIliIllil.lIIIiliIil;
      this.IIIiililil = false;
      this.IilIililIi();
      this.llIiililil = Long.MIN_VALUE;
      this.IiIiililil = null;
      this.liIiililil = Long.MIN_VALUE;
      this.iiIiililil = Long.MIN_VALUE;
      this.IIliililil = (double)0.0F;
      this.lIliililil = (double)0.0F;
      this.iIliililil = false;
      this.liliililil = false;
      this.llliililil = null;
      this.Iiiiliiiiiii();
      this.iIiiililil = false;
      this.Iliiililil = false;
      this.lIIlliIIll();
      this.liiiililil = false;
      this.IlIllllIll();
   }

   public void Iliilliiilii(boolean on) {
      this.IIilililil = on;
   }

   // $FF: synthetic method
   private static CallSite IIllIllIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + '꤮') ^ 23839))))) << 4 | (char)(-((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + '꤮') ^ 23839))))) >>> 12) ^ var5) ^ var5) ^ 32636) + 'ꞝ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static double liIIiiiIIi(iIllIlllIlllIlll nt) {
      if (nt != null && nt.IIIllIIliIIl() != null) {
         double var10000;
         switch (nt.IIIllIIliIIl()) {
            case iillilIiIl:
            case iIililIiIl:
               var10000 = 3.2;
               break;
            case IIililIiIl:
               var10000 = 3.8;
               break;
            case lIililIiIl:
               var10000 = Double.POSITIVE_INFINITY;
               break;
            default:
               throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      } else {
         return Double.POSITIVE_INFINITY;
      }
   }

   public boolean IlIlllIlilIl() {
      return this.iillililil;
   }

   static boolean IIiillIiil(float dx, double yaw, double dz) {
      double[] var5 = IiiIIlliiIIl(yaw, dz);
      if (var5 != null && Float.isFinite(dx)) {
         double var6 = Math.toRadians((double)dx);
         return -var5[0] * Math.sin(var6) + var5[1] * Math.cos(var6) >= Math.cos(Math.toRadians((double)60.0F)) - 0.001;
      } else {
         return false;
      }
   }

   static double[] IiiIIlliiIIl(double z, double x) {
      double var4 = Math.hypot(z, x);
      return var4 > 1.0E-6 && Double.isFinite(var4) ? new double[]{z / var4, x / var4} : null;
   }

   public boolean IIillIiliIil() {
      return this.iIliililil;
   }

   private iIllllIlIlllllIl iiIliIIlli(lliiilIiiliiilIi jumpsOk, IiliIililiIi dg, boolean self) {
      long var17 = 7221904732974481525L;
      long var19 = 1227133069965827977L;
      if (dg instanceof IiliIililiIi) {
         IiliIililiIi var10000 = dg;

         try {
            var34 = var10000.IliIlllilIi();
         } catch (Throwable var26) {
            throw new MatchException(var26.toString(), var26);
         }

         double var13 = var34;
         double var4 = var13;
         var10000 = dg;

         try {
            var36 = var10000.liiiIIllIl();
         } catch (Throwable var25) {
            throw new MatchException(var25.toString(), var25);
         }

         var13 = var36;
         var10000 = dg;

         try {
            var38 = var10000.iIlIlllllill();
         } catch (Throwable var24) {
            throw new MatchException(var24.toString(), var24);
         }

         var17 ^= ((long)var38 << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)((int)(var17 >>> 32)) ^ var17) & -1L >>> 32;
         var10000 = dg;

         try {
            var40 = var10000.IilliliilIIi();
         } catch (Throwable var23) {
            throw new MatchException(var23.toString(), var23);
         }

         var17 ^= ((long)var40 << 32 ^ var17) & -1L << 32;
         var19 ^= ((long)((int)(var17 >>> 32)) << 32 ^ var19) & -1L << 32;
         var10000 = dg;

         try {
            var10000.lIiiIiIlilli();
         } catch (Throwable var22) {
            throw new MatchException(var22.toString(), var22);
         }

         var10000 = dg;

         try {
            var10000.iliIiiliiiii();
         } catch (Throwable var21) {
            throw new MatchException(var21.toString(), var21);
         }

         this.liilililil = iIiIllilIliIllil.lIiilliIil;
         double[] var12 = IiiIIlliiIIl(var4, var13);
         var17 ^= ((long)(var12 != null ? 1 : 0) << 32 ^ var17) & -1L << 32;
         var19 ^= ((long)((int)var17 != 0 && self && jumpsOk.iliIiiliiiii() && !this.IIilililil ? 1 : 0) ^ var19) & -1L >>> 32;
         iIllllIlIlllllIl var15 = new iIllllIlIlllllIl((boolean)((int)(var17 >>> 32)), (int)(var17 >>> 32) != 0 ? var12[0] : (double)0.0F, (int)(var17 >>> 32) != 0 ? var12[1] : (double)0.0F, (int)var19 != 0 ? IilIIIililIIIi.IIillIililIillIili : IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, IilIIIililIIIi.iIillIiliIlillIili, true);
         return this.illliIilli(jumpsOk, var15);
      } else {
         return iIllllIlIlllllIl.IliIlllilIi();
      }
   }

   static IlliIiIlllliIiIl IiIilliIil(IiiIliliiIli d) {
      return d != null && d.Iiilliiliiil() != null && !d.IIIilIIiiIIi() ? d.Iiilliiliiil().Iilllilliill() : null;
   }

   private liIiIlliiIiIll llliiillii(long goal, lliiilIiiliiilIi jumpsOk, class_243 tick, class_243 face, double pause, boolean amp, double self) {
      long var33 = -7137159437091996807L;
      class_243 var11 = jumpsOk.liiiIIllIl();
      double[] var12 = face != null && iiiIIlIIIlIl(face) ? IiiIIlliiIIl(face.field_1352 - var11.field_1352, face.field_1350 - var11.field_1350) : null;
      if (var12 == null) {
         var12 = IiiIIlliiIIl(tick.field_1352 - var11.field_1352, tick.field_1350 - var11.field_1350);
      }

      if (var12 == null) {
         var12 = new double[]{(double)0.0F, (double)1.0F};
      }

      double var13 = -var12[1];
      double var15 = var12[0];
      double var17 = var11.field_1352 - tick.field_1352;
      double var19 = var11.field_1350 - tick.field_1350;
      double var21 = var17 * var13 + var19 * var15;
      double var23 = var17 * var12[0] + var19 * var12[1];
      if (this.lliIililil == Long.MIN_VALUE || goal >= this.lliIililil) {
         if (this.lIIIililil.nextDouble() < self) {
            this.iliIililil = true;
            this.lliIililil = goal + 3L + (long)this.lIIIililil.nextInt(4);
            this.IiiIililil = false;
         } else {
            this.iliIililil = false;
            this.lliIililil = goal + 5L + (long)this.lIIIililil.nextInt(8);
            var33 ^= ((long)this.Iiliililii(var11, var13, var15) << 32 ^ var33) & -1L << 32;
            if (Math.abs(var21) > (double)0.5F * pause) {
               this.IliIililil = var21 > (double)0.0F ? -1 : 1;
            } else if ((int)(var33 >>> 32) != 0) {
               this.IliIililil = (int)(var33 >>> 32);
            } else {
               this.IliIililil = this.lIIIililil.nextBoolean() ? 1 : -1;
            }

            this.IiiIililil = amp && this.lIIIililil.nextDouble() < 0.08 && !this.IIilililil;
         }
      }

      if (this.iliIililil) {
         return new liIiIlliiIiIll(false, (double)0.0F, (double)0.0F, false);
      } else {
         if (var21 * (double)this.IliIililil >= pause) {
            this.IliIililil = -this.IliIililil;
         }

         double var25 = pause > (double)0.0F ? Math.max((double)-1.0F, Math.min((double)1.0F, var23 / pause)) * 0.6 : (double)0.0F;
         double var27 = var13 * (double)this.IliIililil - var12[0] * var25;
         double var29 = var15 * (double)this.IliIililil - var12[1] * var25;
         var33 ^= ((long)(this.IiiIililil && amp ? 1 : 0) ^ var33) & -1L >>> 32;
         this.IiiIililil = false;
         double[] var32 = IiiIIlliiIIl(var27, var29);
         return var32 == null ? new liIiIlliiIiIll(false, (double)0.0F, (double)0.0F, (boolean)((int)var33)) : new liIiIlliiIiIll(true, var32[0], var32[1], (boolean)((int)var33));
      }
   }

   private boolean llIliilIli(long stance, lliiilIiiliiilIi d, class_243 self, IiiIliliiIli face, IlIIIillllIIIill tick) {
      if (!this.IIilililil && face != null && face.IilliliilIIi() == iIlIIIIiIllIIIIi.liiiliIiil && tick == IlIIIillllIIIill.iIIilllill && face.IliIlllilIi() != iIllIliIlllIli.lIiiIIIIIl) {
         if (face.Iiilliiliiil() != null && !face.IIIilIIiiIIi()) {
            return false;
         } else if (self != null && iiiIIlIIIlIl(self) && d.iliIiiliiiii() && !d.iiIIlIIlIl() && !this.iIIIililil.IIlllIlliIll()) {
            if (d.Iliilliiilii() >= 0.9F && this.iIIIililil.Illlllllilll() >= 0.9F) {
               if (this.lillililil != Long.MIN_VALUE && stance - this.lillililil < 12L) {
                  return false;
               } else {
                  class_243 var7 = d.liiiIIllIl();
                  if (Math.hypot(self.field_1352 - var7.field_1352, self.field_1350 - var7.field_1350) > 2.8) {
                     return false;
                  } else {
                     return !this.iIIIIlIlIIIl(var7);
                  }
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlIlllIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ '쨫') << 10 | (char)((char)((char)(~var4[var5]) + var5) ^ '쨫') >>> 6) << 4 | (char)((char)((char)((char)(~var4[var5]) + var5) ^ '쨫') << 10 | (char)((char)((char)(~var4[var5]) + var5) ^ '쨫') >>> 6) >>> 12) - 'ꡠ'))) + var5) + var5))) - var5))) + var5) - var5) ^ 11630) ^ var5) - '顀') << 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ '쨫') << 10 | (char)((char)((char)(~var4[var5]) + var5) ^ '쨫') >>> 6) << 4 | (char)((char)((char)((char)(~var4[var5]) + var5) ^ '쨫') << 10 | (char)((char)((char)(~var4[var5]) + var5) ^ '쨫') >>> 6) >>> 12) - 'ꡠ'))) + var5) + var5))) - var5))) + var5) - var5) ^ 11630) ^ var5) - '顀') >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean iiiIIlIIIlIl(class_243 v) {
      return Double.isFinite(v.field_1352) && Double.isFinite(v.field_1351) && Double.isFinite(v.field_1350);
   }

   public iIIlliilIlIlliil(Random rnd) {
      this(rnd, iIIIllilIlIIllil.IIIllIIliIIl((IilIllililIlli)null, (iilIiiIIiIii)null));
   }

   public iIIlliilIlIlliil(Random nav, iIIIllilIlIIllil rnd) {
      this(nav, new IIlIlillIlIlil(), rnd);
   }

   static boolean lilIIliilIIl(liIIliliiIIlil env, class_243 to, class_243 allowJump, boolean from, double maxDrop, int maxLen) {
      double var7 = IIiIIllIiIIl(env, to, allowJump, from, maxDrop, maxLen);
      if (Double.isNaN(var7)) {
         return false;
      } else if (Math.hypot(allowJump.field_1352 - to.field_1352, allowJump.field_1350 - to.field_1350) > maxDrop) {
         return true;
      } else {
         return Math.abs(var7 - allowJump.field_1351) <= 0.601;
      }
   }

   static iIllIlllIlllIlll Iiiilliiil(IlliIiIlllliIiIl st, class_243 feet) {
      class_243 var2 = feet != null ? feet : (st == null ? null : st.liiiIIllIl());
      return st != null && st.IIIllIIliIIl() != null && st.IlIlllIlilIl() != null && iiiIIlIIIlIl(st.IIIllIIliIIl()) ? new iIllIlllIlllIlll(st.IIIllIIliIIl(), st.IlIlllIlilIl(), var2) : iIllIlllIlllIlll.IliIlllilIi(var2);
   }

   private boolean IliIilliIi(class_243 p) {
      return p != null && iiiIIlIIIlIl(p) && this.iIIIililil.iliIiiliiiii(class_2338.method_49637(p.field_1352, p.field_1351 + 0.001, p.field_1350));
   }

   // $FF: synthetic method
   private static CallSite liIlIliiIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 7 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 9))) - 2495) + var5) + 2600) ^ var5) ^ 2843) - var5))) ^ '谭') ^ '\ude17') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
