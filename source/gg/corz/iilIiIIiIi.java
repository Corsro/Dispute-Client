package gg.corz;

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
import net.minecraft.class_1297;
import net.minecraft.class_1308;
import net.minecraft.class_1311;
import net.minecraft.class_1569;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import org.joml.Matrix4f;

public class iilIiIIiIi extends ilIllIiIll {
   private final lliliIIiililiIIi lillIiiiillIii = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static iilIiIIiIi IlllIiillllIii;
   private static final int iIIlIiiIlIlIii = 3731016;
   private int llilIiiililIii = 3731016;
   private static final float IiIlIiiliIlIii = 0.2F;
   private int iIilIiiIlilIii = 16729670;
   private int IIilIiilIilIii = Integer.MIN_VALUE;
   private final lliliIIiililiIIi illlIiiIillIii = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final float llIlIiiilIlIii = 0.18F;
   private static final int IIIlIiilIIlIii = 16729670;
   private static final float iiIlIiiIIllIii = 1.6F;
   private static final float lIllIiiiIllIii = 2.2F;

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8984304442493957400L ^ Long.rotateLeft(-4123018930661113534L, 7) ^ 2458343257464144504L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6002371670174575473L ^ Long.rotateLeft(4031248316387491208L, 58) ^ -7263273107710292500L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9161160557123428487L ^ Long.rotateLeft(-2300557701332977604L, 29) ^ -3257033482036972197L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7081043978989231017L ^ Long.rotateLeft(-4759923462952009775L, 29) ^ -8803555997221487485L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2785088348467342423L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4341986912749828686L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2368563746630343794L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5342988301649663644L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5144664598616262638L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1031538386981967241L;
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

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 7) << 10 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 7) >>> 6) - 14321) - 19375) + 12571) ^ var5) ^ '쾯') - var5) - '\uf734') - var5) - '\uf20a') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) - 'ꚃ') - '쉘'))))) - 13883) + var5) ^ var5) ^ var5) + var5))) ^ var5))) - var5) + '\ue9fb') - var5) ^ var5))) << 1 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) - 'ꚃ') - '쉘'))))) - 13883) + var5) ^ var5) ^ var5) + var5))) ^ var5))) - var5) + '\ue9fb') - var5) ^ var5))) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean IlIllllIll(int kind, int filter) {
      return kind == (-1979242424 * 954437177 * 89 ^ 947890890) || kind == filter - 1;
   }

   static int lIIlliIIll(class_1297 entity) {
      if (entity instanceof class_1308 && entity.method_5805()) {
         return !(entity instanceof class_1569) && entity.method_5864().method_5891() != class_1311.field_6302 ? 2 : 1;
      } else {
         return 0;
      }
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var2 = this.lillIiiiillIii.Ililllililil();
         if (var2 != 0) {
            this.liIlliiIll();
            class_243 var3 = llilllililll.IliIlllilIi();
            double var4 = var3.field_1352;
            double var6 = var3.field_1351;
            double var8 = var3.field_1350;
            Matrix4f var10 = event.IliiiIIilliiiIIi.method_23760().method_23761();
            float var11 = event.liiiiIIiiiiiiIIi;
            int var12 = this.illlIiiIillIii.Ililllililil();
            int var13 = 0;

            for(class_1297 var15 : Iiiilllliiilll.field_1687.method_18112()) {
               int var16 = lIIlliIIll(var15);
               if (var16 != 0 && IlIllllIll(var12, var16)) {
                  double var17 = class_3532.method_16436((double)var11, var15.field_6014, var15.method_23317()) - var15.method_23317();
                  double var19 = class_3532.method_16436((double)var11, var15.field_6036, var15.method_23318()) - var15.method_23318();
                  double var21 = class_3532.method_16436((double)var11, var15.field_5969, var15.method_23321()) - var15.method_23321();
                  class_238 var23 = var15.method_5829();
                  double var24 = (var23.field_1323 + var23.field_1320) * (double)0.5F + var17;
                  double var26 = (var23.field_1322 + var23.field_1325) * (double)0.5F + var19;
                  double var28 = (var23.field_1321 + var23.field_1324) * (double)0.5F + var21;
                  double var30 = var23.field_1320 - var23.field_1323;
                  double var32 = var23.field_1325 - var23.field_1322;
                  double var34 = var23.field_1324 - var23.field_1321;
                  float var36 = (float)(Math.sqrt(var30 * var30 + var32 * var32 + var34 * var34) * (double)0.5F) + 0.5F;
                  if (!iIiiIIilIliiIIil.IlIillIiilIi(var24, var26, var28, var36)) {
                     float var37 = (float)(var23.field_1323 + var17 - var4);
                     float var38 = (float)(var23.field_1322 + var19 - var6);
                     float var39 = (float)(var23.field_1321 + var21 - var8);
                     float var40 = (float)(var23.field_1320 + var17 - var4);
                     float var41 = (float)(var23.field_1325 + var19 - var6);
                     float var42 = (float)(var23.field_1324 + var21 - var8);
                     int var43 = var16 == 1 ? this.iIilIiiIlilIii : this.llilIiiililIii;
                     int var44 = -16777216 | var43;
                     if (var2 == 1) {
                        iIiiIIilIliiIIil.IIlilIliiIli(var10, var37, var38, var39, var40, var41, var42, (float)(var43 >> 16 & 255) / 255.0F, (float)(var43 >> 8 & 255) / 255.0F, (float)(var43 & 255) / 255.0F, 0.2F);
                        iIiiIIilIliiIIil.iIIIlIlIIl(var10, var37, var38, var39, var40, var41, var42, var44, 1.6F);
                     } else {
                        IIllllIlll(var10, var37, var38, var39, var40, var41, var42, var44, 2.2F);
                     }

                     ++var13;
                  }
               }
            }

            if (var13 > 0) {
               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) << 12) - '髙') - var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) << 12) - '髙') - var5) - var5) >>> 12) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) << 12) - '髙') - var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 2835) ^ '\uea3f') ^ var5))) ^ var5) << 12) - '髙') - var5) - var5) >>> 12) << 13) - var5) + var5) + var5) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int ilIllIiIll(int t, int theme, float base) {
      int var3 = Math.round((float)(t >> 16 & 255) * (1.0F - base) + (float)(theme >> 16 & 255) * base);
      int var4 = Math.round((float)(t >> 8 & 255) * (1.0F - base) + (float)(theme >> 8 & 255) * base);
      int var5 = Math.round((float)(t & 255) * (1.0F - base) + (float)(theme & 255) * base);
      return var3 << 16 | var4 << 8 | var5;
   }

   private static void IIllllIlll(Matrix4f x2, float z2, float y2, float argb, float x1, float y1, float z1, int w, float m) {
      float var9 = (x1 - z2) * 0.25F;
      float var10 = (y1 - y2) * 0.25F;
      float var11 = (z1 - argb) * 0.25F;

      for(int var12 = 0; var12 < 8; ++var12) {
         boolean var13 = (var12 & 1) == 0;
         boolean var14 = (var12 & 2) == 0;
         boolean var15 = (var12 & 4) == 0;
         float var16 = var13 ? z2 : x1;
         float var17 = var14 ? y2 : y1;
         float var18 = var15 ? argb : z1;
         float var19 = var13 ? var9 : -var9;
         float var20 = var14 ? var10 : -var10;
         float var21 = var15 ? var11 : -var11;
         iIiiIIilIliiIIil.Iliilliiilii(x2, var16, var17, var18, var16 + var19, var17, var18, w, m);
         iIiiIIilIliiIIil.Iliilliiilii(x2, var16, var17, var18, var16, var17 + var20, var18, w, m);
         iIiiIIilIliiIIil.Iliilliiilii(x2, var16, var17, var18, var16, var17, var18 + var21, w, m);
      }

   }

   public iilIiIIiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illlIiiIillIii, this.lillIiiiillIii});
      IlllIiillllIii = this;
   }

   public static int iiiIlIIIll(class_1297 entity) {
      long var3 = 734795451204448382L;
      iilIiIIiIi var1 = IlllIiillllIii;
      if (var1 != null && var1.IliIlllilIi() && var1.lillIiiiillIii.Ililllililil() == 0) {
         var3 ^= ((long)lIIlliIIll(entity) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != 0 && IlIllllIll(var1.illlIiiIillIii.Ililllililil(), (int)(var3 >>> 32)) && entity.method_73183().method_8608()) {
            var1.liIlliiIll();
            return (((-1952629598 ^ 29) << 9 | (-1952629598 ^ 29) >>> 23) + 39) * 678152731 ^ 388061066 | ((int)(var3 >>> 32) == (-950960991 + 7 + -27 ^ -950961012) ? var1.iIilIiiIlilIii : var1.llilIiiililIii);
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) << 9 | (char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) >>> 7) << 10 | (char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) << 9 | (char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) >>> 7) >>> 6) + var5) - 21008) + '났') - 21481) + var5) - var5) + 10517) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) << 9 | (char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) >>> 7) << 10 | (char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) << 9 | (char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) + var5))) ^ '눆') - 25315))) >>> 7) >>> 6) + var5) - 21008) + '났') - 21481) + var5) - var5) + 10517) - var5) << 5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ 422) ^ var5) - var5) + var5) - var5) + '뵅'))) + var5))) >>> 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ 422) ^ var5) - var5) + var5) - var5) + '뵅'))) + var5))) << 10) - 9369) - 27868) << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ 422) ^ var5) - var5) + var5) - var5) + '뵅'))) + var5))) >>> 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) ^ 422) ^ var5) - var5) + var5) - var5) + '뵅'))) + var5))) << 10) - 9369) - 27868) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIlliiIll() {
      long var2 = 1584051474343289863L;
      var2 ^= ((long)(IlIIilIlllIIilIl.lliiIlliIl & (~(696217831 * -1030792151) * 1090785345 + 121 ^ 2027640966)) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != this.IIilIiilIilIii) {
         this.IIilIiilIilIii = (int)(var2 >>> 32);
         this.iIilIiiIlilIii = ilIllIiIll(-(~444835004) ^ 444392187, (int)(var2 >>> 32), 0.18F);
         this.llilIiiililIii = ilIllIiIll(-(-853315726 * 25) ^ -139267178, (int)(var2 >>> 32), 0.18F);
      }
   }
}
