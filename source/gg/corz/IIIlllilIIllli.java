package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum IIIlllilIIllli {
   iillilIIIl,
   IIililIIIl,
   lIililIIIl;

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[25];
      int var9 = System.identityHashCode(var13) ^ 1998592810;
      int var10;
      int var11 = (var10 = System.identityHashCode(var13) ^ 1011377947) ^ 1158467764;
      int var12 = System.identityHashCode(var13) + -1473622543;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) << 5 | (char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) >>> 11) + '鿧') << 11 | (char)((char)((char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) << 5 | (char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) >>> 11) + '鿧') >>> 5) + '맂') << 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) << 5 | (char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) >>> 11) + '鿧') << 11 | (char)((char)((char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) << 5 | (char)((char)((char)(~var4[var5]) ^ 27370) ^ var5) >>> 11) + '鿧') >>> 5) + '맂') >>> 1) + var5) - var5))) ^ '퍵'));
         ++var5;
         if ((var11 ^ var10 ^ 1158467764 ^ 1) == 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[9];
      int var9 = System.identityHashCode(var13) ^ -1506540555;
      int var10;
      int var11 = (var10 = System.identityHashCode(var13) ^ 357504702) ^ 2137690463;
      int var12 = System.identityHashCode(var13) + -1844197734;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) >>> 8) - '衊') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) >>> 8) - '衊') << 4) + '쵌') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) >>> 8) - '衊') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) << 12 | (char)((char)((char)(var4[var5] + var5) ^ 17003) + 21018) >>> 4) + var5) - 900))) ^ var5) ^ 281) + var5) >>> 13) >>> 8) - '衊') << 4) + '쵌') << 8) - '눃'))));
         ++var5;
         if ((var11 ^ var10 ^ 2137690463 ^ 1) == 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[14];
      int var9 = System.identityHashCode(var13) ^ 1442323465;
      int var11 = (System.identityHashCode(var13) ^ -1238382277) + 1512503586;
      int var12 = System.identityHashCode(var13) + -1692422379;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ '躳') >>> 6 | (char)(var4[var5] ^ '躳') << 10) ^ 3673) << 9 | (char)((char)((char)(var4[var5] ^ '躳') >>> 6 | (char)(var4[var5] ^ '躳') << 10) ^ 3673) >>> 7)) ^ 13241))) ^ var5))) ^ '\udea3') - var5))) - var5) ^ var5) + var5));
         ++var5;
         if ((var13.length ^ 14 ^ 1) == 0) {
            Iilllilliill = ~Iilllilliill;
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2714279140894923692L ^ Long.rotateLeft(3477062483619902525L, 41) ^ -4255569326720808825L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2723893265500234462L ^ Long.rotateLeft(109359347755481832L, 3) ^ 2477057585861192928L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3009229878920002503L ^ Long.rotateLeft(6431649093992529245L, 47) ^ -2603967132942985839L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -112875312384304621L ^ Long.rotateLeft(-6693952477634664006L, 57) ^ 7404989662183444322L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1180977576383103868L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2713540257978318212L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8554810714282805690L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -110157725767453624L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3570595011568624867L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5296190311217517587L;
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

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[20];
      int var9 = System.identityHashCode(var13) + 789295767;
      int var11 = System.identityHashCode(var13) ^ -1222401925 ^ -1678792198;
      int var12 = System.identityHashCode(var13) + 1953476032;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)(-((char)(var4[var5] - 520))) << 15 | (char)(-((char)(var4[var5] - 520))) >>> 1) << 8 | (char)((char)(-((char)(var4[var5] - 520))) << 15 | (char)(-((char)(var4[var5] - 520))) >>> 1) >>> 8))) + var5))))) ^ var5) + var5) << 12 | (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)(-((char)(var4[var5] - 520))) << 15 | (char)(-((char)(var4[var5] - 520))) >>> 1) << 8 | (char)((char)(-((char)(var4[var5] - 520))) << 15 | (char)(-((char)(var4[var5] - 520))) >>> 1) >>> 8))) + var5))))) ^ var5) + var5) >>> 4) + '\uf773'));
         ++var5;
         if (var12 - var12 != 0) {
            throw new VerifyError("Inconsistent flow at 44427");
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      int[] var13 = new int[14];
      int var9 = System.identityHashCode(var13) ^ 1736978510;
      int var11 = (System.identityHashCode(var13) ^ 1729558854) + -1749820942;
      int var12 = System.identityHashCode(var13) + 805243968;
      char[] var4 = var3.toCharArray();
      int var5 = 0;

      while(var5 < var4.length) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + 359) + 20443) - 7834))) ^ var5) ^ var5) + 22825))) + '\ue2f5') + 8072) ^ var5) ^ var5) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) ^ var5))) + 359) + 20443) - 7834))) ^ var5) ^ var5) + 22825))) + '\ue2f5') + 8072) ^ var5) ^ var5) << 13))) ^ var5))));
         ++var5;
         if ((var12 ^ var12 ^ 1) == 0) {
            throw null;
         }
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static Object IilliliilIIi(MutableCallSite var0, MethodHandles.Lookup var1, MethodType var2, String var3, int var4, Object[] var5) {
      int var6 = (Integer)var5[var5.length - 1];
      String[] var7 = lIiiIiIlilli(var3, var4 ^ var6, 32).split("\n");
      int var8 = Integer.parseInt(var7[0]);
      Class var10 = var1.lookupClass();
      ClassLoader var11 = Thread.currentThread().getContextClassLoader();
      if (var11 == null) {
         var11 = var10.getClassLoader();
      }

      Class var9 = Class.forName(var7[1], false, var11);
      int var16 = var6 ^ System.identityHashCode(var0) ^ System.identityHashCode(var5);
      MethodHandle var12;
      if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1491766855) != (Integer.rotateLeft(1846633084 ^ var16, var16 & 31) ^ 1491766855)) {
         if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -1696945390) != (Integer.rotateLeft(-1091193287 ^ var16, var16 & 31) ^ -1696945390)) {
            if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -541475883) != (Integer.rotateLeft(1022229859 ^ var16, var16 & 31) ^ -541475883)) {
               if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ -74590230) != (Integer.rotateLeft(-336972126 ^ var16, var16 & 31) ^ -74590230)) {
                  if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 462598683) != (Integer.rotateLeft(1939882865 ^ var16, var16 & 31) ^ 462598683)) {
                     if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 580796887) != (Integer.rotateLeft(-677635235 ^ var16, var16 & 31) ^ 580796887)) {
                        if ((Integer.rotateLeft(var8 ^ var16, var16 & 31) ^ 1750378787) != (Integer.rotateLeft(-1565566847 ^ var16, var16 & 31) ^ 1750378787)) {
                           throw new BootstrapMethodError();
                        }

                        var12 = var1.findStatic(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
                     } else {
                        var12 = var1.findSpecial(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11), var10);
                     }
                  } else {
                     var12 = var1.findSetter(var9, var7[2], liiiIIllIl(var7[3], var11));
                  }
               } else {
                  var12 = var1.findStaticGetter(var9, var7[2], liiiIIllIl(var7[3], var11));
               }
            } else {
               var12 = var1.findGetter(var9, var7[2], liiiIIllIl(var7[3], var11));
            }
         } else {
            var12 = var1.findVirtual(var9, var7[2], MethodType.fromMethodDescriptorString(var7[3], var11));
         }
      } else {
         var12 = var1.findStaticSetter(var9, var7[2], liiiIIllIl(var7[3], var11));
      }

      MethodType var13 = var2.dropParameterTypes(var2.parameterCount() - 1, var2.parameterCount());
      var12 = var12.asFixedArity().asType(var13);
      MethodHandle var14 = MethodHandles.dropArguments(var12, var13.parameterCount(), new Class[]{Integer.TYPE});
      var0.setTarget(var14);
      MutableCallSite.syncAll(new MutableCallSite[]{var0});
      Object[] var15 = Arrays.copyOf(var5, var5.length - 1);
      return var12.invokeWithArguments(var15);
   }

   // $FF: synthetic method
   private static IIIlllilIIllli[] IliIlllilIi() {
      return new IIIlllilIIllli[]{iillilIIIl, IIililIIIl, lIililIIIl};
   }

   public static Class liiiIIllIl(String var0, ClassLoader var1) {
      if (var0 != null && !var0.isEmpty()) {
         return MethodType.fromMethodDescriptorString("()".concat(var0), var1).returnType();
      } else {
         throw new IllegalArgumentException("Input string cannot be null or empty");
      }
   }

   public static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
         throw new BootstrapMethodError();
      } else {
         MutableCallSite var4 = new MutableCallSite(var2);
         String var5 = "IilliliilIIi";
         Object[] var6 = new Object[]{var4, var0, var2, var3, var1.hashCode()};
         MethodHandle var7 = MethodHandles.insertArguments(var5, 0, var6).asCollector(Object[].class, var2.parameterCount()).asType(var2);
         if ((var1.hashCode() ^ System.identityHashCode(var0)) != (var1.hashCode() ^ System.identityHashCode(var0))) {
            throw new BootstrapMethodError();
         } else {
            var4.setTarget(var7);
            return var4;
         }
      }
   }

   private static String lIiiIiIlilli(String var0, int var1, int var2) {
      byte[] var3 = Base64.getDecoder().decode(var0);

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var3[var5] = (byte)(var3[var5] + var1 + var5 ^ var2);
      }

      return new String(var3, StandardCharsets.UTF_8);
   }
}
