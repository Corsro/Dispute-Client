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

public final class IIiliIilIiliIi {
   public static final int iIlililiiIllililii = 3;
   private int liiililiiiiiililii;
   public static final double Iilililiililililii = (double)2.0F;
   private int iliililiiIiiililii;
   public static final int ilIililiiIiIililii = 40;
   public static final int IIlililiilIlililii = 12;
   public static final int iilililiiIIiililii = 20;
   private int IIIIiiliilIIIiilii;
   private int llIIiiliiilIIiilii;
   public static final int liIililiiiiIililii = 10;
   private int iIIIiiliiIlIIiilii;
   private iIliIiIiIlliIiIi lIiililiiiIiililii;
   public static final int lllililiiillililii = 8;
   private int Iliililiilliililii;

   private IlllIIillllIIi Illillliilli(iIliIiIiIlliIiIi to, iIliIiIiIlliIiIi before, String reason) {
      this.lIiililiiiIiililii = before;
      this.Iliililiilliililii = 0;
      this.IIIIiiliilIIIiilii = 0;
      this.iIIIiiliiIlIIiilii = 0;
      this.llIIiiliiilIIiilii = 0;
      return new IlllIIillllIIi(before, to, false, false, reason);
   }

   public int IIIllIIliIIl() {
      return this.liiililiiiiiililii;
   }

   public IlllIIillllIIi liiiIIllIl(iIliIiIiIlliIiIi proposed) {
      iIliIiIiIlliIiIi var2 = this.lIiililiiiIiililii;
      if (this.lIiililiiiIiililii == iIliIiIiIlliIiIi.lllIiIiIIi && proposed != null && proposed != iIliIiIiIlliIiIi.lllIiIiIIi) {
         this.lIiililiiiIiililii = proposed;
         this.Iliililiilliililii = 0;
         this.iliililiiIiiililii = 0;
         this.liiililiiiiiililii = 0;
         this.IIIIiiliilIIIiilii = 0;
         this.iIIIiiliiIlIIiilii = 0;
         this.llIIiiliiilIIiilii = 0;
         return new IlllIIillllIIi(this.lIiililiiiIiililii, var2, true, false, Iliilliiilii<invokedynamic>());
      } else {
         return new IlllIIillllIIi(this.lIiililiiiIiililii, var2, false, false, (String)null);
      }
   }

   private IlllIIillllIIi Iilililiiili(iIliIiIiIlliIiIi before, String reason) {
      return new IlllIIillllIIi(this.lIiililiiiIiililii, before, false, false, reason);
   }

   public void IiIlliIliiIl() {
      this.lIiililiiiIiililii = iIliIiIiIlliIiIi.lllIiIiIIi;
      this.Iliililiilliililii = 0;
      this.iliililiiIiiililii = 0;
      this.liiililiiiiiililii = 0;
      this.IIIIiiliilIIIiilii = 0;
      this.iIIIiiliiIlIIiilii = 0;
      this.llIIiiliiilIIiilii = 0;
   }

   public iIliIiIiIlliIiIi IilliliilIIi() {
      return this.lIiililiiiIiililii;
   }

   public int IlIlllIlilIl() {
      return this.llIIiiliiilIIiilii;
   }

   private static boolean IiIiliIiiiIi(lIllIIlliIllIIll in) {
      return in.IlIlllIlilIl() && !in.IIIllIIliIIl() && in.IIlllIlliIll() <= in.iiIIlIIlIl() && !in.Iiilliiliiil() && !in.IllIllllIl() && !in.IIIilIIiiIIi() && !in.Illlllllilll() && !in.IiIiliIiiiIi();
   }

