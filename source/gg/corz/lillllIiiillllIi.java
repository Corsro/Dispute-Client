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

public final class lillllIiiillllIi {
   public static final RenderPipeline IilliiIIIi;
   public static final RenderPipeline lllliiIIIi = class_10799.method_67887(IilliliilIIi(lIiiIiIlilli<invokedynamic>()).withShaderDefine(lIiiIiIlilli<invokedynamic>(), 0.5F).build());
   public static final RenderPipeline IllliiIIIi = class_10799.method_67887(IilliliilIIi(lIiiIiIlilli<invokedynamic>()).build());
   public static final RenderPipeline illliiIIIi;
   public static final RenderPipeline lilliiIIIi;

   public static void IliIlllilIi() {
   }

   private static class_2960 iIlIlllllill(String name) {
      return class_2960.method_60655(lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>() + name);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') << 9 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') >>> 7) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') << 9 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') >>> 7) >>> 4) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') << 9 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') >>> 7) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') << 9 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '萶') - 'ꕿ') << 7 | (char)((char)(var4[var5] ^ '萶') - 'ꕿ') >>> 9) ^ '隝') - 19132) + '뛥') >>> 7) >>> 4) << 12) + '먂') ^ var5) + 8287) + var5) - var5) + '꒚'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1251738139447415949L ^ Long.rotateLeft(3933099698331595942L, 46) ^ 7780140095076665267L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8290199182692339947L ^ Long.rotateLeft(8072674772110578746L, 56) ^ 7596289754871326510L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5255333776412428364L ^ Long.rotateLeft(-7447992413365875874L, 16) ^ 6486797059139304950L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -855986884435003040L ^ Long.rotateLeft(7682771853256812641L, 28) ^ 7413098159175562209L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -120328728249047403L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4115501836439961371L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1144762122302570536L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 613592441964850327L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6919151063400098132L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2833573998504495047L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
      illliiIIIi = class_10799.method_67887(IilliliilIIi(lIiiIiIlilli<invokedynamic>()).withBlend(BlendFunction.TRANSLUCENT).withShaderDefine(lIiiIiIlilli<invokedynamic>(), 0.01F).withDepthWrite(false).build());
      IilliiIIIi = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(iIlIlllllill(lIiiIiIlilli<invokedynamic>())).withVertexShader(liiiIIllIl(lIiiIiIlilli<invokedynamic>())).withFragmentShader(liiiIIllIl(lIiiIiIlilli<invokedynamic>())).withUniform(lIiiIiIlilli<invokedynamic>(), class_10789.field_60031).withVertexFormat(class_290.field_1576, class_5596.field_27382).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build());
      lilliiIIIi = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56859}).withLocation(iIlIlllllill(lIiiIiIlilli<invokedynamic>())).withBlend(BlendFunction.TRANSLUCENT).withCull(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).build());
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ var5))))) + '헿') ^ var5) - var5) - '\uf6eb') << 9 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ var5))))) + '헿') ^ var5) - var5) - '\uf6eb') >>> 7) - var5) + var5))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lillllIiiillllIi() {
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) >>> 5 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) << 11))) ^ var5))) ^ var5) << 11 | (char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) >>> 5 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) << 11))) ^ var5))) ^ var5) >>> 5))) >>> 13 | (char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) >>> 5 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) << 11))) ^ var5))) ^ var5) << 11 | (char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) >>> 5 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 2 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 14) + var5))) ^ var5))) - var5) << 11))) ^ var5))) ^ var5) >>> 5))) << 3))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_2960 liiiIIllIl(String name) {
      return class_2960.method_60655(lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>() + name);
   }

   private static RenderPipeline.Builder IilliliilIIi(String name) {
      return RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(iIlIlllllill(name)).withVertexShader(liiiIIllIl(lIiiIiIlilli<invokedynamic>())).withFragmentShader(liiiIIllIl(lIiiIiIlilli<invokedynamic>())).withUniform(lIiiIiIlilli<invokedynamic>(), class_10789.field_60031).withSampler(lIiiIiIlilli<invokedynamic>()).withSampler(lIiiIiIlilli<invokedynamic>()).withVertexFormat(class_290.field_1590, class_5596.field_27382);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) << 8))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) << 8))) << 12) ^ '봨') >>> 5 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) << 8))) >>> 4 | (char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ '섹') << 13 | (char)((char)(-var4[var5]) ^ '섹') >>> 3))) ^ 22987) << 8))) << 12) ^ '봨') << 11) ^ 4287));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) << 4) + 22643))))))) << 10 | (char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) << 4) + 22643))))))) >>> 6))) + var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) << 4) + 22643))))))) << 10 | (char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] ^ 4006))) + '쏞') ^ var5))) ^ var5) + '쓉') ^ 23326) << 4) + 22643))))))) >>> 6))) + var5) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
