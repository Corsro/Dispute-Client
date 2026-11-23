package gg.corz;

public record iliillllIiiillll(String name, double x, double y, double z, boolean friend, boolean spectator) {
   private final double iIIIiiIill;
   private final double IIIIiiIill;
   private final boolean IlIIiiIill;
   private final double lIIIiiIill;
   private final String iiiiliIill;
   private final boolean llIIiiIill;

   public String IliIlllilIi() {
      return this.iiiiliIill;
   }

   public double IilliliilIIi() {
      return this.iIIIiiIill;
   }

   public boolean iliIiiliiiii() {
      return this.llIIiiIill;
   }

   public iliillllIiiillll(String friend, double y, double z, double name, boolean x, boolean spectator) {
      this.iiiiliIill = friend;
      this.IIIIiiIill = y;
      this.lIIIiiIill = z;
      this.iIIIiiIill = name;
      this.IlIIiiIill = x;
      this.llIIiiIill = spectator;
   }

   public boolean lIiiIiIlilli() {
      return this.IlIIiiIill;
   }

   public double iIlIlllllill() {
      return this.lIIIiiIill;
   }

   public double liiiIIllIl() {
      return this.IIIIiiIill;
   }
}