   public IlllIIillllIIi IliIlllilIi(lIllIIlliIllIIll in) {
      iIliIiIiIlliIiIi var2 = this.lIiililiiiIiililii;
      if (this.lIiililiiiIiililii == iIliIiIiIlliIiIi.lllIiIiIIi) {
         return new IlllIIillllIIi(this.lIiililiiiIiililii, var2, false, false, (String)null);
      } else if (in == null) {
         return this.Iilililiiili(var2, (String)null);
      } else if (in.IliIlllilIi() != null && in.IliIlllilIi() != iiiIiiIlIIIliiIl.lliiIlIlll) {
         return this.IIiilIiiiIii(var2, in.IliIlllilIi().name());
      } else if (in.liiiIIllIl()) {
         ++this.liiililiiiiiililii;
         return this.liiililiiiiiililii >= 40 ? this.IIiilIiiiIii(var2, Iliilliiilii<invokedynamic>()) : this.Iilililiiili(var2, Iliilliiilii<invokedynamic>());
      } else {
         this.liiililiiiiiililii = 0;
         ++this.Iliililiilliililii;
         ++this.iliililiiIiiililii;
         if (this.lIiililiiiIiililii != iIliIiIiIlliIiIi.IliIiIiIIi && in.Iilililiiili()) {
            return this.Illillliilli(var2, iIliIiIiIlliIiIi.iIiIiIiIIi, Iliilliiilii<invokedynamic>());
         } else if (in.Iilllilliill() && IIlilIliiIli(this.lIiililiiiIiililii)) {
            return this.Illillliilli(var2, iIliIiIiIlliIiIi.IliIiIiIIi, Iliilliiilii<invokedynamic>());
         } else if (this.iliililiiIiiililii >= 600) {
            return this.IIiilIiiiIii(var2, Iliilliiilii<invokedynamic>());
         } else {
            IlllIIillllIIi var10000;
            switch (this.lIiililiiiIiililii) {
               case illIiIiIIi -> var10000 = this.IIlllIlliIll(var2, in);
               case IilIiIiIIi -> var10000 = this.Illlllllilll(var2, in);
               case lilIiIiIIi -> var10000 = this.Iilllilliill(var2, in);
               case iilIiIiIIi -> var10000 = this.IIillIiliIil(var2, in);
               case IIiIiIiIIi -> var10000 = this.Ililllililil(var2, in);
               case lIiIiIiIIi -> var10000 = this.Iiilliiliiil(var2, in);
               case iIiIiIiIIi -> var10000 = this.IIIilIIiiIIi(var2, in);
               case IliIiIiIIi -> var10000 = this.IlIillIiilIi(var2, in);
               default -> var10000 = this.Iilililiiili(var2, (String)null);
            }

            return var10000;
         }
      }
   }

