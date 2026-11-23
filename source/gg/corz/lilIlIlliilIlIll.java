package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class lilIlIlliilIlIll {
   public static final double IilIlillll = -0.05;
   public static final String liillillll = "cooldown";
   public static final int iiiIlillll = 20;
   public static final int IiiiIillll = 6;
   private long IiIilillll = Long.MIN_VALUE;
   private iIiIiilIliIiil lIIilillll;
   public static final int lIlIlillll = 2;
   public static final String Iiillillll = "zone";
   public static final double IiIllillll = 0.1;
   public static final String IIlllillll = "landing";
   public static final double IIlIlillll = (double)16.0F;
   public static final String Iilllillll = "hunt";
   public static final double IiiIlillll = 0.6;
   public static final int IIiIlillll = 30;
   private final long[] iiIilillll = Iilllilliill();
   public static final int lliIlillll = 6;
   public static final int IiIIlillll = 20;
   public static final String Ilillillll = "reserve";
   public static final int iIlIlillll = 2;
   public static final float liIllillll = 12.0F;
   public static final double llIllillll = (double)8.0F;
   public static final double iiiiIillll = (double)0.75F;
   private class_243 llIilillll;
   public static final int iIiIlillll = 40;
   public static final int iilIlillll = 8;
   public static final double lIIllillll = (double)4.0F;
   public static final int lIiIlillll = 2;
   public static final double IllIlillll = (double)5.5F;
   public static final String iiIllillll = "counter";
   public static final double lllIlillll = (double)4.5F;
   public static final String llillillll = "cfg";
   public static final String iIillillll = "selfdmg";
   public static final String IIillillll = "noshot";
   public static final int liiIlillll = 10;
   private String IlIilillll;
   private final Map<String, liliIIiliiliIIil> ilIilillll = new HashMap();
   public static final double ilIllillll = (double)4.0F;
   public static final int iliiIillll = 2;
   public static final double iIIllillll = (double)4.5F;
   private static final int iiillillll = 7;
   public static final double iIiiIillll = (double)1.0F;
   public static final int IlIIlillll = 1;
   public static final double iiIIlillll = (double)3.0F;
   public static final double IIIIlillll = (double)10.0F;
   public static final String iIlllillll = "aggro";
   public static final String Illllillll = "low";
   public static final double lIIIlillll = (double)0.25F;
   public static final float liiiIillll = 0.001F;
   public static final double illIlillll = (double)32.0F;
   public static final String lIillillll = "run";
   public static final int iliIlillll = Integer.MIN_VALUE;
   private String IIIilillll = IIIillIIil<invokedynamic>();
   public static final int lilIlillll = 2;
   public static final double llIIlillll = (double)1.0F;
   public static final double IliiIillll = (double)1.5F;
   public static final int IIIllillll = 24;
   public static final int lIiiIillll = 3;
   public static final int iIIIlillll = 16;
   public static final int ilIIlillll = 2;
   private final double[] liIilillll = new double[7];
   public static final int IliIlillll = 8;
   public static final double IlIllillll = (double)4.0F;
   public static final String ilillillll = "deflect";
   public static final String lIlllillll = "reach";
   public static final String illllillll = "climb";
   public static final String lilllillll = "stuck";
   private class_2338 iIIilillll;
   public static final int lliiIillll = 30;
   public static final int liIIlillll = 80;
   public static final String iilllillll = "-";

   public static String illIlIilIl(String miss) {
      if (IIIillIIil<invokedynamic>().equals(miss)) {
         return IIIillIIil<invokedynamic>();
      } else {
         return IIIillIIil<invokedynamic>().equals(miss) ? IIIillIIil<invokedynamic>() : IIIillIIil<invokedynamic>();
      }
   }

   public static int IIIIllIIIl(int eta) {
      return Math.max(0, eta) + 10;
   }

   private static llIIIIililIIIIil IlIllllIll(illlIiIiIillIiIi in) {
      long var10 = 2684050968954451174L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      class_243 var2 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 == null) {
         return null;
      } else {
         lliiilIiiliiilIi var3 = var1.IilliliilIIi();
         double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2);
         var10 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max((double)0.0F, var4 - 1.3)) << 32 ^ var10) & -1L << 32;
         IlIillllIill var7 = var1.liiiIIllIl().Illlllllilll();
         float var8 = var3.IliIlllilIi();
         var10 ^= ((long)(var7 != null && Float.isFinite(var8) && (double)var7.IliIlllilIi() >= (double)0.25F * (double)var8 ? 1 : 0) ^ var10) & -1L >>> 32;
         return !Iiilliiliiil(in.liiiIIllIl().field_1351 - var2.field_1351, var3.iliIiiliiiii(), var4, lilIliilIl(var1.IlIillIiilIi()), (int)(var10 >>> 32), (boolean)((int)var10)) ? null : new llIIIIililIIIIil(var2, 16, var4, IIIillIIil<invokedynamic>(), true, -1);
      }
   }

   public static int Iiiiliiiiiii(double walk, int fleeing, boolean flight) {
      long var5 = 1070026557835373093L;
      var5 ^= ((long)(Math.max(1, fleeing) + 4) << 32 ^ var5) & -1L << 32;
      return !flight && Double.isFinite(walk) ? (int)Math.max((double)((int)(var5 >>> 32)), Math.min((double)30.0F, Math.floor(walk) - (double)1.0F - (double)1.0F)) : Math.max((int)(var5 >>> 32), 30);
   }

   private long IIlllIlliIll(long tick) {
      return this.IiIilillll != Long.MIN_VALUE && tick >= this.IiIilillll ? tick - this.IiIilillll : -1L;
   }

   private static llIIIIililIIIIil IIllllIlll(illlIiIiIillIiIi in) {
      if (!in.IIillIiliIil()) {
         return null;
      } else {
         class_243 var1 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
         if (var1 == null) {
            return null;
         } else {
            double var2 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var1);
            return !IiIiliIiiiIi(true, var1.field_1351 - in.liiiIIllIl().field_1351, var2) ? null : new llIIIIililIIIIil(var1, 80, var2, IIIillIIil<invokedynamic>(), true, -1);
         }
      }
   }

   public static boolean IiIlliIliiIl(String why, double h) {
      long var5 = 4584251713444512524L;
      if (why != null && h >= (double)8.0F) {
         var5 ^= (-4294967296L ^ var5) & -1L << 32;
         switch (why.hashCode()) {
            case -52151785:
               if (why.equals(IIIillIIil<invokedynamic>())) {
                  var5 ^= (25769803776L ^ var5) & -1L << 32;
               }
               break;
            case 107348:
               if (why.equals(IIIillIIil<invokedynamic>())) {
                  var5 ^= (21474836480L ^ var5) & -1L << 32;
               }
               break;
            case 3214227:
               if (why.equals(IIIillIIil<invokedynamic>())) {
                  var5 ^= (0L ^ var5) & -1L << 32;
               }
               break;
            case 94750389:
               if (why.equals(IIIillIIil<invokedynamic>())) {
                  var5 ^= (12884901888L ^ var5) & -1L << 32;
               }
               break;
            case 108386675:
               if (why.equals(IIIillIIil<invokedynamic>())) {
                  var5 ^= (8589934592L ^ var5) & -1L << 32;
               }
               break;
            case 109776284:
               if (why.equals(IIIillIIil<invokedynamic>())) {
                  var5 ^= (17179869184L ^ var5) & -1L << 32;
               }
               break;
            case 957830652:
               if (why.equals(IIIillIIil<invokedynamic>())) {
                  var5 ^= (4294967296L ^ var5) & -1L << 32;
               }
         }

         boolean var10000;
         switch ((int)(var5 >>> 32)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
               var10000 = true;
               break;
            default:
               var10000 = false;
         }

         return var10000;
      } else {
         return false;
      }
   }

   public static boolean llIIlilIIl(float ehp, int epf, float style, boolean totem, int res) {
      return IiIIlliIIl(ehp, epf, style, totem, res, 0);
   }

   public static int IllIllllIl(boolean flight, double eta, int stuck) {
      long var7 = -1255732315533468145L;
      var7 ^= ((long)Math.max(1, stuck + 4) << 32 ^ var7) & -1L << 32;
      if (!flight && Double.isFinite(eta)) {
         long var5 = (long)Math.floor(eta) - 15L;
         return (int)Math.max((long)((int)(var7 >>> 32)), Math.min(30L, var5));
      } else {
         return Math.max((int)(var7 >>> 32), 30);
      }
   }

   private static llIIIIililIIIIil iIlllIllll(illlIiIiIillIiIi in) {
      long var7 = -8671448761607228082L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      if (var1.lIiiIiIlilli() != null && var1.lIiiIiIlilli().Illlllllilll()) {
         iIlIiiIiIllIiiIi var2 = var1.lIiiIiIlilli().IIlllIlliIll(40, var1.iliIiiliiiii(), var1.IIIllIIliIIl(), ilillIiill(in), (List)null);
         if (var2 == null) {
            return null;
         } else {
            var7 ^= ((long)Math.min(var2.iIlIlllllill(), var2.liiiIIllIl() - 1) << 32 ^ var7) & -1L << 32;
            if ((int)(var7 >>> 32) < 3) {
               return null;
            } else {
               liIIiIlliiIIiIll var4 = var2.IliIlllilIi((int)(var7 >>> 32));
               double var5 = IliIlIIllliIlIIl.iIIIlIlIIl(in.liiiIIllIl().field_1352, in.liiiIIllIl().field_1350, var4.IliIlllilIi(), var4.iIlIlllllill());
               if (lilliiiillii.iliIiiliiiii(in.liiiIIllIl().field_1351, var4.liiiIIllIl(), var5)) {
                  return null;
               } else {
                  return IIillIiliIil(var5, (int)(var7 >>> 32), var4.liiiIIllIl() - in.liiiIIllIl().field_1351) ? null : new llIIIIililIIIIil(liilliiill(var4), Math.max(1, (int)(var7 >>> 32) - 1), var5, IIIillIIil<invokedynamic>(), false, (int)(var7 >>> 32));
               }
            }
         }
      } else {
         return null;
      }
   }

   private double Illlllllilll(long tick) {
      long var5 = -631521484404587751L;
      var5 ^= ((long)Math.floorMod(tick, 7) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Math.floorMod(tick - 6L, 7) ^ var5) & -1L >>> 32;
      return this.iiIilillll[(int)(var5 >>> 32)] == tick && this.iiIilillll[(int)var5] == tick - 6L ? this.liIilillll[(int)(var5 >>> 32)] - this.liIilillll[(int)var5] : Double.NaN;
   }

   private static double Ilillllill(Iiliiililiii nav) {
      iiilllIIIill var1 = nav.IliIlllilIi();
      return var1 != iiilllIIIill.iIilllIiIlilllIi && var1 != iiilllIIIill.llilllIiililllIi ? Double.NaN : nav.iIlIlllllill();
   }

   private static llIIIIililIIIIil iilllIIill(illlIiIiIillIiIi in) {
      long var16 = -4175096210604067452L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      double var2 = in.iliIiiliiiii();
      if (!(var2 > (double)5.0F)) {
         return null;
      } else {
         illIlIiIilIlIi var4 = var1.lIiiIiIlilli() == null ? null : var1.lIiiIiIlilli().IiIlliIliiIl();
         if (var4 == null) {
            return null;
         } else {
            liIIiIlliiIIiIll var5 = var4.IliIlllilIi();
            class_243 var6 = ilillIiill(in);
            double var7 = iliiiillIiiiiill.iIiliIlili(var5.IilliliilIIi(), var5.iliIiiliiiii(), var6.field_1352, var6.field_1350);
            iIlIiiIiIllIiiIi var9 = var1.lIiiIiIlilli().IIlllIlliIll(16, var1.iliIiiliiiii(), var1.IIIllIIliIIl(), var6, (List)null);
            if (var9 == null) {
               return null;
            } else {
               liIIiIlliiIIiIll var10 = var9.IliIlllilIi(6);
               double var11 = IliIlIIllliIlIIl.iIIIlIlIIl(in.liiiIIllIl().field_1352, in.liiiIIllIl().field_1350, var10.IliIlllilIi(), var10.iIlIlllllill());
               if (!iliiiillIiiiiill.IiIliliIli(var2, var7, var11)) {
                  return null;
               } else {
                  var16 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max((double)0.0F, var2 - 1.3)) << 32 ^ var16) & -1L << 32;
                  liIIiIlliiIIiIll var14 = var9.IliIlllilIi((int)(var16 >>> 32) + 1);
                  var16 ^= ((long)Math.max(1, (int)Math.ceil(iliiiillIiiiiill.llIliilIli(var2))) ^ var16) & -1L >>> 32;
                  return new llIIIIililIIIIil(liilliiill(var14), (int)var16, var2, IIIillIIil<invokedynamic>(), false, -1);
               }
            }
         }
      }
   }

   public static boolean lIlIliIlIl(class_243 missedCentre, class_243 missTick, long tick, long centre) {
      if (missedCentre != null && missTick != null && centre != Long.MIN_VALUE && tick >= centre) {
         return tick - centre < 2L && missedCentre.method_1022(missTick) <= 1.2;
      } else {
         return false;
      }
   }

   private static llIIIIililIIIIil lllllillll(illlIiIiIillIiIi in) {
      long var16 = 2661789024461078482L;
      long var14 = 8148580569689458022L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      class_243 var2 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 == null) {
         return null;
      } else {
         Iiliiililiii var3 = var1.IlIillIiilIi();
         double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2);
         var14 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max((double)0.0F, var4 - 1.3)) << 32 ^ var14) & -1L << 32;
         var14 ^= ((long)(var3 == null ? 0 : var3.liiiIIllIl()) ^ var14) & -1L >>> 32;
         double var8 = var3 == null ? Double.NaN : Ilillllill(var3);
         double var10 = var2.field_1351 - in.liiiIIllIl().field_1351;
         var16 ^= ((long)in.IIlllIlliIll() << 32 ^ var16) & -1L << 32;
         if (!Ililllililil((int)var14, (int)(var16 >>> 32), var10, in.Illlllllilll(), var8, (int)(var14 >>> 32))) {
            return null;
         } else {
            var16 ^= ((long)Ililllililil((int)var14, (int)(var16 >>> 32), var10, in.Illlllllilll(), Double.NaN, (int)(var14 >>> 32)) ^ var16) & -1L >>> 32;
            return new llIIIIililIIIIil(var2, IllIllllIl((boolean)((int)var16), var8, (int)(var14 >>> 32)), var4, IIIillIIil<invokedynamic>(), true, -1);
         }
      }
   }

   private static class_243 liilliiill(liIIiIlliiIIiIll s) {
      return new class_243(s.IliIlllilIi(), s.liiiIIllIl(), s.iIlIlllllill());
   }

   public static boolean Iilililiiili(double closing, double walk, double flight, int save, int stuck, boolean aim, int h) {
      if (closing > (double)5.5F && !(closing > (double)32.0F) && !Double.isNaN(walk)) {
         if (aim) {
            return true;
         } else if (!(walk < 0.15)) {
            return false;
         } else if (walk < -0.05) {
            return true;
         } else if (!Double.isFinite(flight)) {
            return true;
         } else {
            return flight - (double)(Math.max(1, save) + Math.max(0, stuck) + 1) >= (double)h;
         }
      } else {
         return false;
      }
   }

   public llIiiliilIiili IliIlllilIi(illlIiIiIillIiIi in) {
      long var28 = 3582902335304698631L;
      long var30 = -2749940611421898651L;
      this.IIIilillll = IIIillIIil<invokedynamic>();
      if (in != null && in.IliIlllilIi() != null && in.liiiIIllIl() != null) {
         lIiiiiiiIiiiii var2 = in.IliIlllilIi();
         if (var2.liiiIIllIl() != null && var2.IilliliilIIi() != null && var2.iIlIlllllill() != null) {
            llIIIIililIIIIil var3 = IiiIlliiIl(in);
            if (var3 == null) {
               var3 = this.lIIlliIIll(in);
            }

            if (var3 == null) {
               var3 = IlIllllIll(in);
            }

            if (var3 == null) {
               var3 = liIlliiIll(in);
            }

            if (var3 == null) {
               var3 = IIllllIlll(in);
            }

            if (var3 == null) {
               var3 = iIlllIllll(in);
            }

            if (var3 == null) {
               var3 = lllllillll(in);
            }

            if (var3 == null) {
               var3 = ilIllIiIll(in);
            }

            llilIlIlililIlIl var4 = var2.liiiIIllIl().Iiilliiliiil();
            IlIIIlilllIIIlil var5 = var4 == null ? null : (var4.IliIlllilIi() == null ? IlIIIlilllIIIlil.iliIiilIil : var4.IliIlllilIi());
            var28 ^= ((long)(var5 == IlIIIlilllIIIlil.iliIiilIil && iliIiiliiiii(this.IIlllIlliIll(var2.IliIlllilIi()), this.Illlllllilll(var2.IliIlllilIi())) ? 1 : 0) << 32 ^ var28) & -1L << 32;
            var28 ^= ((long)(var3 != null ? 0 : 1) ^ var28) & -1L >>> 32;
            if (var3 == null) {
               var3 = Iillllilll(in, (boolean)((int)(var28 >>> 32)));
            }

            if (var3 == null) {
               var3 = iilllIIill(in);
            }

            if (var3 == null) {
               return null;
            } else {
               if ((int)var28 == 1 && !IIIillIIil<invokedynamic>().equals(var3.IilliliilIIi())) {
                  var28 ^= (2L ^ var28) & -1L >>> 32;
               }

               lliiilIiiliiilIi var8 = var2.IilliliilIIi();
               if (var4 != null && var4.lIiiIiIlilli() && var2.IlIlllIlilIl() != null) {
                  var30 ^= ((long)(var2.liiiIIllIl().IliIlllilIi().iiIIlIIlIl() && var2.liiiIIllIl().IIlllIlliIll() < 2 ? 1 : 0) << 32 ^ var30) & -1L << 32;
                  if (var8.IIiilIiiiIii() && Illillliilli(var4.IiIlliIliiIl(), var8, (boolean)((int)(var30 >>> 32)))) {
                     IilliIIllilliIIl var10 = var2.liiiIIllIl().IilliliilIIi(iIlIIIIiIllIIIIi.lIIIiiIiil);
                     if (!var10.iIlIlllllill() && IIIillIIil<invokedynamic>().equals(var10.IlIlllIlilIl())) {
                        return this.IIiIllIiIl(IIIillIIil<invokedynamic>());
                     } else {
                        Iiliiililiii var11 = var2.IlIillIiilIi();
                        lIlIilIiiIlIilIi var12 = var11 == null ? null : var11.iliIiiliiiii();
                        if (var12 != null && var12 != lIlIilIiiIlIilIi.liIiiIlIIi && !IiIIlliIIl(var12.iIlIlllllill(), var12.IilliliilIIi(), var8.IliIlllilIi(), var8.Iilllilliill() && var8.IIillIiliIil() >= 1, var12.IiIlliIliiIl(), var8.Iilllilliill() ? var8.IIillIiliIil() : 0) && !IIIllIIliIIl(var12.iIlIlllllill(), var12.IilliliilIIi(), var8.IliIlllilIi(), var2.liiiIIllIl().IliIlllilIi())) {
                           return this.IIiIllIiIl(IIIillIIil<invokedynamic>());
                        } else {
                           long var13 = var2.IliIlllilIi();
                           Iiiiilliiiil var15 = var2.IlIlllIlilIl();
                           iIiIlIliIl(var2, var15, var13);

                           try {
                              String var16 = null;

                              while(var3 != null) {
                                 iIiIiilIliIiil var17 = null;
                                 class_2338 var18 = null;
                                 String var19 = null;
                                 if (this.lIIilillll != null && var3.IilliliilIIi().equals(this.IlIilillll) && iiIIlIIlIl(this.llIilillll, var3.IliIlllilIi(), var13, this.lIIilillll.iliIiiliiiii()) && !var15.lIiiIiIlilli(this.lIIilillll)) {
                                    var17 = this.lIIilillll;
                                    var18 = this.iIIilillll;
                                 } else {
                                    liliIIiliiliIIil var20 = (liliIIiliiliIIil)this.ilIilillll.get(var3.IilliliilIIi());
                                    String var21 = var20 == null ? IIIillIIil<invokedynamic>() : var20.iIlIlllllill();
                                    if (var20 != null && lIlIliIlIl(var20.liiiIIllIl(), var3.IliIlllilIi(), var13, var20.IliIlllilIi())) {
                                       IIilIilllIilIill var38 = IIIillIIil<invokedynamic>().equals(var21) ? var15.iliIiiliiiii(var13, var3.IilliliilIIi()) : null;
                                       if (var38 == null) {
                                          var19 = var21;
                                       } else {
                                          var17 = var38.IliIlllilIi();
                                          var18 = var38.liiiIIllIl();
                                       }
                                    } else {
                                       var15.IliIlllilIi(in.IilliliilIIi());
                                       var15.iIlIlllllill(var3.IilliliilIIi());
                                       iiilIlilIIIiIlil var22 = lliIliliIl(var3.IilliliilIIi(), var8);
                                       class_243 var23 = var3.IliIlllilIi().method_1031((double)0.0F, 1.62, (double)0.0F);
                                       class_243 var24 = lIilliIill(var3.IilliliilIIi(), var3.IliIlllilIi(), in);
                                       if (!IIIillIIil<invokedynamic>().equals(var3.IilliliilIIi()) && in.Iilllilliill() != null) {
                                          IIilIilllIilIill var25 = var15.IiIlliIliiIl(var3.IliIlllilIi(), var24, var3.liiiIIllIl(), var13, var2.iliIiiliiiii(), var2.IIlllIlliIll(), var2.Illlllllilll(), var8, 1.2, var3.IilliliilIIi(), var22, var23, in.Iilllilliill());
                                          if (var25 != null) {
                                             var17 = var25.IliIlllilIi();
                                             var18 = var25.liiiIIllIl();
                                          }
                                       }

                                       if (var17 == null) {
                                          var17 = var15.IlIlllIlilIl(var3.IliIlllilIi(), var24, var3.liiiIIllIl(), var13, var2.iliIiiliiiii(), var2.IIlllIlliIll(), var2.Illlllllilll(), var8, 1.2, var3.IilliliilIIi(), var22, var23);
                                       }

                                       long var39 = var20 == null ? Long.MIN_VALUE : var20.IilliliilIIi();
                                       if (var17 == null && IiIlliIliiIl(var3.IilliliilIIi(), var3.iIlIlllllill()) && IlIlllIlilIl(var13, var39)) {
                                          var17 = var15.IlIlllIlilIl(var3.IliIlllilIi(), var24, var3.liiiIIllIl(), var13, var2.iliIiiliiiii(), var2.IIlllIlliIll(), var2.Illlllllilll(), var8, 1.2, var3.IilliliilIIi(), var22, (class_243)null);
                                          var39 = var17 == null ? var13 : Long.MIN_VALUE;
                                       }

                                       if (var17 == null) {
                                          var21 = illIlIilIl(var15.IilliliilIIi());
                                          this.ilIilillll.put(var3.IilliliilIIi(), new liliIIiliiliIIil(var13, var3.IliIlllilIi(), var21, var39));
                                          var19 = var21;
                                       }
                                    }

                                    if (var17 != null) {
                                       this.ilIilillll.remove(var3.IilliliilIIi());
                                       this.lIIilillll = var17;
                                       this.iIIilillll = var18;
                                       this.IlIilillll = var3.IilliliilIIi();
                                       this.llIilillll = var3.IliIlllilIi();
                                    }
                                 }

                                 if (var17 != null) {
                                    var30 ^= ((long)iliiiillIiiiiill.lIlliiIlli(liiIIliliiiIIlil.Iilllilliill(in.IlIlllIlilIl(), in.IiIlliIliiIl(), var17.IliIlllilIi(), var17.liiiIIllIl())) ^ var30) & -1L >>> 32;
                                    if (var3.lIiiIiIlilli() || var2.liiiIIllIl().IliIlllilIi().iiIIlIIlIl() || iliiiillIiiiiill.iiIliIIlli(var17.IilliliilIIi(), (int)var30, var3.iIlIlllllill())) {
                                       llIiiliilIiili var37 = new llIiiliilIiili(var17, var3.IilliliilIIi(), var3.IliIlllilIi(), var3.iliIiiliiiii(), var18);
                                       return var37;
                                    }

                                    var19 = IIIillIIil<invokedynamic>();
                                 }

                                 if (var16 == null) {
                                    var16 = var19;
                                 }

                                 llIIIIililIIIIil var35;
                                 int var10000;
                                 for(var35 = null; var35 == null && (int)var28 < 2; var35 = var10000 == 0 ? Iillllilll(in, (boolean)((int)(var28 >>> 32))) : iilllIIill(in)) {
                                    var10000 = (int)var28;
                                    var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32;
                                 }

                                 var3 = var35;
                                 if (var35 != null) {
                                    iIiIlIliIl(var2, var15, var13);
                                 }
                              }

                              llIiiliilIiili var34 = this.IIiIllIiIl(var16);
                              return var34;
                           } finally {
                              var15.liiiIIllIl((iIilIiIiIlilIiIi)null, 0, (double)0.0F);
                           }
                        }
                     }
                  } else {
                     return this.IIiIllIiIl(IIIillIIil<invokedynamic>());
                  }
               } else {
                  return this.IIiIllIiIl(IIIillIIil<invokedynamic>());
               }
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite lIliliIlil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) << 8 | (char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) >>> 8) << 4 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) << 8 | (char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) >>> 8) >>> 12) + '\ue997') ^ var5) ^ '뚻'))) << 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) << 8 | (char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) >>> 8) << 4 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) << 8 | (char)(~((char)((char)((char)(-var4[var5]) ^ 24299) + 12264))) >>> 8) >>> 12) + '\ue997') ^ var5) ^ '뚻'))) >>> 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void iIiIlIliIl(lIiiiiiiIiiiii tick, Iiiiilliiiil planner, long c) {
      iliilIlIiiilIl var4 = tick.IIlllIlliIll();
      iillilIIilil var5 = var4 == null ? null : var4.liiiIIllIl(tick.iIlIlllllill().iIlIlllllill());
      iIilIiIiIlilIiIi var6 = var5 == null ? null : var5.iIlIlllllill(c);
      if (var6 == null) {
         planner.liiiIIllIl((iIilIiIiIlilIiIi)null, 0, (double)0.0F);
      } else {
         planner.liiiIIllIl(var6, var5.IilliliilIIi(c) - 2, var6.IIlllIlliIll());
      }
   }

   private static llIIIIililIIIIil liIlliiIll(illlIiIiIillIiIi in) {
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      Iiliiililiii var2 = var1.IlIillIiilIi();
      if (var2 == null) {
         return null;
      } else {
         class_243 var3 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
         if (var3 == null) {
            return null;
         } else {
            double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var3);
            return !IlIillIiilIi(var2.liiiIIllIl(), var3.field_1351 - in.liiiIIllIl().field_1351, var4) ? null : new llIIIIililIIIIil(var3, 80, var4, IIIillIIil<invokedynamic>(), true, -1);
         }
      }
   }

   public static boolean iiIIlIIlIl(class_243 prevLanding, class_243 tick, long validUntil, long newLanding) {
      if (prevLanding != null && tick != null && validUntil <= newLanding) {
         return prevLanding.method_1022(tick) <= 1.2;
      } else {
         return false;
      }
   }

   private static class_243 lIilliIill(String centre, class_243 why, illlIiIiIillIiIi in) {
      if (!IIIillIIil<invokedynamic>().equals(centre) && !IIIillIIil<invokedynamic>().equals(centre)) {
         return in.liiiIIllIl();
      } else {
         lIiiiiiiIiiiii var3 = in.IliIlllilIi();
         illIlIiIilIlIi var4 = var3.lIiiIiIlilli() == null ? null : var3.lIiiIiIlilli().IiIlliIliiIl();
         if (var4 == null) {
            return in.liiiIIllIl();
         } else {
            liIIiIlliiIIiIll var5 = var4.IliIlllilIi();
            class_243 var6 = ilillIiill(in);
            return iIIIlIlIIl(why, in.liiiIIllIl(), var5.IilliliilIIi(), var5.iliIiiliiiii(), iliiiillIiiiiill.iIiliIlili(var5.IilliliilIIi(), var5.iliIiiliiiii(), var6.field_1352, var6.field_1350));
         }
      }
   }

   public static boolean IIIilIIiiIIi(boolean rel, double onGround, double above, int flight, int h) {
      if (!rel && onGround >= (double)1.0F && above <= (double)10.0F) {
         return flight >= Math.max(1, h) + 1 + 1 + 2;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIillIIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7881778921809721205L ^ Long.rotateLeft(6355220472766889533L, 59) ^ -7833963509414470863L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6969191634570599687L ^ Long.rotateLeft(7094675946762190141L, 42) ^ -4081343925098142778L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1246812408514074630L ^ Long.rotateLeft(-63332018628954233L, 11) ^ 5765447798796121433L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1953854656554652525L ^ Long.rotateLeft(-129287047585825067L, 48) ^ -6175562171627655786L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8318530164246995366L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3226347734607771511L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2536672452349359924L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6110014155432008120L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5702458897476567220L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2200476468214279017L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIIilIlIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, llIililIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIilliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iiIilIIlil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lIliliIlil<invokedynamic>());
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
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꛙ') ^ '솝') + 20318) - var5) + var5) + '藄') ^ 27144) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꛙ') ^ '솝') + 20318) - var5) + var5) + '藄') ^ 27144) ^ var5) ^ var5) >>> 13) - var5) ^ '\ufdeb') ^ var5) + 13203) - 8111) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int Iliilliiilii(int flight) {
      return Math.max(1, flight) + 2;
   }

   private static llIIIIililIIIIil ilIllIiIll(illlIiIiIillIiIi in) {
      long var11 = -4027395561108910392L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      class_243 var2 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 == null) {
         return null;
      } else {
         lliiilIiiliiilIi var3 = var1.IilliliilIIi();
         double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2);
         var11 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max((double)0.0F, var4 - 1.3)) << 32 ^ var11) & -1L << 32;
         double var7 = in.liiiIIllIl().field_1351 - var2.field_1351;
         class_243 var9 = var3.lIiiIiIlilli();
         var11 ^= ((long)lilliiiillii.IIIllIIliIIl(var3.iliIiiliiiii(), var9 == null ? (double)0.0F : var9.field_1351, var7 - (double)0.75F) ^ var11) & -1L >>> 32;
         return !IIIilIIiiIIi(var3.iliIiiliiiii(), var7, var4, (int)var11, (int)(var11 >>> 32)) ? null : new llIIIIililIIIIil(var2, Math.max(1, Math.min(16, (int)var11 - 1)), var4, IIIillIIil<invokedynamic>(), true, -1);
      }
   }

   // $FF: synthetic method
   private static CallSite IiIilliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ 5306) ^ var5) ^ var5) + var5))))) + var5) ^ var5) - '묃') << 8 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ 5306) ^ var5) ^ var5) + var5))))) + var5) ^ var5) - '묃') >>> 8) ^ var5) - var5) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean Iiilliiliiil(double walkEta, boolean h, double rel, double underFire, int onGround, boolean flight) {
      if (h && walkEta >= (double)0.75F && rel <= (double)10.0F) {
         return lilliiiillii.IlIlllIlilIl(underFire, onGround, 1, true, flight, true) == IiIIIIliliIIIIli.IlliiIIlIi;
      } else {
         return false;
      }
   }

   private static long[] Iilllilliill() {
      long[] var0 = new long[7];
      Arrays.fill(var0, Long.MIN_VALUE);
      return var0;
   }

   public static int IIlilIliiIli(boolean totems, int ehp, float escapePearls) {
      return totems && ehp <= 0 && !(escapePearls > 12.0F) ? 1 : 0;
   }

   public void lIiiIiIlilli(long tick) {
      this.IiIilillll = Long.MIN_VALUE;
   }

   public static boolean IlIillIiilIi(int h, double dy, double unreachableFor) {
      return h >= 20 && dy >= (double)3.0F && unreachableFor <= (double)16.0F;
   }

   private static llIIIIililIIIIil IiiIlliiIl(illlIiIiIillIiIi in) {
      long var8 = -5009743542330353588L;
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      if (var1.IiIlliIliiIl() == null) {
         return null;
      } else {
         ililIlIiIiilIlIi var2 = var1.IiIlliIliiIl().iliIiiliiiii(var1.iIlIlllllill().iIlIlllllill());
         if (var2 == null) {
            return iiiIlIIIll(in);
         } else if (var2.iIlIlllllill() == null) {
            return null;
         } else {
            double var3 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var2.iIlIlllllill());
            if (!(var3 > (double)5.0F)) {
               return null;
            } else {
               long var5 = var2.iliIiiliiiii() == Long.MIN_VALUE ? 0L : Math.max(0L, var1.IliIlllilIi() - var2.iliIiiliiiii());
               var8 ^= ((long)((int)Math.max(0L, (long)var2.IilliliilIIi() - var5)) << 32 ^ var8) & -1L << 32;
               return new llIIIIililIIIIil(var2.iIlIlllllill(), IIIIllIIIl((int)(var8 >>> 32)), var3, IIIillIIil<invokedynamic>(), true, (int)(var8 >>> 32));
            }
         }
      }
   }

   public static boolean IiIiliIiiiIi(boolean dy, double stuck, double h) {
      return dy && Double.isFinite(stuck) && Double.isFinite(h) && h <= (double)16.0F && !iliiiillIiiiiill.iIlIlllllill(stuck, h);
   }

   public static boolean Ililllililil(int dy, int unreachableFor, double flight, boolean rangeOption, double eta, int blocked) {
      if (dy >= 6) {
         return true;
      } else if (unreachableFor >= 6 && flight <= (double)-1.5F && !rangeOption) {
         return true;
      } else {
         return Double.isFinite(eta) && eta - (double)blocked >= (double)15.0F;
      }
   }

   private llIIIIililIIIIil lIIlliIIll(illlIiIiIillIiIi in) {
      if (this.lIIilillll != null && this.IlIilillll != null && this.llIilillll != null && this.lIIilillll.iIlIlllllill() != null) {
         lIiiiiiiIiiiii var2 = in.IliIlllilIi();
         if (var2.liiiIIllIl().IlIillIiilIi() == iIlIIIIiIllIIIIi.lIIIiiIiil && var2.IliIlllilIi() <= this.lIIilillll.iliIiiliiiii()) {
            class_243 var3 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
            if (var3 != null && in.iliIiiliiiii() > (double)4.0F) {
               return IliIlIIllliIlIIl.IIIIllIIIl(var3, this.lIIilillll.iIlIlllllill()) > (double)4.5F ? null : new llIIIIililIIIIil(this.llIilillll, Math.max(1, this.lIIilillll.IilliliilIIi()), in.iliIiiliiiii(), this.IlIilillll, true, -1);
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static boolean IIillIiliIil(double h, int land, double dy) {
      if (!Double.isNaN(h) && !Double.isNaN(dy)) {
         return !(h - 0.28 * (double)Math.max(0, land) > (double)3.5F) && !(Math.abs(dy) > (double)1.0F);
      } else {
         return true;
      }
   }

   public static boolean IiIIlliIIl(float epf, int res, float totems, boolean totem, int style, int ehp) {
      long var10 = 8664824250479721238L;
      if (!Float.isFinite(totems)) {
         return false;
      } else {
         float[] var6 = iililIlIIiilIl.lilllIllliilllIlll;
         var10 ^= ((long)Math.max(0, Math.min(var6.length - 1, style)) << 32 ^ var10) & -1L << 32;
         float var8 = totem && ehp >= 2 ? 1.5F : (totem ? 4.0F : 8.0F);
         float var9 = Math.min(var6[(int)(var10 >>> 32)], totems - var8);
         return lllllillillllill.liiiIIllIl(epf, res) <= var9 + 0.001F;
      }
   }

   // $FF: synthetic method
   private static CallSite llIililIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) ^ 'ﶌ'))) - 9276))) ^ var5) - 16413) >>> 4 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) ^ 'ﶌ'))) - 9276))) ^ var5) - 16413) << 12) ^ var5) + '싌'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private llIiiliilIiili IIiIllIiIl(String why) {
      this.IIIilillll = why;
      return null;
   }

   public void IilliliilIIi(long closing, double h, double tick) {
      long var8 = -4501711554981890253L;
      if (h > (double)5.5F && tick < 0.15) {
         if (this.IiIilillll == Long.MIN_VALUE) {
            this.IiIilillll = closing;
         }
      } else {
         this.IiIilillll = Long.MIN_VALUE;
      }

      var8 ^= ((long)Math.floorMod(closing, 7) << 32 ^ var8) & -1L << 32;
      this.liIilillll[(int)(var8 >>> 32)] = h;
      this.iiIilillll[(int)(var8 >>> 32)] = closing;
   }

   public static boolean Illillliilli(boolean escapePearls, lliiilIiiliiilIi refSolo, boolean self) {
      long var4 = -6339636009437163092L;
      if (refSolo == null) {
         return true;
      } else {
         var4 ^= ((long)(self ? 0 : IIlilIliiIli(escapePearls, refSolo.IIillIiliIil(), refSolo.IliIlllilIi())) << 32 ^ var4) & -1L << 32;
         if (refSolo.Illillliilli() <= (int)(var4 >>> 32)) {
            return false;
         } else {
            return (double)refSolo.IliIlllilIi() > (double)6.0F || refSolo.Iilllilliill();
         }
      }
   }

   private static class_243 ilillIiill(illlIiIiIillIiIi in) {
      return in.IIIllIIliIIl() == null ? class_243.field_1353 : in.IIIllIIliIIl();
   }

   public static int IIiilIiiiIii(IlIIIlilllIIIlil style) {
      return style != null && style != IlIIIlilllIIIlil.iliIiilIil ? 8 : 2;
   }

   private static llIIIIililIIIIil Iillllilll(illlIiIiIillIiIi in, boolean press) {
      long var32 = -4659703161654785704L;
      long var34 = 6666045549643670810L;
      long var28 = 2626189933488684883L;
      long var30 = -781270802784413421L;
      lIiiiiiiIiiiii var2 = in.IliIlllilIi();
      double var3 = in.iliIiiliiiii();
      var28 ^= ((long)var2.liiiIIllIl().IliIlllilIi().iiIIlIIlIl() << 32 ^ var28) & -1L << 32;
      if (var3 > ((int)(var28 >>> 32) != 0 ? (double)4.5F : (double)5.5F) && var2.lIiiIiIlilli() != null) {
         illIlIiIilIlIi var6 = var2.lIiiIiIlilli().IiIlliIliiIl();
         if (var6 == null) {
            return null;
         } else {
            liIIiIlliiIIiIll var7 = var6.IliIlllilIi();
            class_243 var8 = ilillIiill(in);
            double var9 = iliiiillIiiiiill.iIiliIlili(var7.IilliliilIIi(), var7.iliIiiliiiii(), var8.field_1352, var8.field_1350);
            Iiliiililiii var11 = var2.IlIillIiilIi();
            var28 ^= ((long)(var11 == null || var11.IliIlllilIi() != iiilllIIIill.llilllIiililllIi && var11.liiiIIllIl() < 2 ? 0 : 1) ^ var28) & -1L >>> 32;
            double var13 = lilIliilIl(var11);
            double var15 = Double.isFinite(var13) ? var13 : iliiiillIiiiiill.llIliilIli(var3);
            var30 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max((double)0.0F, var3 - 1.3)) << 32 ^ var30) & -1L << 32;
            llilIlIlililIlIl var18 = var2.liiiIIllIl().Iiilliiliiil();
            var30 ^= ((long)(press ? Integer.MIN_VALUE : IIiilIiiiIii(var18 == null ? null : var18.IliIlllilIi())) ^ var30) & -1L >>> 32;
            var32 ^= ((long)((int)(var28 >>> 32) != 0 ? (in.Illlllllilll() || !(var3 <= (double)32.0F) || Double.isNaN(var9) || !(var3 > (double)5.5F) && (int)var28 == 0 && !(var9 < 0.15) ? 0 : 1) : Iilililiiili(var3, var9, var15, (int)(var30 >>> 32), 1, (boolean)((int)var28), (int)var30)) << 32 ^ var32) & -1L << 32;
            if ((int)(var32 >>> 32) == 0) {
               return null;
            } else {
               iIlIiiIiIllIiiIi var21 = var2.lIiiIiIlilli().IIlllIlliIll(40, var2.iliIiiliiiii(), var2.IIIllIIliIIl(), var8, (List)null);
               if (var21 == null) {
                  return null;
               } else {
                  var32 ^= ((long)(var21.liiiIIllIl() - 1) ^ var32) & -1L >>> 32;
                  liIIiIlliiIIiIll var23 = var21.IliIlllilIi(Math.min(Iliilliiilii((int)(var30 >>> 32)), (int)var32));
                  double var24 = IliIlIIllliIlIIl.iIIIlIlIIl(in.liiiIIllIl().field_1352, in.liiiIIllIl().field_1350, var23.IliIlllilIi(), var23.iIlIlllllill());
                  var34 ^= ((long)Iilllilillli.IIIllIIliIIl(Math.max((double)0.0F, var24 - 1.3)) << 32 ^ var34) & -1L << 32;
                  if ((int)(var34 >>> 32) != (int)(var30 >>> 32)) {
                     var23 = var21.IliIlllilIi(Math.min(Iliilliiilii((int)(var34 >>> 32)), (int)var32));
                  }

                  var34 ^= ((long)(!(var9 < -0.05) && !press && (int)(var28 >>> 32) == 0 ? 0 : 1) ^ var34) & -1L >>> 32;
                  return new llIIIIililIIIIil(liilliiill(var23), Iiiiliiiiiii((int)var28 != 0 ? Double.NaN : var15, (int)(var34 >>> 32), (boolean)((int)var34)), var3, IIIillIIil<invokedynamic>(), true, -1);
               }
            }
         }
      } else {
         return null;
      }
   }

   public static boolean iliIiiliiiii(long grow, double age) {
      return grow >= 8L || age >= 0.6;
   }

   private static iiilIlilIIIiIlil lliIliliIl(String why, lliiilIiiliiilIi self) {
      long var4 = 8143110322622909301L;
      var4 ^= (-4294967296L ^ var4) & -1L << 32;
      switch (why.hashCode()) {
         case -52151785:
            if (why.equals(IIIillIIil<invokedynamic>())) {
               var4 ^= (0L ^ var4) & -1L << 32;
            }
            break;
         case 107348:
            if (why.equals(IIIillIIil<invokedynamic>())) {
               var4 ^= (8589934592L ^ var4) & -1L << 32;
            }
            break;
         case 3214227:
            if (why.equals(IIIillIIil<invokedynamic>())) {
               var4 ^= (21474836480L ^ var4) & -1L << 32;
            }
            break;
         case 94750389:
            if (why.equals(IIIillIIil<invokedynamic>())) {
               var4 ^= (12884901888L ^ var4) & -1L << 32;
            }
            break;
         case 108386675:
            if (why.equals(IIIillIIil<invokedynamic>())) {
               var4 ^= (4294967296L ^ var4) & -1L << 32;
            }
            break;
         case 109776284:
            if (why.equals(IIIillIIil<invokedynamic>())) {
               var4 ^= (17179869184L ^ var4) & -1L << 32;
            }
      }

      iiilIlilIIIiIlil var10000;
      switch ((int)(var4 >>> 32)) {
         case 0 -> var10000 = iiilIlilIIIiIlil.IilliliilIIi(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 1 -> var10000 = iiilIlilIIIiIlil.lIiiIiIlilli(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 2 -> var10000 = iiilIlilIIIiIlil.iliIiiliiiii(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 3 -> var10000 = iiilIlilIIIiIlil.IlIlllIlilIl(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 4 -> var10000 = iiilIlilIIIiIlil.IlIlllIlilIl(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         case 5 -> var10000 = iiilIlilIIIiIlil.IIIllIIliIIl(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
         default -> var10000 = iiilIlilIIIiIlil.iIlIlllllill(iliiiillIiiiiill.lliliilili(self.Iilllilliill(), self.IIillIiliIil()));
      }

      return var10000;
   }

   public String liiiIIllIl() {
      return this.IIIilillll;
   }

   public void iIlIlllllill() {
      this.IIIilillll = IIIillIIil<invokedynamic>();
      this.lIIilillll = null;
      this.iIIilillll = null;
      this.IlIilillll = null;
      this.llIilillll = null;
      this.ilIilillll.clear();
      this.IiIilillll = Long.MIN_VALUE;
      Arrays.fill(this.liIilillll, (double)0.0F);
      Arrays.fill(this.iiIilillll, Long.MIN_VALUE);
   }

   public static boolean IlIlllIlilIl(long tick, long blindMiss) {
      return blindMiss == Long.MIN_VALUE || tick < blindMiss || tick - blindMiss >= 6L;
   }

   public static boolean IIIllIIliIIl(float ehp, int res, float t, ilIiliilIiIiliil epf) {
      if (epf != null && epf.iIIIlIlIIl() && Float.isFinite(t)) {
         float var4 = lllllillillllill.liiiIIllIl(ehp, res);
         if (epf.iiIIlIIlIl()) {
            return epf.lIiiIiIlilli(var4, t, false);
         } else if (ilIiliilIiIiliil.Illlllllilll(var4, t)) {
            return false;
         } else {
            return var4 <= t - (epf.llIIlilIIl() ? 2.0F : 4.0F) + 0.001F;
         }
      } else {
         return false;
      }
   }

   public static double lilIliilIl(Iiliiililiii nav) {
      if (nav == null) {
         return Double.NaN;
      } else {
         iiilllIIIill var1 = nav.IliIlllilIi();
         return var1 != iiilllIIIill.lillllIiiillllIi && var1 != iiilllIIIill.iIilllIiIlilllIi && var1 != iiilllIIIill.llilllIiililllIi ? Double.NaN : nav.iIlIlllllill();
      }
   }

   // $FF: synthetic method
   private static CallSite iiIilIIlil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 13 | (char)((char)(var4[var5] + var5) - var5) >>> 3) - var5) + var5) - '\udfd0'))) + var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 13 | (char)((char)(var4[var5] + var5) - var5) >>> 3) - var5) + var5) - '\udfd0'))) + var5) << 9) - '벛') >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 13 | (char)((char)(var4[var5] + var5) - var5) >>> 3) - var5) + var5) - '\udfd0'))) + var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 13 | (char)((char)(var4[var5] + var5) - var5) >>> 3) - var5) + var5) - '\udfd0'))) + var5) << 9) - '벛') << 5) + var5))) + 31588))) + var5))) ^ '륰'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_243 iIIIlIlIIl(class_243 vz, class_243 closing, double centre, double vx, double us) {
      if (vz != null && !Double.isNaN(us) && us < -0.05) {
         double var8 = Math.sqrt(centre * centre + vx * vx);
         return !(var8 > 0.1) ? closing : new class_243(vz.field_1352 + centre / var8 * (double)4.0F, vz.field_1351, vz.field_1350 + vx / var8 * (double)4.0F);
      } else {
         return closing;
      }
   }

   private static llIIIIililIIIIil iiiIlIIIll(illlIiIiIillIiIi in) {
      lIiiiiiiIiiiii var1 = in.IliIlllilIi();
      ililIlIiIiilIlIi var2 = var1.IiIlliIliiIl().Illlllllilll(var1.iIlIlllllill().iIlIlllllill(), var1.IliIlllilIi(), 20);
      class_243 var3 = in.lIiiIiIlilli() != null ? in.lIiiIiIlilli() : in.IilliliilIIi();
      if (var2 != null && var2.iIlIlllllill() != null && var3 != null) {
         if (IliIlIIllliIlIIl.IIIIllIIIl(var3, var2.iIlIlllllill()) > (double)4.0F) {
            return null;
         } else {
            double var4 = IliIlIIllliIlIIl.IIIIllIIIl(in.liiiIIllIl(), var3);
            return !(var4 > (double)5.0F) ? null : new llIIIIililIIIIil(var3, 24, var4, IIIillIIil<invokedynamic>(), true, -1);
         }
      } else {
         return null;
      }
   }
}
