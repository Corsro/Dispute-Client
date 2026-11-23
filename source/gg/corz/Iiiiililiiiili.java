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
import java.util.Locale;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2561;
import net.minecraft.class_2583;
import net.minecraft.class_5250;

public final class Iiiiililiiiili {
   private static final int[] IIilIllIIl = new int[]{18, 15, 12, 9, 6, 3};
   private static final String[] iillIllIIl = new String[]{Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>()};
   private static final Pattern lIilIllIIl = Pattern.compile(Illlllllilll<invokedynamic>());
   private static final String[] lillIllIIl = new String[]{Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>(), Illlllllilll<invokedynamic>()};

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 10843) ^ var5) ^ var5) ^ 28041) + var5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] ^ 10843) ^ var5) ^ var5) ^ 28041) + var5) << 9))) + var5) + '켶'))) ^ var5) ^ var5) - 30944) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int[] iliIiiliiiii(String text) {
      long var2 = 7364330306376451272L;

      for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < text.length(); var4 += 4294967296L) {
         if (Character.isDigit(text.charAt((int)(var4 >>> 32)))) {
            return new int[]{(int)(var4 >>> 32), text.length()};
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 987) ^ var5))) + var5) + var5) + var5) ^ var5) - var5) - var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 987) ^ var5))) + var5) + var5) + var5) ^ var5) - var5) - var5) >>> 4) - var5) + '黎') + var5) + var5) + var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 987) ^ var5))) + var5) + var5) + var5) ^ var5) - var5) - var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 987) ^ var5))) + var5) + var5) + var5) ^ var5) - var5) - var5) >>> 4) - var5) + '黎') + var5) + var5) + var5) << 2));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + 3482) ^ var5) - 22694))))) ^ 21785) ^ var5) - var5) - 28473) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) << 9 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) >>> 7) >>> 2 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) << 9 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) >>> 7) << 14) - '뛔'))))) + var5) - 'ꪠ')) - var5) ^ var5) << 13 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) << 9 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) >>> 7) >>> 2 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) << 9 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 11 | (char)((char)(~var4[var5]) + var5) >>> 5) + '觽') - var5) >>> 7) << 14) - '뛔'))))) + var5) - 'ꪠ')) - var5) ^ var5) >>> 3));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ 25079) - '铓') - '謴') - '\ud9ea') - var5) - var5) + 12015) ^ var5))) ^ var5) + '輬') + '鞖'))) >>> 7 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ 25079) - '铓') - '謴') - '\ud9ea') - var5) - var5) + 12015) ^ var5))) ^ var5) + '輬') + '鞖'))) << 9) ^ '죁') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String liiiIIllIl(double n) {
      long var9 = 4360591012706909549L;
      double var2 = Math.abs(n);

      for(long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) < IIilIllIIl.length; var11 += 4294967296L) {
         double var5 = Math.pow((double)10.0F, (double)IIilIllIIl[(int)(var11 >>> 32)]);
         if (var2 >= var5) {
            double var7 = (double)Math.round(n / var5 * (double)10.0F) / (double)10.0F;
            return IilliliilIIi(var7) + iillIllIIl[(int)(var11 >>> 32)];
         }
      }

      return Long.toString(Math.round(n));
   }

   private Iiiiililiiiili() {
   }

   private static class_2561 IiIlliIliiIl(class_2561 original, String replacement, boolean toEnd) {
      long var19 = -5488335903248847397L;
      long var21 = -2231619528538293082L;
      long var23 = -30545346113077917L;
      long var25 = 8882912939701400014L;
      long var27 = 268365499494404236L;
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      original.method_27658((style, str) -> {
         var3.add(style);
         var4.add(str);
         return Optional.empty();
      }, class_2583.field_24360);
      StringBuilder var5 = new StringBuilder();

      for(String var7 : var4) {
         var5.append(var7);
      }

      int[] var29 = toEnd ? iliIiiliiiii(var5.toString()) : lIiiIiIlilli(var5.toString());
      if (var29 == null) {
         return original;
      } else {
         var19 ^= ((long)var29[0] << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)var29[1] ^ var19) & -1L >>> 32;
         class_5250 var9 = class_2561.method_43473();
         var21 ^= (0L ^ var21) & -1L << 32;
         var21 ^= (0L ^ var21) & -1L >>> 32;

         for(var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < var4.size(); var23 += 4294967296L) {
            String var13 = (String)var4.get((int)(var23 >>> 32));
            class_2583 var14 = (class_2583)var3.get((int)(var23 >>> 32));
            var23 ^= ((long)((int)(var21 >>> 32)) ^ var23) & -1L >>> 32;
            var25 ^= ((long)((int)(var21 >>> 32) + var13.length()) << 32 ^ var25) & -1L << 32;
            var25 ^= ((long)Math.min((int)(var25 >>> 32), (int)(var19 >>> 32)) ^ var25) & -1L >>> 32;
            if ((int)var25 > (int)var23) {
               var9.method_10852(class_2561.method_43470(var13.substring(0, (int)var25 - (int)var23)).method_10862(var14));
            }

            if ((int)var21 == 0 && (int)(var19 >>> 32) >= (int)var23 && (int)(var19 >>> 32) < (int)(var25 >>> 32)) {
               var9.method_10852(class_2561.method_43470(replacement).method_10862(var14));
               var21 ^= (1L ^ var21) & -1L >>> 32;
            }

            var27 ^= ((long)Math.max((int)var23, (int)var19) << 32 ^ var27) & -1L << 32;
            if ((int)(var25 >>> 32) > (int)(var27 >>> 32)) {
               var9.method_10852(class_2561.method_43470(var13.substring((int)(var27 >>> 32) - (int)var23)).method_10862(var14));
            }

            var21 ^= ((long)((int)(var25 >>> 32)) << 32 ^ var21) & -1L << 32;
         }

         if ((int)var21 == 0) {
            var9.method_10852(class_2561.method_43470(replacement));
         }

         return var9;
      }
   }

   private static String IilliliilIIi(double v) {
      return v == Math.floor(v) && !Double.isInfinite(v) ? Long.toString((long)v) : String.valueOf(v);
   }

   public static String iIlIlllllill(double n) {
      return Long.toString((long)Math.floor(n));
   }

   public static class_2561 IlIlllIlilIl(class_2561 replacement, String original) {
      return IiIlliIliiIl(replacement, original, true);
   }

   public static double IliIlllilIi(String raw) {
      long var5 = 1737279213751104684L;
      if (raw == null) {
         return Double.NaN;
      } else {
         String var1;
         for(var1 = raw.trim().toLowerCase(Locale.ROOT).replaceAll(Illlllllilll<invokedynamic>(), ""); !var1.isEmpty() && (var1.charAt(0) == '$' || var1.charAt(0) == 8364 || var1.charAt(0) == 163); var1 = var1.substring(1)) {
         }

         if (var1.isEmpty()) {
            return Double.NaN;
         } else {
            for(long var9 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var9 >>> 32) < lillIllIIl.length; var9 += 4294967296L) {
               if (var1.endsWith(lillIllIIl[(int)(var9 >>> 32)]) && var1.length() > lillIllIIl[(int)(var9 >>> 32)].length()) {
                  String var3 = var1.substring(0, var1.length() - lillIllIIl[(int)(var9 >>> 32)].length());

                  try {
                     return Double.parseDouble(var3) * Math.pow((double)10.0F, (double)IIilIllIIl[(int)(var9 >>> 32)]);
                  } catch (NumberFormatException var7) {
                     return Double.NaN;
                  }
               }
            }

            try {
               return Double.parseDouble(var1);
            } catch (NumberFormatException var8) {
               return Double.NaN;
            }
         }
      }
   }

   public static int[] lIiiIiIlilli(String text) {
      long var4 = 5346937217151865629L;
      Matcher var1 = lIilIllIIl.matcher(text);
      var4 ^= (-4294967296L ^ var4) & -1L << 32;

      for(var4 ^= ~var4 & -1L >>> 32; var1.find(); var4 ^= ((long)var1.end() ^ var4) & -1L >>> 32) {
         var4 ^= ((long)var1.start() << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32) < 0 ? null : new int[]{(int)(var4 >>> 32), (int)var4};
   }

   public static class_2561 IIIllIIliIIl(class_2561 replacement, String original) {
      return IiIlliIliiIl(replacement, original, false);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7355739263593415018L ^ Long.rotateLeft(307218298118566131L, 21) ^ 4748075467025071790L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4811520501681752915L ^ Long.rotateLeft(-1414100345444458294L, 11) ^ 3645523146501229223L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1204714906928380261L ^ Long.rotateLeft(6979787198433886035L, 24) ^ -3060924337161717771L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6101908453496069068L ^ Long.rotateLeft(1931794361976277407L, 26) ^ -8859339486507457137L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6298035140698927524L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2941035904427542093L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4093597047764880519L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -131756677108896721L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8170445644690061935L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8259233804326848998L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iiilliiliiil<invokedynamic>());
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
}
