package gg.corz;

import java.util.List;

public record illilllIililll(int routeIndex, double bestDistance, double bestVerticalDistance, int lastProgressTick, int noProgressTicks, int cycleRepeats, int localRecoveries, lllIIIiillIIIi progressKind, List<Long> recentFeet) {
   private final List<Long> lIllllIIiiIllllIIi;
   private final int IiIlllIIiliIlllIIi;
   private final int IliIllIIilliIllIIi;
   private final double iliIllIIiIiiIllIIi;
   private final int llIlllIIiilIlllIIi;
   private final int iIIlllIIiIlIlllIIi;
   private final double liiIllIIiiiiIllIIi;
   private final int IIIlllIIilIIlllIIi;
   private final lllIIIiillIIIi iiIlllIIiIIllllIIi;

   public int IilliliilIIi() {
      return this.IIIlllIIilIIlllIIi;
   }

   public double liiiIIllIl() {
      return this.iliIllIIiIiiIllIIi;
   }

   public int IliIlllilIi() {
      return this.IliIllIIilliIllIIi;
   }

   public int IIIllIIliIIl() {
      return this.IiIlllIIiliIlllIIi;
   }

   public List<Long> IiIlliIliiIl() {
      return this.lIllllIIiiIllllIIi;
   }

   public illilllIililll(int localRecoveries, double bestVerticalDistance, double lastProgressTick, int bestDistance, int routeIndex, int cycleRepeats, int recentFeet, lllIIIiillIIIi progressKind, List<Long> noProgressTicks) {
      this.IliIllIIilliIllIIi = localRecoveries;
      this.iliIllIIiIiiIllIIi = bestVerticalDistance;
      this.liiIllIIiiiiIllIIi = lastProgressTick;
      this.IIIlllIIilIIlllIIi = bestDistance;
      this.iIIlllIIiIlIlllIIi = routeIndex;
      this.llIlllIIiilIlllIIi = cycleRepeats;
      this.IiIlllIIiliIlllIIi = recentFeet;
      this.iiIlllIIiIIllllIIi = progressKind;
      this.lIllllIIiiIllllIIi = noProgressTicks;
   }

   public int iliIiiliiiii() {
      return this.llIlllIIiilIlllIIi;
   }

   public double iIlIlllllill() {
      return this.liiIllIIiiiiIllIIi;
   }

   public lllIIIiillIIIi IlIlllIlilIl() {
      return this.iiIlllIIiIIllllIIi;
   }

   public int lIiiIiIlilli() {
      return this.iIIlllIIiIlIlllIIi;
   }
}
