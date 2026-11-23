package gg.corz;

public final class iiilillIIIiill {
   public static final double IiiIiIlIiliiIiIlIi = 0.2;
   public static final double IIiIiIlIilIiIiIlIi = 0.2;
   public static final int IIlliIlIilIlliIlIi = 4;
   public static final int liIliIlIiiiIliIlIi = 2;
   public static final double iIiIiIlIiIliIiIlIi = (double)20.0F;
   public static final double lIlIiIlIiiIlIiIlIi = 0.2;
   public static final double lliIiIlIiiliIiIlIi = (double)25.0F;
   public static final double lilIiIlIiiilIiIlIi = (double)0.25F;
   public static final double iiiIiIlIiIIIliIlIi = 0.15;
   public static final double IllIiIlIilllIiIlIi = 0.16;
   public static final double IlIliIlIillIliIlIi = (double)2.0F;
   public static final double lIIliIlIiiIIliIlIi = (double)4.0F;
   public static final double illIiIlIiIilIiIlIi = 0.15;
   public static final double ilIliIlIiIiIliIlIi = (double)12.0F;

   public static int lIiiIiIlilli(double y) {
      double var2 = y - Math.floor(y);
      return Math.abs(var2 - (double)0.5F) < 1.0E-4 ? (int)Math.floor(y) : (int)Math.floor(y - (double)1.0F + 1.0E-4);
   }

   private static boolean Iilililiiili(int sideZ, int sideX, iliIIlIlIiiIIlIl d) {
      return sideZ != 0 && sideZ == d.IiiiIiilIl || sideX != 0 && sideX == d.liiiIiilIl;
   }

   public static double[] IIillIiliIil(iliIIlIlIiiIIlIl targetZ, double d, double x, double targetX, double z) {
      double var9 = targetZ.IiiiIiilIl != 0 ? d - (double)targetZ.IiiiIiilIl * 0.15 : targetX;
      double var11 = targetZ.liiiIiilIl != 0 ? x - (double)targetZ.liiiIiilIl * 0.15 : z;
      return new double[]{var9, var11};
   }

   public static boolean Iiilliiliiil(int sideY, int sideX, int d, iliIIlIlIiiIIlIl sideZ, iliIIlIlIiiIIlIl alt, boolean allowTop) {
      if (sideX < 0) {
         return false;
      } else if (sideX > 0) {
         return allowTop;
      } else {
         return Iilililiiili(sideY, d, sideZ) || alt != null && Iilililiiili(sideY, d, alt);
      }
   }

   public static boolean Illlllllilll(iliIIlIlIiiIIlIl current, double d, boolean yaw) {
      if (!current.IliIlllilIi()) {
         return !yaw;
      } else {
         double var4 = iliIiiliiiii(current);
         return liiiIIllIl(d, var4 + (double)45.0F) <= liiiIIllIl(d, var4 - (double)45.0F);
      }
   }

   public static float IiIlliIliiIl(boolean cardinal, int edgeTicks) {
      if (cardinal) {
         return edgeTicks >= 6 ? 80.0F : 78.0F;
      } else {
         return edgeTicks > 10 ? 83.0F : 81.0F;
      }
   }

   private static double IIiilIiiiIii(double az, double bz, double ax, double bx) {
      double var8 = az - ax;
      double var10 = bz - bx;
      return var8 * var8 + var10 * var10;
   }

   public static double iliIiiliiiii(iliIIlIlIiiIIlIl d) {
      return Math.toDegrees(Math.atan2((double)d.IiiiIiilIl, (double)(-d.liiiIiilIl)));
   }

   public static double liiiIIllIl(double b, double a) {
      return Math.abs(IliIlllilIi(b - a));
   }

   public static boolean Iilllilliill(iliIIlIlIiiIIlIl fracX, double d, double fracZ) {
      return (double)fracX.IiiiIiilIl * (d - (double)0.5F) + (double)fracX.liiiIiilIl * (fracZ - (double)0.5F) > (double)0.0F;
   }

   public static int IIlilIliiIli(double roll) {
      long var4 = 1505489441556250702L;
      var4 ^= (12884901888L ^ var4) & -1L << 32;
      var4 ^= ((long)(2 + (int)Math.floor(Illillliilli(roll, (double)0.0F, (double)1.0F) * (double)((int)(var4 >>> 32)))) ^ var4) & -1L >>> 32;
      return Math.min(4, (int)var4);
   }

   public static double iIlIlllllill(double currentYaw, double targetYaw, double divisor) {
      return Illillliilli((double)2.0F + liiiIIllIl(currentYaw, targetYaw) / divisor, (double)2.0F, (double)12.0F);
   }

   public static boolean IlIillIiilIi(double targetX, double targetZ, double z, double x, double tolerance) {
      return Math.abs(z - targetX) <= tolerance && Math.abs(x - targetZ) <= tolerance;
   }

