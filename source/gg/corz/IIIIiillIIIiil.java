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

public enum IIIIiillIIIiil {
   liIlIiIliiiIlIiIli,
   IIllIiIlilIllIiIli,
   lIilIiIliiIilIiIli,
   iIllIiIliIlllIiIli,
   IillIiIlilillIiIli,
   llllIiIliilllIiIli,
   IlIlIiIlillIlIiIli,
   ilIlIiIliIiIlIiIli,
   iillIiIliIIilIiIli;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7967163626961991602L ^ Long.rotateLeft(-7560307876547514697L, 35) ^ 1044231991710724921L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2693882249610368941L ^ Long.rotateLeft(-2608171187767383051L, 9) ^ 4845695487356224979L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5838152934158632672L ^ Long.rotateLeft(-3748221507329724345L, 33) ^ 1547891482247057836L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2457564883097662654L ^ Long.rotateLeft(1391971625668412546L, 10) ^ -2227189620394748255L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1550506382755148058L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5005098889129229033L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7022878393101752606L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6647170650299667775L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5930332077456876685L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 393362578878203663L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iliIiiliiiii<invokedynamic>());
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) << 15) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) << 15) ^ var5) << 3) - var5) - var5) ^ var5) + 11327) + 15552) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) << 15) ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) << 5 | (char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ var5) - var5) ^ 12538))) + var5) >>> 11) << 9) ^ var5) << 15) ^ var5) << 3) - var5) - var5) ^ var5) + 11327) + 15552) >>> 11) ^ '\ue336'));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) << 15) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) << 15) << 8) - 9398) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) << 15) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + var5) ^ '섲') - '\udaee') + 'ꮤ') - 32396) + var5) << 15) << 8) - 9398) << 3) ^ var5) + var5))) - var5))) - var5) ^ '葜'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) >>> 11 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) << 5) + 24197) - 27690) - '츥') ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) >>> 11 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) << 5) + 24197) - 27690) - '츥') ^ var5) << 3) ^ var5) - '\ud9c2') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) >>> 11 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) << 5) + 24197) - 27690) - '츥') ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) >>> 11 | (char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) << 3 | (char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) - var5) >>> 13) + '뇰') + 'ꜧ'))))) ^ '릷'))) << 5) + 24197) - 27690) - '츥') ^ var5) << 3) ^ var5) - '\ud9c2') >>> 12));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) >>> 11 | (char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) << 5) + var5) ^ '褖') ^ var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) >>> 11 | (char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) << 5) + var5) ^ '褖') ^ var5) ^ var5) >>> 14) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) >>> 11 | (char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) << 5) + var5) ^ '褖') ^ var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) >>> 11 | (char)((char)((char)(~((char)(var4[var5] + var5))) ^ var5) << 1 | (char)((char)(~((char)(var4[var5] + var5))) ^ var5) >>> 15) << 5) + var5) ^ '褖') ^ var5) ^ var5) >>> 14) << 15));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) ^ var5))) - '뗩') >>> 1 | (char)((char)(-((char)((char)(-var4[var5]) ^ var5))) - '뗩') << 15))) - var5))) - '쀄') + var5) ^ var5) ^ '궳') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static IIIIiillIIIiil[] IliIlllilIi() {
      IIIIiillIIIiil[] var10000 = new IIIIiillIIIiil[-1174690843 * 75 + -109 ^ 2092499875];
      var10000[0] = IlIlIiIlillIlIiIli;
      var10000[1] = ilIlIiIliIiIlIiIli;
      var10000[2] = liIlIiIliiiIlIiIli;
      var10000[3] = IIllIiIlilIllIiIli;
      var10000[4] = iIllIiIliIlllIiIli;
      var10000[5] = llllIiIliilllIiIli;
      var10000[(1504916739 + 23 >>> 3 | 1504916739 + 23 << 29) ^ 1261856421] = IillIiIlilillIiIli;
      var10000[(-1483703208 >>> 15 | -1483703208 << 17) * -111 ^ 723431719] = iillIiIliIIilIiIli;
      var10000[~(-1691412881 << 27 | -1691412881 >>> 5) - 99 ^ -2094627103] = lIilIiIliiIilIiIli;
      return var10000;
   }
}
