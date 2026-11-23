package gg.corz;

public final class iIIilIiIlIilIi {
   private static final double iIIliiIiiIlIliiIii = (double)20.0F;
   private static final double IIIliiIiilIIliiIii = (double)20.0F;
   private static final double liiIiiIiiiiiIiiIii = 0.3;
   private long IiIliiIiiliIliiIii = -1L;
   private double iiIliiIiiIIlliiIii = Double.NaN;
   public static final long iliIiiIiiIiiIiiIii = 1500L;
   private long llIliiIiiilIliiIii = -1L;

   public double iIlIlllllill() {
      if (!Double.isNaN(this.iiIliiIiiIIlliiIii) && !(this.iiIliiIiiIIlliiIii <= (double)0.0F)) {
         double var1 = (double)20000.0F / this.iiIliiIiiIIlliiIii;
         return Math.max((double)0.0F, Math.min((double)20.0F, var1));
      } else {
         return (double)20.0F;
      }
   }

   public void IliIlllilIi() {
      this.llIliiIiiilIliiIii = -1L;
      this.IiIliiIiiliIliiIii = -1L;
      this.iiIliiIiiIIlliiIii = Double.NaN;
   }

   public void liiiIIllIl(long nowMs) {
      if (this.llIliiIiiilIliiIii >= 0L) {
         long var3 = nowMs - this.llIliiIiiilIliiIii;
         if (var3 > 0L) {
            this.iiIliiIiiIIlliiIii = Double.isNaN(this.iiIliiIiiIIlliiIii) ? (double)var3 : this.iiIliiIiiIIlliiIii + 0.3 * ((double)var3 - this.iiIliiIiiIIlliiIii);
         }
      }

      if (this.llIliiIiiilIliiIii < 0L || nowMs >= this.llIliiIiiilIliiIii) {
         this.llIliiIiiilIliiIii = nowMs;
      }

   }

   public boolean IilliliilIIi(long nowMs) {
      if (this.llIliiIiiilIliiIii < 0L) {
         if (this.IiIliiIiiliIliiIii < 0L) {
            this.IiIliiIiiliIliiIii = nowMs;
         }

         return nowMs - this.IiIliiIiiliIliiIii > 1500L;
      } else {
         return nowMs - this.llIliiIiiilIliiIii > 1500L;
      }
   }
}
