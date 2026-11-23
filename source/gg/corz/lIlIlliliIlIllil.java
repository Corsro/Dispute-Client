package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIlIlliliIlIllil {
   private static final String[] lIlllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};
   private static final String[] ilIllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};
   private static final String[] IIlllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};
   private static final String[] IiIllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};
   private static final String[] liIllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};
   public static final int iIIllliIil = 240;
   private static final String[] IlIllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};
   private static final String[] llIllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};
   private static final Pattern iIlllliIil = Pattern.compile(lIiiIiIlilli<invokedynamic>());
   private static final String[] iiIllliIil = new String[]{lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>()};

   public static IIlIiilIlIii IliIlllilIi(String line) {
      if (line != null && line.length() <= ((-1849293272 - 117 - -41 << 29 | -1849293272 - 117 - -41 >>> 3) + 103 ^ -1841774126)) {
         String var1 = iiilliilIIIiliil.IliIlllilIi(line);
         if (var1.isEmpty()) {
            return IIlIiilIlIii.lilllllIliilllllIl;
         } else if (IilliliilIIi(var1, llIllliIil)) {
            return IIlIiilIlIii.lIIilllIliIIilllIl;
         } else if (IilliliilIIi(var1, IlIllliIil)) {
            return IIlIiilIlIii.iiillllIlIIIilllIl;
         } else if (var1.contains(lIiiIiIlilli<invokedynamic>()) && !IilliliilIIi(var1, IIlllliIil)) {
            if (IilliliilIIi(var1, ilIllliIil)) {
               return IIlIiilIlIii.iIillllIlIlillllIl;
            } else if (IilliliilIIi(var1, IiIllliIil)) {
               return IIlIiilIlIii.llillllIlilillllIl;
            } else if (IilliliilIIi(var1, liIllliIil)) {
               return IIlIiilIlIii.IiillllIlliillllIl;
            } else if (IilliliilIIi(var1, lIlllliIil)) {
               return IIlIiilIlIii.lilllllIliilllllIl;
            } else {
               return iIlllliIil.matcher(var1).find() ? IIlIiilIlIii.IIillllIllIillllIl : IIlIiilIlIii.lilllllIliilllllIl;
            }
         } else {
            return IIlIiilIlIii.lilllllIliilllllIl;
         }
      } else {
         return IIlIiilIlIii.lilllllIliilllllIl;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '顖') ^ var5) << 1 | (char)((char)(var4[var5] - '顖') ^ var5) >>> 15) << 4 | (char)((char)((char)(var4[var5] - '顖') ^ var5) << 1 | (char)((char)(var4[var5] - '顖') ^ var5) >>> 15) >>> 12) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - '顖') ^ var5) << 1 | (char)((char)(var4[var5] - '顖') ^ var5) >>> 15) << 4 | (char)((char)((char)(var4[var5] - '顖') ^ var5) << 1 | (char)((char)(var4[var5] - '顖') ^ var5) >>> 15) >>> 12) - var5) << 15) ^ '\ud84f') + '\udfaf') + 18479) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) << 2 | (char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) >>> 14))) + '\ud7ae') + 8144))) >>> 3 | (char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) << 2 | (char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) >>> 14))) + '\ud7ae') + 8144))) << 13) - 19185) ^ '﹂') ^ var5) + var5) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) << 2 | (char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) >>> 14))) + '\ud7ae') + 8144))) >>> 3 | (char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) << 2 | (char)((char)(-((char)(var4[var5] - '\uf348'))) + var5) >>> 14))) + '\ud7ae') + 8144))) << 13) - 19185) ^ '﹂') ^ var5) + var5) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIlIlliliIlIllil() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) >>> 15))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) >>> 15))) >>> 6) + '迥') - '螷'))) - var5) << 1 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) >>> 15))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) << 1 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) >>> 7 | (char)((char)(~((char)(-((char)((char)(var4[var5] ^ '\udbad') << 9 | (char)(var4[var5] ^ '\udbad') >>> 7))))) - 17539) << 9) + var5) - var5) >>> 15))) >>> 6) + '迥') - '螷'))) - var5) >>> 15) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IilliliilIIi(String keys, String[] s) {
      for(String var5 : s) {
         if (keys.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   public static boolean iIlIlllllill(String online, Predicate<String> line) {
      if (online != null && !online.isBlank() && online.length() <= (((538884979 ^ -43) + 59 >>> 27 | (538884979 ^ -43) + 59 << 5) ^ -64447285)) {
         if (iiilliilIIIiliil.IlIlllIlilIl(online, line)) {
            return false;
         } else {
            String var2 = iiilliilIIIiliil.IliIlllilIi(online);
            if (!var2.isEmpty() && !IilliliilIIi(var2, IIlllliIil)) {
               if (IliIlllilIi(online) == IIlIiilIlIii.lilllllIliilllllIl && !liiiIIllIl(online)) {
                  IIiIiillIiIiil var3 = iiilIllIIIiIll.IliIlllilIi(online, 0L, line).liiiIIllIl();
                  if (var3 != IIiIiillIiIiil.IlIiliIlillIiliIli && var3 != IIiIiillIiIiil.IililiIlilililiIli) {
                     return true;
                  } else if (var2.contains(lIiiIiIlilli<invokedynamic>())) {
                     return true;
                  } else {
                     IilIIiililIIii var4 = iiilliilIIIiliil.liiiIIllIl(online);
                     return var4 == IilIIiililIIii.lliilllIIl || var4 == IilIIiililIIii.iliilllIIl || iiilliilIIIiliil.IilliliilIIi(online);
                  }
               } else {
                  return true;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   public static boolean liiiIIllIl(String line) {
      if (line != null && line.length() <= (((1734196227 >>> 25 | 1734196227 << 7) ^ -37) * -115 ^ -1917143112)) {
         String var1 = iiilliilIIIiliil.IliIlllilIi(line);
         return var1.contains(lIiiIiIlilli<invokedynamic>()) && IilliliilIIi(var1, iiIllliIil) && !IilliliilIIi(var1, IIlllliIil);
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1737454638219685745L ^ Long.rotateLeft(8512449484026863740L, 34) ^ 8318484582122338799L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5514193189866068493L ^ Long.rotateLeft(4088274138028880561L, 3) ^ -609548326075523556L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3671652868087518661L ^ Long.rotateLeft(1583241814977179440L, 50) ^ 8759773808551927629L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4815795665513454910L ^ Long.rotateLeft(109855020828398226L, 2) ^ -224683524600737636L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7278385761251292917L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4515052874463034918L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3147212507887830543L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -379304507669488282L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7058147201139350661L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1700495072060405582L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5) ^ '零') ^ '텬'))) >>> 3 | (char)(-((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5) ^ '零') ^ '텬'))) << 13) + var5) + '벂') + var5) ^ 2871))) + var5) - var5) - 21618) - '霼') - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') << 10) + '蛻') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') << 10) + '蛻') << 3) ^ var5) - '뷈'))) - 29978))) + var5) + '\uea81') >>> 6 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') << 10) + '蛻') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') >>> 6 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) + var5) << 13) - var5) ^ '훉') - 'ꨪ') << 10) + '蛻') << 3) ^ var5) - '뷈'))) - 29978))) + var5) + '\uea81') << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
