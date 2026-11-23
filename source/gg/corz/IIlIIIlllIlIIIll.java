package gg.corz;

public record IIlIIIlllIlIIIll(double referencePercentile, int minListings, int minReturnPercent, long maxUnitPrice, long budgetLeft, int resellPercent, long minProfitPerItem, int salesTaxPercent) {
   private final int IIiiliIlll;
   private final int iIiiliIlll;
   private final double llliliIlll;
   private final int illiliIlll;
   private final long iililiIlll;
   private final long lIiiliIlll;
   private final long lililiIlll;
   private final int IililiIlll;

   public double IliIlllilIi() {
      return this.llliliIlll;
   }

   public int iIlIlllllill() {
      return this.IililiIlll;
   }

   public IIlIIIlllIlIIIll(double referencePercentile, int minListings, int minProfitPerItem, long maxUnitPrice, long resellPercent, int budgetLeft, long salesTaxPercent, int minReturnPercent) {
      this.llliliIlll = referencePercentile;
      this.illiliIlll = minListings;
      this.IililiIlll = minProfitPerItem;
      this.lililiIlll = maxUnitPrice;
      this.iililiIlll = resellPercent;
      this.IIiiliIlll = budgetLeft;
      this.lIiiliIlll = salesTaxPercent;
      this.iIiiliIlll = minReturnPercent;
   }

   public long lIiiIiIlilli() {
      return this.iililiIlll;
   }

   public int IlIlllIlilIl() {
      return this.iIiiliIlll;
   }

   public int iliIiiliiiii() {
      return this.IIiiliIlll;
   }

   public int liiiIIllIl() {
      return this.illiliIlll;
   }

   public long IilliliilIIi() {
      return this.lililiIlll;
   }

   public long IIIllIIliIIl() {
      return this.lIiiliIlll;
   }
}
