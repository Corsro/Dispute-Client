package gg.corz;

record IIIIIIIllIIIIIIl(int selfId, int chance, boolean grounded, double airLo, double airHi, double groundLo, double groundHi) {
   private final double illIIiIlIl;
   private final double IilIIiIlIl;
   private final boolean iIlIIiIlIl;
   private final int IIlIIiIlIl;
   private final int lIlIIiIlIl;
   private final double lllIIiIlIl;
   private final double IllIIiIlIl;

   public double IIIllIIliIIl() {
      return this.IilIIiIlIl;
   }

   public double iliIiiliiiii() {
      return this.illIIiIlIl;
   }

   private IIIIIIIllIIIIIIl(int grounded, int groundHi, boolean groundLo, double airLo, double airHi, double chance, double selfId) {
      this.IIlIIiIlIl = grounded;
      this.lIlIIiIlIl = groundHi;
      this.iIlIIiIlIl = groundLo;
      this.IllIIiIlIl = airLo;
      this.lllIIiIlIl = airHi;
      this.illIIiIlIl = chance;
      this.IilIIiIlIl = selfId;
   }

   public int IliIlllilIi() {
      return this.IIlIIiIlIl;
   }

   public boolean iIlIlllllill() {
      return this.iIlIIiIlIl;
   }

   public int liiiIIllIl() {
      return this.lIlIIiIlIl;
   }

   public double IilliliilIIi() {
      return this.IllIIiIlIl;
   }

   public double lIiiIiIlilli() {
      return this.lllIIiIlIl;
   }
}
