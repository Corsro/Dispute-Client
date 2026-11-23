package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2281;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2745;
import net.minecraft.class_310;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public final class iIIiiIlIlIiiIl {
   public static final int IlIlliillllIlliill = -13375745;
   private static final List<float[]> IIIiliilllIIiliill = new ArrayList();
   public static final int ilIlliillIiIlliill = -4669236;
   private static final double Iillliilllillliill = (double)2400.0F;
   public static final int lIIlliilliIIlliill = -871589;
   public static final int iIllliillIlllliill = -11870592;
   private static final double iillliillIIilliill = (double)1200.0F;
   private static final float liilliilliiilliill = 0.2F;
   public static final int IIllliilllIllliill = -38037;
   private static final float ililliillIiilliill = 0.16F;
   public static final int iiiIliillIIIlliill = -12723068;
   private static final float llllliillilllliill = 0.02F;
   private static final double lIilliilliIilliill = (double)3000.0F;
   public static final int liIlliilliiIlliill = -42406;
   private static final float Ililliillllilliill = 2.5F;

   private static float Iilllilliill(float x1, float w, float h, float y1) {
      long var8 = -1601022881774906163L;

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < 6; var8 += 4294967296L) {
         var8 ^= (0L ^ var8) & -1L >>> 32;

         for(float[] var7 : IIIiliilllIIiliill) {
            if (x1 < var7[2] && x1 + h > var7[0] && w < var7[3] && w + y1 > var7[1]) {
               w = var7[1] - y1 - 2.0F >= 2.0F ? var7[1] - y1 - 2.0F : var7[3] + 2.0F;
               var8 ^= (1L ^ var8) & -1L >>> 32;
            }
         }

         if ((int)var8 == 0) {
            break;
         }
      }

      Illlllllilll(x1, w, h, y1);
      return w;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 574225650697195403L ^ Long.rotateLeft(-7748456613514720350L, 47) ^ -2126489987096527884L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2738416233536636025L ^ Long.rotateLeft(-6973373981944519868L, 56) ^ 308062149833448630L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6936716602419564323L ^ Long.rotateLeft(-8702162977338459508L, 52) ^ -9137112113368497492L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3067158477148360360L ^ Long.rotateLeft(-7107075140026044542L, 9) ^ 7204879106386485739L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8443037429969725565L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 239224206386972277L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5849867572334277909L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8029249974280300377L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7441016941183376043L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1196047883290606222L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illillliilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilililiiili<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiilIiiiIii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iliilliiilii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiiiliiiiiii<invokedynamic>());
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
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) + '陑') ^ var5))))) >>> 14 | (char)(~((char)(~((char)((char)((char)(~var4[var5]) + '陑') ^ var5))))) << 2)))))) - 24854) - '\udf40') << 14 | (char)((char)((char)(-((char)(-((char)((char)((char)(~((char)(~((char)((char)((char)(~var4[var5]) + '陑') ^ var5))))) >>> 14 | (char)(~((char)(~((char)((char)((char)(~var4[var5]) + '陑') ^ var5))))) << 2)))))) - 24854) - '\udf40') >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '蓝') - '옍') << 13 | (char)((char)((char)(~var4[var5]) + '蓝') - '옍') >>> 3) + var5) - var5) + '콞') - var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '蓝') - '옍') << 13 | (char)((char)((char)(~var4[var5]) + '蓝') - '옍') >>> 3) + var5) - var5) + '콞') - var5) << 6) ^ '\ue158') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '蓝') - '옍') << 13 | (char)((char)((char)(~var4[var5]) + '蓝') - '옍') >>> 3) + var5) - var5) + '콞') - var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '蓝') - '옍') << 13 | (char)((char)((char)(~var4[var5]) + '蓝') - '옍') >>> 3) + var5) - var5) + '콞') - var5) << 6) ^ '\ue158') << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float IilliliilIIi() {
      double var0 = (double)(System.currentTimeMillis() % 1200L) / (double)1200.0F;
      return 0.5F + 0.5F * (float)Math.sin(var0 * Math.PI * (double)2.0F);
   }

   public static void IIillIiliIil(class_4587 scale, String sx, String title, int matrices, float accent, float sy, float meta) {
      long var24 = 3294709933733114362L;
      IIliiIlllIliiIll var7 = CorzClient.fontManager.lIiiIiIlilli();
      float var8 = var7.IilliliilIIi();
      float var9 = var8 * 0.42F;
      float var10 = 4.0F;
      float var11 = 6.0F;
      float var12 = 4.0F;
      float var13 = 1.5F;
      var24 ^= ((long)(title != null && !title.isEmpty() ? 1 : 0) << 32 ^ var24) & -1L << 32;
      float var15 = Math.max(var7.iIlIlllllill(sx), (int)(var24 >>> 32) != 0 ? var7.iIlIlllllill(title) : 0.0F);
      float var16 = var9 + var10 + var15 + var11 * 2.0F;
      float var17 = var8 * (float)((int)(var24 >>> 32) != 0 ? 2 : 1) + ((int)(var24 >>> 32) != 0 ? var13 : 0.0F) + var12 * 2.0F;
      sy = Iilllilliill(accent - var16 * meta / 2.0F, sy - var17 * meta, var16 * meta, var17 * meta) + var17 * meta;
      scale.method_22903();
      scale.method_46416(accent, sy, 0.0F);
      scale.method_22905(meta, meta, 1.0F);
      scale.method_46416(-accent, -sy, 0.0F);
      float var18 = accent - var16 / 2.0F;
      float var19 = sy - var17;
      var24 ^= (-16184564L ^ var24) & -1L >>> 32;
      llilllililll.IiIlliIliiIl(scale, new Color((int)var24 >> 16 & 255, (int)var24 >> 8 & 255, (int)var24 & 255, 215), (double)var18, (double)var19, (double)(var18 + var16), (double)(var19 + var17), (double)2.5F, (double)4.0F);
      float var21 = var18 + var11;
      float var22 = var19 + var12 + (var8 - var9) / 2.0F;
      llilllililll.IiIlliIliiIl(scale, new Color(matrices >> 16 & 255, matrices >> 8 & 255, matrices & 255, 255), (double)var21, (double)var22, (double)(var21 + var9), (double)(var22 + var9), (double)(var9 / 2.0F), (double)6.0F);
      float var23 = var18 + var11 + var9 + var10;
      var7.IliIlllilIi(sx, var23, var19 + var12, new Color(-1));
      if ((int)(var24 >>> 32) != 0) {
         var7.IliIlllilIi(title, var23, var19 + var12 + var8 + var13, new Color(-8421505));
      }

      scale.method_22909();
   }

   public static void IiIlliIliiIl(Matrix4f p, class_2338 active, int a, float rgb, boolean m) {
      long var32 = 8833697532178456251L;
      long var34 = -3240921957133059679L;
      long var36 = 8165336332061149777L;
      float var5 = (float)active.method_10263();
      float var6 = (float)active.method_10260();
      float var7 = var5 + 1.0F;
      float var8 = var6 + 1.0F;
      float var9 = (float)active.method_10264() + 1.01F;
      iIiiIIilIliiIIil.Illillliilli(p, var5, var9, var6, var7, var9, var6, var7, var9, var8, var5, var9, var8, IlIillIiilIi(a, rgb * (m ? 0.26F : 0.18F)));
      var32 ^= ((long)IlIillIiilIi(a, rgb * 0.55F) << 32 ^ var32) & -1L << 32;
      iIiiIIilIliiIIil.Iliilliiilii(p, var5, var9, var6, var7, var9, var6, (int)(var32 >>> 32), 1.2F);
      iIiiIIilIliiIIil.Iliilliiilii(p, var7, var9, var6, var7, var9, var8, (int)(var32 >>> 32), 1.2F);
      iIiiIIilIliiIIil.Iliilliiilii(p, var7, var9, var8, var5, var9, var8, (int)(var32 >>> 32), 1.2F);
      iIiiIIilIliiIIil.Iliilliiilii(p, var5, var9, var8, var5, var9, var6, (int)(var32 >>> 32), 1.2F);
      float var11 = var5 + 0.5F;
      float var12 = var6 + 0.5F;
      var32 ^= ((long)IlIillIiilIi(a, rgb * (m ? 0.6F : 0.35F)) ^ var32) & -1L >>> 32;
      var34 ^= ((long)IlIillIiilIi(a, 0.0F) << 32 ^ var34) & -1L << 32;
      class_4588 var15 = iIiiIIilIliiIIil.IilliliilIIi();
      iIiiIIilIliiIIil.IlIlllIlilIl(var15, p, var11 - 0.16F, var9, var12, (int)var32, var11 + 0.16F, var9, var12, (int)var32, var11 + 0.16F, var9 + 2.5F, var12, (int)(var34 >>> 32), var11 - 0.16F, var9 + 2.5F, var12, (int)(var34 >>> 32));
      iIiiIIilIliiIIil.IlIlllIlilIl(var15, p, var11, var9, var12 - 0.16F, (int)var32, var11, var9, var12 + 0.16F, (int)var32, var11, var9 + 2.5F, var12 + 0.16F, (int)(var34 >>> 32), var11, var9 + 2.5F, var12 - 0.16F, (int)(var34 >>> 32));
      double var16 = (double)(System.currentTimeMillis() % 3000L) / (double)3000.0F * Math.PI * (double)2.0F;
      float var18 = (float)Math.cos(var16);
      float var19 = (float)Math.sin(var16);
      float var20 = 0.56F;
      float var21 = var9 + 0.01F;
      var34 ^= ((long)IlIillIiilIi(a, rgb * 0.95F) ^ var34) & -1L >>> 32;

      for(long var42 = var36 ^ (0L ^ var36) & -1L << 32; (int)(var42 >>> 32) < 4; var42 += 4294967296L) {
         float var24 = (int)(var42 >>> 32) != 0 && (int)(var42 >>> 32) != 3 ? 1.0F : -1.0F;
         float var25 = (int)(var42 >>> 32) < 2 ? -1.0F : 1.0F;
         float var26 = var11 + (var24 * var20 * var18 - var25 * var20 * var19);
         float var27 = var12 + var24 * var20 * var19 + var25 * var20 * var18;
         float var28 = -var24 * 0.2F;
         float var29 = 0.0F;
         float var30 = 0.0F;
         float var31 = -var25 * 0.2F;
         iIiiIIilIliiIIil.Iliilliiilii(p, var26, var21, var27, var26 + (var28 * var18 - var29 * var19), var21, var27 + var28 * var19 + var29 * var18, (int)var34, 2.0F);
         iIiiIIilIliiIIil.Iliilliiilii(p, var26, var21, var27, var26 + (var30 * var18 - var31 * var19), var21, var27 + var30 * var19 + var31 * var18, (int)var34, 2.0F);
      }

   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '薖'))) ^ var5) + var5) + var5) - '\uf6db') ^ 31119) << 3 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '薖'))) ^ var5) + var5) + var5) - '\uf6db') ^ 31119) >>> 13) + var5) + var5) + '\udb5b') ^ 4959));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float IIIilIIiiIIi(double dist) {
      if (dist > (double)48.0F) {
         return 0.0F;
      } else {
         return dist > (double)24.0F ? 0.6F : 1.0F;
      }
   }

   public static void Illlllllilll(float h, float x1, float w, float y1) {
      IIIiliilllIIiliill.add(new float[]{h, x1, h + w, x1 + y1});
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\uf7db') ^ var5) >>> 15 | (char)((char)((char)(var4[var5] + var5) ^ '\uf7db') ^ var5) << 1) ^ var5) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\uf7db') ^ var5) >>> 15 | (char)((char)((char)(var4[var5] + var5) ^ '\uf7db') ^ var5) << 1) ^ var5) << 5) ^ '\uf73f') + var5) ^ var5) + 6128) - 29538))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void Ililllililil(class_4587 accent, String text, String sub, int matrices) {
      long var23 = 3639797895954483353L;
      class_310 var4 = class_310.method_1551();
      IIliiIlllIliiIll var5 = CorzClient.fontManager.lIiiIiIlilli();
      float var6 = var5.IilliliilIIi();
      float var7 = var6 * 0.42F;
      float var8 = 5.0F;
      float var9 = 8.0F;
      float var10 = 5.0F;
      float var11 = 8.0F;
      float var12 = var5.iIlIlllllill(text);
      float var13 = sub == null ? 0.0F : var5.iIlIlllllill(sub);
      float var14 = var9 * 2.0F + var7 + var8 + var12 + (sub == null ? 0.0F : var11 + var13);
      float var15 = var6 + var10 * 2.0F;
      float var16 = (float)var4.method_22683().method_4486() / 2.0F - var14 / 2.0F;
      float var17 = (float)var4.method_22683().method_4502() / 2.0F + 26.0F;
      var23 ^= (-69512173080018944L ^ var23) & -1L << 32;
      llilllililll.IiIlliIliiIl(accent, new Color((int)(var23 >>> 32) >> 16 & 255, (int)(var23 >>> 32) >> 8 & 255, (int)(var23 >>> 32) & 255, 225), (double)var16, (double)var17, (double)(var16 + var14), (double)(var17 + var15), (double)4.0F, (double)6.0F);
      float var19 = 0.6F + 0.4F * iIlIlllllill();
      float var20 = var16 + var9;
      float var21 = var17 + var10 + (var6 - var7) / 2.0F;
      llilllililll.IiIlliIliiIl(accent, new Color(matrices >> 16 & 255, matrices >> 8 & 255, matrices & 255, Math.round(255.0F * var19)), (double)var20, (double)var21, (double)(var20 + var7), (double)(var21 + var7), (double)(var7 / 2.0F), (double)6.0F);
      float var22 = var20 + var7 + var8;
      var5.IliIlllilIi(text, var22, var17 + var10, new Color(-1));
      if (sub != null) {
         var5.IliIlllilIi(sub, var22 + var12 + var11, var17 + var10, new Color(-8421505));
      }

   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) >>> 8))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) >>> 8))) << 2) ^ var5) << 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) >>> 8))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') << 8 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) << 6 | (char)((char)((char)((char)(var4[var5] + 31340) + 7004) ^ var5) + var5) >>> 10))) - '\ue215') >>> 8) >>> 5) ^ 2053) + var5) >>> 8))) << 2) ^ var5) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float iIlIlllllill() {
      double var0 = (double)(System.currentTimeMillis() % 2400L) / (double)2400.0F;
      return 0.75F + 0.25F * (0.5F + 0.5F * (float)Math.sin(var0 * Math.PI * (double)2.0F));
   }

   public static String liiiIIllIl(IlliliIillliliIi role) {
      if (role == null) {
         return IIlilIliiIli<invokedynamic>();
      } else {
         String var10000;
         switch (role) {
            case llllIiiIIi -> var10000 = IIlilIliiIli<invokedynamic>();
            case IlllIiiIIi -> var10000 = IIlilIliiIli<invokedynamic>();
            case iIllIiiIIi -> var10000 = IIlilIliiIli<invokedynamic>();
            case IillIiiIIi -> var10000 = IIlilIliiIli<invokedynamic>();
            case illlIiiIIi -> var10000 = IIlilIliiIli<invokedynamic>();
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }

   public static int IlIillIiilIi(int a, float rgb) {
      long var3 = -8744644480665933767L;
      var3 ^= ((long)Math.max(0, Math.min(255, Math.round(IiIiliIiiiIi(rgb) * 255.0F))) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << 24 | a & 16777215;
   }

   private static float IiIiliIiiiIi(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   public static class_238 iliIiiliiiii(class_2338 pos) {
      class_238 var1 = IIIllIIliIIl(pos);
      class_2338 var2 = lIiiIiIlilli(pos);
      return var2 == null ? var1 : var1.method_991(IIIllIIliIIl(var2));
   }

   private static class_238 IIIllIIliIIl(class_2338 pos) {
      class_310 var1 = class_310.method_1551();
      class_238 var2 = new class_238(pos);
      if (var1.field_1687 == null) {
         return var2;
      } else {
         try {
            class_265 var3 = var1.field_1687.method_8320(pos).method_26218(var1.field_1687, pos);
            return var3.method_1110() ? var2 : var3.method_1107().method_996(pos);
         } catch (Exception var4) {
            return var2;
         }
      }
   }

   public static void IlIlllIlilIl(Matrix4f m, class_238 fill, int a, float b, float rgb, float width) {
      float var6 = (float)fill.field_1323 - 0.02F;
      float var7 = (float)fill.field_1322 - 0.02F;
      float var8 = (float)fill.field_1321 - 0.02F;
      float var9 = (float)fill.field_1320 + 0.02F;
      float var10 = (float)fill.field_1325 + 0.02F;
      float var11 = (float)fill.field_1324 + 0.02F;
      if (rgb > 0.002F) {
         iIiiIIilIliiIIil.IIlilIliiIli(m, var6, var7, var8, var9, var10, var11, (float)(a >> 16 & 255) / 255.0F, (float)(a >> 8 & 255) / 255.0F, (float)(a & 255) / 255.0F, IiIiliIiiiIi(rgb * b));
      }

      iIiiIIilIliiIIil.iIIIlIlIIl(m, var6, var7, var8, var9, var10, var11, IlIillIiilIi(0, b * 0.45F), width + 2.0F);
      iIiiIIilIliiIIil.iIIIlIlIIl(m, var6, var7, var8, var9, var10, var11, IlIillIiilIi(a, b), width);
   }

   public static class_2338 lIiiIiIlilli(class_2338 pos) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1687 != null && pos != null) {
         class_2680 var2 = var1.field_1687.method_8320(pos);
         if (var2.method_26204() instanceof class_2281 && var2.method_28498(class_2281.field_10770)) {
            return var2.method_11654(class_2281.field_10770) == class_2745.field_12569 ? null : pos.method_10093(class_2281.method_9758(var2));
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private iIIiiIlIlIiiIl() {
   }

   public static void IIlllIlliIll() {
      IIIiliilllIIiliill.clear();
   }

   public static class_243 Iiilliiliiil(class_238 b) {
      return new class_243((b.field_1323 + b.field_1320) / (double)2.0F, b.field_1325 + 0.35, (b.field_1321 + b.field_1324) / (double)2.0F);
   }

   public static int IliIlllilIi(IlliliIillliliIi role) {
      if (role == null) {
         return -4669236;
      } else {
         int var10000;
         switch (role) {
            case llllIiiIIi -> var10000 = -12723068;
            case IlllIiiIIi -> var10000 = IlIIilIlllIIilIl.lliiIlliIl | -16777216;
            case iIllIiiIIi -> var10000 = -871589;
            case IillIiiIIi -> var10000 = -13375745;
            case illlIiiIIi -> var10000 = -4669236;
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }
}
