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

public record ilIiliilIiIiliil(boolean on, boolean deep, boolean behind, boolean ref, boolean bare) {
   private final boolean iIIlIIIiil;
   private final boolean IlIlIIIiil;
   public static final float lillIIIiil = 0.7F;
   public static final float lIllIIIiil = 4.0F;
   public static final float iIilIIIiil = 1.0F;
   public static final float iIllIIIiil = 1.0F;
   private final boolean llIlIIIiil;
   public static final float llllIIIiil = 3.0F;
   private final boolean lIIlIIIiil;
   public static final float iillIIIiil = 2.0F;
   public static final float llilIIIiil = 1.0F;
   private final boolean ilIlIIIiil;
   public static final float IlllIIIiil = 0.25F;
   public static final float IillIIIiil = 0.25F;
   public static final int IIllIIIiil = 2;
   public static final float lIilIIIiil = 6.0F;
   public static final float IlilIIIiil = 2.0F;
   public static final float IIilIIIiil = 1.0F;
   public static final ilIiliilIiIiliil IiIlIIIiil = new ilIiliilIiIiliil(false, false);
   public static final float illlIIIiil = 0.5F;
   public static final int liIlIIIiil = 2;
   public static final int iiIlIIIiil = 5;

   public float IIlilIliiIli(float base) {
      return this.lIIlIIIiil ? Math.min(base, 0.5F) : base;
   }

   public boolean IIlllIlliIll(float full, boolean dealt, float popsTarget, float cost, boolean deny) {
      if (this.llIlIIIiil && !dealt) {
         if (deny && this.IiIlliIliiIl(popsTarget, cost)) {
            return true;
         } else {
            float var6 = this.IlIlllIlilIl(popsTarget, cost);
            return Float.isFinite(full) && Float.isFinite(var6) && full >= var6;
         }
      } else {
         return true;
      }
   }

