package gg.corz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

public final class liililIiiiililIi {
   public static final int iiiIillIIi = 32;
   public static final int liiIillIIi = 3;

   static int IliIlllilIi(long l) {
      return (int)(l >> 38);
   }

   public static lIIilliiIIilli lIiiIiIlilli(long activeLayer, int currentStand, long input, List<IlIIIIillIIIIi> id) {
      return iliIiiliiiii(activeLayer, currentStand, input, Long.MIN_VALUE, id);
   }

   private liililIiiiililIi() {
   }

   public static boolean IilliliilIIi(long a, long b) {
      if (a == b) {
         return true;
      } else {
         return Math.abs(IliIlllilIi(a) - IliIlllilIi(b)) <= 3 && Math.abs(iIlIlllllill(a) - iIlIlllllill(b)) <= 3 && Math.abs(liiiIIllIl(a) - liiiIIllIl(b)) <= 1;
      }
   }

   static int liiiIIllIl(long l) {
      return (int)(l << 52 >> 52);
   }

   static int iIlIlllllill(long l) {
      return (int)(l << 26 >> 38);
   }

   public static lIIilliiIIilli iliIiiliiiii(long currentStand, int activeLayer, long input, long id, List<IlIIIIillIIIIi> currentMaterial) {
      long var21 = 9009491072290301178L;
      long var23 = 3501450920150134342L;
      LinkedHashMap var8 = new LinkedHashMap();

      for(IlIIIIillIIIIi var10 : currentMaterial) {
         if (var10.iIlIlllllill() == activeLayer) {
            ((iIilllIlilll)var8.computeIfAbsent(var10.liiiIIllIl(), iIilllIlilll::new)).IliIlllilIi(var10);
         }
      }

      iIilllIlilll var25 = null;
      double var26 = Double.POSITIVE_INFINITY;

      for(iIilllIlilll var13 : var8.values()) {
         long var31 = var21 ^ ((long)var13.ililIlIiIiilIlIi.size() << 32 ^ var21) & -1L << 32;
         var21 = var31 ^ ((long)var13.iiIiIlIiIIliIlIi.values().stream().mapToInt(Integer::intValue).max().orElse(0) ^ var31) & -1L >>> 32;
         double var16 = var13.liilIlIiiiilIlIi + (double)var13.IIIiIlIilIIiIlIi * (double)18.0F + (double)var13.iIIiIlIiIlIiIlIi * (double)7.0F + (double)var13.llIiIlIiilIiIlIi * (double)2.0F + (double)var13.lIliIlIiiIliIlIi.size() * (double)12.0F - (double)((int)(var21 >>> 32)) * (double)24.0F - (double)((int)var21) * (double)12.0F - (double)var13.IiIiIlIiliIiIlIi * (double)8.0F - (var13.IlilIlIillilIlIi == input ? (double)18.0F : (double)0.0F);
         if (var16 < var26 || var16 == var26 && var13.IlilIlIillilIlIi < (var25 == null ? Long.MAX_VALUE : var25.IlilIlIillilIlIi)) {
            var25 = var13;
            var26 = var16;
         }
      }

      if (var25 == null) {
         return null;
      } else {
         ArrayList var27 = new ArrayList(var25.ililIlIiIiilIlIi);
         ArrayList var14 = new ArrayList();
         HashSet var15 = new HashSet();
         var14.add(var25.IlilIlIillilIlIi);
         var15.add(var25.IlilIlIillilIlIi);

         for(long var32 = var23 ^ (0L ^ var23) & -1L << 32; (int)(var32 >>> 32) < var14.size() && var25.ililIlIiIiilIlIi.size() < 32; var32 += 4294967296L) {
            long var17 = (Long)var14.get((int)(var32 >>> 32));

            for(iIilllIlilll var20 : var8.values()) {
               if (!var15.contains(var20.IlilIlIillilIlIi) && IilliliilIIi(var20.IlilIlIillilIlIi, var17) && var25.ililIlIiIiilIlIi.size() + var20.ililIlIiIiilIlIi.size() <= 32) {
                  var15.add(var20.IlilIlIillilIlIi);
                  var14.add(var20.IlilIlIillilIlIi);
                  var25.ililIlIiIiilIlIi.addAll(var20.ililIlIiIiilIlIi);
               }
            }
         }

         HashSet var28 = new HashSet();

         for(IlIIIIillIIIIi var18 : var27) {
            var28.add(var18.IliIlllilIi());
         }

         var25.ililIlIiIiilIlIi.sort(Comparator.comparing((c) -> !var28.contains(c.IliIlllilIi())).thenComparing((c) -> !c.IiIlliIliiIl()).thenComparingInt((currentMaterialx) -> currentMaterialx.IIlllIlliIll() == id ? 0 : (currentMaterialx.Illlllllilll() ? 1 : 2)).thenComparingInt((c) -> -(Integer)var25.iiIiIlIiIIliIlIi.getOrDefault(c.IIlllIlliIll(), 0)).thenComparingLong(IlIIIIillIIIIi::IIlllIlliIll).thenComparingInt(IlIIIIillIIIIi::IIIllIIliIIl).thenComparingInt(IlIIIIillIIIIi::IlIlllIlilIl).thenComparingLong(IlIIIIillIIIIi::IliIlllilIi));
         List var30 = var25.ililIlIiIiilIlIi.stream().map(IlIIIIillIIIIi::IliIlllilIi).distinct().toList();
         return new lIIilliiIIilli(currentStand, activeLayer, var25.IlilIlIillilIlIi, var30, var26, var30.size(), var25.liilIlIiiiilIlIi, var25.IIIiIlIilIIiIlIi, var25.iiIiIlIiIIliIlIi.size(), var25.lIliIlIiiIliIlIi.size());
      }
   }
}
