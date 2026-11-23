package gg.corz;

record IiIilIllliIilIll(float targetDamage, float selfFull, float selfCost, boolean pops, boolean kills, double denial, boolean safe, double value, float knock) {
   private final float iIlIlIilll;
   private final float lIlIlIilll;
   private final double IilIlIilll;
   private final float IllIlIilll;
   private final boolean lllIlIilll;
   private final boolean illIlIilll;
   private final double iilIlIilll;
   private final boolean lilIlIilll;
   private final float IIiIlIilll;

   public float iIlIlllllill() {
      return this.IllIlIilll;
   }

   public boolean lIiiIiIlilli() {
      return this.illIlIilll;
   }

   public boolean IIIllIIliIIl() {
      return this.lilIlIilll;
   }

   public float IliIlllilIi() {
      return this.lIlIlIilll;
   }

   public float liiiIIllIl() {
      return this.iIlIlIilll;
   }

   public double IlIlllIlilIl() {
      return this.iilIlIilll;
   }

   public float IiIlliIliiIl() {
      return this.IIiIlIilll;
   }

   public boolean IilliliilIIi() {
      return this.lllIlIilll;
   }

   public double iliIiiliiiii() {
      return this.IilIlIilll;
   }

   private IiIilIllliIilIll(float value, float targetDamage, float safe, boolean selfFull, boolean denial, double knock, boolean kills, double selfCost, float pops) {
      this.lIlIlIilll = value;
      this.iIlIlIilll = targetDamage;
      this.IllIlIilll = safe;
      this.lllIlIilll = selfFull;
      this.illIlIilll = denial;
      this.IilIlIilll = knock;
      this.lilIlIilll = kills;
      this.iilIlIilll = selfCost;
      this.IIiIlIilll = pops;
   }
}
