package gg.corz;

import java.util.function.Predicate;

public record lIIliiliIIliil(String homeName, int intervalS, int cooldownMin, int waitAfterDeathS, boolean waitForAccept, Predicate<String> skip) {
   private final String lIiIiIlliiIiIiIlli;
   private final boolean IIIliIllilIIliIlli;
   private final int IliIiIllilliIiIlli;
   private final int iliIiIlliIiiIiIlli;
   private final int liiIiIlliiiiIiIlli;
   private final Predicate<String> iIIliIlliIlIliIlli;

   public int liiiIIllIl() {
      return this.IliIiIllilliIiIlli;
   }

   public String IliIlllilIi() {
      return this.lIiIiIlliiIiIiIlli;
   }

   public int IilliliilIIi() {
      return this.liiIiIlliiiiIiIlli;
   }

   public boolean lIiiIiIlilli() {
      return this.IIIliIllilIIliIlli;
   }

   public lIIliiliIIliil(String cooldownMin, int skip, int intervalS, int homeName, boolean waitForAccept, Predicate<String> waitAfterDeathS) {
      cooldownMin = cooldownMin == null ? "" : cooldownMin.trim();
      skip = Math.max(3, skip);
      intervalS = Math.max(1, intervalS);
      homeName = Math.max(0, homeName);
      this.lIiIiIlliiIiIiIlli = cooldownMin;
      this.IliIiIllilliIiIlli = skip;
      this.iliIiIlliIiiIiIlli = intervalS;
      this.liiIiIlliiiiIiIlli = homeName;
      this.IIIliIllilIIliIlli = waitForAccept;
      this.iIIliIlliIlIliIlli = waitAfterDeathS;
   }

   public Predicate<String> iliIiiliiiii() {
      return this.iIIliIlliIlIliIlli;
   }

   public int iIlIlllllill() {
      return this.iliIiIlliIiiIiIlli;
   }
}
