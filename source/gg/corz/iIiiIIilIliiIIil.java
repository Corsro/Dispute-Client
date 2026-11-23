package gg.corz;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class iIiiIIilIliiIIil {
   private static boolean IlilliIIil;
   private static final class_1921 lIllliIIil;
   public static final RenderPipeline llIlliIIil;
   private static double iIilliIIil;
   private static double lIilliIIil;
   public static final RenderPipeline ilIlliIIil;
   private static boolean illlliIIil;
   private static final Matrix4f lillliIIil;
   private static int IillliIIil;
   public static final RenderPipeline IiIlliIIil;
   private static final Vector3f iillliIIil;
   private static final class_1921 iIllliIIil;
   private static final class_1921 IIllliIIil;
   private static final class_4597.class_4598 llllliIIil;
   private static final class_1921 IlllliIIil;
   private static final class_1921 iiIlliIIil;
   private static double IIilliIIil;
   public static final RenderPipeline liIlliIIil;
   private static final class_9799 iIIlliIIil = new class_9799(2097152);
   public static final RenderPipeline IlIlliIIil;

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 11 | (char)(~((char)(-var4[var5]))) >>> 5))) ^ var5) >>> 9 | (char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 11 | (char)(~((char)(-var4[var5]))) >>> 5))) ^ var5) << 7) + 8575) + '联') ^ var5) + '묱'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float Iiilliiliiil(double worldY) {
      return (float)(worldY - lIilliIIil);
   }

   private static void Iilililiiili(class_4588 by, Matrix4f ax, float vc, float color, float dz, float cz, float dy, float bz, float cy, float az, float cx, float ay, float dx, float m, int bx) {
      Illlllllilll(4);
      by.method_22918(ax, vc, color, dz).method_39415(bx);
      by.method_22918(ax, cz, dy, bz).method_39415(bx);
      by.method_22918(ax, cy, az, cx).method_39415(bx);
      by.method_22918(ax, ay, dx, m).method_39415(bx);
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) >>> 1 | (char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) << 15) >>> 8 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) >>> 1 | (char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) << 15) << 8) ^ 5207) ^ var5) ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) >>> 1 | (char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) << 15) >>> 8 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) >>> 1 | (char)((char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) >>> 8 | (char)((char)((char)((char)(~var4[var5]) - var5)) + 21270) << 8) << 15) << 8) ^ 5207) ^ var5) ^ var5) ^ var5) << 15) ^ 12972) - var5) - var5) - '\ue038') ^ 27128) - '컎') - 29880));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void liiiIIllIl() {
      if (!illlliIIil) {
         illlliIIil = true;
         class_10799.method_67887(IlIlliIIil);
         class_10799.method_67887(llIlliIIil);
         class_10799.method_67887(ilIlliIIil);
         class_10799.method_67887(IiIlliIIil);
         class_10799.method_67887(liIlliIIil);
      }
   }

   static void IIiilIiiiIii(class_4588 endArgb, Matrix4f z2, float matrix, float y2, float vc, int x1, float startArgb, float x2, float width, int z1, float y1) {
      float var11 = startArgb - matrix;
      float var12 = x2 - y2;
      float var13 = width - vc;
      float var14 = var11 * var11 + var12 * var12 + var13 * var13;
      if (var14 > 1.0E-9F) {
         float var15 = (float)((double)1.0F / Math.sqrt((double)var14));
         var11 *= var15;
         var12 *= var15;
         var13 *= var15;
      }

      Illlllllilll(2);
      endArgb.method_22918(z2, matrix, y2, vc).method_39415(x1).method_22914(var11, var12, var13).method_75298(y1);
      endArgb.method_22918(z2, startArgb, x2, width).method_39415(z1).method_22914(var11, var12, var13).method_75298(y1);
   }

   public static void Iilllilliill(class_4587 matrices) {
      lillliIIil.set(matrices.method_23760().method_23761());
      class_4184 var1 = class_310.method_1551().field_1773.method_19418();
      class_243 var2 = var1.method_71156();
      IIilliIIil = var2.field_1352;
      lIilliIIil = var2.field_1351;
      iIilliIIil = var2.field_1350;
      iillliIIil.set(0.0F, 0.0F, -1.0F).rotate(var1.method_23767());
      Iillllilll.IliIlllilIi(var1);
   }

   public static void IiIiliIiiiIi() {
      if (!IlilliIIil) {
         IlilliIIil = true;
      }

      llllliIIil.method_22993();
   }

   public static void Iiiiliiiiiii(Matrix4f x2, float z2, float z1, float width, float startArgb, float y2, float x1, int y1, int endArgb, float matrix) {
      IIiilIiiiIii(IIlllIlliIll(), x2, z2, z1, width, y1, startArgb, y2, x1, endArgb, matrix);
   }

   public static void iIIIlIlIIl(Matrix4f argb, float width, float y1, float z1, float matrix, float x1, float z2, int x2, float y2) {
      class_4588 var9 = IIlllIlliIll();
      IIiilIiiiIii(var9, argb, width, y1, z1, x2, matrix, y1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z1, x2, matrix, y1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z2, x2, width, y1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, width, y1, z2, x2, width, y1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, width, x1, z1, x2, matrix, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, x1, z1, x2, matrix, x1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, x1, z2, x2, width, x1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, width, x1, z2, x2, width, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, width, y1, z1, x2, width, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z1, x2, matrix, x1, z1, x2, y2);
      IIiilIiiiIii(var9, argb, matrix, y1, z2, x2, matrix, x1, z2, x2, y2);
      IIiilIiiiIii(var9, argb, width, y1, z2, x2, width, x1, z2, x2, y2);
   }

   public static float IIIilIIiiIIi(double worldZ) {
      return (float)(worldZ - iIilliIIil);
   }

   public static class_4588 lIiiIiIlilli() {
      return llllliIIil.method_73477(lIllliIIil);
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) >>> 10) ^ var5) ^ '蛸') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) >>> 10) ^ var5) ^ '蛸') << 8) + 28982) - '鱓') ^ 25991) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) >>> 10) ^ var5) ^ '蛸') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') >>> 9 | (char)((char)((char)(var4[var5] - var5) - 21926) + '\uf32a') << 7) << 6) + 6686) >>> 10) ^ var5) ^ '蛸') << 8) + 28982) - '鱓') ^ 25991) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      IlIlliIIil = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56860}).withLocation(class_2960.method_60655(llIIlilIIl<invokedynamic>(), llIIlilIIl<invokedynamic>())).withVertexFormat(class_290.field_1576, class_5596.field_27382).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build();
      llIlliIIil = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56859}).withLocation(class_2960.method_60655(llIIlilIIl<invokedynamic>(), llIIlilIIl<invokedynamic>())).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build();
      ilIlliIIil = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56860}).withLocation(class_2960.method_60655(llIIlilIIl<invokedynamic>(), llIIlilIIl<invokedynamic>())).withVertexFormat(class_290.field_1576, class_5596.field_27382).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(false).build();
      IiIlliIIil = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56860}).withLocation(class_2960.method_60655(llIIlilIIl<invokedynamic>(), llIIlilIIl<invokedynamic>())).withVertexFormat(class_290.field_1576, class_5596.field_27379).withBlend(BlendFunction.ADDITIVE).withCull(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build();
      liIlliIIil = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56860}).withLocation(class_2960.method_60655(llIIlilIIl<invokedynamic>(), llIIlilIIl<invokedynamic>())).withVertexFormat(class_290.field_1576, class_5596.field_27379).withBlend(BlendFunction.ADDITIVE).withCull(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(false).build();
      iiIlliIIil = class_1921.method_75940(llIIlilIIl<invokedynamic>(), class_12247.method_75927(IlIlliIIil).method_75938());
      IIllliIIil = class_1921.method_75940(llIIlilIIl<invokedynamic>(), class_12247.method_75927(llIlliIIil).method_75938());
      lIllliIIil = class_1921.method_75940(llIIlilIIl<invokedynamic>(), class_12247.method_75927(ilIlliIIil).method_75938());
      iIllliIIil = class_1921.method_75940(llIIlilIIl<invokedynamic>(), class_12247.method_75927(IiIlliIIil).method_75938());
      IlllliIIil = class_1921.method_75940(llIIlilIIl<invokedynamic>(), class_12247.method_75927(liIlliIIil).method_75938());
      llllliIIil = IliIlllilIi();
      IillliIIil = 0;
      lillliIIil = new Matrix4f();
      iillliIIil = new Vector3f(0.0F, 0.0F, -1.0F);
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) << 9) ^ var5) + var5) ^ 3377) - var5) + var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) << 9) ^ var5) + var5) ^ 3377) - var5) + var5) << 2) + '꽮') ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) << 9) ^ var5) + var5) ^ 3377) - var5) + var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) << 13 | (char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 3) - var5) ^ var5) + 3979))) ^ var5) << 9) ^ var5) + var5) ^ 3377) - var5) + var5) << 2) + '꽮') ^ var5) >>> 15) - '谿'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) ^ 15143) ^ var5) + 'ꗌ') - 12717) + '긘'))) + 9366))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iIiiIIilIliiIIil() {
   }

   public static class_4588 IilliliilIIi() {
      return llllliIIil.method_73477(iiIlliIIil);
   }

   static void Illlllllilll(int n) {
      IillliIIil += n;
   }

   public static class_4588 IIlllIlliIll() {
      return llllliIIil.method_73477(IIllliIIil);
   }

   public static void IlIlllIlilIl(class_4588 bz, Matrix4f m, float cc, float bx, float by, int ay, float ca, float vc, float cx, int az, float cd, float ax, float cb, int cz, float dz, float cy, float dy, int dx) {
      Illlllllilll(4);
      bz.method_22918(m, cc, bx, by).method_39415(ay);
      bz.method_22918(m, ca, vc, cx).method_39415(az);
      bz.method_22918(m, cd, ax, cb).method_39415(cz);
      bz.method_22918(m, dz, cy, dy).method_39415(dx);
   }

   public static float Ililllililil(double worldX) {
      return (float)(worldX - IIilliIIil);
   }

   public static boolean IlIillIiilIi(double worldY, double worldX, double worldZ, float radius) {
      double var7 = (worldY - IIilliIIil) * (double)iillliIIil.x + (worldX - lIilliIIil) * (double)iillliIIil.y + (worldZ - iIilliIIil) * (double)iillliIIil.z;
      return var7 < (double)(-radius);
   }

   public static void Iliilliiilii(Matrix4f z1, float z2, float y2, float x2, float width, float argb, float x1, int matrix, float y1) {
      IIiilIiiiIii(IIlllIlliIll(), z1, z2, y2, x2, matrix, width, argb, x1, matrix, y1);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7640452617885092802L ^ Long.rotateLeft(6491026246691941933L, 34) ^ -5445262758363370434L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5409331047411504574L ^ Long.rotateLeft(574066455601883795L, 53) ^ 3444585855042238524L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -697152525348445153L ^ Long.rotateLeft(4378890882441455164L, 56) ^ 1422854582584985678L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 658780041037647560L ^ Long.rotateLeft(-6838064595995961689L, 33) ^ 633974589177220280L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7140180536031496522L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3643138584882166757L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7158502405859109015L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2424062318646351252L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -9012412449431682237L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2409225760075020183L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIIlliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiIIlIIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIlIliIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IllIllllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(illIlIilIl<invokedynamic>());
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

   private static class_4597.class_4598 IliIlllilIi() {
      LinkedHashMap var0 = new LinkedHashMap();
      var0.put(iiIlliIIil, new class_9799(1048576));
      var0.put(lIllliIIil, new class_9799(262144));
      var0.put(iIllliIIil, new class_9799(262144));
      var0.put(IlllliIIil, new class_9799(262144));
      var0.put(IIllliIIil, new class_9799(1048576));
      return class_4597.method_22992(var0, iIIlliIIil);
   }

   private static int iIlIlllllill(float g, float r, float a, float b) {
      return (int)(b * 255.0F) << 24 | (int)(g * 255.0F) << 16 | (int)(r * 255.0F) << 8 | (int)(a * 255.0F);
   }

   public static class_4588 iliIiiliiiii() {
      return llllliIIil.method_73477(iIllliIIil);
   }

   public static void IIIIllIIIl(Matrix4f matrix, class_243 width, class_243 a, int argb, float b) {
      Iliilliiilii(matrix, (float)width.field_1352, (float)width.field_1351, (float)width.field_1350, (float)a.field_1352, (float)a.field_1351, (float)a.field_1350, argb, b);
   }

   public static class_4588 IIIllIIliIIl() {
      return llllliIIil.method_73477(IlllliIIil);
   }

   public static void Illillliilli(Matrix4f ay, float argb, float ax, float dz, float az, float by, float cx, float bx, float bz, float dx, float dy, float cz, float m, int cy) {
      Iilililiiili(IilliliilIIi(), ay, argb, ax, dz, az, by, cx, bx, bz, dx, dy, cz, m, cy);
   }

   public static Matrix4f IIillIiliIil() {
      return lillliIIil;
   }

   public static void IiIlliIliiIl(class_4588 cz, Matrix4f ca, float cy, float vc, float bz, int cx, float ax, float cb, float by, int m, float cc, float az, float ay, int bx) {
      Illlllllilll(3);
      cz.method_22918(ca, cy, vc, bz).method_39415(cx);
      cz.method_22918(ca, ax, cb, by).method_39415(m);
      cz.method_22918(ca, cc, az, ay).method_39415(bx);
   }

   public static void IIlilIliiIli(Matrix4f z1, float x2, float a, float g, float matrix, float b, float z2, float r, float y1, float x1, float y2) {
      long var13 = -8166975245998705386L;
      class_4588 var11 = IilliliilIIi();
      var13 ^= ((long)iIlIlllllill(r, y1, x1, y2) << 32 ^ var13) & -1L << 32;
      Iilililiiili(var11, z1, x2, a, g, matrix, a, g, matrix, a, z2, x2, a, z2, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, b, g, x2, b, z2, matrix, b, z2, matrix, b, g, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, a, g, x2, b, g, matrix, b, g, matrix, a, g, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, a, z2, matrix, a, z2, matrix, b, z2, x2, b, z2, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, x2, a, g, x2, a, z2, x2, b, z2, x2, b, g, (int)(var13 >>> 32));
      Iilililiiili(var11, z1, matrix, a, g, matrix, b, g, matrix, b, z2, matrix, a, z2, (int)(var13 >>> 32));
   }
}
