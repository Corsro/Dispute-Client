package gg.corz;

public record illIlIiIilIlIi(liIIiIlliiIIiIll sample, boolean grounded, int groundedUpdates, double rMelee, double rExpl, IiIllIilliIllIil lift, liIiilIliiIiilIl time, long sampleTick) {
   private final boolean IllIIlIiilllIIlIii;
   private final liIIiIlliiIIiIll lIlIIlIiiiIlIIlIii;
   private final IiIllIilliIllIil iIiIIlIiiIliIIlIii;
   private final long IiiIIlIiiliiIIlIii;
   private final double IIiIIlIiilIiIIlIii;
   private final double lilIIlIiiiilIIlIii;
   private final int illIIlIiiIilIIlIii;
   private final liIiilIliiIiilIl lliIIlIiiiliIIlIii;

   public double lIiiIiIlilli() {
      return this.IIiIIlIiilIiIIlIii;
   }

   public liIiilIliiIiilIl IIIllIIliIIl() {
      return this.lliIIlIiiiliIIlIii;
   }

   public long IlIlllIlilIl() {
      return this.IiiIIlIiiliiIIlIii;
   }

   public boolean liiiIIllIl() {
      return this.IllIIlIiilllIIlIii;
   }

   public IiIllIilliIllIil iliIiiliiiii() {
      return this.iIiIIlIiiIliIIlIii;
   }

   public liIIiIlliiIIiIll IliIlllilIi() {
      return this.lIlIIlIiiiIlIIlIii;
   }

   public illIlIiIilIlIi(liIIiIlliiIIiIll sampleTick, boolean rMelee, int groundedUpdates, double lift, double time, IiIllIilliIllIil grounded, liIiilIliiIiilIl sample, long rExpl) {
      this.lIlIIlIiiiIlIIlIii = sampleTick;
      this.IllIIlIiilllIIlIii = rMelee;
      this.illIIlIiiIilIIlIii = groundedUpdates;
      this.lilIIlIiiiilIIlIii = lift;
      this.IIiIIlIiilIiIIlIii = time;
      this.iIiIIlIiiIliIIlIii = grounded;
      this.lliIIlIiiiliIIlIii = sample;
      this.IiiIIlIiiliiIIlIii = rExpl;
   }

   public double IilliliilIIi() {
      return this.lilIIlIiiiilIIlIii;
   }

   public int iIlIlllllill() {
      return this.illIIlIiiIilIIlIii;
   }
}
