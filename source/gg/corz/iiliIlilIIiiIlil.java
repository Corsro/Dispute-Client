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
import java.util.Optional;
import java.util.OptionalLong;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiliIlilIIiiIlil {
   private static final Pattern lIlIIliIil = Pattern.compile(IiIlliIliiIl<invokedynamic>());
   private static final long[] iIlIIliIil = new long[]{1L, 1000L, 1000000L, 1000000000L, 1000000000000L};

   public static boolean iIlIlllllill(Ilililillilili kind, iIiiIIlIliiIIl selfDestructKeyword, String in) {
      if (kind != null && selfDestructKeyword != null && kind.liiiIIllIl() != null) {
         if (iIiiIIlIliiIIl.iliIiiliiiii(kind.IliIlllilIi()).orElse((Object)null) == selfDestructKeyword && iliIiiliiiii(kind, selfDestructKeyword)) {
            return iIIiIiilIlIiIiil.iliIiiliiiii(kind.liiiIIllIl(), in, false) >= 0;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static Optional<IiIillIlliIillIl> IliIlllilIi(Ilililillilili in, int selfDestructKeyword, int priceKeyword, String page, String slot) {
      long var17 = -8145538682672981900L;
      if (in != null && in.liiiIIllIl() != null) {
         String var5 = iIIiIiilIlIiIiil.lIiiIiIlilli(page);
         if (!var5.isEmpty() && !iIIiIiilIlIiIiil.lIiiIiIlilli(slot).isEmpty()) {
            iIiiIIlIliiIIl var6 = (iIiiIIlIliiIIl)iIiiIIlIliiIIl.iliIiiliiiii(in.IliIlllilIi()).orElse((Object)null);
            if (var6 != null && iliIiiliiiii(in, var6)) {
               var17 ^= ((long)iIIiIiilIlIiIiil.iliIiiliiiii(in.liiiIIllIl(), slot, false) << 32 ^ var17) & -1L << 32;
               OptionalLong var8 = iIIiIiilIlIiIiil.IliIlllilIi(in.liiiIIllIl(), slot);
               if (!var8.isEmpty() && var8.getAsLong() > 0L) {
                  var17 ^= ((long)iIIiIiilIlIiIiil.iliIiiliiiii(in.liiiIIllIl(), page, true) ^ var17) & -1L >>> 32;
                  if ((int)var17 >= 0 && (int)var17 != (int)(var17 >>> 32)) {
                     String var10 = iIIiIiilIlIiIiil.lIiiIiIlilli((String)in.liiiIIllIl().get((int)var17));
                     if (var10.contains(iIIiIiilIlIiIiil.lIiiIiIlilli(var6.iIlIlllllill()))) {
                        return Optional.empty();
                     } else {
                        String var11 = var10.substring(var10.indexOf(var5) + var5.length());
                        OptionalLong var12 = iIIiiilIlIiiil.liiiIIllIl(var11);
                        if (!var12.isEmpty() && var12.getAsLong() > 0L) {
                           double var13 = IIIllIIliIIl(in.IilliliilIIi());
                           String var15 = iIIiiilIlIiiil.IliIlllilIi(in.IliIlllilIi()).trim();
                           String var16 = IlIlllIlilIl(var6, var12.getAsLong(), in.liiiIIllIl(), (int)(var17 >>> 32), (int)var17, var13);
                           return Optional.of(new IiIillIlliIillIl(var6, selfDestructKeyword, priceKeyword, var15, var12.getAsLong(), liiiIIllIl(var11, var12.getAsLong()), var8.getAsLong(), var13, var16));
                        } else {
                           return Optional.empty();
                        }
                     }
                  } else {
                     return Optional.empty();
                  }
               } else {
                  return Optional.empty();
               }
            } else {
               return Optional.empty();
            }
         } else {
            return Optional.empty();
         }
      } else {
         return Optional.empty();
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '蛯') >>> 9 | (char)(var4[var5] ^ '蛯') << 7) ^ var5) + var5) - '놈') + var5))))) >>> 2 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '蛯') >>> 9 | (char)(var4[var5] ^ '蛯') << 7) ^ var5) + var5) - '놈') + var5))))) << 14) + var5) + '꽡') - var5) ^ 6076))) ^ '햰'))) - '遱') + 24494));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean iliIiiliiiii(Ilililillilili in, iIiiIIlIliiIIl kind) {
      return in.iIlIlllllill() == kind.IilliliilIIi() && iIIiIiilIlIiIiil.iliIiiliiiii(in.liiiIIllIl(), kind.iIlIlllllill(), false) >= 0;
   }

   public static boolean IilliliilIIi(Ilililillilili in, iIiiIIlIliiIIl kind) {
      if (in != null && kind != null && in.liiiIIllIl() != null) {
         return iIiiIIlIliiIIl.iliIiiliiiii(in.IliIlllilIi()).orElse((Object)null) == kind && !iliIiiliiiii(in, kind);
      } else {
         return false;
      }
   }

   public static boolean lIiiIiIlilli(IiIillIlliIillIl a, IiIillIlliIillIl b, long toleranceSeconds) {
      if (a != null && b != null && a.IIlllIlliIll() != null && a.IIlllIlliIll().equals(b.IIlllIlliIll())) {
         long var4 = Math.max(a.IlIlllIlilIl(), b.IlIlllIlilIl()) - Math.min(a.IlIlllIlilIl(), b.IlIlllIlilIl());
         return var4 >= 0L && var4 <= Math.max(0L, toleranceSeconds);
      } else {
         return false;
      }
   }

   static long liiiIIllIl(String price, long priceText) {
      long var11 = 4647077765487800000L;
      long var13 = -8900431128281705829L;
      Matcher var3 = lIlIIliIil.matcher(price == null ? "" : price);
      if (priceText > 0L && var3.find()) {
         double var4;
         try {
            var4 = Double.parseDouble(var3.group().replace(IiIlliIliiIl<invokedynamic>(), ""));
         } catch (NumberFormatException var15) {
            return priceText;
         }

         var11 ^= ((long)(var3.group(1) == null ? 0 : var3.group(1).length()) << 32 ^ var11) & -1L << 32;

         for(long var17 = var11 ^ ((long)(iIlIIliIil.length - 1) ^ var11) & -1L >>> 32; (int)var17 >= 1; var17 ^= (var17 ^ var17 + (long)-1) & -1L >>> 32) {
            if (Math.round(var4 * (double)iIlIIliIil[(int)var17]) == priceText) {
               long var8 = iIlIIliIil[(int)var17];

               for(long var18 = var13 ^ ((long)Math.max(1, (int)(var17 >>> 32)) << 32 ^ var13) & -1L << 32; (int)(var18 >>> 32) > 0 && var8 >= 10L; var18 += -4294967296L) {
                  var8 /= 10L;
               }

               return priceText > Long.MAX_VALUE - var8 ? Long.MAX_VALUE : priceText + var8 - 1L;
            }
         }

         return priceText;
      } else {
         return priceText;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) << 5 | (char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) >>> 11) - var5) - var5)))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) << 5 | (char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) >>> 11) - var5) - var5)))) - var5) << 9) << 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) << 5 | (char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) >>> 11) - var5) - var5)))) - var5) >>> 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) << 5 | (char)((char)((char)((char)(var4[var5] + '\uf328') - 26006) - var5) + 7527) >>> 11) - var5) - var5)))) - var5) << 9) >>> 14) - var5))) ^ '\ue7ea'))))));
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
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) + var5))))) << 1 | (char)(-((char)(-((char)((char)((char)(var4[var5] + var5) >>> 12 | (char)(var4[var5] + var5) << 4) + var5))))) >>> 15) - var5) ^ '잯'))) - '\ueb27'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 18909) - var5) - var5) >>> 15 | (char)((char)((char)(var4[var5] + 18909) - var5) - var5) << 1) ^ 10480) - '씹') - var5) + 13240) + 4661) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2112936819857373255L ^ Long.rotateLeft(-7311710751381698139L, 34) ^ 8936299972080200704L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7248638973324528237L ^ Long.rotateLeft(-4423204518083743328L, 53) ^ 5176504590757974887L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 222674866567483261L ^ Long.rotateLeft(6340719949624056662L, 53) ^ -6192415077005643602L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2017430573201477450L ^ Long.rotateLeft(-5137045183963465945L, 27) ^ -6845820795894672391L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1788360088495638363L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1731352654782949741L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7505099596600935306L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7178110142008814881L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8700696878360872837L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3751440698836343390L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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

   private iiliIlilIIiiIlil() {
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) >>> 11 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) << 5) >>> 10 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) >>> 11 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) << 5) << 6) ^ var5) ^ '\udccc') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) >>> 11 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) << 5) >>> 10 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) >>> 11 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 917))))) ^ 31429))) - '颃') ^ '\ue1e3'))) - var5) - 24634) << 5) << 6) ^ var5) ^ '\udccc') << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String IlIlllIlilIl(iIiiIIlIliiIIl price, long timeAt, List<String> durability, int kind, int priceAt, double lore) {
      long var11 = -1073549193793284833L;
      StringJoiner var8 = new StringJoiner(IiIlliIliiIl<invokedynamic>());

      for(long var13 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var13 >>> 32) < durability.size(); var13 += 4294967296L) {
         if ((int)(var13 >>> 32) != kind && (int)(var13 >>> 32) != priceAt && !iIIiIiilIlIiIiil.liiiIIllIl(iIIiIiilIlIiIiil.lIiiIiIlilli((String)durability.get((int)(var13 >>> 32)))).isPresent()) {
            String var10 = iIiiIIlIliiIIl.IIIllIIliIIl((String)durability.get((int)(var13 >>> 32)));
            if (!var10.isEmpty()) {
               var8.add(var10);
            }
         }
      }

      return price.name() + '|' + timeAt + '|' + var8 + '|' + Math.round(lore * (double)1000.0F);
   }

   private static double IIIllIIliIIl(double d) {
      return Double.isNaN(d) ? (double)0.0F : Math.max((double)0.0F, Math.min((double)1.0F, d));
   }
}
