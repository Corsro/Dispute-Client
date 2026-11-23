package gg.corz;

public record illliIiIilliIi(int x, int y, int z, iIIIIIilIlIIIIil surface, iiiIIiilIIIlIiil transition) {
   private final iIIIIIilIlIIIIil lIllliliiiIlllilii;
   private final int IiIlliliiliIllilii;
   private final int llIlliliiilIllilii;
   private final iiiIIiilIIIlIiil Illlliliilllllilii;
   private final int iiIlliliiIIlllilii;

   public iIIIIIilIlIIIIil IilliliilIIi() {
      return this.lIllliliiiIlllilii;
   }

   public int iIlIlllllill() {
      return this.iiIlliliiIIlllilii;
   }

   public int liiiIIllIl() {
      return this.IiIlliliiliIllilii;
   }

   public int IliIlllilIi() {
      return this.llIlliliiilIllilii;
   }

   public iiiIIiilIIIlIiil lIiiIiIlilli() {
      return this.Illlliliilllllilii;
   }

   public illliIiIilliIi(int transition, int x, int y, iIIIIIilIlIIIIil z, iiiIIiilIIIlIiil surface) {
      this.llIlliliiilIllilii = transition;
      this.IiIlliliiliIllilii = x;
      this.iiIlliliiIIlllilii = y;
      this.lIllliliiiIlllilii = z;
      this.Illlliliilllllilii = surface;
   }
}
