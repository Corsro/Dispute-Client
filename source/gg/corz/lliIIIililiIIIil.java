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

public record lliIIIililiIIIil(boolean success, String headline, String reason, String destination, String dimension, int landX, int landY, int landZ, double flownBlocks, long seconds, int rocketsUsed, int xpUsed, int pitStops, int purchases, long spent, double topSpeedBps, double offBy) {
   private final int iIIiiIIIil;
   private final int IIliiIIIil;
   private final int IlIiiIIIil;
   private final String liiliIIIil;
   public static final double IiliiIIIil = (double)2.0F;
   public static final String llliiIIIil = "Destination Reached";
   private final double IlliiIIIil;
   private final double iIliiIIIil;
   public static final String illiiIIIil = "Trip Stopped";
   private final String IIIiiIIIil;
   private final int iiIiiIIIil;
   private final String iiiliIIIil;
   private final double llIiiIIIil;
   private final String IiiliIIIil;
   private final int IiIiiIIIil;
   private final int liIiiIIIil;
   private final int lIIiiIIIil;
   private final boolean ililiIIIil;
   private final long lIliiIIIil;
   private final long ilIiiIIIil;

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) ^ var5) ^ var5) + 11669) + '\uf40b'))) + var5) + var5) >>> 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) ^ var5) ^ var5) + 11669) + '\uf40b'))) + var5) + var5) << 10))))) - var5) ^ 30363) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long Iiiiliiiiiii() {
      return this.ilIiiIIIil;
   }

   public String IIIllIIliIIl() {
      return this.lIIiiIIIil + illIlIilIl<invokedynamic>() + this.iIIiiIIIil + illIlIilIl<invokedynamic>() + this.IlIiiIIIil;
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') << 7 | (char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') >>> 9) - var5) + '\uebb4') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') << 7 | (char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') >>> 9) - var5) + '\uebb4') >>> 5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') << 7 | (char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') >>> 9) - var5) + '\uebb4') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') << 7 | (char)((char)((char)((char)((char)(~var4[var5]) + '\uee6e') ^ var5) ^ var5) + '\ud9c2') >>> 9) - var5) + '\uebb4') >>> 5) >>> 5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int llIIlilIIl() {
      return this.iiIiiIIIil;
   }

   public int IiIIlliIIl() {
      return this.IIliiIIIil;
   }

   public int Iilililiiili() {
      return this.iIIiiIIIil;
   }

   public double IllIllllIl() {
      return this.IlliiIIIil;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) ^ var5) ^ var5))) - var5) ^ 'ꎨ') - var5) ^ var5) + '\ua8cd') << 14 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)(var4[var5] + var5))))) ^ var5) ^ var5))) - var5) ^ 'ꎨ') - var5) ^ var5) + '\ua8cd') >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iiIIlIIlIl() {
      return this.lIliiIIIil;
   }

   private static String IIillIiliIil(String s) {
      if (s == null) {
         return "";
      } else {
         String var1 = s.replace((char)(((-61775727 - 53 >>> 23 | -61775727 - 53 << 9) << 21 | (-61775727 - 53 >>> 23 | -61775727 - 53 << 9) >>> 11) * 65 ^ 69885405), (char)(~(-1395831805 << 31 | -1395831805 >>> 1) ^ 697915870)).replace((char)(~-1408122752 * 286331153 * -91 * -723362913 ^ 1759684952), (char)(((-(-1845040355 * 95) ^ -65) >>> 15 | (-(-1845040355 * 95) ^ -65) << 17) ^ 2130993410)).trim();
         return var1.length() > ((-1161356673 >>> 5 | -1161356673 << 27) ^ -36292493) ? var1.substring(0, -1721172215 * -97 - -11 + -21 ^ -550019795).stripTrailing() : var1;
      }
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) << 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) >>> 7) + '\uf7a6'))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) << 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) >>> 7) + '\uf7a6'))) << 4))) >>> 14 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) << 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) >>> 7) + '\uf7a6'))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) << 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - 25251) << 7 | (char)(var4[var5] - 25251) >>> 9))) + var5) + var5) ^ var5) >>> 7) + '\uf7a6'))) << 4))) << 2) - 5941) + var5) + var5))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IlIlllIlilIl() {
      return this.iiiliIIIil.isEmpty() ? this.lIIiiIIIil + illIlIilIl<invokedynamic>() + this.IlIiiIIIil : this.iiiliIIIil;
   }

   public int Illillliilli() {
      return this.lIIiiIIIil;
   }

   public String IiIiliIiiiIi() {
      return this.iiiliIIIil;
   }

   public String liiiIIllIl() {
      return IIiililllIiilill.IIIllIIliIIl(this.llIiiIIIil);
   }

   public boolean IiIlliIliiIl() {
      return this.IlliiIIIil >= Double.longBitsToDouble(6035363320233733425L ^ 1423677301806345521L);
   }

   public double Iliilliiilii() {
      return this.llIiiIIIil;
   }

   private static double Ililllililil(double v) {
      return Double.isFinite(v) && v > Double.longBitsToDouble(4848525528038473815L ^ 4848525528038473815L) ? v : (double)0.0F;
   }

   public int IIiilIiiiIii() {
      return this.IlIiiIIIil;
   }

   public String IIlilIliiIli() {
      return this.IIIiiIIIil;
   }

   public String iliIiiliiiii() {
      return llIIilIiilIIilIi.liiiIIllIl(this.lIliiIIIil);
   }

   public String IIIilIIiiIIi() {
      return this.IiiliIIIil;
   }

   public String IlIillIiilIi() {
      return this.liiliIIIil;
   }

   public String IilliliilIIi() {
      return this.ilIiiIIIil <= (-4561487240583877361L ^ -4561487240583877361L) ? illIlIilIl<invokedynamic>() : Iilllilliill(this.llIiiIIIil / (double)this.ilIiiIIIil);
   }

   public int IIIIllIIIl() {
      return this.IiIiiIIIil;
   }

   public String IliIlllilIi() {
      return this.IiiliIIIil.isEmpty() ? (this.ililiIIIil ? illIlIilIl<invokedynamic>() : illIlIilIl<invokedynamic>()) : this.IiiliIIIil;
   }

   public String IIlllIlliIll() {
      return this.IiIlliIliiIl() ? IIiililllIiilill.IIIllIIliIIl(this.IlliiIIIil) + illIlIilIl<invokedynamic>() : "";
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5250255904597730221L ^ Long.rotateLeft(6504606401721336227L, 4) ^ 3953329820384705916L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 929897325199489384L ^ Long.rotateLeft(8565842813651377137L, 16) ^ 5526953244722738705L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1275696041828361781L ^ Long.rotateLeft(7017777744440315957L, 45) ^ 3909068513866909868L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 999116461374597210L ^ Long.rotateLeft(6899236814124539819L, 1) ^ -7879942224462924967L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1447901809745782181L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9151927847482392433L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2228744278381221217L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3546343299322440739L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8238851607788976765L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1846373114717568083L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lilIliilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIiIllIiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIiIlIliIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lliIliliIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiiIlliiIl<invokedynamic>());
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

   public String lIiiIiIlilli() {
      return this.iIliiIIIil <= Double.longBitsToDouble(7502614678499921473L ^ 7502614678499921473L) ? illIlIilIl<invokedynamic>() : Iilllilliill(this.iIliiIIIil);
   }

   public lliIIIililiIIIil(boolean dimension, String topSpeedBps, String pitStops, String destination, String landZ, int seconds, int landX, int headline, double landY, long offBy, int rocketsUsed, int success, int flownBlocks, int reason, long xpUsed, double purchases, double spent) {
      topSpeedBps = IIillIiliIil(topSpeedBps);
      pitStops = IIillIiliIil(pitStops);
      destination = IIillIiliIil(destination);
      landZ = IIillIiliIil(landZ);
      landY = Ililllililil(landY);
      purchases = Ililllililil(purchases);
      spent = Ililllililil(spent);
      offBy = Math.max(0L, offBy);
      rocketsUsed = Math.max(0, rocketsUsed);
      success = Math.max(0, success);
      flownBlocks = Math.max(0, flownBlocks);
      reason = Math.max(0, reason);
      xpUsed = Math.max(0L, xpUsed);
      this.ililiIIIil = dimension;
      this.IiiliIIIil = topSpeedBps;
      this.liiliIIIil = pitStops;
      this.iiiliIIIil = destination;
      this.IIIiiIIIil = landZ;
      this.lIIiiIIIil = seconds;
      this.iIIiiIIIil = landX;
      this.IlIiiIIIil = headline;
      this.llIiiIIIil = landY;
      this.ilIiiIIIil = offBy;
      this.IiIiiIIIil = rocketsUsed;
      this.liIiiIIIil = success;
      this.iiIiiIIIil = flownBlocks;
      this.IIliiIIIil = reason;
      this.lIliiIIIil = xpUsed;
      this.iIliiIIIil = purchases;
      this.IlliiIIIil = spent;
   }

   public String iIlIlllllill() {
      return IIiililllIiilill.IlIlllIlilIl(this.ilIiiIIIil);
   }

   public String Illlllllilll() {
      StringBuilder var1 = new StringBuilder(-(500011337 + -109) ^ -500011196);
      if (this.ililiIIIil) {
         var1.append(illIlIilIl<invokedynamic>()).append(this.IIIllIIliIIl());
      } else {
         var1.append(illIlIilIl<invokedynamic>());
         if (!this.liiliIIIil.isEmpty()) {
            var1.append(illIlIilIl<invokedynamic>()).append(this.liiliIIIil);
         }

         var1.append(illIlIilIl<invokedynamic>()).append(this.IIIllIIliIIl());
      }

      var1.append(illIlIilIl<invokedynamic>()).append(this.liiiIIllIl()).append(illIlIilIl<invokedynamic>()).append(this.iIlIlllllill());
      if (this.ililiIIIil && this.IiIlliIliiIl()) {
         var1.append(illIlIilIl<invokedynamic>()).append(this.IIlllIlliIll()).append((char)((-851821531 ^ -37) * 1056139499 ^ -2126243325));
      }

      return var1.toString();
   }

   public double lIlIliIlIl() {
      return this.iIliiIIIil;
   }

   public boolean Iiilliiliiil() {
      return this.ililiIIIil;
   }

   public int iIIIlIlIIl() {
      return this.liIiiIIIil;
   }

   public static String Iilllilliill(double bps) {
      if (Double.isFinite(bps) && !(bps <= Double.longBitsToDouble(-3326284403022653736L ^ -3326284403022653736L))) {
         return bps < Double.longBitsToDouble(1114664496551485718L ^ 5718431411968837488L) ? String.format(Locale.ROOT, illIlIilIl<invokedynamic>(), bps) : Math.round(bps) + illIlIilIl<invokedynamic>();
      } else {
         return illIlIilIl<invokedynamic>();
      }
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') >>> 8) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') >>> 8) + var5) << 4) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') >>> 8) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) - var5) - 29501) + var5))) + var5)))))) + var5) - var5) ^ '\uec7b') >>> 8) + var5) << 4) << 1) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
