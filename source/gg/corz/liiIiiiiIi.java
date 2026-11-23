package gg.corz;

public record liiIiiiiIi(long cell, long stand, iIlIililIllIilil pose, int dirX, int dirZ) {
   private final int IiliIiililiIii;
   private final long IIliIiilIliIii;
   private final int iiliIiiIIiiIii;
   private final long iIliIiiIlliIii;
   private final iIlIililIllIilil llliIiiilliIii;

   public int lIiiIiIlilli() {
      return this.iiliIiiIIiiIii;
   }

   public liiIiiiiIi(long dirZ, long stand, iIlIililIllIilil dirX, int cell, int pose) {
      this.IIliIiilIliIii = dirZ;
      this.iIliIiiIlliIii = stand;
      this.llliIiiilliIii = dirX;
      this.IiliIiililiIii = cell;
      this.iiliIiiIIiiIii = pose;
   }

   public long liiiIIllIl() {
      return this.iIliIiiIlliIii;
   }

   public long IliIlllilIi() {
      return this.IIliIiilIliIii;
   }

   public int IilliliilIIi() {
      return this.IiliIiililiIii;
   }

   public iIlIililIllIilil iIlIlllllill() {
      return this.llliIiiilliIii;
   }
}
