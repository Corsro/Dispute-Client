package gg.corz;

public record liIiilIliiIiilIl(double pingMs, double targetPingMs) {
   private final double IIiliilIll;
   private final double iilliilIll;

   public double iliIiiliiiii() {
      return this.iilliilIll;
   }

   public double IIIllIIliIIl() {
      return this.IIiliilIll;
   }

   public int IilliliilIIi() {
      return Math.max(0, (int)Math.round(this.IIiliilIll / (double)50.0F));
   }

   public int iIlIlllllill() {
      return IlIiIiillIiIii.liiiIIllIl(this.iilliilIll);
   }

   public liIiilIliiIiilIl(double pingMs, double targetPingMs) {
      this.iilliilIll = pingMs;
      this.IIiliilIll = targetPingMs;
   }

   public double lIiiIiIlilli() {
      return this.IliIlllilIi() + (double)0.5F;
   }

   public double IliIlllilIi() {
      return this.iilliilIll / (double)50.0F;
   }

   public double liiiIIllIl() {
      return this.iilliilIll / (double)100.0F;
   }
}
