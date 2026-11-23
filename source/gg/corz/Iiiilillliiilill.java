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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import net.minecraft.class_4770;
import org.joml.Matrix4f;

public class Iiiilillliiilill extends ilIllIiIll {
   private final iliiliilIiiiliil illIlliill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -15798);
   private final iliiliilIiiiliil lllIlliill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -42464);
   private final IIIIlilllIIIlill lIiIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.75F, 0.2, (double)1.5F, 0.05);
   private final IIIIlilllIIIlill iIiIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.2, (double)0.0F, (double)1.0F, 0.05);
   private static final int lIlllliill = 14;
   private final IIIIlilllIIIlill IliIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.55, 0.2, 0.8, 0.05);
   private final iiIiiilIIliiil IilIlliill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float lllllliill = 0.32F;
   private static final float[][] illllliill = new float[][]{{0.7071F, 0.7071F}, {0.7071F, -0.7071F}};
   private final IIIIlilllIIIlill IIiIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, 0.2, (double)2.5F, 0.05);
   private final int[] Iilllliill;
   private int IlIllliill;
   private int iiIllliill;
   private long lIIllliill;
   private final long IIIllliill;
   private static final float Illllliill = 0.6F;
   private final IIIIlilllIIIlill iiiIlliill;
   private static final int iIlllliill = 3;
   private final ilIIliIlIiIIliIl ilIllliill;
   private float iIIllliill;
   private final List<class_2338> liIllliill;
   private final IIIIlilllIIIlill lilIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.18, 0.08, 0.35, 0.01);
   private final iiIiiilIIliiil IiiIlliill;
   private final IIIIlilllIIIlill iilIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.55, 0.1, (double)1.0F, 0.05);
   private boolean llIllliill;
   private final lliliIIiililiIIi iliIlliill;
   private final IIIIlilllIIIlill lliIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.35, (double)0.0F, (double)1.0F, 0.05);
   private final float[] lilllliill;
   private boolean IIlllliill;
   private final iiIiiilIIliiil liiIlliill;
   private long IiIllliill;

   private void lllllillll(class_4588 phase, Matrix4f worldH, float style, float baseY, float t, float m, float colors, float cz, float vc, int intensity, float dirZ, float dirX, int[] cx) {
      float[] var14 = this.lilllliill;

      for(int var15 = 0; var15 <= 14; ++var15) {
         var14[var15] = Iillllilll((float)var15 / 14.0F, cz, vc, intensity, dirZ, dirX);
      }

      for(int var33 = 0; var33 < 14; ++var33) {
         float var16 = (float)var33 / 14.0F;
         float var17 = (float)(var33 + 1) / 14.0F;
         float var18 = var14[var33];
         float var19 = var14[var33 + 1];
         float var20 = (var16 - 0.5F) * 2.0F * 0.6F;
         float var21 = (var17 - 0.5F) * 2.0F * 0.6F;
         float var22 = style + m * var20;
         float var23 = t + colors * var20;
         float var24 = style + m * var21;
         float var25 = t + colors * var21;

         for(int var26 = 0; var26 < 3; ++var26) {
            float var27 = (float)var26 / 3.0F;
            float var28 = (float)(var26 + 1) / 3.0F;
            int var29 = cx[var33 * 4 + var26];
            int var30 = cx[(var33 + 1) * 4 + var26];
            int var31 = cx[(var33 + 1) * 4 + var26 + 1];
            int var32 = cx[var33 * 4 + var26 + 1];
            iIiiIIilIliiIIil.IlIlllIlilIl(phase, worldH, var22, baseY + var27 * var18, var23, var29, var24, baseY + var27 * var19, var25, var30, var24, baseY + var28 * var19, var25, var31, var22, baseY + var28 * var18, var23, var32);
         }
      }

   }

   public void IIiilIiiiIii(illlllIillll event) {
      if (lIIlliIIll() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (!this.liIllliill.isEmpty()) {
            class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
            if (var2 != null) {
               class_243 var3 = var2.method_71156();
               float var4 = (float)((double)(System.nanoTime() - this.IIIllliill) / (double)1.0E9F % (double)3600.0F) * IlIIIillIIIi.iliIiiliiiii(this.IIiIlliill.Iilllilliill());
               int var5 = IlIIIillIIIi.Illlllllilll(this.iliIlliill.Iilllilliill());
               float var6 = IlIIIillIIIi.IIIllIIliIIl(this.lIiIlliill.Iilllilliill());
               float var7 = IlIIIillIIIi.lIiiIiIlilli(this.iilIlliill.Iilllilliill());
               float var8 = (float)this.iiiIlliill.Iilllilliill();
               int var9 = this.lllIlliill.Iilllilliill();
               int var10 = this.IilIlliill.Iilllilliill() ? IlIIIillIIIi.Ililllililil(var9) : this.illIlliill.Iilllilliill();
               int[] var11 = this.Iilllliill;

               for(int var12 = 0; var12 <= 14; ++var12) {
                  for(int var13 = 0; var13 <= 3; ++var13) {
                     var11[var12 * 4 + var13] = iilllIIill((float)var12 / 14.0F, (float)var13 / 3.0F, var9, var10, var7);
                  }
               }

               event.IliiiIIilliiiIIi.method_22903();
               event.IliiiIIilliiiIIi.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
               Matrix4f var16 = event.IliiiIIilliiiIIi.method_23760().method_23761();
               class_4588 var17 = iIiiIIilIliiIIil.lIiiIiIlilli();

               for(class_2338 var15 : this.liIllliill) {
                  this.iIlllIllll(var17, var16, var15, var4, var5, var6, var8, var11);
               }

               event.IliiiIIilliiiIIi.method_22909();
            }
         }
      }
   }

   protected void Illillliilli() {
      this.IlIllllIll();
   }

   private void iIlllIllll(class_4588 m, Matrix4f style, class_2338 vc, float pos, int worldH, float t, float colors, int[] intensity) {
      float var9 = (float)vc.method_10263() + 0.5F;
      float var10 = (float)vc.method_10264() + 0.01F;
      float var11 = (float)vc.method_10260() + 0.5F;
      float var12 = (float)vc.method_10263() * 0.37F + (float)vc.method_10260() * 0.61F;

      for(int var13 = 0; var13 < illllliill.length; ++var13) {
         this.lllllillll(m, style, var9, var10, var11, illllliill[var13][0], illllliill[var13][1], var12 + (float)var13 * 3.1F, pos, worldH, t, colors, intensity);
      }

   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 2 | (char)((char)(var4[var5] ^ var5) + var5) >>> 14) ^ '읗') + 27213))))) ^ var5))) << 5 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) << 2 | (char)((char)(var4[var5] ^ var5) + var5) >>> 14) ^ '읗') + 27213))))) ^ var5))) >>> 11) + var5) - var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) << 8))) + 3869) - var5))) ^ var5) ^ var5) << 12 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) << 8))) + 3869) - var5))) ^ var5) ^ var5) >>> 4) ^ 7774) << 3 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) << 8))) + 3869) - var5))) ^ var5) ^ var5) << 12 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) >>> 8 | (char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) >>> 9 | (char)((char)(-var4[var5]) ^ var5) << 7))) ^ var5) << 8))) + 3869) - var5))) ^ var5) ^ var5) >>> 4) ^ 7774) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iiiIlIIIll() {
      return this.IiiIlliill.Iilllilliill();
   }

   private static float Iillllilll(float style, float t, float intensity, int worldH, float phase, float u) {
      float var6 = IlIIIillIIIi.Iiiiliiiiiii(style + t, intensity, worldH, phase);
      float var7 = 0.32F + 0.68F * var6;
      float var8 = 0.6F + 0.4F * (1.0F - Math.abs(style - 0.5F) * 2.0F);
      return u * var7 * var8;
   }

   private static int iilllIIill(float primary, float v, int opacity, int secondary, float u) {
      float var5 = 1.0F - Math.min(1.0F, Math.abs(primary - 0.5F) * 2.0F);
      float var6 = IlIIIillIIIi.IliIlllilIi((1.0F - v) * (0.35F + 0.65F * var5), 0.0F, 1.0F);
      int var7 = opacity >> 16 & 255;
      int var8 = opacity >> 8 & 255;
      int var9 = opacity & 255;
      int var10 = secondary >> 16 & 255;
      int var11 = secondary >> 8 & 255;
      int var12 = secondary & 255;
      int var13 = Math.round((float)var7 + (float)(var10 - var7) * var6);
      int var14 = Math.round((float)var8 + (float)(var11 - var8) * var6);
      int var15 = Math.round((float)var9 + (float)(var12 - var9) * var6);
      float var16 = (float)Math.pow((double)IlIIIillIIIi.IliIlllilIi(1.0F - v, 0.0F, 1.0F), 0.6);
      int var17 = Math.round(255.0F * u * var16);
      var17 = var17 < 0 ? 0 : Math.min(var17, 255);
      return var17 << 24 | var13 << 16 | var14 << 8 | var15;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -9167581419366293594L ^ Long.rotateLeft(-1857699199103237495L, 56) ^ -1007429468574207641L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2271911105843308409L ^ Long.rotateLeft(-8097186220033520908L, 33) ^ 7840009505931176374L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8644327568303196945L ^ Long.rotateLeft(-7383047582244991129L, 41) ^ 7819725857360443973L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5738177445754629723L ^ Long.rotateLeft(5220515048263950853L, 43) ^ -7196069908278857696L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 421299669902791438L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2104824126315409562L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7641233945543943454L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2156081116757120083L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2811471586385414785L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5126357981603659800L;
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

   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         long var2 = System.nanoTime();
         IlIIIillIIIi.iIIIlIlIIl(() -> {
            IlIIIillIIIi.llIIlilIIl(() -> this.liIlliiIll(var2), () -> this.lIIllliill = var2);
            return true;
         });
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)(var4[var5] ^ '葓'))) + '\ue5ca'))))) ^ var5) ^ 24749) - var5))) + 14256))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIlliiIll(long now) {
      boolean var3 = Iiiilllliiilll.field_1690.method_31044().method_31034();
      boolean var4 = Iiiilllliiilll.field_1755 != null;
      boolean var5 = Iiiilllliiilll.field_1724.method_5809();
      double var6 = this.lIIllliill == 0L ? (double)0.0F : (double)(now - this.lIIllliill) / (double)1.0E9F;
      var6 = IlIIIillIIIi.liiiIIllIl(var6, (double)0.0F, 0.1);
      boolean var8 = var5 && var3 && !var4;
      this.iIIllliill = IlIIIillIIIi.Iiilliiliiil(this.iIIllliill, var8, var6);
      if (this.IliIlllilIi() && this.IiiIlliill.Iilllilliill() && var3 && var5) {
         boolean var45 = true;
      } else {
         boolean var10000 = false;
      }

      if (IlIIIillIIIi.IIIilIIiiIIi(this.IliIlllilIi(), var3, var4, this.iIIllliill)) {
         int var10 = this.lllIlliill.Iilllilliill();
         int var11 = this.IilIlliill.Iilllilliill() ? IlIIIillIIIi.Ililllililil(var10) : this.illIlliill.Iilllilliill();
         float var12 = (float)(var10 >> 16 & 255) / 255.0F;
         float var13 = (float)(var10 >> 8 & 255) / 255.0F;
         float var14 = (float)(var10 & 255) / 255.0F;
         float var15 = (float)(var10 >>> 24 & 255) / 255.0F;
         float var16 = (float)(var11 >> 16 & 255) / 255.0F;
         float var17 = (float)(var11 >> 8 & 255) / 255.0F;
         float var18 = (float)(var11 & 255) / 255.0F;
         float var19 = IlIIIillIIIi.IilliliilIIi(this.lilIlliill.Iilllilliill());
         float var20 = IlIIIillIIIi.lIiiIiIlilli(this.iilIlliill.Iilllilliill());
         float var21 = IlIIIillIIIi.iliIiiliiiii(this.IIiIlliill.Iilllilliill());
         float var22 = IlIIIillIIIi.IIIllIIliIIl(this.lIiIlliill.Iilllilliill());
         float var23 = IlIIIillIIIi.IlIlllIlilIl(this.iIiIlliill.Iilllilliill());
         float var24 = IlIIIillIIIi.IiIlliIliiIl(this.IliIlliill.Iilllilliill());
         float var25 = IlIIIillIIIi.IIlllIlliIll(this.lliIlliill.Iilllilliill());
         int var26 = IlIIIillIIIi.Illlllllilll(this.iliIlliill.Iilllilliill());
         double var27 = (double)Iiiilllliiilll.method_22683().method_4495();
         float var29 = (float)Iiiilllliiilll.method_22683().method_4489();
         float var30 = (float)Iiiilllliiilll.method_22683().method_4506();
         if (!(var29 < 1.0F) && !(var30 < 1.0F)) {
            float var31 = (float)((double)var29 / var27);
            float var32 = (float)((double)var30 / var27);
            float var33 = (float)((double)(now - this.IIIllliill) / (double)1.0E9F % (double)3600.0F);
            float var34 = IlIIIillIIIi.IliIlllilIi(var19 * 1.35F + 0.12F + var23 * 0.05F, 0.14F, 0.62F);
            long var35 = System.nanoTime();
            if (IlIIIillIIIi.IIlilIliiIli(this.llIllliill)) {
               this.IIllllIlll(var31, var32, var19, var20, var24, this.iIIllliill, var10);
               boolean var37 = true;
            } else {
               boolean var38 = liiiIlIliiiiIlIl.iIlIlllllill(var31, var32, var29, var30, var12, var13, var14, var15, var16, var17, var18, var33, var20, var19, var21, var22, var23, var24, var25, (float)var26, this.iIIllliill, var34);
               if (var38) {
                  this.IlIllliill = 0;
                  boolean var41 = true;
               } else {
                  ++this.IlIllliill;
                  if (IlIIIillIIIi.IiIiliIiiiIi(this.IlIllliill)) {
                     this.llIllliill = true;
                     if (this.ilIllliill.IliIlllilIi()) {
                        System.err.println(IliIlllilIi<invokedynamic>());
                        System.err.flush();
                     }

                     this.IIllllIlll(var31, var32, var19, var20, var24, this.iIIllliill, var10);
                     boolean var42 = true;
                  } else {
                     boolean var43 = false;
                  }
               }
            }

            long var44 = (System.nanoTime() - var35) / 1000L;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) ^ var5) - 766) ^ 4595))) << 4 | (char)(~((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) ^ var5) - 766) ^ 4595))) >>> 12))))) ^ '荍') + var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Iiiilillliiilill() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iliIlliill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IlIIIillIIIi.ilIIlliiIiIIllii);
      this.IiiIlliill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.liiIlliill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.iiiIlliill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, 0.3, 1.6, 0.1);
      this.IIIllliill = System.nanoTime();
      this.lIIllliill = 0L;
      this.iIIllliill = 0.0F;
      this.IlIllliill = 0;
      this.llIllliill = false;
      this.ilIllliill = new ilIIliIlIiIIliIl();
      this.IiIllliill = 0L;
      this.liIllliill = new ArrayList();
      this.iiIllliill = 0;
      this.IIlllliill = false;
      this.Iilllliill = new int[60];
      this.lilllliill = new float[15];
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lllIlliill, this.illIlliill, this.IilIlliill, this.lilIlliill, this.iilIlliill, this.IIiIlliill, this.lIiIlliill, this.iIiIlliill, this.IliIlliill, this.lliIlliill, this.iliIlliill, this.IiiIlliill, this.liiIlliill, this.iiiIlliill});
   }

   public void iIIIlIlIIl() {
      this.IlIllllIll();
      if (lIIlliIIll() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (--this.iiIllliill <= 0) {
            this.iiIllliill = 6;
            this.ilIllIiIll();
         }

      } else {
         if (!this.liIllliill.isEmpty()) {
            this.liIllliill.clear();
         }

      }
   }

   protected void Iilililiiili() {
      this.iIIllliill = 0.0F;
      this.lIIllliill = 0L;
      this.liIllliill.clear();
      this.IlIllllIll();
   }

   private void IIllllIlll(float argb, float scaledW, float fade, float center, float height, float scaledH, int opacity) {
      boolean var8 = true;
      float var9 = fade * 0.9F;
      float var10 = scaledW * var9 / 6.0F;
      float var11 = IlIIIillIIIi.IliIlllilIi(center * scaledH, 0.0F, 1.0F);
      int var12 = opacity >> 16 & 255;
      int var13 = opacity >> 8 & 255;
      int var14 = opacity & 255;
      float var15 = argb * 0.5F;
      float var16 = argb * (0.1F + height * 0.18F);
      class_4588 var17 = llIllIililIllIil.IilliliilIIi();

      for(int var18 = 0; var18 < 6; ++var18) {
         float var19 = scaledW - (float)var18 * var10;
         float var20 = scaledW - (float)(var18 + 1) * var10;
         int var21 = Math.round(var11 * (1.0F - (float)var18 / 6.0F) * 255.0F);
         var21 = var21 < 0 ? 0 : (var21 > 255 ? 255 : var21);
         int var22 = var21 << 24 | var12 << 16 | var13 << 8 | var14;
         llIllIililIllIil.iliIiiliiiii(var17, 0.0F, var20, var15 - var16, var19, var22);
         llIllIililIllIil.iliIiiliiiii(var17, var15 + var16, var20, argb, var19, var22);
      }

      llIllIililIllIil.IIillIiliIil();
   }

   private void ilIllIiIll() {
      this.liIllliill.clear();
      class_2338 var1 = Iiiilllliiilll.field_1724.method_24515();
      boolean var2 = true;
      boolean var3 = true;
      boolean var4 = true;
      class_2338.class_2339 var5 = new class_2338.class_2339();

      for(int var6 = -18; var6 <= 18; ++var6) {
         for(int var7 = -18; var7 <= 18; ++var7) {
            for(int var8 = -8; var8 <= 8; ++var8) {
               var5.method_10103(var1.method_10263() + var6, var1.method_10264() + var8, var1.method_10260() + var7);
               if (Iiiilllliiilll.field_1687.method_8320(var5).method_26204() instanceof class_4770) {
                  this.liIllliill.add(var5.method_10062());
                  if (this.liIllliill.size() >= 256) {
                     return;
                  }
               }
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) << 15))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) << 15))) << 11) + var5) ^ var5) + var5) ^ '퍸') ^ 20563) - 10955) + var5) ^ '踈') >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) << 15))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) >>> 14 | (char)((char)(var4[var5] - var5) - var5) << 2) + '쥪') ^ var5) << 15))) << 11) + var5) ^ var5) + var5) ^ '퍸') ^ 20563) - 10955) + var5) ^ '踈') << 11) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIllllIll() {
      long var2 = -6402554158397694900L;
      var2 ^= ((long)lIIlliIIll() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != this.IIlllliill) {
         this.IIlllliill = (boolean)((int)(var2 >>> 32));
         if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1769 != null) {
            Iiiilllliiilll.field_1769.method_3279();
         }

      }
   }

   public static boolean lIIlliIIll() {
      Iiiilillliiilill var0 = (Iiiilillliiilill)llilIllililIll.iliIiiliiiii(Iiiilillliiilill.class);
      return var0 != null && var0.IliIlllilIi() && var0.liiIlliill.Iilllilliill();
   }
}
