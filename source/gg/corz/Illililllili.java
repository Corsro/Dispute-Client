package gg.corz;

public final class Illililllili {
   public static final int IIIiIllIllIIiIllIl = 4;
   public static final int lIilIllIliIilIllIl = 0;
   public static final int IlilIllIlllilIllIl = 1;
   public static final int iIIiIllIlIlIiIllIl = 5;
   public static final int ililIllIlIiilIllIl = 2;
   public static final int liilIllIliiilIllIl = 3;

   public static boolean IilliliilIIi(boolean neighbourStairsComplete) {
      return !neighbourStairsComplete;
   }

   public static boolean iliIiiliiiii(boolean wantTop, int clickedSideOrdinal, double hitYFraction) {
      return IliIlllilIi(clickedSideOrdinal, hitYFraction) == wantTop;
   }

   private Illililllili() {
   }

   public static boolean IliIlllilIi(int clickedSideOrdinal, double hitYFraction) {
      if (clickedSideOrdinal == 0) {
         return true;
      } else if (clickedSideOrdinal == 1) {
         return false;
      } else {
         return hitYFraction > (double)0.5F;
      }
   }

   public static double lIiiIiIlilli(boolean topHalf) {
      return topHalf ? 0.78 : 0.22;
   }

   public static int liiiIIllIl(float yaw) {
      long var2 = 1404377988455091102L;
      var2 ^= ((long)((int)Math.floor((double)yaw / (double)90.0F + (double)0.5F) & 3) << 32 ^ var2) & -1L << 32;
      byte var10000;
      switch ((int)(var2 >>> 32)) {
         case 0 -> var10000 = 3;
         case 1 -> var10000 = 4;
         case 2 -> var10000 = 2;
         default -> var10000 = 5;
      }

      return var10000;
   }

   public static float iIlIlllllill(int facingOrdinal) {
      float var10000;
      switch (facingOrdinal) {
         case 2 -> var10000 = 180.0F;
         case 3 -> var10000 = 0.0F;
         case 4 -> var10000 = 90.0F;
         case 5 -> var10000 = -90.0F;
         default -> var10000 = 0.0F;
      }

      return var10000;
   }
}
