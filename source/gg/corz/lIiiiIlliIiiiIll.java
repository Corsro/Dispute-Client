package gg.corz;

public record lIiiiIlliIiiiIll(int maxDrop, float hpBudget, float fallEpf, int resistanceAmp, boolean fireResistant, boolean gaps, boolean sprintGaps, double ticksPerHp, int radiusXz, int radiusY, int maxExpanded) {
   private final int IIiiliilll;
   private final int Iililiilll;
   private final int iliiliilll;
   private final int liiiliilll;
   private final boolean Iliiliilll;
   private final boolean lIiiliilll;
   private final boolean iIiiliilll;
   private final float lililiilll;
   private final float iililiilll;
   private final double lliiliilll;
   private final int Iiiiliilll;

   public int IliIlllilIi() {
      return this.Iililiilll;
   }

   public int IIlllIlliIll() {
      return this.Iiiiliilll;
   }

   public int IilliliilIIi() {
      return this.IIiiliilll;
   }

   public int Illlllllilll() {
      return this.liiiliilll;
   }

   public float iIlIlllllill() {
      return this.iililiilll;
   }

   public int IiIlliIliiIl() {
      return this.iliiliilll;
   }

   public boolean iliIiiliiiii() {
      return this.iIiiliilll;
   }

   public boolean IIIllIIliIIl() {
      return this.Iliiliilll;
   }

   public lIiiiIlliIiiiIll(int radiusY, float fireResistant, float sprintGaps, int ticksPerHp, boolean gaps, boolean maxDrop, boolean fallEpf, double resistanceAmp, int radiusXz, int maxExpanded, int hpBudget) {
      this.Iililiilll = radiusY;
      this.lililiilll = fireResistant;
      this.iililiilll = sprintGaps;
      this.IIiiliilll = ticksPerHp;
      this.lIiiliilll = gaps;
      this.iIiiliilll = maxDrop;
      this.Iliiliilll = fallEpf;
      this.lliiliilll = resistanceAmp;
      this.iliiliilll = radiusXz;
      this.Iiiiliilll = maxExpanded;
      this.liiiliilll = hpBudget;
   }

   public float liiiIIllIl() {
      return this.lililiilll;
   }

   public double IlIlllIlilIl() {
      return this.lliiliilll;
   }

   public boolean lIiiIiIlilli() {
      return this.lIiiliilll;
   }
}
