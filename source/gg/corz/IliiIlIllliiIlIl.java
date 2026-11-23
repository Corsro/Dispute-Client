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

public record IliiIlIllliiIlIl(boolean go, IIIillIllIIillIl reason, double roi, IiiIlIiliiIlIi best) {
   private final IIIillIllIIillIl ilIlllIiIl;
   private final IiiIlIiliiIlIi liIlllIiIl;
   private final boolean llIlllIiIl;
   private final double IiIlllIiIl;

   public IIIillIllIIillIl iIlIlllllill() {
      return this.ilIlllIiIl;
   }

   public String IliIlllilIi() {
      return (this.llIlllIiIl ? iliIiiliiiii<invokedynamic>() : iliIiiliiiii<invokedynamic>()) + iliIiiliiiii<invokedynamic>() + this.ilIlllIiIl + iliIiiliiiii<invokedynamic>() + String.format(Locale.ROOT, iliIiiliiiii<invokedynamic>(), this.IiIlllIiIl) + (this.liIlllIiIl == null ? "" : iliIiiliiiii<invokedynamic>() + this.liIlllIiIl.iIlIlllllill());
   }

   public IliiIlIllliiIlIl(boolean roi, IIIillIllIIillIl best, double go, IiiIlIiliiIlIi reason) {
      this.llIlllIiIl = roi;
      this.ilIlllIiIl = best;
      this.IiIlllIiIl = go;
      this.liIlllIiIl = reason;
   }

   public boolean liiiIIllIl() {
      return this.llIlllIiIl;
   }

   public double IilliliilIIi() {
      return this.IiIlllIiIl;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] - '\uecf6') + var5) + 1856))) ^ var5) >>> 5 | (char)((char)(~((char)((char)((char)(var4[var5] - '\uecf6') + var5) + 1856))) ^ var5) << 11))) ^ var5) >>> 12 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] - '\uecf6') + var5) + 1856))) ^ var5) >>> 5 | (char)((char)(~((char)((char)((char)(var4[var5] - '\uecf6') + var5) + 1856))) ^ var5) << 11))) ^ var5) << 4) + var5) + var5) - '\udfbb') + '\ue150'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 1169) ^ 505) + var5))) + var5) >>> 12 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 1169) ^ 505) + var5))) + var5) << 4) - 30505) ^ '칹'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiiIlIiliiIlIi lIiiIiIlilli() {
      return this.liIlllIiIl;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 15 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 1) - 6353))))) - var5) >>> 11 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 15 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 1) - 6353))))) - var5) << 5) - 11703))) >>> 6 | (char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 15 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 1) - 6353))))) - var5) >>> 11 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 15 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 1) - 6353))))) - var5) << 5) - 11703))) << 10))) + var5) + var5) - '\ue484') ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4325973321772179246L ^ Long.rotateLeft(-7750243787063938807L, 33) ^ -3786259369902853066L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5025229717146569285L ^ Long.rotateLeft(-5052586145112664201L, 47) ^ -3030816236984856229L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4274841185450803453L ^ Long.rotateLeft(-7475386020931849809L, 4) ^ 6379085562833977265L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6708515230707999643L ^ Long.rotateLeft(6154575381065488584L, 14) ^ -8497037250899791507L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5490470839976876463L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4767889871507286570L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1057403206686501355L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6280229091686913021L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -449828085349335195L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2491713025034084254L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) >>> 13) + 4609) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) >>> 13) + 4609) >>> 3) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) >>> 13) + 4609) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) >>> 5 | (char)((char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) >>> 14 | (char)((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14) - var5) << 2) << 11) << 9) >>> 13) + 4609) >>> 3) << 7));
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
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ var5)) << 4 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ var5)) >>> 12) - '\udfb4') + var5) + '횠') - var5) + var5) - 18956) + 30441) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
