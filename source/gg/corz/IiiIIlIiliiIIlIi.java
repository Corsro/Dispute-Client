package gg.corz;

record IiiIIlIiliiIIlIi(lIiliIiliIiliIil defuse, int slot) {
   private final lIiliIiliIiliIil Iiliiiiiil;
   private final int liliiiiiil;
   static final IiiIIlIiliiIIlIi iiliiiiiil;

   public lIiliIiliIiliIil IliIlllilIi() {
      return this.Iiliiiiiil;
   }

   public int liiiIIllIl() {
      return this.liliiiiiil;
   }

   static {
      iiliiiiiil = new IiiIIlIiliiIIlIi(lIiliIiliIiliIil.iIIiIilIil, -1);
   }

   private IiiIIlIiliiIIlIi(lIiliIiliIiliIil slot, int defuse) {
      this.Iiliiiiiil = slot;
      this.liliiiiiil = defuse;
   }
}
