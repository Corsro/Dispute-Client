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
import java.util.function.IntPredicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IiilIiiliilIii {
   private iiiliillIIIiiill iIiIIIiIIl;
   private final int[] IIiIIIiIIl;
   public static final double IllIIIiIIl = (double)1.5F;
   private final int[] lilIIIiIIl;
   public int liiIIIiIIl;
   public int lIIlIIiIIl;
   private int IliIIIiIIl;
   public static final int iIlIIIiIIl = 1;
   private String IlIlIIiIIl;
   public static final int IIlIIIiIIl = 30;
   private int iliIIIiIIl;
   public static final int lIlIIIiIIl = 4;
   public int iIIlIIiIIl;
   private int lliIIIiIIl;
   private final byte[] lIiIIIiIIl;
   public static final double iiIIIIiIIl = 1.6;
   public static final double lllIIIiIIl = 1.3;
   public int iiiIIIiIIl;
   public int IIIlIIiIIl;
   private final lilliIIiiilliIIi illIIIiIIl;
   private final int[] iilIIIiIIl;
   private final iiIIIilIIlIIil[] IilIIIiIIl;
   public int IiiIIIiIIl;
   public static final double liIIIIiIIl = 2.2;

   public lilliIIiiilliIIi iIlIlllllill() {
      return this.illIIIiIIl;
   }

   public void IIiilIiiiIii(int tick, IntPredicate placed) {
      long var9 = 1379802981526675048L;
      long var11 = 5846345031956031217L;

      for(var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < this.IilIIIiIIl.length; var9 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var9 >>> 32)] == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
            if (placed.test((int)(var9 >>> 32))) {
               this.IilIIIiIIl[(int)(var9 >>> 32)] = iiIIIilIIlIIil.liiiillIiiiiiillIi;
               ++this.IiiIIIiIIl;
               this.iliIIIiIIl = tick;
            } else if (tick - this.lilIIIiIIl[(int)(var9 >>> 32)] > 30) {
               int[] var10000 = this.iilIIIiIIl;
               int var10001 = (int)(var9 >>> 32);
               int var10003 = var10000[(int)(var9 >>> 32)];
               var10000[var10001] = var10000[(int)(var9 >>> 32)] + 1;
               if (var10003 < 1) {
                  this.IilIIIiIIl[(int)(var9 >>> 32)] = iiIIIilIIlIIil.IliiillIilliiillIi;
                  this.lilIIIiIIl[(int)(var9 >>> 32)] = 0;
                  ++this.iiiIIIiIIl;
               } else {
                  this.IilIIIiIIl[(int)(var9 >>> 32)] = iiIIIilIIlIIil.iIIIIilIiIlIIIilIi;
                  ++this.IIIlIIiIIl;
               }
            }
         }
      }

      var9 ^= (0L ^ var9) & -1L << 32;
      var9 ^= (0L ^ var9) & -1L >>> 32;
      iiIIIilIIlIIil[] var5 = this.IilIIIiIIl;
      var11 ^= ((long)var5.length << 32 ^ var11) & -1L << 32;

      for(long var17 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         iiIIIilIIlIIil var8 = var5[(int)var17];
         if (var8 == iiIIIilIIlIIil.IliiillIilliiillIi) {
            var9 ^= (4294967296L ^ var9) & -1L << 32;
         }

         if (var8 == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
            var9 ^= (1L ^ var9) & -1L >>> 32;
         }
      }

      if (this.iIiIIIiIIl == iiiliillIIIiiill.IlIIiiiill && (int)(var9 >>> 32) == 0) {
         this.iIiIIIiIIl = (int)var9 != 0 ? iiiliillIIIiiill.llIIiiiill : iiiliillIIIiiill.ilIIiiiill;
      }

      if (this.iIiIIIiIIl == iiiliillIIIiiill.llIIiiiill && (int)var9 == 0) {
         this.iIiIIIiIIl = iiiliillIIIiiill.ilIIiiiill;
      }

   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) << 15 | (char)(-((char)((char)(-var4[var5]) - var5))) >>> 1))))) + 32730) + 'ￃ') << 4 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) << 15 | (char)(-((char)((char)(-var4[var5]) - var5))) >>> 1))))) + 32730) + 'ￃ') >>> 12) << 3 | (char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) << 15 | (char)(-((char)((char)(-var4[var5]) - var5))) >>> 1))))) + 32730) + 'ￃ') << 4 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) << 15 | (char)(-((char)((char)(-var4[var5]) - var5))) >>> 1))))) + 32730) + 'ￃ') >>> 12) >>> 13))) ^ 10505));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Ililllililil() {
      long var2 = 4397866344984332067L;

      for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.IilIIIiIIl.length; var4 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var4 >>> 32)] == iiIIIilIIlIIil.IliiillIilliiillIi) {
            return (int)(var4 >>> 32);
         }
      }

      return -1;
   }

   public int IliIlllilIi(int i) {
      return i >= 0 && i < this.lilIIIiIIl.length && this.lilIIIiIIl[i] > 0 ? 1 : 0;
   }

   public double Iiilliiliiil() {
      long var3 = 5696436680655697113L;

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IilIIIiIIl.length; var5 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var5 >>> 32)] == iiIIIilIIlIIil.IliiillIilliiillIi) {
            return this.IIlllIlliIll((int)(var5 >>> 32));
         }
      }

      long var1 = this.illIIIiIIl.Iilllilliill();
      return (double)(this.illIIIiIIl.IIIllIIliIIl() == 0 ? llIiIiililIiIiil.IiIlliIliiIl(var1) : llIiIiililIiIiil.Illlllllilll(var1)) + (double)0.5F;
   }

   public void Iliilliiilii(int i, String why) {
      if (this.IilIIIiIIl[i] == iiIIIilIIlIIil.IliiillIilliiillIi || this.IilIIIiIIl[i] == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
         this.IilIIIiIIl[i] = iiIIIilIIlIIil.iIIIIilIiIlIIIilIi;
         ++this.IIIlIIiIIl;
         this.IlIlIIiIIl = why;
      }

   }

   public void Illillliilli(int i) {
      if (this.lIiIIIiIIl[i] == 1) {
         this.lIiIIIiIIl[i] = 2;
      }

   }

   public List<Long> iiIIlIIlIl() {
      long var3 = -5753437763816428370L;
      ArrayList var1 = new ArrayList();

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IilIIIiIIl.length; var5 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var5 >>> 32)] != iiIIIilIIlIIil.liiiillIiiiiiillIi) {
            var1.add(((lilIlilliilIlill)this.illIIIiIIl.iliIiiliiiii().get((int)(var5 >>> 32))).IliIlllilIi());
         }
      }

      return var1;
   }

   public void IlIlllIlilIl(int tick) {
      this.iIiIIIiIIl = iiiliillIIIiiill.IlIIiiiill;
      this.iliIIIiIIl = tick;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 24465) + var5))) - 30603) << 2 | (char)((char)(-((char)((char)(var4[var5] - 24465) + var5))) - 30603) >>> 14) ^ 15711) - var5) << 11 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 24465) + var5))) - 30603) << 2 | (char)((char)(-((char)((char)(var4[var5] - 24465) + var5))) - 30603) >>> 14) ^ 15711) - var5) >>> 5))) + var5) - '鷟') ^ var5))) - '\uf54b'))) - var5) - 26664));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiiliillIIIiiill IilliliilIIi() {
      return this.iIiIIIiIIl;
   }

   public int IiIIlliIIl() {
      long var6 = 8279033371384102737L;
      long var8 = -1442369537785328313L;
      var6 ^= (0L ^ var6) & -1L << 32;
      iiIIIilIIlIIil[] var2 = this.IilIIIiIIl;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
         iiIIIilIIlIIil var5 = var2[(int)(var12 >>> 32)];
         if (var5 == iiIIIilIIlIIil.IliiillIilliiillIi) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   private double IIlllIlliIll(int i) {
      long var2 = ((lilIlilliilIlill)this.illIIIiIIl.iliIiiliiiii().get(i)).liiiIIllIl();
      return (double)(this.illIIIiIIl.IIIllIIliIIl() == 0 ? llIiIiililIiIiil.IiIlliIliiIl(var2) : llIiIiililIiIiil.Illlllllilll(var2)) + (double)0.5F;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - 8088) - var5) << 6 | (char)((char)(var4[var5] - 8088) - var5) >>> 10) << 4 | (char)((char)((char)(var4[var5] - 8088) - var5) << 6 | (char)((char)(var4[var5] - 8088) - var5) >>> 10) >>> 12))) - '뽦'))) - var5) + var5))))) ^ 16990) + var5) << 14 | (char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - 8088) - var5) << 6 | (char)((char)(var4[var5] - 8088) - var5) >>> 10) << 4 | (char)((char)((char)(var4[var5] - 8088) - var5) << 6 | (char)((char)(var4[var5] - 8088) - var5) >>> 10) >>> 12))) - '뽦'))) - var5) + var5))))) ^ 16990) + var5) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String lIiiIiIlilli() {
      return this.IlIlIIiIIl;
   }

   public void IlIillIiilIi(int i, int tick) {
      this.IilIIIiIIl[i] = iiIIIilIIlIIil.iliiillIiIiiiillIi;
      this.lilIIIiIIl[i] = tick;
      this.IliIIIiIIl = tick;
      ++this.liiIIIiIIl;
      if (((lilIlilliilIlill)this.illIIIiIIl.iliIiiliiiii().get(i)).iliIiiliiiii()) {
         ++this.lIIlIIiIIl;
      }

      this.iliIIIiIIl = tick;
   }

   public int llIIlilIIl() {
      long var6 = -4838048329979220045L;
      long var8 = 4082527526816880431L;
      var6 ^= (0L ^ var6) & -1L << 32;
      iiIIIilIIlIIil[] var2 = this.IilIIIiIIl;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(long var12 = var8 ^ (0L ^ var8) & -1L << 32; (int)(var12 >>> 32) < (int)var6; var12 += 4294967296L) {
         iiIIIilIIlIIil var5 = var2[(int)(var12 >>> 32)];
         if (var5 == iiIIIilIIlIIil.IliiillIilliiillIi || var5 == iiIIIilIIlIIil.iliiillIiIiiiillIi) {
            var6 += 4294967296L;
         }
      }

      return (int)(var6 >>> 32);
   }

   public int liiiIIllIl(int i) {
      return i >= 0 && i < this.IilIIIiIIl.length && this.IilIIIiIIl[i] == iiIIIilIIlIIil.liiiillIiiiiiillIi ? 1 : 0;
   }

   public double IiIlliIliiIl(double x, double z) {
      return this.illIIIiIIl.IIIllIIliIIl() == 0 ? x : z;
   }

   public IiilIiiliilIii(lilliIIiiilliIIi run) {
      this.iIiIIIiIIl = iiiliillIIIiiill.iIIIiiiill;
      this.IliIIIiIIl = -1000;
      this.IlIlIIiIIl = "";
      this.illIIIiIIl = run;
      this.IilIIIiIIl = new iiIIIilIIlIIil[run.IliIlllilIi()];
      this.lilIIIiIIl = new int[run.IliIlllilIi()];
      this.iilIIIiIIl = new int[run.IliIlllilIi()];
      this.IIiIIIiIIl = new int[run.IliIlllilIi()];
      this.lIiIIIiIIl = new byte[run.IliIlllilIi()];
      Arrays.fill(this.IilIIIiIIl, iiIIIilIIlIIil.IliiillIilliiillIi);
      Arrays.fill(this.IIiIIIiIIl, -1000);
   }

   public void iIIIlIlIIl(String why) {
      this.iIiIIIiIIl = iiiliillIIIiiill.IiIIiiiill;
      this.IlIlIIiIIl = why;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) << 9 | (char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) >>> 7) ^ var5) ^ 12136))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) << 9 | (char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) >>> 7) ^ var5) ^ 12136))) >>> 7) - var5) + var5) - '\uf1c5'))) + var5) << 8 | (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) << 9 | (char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) >>> 7) ^ var5) ^ 12136))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) << 9 | (char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) >>> 11 | (char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) << 5) >>> 7) ^ var5) ^ 12136))) >>> 7) - var5) + var5) - '\uf1c5'))) + var5) >>> 8) ^ var5) ^ var5) - var5)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilililiiili(int i) {
      return this.IIiIIIiIIl[i];
   }

   public double IIillIiliIil(int bodyZ, double i, double bodyX) {
      return (this.IIlllIlliIll(bodyZ) - this.IiIlliIliiIl(i, bodyX)) * (double)this.illIIIiIIl.IlIlllIlilIl();
   }

   public void IiIiliIiiiIi(int tick, int i) {
      if (this.lIiIIIiIIl[tick] != 1) {
         this.lIiIIIiIIl[tick] = 1;
         ++this.iIIlIIiIIl;
      }

      this.IIiIIIiIIl[tick] = i;
   }

   public boolean Iiiiliiiiiii(int tick, int ticks) {
      return this.iIiIIIiIIl == iiiliillIIIiiill.IlIIiiiill && tick - this.iliIIIiIIl > ticks;
   }

   public boolean IIIilIIiiIIi(int tick) {
      return tick - this.IliIIIiIIl >= 4;
   }

   public void IIIIllIIIl(int tick) {
      this.iliIIIiIIl = tick;
   }

   public int IIIllIIliIIl(int i) {
      return this.lilIIIiIIl[i];
   }

   public boolean Iilllilliill(int i) {
      long var4 = -8451663940643030283L;
      lilIlilliilIlill var2 = (lilIlilliilIlill)this.illIIIiIIl.iliIiiliiiii().get(i);
      var4 ^= ((long)(this.illIIIiIIl.IIIllIIliIIl() == 0 ? llIiIiililIiIiil.Illlllllilll(var2.IliIlllilIi()) - llIiIiililIiIiil.Illlllllilll(var2.liiiIIllIl()) : llIiIiililIiIiil.IiIlliIliiIl(var2.IliIlllilIi()) - llIiIiililIiIiil.IiIlliIliiIl(var2.liiiIIllIl())) << 32 ^ var4) & -1L << 32;
      return Math.abs((int)(var4 >>> 32)) >= 2;
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1879529694030256378L ^ Long.rotateLeft(7909117384436681091L, 37) ^ 2620296070909571256L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6332858997559070561L ^ Long.rotateLeft(-7683328593464544015L, 38) ^ 894143759437949654L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9072319274491019852L ^ Long.rotateLeft(-5816747190969368058L, 54) ^ -7309430851452073991L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4678607109297033217L ^ Long.rotateLeft(3229869735584663690L, 26) ^ 4779016736473374880L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3967003053618266757L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3058050762422497116L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1909162015035227333L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6418261832751216471L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1165602832090815853L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4372506261513709831L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iIiIlIliIl<invokedynamic>());
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

   public boolean IIlilIliiIli(int i) {
      return this.lIiIIIiIIl[i] == 1;
   }

   public int Illlllllilll(double bodyX, double bodyZ) {
      long var15 = 7214077862120651074L;
      double var5 = this.IiIlliIliiIl(bodyX, bodyZ);

      for(long var17 = var15 ^ (0L ^ var15) & -1L << 32; (int)(var17 >>> 32) < this.IilIIIiIIl.length; var17 += 4294967296L) {
         if (this.IilIIIiIIl[(int)(var17 >>> 32)] == iiIIIilIIlIIil.IliiillIilliiillIi) {
            double var8 = (this.IIlllIlliIll((int)(var17 >>> 32)) - var5) * (double)this.illIIIiIIl.IlIlllIlilIl();
            var17 ^= ((long)this.Iilllilliill((int)(var17 >>> 32)) ^ var17) & -1L >>> 32;
            double var11 = (int)var17 != 0 ? (double)1.5F : 2.2;
            double var13 = (int)var17 != 0 ? 1.3 : 1.6;
            if (var8 >= -var13 && var8 <= var11) {
               return (int)(var17 >>> 32);
            }

            if (var8 > var11) {
               return -1;
            }
         }
      }

      return -1;
   }

   public String lIlIliIlIl(int tick) {
      return String.format(Locale.ROOT, IllIllllIl<invokedynamic>(), this.illIIIiIIl.lIiiIiIlilli(), this.iIiIIIiIIl, this.illIIIiIIl.IliIlllilIi(), this.IiiIIIiIIl, this.liiIIIiIIl, this.lIIlIIiIIl, this.iIIlIIiIIl, this.iiiIIIiIIl, this.IIIlIIiIIl, this.llIIlilIIl(), this.illIIIiIIl.IIIllIIliIIl(), this.illIIIiIIl.IlIlllIlilIl(), this.IlIlIIiIIl);
   }

   public iiIIIilIIlIIil iliIiiliiiii(int i) {
      return this.IilIIIiIIl[i];
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ var5) << 15 | (char)((char)(var4[var5] + var5) ^ var5) >>> 1))) - var5) ^ 26521) + var5) + var5) - '쵪'))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
