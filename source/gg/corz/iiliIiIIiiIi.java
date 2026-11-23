package gg.corz;

public record iiliIiIIiiIi(double x, int y, double z, double gain, double turn) {
   private final double lIllIlIIliIllIlIIl;
   private final double IiIlIlIIlliIlIlIIl;
   private final double illlIlIIlIillIlIIl;
   private final double IlllIlIIlllllIlIIl;
   private final int iiIlIlIIlIIllIlIIl;

   public double IliIlllilIi() {
      return this.IiIlIlIIlliIlIlIIl;
   }

   public iiliIiIIiiIi(double turn, int z, double y, double gain, double x) {
      this.IiIlIlIIlliIlIlIIl = turn;
      this.iiIlIlIIlIIllIlIIl = z;
      this.lIllIlIIliIllIlIIl = y;
      this.IlllIlIIlllllIlIIl = gain;
      this.illlIlIIlIillIlIIl = x;
   }

   public double IilliliilIIi() {
      return this.IlllIlIIlllllIlIIl;
   }

   public int liiiIIllIl() {
      return this.iiIlIlIIlIIllIlIIl;
   }

   public double lIiiIiIlilli() {
      return this.illlIlIIlIillIlIIl;
   }

   public double iIlIlllllill() {
      return this.lIllIlIIliIllIlIIl;
   }
}
