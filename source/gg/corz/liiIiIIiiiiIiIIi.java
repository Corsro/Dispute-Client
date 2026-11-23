package gg.corz;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
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
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_5603;
import net.minecraft.class_5606;
import net.minecraft.class_5607;
import net.minecraft.class_5609;
import net.minecraft.class_5610;
import net.minecraft.class_630;

final class liiIiIIiiiiIiIIi {
   static final class_2960[] liillliiil = new class_2960[]{IliIlllilIi(iiIIlIIlIl<invokedynamic>()), IliIlllilIi(iiIIlIIlIl<invokedynamic>()), IliIlllilIi(iiIIlIIlIl<invokedynamic>()), IliIlllilIi(iiIIlIIlIl<invokedynamic>())};
   static final class_2960 llillliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   static final class_2960 Iiillliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   private static final int[][] iiillliiil = new int[][]{{-3790022, -727352}, {-13726889, -1558454}, {-1459895, -3790022}, {-12881960, -724502}};
   static final class_2960 lIillliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   static final class_2960 lilllliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   static final class_2960 iIillliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   static final class_2960 ilillliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   static final class_2960 IIillliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   static final class_2960 Iilllliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   static final class_2960 Ilillliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());
   private static boolean IIIilliiil;
   static final class_2960 iilllliiil = IliIlllilIi(iiIIlIIlIl<invokedynamic>());

   private liiIiIIiiiiIiIIi() {
   }

   private static class_1011 IIillIiliIil() {
      long var2 = -8472944653267267897L;
      class_1011 var0 = new class_1011(16, 16, true);
      Iiiiliiiiiii(var0, 0, 0, 16, 8, -3790022, -6283732);

      for(var2 ^= (0L ^ var2) & -1L << 32; (int)(var2 >>> 32) < 12; var2 += 4294967296L) {
         var0.method_61941((int)(var2 >>> 32), 5, -725536);
      }

      Iiiiliiiiiii(var0, 0, 0, 6, 3, -9749729, -11654892);
      Iiiiliiiiiii(var0, 0, 8, 16, 8, -8764638, -10604520);

      for(long var5 = var2 ^ (8589934592L ^ var2) & -1L << 32; (int)(var5 >>> 32) < 6; var5 += 4294967296L) {
         var0.method_61941((int)(var5 >>> 32), 9, -462104);
      }

      return var0;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 27490) + 726) + var5) - 31278) ^ var5))))) + var5) >>> 12 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 27490) + 726) + var5) - 31278) ^ var5))))) + var5) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static class_630 Illlllllilll() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-6.0F, -12.0F, -2.5F, 12.0F, 5.0F, 5.0F), class_5603.field_27701);
      class_5610 var2 = var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(34, 0).method_32097(-1.5F, -6.0F, -1.5F, 3.0F, 6.0F, 3.0F), class_5603.method_32091(5.0F, -11.0F, 0.0F, 0.0F, 0.0F, -0.45F));
      class_5610 var3 = var2.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 10).method_32097(-1.5F, -2.5F, -2.0F, 5.0F, 3.0F, 4.0F), class_5603.method_32090(0.5F, -6.0F, 0.0F));
      var3.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(18, 10).method_32097(3.4F, -2.0F, -1.0F, 1.0F, 1.5F, 2.0F), class_5603.field_27701);
      var3.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(24, 10).method_32097(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F).method_32101(24, 10).method_32097(-2.5F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F), class_5603.method_32091(0.0F, -2.5F, -1.2F, -0.3F, 0.0F, 0.0F));
      var3.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(24, 10).method_32097(-0.5F, -5.0F, -0.5F, 1.0F, 5.0F, 1.0F).method_32101(24, 10).method_32097(-2.5F, -4.0F, -0.5F, 2.0F, 1.0F, 1.0F), class_5603.method_32091(0.0F, -2.5F, 1.2F, 0.3F, 0.0F, 0.0F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(30, 10).method_32097(-0.75F, 0.0F, -0.75F, 1.5F, 7.0F, 1.5F), class_5603.method_32090(4.5F, -7.0F, -1.4F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(30, 10).method_32097(-0.75F, 0.0F, -0.75F, 1.5F, 7.0F, 1.5F), class_5603.method_32090(4.5F, -7.0F, 1.4F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(30, 10).method_32097(-0.75F, 0.0F, -0.75F, 1.5F, 7.0F, 1.5F), class_5603.method_32090(-4.5F, -7.0F, -1.4F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(30, 10).method_32097(-0.75F, 0.0F, -0.75F, 1.5F, 7.0F, 1.5F), class_5603.method_32090(-4.5F, -7.0F, 1.4F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(38, 10).method_32097(-1.5F, -1.0F, -0.75F, 1.5F, 1.5F, 1.5F), class_5603.method_32090(-6.0F, -11.5F, 0.0F));
      return class_5607.method_32110(var0, 64, 32).method_32109();
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) << 13 | (char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) >>> 3) - var5) ^ 'ꄭ') - 31356) << 5 | (char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) << 13 | (char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) >>> 3) - var5) ^ 'ꄭ') - 31356) >>> 11) - '짡') ^ var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) << 13 | (char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) >>> 3) - var5) ^ 'ꄭ') - 31356) << 5 | (char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) << 13 | (char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8) >>> 3) - var5) ^ 'ꄭ') - 31356) >>> 11) - '짡') ^ var5) << 5))) - var5) - '颇'))) - '\udb77'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static class_630 IIlllIlliIll() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-10.0F, -9.0F, -6.0F, 20.0F, 5.0F, 12.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 17).method_32097(-11.0F, -15.0F, -6.0F, 4.0F, 7.0F, 12.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(32, 17).method_32097(9.0F, -12.0F, -6.0F, 3.0F, 4.0F, 12.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(64, 0).method_32097(-7.0F, -11.0F, -5.0F, 6.0F, 2.0F, 10.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(64, 12).method_32097(-6.0F, -16.0F, -3.5F, 6.0F, 7.0F, 7.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 40).method_32097(-11.0F, -1.0F, -6.0F, 24.0F, 1.0F, 1.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 40).method_32097(-11.0F, -1.0F, 5.0F, 24.0F, 1.0F, 1.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 44).method_32097(12.0F, -4.0F, -6.0F, 1.0F, 4.0F, 1.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 44).method_32097(12.0F, -4.0F, 5.0F, 1.0F, 4.0F, 1.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(8, 44).method_32097(-7.0F, -4.0F, -6.0F, 1.0F, 3.0F, 12.0F).method_32101(8, 44).method_32097(5.0F, -4.0F, -6.0F, 1.0F, 3.0F, 12.0F), class_5603.field_27701);
      return class_5607.method_32110(var0, 128, 64).method_32109();
   }

   private static void Iiiiliiiiiii(class_1011 y0, int w, int img, int h, int x0, int shade, int base) {
      long var9 = -4449524655499121474L;

      for(var9 ^= ((long)img << 32 ^ var9) & -1L << 32; (int)(var9 >>> 32) < img + x0; var9 += 4294967296L) {
         for(var9 ^= ((long)w ^ var9) & -1L >>> 32; (int)var9 < w + h; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            y0.method_61941((int)var9, (int)(var9 >>> 32), iIIIlIlIIl(shade, base, IIIIllIIIl((int)var9, (int)(var9 >>> 32)) * 0.35F));
         }
      }

   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ var5))) + '\ud826') ^ 4871) + '蜫'))) + 'ꆋ') ^ 32163) ^ var5) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static class_630 IIIllIIliIIl() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-1.0F, -4.0F, -0.5F, 2.0F, 8.0F, 1.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-4.0F, -1.0F, -0.5F, 8.0F, 2.0F, 1.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-1.0F, -3.0F, -0.4F, 2.0F, 6.0F, 1.0F), class_5603.method_32092(0.0F, 0.0F, 0.785F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-1.0F, -3.0F, -0.4F, 2.0F, 6.0F, 1.0F), class_5603.method_32092(0.0F, 0.0F, -0.785F));
      return class_5607.method_32110(var0, 16, 16).method_32109();
   }

   private static class_1011 IIiilIiiiIii(int h, int w, int base, int shade) {
      class_1011 var4 = new class_1011(h, w, true);
      Iiiiliiiiiii(var4, 0, 0, h, w, base, shade);
      return var4;
   }

   static void liiiIIllIl(class_310 mc) {
      long var2 = 680579535557375082L;
      if (!IIIilliiil) {
         IIIilliiil = true;
         iIlIlllllill(mc, Iilllliiil, IIIilIIiiIIi());
         iIlIlllllill(mc, lilllliiil, IlIillIiilIi());
         iIlIlllllill(mc, iilllliiil, IiIiliIiiiIi());
         iIlIlllllill(mc, IIillliiil, IIiilIiiiIii(16, 16, -11443, -1529554));
         iIlIlllllill(mc, lIillliiil, IIlilIliiIli());
         iIlIlllllill(mc, iIillliiil, Illillliilli());
         iIlIlllllill(mc, Ilillliiil, IIiilIiiiIii(8, 8, -1, -1));
         iIlIlllllill(mc, llillliiil, Ililllililil());
         iIlIlllllill(mc, ilillliiil, Iiilliiliiil());
         iIlIlllllill(mc, Iiillliiil, IIillIiliIil());

         for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < liillliiil.length; var4 += 4294967296L) {
            iIlIlllllill(mc, liillliiil[(int)(var4 >>> 32)], Iilililiiili(iiillliiil[(int)(var4 >>> 32)][0], iiillliiil[(int)(var4 >>> 32)][1]));
         }

      }
   }

   static class_630 IiIlliIliiIl() {
      class_5609 var0 = new class_5609();
      var0.method_32111().method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-0.75F, -0.75F, -0.75F, 1.5F, 1.5F, 1.5F), class_5603.field_27701);
      return class_5607.method_32110(var0, 8, 8).method_32109();
   }

   private static class_1011 IIlilIliiIli() {
      long var3 = -6399579858245131662L;
      class_1011 var0 = new class_1011(8, 32, true);

      for(var3 ^= (0L ^ var3) & -1L << 32; (int)(var3 >>> 32) < 32; var3 += 4294967296L) {
         for(var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < 8; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
            var0.method_61941((int)var3, (int)(var3 >>> 32), ((int)var3 + (int)(var3 >>> 32)) % 4 < 2 ? -6523832 : -9482190);
         }
      }

      return var0;
   }

   static class_630 Iilllilliill() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-1.5F, -3.5F, -1.5F, 3.0F, 3.5F, 3.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 8).method_32097(-1.2F, -3.3F, -1.2F, 2.4F, 0.4F, 2.4F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(12, 0).method_32097(1.5F, -2.8F, -0.4F, 1.0F, 2.0F, 0.8F), class_5603.field_27701);
      return class_5607.method_32110(var0, 16, 16).method_32109();
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7446527534398869113L ^ Long.rotateLeft(-196311822736067420L, 13) ^ 1170805396241324136L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7817060476872753923L ^ Long.rotateLeft(-6412974507269125285L, 51) ^ 969892654123816740L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1456110488612764556L ^ Long.rotateLeft(-136965280953135995L, 9) ^ 5835961490667995756L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 631243231354985179L ^ Long.rotateLeft(-6027903035305972218L, 22) ^ -3069044452386877646L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7508979907061379651L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4309759000837251565L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7441875253739265417L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5719255239184011617L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3716112699414538342L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2747490616115911110L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIlIliIlIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IllIllllIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, illIlIilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lilIliilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiIllIiIl<invokedynamic>());
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
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) << 8 | (char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) >>> 8) ^ var5))) - var5) << 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) << 8 | (char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) >>> 8) ^ var5))) - var5) >>> 13))) ^ '쟜') + 3753))) ^ 12479) + var5) << 10 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) << 8 | (char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) >>> 8) ^ var5))) - var5) << 3 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) << 8 | (char)((char)((char)((char)(-var4[var5]) ^ '\ued9e') + var5) ^ var5) >>> 8) ^ var5))) - var5) >>> 13))) ^ '쟜') + 3753))) ^ 12479) + var5) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_1011 IiIiliIiiiIi() {
      long var2 = 2228558186242076699L;
      class_1011 var0 = new class_1011(32, 16, true);
      Iiiiliiiiiii(var0, 0, 0, 14, 5, -592914, -2501428);
      Iiiiliiiiiii(var0, 0, 5, 32, 11, -3924434, -7465952);

      for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 32; var4 += 12884901888L) {
         var0.method_61941((int)(var4 >>> 32), 9, -13726889);
      }

      return var0;
   }

   static class_630 IlIlllIlilIl() {
      class_5609 var0 = new class_5609();
      var0.method_32111().method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-0.5F, 0.0F, -0.5F, 1.0F, 16.0F, 1.0F), class_5603.field_27701);
      return class_5607.method_32110(var0, 8, 32).method_32109();
   }

   private static void iIlIlllllill(class_310 img, class_2960 mc, class_1011 id) {
      if (mc == iIillliiil) {
         img.method_1531().method_4616(mc, new class_1043(() -> iiIIlIIlIl<invokedynamic>() + mc.method_12832(), id) {
            {
               this.field_63613 = RenderSystem.getSamplerCache().method_75293(AddressMode.CLAMP_TO_EDGE, AddressMode.CLAMP_TO_EDGE, FilterMode.LINEAR, FilterMode.LINEAR, false);
            }
         });
      } else {
         img.method_1531().method_4616(mc, new class_1043(() -> iiIIlIIlIl<invokedynamic>() + mc.method_12832(), id));
      }
   }

   private static class_1011 IlIillIiilIi() {
      long var5 = 2393680634762160104L;
      long var7 = -8223849162858298496L;
      class_1011 var0 = new class_1011(32, 32, true);
      var5 ^= (-20139505377869824L ^ var5) & -1L << 32;
      var5 ^= (-7449562L ^ var5) & -1L >>> 32;
      var7 ^= (-9972914061312L ^ var7) & -1L << 32;
      Iiiiliiiiiii(var0, 0, 0, 32, 32, (int)(var5 >>> 32), (int)var5);
      var0.method_61941(4, 5, -14018030);
      var0.method_61941(7, 5, -14018030);

      for(var7 ^= (4L ^ var7) & -1L >>> 32; (int)var7 <= 7; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
         var0.method_61941((int)var7, 7, (int)(var7 >>> 32));
      }

      var0.method_61941(3, 6, (int)(var7 >>> 32));
      var0.method_61941(8, 6, (int)(var7 >>> 32));
      var0.method_61941(5, 13, -1558454);
      var0.method_61941(5, 15, -12723068);
      var0.method_61941(5, 17, (int)(var7 >>> 32));

      for(long var13 = var7 ^ (18L ^ var7) & -1L >>> 32; (int)var13 < 26; var13 ^= (var13 ^ var13 + (long)2) & -1L >>> 32) {
         var0.method_61941((int)var13, 5, (int)(var13 >>> 32));
         var0.method_61941((int)var13 + 1, 6, (int)(var13 >>> 32));
         var0.method_61941((int)var13, 14, (int)(var13 >>> 32));
         var0.method_61941((int)var13 + 1, 15, (int)(var13 >>> 32));
      }

      return var0;
   }

   static class_630 IilliliilIIi() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-4.0F, -6.0F, -4.0F, 8.0F, 6.0F, 8.0F), class_5603.field_27701);
      class_5610 var2 = var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 14).method_32097(-4.5F, -2.0F, -4.5F, 9.0F, 2.0F, 9.0F), class_5603.method_32090(0.0F, -6.0F, 0.0F));
      var2.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(36, 14).method_32097(-3.0F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F), class_5603.method_32091(0.0F, -2.0F, 0.0F, 0.0F, 0.6F, 0.35F));
      var2.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(36, 14).method_32097(0.0F, -2.0F, -0.5F, 3.0F, 2.0F, 1.0F), class_5603.method_32091(0.0F, -2.0F, 0.0F, 0.0F, 0.6F, -0.35F));
      return class_5607.method_32110(var0, 64, 32).method_32109();
   }

   static class_630 iliIiiliiiii() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-2.0F, 0.0F, -1.5F, 4.0F, 2.0F, 3.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 5).method_32097(-1.5F, 2.0F, -1.0F, 3.0F, 6.0F, 2.0F), class_5603.field_27701);
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(10, 5).method_32097(-1.5F, 6.0F, -1.0F, 3.0F, 2.0F, 2.0F), class_5603.method_32091(1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F));
      return class_5607.method_32110(var0, 32, 16).method_32109();
   }

   static int iIIIlIlIIl(int b, int a, float t) {
      long var17 = 8934945249473442304L;
      long var11 = -4276434343675121958L;
      long var13 = 1574457424411610938L;
      long var15 = -2557227542947246666L;
      var11 ^= ((long)(b >> 16 & 255) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)(b >> 8 & 255) ^ var11) & -1L >>> 32;
      var13 ^= ((long)(b & 255) << 32 ^ var13) & -1L << 32;
      var13 ^= ((long)(b >>> 24) ^ var13) & -1L >>> 32;
      var15 ^= ((long)((int)((float)((int)(var11 >>> 32)) + (float)((a >> 16 & 255) - (int)(var11 >>> 32)) * t)) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)((int)((float)((int)var11) + (float)((a >> 8 & 255) - (int)var11) * t)) ^ var15) & -1L >>> 32;
      var17 ^= ((long)((int)((float)((int)(var13 >>> 32)) + (float)((a & 255) - (int)(var13 >>> 32)) * t)) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)((int)((float)((int)var13) + (float)((a >>> 24) - (int)var13) * t)) ^ var17) & -1L >>> 32;
      return (int)var17 << 24 | (int)(var15 >>> 32) << 16 | (int)var15 << 8 | (int)(var17 >>> 32);
   }

   static class_2960 IliIlllilIi(String name) {
      return class_2960.method_60655(iiIIlIIlIl<invokedynamic>(), iiIIlIIlIl<invokedynamic>() + name);
   }

   private static class_1011 Iiilliiliiil() {
      class_1011 var0 = new class_1011(64, 32, true);
      Iiiiliiiiiii(var0, 0, 0, 64, 32, -8760782, -10600924);
      Iiiiliiiiiii(var0, 0, 5, 34, 5, -6524856, -8760782);
      Iiiiliiiiiii(var0, 18, 10, 6, 4, -14018030, -15069174);
      Iiiiliiiiiii(var0, 24, 10, 6, 8, -2506086, -4677512);
      Iiiiliiiiiii(var0, 30, 10, 8, 10, -11915232, -13229553);
      Iiiiliiiiiii(var0, 38, 10, 6, 4, -725536, -2568256);
      return var0;
   }

   private static void Iliilliiilii(class_1011 w, int img, int x0, int argb, int h, int y0) {
      long var8 = 3922150733805787091L;

      for(var8 ^= ((long)x0 << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) < x0 + h; var8 += 4294967296L) {
         for(var8 ^= ((long)img ^ var8) & -1L >>> 32; (int)var8 < img + argb; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            w.method_61941((int)var8, (int)(var8 >>> 32), y0);
         }
      }

   }

   private static class_1011 Iilililiiili(int ribbon, int box) {
      long var4 = -1954124881288953837L;
      class_1011 var2 = new class_1011(64, 32, true);
      Iiiiliiiiiii(var2, 0, 0, 64, 32, ribbon, iIIIlIlIIl(ribbon, -16777216, 0.18F));

      for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < 14; var4 += 4294967296L) {
         Iliilliiilii(var2, 11, (int)(var4 >>> 32), 2, 1, box);
         Iliilliiilii(var2, 27, (int)(var4 >>> 32), 2, 1, box);
         Iliilliiilii(var2, 3, (int)(var4 >>> 32), 2, 1, box);
         Iliilliiilii(var2, 19, (int)(var4 >>> 32), 2, 1, box);
      }

      Iliilliiilii(var2, 8, 3, 8, 2, box);
      Iliilliiilii(var2, 11, 0, 2, 8, box);

      for(long var7 = var4 ^ (60129542144L ^ var4) & -1L << 32; (int)(var7 >>> 32) < 25; var7 += 4294967296L) {
         Iliilliiilii(var2, 13, (int)(var7 >>> 32), 2, 1, box);
         Iliilliiilii(var2, 31, (int)(var7 >>> 32), 2, 1, box);
         Iliilliiilii(var2, 4, (int)(var7 >>> 32), 2, 1, box);
         Iliilliiilii(var2, 22, (int)(var7 >>> 32), 2, 1, box);
      }

      Iliilliiilii(var2, 9, 18, 9, 2, box);
      Iliilliiilii(var2, 36, 14, 8, 3, box);
      return var2;
   }

   private static float IIIIllIIIl(int y, int x) {
      long var3 = 6326929048571037291L;
      var3 ^= ((long)(y * 73856093 ^ x * 19349663) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(((int)(var3 >>> 32) ^ (int)(var3 >>> 32) >>> 13) * 1540483477) << 32 ^ var3) & -1L << 32;
      return (float)((int)(var3 >>> 32) >>> 8 & 255) / 255.0F;
   }

   private static class_1011 IIIilIIiiIIi() {
      long var16 = 4933518243805607848L;
      long var18 = -2893739149165662922L;
      long var20 = 1272488544840153843L;
      long var22 = 6129724674530581938L;
      long var24 = 2960510031007229082L;
      long var14 = 4984477105423961582L;
      class_1011 var0 = new class_1011(64, 64, true);
      var14 ^= (-16855315685310464L ^ var14) & -1L << 32;
      var14 ^= (-6679518L ^ var14) & -1L >>> 32;
      var16 ^= (-2546546239340544L ^ var16) & -1L << 32;
      var16 ^= (-2501428L ^ var16) & -1L >>> 32;
      var18 ^= (-3722237702045696L ^ var18) & -1L << 32;
      var18 ^= (-1537398L ^ var18) & -1L >>> 32;
      var20 ^= (-59906598981599232L ^ var20) & -1L << 32;
      var20 ^= (-15066598L ^ var20) & -1L >>> 32;
      var22 ^= (-6552771473965056L ^ var22) & -1L << 32;
      Iiiiliiiiiii(var0, 0, 0, 32, 16, (int)(var16 >>> 32), (int)var16);
      Iliilliiilii(var0, 8, 0, 8, 8, (int)(var14 >>> 32));
      Iliilliiilii(var0, 8, 8, 8, 1, (int)(var14 >>> 32));
      Iliilliiilii(var0, 8, 9, 8, 1, (int)(var16 >>> 32));
      Iliilliiilii(var0, 8, 10, 8, 3, (int)(var18 >>> 32));
      var0.method_61941(9, 10, (int)(var16 >>> 32));
      var0.method_61941(10, 10, (int)(var16 >>> 32));
      var0.method_61941(13, 10, (int)(var16 >>> 32));
      var0.method_61941(14, 10, (int)(var16 >>> 32));
      var0.method_61941(10, 11, (int)(var20 >>> 32));
      var0.method_61941(13, 11, (int)(var20 >>> 32));
      var0.method_61941(9, 12, (int)var18);
      var0.method_61941(14, 12, (int)var18);
      var0.method_61941(11, 12, -1464182);
      var0.method_61941(12, 12, -1464182);
      Iliilliiilii(var0, 8, 13, 8, 3, (int)(var16 >>> 32));
      int[][] var10 = (int[][])(new int[]{0, 16, 24});
      var22 ^= ((long)var10.length ^ var22) & -1L >>> 32;

      for(var24 ^= (0L ^ var24) & -1L << 32; (int)(var24 >>> 32) < (int)var22; var24 += 4294967296L) {
         var24 ^= ((long)var10[(int)(var24 >>> 32)] ^ var24) & -1L >>> 32;
         Iliilliiilii(var0, (int)var24, 8, 8, 1, (int)(var14 >>> 32));
         Iliilliiilii(var0, (int)var24, 9, 8, 1, (int)(var16 >>> 32));
      }

      Iliilliiilii(var0, 40, 13, 8, 3, (int)(var16 >>> 32));
      Iliilliiilii(var0, 48, 0, 8, 8, 0);
      Iliilliiilii(var0, 48, 5, 8, 3, (int)(var16 >>> 32));
      Iiiiliiiiiii(var0, 16, 16, 24, 16, (int)(var14 >>> 32), (int)var14);
      Iliilliiilii(var0, 20, 20, 8, 12, (int)(var14 >>> 32));
      Iliilliiilii(var0, 23, 20, 2, 6, (int)(var16 >>> 32));
      Iliilliiilii(var0, 16, 26, 24, 2, (int)var20);
      Iliilliiilii(var0, 22, 26, 4, 2, (int)(var22 >>> 32));
      var0.method_61941(23, 26, -4684242);
      var0.method_61941(24, 26, -4684242);
      Iliilliiilii(var0, 16, 30, 24, 2, (int)(var16 >>> 32));
      Iliilliiilii(var0, 23, 36, 2, 6, (int)(var16 >>> 32));
      Iliilliiilii(var0, 20, 46, 8, 2, (int)(var16 >>> 32));
      var10 = new int[][]{{40, 16}, {32, 48}};
      var22 ^= ((long)var10.length ^ var22) & -1L >>> 32;

      for(var24 ^= (0L ^ var24) & -1L << 32; (int)(var24 >>> 32) < (int)var22; var24 += 4294967296L) {
         int[] var13 = var10[(int)(var24 >>> 32)];
         Iiiiliiiiiii(var0, var13[0], var13[1], 16, 16, (int)(var14 >>> 32), (int)var14);
         Iliilliiilii(var0, var13[0], var13[1] + 12, 16, 2, (int)(var16 >>> 32));
         Iliilliiilii(var0, var13[0], var13[1] + 14, 16, 2, (int)var20);
         Iliilliiilii(var0, var13[0] + 8, var13[1], 4, 4, (int)var20);
      }

      var10 = new int[][]{{0, 16}, {16, 48}};
      var22 ^= ((long)var10.length ^ var22) & -1L >>> 32;

      for(long var44 = var24 ^ (0L ^ var24) & -1L << 32; (int)(var44 >>> 32) < (int)var22; var44 += 4294967296L) {
         int[] var28 = var10[(int)(var44 >>> 32)];
         Iiiiliiiiiii(var0, var28[0], var28[1], 16, 16, (int)(var14 >>> 32), (int)var14);
         Iliilliiilii(var0, var28[0], var28[1] + 12, 16, 4, (int)var20);
         Iliilliiilii(var0, var28[0] + 8, var28[1], 4, 4, (int)var20);
      }

      Iliilliiilii(var0, 4, 44, 4, 1, (int)(var16 >>> 32));
      Iliilliiilii(var0, 4, 60, 4, 1, (int)(var16 >>> 32));
      return var0;
   }

   private static class_1011 Ililllililil() {
      long var2 = 7156643269465522338L;
      class_1011 var0 = new class_1011(128, 64, true);
      Iiiiliiiiiii(var0, 0, 0, 128, 64, -3924434, -7465952);

      for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < 64; var4 += 4294967296L) {
         var0.method_61941((int)(var4 >>> 32), 6, -1525686);
         var0.method_61941((int)(var4 >>> 32), 15, -1525686);
      }

      Iiiiliiiiiii(var0, 64, 0, 32, 12, -13730481, -14788040);
      Iiiiliiiiiii(var0, 64, 12, 28, 14, -7710157, -9747418);
      Iiiiliiiiiii(var0, 0, 40, 64, 10, -1525686, -4684242);
      Iiiiliiiiiii(var0, 8, 44, 32, 16, -4684242, -7445472);
      return var0;
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) << 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) >>> 13) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) << 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) >>> 13) << 9))) << 8 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) << 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) >>> 13) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) << 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\uf872') << 11)) + var5) - var5) + var5) + 16832))) >>> 13) << 9))) >>> 8) + 'ꁘ') + var5) + 28824) - '锸') ^ 23135));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_1011 Illillliilli() {
      long var8 = 8769196842026231349L;
      long var10 = -3955235811817694924L;
      class_1011 var0 = new class_1011(32, 32, true);

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < 32; var8 += 4294967296L) {
         for(var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < 32; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            float var3 = ((float)((int)var8) + 0.5F) / 16.0F - 1.0F;
            float var4 = ((float)((int)(var8 >>> 32)) + 0.5F) / 16.0F - 1.0F;
            float var5 = Math.min(1.0F, (float)Math.sqrt((double)(var3 * var3 + var4 * var4)));
            float var6 = (1.0F - var5) * (1.0F - var5);
            var10 ^= ((long)Math.round(255.0F * var6 * var6 * (3.0F - 2.0F * var6)) << 32 ^ var10) & -1L << 32;
            var0.method_61941((int)var8, (int)(var8 >>> 32), (int)(var10 >>> 32) << 24 | 16777215);
         }
      }

      return var0;
   }

   static class_630 lIiiIiIlilli() {
      class_5609 var0 = new class_5609();
      class_5610 var1 = var0.method_32111();
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 9).method_32097(-3.0F, 0.0F, -1.5F, 6.0F, 6.0F, 3.0F), class_5603.method_32090(0.0F, -6.0F, 0.0F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(0, 0).method_32097(-3.0F, -6.0F, -1.5F, 6.0F, 6.0F, 3.0F), class_5603.method_32090(0.0F, -6.0F, 0.0F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(18, 0).method_32097(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F), class_5603.method_32090(-4.0F, -5.0F, 0.0F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(18, 0).method_32096().method_32097(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 2.0F), class_5603.method_32090(4.0F, -5.0F, 0.0F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(18, 9).method_32097(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), class_5603.method_32090(-1.6F, 0.0F, 0.0F));
      var1.method_32117(iiIIlIIlIl<invokedynamic>(), class_5606.method_32108().method_32101(18, 9).method_32096().method_32097(-1.0F, 0.0F, -1.0F, 2.0F, 5.0F, 2.0F), class_5603.method_32090(1.6F, 0.0F, 0.0F));
      return class_5607.method_32110(var0, 32, 32).method_32109();
   }
}
