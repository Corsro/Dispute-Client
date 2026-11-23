package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class iiIillilIIlillil {
   final float llIIlIIlil;
   final String iiIIlIIlil;
   final String[] IIiiIIIlil;
   final float liiiIIIlil;
   final String lIlIlIIlil;
   final String ilIIlIIlil;
   final String IiIIlIIlil;
   final float iiiiIIIlil;
   final String[] iIiiIIIlil;
   final llililIlilililIl illiIIIlil;
   final String IllIlIIlil;
   final long liliIIIlil;
   final llililIlilililIl llliIIIlil;
   final long[] IiiiIIIlil;
   final String[] iliiIIIlil;
   final String iIlIlIIlil;
   final String liIIlIIlil;
   final llIIIIlilIIIIl IiliIIIlil;
   final float iIIIlIIlil;
   final int iiliIIIlil;
   final String[] IliiIIIlil;
   final float IIIIlIIlil;
   final float IlIIlIIlil;
   final String lllIlIIlil;
   final float lIIIlIIlil;
   final String[] lliiIIIlil;
   final String IIlIlIIlil;
   final String[] lIiiIIIlil;

   String IliIlllilIi(int secs, long i) {
      if (this.IiiiIIIlil[secs] != i || this.iliiIIIlil[secs] == null) {
         this.IiiiIIIlil[secs] = i;
         this.iliiIIIlil[secs] = iIIiIiilIlIiIiil.iIlIlllllill(i);
      }

      return this.iliiIIIlil[secs];
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) >>> 9) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) >>> 9) >>> 11) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) >>> 9) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 28285) - 21055) << 9 | (char)((char)(var4[var5] ^ 28285) - 21055) >>> 7) - var5) << 12) - var5) >>> 9) >>> 11) << 4))) ^ 32046));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) << 1 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) >>> 15) + 25191))) - '\ue90e'))) - var5) - 'ꌌ') << 11 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) << 1 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) >>> 15) + 25191))) - '\ue90e'))) - var5) - 'ꌌ') >>> 5))) ^ var5) + 4057) << 7 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) << 1 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) >>> 15) + 25191))) - '\ue90e'))) - var5) - 'ꌌ') << 11 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) << 1 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ 30822) >>> 15) + 25191))) - '\ue90e'))) - var5) - 'ꌌ') >>> 5))) ^ var5) + 4057) >>> 9) - '쥖') ^ 9800) - 'ꋖ') - 23381));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1909463441229969778L ^ Long.rotateLeft(-4546401407517668863L, 2) ^ -6735783255824288976L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 228735480333620839L ^ Long.rotateLeft(4044976756235753875L, 44) ^ -6817232684452885021L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2187584665786386062L ^ Long.rotateLeft(-4430173297739297918L, 48) ^ -8904589136410837459L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1133193176950070417L ^ Long.rotateLeft(-9221457946906968276L, 15) ^ -2875066868675035153L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 447974246729509743L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6535553330287369145L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2089053078172006754L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3190087544744351337L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5817516415271400576L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6556499939390865235L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIlIlllllill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IilliliilIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIiiIiIlilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iliIiiliiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIllIIliIIl<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) << 3 | (char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) >>> 13) << 8 | (char)((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) << 3 | (char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) >>> 13) >>> 8) - '\ue40b') ^ 14485))) ^ '썁') >>> 14 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) << 3 | (char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) >>> 13) << 8 | (char)((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) << 3 | (char)((char)((char)(var4[var5] ^ var5) - var5) >>> 15 | (char)((char)(var4[var5] ^ var5) - var5) << 1) >>> 13) >>> 8) - '\ue40b') ^ 14485))) ^ '썁') << 2))) - '눼') + '껠') + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) << 5) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) << 5) >>> 2))) - 14515))) + var5) - 4146))) << 9 | (char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) << 5) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) >>> 14 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) >>> 13 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) << 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 11) << 3) << 2) ^ 16223) << 5) >>> 2))) - 14515))) + var5) - 4146))) >>> 7) - 1081) - '낂')))) - '넜'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   iiIillilIIlillil(llililIlilililIl sec, llililIlilililIl scan, llIIIIlilIIIIl nowMs, long raw, long rules) {
      long var18 = -1621513353287671581L;
      super();
      this.llliIIIlil = sec;
      this.illiIIIlil = scan;
      this.IiliIIIlil = nowMs;
      this.liliIIIlil = raw;
      List var8 = scan.iIlIlllllill();
      this.iiliIIIlil = var8.size();
      this.IIiiIIIlil = new String[this.iiliIIIlil];
      this.lIiiIIIlil = new String[this.iiliIIIlil];
      this.iIiiIIIlil = new String[this.iiliIIIlil];
      this.IliiIIIlil = new String[this.iiliIIIlil];
      this.lliiIIIlil = new String[this.iiliIIIlil];
      this.iliiIIIlil = new String[this.iiliIIIlil];
      this.IiiiIIIlil = new long[this.iiliIIIlil];
      Arrays.fill(this.IiiiIIIlil, -1L);
      float var9 = 0.82F;
      float var10 = 0.0F;
      float var11 = 0.0F;
      float var12 = 0.0F;
      float var13 = 0.0F;
      float var14 = 0.0F;
      float var15 = Math.max(lIlIIIliIlIIIl.IIlllIlliIll(liiiIIllIl<invokedynamic>(), var9), lIlIIIliIlIIIl.IIlllIlliIll(liiiIIllIl<invokedynamic>(), var9));

      for(long var20 = var18 ^ (0L ^ var18) & -1L << 32; (int)(var20 >>> 32) < this.iiliIIIlil; var20 += 4294967296L) {
         IiIillIlliIillIl var17 = (IiIillIlliIillIl)var8.get((int)(var20 >>> 32));
         this.IIiiIIIlil[(int)(var20 >>> 32)] = Integer.toString((int)(var20 >>> 32) + 1);
         this.lIiiIIIlil[(int)(var20 >>> 32)] = llIIlIllilIIlIll.Illlilllli(var17.iliIiiliiiii());
         this.iIiiIIIlil[(int)(var20 >>> 32)] = iiiiiliIIIIIii.iliIiiliiiii(var17, scan.IIillIiliIil(), rules);
         this.IliiIIIlil[(int)(var20 >>> 32)] = Math.round(Math.max((double)0.0F, Math.min((double)1.0F, var17.IiIlliIliiIl())) * (double)100.0F) + liiiIIllIl<invokedynamic>();
         this.lliiIIIlil[(int)(var20 >>> 32)] = Integer.toString(var17.iIlIlllllill());
         var10 = Math.max(var10, lIlIIIliIlIIIl.IIlllIlliIll(this.IIiiIIIlil[(int)(var20 >>> 32)], var9));
         var11 = Math.max(var11, lIlIIIliIlIIIl.IIlllIlliIll(this.lIiiIIIlil[(int)(var20 >>> 32)], var9));
         var12 = Math.max(var12, lIlIIIliIlIIIl.IIlllIlliIll(this.iIiiIIIlil[(int)(var20 >>> 32)], var9));
         var13 = Math.max(var13, lIlIIIliIlIIIl.IIlllIlliIll(this.IliiIIIlil[(int)(var20 >>> 32)], var9));
         var14 = Math.max(var14, lIlIIIliIlIIIl.IIlllIlliIll(this.lliiIIIlil[(int)(var20 >>> 32)], var9));
         var15 = Math.max(var15, lIlIIIliIlIIIl.IIlllIlliIll(iIIiIiilIlIiIiil.iIlIlllllill(var17.IlIlllIlilIl()), var9));
      }

      this.liiiIIIlil = (float)Math.ceil((double)var10);
      this.iiiiIIIlil = (float)Math.ceil((double)var11);
      this.IIIIlIIlil = (float)Math.ceil((double)var12);
      this.lIIIlIIlil = (float)Math.ceil((double)var13);
      this.iIIIlIIlil = (float)Math.ceil((double)var14);
      this.IlIIlIIlil = (float)Math.ceil((double)var15);
      IiIillIlliIillIl var16 = scan.IliIlllilIi();
      if (var16 != null) {
         this.ilIIlIIlil = liiiIIllIl<invokedynamic>() + this.iIiiIIIlil[0];
      } else if (!scan.Iilllilliill()) {
         this.ilIIlIIlil = liiiIIllIl<invokedynamic>();
      } else if (scan.lIiiIiIlilli() == 0 && scan.IIIllIIliIIl() > 0) {
         this.ilIIlIIlil = liiiIIllIl<invokedynamic>();
      } else if (scan.lIiiIiIlilli() == 0 && scan.iliIiiliiiii() > 0) {
         this.ilIIlIIlil = liiiIIllIl<invokedynamic>();
      } else if (scan.lIiiIiIlilli() == 0) {
         this.ilIIlIIlil = liiiIIllIl<invokedynamic>();
      } else {
         this.ilIIlIIlil = liiiIIllIl<invokedynamic>();
      }

      this.IiIIlIIlil = liiiIIllIl<invokedynamic>() + scan.liiiIIllIl().IliIlllilIi().toUpperCase(Locale.ROOT);
      this.liIIlIIlil = var16 == null ? "" : liiiIIllIl<invokedynamic>() + this.lIiiIIIlil[0];
      this.iiIIlIIlil = var16 == null ? "" : liiiIIllIl<invokedynamic>() + this.lIiiIIIlil[0];
      this.llIIlIIlil = var16 == null ? 0.0F : (float)Math.ceil((double)Math.max(Math.max(lIlIIIliIlIIIl.IIlllIlliIll(this.liIIlIIlil, var9), lIlIIIliIlIIIl.IIlllIlliIll(this.iiIIlIIlil, var9)), lIlIIIliIlIIIl.IIlllIlliIll(liiiIIllIl<invokedynamic>(), var9))) + 18.0F;
      this.IIlIlIIlil = Integer.toString(scan.iliIiiliiiii());
      this.lIlIlIIlil = Integer.toString(scan.IIIllIIliIIl());
      this.iIlIlIIlil = Integer.toString(scan.IlIlllIlilIl());
      this.IllIlIIlil = Integer.toString(scan.IiIlliIliiIl());
      this.lllIlIIlil = Integer.toString(scan.IIlllIlliIll());
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) << 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) >>> 12) - 29756) ^ 6501) - 110) - '蕴') << 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) << 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) >>> 12) - 29756) ^ 6501) - 110) - '蕴') >>> 14) - '똻'))) ^ var5) ^ var5) << 9 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) << 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) >>> 12) - 29756) ^ 6501) - 110) - '蕴') << 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) << 4 | (char)((char)(~((char)((char)((char)(var4[var5] ^ 'ꌒ') << 11 | (char)(var4[var5] ^ 'ꌒ') >>> 5) ^ var5))) ^ var5) >>> 12) - 29756) ^ 6501) - 110) - '蕴') >>> 14) - '똻'))) ^ var5) ^ var5) >>> 7) - '\ue953'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
