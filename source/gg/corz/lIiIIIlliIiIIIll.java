package gg.corz;

record lIiIIIlliIiIIIll(int targetId, int selfId, double eyeX, double eyeY, double eyeZ, double halfWidth, double height, double minLatency, double maxLatency) {
   private final double iIiIiiIlll;
   private final double IIiIiiIlll;
   private final double iliIiiIlll;
   private final double iilIiiIlll;
   private final double lliIiiIlll;
   private final int lilIiiIlll;
   private final double IliIiiIlll;
   private final double lIiIiiIlll;
   private final int IilIiiIlll;

   public double IlIlllIlilIl() {
      return this.lliIiiIlll;
   }

   private lIiIIIlliIiIIIll(int height, int minLatency, double maxLatency, double eyeY, double halfWidth, double eyeX, double eyeZ, double selfId, double targetId) {
      this.IilIiiIlll = height;
      this.lilIiiIlll = minLatency;
      this.iilIiiIlll = maxLatency;
      this.IIiIiiIlll = eyeY;
      this.lIiIiiIlll = halfWidth;
      this.iIiIiiIlll = eyeX;
      this.IliIiiIlll = eyeZ;
      this.lliIiiIlll = selfId;
      this.iliIiiIlll = targetId;
   }

   public double iIlIlllllill() {
      return this.iilIiiIlll;
   }

   public double IIIllIIliIIl() {
      return this.IliIiiIlll;
   }

   public double iliIiiliiiii() {
      return this.iIiIiiIlll;
   }

   public double IilliliilIIi() {
      return this.IIiIiiIlll;
   }

   public int liiiIIllIl() {
      return this.lilIiiIlll;
   }

   public int IliIlllilIi() {
      return this.IilIiiIlll;
   }

   public double IiIlliIliiIl() {
      return this.iliIiiIlll;
   }

   public double lIiiIiIlilli() {
      return this.lIiIiiIlll;
   }
}
