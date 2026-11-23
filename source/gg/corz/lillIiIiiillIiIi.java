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

public enum lillIiIiiillIiIi {
   liIiIIiIIi,
   IiIiIIiIIi,
   iiIiIIiIIi;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') << 3 | (char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') >>> 13) ^ var5) << 13 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') << 3 | (char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') >>> 13) ^ var5) >>> 3) + 6443) ^ 'ﰐ'))))) >>> 11 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') << 3 | (char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') >>> 13) ^ var5) << 13 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') << 3 | (char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] ^ 18803) ^ 'ꃣ'))) - var5))) + var5) + 17683))) - '\ue027') >>> 13) ^ var5) >>> 3) + 6443) ^ 'ﰐ'))))) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -280902580040470009L ^ Long.rotateLeft(-6301204887977240325L, 41) ^ -6413674569117028234L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8053023729455132531L ^ Long.rotateLeft(-4914289882354522506L, 40) ^ 2067249504669248630L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5578704513221431535L ^ Long.rotateLeft(-3923180892610750662L, 57) ^ 4917917524077866526L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5976250361388751398L ^ Long.rotateLeft(-5566910212178020306L, 24) ^ -1572064271977183383L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5756780683722150799L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1307145201794672880L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1809206367783314477L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4489070393614986827L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 822688949287955240L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2822871186647629439L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iliIiiliiiii<invokedynamic>());
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) << 2 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) >>> 14) + 'ꥦ') << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) << 2 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) >>> 14) + 'ꥦ') >>> 5) ^ var5) + '메') + var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) << 2 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) >>> 14) + 'ꥦ') << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) << 2 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) ^ var5))))) - 7529))) + var5)) - var5))) - var5) >>> 14) + 'ꥦ') >>> 5) ^ var5) + '메') + var5) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static lillIiIiiillIiIi[] IliIlllilIi() {
      return new lillIiIiiillIiIi[]{IiIiIIiIIi, liIiIIiIIi, iiIiIIiIIi};
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) << 12 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) >>> 4) >>> 8 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) << 12 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) >>> 4) << 8) + var5) << 6 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) << 12 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) >>> 4) >>> 8 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) << 12 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) >>> 12 | (char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ var5) ^ var5))) << 4) + 5963))) >>> 4) << 8) + var5) >>> 10) ^ '읾') ^ '\ue2f6') + var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) << 2 | (char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) >>> 14) + var5))) ^ '솽'))) << 11 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) << 2 | (char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) >>> 14) + var5))) ^ '솽'))) >>> 5) ^ 4376) >>> 8 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) << 2 | (char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) >>> 14) + var5))) ^ '솽'))) << 11 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) << 2 | (char)((char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) << 14 | (char)((char)(-((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))))) ^ 20911) >>> 2) >>> 14) + var5))) ^ '솽'))) >>> 5) ^ 4376) << 8) - '辤'))) + var5))) - '\uf632') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) >>> 8))) ^ var5) ^ 4928))) >>> 7 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) >>> 8))) ^ var5) ^ 4928))) << 9))) << 9 | (char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) >>> 8))) ^ var5) ^ 4928))) >>> 7 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) << 5 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + 27478) >>> 11) + 31753))) + 2394) ^ var5) ^ var5) ^ 18446) ^ var5) + 2556) >>> 8))) ^ var5) ^ 4928))) << 9))) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
