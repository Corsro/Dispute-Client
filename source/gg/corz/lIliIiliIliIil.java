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

public record lIliIiliIliIil(int teleportId, boolean absolute, int relativeFlags, double beforeX, double beforeY, double beforeZ, float beforeYaw, float beforePitch, double afterX, double afterY, double afterZ, float afterYaw, float afterPitch) {
   private final double IiiiIliIiliiiIliIi;
   private final boolean IiIiIliIiliIiIliIi;
   private final int llIiIliIiilIiIliIi;
   public static final double IlIIlliIillIIlliIi = 0.05;
   private final float lIIIlliIiiIIIlliIi;
   private final float IIiiIliIilIiiIliIi;
   private final double lIliIliIiiIliIliIi;
   public static final double ilIIlliIiIiIIlliIi = (double)0.5F;
   private final float iiiiIliIiIIIIlliIi;
   private final double IlliIliIillliIliIi;
   private final double illiIliIiIiliIliIi;
   private final int iiIiIliIiIIliIliIi;
   private final double iIiiIliIiIliiIliIi;
   private final float liliIliIiiiliIliIi;
   private final double lliiIliIiiliiIliIi;

   public double iIlIlllllill() {
      return this.IiiiIliIiliiiIliIi - this.illiIliIiIiliIliIi;
   }

