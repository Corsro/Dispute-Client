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

public final class liiIliliiiIlil {
   public int illliiiIiIilliiiIi;
   public final long[] lIlliiiIiiIlliiiIi;
   public final String lilliiiIiiilliiiIi;
   public long iIiliiiIiIliliiiIi;
   public final long[] IllliiiIilllliiiIi;
   public final int IIiliiiIilIiliiiIi;
   public final ilIllIllIiIllIll iiIliiiIiIIlliiiIi;
   public final long IiIliiiIiliIliiiIi;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5364125607661899405L ^ Long.rotateLeft(1976753066184963136L, 16) ^ -7283665654877886682L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -985519631999682445L ^ Long.rotateLeft(5068969079750559990L, 20) ^ 5629075743212309070L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4444685434291734698L ^ Long.rotateLeft(1813447583191178807L, 26) ^ 6780853547562044520L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8396309935260143337L ^ Long.rotateLeft(-3348407808657973318L, 45) ^ -4269096160279217069L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 239150458615351498L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 9150543723034817219L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 395228503393236763L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7765007585450426464L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8923887059368324253L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5087518888884537486L;
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

   liiIliliiiIlil(long sideMask, ilIllIllIiIllIll region, long[] regionRev, long[] targets, int targetSigs, String reason, int ctx, long tick) {
      this.IiIliiiIiliIliiiIi = sideMask;
      this.iiIliiiIiIIlliiiIi = region;
      this.lIlliiiIiiIlliiiIi = regionRev;
      this.IllliiiIilllliiiIi = targets;
      this.illliiiIiIilliiiIi = targetSigs;
      this.lilliiiIiiilliiiIi = reason;
      this.IIiliiiIilIiliiiIi = ctx;
      this.iIiliiiIiIliliiiIi = tick;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '뫪') << 13 | (char)((char)(~var4[var5]) - '뫪') >>> 3) + var5) - 31119))) - '뎨'))) ^ 8492))) ^ var5) + 20006) << 10 | (char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '뫪') << 13 | (char)((char)(~var4[var5]) - '뫪') >>> 3) + var5) - 31119))) - '뎨'))) ^ 8492))) ^ var5) + 20006) >>> 6) - var5) - var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf3ef') - var5) ^ 835) ^ '뻊') - 31219) + var5))) - '운') - 3442) << 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf3ef') - var5) ^ 835) ^ '뻊') - 31219) + var5))) - '운') - 3442) >>> 7) - var5))) - 29540) + '遧') ^ var5))) + 1069));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 7824) - 21331)))) - '\udaea') + '쩛'))) >>> 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 7824) - 21331)))) - '\udaea') + '쩛'))) << 10) - '\uf463'))) << 1 | (char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 7824) - 21331)))) - '\udaea') + '쩛'))) >>> 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 7824) - 21331)))) - '\udaea') + '쩛'))) << 10) - '\uf463'))) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      long var3 = 4374042638605338414L;
      StringBuilder var1 = new StringBuilder();

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < illiIlIiIiliIlIi.IiiIiIIIIi.length; var5 += 4294967296L) {
         if ((this.illliiiIiIilliiiIi & 1 << (int)(var5 >>> 32)) != 0) {
            if (var1.length() > 0) {
               var1.append('|');
            }

            var1.append(illiIlIiIiliIlIi.IiiIiIIIIi[(int)(var5 >>> 32)]);
         }
      }

      return liiiIIllIl<invokedynamic>() + this.IiIliiiIiliIliiiIi + liiiIIllIl<invokedynamic>() + this.lIlliiiIiiIlliiiIi.length + liiiIIllIl<invokedynamic>() + var1 + liiiIIllIl<invokedynamic>() + this.lilliiiIiiilliiiIi + liiiIIllIl<invokedynamic>() + this.iiIliiiIiIIlliiiIi.IliIlllilIi() + liiiIIllIl<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) ^ var5) + var5) ^ var5))) ^ var5) + '핾') - 5259) ^ 17058) ^ var5) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) ^ var5) + var5) ^ var5))) ^ var5) + '핾') - 5259) ^ 17058) ^ var5) + var5) << 12));
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
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) << 15) << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) << 15) >>> 3))) << 6 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) << 15) << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) << 13 | (char)((char)((char)(var4[var5] ^ var5) ^ 10370) ^ var5) >>> 3) - 17624))) + 26077) << 1) - 5502))) + 953) ^ var5) << 15) >>> 3))) >>> 10))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
