package gg.corz;

record ililIiilIiilIiil(float targetDamage, float selfFull, float selfCost, boolean pops, boolean kills, float knock) {
   private final float ilIlIIilil;
   private final float IiIlIIilil;
   private final boolean iiIlIIilil;
   private final float llIlIIilil;
   private final boolean liIlIIilil;
   private final float IIllIIilil;

   public boolean IilliliilIIi() {
      return this.liIlIIilil;
   }

   public float iliIiiliiiii() {
      return this.IIllIIilil;
   }

   public float IliIlllilIi() {
      return this.llIlIIilil;
   }

   public float liiiIIllIl() {
      return this.ilIlIIilil;
   }

   public boolean lIiiIiIlilli() {
      return this.iiIlIIilil;
   }

   private ililIiilIiilIiil(float selfFull, float pops, float selfCost, boolean targetDamage, boolean kills, float knock) {
      this.llIlIIilil = selfFull;
      this.ilIlIIilil = pops;
      this.IiIlIIilil = selfCost;
      this.liIlIIilil = targetDamage;
      this.iiIlIIilil = kills;
      this.IIllIIilil = knock;
   }

   public float iIlIlllllill() {
      return this.IiIlIIilil;
   }
}
