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

public final class llilIIiililIIi {
   public int liIIliiliiiIIliili;
   public int IIlIliililIlIliili;
   public int IlIIliilillIIliili;
   public int lllIliiliillIliili;
   public int lIIIliiliiIIIliili;
   public int ilIIliiliIiIIliili;
   public int iIlIliiliIllIliili;
   public String IilIliilililIliili = IliIlllilIi<invokedynamic>();

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + '袒') + var5) - var5) >>> 10 | (char)((char)((char)(var4[var5] + '袒') + var5) - var5) << 6) - '됫'))) ^ '\ue87b') - var5) + var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) << 5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) << 5) - var5) >>> 11) + var5) + '뒊') ^ var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) << 5) - var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) << 1 | (char)((char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) >>> 1 | (char)((char)(~((char)((char)((char)(var4[var5] + '\ue8ba') - 21296) - 4113))) - 32393) << 15) >>> 15) - 18954) << 5) - var5) >>> 11) + var5) + '뒊') ^ var5) + var5) >>> 8) - 18224));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return IliIlllilIi<invokedynamic>() + this.lIIIliiliiIIIliili + IliIlllilIi<invokedynamic>() + this.IlIIliilillIIliili + IliIlllilIi<invokedynamic>() + this.ilIIliiliIiIIliili + IliIlllilIi<invokedynamic>() + this.liIIliiliiiIIliili + IliIlllilIi<invokedynamic>() + this.IIlIliililIlIliili + IliIlllilIi<invokedynamic>() + this.iIlIliiliIllIliili + IliIlllilIi<invokedynamic>() + this.lllIliiliillIliili + IliIlllilIi<invokedynamic>() + this.IilIliilililIliili;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 9184297524681541505L ^ Long.rotateLeft(-6622352275579424858L, 58) ^ 616805713629681169L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2258754892111627385L ^ Long.rotateLeft(-1480460136893061018L, 17) ^ -1867018359063017643L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2525537023855407565L ^ Long.rotateLeft(-2290769345699357186L, 21) ^ -3451569400479876242L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8559479605123828116L ^ Long.rotateLeft(5375867703576693702L, 63) ^ -8471776784118665165L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4500489435806077270L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6990415337641122729L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9105622835706296546L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3316724753444543813L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7263341840615841079L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6283500432896032110L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) >>> 13) ^ var5) ^ '\uf026') >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) >>> 13) ^ var5) ^ '\uf026') << 6) + '\uecb2') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) >>> 13) ^ var5) ^ '\uf026') >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10))) - '\ue6d3') + 1902) - 27228) - var5) << 12) + 2675) >>> 15) ^ var5) >>> 13) ^ var5) ^ '\uf026') << 6) + '\uecb2') >>> 10) ^ var5) ^ 13052));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - var5) + 6755)) + var5) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - var5) + 6755)) + var5) ^ var5) << 12) ^ var5))) + 27362) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - var5) + 6755)) + var5) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - var5) + 6755)) + var5) ^ var5) << 12) ^ var5))) + 27362) << 14));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '앆') ^ '陦') << 5 | (char)((char)(var4[var5] ^ '앆') ^ '陦') >>> 11) + var5) ^ var5) ^ '鵦') ^ var5) - 14546) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '앆') ^ '陦') << 5 | (char)((char)(var4[var5] ^ '앆') ^ '陦') >>> 11) + var5) ^ var5) ^ '鵦') ^ var5) - 14546) >>> 10) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
