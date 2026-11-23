package gg.corz;

public final class iliiIlilIiiiIlil {
   public static final double liIlIliIil = (double)4.0F;
   public static final double IiIlIliIil = 0.35;
   public static final double iIiIIliIil = (double)1.0F;
   public static final double IiiIIliIil = (double)1.5F;
   public static final double liiIIliIil = (double)3.0F;
   public static final double lliIIliIil = 0.45;
   public static final double llIlIliIil = (double)-2.0F;
   public static final float IliIIliIil = 6.0F;
   public static final double IIllIliIil = (double)10.0F;
   public static final double iiiIIliIil = (double)1.5F;
   public static final double IIIlIliIil = (double)0.5F;
   public static final double lIIlIliIil = (double)2.0F;
   public static final double iIIlIliIil = (double)1.5F;
   public static final double iliIIliIil = (double)4.0F;
   public static final double IlIlIliIil = (double)-1.0F;
   public static final double iiIlIliIil = (double)2.5F;
   public static final double ilIlIliIil = (double)-3.0F;

   public static double iIlIlllllill(liiilIiliiiilIil e) {
      iiIllIlIIlllIl var1 = e.IlIillIiilIi() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : e.IlIillIiilIi();
      float var2 = (float)liiIIliliiiIIlil.IliIlllilIi((double)1.0F, (double)1.0F, (double)6.0F);
      float var3 = iiIiiliIIliili.IliIlllilIi(var2, var1.lIiiIiIlilli());
      double var4 = (double)iiIiiliIIliili.lIiiIiIlilli(var3, var1);
      if (e.liiiIIllIl()) {
         var4 *= 0.45;
      }

      float var6 = e.Illillliilli();
      return var4 * (double)(Float.isFinite(var6) && var6 > 0.0F ? var6 : 1.0F);
   }

   public static double IliIlllilIi(liiilIiliiiilIil current, lliiilIiiliiilIi self, float threatToUs, boolean e) {
      if (current == null) {
         return Double.NEGATIVE_INFINITY;
      } else {
         double var4 = iIlIlllllill(current);
         double var6 = (double)4.0F * IilliliilIIi(var4 / Math.max((double)1.0F, (double)current.IliIlllilIi()), (double)0.0F, (double)1.5F);
         if (current.IllIllllIl() || !current.Iilililiiili()) {
            var6 += (double)3.0F;
         }

         if ((double)current.IIlilIliiIli() < (double)0.5F) {
            var6 += (double)1.5F * ((double)1.0F - (double)current.IIlilIliiIli());
         }

         float var8 = self == null ? 20.0F : self.IliIlllilIi();
         if (Float.isFinite(threatToUs) && threatToUs > 0.0F) {
            var6 += (double)2.0F * (double)threatToUs / Math.max((double)1.0F, (double)var8);
         }

         if (current.Iiiiliiiiiii()) {
            ++var6;
         }

         if (current.liiiIIllIl()) {
            var6 += (double)-1.0F;
         }

         if (!current.Iilllilliill()) {
            var6 += (double)-2.0F;
         }

         if (current.lliIliliIl()) {
            var6 += (double)-3.0F;
         }

         var6 -= 0.35 * Math.max((double)0.0F, liiiIIllIl(current.Illlllllilll(), e) - (double)4.0F);
         if (e) {
            var6 += (double)2.5F;
         }

         return var6;
      }
   }

   private iliiIlilIiiiIlil() {
   }

   public static double liiiIIllIl(double current, boolean distance) {
      return distance && current > (double)10.0F ? (double)10.0F : current;
   }

   private static double IilliliilIIi(double hi, double v, double lo) {
      return hi < v ? v : Math.min(hi, lo);
   }
}
