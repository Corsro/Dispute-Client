package gg.corz;

public record illIIlIilIIl(int selectedItem, int ticksSinceSlotChange, int ticksSinceRightClick, int placeGap, int spawnSeen, int reattack, boolean trustObsidian) {
   private final int liiIIIlliiiIIIll;
   private final boolean lIllIIlliIllIIll;
   private final int IiIlIIllliIlIIll;
   private final int IIIlIIlllIIlIIll;
   private final int llIlIIllilIlIIll;
   private final int iIIlIIllIlIlIIll;
   private final int iiIlIIllIIllIIll;

   public boolean IIIllIIliIIl() {
      return this.lIllIIlliIllIIll;
   }

   public int iIlIlllllill() {
      return this.iIIlIIllIlIlIIll;
   }

   public int liiiIIllIl() {
      return this.IIIlIIlllIIlIIll;
   }

   public int iliIiiliiiii() {
      return this.iiIlIIllIIllIIll;
   }

   public int lIiiIiIlilli() {
      return this.IiIlIIllliIlIIll;
   }

   public int IliIlllilIi() {
      return this.liiIIIlliiiIIIll;
   }

   public int IilliliilIIi() {
      return this.llIlIIllilIlIIll;
   }

   public illIIlIilIIl(int selectedItem, int ticksSinceRightClick, int ticksSinceSlotChange, int placeGap, int reattack, int spawnSeen, boolean trustObsidian) {
      this.liiIIIlliiiIIIll = selectedItem;
      this.IIIlIIlllIIlIIll = ticksSinceRightClick;
      this.iIIlIIllIlIlIIll = ticksSinceSlotChange;
      this.llIlIIllilIlIIll = placeGap;
      this.IiIlIIllliIlIIll = reattack;
      this.iiIlIIllIIllIIll = spawnSeen;
      this.lIllIIlliIllIIll = trustObsidian;
   }
}
