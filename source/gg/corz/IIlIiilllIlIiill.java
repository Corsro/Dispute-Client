package gg.corz;

public record IIlIiilllIlIiill(int deltaX, int deltaY, int deltaZ, boolean nextStandable, boolean nextPassable, boolean headroom, boolean supportBelowNext, boolean blockedMemory, boolean diagonalClear, boolean gapClear, boolean ownedDirtFloor, boolean chestFloor, boolean narrowEdge, boolean takeoffHeadroom, boolean dropEntryClear, liiiiIlliiiiiIll hint) {
   private final boolean iliIiliill;
   private final int lllIiliill;
   private final boolean lIiIiliill;
   private final int IilIiliill;
   private final int illIiliill;
   private final boolean iilIiliill;
   private final liiiiIlliiiiiIll lIIliliill;
   private final boolean iiiIiliill;
   private final boolean iIiIiliill;
   private final boolean lliIiliill;
   private final boolean IliIiliill;
   private final boolean liiIiliill;
   private final boolean lilIiliill;
   private final boolean IIiIiliill;
   private final boolean IiiIiliill;
   private final boolean IIIliliill;

   public boolean IiIlliIliiIl() {
      return this.IliIiliill;
   }

   public boolean Iilllilliill() {
      return this.IiiIiliill;
   }

   public IIlIiilllIlIiill(int deltaY, int ownedDirtFloor, int narrowEdge, boolean hint, boolean gapClear, boolean deltaX, boolean nextPassable, boolean nextStandable, boolean diagonalClear, boolean blockedMemory, boolean headroom, boolean dropEntryClear, boolean supportBelowNext, boolean chestFloor, boolean deltaZ, liiiiIlliiiiiIll takeoffHeadroom) {
      takeoffHeadroom = takeoffHeadroom == null ? liiiiIlliiiiiIll.lIIIiiilll : takeoffHeadroom;
      this.lllIiliill = deltaY;
      this.illIiliill = ownedDirtFloor;
      this.IilIiliill = narrowEdge;
      this.lilIiliill = hint;
      this.iilIiliill = gapClear;
      this.IIiIiliill = deltaX;
      this.lIiIiliill = nextPassable;
      this.iIiIiliill = nextStandable;
      this.IliIiliill = diagonalClear;
      this.lliIiliill = blockedMemory;
      this.iliIiliill = headroom;
      this.IiiIiliill = dropEntryClear;
      this.liiIiliill = supportBelowNext;
      this.iiiIiliill = chestFloor;
      this.IIIliliill = deltaZ;
      this.lIIliliill = takeoffHeadroom;
   }

   public boolean IilliliilIIi() {
      return this.lilIiliill;
   }

   public boolean IlIlllIlilIl() {
      return this.iIiIiliill;
   }

   public int IliIlllilIi() {
      return this.lllIiliill;
   }

   public boolean IIIllIIliIIl() {
      return this.lIiIiliill;
   }

   public IIlIiilllIlIiill(int deltaZ, int diagonalClear, int supportBelowNext, boolean hint, boolean chestFloor, boolean nextStandable, boolean blockedMemory, boolean ownedDirtFloor, boolean nextPassable, boolean headroom, boolean gapClear, boolean deltaY, boolean narrowEdge, liiiiIlliiiiiIll deltaX) {
      this(deltaZ, diagonalClear, supportBelowNext, hint, chestFloor, nextStandable, blockedMemory, ownedDirtFloor, nextPassable, headroom, gapClear, deltaY, narrowEdge, true, true, deltaX);
   }

   public boolean IIlllIlliIll() {
      return this.lliIiliill;
   }

   public liiiiIlliiiiiIll IIIilIIiiIIi() {
      return this.lIIliliill;
   }

   public IIlIiilllIlIiill(int chestFloor, int headroom, int narrowEdge, boolean deltaX, boolean supportBelowNext, boolean hint, boolean takeoffHeadroom, boolean gapClear, boolean nextPassable, boolean nextStandable, boolean deltaY, boolean ownedDirtFloor, boolean deltaZ, boolean blockedMemory, liiiiIlliiiiiIll diagonalClear) {
      this(chestFloor, headroom, narrowEdge, deltaX, supportBelowNext, hint, takeoffHeadroom, gapClear, nextPassable, nextStandable, deltaY, ownedDirtFloor, deltaZ, blockedMemory, true, diagonalClear);
   }

   public boolean Ililllililil() {
      return this.iiiIiliill;
   }

   public boolean Iiilliiliiil() {
      return this.IIIliliill;
   }

   public boolean Illlllllilll() {
      return this.iliIiliill;
   }

   public int liiiIIllIl() {
      return this.illIiliill;
   }

   public boolean iliIiiliiiii() {
      return this.IIiIiliill;
   }

   public boolean IIillIiliIil() {
      return this.liiIiliill;
   }

   public boolean lIiiIiIlilli() {
      return this.iilIiliill;
   }

   public int iIlIlllllill() {
      return this.IilIiliill;
   }
}
