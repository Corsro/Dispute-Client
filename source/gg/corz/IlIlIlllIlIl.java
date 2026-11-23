package gg.corz;

public record IlIlIlllIlIl(int bestCost, String bestWhere, int inStock, int restocking, int unchecked, int belowLevel) {
   private final int IllIlIlllllIlIll;
   private final int illIlIllIilIlIll;
   private final int iiIIlIllIIlIlIll;
   private final String lIlIlIlliIlIlIll;
   private final int lilIlIlliilIlIll;
   private final int IIiIlIlllIiIlIll;

   public int IilliliilIIi() {
      return this.illIlIllIilIlIll;
   }

   public int lIiiIiIlilli() {
      return this.lilIlIlliilIlIll;
   }

   public int iliIiiliiiii() {
      return this.IIiIlIlllIiIlIll;
   }

   public int iIlIlllllill() {
      return this.IllIlIlllllIlIll;
   }

   public IlIlIlllIlIl(int bestWhere, String unchecked, int inStock, int belowLevel, int restocking, int bestCost) {
      this.iiIIlIllIIlIlIll = bestWhere;
      this.lIlIlIlliIlIlIll = unchecked;
      this.IllIlIlllllIlIll = inStock;
      this.illIlIllIilIlIll = belowLevel;
      this.lilIlIlliilIlIll = restocking;
      this.IIiIlIlllIiIlIll = bestCost;
   }

   public int IliIlllilIi() {
      return this.iiIIlIllIIlIlIll;
   }

   public String liiiIIllIl() {
      return this.lIlIlIlliIlIlIll;
   }
}
