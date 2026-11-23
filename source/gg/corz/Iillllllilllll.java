package gg.corz;

import com.corz.client.mixins.AccessorMinecraftClient;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10584;
import net.minecraft.class_1268;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_5134;
import net.minecraft.class_746;

public final class Iillllllilllll {
   private long iIIIiiiilIlIIiiiil = Long.MIN_VALUE;
   private double IIIIiiiillIIIiiiil;
   public static final int IlIiliiilllIiliiil = 9;
   private boolean iililiiilIIiiliiil;
   private class_243 iiIIiiiilIIlIiiiil;
   private long IiIIiiiilliIIiiiil = Long.MIN_VALUE;
   public static final double Illlliiilllllliiil = (double)6.0F;
   private final IIllllIlll llliliiililliliiil;
   public static final int iiIlliiilIIllliiil = 20;
   private final illillIlIilillIl IIliliiillIliliiil;
   public static final String lIIiliiiliIIiliiil = "-";
   private double liiiliiiliiiiliiil;
   public static final double illlliiilIillliiil = 0.6;
   private final iilllIiIIillIi liIiliiiliiIiliiil;
   public static final double lIllliiiliIllliiil = 2.6;
   private int lIlIiiiiliIlIiiiil;
   public static final double llilliiilililliiil = (double)2.0F;
   public static final double IIilliiillIilliiil = 0.35;
   private int llIIiiiililIIiiiil = -1;
   private String lIiiliiiliIiiliiil = lilIliilIl<invokedynamic>();
   private int Iliiliiillliiliiil = -1;
   private final Object ilIiliiilIiIiliiil;
   private long Iililiiillililiiil = Long.MIN_VALUE;
   public static final int IiIlliiilliIlliiil = 70;
   public static final int iiilliiilIIIiliiil = 3;
   private final lIlIiIIliIlIiIIl iIliliiilIlliliiil;
   public static final double iIilliiilIlilliiil = (double)0.25F;
   public static final double lillliiiliillliiil = 0.4;
   public static final double Iiilliiilliilliiil = 1.0E-4;
   private double iliiliiilIiiiliiil;

   public void IliIlllilIi() {
      this.lIiiliiiliIiiliiil = lilIliilIl<invokedynamic>();
   }

   private class_243 IIIilIIiiIIi(class_1309 reach, class_238 box, class_243 eye, double dist, double t) {
      double var8 = t + 0.6;
      if (box.method_1006(eye)) {
         this.Iliiliiillliiliiil = -1;
         return lllIliIlillIliIl.IIIIllIIIl(box, reach, eye, this.liIiliiiliiIiliiil.IilliliilIIi(), this.liIiliiiliiIiliiil.lIiiIiIlilli(), t, 0.1);
      } else {
         class_243 var10 = this.Iliiliiillliiliiil == reach.method_5628() && dist <= var8 + 0.4 ? IiIiliIiiiIi(box, this.iliiliiilIiiiliiil, this.liiiliiiliiiiliiil, this.IIIIiiiillIIIiiiil) : null;
         if (var10 != null && !lllIliIlillIliIl.IiIIlliIIl(eye, var10)) {
            var10 = null;
         }

         if (var10 == null || !(dist > t) && !Illillliilli(box, eye, var10, llIIliiilIIlii.liiiIIllIl(t))) {
            class_243 var11 = dist <= var8 ? lllIliIlillIliIl.IIIIllIIIl(box, reach, eye, this.liIiliiiliiIiliiil.IilliliilIIi(), this.liIiliiiliiIiliiil.lIiiIiIlilli(), t, 0.1) : null;
            class_243 var12 = var11 != null ? var11 : (var10 != null ? var10 : IiIIlliIIl(box, eye));
            if (dist <= var8 + 0.4) {
               this.IlIillIiilIi(reach.method_5628(), box, var12);
            } else {
               this.Iliiliiillliiliiil = -1;
            }

            return var12;
         } else {
            return var10;
         }
      }
   }

