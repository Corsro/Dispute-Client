package gg.corz;

public record lIliillliIliilll(long from, long to, iiiIIiilIIIlIiil transition) {
   private final iiiIIiilIIIlIiil IIIlIllill;
   private final long liiIIllill;
   private final long iiiIIllill;

   public iiiIIiilIIIlIiil iIlIlllllill() {
      return this.IIIlIllill;
   }

   public lIliillliIliilll(long to, long transition, iiiIIiilIIIlIiil from) {
      this.liiIIllill = to;
      this.iiiIIllill = transition;
      this.IIIlIllill = from;
   }

   public long liiiIIllIl() {
      return this.iiiIIllill;
   }

   public long IliIlllilIi() {
      return this.liiIIllill;
   }
}
