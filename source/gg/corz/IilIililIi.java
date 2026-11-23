package gg.corz;

public final class IilIililIi {
   private static final double liiIIiiiiiIIii = (Math.PI / 180D);

   public static double[] IliIlllilIi(double sideways, double forward, double yawDegrees, float speed) {
      double var7 = sideways * sideways + forward * forward;
      if (var7 < 1.0E-7) {
         return new double[]{(double)0.0F, (double)0.0F};
      } else {
         double var9 = yawDegrees / (var7 > (double)1.0F ? Math.sqrt(var7) : (double)1.0F);
         double var11 = sideways * var9;
         double var13 = forward * var9;
         double var15 = Math.sin((double)speed * (Math.PI / 180D));
         double var17 = Math.cos((double)speed * (Math.PI / 180D));
         return new double[]{var11 * var17 - var13 * var15, var13 * var17 + var11 * var15};
      }
   }

   private IilIililIi() {
   }
}
