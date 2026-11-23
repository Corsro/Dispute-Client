package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1923;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2818;
import net.minecraft.class_3965;

public final class lIIiilliIIiill {
   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6120159370872714994L ^ Long.rotateLeft(7709467501513410049L, 4) ^ -577095868055601212L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4926270392803097894L ^ Long.rotateLeft(6635352895573822888L, 30) ^ 8447750233042286312L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8966613937526392632L ^ Long.rotateLeft(-3423077387734448350L, 45) ^ 3933107925296591396L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 136997843276944832L ^ Long.rotateLeft(-4270908106154113001L, 22) ^ 7107050161398238882L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6226138721175860589L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6105186766667622656L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8105551157070654556L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7787548816932034878L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6981548839886524168L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7003372229843475810L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illlllllilll<invokedynamic>());
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
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) << 2) << 5 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) << 2) >>> 11))))) >>> 6 | (char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) << 2) << 5 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) << 6 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) >>> 13 | (char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 19222) >>> 14 | (char)((char)((char)(~var4[var5]) - var5) - 19222) << 2))) << 3) >>> 10) << 2) >>> 11))))) << 10))) + '믘') ^ var5) ^ '麏'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl(class_2338 blockPos, class_2248 block) {
      return ilIllIiIll.Iiiilllliiilll.field_1687.method_8320(blockPos).method_26204() == block;
   }

   public static Stream<class_2818> IliIlllilIi() {
      long var5 = -6106967475684626495L;
      var5 ^= ((long)(Math.max(2, ilIllIiIll.Iiiilllliiilll.field_1690.method_38521()) + 3) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)((int)(var5 >>> 32) * 2 + 1) ^ var5) & -1L >>> 32;
      class_1923 var2 = ilIllIiIll.Iiiilllliiilll.field_1724.method_31476();
      class_1923 var3 = new class_1923(var2.field_9181 - (int)(var5 >>> 32), var2.field_9180 - (int)(var5 >>> 32));
      class_1923 var4 = new class_1923(var2.field_9181 + (int)(var5 >>> 32), var2.field_9180 + (int)(var5 >>> 32));
      return Stream.iterate(var3, (min) -> {
         long var5 = 8126072550332854622L;
         var5 ^= ((long)min.field_9181 << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)min.field_9180 ^ var5) & -1L >>> 32;
         var5 += 4294967296L;
         if ((int)(var5 >>> 32) > var4.field_9181) {
            var5 ^= ((long)var3.field_9181 << 32 ^ var5) & -1L << 32;
            var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32;
         }

         if ((int)var5 > var4.field_9180) {
            throw new IllegalStateException(IIIllIIliIIl<invokedynamic>());
         } else {
            return new class_1923((int)(var5 >>> 32), (int)var5);
         }
      }).limit((long)((int)var5) * (long)((int)var5)).filter((c) -> ilIllIiIll.Iiiilllliiilll.field_1687.method_8393(c.field_9181, c.field_9180)).map((c) -> ilIllIiIll.Iiiilllliiilll.field_1687.method_8497(c.field_9181, c.field_9180)).filter(Objects::nonNull);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) ^ '뾔') << 13 | (char)((char)(var4[var5] + var5) ^ '뾔') >>> 3))) >>> 5 | (char)(-((char)((char)((char)(var4[var5] + var5) ^ '뾔') << 13 | (char)((char)(var4[var5] + var5) ^ '뾔') >>> 3))) << 11) >>> 4 | (char)((char)(-((char)((char)((char)(var4[var5] + var5) ^ '뾔') << 13 | (char)((char)(var4[var5] + var5) ^ '뾔') >>> 3))) >>> 5 | (char)(-((char)((char)((char)(var4[var5] + var5) ^ '뾔') << 13 | (char)((char)(var4[var5] + var5) ^ '뾔') >>> 3))) << 11) << 12) - var5) - '葱')))) + var5) ^ var5) ^ 'ꠙ'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) + '\udb15'))))) ^ var5) >>> 5 | (char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) + '\udb15'))))) ^ var5) << 11) >>> 8 | (char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) + '\udb15'))))) ^ var5) >>> 5 | (char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) + '\udb15'))))) ^ var5) << 11) << 8) - var5) - var5) - '\ue993'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void iIlIlllllill(class_3965 blockHitResult, boolean shouldSwingHand) {
      class_1269 var2 = ilIllIiIll.Iiiilllliiilll.field_1761.method_2896(ilIllIiIll.Iiiilllliiilll.field_1724, class_1268.field_5808, blockHitResult);
      if (var2 instanceof class_1269.class_9860 && shouldSwingHand) {
         ilIllIiIll.Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }

   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] - 16905))))) << 3 | (char)(-((char)(-((char)(var4[var5] - 16905))))) >>> 13) << 4 | (char)((char)(-((char)(-((char)(var4[var5] - 16905))))) << 3 | (char)(-((char)(-((char)(var4[var5] - 16905))))) >>> 13) >>> 12) ^ '\ue515') + var5) ^ var5) + 6679) + var5) - var5) + 31470) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] - 16905))))) << 3 | (char)(-((char)(-((char)(var4[var5] - 16905))))) >>> 13) << 4 | (char)((char)(-((char)(-((char)(var4[var5] - 16905))))) << 3 | (char)(-((char)(-((char)(var4[var5] - 16905))))) >>> 13) >>> 12) ^ '\ue515') + var5) ^ var5) + 6679) + var5) - var5) + 31470) >>> 1))) - 3462) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) << 5) + '핢') - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) << 5) + '핢') - var5) << 3))))))) ^ var5) + 14957) - 6719) >>> 9 | (char)((char)((char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) << 5) + '핢') - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + 25030) + '헬') - var5))) - 14738) ^ var5) << 5) + '핢') - var5) << 3))))))) ^ var5) + 14957) - 6719) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
