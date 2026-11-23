package gg.corz;

public record illlIiIillIi<P>(P plan, int provenMemberIndex, boolean dependencyChainProven) implements IlllIillllIi<P> {
   private final P lilllIIIliilllIIIl;
   private final boolean iIillIIIlIlillIIIl;
   private final int IIillIIIllIillIIIl;

   public illlIiIillIi(P provenMemberIndex, int dependencyChainProven, boolean plan) {
      this.lilllIIIliilllIIIl = provenMemberIndex;
      this.IIillIIIllIillIIIl = dependencyChainProven;
      this.iIillIIIlIlillIIIl = plan;
   }

   public int Iilllilliill() {
      return this.IIillIIIllIillIIIl;
   }

   public boolean IliIlllilIi() {
      return this.iIillIIIlIlillIIIl;
   }

   public P IIIllIIliIIl() {
      return this.lilllIIIliilllIIIl;
   }
}
