package gg.corz;

record lIIiiiiiIIiiii(iilIillIIiIill recipe, lliliIiililiIi deckPick, IlIillillIilli intent, iIliillIlliill cert) {
   private final iilIillIIiIill IillllIlIl;
   private final iIliillIlliill IIilllIlIl;
   private final IlIillillIilli iillllIlIl;
   private final lliliIiililiIi lillllIlIl;

   public iilIillIIiIill IliIlllilIi() {
      return this.IillllIlIl;
   }

   private lIIiiiiiIIiiii(iilIillIIiIill recipe, lliliIiililiIi cert, IlIillillIilli intent, iIliillIlliill deckPick) {
      this.IillllIlIl = recipe;
      this.lillllIlIl = cert;
      this.iillllIlIl = intent;
      this.IIilllIlIl = deckPick;
   }

   public iIliillIlliill IilliliilIIi() {
      return this.IIilllIlIl;
   }

   lIIiiiiiIIiiii(iilIillIIiIill intent, lliliIiililiIi deckPick, IlIillillIilli recipe) {
      this(intent, deckPick, recipe, (iIliillIlliill)null);
   }

   public IlIillillIilli iIlIlllllill() {
      return this.iillllIlIl;
   }

   public lliliIiililiIi liiiIIllIl() {
      return this.lillllIlIl;
   }
}
