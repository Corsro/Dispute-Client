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

public record lliiliiliili(int[] pearlLaunched, int[] pearlLow, int[] pearlDir, double holeTime, double retotem, double boom, int[] jumpReset) {
   private final double iliIlllIlIiiIlllIl;
   private final int[] liiIlllIliiiIlllIl;
   private final double lIiIlllIliIiIlllIl;
   private final int[] iilIlllIlIIiIlllIl;
   private final int[] IilIlllIllilIlllIl;
   private final int[] lllIlllIlillIlllIl;
   private final double IliIlllIllliIlllIl;

   public double iliIiiliiiii() {
      return this.iliIlllIlIiiIlllIl;
   }

   public lliiliiliili(int[] pearlDir, int[] jumpReset, int[] pearlLow, double pearlLaunched, double holeTime, double boom, int[] retotem) {
      this.lllIlllIlillIlllIl = pearlDir;
      this.IilIlllIllilIlllIl = jumpReset;
      this.iilIlllIlIIiIlllIl = pearlLow;
      this.lIiIlllIliIiIlllIl = pearlLaunched;
      this.IliIlllIllliIlllIl = holeTime;
      this.iliIlllIlIiiIlllIl = boom;
      this.liiIlllIliiiIlllIl = retotem;
   }

   public int[] IIIllIIliIIl() {
      return this.liiIlllIliiiIlllIl;
   }

   public int hashCode() {
      long var2 = 2560836792227324418L;
      var2 ^= ((long)Arrays.hashCode(this.lllIlllIlillIlllIl) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Arrays.hashCode(this.IilIlllIllilIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Arrays.hashCode(this.iilIlllIlIIiIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.lIiIlllIliIiIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.IliIlllIllliIlllIl)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.iliIlllIlIiiIlllIl)) << 32 ^ var2) & -1L << 32;
      return 31 * (int)(var2 >>> 32) + Arrays.hashCode(this.liiIlllIliiiIlllIl);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3489657036548324406L ^ Long.rotateLeft(9075786334422281502L, 27) ^ -8610465491966873489L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4589705200231431674L ^ Long.rotateLeft(-7884118383017262357L, 63) ^ -8788749760424481935L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 940260313130372719L ^ Long.rotateLeft(-8478949233259237076L, 49) ^ -7213535404869491971L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7967572749456676769L ^ Long.rotateLeft(-3629976582390929727L, 53) ^ 2488290899797187211L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6581105072500528943L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 229455151963472863L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5231416021871318999L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 9116276080798351163L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4953909367317836121L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2084472301545444512L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iilllilliill<invokedynamic>());
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

   public double IilliliilIIi() {
      return this.lIiIlllIliIiIlllIl;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') << 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') >>> 14) - var5) ^ '\ueb7d'))) + var5) - 1353) + var5))) >>> 6 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') << 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') >>> 14) - var5) ^ '\ueb7d'))) + var5) - 1353) + var5))) << 10))) - var5))) + 24080) >>> 7 | (char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') << 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') >>> 14) - var5) ^ '\ueb7d'))) + var5) - 1353) + var5))) >>> 6 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') << 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) >>> 9 | (char)(var4[var5] >>> 13 | var4[var5] << 3) << 7) + 7293) + var5) - '쮧') >>> 14) - var5) ^ '\ueb7d'))) + var5) - 1353) + var5))) << 10))) - var5))) + 24080) << 9));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) >>> 10) << 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) >>> 10) >>> 2) - 4720))) - '홡') >>> 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) >>> 10) << 14 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) << 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) << 3 | (char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') << 15 | (char)((char)((char)(var4[var5] + var5) + var5) ^ '훤') >>> 1) - '錟'))) >>> 13) ^ var5) >>> 10) >>> 2) - 4720))) - '홡') << 2) + var5) + '싎'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return IlIlllIlilIl<invokedynamic>() + Arrays.toString(this.lllIlllIlillIlllIl) + IlIlllIlilIl<invokedynamic>() + Arrays.toString(this.IilIlllIllilIlllIl) + IlIlllIlilIl<invokedynamic>() + Arrays.toString(this.iilIlllIlIIiIlllIl) + IlIlllIlilIl<invokedynamic>() + this.lIiIlllIliIiIlllIl + IlIlllIlilIl<invokedynamic>() + this.IliIlllIllliIlllIl + IlIlllIlilIl<invokedynamic>() + this.iliIlllIlIiiIlllIl + IlIlllIlilIl<invokedynamic>() + Arrays.toString(this.liiIlllIliiiIlllIl) + IlIlllIlilIl<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5)) - '\udd4f') ^ '햓') - 15305))))) ^ var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + 14689) + 24452) + var5) + 11836) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) + 14689) + 24452) + var5) + 11836) + var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + 14689) + 24452) + var5) + 11836) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) + 14689) + 24452) + var5) + 11836) + var5) << 6) >>> 12) - var5) - var5) - 31624));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int[] IliIlllilIi() {
      return this.lllIlllIlillIlllIl;
   }

   public int[] iIlIlllllill() {
      return this.iilIlllIlIIiIlllIl;
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof lliiliiliili)) {
         return false;
      } else {
         lliiliiliili var2 = (lliiliiliili)o;
         return Arrays.equals(this.lllIlllIlillIlllIl, var2.lllIlllIlillIlllIl) && Arrays.equals(this.IilIlllIllilIlllIl, var2.IilIlllIllilIlllIl) && Arrays.equals(this.iilIlllIlIIiIlllIl, var2.iilIlllIlIIiIlllIl) && Double.compare(this.lIiIlllIliIiIlllIl, var2.lIiIlllIliIiIlllIl) == 0 && Double.compare(this.IliIlllIllliIlllIl, var2.IliIlllIllliIlllIl) == 0 && Double.compare(this.iliIlllIlIiiIlllIl, var2.iliIlllIlIiiIlllIl) == 0 && Arrays.equals(this.liiIlllIliiiIlllIl, var2.liiIlllIliiiIlllIl);
      }
   }

   public double lIiiIiIlilli() {
      return this.IliIlllIllliIlllIl;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) << 5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) << 5) << 8) - var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) << 5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) >>> 11 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ '靂') << 2 | (char)(var4[var5] ^ '靂') >>> 14) ^ var5))))) - 15940) ^ 'ﱝ') - '쭘') ^ var5) << 5) << 8) - var5) >>> 10) - var5) ^ var5) - var5) - '낲') + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int[] liiiIIllIl() {
      return this.IilIlllIllilIlllIl;
   }
}
