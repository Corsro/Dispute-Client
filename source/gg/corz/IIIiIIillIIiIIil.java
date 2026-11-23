package gg.corz;

import net.minecraft.class_3532;

public final class IIIiIIillIIiIIil {
   private boolean llIIilIIil;
   private static final float IIIIilIIil = -30.0F;
   public boolean lliillIIil;
   public double iliillIIil;
   private static final float iIIIilIIil = 2.0F;
   public static final int illillIIil = 60;
   private final iIlIlliIllIlli lIiillIIil = new iIlIlliIllIlli();
   private final IliIIIlllliIIIll IIiillIIil = new IliIIIlllliIIIll();
   private static final float[] iilillIIil = new float[]{-62.0F, -46.0F, -33.0F, -23.0F, -15.0F, -9.0F, -4.0F, 1.0F, 6.0F, 12.0F, 19.0F, 27.0F, 36.0F};
   private static final float[] IilillIIil = new float[]{0.0F, -12.0F, 12.0F};
   private static final float[] lilillIIil = new float[]{-30.0F, 30.0F, -55.0F, 55.0F, -90.0F, 90.0F, -140.0F, 140.0F};
   private int iIiillIIil;
   private static final float lIIIilIIil = -47.0F;
   private static final double liiillIIil = (double)320.0F;
   private static final double iiiillIIil = (double)200.0F;
   private boolean IlIIilIIil;
   private double IiiillIIil = Double.longBitsToDouble(-4781524247990291405L ^ 4779617760917271603L);
   private boolean IliillIIil;

   private double IIillIiliIil(llIilIllilIilIll lower, double g, double dist) {
      long var9 = 3315126639698642236L;
      double var6 = lower.liiiIIllIl(g);
      var9 ^= ((long)(!Double.isNaN(lower.iiliIIilll) ? 1 : 0) << 32 ^ var9) & -1L << 32;
      return Math.max(var6 + ((int)(var9 >>> 32) != 0 ? Double.longBitsToDouble(8907754806131440974L ^ 4289313388262997326L) : lower.llIIlIilll), dist + Double.longBitsToDouble(-7947553338132469094L ^ -3346000418866664806L));
   }

   private double Iiilliiliiil(llIilIllilIilIll g, double y, double dist) {
      return Math.min(y, this.IIillIiliIil(g, dist, this.Iilllilliill(g, dist)));
   }

