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

public record iIIIliiIlIIlii(lIiliiliIiliil target, String reason, List<lIiliiliIiliil> dependsOn) {
   private final lIiliiliIiliil iIiilIiIIl;
   private final List<lIiliiliIiliil> lliilIiIIl;
   private final String IliilIiIIl;

   public String toString() {
      return this.iIiilIiIIl + IilliliilIIi<invokedynamic>() + this.IliilIiIIl + (this.lliilIiIIl.isEmpty() ? "" : IilliliilIIi<invokedynamic>() + this.lliilIiIIl);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) - 23165))) - var5) - 16638) + 24628) - 'ꑧ'))) >>> 9 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) - 23165))) - var5) - 16638) + 24628) - 'ꑧ'))) << 7) >>> 11 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) - 23165))) - var5) - 16638) + 24628) - 'ꑧ'))) >>> 9 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) - 23165))) - var5) - 16638) + 24628) - 'ꑧ'))) << 7) << 5) - var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)(~((char)(~var4[var5]))))) >>> 15 | (char)(-((char)(~((char)(~var4[var5]))))) << 1))) ^ '툌'))) ^ var5) - 18096) ^ '깸') + '鑂') ^ '꿌') ^ 25017) - var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)(~((char)(~var4[var5]))))) >>> 15 | (char)(-((char)(~((char)(~var4[var5]))))) << 1))) ^ '툌'))) ^ var5) - 18096) ^ '깸') + '鑂') ^ '꿌') ^ 25017) - var5) >>> 15) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIIIliiIlIIlii(lIiliiliIiliil reason, String dependsOn, List<lIiliiliIiliil> target) {
      this.iIiilIiIIl = reason;
      this.IliilIiIIl = dependsOn;
      this.lliilIiIIl = target;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9))) >>> 1 | (char)(-((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9))) << 15))) - 23866))) << 11 | (char)(-((char)((char)(-((char)((char)(-((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9))) >>> 1 | (char)(-((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9))) << 15))) - 23866))) >>> 5))) - '뢫') ^ var5) + var5))))));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 6473) - var5) << 8 | (char)((char)(var4[var5] - 6473) - var5) >>> 8) ^ var5) ^ '퀸') - 7569) - 'ײַ') + 23560) ^ 8801))) >>> 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 6473) - var5) << 8 | (char)((char)(var4[var5] - 6473) - var5) >>> 8) ^ var5) ^ '퀸') - 7569) - 'ײַ') + 23560) ^ 8801))) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public List<lIiliiliIiliil> iIlIlllllill() {
      return this.lliilIiIIl;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2799513907518248840L ^ Long.rotateLeft(2997478068954441482L, 5) ^ 2295493617597012688L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4258611127627097374L ^ Long.rotateLeft(5240751985360215651L, 7) ^ 1933076010143471813L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -350646293608521952L ^ Long.rotateLeft(-4361590861671440217L, 9) ^ 4984643469873240591L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8277510044404153236L ^ Long.rotateLeft(-228088153482814789L, 29) ^ -2198999791188397020L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7290901473355835452L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6113908449257940305L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4448677731388213246L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7392516311562837876L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3367282059950346912L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -9008819266664036666L;
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

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) << 6 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) >>> 10) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) << 6 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) >>> 10) << 6) ^ 19643))))) ^ '\ueaf2'))) ^ var5) >>> 13 | (char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) << 6 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) >>> 10) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) << 6 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + 2975) + var5) + var5) ^ var5) - 27418))) >>> 10) << 6) ^ 19643))))) ^ '\ueaf2'))) ^ var5) << 3))) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String liiiIIllIl() {
      return this.IliilIiIIl;
   }

   public lIiliiliIiliil IliIlllilIi() {
      return this.iIiilIiIIl;
   }
}
