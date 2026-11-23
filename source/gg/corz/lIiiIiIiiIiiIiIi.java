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

final class lIiiIiIiiIiiIiIi {
   final String IliliIiIIi;
   final llliiIllilliiIll lllliIiIIi;
   final String iIlliIiIIi;
   final String IIiliIiIIi;
   final llIillililIillil IIlliIiIIi;
   final String lliliIiIIi;
   final IilliIllilliIl IllliIiIIi;
   final String[] illliIiIIi;
   final String lIlliIiIIi;
   final String lIiliIiIIi;
   final String iilliIiIIi;
   final boolean IilliIiIIi;
   float liiliIiIIi;
   final String lilliIiIIi;
   final String ililiIiIIi;
   boolean IiiliIiIIi;
   final String iIiliIiIIi;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 15 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 1) << 8 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 15 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 1) >>> 8))) + var5))))) ^ 133) - '챪') - var5) - '\uf11b') << 8 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 15 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 1) << 8 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 15 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 1) >>> 8))) + var5))))) ^ 133) - '챪') - var5) - '\uf11b') >>> 8) + 3205));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') << 14 | (char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') >>> 2))) - '\ue69c') - var5) ^ 11550) << 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') << 14 | (char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') >>> 2))) - '\ue69c') - var5) ^ 11550) >>> 9) + '躌') + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') << 14 | (char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') >>> 2))) - '\ue69c') - var5) ^ 11550) << 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') << 14 | (char)((char)((char)((char)(var4[var5] ^ '럃') + var5) >>> 1 | (char)((char)(var4[var5] ^ '럃') + var5) << 15) - '꩐') >>> 2))) - '\ue69c') - var5) ^ 11550) >>> 9) + '躌') + var5) + var5) << 10) - var5) - '\ued63'))) + 23004) ^ 11025));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -316751870643559843L ^ Long.rotateLeft(-5924566267127037549L, 26) ^ -1559741166314603091L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6275089650659641279L ^ Long.rotateLeft(7363548046113572264L, 58) ^ 5457575447676447987L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8227306429778924555L ^ Long.rotateLeft(-3087931961987467475L, 22) ^ -8432782555500754232L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2629647767533073616L ^ Long.rotateLeft(-4001826498843898009L, 62) ^ 1739511650020145686L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2347798227176834007L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5665160648064418175L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1459646394609764019L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3035710323957211711L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8595635881377094888L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3079451015197244447L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5))) + 32503) ^ '뻧'))))) - 'ꋭ') ^ 31997))) + var5) + var5) + 11120) >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5))) + 32503) ^ '뻧'))))) - 'ꋭ') ^ 31997))) + var5) + var5) + 11120) << 9) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) >>> 5) << 5 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) >>> 5) >>> 11) << 8 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) >>> 5) << 5 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) >>> 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') >>> 15 | (char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) - '뗄') << 1) - '阾'))))) << 1) + var5) >>> 5) >>> 11) >>> 8));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\ue997') ^ '萋') << 8 | (char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\ue997') ^ '萋') >>> 8) + '蕰') - var5) ^ var5) - 23454) ^ 14012))) - 26515) + '\ud851'))) << 15 | (char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\ue997') ^ '萋') << 8 | (char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\ue997') ^ '萋') >>> 8) + '蕰') - var5) ^ var5) - 23454) ^ 14012))) - 26515) + '\ud851'))) >>> 1) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   lIiiIiIiiIiiIiIi(String label, llIillililIillil picker, String setting, String key, IilliIllilliIl percent, llliiIllilliiIll desc, boolean kind) {
      this.IIlliIiIIi = picker;
      this.lIlliIiIIi = setting;
      this.iIlliIiIIi = key;
      this.IllliIiIIi = percent;
      this.lllliIiIIi = desc;
      this.IilliIiIIi = kind;
      String[] var10001;
      if (percent instanceof lliliIIiililiIIi var8) {
         var10001 = (String[])var8.IiIiliIiiiIi().toArray(new String[0]);
      } else {
         var10001 = null;
      }

      this.illliIiIIi = var10001;
      this.lilliIiIIi = IliIlllilIi<invokedynamic>() + label;
      this.iilliIiIIi = IliIlllilIi<invokedynamic>() + label;
      this.IIiliIiIIi = IliIlllilIi<invokedynamic>() + label;
      this.lIiliIiIIi = IliIlllilIi<invokedynamic>() + label;
      this.iIiliIiIIi = IliIlllilIi<invokedynamic>() + label;
      this.IliliIiIIi = IliIlllilIi<invokedynamic>() + label;
      this.lliliIiIIi = IliIlllilIi<invokedynamic>() + label;
      this.ililiIiIIi = IliIlllilIi<invokedynamic>() + label;
   }
}