   public void IiIlliIliiIl(iiiiiilIIIIIIi terrain, IliIIIlllliIIIll yawCmd, int boostLeft, boolean out, llIilIllilIilIll g, float pitchCmd, float now, iIlIlliIllIlli fire) {
      IliIIIlllliIIIll var9 = this.IIiillIIil.liiiIIllIl(yawCmd);
      int var10 = out ? ilIiIlilIiIiIlil.IIIllIIliIIl(g.lIIIlIilll) : Math.max(0, boostLeft);
      double var11 = g.IliIlllilIi(var9.IiiIiiIlll, var9.iiiIiiIlll);
      double var13 = Double.MAX_VALUE;
      double var15 = (double)0.0F;
      double var17 = (double)0.0F;
      double var19 = (double)0.0F;
      double var21 = (double)0.0F;
      double var23 = (double)0.0F;
      double var25 = (double)0.0F;
      boolean var27 = false;
      int var28 = 60;

      for(int var29 = 0; var29 < 60; ++var29) {
         var9.IlIliiIlll = ilIiIlilIiIiIlil.IlIlllIlilIl(var9.IlIliiIlll, pitchCmd, 300.0F);
         var9.llIliiIlll = ilIiIlilIiIiIlil.IiIlliIliiIl(var9.llIliiIlll, now);
         ilIiIlilIiIiIlil.IilliliilIIi(var9, g.IIIIlIilll);
         ilIiIlilIiIiIlil.iliIiiliiiii(var9);
         if (var10 > 0) {
            ilIiIlilIiIiIlil.lIiiIiIlilli(var9);
            --var10;
         }

         double var30 = g.IliIlllilIi(var9.IiiIiiIlll, var9.iiiIiiIlll);
         int var32 = this.IlIillIiilIi(terrain, var9.IiiIiiIlll, var9.iiiIiiIlll, g);
         double var33 = var9.liiIiiIlll - (double)var32;
         if (!this.IliillIIil && var33 < 0.05) {
            var27 = true;
            var28 = var29;
            break;
         }

         if (!this.IliillIIil && var33 < (double)24.0F && var29 > 0) {
            double var35 = var9.IiiIiiIlll - var9.IIIliiIlll * (double)0.5F;
            double var37 = var9.iiiIiiIlll - var9.iIIliiIlll * (double)0.5F;
            int var39 = this.IlIillIiilIi(terrain, var35, var37, g);
            if (!this.IliillIIil && var9.liiIiiIlll - var9.lIIliiIlll * (double)0.5F - (double)var39 < 0.05) {
               var27 = true;
               var28 = var29;
               break;
            }
         }

         if (var33 < var13) {
            var13 = var33;
         }

         double var54 = Math.max(Math.max(g.iIlIlllllill(var30), var9.iIlIlllllill() * (double)5.0F), -var9.lIIliiIlll * (double)25.0F);
         if (g.IiIIlIilll && var54 < (double)10.0F) {
            var54 = (double)10.0F;
         }

         if (var9.lIIliiIlll < (double)-0.5F) {
            var25 += (-var9.lIIliiIlll - (double)0.5F) * (double)25.0F;
         }

         if (var33 < var54) {
            double var56 = var54 - var33;
            var15 += var56 * var56 * (double)0.5F + var56 * (double)2.0F;
         }

         if (var33 < (double)8.0F && var9.lIIliiIlll < (double)-0.5F) {
            var23 += (-var9.lIIliiIlll - (double)0.5F) * (double)30.0F;
         }

         if (var9.liiIiiIlll < g.iliiIIilll) {
            var21 += (g.iliiIIilll - var9.liiIiiIlll) * (double)4.0F;
         }

         double var57 = var29 < 20 ? 0.4 : (double)1.0F;
         var17 += Math.abs(this.Illlllllilll(g, var9.liiIiiIlll, var30)) * var57;
         var19 += var57;
      }

      double var52 = g.IliIlllilIi(var9.IiiIiiIlll, var9.iiiIiiIlll);
      double var31 = var9.iIlIlllllill();
      double var53 = var11 - var52;
      double var55;
      if (var27) {
         var55 = (double)1000000.0F + (double)(60 - var28) * (double)1000.0F;
      } else {
         double var58 = this.Illlllllilll(g, var9.liiIiiIlll, var52);
         boolean var59 = !Double.isNaN(g.iiliIIilll);
         double var40 = g.iiiiIIilll ? (double)4.0F : 2.2;
         double var42 = var59 ? 1.6 : 0.6;
         double var44 = g.IiIIlIilll ? (double)0.0F : (g.iiiiIIilll ? 0.35 : (double)1.0F);
         var55 = (var58 < (double)0.0F ? -var58 * var40 : var58 * var42) + var17 / Math.max(1.0E-6, var19) * 0.4 - var53 * var44 - (!var59 && !g.iiiiIIilll ? (this.Iiilliiliiil(g, var9.liiIiiIlll, var52) - this.Iiilliiliiil(g, yawCmd.liiIiiIlll, var11) + Ililllililil(var31) - Ililllililil(yawCmd.iIlIlllllill())) * g.ilIIlIilll : (double)0.0F) + var15 / (double)60.0F * (double)10.0F + var21 / (double)60.0F + var23 + var25 / (double)60.0F * (double)10.0F + (out ? g.liiiIIilll : (double)0.0F);
         if (var31 < 0.55) {
            var55 += (0.55 - var31) * (double)60.0F;
         }

         if (!Double.isNaN(g.iiliIIilll) && var52 < (double)120.0F && var31 > g.iIIIlIilll) {
            var55 += (var31 - g.iIIIlIilll) * (double)40.0F;
         }

         if (g.IiIIlIilll) {
            double var46 = Math.hypot(var9.IiiIiiIlll - g.liIIlIilll, var9.iiiIiiIlll - g.iiIIlIilll);
            if (var46 > g.IIlIlIilll * (double)1.5F) {
               var55 += (var46 - g.IIlIlIilll * (double)1.5F) * (double)1.5F;
            }
         } else {
            double var60 = Math.atan2(-var9.IIIliiIlll, var9.iIIliiIlll);
            double var48 = Math.atan2(-(g.illiIIilll - var9.IiiIiiIlll), g.IiliIIilll - var9.iiiIiiIlll);
            double var50 = Math.abs(class_3532.method_15338(Math.toDegrees(var60 - var48)));
            if (var52 > (double)8.0F) {
               var55 += var50 * 0.06;
            }
         }
      }

      fire.lilillIIIl = pitchCmd;
      fire.iilillIIIl = now;
      fire.IIiillIIIl = out;
      fire.lIiillIIIl = var55;
      fire.iIiillIIIl = var27 ? (double)-1.0F : var13;
      fire.IliillIIIl = var27;
      fire.lliillIIIl = var9.liiIiiIlll;
      fire.iliillIIIl = var31;
      fire.IiiillIIIl = var53;
   }

