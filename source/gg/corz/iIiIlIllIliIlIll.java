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
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_239.class_240;
import org.joml.Matrix4f;

public class iIiIlIllIliIlIll extends ilIllIiIll {
   private long lilIiillll = System.currentTimeMillis();
   private final iiIiiilIIliiil Iliilillll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private double ilIIiillll;
   private class_2338 IilIiillll = null;
   private final lliliIIiililiIIi Iiiilillll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private double iIlIiillll;
   private double llIIiillll;
   private double iIIIiillll;
   private static final float iililillll = 0.006F;
   private static final float iIiilillll = 0.45F;
   private double iiIIiillll;
   private static final float IIiilillll = 0.1F;
   private class_265 iiiilillll;
   private final iliiliilIiiiliil iliilillll = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 687865855);
   private double lIlIiillll;
   private double IIlIiillll;
   private double IlIIiillll;
   private float illIiillll = 0.0F;
   private final iliiliilIiiiliil lliilillll = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -922746881);
   private double lIIIiillll;
   private boolean IllIiillll = false;
   private double liIIiillll;
   private double IIIIiillll;
   private static final float lIiilillll = 0.19F;
   private boolean lllIiillll = false;
   private final IIIIlilllIIIlill liiilillll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)8.0F, (double)1.0F, (double)67.0F, (double)0.5F);
   private double IiIIiillll;
   private static final float lililillll = 1.5F;
   private float iilIiillll = 0.0F;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 'ﭒ') ^ var5) + var5) + '훓') - var5) - var5) ^ var5) - 1173))) ^ '봙') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 'ﭒ') ^ var5) + var5) + '훓') - var5) - var5) ^ var5) - 1173))) ^ '봙') << 12) + var5) + '\ude47') - '싔') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 'ﭒ') ^ var5) + var5) + '훓') - var5) - var5) ^ var5) - 1173))) ^ '봙') >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 'ﭒ') ^ var5) + var5) + '훓') - var5) - var5) ^ var5) - 1173))) ^ '봙') << 12) + var5) + '\ude47') - '싔') << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll(class_4588 v2z, Matrix4f v3z, float v3x, float sweepX, float maxA, float halfW, float v2y, float v1x, float v4z, float v1z, float v4y, float sizeX, float v2x, float v4x, float mat, float minX, float v3y, float v1y, float buf) {
      int var20 = this.IIllllIlll(v1x, sweepX, maxA, halfW, v2y);
      int var21 = this.IIllllIlll(v4y, sweepX, maxA, halfW, v2y);
      int var22 = this.IIllllIlll(v4x, sweepX, maxA, halfW, v2y);
      int var23 = this.IIllllIlll(v3y, sweepX, maxA, halfW, v2y);
      if (var20 != 0 || var21 != 0 || var22 != 0 || var23 != 0) {
         v2z.method_22918(v3z, v1x, v4z, v1z).method_1336(255, 253, 248, var20);
         v2z.method_22918(v3z, v4y, sizeX, v2x).method_1336(255, 253, 248, var21);
         v2z.method_22918(v3z, v4x, mat, minX).method_1336(255, 253, 248, var22);
         v2z.method_22918(v3z, v3y, v1y, buf).method_1336(255, 253, 248, var23);
      }
   }

   public void IIiilIiiiIii(illlllIillll event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2338 var2 = null;
         if (Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1332) {
            var2 = ((class_3965)Iiiilllliiilll.field_1765).method_17777();
         }

         if (var2 == null) {
            this.lllIiillll = false;
         } else {
            this.lllIiillll = true;
            if (this.IilIiillll == null || !this.IilIiillll.equals(var2)) {
               this.IilIiillll = var2;
               class_2680 var3 = Iiiilllliiilll.field_1687.method_8320(var2);
               this.iiiilillll = var3.method_26218(Iiiilllliiilll.field_1687, var2);
               if (!this.iiiilillll.method_1110()) {
                  this.iiiIlIIIll(this.iiiilillll.method_1107().method_996(var2));
               }
            }
         }

         this.lIIlliIIll(event);
      }
   }

   private void lIIlliIIll(illlllIillll event) {
      if (this.IllIiillll && this.iiiilillll != null && !this.iiiilillll.method_1110() && this.IilIiillll != null) {
         long var2 = System.currentTimeMillis();
         float var4 = Math.min((float)(var2 - this.lilIiillll) / 1000.0F, 0.05F);
         this.lilIiillll = var2;
         if (this.lllIiillll) {
            this.illIiillll = Math.min(1.0F, this.illIiillll + var4 * 4.0F);
         } else {
            this.illIiillll = Math.max(0.0F, this.illIiillll - var4 * 5.0F);
            if (this.illIiillll <= 0.01F) {
               this.illIiillll = 0.0F;
               this.IllIiillll = false;
               return;
            }
         }

         this.iilIiillll += var4 * 0.1F;
         if (this.iilIiillll > 1.0F) {
            --this.iilIiillll;
         }

         float var5 = (float)this.liiilillll.Iilllilliill();
         float var6 = (float)((double)1.0F - Math.pow(0.001, (double)(var4 * var5) * 0.1));
         this.IIIIiillll += (this.IiIIiillll - this.IIIIiillll) * (double)var6;
         this.lIIIiillll += (this.liIIiillll - this.lIIIiillll) * (double)var6;
         this.iIIIiillll += (this.iiIIiillll - this.iIIIiillll) * (double)var6;
         this.IlIIiillll += (this.IIlIiillll - this.IlIIiillll) * (double)var6;
         this.llIIiillll += (this.lIlIiillll - this.llIIiillll) * (double)var6;
         this.ilIIiillll += (this.iIlIiillll - this.ilIIiillll) * (double)var6;
         float var7 = lllllillll(this.illIiillll);
         double var8;
         double var10;
         double var12;
         double var14;
         double var16;
         double var18;
         if (this.Iiiilillll.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
            double var20 = (this.IIIIiillll + this.IlIIiillll) / (double)2.0F;
            double var22 = (this.lIIIiillll + this.llIIiillll) / (double)2.0F;
            double var24 = (this.iIIIiillll + this.ilIIiillll) / (double)2.0F;
            double var26 = (this.IlIIiillll - this.IIIIiillll) / (double)2.0F * (double)var7;
            double var28 = (this.llIIiillll - this.lIIIiillll) / (double)2.0F * (double)var7;
            double var30 = (this.ilIIiillll - this.iIIIiillll) / (double)2.0F * (double)var7;
            var8 = var20 - var26 - (double)0.006F;
            var10 = var22 - var28 - (double)0.006F;
            var12 = var24 - var30 - (double)0.006F;
            var14 = var20 + var26 + (double)0.006F;
            var16 = var22 + var28 + (double)0.006F;
            var18 = var24 + var30 + (double)0.006F;
         } else {
            var8 = this.IIIIiillll - (double)0.006F;
            var10 = this.lIIIiillll - (double)0.006F;
            var12 = this.iIIIiillll - (double)0.006F;
            var14 = this.IlIIiillll + (double)0.006F;
            var16 = this.llIIiillll + (double)0.006F;
            var18 = this.ilIIiillll + (double)0.006F;
         }

         float var47 = this.Iiiilillll.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) ? var7 : Math.min(1.0F, this.illIiillll * 2.0F);
         int var21;
         int var48;
         if (this.Iliilillll.Iilllilliill()) {
            int var23 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
            var21 = iIlllIllll(var23, (int)(200.0F * var47));
            var48 = iIlllIllll(var23, (int)(40.0F * var47));
         } else {
            var21 = iIillliIlillli.IlIillIiilIi(this.lliilillll.Iilllilliill(), var47);
            var48 = iIillliIlillli.IlIillIiilIi(this.iliilillll.Iilllilliill(), var47);
         }

         class_243 var49 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         class_4587 var50 = event.IliiiIIilliiiIIi;
         var50.method_22903();
         var50.method_22904(-var49.field_1352, -var49.field_1351, -var49.field_1350);
         Matrix4f var25 = var50.method_23760().method_23761();
         double var51 = this.IIlIiillll - this.IiIIiillll;
         double var52 = this.lIlIiillll - this.liIIiillll;
         double var53 = this.iIlIiillll - this.iiIIiillll;
         double var32 = (var8 + var14) / (double)2.0F;
         double var34 = (var10 + var16) / (double)2.0F;
         double var36 = (var12 + var18) / (double)2.0F;
         double var38 = var51 > (double)0.0F ? (var14 - var8) / var51 : (double)1.0F;
         double var40 = var52 > (double)0.0F ? (var16 - var10) / var52 : (double)1.0F;
         double var42 = var53 > (double)0.0F ? (var18 - var12) / var53 : (double)1.0F;
         this.iiiilillll.method_1089((oocArgb, aMul, scaleZ, maxY, minX, focArgb) -> {
            double var29 = oocArgb + (double)this.IilIiillll.method_10263();
            double var31 = aMul + (double)this.IilIiillll.method_10264();
            double var33 = scaleZ + (double)this.IilIiillll.method_10260();
            double var35 = maxY + (double)this.IilIiillll.method_10263();
            double var37 = minX + (double)this.IilIiillll.method_10264();
            double var39 = focArgb + (double)this.IilIiillll.method_10260();
            double var41 = (var29 + var35) / (double)2.0F;
            double var43 = (var31 + var37) / (double)2.0F;
            double var45 = (var33 + var39) / (double)2.0F;
            double var47x = (var41 - (this.IiIIiillll + this.IIlIiillll) / (double)2.0F) * var38;
            double var49 = (var43 - (this.liIIiillll + this.lIlIiillll) / (double)2.0F) * var40;
            double var51 = (var45 - (this.iiIIiillll + this.iIlIiillll) / (double)2.0F) * var42;
            double var53 = (var35 - var29) * var38;
            double var55 = (var37 - var31) * var40;
            double var57 = (var39 - var33) * var42;
            double var59 = var32 + var47x - var53 / (double)2.0F;
            double var61 = var34 + var49 - var55 / (double)2.0F;
            double var63 = var36 + var51 - var57 / (double)2.0F;
            double var65 = var32 + var47x + var53 / (double)2.0F;
            double var67 = var34 + var49 + var55 / (double)2.0F;
            double var69 = var36 + var51 + var57 / (double)2.0F;
            iIiiIIilIliiIIil.IIlilIliiIli(var25, (float)var59, (float)var61, (float)var63, (float)var65, (float)var67, (float)var69, iIillliIlillli.IiIiliIiiiIi(var48), iIillliIlillli.IIlilIliiIli(var48), iIillliIlillli.Illillliilli(var48), iIillliIlillli.Iilililiiili(var48));
            if (var47 > 0.01F) {
               this.IlIllllIll(var25, var59, var61, var63, var65, var67, var69, var47);
            }

            iIiiIIilIliiIIil.iIIIlIlIIl(var25, (float)var59, (float)var61, (float)var63, (float)var65, (float)var67, (float)var69, var21, 1.5F);
         });
         var50.method_22909();
         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private void IlIllllIll(Matrix4f y2, double y1, double z1, double m, double x2, double z2, double x1, float alphaMul) {
      class_4588 var15 = iIiiIIilIliiIIil.IilliliilIIi();
      float var16 = (float)y1;
      float var17 = (float)z1;
      float var18 = (float)m;
      float var19 = (float)x2;
      float var20 = (float)z2;
      float var21 = (float)x1;
      float var22 = var19 - var16;
      if (!(var22 < 0.001F)) {
         float var23 = this.iilIiillll * 2.0F;
         float var24 = var23 <= 1.0F ? Iillllilll(var23) : Iillllilll(2.0F - var23);
         float var25 = 0.095F;
         float var26 = 0.45F * alphaMul;
         float var27 = var16 - var25 * var22 + (var22 + 0.19F * var22) * var24;
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var17, var18, var16, var20, var18, var19, var20, var18, var19, var17, var18);
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var17, var21, var19, var17, var21, var19, var20, var21, var16, var20, var21);
         this.liIlliiIll(var15, y2, var27, var16, var25, var22, var26, var16, var17, var18, var16, var17, var21, var16, var20, var21, var16, var20, var18);
         this.liIlliiIll(var15, y2, var27, var19, var25, var22, var26, var19, var17, var18, var19, var20, var18, var19, var20, var21, var19, var17, var21);
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var20, var18, var16, var20, var21, var19, var20, var21, var19, var20, var18);
         this.ilIllIiIll(var15, y2, var16, var22, var27, var25, var26, var16, var17, var18, var19, var17, var18, var19, var17, var21, var16, var17, var21);
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) >>> 14) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) >>> 14) << 6))) << 12 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) >>> 14) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) << 10 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') << 15 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - 8767))) - '蠔') >>> 1) - 19890) >>> 6) - var5))) >>> 14) << 6))) >>> 4) + var5) ^ 903));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int iIlllIllll(int alpha, int rgb) {
      return Math.max(1, Math.min(((-1728354361 << 29 | -1728354361 >>> 3) - -67 - 51 >>> 19 | (-1728354361 << 29 | -1728354361 >>> 3) - -67 - 51 << 13) ^ -308207972, rgb)) << (634217666 * -65 + 49 ^ 1725524727) | alpha & ((-1173271219 << 15 | -1173271219 >>> 17) - -117 ^ -1504107902);
   }

   private static float lllllillll(float x) {
      float var1 = 1.70158F;
      float var2 = var1 + 1.0F;
      return 1.0F + var2 * (float)Math.pow((double)(x - 1.0F), Double.longBitsToDouble(6516862012574157222L ^ 1907427793960454566L)) + var1 * (float)Math.pow((double)(x - 1.0F), Double.longBitsToDouble(-6104859514774589595L ^ -1493173496347201691L));
   }

   private void iiiIlIIIll(class_238 box) {
      this.IiIIiillll = box.field_1323;
      this.liIIiillll = box.field_1322;
      this.iiIIiillll = box.field_1321;
      this.IIlIiillll = box.field_1320;
      this.lIlIiillll = box.field_1325;
      this.iIlIiillll = box.field_1324;
      if (!this.IllIiillll) {
         String var2 = this.Iiiilillll.Iilllilliill();
         byte var3 = -1;
         switch (var2.hashCode()) {
            case 2228275:
               if (var2.equals(IliIlllilIi<invokedynamic>())) {
                  var3 = 0;
               }
               break;
            case 79973777:
               if (var2.equals(IliIlllilIi<invokedynamic>())) {
                  var3 = 1;
               }
         }

         switch (var3) {
            case 0:
               double var4 = (this.IiIIiillll + this.IIlIiillll) / (double)2.0F;
               double var6 = (this.liIIiillll + this.lIlIiillll) / (double)2.0F;
               double var8 = (this.iiIIiillll + this.iIlIiillll) / (double)2.0F;
               this.IIIIiillll = var4;
               this.lIIIiillll = var6;
               this.iIIIiillll = var8;
               this.IlIIiillll = var4;
               this.llIIiillll = var6;
               this.ilIIiillll = var8;
               break;
            case 1:
               this.IIIIiillll = this.IiIIiillll;
               this.lIIIiillll = this.liIIiillll + (double)1.0F;
               this.iIIIiillll = this.iiIIiillll;
               this.IlIIiillll = this.IIlIiillll;
               this.llIIiillll = this.lIlIiillll + (double)1.0F;
               this.ilIIiillll = this.iIlIiillll;
               break;
            default:
               this.IIIIiillll = this.IiIIiillll;
               this.lIIIiillll = this.liIIiillll;
               this.iIIIiillll = this.iiIIiillll;
               this.IlIIiillll = this.IIlIiillll;
               this.llIIiillll = this.lIlIiillll;
               this.ilIIiillll = this.iIlIiillll;
         }

         this.illIiillll = 0.0F;
         this.iilIiillll = 0.0F;
         this.IllIiillll = true;
      }

   }

   public void Iilililiiili() {
      this.IllIiillll = false;
      this.lllIiillll = false;
      this.IilIiillll = null;
      this.illIiillll = 0.0F;
      this.iilIiillll = 0.0F;
   }

   public iIiIlIllIliIlIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.Iliilillll, this.lliilillll, this.iliilillll, this.Iiiilillll, this.liiilillll});
   }

   private static float Iillllilll(float x) {
      return x < 0.5F ? 4.0F * x * x * x : 1.0F - (float)Math.pow((double)(-2.0F * x + 2.0F), Double.longBitsToDouble(-4258030169983281542L ^ -8871967988224354694L)) / 2.0F;
   }

   private void liIlliiIll(class_4588 v2z, Matrix4f v3x, float v1z, float maxA, float v1x, float v2y, float v1y, float mat, float sweepX, float v3y, float sizeX, float faceX, float v2x, float v4y, float v3z, float v4x, float v4z, float halfW, float buf) {
      float var20 = Math.abs(maxA - v1z);
      float var21 = v1x * v2y;
      if (!(var20 >= var21)) {
         float var22 = 1.0F - var20 / var21;
         float var23 = var22 * var22 * (3.0F - 2.0F * var22) * 0.5F;
         float var24 = var22 * var22 * var22 * var22 * 0.5F;
         int var25 = Math.max(0, Math.min(255, (int)((var23 + var24) * v1y * 255.0F)));
         if (var25 != 0) {
            v2z.method_22918(v3x, mat, sweepX, v3y).method_1336(255, 253, 248, var25);
            v2z.method_22918(v3x, sizeX, faceX, v2x).method_1336(255, 253, 248, var25);
            v2z.method_22918(v3x, v4y, v3z, v4x).method_1336(255, 253, 248, var25);
            v2z.method_22918(v3x, v4z, halfW, buf).method_1336(255, 253, 248, var25);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) >>> 6 | (char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) << 10) << 12 | (char)((char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) >>> 6 | (char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) << 10) >>> 4) ^ 'ꢰ') - var5) + 10601) - var5) - 28409) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) >>> 6 | (char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) << 10) << 12 | (char)((char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) >>> 6 | (char)((char)(~((char)(var4[var5] >>> 13 | var4[var5] << 3))) + var5) << 10) >>> 4) ^ 'ꢰ') - var5) + 10601) - var5) - 28409) << 12))) - '깔'))) ^ var5) - var5) - 18515) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) >>> 8 | (char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) << 8) ^ '뙎'))))) >>> 10 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) >>> 8 | (char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) << 8) ^ '뙎'))))) << 6) ^ var5) >>> 1 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) >>> 8 | (char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) << 8) ^ '뙎'))))) >>> 10 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) >>> 8 | (char)((char)((char)((char)((char)(~var4[var5]) + 'ﶬ') + var5) + '\ue157') ^ var5) << 8) ^ '뙎'))))) << 6) ^ var5) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int IIllllIlll(float maxA, float vx, float halfW, float sweepX, float sizeX) {
      float var6 = Math.abs(maxA - halfW);
      float var7 = sweepX * vx;
      if (var6 >= var7) {
         return 0;
      } else {
         float var8 = 1.0F - var6 / var7;
         float var9 = var8 * var8 * (3.0F - 2.0F * var8) * 0.5F;
         float var10 = var8 * var8 * var8 * var8 * 0.5F;
         return Math.max(0, Math.min(((~-1233524456 ^ 37) << 11 | (~-1233524456 ^ 37) >>> 21) + -49 ^ 817238756, (int)((var9 + var10) * sizeX * 255.0F)));
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4365514435435896273L ^ Long.rotateLeft(6903036288956279560L, 9) ^ -6291752373284893440L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3504797191585114854L ^ Long.rotateLeft(-6168153391898255600L, 12) ^ 3457674949326418807L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7891806144719002254L ^ Long.rotateLeft(7540480328454617950L, 1) ^ -1963992820653203108L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7418150667477881648L ^ Long.rotateLeft(7244272141631552106L, 18) ^ 5007117387338322978L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3413963786365288011L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -848527214102866476L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3250380325945392488L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3084496688317178808L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5408956511399376375L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4296203297169759273L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ 20486) << 11 | (char)((char)(-((char)(-var4[var5]))) ^ 20486) >>> 5) - '\ue80c') - var5) >>> 6 | (char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ 20486) << 11 | (char)((char)(-((char)(-var4[var5]))) ^ 20486) >>> 5) - '\ue80c') - var5) << 10) ^ 4861) << 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ 20486) << 11 | (char)((char)(-((char)(-var4[var5]))) ^ 20486) >>> 5) - '\ue80c') - var5) >>> 6 | (char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ 20486) << 11 | (char)((char)(-((char)(-var4[var5]))) ^ 20486) >>> 5) - '\ue80c') - var5) << 10) ^ 4861) >>> 15) ^ var5) ^ '＋') - 31130) + '뿔') ^ 12526))) ^ '쩲'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
