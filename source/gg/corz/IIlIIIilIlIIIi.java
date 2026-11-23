package gg.corz;

public record IIlIIIilIlIIIi(double x0, double y0, double z0, double x1, double y1, double z1) {
   private final double iIlIlIiliIllIlIili;
   private final double iilIlIiliIIiIlIili;
   private final double IilIlIilililIlIili;
   private final double lIiIlIiliiIiIlIili;
   private final double IIlIlIililIlIlIili;
   private final double lllIlIiliillIlIili;

   public double lIiiIiIlilli() {
      return this.iilIlIiliIIiIlIili;
   }

   public double liiiIIllIl() {
      return this.iIlIlIiliIllIlIili;
   }

   public double IilliliilIIi() {
      return this.IilIlIilililIlIili;
   }

   public IIlIIIilIlIIIi(double x0, double z1, double x1, double z0, double y0, double y1) {
      this.IIlIlIililIlIlIili = x0;
      this.iIlIlIiliIllIlIili = z1;
      this.lllIlIiliillIlIili = x1;
      this.IilIlIilililIlIili = z0;
      this.iilIlIiliIIiIlIili = y0;
      this.lIiIlIiliiIiIlIili = y1;
   }

   public double iIlIlllllill() {
      return this.lllIlIiliillIlIili;
   }

   public double IliIlllilIi() {
      return this.IIlIlIililIlIlIili;
   }

   public double iliIiiliiiii() {
      return this.lIiIlIiliiIiIlIili;
   }
}
