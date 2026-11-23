package gg.corz;

record liIiIlliiIiIll(boolean move, double dx, double dz, boolean hop) {
   private final double lllIiIlilillIiIlil;
   private final boolean IilIiIlillilIiIlil;
   private final boolean IIlIiIlillIlIiIlil;
   private final double iIlIiIlilIllIiIlil;

   public boolean IilliliilIIi() {
      return this.IilIiIlillilIiIlil;
   }

   public double iIlIlllllill() {
      return this.lllIiIlilillIiIlil;
   }

   private liIiIlliiIiIll(boolean dz, double move, double hop, boolean dx) {
      this.IIlIiIlillIlIiIlil = dz;
      this.iIlIiIlilIllIiIlil = move;
      this.lllIiIlilillIiIlil = hop;
      this.IilIiIlillilIiIlil = dx;
   }

   public boolean IliIlllilIi() {
      return this.IIlIiIlillIlIiIlil;
   }

   public double liiiIIllIl() {
      return this.iIlIiIlilIllIiIlil;
   }
}
