package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ilIllillIiIllill<P> {
   public final P IliiIIiill;
   public final long iiliIIiill;
   public final ilillillIiillill liliIIiill;
   public final lIIiIIiiIIiIIi IiliIIiill;
   private String iliiIIiill;
   public final long iIiiIIiill;
   public final long lIiiIIiill;
   private Iiilillliilill lliiIIiill;
   public final long IIiiIIiill;

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2109527643546413755L ^ Long.rotateLeft(-5596839696457390768L, 35) ^ 4123618652168234964L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -377148796051168723L ^ Long.rotateLeft(7242015752432242206L, 4) ^ -5188640558941157722L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2185285036165059458L ^ Long.rotateLeft(-468191157815195390L, 40) ^ -7769887262494188685L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7662448742288776166L ^ Long.rotateLeft(-5933950945236489841L, 58) ^ 4469860329087373035L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7647177524824559965L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5258361764699520832L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1331446822789417585L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 9063644410378129434L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4954133371034079459L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8476398366092095264L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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

   public void IiIlliIliiIl(Iiilillliilill next) {
      if (this.liiiIIllIl() && this.IIIllIIliIIl()) {
         if (next != Iiilillliilill.liiilIlIiiiiilIlIi && next != Iiilillliilill.IIIIiIlIilIIIiIlIi && next != Iiilillliilill.iIIIiIlIiIlIIiIlIi) {
            throw new IllegalArgumentException(IIillIiliIil<invokedynamic>() + next);
         } else if (this.lliiIIiill == Iiilillliilill.IliilIlIilliilIlIi) {
            throw new IllegalStateException(IIillIiliIil<invokedynamic>());
         } else {
            this.lliiIIiill = next;
         }
      } else {
         throw new IllegalStateException(IIillIiliIil<invokedynamic>());
      }
   }

   public boolean liiiIIllIl() {
      return this.IiliIIiill == lIIiIIiiIIiIIi.iiIIiiiliIIlIiiili || this.IiliIIiill == lIIiIIiiIIiIIi.lIlIiiiliiIlIiiili;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '쓷'))) + var5) - var5) << 4 | (char)((char)((char)(~((char)(var4[var5] + '쓷'))) + var5) - var5) >>> 12) + var5) + '隳') ^ var5) + 'ꍊ') + var5))))) - 13195))))) + 2213));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) >>> 14) << 2) + var5) + var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 8 | (char)((char)(-var4[var5]) + var5) << 8) - 317) + var5) - 3306) - 3444) - var5) >>> 14) << 2) + var5) + var5) >>> 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIIllIIliIIl() {
      return this.lliiIIiill != Iiilillliilill.llIIiIlIiilIIiIlIi && this.lliiIIiill != Iiilillliilill.IiIIiIlIiliIIiIlIi;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ '쵤'))) << 5 | (char)(~((char)(var4[var5] ^ '쵤'))) >>> 11) + '봌') >>> 1 | (char)((char)((char)(~((char)(var4[var5] ^ '쵤'))) << 5 | (char)(~((char)(var4[var5] ^ '쵤'))) >>> 11) + '봌') << 15))) - var5) + var5))) >>> 7 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)(var4[var5] ^ '쵤'))) << 5 | (char)(~((char)(var4[var5] ^ '쵤'))) >>> 11) + '봌') >>> 1 | (char)((char)((char)(~((char)(var4[var5] ^ '쵤'))) << 5 | (char)(~((char)(var4[var5] ^ '쵤'))) >>> 11) + '봌') << 15))) - var5) + var5))) << 9) ^ var5))) ^ '슕') + '홇'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private ilIllillIiIllill(ilillillIiillill type, long stand, lIIiIIiiIIiIIi owner, long proof, long move, long revision, P missionId, boolean target) {
      this.IiliIIiill = (lIIiIIiiIIiIIi)Objects.requireNonNull(owner);
      this.liliIIiill = (ilillillIiillill)Objects.requireNonNull(type);
      this.iiliIIiill = stand;
      this.IIiiIIiill = proof;
      this.lIiiIIiill = move;
      this.iIiiIIiill = revision;
      this.IliiIIiill = this.liiiIIllIl() ? Objects.requireNonNull(missionId) : missionId;
      this.lliiIIiill = target ? Iiilillliilill.IliilIlIilliilIlIi : Iiilillliilill.iliilIlIiIiiilIlIi;
   }

   public boolean Iilllilliill(long feet, long cell) {
      return this.liiiIIllIl() && this.IIIllIIliIIl() && this.IIiiIIiill == feet && this.lIiiIIiill == cell;
   }

   public static <P> ilIllillIiIllill<P> IliIlllilIi(Illillillllillil revision, long intent) {
      if (revision.liiiIIllIl()) {
         throw new IllegalArgumentException(IIillIiliIil<invokedynamic>());
      } else {
         return new ilIllillIiIllill<P>(revision.lIiiIiIlilli(), revision.iliIiiliiiii(), revision.iIlIlllllill(), 0L, revision.IlIlllIlilIl(), intent, (Object)null, true);
      }
   }

   public boolean IilliliilIIi(long feet) {
      if (!this.liiiIIllIl() && this.IIIllIIliIIl() && feet == this.lIiiIIiill) {
         this.lliiIIiill = Iiilillliilill.llIIiIlIiilIIiIlIi;
         return true;
      } else {
         return false;
      }
   }

   public Iiilillliilill lIiiIiIlilli() {
      return this.lliiIIiill;
   }

   public void Illlllllilll(String why) {
      if (why != null && !why.isBlank()) {
         if (this.IIIllIIliIIl()) {
            this.iliiIIiill = why;
            this.lliiIIiill = Iiilillliilill.IiIIiIlIiliIIiIlIi;
         }
      } else {
         throw new IllegalArgumentException(IIillIiliIil<invokedynamic>());
      }
   }

   public boolean IlIlllIlilIl(long feet) {
      if (this.IIIllIIliIIl() && feet == this.lIiiIIiill) {
         if (this.lliiIIiill == Iiilillliilill.IliilIlIilliilIlIi) {
            this.lliiIIiill = Iiilillliilill.iliilIlIiIiiilIlIi;
         }

         return true;
      } else {
         return false;
      }
   }

   public Long iIlIlllllill() {
      return this.liiiIIllIl() ? this.IIiiIIiill : null;
   }

   public String iliIiiliiiii() {
      return this.iliiIIiill;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ 22220) ^ '\uf1fe') - 22868) >>> 14 | (char)((char)((char)((char)(~var4[var5]) ^ 22220) ^ '\uf1fe') - 22868) << 2) - '믕') - var5) + '\ue4ed') - 27775))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIllillIiIllill(ilillillIiillill revision, long move, long stand, long owner, long missionId, P proof, boolean target) {
      this(revision, move, target ? lIIiIIiiIIiIIi.iiIIiiiliIIlIiiili : lIIiIIiiIIiIIi.lIlIiiiliiIlIiiili, stand, owner, missionId, proof, target);
   }

   public boolean IIlllIlliIll(long cell) {
      if (this.liiiIIllIl() && this.IIIllIIliIIl() && this.IIiiIIiill == cell) {
         this.lliiIIiill = Iiilillliilill.llIIiIlIiilIIiIlIi;
         return true;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 23921) + var5))) << 5 | (char)(-((char)((char)(var4[var5] ^ 23921) + var5))) >>> 11))) ^ var5) ^ 15670) + 18283) ^ var5) ^ var5) + var5) ^ '봎') ^ 25844) ^ 10362) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
