package gg.corz;

public record IiIiilllliIiilll(double x, double y, double z, int feetX, int feetY, int feetZ, boolean onGround) {
   private final int lIiiiIlill;
   private final int IliiiIlill;
   private final double iiliiIlill;
   private final double IIiiiIlill;
   private final int iIiiiIlill;
   private final double liliiIlill;
   private final boolean lliiiIlill;

   public int lIiiIiIlilli() {
      return this.iIiiiIlill;
   }

   public double iIlIlllllill() {
      return this.IIiiiIlill;
   }

   public double liiiIIllIl() {
      return this.iiliiIlill;
   }

   public int iliIiiliiiii() {
      return this.IliiiIlill;
   }

   public double IliIlllilIi() {
      return this.liliiIlill;
   }

   public int IilliliilIIi() {
      return this.lIiiiIlill;
   }

   public IiIiilllliIiilll(double feetZ, double feetY, double z, int x, int feetX, int y, boolean onGround) {
      this.liliiIlill = feetZ;
      this.iiliiIlill = feetY;
      this.IIiiiIlill = z;
      this.lIiiiIlill = x;
      this.iIiiiIlill = feetX;
      this.IliiiIlill = y;
      this.lliiiIlill = onGround;
   }

   public boolean IIIllIIliIIl() {
      return this.lliiiIlill;
   }
}
