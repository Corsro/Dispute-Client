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

public enum IiIililiIili {
   IlIiiIlIlllIiiIlIl,
   IIliiIlIllIliiIlIl,
   liIiiIlIliiIiiIlIl,
   ilIiiIlIlIiIiiIlIl;

   // $FF: synthetic method
   private static IiIililiIili[] IliIlllilIi() {
      return new IiIililiIili[]{IlIiiIlIlllIiiIlIl, ilIiiIlIlIiIiiIlIl, liIiiIlIliiIiiIlIl, IIliiIlIllIliiIlIl};
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) << 7 | (char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) >>> 9) + 15913) + 26943) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) << 7 | (char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) >>> 9) + 15913) + 26943) << 8) - var5))) - var5))) - '꼘') + '튧') >>> 7 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) << 7 | (char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) >>> 9) + 15913) + 26943) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) << 7 | (char)((char)(var4[var5] - '鏲') << 15 | (char)(var4[var5] - '鏲') >>> 1) >>> 9) + 15913) + 26943) << 8) - var5))) - var5))) - '꼘') + '튧') << 9) + var5) - 'ﾷ') ^ var5))) + var5) - '괭'));
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
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '꒽') ^ '\ue2ab') - var5) ^ 11607) + var5) - 16906) - 10708) - var5) ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '꒽') ^ '\ue2ab') - var5) ^ 11607) + var5) - 16906) - 10708) - var5) ^ var5))) + var5))) << 8))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6755092788971374825L ^ Long.rotateLeft(-5385714793996469052L, 13) ^ 6190229452910812831L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3910154340758455601L ^ Long.rotateLeft(8450206755826807950L, 24) ^ -8151790245097196529L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4628910981967284000L ^ Long.rotateLeft(-8605115581139958709L, 6) ^ -8388279129884577665L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1004115749049114010L ^ Long.rotateLeft(-5652388669400403573L, 50) ^ 5279365910260735610L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8071694637201735358L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -144079899686963627L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8703382273704207909L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -9170336157052644174L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7416833704001770249L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6474724325425693939L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iliIiiliiiii<invokedynamic>());
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
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 4 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 12) ^ var5) + 28941) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 4 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 12) ^ var5) + 28941) << 9) - '襕') - var5) + var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 4 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 12) ^ var5) + 28941) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 4 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 12) ^ var5) + 28941) << 9) - '襕') - var5) + var5) << 7))) ^ var5))) + 4886));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) << 11 | (char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) >>> 5) >>> 10 | (char)((char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) << 11 | (char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) >>> 5) << 6) - 2099) - var5))) << 9 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) << 11 | (char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) >>> 5) >>> 10 | (char)((char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) << 11 | (char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14) >>> 5) << 6) - 2099) - var5))) >>> 7) - var5) + 31861));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 424) - var5) + 20268))))) << 11 | (char)(~((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 424) - var5) + 20268))))) >>> 5) ^ '\ua7ee'))) ^ var5) ^ var5) ^ var5) ^ 14923) + '\ud907'))))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
