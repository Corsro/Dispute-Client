package gg.corz;

import net.minecraft.class_243;

final class lIilIiIliIilIiIl implements liiIIlliiiIIll {
   private final int liIiIliIll;
   private final double IlIiIliIll;
   private final int IiIiIliIll;
   private final double ilIiIliIll;
   private final double llIiIliIll;

   lIilIiIliIilIiIl(class_243 at) {
      this.IlIiIliIll = at.field_1352;
      this.llIiIliIll = at.field_1351;
      this.ilIiIliIll = at.field_1350;
      this.IiIiIliIll = (int)Math.floor(at.field_1352);
      this.liIiIliIll = (int)Math.floor(at.field_1350);
   }

   public double liiiIIllIl(int x, double feetY, int z) {
      double var5 = IIiIIillIiIIil.IIIllIIliIIl((double)x + (double)0.5F, (double)z + (double)0.5F, this.IlIiIliIll, this.ilIiIliIll) - IIiIIillIiIIil.IIiIiilIilIiIiilIi;
      return var5 > (double)0.0F ? var5 * 3.6 : (double)0.0F;
   }

   public boolean IliIlllilIi(int z, double x, int feetY) {
      long var6 = -2295248184968645030L;
      var6 ^= ((long)((z != this.IiIiIliIll || feetY != this.liIiIliIll) && !(IIiIIillIiIIil.IIIllIIliIIl((double)z + (double)0.5F, (double)feetY + (double)0.5F, this.IlIiIliIll, this.ilIiIliIll) <= 0.35) ? 0 : 1) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) == 0) {
         return false;
      } else {
         return !Double.isFinite(this.llIiIliIll) || Math.abs(x - this.llIiIliIll) <= 1.1;
      }
   }

   public double IilliliilIIi(int z, double x, int feetY) {
      double var5 = IIiIIillIiIIil.IIIllIIliIIl((double)z + (double)0.5F, (double)feetY + (double)0.5F, this.IlIiIliIll, this.ilIiIliIll);
      if (Double.isFinite(this.llIiIliIll) && Double.isFinite(x)) {
         double var7 = x - this.llIiIliIll;
         return Math.sqrt(var5 * var5 + var7 * var7);
      } else {
         return var5;
      }
   }

   public double iIlIlllllill(int x, double z, int feetY) {
      return (double)0.0F;
   }
}
