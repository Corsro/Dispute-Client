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

public final class IlIiliIlllIiliIl {
   public static final int lIIiiiiIll = 256;
   public static final int IlIiiiiIll = 261;
   public static final int iIIiiiiIll = 259;
   public static final int llIiiiiIll = 1000;

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - 16692) + 'ﾯ') ^ var5)))) >>> 8 | (char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - 16692) + 'ﾯ') ^ var5)))) << 8))) ^ var5) + var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) - var5) + '깁'))) - 69) << 9 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] - var5) ^ var5))) - var5) + '깁'))) - 69) >>> 7))) - 12151) ^ var5) ^ '쒿') ^ 25226))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - '렧') >>> 11 | (char)((char)((char)((char)(~var4[var5]) - var5) - var5) - '렧') << 5))) ^ var5) - '觏') + var5) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - '렧') >>> 11 | (char)((char)((char)((char)(~var4[var5]) - var5) - var5) - '렧') << 5))) ^ var5) - '觏') + var5) << 11) ^ '퉼'));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) + '갼') - var5) ^ var5) ^ '뫱') - 3840))) >>> 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) + '갼') - var5) ^ var5) ^ '뫱') - 3840))) << 6))) - 10291))) + 10727) + 16842) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) + '\uf75e'))) - 9706) << 8 | (char)((char)(-((char)((char)(var4[var5] + var5) + '\uf75e'))) - 9706) >>> 8) ^ 24814))))))) - '쑩') ^ 1175) + var5) ^ var5) - 8552) ^ var5) - var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) + '\uf75e'))) - 9706) << 8 | (char)((char)(-((char)((char)(var4[var5] + var5) + '\uf75e'))) - 9706) >>> 8) ^ 24814))))))) - '쑩') ^ 1175) + var5) ^ var5) - 8552) ^ var5) - var5) >>> 8))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IlIlllIlilIl(int code) {
      if (code < 0) {
         return IiIlliIliiIl<invokedynamic>();
      } else {
         return IliIlllilIi(code) ? lIiiIiIlilli(code) : iliIiiliiiii(code);
      }
   }

   public static String IIIllIIliIIl(int key) {
      return IiIlliIliiIl<invokedynamic>() + key;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4418343608002813498L ^ Long.rotateLeft(7781422721552280512L, 62) ^ -6176376001884773840L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6194318898212914825L ^ Long.rotateLeft(-224646274295811153L, 36) ^ -3771825235183504501L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2563833806032917677L ^ Long.rotateLeft(1947708865304603207L, 20) ^ -4654672397812478565L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3721557429146781797L ^ Long.rotateLeft(-3937846501664133340L, 7) ^ 5996968238510782211L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6265779965227939016L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6635021031307545859L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1573883636238459215L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1663624159161627996L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8380222790650427099L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6669464183435702002L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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

   public static boolean IliIlllilIi(int code) {
      return code >= 1000;
   }

   public static String iliIiiliiiii(int key) {
      switch (key) {
         case 32 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 256 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 257 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 258 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 259 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 260 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 261 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 262 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 263 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 264 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 265 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 266 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 267 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 268 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 269 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 280 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 340 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 341 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 342 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 343 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 344 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 345 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 346 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         case 347 -> {
            return IiIlliIliiIl<invokedynamic>();
         }
         default -> {
            return key >= 290 && key <= 301 ? IiIlliIliiIl<invokedynamic>() + (key - 289) : null;
         }
      }
   }

   public static int liiiIIllIl(int code) {
      return code - 1000;
   }

   public static String lIiiIiIlilli(int code) {
      return IiIlliIliiIl<invokedynamic>() + (liiiIIllIl(code) + 1);
   }

   private IlIiliIlllIiliIl() {
   }

   public static boolean IilliliilIIi(int key) {
      return key == 256 || key == 259 || key == 261;
   }

   public static int iIlIlllllill(int glfwButton) {
      return 1000 + glfwButton;
   }
}
