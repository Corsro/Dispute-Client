package gg.corz;

public final class IiiIIIIlliiIIIIl {
   public static double iIlIlllllill(double current, double rate, double target, double dt) {
      if (dt <= (double)0.0F) {
         return current;
      } else {
         return target <= (double)0.0F ? rate : current + (rate - current) * ((double)1.0F - Math.exp(-target * dt));
      }
   }

   public static double IliIlllilIi(double t, double a, double b) {
      return t + (a - t) * b;
   }

   private IiiIIIIlliiIIIIl() {
   }

   public static double liiiIIllIl(double lo, double v, double hi) {
      return lo < v ? v : (lo > hi ? hi : lo);
   }
}