   public int IliIlllilIi() {
      return this.iIiillIIil;
   }

   public boolean IilliliilIIi() {
      return this.llIIilIIil;
   }

   public boolean lIiiIiIlilli() {
      return this.IlIIilIIil;
   }

   public double Illlllllilll(llIilIllilIilIll y, double dist, double g) {
      double var6 = this.Iilllilliill(y, g);
      double var8 = this.IIillIiliIil(y, g, var6);
      if (dist < var6) {
         return dist - var6;
      } else {
         return dist > var8 ? dist - var8 : (double)0.0F;
      }
   }

   private boolean iIlIlllllill(iiiiiilIIIIIIi now, IliIIIlllliIIIll canFire, int terrain, boolean g, llIilIllilIilIll boostLeft, float base, iIlIlliIllIlli out) {
      double var8 = boostLeft.IliIlllilIi(canFire.IiiIiiIlll, canFire.iiiIiiIlll);
      if (var8 < (double)80.0F) {
         return false;
      } else {
         double var10 = this.Iilllilliill(boostLeft, var8);
         double var12 = this.IIillIiliIil(boostLeft, var8, var10);
         if (boostLeft.iiiiIIilll) {
            var10 = Math.max(var10, boostLeft.liliIIilll - (double)6.0F);
         }

         boolean var14 = g && boostLeft.IiiiIIilll && terrain <= 0;
         if (!this.IlIIilIIil && canFire.liiIiiIlll < var10 && (var14 || terrain > 0)) {
            this.IlIIilIIil = true;
         }

         if (this.IlIIilIIil && canFire.liiIiiIlll >= var12 - (double)8.0F) {
            this.IlIIilIIil = false;
         }

         boolean var16 = false;
         float var15;
         if (this.IlIIilIIil) {
            var15 = -47.0F;
            var16 = var14 && canFire.lIIliiIlll < 0.45;
            if (!var14 && terrain <= 0 && canFire.lIIliiIlll < 0.05 && canFire.llIliiIlll < -37.0F) {
               this.IlIIilIIil = false;
               return false;
            }
         } else {
            double var17 = canFire.iIlIlllllill();
            var15 = var17 < (double)1.0F ? 14.0F : (var17 < 1.4 ? 7.0F : 2.0F);
         }

         this.IiIlliIliiIl(now, canFire, terrain, var16, boostLeft, base, var15, out);
         return !out.IliillIIIl && out.iIiillIIIl >= boostLeft.iIlIlllllill(var8) && out.iliillIIIl > 0.4;
      }
   }

