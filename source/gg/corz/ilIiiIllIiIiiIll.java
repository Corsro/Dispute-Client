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

final class ilIiiIllIiIiiIll {
   volatile long IiliIiilll;
   volatile lllIlIlillIlIl illiIiilll;
   final lIIllIiiIIllIi lIliIiilll;
   final class_2960 iIliIiilll;
   final illIIlllIilIIlll IIliIiilll;
   long iiliIiilll;
   final class_2960 IlliIiilll;
   volatile boolean liliIiilll;
   volatile int llliIiilll = 0;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) >>> 10 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) << 6) >>> 5 | (char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) >>> 10 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) << 6) << 11) - 17574) - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) >>> 10 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) << 6) >>> 5 | (char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) >>> 10 | (char)((char)((char)(~((char)((char)(var4[var5] ^ var5) - 9824))) + var5) - var5) << 6) << 11) - 17574) - var5) >>> 7)));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) << 15 | (char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) >>> 1) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) << 15 | (char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) >>> 1) << 6) + var5) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) << 15 | (char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) >>> 1) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) << 15 | (char)((char)((char)((char)(var4[var5] + var5) + '뒧') + var5) ^ var5) >>> 1) << 6) + var5) >>> 15)) - var5) ^ var5) + var5) + '胣'));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) >>> 9 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) << 7) ^ 4028))) - var5) - var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) >>> 9 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) << 7) ^ 4028))) - var5) - var5) << 5) - 13461) ^ 18760))) >>> 6 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) >>> 9 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) << 7) ^ 4028))) - var5) - var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) >>> 9 | (char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) << 5 | (char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) >>> 11))) ^ var5) << 8) << 7) ^ 4028))) - var5) - var5) << 5) - 13461) ^ 18760))) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3444903304187331858L ^ Long.rotateLeft(-1039354859302371938L, 36) ^ 7796053337619157312L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7675100236208441934L ^ Long.rotateLeft(435178491440052370L, 15) ^ 6271879737801620341L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6618810143508029822L ^ Long.rotateLeft(-8906897362788311682L, 6) ^ 8925566518485765713L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -402922553885736625L ^ Long.rotateLeft(-6252782097779777385L, 57) ^ 4557281333624274783L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3798476372500095911L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1450125104893209341L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -262472662686385302L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7549497946908896404L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4579826368232561840L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8323086616296848760L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) << 2 | (char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) >>> 14) + var5) ^ var5) - 'ꐵ'))) ^ var5) << 14 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) << 2 | (char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) >>> 14) + var5) ^ var5) - 'ꐵ'))) ^ var5) >>> 2) >>> 5 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) << 2 | (char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) >>> 14) + var5) ^ var5) - 'ꐵ'))) ^ var5) << 14 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) << 2 | (char)(~((char)((char)(var4[var5] ^ '숯') - 28465))) >>> 14) + var5) ^ var5) - 'ꐵ'))) ^ var5) >>> 2) << 11) + var5) ^ 17701) - var5) ^ var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 5 | (char)(-var4[var5]) >>> 11) ^ '\ue83e') ^ var5) - '첒') + 28866) >>> 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) << 5 | (char)(-var4[var5]) >>> 11) ^ '\ue83e') ^ var5) - '첒') + 28866) << 8) ^ 27287) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 5 | (char)(-var4[var5]) >>> 11) ^ '\ue83e') ^ var5) - '첒') + 28866) >>> 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) << 5 | (char)(-var4[var5]) >>> 11) ^ '\ue83e') ^ var5) - '첒') + 28866) << 8) ^ 27287) >>> 11) ^ '駪'))) ^ var5))) - '龗') ^ var5))) ^ 1110));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   ilIiiIllIiIiiIll(illIIlllIilIIlll rig, lIIllIiiIIllIi finish) {
      this.IIliIiilll = rig;
      this.lIliIiilll = finish;
      String var3 = IliIlllilIi<invokedynamic>() + iiiIIlllIIIlIlll.IliIlllilIi(rig.IiIlliIliiIl(0).IliIlllilIi()) + IliIlllilIi<invokedynamic>() + iiiIIlllIIIlIlll.IliIlllilIi(finish.lIiIllIiiiIiIllIii);
      this.iIliIiilll = class_2960.method_60655(IliIlllilIi<invokedynamic>(), var3);
      this.IlliIiilll = class_2960.method_60655(IliIlllilIi<invokedynamic>(), var3 + IliIlllilIi<invokedynamic>());
   }
}
