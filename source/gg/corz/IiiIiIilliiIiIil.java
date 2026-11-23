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

public enum IiiIiIilliiIiIil {
   IlIIIilIil,
   llIIIilIil,
   ilIIIilIil,
   IiIIIilIil,
   iIIIIilIil;

   // $FF: synthetic method
   private static IiiIiIilliiIiIil[] IliIlllilIi() {
      return new IiiIiIilliiIiIil[]{iIIIIilIil, IlIIIilIil, llIIIilIil, ilIIIilIil, IiIIIilIil};
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1394438082628195734L ^ Long.rotateLeft(2719378389824982327L, 59) ^ 1339229532065680308L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8985711764806075330L ^ Long.rotateLeft(-8092884539917163929L, 47) ^ 8210985263426414874L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8875644465134558266L ^ Long.rotateLeft(-44692983037691467L, 49) ^ -1887683381352948829L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8588021912373418047L ^ Long.rotateLeft(6859878077829395949L, 28) ^ -9196226379093356965L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3881446965261794039L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1008979669293850775L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4819626136904280580L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4965830593196198194L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 9018756155839394715L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7128497422552506222L;
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
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 9250) ^ var5) + 12066) >>> 10 | (char)((char)((char)((char)(var4[var5] - var5) ^ 9250) ^ var5) + 12066) << 6))))))))) ^ var5) ^ 20050))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) ^ var5) - var5) << 7 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) ^ var5) - var5) >>> 9) ^ var5) - var5) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) ^ var5) - var5) << 7 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + var5) ^ var5) - var5) >>> 9) ^ var5) - var5) >>> 5) + 20745) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) - 22020) ^ 15704) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) + var5) - 22020) ^ 15704) << 12))) + var5) ^ var5) - var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) - 22020) ^ 15704) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) + var5) - 22020) ^ 15704) << 12))) + var5) ^ var5) - var5) << 7) - '묱'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') << 8))))) << 7 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') << 8))))) >>> 9))) - var5) + var5) + var5) << 8 | (char)((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') << 8))))) << 7 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) << 6 | (char)((char)((char)(var4[var5] + 11974) ^ var5) + var5) >>> 10) - '\uddbf') - var5) + 'ꔭ') + var5) - '쀱') << 8))))) >>> 9))) - var5) + var5) + var5) >>> 8) ^ 9641));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) >>> 12) >>> 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) >>> 12) << 5)) + '\ue2c0') + '넘'))))) >>> 15 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) >>> 12) >>> 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 11 | (char)(~var4[var5]) << 5) - 32688) ^ 475) ^ var5) - var5))) ^ 20358) >>> 12) << 5)) + '\ue2c0') + '넘'))))) << 1) + var5) + '\ue4c5'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
