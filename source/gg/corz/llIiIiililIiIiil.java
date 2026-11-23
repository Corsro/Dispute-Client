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

public final class llIiIiililIiIiil {
   public static final int[] iiilIIilil = new int[]{0, 1, -1, -2, 2, -3};
   public static final int[] IiilIIilil = new int[]{0, 1};
   public static final int[] liilIIilil = new int[]{-1, -2, 2, -3};
   private static final double ililIIilil = 0.001;
   public static final double llilIIilil = 0.26;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 3 | (char)(~var4[var5]) >>> 13) - var5) + var5) ^ var5) + var5) ^ 26735))) - '藷') ^ '\ue503'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IIlllIlliIll(long packed) {
      return (int)(packed << 52 >> 52);
   }

   private llIiIiililIiIiil() {
   }

   private static int iliIiiliiiii(double v) {
      return (int)Math.floor(v);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -226542674713023409L ^ Long.rotateLeft(-6269057226322115379L, 5) ^ 7333965469825430699L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8796098010973460393L ^ Long.rotateLeft(-7185083000213627731L, 53) ^ -5876844710540151872L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8634543457070505522L ^ Long.rotateLeft(-3580651878404805466L, 25) ^ 8909405828716944472L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7820961331062425420L ^ Long.rotateLeft(-8376674833758352643L, 59) ^ 9007654386022972971L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6695419284878888226L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2739287611052508096L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5734961246860044384L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4633965519631575886L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2935766332966012074L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3786411259497980014L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIilIIiiIIi<invokedynamic>());
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

   public static int Illlllllilll(long packed) {
      return (int)(packed << 26 >> 38);
   }

   public static String IlIlllIlilIl(long packed) {
      return IiIlliIliiIl(packed) + Iilllilliill<invokedynamic>() + IIlllIlliIll(packed) + Iilllilliill<invokedynamic>() + Illlllllilll(packed);
   }

   public static long IIIllIIliIIl(int y, int x, int z) {
      return ((long)y & 67108863L) << 38 | ((long)z & 67108863L) << 12 | (long)x & 4095L;
   }

   public static int IilliliilIIi(double z, double y, double tops, IIillIIllIillIIl x) {
      long var12 = 8517058908439161543L;
      long var14 = 3577435800329210892L;
      var12 ^= ((long)iliIiiliiiii(z) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)iliIiiliiiii(y) ^ var12) & -1L >>> 32;
      var14 ^= ((long)iliIiiliiiii(tops) << 32 ^ var14) & -1L << 32;
      double var10 = x.top((int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32));
      return var10 > 0.26 && y - (double)((int)var12) >= var10 - 0.001 ? (int)var12 + 1 : (int)var12;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)(-((char)(var4[var5] - 26428))) + var5))) ^ var5))))) - var5) ^ '컣') ^ var5) ^ var5)) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean lIiiIiIlilli(double cellY, double cellZ, double y, int tops, int x, int cellX, IIillIIllIillIIl z) {
      return iliIiiliiiii(cellY) == tops && iliIiiliiiii(y) == cellX && IilliliilIIi(cellY, cellZ, y, z) == x;
   }

   public static boolean IliIlllilIi(int targetY, int feetY) {
      return targetY == feetY || targetY == feetY + 1;
   }

   public static long iIlIlllllill(double tops, double y, double z, IIillIIllIillIIl x) {
      long var10 = 8083112010825605244L;
      long var12 = 3430822854631642495L;
      var10 ^= ((long)iliIiiliiiii(tops) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)iliIiiliiiii(z) ^ var10) & -1L >>> 32;
      var12 ^= ((long)IilliliilIIi(tops, y, z, x) << 32 ^ var12) & -1L << 32;
      return IIIllIIliIIl((int)(var10 >>> 32), (int)(var12 >>> 32), (int)var10);
   }

   public static int IiIlliIliiIl(long packed) {
      return (int)(packed << 0 >> 38);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '蔵')) << 9 | (char)((char)((char)(var4[var5] ^ var5) ^ '蔵')) >>> 7) - var5))))) ^ var5) >>> 2 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '蔵')) << 9 | (char)((char)((char)(var4[var5] ^ var5) ^ '蔵')) >>> 7) - var5))))) ^ var5) << 14) ^ var5))))) - 31020));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) << 7 | (char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) >>> 9) ^ 17851) ^ var5) + 4011) + '쀲') - '쾥') ^ 30843) + var5) + '\ue927') ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) << 7 | (char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) >>> 9) ^ 17851) ^ var5) + 4011) + '쀲') - '쾥') ^ 30843) + var5) + '\ue927') ^ var5) << 10) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) << 7 | (char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) >>> 9) ^ 17851) ^ var5) + 4011) + '쀲') - '쾥') ^ 30843) + var5) + '\ue927') ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) << 7 | (char)((char)(-((char)(var4[var5] - '쟼'))) << 11 | (char)(-((char)(var4[var5] - '쟼'))) >>> 5) >>> 9) ^ 17851) ^ var5) + 4011) + '쀲') - '쾥') ^ 30843) + var5) + '\ue927') ^ var5) << 10) << 6) - '쏱') + '쏟'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-((char)((char)(-((char)(var4[var5] ^ '衶'))) ^ 23046))))) << 6 | (char)(~((char)(-((char)((char)(-((char)(var4[var5] ^ '衶'))) ^ 23046))))) >>> 10))))) + var5) ^ var5) - '꣐') - var5) + '\ufaec') << 7 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-((char)((char)(-((char)(var4[var5] ^ '衶'))) ^ 23046))))) << 6 | (char)(~((char)(-((char)((char)(-((char)(var4[var5] ^ '衶'))) ^ 23046))))) >>> 10))))) + var5) ^ var5) - '꣐') - var5) + '\ufaec') >>> 9) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int liiiIIllIl(int feetY, int targetY) {
      return IliIlllilIi(feetY, targetY) ? 0 : (feetY == targetY - 1 ? 1 : 2);
   }
}
