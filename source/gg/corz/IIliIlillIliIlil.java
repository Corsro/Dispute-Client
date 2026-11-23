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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIliIlillIliIlil {
   public static boolean iIlIlllllill(List<liiIilliiiIill> button, int grid) {
      if (button == null) {
         return false;
      } else {
         for(int var2 = 0; var2 < button.size(); ++var2) {
            if (var2 != grid) {
               liiIilliiiIill var3 = (liiIilliiiIill)button.get(var2);
               if (var3 == null || var3.IliIlllilIi()) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6405046182843024535L ^ Long.rotateLeft(6285770486819984635L, 26) ^ -1261440605754022518L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8469251497610662761L ^ Long.rotateLeft(-7257309208437092494L, 63) ^ -2597655598280903643L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2194051828611935475L ^ Long.rotateLeft(3636824724022199616L, 33) ^ -8853569506793033564L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5544361737965608416L ^ Long.rotateLeft(2312552465673494763L, 20) ^ 8426021424785335270L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 9122281223544397785L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -13078432992966578L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -940677957026437484L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7547559654221789567L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3802201049847888199L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 685163392315019468L;
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

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '飏') + var5))))) - 32573) >>> 11 | (char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) - '飏') + var5))))) - 32573) << 5))) - var5) - '킈') ^ 30753));
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
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 13 | (char)(-((char)(var4[var5] ^ var5))) << 3) ^ var5) + 14443))))) >>> 11 | (char)(-((char)(~((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 13 | (char)(-((char)(var4[var5] ^ var5))) << 3) ^ var5) + 14443))))) << 5))) >>> 2 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 13 | (char)(-((char)(var4[var5] ^ var5))) << 3) ^ var5) + 14443))))) >>> 11 | (char)(-((char)(~((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 13 | (char)(-((char)(var4[var5] ^ var5))) << 3) ^ var5) + 14443))))) << 5))) << 14));
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
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) - 16127))) - var5))) + var5) - 21715) << 10 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) - 16127))) - var5))) + var5) - 21715) >>> 6) - '\uf6c3') ^ '鸅') >>> 11 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) - 16127))) - var5))) + var5) - 21715) << 10 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) - 16127))) - var5))) + var5) - 21715) >>> 6) - '\uf6c3') ^ '鸅') << 5) - '믭') + 29323))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IliIlllilIi(List<liiIilliiiIill> grid) {
      if (grid == null) {
         return -1;
      } else {
         int var1 = -1;

         for(int var2 = 0; var2 < grid.size(); ++var2) {
            liiIilliiiIill var3 = (liiIilliiiIill)grid.get(var2);
            if (var3 != null && !var3.IliIlllilIi()) {
               if (iiilliilIIIiliil.IliIlllilIi(var3.liiiIIllIl()).contains(IilliliilIIi<invokedynamic>())) {
                  return var2;
               }

               if (var3.iIlIlllllill()) {
                  var1 = var2;
               }
            }
         }

         return var1;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)((char)(~var4[var5]) + '鲋'))))) ^ var5) - 13078) - '뢌'))) - var5))) - 'ꎡ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) << 4) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) << 4) + var5) >>> 8) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) << 4) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) >>> 2 | (char)((char)((char)((char)(var4[var5] + '솎') + 31168) ^ 10385) - 26322) << 14) + var5) + var5) << 4) + var5) >>> 8) << 7) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IIliIlillIliIlil() {
   }

   public static boolean liiiIIllIl(String title, List<liiIilliiiIill> grid) {
      if (iiilliilIIIiliil.IliIlllilIi(title).contains(IilliliilIIi<invokedynamic>())) {
         return true;
      } else {
         return IliIlllilIi(grid) >= 0;
      }
   }
}
