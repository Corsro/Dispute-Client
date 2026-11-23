package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2352;

public final class lliIIIliiliIIIli {
   private int IIIiIlIlIi;
   private lIlilliliIlillil iiIiIlIlIi;
   private final Map<Long, Integer> illiIlIlIi;
   private int llIiIlIlIi;
   private static final int iiilIlIlIi = 2;
   private int IiIiIlIlIi;
   private final Map<Long, Set<String>> iiliIlIlIi;
   private int lIliIlIlIi;
   private final Set<Long> lIiiIlIlIi;
   private int llliIlIlIi;
   private lilIIliilIIl iliiIlIlIi;
   private int IliiIlIlIi;
   private int IlliIlIlIi;
   private lIIiililiIIiilil lliiIlIlIi;
   private final Set<Long> liliIlIlIi;
   private final ArrayDeque<liiiIIIiiiiiIIIi> IIiiIlIlIi;
   private final Iiiiliiliiilii lIIiIlIlIi;
   private static final int IiilIlIlIi = 2;
   private static final int llilIlIlIi = 3;
   private final iillllilIIilllil iIIiIlIlIi = new iillllilIIilllil();
   private boolean iIliIlIlIi;
   private static final int liilIlIlIi = 8192;
   private int IIliIlIlIi;
   private int IlIiIlIlIi;
   private final Map<Long, Integer> iIiiIlIlIi;
   private static final int ililIlIlIi = 2;
   private lIIiililiIIiilil IiiiIlIlIi;
   private boolean liIiIlIlIi;
   private int ilIiIlIlIi;
   private final Set<Long> IiliIlIlIi;

