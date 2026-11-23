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

public record iillilllIIililll(IIlIiiIilIlIiiIi eyeMode, boolean sneak, boolean guiSupport, double eyeHeight, int lookDirection, int supportFace, double bodyTolerance, double centreRadius, int nudgeTicks, int settleTicks) {
   private final double iliIiIlill;
   private final int lIIliIlill;
   private final double iiiIiIlill;
   private final boolean IliIiIlill;
   private final int liiIiIlill;
   public static final double IlIliIlill = 0.02;
   private final IIlIiiIilIlIiiIi iIiIiIlill;
   private final boolean lliIiIlill;
   private final int IiiIiIlill;
   private final int iIIliIlill;
   private final double IIIliIlill;

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-var4[var5]) - 28572) + var5))) + var5) + var5))) - 25289) + 17812))) - '뿿') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.liiIiIlill;
   }

   public static iillilllIIililll liiiIIllIl(IIlIiiIilIlIiiIi supportFace, boolean mode, int guiSupport, int lookDirection) {
      long var5 = 1319264007726633586L;
      var5 ^= ((long)(supportFace == IIlIiiIilIlIiiIi.illIiiiIIi ? 1 : 0) << 32 ^ var5) & -1L << 32;
      return new iillilllIIililll(supportFace, (int)(var5 >>> 32) != 0 || mode, mode, IliIlllilIi(supportFace), guiSupport, lookDirection, 0.3, 0.07, 30, 6);
   }

   public int Iiilliiliiil() {
      return this.iIIliIlill;
   }

   public boolean IIIllIIliIIl() {
      return this.IliIiIlill;
   }

   public boolean IlIlllIlilIl() {
      return this.lliIiIlill;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6100040281783343253L ^ Long.rotateLeft(7203814547322643998L, 10) ^ -939938980927613656L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1856957807229549554L ^ Long.rotateLeft(1115923420455891903L, 36) ^ 8271046938397971899L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8609032173636687200L ^ Long.rotateLeft(-8311730133296342684L, 7) ^ 242031985895686585L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3508063351890051251L ^ Long.rotateLeft(5558735919520419982L, 15) ^ -3412189508284489618L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2238173021924247288L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 9098530635432668349L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2530893296025665837L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2327796657390158761L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1320021335110509446L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1641760919862233817L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 21318) - 5271) << 5 | (char)((char)((char)(var4[var5] ^ var5) ^ 21318) - 5271) >>> 11) + var5) + '蝾'))) + 'ꔨ') + 32705) - var5) - var5) + '옯'))))) ^ var5))) >>> 10 | (char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 21318) - 5271) << 5 | (char)((char)((char)(var4[var5] ^ var5) ^ 21318) - 5271) >>> 11) + var5) + '蝾'))) + 'ꔨ') + 32705) - var5) - var5) + '옯'))))) ^ var5))) << 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIlllIlliIll() {
      return this.IiiIiIlill;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) << 10) << 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) << 10) >>> 12))) + var5) - var5) << 5 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) << 10) << 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) - var5) ^ var5) - 'ꓡ') ^ 12796) + var5) << 10) >>> 12))) + var5) - var5) >>> 11) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String lIiiIiIlilli() {
      return String.format(Locale.ROOT, IIIilIIiiIIi<invokedynamic>(), this.iIiIiIlill, this.IliIiIlill, this.lliIiIlill, this.iliIiIlill, this.IiiIiIlill, this.liiIiIlill, this.lIIliIlill, this.iIIliIlill);
   }

   public double Iilllilliill() {
      return this.iiiIiIlill;
   }

   public boolean iIlIlllllill(double sneaking, boolean eyeAboveFeet) {
      return eyeAboveFeet == this.IliIiIlill && Math.abs(sneaking - this.iliIiIlill) <= 0.02;
   }

   public double IIillIiliIil() {
      return this.IIIliIlill;
   }

   public boolean IilliliilIIi() {
      return Math.abs(this.iliIiIlill - IliIlllilIi(this.iIiIiIlill)) <= 1.0E-9 && this.IliIiIlill == (this.iIiIiIlill == IIlIiiIilIlIiiIi.illIiiiIIi || this.lliIiIlill) && (!this.lliIiIlill || this.iIiIiIlill == IIlIiiIilIlIiiIi.illIiiiIIi);
   }

   public IIlIiiIilIlIiiIi iliIiiliiiii() {
      return this.iIiIiIlill;
   }

   public int Ililllililil() {
      return this.lIIliIlill;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '꒜') ^ 1270) ^ '탒') + 16568) - var5) << 4 | (char)((char)((char)((char)((char)(var4[var5] - '꒜') ^ 1270) ^ '탒') + 16568) - var5) >>> 12) + var5) + 'ꫭ') + '骓') ^ 7272))))) - '踰'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double IliIlllilIi(IIlIiiIilIlIiiIi mode) {
      return mode == IIlIiiIilIlIiiIi.illIiiiIIi ? 1.27 : 1.62;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '뻞') ^ 2234) >>> 2 | (char)((char)(var4[var5] ^ '뻞') ^ 2234) << 14) ^ '\ud97e') ^ 21331) + '썸') + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '뻞') ^ 2234) >>> 2 | (char)((char)(var4[var5] ^ '뻞') ^ 2234) << 14) ^ '\ud97e') ^ 21331) + '썸') + var5) << 6) - 18894) + '踻') - '\uf451') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iillilllIIililll(IIlIiiIilIlIiiIi guiSupport, boolean sneak, boolean eyeHeight, double bodyTolerance, int supportFace, int settleTicks, double centreRadius, double eyeMode, int nudgeTicks, int lookDirection) {
      this.iIiIiIlill = guiSupport;
      this.IliIiIlill = sneak;
      this.lliIiIlill = eyeHeight;
      this.iliIiIlill = bodyTolerance;
      this.IiiIiIlill = supportFace;
      this.liiIiIlill = settleTicks;
      this.iiiIiIlill = centreRadius;
      this.IIIliIlill = eyeMode;
      this.lIIliIlill = nudgeTicks;
      this.iIIliIlill = lookDirection;
   }

   public double IiIlliIliiIl() {
      return this.iliIiIlill;
   }
}
