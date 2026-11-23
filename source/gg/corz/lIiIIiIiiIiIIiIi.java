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

public final class lIiIIiIiiIiIIiIi {
   public final long llIIiilIIi;
   public final int iiIIiilIIi;
   private boolean IIlIiilIIi;
   private boolean lIlIiilIIi;
   public final long liIIiilIIi;
   public final long IiIIiilIIi;
   private boolean iIlIiilIIi;
   public final Iiillilliillil ilIIiilIIi;

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + '혚') + '褘') ^ var5) + 5804) ^ 12853))) << 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + '혚') + '褘') ^ var5) + 5804) ^ 12853))) >>> 7))))) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl() {
      this.lIlIiilIIi = true;
   }

   public boolean IlIlllIlilIl() {
      return this.iIlIiilIIi;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udd1e') ^ var5) >>> 11 | (char)((char)(var4[var5] ^ '\udd1e') ^ var5) << 5) ^ 7188) + '谓') ^ '\udd23') - '鼈') + var5))) - 112));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iliIiiliiiii() {
      return this.iIlIiilIIi;
   }

   public lIiIIiIiiIiIIiIi(long placedTick, Iiillilliillil tempCell, long id, long ownerCell, int purpose) {
      this.llIIiilIIi = placedTick;
      this.ilIIiilIIi = tempCell;
      this.IiIIiilIIi = id;
      this.liIIiilIIi = ownerCell;
      this.iiIIiilIIi = purpose;
   }

   public void iIlIlllllill() {
      this.iIlIiilIIi = true;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4725906093558936868L ^ Long.rotateLeft(7130851844496328151L, 57) ^ -723090015663641804L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5155834890929787508L ^ Long.rotateLeft(4854478418701591404L, 27) ^ -6420489548336956318L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3142956671237635325L ^ Long.rotateLeft(2219430473502411866L, 43) ^ -4321993729742063586L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2671928370941741727L ^ Long.rotateLeft(-3186722437324037926L, 15) ^ -8354407314790304170L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1312002299926626882L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2790258991539109246L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -737891757898229758L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4493821465622002063L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6952896569755296441L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4729993541807786816L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ '\uee82')) << 12 | (char)((char)((char)(var4[var5] - var5) ^ '\uee82')) >>> 4))))) ^ '蝬') ^ '뚸') - var5) + var5) << 8 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ '\uee82')) << 12 | (char)((char)((char)(var4[var5] - var5) ^ '\uee82')) >>> 4))))) ^ '蝬') ^ '뚸') - var5) + var5) >>> 8) ^ var5) ^ 32580))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)var4[var5] ^ 28366) - var5) ^ var5) ^ 6438))) << 6 | (char)(-((char)((char)((char)((char)((char)var4[var5] ^ 28366) - var5) ^ var5) ^ 6438))) >>> 10) - var5) >>> 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)var4[var5] ^ 28366) - var5) ^ var5) ^ 6438))) << 6 | (char)(-((char)((char)((char)((char)((char)var4[var5] ^ 28366) - var5) ^ var5) ^ 6438))) >>> 10) - var5) << 12))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) >>> 8 | (char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) << 8) + 28172) + var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) >>> 8 | (char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) << 8) + 28172) + var5) >>> 5) ^ var5) + var5) ^ var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) >>> 8 | (char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) << 8) + 28172) + var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) >>> 8 | (char)((char)((char)(var4[var5] + 14330) >>> 8 | (char)(var4[var5] + 14330) << 8) - 2676) << 8) + 28172) + var5) >>> 5) ^ var5) + var5) ^ var5) >>> 7) - var5) ^ var5) - '莤') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi() {
      return this.IIlIiilIIi;
   }

   public String toString() {
      return IiIlliIliiIl<invokedynamic>() + this.llIIiilIIi + IiIlliIliiIl<invokedynamic>() + this.ilIIiilIIi + IiIlliIliiIl<invokedynamic>() + this.IiIIiilIIi + IiIlliIliiIl<invokedynamic>() + this.liIIiilIIi + IiIlliIliiIl<invokedynamic>() + this.IIlIiilIIi + IiIlliIliiIl<invokedynamic>() + this.lIlIiilIIi + IiIlliIliiIl<invokedynamic>() + this.iIlIiilIIi + IiIlliIliiIl<invokedynamic>();
   }

   public boolean lIiiIiIlilli() {
      return this.lIlIiilIIi;
   }

   public void IliIlllilIi() {
      this.IIlIiilIIi = true;
   }

   public boolean IIIllIIliIIl(int settleTicks, int now) {
      return this.IIlIiilIIi && this.lIlIiilIIi && !this.iIlIiilIIi && settleTicks - this.iiIIiilIIi >= now;
   }
}
