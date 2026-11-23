package gg.corz;

public final class llllIiililllIiil {
   public static final double IIiiiillil = (double)6.0F;
   public static final double lIiiiillil = (double)5.0F;
   public static final double Iiliiillil = 1.62;
   public static final double iiliiillil = 0.9;
   public static final double liliiillil = -0.0784;
   private static final int lliiiillil = 1000000;
   public static final double illiiillil = (double)0.4F;
   private static final double iIiiiillil = 1.0E-5;
   private static final double Iliiiillil = 1.0E-5;

   public static boolean liiiIIllIl(boolean serverSprinting, double chargeProgress) {
      return serverSprinting && chargeProgress > 0.9;
   }

   private static double IIlllIlliIll(double v) {
      return !(v > (double)0.0F) ? (double)0.0F : Math.min((double)1.0F, v);
   }

   public static void iliIiiliiiii(double[] x, double resistance, double onGround, double z, double strength, boolean v) {
      double var10 = resistance * ((double)1.0F - onGround);
      if (var10 > (double)0.0F) {
         double var12 = z * z + strength * strength;
         if (var12 >= 1.0E-5) {
            double var14 = Math.sqrt(var12);
            double var16 = z / var14 * var10;
            double var18 = strength / var14 * var10;
            x[0] = x[0] / (double)2.0F - var16;
            x[1] = v ? Math.min(0.4, x[1] / (double)2.0F + var10) : x[1];
            x[2] = x[2] / (double)2.0F - var18;
         }
      }
   }

   public static double IliIlllilIi(double attackKnockbackAttribute, int knockbackLevel, boolean sprintHit) {
      return (attackKnockbackAttribute + (double)knockbackLevel) / (double)2.0F + (sprintHit ? (double)0.5F : (double)0.0F);
   }

   public static double IilliliilIIi(int netheritePieces) {
      return IIlllIlliIll(0.1 * (double)netheritePieces);
   }

   public static int iIlIlllllill(double attackSpeed) {
      return !(attackSpeed > (double)0.0F) ? 1000000 : (int)Math.floor((double)18.0F / attackSpeed - (double)0.5F) + 1;
   }

   public static double[] IIIllIIliIIl(double[] strength, boolean attackerMinusTargetX, double attackerMinusTargetZ, double resistance, double onGround, float kind, double attackerYawDegrees, IillIlIilillIlIi serverVelocity) {
      double[] var12 = new double[]{strength[0], strength[1], strength[2]};
      if (serverVelocity != null && serverVelocity != IillIlIilillIlIi.IIIiIIIIIi) {
         if (serverVelocity == IillIlIilillIlIi.liilIIIIIi) {
            iliIiiliiiii(var12, (double)0.4F, attackerMinusTargetZ, resistance, onGround, attackerMinusTargetX);
         }

         if (attackerYawDegrees > (double)0.0F) {
            double var13 = Math.toRadians((double)kind);
            iliIiiliiiii(var12, attackerYawDegrees, attackerMinusTargetZ, Math.sin(var13), -Math.cos(var13), attackerMinusTargetX);
         }

         return var12;
      } else {
         return var12;
      }
   }

   public static double[] IlIlllIlilIl(double power, double feetX, double feetZ, double exposure, double cY, double feetY, double cX, double cZ, double resistance, double eyeHeight) {
      if (!(cZ > (double)0.0F)) {
         return new double[3];
      } else {
         double var20 = power - cY;
         double var22 = feetX - feetY;
         double var24 = feetZ - cX;
         double var26 = Math.sqrt(var20 * var20 + var22 * var22 + var24 * var24) / ((double)2.0F * cZ);
         if (!(var26 <= (double)1.0F)) {
            return new double[3];
         } else {
            double var30 = feetX + exposure - feetY;
            double var34 = Math.sqrt(var20 * var20 + var30 * var30 + var24 * var24);
            if (!(var34 >= 1.0E-5)) {
               return new double[3];
            } else {
               double var36 = ((double)1.0F - var26) * resistance * ((double)1.0F - IIlllIlliIll(eyeHeight));
               return new double[]{var20 / var34 * var36, var30 / var34 * var36, var24 / var34 * var36};
            }
         }
      }
   }

   public static double IiIlliIliiIl(boolean mace, boolean axe, boolean sword) {
      if (mace) {
         return 1.6;
      } else if (axe) {
         return (double)1.0F;
      } else {
         return sword ? 0.6 : (double)4.0F;
      }
   }

   private llllIiililllIiil() {
   }

   public static double lIiiIiIlilli(int[] blastProtectionLevelPerPiece) {
      long var7 = 529201381727749289L;
      long var9 = -5722892916152697727L;
      if (blastProtectionLevelPerPiece == null) {
         return (double)0.0F;
      } else {
         double var1 = (double)0.0F;
         int[] var3 = blastProtectionLevelPerPiece;
         var7 ^= ((long)blastProtectionLevelPerPiece.length << 32 ^ var7) & -1L << 32;

         for(long var12 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            var9 ^= ((long)var3[(int)var12] << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) > 0) {
               var1 += 0.15 * (double)((int)(var9 >>> 32));
            }
         }

         return IIlllIlliIll(var1);
      }
   }
}
