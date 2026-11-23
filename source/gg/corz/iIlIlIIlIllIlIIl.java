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

public final class iIlIlIIlIllIlIIl {
   public static final int liiIIillIl = 14;
   public static final int iIiIIillIl = 9;
   public static final int iliIIillIl = 12;
   public static final int IllIIillIl = 1;
   public static final int iIIlIillIl = 18;
   public static final int IlllIillIl = 0;
   public static final int llIlIillIl = 20;
   public static final int illIIillIl = 3;
   public static final int iiIlIillIl = 24;
   public static final int IIiIIillIl = 7;
   public static final int IIllIillIl = 25;
   public static final int iIllIillIl = 27;
   public static final int IlIlIillIl = 19;
   public static final int IiiIIillIl = 13;
   public static final int ilIlIillIl = 21;
   public static final int lllIIillIl = 2;
   public static final int lilIIillIl = 5;
   public static final int IilIIillIl = 4;
   public static final int lIiIIillIl = 8;
   public static final int iilIIillIl = 6;
   public static final int iIlIIillIl = 0;
   public static final int IliIIillIl = 10;
   public static final int IIIlIillIl = 16;
   public static final int iiiIIillIl = 15;
   public static final int lIIlIillIl = 17;
   public static final int lliIIillIl = 11;
   public static final int illlIillIl = 2;
   public static final int llllIillIl = 1;
   public static final int IiIlIillIl = 22;
   public static final int liIlIillIl = 23;
   public static final int lIllIillIl = 26;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4004120163962115942L ^ Long.rotateLeft(-3951574370514417683L, 49) ^ 6050445216302201679L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3023226954520553923L ^ Long.rotateLeft(2457228451264909328L, 10) ^ 9042262549499123889L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5218533479811714839L ^ Long.rotateLeft(35388558150329213L, 34) ^ 7809757766937324482L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4270376762903193711L ^ Long.rotateLeft(3209235961471551185L, 62) ^ 3284814773332392145L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1380965339598036847L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4228984207131948514L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2740310180928401074L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5914432699680191878L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1189418264130568022L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8017858021994891291L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iliIiiliiiii<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - 7746) + var5) ^ var5))) ^ 23784) - var5) + var5) ^ 11379) + 'ꝿ') + '鄊') ^ var5) - var5) ^ var5) + 6048) - var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - 7746) + var5) ^ var5))) ^ 23784) - var5) + var5) ^ 11379) + 'ꝿ') + '鄊') ^ var5) - var5) ^ var5) + 6048) - var5) >>> 5) + 19464));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) << 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) >>> 3) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) << 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) >>> 3) - var5) << 8) ^ 19301))) >>> 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) << 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) >>> 3) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) << 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') << 6 | (char)((char)((char)(~((char)((char)(~((char)(-var4[var5]))) << 5 | (char)(~((char)(-var4[var5]))) >>> 11))) - var5) ^ '콣') >>> 10) >>> 12))) << 8) - '릖') + 22453) >>> 3) - var5) << 8) ^ 19301))) << 15));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) << 6 | (char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) >>> 10) + var5) - 7233) + '툦') + 23651) + 'ꖾ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) << 6 | (char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) >>> 10) + var5) - 7233) + '툦') + 23651) + 'ꖾ') << 4))) ^ var5))))))) ^ var5) << 15 | (char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) << 6 | (char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) >>> 10) + var5) - 7233) + '툦') + 23651) + 'ꖾ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) << 6 | (char)(~((char)(-((char)((char)(var4[var5] + var5) + 6527))))) >>> 10) + var5) - 7233) + '툦') + 23651) + 'ꖾ') << 4))) ^ var5))))))) ^ var5) >>> 1) ^ '\udebe'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iIlIlIIlIllIlIIl() {
   }

   public static String IliIlllilIi(int c) {
      switch (c) {
         case 1 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 2 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 3 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 4 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 5 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 6 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 7 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 8 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 9 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 10 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 11 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 12 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 13 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 14 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 15 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 16 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 17 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 18 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 19 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 20 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 21 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 22 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 23 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 24 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 25 -> {
            return liiiIIllIl<invokedynamic>();
         }
         case 26 -> {
            return liiiIIllIl<invokedynamic>();
         }
         default -> {
            return liiiIIllIl<invokedynamic>();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) - 14114) ^ var5) + var5) + var5) - var5))))) << 8 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) - 14114) ^ var5) + var5) + var5) - var5))))) >>> 8) << 8 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) - 14114) ^ var5) + var5) + var5) - var5))))) << 8 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) - 14114) ^ var5) + var5) + var5) - var5))))) >>> 8) >>> 8) - 6963))) - 10621) - '﨡') ^ var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) << 2 | (char)((char)(-var4[var5]) ^ var5) >>> 14) ^ 8469) ^ var5) + '鬎') ^ 23952))) ^ 19177) ^ 20050));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
