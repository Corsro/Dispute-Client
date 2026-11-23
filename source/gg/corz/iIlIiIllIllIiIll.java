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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class iIlIiIllIllIiIll {
   private static final String IIIIililll = "abcdefghijklmnopqrstuvwyz";
   private static final Pattern lIIIililll = Pattern.compile(IIIllIIliIIl<invokedynamic>());
   private final int IiIIililll;
   final int iIIIililll;
   private final List<IiIiIIIlliIiIIIl> ilIIililll;
   final int llIIililll;
   private static final String iiiillilll = "ᴀʙᴄᴅᴇꜰɢʜɪᴊᴋʟᴍɴᴏᴘǫʀꜱᴛᴜᴠᴡʏᴢ";
   final int IlIIililll;

   static IilIIIlllilIIIll liiiIIllIl(boolean name, boolean bone, String empty) {
      if (name) {
         return IilIIIlllilIIIll.IIIIiiIlll;
      } else if (bone) {
         return IilIIIlllilIIIll.lIIIiiIlll;
      } else {
         String var3 = iliIiiliiiii(empty);
         if (var3.contains(IIIllIIliIIl<invokedynamic>())) {
            return IilIIIlllilIIIll.ilIIiiIlll;
         } else if (var3.contains(IIIllIIliIIl<invokedynamic>())) {
            return IilIIIlllilIIIll.IlIIiiIlll;
         } else if (!var3.contains(IIIllIIliIIl<invokedynamic>()) && !var3.contains(IIIllIIliIIl<invokedynamic>())) {
            return var3.contains(IIIllIIliIIl<invokedynamic>()) && !var3.equals(IIIllIIliIIl<invokedynamic>()) ? IilIIIlllilIIIll.iIIIiiIlll : IilIIIlllilIIIll.IiIIiiIlll;
         } else {
            return IilIIIlllilIIIll.llIIiiIlll;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) + var5) - 29538) - '捻') ^ 4255) ^ var5) - var5) ^ var5) + var5) - '\udb40') ^ var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static iIlIiIllIllIiIll IliIlllilIi(List<IiIiIIIlliIiIIIl> cells) {
      int var1 = Integer.MIN_VALUE;
      int var2 = Integer.MAX_VALUE;

      for(IiIiIIIlliIiIIIl var4 : cells) {
         var1 = Math.max(var1, var4.iIlIlllllill());
         var2 = Math.min(var2, var4.iIlIlllllill());
      }

      if (!cells.isEmpty() && var2 != var1) {
         int var8 = 0;
         int var9 = -1;
         int var5 = -1;

         for(IiIiIIIlliIiIIIl var7 : cells) {
            if (var7.iIlIlllllill() != var1) {
               if (var7.IilliliilIIi() == IilIIIlllilIIIll.lIIIiiIlll) {
                  var8 += var7.lIiiIiIlilli();
               }
            } else if (var7.IilliliilIIi() == IilIIIlllilIIIll.iIIIiiIlll) {
               var9 = var7.IliIlllilIi();
            } else if (var7.IilliliilIIi() == IilIIIlllilIIIll.IlIIiiIlll && var5 < 0) {
               var5 = var7.IliIlllilIi();
            }
         }

         return new iIlIiIllIllIiIll(cells, var1, var9, var5, var8);
      } else {
         return new iIlIiIllIllIiIll(cells, Integer.MIN_VALUE, -1, -1, 0);
      }
   }

   static String iliIiiliiiii(String name) {
      if (name == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(name.length());

         for(int var2 = 0; var2 < name.length(); ++var2) {
            char var3 = name.charAt(var2);
            int var4 = IIIllIIliIIl<invokedynamic>().indexOf(var3);
            var1.append(var4 >= 0 ? IIIllIIliIIl<invokedynamic>().charAt(var4) : var3);
         }

         return var1.toString().toLowerCase(Locale.ROOT);
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6273440471177497362L ^ Long.rotateLeft(3349641563630329553L, 4) ^ -587121685048438553L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 599521038359017833L ^ Long.rotateLeft(5993889590926666955L, 23) ^ 2921770991341831990L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6864052797700091687L ^ Long.rotateLeft(74438676217574790L, 54) ^ 4949777581135254389L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1063810272288972348L ^ Long.rotateLeft(5696527215957838125L, 4) ^ 4543291119122463400L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1836502215296966726L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6970488550443680523L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2404129909127313057L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7194027703794673336L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5755384961497936294L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8921181591618200355L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '芐') - var5) + 23506) << 2 | (char)((char)((char)(var4[var5] ^ '芐') - var5) + 23506) >>> 14) - var5))) ^ var5))))) >>> 4 | (char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '芐') - var5) + 23506) << 2 | (char)((char)((char)(var4[var5] ^ '芐') - var5) + 23506) >>> 14) - var5))) ^ var5))))) << 12))) + var5) - var5))) + 22254) - var5)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iIlIiIllIllIiIll(List<IiIiIIIlliIiIIIl> dropSlot, int controlY, int bones, int cells, int nextSlot) {
      this.ilIIililll = dropSlot;
      this.IiIIililll = controlY;
      this.iIIIililll = bones;
      this.IlIIililll = cells;
      this.llIIililll = nextSlot;
   }

   static long lIiiIiIlilli(String line) {
      long var6 = -5498367343183581033L;
      Matcher var1 = lIIIililll.matcher(line);
      if (!var1.find()) {
         return -1L;
      } else {
         String var2 = var1.group(1);
         String var3 = var1.group(2);

         try {
            if (var3 == null) {
               return Long.parseLong(var2.replace(IIIllIIliIIl<invokedynamic>(), "").replace(IIIllIIliIIl<invokedynamic>(), ""));
            } else {
               var6 ^= ((long)Math.max(var2.lastIndexOf(-(~-1135718975 * 1041204193) ^ 486186412), var2.lastIndexOf(((889860510 << 19 | 889860510 >>> 13) - -89) * 1556147571 + 3 ^ -1590417843)) << 32 ^ var6) & -1L << 32;
               String var5 = (int)(var6 >>> 32) < 0 ? var2 : var2.substring(0, (int)(var6 >>> 32)).replace(IIIllIIliIIl<invokedynamic>(), "").replace(IIIllIIliIIl<invokedynamic>(), "") + IIIllIIliIIl<invokedynamic>() + var2.substring((int)(var6 >>> 32) + 1);
               return Math.round(Double.parseDouble(var5) * (double)(var3.equals(IIIllIIliIIl<invokedynamic>()) ? (-1710662592 * 85 ^ 37) + -11 ^ 622568114 : ((-239496961 + 67) * 85 << 13 | (-239496961 + 67) * 85 >>> 19) ^ -1487795693));
            }
         } catch (NumberFormatException var8) {
            return -1L;
         }
      }
   }

   long iIlIlllllill(int ignoreSlot) {
      long var2 = 1L;

      for(IiIiIIIlliIiIIIl var5 : this.ilIIililll) {
         if (var5.IliIlllilIi() != ignoreSlot) {
            var2 = var2 * 31L + (long)var5.IliIlllilIi();
            var2 = var2 * 31L + (long)var5.IilliliilIIi().ordinal();
            if (var5.iIlIlllllill() != this.IiIIililll) {
               var2 = var2 * 31L + (long)var5.lIiiIiIlilli();
               var2 = var2 * 31L + (long)var5.iliIiiliiiii();
            }
         }
      }

      return var2;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ 10576) ^ '萈') - var5) + var5) + '젎') - 6161) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ 10576) ^ '萈') - var5) + var5) + '젎') - 6161) << 13) - '豱') ^ var5))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int IilliliilIIi(List<String> lore) {
      for(String var2 : lore) {
         String var3 = iliIiiliiiii(var2);
         if (var3.contains(IIIllIIliIIl<invokedynamic>()) && !var3.contains(IIIllIIliIIl<invokedynamic>()) && !var3.contains(IIIllIIliIIl<invokedynamic>())) {
            long var4 = lIiiIiIlilli(var3);
            if (var4 >= 0L) {
               return (int)Math.min(2147483647L, var4);
            }
         }
      }

      return -1;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) << 11 | (char)(~var4[var5]) >>> 5) + 18724) >>> 10 | (char)((char)((char)(~var4[var5]) << 11 | (char)(~var4[var5]) >>> 5) + 18724) << 6) >>> 8 | (char)((char)((char)((char)(~var4[var5]) << 11 | (char)(~var4[var5]) >>> 5) + 18724) >>> 10 | (char)((char)((char)(~var4[var5]) << 11 | (char)(~var4[var5]) >>> 5) + 18724) << 6) << 8))) ^ var5) + var5) - var5) ^ var5) - var5))) ^ '酯') + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) << 14 | (char)((char)((char)(~var4[var5]) ^ var5) - var5) >>> 2) - '鱸') - 2145)) ^ var5) + 'ꂕ') - var5) ^ '쩫') + 17916) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
