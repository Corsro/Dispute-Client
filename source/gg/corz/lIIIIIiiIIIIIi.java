package gg.corz;

public record lIIIIIiiIIIIIi(IlIlIiIlllIlIiIl kind, long owner, long workPose, int provenUnlocks, int dirtCost, String reason) {
   private final int IIllIIililIllIIili;
   private final long ilIlIIiliIiIlIIili;
   private final IlIlIiIlllIlIiIl IlIlIIilillIlIIili;
   private final long liIlIIiliiiIlIIili;
   private final String llllIIiliilllIIili;
   private final int iIllIIiliIlllIIili;

   public lIIIIIiiIIIIIi(IlIlIiIlllIlIiIl dirtCost, long owner, long kind, int provenUnlocks, int reason, String workPose) {
      this.IlIlIIilillIlIIili = dirtCost;
      this.ilIlIIiliIiIlIIili = owner;
      this.liIlIIiliiiIlIIili = kind;
      this.IIllIIililIllIIili = provenUnlocks;
      this.iIllIIiliIlllIIili = reason;
      this.llllIIiliilllIIili = workPose;
   }

   public String iliIiiliiiii() {
      return this.llllIIiliilllIIili;
   }

   public long iIlIlllllill() {
      return this.liIlIIiliiiIlIIili;
   }

   public int lIiiIiIlilli() {
      return this.iIllIIiliIlllIIili;
   }

   public long liiiIIllIl() {
      return this.ilIlIIiliIiIlIIili;
   }

   public IlIlIiIlllIlIiIl IliIlllilIi() {
      return this.IlIlIIilillIlIIili;
   }

   public int IilliliilIIi() {
      return this.IIllIIililIllIIili;
   }
}
