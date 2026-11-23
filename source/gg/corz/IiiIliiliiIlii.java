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

public final class IiiIliiliiIlii {
   public static boolean IliIlllilIi(int cp) {
      return cp >= 32 && cp <= 126 || cp >= 160 && cp <= 254 || cp == 10;
   }

   private IiiIliiliiIlii() {
   }

   public static String liiiIIllIl(String s) {
      long var8 = -7732361535915032748L;
      long var10 = -1532819173053749653L;
      long var12 = 8348182472978973261L;
      long var14 = -9007510241917290223L;
      if (s != null && !s.isEmpty()) {
         var8 ^= ((long)s.length() << 32 ^ var8) & -1L << 32;
         var8 ^= ~var8 & -1L >>> 32;

         for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)(var8 >>> 32); var10 += 4294967296L) {
            if (!IliIlllilIi(s.charAt((int)(var10 >>> 32)))) {
               var8 ^= ((long)((int)(var10 >>> 32)) ^ var8) & -1L >>> 32;
               break;
            }
         }

         if ((int)var8 < 0) {
            return s;
         } else {
            StringBuilder var3 = new StringBuilder((int)(var8 >>> 32) + 8);
            var3.append(s, 0, (int)var8);

            for(long var19 = var10 ^ ((long)((int)var8) ^ var10) & -1L >>> 32; (int)var19 < (int)(var8 >>> 32); var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
               var12 ^= ((long)s.charAt((int)var19) << 32 ^ var12) & -1L << 32;
               if (IliIlllilIi((int)(var12 >>> 32))) {
                  var3.append((char)((int)(var12 >>> 32)));
               } else {
                  switch ((int)(var12 >>> 32)) {
                     case 160:
                        var3.append(' ');
                        break;
                     case 8211:
                     case 8212:
                        var12 ^= ((long)(var3.length() > 0 && var3.charAt(var3.length() - 1) == ' ' ? 1 : 0) ^ var12) & -1L >>> 32;
                        var14 ^= ((long)((int)var19 + 1 < (int)(var8 >>> 32) && s.charAt((int)var19 + 1) == ' ' ? 1 : 0) << 32 ^ var14) & -1L << 32;
                        if ((int)var12 == 0) {
                           var3.append(' ');
                        }

                        var3.append('-');
                        if ((int)(var14 >>> 32) == 0) {
                           var3.append(' ');
                        }
                        break;
                     case 8216:
                     case 8217:
                        var3.append('\'');
                        break;
                     case 8220:
                     case 8221:
                        var3.append('"');
                        break;
                     case 8226:
                        var3.append('*');
                        break;
                     case 8230:
                        var3.append(IilliliilIIi<invokedynamic>());
                        break;
                     case 8592:
                        var3.append(IilliliilIIi<invokedynamic>());
                        break;
                     case 8594:
                        var3.append(IilliliilIIi<invokedynamic>());
                        break;
                     case 10003:
                     case 10004:
                        var3.append('+');
                        break;
                     case 10007:
                     case 10008:
                        var3.append('x');
                        break;
                     default:
                        var3.append('?');
                  }
               }
            }

            return var3.toString();
         }
      } else {
         return s;
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2590480544678874402L ^ Long.rotateLeft(-4815037417935794963L, 60) ^ 268982331403005594L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4182085903073020316L ^ Long.rotateLeft(-615862800048006844L, 49) ^ -9158343566443872611L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1742403806872324227L ^ Long.rotateLeft(-6945678267920726656L, 23) ^ -611030987611006010L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2690159979208106691L ^ Long.rotateLeft(608774368622708803L, 2) ^ 9004086712557699871L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1709728763569975764L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1732407962416830337L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1117931635491192978L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8800569363558342628L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4236986675929976964L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4621500579298096325L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) >>> 10 | (char)(var4[var5] << 3 | var4[var5] >>> 13) << 6) ^ 14998))) - var5))) ^ '\ue39f') ^ 30122) ^ 2430) ^ '즞')) + 23173))) + 21697) - var5) - 30179));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) << 3 | (char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) >>> 13) - 15804) ^ 10749) >>> 3 | (char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) << 3 | (char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) >>> 13) - 15804) ^ 10749) << 13) - var5) ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) << 3 | (char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) >>> 13) - 15804) ^ 10749) >>> 3 | (char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) << 3 | (char)((char)((char)(-((char)((char)var4[var5] << 14 | (char)var4[var5] >>> 2))) ^ var5) - 30553) >>> 13) - 15804) ^ 10749) << 13) - var5) ^ var5))) << 2) + '\ud814') - var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 28624) + var5) ^ var5) ^ var5) + var5) ^ var5) ^ 'ꗼ') + var5))) + '썄'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 28770) - var5) ^ '\uf43d') + '쀱') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + 28770) - var5) ^ '\uf43d') + '쀱') - var5) << 5) - 23650) + '휓') + 19078) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + 28770) - var5) ^ '\uf43d') + '쀱') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + 28770) - var5) ^ '\uf43d') + '쀱') - var5) << 5) - 23650) + '휓') + 19078) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - '凉') + var5))) << 14 | (char)(~((char)((char)(var4[var5] - '凉') + var5))) >>> 2) - var5) << 5 | (char)((char)((char)(~((char)((char)(var4[var5] - '凉') + var5))) << 14 | (char)(~((char)((char)(var4[var5] - '凉') + var5))) >>> 2) - var5) >>> 11) - var5) - var5))) - 'ꝍ') << 11 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - '凉') + var5))) << 14 | (char)(~((char)((char)(var4[var5] - '凉') + var5))) >>> 2) - var5) << 5 | (char)((char)((char)(~((char)((char)(var4[var5] - '凉') + var5))) << 14 | (char)(~((char)((char)(var4[var5] - '凉') + var5))) >>> 2) - var5) >>> 11) - var5) - var5))) - 'ꝍ') >>> 5) ^ var5) + 13051) ^ 21961) - 31155));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(String s) {
      long var2 = -7031237033948451425L;
      if (s == null) {
         return true;
      } else {
         for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < s.length(); var4 += 4294967296L) {
            if (!IliIlllilIi(s.charAt((int)(var4 >>> 32)))) {
               return false;
            }
         }

         return true;
      }
   }
}
