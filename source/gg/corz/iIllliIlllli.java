package gg.corz;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2960;

final class iIllliIlllli {
   private static final Map<iiIiliiIIlilii, IiIilllliIilll> iliIIIlIlIiiIIIlIl = new EnumMap(iiIiliiIIlilii.class);
   static final class_2960 lIiIIIlIliIiIIIlIl = class_2960.method_60655(Iiilliiliiil<invokedynamic>(), Iiilliiliiil<invokedynamic>());
   private static final ExecutorService IliIIIlIllliIIIlIl = Executors.newSingleThreadExecutor((r) -> {
      Thread var1 = new Thread(r, Iiilliiliiil<invokedynamic>());
      var1.setDaemon(true);
      var1.setPriority(4);
      return var1;
   });

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) << 8) + '\ude8e') ^ '쯋') >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) << 8) + '\ude8e') ^ '쯋') << 6) + 'ꇜ') - '爛') ^ 12950) + var5) ^ '봂') + 6926) + var5) + '謕'))) >>> 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) << 8) + '\ude8e') ^ '쯋') >>> 10 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] + '薊') - var5) >>> 1 | (char)((char)(var4[var5] + '薊') - var5) << 15))) << 8) + '\ude8e') ^ '쯋') << 6) + 'ꇜ') - '爛') ^ 12950) + var5) ^ '봂') + 6926) + var5) + '謕'))) << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static liIlIiliiIlIil lIiiIiIlilli() {
      return iliIiiliiiii(iiIiliiIIlilii.lIIllliIIl);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 13835) >>> 1 | (char)(var4[var5] + 13835) << 15) ^ var5) + var5) ^ var5) - var5))) ^ '힘')))) + var5))) - 21928) ^ '贖') >>> 14 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 13835) >>> 1 | (char)(var4[var5] + 13835) << 15) ^ var5) + var5) ^ var5) - var5))) ^ '힘')))) + var5))) - 21928) ^ '贖') << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) >>> 11) << 3 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) >>> 11) >>> 13) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) >>> 11) << 3 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5))) + var5) << 10) ^ 30732) - '횠') + var5) >>> 11) >>> 13) << 12) ^ 13010));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) << 12 | (char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) >>> 4) + 18881) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) << 12 | (char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) >>> 4) + 18881) << 11) - '骟') - 28400) + '슥') - var5) + '셨') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) << 12 | (char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) >>> 4) + 18881) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) << 12 | (char)((char)((char)(var4[var5] ^ '鵂') - var5) ^ var5) >>> 4) + 18881) << 11) - '骟') - 28400) + '슥') - var5) + '셨') >>> 8) + 26240) - 623));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static void iIlIlllllill(iiIiliiIIlilii knife) {
      IillIlilillIli.liiiIIllIl();
      if (knife != null) {
         iiIiliiIIlilii var1 = IillIlilillIli.IIIilIIiiIIi(knife);
         if (var1 != null && IillIlilillIli.iIlIlllllill()) {
            iIlIlllllill(var1);
         }

         IiIilllliIilll var2 = IliIlllilIi(knife);
         if (var2.lliiIlIIiiliiIlIIi == null && var2.IiiiIlIIiliiiIlIIi == null && var2.iiiiIlIIiIIIIllIIi == null) {
            try {
               var2.lliiIlIIiiliiIlIIi = CompletableFuture.supplyAsync(() -> {
                  try {
                     return IilliliilIIi(knife);
                  } catch (RuntimeException | IOException var2) {
                     throw new CompletionException(var2);
                  }
               }, IliIIIlIllliIIIlIl);
            } catch (RuntimeException var4) {
               var2.iiiiIlIIiIIIIllIIi = var4.toString();
            }

         }
      }
   }

   static liIlIiliiIlIil iliIiiliiiii(iiIiliiIIlilii knife) {
      if (knife == null) {
         return null;
      } else {
         IiIilllliIilll var1 = (IiIilllliIilll)iliIIIlIlIiiIIIlIl.get(knife);
         if (var1 == null) {
            return null;
         } else {
            if (var1.lliiIlIIiiliiIlIIi != null && var1.lliiIlIIiiliiIlIIi.isDone()) {
               try {
                  var1.IiiiIlIIiliiiIlIIi = (liIlIiliiIlIil)var1.lliiIlIIiiliiIlIIi.join();
               } catch (CancellationException | CompletionException var4) {
                  Throwable var3 = ((RuntimeException)var4).getCause();
                  var1.iiiiIlIIiIIIIllIIi = var3 == null ? ((RuntimeException)var4).toString() : var3.toString();
                  System.err.println(Iiilliiliiil<invokedynamic>() + knife.lililliIIl + Iiilliiliiil<invokedynamic>() + var1.iiiiIlIIiIIIIllIIi);
               }

               var1.lliiIlIIiiliiIlIIi = null;
            }

            return var1.IiiiIlIIiliiiIlIIi;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) << 13) - 28972) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) << 13) - 28972) >>> 14))) >>> 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) << 13) - 28972) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') << 9 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 6325) - 21019) - var5) ^ '뻢') >>> 7) ^ 'ꙗ') - var5) - var5) << 13) - 28972) >>> 14))) << 6) - var5) + '\uf2f1'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6949476982508423742L ^ Long.rotateLeft(-3474629089068170027L, 32) ^ -7704339519065292430L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2935781349636761073L ^ Long.rotateLeft(-196959025550057144L, 16) ^ 1366697453506496788L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8020703763371318537L ^ Long.rotateLeft(-8596823614577771526L, 16) ^ -1882263341570806001L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8359442413609496982L ^ Long.rotateLeft(3502780991844818205L, 61) ^ 568169038277340402L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3569716064712959335L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3451384537579144639L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1151532327563341913L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8560296614086887251L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7384752149912309745L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2147830597757222791L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   static String IiIlliIliiIl() {
      return IIlllIlliIll(iiIiliiIIlilii.lIIllliIIl);
   }

   static boolean IlIlllIlilIl(iiIiliiIIlilii knife) {
      iliIiiliiiii(knife);
      IiIilllliIilll var1 = knife == null ? null : (IiIilllliIilll)iliIIIlIlIiiIIIlIl.get(knife);
      return var1 != null && var1.iiiiIlIIiIIIIllIIi != null;
   }

   private iIllliIlllli() {
   }

   static String IIlllIlliIll(iiIiliiIIlilii knife) {
      if (iliIiiliiiii(knife) != null) {
         return Iiilliiliiil<invokedynamic>();
      } else {
         IiIilllliIilll var1 = knife == null ? null : (IiIilllliIilll)iliIIIlIlIiiIIIlIl.get(knife);
         if (var1 == null) {
            return Iiilliiliiil<invokedynamic>();
         } else {
            return var1.iiiiIlIIiIIIIllIIi != null ? var1.iiiiIlIIiIIIIllIIi : (var1.lliiIlIIiiliiIlIIi != null ? Iiilliiliiil<invokedynamic>() : Iiilliiliiil<invokedynamic>());
         }
      }
   }

   static boolean IIIllIIliIIl() {
      return IlIlllIlilIl(iiIiliiIIlilii.lIIllliIIl);
   }

   private static IiIilllliIilll IliIlllilIi(iiIiliiIIlilii knife) {
      return (IiIilllliIilll)iliIIIlIlIiiIIIlIl.computeIfAbsent(knife, (k) -> new IiIilllliIilll());
   }

   static void Illlllllilll() {
      iliIIIlIlIiiIIIlIl.clear();
   }

   static void liiiIIllIl() {
      iIlIlllllill(iiIiliiIIlilii.lIIllliIIl);
   }

   static liIlIiliiIlIil IilliliilIIi(iiIiliiIIlilii knife) {
      if (knife.IliIlllilIi()) {
         return new liIlIiliiIlIil(knife, lIIiilIliIIiilIl.liiiIIllIl(), lIiIIIlIliIiIIIlIl, (class_2960)null);
      } else {
         IlIillllllIillll var1 = lIIiilIliIIiilIl.IilliliilIIi(knife);
         lIIiilIliIIiilIl var2 = lIIiilIliIIiilIl.iIlIlllllill(knife);
         if (!lIIiilIliIIiilIl.lIiiIiIlilli(var1.iIlIlllllill())) {
            throw new IOException(Iiilliiliiil<invokedynamic>() + var1.iIlIlllllill());
         } else {
            class_2960 var3 = class_2960.method_60655(Iiilliiliiil<invokedynamic>(), var1.iIlIlllllill());
            class_2960 var4 = null;
            if (knife.IilliliilIIi()) {
               String var5 = var1.iIlIlllllill().substring(0, var1.iIlIlllllill().length() - 4) + Iiilliiliiil<invokedynamic>();
               if (lIIiilIliIIiilIl.lIiiIiIlilli(var5)) {
                  var4 = class_2960.method_60655(Iiilliiliiil<invokedynamic>(), var5);
               }
            }

            return new liIlIiliiIlIil(knife, var2, var3, var4);
         }
      }
   }
}
