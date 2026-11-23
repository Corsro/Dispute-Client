package gg.corz;

public final class iiliIIiIIiiIIi {
   private static final int lillIIIiiiillIIIii = 10000;
   private static final double illlIIIiiIillIIIii = (double)1000000.0F;
   private static final double iiIlIIIiiIIllIIIii = (double)8.0F;
   private static final double IlllIIIiillllIIIii = (double)20.0F;
   private static final double IiIlIIIiiliIlIIIii = 0.8;
   private static final double lIllIIIiiiIllIIIii = (double)25.0F;

   public static double IliIlllilIi(double dealt, double taken, int kill, int death, boolean popsTaken, boolean popsDealt) {
      double var8 = liiiIIllIl(dealt) - 0.8 * liiiIIllIl(taken) + (double)8.0F * (double)iIlIlllllill(kill) - (double)8.0F * (double)iIlIlllllill(death) + (popsTaken ? (double)25.0F : (double)0.0F) - (popsDealt ? (double)25.0F : (double)0.0F);
      return Math.tanh(var8 / (double)20.0F);
   }

   private static int iIlIlllllill(int v) {
      return Math.max(0, Math.min(10000, v));
   }

   private iiliIIiIIiiIIi() {
   }

   private static double liiiIIllIl(double v) {
      return Double.isNaN(v) ? (double)0.0F : IiIIIlliIIIl.IIiilIiiiIii(v, (double)0.0F, (double)1000000.0F);
   }
}
