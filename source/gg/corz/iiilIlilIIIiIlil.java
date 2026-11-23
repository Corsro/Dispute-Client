package gg.corz;

public record iiilIlilIIIiIlil(double[] rings, int angles, int solveGoals, double threatShare, double maxDy, boolean los, double pitchLo, double pitchHi, double maxAbove, double maxBelow, int[] levels, boolean lowFirst) {
   private final double[] IIIIiIiIil;
   private final double llIIiIiIil;
   private final boolean iIlIiIiIil;
   private final int iIIIiIiIil;
   private final double iiIIiIiIil;
   private final double liIIiIiIil;
   private final double IiIIiIiIil;
   private final double IlIIiIiIil;
   private final boolean ilIIiIiIil;
   private final double IIlIiIiIil;
   public static final iiilIlilIIIiIlil IllIiIiIil;
   private final int[] lIlIiIiIil;
   private final int lIIIiIiIil;

   public double Iilllilliill() {
      return this.llIIiIiIil;
   }

   public double Iiilliiliiil() {
      return this.liIIiIiIil;
   }

   public double Ililllililil() {
      return this.IiIIiIiIil;
   }

   public double Illlllllilll() {
      return this.IlIIiIiIil;
   }

   public static iiilIlilIIIiIlil lIiiIiIlilli(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.IiIliIiiliIliIii, 16, 6, threatShare, (double)2.5F, true, (double)-80.0F, (double)88.0F, (double)2.5F, (double)2.5F, Iiiiilliiiil.lIiiiIiiiIiiiIii, true);
   }

   public int IIlllIlliIll() {
      return this.iIIIiIiIil;
   }

   public double IlIillIiilIi() {
      return this.IIlIiIiIil;
   }

   public double IIIilIIiiIIi() {
      return this.iiIIiIiIil;
   }

   public static iiilIlilIIIiIlil IilliliilIIi(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.iIiliIiiIliliIii, 16, 6, threatShare, (double)1.0F, true, (double)-80.0F, (double)60.0F, 0.3, (double)2.5F, Iiiiilliiiil.lIiiiIiiiIiiiIii, true);
   }

   public double[] IliIlllilIi() {
      return (double[])this.IIIIiIiIil.clone();
   }

   public static iiilIlilIIIiIlil IIIllIIliIIl(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.lliIIliiiliIIlii, 16, 6, threatShare, (double)2.5F, true, (double)-60.0F, (double)60.0F, 0.3, (double)2.5F, Iiiiilliiiil.IiiIIliiliiIIlii, true);
   }

   public static iiilIlilIIIiIlil iliIiiliiiii(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.iIiliIiiIliliIii, 16, 6, threatShare, (double)3.0F, true, (double)-80.0F, (double)88.0F, 0.3, (double)3.0F, Iiiiilliiiil.iliiiIiiIiiiiIii, true);
   }

   public boolean IIillIiliIil() {
      return this.ilIIiIiIil;
   }

   public iiilIlilIIIiIlil(double[] pitchHi, int los, int maxDy, double threatShare, double rings, boolean solveGoals, double angles, double pitchLo) {
      this(pitchHi, los, maxDy, threatShare, rings, solveGoals, angles, pitchLo, rings, rings, Iiiiilliiiil.iIIliIiiIlIliIii, false);
   }

   public iiilIlilIIIiIlil(double[] pitchLo, int maxBelow, int los, double solveGoals, double rings, boolean angles, double lowFirst, double maxDy, double levels, double threatShare, int[] maxAbove, boolean pitchHi) {
      pitchLo = pitchLo == null ? new double[0] : (double[])(([D)pitchLo).clone();
      maxBelow = Math.max(1, maxBelow);
      los = Math.max(1, los);
      if (!Double.isFinite(lowFirst)) {
         lowFirst = (double)-38.0F;
      }

      if (!Double.isFinite(maxDy)) {
         maxDy = (double)30.0F;
      }

      if (lowFirst > maxDy) {
         double var19 = lowFirst;
         lowFirst = maxDy;
         maxDy = var19;
      }

      if (Double.isNaN(levels)) {
         levels = rings;
      }

      if (Double.isNaN(threatShare)) {
         threatShare = rings;
      }

      maxAbove = maxAbove != null && maxAbove.length != 0 ? (int[])(([I)maxAbove).clone() : (int[])Iiiiilliiiil.iIIliIiiIlIliIii.clone();
      this.IIIIiIiIil = pitchLo;
      this.lIIIiIiIil = maxBelow;
      this.iIIIiIiIil = los;
      this.IlIIiIiIil = solveGoals;
      this.llIIiIiIil = rings;
      this.ilIIiIiIil = angles;
      this.IiIIiIiIil = lowFirst;
      this.liIIiIiIil = maxDy;
      this.iiIIiIiIil = levels;
      this.IIlIiIiIil = threatShare;
      this.lIlIiIiIil = maxAbove;
      this.iIlIiIiIil = pitchHi;
   }

   public static iiilIlilIIIiIlil iIlIlllllill(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.IiIliIiiliIliIii, 16, 5, threatShare, (double)1.0F, true, (double)-38.0F, (double)30.0F, 0.3, (double)2.5F, Iiiiilliiiil.lIiiiIiiiIiiiIii, true);
   }

   public iiilIlilIIIiIlil(double[] maxDy, int angles, int los, double threatShare, double solveGoals, boolean rings) {
      this(maxDy, angles, los, threatShare, solveGoals, rings, (double)-38.0F, (double)30.0F);
   }

   public static iiilIlilIIIiIlil IlIlllIlilIl(double threatShare) {
      return new iiilIlilIIIiIlil(Iiiiilliiiil.iIiliIiiIliliIii, 16, 6, threatShare, (double)2.5F, true, (double)-89.0F, (double)88.0F, 0.3, (double)2.5F, Iiiiilliiiil.liiiiIiiiiiiiIii, true);
   }

   public int[] liiiIIllIl() {
      return (int[])this.lIlIiIiIil.clone();
   }

   public boolean IiIiliIiiiIi() {
      return this.iIlIiIiIil;
   }

   public int IiIlliIliiIl() {
      return this.lIIIiIiIil;
   }

   static {
      IllIiIiIil = new iiilIlilIIIiIlil(Iiiiilliiiil.ilIIiIiiIiIIiIii, 12, 3, (double)0.5F, Double.POSITIVE_INFINITY, false);
   }
}
