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
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10185;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1893;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2645;
import net.minecraft.class_304;
import net.minecraft.class_310;
import net.minecraft.class_315;
import net.minecraft.class_746;

public final class liIlIIIliiIlIIIl {
   private final IilIllililIlli lIIliiIlIl;
   private String IliliiIlIl;
   private int iilliiIlIl;
   private class_1309 illliiIlIl;
   private final illIIliIilIIli liIliiIlIl;
   private final ilIiilIlIiIiilIl iIiIiiIlIl = new ilIiilIlIiIiilIl();
   private final iIIIllilIlIIllil iIIliiIlIl;
   private final iIIilIiIlIilIi IliIiiIlIl = new iIIilIiIlIilIi();
   private final IIllllIlll IIiIiiIlIl = new IIllllIlll();
   private final ililIIilIiilIIil llIliiIlIl;
   private static final double IilIiiIlIl = 0.001;
   public static final int iIIIiiIlIl = 40;
   private volatile boolean iiIliiIlIl;
   public static final int lIlIiiIlIl = 12;
   public static final int lIIIiiIlIl = 512;
   private final illillIlIilillIl IiiIiiIlIl;
   private volatile boolean lIlliiIlIl;
   public static final long IIlIiiIlIl = 100L;
   private final lIlilIiiIlilIi lliIiiIlIl = new lIlilIiiIlilIi();
   private static final int lilIiiIlIl = 9;
   private boolean lIiliiIlIl;
   private final iilllIiIIillIi iliIiiIlIl = new iilllIiIIillIi(new Random());
   private boolean IIiliiIlIl;
   private long lliliiIlIl;
   public static final float iiIIiiIlIl = 6.0F;
   private int lilliiIlIl;
   private static volatile boolean IllliiIlIl;
   private final lliliiiililiii iilIiiIlIl;
   private final IIiIIIIllIiIIIIl iiiIiiIlIl;
   private boolean iIiliiIlIl;
   private volatile boolean iIlliiIlIl;
   public static final double ilIIiiIlIl = 1.1;
   private volatile IlillIIillillIIi lllliiIlIl;
   private final liiIiiiiiiIiii liiIiiIlIl;
   private final Illliilllllliill lIiIiiIlIl = new Illliilllllliill();
   public static final double llIIiiIlIl = (double)4.0F;
   public static final int iIlIiiIlIl = 48;
   public static final String IllIiiIlIl = "Sword PvP Bot";
   private final lIlIiIIliIlIiIIl IIIliiIlIl;
   public static final double liIIiiIlIl = (double)4.0F;
   private final lllliIilillliIil IlIliiIlIl;
   public static final long IiIIiiIlIl = 60L;
   private final Iillllllilllll ilIliiIlIl;
   public static final String lllIiiIlIl = "Looking for a player nearby.";
   private final IllilIlllllilIll IiIliiIlIl;
   private lIIIilIliIIIilIl IilliiIlIl;
   public static final double IlIIiiIlIl = (double)8.0F;
   private volatile boolean IIlliiIlIl;
   public static final String illIiiIlIl = "Put a sword in your hotbar.";

   private void Iliilliiilii(class_746 c, long tick, IIIIIlilIIIIli player) {
      float var5 = c.method_36454();
      float var6 = c.method_36455();
      if (player != null) {
         ilIiiIiIii.IliIlllilIi(this.iilIiiIlIl, player.liiiIIllIl(), player.iIlIlllllill(), 95, false);
      }

      if (player != null && !player.lIiiIiIlilli()) {
         this.liiIiiIlIl.IliIlllilIi(tick, var5, var6, player.liiiIIllIl(), player.iIlIlllllill());
      } else {
         this.liiIiiIlIl.liiiIIllIl();
      }

   }

   private void IIIIllIIIl() {
      lIIIililiIIIilil.IlIlllIlilIl(this.iilIiiIlIl);
      this.liiIiiIlIl.liiiIIllIl();
   }

   private String IllIllllIl() {
      return liIlliiIll<invokedynamic>() + this.llIliiIlIl.Illillliilli() + liIlliiIll<invokedynamic>() + this.llIliiIlIl.Iilililiiili() + liIlliiIll<invokedynamic>() + this.llIliiIlIl.Iliilliiilii();
   }

   public void IIIllIIliIIl(iIIlIlIlIlIlIlIl e) {
      this.iiiIiiIlIl.IliIlllilIi(e, this.lIlliiIlIl);
   }

   private long IiIiliIiiiIi(long tick) {
      long var3 = this.ilIliiIlIl.IIillIiliIil();
      return var3 == Long.MIN_VALUE ? 2147483647L : Math.max(0L, tick - var3);
   }

