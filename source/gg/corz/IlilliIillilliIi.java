package gg.corz;

import java.util.List;

public final class IlilliIillilliIi {
   public static final double IilliliIIi = (double)6.0F;
   private int liililiIIi;
   private int llililiIIi = -1;
   public static final double lIililiIIi = (double)8.0F;
   private int ilililiIIi = -1;
   public static final double iilliliIIi = (double)3.5F;
   public static final int iIililiIIi = 20;
   private long iiililiIIi = Long.MIN_VALUE;
   private liiilIiliiiilIil IlililiIIi;
   private int IiililiIIi;
   public static final double lilliliIIi = (double)10.0F;
   public static final double IIililiIIi = (double)6.0F;

   private void IiIlliIliiIl(liiilIiliiiilIil e) {
      this.IlililiIIi = e;
      this.llililiIIi = e == null ? -1 : e.iIlIlllllill();
      this.ilililiIIi = -1;
      this.IiililiIIi = 0;
      this.liililiIIi = 0;
   }

   static int IIIllIIliIIl(boolean locked) {
      return locked ? 20 : 6;
   }

   public liiilIiliiiilIil liiiIIllIl() {
      return this.IlililiIIi;
   }

   public liiilIiliiiilIil IliIlllilIi(long self, List<liiilIiliiiilIil> threat, lliiilIiiliiilIi tick, IlIillllIill enemies, double keepRange) {
      long var20 = -7297165121878775796L;
      IlIillllIill var8 = enemies == null ? IlIillllIill.IIIIilIilIIIilIi : enemies;
      liiilIiliiiilIil var9 = null;
      if (this.llililiIIi >= 0 && threat != null) {
         for(liiilIiliiiilIil var11 : threat) {
            if (var11 != null && var11.iIlIlllllill() == this.llililiIIi) {
               var9 = var11;
               break;
            }
         }
      }

      if (var9 != null && Double.isFinite(keepRange) && var9.Illlllllilll() > keepRange) {
         ++this.liililiIIi;
         if (this.liililiIIi >= 40) {
            var9 = null;
         }
      } else if (var9 != null) {
         this.liililiIIi = 0;
      }

      liiilIiliiiilIil var22 = null;
      double var23 = Double.NEGATIVE_INFINITY;
      double var13 = Double.NEGATIVE_INFINITY;
      if (threat != null) {
         for(liiilIiliiiilIil var16 : threat) {
            if (var16 != null && (var9 != null || !Double.isFinite(keepRange) || !(var16.Illlllllilll() > keepRange) || var16.iIlIlllllill() != this.llililiIIi)) {
               var20 ^= ((long)(var9 != null && var16.iIlIlllllill() == var9.iIlIlllllill() ? 1 : 0) << 32 ^ var20) & -1L << 32;
               double var18 = iliiIlilIiiiIlil.IliIlllilIi(var16, tick, IlIlllIlilIl(var16, var8), (boolean)((int)(var20 >>> 32)));
               if ((int)(var20 >>> 32) != 0) {
                  var13 = var18;
               }

               if (var18 > var23 || var18 == var23 && var22 != null && var16.Illlllllilll() < var22.Illlllllilll()) {
                  var23 = var18;
                  var22 = var16;
               }
            }
         }
      }

      if (var9 == null) {
         this.IiIlliIliiIl(var22);
         return this.IlililiIIi;
      } else {
         var20 ^= ((long)lIiiIiIlilli(var9, self, this.iiililiIIi) ^ var20) & -1L >>> 32;
         if (var22 != null && var22.iIlIlllllill() != var9.iIlIlllllill() && !(var23 <= var13 + iliIiiliiiii((boolean)((int)var20)))) {
            if (var22.iIlIlllllill() == this.ilililiIIi) {
               ++this.IiililiIIi;
            } else {
               this.ilililiIIi = var22.iIlIlllllill();
               this.IiililiIIi = 1;
            }

            if (this.IiililiIIi >= IIIllIIliIIl((boolean)((int)var20))) {
               this.IiIlliIliiIl(var22);
               return this.IlililiIIi;
            } else {
               this.IlililiIIi = var9;
               return this.IlililiIIi;
            }
         } else {
            this.ilililiIIi = -1;
            this.IiililiIIi = 0;
            this.IlililiIIi = var9;
            return this.IlililiIIi;
         }
      }
   }

   public void IilliliilIIi() {
      this.IlililiIIi = null;
      this.llililiIIi = -1;
      this.ilililiIIi = -1;
      this.IiililiIIi = 0;
      this.liililiIIi = 0;
      this.iiililiIIi = Long.MIN_VALUE;
   }

   static float IlIlllIlilIl(liiilIiliiiilIil e, IlIillllIill t) {
      double var2 = e.Illlllllilll();
      float var4 = 0.0F;
      if (var2 <= (double)6.0F) {
         var4 = t.iliIiiliiiii();
      } else if (var2 < (double)10.0F) {
         var4 = (float)((double)t.iliIiiliiiii() * ((double)10.0F - var2) / (double)4.0F);
      }

      float var5 = 0.0F;
      if (var2 <= (double)3.5F && (e.IIiilIiiiIii() == iIIiIIliIlIiIIli.IIIiilIlIi || e.IIiilIiiiIii() == iIIiIIliIlIiIIli.lIIiilIlIi || e.IIiilIiiiIii() == iIIiIIliIlIiIIli.iIIiilIlIi)) {
         var5 = t.IIlllIlliIll();
      }

      return Math.max(var4, var5);
   }

   public void iIlIlllllill(long untilTick) {
      if (untilTick > this.iiililiIIi) {
         this.iiililiIIi = untilTick;
      }

   }

   static boolean lIiiIiIlilli(liiilIiliiiilIil lockedUntil, long cur, long tick) {
      if (lockedUntil == null) {
         return false;
      } else {
         return cur <= tick || lockedUntil.Illlllllilll() <= (double)6.0F;
      }
   }

   static double iliIiiliiiii(boolean locked) {
      return locked ? (double)8.0F : (double)2.0F;
   }
}
