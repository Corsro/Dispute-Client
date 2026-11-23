package gg.corz;

import com.corz.client.CorzClient;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1814;
import net.minecraft.class_243;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class liIlliiIll extends ilIllIiIll {
   private final iiIiiilIIliiil iliIillIiiIill;
   private final iiIiiilIIliiil iIIlillIlIlill;
   private static final int IiIlillliIlill = -8090;
   private final iiIiiilIIliiil IIIlilllIIlill;
   private final IIIlIlIllIIlIlIl IliIilllliIill;
   private final List<IlIllillllIllill> illlillIillill;
   private long IIililllIilill;
   private final iilliIlIIiliIl iilIillIIiIill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 64, 16, 128, 8);
   private static final int iiIlillIIllill = -10690049;
   private final iiIiiilIIliiil liiIilliiiIill;
   private final iilliIlIIiliIl IilIilllilIill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 10, 0, 60, 5);
   private final iiIiiilIIliiil lIiIilliIiIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final int lIllilliIllill = -2519809;
   private static final int Illlillllllill = -667076;
   private static final int llIlillilIlill = -1;
   private final iiIiiilIIliiil IIlIilllIlIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iilliIlIIiliIl lllIillillIill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 1, 4);
   private final lliliIIiililiIIi iIlIillIllIill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final Map<Integer, Float> lillilliillill;

   private static float ilIllIiIll(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   private static void liIlliiIll(Matrix4f m, float argb, float x1, float lw, float z2, float y1, float y2, int x2, float z1) {
      float var9 = (z2 - argb) * 0.28F;
      float var10 = (y1 - x1) * 0.28F;
      float var11 = (y2 - lw) * 0.28F;
      IIllllIlll(m, argb, x1, lw, var9, var10, var11, x2, z1);
      IIllllIlll(m, z2, x1, lw, -var9, var10, var11, x2, z1);
      IIllllIlll(m, z2, x1, y2, -var9, var10, -var11, x2, z1);
      IIllllIlll(m, argb, x1, y2, var9, var10, -var11, x2, z1);
      IIllllIlll(m, argb, y1, lw, var9, -var10, var11, x2, z1);
      IIllllIlll(m, z2, y1, lw, -var9, -var10, var11, x2, z1);
      IIllllIlll(m, z2, y1, y2, -var9, -var10, -var11, x2, z1);
      IIllllIlll(m, argb, y1, y2, var9, -var10, -var11, x2, z1);
   }

   private boolean iiiIlIIIll(class_1799 s) {
      return this.IliIilllliIill.Iiilliiliiil(s.method_7909());
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1356046442888553797L ^ Long.rotateLeft(-2906909345455844612L, 45) ^ -7653482393341475815L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1671075380175683147L ^ Long.rotateLeft(-2578363244072174366L, 63) ^ 3929278519578474159L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7793367580291053959L ^ Long.rotateLeft(8754315944209575479L, 50) ^ -4005735480642766075L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -834458004656067820L ^ Long.rotateLeft(-6730773041292828237L, 16) ^ 2182247402033896287L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2265354819433792868L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7448749415595475424L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5739977489644163657L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6102579519754984696L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -254076150853123240L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6818526502873812100L;
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + var5))) << 14) ^ 10556))) + var5) + var5) - var5) + 26265))) - 8422) ^ '\uf19e') ^ var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + var5))) << 14) ^ 10556))) + var5) + var5) - var5) + 26265))) - 8422) ^ '\uf19e') ^ var5) << 7) - 7633));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIiilIiiiIii(illlllIillll event) {
      this.illlillIillill.clear();
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         class_243 var3 = var2.method_71156();
         float var4 = event.liiiiIIiiiiiiIIi;
         float var5 = (float)this.iilIillIIiIill.Iilllilliill();
         boolean var6 = this.iIlIillIllIill.Iilllilliill().equals(IliIlllilIi<invokedynamic>());
         float var7 = (float)this.lllIillillIill.Iilllilliill();
         float var8 = (float)this.IilIilllilIill.Iilllilliill() / 100.0F;

         for(class_1297 var10 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var10 instanceof class_1542) {
               class_1542 var11 = (class_1542)var10;
               class_1799 var12 = var11.method_6983();
               if (var12 != null && !var12.method_7960() && (!this.lIiIilliIiIill.Iilllilliill() || this.iiiIlIIIll(var12))) {
                  double var13 = class_3532.method_16436((double)var4, var11.field_6014, var11.method_23317());
                  double var15 = class_3532.method_16436((double)var4, var11.field_6036, var11.method_23318());
                  double var17 = class_3532.method_16436((double)var4, var11.field_5969, var11.method_23321());
                  double var19 = var13 - var3.field_1352;
                  double var21 = var15 - var3.field_1351;
                  double var23 = var17 - var3.field_1350;
                  double var25 = Math.sqrt(var19 * var19 + var21 * var21 + var23 * var23);
                  if (!(var25 > (double)var5)) {
                     float var27 = ilIllIiIll((float)(((double)var5 - var25) / (double)8.0F));
                     this.illlillIillill.add(new IlIllillllIllill(var11, var12, var13, var15, var17, var25, this.lIIlliIIll(var12), var27));
                  }
               }
            }
         }

         if (!this.illlillIillill.isEmpty()) {
            boolean var28 = this.IIlIilllIlIill.Iilllilliill();
            boolean var29 = this.iIIlillIlIlill.Iilllilliill();
            if (var28 || var29) {
               Matrix4f var30 = event.IliiiIIilliiiIIi.method_23760().method_23761();

               for(IlIllillllIllill var32 : this.illlillIillill) {
                  float var14 = var32.liIiIIiill.method_17682();
                  if (var28) {
                     float var33 = var32.liIiIIiill.method_17681() / 2.0F;
                     float var16 = (float)(var32.IIliIIiill - (double)var33 - var3.field_1352);
                     float var34 = (float)(var32.lIliIIiill - var3.field_1351);
                     float var18 = (float)(var32.iIliIIiill - (double)var33 - var3.field_1350);
                     float var35 = (float)(var32.IIliIIiill + (double)var33 - var3.field_1352);
                     float var20 = (float)(var32.lIliIIiill + (double)var14 - var3.field_1351);
                     float var36 = (float)(var32.iIliIIiill + (double)var33 - var3.field_1350);
                     int var22 = IlIllllIll(var32.llliIIiill, 0.78F * var32.illiIIiill);
                     if (var8 > 0.001F) {
                        int var37 = var32.llliIIiill;
                        iIiiIIilIliiIIil.IIlilIliiIli(var30, var16, var34, var18, var35, var20, var36, (float)(var37 >> 16 & 255) / 255.0F, (float)(var37 >> 8 & 255) / 255.0F, (float)(var37 & 255) / 255.0F, var8 * var32.illiIIiill);
                     }

                     if (var6) {
                        iIiiIIilIliiIIil.iIIIlIlIIl(var30, var16, var34, var18, var35, var20, var36, var22, var7);
                     } else {
                        liIlliiIll(var30, var16, var34, var18, var35, var20, var36, var22, var7);
                     }
                  }

                  if (var29) {
                     Iillllilll.Illlllllilll(var32.IIliIIiill, var32.lIliIIiill + (double)var14 * (double)0.5F, var32.iIliIIiill, IlIllllIll(var32.llliIIiill, 0.22F * var32.illiIIiill), IlIllllIll(var32.llliIIiill, 0.7F * var32.illiIIiill), 1.0F);
                  }
               }

               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }
         }
      }
   }

   private static int IlIllllIll(int a, float argb) {
      long var3 = -2054428732941365362L;
      var3 ^= ((long)Math.round(Math.max(0.0F, Math.min(1.0F, argb)) * 255.0F) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << ((-1122699223 ^ -57) + -75 ^ -87 ^ -1122699246) | a & ((~2058817973 * -723362913 - 1) * -3 ^ -235083298);
   }

   private void iIlllIllll(class_332 l, IIlIiIlllIlIiIll pop, lIiIiiiiIiIiii f, float factor, float ctx) {
      class_243 var6 = llilllililll.iIlIlllllill(new class_243(f.iIIlliiIIl, f.IlIlliiIIl + 0.34, f.llIlliiIIl));
      if (var6 != null && !(var6.field_1350 <= (double)0.0F) && !(var6.field_1350 >= (double)1.0F)) {
         float var7 = (float)(var6.field_1352 / (double)factor);
         float var8 = (float)(var6.field_1351 / (double)factor);
         float var9 = class_3532.method_15363(1.12F - (float)f.ilIlliiIIl / 56.0F, 0.72F, 1.0F);
         float var10 = 18.0F * var9;
         float var11 = 7.0F * var9;
         float var12 = 10.0F * var9;
         float var13 = 4.0F * var9;
         float var14 = 11.0F * var9;
         float var15 = 5.0F * var9;
         String var16 = f.IIIlliiIIl.method_7964().getString();
         String var17 = f.IiIlliiIIl > 1 ? IliIlllilIi<invokedynamic>() + f.IiIlliiIIl : "";
         String var18 = this.liiIilliiiIill.Iilllilliill() ? IliIlllilIi<invokedynamic>() + Math.round(f.ilIlliiIIl) + IliIlllilIi<invokedynamic>() : "";
         float var19 = pop.Iiilliiliiil(var16, var14);
         float var20 = pop.Iiilliiliiil(var17, var14);
         float var21 = pop.Iiilliiliiil(var18, var14);
         float var22 = var11 + var12 + var13 + var19 + var20 + var21 + var11;
         float var23 = var7 - var22 / 2.0F;
         float var24 = var8 - var10;
         float var25 = 1.0F - (1.0F - ctx) * (1.0F - ctx) * (1.0F - ctx);
         float var26 = f.iiIlliiIIl * var25;
         if (!(var26 < 0.02F)) {
            float var27 = IliiIilliiIi.IilliliilIIi(var26);

            try {
               IIIiiIillIIiiIil.Ililllililil(l, var23, var24, var22, var10, var15, -233499369, 620756991);
               if (var26 > 0.5F) {
                  l.method_51448().pushMatrix();
                  l.method_51448().scale(factor, factor);
                  l.method_51448().translate(var23 + var11, var24 + (var10 - var12) / 2.0F);
                  l.method_51448().scale(var12 / 16.0F, var12 / 16.0F);
                  llllIIlilllIIl.iIlIlllllill(l, f.IIIlliiIIl, 0, 0, 16);
                  l.method_51448().popMatrix();
               }

               float var28 = var23 + var11 + var12 + var13;
               float var29 = var24 + (var10 - pop.IlIillIiilIi(var14)) / 2.0F;
               pop.IIlilIliiIli(var16, var28, var29, f.lIIlliiIIl, var14);
               var28 += var19;
               if (!var17.isEmpty()) {
                  pop.IIlilIliiIli(var17, var28, var29, -6645087, var14);
                  var28 += var20;
               }

               if (!var18.isEmpty()) {
                  pop.IIlilIliiIli(var18, var28, var29, -6645087, var14);
               }
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var27);
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) << 12) >>> 14 | (char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) << 12) << 2) << 2 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) << 12) >>> 14 | (char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) >>> 10 | (char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '찧'))) - var5))))) ^ var5) << 6) << 12) << 2) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIllllIlll(Matrix4f dz, float oz, float dx, float lw, float oy, float ox, float argb, int m, float dy) {
      iIiiIIilIliiIIil.Iliilliiilii(dz, oz, dx, lw, oz + oy, dx, lw, m, dy);
      iIiiIIilIliiIIil.Iliilliiilii(dz, oz, dx, lw, oz, dx + ox, lw, m, dy);
      iIiiIIilIliiIIil.Iliilliiilii(dz, oz, dx, lw, oz, dx, lw + argb, m, dy);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + '译') << 8 | (char)((char)(~((char)(var4[var5] - var5))) + '译') >>> 8) ^ var5) - '힢') - 2469))) + 11952) << 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + '译') << 8 | (char)((char)(~((char)(var4[var5] - var5))) + '译') >>> 8) ^ var5) - '힢') - 2469))) + 11952) >>> 2) - var5) - 3974) << 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + '译') << 8 | (char)((char)(~((char)(var4[var5] - var5))) + '译') >>> 8) ^ var5) - '힢') - 2469))) + 11952) << 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + '译') << 8 | (char)((char)(~((char)(var4[var5] - var5))) + '译') >>> 8) ^ var5) - '힢') - 2469))) + 11952) >>> 2) - var5) - 3974) >>> 2))) - var5))) + var5) + '暈'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (this.iliIillIiiIill.Iilllilliill() && !this.illlillIillill.isEmpty() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            class_332 var2 = event.IIiIilIIIl;
            long var3 = System.nanoTime();
            float var5 = this.IIililllIilill == 0L ? 0.016F : Math.min(0.1F, (float)(var3 - this.IIililllIilill) / 1.0E9F);
            this.IIililllIilill = var3;
            ArrayList var6 = new ArrayList();

            for(IlIllillllIllill var8 : this.illlillIillill) {
               lIiIiiiiIiIiii var9 = null;
               if (this.IIIlilllIIlill.Iilllilliill()) {
                  for(lIiIiiiiIiIiii var11 : var6) {
                     if (var11.IIIlliiIIl.method_7909() == var8.iiIiIIiill.method_7909() && var11.lIIlliiIIl == var8.llliIIiill) {
                        double var12 = var11.iIIlliiIIl - var8.IIliIIiill;
                        double var14 = var11.llIlliiIIl - var8.iIliIIiill;
                        double var16 = var11.IlIlliiIIl - var8.lIliIIiill;
                        if (var12 * var12 + var14 * var14 <= (double)2.25F && Math.abs(var16) <= (double)1.25F) {
                           var9 = var11;
                           break;
                        }
                     }
                  }
               }

               if (var9 == null) {
                  var9 = new lIiIiiiiIiIiii();
                  var9.IIIlliiIIl = var8.iiIiIIiill;
                  var9.lIIlliiIIl = var8.llliIIiill;
                  var9.iIIlliiIIl = var8.IIliIIiill;
                  var9.IlIlliiIIl = var8.lIliIIiill;
                  var9.llIlliiIIl = var8.iIliIIiill;
                  var9.ilIlliiIIl = var8.IlliIIiill;
                  var9.IiIlliiIIl = 0;
                  var9.liIlliiIIl = var8.liIiIIiill.method_5628();
                  var9.iiIlliiIIl = var8.illiIIiill;
                  var6.add(var9);
               }

               var9.IiIlliiIIl += var8.iiIiIIiill.method_7947();
               if (var8.lIliIIiill > var9.IlIlliiIIl) {
                  var9.IlIlliiIIl = var8.lIliIIiill;
               }

               if (var8.IlliIIiill < var9.ilIlliiIIl) {
                  var9.ilIlliiIIl = var8.IlliIIiill;
               }

               if (var8.liIiIIiill.method_5628() < var9.liIlliiIIl) {
                  var9.liIlliiIIl = var8.liIiIIiill.method_5628();
               }

               if (var8.illiIIiill > var9.iiIlliiIIl) {
                  var9.iiIlliiIIl = var8.illiIIiill;
               }
            }

            var6.sort((a, b) -> Double.compare(b.ilIlliiIIl, a.ilIlliiIIl));
            HashMap var21 = new HashMap();

            for(lIiIiiiiIiIiii var24 : var6) {
               float var26 = (Float)this.lillilliillill.getOrDefault(var24.liIlliiIIl, 0.0F);
               var21.put(var24.liIlliiIIl, Math.min(1.0F, var26 + var5 / 0.16F));
            }

            this.lillilliillill.clear();
            this.lillilliillill.putAll(var21);
            class_4587 var23 = new class_4587();
            CorzClient.fontManager.iIlIlllllill(var23);
            IIIiiIillIIiiIil.IliIlllilIi(var23);
            double var25 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var27 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var28 = (float)((double)var27 / var25);
            boolean var13 = Math.abs(var28 - 1.0F) > 1.0E-4F;
            if (var13) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4486() / var28);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4502() / var28);
            }

            IIlIiIlllIlIiIll var29 = IIlIiIlllIlIiIll.lIiiIiIlilli();
            IIlIiIlllIlIiIll var15 = var29.IIillIiliIil() ? var29 : IIlIiIlllIlIiIll.liiiIIllIl();

            try {
               if (var15.IIillIiliIil()) {
                  for(lIiIiiiiIiIiii var17 : var6) {
                     this.iIlllIllll(var2, var15, var17, var28, (Float)this.lillilliillill.getOrDefault(var17.liIlliiIIl, 1.0F));
                  }

                  return;
               }
            } finally {
               if (var13) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }

            }

         }
      }
   }

   public liIlliiIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IliIilllliIill = new IIIlIlIllIIlIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), List.of(class_1802.field_8802, class_1802.field_8377, class_1802.field_8556, class_1802.field_8805, class_1802.field_8058, class_1802.field_8348, class_1802.field_8285, class_1802.field_22022, class_1802.field_22024, class_1802.field_22025, class_1802.field_22027, class_1802.field_22028, class_1802.field_22029, class_1802.field_22030, class_1802.field_49814, class_1802.field_8547, class_1802.field_8288, class_1802.field_8833, class_1802.field_8367));
      this.iliIillIiiIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.liiIilliiiIill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.IIIlilllIIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.iIIlillIlIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.illlillIillill = new ArrayList();
      this.lillilliillill = new HashMap();
      this.IIililllIilill = 0L;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iliIillIiiIill, this.liiIilliiiIill, this.IIIlilllIIlill, this.IIlIilllIlIill, this.iIlIillIllIill, this.lllIillillIill, this.IilIilllilIill, this.iilIillIIiIill, this.lIiIilliIiIill, this.IliIilllliIill, this.iIIlillIlIlill});
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '雔') - 2122) + 25264) >>> 3 | (char)((char)((char)(var4[var5] + '雔') - 2122) + 25264) << 13) + var5) - 12663) - 24481) + var5))))) - 16802));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) >>> 1 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) << 15) >>> 15 | (char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) >>> 1 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) << 15) << 1) << 3 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) >>> 1 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) << 15) >>> 15 | (char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) >>> 1 | (char)((char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) << 7 | (char)(~((char)((char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) << 15 | (char)((char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) << 1 | (char)(~((char)(-((char)(-((char)((char)(var4[var5] - 5866) ^ var5))))))) >>> 15) >>> 1))) >>> 9) << 15) << 1) >>> 13) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int lIIlliIIll(class_1799 s) {
      if (this.iiiIlIIIll(s)) {
         return -(-1927886910 << 31 | -1927886910 >>> 1) * -1084587701 ^ -464613847;
      } else {
         class_1814 var2 = s.method_7932();
         if (var2 == class_1814.field_8907) {
            return (1483039803 + -59) * -1594008481 ^ 107 ^ -294650867;
         } else if (var2 == class_1814.field_8903) {
            return ~(-(-1817660474 * 1047552999)) - 103 ^ -368891715;
         } else {
            return var2 == class_1814.field_8904 ? -(-2077818593 * 1090785345 >>> 3 | -2077818593 * 1090785345 << 29) ^ -66530278 : -1;
         }
      }
   }
}
