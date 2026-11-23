package gg.corz;

public record lllIliilillIliil(liilllIliiilllIl kind, long clusterKey, int entryTravelTicks, int expectedPlacements, double placementsPerStand, double placementsPerMove, int rotationCostTicks, int inventorySwitchCostTicks, int precisePoseCostTicks, int crouchCostTicks, int surfacePhysicsCostTicks, int serverConfirmationCostTicks, double expectedFailureRisk, int exitCostTicks, String reason) {
   private final int IiIIiIilil;
   private final int lIIIiIilil;
   private final int iiIIiIilil;
   private final double iiiilIilil;
   private final int iIIIiIilil;
   private final liilllIliiilllIl lliilIilil;
   private final int llIIiIilil;
   private final int IiiilIilil;
   private final double liIIiIilil;
   private final int liiilIilil;
   private final String IIlIiIilil;
   private final int ilIIiIilil;
   private final double IIIIiIilil;
   private final int IlIIiIilil;
   private final long iliilIilil;

   public int Iilllilliill() {
      return this.llIIiIilil;
   }

   public double IlIlllIlilIl() {
      return this.IIIIiIilil;
   }

   public String IlIillIiilIi() {
      return this.IIlIiIilil;
   }

   public int lIiiIiIlilli() {
      return this.IiiilIilil;
   }

   public int Illlllllilll() {
      return this.IlIIiIilil;
   }

   public double Iiilliiliiil() {
      return this.liIIiIilil;
   }

   public int IiIlliIliiIl() {
      return this.lIIIiIilil;
   }

   public int iliIiiliiiii() {
      return this.liiilIilil;
   }

   public double liiiIIllIl() {
      double var1 = this.IliIlllilIi();
      return !(var1 <= (double)0.0F) && this.liiilIilil > 0 ? (double)this.liiilIilil / (var1 / (double)20.0F) : (double)0.0F;
   }

   public liilllIliiilllIl iIlIlllllill() {
      return this.lliilIilil;
   }

   public int Ililllililil() {
      return this.IiIIiIilil;
   }

   public int IIIilIIiiIIi() {
      return this.iiIIiIilil;
   }

   public double IliIlllilIi() {
      double var1 = (double)(this.IlIIiIilil + this.llIIiIilil + this.ilIIiIilil + this.IiIIiIilil + this.lIIIiIilil);
      double var3 = this.IIIIiIilil <= (double)0.0F ? (double)this.liiilIilil : Math.ceil((double)this.liiilIilil / this.IIIIiIilil);
      double var5 = this.iiiilIilil <= (double)0.0F ? (double)this.liiilIilil : Math.ceil((double)this.liiilIilil / this.iiiilIilil);
      double var7 = (double)(this.IiiilIilil + this.iiIIiIilil) + (double)this.liiilIilil * var1 + (double)this.iIIIiIilil + var3 * (double)6.0F + var5 * (double)30.0F;
      return var7 * ((double)1.0F + Math.max((double)0.0F, this.liIIiIilil));
   }

   public lllIliilillIliil(liilllIliiilllIl placementsPerMove, long exitCostTicks, int expectedPlacements, int kind, double placementsPerStand, double inventorySwitchCostTicks, int clusterKey, int entryTravelTicks, int rotationCostTicks, int serverConfirmationCostTicks, int precisePoseCostTicks, int surfacePhysicsCostTicks, double reason, int expectedFailureRisk, String crouchCostTicks) {
      this.lliilIilil = placementsPerMove;
      this.iliilIilil = exitCostTicks;
      this.IiiilIilil = expectedPlacements;
      this.liiilIilil = kind;
      this.iiiilIilil = placementsPerStand;
      this.IIIIiIilil = inventorySwitchCostTicks;
      this.lIIIiIilil = clusterKey;
      this.iIIIiIilil = entryTravelTicks;
      this.IlIIiIilil = rotationCostTicks;
      this.llIIiIilil = serverConfirmationCostTicks;
      this.ilIIiIilil = precisePoseCostTicks;
      this.IiIIiIilil = surfacePhysicsCostTicks;
      this.liIIiIilil = reason;
      this.iiIIiIilil = expectedFailureRisk;
      this.IIlIiIilil = crouchCostTicks;
   }

   public int IIillIiliIil() {
      return this.ilIIiIilil;
   }

   public long IilliliilIIi() {
      return this.iliilIilil;
   }

   public int IIlllIlliIll() {
      return this.iIIIiIilil;
   }

   public double IIIllIIliIIl() {
      return this.iiiilIilil;
   }
}
