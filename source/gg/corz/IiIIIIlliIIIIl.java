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
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IiIIIIlliIIIIl {
   public static final double iliilIiIlIiiilIiIl = 1.27;
   public static final double IliilIiIllliilIiIl = 1.62;
   public static final double liiilIiIliiiilIiIl = 0.05;
   public static final int llIIiIiIlilIIiIiIl = 8;
   public static final int lIiilIiIliIiilIiIl = 3;
   public static final double IiIIiIiIlliIIiIiIl = (double)8.0F;
   public static final int IililIiIllililIiIl = 3;
   public static final int iililIiIlIIiilIiIl = 1;
   private static final int[][] iIIIiIiIlIlIIiIiIl = new int[][]{{1, 0, 0}, {-1, 0, 0}, {0, 1, 0}, {0, -1, 0}, {0, 0, 1}, {0, 0, -1}};
   public static final int[][] IIIIiIiIllIIIiIiIl = new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 9 | var4[var5] >>> 7))) - '\ue915') + 'ﱷ') + '쮓') - var5) ^ var5) - '\ue397') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 9 | var4[var5] >>> 7))) - '\ue915') + 'ﱷ') + '쮓') - var5) ^ var5) - '\ue397') << 14) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 9 | var4[var5] >>> 7))) - '\ue915') + 'ﱷ') + '쮓') - var5) ^ var5) - '\ue397') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] << 9 | var4[var5] >>> 7))) - '\ue915') + 'ﱷ') + '쮓') - var5) ^ var5) - '\ue397') << 14) >>> 1) ^ '쬋') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int iliIiiliiiii(IIIIililIIIili maxFeetY, int feetY, int w, int z, int x) {
      long var9 = -6809084428695594108L;
      long var11 = 2743053091262729543L;

      for(var9 ^= (0L ^ var9) & -1L << 32; w + (int)(var9 >>> 32) < x; var9 += 4294967296L) {
         var9 ^= ((long)(w + (int)(var9 >>> 32)) ^ var9) & -1L >>> 32;
         var11 ^= ((long)((int)var9 + 1) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)((int)var9 + 2) ^ var11) & -1L >>> 32;
         if (maxFeetY.iIlIlllllill(feetY, (int)var9, z) || maxFeetY.IliIlllilIi(feetY, (int)(var11 >>> 32), z) || maxFeetY.iIlIlllllill(feetY, (int)(var11 >>> 32), z) || maxFeetY.IliIlllilIi(feetY, (int)var11, z) || maxFeetY.iIlIlllllill(feetY, (int)var11, z) || maxFeetY.IliIlllilIi(feetY, (int)var11 + 1, z)) {
            break;
         }
      }

      return (int)(var9 >>> 32);
   }

   public static boolean IlIlllIlilIl(IIIIililIIIili tz, int ex, int reach, int tx, double feetY, double ez, double w, double ty) {
      long var48 = 8627164231541786055L;
      long var50 = 3240282343286048344L;
      long var46 = 554364213301591013L;
      double var12 = ez + 1.62;
      double var14 = ez + 1.27;
      double var16 = (double)ex + (double)0.5F - feetY;
      double var18 = (double)reach + (double)0.5F - var12;
      double var20 = (double)tx + (double)0.5F - w;
      if (var16 * var16 + var18 * var18 + var20 * var20 > ty * ty) {
         return false;
      } else {
         int[][] var22 = iIIIiIiIlIlIIiIiIl;
         var46 ^= ((long)var22.length << 32 ^ var46) & -1L << 32;

         for(long var53 = var46 ^ (0L ^ var46) & -1L >>> 32; (int)var53 < (int)(var53 >>> 32); var53 ^= (var53 ^ var53 + (long)1) & -1L >>> 32) {
            int[] var25 = var22[(int)var53];
            var48 ^= ((long)(ex + var25[0]) << 32 ^ var48) & -1L << 32;
            var48 ^= ((long)(reach + var25[1]) ^ var48) & -1L >>> 32;
            var50 ^= ((long)(tx + var25[2]) << 32 ^ var50) & -1L << 32;
            if (tz.liiiIIllIl((int)(var48 >>> 32), (int)var48, (int)(var50 >>> 32))) {
               double var29;
               double var31;
               if (var25[0] != 0) {
                  var29 = var25[0] > 0 ? (double)(ex + 1) : (double)ex;
                  var31 = feetY;
               } else if (var25[1] != 0) {
                  var29 = var25[1] > 0 ? (double)(reach + 1) : (double)reach;
                  var31 = var12;
               } else {
                  var29 = var25[2] > 0 ? (double)(tx + 1) : (double)tx;
                  var31 = w;
               }

               var50 ^= ((long)(var25[0] + var25[1] + var25[2] > 0 ? 1 : 0) ^ var50) & -1L >>> 32;
               if ((int)var50 != 0) {
                  if (var31 >= var29 - 0.05) {
                     continue;
                  }
               } else if (var31 <= var29 + 0.05) {
                  continue;
               }

               double var34 = (double)ex + (double)0.5F + (double)var25[0] * (double)0.5F;
               double var36 = (double)reach + (double)0.5F + (double)var25[1] * (double)0.5F;
               double var38 = (double)tx + (double)0.5F + (double)var25[2] * (double)0.5F;
               double var40 = var34 - feetY;
               double var42 = var36 - var14;
               double var44 = var38 - w;
               if (!(var40 * var40 + var42 * var42 + var44 * var44 > ty * ty)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   private IiIIIIlliIIIIl() {
   }

   public static int Iilllilliill(int dropBlocks) {
      return Math.max(0, dropBlocks - 3);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] + var5))))) + var5) ^ var5))) << 3 | (char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] + var5))))) + var5) ^ var5))) >>> 13) + var5) ^ var5) - 5569) + '鄽') >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] + var5))))) + var5) ^ var5))) << 3 | (char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] + var5))))) + var5) ^ var5))) >>> 13) + var5) ^ var5) - 5569) + '鄽') << 14))))) + 'ꆞ') ^ var5) + '쓒'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) << 9 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) >>> 7) ^ var5) + var5) - 25425) ^ var5))) ^ var5))) << 14 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) << 9 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) >>> 7) ^ var5) + var5) - 25425) ^ var5))) ^ var5))) >>> 2) << 3 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) << 9 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) >>> 7) ^ var5) + var5) - 25425) ^ var5))) ^ var5))) << 14 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) << 9 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) >>> 7 | (char)((char)((char)((char)(var4[var5] - var5) - 20690) - var5) - 12837) << 9) >>> 7) ^ var5) + var5) - 25425) ^ var5))) ^ var5))) >>> 2) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lilliiiiilliii IIlllIlliIll(IIIIililIIIili targets, long reach, int w, long[] feet, Set<Long> maxFeetY, double blocked) {
      long var32 = 5706535755574244956L;
      long var34 = -8540218681731979272L;
      long var36 = -1577302138337369810L;
      long var38 = 7239009156827626015L;
      long var40 = -8288213563881549806L;
      long var30 = 3750853469510491547L;
      var30 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(reach) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(reach) ^ var30) & -1L >>> 32;
      var32 ^= ((long)llIiIiililIiIiil.Illlllllilll(reach) << 32 ^ var32) & -1L << 32;
      ArrayList var11 = new ArrayList(IIIIiIiIllIIIiIiIl.length);
      iiiiIIlIIIIlIl var12 = null;
      var32 ^= ((long)targets.liiiIIllIl((int)(var30 >>> 32), (int)var30 - 1, (int)(var32 >>> 32)) ^ var32) & -1L >>> 32;
      int[][] var14 = IIIIiIiIllIIIiIiIl;
      var34 ^= ((long)var14.length << 32 ^ var34) & -1L << 32;

      for(long var47 = var34 ^ (0L ^ var34) & -1L >>> 32; (int)var47 < (int)(var47 >>> 32); var47 ^= (var47 ^ var47 + (long)1) & -1L >>> 32) {
         int[] var17 = var14[(int)var47];
         long var48 = var36 ^ ((long)((int)(var30 >>> 32) + var17[0]) << 32 ^ var36) & -1L << 32;
         var36 = var48 ^ ((long)((int)(var32 >>> 32) + var17[1]) ^ var48) & -1L >>> 32;
         long var20 = llIiIiililIiIiil.IIIllIIliIIl((int)(var36 >>> 32), (int)var30 - 1, (int)var36);
         long var22 = llIiIiililIiIiil.IIIllIIliIIl((int)(var36 >>> 32), (int)var30, (int)var36);
         var38 ^= ((long)(!targets.IilliliilIIi((int)(var36 >>> 32), (int)var30 - 1, (int)var36) ? 1 : 0) << 32 ^ var38) & -1L << 32;
         IIiilIlllIiilIll var25 = null;
         if (maxFeetY != null && maxFeetY.contains(IliIlllilIi((int)(var36 >>> 32), (int)var36))) {
            var25 = IIiilIlllIiilIll.ililIlilll;
         } else if ((int)(var38 >>> 32) != 0 && targets.iIlIlllllill((int)(var36 >>> 32), (int)var30 - 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.IiilIlilll;
         } else if ((int)(var38 >>> 32) != 0 && targets.IliIlllilIi((int)(var36 >>> 32), (int)var30 - 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.liilIlilll;
         } else if ((int)(var38 >>> 32) != 0 && (int)var32 == 0) {
            var25 = IIiilIlllIiilIll.iiilIlilll;
         } else if (targets.iIlIlllllill((int)(var36 >>> 32), (int)var30, (int)var36)) {
            var25 = IIiilIlllIiilIll.IIIiIlilll;
         } else if (targets.IliIlllilIi((int)(var36 >>> 32), (int)var30, (int)var36)) {
            var25 = IIiilIlllIiilIll.lIIiIlilll;
         } else if (targets.iIlIlllllill((int)(var36 >>> 32), (int)var30 + 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.iIIiIlilll;
         } else if (targets.IliIlllilIi((int)(var36 >>> 32), (int)var30 + 1, (int)var36)) {
            var25 = IIiilIlllIiilIll.IlIiIlilll;
         }

         var38 ^= ((long)(var25 == null ? iliIiiliiiii(targets, (int)(var36 >>> 32), (int)var30, (int)var36, w) : 0) ^ var38) & -1L >>> 32;
         var40 ^= ((long)(var25 == null ? IIIllIIliIIl((int)(var36 >>> 32), (int)var30, (int)var36, (int)var38, feet) : 0) << 32 ^ var40) & -1L << 32;
         var40 ^= ((long)(var25 == null && (int)(var40 >>> 32) > 0 ? IiIlliIliiIl(targets, (int)(var36 >>> 32), (int)var30, (int)var36, (int)var38, feet, blocked) : 0) ^ var40) & -1L >>> 32;
         if (var25 == null && (int)(var40 >>> 32) == 0) {
            var25 = IIiilIlllIiilIll.llIiIlilll;
         } else if (var25 == null && (int)var40 == 0) {
            var25 = IIiilIlllIiilIll.ilIiIlilll;
         }

         iiiiIIlIIIIlIl var29 = new iiiiIIlIIIIlIl(var17[0], var17[1], var20, var22, (boolean)((int)(var38 >>> 32)), (int)var38, (int)(var40 >>> 32), (int)var40, var25);
         var11.add(var29);
         if (var25 == null && (var12 == null || Ililllililil(var29, var12))) {
            var12 = var29;
         }
      }

      return new lilliiiiilliii(var12, var11);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)var4[var5] - 14544) ^ '\uda34') >>> 8 | (char)((char)((char)var4[var5] - 14544) ^ '\uda34') << 8) ^ '蹔') - var5))) ^ '\uf2e9') ^ '\uf785') ^ var5) + var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)var4[var5] - 14544) ^ '\uda34') >>> 8 | (char)((char)((char)var4[var5] - 14544) ^ '\uda34') << 8) ^ '蹔') - var5))) ^ '\uf2e9') ^ '\uf785') ^ var5) + var5) - var5) >>> 14))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Ililllililil(iiiiIIlIIIIlIl a, iiiiIIlIIIIlIl b) {
      if (a.Illlllllilll() != b.Illlllllilll()) {
         return a.Illlllllilll() > b.Illlllllilll();
      } else if (a.IIlllIlliIll() != b.IIlllIlliIll()) {
         return a.IIlllIlliIll() > b.IIlllIlliIll();
      } else if (a.IiIlliIliiIl() != b.IiIlliIliiIl()) {
         return a.IiIlliIliiIl() > b.IiIlliIliiIl();
      } else if (a.IlIlllIlilIl() != b.IlIlllIlilIl()) {
         return !a.IlIlllIlilIl();
      } else {
         return false;
      }
   }

   public static String IilliliilIIi(IIIIililIIIili w, int maxFeetY, int z, int feetY, int x) {
      if (z >= x) {
         return Iiilliiliiil<invokedynamic>();
      } else if (w.iIlIlllllill(maxFeetY, z, feetY)) {
         return Iiilliiliiil<invokedynamic>();
      } else if (!w.IliIlllilIi(maxFeetY, z + 1, feetY) && !w.IliIlllilIi(maxFeetY, z + 2, feetY)) {
         return w.IliIlllilIi(maxFeetY, z + 3, feetY) ? Iiilliiliiil<invokedynamic>() : null;
      } else {
         return Iiilliiliiil<invokedynamic>();
      }
   }

   public static long IliIlllilIi(int x, int z) {
      return llIiIiililIiIiil.IIIllIIliIIl(x, 0, z);
   }

   public static int Illlllllilll(IIIIililIIIili oz, int oy, int cz, int reach, int cx, int maxFeetY, int w, int ox, double minFeetY) {
      long var12 = 5266342073417984490L;
      if (cx == oy && maxFeetY == reach) {
         return Integer.MIN_VALUE;
      } else if (!oz.IliIlllilIi(cx, w, maxFeetY) && !oz.IliIlllilIi(cx, w + 1, maxFeetY)) {
         var12 ^= ((long)iliIiiliiiii(oz, cx, w, maxFeetY, ox) << 32 ^ var12) & -1L << 32;

         for(long var15 = var12 ^ ((long)w ^ var12) & -1L >>> 32; (int)var15 <= Math.min(ox, w + (int)(var15 >>> 32)); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            if (liiiIIllIl(cx, (int)var15, maxFeetY, oy, cz, reach) && IlIlllIlilIl(oz, oy, cz, reach, (double)cx + (double)0.5F, (double)((int)var15), (double)maxFeetY + (double)0.5F, minFeetY)) {
               return (int)var15;
            }
         }

         return Integer.MIN_VALUE;
      } else {
         return Integer.MIN_VALUE;
      }
   }

   public static int IiIlliIliiIl(IIIIililIIIili reach, int targets, int z, int feetY, int w, long[] x, double freeRun) {
      long var23 = 2400470170841545142L;
      long var25 = 8406946464188456723L;
      long var27 = -5370737709949371065L;
      long var29 = -6313320516272940907L;
      var23 ^= (0L ^ var23) & -1L << 32;

      for(var23 ^= (0L ^ var23) & -1L >>> 32; (int)var23 <= w; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
         double var10 = (double)targets + (double)0.5F;
         double var12 = (double)feetY + (double)0.5F;
         var25 ^= (0L ^ var25) & -1L << 32;
         long[] var15 = x;
         var25 ^= ((long)x.length ^ var25) & -1L >>> 32;

         for(var27 ^= (0L ^ var27) & -1L << 32; (int)(var27 >>> 32) < (int)var25; var27 += 4294967296L) {
            long var18 = var15[(int)(var27 >>> 32)];
            var27 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var18) ^ var27) & -1L >>> 32;
            var29 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var18) << 32 ^ var29) & -1L << 32;
            var29 ^= ((long)llIiIiililIiIiil.Illlllllilll(var18) ^ var29) & -1L >>> 32;
            if (iIlIlllllill(targets, z + (int)var23, feetY, (int)var27, (int)(var29 >>> 32), (int)var29, (int)var23 < w) && IlIlllIlilIl(reach, (int)var27, (int)(var29 >>> 32), (int)var29, var10, (double)(z + (int)var23), var12, freeRun)) {
               var25 += 4294967296L;
            }
         }

         var23 ^= ((long)Math.max((int)(var23 >>> 32), (int)(var25 >>> 32)) << 32 ^ var23) & -1L << 32;
      }

      return (int)(var23 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -498485867323995513L ^ Long.rotateLeft(8804377111444251236L, 10) ^ 4652281389198080071L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1819446782168245346L ^ Long.rotateLeft(-1479112187222410067L, 48) ^ 1414619972233834073L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4581771004214644840L ^ Long.rotateLeft(7775728990261899410L, 27) ^ -3070830958071337117L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6513935136405124000L ^ Long.rotateLeft(7773557288015806717L, 63) ^ 4139370153658250522L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1928167841772526318L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1581435482655241496L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7906548714508238100L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8623021394198431530L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7359215077673564508L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2535212602090616167L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   public static boolean liiiIIllIl(int fy, int x, int z, int fx, int y, int fz) {
      return iIlIlllllill(fy, x, z, fx, y, fz, true);
   }

   public static boolean iIlIlllllill(int fx, int z, int x, int mayRaise, int fy, int fz, boolean y) {
      if (Math.abs(mayRaise - fx) <= 3 && Math.abs(fz - x) <= 3) {
         if (fy >= z - 1 && fy <= z + 3) {
            if (mayRaise == fx && fz == x) {
               if (fy != z && fy != z + 1) {
                  return fy < z || !y;
               } else {
                  return false;
               }
            } else {
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) << 13 | (char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) >>> 3))) ^ var5))))) + var5) << 5 | (char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) << 13 | (char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) >>> 3))) ^ var5))))) + var5) >>> 11) ^ var5) + 28582) ^ 5128))) + 25384) << 5 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) << 13 | (char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) >>> 3))) ^ var5))))) + var5) << 5 | (char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) << 13 | (char)((char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) << 15 | (char)((char)((char)(~var4[var5]) + 'ꗛ') + 30165) >>> 1) >>> 3))) ^ var5))))) + var5) >>> 11) ^ var5) + 28582) ^ 5128))) + 25384) >>> 11) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IIIllIIliIIl(int targets, int x, int freeRun, int z, long[] feetY) {
      long var17 = -8324434124808696583L;
      long var13 = 1546830114813565925L;
      long var15 = -2206703558154919730L;
      var13 ^= (0L ^ var13) & -1L << 32;

      for(var13 ^= (0L ^ var13) & -1L >>> 32; (int)var13 <= z; var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         var15 ^= (0L ^ var15) & -1L << 32;
         long[] var8 = feetY;
         var15 ^= ((long)feetY.length ^ var15) & -1L >>> 32;

         for(var17 ^= (0L ^ var17) & -1L << 32; (int)(var17 >>> 32) < (int)var15; var17 += 4294967296L) {
            long var11 = var8[(int)(var17 >>> 32)];
            if (iIlIlllllill(targets, x + (int)var13, freeRun, llIiIiililIiIiil.IiIlliIliiIl(var11), llIiIiililIiIiil.IIlllIlliIll(var11), llIiIiililIiIiil.Illlllllilll(var11), (int)var13 < z)) {
               var15 += 4294967296L;
            }
         }

         var13 ^= ((long)Math.max((int)(var13 >>> 32), (int)(var15 >>> 32)) << 32 ^ var13) & -1L << 32;
      }

      return (int)(var13 >>> 32);
   }

   public static boolean lIiiIiIlilli(String refusal) {
      return Iiilliiliiil<invokedynamic>().equals(refusal) || Iiilliiliiil<invokedynamic>().equals(refusal) || Iiilliiliiil<invokedynamic>().equals(refusal) || Iiilliiliiil<invokedynamic>().equals(refusal) || Iiilliiliiil<invokedynamic>().equals(refusal);
   }

   public static boolean IIillIiliIil(int dropBlocks, double health) {
      if (Iilllilliill(dropBlocks) == 0) {
         return true;
      } else {
         return dropBlocks <= 8 && health - (double)Iilllilliill(dropBlocks) >= (double)8.0F;
      }
   }
}
