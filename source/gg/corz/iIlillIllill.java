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

public final class iIlillIllill {
   public final Iiilliiliiil liliilIiiiliilIi;
   public final int llIiilIiilIiilIi;
   public final int iIIiilIiIlIiilIi;
   public final int IlliilIillliilIi;
   public final int illiilIiIiliilIi;
   public final int lIliilIiiIliilIi;
   public final int iiIiilIiIIliilIi;
   public final int IiIiilIiliIiilIi;

   public String IliIlllilIi() {
      return liiiIIllIl<invokedynamic>() + this.iIIiilIiIlIiilIi + liiiIIllIl<invokedynamic>() + this.llIiilIiilIiilIi + liiiIIllIl<invokedynamic>() + this.IiIiilIiliIiilIi + liiiIIllIl<invokedynamic>() + this.iiIiilIiIIliilIi + liiiIIllIl<invokedynamic>() + this.lIliilIiiIliilIi + liiiIIllIl<invokedynamic>() + this.IlliilIillliilIi + liiiIIllIl<invokedynamic>() + this.illiilIiIiliilIi;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) << 13 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) >>> 3) - 21261) + 21967))) << 11 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) << 13 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) >>> 3) - 21261) + 21967))) >>> 5) << 11 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) << 13 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) >>> 3) - 21261) + 21967))) << 11 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) << 13 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) >>> 1 | (char)(-((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) ^ 30093) ^ var5))) << 15) - var5) - var5))) ^ 9527) >>> 3) - 21261) + 21967))) >>> 5) >>> 5) + var5) + 14094));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6626862334786266139L ^ Long.rotateLeft(-7246510189887839644L, 43) ^ 7424436080031676877L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5104535191778867070L ^ Long.rotateLeft(187394283454577700L, 39) ^ 3928633944978015060L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8277377749307495059L ^ Long.rotateLeft(-1940617283387307852L, 31) ^ 5758815928189649908L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3268070737737892313L ^ Long.rotateLeft(-148525164185101503L, 5) ^ -4007714585650024632L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6898097065467198508L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6470905092568750031L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3825192139887157186L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2715336265602058677L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6377336672946922203L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8876250569679442787L;
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) << 12 | (char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) >>> 4) ^ var5) + var5) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) << 12 | (char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) >>> 4) ^ var5) + var5) << 1) + '\ue908') ^ var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) << 12 | (char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) >>> 4) ^ var5) + var5) >>> 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) << 12 | (char)((char)((char)(-var4[var5]) ^ var5) >>> 5 | (char)((char)(-var4[var5]) ^ var5) << 11) >>> 4) ^ var5) + var5) << 1) + '\ue908') ^ var5) << 3) + var5) - var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) - '쟴') - var5))) ^ 3156) - 26022) - var5) ^ '뀨'))) >>> 13 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5) - '쟴') - var5))) ^ 3156) - 26022) - var5) ^ '뀨'))) << 3) + var5) + var5) + 1205) - var5) + '靮') + var5) - var5));
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
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + 'ꂫ') ^ 32674) ^ 19044) ^ 527) - 'ﺥ') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + 'ꂫ') ^ 32674) ^ 19044) ^ 527) - 'ﺥ') ^ var5) >>> 2) + 1939))))) ^ 'ꌷ'));
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
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) << 10 | (char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) >>> 6) - '\uf2cc') + var5) + 30004) + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) << 10 | (char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) >>> 6) - '\uf2cc') + var5) + 30004) + var5) >>> 11) + '떬'))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) << 10 | (char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) >>> 6) - '\uf2cc') + var5) + 30004) + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) << 10 | (char)((char)(-((char)((char)(var4[var5] ^ '솆') - var5))) - var5) >>> 6) - '\uf2cc') + var5) + 30004) + var5) >>> 11) + '떬'))))) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   iIlillIllill(int frontier, int largestComponent, int y, int builtFloor, int deck, int headroomFloor, int connectedRemaining, Iiilliiliiil entryCandidates) {
      this.iIIiilIiIlIiilIi = frontier;
      this.llIiilIiilIiilIi = largestComponent;
      this.IiIiilIiliIiilIi = y;
      this.iiIiilIiIIliilIi = builtFloor;
      this.lIliilIiiIliilIi = deck;
      this.IlliilIillliilIi = headroomFloor;
      this.illiilIiIiliilIi = connectedRemaining;
      this.liliilIiiiliilIi = entryCandidates;
   }
}
