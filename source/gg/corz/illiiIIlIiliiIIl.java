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

public record illiiIIlIiliiIIl(String name, int mask) {
   private final String IIiiIlilIl;
   private final int lIiiIlilIl;

   public String liiiIIllIl() {
      return this.IIiiIlilIl;
   }

   public int iIlIlllllill() {
      return this.lIiiIlilIl;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) << 7 | (char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) >>> 9) - '\ue165') - var5) << 1 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) << 7 | (char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) >>> 9) - '\ue165') - var5) >>> 15) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) << 7 | (char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) >>> 9) - '\ue165') - var5) << 1 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) << 7 | (char)((char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) << 4 | (char)(-((char)((char)(-((char)((char)(-var4[var5]) + 18948))) + var5))) >>> 12) >>> 9) - '\ue165') - var5) >>> 15) << 10) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      return this.IIiiIlilIl + IilliliilIIi<invokedynamic>() + IiliIIllliliIIll.iliIiiliiiii(this.lIiiIlilIl);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8348319376486046299L ^ Long.rotateLeft(-6969120919002437325L, 28) ^ -1270436944144318181L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7190112609505161225L ^ Long.rotateLeft(-4275435580646583019L, 11) ^ -4774183339335434671L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4734512833061714953L ^ Long.rotateLeft(-7863641332980734469L, 18) ^ 2808828476624332502L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8404461696445350951L ^ Long.rotateLeft(4453556463356033345L, 5) ^ -1885068289369017063L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5228390777419791797L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2380007602015873799L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -456074830383346724L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5620602296487938920L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7441290868021015108L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 257441426799028073L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(~var4[var5]))) - var5) << 7 | (char)((char)(~((char)(~var4[var5]))) - var5) >>> 9))) - var5) ^ 28071) << 1 | (char)((char)((char)(-((char)((char)((char)(~((char)(~var4[var5]))) - var5) << 7 | (char)((char)(~((char)(~var4[var5]))) - var5) >>> 9))) - var5) ^ 28071) >>> 15) + var5) << 14 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(~var4[var5]))) - var5) << 7 | (char)((char)(~((char)(~var4[var5]))) - var5) >>> 9))) - var5) ^ 28071) << 1 | (char)((char)((char)(-((char)((char)((char)(~((char)(~var4[var5]))) - var5) << 7 | (char)((char)(~((char)(~var4[var5]))) - var5) >>> 9))) - var5) ^ 28071) >>> 15) + var5) >>> 2) + 6887));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - 15803))) + var5) >>> 4 | (char)((char)(~((char)(var4[var5] - 15803))) + var5) << 12) + '\uab1b') + var5))) ^ '\uec6e') ^ '\uf6d6') ^ '\uf322') + var5) + 'ꨘ'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - '췪'))) + var5) + 12384) + var5))))) ^ var5) << 1 | (char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - '췪'))) + var5) + 12384) + var5))))) ^ var5) >>> 15)) + 3515) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - '췪'))) + var5) + 12384) + var5))))) ^ var5) << 1 | (char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(var4[var5] - '췪'))) + var5) + 12384) + var5))))) ^ var5) >>> 15)) + 3515) ^ var5) << 13) + var5) ^ 32597) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public illiiIIlIiliiIIl(String mask, int name) {
      this.IIiiIlilIl = mask;
      this.lIiiIlilIl = name;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] - var5))) + var5) ^ var5) - 27509) - '\ud990') - 29744) - var5) + var5))) ^ 10729) ^ '邈') - '\ue65f') << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)var4[var5] - var5))) + var5) ^ var5) - 27509) - '\ud990') - 29744) - var5) + var5))) ^ 10729) ^ '邈') - '\ue65f') >>> 15) + 24768));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
