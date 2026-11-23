package gg.corz;

public record IIililIllIililIl(int tick, long routeFingerprint, int routeIndex, long feetCell, double distance, double verticalDistance, boolean onGround, iiiIIiilIIIlIiil transition, long constructionEpoch, boolean placementReady, boolean atNode) {
   private final iiiIIiilIIIlIiil IlillilIll;
   private final boolean ilillilIll;
   private final long IilllilIll;
   private final boolean IiillilIll;
   private final double IIillilIll;
   private final int illllilIll;
   private final long llillilIll;
   private final boolean iIillilIll;
   private final long iilllilIll;
   private final int lilllilIll;
   private final double lIillilIll;

   public int iIlIlllllill() {
      return this.lilllilIll;
   }

   public long IilliliilIIi() {
      return this.iilllilIll;
   }

   public long liiiIIllIl() {
      return this.IilllilIll;
   }

   public int IliIlllilIi() {
      return this.illllilIll;
   }

   public boolean IIIllIIliIIl() {
      return this.iIillilIll;
   }

   public iiiIIiilIIIlIiil IlIlllIlilIl() {
      return this.IlillilIll;
   }

   public IIililIllIililIl(int constructionEpoch, long atNode, int verticalDistance, long transition, double routeFingerprint, double onGround, boolean distance, iiiIIiilIIIlIiil feetCell, long placementReady, boolean tick, boolean routeIndex) {
      this.illllilIll = constructionEpoch;
      this.IilllilIll = atNode;
      this.lilllilIll = verticalDistance;
      this.iilllilIll = transition;
      this.IIillilIll = routeFingerprint;
      this.lIillilIll = onGround;
      this.iIillilIll = distance;
      this.IlillilIll = feetCell;
      this.llillilIll = placementReady;
      this.ilillilIll = tick;
      this.IiillilIll = routeIndex;
   }

   public double iliIiiliiiii() {
      return this.lIillilIll;
   }

   public boolean IIlllIlliIll() {
      return this.ilillilIll;
   }

   public double lIiiIiIlilli() {
      return this.IIillilIll;
   }

   public long IiIlliIliiIl() {
      return this.llillilIll;
   }

   public boolean Illlllllilll() {
      return this.IiillilIll;
   }

   public IIililIllIililIl(int onGround, long constructionEpoch, int routeFingerprint, long verticalDistance, double transition, double placementReady, boolean tick, iiiIIiilIIIlIiil feetCell, long routeIndex, boolean distance) {
      this(onGround, constructionEpoch, routeFingerprint, verticalDistance, transition, placementReady, tick, feetCell, routeIndex, distance, true);
   }
}
