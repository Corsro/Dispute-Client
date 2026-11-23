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
import java.util.EnumSet;
import java.util.List;
import java.util.OptionalLong;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IilIiIlllilIiIll {
   public static boolean iliIiiliiiii(List<Long> read, long shown) {
      if (read == null) {
         return false;
      } else {
         for(Long var4 : read) {
            if (var4 != null && lIiiIiIlilli(var4, shown)) {
               return true;
            }
         }

         return false;
      }
   }

   public static Set<iIiiIIlIliiIIl> IlIlllIlilIl(String text) {
      long var7 = 2608971832854661802L;
      EnumSet var1 = EnumSet.noneOf(iIiiIIlIliiIIl.class);
      String var2 = iIiiIIlIliiIIl.IIIllIIliIIl(text);
      if (var2.isEmpty()) {
         return var1;
      } else {
         iIiiIIlIliiIIl[] var3 = iIiiIIlIliiIIl.values();
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            iIiiIIlIliiIIl var6 = var3[(int)var10];
            if (var2.contains(iIiiIIlIliiIIl.IIIllIIliIIl(var6.liiiIIllIl()))) {
               var1.add(var6);
            }
         }

         return var1;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - 21979) >>> 8 | (char)(var4[var5] - 21979) << 8))) >>> 1 | (char)(~((char)((char)(var4[var5] - 21979) >>> 8 | (char)(var4[var5] - 21979) << 8))) << 15) + var5) ^ '\uebe1') << 5 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - 21979) >>> 8 | (char)(var4[var5] - 21979) << 8))) >>> 1 | (char)(~((char)((char)(var4[var5] - 21979) >>> 8 | (char)(var4[var5] - 21979) << 8))) << 15) + var5) ^ '\uebe1') >>> 11) - 27240) + var5) ^ '鰬') + '\ue748'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) >>> 11) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) >>> 11) << 10) + '꽁') >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) >>> 11) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鼦') - 32158) - var5) ^ var5) ^ var5) + 28264) ^ 4811) + var5) >>> 11) << 10) + '꽁') << 13) - 12843) + var5) + '귷') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8351103636274960854L ^ Long.rotateLeft(6568907182449795880L, 4) ^ -4245132221966263864L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1360986277958842644L ^ Long.rotateLeft(-5321729099275455812L, 44) ^ -7963626743938436578L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4225384457517838025L ^ Long.rotateLeft(-2597929191283193117L, 14) ^ 4758848533452949993L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6680492246428282073L ^ Long.rotateLeft(-5063946465257199850L, 55) ^ -3003935759527379056L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6053707987191308479L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8163662687505046943L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7359825447972046282L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4771574693377530737L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4391035404261560858L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4228041419718316717L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiilliiliiil<invokedynamic>());
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

   public static boolean iIlIlllllill(String line) {
      return iIIiIiilIlIiIiil.lIiiIiIlilli(line).startsWith(Illlllllilll<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) >>> 8 | (char)(-((char)(~((char)(~var4[var5]))))) << 8) >>> 12 | (char)((char)(-((char)(~((char)(~var4[var5]))))) >>> 8 | (char)(-((char)(~((char)(~var4[var5]))))) << 8) << 4) ^ '\ueb31') ^ var5) << 3 | (char)((char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) >>> 8 | (char)(-((char)(~((char)(~var4[var5]))))) << 8) >>> 12 | (char)((char)(-((char)(~((char)(~var4[var5]))))) >>> 8 | (char)(-((char)(~((char)(~var4[var5]))))) << 8) << 4) ^ '\ueb31') ^ var5) >>> 13) + 10410) - 27323) - var5))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) << 3 | (char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) >>> 13))) << 10 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) << 3 | (char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) >>> 13))) >>> 6) ^ 25567) + var5) ^ '쾐') >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) << 3 | (char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) >>> 13))) << 10 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) << 3 | (char)((char)(-((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 10750) - 17150))) + var5) >>> 13))) >>> 6) ^ 25567) + var5) ^ '쾐') << 1));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) - 27281) - var5))) + 6144) - '뚇') - '\uf55c')))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IliIlllilIi(String word, String line) {
      String var2 = iIIiIiilIlIiIiil.lIiiIiIlilli(line);
      String var3 = iIIiIiilIlIiIiil.lIiiIiIlilli(word);
      if (!var2.isEmpty() && !var3.isEmpty()) {
         return var3.startsWith(var2) || var3.startsWith(Illlllllilll<invokedynamic>() + var2);
      } else {
         return false;
      }
   }

   private IilIiIlllilIiIll() {
   }

   static long IIlllIlliIll(long coins) {
      long var2;
      for(var2 = 1L; var2 <= 9223372036854775L && coins >= var2 * 1000L; var2 *= 1000L) {
      }

      return var2 / 10L;
   }

   public static boolean IIIllIIliIIl(long paid, IiIillIlliIillIl read) {
      return paid > 0L && read != null && paid > Math.max(read.iliIiiliiiii(), read.IIIllIIliIIl());
   }

   public static boolean liiiIIllIl(String line, String word) {
      String var2 = iIIiIiilIlIiIiil.lIiiIiIlilli(word);
      String var3 = iIIiIiilIlIiIiil.lIiiIiIlilli(line);
      if (!var2.isEmpty() && !var3.isEmpty()) {
         return var3.startsWith(var2) || var3.startsWith(Illlllllilll<invokedynamic>() + var2) || var3.startsWith(Illlllllilll<invokedynamic>() + var2);
      } else {
         return false;
      }
   }

   public static boolean IiIlliIliiIl(Set<String> before, Set<String> now) {
      long var5 = -798257118920572821L;
      if (before != null && !before.isEmpty() && now != null) {
         var5 ^= (0L ^ var5) & -1L << 32;

         for(String var4 : now) {
            if (before.contains(var4)) {
               var5 += 4294967296L;
            }
         }

         return (int)(var5 >>> 32) * 2 >= before.size();
      } else {
         return false;
      }
   }

   public static boolean lIiiIiIlilli(long read, long shown) {
      if (read > 0L && shown > 0L) {
         return Math.abs(read - shown) <= Math.max(IIlllIlliIll(read), IIlllIlliIll(shown));
      } else {
         return false;
      }
   }

   public static List<Long> IilliliilIIi(String text, String priceKeyword) {
      long var8 = -6136324155416879379L;
      ArrayList var2 = new ArrayList();
      String var3 = iIIiIiilIlIiIiil.lIiiIiIlilli(priceKeyword);
      String var4 = iIIiIiilIlIiIiil.lIiiIiIlilli(text);
      if (!var3.isEmpty() && !var4.isEmpty()) {
         for(var8 ^= ((long)var4.indexOf(var3) << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) >= 0; var8 ^= ((long)((int)var8) << 32 ^ var8) & -1L << 32) {
            var8 ^= ((long)var4.indexOf(var3, (int)(var8 >>> 32) + var3.length()) ^ var8) & -1L >>> 32;
            OptionalLong var7 = iIIiiilIlIiiil.liiiIIllIl(var4.substring((int)(var8 >>> 32) + var3.length(), (int)var8 < 0 ? var4.length() : (int)var8));
            if (var7.isPresent() && var7.getAsLong() > 0L) {
               var2.add(var7.getAsLong());
            }
         }

         return var2;
      } else {
         return var2;
      }
   }
}
