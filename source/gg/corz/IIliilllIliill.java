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

public final class IIliilllIliill {
   private int IIIlIllIilIIlIllIi;
   private int iiIlIllIiIIllIllIi;
   private int lIllIllIiiIllIllIi;
   private long IliIIllIilliIIllIi = -1L;
   private int IlllIllIillllIllIi;
   public static final long IilIIllIililIIllIi = 500000000L;
   private long iiilIllIiIIIiIllIi = -1L;
   private int liIiIllIiiiIiIllIi;
   public static final long lllIIllIiillIIllIi = 250000000L;
   private boolean IlIiIllIillIiIllIi;
   private boolean iIIlIllIiIlIlIllIi;
   public static final long lIiIIllIiiIiIIllIi = 500000000L;
   private long liiIIllIiiiiIIllIi = -1L;
   private long iIilIllIiIlilIllIi = -1L;
   private long illlIllIiIillIllIi;
   private long IIilIllIilIilIllIi;
   private int IiIlIllIiliIlIllIi;
   private long IiilIllIiliilIllIi = -1L;
   public static final long iIlIIllIiIllIIllIi = 40000000L;
   public static final long iilIIllIiIIiIIllIi = 500000000L;
   private long llIlIllIiilIlIllIi;
   private long lIIiIllIiiIIiIllIi = -1L;
   private long iliIIllIiIiiIIllIi = -1L;
   private long llilIllIiililIllIi = -1L;
   private int ilIiIllIiIiIiIllIi;
   private long lillIllIiiillIllIi;

   public boolean lIiiIiIlilli(long minIntervalNanos, long nowNanos) {
      if (this.llilIllIiililIllIi >= 0L && minIntervalNanos - this.llilIllIiililIllIi < nowNanos) {
         return false;
      } else {
         this.llilIllIiililIllIi = minIntervalNanos;
         return true;
      }
   }

   public boolean IiIlliIliiIl() {
      return this.iIIlIllIiIlIlIllIi;
   }

   public int Illlllllilll() {
      return this.liIiIllIiiiIiIllIi;
   }

