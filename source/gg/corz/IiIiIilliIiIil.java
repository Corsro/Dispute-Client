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

public final class IiIiIilliIiIil {
   public static final double IlilIliIillilIliIi = 0.67;
   public static final String llllIliIiilllIliIi = "Jump";
   public static final String iillIliIiIIilIliIi = "Both";
   public static final String liIlIliIiiiIlIliIi = "Ring";
   public static final int lIilIliIiiIilIliIi = 4;
   public static final String IIllIliIilIllIliIi = "Block Wave";
   public static final String iIllIliIiIlllIliIi = "Both";
   public static final double liilIliIiiiilIliIi = (double)4.0F;
   public static final double ililIliIiIiilIliIi = 0.35;
   public static final String IillIliIilillIliIi = "Land";

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) << 5 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) >>> 11))))))) + var5) << 1 | (char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) << 5 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) >>> 11))))))) + var5) >>> 15) ^ '돆') >>> 10 | (char)((char)((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) << 5 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) >>> 11))))))) + var5) << 1 | (char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) << 5 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ 28421) - var5) << 3) + var5))) ^ var5) + '\uec74') << 13) >>> 11))))))) + var5) >>> 15) ^ '돆') << 6));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 9 | (char)((char)(var4[var5] ^ var5) ^ var5) << 7) >>> 14 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 9 | (char)((char)(var4[var5] ^ var5) ^ var5) << 7) << 2) + var5))) ^ '\udd5f') ^ '\ue7d3') ^ '빽'))) - '큪') + 1603));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IiIiIilliIiIil() {
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)(~((char)(var4[var5] + var5))))) + var5))))) + '꩞') + '蒝') + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IilliliilIIi(boolean wasOnGround, boolean airTicks, int onGround) {
      return !wasOnGround && airTicks && onGround >= (~(590560831 + -55) ^ -590560781);
   }

   public static boolean IliIlllilIi(String style) {
      return !IlIlllIlilIl<invokedynamic>().equals(style);
   }

   public static boolean IIIllIIliIIl(double groundY, double x, double z, double y, double groundZ, double groundX) {
      if (!Double.isNaN(groundY) && !Double.isNaN(x) && !Double.isNaN(z)) {
         double var12 = groundY - y;
         double var14 = x - groundZ;
         double var16 = z - groundX;
         return var12 * var12 + var16 * var16 <= Double.longBitsToDouble(3562645755538105804L ^ 8160820975083382220L) && Math.abs(var14) <= Double.longBitsToDouble(-7286533347262496794L ^ -2670343729207738394L);
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) + var5) ^ '钝') + 8942) ^ '閵') + var5))) ^ var5) - '\ue818') - var5))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) + var5) ^ '钝') + 8942) ^ '閵') + var5))) ^ var5) - '\ue818') - var5))) << 2) ^ '뮊'))) + var5) << 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) + var5) ^ '钝') + 8942) ^ '閵') + var5))) ^ var5) - '\ue818') - var5))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) + var5) ^ '钝') + 8942) ^ '閵') + var5))) ^ var5) - '\ue818') - var5))) << 2) ^ '뮊'))) + var5) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(boolean velocityY, boolean onGround, double wasOnGround) {
      return velocityY && !onGround && wasOnGround > Double.longBitsToDouble(-2192691264044390342L ^ -2438585466663882336L);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)var4[var5] - var5) << 8 | (char)((char)var4[var5] - var5) >>> 8) - var5) + '셭') + var5))) ^ 'ꇿ') + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6848523086697256228L ^ Long.rotateLeft(3385330453387914686L, 22) ^ -3800545679905273361L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1452486986557342184L ^ Long.rotateLeft(883771629737369413L, 39) ^ -3521422816086168328L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6223267644394421366L ^ Long.rotateLeft(-3742193119621351034L, 7) ^ -6315880954081906063L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3819258843563704734L ^ Long.rotateLeft(-7639836295300910832L, 5) ^ 5102323108325785749L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5801205975572662070L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3687054426619124740L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1200561081151896382L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4683017718177484914L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6857746236125619663L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9185127461558210303L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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

   public static double iliIiiliiiii(double fallVelocityY) {
      if (!(fallVelocityY < Double.longBitsToDouble(758906329237387476L ^ 758906329237387476L))) {
         return Double.longBitsToDouble(3497741542839844857L ^ 1106793696096819615L);
      } else {
         double var2 = -fallVelocityY / Double.longBitsToDouble(-6676620004071105413L ^ -7155496497514471158L);
         return var2 < Double.longBitsToDouble(-8102384928179049360L ^ -5739576383100761578L) ? Double.longBitsToDouble(8790453953434794266L ^ 5056294631706124156L) : (var2 > Double.longBitsToDouble(-4964606732615550169L ^ -8869227609545770201L) ? (double)1.0F : var2);
      }
   }

   public static boolean lIiiIiIlilli(String trigger, boolean landed, boolean jumped) {
      long var5 = 1919690324793738098L;
      var5 ^= ((long)(!IlIlllIlilIl<invokedynamic>().equals(trigger) ? 1 : 0) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)(!IlIlllIlilIl<invokedynamic>().equals(trigger) && !IlIlllIlilIl<invokedynamic>().equals(trigger) ? 0 : 1) ^ var5) & -1L >>> 32;
      return landed && (int)(var5 >>> 32) != 0 || jumped && (int)var5 != 0;
   }

   public static boolean liiiIIllIl(String style) {
      return IlIlllIlilIl<invokedynamic>().equals(style) || IlIlllIlilIl<invokedynamic>().equals(style);
   }
}
