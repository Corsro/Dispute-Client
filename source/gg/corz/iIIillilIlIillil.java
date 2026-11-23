package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1309;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class iIIillilIlIillil {
   public static final double IlliliiIil = (double)0.75F;
   private IlIIIillllIIIill iIlliiiIil;
   public static final double lilIiiiIil = (double)1.0F;
   public static final int liiiliiIil = 2;
   public static final double IilIiiiIil = (double)2.0F;
   public static final double illiliiIil = (double)8.0F;
   public static final double IlIIiiiIil = 1.8;
   public static final int IliiliiIil = 8;
   public static final double lIiiliiIil = (double)3.0F;
   public static final double iiiiliiIil = (double)3.0F;
   public static final float llliliiIil = 4.0F;
   private Supplier<List<liiilIiliiiilIil>> llIliiiIil;
   public static final double iilIiiiIil = (double)1.0F;
   private static final class_2350[] IIIliiiIil;
   public static final int lIliliiIil = 4;
   public static final double llIIiiiIil = 0.26;
   static final int liiIiiiIil = 4;
   public static final float IIlIiiiIil = 0.5F;
   public static final int iliiliiIil = 2;
   public static final double iililiiIil = (double)90.0F;
   private static final int[][] lIIliiiIil;
   public static final int iIliliiIil = 6;
   public static final double iIiiliiIil = (double)4.0F;
   private float iiIliiiIil;
   private long IiIliiiIil = Long.MIN_VALUE;
   public static final double iiIIiiiIil = (double)3.0F;
   private IiIililiIili lIlliiiIil;
   public static final double ilIIiiiIil = 0.2;
   public static final int liIiliiIil = 16;
   public static final double IIiiliiIil = (double)1.5F;
   public static final double IIIIiiiIil = 4.4;
   public static final int lliIiiiIil = 6;
   public static final int IiIiliiIil = 6;
   public static final double lIIIiiiIil = 1.62;
   public static final double iIIIiiiIil = 0.3;
   private final liIIliliiIIlil IlIliiiIil = new IIlIlillIlIlil();
   public static final double IllIiiiIil = (double)0.5F;
   private final IilIllililIlli iIIliiiIil;
   public static final int IiiiliiIil = 6;
   public static final double illIiiiIil = (double)3.0F;
   public static final int IliIiiiIil = 4;
   private class_243 liIliiiIil;
   public static final double ilIiliiIil = 0.6;
   public static final double IiiIiiiIil = (double)16.0F;
   public static final float lIlIiiiIil = 0.5F;
   public static final double llIiliiIil = (double)0.5F;
   public static final int iiIiliiIil = 12;
   public static final int IIliliiIil = 3;
   public static final double lililiiIil = (double)14.0F;
   public static final double IiIIiiiIil = (double)2.0F;
   public static final int lliiliiIil = 3;
   public static final float iIlIiiiIil = 6.0F;
   private iIllIliIlllIli IIlliiiIil;
   public static final double liIIiiiIil = (double)20.0F;
   private final List<llIIilllilIIilll> IllliiiIil = new ArrayList();
   public static final int[] iIiIiiiIil = new int[]{1, 0, -1, -2};
   public static final double lIiIiiiIil = (double)0.5F;
   public static final double lllIiiiIil = 0.8;
   public static final int iliIiiiIil = 8;
   private IlIIlIlllIIlIl ilIliiiIil;
   public static final double IIiIiiiIil = 0.4;
   public static final double IililiiIil = (double)11.0F;
   private static final double iiiIiiiIil = 0.001;

   private static class_243 iIiIlIliIl(class_243 enemies, List<liiilIiliiiilIil> pos) {
      class_243 var2 = null;
      double var3 = Double.MAX_VALUE;

      for(liiilIiliiiilIil var6 : pos) {
         class_243 var7 = var6.IIIllIIliIIl() != null ? var6.IIIllIIliIIl() : var6.iliIiiliiiii();
         if (var7 != null) {
            double var8 = var7.method_1025(enemies);
            if (var8 < var3) {
               var3 = var8;
               var2 = var7;
            }
         }
      }

      return var2;
   }

   private List<IliIilIllliIilIl> IIlllIlliIll(class_1937 self, lliiilIiiliiilIi enemies, liiilIiliiiilIil ourCell, class_243 t, lIlllIiliIlllIil band, List<liiilIiliiiilIil> threatNow, Predicate<class_243> avoid, class_2338 world, IlIillllIill predicted) {
      long var33 = -5309247253779893063L;
      long var27 = 2831567425784139972L;
      long var29 = -354093753333969786L;
      long var31 = -6122083262406986334L;
      ArrayList var10 = new ArrayList();
      HashSet var11 = new HashSet();
      class_238 var12 = ourCell != null && t != null ? lIlIliIlIl(ourCell, t) : null;
      class_243 var13 = enemies.liiiIIllIl();
      if (band.IIIllIIliIIl()) {
         class_243 var14 = t != null ? t : iIiIlIliIl(var13, threatNow);
         if (var14 == null) {
            var14 = var13;
         }

         double[] var15 = IiiIlliiIl(var13, threatNow, ourCell, t, predicted);
         double var16 = Math.atan2(var15[1], var15[0]);
         var27 ^= ((long)((int)Math.round((double)4.0F)) << 32 ^ var27) & -1L << 32;
         double[] var19 = new double[]{(double)8.0F, (double)11.0F, (double)14.0F};
         var27 ^= ((long)var19.length ^ var27) & -1L >>> 32;

         for(var29 ^= (0L ^ var29) & -1L << 32; (int)(var29 >>> 32) < (int)var27; var29 += 4294967296L) {
            double var22 = var19[(int)(var29 >>> 32)];

            for(var29 ^= ((long)(-((int)(var27 >>> 32))) ^ var29) & -1L >>> 32; (int)var29 <= (int)(var27 >>> 32); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
               double var25 = var16 + Math.toRadians((double)((int)var29) * (double)360.0F / (double)16.0F);
               this.Iiilliiliiil(self, var10, var11, var14.field_1352 + Math.cos(var25) * var22, var14.field_1350 + Math.sin(var25) * var22, world.method_10264(), world.method_10264(), band, (class_243)null, threatNow, var12, avoid);
            }
         }
      } else if (band.IlIlllIlilIl()) {
         double[] var35 = new double[]{(double)1.5F, (double)3.0F, (double)4.0F};
         var31 ^= ((long)var35.length << 32 ^ var31) & -1L << 32;

         for(long var43 = var31 ^ (0L ^ var31) & -1L >>> 32; (int)var43 < (int)(var43 >>> 32); var43 ^= (var43 ^ var43 + (long)1) & -1L >>> 32) {
            double var17 = var35[(int)var43];

            for(var33 ^= (0L ^ var33) & -1L << 32; (int)(var33 >>> 32) < 8; var33 += 4294967296L) {
               double var20 = Math.toRadians((double)((int)(var33 >>> 32)) * (double)360.0F / (double)8.0F);
               this.Iiilliiliiil(self, var10, var11, var13.field_1352 + Math.cos(var20) * var17, var13.field_1350 + Math.sin(var20) * var17, world.method_10264(), world.method_10264(), band, (class_243)null, threatNow, var12, avoid);
            }
         }
      } else {
         var33 ^= ((long)Ililllililil(self, t, world.method_10264()) ^ var33) & -1L >>> 32;
         this.Iilllilliill(self, var10, var11, t, (int)var33, (int)var33, band, threatNow, var12, avoid);
         if (var10.size() < 4 && (int)var33 != world.method_10264()) {
            this.Iilllilliill(self, var10, var11, t, world.method_10264(), (int)var33, band, threatNow, var12, avoid);
         }

         if (var10.isEmpty()) {
            this.IIillIiliIil(self, var10, var11, var13, t, (int)var33, world.method_10264(), band, threatNow, var12, avoid);
         }
      }

      var33 ^= ((long)(!band.IIIllIIliIIl() && !band.IlIlllIlilIl() ? Ililllililil(self, t, world.method_10264()) : world.method_10264()) ^ var33) & -1L >>> 32;
      if (!band.IIIllIIliIIl() || Illlllllilll(world, threatNow)) {
         this.IIIilIIiiIIi(self, var10, var11, world, (int)var33, band, !band.IIIllIIliIIl() && !band.IlIlllIlilIl() ? t : null, threatNow, var12, avoid);
      }

      if (this.ilIliiiIil != null && this.ilIliiiIil.liiiIIllIl() != null && (!band.IIIllIIliIIl() || Illlllllilll(this.ilIliiiIil.liiiIIllIl(), threatNow))) {
         this.IIIilIIiiIIi(self, var10, var11, this.ilIliiiIil.liiiIIllIl(), (int)var33, band, !band.IIIllIIliIIl() && !band.IlIlllIlilIl() ? t : null, threatNow, var12, avoid);
      }

      if (!band.IIIllIIliIIl()) {
         for(IlillIllllillIll var37 : IilIilllilIill.IilliliilIIi(self, world, 4, 6)) {
            this.IIIilIIiiIIi(self, var10, var11, var37.IliIlllilIi(), (int)var33, band, band.IlIlllIlilIl() ? null : t, threatNow, var12, avoid);
         }
      }

      return var10;
   }

   // $FF: synthetic method
   private static CallSite lIilliIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) << 15 | (char)((char)((char)(~var4[var5]) ^ var5) ^ var5) >>> 1) << 10 | (char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) << 15 | (char)((char)((char)(~var4[var5]) ^ var5) ^ var5) >>> 1) >>> 6))) - var5))) - 5500) - '벟'))) + '釁') - '蹲'))) - '聫'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float IIIIllIIIl(double exposure, float dist, iiIllIlIIlllIl armor) {
      float var4 = (float)liiIIliliiiIIlil.IliIlllilIi(exposure, (double)dist, (double)6.0F);
      return iiIiiliIIliili.lIiiIiIlilli(iiIiiliIIliili.IliIlllilIi(var4, armor.lIiiIiIlilli()), armor);
   }

   public IlIIlIlllIIlIl iIlIlllllill() {
      return this.ilIliiiIil;
   }

   // $FF: synthetic method
   private static CallSite iilllIIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] + 2953) << 3 | (char)((char)var4[var5] + 2953) >>> 13) + var5) ^ '\ue56c') >>> 6 | (char)((char)((char)((char)((char)var4[var5] + 2953) << 3 | (char)((char)var4[var5] + 2953) >>> 13) + var5) ^ '\ue56c') << 10) ^ '\uea26') + 28596) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)var4[var5] + 2953) << 3 | (char)((char)var4[var5] + 2953) >>> 13) + var5) ^ '\ue56c') >>> 6 | (char)((char)((char)((char)((char)var4[var5] + 2953) << 3 | (char)((char)var4[var5] + 2953) >>> 13) + var5) ^ '\ue56c') << 10) ^ '\uea26') + 28596) >>> 13) - 23935) + 10739) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static IlIIlIlllIIlIl IiIlliIliiIl(lliiilIiiliiilIi stance, IlIIIillllIIIill self) {
      class_243 var2 = stance.liiiIIllIl();
      class_2338 var3 = class_2338.method_49637(var2.field_1352, var2.field_1351 + 0.001, var2.field_1350);
      return new IlIIlIlllIIlIl(new class_243((double)var3.method_10263() + (double)0.5F, var2.field_1351, (double)var3.method_10260() + (double)0.5F), var3, (double)0.0F, self, IIllllIlll<invokedynamic>());
   }

   private static double lliIliliIl(class_243 feet, List<liiilIiliiiilIil> enemies) {
      double var2 = Double.POSITIVE_INFINITY;

      for(liiilIiliiiilIil var5 : enemies) {
         class_243 var6 = var5.IIIllIIliIIl() != null ? var5.IIIllIIliIIl() : var5.iliIiiliiiii();
         if (var6 != null) {
            var2 = Math.min(var2, Math.hypot(var6.field_1352 - feet.field_1352, var6.field_1350 - feet.field_1350));
         }
      }

      return var2;
   }

   private static class_238 lIlIliIlIl(liiilIiliiiilIil t, class_243 feet) {
      double var2 = 0.3;
      double var4 = 1.8;
      if (t.lIiiIiIlilli() != null) {
         class_238 var6 = t.lIiiIiIlilli().method_5829();
         var2 = (var6.field_1320 - var6.field_1323) * (double)0.5F;
         var4 = var6.field_1325 - var6.field_1322;
      }

      return new class_238(feet.field_1352 - var2, feet.field_1351, feet.field_1350 - var2, feet.field_1352 + var2, feet.field_1351 + var4, feet.field_1350 + var2);
   }

   private void Iilililiiili(class_1937 world, IIllIIllIllIIl s, liiilIiliiiilIil t, class_243 predicted, Predicate<class_243> avoid) {
      long var25 = -4951208796531399888L;
      long var27 = 1719353540321224047L;
      long var29 = 8691563025375634351L;
      this.IllliiiIil.clear();
      class_310 var6 = class_310.method_1551();
      class_746 var7 = var6 == null ? null : var6.field_1724;
      if (var7 != null) {
         lliiilIiiliiilIi var8 = s.IlIlllIlilIl();
         var25 ^= ((long)(s.Iiilliiliiil() != null && s.Iiilliiliiil().IIIllIIliIIl() && var8.Iiilliiliiil() > 0 && var7.method_7294() ? 1 : 0) << 32 ^ var25) & -1L << 32;
         class_238 var10 = lIlIliIlIl(t, predicted);
         iiIllIlIIlllIl var11 = t.IlIillIiilIi() != null ? t.IlIillIiilIi() : iiIllIlIIlllIl.lliIilIlliliIilIll;
         float var12 = t.Illillliilli() > 0.0F && Float.isFinite(t.Illillliilli()) ? t.Illillliilli() : 1.0F;
         class_2338 var13 = class_2338.method_49637(predicted.field_1352, predicted.field_1351 + 0.001, predicted.field_1350);
         ArrayList var14 = new ArrayList();

         for(long var34 = var25 ^ (-3L ^ var25) & -1L >>> 32; (int)var34 <= 3; var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32) {
            for(var27 ^= (-12884901888L ^ var27) & -1L << 32; (int)(var27 >>> 32) <= 3; var27 += 4294967296L) {
               for(var27 ^= (-2L ^ var27) & -1L >>> 32; (int)var27 <= 0; var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
                  class_2338 var18 = var13.method_10069((int)var34, (int)var27, (int)(var27 >>> 32));
                  class_243 var19 = lllIliIlillIliIl.liiiIIllIl(var18);
                  double var20 = predicted.method_1022(var19);
                  if (!(var20 >= (double)12.0F)) {
                     float var22 = IIIIllIIIl(var20, 1.0F, var11) * var12;
                     if (var22 > 0.5F && !lllIliIlillIliIl.iIlIlllllill(var18).method_994(var10) && (avoid == null || !avoid.test(var19))) {
                        var29 ^= ((long)(!lllIliIlillIliIl.IliIlllilIi(var18) || !world.method_22347(var18.method_10084()) && lllIliIlillIliIl.IIlllIlliIll(var18) == null ? 0 : 1) << 32 ^ var29) & -1L << 32;
                        var29 ^= ((long)((int)(var29 >>> 32) == 0 && (int)(var34 >>> 32) != 0 && world.method_8320(var18).method_45474() && world.method_22347(var18.method_10084()) && iIIIlIlIIl(var18) && lllIliIlillIliIl.IlIillIiilIi(var18) ? 1 : 0) ^ var29) & -1L >>> 32;
                        if ((int)(var29 >>> 32) != 0 || (int)var29 != 0) {
                           var14.add(new llIIilllilIIilll(var18, var19, lllIliIlillIliIl.IilliliilIIi(var18), new class_243((double)var18.method_10263() + (double)0.5F, (double)var18.method_10264() + (double)1.0F, (double)var18.method_10260() + (double)0.5F), (boolean)((int)var29), var22));
                        }
                     }
                  }
               }
            }
         }

         var14.sort(Comparator.comparingDouble((b) -> (double)(-b.iliIiiliiiii())));
         class_1309 var15 = t.lIiiIiIlilli();

         for(llIIilllilIIilll var17 : var14) {
            if (this.IllliiiIil.size() >= 6) {
               break;
            }

            float var31 = this.iIIliiiIil != null && !this.iIIliiiIil.liiiIIllIl(12, 4) ? 0.5F : ilIillIiIill.IliIlllilIi(var17.liiiIIllIl(), var10, var15, var17.lIiiIiIlilli() ? var17.IliIlllilIi() : null, (class_2338)null);
            float var32 = IIIIllIIIl(predicted.method_1022(var17.liiiIIllIl()), var31, var11) * var12;
            this.IllliiiIil.add(new llIIilllilIIilll(var17.IliIlllilIi(), var17.liiiIIllIl(), var17.iIlIlllllill(), var17.IilliliilIIi(), var17.lIiiIiIlilli(), var32));
         }

         this.IllliiiIil.sort(Comparator.comparingDouble((b) -> (double)(-b.iliIiiliiiii())));
      }
   }

   private static boolean IlIlllIlilIl(lIlllIiliIlllIil band) {
      return band.iliIiiliiiii() || band.IIIllIIliIIl() || band.IlIlllIlilIl();
   }

   private static void IIiIllIiIl(double[] acc, class_243 weight, class_243 from, double pos) {
      if (from != null) {
         double var5 = weight.field_1352 - from.field_1352;
         double var7 = weight.field_1350 - from.field_1350;
         double var9 = Math.hypot(var5, var7);
         if (!(var9 < 0.001) && Double.isFinite(var9)) {
            double var11 = pos / Math.max((double)1.0F, var9);
            acc[0] += var5 / var9 * var11;
            acc[1] += var7 / var9 * var11;
         }
      }
   }

   static boolean Iiiiliiiiiii(class_243 budget, class_2338 clear, double reach, IilIllililIlli eye, BiPredicate<class_243, class_243> cell) {
      long var17 = -1650059445217060703L;
      int[][] var6 = lIIliiiIil;
      var17 ^= ((long)var6.length << 32 ^ var17) & -1L << 32;

      for(long var20 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         int[] var9 = var6[(int)var20];
         double var10 = (double)clear.method_10263() + (double)0.5F + (double)0.5F * (double)var9[0];
         double var12 = (double)clear.method_10264() + (double)0.5F + (double)0.5F * (double)var9[1];
         double var14 = (double)clear.method_10260() + (double)0.5F + (double)0.5F * (double)var9[2];
         if (!((budget.field_1352 - var10) * (double)var9[0] + (budget.field_1351 - var12) * (double)var9[1] + (budget.field_1350 - var14) * (double)var9[2] <= (double)0.0F)) {
            class_243 var16 = new class_243(var10, var12, var14);
            if (!(budget.method_1025(var16) > reach * reach)) {
               if (eye != null && !eye.liiiIIllIl(1, 4)) {
                  return false;
               }

               if (cell.test(budget, var16)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static boolean iIIIlIlIIl(class_2338 b) {
      long var5 = -4205390699264273936L;
      if (lllIliIlillIliIl.Iilllilliill(b.method_10074(), class_2350.field_11036)) {
         return true;
      } else {
         class_2350[] var1 = IIIliiiIil;
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            class_2350 var4 = var1[(int)var8];
            if (lllIliIlillIliIl.Iilllilliill(b.method_10093(var4), var4.method_10153())) {
               return true;
            }
         }

         return false;
      }
   }

   private void Iiilliiliiil(class_1937 searchY, List<IliIilIllliIilIl> refY, Set<class_2338> band, double seen, double z, int x, int targetBox, lIlllIiliIlllIil predicted, class_243 avoid, List<liiilIiliiiilIil> world, class_238 out, Predicate<class_243> enemies) {
      long var22 = 5302971012381095161L;
      long var24 = 7102876304458689252L;
      long var26 = -8580126109450882517L;
      var22 ^= ((long)((int)Math.floor(seen)) << 32 ^ var22) & -1L << 32;
      var22 ^= ((long)((int)Math.floor(z)) ^ var22) & -1L >>> 32;
      int[] var17 = iIiIiiiIil;
      var24 ^= ((long)var17.length << 32 ^ var24) & -1L << 32;

      for(long var31 = var24 ^ (0L ^ var24) & -1L >>> 32; (int)var31 < (int)(var31 >>> 32); var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
         var26 ^= ((long)var17[(int)var31] << 32 ^ var26) & -1L << 32;
         class_2338 var21 = new class_2338((int)(var22 >>> 32), x + (int)(var26 >>> 32), (int)var22);
         if (lllIIlilillIIlil.IIIllIIliIIl(searchY, var21)) {
            this.IIIilIIiiIIi(searchY, refY, band, var21, targetBox, predicted, avoid, world, out, enemies);
            return;
         }
      }

   }

   static int Ililllililil(class_1937 fallbackY, class_243 at, int world) {
      long var7 = -5173461078007651588L;
      long var9 = -7759488061997384615L;
      var7 ^= ((long)((int)Math.floor(at.field_1352)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((int)Math.floor(at.field_1350)) ^ var7) & -1L >>> 32;
      var9 ^= ((long)((int)Math.floor(at.field_1351 + 0.001)) << 32 ^ var9) & -1L << 32;

      for(long var14 = var9 ^ ((long)((int)(var9 >>> 32)) ^ var9) & -1L >>> 32; (int)var14 >= (int)(var14 >>> 32) - 8; var14 ^= (var14 ^ var14 + (long)-1) & -1L >>> 32) {
         if (lllIIlilillIIlil.IIIllIIliIIl(fallbackY, new class_2338((int)(var7 >>> 32), (int)var14, (int)var7))) {
            return (int)var14;
         }
      }

      return world;
   }

   static boolean IiIiliIiiiIi(IliIilIllliIilIl predicted, class_243 c) {
      return predicted != null && c != null && iliiiillIiiiiill.iIlIlllllill(c.field_1351 - predicted.IiilillIll.field_1351, predicted.lIIiillIll);
   }

   private List<liiilIiliiiilIil> iliIiiliiiii(liiilIiliiiilIil t) {
      List var2 = null;
      if (this.llIliiiIil != null) {
         try {
            var2 = (List)this.llIliiiIil.get();
         } catch (RuntimeException var4) {
            var2 = null;
         }
      }

      if (var2 != null) {
         if (t != null && !var2.contains(t)) {
            ArrayList var3 = new ArrayList(var2.size() + 1);
            var3.addAll(var2);
            var3.add(t);
            return var3;
         } else {
            return var2;
         }
      } else {
         return t == null ? List.of() : List.of(t);
      }
   }

   private void IIIilIIiiIIi(class_1937 predicted, List<IliIilIllliIilIl> enemies, Set<class_2338> seen, class_2338 avoid, int band, lIlllIiliIlllIil out, class_243 targetBox, List<liiilIiliiiilIil> cell, class_238 refY, Predicate<class_243> world) {
      long var19 = 2964360880556384455L;
      if (avoid != null && seen.add(avoid)) {
         if (lllIIlilillIIlil.IIIllIIliIIl(predicted, avoid)) {
            var19 ^= ((long)iIiIilIliIil.IliIlllilIi(predicted, avoid) << 32 ^ var19) & -1L << 32;
            if (((int)(var19 >>> 32) & 351) == 0) {
               class_243 var12 = new class_243((double)avoid.method_10263() + (double)0.5F, (double)avoid.method_10264(), (double)avoid.method_10260() + (double)0.5F);
               if (refY == null || !IllIllllIl(var12).method_1011(0.05).method_994(refY)) {
                  if (world == null || !world.test(var12)) {
                     double var13 = illIlIilIl(predicted, avoid, (int)(var19 >>> 32));
                     double var15 = lilIliilIl(predicted, avoid);
                     double var17;
                     if (!out.IIIllIIliIIl() && !out.IlIlllIlilIl()) {
                        var17 = Math.hypot(var12.field_1352 - targetBox.field_1352, var12.field_1350 - targetBox.field_1350);
                     } else {
                        var17 = lliIliliIl(var12, cell);
                     }

                     enemies.add(new IliIilIllliIilIl(avoid, var12, avoid.method_10264() - band, var13, var15, var17));
                  }
               }
            }
         }
      }
   }

   private double IIiilIiiiIii(class_243 self, class_243 feet, class_238 selfWeight, float box, lliiilIiiliiilIi eye) {
      long var19 = 5289461957490186386L;
      List var6 = Iliilliiilii(this.IllliiiIil, self, this.iIIliiiIil, lllIliIlillIliIl::IiIIlliIIl);
      if (var6.isEmpty()) {
         return (double)0.0F;
      } else {
         var19 ^= ((long)(this.iIIliiiIil != null && !this.iIIliiiIil.liiiIIllIl(var6.size() * 12, 4) ? 0 : 1) << 32 ^ var19) & -1L << 32;
         class_310 var8 = class_310.method_1551();
         class_746 var9 = var8 == null ? null : var8.field_1724;
         iiIllIlIIlllIl var10 = eye.IiIlliIliiIl() != null ? eye.IiIlliIliiIl() : iiIllIlIIlllIl.lliIilIlliliIilIll;
         double var11 = (double)0.0F;

         for(llIIilllilIIilll var14 : var6) {
            double var15 = feet.method_1022(var14.liiiIIllIl());
            float var17;
            if (var15 >= (double)12.0F) {
               var17 = 0.0F;
            } else {
               float var18 = (int)(var19 >>> 32) != 0 && var9 != null ? ilIillIiIill.IliIlllilIi(var14.liiiIIllIl(), selfWeight, var9, var14.lIiiIiIlilli() ? var14.IliIlllilIi() : null, (class_2338)null) : 1.0F;
               var17 = IIIIllIIIl(var15, var18, var10);
            }

            var11 = Math.max(var11, (double)(var14.iliIiiliiiii() - box * var17));
         }

         return var11;
      }
   }

   static class_243 llIIlilIIl(class_1937 world, liiilIiliiiilIil t) {
      class_243 var2 = t.IIIllIIliIIl() != null ? t.IIIllIIliIIl() : t.iliIiiliiiii();
      if (var2 == null) {
         return null;
      } else {
         lIiIlIIliIiIlIIl var3 = (worldx, y, z) -> {
            class_2338 var4 = new class_2338(worldx, y, z);
            return !world.method_8320(var4).method_26220(world, var4).method_1110();
         };
         return IiIIlliIIl(var3, var2, t.IlIlllIlilIl(), t.IIlllIlliIll());
      }
   }

   private void Iilllilliill(class_1937 avoid, List<IliIilIllliIilIl> enemies, Set<class_2338> world, class_243 out, int refY, int seen, lIlllIiliIlllIil searchY, List<liiilIiliiiilIil> band, class_238 predicted, Predicate<class_243> targetBox) {
      long var19 = -147320143143852228L;
      long var21 = -1595054291916563891L;
      double[] var11 = new double[]{searchY.liiiIIllIl(), searchY.iIlIlllllill(), searchY.IilliliilIIi()};
      var19 ^= ((long)var11.length << 32 ^ var19) & -1L << 32;

      for(long var24 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var24 < (int)(var24 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
         double var14 = var11[(int)var24];

         for(var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < 16; var21 += 4294967296L) {
            double var17 = Math.toRadians((double)((int)(var21 >>> 32)) * (double)360.0F / (double)16.0F);
            this.Iiilliiliiil(avoid, enemies, world, out.field_1352 + Math.cos(var17) * var14, out.field_1350 + Math.sin(var17) * var14, refY, seen, searchY, out, band, predicted, targetBox);
         }
      }

   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 8178) - var5) << 13 | (char)((char)(var4[var5] - 8178) - var5) >>> 3) + var5) + '覤') + var5) - '\ue5c5') + 23468) + 15914))))))) + var5))))) ^ 30181) - var5) + var5) << 1 | (char)((char)((char)((char)(~((char)(~((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 8178) - var5) << 13 | (char)((char)(var4[var5] - 8178) - var5) >>> 3) + var5) + '覤') + var5) - '\ue5c5') + 23468) + 15914))))))) + var5))))) ^ 30181) - var5) + var5) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlIIlIlllIIlIl liiiIIllIl(long tick, IIllIIllIllIIl d, IiiIliliiIli s, iliilIlIiiilIl threat, Predicate<class_243> avoid) {
      long var36 = 3391747181055858428L;
      IlliIiIlllliIiIl var7 = iIIlliilIlIlliil.IiIilliIil(s);
      if (var7 != null) {
         class_243 var8 = var7.liiiIIllIl() != null ? var7.liiiIIllIl() : (d != null && d.IlIlllIlilIl() != null ? d.IlIlllIlilIl().liiiIIllIl() : null);
         if (var8 != null) {
            IlIIlIlllIIlIl var39 = new IlIIlIlllIIlIl(var8, class_2338.method_49638(var8), (double)0.0F, s.lIiiIiIlilli(), var7.IliIlllilIi() == null ? IIliIilIliIi.lIIIIlIIliIIIIlIIl.name() : var7.IliIlllilIi().name());
            this.ilIliiiIil = var39;
            this.IiIliiiIil = Long.MIN_VALUE;
            return var39;
         }
      }

      if (d != null && s != null && d.IlIlllIlilIl() != null && d.IlIlllIlilIl().liiiIIllIl() != null) {
         class_310 var38 = class_310.method_1551();
         class_638 var9 = var38 == null ? null : var38.field_1687;
         if (var9 == null) {
            return this.ilIliiiIil;
         } else {
            lliiilIiiliiilIi var10 = d.IlIlllIlilIl();
            liiilIiliiiilIil var11 = d.IiIlliIliiIl();
            IlIIIillllIIIill var12 = s.lIiiIiIlilli() == null ? IlIIIillllIIIill.llIilllill : s.lIiiIiIlilli();
            iIllIliIlllIli var13 = s.IliIlllilIi();
            lilliIiiilliIi var14 = s.iIlIlllllill() != null ? s.iIlIlllllill() : lilliIiiilliIi.IliIlllilIi(s.liiiIIllIl(), d.Iiilliiliiil() != null ? d.Iiilliiliiil().IliIlllilIi() : null);
            List var15 = this.iliIiiliiiii(var11);
            class_243 var16 = var11 != null ? llIIlilIIl(var9, var11) : null;
            float var17 = d.Illlllllilll() == null ? 0.0F : d.Illlllllilll().IliIlllilIi();
            lIlllIiliIlllIil var18 = IIIllIIliIIl(var12, var13, s.IilliliilIIi(), var11, var16, s.liiiIIllIl(), var15);
            if (var18 == null) {
               IlIIlIlllIIlIl var19 = IiIlliIliiIl(var10, var12);
               this.ilIliiiIil = var19;
               this.lIiiIiIlilli(tick, var13, s.liiiIIllIl(), var12, var16, var17);
               this.IiIliiiIil = Long.MIN_VALUE;
               return var19;
            } else {
               var36 ^= ((long)(this.ilIliiiIil != null && this.IiIliiiIil != Long.MIN_VALUE && tick - this.IiIliiiIil < 4L && var13 == this.IIlliiiIil && s.liiiIIllIl() == this.lIlliiiIil && var12 == this.iIlliiiIil && !(var17 >= this.iiIliiiIil + 4.0F) && (var16 == null || this.liIliiiIil != null && !(var16.method_1022(this.liIliiiIil) > (double)0.75F)) && (IIllllIlll<invokedynamic>().equals(this.ilIliiiIil.lIiiIiIlilli()) || this.IlIillIiilIi(var9, this.ilIliiiIil.liiiIIllIl(), var11, var16, avoid)) ? 0 : 1) << 32 ^ var36) & -1L << 32;
               if ((int)(var36 >>> 32) == 0) {
                  return this.ilIliiiIil;
               } else {
                  this.lIiiIiIlilli(tick, var13, s.liiiIIllIl(), var12, var16, var17);
                  class_2338 var20 = class_2338.method_49637(var10.liiiIIllIl().field_1352, var10.liiiIIllIl().field_1351 + 0.001, var10.liiiIIllIl().field_1350);
                  List var21 = this.IIlllIlliIll(var9, var10, var11, var16, var18, var15, avoid, var20, d.Illlllllilll());
                  if (var21.isEmpty()) {
                     IlIIlIlllIIlIl var22 = IiIlliIliiIl(var10, var12);
                     this.ilIliiiIil = var22;
                     return var22;
                  } else {
                     var36 ^= ((long)(!var18.IIIllIIliIIl() && !var18.IlIlllIlilIl() && !var18.iliIiiliiiii() && var16 != null ? 1 : 0) ^ var36) & -1L >>> 32;

                     for(IliIilIllliIilIl var24 : var21) {
                        var24.iIIiillIll = this.ilIliiiIil != null && this.ilIliiiIil.IliIlllilIi() != null && var24.IiilillIll.method_1022(this.ilIliiiIil.IliIlllilIi()) <= (double)0.75F;
                        var24.IlIiillIll = this.ilIliiiIil != null && var24.ililillIll.equals(this.ilIliiiIil.liiiIIllIl());
                        var24.llIiillIll = (int)var36 == 0 || IiIiliIiiiIi(var24, var16);
                        double var25 = Math.hypot(var24.IiilillIll.field_1352 - var10.liiiIIllIl().field_1352, var24.IiilillIll.field_1350 - var10.liiiIIllIl().field_1350);
                        var24.ilIiillIll = var25 / (var25 > (double)2.0F ? 0.26 : 0.2);
                        var24.IiIiillIll = Math.max(0, var24.ililillIll.method_10264() - var20.method_10264());
                        var24.liIiillIll = IlIlIlillIlIli.IliIlllilIi((double)0.0F, (double)0.0F, var24.ilIiillIll, var24.IiIiillIll, var24.lIIiillIll, var18.liiiIIllIl(), var18.IilliliilIIi(), !var18.IIIllIIliIIl() && !var18.IlIlllIlilIl() ? var24.liilillIll : 0, var24.iiilillIll, var24.IIIiillIll, var24.iIIiillIll, var14, var18.iliIiiliiiii());
                     }

                     var21.sort(Comparator.comparing((c) -> !c.llIiillIll).thenComparingDouble((c) -> -c.liIiillIll));
                     ArrayList var40 = new ArrayList(Math.min(var21.size(), 13));

                     for(IliIilIllliIilIl var44 : var21) {
                        if (var40.size() >= 12) {
                           break;
                        }

                        var40.add(var44);
                     }

                     for(IliIilIllliIilIl var45 : var21) {
                        if (var45.IlIiillIll && !var40.contains(var45)) {
                           var40.add(var45);
                        }
                     }

                     Illillliilli(this.IlIliiiIil, var10.liiiIIllIl(), var20, var40);
                     if (var18.lIiiIiIlilli() && var11 != null && var16 != null) {
                        this.Iilililiiili(var9, d, var11, var16, avoid);
                     } else {
                        this.IllliiiIil.clear();
                     }

                     float var43 = Float.isFinite(s.IlIlllIlilIl()) ? s.IlIlllIlilIl() : var14.iIlIlllllill();
                     List var46 = IlIlllIlilIl(var18) ? var15 : null;
                     IliIilIllliIilIl var26 = null;
                     IliIilIllliIilIl var27 = null;

                     for(IliIilIllliIilIl var29 : var40) {
                        if (!Double.isNaN(var29.ilIiillIll)) {
                           class_243 var30 = var29.IiilillIll.method_1031((double)0.0F, 1.62, (double)0.0F);
                           class_238 var31 = IllIllllIl(var29.IiilillIll);
                           double var32 = var18.lIiiIiIlilli() && !this.IllliiiIil.isEmpty() ? this.IIiilIiiiIii(var30, var29.IiilillIll, var31, var43, var10) : (double)0.0F;
                           double var34 = threat != null ? (double)threat.Iilllilliill(var29.IiilillIll, var31, var46) : (double)0.0F;
                           var29.iiIiillIll = IlIlIlillIlIli.IliIlllilIi(var32, var34, var29.ilIiillIll, var29.IiIiillIll, var29.lIIiillIll, var18.liiiIIllIl(), var18.IilliliilIIi(), !var18.IIIllIIliIIl() && !var18.IlIlllIlilIl() ? var29.liilillIll : 0, var29.iiilillIll, var29.IIIiillIll, var29.iIIiillIll, var14, var18.iliIiiliiiii());
                           if (Double.isFinite(var29.iiIiillIll)) {
                              if (var26 == null || IIlilIliiIli(var29, var26)) {
                                 var26 = var29;
                              }

                              if (var29.IlIiillIll) {
                                 var27 = var29;
                              }
                           }
                        }
                     }

                     if (var26 == null) {
                        if (this.ilIliiiIil != null && this.IlIillIiilIi(var9, this.ilIliiiIil.liiiIIllIl(), var11, var16, avoid)) {
                           return this.ilIliiiIil;
                        } else {
                           IlIIlIlllIIlIl var48 = IiIlliIliiIl(var10, var12);
                           this.ilIliiiIil = var48;
                           return var48;
                        }
                     } else {
                        IliIilIllliIilIl var47 = var27 != null && (var27.llIiillIll || !var26.llIiillIll) && var26.iiIiillIll <= var27.iiIiillIll + (double)0.5F ? var27 : var26;
                        this.ilIliiiIil = new IlIIlIlllIIlIl(var47.IiilillIll, var47.ililillIll, var47.iiIiillIll, var12, var47.IIIiillIll >= (double)1.0F ? IIllllIlll<invokedynamic>() : var18.IliIlllilIi());
                        return this.ilIliiiIil;
                     }
                  }
               }
            }
         }
      } else {
         return this.ilIliiiIil;
      }
   }

   private static double illIlIilIl(class_1937 world, class_2338 cell, int flags) {
      long var16 = 5592733496993326211L;
      long var14 = -576287975098760653L;
      double var3 = (double)0.0F;
      if ((flags & 128) != 0) {
         var3 += (double)0.5F;
      }

      if ((flags & 32) != 0) {
         var3 += 0.8;
      }

      if ((flags & 512) != 0) {
         ++var3;
      }

      var14 ^= (0L ^ var14) & -1L << 32;
      var14 ^= (0L ^ var14) & -1L >>> 32;
      class_2350[] var7 = IIIliiiIil;
      var16 ^= ((long)var7.length << 32 ^ var16) & -1L << 32;

      for(long var21 = var16 ^ (0L ^ var16) & -1L >>> 32; (int)var21 < (int)(var21 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
         class_2350 var10 = var7[(int)var21];
         class_2338 var11 = cell.method_10093(var10);
         class_2680 var12 = world.method_8320(var11);
         class_2680 var13 = world.method_8320(var11.method_10074());
         if (var12.method_26227().method_15767(class_3486.field_15518) || var13.method_26227().method_15767(class_3486.field_15518)) {
            var14 ^= (4294967296L ^ var14) & -1L << 32;
         }

         if (var12.method_26164(class_3481.field_21952) || var12.method_27852(class_2246.field_10092) || var13.method_27852(class_2246.field_10092)) {
            var14 ^= (1L ^ var14) & -1L >>> 32;
         }
      }

      if ((int)(var14 >>> 32) != 0) {
         var3 += (double)3.0F;
      }

      if ((int)var14 != 0) {
         var3 += (double)2.0F;
      }

      return var3;
   }

   public iIIillilIlIillil(IilIllililIlli budget) {
      this.iIIliiiIil = budget;
   }

   static {
      IIIliiiIil = new class_2350[]{class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034};
      lIIliiiIil = new int[][]{{0, 1, 0}, {0, 0, -1}, {0, 0, 1}, {-1, 0, 0}, {1, 0, 0}};
   }

   static List<llIIilllilIIilll> Iliilliiilii(List<llIIilllilIIilll> eye, class_243 clear, IilIllililIlli pool, BiPredicate<class_243, class_243> budget) {
      llIIilllilIIilll var4 = null;
      llIIilllilIIilll var5 = null;

      for(llIIilllilIIilll var7 : eye) {
         class_238 var8 = var7.iIlIlllllill();
         if (!(liiIIliliiiIIlil.Illillliilli(clear.field_1352, clear.field_1351, clear.field_1350, var8.field_1323, var8.field_1322, var8.field_1321, var8.field_1320, var8.field_1325, var8.field_1324) >= (double)3.0F) && !(clear.method_1022(var7.IilliliilIIi()) > 4.4) && (var5 == null || var7.iliIiiliiiii() > var5.iliIiiliiiii()) && Iiiiliiiiiii(clear, var7.IliIlllilIi(), 4.4, pool, budget)) {
            if (var4 != null && !(var7.iliIiiliiiii() > var4.iliIiiliiiii())) {
               var5 = var7;
            } else {
               var5 = var4;
               var4 = var7;
            }
         }
      }

      if (var4 == null) {
         return List.of();
      } else {
         return var5 == null ? List.of(var4) : List.of(var4, var5);
      }
   }

   static void Illillliilli(liIIliliiIIlil top, class_243 env, class_2338 ourCell, List<IliIilIllliIilIl> pos) {
      long var16 = 3729470295469857264L;
      long var14 = 3052904630302115269L;
      var14 ^= (0L ^ var14) & -1L << 32;

      for(IliIilIllliIilIl var6 : pos) {
         if (!var6.ililillIll.equals(ourCell)) {
            double var7 = Math.hypot(var6.IiilillIll.field_1352 - env.field_1352, var6.IiilillIll.field_1350 - env.field_1350);
            if (!(var7 > (double)16.0F) && !iIIlliilIlIlliil.illIIlIilIIl(top, env, var6.IiilillIll, true, (double)16.0F)) {
               if (var7 <= (double)3.0F) {
                  var6.ilIiillIll = Double.NaN;
               } else if ((int)(var14 >>> 32) >= 3) {
                  var6.ilIiillIll += (double)20.0F;
               } else {
                  var14 += 4294967296L;
                  List var9 = top.IlIlllIlilIl(ourCell, var6.ililillIll);
                  if (var9 == null) {
                     var6.ilIiillIll = Double.NaN;
                  } else {
                     var14 ^= (0L ^ var14) & -1L >>> 32;
                     var16 ^= ((long)ourCell.method_10264() << 32 ^ var16) & -1L << 32;

                     for(class_2338 var13 : var9) {
                        if (var13.method_10264() > (int)(var16 >>> 32)) {
                           var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32;
                        }

                        var16 ^= ((long)var13.method_10264() << 32 ^ var16) & -1L << 32;
                     }

                     var6.ilIiillIll = (double)var9.size() / 0.26;
                     var6.IiIiillIll = (int)var14;
                  }
               }
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite Iillllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) >>> 6 | (char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) << 10) - var5) ^ var5) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) >>> 6 | (char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) << 10) - var5) ^ var5) << 4) + var5) ^ var5))) >>> 6 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) >>> 6 | (char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) << 10) - var5) ^ var5) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) >>> 6 | (char)(~((char)((char)((char)((char)(-var4[var5]) + 13510) + 4247) + '앋'))) << 10) - var5) ^ var5) << 4) + var5) ^ var5))) << 10))) ^ '蕾') - 10237) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi() {
      this.ilIliiiIil = null;
      this.IiIliiiIil = Long.MIN_VALUE;
      this.liIliiiIil = null;
      this.iiIliiiIil = 0.0F;
      this.IIlliiiIil = null;
      this.lIlliiiIil = null;
      this.iIlliiiIil = null;
      this.IllliiiIil.clear();
   }

   private void IIillIiliIil(class_1937 enemies, List<IliIilIllliIilIl> band, Set<class_2338> pos, class_243 refY, class_243 world, int targetBox, int predicted, lIlllIiliIlllIil seen, List<liiilIiliiiilIil> out, class_238 avoid, Predicate<class_243> ourY) {
      long var22 = 3555808046694684410L;
      double[] var12 = iIIlliilIlIlliil.IiiIIlliiIIl(refY.field_1352 - world.field_1352, refY.field_1350 - world.field_1350);
      if (var12 != null) {
         double var13 = Math.hypot(refY.field_1352 - world.field_1352, refY.field_1350 - world.field_1350);

         for(double var15 = seen.iIlIlllllill(); var15 <= var13 && band.size() < 6; ++var15) {
            double var17 = world.field_1352 + var12[0] * var15;
            double var19 = world.field_1350 + var12[1] * var15;
            var22 ^= ((long)band.size() << 32 ^ var22) & -1L << 32;
            this.Iiilliiliiil(enemies, band, pos, var17, var19, predicted, targetBox, seen, world, out, avoid, ourY);
            if (band.size() == (int)(var22 >>> 32)) {
               this.Iiilliiliiil(enemies, band, pos, var17, var19, predicted - iIiIiiiIil.length, targetBox, seen, world, out, avoid, ourY);
            }
         }

      }
   }

   static boolean Illlllllilll(class_2338 enemies, List<liiilIiliiiilIil> cell) {
      class_243 var2 = new class_243((double)enemies.method_10263() + (double)0.5F, (double)enemies.method_10264(), (double)enemies.method_10260() + (double)0.5F);
      return !(lliIliliIl(var2, cell) < (double)8.0F);
   }

   static class_243 IiIIlliIIl(lIiIlIIliIiIlIIl sp, class_243 velocity, class_243 terrain, boolean onGround) {
      if (velocity == null) {
         return null;
      } else {
         liIIiIlliiIIiIll var4 = IlIIiillllIIiill.liiiIIllIl(iiIIlIIlIl(velocity, terrain, onGround), 6, sp, (double)0.0F, (double)0.0F, true, (double)0.0F, (List)null).IliIlllilIi(6);
         class_243 var5 = new class_243(var4.IliIlllilIi(), var4.liiiIIllIl(), var4.iIlIlllllill());
         return Double.isFinite(var5.field_1352) && Double.isFinite(var5.field_1351) && Double.isFinite(var5.field_1350) ? var5 : velocity;
      }
   }

   static boolean IIlilIliiIli(IliIilIllliIilIl c, IliIilIllliIilIl best) {
      if (c.llIiillIll != best.llIiillIll) {
         return c.llIiillIll;
      } else {
         return c.iiIiillIll > best.iiIiillIll;
      }
   }

   private static double[] IiiIlliiIl(class_243 threatNow, List<liiilIiliiiilIil> t, liiilIiliiiilIil enemies, class_243 pos, IlIillllIill predicted) {
      double[] var5 = new double[2];

      for(liiilIiliiiilIil var7 : t) {
         class_243 var8 = var7 == enemies && pos != null ? pos : (var7.IIIllIIliIIl() != null ? var7.IIIllIIliIIl() : var7.iliIiiliiiii());
         IIiIllIiIl(var5, threatNow, var8, (double)1.0F);
      }

      if (predicted != null) {
         IIiIllIiIl(var5, threatNow, predicted.IilliliilIIi(), (double)0.5F);
         class_2338 var12 = predicted.lIiiIiIlilli();
         if (var12 != null) {
            IIiIllIiIl(var5, threatNow, lllIliIlillIliIl.liiiIIllIl(var12), (double)0.5F);
         }
      }

      double var13 = var5[0];
      double var14 = var5[1];
      double var10 = Math.hypot(var13, var14);
      if (var10 < 1.0E-6) {
         return new double[]{(double)1.0F, (double)0.0F};
      } else {
         return new double[]{var13 / var10, var14 / var10};
      }
   }

   // $FF: synthetic method
   private static CallSite lllllillll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ueabb') ^ 5357) ^ 19653) + var5) << 14 | (char)((char)((char)((char)(var4[var5] + '\ueabb') ^ 5357) ^ 19653) + var5) >>> 2) - var5) ^ var5))) + var5) + var5) - '\ue363'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean IlIillIiilIi(class_1937 t, class_2338 avoid, liiilIiliiiilIil predicted, class_243 cell, Predicate<class_243> world) {
      if (avoid != null && lllIIlilillIIlil.IIIllIIliIIl(t, avoid)) {
         if ((iIiIilIliIil.IliIlllilIi(t, avoid) & 351) != 0) {
            return false;
         } else {
            class_243 var6 = new class_243((double)avoid.method_10263() + (double)0.5F, (double)avoid.method_10264(), (double)avoid.method_10260() + (double)0.5F);
            if (predicted != null && cell != null && IllIllllIl(var6).method_1011(0.05).method_994(lIlIliIlIl(predicted, cell))) {
               return false;
            } else {
               return world == null || !world.test(var6);
            }
         }
      } else {
         return false;
      }
   }

   static liIIiIlliiIIiIll iiIIlIIlIl(class_243 velocity, class_243 sp, boolean onGround) {
      class_243 var3 = sp != null ? sp : class_243.field_1353;
      double var4 = onGround ? -0.0784 : (var3.field_1351 - 0.08) * 0.98;
      return new liIIiIlliiIIiIll(velocity.field_1352, velocity.field_1351, velocity.field_1350, var3.field_1352, var4, var3.field_1350, onGround, (double)0.0F);
   }

   private static class_238 IllIllllIl(class_243 feet) {
      return new class_238(feet.field_1352 - 0.3, feet.field_1351, feet.field_1350 - 0.3, feet.field_1352 + 0.3, feet.field_1351 + 1.8, feet.field_1350 + 0.3);
   }

   private static double lilIliilIl(class_1937 world, class_2338 cell) {
      IlillIllllillIll var2 = IilIilllilIill.liiiIIllIl(world, cell);
      if (var2 != null && var2.liiiIIllIl() != iiIIiilIIlIiil.IliIliIlilliIliIli) {
         if (var2.iIlIlllllill() == 0) {
            return (double)1.0F;
         } else {
            return var2.iIlIlllllill() == 1 ? 0.4 : (double)0.0F;
         }
      } else {
         return (double)0.0F;
      }
   }

   // $FF: synthetic method
   private static CallSite IIllllIlll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1880931686810092308L ^ Long.rotateLeft(4070213098270516015L, 26) ^ 6372779649312401430L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1319419863265680487L ^ Long.rotateLeft(-8309312922471467812L, 51) ^ -4139722573248423706L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7411695026594682643L ^ Long.rotateLeft(-181054578881606602L, 44) ^ 7226946924353565253L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7122382116020730986L ^ Long.rotateLeft(1070194392902906926L, 23) ^ -8042071564286081815L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -758302285376467923L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6215051318240036667L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5736995131257317018L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5630566296194300407L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -9126688363494891800L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8210992315696881862L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIlllIllll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lllllillll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iillllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iilllIIill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lIilliIill<invokedynamic>());
      byte[] var13 = var11.decode(var3);
      var12.init(2, var10, new GCMParameterSpec(128, var13, 0, 12));
      byte[] var15 = var12.doFinal(var13, 12, var13.length - 12);
      String var16 = new String(var15, StandardCharsets.UTF_8);
      Arrays.fill(var4, (byte)0);
      Arrays.fill(var5, (byte)0);
      Arrays.fill(var6, (byte)0);
      Arrays.fill(var8, (byte)0);
      Arrays.fill(var9, (byte)0);
      Arrays.fill(var15, (byte)0);
      MethodHandle var17 = MethodHandles.constant(String.class, var16);
      return new ConstantCallSite(var17);
   }

   private static lIlllIiliIlllIil IIIllIIliIIl(IlIIIillllIIIill mode, iIllIliIlllIli predicted, iIlIIIIiIllIIIIi lane, liiilIiliiiilIil stance, class_243 posture, IiIililiIili enemies, List<liiilIiliiiilIil> t) {
      long var8 = 9095653416128585263L;
      if (mode == IlIIIillllIIIill.IiIilllill) {
         return posture == null && t.isEmpty() ? null : new lIlllIiliIlllIil(IIllllIlll<invokedynamic>(), (double)8.0F, (double)11.0F, Double.POSITIVE_INFINITY, false, true, true, false);
      } else if (mode != IlIIIillllIIIill.liIilllill && predicted != iIllIliIlllIli.IliiIIIIIl) {
         if (mode != IlIIIillllIIIill.llIilllill && mode != IlIIIillllIIIill.IIlilllill) {
            if (stance != null && posture != null) {
               var8 ^= ((long)(enemies != IiIililiIili.liIiiIlIliiIiiIlIl && mode != IlIIIillllIIIill.iiIilllill ? 0 : 1) << 32 ^ var8) & -1L << 32;
               if (predicted != iIllIliIlllIli.iiliIIIIIl && lane != iIlIIIIiIllIIIIi.liiiliIiil) {
                  return predicted != iIllIliIlllIli.liliIIIIIl && lane != iIlIIIIiIllIIIIi.IiiiliIiil ? new lIlllIiliIlllIil(IIllllIlll<invokedynamic>(), 2.4, 3.2, (double)4.0F, true, (boolean)((int)(var8 >>> 32)), false, false) : new lIlllIiliIlllIil(IIllllIlll<invokedynamic>(), 2.2, (double)3.0F, 3.8, false, (boolean)((int)(var8 >>> 32)), false, false);
               } else {
                  return new lIlllIiliIlllIil(IIllllIlll<invokedynamic>(), 1.8, 2.3, 2.8, false, (boolean)((int)(var8 >>> 32)), false, false);
               }
            } else {
               return mode == IlIIIillllIIIill.iiIilllill ? new lIlllIiliIlllIil(IIllllIlll<invokedynamic>(), (double)0.0F, (double)0.0F, Double.POSITIVE_INFINITY, false, true, false, true) : null;
            }
         } else {
            return null;
         }
      } else {
         return new lIlllIiliIlllIil(IIllllIlll<invokedynamic>(), (double)0.0F, (double)0.0F, Double.POSITIVE_INFINITY, false, true, false, true);
      }
   }

   public void IliIlllilIi(Supplier<List<liiilIiliiiilIil>> source) {
      this.llIliiiIil = source;
   }

   private void lIiiIiIlilli(long incoming, iIllIliIlllIli stance, IiIililiIili posture, IlIIIillllIIIill tick, class_243 predicted, float mode) {
      this.IiIliiiIil = incoming;
      this.IIlliiiIil = stance;
      this.lIlliiiIil = posture;
      this.iIlliiiIil = tick;
      this.liIliiiIil = predicted;
      this.iiIliiiIil = mode;
   }
}
