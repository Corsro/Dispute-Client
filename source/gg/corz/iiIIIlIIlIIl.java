package gg.corz;

import java.util.Random;

public final class iiIIIlIIlIIl {
   private double IliliiIllliliiIl;
   private int iiIiiiIlIIliiiIl;
   public static final double IIlliiIllIlliiIl = 1.7;
   private int liliiiIliiliiiIl;
   private double IiIiiiIlliIiiiIl;
   private int iiiiiiIlIIIIIIll;
   private double lIiliiIliIiliiIl;
   static final double IilliiIllilliiIl = (double)10.0F;
   private double iIIiiiIlIlIiiiIl;
   private int IiiiiiIlliiiiiIl;
   private int illiiiIlIiliiiIl;
   private double lliiiiIliliiiiIl;
   private double ililiiIlIiiliiIl;
   private final Random iilliiIlIIiliiIl;
   private double llIiiiIlilIiiiIl;
   private double liiliiIliiiliiIl;
   public static final int iIlliiIlIllliiIl = 10;
   private double IIIiiiIllIIiiiIl;
   private int lIIIIIlliIIIIIll;
   private boolean iIiiiiIlIliiiiIl;
   private int IlliiiIlllliiiIl;
   private boolean IIiiiiIllIiiiiIl;
   static final int lllliiIlillliiIl = 10;
   private int lIliiiIliIliiiIl;

   public liIiiiIiiiIiiiIi IilliliilIIi() {
      long var4 = -5176129764985725320L;
      long var6 = -8736070393106590958L;
      this.lIiliiIliIiliiIl += (double)this.iiIiiiIlIIliiiIl;
      var4 ^= ((long)liIiiiIiiiIiiiIi.liiiIIllIl(this.lIIIIIlliIIIIIll, this.lIliiiIliIliiiIl, 10) << 32 ^ var4) & -1L << 32;
      this.lIIIIIlliIIIIIll += (int)(var4 >>> 32);
      this.IliliiIllliliiIl += (double)((int)(var4 >>> 32));
      this.iiIiiiIlIIliiiIl = 0;
      this.lIliiiIliIliiiIl = 0;
      var4 ^= ((long)((int)this.lIiliiIliIiliiIl) ^ var4) & -1L >>> 32;
      var6 ^= ((long)((int)this.IliliiIllliliiIl) << 32 ^ var6) & -1L << 32;
      this.lIiliiIliIiliiIl -= (double)((int)var4);
      this.IliliiIllliliiIl -= (double)((int)(var6 >>> 32));
      return (int)var4 == 0 && (int)(var6 >>> 32) == 0 ? liIiiiIiiiIiiiIi.ilIIiIIlIi : new liIiiiIiiiIiiiIi((int)var4, (int)(var6 >>> 32));
   }

   public iiIIIlIIlIIl(Random rnd) {
      this.iilliiIlIIiliiIl = rnd;
   }

   private void IIIllIIliIIl(double crossAngle, double speedSetting, double adj) {
      long var10 = -5757956063042347606L;
      if (crossAngle == (double)0.0F) {
         this.lIiliiIliIiliiIl = (double)0.0F;
      } else {
         double var7 = adj;
         var10 ^= ((long)((int)Math.abs(speedSetting)) << 32 ^ var10) & -1L << 32;
         if ((int)(var10 >>> 32) <= 10) {
            this.llIiiiIlilIiiiIl = adj;
         }

         if (this.llIiiiIlilIiiiIl > (double)0.0F) {
            var7 = adj - this.llIiiiIlilIiiiIl / (double)3.0F;
            this.llIiiiIlilIiiiIl -= (double)((int)(var10 >>> 32)) / (double)200.0F;
         }

         this.lIiliiIliIiliiIl += var7 * crossAngle * (double)5.0F;
      }
   }

   private void iliIiiliiiii() {
      long var3 = 8010841951732201607L;
      ++this.liliiiIliiliiiIl;
      if (this.liliiiIliiliiiIl >= 250 + this.iilliiIlIIiliiIl.nextInt(50)) {
         this.liliiiIliiliiiIl = -100 + this.iilliiIlIIiliiIl.nextInt(50);
         this.IlliiiIlllliiiIl = this.iilliiIlIIiliiIl.nextInt(3) - 1;
         this.illiiiIlIiliiiIl = this.iilliiIlIIiliiIl.nextInt(3) - 1;
      }

      var3 ^= ((long)this.IlliiiIlllliiiIl << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)this.illiiiIlIiliiiIl ^ var3) & -1L >>> 32;
      if (this.iilliiIlIIiliiIl.nextInt(10) < 2) {
         var3 ^= (0L ^ var3) & -1L << 32;
      }

