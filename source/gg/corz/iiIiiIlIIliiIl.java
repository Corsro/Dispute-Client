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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1923;
import net.minecraft.class_1937;
import net.minecraft.class_1944;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2586;
import net.minecraft.class_2636;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_4970;
import net.minecraft.class_6880;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2902.class_2903;

public final class iiIiiIlIIliiIl {
   private static final int iIIliiillIlIliiill = 8;
   private static final int liiIiiilliiiIiiill = 12;
   private static final int IliIiiilllliIiiill = 96;
   private static final int iliIiiillIiiIiiill = 96;
   private static final class_2350[] IiIliiillliIliiill = class_2350.values();
   private static final int IIIliiilllIIliiill = 48;
   private static final int llIliiillilIliiill = 6;

   private static long[] IiIlliIliiIl(class_2826 below) {
      long var6 = -3807299904004253323L;
      long var8 = -7581549270343020543L;
      if (below != null && !below.method_38292()) {
         long[] var1 = new long[4];

         for(var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < 16; var6 += 4294967296L) {
            for(var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < 16; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
               class_2680 var4 = below.method_12254((int)var6, 15, (int)(var6 >>> 32));
               if (!var4.method_26215() && var4.method_26216()) {
                  var8 ^= ((long)((int)(var6 >>> 32) << 4 | (int)var6) << 32 ^ var8) & -1L << 32;
                  var1[(int)(var8 >>> 32) >>> 6] |= 1L << ((int)(var8 >>> 32) & 63);
               }
            }
         }

         return var1;
      } else {
         return null;
      }
   }

   private static int IIIllIIliIIl(class_2818 lz, class_1937 chunkBottomY, class_2826 world, int wx, int ly, int wz, int chunkTopY, int chunk, int sec, int lx, int wy) {
      long var23 = -4928249381986744628L;
      long var25 = 384009329822663615L;
      long var27 = 3062240728187814754L;
      long var29 = -9148040841787444999L;
      long var31 = 6511550254128881835L;
      var23 ^= (0L ^ var23) & -1L << 32;
      class_2350[] var12 = IiIliiillliIliiill;
      var23 ^= ((long)var12.length ^ var23) & -1L >>> 32;

      for(var25 ^= (0L ^ var25) & -1L << 32; (int)(var25 >>> 32) < (int)var23; var25 += 4294967296L) {
         class_2350 var15 = var12[(int)(var25 >>> 32)];
         var25 ^= ((long)(wx + var15.method_10148()) ^ var25) & -1L >>> 32;
         var27 ^= ((long)(ly + var15.method_10164()) << 32 ^ var27) & -1L << 32;
         var27 ^= ((long)(wz + var15.method_10165()) ^ var27) & -1L >>> 32;
         class_2680 var19;
         if ((int)var25 >= 0 && (int)var25 < 16 && (int)(var27 >>> 32) >= 0 && (int)(var27 >>> 32) < 16 && (int)var27 >= 0 && (int)var27 < 16) {
            var19 = world.method_12254((int)var25, (int)(var27 >>> 32), (int)var27);
         } else {
            var29 ^= ((long)(chunkTopY + var15.method_10148()) << 32 ^ var29) & -1L << 32;
            var29 ^= ((long)(chunk + var15.method_10164()) ^ var29) & -1L >>> 32;
            var31 ^= ((long)(sec + var15.method_10165()) << 32 ^ var31) & -1L << 32;
            if ((int)var29 < lx || (int)var29 > wy) {
               var23 += 4294967296L;
               continue;
            }

            if ((int)var25 >= 0 && (int)var25 < 16 && (int)var27 >= 0 && (int)var27 < 16) {
               var19 = lz.method_8320(new class_2338((int)(var29 >>> 32), (int)var29, (int)(var31 >>> 32)));
            } else {
               var19 = chunkBottomY.method_8320(new class_2338((int)(var29 >>> 32), (int)var29, (int)(var31 >>> 32)));
            }
         }

         if (var19.method_26215() || var19.method_51176()) {
            return -1;
         }

         if (lIiliIliIiliIl.IilliliilIIi(var19)) {
            var23 += 4294967296L;
         }
      }

      return (int)(var23 >>> 32);
   }

