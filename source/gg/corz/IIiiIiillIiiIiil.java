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

public final class IIiiIiillIiiIiil {
   private int iiliIIilil;
   private int liliIIilil;
   private int IIiiIIilil = -1;
   private String lIiiIIilil = "";
   private int iIiiIIilil;

   public boolean IliIlllilIi(int kind, String tick, int id) {
      long var5 = -3364592862671386071L;
      var5 ^= ((long)(this.IIiiIIilil < 0 ? 1 : 0) << 32 ^ var5) & -1L << 32;
      ++this.liliIIilil;
      this.IIiiIIilil = kind;
      this.lIiiIIilil = tick;
      this.iIiiIIilil = id;
      return (boolean)((int)(var5 >>> 32));
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6181887445014371813L ^ Long.rotateLeft(-5127029597786597319L, 49) ^ -2745512997671663291L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6737557791037065631L ^ Long.rotateLeft(-9023228483962489660L, 57) ^ -6948248536607085585L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -766515908775708420L ^ Long.rotateLeft(1546477849635259804L, 48) ^ 5244723120443761174L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5084857888879287772L ^ Long.rotateLeft(8864867209122481355L, 21) ^ 3299087046036383757L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5719700699080850317L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8996408168865906242L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8946755454233626056L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8335711787516978696L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5696221602876964794L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8026091784893646875L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   public String IiIlliIliiIl() {
      return Illlllllilll<invokedynamic>() + this.liliIIilil + Illlllllilll<invokedynamic>() + this.iiliIIilil + Illlllllilll<invokedynamic>() + (this.IIiiIIilil >= 0 ? 1 : 0);
   }

   public boolean IlIlllIlilIl() {
      return this.liliIIilil == this.iiliIIilil && this.IIiiIIilil < 0;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) << 1))) + var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) << 1))) + var5) >>> 7) << 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) << 1))) + var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) << 9 | (char)((char)((char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) >>> 5 | (char)((char)(var4[var5] - var5) << 9 | (char)(var4[var5] - var5) >>> 7) << 11) ^ var5) >>> 7) + '쥭') >>> 12) << 1))) + var5) >>> 7) >>> 3) - var5))) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liiiIIllIl() {
      return this.IIiiIIilil >= 0;
   }

   public int iliIiiliiiii() {
      return this.liliIIilil;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) << 14) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) << 14) << 15) ^ var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) << 14) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) << 6 | (char)((char)((char)(var4[var5] - var5) ^ 'ﱵ') ^ var5) >>> 10))) ^ 30186) ^ var5) >>> 5) << 14) << 15) ^ var5) << 4) ^ '褏') + 13236) + var5) ^ 30855) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiiIilliiIil lIiiIiIlilli(int tempPlaced, int confirmed, int verticalTransitions, int jumpTransitions, int tempRemoved, double travel, int attempted, int why, int plannedMembers, ilIiiIiIiIiiIi tick) {
      if (this.IIiiIIilil < 0) {
         return null;
      } else {
         IiiIilliiIil var12 = new IiiIilliiIil(this.IIiiIIilil, this.lIiiIIilil, tempPlaced, confirmed, verticalTransitions, jumpTransitions, tempRemoved, travel, attempted, why, Math.max(0, plannedMembers - this.iIiiIIilil), tick);
         this.IIiiIIilil = -1;
         this.lIiiIIilil = "";
         ++this.iiliIIilil;
         return var12;
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) >>> 8 | (char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) << 8))) - '璉') << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) >>> 8 | (char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) << 8))) - '璉') >>> 10) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) >>> 8 | (char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) << 8))) - '璉') << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) >>> 8 | (char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) << 13 | (char)((char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) << 11 | (char)((char)(-((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))))) + 20873) >>> 5) >>> 3) ^ 4124) << 8))) - '璉') >>> 10) << 9) ^ var5)))) + var5) + 13200));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill() {
      return this.IIiiIIilil;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ var5) ^ '뜘')) + 21024) << 13 | (char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ var5) ^ '뜘')) + 21024) >>> 3) + '\uf50a'))) + '髶') + 2889) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) >>> 10) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) >>> 10) << 10) ^ 'ﶲ'))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) >>> 10) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) >>> 4 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) + 'ꏖ') - var5))) << 2) ^ 29032) << 12) - var5) >>> 10) << 10) ^ 'ﶲ'))) >>> 14) ^ var5))) + 11054) ^ var5) - 13195));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IilliliilIIi() {
      return this.lIiiIIilil;
   }

   public void IIlllIlliIll() {
      this.liliIIilil = 0;
      this.iiliIIilil = 0;
      this.IIiiIIilil = -1;
      this.lIiiIIilil = "";
   }

   public int IIIllIIliIIl() {
      return this.iiliIIilil;
   }
}
