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

public record lIIlIliiIIlIli(iiiIIiilIIIlIiil type, long fromFeet, long toFeet, double supportTop, double landingY, double landingMinX, double landingMaxX, double landingMinZ, double landingMaxZ, boolean headroomClear, int gapCells, int dropBlocks, boolean sprintRequired, boolean jumpRequired, boolean sneakForbidden, double takeoffNear, double takeoffFar, boolean narrowLanding, double brakeFrom, double maxTakeoffSpeed, int maxAirborneTicks, int completionWindowTicks, String reject) {
   private final boolean IliIIIIIIl;
   private final boolean lilIIIIIIl;
   private final int IIIlIIIIIl;
   private final long IIlIIIIIIl;
   private final boolean lIiIIIIIIl;
   private final double liiIIIIIIl;
   private final int lIIlIIIIIl;
   public static final double IIllIIIIIl = (double)2.5F;
   public static final double iiIlIIIIIl = 0.12;
   private final int IIiIIIIIIl;
   private final double lllIIIIIIl;
   private final double iliIIIIIIl;
   private final double IilIIIIIIl;
   private final long iiIIIIIIIl;
   private final double illIIIIIIl;
   private final double lliIIIIIIl;
   private final double iIlIIIIIIl;
   private final double iiiIIIIIIl;
   private final boolean IiiIIIIIIl;
   public static final double lIllIIIIIl = 0.6;
   public static final double ilIlIIIIIl = 0.26;
   public static final double llIlIIIIIl = 0.02;
   private final iiiIIiilIIIlIiil liIIIIIIIl;
   private final double lIlIIIIIIl;
   public static final double IiIlIIIIIl = 0.8;
   private final String iIIlIIIIIl;
   private final boolean iIiIIIIIIl;
   public static final double liIlIIIIIl = 0.24;
   private final int iilIIIIIIl;
   public static final int IlIlIIIIIl = 12;
   private final double IllIIIIIIl;

   public String lliIliliIl() {
      return this.iIIlIIIIIl;
   }

   public int IilliliilIIi() {
      return llIiIiililIiIiil.IIlllIlliIll(this.IIlIIIIIIl);
   }

