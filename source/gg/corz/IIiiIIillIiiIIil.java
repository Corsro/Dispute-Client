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
import java.util.List;
import java.util.Objects;
import java.util.function.IntFunction;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1511;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3726;
import net.minecraft.class_3959;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_1269.class_9861;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class IIiiIIillIiiIIil {
   public static final double illlIiIIil = (double)2.5F;
   private String IiIIliIIil;
   private double lllIliIIil;
   private long IIlIliIIil;
   private final iilllIiIIillIi IiliIiIIil;
   public static final double lIilIiIIil = (double)70.0F;
   private int lIiIliIIil;
   private double IliiIiIIil;
   private double IllIliIIil;
   public static final String iiIiIiIIil = "-";
   public static final int iiilIiIIil = 3;
   public static final double IiIiIiIIil = (double)89.0F;
   public static final int IIllIiIIil = 8;
   public static final int llllIiIIil = 160;
   public static final int iIIiIiIIil = 12;
   public static final String IlliIiIIil = "crystal";
   private int iIIIliIIil;
   private long IIIIliIIil;
   public static final int IlIiIiIIil = 3;
   public static final int IlilIiIIil = 6;
   private String lIIlliIIil;
   public static final String liIiIiIIil = "escape";
   private final lIlIiIIliIlIiIIl iiliIiIIil;
   private boolean IIiIliIIil;
   private llilIlIlililIlIl iilIliIIil;
   private String lIIIliIIil;
   private double iIlIliIIil;
   public static final double IiilIiIIil = (double)-38.0F;
   public static final int iIllIiIIil = 4;
   private int liiIliIIil;
   public static final String IIliIiIIil = "deflect";
   private IiiIilIiliiIilIi lIiiIiIIil;
   private long iliiIiIIil;
   public static final double ilIiIiIIil = (double)25.0F;
   private long IilIliIIil;
   public static final double ililIiIIil = (double)1.0F;
   public static final int lIIiIiIIil = 90;
   private double IiiIliIIil;
   public static final int lIllIiIIil = 4;
   public static final int IlllIiIIil = 200;
   public static final String iIliIiIIil = "no landing";
   private int IlIIliIIil;
   private long lliiIiIIil;
   private liilllliiillll IIiiIiIIil;
   public static final int lillIiIIil = 2;
   private String ilIIliIIil;
   private int iliIliIIil;
   public static final int llilIiIIil = 4;
   private boolean iIiiIiIIil;
   private long llIIliIIil;
   private int IiiiIiIIil;
   public static final int illiIiIIil = 16;
   private int iiiIliIIil;
   private long liiiIiIIil;
   private int iIiIliIIil;
   private final illillIlIilillIl liliIiIIil;
   private long iiiiIiIIil;
   public static final int IIilIiIIil = 16;
   public static final double IillIiIIil = 0.6;
   private IntFunction<iillilIIilil> IliIliIIil;
   public static final int llliIiIIil = 2;
   private class_243 lIlIliIIil;
   public static final double llIiIiIIil = (double)0.5F;
   private long liIIliIIil;
   private IiiIilIiliiIilIi iiIIliIIil;
   private class_243 illIliIIil;
   public static final double liilIiIIil = (double)30.0F;
   public static final int iIilIiIIil = 72;
   private iIilIiIiIlilIiIi lliIliIIil;
   public static final double IIIiIiIIil = (double)64.0F;
   public static final double[] iillIiIIil = new double[]{(double)16.0F, (double)22.0F, (double)28.0F};
   private lliiilIiiliiilIi lilIliIIil;
   public static final String lIliIiIIil = "zone";
   private int IIIlliIIil;

   private static List<class_243> ilIllIiIll(class_638 self, class_746 s, IIllIIllIllIIl w) {
      ArrayList var3 = new ArrayList();

      for(class_1657 var5 : self.method_18456()) {
         if (var5 != s && var5.method_5805() && !var5.method_31481() && !var5.method_7325() && !var5.method_68878() && !iIIiIiIlIlIiIiIl.liiiIIllIl(var5) && !liiIIIlliiiIIIll.IilliliilIIi(var5) && !(var5.method_5858(s) > (double)4096.0F)) {
            var3.add(var5.method_73189());
         }
      }

      if (var3.isEmpty() && w != null && w.IiIlliIliiIl() != null && w.IiIlliIliiIl().iliIiiliiiii() != null) {
         var3.add(w.IiIlliIliiIl().iliIiiliiiii());
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite iIiilIliil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) >>> 9 | (char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) << 7) - 26443) + '螆') + var5) >>> 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) >>> 9 | (char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) << 7) - 26443) + '螆') + var5) << 8) ^ var5))))) ^ var5) + '鈉') ^ var5) << 15 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) >>> 9 | (char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) << 7) - 26443) + '螆') + var5) >>> 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) >>> 9 | (char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) << 7) - 26443) + '螆') + var5) << 8) ^ var5))))) ^ var5) + '鈉') ^ var5) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private liilllliiillll iIiIlIliIl(long why, String tick) {
      this.lIIIliIIil = tick;
      this.IIIIliIIil = why;
      this.liiiIiIIil = why + 4L;
      this.lliIliliIl();
      this.iIIIliIIil = 0;
      this.IIiiIiIIil = liilllliiillll.IiIIIlIIiliIIIlIIi;
      return liilllliiillll.IiIIIlIIiliIIIlIIi;
   }

   private boolean Illlllllilll(class_746 p, class_1937 w, long pitch, float yaw, float tick) {
      this.IlIlllIlilIl(pitch, this.lIiIliIIil);
      if (this.lliIliIIil != null && p != null) {
         class_243 var7 = liIiililiiIiilil.Illlllllilll(p);
         class_243 var8 = lIilliIill(yaw, tick, iilllIIill(p));
         lIililiIilil var9 = liIiililiiIiilil.iIlIlllllill(var7, var8, 160);
         return var9 != null && var9.iIIlIIiiIlIlIIii && var9.IiIlIIiiliIlIIii != null ? this.IiIlliIliiIl(w, var7, var8, var9.IiIlIIiiliIlIIii, var9.IiIlIIiiliIlIIii.field_1351, Math.max(1, var9.lIllIIiiiIllIIii)) : false;
      } else {
         return false;
      }
   }

   private boolean IIIIllIIIl(IiiIilIiliiIilIi next) {
      return this.IIiiIiIIil == liilllliiillll.iIIIIlIIiIlIIIlIIi && this.lIiiIiIIil != null && !this.iIiiIiIIil && IIIilIIiiIIi(this.lIiiIiIIil, next, this.IliiIiIIil);
   }

   public boolean IIillIiliIil() {
      long var4 = -4740418594189986499L;
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 == null) {
         return false;
      } else if (IIllIIlilIllIIli.IlIlllIlilIl() < this.liiiIiIIil) {
         return false;
      } else if (this.IIiiIiIIil != liilllliiillll.IIIIIlIIilIIIIlIIi && this.IIiiIiIIil != liilllliiillll.iIIIIlIIiIlIIIlIIi) {
         return false;
      } else {
         var4 ^= ((long)this.iiliIiIIil.IilliliilIIi((st) -> st.method_31574(class_1802.field_8634), false) << 32 ^ var4) & -1L << 32;
         if ((int)(var4 >>> 32) < 0) {
            return false;
         } else {
            class_1799 var3 = var1.method_31548().method_5438((int)(var4 >>> 32));
            return !var1.method_7357().method_7904(var3);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite illilIilil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) >>> 12 | (char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) << 4) - var5) ^ var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) >>> 12 | (char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) << 4) - var5) ^ var5) ^ var5) >>> 10) + 1438) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) >>> 12 | (char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) << 4) - var5) ^ var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) >>> 12 | (char)((char)(~((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) ^ '\udd2f'))) + 935) << 4) - var5) ^ var5) ^ var5) >>> 10) + 1438) ^ var5) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_243 iilllIIill(class_746 p) {
      return new class_243(p.method_23317() - p.field_6014, p.method_24828() ? (double)0.0F : p.method_23318() - p.field_6036, p.method_23321() - p.field_5969);
   }

   static boolean lllllillll(class_238 spawn, class_243 crystal) {
      return spawn != null && crystal != null && spawn.method_1006(crystal);
   }

   public IIiiIIillIiiIIil(iilllIiIIillIi aim, illillIlIilillIl gates, lIlIiIIliIlIiIIl slots) {
      this.IIiiIiIIil = liilllliiillll.IIIIIlIIilIIIIlIIi;
      this.IliiIiIIil = (double)2.5F;
      this.lliiIiIIil = Long.MAX_VALUE;
      this.iliiIiIIil = Long.MIN_VALUE;
      this.IiiiIiIIil = 8;
      this.liiiIiIIil = Long.MIN_VALUE;
      this.iiiiIiIIil = Long.MIN_VALUE;
      this.IIIIliIIil = Long.MIN_VALUE;
      this.llIIliIIil = Long.MIN_VALUE;
      this.ilIIliIIil = lIliliIlil<invokedynamic>();
      this.IiIIliIIil = lIliliIlil<invokedynamic>();
      this.liIIliIIil = Long.MIN_VALUE;
      this.IIlIliIIil = Long.MIN_VALUE;
      this.IilIliIIil = Long.MIN_VALUE;
      this.lIiIliIIil = -1;
      this.IiliIiIIil = aim;
      this.liliIiIIil = gates;
      this.iiliIiIIil = slots;
   }

   private void IllIllllIl(long tick, String why) {
      this.IiIIliIIil = why;
      this.liIIliIIil = tick;
   }

   public void IlIillIiilIi() {
      this.lliIliliIl();
      this.iiIIliIIil = null;
      this.IIlIliIIil = Long.MIN_VALUE;
      if (this.IIiiIiIIil != liilllliiillll.llIIIlIIiilIIIlIIi) {
         this.IIiiIiIIil = liilllliiillll.IIIIIlIIilIIIIlIIi;
      }

   }

   public IiiIilIiliiIilIi IilliliilIIi(IIllIIllIllIIl s) {
      long var32 = 425770235590564548L;
      long var34 = -5744563281492953310L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      class_638 var4 = var2.field_1687;
      if (var3 != null && var4 != null && s != null && s.IlIlllIlilIl() != null) {
         lliiilIiiliiilIi var5 = s.IlIlllIlilIl();
         if (!((double)var5.IliIlllilIi() > (double)6.0F) && !var5.Iilllilliill()) {
            return null;
         } else {
            List var6 = ilIllIiIll(var4, var3, s);
            class_243 var7 = var3.method_73189();
            double var8 = (double)0.0F;
            double var10 = (double)0.0F;

            for(class_243 var13 : var6) {
               var8 += var13.field_1352;
               var10 += var13.field_1350;
            }

            float var38;
            if (var6.isEmpty()) {
               var38 = var3.method_36454();
            } else {
               var8 /= (double)var6.size();
               var10 /= (double)var6.size();
               var38 = IlliiIIlllliiIIl.iIlIlllllill(var7.field_1352 - var8, var7.field_1350 - var10);
            }

            class_243 var39 = liIiililiiIiilil.Illlllllilll(var3);
            class_243 var14 = iilllIIill(var3);
            List var15 = liIlliiIll(var38);
            this.iIiIliIIil = 0;
            this.IlIlllIlilIl(s.IIIllIIliIIl(), s.IiIlliIliiIl() == null ? -1 : s.IiIlliIliiIl().iIlIlllllill());
            IiiIilIiliiIilIi var16 = null;
            double var17 = (double)0.0F;
            double var19 = Double.NEGATIVE_INFINITY;
            var32 ^= (0L ^ var32) & -1L << 32;

            for(float var23 : var15) {
               if (this.iIiIliIIil >= 72 || (int)(var32 >>> 32) >= 6) {
                  break;
               }

               double[] var24 = iillIiIIil;
               var32 ^= ((long)var24.length ^ var32) & -1L >>> 32;

               for(var34 ^= (0L ^ var34) & -1L << 32; (int)(var34 >>> 32) < (int)var32; var34 += 4294967296L) {
                  double var27 = var24[(int)(var34 >>> 32)];
                  if (this.iIiIliIIil >= 72 || (int)(var32 >>> 32) >= 6) {
                     break;
                  }

                  llilllIiililllIi var29 = this.iiiIlIIIll(var4, var39, var14, var23, var27);
                  if (var29 != null) {
                     double var30 = lIIlliIIll(var4, var29.ilIiiiIIIi, var29.IiIiiiIIIi, var6);
                     if (!Double.isNaN(var30) && !this.IiIlliIliiIl(var4, var39, lIilliIill(var23, var29.llIiiiIIIi, var14), var29.ilIiiiIIIi, (double)var29.IiIiiiIIIi.method_10264(), var29.liIiiiIIIi)) {
                        var32 += 4294967296L;
                        if (var30 > var19) {
                           var19 = var30;
                           var16 = new IiiIilIiliiIilIi(var23, var29.llIiiiIIIi, var29.ilIiiiIIIi, lIliliIlil<invokedynamic>());
                           var17 = var27;
                        }
                     }
                  }
               }
            }

            this.iIlIliIIil = var16 == null ? (double)0.0F : var19;
            this.IllIliIIil = var17;
            this.lIIlliIIil = var16 != null ? null : lIiiIiIlilli(this.IIIlliIIil, this.iiiIliIIil);
            return var16;
         }
      } else {
         return null;
      }
   }

   public String IIiilIiiiIii() {
      return this.lIIIliIIil;
   }

   private static class_243 IIllllIlll(class_746 ticks, float pitch, float p, int yaw) {
      lIililiIilil var4 = liIiililiiIiilil.iIlIlllllill(liIiililiiIiilil.Illlllllilll(ticks), lIilliIill(pitch, p, iilllIIill(ticks)), yaw);
      return var4 != null && var4.iIIlIIiiIlIlIIii && var4.IiIlIIiiliIlIIii != null ? var4.IiIlIIiiliIlIIii : null;
   }

   private boolean IIiIllIiIl() {
      long var3 = 7917294494387637009L;
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 == null) {
         return true;
      } else {
         var3 ^= ((long)this.iiliIiIIil.IilliliilIIi((st) -> st.method_31574(class_1802.field_8634), false) << 32 ^ var3) & -1L << 32;
         return (int)(var3 >>> 32) < 0 ? true : var1.method_7357().method_7904(var1.method_31548().method_5438((int)(var3 >>> 32)));
      }
   }

   private int iiIIlIIlIl(IiiIilIiliiIilIi next) {
      return this.IiliIiIIil != null && next != null ? IiIIlliIIl(liiIIliliiiIIlil.Iilllilliill(this.IiliIiIIil.IilliliilIIi(), this.IiliIiIIil.lIiiIiIlilli(), next.IliIlllilIi(), next.liiiIIllIl())) : 8;
   }

   private static boolean Iillllilll(class_638 spawn, class_746 w, class_243 p) {
      if (spawn != null && w != null && p != null) {
         class_238 var3 = (new class_238(p, p)).method_1014(1.0E-4);
         return !spawn.method_8333(w, var3, (e) -> e instanceof class_1511 && lllllillll(e.method_5829(), p)).isEmpty();
      } else {
         return false;
      }
   }

   static String lIiiIiIlilli(int zoned, int deflected) {
      if (zoned > 0) {
         return lIliliIlil<invokedynamic>();
      } else {
         return deflected > 0 ? lIliliIlil<invokedynamic>() : null;
      }
   }

   public String Iiilliiliiil() {
      return this.ilIIliIIil;
   }

   private boolean lilIliilIl() {
      return lilIlIlliilIlIll.Illillliilli(this.iilIliIIil == null || this.iilIliIIil.IiIlliIliiIl(), this.lilIliIIil, this.IIiIliIIil);
   }

   static int llIIlilIIl(int tick, long denies, long lastTick) {
      return denies != Long.MIN_VALUE && denies == lastTick - 1L ? tick + 1 : 1;
   }

   public boolean Iilililiiili() {
      return this.IIIIliIIil == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   private static double lIIlliIIll(class_638 stand, class_243 w, class_2338 landing, List<class_243> enemies) {
      long var13 = -2620478421432200604L;
      long var15 = -6511515288454123563L;
      double var4 = Double.POSITIVE_INFINITY;

      for(class_243 var7 : enemies) {
         var4 = Math.min(var4, var7.method_1022(w));
      }

      if (var4 < (double)20.0F) {
         return Double.NaN;
      } else {
         if (Double.isInfinite(var4)) {
            var4 = (double)40.0F;
         }

         var13 ^= ((long)iIiIilIliIil.IilliliilIIi(stand, class_2338.method_49638(w), 4) << 32 ^ var13) & -1L << 32;
         var13 ^= (0L ^ var13) & -1L >>> 32;
         IlillIllllillIll var8 = IilIilllilIill.liiiIIllIl(stand, landing);
         if (var8 != null && var8.liiiIIllIl() != iiIIiilIIlIiil.IliIliIlilliIliIli && var8.iIlIlllllill() <= 1) {
            var13 ^= (1L ^ var13) & -1L >>> 32;
         }

         if ((int)var13 == 0 && !enemies.isEmpty()) {
            class_243 var9 = class_243.method_24955(landing).method_1031((double)0.0F, 1.6, (double)0.0F);
            var15 ^= (4294967296L ^ var15) & -1L << 32;

            for(class_243 var12 : enemies) {
               if (lllIliIlillIliIl.IiIIlliIIl(var12.method_1031((double)0.0F, 1.62, (double)0.0F), var9)) {
                  var15 ^= (0L ^ var15) & -1L << 32;
                  break;
               }
            }

            var13 ^= ((long)((int)(var15 >>> 32)) ^ var13) & -1L >>> 32;
         }

         return var4 + ((int)var13 != 0 ? (double)2.0F : (double)0.0F) - (double)0.5F * (double)((int)(var13 >>> 32));
      }
   }

   // $FF: synthetic method
   private static CallSite IIiillIiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] - 18885) >>> 11 | (char)((char)var4[var5] - 18885) << 5) ^ var5) - '\ue9dc') - 20105) + 26876))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] - 18885) >>> 11 | (char)((char)var4[var5] - 18885) << 5) ^ var5) - '\ue9dc') - 20105) + 26876))) >>> 7) - '鸸'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIilIlIiiIilIlIi IIlllIlliIll(class_1937 w) {
      return w == null ? lIilIlIiiIilIlIi.liIiIIIIIi : (ay, wx, bx, ax, az, bz) -> {
         if (this.liiIliIIil <= 0) {
            return true;
         } else {
            --this.liiIliIIil;
            class_243 var14 = new class_243(ay, wx, bx);
            class_243 var15 = new class_243(ax, az, bz);
            if (var14.method_1025(var15) < 1.0E-8) {
               return true;
            } else {
               return w.method_17742(new class_3959(var14, var15, class_3960.field_17558, class_242.field_1348, class_3726.method_16194())).method_17783() == class_240.field_1333;
            }
         }
      };
   }

   // $FF: synthetic method
   private static CallSite lIliliIlil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1328881735207391116L ^ Long.rotateLeft(-162149042526018211L, 26) ^ -3595995994993766520L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7474117692880874020L ^ Long.rotateLeft(-2890294520496340269L, 8) ^ -3272505297565671637L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3538673974666632169L ^ Long.rotateLeft(-2784506843513780511L, 2) ^ 2293267574200922585L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1887907696354152228L ^ Long.rotateLeft(3286421950910921138L, 11) ^ 5720788151072465319L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7380703754484197721L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8117659752978473341L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4998135281173475462L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5102325329008768278L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4640272999342165846L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4028033132407215392L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illillllil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, illilIilil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lililiilil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIiillIiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIiilIliil<invokedynamic>());
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

   static double iliIiiliiiii(class_243 v, class_243 clear, double eta0, int spot, iIilIiIiIlilIiIi landY, int spawn, double interval, lIilIlIiiIilIlIi flight) {
      if (v != null && clear != null && landY != null && spot >= 1 && !Double.isNaN(eta0)) {
         int[] var10 = iIIiilIlIiil.liiiIIllIl(spawn, interval, spot);
         return var10.length == 0 ? (double)0.0F : iIIiilIlIiil.IilliliilIIi(v.field_1352, v.field_1351, v.field_1350, clear.field_1352, clear.field_1351, clear.field_1350, eta0, var10, landY.IliIlllilIi(), landY.liiiIIllIl(), landY.iIlIlllllill(), flight);
      } else {
         return (double)0.0F;
      }
   }

   public boolean IIlilIliiIli() {
      return this.IIiiIiIIil == liilllliiillll.iIIIIlIIiIlIIIlIIi && this.lIiiIiIIil != null;
   }

   public void Iilllilliill(IiiIilIiliiIilIi validUntilTick, long plan, double acceptRadius) {
      if (validUntilTick != null && validUntilTick.iIlIlllllill() != null && Float.isFinite(validUntilTick.IliIlllilIi()) && Float.isFinite(validUntilTick.liiiIIllIl())) {
         long var6 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (this.IIiiIiIIil != liilllliiillll.llIIIlIIiilIIIlIIi || this.iiiiIiIIil != var6) {
            if (var6 < this.liiiIiIIil) {
               this.IllIllllIl(var6, lIliliIlil<invokedynamic>());
            } else if (this.IIiiIiIIil != liilllliiillll.iIIIIlIIiIlIIIlIIi || !this.iIiiIiIIil) {
               if (var6 <= plan) {
                  if (!this.lilIliilIl()) {
                     this.IllIllllIl(var6, lIliliIlil<invokedynamic>());
                  } else if (this.IIiIllIiIl()) {
                     this.IllIllllIl(var6, lIliliIlil<invokedynamic>());
                  } else if (this.IIIIllIIIl(validUntilTick)) {
                     this.lliiIiIIil = Math.max(this.lliiIiIIil, plan);
                  } else {
                     if (this.IIiiIiIIil != liilllliiillll.iIIIIlIIiIlIIIlIIi || this.lIiiIiIIil == null || this.iIiiIiIIil || iIIIlIlIIl(this.lIiiIiIIil, validUntilTick)) {
                        this.iliiIiIIil = var6;
                        this.IiiiIiIIil = this.iiIIlIIlIl(validUntilTick);
                        this.IlIIliIIil = 0;
                     }

                     this.lIiiIiIIil = validUntilTick;
                     this.iIiiIiIIil = false;
                     this.IliiIiIIil = acceptRadius > (double)0.0F && Double.isFinite(acceptRadius) ? acceptRadius : (double)1.5F;
                     this.lliiIiIIil = plan;
                     this.IIiiIiIIil = liilllliiillll.iIIIIlIIiIlIIIlIIi;
                  }
               }
            }
         }
      }
   }

   public static boolean liiiIIllIl(class_243 planLanding, class_243 radius, double simulatedLanding) {
      if (planLanding != null && radius != null && simulatedLanding > (double)0.0F && !Double.isInfinite(simulatedLanding)) {
         if (Ilillllill(planLanding) && Ilillllill(radius)) {
            return planLanding.method_1022(radius) <= simulatedLanding;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean iIlllIllll(class_746 ticks, float yaw, float pitch, int p) {
      class_243 var4 = liIiililiiIiilil.Illlllllilll(ticks);
      class_638 var5 = class_310.method_1551().field_1687;
      if (Iillllilll(var5, ticks, var4)) {
         return true;
      } else {
         lIililiIilil var6 = liIiililiiIiilil.lIiiIiIlilli(var4, lIilliIill(yaw, pitch, iilllIIill(ticks)), false, 0, (class_1297)null, ticks, true, p);
         return var6 != null && var6.IIilIIiilIilIIii >= 0 && var5 != null && var5.method_8469(var6.IIilIIiilIilIIii) instanceof class_1511;
      }
   }

   static int IiIIlliIIl(double angle) {
      return !Double.isFinite(angle) ? 8 : Math.max(8, (int)Math.ceil(angle / (double)20.0F) + 3);
   }

   private IiiIilIiliiIilIi lIlIliIlIl(class_746 tick, long p) {
      if (this.lIiiIiIIil != null && this.lIiiIiIIil.iIlIlllllill() != null) {
         class_243 var4 = liIiililiiIiilil.Illlllllilll(tick);
         class_243 var5 = iilllIIill(tick);
         double[] var6 = Iilllilillli.IilliliilIIi(var5.field_1352, var5.field_1351, var5.field_1350, tick.method_24828(), 1);
         class_243 var7 = new class_243(var6[0], var6[1], var6[2]);
         lIililiIilil var8 = liIiililiiIiilil.iIlIlllllill(var4, lIilliIill(this.lIiiIiIIil.IliIlllilIi(), this.lIiiIiIIil.liiiIIllIl(), var7), 200);
         if (var8 != null && var8.iIIlIIiiIlIlIIii && var8.IiIlIIiiliIlIIii != null && liiiIIllIl(var8.IiIlIIiiliIlIIii, this.lIiiIiIIil.iIlIlllllill(), this.IliiIiIIil * (double)0.5F)) {
            return null;
         } else {
            iIiIiilIliIiil var9 = Iiiiilliiiil.IIillIiliIil(var4, var6, this.lIiiIiIIil.iIlIlllllill(), Integer.MAX_VALUE, this.IliiIiIIil, p, this.lIiiIiIIil.IilliliilIIi(), Math.max((double)-89.0F, (double)this.lIiiIiIIil.liiiIIllIl() - (double)25.0F), Math.min((double)89.0F, (double)this.lIiiIiIIil.liiiIIllIl() + (double)25.0F), this.lIiiIiIIil.liiiIIllIl());
            return var9 != null && liiiIIllIl(var9.iIlIlllllill(), this.lIiiIiIIil.iIlIlllllill(), this.IliiIiIIil) ? new IiiIilIiliiIilIi(var9.IliIlllilIi(), var9.liiiIIllIl(), this.lIiiIiIIil.iIlIlllllill(), this.lIiiIiIIil.IilliliilIIi()) : null;
         }
      } else {
         return null;
      }
   }

   private static class_2338 IlIllllIll(class_638 landing, class_243 w) {
      long var6 = -3663571688981756033L;
      class_2338 var2 = class_2338.method_49638(w);
      if (!landing.method_8320(var2).method_26220(landing, var2).method_1110()) {
         var2 = var2.method_10084();
      }

      var6 ^= ((long)iIiIilIliIil.IilliliilIIi(landing, var2, 4) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) > 3) {
         return null;
      } else {
         class_2338 var4 = var2.method_10087((int)(var6 >>> 32));
         if (!iIiIilIliIil.iIlIlllllill(landing, var4)) {
            return null;
         } else {
            var6 ^= ((long)iIiIilIliIil.IliIlllilIi(landing, var4) ^ var6) & -1L >>> 32;
            return ((int)var6 & 351) != 0 ? null : var4;
         }
      }
   }

   private void lliIliliIl() {
      this.lIiiIiIIil = null;
      this.iIIIliIIil = 0;
      this.IlIIliIIil = 0;
      this.llIIliIIil = Long.MIN_VALUE;
      this.iIiiIiIIil = false;
      this.lliiIiIIil = Long.MAX_VALUE;
      this.iliiIiIIil = Long.MIN_VALUE;
      this.IiiiIiIIil = 8;
      this.lllIliIIil = (double)0.0F;
      this.illIliIIil = null;
      this.IilIliIIil = Long.MIN_VALUE;
   }

   public liilllliiillll Ililllililil() {
      long var12 = -6776186869771182633L;
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
      this.ilIIliIIil = this.liIIliIIil == var3 ? this.IiIIliIIil : lIliliIlil<invokedynamic>();
      if (var2 != null && var1.field_1687 != null && var1.field_1761 != null) {
         if (this.IIiiIiIIil == liilllliiillll.llIIIlIIiilIIIlIIi || this.IIiiIiIIil == liilllliiillll.IiIIIlIIiliIIIlIIi) {
            this.IIiiIiIIil = liilllliiillll.IIIIIlIIilIIIIlIIi;
         }

         if (this.IIiiIiIIil == liilllliiillll.IIIIIlIIilIIIIlIIi && this.lIiiIiIIil == null && this.iiIIliIIil != null && var3 - this.IIlIliIIil <= 4L && var3 >= this.IIlIliIIil && var3 >= this.liiiIiIIil) {
            this.lIiiIiIIil = this.iiIIliIIil;
            this.iIiiIiIIil = true;
            this.IliiIiIIil = (double)2.5F;
            this.lliiIiIIil = this.IIlIliIIil + 4L + 8L;
            this.lllIliIIil = this.IllIliIIil;
            this.illIliIIil = var2.method_73189();
            this.iliiIiIIil = var3;
            this.IiiiIiIIil = 8;
            this.IIiiIiIIil = liilllliiillll.iIIIIlIIiIlIIIlIIi;
         }

         if (this.IIiiIiIIil == liilllliiillll.iIIIIlIIiIlIIIlIIi && this.lIiiIiIIil != null) {
            if (var3 > this.lliiIiIIil) {
               this.lliIliliIl();
               return liilllliiillll.IIIIIlIIilIIIIlIIi;
            } else if (++this.iIIIliIIil > 12) {
               return this.iIiIlIliIl(var3, lIliliIlil<invokedynamic>());
            } else if (var3 - this.iliiIiIIil > (long)this.IiiiIiIIil) {
               return this.iIiIlIliIl(var3, lIliliIlil<invokedynamic>());
            } else {
               var12 ^= ((long)this.iiliIiIIil.IilliliilIIi((st) -> st.method_31574(class_1802.field_8634), false) << 32 ^ var12) & -1L << 32;
               if ((int)(var12 >>> 32) < 0) {
                  return this.iIiIlIliIl(var3, lIliliIlil<invokedynamic>());
               } else {
                  if (this.iIiiIiIIil && this.illIliIIil != null && var2.method_73189().method_1022(this.illIliIIil) > 0.6 && (this.IilIliIIil == Long.MIN_VALUE || var3 - this.IilIliIIil >= 2L)) {
                     this.IilIliIIil = var3;
                     IiiIilIiliiIilIi var6 = this.IiiIlliiIl(var1.field_1687, var2, var3);
                     if (var6 != null) {
                        this.lIiiIiIIil = var6;
                        this.illIliIIil = var2.method_73189();
                     }
                  }

                  if (!this.iIiiIiIIil) {
                     IiiIilIiliiIilIi var16 = this.lIlIliIlIl(var2, var3);
                     if (var16 != null) {
                        this.lIiiIiIIil = var16;
                     }
                  }

                  this.IiliIiIIil.IIlllIlliIll(IiilIiIiliilIiIi.llIllIiIIi, this.lIiiIiIIil.IliIlllilIi(), this.lIiiIiIIil.liiiIIllIl(), IIIliIilIIliIi.IIiIIiliilIiIIilii, 90);
                  class_1799 var17 = var2.method_31548().method_5438((int)(var12 >>> 32));
                  if (var17.method_31574(class_1802.field_8634) && !var2.method_7357().method_7904(var17)) {
                     if (this.liliIiIIil.iIlIlllllill() && this.liliIiIIil.IiIlliIliiIl()) {
                        if (!this.iIiiIiIIil && !this.lilIliilIl()) {
                           this.lliIliliIl();
                           return liilllliiillll.IIIIIlIIilIIIIlIIi;
                        } else {
                           class_243 var7 = IIllllIlll(var2, this.IiliIiIIil.IilliliilIIi(), this.IiliIiIIil.lIiiIiIlilli(), this.iIiiIiIIil ? 160 : 200);
                           if (!liiiIIllIl(var7, this.lIiiIiIIil.iIlIlllllill(), this.IliiIiIIil)) {
                              return this.illIlIilIl(lIliliIlil<invokedynamic>());
                           } else if (this.iIiiIiIIil && this.Illlllllilll(var2, var1.field_1687, var3, this.IiliIiIIil.IilliliilIIi(), this.IiliIiIIil.lIiiIiIlilli())) {
                              return this.illIlIilIl(lIliliIlil<invokedynamic>());
                           } else if (iIlllIllll(var2, this.IiliIiIIil.IilliliilIIi(), this.IiliIiIIil.lIiiIiIlilli(), this.iIiiIiIIil ? 160 : 200)) {
                              this.IlIIliIIil = llIIlilIIl(this.IlIIliIIil, this.llIIliIIil, var3);
                              this.llIIliIIil = var3;
                              return this.IlIIliIIil >= 2 ? this.iIiIlIliIl(var3, lIliliIlil<invokedynamic>()) : this.illIlIilIl(lIliliIlil<invokedynamic>());
                           } else {
                              this.IlIIliIIil = 0;
                              if (!this.iiliIiIIil.IiIlliIliiIl((int)(var12 >>> 32), var3)) {
                                 return this.illIlIilIl(lIliliIlil<invokedynamic>());
                              } else {
                                 class_1269 var8;
                                 try (IlIIiiIillIIiiIi var9 = this.liliIiIIil.IIlllIlliIll()) {
                                    var8 = var1.field_1761.method_2919(var2, class_1268.field_5808);
                                 }

                                 if (var8 instanceof class_1269.class_9860) {
                                    class_1269.class_9860 var18 = (class_1269.class_9860)var8;
                                    if (var18.comp_2909() == class_9861.field_52427) {
                                       var2.method_6104(class_1268.field_5808);
                                    }
                                 }

                                 this.iiiiIiIIil = var3;
                                 this.lliIliliIl();
                                 this.iIIIliIIil = 0;
                                 this.ilIIliIIil = lIliliIlil<invokedynamic>();
                                 this.iiIIliIIil = null;
                                 this.IIlIliIIil = Long.MIN_VALUE;
                                 this.IIiiIiIIil = liilllliiillll.llIIIlIIiilIIIlIIi;
                                 return liilllliiillll.llIIIlIIiilIIIlIIi;
                              }
                           }
                        }
                     } else {
                        return this.illIlIilIl(lIliliIlil<invokedynamic>());
                     }
                  } else {
                     return this.illIlIilIl(lIliliIlil<invokedynamic>());
                  }
               }
            }
         } else {
            this.IIiiIiIIil = liilllliiillll.IIIIIlIIilIIIIlIIi;
            return liilllliiillll.IIIIIlIIilIIIIlIIi;
         }
      } else {
         this.lliIliliIl();
         return liilllliiillll.IIIIIlIIilIIIIlIIi;
      }
   }

   public void IliIlllilIi(IntFunction<iillilIIilil> source) {
      this.IliIliIIil = source;
   }

   // $FF: synthetic method
   private static CallSite lililiilil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) >>> 14) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) >>> 14) >>> 14))) + var5))) >>> 8 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) >>> 14) << 2 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) << 1 | (char)((char)(var4[var5] + 30749) << 9 | (char)(var4[var5] + 30749) >>> 7) >>> 15) - var5) + var5) - 26731) >>> 14) >>> 14))) + var5))) << 8) - var5))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private llilllIiililllIi iiiIlIIIll(class_638 w, class_243 distance, class_243 yaw, float motion, double spawn) {
      long var27 = 6928105933672327325L;
      double var7 = Math.toRadians((double)motion);
      double var9 = -Math.sin(var7);
      double var11 = Math.cos(var7);
      class_243 var13 = new class_243(distance.field_1352 + var9 * spawn, distance.field_1351 - 1.52, distance.field_1350 + var11 * spawn);
      float var14 = liIiililiiIiilil.IiIlliIliiIl(distance, var13, (double)1.5F, 0.03);
      double var15 = Float.isFinite(var14) ? Math.max((double)-38.0F, Math.min((double)30.0F, (double)var14)) : (double)0.0F;
      class_243[] var17 = new class_243[1];
      double[] var18 = new double[]{Double.POSITIVE_INFINITY};
      double[] var19 = new double[]{Double.NaN};
      int[] var20 = new int[]{0};
      lllIililillIilil var21 = (yawx) -> {
         if (this.iIiIliIIil >= 72) {
            return Double.POSITIVE_INFINITY;
         } else {
            ++this.iIiIliIIil;
            lIililiIilil var16 = liIiililiiIiilil.iIlIlllllill(distance, lIilliIill(motion, (float)yawx, yaw), 160);
            if (var16 != null && var16.iIIlIIiiIlIlIIii && var16.IiIlIIiiliIlIIii != null) {
               class_243 var17x = var16.IiIlIIiiliIlIIii.method_1020(distance);
               double var18x = var17x.field_1352 * var9 + var17x.field_1350 * var11 - spawn;
               if (Math.abs(var18x) < var18[0]) {
                  var18[0] = Math.abs(var18x);
                  var17[0] = var16.IiIlIIiiliIlIIii;
                  var19[0] = yawx;
                  var20[0] = var16.lIllIIiiiIllIIii;
               }

               return var18x;
            } else {
               return Double.POSITIVE_INFINITY;
            }
         }
      };
      double var22 = lillIIIiiillIIIi.IliIlllilIi(var21, var15, (double)-38.0F, (double)30.0F, (double)1.0F, 4);
      if (Double.isNaN(var22)) {
         var22 = var19[0];
      }

      if (!Double.isNaN(var22) && var17[0] != null) {
         class_243 var24 = var17[0];
         var27 ^= ((long)var20[0] << 32 ^ var27) & -1L << 32;
         if (Double.isNaN(var19[0]) || Math.abs(var19[0] - var22) > 1.0E-6) {
            if (this.iIiIliIIil >= 72) {
               return null;
            }

            ++this.iIiIliIIil;
            lIililiIilil var26 = liIiililiiIiilil.iIlIlllllill(distance, lIilliIill(motion, (float)var22, yaw), 160);
            if (var26 == null || !var26.iIIlIIiiIlIlIIii || var26.IiIlIIiiliIlIIii == null) {
               return null;
            }

            var24 = var26.IiIlIIiiliIlIIii;
            var27 ^= ((long)var26.lIllIIiiiIllIIii << 32 ^ var27) & -1L << 32;
         }

         class_2338 var29 = IlIllllIll(w, var24);
         if (var29 == null) {
            return null;
         } else {
            return new llilllIiililllIi((float)var22, var24, var29, Math.max(1, (int)(var27 >>> 32)));
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite Illillllil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 26982) >>> 7 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 26982) << 9) - '錎') - var5) ^ var5) + '腔') - 910) ^ '衬') + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IilliIIllilliIIl iIlIlllllill(IIllIIllIllIIl s) {
      long var7 = 448570162480198642L;
      if (s != null) {
         this.lilIliIIil = s.IlIlllIlilIl();
         this.iilIliIIil = s.Iiilliiliiil();
         this.IIiIliIIil = s.IliIlllilIi().iiIIlIIlIl() && s.IIlllIlliIll() < 2;
         this.lIiIliIIil = s.IiIlliIliiIl() == null ? -1 : s.IiIlliIliiIl().iIlIlllllill();
      }

      long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (this.IIiiIiIIil == liilllliiillll.iIIIIlIIiIlIIIlIIi && this.lIiiIiIIil != null) {
         return new IilliIIllilliIIl(iIlIIIIiIllIIIIi.lIIIiiIiil, true, this.iIiiIiIIil ? this.iIlIliIIil : (double)0.0F, 0, false, false, this.lIiiIiIIil.IilliliilIIi());
      } else if (var2 < this.liiiIiIIil) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.lIIIiiIiil, lIliliIlil<invokedynamic>());
      } else if (s != null && s.Iiiiliiiiiii() == IiIililiIili.IIliiIlIllIliiIlIl) {
         if (s.Iiilliiliiil() != null && !s.Iiilliiliiil().IiIlliIliiIl()) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.lIIIiiIiil, lIliliIlil<invokedynamic>());
         } else if (!this.IIillIiliIil()) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.lIIIiiIiil, lIliliIlil<invokedynamic>());
         } else {
            class_746 var4 = class_310.method_1551().field_1724;
            class_243 var5 = var4 == null ? null : var4.method_73189();
            var7 ^= ((long)(this.IIlIliIIil != Long.MIN_VALUE && var2 - this.IIlIliIIil < 4L && var2 >= this.IIlIliIIil && this.lIlIliIIil != null && var5 != null && this.lIlIliIIil.method_1022(var5) < (double)1.0F ? 1 : 0) << 32 ^ var7) & -1L << 32;
            if ((int)(var7 >>> 32) == 0) {
               this.iiIIliIIil = this.IilliliilIIi(s);
               this.IIlIliIIil = var2;
               this.lIlIliIIil = var5;
            }

            return this.iiIIliIIil == null ? IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.lIIIiiIiil, this.lIIlliIIil == null ? lIliliIlil<invokedynamic>() : this.lIIlliIIil) : new IilliIIllilliIIl(iIlIIIIiIllIIIIi.lIIIiiIiil, true, this.iIlIliIIil, 2, false, false, lIliliIlil<invokedynamic>());
         }
      } else {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.lIIIiiIiil, lIliliIlil<invokedynamic>());
      }
   }

   public liilllliiillll IiIiliIiiiIi() {
      return this.IIiiIiIIil;
   }

   static boolean IIIllIIliIIl(iIilIiIiIlilIiIi x, double z, double feetY, double spot) {
      if (x == null) {
         return false;
      } else {
         double var7 = z - x.IliIlllilIi();
         double var9 = feetY - x.liiiIIllIl();
         double var11 = spot - x.iIlIlllllill();
         return lilliiiillii.IiIlliIliiIl(feetY, Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11), x.IilliliilIIi()) >= (double)0.25F;
      }
   }

   private boolean IiIlliIliiIl(class_1937 feetY, class_243 w, class_243 spawn, class_243 landing, double v, int flight) {
      iIilIiIiIlilIiIi var8 = this.lliIliIIil;
      if (var8 != null && landing != null) {
         if (IIIllIIliIIl(var8, landing.field_1352, v, landing.field_1350)) {
            ++this.iiiIliIIil;
            return true;
         } else if (iIIiilIlIiil.lIiiIiIlilli(iliIiiliiiii(w, spawn, landing.field_1351, flight, var8, this.iliIliIIil, this.IiiIliIIil, this.IIlllIlliIll(feetY)))) {
            ++this.IIIlliIIil;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public boolean Illillliilli() {
      return this.iiiiIiIIil == IIllIIlilIllIIli.IlIlllIlilIl();
   }

   private void IlIlllIlilIl(long tick, int targetId) {
      this.iiiIliIIil = 0;
      this.IIIlliIIil = 0;
      this.liiIliIIil = 16;
      IntFunction var4 = this.IliIliIIil;
      iillilIIilil var5 = var4 != null && targetId >= 0 ? (iillilIIilil)var4.apply(targetId) : null;
      iIilIiIiIlilIiIi var6 = var5 == null ? null : var5.iIlIlllllill(tick);
      this.lliIliIIil = var6;
      this.iliIliIIil = var6 == null ? 0 : var5.IilliliilIIi(tick) - 2;
      this.IiiIliIIil = var6 == null ? (double)0.0F : var6.IIlllIlliIll();
   }

   static boolean iIIIlIlIIl(IiiIilIiliiIilIi next, IiiIilIiliiIilIi current) {
      if (next != null && current != null) {
         return !(liiIIliliiiIIlil.Iilllilliill(next.IliIlllilIi(), next.liiiIIllIl(), current.IliIlllilIi(), current.liiiIIllIl()) <= (double)30.0F);
      } else {
         return true;
      }
   }

   private static boolean Ilillllill(class_243 v) {
      return Double.isFinite(v.field_1352) && Double.isFinite(v.field_1351) && Double.isFinite(v.field_1350);
   }

   public void Iiiiliiiiiii() {
      this.lliIliliIl();
      this.IIiiIiIIil = liilllliiillll.IIIIIlIIilIIIIlIIi;
      this.liiiIiIIil = Long.MIN_VALUE;
      this.iiiiIiIIil = Long.MIN_VALUE;
      this.IIIIliIIil = Long.MIN_VALUE;
      this.lIIIliIIil = null;
      this.iiIIliIIil = null;
      this.IIlIliIIil = Long.MIN_VALUE;
      this.lIlIliIIil = null;
      this.iIlIliIIil = (double)0.0F;
      this.lilIliIIil = null;
      this.iilIliIIil = null;
      this.lIiIliIIil = -1;
      this.lliIliIIil = null;
      this.lIIlliIIil = null;
      this.ilIIliIIil = lIliliIlil<invokedynamic>();
      this.IiIIliIIil = lIliliIlil<invokedynamic>();
      this.liIIliIIil = Long.MIN_VALUE;
   }

   private IiiIilIiliiIilIi IiiIlliiIl(class_638 w, class_746 p, long tick) {
      if (this.lIiiIiIIil != null && w != null && this.lllIliIIil > (double)0.0F) {
         this.iIiIliIIil = 0;
         class_243 var5 = liIiililiiIiilil.Illlllllilll(p);
         class_243 var6 = iilllIIill(p);
         llilllIiililllIi var7 = this.iiiIlIIIll(w, var5, var6, this.lIiiIiIIil.IliIlllilIi(), this.lllIliIIil);
         if (var7 == null) {
            return null;
         } else {
            double var8 = lIIlliIIll(w, var7.ilIiiiIIIi, var7.IiIiiiIIIi, ilIllIiIll(w, p, (IIllIIllIllIIl)null));
            if (Double.isNaN(var8)) {
               return null;
            } else {
               this.IlIlllIlilIl(tick, this.lIiIliIIil);
               return this.IiIlliIliiIl(w, var5, lIilliIill(this.lIiiIiIIil.IliIlllilIi(), var7.llIiiiIIIi, var6), var7.ilIiiiIIIi, (double)var7.IiIiiiIIIi.method_10264(), var7.liIiiiIIIi) ? null : new IiiIilIiliiIilIi(this.lIiiIiIIil.IliIlllilIi(), var7.llIiiiIIIi, var7.ilIiiiIIIi, lIliliIlil<invokedynamic>());
            }
         }
      } else {
         return null;
      }
   }

   public IiiIilIiliiIilIi Iliilliiilii() {
      return this.lIiiIiIIil;
   }

   static class_243 lIilliIill(float motion, float pitch, class_243 yaw) {
      float var3 = -class_3532.method_15374((double)(motion * ((float)Math.PI / 180F))) * class_3532.method_15362((double)(pitch * ((float)Math.PI / 180F)));
      float var4 = -class_3532.method_15374((double)(pitch * ((float)Math.PI / 180F)));
      float var5 = class_3532.method_15362((double)(motion * ((float)Math.PI / 180F))) * class_3532.method_15362((double)(pitch * ((float)Math.PI / 180F)));
      class_243 var6 = (new class_243((double)var3, (double)var4, (double)var5)).method_1029().method_1021((double)1.5F);
      return yaw == null ? var6 : var6.method_1019(yaw);
   }

   private liilllliiillll illIlIilIl(String why) {
      this.ilIIliIIil = why;
      return liilllliiillll.iIIIIlIIiIlIIIlIIi;
   }

   static boolean IIIilIIiiIIi(IiiIilIiliiIilIi radius, IiiIilIiliiIilIi next, double current) {
      if (radius != null && next != null && radius.iIlIlllllill() != null && next.iIlIlllllill() != null) {
         if (!Objects.equals(next.IilliliilIIi(), radius.IilliliilIIi())) {
            return false;
         } else {
            return next.iIlIlllllill().method_1022(radius.iIlIlllllill()) <= current;
         }
      } else {
         return false;
      }
   }

   private static List<Float> liIlliiIll(float away) {
      long var11 = 9053588221425616292L;
      ArrayList var1 = new ArrayList();
      ArrayList var2 = new ArrayList();
      double var3 = (double)22.5F;
      ArrayList var5 = new ArrayList();

      for(long var14 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var14 >>> 32) < 16; var14 += 4294967296L) {
         double var7 = (double)((int)(var14 >>> 32)) * var3;
         double var9 = var7 > (double)180.0F ? var7 - (double)360.0F : var7;
         var5.add(new double[]{var9, Math.abs(var9)});
      }

      var5.sort((a, b) -> Double.compare(a[1], b[1]));

      for(double[] var13 : var5) {
         float var8 = (float)((double)away + var13[0]);
         if (var13[1] <= (double)70.0F) {
            var1.add(var8);
         } else {
            var2.add(var8);
         }
      }

      var1.addAll(var2);
      return var1;
   }
}
