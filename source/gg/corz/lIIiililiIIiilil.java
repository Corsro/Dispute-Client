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

public final class lIIiililiIIiilil {
   public final boolean illiIlllil;
   public final boolean IiliIlllil;
   public final int llIiIlllil;
   public final int liIiIlllil;
   public final int ilIiIlllil;
   public final class_2338 iiIiIlllil;
   public final class_2338 lIliIlllil;
   public final boolean llliIlllil;
   public final int IiIiIlllil;
   public final class_2338 IIliIlllil;
   public final long IlliIlllil;
   public final class_2350 iIliIlllil;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) >>> 3) + var5) ^ '닏') ^ var5) - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) >>> 3) + var5) ^ '닏') ^ var5) - var5) << 14) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) >>> 3) + var5) ^ '닏') ^ var5) - var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) + var5) - 'ꘓ') + 6857))))) - var5) - var5) ^ var5) + var5) >>> 3) + var5) ^ '닏') ^ var5) - var5) << 14) << 12) ^ 4192));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return IliIlllilIi<invokedynamic>() + this.llIiIlllil + IliIlllilIi<invokedynamic>() + this.ilIiIlllil + IliIlllilIi<invokedynamic>() + this.IiIiIlllil + IliIlllilIi<invokedynamic>() + this.liIiIlllil + IliIlllilIi<invokedynamic>() + lliIIIliiliIIIli.illilIilil(this.iiIiIlllil) + IliIlllilIi<invokedynamic>() + lliIIIliiliIIIli.illilIilil(this.IIliIlllil) + IliIlllilIi<invokedynamic>() + lliIIIliiliIIIli.illilIilil(this.lIliIlllil) + IliIlllilIi<invokedynamic>() + this.iIliIlllil + (this.llliIlllil ? IliIlllilIi<invokedynamic>() : "") + (this.illiIlllil ? IliIlllilIi<invokedynamic>() : "") + (this.IiliIlllil ? IliIlllilIi<invokedynamic>() : "");
   }

   lIIiililiIIiilil(int band, int rank, int plane, int center, class_2338 repair, class_2338 face, class_2338 lift, class_2350 stand, long segment, boolean aim, boolean probe) {
      this(band, rank, plane, center, repair, face, lift, stand, segment, aim, probe, false);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(-((char)(-((char)((char)((char)(var4[var5] + 31614) + 25553) - var5))))))))) - 24564))) ^ '\ue75a') - var5) ^ var5) - 14861))));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 10394) - 5423))) >>> 11 | (char)(-((char)((char)(var4[var5] - 10394) - 5423))) << 5) ^ '鄕') + var5) + var5)) + var5))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 10394) - 5423))) >>> 11 | (char)(-((char)((char)(var4[var5] - 10394) - 5423))) << 5) ^ '鄕') + var5) + var5)) + var5))) << 14) ^ '럽'))) + 31142) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8854485674078471387L ^ Long.rotateLeft(6290504781260507138L, 6) ^ -5002311922985822370L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3611433830109374852L ^ Long.rotateLeft(-8693828495036117397L, 52) ^ 5494216067235673661L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7210870233381576581L ^ Long.rotateLeft(8590072462682966951L, 36) ^ -6639677184073943213L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5773786318608183642L ^ Long.rotateLeft(-4314477506801519776L, 29) ^ 6867690369493209708L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5894807804091837432L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1106169509127279193L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1560984869576671657L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6427523562430297930L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1500940522629356875L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4166829778082032378L;
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

   lIIiililiIIiilil(int band, int rank, int stand, int segment, class_2338 face, class_2338 probe, class_2338 aim, class_2350 lift, long plane, boolean residue, boolean center, boolean repair) {
      this.llIiIlllil = band;
      this.ilIiIlllil = rank;
      this.IiIiIlllil = stand;
      this.liIiIlllil = segment;
      this.iiIiIlllil = face;
      this.IIliIlllil = probe;
      this.lIliIlllil = aim;
      this.iIliIlllil = lift;
      this.IlliIlllil = plane;
      this.llliIlllil = residue;
      this.illiIlllil = center;
      this.IiliIlllil = repair;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + var5))))) + var5) + var5) << 4 | (char)((char)((char)(~((char)(~((char)(var4[var5] + var5))))) + var5) + var5) >>> 12)) << 4 | (char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + var5))))) + var5) + var5) << 4 | (char)((char)((char)(~((char)(~((char)(var4[var5] + var5))))) + var5) + var5) >>> 12)) >>> 12) + 2986) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) << 11 | (char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) >>> 5) >>> 6 | (char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) << 11 | (char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) >>> 5) << 10) - var5) + 3392))) - '멸'))) << 1 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) << 11 | (char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) >>> 5) >>> 6 | (char)((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) << 11 | (char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) >>> 15 | (char)((char)((char)(~((char)(var4[var5] - 3659))) ^ '냪') + 16972) << 1))) + var5) - var5))))) >>> 5) << 10) - var5) + 3392))) - '멸'))) >>> 15) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
