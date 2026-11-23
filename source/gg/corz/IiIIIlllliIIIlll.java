package gg.corz;

public record IiIIIlllliIIIlll(int tick, long componentKey, long localGeometry, lIlIliIlIl kind) {
   private final long ililiiilll;
   private final int Ililiiilll;
   private final long lliliiilll;
   private final lIlIliIlIl Iiiliiilll;

   public long iIlIlllllill() {
      return this.ililiiilll;
   }

   public lIlIliIlIl IilliliilIIi() {
      return this.Iiiliiilll;
   }

   public int IliIlllilIi() {
      return this.Ililiiilll;
   }

   public long liiiIIllIl() {
      return this.lliliiilll;
   }

   public IiIIIlllliIIIlll(int kind, long localGeometry, long componentKey, lIlIliIlIl tick) {
      this.Ililiiilll = kind;
      this.lliliiilll = localGeometry;
      this.ililiiilll = componentKey;
      this.Iiiliiilll = tick;
   }
}
