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

public record IiIlIIllliIlIIll(int requiredStorageSlots, int availableStorageSlots, int missingStorageSlots, int usableContainers, int inaccessibleContainers) {
   private final int ilIIIIllll;
   private final int llIIIIllll;
   private final int IlIIIIllll;
   private final int iIIIIIllll;
   private final int IiIIIIllll;

   public String liiiIIllIl() {
      return IlIlllIlilIl<invokedynamic>() + this.iIIIIIllll + IlIlllIlilIl<invokedynamic>() + this.IlIIIIllll + IlIlllIlilIl<invokedynamic>() + this.llIIIIllll + IlIlllIlilIl<invokedynamic>() + this.ilIIIIllll + IlIlllIlilIl<invokedynamic>() + this.IiIIIIllll;
   }

   public IiIlIIllliIlIIll(int usableContainers, int inaccessibleContainers, int missingStorageSlots, int requiredStorageSlots, int availableStorageSlots) {
      this.iIIIIIllll = usableContainers;
      this.IlIIIIllll = inaccessibleContainers;
      this.llIIIIllll = missingStorageSlots;
      this.ilIIIIllll = requiredStorageSlots;
      this.IiIIIIllll = availableStorageSlots;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4977558910600965659L ^ Long.rotateLeft(-1746435675226575692L, 6) ^ -413548518625282578L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4413341475031247413L ^ Long.rotateLeft(8207536260333398868L, 61) ^ 2626203841592940949L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8814564314294240190L ^ Long.rotateLeft(7942879378290575192L, 16) ^ -558689981938896176L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -739159502538346665L ^ Long.rotateLeft(-8797952736009860564L, 10) ^ 4137746904977596785L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4271519387580291132L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1599912154053914830L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 218985734238000071L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5764373502111558740L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7811995174564831521L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2062466696906804845L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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

   public int iliIiiliiiii() {
      return this.ilIIIIllll;
   }

   public int IIIllIIliIIl() {
      return this.IiIIIIllll;
   }

   public boolean IliIlllilIi() {
      return this.llIIIIllll <= 0;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) >>> 13 | (char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) << 3) - var5) - 5050) << 5 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) >>> 13 | (char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) << 3) - var5) - 5050) >>> 11))))) ^ var5))) << 8 | (char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) >>> 13 | (char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) << 3) - var5) - 5050) << 5 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) >>> 13 | (char)(~((char)((char)((char)(~var4[var5]) - '옰') << 4 | (char)((char)(~var4[var5]) - '옰') >>> 12))) << 3) - var5) - 5050) >>> 11))))) ^ var5))) >>> 8) ^ 2916) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5))) >>> 5 | (char)(~((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5))) << 11) ^ 22152) + 12262) - 16713) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5))) >>> 5 | (char)(~((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5))) << 11) ^ 22152) + 12262) - 16713) ^ var5) >>> 13) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IilliliilIIi() {
      return this.IlIIIIllll;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) - 7110) - 11296) ^ '썟') << 1 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + var5))) - 7110) - 11296) ^ '썟') >>> 15) - var5) + 29819) - 25333));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli() {
      return this.llIIIIllll;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5))))) ^ var5))) ^ var5))) ^ var5) ^ '\udfea'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) << 9 | (char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) >>> 7) + '뽿') << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) << 9 | (char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) >>> 7) + '뽿') >>> 2))) - '\ue15e'))) + var5) + var5) >>> 11 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) << 9 | (char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) >>> 7) + '뽿') << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) << 9 | (char)(-((char)(~((char)((char)((char)(var4[var5] + 18780) ^ var5) ^ '\uf250'))))) >>> 7) + '뽿') >>> 2))) - '\ue15e'))) + var5) + var5) << 5) ^ '醗'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill() {
      return this.iIIIIIllll;
   }
}
