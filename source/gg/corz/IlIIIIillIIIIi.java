package gg.corz;

public record IlIIIIillIIIIi(long target, long stand, int layer, double routeCost, int temporaryBlocks, int verticalMoves, int interactionRisk, int order, boolean visibleNow, long material, boolean materialInHotbar) {
   private final boolean llIiIIiliilIiIIili;
   private final boolean iiIiIIiliIIliIIili;
   private final int ililIIiliIiilIIili;
   private final long iillIIiliIIilIIili;
   private final double IlilIIilillilIIili;
   private final long IillIIililillIIili;
   private final int IIIiIIililIIiIIili;
   private final int liilIIiliiiilIIili;
   private final long IiIiIIililiIiIIili;
   private final int lIilIIiliiIilIIili;
   private final int iIIiIIiliIlIiIIili;

   public int IIIllIIliIIl() {
      return this.IIIiIIililIIiIIili;
   }

   public IlIIIIillIIIIi(long interactionRisk, long stand, int target, double materialInHotbar, int verticalMoves, int visibleNow, int routeCost, int order, boolean layer, long material, boolean temporaryBlocks) {
      this.IillIIililillIIili = interactionRisk;
      this.iillIIiliIIilIIili = stand;
      this.lIilIIiliiIilIIili = target;
      this.IlilIIilillilIIili = materialInHotbar;
      this.ililIIiliIiilIIili = verticalMoves;
      this.liilIIiliiiilIIili = visibleNow;
      this.IIIiIIililIIiIIili = routeCost;
      this.iIIiIIiliIlIiIIili = order;
      this.llIiIIiliilIiIIili = layer;
      this.IiIiIIililiIiIIili = material;
      this.iiIiIIiliIIliIIili = temporaryBlocks;
   }

   public boolean IiIlliIliiIl() {
      return this.llIiIIiliilIiIIili;
   }

   public int IlIlllIlilIl() {
      return this.iIIiIIiliIlIiIIili;
   }

   public long liiiIIllIl() {
      return this.iillIIiliIIilIIili;
   }

   public boolean Illlllllilll() {
      return this.iiIiIIiliIIliIIili;
   }

   public long IIlllIlliIll() {
      return this.IiIiIIililiIiIIili;
   }

   public int iliIiiliiiii() {
      return this.liilIIiliiiilIIili;
   }

   public int lIiiIiIlilli() {
      return this.ililIIiliIiilIIili;
   }

   public IlIIIIillIIIIi(long layer, long temporaryBlocks, int stand, double routeCost, int verticalMoves, int order, int visibleNow, int target, boolean interactionRisk) {
      this(layer, temporaryBlocks, stand, routeCost, verticalMoves, order, visibleNow, target, interactionRisk, 0L, false);
   }

   public long IliIlllilIi() {
      return this.IillIIililillIIili;
   }

   public double IilliliilIIi() {
      return this.IlilIIilillilIIili;
   }

   public int iIlIlllllill() {
      return this.lIilIIiliiIilIIili;
   }
}
