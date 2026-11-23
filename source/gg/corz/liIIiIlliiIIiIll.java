package gg.corz;

public record liIIiIlliiIIiIll(double x, double y, double z, double vx, double vy, double vz, boolean onGround, double sigma) {
   private final double IIlillilll;
   private final double iIIillilll;
   private final double ilIillilll;
   private final double IiIillilll;
   private final double llIillilll;
   private final double liIillilll;
   private final boolean iiIillilll;
   private final double IlIillilll;

   public double IlIlllIlilIl() {
      return this.IIlillilll;
   }

   public double IliIlllilIi() {
      return this.iIIillilll;
   }

   public liIIiIlliiIIiIll(double sigma, double vx, double x, double vy, double vz, double onGround, boolean z, double y) {
      this.iIIillilll = sigma;
      this.IlIillilll = vx;
      this.llIillilll = x;
      this.ilIillilll = vy;
      this.IiIillilll = vz;
      this.liIillilll = onGround;
      this.iiIillilll = z;
      this.IIlillilll = y;
   }

   public double iliIiiliiiii() {
      return this.liIillilll;
   }

   public double lIiiIiIlilli() {
      return this.IiIillilll;
   }

   public double liiiIIllIl() {
      return this.IlIillilll;
   }

   public double iIlIlllllill() {
      return this.llIillilll;
   }

   public boolean IIIllIIliIIl() {
      return this.iiIillilll;
   }

   public double IilliliilIIi() {
      return this.ilIillilll;
   }
}
