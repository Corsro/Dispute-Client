package gg.corz;

public record lIIlliIiiIIlliIi(iIIliIIiIlIliIIi result, double plannedDistance, double liveDistance) {
   private final iIIliIIiIlIliIIi IliilliIIi;
   private final double iliilliIIi;
   private final double lliilliIIi;

   public boolean IliIlllilIi() {
      return this.IliilliIIi == iIIliIIiIlIliIIi.ilIilliiil;
   }

   public iIIliIIiIlIliIIi liiiIIllIl() {
      return this.IliilliIIi;
   }

   public lIIlliIiiIIlliIi(iIIliIIiIlIliIIi plannedDistance, double result, double liveDistance) {
      this.IliilliIIi = plannedDistance;
      this.lliilliIIi = result;
      this.iliilliIIi = liveDistance;
   }

   public double IilliliilIIi() {
      return this.iliilliIIi;
   }

   public double iIlIlllllill() {
      return this.lliilliIIi;
   }
}
