package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_243;

public final class iIIIllilIlIIllil implements Iiliiililiii {
   private iIllIlllIlllIlll iIiiIliIil;
   private List<iillIilIIilIil> llliIliIil;
   private long iiliIliIil;
   private boolean iIIIlliIil;
   private double IIiiIliIil;
   private static final double[] iIilIliIil = new double[]{(double)0.0F, (double)45.0F, (double)-45.0F};
   private final boolean iiilIliIil;
   private boolean iiIiIliIil;
   private boolean IllIlliIil;
   private ilIIlIilIiIIlIil lIiiIliIil;
   private int IiiiIliIil;
   private int lliiIliIil;
   private iiilllIIIill lIliIliIil;
   private boolean lIIIlliIil;
   private iiilllIIIill illiIliIil;
   private static final int IlilIliIil = 20;
   private final llIiililIiil IiilIliIil;
   private long iiIIlliIil;
   int IlIiIliIil;
   private class_243 lIlIlliIil;
   private final iilIiiIIiIii liilIliIil;
   private double liiiIliIil;
   private long illIlliIil;
   private final IlIIlIilllIIlIil ililIliIil;
   private lIlIilIiiIlIilIi llIiIliIil;
   private long IlliIliIil;
   private long llIIlliIil;
   private double liIiIliIil;
   private long IIlIlliIil;
   private boolean IlIIlliIil;
   private final iiliillIIiiill IIIiIliIil;
   private int iliiIliIil;
   private static final double lIilIliIil = (double)1.5F;
   private illiIiIlIiliIiIl IiIIlliIil;
   private int ilIiIliIil;
   private boolean IliiIliIil;
   private iiIIllIlIIlIllIl liliIliIil;
   private class_243 IilIlliIil;
   private int IIIIlliIil;
   private long lilIlliIil;
   private boolean IIliIliIil;
   private long iiiiIliIil;
   private static final double IIilIliIil = (double)0.25F;
   private long iIliIliIil;
   private class_243 IiliIliIil;
   int iIIiIliIil;
   private static final int iillIliIil = 5;
   private final Long2LongOpenHashMap lIIiIliIil;
   private double liIIlliIil;
   private class_243 iilIlliIil;
   private iiIIllIlIIlIllIl iIlIlliIil;
   private static final int llilIliIil = 4;
   private boolean lllIlliIil;
   private float IiIiIliIil;
   private long ilIIlliIil;

