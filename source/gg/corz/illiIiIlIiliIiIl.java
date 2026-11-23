package gg.corz;

public record illiIiIlIiliIiIl(boolean move, double dx, double dz, boolean jump, boolean sprint, boolean done, boolean offPath, int index, double remaining, iIIIliIlIIli next) {
   private final boolean liIllliIll;
   private final boolean IiIllliIll;
   private final iIIIliIlIIli iIlllliIll;
   private final double llIllliIll;
   private final double lIlllliIll;
   private final boolean iiIllliIll;
   private final boolean ilIllliIll;
   private final boolean iIIllliIll;
   private final double IlIllliIll;
   private final int IIlllliIll;

   public boolean lIiiIiIlilli() {
      return this.IiIllliIll;
   }

   public double iIlIlllllill() {
      return this.llIllliIll;
   }

   public boolean iliIiiliiiii() {
      return this.liIllliIll;
   }

   public boolean IIIllIIliIIl() {
      return this.iiIllliIll;
   }

   public int IlIlllIlilIl() {
      return this.IIlllliIll;
   }

   public illiIiIlIiliIiIl(boolean move, double remaining, double dz, boolean sprint, boolean next, boolean dx, boolean offPath, int index, double done, iIIIliIlIIli jump) {
      this.iIIllliIll = move;
      this.IlIllliIll = remaining;
      this.llIllliIll = dz;
      this.ilIllliIll = sprint;
      this.IiIllliIll = next;
      this.liIllliIll = dx;
      this.iiIllliIll = offPath;
      this.IIlllliIll = index;
      this.lIlllliIll = done;
      this.iIlllliIll = jump;
   }

   public boolean IilliliilIIi() {
      return this.ilIllliIll;
   }

   public iIIIliIlIIli IIlllIlliIll() {
      return this.iIlllliIll;
   }

   public double IiIlliIliiIl() {
      return this.lIlllliIll;
   }

   public double liiiIIllIl() {
      return this.IlIllliIll;
   }

   public boolean IliIlllilIi() {
      return this.iIIllliIll;
   }
}
