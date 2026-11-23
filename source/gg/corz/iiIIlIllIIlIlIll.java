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
import net.minecraft.class_2350;

public final class iiIIlIllIIlIlIll {
   public final int iillIillll;
   public final boolean iIilIillll;
   public final int IIilIillll;
   public final int llllIillll;
   public final boolean ililIillll;
   public final int illlIillll;
   public final boolean llilIillll;
   public final class_2350 IillIillll;
   public final boolean lIilIillll;
   public final int lillIillll;
   public final int IlilIillll;
   public final int IlllIillll;

   public class_2350.class_2351 IliIlllilIi() {
      return this.IillIillll.method_10166();
   }

   public boolean iIlIlllllill() {
      return this.lIilIillll && this.iIilIillll;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2240911438749131014L ^ Long.rotateLeft(7363149461445673308L, 56) ^ 1527910455095335183L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3436852623949181157L ^ Long.rotateLeft(6078078004718219288L, 59) ^ -1019713092220832566L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4596913682907277115L ^ Long.rotateLeft(2439822737902059478L, 8) ^ 5033819693485126658L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5906809873321231892L ^ Long.rotateLeft(6006889473471101671L, 21) ^ -5642410234872615319L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5191286839361627507L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6980215143808180707L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1884580572529922248L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1829545102856133750L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7187745964370346039L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4466367850623594873L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) << 10 | (char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 6) + var5) + 10627) - var5) << 11 | (char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) << 10 | (char)(var4[var5] >>> 12 | var4[var5] << 4) >>> 6) + var5) + 10627) - var5) >>> 5))) - var5) - var5))) ^ '퍪') ^ 29866) - '揄') + '\ue33c'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public class_2338 liiiIIllIl() {
      return new class_2338(this.IlllIillll, this.llllIillll, this.illlIillll);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ 'ﰃ') >>> 5 | (char)(var4[var5] ^ 'ﰃ') << 11) ^ 19297))) - 4395))))) + 'ꓴ') - var5))) << 7 | (char)(~((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ 'ﰃ') >>> 5 | (char)(var4[var5] ^ 'ﰃ') << 11) ^ 19297))) - 4395))))) + 'ꓴ') - var5))) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   iiIIlIllIIlIlIll(int spill, int bootstrap, int z, class_2350 x, int offPlane, int covered, int gridB, boolean face, boolean gridA, int useful, boolean y, boolean score) {
      this.IlllIillll = spill;
      this.llllIillll = bootstrap;
      this.illlIillll = z;
      this.IillIillll = x;
      this.lillIillll = offPlane;
      this.iillIillll = covered;
      this.IIilIillll = gridB;
      this.lIilIillll = face;
      this.iIilIillll = gridA;
      this.IlilIillll = useful;
      this.llilIillll = y;
      this.ililIillll = score;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) << 2) + 'ꤩ') + 2318) >>> 3 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) << 2) + 'ꤩ') + 2318) << 13))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) << 2) + 'ꤩ') + 2318) >>> 3 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) >>> 14 | (char)(~((char)((char)((char)(var4[var5] - var5) >>> 9 | (char)(var4[var5] - var5) << 7) + var5))) << 2) + 'ꤩ') + 2318) << 13))) + var5) << 13) + 30774))) - 1083) + var5) ^ 5820));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) - 29600))) - '\uee8e') - '\uf474') - '툞') >>> 12 | (char)((char)((char)((char)(~((char)((char)(~var4[var5]) - 29600))) - '\uee8e') - '\uf474') - '툞') << 4) + var5) - var5) - '잫'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi(int py, int px, int pz) {
      return this.IlllIillll == py && this.llllIillll == px && this.illlIillll == pz;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) << 11) + var5) - 24338))) >>> 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) << 11) + var5) - 24338))) << 15) + '팳'))) >>> 8 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) << 11) + var5) - 24338))) >>> 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) ^ 25931) + var5))) ^ var5) + var5) << 6) << 11) + var5) - 24338))) << 15) + '팳'))) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return lIiiIiIlilli<invokedynamic>() + this.IlllIillll + lIiiIiIlilli<invokedynamic>() + this.llllIillll + lIiiIiIlilli<invokedynamic>() + this.illlIillll + lIiiIiIlilli<invokedynamic>() + this.IillIillll + lIiiIiIlilli<invokedynamic>() + this.lillIillll + (this.llilIillll ? lIiiIiIlilli<invokedynamic>() + this.iillIillll : "") + lIiiIiIlilli<invokedynamic>() + this.IIilIillll + lIiiIiIlilli<invokedynamic>() + (this.lIilIillll ? 1 : 0) + (this.iIilIillll ? 1 : 0) + (this.ililIillll ? lIiiIiIlilli<invokedynamic>() : "") + lIiiIiIlilli<invokedynamic>() + this.IlilIillll;
   }
}
