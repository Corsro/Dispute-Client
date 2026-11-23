package gg.corz;

record iiIIliIiIIlIliIi(boolean move, double dx, double dz, boolean arrived, double dist, boolean hop, boolean sprint) {
   private final double IIIlIliIIi;
   private final double IlIlIliIIi;
   private final boolean iIIlIliIIi;
   private final boolean llIlIliIIi;
   private final boolean ilIlIliIIi;
   private final boolean iiiIIliIIi;
   private final double lIIlIliIIi;

   private iiIIliIiIIlIliIi(boolean arrived, double dist, double move, boolean dx, double dz, boolean sprint, boolean hop) {
      this.iiiIIliIIi = arrived;
      this.IIIlIliIIi = dist;
      this.lIIlIliIIi = move;
      this.iIIlIliIIi = dx;
      this.IlIlIliIIi = dz;
      this.llIlIliIIi = sprint;
      this.ilIlIliIIi = hop;
   }

   public double iIlIlllllill() {
      return this.lIIlIliIIi;
   }

   public double liiiIIllIl() {
      return this.IIIlIliIIi;
   }

   public boolean iliIiiliiiii() {
      return this.llIlIliIIi;
   }

   public boolean IliIlllilIi() {
      return this.iiiIIliIIi;
   }

   public boolean IIIllIIliIIl() {
      return this.ilIlIliIIi;
   }

   public double lIiiIiIlilli() {
      return this.IlIlIliIIi;
   }

   public boolean IilliliilIIi() {
      return this.iIIlIliIIi;
   }
}
