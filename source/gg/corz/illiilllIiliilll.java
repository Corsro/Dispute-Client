package gg.corz;

public record illiilllIiliilll(long missionId, int remainingExpected, double continueCostTicks, double investedNodes, double investedDegrees, long heldMaterial) {
   private final long IIIiIllill;
   private final double llIiIllill;
   private final long ilIiIllill;
   private final double IlIiIllill;
   private final double iIIiIllill;
   private final int lIIiIllill;

   public double lIiiIiIlilli() {
      return this.llIiIllill;
   }

   public long IliIlllilIi() {
      return this.IIIiIllill;
   }

   public illiilllIiliilll(long missionId, int investedNodes, double heldMaterial, double remainingExpected, double continueCostTicks, long investedDegrees) {
      this.IIIiIllill = missionId;
      this.lIIiIllill = investedNodes;
      this.iIIiIllill = heldMaterial;
      this.IlIiIllill = remainingExpected;
      this.llIiIllill = continueCostTicks;
      this.ilIiIllill = investedDegrees;
   }

   public double IilliliilIIi() {
      return this.IlIiIllill;
   }

   public long iliIiiliiiii() {
      return this.ilIiIllill;
   }

   public int liiiIIllIl() {
      return this.lIIiIllill;
   }

   public double iIlIlllllill() {
      return this.iIIiIllill;
   }
}
