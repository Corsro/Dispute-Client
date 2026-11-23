package gg.corz;

record iiliiIIiii(double visibleAt, double vx, double vy, double vz, boolean set, boolean packet) {
   private final double IIIlilIllIIlilIl;
   private final boolean IiIlilIlliIlilIl;
   private final boolean llIlilIlilIlilIl;
   private final double iIIlilIlIlIlilIl;
   private final double iliIilIlIiiIilIl;
   private final double liiIilIliiiIilIl;

   public double iIlIlllllill() {
      return this.IIIlilIllIIlilIl;
   }

   public double IilliliilIIi() {
      return this.iIIlilIlIlIlilIl;
   }

   public boolean lIiiIiIlilli() {
      return this.llIlilIlilIlilIl;
   }

   private iiliiIIiii(double vy, double vx, double set, double visibleAt, boolean vz, boolean packet) {
      this.iliIilIlIiiIilIl = vy;
      this.liiIilIliiiIilIl = vx;
      this.IIIlilIllIIlilIl = set;
      this.iIIlilIlIlIlilIl = visibleAt;
      this.llIlilIlilIlilIl = vz;
      this.IiIlilIlliIlilIl = packet;
   }

   public double liiiIIllIl() {
      return this.liiIilIliiiIilIl;
   }

   public double IliIlllilIi() {
      return this.iliIilIlIiiIilIl;
   }

   public boolean iliIiiliiiii() {
      return this.IiIlilIlliIlilIl;
   }
}
