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

public enum IiIlllliIlll {
   liillIIiiiillIIi,
   IIIilIIilIIilIIi,
   ilillIIiIiillIIi;

   // $FF: synthetic method
   private static IiIlllliIlll[] IliIlllilIi() {
      return new IiIlllliIlll[]{ilillIIiIiillIIi, liillIIiiiillIIi, IIIilIIilIIilIIi};
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) << 15))) << 10 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) << 15))) >>> 6) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) << 15))) << 10 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) >>> 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 2475))) ^ '냔') - 22036) ^ var5) << 15))) >>> 6) << 8))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1412329278221056719L ^ Long.rotateLeft(-3897035846649601116L, 26) ^ 5276184907104692500L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1502924514396222076L ^ Long.rotateLeft(5609520779271589127L, 39) ^ -4150869940542499053L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3770717889956065211L ^ Long.rotateLeft(6509686926304023993L, 30) ^ 5863179645833156157L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3836067410346065297L ^ Long.rotateLeft(-8265978974261780163L, 8) ^ -569616020169816207L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1897142264294567209L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6357331218974914873L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4166255662898411042L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4287295060815591492L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5173632992234364014L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 257790164058386698L;
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') << 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') >>> 12) ^ var5) << 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') << 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') >>> 12) ^ var5) >>> 9) ^ '\ued67') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') << 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') >>> 12) ^ var5) << 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') << 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) << 13 | (char)((char)((char)(~((char)(~var4[var5]))) << 9 | (char)(~((char)(~var4[var5]))) >>> 7) - var5) >>> 3) + var5) + 6850) + var5))) ^ '錣') >>> 12) ^ var5) >>> 9) ^ '\ued67') - var5) << 5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 24503)) ^ '﹛') ^ 'ꍛ') >>> 11 | (char)((char)((char)((char)(var4[var5] + 24503)) ^ '﹛') ^ 'ꍛ') << 5) ^ var5))) - var5) + 21756) >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 24503)) ^ '﹛') ^ 'ꍛ') >>> 11 | (char)((char)((char)((char)(var4[var5] + 24503)) ^ '﹛') ^ 'ꍛ') << 5) ^ var5))) - var5) + 21756) << 6) ^ '鴽') - var5) ^ var5) + var5) ^ var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) << 6) >>> 2 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) << 6) << 14) >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) << 6) >>> 2 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) >>> 10 | (char)((char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) << 4 | (char)((char)((char)(-((char)(var4[var5] + 10687))) ^ 3193) - var5) >>> 12) << 6) << 14) << 4) - 22894))) + 13267));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 32417) << 3 | (char)(var4[var5] ^ 32417) >>> 13) + var5) - 14473) + '뱌'))) + '뭽') + var5))) >>> 3 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 32417) << 3 | (char)(var4[var5] ^ 32417) >>> 13) + var5) - 14473) + '뱌'))) + '뭽') + var5))) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
