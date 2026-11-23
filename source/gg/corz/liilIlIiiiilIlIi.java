package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2404;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3610;
import net.minecraft.class_3616;
import net.minecraft.class_3621;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class liilIlIiiiilIlIi {
   private static final String[] iliIlIIIIi;
   private static final class_2350[] IliIlIIIIi;
   static final int IIiIlIIIIi = 384;
   static final int IilIlIIIIi = 3;
   static final int lilIlIIIIi = 4;
   private static final double[][] lliIlIIIIi;
   static final int lIiIlIIIIi = 6;
   static final int illIlIIIIi = 5;
   static final int iilIlIIIIi = 9;
   private static final Set<class_2248> IiiIlIIIIi;
   private static final Set<class_2248> liiIlIIIIi;
   private static final class_2350[] iIiIlIIIIi;

   static boolean IilliliilIIi(class_3610 a, class_3610 b) {
      return IliIlllilIi(a) && IliIlllilIi(b) || liiiIIllIl(a) && liiiIIllIl(b);
   }

   public static boolean IIiilIiiiIii(class_1922 pos, class_238 w, class_2338 body, boolean drill) {
      long var17 = -6953239465115796105L;
      long var19 = 3834105620262521345L;
      long var13 = -7658937446248051488L;
      long var15 = 8191956928968886848L;
      var13 ^= ((long)class_3532.method_15357(w.field_1322 - 0.01) << 32 ^ var13) & -1L << 32;
      if (body.method_10264() >= (int)(var13 >>> 32) - (drill ? 1 : 0) && body.method_10264() <= (int)(var13 >>> 32) + (drill ? 1 : 0)) {
         var13 ^= ((long)class_3532.method_15357(w.field_1323 + 0.001) ^ var13) & -1L >>> 32;
         var15 ^= ((long)class_3532.method_15357(w.field_1320 - 0.001) << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)class_3532.method_15357(w.field_1321 + 0.001) ^ var15) & -1L >>> 32;
         var17 ^= ((long)class_3532.method_15357(w.field_1324 - 0.001) << 32 ^ var17) & -1L << 32;

         for(long var26 = var17 ^ ((long)((int)var13) ^ var17) & -1L >>> 32; (int)var26 <= (int)(var15 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
            for(var19 ^= ((long)((int)var15) << 32 ^ var19) & -1L << 32; (int)(var19 >>> 32) <= (int)(var26 >>> 32); var19 += 4294967296L) {
               class_2338 var11 = new class_2338((int)var26, (int)(var13 >>> 32), (int)(var19 >>> 32));
               var19 ^= ((long)(drill ? (Math.abs(var11.method_10263() - body.method_10263()) <= 1 && Math.abs(var11.method_10264() - body.method_10264()) <= 1 && Math.abs(var11.method_10260() - body.method_10260()) <= 1 ? 1 : 0) : var11.equals(body)) ^ var19) & -1L >>> 32;
               if ((int)var19 != 0 && Iilililiiili(pos, var11)) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   static boolean IlIillIiilIi(class_1922 w, class_2338 pos) {
      long var8 = -6622546406345461434L;
      class_2680 var2 = w.method_8320(pos);
      if (!var2.method_26215() && !var2.method_45474() && !(var2.method_26204() instanceof class_2404) && !var2.method_31709()) {
         if (var2.method_26218(w, pos).method_1110()) {
            return false;
         } else {
            String var3 = var2.method_26204().method_63499();
            String[] var4 = iliIlIIIIi;
            var8 ^= ((long)var4.length << 32 ^ var8) & -1L << 32;

            for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
               String var7 = var4[(int)var11];
               if (var3.contains(var7)) {
                  return false;
               }
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean IIlilIliiIli(class_1922 inArea, class_2338 plug, boolean replacedSource, Predicate<class_2338> w) {
      long var9 = 8018131935263125737L;
      if (!iIlIlllllill(inArea.method_8316(plug.method_10084())) || replacedSource && w.test(plug.method_10084())) {
         class_2350[] var4 = IliIlIIIIi;
         var9 ^= ((long)var4.length << 32 ^ var9) & -1L << 32;

         for(long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            class_2350 var7 = var4[(int)var12];
            class_2338 var8 = plug.method_10093(var7);
            if (iIlIlllllill(inArea.method_8316(var8)) && (!replacedSource || !w.test(var8))) {
               return true;
            }
         }

         return false;
      } else {
         return true;
      }
   }

   public static List<IllliiIilllliiIi> IIlllIlliIll(class_1922 w, class_2338 eye, class_238 look, class_243 body, class_243 feet) {
      long var20 = 9031172695718514871L;
      long var22 = 7043962319120995922L;
      long var24 = -799610597013445978L;
      long var26 = 7492365331020907370L;
      LinkedHashSet var5 = new LinkedHashSet();
      ArrayList var6 = new ArrayList();
      class_2338.class_2339 var7 = new class_2338.class_2339();

      for(var20 ^= (17179869184L ^ var20) & -1L << 32; (int)(var20 >>> 32) >= -3; var20 += -4294967296L) {
         for(var20 ^= (-5L ^ var20) & -1L >>> 32; (int)var20 <= 5; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            for(var22 ^= (-21474836480L ^ var22) & -1L << 32; (int)(var22 >>> 32) <= 5; var22 += 4294967296L) {
               var7.method_10103(eye.method_10263() + (int)var20, eye.method_10264() + (int)(var20 >>> 32), eye.method_10260() + (int)(var22 >>> 32));
               class_3610 var11 = w.method_8316(var7);
               if (iIlIlllllill(var11)) {
                  class_2338 var12 = var7.method_10062();
                  if (var11.method_15771()) {
                     if (iliIiiliiiii(w, var12, var11)) {
                        var5.add(var12);
                     }
                  } else {
                     var6.add(var12);
                  }
               }
            }
         }
      }

      HashSet var8 = new HashSet();
      HashSet var9 = new HashSet();

      for(class_2338 var29 : var6) {
         if (IIIllIIliIIl(w, var29, w.method_8316(var29))) {
            var9.add(var29);
            if (!var8.contains(var29)) {
               IlIlllIlilIl(w, var29, eye, var5, var8);
            }
         }
      }

      HashMap var28 = new HashMap();

      for(class_2338 var32 : var5) {
         class_3610 var13 = w.method_8316(var32);
         var22 ^= ((long)IliIlllilIi(var13) ^ var22) & -1L >>> 32;
         Illlllllilll(var28, w, look, body, feet, var32, var32, IllIIIillllIIIil.lilIiIIIil, (boolean)((int)var22), 9);
         class_2350[] var15 = iIiIlIIIIi;
         var24 ^= ((long)var15.length << 32 ^ var24) & -1L << 32;

         for(var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < (int)(var24 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
            class_2350 var18 = var15[(int)var24];
            class_2338 var19 = var32.method_10093(var18);
            if (lIiiIiIlilli(w, var19, var13)) {
               Illlllllilll(var28, w, look, body, feet, var19, var32, IllIIIillllIIIil.iilIiIIIil, (boolean)((int)var22), 9);
            }
         }
      }

      class_238 var31 = look.method_1014((double)1.25F);

      for(class_2338 var35 : var6) {
         class_3610 var14 = w.method_8316(var35);
         var26 ^= ((long)IliIlllilIi(var14) << 32 ^ var26) & -1L << 32;
         if (var9.contains(var35)) {
            Illlllllilll(var28, w, look, body, feet, var35, var35, IllIIIillllIIIil.IIiIiIIIil, (boolean)((int)(var26 >>> 32)), var14.method_15761());
         } else if (var31.method_994(new class_238(var35))) {
            Illlllllilll(var28, w, look, body, feet, var35, var35, IllIIIillllIIIil.lIiIiIIIil, (boolean)((int)(var26 >>> 32)), var14.method_15761());
         }
      }

      ArrayList var34 = new ArrayList(var28.values());
      var34.sort(Comparator.comparingDouble(IllliiIilllliiIi::iliIiiliiiii));
      return var34;
   }

   private static void IiIlliIliiIl(class_2338 n, class_2338 origin, ArrayDeque<class_2338> seen, Set<class_2338> queue) {
      if (Math.abs(n.method_10263() - origin.method_10263()) <= 9 && Math.abs(n.method_10264() - origin.method_10264()) <= 9 && Math.abs(n.method_10260() - origin.method_10260()) <= 9) {
         if (queue.add(n)) {
            seen.add(n);
         }

      }
   }

   public static IillIiIllillIiIl IIillIiliIil(class_1922 w, class_243 reach, double bad, class_2338 cell, Set<Long> eye) {
      long var27 = 8120363911330021779L;
      long var29 = 1665305834436997573L;
      double var6 = bad * bad;
      IillIiIllillIiIl var8 = null;
      double var9 = Double.MAX_VALUE;
      class_2350[] var11 = class_2350.values();
      var27 ^= ((long)var11.length << 32 ^ var27) & -1L << 32;

      for(long var32 = var27 ^ (0L ^ var27) & -1L >>> 32; (int)var32 < (int)(var32 >>> 32); var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32) {
         class_2350 var14 = var11[(int)var32];
         class_2338 var15 = cell.method_10093(var14);
         class_2350 var16 = var14.method_10153();
         if ((eye == null || !eye.contains(Iiilliiliiil(cell, var16))) && IlIillIiilIi(w, var15)) {
            double[][] var17 = lliIlIIIIi;
            var29 ^= ((long)var17.length << 32 ^ var29) & -1L << 32;

            for(var29 ^= (0L ^ var29) & -1L >>> 32; (int)var29 < (int)(var29 >>> 32); var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32) {
               double[] var20 = var17[(int)var29];
               class_243 var21 = IIIilIIiiIIi(var15, var16, var20[0], var20[1]);
               double var22 = reach.method_1025(var21);
               if (!(var22 > var6) && !(var22 >= var9)) {
                  double var24 = (double)var16.method_10148() * (reach.field_1352 - var21.field_1352) + (double)var16.method_10164() * (reach.field_1351 - var21.field_1351) + (double)var16.method_10165() * (reach.field_1350 - var21.field_1350);
                  if (!(var24 <= 0.05)) {
                     class_3965 var26 = w.method_17742(new class_3959(reach, var21, class_3960.field_17559, class_242.field_1348, class_3726.method_16194()));
                     if (Ililllililil(var26, var15, var16, cell)) {
                        var8 = new IillIiIllillIiIl(var15, var16, var21, cell);
                        var9 = var22;
                        break;
                     }
                  }
               }
            }
         }
      }

      return var8;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) >>> 12) << 4 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) >>> 12) >>> 12) - 18864) << 13 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) >>> 12) << 4 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) >>> 4 | (char)((char)(var4[var5] + 16301) >>> 8 | (char)(var4[var5] + 16301) << 8) << 12) - var5) + var5))))) >>> 12) >>> 12) - 18864) >>> 3) - '錫') + 1423))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private liilIlIiiiilIlIi() {
   }

   static boolean iIlIlllllill(class_3610 f) {
      return IliIlllilIi(f) || liiiIIllIl(f);
   }

   static {
      iIiIlIIIIi = new class_2350[]{class_2350.field_11033, class_2350.field_11043, class_2350.field_11034, class_2350.field_11035, class_2350.field_11039};
      IliIlIIIIi = new class_2350[]{class_2350.field_11043, class_2350.field_11034, class_2350.field_11035, class_2350.field_11039};
      lliIlIIIIi = new double[][]{{(double)0.0F, (double)0.0F}, {0.28, 0.28}, {-0.28, 0.28}, {0.28, -0.28}, {-0.28, -0.28}};
      iliIlIIIIi = new String[]{Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>()};
      IiiIlIIIIi = Set.of(class_2246.field_10445, class_2246.field_29031, class_2246.field_10340, class_2246.field_28888, class_2246.field_10515, class_2246.field_10566, class_2246.field_10253, class_2246.field_28685, class_2246.field_10115, class_2246.field_10508, class_2246.field_10474, class_2246.field_27165, class_2246.field_27114, class_2246.field_23869, class_2246.field_22091, class_2246.field_29032, class_2246.field_10471, class_2246.field_9979, class_2246.field_10344, class_2246.field_9989, class_2246.field_10056, class_2246.field_28900, class_2246.field_37556, class_2246.field_10460, class_2246.field_10415, class_2246.field_22090);
      liiIlIIIIi = Set.of(class_2246.field_10201, class_2246.field_10234, class_2246.field_10205, class_2246.field_10085, class_2246.field_22108, class_2246.field_10441, class_2246.field_10002, class_2246.field_10381, class_2246.field_33508, class_2246.field_33510, class_2246.field_33509, class_2246.field_27119, class_2246.field_27159, class_2246.field_27160, class_2246.field_22109, class_2246.field_10540, class_2246.field_22423, class_2246.field_10092, class_2246.field_10258, class_2246.field_10562, class_2246.field_10375);
   }

   public static boolean Ililllililil(class_239 r, class_2338 face, class_2350 anchor, class_2338 cell) {
      if (r instanceof class_3965 var4) {
         if (r.method_17783() == class_240.field_1332) {
            if (var4.method_17777().equals(face) && var4.method_17780() == anchor) {
               return true;
            }

            return var4.method_17777().method_10093(var4.method_17780()).equals(cell);
         }
      }

      return false;
   }

   static boolean lIiiIiIlilli(class_1922 src, class_2338 w, class_3610 n) {
      class_2680 var3 = src.method_8320(w);
      class_3610 var4 = var3.method_26227();
      if (!var4.method_15769()) {
         return IilliliilIIi(var4, n) && !var4.method_15771();
      } else {
         return var3.method_26215() || var3.method_45474();
      }
   }

   public static int Iliilliiilii(class_1799 s, boolean lava) {
      if (s != null && !s.method_7960()) {
         class_1792 var3 = s.method_7909();
         if (var3 instanceof class_1747) {
            class_1747 var2 = (class_1747)var3;
            class_2248 var5 = var2.method_7711();
            class_2680 var4 = var5.method_9564();
            if (var5 != class_2246.field_10375 && var4.method_26216() && !var4.method_31709()) {
               if (lava && var4.method_50011()) {
                  return -1;
               }

               if (IiiIlIIIIi.contains(var5)) {
                  return 4;
               }

               if (!liiIlIIIIi.contains(var5) && !var5.method_63499().contains(Iiiiliiiiiii<invokedynamic>())) {
                  if (var5 instanceof class_2346) {
                     return 1;
                  }

                  return 2;
               }

               return 0;
            }

            return -1;
         }
      }

      return -1;
   }

   public static boolean IIIllIIliIIl(class_1922 c, class_2338 w, class_3610 f) {
      long var8 = 3062276344187835231L;
      if (f.method_15771()) {
         return true;
      } else if (IilliliilIIi(c.method_8316(w.method_10084()), f)) {
         return true;
      } else {
         class_2350[] var3 = IliIlIIIIi;
         var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

         for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            class_2350 var6 = var3[(int)var11];
            class_3610 var7 = c.method_8316(w.method_10093(var6));
            if (IilliliilIIi(var7, f) && (var7.method_15771() || var7.method_15761() > f.method_15761())) {
               return true;
            }
         }

         return false;
      }
   }

   private static void Illlllllilll(Map<class_2338, IllliiIilllliiIi> kind, class_1922 fluid, class_238 cell, class_243 level, class_243 eye, class_2338 w, class_2338 lava, IllIIIillllIIIil body, boolean look, int out) {
      if (!cell.method_994(new class_238(w))) {
         if (fluid.method_8320(w).method_45474()) {
            double var10 = Iilllilliill(body, look, out, w, level, eye);
            IllliiIilllliiIi var12 = (IllliiIilllliiIi)kind.get(w);
            if (var12 == null || var10 < var12.iliIiiliiiii()) {
               kind.put(w, new IllliiIilllliiIi(w, lava, body, look, out, var10));
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) << 5 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) >>> 11) ^ var5) ^ 4152) - var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) << 5 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) >>> 11) ^ var5) ^ 4152) - var5) << 10) >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) << 5 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) >>> 11) ^ var5) ^ 4152) - var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) << 5 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) >>> 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) >>> 10 | (char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) >>> 3 | (char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) << 13) + 4523) << 6) - '\uee1e') ^ 7032) ^ '\ue603'))) ^ var5))) << 3) >>> 11) ^ var5) ^ 4152) - var5) << 10) << 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) << 7 | (char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) >>> 9))) ^ 25190) ^ var5) + '\uf68f') - 'ꂷ') - '\uea89') >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) << 7 | (char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) >>> 9))) ^ 25190) ^ var5) + '\uf68f') - 'ꂷ') - '\uea89') << 8) - var5) ^ var5) + var5))) >>> 6 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) << 7 | (char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) >>> 9))) ^ 25190) ^ var5) + '\uf68f') - 'ꂷ') - '\uea89') >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) << 7 | (char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10) >>> 9))) ^ 25190) ^ var5) + '\uf68f') - 'ꂷ') - '\uea89') << 8) - var5) ^ var5) + var5))) << 10) ^ 22710) - 25924))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl(class_3610 f) {
      return f != null && f.method_15772() instanceof class_3621;
   }

   public static boolean IiIiliIiiiIi(class_1922 pos, class_2338 w) {
      return IIlilIliiIli(pos, w, false, (Predicate)null);
   }

   public static boolean iliIiiliiiii(class_1922 c, class_2338 f, class_3610 w) {
      long var7 = -4346046906063117223L;
      class_2350[] var3 = iIiIlIIIIi;
      var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

      for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         class_2350 var6 = var3[(int)var10];
         if (lIiiIiIlilli(c, f.method_10093(var6), w)) {
            return true;
         }
      }

      return false;
   }

   static double Iilllilliill(IllIIIillllIIIil lava, boolean eye, int level, class_2338 look, class_243 cell, class_243 kind) {
      double var6 = (eye ? (double)0.0F : (double)4000000.0F) + (double)lava.ordinal() * (double)1000000.0F;
      if (lava == IllIIIillllIIIil.IIiIiIIIil || lava == IllIIIillllIIIil.lIiIiIIIil) {
         var6 -= (double)level * (double)10000.0F;
      }

      class_243 var8 = class_243.method_24953(look);
      double var9 = cell.method_1025(var8);
      double var11 = (double)0.0F;
      if (kind != null && var9 > 1.0E-6) {
         class_243 var13 = var8.method_1020(cell).method_1029();
         var11 = Math.toDegrees(Math.acos(class_3532.method_15350(var13.method_1026(kind), (double)-1.0F, (double)1.0F)));
      }

      return var6 + var9 * (double)10.0F + var11 * (double)2.0F - ((double)look.method_10264() - cell.field_1351) * (double)20.0F;
   }

   public static boolean Iilililiiili(class_1922 removed, class_2338 w) {
      long var6 = 7989917552520774096L;

      for(long var8 = var6 ^ (4294967296L ^ var6) & -1L << 32; (int)(var8 >>> 32) <= 6; var8 += 4294967296L) {
         class_2338 var3 = w.method_10087((int)(var8 >>> 32));
         class_2680 var4 = removed.method_8320(var3);
         class_3610 var5 = var4.method_26227();
         if (IliIlllilIi(var5)) {
            return true;
         }

         if (!var5.method_15769()) {
            return false;
         }

         if (!var4.method_26220(removed, var3).method_1110()) {
            return false;
         }
      }

      return false;
   }

   public static boolean IliIlllilIi(class_3610 f) {
      return f != null && f.method_15772() instanceof class_3616;
   }

   public static long Iiilliiliiil(class_2338 face, class_2350 cell) {
      return face.method_10063() * 7L + (long)cell.ordinal();
   }

   public static boolean Illillliilli(class_1922 cube, class_2338 pos, boolean w) {
      long var16 = -1756536625902952772L;
      long var12 = -4981811364704886648L;
      long var14 = 4007351165315593311L;
      var12 ^= ((long)(w ? 1 : 0) << 32 ^ var12) & -1L << 32;

      for(long var19 = var12 ^ ((long)(-((int)(var12 >>> 32))) ^ var12) & -1L >>> 32; (int)var19 <= (int)(var19 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         for(var14 ^= ((long)(-((int)(var19 >>> 32))) << 32 ^ var14) & -1L << 32; (int)(var14 >>> 32) <= (int)(var19 >>> 32); var14 += 4294967296L) {
            for(var14 ^= ((long)(-((int)(var19 >>> 32))) ^ var14) & -1L >>> 32; (int)var14 <= (int)(var19 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
               class_2338 var7 = pos.method_10069((int)var19, (int)(var14 >>> 32), (int)var14);
               if (w && IliIlllilIi(cube.method_8316(var7))) {
                  return true;
               }

               class_2350[] var8 = class_2350.values();
               var16 ^= ((long)var8.length << 32 ^ var16) & -1L << 32;

               for(var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
                  class_2350 var11 = var8[(int)var16];
                  if (IliIlllilIi(cube.method_8316(var7.method_10093(var11)))) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') >>> 15 | (char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') << 1))) >>> 10 | (char)(~((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') >>> 15 | (char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') << 1))) << 6) + 32367) << 10 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') >>> 15 | (char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') << 1))) >>> 10 | (char)(~((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') >>> 15 | (char)((char)(-((char)((char)(~((char)(~((char)(~((char)(-((char)(-var4[var5]))))))))) - var5))) ^ '\ue928') << 1))) << 6) + 32367) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static class_243 IIIilIIiiIIi(class_2338 u, class_2350 anchor, double v, double face) {
      double var6 = (double)u.method_10263() + (double)0.5F + (double)anchor.method_10148() * 0.49;
      double var8 = (double)u.method_10264() + (double)0.5F + (double)anchor.method_10164() * 0.49;
      double var10 = (double)u.method_10260() + (double)0.5F + (double)anchor.method_10165() * 0.49;
      switch (anchor.method_10166()) {
         case field_11048:
            var8 += v;
            var10 += face;
            break;
         case field_11052:
            var6 += v;
            var10 += face;
            break;
         default:
            var6 += v;
            var8 += face;
      }

      return new class_243(var6, var8, var10);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2536188339880406953L ^ Long.rotateLeft(-3486103550563165800L, 28) ^ 2564639955729620007L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4626202790727509848L ^ Long.rotateLeft(-2293237522893476739L, 55) ^ 1402537113848660544L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -587805864948087644L ^ Long.rotateLeft(-6659613074864754291L, 57) ^ 1265137442282800077L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2182848835709695501L ^ Long.rotateLeft(4423342413096748812L, 27) ^ 3445293069779748690L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2735661473691907964L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 9110000816183096433L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4377074004782603705L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4206705823203865371L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1016086796461722405L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 800581900768887301L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIIllIIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIIIlIlIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, llIIlilIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IiIIlliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiIIlIIlIl<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(-var4[var5]))))) - 29578) - var5) + 19721) - var5))) ^ var5) ^ var5) + 15351) + var5) - var5) ^ 5018));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static void IlIlllIlilIl(class_1922 origin, class_2338 start, class_2338 w, Set<class_2338> seen, Set<class_2338> sources) {
      long var16 = -6674260490626058171L;
      long var18 = 5361074826727737098L;
      ArrayDeque var5 = new ArrayDeque();
      var5.add(start);
      sources.add(start);
      var16 ^= (1649267441664L ^ var16) & -1L << 32;

      while(!var5.isEmpty()) {
         int var10000 = (int)(var16 >>> 32);
         var16 += -4294967296L;
         if (var10000 <= 0) {
            break;
         }

         class_2338 var7 = (class_2338)var5.poll();
         class_3610 var8 = origin.method_8316(var7);
         if (iIlIlllllill(var8)) {
            if (var8.method_15771()) {
               seen.add(var7);
            } else {
               class_2338 var9 = var7.method_10084();
               if (IilliliilIIi(origin.method_8316(var9), var8)) {
                  IiIlliIliiIl(var9, w, var5, sources);
               }

               class_2350[] var10 = IliIlIIIIi;
               var16 ^= ((long)var10.length ^ var16) & -1L >>> 32;

               for(var18 ^= (0L ^ var18) & -1L << 32; (int)(var18 >>> 32) < (int)var16; var18 += 4294967296L) {
                  class_2350 var13 = var10[(int)(var18 >>> 32)];
                  class_2338 var14 = var7.method_10093(var13);
                  class_3610 var15 = origin.method_8316(var14);
                  if (IilliliilIIi(var15, var8) && (var15.method_15771() || var15.method_15761() > var8.method_15761())) {
                     IiIlliIliiIl(var14, w, var5, sources);
                  }
               }
            }
         }
      }

   }
}