   static int IIiilIiiiIii(boolean leftBefore, int sameGoal) {
      return leftBefore ? Math.max(1, sameGoal - 1) : 3;
   }

   public Iillllllilllll(Object owner, iilllIiIIillIi slots, illillIlIilillIl ledger, lIlIiIIliIlIiIIl gates, IIllllIlll aim) {
      this.ilIiliiilIiIiliiil = owner;
      this.liIiliiiliiIiliiil = slots;
      this.IIliliiillIliliiil = ledger;
      this.iIliliiilIlliliiil = gates;
      this.llliliiililliliiil = aim;
   }

   public String Iiilliiliiil() {
      return this.lIiiliiiliIiiliiil;
   }

   static class_243 Iiiiliiiiiii(class_243 left, int stepsLeft) {
      if (left != null && stepsLeft > 0) {
         double var2 = left.method_1033();
         return Double.isFinite(var2) && !(var2 < 1.0E-4) && !(var2 / (double)stepsLeft > (double)2.0F) ? left.method_1021((double)1.0F / (double)stepsLeft) : class_243.field_1353;
      } else {
         return class_243.field_1353;
      }
   }

   public long IIillIiliIil() {
      return this.Iililiiillililiiil;
   }

   public void IIIllIIliIIl(float yaw, float pitch) {
      this.liIiliiiliiIiliiil.IIlllIlliIll(IiilIiIiliilIiIi.iiIllIiIIi, yaw, pitch, IIIliIilIIliIi.illIIiliiIilIIilii, 20);
   }

   public void iliIiiliiiii(class_1309 intent, iIllllIlIlllllIl t) {
      class_310 var3 = class_310.method_1551();
      class_746 var4 = var3.field_1724;
      if (var4 != null && var3.field_1687 != null && intent != null) {
         class_243 var5 = var4.method_33571();
         class_238 var6 = intent.method_5829();
         double var7 = lllIliIlillIliIl.IIlilIliiIli(var5, var6);
         long var9 = IIllIIlilIllIIli.IlIlllIlilIl();
         class_243 var11 = this.IIIilIIiiIIi(intent, var6, var5, var7, IIlllIlliIll(var4));
         if (var11 == null) {
            var11 = IiIIlliIIl(var6, var5);
         }

         class_243 var12 = iiIIlIIlIl(var11, this.Iilililiiili(intent, var9), this.IIIIllIIIl(var4, t, var9));
         float[] var13 = ilIiiIiIii.Ililllililil(var5, var12);
         IIIliIilIIliIi var14 = var7 < 2.6 ? IIIliIilIIliIi.IIiIIiliilIiIIilii : (var7 < (double)6.0F ? IIIliIilIIliIi.lilIIiliiiilIIilii : IIIliIilIIliIi.illIIiliiIilIIilii);
         this.liIiliiiliiIiliiil.IIlllIlliIll(IiilIiIiliilIiIi.IlIllIiIIi, var13[0], var13[1], var14, 70);
      }
   }

