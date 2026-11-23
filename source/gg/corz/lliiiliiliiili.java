package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lliiiliiliiili {
   public final Map<Iiiiilllliiiilll, Integer> IillIllIIl = new LinkedHashMap();
   public int llllIllIIl;
   public int illlIllIIl;
   public int IlllIllIIl;

   public void IliIlllilIi() {
      this.IlllIllIIl = this.llllIllIIl = this.illlIllIIl = 0;
      this.IillIllIIl.clear();
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - '텰') + 9611) - var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - '텰') + 9611) - var5) ^ var5) << 13) - var5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(iiIillIlIIlillIl d) {
      ++this.IlllIllIIl;
      if (d.IliIlllilIi()) {
         ++this.illlIllIIl;
      } else {
         this.IillIllIIl.merge(d.liiiIIllIl(), 1, Integer::sum);
      }

   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] - var5))))) + 12636))) - 29697) + '뎹') - var5))) - var5) << 2 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(var4[var5] - var5))))) + 12636))) - 29697) + '뎹') - var5))) - var5) >>> 14) - '턵') ^ '舫') ^ var5))) - '숌'))) - var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 'ꖃ') - var5))))))) >>> 6 | (char)(~((char)(-((char)(~((char)((char)(var4[var5] - 'ꖃ') - var5))))))) << 10) + var5) + var5) ^ 27768) << 12 | (char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 'ꖃ') - var5))))))) >>> 6 | (char)(~((char)(-((char)(~((char)((char)(var4[var5] - 'ꖃ') - var5))))))) << 10) + var5) + var5) ^ 27768) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5192416792542048591L ^ Long.rotateLeft(1823174247537244133L, 42) ^ -6286104001916294527L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8330194669760467568L ^ Long.rotateLeft(839819608186763606L, 29) ^ 7893877122045166557L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2253937350290303172L ^ Long.rotateLeft(2060120124230567322L, 55) ^ -4738864403698579728L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1782381291029221259L ^ Long.rotateLeft(5538903149597193579L, 39) ^ 6483815798175563855L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4010780696953519000L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1283818582591566789L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8807927673249228584L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2352854757666549057L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1339772132095767094L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2500038190099144375L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIlllIlilIl<invokedynamic>());
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

   public String iIlIlllllill() {
      return IilliliilIIi<invokedynamic>() + this.IlllIllIIl + IilliliilIIi<invokedynamic>() + this.llllIllIIl + IilliliilIIi<invokedynamic>() + this.illlIllIIl + IilliliilIIi<invokedynamic>() + this.IillIllIIl;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) << 13) ^ '쮊'))) - var5) << 14 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) << 13) ^ '쮊'))) - var5) >>> 2))) ^ var5) ^ '齿'))))) >>> 9 | (char)(-((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) << 13) ^ '쮊'))) - var5) << 14 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) >>> 3 | (char)(~((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ var5))))) << 7) + '츻') - 105))) << 13) ^ '쮊'))) - var5) >>> 2))) ^ var5) ^ '齿'))))) << 7));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + 'ꠀ'))) >>> 6 | (char)(-((char)((char)(~var4[var5]) + 'ꠀ'))) << 10) - var5) + '鈚') ^ var5))) + 4114) + var5) + '쵺'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
