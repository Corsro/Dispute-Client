package gg.corz;

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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_2960;

public final class IlIlIlllllIlIlll {
   private static final Map<Iliiliillliiliil, class_1921> lIlllIIill;
   private static boolean iIlllIIill;
   public static final RenderPipeline IIlllIIill;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7408911630419789237L ^ Long.rotateLeft(-2001476546050655759L, 41) ^ 386889573152108475L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5683784751628595968L ^ Long.rotateLeft(389814917935799402L, 15) ^ -3444687970315779845L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8392368927954063226L ^ Long.rotateLeft(8276572543306813983L, 61) ^ 7753205416095044317L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4271712586231316903L ^ Long.rotateLeft(-8336340597345743919L, 21) ^ -3521216951890282894L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5750611206902295204L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -425511030432009730L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 858110437994158863L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5472469124950979461L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1094592848290815948L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5059927737143899407L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 7985) >>> 11 | (char)(var4[var5] ^ 7985) << 5) ^ var5))))) - 27867) >>> 10 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 7985) >>> 11 | (char)(var4[var5] ^ 7985) << 5) ^ var5))))) - 27867) << 6) + var5) >>> 4 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 7985) >>> 11 | (char)(var4[var5] ^ 7985) << 5) ^ var5))))) - 27867) >>> 10 | (char)((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 7985) >>> 11 | (char)(var4[var5] ^ 7985) << 5) ^ var5))))) - 27867) << 6) + var5) << 12) ^ '蠏'))) ^ var5) + '铹'))) - var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) >>> 10 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) << 6) ^ var5) ^ var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) >>> 10 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) << 6) ^ var5) ^ var5) >>> 5) ^ '\ue442') >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) >>> 10 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) << 6) ^ var5) ^ var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) >>> 10 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) << 3 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ '覤'))) + 'ꮃ') - 20570) - 6654))) ^ var5) >>> 15) >>> 13) - var5))) << 6) ^ var5) ^ var5) >>> 5) ^ '\ue442') << 11) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IlIlIlllllIlIlll() {
   }

   public static class_1921 IliIlllilIi(class_2960 color, class_2960 specular) {
      if (specular != null && !iIlllIIill) {
         try {
            return (class_1921)lIlllIIill.computeIfAbsent(new Iliiliillliiliil(color, specular), (k) -> class_1921.method_75940(iIlIlllllill<invokedynamic>(), class_12247.method_75927(IIlllIIill).method_75934(iIlIlllllill<invokedynamic>(), k.IliIlllilIi()).method_75934(iIlIlllllill<invokedynamic>(), k.liiiIIllIl()).method_75928().method_75929(~1913812811 * 654471207 - -81 ^ 140678077).method_75938()));
         } catch (RuntimeException var3) {
            iIlllIIill = true;
            System.err.println(iIlIlllllill<invokedynamic>() + var3);
            return class_12249.method_75994(color);
         }
      } else {
         return class_12249.method_75994(color);
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5)) ^ var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5)) ^ var5) ^ var5) << 13) ^ var5))) + '鑨') + '헦') << 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5)) ^ var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5)) ^ var5) ^ var5) << 13) ^ var5))) + '鑨') + '헦') >>> 7) ^ var5) - var5) - '\uf012') + 14734));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      IIlllIIill = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(class_2960.method_60655(iIlIlllllill<invokedynamic>(), iIlIlllllill<invokedynamic>())).withVertexShader(class_2960.method_60655(iIlIlllllill<invokedynamic>(), iIlIlllllill<invokedynamic>())).withFragmentShader(class_2960.method_60655(iIlIlllllill<invokedynamic>(), iIlIlllllill<invokedynamic>())).withSampler(iIlIlllllill<invokedynamic>()).withSampler(iIlIlllllill<invokedynamic>()).withSampler(iIlIlllllill<invokedynamic>()).withVertexFormat(class_290.field_1580, class_5596.field_27382).withCull(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withDepthWrite(true).build());
      lIlllIIill = new HashMap();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) >>> 6 | (char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) << 10) >>> 14 | (char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) >>> 6 | (char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) << 10) << 2) + var5) - var5))) - 13728) ^ 31571) ^ 11065) + '\ue864') + var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') >>> 1 | (char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') << 15) ^ var5) + '\ue4b1') + 13194))) ^ var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') >>> 1 | (char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') << 15) ^ var5) + '\ue4b1') + 13194))) ^ var5))) >>> 10) + var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') >>> 1 | (char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') << 15) ^ var5) + '\ue4b1') + 13194))) ^ var5))) << 6 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') >>> 1 | (char)((char)((char)(-var4[var5]) ^ 12706) ^ '\uaad9') << 15) ^ var5) + '\ue4b1') + 13194))) ^ var5))) >>> 10) + var5) >>> 6) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
