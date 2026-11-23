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

public enum iIIIliIlIIli {
   IiililIIlliililIIl,
   iiililIIlIIIiilIIl,
   IIililIIllIililIIl,
   llililIIlilililIIl,
   IlllilIIlllllilIIl,
   illlilIIlIillilIIl,
   lillilIIliillilIIl,
   iIililIIlIlililIIl;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6331171099106962445L ^ Long.rotateLeft(-8442388436903364074L, 35) ^ 3527739390740343327L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1574816483752963369L ^ Long.rotateLeft(-4108190618668360698L, 42) ^ 7374048979892819866L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4334032833657973125L ^ Long.rotateLeft(8176839419847860845L, 50) ^ 8713722308795047076L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7687710971153057857L ^ Long.rotateLeft(-3441694672354094724L, 36) ^ -5307554178718891501L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 9366755482711561L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5778811064307321964L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7702580288504924415L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4920704337375081493L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2880812956748076407L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1205717183314401072L;
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') << 6 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') >>> 10) - var5) + '뭮')) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') << 6 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') >>> 10) - var5) + '뭮')) >>> 5) ^ 30894) + var5) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') << 6 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') >>> 10) - var5) + '뭮')) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') << 6 | (char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - '\uf675') >>> 10) - var5) + '뭮')) >>> 5) ^ 30894) + var5) ^ var5) >>> 1) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) << 3) + '\ue039') + '퀢') + '띅') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) << 3) + '\ue039') + '퀢') + '띅') >>> 1) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) << 3) + '\ue039') + '퀢') + '띅') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) - '\ue406') ^ '\uf28c') ^ var5) ^ var5) - var5) ^ var5) ^ 27358) + 2407) ^ var5) << 3) + '\ue039') + '퀢') + '띅') >>> 1) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static iIIIliIlIIli[] IliIlllilIi() {
      return new iIIIliIlIIli[]{IlllilIIlllllilIIl, illlilIIlIillilIIl, lillilIIliillilIIl, IIililIIllIililIIl, iIililIIlIlililIIl, llililIIlilililIIl, IiililIIlliililIIl, iiililIIlIIIiilIIl};
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') >>> 3) >>> 11) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) << 1 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) << 6 | (char)(var4[var5] + var5) >>> 10) + var5))) - var5) >>> 15) - var5) + 20163) ^ var5) ^ var5) >>> 11) ^ var5) ^ 12197) - '諞') << 1) - '벹') >>> 3) >>> 11) << 5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) >>> 11 | (char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) << 5) >>> 14 | (char)((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) >>> 11 | (char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) << 5) << 2) << 12 | (char)((char)((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) >>> 11 | (char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) << 5) >>> 14 | (char)((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) >>> 11 | (char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) << 10 | (char)((char)((char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) >>> 5 | (char)(~((char)((char)(~((char)(var4[var5] - '阚'))) ^ '곶'))) << 11) ^ var5) >>> 6) - var5) ^ var5) ^ var5))))))) - var5) << 5) << 2) >>> 4) - var5));
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
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') << 6 | (char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') >>> 10) >>> 4 | (char)((char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') << 6 | (char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') >>> 10) << 12) + var5) - var5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') << 6 | (char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') >>> 10) >>> 4 | (char)((char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') << 6 | (char)((char)((char)((char)(~var4[var5]) + '舋') >>> 3 | (char)((char)(~var4[var5]) + '舋') << 13) - '裋') >>> 10) << 12) + var5) - var5))) << 4))) ^ 21928));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
