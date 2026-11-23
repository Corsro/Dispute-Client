package gg.corz;

public record illIliIilIli(int proofs, int astar, long deadlineNanos) {
   private final long iIllIiIIlIlllIiIIl;
   private final int liIlIiIIliiIlIiIIl;
   private final int IIllIiIIllIllIiIIl;

   public int liiiIIllIl() {
      return this.IIllIiIIllIllIiIIl;
   }

   public int IliIlllilIi() {
      return this.liIlIiIIliiIlIiIIl;
   }

   public long iIlIlllllill() {
      return this.iIllIiIIlIlllIiIIl;
   }

   public illIliIilIli(int astar, int deadlineNanos, long proofs) {
      this.liIlIiIIliiIlIiIIl = astar;
      this.IIllIiIIllIllIiIIl = deadlineNanos;
      this.iIllIiIIlIlllIiIIl = proofs;
   }
}
