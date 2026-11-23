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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_290;
import net.minecraft.class_2960;

public final class Iiliillliliill {
   public static final RenderPipeline ilIllllIiIiIllllIi;
   private static final float lliIlllIiiliIlllIi = -0.2F;
   private static final float iIiIlllIiIliIlllIi = -1.2F;
   private static final float IIiIlllIilIiIlllIi = -0.8F;
   private static final float IllIlllIilllIlllIi = -0.3F;
   public static final RenderPipeline iiiIlllIiIIIllllIi;
   private static final float lilIlllIiiilIlllIi = -0.4F;
   public static final RenderPipeline lIIllllIiiIIllllIi;
   public static final RenderPipeline liIllllIiiiIllllIi;
   public static final RenderPipeline IlIllllIillIllllIi;
   private static final float illIlllIiIilIlllIi = -0.6F;
   public static final RenderPipeline IiiIlllIiliiIlllIi;

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) >>> 12 | (char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) << 4))) << 5 | (char)(-((char)((char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) >>> 12 | (char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) << 4))) >>> 11) >>> 9 | (char)((char)(-((char)((char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) >>> 12 | (char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) << 4))) << 5 | (char)(-((char)((char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) >>> 12 | (char)((char)(-((char)(var4[var5] ^ '뢭'))) - var5) << 4))) >>> 11) << 7) ^ '\ud876'))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void IliIlllilIi() {
      lillllIiiillllIi.IliIlllilIi();
   }

   private static class_2960 iIlIlllllill(String name) {
      return class_2960.method_60655(IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>() + name);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) >>> 14) << 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) >>> 14) >>> 1) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) >>> 14) << 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ 23117) + 28277) ^ var5) - var5) + var5) >>> 14) >>> 1) >>> 2) + var5) ^ 31576) ^ 13825));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) + var5) >>> 2 | (char)((char)(~((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) + var5) << 14) - 18104) ^ 16601) - var5) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5387322871180745830L ^ Long.rotateLeft(2746743874931653080L, 14) ^ 4730200789360498520L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8913886985908651008L ^ Long.rotateLeft(-9136831092074009051L, 12) ^ -3336260128267064077L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2108054665012203467L ^ Long.rotateLeft(4933608585650490821L, 2) ^ 1040646173156033999L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8641476054615556034L ^ Long.rotateLeft(-2885044306615328208L, 18) ^ -7675849709141076738L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5500169887875072339L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1526060425323757372L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5967441677255579976L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 81404363526625467L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4896850067975612209L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7327070648316837034L;
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

   static {
      IiiIlllIiliiIlllIi = lIiiIiIlilli(IlIlllIlilIl<invokedynamic>(), DepthTestFunction.LEQUAL_DEPTH_TEST, true, true);
      iiiIlllIiIIIllllIi = lIiiIiIlilli(IlIlllIlilIl<invokedynamic>(), DepthTestFunction.GREATER_DEPTH_TEST, true, false);
      lIIllllIiiIIllllIi = iliIiiliiiii(IlIlllIlilIl<invokedynamic>(), DepthTestFunction.LEQUAL_DEPTH_TEST, true);
      IlIllllIillIllllIi = iliIiiliiiii(IlIlllIlilIl<invokedynamic>(), DepthTestFunction.GREATER_DEPTH_TEST, false);
      ilIllllIiIiIllllIi = IIIllIIliIIl(IlIlllIlilIl<invokedynamic>(), DepthTestFunction.LEQUAL_DEPTH_TEST, true);
      liIllllIiiiIllllIi = IIIllIIliIIl(IlIlllIlilIl<invokedynamic>(), DepthTestFunction.GREATER_DEPTH_TEST, false);
   }

   private static RenderPipeline IIIllIIliIIl(String name, DepthTestFunction depth, boolean bias) {
      RenderPipeline.Builder var3 = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56859}).withLocation(iIlIlllllill(name)).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthTestFunction(depth).withDepthWrite(false);
      if (bias) {
         var3 = var3.withDepthBias(-1.2F, -0.2F);
      }

      return IilliliilIIi(var3.build());
   }

   private static RenderPipeline iliIiiliiiii(String name, DepthTestFunction depth, boolean bias) {
      RenderPipeline.Builder var3 = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(iIlIlllllill(name)).withVertexShader(liiiIIllIl(IlIlllIlilIl<invokedynamic>())).withFragmentShader(liiiIIllIl(IlIlllIlilIl<invokedynamic>())).withUniform(IlIlllIlilIl<invokedynamic>(), class_10789.field_60031).withVertexFormat(class_290.field_1576, class_5596.field_27382).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthTestFunction(depth).withDepthWrite(false);
      if (bias) {
         var3 = var3.withDepthBias(-0.4F, -0.8F);
      }

      return IilliliilIIi(var3.build());
   }

   private static RenderPipeline IilliliilIIi(RenderPipeline p) {
      return class_10799.method_67887(p);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) + var5))))))) - var5) ^ '衤') ^ var5) << 11 | (char)((char)((char)((char)(-((char)(~((char)(~((char)((char)(-((char)(var4[var5] >>> 7 | var4[var5] << 9))) + var5))))))) - var5) ^ '衤') ^ var5) >>> 5) ^ 14527) - '苝'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) << 10 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) >>> 6) ^ var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) << 10 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) >>> 6) ^ var5) ^ var5) << 14) ^ var5) + 8056) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) << 10 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) >>> 6) ^ var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) << 10 | (char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 9013) >>> 1 | (char)(var4[var5] ^ 9013) << 15) ^ '쫦') - '윷'))) - var5) >>> 6) ^ var5) ^ var5) << 14) ^ var5) + 8056) >>> 1) ^ var5) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static RenderPipeline lIiiIiIlilli(String cull, DepthTestFunction name, boolean depth, boolean bias) {
      RenderPipeline.Builder var4 = RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(iIlIlllllill(cull)).withVertexShader(liiiIIllIl(IlIlllIlilIl<invokedynamic>())).withFragmentShader(liiiIIllIl(IlIlllIlilIl<invokedynamic>())).withSampler(IlIlllIlilIl<invokedynamic>()).withUniform(IlIlllIlilIl<invokedynamic>(), class_10789.field_60031).withVertexFormat(class_290.field_1590, class_5596.field_27382).withBlend(BlendFunction.TRANSLUCENT).withCull(depth).withDepthTestFunction(name).withDepthWrite(false);
      if (bias) {
         var4 = var4.withDepthBias(-0.3F, -0.6F);
      }

      return IilliliilIIi(var4.build());
   }

   private Iiliillliliill() {
   }

   private static class_2960 liiiIIllIl(String name) {
      return class_2960.method_60655(IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>() + name);
   }
}
