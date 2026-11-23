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

public record IiIilillliIilill(long id, long target, long stand, IIlIiiIilIlIiiIi eyeMode, double eyeX, double eyeY, double eyeZ, lIlIIiiliIlIIiil hit, double reach, double plannerDistance, long geometryFingerprint, iillilllIIililll pose) {
   private final IIlIiiIilIlIiiIi llIlIliill;
   private final long IlIlIliill;
   public static final int IillIliill = 30;
   private final lIlIIiiliIlIIiil iiIlIliill;
   private final iillilllIIililll IlllIliill;
   private static final double iillIliill = 1.0E-9;
   private final long iIllIliill;
   private final double lIllIliill;
   private final long lIIlIliill;
   public static final double llllIliill = 0.3;
   private final double IiIlIliill;
   private final double ilIlIliill;
   private final double IIllIliill;
   private final long iIIlIliill;
   private final double liIlIliill;
   public static final int lillIliill = 6;
   public static final double illlIliill = 0.07;

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3790901573138523341L ^ Long.rotateLeft(6113494955433832579L, 45) ^ 9206008944533817526L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2363049057755742817L ^ Long.rotateLeft(13272935469345097L, 62) ^ -7942374922665085606L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7670747082916573175L ^ Long.rotateLeft(2794379243627620778L, 52) ^ -7219327067981765036L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4325865477651249229L ^ Long.rotateLeft(-4688519933805853021L, 18) ^ 5147097574958089327L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4142087376769955187L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5093298877928339467L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2060108219509409208L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3271020625845466237L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2173841727833455124L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5212757233797394644L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIIlliIIl<invokedynamic>());
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

   public static IiIilillliIilill liiiIIllIl(long id, long mode, long eyeY, IIlIiiIilIlIiiIi stand, double eyeX, double reach, double eyeZ, lIlIIiiliIlIIiil hit, double target, long pose, iillilllIIililll geometryFingerprint) {
      if (hit != null && stand != null && geometryFingerprint != null && target > (double)0.0F) {
         if (geometryFingerprint.iliIiiliiiii() == stand && geometryFingerprint.IilliliilIIi()) {
            if (!iIlIlllllill(eyeY, reach, geometryFingerprint)) {
               return null;
            } else {
               double var19 = IilliliilIIi(eyeX, reach, eyeZ, hit);
               return var19 > target + 1.0E-9 ? null : new IiIilillliIilill(id, mode, eyeY, stand, eyeX, reach, eyeZ, hit, target, var19, pose, geometryFingerprint);
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public iillilllIIililll Iliilliiilii() {
      return this.IlllIliill;
   }

   public static double IilliliilIIi(double ex, double ey, double ez, lIlIIiiliIlIIiil h) {
      double var7 = h.iIlIlllllill() - ex;
      double var9 = h.IilliliilIIi() - ey;
      double var11 = h.lIiiIiIlilli() - ez;
      return Math.sqrt(var7 * var7 + var9 * var9 + var11 * var11);
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) + var5) + var5) + 12359) ^ var5) + 27458) - var5))) ^ '\uda74') - var5) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IlIlllIlilIl(double x, double z) {
      return Math.hypot(x - this.ilIlIliill, z - this.liIlIliill) <= this.IlllIliill.IIillIiliIil() + 1.0E-9;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) << 5 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) >>> 11) + 13424))) + var5) + '똠') >>> 8 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) << 5 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) >>> 11) + 13424))) + var5) + '똠') << 8))) << 15 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) << 5 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) >>> 11) + 13424))) + var5) + '똠') >>> 8 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) << 5 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + '\uf0fb'))))) - var5) ^ var5))) - '\uf150'))) >>> 11) + 13424))) + var5) + '똠') << 8))) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIlIIiiliIlIIiil IIlilIliiIli() {
      return this.iiIlIliill;
   }

   public double lIiiIiIlilli(double ez, double ey, double ex) {
      return IilliliilIIi(ez, ey, ex, this.iiIlIliill);
   }

   public double Illillliilli() {
      return this.IIllIliill;
   }

   public long Ililllililil() {
      return this.IlIlIliill;
   }

   public long IIiilIiiiIii() {
      return this.iIllIliill;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 5 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 11) - 9469) ^ var5) - 6559))) + 27695) + var5))))) - '\ud833') - '싸') + var5) ^ '豁'))) << 5 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 5 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 11) - 9469) ^ var5) - 6559))) + 27695) + var5))))) - '\ud833') - '싸') + var5) ^ '豁'))) >>> 11) - '\udd74') >>> 15 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 5 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 11) - 9469) ^ var5) - 6559))) + 27695) + var5))))) - '\ud833') - '싸') + var5) ^ '豁'))) << 5 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 5 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 11) - 9469) ^ var5) - 6559))) + 27695) + var5))))) - '\ud833') - '싸') + var5) ^ '豁'))) >>> 11) - '\udd74') << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iliIiiliiiii(double ey, double ez, double ex) {
      return this.lIiiIiIlilli(ey, ez, ex) <= this.IIllIliill + 1.0E-9;
   }

   public IiIilillliIilill(long eyeY, long eyeX, long eyeMode, IIlIiiIilIlIiiIi reach, double geometryFingerprint, double hit, double id, lIlIIiiliIlIIiil eyeZ, double target, double plannerDistance, long pose, iillilllIIililll stand) {
      this.lIIlIliill = eyeY;
      this.iIIlIliill = eyeX;
      this.IlIlIliill = eyeMode;
      this.llIlIliill = reach;
      this.ilIlIliill = geometryFingerprint;
      this.IiIlIliill = hit;
      this.liIlIliill = id;
      this.iiIlIliill = eyeZ;
      this.IIllIliill = target;
      this.lIllIliill = plannerDistance;
      this.iIllIliill = pose;
      this.IlllIliill = stand;
   }

   public static IiIilillliIilill IliIlllilIi(long geometryFingerprint, long eyeX, long id, IIlIiiIilIlIiiIi hit, double stand, double eyeZ, double eyeY, lIlIIiiliIlIIiil reach, double target, long mode) {
      return liiiIIllIl(geometryFingerprint, eyeX, id, hit, stand, eyeZ, eyeY, reach, target, mode, hit == null ? null : iillilllIIililll.liiiIIllIl(hit, false, -1, reach == null ? -1 : reach.liiiIIllIl()));
   }

   public boolean IiIlliIliiIl(double eyeAboveFeet, boolean sneaking) {
      return this.IlllIliill.iIlIlllllill(eyeAboveFeet, sneaking);
   }

   public boolean IIIllIIliIIl(double x, double z) {
      return Math.abs(x - this.ilIlIliill) <= this.IlllIliill.Iilllilliill() + 1.0E-9 && Math.abs(z - this.liIlIliill) <= this.IlllIliill.Iilllilliill() + 1.0E-9;
   }

   public double Iilililiiili() {
      return this.lIllIliill;
   }

   public long IIillIiliIil() {
      return this.iIIlIliill;
   }

   public double IlIillIiilIi() {
      return this.IiIlIliill;
   }

   public String Illlllllilll(double ex, double ez, double result, String ey) {
      return String.format(Locale.ROOT, Iiiiliiiiiii<invokedynamic>(), this.ilIlIliill, this.IiIlIliill, this.liIlIliill, ex, ez, result, this.iiIlIliill.iIlIlllllill(), this.iiIlIliill.IilliliilIIi(), this.iiIlIliill.lIiiIiIlilli(), this.lIllIliill, this.lIiiIiIlilli(ex, ez, result), this.IIllIliill, this.llIlIliill, this.lIIlIliill, Long.toUnsignedString(this.iIllIliill), this.IlllIliill.lIiiIiIlilli(), ey);
   }

   public static boolean IIlllIlliIll(double tz, double ez, double ey, int ex, int ty, int reach, double tx) {
      double var11 = (double)ex + (double)0.5F - tz;
      double var13 = (double)ty + (double)0.5F - ez;
      double var15 = (double)reach + (double)0.5F - ey;
      return var11 * var11 + var13 * var13 + var15 * var15 > tx * tx;
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-var4[var5]))) << 11 | (char)(-((char)(-var4[var5]))) >>> 5) ^ '샏') - var5))) - var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)(-((char)(-var4[var5]))) << 11 | (char)(-((char)(-var4[var5]))) >>> 5) ^ '샏') - var5))) - var5) << 6) - 20286))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(long pose, double stand, iillilllIIililll eyeY) {
      return Math.abs(stand - ((double)llIiIiililIiIiil.IIlllIlliIll(pose) + eyeY.IiIlliIliiIl())) <= 1.0E-6;
   }

   public double IiIiliIiiiIi() {
      return this.liIlIliill;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鑵') - var5) - var5) - 19709) + 5079) << 13 | (char)((char)((char)((char)((char)(var4[var5] + '鑵') - var5) - var5) - 19709) + 5079) >>> 3) + 15136) << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鑵') - var5) - var5) - 19709) + 5079) << 13 | (char)((char)((char)((char)((char)(var4[var5] + '鑵') - var5) - var5) - 19709) + 5079) >>> 3) + 15136) >>> 11) + '\ud84b') + var5) - 30647) - 22182));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IIIilIIiiIIi() {
      return this.ilIlIliill;
   }

   public IIlIiiIilIlIiiIi Iiilliiliiil() {
      return this.llIlIliill;
   }

   public long Iilllilliill() {
      return this.lIIlIliill;
   }
}
