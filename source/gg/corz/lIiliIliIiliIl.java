package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_11582;
import net.minecraft.class_11583;
import net.minecraft.class_11586;
import net.minecraft.class_2185;
import net.minecraft.class_2190;
import net.minecraft.class_2195;
import net.minecraft.class_2202;
import net.minecraft.class_2211;
import net.minecraft.class_2231;
import net.minecraft.class_2241;
import net.minecraft.class_2244;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2266;
import net.minecraft.class_2269;
import net.minecraft.class_2275;
import net.minecraft.class_2281;
import net.minecraft.class_2282;
import net.minecraft.class_2286;
import net.minecraft.class_2302;
import net.minecraft.class_2313;
import net.minecraft.class_2323;
import net.minecraft.class_2344;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2354;
import net.minecraft.class_2363;
import net.minecraft.class_2377;
import net.minecraft.class_2384;
import net.minecraft.class_2389;
import net.minecraft.class_2391;
import net.minecraft.class_2393;
import net.minecraft.class_2399;
import net.minecraft.class_2401;
import net.minecraft.class_2421;
import net.minecraft.class_2426;
import net.minecraft.class_2435;
import net.minecraft.class_2442;
import net.minecraft.class_2457;
import net.minecraft.class_2459;
import net.minecraft.class_2462;
import net.minecraft.class_2478;
import net.minecraft.class_2482;
import net.minecraft.class_2510;
import net.minecraft.class_2513;
import net.minecraft.class_2523;
import net.minecraft.class_2527;
import net.minecraft.class_2533;
import net.minecraft.class_2544;
import net.minecraft.class_2577;
import net.minecraft.class_2665;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2758;
import net.minecraft.class_2769;
import net.minecraft.class_3736;
import net.minecraft.class_3749;
import net.minecraft.class_3830;
import net.minecraft.class_3922;
import net.minecraft.class_5172;
import net.minecraft.class_5540;
import net.minecraft.class_5545;
import net.minecraft.class_5554;
import net.minecraft.class_5804;
import net.minecraft.class_5805;
import net.minecraft.class_7923;
import net.minecraft.class_8237;
import net.minecraft.class_8922;
import net.minecraft.class_2350.class_2351;

