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
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class illIllIlIilIllIl {
   private final long[] liiiilIiIl;
   private final int[] lIIIIiIiIl;
   private final long[] IiiiilIiIl;
   private final long[][] IIIIIiIiIl;
   private static final int lliiilIiIl = IIIIiIllIIIiIl.values().length;
   private final long[] iIIIIiIiIl;
   private final long[] iiiiilIiIl;
   private static final int IliiilIiIl = liilIiliiilIil.values().length;
   private static final int iliiilIiIl = 256;

   public void IIlllIlliIll() {
      long var5 = -7763096006674334241L;
      Arrays.fill(this.IiiiilIiIl, 0L);
      Arrays.fill(this.liiiilIiIl, 0L);
      Arrays.fill(this.iiiiilIiIl, 0L);
      Arrays.fill(this.lIIIIiIiIl, 0);
      Arrays.fill(this.iIIIIiIiIl, 0L);
      long[][] var1 = this.IIIIIiIiIl;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         long[] var4 = var1[(int)var8];
         Arrays.fill(var4, 0L);
      }

   }

   public void IilliliilIIi(IIIIiIllIIIiIl c) {
      int var10002 = this.iIIIIiIiIl[c.ordinal()]++;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1))))) ^ var5) << 14 | (char)((char)(-((char)(~((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1))))) ^ var5) >>> 2) ^ '됓'))) ^ '龙') ^ var5) - var5))) + var5) ^ var5) ^ 11458) - '喝') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public List<String> IIillIiliIil() {
      long var9 = -4899918509550121709L;
      long var11 = -8373109388757153968L;
      ArrayList var1 = new ArrayList();
      Integer[] var2 = new Integer[IliiilIiIl];

      for(var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < IliiilIiIl; var9 += 4294967296L) {
         var2[(int)(var9 >>> 32)] = (int)(var9 >>> 32);
      }

      Arrays.sort(var2, (b, a) -> Long.compare(this.liiiilIiIl[a], this.liiiilIiIl[b]));
      Integer[] var3 = var2;
      var9 ^= ((long)var2.length ^ var9) & -1L >>> 32;

      for(var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < (int)var9; var11 += 4294967296L) {
         var11 ^= ((long)var3[(int)(var11 >>> 32)] ^ var11) & -1L >>> 32;
         if (this.IiiiilIiIl[(int)var11] != 0L) {
            long var7 = this.liiiilIiIl[(int)var11] / this.IiiiilIiIl[(int)var11];
            var1.add(String.format(Locale.ROOT, Iiilliiliiil<invokedynamic>(), liilIiliiilIil.values()[(int)var11], this.IiiiilIiIl[(int)var11], this.liiiilIiIl[(int)var11] / 1000000L, Iilllilliill(var7), Iilllilliill(this.Illlllllilll((int)var11, (double)0.5F)), Iilllilliill(this.Illlllllilll((int)var11, 0.95)), Iilllilliill(this.Illlllllilll((int)var11, 0.99)), Iilllilliill(this.iiiiilIiIl[(int)var11])));
         }
      }

      StringBuilder var13 = new StringBuilder(Iiilliiliiil<invokedynamic>());
      IIIIiIllIIIiIl[] var4 = IIIIiIllIIIiIl.values();
      var11 ^= ((long)var4.length << 32 ^ var11) & -1L << 32;

      for(long var20 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var20 < (int)(var20 >>> 32); var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         IIIIiIllIIIiIl var14 = var4[(int)var20];
         if (this.iIIIIiIiIl[var14.ordinal()] != 0L) {
            var13.append(' ').append(var14).append('=').append(this.iIIIIiIiIl[var14.ordinal()]);
         }
      }

      if (var13.length() > 4) {
         var1.add(var13.toString());
      }

      return var1;
   }

   public illIllIlIilIllIl() {
      this.IiiiilIiIl = new long[IliiilIiIl];
      this.liiiilIiIl = new long[IliiilIiIl];
      this.iiiiilIiIl = new long[IliiilIiIl];
      this.IIIIIiIiIl = new long[IliiilIiIl][256];
      this.lIIIIiIiIl = new int[IliiilIiIl];
      this.iIIIIiIiIl = new long[lliiilIiIl];
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') >>> 12 | (char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') << 4) << 10 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') >>> 12 | (char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') << 4) >>> 6) - 'ꐼ') + var5) - var5))) - var5) + var5))) + 26525) - '벿') >>> 15 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') >>> 12 | (char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') << 4) << 10 | (char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') >>> 12 | (char)((char)(var4[var5] << 4 | var4[var5] >>> 12) ^ '셗') << 4) >>> 6) - 'ꐼ') + var5) - var5))) - var5) + var5))) + 26525) - '벿') << 1))) ^ '\udd27') ^ '뎹'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(IIIIiIllIIIiIl c, long n) {
      long[] var10000 = this.iIIIIiIiIl;
      int var10001 = c.ordinal();
      var10000[var10001] += n;
   }

   public long IliIlllilIi() {
      return System.nanoTime();
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 6 | (char)((char)(var4[var5] + var5) - var5) << 10) - '\ue2ca') + 7515))) ^ var5) >>> 11 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) >>> 6 | (char)((char)(var4[var5] + var5) - var5) << 10) - '\ue2ca') + 7515))) ^ var5) << 5) + var5) - var5) ^ 17928) - '\uf6b7') ^ var5) - 16982))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long lIiiIiIlilli(liilIiliiilIil p) {
      return this.IiiiilIiIl[p.ordinal()];
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) >>> 7) >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) >>> 7) << 11) - 13854) ^ var5))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) >>> 7) >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) << 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) + var5) - '뛻') ^ 10494) + 30002) - var5) >>> 3) + 17544) - var5))) ^ var5) >>> 7) << 11) - 13854) ^ var5))) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String Iilllilliill(long ns) {
      return ns >= 1000000L ? ns / 1000000L + Iiilliiliiil<invokedynamic>() : String.format(Locale.ROOT, Iiilliiliiil<invokedynamic>(), (double)ns / (double)1000000.0F);
   }

   public long IIIllIIliIIl(liilIiliiilIil p) {
      return this.iiiiilIiIl[p.ordinal()] / 1000000L;
   }

   private long Illlllllilll(int phase, double p) {
      long var6 = -2687137956739549651L;
      var6 ^= ((long)Math.min(this.lIIIIiIiIl[phase], 256) << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) == 0) {
         return 0L;
      } else {
         long[] var5 = Arrays.copyOf(this.IIIIIiIiIl[phase], (int)(var6 >>> 32));
         Arrays.sort(var5);
         return var5[Math.min((int)(var6 >>> 32) - 1, (int)Math.floor(p * (double)((int)(var6 >>> 32))))];
      }
   }

   public void liiiIIllIl(liilIiliiilIil token, long phase) {
      long var7 = 8029425880322866131L;
      long var4 = System.nanoTime() - phase;
      var7 ^= ((long)token.ordinal() << 32 ^ var7) & -1L << 32;
      int var10002 = this.IiiiilIiIl[(int)(var7 >>> 32)]++;
      long[] var10000 = this.liiiilIiIl;
      var10000[(int)(var7 >>> 32)] += var4;
      if (var4 > this.iiiiilIiIl[(int)(var7 >>> 32)]) {
         this.iiiiilIiIl[(int)(var7 >>> 32)] = var4;
      }

      var10000 = this.IIIIIiIiIl[(int)(var7 >>> 32)];
      int[] var10001 = this.lIIIIiIiIl;
      var10002 = (int)(var7 >>> 32);
      int var10004 = var10001[(int)(var7 >>> 32)];
      var10001[var10002] = var10001[(int)(var7 >>> 32)] + 1;
      var10000[var10004 & 255] = var4;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -743193728898505145L ^ Long.rotateLeft(-7367874078092008953L, 47) ^ 5655847367190214826L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 458579803925500920L ^ Long.rotateLeft(-1052643973178702264L, 28) ^ -5150194941352578338L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5747405330685075884L ^ Long.rotateLeft(6174919128323074786L, 5) ^ 849147796487967164L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5507571500475861123L ^ Long.rotateLeft(3525071965015130113L, 8) ^ -9222900647469514263L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8996954462446672528L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8563537232062606097L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2239116399513958440L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5886292290675206294L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8008730319642114693L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8185586160677155629L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIilIIiiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '阨') - '飤') << 14 | (char)((char)(var4[var5] - '阨') - '飤') >>> 2) + var5) + '뉲') ^ var5))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '阨') - '飤') << 14 | (char)((char)(var4[var5] - '阨') - '飤') >>> 2) + var5) + '뉲') ^ var5))) >>> 13) + '鿰') ^ '蝰') - '\uf2cc') - var5) - '쁏') ^ var5) ^ 3934) + 635) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iliIiiliiiii(liilIiliiilIil p) {
      return this.liiiilIiIl[p.ordinal()] / 1000000L;
   }

   public long IlIlllIlilIl(liilIiliiilIil q, double p) {
      return this.Illlllllilll(q.ordinal(), p) / 1000000L;
   }

   public long IiIlliIliiIl(IIIIiIllIIIiIl c) {
      return this.iIIIIiIiIl[c.ordinal()];
   }
}
