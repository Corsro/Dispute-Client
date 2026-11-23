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
import org.lwjgl.glfw.GLFW;

public final class illiilIiliil {
   public static final int IllilIiilllilIii = 30;
   public static final int lIlilIiiiIlilIii = -1;
   private static final int[] lililIiiiililIii = new int[349];
   private static final int[] IIiilIiilIiilIii = new int[349];
   private static final boolean illilIiiIililIii = System.getProperty(IIlllIlliIll<invokedynamic>(), "").toLowerCase().startsWith(IIlllIlliIll<invokedynamic>());

   static {
      Arrays.fill(lililIiiiililIii, -1);
      Arrays.fill(IIiilIiilIiilIii, Integer.MIN_VALUE);
      IliIlllilIi(256, 1);

      for(int var0 = 0; var0 < 10; ++var0) {
         IliIlllilIi(290 + var0, 59 + var0);
      }

      IliIlllilIi(300, 87);
      IliIlllilIi(301, 88);
      IliIlllilIi(96, 41);

      for(int var1 = 1; var1 <= 9; ++var1) {
         IliIlllilIi(48 + var1, 1 + var1);
      }

      IliIlllilIi(48, 11);
      IliIlllilIi(45, 12);
      IliIlllilIi(61, 13);
      IliIlllilIi(259, 14);
      IliIlllilIi(258, 15);
      liiiIIllIl(IIlllIlliIll<invokedynamic>(), 16);
      IliIlllilIi(91, 26);
      IliIlllilIi(93, 27);
      IliIlllilIi(257, 28);
      IliIlllilIi(341, 29);
      liiiIIllIl(IIlllIlliIll<invokedynamic>(), 30);
      IliIlllilIi(59, 39);
      IliIlllilIi(39, 40);
      IliIlllilIi(340, 42);
      IliIlllilIi(92, 43);
      liiiIIllIl(IIlllIlliIll<invokedynamic>(), 44);
      IliIlllilIi(44, 51);
      IliIlllilIi(46, 52);
      IliIlllilIi(47, 53);
      IliIlllilIi(344, 54);
      IliIlllilIi(332, 55);
      IliIlllilIi(342, 56);
      IliIlllilIi(32, 57);
      IliIlllilIi(280, 58);
      IliIlllilIi(282, 69);
      IliIlllilIi(281, 70);
      IliIlllilIi(327, 71);
      IliIlllilIi(328, 72);
      IliIlllilIi(329, 73);
      IliIlllilIi(333, 74);
      IliIlllilIi(324, 75);
      IliIlllilIi(325, 76);
      IliIlllilIi(326, 77);
      IliIlllilIi(334, 78);
      IliIlllilIi(321, 79);
      IliIlllilIi(322, 80);
      IliIlllilIi(323, 81);
      IliIlllilIi(320, 82);
      IliIlllilIi(330, 83);
      IliIlllilIi(161, 86);
      IliIlllilIi(336, 3597);
      IliIlllilIi(335, 3612);
      IliIlllilIi(345, 3613);
      IliIlllilIi(331, 3637);
      IliIlllilIi(283, 3639);
      IliIlllilIi(346, 3640);
      IliIlllilIi(284, 3653);
      IliIlllilIi(268, 3655);
      IliIlllilIi(266, 3657);
      IliIlllilIi(269, 3663);
      IliIlllilIi(267, 3665);
      IliIlllilIi(260, 3666);
      IliIlllilIi(261, 3667);
      IliIlllilIi(343, 3675);
      IliIlllilIi(347, 3676);
      IliIlllilIi(348, 3677);
      IliIlllilIi(265, 57416);
      IliIlllilIi(263, 57419);
      IliIlllilIi(262, 57421);
      IliIlllilIi(264, 57424);
   }

   private static void liiiIIllIl(String letters, int first) {
      for(int var2 = 0; var2 < letters.length(); ++var2) {
         IliIlllilIi(letters.charAt(var2), first + var2);
      }

   }

   public static int iliIiiliiiii(int key) {
      return lIiiIiIlilli(key, illilIiiIililIii ? IlIlllIlilIl(key) : -1, illilIiiIililIii);
   }

