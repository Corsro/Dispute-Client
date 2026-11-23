package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iliIllllIiiIllll(String reason, long target, long planId, int activeLayer) {
   private final String iiIlilIill;
   private final long lIllilIill;
   private final long IIllilIill;
   private final int iIllilIill;

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) << 10 | (char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) >>> 6) << 7 | (char)((char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) << 10 | (char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) >>> 6) >>> 9))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) << 10 | (char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) >>> 6) << 7 | (char)((char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) << 10 | (char)((char)((char)(var4[var5] + 21080) ^ var5) >>> 15 | (char)((char)(var4[var5] + 21080) ^ var5) << 1) >>> 6) >>> 9))) ^ var5) << 15) + var5) + 26946));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iliIllllIiiIllll(String planId, long reason, long target, int activeLayer) {
      planId = (String)Objects.requireNonNullElse(planId, iliIiiliiiii<invokedynamic>());
      this.iiIlilIill = planId;
      this.IIllilIill = reason;
      this.lIllilIill = target;
      this.iIllilIill = activeLayer;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] + var5))) + '뛗'))) - var5) << 1 | (char)((char)(-((char)((char)(-((char)(var4[var5] + var5))) + '뛗'))) - var5) >>> 15) ^ var5))) >>> 7 | (char)(~((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] + var5))) + '뛗'))) - var5) << 1 | (char)((char)(-((char)((char)(-((char)(var4[var5] + var5))) + '뛗'))) - var5) >>> 15) ^ var5))) << 9) + var5) + 3803) + 4287));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') >>> 10) ^ '\udc50') ^ 1853) << 4 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') >>> 10) ^ '\udc50') ^ 1853) >>> 12) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') >>> 10) ^ '\udc50') ^ 1853) << 4 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') >>> 3 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) << 2 | (char)(~((char)(var4[var5] - var5))) >>> 14) + '뽲') - '뢕') << 13))) + 18693) + '껷') >>> 10) ^ '\udc50') ^ 1853) >>> 12) >>> 8) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IliIlllilIi() {
      long var1 = -3750763034362895579L;
      var1 = (var1 ^ (long)this.iiIlilIill.hashCode()) * 1099511628211L;
      var1 = (var1 ^ this.IIllilIill) * 1099511628211L;
      var1 = (var1 ^ this.lIllilIill) * 1099511628211L;
      return (var1 ^ (long)this.iIllilIill) * 1099511628211L;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue59a'))) + '\ud882')) ^ 3010) + var5) ^ 6183))) - var5) - var5) - '쩢') + var5) >>> 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue59a'))) + '\ud882')) ^ 3010) + var5) ^ 6183))) - var5) - var5) - '쩢') + var5) << 8) + var5) + 7518))) << 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue59a'))) + '\ud882')) ^ 3010) + var5) ^ 6183))) - var5) - var5) - '쩢') + var5) >>> 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue59a'))) + '\ud882')) ^ 3010) + var5) ^ 6183))) - var5) - var5) - '쩢') + var5) << 8) + var5) + 7518))) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3388086086353123047L ^ Long.rotateLeft(1206908690440726034L, 42) ^ -357690327757651567L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2786937495528690932L ^ Long.rotateLeft(-1740545812433858319L, 15) ^ 9198935169750770421L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4921360736651251453L ^ Long.rotateLeft(1013818079323690214L, 63) ^ -1066913609358718226L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1778582614469209362L ^ Long.rotateLeft(-6295579753876040571L, 21) ^ 1753379402438982433L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5784288341566597603L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8507693934028432579L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8004122596778560450L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 13039055541990807L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6725664256550915772L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1084274795133301737L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlllIlliIll<invokedynamic>());
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

   public long iIlIlllllill() {
      return this.IIllilIill;
   }

   public long IilliliilIIi() {
      return this.lIllilIill;
   }

   public int lIiiIiIlilli() {
      return this.iIllilIill;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') << 10) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') << 10) << 5) - var5) + 20396))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') << 10) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - var5))) + 7736) ^ 13816) - '쁞') - var5) + var5) + var5) >>> 3) >>> 12) ^ '\ue103') << 10) << 5) - var5) + 20396))) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String liiiIIllIl() {
      return this.iiIlilIill;
   }
}
