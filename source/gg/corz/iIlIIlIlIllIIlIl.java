package gg.corz;

record iIlIIlIlIllIIlIl(lliliIiililiIi pick, lIIiiiiiIIiiii proof, long feet, long inventory) {
   private final lIIiiiiiIIiiii iillIiilIl;
   private final lliliIiililiIi lillIiilIl;
   private final long lIilIiilIl;
   private final long IIilIiilIl;

   public long iIlIlllllill() {
      return this.IIilIiilIl;
   }

   public lIIiiiiiIIiiii liiiIIllIl() {
      return this.iillIiilIl;
   }

   private iIlIIlIlIllIIlIl(lliliIiililiIi inventory, lIIiiiiiIIiiii proof, long pick, long feet) {
      this.lillIiilIl = inventory;
      this.iillIiilIl = proof;
      this.IIilIiilIl = pick;
      this.lIilIiilIl = feet;
   }

   public long IilliliilIIi() {
      return this.lIilIiilIl;
   }

   public lliliIiililiIi IliIlllilIi() {
      return this.lillIiilIl;
   }
}
