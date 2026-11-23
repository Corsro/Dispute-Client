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

public final class lliIiIliliIiIl {
   public final int ilillIillIiillIill;
   public final boolean liillIilliiillIill;
   public final Integer IlillIillllillIill;
   public final String lIillIilliIillIill;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) << 5 | (char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) >>> 11) - var5) + var5) + 22766) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) << 5 | (char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) >>> 11) - var5) + var5) + 22766) << 14) - var5) + var5))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) << 5 | (char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) >>> 11) - var5) + var5) + 22766) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) << 5 | (char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) << 14 | (char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 4 | (char)(~var4[var5]) << 12) - var5))) ^ 6340) + var5))) >>> 2))) >>> 11) - var5) + var5) + 22766) << 14) - var5) + var5))) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6365317755078819970L ^ Long.rotateLeft(-1393565953251230162L, 27) ^ -764040602723147890L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6676965684179226030L ^ Long.rotateLeft(-4721948554854270678L, 62) ^ 1987655740846011800L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5232434571236209263L ^ Long.rotateLeft(965820819610727687L, 8) ^ 5333238817214483507L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3159661184425155798L ^ Long.rotateLeft(2398470957578982346L, 36) ^ -6774366419850763744L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6318821966578711446L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3441170203331459363L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -881008922320255907L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7425494190064767560L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8975611362143983040L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7276060443026677965L;
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

   public String IliIlllilIi() {
      return this.ilillIillIiillIill + liiiIIllIl<invokedynamic>() + (this.IlillIillllillIill == null ? liiiIIllIl<invokedynamic>() : String.valueOf(this.IlillIillllillIill));
   }

   public lliIiIliliIiIl(String revoked, Integer maxUses, int useCount, boolean code) {
      this.lIillIilliIillIill = revoked;
      this.IlillIillllillIill = maxUses;
      this.ilillIillIiillIill = useCount;
      this.liillIilliiillIill = code;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) ^ var5) - var5))) - '쮖')) ^ var5) - var5) - 'ﻌ') + 23786) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) ^ var5) - var5))) - '쮖')) ^ var5) - var5) - 'ﻌ') + 23786) ^ var5) << 13) + '\ud846') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) ^ var5) - var5))) - '쮖')) ^ var5) - var5) - 'ﻌ') + 23786) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) ^ var5) - var5))) - '쮖')) ^ var5) - var5) - 'ﻌ') + 23786) ^ var5) << 13) + '\ud846') >>> 1))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) >>> 1) + 23382) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) >>> 1) + 23382) >>> 5) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) >>> 1) + 23382) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') >>> 12 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) << 10 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) << 13 | (char)(-((char)(-((char)((char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) >>> 3 | (char)((char)(var4[var5] + '뚗') >>> 13 | (char)(var4[var5] + '뚗') << 3) << 13))))) >>> 3) >>> 6) - 'ꗤ') + 'ﱉ') - '눜') << 4) ^ var5) - 14971) - var5) >>> 1) + 23382) >>> 5) >>> 3));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) << 10 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) >>> 6) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) << 10 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) >>> 6) << 1))) + var5) << 8 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) << 10 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) >>> 6) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) << 10 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) - '쩌'))) + var5) ^ '많'))))) + var5) ^ 28541) - 15676) - 14760))) >>> 6) << 1))) + var5) >>> 8) ^ var5))));
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
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) << 1) ^ 24314))) >>> 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) << 1) ^ 24314))) << 14))) >>> 4 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) << 1) ^ 24314))) >>> 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) << 5 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) >>> 1 | (char)((char)((char)(-((char)((char)(var4[var5] - '､') - var5))) ^ var5) ^ 30761) << 15) >>> 11) >>> 5) - '\udc16') - var5) << 1) ^ 24314))) << 14))) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
