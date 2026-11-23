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

public final class liIliiiliiIliiil {
   public static final iiliIillIIiiIill iiIillIiil;
   public static final iiliIillIIiiIill IIlillIiil;
   private static final iiliIillIIiiIill[] IllillIiil;
   private static final iiliIillIIiiIill[] iIlillIiil;
   private static final iiliIillIIiiIill[] lIlillIiil;
   public static final int lllillIiil;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - var5) - 28578) - var5) << 9 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - var5) - 28578) - var5) >>> 7))) + 7211) >>> 14 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - var5) - 28578) - var5) << 9 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - var5) - 28578) - var5) >>> 7))) + 7211) << 2) - 24841) + '렵') - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      iiIillIiil = new iiliIillIIiiIill(lIliIllliIliIlll.iliiiIIill, new int[]{-35560, -6599169, -8585393, -15594980});
      IIlillIiil = new iiliIillIIiiIill(iilIIiIIiIIi.iIiIiliiIliIilii, new int[]{-2083766, -14473, -13722010, -14938100});
      lIlillIiil = new iiliIillIIiiIill[]{new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-16718337, -53609, -8704001, -16052186}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-5232897, -2096897, -9830156, -15466450}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-12976364, -3342592, -16711773, -16113907}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-38144, -57826, -15360, -14743552}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-16725761, -11999745, -8675585, -16246734}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-65485, -45715, -5242848, -15073272}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-16711738, -12916481, -9806593, -16507100}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-45096, -28704, -4960257, -13956289}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-4784384, -1507492, -16711813, -15458560}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-65426, -38144, -5230849, -15073246}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-13800449, -16727297, -10716161, -16379346}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-6467841, -3703297, -10872632, -15335373}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-15360, -8090, -25088, -14411520}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-16718454, -13893712, -16734101, -16505830}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-53556, -9806593, -16719617, -15335366}), new iiliIillIIiiIill(IlIlllIlilIl<invokedynamic>(), new int[]{-51104, -34212, -3145728, -15073274})};
      iIlillIiil = liiiIIllIl(iiIillIiil);
      IllillIiil = liiiIIllIl(IIlillIiil);
      lllillIiil = lIlillIiil.length + 1;
   }

   public static int IilliliilIIi() {
      long var4 = 6682604379255879594L;
      Iiliililliliilil var0 = Iiliililliliilil.llllllllil;
      if (var0 == null) {
         return -1;
      } else {
         var4 ^= ((long)(var0.Iillllllil.Iilllilliill() & 16777215) << 32 ^ var4) & -1L << 32;
         iiliIillIIiiIill[] var2 = IliIlllilIi();

         for(long var7 = var4 ^ (0L ^ var4) & -1L >>> 32; (int)var7 < var2.length; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            if ((var2[(int)var7].liiiIIllIl() & 16777215) == (int)(var7 >>> 32)) {
               return (int)var7;
            }
         }

         return -1;
      }
   }

   private static iiliIillIIiiIill[] liiiIIllIl(iiliIillIIiiIill seasonal) {
      iiliIillIIiiIill[] var1 = (iiliIillIIiiIill[])Arrays.copyOf(lIlillIiil, lIlillIiil.length + 1);
      var1[lIlillIiil.length] = seasonal;
      return var1;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3862062727791487570L ^ Long.rotateLeft(2058484875244474099L, 59) ^ 3891880436419676716L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4424505754327354041L ^ Long.rotateLeft(3910041356073618983L, 35) ^ -3054431972001573543L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5902219685230903949L ^ Long.rotateLeft(-3395931763124236711L, 2) ^ -1897405947624393134L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8029731036338764939L ^ Long.rotateLeft(-3691239360085381471L, 21) ^ -4820565800669969619L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4841133336535541672L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1879673416677610947L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3631725265029381859L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2217070591353720914L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 71020146325622148L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6142619385014640811L;
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

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + 5078) ^ var5) + '힊'))) - var5))))) << 9 | (char)(-((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + 5078) ^ var5) + '힊'))) - var5))))) >>> 7) - var5) ^ var5) + var5) - var5))) ^ '쵽'))))));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 22325) + var5) + var5) + 20813) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) - 22325) + var5) + var5) + 20813) >>> 13) - var5) + var5) - 19072) + '例') >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 22325) + var5) + var5) + 20813) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) - 22325) + var5) + var5) + 20813) >>> 13) - var5) + var5) - 19072) + '例') << 14) + '\uefda') + 18106))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iiliIillIIiiIill[] IliIlllilIi() {
      iiliIillIIiiIill[] var10000;
      switch (iIiiilIiIliiilIi.IliIlllilIi()) {
         case lIIIIilIIi -> var10000 = iIlillIiil;
         case iIIIIilIIi -> var10000 = IllillIiil;
         case IIIIIilIIi -> var10000 = lIlillIiil;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private static double IIIllIIliIIl(int rgb) {
      long var4 = -5007072139830660309L;
      long var6 = -9101393793835989631L;
      var4 ^= ((long)(rgb >> 16 & 255) << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)(rgb >> 8 & 255) ^ var4) & -1L >>> 32;
      var6 ^= ((long)(rgb & 255) << 32 ^ var6) & -1L << 32;
      return (double)Math.max((int)(var4 >>> 32), Math.max((int)var4, (int)(var6 >>> 32))) / (double)255.0F;
   }

   public static int[] lIiiIiIlilli() {
      long var2 = 2396414963368411979L;
      iiliIillIIiiIill[] var0 = IliIlllilIi();
      var2 ^= ((long)IilliliilIIi() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) >= 0 && (int)(var2 >>> 32) < var0.length ? var0[(int)(var2 >>> 32)].IilliliilIIi() : null;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) + var5))))) + var5))) - var5) ^ '뒏') - var5) ^ var5) >>> 4 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)(var4[var5] + var5) + var5))))) + var5))) - var5) ^ '뒏') - var5) ^ var5) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private liIliiiliiIliiil() {
   }

   private static double iliIiiliiiii(int rgb) {
      long var6 = -1285502762791453909L;
      long var8 = -4406445111848942846L;
      long var10 = -2941562845817504854L;
      var6 ^= ((long)(rgb >> 16 & 255) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)(rgb >> 8 & 255) ^ var6) & -1L >>> 32;
      var8 ^= ((long)(rgb & 255) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)Math.max((int)(var6 >>> 32), Math.max((int)var6, (int)(var8 >>> 32))) ^ var8) & -1L >>> 32;
      var10 ^= ((long)Math.min((int)(var6 >>> 32), Math.min((int)var6, (int)(var8 >>> 32))) << 32 ^ var10) & -1L << 32;
      return (int)var8 == 0 ? (double)0.0F : (double)((int)var8 - (int)(var10 >>> 32)) / (double)((int)var8);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '건') ^ var5) + var5) ^ 25561) << 15 | (char)((char)((char)((char)(var4[var5] ^ '건') ^ var5) + var5) ^ 25561) >>> 1) + var5) ^ '藥') + var5))) + '둗') ^ 8011) >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '건') ^ var5) + var5) ^ 25561) << 15 | (char)((char)((char)((char)(var4[var5] ^ '건') ^ var5) + var5) ^ 25561) >>> 1) + var5) ^ '藥') + var5))) + '둗') ^ 8011) << 6) - '鋬'))) - var5))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void iIlIlllllill(iiliIillIIiiIill p) {
      Iiliililliliilil var1 = Iiliililliliilil.llllllllil;
      if (var1 != null && p != null) {
         IlIIilIlllIIilIl.IliIlllilIi();
         var1.Iillllllil.IIillIiliIil(-16777216 | p.liiiIIllIl() & 16777215);
         var1.lIilllllil.IIillIiliIil(true);
         IlIIilIlllIIilIl.IilliliilIIi();
      }
   }
}
