package gg.corz;

import java.awt.Color;
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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1657;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2828;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_4184;

public class Ilillllill extends ilIllIiIll {
   private final iiIiiilIIliiil illlIIiIillIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill lIllIIiiIllIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)4.0F, (double)1.0F, (double)6.0F, 0.1);
   private final iiIiiilIIliiil IIilIIilIilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private class_1657 llilIIiililIIi;
   private final iiIiiilIIliiil lillIIiiillIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill iIilIIiIlilIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.08, (double)0.0F, 0.2, 0.01);
   private final iilliIlIIiliIl IlllIIillllIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 4, 1, 8);

   protected void Iilililiiili() {
      this.llilIIiililIIi = null;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ var5))) + var5) + 'ꉀ'))) ^ var5))) - 14686))) - var5) ^ '鿵') - 21446) >>> 12 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ var5))) + var5) + 'ꉀ'))) ^ var5))) - 14686))) - var5) ^ '鿵') - 21446) << 4) ^ '驝'))) + 31369));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.IIilIIilIilIIi.Iilllilliill()) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
            if (this.llilIIiililIIi != null && !this.llilIIiililIIi.method_29504() && !this.llilIIiililIIi.method_31481()) {
               List var2 = this.lIIlliIIll(this.llilIIiililIIi);
               if (!var2.isEmpty()) {
                  class_4184 var3 = Iiiilllliiilll.method_1561().field_4686;
                  if (var3 != null) {
                     class_243 var4 = var3.method_71156();
                     int var5 = IlIIilIlllIIilIl.lliiIlliIl;
                     int var6 = var5 >> 16 & 255;
                     int var7 = var5 >> 8 & 255;
                     int var8 = var5 & 255;
                     Color var9 = new Color(var6, var7, var8, 220);

                     for(class_243 var11 : var2) {
                        float var12 = 0.12F;
                        llilllililll.Illillliilli(event.IliiiIIilliiiIIi, (float)(var11.field_1352 - (double)var12 - var4.field_1352), (float)(var11.field_1351 - (double)var12 - var4.field_1351), (float)(var11.field_1350 - (double)var12 - var4.field_1350), (float)(var11.field_1352 + (double)var12 - var4.field_1352), (float)(var11.field_1351 + (double)var12 - var4.field_1351), (float)(var11.field_1350 + (double)var12 - var4.field_1350), var9);
                        float var13 = var12 + 0.01F;
                        class_238 var14 = new class_238(var11.field_1352 - (double)var13, var11.field_1351 - (double)var13, var11.field_1350 - (double)var13, var11.field_1352 + (double)var13, var11.field_1351 + (double)var13, var11.field_1350 + (double)var13);
                        iiIlIillIIllIill.iiiIlIIIll(event.IliiiIIilliiiIIi, var14, -1, (double)2.0F);
                     }

                     iIiiIIilIliiIIil.IiIiliIiiiIi();
                  }
               }
            }
         }
      }
   }

   protected void Illillliilli() {
      this.llilIIiililIIi = null;
   }

   private List<class_243> lIIlliIIll(class_1657 target) {
      ArrayList var2 = new ArrayList();
      float var3 = Iiiilllliiilll.method_61966().method_60637(true);
      double var4 = class_3532.method_16436((double)var3, target.field_6014, target.method_23317());
      double var6 = class_3532.method_16436((double)var3, target.field_6036, target.method_23318());
      double var8 = class_3532.method_16436((double)var3, target.field_5969, target.method_23321());
      class_2338 var10 = target.method_24515();
      double var11 = (double)target.method_17681() / (double)2.0F;
      int[][] var13 = new int[][]{{0, -1}, {0, 1}, {1, 0}, {-1, 0}, {1, -1}, {-1, -1}, {1, 1}, {-1, 1}};

      for(int var14 = 0; var14 <= 1; ++var14) {
         for(int[] var18 : var13) {
            class_2338 var19 = var10.method_10069(var18[0], var14, var18[1]);
            class_2680 var20 = Iiiilllliiilll.field_1687.method_8320(var19);
            if (var20.method_45474() || var20.method_26215()) {
               double var21 = var4 + (var18[0] != 0 ? (double)Math.signum((float)var18[0]) * var11 : (double)0.0F);
               double var23 = var6 + (double)var14 + (double)0.5F;
               double var25 = var8 + (var18[1] != 0 ? (double)Math.signum((float)var18[1]) * var11 : (double)0.0F);
               var2.add(new class_243(var21, var23, var25));
            }
         }
      }

      class_2338 var27 = var10.method_10086(2);
      if (Iiiilllliiilll.field_1687.method_8320(var27).method_45474() || Iiiilllliiilll.field_1687.method_8320(var27).method_26215()) {
         var2.add(new class_243(var4, var6 + (double)target.method_17682(), var8));
      }

      return var2;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) + var5) + 20820) + 'ꦖ'))) - 18309) ^ 22581) ^ var5) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double iiiIlIIIll() {
      return this.iIilIIiIlilIIi.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)(-((char)(-((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) ^ var5) << 11 | (char)((char)(var4[var5] + var5) ^ var5) >>> 5))) - var5) - 24917))) ^ var5) - var5))) << 2 | (char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) ^ var5) << 11 | (char)((char)(var4[var5] + var5) ^ var5) >>> 5))) - var5) - 24917))) ^ var5) - var5))) >>> 14))))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Ilillllill() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIllIIiiIllIIi, this.IlllIIillllIIi, this.illlIIiIillIIi, this.lillIIiiillIIi, this.IIilIIilIilIIi, this.iIilIIiIlilIIi});
   }

   private int iIlllIllll() {
      for(int var1 = 0; var1 < 9; ++var1) {
         class_1799 var2 = Iiiilllliiilll.field_1724.method_31548().method_5438(var1);
         class_1792 var4 = var2.method_7909();
         if (var4 instanceof class_1747 var3) {
            if (var3.method_7711() == class_2246.field_10540) {
               return var1;
            }
         }
      }

      return -1;
   }

   private boolean liIlliiIll(class_2338 pos) {
      for(class_2350 var5 : class_2350.values()) {
         class_2338 var6 = pos.method_10093(var5);
         if (!Iiiilllliiilll.field_1687.method_8320(var6).method_26215() && !Iiiilllliiilll.field_1687.method_8320(var6).method_45474()) {
            class_2350 var7 = var5.method_10153();
            class_243 var8 = class_243.method_24953(var6).method_1031((double)var7.method_10148() * (double)0.5F, (double)var7.method_10164() * (double)0.5F, (double)var7.method_10165() * (double)0.5F);
            if (this.lillIIiiillIIi.Iilllilliill()) {
               float[] var9 = this.IIllllIlll(var8);
               Iiiilllliiilll.field_1724.field_3944.method_52787(new class_2828.class_2831(var9[0], var9[1], Iiiilllliiilll.field_1724.method_24828(), Iiiilllliiilll.field_1724.field_5976));
            }

            class_3965 var10 = new class_3965(var8, var7, var6, false);
            Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var10);
            return true;
         }
      }

      return false;
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.llilIIiililIIi = this.IlIllllIll();
         if (this.llilIIiililIIi != null) {
            int var1 = this.iIlllIllll();
            if (var1 != -1) {
               List var2 = this.ilIllIiIll(this.llilIIiililIIi);
               var2.removeIf((pos) -> !Iiiilllliiilll.field_1687.method_8320(pos).method_45474());
               int var3 = Iiiilllliiilll.field_1724.method_31548().method_67532();
               Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
               int var4 = 0;

               for(class_2338 var6 : var2) {
                  if (var4 >= this.IlllIIillllIIi.Iilllilliill()) {
                     break;
                  }

                  if (this.liIlliiIll(var6)) {
                     ++var4;
                  }
               }

               Iiiilllliiilll.field_1724.method_31548().method_61496(var3);
            }
         }
      }
   }

   private float[] IIllllIlll(class_243 target) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      double var3 = target.field_1352 - var2.field_1352;
      double var5 = target.field_1351 - var2.field_1351;
      double var7 = target.field_1350 - var2.field_1350;
      double var9 = Math.sqrt(var3 * var3 + var7 * var7);
      float var11 = (float)Math.toDegrees(Math.atan2(var7, var3)) - 90.0F;
      float var12 = (float)(-Math.toDegrees(Math.atan2(var5, var9)));
      return new float[]{var11, var12};
   }

   private class_1657 IlIllllIll() {
      double var1 = this.lIllIIiiIllIIi.Iilllilliill();
      class_1657 var3 = null;
      double var4 = Double.MAX_VALUE;

      for(class_1657 var7 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var7 != Iiiilllliiilll.field_1724 && !var7.method_7325() && !var7.method_29504() && !iIIiIiIlIlIiIiIl.liiiIIllIl(var7)) {
            double var8 = (double)Iiiilllliiilll.field_1724.method_5739(var7);
            if (var8 <= var1 && var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) + var5))) - 30427))))) + 30982) - var5) >>> 5 | (char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) + var5))) - 30427))))) + 30982) - var5) << 11) + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5) >>> 2 | (char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5) << 14) - var5))) ^ '\ue719') - var5) << 15 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5) >>> 2 | (char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5) << 14) - var5))) ^ '\ue719') - var5) >>> 1) - '놡'))) ^ var5) - 7385));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private List<class_2338> ilIllIiIll(class_1657 target) {
      class_2338 var2 = target.method_24515();
      ArrayList var3 = new ArrayList();
      var3.add(var2.method_10095());
      var3.add(var2.method_10072());
      var3.add(var2.method_10078());
      var3.add(var2.method_10067());
      class_2338 var4 = var2.method_10084();
      var3.add(var4.method_10095());
      var3.add(var4.method_10072());
      var3.add(var4.method_10078());
      var3.add(var4.method_10067());
      if (this.illlIIiIillIIi.Iilllilliill()) {
         var3.add(var2.method_10086(2).method_10095());
         var3.add(var2.method_10086(2));
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5601440263757480394L ^ Long.rotateLeft(1097722496057019910L, 6) ^ 2669855784015737854L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3375484940893736025L ^ Long.rotateLeft(3940637868660041708L, 3) ^ -5198949913762856070L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3794755953923313423L ^ Long.rotateLeft(-3257068451217678019L, 39) ^ 1757784097098518330L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7136588926502520527L ^ Long.rotateLeft(3299176106048252797L, 6) ^ 667635455811296952L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2175580298392643402L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3606364422555764481L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7874713336952555310L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -83422152970789642L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3762178182279723789L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2944628700532389943L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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
}
