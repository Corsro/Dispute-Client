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

public record Iiiililiiili(boolean safe, String reason) {
   public static final Iiiililiiili llIllllIlilIllllIl = new Iiiililiiili(true, IilliliilIIi<invokedynamic>());
   private final String iIIllllIlIlIllllIl;
   private final boolean IIIllllIllIIllllIl;

   public Iiiililiiili(boolean safe, String reason) {
      this.IIIllllIllIIllllIl = safe;
      this.iIIllllIlIlIllllIl = reason;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + '\udb9c'))) + var5) - var5) + var5) + '\uf6e8')))) + var5))) - var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + '\udb9c'))) + var5) - var5) + var5) + '\uf6e8')))) + var5))) - var5) + var5) << 6))) + 1482) ^ '걲') - 6958));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return this.iIIllllIlIlIllllIl;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 30638) + '輣') >>> 12 | (char)((char)((char)(var4[var5] + var5) + 30638) + '輣') << 4) + '퓼') + var5) - 19636))) ^ var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 30638) + '輣') >>> 12 | (char)((char)((char)(var4[var5] + var5) + 30638) + '輣') << 4) + '퓼') + var5) - 19636))) ^ var5) ^ var5) >>> 9) - 3799)) - var5) + '쭿') ^ 11700));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liiiIIllIl() {
      return this.IIIllllIllIIllllIl;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2643762503173330400L ^ Long.rotateLeft(-4618866538793279782L, 3) ^ -6940099337663793095L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7381636928896630785L ^ Long.rotateLeft(2041749091070255265L, 57) ^ -4297540482242477215L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2006438351816826426L ^ Long.rotateLeft(-7086203428305313583L, 15) ^ 647926935020097554L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7065538761780179553L ^ Long.rotateLeft(-6253386407081167746L, 63) ^ -1244954638207386204L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1529418976143449165L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4618026334489974588L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6651942123311291739L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4318955897794956194L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 131518949992415441L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6797063748782344953L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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

   public static Iiiililiiili IliIlllilIi(String reason) {
      return new Iiiililiiili(false, reason);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) >>> 10 | (char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) << 6) + '\ue811') + 6447) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) >>> 10 | (char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) << 6) + '\ue811') + 6447) << 12)))) ^ var5) << 6 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) >>> 10 | (char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) << 6) + '\ue811') + 6447) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) >>> 10 | (char)((char)((char)((char)(-var4[var5]) + var5) + var5) >>> 5 | (char)((char)((char)(-var4[var5]) + var5) + var5) << 11) << 6) + '\ue811') + 6447) << 12)))) ^ var5) >>> 10) ^ var5) ^ var5) + '쒦') ^ 22036));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) >>> 14 | (char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) << 2) - var5) << 7 | (char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) >>> 14 | (char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) << 2) - var5) >>> 9) << 1 | (char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) >>> 14 | (char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) << 2) - var5) << 7 | (char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) >>> 14 | (char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) << 2) - var5) >>> 9) >>> 15) - var5) ^ var5) + var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 16163))) ^ var5) >>> 3 | (char)((char)(-((char)(var4[var5] + 16163))) ^ var5) << 13) ^ var5) ^ var5) << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + 16163))) ^ var5) >>> 3 | (char)((char)(-((char)(var4[var5] + 16163))) ^ var5) << 13) ^ var5) ^ var5) >>> 4) ^ 7368) + 32618) - '칁') ^ 15226) - '닟') ^ '鍠'))) ^ var5) ^ 27948) << 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 16163))) ^ var5) >>> 3 | (char)((char)(-((char)(var4[var5] + 16163))) ^ var5) << 13) ^ var5) ^ var5) << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + 16163))) ^ var5) >>> 3 | (char)((char)(-((char)(var4[var5] + 16163))) ^ var5) << 13) ^ var5) ^ var5) >>> 4) ^ 7368) + 32618) - '칁') ^ 15226) - '닟') ^ '鍠'))) ^ var5) ^ 27948) >>> 2) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