   public int lIiiIiIlilli() {
      return this.Iliililiilliililii;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) << 13 | (char)(-((char)(var4[var5] + var5))) >>> 3) + '颶'))) ^ '\uf3ab') - '訽') >>> 9 | (char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) << 13 | (char)(-((char)(var4[var5] + var5))) >>> 3) + '颶'))) ^ '\uf3ab') - '訽') << 7) ^ var5) << 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) << 13 | (char)(-((char)(var4[var5] + var5))) >>> 3) + '颶'))) ^ '\uf3ab') - '訽') >>> 9 | (char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) << 13 | (char)(-((char)(var4[var5] + var5))) >>> 3) + '颶'))) ^ '\uf3ab') - '訽') << 7) ^ var5) >>> 6) ^ '\ue1b9'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIiliIilIiliIi() {
      this.lIiililiiiIiililii = iIliIiIiIlliIiIi.lllIiIiIIi;
   }

   private IlllIIillllIIi Ililllililil(iIliIiIiIlliIiIi before, lIllIIlliIllIIll in) {
      return !in.IIlilIliiIli() && !in.Illillliilli() && this.Iliililiilliililii < 12 ? this.Iilililiiili(before, (String)null) : this.Illillliilli(before, iIliIiIiIlliIiIi.iilIiIiIIi, in.IIlilIliiIli() ? Iliilliiilii<invokedynamic>() : Iliilliiilii<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15))) + '蛾') << 4 | (char)((char)(~((char)((char)var4[var5] << 1 | (char)var4[var5] >>> 15))) + '蛾') >>> 12) ^ var5) ^ '\uf31f'))) - 19313) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.iliililiiIiiililii;
   }

   public IlllIIillllIIi iIlIlllllill(String reason) {
      iIliIiIiIlliIiIi var2 = this.lIiililiiiIiililii;
      return this.lIiililiiiIiililii == iIliIiIiIlliIiIi.lllIiIiIIi ? new IlllIIillllIIi(this.lIiililiiiIiililii, var2, false, false, (String)null) : this.IIiilIiiiIii(var2, reason == null ? Iliilliiilii<invokedynamic>() : reason);
   }

   private IlllIIillllIIi IIillIiliIil(iIliIiIiIlliIiIi before, lIllIIlliIllIIll in) {
      if (in.IIIllIIliIIl() && in.IiIlliIliiIl() >= 8 && in.Illlllllilll()) {
         return this.Illillliilli(before, iIliIiIiIlliIiIi.lilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (in.IIIilIIiiIIi() && in.IlIillIiilIi()) {
         return this.Illillliilli(before, iIliIiIiIlliIiIi.IilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (in.Iiilliiliiil()) {
         return this.Illillliilli(before, iIliIiIiIlliIiIi.illIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (in.IiIiliIiiiIi()) {
         return this.Illillliilli(before, iIliIiIiIlliIiIi.IIiIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (in.IiIIlliIIl() && this.Iliililiilliililii < in.lIlIliIlIl()) {
         this.llIIiiliiilIIiilii = IiIiliIiiiIi(in) ? this.llIIiiliiilIIiilii + 1 : 0;
         return this.llIIiiliiilIIiilii >= 20 ? this.IIiilIiiiIii(before, Iliilliiilii<invokedynamic>()) : this.Iilililiiili(before, (String)null);
      } else {
         return this.IIiilIiiiIii(before, Iliilliiilii<invokedynamic>());
      }
   }

   private IlllIIillllIIi IlIillIiilIi(iIliIiIiIlliIiIi before, lIllIIlliIllIIll in) {
      if (in.Ililllililil()) {
         return this.IIiilIiiiIii(before, Iliilliiilii<invokedynamic>());
      } else {
         this.iIIIiiliiIlIIiilii = in.Iilllilliill() ? 0 : this.iIIIiiliiIlIIiilii + 1;
         return !in.IIillIiliIil() && this.iIIIiiliiIlIIiilii < 3 ? this.Iilililiiili(before, (String)null) : this.Illillliilli(before, in.IIIllIIliIIl() ? iIliIiIiIlliIiIi.lilIiIiIIi : iIliIiIiIlliIiIi.iilIiIiIIi, in.IIillIiliIil() ? Iliilliiilii<invokedynamic>() : Iliilliiilii<invokedynamic>());
      }
   }

   private IlllIIillllIIi IIIilIIiiIIi(iIliIiIiIlliIiIi in, lIllIIlliIllIIll before) {
      if (before.IIiilIiiiIii() && before.IIIilIIiiIIi()) {
         return this.Illillliilli(in, iIliIiIiIlliIiIi.IilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (before.IIiilIiiiIii() && before.Iiilliiliiil()) {
         return this.Illillliilli(in, iIliIiIiIlliIiIi.illIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (before.IIiilIiiiIii()) {
         return this.Illillliilli(in, iIliIiIiIlliIiIi.iilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (before.Iliilliiilii()) {
         return this.Illillliilli(in, iIliIiIiIlliIiIi.IIiIiIiIIi, Iliilliiilii<invokedynamic>());
      } else {
         return this.Iliililiilliililii >= 60 ? this.Illillliilli(in, iIliIiIiIlliIiIi.iilIiIiIIi, Iliilliiilii<invokedynamic>()) : this.Iilililiiili(in, (String)null);
      }
   }

   private static boolean IIlilIliiIli(iIliIiIiIlliIiIi s) {
      return s == iIliIiIiIlliIiIi.IilIiIiIIi || s == iIliIiIiIlliIiIi.lilIiIiIIi || s == iIliIiIiIlliIiIi.iilIiIiIIi || s == iIliIiIiIlliIiIi.iIiIiIiIIi || s == iIliIiIiIlliIiIi.lIiIiIiIIi;
   }

   private IlllIIillllIIi IIiilIiiiIii(iIliIiIiIlliIiIi before, String reason) {
      this.lIiililiiiIiililii = iIliIiIiIlliIiIi.lllIiIiIIi;
      this.Iliililiilliililii = 0;
      this.iliililiiIiiililii = 0;
      this.liiililiiiiiililii = 0;
      this.IIIIiiliilIIIiilii = 0;
      this.iIIIiiliiIlIIiilii = 0;
      this.llIIiiliiilIIiilii = 0;
      return new IlllIIillllIIi(iIliIiIiIlliIiIi.lllIiIiIIi, before, false, true, reason);
   }

   private IlllIIillllIIi IIlllIlliIll(iIliIiIiIlliIiIi in, lIllIIlliIllIIll before) {
      if (before.iIlIlllllill()) {
         return this.Illillliilli(in, iIliIiIiIlliIiIi.IilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else if (before.IIlllIlliIll() > before.iiIIlIIlIl() + (double)2.0F && before.IiIIlliIIl()) {
         return this.Illillliilli(in, iIliIiIiIlliIiIi.iilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else {
         this.IIIIiiliilIIIiilii = before.llIIlilIIl() ? 0 : this.IIIIiiliilIIIiilii + 1;
         return this.Iliililiilliililii < 80 && this.IIIIiiliilIIIiilii < 10 ? this.Iilililiiili(in, (String)null) : this.IIiilIiiiIii(in, Iliilliiilii<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7175518324074428810L ^ Long.rotateLeft(8502678144176296669L, 17) ^ -6527433131975585978L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7385409565852651901L ^ Long.rotateLeft(-1366838787802500881L, 2) ^ 9058584707038632360L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2170304943275142821L ^ Long.rotateLeft(8888872288504721535L, 48) ^ 7147750337227046250L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3734159497230868434L ^ Long.rotateLeft(-7381579241985716560L, 42) ^ -6939694584814217272L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2739933146958559532L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2764649764965457345L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1685989607490515662L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 869483001843222127L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8818741892532144400L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5859481974129793522L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiiiliiiiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIIllIIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIIIlIlIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, llIIlilIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIIlliIIl<invokedynamic>());
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
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) << 3 | (char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) >>> 13) ^ '蒧') - var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) << 3 | (char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) >>> 13) ^ '蒧') - var5) << 7) - var5) - var5) ^ '\uf558') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) << 3 | (char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) >>> 13) ^ '蒧') - var5) >>> 9 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) << 3 | (char)(-((char)((char)(-((char)(~((char)((char)(~var4[var5]) - var5))))) + var5))) >>> 13) ^ '蒧') - var5) << 7) - var5) - var5) ^ '\uf558') >>> 6) - 10015))) - 7390));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IlllIIillllIIi Iilllilliill(iIliIiIiIlliIiIi before, lIllIIlliIllIIll in) {
      if (in.Illlllllilll()) {
         return this.Iilililiiili(before, (String)null);
      } else {
         return in.IiIiliIiiiIi() ? this.Illillliilli(before, iIliIiIiIlliIiIi.IIiIiIiIIi, Iliilliiilii<invokedynamic>()) : this.Illillliilli(before, iIliIiIiIlliIiIi.iilIiIiIIi, Iliilliiilii<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '\uf56d') >>> 5 | (char)(var4[var5] ^ '\uf56d') << 11) + '떁') ^ var5) ^ var5))) ^ 26530) - var5) + var5) - var5) >>> 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '\uf56d') >>> 5 | (char)(var4[var5] ^ '\uf56d') << 11) + '떁') ^ var5) ^ var5))) ^ 26530) - var5) + var5) - var5) << 14)) - 7397) ^ var5) + 7628));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) >>> 14) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) >>> 14) << 7) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) >>> 14) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] + '\ue3a9') ^ 30889) << 3 | (char)((char)(var4[var5] + '\ue3a9') ^ 30889) >>> 13) ^ var5) - '붲') ^ 30788) >>> 14) << 7) << 6) + '脐') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IlllIIillllIIi Illlllllilll(iIliIiIiIlliIiIi before, lIllIIlliIllIIll in) {
      if (in.lIiiIiIlilli()) {
         return this.Illillliilli(before, iIliIiIiIlliIiIi.lilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else {
         return !in.iliIiiliiiii() && (!in.IilliliilIIi() || !in.IlIlllIlilIl()) && (this.Iliililiilliililii < 14 || in.IilliliilIIi()) ? this.Iilililiiili(before, (String)null) : this.Illillliilli(before, iIliIiIiIlliIiIi.iilIiIiIIi, Iliilliiilii<invokedynamic>());
      }
   }

   private IlllIIillllIIi Iiilliiliiil(iIliIiIiIlliIiIi before, lIllIIlliIllIIll in) {
      if (in.Iiiiliiiiiii() && in.lIiiIiIlilli()) {
         return this.Illillliilli(before, iIliIiIiIlliIiIi.lilIiIiIIi, Iliilliiilii<invokedynamic>());
      } else {
         return !in.IIIIllIIIl() && !in.iIIIlIlIIl() && this.Iliililiilliililii < 160 ? this.Iilililiiili(before, (String)null) : this.Illillliilli(before, iIliIiIiIlliIiIi.iilIiIiIIi, Iliilliiilii<invokedynamic>());
      }
   }
}
