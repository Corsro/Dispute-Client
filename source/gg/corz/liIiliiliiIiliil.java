package gg.corz;

import java.util.Random;

final class liIiliiliiIiliil {
   final float[] IiIiIIIiil = new float[30];
   final float iiilIIIiil;
   final int[] liIiIIIiil = new int[6];
   final float[] IIliIIIiil = new float[18];
   final int ililIIIiil;
   final int liilIIIiil;
   final float[] IlIiIIIiil = new float[6];
   final int IiilIIIiil;
   final float IIIiIIIiil;
   final float[] iiIiIIIiil = new float[24];
   final float[] iIIiIIIiil = new float[6];
   final float[] ilIiIIIiil = new float[30];
   final float[] llIiIIIiil = new float[6];
   final float[] lIIiIIIiil = new float[6];

   liIiliiliiIiliil(int spread, int gy, float gx, float gain) {
      this.ililIIIiil = spread;
      this.IiilIIIiil = gy;
      this.liilIIIiil = Math.min(6, spread * gy);
      this.iiilIIIiil = gx;
      this.IIIiIIIiil = gain;
   }

   void IliIlllilIi(Random rng) {
      long var16 = -8893897576237461616L;
      long var10 = 6249724731606624515L;
      long var12 = -8652970390241804700L;
      long var14 = 122098005045850195L;
      int[] var2 = new int[4];

      for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < 4; var10 += 4294967296L) {
         var2[(int)(var10 >>> 32)] = (int)(var10 >>> 32);
      }

      for(var10 ^= (12884901888L ^ var10) & -1L << 32; (int)(var10 >>> 32) > 0; var10 += -4294967296L) {
         var10 ^= ((long)rng.nextInt((int)(var10 >>> 32) + 1) ^ var10) & -1L >>> 32;
         var12 ^= ((long)var2[(int)(var10 >>> 32)] << 32 ^ var12) & -1L << 32;
         var2[(int)(var10 >>> 32)] = var2[(int)var10];
         var2[(int)var10] = (int)(var12 >>> 32);
      }

      var10 ^= ((long)(this.ililIIIiil == 1 ? 1 : 2) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)rng.nextInt(4) ^ var10) & -1L >>> 32;

      for(var12 ^= (0L ^ var12) & -1L << 32; (int)(var12 >>> 32) < this.liilIIIiil; var12 += 4294967296L) {
         var12 ^= ((long)((int)(var12 >>> 32) % this.ililIIIiil) ^ var12) & -1L >>> 32;
         var14 ^= ((long)((int)(var12 >>> 32) / this.ililIIIiil) << 32 ^ var14) & -1L << 32;
         this.lIIiIIIiil[(int)(var12 >>> 32)] = ((float)((int)var12) + 0.5F + (rng.nextFloat() - 0.5F) * 0.64F) / (float)this.ililIIIiil;
         this.iIIiIIIiil[(int)(var12 >>> 32)] = ((float)((int)(var14 >>> 32)) + 0.5F + (rng.nextFloat() - 0.5F) * 0.64F) / (float)this.IiilIIIiil;
         this.IlIiIIIiil[(int)(var12 >>> 32)] = 0.35F + 0.4F * rng.nextFloat();
         this.llIiIIIiil[(int)(var12 >>> 32)] = 0.58F + 0.42F * rng.nextFloat();
         this.liIiIIIiil[(int)(var12 >>> 32)] = var2[((int)var12 + (int)(var14 >>> 32) * (int)(var10 >>> 32) + (int)var10) % 4];
         var14 ^= ((long)((int)(var12 >>> 32) * 5) ^ var14) & -1L >>> 32;

         for(var16 ^= (0L ^ var16) & -1L << 32; (int)(var16 >>> 32) < 4; var16 += 4294967296L) {
            this.ilIiIIIiil[(int)var14 + (int)(var16 >>> 32)] = 0.2F + 0.34F * rng.nextFloat();
            this.IiIiIIIiil[(int)var14 + (int)(var16 >>> 32)] = rng.nextFloat() * ((float)Math.PI * 2F);
         }

         this.ilIiIIIiil[(int)var14 + 4] = 0.1F + 0.16F * rng.nextFloat();
         this.IiIiIIIiil[(int)var14 + 4] = rng.nextFloat() * ((float)Math.PI * 2F);
      }

      var12 ^= ((long)rng.nextInt(this.liilIIIiil) << 32 ^ var12) & -1L << 32;
      this.llIiIIIiil[(int)(var12 >>> 32)] = 1.0F;
      this.IlIiIIIiil[(int)(var12 >>> 32)] = Math.max(this.IlIiIIIiil[(int)(var12 >>> 32)], 0.64F);
   }
}
