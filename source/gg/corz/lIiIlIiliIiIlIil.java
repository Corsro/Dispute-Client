package gg.corz;

import net.minecraft.class_243;

public final class lIiIlIiliIiIlIil {
   public static final double IiiIIIlIil = 0.001;
   private static final double liiIIIlIil = (double)4096.0F;

   public static boolean IIIllIIliIIl(boolean lastArrivalFrame, long holding, long frame, long quietSinceFrame) {
      return !lastArrivalFrame && holding < quietSinceFrame && frame < quietSinceFrame;
   }

   public static long iliIiiliiiii(long now, long lastUntil, long latencyMs) {
      return Math.max(now + Math.max(0L, lastUntil), latencyMs);
   }

   private lIiIlIiliIiIlIil() {
   }

   public static long lIiiIiIlilli(double maxMs, double unit, double minMs) {
      double var6 = Math.max((double)0.0F, Math.min(maxMs, unit));
      double var8 = Math.max((double)0.0F, Math.max(maxMs, unit));
      return Math.round(var6 + (var8 - var6) * lIlIlIIiiIlIlIIi.liiiIIllIl(minMs, (double)0.0F, (double)1.0F));
   }

   public static long IliIlllilIi(double coordinate) {
      return Math.round(coordinate * (double)4096.0F);
   }

   public static class_243 iIlIlllllill(class_243 dx, long dy, long base, long dz) {
      if (dy == 0L && base == 0L && dz == 0L) {
         return dx;
      } else {
         double var7 = dy == 0L ? dx.field_1352 : liiiIIllIl(IliIlllilIi(dx.field_1352) + dy);
         double var9 = base == 0L ? dx.field_1351 : liiiIIllIl(IliIlllilIi(dx.field_1351) + base);
         double var11 = dz == 0L ? dx.field_1350 : liiiIIllIl(IliIlllilIi(dx.field_1350) + dz);
         return new class_243(var7, var9, var11);
      }
   }

   public static boolean IilliliilIIi(double before, double after) {
      return after > before + 0.001;
   }

   public static double liiiIIllIl(long packed) {
      return (double)packed / (double)4096.0F;
   }
}
