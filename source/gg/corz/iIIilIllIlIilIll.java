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

public enum iIIilIllIlIilIll {
   IIliIIilll,
   liIiIIilll,
   iIliIIilll,
   lIliIIilll,
   ilIiIIilll,
   IlliIIilll,
   iiIiIIilll,
   IiIiIIilll;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8178967735691366038L ^ Long.rotateLeft(-6196088478820819321L, 21) ^ 7067015899584833585L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8180956299300703076L ^ Long.rotateLeft(2082783444904235885L, 63) ^ -942018732678401924L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2576473588113361834L ^ Long.rotateLeft(4279261320122684168L, 26) ^ 1557197890400174762L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7276916913246041361L ^ Long.rotateLeft(-5444118634982203796L, 59) ^ 3251173073717411580L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 194934738624757890L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8332175220827927784L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1544450947983412498L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4644153013908426908L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8734308097948577601L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3292263181578734287L;
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 1127))) + '謗') - var5) - var5) + '\ue41c') - var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 1127))) + '謗') - var5) - var5) + '\ue41c') - var5))) >>> 5))) ^ var5))) + var5) >>> 11 | (char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 1127))) + '謗') - var5) - var5) + '\ue41c') - var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 1127))) + '謗') - var5) - var5) + '\ue41c') - var5))) >>> 5))) ^ var5))) + var5) << 5) ^ 32222));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static iIIilIllIlIilIll[] IliIlllilIi() {
      return new iIIilIllIlIilIll[]{ilIiIIilll, IiIiIIilll, liIiIIilll, iiIiIIilll, IIliIIilll, lIliIIilll, iIliIIilll, IlliIIilll};
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) << 11 | (char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) >>> 5))) >>> 10 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) << 11 | (char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) >>> 5))) << 6) >>> 13 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) << 11 | (char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) >>> 5))) >>> 10 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) << 11 | (char)((char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) << 14 | (char)((char)((char)(var4[var5] ^ 6059) ^ var5) << 8 | (char)((char)(var4[var5] ^ 6059) ^ var5) >>> 8) >>> 2) >>> 5))) << 6) << 3) + var5) ^ var5) + 'Ｊ'));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 13802) ^ '봯') ^ var5) ^ var5) + var5) ^ 27857) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] + 13802) ^ '봯') ^ var5) ^ var5) + var5) ^ 27857) << 3) + 7274) ^ '\ud899')))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - 9917) - var5) + var5) - var5)))))))))) ^ 30429) ^ '\ue7d7') - 25421) - var5) - '趨') ^ '\uf7ce') - 'Ꜧ'));
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
         var4[var5] = (char)((char)(-((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) << 7 | (char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) >>> 9))) + 23901) >>> 9 | (char)((char)(~((char)((char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) << 7 | (char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) >>> 9))) + 23901) << 7) - '鐮') - '钔'))) << 9 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) << 7 | (char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) >>> 9))) + 23901) >>> 9 | (char)((char)(~((char)((char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) << 7 | (char)((char)((char)(~((char)(-var4[var5]))) - 17892) - var5) >>> 9))) + 23901) << 7) - '鐮') - '钔'))) >>> 7))))) ^ '콤'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
