package gg.corz;

record iiillIilIIIilIil(iIlIIillIllIIill kind, iIliIiIiIlliIiIi state, double value, lIiliiiliIiliiil offer, iiIIllilIIlIllil anchor, String arm, String spacingArm, double spacing) {
   private final lIiliiiliIiliiil iIIiiIlIil;
   private final double IiIiiIlIil;
   private final iIliIiIiIlliIiIi IIIiiIlIil;
   private final iIlIIillIllIIill iiiliIlIil;
   private final iiIIllilIIlIllil IlIiiIlIil;
   private final double lIIiiIlIil;
   private final String ilIiiIlIil;
   private final String llIiiIlIil;

   public lIiliiiliIiliiil IilliliilIIi() {
      return this.iIIiiIlIil;
   }

   public double iIlIlllllill() {
      return this.lIIiiIlIil;
   }

   public String iliIiiliiiii() {
      return this.llIiiIlIil;
   }

   public iIliIiIiIlliIiIi liiiIIllIl() {
      return this.IIIiiIlIil;
   }

   public String IIIllIIliIIl() {
      return this.ilIiiIlIil;
   }

   public iIlIIillIllIIill IliIlllilIi() {
      return this.iiiliIlIil;
   }

   public double IlIlllIlilIl() {
      return this.IiIiiIlIil;
   }

   private iiillIilIIIilIil(iIlIIillIllIIill arm, iIliIiIiIlliIiIi kind, double value, lIiliiiliIiliiil offer, iiIIllilIIlIllil spacingArm, String spacing, String anchor, double state) {
      this.iiiliIlIil = arm;
      this.IIIiiIlIil = kind;
      this.lIIiiIlIil = value;
      this.iIIiiIlIil = offer;
      this.IlIiiIlIil = spacingArm;
      this.llIiiIlIil = spacing;
      this.ilIiiIlIil = anchor;
      this.IiIiiIlIil = state;
   }

   public iiIIllilIIlIllil lIiiIiIlilli() {
      return this.IlIiiIlIil;
   }
}
