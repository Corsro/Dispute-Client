package gg.corz;

import it.unimi.dsi.fastutil.bytes.ByteArrayList;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2586;
import net.minecraft.class_2595;
import net.minecraft.class_2605;
import net.minecraft.class_2611;
import net.minecraft.class_2627;
import net.minecraft.class_2636;
import net.minecraft.class_2646;
import net.minecraft.class_2669;
import net.minecraft.class_2818;
import net.minecraft.class_3719;
import net.minecraft.class_3866;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iiiilIllIIIIiIll extends ilIllIiIll {
   private final ByteArrayList lIllllilll = new ByteArrayList();
   private final iiIiiilIIliiil IlIlllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil liiIllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final int[] iiIlllilll = new int[]{ilIllIiIll(200, 91, 0), ilIllIiIll(156, 91, 0), ilIllIiIll(117, 0, 255), ilIllIiIll(138, 126, 166), ilIllIiIll(134, 0, 158), ilIllIiIll(125, 125, 125), ilIllIiIll(255, 140, 140), ilIllIiIll(80, 80, 255), ilIllIiIll(35, 226, 0)};
   private final iiIiiilIIliiil lIIlllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IIIlllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final List<class_2586> IIllllilll = new ArrayList();
   private boolean llllllilll;
   private final iiIiiilIIliiil iIIlllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil llIlllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iiiIllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int iIllllilll;
   private int Illlllilll;
   private final iilliIlIIiliIl IiiIllilll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 125, 1, 255);
   private static final int liIlllilll = 4;
   private final iiIiiilIIliiil IiIlllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil ilIlllilll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   private static int ilIllIiIll(int g, int b, int r) {
      return g << (((899258277 - -77) * -1875962727 + -57) * -1857283155 ^ 238552293) | b << ((1530398003 * 1205604855 << 19 | 1530398003 * 1205604855 >>> 13) - -19 ^ 967492054) | r;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') << 9 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') >>> 7) - var5) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') << 9 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') >>> 7) - var5) + var5) << 8) + '閊') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') << 9 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') >>> 7) - var5) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') << 9 | (char)((char)((char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) >>> 11 | (char)(~((char)((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) >>> 8 | (char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2) << 8))) << 5) - '鉮') >>> 7) - var5) + var5) << 8) + '閊') >>> 6) + 28490) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && this.iIllllilll != 0) {
         class_4184 var2 = llilllililll.liiiIIllIl();
         if (var2 != null) {
            class_243 var3 = llilllililll.IliIlllilIi();
            class_4587 var4 = event.IliiiIIilliiiIIi;
            var4.method_22903();
            var4.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
            Matrix4f var5 = var4.method_23760().method_23761();
            float var6 = (float)this.IiiIllilll.Iilllilliill() / 255.0F;
            boolean var7 = this.liiIllilll.Iilllilliill();
            boolean var8 = this.llllllilll;
            double var9 = Math.max(Math.abs(var3.field_1352), Math.max(Math.abs(var3.field_1351), Math.abs(var3.field_1350)));
            int var11 = 0;
            int var12 = 0;

            for(int var13 = this.IIllllilll.size(); var12 < var13; ++var12) {
               class_2586 var14 = (class_2586)this.IIllllilll.get(var12);
               byte var15 = this.lIllllilll.getByte(var12);
               if (!var14.method_11015() && this.lIIlliIIll(var15)) {
                  ++var11;
                  class_2338 var16 = var14.method_11016();
                  int var17 = var16.method_10263();
                  int var18 = var16.method_10264();
                  int var19 = var16.method_10260();
                  int var20 = iiIlllilll[var15];
                  if (!var8 || !iiiIlIIIll(var17, var18, var19, var3, var9)) {
                     iIiiIIilIliiIIil.IIlilIliiIli(var5, (float)var17 + 0.1F, (float)var18 + 0.05F, (float)var19 + 0.1F, (float)var17 + 0.9F, (float)var18 + 0.85F, (float)var19 + 0.9F, (float)(var20 >> 16 & 255) / 255.0F, (float)(var20 >> 8 & 255) / 255.0F, (float)(var20 & 255) / 255.0F, var6);
                  }

                  if (var7) {
                     Iillllilll.IIlllIlliIll((double)var17 + (double)0.5F, (double)var18 + (double)0.5F, (double)var19 + (double)0.5F, -16777216 | var20, 1.0F);
                  }
               }
            }

            var4.method_22909();
            iIiiIIilIliiIIil.IiIiliIiiiIi();
            if (!this.llllllilll) {
               this.llllllilll = true;
            }

         }
      }
   }

   public iiiilIllIIIIiIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiiIllilll, this.liiIllilll, this.iiiIllilll, this.IIIlllilll, this.lIIlllilll, this.iIIlllilll, this.IlIlllilll, this.llIlllilll, this.ilIlllilll, this.IiIlllilll});
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7249542191882150105L ^ Long.rotateLeft(-6398356264011477029L, 8) ^ -5703562431502349228L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6989795074502554075L ^ Long.rotateLeft(-867684415456754877L, 28) ^ -1906398908521861016L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8720546109362680187L ^ Long.rotateLeft(-3828459081376729820L, 57) ^ -5224920353695968162L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7291512156207019735L ^ Long.rotateLeft(-2206530937774564090L, 11) ^ -1061642159542627841L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4209081122282559510L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2455405351532316399L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -539318351666205877L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8130660483395035342L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4217087727243307175L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2902018454610092974L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) << 11 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) >>> 5) ^ '３') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) << 11 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) >>> 5) ^ '３') << 9) + '각') - 21372) - 6691) + '꜁') - 9913))) + var5) << 12 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) << 11 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) >>> 5) ^ '３') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) << 11 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '櫓'))) ^ var5) - '풓') ^ '릇') + var5) >>> 5) ^ '３') << 9) + '각') - 21372) - 6691) + '꜁') - 9913))) + var5) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (this.Illlllilll > 0) {
            --this.Illlllilll;
         } else {
            this.Illlllilll = 4;
            this.IIllllilll.clear();
            this.lIllllilll.clear();
            this.iIllllilll = 0;

            for(class_2818 var2 : lIIiilliIIiill.IliIlllilIi().toList()) {
               Collection var3 = var2.method_12214().values();
               this.iIllllilll += var3.size();

               for(class_2586 var5 : var3) {
                  int var6 = IlIllllIll(var5);
                  if (var6 >= 0) {
                     this.IIllllilll.add(var5);
                     this.lIllllilll.add((byte)var6);
                  }
               }
            }

         }
      }
   }

   private static boolean iiiIlIIIll(int y, int cameraMax, int z, class_243 cameraPos, double x) {
      double var6 = (double)y + Double.longBitsToDouble(1093055511064080973L ^ 3515992110589407821L);
      double var8 = (double)cameraMax + Double.longBitsToDouble(1200918740409780694L ^ 3420002294437037339L);
      double var10 = (double)z + Double.longBitsToDouble(887075083346354003L ^ 3724342848589766483L);
      double var12 = var6 - cameraPos.field_1352;
      double var14 = var8 - cameraPos.field_1351;
      double var16 = var10 - cameraPos.field_1350;
      float var18 = (float)Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
      double var19 = Math.max(x, Math.max(Math.abs(var6), Math.max(Math.abs(var8), Math.abs(var10))) + (double)1.0F);
      float var21 = 0.7F + 0.52F * (var18 + 0.7F) + 0.05F + 4.0F * Math.ulp((float)var19);
      return iIiiIIilIliiIIil.IlIillIiilIi(var6, var8, var10, var21);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 10658) >>> 3 | (char)(var4[var5] ^ 10658) << 13) + '褰') << 6 | (char)((char)((char)(var4[var5] ^ 10658) >>> 3 | (char)(var4[var5] ^ 10658) << 13) + '褰') >>> 10) - '\uf475'))) + var5) ^ 156) ^ var5) - var5) ^ '졟') ^ var5))) << 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 10658) >>> 3 | (char)(var4[var5] ^ 10658) << 13) + '褰') << 6 | (char)((char)((char)(var4[var5] ^ 10658) >>> 3 | (char)(var4[var5] ^ 10658) << 13) + '褰') >>> 10) - '\uf475'))) + var5) ^ 156) ^ var5) - var5) ^ '졟') ^ var5))) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.IIllllilll.clear();
      this.lIllllilll.clear();
      this.iIllllilll = 0;
      this.Illlllilll = 0;
   }

   private boolean lIIlliIIll(int type) {
      boolean var10000;
      switch (type) {
         case 0:
         case 1:
            var10000 = this.iiiIllilll.Iilllilliill();
            break;
         case 2:
            var10000 = this.IIIlllilll.Iilllilliill();
            break;
         case 3:
            var10000 = this.lIIlllilll.Iilllilliill();
            break;
         case 4:
            var10000 = this.iIIlllilll.Iilllilliill();
            break;
         case 5:
            var10000 = this.IlIlllilll.Iilllilliill();
            break;
         case 6:
            var10000 = this.llIlllilll.Iilllilliill();
            break;
         case 7:
            var10000 = this.ilIlllilll.Iilllilliill();
            break;
         case 8:
            var10000 = this.IiIlllilll.Iilllilliill();
            break;
         default:
            var10000 = false;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 23222) - var5) - 20616) + var5) - var5))) - var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 23222) - var5) - 20616) + var5) - var5))) - var5) << 6) - '銞') - 16001) - 21394))) + var5) ^ var5) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 23222) - var5) - 20616) + var5) - var5))) - var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 23222) - var5) - 20616) + var5) - var5))) - var5) << 6) - '銞') - 16001) - 21394))) + var5) ^ var5) << 8) ^ var5) ^ var5) ^ '틊'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - var5) + var5) >>> 4 | (char)((char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - var5) + var5) << 12) - '\ue090'))))) + 'ꖩ') - '\ude74') - var5) ^ var5))) << 5 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - var5) + var5) >>> 4 | (char)((char)((char)((char)(var4[var5] + var5) << 13 | (char)(var4[var5] + var5) >>> 3) - var5) + var5) << 12) - '\ue090'))))) + 'ꖩ') - '\ude74') - var5) ^ var5))) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IlIllllIll(class_2586 blockEntity) {
      if (blockEntity instanceof class_2646) {
         return 0;
      } else if (blockEntity instanceof class_2595) {
         return 1;
      } else if (blockEntity instanceof class_2611) {
         return 2;
      } else if (blockEntity instanceof class_2636) {
         return 3;
      } else if (blockEntity instanceof class_2627) {
         return 4;
      } else if (blockEntity instanceof class_3866) {
         return 5;
      } else if (blockEntity instanceof class_3719) {
         return (((1824260093 >>> 29 | 1824260093 << 3) >>> 1 | (1824260093 >>> 29 | 1824260093 << 3) << 31) << 11 | ((1824260093 >>> 29 | 1824260093 << 3) >>> 1 | (1824260093 >>> 29 | 1824260093 << 3) << 31) >>> 21) ^ -53 ^ -2147462566;
      } else if (blockEntity instanceof class_2605) {
         return ((1531225327 ^ 51) - -29 - -97 >>> 13 | (1531225327 ^ 51) - -29 - -97 << 19) ^ 718461474;
      } else {
         return blockEntity instanceof class_2669 ? ~(((1848824481 >>> 25 | 1848824481 << 7) + -55) * -2083697005) ^ 1535100535 : -1;
      }
   }
}
