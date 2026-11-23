package gg.corz;

public final class iiiiiiilIIIIIIIi {
   static final int IiIlliIiil = -80;
   static final int llIlliIiil = 8;
   static final int IIIlliIiil = 50;
   static final int IlIlliIiil = 20;
   static final int liIlliIiil = 10;
   static final int ilIlliIiil = 60;
   static final int lIllliIiil = -3;
   static final int iIIlliIiil = 40;
   static final int IIllliIiil = -15;
   static final int iiIlliIiil = -25;
   static final int lIIlliIiil = -30;
   static final int iIllliIiil = -5;

   private iiiiiiilIIIIIIIi() {
   }

   public static double IliIlllilIi(Iiilllllliilllll c) {
      double var1 = (double)0.0F;
      if (c.llliIiIill) {
         var1 += (double)50.0F;
      }

      if (c.illiIiIill) {
         var1 += (double)-30.0F;
      }

      if (c.IiliIiIill) {
         var1 += (double)40.0F;
      }

      if (c.liliIiIill) {
         var1 += (double)20.0F;
      }

      var1 += (double)Math.max(0, c.iiliIiIill) * (double)8.0F;
      if (c.IIiiIiIill) {
         var1 += (double)60.0F;
      }

      if (c.lIiiIiIill) {
         var1 += (double)-80.0F;
      }

      if (c.iIiiIiIill) {
         var1 += (double)10.0F;
      }

      if (c.IliiIiIill) {
         var1 += (double)-25.0F;
      }

      var1 += (double)Math.max(0, c.lliiIiIill) * (double)-15.0F;
      var1 += (double)Math.max(0, c.iliiIiIill) * (double)-3.0F;
      var1 += (double)Math.max(0, c.IiiiIiIill) * (double)-5.0F;
      var1 -= (double)Math.max(0, c.liiiIiIill);
      return var1;
   }
}
