package gg.corz;

import java.util.Set;

public record IIiiiiillIiiiiil(long root, Set<Long> members, int attemptsThisEpoch, long epoch, int failuresTotal) {
   private final Set<Long> IiIIliIiil;
   private final int liIIliIiil;
   private final long iiIIliIiil;
   private final long ilIIliIiil;
   private final int IIlIliIiil;

   public int lIiiIiIlilli() {
      return this.IIlIliIiil;
   }

   public long IliIlllilIi() {
      return this.ilIIliIiil;
   }

   public IIiiiiillIiiiiil(long root, Set<Long> epoch, int attemptsThisEpoch, long failuresTotal, int members) {
      this.ilIIliIiil = root;
      this.IiIIliIiil = epoch;
      this.liIIliIiil = attemptsThisEpoch;
      this.iiIIliIiil = failuresTotal;
      this.IIlIliIiil = members;
   }

   public int iIlIlllllill() {
      return this.liIIliIiil;
   }

   public Set<Long> liiiIIllIl() {
      return this.IiIIliIiil;
   }

   public long IilliliilIIi() {
      return this.iiIIliIiil;
   }
}