   public static ilIiliilIiIiliil IliIlllilIi(boolean terminator, boolean totems, int totemConfirmed, float ehp) {
      return liiiIIllIl(terminator, totems, totemConfirmed, ehp, false);
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) - '飯') << 15 | (char)((char)(-var4[var5]) - '飯') >>> 1))) ^ 11959) ^ var5) ^ var5) - '镎') + 21723) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) - '飯') << 15 | (char)((char)(-var4[var5]) - '飯') >>> 1))) ^ 11959) ^ var5) ^ var5) - '镎') + 21723) ^ var5) >>> 5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) - '飯') << 15 | (char)((char)(-var4[var5]) - '飯') >>> 1))) ^ 11959) ^ var5) ^ var5) - '镎') + 21723) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) - '飯') << 15 | (char)((char)(-var4[var5]) - '飯') >>> 1))) ^ 11959) ^ var5) ^ var5) - '镎') + 21723) ^ var5) >>> 5) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIiliilIiIiliil(boolean bare, boolean behind, boolean on, boolean ref, boolean deep) {
      this.lIIlIIIiil = bare;
      this.iIIlIIIiil = behind;
      this.IlIlIIIiil = on;
      this.llIlIIIiil = ref;
      this.ilIlIIIiil = deep;
   }

   public boolean IIIllIIliIIl(boolean kills, boolean pops) {
      return this.llIlIIIiil && this.iIIlIIIiil && !this.ilIlIIIiil && (kills || pops && !this.IlIlIIIiil);
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) >>> 13) << 8 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) >>> 13) >>> 8) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) >>> 13) << 8 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - var5) - var5) + var5) ^ var5) >>> 13) >>> 8) << 14) + '鬸') - var5) + var5) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double IIiilIiiiIii(double up, double dist) {
      return Double.isFinite(up) && Double.isFinite(dist) && dist > 1.0E-6 ? Math.max((double)0.0F, Math.min((double)1.0F, up / dist)) : (double)0.0F;
   }

   public boolean IlIillIiilIi(float knock, float selfEhp, boolean cost, float full, float popsTarget, float dealt) {
      return this.IiIiliIiiiIi(knock, selfEhp, cost, Float.NaN, full, popsTarget, dealt);
   }

   public ilIiliilIiIiliil(boolean on, boolean behind, boolean deep) {
      this(on, behind, deep, false, false);
   }

   public static boolean Iilllilliill(float targetEhp) {
      return Float.isFinite(targetEhp) && targetEhp > 0.0F && targetEhp <= 6.0F;
   }

   public boolean IiIiliIiiiIi(float knock, float full, boolean targetEhp, float dealt, float popsTarget, float selfEhp, float cost) {
      if (!this.Ililllililil(knock, full, targetEhp)) {
         return false;
      } else if (Float.isFinite(popsTarget) && Float.isFinite(selfEhp) && Float.isFinite(cost)) {
         if (this.llIlIIIiil) {
            return this.lIiiIiIlilli(Math.max(popsTarget, selfEhp), cost, false);
         } else if (Illlllllilll(Math.max(popsTarget, selfEhp), cost)) {
            return this.IIIilIIiiIIi(knock, targetEhp, dealt);
         } else {
            return this.Iiilliiliiil(popsTarget, selfEhp, cost) && IIillIiliIil(knock, full, targetEhp, selfEhp);
         }
      } else {
         return false;
      }
   }

   public boolean iiIIlIIlIl() {
      return this.llIlIIIiil;
   }

   public float Iilililiiili(float lift, float selfKnock, double knock) {
      if (!this.lIIlIIIiil) {
         return 0.0F;
      } else {
         float var5 = Float.isFinite(lift) ? Math.max(0.0F, Math.min(1.0F, lift)) : 0.0F;
         return Float.isFinite(selfKnock) && Double.isFinite(knock) ? var5 - Math.max(0.0F, Math.min(1.0F, selfKnock)) * (float)Math.max((double)0.0F, Math.min((double)1.0F, knock)) : var5;
      }
   }

   public float Illillliilli(float knock) {
      return this.lIIlIIIiil && Float.isFinite(knock) ? 3.0F * Math.max(-1.0F, Math.min(1.0F, knock)) : 0.0F;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) >>> 14 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) << 2) + var5) - var5) ^ '茙') ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) >>> 14 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) << 2) + var5) - var5) ^ '茙') ^ var5) << 2) - 21445))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) >>> 14 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) << 2) + var5) - var5) ^ '茙') ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) >>> 14 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ 'Ꚍ') ^ var5) << 2) + var5) - var5) ^ '茙') ^ var5) << 2) - 21445))) >>> 13))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float IlIlllIlilIl(float cost, float full) {
      return this.llIlIIIiil && !this.ilIlIIIiil && Float.isFinite(full) ? Math.min(cost, Math.max(0.0F, full)) : cost;
   }

   public static boolean Illlllllilll(float full, float ehp) {
      return full > 0.0F && Float.isFinite(ehp) && full >= ehp - 1.0F;
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ 21144) - 30955) ^ '뺂'))) ^ var5))) + '툍') + var5) ^ 'ꧩ') + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static ilIiliilIiIiliil iIlIlllllill(boolean ehp, boolean terminator, int behind, float popPending, boolean totems, boolean totemConfirmed) {
      return ehp && terminator && !totems && behind >= 1 && popPending > 0.0F && Float.isFinite(popPending) ? new ilIiliilIiIiliil(true, behind >= 2, totemConfirmed) : IiIlIIIiil;
   }

   public boolean lIlIliIlIl() {
      return this.ilIlIIIiil;
   }

   public double Iliilliiilii(double value) {
      return this.lIIlIIIiil && Double.isFinite(value) ? Math.max(value, (double)0.25F) : value;
   }

   public boolean llIIlilIIl() {
      return this.iIIlIIIiil;
   }

   public boolean IiIlliIliiIl(float full, float cost) {
      return this.llIlIIIiil && !this.ilIlIIIiil && Float.isFinite(full) && full - this.IlIlllIlilIl(full, cost) >= 1.0F;
   }

   public boolean iliIiiliiiii(boolean kills) {
      return this.IIIllIIliIIl(kills, false);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6535100423926873684L ^ Long.rotateLeft(8764130207773981634L, 24) ^ -238289067762720741L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5123885394374517881L ^ Long.rotateLeft(-5333281058278814868L, 4) ^ -713643288928430480L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2160808740441820205L ^ Long.rotateLeft(7285176364833542018L, 1) ^ 6791032897556869670L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9120041484273499621L ^ Long.rotateLeft(-378165471286904025L, 6) ^ -2495539262114464952L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1360472084618150194L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3549635181371033548L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4191482936524442027L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 192426826991248573L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5958759626946680980L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2472172534812444852L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(illIlIilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lilIliilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiIllIiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iIiIlIliIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lliIliliIl<invokedynamic>());
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

   public ilIiliilIiIiliil(boolean on, boolean deep) {
      this(on, deep, false);
   }

   public String IIIIllIIIl() {
      return this.lIIlIIIiil ? (this.llIlIIIiil ? (this.iIIlIIIiil ? IllIllllIl<invokedynamic>() : (this.ilIlIIIiil ? IllIllllIl<invokedynamic>() : IllIllllIl<invokedynamic>())) : (this.iIIlIIIiil ? IllIllllIl<invokedynamic>() : IllIllllIl<invokedynamic>())) : IllIllllIl<invokedynamic>();
   }

   public boolean IiIIlliIIl() {
      return this.IlIlIIIiil;
   }

   public boolean Iiilliiliiil(float cost, float full, float selfEhp) {
      if (this.lIIlIIIiil && Float.isFinite(cost) && Float.isFinite(full) && Float.isFinite(selfEhp)) {
         if (this.llIlIIIiil) {
            return this.lIiiIiIlilli(Math.max(cost, full), selfEhp, false);
         } else if (Illlllllilll(Math.max(cost, full), selfEhp)) {
            return false;
         } else if (this.iIIlIIIiil) {
            return true;
         } else {
            return Math.max(cost, full) <= selfEhp - 4.0F;
         }
      } else {
         return false;
      }
   }

   public static ilIiliilIiIiliil IilliliilIIi(boolean totems, int behind, float ehp, boolean totemReady) {
      return ehp > 0.0F && Float.isFinite(ehp) ? new ilIiliilIiIiliil(true, totems && behind >= 2, totemReady, true, !totems) : IiIlIIIiil;
   }

   public static ilIiliilIiIiliil liiiIIllIl(boolean ehp, boolean terminator, int popPending, float totemConfirmed, boolean totems) {
      return iIlIlllllill(ehp, terminator, popPending, totemConfirmed, totems, false);
   }

   public boolean IIIilIIiiIIi(float targetEhp, boolean popsTarget, float dealt) {
      if (this.lIIlIIIiil && this.iIIlIIIiil && popsTarget) {
         return !Float.isFinite(dealt) || Float.isFinite(targetEhp) && targetEhp >= dealt + 1.0F;
      } else {
         return false;
      }
   }

   public float Iiiiliiiiiii() {
      return this.lIIlIIIiil ? 3.0F : 0.0F;
   }

   public boolean iIIIlIlIIl() {
      return this.lIIlIIIiil;
   }

   public boolean Ililllililil(float popsTarget, float knock, boolean dealt) {
      if (!this.lIIlIIIiil) {
         return false;
      } else {
         return dealt || Float.isFinite(popsTarget) && popsTarget >= 1.0F || Float.isFinite(knock) && knock >= 0.25F;
      }
   }

   public boolean lIiiIiIlilli(float selfEhp, float full, boolean lethalOk) {
      if (Float.isFinite(selfEhp) && Float.isFinite(full)) {
         if (selfEhp > 0.0F && !(selfEhp < full - (this.ilIlIIIiil ? 2.0F : 1.0F))) {
            return !this.ilIlIIIiil && lethalOk;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) << 14 | (char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) >>> 2))) + '킝') + var5) - var5)) ^ 7687) + var5) << 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) << 14 | (char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) >>> 2))) + '킝') + var5) - var5)) ^ 7687) + var5) >>> 10) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) << 14 | (char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) >>> 2))) + '킝') + var5) - var5)) ^ 7687) + var5) << 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) << 14 | (char)((char)((char)(var4[var5] ^ '\udbb2') ^ var5) ^ var5) >>> 2))) + '킝') + var5) - var5)) ^ 7687) + var5) >>> 10) >>> 14) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIillIiliIil(float cost, float knock, boolean dealt, float popsTarget) {
      if (!Float.isFinite(popsTarget)) {
         return false;
      } else {
         float var4 = Math.max(0.0F, popsTarget);
         if (dealt) {
            return true;
         } else if (Float.isFinite(cost) && cost >= 1.0F) {
            return var4 <= 2.0F || var4 <= 0.7F * cost;
         } else {
            return Float.isFinite(knock) && knock >= 0.25F && var4 <= 1.0F;
         }
      }
   }
}
