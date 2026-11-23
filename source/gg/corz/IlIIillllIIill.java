package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlIIillllIIill {
   public final String iIIIilIIiIlIIilIIi;
   public final lIlIllIliIlIllIl IIIIilIIilIIIilIIi;
   public final Path liiillIIiiiiillIIi;

   IlIIillllIIill(Path path, lIlIllIliIlIllIl profile) {
      this.liiillIIiiiiillIIi = path;
      this.IIIIilIIilIIIilIIi = profile;
      String var3 = path.getFileName().toString();
      this.iIIIilIIiIlIIilIIi = var3.endsWith(IliIlllilIi<invokedynamic>()) ? var3.substring(0, var3.length() - IliIlllilIi<invokedynamic>().length()) : var3;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 4 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 12) - '짞') + var5) - '빺') ^ var5) + var5) ^ var5))) - var5) - 22857));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - 18578))) ^ '먕') - var5) - '\uf534') + var5))) + var5) - var5) + var5) << 7 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - 18578))) ^ '먕') - var5) - '\uf534') + var5))) + var5) - var5) + var5) >>> 9));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) << 2 | (char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) >>> 14) >>> 11 | (char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) << 2 | (char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) >>> 14) << 5) + 28604) >>> 2 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) << 2 | (char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) >>> 14) >>> 11 | (char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) << 2 | (char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + '嵐') + var5) + var5) ^ 24907) - 2116) ^ var5))) - '\ue2ed') ^ var5))))) >>> 14) << 5) + 28604) << 14) + var5) - var5) - var5));
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
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-var4[var5]) ^ 14325) + 976) >>> 6 | (char)((char)((char)(-var4[var5]) ^ 14325) + 976) << 10) + var5))))) - var5) ^ '鸕'))));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) << 4))) + '\ude05') << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) << 4))) + '\ude05') >>> 15))) >>> 5 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) << 4))) + '\ude05') << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) + var5) - '\ue607')) ^ var5) << 4))) + '\ude05') >>> 15))) << 11) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4400698408399933605L ^ Long.rotateLeft(2715585964211091838L, 27) ^ -6648941830443324686L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5652174739359614398L ^ Long.rotateLeft(954648789129693494L, 28) ^ -618147813435199151L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 208579373123609901L ^ Long.rotateLeft(1547808006798269371L, 55) ^ 5940575427985493283L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8391200626496468063L ^ Long.rotateLeft(7631508114066404993L, 38) ^ -7736185761382632330L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7695509238115222678L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4922074355276231450L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1803089092781128198L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6662389958827267480L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7201346107743499735L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8786259481042473529L;
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
}
