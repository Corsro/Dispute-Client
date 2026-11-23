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

public enum IIlIilillIlIilil {
   iilliIIlil(liiiIIllIl<invokedynamic>()),
   iIiliIIlil(liiiIIllIl<invokedynamic>()),
   illliIIlil(liiiIIllIl<invokedynamic>()),
   IilliIIlil(liiiIIllIl<invokedynamic>()),
   lliliIIlil(liiiIIllIl<invokedynamic>()),
   lIiliIIlil(liiiIIllIl<invokedynamic>()),
   IiiliIIlil(liiiIIllIl<invokedynamic>()),
   lllliIIlil(liiiIIllIl<invokedynamic>()),
   IllliIIlil(liiiIIllIl<invokedynamic>()),
   liiliIIlil(liiiIIllIl<invokedynamic>()),
   IliliIIlil(liiiIIllIl<invokedynamic>()),
   IIiliIIlil(liiiIIllIl<invokedynamic>()),
   lilliIIlil(liiiIIllIl<invokedynamic>());

   private final String iiiliIIlil;
   ililiIIlil(liiiIIllIl<invokedynamic>());

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4527560188896614150L ^ Long.rotateLeft(5746816250979767960L, 2) ^ 6004415855168483781L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3240345845516736832L ^ Long.rotateLeft(3606273201452240811L, 53) ^ -6255468071754325408L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -732424325249771288L ^ Long.rotateLeft(-4995607923438044887L, 47) ^ 5185392669711587187L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6753935501438388280L ^ Long.rotateLeft(-624162617628048576L, 36) ^ -8148353121102358178L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2852961931619975555L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5768521543237439183L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4578839063023931474L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -9026834415319632651L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2926722826334768788L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5780343965435466148L;
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

   private IIlIilillIlIilil(String var3) {
      this.iiiliIIlil = var3;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - var5) - var5) - var5) ^ 10402) + 18589))) + '\uef34') + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static IIlIilillIlIilil[] IliIlllilIi() {
      return new IIlIilillIlIilil[]{IllliIIlil, lllliIIlil, illliIIlil, IilliIIlil, lilliIIlil, iilliIIlil, IIiliIIlil, lIiliIIlil, iIiliIIlil, IliliIIlil, lliliIIlil, ililiIIlil, IiiliIIlil, liiliIIlil};
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) << 7) ^ var5))))) >>> 14 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) << 7) ^ var5))))) << 2) << 2 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) << 7) ^ var5))))) >>> 14 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) << 5 | (char)(-((char)((char)(var4[var5] - var5) << 4 | (char)(var4[var5] - var5) >>> 12))) >>> 11) + var5) ^ var5) << 7) ^ var5))))) << 2) >>> 14) + '\uf481') + 8043));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ 8517) - '힃'))) + var5) + '\uf4d8') ^ var5))) + 27081))) << 9 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ 8517) - '힃'))) + var5) + '\uf4d8') ^ var5))) + 27081))) >>> 7) + '무') << 4 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ 8517) - '힃'))) + var5) + '\uf4d8') ^ var5))) + 27081))) << 9 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ 8517) - '힃'))) + var5) + '\uf4d8') ^ var5))) + 27081))) >>> 7) + '무') >>> 12))) + 6834));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) >>> 15))) - var5))) ^ 9081) - 9808) << 4 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) >>> 15))) - var5))) ^ 9081) - 9808) >>> 12))) << 14 | (char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) >>> 15))) - var5))) ^ 9081) - 9808) << 4 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) >>> 15 | (char)((char)((char)(var4[var5] ^ var5) + '캫') << 8 | (char)((char)(var4[var5] ^ var5) + '캫') >>> 8) << 1) + '갬') >>> 3) >>> 11) + var5) ^ var5) >>> 15))) - var5))) ^ 9081) - 9808) >>> 12))) >>> 2) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)var4[var5] << 8 | (char)var4[var5] >>> 8) >>> 9 | (char)((char)var4[var5] << 8 | (char)var4[var5] >>> 8) << 7) ^ '볆') ^ 29846))) ^ var5) ^ '要') - 'ꛖ') << 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)var4[var5] << 8 | (char)var4[var5] >>> 8) >>> 9 | (char)((char)var4[var5] << 8 | (char)var4[var5] >>> 8) << 7) ^ '볆') ^ 29846))) ^ var5) ^ '要') - 'ꛖ') >>> 1) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
