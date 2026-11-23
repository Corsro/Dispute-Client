package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIIlilIiiIIlilIi {
   public static lIliIIiliIliIIil liiiIIllIl(String mobId) {
      long var4 = 7832172997509658273L;
      String var1 = IliIlllilIi(mobId);
      if (var1 == null) {
         return lIliIIiliIliIIil.lliiilIIil;
      } else {
         var4 ^= (-4294967296L ^ var4) & -1L << 32;
         switch (var1.hashCode()) {
            case -1346697846:
               if (var1.equals(IilliliilIIi<invokedynamic>())) {
                  var4 ^= (12884901888L ^ var4) & -1L << 32;
               }
               break;
            case -1237731462:
               if (var1.equals(IilliliilIIi<invokedynamic>())) {
                  var4 ^= (4294967296L ^ var4) & -1L << 32;
               }
               break;
            case -1149900107:
               if (var1.equals(IilliliilIIi<invokedynamic>())) {
                  var4 ^= (17179869184L ^ var4) & -1L << 32;
               }
               break;
            case -796557998:
               if (var1.equals(IilliliilIIi<invokedynamic>())) {
                  var4 ^= (8589934592L ^ var4) & -1L << 32;
               }
               break;
            case -596960109:
               if (var1.equals(IilliliilIIi<invokedynamic>())) {
                  var4 ^= (0L ^ var4) & -1L << 32;
               }
         }

         lIliIIiliIliIIil var10000;
         switch ((int)(var4 >>> 32)) {
            case 0 -> var10000 = lIliIIiliIliIIil.liliilIIil;
            case 1 -> var10000 = lIliIIiliIliIIil.iiliilIIil;
            case 2 -> var10000 = lIliIIiliIliIIil.IIiiilIIil;
            case 3 -> var10000 = lIliIIiliIliIIil.lIiiilIIil;
            case 4 -> var10000 = lIliIIiliIliIIil.iIiiilIIil;
            default -> var10000 = lIliIIiliIliIIil.IliiilIIil;
         }

         return var10000;
      }
   }

   private lIIlilIiiIIlilIi() {
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '芎') ^ var5) - var5) ^ var5) + '돛') + var5))))) << 13 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '芎') ^ var5) - var5) ^ var5) + '돛') + var5))))) >>> 3) - var5) + var5) + 5303));
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
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) + var5) ^ 29604) - var5))) ^ 29772)) + var5) + var5))) - '륿') >>> 9 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) + var5) ^ 29604) - var5))) ^ 29772)) + var5) + var5))) - '륿') << 7) + 'ꪦ') ^ var5) ^ var5))) + 7316))));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - 'ꎌ') ^ '\ud8ea'))) + 31564) ^ 19623))) + 26084) + 889) - 7871) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - 'ꎌ') ^ '\ud8ea'))) + 31564) ^ 19623))) + 26084) + 889) - 7871) + var5) << 7) ^ var5) - var5) ^ 850) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - 'ꎌ') ^ '\ud8ea'))) + 31564) ^ 19623))) + 26084) + 889) - 7871) + var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - 'ꎌ') ^ '\ud8ea'))) + 31564) ^ 19623))) + 26084) + 889) - 7871) + var5) << 7) ^ var5) - var5) ^ 850) >>> 9))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String iIlIlllllill(String mobId) {
      long var7 = 4992106063888839032L;
      long var9 = 1540379064195717622L;
      String var1 = IliIlllilIi(mobId);
      if (var1 == null) {
         return IilliliilIIi<invokedynamic>();
      } else {
         String var2 = var1.substring(var1.indexOf(58) + 1);
         StringBuilder var3 = new StringBuilder(var2.length());
         var7 ^= (4294967296L ^ var7) & -1L << 32;

         for(var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < var2.length(); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            var9 ^= ((long)var2.charAt((int)var7) << 32 ^ var9) & -1L << 32;
            if ((int)(var9 >>> 32) != 95 && (int)(var9 >>> 32) != 47 && (int)(var9 >>> 32) != 46) {
               var3.append((char)((int)(var7 >>> 32) != 0 ? Character.toUpperCase((char)((int)(var9 >>> 32))) : (int)(var9 >>> 32)));
               var7 ^= (0L ^ var7) & -1L << 32;
            } else {
               var3.append(' ');
               var7 ^= (4294967296L ^ var7) & -1L << 32;
            }
         }

         return var3.toString();
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - '\ue5ae') ^ var5) - '\ue4f2') - var5))) ^ var5))) ^ var5))) - '플'))) + var5) << 2 | (char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - '\ue5ae') ^ var5) - '\ue4f2') - var5))) ^ var5))) ^ var5))) - '플'))) + var5) >>> 14)))) + var5))) - 24043));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4583807572521893288L ^ Long.rotateLeft(-6250879593826331016L, 49) ^ 6975054682232823848L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7773824401205232537L ^ Long.rotateLeft(4879897075857659860L, 13) ^ -3245872662232819900L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5996586080630524544L ^ Long.rotateLeft(-966124860554504341L, 48) ^ 6529551567632047996L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6366996168327882551L ^ Long.rotateLeft(3778868757183747275L, 24) ^ -6044243700300880368L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4750916968946199563L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5771632438519344245L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6657422248647585981L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1175898493972622647L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5287461571435748206L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3760885645079580071L;
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) + '\uf76f') - '퀩') << 9 | (char)((char)((char)(~((char)(var4[var5] + var5))) + '\uf76f') - '퀩') >>> 7) << 1 | (char)((char)((char)((char)(~((char)(var4[var5] + var5))) + '\uf76f') - '퀩') << 9 | (char)((char)((char)(~((char)(var4[var5] + var5))) + '\uf76f') - '퀩') >>> 7) >>> 15) - 11731))) + 29606) - var5) ^ 13681) + var5))) + var5) + var5) + '뢃'))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IliIlllilIi(String id) {
      if (id == null) {
         return null;
      } else {
         String var1 = id.trim().toLowerCase(Locale.ROOT);
         if (var1.isEmpty()) {
            return null;
         } else {
            return var1.indexOf(58) < 0 ? IilliliilIIi<invokedynamic>() + var1 : var1;
         }
      }
   }
}
