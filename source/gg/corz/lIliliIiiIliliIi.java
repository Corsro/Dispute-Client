package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIliliIiiIliliIi {
   private long lIllIiiIIi;
   private int IiIlIiiIIi;
   private int ilIlIiiIIi;
   private int liiIIiiIIi = 2;
   private lllIiIllillIiIll IlIlIiiIIi;
   private final iiIIIIliIIlIIIli IliIIiiIIi;
   private final iIlIiIllIi iliIIiiIIi;
   private final lliiillliliiilll lliIIiiIIi;
   private int iiIlIiiIIi;
   private int llIlIiiIIi;
   private int IIllIiiIIi;
   public static final int lIiIIiiIIi = 64;
   public static final int IIiIIiiIIi = 2;
   private int iiiIIiiIIi = 64;
   private boolean lIIlIiiIIi;
   private int IiiIIiiIIi = 12;
   private int liIlIiiIIi;
   public static final long iIiIIiiIIi = 2000000L;
   public static final int iilIIiiIIi = 12;
   private long IIIlIiiIIi = 2000000L;
   private int iIIlIiiIIi = Integer.MIN_VALUE;

   public boolean IIlllIlliIll(int cell, long ctx, iIIiIlllIlIiIlll deckY) {
      return this.IliIIiiIIi.lIiiIiIlilli(cell, ctx, deckY) == null;
   }

   public void Ililllililil() {
      this.IliIIiiIIi.iiIIlIIlIl();
      this.lliIIiiIIi.Illlllllilll();
      this.lIIlIiiIIi = false;
      this.iIIlIiiIIi = Integer.MIN_VALUE;
      this.IlIlIiiIIi = null;
      this.llIlIiiIIi = this.ilIlIiiIIi = this.IiIlIiiIIi = this.liIlIiiIIi = this.iiIlIiiIIi = this.IIllIiiIIi = 0;
      this.lIllIiiIIi = 0L;
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) << 12 | (char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) >>> 4) ^ var5) << 3 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) << 12 | (char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) >>> 4) ^ var5) >>> 13) ^ 1676) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) << 12 | (char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) >>> 4) ^ var5) << 3 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) << 12 | (char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') << 9 | (char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) >>> 6))))) - '鰪') >>> 7) >>> 4) ^ var5) >>> 13) ^ 1676) << 15)) ^ '퇎') - var5) - '\uf7bd') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long Illillliilli() {
      return this.lIllIiiIIi;
   }

   public void IilliliilIIi(int cap, Illlllllllllllll deckY) {
      if (this.lliIIiiIIi.IlIillIiilIi(cap) && !this.lliIIiiIIi.IIIilIIiiIIi()) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>() + deckY.liiiIIllIl());
      }

      this.IliIIiiIIi.Iiilliiliiil(cap, deckY);
   }

   public int Iliilliiilii() {
      return this.iiIlIiiIIi;
   }

   public lliiillliliiilll IIIilIIiiIIi() {
      return this.lliIIiiIIi;
   }

   public void IliIlllilIi(int proofs, int nanos, long astar, int revalidate) {
      this.IiiIIiiIIi = proofs;
      this.liiIIiiIIi = nanos;
      this.IIIlIiiIIi = astar;
      this.iiiIIiiIIi = revalidate;
   }

   public lIliliIiiIliliIi(iiIIIIliIIlIIIli ledger, lliiillliliiilll rt, iIlIiIllIi search) {
      this.IliIIiiIIi = ledger;
      this.lliIIiiIIi = rt;
      this.iliIIiiIIi = search;
   }

   public void IiIlliIliiIl(int deckY, long feet, long column, IiIlIiiliIlIii cell, int tick) {
      this.IliIIiiIIi.liiiIIllIl(deckY, feet, iIiIiIilIliIiIil.IIIIIilIil, feet, column, cell, tick);
   }

   public iiIIIIliIIlIIIli Iiilliiliiil() {
      return this.IliIIiiIIi;
   }

   public int Iiiiliiiiiii() {
      return this.IIllIiiIIi;
   }

   public lllIiIllillIiIll IlIillIiilIi() {
      return this.IlIlIiiIIi;
   }

   public IIlilllllIlillll lIiiIiIlilli(iiIillIlIIlillIl feet, long tick, int d) {
      if (this.lIIlIiiIIi) {
         this.lIIlIiiIIi = false;
         return IIlilllllIlillll.IiiIliIill;
      } else if (feet.IliIlllilIi()) {
         return IIlilllllIlillll.iiiIliIill;
      } else if (feet.liiiIIllIl() == Iiiiilllliiiilll.iIlllllill && feet.IilliliilIIi() != null) {
         this.iliIiiliiiii(tick, d);
         return this.lliIIiiIIi.Iiilliiliiil() ? IIlilllllIlillll.iiiIliIill : IIlilllllIlillll.liiIliIill;
      } else {
         if ((this.lliIIiiIIi.Ililllililil() || this.lliIIiiIIi.Iiilliiliiil()) && (feet.IilliliilIIi() == null || feet.iIlIlllllill() != this.lliIIiiIIi.IiIiliIiiiIi())) {
            this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>() + feet.liiiIIllIl());
         }

         return IIlilllllIlillll.iliIliIill;
      }
   }

   public IIlilllllIlillll iIlIlllllill(long enabled, int feet, boolean tick, boolean otherOwns) {
      if (!this.lliIIiiIIi.Ililllililil() && !this.lliIIiiIIi.Iiilliiliiil()) {
         return IIlilllllIlillll.iliIliIill;
      } else if (tick) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>());
         return IIlilllllIlillll.iliIliIill;
      } else if (!otherOwns) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>());
         return IIlilllllIlillll.iliIliIill;
      } else if (!this.iliIIiiIIi.IIIllIIliIIl(this.lliIIiiIIi.IiIiliIiiiIi())) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>());
         return IIlilllllIlillll.iliIliIill;
      } else {
         Illlllllllllllll var6 = this.iliIIiiIIi.iIlIlllllill();
         if (!var6.IliIlllilIi()) {
            this.IilliliilIIi(this.lliIIiiIIi.IiIiliIiiiIi(), var6);
            return IIlilllllIlillll.iliIliIill;
         } else {
            this.iliIiiliiiii(enabled, feet);
            return this.lliIIiiIIi.Iiilliiliiil() ? IIlilllllIlillll.iiiIliIill : IIlilllllIlillll.liiIliIill;
         }
      }
   }

   public void Illlllllilll(int deckY) {
      this.IliIIiiIIi.IIlilIliiIli(deckY);
      this.lliIIiiIIi.IIlllIlliIll();
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) << 12) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) << 12) >>> 11) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) << 12) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2784) - '\uf062') >>> 1 | (char)((char)(var4[var5] ^ 2784) - '\uf062') << 15) - var5) + 27286) + var5) + var5) + var5) >>> 5) << 12) >>> 11) << 11) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIIiIIiIiIIiIIi IIIllIIliIIl(int deckY, boolean walkOn, boolean onDeck) {
      ilIIiIIiIiIIiIIi var4 = !walkOn && !onDeck && this.lliIIiiIIi.Iiilliiliiil() && this.lliIIiiIIi.IiIiliIiiiIi() == deckY ? this.lliIIiiIIi.Illillliilli() : null;
      if (var4 != null) {
         ++this.iiIlIiiIIi;
         this.lliIIiiIIi.iliIiiliiiii();
      } else {
         if (!walkOn && !onDeck) {
            ++this.IIllIiiIIi;
         }

         if (this.lliIIiiIIi.IlIillIiilIi(deckY)) {
            this.lliIIiiIIi.IiIlliIliiIl(walkOn ? llIIlilIIl<invokedynamic>() : llIIlilIIl<invokedynamic>());
         }
      }

      return var4;
   }

   public String iIIIlIlIIl() {
      return this.IliIIiiIIi.IllIllllIl() + llIIlilIIl<invokedynamic>() + this.lliIIiiIIi.ilIllIiIll() + llIIlilIIl<invokedynamic>() + this.IIIIllIIIl();
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) << 11 | (char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) >>> 5) >>> 12 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) << 11 | (char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) >>> 5) << 4) - var5) ^ var5) - 10664) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) << 11 | (char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) >>> 5) >>> 12 | (char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) << 11 | (char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) >>> 6 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 14 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 2) << 10) >>> 5) << 4) - var5) ^ var5) - 10664) ^ var5) << 2) - '즬') + var5) - var5) + var5) ^ var5) + '\ue37d') + 30086));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilililiiili() {
      return this.IiIlIiiIIi;
   }

   public String IIIIllIIIl() {
      return llIIlilIIl<invokedynamic>() + this.llIlIiiIIi + llIIlilIIl<invokedynamic>() + this.lIllIiiIIi / 1000000L + llIIlilIIl<invokedynamic>() + this.ilIlIiiIIi + llIIlilIIl<invokedynamic>() + this.IiIlIiiIIi + llIIlilIIl<invokedynamic>() + this.liIlIiiIIi + llIIlilIIl<invokedynamic>() + this.iiIlIiiIIi + llIIlilIIl<invokedynamic>() + this.IIllIiiIIi;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) >>> 13) - '芒') + 17295) - var5) >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) >>> 13) - '芒') + 17295) - var5) << 6) + 'ꓯ') >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) >>> 13) - '芒') + 17295) - var5) >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\uf4d2') ^ '萏') + '햺') - 5876) - var5) + var5))) >>> 13) - '芒') + 17295) - var5) << 6) + 'ꓯ') << 13))) + 'ꁉ') - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 68874123646771893L ^ Long.rotateLeft(-2526946853510812525L, 38) ^ -800231358575060539L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4431654511170611886L ^ Long.rotateLeft(-2731608799877445207L, 14) ^ 8310930621502616698L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5923849951385544238L ^ Long.rotateLeft(-1360181549043113630L, 41) ^ 121857821935737564L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7516787025046600379L ^ Long.rotateLeft(3136275061217751971L, 34) ^ -5093536840965847409L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4914081666941412991L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7474758304575505576L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4432490728696329915L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5367165143091615718L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6716064712931479748L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -572682090303623878L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIIlliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiIIlIIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIlIliIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IllIllllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(illIlIilIl<invokedynamic>());
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

   public lllIiIllillIiIll iliIiiliiiii(long tick, int feet) {
      if (this.iIIlIiiIIi == feet) {
         return this.IlIlIiiIIi;
      } else {
         this.iIIlIiiIIi = feet;
         if (!this.lliIIiiIIi.Ililllililil()) {
            return this.IlIlIiiIIi = new lllIiIllillIiIll(this.lliIIiiIIi.IIillIiliIil(), 0, 0, 0, false, (String)null);
         } else {
            long var4 = this.iliIIiiIIi.IlIlllIlilIl();
            ++this.llIlIiiIIi;
            lliiillliliiilll var10000 = this.lliIIiiIIi;
            illIliIilIli var10001 = new illIliIilIli(this.IiiIIiiIIi, this.liiIIiiIIi, var4 + this.IIIlIiiIIi);
            iiIIIIliIIlIIIli var10002 = this.IliIIiiIIi;
            iIIiIlllIlIiIlll var10003 = this.iliIIiiIIi.lIiiIiIlilli();
            iIlIiIllIi var10004 = this.iliIIiiIIi;
            Objects.requireNonNull(var10004);
            lllilIlillilIl var7 = var10004::iliIiiliiiii;
            iIlIiIllIi var10007 = this.iliIIiiIIi;
            Objects.requireNonNull(var10007);
            lllIiIllillIiIll var6 = var10000.Iilllilliill(var10001, var10002, var10003, var7, tick, feet, var10007::IlIlllIlilIl);
            this.lIllIiiIIi += this.iliIIiiIIi.IlIlllIlilIl() - var4;
            if (var6.iliIiiliiiii()) {
               ++this.ilIlIiiIIi;
            }

            return this.IlIlIiiIIi = var6;
         }
      }
   }

   public void Iilllilliill(String why) {
      if (this.lliIIiiIIi.Ililllililil() || this.lliIIiiIIi.Iiilliiliiil()) {
         this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>() + why);
      }

   }

   public Iiiiilllliiiilll liiiIIllIl(Iiilliiliiil tick, long feet, int revision, long dk) {
      long var11 = 9156050595613695765L;
      if (!tick.iIlIlllllill(feet) && this.iliIIiiIIi.liiiIIllIl(tick) == 0L) {
         List var7 = this.iliIIiiIIi.IliIlllilIi(tick);
         if (var7.isEmpty()) {
            if (this.lliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl)) {
               this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>());
            }

            this.IliIIiiIIi.Iilllilliill(tick.IiiiIlliiiIl);
            ++this.liIlIiiIIi;
            return Iiiiilllliiiilll.lIlllllill;
         } else {
            this.IliIIiiIIi.Ililllililil(tick.IiiiIlliiiIl);
            Illlllllllllllll var8 = this.iliIIiiIIi.iIlIlllllill();
            if (!var8.IliIlllilIi()) {
               if (var8.lIiiIiIlilli() && var8.iIlIlllllill() && var8.IilliliilIIi() && this.iliIIiiIIi.IilliliilIIi()) {
                  this.lIIlIiiIIi = true;
               }

               if (this.lliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl) && !this.lliIIiiIIi.IIIilIIiiIIi()) {
                  this.lliIIiiIIi.IiIlliIliiIl(llIIlilIIl<invokedynamic>() + var8.liiiIIllIl());
               }

               this.IliIIiiIIi.Iiilliiliiil(tick.IiiiIlliiiIl, var8);
               return Iiiiilllliiiilll.Illllllill;
            } else {
               this.IliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl, var8);
               if (!this.lliIIiiIIi.IlIillIiilIi(tick.IiiiIlliiiIl)) {
                  this.lliIIiiIIi.IliIlllilIi(tick, var7, feet, revision, dk);
                  return Iiiiilllliiiilll.iIlllllill;
               } else {
                  this.lliIIiiIIi.liiiIIllIl(tick);
                  var11 ^= ((long)this.lliIIiiIIi.IIIilIIiiIIi() << 32 ^ var11) & -1L << 32;
                  if (this.lliIIiiIIi.iIlIlllllill(var7, feet) > 0 && (int)(var11 >>> 32) != 0) {
                     this.IliIIiiIIi.IIlllIlliIll(lliIllililiIllil.IIlIiliIil);
                  }

                  if (this.lliIIiiIIi.IIIilIIiiIIi()) {
                     List var10 = this.IliIIiiIIi.iliIiiliiiii(tick.IiiiIlliiiIl, this.lliIIiiIIi.illIlIilIl(), this.iliIIiiIIi.lIiiIiIlilli(), this.iiiIIiiIIi);
                     if (!var10.isEmpty()) {
                        this.lliIIiiIIi.lIiiIiIlilli(var10, this.IliIIiiIIi.Illlllllilll());
                     }
                  }

                  if (this.lliIIiiIIi.Ililllililil()) {
                     return Iiiiilllliiiilll.iIlllllill;
                  } else if (this.lliIIiiIIi.Iiilliiliiil()) {
                     return Iiiiilllliiiilll.iIlllllill;
                  } else {
                     this.IliIIiiIIi.IiIiliIiiiIi();
                     return Iiiiilllliiiilll.IIlllllill;
                  }
               }
            }
         }
      } else {
         return Iiiiilllliiiilll.liiIlllill;
      }
   }

   public int IiIiliIiiiIi() {
      return this.llIlIiiIIi;
   }

   public int IIiilIiiiIii() {
      return this.liIlIiiIIi;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ '끛') - var5) + var5))) + '뭌') ^ var5) + '鴰'))))) ^ var5) - 3542) ^ 10748))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIlllIlilIl(int pinned, ilIIiIIiIiIIiIIi tick, IllIiillllIiil feet, long why, int deckY, String v) {
      if (tick != null && feet != null && feet.lIiiIiIlilli() != null) {
         this.IliIIiiIIi.iIlIlllllill(pinned, tick.liiiIIllIl(), feet.lIiiIiIlilli(), feet.iliIiiliiiii(), why, feet.IiIlliIliiIl(), deckY, feet.Iilllilliill());
      }

      this.lliIIiiIIi.IIIllIIliIIl(tick == null ? Long.MIN_VALUE : tick.liiiIIllIl(), v);
   }

   public void IIillIiliIil() {
      if (this.lliIIiiIIi.Ililllililil()) {
         ++this.IiIlIiiIIi;
      }

   }

   public int IIlilIliiIli() {
      return this.ilIlIiiIIi;
   }
}
