package gg.corz;

public record lllIiIllillIiIll(liiIiIlliiiIiIll state, int proofs, int memoryHits, int astar, boolean yielded, String transition) {
   private final int lIlIililll;
   private final int IIlIililll;
   private final String IllIililll;
   private final int iiIIililll;
   private final boolean iIlIililll;
   private final liiIiIlliiiIiIll liIIililll;

   public int iIlIlllllill() {
      return this.iiIIililll;
   }

   public boolean IliIlllilIi() {
      return this.IllIililll != null;
   }

   public boolean iliIiiliiiii() {
      return this.iIlIililll;
   }

   public liiIiIlliiiIiIll liiiIIllIl() {
      return this.liIIililll;
   }

   public int IilliliilIIi() {
      return this.IIlIililll;
   }

   public lllIiIllillIiIll(liiIiIlliiiIiIll memoryHits, int astar, int state, int transition, boolean proofs, String yielded) {
      this.liIIililll = memoryHits;
      this.iiIIililll = astar;
      this.IIlIililll = state;
      this.lIlIililll = transition;
      this.iIlIililll = proofs;
      this.IllIililll = yielded;
   }

   public int lIiiIiIlilli() {
      return this.lIlIililll;
   }

   public String IIIllIIliIIl() {
      return this.IllIililll;
   }
}
