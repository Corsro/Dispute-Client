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

public record lIiliiliIiliil(int x, int y, int z) {
   private final int IIllIlllilIllIllli;
   private final int liIlIllliiiIlIllli;
   private final int ilIlIllliIiIlIllli;

   public String toString() {
      return this.ilIlIllliIiIlIllli + IIillIiliIil<invokedynamic>() + this.liIlIllliiiIlIllli + IIillIiliIil<invokedynamic>() + this.IIllIlllilIllIllli;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1444139201814861905L ^ Long.rotateLeft(-898745911303534323L, 47) ^ 8402361650536578147L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4825840315927118771L ^ Long.rotateLeft(976976576410719686L, 10) ^ 8850786260660251693L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7872977016287131205L ^ Long.rotateLeft(6154982383863659849L, 35) ^ 8287639410046818753L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9146757971210602733L ^ Long.rotateLeft(3534604919626043262L, 33) ^ 462193048821249223L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8170328598692724171L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5175240217612341356L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4938731071093378559L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8628660339996997395L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5917728322631038071L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6426910084440540673L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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

   public lIiliiliIiliil(int z, int y, int x) {
      this.ilIlIllliIiIlIllli = z;
      this.liIlIllliiiIlIllli = y;
      this.IIllIlllilIllIllli = x;
   }

   public int IIlllIlliIll() {
      return this.ilIlIllliIiIlIllli;
   }

   public static lIiliiliIiliil IlIlllIlilIl(long packed) {
      return new lIiliiliIiliil(llIiIiililIiIiil.IiIlliIliiIl(packed), llIiIiililIiIiil.IIlllIlliIll(packed), llIiIiililIiIiil.Illlllllilll(packed));
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) >>> 12))) ^ '\ue379') + 749) << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) >>> 12))) ^ '\ue379') + 749) >>> 8) >>> 7 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) >>> 12))) ^ '\ue379') + 749) << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) << 6 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 8 | (char)((char)(var4[var5] ^ var5) ^ var5) << 8) - var5) - 12436) >>> 10) ^ var5) >>> 12))) ^ '\ue379') + 749) >>> 8) << 9) + var5) + '谩'))) ^ 1516) + 'Ꞵ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IIIllIIliIIl() {
      return llIiIiililIiIiil.IIIllIIliIIl(this.ilIlIllliIiIlIllli, this.liIlIllliiiIlIllli, this.IIllIlllilIllIllli);
   }

   public int Illlllllilll() {
      return this.liIlIllliiiIlIllli;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) << 4 | (char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) >>> 12) - '詒') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) << 4 | (char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) >>> 12) - '詒') - var5) << 4))) ^ 8824) ^ '\uf1b6') + 'ꂻ') - '\ue600') + 15249) ^ 5173) + '\ua7e0') >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) << 4 | (char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) >>> 12) - '詒') - var5) >>> 12 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) << 4 | (char)((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) - var5) + var5) >>> 12) - '詒') - var5) << 4))) ^ 8824) ^ '\uf1b6') + 'ꂻ') - '\ue600') + 15249) ^ 5173) + '\ua7e0') << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IiIlliIliiIl(lIiliiliIiliil o) {
      return Math.max(Math.abs(this.ilIlIllliIiIlIllli - o.ilIlIllliIiIlIllli), Math.max(Math.abs(this.liIlIllliiiIlIllli - o.liIlIllliiiIlIllli), Math.abs(this.IIllIlllilIllIllli - o.IIllIlllilIllIllli)));
   }

   public lIiliiliIiliil lIiiIiIlilli(int n) {
      return this.IliIlllilIi(0, -n, 0);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + 82) >>> 12 | (char)(var4[var5] + 82) << 4) >>> 4 | (char)((char)(var4[var5] + 82) >>> 12 | (char)(var4[var5] + 82) << 4) << 12) - var5))) ^ var5) + 11516))) + var5))) - 15673));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIiliiliIiliil liiiIIllIl() {
      return this.IliIlllilIi(0, 1, 0);
   }

   public lIiliiliIiliil IliIlllilIi(int dy, int dx, int dz) {
      return new lIiliiliIiliil(this.ilIlIllliIiIlIllli + dy, this.liIlIllliiiIlIllli + dx, this.IIllIlllilIllIllli + dz);
   }

   public lIiliiliIiliil iliIiiliiiii(int dir) {
      int[] var2 = iiIiIIilIIliIIil.liiiIIllIl(dir);
      return this.IliIlllilIi(var2[0], var2[1], var2[2]);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ var5) + 'ꓩ') ^ var5) - var5)))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ var5) + 'ꓩ') ^ var5) - var5)))) << 7))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIiliiliIiliil IilliliilIIi() {
      return this.IliIlllilIi(0, -1, 0);
   }

   public lIiliiliIiliil iIlIlllllill(int n) {
      return this.IliIlllilIi(0, n, 0);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 8869))) ^ var5) ^ var5) + '钢') - 27437) << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - 8869))) ^ var5) ^ var5) + '钢') - 27437) >>> 4) ^ 6554) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 8869))) ^ var5) ^ var5) + '钢') - 27437) << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - 8869))) ^ var5) ^ var5) + '钢') - 27437) >>> 4) ^ 6554) ^ var5) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilllilliill() {
      return this.IIllIlllilIllIllli;
   }
}
