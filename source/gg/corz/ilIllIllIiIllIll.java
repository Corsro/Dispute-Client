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

public record ilIllIllIiIllIll(long componentKey, int componentSize, long assetSetHash, int strategy) {
   private final long liiliillll;
   private final int iiiliillll;
   private final int Iiiliillll;
   private final long ililiillll;

   public ilIllIllIiIllIll(long assetSetHash, int strategy, long componentSize, int componentKey) {
      this.ililiillll = assetSetHash;
      this.Iiiliillll = strategy;
      this.liiliillll = componentSize;
      this.iiiliillll = componentKey;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7749996152042618665L ^ Long.rotateLeft(4090525256543303991L, 51) ^ 7871336990531615820L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5417119554219327189L ^ Long.rotateLeft(-435941940878043625L, 27) ^ -2634484055107146705L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8270491422714619857L ^ Long.rotateLeft(3947269542637951154L, 44) ^ -8427714859593487182L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7875441009043285066L ^ Long.rotateLeft(2102369742741585189L, 29) ^ -4597196019642720162L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3437050045707465918L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -818049202908875729L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8783816628185934787L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6828046214061822679L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8511634735274282617L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2955984523870869925L;
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

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) >>> 10 | (char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) << 6) << 11 | (char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) >>> 10 | (char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) << 6) >>> 5) + 'ꎶ') << 11 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) >>> 10 | (char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) << 6) << 11 | (char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) >>> 10 | (char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 19108) >>> 5 | (char)(var4[var5] - 19108) << 11) ^ 11803) + var5) - var5))) ^ '\uf2b3'))) + var5))) ^ var5) << 6) >>> 5) + 'ꎶ') >>> 5) - '욵') - 14991));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long liiiIIllIl() {
      return this.ililiillll;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 2 | (char)(var4[var5] + var5) >>> 14) ^ 11538) ^ '躱') << 1 | (char)((char)((char)((char)(var4[var5] + var5) << 2 | (char)(var4[var5] + var5) >>> 14) ^ 11538) ^ '躱') >>> 15) + var5))) ^ 25546) - var5) ^ var5) << 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 2 | (char)(var4[var5] + var5) >>> 14) ^ 11538) ^ '躱') << 1 | (char)((char)((char)((char)(var4[var5] + var5) << 2 | (char)(var4[var5] + var5) >>> 14) ^ 11538) ^ '躱') >>> 15) + var5))) ^ 25546) - var5) ^ var5) >>> 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      return String.format(Locale.ROOT, iliIiiliiiii<invokedynamic>(), this.ililiillll, this.Iiiliillll, Long.toUnsignedString(this.liiliillll, 16), this.iiiliillll);
   }

   public int iIlIlllllill() {
      return this.Iiiliillll;
   }

   public long IilliliilIIi() {
      return this.liiliillll;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) + var5))) - 3205))) - '議') ^ var5) + var5) - var5) ^ '\ue358') + '柳') ^ var5) + var5)))) << 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) + var5))) - 3205))) - '議') ^ var5) + var5) - var5) ^ '\ue358') + '柳') ^ var5) + var5)))) >>> 13) << 2 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) + var5))) - 3205))) - '議') ^ var5) + var5) - var5) ^ '\ue358') + '柳') ^ var5) + var5)))) << 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) + var5))) - 3205))) - '議') ^ var5) + var5) - var5) ^ '\ue358') + '柳') ^ var5) + var5)))) >>> 13) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli() {
      return this.iiiliillll;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 10791) - var5))) + 10779) ^ var5) + var5) - var5))) + '짛') >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 10791) - var5))) + 10779) ^ var5) + var5) - var5))) + '짛') << 1) - 24745) + var5) - var5) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 10791) - var5))) + 10779) ^ var5) + var5) - var5))) + '짛') >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 10791) - var5))) + 10779) ^ var5) + var5) - var5))) + '짛') << 1) - 24745) + var5) - var5) >>> 4) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) >>> 6) - var5) << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) >>> 6) - var5) >>> 5) - '턟') << 9 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) >>> 6) - var5) << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) << 10 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) >>> 3 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ 1363) ^ var5) ^ var5) ^ var5))) << 13) >>> 6) - var5) >>> 5) - '턟') >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
