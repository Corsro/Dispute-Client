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

public record ilililiIiilili(long maxUnitPrice, IiIiIliliIiIli reason, long spendingLimit, long lastPaid, double jump) {
   private final double ilIllIlIIl;
   private final long lIIllIlIIl;
   private final long llIllIlIIl;
   private final long IlIllIlIIl;
   private final IiIiIliliIiIli iIIllIlIIl;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(-((char)(var4[var5] ^ var5))) ^ '\ue398') - var5))) + var5))) >>> 13 | (char)(-((char)((char)(-((char)((char)((char)(-((char)(var4[var5] ^ var5))) ^ '\ue398') - var5))) + var5))) << 3) - var5) ^ var5))) - '\udbcf') - '쉠') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiIiIliliIiIli lIiiIiIlilli() {
      return this.iIIllIlIIl;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 15406) << 4 | (char)((char)(var4[var5] - var5) - 15406) >>> 12) ^ var5) - var5))) << 13 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 15406) << 4 | (char)((char)(var4[var5] - var5) - 15406) >>> 12) ^ var5) - var5))) >>> 3))))))) + var5) + '\ue7c5') ^ '\uf409'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IilliliilIIi() {
      return this.lIIllIlIIl;
   }

   public boolean IliIlllilIi() {
      return this.lIIllIlIIl > 0L;
   }

   public long IIIllIIliIIl() {
      return this.llIllIlIIl;
   }

   public String iIlIlllllill() {
      String var10000;
      switch (this.iIIllIlIIl.ordinal()) {
         case 0 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 1 -> var10000 = IiIlliIliiIl<invokedynamic>() + llIIilIiilIIilIi.liiiIIllIl(this.lIIllIlIIl) + IiIlliIliiIl<invokedynamic>();
         case 2 -> var10000 = IiIlliIliiIl<invokedynamic>() + lllIillillIill.iliIiiliiiii(this.ilIllIlIIl) + IiIlliIliiIl<invokedynamic>() + llIIilIiilIIilIi.liiiIIllIl(this.llIllIlIIl) + IiIlliIliiIl<invokedynamic>() + llIIilIiilIIilIi.liiiIIllIl(this.lIIllIlIIl) + IiIlliIliiIl<invokedynamic>();
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(~var4[var5]))) ^ 6101))) ^ '\uf76b') + '묧'))) - var5) + 21442) + 'ꪤ') ^ 21104) ^ '\ue9ee') ^ '鎱') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IlIlllIlilIl() {
      return this.ilIllIlIIl;
   }

   public ilililiIiilili(long lastPaid, IiIiIliliIiIli reason, long spendingLimit, long jump, double maxUnitPrice) {
      this.lIIllIlIIl = lastPaid;
      this.iIIllIlIIl = reason;
      this.IlIllIlIIl = spendingLimit;
      this.llIllIlIIl = jump;
      this.ilIllIlIIl = maxUnitPrice;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + '艪') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + '艪') + var5) << 10) - var5) + var5) ^ 22054) ^ 7271) - 1427))))) - var5) ^ var5) ^ 'ퟬ') << 7 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + '艪') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) ^ var5) + '艪') + var5) << 10) - var5) + var5) ^ 22054) ^ 7271) - 1427))))) - var5) ^ var5) ^ 'ퟬ') >>> 9))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) << 14 | (char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) >>> 2) ^ var5) + var5) + var5) << 5 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) << 14 | (char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) >>> 2) ^ var5) + var5) + var5) >>> 11) + 18535) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) << 14 | (char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) >>> 2) ^ var5) + var5) + var5) << 5 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) << 14 | (char)((char)(-((char)(~((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6))))) + var5) >>> 2) ^ var5) + var5) + var5) >>> 11) + 18535) - var5) << 2) - '븄'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iliIiiliiiii() {
      return this.IlIllIlIIl;
   }

   public boolean liiiIIllIl(long unitPrice) {
      return this.lIIllIlIIl <= 0L || unitPrice <= this.lIIllIlIIl;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3923355591811301824L ^ Long.rotateLeft(-4626627894592379522L, 1) ^ -482777226444130076L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3610901983080465319L ^ Long.rotateLeft(-1483454695512153645L, 28) ^ 7093957083405655241L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3100539364231003484L ^ Long.rotateLeft(-5319015610135522194L, 1) ^ -6466338142416782387L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4080825763144487603L ^ Long.rotateLeft(-7528686044173764746L, 54) ^ -960693239647578744L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -888089402278609511L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8680248046586322393L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 885989907089997606L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7206855329675358516L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4243053643584810257L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5363781228774276839L;
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
}
