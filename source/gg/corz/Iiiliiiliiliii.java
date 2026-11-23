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

public enum Iiiliiiliiliii {
   ilIlllIlIl,
   IlIlllIlIl,
   llIlllIlIl,
   iIIlllIlIl;

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 9912) ^ '띾') + 20252) << 3 | (char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + 9912) ^ '띾') + 20252) >>> 13) ^ '鱽'))) ^ '\ueceb') + var5) + var5) ^ '깾') + '밹'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7177478816194629363L ^ Long.rotateLeft(6615755232126938811L, 5) ^ -8682848454989406414L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1139647294956973067L ^ Long.rotateLeft(-3213049412449215258L, 47) ^ 8899956560896075316L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1422388210011846287L ^ Long.rotateLeft(274279836598520784L, 40) ^ -7513591146519011472L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3382561871311278820L ^ Long.rotateLeft(5960932935480681844L, 61) ^ -8384460041241774046L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3222160940966151318L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2824722889160373957L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 435021060912439896L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5218687157394571643L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2305017727956935922L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1732407556914042613L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
   private static Iiiliiiliiliii[] liiiIIllIl() {
      return new Iiiliiiliiliii[]{iIIlllIlIl, IlIlllIlIl, llIlllIlIl, ilIlllIlIl};
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '꫶') - '黶') >>> 4 | (char)((char)(var4[var5] + '꫶') - '黶') << 12) + '\uee38') << 1 | (char)((char)((char)((char)(var4[var5] + '꫶') - '黶') >>> 4 | (char)((char)(var4[var5] + '꫶') - '黶') << 12) + '\uee38') >>> 15) ^ 1033) + var5) + 31343) + var5) - var5))) ^ var5))) + 6309) - var5) + var5))))) ^ 27570));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) >>> 15) >>> 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) >>> 15) << 5) - var5) - var5) ^ '\ueff8') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) >>> 15) >>> 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 8506) - var5) << 1 | (char)((char)(var4[var5] ^ 8506) - var5) >>> 15) ^ '\ued46') - var5) ^ var5))) + var5) >>> 15) << 5) - var5) - var5) ^ '\ueff8') << 7) + '\ue892'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) + 18670) + 18461) + 3563) - var5))) - var5) ^ 15277) - var5) - var5))) - var5)) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) + 18670) + 18461) + 3563) - var5))) - var5) ^ 15277) - var5) - var5))) - var5)) << 2) - 8499));
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
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)(-((char)(~((char)(~var4[var5]))))))) >>> 14 | (char)(-((char)(-((char)(~((char)(~var4[var5]))))))) << 2))))) >>> 4 | (char)(~((char)(~((char)((char)(-((char)(-((char)(~((char)(~var4[var5]))))))) >>> 14 | (char)(-((char)(-((char)(~((char)(~var4[var5]))))))) << 2))))) << 12) ^ var5) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IliIlllilIi() {
      byte var10000;
      switch (this.ordinal()) {
         case 0 -> var10000 = -1;
         case 1 -> var10000 = 0;
         case 2 -> var10000 = 1;
         case 3 -> var10000 = 2;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }
}
