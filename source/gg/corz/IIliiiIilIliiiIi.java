package gg.corz;

public record IIliiiIilIliiiIi(double off, double self, double aggression, double airValue, int airCap, double toward, double time, double obsidian, double reuse) {
   private final double IIlIiIIlIi;
   private final double illIiIIlIi;
   private final double lllIiIIlIi;
   private final double liIIiIIlIi;
   private final double iIlIiIIlIi;
   private final int lIlIiIIlIi;
   private final double iiIIiIIlIi;
   private final double IiIIiIIlIi;
   private final double IllIiIIlIi;

   public double IlIlllIlilIl() {
      return this.IllIiIIlIi;
   }

   public IIliiiIilIliiiIi(double toward, double airCap, double obsidian, double airValue, int aggression, double self, double off, double time, double reuse) {
      this.IiIIiIIlIi = toward;
      this.liIIiIIlIi = airCap;
      this.iiIIiIIlIi = obsidian;
      this.IIlIiIIlIi = airValue;
      this.lIlIiIIlIi = aggression;
      this.iIlIiIIlIi = self;
      this.IllIiIIlIi = off;
      this.lllIiIIlIi = time;
      this.illIiIIlIi = reuse;
   }

   public double liiiIIllIl() {
      return this.IiIIiIIlIi;
   }

   public double IilliliilIIi() {
      return this.iiIIiIIlIi;
   }

   public int iliIiiliiiii() {
      return this.lIlIiIIlIi;
   }

   public static IIliiiIilIliiiIi IliIlllilIi(double aggression, double self, double off) {
      return new IIliiiIilIliiiIi(aggression, self, off, (double)0.25F, 24, (double)1.0F, 0.15, (double)1.0F, (double)1.5F);
   }

   public double lIiiIiIlilli() {
      return this.IIlIiIIlIi;
   }

   public double iIlIlllllill() {
      return this.liIIiIIlIi;
   }

   public double IIIllIIliIIl() {
      return this.iIlIiIIlIi;
   }

   public double IIlllIlliIll() {
      return this.illIiIIlIi;
   }

   public double IiIlliIliiIl() {
      return this.lllIiIIlIi;
   }
}
