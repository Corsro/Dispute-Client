package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iIlillIiIllillIi(long targetRegion, long playerComponent, long accessAssetSet, int entrySide, int strategy, long failureFingerprint) {
   private final long lillIIlIIi;
   private final int lIilIIlIIi;
   private final long IlilIIlIIi;
   private final long iillIIlIIi;
   private final long IIilIIlIIi;
   private final int iIilIIlIIi;

   public long IilliliilIIi() {
      return this.IIilIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) - var5))) ^ var5) ^ '\uf3d2') << 3 | (char)((char)((char)(~((char)((char)(-var4[var5]) - var5))) ^ var5) ^ '\uf3d2') >>> 13))) + 17245) ^ '\uf597'))) + var5) ^ '\uf77b'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIlillIiIllillIi(long strategy, long accessAssetSet, long targetRegion, int failureFingerprint, int entrySide, long playerComponent) {
      this.lillIIlIIi = strategy;
      this.iillIIlIIi = accessAssetSet;
      this.IIilIIlIIi = targetRegion;
      this.lIilIIlIIi = failureFingerprint;
      this.iIilIIlIIi = entrySide;
      this.IlilIIlIIi = playerComponent;
   }

   public long liiiIIllIl() {
      return this.lillIIlIIi;
   }

   public String IliIlllilIi() {
      return String.format(Locale.ROOT, IlIlllIlilIl<invokedynamic>(), this.lillIIlIIi, this.iillIIlIIi, Long.toUnsignedString(this.IIilIIlIIi, 16), illiIlIiIiliIlIi.IliIlllilIi(this.lIilIIlIIi), this.iIilIIlIIi, Long.toUnsignedString(this.IlilIIlIIi, 16));
   }

   public int lIiiIiIlilli() {
      return this.lIilIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\udeab') << 4 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\udeab') >>> 12) - '꥟') - var5))) + '흑') ^ 19899) << 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\udeab') << 4 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\udeab') >>> 12) - '꥟') - var5))) + '흑') ^ 19899) >>> 2) + '虼'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) >>> 15 | (char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) << 1) + '\uef15') ^ '蟔') ^ var5) + var5) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) >>> 15 | (char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) << 1) + '\uef15') ^ '蟔') ^ var5) + var5) - var5) << 6) ^ '꣔') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) >>> 15 | (char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) << 1) + '\uef15') ^ '蟔') ^ var5) + var5) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) >>> 15 | (char)((char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) << 5 | (char)((char)((char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) << 1 | (char)((char)(~var4[var5]) << 15 | (char)(~var4[var5]) >>> 1) >>> 15) - var5) >>> 11) << 1) + '\uef15') ^ '蟔') ^ var5) + var5) - var5) << 6) ^ '꣔') >>> 1))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.iIilIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 29720) >>> 14 | (char)(var4[var5] - 29720) << 2) - 25017) ^ '警') - var5) - 13056) ^ 'ﻓ') << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 29720) >>> 14 | (char)(var4[var5] - 29720) << 2) - 25017) ^ '警') - var5) - 13056) ^ 'ﻓ') >>> 13) + 19976) - '뗆') - '덦') ^ var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iIlIlllllill() {
      return this.iillIIlIIi;
   }

   public long IIIllIIliIIl() {
      return this.IlilIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - 'ퟕ') + '습') >>> 9 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) - 'ퟕ') + '습') << 7))) ^ var5) << 4 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - 'ퟕ') + '습') >>> 9 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) - 'ퟕ') + '습') << 7))) ^ var5) >>> 12) ^ var5) + var5) + var5))) - var5) ^ var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4283342704564366086L ^ Long.rotateLeft(-2299882432387628414L, 11) ^ -8756070037714497L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6902438312914096424L ^ Long.rotateLeft(-2946479910932444276L, 2) ^ 1469115660348167397L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1347629069366058443L ^ Long.rotateLeft(799556715419261327L, 33) ^ -6738266728537223720L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1431679320555635746L ^ Long.rotateLeft(7944235413280765308L, 34) ^ 7311993347686045560L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6610236211417216965L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7894467125458707263L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7274751180007247013L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3096898801836257684L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6363861349482657233L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8626739823451290752L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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
}
