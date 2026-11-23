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
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Vector4f;

final class lIIilIliIIilIl {
   static final float[] iIIlIiIllIlIlIiIll = new float[]{6.6F, 2.9F, 12.4F};
   float illlIiIllIillIiIll;
   private float iIilIiIllIlilIiIll = 1.0F;
   final Matrix4f llIlIiIllilIlIiIll = new Matrix4f();
   static final float liiIIiIlliiiIIiIll = 0.1F;
   float IIilIiIlllIilIiIll;
   private final Vector4f IlllIiIllllllIiIll = new Vector4f();
   final Matrix4f IiIlIiIllliIlIiIll = new Matrix4f();
   private float llilIiIllililIiIll = 1.0F;
   static final float IIIlIiIlllIIlIiIll = 80.0F;
   float lillIiIlliillIiIll;
   private static final float iliIIiIllIiiIIiIll = ((float)Math.PI / 180F);
   final Matrix3f iiIlIiIllIIllIiIll = new Matrix3f();
   private final Matrix4f lIllIiIlliIllIiIll = new Matrix4f();

   void liiiIIllIl(float parallaxY, float parallaxX, float screenW, float screenH, boolean corner) {
      this.iIilIiIllIlilIiIll = Math.max(1.0F, parallaxY);
      this.llilIiIllililIiIll = Math.max(1.0F, parallaxX);
      float var6 = this.iIilIiIllIlilIiIll / this.llilIiIllililIiIll;
      String var7 = corner ? iliIiiliiiii<invokedynamic>() : iliIiiliiiii<invokedynamic>();
      String var8 = corner ? iliIiiliiiii<invokedynamic>() : iliIiiliiiii<invokedynamic>();
      float var9 = IIiliiIilIiliiIi.IliIlllilIi(var7 + iliIiiliiiii<invokedynamic>(), 62.0F);
      this.illlIiIllIillIiIll = IIiliiIilIiliiIi.IliIlllilIi(var7 + iliIiiliiiii<invokedynamic>(), corner ? iIIlIiIllIlIlIiIll[0] : 0.0F) + screenW * IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<invokedynamic>(), 0.35F);
      this.lillIiIlliillIiIll = IIiliiIilIiliiIi.IliIlllilIi(var7 + iliIiiliiiii<invokedynamic>(), corner ? iIIlIiIllIlIlIiIll[1] : 2.9F) + screenH * IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<invokedynamic>(), 0.18F);
      this.IIilIiIlllIilIiIll = IIiliiIilIiliiIi.IliIlllilIi(var7 + iliIiiliiiii<invokedynamic>(), corner ? iIIlIiIllIlIlIiIll[2] : 12.4F);
      float var10 = IIiliiIilIiliiIi.IliIlllilIi(var8 + iliIiiliiiii<invokedynamic>(), corner ? 5.4F : 0.0F) + screenW * 0.08F;
      float var11 = IIiliiIilIiliiIi.IliIlllilIi(var8 + iliIiiliiiii<invokedynamic>(), corner ? 1.0F : 2.5F);
      float var12 = IIiliiIilIiliiIi.IliIlllilIi(var8 + iliIiiliiiii<invokedynamic>(), corner ? 3.8F : 0.0F);
      this.llIlIiIllilIlIiIll.setPerspective(var9 * ((float)Math.PI / 180F), var6, 0.1F, 80.0F);
      if (corner) {
         this.llIlIiIllilIlIiIll.translateLocal(IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<invokedynamic>(), 0.677F), IIiliiIilIiliiIi.IliIlllilIi(iliIiiliiiii<invokedynamic>(), -0.333F), 0.0F);
      }

      this.IiIlIiIllliIlIiIll.setLookAt(this.illlIiIllIillIiIll, this.lillIiIlliillIiIll, this.IIilIiIlllIilIiIll, var10, var11, var12, 0.0F, 1.0F, 0.0F);
      this.IiIlIiIllliIlIiIll.get3x3(this.iiIlIiIllIIllIiIll);
      this.llIlIiIllilIlIiIll.mul(this.IiIlIiIllliIlIiIll, this.lIllIiIlliIllIiIll);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) + '\uffd0'))) - '\uf086') ^ 29858))) - var5) ^ var5) + var5) + 28925) ^ var5) - var5) + 31022) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) + '\uffd0'))) - '\uf086') ^ 29858))) - var5) ^ var5) + var5) + 28925) ^ var5) - var5) + 31022) >>> 2) ^ 12976) - '뤸') - '鋖'));
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
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) + '니'))) + var5) - 32120) - var5) << 7 | (char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) + '니'))) + var5) - 32120) - var5) >>> 9))))))) + var5) - var5) - var5))) ^ 'ꜫ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   float IilliliilIIi(float depth) {
      return !(depth > 0.1F) ? 0.0F : this.llilIiIllililIiIll * this.llIlIiIllilIlIiIll.m11() / (2.0F * depth);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6171548625690064322L ^ Long.rotateLeft(-7684358925327112622L, 34) ^ -617847747896549511L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7937570552012855052L ^ Long.rotateLeft(4180545970947258789L, 53) ^ -5689576410152797030L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6947530860565313307L ^ Long.rotateLeft(3695232551529882346L, 14) ^ -1225126317464404556L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7612632652214702012L ^ Long.rotateLeft(7193409966426485577L, 58) ^ -2341632820183934966L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7030011817819741905L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8119268207630878163L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1598762655516796413L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 268971137128274216L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8333960961047216232L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1859533071517860229L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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

   boolean iIlIlllllill(float out, float z, float y, float[] x) {
      this.IlllIiIllllllIiIll.set(out, z, y, 1.0F);
      this.lIllIiIlliIllIiIll.transform(this.IlllIiIllllllIiIll);
      if (this.IlllIiIllllllIiIll.w <= 0.1F) {
         return false;
      } else {
         float var5 = this.IlllIiIllllllIiIll.x / this.IlllIiIllllllIiIll.w;
         float var6 = this.IlllIiIllllllIiIll.y / this.IlllIiIllllllIiIll.w;
         x[0] = (var5 * 0.5F + 0.5F) * this.iIilIiIllIlilIiIll;
         x[1] = (0.5F - var6 * 0.5F) * this.llilIiIllililIiIll;
         x[2] = this.IlllIiIllllllIiIll.w;
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '駶') << 11 | (char)(var4[var5] ^ '駶') >>> 5) + 19748) ^ 24603) + var5) - '탶') << 13 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '駶') << 11 | (char)(var4[var5] ^ '駶') >>> 5) + 19748) ^ 24603) + var5) - '탶') >>> 3) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '駶') << 11 | (char)(var4[var5] ^ '駶') >>> 5) + 19748) ^ 24603) + var5) - '탶') << 13 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '駶') << 11 | (char)(var4[var5] ^ '駶') >>> 5) + 19748) ^ 24603) + var5) - '탶') >>> 3) + var5) << 3) + 26698) + 19874) + '뀦'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   void IliIlllilIi(float screenW, float parallaxY, float parallaxX, float screenH) {
      this.liiiIIllIl(screenW, parallaxY, parallaxX, screenH, false);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) << 10 | (char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) >>> 6) ^ '\uf25a') + var5) >>> 11 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) << 10 | (char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) >>> 6) ^ '\uf25a') + var5) << 5) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) << 10 | (char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) >>> 6) ^ '\uf25a') + var5) >>> 11 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) << 10 | (char)(~((char)((char)((char)(~((char)(~var4[var5]))) << 6 | (char)(~((char)(~var4[var5]))) >>> 10) ^ var5))) >>> 6) ^ '\uf25a') + var5) << 5) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   float lIiiIiIlilli(float z, float x, float y) {
      float var4 = z - this.illlIiIllIillIiIll;
      float var5 = x - this.lillIiIlliillIiIll;
      float var6 = y - this.IIilIiIlllIilIiIll;
      return (float)Math.sqrt((double)(var4 * var4 + var5 * var5 + var6 * var6));
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) >>> 12))) + var5))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) >>> 12))) + var5))) << 11) - var5))) + 'ﾨ') << 8 | (char)((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) >>> 12))) + var5))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) << 15 | (char)(var4[var5] - var5) >>> 1) - 'ꨏ'))) - 27359) + var5) ^ var5) - var5) >>> 12))) + var5))) << 11) - var5))) + 'ﾨ') >>> 8))) + '썓'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
