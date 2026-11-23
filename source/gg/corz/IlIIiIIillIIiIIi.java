package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1747;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class IlIIiIIillIIiIIi {
   private Predicate<class_2680> IIllIliiil;
   private int iillIliiil;
   private class_2338 ilIlIliiil;
   private boolean IlIlIliiil;
   private int lillIliiil;
   private final int lIIlIliiil;
   private final illlllllIillllll IIIlIliiil;
   public static final int IliIIliiil = 3;
   private class_2680 liIlIliiil;
   private boolean IlllIliiil;
   public static final int liiIIliiil = 2;
   private static final class_2350[] iiiIIliiil = class_2350.values();
   private long llllIliiil;
   private boolean llIlIliiil;
   public static final double lIiIIliiil = 1.9;
   private int IiIlIliiil;
   private int IillIliiil;
   public static final double iliIIliiil = (double)720.0F;
   private String lIilIliiil;
   public static final int iIiIIliiil = 1;
   public static final double lliIIliiil = (double)360.0F;
   private int lIllIliiil;
   private final boolean iIIlIliiil;
   public static final int IiiIIliiil = 40;
   private class_2338 iiIlIliiil;
   private int illlIliiil;
   private class_3965 iIllIliiil;
   private long IIilIliiil;

   private lilIillliilIilll Iiilliiliiil(String reason) {
      this.IlIillIiilIi();
      this.lIilIliiil = reason;
      return lilIillliilIilll.iIIllIlill;
   }

   public IlIIiIIillIIiIIi(illlllllIillllll entityWaitMax, int host, boolean deep) {
      this.IiIlIliiil = -1;
      this.IIIlIliiil = entityWaitMax;
      this.lIIlIliiil = host;
      this.iIIlIliiil = deep;
   }

   public String IIlllIlliIll() {
      return this.lIilIliiil;
   }

   private void IlIillIiilIi() {
      this.IlIlIliiil = false;
      this.llIlIliiil = false;
      this.ilIlIliiil = null;
      this.IiIlIliiil = -1;
      this.liIlIliiil = null;
      this.iiIlIliiil = null;
      this.IIllIliiil = null;
      this.lIllIliiil = 0;
      this.iIllIliiil = null;
      this.IlllIliiil = false;
      this.llllIliiil = 0L;
      this.illlIliiil = 0;
      this.IillIliiil = 0;
      this.lillIliiil = 0;
      this.iillIliiil = 0;
   }

   private void IIIilIIiiIIi() {
      this.IlIillIiilIi();
      this.lIilIliiil = null;
   }

   public boolean IliIlllilIi(class_2338 cell, int confirmTicks, class_2680 avoidSupport, class_2338 expect, int slot) {
      if (!this.IlIlIliiil && cell != null && avoidSupport != null && confirmTicks >= 0 && confirmTicks <= 8) {
         this.IlIillIiilIi();
         this.lIilIliiil = null;
         this.llIlIliiil = false;
         this.ilIlIliiil = cell.method_10062();
         this.IiIlIliiil = confirmTicks;
         this.liIlIliiil = avoidSupport;
         this.iiIlIliiil = expect == null ? null : expect.method_10062();
         this.lIllIliiil = Math.max(1, slot);
         this.IlIlIliiil = true;
         return true;
      } else {
         return false;
      }
   }

   public boolean iliIiiliiiii() {
      return this.IlIlIliiil && this.iIllIliiil != null;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) >>> 14 | (char)((char)(var4[var5] + var5) + var5) << 2) - var5) + '逴') << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) + var5) >>> 14 | (char)((char)(var4[var5] + var5) + var5) << 2) - var5) + '逴') >>> 10) + var5) + var5) ^ var5) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) >>> 14 | (char)((char)(var4[var5] + var5) + var5) << 2) - var5) + '逴') << 6 | (char)((char)((char)((char)((char)(var4[var5] + var5) + var5) >>> 14 | (char)((char)(var4[var5] + var5) + var5) << 2) - var5) + '逴') >>> 10) + var5) + var5) ^ var5) ^ var5) << 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli() {
      return this.IlIlIliiil;
   }

   public IlIIiIIillIIiIIi(illlllllIillllll host) {
      this(host, Integer.MAX_VALUE);
   }

   public lilIillliilIilll iIlIlllllill() {
      if (!this.IlIlIliiil) {
         return lilIillliilIilll.IiiIlIlill;
      } else {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         class_638 var3 = var1.field_1687;
         if (var2 != null && var3 != null) {
            label166: {
               class_2680 var4 = var3.method_8320(this.ilIlIliiil);
               if (this.llIlIliiil) {
                  if (this.IIllIliiil.test(var4)) {
                     break label166;
                  }
               } else if (var4.method_27852(this.liIlIliiil.method_26204())) {
                  break label166;
               }

               if (!this.llIlIliiil && !lliiIliliiIl.lIiiIiIlilli(this.ilIlIliiil)) {
                  return this.Iiilliiliiil(IiIiliIiiiIi<invokedynamic>());
               }

               float var5 = this.IIIlIliiil.IliIlllilIi();
               float var6 = this.IIIlIliiil.liiiIIllIl();
               long var7 = this.IIIlIliiil.IIillIiliIil();
               if (this.IlllIliiil) {
                  if (var7 - this.llllIliiil <= (long)this.lIllIliiil) {
                     this.IIIlIliiil.iliIiiliiiii(var5, var6);
                     return lilIillliilIilll.iiiIlIlill;
                  }

                  if (this.illlIliiil >= 1) {
                     return this.Iiilliiliiil(IiIiliIiiiIi<invokedynamic>());
                  }

                  ++this.illlIliiil;
                  this.IlllIliiil = false;
                  this.iIllIliiil = null;
               }

               double var9 = this.IIIlIliiil.Iilllilliill();
               class_243 var11 = var2.method_33571();
               if (this.iIllIliiil == null || !this.Illlllllilll(this.iIllIliiil, var11, var9)) {
                  this.iIllIliiil = this.IIillIiliIil(var11, var9, var5, var6);
                  if (this.iIllIliiil == null) {
                     if (++this.IillIliiil >= 3) {
                        return this.Iiilliiliiil(IiIiliIiiiIi<invokedynamic>());
                     }

                     this.IIIlIliiil.lIiiIiIlilli(class_243.method_24953(this.ilIlIliiil), false);
                     return lilIillliilIilll.liiIlIlill;
                  }
               }

               this.IillIliiil = 0;
               if (!this.llIlIliiil && iliilliIiiilli.IiIiliIiiiIi(this.iIllIliiil.method_17777())) {
                  class_3965 var12 = this.IIillIiliIil(var11, var9, var5, var6);
                  if (var12 != null && !iliilliIiiilli.IiIiliIiiiIi(var12.method_17777())) {
                     this.iIllIliiil = var12;
                  }
               }

               if (!this.llIlIliiil && iliilliIiiilli.IiIiliIiiiIi(this.iIllIliiil.method_17777())) {
                  iliilliIiiilli.Iilililiiili(true);
                  this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                  return lilIillliilIilll.iiiIlIlill;
               }

               if (this.Iilllilliill(var2)) {
                  if (++this.lillIliiil > 40) {
                     return this.Iiilliiliiil(IiIiliIiiiIi<invokedynamic>());
                  }

                  iliilliIiiilli.Iilililiiili(false);
                  this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                  return lilIillliilIilll.iiiIlIlill;
               }

               if (!this.llIlIliiil && iliilliIiiilli.Iiilliiliiil(this.ilIlIliiil, iliilliIiiilli.IIillIiliIil())) {
                  if (++this.iillIliiil > this.lIIlIliiil) {
                     return this.Iiilliiliiil(IiIiliIiiiIi<invokedynamic>());
                  }

                  this.IIilIliiil = var7;
                  iliilliIiiilli.Iilililiiili(true);
                  this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                  return lilIillliilIilll.iiiIlIlill;
               }

               if (this.IIIlIliiil.Iiilliiliiil()) {
                  return this.IilliliilIIi(var2, var3, var9, var5, var6, var7);
               }

               if (!this.IIIlIliiil.IlIlllIlilIl(this.IiIlIliiil)) {
                  this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                  return lilIillliilIilll.iiiIlIlill;
               }

               class_2350 var17 = this.llIlIliiil ? null : this.iIllIliiil.method_17780();
               class_3965 var13 = IiIiiiilliIiiiil.IliIlllilIi(this.iIllIliiil.method_17777(), var17, var9, var5, var6);
               if (var13 == null) {
                  this.IIIlIliiil.lIiiIiIlilli(this.iIllIliiil.method_17784(), false);
                  return lilIillliilIilll.liiIlIlill;
               }

               if (this.IIIlIliiil.IilliliilIIi() > 1.9) {
                  float[] var18 = lllIliIlillIliIl.iIlllIllll(var11, var5, var6, var13.method_17777(), var17, IilIIilllilIIill.iIlIlllllill());
                  if (var18 != null) {
                     this.IIIlIliiil.iliIiiliiiii(var18[0], var18[1]);
                  } else {
                     this.IIIlIliiil.iliIiiliiiii(var5, var6);
                  }

                  return lilIillliilIilll.iiiIlIlill;
               }

               lIIiIiiIIiIi var14 = this.IIIlIliiil.Illlllllilll();
               long var15 = this.IIIlIliiil.Ililllililil();
               if (this.IIIlIliiil.iIlIlllllill() && this.IIIlIliiil.IIIllIIliIIl() && (var14 == null || var14.Ililllililil(var7) && !var14.Iiilliiliiil(var5, var6, var15)) && (this.llIlIliiil || var3.method_8628(this.liIlIliiil, this.ilIlIliiil, class_3726.method_16194())) && (!this.llIlIliiil || !this.IIIlIliiil.IiIlliIliiIl() && !var2.method_21823())) {
                  IiIiiiilliIiiiil.iliIiiliiiii(var13);
                  if (var14 != null) {
                     var14.IilliliilIIi(var15, var7, var5, var6);
                  }

                  this.IIIlIliiil.iliIiiliiiii(var5, var6);
                  this.IlllIliiil = true;
                  this.llllIliiil = var7;
                  return lilIillliilIilll.IIIllIlill;
               }

               this.IIIlIliiil.iliIiiliiiii(var5, var6);
               return lilIillliilIilll.iiiIlIlill;
            }

            this.IIIilIIiiIIi();
            return lilIillliilIilll.lIIllIlill;
         } else {
            return this.Iiilliiliiil(IiIiliIiiiIi<invokedynamic>());
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '귻') - var5) ^ var5) ^ var5) - 5222) ^ var5) - 'ꍋ') ^ var5))) ^ '鸐') - var5) << 9 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '귻') - var5) ^ var5) ^ var5) - 5222) ^ var5) - 'ꍋ') ^ var5))) ^ '鸐') - var5) >>> 7) + '覗'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private class_3965 IIillIiliIil(class_243 reach, double eye, float sp, float sy) {
      long var19 = -8944193111232386452L;
      if (this.llIlIliiil) {
         return this.Ililllililil(IiIiiiilliIiiiil.iIlIlllllill(this.ilIlIliiil, eye, sp, sy), iiiIIliiil, (class_2350)null, eye, sp, sy);
      } else {
         class_3965 var6 = null;
         double var7 = Double.MAX_VALUE;
         class_2350[] var9 = iiiIIliiil;
         var19 ^= ((long)var9.length << 32 ^ var19) & -1L << 32;

         for(long var22 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var22 < (int)(var22 >>> 32); var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            class_2350 var12 = var9[(int)var22];
            class_2338 var13 = this.ilIlIliiil.method_10093(var12);
            if (!var13.equals(this.iiIlIliiil) && !lliiIliliiIl.lIiiIiIlilli(var13)) {
               class_2350 var14 = var12.method_10153();
               if (lllIliIlillIliIl.IIillIiliIil(var13, var14)) {
                  class_3965 var15 = IiIiiiilliIiiiil.liiiIIllIl(var13, new class_2350[]{var14}, var14, eye, sp, sy);
                  if (var15 != null) {
                     float[] var16 = ilIiiIiIii.Ililllililil(reach, var15.method_17784());
                     double var17 = liiIIliliiiIIlil.Iilllilliill(sp, sy, var16[0], var16[1]) + (iliilliIiiilli.lIiiIiIlilli(var13) ? (double)360.0F : (double)0.0F) + (iliilliIiiilli.IiIiliIiiiIi(var13) ? (double)720.0F : (double)0.0F);
                     if (var17 < var7) {
                        var7 = var17;
                        var6 = var15;
                     }
                  }
               }
            }
         }

         if (var6 == null) {
            return null;
         } else {
            return this.Ililllililil(var6, new class_2350[]{var6.method_17780()}, var6.method_17780(), eye, sp, sy);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) >>> 2 | (char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) << 14))) - 6852) + var5) - var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) >>> 2 | (char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) << 14))) - 6852) + var5) - var5) << 8))))))) + var5))) >>> 10 | (char)(~((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) >>> 2 | (char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) << 14))) - 6852) + var5) - var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) >>> 2 | (char)(-((char)((char)((char)(var4[var5] - 14959) - '쁡') + 17327))) << 14))) - 6852) + var5) - var5) << 8))))))) + var5))) << 6) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lilIillliilIilll IilliliilIIi(class_746 sy, class_638 reach, double tick, float sp, float player, long world) {
      class_2350 var9 = this.llIlIliiil ? null : this.iIllIliiil.method_17780();
      class_3965 var10 = IiIiiiilliIiiiil.IliIlllilIi(this.iIllIliiil.method_17777(), var9, tick, sp, player);
      if (var10 == null) {
         this.IIIlIliiil.IlIillIiilIi(this.iIllIliiil.method_17784());
         return lilIillliilIilll.liiIlIlill;
      } else {
         lIIiIiiIIiIi var11 = this.IIIlIliiil.Illlllllilll();
         long var12 = this.IIIlIliiil.Ililllililil();
         if (this.IIIlIliiil.iIlIlllllill() && this.IIIlIliiil.IIIllIIliIIl() && (var11 == null || var11.Ililllililil(world)) && (this.llIlIliiil || reach.method_8628(this.liIlIliiil, this.ilIlIliiil, class_3726.method_16194())) && (!this.llIlIliiil || !this.IIIlIliiil.IiIlliIliiIl() && !sy.method_21823())) {
            if (!this.IIIlIliiil.IIIilIIiiIIi(this.IiIlIliiil)) {
               this.IIIlIliiil.iliIiiliiiii(sp, player);
               return lilIillliilIilll.iiiIlIlill;
            } else {
               IiIiiiilliIiiiil.iliIiiliiiii(var10);
               if (var11 != null) {
                  var11.lIiiIiIlilli(var12, world, sp, player, true);
               }

               this.IIIlIliiil.iliIiiliiiii(sp, player);
               this.IlllIliiil = true;
               this.llllIliiil = world;
               return lilIillliilIilll.IIIllIlill;
            }
         } else {
            this.IIIlIliiil.iliIiiliiiii(sp, player);
            return lilIillliilIilll.iiiIlIlill;
         }
      }
   }

   private class_3965 Ililllililil(class_3965 sp, class_2350[] faces, class_2350 sy, double reach, float near, float side) {
      return this.iIIlIliiil && sp != null ? IiIiiiilliIiiiil.IilliliilIIi(sp, faces, sy, reach, near, side, this.ilIlIliiil, lIlllIIliIlllIIl.liiiIIllIl()) : sp;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7729966362917906031L ^ Long.rotateLeft(724800641299774091L, 49) ^ 7200687252632828404L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2503868549454613494L ^ Long.rotateLeft(7385219503532297947L, 17) ^ -1712681802352313159L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6029147779310144946L ^ Long.rotateLeft(6016695677763509992L, 18) ^ 6612166522391328679L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7433026121446743839L ^ Long.rotateLeft(-4013289214620761761L, 20) ^ -5438621079991082960L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6038116778151329111L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4155190497214087091L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1393510165322125090L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4158270274403394288L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1841397667265952084L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7039891200090121483L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 9836) - 16801) << 8 | (char)((char)(var4[var5] - 9836) - 16801) >>> 8) ^ 16324) + '뱴') + var5))) + var5) + var5) << 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 9836) - 16801) << 8 | (char)((char)(var4[var5] - 9836) - 16801) >>> 8) ^ 16324) + '뱴') + var5))) + var5) + var5) >>> 5))) - 27533));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlIIiIIillIIiIIi(illlllllIillllll entityWaitMax, int host) {
      this(entityWaitMax, host, false);
   }

   public boolean IIIllIIliIIl() {
      return this.IlIlIliiil && !this.llIlIliiil && this.iillIliiil > 0 && this.IIIlIliiil.IIillIiliIil() - this.IIilIliiil <= 1L;
   }

   public boolean liiiIIllIl(class_2338 slot, int confirmTicks, Predicate<class_2680> done, int block) {
      if (!this.IlIlIliiil && slot != null && done != null && confirmTicks >= 0 && confirmTicks <= 8) {
         this.IlIillIiilIi();
         this.lIilIliiil = null;
         this.llIlIliiil = true;
         this.ilIlIliiil = slot.method_10062();
         this.IiIlIliiil = confirmTicks;
         this.IIllIliiil = done;
         this.lIllIliiil = Math.max(1, block);
         this.IlIlIliiil = true;
         return true;
      } else {
         return false;
      }
   }

   private boolean Iilllilliill(class_746 player) {
      if (this.iIllIliiil == null) {
         return false;
      } else if (!this.llIlIliiil) {
         return iliilliIiiilli.lIiiIiIlilli(this.iIllIliiil.method_17777());
      } else {
         return iliilliIiiilli.lIiiIiIlilli(this.ilIlIliiil) && player.method_31548().method_5438(this.IiIlIliiil).method_7909() instanceof class_1747;
      }
   }

   private boolean Illlllllilll(class_3965 reach, class_243 h, double eye) {
      class_2338 var5 = reach.method_17777();
      class_2350 var6 = reach.method_17780();
      if (this.llIlIliiil) {
         if (!var5.equals(this.ilIlIliiil)) {
            return false;
         }
      } else {
         if (!var5.method_10093(var6).equals(this.ilIlIliiil) || var5.equals(this.iiIlIliiil)) {
            return false;
         }

         if (lliiIliliiIl.lIiiIiIlilli(var5) || !lllIliIlillIliIl.IIillIiliIil(var5, var6)) {
            return false;
         }
      }

      class_243 var7 = reach.method_17784();
      if (h.method_1025(var7) > eye * eye) {
         return false;
      } else {
         float[] var8 = ilIiiIiIii.Ililllililil(h, var7);
         return IiIiiiilliIiiiil.IliIlllilIi(var5, this.llIlIliiil ? null : var6, eye, var8[0], var8[1]) != null;
      }
   }

   public void IiIlliIliiIl() {
      this.IlIillIiilIi();
      this.lIilIliiil = null;
   }

   public int IlIlllIlilIl() {
      if (this.IlIlIliiil && this.iIllIliiil != null) {
         class_310 var1 = class_310.method_1551();
         class_746 var2 = var1.field_1724;
         if (var2 != null && var1.field_1687 != null) {
            float var3 = this.IIIlIliiil.IliIlllilIi();
            float var4 = this.IIIlIliiil.liiiIIllIl();
            if (!this.llIlIliiil && iliilliIiiilli.IiIiliIiiiIi(this.iIllIliiil.method_17777())) {
               return 1;
            } else if (IiIiiiilliIiiiil.IliIlllilIi(this.iIllIliiil.method_17777(), this.llIlIliiil ? null : this.iIllIliiil.method_17780(), this.IIIlIliiil.Iilllilliill(), var3, var4) != null) {
               return 0;
            } else {
               float[] var5 = ilIiiIiIii.Ililllililil(var2.method_33571(), this.iIllIliiil.method_17784());
               return (int)Math.ceil(liiIIliliiiIIlil.Iilllilliill(var3, var4, var5[0], var5[1]) / (double)15.0F);
            }
         } else {
            return Integer.MAX_VALUE;
         }
      } else {
         return Integer.MAX_VALUE;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 6481) + var5) - var5) + var5))) - var5) - var5) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 6481) + var5) - var5) + var5))) - var5) - var5) << 8))) - 17610));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
