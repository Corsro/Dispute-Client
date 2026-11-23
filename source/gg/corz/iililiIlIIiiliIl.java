package gg.corz;

record iililiIlIIiiliIl(iIiiilllIliiilll shield, int slot) {
   static final iililiIlIIiiliIl IllIlIIlll;
   private final int iIlIlIIlll;
   private final iIiiilllIliiilll lIlIlIIlll;

   static {
      IllIlIIlll = new iililiIlIIiiliIl(iIiiilllIliiilll.lliiIllill, -1);
   }

   private iililiIlIIiiliIl(iIiiilllIliiilll slot, int shield) {
      this.lIlIlIIlll = slot;
      this.iIlIlIIlll = shield;
   }

   public iIiiilllIliiilll IliIlllilIi() {
      return this.lIlIlIIlll;
   }

   public int liiiIIllIl() {
      return this.iIlIlIIlll;
   }
}
