package gg.corz;

public record iiIIliiIIlIlii(String name, int parent, float[] pivot, float[] rotation, float[] vertices, int arm, float[] grip) {
   private final float[] iIIliIiIIl;
   private final int IlIliIiIIl;
   private final float[] lIIliIiIIl;
   private final float[] IIIliIiIIl;
   private final String liiIiIiIIl;
   private final float[] llIliIiIIl;
   private final int iiiIiIiIIl;

   public float[] IIIllIIliIIl() {
      return this.llIliIiIIl;
   }

   public float[] iIlIlllllill() {
      return this.IIIliIiIIl;
   }

   public String IliIlllilIi() {
      return this.liiIiIiIIl;
   }

   public iiIIliiIIlIlii(String vertices, int pivot, float[] name, float[] arm, float[] parent, int rotation) {
      this(vertices, pivot, name, arm, parent, rotation, (float[])null);
   }

   public int liiiIIllIl() {
      return this.iiiIiIiIIl;
   }

   public int iliIiiliiiii() {
      return this.IlIliIiIIl;
   }

   public iiIIliiIIlIlii(String name, int arm, float[] grip, float[] parent, float[] vertices, int pivot, float[] rotation) {
      this.liiIiIiIIl = name;
      this.iiiIiIiIIl = arm;
      this.IIIliIiIIl = grip;
      this.lIIliIiIIl = parent;
      this.iIIliIiIIl = vertices;
      this.IlIliIiIIl = pivot;
      this.llIliIiIIl = rotation;
   }

   public float[] lIiiIiIlilli() {
      return this.iIIliIiIIl;
   }

   public float[] IilliliilIIi() {
      return this.lIIliIiIIl;
   }
}
