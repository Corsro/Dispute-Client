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

public record Illlllllllllllll(boolean strategyAllowed, boolean tempMaterial, boolean tempCapBlocked) {
   private final boolean IiIlIiIill;
   private final boolean liIlIiIill;
   private final boolean iiIlIiIill;

   public boolean lIiiIiIlilli() {
      return this.iiIlIiIill;
   }

   public boolean IilliliilIIi() {
      return this.liIlIiIill;
   }

   public Illlllllllllllll(boolean strategyAllowed, boolean tempCapBlocked, boolean tempMaterial) {
      this.IiIlIiIill = strategyAllowed;
      this.liIlIiIill = tempCapBlocked;
      this.iiIlIiIill = tempMaterial;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) >>> 12) + '軗') + '쪓') - '連') + '讒') ^ var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) >>> 12) + '軗') + '쪓') - '連') + '讒') ^ var5) >>> 3) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) >>> 12) + '軗') + '쪓') - '連') + '讒') ^ var5) << 13 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] ^ '콴') ^ var5) + var5))) >>> 12) + '軗') + '쪓') - '連') + '讒') ^ var5) >>> 3) ^ var5) << 9) + 20114));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) << 11 | (char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) >>> 5) << 8 | (char)((char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) << 11 | (char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) >>> 5) >>> 8) - var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) << 11 | (char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) >>> 5) << 8 | (char)((char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) << 11 | (char)(-((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) << 7 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - 3762) + 21122) - var5)) << 13))))) >>> 12) >>> 9))))) >>> 5) >>> 8) - var5) >>> 14) ^ var5) + var5) - var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) << 4)) ^ 11364))) << 2 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) << 4)) ^ 11364))) >>> 14) - var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) << 4)) ^ 11364))) << 2 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ 148) + '슂') - '靴') - 21318) - 5678))) << 12) << 4)) ^ 11364))) >>> 14) - var5) << 2) ^ '쩻'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) >>> 13) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) >>> 13) >>> 2) - var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) >>> 13) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) >>> 1 | (char)((char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) << 3 | (char)((char)(var4[var5] ^ '븳') << 12 | (char)(var4[var5] ^ '븳') >>> 4) >>> 13) << 15) ^ var5) >>> 13) >>> 2) - var5) << 10) - var5) + '聧') ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6) - 27382) ^ '騩'))))) ^ var5))))) - var5) >>> 9 | (char)((char)(-((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) << 10 | (char)(var4[var5] + var5) >>> 6) - 27382) ^ '騩'))))) ^ var5))))) - var5) << 7) ^ 3276));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this.IiIlIiIill && this.liIlIiIill && !this.iiIlIiIill;
   }

   public String liiiIIllIl() {
      return iliIiiliiiii<invokedynamic>() + this.IiIlIiIill + iliIiiliiiii<invokedynamic>() + this.liIlIiIill + iliIiiliiiii<invokedynamic>() + this.iiIlIiIill;
   }

   public boolean iIlIlllllill() {
      return this.IiIlIiIill;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8497238494954347040L ^ Long.rotateLeft(2175063619554731217L, 5) ^ 6224744283631328330L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2023626824529555140L ^ Long.rotateLeft(-7824919639723424026L, 46) ^ -356460912241340575L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7766882566453520648L ^ Long.rotateLeft(-8505448877048419142L, 23) ^ -2497661418445857427L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6762136322864094794L ^ Long.rotateLeft(5657915533789989708L, 5) ^ 6824035402519106881L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5676988770708102965L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8226631605928732536L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7195612596030501550L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3677373119481612594L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4831355273114392662L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6973524926117310041L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlllIlliIll<invokedynamic>());
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
}