   private static int Illlllllilll(class_1937 world, class_2818 pos, class_2338 chunk) {
      long var9 = -4594162619401750182L;

      try {
         class_2586 var3 = pos.method_8321(chunk);
         if (var3 instanceof class_2636 var4) {
            class_1297 var5 = var4.method_11390().method_8283(world, chunk);
            if (var5 == null) {
               return 132;
            }

            String var6 = class_1299.method_5890(var5.method_5864()).method_12832();
            var9 ^= (-4294967296L ^ var9) & -1L << 32;
            switch (var6.hashCode()) {
               case -895953179:
                  if (var6.equals(IIillIiliIil<invokedynamic>())) {
                     var9 ^= (8589934592L ^ var9) & -1L << 32;
                  }
                  break;
               case -696355290:
                  if (var6.equals(IIillIiliIil<invokedynamic>())) {
                     var9 ^= (0L ^ var9) & -1L << 32;
                  }
                  break;
               case -475025449:
                  if (var6.equals(IIillIiliIil<invokedynamic>())) {
                     var9 ^= (12884901888L ^ var9) & -1L << 32;
                  }
                  break;
               case 93819586:
                  if (var6.equals(IIillIiliIil<invokedynamic>())) {
                     var9 ^= (17179869184L ^ var9) & -1L << 32;
                  }
                  break;
               case 767759181:
                  if (var6.equals(IIillIiliIil<invokedynamic>())) {
                     var9 ^= (21474836480L ^ var9) & -1L << 32;
                  }
                  break;
               case 1962769125:
                  if (var6.equals(IIillIiliIil<invokedynamic>())) {
                     var9 ^= (25769803776L ^ var9) & -1L << 32;
                  }
                  break;
               case 2027747405:
                  if (var6.equals(IIillIiliIil<invokedynamic>())) {
                     var9 ^= (4294967296L ^ var9) & -1L << 32;
                  }
            }

            switch ((int)(var9 >>> 32)) {
               case 0:
               case 1:
               case 2:
                  return 132;
               case 3:
                  return 133;
               case 4:
                  return 134;
               case 5:
                  return 135;
               case 6:
                  return 136;
               default:
                  return 138;
            }
         }
      } catch (Throwable var11) {
      }

      return 132;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) >>> 5) - '鐎') >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) >>> 5) - '鐎') << 9))) ^ 'ꕼ') - '\udea9') << 3 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) >>> 5) - '鐎') >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) >>> 3 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 2159))) ^ var5) + 8759) << 13))) >>> 5) - '鐎') << 9))) ^ 'ꕼ') - '\udea9') >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iiIiiIlIIliiIl() {
   }

   private static ilIlIIilIiIlIIil Iilllilliill(int wy, int state, int flags, class_2680 wx, illiIIliIiliIIli wz, int info, int biome) {
      long var9 = -7782298575056372183L;
      var9 ^= ((long)lIiliIliIiliIl.IIIllIIliIIl(wx) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)lIiliIliIiliIl.IlIlllIlilIl(wx) ^ var9) & -1L >>> 32;
      return wz.IiilIiIlIi != 0 ? ilIlIIilIiIlIIil.lIiiIiIlilli(wy, state, flags, wz.IlilIiIlIi, wz.llilIiIlIi, wz.IiilIiIlIi, wz.ililIiIlIi, wz.liilIiIlIi, info, biome) : new ilIlIIilIiIlIIil(wy, state, flags, wz.IlilIiIlIi, wz.llilIiIlIi, (int)(var9 >>> 32), (int)var9, wz.ililIiIlIi, 0, wz.liilIiIlIi, info, biome);
   }

   private static boolean IIlllIlliIll(class_2818 wz, class_1937 lx, class_2826 ly, class_2680 sec, int wy, int lz, int wx, int state, int chunk, int world) {
      long var18 = 8719548313212987523L;
      long var20 = -5880536839228450760L;
      long var22 = 4996858856671660193L;
      if (!sec.method_28498(class_2741.field_12525)) {
         return true;
      } else {
         class_2350 var10 = ((class_2350)sec.method_11654(class_2741.field_12525)).method_10153();
         var18 ^= ((long)(wy + var10.method_10148()) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)(lz + var10.method_10164()) ^ var18) & -1L >>> 32;
         var20 ^= ((long)(wx + var10.method_10165()) << 32 ^ var20) & -1L << 32;
         class_2680 var14;
         if ((int)(var18 >>> 32) >= 0 && (int)(var18 >>> 32) < 16 && (int)var18 >= 0 && (int)var18 < 16 && (int)(var20 >>> 32) >= 0 && (int)(var20 >>> 32) < 16) {
            var14 = ly.method_12254((int)(var18 >>> 32), (int)var18, (int)(var20 >>> 32));
         } else {
            var20 ^= ((long)(state + var10.method_10148()) ^ var20) & -1L >>> 32;
            var22 ^= ((long)(chunk + var10.method_10164()) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)(world + var10.method_10165()) ^ var22) & -1L >>> 32;
            if ((int)var20 >> 4 == state >> 4 && (int)var22 >> 4 == world >> 4 && (int)(var22 >>> 32) >= wz.method_31607() && (int)(var22 >>> 32) <= wz.method_31607() + wz.method_31605() - 1) {
               var14 = wz.method_8320(new class_2338((int)var20, (int)(var22 >>> 32), (int)var22));
            } else {
               var14 = lx.method_8320(new class_2338((int)var20, (int)(var22 >>> 32), (int)var22));
            }
         }

         return var14.method_27852(class_2246.field_27160);
      }
   }

   public static lililIIiiililIIi IilliliilIIi(class_2818 scanBottomY, class_1937 excavation, llllIliilllIli biomes, int world, int activityMask, Map<Long, lIIIIlIliIIIIlIl> scanTopYInclusive, boolean chunk, long remembered) {
      return lIiiIiIlilli(scanBottomY, excavation, biomes, world, activityMask, scanTopYInclusive, chunk, remembered, 0L);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - 16810) + var5) ^ var5) - var5) ^ var5) + '苤'))))) + var5) - '똏') ^ var5)))) - 24602) + var5) ^ '\ud987') ^ '\ue67f') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IliIlllilIi(class_1937 world) {
      String var1 = world.method_27983().method_29177().toString();
      if (var1.endsWith(IIillIiliIil<invokedynamic>())) {
         return 1;
      } else {
         return var1.endsWith(IIillIiliIil<invokedynamic>()) ? 2 : 0;
      }
   }

   private static boolean iliIiiliiiii(int family) {
      switch (family) {
         case 34:
         case 113:
         case 116:
         case 117:
         case 119:
         case 120:
         case 123:
         case 124:
         case 127:
         case 128:
         case 132:
         case 133:
         case 134:
         case 135:
         case 136:
            return true;
         default:
            return false;
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) - '荒'))) ^ var5) + 2608) + var5) ^ '뫎') << 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) - '荒'))) ^ var5) + 2608) + var5) ^ '뫎') >>> 14) ^ '딥') >>> 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) - '荒'))) ^ var5) + 2608) + var5) ^ '뫎') << 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + var5) - '荒'))) ^ var5) + 2608) + var5) ^ '뫎') >>> 14) ^ '딥') << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lililIIiiililIIi iIlIlllllill(class_2818 chunk, class_1937 scanTopYInclusive, llllIliilllIli biomes, int world, int excavation, Map<Long, lIIIIlIliIIIIlIl> scanBottomY, boolean remembered) {
      return lIiiIiIlilli(chunk, scanTopYInclusive, biomes, world, excavation, scanBottomY, remembered, 0L, 0L);
   }

   public static lililIIiiililIIi lIiiIiIlilli(class_2818 excavation, class_1937 activityMask, llllIliilllIli world, int biomes, int scanTopYInclusive, Map<Long, lIIIIlIliIIIIlIl> remembered, boolean chunk, long scanBottomY, long lightProbeMask) {
      long var96 = -9110984933322084705L;
      long var98 = -633887212282648031L;
      long var68 = -4099184256821825318L;
      long var100 = -8680640905624487970L;
      long var70 = -683633145095995063L;
      long var102 = 6287705600911516205L;
      long var72 = -283477408048057712L;
      long var104 = 3345401629315148652L;
      long var74 = 8889657318058486285L;
      long var106 = 3827471783786730822L;
      long var76 = -3290685488965203890L;
      long var108 = -1791511129020694456L;
      long var78 = -5269796628008590141L;
      long var80 = 2839524192239202483L;
      long var82 = -5979048098783866700L;
      long var84 = 5827891468525210771L;
      long var86 = 5510273233733571956L;
      long var88 = -5978000852996872432L;
      long var90 = -7063176756326358569L;
      long var92 = -7888940433264628477L;
      long var94 = 899330794909047520L;
      long var11 = System.nanoTime();
      ArrayList var13 = new ArrayList();
      ArrayList var14 = new ArrayList();
      iliIiiiIiiIiii var15 = new iliIiiiIiiIiii();
      var68 ^= ((long)IliIlllilIi(activityMask) << 32 ^ var68) & -1L << 32;
      var15.IillliiIIl = (int)(var68 >>> 32);
      var68 ^= (0L ^ var68) & -1L >>> 32;
      var70 ^= (0L ^ var70) & -1L << 32;
      var70 ^= (0L ^ var70) & -1L >>> 32;
      var72 ^= (0L ^ var72) & -1L << 32;
      var72 ^= (0L ^ var72) & -1L >>> 32;
      var74 ^= (0L ^ var74) & -1L << 32;
      var74 ^= (0L ^ var74) & -1L >>> 32;
      var76 ^= (0L ^ var76) & -1L << 32;
      long var25 = 0L;
      long var27 = 0L;
      class_1923 var29 = excavation.method_12004();
      var76 ^= ((long)var29.method_8326() ^ var76) & -1L >>> 32;
      var78 ^= ((long)var29.method_8328() << 32 ^ var78) & -1L << 32;
      var78 ^= ((long)excavation.method_31607() ^ var78) & -1L >>> 32;
      var80 ^= ((long)((int)var78 + excavation.method_31605() - 1) << 32 ^ var80) & -1L << 32;
      var80 ^= (0L ^ var80) & -1L >>> 32;
      int[] var35 = null;
      var82 ^= (Long.MIN_VALUE ^ var82) & -1L << 32;
      if (chunk || lightProbeMask != 0L) {
         var35 = new int[256];

         for(var82 ^= (0L ^ var82) & -1L >>> 32; (int)var82 < 16; var82 ^= (var82 ^ var82 + (long)1) & -1L >>> 32) {
            for(var84 ^= (0L ^ var84) & -1L << 32; (int)(var84 >>> 32) < 16; var84 += 4294967296L) {
               var84 ^= ((long)excavation.method_12005(class_2903.field_13202, (int)(var84 >>> 32), (int)var82) ^ var84) & -1L >>> 32;
               var35[(int)var82 * 16 + (int)(var84 >>> 32)] = (int)var84;
               if ((int)var84 > (int)(var82 >>> 32)) {
                  var82 ^= ((long)((int)var84) << 32 ^ var82) & -1L << 32;
               }
            }
         }
      }

      class_2826[] var37 = excavation.method_12006();
      long[] var38 = null;
      var84 ^= (-2L ^ var84) & -1L >>> 32;

      for(var86 ^= (0L ^ var86) & -1L << 32; (int)(var86 >>> 32) < var37.length; var86 += 4294967296L) {
         var86 ^= ((long)((int)var78 + ((int)(var86 >>> 32) << 4)) ^ var86) & -1L >>> 32;
         if ((int)var86 <= scanTopYInclusive && (int)var86 + 15 >= biomes) {
            class_2826 var42 = var37[(int)(var86 >>> 32)];
            var88 ^= ((long)((int)(var86 >>> 32) < 64 && (scanBottomY & 1L << (int)(var86 >>> 32)) != 0L ? 1 : 0) << 32 ^ var88) & -1L << 32;
            var88 ^= ((long)((int)(var86 >>> 32) < 64 && (lightProbeMask & 1L << (int)(var86 >>> 32)) != 0L ? 1 : 0) ^ var88) & -1L >>> 32;
            if (var42 != null && !var42.method_38292() && ((int)(var88 >>> 32) != 0 || (int)var88 != 0 || var42.method_19523(lIiliIliIiliIl::iliIiiliiiii))) {
               var70 += 4294967296L;
               var90 ^= ((long)((int)(var88 >>> 32) != 0 ? 128 : 0) << 32 ^ var90) & -1L << 32;
               var90 ^= (0L ^ var90) & -1L >>> 32;
               var92 ^= ((long)var42.method_19523(class_4970.class_4971::method_26215) << 32 ^ var92) & -1L << 32;
               IIiIiiIllIiIiiIl var48 = chunk && (int)(var92 >>> 32) != 0 && (int)var86 <= (int)(var82 >>> 32) - 2 ? new IIiIiiIllIiIiiIl() : null;
               if (var48 != null) {
                  long[] var49 = (int)var84 == (int)(var86 >>> 32) - 1 ? var38 : IiIlliIliiIl((int)(var86 >>> 32) > 0 ? var37[(int)(var86 >>> 32) - 1] : null);
                  var48.iliIiiliiiii(var49);
               }

               var92 ^= (0L ^ var92) & -1L >>> 32;
               class_6880 var50 = null;
               var94 ^= (0L ^ var94) & -1L << 32;

               for(var94 ^= (0L ^ var94) & -1L >>> 32; (int)var94 < 16; var94 ^= (var94 ^ var94 + (long)1) & -1L >>> 32) {
                  var96 ^= ((long)((int)var86 + (int)var94) << 32 ^ var96) & -1L << 32;
                  if ((int)(var96 >>> 32) >= biomes && (int)(var96 >>> 32) <= scanTopYInclusive) {
                     for(var96 ^= (0L ^ var96) & -1L >>> 32; (int)var96 < 16; var96 ^= (var96 ^ var96 + (long)1) & -1L >>> 32) {
                        for(var98 ^= (0L ^ var98) & -1L << 32; (int)(var98 >>> 32) < 16; var98 += 4294967296L) {
                           class_2680 var56 = var42.method_12254((int)var96, (int)var94, (int)(var98 >>> 32));
                           var98 ^= ((long)var56.method_26215() ^ var98) & -1L >>> 32;
                           var100 ^= ((long)((int)var98 == 0 && var56.method_26216() ? 1 : 0) << 32 ^ var100) & -1L << 32;
                           if (var48 != null) {
                              if ((int)var98 != 0) {
                                 var48.IliIlllilIi((int)var96, (int)var94, (int)(var98 >>> 32));
                              } else if ((int)(var100 >>> 32) != 0) {
                                 var48.liiiIIllIl((int)var96, (int)var94, (int)(var98 >>> 32));
                              }
                           }

                           if ((int)var88 != 0 && (int)(var100 >>> 32) != 0 && var56.method_26213() == 0 && (int)var80 < 48 && (int)var90 < 8 && var35 != null && var35[(int)(var98 >>> 32) * 16 + (int)var96] - (int)(var96 >>> 32) >= 6) {
                              var100 ^= ((long)((int)var76 + (int)var96) ^ var100) & -1L >>> 32;
                              var102 ^= ((long)((int)(var78 >>> 32) + (int)(var98 >>> 32)) << 32 ^ var102) & -1L << 32;
                              if (IlIlllIlilIl(activityMask, excavation, var42, (int)var96, (int)var94, (int)(var98 >>> 32), (int)var100, (int)(var96 >>> 32), (int)(var102 >>> 32), (int)var78, (int)(var80 >>> 32))) {
                                 class_6880 var61 = var42.method_38293((int)var96 >> 2, (int)var94 >> 2, (int)(var98 >>> 32) >> 2);
                                 var102 ^= ((long)world.IliIlllilIi(var61, (int)(var68 >>> 32)) ^ var102) & -1L >>> 32;
                                 var15.IilliliilIIi(146);
                                 var15.iliIiiliiiii((int)var102);
                                 var15.IIIllIIliIIl((int)(var96 >>> 32));
                                 var13.add(ilIlIIilIiIlIIil.liiiIIllIl((int)var100, (int)(var96 >>> 32), (int)(var102 >>> 32), lIlliIIiiIlliIIi.iIiilliiil, 3, 146, (int)(var90 >>> 32), (int)var102));
                                 var80 ^= (var80 ^ var80 + (long)1) & -1L >>> 32;
                                 var90 ^= (var90 ^ var90 + (long)1) & -1L >>> 32;
                                 continue;
                              }
                           }

                           illiIIliIiliIIli var59 = lIiliIliIiliIl.IliIlllilIi(var56.method_26204());
                           if (var59 == lIiliIliIiliIl.IIiIililllIiIilill) {
                              if ((int)var98 == 0) {
                                 if ((int)var92 < 96) {
                                    var92 ^= (var92 ^ var92 + (long)1) & -1L >>> 32;
                                 }

                                 if ((int)(var100 >>> 32) != 0) {
                                    var72 ^= (var72 ^ var72 + (long)1) & -1L >>> 32;
                                 }
                              }
                           } else {
                              class_6880 var60 = var42.method_38293((int)var96 >> 2, (int)var94 >> 2, (int)(var98 >>> 32) >> 2);
                              if (var60 != var50) {
                                 var50 = var60;
                                 var94 ^= ((long)world.IliIlllilIi(var60, (int)(var68 >>> 32)) << 32 ^ var94) & -1L << 32;
                              }

                              var104 ^= ((long)((int)(var94 >>> 32)) << 32 ^ var104) & -1L << 32;
                              var102 ^= ((long)((int)var76 + (int)var96) ^ var102) & -1L >>> 32;
                              var104 ^= ((long)((int)(var78 >>> 32) + (int)(var98 >>> 32)) ^ var104) & -1L >>> 32;
                              var106 ^= ((long)((int)(var90 >>> 32)) << 32 ^ var106) & -1L << 32;
                              illiIIliIiliIIli var65 = var59;
                              var106 ^= (0L ^ var106) & -1L >>> 32;
                              if (var59.iiilIiIlIi != 0) {
                                 switch (var59.iiilIiIlIi) {
                                    case 1:
                                       var65 = (int)(var68 >>> 32) == 1 ? null : var59;
                                       break;
                                    case 2:
                                       if ((int)(var104 >>> 32) == 2) {
                                          var65 = null;
                                          var106 ^= (118L ^ var106) & -1L >>> 32;
                                       } else {
                                          var65 = lIiliIliIiliIl.iIiIilillIliIilill;
                                       }
                                       break;
                                    case 3:
                                       if ((int)(var104 >>> 32) == 2) {
                                          var65 = null;
                                          var106 ^= (118L ^ var106) & -1L >>> 32;
                                       } else {
                                          var65 = lIiliIliIiliIl.lliIililliliIilill;
                                       }
                                       break;
                                    case 4:
                                       if ((int)(var104 >>> 32) == 2) {
                                          var65 = null;
                                          var106 ^= (117L ^ var106) & -1L >>> 32;
                                       } else {
                                          var65 = lIiliIliIiliIl.IiiIilillliiIilill;
                                       }
                                       break;
                                    case 5:
                                       var65 = (int)(var104 >>> 32) == 3 ? null : lIiliIliIiliIl.iiiIilillIIIlilill;
                                       break;
                                    case 6:
                                       var108 ^= ((long)IIlllIlliIll(excavation, activityMask, var42, var56, (int)var96, (int)var94, (int)(var98 >>> 32), (int)var102, (int)(var96 >>> 32), (int)var104) << 32 ^ var108) & -1L << 32;
                                       if ((int)(var108 >>> 32) != 0) {
                                          var65 = null;
                                          var106 ^= (131L ^ var106) & -1L >>> 32;
                                       } else {
                                          var65 = lIiliIliIiliIl.lIIlililliIIlilill;
                                          if (var56.method_27852(class_2246.field_27161)) {
                                             var106 ^= ((long)((int)(var106 >>> 32) | 1) << 32 ^ var106) & -1L << 32;
                                          }
                                       }
                                       break;
                                    case 7:
                                       var65 = (int)(var104 >>> 32) != 8 && (int)(var104 >>> 32) != 9 ? lIiliIliIiliIl.IlIlilillllIlilill : null;
                                       if (var65 != null && lIiliIliIiliIl.Illlllllilll(var56)) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 1) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 8:
                                       var65 = (int)(var104 >>> 32) == 10 ? null : lIiliIliIiliIl.ilIlilillIiIlilill;
                                       break;
                                    case 9:
                                       var65 = (int)(var104 >>> 32) == 5 ? null : lIiliIliIiliIl.liIlililliiIlilill;
                                       break;
                                    case 10:
                                       var65 = (int)(var104 >>> 32) == 10 ? null : lIiliIliIiliIl.IIllililllIllilill;
                                       if (var65 != null && lIiliIliIiliIl.Illlllllilll(var56)) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 1) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 11:
                                       var65 = (int)(var104 >>> 32) != 11 && (int)(var104 >>> 32) != 12 ? lIiliIliIiliIl.iIllilillIlllilill : null;
                                       if (var65 != null && lIiliIliIiliIl.Illlllllilll(var56)) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 1) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 12:
                                       var65 = (int)(var104 >>> 32) == 3 ? null : lIiliIliIiliIl.llllilillilllilill;
                                       if (var65 != null && var56.method_28498(class_2741.field_28716) && (Boolean)var56.method_11654(class_2741.field_28716)) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 1) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 13:
                                       var65 = (int)(var104 >>> 32) == 9 ? null : lIiliIliIiliIl.Iillililllillilill;
                                       break;
                                    case 14:
                                       var65 = (int)(var68 >>> 32) == 2 ? null : lIiliIliIiliIl.iillilillIIililill;
                                       break;
                                    case 15:
                                       var65 = (int)(var68 >>> 32) == 1 ? null : lIiliIliIiliIl.lIilililliIililill;
                                       break;
                                    case 16:
                                       var65 = (int)(var104 >>> 32) == 15 ? null : lIiliIliIiliIl.Ilililillllililill;
                                       break;
                                    case 17:
                                       var108 ^= ((long)(var56.method_28498(class_2741.field_59766) ? (Integer)var56.method_11654(class_2741.field_59766) : 0) << 32 ^ var108) & -1L << 32;
                                       if ((int)(var108 >>> 32) > 0) {
                                          var65 = lIiliIliIiliIl.ilililillIiililill;
                                          var106 ^= ((long)((int)(var106 >>> 32) | 2) << 32 ^ var106) & -1L << 32;
                                       } else {
                                          var65 = (int)(var104 >>> 32) == 24 ? null : lIiliIliIiliIl.ilililillIiililill;
                                       }
                                       break;
                                    case 18:
                                       var106 ^= (137L ^ var106) & -1L >>> 32;
                                       var65 = (int)(var104 >>> 32) == 11 ? null : lIiliIliIiliIl.IIIiililllIIiilill;
                                       break;
                                    case 19:
                                       var65 = var56.method_28498(class_2741.field_12496) && var56.method_11654(class_2741.field_12496) != class_2351.field_11052 ? lIiliIliIiliIl.liilililliiililill : null;
                                       break;
                                    case 20:
                                       var106 ^= ((long)Illlllllilll(activityMask, excavation, new class_2338((int)var102, (int)(var96 >>> 32), (int)var104)) ^ var106) & -1L >>> 32;
                                       if ((int)var106 == 138) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 8) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 21:
                                       if (lIiliIliIiliIl.Illlllllilll(var56)) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 1) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 22:
                                       if (lIiliIliIiliIl.Iilllilliill(var56)) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 2) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 23:
                                    case 24:
                                       if (lIiliIliIiliIl.Iilllilliill(var56)) {
                                          var106 ^= ((long)((int)(var106 >>> 32) | 4) << 32 ^ var106) & -1L << 32;
                                       }
                                       break;
                                    case 25:
                                       var106 ^= ((long)((int)(var106 >>> 32) | 1) << 32 ^ var106) & -1L << 32;
                                 }
                              }

                              if ((int)var106 != 0) {
                                 var15.IilliliilIIi((int)var106);
                                 var15.iliIiiliiiii((int)(var104 >>> 32));
                                 var15.IIIllIIliIIl((int)(var96 >>> 32));
                                 if (iliIiiliiiii((int)var106) && var14.size() < 96) {
                                    var14.add(new iiliIiIiIIiiIiIi((int)var106, (int)var102, (int)(var96 >>> 32), (int)var104));
                                 }
                              }

                              if (var65 == null) {
                                 if ((int)var98 == 0) {
                                    if ((int)var92 < 96) {
                                       var92 ^= (var92 ^ var92 + (long)1) & -1L >>> 32;
                                    }

                                    if ((int)(var100 >>> 32) != 0) {
                                       var72 ^= (var72 ^ var72 + (long)1) & -1L >>> 32;
                                    }
                                 }
                              } else if (var65.IlilIiIlIi == null) {
                                 var15.IilliliilIIi(var65.liilIiIlIi);
                                 var15.iliIiiliiiii((int)(var104 >>> 32));
                                 var15.IIIllIIliIIl((int)(var96 >>> 32));
                                 if (var65.liilIiIlIi == 145) {
                                    var72 += 4294967296L;
                                 } else if ((int)(var100 >>> 32) != 0) {
                                    var72 ^= (var72 ^ var72 + (long)1) & -1L >>> 32;
                                 }

                                 if (iliIiiliiiii(var65.liilIiIlIi) && var14.size() < 96) {
                                    var14.add(new iiliIiIiIIiiIiIi(var65.liilIiIlIi, (int)var102, (int)(var96 >>> 32), (int)var104));
                                 }
                              } else {
                                 var76 += 4294967296L;
                                 var108 ^= ((long)IIIllIIliIIl(excavation, activityMask, var42, (int)var96, (int)var94, (int)(var98 >>> 32), (int)var102, (int)(var96 >>> 32), (int)var104, (int)var78, (int)(var80 >>> 32)) << 32 ^ var108) & -1L << 32;
                                 if ((int)(var108 >>> 32) < 0) {
                                    var106 ^= ((long)((int)(var106 >>> 32) | 256) << 32 ^ var106) & -1L << 32;
                                 } else {
                                    var106 ^= ((long)((int)(var106 >>> 32) | 32) << 32 ^ var106) & -1L << 32;
                                    var74 += 4294967296L;
                                    if ((int)(var108 >>> 32) >= 3) {
                                       var106 ^= ((long)((int)(var106 >>> 32) | 64) << 32 ^ var106) & -1L << 32;
                                       var74 ^= (var74 ^ var74 + (long)1) & -1L >>> 32;
                                       var25 |= 1L << (var65.liilIiIlIi & 63);
                                       var27 |= 1L << (var65.liilIiIlIi >>> 6 & 63);
                                    }
                                 }

                                 var15.IilliliilIIi(var65.liilIiIlIi);
                                 var15.iliIiiliiiii((int)(var104 >>> 32));
                                 var15.IIIllIIliIIl((int)(var96 >>> 32));
                                 if (var65.liilIiIlIi == 34 && var14.size() < 96) {
                                    var14.add(new iiliIiIiIIiiIiIi(34, (int)var102, (int)(var96 >>> 32), (int)var104));
                                 }

                                 var13.add(Iilllilliill((int)var102, (int)(var96 >>> 32), (int)var104, var56, var65, (int)(var106 >>> 32), (int)(var104 >>> 32)));
                              }
                           }
                        }
                     }
                  }
               }

               var68 ^= ((long)((int)var68 + (int)var92) ^ var68) & -1L >>> 32;
               if (var48 != null) {
                  var38 = var48.IlIlllIlilIl();
                  var84 ^= ((long)((int)(var86 >>> 32)) ^ var84) & -1L >>> 32;
               }

               if (var48 != null && var48.lIiiIiIlilli()) {
                  List var52 = llilIiiililIii.IliIlllilIi(var48, (int)var76, (int)var86, (int)(var78 >>> 32), var35);
                  if (!var52.isEmpty()) {
                     class_6880 var53 = var42.method_38293(1, 1, 1);
                     var96 ^= ((long)world.IliIlllilIi(var53, (int)(var68 >>> 32)) ^ var96) & -1L >>> 32;

                     for(ilIlIIilIiIlIIil var114 : var52) {
                        var15.IilliliilIIi(var114.IlliIlIIil);
                        var15.iliIiiliiiii((int)var96);
                        var15.IIIllIIliIIl(var114.llIiIlIIil);
                        var13.add(ilIlIIilIiIlIIil.liiiIIllIl(var114.IlIiIlIIil, var114.llIiIlIIil, var114.ilIiIlIIil, var114.IiIiIlIIil, var114.liIiIlIIil, var114.IlliIlIIil, var114.llliIlIIil | (int)(var90 >>> 32), (int)var96));
                     }
                  }
               }
            } else {
               var70 ^= (var70 ^ var70 + (long)1) & -1L >>> 32;
            }
         }
      }

      var86 ^= (0L ^ var86) & -1L << 32;
      Object var41 = Collections.emptyList();
      Object var110 = Collections.emptyList();
      if (remembered != null && !remembered.isEmpty()) {
         var41 = new ArrayList();
         var110 = new ArrayList();

         for(lIIIIlIliIIIIlIl var44 : remembered.values()) {
            if (var44.ilIIIiilIl >= biomes && var44.ilIIIiilIl <= scanTopYInclusive && var44.ilIIIiilIl >= (int)var78 && var44.ilIIIiilIl <= (int)(var80 >>> 32)) {
               class_2680 var45 = excavation.method_8320(new class_2338(var44.llIIIiilIl, var44.ilIIIiilIl, var44.IiIIIiilIl));
               var90 ^= ((long)lIiliIliIiliIl.liiiIIllIl(var45) ^ var90) & -1L >>> 32;
               if ((int)var90 == 3) {
                  ((List)var110).add(var44);
               } else if ((int)var90 != 2) {
                  ((List)var41).add(var44);
               } else {
                  Object var112 = var44.liIIIiilIl;
                  if (var112 instanceof class_2680) {
                     class_2680 var47 = (class_2680)var112;
                     illiIIliIiliIIli var113 = lIiliIliIiliIl.IliIlllilIi(var47.method_26204());
                     if (var113.IlilIiIlIi != null) {
                        var92 ^= ((long)(var44.ilIIIiilIl - (int)var78 >> 4) ^ var92) & -1L >>> 32;
                        var108 ^= (0L ^ var108) & -1L >>> 32;
                        if ((int)var92 >= 0 && (int)var92 < var37.length && var37[(int)var92] != null) {
                           var108 ^= ((long)world.IliIlllilIi(var37[(int)var92].method_38293((var44.llIIIiilIl & 15) >> 2, var44.ilIIIiilIl - (int)var78 - ((int)var92 << 4) >> 2, (var44.IiIIIiilIl & 15) >> 2), (int)(var68 >>> 32)) ^ var108) & -1L >>> 32;
                        }

                        var15.IilliliilIIi(var113.liilIiIlIi);
                        var15.iliIiiliiiii((int)var108);
                        var15.IIIllIIliIIl(var44.ilIIIiilIl);
                        var13.add(Iilllilliill(var44.llIIIiilIl, var44.ilIIIiilIl, var44.IiIIIiilIl, var47, var113, 16, (int)var108));
                        var86 += 4294967296L;
                        var76 += 4294967296L;
                     }
                  }
               }
            }
         }
      }

      var88 ^= ((long)(Long.bitCount(var25) + Math.max(0, Long.bitCount(var27) - 1)) << 32 ^ var88) & -1L << 32;
      var88 ^= ((long)IliiIIilliiIIi.IliIlllilIi((int)var74, (int)(var88 >>> 32), (int)(var76 >>> 32), (int)(var72 >>> 32), (int)var72) ^ var88) & -1L >>> 32;
      long var111 = (System.nanoTime() - var11) / 1000L;
      return new lililIIiiililIIi(var13, (int)var68, var15, var14, (int)(var70 >>> 32), (int)var70, var111, (int)(var72 >>> 32), (int)var72, (int)(var74 >>> 32), (int)var74, (int)(var76 >>> 32), (int)(var86 >>> 32), (boolean)((int)var88), (List)var41, (List)var110);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) << 8 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) >>> 8) ^ 5236) + var5) << 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) << 8 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) >>> 8) ^ 5236) + var5) >>> 9))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) << 8 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) >>> 8) ^ 5236) + var5) << 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) << 8 | (char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ var5) >>> 8) ^ 5236) + var5) >>> 9))) << 11) - var5) - '\ue72a'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8449583139057371059L ^ Long.rotateLeft(7959459177840720575L, 58) ^ 3512885216790685974L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2155446008509091196L ^ Long.rotateLeft(-1505057256388778074L, 39) ^ 177099747462601049L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3178625539969245233L ^ Long.rotateLeft(-7881670672681879032L, 9) ^ -8179171732385191308L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8376458955079967888L ^ Long.rotateLeft(5412962612240972140L, 62) ^ 2558676794161148136L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4414789429377018590L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7318709851212666730L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -760336232888762394L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6369151095543037608L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8441616735422402595L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6437581648732419817L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') << 6) >>> 12) << 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') >>> 10 | (char)((char)((char)((char)((char)(var4[var5] - 10816) - var5) ^ 8542) ^ var5) - '읚') << 6) >>> 12) >>> 7) ^ var5) - var5) - 17673) + 13931));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IlIlllIlilIl(class_1937 lz, class_2818 lx, class_2826 wx, int wz, int world, int chunkTopY, int wy, int chunkBottomY, int ly, int sec, int chunk) {
      long var33 = 2105421097822698216L;
      long var25 = 1654563752068367629L;
      long var27 = 694034957759849318L;
      long var29 = 5957076020815625796L;
      long var31 = -1559254685312015675L;
      class_2338.class_2339 var11 = new class_2338.class_2339();
      var25 ^= ((long)lz.method_8314(class_1944.field_9282, var11.method_10103(wy, chunkBottomY, ly)) << 32 ^ var25) & -1L << 32;
      if ((int)(var25 >>> 32) < 12) {
         return false;
      } else {
         var25 ^= (0L ^ var25) & -1L >>> 32;
         class_2350[] var14 = IiIliiillliIliiill;
         var27 ^= ((long)var14.length << 32 ^ var27) & -1L << 32;

         for(long var38 = var27 ^ (0L ^ var27) & -1L >>> 32; (int)var38 < (int)(var38 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
            class_2350 var17 = var14[(int)var38];
            var29 ^= ((long)(wz + var17.method_10148()) << 32 ^ var29) & -1L << 32;
            var29 ^= ((long)(world + var17.method_10164()) ^ var29) & -1L >>> 32;
            var31 ^= ((long)(chunkTopY + var17.method_10165()) << 32 ^ var31) & -1L << 32;
            var31 ^= ((long)(wy + var17.method_10148()) ^ var31) & -1L >>> 32;
            var33 ^= ((long)(chunkBottomY + var17.method_10164()) << 32 ^ var33) & -1L << 32;
            var33 ^= ((long)(ly + var17.method_10165()) ^ var33) & -1L >>> 32;
            if ((int)(var33 >>> 32) >= sec && (int)(var33 >>> 32) <= chunk) {
               class_2680 var24;
               if ((int)(var29 >>> 32) >= 0 && (int)(var29 >>> 32) < 16 && (int)var29 >= 0 && (int)var29 < 16 && (int)(var31 >>> 32) >= 0 && (int)(var31 >>> 32) < 16) {
                  var24 = wx.method_12254((int)(var29 >>> 32), (int)var29, (int)(var31 >>> 32));
               } else if ((int)(var29 >>> 32) >= 0 && (int)(var29 >>> 32) < 16 && (int)(var31 >>> 32) >= 0 && (int)(var31 >>> 32) < 16) {
                  var24 = lx.method_8320(var11.method_10103((int)var31, (int)(var33 >>> 32), (int)var33));
               } else {
                  var24 = lz.method_8320(var11.method_10103((int)var31, (int)(var33 >>> 32), (int)var33));
               }

               if (var24.method_26213() > 0) {
                  return false;
               }

               if (var24.method_26215() || var24.method_51176()) {
                  var25 ^= (1L ^ var25) & -1L >>> 32;
               }

               if (lz.method_8314(class_1944.field_9282, var11.method_10103((int)var31, (int)(var33 >>> 32), (int)var33)) > (int)(var25 >>> 32)) {
                  return false;
               }
            }
         }

         return (boolean)((int)var25);
      }
   }

   public static lililIIiiililIIi liiiIIllIl(class_2818 world, class_1937 scanBottomY, llllIliilllIli chunk, int scanTopYInclusive, int biomes) {
      return lIiiIiIlilli(world, scanBottomY, chunk, scanTopYInclusive, biomes, (Map)null, true, 0L, 0L);
   }
}
