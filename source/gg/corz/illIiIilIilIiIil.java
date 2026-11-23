package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2248;
import net.minecraft.class_2487;
import net.minecraft.class_2680;
import net.minecraft.class_2689;
import net.minecraft.class_2769;
import net.minecraft.class_7923;

public final class illIiIilIilIiIil {
   private illIiIilIilIiIil() {
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ '蜽') + var5) + var5))) ^ var5) - 3375) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6992282250438684922L ^ Long.rotateLeft(-8181610146536427134L, 44) ^ 7296758070923202694L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8260518568047509454L ^ Long.rotateLeft(2296309519330217526L, 10) ^ -9191755631029687603L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2264002704775327281L ^ Long.rotateLeft(7597183432842151228L, 18) ^ 3667055393989941541L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1148716448195954443L ^ Long.rotateLeft(8902538159655834322L, 33) ^ -3134259413590895805L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -929707960797721907L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7133217925762454437L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8639062841226274447L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3088428998200982230L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7634170657986039686L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8162457262335797607L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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

   private static void iIlIlllllill(IIiiiIillIiiiIil prop, class_2248 b, String reason, String val, String sink) {
      prop.onFail(class_7923.field_41175.method_10221(b).toString(), reason, val, sink);
   }

   private static <T extends Comparable<T>> class_2680 IilliliilIIi(class_2680 state, class_2769<T> value, String prop) {
      Optional var3 = value.method_11900(prop);
      return (class_2680)var3.map((propx) -> (class_2680)state.method_11657(value, propx)).orElse((Object)null);
   }

   public static class_2680 IliIlllilIi(class_2248 onFail, class_2487 block, IIiiiIillIiiiIil properties) {
      class_2680 var3 = onFail.method_9564();
      if (block == null) {
         return var3;
      } else {
         class_2689 var4 = onFail.method_9595();

         for(String var6 : block.method_10541()) {
            String var7 = (String)block.method_10558(var6).orElse("");
            class_2769 var8 = var4.method_11663(var6);
            if (var8 == null) {
               if (properties != null) {
                  iIlIlllllill(properties, onFail, var6, var7, iliIiiliiiii<invokedynamic>());
               }
            } else {
               class_2680 var9 = IilliliilIIi(var3, var8, var7);
               if (var9 == null) {
                  if (properties != null) {
                     iIlIlllllill(properties, onFail, var6, var7, iliIiiliiiii<invokedynamic>());
                  }
               } else {
                  var3 = var9;
               }
            }
         }

         return var3;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7286) + var5) + var5) + var5) + var5) - '\ue51e') + '펶') << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 7286) + var5) + var5) + var5) + var5) - '\ue51e') + '펶') >>> 11) + var5))) + 5975) ^ 12112) - '즅') + 30094) - var5)))) - '詋'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) >>> 12 | (char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) << 4) - var5) + var5) - var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) >>> 12 | (char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) << 4) - var5) + var5) - var5) + var5) >>> 6) - 15434) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) >>> 12 | (char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) << 4) - var5) + var5) - var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) >>> 12 | (char)((char)(~((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + 10125) ^ '췕'))))) ^ 3950) - var5))) - var5) << 4) - var5) + var5) - var5) + var5) >>> 6) - 15434) + var5) << 6) - var5) + 'ꯃ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2680 liiiIIllIl(class_2248 block, String onFail, IIiiiIillIiiiIil key) {
      long var16 = 8668777383483934593L;
      long var18 = 2350319091653648981L;
      long var20 = 1593581513413497947L;
      class_2680 var3 = block.method_9564();
      var16 ^= ((long)onFail.indexOf(91) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)onFail.lastIndexOf(93) ^ var16) & -1L >>> 32;
      if ((int)(var16 >>> 32) >= 0 && (int)var16 > (int)(var16 >>> 32)) {
         class_2689 var6 = block.method_9595();
         String[] var7 = onFail.substring((int)(var16 >>> 32) + 1, (int)var16).split(iliIiiliiiii<invokedynamic>());
         var18 ^= ((long)var7.length << 32 ^ var18) & -1L << 32;

         for(long var25 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var25 < (int)(var25 >>> 32); var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
            String var10 = var7[(int)var25];
            var20 ^= ((long)var10.indexOf(61) << 32 ^ var20) & -1L << 32;
            if ((int)(var20 >>> 32) >= 0) {
               String var12 = var10.substring(0, (int)(var20 >>> 32)).trim();
               String var13 = var10.substring((int)(var20 >>> 32) + 1).trim();
               class_2769 var14 = var6.method_11663(var12);
               if (var14 == null) {
                  if (key != null) {
                     iIlIlllllill(key, block, var12, var13, iliIiiliiiii<invokedynamic>());
                  }
               } else {
                  class_2680 var15 = IilliliilIIi(var3, var14, var13);
                  if (var15 == null) {
                     if (key != null) {
                        iIlIlllllill(key, block, var12, var13, iliIiiliiiii<invokedynamic>());
                     }
                  } else {
                     var3 = var15;
                  }
               }
            }
         }

         return var3;
      } else {
         return var3;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) << 4))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) << 4))) << 9) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) << 4))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) << 13 | (char)((char)((char)(var4[var5] + var5) ^ var5) - var5) >>> 3) + '\ua7ec') << 3) << 4))) << 9) << 1));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) >>> 10) - 3964) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) >>> 10) - 3964) ^ var5) >>> 13) - 11756) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) >>> 10) - 3964) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) >>> 10 | (char)((char)(var4[var5] - var5) >>> 1 | (char)(var4[var5] - var5) << 15) << 6) >>> 10) - 3964) ^ var5) >>> 13) - 11756) << 15) - '︌'))) ^ 30239));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
