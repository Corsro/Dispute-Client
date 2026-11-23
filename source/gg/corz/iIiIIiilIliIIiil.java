package gg.corz;

public final class iIiIIiilIliIIiil {
   private float iiiIlillil;
   private double llIllillil;
   private double lIIllillil;
   private float liiIlillil;
   private boolean IiiIlillil;
   private boolean iIIllillil;
   private double IIIllillil = (double)2.0F;
   private double IlIllillil;

   public boolean iIlIlllllill() {
      return this.IiiIlillil;
   }

   public void liiiIIllIl() {
      this.IiiIlillil = false;
      this.IlIllillil = (double)0.0F;
      this.llIllillil = (double)0.0F;
   }

   public double iliIiiliiiii(float yaw) {
      return iiilillIIIiill.liiiIIllIl((double)yaw, (double)this.liiIlillil);
   }

   public float IilliliilIIi() {
      return this.liiIlillil;
   }

   public void IliIlllilIi(float pitch, float yaw, double tolerance, double proportional, boolean speed) {
      if (!this.IiiIlillil) {
         this.IlIllillil = (double)0.0F;
         this.llIllillil = (double)0.0F;
      }

      this.IiiIlillil = true;
      this.liiIlillil = pitch;
      this.iiiIlillil = Math.max(-90.0F, Math.min(90.0F, yaw));
      this.IIIllillil = iiilillIIIiill.Illillliilli(tolerance, (double)2.0F, (double)12.0F);
      this.lIIllillil = Math.max((double)0.0F, proportional);
      this.iIIllillil = speed;
   }

   public float[] IIIllIIliIIl(float pitch, float pace, double dtMs, float gcd, double yaw) {
      long var26 = -8045928594788499987L;
      long var28 = -2866774765756243225L;
      long var30 = 681853321645233351L;
      if (this.IiiIlillil && gcd > 0.0F && dtMs > (double)0.0F) {
         double var8 = iiilillIIIiill.IliIlllilIi((double)(this.liiIlillil - pitch));
         double var10 = (double)(this.iiiIlillil - pace);
         double var12 = Math.max(this.lIIllillil, (double)gcd * (double)0.5F);
         var26 ^= ((long)(Math.abs(var8) <= var12 ? 1 : 0) << 32 ^ var26) & -1L << 32;
         var26 ^= ((long)(Math.abs(var10) <= var12 ? 1 : 0) ^ var26) & -1L >>> 32;
         double var16 = Math.max((double)0.0F, yaw);
         double var18 = (int)(var26 >>> 32) != 0 ? (double)0.0F : Math.min(Math.abs(var8), iiilillIIIiill.IilliliilIIi(this.IIIllillil, var8) * dtMs * var16);
         double var20 = (int)var26 != 0 ? (double)0.0F : Math.min(Math.abs(var10), iiilillIIIiill.IilliliilIIi(this.IIIllillil, var10) * dtMs * var16);
         if (this.iIIllillil && (int)(var26 >>> 32) == 0 && (int)var26 == 0) {
            double var22 = Math.abs(var8) / Math.abs(var10);
            if (var22 < (double)1.0F) {
               var18 *= var22;
            } else {
               var20 /= var22;
            }
         }

         if ((int)(var26 >>> 32) != 0) {
            this.IlIllillil = (double)0.0F;
         } else {
            this.IlIllillil += Math.signum(var8) * var18 / (double)gcd;
         }

         if ((int)var26 != 0) {
            this.llIllillil = (double)0.0F;
         } else {
            this.llIllillil += Math.signum(var10) * var20 / (double)gcd;
         }

         var28 ^= ((long)((int)this.IlIllillil) << 32 ^ var28) & -1L << 32;
         var28 ^= ((long)((int)this.llIllillil) ^ var28) & -1L >>> 32;
         var30 ^= ((long)((int)Math.round(Math.abs(var8) / (double)gcd)) << 32 ^ var30) & -1L << 32;
         var30 ^= ((long)((int)Math.round(Math.abs(var10) / (double)gcd)) ^ var30) & -1L >>> 32;
         if (Math.abs((int)(var28 >>> 32)) > (int)(var30 >>> 32)) {
            var28 ^= ((long)(Integer.signum((int)(var28 >>> 32)) * (int)(var30 >>> 32)) << 32 ^ var28) & -1L << 32;
            this.IlIllillil = (double)0.0F;
         } else {
            this.IlIllillil -= (double)((int)(var28 >>> 32));
         }

         if (Math.abs((int)var28) > (int)var30) {
            var28 ^= ((long)(Integer.signum((int)var28) * (int)var30) ^ var28) & -1L >>> 32;
            this.llIllillil = (double)0.0F;
         } else {
            this.llIllillil -= (double)((int)var28);
         }

         return new float[]{(float)((int)(var28 >>> 32)) * gcd, (float)((int)var28) * gcd};
      } else {
         return new float[2];
      }
   }

   public float lIiiIiIlilli() {
      return this.iiiIlillil;
   }
}
