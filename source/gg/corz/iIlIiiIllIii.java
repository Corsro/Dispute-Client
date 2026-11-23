package gg.corz;

public record iIlIiiIllIii(int deltaY, boolean nextStandable, boolean nextPassable, boolean headroom, boolean supportBelowNext, boolean blockedMemory, boolean takeoffHeadroom, boolean dropEntryClear) {
   private final boolean lllilllIlillilllIl;
   private final boolean IIlilllIllIlilllIl;
   private final boolean liIilllIliiIilllIl;
   private final boolean lIiilllIliIiilllIl;
   private final boolean iililllIlIIiilllIl;
   private final boolean IililllIllililllIl;
   private final int ilIilllIlIiIilllIl;
   private final boolean iIlilllIlIllilllIl;

   public boolean iIlIlllllill() {
      return this.IIlilllIllIlilllIl;
   }

   public int IliIlllilIi() {
      return this.ilIilllIlIiIilllIl;
   }

   public boolean IilliliilIIi() {
      return this.iIlilllIlIllilllIl;
   }

   public boolean lIiiIiIlilli() {
      return this.lllilllIlillilllIl;
   }

   public boolean liiiIIllIl() {
      return this.liIilllIliiIilllIl;
   }

   public boolean iliIiiliiiii() {
      return this.IililllIllililllIl;
   }

   public iIlIiiIllIii(int deltaY, boolean takeoffHeadroom, boolean dropEntryClear, boolean nextPassable, boolean nextStandable, boolean blockedMemory, boolean headroom, boolean supportBelowNext) {
      this.ilIilllIlIiIilllIl = deltaY;
      this.liIilllIliiIilllIl = takeoffHeadroom;
      this.IIlilllIllIlilllIl = dropEntryClear;
      this.iIlilllIlIllilllIl = nextPassable;
      this.lllilllIlillilllIl = nextStandable;
      this.IililllIllililllIl = blockedMemory;
      this.iililllIlIIiilllIl = headroom;
      this.lIiilllIliIiilllIl = supportBelowNext;
   }

   public iIlIiiIllIii(int blockedMemory, boolean nextPassable, boolean nextStandable, boolean headroom, boolean takeoffHeadroom, boolean supportBelowNext, boolean deltaY) {
      this(blockedMemory, nextPassable, nextStandable, headroom, takeoffHeadroom, supportBelowNext, deltaY, true);
   }

   public boolean IIIllIIliIIl() {
      return this.iililllIlIIiilllIl;
   }

   public iIlIiiIllIii(int deltaY, boolean headroom, boolean nextStandable, boolean blockedMemory, boolean nextPassable, boolean supportBelowNext) {
      this(deltaY, headroom, nextStandable, blockedMemory, nextPassable, supportBelowNext, true, true);
   }

   public boolean IlIlllIlilIl() {
      return this.lIiilllIliIiilllIl;
   }
}
