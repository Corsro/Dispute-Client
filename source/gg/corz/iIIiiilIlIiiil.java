package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIIiiilIlIiiil {
   private static final Pattern iiiIillliIIIlillli = Pattern.compile(IIlllIlliIll<invokedynamic>(), 2);
   private static final Pattern IiiIillliliiIillli = Pattern.compile(IIlllIlliIll<invokedynamic>());
   private static final Pattern IlIlilllillIlillli = Pattern.compile(IIlllIlliIll<invokedynamic>(), 2);
   private static final String[] lIIlillliiIIlillli = new String[]{IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>()};
   private static final Pattern lliIillliiliIillli = Pattern.compile(IIlllIlliIll<invokedynamic>());

   public static OptionalLong iIlIlllllill(List<String> lines, String priceKeyword) {
      if (lines == null) {
         return OptionalLong.empty();
      } else {
         String var2 = priceKeyword == null ? "" : priceKeyword.toLowerCase(Locale.ROOT).trim();
         OptionalLong var3 = OptionalLong.empty();
         OptionalLong var4 = OptionalLong.empty();
         OptionalLong var5 = OptionalLong.empty();

         for(String var7 : lines) {
            if (var7 != null) {
               String var8 = IliIlllilIi(var7);
               String var9 = var8.toLowerCase(Locale.ROOT);
               OptionalLong var10 = liiiIIllIl(var8);
               if (!var10.isEmpty()) {
                  if (!var2.isEmpty() && var9.contains(var2) && var3.isEmpty()) {
                     var3 = var10;
                  }

                  if (var9.contains(IIlllIlliIll<invokedynamic>()) && !var9.contains(IIlllIlliIll<invokedynamic>()) && var4.isEmpty()) {
                     var4 = var10;
                  }

                  if (var5.isEmpty() && !IiIlliIliiIl(var9)) {
                     var5 = var10;
                  }
               }
            }
         }

         if (var3.isPresent()) {
            return var3;
         } else if (var4.isPresent()) {
            return var4;
         } else {
            return var5;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) << 3 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) >>> 13) ^ var5))) ^ 13746) << 11 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) << 3 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) >>> 13) ^ var5))) ^ 13746) >>> 5) - var5) ^ 29494))))))) << 13 | (char)(-((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) << 3 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) >>> 13) ^ var5))) ^ 13746) << 11 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) << 3 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) << 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 2) + var5) >>> 13) ^ var5))) ^ 13746) >>> 5) - var5) ^ 29494))))))) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean lIiiIiIlilli(List<String> loreLines, String priceKeyword) {
      if (loreLines == null) {
         return false;
      } else {
         String var2 = priceKeyword == null ? "" : priceKeyword.toLowerCase(Locale.ROOT).trim();

         for(String var4 : loreLines) {
            if (var4 != null) {
               String var5 = IliIlllilIi(var4).toLowerCase(Locale.ROOT);
               if (var5.contains(IIlllIlliIll<invokedynamic>()) || !var2.isEmpty() && var5.contains(var2)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 29481) + '\ud885'))) - '麍') + '\uf129') + '利') - '낍'))) + var5))) ^ var5) - 5078) - var5) ^ var5) << 12 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 29481) + '\ud885'))) - '麍') + '\uf129') + '利') - '낍'))) + var5))) ^ var5) - 5078) - var5) ^ var5) >>> 4))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String IlIlllIlilIl(String s) {
      long var6 = -1356548728878358207L;
      long var8 = -6218865776672951711L;
      StringBuilder var1 = new StringBuilder();
      char[] var2 = IliIlllilIi(s).toLowerCase(Locale.ROOT).toCharArray();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for(long var11 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         var8 ^= ((long)var2[(int)var11] << 32 ^ var8) & -1L << 32;
         if (Character.isLetterOrDigit((char)((int)(var8 >>> 32)))) {
            var1.append((char)((int)(var8 >>> 32)));
         }
      }

      return var1.toString();
   }

   public static OptionalLong IilliliilIIi(List<String> loreLines, String priceKeyword) {
      long var10 = -479178225961075200L;
      if (loreLines == null) {
         return OptionalLong.empty();
      } else {
         String var2 = priceKeyword == null ? "" : priceKeyword.toLowerCase(Locale.ROOT).trim();
         OptionalLong var3 = OptionalLong.empty();
         if (!var2.isEmpty()) {
            for(String var5 : loreLines) {
               if (var5 != null) {
                  String var6 = IliIlllilIi(var5).toLowerCase(Locale.ROOT);
                  var10 ^= ((long)var6.indexOf(var2) << 32 ^ var10) & -1L << 32;
                  if ((int)(var10 >>> 32) >= 0) {
                     String var8 = var6.substring((int)(var10 >>> 32) + var2.length());
                     OptionalLong var9 = liiiIIllIl(var8);
                     if (var9.isEmpty()) {
                        if (var8.chars().anyMatch(Character::isDigit)) {
                           return OptionalLong.empty();
                        }

                        var9 = liiiIIllIl(var6);
                     }

                     if (var9.isPresent() && (var3.isEmpty() || var9.getAsLong() > var3.getAsLong())) {
                        var3 = var9;
                     }
                  }
               }
            }
         }

         return var3.isPresent() ? var3 : iIlIlllllill(loreLines, priceKeyword);
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5851584102023430058L ^ Long.rotateLeft(1763125805456726253L, 10) ^ 3717331094935256460L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7132405836322501029L ^ Long.rotateLeft(6963335171353211958L, 6) ^ -4180733365539919449L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7315919386714507346L ^ Long.rotateLeft(1714468753836918373L, 12) ^ 3323633895985361263L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1652159749568024072L ^ Long.rotateLeft(1464431230393272123L, 40) ^ 2517746082550476463L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3647831331243587727L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4990043647012416932L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2231417501382790194L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2050369330300112106L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3227309842470892138L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2674422933629611042L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) << 9 | (char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 7) + var5))) - 11564) >>> 5 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) << 9 | (char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 7) + var5))) - 11564) << 11) + var5) - '\uf6f1') - var5) + 2142))) ^ var5) ^ 19859));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static OptionalLong liiiIIllIl(String raw) {
      long var12 = -7358267792650278334L;
      String var1 = IliIlllilIi(raw);
      Matcher var2 = lliIillliiliIillli.matcher(var1);
      if (!var2.find()) {
         return OptionalLong.empty();
      } else {
         var12 ^= ((long)var2.end(1) << 32 ^ var12) & -1L << 32;
         if ((int)(var12 >>> 32) < var1.length() && Character.isLetter(var1.charAt((int)(var12 >>> 32))) && IIlllIlliIll<invokedynamic>().indexOf(var1.charAt((int)(var12 >>> 32))) < 0) {
            return OptionalLong.empty();
         } else if (IiiIillliliiIillli.matcher(var1).region((int)(var12 >>> 32), var1.length()).lookingAt()) {
            return OptionalLong.empty();
         } else {
            String var4 = var2.group(1).replace(IIlllIlliIll<invokedynamic>(), "");
            String var5 = var2.group(2);
            if (var5 != null && var2.start(2) > (int)(var12 >>> 32) && var2.end(2) < var1.length() && Character.isLetter(var1.charAt(var2.end(2)))) {
               if (iiiIillliIIIlillli.matcher(var1).region(var2.start(2), var1.length()).lookingAt()) {
                  return OptionalLong.empty();
               }

               var5 = null;
            }

            if (var5 == null && var2.group(1).matches(IIlllIlliIll<invokedynamic>())) {
               return OptionalLong.empty();
            } else {
               double var6;
               try {
                  var6 = Double.parseDouble(var4);
               } catch (NumberFormatException var14) {
                  return OptionalLong.empty();
               }

               long var10000;
               switch (var5 != null && !var5.isEmpty() ? Character.toLowerCase(var5.charAt(0)) : ' ') {
                  case 'b' -> var10000 = 1000000000L;
                  case 'k' -> var10000 = 1000L;
                  case 'm' -> var10000 = 1000000L;
                  case 't' -> var10000 = 1000000000000L;
                  default -> var10000 = 1L;
               }

               long var8 = var10000;
               long var10 = Math.round(var6 * (double)var8);
               return var10 >= 0L ? OptionalLong.of(var10) : OptionalLong.empty();
            }
         }
      }
   }

   private static boolean IiIlliIliiIl(String lowerLine) {
      long var5 = 7839449932751441352L;
      String[] var1 = lIIlillliiIIlillli;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         String var4 = var1[(int)var8];
         if (lowerLine.contains(var4)) {
            return true;
         }
      }

      return false;
   }

   private iIIiiilIlIiiil() {
   }

   public static boolean IIIllIIliIIl(String a, String b) {
      String var2 = IlIlllIlilIl(a);
      String var3 = IlIlllIlilIl(b);
      return !var2.isEmpty() && !var3.isEmpty() && (var2.contains(var3) || var3.contains(var2));
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) >>> 11) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) >>> 11) >>> 6) - 15779) ^ var5) + var5) + 22310) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) >>> 11) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ue0dc')) ^ var5) + var5) + '\uf1a5') ^ 9822)) ^ var5) << 12) >>> 11) >>> 6) - 15779) ^ var5) + var5) + 22310) + var5) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IliIlllilIi(String s) {
      long var4 = 4175959230552080275L;
      if (s == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(s.length());

         for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < s.length(); var4 += 4294967296L) {
            var4 ^= ((long)s.charAt((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
            if ((int)var4 == 167 && (int)(var4 >>> 32) + 1 < s.length()) {
               var4 += 4294967296L;
            } else {
               var1.append((char)((int)var4));
            }
         }

         return var1.toString();
      }
   }

   public static Optional<IIIililIIili> iliIiiliiiii(String raw) {
      long var4 = -7888493673734633906L;
      Matcher var1 = IlIlilllillIlillli.matcher(IliIlllilIi(raw));
      if (!var1.find()) {
         return Optional.empty();
      } else {
         try {
            var4 ^= ((long)Integer.parseInt(var1.group(1)) << 32 ^ var4) & -1L << 32;
         } catch (NumberFormatException var6) {
            return Optional.empty();
         }

         OptionalLong var3 = liiiIIllIl(var1.group(3));
         return (int)(var4 >>> 32) > 0 && !var3.isEmpty() ? Optional.of(new IIIililIIili((int)(var4 >>> 32), var3.getAsLong(), var1.group(2).trim())) : Optional.empty();
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') >>> 11))) ^ 4221) ^ var5) >>> 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') >>> 11))) ^ 4221) ^ var5) << 1))))) >>> 2 | (char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') >>> 11))) ^ 4221) ^ var5) >>> 15 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) << 13 | (char)((char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) << 6 | (char)((char)(var4[var5] + var5) >>> 13 | (char)(var4[var5] + var5) << 3) >>> 10) >>> 3) - var5)) ^ '홦') >>> 11))) ^ 4221) ^ var5) << 1))))) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