   public static boolean IiIiliIiiiIi(int feetX, int feetZ, int activation, int d, int placeX, int feetY, iliIIlIlIiiIIlIl placeY, int placed, int placeZ) {
      if (feetZ != placeX) {
         return true;
      } else if (placeY.IiiiIiilIl != 0 && placeY.liiiIiilIl == 0 && activation != feetY) {
         return true;
      } else if (placeY.liiiIiilIl != 0 && placeY.IiiiIiilIl == 0 && feetX != d) {
         return true;
      } else {
         double var9 = (double)feetX - (double)placed * (double)placeY.IiiiIiilIl - (double)d;
         double var11 = (double)activation - (double)placed * (double)placeY.liiiIiilIl - (double)feetY;
         return Math.sqrt(var9 * var9 + var11 * var11) > (double)placeZ + (double)2.0F;
      }
   }

   public static double[] IIlllIlliIll(iliIIlIlIiiIIlIl d, boolean reversed) {
      double[] var10000;
      switch (d) {
         case IIiiIiilIl -> var10000 = reversed ? new double[]{0.65, 0.35} : new double[]{0.35, 0.65};
         case iIiiIiilIl -> var10000 = reversed ? new double[]{0.65, 0.65} : new double[]{0.35, 0.35};
         case lliiIiilIl -> var10000 = reversed ? new double[]{0.35, 0.65} : new double[]{0.65, 0.35};
         case liliIiilIl -> var10000 = reversed ? new double[]{0.35, 0.35} : new double[]{0.65, 0.65};
         case iiliIiilIl -> var10000 = reversed ? new double[]{0.8, 0.8} : new double[]{0.8, 0.2};
         case IliiIiilIl -> var10000 = reversed ? new double[]{0.2, 0.2} : new double[]{0.2, 0.8};
         case lIiiIiilIl -> var10000 = reversed ? new double[]{0.2, 0.8} : new double[]{0.8, 0.8};
         case IiliIiilIl -> var10000 = reversed ? new double[]{0.8, 0.2} : new double[]{0.2, 0.2};
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private iiilillIIIiill() {
   }

   public static double IliIlllilIi(double degrees) {
      double var2 = degrees % (double)360.0F;
      if (var2 >= (double)180.0F) {
         var2 -= (double)360.0F;
      } else if (var2 < (double)-180.0F) {
         var2 += (double)360.0F;
      }

      return var2;
   }

   public static double IlIlllIlilIl(iliIIlIlIiiIIlIl errZ, double errX, double d) {
      double var5 = errZ.IliIlllilIi() ? (double)1.0F : Math.sqrt((double)2.0F);
      return Illillliilli((double)20.0F * ((double)errZ.IiiiIiilIl * d - (double)errZ.liiiIiilIl * errX) / var5, (double)-25.0F, (double)25.0F);
   }

   public static double IilliliilIIi(double speed, double error) {
      return 0.15 * ((double)0.25F * Illillliilli(speed, (double)2.0F, (double)12.0F) + 0.05 * Math.abs(error));
   }

   public static double IIIllIIliIIl(iliIIlIlIiiIIlIl reversed, boolean d) {
      double var2 = iliIiiliiiii(reversed);
      if (!reversed.IliIlllilIi()) {
         return var2;
      } else {
         return d ? var2 + (double)45.0F : var2 - (double)45.0F;
      }
   }

   public static boolean[] IIIilIIiiIIi(double velX, double yaw, double z, double velZ, double targetX, double targetZ, double step, double x) {
      long var28 = 6872289956594600010L;
      boolean[] var16 = new boolean[4];
      double var17 = yaw + velZ;
      double var19 = z + targetX;

      for(long var30 = var28 ^ (0L ^ var28) & -1L << 32; (int)(var30 >>> 32) < 4; var30 += 4294967296L) {
         double var22 = Math.toRadians(velX + (double)90.0F * (double)((int)(var30 >>> 32)));
         double var24 = var17 - Math.sin(var22) * x;
         double var26 = var19 + Math.cos(var22) * x;
         if (IIiilIiiiIii(var24, var26, targetZ, step) < IIiilIiiiIii(var17, var19, targetZ, step)) {
            var16[(int)(var30 >>> 32)] = true;
            var17 = var24;
            var19 = var26;
         }
      }

      return var16;
   }

   public static double[] Ililllililil(iliIIlIlIiiIIlIl targetZ, double z, double targetX, double x, double d) {
      if (!targetZ.IliIlllilIi()) {
         return new double[]{z + (double)targetZ.IiiiIiilIl * 0.2, targetX + (double)targetZ.liiiIiilIl * 0.2};
      } else {
         double var9 = targetZ.IiiiIiilIl != 0 ? z + (double)targetZ.IiiiIiilIl * (double)0.25F : x;
         double var11 = targetZ.liiiIiilIl != 0 ? targetX + (double)targetZ.liiiIiilIl * (double)0.25F : d;
         return new double[]{var9, var11};
      }
   }

   static double Illillliilli(double v, double hi, double lo) {
      return v < hi ? hi : Math.min(v, lo);
   }
}
