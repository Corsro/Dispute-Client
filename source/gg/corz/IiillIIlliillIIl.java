package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IiillIIlliillIIl {
   private final List<IIIlilIllIIlilIl> iiIiiillIl;
   private final double iIliiillIl;
   private final IllIllillllIllil liIiiillIl;
   private final List<Long> IIliiillIl;
   private final int lIliiillIl;

   public boolean Illlllllilll() {
      return this.iiIiiillIl.isEmpty();
   }

   public IiillIIlliillIIl(IllIllillllIllil entryNodes, List<IIIlilIllIIlilIl> expectedSeconds, List<Long> steps, int kind, double tempBlocks) {
      this.liIiiillIl = entryNodes;
      this.iiIiiillIl = List.copyOf(expectedSeconds);
      this.IIliiillIl = List.copyOf(steps);
      this.lIliiillIl = kind;
      this.iIliiillIl = tempBlocks;
   }

   public List<Long> IIlllIlliIll() {
      ArrayList var1 = new ArrayList(this.iiIiiillIl.size());

      for(IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         var1.add(var3.iIlIlllllill());
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) - var5) - '쏿') - 31346))) + '苬'))))) >>> 9 | (char)(~((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 7 | (char)((char)(var4[var5] + var5) - var5) >>> 9) ^ var5) - var5) - '쏿') - 31346))) + '苬'))))) << 7))) + var5) ^ 4932) - '폂'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ var5))) + 24480) + var5) + var5) + var5) ^ '핱'))) >>> 15 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) ^ var5))) + 24480) + var5) + var5) + var5) ^ '핱'))) << 1) ^ var5) - var5) ^ 27592) + '뫽') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return this.liIiiillIl + Iilllilliill<invokedynamic>() + this.lIiiIiIlilli() + Iilllilliill<invokedynamic>() + this.IiIlliIliiIl().size() + Iilllilliill<invokedynamic>() + this.lIliiillIl + Iilllilliill<invokedynamic>() + this.IIliiillIl.size() + Iilllilliill<invokedynamic>() + String.format(Iilllilliill<invokedynamic>(), this.iIliiillIl) + Iilllilliill<invokedynamic>() + String.format(Iilllilliill<invokedynamic>(), this.IlIlllIlilIl()) + Iilllilliill<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '찐') - var5) - var5) - var5) ^ var5) - var5) + 10215))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '찐') - var5) - var5) - var5) ^ var5) - var5) + 10215))) >>> 14) - 13763) - var5) ^ 13892) - 31005) ^ var5) ^ 23436));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IIIllIIliIIl() {
      return this.iIliiillIl;
   }

   public Set<Long> IiIlliIliiIl() {
      LinkedHashSet var1 = new LinkedHashSet();

      for(IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         var1.add(var3.liiiIIllIl());
      }

      return var1;
   }

   public int lIiiIiIlilli() {
      long var4 = 6291488197710095715L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         if (!var3.IliIlllilIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public List<IIIlilIllIIlilIl> liiiIIllIl() {
      return this.iiIiiillIl;
   }

   public int IilliliilIIi() {
      return this.lIliiillIl;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)(-((char)((char)((char)(-var4[var5]) - var5) ^ '醇')))))))) ^ '蕑') >>> 15 | (char)((char)((char)(-((char)(~((char)(-((char)((char)((char)(-var4[var5]) - var5) ^ '醇')))))))) ^ '蕑') << 1))) ^ 'ﯶ') - var5) - 21346) ^ 26911)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) << 15) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) << 15) << 6) ^ var5) ^ 24233) + var5) - 25045) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) << 15) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) >>> 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 6 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 10) - 28414))) - '\ud9ef') >>> 14) - 3342) >>> 5) << 15) << 6) ^ var5) ^ 24233) + var5) - 25045) ^ var5) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IlIlllIlilIl() {
      return this.iIliiillIl <= (double)0.0F ? (double)0.0F : (double)this.lIiiIiIlilli() / this.iIliiillIl;
   }

   public int iliIiiliiiii() {
      long var4 = -7533539655898589870L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(IIIlilIllIIlilIl var3 : this.iiIiiillIl) {
         if (var3.IliIlllilIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 133791758554563426L ^ Long.rotateLeft(8408622653699997789L, 52) ^ 5672877656976084195L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5896309543998740102L ^ Long.rotateLeft(-4682378780088268506L, 21) ^ 859970793064712698L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 888078535400713951L ^ Long.rotateLeft(-2166452477775989166L, 58) ^ 4512112203880664148L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3982269820463046327L ^ Long.rotateLeft(-1169086147297395010L, 61) ^ 4446403515642426677L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5440444112868841849L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4669131330704143981L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3146450798436579657L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4061695958898842509L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4634378168473029853L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4159491193063260708L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public List<Long> iIlIlllllill() {
      return this.IIliiillIl;
   }

   public IllIllillllIllil IliIlllilIi() {
      return this.liIiiillIl;
   }
}
