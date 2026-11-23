package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IliIiIIilliIiIIi {
   public static String liiiIIllIl(String content, IIIIliilIIIlii teamCode) {
      long var8 = 250247331330346469L;
      String var2 = IliIlllilIi(content);
      String var3 = var2.isEmpty() ? IilliliilIIi<invokedynamic>() + (teamCode == null ? "" : teamCode.Ililllililil()) : IilliliilIIi<invokedynamic>() + var2;

      try {
         MessageDigest var4 = MessageDigest.getInstance(IilliliilIIi<invokedynamic>());
         byte[] var5 = var4.digest(var3.getBytes(StandardCharsets.UTF_8));
         StringBuilder var6 = new StringBuilder(24);

         for(long var11 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var11 >>> 32) < 12; var11 += 4294967296L) {
            var6.append(Character.forDigit(var5[(int)(var11 >>> 32)] >> 4 & 15, 16)).append(Character.forDigit(var5[(int)(var11 >>> 32)] & 15, 16));
         }

         return var6.toString();
      } catch (Exception var10) {
         return Integer.toHexString(var3.hashCode()).toLowerCase(Locale.ROOT);
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) + var5) - var5))) ^ '쥫'))) ^ 11061) >>> 10 | (char)((char)(-((char)((char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) + var5) - var5))) ^ '쥫'))) ^ 11061) << 6) >>> 9 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) + var5) - var5))) ^ '쥫'))) ^ 11061) >>> 10 | (char)((char)(-((char)((char)(~((char)((char)((char)(-((char)(var4[var5] >>> 10 | var4[var5] << 6))) + var5) - var5))) ^ '쥫'))) ^ 11061) << 6) << 7) ^ var5) + '\ud978'))))) - var5) + var5) - var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String iIlIlllllill(String teamCode) {
      return IliIlllilIi(teamCode);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') >>> 7 | (char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') << 9) + var5) ^ var5))) ^ var5))))) >>> 3 | (char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') >>> 7 | (char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') << 9) + var5) ^ var5))) ^ var5))))) << 13) << 2 | (char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') >>> 7 | (char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') << 9) + var5) ^ var5))) ^ var5))))) >>> 3 | (char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') >>> 7 | (char)((char)((char)(var4[var5] - var5) - '\uf849') + '\uab00') << 9) + var5) ^ var5))) ^ var5))))) << 13) >>> 14));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)(~((char)((char)(~((char)(-((char)(-((char)((char)((char)(-((char)((char)(-var4[var5]) - '遟'))) >>> 8 | (char)(-((char)((char)(-var4[var5]) - '遟'))) << 8) ^ 14408))))))) ^ var5))))) << 14 | (char)(~((char)(~((char)((char)(~((char)(-((char)(-((char)((char)((char)(-((char)((char)(-var4[var5]) - '遟'))) >>> 8 | (char)(-((char)((char)(-var4[var5]) - '遟'))) << 8) ^ 14408))))))) ^ var5))))) >>> 2))) - 18165))) ^ var5) - var5) + 11831));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(-var4[var5]))))) + 27955))) + '룺') - '\ueedf') + var5) - var5) ^ var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(-var4[var5]))))) + 27955))) + '룺') - '\ueedf') + var5) - var5) ^ var5) >>> 6) - '쩝') - '鵨') ^ var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IliIiIIilliIiIIi() {
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8244094741617079312L ^ Long.rotateLeft(-1981203719670919862L, 54) ^ 2178943561325390506L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1431293889359083020L ^ Long.rotateLeft(-4761084740245943233L, 12) ^ -7013113850434089522L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5977289169101561160L ^ Long.rotateLeft(-5121703606842958174L, 60) ^ -1700017528345699775L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3040368330190539864L ^ Long.rotateLeft(5966011975373674703L, 61) ^ 2724447070332063984L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2493698223117864706L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1968665134426476706L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7802801315541772214L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1165237820974917905L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1622747005634163551L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5204981499414229460L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
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

   public static String IliIlllilIi(String teamCode) {
      long var4 = -8989697476517182061L;
      if (teamCode == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(teamCode.length());

         for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < teamCode.length(); var4 += 4294967296L) {
            var4 ^= ((long)Character.toUpperCase(teamCode.charAt((int)(var4 >>> 32))) ^ var4) & -1L >>> 32;
            if ((int)var4 >= 65 && (int)var4 <= 90 || (int)var4 >= 48 && (int)var4 <= 57) {
               var1.append((char)((int)var4));
            }
         }

         return var1.toString();
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) << 1 | (char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) >>> 15) >>> 12 | (char)((char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) << 1 | (char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) >>> 15) << 4) - '螓') - var5) << 4 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) << 1 | (char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) >>> 15) >>> 12 | (char)((char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) << 1 | (char)(-((char)((char)(var4[var5] - 25506) ^ '訥'))) >>> 15) << 4) - '螓') - var5) >>> 12) - var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
