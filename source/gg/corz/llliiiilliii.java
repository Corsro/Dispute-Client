package gg.corz;

public record llliiiilliii(int tick, boolean sneaking, int sneakTicks, boolean exactRay, boolean dirtPresent, boolean targetReplaceable, boolean supportPreserved) {
   private final boolean IliIlIiIllliIlIiIl;
   private final boolean liiIlIiIliiiIlIiIl;
   private final int iilIlIiIlIIiIlIiIl;
   private final int lllIlIiIlillIlIiIl;
   private final boolean iliIlIiIlIiiIlIiIl;
   private final boolean lIiIlIiIliIiIlIiIl;
   private final boolean IilIlIiIllilIlIiIl;

   public boolean lIiiIiIlilli() {
      return this.IliIlIiIllliIlIiIl;
   }

   public llliiiilliii(int supportPreserved, boolean dirtPresent, int tick, boolean targetReplaceable, boolean sneakTicks, boolean exactRay, boolean sneaking) {
      this.lllIlIiIlillIlIiIl = supportPreserved;
      this.IilIlIiIllilIlIiIl = dirtPresent;
      this.iilIlIiIlIIiIlIiIl = tick;
      this.lIiIlIiIliIiIlIiIl = targetReplaceable;
      this.IliIlIiIllliIlIiIl = sneakTicks;
      this.iliIlIiIlIiiIlIiIl = exactRay;
      this.liiIlIiIliiiIlIiIl = sneaking;
   }

   public boolean iliIiiliiiii() {
      return this.iliIlIiIlIiiIlIiIl;
   }

   public boolean liiiIIllIl() {
      return this.IilIlIiIllilIlIiIl;
   }

   public boolean IIIllIIliIIl() {
      return this.liiIlIiIliiiIlIiIl;
   }

   public int iIlIlllllill() {
      return this.iilIlIiIlIIiIlIiIl;
   }

   public boolean IilliliilIIi() {
      return this.lIiIlIiIliIiIlIiIl;
   }

   public int IliIlllilIi() {
      return this.lllIlIiIlillIlIiIl;
   }
}
