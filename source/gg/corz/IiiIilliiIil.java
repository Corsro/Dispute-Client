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

public record IiiIilliiIil(int id, String kind, int plannedMembers, int attempted, int confirmed, int tempPlaced, int tempRemoved, double travel, int jumpTransitions, int verticalTransitions, int durationTicks, ilIiiIiIiIiiIi yieldReason) {
   private final String iIilIlliIlilIlli;
   private final int IiilIlliliilIlli;
   private final int IIilIllilIilIlli;
   private final int IlIiIllillIiIlli;
   private final double ilIiIlliIiIiIlli;
   private final ilIiiIiIiIiiIi llliIlliilliIlli;
   private final int IIliIllilIliIlli;
   private final int llilIlliililIlli;
   private final int liIiIlliiiIiIlli;
   private final int iIliIlliIlliIlli;
   private final int iiilIlliIIIiIlli;
   private final int lIIiIlliiIIiIlli;

   public int Iilllilliill() {
      return this.IIliIllilIliIlli;
   }

   public int IiIlliIliiIl() {
      return this.IlIiIllillIiIlli;
   }

   public String liiiIIllIl() {
      return String.format(Locale.ROOT, Iiilliiliiil<invokedynamic>(), this.IIilIllilIilIlli, this.iIilIlliIlilIlli, this.llilIlliililIlli, this.IiilIlliliilIlli, this.iiilIlliIIIiIlli, this.lIIiIlliiIIiIlli, this.IlIiIllillIiIlli, this.ilIiIlliIiIiIlli, this.liIiIlliiiIiIlli, this.IIliIllilIliIlli, this.iIliIlliIlliIlli, this.llliIlliilliIlli);
   }

   public String IilliliilIIi() {
      return this.iIilIlliIlilIlli;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) << 15) + var5) - '鳎') - '쳚') << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) << 15) + var5) - '鳎') - '쳚') >>> 8) ^ '흟') >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) << 15) + var5) - '鳎') - '쳚') << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ var5))) - '鰣'))) - var5) ^ var5) << 15) + var5) - '鳎') - '쳚') >>> 8) ^ '흟') << 12) ^ 31857) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiiIilliiIil(int tempRemoved, String kind, int jumpTransitions, int durationTicks, int id, int attempted, int travel, double yieldReason, int plannedMembers, int tempPlaced, int verticalTransitions, ilIiiIiIiIiiIi confirmed) {
      this.IIilIllilIilIlli = tempRemoved;
      this.iIilIlliIlilIlli = kind;
      this.llilIlliililIlli = jumpTransitions;
      this.IiilIlliliilIlli = durationTicks;
      this.iiilIlliIIIiIlli = id;
      this.lIIiIlliiIIiIlli = attempted;
      this.IlIiIllillIiIlli = travel;
      this.ilIiIlliIiIiIlli = yieldReason;
      this.liIiIlliiiIiIlli = plannedMembers;
      this.IIliIllilIliIlli = tempPlaced;
      this.iIliIlliIlliIlli = verticalTransitions;
      this.llliIlliilliIlli = confirmed;
   }

   public int IIillIiliIil() {
      return this.iIliIlliIlliIlli;
   }

   public int IlIlllIlilIl() {
      return this.lIIiIlliiIIiIlli;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) >>> 1 | (char)((char)((char)(~var4[var5]) - var5) - var5) << 15) + '쿰'))) + 5185) - var5) ^ var5) - '\ud859'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.IiilIlliliilIlli;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) >>> 10) + '\uf5f3') ^ 14275) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) >>> 10) + '\uf5f3') ^ 14275) << 7) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) >>> 10) + '\uf5f3') ^ 14275) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - 18071) ^ var5) ^ 26820) - 13988) >>> 5) - var5)) >>> 10) + '\uf5f3') ^ 14275) << 7) - var5) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill() {
      return this.IIilIllilIilIlli;
   }

   public double IIlllIlliIll() {
      return this.ilIiIlliIiIiIlli;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 16288) ^ var5) ^ '뻇') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 16288) ^ var5) ^ '뻇') << 13) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 16288) ^ var5) ^ '뻇') >>> 3 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 16288) ^ var5) ^ '뻇') << 13) << 5))) + 28908) ^ var5) ^ var5) ^ '酬'))))) - 23898));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.liIiIlliiiIiIlli;
   }

   public int IIIllIIliIIl() {
      return this.iiilIlliIIIiIlli;
   }

   public ilIiiIiIiIiiIi Ililllililil() {
      return this.llliIlliilliIlli;
   }

   public double IliIlllilIi() {
      return this.iIliIlliIlliIlli <= 0 ? (double)0.0F : (double)this.iiilIlliIIIiIlli * (double)20.0F / (double)this.iIliIlliIlliIlli;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 7 | (char)(var4[var5] ^ var5) << 9) + '袮'))) ^ var5))) - '뺻') << 9 | (char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 7 | (char)(var4[var5] ^ var5) << 9) + '袮'))) ^ var5))) - '뺻') >>> 7))) + var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 235479088680912291L ^ Long.rotateLeft(5675454885379249409L, 18) ^ 3652626958942319715L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5782696869539179845L ^ Long.rotateLeft(-9211490486865522324L, 1) ^ 2447457435440134324L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6718437949118015505L ^ Long.rotateLeft(8550331281689049922L, 19) ^ -3471436391370229437L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4563678128576062791L ^ Long.rotateLeft(1453925639603669482L, 63) ^ -251974501679909622L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2324130741837804189L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8898971864152266701L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2390351616292313126L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4311565302704445443L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7055167019552785698L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6530324558257802642L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   public int lIiiIiIlilli() {
      return this.llilIlliililIlli;
   }
}
