package gg.corz;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1059;
import net.minecraft.class_10799;
import net.minecraft.class_1087;
import net.minecraft.class_10889;
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_5611;
import net.minecraft.class_5819;
import net.minecraft.class_777;
import net.minecraft.class_9799;
import org.joml.Matrix4f;
import org.joml.Vector3fc;

public final class lilIiIliilIiIl {
   private static final class_2350[] iIiIlIillIliIlIill;
   private static class_1087 IlIllIillllIllIill;
   private static final class_1921 iiiIlIillIIIllIill;
   private static float[] ilIllIillIiIllIill;
   private static final RenderPipeline IiiIlIillliiIlIill;
   private static final class_2680 lliIlIilliliIlIill;
   private static final float[] IIiIlIilllIiIlIill = new float[]{0.55F, 1.0F, 0.82F, 0.82F, 0.68F, 0.68F};
   private static final int lilIlIilliilIlIill = 6;
   private static class_4597.class_4598 lIIllIilliIIllIill;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 12212) ^ 30998) + '푸') + '잜') + var5) << 9 | (char)((char)((char)((char)((char)(var4[var5] + 12212) ^ 30998) + '푸') + '잜') + var5) >>> 7))) - 10942) << 13 | (char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 12212) ^ 30998) + '푸') + '잜') + var5) << 9 | (char)((char)((char)((char)((char)(var4[var5] + 12212) ^ 30998) + '푸') + '잜') + var5) >>> 7))) - 10942) >>> 3))) - '颚') - '輈'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IliIlllilIi(List<class_2338> alpha, int blocks) {
      if (alpha.isEmpty()) {
         return 0;
      } else {
         float[] var2 = iIlIlllllill();
         if (var2.length == 0) {
            return 0;
         } else {
            Matrix4f var3 = iIiiIIilIliiIIil.IIillIiliIil();
            class_4597.class_4598 var4 = liiiIIllIl();
            class_4588 var5 = var4.method_73477(iiiIlIillIIIllIill);
            int var6 = Math.max(0, Math.min(255, blocks)) << 24;
            int var7 = 0;

            for(int var8 = alpha.size() - 1; var8 >= 0; --var8) {
               class_2338 var9 = (class_2338)alpha.get(var8);
               if (!iIiiIIilIliiIIil.IlIillIiilIi((double)var9.method_10263() + (double)0.5F, (double)var9.method_10264() + (double)0.5F, (double)var9.method_10260() + (double)0.5F, 1.0F)) {
                  float var10 = iIiiIIilIliiIIil.Ililllililil((double)var9.method_10263());
                  float var11 = iIiiIIilIliiIIil.Iiilliiliiil((double)var9.method_10264());
                  float var12 = iIiiIIilIliiIIil.IIIilIIiiIIi((double)var9.method_10260());

                  for(int var13 = 0; var13 < var2.length; var13 += 6) {
                     int var14 = Math.round(255.0F * var2[var13 + 5]);
                     var5.method_22918(var3, var10 + var2[var13], var11 + var2[var13 + 1], var12 + var2[var13 + 2]).method_22913(var2[var13 + 3], var2[var13 + 4]).method_39415(var6 | var14 << 16 | var14 << 8 | var14);
                  }

                  ++var7;
               }
            }

            var4.method_22994(iiiIlIillIIIllIill);
            return var7;
         }
      }
   }

   private static class_4597.class_4598 liiiIIllIl() {
      if (lIIllIilliIIllIill == null) {
         lIIllIilliIIllIill = class_4597.method_22991(new class_9799(((1180755437 ^ -65) << 31 | (1180755437 ^ -65) >>> 1) ^ 1556843817));
      }

      return lIIllIilliIIllIill;
   }

   private lilIiIliilIiIl() {
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4))) - var5) ^ var5))) ^ var5) + '\uf406') << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4))) - var5) ^ var5))) ^ var5) + '\uf406') >>> 12) ^ var5))) >>> 10 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4))) - var5) ^ var5))) ^ var5) + '\uf406') << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4))) - var5) ^ var5))) ^ var5) + '\uf406') >>> 12) ^ var5))) << 6) - var5) - var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') << 14 | (char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') >>> 2))) - var5))) - var5) - var5))) >>> 14 | (char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') << 14 | (char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') >>> 2))) - var5))) - var5) - var5))) << 2) - var5) << 2 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') << 14 | (char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') >>> 2))) - var5))) - var5) - var5))) >>> 14 | (char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') << 14 | (char)((char)((char)(~((char)(-((char)(var4[var5] - 9785))))) ^ 7198) - '跈') >>> 2))) - var5))) - var5) - var5))) << 2) - var5) >>> 14) + var5) + 25425) - var5) ^ '\ue3d8'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6259679124036375461L ^ Long.rotateLeft(-109022438971351079L, 19) ^ -6258264236958399616L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6256390017261766240L ^ Long.rotateLeft(-2970758093699773207L, 25) ^ -6270235582543380313L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2564556468384774802L ^ Long.rotateLeft(-2764301362426185327L, 38) ^ 7669302997911435733L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3778669059166860119L ^ Long.rotateLeft(-7625994616379699946L, 46) ^ 5752029286698080621L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7684586389261024948L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6507087690466321213L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2279975241945026958L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8158341129540826826L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4154923331905746380L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3357234557678294845L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIlllIlilIl<invokedynamic>());
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

   static {
      iIiIlIillIliIlIill = new class_2350[]{class_2350.field_11033, class_2350.field_11036, class_2350.field_11043, class_2350.field_11035, class_2350.field_11039, class_2350.field_11034, null};
      lliIlIilliliIlIill = class_2246.field_22109.method_9564();
      IiiIlIillliiIlIill = class_10799.method_67887(RenderPipeline.builder(new RenderPipeline.Snippet[]{class_10799.field_56864}).withLocation(class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>())).withCull(true).withDepthWrite(false).build());
      iiiIlIillIIIllIill = class_1921.method_75940(IilliliilIIi<invokedynamic>(), class_12247.method_75927(IiiIlIillliiIlIill).method_75934(IilliliilIIi<invokedynamic>(), class_1059.field_5275).method_75938());
      ilIllIillIiIllIill = new float[0];
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') >>> 10 | (char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') << 6) ^ '뚯'))) << 5 | (char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') >>> 10 | (char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') << 6) ^ '뚯'))) >>> 11))) >>> 15 | (char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') >>> 10 | (char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') << 6) ^ '뚯'))) << 5 | (char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') >>> 10 | (char)((char)(~((char)((char)(var4[var5] - '鋠') ^ '냍'))) ^ '\uf423') << 6) ^ '뚯'))) >>> 11))) << 1));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) >>> 12 | (char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) << 4))) + '묨') + var5) - var5) - var5) ^ 'ꭅ'))) ^ 3446))) ^ var5) << 15 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) >>> 12 | (char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) << 4))) + '묨') + var5) - var5) - var5) ^ 'ꭅ'))) ^ 3446))) ^ var5) >>> 1) >>> 10 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) >>> 12 | (char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) << 4))) + '묨') + var5) - var5) - var5) ^ 'ꭅ'))) ^ 3446))) ^ var5) << 15 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) >>> 12 | (char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) << 4))) + '묨') + var5) - var5) - var5) ^ 'ꭅ'))) ^ 3446))) ^ var5) >>> 1) << 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float[] iIlIlllllill() {
      class_1087 var0 = class_310.method_1551().method_1541().method_3349(lliIlIilliliIlIill);
      if (var0 == null) {
         return new float[0];
      } else if (var0 == IlIllIillllIllIill) {
         return ilIllIillIiIllIill;
      } else {
         List var1 = var0.method_68512(class_5819.method_43049(42L));
         int var2 = 0;

         for(class_10889 var4 : var1) {
            for(class_2350 var8 : iIiIlIillIliIlIill) {
               var2 += var4.method_68509(var8).size();
            }
         }

         float[] var18 = new float[var2 * 4 * 6];
         int var19 = 0;

         for(class_10889 var26 : var1) {
            for(class_2350 var10 : iIiIlIillIliIlIill) {
               for(class_777 var12 : var26.method_68509(var10)) {
                  float var13 = var12.comp_3725() && var12.comp_3723() != null ? IIiIlIilllIiIlIill[var12.comp_3723().ordinal()] : 1.0F;

                  for(int var14 = 0; var14 < 4; ++var14) {
                     Vector3fc var15 = var12.method_76648(var14);
                     long var16 = var12.method_76649(var14);
                     var18[var19++] = var15.x();
                     var18[var19++] = var15.y();
                     var18[var19++] = var15.z();
                     var18[var19++] = class_5611.method_76641(var16);
                     var18[var19++] = class_5611.method_76642(var16);
                     var18[var19++] = var13;
                  }
               }
            }
         }

         IlIllIillllIllIill = var0;
         ilIllIillIiIllIill = var18;
         return var18;
      }
   }
}