   public boolean IIlllIlliIll(double y) {
      return Math.abs(y - this.iIlIIIIIIl) <= 0.02;
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] + var5))))) >>> 9 | (char)(-((char)(-((char)(var4[var5] + var5))))) << 7) ^ 20825) ^ var5) + var5))))) + var5) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIIllIIIl() {
      return this.IIiIIIIIIl;
   }

   public static lIIlIliiIIlIli Iilllilliill(iiiIIiilIIIlIiil supportTop, long headClear, long lowCoverTop, double to, double bodyClear, boolean type, boolean narrowLanding, boolean from) {
      long var32 = -5741747973849487373L;
      long var34 = 7639805449270827822L;
      long var36 = -3997203576917458811L;
      long var26 = 3612819426890566323L;
      long var28 = -7677405638285671717L;
      long var30 = 7535684220247572971L;
      var26 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(headClear) << 32 ^ var26) & -1L << 32;
      var26 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(headClear) ^ var26) & -1L >>> 32;
      var28 ^= ((long)llIiIiililIiIiil.Illlllllilll(headClear) << 32 ^ var28) & -1L << 32;
      var28 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(lowCoverTop) ^ var28) & -1L >>> 32;
      var30 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(lowCoverTop) << 32 ^ var30) & -1L << 32;
      var30 ^= ((long)llIiIiililIiIiil.Illlllllilll(lowCoverTop) ^ var30) & -1L >>> 32;
      var32 ^= ((long)Math.abs((int)var28 - (int)(var26 >>> 32)) << 32 ^ var32) & -1L << 32;
      var32 ^= ((long)Math.abs((int)var30 - (int)(var28 >>> 32)) ^ var32) & -1L >>> 32;
      var34 ^= ((long)(supportTop == iiiIIiilIIIlIiil.ilIIiillil ? 1 : 0) << 32 ^ var34) & -1L << 32;
      String var23 = null;
      double var21;
      if (bodyClear > (double)0.0F && bodyClear <= 0.26) {
         var21 = (double)((int)(var30 >>> 32)) + bodyClear;
      } else if (to >= 0.8) {
         var21 = (double)((int)(var30 >>> 32) - 1) + to;
      } else {
         var21 = (double)((int)(var30 >>> 32));
         var23 = to <= (double)0.0F ? IiiIlliiIl<invokedynamic>() : IiiIlliiIl<invokedynamic>();
      }

      if (var23 == null && !type) {
         var23 = IiiIlliiIl<invokedynamic>();
      }

      if (var23 == null && !narrowLanding) {
         var23 = IiiIlliiIl<invokedynamic>();
      }

      var34 ^= ((long)Math.max(0, (int)var26 - (int)(var30 >>> 32)) ^ var34) & -1L >>> 32;
      if (var23 == null && (int)(var34 >>> 32) != 0) {
         if ((int)(var32 >>> 32) == 2 && (int)var32 == 0 || (int)var32 == 2 && (int)(var32 >>> 32) == 0) {
            if ((int)(var30 >>> 32) > (int)var26) {
               var23 = IiiIlliiIl<invokedynamic>();
            } else if ((int)var34 > 1) {
               var23 = IiiIlliiIl<invokedynamic>();
            }
         } else {
            var23 = IiiIlliiIl<invokedynamic>();
         }
      }

      var36 ^= ((long)((int)(var34 >>> 32) != 0 ? 12 + 2 * (int)var34 + 4 : 0) << 32 ^ var36) & -1L << 32;
      return new lIIlIliiIIlIli(supportTop, headClear, lowCoverTop, to, var21, (double)((int)var28), (double)((int)var28) + (double)1.0F, (double)((int)var30), (double)((int)var30) + (double)1.0F, narrowLanding, (int)(var34 >>> 32) != 0 ? 1 : 0, (int)var34, false, (boolean)((int)(var34 >>> 32)), (boolean)((int)(var34 >>> 32)), (int)(var34 >>> 32) != 0 ? (double)1.5F : (double)0.0F, (int)(var34 >>> 32) != 0 ? 1.9 : (double)0.0F, from, (int)(var34 >>> 32) != 0 ? (double)2.5F : (double)0.0F, (int)(var34 >>> 32) != 0 ? (from ? 0.12 : 0.24) : Double.POSITIVE_INFINITY, (int)(var36 >>> 32), (int)(var34 >>> 32) != 0 ? 40 : 0, var23);
   }

   public double illIlIilIl() {
      return this.liiIIIIIIl;
   }

   public int iliIiiliiiii() {
      return llIiIiililIiIiil.IiIlliIliiIl(this.iiIIIIIIIl);
   }

   public boolean IiIlliIliiIl(double z, double x) {
      return z >= this.IllIIIIIIl && z < this.lllIIIIIIl && x >= this.illIIIIIIl && x < this.IilIIIIIIl;
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8430982607377868306L ^ Long.rotateLeft(-8624135123710408031L, 62) ^ 5687122265008749269L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5184112086952596689L ^ Long.rotateLeft(2148399037210709215L, 6) ^ -1261190012416880992L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5366372386546027086L ^ Long.rotateLeft(6771363112457899292L, 56) ^ 6111128275805809087L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 394124766549372480L ^ Long.rotateLeft(2196293743649934848L, 25) ^ 5137623050380234734L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5159617229284787123L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1961196517231915940L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -994829535541233743L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8024101050319973033L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8921861525778908964L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2440477755638386840L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iiiIlIIIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIIlliIIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIllllIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, ilIllIiIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(liIlliiIll<invokedynamic>());
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

   public boolean Illlllllilll(double y, double onGround, double z, boolean x) {
      return x && this.IiIlliIliiIl(y, z) && this.IIlllIlliIll(onGround);
   }

   public double IiIiliIiiiIi() {
      return this.iIlIIIIIIl;
   }

   public boolean iIIIlIlIIl() {
      return this.lIiIIIIIIl;
   }

   public double lIlIliIlIl() {
      return this.iliIIIIIIl;
   }

   public int IIiIllIiIl() {
      return this.IIIlIIIIIl;
   }

   public int iIlIlllllill() {
      return llIiIiililIiIiil.IiIlliIliiIl(this.IIlIIIIIIl);
   }

   public double iiIIlIIlIl() {
      return this.lliIIIIIIl;
   }

   public String IIillIiliIil() {
      return String.format(Locale.ROOT, IiiIlliiIl<invokedynamic>(), this.liIIIIIIIl, this.iliIiiliiiii(), this.IIIllIIliIIl(), this.IlIlllIlilIl(), this.iIlIlllllill(), this.IilliliilIIi(), this.lIiiIiIlilli(), this.lIlIIIIIIl, this.iIlIIIIIIl, this.iilIIIIIIl, this.IIiIIIIIIl, this.lIiIIIIIIl, this.IiiIIIIIIl, this.lliIIIIIIl, this.iliIIIIIIl, this.IIIlIIIIIl, this.lIIlIIIIIl, this.liiiIIllIl(), this.iIIlIIIIIl == null ? "" : IiiIlliiIl<invokedynamic>() + this.iIIlIIIIIl);
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 11 | var4[var5] >>> 5))) ^ 894) ^ 17762) - 30438) ^ 23020)) + var5))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIiIlIliIl() {
      return this.lIIlIIIIIl;
   }

   public double IIlilIliiIli() {
      return this.IllIIIIIIl;
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ '옶') + var5) ^ 5483))) ^ 11967))) - var5) ^ var5) << 7 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ '옶') + var5) ^ 5483))) ^ 11967))) - var5) ^ var5) >>> 9) - 16290))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) + var5) + '밬') + '\uddda'))))) ^ var5) ^ 23629) >>> 8 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) + var5) + '밬') + '\uddda'))))) ^ var5) ^ 23629) << 8) ^ 5772))) ^ 16509) + var5) + var5) - var5) - var5) - 8789) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double Illillliilli() {
      return this.lllIIIIIIl;
   }

   public double IlIillIiilIi() {
      return this.lIlIIIIIIl;
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 8 | (char)((char)(var4[var5] + var5) - var5) << 8) + '썂'))) << 6 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 8 | (char)((char)(var4[var5] + var5) - var5) << 8) + '썂'))) >>> 10) >>> 10 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 8 | (char)((char)(var4[var5] + var5) - var5) << 8) + '썂'))) << 6 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 8 | (char)((char)(var4[var5] + var5) - var5) << 8) + '썂'))) >>> 10) << 6))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIIlIliiIIlIli IliIlllilIi(String why) {
      return new lIIlIliiIIlIli(this.liIIIIIIIl, this.iiIIIIIIIl, this.IIlIIIIIIl, this.lIlIIIIIIl, this.iIlIIIIIIl, this.IllIIIIIIl, this.lllIIIIIIl, this.illIIIIIIl, this.IilIIIIIIl, this.lilIIIIIIl, this.iilIIIIIIl, this.IIiIIIIIIl, this.lIiIIIIIIl, this.iIiIIIIIIl, this.IliIIIIIIl, this.lliIIIIIIl, this.iliIIIIIIl, this.IiiIIIIIIl, this.liiIIIIIIl, this.iiiIIIIIIl, this.IIIlIIIIIl, this.lIIlIIIIIl, why);
   }

   public boolean Iliilliiilii() {
      return this.lilIIIIIIl;
   }

   public double IIiilIiiiIii() {
      return this.IilIIIIIIl;
   }

   public long Iiilliiliiil() {
      return this.iiIIIIIIIl;
   }

   public int IlIlllIlilIl() {
      return llIiIiililIiIiil.Illlllllilll(this.iiIIIIIIIl);
   }

   public iiiIIiilIIIlIiil Ililllililil() {
      return this.liIIIIIIIl;
   }

   public double Iilililiiili() {
      return this.illIIIIIIl;
   }

   public boolean llIIlilIIl() {
      return this.iIiIIIIIIl;
   }

   public int IIIllIIliIIl() {
      return llIiIiililIiIiil.IIlllIlliIll(this.iiIIIIIIIl);
   }

   public boolean IllIllllIl() {
      return this.IiiIIIIIIl;
   }

   public long IIIilIIiiIIi() {
      return this.IIlIIIIIIl;
   }

   public double lilIliilIl() {
      return this.iiiIIIIIIl;
   }

   public int lIiiIiIlilli() {
      return llIiIiililIiIiil.Illlllllilll(this.IIlIIIIIIl);
   }

   public int Iiiiliiiiiii() {
      return this.iilIIIIIIl;
   }

   public boolean liiiIIllIl() {
      return this.iIIlIIIIIl == null;
   }

   public boolean IiIIlliIIl() {
      return this.IliIIIIIIl;
   }

   public lIIlIliiIIlIli(iiiIIiilIIIlIiil headroomClear, long brakeFrom, long landingMaxZ, double sprintRequired, double takeoffFar, double narrowLanding, double jumpRequired, double dropBlocks, double type, boolean maxAirborneTicks, int toFeet, int maxTakeoffSpeed, boolean completionWindowTicks, boolean landingMaxX, boolean takeoffNear, double fromFeet, double landingMinZ, boolean landingMinX, double gapCells, double supportTop, int landingY, int reject, String sneakForbidden) {
      this.liIIIIIIIl = headroomClear;
      this.iiIIIIIIIl = brakeFrom;
      this.IIlIIIIIIl = landingMaxZ;
      this.lIlIIIIIIl = sprintRequired;
      this.iIlIIIIIIl = takeoffFar;
      this.IllIIIIIIl = narrowLanding;
      this.lllIIIIIIl = jumpRequired;
      this.illIIIIIIl = dropBlocks;
      this.IilIIIIIIl = type;
      this.lilIIIIIIl = maxAirborneTicks;
      this.iilIIIIIIl = toFeet;
      this.IIiIIIIIIl = maxTakeoffSpeed;
      this.lIiIIIIIIl = completionWindowTicks;
      this.iIiIIIIIIl = landingMaxX;
      this.IliIIIIIIl = takeoffNear;
      this.lliIIIIIIl = fromFeet;
      this.iliIIIIIIl = landingMinZ;
      this.IiiIIIIIIl = landingMinX;
      this.liiIIIIIIl = gapCells;
      this.iiiIIIIIIl = supportTop;
      this.IIIlIIIIIl = landingY;
      this.lIIlIIIIIl = reject;
      this.iIIlIIIIIl = sneakForbidden;
   }
}
