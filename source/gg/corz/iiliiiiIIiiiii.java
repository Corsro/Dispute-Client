package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiliiiiIIiiiii {
   public static final int IIIIilIlIl = 2048;
   public static final long lIIIilIlIl = 50000L;
   private long liIIilIlIl;
   private long llIIilIlIl = Long.MIN_VALUE;
   private long lllIilIlIl;
   private long IllIilIlIl;
   private final long[] iIIIilIlIl = new long[2048];
   private int IlIIilIlIl;
   private long lIlIilIlIl;
   private long iIlIilIlIl = Long.MAX_VALUE;
   private long IiIIilIlIl;
   private int ilIIilIlIl = Integer.MIN_VALUE;
   private long IIlIilIlIl;
   private long iiIIilIlIl;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '헗')) ^ '\ued50') ^ var5) + var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '헗')) ^ '\ued50') ^ var5) + var5) >>> 10) + 22168) - var5))) << 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '헗')) ^ '\ued50') ^ var5) + var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '헗')) ^ '\ued50') ^ var5) + var5) >>> 10) + 22168) - var5))) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IIIllIIliIIl() {
      return this.iIlIilIlIl == Long.MAX_VALUE ? 0L : this.iIlIilIlIl;
   }

   public long lIiiIiIlilli() {
      return this.liIIilIlIl;
   }

   public long IilliliilIIi() {
      return this.IiIIilIlIl;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5759937870931271931L ^ Long.rotateLeft(-7375222532319533105L, 54) ^ 6574028280555642508L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2727178375552905990L ^ Long.rotateLeft(-7700160011958535599L, 27) ^ -215008766194030138L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8456648979797453436L ^ Long.rotateLeft(1638171216798779442L, 38) ^ -6515569435730288785L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2550763868221439966L ^ Long.rotateLeft(1074690800564732663L, 18) ^ -8301974508030086567L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4827768097471317609L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5149654938098837623L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6919106720165613961L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4773342984793224721L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 689033649119324950L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1038870432803848757L;
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

   public void IliIlllilIi(int rotationChanged, long tickId, boolean positionChanged, boolean nanos, boolean onGroundChanged) {
      ++this.IiIIilIlIl;
      if (rotationChanged == this.ilIIilIlIl) {
         ++this.liIIilIlIl;
      }

      this.ilIIilIlIl = rotationChanged;
      if (positionChanged) {
         ++this.iiIIilIlIl;
      }

      if (nanos) {
         ++this.IIlIilIlIl;
      }

      if (onGroundChanged) {
         ++this.lIlIilIlIl;
      }

      if (this.llIIilIlIl != Long.MIN_VALUE) {
         long var7 = Math.max(0L, (tickId - this.llIIilIlIl) / 1000L);
         this.iIIIilIlIl[Math.floorMod(this.IlIIilIlIl, 2048)] = var7;
         ++this.IlIIilIlIl;
         if (var7 < this.iIlIilIlIl) {
            this.iIlIilIlIl = var7;
         }

         if (var7 > this.IllIilIlIl) {
            this.IllIilIlIl = var7;
         }

         if (var7 < 40000L) {
            ++this.lllIilIlIl;
         }
      }

      this.llIIilIlIl = tickId;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf76b') - var5) - var5) ^ var5) + var5) + var5))) + 15379) - '闬'))))) ^ 1282));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIlllIlliIll() {
      Arrays.fill(this.iIIIilIlIl, 0L);
      this.IlIIilIlIl = 0;
      this.llIIilIlIl = Long.MIN_VALUE;
      this.ilIIilIlIl = Integer.MIN_VALUE;
      this.IiIIilIlIl = this.liIIilIlIl = this.iiIIilIlIl = this.IIlIilIlIl = this.lIlIilIlIl = 0L;
      this.iIlIilIlIl = Long.MAX_VALUE;
      this.IllIilIlIl = 0L;
      this.lllIilIlIl = 0L;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] + var5))))) + 22811) ^ '\uf54c') - var5) - var5))) >>> 15 | (char)(~((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] + var5))))) + 22811) ^ '\uf54c') - var5) - var5))) << 1) - var5))))) - '賣'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IiIlliIliiIl() {
      long var9 = 7420189025009193275L;
      long[] var1 = this.liiiIIllIl();
      if (var1.length == 0) {
         return (double)0.0F;
      } else {
         long var2 = 0L;
         long[] var4 = var1;
         var9 ^= ((long)var1.length << 32 ^ var9) & -1L << 32;

         for(long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            long var7 = var4[(int)var12];
            var2 += var7;
         }

         return var2 == 0L ? (double)0.0F : (double)var1.length / ((double)var2 / (double)1000000.0F);
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + '鵨'))) ^ 31883) ^ var5) ^ '鸅') + '\uf28a'))) - '\udc17') >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + '鵨'))) ^ 31883) ^ var5) ^ '鸅') + '\uf28a'))) - '\udc17') << 4) + var5) ^ 3611));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private long[] liiiIIllIl() {
      long var3 = 1095051725881902508L;
      var3 ^= ((long)Math.min(this.IlIIilIlIl, 2048) << 32 ^ var3) & -1L << 32;
      long[] var2 = Arrays.copyOf(this.iIIIilIlIl, (int)(var3 >>> 32));
      Arrays.sort(var2);
      return var2;
   }

   public String Illlllllilll() {
      return String.format(Locale.ROOT, Iilllilliill<invokedynamic>(), this.IiIIilIlIl, this.IiIlliIliiIl(), this.IIIllIIliIIl(), this.iIlIlllllill((double)1.0F), this.iIlIlllllill((double)50.0F), this.iIlIlllllill((double)99.0F), this.IlIlllIlilIl(), this.liIIilIlIl, this.lllIilIlIl, this.iiIIilIlIl, this.IIlIilIlIl, this.lIlIilIlIl);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5) - var5))) >>> 4 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5) - var5))) << 12) ^ var5) >>> 1 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5) - var5))) >>> 4 | (char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) ^ var5) - var5))) << 12) ^ var5) << 15) ^ var5))) - '갼'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iIlIlllllill(double p) {
      long var5 = -2110223951863500022L;
      long[] var3 = this.liiiIIllIl();
      if (var3.length == 0) {
         return 0L;
      } else {
         var5 ^= ((long)((int)Math.round(p / (double)100.0F * (double)(var3.length - 1))) << 32 ^ var5) & -1L << 32;
         return var3[Math.max(0, Math.min(var3.length - 1, (int)(var5 >>> 32)))];
      }
   }

   public long IlIlllIlilIl() {
      return this.IllIilIlIl;
   }

   public long iliIiiliiiii() {
      return this.lllIilIlIl;
   }
}
