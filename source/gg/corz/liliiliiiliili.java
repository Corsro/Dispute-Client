package gg.corz;

public record liliiliiiliili(iIlliilIllliil decision, double currentRate, double alternativeRate, double switchCostTicks, double netGainTicks, String line) {
   private final double liiIIllIIl;
   private final double iliIIllIIl;
   private final String iiiIIllIIl;
   private final double lliIIllIIl;
   private final iIlliilIllliil IliIIllIIl;
   private final double IiiIIllIIl;

   public double IilliliilIIi() {
      return this.IiiIIllIIl;
   }

   public double liiiIIllIl() {
      return this.lliIIllIIl;
   }

   public double lIiiIiIlilli() {
      return this.liiIIllIIl;
   }

   public String iliIiiliiiii() {
      return this.iiiIIllIIl;
   }

   public iIlliilIllliil IliIlllilIi() {
      return this.IliIIllIIl;
   }

   public liliiliiiliili(iIlliilIllliil alternativeRate, double line, double currentRate, double netGainTicks, double decision, String switchCostTicks) {
      this.IliIIllIIl = alternativeRate;
      this.lliIIllIIl = line;
      this.iliIIllIIl = currentRate;
      this.IiiIIllIIl = netGainTicks;
      this.liiIIllIIl = decision;
      this.iiiIIllIIl = switchCostTicks;
   }

   public double iIlIlllllill() {
      return this.iliIIllIIl;
   }
}
