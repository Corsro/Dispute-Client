package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIllliIliIllliIl {
   public long iiIIiiiIll;
   public long lIlIiiiIll;
   public long iIlIiiiIll;
   public long IllIiiiIll;
   public static final int IiIIiiiIll = 6;
   public long IIlIiiiIll;
   public long lllIiiiIll;
   private final Map<lliiIiIliliiIiIl, llIiiIililIiiIil> liIIiiiIll = new HashMap();

   public String Illlllllilll() {
      return String.format(Locale.ROOT, Iilllilliill<invokedynamic>(), this.iiIIiiiIll, this.IIlIiiiIll, this.lIlIiiiIll, this.iIlIiiiIll, this.IllIiiiIll, this.lllIiiiIll, this.IIlllIlliIll());
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3434684595210372929L ^ Long.rotateLeft(-3770787183742553800L, 55) ^ 8033552769028910888L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2562374671351998729L ^ Long.rotateLeft(-47533025756763517L, 40) ^ -8185382593455706244L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4811080021601618126L ^ Long.rotateLeft(-7119842880235522685L, 38) ^ 6848530175981668472L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3816502901079544966L ^ Long.rotateLeft(3056012317456289602L, 38) ^ -6962076972408054771L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5638481323746033983L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6039216537759999411L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8610928573976530727L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3831146907398219898L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2962449292039726828L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7562034455672748994L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public void lIiiIiIlilli(lliiIiIliliiIiIl why, llIiiIililIiiIil key) {
      if (this.liIIiiiIll.size() > 512) {
         this.liIIiiiIll.clear();
      }

      this.liIIiiiIll.put(why, key);
      ++this.lIlIiiiIll;
   }

   public double IIlllIlliIll() {
      return this.IllIiiiIll == 0L ? (double)this.lllIiiiIll : (double)this.lllIiiiIll / (double)this.IllIiiiIll;
   }

   public llIiiIililIiiIil iliIiiliiiii(lliiIiIliliiIiIl key) {
      return (llIiiIililIiiIil)this.liIIiiiIll.getOrDefault(key, llIiiIililIiiIil.iilIlilIil);
   }

   public int IlIlllIlilIl() {
      return this.liIIiiiIll.size();
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) ^ var5) << 12 | (char)((char)(-((char)((char)(~var4[var5]) + var5))) ^ var5) >>> 4))) + '\ue3b9') ^ '蛚') >>> 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) ^ var5) << 12 | (char)((char)(-((char)((char)(~var4[var5]) + var5))) ^ var5) >>> 4))) + '\ue3b9') ^ '蛚') << 12))) + var5) + var5))) ^ var5) + 27921))) - 26076));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') << 3) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') << 3) << 6) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') << 3) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) << 5 | (char)((char)((char)(-((char)(var4[var5] ^ '谋'))) - var5) ^ var5) >>> 11) - '裏') + 26189) << 11)) + '\uf6f5') << 3) << 6) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) + var5) ^ var5) ^ var5))) << 1 | (char)(-((char)((char)((char)((char)(-var4[var5]) + var5) ^ var5) ^ var5))) >>> 15) + 23143))) ^ '龥') >>> 3 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) + var5) ^ var5) ^ var5))) << 1 | (char)(-((char)((char)((char)((char)(-var4[var5]) + var5) ^ var5) ^ var5))) >>> 15) + 23143))) ^ '龥') << 13) ^ '쟰') + var5))))) ^ var5) + 28514) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(int memberPlacements, int memberClicks, llIiiIililIiiIil consecutiveBlockedTicks, int blocker) {
      return memberPlacements == 0 && memberClicks == 0 && liiiIIllIl(consecutiveBlockedTicks) && blocker >= 6;
   }

   public boolean IIIllIIliIIl(lliiIiIliliiIiIl key) {
      return this.liIIiiiIll.containsKey(key);
   }

   public static boolean liiiIIllIl(llIiiIililIiiIil reject) {
      return reject == llIiiIililIiiIil.IIiIlilIil || reject == llIiiIililIiiIil.lIiIlilIil || reject == llIiiIililIiiIil.iliIlilIil || reject == llIiiIililIiiIil.IiiIlilIil || reject == llIiiIililIiiIil.lliIlilIil;
   }

   public static String IliIlllilIi(String ticksWithoutAction, int kind, int clicks, int placements, String geometryFingerprint, long blockingReason) {
      return String.format(Locale.ROOT, Iilllilliill<invokedynamic>(), ticksWithoutAction, kind, clicks, placements, geometryFingerprint, blockingReason);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 20427) - 25384) + '봑') - var5) + '\ud95c') - 26686) + var5) - 'ꍮ') - var5))) - '荵') - '髅'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') >>> 9 | (char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') << 7) ^ 19868) ^ var5) - var5) + 29504) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') >>> 9 | (char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') << 7) ^ 19868) ^ var5) - var5) + 29504) >>> 11) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') >>> 9 | (char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') << 7) ^ 19868) ^ var5) - var5) + 29504) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') >>> 9 | (char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) >>> 9 | (char)(-((char)(~((char)((char)(var4[var5] + var5) - 24098))))) << 7) + 3822) - 'ꚠ') << 7) ^ 19868) ^ var5) - var5) + 29504) >>> 11) << 1) ^ '뀹'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IiIlliIliiIl() {
      this.liIIiiiIll.clear();
      this.iiIIiiiIll = this.IIlIiiiIll = this.lIlIiiiIll = this.iIlIiiiIll = this.IllIiiiIll = this.lllIiiiIll = 0L;
   }

   public static boolean IilliliilIIi(int consecutiveBlockedTicks, int blocker, llIiiIililIiiIil clicks, int placements) {
      return consecutiveBlockedTicks == 0 && blocker == 0 && liiiIIllIl(clicks) && placements >= 6;
   }
}
