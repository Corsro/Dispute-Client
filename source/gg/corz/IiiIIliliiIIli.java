package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1320;
import net.minecraft.class_1799;
import net.minecraft.class_1893;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_5134;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_746;
import net.minecraft.class_1322.class_1323;

public final class IiiIIliliiIIli {
   private int iiliiiiiiIIiiiiiii;
   private long ilIiiiiiiIiIiiiiii = Long.MIN_VALUE;
   public static final double IIIliiiiilIIliiiii = 0.05;
   public static final double IIlIiiiiilIlIiiiii = 3.4;
   private String llliiiiiiilliiiiii = IIIillIIil<invokedynamic>();
   private float IIliiiiiilIliiiiii;
   public static final int IiIliiiiiliIliiiii = 30;
   public static final String lIlliiiiiiIlliiiii = "-";
   public static final int llIliiiiiilIliiiii = 2;
   private final Object lliliiiiiililiiiii;
   private class_243 IIIIIIIIIl;
   private float liIiiiiiiiiIiiiiii;
   public static final double liIIiiiiiiiIIiiiii = (double)3.0F;
   public static final double iilIiiiiiIIiIiiiii = (double)6.0F;
   private long lIiiiiiiiiIiiiiiii = Long.MIN_VALUE;
   public static final float liiIiiiiiiiiIiiiii = 0.9F;
   private final illillIlIilillIl iiiliiiiiIIIiiiiii;
   private final iilllIiIIillIi Iiiliiiiiliiliiiii;
   public static final double iIlIiiiiiIllIiiiii = (double)2.5F;
   public static final double iIIliiiiiIlIliiiii = 2.95;
   private long lIIIIIIIIl = Long.MIN_VALUE;
   private float Iliiiiiiilliiiiiii;
   private final lIlIiIIliIlIiIIl lIIiiiiiiiIIiiiiii;
   public static final double iiIliiiiiIIlliiiii = (double)2.0F;
   public static final double iIiliiiiiIliliiiii = (double)2.0F;
   public static final double lIiIiiiiiiIiIiiiii = 0.8;
   public static final int illliiiiiIilliiiii = 8;
   public static final float ilIIiiiiiIiIIiiiii = 0.95F;
   private float iliiiiiiiIiiiiiiii;
   private int Iiliiiiiililiiiiii = -1;
   public static final double IIiliiiiilIiliiiii = (double)0.5F;
   public static final String Illliiiiilllliiiii = "los";
   public static final double iliIiiiiiIiiIiiiii = 0.45;
   public static final int lilliiiiiiilliiiii = 40;
   public static final double IliIiiiiilliIiiiii = (double)4.0F;
   private boolean iIliiiiiiIlliiiiii;
   public static final int IilIiiiiililIiiiii = 70;
   public static final double lllIiiiiiillIiiiii = 1.2;
   private final IllIilIilllIilIi IlIiiiiiillIiiiiii;
   private class_243 liiiiiiiiiiiiiiiii;

