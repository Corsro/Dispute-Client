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

public record liIiliIliiIiliIl(long targetBlock, boolean desiredWaterlogged, int bucketSlot, long interactionBlock, int interactionFace, double hitX, double hitY, double hitZ, long expectedFluidTarget, boolean containerInteractionRisk, long geometryFingerprint) {
   private final boolean iiiiiiiIll;
   private final boolean IIiiiiiIll;
   private final long iIiiiiiIll;
   private final double IiiiiiiIll;
   private final long IIIIIIIlll;
   private final int IliiiiiIll;
   private final double lliiiiiIll;
   private final long liiiiiiIll;
   private final long iiliiiiIll;
   private final int lIiiiiiIll;
   private final double iliiiiiIll;
   public static final int iIIIIIIlll = 8;
   public static final int lIIIIIIlll = 2;

   public int IlIlllIlilIl() {
      return this.lIiiiiiIll;
   }

   public static long liiiIIllIl(long hitBlockFillable, boolean sideOrdinal, int hitBlock) {
      long var7 = 2199038369072414568L;
      long var9 = -3771362368716851353L;
      if (sideOrdinal) {
         return hitBlockFillable;
      } else {
         var7 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(hitBlockFillable) << 32 ^ var7) & -1L << 32;
         var7 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(hitBlockFillable) ^ var7) & -1L >>> 32;
         var9 ^= ((long)llIiIiililIiIiil.Illlllllilll(hitBlockFillable) << 32 ^ var9) & -1L << 32;
         long var10000;
         switch (hitBlock) {
            case 0 -> var10000 = llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7 - 1, (int)(var9 >>> 32));
            case 1 -> var10000 = llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7 + 1, (int)(var9 >>> 32));
            case 2 -> var10000 = llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32) - 1);
            case 3 -> var10000 = llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32) + 1);
            case 4 -> var10000 = llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32) - 1, (int)var7, (int)(var9 >>> 32));
            default -> var10000 = llIiIiililIiIiil.IIIllIIliIIl((int)(var7 >>> 32) + 1, (int)var7, (int)(var9 >>> 32));
         }

         return var10000;
      }
   }

   public static liIiliIliiIiliIl iIlIlllllill(long bucketSlot, boolean hz, int desired, long side, boolean fingerprint, int container, double hitBlock, double hx, double hy, boolean target, long hitBlockFillable) {
      long var17 = liiiIIllIl(side, fingerprint, container);
      return side == bucketSlot && var17 == bucketSlot ? new liIiliIliiIiliIl(bucketSlot, hz, desired, side, container, hitBlock, hx, hy, var17, target, hitBlockFillable) : null;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) >>> 3 | (char)(var4[var5] << 12 | var4[var5] >>> 4) << 13))) ^ 7267))) - 11041) + 1791) + 19134) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi(long sideNow, boolean hitBlockNow, int fillableNow) {
      return sideNow == this.iIiiiiiIll && liiiIIllIl(sideNow, hitBlockNow, fillableNow) == this.liiiiiiIll;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2))))) ^ var5) - 'ꐣ') + 30430) ^ var5) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2))))) ^ var5) - 'ꐣ') + 30430) ^ var5) ^ var5) << 9))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2))))) ^ var5) - 'ꐣ') + 30430) ^ var5) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-var4[var5]) << 14 | (char)(-var4[var5]) >>> 2))))) ^ var5) - 'ꐣ') + 30430) ^ var5) ^ var5) << 9))) >>> 7) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIIllIIliIIl() {
      return this.IIiiiiiIll;
   }

   public double Iilllilliill() {
      return this.iliiiiiIll;
   }

   public long IiIlliIliiIl() {
      return this.iIiiiiiIll;
   }

   public liIiliIliiIiliIl(long targetBlock, boolean interactionBlock, int expectedFluidTarget, long bucketSlot, int hitX, double interactionFace, double geometryFingerprint, double hitZ, long containerInteractionRisk, boolean hitY, long desiredWaterlogged) {
      this.iiliiiiIll = targetBlock;
      this.IIiiiiiIll = interactionBlock;
      this.lIiiiiiIll = expectedFluidTarget;
      this.iIiiiiiIll = bucketSlot;
      this.IliiiiiIll = hitX;
      this.lliiiiiIll = interactionFace;
      this.iliiiiiIll = geometryFingerprint;
      this.IiiiiiiIll = hitZ;
      this.liiiiiiIll = containerInteractionRisk;
      this.iiiiiiiIll = hitY;
      this.IIIIIIIlll = desiredWaterlogged;
   }

   public boolean Iiilliiliiil() {
      return this.iiiiiiiIll;
   }

   public static lilliiIiiilliiIi IliIlllilIi(boolean waterloggable, boolean isWaterlogged, boolean wantWaterlogged) {
      if (waterloggable && isWaterlogged != wantWaterlogged) {
         return isWaterlogged ? lilliiIiiilliiIi.llIllIIlIi : lilliiIiiilliiIi.ilIllIIlIi;
      } else {
         return lilliiIiiilliiIi.IlIllIIlIi;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1552294978540090730L ^ Long.rotateLeft(-5733092276896681575L, 54) ^ 8648437494245257250L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6089687813693142648L ^ Long.rotateLeft(7294998697504568784L, 18) ^ 1754065207193078297L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8586902446928432574L ^ Long.rotateLeft(-1910796566573881930L, 40) ^ 3357760306214873522L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4732005785677978641L ^ Long.rotateLeft(-6980522239175551496L, 56) ^ -4654471577684022522L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -842663939584974087L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6246378021240868273L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7890482484413762300L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5922281502772772954L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7658189572956130472L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2336655197302857128L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIiliIiiiIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlilIliiIli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illillliilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilililiiili<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiilIiiiIii<invokedynamic>());
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
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) - var5) - var5) + '辔') - var5) - 128) + 14606) - 7889) ^ var5) ^ var5) - 2500));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iliIiiliiiii() {
      return this.iiliiiiIll;
   }

   public double Illlllllilll() {
      return this.lliiiiiIll;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] + 5472) ^ var5) ^ var5) + '軎') + 21757))))) ^ var5))) + '\ud8ba')));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String lIiiIiIlilli() {
      return String.format(Locale.ROOT, IlIillIiilIi<invokedynamic>(), llIiIiililIiIiil.IlIlllIlilIl(this.iiliiiiIll), this.IIiiiiiIll, this.lIiiiiiIll, llIiIiililIiIiil.IlIlllIlilIl(this.iIiiiiiIll), this.IliiiiiIll, this.lliiiiiIll, this.iliiiiiIll, this.IiiiiiiIll, llIiIiililIiIiil.IlIlllIlilIl(this.liiiiiiIll), this.iiiiiiiIll, Long.toUnsignedString(this.IIIIIIIlll));
   }

   public double IIillIiliIil() {
      return this.IiiiiiiIll;
   }

   public long IIIilIIiiIIi() {
      return this.IIIIIIIlll;
   }

   public int IIlllIlliIll() {
      return this.IliiiiiIll;
   }

   public long Ililllililil() {
      return this.liiiiiiIll;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) << 14 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) >>> 2) >>> 8 | (char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) << 14 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) >>> 2) << 8))) - '쁯') << 12 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) << 14 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) >>> 2) >>> 8 | (char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) << 14 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) << 10 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) + var5) ^ var5) - 14224) ^ '떎'))))) + 14723))) >>> 6) >>> 2) << 8))) - '쁯') >>> 4) ^ var5) ^ '莤') - 2566));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
