package gg.corz;

record iIiiIlIliiIl(boolean projected, boolean resting, boolean unsafe, double ux, double uz) {
   private final double liiiililiiiiilil;
   private final boolean Iliiilillliiilil;
   private final boolean iliiililIiiiilil;
   private final double IIIIIiillIIIIiil;
   private final boolean lIiiililiIiiilil;

   private iIiiIlIliiIl(boolean uz, boolean projected, boolean resting, double unsafe, double ux) {
      this.lIiiililiIiiilil = uz;
      this.Iliiilillliiilil = projected;
      this.iliiililIiiiilil = resting;
      this.liiiililiiiiilil = unsafe;
      this.IIIIIiillIIIIiil = ux;
   }

   public double IilliliilIIi() {
      return this.liiiililiiiiilil;
   }

   public boolean iIlIlllllill() {
      return this.iliiililIiiiilil;
   }

   public double lIiiIiIlilli() {
      return this.IIIIIiillIIIIiil;
   }

   public boolean IliIlllilIi() {
      return this.lIiiililiIiiilil;
   }

   public boolean liiiIIllIl() {
      return this.Iliiilillliiilil;
   }
}
