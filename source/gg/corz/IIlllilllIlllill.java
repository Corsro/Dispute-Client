package gg.corz;

import java.util.Arrays;

public final class IIlllilllIlllill {
   final float[] IlIIlIiill;
   public final int liiiIIiill;
   final float[] lIIIlIiill;
   final float[] IiIIlIiill;
   final float[] iiiiIIiill;
   final float[] liIIlIiill;
   final float[] ilIIlIiill;
   final float[] iIIIlIiill;
   final float[] llIIlIiill;
   final float[] IIIIlIiill;

   public IIlllilllIlllill(int bones) {
      this.liiiIIiill = bones;
      this.iiiiIIiill = new float[bones];
      this.IIIIlIiill = new float[bones];
      this.lIIIlIiill = new float[bones];
      this.iIIIlIiill = new float[bones];
      this.IlIIlIiill = new float[bones];
      this.llIIlIiill = new float[bones];
      this.ilIIlIiill = new float[bones];
      this.IiIIlIiill = new float[bones];
      this.liIIlIiill = new float[bones];
      this.IliIlllilIi();
   }

   public IIlllilllIlllill IliIlllilIi() {
      Arrays.fill(this.iiiiIIiill, 0.0F);
      Arrays.fill(this.IIIIlIiill, 0.0F);
      Arrays.fill(this.lIIIlIiill, 0.0F);
      Arrays.fill(this.iIIIlIiill, 0.0F);
      Arrays.fill(this.IlIIlIiill, 0.0F);
      Arrays.fill(this.llIIlIiill, 0.0F);
      Arrays.fill(this.ilIIlIiill, 1.0F);
      Arrays.fill(this.IiIIlIiill, 1.0F);
      Arrays.fill(this.liIIlIiill, 1.0F);
      return this;
   }

   public IIlllilllIlllill liiiIIllIl(lIillIlliIillIll z, float b, float x, float y) {
      if (z != null && z.IIlIIIilll < this.liiiIIiill) {
         this.iiiiIIiill[z.IIlIIIilll] = b;
         this.IIIIlIiill[z.IIlIIIilll] = x;
         this.lIIIlIiill[z.IIlIIIilll] = y;
         return this;
      } else {
         return this;
      }
   }

   public IIlllilllIlllill iliIiiliiiii(lIillIlliIillIll z, float b, float x, float y) {
      if (z != null && z.IIlIIIilll < this.liiiIIiill) {
         float[] var10000 = this.ilIIlIiill;
         int var10001 = z.IIlIIIilll;
         var10000[var10001] *= b;
         var10000 = this.IiIIlIiill;
         var10001 = z.IIlIIIilll;
         var10000[var10001] *= x;
         var10000 = this.liIIlIiill;
         var10001 = z.IIlIIIilll;
         var10000[var10001] *= y;
         return this;
      } else {
         return this;
      }
   }

   public IIlllilllIlllill iIlIlllllill(lIillIlliIillIll x, float b, float z, float y) {
      if (x != null && x.IIlIIIilll < this.liiiIIiill) {
         float[] var10000 = this.iiiiIIiill;
         int var10001 = x.IIlIIIilll;
         var10000[var10001] += b;
         var10000 = this.IIIIlIiill;
         var10001 = x.IIlIIIilll;
         var10000[var10001] += z;
         var10000 = this.lIIIlIiill;
         var10001 = x.IIlIIIilll;
         var10000[var10001] += y;
         return this;
      } else {
         return this;
      }
   }

   public IIlllilllIlllill IilliliilIIi(lIillIlliIillIll y, float z, float b, float x) {
      if (y != null && y.IIlIIIilll < this.liiiIIiill) {
         float[] var10000 = this.iIIIlIiill;
         int var10001 = y.IIlIIIilll;
         var10000[var10001] += z;
         var10000 = this.IlIIlIiill;
         var10001 = y.IIlIIIilll;
         var10000[var10001] += b;
         var10000 = this.llIIlIiill;
         var10001 = y.IIlIIIilll;
         var10000[var10001] += x;
         return this;
      } else {
         return this;
      }
   }

   public IIlllilllIlllill lIiiIiIlilli(lIillIlliIillIll b, float s) {
      return this.iliIiiliiiii(b, s, s, s);
   }
}
