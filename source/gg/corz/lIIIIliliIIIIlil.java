package gg.corz;

record lIIIIliliIIIIlil(double x, double y, double z, int entityId) {
   private final double IliIiilIil;
   private final int lliIiilIil;
   private final double lIiIiilIil;
   private final double iIiIiilIil;

   public double liiiIIllIl() {
      return this.iIiIiilIil;
   }

   public int IilliliilIIi() {
      return this.lliIiilIil;
   }

   public double IliIlllilIi() {
      return this.lIiIiilIil;
   }

   public double iIlIlllllill() {
      return this.IliIiilIil;
   }

   private lIIIIliliIIIIlil(double z, double x, double entityId, int y) {
      this.lIiIiilIil = z;
      this.iIiIiilIil = x;
      this.IliIiilIil = entityId;
      this.lliIiilIil = y;
   }
}
