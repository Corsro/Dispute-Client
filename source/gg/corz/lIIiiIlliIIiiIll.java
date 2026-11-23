package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIIiiIlliIIiiIll {
   private long IiIiIiilll;
   public static final int lIIiIiilll = 512;
   private static final int iiilIiilll = 5;
   private static final IIIIIlIilIIIIlIi[] IIIiIiilll = IIIIIlIilIIIIlIi.values();
   private final long[] IlIiIiilll;
   private static final iIilIlIlIlilIlIl[] liilIiilll = iIilIlIlIlilIlIl.values();
   private final long[] iIIiIiilll;
   private final long[] llIiIiilll;
   private final LinkedHashMap<Integer, Long> ilIiIiilll;

   public void IIIllIIliIIl(int planEpoch) {
      this.ilIiIiilll.merge(planEpoch, 1L, Long::sum);

      while(this.ilIiIiilll.size() > 512) {
         Iterator var2 = this.ilIiIiilll.entrySet().iterator();
         this.IiIiIiilll += (Long)((Map.Entry)var2.next()).getValue();
         var2.remove();
      }

   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 3787) + var5) + var5) << 13 | (char)((char)((char)(var4[var5] ^ 3787) + var5) + var5) >>> 3) - '虋'))) << 11 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 3787) + var5) + var5) << 13 | (char)((char)((char)(var4[var5] ^ 3787) + var5) + var5) >>> 3) - '虋'))) >>> 5))) - var5))) ^ 19420) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) << 6) + 12201))) ^ var5) << 8 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) << 6) + 12201))) ^ var5) >>> 8) - '胕') + var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) << 6) + 12201))) ^ var5) << 8 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) >>> 10 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) << 7 | (char)(-((char)(var4[var5] ^ var5))) >>> 9) + var5) << 6) + 12201))) ^ var5) >>> 8) - '胕') + var5) >>> 10) - var5) + '켌') ^ '颩') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IiIlliIliiIl(IIIIIlIilIIIIlIi o) {
      return o == null ? 0L : this.llIiIiilll[o.ordinal()];
   }

   public void IliIlllilIi(iIilIlIlIlilIlIl b) {
      if (b == null) {
         b = iIilIlIlIlilIlIl.lliiiiilIl;
      }

      int var10002 = this.iIIiIiilll[b.ordinal()]++;
      var10002 = this.IlIiIiilll[b.ordinal()]++;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) + 20629) ^ var5) - '蝛') ^ var5) + var5))) + 12080) - var5) + 4829) ^ var5) << 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) + 20629) ^ var5) - '蝛') ^ var5) + var5))) + 12080) - var5) + 4829) ^ var5) >>> 5) >>> 3 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) + 20629) ^ var5) - '蝛') ^ var5) + var5))) + 12080) - var5) + 4829) ^ var5) << 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) + 20629) ^ var5) - '蝛') ^ var5) + var5))) + 12080) - var5) + 4829) ^ var5) >>> 5) << 13) - var5) - '\ue4e5') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIIilIIiiIIi() {
      return IIlilIliiIli(this.IlIiIiilll);
   }

   public long liiiIIllIl(iIilIlIlIlilIlIl b) {
      return b == null ? 0L : this.iIIiIiilll[b.ordinal()];
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) >>> 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) << 10) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) >>> 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) << 10) >>> 15) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) >>> 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) << 10) << 1 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) >>> 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 8117))) << 12 | (char)(~((char)(var4[var5] + 8117))) >>> 4) - '돵') - '섻') - '\uefbb') ^ var5))) << 10) + var5) << 10) >>> 15) ^ var5) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static long IlIillIiilIi(long[] c) {
      long var8 = 7097444114085927597L;
      long var1 = 0L;
      long[] var3 = c;
      var8 ^= ((long)c.length << 32 ^ var8) & -1L << 32;

      for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         var1 += var6;
      }

      return var1;
   }

   public double Illlllllilll() {
      long var8 = -6206645873756113285L;
      long var1 = this.IIlllIlliIll();
      long[] var3 = this.llIiIiilll;
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         var1 += var6;
      }

      return var1 <= 0L ? (double)0.0F : (double)this.llIiIiilll[IIIIIlIilIIIIlIi.IIIIiiiiil.ordinal()] / (double)var1;
   }

   public long lIiiIiIlilli() {
      return IiIiliIiiiIi(this.iIIiIiilll);
   }

   public void IlIlllIlilIl(int planEpoch, IIIIIlIilIIIIlIi o) {
      if (o != null) {
         Long var3 = (Long)this.ilIiIiilll.remove(planEpoch);
         if (var3 != null) {
            long[] var10000 = this.llIiIiilll;
            int var10001 = o.ordinal();
            var10000[var10001] += var3;
         }
      }
   }

   public lIIiiIlliIIiiIll() {
      this.iIIiIiilll = new long[liilIiilll.length];
      this.IlIiIiilll = new long[liilIiilll.length];
      this.llIiIiilll = new long[IIIiIiilll.length];
      this.ilIiIiilll = new LinkedHashMap();
   }

   public String Ililllililil() {
      return IIlilIliiIli(this.iIIiIiilll);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1164763483791099072L ^ Long.rotateLeft(1578273747868240136L, 10) ^ -5187704809886745178L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2838221865258592442L ^ Long.rotateLeft(-1089650571900608082L, 23) ^ 4505495001516566099L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5297469774826195367L ^ Long.rotateLeft(130906915157458168L, 6) ^ 1200208772428786240L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8456252572293720104L ^ Long.rotateLeft(-6844615719846531189L, 11) ^ 8527292402249788691L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8097144636771108646L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -152764138587889107L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6120746412217943225L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8166883716968167729L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 420531887897608476L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4142249649537173988L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilililiiili<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIiilIiiiIii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iliilliiilii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iiiiliiiiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIIllIIIl<invokedynamic>());
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

   public double iliIiiliiiii() {
      long var1 = this.IilliliilIIi();
      return var1 <= 0L ? (double)0.0F : (double)this.lIiiIiIlilli() / (double)var1;
   }

   public long IilliliilIIi() {
      return IlIillIiilIi(this.iIIiIiilll);
   }

   public void Iiilliiliiil() {
      Arrays.fill(this.IlIiIiilll, 0L);
   }

   public String IIillIiliIil() {
      return String.format(Locale.ROOT, Illillliilli<invokedynamic>(), this.Illlllllilll(), this.llIiIiilll[IIIIIlIilIIIIlIi.IIIIiiiiil.ordinal()], this.llIiIiilll[IIIIIlIilIIIIlIi.lIIIiiiiil.ordinal()], this.llIiIiilll[IIIIIlIilIIIIlIi.iIIIiiiiil.ordinal()], this.llIiIiilll[IIIIIlIilIIIIlIi.IlIIiiiiil.ordinal()], this.llIiIiilll[IIIIIlIilIIIIlIi.llIIiiiiil.ordinal()], this.IIlllIlliIll());
   }

   public long IIlllIlliIll() {
      long var1 = this.IiIiIiilll;

      for(long var4 : this.ilIiIiilll.values()) {
         var1 += var4;
      }

      return var1;
   }

   private static String IIlilIliiIli(long[] c) {
      long var1 = IlIillIiilIi(c);
      double var3 = var1 <= 0L ? (double)0.0F : (double)IiIiliIiiiIi(c) / (double)var1;
      return String.format(Locale.ROOT, Illillliilli<invokedynamic>(), var3, c[iIilIlIlIlilIlIl.illiiiilIl.ordinal()], c[iIilIlIlIlilIlIl.IiliiiilIl.ordinal()], c[iIilIlIlIlilIlIl.liliiiilIl.ordinal()], c[iIilIlIlIlilIlIl.iiliiiilIl.ordinal()], c[iIilIlIlIlilIlIl.IIiiiiilIl.ordinal()], c[iIilIlIlIlilIlIl.lIiiiiilIl.ordinal()], c[iIilIlIlIlilIlIl.iIiiiiilIl.ordinal()], c[iIilIlIlIlilIlIl.IliiiiilIl.ordinal()], c[iIilIlIlIlilIlIl.lliiiiilIl.ordinal()], var1);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) << 8) + var5) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) << 8) + var5) + var5) << 8) - 'ꚜ') + var5) + '뉜') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) << 8) + var5) + var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) << 13 | (char)((char)((char)((char)((char)(var4[var5] ^ 3511) - var5) ^ var5) - 30938) - var5) >>> 3) ^ 18806) << 8) + var5) + var5) << 8) - 'ꚜ') + var5) + '뉜') << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iIlIlllllill(iIilIlIlIlilIlIl b) {
      return b == null ? 0L : this.IlIiIiilll[b.ordinal()];
   }

   public void Iilllilliill() {
      this.ilIiIiilll.clear();
      Arrays.fill(this.llIiIiilll, 0L);
      this.IiIiIiilll = 0L;
   }

   private static long IiIiliIiiiIi(long[] c) {
      long var4 = 6230273460812978977L;
      long var1 = 0L;

      for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 5; var6 += 4294967296L) {
         var1 += c[(int)(var6 >>> 32)];
      }

      return var1;
   }
}
