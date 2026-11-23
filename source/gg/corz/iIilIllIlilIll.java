package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIilIllIlilIll {
   public final List<String> IiliIIlilliliIIlil;
   public final boolean llliIIlililliIIlil;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 1402) << 1 | (char)((char)(var4[var5] - var5) + 1402) >>> 15))))) ^ var5) ^ 3872) - var5) >>> 4 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 1402) << 1 | (char)((char)(var4[var5] - var5) + 1402) >>> 15))))) ^ var5) ^ 3872) - var5) << 12))) ^ var5) - '\ued26') ^ 4684) ^ var5) ^ '駯') << 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 1402) << 1 | (char)((char)(var4[var5] - var5) + 1402) >>> 15))))) ^ var5) ^ 3872) - var5) >>> 4 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 1402) << 1 | (char)((char)(var4[var5] - var5) + 1402) >>> 15))))) ^ var5) ^ 3872) - var5) << 12))) ^ var5) - '\ued26') ^ 4684) ^ var5) ^ '駯') >>> 8) ^ 6277));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') >>> 6) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') >>> 6) << 1) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') >>> 6) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) << 5 | (char)((char)((char)(-var4[var5]) ^ 2511) >>> 8 | (char)((char)(-var4[var5]) ^ 2511) << 8) >>> 11) + var5) + var5) + var5) - var5) - var5) << 11) - var5) ^ '訟') >>> 6) << 1) << 2) ^ '뚍') ^ 12260));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 15 | (char)(var4[var5] ^ var5) << 1) << 6 | (char)((char)(var4[var5] ^ var5) >>> 15 | (char)(var4[var5] ^ var5) << 1) >>> 10) + '\uef5d') >>> 15 | (char)((char)((char)((char)(var4[var5] ^ var5) >>> 15 | (char)(var4[var5] ^ var5) << 1) << 6 | (char)((char)(var4[var5] ^ var5) >>> 15 | (char)(var4[var5] ^ var5) << 1) >>> 10) + '\uef5d') << 1) + '큒') ^ 20491) + var5) ^ var5) + var5) - '﹌') - 14536) ^ 4932))) + 20580));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      return String.join(liiiIIllIl<invokedynamic>(), this.IiliIIlilliliIIlil);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)(var4[var5] + '샓'))))))) >>> 13 | (char)(-((char)(~((char)(-((char)(var4[var5] + '샓'))))))) << 3) - var5) ^ '\uf556') - var5))) - 18581) - var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)(var4[var5] + '샓'))))))) >>> 13 | (char)(-((char)(~((char)(-((char)(var4[var5] + '샓'))))))) << 3) - var5) ^ '\uf556') - var5))) - 18581) - var5) << 9) ^ '\ud9fa') - var5) ^ var5) ^ 17489) ^ var5) - 5918));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) << 2) << 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) << 2) >>> 6))))))) + var5) >>> 3 | (char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) << 2) << 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 10 | var4[var5] >>> 6))) ^ var5) - 23645) + '︎') - var5))) + '큎') + var5) - var5) << 2) >>> 6))))))) + var5) << 13) ^ 24975) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   iIilIllIlilIll(boolean match, List<String> mismatches) {
      this.llliIIlililliIIlil = match;
      this.IiliIIlilliliIIlil = mismatches;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4728125539785656L ^ Long.rotateLeft(8957430105541424336L, 23) ^ -2642640436711705085L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 347224540468300548L ^ Long.rotateLeft(6483185481259195231L, 18) ^ -8933895887204861222L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2997555645126824450L ^ Long.rotateLeft(-7015276100264690557L, 5) ^ -4530403774748439484L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5342121588783045275L ^ Long.rotateLeft(-4332895312492545952L, 7) ^ 8386037828297219339L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7455440958795426288L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1982857390294889380L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4115267109600154183L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5968196526787195241L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2399579457585966924L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4103423714854590104L;
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
}
