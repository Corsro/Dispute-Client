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

public record liIillIiiiIillIi(String activity, int tone, String destination, double remaining, double total, long etaSeconds, double speedBps, int altitude, int rockets, int rocketTarget, int xpBottles, int durability, int durabilityMax) {
   public static final int illlIIlIIi = 3;
   private final long IlIlIIlIIi;
   private final int liIlIIlIIi;
   public static final liIillIiiiIillIi IillIIlIIi = new liIillIiiiIillIi(IIIilIIiiIIi<invokedynamic>(), 0, "", Double.longBitsToDouble(-6888106819893984220L ^ 2276718421804975140L), Double.longBitsToDouble(-7639168716517287425L ^ 3029858800723417599L), -1L, (double)0.0F, 0, 0, 0, 0, -1, -1);
   private final double iIIlIIlIIi;
   private final double lIIlIIlIIi;
   private final int iiiIIIlIIi;
   private final int lIllIIlIIi;
   private final int IIllIIlIIi;
   private final int IiIlIIlIIi;
   private final String liiIIIlIIi;
   private final int ilIlIIlIIi;
   private final String IIIlIIlIIi;
   private final double llIlIIlIIi;
   public static final int llllIIlIIi = 2;
   public static final int IlllIIlIIi = 1;
   private final int iiIlIIlIIi;
   public static final int iIllIIlIIi = 0;

   public int IIlllIlliIll() {
      return this.ilIlIIlIIi;
   }

   public int Illlllllilll() {
      return this.IiIlIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 4940) << 9 | (char)(var4[var5] - 4940) >>> 7) ^ var5) ^ var5) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - 4940) << 9 | (char)(var4[var5] - 4940) >>> 7) ^ var5) ^ var5) - var5) << 15) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] - 4940) << 9 | (char)(var4[var5] - 4940) >>> 7) ^ var5) ^ var5) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - 4940) << 9 | (char)(var4[var5] - 4940) >>> 7) ^ var5) ^ var5) - var5) << 15) >>> 12) - var5) ^ var5) ^ var5) - var5) + 19005) ^ '￫') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return this.liiIIIlIIi;
   }

   public int IilliliilIIi() {
      return this.iiiIIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) << 8) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) << 8) >>> 9) + 13617) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) << 8) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퐤') + var5) + 0) ^ '끜') ^ 28395) + 11159) ^ var5) << 8) >>> 9) + 13617) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double iliIiiliiiii() {
      return this.lIIlIIlIIi;
   }

   public int Ililllililil() {
      return this.IIllIIlIIi;
   }

   public double IiIlliIliiIl() {
      return this.llIlIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 1389) - '酱') - var5))) + 26643))) ^ var5) - var5))) ^ var5))) - var5) ^ var5) + var5) - '톌') ^ var5) - '\uf734'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float IliIlllilIi() {
      return this.iIIlIIlIIi > Double.longBitsToDouble(-4472815504261262582L ^ -4472815504261262582L) && !Double.isInfinite(this.iIIlIIlIIi) && this.lIIlIIlIIi >= Double.longBitsToDouble(-5395490900075083597L ^ -5395490900075083597L) && !Double.isInfinite(this.lIIlIIlIIi) ? (float)Math.max((double)0.0F, Math.min((double)1.0F, (double)1.0F - this.lIIlIIlIIi / this.iIIlIIlIIi)) : 0.0F;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) << 12 | (char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) >>> 4))) + 31578) - '譚') << 7 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) << 12 | (char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) >>> 4))) + 31578) - '譚') >>> 9) << 1 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) << 12 | (char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) >>> 4))) + 31578) - '譚') << 7 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) << 12 | (char)((char)((char)(-((char)(var4[var5] - '꺺'))) ^ var5) ^ 14011) >>> 4))) + 31578) - '譚') >>> 9) >>> 15) - '\ud9b5') + var5))) - 5529) ^ 4503) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liIillIiiiIillIi(String rockets, int destination, String altitude, double xpBottles, double tone, long activity, double durability, int durabilityMax, int speedBps, int etaSeconds, int remaining, int total, int rocketTarget) {
      this.liiIIIlIIi = rockets;
      this.iiiIIIlIIi = destination;
      this.IIIlIIlIIi = altitude;
      this.lIIlIIlIIi = xpBottles;
      this.iIIlIIlIIi = tone;
      this.IlIlIIlIIi = activity;
      this.llIlIIlIIi = durability;
      this.ilIlIIlIIi = durabilityMax;
      this.IiIlIIlIIi = speedBps;
      this.liIlIIlIIi = etaSeconds;
      this.iiIlIIlIIi = remaining;
      this.IIllIIlIIi = total;
      this.lIllIIlIIi = rocketTarget;
   }

   public String lIiiIiIlilli() {
      return this.IIIlIIlIIi;
   }

   public int IIillIiliIil() {
      return this.iiIlIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23459) ^ 17410) << 1 | (char)((char)(var4[var5] - 23459) ^ 17410) >>> 15) + var5) - var5) + 9300) ^ 402) ^ var5) ^ 'ꊎ') - var5) + 3402) ^ '\ueb42'))) + var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilllilliill() {
      return this.liIlIIlIIi;
   }

   public long IlIlllIlilIl() {
      return this.IlIlIIlIIi;
   }

   public int Iiilliiliiil() {
      return this.lIllIIlIIi;
   }

   public double IIIllIIliIIl() {
      return this.iIIlIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5595753849226103780L ^ Long.rotateLeft(8390784797787872977L, 35) ^ -7917274800774717287L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6433918952753823044L ^ Long.rotateLeft(2331350511088943501L, 51) ^ 6937073659595562606L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4869917019389397146L ^ Long.rotateLeft(6016178131961450428L, 57) ^ 8954155173041602850L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3582143611974962357L ^ Long.rotateLeft(-1236104733031948839L, 53) ^ 1073760321493622880L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7580225876047474750L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4968273553646212580L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8842312998303302777L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -834626975667269020L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 408790733506895934L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5147561921299403440L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   public float liiiIIllIl() {
      return this.IIllIIlIIi >= 0 && this.lIllIIlIIi > 0 ? Math.max(0.0F, Math.min(1.0F, (float)this.IIllIIlIIi / (float)this.lIllIIlIIi)) : -1.0F;
   }
}
