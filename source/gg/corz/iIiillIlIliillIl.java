package gg.corz;

public final class iIiillIlIliillIl {
   public static double iIlIlllllill(double x1, double x0, double t) {
      return x1 + (x0 - x1) * IliIlllilIi(t);
   }

   private iIiillIlIliillIl() {
   }

   public static double lIiiIiIlilli(long durationMs, long elapsedMs) {
      if (elapsedMs <= 0L) {
         return (double)1.0F;
      } else {
         double var4 = (double)durationMs / (double)elapsedMs;
         return var4 < (double)0.0F ? (double)0.0F : (var4 > (double)1.0F ? (double)1.0F : var4);
      }
   }

   public static long liiiIIllIl(double maxMs, double speed, long distancePx, long minMs) {
      double var8 = speed <= (double)0.0F ? (double)1.0F : speed;
      long var10 = Math.round(maxMs / var8 * (double)6.0F);
      return Math.max(distancePx, Math.min(minMs, var10));
   }

   public static double IilliliilIIi(double y0, double t, double y1) {
      return y0 + (t - y0) * IliIlllilIi(y1);
   }

   public static double IliIlllilIi(double t) {
      t = t < (double)0.0F ? (double)0.0F : (t > (double)1.0F ? (double)1.0F : t);
      return t * t * ((double)3.0F - (double)2.0F * t);
   }
}
