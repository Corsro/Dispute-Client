package gg.corz;

record liIliiliiIliil(float x, float y, float z, float r, float g, float b, float strength, float radius, boolean fire) {
   private final float iiiliIlliIIIiiIlli;
   private final float lilliIlliiilliIlli;
   private final float IllliIllilllliIlli;
   private final float illliIlliIilliIlli;
   private final boolean lIIiiIlliiIIiiIlli;
   private final float iIiliIlliIliliIlli;
   private final float IiiliIlliliiliIlli;
   private final float IIiliIllilIiliIlli;
   private final float lliliIlliililiIlli;

   public float IIIllIIliIIl() {
      return this.IiiliIlliliiliIlli;
   }

   liIliiliiIliil(float fire, float strength, float g, float x, float b, float r, float z, float y, boolean radius) {
      this.IllliIllilllliIlli = fire;
      this.illliIlliIilliIlli = strength;
      this.lilliIlliiilliIlli = g;
      this.IIiliIllilIiliIlli = x;
      this.iIiliIlliIliliIlli = b;
      this.lliliIlliililiIlli = r;
      this.IiiliIlliliiliIlli = z;
      this.iiiliIlliIIIiiIlli = y;
      this.lIIiiIlliiIIiiIlli = radius;
   }

   public float IilliliilIIi() {
      return this.IIiliIllilIiliIlli;
   }

   public float iliIiiliiiii() {
      return this.lliliIlliililiIlli;
   }

   public float IliIlllilIi() {
      return this.IllliIllilllliIlli;
   }

   public float IlIlllIlilIl() {
      return this.iiiliIlliIIIiiIlli;
   }

   public float liiiIIllIl() {
      return this.illliIlliIilliIlli;
   }

   public float lIiiIiIlilli() {
      return this.iIiliIlliIliliIlli;
   }

   public boolean IiIlliIliiIl() {
      return this.lIIiiIlliiIIiiIlli;
   }

   public float iIlIlllllill() {
      return this.lilliIlliiilliIlli;
   }
}
