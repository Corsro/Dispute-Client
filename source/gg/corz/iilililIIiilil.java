package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iilililIIiilil(long target, long[] workspaceCells, long[] assetCells) {
   private final long lIlIIiIliiIlIIiIli;
   private final long[] IllIIiIlilllIIiIli;
   private final long[] illIIiIliIilIIiIli;

   public iilililIIiilil(long workspaceCells, long[] assetCells, long[] target) {
      assetCells = assetCells == null ? new long[0] : (long[])(([J)assetCells).clone();
      target = target == null ? new long[0] : (long[])(([J)target).clone();
      this.lIlIIiIliiIlIIiIli = workspaceCells;
      this.IllIIiIlilllIIiIli = assetCells;
      this.illIIiIliIilIIiIli = target;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\ueae3') + var5) + var5) + 29035) ^ var5) + var5) ^ var5) + var5) + var5) ^ '뼮') ^ '\ueed1') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\ueae3') + var5) + var5) + 29035) ^ var5) + var5) ^ var5) + var5) + var5) ^ '뼮') ^ '\ueed1') >>> 10) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static long IIIllIIliIIl(long packed) {
      return llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(packed), llIiIiililIiIiil.IIlllIlliIll(packed) - 1, llIiIiililIiIiil.Illlllllilll(packed));
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) >>> 7 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) << 9)) ^ var5) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) >>> 7 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) << 9)) ^ var5) - var5) << 8) - 9110) - 26800) ^ var5) - 28227) + var5))))))) ^ 8371) << 11 | (char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) >>> 7 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) << 9)) ^ var5) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) >>> 7 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + var5) << 9)) ^ var5) - var5) << 8) - 9110) - 26800) ^ var5) - 28227) + var5))))))) ^ 8371) >>> 5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') << 6) - '\ue951') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') << 6) - '\ue951') << 1) + '촩') - 8767))) << 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') << 6) - '\ue951') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) - var5) + '\uda3f') - '藏') << 6) - '\ue951') << 1) + '촩') - 8767))) >>> 8) - '鏛'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IiIlliIliiIl() {
      return this.lIlIIiIliiIlIIiIli;
   }

   private static long iliIiiliiiii(long packed) {
      return llIiIiililIiIiil.IIIllIIliIIl(llIiIiililIiIiil.IiIlliIliiIl(packed), llIiIiililIiIiil.IIlllIlliIll(packed) + 1, llIiIiililIiIiil.Illlllllilll(packed));
   }

   public long[] IIlllIlliIll() {
      return this.IllIIiIlilllIIiIli;
   }

   public static iilililIIiilil IliIlllilIi(long target, Collection<Long> candidateStands, LongPredicate ownedTemp) {
      LinkedHashSet var4 = new LinkedHashSet();
      var4.add(target);
      if (candidateStands != null) {
         for(long var6 : candidateStands) {
            var4.add(var6);
            var4.add(iliIiiliiiii(var6));
         }
      }

      LinkedHashSet var9 = new LinkedHashSet();

      for(long var7 : var4) {
         var9.add(IIIllIIliIIl(var7));
         if (ownedTemp != null && ownedTemp.test(var7)) {
            var9.add(var7);
         }
      }

      return new iilililIIiilil(target, IlIlllIlilIl(var4), IlIlllIlilIl(var9));
   }

   private static long[] IlIlllIlilIl(Collection<Long> in) {
      long var6 = 7165277901580462864L;
      long[] var1 = new long[in.size()];
      var6 ^= (0L ^ var6) & -1L << 32;

      for(long var4 : in) {
         int var10001 = (int)(var6 >>> 32);
         var6 += 4294967296L;
         var1[var10001] = var4;
      }

      return var1;
   }

   public boolean liiiIIllIl(long cell) {
      long var8 = -6758867475712166808L;
      long[] var3 = this.IllIIiIlilllIIiIli;
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         if (var6 == cell) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 12 | (char)(-((char)(var4[var5] ^ var5))) << 4) - 18041) ^ var5))))) ^ '\ueb12') ^ 9423) << 11 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) >>> 12 | (char)(-((char)(var4[var5] ^ var5))) << 4) - 18041) ^ var5))))) ^ '\ueb12') ^ 9423) >>> 5) - var5))) - 28786));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long[] Illlllllilll() {
      return this.illIIiIliIilIIiIli;
   }

   public int iIlIlllllill() {
      return this.IllIIiIlilllIIiIli.length;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5877963747694591497L ^ Long.rotateLeft(6108211417447263645L, 19) ^ -3631578375619057506L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7680563382805293897L ^ Long.rotateLeft(5791730578253115871L, 44) ^ -5929015606603845027L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3767919007233725178L ^ Long.rotateLeft(-8255970968139473550L, 16) ^ -6275161573497589833L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3498890905755853146L ^ Long.rotateLeft(-2957563763933966318L, 6) ^ 5295355831686176713L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4006568756651800023L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7813860517392281012L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7271826295783385675L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5534287945201501290L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3794032969507027817L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -282952218678788403L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIilIIiiIIi<invokedynamic>());
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

   public String lIiiIiIlilli() {
      return String.format(Locale.ROOT, Iilllilliill<invokedynamic>(), this.IllIIiIlilllIIiIli.length, this.illIIiIliIilIIiIli.length);
   }

   public long IilliliilIIi(LongUnaryOperator stateOf) {
      return iIiIliIliIli.liiiIIllIl(this.illIIiIliIilIIiIli, stateOf);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) << 14) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) << 14) ^ var5) >>> 1) - 24866) - var5) ^ var5))) ^ '뭮') << 12 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) << 14) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) << 9 | (char)((char)((char)((char)(var4[var5] + var5) - 9986) << 8 | (char)((char)(var4[var5] + var5) - 9986) >>> 8) - var5) >>> 7) << 14) ^ var5) >>> 1) - 24866) - var5) ^ var5))) ^ '뭮') >>> 4) - 14720) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
