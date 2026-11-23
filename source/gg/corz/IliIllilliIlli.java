package gg.corz;

record IliIllilliIlli(double[] walk, double[] sprint, int index) {
   private final double[] iIiIilIIIl;
   private final int lliIilIIIl;
   private final double[] IliIilIIIl;

   public double[] iIlIlllllill() {
      return this.IliIilIIIl;
   }

   public double[] liiiIIllIl() {
      return this.iIiIilIIIl;
   }

   double[] IliIlllilIi(boolean sprintHit) {
      return sprintHit ? this.IliIilIIIl : this.iIiIilIIIl;
   }

   public int IilliliilIIi() {
      return this.lliIilIIIl;
   }

   private IliIllilliIlli(double[] sprint, double[] walk, int index) {
      this.iIiIilIIIl = sprint;
      this.IliIilIIIl = walk;
      this.lliIilIIIl = index;
   }
}