   private static boolean IiiIlliiIl(class_310 mc) {
      long var5 = -3050439789678424788L;
      if (mc.field_1755 == null && mc.field_1690 != null) {
         class_304[] var1 = iiiIlIIIll(mc.field_1690);
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            class_304 var4 = var1[(int)var8];
            if (IillIIIllillIIIl.IliIlllilIi(var4)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public void lIiiIiIlilli(IiIiIlIiliIiIlIi e) {
      long var18 = -3345337414618280431L;
      long var20 = 5129424344951618214L;
      long var22 = -706062378704509038L;
      long var24 = 9115284280228087167L;
      long var26 = 2067837208785792251L;
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1724 != null && var2.method_18854() && !e.lIiiIiIlilli()) {
         class_2596 var3 = e.lIiilIIIIi;
         llIIiiililIIiiil var4 = iIlllillIllllill.IliIlllilIi(var3);
         var18 ^= ((long)this.IiiIiiIlIl.Illlllllilll() << 32 ^ var18) & -1L << 32;
         long var6 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (var4 == llIIiiililIIiiil.IiiliIIiil) {
            this.IIiIiiIlIl.iIlIlllllill();
         } else {
            this.IIiIiiIlIl.IilliliilIIi(var4, (boolean)((int)(var18 >>> 32)), e.IilliliilIIi());
            switch (var4) {
               case IilliIIiil:
                  this.IIiIiiIlIl.lIiiIiIlilli(iIlllillIllllill.liiiIIllIl(var3), (boolean)((int)(var18 >>> 32)));
                  break;
               case lilliIIiil:
               case iilliIIiil:
                  float[] var8 = iIlllillIllllill.iIlIlllllill(var3);
                  if (var8 != null) {
                     this.IIiIiiIlIl.iliIiiliiiii(var8[0], var8[1]);
                  }
                  break;
               case IIiliIIiil:
                  class_10185 var16 = iIlllillIllllill.IilliliilIIi(var3);
                  if (var16 instanceof class_10185) {
                     class_10185 var10000 = var16;

                     try {
                        var51 = var10000.comp_3159();
                     } catch (Throwable var34) {
                        throw new MatchException(var34.toString(), var34);
                     }

                     var18 ^= ((long)var51 ^ var18) & -1L >>> 32;
                     var20 ^= ((long)((int)var18) << 32 ^ var20) & -1L << 32;
                     var10000 = var16;

                     try {
                        var53 = var10000.comp_3160();
                     } catch (Throwable var33) {
                        throw new MatchException(var33.toString(), var33);
                     }

                     var18 ^= ((long)var53 ^ var18) & -1L >>> 32;
                     var20 ^= ((long)((int)var18) ^ var20) & -1L >>> 32;
                     var10000 = var16;

                     try {
                        var55 = var10000.comp_3161();
                     } catch (Throwable var32) {
                        throw new MatchException(var32.toString(), var32);
                     }

                     var18 ^= ((long)var55 ^ var18) & -1L >>> 32;
                     var22 ^= ((long)((int)var18) << 32 ^ var22) & -1L << 32;
                     var10000 = var16;

                     try {
                        var57 = var10000.comp_3162();
                     } catch (Throwable var31) {
                        throw new MatchException(var31.toString(), var31);
                     }

                     var18 ^= ((long)var57 ^ var18) & -1L >>> 32;
                     var22 ^= ((long)((int)var18) ^ var22) & -1L >>> 32;
                     var10000 = var16;

                     try {
                        var59 = var10000.comp_3163();
                     } catch (Throwable var30) {
                        throw new MatchException(var30.toString(), var30);
                     }

                     var18 ^= ((long)var59 ^ var18) & -1L >>> 32;
                     var24 ^= ((long)((int)var18) << 32 ^ var24) & -1L << 32;
                     var10000 = var16;

                     try {
                        var61 = var10000.comp_3164();
                     } catch (Throwable var29) {
                        throw new MatchException(var29.toString(), var29);
                     }

                     var18 ^= ((long)var61 ^ var18) & -1L >>> 32;
                     var24 ^= ((long)((int)var18) ^ var24) & -1L >>> 32;
                     var10000 = var16;

                     try {
                        var63 = var10000.comp_3165();
                     } catch (Throwable var28) {
                        throw new MatchException(var28.toString(), var28);
                     }

                     var18 ^= ((long)var63 ^ var18) & -1L >>> 32;
                     var26 ^= ((long)((int)var18) << 32 ^ var26) & -1L << 32;
                     this.IIiIiiIlIl.IIIllIIliIIl((boolean)((int)(var20 >>> 32)), (boolean)((int)var20), (boolean)((int)(var22 >>> 32)), (boolean)((int)var22), (boolean)((int)(var24 >>> 32)), (boolean)((int)var24), (boolean)((int)(var26 >>> 32)));
                  }
                  break;
               case lIiliIIiil:
                  this.IlIliiIlIl.liiiIIllIl(true, var6);
                  break;
               case iIiliIIiil:
                  this.IlIliiIlIl.liiiIIllIl(false, var6);
                  break;
               case IliliIIiil:
                  this.IIiIiiIlIl.IlIlllIlilIl();
                  break;
               case lliliIIiil:
                  this.IIiIiiIlIl.IiIlliIliiIl();
                  break;
               case liIliIIiil:
                  var26 ^= ((long)((!this.IlIliiIlIl.IilliliilIIi() || !(var2.field_1724.method_7261(0.5F) > 0.9F)) && lIlllIliIlllIl.lIiiIiIlilli(var2.field_1724.method_6047(), class_1893.field_9121) <= 0 ? 0 : 1) ^ var26) & -1L >>> 32;
                  this.IlIliiIlIl.iIlIlllllill((boolean)((int)var26), var6);
            }

         }
      }
   }

   public void Illlllllilll(IIilllilIillli e) {
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null && var2.field_1729 != null) {
         if (var2.field_1729.method_1613() && var2.method_1569() && !iIIilIIiIlIilIIi.lIIlliIIll() && !lilIliIiiilIliIi.iiiIlIIIll()) {
            this.iIiIiiIlIl.IilliliilIIi(e.IliIlllilIi(), e.liiiIIllIl());
         }
      }
   }

   public void IiIlliIliiIl(IiiiIIIlliiiIIIl e) {
      long var7 = -6289498529262915693L;
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null && var2.field_1690 != null && e.liiiIIllIl() == 1) {
         class_304[] var3 = iiiIlIIIll(var2.field_1690);
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            class_304 var6 = var3[(int)var10];
            if (IillIIIllillIIIl.liiiIIllIl(var6, e.IliIlllilIi())) {
               this.iIiIiiIlIl.liiiIIllIl(IIIiillllIIiilll.IliIlllilIi());
               return;
            }
         }

      }
   }

   public static boolean IliIlllilIi() {
      return IllliiIlIl;
   }

   private void llIIlilIIl() {
      this.IIiIiiIlIl.IliIlllilIi();
      this.iliIiiIlIl.liiiIIllIl();
      this.IIIliiIlIl.IliIlllilIi();
      this.IlIliiIlIl.IliIlllilIi();
      this.IiIliiIlIl.IliIlllilIi();
      this.ilIliiIlIl.IilliliilIIi();
      this.llIliiIlIl.IIIllIIliIIl();
      this.lliIiiIlIl.iIlIlllllill();
      this.IliIiiIlIl.IliIlllilIi();
      this.liiIiiIlIl.liiiIIllIl();
      this.illliiIlIl = null;
      this.IilliiIlIl = lIIIilIliIIIilIl.iIIiIlliIl;
      this.lilliiIlIl = 0;
      this.IIiliiIlIl = false;
      this.lIiliiIlIl = false;
      this.iIiliiIlIl = false;
      this.IliliiIlIl = null;
      this.lliliiIlIl = Long.MIN_VALUE;
      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      this.lIlliiIlIl = false;
      IllliiIlIl = false;
   }

   private static String iIiIlIliIl(String s, int max) {
      return s != null && s.length() > max ? s.substring(0, Math.max(0, max - 3)) + liIlliiIll<invokedynamic>() : s;
   }

   // $FF: synthetic method
   private static CallSite IIllllIlll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 25178))) + '꓁') + var5) << 10 | (char)((char)((char)(-((char)(var4[var5] - 25178))) + '꓁') + var5) >>> 6) + var5) + '轠') ^ 14131) + var5) - 23777) ^ '选') >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 25178))) + '꓁') + var5) << 10 | (char)((char)((char)(-((char)(var4[var5] - 25178))) + '꓁') + var5) >>> 6) + var5) + '轠') ^ 14131) + var5) - 23777) ^ '选') << 13))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String lliIliliIl(String name) {
      if (name == null) {
         return null;
      } else {
         String var1 = liIlliIiiiIlliIi.lllllillll(name);
         return var1 == null ? name : var1;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) << 15) << 8 | (char)((char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) << 15) >>> 8) - var5) - var5))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) << 15) << 8 | (char)((char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) >>> 1 | (char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) - var5) ^ var5) << 15) >>> 8) - var5) - var5))) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi() {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && var1.field_1687 != null && var1.field_1761 != null && var1.method_1562() != null) {
         long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
         long var4 = IIIiillllIIiilll.IliIlllilIi();
         IllliiIlIl = this.iiIliiIlIl;
         if (IllliiIlIl) {
            var1.method_61964().method_61939();
         }

         try {
            this.IIIilIIiiIIi(var1, var2, var4);
         } catch (Throwable var7) {
            this.IiIIlliIIl(var7, var4);
         }

      } else {
         this.iiIliiIlIl = false;
         this.IIlliiIlIl = false;
         this.lIlliiIlIl = false;
         IllliiIlIl = false;
         this.lilIliilIl(this.illIlIilIl(liIIiilliiIIiill.iiIIiliill, liIlliiIll<invokedynamic>(), (String)null, liIlliiIll<invokedynamic>()));
      }
   }

   private void IiIIlliIIl(Throwable t, long now) {
      try {
         class_746 var4 = class_310.method_1551().field_1724;
         if (var4 != null && (this.IIiIiiIlIl.Iiilliiliiil() || this.IIiIiiIlIl.IlIillIiilIi())) {
            this.Iliilliiilii(var4, IIllIIlilIllIIli.IlIlllIlilIl(), this.iliIiiIlIl.IIlilIliiIli(true));
         }
      } catch (Throwable var6) {
         this.liiIiiIlIl.liiiIIllIl();
      }

      try {
         this.IIIIllIIIl();
      } catch (Throwable var5) {
         this.iiIliiIlIl = false;
      }

      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      this.lIiIiiIlIl.lIiiIiIlilli(now);
      if (this.lIiIiiIlIl.iliIiiliiiii()) {
         this.iiIIlIIlIl(new illiIiilIiliIiil(IiIIilllliIIilll.iIiIIIlill, iiiiiiIlIIIIIIll.lliIliIlll, "", true, false, false));
      }

   }

   private class_1309 IIlilIliiIli(class_746 keepRange, double tick, double p, long range) {
      class_1309 var8 = this.illliiIlIl;
      if (var8 != null && liiIIIlliiiIIIll.IliIlllilIi(var8, lilllliiilllli.iiIiIiIIIl) && liiIIIlliiiIIIll.IIIllIIliIIl(var8) <= p) {
         class_1309 var19 = this.Illillliilli(var8, range);
         return var19 != null && llIIliiilIIlii.IilliliilIIi(liiIIIlliiiIIIll.IIIllIIliIIl(var8), liiIIIlliiiIIIll.IIIllIIliIIl(var19)) ? var19 : var8;
      } else {
         List var9 = liiIIIlliiiIIIll.Iilllilliill(tick, lilllliiilllli.iiIiIiIIIl);
         class_1309 var10 = null;
         double var11 = Double.POSITIVE_INFINITY;

         for(class_1309 var14 : var9) {
            if (var14 != keepRange) {
               double var15 = liiIIIlliiiIIIll.IIIllIIliIIl(var14);
               if (!(var15 < 0.001)) {
                  double var17 = var15 - (this.llIliiIlIl.IIlilIliiIli(var14.method_5628(), range, 60L) ? (double)4.0F : (double)0.0F);
                  if (var17 < var11) {
                     var11 = var17;
                     var10 = var14;
                  }
               }
            }
         }

         return var10;
      }
   }

   private void iIIIlIlIIl() {
      this.illliiIlIl = null;
      this.iilliiIlIl = 0;
      this.llIliiIlIl.IliIlllilIi((class_1309)null);
      this.IiIliiIlIl.IliIlllilIi();
      this.ilIliiIlIl.IilliliilIIi();
      this.IlIliiIlIl.IliIlllilIi();
      this.IilliiIlIl = lIIIilIliIIIilIl.iIIiIlliIl;
   }

   public void IIlllIlliIll(iilIIlilIIiIIlil e) {
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null) {
         this.iIiIiiIlIl.liiiIIllIl(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   public boolean Ililllililil() {
      return this.IIlliiIlIl && !this.iIiIiiIlIl.iliIiiliiiii(IIIiillllIIiilll.IliIlllilIi());
   }

   private IlillIIillillIIi lIlIliIlIl(illiIiilIiliIiil p, class_1309 t, class_746 v, long tick) {
      long var8 = 736246899371751983L;
      if (p.IliIlllilIi() != IiIIilllliIIilll.iilIIIlill) {
         return this.illIlIilIl(liIIiilliiIIiill.lIlIiliill, liIlliiIll<invokedynamic>(), t == null ? null : lliIliliIl(this.llIliiIlIl.IiIlliIliiIl()), IIiIllIiIl(p));
      } else if (t == null) {
         return this.IliliiIlIl != null && tick <= this.lliliiIlIl ? this.illIlIilIl(liIIiilliiIIiill.IIlIiliill, liIlliiIll<invokedynamic>(), this.IliliiIlIl, this.IllIllllIl()) : this.illIlIilIl(liIIiilliiIIiill.iiIIiliill, liIlliiIll<invokedynamic>(), (String)null, liIlliiIll<invokedynamic>());
      } else if (this.lIiliiIlIl) {
         return this.illIlIilIl(liIIiilliiIIiill.iIlIiliill, liIlliiIll<invokedynamic>(), lliIliliIl(this.llIliiIlIl.IiIlliIliiIl()), liIlliiIll<invokedynamic>());
      } else {
         var8 ^= ((long)(v.method_6032() + v.method_6067() <= 6.0F ? 1 : 0) << 32 ^ var8) & -1L << 32;
         String var7 = this.llIliiIlIl.IIiilIiiiIii() >= 2 ? liIlliiIll<invokedynamic>() + this.llIliiIlIl.IIiilIiiiIii() : this.IilliiIlIl.lIliIlliIl;
         return this.illIlIilIl((int)(var8 >>> 32) != 0 ? liIIiilliiIIiill.iIlIiliill : liIIiilliiIIiill.IIlIiliill, var7, lliIliliIl(this.llIliiIlIl.IiIlliIliiIl()), this.IllIllllIl());
      }
   }

   private static double IIiilIiiiIii(class_746 p, class_1309 step, class_243 t) {
      double var3 = step.method_23317() - p.method_23317();
      double var5 = step.method_23321() - p.method_23321();
      double var7 = Math.hypot(var3, var5);
      return var7 > 0.001 && t != null ? (t.field_1352 * var3 + t.field_1350 * var5) / var7 : (double)0.0F;
   }

   private void iiIIlIIlIl(illiIiilIiliIiil v) {
      AutoCloseable var2 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

      try {
         this.iilIiiIlIl.IIillIiliIil(false);
      } finally {
         lIIlliIIll(var2);
      }

      if (!v.iliIiiliiiii()) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(liIlliiIll<invokedynamic>(), IIiIllIiIl(v), false);
      }

   }

   public void IlIlllIlilIl(IiiIlllliiIlll e) {
      long var7 = 1706096754935979179L;
      class_310 var2 = class_310.method_1551();
      if (e != null && var2.field_1755 == null && var2.field_1690 != null && e.liiiIIllIl() == 1) {
         class_304[] var3 = iiiIlIIIll(var2.field_1690);
         var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

         for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            class_304 var6 = var3[(int)var10];
            if (IillIIIllillIIIl.iIlIlllllill(var6, e.IliIlllilIi())) {
               this.iIiIiiIlIl.liiiIIllIl(IIIiillllIIiilll.IliIlllilIi());
               return;
            }
         }

      }
   }

   public void iIlIlllllill() {
      long var4 = 5936289450041458388L;
      class_310 var1 = class_310.method_1551();

      try {
         lIIIililiIIIilil.IlIlllIlilIl(this.iilIiiIlIl);
         class_746 var2 = var1.field_1724;
         var4 ^= ((long)this.IIIliiIlIl.IIillIiliIil() << 32 ^ var4) & -1L << 32;
         if (var2 != null && (int)(var4 >>> 32) >= 0 && (int)(var4 >>> 32) < 9 && var2.method_31548().method_67532() != (int)(var4 >>> 32) && !this.IIiIiiIlIl.Ililllililil()) {
            var2.method_31548().method_61496((int)(var4 >>> 32));
         }

         this.IIIliiIlIl.IliIlllilIi();
         this.liiIiiIlIl.liiiIIllIl();
      } catch (Throwable var6) {
      }

      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      this.lIlliiIlIl = false;
      IllliiIlIl = false;
      this.illliiIlIl = null;
      this.lllliiIlIl = IlillIIillillIIi.lIiIIIiiil;
   }

   // $FF: synthetic method
   private static CallSite Iillllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ 11893))) + '\ue638') + 23003) + 25739))))))))) ^ 15813) >>> 14 | (char)((char)(~((char)(-((char)(-((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ 11893))) + '\ue638') + 23003) + 25739))))))))) ^ 15813) << 2) + var5) - var5) ^ var5) ^ var5) - var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lilIliilIl(IlillIIillillIIi s) {
      if (s != null && !s.equals(this.lllliiIlIl)) {
         this.lllliiIlIl = s;
      }

   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1665872803576905391L ^ Long.rotateLeft(-7090311808009833830L, 30) ^ -8020285327181988390L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 141850680505453508L ^ Long.rotateLeft(-3685977608743228487L, 44) ^ -8917945988999543337L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3094139086683454440L ^ Long.rotateLeft(7479766078016357795L, 52) ^ -3643647794150935354L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2404741701825213947L ^ Long.rotateLeft(-3963057004862580776L, 18) ^ 4556817947843857871L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1756024636310274905L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -131608492465744272L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6133169174691510205L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3813185832581007659L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6783592960921512140L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4683273677338430903L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIllllIlll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlllIllll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lllllillll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iillllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iilllIIill<invokedynamic>());
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

   private boolean IlIillIiilIi(class_243 eye, class_1309 t, class_238 box) {
      long var5 = 3805446446944634235L;
      var5 ^= ((long)(!lllIliIlillIliIl.IiIIlliIIl(eye, t.method_33571()) && !lllIliIlillIliIl.IiIIlliIIl(eye, box.method_1005()) ? 0 : 1) << 32 ^ var5) & -1L << 32;
      this.iilliiIlIl = (int)(var5 >>> 32) != 0 ? 0 : this.iilliiIlIl + 1;
      return llIIliiilIIlii.iIlIlllllill(this.iilliiIlIl);
   }

   public IlillIIillillIIi Iiilliiliiil() {
      return this.lllliiIlIl;
   }

   private void IIIilIIiiIIi(class_310 tick, long now, long mc) {
      long var35 = -2324219495545433424L;
      long var37 = -27219354713569683L;
      long var39 = -8369040923893686334L;
      long var41 = 7493238990120539644L;
      class_746 var6 = tick.field_1724;
      var35 ^= ((long)var6.method_5628() << 32 ^ var35) & -1L << 32;
      this.IIiIiiIlIl.liiiIIllIl(now);
      if (this.iIlliiIlIl) {
         this.iIlliiIlIl = false;
         this.IIiIiiIlIl.IiIlliIliiIl();
      }

      this.iIiIiiIlIl.lIiiIiIlilli(mc, IiiIlliiIl(tick));
      this.lliIiiIlIl.liiiIIllIl(tick.field_1687, (tickx) -> this.Iilililiiili(tickx, now, selfId), 512);
      illiIiilIiliIiil var8 = this.lIiIiiIlIl.iIlIlllllill(IIiiiIllIiiiIl.IliIlllilIi(mc, now, this.IliIiiIlIl, this.iIiIiiIlIl, this.liIliiIlIl, this.iliIiiIlIl));
      if (var8.IliIlllilIi() == IiIIilllliIIilll.iIiIIIlill) {
         this.IIIIllIIIl();
         this.iiIIlIIlIl(var8);
      } else {
         if (var8.liiiIIllIl() == iiiiiiIlIIIIIIll.IiIIliIlll && !this.IIiliiIlIl) {
            this.IIiliiIlIl = true;
            this.illliiIlIl = null;
            this.llIliiIlIl.IliIlllilIi((class_1309)null);
         }

         if (var8.liiiIIllIl() != iiiiiiIlIIIIIIll.IiIIliIlll && var8.liiiIIllIl() != iiiiiiIlIIIIIIll.liIIliIlll) {
            this.IIiliiIlIl = false;
         }

         if (var8.IilliliilIIi()) {
            this.iIIIlIlIIl();
            this.IIIliiIlIl.iIlIlllllill();
            this.IIiIiiIlIl.IiIlliIliiIl();
         }

         if (var8.IliIlllilIi() == IiIIilllliIIilll.lIiIIIlill) {
            this.Iiiiliiiiiii(var8);
         } else {
            this.lIlliiIlIl = var8.IliIlllilIi() == IiIIilllliIIilll.iilIIIlill;
            this.iliIiiIlIl.iIlIlllllill(now, ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil(), IilIIilllilIIill.iIlIlllllill());
            var35 ^= ((long)((!this.IIiIiiIlIl.iIIIlIlIIl() || liiIIliliiiIIlil.IIillIiliIil(this.iliIiiIlIl.IilliliilIIi(), this.iliIiiIlIl.lIiiIiIlilli(), this.IIiIiiIlIl.llIIlilIIl(), this.IIiIiiIlIl.IiIIlliIIl())) && liiIIliliiiIIlil.IIillIiliIil(this.iliIiiIlIl.IilliliilIIi(), this.iliIiiIlIl.lIiiIiIlilli(), var6.method_36454(), var6.method_36455()) ? 0 : 1) ^ var35) & -1L >>> 32;
            this.IiiIiiIlIl.IliIlllilIi(var8.IliIlllilIi(), (boolean)((int)var35));
            this.lIIliiIlIl.IliIlllilIi();
            this.ilIliiIlIl.IliIlllilIi();
            lIlllIIliIlllIIl.IliIlllilIi(false);
            iIlIllllIllIllll var10 = this.iilIiiIlIl.IIllllIlll();
            this.iliIiiIlIl.IliIlllilIi(var10.iIlIlllllill());
            if (this.illliiIlIl != null && this.llIliiIlIl.iliIiiliiiii(this.illliiIlIl, now)) {
               this.IliliiIlIl = lliIliliIl(this.llIliiIlIl.IiIlliIliiIl());
               this.lliliiIlIl = now + 100L;
            }

            class_1309 var11 = this.IIlilIliiIli(var6, (double)var10.liiiIIllIl(), (double)var10.liiiIIllIl() + (double)8.0F, now);
            var37 ^= ((long)(var11 == null || this.illliiIlIl != null && this.illliiIlIl.method_5628() == var11.method_5628() ? 0 : 1) << 32 ^ var37) & -1L << 32;
            if (var11 != null && this.illliiIlIl == null) {
               this.IIIliiIlIl.Illlllllilll();
               this.iliIiiIlIl.liiiIIllIl();
               this.iliIiiIlIl.iIlIlllllill(now, ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil(), IilIIilllilIIill.iIlIlllllill());
            }

            if ((int)(var37 >>> 32) != 0) {
               this.IiIliiIlIl.IliIlllilIi();
               this.ilIliiIlIl.IilliliilIIi();
               this.iilliiIlIl = 0;
            }

            this.illliiIlIl = var11;
            this.llIliiIlIl.IliIlllilIi(var11);
            this.lilliiIlIl = var11 == null ? this.lilliiIlIl + 1 : 0;
            this.iiIliiIlIl = var11 != null;
            this.IIlliiIlIl = this.iiIliiIlIl;
            iliIiIiIiiIiIi var13 = iliIiIiIiiIiIi.liIiilliiiiIiillii;
            iIllllIlIlllllIl var14 = null;
            if (var11 != null) {
               try (IlIIiiIillIIiiIi var15 = this.IiiIiiIlIl.IIlllIlliIll()) {
                  class_243 var16 = var6.method_33571();
                  class_238 var17 = var11.method_5829();
                  double var18 = lllIliIlillIliIl.IIlilIliiIli(var16, var17);
                  double var20 = lllIliIlillIliIl.IIlilIliiIli(var11.method_33571(), var6.method_5829());
                  this.llIliiIlIl.liiiIIllIl(var11, var18);
                  class_243 var22 = new class_243(var6.method_23317(), var6.method_23318() + 1.1, var6.method_23321());
                  class_243 var23 = var11.method_33571();
                  double var24 = llIIliiilIIlii.IIillIiliIil(var11.method_5791(), var11.method_36455(), var22.field_1352 - var23.field_1352, var22.field_1351 - var23.field_1351, var22.field_1350 - var23.field_1350);
                  double var26 = IIiilIiiiIii(var6, var11, this.llIliiIlIl.IIlllIlliIll());
                  float var28 = var6.method_7261(0.5F);
                  var37 ^= ((long)llIIliiilIIlii.lIiiIiIlilli(var28, var6.method_7279(), 0.95F) ^ var37) & -1L >>> 32;
                  var39 ^= ((long)lIiiililiIiiilil.IliIlllilIi(illIllilIilIllil.Iilllilliill(var11.method_5628()), (double)illIllilIilIllil.IIIllIIliIIl(), 1) << 32 ^ var39) & -1L << 32;
                  IlIiillllIiill var31 = new IlIiillllIiill(now, var18, var20, (int)var37, var28, var24, var26, this.llIliiIlIl.Illlllllilll(), (int)(var39 >>> 32), this.IlIliiIlIl.IilliliilIIi(), illIllilIilIllil.IiIlliIliiIl(), var10, var11.method_6039(), var11.method_23318() - var6.method_23318(), this.IiIiliIiiiIi(now), this.iIiliiIlIl, this.IlIillIiilIi(var16, var11, var17));
                  var13 = this.IiIliiIlIl.iIlIlllllill(var6, var11, var31);
                  var14 = var13.IliIlllilIi();
                  this.lIiliiIlIl = this.ilIliiIlIl.liiiIIllIl() < 0;
                  var39 ^= ((long)(!this.lIiliiIlIl && this.ilIliiIlIl.iIlIlllllill() ? 1 : 0) ^ var39) & -1L >>> 32;
                  float[] var33 = var13.lIiiIiIlilli() == lIIIilIliIIIilIl.IlIiIlliIl && var18 > (double)10.0F ? this.iIIliiIlIl.lliIliliIl(this.iliIiiIlIl.IilliliilIIi()) : null;
                  if (var33 != null) {
                     this.ilIliiIlIl.IIIllIIliIIl(var33[0], var33[1]);
                  } else {
                     this.ilIliiIlIl.iliIiiliiiii(var11, var14);
                  }

                  var41 ^= ((long)this.IlIliiIlIl.IilliliilIIi() << 32 ^ var41) & -1L << 32;
                  if ((int)var39 != 0 && var13.liiiIIllIl() && this.ilIliiIlIl.IlIlllIlilIl(var11, var13.iIlIlllllill(), var13.IilliliilIIi(), (boolean)((int)(var41 >>> 32)))) {
                     this.iIiliiIlIl = (int)(var41 >>> 32) != 0 && !var13.IilliliilIIi();
                     var14 = this.IiIliiIlIl.IilliliilIIi(var6, var11, var18, var10.IilliliilIIi());
                     var13 = new iliIiIiIiiIiIi(var14, true, var13.iIlIlllllill(), var13.IilliliilIIi(), lIIIilIliIIIilIl.IiIiIlliIl);
                  }
               }
            }

            this.IilliiIlIl = var13.lIiiIiIlilli();
            if (this.lilliiIlIl >= 40) {
               this.IIIliiIlIl.Iilllilliill();
            }

            this.IIIliiIlIl.IlIlllIlilIl(now);
            if (var11 != null && var8.lIiiIiIlilli() && var14 != null) {
               lIIIililiIIIilil.IliIlllilIi(this.iilIiiIlIl, var14, 50);
            } else {
               lIIIililiIIIilil.IlIlllIlilIl(this.iilIiiIlIl);
            }

            this.Iliilliiilii(var6, now, this.iliIiiIlIl.IIlilIliiIli(this.IIiIiiIlIl.Iiilliiliiil() || this.IIiIiiIlIl.IlIillIiilIi() || this.iliIiiIlIl.IiIiliIiiiIi() && this.IIiIiiIlIl.Ililllililil()));
            this.lilIliilIl(this.lIlIliIlIl(var8, var11, var6, now));
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iilllIIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '햲') - var5) - var5) << 12 | (char)((char)((char)(var4[var5] + '햲') - var5) - var5) >>> 4) + '\ueebf') + 11238) ^ '鹖')) + var5) + var5) + '颰'))) + var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIillIiliIil() {
      return this.iiIliiIlIl;
   }

   private IlillIIillillIIi illIlIilIl(liIIiilliiIIiill tone, String hint, String state, String name) {
      return new IlillIIillillIIi(tone, iIiIlIliIl(hint, 12), state, this.llIliiIlIl.Iiiiliiiiiii(), this.llIliiIlIl.IIIIllIIIl(), name == null ? null : iIiIlIliIl(name, 48));
   }

   private static String IIiIllIiIl(illiIiilIiliIiil v) {
      String var1 = v.liiiIIllIl().iliIliIlll;
      if (!var1.contains(liIlliiIll<invokedynamic>())) {
         return iIiIlIliIl(var1, 48);
      } else {
         String var2 = v.iIlIlllllill() != null && !v.iIlIlllllill().isBlank() ? v.iIlIlllllill() : liIlliiIll<invokedynamic>();
         return iIiIlIliIl(String.format(Locale.ROOT, var1, var2), 48);
      }
   }

   private static class_304[] iiiIlIIIll(class_315 o) {
      class_304[] var1 = new class_304[]{o.field_1894, o.field_1881, o.field_1913, o.field_1849, o.field_1903, o.field_1832, o.field_1867, o.field_1886, o.field_1904, o.field_1871, o.field_1869, o.field_1831, o.field_1822};
      class_304[] var2 = o.field_1852 == null ? new class_304[0] : o.field_1852;
      class_304[] var3 = (class_304[])Arrays.copyOf(var1, var1.length + var2.length);
      System.arraycopy(var2, 0, var3, var1.length, var2.length);
      return var3;
   }

   // $FF: synthetic method
   private static CallSite lllllillll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + var5) + 28693) ^ var5) + '郥'))))) - var5))) << 2 | (char)(-((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) + var5) + 28693) ^ var5) + '郥'))))) - var5))) >>> 14))) - 23836))) ^ var5) + '茶') - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl() {
      class_310 var1 = class_310.method_1551();
      long var2 = IIIiillllIIiilll.IliIlllilIi();
      this.llIIlilIIl();
      this.iIiIiiIlIl.IliIlllilIi();
      this.liIliiIlIl.lIiiIiIlilli();
      if (var1.field_1724 != null && var1.method_1562() != null) {
         this.lIiIiiIlIl.IliIlllilIi(var1.method_1562(), var2);
         this.lllliiIlIl = this.illIlIilIl(liIIiilliiIIiill.iiIIiliill, liIlliiIll<invokedynamic>(), (String)null, liIlliiIll<invokedynamic>());
      } else {
         this.lIiIiiIlIl.IliIlllilIi((Object)null, var2);
         this.lllliiIlIl = this.illIlIilIl(liIIiilliiIIiill.iiIIiliill, liIlliiIll<invokedynamic>(), (String)null, liIlliiIll<invokedynamic>());
      }
   }

   public void iliIiiliiiii(IliIliIllliIliIl e) {
      if (e != null && e.iilIIiiIll != null) {
         if (e.iilIIiiIll instanceof class_2645) {
            this.iIlliiIlIl = true;
         }

         this.lliIiiIlIl.IliIlllilIi(e.iilIIiiIll);
      }
   }

   private class_1309 Illillliilli(class_1309 cur, long tick) {
      long var8 = -8625412310716236564L;
      class_310 var4 = class_310.method_1551();
      var8 ^= ((long)this.llIliiIlIl.IiIiliIiiiIi() << 32 ^ var8) & -1L << 32;
      if (var4.field_1687 != null && (int)(var8 >>> 32) >= 0 && (int)(var8 >>> 32) != cur.method_5628() && this.llIliiIlIl.IIlilIliiIli((int)(var8 >>> 32), tick, 60L)) {
         class_1297 var7 = var4.field_1687.method_8469((int)(var8 >>> 32));
         class_1309 var10000;
         if (var7 instanceof class_1309) {
            class_1309 var6 = (class_1309)var7;
            if (liiIIIlliiiIIIll.IliIlllilIi(var6, lilllliiilllli.iiIiIiIIIl)) {
               var10000 = var6;
               return var10000;
            }
         }

         var10000 = null;
         return var10000;
      } else {
         return null;
      }
   }

   public void Iilllilliill(class_243 velocity, boolean explosion) {
      if (velocity != null && this.iiIliiIlIl) {
         this.ilIliiIlIl.lIiiIiIlilli(IIllIIlilIllIIli.IlIlllIlilIl());
         if (!explosion) {
            this.IiIliiIlIl.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         }

      }
   }

   private void Iilililiiili(IlIillIiilIi e, long tick, int selfId) {
      long var11 = -306120812587419189L;
      Objects.requireNonNull(e);
      var11 ^= (0L ^ var11) & -1L << 32;
      //$FF: (int)(var11 >>> 32)->value
      //0->gg/corz/IiIiliIiiiIi
      //1->gg/corz/ilIiIiIiIiIiIiIi
      //2->gg/corz/IIlilIIllIlilIIl
      //3->gg/corz/llIiIIliilIiIIli
      switch (e.typeSwitch<invokedynamic>(e, (int)(var11 >>> 32))) {
         case 0:
            IiIiliIiiiIi var7 = (IiIiliIiiiIi)e;
            this.IliIiiIlIl.liiiIIllIl(var7.IliIlllilIi());
            break;
         case 1:
            ilIiIiIiIiIiIiIi var8 = (ilIiIiIiIiIiIiIi)e;
            this.llIliiIlIl.iIlIlllllill(var8.IliIlllilIi(), tick);
            break;
         case 2:
            IIlilIIllIlilIIl var9 = (IIlilIIllIlilIIl)e;
            this.llIliiIlIl.IilliliilIIi(var9.IliIlllilIi(), var9.liiiIIllIl(), selfId, tick);
            break;
         case 3:
            llIiIIliilIiIIli var10 = (llIiIIliilIiIIli)e;
            this.llIliiIlIl.lIiiIiIlilli(var10.IliIlllilIi(), selfId);
      }

   }

   public liIlIIIliiIlIIIl(lliliiiililiii module) {
      this.IiiIiiIlIl = new illillIlIilillIl(this.IIiIiiIlIl, this.iliIiiIlIl);
      this.liiIiiIlIl = new liiIiiiiiiIiii();
      this.iiiIiiIlIl = new IIiIIIIllIiIIIIl(this.liiIiiIlIl);
      this.IIIliiIlIl = new lIlIiIIliIlIiIIl(this.IIiIiiIlIl, this.IiiIiiIlIl);
      this.lIIliiIlIl = new IilIllililIlli(700, 1200);
      this.iIIliiIlIl = iIIIllilIlIIllil.IIIllIIliIIl(this.lIIliiIlIl, iilIiiIIiIii.liIiIilIliiIiIilIl);
      this.IlIliiIlIl = new lllliIilillliIil();
      this.llIliiIlIl = new ililIIilIiilIIil();
      this.IiIliiIlIl = new IllilIlllllilIll(new Random(), this.iIIliiIlIl);
      this.lllliiIlIl = IlillIIillillIIi.lIiIIIiiil;
      this.IilliiIlIl = lIIIilIliIIIilIl.iIIiIlliIl;
      this.lliliiIlIl = Long.MIN_VALUE;
      this.iilIiiIlIl = module;
      this.ilIliiIlIl = new Iillllllilllll(module, this.iliIiiIlIl, this.IiiIiiIlIl, this.IIIliiIlIl, this.IIiIiiIlIl);
      this.liIliiIlIl = new illIIliIilIIli(module);
   }

   private void Iiiiliiiiiii(illiIiilIiliIiil v) {
      this.IIIIllIIIl();
      this.lIlliiIlIl = false;
      this.iiIliiIlIl = false;
      this.IIlliiIlIl = false;
      if (v.liiiIIllIl() == iiiiiiIlIIIIIIll.iIIIliIlll) {
         this.iliIiiIlIl.liiiIIllIl();
         this.IIIliiIlIl.iIlIlllllill();
      }

      this.lilIliilIl(this.illIlIilIl(liIIiilliiIIiill.lIlIiliill, liIlliiIll<invokedynamic>(), (String)null, IIiIllIiIl(v)));
   }

   private static String IlIllllIll(Throwable t) {
      long var4 = 7098267503715033173L;
      StringBuilder var1 = new StringBuilder(String.valueOf(t));
      StackTraceElement[] var2 = t.getStackTrace();

      for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < Math.min(4, var2.length); var6 += 4294967296L) {
         var1.append(liIlliiIll<invokedynamic>()).append(var2[(int)(var6 >>> 32)]);
      }

      return var1.toString();
   }

   private static void lIIlliIIll(AutoCloseable c) {
      if (c != null) {
         try {
            c.close();
         } catch (Exception var2) {
         }

      }
   }
}
