package gg.corz;

import java.util.Arrays;

public final class lliilIlliliilIll {
   private long IIlIllilll = Long.MIN_VALUE;
   private long iIlIllilll = Long.MIN_VALUE;
   private long IiIIllilll = Long.MIN_VALUE;
   private double iIIIllilll = (double)12.0F;
   private double IIIIllilll = (double)0.0F;
   private static final long lliiIlilll = 200L;
   private long ilIIllilll = Long.MIN_VALUE;
   private double lIIIllilll = (double)8.0F;
   private final int[] iiiiIlilll = new int[2];
   private final int[] IiiiIlilll = new int[2];
   private static final long IliiIlilll = Long.MIN_VALUE;
   private long lIlIllilll = Long.MIN_VALUE;
   public static final int liliIlilll = 1;
   public static final int IiliIlilll = 0;
   public static final int iiliIlilll = 2;
   private static final int iIiiIlilll = 1;
   private long liIIllilll = Long.MIN_VALUE;
   private final int[] liiiIlilll = new int[4];
   private static final int lIiiIlilll = 0;
   private long IlIIllilll = Long.MIN_VALUE;
   private final int[] iliiIlilll = new int[2];
   private long llIIllilll = Long.MIN_VALUE;
   private long iiIIllilll = Long.MIN_VALUE;
   public static final int IIiiIlilll = 3;

   public void lIiiIiIlilli(boolean inHole) {
      this.IIIIllilll = IiIIlliIIl(this.IIIIllilll + 0.02 * ((inHole ? (double)1.0F : (double)0.0F) - this.IIIIllilll), (double)0.0F, (double)1.0F);
   }

   public double Iiilliiliiil() {
      return this.iIIIllilll;
   }

   public double Illlllllilll() {
      return iIIIlIlIIl(this.IiiiIlilll);
   }

   private static void Iiiiliiiiiii(int[] i, int counts) {
      if (i[counts] < 1000000) {
         int var10002 = i[counts]++;
      }

   }

   public static int IliIlllilIi(double landingDy, double horizontalDistanceChange) {
      if (Double.isFinite(landingDy) && Double.isFinite(horizontalDistanceChange)) {
         if (landingDy < (double)-2.0F) {
            return 0;
         } else if (horizontalDistanceChange > (double)4.0F) {
            return 1;
         } else {
            return horizontalDistanceChange < (double)-4.0F ? 2 : 3;
         }
      } else {
         return -1;
      }
   }

   public lliiliiliili IlIillIiilIi() {
      return new lliiliiliili((int[])this.iliiIlilll.clone(), (int[])this.IiiiIlilll.clone(), (int[])this.liiiIlilll.clone(), this.IIIIllilll, this.lIIIllilll, this.iIIIllilll, (int[])this.iiiiIlilll.clone());
   }

   public void liiiIIllIl(long tick) {
      this.IIiilIiiiIii(tick);
      if (this.ilIIllilll == Long.MIN_VALUE) {
         this.llIIllilll = tick;
         this.ilIIllilll = tick;
      } else {
         this.llIIllilll = Math.min(this.llIIllilll, tick);
         this.ilIIllilll = Math.max(this.ilIIllilll, tick);
      }

   }

   private void Iilililiiili() {
      this.IlIIllilll = Long.MIN_VALUE;
      this.llIIllilll = Long.MIN_VALUE;
      this.ilIIllilll = Long.MIN_VALUE;
      this.IiIIllilll = Long.MIN_VALUE;
      this.liIIllilll = Long.MIN_VALUE;
      this.iiIIllilll = Long.MIN_VALUE;
      this.IIlIllilll = Long.MIN_VALUE;
      this.lIlIllilll = Long.MIN_VALUE;
      this.iIlIllilll = Long.MIN_VALUE;
   }

   public double IIIilIIiiIIi() {
      return iIIIlIlIIl(this.iiiiIlilll);
   }

   public double IIlllIlliIll() {
      return iIIIlIlIIl(this.iliiIlilll);
   }

