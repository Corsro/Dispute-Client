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

public record iilIlIilIIiIlIil(double[] along, double[] lateral, double speed, double melee, double expl, double air, int n) {
   private final double lliIIIlIil;
   private final double IliIIIlIil;
   private final double[] IIiIIIlIil;
   private final double[] iilIIIlIil;
   private final double iIiIIIlIil;
   private final int iliIIIlIil;
   private final double lIiIIIlIil;

   public int hashCode() {
      long var2 = 8512453842873102389L;
      var2 ^= ((long)Arrays.hashCode(this.iilIIIlIil) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Arrays.hashCode(this.IIiIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.lIiIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.iIiIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.IliIIIlIil)) << 32 ^ var2) & -1L << 32;
      var2 ^= ((long)(31 * (int)(var2 >>> 32) + Double.hashCode(this.lliIIIlIil)) << 32 ^ var2) & -1L << 32;
      return 31 * (int)(var2 >>> 32) + this.iliIIIlIil;
   }

   public boolean equals(Object o) {
      if (this == o) {
         return true;
      } else if (!(o instanceof iilIlIilIIiIlIil)) {
         return false;
      } else {
         iilIlIilIIiIlIil var2 = (iilIlIilIIiIlIil)o;
         return Arrays.equals(this.iilIIIlIil, var2.iilIIIlIil) && Arrays.equals(this.IIiIIIlIil, var2.IIiIIIlIil) && Double.compare(this.lIiIIIlIil, var2.lIiIIIlIil) == 0 && Double.compare(this.iIiIIIlIil, var2.iIiIIIlIil) == 0 && Double.compare(this.IliIIIlIil, var2.IliIIIlIil) == 0 && Double.compare(this.lliIIIlIil, var2.lliIIIlIil) == 0 && this.iliIIIlIil == var2.iliIIIlIil;
      }
   }

   public double iIlIlllllill() {
      return this.lIiIIIlIil;
   }

   public double[] IliIlllilIi() {
      return this.iilIIIlIil;
   }

   public iilIlIilIIiIlIil(double[] n, double[] melee, double expl, double along, double lateral, double air, int speed) {
      this.iilIIIlIil = n;
      this.IIiIIIlIil = melee;
      this.lIiIIIlIil = expl;
      this.iIiIIIlIil = along;
      this.IliIIIlIil = lateral;
      this.lliIIIlIil = air;
      this.iliIIIlIil = speed;
   }

   public double lIiiIiIlilli() {
      return this.IliIIIlIil;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8655312959564725668L ^ Long.rotateLeft(-8302207275167257120L, 45) ^ 623644087875372936L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3830074865850372109L ^ Long.rotateLeft(7756364027554354731L, 27) ^ 7037964592936117897L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -393271953112565447L ^ Long.rotateLeft(7950719782321531690L, 30) ^ 8287900424828423526L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9011103897187621895L ^ Long.rotateLeft(-629504690131447926L, 14) ^ 2079561017236460361L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2156759633661097110L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6893485198658538383L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7406638839321563740L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8891691255458092311L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1025351525375225620L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4391763455091789050L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iilllilliill<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 15242) ^ '\ud84b') << 11 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 15242) ^ '\ud84b') >>> 5) - 12892))) + var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 15242) ^ '\ud84b') << 11 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 15242) ^ '\ud84b') >>> 5) - 12892))) + var5) << 1) - var5) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) - var5) ^ var5) ^ var5) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) - var5) ^ var5) ^ var5) << 8))) + var5) + 29970) - var5) ^ var5) ^ var5))) ^ '턵'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~var4[var5]) - 15913) - '譃'))) + 18908) - '\uf66e'))) - '튖'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl() {
      return this.iliIIIlIil;
   }

   public double[] liiiIIllIl() {
      return this.IIiIIIlIil;
   }

   public double IilliliilIIi() {
      return this.iIiIIIlIil;
   }

   public String toString() {
      return IlIlllIlilIl<invokedynamic>() + Arrays.toString(this.iilIIIlIil) + IlIlllIlilIl<invokedynamic>() + Arrays.toString(this.IIiIIIlIil) + IlIlllIlilIl<invokedynamic>() + this.lIiIIIlIil + IlIlllIlilIl<invokedynamic>() + this.iIiIIIlIil + IlIlllIlilIl<invokedynamic>() + this.IliIIIlIil + IlIlllIlilIl<invokedynamic>() + this.lliIIIlIil + IlIlllIlilIl<invokedynamic>() + this.iliIIIlIil + IlIlllIlilIl<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) >>> 11 | (char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) << 5) >>> 5 | (char)((char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) >>> 11 | (char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) << 5) << 11) + var5))))) + 10632) ^ '\ueb0f'))) ^ var5) >>> 5 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) >>> 11 | (char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) << 5) >>> 5 | (char)((char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) >>> 11 | (char)(~((char)((char)(-((char)(var4[var5] << 9 | var4[var5] >>> 7))) - 4181))) << 5) << 11) + var5))))) + 10632) ^ '\ueb0f'))) ^ var5) << 11))) + 24734) + '跰') - '쑢'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) >>> 6 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) << 10) ^ var5) ^ 27532) + 18218) + 12625) ^ '静'))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) >>> 6 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) << 10) ^ var5) ^ 27532) + 18218) + 12625) ^ '静'))) >>> 5))) - var5) << 12 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) >>> 6 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) << 10) ^ var5) ^ 27532) + 18218) + 12625) ^ '静'))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) >>> 6 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) << 14 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) - 4073) ^ var5) - var5) >>> 2) << 10) ^ var5) ^ 27532) + 18218) + 12625) ^ '静'))) >>> 5))) - var5) >>> 4) + 6713) + '곺'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double iliIiiliiiii() {
      return this.lliIIIlIil;
   }
}
