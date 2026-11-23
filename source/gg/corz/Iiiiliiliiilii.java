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
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2352;

public final class Iiiiliiliiilii {
   public static final int IiIliliIIl = 2;
   private final boolean iilliliIIl;
   private final int lilliliIIl;
   private final int IIililiIIl;
   private final IIIiliilIIilii liIliliIIl;
   private final class_2350 iiIliliIIl;
   private final class_2350.class_2351 lIlliliIIl;
   private final int IilliliIIl;
   private final boolean iIililiIIl;
   private final class_2350.class_2351 IIlliliIIl;
   private final class_2350.class_2351 iIlliliIIl;
   private final int[] illliliIIl;
   private final int[] lllliliIIl;
   public static final int ilIliliIIl = Integer.MAX_VALUE;
   private final iIiillilIliillil lIililiIIl;
   private final int[] IllliliIIl;
   public static final int llIliliIIl = 0;

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) << 8 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) >>> 8) - var5) - '왃') >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) << 8 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) >>> 8) - var5) - '왃') << 14) - 31385) << 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) << 8 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) >>> 8) - var5) - '왃') >>> 2 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) << 8 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + '豗') >>> 9 | (char)((char)(var4[var5] - var5) + '豗') << 7) ^ '\uf7ac') + '锸'))) >>> 8) - var5) - '왃') << 14) - 31385) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIiillilIliillil IIlllIlliIll() {
      return this.lIililiIIl;
   }

   public class_2350.class_2351 iliIiiliiiii() {
      return this.IIlliliIIl;
   }

   public long IIlilIliiIli() {
      return (long)this.IllliliIIl.length * (long)this.lllliliIIl.length * (long)this.illliliIIl.length;
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) << 15 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) >>> 1))))) >>> 6 | (char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) << 15 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) >>> 1))))) << 10) - 27224) >>> 13 | (char)((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) << 15 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) >>> 1))))) >>> 6 | (char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) << 15 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) >>> 7 | (char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + 5778) ^ var5) ^ 6389) << 9) - '\uf8c6'))) - var5) + 23583) + var5))) - var5) >>> 1))))) << 10) - 27224) << 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public class_2350.class_2351 IiIlliIliiIl() {
      return this.IIlliliIIl;
   }

   public class_2338 lIlIliIlIl(int q, int bLocal, int pos, int lift) {
      return this.IllIllllIl(this.Illillliilli(q, bLocal), this.Iiiiliiiiiii(q, pos), this.IIIIllIIIl(q, bLocal, pos, lift));
   }

   public boolean IlIillIiilIi(double pz, double px) {
      double var5 = this.iIlliliIIl == class_2351.field_11048 ? pz : px;
      double var7 = (double)(this.liIliliIIl.liiiIIllIl(this.iIlliliIIl) + this.liIliliIIl.iIlIlllllill(this.iIlliliIIl) + 1) / (double)2.0F;
      return var5 <= var7;
   }

   public boolean llIIlilIIl(int lift, int bLocal, int q) {
      return (this.IiIIlliIIl(lift, bLocal, q) & 1L) == 0L == this.iIililiIIl;
   }

   public int Ililllililil() {
      return this.IilliliIIl;
   }

   // $FF: synthetic method
   private static CallSite IIllllIlll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - var5) >>> 7 | (char)((char)((char)(var4[var5] + var5) - var5) - var5) << 9) - '\ueb47') ^ 7760) - 18918))) - var5) - var5) ^ 25034) + '\ue771'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIilIIiiIIi() {
      return this.IIililiIIl;
   }

   public class_2350.class_2351 IIIllIIliIIl() {
      return this.lIlliliIIl;
   }

   public int iiiIlIIIll(int d, int lift) {
      long var6 = 1332220270589310377L;
      long var8 = 3543699165315412013L;
      var6 ^= ((long)this.liIliliIIl.liiiIIllIl(this.IIlliliIIl) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)this.liIliliIIl.iIlIlllllill(this.IIlliliIIl) ^ var6) & -1L >>> 32;
      if (lift >= (int)(var6 >>> 32) && lift <= (int)var6) {
         var8 ^= ((long)(this.iiIliliIIl.method_10171() == class_2352.field_11056 ? lift - (int)(var6 >>> 32) : (int)var6 - lift) << 32 ^ var8) & -1L << 32;
         return this.iilliliIIl && (d & 1) == 1 ? this.IllliliIIl.length - 1 - (int)(var8 >>> 32) : (int)(var8 >>> 32);
      } else {
         return -1;
      }
   }

   public class_2338 IIiIllIiIl(int lift, int bLocal, int pos, int q) {
      long var9 = -6369691091150658240L;
      long var11 = -5221868099806245633L;
      var9 ^= ((long)(this.Illillliilli(lift, bLocal) - this.IIiilIiiiIii(lift) * this.IIililiIIl) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)this.IIIIllIIIl(lift, bLocal, pos, q) ^ var9) & -1L >>> 32;
      if (this.lIlliliIIl == class_2351.field_11052) {
         return this.IllIllllIl((int)(var9 >>> 32), this.illIlIilIl(lift), (int)var9);
      } else {
         var11 ^= ((long)(this.Iiiiliiiiiii(lift, pos) + (this.iiIliliIIl == class_2350.field_11033 ? this.IIililiIIl : 0)) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)(this.iiIliliIIl == class_2350.field_11033 ? this.Illillliilli(lift, bLocal) + 1 : this.Illillliilli(lift, bLocal) - 2) ^ var11) & -1L >>> 32;
         return this.IllIllllIl((int)var11, (int)(var11 >>> 32), (int)var9);
      }
   }

   private int Iilililiiili(int lift, int q) {
      return this.iilliliIIl && (lift & 1) == 1 ? this.IllliliIIl.length - 1 - q : q;
   }

   public Iiiiliiliiilii(IIIiliilIIilii bounds, class_2350 liftBands, iIiillilIliillil standOffset, int advance, double reach, int serpentineDepth, boolean order) {
      this(bounds, liftBands, standOffset, advance, reach, serpentineDepth, order, true);
   }

   public Iiiiliiliiilii(IIIiliilIIilii standOffset, class_2350 order, iIiillilIliillil reach, int advance, double serpentineDepth, int sweepFromLow, boolean liftBands, boolean bounds) {
      long var18 = -3711575373171336147L;
      long var20 = 1491834558938681836L;
      long var22 = -2789736976319367469L;
      long var24 = -7368564286230717310L;
      super();
      this.liIliliIIl = standOffset;
      this.iiIliliIIl = order;
      this.lIililiIIl = reach;
      this.iIililiIIl = bounds;
      this.IIlliliIIl = order.method_10166();
      this.iilliliIIl = liftBands && this.IIlliliIIl == class_2351.field_11052;
      if (this.IIlliliIIl == class_2351.field_11052) {
         this.lIlliliIIl = class_2351.field_11048;
         this.iIlliliIIl = class_2351.field_11051;
      } else {
         this.lIlliliIIl = class_2351.field_11052;
         this.iIlliliIIl = this.IIlliliIIl == class_2351.field_11048 ? class_2351.field_11051 : class_2351.field_11048;
      }

      var18 ^= ((long)standOffset.liiiIIllIl(this.IIlliliIIl) << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)standOffset.iIlIlllllill(this.IIlliliIIl) ^ var18) & -1L >>> 32;
      var20 ^= ((long)(order.method_10171() == class_2352.field_11056 ? 1 : 0) << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)Math.max(0, (int)var18 - (int)(var18 >>> 32) + 1) ^ var20) & -1L >>> 32;
      this.IllliliIIl = new int[(int)var20];

      for(var22 ^= (0L ^ var22) & -1L << 32; (int)(var22 >>> 32) < (int)var20; var22 += 4294967296L) {
         this.IllliliIIl[(int)(var22 >>> 32)] = (int)(var20 >>> 32) != 0 ? (int)(var18 >>> 32) + (int)(var22 >>> 32) : (int)var18 - (int)(var22 >>> 32);
      }

      int[] var14 = iIlliIlIllliIl.IliIlllilIi(standOffset.liiiIIllIl(this.lIlliliIIl), standOffset.iIlIlllllill(this.lIlliliIIl));
      var22 ^= ((long)(var14.length >= 2 && var14[var14.length - 1] + 1 > standOffset.iIlIlllllill(this.lIlliliIIl) ? 1 : 0) ^ var22) & -1L >>> 32;
      var24 ^= ((long)(this.lIlliliIIl == class_2351.field_11052 && reach != iIiillilIliillil.iIIIiIIlil && (int)var22 == 0 ? 0 : 1) << 32 ^ var24) & -1L << 32;
      this.lllliliIIl = new int[var14.length];

      for(var24 ^= (0L ^ var24) & -1L >>> 32; (int)var24 < var14.length; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
         this.lllliliIIl[(int)var24] = (int)(var24 >>> 32) != 0 ? var14[(int)var24] : var14[var14.length - 1 - (int)var24];
      }

      this.illliliIIl = iIlliIlIllliIl.IliIlllilIi(standOffset.liiiIIllIl(this.iIlliliIIl), standOffset.iIlIlllllill(this.iIlliliIIl));
      var24 ^= ((long)(this.lIlliliIIl != class_2351.field_11052 ? Math.max(1, this.lllliliIIl.length) : (advance == 0 ? liiiIIllIl(serpentineDepth) : (advance == Integer.MAX_VALUE ? Math.max(1, this.lllliliIIl.length) : Math.max(1, advance)))) ^ var24) & -1L >>> 32;
      this.IilliliIIl = Math.max(1, Math.min((int)var24, Math.max(1, this.lllliliIIl.length)));
      this.lilliliIIl = this.lllliliIIl.length == 0 ? 0 : (this.lllliliIIl.length + this.IilliliIIl - 1) / this.IilliliIIl;
      this.IIililiIIl = this.lIlliliIIl == class_2351.field_11052 ? Math.max(Math.max(1, sweepFromLow), IliIlllilIi(this.IilliliIIl)) : Math.max(1, sweepFromLow);
   }

   public class_2338 iIiIlIliIl(class_2338 lift, class_2350 cell, int face) {
      return this.lliIliliIl(lift, cell, face, false);
   }

   public static int IliIlllilIi(int bands) {
      double var1 = (double)3.0F * (double)(Math.max(1, bands) - 1) - 0.12;
      return Math.max(2, (int)Math.ceil(var1) + 1);
   }

   private long IiIIlliIIl(int lift, int bLocal, int q) {
      return ((long)lift * (long)this.IllliliIIl.length + (long)bLocal) * (long)this.IilliliIIl + (long)q;
   }

   public int IIIIllIIIl(int pos, int q, int bLocal, int lift) {
      return this.illliliIIl[this.iIIIlIlIIl(pos, q, bLocal, lift)];
   }

   // $FF: synthetic method
   private static CallSite lllllillll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) >>> 4 | (char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) << 12))) >>> 3 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) >>> 4 | (char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) << 12))) << 13))))) ^ 8780) << 15 | (char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) >>> 4 | (char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) << 12))) >>> 3 | (char)(-((char)((char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) >>> 4 | (char)((char)((char)((char)(var4[var5] + 11157) - var5) - var5) + 23989) << 12))) << 13))))) ^ 8780) >>> 1) - 31955) - var5) + var5) ^ var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illillliilli(int lift, int q) {
      return this.IllliliIIl[this.Iilililiiili(lift, q)];
   }

   public int illIlIilIl(int lift) {
      long var4 = 4275098009856899200L;
      var4 ^= (9223372032559808512L ^ var4) & -1L << 32;

      for(var4 ^= (0L ^ var4) & -1L >>> 32; (int)var4 < this.IiIiliIiiiIi(lift); var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
         var4 ^= ((long)Math.min((int)(var4 >>> 32), this.Iiiiliiiiiii(lift, (int)var4) - 1) << 32 ^ var4) & -1L << 32;
      }

      return Math.max(this.liIliliIIl.liiiIIllIl(this.lIlliliIIl), (int)(var4 >>> 32));
   }

   public static int liiiIIllIl(double reach) {
      long var9 = 1593805542667990881L;
      long var11 = -7957327786532142496L;
      var9 ^= (4294967296L ^ var9) & -1L << 32;

      for(var9 ^= (2L ^ var9) & -1L >>> 32; (int)var9 <= 2; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         var11 ^= ((long)IliIlllilIi((int)var9) << 32 ^ var11) & -1L << 32;
         double var5 = (double)((int)(var11 >>> 32)) - (double)0.5F;
         double var7 = Math.max((double)0.0F, (double)3.0F * (double)((int)var9 - 1) - 0.62);
         if (Math.hypot(var5, var7) <= reach - 0.3) {
            var9 ^= ((long)((int)var9) << 32 ^ var9) & -1L << 32;
         }
      }

      return (int)(var9 >>> 32);
   }

   public class_2350 lIiiIiIlilli() {
      return this.iiIliliIIl;
   }

   private class_2338 IllIllllIl(int depth, int band, int sweep) {
      long var7 = 4514781177791290082L;
      long var9 = -7609842001792136034L;
      var7 ^= (0L ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;
      var9 ^= (0L ^ var9) & -1L << 32;
      switch (this.IIlliliIIl) {
         case field_11048 -> var7 ^= ((long)depth << 32 ^ var7) & -1L << 32;
         case field_11052 -> var7 ^= ((long)depth ^ var7) & -1L >>> 32;
         case field_11051 -> var9 ^= ((long)depth << 32 ^ var9) & -1L << 32;
      }

      switch (this.lIlliliIIl) {
         case field_11048 -> var7 ^= ((long)band << 32 ^ var7) & -1L << 32;
         case field_11052 -> var7 ^= ((long)band ^ var7) & -1L >>> 32;
         case field_11051 -> var9 ^= ((long)band << 32 ^ var9) & -1L << 32;
      }

      switch (this.iIlliliIIl) {
         case field_11048 -> var7 ^= ((long)sweep << 32 ^ var7) & -1L << 32;
         case field_11052 -> var7 ^= ((long)sweep ^ var7) & -1L >>> 32;
         case field_11051 -> var9 ^= ((long)sweep << 32 ^ var9) & -1L << 32;
      }

      return new class_2338((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32));
   }

   public class_2350.class_2351 IlIlllIlilIl() {
      return this.iIlliliIIl;
   }

   public class_2350 Iliilliiilii(int lift) {
      return class_2350.method_10169(this.IIlliliIIl, this.IIiilIiiiIii(lift) > 0 ? class_2352.field_11060 : class_2352.field_11056);
   }

   public long IiiIlliiIl(int z, int y, int x) {
      long var17 = -52958394623619719L;
      long var19 = 1831341997745109851L;
      long var21 = -7658456690141174950L;
      long var23 = -4353681259259060007L;
      long var15 = 2103669091135962988L;
      var15 ^= ((long)lIIlliIIll(z, y, x, this.IIlliliIIl) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)lIIlliIIll(z, y, x, this.lIlliliIIl) ^ var15) & -1L >>> 32;
      var17 ^= ((long)lIIlliIIll(z, y, x, this.iIlliliIIl) << 32 ^ var17) & -1L << 32;
      long var7 = Long.MAX_VALUE;

      for(long var28 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var28 < this.lllliliIIl.length; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
         if (Math.abs(this.lllliliIIl[(int)var28] - (int)var15) <= 1) {
            long var29 = var19 ^ ((long)((int)var28 / this.IilliliIIl) << 32 ^ var19) & -1L << 32;
            var19 = var29 ^ ((long)((int)var28 % this.IilliliIIl) ^ var29) & -1L >>> 32;
            var21 ^= ((long)this.iiiIlIIIll((int)(var19 >>> 32), (int)(var15 >>> 32)) << 32 ^ var21) & -1L << 32;
            if ((int)(var21 >>> 32) >= 0) {
               for(var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < this.illliliIIl.length; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
                  if (Math.abs(this.illliliIIl[(int)var21] - (int)(var28 >>> 32)) <= 1) {
                     var23 ^= ((long)this.iIIIlIlIIl((int)(var19 >>> 32), (int)(var21 >>> 32), (int)var19, (int)var21) << 32 ^ var23) & -1L << 32;
                     var7 = Math.min(var7, this.iiIIlIIlIl((int)(var19 >>> 32), (int)(var21 >>> 32), (int)var19, (int)(var23 >>> 32)));
                  }
               }
            }
         }
      }

      return var7;
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2331365755357774783L ^ Long.rotateLeft(7113640319828449962L, 27) ^ 3623050142952986682L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7461856458319631231L ^ Long.rotateLeft(-343701839285698966L, 25) ^ 526990568908965053L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5835179322452009190L ^ Long.rotateLeft(3131165969626317403L, 21) ^ -3307671914263523741L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3406822398594178116L ^ Long.rotateLeft(-3854918487890175382L, 41) ^ -2125298222491490601L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5857547592104177303L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5109817311653554362L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6527209066633474921L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 9035204266022791474L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6076667630664380218L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3440637255033791509L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(ilIllIiIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, liIlliiIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIllllIlll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iIlllIllll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lllllillll<invokedynamic>());
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

   public int Iiilliiliiil() {
      return this.lllliliIIl.length;
   }

   private int iIIIlIlIIl(int q, int pos, int bLocal, int lift) {
      return this.llIIlilIIl(q, pos, bLocal) ? lift : this.illliliIIl.length - 1 - lift;
   }

   public class_2338 lliIliliIl(class_2338 face, class_2350 precise, int lift, boolean cell) {
      long var7 = 120610380790552989L;
      if (precise.method_10166() == class_2351.field_11052) {
         class_2350 var5 = this.Iliilliiilii(lift);
         if (var5.method_10166() == class_2351.field_11052) {
            var5 = class_2350.field_11035;
         }

         class_2350 var9 = var5.method_10170();
         if (cell) {
            return precise == class_2350.field_11033 ? face.method_10087(2) : face.method_10079(var5, 1).method_10079(var9, 1);
         } else {
            return precise == class_2350.field_11033 ? face.method_10079(var5, 1).method_10087(3) : face.method_10079(var5, 2).method_10086(1);
         }
      } else {
         var7 ^= ((long)(this.IIlliliIIl != class_2351.field_11052 ? face.method_10264() - 1 : (this.iiIliliIIl == class_2350.field_11033 ? face.method_10264() : face.method_10264() - 2)) << 32 ^ var7) & -1L << 32;
         class_2338 var6 = face.method_10079(precise, cell ? 1 : this.IIililiIIl);
         return new class_2338(var6.method_10263(), (int)(var7 >>> 32), var6.method_10260());
      }
   }

   public long iiIIlIIlIl(int lift, int q, int bLocal, int pos) {
      return this.IiIIlliIIl(lift, q, bLocal) * (long)this.illliliIIl.length + (long)pos;
   }

   public static class_2350 iIlIlllllill(IIIiliilIIilii pz, double px, double b, double py) {
      long var17 = 6571414399836845164L;
      long var15 = 1885794808923441956L;
      var15 ^= ((long)(pz.iiiiIliIIl - pz.iliiIliIIl + 1) << 32 ^ var15) & -1L << 32;
      if ((int)(var15 >>> 32) < 3) {
         return b >= (double)(pz.iiiiIliIIl + 1) ? class_2350.field_11033 : class_2350.field_11036;
      } else {
         var15 ^= ((long)(pz.liiiIliIIl - pz.lliiIliIIl + 1) ^ var15) & -1L >>> 32;
         var17 ^= ((long)(pz.IIIIlliIIl - pz.IiiiIliIIl + 1) << 32 ^ var17) & -1L << 32;
         class_2350.class_2351 var10 = (int)var15 <= (int)(var17 >>> 32) ? class_2351.field_11048 : class_2351.field_11051;
         double var11 = var10 == class_2351.field_11048 ? px : py;
         double var13 = (double)(pz.liiiIIllIl(var10) + pz.iIlIlllllill(var10) + 1) / (double)2.0F;
         return class_2350.method_10169(var10, var11 <= var13 ? class_2352.field_11056 : class_2352.field_11060);
      }
   }

   public int IIiilIiiiIii(int lift) {
      long var3 = -1616370163806261874L;
      var3 ^= ((long)(this.iiIliliIIl.method_10171() == class_2352.field_11056 ? 1 : -1) << 32 ^ var3) & -1L << 32;
      return this.iilliliIIl && (lift & 1) == 1 ? -((int)(var3 >>> 32)) : (int)(var3 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) << 9) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) << 9) >>> 2) ^ var5) ^ var5) - 2688) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) << 9) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) >>> 8 | (char)((char)(-((char)((char)((char)((char)(var4[var5] + '꒣') ^ var5)) >>> 5 | (char)((char)((char)(var4[var5] + '꒣') ^ var5)) << 11))) + 17723) << 8) + var5) - '邒')) >>> 10) << 9) >>> 2) ^ var5) ^ var5) - 2688) << 10) + 6856));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return IlIllllIll<invokedynamic>() + this.iiIliliIIl + IlIllllIll<invokedynamic>() + this.IIlliliIIl + IlIllllIll<invokedynamic>() + this.lIlliliIIl + IlIllllIll<invokedynamic>() + this.iIlliliIIl + IlIllllIll<invokedynamic>() + this.IllliliIIl.length + IlIllllIll<invokedynamic>() + this.lllliliIIl.length + IlIllllIll<invokedynamic>() + this.IilliliIIl + IlIllllIll<invokedynamic>() + this.lilliliIIl + IlIllllIll<invokedynamic>() + this.illliliIIl.length + IlIllllIll<invokedynamic>() + this.lIililiIIl + IlIllllIll<invokedynamic>();
   }

   public int lilIliilIl(int lift) {
      long var4 = -3631957157213125087L;
      var4 ^= (Long.MIN_VALUE ^ var4) & -1L << 32;

      for(var4 ^= (0L ^ var4) & -1L >>> 32; (int)var4 < this.IiIiliIiiiIi(lift); var4 ^= (var4 ^ var4 + (long)1) & -1L >>> 32) {
         var4 ^= ((long)Math.max((int)(var4 >>> 32), this.Iiiiliiiiiii(lift, (int)var4) + 1) << 32 ^ var4) & -1L << 32;
      }

      return Math.min(this.liIliliIIl.iIlIlllllill(this.lIlliliIIl), (int)(var4 >>> 32));
   }

   public int IIillIiliIil() {
      return this.illliliIIl.length;
   }

   public IIIiliilIIilii IilliliilIIi() {
      return this.liIliliIIl;
   }

   public int Iilllilliill() {
      return this.IllliliIIl.length;
   }

   public int Illlllllilll() {
      return this.lilliliIIl;
   }

   public int Iiiiliiiiiii(int lift, int bLocal) {
      return this.lllliliIIl[lift * this.IilliliIIl + bLocal];
   }

   static int lIIlliIIll(int x, int a, int y, class_2350.class_2351 z) {
      int var10000;
      switch (z) {
         case field_11048 -> var10000 = x;
         case field_11052 -> var10000 = a;
         case field_11051 -> var10000 = y;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public int IiIiliIiiiIi(int lift) {
      return Math.min(this.IilliliIIl, this.lllliliIIl.length - lift * this.IilliliIIl);
   }
}
