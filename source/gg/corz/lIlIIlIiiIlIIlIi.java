package gg.corz;

public record lIlIIlIiiIlIIlIi<P>(llIiiIililIiiIil reason, int provenMemberIndex, boolean dependencyChainProven) implements IlllIillllIi<P> {
   private final llIiiIililIiiIil iliIiiiiil;
   private final boolean liiIiiiiil;
   private final int IiiIiiiiil;

   public lIlIIlIiiIlIIlIi(llIiiIililIiiIil dependencyChainProven, int provenMemberIndex, boolean reason) {
      this.iliIiiiiil = dependencyChainProven;
      this.IiiIiiiiil = provenMemberIndex;
      this.liiIiiiiil = reason;
   }

   public boolean IliIlllilIi() {
      return this.liiIiiiiil;
   }

   public llIiiIililIiiIil IlIlllIlilIl() {
      return this.iliIiiiiil;
   }

   public int Iilllilliill() {
      return this.IiiIiiiiil;
   }
}
