package gg.corz;

public record IiIllilliIllil(int routeFingerprints, int bannedFingerprints, int feetHistory) {
   private final int IiiIIIIliliiIIIIli;
   private final int iiiIIIIliIIIlIIIli;
   private final int lIIlIIIliiIIlIIIli;

   public int liiiIIllIl() {
      return this.iiiIIIIliIIIlIIIli;
   }

   public int iIlIlllllill() {
      return this.lIIlIIIliiIIlIIIli;
   }

   public IiIllilliIllil(int bannedFingerprints, int feetHistory, int routeFingerprints) {
      this.IiiIIIIliliiIIIIli = bannedFingerprints;
      this.iiiIIIIliIIIlIIIli = feetHistory;
      this.lIIlIIIliiIIlIIIli = routeFingerprints;
   }

   public int IliIlllilIi() {
      return this.IiiIIIIliliiIIIIli;
   }
}
