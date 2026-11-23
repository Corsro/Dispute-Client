package gg.corz;

public final class liIlllliiIllll {
   private static final double Iiliiliilliliiliil = (double)1.5F;
   private static final double lIiiiliiliIiiiliil = 0.6;
   private static final double iiliiliilIIiiiliil = (double)7.0F;
   private static final double llliiliililliiliil = (double)3.0F;

   public static double IliIlllilIi(iIilIiiIlilIii in, IIliiiIilIliiiIi w) {
      if (!(in.IIIllIIliIIl() <= in.IlIlllIlilIl())) {
         return Double.NEGATIVE_INFINITY;
      } else {
         double var2 = in.IliIlllilIi();
         double var4 = w.IilliliilIIi() * w.liiiIIllIl() * (var2 + (in.liiiIIllIl() ? (double)8.0F : (double)0.0F) + (in.iIlIlllllill() ? (double)100.0F : (double)0.0F));
         double var6 = w.lIiiIiIlilli() * (double)Math.min(Math.max(in.IilliliilIIi(), 0), w.iliIiiliiiii());
         return var4 + var6 - liiiIIllIl(in.lIiiIiIlilli()) + w.IIIllIIliIIl() * in.iliIiiliiiii() - w.iIlIlllllill() * in.IIIllIIliIIl() - w.IlIlllIlilIl() * (double)in.IiIlliIliiIl() - w.IiIlliIliiIl() * (double)in.IIlllIlliIll() - in.Illlllllilll() * var2 + (in.Iilllilliill() ? w.IIlllIlliIll() : (double)0.0F);
      }
   }

   public static double liiiIIllIl(double apexAboveFloor) {
      if (apexAboveFloor < (double)3.0F) {
         return ((double)3.0F - apexAboveFloor) * (double)1.5F;
      } else {
         return apexAboveFloor > (double)7.0F ? (apexAboveFloor - (double)7.0F) * 0.6 : (double)0.0F;
      }
   }

   private liIlllliiIllll() {
   }
}
