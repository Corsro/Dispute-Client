package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public final class lIIlIIliiIIlIIli {
   private static final Map<String, class_2960> liIIllIlIi = new HashMap();

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '뜥') ^ '팯') ^ var5) ^ 26028) - var5) - var5))) ^ var5)))) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) << 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) >>> 12) ^ 30995) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) << 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) >>> 12) ^ 30995) << 15) ^ var5))))) >>> 13 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) << 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) >>> 12) ^ 30995) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) << 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3) ^ '츍') - 8761) + var5) >>> 12) ^ 30995) << 15) ^ var5))))) << 3) ^ var5) - 10685));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 14 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 2) + '\ue17a'))) ^ 23266))) ^ var5) - 20190) + var5))) + var5))))) - var5) ^ 1092) >>> 8 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) << 14 | (char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 2) + '\ue17a'))) ^ 23266))) ^ var5) - 20190) + var5))) + var5))))) - var5) ^ 1092) << 8) ^ 226));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) << 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) >>> 6) + var5) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) << 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) >>> 6) + var5) << 3) << 7 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) << 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) >>> 6) + var5) >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) << 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ 16424) << 7 | (char)(var4[var5] ^ 16424) >>> 9) + var5) << 3) - var5) ^ '驘') - '츓') >>> 8))) - 32508) >>> 6) + var5) << 3) >>> 9) ^ '\ude35') - var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) << 10) + '\ue027') << 9 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) << 10) + '\ue027') >>> 7) << 5 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) << 10) + '\ue027') << 9 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ 2828) - 21236) + var5) + var5) - var5) >>> 13)) << 3) + var5))))) ^ 20897) << 10) + '\ue027') >>> 7) >>> 11) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2960 IliIlllilIi(llllIlilllIl m, liIlilIiiiIlilIi c) {
      long var7 = -6570413227973511382L;
      class_2960 var2 = (class_2960)liIIllIlIi.get(m.IliIlllilIi());
      if (var2 != null) {
         return var2;
      } else {
         var2 = class_2960.method_60655(iIlIlllllill<invokedynamic>(), iIlIlllllill<invokedynamic>() + m.IliIlllilIi());
         class_1011 var3 = new class_1011(c.iIIilllIIi, c.IlIilllIIi, false);
         int[] var4 = c.llIilllIIi;

         for(var7 ^= (0L ^ var7) & -1L << 32; (int)(var7 >>> 32) < c.IlIilllIIi; var7 += 4294967296L) {
            for(var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < c.iIIilllIIi; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
               var3.method_61941((int)var7, (int)(var7 >>> 32), var4[(int)(var7 >>> 32) * c.iIIilllIIi + (int)var7]);
            }
         }

         String var5 = iIlIlllllill<invokedynamic>() + m.IliIlllilIi();
         class_310.method_1551().method_1531().method_4616(var2, new class_1043(() -> var5, var3));
         liIIllIlIi.put(m.IliIlllilIi(), var2);
         return var2;
      }
   }

   private lIIlIIliiIIlIIli() {
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7395736062931625509L ^ Long.rotateLeft(-5916691019225194056L, 28) ^ 3822673722473363396L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7191150848584642570L ^ Long.rotateLeft(4641237460233054222L, 51) ^ 2970310810593049729L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8409451983318251089L ^ Long.rotateLeft(-2402368506690473241L, 33) ^ -6736952411693325952L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6858700892717925977L ^ Long.rotateLeft(3155503671491885243L, 38) ^ -3792972173225959711L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3114318591540521355L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5871722397514695146L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2107524988093849440L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2321755735877133921L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6904380382930622580L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4078827542021758197L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
