package gg.corz;

final class IIIlIilllIIlIill {
   static boolean IliIlllilIi(double speed, int moved, double gapTicks) {
      long var8 = -705268270820747786L;
      var8 ^= ((long)Math.max(1, moved) << 32 ^ var8) & -1L << 32;
      double var6 = Double.isFinite(gapTicks) ? Math.max((double)0.0F, gapTicks) : (double)0.0F;
      return speed > (double)2.0F + var6 * (double)((int)(var8 >>> 32)) + 0.04 * (double)((int)(var8 >>> 32)) * (double)((int)(var8 >>> 32));
   }

   private IIIlIilllIIlIill() {
   }
}
