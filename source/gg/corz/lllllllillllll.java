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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3966;
import net.minecraft.class_638;

public final class lllllllillllll {
   private class_243 lllIliiilillIliiil;
   private float iIlIliiilIllIliiil;
   public static final double ililIiiilIiilIiiil = 2.2;
   public static final double lIliIiiiliIliIiiil = 0.299;
   private class_2338 iliIliiilIiiIliiil;
   public static final int IIllIiiillIllIiiil = 2;
   private final iIIlillIlIlill IlIIliiilllIIliiil = new iIIlillIlIlill();
   public static final int IIiiIiiillIiiIiiil = 20;
   private String IliIliiillliIliiil = "";
   public static final double iIIiIiiilIlIiIiiil = (double)0.5F;
   private final Map<Long, Long> ilIIliiilIiIIliiil = new HashMap();
   public static final int liIlIiiiliiIlIiiil = 3;
   public static final double iIiiIiiilIliiIiiil = (double)2.0F;
   private int iilIliiilIIiIliiil = -1;
   public static final String iiiiIiiilIIIIliiil = "/kf";
   private String lIiIliiiliIiIliiil = lliIliliIl<invokedynamic>();
   public static final double IIIiIiiillIIiIiiil = 3.2;
   public static final String IiiiIiiilliiiIiiil = "crystal";
   public static final int iIllIiiilIlllIiiil = 3;
   public static final double iiIiIiiilIIliIiiil = 0.1;
   public static final double IlIlIiiilllIlIiiil = 0.6;
   private long IilIliiillilIliiil = Long.MIN_VALUE;
   public static final double iiiIIiiilIIIlIiiil = (double)6.0F;
   public static final int illiIiiilIiliIiiil = 10;
   private float IIIlliiillIIlliiil;
   public static final Set<String> lIIIliiiliIIIliiil = Set.of(lliIliliIl<invokedynamic>(), lliIliliIl<invokedynamic>(), lliIliliIl<invokedynamic>(), lliIliliIl<invokedynamic>(), lliIliliIl<invokedynamic>(), lliIliliIl<invokedynamic>(), lliIliliIl<invokedynamic>());
   public static final int IillIiiillillIiiil = 6;
   public static final double lIIlIiiiliIIlIiiil = (double)5.0F;
   public static final String lliiIiiililiiIiiil = "unsafe";
   public static final double llIiIiiililIiIiiil = (double)1.0F;
   public static final int liliIiiiliiliIiiil = 8;
   public static final String IiiIIiiilliiIIiiil = "Terminator";
   private long liiIliiiliiiIliiil = Long.MIN_VALUE;
   public static final double liilIiiiliiilIiiil = 2.6;
   private class_2338 liIIliiiliiIIliiil;
   public static final double IlliIiiilllliIiiil = (double)3.5F;
   public static final double IlilIiiilllilIiiil = (double)2.5F;
   public static final int llllIiiililllIiiil = 6;
   public static final double IiIiIiiilliIiIiiil = (double)2.0F;
   public static final double lIilIiiiliIilIiiil = 1.6;
   public static final double ilIlIiiilIiIlIiiil = 0.15;
   private double IIlIliiillIlIliiil = Double.NEGATIVE_INFINITY;
   public static final int iillIiiilIIilIiiil = 6;
   private int llIlliiililIlliiil;
   private float iIIlliiilIlIlliiil;

   private static llillIIlilillIIl Iilllilliill(lllIIiiillIIii c) {
      long var4 = 2263678566036361436L;
      var4 ^= ((long)(c.IliIlllilIi() == IiIIlillliIIlill.lIlIiilill ? 1 : 0) << 32 ^ var4) & -1L << 32;
      ilIIiiiIiIIiii var2 = (int)(var4 >>> 32) != 0 ? c.iIlIlllllill() : null;
      var4 ^= ((long)Ililllililil(c.IliIlllilIi()) ^ var4) & -1L >>> 32;
      return new llillIIlilillIIl(c.liiiIIllIl(), (int)(var4 >>> 32) != 0 ? c.liiiIIllIl() : null, (class_2350)null, (boolean)((int)var4), (int)var4 == 0, true, (class_243)null, (class_238)null, var2 == null ? null : var2.IliIlllilIi(), var2 == null ? null : var2.liiiIIllIl());
   }

