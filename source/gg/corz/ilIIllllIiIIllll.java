package gg.corz;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_7833;
import net.minecraft.class_9799;
import org.joml.Matrix4f;

public final class ilIIllllIiIIllll {
   public static final RenderPipeline lilillIill;
   private static final float[] IllillIill = new float[]{0.05F, 0.14F, 0.5F, 0.0F};
   private static final int lIlillIill = 32;
   public static final float IIlillIill = 0.04F;
   public static final float iIIillIill = 0.26F;
   private static final Function<class_2960, class_1921> lliillIill;
   private static final float lllillIill = 0.012F;
   private static final class_1921 IiiillIill;
   public static final float ilIillIill = 1.75F;
   public static final float IlIillIill = 0.9F;
   private static final class_1921 iliillIill;
   public static final RenderPipeline IilillIill;
   public static final float IiIillIill = 0.9F;
   public static final float liIillIill = 0.15F;
   private static final int[] illillIill = new int[]{0, 20, 16, 4, 16, 4};
   private static class_4597.class_4598 lIIIilIill;
   private static final Function<class_2960, class_1921> IliillIill;
   private static final Matrix4f iiiillIill;
   private static final Function<class_2960, class_1921> iIiillIill;
   private static class_9799 IIIIilIill;
   public static final RenderPipeline iilillIill;
   public static final RenderPipeline lIiillIill;
   private static final float[] liiillIill;
   private static final float[] iIlillIill = new float[]{0.0F, 0.3F, 0.38F, 0.44F};
   public static final float iiIillIill = 0.3F;
   public static final float llIillIill = 0.32F;
   public static final RenderPipeline IIiillIill;

   public static int Iilllilliill(int alpha, float rgb) {
      return Math.round(Illiiiilllliiiil.lIiiIiIlilli(rgb) * 255.0F) << (1035467682 * -630453915 ^ -85 ^ 305727321) | alpha & (~((782105914 ^ -77) * 1749801491) ^ -1718494677);
   }

   private static int IiIlliIliiIl(int y, float cut, float alpha, float rgb) {
      float var4 = Math.max(0.0F, 1.0F - Math.abs(alpha - rgb) / 0.9F);
      return Math.round(Illiiiilllliiiil.lIiiIiIlilli(var4 * cut) * 255.0F) << (-((350628541 >>> 11 | 350628541 << 21) ^ -53) ^ -87 ^ -1470274749) | y & ((1232805012 * 619094385 >>> 21 | 1232805012 * 619094385 << 11) ^ 1165319477);
   }

   private static void IIIllIIliIIl(class_4588 vc, float[][] rgb, float cut, float boxes, int alpha) {
      for(int var5 = 0; var5 < 6; ++var5) {
         float[] var6 = rgb[var5 * 2 + 1];
         float var7 = var6[0] - 0.15F;
         float var8 = var6[1];
         float var9 = var6[2] - 0.15F;
         float var10 = var6[3] + 0.15F;
         float var11 = var6[4];
         float var12 = var6[5] + 0.15F;
         switch (var5) {
            case 0:
               var8 = 24.0F;
               break;
            case 1:
               var7 = -4.0F;
               var10 = 4.0F;
               var8 = 12.0F;
               var11 = 24.0F;
               break;
            case 2:
               var10 = -4.0F;
               var8 = 12.0F;
               break;
            case 3:
               var7 = 4.0F;
               var8 = 12.0F;
               break;
            case 4:
               var10 = 0.0F;
               var11 = 12.0F;
               break;
            default:
               var7 = 0.0F;
               var11 = 12.0F;
         }

         float var13 = Math.max(var8, cut - 0.9F);
         float var14 = Math.min(var11, cut + 0.9F);
         if (!(var14 - var13 <= 0.001F)) {
            float var15 = Math.max(var13, Math.min(var14, cut));
            int var16 = illillIill[var5];

            for(int var17 = 0; var17 < 2; ++var17) {
               float var18 = var17 == 0 ? var13 : var15;
               float var19 = var17 == 0 ? var15 : var14;
               if (!(var19 - var18 <= 0.001F)) {
                  int var20 = IiIlliIliiIl(alpha, boxes, var18, cut);
                  int var21 = IiIlliIliiIl(alpha, boxes, var19, cut);
                  if ((var16 >> 2 & 1) == 0) {
                     IlIlllIlilIl(vc, var7, var12, var7, var9, var18, var19, var20, var21);
                  }

                  if ((var16 >> 3 & 1) == 0) {
                     IlIlllIlilIl(vc, var10, var12, var7, var12, var18, var19, var20, var21);
                  }

                  if ((var16 >> 4 & 1) == 0) {
                     IlIlllIlilIl(vc, var10, var9, var10, var12, var18, var19, var20, var21);
                  }

                  if ((var16 >> 5 & 1) == 0) {
                     IlIlllIlilIl(vc, var7, var9, var10, var9, var18, var19, var20, var21);
                  }
               }
            }
         }
      }

   }