      if (this.iilliiIlIIiliiIl.nextInt(10) < 2) {
         var3 ^= (0L ^ var3) & -1L >>> 32;
      }

      if (this.liliiiIliiliiiIl < 0) {
         var3 ^= (0L ^ var3) & -1L << 32;
         var3 ^= (0L ^ var3) & -1L >>> 32;
      }

      if (this.iilliiIlIIiliiIl.nextInt(20) == 1) {
         this.iiIiiiIlIIliiiIl += (int)(var3 >>> 32);
         this.lIliiiIliIliiiIl += (int)var3;
      }

      if (this.lIiliiIliIiliiIl > (double)0.0F && this.iiIiiiIlIIliiiIl < 0 || this.lIiliiIliIiliiIl < (double)0.0F && this.iiIiiiIlIIliiiIl > 0) {
         this.iiIiiiIlIIliiiIl = 0;
      }

   }

   public void IliIlllilIi() {
      this.lIiliiIliIiliiIl = (double)0.0F;
      this.IliliiIllliliiIl = (double)0.0F;
      this.IlliiiIlllliiiIl = 0;
      this.illiiiIlIiliiiIl = 0;
      this.iiIiiiIlIIliiiIl = 0;
      this.lIliiiIliIliiiIl = 0;
   }

   private void lIiiIiIlilli() {
      if (++this.IiiiiiIlliiiiiIl > 10) {
         this.iIIiiiIlIlIiiiIl = this.IIIiiiIllIIiiiIl;
         this.ililiiIlIiiliiIl = this.liiliiIliiiliiIl;
         this.liiliiIliiiliiIl = (double)0.0F;
         this.IIIiiiIllIIiiiIl = (double)0.0F;
         this.IiiiiiIlliiiiiIl = 0;
      }

   }

   public void liiiIIllIl() {
      this.IliIlllilIi();
      this.ililiiIlIiiliiIl = (double)0.0F;
      this.liiliiIliiiliiIl = (double)0.0F;
      this.IIIiiiIllIIiiiIl = (double)0.0F;
      this.iIIiiiIlIlIiiiIl = (double)0.0F;
      this.llIiiiIlilIiiiIl = (double)0.0F;
      this.IiIiiiIlliIiiiIl = (double)0.0F;
      this.liliiiIliiliiiIl = 0;
      this.IIiiiiIllIiiiiIl = false;
      this.iIiiiiIlIliiiiIl = false;
      this.lliiiiIliliiiiIl = (double)0.0F;
      this.IiiiiiIlliiiiiIl = 0;
      this.iiiiiiIlIIIIIIll = 0;
      this.lIIIIIlliIIIIIll = 0;
   }

   public void iIlIlllllill(double strafeIncrease, double verticalSpeed, double aimVertically, double crossAngle, double yawError, double distance, double pitchError, boolean strafe, boolean horizontalSpeed) {
      long var38 = -5562876353007178699L;
      long var40 = 1842666746369609268L;
      this.lIiiIiIlilli();
      this.iliIiiliiiii();
      double var17 = Math.min((double)180.0F, Math.abs(strafeIncrease));
      var38 ^= ((long)(strafeIncrease < (double)0.0F ? 1 : 0) << 32 ^ var38) & -1L << 32;
      var38 ^= ((long)(aimVertically > (double)0.0F ? 1 : 0) ^ var38) & -1L >>> 32;
      double var21 = Math.abs(aimVertically);
      double var23 = var21 - (double)10.0F;
      double var25 = (double)1.0F + this.iilliiIlIIiliiIl.nextDouble() * (double)2.0F + var17 / (double)50.0F;
      double var27 = (double)1.0F + this.iilliiIlIIiliiIl.nextDouble() * (double)2.0F + Math.abs(var23) / (double)50.0F;
      if (Math.abs(var17 - this.lliiiiIliliiiiIl) > (double)6.0F) {
         var25 += var17 / (double)35.0F;
      }

      var25 += Math.max((double)0.0F, ((double)9.0F - crossAngle) / (double)2.5F - (double)2.0F);
      var40 ^= ((long)((int)(var38 >>> 32) != 0 ? (yawError < (double)0.0F ? 1 : 0) : (yawError > (double)0.0F ? 1 : 0)) << 32 ^ var40) & -1L << 32;
      if (horizontalSpeed && (int)(var40 >>> 32) != 0) {
         var25 *= 1.6;
      }

      if (crossAngle < (double)0.5F) {
         var25 /= (double)5.0F;
      }

      double var30 = var25 / (double)90.0F * ((int)(var38 >>> 32) != 0 ? (double)-1.0F : (double)1.0F);
      double var32 = var27 / (double)90.0F * ((int)var38 != 0 ? (double)1.0F : (double)-1.0F);
      if (var17 < (double)5.0F) {
         label89: {
            var30 = (double)0.0F;
            this.ililiiIlIiiliiIl *= 0.7;
            if ((int)(var38 >>> 32) != 0) {
               if (!(yawError > (double)0.0F)) {
                  break label89;
               }
            } else if (!(yawError < (double)0.0F)) {
               break label89;
            }

            this.ililiiIlIiiliiIl *= (double)0.5F;
         }
      }

      if ((int)(var38 >>> 32) != this.IIiiiiIllIiiiiIl) {
         this.ililiiIlIiiliiIl = -this.ililiiIlIiiliiIl;
         this.liiliiIliiiliiIl = -this.liiliiIliiiliiIl;
         this.lIiliiIliIiliiIl = (double)0.0F;
      }

      if ((int)var38 != this.iIiiiiIlIliiiiIl) {
         this.iIIiiiIlIlIiiiIl = -this.iIIiiiIlIlIiiiIl;
         this.IIIiiiIllIIiiiIl = -this.IIIiiiIllIIiiiIl;
         this.IliliiIllliliiIl = (double)0.0F;
      }

      if (var23 < (double)5.0F) {
         var32 = (double)0.0F;
         this.iIIiiiIlIlIiiiIl *= 0.7;
      }

      this.liiliiIliiiliiIl += var30;
      this.IIIiiiIllIIiiiIl += var32;
      if (Math.abs(this.ililiiIlIiiliiIl) > (double)10.0F) {
         this.liiliiIliiiliiIl = (double)0.0F;
         this.ililiiIlIiiliiIl = (double)0.0F;
      } else {
         double var34 = this.ililiiIlIiiliiIl * 0.15;
         if (var17 <= (double)9.0F) {
            var34 /= (double)10.0F - var17;
         }

         if (!Double.isFinite(var34)) {
            this.ililiiIlIiiliiIl = (double)0.0F;
            this.liiliiIliiiliiIl = (double)0.0F;
            this.lIiliiIliIiliiIl = (double)0.0F;
         } else {
            this.IIIllIIliIIl(var34, verticalSpeed, distance);
            if (strafe) {
               double var36 = this.iIIiiiIlIlIiiiIl * 0.15;
               if (!Double.isFinite(var36)) {
                  this.IIIiiiIllIIiiiIl = (double)0.0F;
                  this.iIIiiiIlIlIiiiIl = (double)0.0F;
                  this.IliliiIllliliiIl = (double)0.0F;
                  return;
               }

               this.IlIlllIlilIl(var36, var21, pitchError);
            }

            this.iIiiiiIlIliiiiIl = (boolean)((int)var38);
            this.IIiiiiIllIiiiiIl = (boolean)((int)(var38 >>> 32));
            if (++this.iiiiiiIlIIIIIIll > 10) {
               this.lliiiiIliliiiiIl = var17;
               this.iiiiiiIlIIIIIIll = 0;
            }

         }
      }
   }

   private void IlIlllIlilIl(double speedSetting, double angleAbs, double adj) {
      long var10 = 211599672080479764L;
      if (speedSetting == (double)0.0F) {
         this.IliliiIllliliiIl = (double)0.0F;
      } else {
         double var7 = adj;
         var10 ^= ((long)((int)angleAbs) << 32 ^ var10) & -1L << 32;
         if ((int)(var10 >>> 32) <= 10) {
            this.IiIiiiIlliIiiiIl = adj;
         }

         if (this.IiIiiiIlliIiiiIl > (double)0.0F) {
            var7 = adj - this.IiIiiiIlliIiiiIl / (double)3.0F;
            this.IiIiiiIlliIiiiIl -= (double)((int)(var10 >>> 32)) / (double)200.0F;
         }

         this.IliliiIllliliiIl += var7 * speedSetting * (double)5.0F;
      }
   }
}
