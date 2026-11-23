package gg.corz;

import com.corz.client.CorzClient;
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
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class ilIlllilIiIlllil {
   private final String[] liIiIiiIil = new String[3];
   private final class_243[] IIiiIiiIil = new class_243[(~398739150 * -755159085 << 25 | ~398739150 * -755159085 >>> 7) * 57 ^ 1502098466];
   private final float[] iiIiIiiIil = new float[3];
   private final int[] lIliIiiIil = new int[3];
   private final Object[] IlliIiiIil = new Object[((1774218819 >>> 27 | 1774218819 << 5) >>> 19 | (1774218819 >>> 27 | 1774218819 << 5) << 13) ^ -1190287609];
   private final String[] liliIiiIil = new String[-1191068876 + -97 ^ -1191068971];
   private final int[] llliIiiIil = new int[-978898103 * 111 * 1631000239 ^ -233713617];
   private final String[] iiliIiiIil = new String[((-945281385 >>> 21 | -945281385 << 11) - -13 + -81) * -941362695 ^ 367996983];
   static final int llIiIiiIil = 6;
   private final long[] illiIiiIil = new long[(-973120234 * -1332920885 * -19 >>> 21 | -973120234 * -1332920885 * -19 << 11) ^ 1869369881];
   static final float lIIiIiiIil = 72.0F;
   static final float iIIiIiiIil = 0.16F;
   private final float[] IIliIiiIil = new float[3];
   private final class_4587 IiIiIiiIil = new class_4587();
   static final double ilIiIiiIil = (double)640.0F;
   static final int IlIiIiiIil = 3;
   private final iiliIiiIIiiIii[] iIliIiiIil = new iiliIiiIIiiIii[((-1937066069 - -11) * 1749801491 << 19 | (-1937066069 - -11) * 1749801491 >>> 13) * -1022611261 ^ 623095898];
   private final String[] IiliIiiIil = new String[~(~(-1107852263 << 5 | -1107852263 >>> 27)) + -97 ^ -1091534128];

   private class_243 IliIlllilIi(int slot, iiliIiiIIiiIii s) {
      class_243 var3 = this.IIiiIiiIil[slot];
      double var4 = s.IliIlllilIi() + Double.longBitsToDouble(-3652739597564075928L ^ -959587020396519320L);
      double var6 = s.liiiIIllIl() + Double.longBitsToDouble(691393966914524847L ^ 3918636075904421685L);
      double var8 = s.iIlIlllllill() + Double.longBitsToDouble(3453189983751003300L ^ 1156354173792050340L);
      if (var3 == null || var3.field_1352 != var4 || var3.field_1351 != var6 || var3.field_1350 != var8) {
         this.IIiiIiiIil[slot] = var3 = new class_243(var4, var6, var8);
      }

      return var3;
   }

   private static int iliIiiliiiii(int rgb, float alpha255) {
      long var3 = -5694849095765333303L;
      var3 ^= ((long)class_3532.method_15340(Math.round(alpha255), 0, ~(--136335638 - 103) + -93 ^ -136335860) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (((832393547 >>> 1 | 832393547 << 31) << 23 | (832393547 >>> 1 | 832393547 << 31) >>> 9) * 125 ^ 1842246684) | rgb & (((~70255015 + -121) * 49 >>> 7 | (~70255015 + -121) * 49 << 25) ^ 1587175632);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5893440466745607489L ^ Long.rotateLeft(-3896355207951393735L, 50) ^ 8263534403240345980L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7154372504337417939L ^ Long.rotateLeft(2262498243376373694L, 34) ^ -5420404575440557413L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7176981743978784503L ^ Long.rotateLeft(417240269837085474L, 35) ^ 4321303508461752970L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1608214830894433101L ^ Long.rotateLeft(4859433728417627505L, 29) ^ -7729979125663948181L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8130739927060224503L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -344110236709908595L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8275125596698788421L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7257376358815677293L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 967651998964410498L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -303067816684100892L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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

   private void lIiiIiIlilli(class_332 cx, IIlIiIlllIlIiIll f, iiliIiiIIiiIii ctx, int dist, double visW, float s, float cy, float visH, float slot) {
      float var11 = class_3532.method_15363(1.1F - (float)visW / 900.0F, 0.78F, 1.0F);
      float var12 = 18.0F * var11;
      float var13 = 7.0F * var11;
      float var14 = 11.0F * var11;
      float var15 = 5.0F * var11;
      if (this.iIliIiiIil[dist] != ctx || this.llliIiiIil[dist] != ctx.IilliliilIIi() || this.IiliIiiIil[dist] == null) {
         this.iIliIiiIil[dist] = ctx;
         this.llliIiiIil[dist] = ctx.IilliliilIIi();
         this.IiliIiiIil[dist] = ctx.IilliliilIIi() + IlIlllIlilIl<invokedynamic>();
      }

      List var16 = ctx.IiIlliIliiIl();
      if (this.IlliIiiIil[dist] != var16 || this.liliIiiIil[dist] == null) {
         this.IlliIiiIil[dist] = var16;
         this.liliIiiIil[dist] = var16.isEmpty() ? "" : IlIlllIlilIl<invokedynamic>() + String.join(IlIlllIlilIl<invokedynamic>(), var16);
      }

      long var17 = visW < (double)1000.0F ? Math.round(visW) : 1000000L + Math.round(visW / (double)100.0F);
      if (this.illiIiiIil[dist] != var17 || this.iiliIiiIil[dist] == null) {
         this.illiIiiIil[dist] = var17;
         this.iiliIiiIil[dist] = IlIlllIlilIl<invokedynamic>() + lilIIiiliilIIiil.IliIlllilIi(visW);
      }

      String var19 = this.IiliIiiIil[dist];
      String var20 = this.liliIiiIil[dist];
      String var21 = this.iiliIiiIil[dist];
      float var22 = f.Iiilliiliiil(var19, var14);
      float var23 = f.Iiilliiliiil(var20, var14);
      float var24 = f.Iiilliiliiil(var21, var14);
      float var25 = var13 + var22 + var23 + var24 + var13;
      float var26 = s - var25 / 2.0F;
      float var27 = cy - var12;
      if (!(var26 + var25 + 16.0F < 0.0F) && !(var26 - 16.0F > visH) && !(var27 + var12 + 16.0F < 0.0F) && !(var27 - 16.0F > slot)) {
         IIIiiIillIIiiIil.Ililllililil(cx, var26, var27, var25, var12, var15, -233499369, 620756991);
         float var28 = var26 + var13;
         float var29 = var27 + (var12 - f.IlIillIiilIi(var14)) / 2.0F;
         int var30 = 0;
         this.liIiIiiIil[var30] = var19;
         this.iiIiIiiIil[var30] = var28;
         this.lIliIiiIil[var30++] = liiiIIllIl(ctx.IilliliilIIi());
         var28 += var22;
         if (!var20.isEmpty()) {
            this.liIiIiiIil[var30] = var20;
            this.iiIiIiiIil[var30] = var28;
            this.lIliIiiIil[var30++] = -1;
            var28 += var23;
         }

         this.liIiIiiIil[var30] = var21;
         this.iiIiIiiIil[var30] = var28;
         this.lIliIiiIil[var30++] = -6645087;

         for(int var31 = 0; var31 < var30; ++var31) {
            this.IIliIiiIil[var31] = var29;
         }

         f.Iilililiiili(this.liIiIiiIil, this.iiIiIiiIil, this.IIliIiiIil, this.lIliIiiIil, var30, var14);
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 11 | (char)((char)(var4[var5] ^ var5) - var5) << 5))) + '냑'))) << 11 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 11 | (char)((char)(var4[var5] ^ var5) - var5) << 5))) + '냑'))) >>> 5) ^ '힋'))) ^ var5) + var5) - var5) + 16586) + var5))) - 23920) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 11 | (char)((char)(var4[var5] ^ var5) - var5) << 5))) + '냑'))) << 11 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 11 | (char)((char)(var4[var5] ^ var5) - var5) << 5))) + '냑'))) >>> 5) ^ '힋'))) ^ var5) + var5) - var5) + 16586) + var5))) - 23920) << 4) + '魿'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) << 9 | (char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) >>> 7) - 'ﵺ'))))) << 4 | (char)(-((char)(~((char)((char)((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) << 9 | (char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) >>> 7) - 'ﵺ'))))) >>> 12) + var5))) ^ 1451) + var5) ^ '렡'))) >>> 10 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) << 9 | (char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) >>> 7) - 'ﵺ'))))) << 4 | (char)(-((char)(~((char)((char)((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) << 9 | (char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))) >>> 7) - 'ﵺ'))))) >>> 12) + var5))) ^ 1451) + var5) ^ '렡'))) << 6) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(List<iiliIiiIIiiIii> tracers, boolean beams, boolean sites) {
      if (!tracers.isEmpty()) {
         class_310 var4 = class_310.method_1551();
         if (var4.field_1724 != null) {
            class_243 var5 = var4.field_1773.method_19418().method_71156();
            Matrix4f var6 = iIiiIIilIliiIIil.IIillIiliIil();
            class_4588 var7 = beams ? iIiiIIilIliiIIil.IilliliilIIi() : null;
            float var8 = 0.85F + 0.15F * (float)Math.sin((double)(System.currentTimeMillis() % 10000L) / (double)1000.0F * 2.4);

            for(int var9 = 0; var9 < tracers.size(); ++var9) {
               iiliIiiIIiiIii var10 = (iiliIiiIIiiIii)tracers.get(var9);
               int var11 = liiiIIllIl(var10.IilliliilIIi()) & 16777215;
               double var12 = var10.IliIlllilIi() + (double)0.5F;
               double var14 = var10.liiiIIllIl();
               double var16 = var10.iIlIlllllill() + (double)0.5F;
               double var18 = var12 - var5.field_1352;
               double var20 = var16 - var5.field_1350;
               double var22 = Math.sqrt(var18 * var18 + var20 * var20);
               float var24 = (float)class_3532.method_15350((double)1.0F - (var22 - (double)900.0F) / (double)1400.0F, 0.35, (double)1.0F);
               if (var7 != null) {
                  float var25 = var22 > 0.001 ? (float)(var20 / var22) : 1.0F;
                  float var26 = var22 > 0.001 ? (float)(-var18 / var22) : 0.0F;
                  float var27 = 0.16F * (float)class_3532.method_15350(var22 / (double)48.0F, (double)1.0F, (double)6.0F);
                  float var28 = iIiiIIilIliiIIil.Ililllililil(var12);
                  float var29 = iIiiIIilIliiIIil.IIIilIIiiIIi(var16);
                  float var30 = iIiiIIilIliiIIil.Iiilliiliiil(var14);
                  float var31 = iIiiIIilIliiIIil.Iiilliiliiil(var14 + (double)72.0F);
                  int var32 = iliIiiliiiii(var11, 150.0F * var24 * var8);
                  int var33 = iliIiiliiiii(var11, 0.0F);
                  iIiiIIilIliiIIil.IlIlllIlilIl(var7, var6, var28 + var25 * var27, var30, var29 + var26 * var27, var32, var28 - var25 * var27, var30, var29 - var26 * var27, var32, var28 - var25 * var27, var31, var29 - var26 * var27, var33, var28 + var25 * var27, var31, var29 + var26 * var27, var33);
                  iIiiIIilIliiIIil.IlIlllIlilIl(var7, var6, var28 - var26 * var27, var30, var29 + var25 * var27, var32, var28 + var26 * var27, var30, var29 - var25 * var27, var32, var28 + var26 * var27, var31, var29 - var25 * var27, var33, var28 - var26 * var27, var31, var29 + var25 * var27, var33);
               }

               if (beams) {
                  float var34 = 0.5F;
                  iIiiIIilIliiIIil.iIIIlIlIIl(var6, iIiiIIilIliiIIil.Ililllililil(var12 - (double)var34), iIiiIIilIliiIIil.Iiilliiliiil(var14 - (double)var34), iIiiIIilIliiIIil.IIIilIIiiIIi(var16 - (double)var34), iIiiIIilIliiIIil.Ililllililil(var12 + (double)var34), iIiiIIilIliiIIil.Iiilliiliiil(var14 + (double)var34), iIiiIIilIliiIIil.IIIilIIiiIIi(var16 + (double)var34), iliIiiliiiii(var11, 230.0F * var24), 1.6F);
               }

               if (sites && var9 < 3) {
                  Iillllilll.Iilllilliill(var12, var14, var16, var11 | -16777216, var9 == 0);
               }
            }

         }
      }
   }

   public void IilliliilIIi(class_332 ctx, List<iiliIiiIIiiIii> sites) {
      if (!sites.isEmpty()) {
         class_310 var3 = class_310.method_1551();
         if (var3.field_1724 != null && var3.field_1755 == null) {
            CorzClient.fontManager.iIlIlllllill(this.IiIiIiiIil);
            IIIiiIillIIiiIil.IliIlllilIi(this.IiIiIiiIil);
            double var4 = (double)var3.method_22683().method_4495();
            int var6 = var3.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var3), var3.method_1573());
            float var7 = (float)((double)var6 / var4);
            boolean var8 = Math.abs(var7 - 1.0F) > 1.0E-4F;
            if (var8) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)var3.method_22683().method_4486() / var7);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var3.method_22683().method_4502() / var7);
            }

            IIlIiIlllIlIiIll var9 = IIlIiIlllIlIiIll.lIiiIiIlilli();
            IIlIiIlllIlIiIll var10 = var9.IIillIiliIil() ? var9 : IIlIiIlllIlIiIll.liiiIIllIl();

            try {
               if (var10.IIillIiliIil()) {
                  class_243 var11 = var3.field_1773.method_19418().method_71156();
                  float var12 = IliiIilliiIi.lIIlllIIliIIlllIIl > 0.0F ? IliiIilliiIi.lIIlllIIliIIlllIIl : (float)var3.method_22683().method_4489() / (float)var3.method_22683().method_4495();
                  float var13 = IliiIilliiIi.IlIlllIIlllIlllIIl > 0.0F ? IliiIilliiIi.IlIlllIIlllIlllIIl : (float)var3.method_22683().method_4506() / (float)var3.method_22683().method_4495();
                  int var14 = Math.min(6, sites.size());

                  for(int var15 = var14 - 1; var15 >= 0; --var15) {
                     iiliIiiIIiiIii var16 = (iiliIiiIIiiIii)sites.get(var15);
                     double var17 = var16.IliIlllilIi() + (double)0.5F - var11.field_1352;
                     double var19 = var16.liiiIIllIl() - var11.field_1351;
                     double var21 = var16.iIlIlllllill() + (double)0.5F - var11.field_1350;
                     double var23 = Math.sqrt(var17 * var17 + var19 * var19 + var21 * var21);
                     if (var15 <= 0 || !(var23 > (double)640.0F)) {
                        class_243 var25 = llilllililll.iIlIlllllill(this.IliIlllilIi(var15, var16));
                        if (var25 != null && !(var25.field_1350 <= (double)0.0F) && !(var25.field_1350 >= (double)1.0F)) {
                           this.lIiiIiIlilli(ctx, var10, var16, var15, Math.sqrt(var17 * var17 + var21 * var21), (float)(var25.field_1352 / (double)var7), (float)(var25.field_1351 / (double)var7), var12, var13);
                        }
                     }
                  }

                  return;
               }
            } finally {
               if (var8) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }

            }

         }
      }
   }

   public static int liiiIIllIl(int score) {
      if (score >= (-(((-874437922 ^ 117) << 25 | (-874437922 ^ 117) >>> 7) + 109) ^ -1469563643)) {
         return ~(~1271352555) * 1527099483 ^ 19860200;
      } else {
         return score >= (-(-(-119506989) - 41) ^ -119506997) ? ((646782468 + -25 >>> 29 | 646782468 + -25 << 3) * -79 << 9 | (646782468 + -25 >>> 29 | 646782468 + -25 << 3) * -79 >>> 23) ^ -1011907957 : -1680803507 + -67 + 45 ^ 1689209800;
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') << 4) >>> 7 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') << 4) << 9) ^ '닿') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') << 4) >>> 7 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') << 9 | (char)((char)(-((char)(~((char)(var4[var5] ^ 6810))))) + '솞') >>> 7) ^ var5))) + var5) + var5) >>> 3) - '\uefdd') << 4) << 9) ^ '닿') << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static String IIIllIIliIIl(double v) {
      return String.format(Locale.ROOT, IlIlllIlilIl<invokedynamic>(), v);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) << 10) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) << 10) << 1) - 14299) - '\uec7d') ^ var5) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) << 10) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) << 8 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ var5)) ^ 25405))) ^ 27577) >>> 8) ^ '\udd29') ^ var5) ^ var5) - 11153) << 10) << 1) - 14299) - '\uec7d') ^ var5) >>> 3) + '\uebcf'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) >>> 13) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) >>> 13) << 15) >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) >>> 13) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '龸') << 15 | (char)((char)(~var4[var5]) + '龸') >>> 1) + var5) + var5) - '襳') + '蒷'))) >>> 13) << 15) << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
