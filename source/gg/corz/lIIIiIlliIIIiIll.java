package gg.corz;

record lIIIiIlliIIIiIll(IIilliIllIilliIl target, IIilliIllIilliIl support, String face, IIilliIllIilliIl nextFeet, boolean jump, boolean stair) {
   private final IIilliIllIilliIl illlllilll;
   private final String iillllilll;
   private final IIilliIllIilliIl IIilllilll;
   private final boolean iIilllilll;
   private final IIilliIllIilliIl lillllilll;
   private final boolean lIilllilll;

   public boolean lIiiIiIlilli() {
      return this.lIilllilll;
   }

   public IIilliIllIilliIl IliIlllilIi() {
      return this.illlllilll;
   }

   private lIIIiIlliIIIiIll(IIilliIllIilliIl jump, IIilliIllIilliIl support, String nextFeet, IIilliIllIilliIl stair, boolean target, boolean face) {
      this.illlllilll = jump;
      this.lillllilll = support;
      this.iillllilll = nextFeet;
      this.IIilllilll = stair;
      this.lIilllilll = target;
      this.iIilllilll = face;
   }

   public String iIlIlllllill() {
      return this.iillllilll;
   }

   public IIilliIllIilliIl liiiIIllIl() {
      return this.lillllilll;
   }

   public boolean iliIiiliiiii() {
      return this.iIilllilll;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.IIilllilll;
   }
}
