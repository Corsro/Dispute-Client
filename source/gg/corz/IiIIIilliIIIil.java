package gg.corz;

record IiIIIilliIIIil(float cx, float cy, float cz, float radius) {
   private final float iiliillIiIIiiillIi;
   private final float IiliillIililiillIi;
   private final float lIiiillIiiIiiillIi;
   private final float llliillIiilliillIi;

   public float IilliliilIIi() {
      return this.lIiiillIiiIiiillIi;
   }

   public float liiiIIllIl() {
      return this.IiliillIililiillIi;
   }

   public float iIlIlllllill() {
      return this.iiliillIiIIiiillIi;
   }

   public float IliIlllilIi() {
      return this.llliillIiilliillIi;
   }

   IiIIIilliIIIil(float cx, float radius, float cz, float cy) {
      this.llliillIiilliillIi = cx;
      this.IiliillIililiillIi = radius;
      this.iiliillIiIIiiillIi = cz;
      this.lIiiillIiiIiiillIi = cy;
   }
}
