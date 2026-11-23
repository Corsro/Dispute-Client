package gg.corz;

public record iilllIIill(int routeIndex, boolean arrived, double targetX, double targetZ, double horizontalDistance, double verticalDistance, boolean occupiesSurface, boolean settled) {
   private final double iIlIIIiIllIIIi;
   private final boolean ilIIIIiIiIIIIi;
   private final double IIlIIIilIlIIIi;
   private final double liIIIIiiiIIIIi;
   private final boolean iilIIIiIIiIIIi;
   private final double lllIIIiillIIIi;
   private final boolean IilIIIililIIIi;
   private final int IlIIIIillIIIIi;

   public double iIlIlllllill() {
      return this.liIIIIiiiIIIIi;
   }

   public iilllIIill(int targetX, boolean settled, double targetZ, double verticalDistance, double occupiesSurface, double routeIndex, boolean horizontalDistance, boolean arrived) {
      this.IlIIIIillIIIIi = targetX;
      this.ilIIIIiIiIIIIi = settled;
      this.liIIIIiiiIIIIi = targetZ;
      this.IIlIIIilIlIIIi = verticalDistance;
      this.iIlIIIiIllIIIi = occupiesSurface;
      this.lllIIIiillIIIi = routeIndex;
      this.IilIIIililIIIi = horizontalDistance;
      this.iilIIIiIIiIIIi = arrived;
   }

   public double lIiiIiIlilli() {
      return this.iIlIIIiIllIIIi;
   }

   public double IilliliilIIi() {
      return this.IIlIIIilIlIIIi;
   }

   public int IliIlllilIi() {
      return this.IlIIIIillIIIIi;
   }

   public boolean IIIllIIliIIl() {
      return this.IilIIIililIIIi;
   }

   public boolean liiiIIllIl() {
      return this.ilIIIIiIiIIIIi;
   }

   public double iliIiiliiiii() {
      return this.lllIIIiillIIIi;
   }

   public boolean IlIlllIlilIl() {
      return this.iilIIIiIIiIIIi;
   }
}