   private double Iilllilliill(llIilIllilIilIll g, double dist) {
      long var9 = -4487017893201859907L;
      double var4 = g.liiiIIllIl(dist);
      var9 ^= ((long)(!Double.isNaN(g.iiliIIilll) ? 1 : 0) << 32 ^ var9) & -1L << 32;
      double var7 = var4 - ((int)(var9 >>> 32) != 0 ? Double.longBitsToDouble(-3155269744428640164L ^ -7769207562669713316L) : (g.iiiiIIilll ? Double.longBitsToDouble(3748782451895465009L ^ 8369475669577593905L) : g.IlIIlIilll));
      if ((int)(var9 >>> 32) == 0 || !(dist < g.IIiiIIilll * Double.longBitsToDouble(4820416563836980030L ^ 9015519616732597054L))) {
         var7 = Math.max(var7, Math.min(this.IiiillIIil, var4 + Double.longBitsToDouble(-915341043282596011L ^ -5533500986174329003L)));
      }

      return var7;
   }

   public double IIIilIIiiIIi(iiiiiilIIIIIIi x, double bearing, double terrain, float z, llIilIllilIilIll g) {
      double var8 = g.IliIlllilIi(bearing, terrain);
      double var10 = Math.min((double)320.0F, Double.isNaN(g.iiliIIilll) ? var8 + (double)24.0F : Math.max((double)0.0F, var8 - g.IIiiIIilll * 0.6));
      double var12 = ilIiIlilIiIiIlil.IliIlllilIi(z, 0.0F);
      double var14 = ilIiIlilIiIiIlil.iIlIlllllill(z, 0.0F);
      double var16 = Double.NEGATIVE_INFINITY;

      for(double var18 = (double)0.0F; var18 <= var10; var18 += (double)4.0F) {
         for(int var20 = -8; var20 <= 8; var20 += 8) {
            int var21 = class_3532.method_15357(bearing + var12 * var18 - var14 * (double)var20);
            int var22 = class_3532.method_15357(terrain + var14 * var18 + var12 * (double)var20);
            int var23 = x.surface(var21, var22);
            ++this.iIiillIIil;
            if (var23 == Integer.MIN_VALUE) {
               if (var18 <= (double)200.0F) {
                  var16 = Math.max(var16, g.lliiIIilll - g.IliiIIilll);
               }
            } else if ((double)var23 > var16) {
               var16 = (double)var23;
            }
         }
      }

      return var16 == Double.NEGATIVE_INFINITY ? (double)-100000.0F : var16;
   }

   private boolean IIIllIIliIIl(iIlIlliIllIlli p, llIilIllilIilIll g, IliIIIlllliIIIll now) {
      return p.IliillIIIl || p.iIiillIIIl < g.iIlIlllllill(g.IliIlllilIi(now.IiiIiiIlll, now.iiiIiiIlll)) * Double.longBitsToDouble(6690436157578573940L ^ 7150035123031067463L) || p.lIiillIIIl > Double.longBitsToDouble(-1147021961582062073L ^ -5733656707082201593L) || p.iliillIIIl < Double.longBitsToDouble(4868403869960345889L ^ 8956752880930608620L) && p.iIiillIIIl < Double.longBitsToDouble(-2393842607001044775L ^ -7024668923844757287L);
   }

   public double IIlllIlliIll() {
      return this.IiiillIIil;
   }

   private int IlIillIiilIi(iiiiiilIIIIIIi terrain, double x, double g, llIilIllilIilIll z) {
      this.IliillIIil = false;
      int var7 = Integer.MIN_VALUE;
      boolean var8 = false;
      int var9 = class_3532.method_15357(x - 0.3);
      int var10 = class_3532.method_15357(x + 0.3);
      int var11 = class_3532.method_15357(g - 0.3);
      int var12 = class_3532.method_15357(g + 0.3);

      for(int var13 = var9; var13 <= var10; ++var13) {
         for(int var14 = var11; var14 <= var12; ++var14) {
            int var15 = terrain.surface(var13, var14);
            ++this.iIiillIIil;
            if (var15 == Integer.MIN_VALUE) {
               var8 = true;
            } else if (var15 > var7) {
               var7 = var15;
            }
         }
      }

      if (var8) {
         int var16 = (int)Math.ceil(z.lliiIIilll - z.IliiIIilll);
         if (var7 == Integer.MIN_VALUE || var16 > var7) {
            this.IliillIIil = true;
            return var16;
         }
      }

      return var7 == Integer.MIN_VALUE ? -100000 : var7;
   }

