package gg.corz;

public record IIIililIIili(int count, long coins, String item) {
   private final int IlIIiIlIlllIIiIlIl;
   private final String liIIiIlIliiIIiIlIl;
   private final long ilIIiIlIlIiIIiIlIl;

   public IIIililIIili(int coins, long count, String item) {
      this.IlIIiIlIlllIIiIlIl = coins;
      this.ilIIiIlIlIiIIiIlIl = count;
      this.liIIiIlIliiIIiIlIl = item;
   }

   public long liiiIIllIl() {
      return this.ilIIiIlIlIiIIiIlIl;
   }

   public String iIlIlllllill() {
      return this.liIIiIlIliiIIiIlIl;
   }

   public int IliIlllilIi() {
      return this.IlIIiIlIlllIIiIlIl;
   }
}
