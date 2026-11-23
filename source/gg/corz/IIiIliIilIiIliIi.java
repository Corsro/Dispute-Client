package gg.corz;

record IIiIliIilIiIliIi(ilIlIilIiIlIil op, lIiliiliIiliil from, lIiliiliIiliil to, lIiliiliIiliil cell, int count, lIiliiliIiliil placeFrom, IlIillillIilli intent, lIiliiliIiliil trail) {
   private final lIiliiliIiliil IiIllliIIi;
   private final lIiliiliIiliil IIIllliIIi;
   private final IlIillillIilli ilIllliIIi;
   private final lIiliiliIiliil iIIllliIIi;
   private final ilIlIilIiIlIil iiiIlliIIi;
   private final lIiliiliIiliil llIllliIIi;
   private final lIiliiliIiliil lIIllliIIi;
   private final int IlIllliIIi;

   public lIiliiliIiliil IlIlllIlilIl() {
      return this.IiIllliIIi;
   }

   public ilIlIilIiIlIil IliIlllilIi() {
      return this.iiiIlliIIi;
   }

   public IlIillillIilli IIIllIIliIIl() {
      return this.ilIllliIIi;
   }

   IIiIliIilIiIliIi(ilIlIilIiIlIil op, lIiliiliIiliil placeFrom, lIiliiliIiliil count, lIiliiliIiliil from, int to, lIiliiliIiliil cell) {
      this(op, placeFrom, count, from, to, cell, (IlIillillIilli)null, (lIiliiliIiliil)null);
   }

   public int lIiiIiIlilli() {
      return this.IlIllliIIi;
   }

   IIiIliIilIiIliIi(ilIlIilIiIlIil placeFrom, lIiliiliIiliil cell, lIiliiliIiliil op, lIiliiliIiliil from, int to, lIiliiliIiliil intent, IlIillillIilli count) {
      this(placeFrom, cell, op, from, to, intent, count, (lIiliiliIiliil)null);
   }

   public lIiliiliIiliil liiiIIllIl() {
      return this.IIIllliIIi;
   }

   IIiIliIilIiIliIi(ilIlIilIiIlIil op, lIiliiliIiliil cell, lIiliiliIiliil to, lIiliiliIiliil placeFrom, int from, lIiliiliIiliil count, IlIillillIilli trail, lIiliiliIiliil intent) {
      this.iiiIlliIIi = op;
      this.IIIllliIIi = cell;
      this.lIIllliIIi = to;
      this.iIIllliIIi = placeFrom;
      this.IlIllliIIi = from;
      this.llIllliIIi = count;
      this.ilIllliIIi = trail;
      this.IiIllliIIi = intent;
   }

   public lIiliiliIiliil IilliliilIIi() {
      return this.iIIllliIIi;
   }

   public lIiliiliIiliil iliIiiliiiii() {
      return this.llIllliIIi;
   }

   public lIiliiliIiliil iIlIlllllill() {
      return this.lIIllliIIi;
   }
}
