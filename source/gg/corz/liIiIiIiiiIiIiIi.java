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
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1922;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3726;
import net.minecraft.class_7923;

public final class liIiIiIiiiIiIiIi {
   private static final double illilIiIIi = (double)1.0F;
   private static final long iIlilIiIIi = Long.MIN_VALUE;
   private static final int[][] lililIiIIi = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 0, 1}, {0, 0, -1}, {1, 1, 0}, {-1, 1, 0}, {0, 1, 1}, {0, 1, -1}, {1, -1, 0}, {-1, -1, 0}, {0, -1, 1}, {0, -1, -1}};
   private static final int lIlilIiIIi = 28;
   public static final double liIilIiIIi = 0.9;
   private static final int lllilIiIIi = 4000;
   public static final int iiIilIiIIi = 12;
   public static final double ilIilIiIIi = 0.3;
   public static final int IIlilIiIIi = 3;
   private static final double IililIiIIi = (double)9.0F;
   private static final class_2680 iililIiIIi;
   private static final double IllilIiIIi = (double)24.0F;
   public static final double IiIilIiIIi = 0.2;

   public static IiillIIlliillIIl IllIllllIl(iIIlIiiIlIlIii w, illIiliIilIili src, iiIilillIIlilill survey) {
      ArrayList var3 = new ArrayList();
      IiillIIlliillIIl var4 = lIiiIiIlilli(w, src, survey);
      if (var4 != null) {
         var3.add(var4);
      }

      IiillIIlliillIIl var5 = Illlllllilll(w, src, survey, 6);
      if (var5 != null) {
         var3.add(var5);
      }

      if (var3.isEmpty()) {
         return null;
      } else {
         var3.sort(Comparator.comparingDouble(IiillIIlliillIIl::IlIlllIlilIl).reversed());
         return (IiillIIlliillIIl)var3.get(0);
      }
   }

   public static int IIiIllIiIl(long k) {
      return class_2338.method_10071(k);
   }

   private liIiIiIiiiIiIiIi() {
   }

   public static IiillIIlliillIIl IIlllIlliIll(class_1922 stand, illIiliIilIili src, long w) {
      class_2338 var4 = lliIliliIl(w);
      if (!IIIlIIIilIIlIIIi.IIlllIlliIll(stand, var4)) {
         return null;
      } else {
         class_243 var5 = IiiIlliiIl(var4);
         double var6 = src.iliIiiliiiii();
         double var8 = (var6 + (double)1.0F) * (var6 + (double)1.0F);
         ArrayList var10 = new ArrayList();

         for(long var12 : src.liiiIIllIl(w, var8)) {
            if (!(class_243.method_24953(lliIliliIl(var12)).method_1025(var5) > var8)) {
               class_2680 var14 = src.iIlIlllllill(var12);
               if (var14 != null && !src.Illlllllilll(var14) && src.IIlllIlliIll(var14)) {
                  liIIilliiIIill var15 = src.IIillIiliIil(stand, var12, var14);
                  if (!var15.lIiiIiIlilli() && lIiIliIliIiIliIl.iIlIlllllill(stand, lliIliliIl(var12), var5, var6, var15.IliIlllilIi(), var15.liiiIIllIl(), var15.iIlIlllllill(), var15.IilliliilIIi(), false, src.Iilllilliill(), src.IiIlliIliiIl()).IliIlllilIi()) {
                     var10.add(var12);
                  }
               }
            }
         }

         if (var10.isEmpty()) {
            return null;
         } else {
            ArrayList var16 = new ArrayList();

            for(long var13 : iliIiiliiiii(stand, src, w, var10)) {
               var16.add(new IIIlilIllIIlilIl(w, var13));
            }

            return new IiillIIlliillIIl(IllIllillllIllil.IllllliIil, var16, List.of(), Math.max(0, src.IlIlllIlilIl(w)), IilliliilIIi(var16.size(), 0, 0));
         }
      }
   }

   private static int iIlIlllllill(ilIiIllIiIiIll r) {
      byte var10000;
      switch (r) {
         case lililIliliililIlil -> var10000 = -1;
         case lliilIlililiilIlil -> var10000 = 0;
         case IiiilIlilliiilIlil -> var10000 = 1;
         case IIiilIlillIiilIlil -> var10000 = 2;
         case iIiilIlilIliilIlil -> var10000 = 3;
         default -> var10000 = 4;
      }

      return var10000;
   }

   public static int iIiIlIliIl(long k) {
      return class_2338.method_10083(k);
   }

   private static double IiIlliIliiIl(class_243 eye, long target) {
      return (double)ilIiiIiIii.Ililllililil(eye, class_243.method_24953(lliIliliIl(target)))[0];
   }

   public static class_243 IiiIlliiIl(class_2338 feet) {
      return class_243.method_24953(feet).method_1031((double)0.0F, 1.12, (double)0.0F);
   }

   public static long illIlIilIl(int y, int x, int z) {
      return class_2338.method_10064(y, x, z);
   }

   public static IiillIIlliillIIl Illlllllilll(class_1922 src, illIiliIilIili survey, iiIilillIIlilill w, int maxStands) {
      return Iilllilliill(src, survey, w, maxStands, Set.of());
   }

   public static IiillIIlliillIIl IIIilIIiiIIi(iIIlIiiIlIlIii src, illIiliIilIili w, iiIilillIIlilill diag, llilIIiililIIi req, iiIlIiiIIllIii survey) {
      long var19 = -3624404448915851450L;
      long var21 = -4908327770681046798L;
      HashMap var5 = new HashMap();
      HashMap var6 = new HashMap();

      for(Map.Entry var8 : diag.iIilIliill.entrySet()) {
         if (IlIillIiilIi((ilIiIllIiIiIll)var8.getValue())) {
            ((List)var6.computeIfAbsent(lIlIliIlIl((Long)var8.getKey()), (k) -> new ArrayList())).add((Long)var8.getKey());
         }
      }

      HashMap var23 = new HashMap();

      for(long var9 : var6.keySet()) {
         var23.put(var9, var9);
      }

      for(long var29 : var6.keySet()) {
         for(var19 ^= (-4294967296L ^ var19) & -1L << 32; (int)(var19 >>> 32) <= 1; var19 += 4294967296L) {
            for(var19 ^= ~var19 & -1L >>> 32; (int)var19 <= 1; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
               for(var21 ^= (-4294967296L ^ var21) & -1L << 32; (int)(var21 >>> 32) <= 1; var21 += 4294967296L) {
                  if ((int)(var19 >>> 32) != 0 || (int)var19 != 0 || (int)(var21 >>> 32) != 0) {
                     long var14 = illIlIilIl(lilIliilIl(var29) + (int)(var19 >>> 32), IIiIllIiIl(var29) + (int)var19, iIiIlIliIl(var29) + (int)(var21 >>> 32));
                     if (var23.containsKey(var14)) {
                        iiIIlIIlIl(var23, var29, var14);
                     }
                  }
               }
            }
         }
      }

      for(Map.Entry var30 : var6.entrySet()) {
         ((List)var5.computeIfAbsent(IiIIlliIIl(var23, (Long)var30.getKey()), (k) -> new ArrayList())).addAll((Collection)var30.getValue());
      }

      req.lIIIliiliiIIIliili = var5.size();

      for(List var31 : var5.values()) {
         req.IlIIliilillIIliili = Math.max(req.IlIIliilillIIliili, var31.size());
      }

      if (var5.isEmpty()) {
         req.IilIliilililIliili = Ilillllill<invokedynamic>();
         return null;
      } else {
         IiillIIlliillIIl var28 = null;
         double var32 = (double)0.0F;
         long var11 = w.IIIllIIliIIl();
         ArrayList var13 = new ArrayList(var5.entrySet());
         var13.sort(Comparator.comparingDouble((feet) -> (double)(-((List)feet.getValue()).size()) / ((double)1.0F + Math.sqrt(IiIiliIiiiIi((List)feet.getValue(), var11)))));

         for(long var34 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var34 < Math.min(8, var13.size()); var34 ^= (var34 ^ var34 + (long)1) & -1L >>> 32) {
            List var15 = (List)((Map.Entry)var13.get((int)var34)).getValue();
            if (!survey.IilliliilIIi(var15)) {
               req.IilIliilililIliili = Ilillllill<invokedynamic>() + survey.IiIlliIliiIl() + Ilillllill<invokedynamic>();
            } else if (var15.size() < survey.iliIiiliiiii()) {
               req.IilIliilililIliili = Ilillllill<invokedynamic>() + var15.size() + Ilillllill<invokedynamic>() + survey.iliIiiliiiii() + Ilillllill<invokedynamic>() + survey.IiIlliIliiIl() + Ilillllill<invokedynamic>();
            } else {
               IiillIIlliillIIl var16 = IIlilIliiIli(src, w, var15, req, survey);
               if (var16 != null) {
                  ++req.IIlIliililIlIliili;
                  double var17 = var16.IlIlllIlilIl();
                  if (var17 > var32) {
                     var32 = var17;
                     var28 = var16;
                  }
               }
            }
         }

         return var28;
      }
   }

   public static IiillIIlliillIIl lIiiIiIlilli(class_1922 survey, illIiliIilIili src, iiIilillIIlilill w) {
      long var17 = 477659692566928889L;
      long var13 = 5349437841279532117L;
      long var15 = 3492202210428190131L;
      long var3 = 0L;
      var13 ^= (0L ^ var13) & -1L << 32;
      var13 ^= (2147483647L ^ var13) & -1L >>> 32;
      var15 ^= (0L ^ var15) & -1L << 32;

      for(Map.Entry var9 : w.IIilIliill.entrySet()) {
         var15 ^= ((long)src.IlIlllIlilIl((Long)var9.getKey()) ^ var15) & -1L >>> 32;
         if ((int)var15 >= 0) {
            var17 ^= ((long)((List)var9.getValue()).size() << 32 ^ var17) & -1L << 32;
            if ((int)(var15 >>> 32) == 0 || (int)(var17 >>> 32) > (int)(var13 >>> 32) || (int)(var17 >>> 32) == (int)(var13 >>> 32) && (int)var15 < (int)var13) {
               var15 ^= (4294967296L ^ var15) & -1L << 32;
               var3 = (Long)var9.getKey();
               var13 ^= ((long)((int)(var17 >>> 32)) << 32 ^ var13) & -1L << 32;
               var13 ^= ((long)((int)var15) ^ var13) & -1L >>> 32;
            }
         }
      }

      if ((int)(var15 >>> 32) == 0) {
         return null;
      } else {
         List var19 = iliIiiliiiii(survey, src, var3, (List)w.IIilIliill.get(var3));
         ArrayList var20 = new ArrayList(var19.size());

         for(long var11 : var19) {
            var20.add(new IIIlilIllIIlilIl(var3, var11));
         }

         return new IiillIIlliillIIl(IllIllillllIllil.IllllliIil, var20, List.of(), (int)var13, IilliliilIIi(var20.size(), (int)var13, 0));
      }
   }

   private static long IiIIlliIIl(Map<Long, Long> root, long a) {
      long var3;
      for(var3 = a; (Long)root.get(var3) != var3; var3 = (Long)root.get(var3)) {
      }

      while((Long)root.get(a) != var3) {
         long var5 = (Long)root.get(a);
         root.put(a, var3);
         a = var5;
      }

      return var3;
   }

   private static boolean IlIillIiilIi(ilIiIllIiIiIll r) {
      return r == ilIiIllIiIiIll.lililIliliililIlil || r == ilIiIllIiIiIll.IIiilIlillIiilIlil || r == ilIiIllIiIiIll.iIiilIlilIliilIlil;
   }

   private static List<Long> iIIIlIlIIl(class_1922 w, illIiliIilIili src, long stand, List<Long> cluster) {
      ArrayList var5 = new ArrayList();
      class_243 var6 = IiiIlliiIl(lliIliliIl(stand));
      double var7 = src.iliIiiliiiii();

      for(long var10 : cluster) {
         if (!(class_243.method_24953(lliIliliIl(var10)).method_1025(var6) > (var7 + (double)1.0F) * (var7 + (double)1.0F))) {
            class_2680 var12 = src.iIlIlllllill(var10);
            if (var12 != null && !src.Illlllllilll(var12) && src.IIlllIlliIll(var12)) {
               liIIilliiIIill var13 = src.IIillIiliIil(w, var10, var12);
               if (!var13.lIiiIiIlilli() && lIiIliIliIiIliIl.iIlIlllllill(w, lliIliliIl(var10), var6, var7, var13.IliIlllilIi(), var13.liiiIIllIl(), var13.iIlIlllllill(), var13.IilliliilIIi(), false, class_3726.method_16194(), src.IiIlliIliiIl()).IliIlllilIi()) {
                  var5.add(var10);
               }
            }
         }
      }

      return var5;
   }

   public static iiIilillIIlilill IliIlllilIi(class_1922 w, illIiliIilIili src) {
      long var25 = -7055695737209626939L;
      long var27 = 7077232635233790507L;
      iiIilillIIlilill var2 = new iiIilillIIlilill();
      double var3 = src.iliIiiliiiii();
      var25 ^= ((long)((int)Math.ceil(var3) + 1) << 32 ^ var25) & -1L << 32;
      class_3726 var6 = src.Iilllilliill();
      ArrayList var7 = new ArrayList();

      for(long var9 : src.IliIlllilIi()) {
         var7.add(var9);
      }

      HashMap var29 = new HashMap();

      for(long var10 : var7) {
         ((List)var29.computeIfAbsent(iiiIlIIIll(lilIliilIl(var10), iIiIlIliIl(var10)), (k) -> new ArrayList())).add(var10);
         ++var2.llilIliill;
      }

      for(long var33 : src.lIiiIiIlilli()) {
         class_2338 var12 = lliIliliIl(var33);
         if (IIIlIIIilIIlIIIi.IIlllIlliIll(w, var12)) {
            ++var2.IlilIliill;
            class_243 var13 = IiiIlliiIl(var12);
            ArrayList var14 = null;

            for(var25 ^= ((long)(-((int)(var25 >>> 32))) ^ var25) & -1L >>> 32; (int)var25 <= (int)(var25 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
               for(var27 ^= ((long)(-((int)(var25 >>> 32))) << 32 ^ var27) & -1L << 32; (int)(var27 >>> 32) <= (int)(var25 >>> 32); var27 += 4294967296L) {
                  List var17 = (List)var29.get(iiiIlIIIll(lilIliilIl(var33) + (int)var25, iIiIlIliIl(var33) + (int)(var27 >>> 32)));
                  if (var17 != null) {
                     for(long var19 : var17) {
                        if (Math.abs(IIiIllIiIl(var19) - IIiIllIiIl(var33)) > (int)(var25 >>> 32) + 1) {
                           ++var2.ililIliill;
                        } else {
                           class_2338 var21 = lliIliliIl(var19);
                           if (class_243.method_24953(var21).method_1025(var13) > (var3 + (double)1.0F) * (var3 + (double)1.0F)) {
                              ++var2.ililIliill;
                           } else {
                              class_2680 var22 = src.iIlIlllllill(var19);
                              if (var22 != null && !src.Illlllllilll(var22)) {
                                 liIIilliiIIill var23 = src.IIillIiliIil(w, var19, var22);
                                 if (!var23.lIiiIiIlilli()) {
                                    llIlllIiilIlllIi var24 = lIiIliIliIiIliIl.iIlIlllllill(w, var21, var13, var3, var23.IliIlllilIi(), var23.liiiIIllIl(), var23.iIlIlllllill(), var23.IilliliilIIi(), false, var6, src.IiIlliIliiIl());
                                    if (!var24.IliIlllilIi()) {
                                       var2.iIilIliill.merge(var19, var24.lIiiIiIlilli(), liIiIiIiiiIiIiIi::liiiIIllIl);
                                    } else if (!src.IIlllIlliIll(var22)) {
                                       var2.iIilIliill.put(var19, ilIiIllIiIiIll.IlIIiIlilllIIiIlil);
                                    } else {
                                       if (var14 == null) {
                                          var14 = new ArrayList();
                                       }

                                       var14.add(var19);
                                       ((List)var2.lIilIliill.computeIfAbsent(var19, (k) -> new ArrayList())).add(var33);
                                       var2.iIilIliill.remove(var19);
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (var14 != null) {
               var2.IIilIliill.put(var33, var14);
            }
         }
      }

      for(long var34 : var7) {
         if (var2.lIilIliill.containsKey(var34)) {
            var2.iIilIliill.remove(var34);
         } else if (!var2.iIilIliill.containsKey(var34)) {
            class_2680 var35 = src.iIlIlllllill(var34);
            if (var35 != null && !src.Illlllllilll(var35) && !src.IIillIiliIil(w, var34, var35).lIiiIiIlilli()) {
               var2.iIilIliill.put(var34, ilIiIllIiIiIll.lililIliliililIlil);
            }
         }
      }

      return var2;
   }

   // $FF: synthetic method
   private static CallSite llIililIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 6609) ^ var5) ^ '\udc53') + var5))) << 15 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 6609) ^ var5) ^ '\udc53') + var5))) >>> 1) + '캧') ^ '聠') + 5084) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 6609) ^ var5) ^ '\udc53') + var5))) << 15 | (char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 6609) ^ var5) ^ '\udc53') + var5))) >>> 1) + '캧') ^ '聠') + 5084) >>> 11) - 26847) - '鿸'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int Illillliilli(iIIlIiiIlIlIii n, illIiliIilIili src, IllIIillllIIil w, List<Long> cluster) {
      long var16 = 5047999346880644634L;
      long var14 = 1550853066717218588L;
      ArrayList var4 = new ArrayList();

      for(long var6 : w.iliIiiliiiii()) {
         n.IliIlllilIi(var6, iililIiIIi);
         var4.add(var6);
      }

      boolean var19 = false;

      try {
         var19 = true;
         HashSet var21 = new HashSet(iIIIlIlIIl(n, src, w.IliIlllilIi(), cluster));
         var14 ^= ((long)(12 - w.iliIiiliiiii().size()) << 32 ^ var14) & -1L << 32;

         for(long var8 : cluster) {
            if ((int)(var14 >>> 32) <= 0) {
               break;
            }

            if (!var21.contains(var8)) {
               long var10 = Iliilliiilii(n, src, w.IliIlllilIi(), var8);
               if (var10 != Long.MIN_VALUE) {
                  var14 += -4294967296L;
                  var21.add(var8);
               }
            }
         }

         var14 ^= ((long)var21.size() ^ var14) & -1L >>> 32;
         var19 = false;
      } finally {
         if (var19) {
            for(long var24 = var16 ^ ((long)(var4.size() - 1) ^ var16) & -1L >>> 32; (int)var24 >= 0; var24 ^= (var24 ^ var24 + (long)-1) & -1L >>> 32) {
               n.liiiIIllIl((Long)var4.get((int)var24));
            }

         }
      }

      for(long var25 = var16 ^ ((long)(var4.size() - 1) << 32 ^ var16) & -1L << 32; (int)(var25 >>> 32) >= 0; var25 += -4294967296L) {
         n.liiiIIllIl((Long)var4.get((int)(var25 >>> 32)));
      }

      return (int)var14;
   }

   private static IllIIillllIIil Iiiiliiiiiii(IllIIillllIIil n) {
      while(n.liiiIIllIl() != null) {
         n = n.liiiIIllIl();
      }

      return n;
   }

   // $FF: synthetic method
   private static CallSite ilillIiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] ^ var5))))) - 'ꜞ') ^ var5) - 31085) - 613) - '\udc54'))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String IlIlllIlilIl(class_2680 want) {
      return want == null ? "" : class_7923.field_41175.method_10221(want.method_26204()).toString();
   }

   private static int IIIllIIliIIl(long t, Map<Long, Set<Long>> memo, Map<Long, Integer> dependsOn, Set<Long> path) {
      long var10 = 9099489656916937668L;
      Integer var5 = (Integer)dependsOn.get(t);
      if (var5 != null) {
         return var5;
      } else if (!path.add(t)) {
         return 0;
      } else {
         var10 ^= (0L ^ var10) & -1L << 32;

         for(long var8 : (Set)memo.getOrDefault(t, Set.of())) {
            var10 ^= ((long)Math.max((int)(var10 >>> 32), 1 + IIIllIIliIIl(var8, memo, dependsOn, path)) << 32 ^ var10) & -1L << 32;
         }

         path.remove(t);
         dependsOn.put(t, (int)(var10 >>> 32));
         return (int)(var10 >>> 32);
      }
   }

   private static long iiiIlIIIll(int x, int z) {
      return (long)x << 32 ^ (long)z & 4294967295L;
   }

   public static int lilIliilIl(long k) {
      return class_2338.method_10061(k);
   }

   // $FF: synthetic method
   private static CallSite liilliiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) - var5) ^ '鮡') + '雁'))) ^ var5)) + var5) + var5) - var5) + var5) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int lIIlliIIll(long b, long a) {
      return Math.abs(lilIliilIl(b) - lilIliilIl(a)) + Math.abs(IIiIllIiIl(b) - IIiIllIiIl(a)) + Math.abs(iIiIlIliIl(b) - iIiIlIliIl(a));
   }

   private static boolean IIiilIiiiIii(illIiliIilIili stand, long needed, List<Long> src, int cluster) {
      long var12 = 5578565306254413429L;
      if (cluster <= 0) {
         return true;
      } else {
         class_243 var5 = IiiIlliiIl(lliIliliIl(needed));
         double var6 = (stand.iliIiiliiiii() + (double)1.0F) * (stand.iliIiiliiiii() + (double)1.0F);
         var12 ^= (0L ^ var12) & -1L << 32;

         for(long var10 : src) {
            if (class_243.method_24953(lliIliliIl(var10)).method_1025(var5) <= var6) {
               var12 += 4294967296L;
               if ((int)(var12 >>> 32) >= cluster) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private static ilIiIllIiIiIll liiiIIllIl(ilIiIllIiIiIll a, ilIiIllIiIiIll b) {
      return iIlIlllllill(b) > iIlIlllllill(a) ? b : a;
   }

   private static long lIlIliIlIl(long cell) {
      return illIlIilIl(lilIliilIl(cell) >> 2, IIiIllIiIl(cell) >> 2, iIiIlIliIl(cell) >> 2);
   }

   // $FF: synthetic method
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '\ue557') << 4 | (char)((char)(var4[var5] ^ var5) + '\ue557') >>> 12) - 6289) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) + '\ue557') << 4 | (char)((char)(var4[var5] ^ var5) + '\ue557') >>> 12) - 6289) << 8) ^ '쨈') - var5))) ^ '뺎') - var5) << 4 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '\ue557') << 4 | (char)((char)(var4[var5] ^ var5) + '\ue557') >>> 12) - 6289) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) + '\ue557') << 4 | (char)((char)(var4[var5] ^ var5) + '\ue557') >>> 12) - 6289) << 8) ^ '쨈') - var5))) ^ '뺎') - var5) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ilillllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5261201763212932030L ^ Long.rotateLeft(-5994316869970296986L, 59) ^ -8402175981542506637L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2755485888287150789L ^ Long.rotateLeft(-6824719766438578033L, 58) ^ -1069585012353274009L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 506232973391632479L ^ Long.rotateLeft(-5561586100487035425L, 61) ^ -4414073847044757220L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -71714293083567041L ^ Long.rotateLeft(-3467041901819818053L, 15) ^ 2329722909532036997L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1773814883842753947L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 9061772861637326840L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7283864512502104667L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6853455148279716532L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -462250347976873420L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4476734351046448473L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(ilillIiill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, liilliiill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIillIIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iIIilIlIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIililIil<invokedynamic>());
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

   private static double Iilililiiili(double feet, class_243 aim, long cost) {
      return feet + Math.sqrt(aim.method_1028((double)lilIliilIl(cost), (double)IIiIllIiIl(cost), (double)iIiIlIliIl(cost)));
   }

   public static IiillIIlliillIIl Iiilliiliiil(iIIlIiiIlIlIii diag, illIiliIilIili survey, iiIilillIIlilill w, llilIIiililIIi src) {
      return IIIilIIiiIIi(diag, survey, w, src, iiIlIiiIIllIii.IliIlllilIi());
   }

   private static double IiIiliIiiiIi(List<Long> cells, long from) {
      double var3 = Double.MAX_VALUE;

      for(long var6 : cells) {
         double var8 = (double)(lilIliilIl(var6) - lilIliilIl(from));
         double var10 = (double)(IIiIllIiIl(var6) - IIiIllIiIl(from));
         double var12 = (double)(iIiIlIliIl(var6) - iIiIlIliIl(from));
         var3 = Math.min(var3, var8 * var8 + var10 * var10 + var12 * var12);
      }

      return var3;
   }

   private static void iiIIlIIlIl(Map<Long, Long> b, long root, long a) {
      long var5 = IiIIlliIIl(b, root);
      long var7 = IiIIlliIIl(b, a);
      if (var5 != var7) {
         b.put(var5, var7);
      }

   }

   public static class_2338 lliIliliIl(long k) {
      return class_2338.method_10092(k);
   }

   public static IiillIIlliillIIl Ililllililil(iIIlIiiIlIlIii src, illIiliIilIili survey, iiIilillIIlilill w) {
      return Iiilliiliiil(src, survey, w, new llilIIiililIIi());
   }

   public static double IilliliilIIi(int placements, int nodes, int tempBlocks) {
      return (double)placements * 0.3 + (double)nodes * 0.2 + (double)tempBlocks * 0.9;
   }

   private static boolean llIIlilIIl(class_1922 p, class_2338 w) {
      class_2680 var2 = p.method_8320(w);
      return var2.method_26215() || var2.method_45474();
   }

   static {
      iililIiIIi = class_2246.field_10566.method_9564();
   }

   private static boolean IIIIllIIIl(class_1922 p, class_2338 plannedTemps, Set<Long> w) {
      long var9 = 4542445697823390154L;
      class_2350[] var3 = class_2350.values();
      var9 ^= ((long)var3.length << 32 ^ var9) & -1L << 32;

      for(long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         class_2350 var6 = var3[(int)var12];
         class_2338 var7 = plannedTemps.method_10093(var6);
         if (w.contains(var7.method_10063())) {
            return true;
         }

         class_2680 var8 = p.method_8320(var7);
         if (!var8.method_26215() && !var8.method_45474() && !var8.method_26220(p, var7).method_1110()) {
            return true;
         }
      }

      return false;
   }

   static List<Long> iliIiiliiiii(class_1922 src, illIiliIilIili w, long stand, List<Long> targets) {
      long var19 = -4172706288440060497L;
      long var21 = 3894357841800867041L;
      class_243 var5 = IiiIlliiIl(lliIliliIl(stand));
      HashSet var6 = new HashSet(targets);
      HashMap var7 = new HashMap();

      for(long var9 : targets) {
         HashSet var11 = new HashSet();
         var19 ^= (0L ^ var19) & -1L << 32;
         class_2350[] var13 = class_2350.values();
         var19 ^= ((long)var13.length ^ var19) & -1L >>> 32;

         for(var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < (int)var19; var21 += 4294967296L) {
            class_2350 var16 = var13[(int)(var21 >>> 32)];
            class_2338 var17 = lliIliliIl(var9).method_10093(var16);
            class_2680 var18 = src.method_8320(var17);
            if (!var18.method_26215() && !var18.method_45474() && !var18.method_26220(src, var17).method_1110()) {
               var19 ^= (4294967296L ^ var19) & -1L << 32;
               break;
            }

            if (var6.contains(var17.method_10063())) {
               var11.add(var17.method_10063());
            }
         }

         var7.put(var9, (int)(var19 >>> 32) != 0 ? Set.of() : var11);
      }

      HashMap var23 = new HashMap();

      for(long var10 : targets) {
         var23.put(var10, IIIllIIliIIl(var10, var7, var23, new HashSet()));
      }

      ArrayList var25 = new ArrayList(targets);
      var25.sort(Comparator.comparingInt((t) -> (Integer)var23.getOrDefault(t, 0)).thenComparing((t) -> -class_243.method_24953(lliIliliIl(t)).method_1025(var5)).thenComparing((srcx) -> IlIlllIlilIl(w.iIlIlllllill(srcx))).thenComparingDouble((t) -> IiIlliIliiIl(var5, t)));
      return var25;
   }

   public static IiillIIlliillIIl IIillIiliIil(iIIlIiiIlIlIii w, illIiliIilIili src, int lookahead, int maxSteps) {
      long var18 = -7379253401643676131L;
      long var20 = -5803991763485940049L;
      ArrayList var4 = new ArrayList();
      HashSet var5 = new HashSet();
      var18 ^= (-4294967296L ^ var18) & -1L << 32;
      var18 ^= (0L ^ var18) & -1L >>> 32;
      long var8 = src.IIIllIIliIIl();

      for(var20 ^= (0L ^ var20) & -1L << 32; (int)(var20 >>> 32) < lookahead && var4.size() < maxSteps; var20 += 4294967296L) {
         iiIilillIIlilill var11 = IliIlllilIi(w, src);
         if (var11.IIilIliill.isEmpty()) {
            break;
         }

         IiillIIlliillIIl var12 = Iilllilliill(w, src, var11, 6, var5);
         if (var12 == null || var12.Illlllllilll()) {
            break;
         }

         long var13 = var8;
         var20 ^= (0L ^ var20) & -1L >>> 32;

         for(IIIlilIllIIlilIl var17 : var12.liiiIIllIl()) {
            if (var4.size() >= maxSteps) {
               break;
            }

            if (var5.add(var17.iIlIlllllill())) {
               var4.add(var17);
               w.IliIlllilIi(var17.iIlIlllllill(), src.iIlIlllllill(var17.iIlIlllllill()));
               var13 = var17.liiiIIllIl();
               var20 ^= (1L ^ var20) & -1L >>> 32;
            }
         }

         if ((int)var20 == 0) {
            break;
         }

         if ((int)(var18 >>> 32) < 0) {
            var18 ^= ((long)var12.IilliliilIIi() << 32 ^ var18) & -1L << 32;
         } else {
            var18 ^= ((long)((int)var18 + lIIlliIIll(var8, ((IIIlilIllIIlilIl)var12.liiiIIllIl().get(0)).liiiIIllIl())) ^ var18) & -1L >>> 32;
         }

         var18 ^= ((long)((int)var18 + lIIlliIIll(((IIIlilIllIIlilIl)var12.liiiIIllIl().get(0)).liiiIIllIl(), var13)) ^ var18) & -1L >>> 32;
         var8 = var13;
      }

      if (var4.isEmpty()) {
         return null;
      } else {
         if ((int)(var18 >>> 32) < 0) {
            var18 ^= (0L ^ var18) & -1L << 32;
         }

         return new IiillIIlliillIIl(IllIllillllIllil.IilllliIil, var4, List.of(), (int)(var18 >>> 32), IilliliilIIi(var4.size(), (int)(var18 >>> 32) + (int)var18, 0));
      }
   }

   // $FF: synthetic method
   private static CallSite IIIillIIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 13 | (char)(var4[var5] - var5) << 3))))) >>> 6 | (char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 13 | (char)(var4[var5] - var5) << 3))))) << 10) ^ 16725))) + var5) ^ '\ue24d'))) + var5) << 8 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 13 | (char)(var4[var5] - var5) << 3))))) >>> 6 | (char)(~((char)(-((char)((char)(var4[var5] - var5) >>> 13 | (char)(var4[var5] - var5) << 3))))) << 10) ^ 16725))) + var5) ^ '\ue24d'))) + var5) >>> 8) ^ var5) ^ var5) + 10814) ^ '黬'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static IiillIIlliillIIl IIlilIliiIli(iIIlIiiIlIlIii diag, illIiliIilIili src, List<Long> req, llilIIiililIIi w, iiIlIiiIIllIii cluster) {
      long var38 = 5443014546321068511L;
      long var40 = -9194444819800046755L;
      long var42 = 5200279858101657084L;
      long var44 = 1692023188152723855L;
      long var46 = -4799477863130277854L;
      long var5 = src.IIIllIIliIIl();
      long var7 = 0L;
      double var9 = Double.MAX_VALUE;

      for(long var12 : req) {
         double var14 = (double)(lilIliilIl(var12) - lilIliilIl(var5));
         double var16 = (double)(IIiIllIiIl(var12) - IIiIllIiIl(var5));
         double var18 = (double)(iIiIlIliIl(var12) - iIiIlIliIl(var5));
         double var20 = var14 * var14 + var16 * var16 + var18 * var18;
         if (var20 < var9) {
            var9 = var20;
            var7 = var12;
         }
      }

      class_243 var51 = class_243.method_24953(lliIliliIl(var7));
      PriorityQueue var52 = new PriorityQueue(Comparator.comparingDouble(IllIIillllIIil::lIiiIiIlilli));
      HashMap var13 = new HashMap();

      for(long var15 : src.lIiiIiIlilli()) {
         if (src.IlIlllIlilIl(var15) >= 0 && IIIlIIIilIIlIIIi.IIlllIlliIll(diag, lliIliliIl(var15)) && !(var51.method_1028((double)lilIliilIl(var15), (double)IIiIllIiIl(var15), (double)iIiIlIliIl(var15)) > (double)576.0F)) {
            var52.add(new IllIIillllIIil(var15, (IllIIillllIIil)null, 0, (double)0.0F, Iilililiiili((double)0.0F, var51, var15), Set.of()));
            var13.put(var15 * 31L, (double)0.0F);
         }
      }

      w.ilIIliiliIiIIliili = Math.max(w.ilIIliiliIiIIliili, var52.size());
      if (var52.isEmpty()) {
         w.IilIliilililIliili = Ilillllill<invokedynamic>();
         return null;
      } else {
         IllIIillllIIil var54 = null;

         for(long var76 = var38 ^ (0L ^ var38) & -1L << 32; (int)(var76 >>> 32) < 4000 && !var52.isEmpty(); var76 += 4294967296L) {
            IllIIillllIIil var56 = (IllIIillllIIil)var52.poll();
            ++w.liIIliiliiiIIliili;
            if (!var56.iiillilIiIIIililIi.isEmpty() && IIiilIiiiIii(src, var56.lilllilIiiilllilIi, req, cluster.iliIiiliiiii()) && Illillliilli(diag, src, var56, req) >= cluster.iliIiiliiiii()) {
               var54 = var56;
               break;
            }

            if (var56.iIillilIiIlillilIi < 28) {
               var76 ^= ((long)llIIlilIIl(diag, lliIliliIl(var56.lilllilIiiilllilIi).method_10086(2)) ^ var76) & -1L >>> 32;
               int[][] var58 = lililIiIIi;
               var40 ^= ((long)var58.length << 32 ^ var40) & -1L << 32;

               for(var40 ^= (0L ^ var40) & -1L >>> 32; (int)var40 < (int)(var40 >>> 32); var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32) {
                  int[] var21 = var58[(int)var40];
                  if (var21[1] <= 0 || (int)var76 != 0) {
                     long var22 = illIlIilIl(lilIliilIl(var56.lilllilIiiilllilIi) + var21[0], IIiIllIiIl(var56.lilllilIiiilllilIi) + var21[1], iIiIlIliIl(var56.lilllilIiiilllilIi) + var21[2]);
                     class_2338 var24 = lliIliliIl(var22);
                     if (llIIlilIIl(diag, var24) && llIIlilIIl(diag, var24.method_10084())) {
                        long var25 = var24.method_10074().method_10063();
                        var42 ^= ((long)(!IIIlIIIilIIlIIIi.IIlllIlliIll(diag, var24) && !var56.iiillilIiIIIililIi.contains(var25) ? 0 : 1) << 32 ^ var42) & -1L << 32;
                        Object var30 = var56.iiillilIiIIIililIi;
                        double var28;
                        if ((int)(var42 >>> 32) != 0) {
                           var28 = (double)1.0F;
                        } else {
                           if (var56.iiillilIiIIIililIi.size() >= 12 || !llIIlilIIl(diag, var24.method_10074()) || !IIIIllIIIl(diag, var24.method_10074(), var56.iiillilIiIIIililIi)) {
                              continue;
                           }

                           diag.IliIlllilIi(var25, iililIiIIi);
                           var42 ^= ((long)IIIlIIIilIIlIIIi.IIlllIlliIll(diag, var24) ^ var42) & -1L >>> 32;
                           diag.liiiIIllIl(var25);
                           if ((int)var42 == 0) {
                              continue;
                           }

                           var28 = (double)9.0F;
                           var30 = new HashSet(var56.iiillilIiIIIililIi);
                           ((Set)var30).add(var25);
                        }

                        double var31 = var56.llillilIiilillilIi + var28;
                        long var33 = var22 * 31L + (long)((Set)var30).size();
                        Double var35 = (Double)var13.get(var33);
                        if (var35 == null || !(var35 <= var31)) {
                           var13.put(var33, var31);
                           var52.add(new IllIIillllIIil(var22, var56, var56.iIillilIiIlillilIi + 1, var31, Iilililiiili(var31, var51, var22), (Set)var30));
                        }
                     }
                  }
               }
            }
         }

         if (var54 == null) {
            if (w.IIlIliililIlIliili == 0) {
               w.IilIliilililIliili = Ilillllill<invokedynamic>();
            }

            return null;
         } else {
            ArrayList var55 = new ArrayList();
            ArrayList var57 = new ArrayList();
            ArrayList var17 = new ArrayList();
            HashSet var59 = new HashSet();
            boolean var49 = false;

            Object var69;
            label544: {
               IiillIIlliillIIl var74;
               try {
                  var49 = true;
                  ArrayList var19 = new ArrayList();

                  for(IllIIillllIIil var60 = var54; var60 != null; var60 = var60.IIillilIilIillilIi) {
                     var19.add(var60);
                  }

                  Collections.reverse(var19);

                  for(var40 ^= (1L ^ var40) & -1L >>> 32; (int)var40 < var19.size(); var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32) {
                     IllIIillllIIil var64 = (IllIIillllIIil)var19.get((int)var40);
                     long var70 = illIlIilIl(lilIliilIl(var64.IliIlllilIi()), IIiIllIiIl(var64.IliIlllilIi()) - 1, iIiIlIliIl(var64.IliIlllilIi()));
                     if (var54.iliIiiliiiii().contains(var70)) {
                        var17.add(new IIIlilIllIIlilIl(((IllIIillllIIil)var19.get((int)var40 - 1)).IliIlllilIi(), var70, iIiliIIiIliliIIi.ilIliliiil));
                        var55.add(var70);
                        diag.IliIlllilIi(var70, iililIiIIi);
                        var57.add(var70);
                     }
                  }

                  for(long var65 : var54.iliIiiliiiii()) {
                     if (!var55.contains(var65)) {
                        var17.add(new IIIlilIllIIlilIl(var54.IliIlllilIi(), var65, iIiliIIiIliliIIi.ilIliliiil));
                        var55.add(var65);
                        diag.IliIlllilIi(var65, iililIiIIi);
                        var57.add(var65);
                     }
                  }

                  for(IllIIillllIIil var62 = var54; var62 != null; var62 = var62.IIillilIilIillilIi) {
                     for(long var71 : iIIIlIlIIl(diag, src, var62.lilllilIiiilllilIi, req)) {
                        if (var59.add(var71)) {
                           var17.add(new IIIlilIllIIlilIl(var62.lilllilIiiilllilIi, var71));
                        }
                     }
                  }

                  for(IllIIillllIIil var63 = var54; var63 != null && var55.size() < 12; var63 = var63.IIillilIilIillilIi) {
                     for(long var72 : req) {
                        if (!var59.contains(var72) && var55.size() < 12) {
                           long var75 = Iliilliiilii(diag, src, var63.lilllilIiiilllilIi, var72);
                           if (var75 != Long.MIN_VALUE) {
                              var55.add(var75);
                              diag.IliIlllilIi(var75, iililIiIIi);
                              var57.add(var75);
                              var59.add(var72);
                              var17.add(new IIIlilIllIIlilIl(var63.lilllilIiiilllilIi, var75, iIiliIIiIliliIIi.ilIliliiil));
                              var17.add(new IIIlilIllIIlilIl(var63.lilllilIiiilllilIi, var72));
                           }
                        }
                     }
                  }

                  var40 ^= (0L ^ var40) & -1L >>> 32;

                  for(IIIlilIllIIlilIl var73 : var17) {
                     if (!var73.IliIlllilIi()) {
                        var40 ^= (var40 ^ var40 + (long)1) & -1L >>> 32;
                     }
                  }

                  w.iIlIliiliIllIliili = var55.size();
                  w.lllIliiliillIliili = (int)var40;
                  if ((int)var40 < cluster.iliIiiliiiii()) {
                     w.IilIliilililIliili = Ilillllill<invokedynamic>() + (int)var40 + Ilillllill<invokedynamic>() + cluster.iliIiiliiiii() + Ilillllill<invokedynamic>();
                     var69 = null;
                     var49 = false;
                     break label544;
                  }

                  w.IilIliilililIliili = Ilillllill<invokedynamic>();
                  var44 ^= ((long)Math.max(0, src.IlIlllIlilIl(Iiiiliiiiiii(var54).lilllilIiiilllilIi)) ^ var44) & -1L >>> 32;
                  var74 = new IiillIIlliillIIl(IllIllillllIllil.lilllliIil, var17, var55, (int)var44, IilliliilIIi((int)var40, (int)var44 + var54.iIillilIiIlillilIi, var55.size()));
                  var49 = false;
               } finally {
                  if (var49) {
                     for(long var82 = var46 ^ ((long)(var57.size() - 1) ^ var46) & -1L >>> 32; (int)var82 >= 0; var82 ^= (var82 ^ var82 + (long)-1) & -1L >>> 32) {
                        diag.liiiIIllIl((Long)var57.get((int)var82));
                     }

                  }
               }

               for(long var83 = var46 ^ ((long)(var57.size() - 1) << 32 ^ var46) & -1L << 32; (int)(var83 >>> 32) >= 0; var83 += -4294967296L) {
                  diag.liiiIIllIl((Long)var57.get((int)(var83 >>> 32)));
               }

               return var74;
            }

            for(long var81 = var44 ^ ((long)(var57.size() - 1) << 32 ^ var44) & -1L << 32; (int)(var81 >>> 32) >= 0; var81 += -4294967296L) {
               diag.liiiIIllIl((Long)var57.get((int)(var81 >>> 32)));
            }

            return (IiillIIlliillIIl)var69;
         }
      }
   }

   private static long Iliilliiilii(iIIlIiiIlIlIii w, illIiliIilIili stand, long target, long src) {
      long var18 = 6783392682181677838L;
      long var20 = 5292662214213280310L;
      class_243 var6 = IiiIlliiIl(lliIliliIl(target));
      double var7 = stand.iliIiiliiiii();
      if (class_243.method_24953(lliIliliIl(src)).method_1025(var6) > (var7 + (double)1.0F) * (var7 + (double)1.0F)) {
         return Long.MIN_VALUE;
      } else {
         class_2680 var9 = stand.iIlIlllllill(src);
         if (var9 != null && !stand.Illlllllilll(var9) && stand.IIlllIlliIll(var9)) {
            liIIilliiIIill var10 = stand.IIillIiliIil(w, src, var9);
            if (var10.lIiiIiIlilli()) {
               return Long.MIN_VALUE;
            } else {
               class_2350[] var11 = class_2350.values();
               var18 ^= ((long)var11.length << 32 ^ var18) & -1L << 32;

               for(long var23 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var23 < (int)(var23 >>> 32); var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
                  class_2350 var14 = var11[(int)var23];
                  if (var10.IliIlllilIi() == null || var14 == var10.IliIlllilIi()) {
                     class_2338 var15 = lliIliliIl(src).method_10093(var14);
                     if (llIIlilIIl(w, var15) && stand.iIlIlllllill(var15.method_10063()) == null && IIIIllIIIl(w, var15, Set.of())) {
                        w.IliIlllilIi(var15.method_10063(), iililIiIIi);
                        liIIilliiIIill var16 = stand.IIillIiliIil(w, src, var9);
                        var20 ^= ((long)lIiIliIliIiIliIl.iIlIlllllill(w, lliIliliIl(src), var6, var7, var16.IliIlllilIi(), var16.liiiIIllIl(), var16.iIlIlllllill(), var16.IilliliilIIi(), false, stand.Iilllilliill(), stand.IiIlliIliiIl()).IliIlllilIi() << 32 ^ var20) & -1L << 32;
                        w.liiiIIllIl(var15.method_10063());
                        if ((int)(var20 >>> 32) != 0) {
                           return var15.method_10063();
                        }
                     }
                  }
               }

               return Long.MIN_VALUE;
            }
         } else {
            return Long.MIN_VALUE;
         }
      }
   }

   public static IiillIIlliillIIl Iilllilliill(class_1922 w, illIiliIilIili maxStands, iiIilillIIlilill src, int survey, Set<Long> alreadyPlanned) {
      long var24 = -4806429347137985041L;
      long var26 = -5774477849399543253L;
      long var28 = 8826484361125110580L;
      if (src.IIilIliill.isEmpty()) {
         return null;
      } else {
         HashSet var5 = new HashSet(alreadyPlanned);
         ArrayList var6 = new ArrayList();
         long var7 = maxStands.IIIllIIliIIl();
         var24 ^= (-4294967296L ^ var24) & -1L << 32;
         var24 ^= (0L ^ var24) & -1L >>> 32;

         for(var26 ^= (0L ^ var26) & -1L << 32; (int)(var26 >>> 32) < survey; var26 += 4294967296L) {
            long var12 = 0L;
            ArrayList var14 = null;
            var26 ^= (0L ^ var26) & -1L >>> 32;
            double var16 = (double)0.0F;

            for(Map.Entry var19 : src.IIilIliill.entrySet()) {
               if (maxStands.IlIlllIlilIl((Long)var19.getKey()) >= 0) {
                  ArrayList var20 = new ArrayList();

                  for(long var22 : (List)var19.getValue()) {
                     if (!var5.contains(var22)) {
                        var20.add(var22);
                     }
                  }

                  if (!var20.isEmpty()) {
                     var28 ^= ((long)lIIlliIIll(var7, (Long)var19.getKey()) << 32 ^ var28) & -1L << 32;
                     double var32 = (double)var20.size() / IilliliilIIi(var20.size(), (int)(var28 >>> 32), 0);
                     if (var32 > var16) {
                        var16 = var32;
                        var12 = (Long)var19.getKey();
                        var14 = var20;
                        var26 ^= ((long)((int)(var28 >>> 32)) ^ var26) & -1L >>> 32;
                     }
                  }
               }
            }

            if (var14 == null || !var6.isEmpty() && var16 < 0.8333333333333334) {
               break;
            }

            if ((int)(var24 >>> 32) < 0) {
               var24 ^= ((long)maxStands.IlIlllIlilIl(var12) << 32 ^ var24) & -1L << 32;
            } else {
               var24 ^= ((long)((int)var24 + (int)var26) ^ var24) & -1L >>> 32;
            }

            for(long var31 : iliIiiliiiii(w, maxStands, var12, var14)) {
               var6.add(new IIIlilIllIIlilIl(var12, var31));
               var5.add(var31);
            }

            var7 = var12;
         }

         if (var6.isEmpty()) {
            return null;
         } else {
            if ((int)(var24 >>> 32) < 0) {
               var24 ^= (0L ^ var24) & -1L << 32;
            }

            return new IiillIIlliillIIl(IllIllillllIllil.lllllliIil, var6, List.of(), (int)(var24 >>> 32), IilliliilIIi(var6.size(), (int)(var24 >>> 32) + (int)var24, 0));
         }
      }
   }
}
