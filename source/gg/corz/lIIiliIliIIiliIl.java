package gg.corz;

record lIIiliIliIIiliIl(long tick, int id, IliIllilliIlli kick, boolean sprintHit) {
   private final int liiliiiIll;
   private final long IiiliiiIll;
   private final IliIllilliIlli iiiliiiIll;
   private final boolean IIIiiiiIll;

   public long IliIlllilIi() {
      return this.IiiliiiIll;
   }

   public int liiiIIllIl() {
      return this.liiliiiIll;
   }

   public boolean IilliliilIIi() {
      return this.IIIiiiiIll;
   }

   public IliIllilliIlli iIlIlllllill() {
      return this.iiiliiiIll;
   }

   private lIIiliIliIIiliIl(long id, int kick, IliIllilliIlli tick, boolean sprintHit) {
      this.IiiliiiIll = id;
      this.liiliiiIll = kick;
      this.iiiliiiIll = tick;
      this.IIIiiiiIll = sprintHit;
   }
}
