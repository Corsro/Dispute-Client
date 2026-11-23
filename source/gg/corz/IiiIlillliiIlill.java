package gg.corz;

public record IiiIlillliiIlill(String name, double x, double y, double z, double dist, double closing, long firstSeenTick) {
   private final double llilIIiill;
   private final long liilIIiill;
   private final double IiilIIiill;
   private final double IlilIIiill;
   private final double ililIIiill;
   private final double iIilIIiill;
   private final String lIilIIiill;

   public double iliIiiliiiii() {
      return this.IiilIIiill;
   }

   public double lIiiIiIlilli() {
      return this.ililIIiill;
   }

   public double liiiIIllIl() {
      return this.iIilIIiill;
   }

   public long IIIllIIliIIl() {
      return this.liilIIiill;
   }

   public String IliIlllilIi() {
      return this.lIilIIiill;
   }

   public double iIlIlllllill() {
      return this.IlilIIiill;
   }

   public double IilliliilIIi() {
      return this.llilIIiill;
   }

   public IiiIlillliiIlill(String firstSeenTick, double x, double z, double name, double y, double dist, long closing) {
      this.lIilIIiill = firstSeenTick;
      this.iIilIIiill = x;
      this.IlilIIiill = z;
      this.llilIIiill = name;
      this.ililIIiill = y;
      this.IiilIIiill = dist;
      this.liilIIiill = closing;
   }
}
