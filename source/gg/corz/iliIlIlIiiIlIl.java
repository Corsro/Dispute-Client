package gg.corz;

record iliIlIlIiiIlIl(int[] rowOf, float[] xOf, float[] rowW, int rows) {
   private final float[] llIlllIllilIlllIll;
   private final int[] IIIlllIlllIIlllIll;
   private final int IiIlllIllliIlllIll;
   private final float[] iIIlllIllIlIlllIll;

   public int IilliliilIIi() {
      return this.IiIlllIllliIlllIll;
   }

   public float[] liiiIIllIl() {
      return this.iIIlllIllIlIlllIll;
   }

   private iliIlIlIiiIlIl(int[] rowW, float[] rows, float[] xOf, int rowOf) {
      this.IIIlllIlllIIlllIll = rowW;
      this.iIIlllIllIlIlllIll = rows;
      this.llIlllIllilIlllIll = xOf;
      this.IiIlllIllliIlllIll = rowOf;
   }

   public int[] IliIlllilIi() {
      return this.IIIlllIlllIIlllIll;
   }

   public float[] iIlIlllllill() {
      return this.llIlllIllilIlllIll;
   }
}
