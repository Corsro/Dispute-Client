package gg.corz;

import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class iliIiillIiiIiill {
   public static final double lIlIIiiill = (double)4.0F;
   public static final double lliiiliill = 3.2;
   public static final double liIIIiiill = (double)4.0F;
   public static final double lilIIiiill = 0.6;
   public static final float IIliiliill = 0.7F;
   public static final float liIiiliill = 1.0F;
   public static final double Iiliiliill = 0.91;
   public static final double ilIIIiiill = (double)15.0F;
   public static final float ilIiiliill = 1.0F;
   public static final double Iliiiliill = (double)2.0F;
   public static final double Illiiliill = 0.1;
   public static final int iIIIIiiill = 2;
   public static final double IiIIIiiill = (double)20.0F;
   public static final float iiIiiliill = 2.0F;
   public static final double iiiiiliill = 0.3;
   public static final double lllIIiiill = (double)2.0F;
   public static final double iiIIIiiill = (double)60.0F;
   public static final int llliiliill = 3;
   public static final double iIiiiliill = (double)3.0F;
   public static final double IIiiiliill = 0.98;
   public static final double Iiiiiliill = (double)6.0F;
   public static final double IllIIiiill = 1.3;
   public static final double illIIiiill = (double)1.5F;
   public static final int IIlIIiiill = 3;
   static final int[][] lliIIiiill;
   public static final double iiliiliill = 0.08;
   public static final double lIliiliill = (double)2.0F;
   public static final int IlIIIiiill = 3;
   public static final double liliiliill = 0.546;
   private static final double[] iIiIIiiill;
   public static final double IIIIIiiill = 0.225;
   static final int[][] IliIIiiill;
   public static final int lIIIIiiill = 2;
   public static final int llIiiliill = 10;
   public static final int IiIiiliill = 2;
   public static final double liiiiliill = 0.7;
   public static final double iIliiliill = (double)2.0F;
   public static final double iIlIIiiill = (double)1.0F;
   public static final double IilIIiiill = 1.3;
   public static final double lIiiiliill = (double)1.25F;
   public static final int illiiliill = 7;
   public static final double iliiiliill = (double)0.5F;
   private static final class_2350[] IIiIIiiill;
   public static final double iilIIiiill = (double)2.0F;
   private static final class_2350[] lIiIIiiill;
   public static final int llIIIiiill = 24;

   private static boolean Iliilliiilii(class_243 eye, class_2338 pos, class_2350 face) {
      boolean var10000;
      switch (face) {
         case field_11036 -> var10000 = eye.field_1351 > (double)pos.method_10264() + (double)1.0F;
         case field_11033 -> var10000 = eye.field_1351 < (double)pos.method_10264();
         case field_11043 -> var10000 = eye.field_1350 < (double)pos.method_10260();
         case field_11035 -> var10000 = eye.field_1350 > (double)pos.method_10260() + (double)1.0F;
         case field_11039 -> var10000 = eye.field_1352 < (double)pos.method_10263();
         case field_11034 -> var10000 = eye.field_1352 > (double)pos.method_10263() + (double)1.0F;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   static {
      IIiIIiiill = new class_2350[]{class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034};
      lIiIIiiill = class_2350.values();
      iIiIIiiill = new double[]{(double)0.5F, (double)0.25F, (double)0.75F};
      IliIIiiill = new int[][]{{1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
      lliIIiiill = new int[][]{{2, 1}, {1, 2}, {2, 2}};
   }

   static Iiilllliilll IIlllIlliIll(Iiilllliilll p, int cells) {
      return Illlllllilll(p, cells, (double)3.0F);
   }

   static boolean Iilililiiili(boolean kills, boolean turn, boolean place, double forced) {
      return !kills && turn && !place && !(forced <= (double)60.0F);
   }

   static double lIiiIiIlilli(double value, boolean steady) {
      return steady ? value : value - (double)2.0F;
   }

   public static Iiilllliilll IIIIllIIIl(iliiIiiIiiiIii r) {
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      class_638 var3 = var1.field_1687;
      if (r != null && r.IliIlllilIi() != null && r.liiiIIllIl() != null && var2 != null && var3 != null) {
         if (!lliiIliliiIl.iIlIlllllill()) {
            return null;
         } else {
            IilllIIililllIIi var4 = new IilllIIililllIIi(r, var2, var3);
            if (r.IIIilIIiiIIi() != null) {
               return var4.IilliliilIIi(r.IIIilIIiiIIi().method_10062(), true);
            } else {
               for(class_2338 var6 : var4.IliIlllilIi()) {
                  if (var4.Iiliiiliil >= 10) {
                     break;
                  }

                  var4.liiiIIllIl(var6);
               }

               return var4.liliiiliil;
            }
         }
      } else {
         return null;
      }
   }

   static boolean liiiIIllIl(boolean glowstone, int bareSafe, int allowCover, boolean glowNeeded, float bareSelfFull) {
      return glowstone && bareSafe >= allowCover + 1 && (!glowNeeded || bareSelfFull > 1.0F);
   }

   static Iiilllliilll Illlllllilll(Iiilllliilll p, int weight, double cells) {
      return p != null && weight > 0 ? new Iiilllliilll(p.liiiIIllIl(), p.iIlIlllllill(), p.IilliliilIIi(), p.lIiiIiIlilli(), p.iliIiiliiiii(), p.IIIllIIliIIl(), p.IlIlllIlilIl(), p.IiIlliIliiIl(), p.IIlllIlliIll(), p.Illlllllilll(), p.Iilllilliill(), p.IIillIiliIil() + IlIlllIlilIl(weight, cells), p.Ililllililil(), p.Iiilliiliiil(), weight, p.IlIillIiilIi()) : p;
   }

   private iliIiillIiiIiill() {
   }

   static double IlIlllIlilIl(int weight, double cells) {
      return weight <= 0 ? (double)0.0F : cells * (double)Math.min(weight, 3) / (double)3.0F;
   }

   static int IIlilIliiIli(boolean charges, boolean cover, int place, double turn) {
      return IiIiliIiiiIi(turn, !charges && !cover && place > 0 ? (double)20.0F : (double)15.0F);
   }

   static class_243 IIillIiliIil(class_243 vel, class_243 onGround, boolean eye) {
      long var18 = -4224391811597098198L;
      if (vel != null && onGround != null && (!eye || Iilllilliill(onGround.field_1352, onGround.field_1350))) {
         double var3 = eye ? 0.546 : 0.91;
         double var5 = vel.field_1352;
         double var7 = vel.field_1351;
         double var9 = vel.field_1350;
         double var11 = onGround.field_1352;
         double var13 = onGround.field_1351;
         double var15 = onGround.field_1350;

         for(long var20 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var20 >>> 32) < 3; var20 += 4294967296L) {
            var5 += var11;
            var9 += var15;
            var11 *= var3;
            var15 *= var3;
            if (!eye) {
               var7 += var13;
               var13 = (var13 - 0.08) * 0.98;
            }
         }

         return new class_243(var5, Math.max(var7, vel.field_1351 - (double)1.25F), var9);
      } else {
         return null;
      }
   }

   static boolean IIiilIiiiIii(class_243 targetNow, double eye, class_2338 cover, class_2338 cell, class_238 reach, class_238 targetAt) {
      long var25 = -8080811005554366491L;
      long var27 = -7893080871080980263L;
      long var29 = 6743271112725660591L;
      if (targetNow != null && cover != null) {
         class_238 var7 = cell == null ? null : lllIliIlillIliIl.lIiiIiIlilli(cell);
         double var8 = eye * eye;
         class_2350[] var10 = lIiIIiiill;
         var25 ^= ((long)var10.length << 32 ^ var25) & -1L << 32;

         for(long var32 = var25 ^ (0L ^ var25) & -1L >>> 32; (int)var32 < (int)(var32 >>> 32); var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32) {
            class_2350 var13 = var10[(int)var32];
            if (Iliilliiilii(targetNow, cover, var13) && (cell == null || !cover.method_10093(var13).equals(cell))) {
               double[] var14 = iIiIIiiill;
               var27 ^= ((long)var14.length << 32 ^ var27) & -1L << 32;

               for(var27 ^= (0L ^ var27) & -1L >>> 32; (int)var27 < (int)(var27 >>> 32); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
                  double var17 = var14[(int)var27];
                  double[] var19 = iIiIIiiill;
                  var29 ^= ((long)var19.length << 32 ^ var29) & -1L << 32;

                  for(var29 ^= (0L ^ var29) & -1L >>> 32; (int)var29 < (int)(var29 >>> 32); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
                     double var22 = var19[(int)var29];
                     class_243 var24 = Iiiiliiiiiii(cover, var13, var17, var22);
                     if (!(targetNow.method_1025(var24) > var8) && (var7 == null || !var7.method_992(targetNow, var24).isPresent()) && (reach == null || !reach.method_992(targetNow, var24).isPresent()) && (targetAt == null || !targetAt.method_992(targetNow, var24).isPresent()) && lllIliIlillIliIl.IiIIlliIIl(targetNow, var24)) {
                        return true;
                     }
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   static boolean Ililllililil(boolean place, boolean knocked, boolean airborne, boolean steady) {
      return !place && knocked && steady;
   }

   static boolean IliIlllilIi(boolean allowCover, int bareSafe, int glowNeeded, boolean bareSelfFull, float glowstone, int targetReadyIn, int bareClicks) {
      long var8 = 3948647914002400904L;
      var8 ^= ((long)(bareClicks >= targetReadyIn + 1 ? 1 : 0) << 32 ^ var8) & -1L << 32;
      return allowCover && bareSafe >= glowNeeded + 1 && (!bareSelfFull || (int)(var8 >>> 32) != 0 && glowstone > 1.0F);
   }

   static int IlIillIiilIi(double turn) {
      return IiIiliIiiiIi(turn, (double)15.0F);
   }

   static boolean iIlIlllllill(ilIiliilIiIiliil hpT, Iiilllliilll covered, Iiilllliilll trade, float bare) {
      long var6 = 8154194582271715771L;
      if (hpT != null && hpT.iIIIlIlIIl() && covered != null && trade != null) {
         if (covered.IIlllIlliIll() && !trade.IIlllIlliIll()) {
            return false;
         } else {
            var6 ^= ((long)(trade.iliIiiliiiii() >= bare ? 1 : 0) << 32 ^ var6) & -1L << 32;
            if (!hpT.Ililllililil(trade.iliIiiliiiii(), trade.IlIillIiilIi(), (boolean)((int)(var6 >>> 32)))) {
               return false;
            } else {
               var6 ^= ((long)(covered.IiIlliIliiIl() && !trade.IiIlliIliiIl() ? 1 : 0) ^ var6) & -1L >>> 32;
               if (covered.iliIiiliiiii() >= bare && (int)(var6 >>> 32) == 0 && (int)var6 == 0) {
                  return false;
               } else if ((int)var6 != 0) {
                  return true;
               } else {
                  return trade.IlIlllIlilIl() + 2.0F <= covered.IlIlllIlilIl() && trade.iliIiiliiiii() >= 0.7F * covered.iliIiiliiiii();
               }
            }
         }
      } else {
         return false;
      }
   }

   static double Illillliilli(boolean place) {
      return place ? (double)4.0F : (double)1.0F;
   }

   static double Iiilliiliiil(double y, double z, int hisZ, int hisY, int x, int vx, double hisX, double vz) {
      long var21 = 5540246514661674959L;
      var21 ^= ((long)(x - hisZ) << 32 ^ var21) & -1L << 32;
      double var13 = (double)hisY + (double)0.5F - y;
      double var15 = (double)vx + (double)0.5F - z;
      double var17 = Math.sqrt(var13 * var13 + var15 * var15);
      if ((int)(var21 >>> 32) >= 0 && (int)(var21 >>> 32) <= 1 && var17 <= 1.3) {
         double var19 = Math.sqrt(hisX * hisX + vz * vz);
         return Iilllilliill(hisX, vz) && !(var19 > (double)2.0F) && !(var17 < 1.0E-6) ? (double)1.5F + 0.6 * ((double)1.0F - Math.min((double)1.0F, Math.abs(var13 * hisX + var15 * vz) / (var17 * var19))) : (double)1.5F;
      } else {
         return (double)0.0F;
      }
   }

   static boolean iliIiiliiiii(double hisFeetY, double ourFeetY) {
      return Double.isFinite(hisFeetY) && Double.isFinite(ourFeetY) && hisFeetY > ourFeetY - (double)0.5F;
   }

   static boolean Iilllilliill(double vz, double vx) {
      return Math.sqrt(vz * vz + vx * vx) * (double)2.0F >= 0.1;
   }

   static boolean IIIilIIiiIIi(double toUs, double toHim) {
      return toUs <= 1.3 && toHim >= toUs + (double)2.0F;
   }

   private static class_243 Iiiiliiiiiii(class_2338 pos, class_2350 face, double u, double v) {
      double var6 = (double)pos.method_10263();
      double var8 = (double)pos.method_10264();
      double var10 = (double)pos.method_10260();
      class_243 var10000;
      switch (face) {
         case field_11036 -> var10000 = new class_243(var6 + u, var8 + (double)1.0F, var10 + v);
         case field_11033 -> var10000 = new class_243(var6 + u, var8, var10 + v);
         case field_11043 -> var10000 = new class_243(var6 + u, var8 + v, var10);
         case field_11035 -> var10000 = new class_243(var6 + u, var8 + v, var10 + (double)1.0F);
         case field_11039 -> var10000 = new class_243(var6, var8 + v, var10 + u);
         case field_11034 -> var10000 = new class_243(var6 + (double)1.0F, var8 + v, var10 + u);
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   static int IiIiliIiiiIi(double turn, double rate) {
      return turn <= rate ? 0 : (int)Math.ceil(turn / rate) - 1;
   }

   public static int IilliliilIIi(int clicks) {
      return Math.max(0, clicks) + 2;
   }

   static double IIIllIIliIIl(int cells) {
      return IlIlllIlilIl(cells, (double)3.0F);
   }

   static boolean IiIlliIliiIl(float[] steps) {
      long var4 = -7952563505298268031L;
      if (steps != null && steps.length != 0) {
         double var1 = (double)3.5F;

         for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < steps.length; var6 += 4294967296L) {
            if (!Float.isNaN(steps[(int)(var6 >>> 32)])) {
               var1 -= ((double)steps[(int)(var6 >>> 32)] + 0.3) * 0.3;
            }

            if (var1 <= (double)0.0F) {
               return false;
            }

            if ((int)(var6 >>> 32) == steps.length - 1) {
               return true;
            }

            var1 -= 0.225;
         }

         return false;
      } else {
         return false;
      }
   }
}
