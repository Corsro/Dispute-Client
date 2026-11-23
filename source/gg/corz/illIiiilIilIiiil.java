package gg.corz;

public record illIiiilIilIiiil(float selfEhp, int selfTotems, boolean totemConfirmed, float maxIncoming, boolean lethal, float bestHit, float targetEhp, boolean targetAwaitingTotem, boolean targetEating, float targetArmorMin, int enemiesWithin8, boolean pearlsAvailable, IlIIIlilllIIIlil style) {
   private final boolean iIiIIlIiil;
   private final IlIIIlilllIIIlil IiiIIlIiil;
   private final float iilIIlIiil;
   private final boolean lIiIIlIiil;
   private final float IIiIIlIiil;
   private final int lllIIlIiil;
   private final float IilIIlIiil;
   private final float IliIIlIiil;
   private final boolean iliIIlIiil;
   private final float IllIIlIiil;
   private final boolean lilIIlIiil;
   private final boolean illIIlIiil;
   private final int lliIIlIiil;

   public illIiiilIilIiiil(float targetEhp, int selfEhp, boolean maxIncoming, float lethal, boolean pearlsAvailable, float style, float bestHit, boolean enemiesWithin8, boolean selfTotems, float targetEating, int totemConfirmed, boolean targetAwaitingTotem, IlIIIlilllIIIlil targetArmorMin) {
      this.IllIIlIiil = targetEhp;
      this.lllIIlIiil = selfEhp;
      this.illIIlIiil = maxIncoming;
      this.IilIIlIiil = lethal;
      this.lilIIlIiil = pearlsAvailable;
      this.iilIIlIiil = style;
      this.IIiIIlIiil = bestHit;
      this.lIiIIlIiil = enemiesWithin8;
      this.iIiIIlIiil = selfTotems;
      this.IliIIlIiil = targetEating;
      this.lliIIlIiil = totemConfirmed;
      this.iliIIlIiil = targetAwaitingTotem;
      this.IiiIIlIiil = targetArmorMin;
   }

   public int Illlllllilll() {
      return this.lliIIlIiil;
   }

   public boolean Iilllilliill() {
      return this.iliIIlIiil;
   }

   public float iliIiiliiiii() {
      return this.iilIIlIiil;
   }

   public float IIIllIIliIIl() {
      return this.IIiIIlIiil;
   }

   public float IIlllIlliIll() {
      return this.IliIIlIiil;
   }

   public boolean lIiiIiIlilli() {
      return this.lilIIlIiil;
   }

   public float IliIlllilIi() {
      return this.IllIIlIiil;
   }

   public IlIIIlilllIIIlil IIillIiliIil() {
      return this.IiiIIlIiil;
   }

   public boolean iIlIlllllill() {
      return this.illIIlIiil;
   }

   public boolean IiIlliIliiIl() {
      return this.iIiIIlIiil;
   }

   public int liiiIIllIl() {
      return this.lllIIlIiil;
   }

   public float IilliliilIIi() {
      return this.IilIIlIiil;
   }

   public boolean IlIlllIlilIl() {
      return this.lIiIIlIiil;
   }
}