   public static int lIiiIiIlilli(int key, int scancode, boolean windows) {
      long var4 = 4633834232768234407L;
      if (key != (-(-2043223706 + -127 << 29 | -2043223706 + -127 >>> 3) ^ 255402744) && key != (-1504268439 - 103 ^ 97 ^ -1504268679)) {
         if (windows) {
            var4 ^= ((long)IilliliilIIi(scancode) << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) != ((1577782668 * 1056139499 * -2014922929 >>> 17 | 1577782668 * 1056139499 * -2014922929 << 15) ^ 220329841)) {
               return (int)(var4 >>> 32);
            }
         }

         return iIlIlllllill(key);
      } else {
         return iIlIlllllill(key);
      }
   }

   public static int IilliliilIIi(int scancode) {
      if (scancode > 0 && scancode <= 511) {
         if (scancode == 325) {
            return 69;
         } else if (scancode != 69 && scancode != 326) {
            int var1 = scancode & 255;
            if ((scancode & 256) == 0) {
               return var1;
            } else {
               return var1 != 72 && var1 != 75 && var1 != 77 && var1 != 80 ? 3584 | var1 : '\ue000' | var1;
            }
         } else {
            return 3653;
         }
      } else {
         return -1;
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 1) + '뫗'))) ^ var5) + '鹨') - '艹') << 5 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 1) + '뫗'))) ^ var5) + '鹨') - '艹') >>> 11) - 'ꞽ') + '諸') + 11923) + '\ua7cb') - var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 1) + '뫗'))) ^ var5) + '鹨') - '艹') << 5 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 1) + '뫗'))) ^ var5) + '鹨') - '艹') >>> 11) - 'ꞽ') + '諸') + 11923) + '\ua7cb') - var5) >>> 8) ^ var5) ^ var5) ^ 972));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int iIlIlllllill(int key) {
      return key >= 0 && key < lililIiiiililIii.length ? lililIiiiililIii[key] : -1;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~var4[var5]))))) >>> 13 | (char)(~((char)(~((char)(~var4[var5]))))) << 3) >>> 14 | (char)((char)(~((char)(~((char)(~var4[var5]))))) >>> 13 | (char)(~((char)(~((char)(~var4[var5]))))) << 3) << 2) + var5) - '觪') - var5) + '턳') ^ 4699))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~var4[var5]))))) >>> 13 | (char)(~((char)(~((char)(~var4[var5]))))) << 3) >>> 14 | (char)((char)(~((char)(~((char)(~var4[var5]))))) >>> 13 | (char)(~((char)(~((char)(~var4[var5]))))) << 3) << 2) + var5) - '觪') - var5) + '턳') ^ 4699))) << 11) ^ '銫') - '\ud862'))));
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
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - '麥') - 4009) + var5))) ^ var5)) - '殺') + var5) - 26629) << 7 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) - '麥') - 4009) + var5))) ^ var5)) - '殺') + var5) - 26629) >>> 9) + 17053) + var5))))));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) ^ var5))))) + 8795) << 1 | (char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] >>> 2 | var4[var5] << 14))) ^ var5))))) + 8795) >>> 15) ^ var5))) - 29508) + '衎'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) >>> 6 | (char)(-((char)(~((char)(~var4[var5]))))) << 10) + var5) - var5) + 'ꧏ') - var5))) + 24478) ^ var5) - var5) ^ 20320));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IlIlllIlilIl(int key) {
      if (key >= 0 && key < IIiilIiilIiilIii.length) {
         int var1 = IIiilIiilIiilIii[key];
         if (var1 != Integer.MIN_VALUE) {
            return var1;
         } else {
            int var2;
            try {
               var2 = GLFW.glfwGetKeyScancode(key);
            } catch (Throwable var4) {
               var2 = -1;
            }

            IIiilIiilIiilIii[key] = var2;
            return var2;
         }
      } else {
         return -1;
      }
   }

   private static void IliIlllilIi(int code, int key) {
      lililIiiiililIii[code] = key;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5640211514704620012L ^ Long.rotateLeft(-8660374909038069060L, 10) ^ -2383863773807438125L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3191359842114482507L ^ Long.rotateLeft(-8150962006503574257L, 63) ^ -1681192830794399162L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3375150629274563200L ^ Long.rotateLeft(1757981605683314698L, 7) ^ -6873530761504000949L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4070895252599897156L ^ Long.rotateLeft(5255983059201307477L, 40) ^ 8485227414398414694L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -711522498068480756L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3034808740532244427L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3359203817045287407L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7352898776221098605L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1906424196097464438L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -9114962882290776356L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   public static int[] IIIllIIliIIl() {
      return Arrays.stream(lililIiiiililIii).filter((c) -> c != ((-((70556792 << 29 | 70556792 >>> 3) - 19) >>> 5 | -((70556792 << 29 | 70556792 >>> 3) - 19) << 27) ^ -670813029)).distinct().sorted().toArray();
   }

   private illiilIiliil() {
   }
}