   private ilIIllllIiIIllll() {
   }

   private static class_4597.class_4598 IilliliilIIi() {
      if (lIIIilIill == null) {
         IIIIilIill = new class_9799(-(~-1263047984) ^ -1263179055);
         lIIIilIill = class_4597.method_22991(IIIIilIill);
      }

      return lIIIilIill;
   }

   public static void IIlllIlliIll(Matrix4f alpha, double rz, double m, double rx, int ry, float rgb) {
      if (!(rgb < 0.04F)) {
         class_4597.class_4598 var9 = IilliliilIIi();
         class_4588 var10 = var9.method_73477(IiiillIill);
         float var11 = (float)rz;
         float var12 = (float)(m + (double)0.012F);
         float var13 = (float)rx;

         for(int var14 = 0; var14 < 32; ++var14) {
            double var15 = (Math.PI * 2D) * (double)var14 / (double)32.0F;
            double var17 = (Math.PI * 2D) * (double)(var14 + 1) / (double)32.0F;
            float var19 = (float)Math.cos(var15);
            float var20 = (float)Math.sin(var15);
            float var21 = (float)Math.cos(var17);
            float var22 = (float)Math.sin(var17);

            for(int var23 = 0; var23 < iIlillIill.length - 1; ++var23) {
               float var24 = iIlillIill[var23];
               float var25 = iIlillIill[var23 + 1];
               int var26 = Iilllilliill(ry, IllillIill[var23] * rgb);
               int var27 = Iilllilliill(ry, IllillIill[var23 + 1] * rgb);
               var10.method_22918(alpha, var11 + var19 * var24, var12, var13 + var20 * var24).method_39415(var26);
               var10.method_22918(alpha, var11 + var19 * var25, var12, var13 + var20 * var25).method_39415(var27);
               var10.method_22918(alpha, var11 + var21 * var25, var12, var13 + var22 * var25).method_39415(var27);
               var10.method_22918(alpha, var11 + var21 * var24, var12, var13 + var22 * var24).method_39415(var26);
            }
         }

         var9.method_22994(IiiillIill);
      }
   }

