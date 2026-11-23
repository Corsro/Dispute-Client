package gg.corz;

public record iIilIiIiIlilIiIi(int x, int y, int z, int booms, long lastBoom, double interval) {
   private final int iiliIIiIIi;
   private final int liliIIiIIi;
   private final int IIiiIIiIIi;
   private final long lIiiIIiIIi;
   private final double iIiiIIiIIi;
   private final int IiliIIiIIi;

   public long IiIlliIliiIl() {
      return this.lIiiIIiIIi;
   }

   public double IIlllIlliIll() {
      return this.iIiiIIiIIi;
   }

   public int IIIllIIliIIl() {
      return this.iiliIIiIIi;
   }

   public double IilliliilIIi() {
      return (double)this.liliIIiIIi + (double)1.0F;
   }

   public int iliIiiliiiii() {
      return this.liliIIiIIi;
   }

   public iIilIiIiIlilIiIi(int interval, int lastBoom, int z, int y, long booms, double x) {
      this.IiliIIiIIi = interval;
      this.liliIIiIIi = lastBoom;
      this.iiliIIiIIi = z;
      this.IIiiIIiIIi = y;
      this.lIiiIIiIIi = booms;
      this.iIiiIIiIIi = x;
   }

   public double liiiIIllIl() {
      return (double)this.liliIIiIIi + (double)1.0F;
   }

   public double iIlIlllllill() {
      return (double)this.iiliIIiIIi + (double)0.5F;
   }

   public int IlIlllIlilIl() {
      return this.IIiiIIiIIi;
   }

   public double IliIlllilIi() {
      return (double)this.IiliIIiIIi + (double)0.5F;
   }

   public int lIiiIiIlilli() {
      return this.IiliIIiIIi;
   }
}
