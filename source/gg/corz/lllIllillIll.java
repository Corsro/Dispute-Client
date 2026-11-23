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
import net.minecraft.class_2960;

public enum lllIllillIll {
   IiIlIIIiliIlIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>()));

   private final class_2960 llilIIIiililIIIi;
   liiIIIIiiiiIIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   iiIlIIIiIIllIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   illlIIIiIillIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   lillIIIiiillIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>()));

   private final String iIilIIIiIlilIIIi;
   IIIlIIIilIIlIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   llIlIIIiilIlIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   iIIlIIIiIlIlIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   IIilIIIilIilIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   lIllIIIiiIllIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())),
   IlllIIIillllIIIi(IilliliilIIi<invokedynamic>(), class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>()));

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - '뻶') ^ '쎅') ^ var5))) ^ var5) + 19881) - var5) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - '뻶') ^ '쎅') ^ var5))) ^ var5) + 19881) - var5) << 5) + var5) ^ var5) - 26698) - var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) ^ 11736) + '뵯') + '鸅'))) + var5) - var5) ^ 20988))) + var5) - var5) - 15893) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2589851366034611940L ^ Long.rotateLeft(-2700494234008883172L, 50) ^ 434051562385382002L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4239404067980115733L ^ Long.rotateLeft(8917790182781903955L, 56) ^ 3062499528964770959L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -37599637296976348L ^ Long.rotateLeft(9078275552298316549L, 42) ^ 2117777952933344461L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -140725869147684750L ^ Long.rotateLeft(-7682029466300183331L, 2) ^ 9101884760962391846L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1916642837595433061L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8556911205184050741L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7452545520562436390L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6722337711879835253L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8637453399753277762L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -54399756705252124L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
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

   private lllIllillIll(String var3, class_2960 name) {
      this.iIilIIIiIlilIIIi = var3;
      this.llilIIIiililIIIi = name;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 5709) - 24670))) + var5) + 3873) ^ 24712) ^ 24887) ^ var5) - var5) ^ '蠄') + var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 5709) - 24670))) + var5) + 3873) ^ 24712) ^ 24887) ^ var5) - var5) ^ '蠄') + var5) >>> 15) ^ 27616) ^ var5) - '뿿') - var5))) ^ 744));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static lllIllillIll[] iIlIlllllill() {
      return new lllIllillIll[]{liiIIIIiiiiIIIIi, IIIlIIIilIIlIIIi, iIIlIIIiIlIlIIIi, llIlIIIiilIlIIIi, IiIlIIIiliIlIIIi, iiIlIIIiIIllIIIi, lIllIIIiiIllIIIi, IlllIIIillllIIIi, illlIIIiIillIIIi, lillIIIiiillIIIi, IIilIIIilIilIIIi};
   }

   public String IliIlllilIi() {
      return this.iIilIIIiIlilIIIi;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] - 5204))) - '鴰'))) ^ '\ue059') + var5)) ^ var5) ^ '\ue7ed') >>> 13 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] - 5204))) - '鴰'))) ^ '\ue059') + var5)) ^ var5) ^ '\ue7ed') << 3) + var5) ^ var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public class_2960 liiiIIllIl() {
      return this.llilIIIiililIIIi;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) >>> 2 | (char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) << 14))) - var5))) << 3 | (char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) >>> 2 | (char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) << 14))) - var5))) >>> 13) ^ var5) ^ '딚') - var5) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) >>> 2 | (char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) << 14))) - var5))) << 3 | (char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) >>> 2 | (char)(~((char)((char)((char)(var4[var5] + '难') + var5) - '쁸'))) << 14))) - var5))) >>> 13) ^ var5) ^ '딚') - var5) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
