package gg.corz;

public final class IlIlIlillIlIli {
   public static final double iIilIIIIIl = -0.8;
   public static final double lIilIIIIIl = (double)1.5F;
   public static final double IIilIIIIIl = (double)3.0F;
   public static final double IillIIIIIl = 0.4;
   public static final double lillIIIIIl = (double)-4.0F;
   public static final double illlIIIIIl = (double)3.0F;
   public static final double IlllIIIIIl = (double)2.0F;
   public static final double iillIIIIIl = (double)-5.0F;
   public static final double llllIIIIIl = (double)6.0F;
   public static final double iIllIIIIIl = (double)3.0F;

   private IlIlIlillIlIli() {
   }

   public static double liiiIIllIl(double d, double max, double min) {
      if (Double.isNaN(d)) {
         return Double.POSITIVE_INFINITY;
      } else if (d < max) {
         return (max - d) * (double)3.0F;
      } else {
         return d > min ? (d - min) * (double)2.0F : (double)0.0F;
      }
   }

   public static double IliIlllilIi(double w, double offense, double dy, int bandMin, double nearCurrent, double distToTarget, double holeBonus, int threat, double bandMax, double defensive, boolean hazard, lilliIiiilliIi jumps, boolean pathTicks) {
      if (jumps == null) {
         return Double.NEGATIVE_INFINITY;
      } else {
         double var21 = (double)jumps.liiiIIllIl() * w - (double)jumps.IilliliilIIi() * offense - (double)jumps.lIiiIiIlilli() * (dy + (double)6.0F * (double)Math.max(0, bandMin)) - (double)jumps.iliIiiliiiii() * liiiIIllIl(nearCurrent, distToTarget, holeBonus) + (double)jumps.IIIllIIliIIl() * iIlIlllllill(threat) - (double)jumps.IlIlllIlilIl() * bandMax + (pathTicks ? (double)3.0F * (double)jumps.IilliliilIIi() : (double)3.0F) * defensive + (hazard ? 0.4 : (double)0.0F);
         return Double.isNaN(var21) ? Double.NEGATIVE_INFINITY : var21;
      }
   }

   public static double iIlIlllllill(int dy) {
      if (dy == 1) {
         return (double)-4.0F;
      } else if (dy >= 2) {
         return (double)-5.0F;
      } else if (dy == -1) {
         return (double)3.0F;
      } else if (dy == -2) {
         return (double)1.5F;
      } else {
         return dy <= -3 ? -0.8 : (double)0.0F;
      }
   }
}
