package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iilIlIlIIiIlIl(long id, long region, int placed, int expected, int stands, int routes, int infraReused, int cleanups, int durationTicks, int plans, int merges, int members) {
   private final int IlIiIIIllllIiIIIll;
   private final int llliIIIllilliIIIll;
   private final long iIilIIIllIlilIIIll;
   private final int lIIiIIIlliIIiIIIll;
   private final long IIilIIIlllIilIIIll;
   private final int ilIiIIIllIiIiIIIll;
   private final int iiilIIIllIIIiIIIll;
   private final int iIliIIIllIlliIIIll;
   private final int IiilIIIllliilIIIll;
   private final int liIiIIIlliiIiIIIll;
   private final int IIliIIIlllIliIIIll;
   private final int llilIIIllililIIIll;

   public int IilliliilIIi() {
      return this.llilIIIllililIIIll;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5) + 25008) ^ var5))) + var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5) + 25008) ^ var5))) + var5) << 6) + 26396))) - var5))) ^ 32126) >>> 13 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5) + 25008) ^ var5))) + var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - var5) + 25008) ^ var5))) + var5) << 6) + 26396))) - var5))) ^ 32126) << 3) ^ var5) - 13654));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.IIliIIIlllIliIIIll;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5070446333574220219L ^ Long.rotateLeft(-1167432637343673021L, 7) ^ -442114319202097944L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4358852044081696005L ^ Long.rotateLeft(3717275890463446497L, 33) ^ -6055959992407350696L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1962462608939817848L ^ Long.rotateLeft(-8939309599971199685L, 8) ^ 2747408458802393808L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4799215227248795999L ^ Long.rotateLeft(6356148793974252970L, 13) ^ 3357376442400511077L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2563749604113515987L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8737562488912009083L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 540005385452108422L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7370691439522944397L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8141101200376607210L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1573879479663800106L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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

   public int IIillIiliIil() {
      return this.llliIIIllilliIIIll;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') << 10))))) ^ '輚'))) << 5 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') << 10))))) ^ '輚'))) >>> 11) ^ 22838) >>> 1 | (char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') << 10))))) ^ '輚'))) << 5 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') >>> 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 6854) - var5) << 10 | (char)((char)((char)(var4[var5] - var5) - 6854) - var5) >>> 6) - '쾽') << 10))))) ^ '輚'))) >>> 11) ^ 22838) << 15) - 20424) ^ '넂'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl() {
      return this.lIIiIIIlliIIiIIIll;
   }

   public int iliIiiliiiii() {
      return this.iiilIIIllIIIiIIIll;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)(-((char)((char)(~var4[var5]) ^ 27529))))))) ^ 'ꈻ') ^ '\uf8ec'))) - var5) << 10 | (char)((char)(-((char)((char)((char)(-((char)(-((char)(-((char)((char)(~var4[var5]) ^ 27529))))))) ^ 'ꈻ') ^ '\uf8ec'))) - var5) >>> 6) + var5) + var5) + var5) + var5) ^ var5) ^ var5))) + '芻') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl() {
      return this.IlIiIIIllllIiIIIll;
   }

   public int Iilllilliill() {
      return this.iIliIIIllIlliIIIll;
   }

   public int IiIlliIliiIl() {
      return this.ilIiIIIllIiIiIIIll;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) << 1 | (char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) >>> 15) ^ var5) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) << 1 | (char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) >>> 15) ^ var5) >>> 1))) - var5) - 4029) ^ 16991))) ^ var5) - 11717))) ^ var5))))) >>> 2 | (char)(~((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) << 1 | (char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) >>> 15) ^ var5) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) << 1 | (char)(~((char)((char)(var4[var5] + var5) >>> 4 | (char)(var4[var5] + var5) << 12))) >>> 15) ^ var5) >>> 1))) - var5) - 4029) ^ 16991))) ^ var5) - 11717))) ^ var5))))) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iIlIlllllill() {
      return this.iIilIIIllIlilIIIll;
   }

   public int IIlllIlliIll() {
      return this.liIiIIIlliiIiIIIll;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) << 6 | (char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) >>> 10) >>> 14 | (char)((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) << 6 | (char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) >>> 10) << 2))))))) + 'ﰥ') >>> 2 | (char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) << 6 | (char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) >>> 10) >>> 14 | (char)((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) << 6 | (char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) ^ var5))) >>> 10) << 2))))))) + 'ﰥ') << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iilIlIlIIiIlIl(long members, long stands, int routes, int durationTicks, int plans, int cleanups, int region, int infraReused, int expected, int merges, int id, int placed) {
      this.IIilIIIlllIilIIIll = members;
      this.iIilIIIllIlilIIIll = stands;
      this.llilIIIllililIIIll = routes;
      this.IiilIIIllliilIIIll = durationTicks;
      this.iiilIIIllIIIiIIIll = plans;
      this.lIIiIIIlliIIiIIIll = cleanups;
      this.IlIiIIIllllIiIIIll = region;
      this.ilIiIIIllIiIiIIIll = infraReused;
      this.liIiIIIlliiIiIIIll = expected;
      this.IIliIIIlllIliIIIll = merges;
      this.iIliIIIllIlliIIIll = id;
      this.llliIIIllilliIIIll = placed;
   }

   public int lIiiIiIlilli() {
      return this.IiilIIIllliilIIIll;
   }

   public String IliIlllilIi() {
      return String.format(Locale.ROOT, Ililllililil<invokedynamic>(), this.IIilIIIlllIilIIIll, this.iIilIIIllIlilIIIll, this.llilIIIllililIIIll, this.IiilIIIllliilIIIll, this.iiilIIIllIIIiIIIll, this.lIIiIIIlliIIiIIIll, this.IlIiIIIllllIiIIIll, this.ilIiIIIllIiIiIIIll, this.IIliIIIlllIliIIIll, this.iIliIIIllIlliIIIll, this.llliIIIllilliIIIll, this.liIiIIIlliiIiIIIll / 20);
   }

   public long liiiIIllIl() {
      return this.IIilIIIlllIilIIIll;
   }
}
