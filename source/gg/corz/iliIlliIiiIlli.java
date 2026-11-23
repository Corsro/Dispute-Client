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

public record iliIlliIiiIlli(String activity, int tone, int found, int checked, int rockets, int rocketMin, int durability, int durabilityMax, double distance) {
   public static final int ilIlilIIIl = 0;
   public static final int iiIlilIIIl = 3;
   private final int liiIilIIIl;
   private final int IlIlilIIIl;
   public static final int liIlilIIIl = 2;
   private final int IiiIilIIIl;
   private final double llIlilIIIl;
   private final int lIIlilIIIl;
   private final int iiiIilIIIl;
   private final int IIIlilIIIl;
   public static final iliIlliIiiIlli IIllilIIIl = new iliIlliIiiIlli(Illlllllilll<invokedynamic>(), 0, 0, 0, 0, 0, -1, -1, Double.longBitsToDouble(-376676419589378380L ^ 4987110736608882356L));
   private final String iliIilIIIl;
   private final int iIIlilIIIl;
   public static final int IiIlilIIIl = 1;

   public int IIIllIIliIIl() {
      return this.lIIlilIIIl;
   }

   public String liiiIIllIl() {
      return this.iliIilIIIl;
   }

   public int IiIlliIliiIl() {
      return this.IlIlilIIIl;
   }

   public double IIlllIlliIll() {
      return this.llIlilIIIl;
   }

   public int IlIlllIlilIl() {
      return this.iIIlilIIIl;
   }

   public float IliIlllilIi() {
      return this.iIIlilIIIl >= 0 && this.IlIlilIIIl > 0 ? Math.max(0.0F, Math.min(1.0F, (float)this.iIIlilIIIl / (float)this.IlIlilIIIl)) : -1.0F;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 27072) + 12444) - var5))) - var5) + var5) + 28955))) ^ var5) ^ var5) - '쐐'))) - '蒰'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli() {
      return this.iiiIilIIIl;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3981450158519448663L ^ Long.rotateLeft(-5667137929599613036L, 43) ^ 2788681027036961911L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 123706472543686139L ^ Long.rotateLeft(5857149221315047598L, 55) ^ -6514980202264627875L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7149761963164343177L ^ Long.rotateLeft(5478971978603608278L, 50) ^ -3423830330855708003L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 694933233352290311L ^ Long.rotateLeft(8157233160747042383L, 10) ^ -199288154418578941L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5929760996026330817L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4672322176280178429L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -636866933402243700L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7735036933927781117L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2120528918097934372L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6601153131429429976L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(~((char)(var4[var5] - 16538))))) ^ '\uf139'))) + var5) - var5))) - var5))) + '︗') >>> 15 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)(~((char)(var4[var5] - 16538))))) ^ '\uf139'))) + var5) - var5))) - var5))) + '︗') << 1) ^ 24396));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 31213) ^ var5) - 3608) - var5) - var5) + var5) ^ var5) - 16251));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) << 1) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) << 1) << 15))))) << 10 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) << 1) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) << 1 | (char)((char)((char)((char)(var4[var5] - var5) - 18346) >>> 4 | (char)((char)(var4[var5] - var5) - 18346) << 12) + 5836) >>> 15) - '\ue332') ^ var5) ^ var5) - '荸') ^ var5) << 1) << 15))))) >>> 6)) ^ '궪'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.IIIlilIIIl;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) << 3) ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) << 3) ^ var5) >>> 13) ^ var5) >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) << 3) ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) + 28965) ^ 6637) ^ var5))) ^ 6720) ^ 20232) ^ '쇢')) >>> 7) ^ var5) ^ 8806))) << 3) ^ var5) >>> 13) ^ var5) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iliIlliIiiIlli(String found, int durability, int durabilityMax, int rocketMin, int activity, int tone, int rockets, int checked, double distance) {
      this.iliIilIIIl = found;
      this.IiiIilIIIl = durability;
      this.liiIilIIIl = durabilityMax;
      this.iiiIilIIIl = rocketMin;
      this.IIIlilIIIl = activity;
      this.lIIlilIIIl = tone;
      this.iIIlilIIIl = rockets;
      this.IlIlilIIIl = checked;
      this.llIlilIIIl = distance;
   }

   public int iIlIlllllill() {
      return this.IiiIilIIIl;
   }

   public int IilliliilIIi() {
      return this.liiIilIIIl;
   }
}
