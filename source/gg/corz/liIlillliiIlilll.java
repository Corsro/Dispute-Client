package gg.corz;

public final class liIlillliiIlilll {
   private long lllilIlill = Long.MIN_VALUE;
   private final long[] lililIlill = new long[8];
   private static final long lIlilIlill = 1000000000L;
   private static final long IIlilIlill = 100000L;
   public static final long iiIilIlill = 50000000L;
   private double illilIlill = (double)-1.0F;
   private static final double iIlilIlill = 0.7;
   private long IllilIlill = Long.MIN_VALUE;
   private double IililIlill;
   private int iililIlill;
   private int IIiilIlill;

   public synchronized boolean IilliliilIIi(long nominalNanos) {
      if (this.illilIlill <= (double)0.0F) {
         return false;
      } else {
         long var3 = nominalNanos > 0L ? nominalNanos : 50000000L;
         return this.illilIlill > (double)var3 * 1.3 || this.IililIlill > (double)Math.max(var3, 25000000L);
      }
   }

   public synchronized long IIIllIIliIIl(long nominalNanos) {
      long var3 = nominalNanos > 0L ? nominalNanos : 50000000L;
      double var5 = this.illilIlill > (double)0.0F ? Math.max(this.illilIlill, (double)var3 * (double)0.25F) : (double)Math.max(var3, 50000000L);
      return (long)Math.min(var5, (double)1.0E9F);
   }

   public synchronized long lIiiIiIlilli() {
      return (long)this.IililIlill;
   }

   public synchronized boolean iliIiiliiiii() {
      return this.illilIlill > (double)0.0F;
   }

   public synchronized void IliIlllilIi(long nowNanos, long worldTime) {
      this.lililIlill[this.iililIlill] = nowNanos;
      this.iililIlill = (this.iililIlill + 1) % this.lililIlill.length;
      if (this.IIiilIlill < this.lililIlill.length) {
         ++this.IIiilIlill;
      }

      if (this.lllilIlill != Long.MIN_VALUE) {
         if (worldTime < this.lllilIlill) {
            this.illilIlill = (double)-1.0F;
            this.IililIlill = (double)0.0F;
         } else if (worldTime > this.lllilIlill && nowNanos > this.IllilIlill) {
            double var5 = (double)(nowNanos - this.IllilIlill) / (double)(worldTime - this.lllilIlill);
            var5 = Math.max((double)100000.0F, Math.min((double)1.0E9F, var5));
            double var7 = this.illilIlill > (double)0.0F ? Math.min((double)1.0E9F, (double)(nowNanos - this.IllilIlill) - this.illilIlill * (double)(worldTime - this.lllilIlill)) : (double)0.0F;
            this.IililIlill = Math.max(Math.max((double)0.0F, var7), this.IililIlill * 0.7);
            this.illilIlill = this.illilIlill < (double)0.0F ? var5 : this.illilIlill * 0.6 + var5 * 0.4;
         }
      }

      this.IllilIlill = nowNanos;
      this.lllilIlill = worldTime;
   }

   public synchronized void liiiIIllIl() {
      this.IllilIlill = Long.MIN_VALUE;
      this.lllilIlill = Long.MIN_VALUE;
      this.illilIlill = (double)-1.0F;
      this.IililIlill = (double)0.0F;
      this.iililIlill = 0;
      this.IIiilIlill = 0;
   }

   public synchronized int iIlIlllllill(long nanos) {
      long var5 = 5436491244155207402L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < this.IIiilIlill; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
         if (this.lililIlill[Math.floorMod(this.iililIlill - 1 - (int)var5, this.lililIlill.length)] > nanos) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }
}
