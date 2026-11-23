package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class llIIilIiilIIilIi {
   private static final char[] IilliIlIIi = new char[]{'K', 'M', 'B', 'T'};
   private static final long[] illliIlIIi = new long[]{1000L, 1000000L, 1000000000L, 1000000000000L};
   private static final long[] lilliIlIIi = new long[]{1L, 10L, 100L, 1000L};
   public static final String lllliIlIIi = "—";

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8364907082167672367L ^ Long.rotateLeft(2915623152335651828L, 29) ^ -3930727415851904460L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -824334294137688615L ^ Long.rotateLeft(-8859463660874837231L, 7) ^ -2247653181163995635L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6200437373520525769L ^ Long.rotateLeft(3989747685557066114L, 44) ^ 1329404618127850671L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3436285965381100362L ^ Long.rotateLeft(-944000145987552464L, 14) ^ 2510899810677742226L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4506774978200610222L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2001848804628438809L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7932467213711475080L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6180458348912064293L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2345156005329640492L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1418572099219677869L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) - 'ｄ') - var5))) + var5) - '\ue291'))) - 15467) + 18317) >>> 15 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) - 'ｄ') - var5))) + var5) - '\ue291'))) - 15467) + 18317) << 1) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) - 'ｄ') - var5))) + var5) - '\ue291'))) - 15467) + 18317) >>> 15 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)(-var4[var5]))) - 'ｄ') - var5))) + var5) - '\ue291'))) - 15467) + 18317) << 1) << 3) - 28770) - var5) ^ 5732) - '觥') + '겹') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iliIiiliiiii(long coins) {
      return coins >= 1000L;
   }

   private llIIilIiilIIilIi() {
   }

   private static void IiIlliIliiIl(StringBuilder b, long digits, int frac) {
      long var8 = -8881985736175321426L;
      if (frac != 0 && digits != 0L) {
         String var4 = Long.toString(digits);
         var8 ^= ((long)frac << 32 ^ var8) & -1L << 32;
         StringBuilder var6 = new StringBuilder(frac);

         for(var8 ^= ((long)var4.length() ^ var8) & -1L >>> 32; (int)var8 < frac; var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            var6.append('0');
         }

         var6.append(var4);

         while((int)(var8 >>> 32) > 0 && var6.charAt((int)(var8 >>> 32) - 1) == '0') {
            var8 += -4294967296L;
         }

         b.append('.').append(var6, 0, (int)(var8 >>> 32));
      }
   }

   public static String IIIllIIliIIl(long delta) {
      if (delta == 0L) {
         return "";
      } else {
         long var2 = delta == Long.MIN_VALUE ? Long.MAX_VALUE : Math.abs(delta);
         return (delta > 0L ? Illlllllilll<invokedynamic>() : Illlllllilll<invokedynamic>()) + liiiIIllIl(var2);
      }
   }

   private static void IlIlllIlilIl(StringBuilder value, long b) {
      long var6 = 6069000139486908374L;
      String var3 = Long.toString(b);
      var6 ^= ((long)var3.length() << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         if ((int)var9 > 0 && ((int)(var9 >>> 32) - (int)var9) % 3 == 0) {
            value.append(',');
         }

         value.append(var3.charAt((int)var9));
      }

   }

   public static String lIiiIiIlilli(long value) {
      StringBuilder var2 = new StringBuilder(28);
      if (value < 0L) {
         var2.append('-');
         if (value == Long.MIN_VALUE) {
            return var2.append(Illlllllilll<invokedynamic>()).toString();
         }

         value = -value;
      }

      IlIlllIlilIl(var2, value);
      return var2.toString();
   }

   public static String IilliliilIIi(long coins) {
      if (coins < 0L) {
         return Illlllllilll<invokedynamic>();
      } else {
         StringBuilder var2 = (new StringBuilder(28)).append('$');
         IlIlllIlilIl(var2, coins);
         return var2.toString();
      }
   }

   public static String iIlIlllllill(long coins, int decimals) {
      long var17 = -1154773547544790536L;
      long var15 = -6653949486906230469L;
      if (coins < 0L) {
         return Illlllllilll<invokedynamic>();
      } else if (coins < 1000L) {
         return Illlllllilll<invokedynamic>() + coins;
      } else {
         var15 ^= ((long)Math.max(0, Math.min(lilliIlIIi.length - 1, decimals)) << 32 ^ var15) & -1L << 32;
         long var4 = lilliIlIIi[(int)(var15 >>> 32)];
         var15 ^= ((long)(illliIlIIi.length - 1) ^ var15) & -1L >>> 32;

         for(long var21 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var21 >>> 32) <= (int)var15; var21 += 4294967296L) {
            long var8 = illliIlIIi[(int)(var21 >>> 32)];
            long var10 = coins / var8;
            long var12 = (coins % var8 * var4 + var8 / 2L) / var8;
            if (var12 >= var4) {
               ++var10;
               var12 -= var4;
            }

            if (var10 < 1000L || (int)(var21 >>> 32) >= (int)var15) {
               StringBuilder var14 = (new StringBuilder(20)).append('$');
               if ((int)(var21 >>> 32) == (int)var15) {
                  IlIlllIlilIl(var14, var10);
               } else {
                  var14.append(var10);
               }

               IiIlliIliiIl(var14, var12, (int)(var15 >>> 32));
               return var14.append(IilliIlIIi[(int)(var21 >>> 32)]).toString();
            }
         }

         return IilliliilIIi(coins);
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) - var5) - var5) + '豦') - var5) - var5))) ^ 18759) - '\udbce') >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) - var5) - var5) + '豦') - var5) - var5))) ^ 18759) - '\udbce') << 15));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 1559) - '誌') + '\uf342') + var5) << 4 | (char)((char)((char)((char)(var4[var5] - 1559) - '誌') + '\uf342') + var5) >>> 12) ^ '뭯') + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 1559) - '誌') + '\uf342') + var5) << 4 | (char)((char)((char)((char)(var4[var5] - 1559) - '誌') + '\uf342') + var5) >>> 12) ^ '뭯') + var5) << 10) - var5) + var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) >>> 9 | (char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) << 7) << 6 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) >>> 9 | (char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) << 7) >>> 10) << 10 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) >>> 9 | (char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) << 7) << 6 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) >>> 9 | (char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) << 6 | (char)((char)(-var4[var5]) - var5) >>> 10) + var5))) ^ 17435))) << 7) >>> 10) >>> 6));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)(-((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))))))) - 14882) ^ 18202) - 'ꦿ'))) ^ '﵁') ^ var5) << 4 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)(-((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))))))) - 14882) ^ 18202) - 'ꦿ'))) ^ '﵁') ^ var5) >>> 12))) - '\udd6b') - 21279) << 14 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)(-((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))))))) - 14882) ^ 18202) - 'ꦿ'))) ^ '﵁') ^ var5) << 4 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)(-((char)(~((char)(var4[var5] << 3 | var4[var5] >>> 13))))))))) - 14882) ^ 18202) - 'ꦿ'))) ^ '﵁') ^ var5) >>> 12))) - '\udd6b') - 21279) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static <K> iliIIIiIiiIIIi<K> IliIlllilIi(Map<K, Integer> unitPrice, Map<K, Long> need) {
      long var13 = -6836084207309166536L;
      long var15 = 3255320165424940030L;
      ArrayList var2 = new ArrayList();
      long var3 = 0L;
      var13 ^= (0L ^ var13) & -1L << 32;
      var13 ^= (0L ^ var13) & -1L >>> 32;

      for(Map.Entry var8 : unitPrice.entrySet()) {
         var15 ^= ((long)(var8.getValue() == null ? 0 : Math.max(0, (Integer)var8.getValue())) << 32 ^ var15) & -1L << 32;
         if ((int)(var15 >>> 32) != 0) {
            Long var10 = need == null ? null : (Long)need.get(var8.getKey());
            if (var10 != null && var10 >= 0L) {
               long var11 = var10 * (long)((int)(var15 >>> 32));
               var2.add(new IiIlliilliIlliil(var8.getKey(), (int)(var15 >>> 32), var10, var11, true));
               var3 += var11;
               var13 += 4294967296L;
            } else {
               var2.add(new IiIlliilliIlliil(var8.getKey(), (int)(var15 >>> 32), -1L, 0L, false));
               var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32;
            }
         }
      }

      var2.sort((a, b) -> Long.compare(b.IliIIiilil, a.IliIIiilil));
      return new iliIIIiIiiIIIi<K>(var2, var3, (int)(var13 >>> 32), (int)var13);
   }

   public static String liiiIIllIl(long coins) {
      return iIlIlllllill(coins, 1);
   }
}
