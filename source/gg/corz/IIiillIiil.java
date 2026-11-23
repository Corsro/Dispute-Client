package gg.corz;

record IIiillIiil(int refusals, int firstTick, int vetoUntil) {
   private final int llIIiliilIIili;
   private final int iIIIiliIlIIili;
   private final int IiIIililiIIili;

   private IIiillIiil(int vetoUntil, int firstTick, int refusals) {
      this.iIIIiliIlIIili = vetoUntil;
      this.llIIiliilIIili = firstTick;
      this.IiIIililiIIili = refusals;
   }

   public int liiiIIllIl() {
      return this.llIIiliilIIili;
   }

   public int IliIlllilIi() {
      return this.iIIIiliIlIIili;
   }

   public int iIlIlllllill() {
      return this.IiIIililiIIili;
   }
}
