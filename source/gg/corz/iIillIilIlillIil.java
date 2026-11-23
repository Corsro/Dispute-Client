package gg.corz;

public record iIillIilIlillIil(int x, int y, int z, double rel, double value, double dist, double eta, String state, boolean high) {
   private final String IIlliIlIil;
   private final int llIliIlIil;
   private final double liIliIlIil;
   private final double iiIliIlIil;
   private final boolean lIlliIlIil;
   private final int iIIliIlIil;
   private final double IiIliIlIil;
   private final double ilIliIlIil;
   private final int IlIliIlIil;

   public double IlIlllIlilIl() {
      return this.IiIliIlIil;
   }

   public boolean iIlIlllllill(int cx, int cy, int cz) {
      return this.iIIliIlIil == cx && this.IlIliIlIil == cy && this.llIliIlIil == cz;
   }

   public int lIiiIiIlilli() {
      return this.IlIliIlIil;
   }

   public double liiiIIllIl() {
      return (double)this.llIliIlIil + (double)0.5F;
   }

   public iIillIilIlillIil(int state, int z, int y, double x, double value, double eta, double dist, String rel) {
      this(state, z, y, x, value, eta, dist, rel, false);
   }

   public double IiIlliIliiIl() {
      return this.liIliIlIil;
   }

   public double IIIllIIliIIl() {
      return this.ilIliIlIil;
   }

   public double IliIlllilIi() {
      return (double)this.iIIliIlIil + (double)0.5F;
   }

   public String Illlllllilll() {
      return this.IIlliIlIil;
   }

   public boolean Iilllilliill() {
      return this.lIlliIlIil;
   }

   public double IIlllIlliIll() {
      return this.iiIliIlIil;
   }

   public iIillIilIlillIil(int value, int high, int x, double dist, double z, double y, double eta, String state, boolean rel) {
      this.iIIliIlIil = value;
      this.IlIliIlIil = high;
      this.llIliIlIil = x;
      this.ilIliIlIil = dist;
      this.IiIliIlIil = z;
      this.liIliIlIil = y;
      this.iiIliIlIil = eta;
      this.IIlliIlIil = state;
      this.lIlliIlIil = rel;
   }

   public int iliIiiliiiii() {
      return this.llIliIlIil;
   }

   public int IilliliilIIi() {
      return this.iIIliIlIil;
   }
}
