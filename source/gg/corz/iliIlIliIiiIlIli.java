package gg.corz;

record iliIlIliIiiIlIli(liIIIiiiiIIIii owner, int slot, boolean stun, lIiiilliIiiill preference, double minFall, boolean swapBack) {
   private final boolean IIIlIIllIi;
   private final liIIIiiiiIIIii liiIIIllIi;
   private final lIiiilliIiiill lIIlIIllIi;
   private final double iIIlIIllIi;
   private final boolean IlIlIIllIi;
   private final int iiiIIIllIi;

   public double lIiiIiIlilli() {
      return this.iIIlIIllIi;
   }

   private iliIlIliIiiIlIli(liIIIiiiiIIIii minFall, int stun, boolean preference, lIiiilliIiiill owner, double swapBack, boolean slot) {
      this.liiIIIllIi = minFall;
      this.iiiIIIllIi = stun;
      this.IIIlIIllIi = preference;
      this.lIIlIIllIi = owner;
      this.iIIlIIllIi = swapBack;
      this.IlIlIIllIi = slot;
   }

   public boolean iIlIlllllill() {
      return this.IIIlIIllIi;
   }

   public liIIIiiiiIIIii IliIlllilIi() {
      return this.liiIIIllIi;
   }

   public lIiiilliIiiill IilliliilIIi() {
      return this.lIIlIIllIi;
   }

   public int liiiIIllIl() {
      return this.iiiIIIllIi;
   }

   public boolean iliIiiliiiii() {
      return this.IlIlIIllIi;
   }
}