   static double Iiiiliiiiiii(class_1937 w, class_243 feet) {
      long var7 = 5759427467376848191L;
      long var9 = -7910179298623577726L;
      if (w != null && feet != null) {
         var7 ^= ((long)class_3532.method_15357(feet.field_1352) << 32 ^ var7) & -1L << 32;
         var7 ^= ((long)class_3532.method_15357(feet.field_1350) ^ var7) & -1L >>> 32;
         var9 ^= ((long)class_3532.method_15357(feet.field_1351 + 0.001) << 32 ^ var9) & -1L << 32;
         class_2338.class_2339 var5 = new class_2338.class_2339();

         for(long var14 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var14 <= 6; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            var5.method_10103((int)(var7 >>> 32), (int)(var14 >>> 32) - (int)var14 - 1, (int)var7);
            if (!w.method_8320(var5).method_26220(w, var5).method_1110()) {
               return (double)((int)(var14 >>> 32) - (int)var14);
            }
         }

         return feet.field_1351;
      } else {
         return feet == null ? (double)0.0F : feet.field_1351;
      }
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)(-var4[var5]))))) << 10 | (char)(-((char)(~((char)(-var4[var5]))))) >>> 6) - 2966) + '藱') - var5) - var5))))) - 13202) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static double Iilililiiili(class_243 eye, class_243 b, class_243 a) {
      float[] var3 = ilIiiIiIii.Ililllililil(eye, b);
      float[] var4 = ilIiiIiIii.Ililllililil(eye, a);
      return liiIIliliiiIIlil.Iilllilliill(var3[0], var3[1], var4[0], var4[1]);
   }

   private void IIiIllIiIl() {
      this.lllIliiilillIliiil = null;
      this.IilIliiillilIliiil = Long.MIN_VALUE;
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) >>> 4) << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) >>> 4) >>> 11) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) >>> 4) << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14474) >>> 2 | (char)(var4[var5] + 14474) << 14) + var5) ^ '떒') - var5) - var5) << 3) ^ '\udf1a') + 29110))) >>> 4) >>> 11) >>> 9) ^ 21351));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean Iliilliiilii(iIilIiIiIlilIiIi p, class_2338 spot) {
      return p != null && spot != null && p.lIiiIiIlilli() == spot.method_10263() && p.iliIiiliiiii() == spot.method_10264() && p.IIIllIIliIIl() == spot.method_10260();
   }

   public IiiIliliiIli IilliliilIIi(IIllIIllIllIIl in, IiiIliliiIli s, ilIlIIIlIiIlIIIl base) {
      long var49 = 7377291060667708765L;
      long var51 = 7033412580380987421L;
      long var53 = 8930821194677976106L;
      long var41 = -7303380522713788016L;
      long var43 = -4999981099566624048L;
      long var45 = -711275130131432292L;
      long var47 = -341219289616177128L;
      liiilIiliiiilIil var4 = in == null ? null : in.IiIlliIliiIl();
      lliiilIiiliiilIi var5 = in == null ? null : in.IlIlllIlilIl();
      class_310 var6 = class_310.method_1551();
      if (var4 != null && var5 != null && s != null && base != null && base.IlIlllIlilIl() != null && var6.field_1724 != null && var6.field_1687 != null) {
         class_243 var7 = var4.IIIllIIliIIl() != null ? var4.IIIllIIliIIl() : var4.iliIiiliiiii();
         class_243 var8 = var5.liiiIIllIl();
         if (var7 != null && var8 != null) {
            if (var4.iIlIlllllill() != this.iilIliiilIIiIliiil) {
               this.iilIliiilIIiIliiil = var4.iIlIlllllill();
               this.IlIIliiilllIIliiil.IIlllIlliIll();
               this.ilIIliiilIiIIliiil.clear();
               this.lilIliilIl();
               this.IIiIllIiIl();
               this.lIlIliIlIl();
            }

            long var9 = in.IIIllIIliIIl();
            this.iIIIlIlIIl(base.IilliliilIIi(), var9);
            this.llIIlilIIl(base, var9);
            this.illIlIilIl(var9);
            double var11 = Math.hypot(var7.field_1352 - var8.field_1352, var7.field_1350 - var8.field_1350);
            double var13 = var7.method_1022(var8);
            lllIIiiillIIii var15 = this.lIiiIiIlilli(in, base, var7, var9);
            IilliIIllilliIIl var16 = in.IilliliilIIi(iIlIIIIiIllIIIIi.IiiiliIiil);
            IilliIIllilliIIl var17 = in.IilliliilIIi(iIlIIIIiIllIIIIi.liiiliIiil);
            var41 ^= ((long)lliIliliIl<invokedynamic>().equals(var16.IlIlllIlilIl()) << 32 ^ var41) & -1L << 32;
            var41 ^= ((long)lliIliliIl<invokedynamic>().equals(var16.IlIlllIlilIl()) ^ var41) & -1L >>> 32;
            var43 ^= ((long)iiIiIIIlIIliIIIl.IlIlllIlilIl(base.Iilllilliill(), (boolean)((int)var41), var16.IilliliilIIi()) << 32 ^ var43) & -1L << 32;
            var43 ^= ((long)(base.lIiiIiIlilli() && (int)(var43 >>> 32) == 0 ? 1 : 0) ^ var43) & -1L >>> 32;
            var45 ^= ((long)iiIiIIIlIIliIIIl.IiIlliIliiIl(var16.iIlIlllllill(), var16.IilliliilIIi(), (boolean)((int)(var41 >>> 32)), (boolean)((int)var43)) << 32 ^ var45) & -1L << 32;
            var45 ^= ((long)(var17.iIlIlllllill() && in.Iilllilliill() <= 0 && var5.Iliilliiilii() >= 0.9F ? 1 : 0) ^ var45) & -1L >>> 32;
            iiliiiIiIIiiiiIi var24 = base.iIlIlllllill();
            var47 ^= ((long)(var24 != null && var24.IIIllIIliIIl() == iIlIIIIiIllIIIIi.lIIIiiIiil && var24.IIlllIlliIll() != null && var5.IIiilIiiiIii() ? 1 : 0) << 32 ^ var47) & -1L << 32;
            var47 ^= ((long)(var15 != null && var15.IlIlllIlilIl() ? 1 : 0) ^ var47) & -1L >>> 32;
            var49 ^= ((long)(var15 != null && var15.IiIlliIliiIl() ? 1 : 0) << 32 ^ var49) & -1L << 32;
            var49 ^= ((long)(var15 != null && iiIiIIIlIIliIIIl.IIIIllIIIl(var15.IliIlllilIi(), (boolean)((int)var47), var15.Iilllilliill(), var15.IIlllIlliIll()) ? 1 : 0) ^ var49) & -1L >>> 32;
            var51 ^= ((long)((int)(var45 >>> 32) != 0 && var16.IIIllIIliIIl() ? 1 : 0) << 32 ^ var51) & -1L << 32;
            IiliiIIililiiIIi var30 = iiIiIIIlIIliIIIl.Iliilliiilii((boolean)((int)var43), (boolean)((int)var41), (boolean)((int)(var41 >>> 32)), (boolean)((int)var47), (int)var47 != 0 && var15.IliIlllilIi() == IiIIlillliIIlill.liIIiilill, (boolean)((int)(var49 >>> 32)), var15 == null ? (double)0.0F : (double)var15.iliIiiliiiii(), (boolean)((int)(var45 >>> 32)), (int)(var45 >>> 32) != 0 ? var16.IilliliilIIi() : (double)0.0F, var13, (boolean)((int)var45), (int)var45 != 0 && var17.IIIllIIliIIl(), base.iliIiiliiiii(), (boolean)((int)(var47 >>> 32)), (boolean)((int)var49), (boolean)((int)(var51 >>> 32)));
            var51 ^= ((long)(var30 == IiliiIIililiiIIi.iiIlliiiil && iiIiIIIlIIliIIIl.Iiiiliiiiiii((boolean)((int)var43), (boolean)((int)var41), (boolean)((int)(var41 >>> 32)), (boolean)((int)var47), (boolean)((int)var49), (boolean)((int)(var45 >>> 32)), (boolean)((int)(var51 >>> 32))) ? 1 : 0) ^ var51) & -1L >>> 32;
            llillIIlilillIIl var33 = null;
            iIiIiilIliIiil var34 = null;
            class_243 var35 = null;
            iIlIIIIiIllIIIIi var32;
            switch (var30) {
               case iiIlliiiil:
                  var32 = iIlIIIIiIllIIIIi.iliiliIiil;
                  var33 = Iilllilliill(var15);
                  var35 = var15.IIIllIIliIIl();
                  break;
               case IIllliiiil:
                  var32 = iIlIIIIiIllIIIIi.IiiiliIiil;
                  break;
               case lIllliiiil:
                  var32 = iIlIIIIiIllIIIIi.liiiliIiil;
                  break;
               case iIllliiiil:
                  var32 = iIlIIIIiIllIIIIi.lIIIiiIiil;
                  var34 = (int)(var47 >>> 32) != 0 ? var24.IIlllIlliIll() : null;
                  break;
               default:
                  var32 = iIlIIIIiIllIIIIi.lliiliIiil;
                  if (var15 != null) {
                     var33 = Iilllilliill(var15);
                     var35 = var15.IIIllIIliIIl();
                  } else {
                     var35 = this.IiIiliIiiiIi(base, var7, var13, var9);
                  }
            }

            IilliIIllilliIIl var36 = in.IilliliilIIi(iIlIIIIiIllIIIIi.IlIIiiIiil);
            var53 ^= ((long)(!base.IIIllIIliIIl() && var5.Ililllililil() > 0 ? 1 : 0) << 32 ^ var53) & -1L << 32;
            if (iiIiIIIlIIliIIIl.iIIIlIlIIl(var30, (int)var45 != 0 && var17.IIIllIIliIIl(), (boolean)((int)(var53 >>> 32)), var36.iIlIlllllill() && lliIliliIl<invokedynamic>().equals(var36.IlIlllIlilIl()))) {
               var32 = iIlIIIIiIllIIIIi.IlIIiiIiil;
               var33 = null;
               var34 = null;
               var35 = null;
            }

            IlliIiIlllliIiIl var38 = var30 == IiliiIIililiiIIi.iIllliiiil ? (var24 != null && var24.Iilllilliill() != null ? var24.Iilllilliill() : new IlliIiIlllliIiIl(IIliIilIliIi.lIIIIlIIliIIIIlIIl, var8, 0.1, false, true, Long.MIN_VALUE)) : (var30 == IiliiIIililiiIIi.Illlliiiil && base.Illlllllilll() != null ? base.Illlllllilll() : this.Illlllllilll(in, var4, var7, var8, var11, base.liiiIIllIl(), var9, (boolean)((int)var43)));
            this.IiIIlliIIl(var30 == IiliiIIililiiIIi.iiIlliiiil && (int)var47 != 0 && var15.IliIlllilIi() != IiIIlillliIIlill.iiIIiilill && !iiIIlIIlIl(base, var15) ? var15.liiiIIllIl() : null, base);
            this.lIiIliiiliIiIliiil = IIillIiliIil(var32 == iIlIIIIiIllIIIIi.IlIIiiIiil ? lliIliliIl<invokedynamic>() : var30.name(), var15) + (var15 == null ? this.IliIliiillliIliiil : "");
            if ((int)var51 != 0 && var32 == iIlIIIIiIllIIIIi.iliiliIiil) {
               this.lIiIliiiliIiIliiil = this.lIiIliiiliIiIliiil + lliIliliIl<invokedynamic>();
            }

            iiliiiIiIIiiiiIi var39 = new iiliiiIiIIiiiiIi(iIliIiIiIlliIiIi.lliIiIiIIi, iIlIIillIllIIill.lliilllill, var15 == null ? (double)0.0F : var15.lIiiIiIlilli(), iiiIiiIlIIIliiIl.lliiIlIlll, var32, var33, (llIlilIlilIlilIl)null, var34, (IIiIllIiIl)null, var38, var35, Integer.MAX_VALUE, 0, lliIliliIl<invokedynamic>(), (String)null);
            IlIIIillllIIIill var40 = var38.IliIlllilIi() == IIliIilIliIi.IiiiiIIIlliiiiIIIl ? IlIIIillllIIIill.ilIilllill : IlIIIillllIIIill.iIIilllill;
            return new IiiIliliiIli(iIllIliIlllIli.lIiiIIIIIl, s.liiiIIllIl(), s.iIlIlllllill(), var32, var40, false, 1.0F, s.IlIlllIlilIl(), s.IiIlliIliiIl(), s.IIlllIlliIll(), illlliIlIillliIl.iilIiiiIll, true, var32 == iIlIIIIiIllIIIIi.IlIIiiIiil || s.IIillIiliIil(), lliIliliIl<invokedynamic>(), var39, false, s.IlIillIiilIi());
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public String liiiIIllIl() {
      return this.lIiIliiiliIiIliiil;
   }

   public void IliIlllilIi() {
      this.IlIIliiilllIIliiil.IIlllIlliIll();
      this.ilIIliiilIiIIliiil.clear();
      this.lilIliilIl();
      this.IIiIllIiIl();
      this.lIlIliIlIl();
      this.iilIliiilIIiIliiil = -1;
      this.lIiIliiiliIiIliiil = lliIliliIl<invokedynamic>();
      this.IliIliiillliIliiil = "";
   }

   static IillIiillillIiil Iiilliiliiil(IillIiillillIiil target, IilIlIIllilIlIIl r) {
      return new IillIiillillIiil(target.IilliliilIIi(), target.lIiiIiIlilli(), target.iliIiiliiiii(), target.IIIllIIliIIl(), target.IlIlllIlilIl(), target.IiIlliIliiIl(), target.IIlllIlliIll(), target.Illlllllilll(), target.Iilllilliill(), target.IIillIiliIil(), target.Ililllililil(), target.Iiilliiliiil(), target.IIIilIIiiIIi(), target.IlIillIiilIi(), target.IiIiliIiiiIi(), target.IIlilIliiIli(), target.Illillliilli(), r, target.IIiilIiiiIii(), target.Iliilliiilii(), target.Iiiiliiiiiii(), target.IIIIllIIIl(), target.iIIIlIlIIl(), target.llIIlilIIl());
   }

   private void lilIliilIl() {
      this.liIIliiiliiIIliiil = null;
      this.IIlIliiillIlIliiil = Double.NEGATIVE_INFINITY;
      this.iIlIliiilIllIliiil = 0.0F;
   }

   private lllIIiiillIIii lIiiIiIlilli(IIllIIllIllIIl in, ilIlIIIlIiIlIIIl feet, class_243 tick, long s) {
      long var64 = 7023991077560116305L;
      long var66 = 1058494481272728853L;
      long var68 = 1034902233816901706L;
      long var70 = 9063615476415932535L;
      long var56 = 363227917026093601L;
      long var72 = -5089147576561046752L;
      long var58 = 4018962376623154724L;
      long var60 = 3394393484270500343L;
      long var62 = -800879630146903224L;
      this.IliIliiillliIliiil = lliIliliIl<invokedynamic>();
      IillIiillillIiil var6 = feet.IliIlllilIi();
      class_310 var7 = class_310.method_1551();
      class_638 var8 = var7.field_1687;
      lliiilIiiliiilIi var9 = in.IlIlllIlilIl();
      liiilIiliiiilIil var10 = in.IiIlliIliiIl();
      if (var6 != null && var8 != null && var6.IilliliilIIi() != null) {
         if (!lllIliIlillIliIl.IiIiliIiiiIi()) {
            this.lilIliilIl();
            return null;
         } else {
            var56 ^= ((long)Math.max(0, in.Iilllilliill()) << 32 ^ var56) & -1L << 32;
            IillIiillillIiil var12 = Iiilliiliiil(var6, IilIlIIllilIlIIl.IIIIlillIl);
            IillIiillillIiil var13 = Iiilliiliiil(var6, new IilIlIIllilIlIIl((int)(var56 >>> 32), var10.llIIlilIIl()));
            lIIiIiiIIiIi var14 = var6.Illlllllilll();
            long var15 = var6.Iilllilliill();
            class_243 var17 = feet.IlIlllIlilIl();
            class_1309 var18 = var6.IilliliilIIi();
            class_243 var19 = var6.lIiiIiIlilli() != null && var6.lIiiIiIlilli().IliIlllilIi() != null ? var6.lIiiIiIlilli().IliIlllilIi() : tick;
            double var20 = Math.min(tick.field_1351, var19.field_1351);
            double var22 = iiIiIIIlIIliIIIl.lIiiIiIlilli(var10.IIlllIlliIll(), var20, IIIIllIIIl(var8, var19));
            class_243 var24 = var9.liiiIIllIl();
            double var25 = iiIiIIIlIIliIIIl.IIlllIlliIll(var9.iliIiiliiiii(), var9.lIiiIiIlilli() == null ? (double)0.0F : var9.lIiiIiIlilli().field_1351, var24.field_1351, IIIIllIIIl(var8, var24));
            class_243 var27 = Double.isNaN(var25) ? null : new class_243(var17.field_1352, var17.field_1351 - (var24.field_1351 - var25), var17.field_1350);
            var56 ^= ((long)feet.IIIllIIliIIl() ^ var56) & -1L >>> 32;
            var58 ^= ((long)((int)var56 != 0 && var9.Iiilliiliiil() > 0 && var6.IiIlliIliiIl() && var6.IIlllIlliIll() ? 1 : 0) << 32 ^ var58) & -1L << 32;
            iIilIiIiIlilIiIi var30 = feet.liiiIIllIl();
            ArrayList var31 = new ArrayList();
            class_238 var32 = new class_238(var17.field_1352 - (double)6.0F, var17.field_1351 - (double)6.0F, var17.field_1350 - (double)6.0F, var17.field_1352 + (double)6.0F, var17.field_1351 + (double)6.0F, var17.field_1350 + (double)6.0F);
            class_239 var33 = lllIliIlillIliIl.Iilililiiili(var17, feet.IiIlliIliiIl(), feet.IIlllIlliIll());

            for(class_1511 var35 : ((class_1937)var8).method_8390(class_1511.class, var32, (e) -> e.method_5805() && !e.method_31481())) {
               class_238 var36 = var35.method_5829();
               if (!(lllIliIlillIliIl.IIlilIliiIli(var17, var36) >= (double)3.0F)) {
                  class_2338 var37 = lllIliIlillIliIl.iliIiiliiiii(var35).method_10062();
                  var58 ^= ((long)var35.method_5628() ^ var58) & -1L >>> 32;
                  if (!this.IllIllllIl(var37, s) && (var14 == null || !var14.IIlilIliiIli((int)var58, var15))) {
                     var60 ^= ((long)(var14 != null && var14.IIillIiliIil(var37.method_10063(), var15) ? 1 : 0) << 32 ^ var60) & -1L << 32;
                     var60 ^= ((long)(var14 != null && var14.IiIiliIiiiIi((int)var58, s, var6.Ililllililil()) ? 1 : 0) ^ var60) & -1L >>> 32;
                     if ((int)var60 == 0 || var37.equals(this.liIIliiiliiIIliiil)) {
                        IiIIlillliIIlill var41;
                        class_243 var10000;
                        label326: {
                           var41 = (int)var60 != 0 ? IiIIlillliIIlill.iiIIiilill : IiIIlillliIIlill.liIIiilill;
                           if (var33 instanceof class_3966) {
                              class_3966 var43 = (class_3966)var33;
                              if (var43.method_17782() == var35) {
                                 var10000 = lllIliIlillIliIl.llIIlilIIl(var36, var17, feet.IiIlliIliiIl(), feet.IIlllIlliIll(), (double)3.0F);
                                 break label326;
                              }
                           }

                           var10000 = null;
                        }

                        class_243 var42 = var10000;
                        double var75 = iiIiIIIlIIliIIIl.Illlllllilll(var42 != null, Illillliilli(var17, var36.method_1005(), feet));
                        var31.add(new IIiIIiillIiIIiil(var41, var37, (ilIIiiiIiIIiii)null, var35, (boolean)((int)(var60 >>> 32)), iiIiIIIlIIliIIIl.Iiilliiliiil(var41, IIiilIiiiIii(var18, var35.method_73189(), var19, var20), var75, Iliilliiilii(var30, var37), var37.equals(this.liIIliiiliiIIliiil)), var75, var42 != null ? var42 : var36.method_1005(), false));
                     }
                  }
               }
            }

            var62 ^= ((long)class_3532.method_15357(var19.field_1352) << 32 ^ var62) & -1L << 32;
            var62 ^= ((long)class_3532.method_15357((var10.IIlllIlliIll() ? var19.field_1351 : var22) + 0.001) ^ var62) & -1L >>> 32;
            var64 ^= ((long)class_3532.method_15357(var19.field_1350) << 32 ^ var64) & -1L << 32;
            var64 ^= ((long)iiIiIIIlIIliIIIl.iliIiiliiiii(var10.IIlllIlliIll(), var10.IlIlllIlilIl() == null ? (double)0.0F : var10.IlIlllIlilIl().field_1351, var20 - var22) ^ var64) & -1L >>> 32;
            var58 ^= ((long)(var10.liiiIIllIl() ? (int)var62 : iiIiIIIlIIliIIIl.IilliliilIIi(var22)) ^ var58) & -1L >>> 32;
            var60 ^= ((long)(var10.liiiIIllIl() ? (int)var62 : Math.min((int)var62, iiIiIIIlIIliIIIl.IilliliilIIi((int)var64 > 0 ? var20 : var22))) << 32 ^ var60) & -1L << 32;
            double var40 = (double)25.0F;
            class_2338.class_2339 var74 = new class_2338.class_2339();
            if ((int)var56 != 0) {
               for(var66 ^= ((long)((int)(var60 >>> 32)) << 32 ^ var66) & -1L << 32; (int)(var66 >>> 32) >= (int)var62 - 3; var66 += -4294967296L) {
                  for(var66 ^= (-3L ^ var66) & -1L >>> 32; (int)var66 <= 3; var66 ^= (var66 ^ var66 + (long)1) & -1L >>> 32) {
                     for(var68 ^= (-12884901888L ^ var68) & -1L << 32; (int)(var68 >>> 32) <= 3; var68 += 4294967296L) {
                        var74.method_10103((int)(var62 >>> 32) + (int)var66, (int)(var66 >>> 32), (int)(var64 >>> 32) + (int)(var68 >>> 32));
                        if (!(var17.method_1028((double)var74.method_10263() + (double)0.5F, (double)var74.method_10264() + (double)0.5F, (double)var74.method_10260() + (double)0.5F) > var40) && IlIlllIlilIl(var17, var74) && lllIliIlillIliIl.IliIlllilIi(var74)) {
                           class_2338 var46 = var74.method_10062();
                           if (!this.IllIllllIl(var46, s)) {
                              class_243 var47 = lllIliIlillIliIl.liiiIIllIl(var46);
                              if (!(var47.method_1022(var19) > (double)5.0F)) {
                                 var68 ^= ((long)(var14 != null && var14.IiIlliIliiIl(var46.method_10063(), var15) ? 1 : 0) ^ var68) & -1L >>> 32;
                                 if ((int)var68 != 0 || lllIliIlillIliIl.IIIllIIliIIl(var46)) {
                                    class_243 var49 = IlIillIiilIi(var46, var17);
                                    double var50 = Illillliilli(var17, var49, feet);
                                    if ((int)(var66 >>> 32) <= (int)var58 || iiIiIIIlIIliIIIl.IIIllIIliIIl(IiIIlillliIIlill.IIlIiilill, var50, (int)(var56 >>> 32), (int)var64)) {
                                       var31.add(new IIiIIiillIiIIiil(IiIIlillliIIlill.IIlIiilill, var46, (ilIIiiiIiIIiii)null, (class_1511)null, true, iiIiIIIlIIliIIIl.Iiilliiliiil(IiIIlillliIIlill.IIlIiilill, IIiilIiiiIii(var18, var47, var19, var20), var50, Iliilliiilii(var30, var46), var46.equals(this.liIIliiiliiIIliiil)), var50, var49, false));
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            if ((int)(var58 >>> 32) != 0) {
               for(var66 ^= ((long)((int)(var60 >>> 32)) << 32 ^ var66) & -1L << 32; (int)(var66 >>> 32) >= Math.min((int)(var60 >>> 32), (int)var58) - 1; var66 += -4294967296L) {
                  for(var66 ^= (-2L ^ var66) & -1L >>> 32; (int)var66 <= 2; var66 ^= (var66 ^ var66 + (long)1) & -1L >>> 32) {
                     for(var68 ^= (-8589934592L ^ var68) & -1L << 32; (int)(var68 >>> 32) <= 2; var68 += 4294967296L) {
                        if ((int)var66 != 0 || (int)(var68 >>> 32) != 0) {
                           var74.method_10103((int)(var62 >>> 32) + (int)var66, (int)(var66 >>> 32), (int)(var64 >>> 32) + (int)(var68 >>> 32));
                           if (!(var17.method_1028((double)var74.method_10263() + (double)0.5F, (double)var74.method_10264() + (double)0.5F, (double)var74.method_10260() + (double)0.5F) > var40)) {
                              var70 ^= ((long)(!IlIlllIlilIl(var17, var74) ? 1 : 0) << 32 ^ var70) & -1L << 32;
                              if ((int)(var70 >>> 32) == 0 || var27 != null && IlIlllIlilIl(var27, var74)) {
                                 class_2338 var77 = var74.method_10062();
                                 if (!this.IllIllllIl(var77, s) && (var14 == null || !var14.iIIIlIlIIl(var77.method_10063(), var15)) && lllIliIlillIliIl.IlIillIiilIi(var77)) {
                                    ilIIiiiIiIIiii var48 = IIIilIIiiIIi(var77, var17, feet);
                                    if (var48 != null) {
                                       class_243 var80 = lllIliIlillIliIl.illilIilil(var48.IliIlllilIi(), var48.liiiIIllIl());
                                       double var81 = Illillliilli(var17, var80, feet);
                                       if ((int)(var66 >>> 32) <= (int)var58 || iiIiIIIlIIliIIIl.IIIllIIliIIl(IiIIlillliIIlill.lIlIiilill, var81, (int)(var56 >>> 32), (int)var64)) {
                                          var31.add(new IIiIIiillIiIIiil(IiIIlillliIIlill.lIlIiilill, var77, var48, (class_1511)null, true, iiIiIIIlIIliIIIl.Iiilliiliiil(IiIIlillliIIlill.lIlIiilill, IIiilIiiiIii(var18, lllIliIlillIliIl.liiiIIllIl(var77), var19, var20), var81, false, var77.equals(this.liIIliiiliiIIliiil)), var81, var80, (boolean)((int)(var70 >>> 32))));
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }

            if (var31.isEmpty()) {
               this.IliIliiillliIliiil = lliIliliIl<invokedynamic>();
               this.lilIliilIl();
               return null;
            } else {
               var31.sort(Comparator.comparingDouble(IIiIIiillIiIIiil::iliIiiliiiii).reversed());
               ilIiliilIiIiliil var76 = in.IliIlllilIi();
               illIlillIilIlill var44 = new illIlillIilIlill(var12, var13, var17, var24, var9.iliIiiliiiii(), var30, var76, var76 != null && var76.iIIIlIlIIl(), (int)(var56 >>> 32), Math.max(0, var6.Ililllililil()), var25);
               ArrayList var45 = new ArrayList();
               var70 ^= (0L ^ var70) & -1L << 32;
               class_243 var78 = null;
               double var79 = Double.NEGATIVE_INFINITY;
               var70 ^= (0L ^ var70) & -1L >>> 32;
               var72 ^= (0L ^ var72) & -1L << 32;

               for(IIiIIiillIiIIiil var53 : var31) {
                  if (!Ililllililil(var53.IliIlllilIi())) {
                     var70 ^= (var70 ^ var70 + (long)1) & -1L >>> 32;
                     lllIIiiillIIii var54 = this.IIIllIIliIIl(var53, var44, false);
                     if (var54 != null) {
                        if (var54.IliIlllilIi() == IiIIlillliIIlill.iiIIiilill && !var54.IlIlllIlilIl()) {
                           var70 ^= (4294967296L ^ var70) & -1L << 32;
                           if ((var54.Illlllllilll() || var54.iliIiiliiiii() >= 2.0F) && (var78 == null || var54.lIiiIiIlilli() > var79)) {
                              var78 = var54.IIIllIIliIIl();
                              var79 = var54.lIiiIiIlilli();
                           }
                        }

                        var45.add(var54);
                     }
                  }
               }

               var72 ^= (0L ^ var72) & -1L >>> 32;

               for(IIiIIiillIiIIiil var84 : var31) {
                  if (Ililllililil(var84.IliIlllilIi())) {
                     if (var78 != null && !iiIiIIIlIIliIIIl.IIillIiliIil(var84.IliIlllilIi(), var84.IIIllIIliIIl(), Iilililiiili(var17, var84.IlIlllIlilIl(), var78), (int)(var56 >>> 32))) {
                        var72 += 4294967296L;
                     } else if ((int)var72 < 6 || var84.liiiIIllIl().equals(this.liIIliiiliiIIliiil)) {
                        var72 ^= (var72 ^ var72 + (long)1) & -1L >>> 32;
                        var70 ^= (var70 ^ var70 + (long)1) & -1L >>> 32;
                        lllIIiiillIIii var55 = this.IIIllIIliIIl(var84, var44, (boolean)((int)(var70 >>> 32)));
                        if (var55 != null) {
                           var45.add(var55);
                        }
                     }
                  }
               }

               lllIIiiillIIii var83 = this.iliIiiliiiii(var45);
               if (var83 == null) {
                  this.IliIliiillliIliiil = lliIliliIl<invokedynamic>() + var31.size() + lliIliliIl<invokedynamic>() + (int)var70 + lliIliliIl<invokedynamic>() + (int)(var72 >>> 32);
                  this.lilIliilIl();
                  return null;
               } else {
                  this.IliIliiillliIliiil = "";
                  this.liIIliiiliiIIliiil = var83.liiiIIllIl();
                  this.IIlIliiillIlIliiil = var83.lIiiIiIlilli();
                  this.iIlIliiilIllIliiil = var83.iliIiiliiiii();
                  this.lllIliiilillIliiil = var83.IIIllIIliIIl();
                  this.IilIliiillilIliiil = s;
                  return var83;
               }
            }
         }
      } else {
         return null;
      }
   }

   private void illIlIilIl(long tick) {
      Iterator var3 = this.ilIIliiilIiIIliiil.entrySet().iterator();

      while(var3.hasNext()) {
         if (tick >= (Long)((Map.Entry)var3.next()).getValue()) {
            var3.remove();
         }
      }

   }

   static double IIIIllIIIl(class_1937 w, class_243 feet) {
      long var9 = -1833657906447799119L;
      if (w != null && feet != null) {
         double var2 = Double.NEGATIVE_INFINITY;

         for(long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) < 4; var11 += 4294967296L) {
            double var5 = feet.field_1352 + (((int)(var11 >>> 32) & 1) == 0 ? -0.299 : 0.299);
            double var7 = feet.field_1350 + (((int)(var11 >>> 32) & 2) == 0 ? -0.299 : 0.299);
            var2 = Math.max(var2, Iiiiliiiiiii(w, new class_243(var5, feet.field_1351, var7)));
         }

         return var2;
      } else {
         return Iiiiliiiiiii(w, feet);
      }
   }

   private void IiIIlliIIl(class_2338 at, ilIlIIIlIiIlIIIl in) {
      IlliIlllllliIlll var3 = in.IilliliilIIi();
      this.iliIliiilIiiIliiil = at;
      this.liiIliiiliiiIliiil = var3 == null ? Long.MIN_VALUE : var3.Illlllllilll();
      this.IIIlliiillIIlliiil = in.IiIlliIliiIl();
      this.iIIlliiilIlIlliiil = in.IIlllIlliIll();
   }

   private static boolean iiIIlIIlIl(ilIlIIIlIiIlIIIl c, lllIIiiillIIii in) {
      IillIiillillIiil var2 = c.IliIlllilIi();
      return in.IliIlllilIi() == IiIIlillliIIlill.IIlIiilill && var2 != null && var2.Illlllllilll() != null && var2.Illlllllilll().IiIlliIliiIl(in.liiiIIllIl().method_10063(), var2.Iilllilliill());
   }

   private class_243 IiIiliIiiiIi(ilIlIIIlIiIlIIIl feet, class_243 in, double tick, long dist) {
      class_243 var7 = feet.IlIlllIlilIl();
      if (this.lllIliiilillIliiil != null && dist - this.IilIliiillilIliiil <= 10L && var7.method_1022(this.lllIliiilillIliiil) <= (double)6.0F) {
         return this.lllIliiilillIliiil;
      } else {
         class_243 var8 = IIlilIliiIli(feet.liiiIIllIl(), var7);
         if (var8 == null && tick > (double)3.5F) {
            IillIiillillIiil var9 = feet.IliIlllilIi();
            class_243 var10 = var9 != null && var9.lIiiIiIlilli() != null && var9.lIiiIiIlilli().IliIlllilIi() != null ? var9.lIiiIiIlilli().IliIlllilIi() : in;
            return new class_243(var10.field_1352, Iiiiliiiiiii(class_310.method_1551().field_1687, var10), var10.field_1350);
         } else {
            return var8;
         }
      }
   }

   private lllIIiiillIIii iliIiiliiiii(List<lllIIiiillIIii> out) {
      lllIIiiillIIii var2 = null;
      lllIIiiillIIii var3 = null;
      lllIIiiillIIii var4 = null;
      lllIIiiillIIii var5 = null;

      for(lllIIiiillIIii var7 : out) {
         if (!var7.IlIlllIlilIl() && !var7.IiIlliIliiIl()) {
            if (var4 == null || var7.lIiiIiIlilli() > var4.lIiiIiIlilli()) {
               var4 = var7;
            }
         } else {
            if (var2 == null || var7.lIiiIiIlilli() > var2.lIiiIiIlilli()) {
               var2 = var7;
            }

            if (var7.liiiIIllIl().equals(this.liIIliiiliiIIliiil) && (var3 == null || var7.lIiiIiIlilli() > var3.lIiiIiIlilli())) {
               var3 = var7;
            }

            if (var7.IlIlllIlilIl() && var7.IIillIiliIil() && (var5 == null || var7.lIiiIiIlilli() > var5.lIiiIiIlilli())) {
               var5 = var7;
            }
         }
      }

      if (var2 == null) {
         return var4;
      } else if (var5 != null && var5 != var2 && iiIiIIIlIIliIIIl.Iilllilliill(var5.Iilllilliill(), var5.Illlllllilll(), var5.iliIiiliiiii(), var5.lIiiIiIlilli(), var2.Iilllilliill(), var2.Illlllllilll(), var2.lIiiIiIlilli())) {
         return var5;
      } else if (var3 != null && var3 != var2) {
         return iiIiIIIlIIliIIIl.Iilililiiili(var3.lIiiIiIlilli(), var3.Illlllllilll(), var3.Iilllilliill(), var2.lIiiIiIlilli(), var2.Illlllllilll(), var2.Iilllilliill()) ? var2 : var3;
      } else {
         return var2;
      }
   }

   private lllIIiiillIIii IIIllIIliIIl(IIiIIiillIiIIiil armed, illIlillIilIlill c, boolean x) {
      long var32 = 3558809857455194364L;
      long var24 = -1647154671955874211L;
      long var26 = 7215622107550901149L;
      long var28 = 8216676808655082627L;
      long var30 = 9020263210143235655L;
      if (armed.IliIlllilIi() == IiIIlillliIIlill.iiIIiilill) {
         return armed.liiiIIllIl().equals(this.liIIliiiliiIIliiil) && Double.isFinite(this.IIlIliiillIlIliiil) ? new lllIIiiillIIii(IiIIlillliIIlill.iiIIiilill, armed.liiiIIllIl(), (ilIIiiiIiIIiii)null, armed.IilliliilIIi(), this.IIlIliiillIlIliiil, this.iIlIliiilIllIliiil, armed.IlIlllIlilIl(), true, false, false, false, false, false) : null;
      } else {
         var24 ^= ((long)(armed.IliIlllilIi() == IiIIlillliIIlill.liIIiilill ? 1 : 0) << 32 ^ var24) & -1L << 32;
         var24 ^= ((long)((int)iiIiIIIlIIliIIIl.IliIlllilIi(armed.IIIllIIliIIl())) ^ var24) & -1L >>> 32;
         var26 ^= ((long)((int)(var24 >>> 32) != 0 ? 0 : c.IIlllIlliIll() + (armed.IliIlllilIi() == IiIIlillliIIlill.lIlIiilill ? 1 : 0)) << 32 ^ var26) & -1L << 32;
         var26 ^= ((long)((int)(var24 >>> 32) == 0 && c.IlIlllIlilIl() && c.IiIlliIliiIl() > (int)(var26 >>> 32) ? 1 : 0) ^ var26) & -1L >>> 32;
         if ((int)var26 != 0 && x && armed.IliIlllilIi() == IiIIlillliIIlill.IIlIiilill) {
            return null;
         } else {
            iIlIIlilIllIIlil var8 = IIlllIlliIll(armed, (int)(var24 >>> 32) == 0 && c.IlIlllIlilIl() ? c.IliIlllilIi() : c.liiiIIllIl());
            if (var8 == null) {
               return null;
            } else {
               var28 ^= ((long)var8.IliIlllilIi() << 32 ^ var28) & -1L << 32;
               if ((int)(var28 >>> 32) == 0 && !lliIliliIl<invokedynamic>().equals(var8.liiiIIllIl())) {
                  return null;
               } else {
                  ilIiliilIiIiliil var10 = c.IIIllIIliIIl();
                  float var11 = var10 != null && (int)var26 == 0 && !armed.IiIlliIliiIl() ? var10.IlIlllIlilIl(var8.IilliliilIIi(), var8.lIiiIiIlilli()) : var8.IilliliilIIi();
                  float var12 = var8.IilliliilIIi();
                  float var13 = var8.iIlIlllllill();
                  var28 ^= ((long)IiIlliIliiIl(var13, c.liiiIIllIl()) ^ var28) & -1L >>> 32;
                  var30 ^= ((long)((int)var26 != 0 ? c.IiIlliIliiIl() : 0) << 32 ^ var30) & -1L << 32;
                  var30 ^= ((long)((int)(var24 >>> 32) != 0 && iiIiIIIlIIliIIIl.IlIillIiilIi(armed.lIiiIiIlilli(), c.IiIlliIliiIl(), (boolean)((int)(var28 >>> 32)), var13, (boolean)((int)var28)) ? 1 : 0) ^ var30) & -1L >>> 32;
                  if ((int)var30 != 0) {
                     iIlIIlilIllIIlil var17 = IIlllIlliIll(armed, c.IliIlllilIi());
                     if (var17 == null || !var17.IliIlllilIi()) {
                        return null;
                     }

                     var13 = var17.iIlIlllllill();
                     var12 = var17.IilliliilIIi();
                     var11 = var12;
                     var28 ^= ((long)IiIlliIliiIl(var13, c.liiiIIllIl()) ^ var28) & -1L >>> 32;
                     var30 ^= ((long)c.IiIlliIliiIl() << 32 ^ var30) & -1L << 32;
                  }

                  var32 ^= ((long)((int)var28 != 0 && !c.liiiIIllIl().Iiiiliiiiiii() ? 1 : 0) << 32 ^ var32) & -1L << 32;
                  double var18 = (int)(var24 >>> 32) != 0 ? armed.IilliliilIIi().method_23318() : (double)armed.liiiIIllIl().method_10264() + (double)1.0F;
                  if (!iiIiIIIlIIliIIIl.IIlilIliiIli(armed.IiIlliIliiIl() ? c.Illlllllilll() : c.IilliliilIIi().field_1351, armed.IiIlliIliiIl() || c.lIiiIiIlilli(), var18, var13, var11, (boolean)((int)var28), (boolean)((int)(var32 >>> 32)))) {
                     return null;
                  } else if (!iiIiIIIlIIliIIIl.IIIilIIiiIIi(armed.IliIlllilIi(), var13, var12, var11, armed.lIiiIiIlilli(), (boolean)((int)var28))) {
                     return null;
                  } else {
                     double var20 = iiIiIIIlIIliIIIl.Illillliilli(armed.IliIlllilIi(), var13, var12, var11, (boolean)((int)var28), (boolean)((int)(var32 >>> 32)), armed.lIiiIiIlilli(), Iliilliiilii(c.iliIiiliiiii(), armed.liiiIIllIl()), armed.IIIllIIliIIl(), (int)(var30 >>> 32));
                     class_243 var22 = armed.IlIlllIlilIl();
                     var32 ^= ((long)((int)(var24 >>> 32) != 0 && armed.lIiiIiIlilli() ? 1 : 0) ^ var32) & -1L >>> 32;
                     return new lllIIiiillIIii((int)var30 != 0 ? IiIIlillliIIlill.iiIIiilill : armed.IliIlllilIi(), armed.liiiIIllIl(), armed.iIlIlllllill(), armed.IilliliilIIi(), var20, var13, var22, (int)(var28 >>> 32) != 0 && (int)var30 == 0, (int)var30 != 0 && iiIiIIIlIIliIIIl.IiIiliIiiiIi(c.IiIlliIliiIl(), (int)var24), (boolean)((int)var26), (boolean)((int)var28), (boolean)((int)(var32 >>> 32)), (boolean)((int)var32));
                  }
               }
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] >>> 9 | var4[var5] << 7))) + 7571) - 31065) + 8602))) ^ 2460) ^ 'ꭞ'))) ^ var5) - 30191))))))))) + 22854) << 4 | (char)((char)(~((char)(-((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] >>> 9 | var4[var5] << 7))) + 7571) - 31065) + 8602))) ^ 2460) ^ 'ꭞ'))) ^ var5) - 30191))))))))) + 22854) >>> 12) << 12 | (char)((char)((char)(~((char)(-((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] >>> 9 | var4[var5] << 7))) + 7571) - 31065) + 8602))) ^ 2460) ^ 'ꭞ'))) ^ var5) - 30191))))))))) + 22854) << 4 | (char)((char)(~((char)(-((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] >>> 9 | var4[var5] << 7))) + 7571) - 31065) + 8602))) ^ 2460) ^ 'ꭞ'))) ^ var5) - 30191))))))))) + 22854) >>> 12) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(IiiIliliiIli defends, boolean breaching, boolean brain) {
      long var6 = 2425651196809358217L;
      if (defends == null) {
         return true;
      } else {
         iIllIliIlllIli var3 = defends.IliIlllilIi();
         iIlIIIIiIllIIIIi var4 = defends.IilliliilIIi();
         var6 ^= ((long)(var4 != iIlIIIIiIllIIIIi.IIIIiiIiil && var4 != iIlIIIIiIllIIIIi.IlIIiiIiil && var4 != iIlIIIIiIllIIIIi.iIIIiiIiil && var4 != iIlIIIIiIllIIIIi.iiiiliIiil && var4 != iIlIIIIiIllIIIIi.ilIIiiIiil ? 0 : 1) << 32 ^ var6) & -1L << 32;
         return iiIiIIIlIIliIIIl.llIIlilIIl(breaching, brain, var3 == iIllIliIlllIli.iliiIIIIIl, var3 == iIllIliIlllIli.IliiIIIIIl, (boolean)((int)(var6 >>> 32)));
      }
   }

   private static double IIiilIiiiIii(class_1309 feetY, class_243 te, class_243 feet, double centre) {
      return (double)lllIliIlillIliIl.ilIllIiIll(feetY, te.method_1022(feet), 6.0F) * iiIiIIIlIIliIIIl.Ililllililil(te.field_1351, centre);
   }

   private void llIIlilIIl(ilIlIIIlIiIlIIIl in, long tick) {
      long var8 = -9043045867212212293L;
      IlliIlllllliIlll var4 = in.IilliliilIIi();
      long var5 = var4 == null ? Long.MIN_VALUE : var4.Illlllllilll();
      var8 ^= ((long)(this.iliIliiilIiiIliiil != null && this.iliIliiilIiiIliiil.equals(this.liIIliiiliiIIliiil) && var5 == this.liiIliiiliiiIliiil && liiIIliliiiIIlil.Iilllilliill(this.IIIlliiillIIlliiil, this.iIIlliiilIlIlliiil, in.IiIlliIliiIl(), in.IIlllIlliIll()) <= (double)2.0F ? 1 : 0) << 32 ^ var8) & -1L << 32;
      this.llIlliiililIlliiil = (int)(var8 >>> 32) != 0 ? this.llIlliiililIlliiil + 1 : 0;
      this.iliIliiilIiiIliiil = null;
      if (this.llIlliiililIlliiil >= 8) {
         this.ilIIliiilIiIIliiil.put(this.liIIliiiliiIIliiil.method_10063(), tick + 20L);
         this.lilIliilIl();
         this.IIiIllIiIl();
         this.lIlIliIlIl();
      }
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) >>> 5 | (char)((char)(var4[var5] + var5) << 11 | (char)(var4[var5] + var5) >>> 5) << 11))))) ^ 13424) + var5) ^ '냿') - 'ﱈ'))))) - 27637))) - var5) - var5) ^ var5))) ^ 29807));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_243 IlIillIiilIi(class_2338 base, class_243 eye) {
      double var2 = (double)base.method_10264() + (double)1.0F;
      if (eye.field_1351 >= var2) {
         return new class_243((double)base.method_10263() + (double)0.5F, var2, (double)base.method_10260() + (double)0.5F);
      } else {
         double var4 = eye.field_1352 - ((double)base.method_10263() + (double)0.5F);
         double var6 = eye.field_1350 - ((double)base.method_10260() + (double)0.5F);
         class_2350 var8 = Math.abs(var4) >= Math.abs(var6) ? (var4 >= (double)0.0F ? class_2350.field_11034 : class_2350.field_11039) : (var6 >= (double)0.0F ? class_2350.field_11035 : class_2350.field_11043);
         return lllIliIlillIliIl.illilIilil(base, var8);
      }
   }

   static boolean IlIlllIlilIl(class_243 base, class_2338 eye) {
      return lllIliIlillIliIl.IIlilIliiIli(base, lllIliIlillIliIl.IilliliilIIi(eye)) < 2.85;
   }

   private static double Illillliilli(class_243 point, class_243 eye, ilIlIIIlIiIlIIIl in) {
      float[] var3 = ilIiiIiIii.Ililllililil(point, eye);
      return liiIIliliiiIIlil.Iilllilliill(in.IiIlliIliiIl(), in.IIlllIlliIll(), var3[0], var3[1]);
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3816199591267449201L ^ Long.rotateLeft(-9014154410109815777L, 44) ^ -500156439214903215L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3378067721220005277L ^ Long.rotateLeft(2136124102714269720L, 20) ^ 3394497237292681407L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4324035381189194444L ^ Long.rotateLeft(7305318421338057251L, 40) ^ -6752514014588037998L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2829336898280487589L ^ Long.rotateLeft(-1528414639318885878L, 56) ^ -4170514500760889399L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1382888687432064045L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8154577831821152236L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4734685521031942184L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 764282726906735420L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7177140709931984200L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -528365549107131228L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiiIlliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiiIlIIIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIIlliIIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIllllIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(ilIllIiIll<invokedynamic>());
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

   private boolean IllIllllIl(class_2338 tick, long p) {
      Long var4 = (Long)this.ilIIliiilIiIIliiil.get(tick.method_10063());
      return var4 != null && p < var4;
   }

   private IlliIiIlllliIiIl Illlllllilll(IIllIIllIllIIl h, liiilIiliiiilIil us, class_243 tick, class_243 t, double spot, iIilIiIiIlilIiIi anchoring, long feet, boolean s) {
      class_638 var11 = class_310.method_1551().field_1687;
      double var12 = us.IIlllIlliIll() ? tick.field_1351 : Iiiiliiiiiii(var11, tick);
      class_243 var14 = new class_243(tick.field_1352, var12, tick.field_1350);
      if (!(spot > (double)4.5F) && var11 != null) {
         if (s) {
            return new IlliIiIlllliIiIl(IIliIilIliIi.lIIIIlIIliIIIIlIIl, t, 0.1, false, true, Long.MIN_VALUE);
         } else {
            iIillIilIlillIil var20 = this.IlIIliiilllIIliiil.IliIlllilIi(feet, iIIlillIlIlill.IiiIlliiIl(var11), tick.field_1352, tick.field_1351, tick.field_1350, var12, t.field_1352, t.field_1351, t.field_1350, anchoring, (IIIlIilIIlIi)null, false);
            double var17 = var20 == null ? Double.NaN : Math.hypot(var20.IliIlllilIi() - tick.field_1352, var20.liiiIIllIl() - tick.field_1350);
            class_243 var16;
            if (var20 != null && iIIlillIlIlill.Iilllilliill(var20, spot, us.IIlllIlliIll()) && var17 <= (var20.IIIllIIliIIl() <= (double)-0.5F ? 3.2 : 2.6) && iiIiIIIlIIliIIIl.IiIIlliIIl(var20.IIIllIIliIIl(), var17, 2.2)) {
               var16 = new class_243(var20.IliIlllilIi(), (double)var20.lIiiIiIlilli(), var20.liiiIIllIl());
            } else {
               double[] var19 = iiIiIIIlIIliIIIl.iiIIlIIlIl(tick.field_1352, tick.field_1350, t.field_1352, t.field_1350, (double)2.5F);
               var16 = new class_243(var19[0], var12, var19[1]);
            }

            return new IlliIiIlllliIiIl(IIliIilIliIi.IiiiiIIIlliiiiIIIl, var16, (double)0.5F, spot > (double)2.0F, true, Long.MIN_VALUE, var14, iiIIllIlIIlIllIl.iIililIiIl);
         }
      } else {
         this.IlIIliiilllIIliiil.IiIlliIliiIl(lliIliliIl<invokedynamic>());
         double[] var15 = iiIiIIIlIIliIIIl.iiIIlIIlIl(tick.field_1352, tick.field_1350, t.field_1352, t.field_1350, 1.6);
         return new IlliIiIlllliIiIl(IIliIilIliIi.IiiiiIIIlliiiiIIIl, new class_243(var15[0], var12, var15[1]), (double)1.0F, true, false, Long.MIN_VALUE, var14, iiIIllIlIIlIllIl.iIililIiIl);
      }
   }

   private static ilIIiiiIiIIiii IIIilIIiiIIi(class_2338 eye, class_243 in, ilIlIIIlIiIlIIIl cell) {
      class_2338 var3 = eye.method_10074();
      return lllIliIlillIliIl.IIillIiliIil(var3, class_2350.field_11036) ? new ilIIiiiIiIIiii(var3, class_2350.field_11036) : lllIliIlillIliIl.Iiilliiliiil(eye, in, cell.IiIlliIliiIl(), cell.IIlllIlliIll(), 4.4);
   }

   private void iIIIlIlIIl(IlliIlllllliIlll tick, long snap) {
      if (tick != null && this.liIIliiiliiIIliiil != null && tick.IIillIiliIil() != null) {
         if (lIIIliiiliIIIliiil.contains(tick.IIillIiliIil())) {
            this.ilIIliiilIiIIliiil.put(this.liIIliiiliiIIliiil.method_10063(), snap + 6L);
            this.lilIliilIl();
            this.IIiIllIiIl();
         }
      }
   }

   private static iIlIIlilIllIIlil IIlllIlliIll(IIiIIiillIiIIiil c, IillIiillillIiil r) {
      iIlIIlilIllIIlil var10000;
      switch (c.IliIlllilIi()) {
         case liIIiilill -> var10000 = Ililiiillliliiil.lIiiIiIlilli(r, IlliIlillliIli.iliiIlIIIl, c.liiiIIllIl(), c.liiiIIllIl(), c.IilliliilIIi(), lllIliIlillIliIl.IiliiliIll);
         case IIlIiilill -> var10000 = Ililiiillliliiil.lIiiIiIlilli(r, IlliIlillliIli.lliiIlIIIl, c.liiiIIllIl(), c.liiiIIllIl(), (class_1511)null, lllIliIlillIliIl.IiliiliIll);
         case lIlIiilill -> var10000 = Ililiiillliliiil.lIiiIiIlilli(r.IliIlllilIi(c.iIlIlllllill()), IlliIlillliIli.IiiiIlIIIl, c.liiiIIllIl(), c.liiiIIllIl(), (class_1511)null, lllIliIlillIliIl.IiliiliIll);
         case iiIIiilill -> var10000 = null;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) ^ var5))) + '뭮') ^ '\udda7') - '藘') - var5) - '쎑'))))) << 3 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) ^ var5))) + '뭮') ^ '\udda7') - '藘') - var5) - '쎑'))))) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean Ililllililil(IiIIlillliIIlill kind) {
      return kind == IiIIlillliIIlill.IIlIiilill || kind == IiIIlillliIIlill.lIlIiilill;
   }

   private void lIlIliIlIl() {
      this.iliIliiilIiiIliiil = null;
      this.liiIliiiliiiIliiil = Long.MIN_VALUE;
      this.llIlliiililIlliiil = 0;
   }

   private static boolean IiIlliIliiIl(float r, IillIiillillIiil dealt) {
      return Float.isFinite(dealt.Iliilliiilii()) && iiIiiliIIliili.IlIlllIlilIl(r, dealt.Iliilliiilii());
   }

   static class_243 IIlilIliiIli(iIilIiIiIlilIiIi eye, class_243 spot) {
      if (eye != null && spot != null) {
         class_2338 var2 = new class_2338(eye.lIiiIiIlilli(), eye.iliIiiliiiii(), eye.IIIllIIliIIl());
         if (lllIliIlillIliIl.IIlilIliiIli(spot, lllIliIlillIliIl.IilliliilIIi(var2)) >= (double)3.0F) {
            return null;
         } else {
            return spot.field_1351 >= eye.IilliliilIIi() ? new class_243(eye.IliIlllilIi(), eye.IilliliilIIi(), eye.iIlIlllllill()) : lllIliIlillIliIl.IilliliilIIi(var2).method_1005();
         }
      } else {
         return null;
      }
   }

   private static String IIillIiliIil(String lane, lllIIiiillIIii c) {
      if (c == null) {
         return lane;
      } else {
         class_2338 var2 = c.liiiIIllIl();
         return lane + lliIliliIl<invokedynamic>() + c.IliIlllilIi().name() + (c.IlIlllIlilIl() ? lliIliliIl<invokedynamic>() : lliIliliIl<invokedynamic>()) + var2.method_10263() + lliIliliIl<invokedynamic>() + var2.method_10264() + lliIliliIl<invokedynamic>() + var2.method_10260() + (c.IIlllIlliIll() ? lliIliliIl<invokedynamic>() : "");
      }
   }
}
