package gg.corz;

public final class lllIIiIiillIIiIi {
   public static final int iIIililIIi = 4;
   public static final int lIIililIIi = 3;
   public static final int IIIililIIi = 2;
   public static final int[][] llIililIIi = new int[][]{{0, -1, 0}, {0, 1, 0}, {0, 0, -1}, {0, 0, 1}, {-1, 0, 0}, {1, 0, 0}};
   public static final int iiillilIIi = 1;
   public static final int liillilIIi = 0;
   public static final int IlIililIIi = 5;
   private static final int[][][] ilIililIIi = new int[][][]{{{0, 0, 0}, {1, 0, 0}, {1, 0, 1}, {0, 0, 1}}, {{0, 1, 0}, {0, 1, 1}, {1, 1, 1}, {1, 1, 0}}, {{0, 0, 0}, {0, 1, 0}, {1, 1, 0}, {1, 0, 0}}, {{0, 0, 1}, {1, 0, 1}, {1, 1, 1}, {0, 1, 1}}, {{0, 0, 0}, {0, 0, 1}, {0, 1, 1}, {0, 1, 0}}, {{1, 0, 0}, {1, 1, 0}, {1, 1, 1}, {1, 0, 1}}};

   public static boolean IilliliilIIi(int box, float[] face) {
      boolean var10000;
      switch (box) {
         case 0 -> var10000 = face[1] <= 0.0F;
         case 1 -> var10000 = face[4] >= 1.0F;
         case 2 -> var10000 = face[2] <= 0.0F;
         case 3 -> var10000 = face[5] >= 1.0F;
         case 4 -> var10000 = face[0] <= 0.0F;
         default -> var10000 = face[3] >= 1.0F;
      }

      return var10000;
   }

   public static boolean lIiiIiIlilli(float[] nz, float[] p2, float[] p1, float[] nx, float ny, float p3, float p0) {
      float var7 = p1[0] - nz[0];
      float var8 = p1[1] - nz[1];
      float var9 = p1[2] - nz[2];
      float var10 = nx[0] - p2[0];
      float var11 = nx[1] - p2[1];
      float var12 = nx[2] - p2[2];
      float var13 = var8 * var12 - var9 * var11;
      float var14 = var9 * var10 - var7 * var12;
      float var15 = var7 * var11 - var8 * var10;
      return var13 * ny + var14 * p3 + var15 * p0 >= 0.0F;
   }

   public static float liiiIIllIl(int y, float face, float x, float z) {
      float var10000;
      switch (y) {
         case 0:
         case 1:
         case 3:
            var10000 = face;
            break;
         case 2:
            var10000 = 1.0F - face;
            break;
         case 4:
            var10000 = z;
            break;
         default:
            var10000 = 1.0F - z;
      }

      return var10000;
   }

   public static float iIlIlllllill(int face, float y, float z, float x) {
      float var10000;
      switch (face) {
         case 0 -> var10000 = 1.0F - x;
         case 1 -> var10000 = x;
         default -> var10000 = 1.0F - z;
      }

      return var10000;
   }

   public static void IliIlllilIi(int face, int vertex, float[] box, float[] out) {
      int[] var4 = ilIililIIi[face][vertex];
      out[0] = var4[0] == 0 ? box[0] : box[3];
      out[1] = var4[1] == 0 ? box[1] : box[4];
      out[2] = var4[2] == 0 ? box[2] : box[5];
   }

   private lllIIiIiillIIiIi() {
   }
}