   public iIlIlliIllIlli liiiIIllIl(iiiiiilIIIIIIi canFire, IliIIIlllliIIIll terrain, int now, boolean g, llIilIllilIilIll boostLeft) {
      iIlIlliIllIlli var6 = new iIlIlliIllIlli();
      this.iIiillIIil = 0;
      this.llIIilIIil = false;
      float var7 = ilIiIlilIiIiIlil.IIlllIlliIll(terrain.IiiIiiIlll, terrain.iiiIiiIlll, boostLeft.illiIIilll, boostLeft.IiliIIilll);
      float var8 = terrain.IlIliiIlll + class_3532.method_15393(var7 - terrain.IlIliiIlll);
      this.IiiillIIil = this.IIIilIIiiIIi(canFire, terrain.IiiIiiIlll, terrain.iiiIiiIlll, var7, boostLeft) + boostLeft.IliiIIilll + Double.longBitsToDouble(-6815984892694516642L ^ -2199795274639758242L);
      if (Double.isNaN(boostLeft.iiliIIilll) && this.iIlIlllllill(canFire, terrain, now, g, boostLeft, var8, var6)) {
         this.llIIilIIil = true;
         return var6;
      } else {
         this.IlIlllIlilIl(canFire, terrain, now, g, boostLeft, var8, IilillIIil, var6, false, true);
         this.lliillIIil = this.IIIllIIliIIl(var6, boostLeft, terrain);
         this.iliillIIil = var6.lIiillIIIl;
         if (this.lliillIIil) {
            this.IlIlllIlilIl(canFire, terrain, now, g, boostLeft, var8, IilillIIil, var6, false, false);
            if (this.IIIllIIliIIl(var6, boostLeft, terrain)) {
               this.IlIlllIlilIl(canFire, terrain, now, g, boostLeft, var8, lilillIIil, var6, true, false);
            }
         }

         return var6;
      }
   }

   private void IlIlllIlilIl(iiiiiilIIIIIIi wide, IliIIIlllliIIIll g, int best, boolean yaws, llIilIllilIilIll now, float economy, float[] canFire, iIlIlliIllIlli base, boolean boostLeft, boolean terrain) {
      boolean var11 = yaws && now.IiiiIIilll && best <= 0;

      for(float var15 : canFire) {
         for(float var19 : iilillIIil) {
            for(int var20 = 0; var20 < (var11 ? 2 : 1); ++var20) {
               if (var20 != 1 || !terrain || !(var19 > -30.0F) || now.iiiiIIilll) {
                  this.IiIlliIliiIl(wide, g, best, var20 == 1, now, economy + var15, var19, this.lIiillIIil);
                  iIlIlliIllIlli var10000 = this.lIiillIIil;
                  var10000.lIiillIIIl += (double)Math.abs(var15) * 0.08;
                  this.lIiillIIil.liiillIIIl = boostLeft;
                  if (this.lIiillIIil.lIiillIIIl < base.lIiillIIIl) {
                     base.IliIlllilIi(this.lIiillIIil);
                  }
               }
            }
         }
      }

   }

   public void iliIiiliiiii() {
      this.IlIIilIIil = false;
   }

   private static double Ililllililil(double hs) {
      return hs * hs / Double.longBitsToDouble(-5396588298603888022L ^ -8440012429345057263L) * Double.longBitsToDouble(-3475131423925523020L ^ -1140461871849622482L);
   }
}
