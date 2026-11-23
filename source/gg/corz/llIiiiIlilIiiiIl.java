package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.Set;
import java.util.function.LongPredicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class llIiiiIlilIiiiIl {
   private llIiiiIlilIiiiIl() {
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - '닣'))) + var5) + 6445) - var5)))) - '\udbdf') - var5) + 12520));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIiIIlliIiIIll IliIlllilIi(Set<Long> owned, LongPredicate stillConfirmedOwnedDirt) {
      long var3 = -7657370075299464503L;
      Objects.requireNonNull(owned, iIlIlllllill<invokedynamic>());
      Objects.requireNonNull(stillConfirmedOwnedDirt, iIlIlllllill<invokedynamic>());
      var3 ^= ((long)owned.size() << 32 ^ var3) & -1L << 32;
      owned.removeIf((cell) -> !stillConfirmedOwnedDirt.test(cell));
      return new lIiIIlliIiIIll((int)(var3 >>> 32), owned.size(), (int)(var3 >>> 32) - owned.size());
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) - 11734) - var5) + 'ﶬ'))) ^ var5) + var5) << 4 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) - 11734) - var5) + 'ﶬ'))) ^ var5) + var5) >>> 12) + var5) ^ 12484))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) << 1) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) << 1) << 11))) ^ var5) - 22588))))) - 'ꕖ') + var5) + var5) ^ var5) << 3 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) << 1) >>> 5 | (char)((char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] - 'ﲡ'))) + var5) - var5) << 1) << 11))) ^ var5) - 22588))))) - 'ꕖ') + var5) + var5) ^ var5) >>> 13) + '햂') ^ 21484) + var5));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)var4[var5])) >>> 14 | (char)(-((char)var4[var5])) << 2))) - var5) << 1 | (char)((char)(-((char)((char)(-((char)var4[var5])) >>> 14 | (char)(-((char)var4[var5])) << 2))) - var5) >>> 15) ^ '\uf752'))) - '\udeb7') >>> 5 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)var4[var5])) >>> 14 | (char)(-((char)var4[var5])) << 2))) - var5) << 1 | (char)((char)(-((char)((char)(-((char)var4[var5])) >>> 14 | (char)(-((char)var4[var5])) << 2))) - var5) >>> 15) ^ '\uf752'))) - '\udeb7') << 11))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8340432705196360792L ^ Long.rotateLeft(4822152492106657755L, 53) ^ 697770618432881143L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 253137185381650380L ^ Long.rotateLeft(3858804951267613328L, 12) ^ -849053038127145922L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6395423194454727521L ^ Long.rotateLeft(-4026416875116708193L, 53) ^ -6033832817216647644L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5264987803904660239L ^ Long.rotateLeft(-8273638591551997629L, 62) ^ -1009230362953814838L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4417980253319227546L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7966744798063507473L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5734086402210557137L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6949281932072695891L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2504644436915529109L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4549120217647139396L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) << 11) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) << 11) << 7) + var5))) - var5))) << 14 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) << 11) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 'ꖽ') - 10817) - var5) ^ 9969) - 'ꃞ') ^ 29040) ^ '젌') ^ 23485) + var5) << 11) << 7) + var5))) - var5))) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