   public int Iilllilliill() {
      long var3 = 6991523669597235854L;
      var3 ^= (4294967296L ^ var3) & -1L << 32;

      for(var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < this.liiiIlilll.length; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
         if (this.liiiIlilll[(int)var3] > this.liiiIlilll[(int)(var3 >>> 32)]) {
            var3 ^= ((long)((int)var3) << 32 ^ var3) & -1L << 32;
         }
      }

      return (int)(var3 >>> 32);
   }

   public void IilliliilIIi(long tick) {
      long var4 = 5784415041777326784L;
      this.IIiilIiiiIii(tick);
      var4 ^= ((long)(this.lIlIllilll != Long.MIN_VALUE && tick - this.lIlIllilll <= 20L ? 0 : 1) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) != 0 && this.iiIIllilll == Long.MIN_VALUE) {
         this.iiIIllilll = tick;
      }

      this.lIlIllilll = Math.max(this.lIlIllilll, tick);
   }

   private void IIiilIiiiIii(long tick) {
      if (this.IlIIllilll != Long.MIN_VALUE && tick < this.IlIIllilll - 200L) {
         this.Iilililiiili();
      }

      if (this.IlIIllilll == Long.MIN_VALUE || tick > this.IlIIllilll) {
         this.IlIIllilll = tick;
      }

      this.Iliilliiilii();
   }

   private static void IIIIllIIIl(int[] counts) {
      if (counts[1] > 0) {
         int var10002 = counts[1]--;
      }

      Iiiiliiiiiii(counts, 0);
   }

   private static double iIIIlIlIIl(int[] c) {
      return ((double)c[0] + (double)1.0F) / ((double)(c[0] + c[1]) + (double)2.0F);
   }

   private static void llIIlilIIl(int[] to, int[] from) {
      long var3 = -5037100867279230802L;
      if (to != null) {
         for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < from.length && (int)(var5 >>> 32) < to.length; var5 += 4294967296L) {
            from[(int)(var5 >>> 32)] = Math.max(0, Math.min(1000000, to[(int)(var5 >>> 32)]));
         }

      }
   }

   private void Iliilliiilii() {
      if (this.ilIIllilll != Long.MIN_VALUE && this.IlIIllilll - this.ilIIllilll > 20L) {
         Iiiiliiiiiii(this.iliiIlilll, 1);
         this.IiIIllilll = this.llIIllilll;
         this.liIIllilll = this.ilIIllilll;
         this.llIIllilll = Long.MIN_VALUE;
         this.ilIIllilll = Long.MIN_VALUE;
      }

      if (this.iiIIllilll != Long.MIN_VALUE && this.IlIIllilll - this.iiIIllilll > 40L) {
         Iiiiliiiiiii(this.IiiiIlilll, 1);
         this.IIlIllilll = this.iiIIllilll;
         this.iiIIllilll = Long.MIN_VALUE;
      }

      if (this.iIlIllilll != Long.MIN_VALUE && (double)(this.IlIIllilll - this.iIlIllilll) > (double)80.0F) {
         this.iIlIllilll = Long.MIN_VALUE;
      }

   }

   public double Ililllililil() {
      return this.lIIIllilll;
   }

   private static double IiIIlliIIl(double v, double lo, double hi) {
      return IiIIIlliIIIl.IIiilIiiiIii(v, lo, hi);
   }

   public void IiIlliIliiIl(boolean jumped) {
      Iiiiliiiiiii(this.iiiiIlilll, jumped ? 0 : 1);
   }

   private void Illillliilli() {
      Arrays.fill(this.iliiIlilll, 0);
      Arrays.fill(this.IiiiIlilll, 0);
      Arrays.fill(this.liiiIlilll, 0);
      Arrays.fill(this.iiiiIlilll, 0);
      this.IIIIllilll = (double)0.0F;
      this.lIIIllilll = (double)8.0F;
      this.iIIIllilll = (double)12.0F;
   }

   public double IIillIiliIil() {
      return this.IIIIllilll;
   }

   public void iliIiiliiiii(long tick) {
      this.IIiilIiiiIii(tick);
      this.iIlIllilll = Math.max(this.iIlIllilll, tick);
   }

   public void IIIllIIliIIl(long tick) {
      this.IIiilIiiiIii(tick);
      if (this.iIlIllilll != Long.MIN_VALUE && tick >= this.iIlIllilll) {
         double var3 = Math.min((double)40.0F, (double)(tick - this.iIlIllilll));
         this.lIIIllilll = IiIIlliIIl(this.lIIIllilll + 0.3 * (var3 - this.lIIIllilll), (double)0.0F, (double)40.0F);
         this.iIlIllilll = Long.MIN_VALUE;
      }
   }

   public void IiIiliIiiiIi(lliiliiliili s) {
      this.Illillliilli();
      this.IiIIllilll = Long.MIN_VALUE;
      this.liIIllilll = Long.MIN_VALUE;
      this.IIlIllilll = Long.MIN_VALUE;
      if (s != null) {
         llIIlilIIl(s.IliIlllilIi(), this.iliiIlilll);
         llIIlilIIl(s.liiiIIllIl(), this.IiiiIlilll);
         llIIlilIIl(s.iIlIlllllill(), this.liiiIlilll);
         llIIlilIIl(s.IIIllIIliIIl(), this.iiiiIlilll);
         this.IIIIllilll = IiIIIlliIIIl.Iliilliiilii(s.IilliliilIIi(), (double)0.0F, (double)1.0F, (double)0.0F);
         this.lIIIllilll = IiIIIlliIIIl.Iliilliiilii(s.lIiiIiIlilli(), (double)0.0F, (double)40.0F, (double)8.0F);
         this.iIIIllilll = IiIIIlliIIIl.Iliilliiilii(s.iliIiiliiiii(), (double)3.0F, (double)40.0F, (double)12.0F);
      }
   }

   public void IIlilIliiIli() {
      this.Illillliilli();
      this.Iilililiiili();
   }

   public void iIlIlllllill(long tick, boolean low, int directionBin) {
      if (this.IlIIllilll == Long.MIN_VALUE || tick > this.IlIIllilll) {
         this.IlIIllilll = tick;
      }

      this.Iliilliiilii();
      if (directionBin >= 0 && directionBin < this.liiiIlilll.length) {
         Iiiiliiiiiii(this.liiiIlilll, directionBin);
      }

      if (this.liIIllilll != Long.MIN_VALUE && tick >= this.IiIIllilll && tick - this.liIIllilll <= 20L) {
         IIIIllIIIl(this.iliiIlilll);
         this.IiIIllilll = Long.MIN_VALUE;
         this.liIIllilll = Long.MIN_VALUE;
      } else if (this.ilIIllilll != Long.MIN_VALUE && tick >= this.llIIllilll) {
         Iiiiliiiiiii(this.iliiIlilll, 0);
         this.llIIllilll = Long.MIN_VALUE;
         this.ilIIllilll = Long.MIN_VALUE;
      }

      long var5 = low ? 20L : 0L;
      if (this.IIlIllilll != Long.MIN_VALUE && tick >= this.IIlIllilll - var5 && tick - this.IIlIllilll <= 40L) {
         IIIIllIIIl(this.IiiiIlilll);
         this.IIlIllilll = Long.MIN_VALUE;
      } else if (this.iiIIllilll != Long.MIN_VALUE && tick >= this.iiIIllilll - var5) {
         Iiiiliiiiiii(this.IiiiIlilll, 0);
         this.iiIIllilll = Long.MIN_VALUE;
      } else if (low && (this.lIlIllilll == Long.MIN_VALUE || tick - this.lIlIllilll > 20L)) {
         Iiiiliiiiiii(this.IiiiIlilll, 0);
      }

      if (low) {
         this.lIlIllilll = Math.max(this.lIlIllilll, tick);
      }

   }

   public void IlIlllIlilIl(double ticks) {
      if (Double.isFinite(ticks) && !(ticks <= (double)0.0F) && !(ticks > (double)80.0F)) {
         double var3 = IiIIlliIIl(ticks, (double)3.0F, (double)40.0F);
         this.iIIIllilll = IiIIlliIIl(this.iIIIllilll + 0.3 * (var3 - this.iIIIllilll), (double)3.0F, (double)40.0F);
      }
   }
}
