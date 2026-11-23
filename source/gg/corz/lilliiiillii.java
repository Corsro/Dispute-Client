package gg.corz;

public final class lilliiiillii {
   public static final double IilIiilIllilIiilIl = (double)0.5F;
   public static final double iIiliilIlIliliilIl = (double)0.25F;
   public static final double IllliilIllllliilIl = (double)1.0F;
   public static final double iIIliilIlIlIliilIl = (double)1.0F;
   public static final double lIlliilIliIlliilIl = (double)6.0F;
   public static final double lliliilIlililiilIl = (double)12.0F;
   public static final double iliIiilIlIiiIiilIl = (double)-2.5F;
   public static final double lIIiiilIliIIiiilIl = (double)4.5F;
   public static final double lIiIiilIliIiIiilIl = (double)-0.5F;
   public static final double lilliilIliilliilIl = (double)4.0F;
   public static final double illliilIlIilliilIl = (double)0.0F;
   public static final double iiIliilIlIIlliilIl = (double)20.0F;
   public static final double IIiliilIllIiliilIl = (double)20.0F;
   public static final double iiiliilIlIIIiiilIl = (double)3.0F;
   public static final double liiIiilIliiiIiilIl = (double)3.0F;
   public static final double IIIliilIllIIliilIl = 0.4;
   public static final double IiiliilIlliiliilIl = (double)0.5F;
   public static final int ilIiiilIlIiIiiilIl = 2;
   public static final double IiIliilIlliIliilIl = (double)4.0F;
   public static final int IlIiiilIlllIiiilIl = 6;
   public static final double IliIiilIllliIiilIl = (double)-1.5F;
   public static final double llIliilIlilIliilIl = (double)4.0F;
   public static final double iilIiilIlIIiIiilIl = (double)-3.5F;

   public static double IliIlllilIi(double feetY, double hisLevel) {
      return !Double.isNaN(feetY) && !Double.isNaN(hisLevel) ? (double)1.0F - IIiiIIllIiiIIl.IilliliilIIi(feetY, hisLevel) : (double)0.0F;
   }

   public static double IilliliilIIi(double rel) {
      if (Double.isNaN(rel)) {
         return (double)6.0F;
      } else if (rel > (double)0.5F) {
         return (double)20.0F;
      } else if (rel > (double)-0.5F) {
         return (double)6.0F;
      } else if (rel > (double)-1.5F) {
         return (double)1.0F;
      } else if (rel > (double)-2.5F) {
         return (double)0.0F;
      } else {
         return rel >= (double)-3.5F ? (double)4.0F : (double)20.0F;
      }
   }

   public static IiIIIIliliIIIIli IlIlllIlilIl(double walkEta, int pearlOk, int aimTicks, boolean above, boolean underFire, boolean pearlFlight) {
      long var12 = -2993920490706827485L;
      if (!above) {
         return IiIIIIliliIIIIli.llliiIIlIi;
      } else {
         var12 ^= ((long)(Double.isFinite(walkEta) && walkEta >= (double)0.0F ? 1 : 0) << 32 ^ var12) & -1L << 32;
         double var8 = (double)(Math.max(0, pearlOk) + Math.max(0, aimTicks)) + (double)1.0F;
         double var10 = underFire ? (double)2.0F : (double)6.0F;
         if ((int)(var12 >>> 32) != 0 && walkEta <= var8 + var10) {
            return IiIIIIliliIIIIli.iIliiIIlIi;
         } else if (!pearlFlight) {
            return (int)(var12 >>> 32) != 0 ? IiIIIIliliIIIIli.iIliiIIlIi : IiIIIIliliIIIIli.llliiIIlIi;
         } else {
            return IiIIIIliliIIIIli.IlliiIIlIi;
         }
      }
   }

   public static double lIiiIiIlilli(double rel, boolean reachOk) {
      if (Double.isNaN(rel)) {
         return (double)0.0F;
      } else if (rel > (double)0.5F) {
         return (double)-4.0F * rel;
      } else if (rel < (double)-3.5F) {
         return (double)-4.0F;
      } else {
         double var3 = IliIlllilIi(rel, (double)0.0F) * (double)3.0F;
         if (rel <= (double)-0.5F && rel > (double)-1.5F) {
            var3 += 0.4;
         }

         if (rel <= (double)-2.5F && !reachOk) {
            --var3;
         }

         return var3;
      }
   }

   public static boolean iliIiiliiiii(double h, double usFeetY, double hisLandingY) {
      if (!Double.isNaN(h) && !Double.isNaN(usFeetY) && !Double.isNaN(hisLandingY)) {
         double var6 = usFeetY - h;
         return var6 >= (double)0.5F && var6 <= (double)3.0F && hisLandingY <= (double)4.5F;
      } else {
         return false;
      }
   }

   public static int IIIllIIliIIl(boolean onGround, double vy, double drop) {
      long var10 = 4292059114594878091L;
      if (!onGround && Double.isFinite(vy) && Double.isFinite(drop) && !(drop < (double)0.0F)) {
         double var5 = (double)0.0F;
         double var7 = vy;

         for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < 40; var10 += 4294967296L) {
            var5 += var7;
            var7 = (var7 - 0.08) * 0.98;
            if (var5 <= -drop) {
               break;
            }
         }

         return (int)(var10 >>> 32);
      } else {
         return 0;
      }
   }

   public static boolean liiiIIllIl(double rel) {
      return rel > (double)0.5F;
   }

   public static double IiIlliIliiIl(double distToCentre, double feetY, double baseTop) {
      if (!Double.isNaN(distToCentre) && !Double.isNaN(feetY) && !Double.isNaN(baseTop)) {
         double var6 = (double)1.0F - feetY / (double)12.0F;
         return var6 <= (double)0.0F ? (double)0.0F : var6 * IIiiIIllIiiIIl.IilliliilIIi(distToCentre, baseTop);
      } else {
         return (double)0.0F;
      }
   }

   private lilliiiillii() {
   }

   public static int iIlIlllllill(double rel) {
      return Double.isNaN(rel) ? 0 : (int)Math.max(-3L, Math.min(3L, Math.round(rel)));
   }
}
