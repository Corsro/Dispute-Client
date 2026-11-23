package gg.corz;

public record IIIIiiillIIIiiil(lliilIiiliilIi action, IIlIlIIllIlIlIIl phase, boolean inside, double slide, boolean projectedInside, boolean overshoot, String note) {
   private final boolean IIIliIIiil;
   private final String llIliIIiil;
   private final lliilIiiliilIi liiIiIIiil;
   private final boolean iIIliIIiil;
   private final IIlIlIIllIlIlIIl iiiIiIIiil;
   private final boolean IlIliIIiil;
   private final double lIIliIIiil;

   public String IIIllIIliIIl() {
      return this.llIliIIiil;
   }

   public IIlIlIIllIlIlIIl liiiIIllIl() {
      return this.iiiIiIIiil;
   }

   public boolean lIiiIiIlilli() {
      return this.iIIliIIiil;
   }

   public lliilIiiliilIi IliIlllilIi() {
      return this.liiIiIIiil;
   }

   public IIIIiiillIIIiiil(lliilIiiliilIi projectedInside, IIlIlIIllIlIlIIl overshoot, boolean note, double slide, boolean phase, boolean action, String inside) {
      this.liiIiIIiil = projectedInside;
      this.iiiIiIIiil = overshoot;
      this.IIIliIIiil = note;
      this.lIIliIIiil = slide;
      this.iIIliIIiil = phase;
      this.IlIliIIiil = action;
      this.llIliIIiil = inside;
   }

   public boolean iliIiiliiiii() {
      return this.IlIliIIiil;
   }

   public double IilliliilIIi() {
      return this.lIIliIIiil;
   }

   public boolean iIlIlllllill() {
      return this.IIIliIIiil;
   }
}
