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
import net.minecraft.class_2960;
import net.minecraft.class_3414;

public enum IiIIlIiliIIlIi {
   lIlliIIiiiIlliIIii(liiiIIllIl<invokedynamic>(), 5584530L);

   final class_3414 IllliIIiilllliIIii;
   iiIliIIiiIIlliIIii(liiiIIllIl<invokedynamic>(), 5997915L);

   final long illliIIiiIilliIIii;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) ^ 24831) + '蘑') + var5))) ^ 5993))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2525608526121804703L ^ Long.rotateLeft(5473923100280967013L, 52) ^ -7189880397411355083L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6304407556378355109L ^ Long.rotateLeft(3805718120885580042L, 1) ^ 5531647130191166108L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9174723939677346943L ^ Long.rotateLeft(-6033305584836038518L, 20) ^ -4556015758547116729L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -199507280482287251L ^ Long.rotateLeft(8886227573358801445L, 60) ^ 2221720048070861117L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8236301533328642891L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4858541206511513661L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 9010827577126537155L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5158771402281051484L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8256689560325377504L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2020762709156191669L;
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) << 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) >>> 4) + '逅') - var5) - 'ﾍ') >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) << 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) >>> 4) + '逅') - var5) - 'ﾍ') << 8) - 32050))) << 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) << 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) >>> 4) + '逅') - var5) - 'ﾍ') >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) << 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) << 15 | (char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 9 | (char)(var4[var5] ^ var5) << 7) + var5))))) >>> 1) >>> 4) + '逅') - var5) - 'ﾍ') << 8) - 32050))) >>> 15) - var5) ^ '耨') - 'ꃍ') - '遘'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IiIIlIiliIIlIi(String var3, long var4) {
      this.IllliIIiilllliIIii = class_3414.method_47908(class_2960.method_60655(liiiIIllIl<invokedynamic>(), var3));
      this.illliIIiiIilliIIii = var4;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) - 29264))) - var5) + var5) + var5) - var5) + var5) ^ '謸') ^ 5807));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) << 7 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) >>> 9) ^ '뽟') ^ 26481))))) + '뵘') ^ var5) + var5) >>> 13 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) << 7 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) >>> 9) ^ '뽟') ^ 26481))))) + '뵘') ^ var5) + var5) << 3) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) << 7 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) >>> 9) ^ '뽟') ^ 26481))))) + '뵘') ^ var5) + var5) >>> 13 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) << 7 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - '\udadc'))) << 13 | (char)(-((char)(var4[var5] - '\udadc'))) >>> 3) + var5) - '껲') - var5) >>> 9) ^ '뽟') ^ 26481))))) + '뵘') ^ var5) + var5) << 3) ^ var5) >>> 10) ^ 26889) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static IiIIlIiliIIlIi[] IliIlllilIi() {
      return new IiIIlIiliIIlIi[]{iiIliIIiiIIlliIIii, lIlliIIiiiIlliIIii};
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 6634) + '젅') << 14 | (char)((char)(var4[var5] - 6634) + '젅') >>> 2) - var5) << 15 | (char)((char)((char)((char)(var4[var5] - 6634) + '젅') << 14 | (char)((char)(var4[var5] - 6634) + '젅') >>> 2) - var5) >>> 1) + var5) - 31103) << 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 6634) + '젅') << 14 | (char)((char)(var4[var5] - 6634) + '젅') >>> 2) - var5) << 15 | (char)((char)((char)((char)(var4[var5] - 6634) + '젅') << 14 | (char)((char)(var4[var5] - 6634) + '젅') >>> 2) - var5) >>> 1) + var5) - 31103) >>> 5) - 24919) - var5) ^ '蛖') - var5) + var5) ^ var5))) ^ var5))) + 20166));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