   private class_2338 IIillIiliIil(lilIIliilIIl w, int bandHi, int bandLo) {
      long var10 = 3379541748023219912L;
      long var12 = 2407592946305490519L;
      long var14 = -6200035486366414639L;
      var10 ^= ((long)this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IlIlllIlilIl()) ^ var10) & -1L >>> 32;
      var12 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IlIlllIlilIl()) << 32 ^ var12) & -1L << 32;

      for(long var19 = var12 ^ ((long)bandHi ^ var12) & -1L >>> 32; (int)var19 <= bandLo; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         for(var14 ^= ((long)((int)var10) << 32 ^ var14) & -1L << 32; (int)(var14 >>> 32) <= (int)(var19 >>> 32); var14 += 4294967296L) {
            class_2338 var9 = this.lliIliliIl((int)(var10 >>> 32), (int)var19, (int)(var14 >>> 32));
            if (!w.lIiiIiIlilli(var9.method_10263(), var9.method_10264(), var9.method_10260())) {
               return var9;
            }
         }
      }

      return null;
   }

   public void iiiIlIIIll(lilIIliilIIl w, class_2338 centre, class_2350 confirmTicks, IiIIiiIlliIIiiIl now, int face, int proof) {
      long var13 = 5248805933749510330L;
      long[][] var7 = new long[1][];
      boolean[][] var8 = new boolean[1][];
      this.iIlllIllll(w, centre, confirmTicks, var7, var8);
      this.IIiiIlIlIi.addLast(new liiiIIIiiiiiIIIi(centre, confirmTicks, now.IlIilIIlll, face + Math.max(1, proof), now.iiillIIlll, var7[0], var8[0]));
      this.lIiiIlIlIi.add(centre.method_10063());
      class_2338[] var9 = now.iiillIIlll;
      var13 ^= ((long)var9.length << 32 ^ var13) & -1L << 32;

      for(long var16 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var16 < (int)(var16 >>> 32); var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
         class_2338 var12 = var9[(int)var16];
         this.iIiiIlIlIi.put(var12.method_10063(), face);
      }

      this.iIiiIlIlIi.entrySet().removeIf((nowx) -> face - (Integer)nowx.getValue() > 200);
      ++this.iIIiIlIlIi.lIlIliiIil;
      this.iiIiIlIlIi = lIlilliliIlillil.lIiIlIIlil;
   }

   // $FF: synthetic method
   private static CallSite iIlIiIllIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2be') + var5) ^ var5) - 16916) + '\udb6b') ^ var5))) - var5) + var5) ^ '\uea37') << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2be') + var5) ^ var5) - 16916) + '\udb6b') ^ var5))) - var5) + var5) ^ '\uea37') >>> 7) ^ '벒'))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2be') + var5) ^ var5) - 16916) + '\udb6b') ^ var5))) - var5) + var5) ^ '\uea37') << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\uf2be') + var5) ^ var5) - 16916) + '\udb6b') ^ var5))) - var5) + var5) ^ '\uea37') >>> 7) ^ '벒'))) >>> 9) - '詳') ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String Illillllil(class_2338 stand, class_2350 centre, class_2338 reason, llIilIIiilIilIIi face) {
      return stand.method_10063() + IlIIillIIi<invokedynamic>() + (centre == null ? IlIIillIIi<invokedynamic>() : centre.method_10151()) + IlIIillIIi<invokedynamic>() + (reason == null ? IlIIillIIi<invokedynamic>() : Long.toString(reason.method_10063())) + (face == null ? "" : IlIIillIIi<invokedynamic>() + face);
   }

   public lIIiililiIIiilil IIlllIlliIll(lilIIliilIIl now, int w) {
      return this.Illlllllilll(now, now, w);
   }

   private boolean llIIlilIIl(lilIIliilIIl bandHi, int w, int bandLo) {
      long var10 = 7804855630864052518L;
      long var12 = 7621248168721487109L;
      long var14 = -8834684261604470028L;
      var10 ^= ((long)this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IlIlllIlilIl()) ^ var10) & -1L >>> 32;
      var12 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IlIlllIlilIl()) << 32 ^ var12) & -1L << 32;

      for(long var19 = var12 ^ ((long)w ^ var12) & -1L >>> 32; (int)var19 <= bandLo; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         for(var14 ^= ((long)((int)var10) << 32 ^ var14) & -1L << 32; (int)(var14 >>> 32) <= (int)(var19 >>> 32); var14 += 4294967296L) {
            class_2338 var9 = this.lliIliliIl((int)(var10 >>> 32), (int)var19, (int)(var14 >>> 32));
            if (!this.liliIlIlIi.contains(var9.method_10063()) && bandHi.liiiIIllIl(var9.method_10263(), var9.method_10264(), var9.method_10260())) {
               return true;
            }
         }
      }

      return false;
   }

   private void iIlllIllll(lilIIliilIIl outKeys, class_2338 centre, class_2350 face, long[][] outSolid, boolean[][] w) {
      long var17 = 216650943448553270L;
      long var15 = 4520036746684776554L;
      class_2350.class_2351 var6 = face.method_10166();
      class_2350.class_2351[] var7 = IiIIIlIiliIIIlIi.lIiiIiIlilli(var6);
      long[] var8 = new long[34];
      boolean[] var9 = new boolean[var8.length];
      var15 ^= (0L ^ var15) & -1L << 32;

      for(var15 ^= (-2L ^ var15) & -1L >>> 32; (int)var15 <= 2; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         for(var17 ^= (-8589934592L ^ var17) & -1L << 32; (int)(var17 >>> 32) <= 2; var17 += 4294967296L) {
            if (Math.abs((int)var15) > 1 || Math.abs((int)(var17 >>> 32)) > 1) {
               class_2338 var13 = lllllillll(centre, var7[0], (int)var15, var7[1], (int)(var17 >>> 32), var6, 0);
               var8[(int)(var15 >>> 32)] = var13.method_10063();
               int var10001 = (int)(var15 >>> 32);
               var15 += 4294967296L;
               var9[var10001] = outKeys.iIlIlllllill(var13.method_10263(), var13.method_10264(), var13.method_10260());
            }
         }
      }

      for(long var21 = var15 ^ ~var15 & -1L >>> 32; (int)var21 <= 1; var21 ^= (var21 ^ var21 + (long)2) & -1L >>> 32) {
         for(var17 ^= (-4294967296L ^ var17) & -1L << 32; (int)(var17 >>> 32) <= 1; var17 += 4294967296L) {
            for(var17 ^= ~var17 & -1L >>> 32; (int)var17 <= 1; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
               class_2338 var14 = lllllillll(centre, var7[0], (int)(var17 >>> 32), var7[1], (int)var17, var6, (int)var21);
               var8[(int)(var21 >>> 32)] = var14.method_10063();
               int var23 = (int)(var21 >>> 32);
               var21 += 4294967296L;
               var9[var23] = outKeys.iIlIlllllill(var14.method_10263(), var14.method_10264(), var14.method_10260());
            }
         }
      }

      outSolid[0] = var8;
      w[0] = var9;
   }

   private int iIiIlIliIl() {
      return this.lIIiIlIlIi.lilIliilIl(this.IlIiIlIlIi);
   }

   public String lililiilil(lIIiililiIIiilil t) {
      return !this.liIiIlIlIi && this.IlIiIlIlIi < this.lIIiIlIlIi.Illlllllilll() && this.lIIiIlIlIi.Iiilliiliiil() != 0 ? IlIIillIIi<invokedynamic>() + this.llIiIlIlIi + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.Iilllilliill() + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi) + IlIIillIIi<invokedynamic>() + this.IlIiIlIlIi + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.Illlllllilll() + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.IIlllIlliIll() + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi) + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.lIiiIiIlilli() + IlIIillIIi<invokedynamic>() + this.iiIiIlIlIi + IlIIillIIi<invokedynamic>() + this.IiIiIlIlIi + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.IIillIiliIil() + (t == null ? "" : IlIIillIIi<invokedynamic>() + t) : IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.Iilllilliill() + IlIIillIIi<invokedynamic>() + this.lIIiIlIlIi.Illlllllilll() + IlIIillIIi<invokedynamic>() + this.iiIiIlIlIi + IlIIillIIi<invokedynamic>() + this.iIIiIlIlIi.iIiIliiIil + (t == null ? "" : IlIIillIIi<invokedynamic>() + t);
   }

   public long IIIllIIliIIl() {
      return Math.max(0L, (long)this.lIIiIlIlIi.IIillIiliIil() - 1L - (long)this.IiIiIlIlIi);
   }

   public lliIIIliiliIIIli(Iiiiliiliiilii plan) {
      this.iiIiIlIlIi = lIlilliliIlillil.illIlIIlil;
      this.IlliIlIlIi = Integer.MIN_VALUE;
      this.illiIlIlIi = new HashMap();
      this.IiliIlIlIi = new HashSet();
      this.liliIlIlIi = new HashSet();
      this.iiliIlIlIi = new HashMap();
      this.IIiiIlIlIi = new ArrayDeque();
      this.lIiiIlIlIi = new HashSet();
      this.iIiiIlIlIi = new HashMap();
      this.IliiIlIlIi = Integer.MIN_VALUE;
      this.lIIiIlIlIi = plan;
      this.liIiIlIlIi = plan.IIlilIliiIli() == 0L;
      if (this.liIiIlIlIi) {
         this.iiIiIlIlIi = lIlilliliIlillil.iiiIlIIlil;
      }

   }

   private int illIlIilIl() {
      return Math.max(this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IIIllIIliIIl()), this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi) - 1);
   }

   static String illilIilil(class_2338 p) {
      return p == null ? IlIIillIIi<invokedynamic>() : p.method_10263() + IlIIillIIi<invokedynamic>() + p.method_10264() + IlIIillIIi<invokedynamic>() + p.method_10260();
   }

   private static class_2350 IIIilIIiiIIi(lilIIliilIIl preferred, class_2338 p, class_2350 w) {
      long var7 = 5787118120835990921L;
      if (w.method_10166() != class_2351.field_11052 && lilillliililll.IIIllIIliIIl(preferred, p.method_10263(), p.method_10264(), p.method_10260(), w)) {
         return w;
      } else {
         class_2350[] var3 = class_2350.values();
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for(var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < (int)(var7 >>> 32); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            class_2350 var6 = var3[(int)var7];
            if (var6.method_10166() != class_2351.field_11052 && lilillliililll.IIIllIIliIIl(preferred, p.method_10263(), p.method_10264(), p.method_10260(), var6)) {
               return var6;
            }
         }

         var3 = class_2350.values();
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for(long var14 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var14 < (int)(var14 >>> 32); var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            class_2350 var10 = var3[(int)var14];
            if (lilillliililll.IIIllIIliIIl(preferred, p.method_10263(), p.method_10264(), p.method_10260(), var10)) {
               return var10;
            }
         }

         return w;
      }
   }

   public void ilIllIiIll() {
      this.IIiiIlIlIi.clear();
      this.lIiiIlIlIi.clear();
   }

   public boolean IllIllllIl(lilIIliilIIl select) {
      if (this.liIiIlIlIi && this.IIIiIlIlIi < 2) {
         this.liliIlIlIi.clear();
         if (!this.IIiilIiiiIii(select)) {
            return false;
         } else {
            this.liIiIlIlIi = false;
            this.Iilililiiili();
            return true;
         }
      } else {
         return false;
      }
   }

   public void iiIilIIlil(class_2338 centre, class_2350 face) {
      long var6 = 7833046955598575929L;
      if (centre != null && face != null) {
         for(var6 ^= (-8589934592L ^ var6) & -1L << 32; (int)(var6 >>> 32) <= 2; var6 += 4294967296L) {
            for(var6 ^= (-2L ^ var6) & -1L >>> 32; (int)var6 <= 2; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
               class_2350.class_2351[] var5 = IiIIIlIiliIIIlIi.lIiiIiIlilli(face.method_10166());
               this.IiIilliIil(lllllillll(centre, var5[0], (int)(var6 >>> 32), var5[1], (int)var6, face.method_10166(), 0));
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IIlIilIlIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))) + var5) - var5))) - var5) - var5) << 15 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))) + var5) - var5))) - var5) - var5) >>> 1) - var5) << 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))) + var5) - var5))) - var5) - var5) << 15 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))) + var5) - var5))) - var5) - var5) >>> 1) - var5) >>> 6) ^ var5) - 'ꂒ') ^ var5) - var5) + var5) - '袪') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite ilIIiIiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - 20862))) >>> 2 | (char)(-((char)((char)(~var4[var5]) - 20862))) << 14) + '쎖') + '謂') ^ '웨') ^ var5) ^ '\ud8f3') + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) - 20862))) >>> 2 | (char)(-((char)((char)(~var4[var5]) - 20862))) << 14) + '쎖') + '謂') ^ '웨') ^ var5) ^ '\ud8f3') + var5) << 6))) - '\ue070') - var5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String lIIlliIIll(lilIIliilIIl w, int now) {
      long var16 = -552872075427456567L;
      long var12 = 5600950541474811243L;
      long var14 = -871113155484289001L;
      StringBuilder var3 = null;

      while(!this.IIiiIlIlIi.isEmpty() && ((liiiIIIiiiiiIIIi)this.IIiiIlIlIi.peekFirst()).IlIiIlliil <= now) {
         liiiIIIiiiiiIIIi var4 = (liiiIIIiiiiiIIIi)this.IIiiIlIlIi.pollFirst();
         this.lIiiIlIlIi.remove(var4.IIIiIlliil.method_10063());
         var12 ^= (0L ^ var12) & -1L << 32;
         class_2338[] var6 = var4.llIiIlliil;
         var12 ^= ((long)var6.length ^ var12) & -1L >>> 32;

         for(var14 ^= (0L ^ var14) & -1L << 32; (int)(var14 >>> 32) < (int)var12; var14 += 4294967296L) {
            class_2338 var9 = var6[(int)(var14 >>> 32)];
            if (w.liiiIIllIl(var9.method_10263(), var9.method_10264(), var9.method_10260())) {
               var12 += 4294967296L;
            }
         }

         var14 ^= ((long)Math.max(0, var4.iIIiIlliil - (int)(var12 >>> 32)) ^ var14) & -1L >>> 32;
         iillllilIIilllil var10000 = this.iIIiIlIlIi;
         var10000.iIlIliiIil += (int)var14;
         var10000 = this.iIIiIlIlIi;
         var10000.IliIliiIil += (int)(var12 >>> 32);
         var12 ^= (0L ^ var12) & -1L >>> 32;
         var14 ^= (0L ^ var14) & -1L << 32;

         for(var16 ^= (0L ^ var16) & -1L << 32; (int)(var16 >>> 32) < var4.ilIiIlliil.length; var16 += 4294967296L) {
            if (var4.IiIiIlliil[(int)(var16 >>> 32)]) {
               class_2338 var10 = class_2338.method_10092(var4.ilIiIlliil[(int)(var16 >>> 32)]);
               if (!w.iIlIlllllill(var10.method_10263(), var10.method_10264(), var10.method_10260())) {
                  Integer var11 = (Integer)this.iIiiIlIlIi.get(var4.ilIiIlliil[(int)(var16 >>> 32)]);
                  if (var11 == null) {
                     if (w.IliIlllilIi(var10.method_10263(), var10.method_10264(), var10.method_10260())) {
                        var14 += 4294967296L;
                     } else if (!IlIllllIll(var4, var10)) {
                        var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32;
                     }
                  }
               }
            }
         }

         var10000 = this.iIIiIlIlIi;
         var10000.IiiIliiIil += (int)(var14 >>> 32);
         var10000 = this.iIIiIlIlIi;
         var10000.iliIliiIil += (int)var12;
         if ((int)(var12 >>> 32) > 0 || (int)(var14 >>> 32) > 0 || (int)var12 > 0) {
            if (var3 == null) {
               var3 = new StringBuilder();
            }

            var3.append(var3.length() == 0 ? "" : IlIIillIIi<invokedynamic>()).append(IlIIillIIi<invokedynamic>()).append(illilIilil(var4.IIIiIlliil)).append(IlIIillIIi<invokedynamic>()).append(var4.lIIiIlliil).append(IlIIillIIi<invokedynamic>()).append(var4.iIIiIlliil).append(IlIIillIIi<invokedynamic>()).append((int)var14).append(IlIIillIIi<invokedynamic>()).append((int)(var12 >>> 32)).append(IlIIillIIi<invokedynamic>()).append((int)(var14 >>> 32)).append(IlIIillIIi<invokedynamic>()).append((int)var12);
         }

         if ((int)(var12 >>> 32) > 0) {
            this.IIllllIlll(var4.IIIiIlliil);
         }
      }

      if (this.iiIiIlIlIi == lIlilliliIlillil.lIiIlIIlil && this.IIiiIlIlIi.isEmpty()) {
         this.iiIiIlIlIi = lIlilliliIlillil.lliIlIIlil;
      }

      return var3 == null ? null : var3.toString();
   }

   public iillllilIIilllil liiiIIllIl() {
      return this.iIIiIlIlIi;
   }

   private long lIilliIill() {
      return this.liIiIlIlIi ? Long.MAX_VALUE : this.ilillIiill() + (long)this.lIIiIlIlIi.Ililllililil() * (long)this.lIIiIlIlIi.IIillIiliIil();
   }

   private lIIiililiIIiilil Iilllilliill(lilIIliilIIl now, int w) {
      long var14 = 8258606072517130321L;
      if (this.liIiIlIlIi) {
         this.iiIiIlIlIi = lIlilliliIlillil.iiiIlIIlil;
         return null;
      } else {
         this.IiiiIlIlIi = null;

         for(long var19 = var14 ^ (0L ^ var14) & -1L << 32; (int)(var19 >>> 32) < 8192; var19 += 4294967296L) {
            class_2338 var4 = this.lIIiIlIlIi.lIlIliIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
            long var5 = var4.method_10063();
            if (!this.iIIIlIlIIl(now).lIiiIiIlilli(var4.method_10263(), var4.method_10264(), var4.method_10260())) {
               this.iiIiIlIlIi = lIlilliliIlillil.iilIlIIlil;
               return new lIIiililiIIiilil(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi, var4, var4, this.lIIiIlIlIi.IIiIllIiIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi), this.lIIiIlIlIi.Iliilliiilii(this.IlIiIlIlIi), this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi), true, this.iIliIlIlIi);
            }

            if (!this.liliIlIlIi.contains(var5) && !this.IiliIlIlIi.contains(var5) && lilillliililll.IIiilIiiiIii(now, this.lIIiIlIlIi.IilliliilIIi(), var4.method_10263(), var4.method_10264(), var4.method_10260(), this.lIIiIlIlIi.IiIlliIliiIl())) {
               class_2350 var7 = this.lIIiIlIlIi.Iliilliiilii(this.IlIiIlIlIi);
               class_2338 var8 = this.lIIiIlIlIi.IIiIllIiIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
               long var9 = this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
               iiIIlIllIIlIlIll var11 = lilillliililll.IlIillIiilIi(now, this.lIIiIlIlIi.IilliliilIIi(), var4.method_10263(), var4.method_10264(), var4.method_10260(), this.lIIiIlIlIi.IiIlliIliiIl(), this.Ilillllill());
               if (var11 != null) {
                  this.iiIiIlIlIi = lIlilliliIlillil.IIiIlIIlil;
                  class_2350 var16 = var11.ililIillll ? var11.IillIillll : var7;
                  class_2338 var18 = var11.ililIillll ? this.lIIiIlIlIi.iIiIlIliIl(var11.liiiIIllIl(), var11.IillIillll, this.IlIiIlIlIi) : var8;
                  return new lIIiililiIIiilil(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi, var4, var11.liiiIIllIl(), var18, var16, var9, false, this.iIliIlIlIi);
               }

               class_2338 var12 = this.Iiilliiliiil(now, var4);
               if (var12 != null) {
                  this.iiIiIlIlIi = lIlilliliIlillil.IIiIlIIlil;
                  class_2350 var17 = IIIilIIiiIIi(now, var12, var7);
                  return new lIIiililiIIiilil(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi, var4, var12, this.lIIiIlIlIi.lliIliliIl(var12, var17, this.IlIiIlIlIi, true), var17, var9, false, this.iIliIlIlIi, true);
               }

               class_2338 var13 = this.IlIillIiilIi(now, var4);
               if (var13 != null) {
                  this.iiIiIlIlIi = lIlilliliIlillil.iilIlIIlil;
                  return new lIIiililiIIiilil(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi, var4, var13, var8, var7, var9, true, this.iIliIlIlIi);
               }
            }

            if (!this.IiIiliIiiiIi(now)) {
               return this.IiiiIlIlIi;
            }
         }

         return null;
      }
   }

   private class_2350 Ilillllill() {
      return class_2350.method_10169(this.lIIiIlIlIi.iliIiiliiiii(), this.lIIiIlIlIi.IIiilIiiiIii(this.IlIiIlIlIi) > 0 ? class_2352.field_11056 : class_2352.field_11060);
   }

   public boolean IlIlllIlilIl() {
      return !this.IIiiIlIlIi.isEmpty();
   }

   private boolean Ililllililil(lilIIliilIIl bandLo, int bandHi, int w) {
      class_2338 var4 = this.IIillIiliIil(this.iIIIlIlIIl(bandLo), bandHi, w);
      if (var4 == null) {
         return false;
      } else {
         this.iiIiIlIlIi = lIlilliliIlillil.iilIlIIlil;
         this.IiiiIlIlIi = new lIIiililiIIiilil(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi, var4, var4, this.lIIiIlIlIi.IIiIllIiIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi), this.lIIiIlIlIi.Iliilliiilii(this.IlIiIlIlIi), this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi), true, this.iIliIlIlIi);
         return true;
      }
   }

   private void IiIIlliIIl(lilIIliilIIl bandLo, int w, int bandHi) {
      long var11 = 899968240303340451L;
      long var13 = 711867446240035416L;
      long var15 = -8641886221320581645L;
      var11 ^= ((long)this.lIIiIlIlIi.Illillliilli(this.IlIiIlIlIi, this.llIiIlIlIi) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().liiiIIllIl(this.lIIiIlIlIi.IlIlllIlilIl()) ^ var11) & -1L >>> 32;
      var13 ^= ((long)this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IlIlllIlilIl()) << 32 ^ var13) & -1L << 32;
      class_2350 var7 = class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056);

      for(long var20 = var13 ^ ((long)w ^ var13) & -1L >>> 32; (int)var20 <= bandHi; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         for(var15 ^= ((long)((int)var11) << 32 ^ var15) & -1L << 32; (int)(var15 >>> 32) <= (int)(var20 >>> 32); var15 += 4294967296L) {
            class_2338 var10 = this.lliIliliIl((int)(var11 >>> 32), (int)var20, (int)(var15 >>> 32));
            if (bandLo.liiiIIllIl(var10.method_10263(), var10.method_10264(), var10.method_10260()) && this.iiIIlIIlIl(var10, var7)) {
               this.liliIlIlIi.add(var10.method_10063());
            }
         }
      }

      this.iIIiIlIlIi.iIiIliiIil = this.liliIlIlIi.size();
   }

   public class_2350.class_2351 lIiiIiIlilli() {
      return this.lIIiIlIlIi.IiIlliIliiIl();
   }

   public void lIliliIlil(int horizontal, int vertical) {
      iillllilIIilllil var10000 = this.iIIiIlIlIi;
      var10000.illIliiIil += Math.abs(horizontal);
      var10000 = this.iIIiIlIlIi;
      var10000.IilIliiIil += Math.abs(vertical);
   }

   public void llIililIil() {
      ++this.iIIiIlIlIi.IIiIliiIil;
   }

   public Iiiiliiliiilii IliIlllilIi() {
      return this.lIIiIlIlIi;
   }

   public boolean lIlIliIlIl(lilIIliilIIl w) {
      long var6 = -1817546374232829709L;
      long var8 = -1377888469644931608L;
      IIIiliilIIilii var2 = this.lIIiIlIlIi.IilliliilIIi();

      for(var6 ^= ((long)var2.lliiIliIIl << 32 ^ var6) & -1L << 32; (int)(var6 >>> 32) <= var2.liiiIliIIl; var6 += 4294967296L) {
         for(var6 ^= ((long)var2.iliiIliIIl ^ var6) & -1L >>> 32; (int)var6 <= var2.iiiiIliIIl; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            for(var8 ^= ((long)var2.IiiiIliIIl << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) <= var2.IIIIlliIIl; var8 += 4294967296L) {
               if (w.lIiiIiIlilli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32)) && w.liiiIIllIl((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public boolean IIIIllIIIl(lilIIliilIIl w) {
      return this.llIIlilIIl(this.iIIIlIlIIl(w), this.IIiIllIiIl(), this.iIiIlIliIl());
   }

   private class_2338 Iiilliiliiil(lilIIliilIIl centre, class_2338 w) {
      class_2338[] var3 = new class_2338[]{null};
      IiIIIlIiliIIIlIi.liiiIIllIl(w, class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056), (y, z, x) -> {
         if (var3[0] == null && lilillliililll.Iliilliiilii(centre, y, z, x)) {
            if (!lilillliililll.iliIiiliiiii(centre, this.lIIiIlIlIi.IilliliilIIi(), this.lIIiIlIlIi.IiIlliIliiIl(), y, z, x, w.method_10263(), w.method_10264(), w.method_10260())) {
               IIIiliilIIilii var10001 = this.lIIiIlIlIi.IilliliilIIi();
               class_2350.class_2351 var10005 = this.lIIiIlIlIi.IiIlliIliiIl();
               Iiiiliiliiilii var10006 = this.lIIiIlIlIi;
               Objects.requireNonNull(var10006);
               if (!lilillliililll.Iilililiiili(centre, var10001, y, z, x, var10005, var10006::IiiIlliiIl, this.ilillIiill(), this.lIilliIill())) {
                  var3[0] = new class_2338(y, z, x);
               }
            }
         }
      });
      return var3[0];
   }

   public long iliIiiliiiii(int y, int z, int x) {
      return this.lIIiIlIlIi.IiiIlliiIl(y, z, x);
   }

   public void IiIilliIil(class_2338 centre) {
      if (centre != null) {
         long var2 = centre.method_10063();
         this.illiIlIlIi.remove(var2);
         this.IiliIlIlIi.remove(var2);
         this.iiliIlIlIi.remove(var2);
      }
   }

   private void IIllllIlll(class_2338 centre) {
      long var2 = centre.method_10063();
      if ((Integer)this.illiIlIlIi.merge(var2, 1, Integer::sum) >= this.liIlliiIll()) {
         this.IiliIlIlIi.add(var2);
         this.illiIlIlIi.remove(var2);
      }

   }

   public boolean Iiiiliiiiiii(lilIIliilIIl w) {
      return this.llIIlilIIl(this.iIIIlIlIIl(w), this.illIlIilIl(), this.lilIliilIl());
   }

   private boolean iiIIlIIlIl(class_2338 face, class_2350 p) {
      if (this.IiliIlIlIi.isEmpty()) {
         return false;
      } else {
         boolean[] var3 = new boolean[]{false};
         IiIIIlIiliIIIlIi.liiiIIllIl(face, p, (hit, z, x) -> {
            if (!var3[0] && this.IiliIlIlIi.contains(class_2338.method_10064(hit, z, x))) {
               var3[0] = true;
            }

         });
         return var3[0];
      }
   }

   private long ilillIiill() {
      return this.liIiIlIlIi ? Long.MAX_VALUE : this.lIIiIlIlIi.iiIIlIIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi) + this.IIIllIIliIIl();
   }

   private int IIiIllIiIl() {
      return this.lIIiIlIlIi.illIlIilIl(this.IlIiIlIlIi);
   }

   private boolean Illillliilli(lilIIliilIIl w) {
      this.iiIiIlIlIi = lIlilliliIlillil.liiIlIIlil;
      if (++this.llIiIlIlIi < this.lIIiIlIlIi.Iilllilliill()) {
         ++this.iIIiIlIlIi.lilIliiIil;
         return true;
      } else {
         this.llIiIlIlIi = 0;
         ++this.iIIiIlIlIi.IIlIliiIil;
         if (++this.IlIiIlIlIi < this.lIIiIlIlIi.Illlllllilll()) {
            this.iiIiIlIlIi = lIlilliliIlillil.illIlIIlil;
            this.IlliIlIlIi = Integer.MIN_VALUE;
            return true;
         } else if (this.IIIiIlIlIi < 2 && !this.IIiiIlIlIi.isEmpty()) {
            this.IlIiIlIlIi = this.lIIiIlIlIi.Illlllllilll() - 1;
            this.llIiIlIlIi = this.lIIiIlIlIi.Iilllilliill() - 1;
            this.ilIiIlIlIi = this.lIIiIlIlIi.IiIiliIiiiIi(this.IlIiIlIlIi) - 1;
            this.IiIiIlIlIi = this.lIIiIlIlIi.IIillIiliIil() - 1;
            this.iiIiIlIlIi = lIlilliliIlillil.iIiIlIIlil;
            return false;
         } else {
            if (this.IIIiIlIlIi < 2) {
               this.liliIlIlIi.clear();
               if (this.IIiilIiiiIii(w)) {
                  this.Iilililiiili();
                  return true;
               }
            }

            this.liIiIlIlIi = true;
            this.iiIiIlIlIi = lIlilliliIlillil.iiiIlIIlil;
            return false;
         }
      }
   }

   private int liIlliiIll() {
      return this.IIIiIlIlIi > 0 ? 1 : 3;
   }

   private class_2338 lliIliliIl(int depth, int sweepCoord, int bandCoord) {
      long var7 = -368780049237099203L;
      long var9 = 8637087198070934077L;
      var7 ^= (0L ^ var7) & -1L << 32;
      var7 ^= (0L ^ var7) & -1L >>> 32;
      var9 ^= (0L ^ var9) & -1L << 32;
      switch (this.lIIiIlIlIi.iliIiiliiiii()) {
         case field_11048 -> var7 ^= ((long)depth << 32 ^ var7) & -1L << 32;
         case field_11052 -> var7 ^= ((long)depth ^ var7) & -1L >>> 32;
         case field_11051 -> var9 ^= ((long)depth << 32 ^ var9) & -1L << 32;
      }

      switch (this.lIIiIlIlIi.IIIllIIliIIl()) {
         case field_11048 -> var7 ^= ((long)sweepCoord << 32 ^ var7) & -1L << 32;
         case field_11052 -> var7 ^= ((long)sweepCoord ^ var7) & -1L >>> 32;
         case field_11051 -> var9 ^= ((long)sweepCoord << 32 ^ var9) & -1L << 32;
      }

      switch (this.lIIiIlIlIi.IlIlllIlilIl()) {
         case field_11048 -> var7 ^= ((long)bandCoord << 32 ^ var7) & -1L << 32;
         case field_11052 -> var7 ^= ((long)bandCoord ^ var7) & -1L >>> 32;
         case field_11051 -> var9 ^= ((long)bandCoord << 32 ^ var9) & -1L << 32;
      }

      return new class_2338((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32));
   }

   private boolean IIiilIiiiIii(lilIIliilIIl w) {
      long var6 = 2211354385950975953L;
      long var8 = 3692589327325267250L;
      IIIiliilIIilii var2 = this.lIIiIlIlIi.IilliliilIIi();

      for(var6 ^= ((long)var2.lliiIliIIl << 32 ^ var6) & -1L << 32; (int)(var6 >>> 32) <= var2.liiiIliIIl; var6 += 4294967296L) {
         for(var6 ^= ((long)var2.iliiIliIIl ^ var6) & -1L >>> 32; (int)var6 <= var2.iiiiIliIIl; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            for(var8 ^= ((long)var2.IiiiIliIIl << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) <= var2.IIIIlliIIl; var8 += 4294967296L) {
               if (w.lIiiIiIlilli((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32)) && !this.liliIlIlIi.contains(class_2338.method_10064((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))) && w.liiiIIllIl((int)(var6 >>> 32), (int)var6, (int)(var8 >>> 32))) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   public lIlilliliIlillil iIlIlllllill() {
      return this.iiIiIlIlIi;
   }

   private int lilIliilIl() {
      return Math.min(this.lIIiIlIlIi.IilliliilIIi().iIlIlllllill(this.lIIiIlIlIi.IIIllIIliIIl()), this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi) + 1);
   }

   private void Iliilliiilii() {
      long var3 = -5869472520585824546L;
      var3 ^= ((long)this.lIIiIlIlIi.Iiiiliiiiiii(this.IlIiIlIlIi, this.ilIiIlIlIi) << 32 ^ var3) & -1L << 32;
      if (this.IlliIlIlIi != Integer.MIN_VALUE) {
         var3 ^= ((long)Integer.compare((int)(var3 >>> 32), this.IlliIlIlIi) ^ var3) & -1L >>> 32;
         if ((int)var3 != 0) {
            iillllilIIilllil var10000 = this.iIIiIlIlIi;
            var10000.IilIliiIil += Math.abs((int)(var3 >>> 32) - this.IlliIlIlIi);
            if (this.llliIlIlIi != 0 && (int)var3 != this.llliIlIlIi) {
               ++this.iIIiIlIlIi.iilIliiIil;
            }

            this.llliIlIlIi = (int)var3;
         }
      }

      this.IlliIlIlIi = (int)(var3 >>> 32);
   }

   private static boolean IlIllllIll(liiiIIIiiiiiIIIi g, class_2338 p) {
      long var7 = -2261460112924881273L;
      class_2338 var2 = p.method_10074();
      class_2338[] var3 = g.llIiIlliil;
      var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

      for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         class_2338 var6 = var3[(int)var10];
         if (var6.equals(var2)) {
            return true;
         }
      }

      return false;
   }

   public void Iillllilll(class_2338 reason, class_2350 face, class_2338 stand, llIilIIiilIilIIi centre) {
      long var9 = -7279080753365094287L;
      if (reason != null) {
         ++this.iIIiIlIlIi.IllIliiIil;
         long var5 = reason.method_10063();
         Set var7 = (Set)this.iiliIlIlIi.computeIfAbsent(var5, (k) -> new HashSet());
         if (!var7.add(Illillllil(reason, face, stand, centre))) {
            ++this.iIIiIlIlIi.lIiIliiIil;
         }

         var7.add(Illillllil(reason, face, stand, (llIilIIiilIilIIi)null));
         var9 ^= ((long)(Integer)this.illiIlIlIi.merge(var5, 1, Integer::sum) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) >= this.liIlliiIll()) {
            this.IiliIlIlIi.add(var5);
            this.illiIlIlIi.remove(var5);
         }

      }
   }

   public boolean liilliiill(lilIIliilIIl w) {
      if (this.liIiIlIlIi) {
         return false;
      } else {
         class_2338 var2 = this.lIIiIlIlIi.lIlIliIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
         boolean[] var3 = new boolean[]{false};
         IiIIIlIiliIIIlIi.liiiIIllIl(var2, class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056), (x, y, open) -> {
            if (!var3[0] && w.liiiIIllIl(x, y, open) && iIIilIlIil(w, new class_2338(x, y, open), this.lIIiIlIlIi.IiIlliIliiIl())) {
               var3[0] = true;
            }

         });
         return !var3[0];
      }
   }

   private static boolean iIIilIlIil(lilIIliilIIl c, class_2338 w, class_2350.class_2351 normal) {
      long var8 = 4709935010966245431L;
      class_2350.class_2352[] var3 = class_2352.values();
      var8 ^= ((long)var3.length << 32 ^ var8) & -1L << 32;

      for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         class_2350.class_2352 var6 = var3[(int)var11];
         class_2350 var7 = class_2350.method_10169(normal, var6);
         if (!c.iIlIlllllill(w.method_10263() + var7.method_10148(), w.method_10264() + var7.method_10164(), w.method_10260() + var7.method_10165())) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite IlIIillIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2713790256399687946L ^ Long.rotateLeft(-3440635472602076210L, 62) ^ -4051530874352726058L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2733234257777426346L ^ Long.rotateLeft(1933049860870825731L, 33) ^ 4517863708383587849L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2365178029355573939L ^ Long.rotateLeft(-5851918238029576192L, 59) ^ 2629075096411639199L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2395977301921072885L ^ Long.rotateLeft(1664237979807976301L, 30) ^ 2944588897414797489L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3961138937943143715L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 570972806059260033L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4749724099554352953L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4281376975948022759L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3280254346011200471L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3509746592357996268L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(ilIIiIiIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, liIIiiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlIilIlIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iIlIiIllIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lllIiillIi<invokedynamic>());
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

   public boolean IIIillIIil(class_2338 p) {
      if (this.liIiIlIlIi) {
         return false;
      } else {
         class_2338 var2 = this.lIIiIlIlIi.lIlIliIlIl(this.IlIiIlIlIi, this.llIiIlIlIi, this.ilIiIlIlIi, this.IiIiIlIlIi);
         return IiIIIlIiliIIIlIi.IilliliilIIi(var2.method_10263(), var2.method_10264(), var2.method_10260(), this.lIIiIlIlIi.IiIlliIliiIl(), p.method_10263(), p.method_10264(), p.method_10260());
      }
   }

   // $FF: synthetic method
   private static CallSite liIIiiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 11 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 5) ^ var5) ^ 24181) - var5) ^ '쑛'))) - var5) + 20550))) ^ var5) - 'ꎰ') + var5) - '꤆') << 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) << 11 | (char)(var4[var5] << 13 | var4[var5] >>> 3) >>> 5) ^ var5) ^ 24181) - var5) ^ '쑛'))) - var5) + 20550))) ^ var5) - 'ꎰ') + var5) - '꤆') >>> 6) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean IIlilIliiIli(lilIIliilIIl w) {
      this.Iliilliiilii();
      if (++this.ilIiIlIlIi < this.lIIiIlIlIi.IiIiliIiiiIi(this.IlIiIlIlIi)) {
         this.iiIiIlIlIi = lIlilliliIlillil.IilIlIIlil;
         return true;
      } else {
         this.ilIiIlIlIi = this.lIIiIlIlIi.IiIiliIiiiIi(this.IlIiIlIlIi) - 1;
         this.IiIiIlIlIi = this.lIIiIlIlIi.IIillIiliIil() - 1;
         if (!this.IIiiIlIlIi.isEmpty()) {
            this.iiIiIlIlIi = lIlilliliIlillil.iIiIlIIlil;
            return false;
         } else if (this.Ililllililil(w, this.IIiIllIiIl(), this.iIiIlIliIl())) {
            return false;
         } else {
            this.ilIiIlIlIi = 0;
            this.IiIiIlIlIi = 0;
            this.iiIiIlIlIi = lIlilliliIlillil.IiiIlIIlil;
            if (this.IIIIllIIIl(w)) {
               if (this.lIliIlIlIi++ < 2) {
                  this.IiliIlIlIi.clear();
                  this.iIliIlIlIi = true;
                  ++this.iIIiIlIlIi.lllIliiIil;
                  this.iiIiIlIlIi = lIlilliliIlillil.IilIlIIlil;
                  return true;
               }

               this.IiIIlliIIl(this.iIIIlIlIIl(w), this.IIiIllIiIl(), this.iIiIlIliIl());
            }

            ++this.iIIiIlIlIi.liIIliiIil;
            this.lIliIlIlIi = 0;
            this.iIliIlIlIi = false;
            return this.Illillliilli(w);
         }
      }
   }

   public boolean IiiIlliiIl(class_2338 stand, class_2350 face, class_2338 centre) {
      Set var4 = (Set)this.iiliIlIlIi.get(stand.method_10063());
      return var4 != null && var4.contains(Illillllil(stand, face, centre, (llIilIIiilIilIIi)null));
   }

   public lIIiililiIIiilil Illlllllilll(lilIIliilIIl select, lilIIliilIIl now, int verify) {
      if (this.IliiIlIlIi == verify) {
         return this.lliiIlIlIi;
      } else {
         this.IliiIlIlIi = verify;
         this.iliiIlIlIi = now;
         this.lliiIlIlIi = this.Iilllilliill(select, verify);
         return this.lliiIlIlIi;
      }
   }

   public boolean IilliliilIIi() {
      return this.liIiIlIlIi;
   }

   // $FF: synthetic method
   private static CallSite lllIiillIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '迴') << 4 | (char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '迴') >>> 12) - var5) - var5) ^ '\uf081') - 17307) + var5) - '鴣') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '迴') << 4 | (char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '迴') >>> 12) - var5) - var5) ^ '\uf081') - 17307) + var5) - '鴣') >>> 12))) + '鲹') + var5) + 21907));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iilililiiili() {
      ++this.IIIiIlIlIi;
      ++this.iIIiIlIlIi.lliIliiIil;
      this.IlIiIlIlIi = 0;
      this.llIiIlIlIi = 0;
      this.ilIiIlIlIi = 0;
      this.IiIiIlIlIi = 0;
      this.IiliIlIlIi.clear();
      this.illiIlIlIi.clear();
      this.iiliIlIlIi.clear();
      this.IIliIlIlIi = 0;
      this.lIliIlIlIi = 0;
      this.iIliIlIlIi = true;
      this.IlliIlIlIi = Integer.MIN_VALUE;
      this.IliiIlIlIi = Integer.MIN_VALUE;
      this.iiIiIlIlIi = lIlilliliIlillil.illIlIIlil;
   }

   public boolean IiIlliIliiIl(class_2338 centre) {
      return centre != null && this.lIiiIlIlIi.contains(centre.method_10063());
   }

   public boolean iilllIIill(lilIIliilIIl x, int y, int w, int z) {
      IIIiliilIIilii var10001 = this.lIIiIlIlIi.IilliliilIIi();
      class_2350.class_2351 var10005 = this.lIIiIlIlIi.IiIlliIliiIl();
      Iiiiliiliiilii var10006 = this.lIIiIlIlIi;
      Objects.requireNonNull(var10006);
      return lilillliililll.Iilililiiili(x, var10001, y, w, z, var10005, var10006::IiiIlliiIl, this.ilillIiill(), this.lIilliIill());
   }

   private static class_2338 lllllillll(class_2338 c, class_2350.class_2351 d2, int a2, class_2350.class_2351 d1, int a1, class_2350.class_2351 a3, int d3) {
      long var10 = -2531058565612274996L;
      long var12 = -7754220252408482867L;
      var10 ^= ((long)c.method_10263() << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)c.method_10264() ^ var10) & -1L >>> 32;
      var12 ^= ((long)c.method_10260() << 32 ^ var12) & -1L << 32;
      switch (d2) {
         case field_11048 -> var10 ^= ((long)((int)(var10 >>> 32) + a2) << 32 ^ var10) & -1L << 32;
         case field_11052 -> var10 ^= ((long)((int)var10 + a2) ^ var10) & -1L >>> 32;
         case field_11051 -> var12 ^= ((long)((int)(var12 >>> 32) + a2) << 32 ^ var12) & -1L << 32;
      }

      switch (d1) {
         case field_11048 -> var10 ^= ((long)((int)(var10 >>> 32) + a1) << 32 ^ var10) & -1L << 32;
         case field_11052 -> var10 ^= ((long)((int)var10 + a1) ^ var10) & -1L >>> 32;
         case field_11051 -> var12 ^= ((long)((int)(var12 >>> 32) + a1) << 32 ^ var12) & -1L << 32;
      }

      switch (a3) {
         case field_11048 -> var10 ^= ((long)((int)(var10 >>> 32) + d3) << 32 ^ var10) & -1L << 32;
         case field_11052 -> var10 ^= ((long)((int)var10 + d3) ^ var10) & -1L >>> 32;
         case field_11051 -> var12 ^= ((long)((int)(var12 >>> 32) + d3) << 32 ^ var12) & -1L << 32;
      }

      return new class_2338((int)(var10 >>> 32), (int)var10, (int)(var12 >>> 32));
   }

   private boolean IiIiliIiiiIi(lilIIliilIIl w) {
      if (++this.IiIiIlIlIi < this.lIIiIlIlIi.IIillIiliIil()) {
         this.iiIiIlIlIi = lIlilliliIlillil.lilIlIIlil;
         return true;
      } else {
         this.IiIiIlIlIi = this.lIIiIlIlIi.IIillIiliIil() - 1;
         if (!this.IIiiIlIlIi.isEmpty()) {
            this.iiIiIlIlIi = lIlilliliIlillil.iIiIlIIlil;
            return false;
         } else if (this.Ililllililil(w, this.illIlIilIl(), this.lilIliilIl())) {
            return false;
         } else {
            this.IiIiIlIlIi = 0;
            this.iiIiIlIlIi = lIlilliliIlillil.lliIlIIlil;
            if (this.Iiiiliiiiiii(w)) {
               if (this.IIliIlIlIi++ < 2) {
                  this.IiliIlIlIi.clear();
                  this.iIliIlIlIi = true;
                  ++this.iIIiIlIlIi.lllIliiIil;
                  this.iiIiIlIlIi = lIlilliliIlillil.lilIlIIlil;
                  return true;
               }

               this.IiIIlliIIl(this.iIIIlIlIIl(w), this.illIlIilIl(), this.lilIliilIl());
            }

            ++this.iIIiIlIlIi.iiIIliiIil;
            this.IIliIlIlIi = 0;
            this.iIliIlIlIi = false;
            this.IiliIlIlIi.clear();
            return this.IIlilIliiIli(w);
         }
      }
   }

   private lilIIliilIIl iIIIlIlIIl(lilIIliilIIl fallback) {
      return this.iliiIlIlIi != null ? this.iliiIlIlIi : fallback;
   }

   private class_2338 IlIillIiilIi(lilIIliilIIl w, class_2338 centre) {
      if (w.liiiIIllIl(centre.method_10263(), centre.method_10264(), centre.method_10260())) {
         return w.IilliliilIIi(centre.method_10263(), centre.method_10264(), centre.method_10260()) ? null : centre;
      } else {
         class_2338[] var3 = new class_2338[]{null};
         IiIIIlIiliIIIlIi.liiiIIllIl(centre, class_2350.method_10169(this.lIIiIlIlIi.IiIlliIliiIl(), class_2352.field_11056), (out, wx, z) -> {
            if (var3[0] == null && w.liiiIIllIl(out, wx, z) && !w.IilliliilIIi(out, wx, z)) {
               var3[0] = new class_2338(out, wx, z);
            }

         });
         return var3[0];
      }
   }
}
