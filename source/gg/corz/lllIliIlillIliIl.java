package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1675;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1890;
import net.minecraft.class_1893;
import net.minecraft.class_2199;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2272;
import net.minecraft.class_2304;
import net.minecraft.class_2312;
import net.minecraft.class_2323;
import net.minecraft.class_2328;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2378;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2397;
import net.minecraft.class_2401;
import net.minecraft.class_2406;
import net.minecraft.class_2428;
import net.minecraft.class_243;
import net.minecraft.class_2533;
import net.minecraft.class_2680;
import net.minecraft.class_2694;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3711;
import net.minecraft.class_3713;
import net.minecraft.class_3718;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3962;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_4969;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_5455;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_7924;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class lllIliIlillIliIl {
   private static final double lIIIIiiIll = 0.1;
   public static final class_2350[] IiliiliIll;
   public static final int IIiiiliIll = 10;
   private static final double IIIIIiiIll = 0.4;
   public static final class_2350[] liliiliIll;
   private static class_6880<class_1887> IiIIIiiIll;
   private static final double iiiiiliIll = (double)0.5F;
   public static final double iiliiliIll = (double)3.0F;
   private static final class_310 IlIIIiiIll;
   public static final double illiiliIll = 0.1;
   private static final double liiiiliIll = (double)0.4F;
   private static final int[][] lliiiliIll;
   private static final class_1304[] IiiiiliIll;
   private static final double[] lIiiiliIll;
   public static final double IlliiliIll = (double)3.0F;
   private static final int IliiiliIll = 16;
   public static final double llliiliIll = 4.4;
   private static final double[] iIiiiliIll;
   private static final int iIIIIiiIll = 1;
   private static class_5455 llIIIiiIll;
   private static final double iliiiliIll = (double)2.0F;
   private static class_6880<class_1887> ilIIIiiIll;

   public static boolean IIIllIIliIIl(class_2338 base) {
      return IliIlllilIi(base) && IlIIIiiIll.field_1687.method_22347(base.method_10084()) && IlIIIiiIll.field_1687.method_8335((class_1297)null, iIlIlllllill(base)).isEmpty();
   }

   public static boolean IliIlllilIi(class_2338 pos) {
      class_2680 var1 = IlIIIiiIll.field_1687.method_8320(pos);
      return var1.method_27852(class_2246.field_10540) || var1.method_27852(class_2246.field_9987);
   }

   public static boolean IlIillIiilIi(class_2338 cell) {
      if (IlIIIiiIll.field_1687.method_8320(cell).method_45474() && IlIIIiiIll.field_1687.method_22347(cell.method_10084())) {
         return !IlIIIiiIll.field_1687.method_8628(class_2246.field_10540.method_9564(), cell, class_3726.method_16194()) ? false : IlIIIiiIll.field_1687.method_8335((class_1297)null, iIlIlllllill(cell)).isEmpty();
      } else {
         return false;
      }
   }

   public static boolean IlIlllIlilIl() {
      return IlIIIiiIll.field_1724.method_7294();
   }

   public static boolean IiIiliIiiiIi() {
      class_1293 var0 = IlIIIiiIll.field_1724.method_6112(class_1294.field_5911);
      if (var0 == null) {
         return true;
      } else {
         class_1293 var1 = IlIIIiiIll.field_1724.method_6112(class_1294.field_5910);
         double var2 = (double)1.0F - (double)4.0F * (double)(var0.method_5578() + 1) + (var1 == null ? (double)0.0F : (double)3.0F * (double)(var1.method_5578() + 1));
         return var2 > (double)0.0F;
      }
   }

   private static class_243 ilillIiill(class_243 yaw, float pitch, float eye, double reach) {
      return yaw.method_1019(IlIIIiiIll.field_1724.method_5631(eye, pitch).method_1021(reach + (double)1.0F));
   }

   public static boolean IiIlliIliiIl(class_2338 base) {
      long var2 = -817059958314560252L;
      if (IlIIIiiIll.field_1724.method_7294()) {
         return true;
      } else {
         var2 ^= ((long)IilIIililIIi.lIiiIiIlilli(class_1802.field_8301) << 32 ^ var2) & -1L << 32;
         return (int)(var2 >>> 32) >= 0 && IlIIIiiIll.field_1724.method_31548().method_5438((int)(var2 >>> 32)).method_57357(new class_2694(IlIIIiiIll.field_1687, base, false));
      }
   }

   public static boolean lilIliilIl(class_243 antiSuicide, class_2338 center, boolean maxSelfDamage, float virtualSolid) {
      class_746 var4 = IlIIIiiIll.field_1724;
      float var5 = illIlIilIl(antiSuicide, center);
      return liiIIliliiiIIlil.IIlllIlliIll(var5, var4.method_6032(), var4.method_6067(), maxSelfDamage, virtualSolid);
   }

   public static float lIlIliIlIl(class_243 virtualSolid, class_238 box, class_1297 context, class_2338 center) {
      return IllIllllIl(virtualSolid, box, context, center, (class_2338)null);
   }

   public static boolean lIilliIill(class_243 yaw, float pitch, float reach, class_1297 eye, double target) {
      if (!iilllIIill(yaw, pitch, reach, eye, target)) {
         return false;
      } else {
         class_238 var6 = eye.method_5829();
         return var6.method_1006(yaw) ? true : liiIIliliiiIIlil.Iilililiiili(var6, yaw, ilillIiill(yaw, pitch, reach, target), 0.1);
      }
   }

   public static boolean Iillllilll(float look, float pitch, float[] yaw, float gcd) {
      if (yaw != null && yaw.length >= 2 && gcd > 0.0F && Float.isFinite(gcd)) {
         return Math.abs(liiIIliliiiIIlil.Illlllllilll((double)yaw[0] - (double)look)) <= (double)gcd && Math.abs((double)yaw[1] - (double)pitch) <= (double)gcd;
      } else {
         return false;
      }
   }

   public static boolean iiIIlIIlIl(class_2338 cell, class_243 reach, double eye) {
      long var9 = -5657208461562899946L;
      class_2350[] var4 = IiliiliIll;
      var9 ^= ((long)var4.length << 32 ^ var9) & -1L << 32;

      for(long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         class_2350 var7 = var4[(int)var12];
         if (lililiilil(reach, cell, var7)) {
            class_243 var8 = IIiillIiil(cell, var7, (double)0.5F, (double)0.5F);
            if (!(reach.method_1025(var8) > eye * eye) && IiIIlliIIl(reach, var8)) {
               return true;
            }
         }
      }

      return false;
   }

   static {
      IiliiliIll = new class_2350[]{class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034};
      liliiliIll = new class_2350[]{class_2350.field_11036};
      lIiiiliIll = new double[]{0.2, 0.35, (double)0.5F, 0.65, 0.8};
      iIiiiliIll = new double[]{(double)0.25F, (double)0.5F, (double)0.75F};
      lliiiliIll = new int[][]{{0, -1}, {0, 1}, {-1, 0}, {1, 0}, {-1, -1}, {1, -1}, {-1, 1}, {1, 1}};
      IiiiiliIll = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
      IlIIIiiIll = class_310.method_1551();
   }

   public static double IIlilIliiIli(class_243 box, class_238 eye) {
      return liiIIliliiiIIlil.Illillliilli(box.field_1352, box.field_1351, box.field_1350, eye.field_1323, eye.field_1322, eye.field_1321, eye.field_1320, eye.field_1325, eye.field_1324);
   }

   public static class_243 illilIilil(class_2338 pos, class_2350 face) {
      return IIiillIiil(pos, face, (double)0.5F, (double)0.5F);
   }

   public static class_243 Iiiiliiiiiii(class_238 fromPitch, class_1297 box, class_243 entity, float reach, float eye, double fromYaw) {
      return IIIIllIIIl(fromPitch, box, entity, reach, eye, fromYaw, (double)0.0F);
   }

   public static class_243 liiiIIllIl(class_2338 base) {
      return new class_243((double)base.method_10263() + (double)0.5F, (double)base.method_10264() + (double)1.0F, (double)base.method_10260() + (double)0.5F);
   }

   private static void IiIilliIil(double[] v, double uz, double resistance, double onGround, double strength, boolean ux) {
      double var10 = uz * ((double)1.0F - resistance);
      if (var10 > (double)0.0F) {
         v[0] = v[0] / (double)2.0F + onGround * var10;
         v[1] = ux ? Math.min(0.4, v[1] / (double)2.0F + var10) : v[1];
         v[2] = v[2] / (double)2.0F + strength * var10;
      }
   }

   public static float illIlIilIl(class_243 center, class_2338 virtualSolid) {
      class_746 var2 = IlIIIiiIll.field_1724;
      if (var2 != null && IlIIIiiIll.field_1687 != null && !var2.method_68878() && !var2.method_7325()) {
         double var3 = Math.sqrt(var2.method_5707(center));
         if (var3 > (double)12.0F) {
            return 0.0F;
         } else {
            float var5 = lIlIliIlIl(center, var2.method_5829(), var2, virtualSolid);
            float var6 = (float)liiIIliliiiIIlil.IliIlllilIi(var3, (double)var5, (double)6.0F);
            class_1293 var7 = var2.method_6112(class_1294.field_5907);
            return liiIIliliiiIIlil.IiIlliIliiIl(var6, IlIIIiiIll.field_1687.method_8407().method_5461(), (float)var2.method_45325(class_5134.field_23724), (float)var2.method_45325(class_5134.field_23725), var7 == null ? -1 : var7.method_5578(), IIiIllIiIl(var2));
         }
      } else {
         return 0.0F;
      }
   }

   public static boolean Illillliilli(class_243 point, class_243 halfAngle, float eye, double viewYaw) {
      return liiIIliliiiIIlil.IIIilIIiiIIi(halfAngle.field_1352 - point.field_1352, halfAngle.field_1350 - point.field_1350, eye, viewYaw);
   }

   public static float[] lllllillll(class_243 yaw, float eye, float gcd, float lands, Predicate<class_239> pitch) {
      long var16 = -2199268041919182180L;
      long var14 = -291887231049512907L;
      if (yaw != null && pitch != null && lands > 0.0F && Float.isFinite(lands)) {
         var14 ^= ((long)Math.max(1, Math.min(10, (int)Math.ceil((double)3.0F / (double)lands))) << 32 ^ var14) & -1L << 32;

         for(long var19 = var14 ^ (1L ^ var14) & -1L >>> 32; (int)var19 <= (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
            float var7 = (float)((int)var19) * lands;
            int[][] var8 = lliiiliIll;
            var16 ^= ((long)var8.length << 32 ^ var16) & -1L << 32;

            for(var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
               int[] var11 = var8[(int)var16];
               float var12 = eye + (float)var11[0] * var7;
               float var13 = gcd + (float)var11[1] * var7;
               if (!(var13 < -90.0F) && !(var13 > 90.0F) && pitch.test(Iilililiiili(yaw, var12, var13))) {
                  return new float[]{var12, var13};
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   private static void lliIliliIl() {
      class_5455 var0 = IlIIIiiIll.field_1687.method_30349();
      if (var0 != llIIIiiIll) {
         llIIIiiIll = var0;
         ilIIIiiIll = liilliiill(var0, class_1893.field_9111);
         IiIIIiiIll = liilliiill(var0, class_1893.field_9107);
      }

   }

   public static class_1511 IIlllIlliIll(class_2338 base) {
      class_2338 var1 = base.method_10084();

      for(class_1511 var3 : IlIIIiiIll.field_1687.method_8390(class_1511.class, iIlIlllllill(base), (e) -> e.method_5805() && !e.method_31481())) {
         if (var3.method_24515().equals(var1)) {
            return var3;
         }
      }

      return null;
   }

   public static class_238 IilliliilIIi(class_2338 base) {
      return new class_238((double)base.method_10263() - (double)0.5F, (double)base.method_10264() + (double)1.0F, (double)base.method_10260() - (double)0.5F, (double)base.method_10263() + (double)1.5F, (double)base.method_10264() + (double)3.0F, (double)base.method_10260() + (double)1.5F);
   }

   static boolean lililiilil(class_243 face, class_2338 eye, class_2350 pos) {
      boolean var10000;
      switch (pos) {
         case field_11036 -> var10000 = face.field_1351 > (double)eye.method_10264() + (double)1.0F;
         case field_11033 -> var10000 = face.field_1351 < (double)eye.method_10264();
         case field_11043 -> var10000 = face.field_1350 < (double)eye.method_10260();
         case field_11035 -> var10000 = face.field_1350 > (double)eye.method_10260() + (double)1.0F;
         case field_11039 -> var10000 = face.field_1352 < (double)eye.method_10263();
         case field_11034 -> var10000 = face.field_1352 > (double)eye.method_10263() + (double)1.0F;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private static lIllililiIllilil Illillllil(class_243 eye, class_243 fromPitch, float fromYaw, float point) {
      float[] var4 = ilIiiIiIii.Ililllililil(eye, fromPitch);
      return new lIllililiIllilil(fromPitch, var4[0], var4[1], liiIIliliiiIIlil.Iilllilliill(fromYaw, point, var4[0], var4[1]));
   }

   public static float ilIllIiIll(class_1309 distance, double e, float power) {
      return iiIiiliIIliili.IliIlllilIi((float)liiIIliliiiIIlil.IliIlllilIi(e, (double)1.0F, (double)power), IiiIlliiIl(distance));
   }

   public static boolean Iilllilliill(class_2338 face, class_2350 pos) {
      class_2680 var2 = IlIIIiiIll.field_1687.method_8320(face);
      return !var2.method_31709() && !IIIilIIiiIIi(var2.method_26204()) ? var2.method_26206(IlIIIiiIll.field_1687, face, pos) : false;
   }

   public static float IlIllllIll(class_1309 center, class_243 feet, class_243 virtualSolid, class_238 e, class_2338 box, class_2338 power, float virtualAir) {
      if (center instanceof class_1657 var7) {
         if (var7.method_68878() || var7.method_7325()) {
            return 0.0F;
         }
      }

      return iiIiiliIIliili.IliIlllilIi(lIIlliIIll(feet, virtualSolid, e, center, box, power, virtualAir), IiiIlliiIl(center));
   }

   public static class_239 Iilililiiili(class_243 eye, float pitch, float yaw) {
      class_746 var3 = IlIIIiiIll.field_1724;
      double var4 = var3.method_55754();
      double var6 = Math.max(var4, (double)3.0F);
      class_243 var8 = var3.method_5631(yaw, pitch);
      class_243 var9 = eye.method_1019(var8.method_1021(var6));
      class_3965 var10 = IlIIIiiIll.field_1687.method_17742(new class_3959(eye, var9, class_3960.field_17559, class_242.field_1348, var3));
      double var11 = eye.method_1025(var10.method_17784());
      double var13 = var6 * var6;
      double var15 = var6;
      if (var10.method_17783() != class_240.field_1333) {
         var13 = var11;
         var15 = Math.sqrt(var11);
      }

      class_243 var17 = eye.method_1019(var8.method_1021(var15));
      class_238 var18 = var3.method_5829().method_18804(var8.method_1021(var15)).method_1014((double)1.0F);
      class_3966 var19 = class_1675.method_18075(var3, eye, var17, var18, (e) -> !e.method_7325() && e.method_5863(), var13);
      if (var19 != null && eye.method_1025(var19.method_17784()) < var11) {
         return eye.method_1025(var19.method_17784()) < (double)9.0F ? var19 : null;
      } else {
         return var10.method_17783() == class_240.field_1332 && !(var11 > var4 * var4) ? var10 : null;
      }
   }

   public static boolean liIlliiIll(class_1309 e) {
      return e.method_6047().method_31574(class_1802.field_8288) || e.method_6079().method_31574(class_1802.field_8288);
   }

   private static boolean iIiilIliil(class_243 eye, class_238 box, class_2350 face) {
      boolean var10000;
      switch (face) {
         case field_11036 -> var10000 = eye.field_1351 > box.field_1325;
         case field_11033 -> var10000 = eye.field_1351 < box.field_1322;
         case field_11043 -> var10000 = eye.field_1350 < box.field_1321;
         case field_11035 -> var10000 = eye.field_1350 > box.field_1324;
         case field_11039 -> var10000 = eye.field_1352 < box.field_1323;
         case field_11034 -> var10000 = eye.field_1352 > box.field_1320;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public static iIIlIIiIlIlIIi IIIillIIil(class_1309 knockedBack, int target, boolean ticks) {
      return iIIilIlIil(knockedBack, target, ticks, false);
   }

   public static class_238 lIiiIiIlilli(class_2338 pos) {
      return new class_238((double)pos.method_10263(), (double)pos.method_10264(), (double)pos.method_10260(), (double)pos.method_10263() + (double)1.0F, (double)pos.method_10264() + (double)1.0F, (double)pos.method_10260() + (double)1.0F);
   }

   public static boolean Ilillllill(class_243 target, float reach, float innerReach, class_1297 yaw, double eye, double pitch) {
      if (!iilllIIill(target, reach, innerReach, yaw, eye)) {
         return false;
      } else {
         class_238 var8 = yaw.method_5829();
         if (var8.method_1006(target)) {
            return true;
         } else {
            class_243 var9 = target.method_1019(IlIIIiiIll.field_1724.method_5631(innerReach, reach).method_1021(Math.max((double)0.0F, pitch)));
            return liiIIliliiiIIlil.Iilililiiili(var8, target, var9, 0.1);
         }
      }
   }

   public static iiIllIlIIlllIl iiiIlIIIll(class_1309 e) {
      class_1293 var1 = e.method_6112(class_1294.field_5907);
      return new iiIllIlIIlllIl((float)e.method_45325(class_5134.field_23724), (float)e.method_45325(class_5134.field_23725), var1 == null ? -1 : var1.method_5578(), IIiIllIiIl(e), IiiIlliiIl(e));
   }

   public static iIIlIIiIlIlIIi IIllllIlll(iIIlIIiIlIlIIi p, class_243 by) {
      return new iIIlIIiIlIlIIi(p.IliIlllilIi().method_1019(by), p.liiiIIllIl().method_997(by));
   }

   public static class_238 iIlIlllllill(class_2338 base) {
      return new class_238((double)base.method_10263(), (double)base.method_10264() + (double)1.0F, (double)base.method_10260(), (double)base.method_10263() + (double)1.0F, (double)base.method_10264() + (double)3.0F, (double)base.method_10260() + (double)1.0F);
   }

   public static boolean IiIIlliIIl(class_243 point, class_243 eye) {
      class_243 var2 = eye.method_1020(point);
      double var3 = var2.method_1033();
      if (var3 < 1.0E-4) {
         return true;
      } else {
         class_243 var5 = point.method_1019(var2.method_1021(Math.max((double)0.0F, var3 - 0.05) / var3));
         return IlIIIiiIll.field_1687.method_17742(new class_3959(point, var5, class_3960.field_17559, class_242.field_1348, IlIIIiiIll.field_1724)).method_17783() == class_240.field_1333;
      }
   }

   public static float[] iIlllIllll(class_243 side, float pos, float eye, class_2338 gcd, class_2350 pitch, float yaw) {
      long var12 = -1165531691463493904L;
      long var14 = 7835552932381872948L;
      var12 ^= ((long)Math.max(1, Math.min(3, (int)Math.floor((double)1.5F / Math.max((double)yaw, 0.001)))) << 32 ^ var12) & -1L << 32;
      float var7 = (float)(1 + ThreadLocalRandom.current().nextInt((int)(var12 >>> 32))) * yaw;
      float[][] var8 = new float[][]{{pos + var7, eye}, {pos - var7, eye}, {pos, eye + var7}, {pos, eye - var7}};
      var12 ^= ((long)ThreadLocalRandom.current().nextInt(var8.length) ^ var12) & -1L >>> 32;

      for(long var18 = var14 ^ (0L ^ var14) & -1L << 32; (int)(var18 >>> 32) < var8.length; var18 += 4294967296L) {
         float[] var11 = var8[((int)var12 + (int)(var18 >>> 32)) % var8.length];
         if (!(var11[1] < -90.0F) && !(var11[1] > 90.0F) && IIiilIiiiIii(Iilililiiili(side, var11[0], var11[1]), gcd, pitch, side, 4.4) != null) {
            return var11;
         }
      }

      return null;
   }

   public static double lIliliIlil(iIIlIIiIlIlIIi virtualSolid, class_1297 target, class_243 center, class_2338 predicted) {
      double var4 = virtualSolid.IliIlllilIi().method_1022(center);
      if (var4 > (double)12.0F) {
         return (double)0.0F;
      } else {
         float var6 = lIlIliIlIl(center, virtualSolid.liiiIIllIl(), target, predicted);
         return liiIIliliiiIIlil.iIlIlllllill(liiIIliliiiIIlil.IliIlllilIi(var4, (double)var6, (double)6.0F));
      }
   }

   public static boolean Ililllililil(class_2338 cell) {
      long var5 = -269280673499349340L;
      class_2350[] var1 = class_2350.values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         class_2350 var4 = var1[(int)var8];
         if (IIillIiliIil(cell.method_10093(var4), var4.method_10153())) {
            return true;
         }
      }

      return false;
   }

   public static boolean IIillIiliIil(class_2338 face, class_2350 pos) {
      return Iilllilliill(face, pos) || IlIIIiiIll.field_1687.method_8320(face).method_26204() instanceof class_2397;
   }

   public static boolean Illlllllilll(class_2338 pos) {
      return Iilllilliill(pos, class_2350.field_11036);
   }

   private lllIliIlillIliIl() {
   }

   public static class_3965 Iliilliiilii(class_2338 pos, class_2350[] fromPitch, class_2350 eye, class_243 reach, float faces, float fromYaw, double requiredSide) {
      long var24 = -5937328870215734016L;
      long var26 = -6335309397073412842L;
      long var28 = -8488883765591063620L;
      long var30 = -6884170936318428546L;
      ArrayList var8 = new ArrayList();
      class_2350[] var9 = fromPitch;
      var24 ^= ((long)fromPitch.length << 32 ^ var24) & -1L << 32;

      for(long var34 = var24 ^ (0L ^ var24) & -1L >>> 32; (int)var34 < (int)(var34 >>> 32); var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32) {
         class_2350 var12 = var9[(int)var34];
         if (lililiilil(reach, pos, var12)) {
            double[] var13 = lIiiiliIll;
            var26 ^= ((long)var13.length << 32 ^ var26) & -1L << 32;

            for(var26 ^= (0L ^ var26) & -1L >>> 32; (int)var26 < (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
               double var16 = var13[(int)var26];
               double[] var18 = lIiiiliIll;
               var28 ^= ((long)var18.length << 32 ^ var28) & -1L << 32;

               for(var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < (int)(var28 >>> 32); var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
                  double var21 = var18[(int)var28];
                  class_243 var23 = IIiillIiil(pos, var12, var16, var21);
                  if (!(reach.method_1025(var23) > requiredSide * requiredSide)) {
                     var8.add(Illillllil(reach, var23, faces, fromYaw));
                  }
               }
            }
         }
      }

      var8.sort(Comparator.comparingDouble(lIllililiIllilil::IilliliilIIi));
      var30 ^= (0L ^ var30) & -1L << 32;

      for(lIllililiIllilil var11 : var8) {
         int var10000 = (int)(var30 >>> 32);
         var30 += 4294967296L;
         if (var10000 >= 16) {
            break;
         }

         class_3965 var32 = IIiilIiiiIii(Iilililiiili(reach, var11.liiiIIllIl(), var11.iIlIlllllill()), pos, eye, reach, requiredSide);
         if (var32 != null) {
            return var32;
         }
      }

      return null;
   }

   public static double iiIilIIlil(class_1309 target) {
      long var7 = -4746067257477370786L;
      if (target == null) {
         return (double)0.0F;
      } else {
         class_1792[] var1 = new class_1792[]{class_1802.field_22027, class_1802.field_22028, class_1802.field_22029, class_1802.field_22030};
         var7 ^= (0L ^ var7) & -1L << 32;

         for(var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < IiiiiliIll.length; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            class_1799 var4 = target.method_6118(IiiiiliIll[(int)var7]);
            if (var4 != null && var4.method_31574(var1[(int)var7])) {
               var7 += 4294967296L;
            }
         }

         double var3 = (double)0.0F;
         if (target.method_6127() != null && target.method_6127().method_45331(class_5134.field_23718)) {
            var3 = target.method_45325(class_5134.field_23718);
         }

         double var5 = Math.max(Double.isFinite(var3) ? var3 : (double)0.0F, 0.1 * (double)((int)(var7 >>> 32)));
         return Math.max((double)0.0F, Math.min((double)1.0F, var5));
      }
   }

   public static ilIIiiiIiIIiii Iiilliiliiil(class_2338 reach, class_243 eye, float cell, float fromYaw, double fromPitch) {
      long var19 = 1365171782322191787L;
      ilIIiiiIiIIiii var6 = null;
      double var7 = Double.POSITIVE_INFINITY;
      class_2350[] var9 = class_2350.values();
      var19 ^= ((long)var9.length << 32 ^ var19) & -1L << 32;

      for(long var22 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         class_2350 var12 = var9[(int)var22];
         class_2338 var13 = reach.method_10093(var12);
         class_2350 var14 = var12.method_10153();
         if (IIillIiliIil(var13, var14)) {
            class_3965 var15 = Iliilliiilii(var13, new class_2350[]{var14}, var14, eye, cell, fromYaw, fromPitch);
            if (var15 != null) {
               float[] var16 = ilIiiIiIii.Ililllililil(eye, var15.method_17784());
               double var17 = liiIIliliiiIIlil.Iilllilliill(cell, fromYaw, var16[0], var16[1]);
               if (var17 < var7) {
                  var7 = var17;
                  var6 = new ilIIiiiIiIIiii(var13.method_10062(), var14);
               }
            }
         }
      }

      return var6;
   }

   public static class_3965 IIiilIiiiIii(class_239 requiredSide, class_2338 pos, class_2350 hit, class_243 eye, double reach) {
      if (requiredSide instanceof class_3965 var6) {
         if (var6.method_17783() == class_240.field_1332) {
            if (!var6.method_17777().equals(pos)) {
               return null;
            }

            if (hit != null && var6.method_17780() != hit) {
               return null;
            }

            if (eye.method_1025(var6.method_17784()) > reach * reach) {
               return null;
            }

            return var6;
         }
      }

      return null;
   }

   private static class_6880<class_1887> liilliiill(class_5455 registries, class_5321<class_1887> key) {
      Optional var2 = registries.method_46759(class_7924.field_41265);
      if (var2.isEmpty()) {
         return null;
      } else {
         Optional var3 = ((class_2378)var2.get()).method_46746(key);
         return var3.isPresent() ? (class_6880)var3.get() : null;
      }
   }

   public static double[] llIililIil(double vy, double kbLevel, double vz, double dirZ, double vx, boolean dirX, double resistance, int onGround) {
      double[] var14 = new double[]{vy, kbLevel, vz};
      double var15 = Math.sqrt(dirZ * dirZ + vx * vx);
      double var17 = var15 > 1.0E-4 ? dirZ / var15 : (double)0.0F;
      double var19 = var15 > 1.0E-4 ? vx / var15 : (double)0.0F;
      double var21 = resistance > (double)0.0F ? Math.min((double)1.0F, resistance) : (double)0.0F;
      IiIilliIil(var14, (double)0.4F, var21, var17, var19, dirX);
      if (onGround > 0) {
         IiIilliIil(var14, (double)0.5F * (double)onGround, var21, var17, var19, dirX);
      }

      return var14;
   }

   public static float IllIllllIl(class_243 virtualSolid, class_238 box, class_1297 center, class_2338 context, class_2338 virtualAir) {
      long var27 = 6823398095850552935L;
      long var29 = 693594267514099650L;
      double var5 = (double)1.0F / ((box.field_1320 - box.field_1323) * (double)2.0F + (double)1.0F);
      double var7 = (double)1.0F / ((box.field_1325 - box.field_1322) * (double)2.0F + (double)1.0F);
      double var9 = (double)1.0F / ((box.field_1324 - box.field_1321) * (double)2.0F + (double)1.0F);
      if (!(var5 < (double)0.0F) && !(var7 < (double)0.0F) && !(var9 < (double)0.0F)) {
         double var11 = ((double)1.0F - Math.floor((double)1.0F / var5) * var5) / (double)2.0F;
         double var13 = ((double)1.0F - Math.floor((double)1.0F / var9) * var9) / (double)2.0F;
         class_238 var15 = context == null ? null : new class_238((double)context.method_10263(), (double)context.method_10264(), (double)context.method_10260(), (double)context.method_10263() + (double)1.0F, (double)context.method_10264() + (double)1.0F - 0.001, (double)context.method_10260() + (double)1.0F);
         var27 ^= (0L ^ var27) & -1L << 32;
         var27 ^= (0L ^ var27) & -1L >>> 32;

         for(double var18 = (double)0.0F; var18 <= (double)1.0F; var18 += var5) {
            for(double var20 = (double)0.0F; var20 <= (double)1.0F; var20 += var7) {
               for(double var22 = (double)0.0F; var22 <= (double)1.0F; var22 += var9) {
                  class_243 var24 = new class_243(class_3532.method_16436(var18, box.field_1323, box.field_1320) + var11, class_3532.method_16436(var20, box.field_1322, box.field_1325), class_3532.method_16436(var22, box.field_1321, box.field_1324) + var13);
                  class_3965 var25 = IlIIIiiIll.field_1687.method_17742(new class_3959(var24, virtualSolid, class_3960.field_17558, class_242.field_1348, center));
                  var29 ^= ((long)(var25.method_17783() != class_240.field_1333 && (virtualAir == null || !var25.method_17777().equals(virtualAir)) ? 0 : 1) << 32 ^ var29) & -1L << 32;
                  if ((int)(var29 >>> 32) != 0 && var15 != null && var15.method_992(var24, virtualSolid).isPresent()) {
                     var29 ^= (0L ^ var29) & -1L << 32;
                  }

                  if ((int)(var29 >>> 32) != 0) {
                     var27 += 4294967296L;
                  }

                  var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32;
               }
            }
         }

         return (int)var27 == 0 ? 0.0F : (float)((int)(var27 >>> 32)) / (float)((int)var27);
      } else {
         return 0.0F;
      }
   }

   public static boolean iilllIIill(class_243 eye, float reach, float target, class_1297 yaw, double pitch) {
      if (yaw != null && IlIIIiiIll.field_1724 != null) {
         class_239 var7 = Iilililiiili(eye, reach, target);
         if (var7 instanceof class_3966) {
            class_3966 var6 = (class_3966)var7;
            if (var6.method_17782() == yaw) {
               class_238 var10 = yaw.method_5829();
               if (var10.method_1006(eye)) {
                  return true;
               }

               class_243 var8 = eye.method_1019(IlIIIiiIll.field_1724.method_5631(target, reach).method_1021(pitch));
               Optional var9 = var10.method_992(eye, var8);
               return var9.isPresent() && eye.method_1025((class_243)var9.get()) < pitch * pitch && IiIIlliIIl(eye, (class_243)var9.get());
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static iIIlIIiIlIlIIi iIIilIlIil(class_1309 fromServerPos, int target, boolean knockedBack, boolean ticks) {
      long var19 = 7453548318467369620L;
      long var21 = 5220196030245944677L;
      class_243 var4 = fromServerPos.method_73189();
      double var5 = var4.field_1352 - fromServerPos.field_6014;
      double var7 = var4.field_1351 - fromServerPos.field_6036;
      double var9 = var4.field_1350 - fromServerPos.field_5969;
      if (var5 * var5 + var7 * var7 + var9 * var9 > (double)4.0F) {
         var5 = (double)0.0F;
         var7 = (double)0.0F;
         var9 = (double)0.0F;
      }

      if (knockedBack && IlIIIiiIll.field_1724 != null) {
         double var11 = var4.field_1352 - IlIIIiiIll.field_1724.method_23317();
         double var13 = var4.field_1350 - IlIIIiiIll.field_1724.method_23321();
         double var15 = Math.sqrt(var11 * var11 + var13 * var13);
         if (var15 > 1.0E-4) {
            var11 /= var15;
            var13 /= var15;
         } else {
            var11 = (double)0.0F;
            var13 = (double)0.0F;
         }

         double[] var17 = llIililIil(var5, var7, var9, var11, var13, fromServerPos.method_24828(), iiIilIIlil(fromServerPos), 1);
         var5 = var17[0];
         var7 = var17[1];
         var9 = var17[2];
      }

      class_238 var24 = fromServerPos.method_5829();
      if (ticks) {
         class_243 var12 = fromServerPos.method_66233() != null ? fromServerPos.method_66233().method_66265() : var4;
         var24 = var24.method_997(var12.method_1020(var4));
      }

      for(var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < target; var19 += 4294967296L) {
         class_243 var27 = new class_243(var5, var7, var9);
         class_243 var14 = class_1297.method_20736(fromServerPos, var27, var24, IlIIIiiIll.field_1687, List.of());
         var24 = var24.method_997(var14);
         var19 ^= ((long)(Math.abs(var14.field_1351 - var27.field_1351) > 1.0E-6 ? 1 : 0) ^ var19) & -1L >>> 32;
         var21 ^= ((long)((int)var19 != 0 && var27.field_1351 < (double)0.0F ? 1 : 0) << 32 ^ var21) & -1L << 32;
         if (Math.abs(var14.field_1352 - var27.field_1352) > 1.0E-6) {
            var5 = (double)0.0F;
         }

         if (Math.abs(var14.field_1350 - var27.field_1350) > 1.0E-6) {
            var9 = (double)0.0F;
         }

         if ((int)var19 != 0) {
            var7 = (double)0.0F;
         }

         var7 = (var7 - 0.08) * 0.98;
         double var28 = (int)(var21 >>> 32) != 0 ? 0.546 : 0.91;
         var5 *= var28;
         var9 *= var28;
      }

      class_243 var25 = new class_243((var24.field_1323 + var24.field_1320) / (double)2.0F, var24.field_1322, (var24.field_1321 + var24.field_1324) / (double)2.0F);
      return new iIIlIIiIlIlIIi(var25, var24);
   }

   public static float lIIlliIIll(class_243 virtualAir, class_243 context, class_238 center, class_1297 virtualSolid, class_2338 feet, class_2338 power, float box) {
      double var7 = context.method_1022(virtualAir);
      return var7 > (double)box * (double)2.0F ? 0.0F : (float)liiIIliliiiIIlil.IliIlllilIi(var7, (double)IllIllllIl(virtualAir, center, virtualSolid, feet, power), (double)box);
   }

   public static class_243 llIIlilIIl(class_238 yaw, class_243 reach, float eye, float pitch, double box) {
      if (yaw != null && reach != null && IlIIIiiIll.field_1724 != null) {
         class_243 var6 = reach.method_1019(IlIIIiiIll.field_1724.method_5631(pitch, eye).method_1021(box));
         if (yaw.method_1006(reach)) {
            return var6;
         } else {
            Optional var7 = yaw.method_992(reach, var6);
            return var7.isPresent() && IiIIlliIIl(reach, (class_243)var7.get()) ? (class_243)var7.get() : null;
         }
      } else {
         return null;
      }
   }

   public static float iIiIlIliIl(class_1309 entity) {
      long var7 = 6942517213041288875L;
      long var9 = 1314802202763215960L;
      lliIliliIl();
      if (ilIIIiiIll == null) {
         return 0.0F;
      } else {
         var7 ^= (0L ^ var7) & -1L << 32;
         class_1304[] var2 = IiiiiliIll;
         var7 ^= ((long)var2.length ^ var7) & -1L >>> 32;

         for(long var13 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var13 >>> 32) < (int)var7; var13 += 4294967296L) {
            class_1304 var5 = var2[(int)(var13 >>> 32)];
            class_1799 var6 = entity.method_6118(var5);
            if (!var6.method_7960()) {
               var7 ^= ((long)((int)(var7 >>> 32) + class_1890.method_8225(ilIIIiiIll, var6)) << 32 ^ var7) & -1L << 32;
            }
         }

         return (float)((int)(var7 >>> 32));
      }
   }

   static boolean IIIilIIiiIIi(class_2248 block) {
      return block instanceof class_2304 || block instanceof class_2428 || block instanceof class_4969 || block instanceof class_3711 || block instanceof class_2406 || block instanceof class_2533 || block instanceof class_2323 || block instanceof class_2349 || block instanceof class_2269 || block instanceof class_2401 || block instanceof class_2199 || block instanceof class_3713 || block instanceof class_3718 || block instanceof class_2312 || block instanceof class_2272 || block instanceof class_3962 || block instanceof class_2328;
   }

   public static int IiiIlliiIl(class_1309 e) {
      return e instanceof class_1657 && IlIIIiiIll.field_1687 != null ? IlIIIiiIll.field_1687.method_8407().method_5461() : -1;
   }

   public static boolean iIIIlIlIIl(class_238 yaw, class_243 box, float pitch, float eye, double reach) {
      if (yaw.method_1006(box)) {
         return true;
      } else {
         class_243 var6 = box.method_1019(IlIIIiiIll.field_1724.method_5631(eye, pitch).method_1021(reach));
         Optional var7 = yaw.method_992(box, var6);
         return var7.isPresent() && IiIIlliIIl(box, (class_243)var7.get());
      }
   }

   static class_243 IIiillIiil(class_2338 pos, class_2350 u, double v, double face) {
      double var6 = (double)pos.method_10263();
      double var8 = (double)pos.method_10264();
      double var10 = (double)pos.method_10260();
      class_243 var10000;
      switch (u) {
         case field_11036 -> var10000 = new class_243(var6 + v, var8 + (double)1.0F, var10 + face);
         case field_11033 -> var10000 = new class_243(var6 + v, var8, var10 + face);
         case field_11043 -> var10000 = new class_243(var6 + v, var8 + face, var10);
         case field_11035 -> var10000 = new class_243(var6 + v, var8 + face, var10 + (double)1.0F);
         case field_11039 -> var10000 = new class_243(var6, var8 + face, var10 + v);
         case field_11034 -> var10000 = new class_243(var6 + (double)1.0F, var8 + face, var10 + v);
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public static float IIiIllIiIl(class_1309 entity) {
      long var7 = -6372203745564492268L;
      long var9 = -6744037100690786093L;
      lliIliliIl();
      var7 ^= (0L ^ var7) & -1L << 32;
      class_1304[] var2 = IiiiiliIll;
      var7 ^= ((long)var2.length ^ var7) & -1L >>> 32;

      for(long var13 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var13 >>> 32) < (int)var7; var13 += 4294967296L) {
         class_1304 var5 = var2[(int)(var13 >>> 32)];
         class_1799 var6 = entity.method_6118(var5);
         if (!var6.method_7960()) {
            if (ilIIIiiIll != null) {
               var7 ^= ((long)((int)(var7 >>> 32) + class_1890.method_8225(ilIIIiiIll, var6)) << 32 ^ var7) & -1L << 32;
            }

            if (IiIIIiiIll != null) {
               var7 ^= ((long)((int)(var7 >>> 32) + 2 * class_1890.method_8225(IiIIIiiIll, var6)) << 32 ^ var7) & -1L << 32;
            }
         }
      }

      return (float)((int)(var7 >>> 32));
   }

   private static class_243 lliililiil(class_238 box, class_2350 face, double v, double u) {
      double var6 = class_3532.method_16436(v, box.field_1323, box.field_1320);
      double var8 = class_3532.method_16436(u, box.field_1321, box.field_1324);
      double var10 = class_3532.method_16436(u, box.field_1322, box.field_1325);
      double var12 = class_3532.method_16436(v, box.field_1321, box.field_1324);
      class_243 var10000;
      switch (face) {
         case field_11036 -> var10000 = new class_243(var6, box.field_1325, var8);
         case field_11033 -> var10000 = new class_243(var6, box.field_1322, var8);
         case field_11043 -> var10000 = new class_243(var6, var10, box.field_1321);
         case field_11035 -> var10000 = new class_243(var6, var10, box.field_1324);
         case field_11039 -> var10000 = new class_243(box.field_1323, var10, var12);
         case field_11034 -> var10000 = new class_243(box.field_1320, var10, var12);
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public static class_243 IIIIllIIIl(class_238 fromPitch, class_1297 fromYaw, class_243 inset, float reach, float entity, double box, double eye) {
      long var25 = 4799520646613969447L;
      long var27 = 4242480130307963167L;
      long var29 = -1289609287281542205L;
      long var31 = -1917142146274209563L;
      if (fromPitch.method_1006(inset)) {
         return inset.method_1019(IlIIIiiIll.field_1724.method_5631(entity, reach));
      } else {
         ArrayList var9 = new ArrayList();
         class_2350[] var10 = class_2350.values();
         var25 ^= ((long)var10.length << 32 ^ var25) & -1L << 32;

         for(long var36 = var25 ^ (0L ^ var25) & -1L >>> 32; (int)var36 < (int)(var36 >>> 32); var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
            class_2350 var13 = var10[(int)var36];
            if (iIiilIliil(inset, fromPitch, var13)) {
               double[] var14 = iIiiiliIll;
               var27 ^= ((long)var14.length << 32 ^ var27) & -1L << 32;

               for(var27 ^= (0L ^ var27) & -1L >>> 32; (int)var27 < (int)(var27 >>> 32); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
                  double var17 = var14[(int)var27];
                  double[] var19 = iIiiiliIll;
                  var29 ^= ((long)var19.length << 32 ^ var29) & -1L << 32;

                  for(var29 ^= (0L ^ var29) & -1L >>> 32; (int)var29 < (int)(var29 >>> 32); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
                     double var22 = var19[(int)var29];
                     class_243 var24 = lliililiil(fromPitch, var13, var17, var22);
                     if (!(inset.method_1025(var24) > box * box)) {
                        var9.add(Illillllil(inset, var24, reach, entity));
                     }
                  }
               }
            }
         }

         var9.sort(Comparator.comparingDouble(lIllililiIllilil::IilliliilIIi));
         var31 ^= (0L ^ var31) & -1L << 32;

         for(lIllililiIllilil var12 : var9) {
            if (fromYaw == null || !(eye > (double)0.0F) || liiIIliliiiIIlil.Iilililiiili(fromPitch, inset, ilillIiill(inset, var12.liiiIIllIl(), var12.iIlIlllllill(), box), eye)) {
               int var10000 = (int)(var31 >>> 32);
               var31 += 4294967296L;
               if (var10000 >= 16) {
                  break;
               }

               if (fromYaw != null) {
                  class_239 var34 = Iilililiiili(inset, var12.liiiIIllIl(), var12.iIlIlllllill());
                  if (var34 instanceof class_3966) {
                     class_3966 var33 = (class_3966)var34;
                     if (var33.method_17782() == fromYaw) {
                        return var12.IliIlllilIi();
                     }
                  }
               } else if (IiIIlliIIl(inset, var12.IliIlllilIi())) {
                  return var12.IliIlllilIi();
               }
            }
         }

         return null;
      }
   }

   public static class_2338 iliIiiliiiii(class_1511 crystal) {
      return crystal.method_24515().method_10074();
   }
}
