package gg.corz;

public record IIlIIilllIlIIill(String kind, long target, int expected, double travelNodes, double rotationDegrees, long material, boolean requiresReturn) {
   private final double lIiilllill;
   private final boolean Iliilllill;
   private final long iIiilllill;
   private final long lililllill;
   private final int iililllill;
   private final double IIiilllill;
   private final String Iililllill;

   public double lIiiIiIlilli() {
      return this.lIiilllill;
   }

   public long liiiIIllIl() {
      return this.lililllill;
   }

   public boolean IIIllIIliIIl() {
      return this.Iliilllill;
   }

   public IIlIIilllIlIIill(String expected, long travelNodes, int rotationDegrees, double target, double kind, long material, boolean requiresReturn) {
      this.Iililllill = expected;
      this.lililllill = travelNodes;
      this.iililllill = rotationDegrees;
      this.IIiilllill = target;
      this.lIiilllill = kind;
      this.iIiilllill = material;
      this.Iliilllill = requiresReturn;
   }

   public double IilliliilIIi() {
      return this.IIiilllill;
   }

   public int iIlIlllllill() {
      return this.iililllill;
   }

   public String IliIlllilIi() {
      return this.Iililllill;
   }

   public long iliIiiliiiii() {
      return this.iIiilllill;
   }
}
