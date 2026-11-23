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

public enum ilIIIiIiIIIi {
   ilIilliiIiIillii,
   IlIilliillIillii;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') >>> 3 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') << 13))) ^ '逮'))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') >>> 3 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') << 13))) ^ '逮'))) << 10) >>> 4 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') >>> 3 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') << 13))) ^ '逮'))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') >>> 3 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') >>> 7 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '뱰') ^ var5) ^ var5) - 27557))) + '팥') ^ var5))))) - '骃') << 9) + '蓿') << 13))) ^ '逮'))) << 10) << 12) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4602765385654776963L ^ Long.rotateLeft(1070071023214026945L, 35) ^ 4210781322187900348L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7710376344965958217L ^ Long.rotateLeft(8058636450913559319L, 53) ^ -6666979490149559388L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5157663102718755945L ^ Long.rotateLeft(-3642113067074386890L, 24) ^ 534960290940044363L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2223777123107868666L ^ Long.rotateLeft(7614306063476576424L, 5) ^ 1832364947831881438L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8536739867468928587L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4733771169452814539L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5258944318899451419L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7964949440906836666L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 625933089072465459L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9006646066666305200L;
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\ue4b3') + var5) - 'ꖳ') >>> 13 | (char)((char)((char)(var4[var5] - '\ue4b3') + var5) - 'ꖳ') << 3) ^ var5) + var5) ^ var5) - 8071))) - var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '鴦') - 3822) ^ '酐') - var5) + '\udcc3') + var5) ^ '죐') + '쇋'))) + var5) - var5))) ^ '\uec8c') - 'ퟐ'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 5477) + var5) ^ var5) >>> 5 | (char)((char)((char)(var4[var5] ^ 5477) + var5) ^ var5) << 11) ^ var5) ^ 21980) + 14441) + '諂') + 8587) - var5) + 15188) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 5477) + var5) ^ var5) >>> 5 | (char)((char)((char)(var4[var5] ^ 5477) + var5) ^ var5) << 11) ^ var5) ^ 21980) + 14441) + '諂') + 8587) - var5) + 15188) + var5) << 11) - 27607));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static ilIIIiIiIIIi[] IliIlllilIi() {
      return new ilIIIiIiIIIi[]{IlIilliillIillii, ilIilliiIiIillii};
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 23042))) - var5) << 12 | (char)((char)(-((char)((char)(-var4[var5]) + 23042))) - var5) >>> 4) + 28702))) ^ var5))) ^ 21507) - 32479) ^ 8782) >>> 11 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-var4[var5]) + 23042))) - var5) << 12 | (char)((char)(-((char)((char)(-var4[var5]) + 23042))) - var5) >>> 4) + 28702))) ^ var5))) ^ 21507) - 32479) ^ 8782) << 5) - var5) + 28883) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