   public boolean IIlllIlliIll() {
      return this.llIlIllIiilIlIllIi >= 0L && (this.llIlIllIiilIlIllIi < 40000000L || this.iIIlIllIiIlIlIllIi);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) << 12))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) << 12))) << 3) >>> 12 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) << 12))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) + var5) - 11773))) + var5)) + 7772) >>> 3) - var5) + 3680) >>> 4) << 12))) << 3) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IlIillIiilIi() {
      return this.liiIIllIiiiiIIllIi;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 8945))) ^ '\ud922') - var5) - 25847) + var5) >>> 14 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + 8945))) ^ '\ud922') - var5) - 25847) + var5) << 2) ^ 5901) ^ 23924))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 8945))) ^ '\ud922') - var5) - 25847) + var5) >>> 14 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + 8945))) ^ '\ud922') - var5) - 25847) + var5) << 2) ^ 5901) ^ 23924))) << 3) + var5) - 8765) + var5))) + var5))) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)var4[var5])) - var5))))) << 3 | (char)(~((char)(-((char)((char)(~((char)var4[var5])) - var5))))) >>> 13) - '蒊') + var5) - 32303))) - var5) >>> 10 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)var4[var5])) - var5))))) << 3 | (char)(~((char)(-((char)((char)(~((char)var4[var5])) - var5))))) >>> 13) - '蒊') + var5) - 32303))) - var5) << 6) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill() {
      ++this.lIllIllIiiIllIllIi;
      ++this.IlllIllIillllIllIi;
   }

   public String IiIiliIiiiIi(int serverCorrectionAge, int serverCorrectionDistance, int clientMovePacketsThisTick, double autoMovePacketsThisTick) {
      return String.format(Locale.ROOT, IIiilIiiiIii<invokedynamic>(), this.IIIlIllIilIIlIllIi, this.Ililllililil(), serverCorrectionAge, serverCorrectionDistance, this.iIIlIllIiIlIlIllIi, this.IIlllIlliIll(), this.liIiIllIiiiIiIllIi, this.IIillIiliIil(), clientMovePacketsThisTick, autoMovePacketsThisTick);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) - var5) - var5))))) ^ 31336) + 19305)) >>> 5 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) - var5) - var5))))) ^ 31336) + 19305)) << 11) >>> 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) - var5) - var5))))) ^ 31336) + 19305)) >>> 5 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) - var5) - var5))))) ^ 31336) + 19305)) << 11) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(long framesSinceLastTick, int nowNanos) {
      ++this.IIIlIllIilIIlIllIi;
      ++this.ilIiIllIiIiIiIllIi;
      this.llIlIllIiilIlIllIi = this.IliIIllIilliIIllIi < 0L ? -1L : framesSinceLastTick - this.IliIIllIilliIIllIi;
      this.iIIlIllIiIlIlIllIi = this.IliIIllIilliIIllIi >= 0L && nowNanos == 0 && (this.llIlIllIiilIlIllIi < 40000000L || this.iIIlIllIiIlIlIllIi);
      if (this.iIIlIllIiIlIlIllIi) {
         ++this.IiIlIllIiliIlIllIi;
         ++this.iiIlIllIiIIllIllIi;
      }

      this.liIiIllIiiiIiIllIi = this.IIlllIlliIll() ? this.liIiIllIiiiIiIllIi + 1 : 0;
      this.IliIIllIilliIIllIi = this.iliIIllIiIiiIIllIi = framesSinceLastTick;
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) << 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) >>> 3))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) << 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) >>> 3))) >>> 9))) ^ var5) - '\ue95b') + var5) << 2 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) << 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) >>> 3))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) << 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) >>> 4 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) << 8 | (char)((char)((char)(~((char)(var4[var5] + 'ퟧ'))) ^ var5) - 27871) >>> 8) - 4269))) << 14) ^ 29538) >>> 8) << 12) >>> 3))) >>> 9))) ^ var5) - '\ue95b') + var5) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iiilliiliiil() {
      return this.IiIlIllIiliIlIllIi;
   }

   public boolean IIIllIIliIIl(long nowNanos) {
      if (this.iiilIllIiIIIiIllIi >= 0L && nowNanos - this.iiilIllIiIIIiIllIi < 500000000L) {
         return false;
      } else {
         this.iiilIllIiIIIiIllIi = nowNanos;
         return true;
      }
   }

   public void Iilililiiili() {
      this.IliIIllIilliIIllIi = this.iliIIllIiIiiIIllIi = this.liiIIllIiiiiIIllIi = -1L;
      this.IIIlIllIilIIlIllIi = 0;
      this.iIIlIllIiIlIlIllIi = false;
      this.llIlIllIiilIlIllIi = -1L;
      this.IiIlIllIiliIlIllIi = this.iiIlIllIiIIllIllIi = this.lIllIllIiiIllIllIi = this.IlllIllIillllIllIi = this.ilIiIllIiIiIiIllIi = this.liIiIllIiiiIiIllIi = 0;
      this.illlIllIiIillIllIi = this.lillIllIiiillIllIi = this.IIilIllIilIilIllIi = 0L;
      this.iIilIllIiIlilIllIi = this.llilIllIiililIllIi = this.IiilIllIiliilIllIi = this.iiilIllIiIIIiIllIi = this.lIIiIllIiiIIiIllIi = -1L;
      this.IlIiIllIillIiIllIi = false;
   }

   public String IIlilIliiIli(int movementStepsThisTick, int routeState, int autoMovementPacketsThisTick, String clientMovePacketsThisTick) {
      return String.format(Locale.ROOT, IIiilIiiiIii<invokedynamic>(), this.IIIlIllIilIIlIllIi, this.IIillIiliIil(), movementStepsThisTick, routeState, autoMovementPacketsThisTick, clientMovePacketsThisTick, this.IiIlIllIiliIlIllIi, this.iIIlIllIiIlIlIllIi, this.Ililllililil());
   }

   public boolean iliIiiliiiii(long nowNanos) {
      if (this.IiilIllIiliilIllIi >= 0L && nowNanos - this.IiilIllIiliilIllIi < 500000000L) {
         return false;
      } else {
         this.IiilIllIiliilIllIi = nowNanos;
         return true;
      }
   }

   public int IIIilIIiiIIi() {
      return this.lIllIllIiiIllIllIi;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6600394846614306890L ^ Long.rotateLeft(-4762537297922644684L, 4) ^ -3154135494719039311L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2236879863545973390L ^ Long.rotateLeft(1971468230526493366L, 38) ^ -9135948483225630486L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2030441642485311860L ^ Long.rotateLeft(-78834051647663661L, 34) ^ -7196505988543741425L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -800496137027236175L ^ Long.rotateLeft(3751224298818976193L, 33) ^ 1391799990378067642L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7662588640498159025L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3798934908450841912L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4327484786148813631L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7880631881675641803L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4531794468838836573L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7094535149623061717L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iliilliiilii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiiiliiiiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIIllIIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iIIIlIlIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIIlilIIl<invokedynamic>());
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

   public boolean IlIlllIlilIl(long nowNanos) {
      if (this.lIIiIllIiiIIiIllIi >= 0L && nowNanos - this.lIIiIllIiiIIiIllIi < 500000000L) {
         return false;
      } else {
         this.lIIiIllIiiIIiIllIi = nowNanos;
         return true;
      }
   }

   public void liiiIIllIl(long nowNanos) {
      this.illlIllIiIillIllIi = Math.max(0L, nowNanos - this.iliIIllIiIiiIIllIi);
      this.lillIllIiiillIllIi += this.illlIllIiIillIllIi;
      this.IIilIllIilIilIllIi = Math.max(this.IIilIllIilIilIllIi, this.illlIllIiIillIllIi);
      this.liiIIllIiiiiIIllIi = nowNanos;
      if (this.IlIiIllIillIiIllIi) {
         this.iIilIllIiIlilIllIi = nowNanos;
         this.IlIiIllIillIiIllIi = false;
      }

   }

   public long IIillIiliIil() {
      return this.illlIllIiIillIllIi / 1000000L;
   }

   public String Illillliilli() {
      String var1 = String.format(Locale.ROOT, IIiilIiiiIii<invokedynamic>(), this.ilIiIllIiIiIiIllIi, this.iiIlIllIiIIllIllIi, this.IlllIllIillllIllIi, this.ilIiIllIiIiIiIllIi == 0 ? (double)0.0F : (double)this.lillIllIiiillIllIi / (double)1000000.0F / (double)this.ilIiIllIiIiIiIllIi, this.IIilIllIilIilIllIi / 1000000L, this.IiIlIllIiliIlIllIi, this.lIllIllIiiIllIllIi);
      this.ilIiIllIiIiIiIllIi = this.iiIlIllIiIIllIllIi = this.IlllIllIillllIllIi = 0;
      this.lillIllIiiillIllIi = this.IIilIllIilIilIllIi = 0L;
      return var1;
   }

   public long Ililllililil() {
      return this.llIlIllIiilIlIllIi < 0L ? -1L : this.llIlIllIiilIlIllIi / 1000000L;
   }

   public boolean IilliliilIIi(long nowNanos) {
      if (this.IlIiIllIillIiIllIi) {
         return false;
      } else if (this.iIilIllIiIlilIllIi >= 0L && nowNanos - this.iIilIllIiIlilIllIi < 250000000L) {
         return false;
      } else {
         this.IlIiIllIillIiIllIi = true;
         return true;
      }
   }

   public int Iilllilliill() {
      return this.IIIlIllIilIIlIllIi;
   }
}
