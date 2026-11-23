package gg.corz;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class IllIillllllIilll extends ilIllIiIll {
   private final iiIiiilIIliiil iIiiIIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IliiIIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl liliIIlill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 80, 1, 255);
   private final Map<Integer, iIIlllIiIlIlllIi> iliiIIlill = new HashMap();
   private final iilliIlIIiliIl iiliIIlill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 255, 1, 255);
   private final iilliIlIIiliIl IIiiIIlill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), "", 1, 1, 10);
   private final lliliIIiililiIIi IiliIIlill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iiIiiilIIliiil lliiIIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil lIiiIIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - var5) >>> 4 | (char)((char)((char)(var4[var5] + var5) - var5) - var5) << 12) + var5))) - var5))))) << 14 | (char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - var5) >>> 4 | (char)((char)((char)(var4[var5] + var5) - var5) - var5) << 12) + var5))) - var5))))) >>> 2) - var5) - var5) - 28957));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) << 2 | (char)(var4[var5] ^ var5) >>> 14) - '\ue33b') ^ var5))) + var5) << 12 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) << 2 | (char)(var4[var5] ^ var5) >>> 14) - '\ue33b') ^ var5))) + var5) >>> 4))) ^ 14091) - var5) - var5) + 1450) ^ '띍') - var5) - '\ud9e2') - '\ueb19') - 22975) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) << 2 | (char)(var4[var5] ^ var5) >>> 14) - '\ue33b') ^ var5))) + var5) << 12 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) << 2 | (char)(var4[var5] ^ var5) >>> 14) - '\ue33b') ^ var5))) + var5) >>> 4))) ^ 14091) - var5) - var5) + 1450) ^ '띍') - var5) - '\ud9e2') - '\ueb19') - 22975) << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll(class_4587 p, class_1657 px, double bone, double td, double dots, float pz, int py, int lw, float ms, boolean joint) {
      Matrix4f var14 = p.method_23760().method_23761();
      iIIlllIiIlIlllIi var15 = (iIIlllIiIlIlllIi)this.iliiIIlill.computeIfAbsent(px.method_5628(), (pzx) -> {
         iIIlllIiIlIlllIi var5 = new iIIlllIiIlIlllIi();
         var5.IililiIIIi = bone;
         var5.lililiIIIi = dots;
         var5.iililiIIIi = System.nanoTime();
         return var5;
      });
      var15.IIiiliIIIi = true;
      long var16 = System.nanoTime();
      double var18 = Math.min(0.1, Math.max(1.0E-4, (double)(var16 - var15.iililiIIIi) / (double)1.0E9F));
      double var20 = bone - var15.IililiIIIi;
      double var22 = dots - var15.lililiIIIi;
      double var24 = Math.sqrt(var20 * var20 + var22 * var22) / var18;
      var15.IililiIIIi = bone;
      var15.lililiIIIi = dots;
      var15.iililiIIIi = var16;
      double var26 = Math.min((double)1.0F, var24 / 4.3);
      var15.illiliIIIi += (var26 - var15.illiliIIIi) * Math.min((double)1.0F, var18 * (double)12.0F);
      var15.llliliIIIi += var24 * var18 * 3.4;
      double var28 = var15.llliliIIIi;
      double var30 = var15.illiliIIIi;
      float var32 = class_3532.method_17821(pz, px.field_6220, px.field_6283);
      float var33 = class_3532.method_17821(pz, px.field_6259, px.field_6241);
      double var34 = Math.toRadians((double)var32);
      double var36 = Math.toRadians((double)var33);
      double var38 = Math.toRadians((double)class_3532.method_16439(pz, px.field_6004, px.method_36455()));
      class_243 var40 = new class_243(-Math.sin(var34), (double)0.0F, Math.cos(var34));
      class_243 var41 = new class_243(-Math.cos(var34), (double)0.0F, -Math.sin(var34));
      class_243 var42 = new class_243(-Math.sin(var36), (double)0.0F, Math.cos(var36));
      class_243 var43 = new class_243(bone, td, dots);
      String var44 = px.method_18376().name();
      boolean var45 = var44.equals(IliIlllilIi<invokedynamic>()) || var44.equals(IliIlllilIi<invokedynamic>()) || var44.equals(IliIlllilIi<invokedynamic>());
      boolean var46 = !var45 && (var44.equals(IliIlllilIi<invokedynamic>()) || px.method_5715());
      boolean var47 = px.method_5765();
      class_243 var48;
      class_243 var49;
      class_243 var50;
      class_243 var51;
      class_243 var52;
      class_243 var53;
      class_243 var54;
      class_243 var55;
      class_243 var56;
      class_243 var57;
      class_243 var58;
      if (var45) {
         var48 = var43.method_1031((double)0.0F, 0.35, (double)0.0F);
         var49 = var48.method_1019(var40.method_1021(0.66));
         var50 = var49.method_1019(var40.method_1021(0.24)).method_1031((double)0.0F, 0.06, (double)0.0F);
         var51 = var49.method_1020(var41.method_1021(0.26));
         var52 = var49.method_1019(var41.method_1021(0.26));
         var53 = var48.method_1020(var41.method_1021(0.11));
         var54 = var48.method_1019(var41.method_1021(0.11));
         double var59 = Math.sin(var28) * var30 * (double)0.25F;
         var55 = var51.method_1020(var41.method_1021(0.18)).method_1020(var40.method_1021(0.45)).method_1031((double)0.0F, 0.05, (double)0.0F);
         var56 = var52.method_1019(var41.method_1021(0.18)).method_1020(var40.method_1021(0.45)).method_1031((double)0.0F, 0.05, (double)0.0F);
         var57 = var53.method_1020(var40.method_1021(0.7)).method_1031((double)0.0F, var59, (double)0.0F);
         var58 = var54.method_1020(var40.method_1021(0.7)).method_1031((double)0.0F, -var59, (double)0.0F);
      } else {
         double var69 = var46 ? 0.62 : 0.72;
         double var61 = 0.66;
         double var63 = var46 ? (double)0.5F : (double)0.0F;
         var48 = var43.method_1031((double)0.0F, var69, (double)0.0F);
         var49 = var48.method_1019(var40.method_1021(var61 * Math.sin(var63))).method_1031((double)0.0F, var61 * Math.cos(var63), (double)0.0F);
         var50 = var49.method_1031((double)0.0F, 0.22 * Math.cos(var38), (double)0.0F).method_1019(var42.method_1021(0.22 * Math.sin(var38)));
         var51 = var49.method_1020(var41.method_1021(0.28));
         var52 = var49.method_1019(var41.method_1021(0.28));
         var53 = var48.method_1020(var41.method_1021(0.11));
         var54 = var48.method_1019(var41.method_1021(0.11));
         double var65 = var47 ? 1.35 : Math.sin(var28) * var30 * 0.85;
         double var67 = Math.sin(var28) * var30 * 0.6 + (var46 ? 0.35 : (double)0.0F);
         var58 = liIlliiIll(var54, var40, 0.72, var65);
         var57 = liIlliiIll(var53, var40, 0.72, var47 ? 1.35 : -var65);
         var56 = liIlliiIll(var52, var40, 0.62, -var67);
         var55 = liIlliiIll(var51, var40, 0.62, var67);
      }

      iIiiIIilIliiIIil.IIIIllIIIl(var14, var50, var49, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var49, var51, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var49, var52, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var51, var55, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var52, var56, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var49, var48, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var48, var53, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var48, var54, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var53, var57, py, ms);
      iIiiIIilIliiIIil.IIIIllIIIl(var14, var54, var58, py, ms);
      if (joint) {
         float var70 = ms * 2.5F + 3.0F;

         for(class_243 var72 : new class_243[]{var50, var55, var56, var48, var57, var58}) {
            iIiiIIilIliiIIil.IIIIllIIIl(var14, var72, var72.method_1031((double)0.0F, 0.003, (double)0.0F), lw, var70);
         }
      }

   }

   public boolean iiiIlIIIll(class_1297 entity) {
      return this.IliIlllilIi() && this.IiliIIlill.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) && entity instanceof class_1657 && (entity != Iiiilllliiilll.field_1724 || iIIlIllIlIlIll.IlIlllIlilIl());
   }

   private static void iIlllIllll(class_4587 y2, float z2, float y1, float x1, float color, float z1, float lineWidth, Color matrixStack, int x2) {
      Matrix4f var9 = y2.method_23760().method_23761();
      iIiiIIilIliiIIil.iIIIlIlIIl(var9, z2, y1, x1, color, z1, lineWidth, matrixStack.getRGB(), (float)x2);
   }

   public static Color IlIllllIll(int alpha) {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return new Color(var1.getRed(), var1.getGreen(), var1.getBlue(), alpha);
   }

   private static void Iillllilll(class_4587 x1, float y1, float y2, float z1, float color, float matrixStack, float lineWidth, Color x2, int z2) {
      Matrix4f var9 = x1.method_23760().method_23761();
      int var10 = x2.getRGB();
      float var11 = (float)z2;
      float var12 = (color - y1) * 0.25F;
      float var13 = (matrixStack - y2) * 0.25F;
      float var14 = (lineWidth - z1) * 0.25F;
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, z1, y1 + var12, y2, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, z1, y1, y2 + var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, z1, y1, y2, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, z1, color - var12, y2, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, z1, color, y2 + var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, z1, color, y2, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, lineWidth, color - var12, y2, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, lineWidth, color, y2 + var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, y2, lineWidth, color, y2, lineWidth - var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, lineWidth, y1 + var12, y2, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, lineWidth, y1, y2 + var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, y2, lineWidth, y1, y2, lineWidth - var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, z1, y1 + var12, matrixStack, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, z1, y1, matrixStack - var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, z1, y1, matrixStack, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, z1, color - var12, matrixStack, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, z1, color, matrixStack - var13, z1, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, z1, color, matrixStack, z1 + var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, lineWidth, color - var12, matrixStack, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, lineWidth, color, matrixStack - var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, color, matrixStack, lineWidth, color, matrixStack, lineWidth - var14, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, lineWidth, y1 + var12, matrixStack, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, lineWidth, y1, matrixStack - var13, lineWidth, var10, var11);
      iIiiIIilIliiIIil.Iliilliiilii(var9, y1, matrixStack, lineWidth, y1, matrixStack, lineWidth - var14, var10, var11);
   }

   public void IIiilIiiiIii(illlllIillll render3DEvent) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         String var2 = this.IiliIIlill.Iilllilliill();
         Color var3 = IlIllllIll(this.iiliIIlill.Iilllilliill());
         Color var4 = IlIllllIll(this.liliIIlill.Iilllilliill());
         Color var5 = IlIllllIll(255);
         Color var6 = new Color(255, 255, 255, 235);

         for(class_1657 var8 : Iiiilllliiilll.field_1687.method_18456()) {
            if ((var8 != Iiiilllliiilll.field_1724 || iIIlIllIlIlIll.IlIlllIlilIl()) && !iIIiIiIlIlIiIiIl.liiiIIllIl(var8)) {
               class_4184 var9 = Iiiilllliiilll.field_1773.method_19418();
               render3DEvent.IliiiIIilliiiIIi.method_22903();
               if (var9 != null) {
                  class_243 var10 = var9.method_71156();
                  render3DEvent.IliiiIIilliiiIIi.method_22904(-var10.field_1352, -var10.field_1351, -var10.field_1350);
               }

               float var27 = render3DEvent.liiiiIIiiiiiiIIi;
               double var11 = class_3532.method_16436((double)var27, var8.field_6014, var8.method_23317());
               double var13 = class_3532.method_16436((double)var27, var8.field_6036, var8.method_23318());
               double var15 = class_3532.method_16436((double)var27, var8.field_5969, var8.method_23321());
               float var17 = var8.method_17681() / 2.0F;
               float var18 = var8.method_17682();
               float var19 = (float)var11 - var17;
               float var20 = (float)var13;
               float var21 = (float)var15 - var17;
               float var22 = (float)var11 + var17;
               float var23 = (float)var13 + var18;
               float var24 = (float)var15 + var17;
               if (var2.equals(IliIlllilIi<invokedynamic>())) {
                  Iillllilll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var3, this.IIiiIIlill.Iilllilliill());
               } else if (var2.equals(IliIlllilIi<invokedynamic>())) {
                  IIllllIlll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var4);
                  if (this.lIiiIIlill.Iilllilliill()) {
                     iIlllIllll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var5, this.IIiiIIlill.Iilllilliill());
                  }
               } else if (var2.equals(IliIlllilIi<invokedynamic>())) {
                  iIlllIllll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, var6, this.IIiiIIlill.Iilllilliill());
                  if (var9 != null) {
                     lllllillll(render3DEvent.IliiiIIilliiiIIi, var8, var11, var13, var15, var17, var18, var9, this.IIiiIIlill.Iilllilliill());
                  }
               } else if (var2.equals(IliIlllilIi<invokedynamic>())) {
                  if (this.iIiiIIlill.Iilllilliill()) {
                     iIlllIllll(render3DEvent.IliiiIIilliiiIIi, var19, var20, var21, var22, var23, var24, IlIllllIll(170), this.IIiiIIlill.Iilllilliill());
                  }

                  this.ilIllIiIll(render3DEvent.IliiiIIilliiiIIi, var8, var11, var13, var15, var27, -419430401, var5.getRGB(), (float)this.IIiiIIlill.Iilllilliill(), this.IliiIIlill.Iilllilliill());
               }

               if (this.lliiIIlill.Iilllilliill() && var9 != null) {
                  Iillllilll.IIlllIlliIll(var11, var13 + (double)var8.method_17682() * (double)0.5F, var15, var5.getRGB(), 1.0F);
               }

               render3DEvent.IliiiIIilliiiIIi.method_22909();
            }
         }

         this.iliiIIlill.values().removeIf((s) -> !s.IIiiliIIIi);

         for(iIIlllIiIlIlllIi var26 : this.iliiIIlill.values()) {
            var26.IIiiliIIIi = false;
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private static class_243 liIlliiIll(class_243 f, class_243 len, double pivot, double a) {
      return f.method_1019(len.method_1021(pivot * Math.sin(a))).method_1031((double)0.0F, -pivot * Math.cos(a), (double)0.0F);
   }

   public int lIIlliIIll() {
      Color var1 = new Color(IlIIilIlllIIilIl.lliiIlliIl);
      return -1138225346 - -119 ^ -45 ^ -1126698906 | var1.getRed() << (~1085672500 * 67 ^ 274386481) | var1.getGreen() << (((-158505277 - 101 >>> 31 | -158505277 - 101 << 1) >>> 9 | (-158505277 - 101 >>> 31 | -158505277 - 101 << 1) << 23) ^ 19 ^ 1593216381) | var1.getBlue();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - '\uee0b') - var5) >>> 3 | (char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - '\uee0b') - var5) << 13) ^ var5))) - var5) - var5) + var5))) ^ '颎') - var5))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) ^ 5463) + 30325) + var5) + var5) ^ '洛'))) >>> 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) ^ 5463) + 30325) + var5) + var5) ^ '洛'))) << 6) + var5) - var5) ^ var5) ^ var5) + var5) + 17321) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) ^ 5463) + 30325) + var5) + var5) ^ '洛'))) >>> 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) ^ 5463) + 30325) + var5) + var5) ^ '洛'))) << 6) + var5) - var5) ^ var5) ^ var5) + var5) + 17321) << 12)));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ '蜎') + var5) - 28738))))) << 10 | (char)(-((char)(-((char)((char)((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) ^ '蜎') + var5) - 28738))))) >>> 6))) - '폘'))) + var5) + 24431) - var5) - var5) + 15922) + 27238));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIllllIlll(class_4587 x2, float z1, float y1, float y2, float color, float x1, float z2, Color matrixStack) {
      Matrix4f var8 = x2.method_23760().method_23761();
      iIiiIIilIliiIIil.IIlilIliiIli(var8, z1, y1, y2, color, x1, z2, (float)matrixStack.getRed() / 255.0F, (float)matrixStack.getGreen() / 255.0F, (float)matrixStack.getBlue() / 255.0F, (float)matrixStack.getAlpha() / 255.0F);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8553305311786656999L ^ Long.rotateLeft(2879706324225841289L, 60) ^ 1502361949511474460L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7174394218963816037L ^ Long.rotateLeft(7932640832596610849L, 2) ^ 4957973288623397734L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 334440674507993952L ^ Long.rotateLeft(-319319131861831621L, 45) ^ -5708707817072488667L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6465955198641998767L ^ Long.rotateLeft(7216700068316369570L, 31) ^ 3762847011998974164L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7457320639081404468L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8325307101260701712L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4835241905724455510L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1090331736223213946L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7236838640179308659L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5410857517289888538L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   private static void lllllillll(class_4587 height, class_1657 player, double matrixStack, double centerZ, double bottomY, float lineWidth, float halfWidth, class_4184 centerX, int camera) {
      float var12 = Math.max(1.0F, player.method_6063());
      float var13 = class_3532.method_15363(player.method_6032() / var12, 0.0F, 1.0F);
      float var14 = centerX.method_19330() * ((float)Math.PI / 180F);
      float var15 = lineWidth + 0.18F;
      float var16 = (float)matrixStack + class_3532.method_15362((double)var14) * var15;
      float var17 = (float)bottomY + class_3532.method_15374((double)var14) * var15;
      float var18 = (float)centerZ;
      float var19 = var18 + halfWidth;
      Matrix4f var20 = height.method_23760().method_23761();
      float var21 = Math.max(3.0F, (float)camera + 2.0F);
      float var22 = Math.max(1.5F, (float)camera + 0.5F);
      iIiiIIilIliiIIil.Iliilliiilii(var20, var16, var18, var17, var16, var19, var17, -939524096, var21);
      if (var13 > 0.001F) {
         int var23 = -16777216 | Color.HSBtoRGB(var13 * 0.33F, 0.88F, 1.0F) & 16777215;
         iIiiIIilIliiIIil.Iliilliiilii(var20, var16, var18, var17, var16, var18 + halfWidth * var13, var17, var23, var22);
      }

   }

   public IllIillllllIilll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiliIIlill, this.liliIIlill, this.iiliIIlill, this.IIiiIIlill, this.lIiiIIlill, this.iIiiIIlill, this.IliiIIlill, this.lliiIIlill});
   }
}
