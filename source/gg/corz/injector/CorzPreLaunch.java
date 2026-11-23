package gg.corz.injector;

import gg.corz.IilliliilIIi;
import gg.corz.injector.bootstrap.PayloadBootstrap;
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
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public final class CorzPreLaunch implements PreLaunchEntrypoint {
   public void onPreLaunch() {
      IilliliilIIi.IliIlllilIi();

      try {
         PayloadBootstrap.initializeFromProperties();
         IilliliilIIi.iIlIlllllill();
      } catch (Throwable var3) {
         IilliliilIIi.IilliliilIIi(var3);
         if (var3 instanceof RuntimeException var4) {
            throw var4;
         } else if (var3 instanceof Error var2) {
            throw var2;
         } else {
            throw new RuntimeException(IliIlllilIi<invokedynamic>(), var3);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) >>> 7) << 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) >>> 7) >>> 5) ^ '\ue414') - var5) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) >>> 7) << 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) ^ '\uf54f') ^ var5) ^ var5) + '뒚'))) - var5) + 13793) - '萔') - '貏') + 7599) << 15))) >>> 7) >>> 5) ^ '\ue414') - var5) ^ var5) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') << 11 | (char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') >>> 5) + var5) >>> 6 | (char)((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') << 11 | (char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') >>> 5) + var5) << 10))) ^ var5))) - var5) >>> 15 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') << 11 | (char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') >>> 5) + var5) >>> 6 | (char)((char)((char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') << 11 | (char)((char)((char)(~((char)(-((char)(-var4[var5]))))) ^ var5) - '횣') >>> 5) + var5) << 10))) ^ var5))) - var5) << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) + var5) << 5 | (char)((char)(var4[var5] << 8 | var4[var5] >>> 8) + var5) >>> 11) ^ var5) ^ 8009) + var5))))) ^ 5136) ^ 21638) >>> 15 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) + var5) << 5 | (char)((char)(var4[var5] << 8 | var4[var5] >>> 8) + var5) >>> 11) ^ var5) ^ 8009) + var5))))) ^ 5136) ^ 21638) << 1))))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) << 13) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) << 13) + var5) >>> 9) ^ var5))) ^ '즏'))))) + 2374))) + '鬲') - '뻐') >>> 11 | (char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) << 13) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) >>> 10 | (char)((char)((char)((char)(var4[var5] ^ 32052) + 27425) + var5) - var5) << 6) << 13) + var5) >>> 9) ^ var5))) ^ '즏'))))) + 2374))) + '鬲') - '뻐') << 5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) << 4) ^ 9000) >>> 13 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) << 4) ^ 9000) << 3) + '봨'))) - var5))))) << 12 | (char)(~((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) << 4) ^ 9000) >>> 13 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ 9110) - var5))) << 4) ^ 9000) << 3) + '봨'))) - var5))))) >>> 4) - var5) - 31064));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6726847370301140715L ^ Long.rotateLeft(-8711284561717147191L, 56) ^ 3549453867079818475L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 668942295124315872L ^ Long.rotateLeft(320864295988758020L, 16) ^ -4239309568588782260L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3337963273866671219L ^ Long.rotateLeft(4307642006239588495L, 63) ^ -5649080284553895444L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -962419565762054182L ^ Long.rotateLeft(9001209577923755017L, 49) ^ 1866186268446390061L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8510730367554323891L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6748012233878757984L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 109163006221948237L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3681671873759629331L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5172984733947768626L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1969888777047149949L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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
