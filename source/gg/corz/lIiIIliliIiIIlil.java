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
import net.minecraft.class_2338;

public final class lIiIIliliIiIIlil {
   public int iIliiilIil;
   public int lIliiilIil;
   public class_2338 IiliiilIil;
   public int illiiilIil;
   public int llliiilIil;
   public int IIliiilIil;
   public int IlliiilIil;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') >>> 8))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') >>> 8))) << 11) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') >>> 8))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) >>> 4 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) >>> 2 | (char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) << 14) ^ '뙚'))) << 12) ^ 'ﳙ') ^ var5) + 16489) - '\ue02e') >>> 8))) << 11) >>> 12) ^ '\uf27c') - '\udd32'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - '혐') - 20006) ^ var5) + '霙'))) - var5) - '놬') - var5) + var5) >>> 9 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - '혐') - 20006) ^ var5) + '霙'))) - var5) - '놬') - var5) + var5) << 7));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '袞') - 'ꗆ') >>> 6 | (char)((char)(var4[var5] ^ '袞') - 'ꗆ') << 10))) - 25812) - '젶') >>> 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '袞') - 'ꗆ') >>> 6 | (char)((char)(var4[var5] ^ '袞') - 'ꗆ') << 10))) - 25812) - '젶') << 15) ^ '\uf713') ^ var5))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '袞') - 'ꗆ') >>> 6 | (char)((char)(var4[var5] ^ '袞') - 'ꗆ') << 10))) - 25812) - '젶') >>> 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '袞') - 'ꗆ') >>> 6 | (char)((char)(var4[var5] ^ '袞') - 'ꗆ') << 10))) - 25812) - '젶') << 15) ^ '\uf713') ^ var5))) >>> 6) ^ '\ud8a3') - '鹯') + var5) - var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - var5))) - '뽇') - var5) >>> 9 | (char)((char)((char)(~((char)(var4[var5] - var5))) - '뽇') - var5) << 7))) + 3679) + 28947) ^ var5) ^ var5) ^ var5) + var5))) << 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - var5))) - '뽇') - var5) >>> 9 | (char)((char)((char)(~((char)(var4[var5] - var5))) - '뽇') - var5) << 7))) + 3679) + 28947) ^ var5) ^ var5) ^ var5) + var5))) >>> 9) + var5))));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) << 11) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) << 11) >>> 6))) + var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) << 11) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\udbd5') + var5)) + '\uf038') ^ var5)) - 8998) << 11) >>> 6))) + var5) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return IliIlllilIi<invokedynamic>() + this.IIliiilIil + IliIlllilIi<invokedynamic>() + this.illiiilIil + IliIlllilIi<invokedynamic>() + this.lIliiilIil + IliIlllilIi<invokedynamic>() + this.iIliiilIil + IliIlllilIi<invokedynamic>() + this.IlliiilIil + IliIlllilIi<invokedynamic>() + this.llliiilIil + IliIlllilIi<invokedynamic>() + (this.IiliiilIil == null ? IliIlllilIi<invokedynamic>() : this.IiliiilIil.method_23854());
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8185919555915286324L ^ Long.rotateLeft(677643530795970144L, 52) ^ 2019108186934990595L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8028905445798712770L ^ Long.rotateLeft(-5205448917914565962L, 23) ^ 2809358717066852889L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1709599796857344324L ^ Long.rotateLeft(3201624950527359527L, 21) ^ 8888011489845173167L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2693021806025172144L ^ Long.rotateLeft(6284942608856084826L, 47) ^ 2977134167997110520L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3304360732702130673L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7296474156388630030L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4917986731552715250L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6627249863733986451L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8910516543295627111L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8703978252883491593L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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
