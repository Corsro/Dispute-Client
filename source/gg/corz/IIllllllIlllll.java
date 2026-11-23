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

public final class IIllllllIlllll {
   static final int Iliiiliillliiiliil = 9;
   static final double iliiiliilIiiiiliil = (double)50000.0F;
   static final String[] IIIIIiiillIIIIiiil = new String[]{liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>()};
   static final int[][] iIIIIiiilIlIIIiiil = new int[][]{{82, 5}, {100, 3}, {101, 3}, {102, 3}, {103, 2}, {104, 2}, {105, 2}, {106, 2}, {91, 2}, {83, 5}, {44, 3}, {75, 3}, {42, 3}, {41, 2}, {40, 2}, {39, 2}, {38, 2}, {92, 2}, {84, 5}, {45, 3}, {14, 3}, {13, 3}, {12, 2}, {11, 2}, {10, 2}, {37, 2}, {93, 2}, {85, 5}, {46, 5}, {74, 5}, {3, 3}, {2, 2}, {1, 2}, {25, 2}, {36, 2}, {94, 2}, {86, 4}, {47, 4}, {72, 4}, {71, 4}, {5, 2}, {4, 2}, {24, 2}, {35, 2}, {95, 2}, {87, 4}, {51, 1}, {17, 1}, {9, 0}, {8, 0}, {7, 0}, {23, 0}, {34, 0}, {96, 2}, {88, 4}, {54, 1}, {18, 1}, {61, 0}, {62, 0}, {21, 0}, {22, 0}, {33, 0}, {97, 0}, {89, 0}, {26, 1}, {27, 0}, {28, 0}, {29, 0}, {30, 0}, {59, 0}, {32, 0}, {98, 0}, {90, 0}, {107, 1}, {108, 1}, {109, 1}, {110, 1}, {111, 1}, {112, 1}, {113, 1}, {99, 0}};
   static final double liiiiliiliiiiiliil = (double)225000.0F;

   private IIllllllIlllll() {
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -309186352229930036L ^ Long.rotateLeft(-693862505758389792L, 6) ^ 22647992813102465L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4243392346496238963L ^ Long.rotateLeft(-3079919288902760327L, 18) ^ 96783046454255140L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9003051541992473496L ^ Long.rotateLeft(8198092996539133920L, 50) ^ -8518350873764806627L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2998268341854802797L ^ Long.rotateLeft(-532808049638306538L, 11) ^ 17720554219375658L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2898904834820319873L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7244817667847873801L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6414457985137586802L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7371537953388400188L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1453435650270692094L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 377944335293487604L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIlIlllllill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IilliliilIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIiiIiIlilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iliIiiliiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIllIIliIIl<invokedynamic>());
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

   public static String IliIlllilIi(double worldX, double worldZ) {
      long var7 = -4968586747559363673L;
      var7 ^= ((long)((int)Math.floor((worldX + Double.longBitsToDouble(5600466822805895632L ^ 915266082555869648L)) / Double.longBitsToDouble(-3999316489779184258L ^ -8604134958579483266L))) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((int)Math.floor((worldZ + Double.longBitsToDouble(4259934900366867033L ^ 8796976448774077017L)) / Double.longBitsToDouble(-3776922882057603771L ^ -8395335712623725243L))) ^ var7) & -1L >>> 32;
      if ((int)(var7 >>> 32) >= 0 && (int)(var7 >>> 32) < (((-1978041127 * -1483715975 * 252645135 << 25 | -1978041127 * -1483715975 * 252645135 >>> 7) >>> 13 | (-1978041127 * -1483715975 * 252645135 << 25 | -1978041127 * -1483715975 * 252645135 >>> 7) << 19) ^ 1220017825) && (int)var7 >= 0 && (int)var7 < ((726602275 + 79 >>> 19 | 726602275 + 79 << 13) - -97 ^ -498186813)) {
         int[] var6 = iIIIIiiilIlIIIiiil[(int)var7 * (-(438884453 - 115 + -25 >>> 23 | 438884453 - 115 + -25 << 9) ^ -1370468923) + (int)(var7 >>> 32)];
         return liiiIIllIl<invokedynamic>() + var6[0] + liiiIIllIl<invokedynamic>() + IIIIIiiillIIIIiiil[Math.min(var6[1], IIIIIiiillIIIIiiil.length - 1)] + liiiIIllIl<invokedynamic>();
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\ud828') ^ var5) + var5) ^ var5) << 11 | (char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\ud828') ^ var5) + var5) ^ var5) >>> 5) >>> 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\ud828') ^ var5) + var5) ^ var5) << 11 | (char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '\ud828') ^ var5) + var5) ^ var5) >>> 5) << 8) + '곚'))))))))) - var5))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) << 15 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) >>> 1) - var5) ^ var5) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) << 15 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) >>> 1) - var5) ^ var5) >>> 15) - 28625) ^ var5) ^ var5) - var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) << 15 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) >>> 1) - var5) ^ var5) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) << 15 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + '뿤') - 844) - '\uf501'))) >>> 1) - var5) ^ var5) >>> 15) - 28625) ^ var5) ^ var5) - var5) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) >>> 2 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) << 14) - var5)) + 12345) + 16362) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) >>> 2 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) << 14) - var5)) + 12345) + 16362) ^ var5))) ^ var5) << 6))) - var5))) << 8 | (char)(~((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) >>> 2 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) << 14) - var5)) + 12345) + 16362) ^ var5))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) >>> 2 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 1320) + var5))) + 11587) + var5) << 14) - var5)) + 12345) + 16362) ^ var5))) ^ var5) << 6))) - var5))) >>> 8));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] ^ var5))))) >>> 11 | (char)(~((char)(~((char)(var4[var5] ^ var5))))) << 5) - 20907) >>> 14 | (char)((char)((char)(~((char)(~((char)(var4[var5] ^ var5))))) >>> 11 | (char)(~((char)(~((char)(var4[var5] ^ var5))))) << 5) - 20907) << 2) + var5) ^ '﵎') - var5))) + 18862) + var5) + 19384) - var5) ^ var5))) ^ '쩶'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') >>> 15) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') >>> 15) - var5) >>> 11) - 9349) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') >>> 15) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '먍'))) - '辀') - var5) - '\ue521') ^ var5) - var5) ^ var5) ^ '찒') << 1) ^ 5299) ^ '\ue20f') >>> 15) - var5) >>> 11) - 9349) << 13) + 31019));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
