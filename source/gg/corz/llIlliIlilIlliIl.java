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

public final class llIlliIlilIlliIl {
   public static final Function<class_2960, class_1921> illiliiIll;
   public static final RenderPipeline llliliiIll;
   public static final Function<class_2960, class_1921> lililiiIll;
   public static final RenderPipeline IililiiIll;
   public static final class_2960 IlliliiIll = class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>());

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') << 13 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') >>> 3) - 21161) << 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') << 13 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') >>> 3) - 21161) >>> 5) ^ '쳶') - '釃'))))) >>> 1 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') << 13 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') >>> 3) - 21161) << 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') << 13 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + '곎') - 14860))) - 15436) ^ 7987) ^ '駶') - '턬') >>> 3) - 21161) >>> 5) ^ '쳶') - '釃'))))) << 15))) ^ '\ueb0d') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) - var5) - var5) ^ var5))) >>> 11 | (char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) - var5) - var5) ^ var5))) << 5))) + var5))) - var5) ^ var5) ^ var5) ^ var5) << 7 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) - var5) - var5) ^ var5))) >>> 11 | (char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) - var5) - var5) ^ var5))) << 5))) + var5))) - var5) ^ var5) ^ var5) ^ var5) >>> 9))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private llIlliIlilIlliIl() {
   }

   static {
      llliliiIll = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())).withVertexShader(IilliliilIIi<invokedynamic>()).withFragmentShader(IilliliilIIi<invokedynamic>()).withSampler(IilliliilIIi<invokedynamic>()).withBlend(BlendFunction.LIGHTNING).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withCull(false).withVertexFormat(class_290.field_1575, class_5596.field_27382).build());
      illiliiIll = class_156.method_34866((texture) -> class_1921.method_75940(IilliliilIIi<invokedynamic>(), class_12247.method_75927(llliliiIll).method_75934(IilliliilIIi<invokedynamic>(), texture).method_75929(1536).method_75938()));
      IililiiIll = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_60125}).withLocation(class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())).withVertexShader(IilliliilIIi<invokedynamic>()).withFragmentShader(IilliliilIIi<invokedynamic>()).withSampler(IilliliilIIi<invokedynamic>()).withBlend(BlendFunction.LIGHTNING).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withCull(false).withVertexFormat(class_290.field_1575, class_5596.field_27382).build());
      lililiiIll = class_156.method_34866((texture) -> class_1921.method_75940(IilliliilIIi<invokedynamic>(), class_12247.method_75927(IililiiIll).method_75934(IilliliilIIi<invokedynamic>(), texture).method_75929(4096).method_75938()));
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 27620))) + '섯') ^ var5) >>> 5 | (char)((char)((char)(~((char)(var4[var5] + 27620))) + '섯') ^ var5) << 11) + 16076) + '\ufae0') + '\uf1fd') + 26354) ^ var5) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 27620))) + '섯') ^ var5) >>> 5 | (char)((char)((char)(~((char)(var4[var5] + 27620))) + '섯') ^ var5) << 11) + 16076) + '\ufae0') + '\uf1fd') + 26354) ^ var5) ^ var5) >>> 15)) + '\ued99') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void IliIlllilIi() {
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4241246870578932654L ^ Long.rotateLeft(-541979805846178269L, 26) ^ -8825256774120485228L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1139484974934831522L ^ Long.rotateLeft(-7947368748548099318L, 30) ^ -7300886566307012352L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4172816554548287077L ^ Long.rotateLeft(-8611437717020928434L, 48) ^ -3254864800434440904L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5380899525188848199L ^ Long.rotateLeft(-1435801519948574123L, 4) ^ 6117114944388217830L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6640856291538254255L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7996132317870122323L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6606354674025104001L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4422757402926852469L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 503349670143859354L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 728771776813043157L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) >>> 13) >>> 4 | (char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) >>> 13) << 12) + '鵙') - var5) - '例') ^ 32480) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) >>> 13) >>> 4 | (char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) + '齻'))) - '腿') ^ var5) >>> 13) << 12) + '鵙') - var5) - '例') ^ 32480) << 11))) - '\udc9c'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) << 2))) ^ var5) + var5) + '賖') + '\uf004'))) << 10 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) << 2))) ^ var5) + var5) + '賖') + '\uf004'))) >>> 6) - '톔'))) << 9 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) << 2))) ^ var5) + var5) + '賖') + '\uf004'))) << 10 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '폔'))))) ^ var5) << 2))) ^ var5) + var5) + '賖') + '\uf004'))) >>> 6) - '톔'))) >>> 7) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
