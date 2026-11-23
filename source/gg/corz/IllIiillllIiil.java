package gg.corz;

public record IllIiillllIiil(iIiIiIilIliIiIil why, long base, int climb, int cost, IiIlIiiliIlIii column, boolean usedAstar, boolean deferred, int validUntil) {
   private final int iiIlliIliIIllliIli;
   private final boolean lillliIliiillliIli;
   private final long IiIlliIliliIlliIli;
   private final int lIllliIliiIllliIli;
   public static final IllIiillllIiil iIilliIliIlilliIli;
   private final IiIlIiiliIlIii IlllliIlillllliIli;
   private final iIiIiIilIliIiIil llIlliIliilIlliIli;
   private final boolean illlliIliIillliIli;
   private final int IIilliIlilIilliIli;

   public IllIiillllIiil iIlIlllllill(int validUntil) {
      return new IllIiillllIiil(this.llIlliIliilIlliIli, this.IiIlliIliliIlliIli, this.iiIlliIliIIllliIli, this.lIllliIliiIllliIli, this.IlllliIlillllliIli, this.illlliIliIillliIli, this.lillliIliiillliIli, validUntil);
   }

   public int IIIllIIliIIl() {
      return this.iiIlliIliIIllliIli;
   }

   public boolean Illlllllilll() {
      return this.lillliIliiillliIli;
   }

   public long iliIiiliiiii() {
      return this.IiIlliIliliIlliIli;
   }

   public IllIiillllIiil(iIiIiIilIliIiIil usedAstar, long validUntil, int column, int climb, IiIlIiiliIlIii cost, boolean deferred, boolean base, int why) {
      this.llIlliIliilIlliIli = usedAstar;
      this.IiIlliIliliIlliIli = validUntil;
      this.iiIlliIliIIllliIli = column;
      this.lIllliIliiIllliIli = climb;
      this.IlllliIlillllliIli = cost;
      this.illlliIliIillliIli = deferred;
      this.lillliIliiillliIli = base;
      this.IIilliIlilIilliIli = why;
   }

   static {
      iIilliIliIlilliIli = new IllIiillllIiil((iIiIiIilIliIiIil)null, 0L, 0, 0, IiIlIiiliIlIii.IiIIiilIIl, false, true, 0);
   }

   public IiIlIiiliIlIii IiIlliIliiIl() {
      return this.IlllliIlillllliIli;
   }

   public int Iilllilliill() {
      return this.IIilliIlilIilliIli;
   }

   public iIiIiIilIliIiIil lIiiIiIlilli() {
      return this.llIlliIliilIlliIli;
   }

   public int IlIlllIlilIl() {
      return this.lIllliIliiIllliIli;
   }

   public boolean IilliliilIIi() {
      return this.llIlliIliilIlliIli == null && !this.lillliIliiillliIli;
   }

   public static IllIiillllIiil liiiIIllIl(iIiIiIilIliIiIil column, long base, IiIlIiiliIlIii why, boolean usedAstar) {
      return new IllIiillllIiil(column, base, 0, 0, why == null ? IiIlIiiliIlIii.IiIIiilIIl : why, usedAstar, false, 0);
   }

   public boolean IIlllIlliIll() {
      return this.illlliIliIillliIli;
   }

   public static IllIiillllIiil IliIlllilIi(long base, int climb, int cost, boolean usedAstar) {
      return new IllIiillllIiil((iIiIiIilIliIiIil)null, base, climb, cost, IiIlIiiliIlIii.IiIIiilIIl, usedAstar, false, 0);
   }
}
