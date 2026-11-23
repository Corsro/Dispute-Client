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

enum IllIIIllllIIIl {
   IIlliIiIllIlliIiIl,
   iIlliIiIlIllliIiIl,
   lllliIiIlillliIiIl;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') << 8 | (char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') >>> 8) ^ var5))) ^ var5) - var5) ^ '\ue11c') + var5) << 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') << 8 | (char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') >>> 8) ^ var5))) ^ var5) - var5) ^ '\ue11c') + var5) >>> 5) - '훁') << 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') << 8 | (char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') >>> 8) ^ var5))) ^ var5) - var5) ^ '\ue11c') + var5) << 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') << 8 | (char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 9 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 7) + 28633) - 'ﺿ') >>> 8) ^ var5))) ^ var5) - var5) ^ '\ue11c') + var5) >>> 5) - '훁') >>> 10) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) >>> 1 | (char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) << 15))))) ^ 5552) + var5) >>> 14 | (char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) >>> 1 | (char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) << 15))))) ^ 5552) + var5) << 2))) >>> 11 | (char)(-((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) >>> 1 | (char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) << 15))))) ^ 5552) + var5) >>> 14 | (char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) >>> 1 | (char)(~((char)((char)((char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) >>> 12 | (char)((char)(~var4[var5]) << 2 | (char)(~var4[var5]) >>> 14) << 4) - 16158))) << 15))))) ^ 5552) + var5) << 2))) << 5)) ^ '쌖'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2748536981472832001L ^ Long.rotateLeft(3834941836211521870L, 41) ^ 8625903904213405617L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2439520258362971814L ^ Long.rotateLeft(-7975356742752638428L, 24) ^ -1672415695456496629L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8026264755744620892L ^ Long.rotateLeft(-2631545462953768162L, 31) ^ 4887585554214224559L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5124220608860029820L ^ Long.rotateLeft(9092897599272354561L, 50) ^ -6761082198629198818L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3678633753489859486L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1855412504147264433L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2123730375382601793L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2080051126556185772L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7844321560181560689L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 235407262053893099L;
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
   private static IllIIIllllIIIl[] IliIlllilIi() {
      return new IllIIIllllIIIl[]{IIlliIiIllIlliIiIl, iIlliIiIlIllliIiIl, lllliIiIlillliIiIl};
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(-((char)(-((char)(~((char)(var4[var5] + var5))))))) - var5))))) ^ var5))) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) << 3 | (char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) >>> 13) << 10 | (char)((char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) << 3 | (char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) >>> 13) >>> 6) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) << 3 | (char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) >>> 13) << 10 | (char)((char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) << 3 | (char)((char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) >>> 1 | (char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 9 | (char)((char)(var4[var5] - var5) ^ var5) << 7) + 14872) + var5) << 2) + 8))))))))) << 15) + var5) >>> 13) >>> 6) - var5) << 11) ^ '釢') ^ 13219));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '꣗') ^ var5) << 9 | (char)((char)((char)(var4[var5] - var5) + '꣗') ^ var5) >>> 7) + '隝') << 11 | (char)((char)((char)((char)((char)(var4[var5] - var5) + '꣗') ^ var5) << 9 | (char)((char)((char)(var4[var5] - var5) + '꣗') ^ var5) >>> 7) + '隝') >>> 5) + 24419))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