   public void IilliliilIIi() {
      this.Iliiliiillliiliiil = -1;
      this.iIIIiiiilIlIIiiiil = Long.MIN_VALUE;
      this.llIIiiiililIIiiiil = -1;
      this.IiIIiiiilliIIiiiil = Long.MIN_VALUE;
      this.iiIIiiiilIIlIiiiil = null;
      this.lIlIiiiiliIlIiiiil = 0;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) << 5 | (char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) >>> 11) << 13 | (char)((char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) << 5 | (char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) >>> 11) >>> 3) - var5))))))) ^ var5) ^ 10874) << 12 | (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) << 5 | (char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) >>> 11) << 13 | (char)((char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) << 5 | (char)((char)((char)(var4[var5] - '툽') ^ 21595) ^ var5) >>> 11) >>> 3) - var5))))))) ^ var5) ^ 10874) >>> 4) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Illillliilli(class_238 inner, class_243 eye, class_243 point, double box) {
      class_243 var5 = point.method_1020(eye);
      double var6 = var5.method_1033();
      return !(var6 > 1.0E-4) ? true : liiIIliliiiIIlil.Iilililiiili(inner, eye, eye.method_1019(var5.method_1021(box / var6)), 0.1);
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) >>> 4 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) << 12) - var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) >>> 4 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) << 12) - var5) << 6) - 23884) - 7018) << 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) >>> 4 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) << 12) - var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) >>> 4 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] + 15810))))) + var5))) + 12444) + 'ꆐ') + 22527) + 11664) - 14412))) << 12) - var5) << 6) - 23884) - 7018) >>> 14) - '野'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Illlllllilll(class_310 mc) {
      return ((AccessorMinecraftClient)mc).corzGetAttackCooldown() > 0;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 770350025464845577L ^ Long.rotateLeft(3609520633905715748L, 52) ^ 1662052044619277136L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 616395401419882002L ^ Long.rotateLeft(-1070205397101404803L, 60) ^ 3264193738809673581L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6728056727614063928L ^ Long.rotateLeft(-7780036785245804955L, 2) ^ -3190902791096643635L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3116763811527942776L ^ Long.rotateLeft(-3235917397150936300L, 54) ^ -4189391589927803728L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8907516813754816998L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 205166730414628804L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6340877417786499515L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1244758613927366510L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -789478118420105275L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6680917869911979848L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiIllIiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIiIlIliIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lliIliliIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiiIlliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiiIlIIIll<invokedynamic>());
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

   static class_243 IiIIlliIIl(class_238 box, class_243 eye) {
      class_243 var2 = box.method_1005();
      double var3 = box.field_1322 + 0.35;
      double var5 = box.field_1325 - (double)0.25F;
      double var7 = Math.max(var3, Math.min(var5, eye.field_1351));
      return new class_243(var2.field_1352, var7, var2.field_1350);
   }

   public boolean Ililllililil() {
      return this.iililiiilIIiiliiil;
   }

   private class_243 IIIIllIIIl(class_746 intent, iIllllIlIlllllIl p, long tick) {
      long var21 = 7694028807276332269L;
      long var23 = -8920563662022808858L;
      long var25 = -2168282031163425824L;
      class_243 var5 = lIlIliIlIl(intent);
      if (!intent.method_5799() && !intent.method_5771() && !intent.method_6101() && !intent.method_5765() && !intent.method_6128() && !intent.method_31549().field_7479) {
         class_243 var6;
         byte var48;
         label85: {
            var6 = intent.method_18798();
            var21 ^= ((long)(this.iIIIiiiilIlIIiiiil != Long.MIN_VALUE && tick - this.iIIIiiiilIlIIiiiil <= 1L && tick >= this.iIIIiiiilIlIIiiiil ? 1 : 0) << 32 ^ var21) & -1L << 32;
            if (p instanceof iIllllIlIlllllIl) {
               iIllllIlIlllllIl var10000 = p;

               try {
                  var38 = var10000.IlIlllIlilIl();
               } catch (Throwable var33) {
                  throw new MatchException(var33.toString(), var33);
               }

               var21 ^= ((long)var38 ^ var21) & -1L >>> 32;
               var23 ^= ((long)((int)var21) << 32 ^ var23) & -1L << 32;
               var10000 = p;

               try {
                  var10000.IiIlliIliiIl();
               } catch (Throwable var32) {
                  throw new MatchException(var32.toString(), var32);
               }

               var10000 = p;

               try {
                  var10000.IIlllIlliIll();
               } catch (Throwable var31) {
                  throw new MatchException(var31.toString(), var31);
               }

               var10000 = p;

               try {
                  var42 = var10000.Illlllllilll();
               } catch (Throwable var30) {
                  throw new MatchException(var30.toString(), var30);
               }

               IilIIIililIIIi var19 = var42;
               var10000 = p;

               try {
                  var10000.Iilllilliill();
               } catch (Throwable var29) {
                  throw new MatchException(var29.toString(), var29);
               }

               var10000 = p;

               try {
                  var10000.IIillIiliIil();
               } catch (Throwable var28) {
                  throw new MatchException(var28.toString(), var28);
               }

               var10000 = p;

               try {
                  var46 = var10000.Ililllililil();
               } catch (Throwable var27) {
                  throw new MatchException(var27.toString(), var27);
               }

               var21 ^= ((long)var46 ^ var21) & -1L >>> 32;
               long var47 = var23 ^ ((long)((int)var21) ^ var23) & -1L >>> 32;
               if (var19 == IilIIIililIIIi.IIillIililIillIili) {
                  var48 = 1;
                  break label85;
               }
            }

            var48 = 0;
         }

         var25 ^= ((long)var48 << 32 ^ var25) & -1L << 32;
         double var9 = iIIIlIlIIl(intent.method_24828(), var6.field_1351, (boolean)((int)(var25 >>> 32)), llIIlilIIl(intent));
         return new class_243((int)(var21 >>> 32) != 0 ? var6.field_1352 : var5.field_1352, var9, (int)(var21 >>> 32) != 0 ? var6.field_1350 : var5.field_1350);
      } else {
         return var5;
      }
   }

   static class_243 iiIIlIIlIl(class_243 goal, class_243 selfStep, class_243 targetStep) {
      if (goal == null) {
         return null;
      } else {
         class_243 var3 = selfStep == null ? class_243.field_1353 : selfStep;
         class_243 var4 = targetStep == null ? class_243.field_1353 : targetStep;
         return goal.method_1019(var3.method_1020(var4));
      }
   }

   private void IlIillIiilIi(int point, class_238 id, class_243 box) {
      this.Iliiliiillliiliiil = point;
      this.iliiliiilIiiiliiil = IIlilIliiIli(box.field_1352, id.field_1323, id.field_1320);
      this.liiiliiiliiiiliiil = IIlilIliiIli(box.field_1351, id.field_1322, id.field_1325);
      this.IIIIiiiillIIIiiiil = IIlilIliiIli(box.field_1350, id.field_1321, id.field_1324);
   }

   private class_243 Iilililiiili(class_1297 tick, long e) {
      long var9 = -6475928010780243724L;
      class_243 var4 = lIlIliIlIl(tick);
      class_10584 var5 = tick.method_66233();
      if (var5 != null && var5.method_66270()) {
         class_243 var6 = var5.method_66265();
         var9 ^= ((long)(this.llIIiiiililIIiiiil == tick.method_5628() && this.IiIIiiiilliIIiiiil == e - 1L && this.iiIIiiiilIIlIiiiil != null ? 1 : 0) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)((int)(var9 >>> 32) != 0 ? IIiilIiiiIii(var6.equals(this.iiIIiiiilIIlIiiiil), this.lIlIiiiiliIlIiiiil) : Iliilliiilii(var4, var6.method_1020(tick.method_73189()))) ^ var9) & -1L >>> 32;
         this.llIIiiiililIIiiiil = tick.method_5628();
         this.IiIIiiiilliIIiiiil = e;
         this.iiIIiiiilIIlIiiiil = var6;
         this.lIlIiiiiliIlIiiiil = (int)var9;
         return Iiiiliiiiiii(var6.method_1020(tick.method_73189()), (int)var9);
      } else {
         this.llIIiiiililIIiiiil = -1;
         return var5 == null ? var4 : class_243.field_1353;
      }
   }

   static double iIIIlIlIIl(boolean vy, double jump, boolean jumpVelocity, double onGround) {
      if (!Double.isFinite(jump)) {
         return (double)0.0F;
      } else if (!vy) {
         return jump;
      } else {
         return jumpVelocity ? Math.max(onGround, jump) : Math.max((double)0.0F, jump);
      }
   }

   static class_243 lIlIliIlIl(class_1297 e) {
      if (e == null) {
         return class_243.field_1353;
      } else {
         double var1 = e.method_23317() - e.field_6014;
         double var3 = e.method_23318() - e.field_6036;
         double var5 = e.method_23321() - e.field_5969;
         double var7 = var1 * var1 + var3 * var3 + var5 * var5;
         return Double.isFinite(var7) && !(var7 > (double)4.0F) ? new class_243(var1, var3, var5) : class_243.field_1353;
      }
   }

   private static double llIIlilIIl(class_746 p) {
      return p.method_45325(class_5134.field_23728) + (double)p.method_37416();
   }

   static double IIlilIliiIli(double lo, double hi, double v) {
      double var6 = v - hi;
      return var6 > 1.0E-4 && Double.isFinite(lo) ? Math.max((double)0.0F, Math.min((double)1.0F, (lo - hi) / var6)) : (double)0.5F;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) + '鬯') + var5) ^ var5) + 29871))))) + var5) + 30611));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IiIlliIliiIl(class_243 yaw, float pitch, float eye, class_1309 t, double reach) {
      return !(reach > (double)0.0F) ? false : lllIliIlillIliIl.Ilillllill(yaw, pitch, eye, t, reach, llIIliiilIIlii.liiiIIllIl(reach));
   }

   public boolean iIlIlllllill() {
      long var2 = -765130984151787856L;
      var2 ^= ((long)this.liiiIIllIl() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) >= 0 && this.iIliliiilIlliliiil.lIiiIiIlilli((int)(var2 >>> 32), false);
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '퇋') - var5) - var5) ^ var5) - 'ꥷ') ^ var5) ^ var5) ^ '볰') ^ '誹') + var5) - var5) ^ var5) + 30060) ^ var5))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '퇋') - var5) - var5) ^ var5) - 'ꥷ') ^ var5) ^ var5) ^ '볰') ^ '誹') + var5) - var5) ^ var5) + 30060) ^ var5))) + var5) >>> 11) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '퇋') - var5) - var5) ^ var5) - 'ꥷ') ^ var5) ^ var5) ^ '볰') ^ '誹') + var5) - var5) ^ var5) + 30060) ^ var5))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '퇋') - var5) - var5) ^ var5) - 'ꥷ') ^ var5) ^ var5) ^ '볰') ^ '誹') + var5) - var5) ^ var5) + 30060) ^ var5))) + var5) >>> 11) >>> 9))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double IIlllIlliIll(class_746 p) {
      return llIIliiilIIlii.IliIlllilIi(p.method_45325(class_5134.field_47759));
   }

   public int liiiIIllIl() {
      long var5 = 2833314761507857121L;
      class_746 var1 = class_310.method_1551().field_1724;
      if (var1 == null) {
         return -1;
      } else {
         double[] var2 = new double[9];

         for(long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 9; var7 += 4294967296L) {
            var2[(int)(var7 >>> 32)] = iIIiIIilIlIiIIil.iIlIlllllill(var1.method_31548().method_5438((int)(var7 >>> 32)));
         }

         double var3 = iIIiIIilIlIiIIil.lIiiIiIlilli(var2);
         return this.iIliliiilIlliliiil.IilliliilIIi((best) -> iIIiIIilIlIiIIil.iliIiiliiiii(best, var3), false);
      }
   }

   public boolean IlIlllIlilIl(class_1309 minCharge, float t, boolean crit, boolean serverSprinting) {
      long var9 = 5758673566613675717L;
      class_310 var5 = class_310.method_1551();
      class_746 var6 = var5.field_1724;
      if (var6 != null && var5.field_1687 != null && var5.field_1761 != null) {
         if (minCharge != null && minCharge.method_5805() && !minCharge.method_31481()) {
            var9 ^= ((long)this.liiiIIllIl() << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) < 0) {
               return this.IllIllllIl(lilIliilIl<invokedynamic>());
            } else if (!this.iIliliiilIlliliiil.lIiiIiIlilli((int)(var9 >>> 32), false)) {
               return this.IllIllllIl(lilIliilIl<invokedynamic>());
            } else if (!iIIiIIilIlIiIIil.liiiIIllIl(var6.method_6047())) {
               return this.IllIllllIl(lilIliilIl<invokedynamic>());
            } else if (Illlllllilll(var5)) {
               return this.IllIllllIl(lilIliilIl<invokedynamic>());
            } else if (var6.method_7261(0.5F) < t) {
               return this.IllIllllIl(lilIliilIl<invokedynamic>());
            } else if (!crit || !serverSprinting && Iilllilliill(var6)) {
               if (!this.IIliliiillIliliiil.iIlIlllllill()) {
                  return this.IllIllllIl(lilIliilIl<invokedynamic>());
               } else if (this.llliliiililliliiil.IIlllIlliIll()) {
                  var6.method_7346();
                  return this.IllIllllIl(lilIliilIl<invokedynamic>());
               } else {
                  class_243 var8 = var6.method_33571();
                  if (!IiIlliIliiIl(var8, this.liIiliiiliiIiliiil.IilliliilIIi(), this.liIiliiiliiIiliiil.lIiiIiIlilli(), minCharge, IIlllIlliIll(var6))) {
                     return this.IllIllllIl(lilIliilIl<invokedynamic>());
                  } else if (!IIllIIlilIllIIli.IIlilIliiIli(this.ilIiliiilIiIiliiil, minCharge)) {
                     return this.IllIllllIl(lilIliilIl<invokedynamic>());
                  } else {
                     var5.field_1761.method_2918(var6, minCharge);
                     var6.method_6104(class_1268.field_5808);
                     this.Iililiiillililiiil = IIllIIlilIllIIli.IlIlllIlilIl();
                     this.iililiiilIIiiliiil = crit;
                     this.lIiiliiiliIiiliiil = lilIliilIl<invokedynamic>();
                     return true;
                  }
               }
            } else {
               return this.IllIllllIl(lilIliilIl<invokedynamic>());
            }
         } else {
            return this.IllIllllIl(lilIliilIl<invokedynamic>());
         }
      } else {
         return this.IllIllllIl(lilIliilIl<invokedynamic>());
      }
   }

   static int Iliilliiilii(class_243 left, class_243 last) {
      double var2 = last == null ? (double)0.0F : last.method_1033();
      double var4 = left == null ? (double)0.0F : left.method_1033();
      return var4 > 1.0E-4 && Double.isFinite(var2) ? (int)Math.max(1L, Math.min(3L, Math.round(var2 / var4))) : 3;
   }

   public void lIiiIiIlilli(long tick) {
      this.iIIIiiiilIlIIiiiil = tick;
   }

   static class_243 IiIiliIiiiIi(class_238 fz, double box, double fy, double fx) {
      return new class_243(fz.field_1323 + box * (fz.field_1320 - fz.field_1323), fz.field_1322 + fy * (fz.field_1325 - fz.field_1322), fz.field_1321 + fx * (fz.field_1324 - fz.field_1321));
   }

   public static boolean Iilllilliill(class_746 p) {
      return !p.method_24828() && p.field_6017 > (double)0.0F && p.method_18798().field_1351 < (double)0.0F && !p.method_5624() && !p.method_5799() && !p.method_6101() && !p.method_5765() && !p.method_5771();
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~var4[var5]) ^ 12730))) ^ 11690) + var5))) ^ var5) + 22961) - '\ue642') - 'ꊍ'))) + 'ﻺ') >>> 6 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~var4[var5]) ^ 12730))) ^ 11690) + var5))) ^ var5) + 22961) - '\ue642') - 'ꊍ'))) + 'ﻺ') << 10) + '읧') ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean IllIllllIl(String why) {
      this.lIiiliiiliIiiliiil = why;
      return false;
   }
}
