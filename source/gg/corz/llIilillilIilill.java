package gg.corz;

public final class llIilillilIilill {
   private static double iiiIIliill = (double)0.0F;
   private static long liiIIliill = 0L;
   private static int IIIlIliill = 0;
   public static final double IiiIIliill = 0.05;

   public static void iIlIlllllill() {
      liiIIliill = 0L;
      iiiIIliill = (double)0.0F;
      IIIlIliill = 0;
   }

   public static double liiiIIllIl() {
      return iiiIIliill;
   }

   public static int lIiiIiIlilli() {
      return IIIlIliill;
   }

   private llIilillilIilill() {
   }

   public static void IliIlllilIi() {
      long var0 = System.nanoTime();
      if (liiIIliill == 0L) {
         iiiIIliill = (double)0.0F;
      } else {
         double var2 = (double)(var0 - liiIIliill) / (double)1.0E9F;
         if (var2 < (double)0.0F) {
            var2 = (double)0.0F;
         }

         if (var2 > 0.05) {
            var2 = 0.05;
         }

         iiiIIliill = var2;
      }

      liiIIliill = var0;
      IIIlIliill = 0;
   }

   public static void IilliliilIIi() {
      ++IIIlIliill;
   }
}
