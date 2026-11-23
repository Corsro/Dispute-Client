package gg.corz;

public record iIllliIiIlllliIi(iilillIiIIiillIi cls, lIliliiIlili kind, int count, int maxCount, double score, boolean blocked) {
   private final boolean IiIliliIIi;
   private final int IlIliliIIi;
   private final iilillIiIIiillIi lIIliliIIi;
   public static final iIllliIiIlllliIi liIliliIIi;
   private final lIliliiIlili iIIliliIIi;
   private final double ilIliliIIi;
   private final int llIliliIIi;

   public boolean iliIiiliiiii() {
      return this.IiIliliIIi;
   }

   public iIllliIiIlllliIi(iilillIiIIiillIi maxCount, lIliliiIlili cls, int kind, int blocked, double count, boolean score) {
      this.lIIliliIIi = maxCount;
      this.iIIliliIIi = cls;
      this.IlIliliIIi = kind;
      this.llIliliIIi = blocked;
      this.ilIliliIIi = count;
      this.IiIliliIIi = score;
   }

   public int IilliliilIIi() {
      return this.llIliliIIi;
   }

   public double lIiiIiIlilli() {
      return this.ilIliliIIi;
   }

   static {
      liIliliIIi = new iIllliIiIlllliIi(iilillIiIIiillIi.IiliIIlIIi, (lIliliiIlili)null, 0, 64, (double)0.0F, false);
   }

   public lIliliiIlili liiiIIllIl() {
      return this.iIIliliIIi;
   }

   public int iIlIlllllill() {
      return this.IlIliliIIi;
   }

   public iilillIiIIiillIi IliIlllilIi() {
      return this.lIIliliIIi;
   }
}
