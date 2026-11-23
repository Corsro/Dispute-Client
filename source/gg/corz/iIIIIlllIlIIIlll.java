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

public final class iIIIIlllIlIIIlll {
   private float ilIliiilll;
   private float IlIliiilll;
   private static final float lliIiiilll = 170.0F;
   private String iiiIiiilll;
   private float llIliiilll;
   private float iIIliiilll;
   private String liiIiiilll;
   private String IiiIiiilll;
   private long IiIliiilll;
   private static final float iliIiiilll = 3.0F;
   private String IIIliiilll;
   private float lIIliiilll = Float.NaN;

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7097426631677336089L ^ Long.rotateLeft(7086305559246637846L, 54) ^ -8285892529712259563L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3495226600139805114L ^ Long.rotateLeft(5602484743832573165L, 23) ^ -3856238073101225844L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7389396976424574346L ^ Long.rotateLeft(-2862037308505532642L, 45) ^ -4703493135012364591L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2292220793631963500L ^ Long.rotateLeft(4655237359580012681L, 19) ^ -8958490288925261737L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5020729451506796921L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8476233124647210667L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1082990627659084230L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5124883985617630607L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 9031707853948146073L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5551295526789474405L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Ililllililil<invokedynamic>());
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

   private static void IiIlliIliiIl(String a, float y, float s, float argb, float scale, int x, float track) {
      float var7 = IliiIilliiIi.IilliliilIIi(track);

      try {
         llilliilililliil.IIiIllIiIl(a, y, s, argb, scale, x);
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var7);
      }

   }

   public String iliIiiliiiii() {
      return this.IiiIiiilll == null ? "" : this.IiiIiiilll;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) << 9) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) << 9) >>> 12) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) << 9) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) << 13 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '횗'))) + 'ﴫ') - 11081) + 10276) >>> 3) ^ '\udf3e') << 10) << 9) >>> 12) >>> 3) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float lIiiIiIlilli() {
      return this.liiIiiilll == null ? 1.0F : llilliilililliil.liiiIIllIl((this.IlIlllIlilIl() - 0.3F) / 0.7F);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - '\ue99c') ^ var5) >>> 10 | (char)((char)((char)(var4[var5] + var5) - '\ue99c') ^ var5) << 6))) + '챝') << 15 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - '\ue99c') ^ var5) >>> 10 | (char)((char)((char)(var4[var5] + var5) - '\ue99c') ^ var5) << 6))) + '챝') >>> 1) - var5) - var5) ^ var5) + '酒') + var5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float IliIlllilIi(String right, float y, float argb, float scale, int s, float x) {
      return this.liiiIIllIl(right, y, argb, scale, 0.0F, s, x, false);
   }

   private float IlIlllIlilIl() {
      return this.liiIiiilll == null ? 1.0F : (float)(System.nanoTime() - this.IiIliiilll) / 1000000.0F / 170.0F;
   }

   public void IIIllIIliIIl() {
      this.IiiIiiilll = this.liiIiiilll = this.iiiIiiilll = this.IIIliiilll = null;
      this.lIIliiilll = Float.NaN;
      this.IiIliiilll = 0L;
   }

   public float liiiIIllIl(String s, float right, float alignRight, float scale, float y, int track, float x, boolean argb) {
      if (s == null) {
         s = "";
      }

      if (this.IiiIiiilll == null) {
         this.IiiIiiilll = s;
         this.lIIliiilll = Float.NaN;
      } else if (!this.IiiIiiilll.equals(s)) {
         this.liiIiiilll = this.IiiIiiilll;
         this.IIIliiilll = this.iiiIiiilll;
         this.ilIliiilll = this.llIliiilll;
         this.IiiIiiilll = s;
         this.iiiIiiilll = null;
         this.IiIliiilll = System.nanoTime();
      }

      float var9 = this.IlIlllIlilIl();
      if (var9 >= 1.0F) {
         this.liiIiiilll = null;
         this.IIIliiilll = null;
      }

      this.iIlIlllllill(Math.max(0.0F, x - right), scale, y);
      if (this.liiIiiilll == null) {
         llilliilililliil.IIiIllIiIl(this.iiiIiiilll, argb ? x - this.llIliiilll : right, alignRight, scale, y, track);
         return this.llIliiilll;
      } else {
         float var10 = llilliilililliil.IliIlllilIi(var9 / 0.45F);
         float var11 = llilliilililliil.liiiIIllIl((var9 - 0.3F) / 0.7F);
         if (var10 < 1.0F) {
            IiIlliIliiIl(this.IIIliiilll, argb ? x - this.ilIliiilll : right, alignRight - 3.0F * var10, scale, y, track, 1.0F - var10);
         }

         if (var11 > 0.0F) {
            IiIlliIliiIl(this.iiiIiiilll, argb ? x - this.llIliiilll : right, alignRight + 3.0F * (1.0F - var11), scale, y, track, var11);
         }

         return this.llIliiilll;
      }
   }

   private static String IilliliilIIi(String s, float scale, float track, float room) {
      if (room == 0.0F) {
         return llilliilililliil.IIiilIiiiIii().Iiilliiliiil(s, scale / track);
      } else if (llilliilililliil.lilIliilIl(s, track, room) <= scale) {
         return s;
      } else {
         String var4;
         for(var4 = s; var4.length() > 1 && llilliilililliil.lilIliilIl(var4 + IIlllIlliIll<invokedynamic>(), track, room) > scale; var4 = var4.substring(0, var4.length() - 1)) {
         }

         return var4.stripTrailing() + IIlllIlliIll<invokedynamic>();
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 25052) << 10 | (char)((char)(var4[var5] ^ var5) + 25052) >>> 6) + 16237) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 25052) << 10 | (char)((char)(var4[var5] ^ var5) + 25052) >>> 6) + 16237) - var5) + var5) >>> 1) - '쁗') + var5))))) ^ 28225) >>> 10 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 25052) << 10 | (char)((char)(var4[var5] ^ var5) + 25052) >>> 6) + 16237) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 25052) << 10 | (char)((char)(var4[var5] ^ var5) + 25052) >>> 6) + 16237) - var5) + var5) >>> 1) - '쁗') + var5))))) ^ 28225) << 6) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) << 11) + 'ꥃ') << 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) << 11) + 'ꥃ') >>> 14))))) ^ var5) >>> 2 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) << 11) + 'ꥃ') << 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) >>> 5 | (char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + var5) - var5) << 11) + 'ꥃ') >>> 14))))) ^ var5) << 14) + '鬙') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIlllllill(float scale, float room, float track) {
      long var5 = -866351534929120783L;
      var5 ^= ((long)(scale == this.lIIliiilll && room == this.iIIliiilll && track == this.IlIliiilll ? 1 : 0) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) == 0 || this.iiiIiiilll == null || this.liiIiiilll != null && this.IIIliiilll == null) {
         this.lIIliiilll = scale;
         this.iIIliiilll = room;
         this.IlIliiilll = track;
         this.iiiIiiilll = IilliliilIIi(this.IiiIiiilll, scale, room, track);
         this.llIliiilll = llilliilililliil.lilIliilIl(this.iiiIiiilll, room, track);
         if (this.liiIiiilll != null) {
            this.IIIliiilll = IilliliilIIi(this.liiIiiilll, scale, room, track);
            this.ilIliiilll = llilliilililliil.lilIliilIl(this.IIIliiilll, room, track);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) ^ 19123) ^ 14745))))) + var5) + var5))) >>> 8 | (char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) ^ 19123) ^ 14745))))) + var5) + var5))) << 8) ^ var5) ^ var5) - var5) + 7869) << 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) ^ 19123) ^ 14745))))) + var5) + var5))) >>> 8 | (char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) ^ 19123) ^ 14745))))) + var5) + var5))) << 8) ^ var5) ^ var5) - var5) + 7869) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
