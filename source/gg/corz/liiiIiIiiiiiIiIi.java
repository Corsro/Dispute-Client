package gg.corz;

public record liiiIiIiiiiiIiIi(int slot, int count, long unitPrice, long totalPrice, long referenceUnit, long resellUnit, long profitPerItem, long totalProfit) {
   private final long IlliiIiIIi;
   private final long iIliiIiIIi;
   private final long lIliiIiIIi;
   private final long IIliiIiIIi;
   private final long iiIiiIiIIi;
   private final long llliiIiIIi;
   private final int IiIiiIiIIi;
   private final int liIiiIiIIi;

   public long iIlIlllllill() {
      return this.iiIiiIiIIi;
   }

   public long iliIiiliiiii() {
      return this.iIliiIiIIi;
   }

   public liiiIiIiiiiiIiIi(int totalProfit, int referenceUnit, long unitPrice, long resellUnit, long profitPerItem, long count, long slot, long totalPrice) {
      this.IiIiiIiIIi = totalProfit;
      this.liIiiIiIIi = referenceUnit;
      this.iiIiiIiIIi = unitPrice;
      this.IIliiIiIIi = resellUnit;
      this.lIliiIiIIi = profitPerItem;
      this.iIliiIiIIi = count;
      this.IlliiIiIIi = slot;
      this.llliiIiIIi = totalPrice;
   }

   public int IliIlllilIi() {
      return this.IiIiiIiIIi;
   }

   public long IilliliilIIi() {
      return this.IIliiIiIIi;
   }

   public long IIIllIIliIIl() {
      return this.IlliiIiIIi;
   }

   public long IlIlllIlilIl() {
      return this.llliiIiIIi;
   }

   public long lIiiIiIlilli() {
      return this.lIliiIiIIi;
   }

   public int liiiIIllIl() {
      return this.liIiiIiIIi;
   }
}