   // $FF: synthetic method
   private static CallSite ilillIiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8437604161315212471L ^ Long.rotateLeft(6877349912265388570L, 52) ^ -2324141345423160156L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2185621188302901314L ^ Long.rotateLeft(1724624550534248451L, 6) ^ 520430839299362832L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -168822580668485279L ^ Long.rotateLeft(-6182848041699923417L, 23) ^ -6935680980690536794L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7225672538908994135L ^ Long.rotateLeft(2526367565982670563L, 39) ^ 6718604813349356058L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6094399466224397691L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2036885353730830857L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4326769027315550316L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7110605491298857937L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6462965128296235724L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2652202476472264270L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liilliiill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIillIIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIIilIlIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, llIililIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIilliIil<invokedynamic>());
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

   private lIiiiIlliIiiiIll Illlllllilll() {
      return new lIiiiIlliIiiiIll(this.ilIiIliIil, this.IiIiIliIil, this.llIiIliIil.iIlIlllllill(), this.llIiIliIil.IilliliilIIi(), this.llIiIliIil.lIiiIiIlilli(), this.iiIiIliIil, this.IIliIliIil, this.liIiIliIil, 32, 24, this.IlIiIliIil);
   }

   // $FF: synthetic method
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 2 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 14) + var5))) >>> 14 | (char)(-((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 2 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 14) + var5))) << 2) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 2 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 14) + var5))) >>> 14 | (char)(-((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 2 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 14) + var5))) << 2) ^ var5) << 15) + 'ꁟ'))) + var5) - '貚') - 28621))))) ^ 15888) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private illiIiIlIiliIiIl IiIIlliIIl(class_243 pos, iIllIlllIlllIlll target) {
      long var32 = -3886572065791994818L;
      class_243 var3 = lIlIliIlIl(target, pos);
      if (var3 == null) {
         return new illiIiIlIiliIiIl(false, (double)0.0F, (double)0.0F, false, false, false, false, 0, (double)0.0F, (iIIIliIlIIli)null);
      } else {
         double var4 = var3.field_1352 - pos.field_1352;
         double var6 = var3.field_1350 - pos.field_1350;
         double var8 = Math.hypot(var4, var6);
         if (var8 < 0.001) {
            return new illiIiIlIiliIiIl(false, (double)0.0F, (double)0.0F, false, false, false, false, 0, (double)0.0F, (iIIIliIlIIli)null);
         } else {
            double var10 = var4 / var8;
            double var12 = var6 / var8;
            double var14 = Math.min(var8, (double)1.5F);
            double[] var16 = iIilIliIil;
            var32 ^= ((long)var16.length << 32 ^ var32) & -1L << 32;

            for(long var35 = var32 ^ (0L ^ var32) & -1L >>> 32; (int)var35 < (int)(var35 >>> 32); var35 ^= (var35 ^ var35 + (long)1) & -1L >>> 32) {
               double var19 = var16[(int)var35];
               double var21 = Math.toRadians(var19);
               double var23 = Math.cos(var21);
               double var25 = Math.sin(var21);
               double var27 = var10 * var23 - var12 * var25;
               double var29 = var10 * var25 + var12 * var23;
               class_243 var31 = new class_243(pos.field_1352 + var27 * var14, pos.field_1351, pos.field_1350 + var29 * var14);
               if (iiliillIIiiill.lIiiIiIlilli(this.ililIliIil, pos, var31, true, (double)1.5F, Math.min(this.ilIiIliIil, 1))) {
                  return new illiIiIlIiliIiIl(true, var27, var29, false, false, false, false, 0, var8, iIIIliIlIIli.illlilIIlIillilIIl);
               }
            }

            return new illiIiIlIiliIiIl(false, (double)0.0F, (double)0.0F, false, false, false, false, 0, var8, (iIIIliIlIIli)null);
         }
      }
   }

   public void lilIliilIl(long tick) {
      if (!this.iiilIliIil) {
         this.iIliIliIil = Math.max(this.iIliIliIil, tick);
         this.ilIIlliIil = tick + 60L;
         if (this.llIIlliIil == Long.MIN_VALUE) {
            this.llIIlliIil = tick;
         }

         this.lIIIlliIil = true;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIillIIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) >>> 4 | (char)(var4[var5] >>> 15 | var4[var5] << 1) << 12))))) - 8034) << 7 | (char)((char)(-((char)(-((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) >>> 4 | (char)(var4[var5] >>> 15 | var4[var5] << 1) << 12))))) - 8034) >>> 9) ^ '씙'))))) - var5) - var5))) - 26249));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_243 lIlIliIlIl(iIllIlllIlllIlll pos, class_243 target) {
      class_243 var2 = pos.lIiiIiIlilli();
      if (var2 != null && Double.isFinite(var2.field_1352) && Double.isFinite(var2.field_1350)) {
         return !Double.isFinite(var2.field_1351) ? new class_243(var2.field_1352, target.field_1351, var2.field_1350) : var2;
      } else {
         return null;
      }
   }

   public boolean Iilllilliill(long goal, class_243 tick, iIllIlllIlllIlll pos) {
      this.iIliIliIil = goal;
      if (this.iiilIliIil) {
         this.lIliIliIil = iiilllIIIill.lillllIiiillllIi;
         return true;
      } else if (tick != null && Iillllilll(tick) && pos != null && pos.iliIiiliiiii() != null) {
         iIllIlllIlllIlll var5 = this.iiiIlIIIll(goal, pos);
         class_243 var6 = lIlIliIlIl(var5, tick);
         if (var6 == null) {
            return false;
         } else if (!this.IIillIiliIil(goal, tick, var5, var6)) {
            return false;
         } else {
            this.lIliIliIil = iiilllIIIill.lillllIiiillllIi;
            this.liIIlliIil = Math.hypot(var6.field_1352 - tick.field_1352, var6.field_1350 - tick.field_1350) * 3.6;
            this.lIiiIliIil = null;
            this.iIiiIliIil = null;
            this.llliIliIil = null;
            this.illiIliIil = iiilllIIIill.illlllIiIillllIi;
            this.IiliIliIil = null;
            this.liliIliIil = null;
            this.IIiiIliIil = Double.NaN;
            this.IIIiIliIil.liiiIIllIl();
            this.IiIIlliIil = null;
            this.IlIIlliIil = false;
            this.lIIIlliIil = false;
            this.iIIIlliIil = false;
            if (goal >= this.ilIIlliIil) {
               this.llIIlliIil = Long.MIN_VALUE;
            }

            return true;
         }
      } else {
         return false;
      }
   }

   public int[] iIiIlIliIl() {
      long var4 = 151512561062266168L;
      List var1 = this.llliIliIil;
      if (!this.iiilIliIil && var1 != null) {
         var4 ^= ((long)this.IIIiIliIil.iIlIlllllill() << 32 ^ var4) & -1L << 32;
         if ((int)(var4 >>> 32) < 1) {
            var4 ^= ((long)Math.min(1, var1.size() - 1) << 32 ^ var4) & -1L << 32;
         }

         if ((int)(var4 >>> 32) >= 0 && (int)(var4 >>> 32) < var1.size()) {
            iillIilIIilIil var3 = (iillIilIIilIil)var1.get((int)(var4 >>> 32));
            return new int[]{var3.iIlIlllllill(), var3.IilliliilIIi(), var3.lIiiIiIlilli()};
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   iIllIlllIlllIlll iiiIlIIIll(long tick, iIllIlllIlllIlll t) {
      if (t != null && t.IIIllIIliIIl() == iiIIllIlIIlIllIl.iIililIiIl && t.iliIiiliiiii() != null) {
         class_243 var4 = this.IilIlliIil;
         if (var4 != null && tick < this.illIlliIil && tick >= this.illIlliIil - 60L) {
            return !(var4.method_1022(t.iliIiiliiiii()) <= (double)2.0F) ? t : iIllIlllIlllIlll.liiiIIllIl(t.iliIiiliiiii(), t.IlIlllIlilIl());
         } else {
            return t;
         }
      } else {
         return t;
      }
   }

   // $FF: synthetic method
   private static CallSite llIililIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - '\ue4a5') ^ 13733) - var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)(var4[var5] - '\ue4a5') ^ 13733) - var5) ^ var5))) << 10) + 31390) >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - '\ue4a5') ^ 13733) - var5) ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)(var4[var5] - '\ue4a5') ^ 13733) - var5) ^ var5))) << 10) + 31390) << 13) ^ var5) - var5))))) - var5))) + 18880) - '똞'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   boolean iIlllIllll() {
      return this.lIiiIliIil != null;
   }

   private static illiIiIlIiliIiIl iiIIlIIlIl(class_243 target, iIllIlllIlllIlll pos) {
      class_243 var2 = pos == null ? null : pos.lIiiIiIlilli();
      if (target != null && var2 != null) {
         double var3 = var2.field_1352 - target.field_1352;
         double var5 = var2.field_1350 - target.field_1350;
         double var7 = Math.hypot(var3, var5);
         return !(var7 > 0.001) ? new illiIiIlIiliIiIl(false, (double)0.0F, (double)0.0F, false, false, true, false, 0, (double)0.0F, iIIIliIlIIli.illlilIIlIillilIIl) : new illiIiIlIiliIiIl(true, var3 / var7, var5 / var7, false, var7 >= (double)2.0F, false, false, 0, var7, iIIIliIlIIli.illlilIIlIillilIIl);
      } else {
         return new illiIiIlIiliIiIl(false, (double)0.0F, (double)0.0F, false, false, true, false, 0, (double)0.0F, (iIIIliIlIIli)null);
      }
   }

   public void illIlIilIl(int y, int tick, int x, long z) {
      if (!this.iiilIliIil) {
         this.lIIiIliIil.put(IIIiIllIIiIl.iIlIlllllill(y, tick, x), z + 100L);
         this.lIIIlliIil = true;
      }
   }

   static boolean Illillliilli(class_243 from, class_243 to) {
      if (from != null && to != null) {
         return from.method_1022(to) > (double)2.0F || Math.abs(from.field_1351 - to.field_1351) >= 0.9;
      } else {
         return from != to;
      }
   }

   public iiilllIIIill IliIlllilIi() {
      if (this.iiilIliIil) {
         return iiilllIIIill.lillllIiiillllIi;
      } else {
         return this.ilIIlliIil != Long.MIN_VALUE && this.iIliIliIil < this.ilIIlliIil ? iiilllIIIill.IiilllIiliilllIi : this.lIliIliIil;
      }
   }

   static boolean IlIllllIll(double goalFloorY, double len, double walkEndY) {
      if (!Double.isNaN(goalFloorY) && !Double.isNaN(len)) {
         if (walkEndY > (double)16.0F) {
            return true;
         } else {
            return Math.abs(goalFloorY - len) <= 0.600000001;
         }
      } else {
         return false;
      }
   }

   private double[] Iiiiliiiiiii(class_243 onGround, class_243 vel, boolean pos) {
      long var20 = -2628475740272644316L;
      long var22 = -7941572405724829937L;
      long var24 = 7094070871161496998L;
      long var26 = -414760816582953289L;
      var20 ^= ((long)((int)Math.floor(onGround.field_1352)) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)((int)Math.floor(onGround.field_1350)) ^ var20) & -1L >>> 32;
      if (!pos && vel != null && Double.isFinite(vel.field_1352) && Double.isFinite(vel.field_1350)) {
         double var29 = onGround.field_1352 + vel.field_1352 * (double)3.0F;
         double var30 = onGround.field_1350 + vel.field_1350 * (double)3.0F;
         var22 ^= ((long)((int)Math.floor(var29)) << 32 ^ var22) & -1L << 32;
         var22 ^= ((long)((int)Math.floor(var30)) ^ var22) & -1L >>> 32;
         double var31 = IIIiIllIIiIl.IIIllIIliIIl(this.ililIliIil, (int)(var22 >>> 32), (int)var22, onGround.field_1351, 0.6, 26);
         if (Double.isFinite(var31)) {
            return new double[]{(double)((int)(var22 >>> 32)), (double)((int)var22), var31};
         } else {
            var31 = IIIiIllIIiIl.IIIllIIliIIl(this.ililIliIil, (int)(var20 >>> 32), (int)var20, onGround.field_1351, 0.6, 26);
            return Double.isFinite(var31) ? new double[]{(double)((int)(var20 >>> 32)), (double)((int)var20), var31} : null;
         }
      } else {
         double var6 = IIIiIllIIiIl.IIIllIIliIIl(this.ililIliIil, (int)(var20 >>> 32), (int)var20, onGround.field_1351, 0.6, 1);
         if (Double.isFinite(var6) && Math.abs(var6 - onGround.field_1351) <= 0.6) {
            return new double[]{(double)((int)(var20 >>> 32)), (double)((int)var20), var6};
         } else {
            double var8 = 0.299;
            double var10 = Double.MAX_VALUE;
            double[] var12 = null;

            for(var24 ^= (0L ^ var24) & -1L << 32; (int)(var24 >>> 32) < 4; var24 += 4294967296L) {
               var24 ^= ((long)((int)Math.floor(onGround.field_1352 + (((int)(var24 >>> 32) & 1) == 0 ? -var8 : var8))) ^ var24) & -1L >>> 32;
               var26 ^= ((long)((int)Math.floor(onGround.field_1350 + (((int)(var24 >>> 32) & 2) == 0 ? -var8 : var8))) << 32 ^ var26) & -1L << 32;
               if ((int)var24 != (int)(var20 >>> 32) || (int)(var26 >>> 32) != (int)var20) {
                  double var16 = IIIiIllIIiIl.IIIllIIliIIl(this.ililIliIil, (int)var24, (int)(var26 >>> 32), onGround.field_1351, 0.6, 1);
                  if (Double.isFinite(var16) && !(Math.abs(var16 - onGround.field_1351) > 0.6)) {
                     double var18 = Math.hypot((double)((int)var24) + (double)0.5F - onGround.field_1352, (double)((int)(var26 >>> 32)) + (double)0.5F - onGround.field_1350) + Math.abs(var16 - onGround.field_1351);
                     if (var18 < var10) {
                        var10 = var18;
                        var12 = new double[]{(double)((int)var24), (double)((int)(var26 >>> 32)), var16};
                     }
                  }
               }
            }

            if (var12 != null) {
               return var12;
            } else {
               var6 = IIIiIllIIiIl.IIIllIIliIIl(this.ililIliIil, (int)(var20 >>> 32), (int)var20, onGround.field_1351, 0.6, 26);
               return Double.isFinite(var6) ? new double[]{(double)((int)(var20 >>> 32)), (double)((int)var20), var6} : null;
            }
         }
      }
   }

   public boolean IIiIllIiIl(int z, int x) {
      long var17 = -8514027846383045065L;
      long var19 = 6251851226843889468L;
      long var21 = 4634736406931900729L;
      long var15 = -8582272497965115106L;
      List var3 = this.llliIliIil;
      if (!this.iiilIliIil && var3 != null) {
         var15 ^= ((long)Math.max(1, this.IIIiIliIil.iIlIlllllill()) << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)Math.max(1, (int)(var15 >>> 32) - 2) ^ var15) & -1L >>> 32;
         var17 ^= ((long)Math.min(var3.size(), (int)(var15 >>> 32) + 4 + 2) << 32 ^ var17) & -1L << 32;

         for(long var26 = var17 ^ ((long)((int)var15) ^ var17) & -1L >>> 32; (int)var26 < (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
            iillIilIIilIil var8 = (iillIilIIilIil)var3.get((int)var26);
            iIIIliIlIIli var9 = var8.IIIllIIliIIl();
            if (var9 == iIIIliIlIIli.llililIIlilililIIl && var8.iIlIlllllill() == z && var8.lIiiIiIlilli() == x) {
               return true;
            }

            if (var9 == iIIIliIlIIli.IiililIIlliililIIl || var9 == iIIIliIlIIli.iiililIIlIIIiilIIl) {
               iillIilIIilIil var10 = (iillIilIIilIil)var3.get((int)var26 - 1);
               var19 ^= ((long)Integer.signum(var8.iIlIlllllill() - var10.iIlIlllllill()) << 32 ^ var19) & -1L << 32;
               var19 ^= ((long)Integer.signum(var8.lIiiIiIlilli() - var10.lIiiIiIlilli()) ^ var19) & -1L >>> 32;
               var21 ^= ((long)(var9 == iIIIliIlIIli.IiililIIlliililIIl ? 1 : 2) << 32 ^ var21) & -1L << 32;

               for(var21 ^= (1L ^ var21) & -1L >>> 32; (int)var21 <= (int)(var21 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
                  if (var10.iIlIlllllill() + (int)(var19 >>> 32) * (int)var21 == z && var10.lIiiIiIlilli() + (int)var19 * (int)var21 == x) {
                     return true;
                  }
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private liiIIlliiiIIll IiIiliIiiiIi(long tick, iIllIlllIlllIlll losBudget, int t) {
      return (liiIIlliiiIIll)(losBudget != null && losBudget.IIIllIIliIIl() == iiIIllIlIIlIllIl.IIililIiIl && losBudget.iliIiiliiiii() != null && this.IIlilIliiIli(tick, losBudget) ? IIiIIillIiIIil.lIiiIiIlilli(losBudget.iliIiiliiiii(), losBudget.IlIlllIlilIl(), this.IiilIliIil, t) : IIiIIillIiIIil.IliIlllilIi(losBudget, this.IiilIliIil, t));
   }

   private static boolean Iillllilll(class_243 v) {
      return Double.isFinite(v.field_1352) && Double.isFinite(v.field_1351) && Double.isFinite(v.field_1350);
   }

   private void Iliilliiilii(liiIIlliiiIIll goal) {
      if (goal == null) {
         this.lIiiIliIil = null;
      } else {
         long var2 = this.iiiiIliIil;
         ++this.IIIIlliIil;
         this.lIiiIliIil = IIIiIllIIiIl.IliIlllilIi(this.ililIliIil, this.iliiIliIil, this.IiiiIliIil, this.liiiIliIil, goal, this.Illlllllilll(), this.liilIliIil, (at) -> this.lIIiIliIil.get(at) > var2);
      }
   }

   // $FF: synthetic method
   private static CallSite IiIilliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '볫') ^ var5) + '얐') << 11 | (char)((char)((char)(var4[var5] + '볫') ^ var5) + '얐') >>> 5) >>> 11 | (char)((char)((char)((char)(var4[var5] + '볫') ^ var5) + '얐') << 11 | (char)((char)((char)(var4[var5] + '볫') ^ var5) + '얐') >>> 5) << 5) ^ var5) + var5) - var5) + 14455))) + '拓') + 11012) + 'ꩥ') - 19272))))) + 17969));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   boolean lIIlliIIll(long tick) {
      return this.IilIlliIil != null && tick < this.illIlliIil && tick >= this.illIlliIil - 60L;
   }

   public void IiiIlliiIl() {
      this.lIiiIliIil = null;
      this.iIiiIliIil = null;
      this.IliiIliIil = false;
      this.lliiIliIil = 0;
      this.Iiilliiliiil();
      this.IiliIliIil = null;
      this.liliIliIil = null;
      this.iiliIliIil = Long.MIN_VALUE;
      this.lIIiIliIil.clear();
      this.lIIIlliIil = false;
      this.iIIIlliIil = false;
      this.IlIIlliIil = false;
      this.llIIlliIil = Long.MIN_VALUE;
      this.ilIIlliIil = Long.MIN_VALUE;
      this.IiIIlliIil = null;
      this.liIIlliIil = Double.NaN;
      this.iiIIlliIil = Long.MIN_VALUE;
      this.IIlIlliIil = Long.MIN_VALUE;
      this.lIlIlliIil = null;
      this.iIlIlliIil = null;
      this.lllIlliIil = false;
      this.illIlliIil = Long.MIN_VALUE;
      this.IilIlliIil = null;
      this.lilIlliIil = Long.MIN_VALUE;
      this.iilIlliIil = null;
      this.lIliIliIil = this.iiilIliIil ? iiilllIIIill.lillllIiiillllIi : iiilllIIIill.illlllIiIillllIi;
   }

   public void IiIlliIliiIl(lIlIilIiiIlIilIi s) {
      if (!this.iiilIliIil) {
         this.llIiIliIil = s == null ? lIlIilIiiIlIilIi.liIiiIlIIi : s;
         this.IIlllIlliIll(this.llIiIliIil);
      }
   }

   boolean IIlilIliiIli(long tick, iIllIlllIlllIlll t) {
      class_243 var4 = this.iilIlliIil;
      if (t != null && t.IIIllIIliIIl() == iiIIllIlIIlIllIl.IIililIiIl && t.iliIiiliiiii() != null && var4 != null) {
         if (tick < this.lilIlliIil && tick >= this.lilIlliIil - 60L) {
            return var4.method_1022(t.iliIiiliiiii()) <= (double)2.0F;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public illiIiIlIiliIiIl Ililllililil(long tick, class_243 collided, class_243 onGround, boolean inWater, boolean vel, boolean goal, iIllIlllIlllIlll pos) {
      long var17 = 1554392185953890882L;
      long var19 = 1699137810542844884L;
      long var21 = -582903861852457608L;
      this.iIliIliIil = tick;
      if (this.iiilIliIil) {
         this.lIliIliIil = iiilllIIIill.lillllIiiillllIi;
         this.IiIIlliIil = iiIIlIIlIl(collided, pos);
         return this.IiIIlliIil;
      } else if (collided != null && Iillllilll(collided) && pos != null && pos.iliIiiliiiii() != null) {
         iIllIlllIlllIlll var9 = this.iiiIlIIIll(tick, pos);
         this.IllIllllIl(tick);
         class_243 var10 = var9.iliIiiliiiii();
         var17 ^= ((long)(this.liliIliIil != null && this.liliIliIil != var9.IIIllIIliIIl() ? 1 : 0) << 32 ^ var17) & -1L << 32;
         var17 ^= ((long)(this.IiliIliIil != null && Iilililiiili(this.IiliIliIil, var10) ? 1 : 0) ^ var17) & -1L >>> 32;
         var19 ^= ((long)(this.llliIliIil != null && tick - this.iiliIliIil >= 8L ? 1 : 0) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)(this.llliIliIil != null && !this.IIIilIIiiIIi() ? 1 : 0) ^ var19) & -1L >>> 32;
         if ((int)var19 != 0 || this.IlIIlliIil) {
            this.Iiilliiliiil();
         }

         if (this.lIiiIliIil != null && (this.iIiiIliIil == null || this.iIiiIliIil.IIIllIIliIIl() != var9.IIIllIIliIIl() || IIiilIiiiIii(this.iIiiIliIil.iliIiiliiiii(), var10) || this.lIIIlliIil || this.IlIIlliIil)) {
            this.lIiiIliIil = null;
         }

         var21 ^= ((long)(this.llliIliIil != null && (int)var17 == 0 && (int)(var19 >>> 32) == 0 && !this.lIIIlliIil && !this.iIIIlliIil && !this.IlIIlliIil && (int)(var17 >>> 32) == 0 ? 0 : 1) << 32 ^ var21) & -1L << 32;
         if ((int)(var21 >>> 32) != 0 && this.lIiiIliIil == null) {
            this.IlIillIiilIi(tick, collided, onGround, inWater, var9);
         }

         this.lIIIlliIil = false;
         this.iIIIlliIil = false;
         this.IlIIlliIil = false;
         this.IIIIllIIIl(tick);
         illiIiIlIiliIiIl var16;
         if (this.llliIliIil != null) {
            var16 = this.IIIiIliIil.IliIlllilIi(this.llliIliIil, collided, onGround, inWater, vel, goal, this.ililIliIil, this.ilIiIliIil);
            if (var16.IIIllIIliIIl()) {
               this.IlIIlliIil = true;
            }

            if (var16.iliIiiliiiii() && this.illiIliIil == iiilllIIIill.llilllIiililllIi && this.lIiiIliIil == null) {
               this.iIIIlliIil = true;
            }

            this.lIliIliIil = this.illiIliIil;
         } else {
            var16 = this.IiIIlliIIl(collided, var9);
            this.lIliIliIil = this.llIIlliIil != Long.MIN_VALUE ? iiilllIIIill.IiilllIiliilllIi : (this.lIiiIliIil != null ? iiilllIIIill.IIilllIilIilllIi : iiilllIIIill.illlllIiIillllIi);
         }

         if (this.lIliIliIil != iiilllIIIill.IiilllIiliilllIi && tick >= this.ilIIlliIil) {
            this.llIIlliIil = Long.MIN_VALUE;
         }

         this.IiIIlliIil = var16;
         return var16;
      } else {
         this.lIliIliIil = iiilllIIIill.illlllIiIillllIi;
         this.IiIIlliIil = new illiIiIlIiliIiIl(false, (double)0.0F, (double)0.0F, false, false, false, false, 0, (double)0.0F, (iIIIliIlIIli)null);
         return this.IiIIlliIil;
      }
   }

   public static iIIIllilIlIIllil IIIllIIliIIl(IilIllililIlli danger, iilIiiIIiIii rays) {
      llIiililIiil var2 = (tx, ty, ey, tz, ez, ex) -> liliilIiiiliilIi.lIiiIiIlilli() && (danger == null || danger.liiiIIllIl(1, 3)) && lllIliIlillIliIl.IiIIlliIIl(new class_243(tx, ty, ey), new class_243(tz, ez, ex));
      return new iIIIllilIlIIllil(new liliilIiiiliilIi(), var2, rays == null ? iilIiiIIiIii.liIiIilIliiIiIilIl : rays, false);
   }

   private void iIIIlIlIIl(long tick, ilIilIilIiIilIil r) {
      iIllIlllIlllIlll var4 = this.iIiiIliIil;
      if (r != null && var4 != null) {
         switch (r.IliIlllilIi()) {
            case IilIiiiililIiiii:
               this.llIIlilIIl(tick, r, iiilllIIIill.iIilllIiIlilllIi);
               break;
            case iilIiiiiIIiIiiii:
               this.llIIlilIIl(tick, r, iiilllIIIill.llilllIiililllIi);
               break;
            default:
               if (var4.IIIllIIliIIl() == iiIIllIlIIlIllIl.iIililIiIl && var4.iliIiiliiiii() != null) {
                  this.illIlliIil = tick + 60L;
                  this.IilIlliIil = var4.iliIiiliiiii();
                  this.iIiiIliIil = iIllIlllIlllIlll.liiiIIllIl(var4.iliIiiliiiii(), var4.IlIlllIlilIl());
                  this.Iliilliiilii(IIiIIillIiIIil.IliIlllilIi(this.iIiiIliIil, this.IiilIliIil, 16));
                  return;
               }

               if (!this.IliiIliIil && var4.IIIllIIliIIl() == iiIIllIlIIlIllIl.iillilIiIl && this.lliiIliIil < 1) {
                  ++this.lliiIliIil;
                  this.IliiIliIil = true;
                  class_243 var5 = var4.iliIiiliiiii();
                  this.Iliilliiilii(IIiIIillIiIIil.lIiiIiIlilli(new class_243(var5.field_1352, var5.field_1351 + (double)1.0F, var5.field_1350), var4.IlIlllIlilIl(), this.IiilIliIil, 16));
                  return;
               }

               if (!this.IliiIliIil && var4.IIIllIIliIIl() == iiIIllIlIIlIllIl.IIililIiIl && var4.iliIiiliiiii() != null && !this.IIlilIliiIli(tick, var4)) {
                  this.IliiIliIil = true;
                  this.lilIlliIil = tick + 60L;
                  this.iilIlliIil = var4.iliIiiliiiii();
                  this.Iliilliiilii(IIiIIillIiIIil.lIiiIiIlilli(var4.iliIiiliiiii(), var4.IlIlllIlilIl(), this.IiilIliIil, 16));
                  return;
               }

               this.llIIlilIIl(tick, r, iiilllIIIill.IiilllIiliilllIi);
               if (this.llIIlliIil == Long.MIN_VALUE) {
                  this.llIIlliIil = tick;
               }
         }

      } else {
         this.lIiiIliIil = null;
      }
   }

   // $FF: synthetic method
   private static CallSite liilliiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) ^ 11410) >>> 3 | (char)((char)(-var4[var5]) ^ 11410) << 13) ^ var5))) ^ 20341) ^ 3826) ^ var5) - var5))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iIIIllilIlIIllil IlIlllIlilIl() {
      return new iIIIllilIlIIllil((IlIIlIilllIIlIil)null, (llIiililIiil)null, (iilIiiIIiIii)null, true);
   }

   List<iillIilIIilIil> lllllillll() {
      return this.llliIliIil;
   }

   public double iIlIlllllill() {
      long var5 = 2314821545120142888L;
      if (this.iiilIliIil) {
         return Double.NaN;
      } else {
         iiilllIIIill var1 = this.IliIlllilIi();
         if (var1 == iiilllIIIill.IiilllIiliilllIi) {
            return Double.POSITIVE_INFINITY;
         } else if (var1 == iiilllIIIill.lillllIiiillllIi) {
            return this.liIIlliIil;
         } else if ((var1 == iiilllIIIill.iIilllIiIlilllIi || var1 == iiilllIIIill.llilllIiililllIi) && this.llliIliIil != null && Double.isFinite(this.IIiiIliIil)) {
            var5 ^= ((long)Math.max(1, Math.min(this.llliIliIil.size(), this.IIIiIliIil.iIlIlllllill())) << 32 ^ var5) & -1L << 32;
            double var3 = ((iillIilIIilIil)this.llliIliIil.get((int)(var5 >>> 32) - 1)).IiIlliIliiIl();
            return Math.max((double)0.0F, this.IIiiIliIil - var3);
         } else {
            return Double.NaN;
         }
      }
   }

   public iIIIllilIlIIllil(IlIIlIilllIIlIil danger, llIiililIiil world, iilIiiIIiIii los) {
      this(danger, world, los, danger == null);
   }

   private void llIIlilIIl(long tick, ilIilIilIiIilIil m, iiilllIIIill r) {
      this.lIiiIliIil = null;
      this.llliIliIil = m.liiiIIllIl().isEmpty() ? null : m.liiiIIllIl();
      this.illiIliIil = r;
      this.IIiiIliIil = m.iIlIlllllill();
      this.IiliIliIil = this.iIiiIliIil.iliIiiliiiii();
      this.liliIliIil = this.iIiiIliIil.IIIllIIliIIl();
      this.iiliIliIil = tick;
      this.IIIiIliIil.liiiIIllIl();
      if (r != iiilllIIIill.IiilllIiliilllIi && tick >= this.ilIIlliIil) {
         this.llIIlliIil = Long.MIN_VALUE;
      }

   }

   private boolean IIIilIIiiIIi() {
      long var8 = -6586934807304326509L;
      long var10 = 5709201614621160102L;
      List var1 = this.llliIliIil;
      if (var1 == null) {
         return false;
      } else {
         var8 ^= ((long)Math.max(1, this.IIIiIliIil.iIlIlllllill()) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)this.llIiIliIil.lIiiIiIlilli() ^ var8) & -1L >>> 32;
         var10 ^= ((long)((int)(var8 >>> 32)) << 32 ^ var10) & -1L << 32;

         while(true) {
            if ((int)(var10 >>> 32) < var1.size() && (int)(var10 >>> 32) < (int)(var8 >>> 32) + 3) {
               iillIilIIilIil var5 = (iillIilIIilIil)var1.get((int)(var10 >>> 32));
               double var6 = IIIiIllIIiIl.IIIllIIliIIl(this.ililIliIil, var5.iIlIlllllill(), var5.lIiiIiIlilli(), var5.iliIiiliiiii(), 0.6, 1);
               if (Double.isFinite(var6) && !(Math.abs(var6 - var5.iliIiiliiiii()) > 0.3)) {
                  if (IIIiIllIIiIl.iliIiiliiiii(this.ililIliIil.iIlIlllllill(var5.iIlIlllllill(), var5.IilliliilIIi(), var5.lIiiIiIlilli()), (boolean)((int)var8))) {
                     return false;
                  }

                  var10 += 4294967296L;
                  continue;
               }

               return false;
            }

            return true;
         }
      }
   }

   public String liIlliiIll() {
      double var1 = this.iIlIlllllill();
      List var3 = this.llliIliIil;
      String var4 = Double.isFinite(var1) ? String.format(Locale.ROOT, ilillIiill<invokedynamic>(), var1) : ilillIiill<invokedynamic>();
      String var5 = var3 == null ? ilillIiill<invokedynamic>() : String.format(Locale.ROOT, ilillIiill<invokedynamic>(), this.IilliliilIIi());
      return this.IliIlllilIi().name() + ilillIiill<invokedynamic>() + var4 + ilillIiill<invokedynamic>() + (var3 == null ? 0 : var3.size()) + ilillIiill<invokedynamic>() + this.lIiiIiIlilli() + ilillIiill<invokedynamic>() + var5 + ilillIiill<invokedynamic>() + this.liiiIIllIl();
   }

   public float[] lliIliliIl(float preYaw) {
      iiilllIIIill var2 = this.IliIlllilIi();
      if (var2 != iiilllIIIill.iIilllIiIlilllIi && var2 != iiilllIIIill.llilllIiililllIi) {
         return null;
      } else {
         illiIiIlIiliIiIl var3 = this.IiIIlliIil;
         if (var3 != null && var3.IliIlllilIi() && var3.IiIlliIliiIl() >= (double)6.0F) {
            if (!Float.isFinite(preYaw)) {
               return null;
            } else {
               float var4 = (float)Math.toDegrees(Math.atan2(-var3.liiiIIllIl(), var3.iIlIlllllill()));
               float var5 = ((var4 - preYaw) % 360.0F + 540.0F) % 360.0F - 180.0F;
               return new float[]{preYaw + var5, 12.0F};
            }
         } else {
            return null;
         }
      }
   }

   int IIllllIlll() {
      return this.IIIIlliIil;
   }

   public lIlIilIiiIlIilIi iliIiiliiiii() {
      return this.iiilIliIil ? lIlIilIiiIlIilIi.liIiiIlIIi : this.llIiIliIil;
   }

   private void IllIllllIl(long tick) {
      if (!this.lIIiIliIil.isEmpty()) {
         if (this.IlliIliIil == Long.MIN_VALUE || tick - this.IlliIliIil >= 20L || tick < this.IlliIliIil) {
            this.IlliIliIil = tick;
            this.lIIiIliIil.long2LongEntrySet().removeIf((tickx) -> tickx.getLongValue() <= tick);
         }
      }
   }

   public int liiiIIllIl() {
      if (!this.iiilIliIil && this.IliIlllilIi() == iiilllIIIill.IiilllIiliilllIi && this.llIIlliIil != Long.MIN_VALUE) {
         long var1 = this.iIliIliIil - this.llIIlliIil + 1L;
         return var1 <= 0L ? 0 : (int)Math.min(2147483647L, var1);
      } else {
         return 0;
      }
   }

   private void IlIillIiilIi(long vel, class_243 onGround, class_243 tick, boolean target, iIllIlllIlllIlll pos) {
      double[] var7 = this.Iiiiliiiiiii(onGround, tick, target);
      if (var7 != null) {
         this.iliiIliIil = (int)var7[0];
         this.IiiiIliIil = (int)var7[1];
         this.liiiIliIil = var7[2];
         this.iiiiIliIil = vel;
         this.iIiiIliIil = pos;
         this.IliiIliIil = false;
         this.lliiIliIil = 0;
         this.Iliilliiilii(this.IiIiliIiiiIi(vel, pos, 16));
      }
   }

   private boolean IIillIiliIil(long target, class_243 tick, iIllIlllIlllIlll pos, class_243 p) {
      long var18 = 1972638693483474215L;
      long var20 = 3984273469012805494L;
      double var6 = iiliillIIiiill.IIIllIIliIIl(this.ililIliIil, tick, p, true, (double)16.0F, this.ilIiIliIil);
      if (Double.isNaN(var6)) {
         return false;
      } else {
         var18 ^= ((long)((int)Math.floor(p.field_1352)) << 32 ^ var18) & -1L << 32;
         var18 ^= ((long)((int)Math.floor(p.field_1350)) ^ var18) & -1L >>> 32;
         double var10 = IIIiIllIIiIl.IIIllIIliIIl(this.ililIliIil, (int)(var18 >>> 32), (int)var18, p.field_1351, 0.6, 1);
         if (Double.isFinite(var10) && !(Math.abs(var10 - p.field_1351) > 0.600000001)) {
            if (!IlIllllIll(var6, var10, Math.hypot(p.field_1352 - tick.field_1352, p.field_1350 - tick.field_1350))) {
               return false;
            } else if (pos.IIIllIIliIIl() == iiIIllIlIIlIllIl.lIililIiIl) {
               return true;
            } else {
               class_243 var12 = pos.iliIiiliiiii();
               if (pos.IIIllIIliIIl() == iiIIllIlIIlIllIl.iIililIiIl && !ilIllIiIll(var10, var12.field_1351)) {
                  return false;
               } else {
                  var20 ^= ((long)this.IIlilIliiIli(target, pos) << 32 ^ var20) & -1L << 32;
                  if (pos.IIIllIIliIIl() == iiIIllIlIIlIllIl.IIililIiIl && (int)(var20 >>> 32) == 0 && !ilIllIiIll(var10, var12.field_1351 - (double)1.0F)) {
                     return false;
                  } else {
                     long var14 = IIIiIllIIiIl.iIlIlllllill((int)(var18 >>> 32), IIIiIllIIiIl.lIiiIiIlilli(var10), (int)var18);
                     if (var14 == this.iiIIlliIil && pos.IIIllIIliIIl() == this.iIlIlliIil && this.lIlIlliIil != null && target >= this.IIlIlliIil && target - this.IIlIlliIil < 5L && this.lIlIlliIil.method_1025(var12) <= (double)0.0625F && (int)(var20 >>> 32) == this.lllIlliIil) {
                        return this.IllIlliIil;
                     } else {
                        liiIIlliiiIIll var16 = this.IiIiliIiiiIi(target, pos, 1);
                        var20 ^= ((long)(var16 != null && var16.IliIlllilIi((int)(var18 >>> 32), var10, (int)var18) ? 1 : 0) ^ var20) & -1L >>> 32;
                        this.iiIIlliIil = var14;
                        this.iIlIlliIil = pos.IIIllIIliIIl();
                        this.lIlIlliIil = var12;
                        this.IIlIlliIil = target;
                        this.IllIlliIil = (boolean)((int)var20);
                        this.lllIlliIil = (boolean)((int)(var20 >>> 32));
                        return (boolean)((int)var20);
                     }
                  }
               }
            }
         } else {
            return false;
         }
      }
   }

   private void IIIIllIIIl(long tick) {
      long var7 = -2798454960529935788L;
      long var9 = -288863284754345231L;
      var7 ^= ((long)this.iIIiIliIil << 32 ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;

      while(this.lIiiIliIil != null && (int)(var7 >>> 32) > 0) {
         int var10000 = (int)var7;
         var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32;
         if (var10000 >= 4) {
            break;
         }

         long var14 = var9 ^ ((long)this.lIiiIliIil.IiIlliIliiIl() << 32 ^ var9) & -1L << 32;
         var9 = var14 ^ ((long)this.lIiiIliIil.lIiiIiIlilli((int)(var7 >>> 32)) ^ var14) & -1L >>> 32;
         var7 ^= ((long)((int)(var7 >>> 32) - Math.max(1, this.lIiiIliIil.IiIlliIliiIl() - (int)(var9 >>> 32))) << 32 ^ var7) & -1L << 32;
         if ((int)var9 == 0) {
            return;
         }

         this.iIIIlIlIIl(tick, this.lIiiIliIil.iliIiiliiiii());
      }

   }

   static boolean ilIllIiIll(double feetY, double levelY) {
      return !Double.isFinite(levelY) || feetY <= levelY + 0.6 + 1.0E-9;
   }

   private void IIlllIlliIll(lIlIilIiiIlIilIi s) {
      long var5 = -9220854439790298498L;
      var5 ^= ((long)iililIlIIiilIl.IliIlllilIi(s.IiIlliIliiIl()) << 32 ^ var5) & -1L << 32;
      float var3 = s.liiiIIllIl() ? 4.0F : 8.0F;
      float var4 = Float.isFinite(s.IliIlllilIi()) ? s.IliIlllilIi() : 0.0F;
      this.IiIiIliIil = Math.max(0.0F, Math.min(iililIlIIiilIl.illllIlllIilllIlll[(int)(var5 >>> 32)], var4 - var3));
      this.ilIiIliIil = lllllillillllill.iIlIlllllill(s.iIlIlllllill(), s.IilliliilIIi(), this.IiIiIliIil, 26);
      this.liIiIliIil = iililIlIIiilIl.IllllIllllllllIlll[(int)(var5 >>> 32)];
      this.iiIiIliIil = !s.IIIllIIliIIl();
      this.IIliIliIil = s.iliIiiliiiii() > 6 && !s.IIIllIIliIIl() && s.IlIlllIlilIl() < 150;
   }

   private iIIIllilIlIIllil(IlIIlIilllIIlIil world, llIiililIiil none, iilIiiIIiIii los, boolean danger) {
      this.IIIiIliIil = new iiliillIIiiill();
      this.lIIiIliIil = new Long2LongOpenHashMap();
      this.iIIiIliIil = 300;
      this.IlIiIliIil = 2400;
      this.llIiIliIil = lIlIilIiiIlIilIi.liIiiIlIIi;
      this.ilIiIliIil = 3;
      this.liIiIliIil = iililIlIIiilIl.IllllIllllllllIlll[0];
      this.iiIiIliIil = true;
      this.IIliIliIil = true;
      this.lIliIliIil = iiilllIIIill.illlllIiIillllIi;
      this.iIliIliIil = Long.MIN_VALUE;
      this.IlliIliIil = Long.MIN_VALUE;
      this.illiIliIil = iiilllIIIill.illlllIiIillllIi;
      this.iiliIliIil = Long.MIN_VALUE;
      this.IIiiIliIil = Double.NaN;
      this.llIIlliIil = Long.MIN_VALUE;
      this.ilIIlliIil = Long.MIN_VALUE;
      this.liIIlliIil = Double.NaN;
      this.iiIIlliIil = Long.MIN_VALUE;
      this.IIlIlliIil = Long.MIN_VALUE;
      this.illIlliIil = Long.MIN_VALUE;
      this.lilIlliIil = Long.MIN_VALUE;
      this.ililIliIil = world;
      this.IiilIliIil = none;
      this.liilIliIil = los == null ? iilIiiIIiIii.liIiIilIliiIiIilIl : los;
      this.iiilIliIil = danger;
      this.lIIiIliIil.defaultReturnValue(Long.MIN_VALUE);
      this.IIlllIlliIll(lIlIilIiiIlIilIi.liIiiIlIIi);
      if (danger) {
         this.ilIiIliIil = 3;
      }

   }

   public float IilliliilIIi() {
      long var5 = 7351213643459110803L;
      List var1 = this.llliIliIil;
      if (!this.iiilIliIil && var1 != null) {
         var5 ^= ((long)Math.max(1, this.IIIiIliIil.iIlIlllllill()) << 32 ^ var5) & -1L << 32;
         float var3 = 0.0F;

         for(long var8 = var5 ^ ((long)((int)(var5 >>> 32)) ^ var5) & -1L >>> 32; (int)var8 < var1.size(); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            var3 += ((iillIilIIilIil)var1.get((int)var8)).IlIlllIlilIl();
         }

         return var3;
      } else {
         return 0.0F;
      }
   }

   static boolean IIiilIiiiIii(class_243 to, class_243 from) {
      if (to != null && from != null) {
         return to.method_1022(from) > (double)4.0F || Math.abs(to.field_1351 - from.field_1351) >= 0.9;
      } else {
         return to != from;
      }
   }

   public int lIiiIiIlilli() {
      return this.iiilIliIil ? 3 : this.ilIiIliIil;
   }

   static boolean Iilililiiili(class_243 to, class_243 from) {
      if (to != null && from != null) {
         return Math.hypot(to.field_1352 - from.field_1352, to.field_1350 - from.field_1350) > (double)1.25F || Illillliilli(to, from);
      } else {
         return to != from;
      }
   }

   private void Iiilliiliiil() {
      this.llliIliIil = null;
      this.illiIliIil = iiilllIIIill.illlllIiIillllIi;
      this.IIiiIliIil = Double.NaN;
      this.IIIiIliIil.liiiIIllIl();
   }
}