   // $FF: synthetic method
   private static CallSite lIliliIlil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) << 9 | (char)((char)(~var4[var5]) - var5) >>> 7) - var5) << 4 | (char)((char)((char)((char)(~var4[var5]) - var5) << 9 | (char)((char)(~var4[var5]) - var5) >>> 7) - var5) >>> 12) + 32442))) + '먴') + 20177))) >>> 13 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) << 9 | (char)((char)(~var4[var5]) - var5) >>> 7) - var5) << 4 | (char)((char)((char)((char)(~var4[var5]) - var5) << 9 | (char)((char)(~var4[var5]) - var5) >>> 7) - var5) >>> 12) + 32442))) + '먴') + 20177))) << 3))) + var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int Iilililiiili(class_746 p, class_1309 spec, llIlilIlilIlilIl shield, boolean e) {
      long var6 = -317295658757805095L;
      var6 ^= ((long)shield.IliIlllilIi() << 32 ^ var6) & -1L << 32;
      return !e && (int)(var6 >>> 32) >= 0 && (int)(var6 >>> 32) < 9 && lIIlliIIll((int)(var6 >>> 32)) && lIlllIliIlllIl.iIlIlllllill(p.method_31548().method_5438((int)(var6 >>> 32))) ? (int)(var6 >>> 32) : this.iIlIlllllill(spec);
   }

   // $FF: synthetic method
   private static CallSite IIIillIIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2131309158714535930L ^ Long.rotateLeft(3189840344672445225L, 63) ^ -6226802441680895580L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5711009953698059009L ^ Long.rotateLeft(2811935388086110684L, 59) ^ 4832444133111816571L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1669142387881848232L ^ Long.rotateLeft(7908307805439780712L, 55) ^ 4975689200688156971L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1661084892727851986L ^ Long.rotateLeft(958323018532952652L, 13) ^ 3265023346927428170L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5016179787065088078L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 22809049221817011L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4902125563539934794L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4026226863909043117L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8276651149026483304L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6329228407996922913L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iiIilIIlil<invokedynamic>());
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

   public boolean iliIiiliiiii(liiilIiliiiilIil t, llIlilIlilIlilIl spec, int targetReadyIn) {
      long var25 = -1089093415040148761L;
      long var27 = 3336844332660911274L;
      class_310 var4 = class_310.method_1551();
      class_746 var5 = var4.field_1724;
      if (var5 != null && var4.field_1687 != null && var4.field_1761 != null) {
         class_1309 var6 = t == null ? null : t.lIiiIiIlilli();
         if (spec != null && var6 != null && var6.method_5805() && !var6.method_31481()) {
            long var7 = IIllIIlilIllIIli.IlIlllIlilIl();
            var25 ^= ((long)(2 + (int)Math.ceil(Math.max((double)0.0F, (double)illIllilIilIllil.IIIllIIliIIl()) / (double)50.0F)) << 32 ^ var25) & -1L << 32;
            if (this.ilIiiiiiiIiIiiiiii != Long.MIN_VALUE && var7 - this.ilIiiiiiiIiIiiiiii <= (long)((int)(var25 >>> 32)) && (long)t.iIIIlIlIIl() >= var7 - this.ilIiiiiiiIiIiiiiii) {
               return this.llIIlilIIl(IIIillIIil<invokedynamic>());
            } else {
               var25 ^= ((long)IlIllllIll(t) ^ var25) & -1L >>> 32;
               var27 ^= ((long)this.Iilililiiili(var5, var6, spec, (boolean)((int)var25)) << 32 ^ var27) & -1L << 32;
               if ((int)(var27 >>> 32) < 0) {
                  return this.llIIlilIIl((int)var25 != 0 ? IIIillIIil<invokedynamic>() : IIIillIIil<invokedynamic>());
               } else {
                  class_1799 var12 = var5.method_31548().method_5438((int)(var27 >>> 32));
                  if (var12.method_7960()) {
                     return this.llIIlilIIl(IIIillIIil<invokedynamic>());
                  } else if ((int)var25 != 0 && !lIlllIliIlllIl.liiiIIllIl(var12)) {
                     return this.llIIlilIIl(IIIillIIil<invokedynamic>());
                  } else {
                     class_243 var13 = var5.method_33571();
                     class_238 var14 = var6.method_5829();
                     double var15 = lllIliIlillIliIl.IIlilIliiIli(var13, var14);
                     class_243 var17 = IIillIiliIil(var13, var14, var6, spec.IIIllIIliIIl());
                     float[] var18 = ilIiiIiIii.Ililllililil(var13, IIlllIlliIll(var17, Iilllilliill(var6), Iilllilliill(var5)));
                     IIIliIilIIliIi var19 = var15 < (double)2.5F ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii;
                     float var20 = var5.method_7261(0.5F);
                     float var21 = lllllillll(var5, var12) + Iillllilll(var12);
                     if (targetReadyIn > 0 && !IIiilIiiiIii(var21, t.llIIlilIIl(), var20)) {
                        this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70);
                        return this.llIIlilIIl(IIIillIIil<invokedynamic>());
                     } else if (!(var15 <= 2.95)) {
                        this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70);
                        return this.llIIlilIIl(IIIillIIil<invokedynamic>());
                     } else {
                        float var22 = this.Iiiliiiiiliiliiiii.IilliliilIIi();
                        float var23 = this.Iiiliiiiiliiliiiii.lIiiIiIlilli();
                        if (!IlIlllIlilIl(var13, var22, var23, var6)) {
                           float[] var24 = this.Iiiliiiiiliiliiiii.Ililllililil(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70, 8.0F);
                           return this.lilIliilIl(var6, var5.method_73189(), var22, var23, var7, var24 == null ? IIIillIIil<invokedynamic>() : IIIillIIil<invokedynamic>());
                        } else {
                           this.iiliiiiiiIIiiiiiii = 0;
                           this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var18[0], var18[1], var19, 70);
                           if (!this.iiiliiiiiIIIiiiiii.iIlIlllllill()) {
                              return this.llIIlilIIl(IIIillIIil<invokedynamic>());
                           } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.lliliiiiiililiiiii, var6)) {
                              return this.llIIlilIIl(IIIillIIil<invokedynamic>());
                           } else {
                              var27 ^= ((long)(var5.method_5624() && var20 > 0.9F ? 1 : 0) ^ var27) & -1L >>> 32;
                              if (!this.lIIiiiiiiiIIiiiiii.IiIlliIliiIl((int)(var27 >>> 32), IIllIIlilIllIIli.IlIlllIlilIl())) {
                                 return this.llIIlilIIl(IIIillIIil<invokedynamic>());
                              } else {
                                 this.IiIIlliIIl(var21, t.IlIillIiilIi(), t.IiIiliIiiiIi(), (boolean)((int)var27));
                                 return this.iiIIlIIlIl(var4, var5, var6, var13, var22, var23);
                              }
                           }
                        }
                     }
                  }
               }
            }
         } else {
            return this.llIIlilIIl(IIIillIIil<invokedynamic>());
         }
      } else {
         return this.llIIlilIIl(IIIillIIil<invokedynamic>());
      }
   }

   private boolean iiiIlIIIll(class_746 p, int slot) {
      return slot >= 0 && slot < 9 && lIIlliIIll(slot) ? iIIIlIlIIl(p.method_31548().method_5438(slot)) : false;
   }

   private static boolean IlIllllIll(liiilIiliiiilIil t) {
      return t != null && t.lIiiIiIlilli() != null && t.IIIIllIIIl() && liliIIliiiliIIli.IliIlllilIi(t.lIiiIiIlilli());
   }

   // $FF: synthetic method
   private static CallSite llIililIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) >>> 4 | (char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) << 12) + 'ﱾ') - 12575) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) >>> 4 | (char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) << 12) + 'ﱾ') - 12575) << 11) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) >>> 4 | (char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) << 12) + 'ﱾ') - 12575) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) >>> 4 | (char)((char)(~((char)((char)(var4[var5] - var5)))) << 1 | (char)(~((char)((char)(var4[var5] - var5)))) >>> 15) << 12) + 'ﱾ') - 12575) << 11) + var5) >>> 2) ^ var5) ^ '谄') + 3492) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean IllIllllIl(boolean turned, double consecutive) {
      return turned && consecutive <= (double)2.0F;
   }

   public float IlIillIiilIi() {
      return this.IIliiiiiilIliiiiii;
   }

   private boolean lilIliilIl(class_1309 why, class_243 pitch, float now, float e, long yaw, String us) {
      long var9 = -4671439788538341264L;
      var9 ^= ((long)(why.method_5628() == this.Iiliiiiiililiiiiii && IllIllllIl(this.lIiiiiiiiiIiiiiiii != Long.MIN_VALUE && yaw == this.lIiiiiiiiiIiiiiiii + 1L, liiIIliliiiIIlil.Iilllilliill(this.Iliiiiiiilliiiiiii, this.iliiiiiiiIiiiiiiii, now, e)) ? 1 : 0) << 32 ^ var9) & -1L << 32;
      this.iiliiiiiiIIiiiiiii = (int)(var9 >>> 32) != 0 ? this.iiliiiiiiIIiiiiiii + 1 : 1;
      this.Iiliiiiiililiiiiii = why.method_5628();
      this.lIiiiiiiiiIiiiiiii = yaw;
      this.Iliiiiiiilliiiiiii = now;
      this.iliiiiiiiIiiiiiiii = e;
      if (this.iiliiiiiiIIiiiiiii >= 8 && this.liiiiiiiiiiiiiiiii == null) {
         this.liiiiiiiiiiiiiiiii = why.method_73189();
         this.IIIIIIIIIl = pitch;
         this.lIIIIIIIIl = yaw;
      }

      return this.llIIlilIIl(us);
   }

   static double Iliilliiilii(double r, double width) {
      double var4 = Double.isFinite(width) && width > (double)0.0F ? width : (double)0.0F;
      double var6 = var4 * (double)0.5F - Math.min(0.1, var4 * (double)0.25F);
      return !(r > (double)0.0F) ? (double)72.0F : 0.8 * Math.toDegrees(Math.atan(var6 / r));
   }

   static float IIIIllIIIl(float armor, iiIllIlIIlllIl raw, float meleeEpf) {
      iiIllIlIIlllIl var3 = raw == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : raw;
      return iiIiiliIIliili.lIiiIiIlilli(armor, new iiIllIlIIlllIl(var3.IliIlllilIi(), var3.liiiIIllIl(), var3.iIlIlllllill(), meleeEpf, -1));
   }

   private boolean illIlIilIl(class_1309 us, class_243 e, long now) {
      if (this.liiiiiiiiiiiiiiiii != null && this.IIIIIIIIIl != null) {
         if (us.method_5628() == this.Iiliiiiiililiiiiii && !lIlIliIlIl(us.method_73189().method_1022(this.liiiiiiiiiiiiiiiii), e.method_1022(this.IIIIIIIIIl), now - this.lIIIIIIIIl)) {
            return true;
         } else {
            this.IIiIllIiIl();
            return false;
         }
      } else {
         return false;
      }
   }

   public IilliIIllilliIIl liiiIIllIl(IIllIIllIllIIl s) {
      long var22 = 4508664576294048738L;
      long var24 = -1563764697529499858L;
      long var26 = -57063174906426567L;
      long var28 = -21229403484200740L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      liiilIiliiiilIil var4 = s == null ? null : s.IiIlliIliiIl();
      if (var3 != null && var2.field_1687 != null && var4 != null && var4.lIiiIiIlilli() != null) {
         class_1309 var5 = var4.lIiiIiIlilli();
         class_243 var6 = var3.method_33571();
         double var7 = lllIliIlillIliIl.IIlilIliiIli(var6, var5.method_5829());
         if (var7 > 3.4) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<invokedynamic>());
         } else if (this.illIlIilIl(var5, var3.method_73189(), IIllIIlilIllIIli.IlIlllIlilIl())) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<invokedynamic>());
         } else {
            var22 ^= ((long)IlIllllIll(var4) << 32 ^ var22) & -1L << 32;
            var22 ^= ((long)this.iIlIlllllill(var5) ^ var22) & -1L >>> 32;
            if ((int)var22 < 0) {
               return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, (int)(var22 >>> 32) != 0 ? IIIillIIil<invokedynamic>() : IIIillIIil<invokedynamic>());
            } else {
               class_1799 var11 = var3.method_31548().method_5438((int)var22);
               var24 ^= ((long)(var3.method_31548().method_67532() == (int)var22 ? 1 : 0) << 32 ^ var24) & -1L << 32;
               var24 ^= ((long)iIlllIllll(var3, var11, (boolean)((int)(var24 >>> 32))) ^ var24) & -1L >>> 32;
               if ((int)(var22 >>> 32) != 0) {
                  return !lIlllIliIlllIl.liiiIIllIl(var11) ? IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<invokedynamic>()) : new IilliIIllilliIIl(iIlIIIIiIllIIIIi.liiiliIiil, true, (double)6.0F, (int)var24, false, false, IIIillIIil<invokedynamic>());
               } else {
                  float var14 = lllllillll(var3, var11);
                  float var15 = Iillllilll(var11);
                  iiIllIlIIlllIl var16 = var4.IlIillIiilIi() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : var4.IlIillIiilIi();
                  var26 ^= ((long)((int)var24 + IIllllIlll(s)) << 32 ^ var26) & -1L << 32;
                  float var18;
                  if (s.Iilllilliill() <= (int)(var26 >>> 32)) {
                     var18 = iIiIlIiIliIlIi.liiiIIllIl(var14, var15, 0.95F, false, var16, var4.IiIiliIiiiIi());
                  } else {
                     float var19 = iIiIlIiIliIlIi.IliIlllilIi(var14, var15, 0.95F, false);
                     float var20 = var4.llIIlilIIl();
                     float var21 = Float.isFinite(var20) ? Math.max(0.0F, var19 - var20) : 0.0F;
                     var18 = iiIiiliIIliili.lIiiIiIlilli(var21, new iiIllIlIIlllIl(var16.IliIlllilIi(), var16.liiiIIllIl(), var16.iIlIlllllill(), var4.IiIiliIiiiIi(), -1));
                  }

                  float var30 = var4.Illillliilli() > 0.0F && Float.isFinite(var4.Illillliilli()) ? var4.Illillliilli() : 1.0F;
                  var26 ^= ((long)(var18 * var30 >= var4.IliIlllilIi() ? 1 : 0) ^ var26) & -1L >>> 32;
                  var28 ^= ((long)((int)var26 == 0 || !var4.IllIllllIl() && var4.Iilililiiili() ? 0 : 1) << 32 ^ var28) & -1L << 32;
                  return new IilliIIllilliIIl(iIlIIIIiIllIIIIi.liiiliIiil, true, (double)var18, (int)var24, (boolean)((int)var26), (boolean)((int)(var28 >>> 32)), (int)(var24 >>> 32) != 0 ? IIIillIIil<invokedynamic>() : IIIillIIil<invokedynamic>());
               }
            }
         }
      } else {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.liiiliIiil, IIIillIIil<invokedynamic>());
      }
   }

   static float lllllillll(class_746 p, class_1799 weapon) {
      double var2 = p.method_45326(class_5134.field_23721);
      double var4 = p.method_45325(class_5134.field_23721) - var2 - iilllIIill(p.method_6047(), class_5134.field_23721);
      return (float)Math.max((double)0.0F, var2 + iilllIIill(weapon, class_5134.field_23721) + var4);
   }

   // $FF: synthetic method
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) << 12) << 8 | (char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) << 12) >>> 8) - 15446) - var5) << 11 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) << 12) << 8 | (char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 26847) ^ '\uda43') + 29777))) + 6440) << 12) >>> 8) - 15446) - var5) >>> 5))) + var5) ^ var5) + var5) + '\ud915'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill(class_1309 t) {
      long var5 = 123380353829248038L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      if (var3 == null) {
         return -1;
      } else {
         if (t != null && liliIIliiiliIIli.IliIlllilIi(t)) {
            var5 ^= ((long)this.lIIiiiiiiiIIiiiiii.IilliliilIIi(lIlllIliIlllIl::liiiIIllIl, false) << 32 ^ var5) & -1L << 32;
            if ((int)(var5 >>> 32) >= 0) {
               return (int)(var5 >>> 32);
            }
         }

         var5 ^= ((long)lIlllIliIlllIl.IiIlliIliiIl(-1) << 32 ^ var5) & -1L << 32;
         return (int)(var5 >>> 32) >= 0 && lIIlliIIll((int)(var5 >>> 32)) ? (int)(var5 >>> 32) : this.lIIiiiiiiiIIiiiiii.IilliliilIIi(lIlllIliIlllIl::iIlIlllllill, false);
      }
   }

   public boolean IilliliilIIi(class_1309 wantCrit, boolean t) {
      long var13 = 10514414875232262L;
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1687 != null && var3.field_1761 != null && wantCrit != null && wantCrit.method_5805()) {
         var13 ^= ((long)this.iIlIlllllill(wantCrit) << 32 ^ var13) & -1L << 32;
         if ((int)(var13 >>> 32) < 0) {
            return false;
         } else {
            class_243 var6 = var4.method_33571();
            class_238 var7 = wantCrit.method_5829();
            if (!this.lIIiiiiiiiIIiiiiii.lIiiIiIlilli((int)(var13 >>> 32), false)) {
               this.lliIliliIl(var6, liIlliiIll(var7), IIIliIilIIliIi.lilIIiliiiilIIilii);
               return false;
            } else {
               class_243 var8 = lllIliIlillIliIl.IIIIllIIIl(var7, wantCrit, var6, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli(), 2.95, 0.1);
               if (var8 == null) {
                  var8 = liIlliiIll(var7);
               }

               double var9 = lllIliIlillIliIl.IIlilIliiIli(var6, var7);
               this.lliIliliIl(var6, IIlllIlliIll(var8, Iilllilliill(wantCrit), Iilllilliill(var4)), var9 < (double)2.5F ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii);
               if (!this.iiiliiiiiIIIiiiiii.iIlIlllllill()) {
                  return false;
               } else if (var4.method_7261(0.5F) < 0.95F) {
                  return false;
               } else if (t && !ilIllIiIll(var4)) {
                  return false;
               } else if (!IlIlllIlilIl(var6, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli(), wantCrit)) {
                  return false;
               } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.lliliiiiiililiiiii, wantCrit)) {
                  return false;
               } else {
                  class_1799 var11 = var4.method_31548().method_5438((int)(var13 >>> 32));
                  float var12 = var4.method_7261(0.5F);
                  this.IiIIlliIIl(lllllillll(var4, var11) + Iillllilll(var11), lllIliIlillIliIl.iiiIlIIIll(wantCrit), lllIliIlillIliIl.iIiIlIliIl(wantCrit), var4.method_5624() && var12 > 0.9F);
                  return this.iiIIlIIlIl(var3, var4, wantCrit, var6, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli());
               }
            }
         }
      } else {
         return false;
      }
   }

   private static class_243 Iilllilliill(class_1297 e) {
      return e == null ? class_243.field_1353 : Illlllllilll(e.method_23317(), e.method_23318(), e.method_23321(), e.field_6014, e.field_6036, e.field_5969);
   }

   // $FF: synthetic method
   private static CallSite iiIilIIlil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') << 7) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') << 7) >>> 7) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') << 7) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)(~var4[var5]) >>> 12 | (char)(~var4[var5]) << 4) - var5) ^ var5))) << 11) + '텎') - var5) ^ var5) + 'ퟸ') - '镣') << 7) >>> 7) ^ var5) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean Ililllililil(class_243 e, class_243 eye, class_1309 to) {
      float[] var3 = ilIiiIiIii.Ililllililil(e, eye);
      return IlIlllIlilIl(e, var3[0], var3[1], to);
   }

   public static boolean IiIlliIliiIl(class_238 dir, class_243 box, class_243 eye, double reach) {
      return dir != null && box != null && eye != null ? liiIIliliiiIIlil.Iilililiiili(dir, box, box.method_1019(eye.method_1021(Math.max((double)0.0F, reach))), 0.1) : false;
   }

   public long Iiilliiliiil() {
      return this.ilIiiiiiiIiIiiiiii;
   }

   static class_243 Iiiiliiiiiii(class_238 box) {
      class_243 var1 = box.method_1005();
      return new class_243(var1.field_1352, Math.min(box.field_1325 - 0.1, box.field_1322 + 0.45), var1.field_1350);
   }

   private boolean iiIIlIIlIl(class_310 mc, class_746 t, class_1309 p, class_243 yaw, float pitch, float eye) {
      if (!iIIIlIlIIl(t.method_6047())) {
         return this.llIIlilIIl(IIIillIIil<invokedynamic>());
      } else {
         double var7 = this.iIiIlIliIl(t, p, yaw, pitch, eye);
         mc.field_1761.method_2918(t, p);
         t.method_6104(class_1268.field_5808);
         if (this.IlIiiiiiillIiiiiii != null) {
            this.IlIiiiiiillIiiiiii.Illlllllilll(var7, (double)3.0F, true);
         }

         this.ilIiiiiiiIiIiiiiii = IIllIIlilIllIIli.IlIlllIlilIl();
         this.llliiiiiiilliiiiii = IIIillIIil<invokedynamic>();
         this.IIiIllIiIl();
         return true;
      }
   }

   private int IiiIlliiIl(class_746 planned, int fallback, int p) {
      if (this.iiiIlIIIll(planned, fallback)) {
         return fallback;
      } else {
         return this.iiiIlIIIll(planned, p) ? p : -1;
      }
   }

   static boolean IIiilIiiiIii(float lastScaledTaken, float charge, float raw) {
      return iliiiillIiiiiill.iIiilIliil(lastScaledTaken, charge) && raw >= 0.9F;
   }

   static class_243 Illlllllilll(double lastX, double z, double lastY, double x, double lastZ, double y) {
      double var12 = lastX - x;
      double var14 = z - lastZ;
      double var16 = lastY - y;
      double var18 = var12 * var12 + var14 * var14 + var16 * var16;
      return Double.isFinite(var18) && !(var18 > (double)4.0F) ? new class_243(var12, var14, var16) : class_243.field_1353;
   }

   private static int IIllllIlll(IIllIIllIllIIl s) {
      double var1 = s.IlIlllIlilIl() == null ? (double)0.0F : s.IlIlllIlilIl().IIiIllIiIl();
      return (int)Math.ceil(Math.max((double)0.0F, Double.isFinite(var1) ? var1 : (double)0.0F) / (double)50.0F);
   }

   private static double Ilillllill(double x) {
      return (x % (double)360.0F + (double)540.0F) % (double)360.0F - (double)180.0F;
   }

   private static boolean lIilliIill(class_6880<class_1320> b, class_6880<class_1320> a) {
      if (b == a) {
         return true;
      } else {
         Optional var2 = a.method_40230();
         return var2.isPresent() && b.method_40225((class_5321)var2.get());
      }
   }

   private void lliIliliIl(class_243 eye, class_243 speed, IIIliIilIIliIi point) {
      float[] var4 = ilIiiIiIii.Ililllililil(eye, speed);
      this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var4[0], var4[1], point, 70);
   }

   public static boolean IliIlllilIi(boolean targetGrounded, float strictRay, boolean targetReadyIn, boolean yawTolerance, boolean requireGrounded, boolean yawError, int sprintVariant, double slotStable, double charge, boolean serverSprinting) {
      boolean var10000;
      if (targetGrounded && strictRay >= 0.95F) {
         label35: {
            if (targetReadyIn) {
               if (!yawTolerance) {
                  break label35;
               }
            } else if (yawTolerance) {
               break label35;
            }

            if ((!yawError || requireGrounded) && sprintVariant <= 0 && slotStable <= charge && serverSprinting) {
               var10000 = true;
               return var10000;
            }
         }
      }

      var10000 = false;
      return var10000;
   }

   static float Iillllilll(class_1799 weapon) {
      long var2 = -3724135970496240051L;
      var2 ^= ((long)lIlllIliIlllIl.lIiiIiIlilli(weapon, class_1893.field_9118) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) > 0 ? 0.5F * (float)((int)(var2 >>> 32)) + 0.5F : 0.0F;
   }

   public boolean IiIiliIiiiIi() {
      return this.iIliiiiiiIlliiiiii;
   }

   static boolean lIlIliIlIl(double himMoved, double usMoved, long held) {
      if (!Double.isNaN(himMoved) && !Double.isNaN(usMoved)) {
         return himMoved >= (double)0.5F || usMoved >= (double)0.5F || held < 0L || held >= 40L;
      } else {
         return true;
      }
   }

   private void IiIIlliIIl(float meleeEpf, iiIllIlIIlllIl sprintHit, float armor, boolean raw) {
      this.liIiiiiiiiiIiiiiii = Float.isFinite(meleeEpf) ? Math.max(0.0F, meleeEpf) : 0.0F;
      this.IIliiiiiilIliiiiii = IIIIllIIIl(this.liIiiiiiiiiIiiiiii, sprintHit, armor);
      this.iIliiiiiiIlliiiiii = raw;
   }

   public String IIlilIliiIli() {
      return this.llliiiiiiilliiiiii;
   }

   private static boolean ilIllIiIll(class_746 p) {
      return !p.method_24828() && p.field_6017 > (double)0.0F && p.method_18798().field_1351 < (double)0.0F && !p.method_5624() && !p.method_5799() && !p.method_6101() && !p.method_5765();
   }

   public IiiIIliliiIIli(Object aim, iilllIiIIillIi gates, illillIlIilillIl slots, lIlIiIIliIlIiIIl audit, IllIilIilllIilIi owner) {
      this.lliliiiiiililiiiii = aim;
      this.Iiiliiiiiliiliiiii = gates;
      this.iiiliiiiiIIIiiiiii = slots;
      this.lIIiiiiiiiIIiiiiii = audit;
      this.IlIiiiiiillIiiiiii = owner;
   }

   private void IIiIllIiIl() {
      this.iiliiiiiiIIiiiiiii = 0;
      this.lIiiiiiiiiIiiiiiii = Long.MIN_VALUE;
      this.liiiiiiiiiiiiiiiii = null;
      this.IIIIIIIIIl = null;
      this.lIIIIIIIIl = Long.MIN_VALUE;
   }

   static boolean iIIIlIlIIl(class_1799 held) {
      return held != null && !held.method_7960() && (lIlllIliIlllIl.iIlIlllllill(held) || lIlllIliIlllIl.liiiIIllIl(held));
   }

   private static double iilllIIill(class_1799 s, class_6880<class_1320> attribute) {
      if (s != null && !s.method_7960()) {
         double[] var2 = new double[1];
         s.method_57354(class_1304.field_6173, (mod, attributex) -> {
            if (lIilliIill(mod, attribute) && attributex.comp_2450() == class_1323.field_6328) {
               var2[0] += attributex.comp_2449();
            }

         });
         return var2[0];
      } else {
         return (double)0.0F;
      }
   }

   private boolean llIIlilIIl(String why) {
      this.llliiiiiiilliiiiii = why;
      return false;
   }

   static class_243 IIlllIlliIll(class_243 targetStep, class_243 selfStep, class_243 goal) {
      if (targetStep == null) {
         return null;
      } else {
         class_243 var3 = selfStep == null ? class_243.field_1353 : selfStep;
         class_243 var4 = goal == null ? class_243.field_1353 : goal;
         return targetStep.method_1019(var3.method_1020(var4));
      }
   }

   private static boolean lIIlliIIll(int slot) {
      long var4 = -1534830790846192623L;
      boolean[] var1 = new boolean[9];
      boolean[] var2 = new boolean[9];

      for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
         var1[(int)(var6 >>> 32)] = IIIIilIilIIIilIi.ilIllIiIll((int)(var6 >>> 32));
         var2[(int)(var6 >>> 32)] = IIIIilIilIIIilIi.iiiIlIIIll((int)(var6 >>> 32));
      }

      return !liillIlliiillIll.iIlIlllllill(slot, IIIIilIilIIIilIi.IlIllllIll(), var1, var2, false);
   }

   public static boolean IlIlllIlilIl(class_243 yaw, float eye, float e, class_1309 pitch) {
      return lllIliIlillIliIl.Ilillllill(yaw, eye, e, pitch, 2.95, 2.95);
   }

   private double iIiIlIliIl(class_746 eye, class_1309 p, class_243 yaw, float t, float pitch) {
      class_238 var6 = p.method_5829();
      if (var6.method_1006(yaw)) {
         return (double)0.0F;
      } else {
         class_243 var7 = eye.method_5631(pitch, t);
         Optional var8 = var6.method_992(yaw, yaw.method_1019(var7.method_1021((double)4.0F)));
         Objects.requireNonNull(yaw);
         return (Double)var8.map(yaw::method_1022).orElseGet(() -> lllIliIlillIliIl.IIlilIliiIli(yaw, var6));
      }
   }

   private static class_243 IIillIiliIil(class_243 e, class_238 eye, class_1309 box, class_243 hint) {
      long var13 = 7438310098191997630L;
      long var15 = -4225233933356389120L;
      var13 ^= ((long)(lllIliIlillIliIl.IIlilIliiIli(e, eye) <= 2.95 ? 1 : 0) << 32 ^ var13) & -1L << 32;
      if ((int)(var13 >>> 32) != 0 && hint != null && Ililllililil(e, hint, box)) {
         return hint;
      } else {
         class_243 var5 = eye.method_1005();
         double[][] var6 = iliiiillIiiiiill.liIIiiiIIi(eye.field_1323, eye.field_1322, eye.field_1321, eye.field_1320, eye.field_1325, eye.field_1324, var5.field_1352 - e.field_1352, var5.field_1350 - e.field_1350);
         class_243 var7 = null;
         double[][] var8 = var6;
         var13 ^= ((long)var6.length ^ var13) & -1L >>> 32;

         for(long var19 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var19 >>> 32) < (int)var13; var19 += 4294967296L) {
            double[] var11 = var8[(int)(var19 >>> 32)];
            class_243 var12 = new class_243(var11[0], var11[1], var11[2]);
            if ((int)(var13 >>> 32) != 0 && Ililllililil(e, var12, box)) {
               return var12;
            }

            if (var7 == null || e.method_1025(var12) < e.method_1025(var7)) {
               var7 = var12;
            }
         }

         return var7 != null ? var7 : (hint != null ? hint : Iiiiliiiiiii(eye));
      }
   }

   private static int iIlllIllll(class_746 p, class_1799 weapon, boolean selected) {
      double var3 = (double)4.0F + iilllIIill(weapon, class_5134.field_23723);
      double var5 = var3 > (double)0.0F ? (double)20.0F / var3 : (double)20.0F;
      if (!selected) {
         return 1 + (int)Math.ceil((double)0.95F * var5);
      } else {
         float var7 = p.method_7261(0.5F);
         return var7 >= 0.95F ? 0 : (int)Math.ceil((double)(0.95F - var7) * var5);
      }
   }

   public boolean IIIllIIliIIl(liiilIiliiiilIil targetReadyIn, int t) {
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      class_1309 var5 = targetReadyIn == null ? null : targetReadyIn.lIiiIiIlilli();
      if (var4 != null && var3.field_1687 != null && var5 != null && var5.method_5805() && !var5.method_31481()) {
         if (t <= 2 && !this.Iiiliiiiiliiliiiii.IiIiliIiiiIi()) {
            class_243 var6 = var4.method_33571();
            class_238 var7 = var5.method_5829();
            double var8 = lllIliIlillIliIl.IIlilIliiIli(var6, var7);
            if (var8 <= 3.4 && this.iIlIlllllill(var5) >= 0) {
               class_243 var10 = IIillIiliIil(var6, var7, var5, (class_243)null);
               float[] var11 = ilIiiIiIii.Ililllililil(var6, IIlllIlliIll(var10, Iilllilliill(var5), Iilllilliill(var4)));
               this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var11[0], var11[1], var8 < (double)2.5F ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii, 30);
               return true;
            } else {
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public float IIIilIIiiIIi() {
      return this.liIiiiiiiiiIiiiiii;
   }

   public boolean lIiiIiIlilli(liiilIiliiiilIil t, llIlilIlilIlilIl spec, lllliIilillliIil targetReadyIn, int sprint) {
      long var34 = -4646774400264392213L;
      long var36 = 200707901567476448L;
      class_310 var5 = class_310.method_1551();
      class_746 var6 = var5.field_1724;
      if (var6 != null && var5.field_1687 != null && var5.field_1761 != null && t != null && spec != null) {
         class_1309 var7 = t.lIiiIiIlilli();
         if (var7 != null && var7.method_5805() && !var7.method_31481()) {
            if (IlIllllIll(t)) {
               this.IilliliilIIi(var7, false);
               return false;
            } else {
               var34 ^= ((long)this.IiiIlliiIl(var6, spec.IliIlllilIi(), this.iIlIlllllill(var7)) << 32 ^ var34) & -1L << 32;
               class_243 var9 = var6.method_33571();
               class_238 var10 = var7.method_5829();
               if ((int)(var34 >>> 32) < 0) {
                  this.lliIliliIl(var9, liIlliiIll(var10), IIIliIilIIliIi.lilIIiliiiilIIilii);
                  return this.llIIlilIIl(IIIillIIil<invokedynamic>());
               } else {
                  class_243 var11 = var10.method_1005();
                  double var12 = var11.field_1352 - var9.field_1352;
                  double var14 = var11.field_1350 - var9.field_1350;
                  double var16 = Math.sqrt(var12 * var12 + var14 * var14);
                  float var18 = IlliiIIlllliiIIl.iIlIlllllill(var12, var14);
                  double var19 = Iliilliiilii(var16, Math.min(var10.method_17939(), var10.method_17941()));
                  double var21 = Math.max(-var19, Math.min(var19, Ilillllill((double)(spec.iIlIlllllill() - var18))));
                  float var23 = (float)((double)var18 + var21);
                  class_243 var24 = liIlliiIll(var10);
                  float var25 = ilIiiIiIii.Ililllililil(var9, var24)[1];
                  IIIliIilIIliIi var26 = var16 < (double)2.5F ? IIIliIilIIliIi.IIiIIiliilIiIIilii : IIIliIilIIliIi.lilIIiliiiilIIilii;
                  if (!this.lIIiiiiiiiIIiiiiii.lIiiIiIlilli((int)(var34 >>> 32), false)) {
                     this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var23, var25, var26, 70);
                     return false;
                  } else {
                     this.Iiiliiiiiliiliiiii.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var23, var25, var26, 70);
                     float var27 = var6.method_7261(0.5F);
                     var34 ^= ((long)(targetReadyIn != null && targetReadyIn.IilliliilIIi() ? 1 : 0) ^ var34) & -1L >>> 32;
                     double var29 = Math.abs(Ilillllill((double)(this.Iiiliiiiiliiliiiii.IilliliilIIi() - spec.iIlIlllllill())));
                     var36 ^= ((long)this.iiiliiiiiIIIiiiiii.IlIlllIlilIl((int)(var34 >>> 32)) << 32 ^ var36) & -1L << 32;
                     if (!IliIlllilIi((boolean)((int)(var36 >>> 32)), var27, spec.liiiIIllIl(), (boolean)((int)var34), t.IIlllIlliIll(), spec.lIiiIiIlilli(), sprint, var29, (double)spec.IilliliilIIi(), true)) {
                        return false;
                     } else if (!this.iiiliiiiiIIIiiiiii.iIlIlllllill()) {
                        return false;
                     } else {
                        var36 ^= ((long)IlIlllIlilIl(var9, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli(), var7) ^ var36) & -1L >>> 32;
                        if (!IliIlllilIi((boolean)((int)(var36 >>> 32)), var27, spec.liiiIIllIl(), (boolean)((int)var34), t.IIlllIlliIll(), spec.lIiiIiIlilli(), sprint, var29, (double)spec.IilliliilIIi(), (boolean)((int)var36))) {
                           return false;
                        } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.lliliiiiiililiiiii, var7)) {
                           return false;
                        } else {
                           class_1799 var33 = var6.method_31548().method_5438((int)(var34 >>> 32));
                           this.IiIIlliIIl(lllllillll(var6, var33) + Iillllilll(var33), t.IlIillIiilIi(), t.IiIiliIiiiIi(), (int)var34 != 0 && var27 > 0.9F);
                           return this.iiIIlIIlIl(var5, var6, var7, var9, this.Iiiliiiiiliiliiiii.IilliliilIIi(), this.Iiiliiiiiliiliiiii.lIiiIiIlilli());
                        }
                     }
                  }
               }
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void Illillliilli() {
      this.llliiiiiiilliiiiii = IIIillIIil<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IiIilliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) << 10) + var5) + 21441) ^ 8887) - var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) << 10) + var5) + 21441) ^ 8887) - var5) >>> 13))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) << 10) + var5) + 21441) ^ 8887) - var5) << 3 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ 1817) + 'ꫭ'))) << 10) + var5) + 21441) ^ 8887) - var5) >>> 13))) << 3) - 25938));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_243 liIlliiIll(class_238 box) {
      class_243 var1 = box.method_1005();
      return new class_243(var1.field_1352, Math.min(box.field_1325 - 0.1, box.field_1322 + 1.2), var1.field_1350);
   }
}
