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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iIIllIliIlIllIli {
   private int liIiIIllIi;
   private int iIIiIIllIi;
   private int iiIiIIllIi;
   private int ilIiIIllIi;
   public static final int IIliIIllIi = 4096;
   private final HashMap<Long, Boolean> lIIiIIllIi = new HashMap();
   private int IiIiIIllIi;
   private int IlIiIIllIi;
   private int llIiIIllIi;

   public static long IliIlllilIi(long cell, long feet, long localFingerprint) {
      long var6 = cell * -7046029254386353131L ^ feet;
      return (var6 ^ localFingerprint) * 1099511628211L;
   }

   public void Iiilliiliiil() {
      this.lIIiIIllIi.clear();
   }

   public int IlIlllIlilIl() {
      return this.IlIiIIllIi;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) << 4 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) >>> 12) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) << 4 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) >>> 12) - var5) >>> 5) ^ var5) + var5) ^ var5) - var5) - 'ꂂ'))))) >>> 7 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) << 4 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) >>> 12) - var5) << 11 | (char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) << 4 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ 22532) >>> 12) - var5) >>> 5) ^ var5) + var5) ^ var5) - var5) - 'ꂂ'))))) << 9) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lIiiIiIlilli() {
      ++this.IiIiIIllIi;
   }

   public int Iilllilliill() {
      return this.liIiIIllIi;
   }

   public void iliIiiliiiii() {
      ++this.liIiIIllIi;
   }

   public int IiIlliIliiIl() {
      return this.llIiIIllIi;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) >>> 12 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) << 4) - var5) << 2 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) >>> 12 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) << 4) - var5) >>> 14) - '鼻') << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) >>> 12 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) << 4) - var5) << 2 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) >>> 12 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) << 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) << 11 | (char)(~((char)((char)(var4[var5] + 'ꅊ') >>> 13 | (char)(var4[var5] + 'ꅊ') << 3))) >>> 5) - 23210) ^ 26566) + 23829))) >>> 5))) + var5) << 4) - var5) >>> 14) - '鼻') >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 7347) - '욤') - 'ꁁ') ^ 9231))) >>> 3 | (char)(-((char)((char)((char)((char)(var4[var5] - 7347) - '욤') - 'ꁁ') ^ 9231))) << 13) + var5) << 15 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 7347) - '욤') - 'ꁁ') ^ 9231))) >>> 3 | (char)(-((char)((char)((char)((char)(var4[var5] - 7347) - '욤') - 'ꁁ') ^ 9231))) << 13) + var5) >>> 1) + 14539) + var5) ^ 5190));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.IiIiIIllIi;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ var5) - var5))))) >>> 15 | (char)(~((char)(~((char)((char)(var4[var5] ^ var5) - var5))))) << 1) - var5) ^ var5) ^ var5) - '\ud89d') - '辕') ^ 25120))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl() {
      return this.iIIiIIllIi;
   }

   public int IIlllIlliIll() {
      return this.ilIiIIllIi;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) >>> 5) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) >>> 5) ^ var5) >>> 5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) >>> 5) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf3e4') + var5) + var5) ^ '펜') + 1261) ^ 20504) - var5) + var5) ^ var5) << 10) >>> 5) ^ var5) >>> 5) ^ var5) >>> 11))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(long feet, long localFingerprint, long seals, boolean cell) {
      if (this.lIIiIIllIi.size() > 4096) {
         this.lIIiIIllIi.clear();
      }

      this.lIIiIIllIi.put(IliIlllilIi(feet, localFingerprint, seals), cell);
      ++this.iIIiIIllIi;
      if (cell) {
         ++this.llIiIIllIi;
      } else {
         ++this.IlIiIIllIi;
      }

   }

   public int IIillIiliIil() {
      return this.iiIiIIllIi;
   }

   public String Ililllililil() {
      return IIIilIIiiIIi<invokedynamic>() + this.iIIiIIllIi + IIIilIIiiIIi<invokedynamic>() + this.IlIiIIllIi + IIIilIIiiIIi<invokedynamic>() + this.llIiIIllIi + IIIilIIiiIIi<invokedynamic>() + this.ilIiIIllIi + IIIilIIiiIIi<invokedynamic>() + this.IiIiIIllIi + IIIilIIiiIIi<invokedynamic>() + this.liIiIIllIi;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2711749005679861268L ^ Long.rotateLeft(-743023676499859736L, 48) ^ -1596743767587996805L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6165166842909905700L ^ Long.rotateLeft(2077864376779123382L, 14) ^ 6185311557088694133L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5835457855424023555L ^ Long.rotateLeft(7019425780332387653L, 30) ^ -4023284597500029486L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3987077099354852181L ^ Long.rotateLeft(7237108050348405188L, 11) ^ -3801702711499281419L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 919081585679207076L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1948299918067799316L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2084082432778522894L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1090504408293998206L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4022379436947132180L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4110364986485331048L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   public void IilliliilIIi() {
      ++this.ilIiIIllIi;
   }

   public Boolean liiiIIllIl(long feet, long localFingerprint, long cell) {
      Boolean var7 = (Boolean)this.lIIiIIllIi.get(IliIlllilIi(feet, localFingerprint, cell));
      if (var7 != null) {
         ++this.iiIiIIllIi;
      }

      return var7;
   }
}