public final class lIiliIliIiliIl {
   private static final ConcurrentHashMap<class_2248, Optional<class_2758>> llIiilillilIiilill;
   public static final int iliillillIiiillill = 15;
   static final illiIIliIiliIIli IIllililllIllilill;
   static final illiIIliIiliIIli iIiIilillIliIilill;
   public static final int iIIIilillIlIIilill = 18;
   static final illiIIliIiliIIli Ilililillllililill;
   public static final int IIIIililllIIIilill = 17;
   public static final int ilIillillIiIillill = 6;
   public static final int liIillilliiIillill = 7;
   public static final int liiillilliiiillill = 16;
   public static final int iIilllillIlilllill = 0;
   public static final int illIilillIilIilill = 24;
   public static final int Iilillilllilillill = 11;
   static final illiIIliIiliIIli lliIililliliIilill;
   static final illiIIliIiliIIli IlIlilillllIlilill;
   public static final int lilIililliilIilill = 25;
   public static final int lIlIililliIlIilill = 22;
   static final illiIIliIiliIIli IIIiililllIIiilill;
   static final illiIIliIiliIIli Iillililllillilill;
   static final illiIIliIiliIIli IiiIilillliiIilill;
   public static final int IlIillillllIillill = 5;
   private static final ConcurrentHashMap<class_2248, illiIIliIiliIIli> iIIiilillIlIiilill;
   public static final int IiIIilillliIIilill = 20;
   static final illiIIliIiliIIli lIIlililliIIlilill;
   public static final int iilillillIIiillill = 12;
   static final illiIIliIiliIIli iiiIilillIIIlilill;
   public static final int IIlillilllIlillill = 8;
   static final illiIIliIiliIIli iillilillIIililill;
   private static final boolean[] IiIiilillliIiilill;
   static final illiIIliIiliIIli lIilililliIililill;
   static final illiIIliIiliIIli iIllilillIlllilill;
   static final illiIIliIiliIIli llllilillilllilill;
   static final illiIIliIiliIIli ilIlilillIiIlilill;
   public static final int llilllillililllill = 1;
   public static final int lllillillillillill = 10;
   static final illiIIliIiliIIli liIlililliiIlilill;
   public static final int IllIililllllIilill = 23;
   private static final String[] iiIiilillIIliilill;
   public static final int lIIillilliIIillill = 4;
   public static final int iIlillillIllillill = 9;
   static final illiIIliIiliIIli liilililliiililill;
   public static final int Iliillilllliillill = 14;
   public static final int Iiilllillliilllill = 2;
   static final illiIIliIiliIIli IIiIililllIiIilill;
   public static final int iiilllillIIIillill = 3;
   static final illiIIliIiliIIli ilililillIiililill;
   public static final int llIIilillilIIilill = 19;
   public static final int lIiillilliIiillill = 13;
   public static final int iiIIilillIIlIilill = 21;

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] + 22563) ^ var5) >>> 15 | (char)((char)(var4[var5] + 22563) ^ var5) << 1) >>> 3 | (char)((char)((char)(var4[var5] + 22563) ^ var5) >>> 15 | (char)((char)(var4[var5] + 22563) ^ var5) << 1) << 13))) + 'ﶇ'))) + var5))) - var5) + 22331));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static illiIIliIiliIIli Illillliilli(int shape, int family) {
      return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lliilliiil, 1, family, 0, shape, 0);
   }

   public static int liiiIIllIl(class_2680 s) {
      if (s.method_26215()) {
         return 0;
      } else if (s.method_51176()) {
         return 1;
      } else {
         illiIIliIiliIIli var1 = IliIlllilIi(s.method_26204());
         if (iIlIlllllill(s, var1)) {
            return 3;
         } else {
            return lIiiIiIlilli(s, var1) ? 2 : 4;
         }
      }
   }

   public static boolean IilliliilIIi(class_2680 s) {
      return lIiiIiIlilli(s, IliIlllilIi(s.method_26204()));
   }

   public static class_2758 IIlllIlliIll(class_2248 b) {
      return (class_2758)((Optional)llIiilillilIiilill.computeIfAbsent(b, (blk) -> {
         for(class_2769 var2 : blk.method_9564().method_28501()) {
            if (var2 instanceof class_2758 var3) {
               if (Iliilliiilii<invokedynamic>().equals(var3.method_11899())) {
                  return Optional.of(var3);
               }
            }
         }

         return Optional.empty();
      })).orElse((Object)null);
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) >>> 1) + '콗') - var5) + '뚓') - 7275) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) >>> 1) + '콗') - var5) + '뚓') - 7275) << 3))) + var5))) << 7 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) >>> 1) + '콗') - var5) + '뚓') - 7275) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) << 3 | (char)((char)((char)((char)(var4[var5] - var5) + '\ue4f1') - var5) + 25694) >>> 13) << 1) >>> 1) + '콗') - var5) + '뚓') - 7275) << 3))) + var5))) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean iIlIlllllill(class_2680 i, illiIIliIiliIIli s) {
      return s.IlilIiIlIi != null;
   }

   private static int IiIlliIliiIl(class_2350.class_2351 a) {
      switch (a) {
         case field_11048 -> {
            return 0;
         }
         case field_11052 -> {
            return 1;
         }
         default -> {
            return 2;
         }
      }
   }

   private lIiliIliIiliIl() {
   }

   public static int IlIlllIlilIl(class_2680 s) {
      if (s.method_28498(class_2741.field_12496)) {
         return IiIlliIliiIl((class_2350.class_2351)s.method_11654(class_2741.field_12496));
      } else {
         return s.method_28498(class_2741.field_12529) ? IiIlliIliiIl((class_2350.class_2351)s.method_11654(class_2741.field_12529)) : -1;
      }
   }

   private static illiIIliIiliIIli IlIillIiilIi(class_2248 p, String b) {
      if (p == class_2246.field_9980) {
         return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 4, 23);
      } else if (p != class_2246.field_16335 && p != class_2246.field_16329 && p != class_2246.field_10083 && p != class_2246.field_16336 && p != class_2246.field_16331 && p != class_2246.field_16337 && p != class_2246.field_17563) {
         if (p != class_2246.field_10535 && p != class_2246.field_10105 && p != class_2246.field_10414) {
            if (p == class_2246.field_10485) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 6, 0, 10, 26, 0);
            } else if (p == class_2246.field_10333) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 5, 0, 9, 27, 0);
            } else if (p == class_2246.field_10327) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 10, 0, 11, 28, 0);
            } else if (p == class_2246.field_10502) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 8, 0, 19, 29, 0);
            } else if (p instanceof class_2244) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 8, 0, 12, 30, 0);
            } else if (p != class_2246.field_23152 && p != class_2246.field_23261) {
               if (p == class_2246.field_16330) {
                  return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 15, 32, 0);
               } else if (p == class_2246.field_10504) {
                  return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 1, 32);
               } else if (p == class_2246.field_40276) {
                  return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 21, 33, 0);
               } else if (p instanceof class_11586) {
                  return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 24, 45, 0);
               } else if (p instanceof class_3922) {
                  return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 18, p == class_2246.field_23860 ? 36 : 35, 0);
               } else if (p instanceof class_2478) {
                  return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 13, 37, 0);
               } else if (p instanceof class_2185) {
                  return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 14, 38, 0);
               } else if (p == class_2246.field_42752) {
                  return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 1, 0, 23, 39, 0);
               } else if (p instanceof class_2275) {
                  return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 2, 40);
               } else if (!(p instanceof class_2190)) {
                  if (p != class_2246.field_10495 && !b.startsWith(Iliilliiilii<invokedynamic>())) {
                     if (p == class_2246.field_20422) {
                        return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 3, 0, 27, 44, 0);
                     } else if (p == class_2246.field_20421) {
                        return IIiIililllIiIilill;
                     } else if (p instanceof class_11583) {
                        return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 3, 0, 26, 46, 0);
                     } else if (p == class_2246.field_10183) {
                        return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 1, 47);
                     } else if (p == class_2246.field_54717) {
                        return Iiilliiliiil(16);
                     } else {
                        return p == class_2246.field_59752 ? Iiilliiliiil(17) : null;
                     }
                  } else {
                     return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 1, 43);
                  }
               } else {
                  return !(p instanceof class_2435) && !b.startsWith(Iliilliiilii<invokedynamic>()) ? new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 1, 0, 28, 41, 0) : new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 3, 0, 28, 42, 0);
               }
            } else {
               return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 8, 31);
            }
         } else {
            return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 4, 25);
         }
      } else {
         return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 4, 24);
      }
   }

   private static illiIIliIiliIIli Iilililiiili(class_2248 p, String b) {
      long var9 = -6132009328125784381L;
      long var11 = 6240432563222484910L;
      var9 ^= ((long)IIlilIliiIli(p) << 32 ^ var9) & -1L << 32;
      if (p instanceof class_2399) {
         return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 95);
      } else if (p instanceof class_3736) {
         return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 96);
      } else if (p == class_2246.field_10359) {
         return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 93);
      } else if (p == class_2246.field_10194) {
         return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 94);
      } else if (!(p instanceof class_2577) && !b.endsWith(Iliilliiilii<invokedynamic>())) {
         if (p instanceof class_5172) {
            return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 89);
         } else if (p != class_2246.field_10576 && p != class_2246.field_9973 && p != class_2246.field_10453) {
            if (p == class_2246.field_10540) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lliilliiil, 1, 0, 0, 91, 14);
            } else if (b.contains(Iliilliiilii<invokedynamic>()) && !b.endsWith(Iliilliiilii<invokedynamic>()) && p != class_2246.field_33509) {
               return Illillliilli(74, (int)(var9 >>> 32));
            } else if (b.contains(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>())) {
               return Illillliilli(73, (int)(var9 >>> 32));
            } else if (b.contains(Iliilliiilii<invokedynamic>())) {
               if (b.contains(Iliilliiilii<invokedynamic>())) {
                  return Illillliilli(71, (int)(var9 >>> 32));
               } else {
                  return !b.contains(Iliilliiilii<invokedynamic>()) && !b.contains(Iliilliiilii<invokedynamic>()) && !b.contains(Iliilliiilii<invokedynamic>()) && !b.contains(Iliilliiilii<invokedynamic>()) ? IIiIililllIiIilill : Illillliilli(70, (int)(var9 >>> 32));
               }
            } else if (b.contains(Iliilliiilii<invokedynamic>())) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lliilliiil, 1, (int)(var9 >>> 32), 0, 75, b.equals(Iliilliiilii<invokedynamic>()) ? 15 : 0);
            } else if (b.contains(Iliilliiilii<invokedynamic>())) {
               return Illillliilli(76, (int)(var9 >>> 32));
            } else if (!b.contains(Iliilliiilii<invokedynamic>()) && !b.contains(Iliilliiilii<invokedynamic>())) {
               if (b.contains(Iliilliiilii<invokedynamic>())) {
                  return Illillliilli(80, (int)(var9 >>> 32));
               } else if (b.contains(Iliilliiilii<invokedynamic>()) && !b.endsWith(Iliilliiilii<invokedynamic>())) {
                  return Illillliilli(78, (int)(var9 >>> 32));
               } else if (b.contains(Iliilliiilii<invokedynamic>())) {
                  return !b.equals(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>()) ? Illillliilli(81, (int)(var9 >>> 32)) : IIiIililllIiIilill;
               } else if (!b.contains(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>())) {
                  if (!b.equals(Iliilliiilii<invokedynamic>()) && !b.startsWith(Iliilliiilii<invokedynamic>())) {
                     if (b.contains(Iliilliiilii<invokedynamic>())) {
                        return Illillliilli(66, (int)(var9 >>> 32));
                     } else if (b.contains(Iliilliiilii<invokedynamic>())) {
                        return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lliilliiil, 1, (int)(var9 >>> 32), 0, 65, b.equals(Iliilliiilii<invokedynamic>()) ? 18 : 0);
                     } else if (b.contains(Iliilliiilii<invokedynamic>())) {
                        return Illillliilli(77, (int)(var9 >>> 32));
                     } else if (b.contains(Iliilliiilii<invokedynamic>())) {
                        return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 83);
                     } else if (b.contains(Iliilliiilii<invokedynamic>())) {
                        return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lliilliiil, 1, 0, 0, 82, 13);
                     } else if (b.contains(Iliilliiilii<invokedynamic>())) {
                        return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 84);
                     } else if (b.equals(Iliilliiilii<invokedynamic>())) {
                        return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 86);
                     } else if (b.contains(Iliilliiilii<invokedynamic>())) {
                        return Illillliilli(85, (int)(var9 >>> 32));
                     } else if (b.contains(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>())) {
                        return Illillliilli(92, (int)(var9 >>> 32));
                     } else if (!b.equals(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>())) {
                        String var3 = b.startsWith(Iliilliiilii<invokedynamic>()) ? b.substring(Iliilliiilii<invokedynamic>().length()) : b;
                        String[] var4 = iiIiilillIIliilill;
                        var9 ^= ((long)var4.length ^ var9) & -1L >>> 32;

                        for(var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < (int)var9; var11 += 4294967296L) {
                           String var7 = var4[(int)(var11 >>> 32)];
                           if (var3.startsWith(var7)) {
                              var11 ^= ((long)(!var3.endsWith(Iliilliiilii<invokedynamic>()) && (int)(var9 >>> 32) == 0 && !b.startsWith(Iliilliiilii<invokedynamic>()) && !var3.contains(Iliilliiilii<invokedynamic>()) && !var3.equals(Iliilliiilii<invokedynamic>()) ? 0 : 1) ^ var11) & -1L >>> 32;
                              if ((int)var11 != 0) {
                                 return Illillliilli(var3.startsWith(Iliilliiilii<invokedynamic>()) ? 64 : 63, (int)(var9 >>> 32));
                              }
                              break;
                           }
                        }

                        if (!b.equals(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>()) && !b.equals(Iliilliiilii<invokedynamic>()) && (!b.contains(Iliilliiilii<invokedynamic>()) && !b.contains(Iliilliiilii<invokedynamic>()) && !b.contains(Iliilliiilii<invokedynamic>()) || !b.startsWith(Iliilliiilii<invokedynamic>()) && (int)(var9 >>> 32) == 0)) {
                           if (p != class_2246.field_10085 && p != class_2246.field_10205 && p != class_2246.field_10201 && p != class_2246.field_10234 && p != class_2246.field_22108 && p != class_2246.field_10441 && p != class_2246.field_10381) {
                              return (int)(var9 >>> 32) != 0 ? Illillliilli(67, (int)(var9 >>> 32)) : IIiIililllIiIilill;
                           } else {
                              return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 90);
                           }
                        } else {
                           return Illillliilli(67, (int)(var9 >>> 32));
                        }
                     } else {
                        return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 92);
                     }
                  } else {
                     return Illillliilli(68, (int)(var9 >>> 32));
                  }
               } else {
                  return Illillliilli(69, (int)(var9 >>> 32));
               }
            } else {
               return Illillliilli(79, (int)(var9 >>> 32));
            }
         } else {
            return Illillliilli(88, (int)(var9 >>> 32));
         }
      } else {
         return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 87);
      }
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + 7681) >>> 10 | (char)(var4[var5] + 7681) << 6) + 14359) ^ var5))) ^ 9779) + '\ue353') + var5) + var5))) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] + 22415) << 1 | (char)(var4[var5] + 22415) >>> 15) + '발'))) >>> 6 | (char)(-((char)((char)((char)(var4[var5] + 22415) << 1 | (char)(var4[var5] + 22415) >>> 15) + '발'))) << 10) >>> 10 | (char)((char)(-((char)((char)((char)(var4[var5] + 22415) << 1 | (char)(var4[var5] + 22415) >>> 15) + '발'))) >>> 6 | (char)(-((char)((char)((char)(var4[var5] + 22415) << 1 | (char)(var4[var5] + 22415) >>> 15) + '발'))) << 10) << 6))))) - '곅'))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static illiIIliIiliIIli IIillIiliIil(lIlliIIiiIlliIIi k, int w, int family) {
      return new illiIIliIiliIIli(k, w, 0, 0, family, 0);
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] + 4374) ^ '\uec7c') - var5) ^ 3497))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] + 4374) ^ '\uec7c') - var5) ^ 3497))) << 15))))) + 31177) - var5))) >>> 3 | (char)(~((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] + 4374) ^ '\uec7c') - var5) ^ 3497))) >>> 1 | (char)(-((char)((char)((char)((char)(var4[var5] + 4374) ^ '\uec7c') - var5) ^ 3497))) << 15))))) + 31177) - var5))) << 13) - var5))))) + 27784) ^ var5) ^ 2140));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static illiIIliIiliIIli Ililllililil(int family) {
      return new illiIIliIiliIIli((lIlliIIiiIlliIIi)null, 0, 0, 0, family, 0);
   }

   public static boolean Illlllllilll(class_2680 s) {
      long var3 = 1530249746947827698L;
      class_2758 var1 = IIlllIlliIll(s.method_26204());
      if (var1 == null) {
         return false;
      } else {
         var3 ^= ((long)(Integer)s.method_11654(var1) << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) >= (Integer)Collections.max(var1.method_11898());
      }
   }

   private static illiIIliIiliIIli Iiilliiliiil(int rule) {
      return new illiIIliIiliIIli((lIlliIIiiIlliIIi)null, 0, 0, 0, 0, rule);
   }

   public static boolean Iilllilliill(class_2680 s) {
      return s.method_28498(class_2741.field_12548) && (Boolean)s.method_11654(class_2741.field_12548);
   }

   static boolean lIiiIiIlilli(class_2680 s, illiIIliIiliIIli i) {
      if (!s.method_26216()) {
         return false;
      } else if (i == IIiIililllIiIilill) {
         return true;
      } else {
         switch (i.liilIiIlIi) {
            case 114:
            case 115:
            case 125:
            case 126:
            case 129:
            case 130:
            case 145:
               return true;
            default:
               return i.iiilIiIlIi == 19 && (!s.method_28498(class_2741.field_12496) || s.method_11654(class_2741.field_12496) == class_2351.field_11052);
         }
      }
   }

   public static illiIIliIiliIIli IliIlllilIi(class_2248 b) {
      return (illiIIliIiliIIli)iIIiilillIlIiilill.computeIfAbsent(b, lIiliIliIiliIl::IIIilIIiiIIi);
   }

   static {
      long var5 = 5179820955155024674L;
      long var7 = 1411722061032327026L;
      IIiIililllIiIilill = new illiIIliIiliIIli((lIlliIIiiIlliIIi)null, 0, 0, 0, 0, 0);
      iIiIilillIliIilill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 99);
      lliIililliliIilill = IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 2, 13);
      IiiIilillliiIilill = new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 3, 0, 29, 48, 0);
      iiiIilillIIIlilill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 97);
      lIIlililliIIlilill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 98);
      IlIlilillllIlilill = IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 105);
      ilIlilillIiIlilill = IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 106);
      liIlililliiIlilill = IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 107);
      IIllililllIllilill = IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 109);
      iIllilillIlllilill = IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 110);
      llllilillilllilill = IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 111);
      Iillililllillilill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 82);
      iillilillIIililill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 91);
      lIilililliIililill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 75);
      Ilililillllililill = IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 2, 92);
      ilililillIiililill = IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 2, 112);
      liilililliiililill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 72);
      IIIiililllIIiilill = IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 65);
      iIIiilillIlIiilill = new ConcurrentHashMap();
      llIiilillilIiilill = new ConcurrentHashMap();
      IiIiilillliIiilill = new boolean[148];
      int[] var0 = new int[]{113, 116, 117, 119, 120, 121, 122, 123, 124, 127, 128};
      int[] var1 = var0;
      var5 ^= ((long)var0.length << 32 ^ var5) & -1L << 32;

      for(long var10 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         var7 ^= ((long)var1[(int)var10] << 32 ^ var7) & -1L << 32;
         IiIiilillliIiilill[(int)(var7 >>> 32)] = true;
      }

      iiIiilillIIliilill = new String[]{Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>(), Iliilliiilii<invokedynamic>()};
   }

   public static int IIIllIIliIIl(class_2680 s) {
      if (s.method_28498(class_2741.field_12525)) {
         return ((class_2350)s.method_11654(class_2741.field_12525)).ordinal();
      } else if (s.method_28498(class_2741.field_12481)) {
         return ((class_2350)s.method_11654(class_2741.field_12481)).ordinal();
      } else {
         return s.method_28498(class_2741.field_12545) ? ((class_2350)s.method_11654(class_2741.field_12545)).ordinal() : -1;
      }
   }

   private static int IIlilIliiIli(class_2248 b) {
      if (b instanceof class_2510) {
         return 1;
      } else if (b instanceof class_2482) {
         return 2;
      } else if (b instanceof class_2544) {
         return 3;
      } else if (b instanceof class_2323) {
         return 4;
      } else if (b instanceof class_2533) {
         return 5;
      } else if (b instanceof class_2389) {
         return 6;
      } else {
         return !(b instanceof class_2354) && !(b instanceof class_2349) ? 0 : 7;
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4594592942911442986L ^ Long.rotateLeft(1875132730775366141L, 53) ^ -4827236811984295024L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1964565621100709090L ^ Long.rotateLeft(-6211843030242171503L, 48) ^ 2490133699026533592L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1392010419683997313L ^ Long.rotateLeft(2857962149293450774L, 57) ^ -8540093521785782377L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3543572152624288516L ^ Long.rotateLeft(-1410481156935982806L, 51) ^ -6047722106951780061L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8402012475616873983L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5445511416670165539L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6303215395145946362L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7275644328064905567L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -326653110439450218L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1423167847250916470L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiiiliiiiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIIllIIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIIIlIlIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, llIIlilIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIIlliIIl<invokedynamic>());
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

   public static boolean iliIiiliiiii(class_2680 state) {
      illiIIliIiliIIli var1 = IliIlllilIi(state.method_26204());
      if (var1.IlilIiIlIi != null) {
         return true;
      } else if (var1.iiilIiIlIi == 19) {
         return state.method_28498(class_2741.field_12496) && state.method_11654(class_2741.field_12496) != class_2351.field_11052;
      } else if (var1.iiilIiIlIi != 0) {
         return true;
      } else {
         return var1.liilIiIlIi != 0 && IiIiilillliIiilill[var1.liilIiIlIi];
      }
   }

   private static illiIIliIiliIIli IIIilIIiiIIi(class_2248 b) {
      long var4 = 1369592513048295940L;
      String var1 = class_7923.field_41175.method_10221(b).method_12832();
      if (!var1.endsWith(Iliilliiilii<invokedynamic>()) && b != class_2246.field_22109) {
         if (b != class_2246.field_47336 && b != class_2246.field_48851) {
            if (b == class_2246.field_49830) {
               return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iliilliiil, 4, 0, 0, 121, 0);
            } else if (b == class_2246.field_38420) {
               return Ililllililil(116);
            } else if (b == class_2246.field_10398) {
               return Ililllililil(119);
            } else if (b == class_2246.field_27160) {
               return Ililllililil(113);
            } else if (b == class_2246.field_27114) {
               return Ililllililil(114);
            } else if (b == class_2246.field_29032) {
               return Ililllililil(115);
            } else if (b == class_2246.field_10343) {
               return Ililllililil(122);
            } else if (b == class_2246.field_23880) {
               return Ililllililil(123);
            } else if (b == class_2246.field_22423) {
               return Ililllililil(124);
            } else if (b != class_2246.field_42728 && b != class_2246.field_43227) {
               if (b instanceof class_2384) {
                  return var1.contains(Iliilliiilii<invokedynamic>()) ? Ililllililil(128) : IIiIililllIiIilill;
               } else if (b == class_2246.field_10515) {
                  return Ililllililil(125);
               } else if (b == class_2246.field_10092) {
                  return Ililllililil(126);
               } else if (b == class_2246.field_10491) {
                  return Ililllililil(129);
               } else if (b != class_2246.field_28048 && b != class_2246.field_28049) {
                  if (b == class_2246.field_10260) {
                     return new illiIIliIiliIIli(lIlliIIiiIlliIIi.liiilliiil, 0, 0, 30, 49, 20);
                  } else if (b != class_2246.field_10258 && b != class_2246.field_10562) {
                     if (b == class_2246.field_16332) {
                        return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 17, 34, 0);
                     } else if (b == class_2246.field_28888) {
                        return Iiilliiliiil(19);
                     } else if (b != class_2246.field_37568 && b != class_2246.field_37569) {
                        if (b == class_2246.field_43231) {
                           return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 3, 0, 31, 14, 0);
                        } else if (b == class_2246.field_28108) {
                           return Iiilliiliiil(3);
                        } else if (b != class_2246.field_37571 && b != class_2246.field_37570) {
                           if (var1.endsWith(Iliilliiilii<invokedynamic>())) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.IIiilliiil, 8, 0, 3, 3, 0);
                           } else if (b instanceof class_11582) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.IIiilliiil, 5, 11, 25, 5, 0);
                           } else if (b instanceof class_2281) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.IIiilliiil, 5, 11, 1, 1, 0);
                           } else if (b == class_2246.field_10443) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.IIiilliiil, 4, 11, 4, 4, 0);
                           } else if (b == class_2246.field_16328) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.IIiilliiil, 4, 0, 2, 2, 0);
                           } else if (b instanceof class_2363) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.IIiilliiil, 3, 0, 5, 6, 22);
                           } else if (b instanceof class_2377) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 3, 8, 6, 7, 0);
                           } else if (b == class_2246.field_10200) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 3, 0, 7, 8, 0);
                           } else if (b == class_2246.field_10228) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 3, 0, 8, 9, 0);
                           } else if (b == class_2246.field_46797) {
                              return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 3, 0, 22, 15, 0);
                           } else if (b != class_2246.field_10379 && b != class_2246.field_10008) {
                              if (b instanceof class_2665) {
                                 return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 2, 10, 0, 10, 0);
                              } else if (b instanceof class_2426) {
                                 return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 2, 9, 0, 11, 0);
                              } else if (b instanceof class_2462) {
                                 return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 2, 12, 0, 11, 0);
                              } else if (b instanceof class_2286) {
                                 return new illiIIliIiliIIli(lIlliIIiiIlliIIi.Iliilliiil, 2, 0, 0, 11, 0);
                              } else if (!(b instanceof class_2457) && !(b instanceof class_2459) && b != class_2246.field_10002 && b != class_2246.field_10429) {
                                 if (b == class_2246.field_22422) {
                                    return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 1, 19);
                                 } else if (!(b instanceof class_2401) && !(b instanceof class_2269) && !(b instanceof class_2231) && b != class_2246.field_10348 && b != class_2246.field_10589) {
                                    if (b == class_2246.field_10375) {
                                       return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 1, 20);
                                    } else if (b != class_2246.field_10030 && b != class_2246.field_21211) {
                                       if (b == class_2246.field_10179) {
                                          return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 1, 22);
                                       } else if (b == class_2246.field_10223) {
                                          return new illiIIliIiliIIli(lIlliIIiiIlliIIi.lIiilliiil, 2, 0, 16, 22, 0);
                                       } else if (b instanceof class_5554) {
                                          return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 2, 16);
                                       } else if (!(b instanceof class_2442) && !(b instanceof class_2313)) {
                                          if (b instanceof class_2241) {
                                             return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 18);
                                          } else if (b == class_2246.field_10171) {
                                             return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iIiilliiil, 3, 0, 0, 54, 1);
                                          } else if (b == class_2246.field_22122) {
                                             return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iIiilliiil, 3, 0, 0, 56, 1);
                                          } else if (var1.endsWith(Iliilliiilii<invokedynamic>())) {
                                             return IIillIiliIil(lIlliIIiiIlliIIi.iIiilliiil, 3, 57);
                                          } else if (b == class_2246.field_10455) {
                                             return IIillIiliIil(lIlliIIiiIlliIIi.iIiilliiil, 3, 58);
                                          } else if (b == class_2246.field_10524) {
                                             return IIillIiliIil(lIlliIIiiIlliIIi.iIiilliiil, 3, 61);
                                          } else if (b == class_2246.field_10174) {
                                             return IIillIiliIil(lIlliIIiiIlliIIi.iIiilliiil, 3, 55);
                                          } else if (b instanceof class_8922) {
                                             return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iIiilliiil, 3, 0, 0, 60, 23);
                                          } else if (b instanceof class_3749) {
                                             return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iIiilliiil, 3, 13, 0, b == class_2246.field_22110 ? 52 : 53, 0);
                                          } else if (b instanceof class_2527 || var1.endsWith(Iliilliiilii<invokedynamic>()) && !var1.contains(Iliilliiilii<invokedynamic>())) {
                                             var4 ^= ((long)(var1.startsWith(Iliilliiilii<invokedynamic>()) ? 52 : (var1.startsWith(Iliilliiilii<invokedynamic>()) ? 51 : 50)) << 32 ^ var4) & -1L << 32;
                                             return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iIiilliiil, 2, 14, 0, (int)(var4 >>> 32), 0);
                                          } else if (b instanceof class_5545) {
                                             return IIillIiliIil(lIlliIIiiIlliIIi.lIiilliiil, 2, 47);
                                          } else if (b instanceof class_5540) {
                                             return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iIiilliiil, 1, 0, 0, 59, 24);
                                          } else if (b == class_2246.field_10009) {
                                             return IIillIiliIil(lIlliIIiiIlliIIi.iIiilliiil, 2, 62);
                                          } else {
                                             illiIIliIiliIIli var2 = IlIillIiilIi(b, var1);
                                             if (var2 != null) {
                                                return var2;
                                             } else {
                                                illiIIliIiliIIli var3 = IiIiliIiiiIi(b);
                                                if (var3 != null) {
                                                   return var3;
                                                } else if (b != class_2246.field_28681 && b != class_2246.field_28680 && b != class_2246.field_28677 && b != class_2246.field_28682 && b != class_2246.field_28683 && b != class_2246.field_28684) {
                                                   if (b != class_2246.field_54731 && b != class_2246.field_54732 && b != class_2246.field_54733) {
                                                      if (b != class_2246.field_27161 && b != class_2246.field_27162 && b != class_2246.field_27163 && b != class_2246.field_27164) {
                                                         return b == class_2246.field_27159 ? IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 98) : Iilililiiili(b, var1);
                                                      } else {
                                                         return Iiilliiliiil(6);
                                                      }
                                                   } else {
                                                      return IIiIililllIiIilill;
                                                   }
                                                } else {
                                                   return Iiilliiliiil(5);
                                                }
                                             }
                                          }
                                       } else {
                                          return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 2, 17);
                                       }
                                    } else {
                                       return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 1, 21);
                                    }
                                 } else {
                                    return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 1, 12);
                                 }
                              } else {
                                 return IIillIiliIil(lIlliIIiiIlliIIi.Iliilliiil, 1, 11);
                              }
                           } else {
                              return IIiIililllIiIilill;
                           }
                        } else {
                           return Iiilliiliiil(4);
                        }
                     } else {
                        return Iiilliiliiil(2);
                     }
                  } else {
                     return IIillIiliIil(lIlliIIiiIlliIIi.lliilliiil, 1, 100);
                  }
               } else {
                  return Ililllililil(130);
               }
            } else {
               return Ililllililil(127);
            }
         } else {
            return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iliilliiil, 12, 0, 0, 120, 0);
         }
      } else {
         return Ililllililil(145);
      }
   }

   private static illiIIliIiliIIli IiIiliIiiiIi(class_2248 b) {
      if (b instanceof class_2344) {
         return IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 101);
      } else if (!(b instanceof class_2302) && !(b instanceof class_8237)) {
         if (b instanceof class_2421) {
            return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iiiilliiil, 1, 0, 0, 108, 21);
         } else if (b instanceof class_2195) {
            return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iiiilliiil, 1, 0, 0, 103, 25);
         } else if (b instanceof class_2513) {
            return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iiiilliiil, 1, 0, 0, 103, 21);
         } else if (b instanceof class_2523) {
            return IIillIiliIil(lIlliIIiiIlliIIi.iiiilliiil, 1, 104);
         } else if (b instanceof class_2266) {
            return Iiilliiliiil(7);
         } else if (!(b instanceof class_2211) && !(b instanceof class_2202)) {
            if (!(b instanceof class_2393) && !(b instanceof class_2391)) {
               if (b instanceof class_2282) {
                  return Iiilliiliiil(10);
               } else if (b instanceof class_3830) {
                  return Iiilliiliiil(11);
               } else {
                  return !(b instanceof class_5805) && !(b instanceof class_5804) ? null : Iiilliiliiil(12);
               }
            } else {
               return Iiilliiliiil(9);
            }
         } else {
            return Iiilliiliiil(8);
         }
      } else {
         return new illiIIliIiliIIli(lIlliIIiiIlliIIi.iiiilliiil, 1, 0, 0, 102, 21);
      }
   }
}