   private static RenderPipeline.Builder liiiIIllIl(String name) {
      return RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56860}).withLocation(class_2960.method_60655(IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>() + name)).withVertexFormat(class_290.field_1576, class_5596.field_27382).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(false);
   }

   private static class_1921 iIlIlllllill(String name, RenderPipeline texture, class_2960 pipeline) {
      return class_1921.method_75940(name, class_12247.method_75927(texture).method_76560(IiIiliIiiiIi<invokedynamic>(), pipeline, () -> RenderSystem.getSamplerCache().method_75294(FilterMode.NEAREST)).method_75938());
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6248594075594097897L ^ Long.rotateLeft(-249871612185444473L, 33) ^ 5807319417764089975L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7856753206303792646L ^ Long.rotateLeft(-3557368343047418388L, 20) ^ -2455279564721959345L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2174775275681111376L ^ Long.rotateLeft(8006620366748527033L, 38) ^ -4668877108804108211L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7767922641741931751L ^ Long.rotateLeft(-2905104597068944269L, 5) ^ -8114848267888110289L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2532606512837860670L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -688279347982259864L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5198068297271151890L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4999167366832910544L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1956493805319387368L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5887306660595310999L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   private static float IIillIiliIil(float t) {
      t = Illiiiilllliiiil.lIiiIiIlilli(t);
      return t * t * (3.0F - 2.0F * t);
   }

   private static RenderPipeline.Builder IliIlllilIi(String name) {
      return RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(class_2960.method_60655(IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>() + name)).withVertexShader(IiIiliIiiiIi<invokedynamic>()).withFragmentShader(class_2960.method_60655(IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>())).withSampler(IiIiliIiiiIi<invokedynamic>()).withVertexFormat(class_290.field_1575, class_5596.field_27382).withCull(true);
   }

   public static int Illlllllilll(int t, float rgb) {
      long var5 = -3375846798725856200L;
      long var7 = -5181924804111277418L;
      var5 ^= ((long)(t >> (((-843011924 << 11 | -843011924 >>> 21) << 15 | (-843011924 << 11 | -843011924 >>> 21) >>> 17) - 99 ^ 119 ^ -1288240552) & (-(((-2027781098 >>> 1 | -2027781098 << 31) << 29 | (-2027781098 >>> 1 | -2027781098 << 31) >>> 3) ^ -87) ^ 1752312039)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)(t >> (1885325227 * -57 * 652835029 * 9 ^ -1518262095) & (~(-77019475 * -1556147571 * 1047552999) ^ -12172577)) ^ var5) & -1L >>> 32;
      var7 ^= ((long)(t & (~(((148486960 << 7 | 148486960 >>> 25) ^ -19) << 21 | ((148486960 << 7 | 148486960 >>> 25) ^ -19) >>> 11) ^ 47029068)) << 32 ^ var7) & -1L << 32;
      return Math.round((float)((int)(var5 >>> 32)) + (float)((~(-999544972 ^ 37) ^ 999544913) - (int)(var5 >>> 32)) * rgb) << ((-(544816512 * -13) + 17 >>> 5 | -(544816512 * -13) + 17 << 27) ^ -1926151956) | Math.round((float)((int)var5) + (float)(((-485008112 - -57) * 1643291835 ^ -1311381332) - (int)var5) * rgb) << ((-365327228 ^ -111) + -77 ^ -83 ^ -365326995) | Math.round((float)((int)(var7 >>> 32)) + (float)((((-1874236969 * 1084587701 >>> 3 | -1874236969 * 1084587701 << 29) * 1227133513 >>> 29 | (-1874236969 * 1084587701 >>> 3 | -1874236969 * 1084587701 << 29) * 1227133513 << 3) ^ -1911578632) - (int)(var7 >>> 32)) * rgb);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)(~((char)((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5))) + var5))))))) + '\uf244'))) ^ 23165) + '춫') + '\ue579') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IlIlllIlilIl(class_4588 bx, float lo, float ch, float az, float bz, float vc, float cl, int ax, int hi) {
      bx.method_22918(iiiillIill, lo, cl, ch).method_39415(hi);
      bx.method_22918(iiiillIill, az, cl, bz).method_39415(hi);
      bx.method_22918(iiiillIill, az, vc, bz).method_39415(ax);
      bx.method_22918(iiiillIill, lo, vc, ch).method_39415(ax);
   }

   static {
      IilillIill = class_10799.method_67887(IliIlllilIi(IiIiliIiiiIi<invokedynamic>()).withoutBlend().withColorWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(true).build());
      lilillIill = class_10799.method_67887(IliIlllilIi(IiIiliIiiiIi<invokedynamic>()).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.EQUAL_DEPTH_TEST).withDepthWrite(false).build());
      iilillIill = class_10799.method_67887(IliIlllilIi(IiIiliIiiiIi<invokedynamic>()).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.GREATER_DEPTH_TEST).withDepthWrite(false).build());
      IIiillIill = class_10799.method_67887(liiiIIllIl(IiIiliIiiiIi<invokedynamic>()).withBlend(BlendFunction.LIGHTNING).withCull(true).build());
      lIiillIill = class_10799.method_67887(liiiIIllIl(IiIiliIiiiIi<invokedynamic>()).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthBias(-1.0F, -10.0F).build());
      iIiillIill = class_156.method_34866((texture) -> iIlIlllllill(IiIiliIiiiIi<invokedynamic>(), IilillIill, texture));
      IliillIill = class_156.method_34866((texture) -> iIlIlllllill(IiIiliIiiiIi<invokedynamic>(), lilillIill, texture));
      lliillIill = class_156.method_34866((texture) -> iIlIlllllill(IiIiliIiiiIi<invokedynamic>(), iilillIill, texture));
      iliillIill = class_1921.method_75940(IiIiliIiiiIi<invokedynamic>(), class_12247.method_75927(IIiillIill).method_75938());
      IiiillIill = class_1921.method_75940(IiIiliIiiiIi<invokedynamic>(), class_12247.method_75927(lIiillIill).method_75938());
      liiillIill = new float[7488];
      iiiillIill = new Matrix4f();
   }

   private static void iliIiiliiiii(class_4588 vc, int solid, float rgb, int vertices, boolean alpha) {
      int var5 = vertices >> 16 & 255;
      int var6 = vertices >> 8 & 255;
      int var7 = vertices & 255;

      for(int var8 = 0; var8 < solid; ++var8) {
         int var9 = var8 * 6;
         vc.method_22918(iiiillIill, liiillIill[var9], liiillIill[var9 + 1], liiillIill[var9 + 2]).method_22913(liiillIill[var9 + 3], liiillIill[var9 + 4]);
         if (alpha) {
            vc.method_1336(255, 255, 255, 255);
         } else {
            float var10 = liiillIill[var9 + 5];
            float var11 = (1.0F - var10) * 0.3F;
            int var12 = Math.round((0.26F + 0.64F * var10) * rgb * 255.0F);
            vc.method_1336(Math.round(255.0F + ((float)var5 - 255.0F) * var11), Math.round(255.0F + ((float)var6 - 255.0F) * var11), Math.round(255.0F + ((float)var7 - 255.0F) * var11), var12 < 1 ? 1 : Math.min(var12, 255));
         }
      }

   }

   public static void lIiiIiIlilli(class_4587 boxMask, double stack, double throughWalls, double ry, float slim, class_2960 rgb, boolean alpha, int rz, float yawDeg, float skin, int reveal, boolean rx) {
      if (rgb != null && !(skin < 0.04F)) {
         boxMask.method_22903();
         boxMask.method_22904(stack, throughWalls, ry);
         boxMask.method_22907(class_7833.field_40716.rotationDegrees(-slim));
         boxMask.method_22905(0.05859375F, 0.05859375F, 0.05859375F);
         boxMask.method_46416(0.0F, 0.016F, 0.0F);
         iiiillIill.set(boxMask.method_23760().method_23761());
         boxMask.method_22909();
         float[] var15 = Illiiiilllliiiil.IliIlllilIi(alpha);
         float var16 = Illiiiilllliiiil.iliIiiliiiii(yawDeg, 1.75F);
         class_4597.class_4598 var17 = IilliliilIIi();
         if (rx) {
            int var18 = Illiiiilllliiiil.IiIlliIliiIl(var15, rz & 1365, var16, 1.75F, liiillIill, true);
            class_1921 var19 = (class_1921)lliillIill.apply(rgb);
            iliIiiliiiii(var17.method_73477(var19), var18, skin * 0.32F, reveal, false);
            var17.method_22994(var19);
         }

         int var22 = Illiiiilllliiiil.IlIlllIlilIl(var15, rz, var16, 1.75F, liiillIill);
         class_1921 var23 = (class_1921)iIiillIill.apply(rgb);
         iliIiiliiiii(var17.method_73477(var23), var22, 1.0F, reveal, true);
         var17.method_22994(var23);
         class_1921 var20 = (class_1921)IliillIill.apply(rgb);
         iliIiiliiiii(var17.method_73477(var20), var22, skin, reveal, false);
         var17.method_22994(var20);
         float var21 = IIillIiliIil(yawDeg / 0.08F) * IIillIiliIil((1.0F - yawDeg) / 0.08F) * skin;
         if (var21 > 0.02F) {
            IIIllIIliIIl(var17.method_73477(iliillIill), Illiiiilllliiiil.liiiIIllIl(alpha), var16, var21, Illlllllilll(reveal, 0.6F));
            var17.method_22994(iliillIill);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) << 2 | (char)((char)((char)(var4[var5] ^ var5) - var5) - var5) >>> 14) ^ var5) ^ var5))))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) >>> 9) + '\ude80') - 27485) + 19981))) - var5) << 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) >>> 9) + '\ude80') - 27485) + 19981))) - var5) >>> 8))))) >>> 6 | (char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) >>> 9) + '\ude80') - 27485) + 19981))) - var5) << 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) << 4 | (char)((char)((char)((char)(var4[var5] ^ '\udd23') << 2 | (char)(var4[var5] ^ '\udd23') >>> 14) ^ 17323) ^ 11284) >>> 12) ^ var5) >>> 9) + '\ude80') - 27485) + 19981))) - var5) >>> 8))))) << 10) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '벙') - var5) + 14751) >>> 15 | (char)((char)((char)(var4[var5] ^ '벙') - var5) + 14751) << 1) + var5) ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '벙') - var5) + 14751) >>> 15 | (char)((char)((char)(var4[var5] ^ '벙') - var5) + 14751) << 1) + var5) ^ var5) << 1) ^ 14607) ^ '\ue8d1') + '탊'))) + var5))))))) - var5))) ^ 6603));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + 13769))))) + '訏') + var5) << 15 | (char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + 13769))))) + '訏') + var5) >>> 1))))) ^ var5) ^ var5) - var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
