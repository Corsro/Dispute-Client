package gg.corz;

record liIIlIliiiIIlIli(long firstSeen, long lastSeen, double lastDist, double x, double y, double z) {
   private final double iIliiiIlIi;
   private final long iiIiiiIlIi;
   private final double lIliiiIlIi;
   private final long IIliiiIlIi;
   private final double IlliiiIlIi;
   private final double llliiiIlIi;

   public long IliIlllilIi() {
      return this.iiIiiiIlIi;
   }

   public double IilliliilIIi() {
      return this.iIliiiIlIi;
   }

   private liIIlIliiiIIlIli(long z, long x, double firstSeen, double lastSeen, double lastDist, double y) {
      this.iiIiiiIlIi = z;
      this.IIliiiIlIi = x;
      this.lIliiiIlIi = firstSeen;
      this.iIliiiIlIi = lastSeen;
      this.IlliiiIlIi = lastDist;
      this.llliiiIlIi = y;
   }

   public double lIiiIiIlilli() {
      return this.IlliiiIlIi;
   }

   public long liiiIIllIl() {
      return this.IIliiiIlIi;
   }

   public double iliIiiliiiii() {
      return this.llliiiIlIi;
   }

   public double iIlIlllllill() {
      return this.lIliiiIlIi;
   }
}