   public double liiiIIllIl() {
      return this.lliiIliIiiliiIliIi - this.IlliIliIillliIliIi;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + 12424) >>> 4 | (char)((char)(var4[var5] ^ var5) + 12424) << 12))))) << 1 | (char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + 12424) >>> 4 | (char)((char)(var4[var5] ^ var5) + 12424) << 12))))) >>> 15) + 26314) ^ var5))))) ^ 783) - var5) + var5) ^ var5) - var5) << 3 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + 12424) >>> 4 | (char)((char)(var4[var5] ^ var5) + 12424) << 12))))) << 1 | (char)(-((char)(-((char)((char)((char)(var4[var5] ^ var5) + 12424) >>> 4 | (char)((char)(var4[var5] ^ var5) + 12424) << 12))))) >>> 15) + 26314) ^ var5))))) ^ 783) - var5) + var5) ^ var5) - var5) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IIlilIliiIli() {
      return this.iIiiIliIiIliiIliIi;
   }

   public boolean IlIlllIlilIl() {
      return this.IilliliilIIi() >= 0.05 || Math.abs(this.lIiiIiIlilli()) >= (double)0.5F || Math.abs(this.iliIiiliiiii()) >= (double)0.5F;
   }

   public float Iliilliiilii() {
      return this.lIIIlliIiiIIIlliIi;
   }

   public double IilliliilIIi() {
      return Math.sqrt(this.IliIlllilIi() * this.IliIlllilIi() + this.liiiIIllIl() * this.liiiIIllIl() + this.iIlIlllllill() * this.iIlIlllllill());
   }

   public double Ililllililil() {
      return this.lIliIliIiiIliIliIi;
   }

   public double IliIlllilIi() {
      return this.iIiiIliIiIliiIliIi - this.lIliIliIiiIliIliIi;
   }

   public float IiIiliIiiiIi() {
      return this.IIiiIliIilIiiIliIi;
   }

   public double IIIilIIiiIIi() {
      return this.illiIliIiIiliIliIi;
   }

   public float IIiilIiiiIii() {
      return this.iiiiIliIiIIIIlliIi;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8324246701289287259L ^ Long.rotateLeft(1498114856479836478L, 39) ^ -3555205487535463403L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7124442273494548822L ^ Long.rotateLeft(-6820058952219166380L, 7) ^ -2583086774680245439L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7775009296682510500L ^ Long.rotateLeft(-2525553072935363270L, 21) ^ -3756049316791313229L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7088876085475623733L ^ Long.rotateLeft(1683565073715898816L, 49) ^ 3204824075415770612L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6126840633303289956L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7153368503171483522L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3714400759867180662L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5405869130358001036L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3410955985965949158L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5967377288791867494L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIIllIIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIIIlIlIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, llIIlilIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIIlliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiIIlIIlIl<invokedynamic>());
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

   static double IIIllIIliIIl(double deg) {
      deg %= (double)360.0F;
      if (deg >= (double)180.0F) {
         deg -= (double)360.0F;
      }

      if (deg < (double)-180.0F) {
         deg += (double)360.0F;
      }

      return deg;
   }

   public double lIiiIiIlilli() {
      return IIIllIIliIIl((double)(this.iiiiIliIiIIIIlliIi - this.liliIliIiiiliIliIi));
   }

   public double Illillliilli() {
      return this.lliiIliIiiliiIliIi;
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) << 13 | (char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) >>> 3) ^ var5) + '愈') - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) << 13 | (char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) >>> 3) ^ var5) + '愈') - var5) >>> 2) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) << 13 | (char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) >>> 3) ^ var5) + '愈') - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) << 13 | (char)((char)((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ var5))) - '鲗') + var5) >>> 3) ^ var5) + '愈') - var5) >>> 2) >>> 4))))) + '붔') - 2100));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) << 9 | (char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) >>> 7) ^ '蓔') << 6 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) << 9 | (char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) >>> 7) ^ '蓔') >>> 10))) - 18082))) + var5) - 31925) + '鲭') >>> 4 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) << 9 | (char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) >>> 7) ^ '蓔') << 6 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) << 9 | (char)((char)((char)((char)(-((char)(var4[var5] - var5))) << 10 | (char)(-((char)(var4[var5] - var5))) >>> 6) - var5) - 22170) >>> 7) ^ '蓔') >>> 10))) - 18082))) + var5) - 31925) + '鲭') << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iilllilliill() {
      return this.IiIiIliIiliIiIliIi;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') >>> 4) >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') >>> 4) << 8) << 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') >>> 4) >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) << 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '믾'))) + var5) ^ 26441) + 24466) >>> 6) >>> 2) << 15))) + var5) - 'Ꟈ') >>> 4) << 8) >>> 14) - '邅') ^ '쫳') + var5) ^ 10498));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double Iiilliiliiil() {
      return this.IlliIliIillliIliIi;
   }

   public static lIlliiIiiIlliiIi IIlllIlliIll(lIliIiliIliIil c, boolean preciseActionActive) {
      return c != null && c.IlIlllIlilIl() && preciseActionActive ? lIlliiIiiIlliiIi.lilIlIIlIi : lIlliiIiiIlliiIi.IilIlIIlIi;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ 24701) ^ var5) - var5) + 13708) - 24973) - var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ 24701) ^ var5) - var5) + 13708) - 24973) - var5) >>> 4) - '蹙') ^ var5) ^ var5) ^ '쮴') + 14613))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ 24701) ^ var5) - var5) + 13708) - 24973) - var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) ^ 24701) ^ var5) - var5) + 13708) - 24973) - var5) >>> 4) - '蹙') ^ var5) ^ var5) ^ '쮴') + 14613))) >>> 5) ^ 11734));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IiIlliIliiIl() {
      return String.format(Locale.ROOT, Iiiiliiiiiii<invokedynamic>(), this.llIiIliIiilIiIliIi, this.IiIiIliIiliIiIliIi, this.iiIiIliIiIIliIliIi, this.lIliIliIiiIliIliIi, this.IlliIliIillliIliIi, this.illiIliIiIiliIliIi, this.iIiiIliIiIliiIliIi, this.lliiIliIiiliiIliIi, this.IiiiIliIiliiiIliIi, this.IliIlllilIi(), this.liiiIIllIl(), this.iIlIlllllill(), this.IilliliilIIi(), this.liliIliIiiiliIliIi, this.IIiiIliIilIiiIliIi, this.iiiiIliIiIIIIlliIi, this.lIIIlliIiiIIIlliIi, this.IlIlllIlilIl());
   }

   public double Iilililiiili() {
      return this.IiiiIliIiliiiIliIi;
   }

   public int Illlllllilll() {
      return this.llIiIliIiilIiIliIi;
   }

   public lIliIiliIliIil(int beforePitch, boolean afterY, int afterX, double beforeYaw, double beforeX, double relativeFlags, float afterYaw, float teleportId, double beforeZ, double afterZ, double absolute, float afterPitch, float beforeY) {
      this.llIiIliIiilIiIliIi = beforePitch;
      this.IiIiIliIiliIiIliIi = afterY;
      this.iiIiIliIiIIliIliIi = afterX;
      this.lIliIliIiiIliIliIi = beforeYaw;
      this.IlliIliIillliIliIi = beforeX;
      this.illiIliIiIiliIliIi = relativeFlags;
      this.liliIliIiiiliIliIi = afterYaw;
      this.IIiiIliIilIiiIliIi = teleportId;
      this.iIiiIliIiIliiIliIi = beforeZ;
      this.lliiIliIiiliiIliIi = afterZ;
      this.IiiiIliIiliiiIliIi = absolute;
      this.iiiiIliIiIIIIlliIi = afterPitch;
      this.lIIIlliIiiIIIlliIi = beforeY;
   }

   public int IIillIiliIil() {
      return this.iiIiIliIiIIliIliIi;
   }

   public double iliIiiliiiii() {
      return (double)(this.lIIIlliIiiIIIlliIi - this.IIiiIliIilIiiIliIi);
   }

   public float IlIillIiilIi() {
      return this.liliIliIiiiliIliIi;
   }
}
