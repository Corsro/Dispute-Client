package gg.corz;

record illiIlIiliIl(long since, long retryAt, int fails) {
   private final int liIiililiiIiilil;
   private final long ilIiililIiIiilil;
   private final long IlIiililllIiilil;

   public long IliIlllilIi() {
      return this.IlIiililllIiilil;
   }

   public int iIlIlllllill() {
      return this.liIiililiiIiilil;
   }

   public long liiiIIllIl() {
      return this.ilIiililIiIiilil;
   }

   private illiIlIiliIl(long retryAt, long fails, int since) {
      this.IlIiililllIiilil = retryAt;
      this.ilIiililIiIiilil = fails;
      this.liIiililiiIiilil = since;
   }
}
