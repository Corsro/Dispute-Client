package gg.corz;

public record iliIiIiIiiIiIi(iIllllIlIlllllIl intent, boolean wantHit, float minCharge, boolean crit, lIIIilIliIIIilIl phase) {
   private final lIIIilIliIIIilIl ilIiilliiIiIiillii;
   private final float lIIiilliiiIIiillii;
   private final boolean iiililliiIIIiillii;
   private final boolean IlIiilliillIiillii;
   public static final iliIiIiIiiIiIi liIiilliiiiIiillii;
   private final iIllllIlIlllllIl Iiililliiliilillii;

   public iliIiIiIiiIiIi(iIllllIlIlllllIl wantHit, boolean minCharge, float intent, boolean phase, lIIIilIliIIIilIl crit) {
      this.Iiililliiliilillii = wantHit;
      this.iiililliiIIIiillii = minCharge;
      this.lIIiilliiiIIiillii = intent;
      this.IlIiilliillIiillii = phase;
      this.ilIiilliiIiIiillii = crit;
   }

   public boolean IilliliilIIi() {
      return this.IlIiilliillIiillii;
   }

   public float iIlIlllllill() {
      return this.lIIiilliiiIIiillii;
   }

   public iIllllIlIlllllIl IliIlllilIi() {
      return this.Iiililliiliilillii;
   }

   public lIIIilIliIIIilIl lIiiIiIlilli() {
      return this.ilIiilliiIiIiillii;
   }

   static {
      liIiilliiiiIiillii = new iliIiIiIiiIiIi(iIllllIlIlllllIl.IliIlllilIi(), false, 0.95F, false, lIIIilIliIIIilIl.iIIiIlliIl);
   }

   public boolean liiiIIllIl() {
      return this.iiililliiIIIiillii;
   }
}
