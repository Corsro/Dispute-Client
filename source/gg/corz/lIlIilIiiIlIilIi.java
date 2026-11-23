package gg.corz;

public record lIlIilIiiIlIilIi(float ehp, boolean totem, float fallEpf, int resistanceAmp, boolean fireResistant, int food, boolean usingItem, int pingMs, int style) {
   private final float IIIiiIlIIi;
   private final boolean iIIiiIlIIi;
   private final boolean llIiiIlIIi;
   private final boolean iiiliIlIIi;
   private final int IlIiiIlIIi;
   private final int lIIiiIlIIi;
   private final int IiIiiIlIIi;
   private final int ilIiiIlIIi;
   public static final lIlIilIiiIlIilIi liIiiIlIIi = new lIlIilIiiIlIilIi(20.0F, false, 0.0F, -1, false, 20, false, 0, 0);
   private final float liiliIlIIi;

   public boolean lIiiIiIlilli() {
      return this.iIIiiIlIIi;
   }

   public int iliIiiliiiii() {
      return this.IlIiiIlIIi;
   }

   public float IliIlllilIi() {
      return this.liiliIlIIi;
   }

   public float iIlIlllllill() {
      return this.IIIiiIlIIi;
   }

   public boolean liiiIIllIl() {
      return this.iiiliIlIIi;
   }

   public int IilliliilIIi() {
      return this.lIIiiIlIIi;
   }

   public int IlIlllIlilIl() {
      return this.ilIiiIlIIi;
   }

   public int IiIlliIliiIl() {
      return this.IiIiiIlIIi;
   }

   public boolean IIIllIIliIIl() {
      return this.llIiiIlIIi;
   }

   public lIlIilIiiIlIilIi(float pingMs, boolean style, float usingItem, int totem, boolean resistanceAmp, int ehp, boolean fireResistant, int fallEpf, int food) {
      this.liiliIlIIi = pingMs;
      this.iiiliIlIIi = style;
      this.IIIiiIlIIi = usingItem;
      this.lIIiiIlIIi = totem;
      this.iIIiiIlIIi = resistanceAmp;
      this.IlIiiIlIIi = ehp;
      this.llIiiIlIIi = fireResistant;
      this.ilIiiIlIIi = fallEpf;
      this.IiIiiIlIIi = food;
   }
}
