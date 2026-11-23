package gg.corz;

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
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import org.joml.Matrix4f;

public class lliIiililiIiil extends ilIllIiIll {
   private final iilliIlIIiliIl IllIiiIlilllIiiIli = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), ((-184013439 << 15 | -184013439 >>> 17) + -53 >>> 5 | (-184013439 << 15 | -184013439 >>> 17) + -53 << 27) ^ 2025195462, 5, -(~1966990570) ^ 1966990483);
   private static final float IIiIiiIlilIiIiiIli = 35.0F;
   private class_9799 iiiIiiIliIIIliiIli;
   private final iiIiiilIIliiil illIiiIliIilIiiIli = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private class_4597.class_4598 lIIliiIliiIIliiIli;
   private final Random IiiIiiIliliiIiiIli = new Random();
   private static final int iIiIiiIliIliIiiIli = 25;
   private static final float lilIiiIliiilIiiIli = 0.35F;
   private final List<lliIIlIiiliIIlIi> lliIiiIliiliIiiIli = new ArrayList();

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7350852632494338982L ^ Long.rotateLeft(-2948690033610441492L, 25) ^ 9056792570320693115L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5766940694332064617L ^ Long.rotateLeft(3818149417507126949L, 28) ^ 6612583647594912337L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2795660133757578306L ^ Long.rotateLeft(-6219861235493399670L, 29) ^ -8501743180419599303L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3371184095309028008L ^ Long.rotateLeft(2664868257039567102L, 31) ^ -7613769001879683799L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5875866181368657701L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1756064850198023174L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7961030897585201321L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3793223985535700788L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4045930438300731226L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6440238572340473707L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   private void iiiIlIIIll(class_243 playerPos) {
      double var2 = this.IiiIiiIliliiIiiIli.nextDouble() * (double)30.0F + (double)5.0F;
      double var4 = Math.toRadians(this.IiiIiiIliliiIiiIli.nextDouble() * (double)360.0F);
      double var6 = Math.toRadians((this.IiiIiiIliliiIiiIli.nextDouble() - (double)0.5F) * (double)60.0F);
      double var8 = -Math.sin(var4) * Math.cos(var6) * (double)0.35F;
      double var10 = Math.sin(var6) * (double)0.35F * (double)0.5F;
      double var12 = Math.cos(var4) * Math.cos(var6) * (double)0.35F;
      int[] var14 = new int[]{16766720, 16776960, 65280, 65535, 16738740, 16753920, 49151};
      int var15 = -16777216 | var14[this.IiiIiiIliliiIiiIli.nextInt(var14.length)];
      this.lliIiiIliiliIiiIli.add(new lliIIlIiiliIIlIi(playerPos.field_1352 - Math.sin(var4) * var2, playerPos.field_1351 + (this.IiiIiiIliliiIiiIli.nextDouble() - 0.3) * (double)8.0F + (double)1.0F, playerPos.field_1350 + Math.cos(var4) * var2, var8, var10, var12, var15, 25));
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) >>> 7 | (char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) << 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) >>> 7 | (char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) << 9) << 8) + '\ued85') ^ '땡') + var5) - var5) ^ var5))) - 'ﷂ') >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) >>> 7 | (char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) << 9) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) >>> 7 | (char)((char)((char)((char)(var4[var5] - 5506) ^ '\uf871') + var5) ^ var5) << 9) << 8) + '\ued85') ^ '땡') + var5) - var5) ^ var5))) - 'ﷂ') << 12) - 25405) - 5072));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') << 14) + 2280))) ^ var5) + '돧') - '\uf0c3') >>> 6 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') << 14) + 2280))) ^ var5) + '돧') - '\uf0c3') << 10) ^ 8899) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') << 14) + 2280))) ^ var5) + '돧') - '\uf0c3') >>> 6 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 24267))) << 1 | (char)(-((char)((char)(-var4[var5]) + 24267))) >>> 15) - var5) - '믬') + '\uf316') << 14) + 2280))) ^ var5) + '돧') - '\uf0c3') << 10) ^ 8899) - var5) ^ var5) >>> 6) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 7264) << 15 | (char)((char)(-var4[var5]) ^ 7264) >>> 1) - var5) - var5) - 14503) ^ var5) - '\ue19d') + 328) - '쿁') + var5) ^ '鏢'))) - '썮') ^ 16129));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IlIllllIll(class_4588 buf, Matrix4f mat, float argb, int size) {
      float var4 = argb * 0.5F;
      int var5 = size >> 16 & 255;
      int var6 = size >> 8 & 255;
      int var7 = size & 255;
      int var8 = size >>> 24;
      buf.method_22918(mat, -var4, -var4, 0.0F).method_22913(0.0F, 1.0F).method_1336(var5, var6, var7, var8);
      buf.method_22918(mat, var4, -var4, 0.0F).method_22913(1.0F, 1.0F).method_1336(var5, var6, var7, var8);
      buf.method_22918(mat, var4, var4, 0.0F).method_22913(1.0F, 0.0F).method_1336(var5, var6, var7, var8);
      buf.method_22918(mat, -var4, var4, 0.0F).method_22913(0.0F, 0.0F).method_1336(var5, var6, var7, var8);
   }

   public void IIiilIiiiIii(illlllIillll event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !this.lliIiiIliiliIiiIli.isEmpty()) {
         if (this.iiiIiiIliIIIliiIli == null) {
            this.iiiIiiIliIIIliiIli = new class_9799(1048576);
            this.lIIliiIliiIIliiIli = class_4597.method_22991(this.iiiIiiIliIIIliiIli);
         }

         class_4587 var2 = event.IliiiIIilliiiIIi;
         class_243 var3 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         float var4 = Iiiilllliiilll.method_61966().method_60637(true);
         boolean var5 = this.illIiiIliIilIiiIli.Iilllilliill();
         class_1921 var6 = (class_1921)llIlliIlilIlliIl.illiliiIll.apply(llIlliIlilIlliIl.IlliliiIll);
         class_4588 var7 = this.lIIliiIliiIIliiIli.method_73477(var6);
         var2.method_22903();
         var2.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
         Matrix4f var8 = var2.method_23760().method_23761();

         for(int var9 = 0; var9 < this.lliIiiIliiliIiiIli.size(); ++var9) {
            lliIIlIiiliIIlIi var10 = (lliIIlIiiliIIlIi)this.lliIiiIliiliIiiIli.get(var9);
            float var11 = var10.IIIllIIliIIl();
            int var12 = Math.min(var10.Illiiiiiil.size(), 10);
            if (!(var11 <= 0.01F) && var12 >= 2) {
               int var13 = var5 ? this.lIIlliIIll(var9) : var10.IIliiiiiil;
               double var14 = var10.iIlIlllllill(var4);
               double var16 = var10.IilliliilIIi(var4);
               double var18 = var10.lIiiIiIlilli(var4);
               class_243 var20 = new class_243(var14, var16, var18);
               ArrayList var21 = new ArrayList();
               var21.add(var20);
               var21.add(new class_243(var10.IIIiiiiiil, var10.lIIiiiiiil, var10.iIIiiiiiil));

               for(int var22 = 1; var22 < var12; ++var22) {
                  iIiiIIliIliiIIli var23 = (iIiiIIliIliiIIli)var10.Illiiiiiil.get(var22);
                  var21.add(new class_243(var23.liliIiIlIi, var23.iiliIiIlIi, var23.IIiiIiIlIi));
               }

               for(int var46 = 0; var46 < var21.size() - 1; ++var46) {
                  class_243 var47 = (class_243)var21.get(var46);
                  class_243 var24 = (class_243)var21.get(var46 + 1);
                  float var25 = (float)var46 / (float)(var21.size() - 1);
                  float var26 = (float)(var46 + 1) / (float)(var21.size() - 1);
                  float var27 = 0.05F * (1.0F - var25);
                  float var28 = 0.05F * (1.0F - var26);
                  float var29 = var46 == 0 ? 0.0F : (float)Math.pow((double)(1.0F - var25), (double)2.0F) * var11;
                  float var30 = (float)Math.pow((double)(1.0F - var26), (double)2.0F) * var11;
                  class_243 var31 = var24.method_1020(var47);
                  if (!(var31.method_1027() < 1.0E-4)) {
                     var31 = var31.method_1029();
                     class_243 var32 = var47.method_1020(var3).method_1029();
                     class_243 var33 = var31.method_1036(var32).method_1029();
                     int var34 = iIillliIlillli.IIIilIIiiIIi(var13, var29);
                     int var35 = iIillliIlillli.IIIilIIiiIIi(var13, var30);
                     var7.method_22918(var8, (float)(var47.field_1352 + var33.field_1352 * (double)var27), (float)(var47.field_1351 + var33.field_1351 * (double)var27), (float)(var47.field_1350 + var33.field_1350 * (double)var27)).method_22913(0.5F, 0.0F).method_39415(var34);
                     var7.method_22918(var8, (float)(var47.field_1352 - var33.field_1352 * (double)var27), (float)(var47.field_1351 - var33.field_1351 * (double)var27), (float)(var47.field_1350 - var33.field_1350 * (double)var27)).method_22913(0.5F, 1.0F).method_39415(var34);
                     var7.method_22918(var8, (float)(var24.field_1352 - var33.field_1352 * (double)var28), (float)(var24.field_1351 - var33.field_1351 * (double)var28), (float)(var24.field_1350 - var33.field_1350 * (double)var28)).method_22913(0.5F, 1.0F).method_39415(var35);
                     var7.method_22918(var8, (float)(var24.field_1352 + var33.field_1352 * (double)var28), (float)(var24.field_1351 + var33.field_1351 * (double)var28), (float)(var24.field_1350 + var33.field_1350 * (double)var28)).method_22913(0.5F, 0.0F).method_39415(var35);
                  }
               }
            }
         }

         var2.method_22909();
         this.lIIliiIliiIIliiIli.method_22994(var6);
         var7 = this.lIIliiIliiIIliiIli.method_73477(var6);

         for(int var37 = 0; var37 < this.lliIiiIliiliIiiIli.size(); ++var37) {
            lliIIlIiiliIIlIi var38 = (lliIIlIiiliIIlIi)this.lliIiiIliiliIiiIli.get(var37);
            float var39 = var38.IIIllIIliIIl();
            if (!(var39 <= 0.01F)) {
               int var40 = var5 ? this.lIIlliIIll(var37) : var38.IIliiiiiil;
               float var41 = var38.iliIiiliiiii() * var39;
               double var42 = var38.iIlIlllllill(var4);
               double var43 = var38.IilliliilIIi(var4);
               double var44 = var38.lIiiIiIlilli(var4);
               var2.method_22903();
               var2.method_22904(var42 - var3.field_1352, var43 - var3.field_1351, var44 - var3.field_1350);
               var2.method_22907(Iiiilllliiilll.field_1773.method_19418().method_23767());
               var2.method_46416(0.0F, 0.0F, 0.02F);
               Matrix4f var45 = var2.method_23760().method_23761();
               IlIllllIll(var7, var45, 1.7F, iIillliIlillli.IIIilIIiiIIi(var40, var41 * 0.15F));
               IlIllllIll(var7, var45, 0.95F, iIillliIlillli.IIIilIIiiIIi(var40, var41 * 0.4F));
               IlIllllIll(var7, var45, 0.4F, iIillliIlillli.IIIilIIiiIIi(var40, var41 * 0.85F));
               IlIllllIll(var7, var45, 0.15F, iIillliIlillli.IIIilIIiiIIi(-1, var41));
               var2.method_22909();
            }
         }

         this.lIIliiIliiIIliiIli.method_22993();
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 24190) ^ var5) >>> 2 | (char)((char)((char)(-var4[var5]) + 24190) ^ var5) << 14) + var5) + '\ue94e') ^ '\uec4b') - 13414) + var5) + var5))) - 250) - 19025) + 9214) - '둶'))) >>> 11 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 24190) ^ var5) >>> 2 | (char)((char)((char)(-var4[var5]) + 24190) ^ var5) << 14) + var5) + '\ue94e') ^ '\uec4b') - 13414) + var5) + var5))) - 250) - 19025) + 9214) - '둶'))) << 5))) >>> 10 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 24190) ^ var5) >>> 2 | (char)((char)((char)(-var4[var5]) + 24190) ^ var5) << 14) + var5) + '\ue94e') ^ '\uec4b') - 13414) + var5) + var5))) - 250) - 19025) + 9214) - '둶'))) >>> 11 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 24190) ^ var5) >>> 2 | (char)((char)((char)(-var4[var5]) + 24190) ^ var5) << 14) + var5) + '\ue94e') ^ '\uec4b') - 13414) + var5) + var5))) - 250) - 19025) + 9214) - '둶'))) << 5))) << 6));
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
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] + '졃') - '\uea78') >>> 13 | (char)((char)(var4[var5] + '졃') - '\uea78') << 3))) ^ 'ힰ'))) + 27192))))) + var5) ^ 19141));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lliIiililiIiil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IllIiiIlilllIiiIli, this.illIiiIliIilIiiIli});
   }

   public void iIIIlIlIIl() {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         class_243 var1 = Iiiilllliiilll.field_1724.method_73189();
         float var2 = 0.525F;
         this.lliIiiIliiliIiiIli.forEach((maxSpeed) -> maxSpeed.IliIlllilIi(0.35F, var2, var1));
         this.lliIiiIliiliIiiIli.removeIf((f) -> f.liiiIIllIl(var1));
         int var3 = this.IllIiiIlilllIiiIli.Iilllilliill();

         while(this.lliIiiIliiliIiiIli.size() > var3) {
            this.lliIiiIliiliIiiIli.remove(this.lliIiiIliiliIiiIli.size() - 1);
         }

         while(this.lliIiiIliiliIiiIli.size() < var3) {
            this.iiiIlIIIll(var1);
         }

      }
   }

   private int lIIlliIIll(int fi) {
      return iIillliIlillli.Iiilliiliiil(IlIIilIlllIIilIl.lliiIlliIl, IlIIilIlllIIilIl.IiiiIlliIl, 0.5F, (float)fi * 0.08F);
   }

   public void Iilililiiili() {
      this.lliIiiIliiliIiiIli.clear();
      if (this.iiiIiiIliIIIliiIli != null) {
         this.iiiIiiIliIIIliiIli.close();
         this.iiiIiiIliIIIliiIli = null;
         this.lIIliiIliiIIliiIli = null;
      }

   }
}
