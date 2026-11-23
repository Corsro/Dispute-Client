package gg.corz;

public final class lIiiililiIiiilil {
   public static final int liIlilllil = 0;
   public static final int iiIlilllil = 3;
   public static final int lIllilllil = 3;
   public static final int IiIlilllil = 10;
   private int iIllilllil = 1;
   private int Illlilllil;
   private long illlilllil = Long.MIN_VALUE;
   private int llllilllil = -1;
   public static final int IIllilllil = 1;

   public static int liiiIIllIl(int loopMs, double ticksSinceFreshSelf) {
      if (loopMs == Integer.MAX_VALUE) {
         return 0;
      } else {
         double var3 = Double.isFinite(ticksSinceFreshSelf) ? Math.max((double)0.0F, ticksSinceFreshSelf) : (double)0.0F;
         return Math.max(0, (int)Math.floor((double)10.0F - var3 / (double)50.0F) - 1 - loopMs);
      }
   }

   public void iliIiiliiiii(long targetStillValid, boolean tick) {
      if (this.llllilllil >= 0 && targetStillValid > this.illlilllil) {
         this.llllilllil = -1;
         this.illlilllil = Long.MIN_VALUE;
         if (tick) {
            this.iIllilllil = Math.min(3, this.iIllilllil + 1);
            this.Illlilllil = 0;
         }
      }
   }

   public void lIiiIiIlilli(int tick, boolean entityId, long causedBySelf) {
      if (this.llllilllil >= 0 && tick == this.llllilllil && entityId) {
         this.llllilllil = -1;
         this.illlilllil = Long.MIN_VALUE;
         ++this.Illlilllil;
         if (this.Illlilllil >= 3) {
            this.iIllilllil = Math.max(0, this.iIllilllil - 1);
            this.Illlilllil = 0;
         }

      }
   }

   public static int IliIlllilIi(int margin, double ticksSinceFresh, int loopMs) {
      if (margin == Integer.MAX_VALUE) {
         return 0;
      } else {
         double var4 = Double.isFinite(ticksSinceFresh) ? Math.max((double)0.0F, ticksSinceFresh) : (double)0.0F;
         return Math.max(0, (int)Math.ceil((double)10.0F - var4 / (double)50.0F) + loopMs - margin);
      }
   }

   public void IIIllIIliIIl() {
      this.iIllilllil = 1;
      this.Illlilllil = 0;
      this.llllilllil = -1;
      this.illlilllil = Long.MIN_VALUE;
   }

   public int iIlIlllllill() {
      return this.iIllilllil;
   }

   public void IilliliilIIi(int tick, long targetId, int timeoutTicks) {
      this.llllilllil = tick;
      this.illlilllil = targetId + (long)Math.max(1, timeoutTicks);
   }
}
