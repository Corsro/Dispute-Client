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

public final class liIlllIliiIlllIl {
   public static final String illliiIiIl = "Items would not move out of the chest - stopped.";
   public static final int IiIliiIiIl = 500;
   private final int IliliiIiIl;
   private int IiIiiiIiIl;
   public static final int llIliiIiIl = 12;
   public static final String IIlliiIiIl = "Close the menu first, then look at the chest.";
   public static final String iilliiIiIl = "/sell opened a menu that is not the sell menu.";
   public static final String IllliiIiIl = "The chest did not open.";
   private int lIIiiiIiIl;
   public static final int iiiIiiIiIl = 60;
   public static final String IIiliiIiIl = "The sell menu was closed - Auto Sell Chest stopped.";
   public static final int IIIliiIiIl = 2;
   public static final String lIlliiIiIl = "Another screen opened - Auto Sell Chest stopped.";
   public static final String iIlliiIiIl = "Look at a chest or barrel within 4.5 blocks.";
   private boolean iiIiiiIiIl;
   public static final int lIIliiIiIl = 4;
   private int iiiliiIiIl;
   private boolean lIliiiIiIl;
   private int liIiiiIiIl;
   public static final int liiIiiIiIl = 600;
   public static final String iIiliiIiIl = "The chest is empty - nothing to sell.";
   public static final int iIIliiIiIl = 8;
   public static final String lIiliiIiIl = "The sell menu did not take these items - stopped.";
   private IliiiIilliiiIi lliliiIiIl;
   public static final int ilIliiIiIl = 4;
   private int IiiliiIiIl;
   private int liiliiIiIl;
   public static final String IilliiIiIl = "Inventory full of your own items - make room.";
   public static final String iiIliiIiIl = "You moved - Auto Sell Chest stopped.";
   public static final int IlIliiIiIl = 100;
   private int ililiiIiIl;
   public static final String lllliiIiIl = "The chest was closed - Auto Sell Chest stopped.";
   private int llIiiiIiIl;
   public static final String liIliiIiIl = "You died - Auto Sell Chest stopped.";
   private int ilIiiiIiIl;
   private int IlIiiiIiIl;
   private boolean IIliiiIiIl;
   public static final String lilliiIiIl = "/sell did not open the sell menu.";
   private int iIIiiiIiIl;
   private int IIIiiiIiIl;

   private lIiIiIiiIiIiIi Ililllililil(illiliiIililii v) {
      if (v.liiiIIllIl() != lIiIlllliIiIllll.IIIlilIill) {
         return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
      } else if (!v.Ililllililil() && v.IliIlllilIi() >= this.iiiliiIiIl) {
         this.IlIillIiilIi(v.Illlllllilll());
         if (v.IIlllIlliIll() > 0 && v.Iilllilliill() && this.iIIiiiIiIl < (-50905961 * 25 + 43 ^ -1272648978)) {
            this.lIliiiIiIl = true;
            this.iiiliiIiIl = v.IliIlllilIi() + this.IliliiIiIl;
            return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.llllIiIliilllIiIli);
         } else if (v.Illlllllilll() >= this.liIiiiIiIl) {
            return this.Illillliilli(Iilililiiili<invokedynamic>(), true);
         } else if (v.IIillIiliIil()) {
            this.IiIiliIiiiIi(IliiiIilliiiIi.iIiiIliiiIliiIliii);
            this.liiliiIiIl = v.IliIlllilIi() + (~(-140557842 * -117 + -31 - -93) ^ 734601611);
            return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.IillIiIlilillIiIli);
         } else {
            this.IiIiliIiiiIi(IliiiIilliiiIi.lliiIliiiiliiIliii);
            this.liiliiIiIl = v.IliIlllilIi() + (~((345702850 << 19 | 345702850 >>> 13) ^ 93) ^ -235971726);
            return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.IIllIiIlilIllIiIli);
         }
      } else {
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      }
   }

   private lIiIiIiiIiIiIi IIIllIIliIIl(illiliiIililii v) {
      if (v.IliIlllilIi() < this.liiliiIiIl) {
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      } else if (v.liiiIIllIl() != lIiIlllliIiIllll.iiiIilIill) {
         return !this.iiIiiiIiIl && v.IliIlllilIi() - this.ililiiIiIl < (--1143955084 + 81 ^ 1143954565) ? lIiIiIiiIiIiIi.Illlilliillllillii : this.Illillliilli(this.iiIiiiIiIl ? Iilililiiili<invokedynamic>() : Iilililiiili<invokedynamic>(), false);
      } else if (!v.iliIiiliiiii()) {
         return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
      } else {
         ++this.lIIiiiIiIl;
         this.iiIiiiIiIl = true;
         this.IiIiliIiiiIi(IliiiIilliiiIi.lIliIliiiiIliIliii);
         this.IiiliiIiIl = v.IliIlllilIi() + (~(-1536356210 * 1963413621 - 31) ^ 1796804356);
         return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.ilIlIiIliIiIlIiIli);
      }
   }

   private lIiIiIiiIiIiIi Illillliilli(String text, boolean close) {
      this.lliliiIiIl = IliiiIilliiiIi.IiiiIliiiliiiIliii;
      return new lIiIiIiiIiIiIi(IIIIiillIIIiil.lIilIiIliiIilIiIli, text, close);
   }

   private lIiIiIiiIiIiIi IIlllIlliIll(illiliiIililii v) {
      if (v.IIlllIlliIll() == 0) {
         return this.IIliiiIiIl ? this.IIlilIliiIli(this.ilIiiiIiIl == 0 ? Iilililiiili<invokedynamic>() : lIiiIiIlilli(this.ilIiiiIiIl), true) : this.Illillliilli(Iilililiiili<invokedynamic>(), true);
      } else {
         this.IiIiliIiiiIi(IliiiIilliiiIi.illiIliiiIiliIliii);
         this.liiliiIiIl = v.IliIlllilIi() + (((-53280460 ^ -43) * -1601513229 - -31 << 5 | (-53280460 ^ -43) * -1601513229 - -31 >>> 27) ^ 28898888);
         return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.IIllIiIlilIllIiIli);
      }
   }

   public IliiiIilliiiIi IliIlllilIi() {
      return this.lliliiIiIl;
   }

   private lIiIiIiiIiIiIi IIIilIIiiIIi(illiliiIililii v) {
      long var3 = 6049029168619153851L;
      if (v.IliIlllilIi() < this.liiliiIiIl) {
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      } else if (v.liiiIIllIl() != lIiIlllliIiIllll.iiiIilIill) {
         return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
      } else {
         var3 ^= ((long)(this.IiIiiiIiIl - v.IIlllIlliIll()) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) <= 0) {
            return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
         } else {
            this.ilIiiiIiIl += (int)(var3 >>> 32);
            ++this.llIiiiIiIl;
            if (!this.IIliiiIiIl && this.llIiiiIiIl < (-451515154 * 373475417 ^ 113 ^ -1287532741)) {
               this.IiIiliIiiiIi(IliiiIilliiiIi.iiIiIliiiIIliIliii);
               this.lIIiiiIiIl = 0;
               this.liiliiIiIl = v.IliIlllilIi() + (685255799 * -59 * 1108378657 * -1227133513 ^ 542578365);
               return lIiIiIiiIiIiIi.Illlilliillllillii;
            } else {
               return this.IIlilIliiIli(lIiiIiIlilli(this.ilIiiiIiIl), false);
            }
         }
      }
   }

   private void IiIiliIiiiIi(IliiiIilliiiIi p) {
      this.lliliiIiIl = p;
      this.IIIiiiIiIl = -1;
      this.iIIiiiIiIl = 0;
      this.lIliiiIiIl = false;
   }

   public boolean IilliliilIIi() {
      return this.iiIiiiIiIl;
   }

   public int iIlIlllllill() {
      return this.llIiiiIiIl;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 11 | (char)(-var4[var5]) >>> 5) + var5) ^ var5) ^ var5) ^ var5))))) ^ var5) ^ 13540) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIiIiIiiIiIiIi IiIlliIliiIl(illiliiIililii v) {
      if (v.liiiIIllIl() != lIiIlllliIiIllll.IIIlilIill) {
         return this.Illillliilli(v.liiiIIllIl() == lIiIlllliIiIllll.iiiIilIill ? Iilililiiili<invokedynamic>() : Iilililiiili<invokedynamic>(), false);
      } else if (!v.Ililllililil() && v.IliIlllilIi() >= this.iiiliiIiIl) {
         this.IlIillIiilIi(v.IlIlllIlilIl());
         if (v.IIIllIIliIIl() == 0) {
            this.IIliiiIiIl = true;
            return this.IIlllIlliIll(v);
         } else if (this.iIIiiiIiIl >= ((1895159628 * 1047552999 - 109 << 13 | 1895159628 * 1047552999 - 109 >>> 19) * 3 ^ -546383494) && v.IiIlliIliiIl() && v.IIlllIlliIll() == 0) {
            return this.Illillliilli(Iilililiiili<invokedynamic>(), true);
         } else if (v.IiIlliIliiIl() && this.iIIiiiIiIl < (-(-(375695823 ^ 103 ^ 101)) ^ 375695817)) {
            this.lIliiiIiIl = true;
            this.iiiliiIiIl = v.IliIlllilIi() + this.IliliiIiIl;
            return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.liIlIiIliiiIlIiIli);
         } else {
            return this.IIlllIlliIll(v);
         }
      } else {
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) >>> 9 | (char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) << 7) - 18609) - var5) - var5))))) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int liiiIIllIl() {
      return this.ilIiiiIiIl;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) + '뜸') - '촘') + var5) + var5)))) + 'ꇘ') - 28778) - var5) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) + '뜸') - '촘') + var5) + var5)))) + 'ꇘ') - 28778) - var5) << 14) + 11114) - var5) ^ '퉫'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liIlllIliiIlllIl(int stepTicks) {
      this.lliliiIiIl = IliiiIilliiiIi.iiIiIliiiIIliIliii;
      this.ililiiIiIl = ~-1991595468 * 35 ^ -1161119039;
      this.IIIiiiIiIl = -1;
      this.IliliiIiIl = Math.max(1, stepTicks);
   }

   private void IlIillIiilIi(int items) {
      if (this.lIliiiIiIl) {
         if (items < this.IlIiiiIiIl) {
            this.iIIiiiIiIl = 0;
         } else {
            ++this.iIIiiiIiIl;
         }

         this.lIliiiIiIl = false;
      }

      this.IlIiiiIiIl = items;
   }

   private lIiIiIiiIiIiIi Illlllllilll(illiliiIililii v) {
      if (v.IliIlllilIi() < this.liiliiIiIl) {
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      } else if (v.liiiIIllIl() != lIiIlllliIiIllll.iiiIilIill) {
         return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
      } else {
         this.IiIiiiIiIl = v.IIlllIlliIll();
         this.IiIiliIiiiIi(IliiiIilliiiIi.liliIliiiiiliIliii);
         this.IiiliiIiIl = v.IliIlllilIi() + (((--2129300625 << 9 | --2129300625 >>> 23) >>> 27 | (--2129300625 << 9 | --2129300625 >>> 23) << 5) ^ -1557897250);
         return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.iIllIiIliIlllIiIli);
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 7086) + 'ꄱ') >>> 15 | (char)((char)(var4[var5] - 7086) + 'ꄱ') << 1) << 7 | (char)((char)((char)(var4[var5] - 7086) + 'ꄱ') >>> 15 | (char)((char)(var4[var5] - 7086) + 'ꄱ') << 1) >>> 9) << 10 | (char)((char)((char)((char)(var4[var5] - 7086) + 'ꄱ') >>> 15 | (char)((char)(var4[var5] - 7086) + 'ꄱ') << 1) << 7 | (char)((char)((char)(var4[var5] - 7086) + 'ꄱ') >>> 15 | (char)((char)(var4[var5] - 7086) + 'ꄱ') << 1) >>> 9) >>> 6) - '雈') - 6653) - var5) + 9451) - var5))))) + 1959) ^ 'ꦏ') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String lIiiIiIlilli(int stacks) {
      return Iilililiiili<invokedynamic>() + stacks + (stacks == (((-428579379 ^ -93) << 15 | (-428579379 ^ -93) >>> 17) ^ -852030268) ? Iilililiiili<invokedynamic>() : Iilililiiili<invokedynamic>());
   }

   private lIiIiIiiIiIiIi Iiilliiliiil(illiliiIililii v) {
      if (v.liiiIIllIl() != lIiIlllliIiIllll.IIIlilIill) {
         this.IiIiliIiiiIi(IliiiIilliiiIi.lliiIliiiiliiIliii);
         this.liiliiIiIl = v.IliIlllilIi() + ((~(-665087692 + -23) - 57 << 27 | ~(-665087692 + -23) - 57 >>> 5) ^ 1228743549);
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      } else if (!v.Ililllililil() && v.IliIlllilIi() >= this.liiliiIiIl) {
         if (v.IIlllIlliIll() > 0 && v.Iilllilliill()) {
            this.IIillIiliIil(v);
            return lIiIiIiiIiIiIi.Illlilliillllillii;
         } else {
            this.IiIiliIiiiIi(IliiiIilliiiIi.lliiIliiiiliiIliii);
            this.liiliiIiIl = v.IliIlllilIi() + (((-440308082 >>> 7 | -440308082 << 25) - -109) * 1926714301 ^ -85 ^ -838265855);
            return lIiIiIiiIiIiIi.IliIlllilIi(IIIIiillIIIiil.IIllIiIlilIllIiIli);
         }
      } else {
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      }
   }

   private lIiIiIiiIiIiIi IIlilIliiIli(String text, boolean close) {
      this.lliliiIiIl = IliiiIilliiiIi.IiiiIliiiliiiIliii;
      return new lIiIiIiiIiIiIi(IIIIiillIIIiil.iillIiIliIIilIiIli, text, close);
   }

   private lIiIiIiiIiIiIi Iilllilliill(illiliiIililii v) {
      if (v.liiiIIllIl() == lIiIlllliIiIllll.IIIlilIill) {
         if (this.IIIiiiIiIl < 0) {
            this.IIIiiiIiIl = v.IliIlllilIi();
         }

         if (v.IliIlllilIi() - this.IIIiiiIiIl < (((-1873763155 << 21 | -1873763155 >>> 11) >>> 27 | (-1873763155 << 21 | -1873763155 >>> 11) << 5) ^ 3 ^ -1237237099)) {
            return lIiIiIiiIiIiIi.Illlilliillllillii;
         } else if (!v.iIlIlllllill()) {
            return this.Illillliilli(Iilililiiili<invokedynamic>(), true);
         } else {
            this.IIillIiliIil(v);
            return this.Ililllililil(v);
         }
      } else if (v.liiiIIllIl() == lIiIlllliIiIllll.lIIlilIill) {
         return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
      } else {
         return v.IliIlllilIi() >= this.IiiliiIiIl ? this.Illillliilli(Iilililiiili<invokedynamic>(), false) : lIiIiIiiIiIiIi.Illlilliillllillii;
      }
   }

   private void IIillIiliIil(illiliiIililii v) {
      this.IiIiliIiiiIi(IliiiIilliiiIi.IIiiIliiilIiiIliii);
      this.IlIiiiIiIl = v.Illlllllilll();
      this.liIiiiIiIl = v.Illlllllilll();
      this.iiiliiIiIl = v.IliIlllilIi();
   }

   private lIiIiIiiIiIiIi IlIlllIlilIl(illiliiIililii v) {
      if (v.liiiIIllIl() == lIiIlllliIiIllll.IIIlilIill) {
         if (this.IIIiiiIiIl < 0) {
            this.IIIiiiIiIl = v.IliIlllilIi();
         }

         if (v.IliIlllilIi() - this.IIIiiiIiIl < ((~(~(-1917386462 - -121)) >>> 9 | ~(~(-1917386462 - -121)) << 23) ^ -842605692)) {
            return lIiIiIiiIiIiIi.Illlilliillllillii;
         } else {
            this.IiIiliIiiiIi(IliiiIilliiiIi.IlliIliiillliIliii);
            this.IlIiiiIiIl = v.IlIlllIlilIl();
            this.iiiliiIiIl = v.IliIlllilIi();
            return this.IiIlliIliiIl(v);
         }
      } else if (v.liiiIIllIl() == lIiIlllliIiIllll.lIIlilIill) {
         return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
      } else {
         if (v.IliIlllilIi() >= this.IiiliiIiIl) {
            if (this.lIIiiiIiIl >= (-1050933529 - 69 - -39 + -99 ^ -1050933660)) {
               return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
            }

            this.IiIiliIiiiIi(IliiiIilliiiIi.iiIiIliiiIIliIliii);
            this.liiliiIiIl = v.IliIlllilIi() + (-(--1346038066 * 113) ^ 91 ^ -1778446147);
         }

         return lIiIiIiiIiIiIi.Illlilliillllillii;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7236283086769475300L ^ Long.rotateLeft(-857624203560353031L, 55) ^ -3802865808664381399L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8935258920627601532L ^ Long.rotateLeft(3082064332252875556L, 21) ^ 3834914339674066719L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6310363082826960887L ^ Long.rotateLeft(-6406765935281385245L, 30) ^ -1059202374337462178L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8309510792829175288L ^ Long.rotateLeft(-6015596785007199023L, 41) ^ 2435474809036600336L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7038846739595038256L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4375340372237534540L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8485835883464195465L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1745873114047667060L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8260972398960957646L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7157485832328044206L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiilIiiiIii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iliilliiilii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiiiliiiiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIIllIIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIIIlIlIIl<invokedynamic>());
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
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 30225) ^ 17536))) >>> 9 | (char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 30225) ^ 17536))) << 7) + var5))) << 4 | (char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 30225) ^ 17536))) >>> 9 | (char)(~((char)((char)((char)(var4[var5] ^ var5) ^ 30225) ^ 17536))) << 7) + var5))) >>> 12) - var5) ^ 31189) + var5))))))) - 32500))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIiIiIiiIiIiIi iliIiiliiiii(illiliiIililii v) {
      if (this.lliliiIiIl != IliiiIilliiiIi.IiiiIliiiliiiIliii && v != null) {
         if (this.ililiiIiIl == Integer.MIN_VALUE) {
            this.ililiiIiIl = v.IliIlllilIi();
         }

         if (v.lIiiIiIlilli()) {
            return this.Illillliilli(Iilililiiili<invokedynamic>(), false);
         } else if (this.iiIiiiIiIl && v.IilliliilIIi()) {
            return this.Illillliilli(Iilililiiili<invokedynamic>(), v.liiiIIllIl() == lIiIlllliIiIllll.IIIlilIill);
         } else {
            lIiIiIiiIiIiIi var10000;
            switch (this.lliliiIiIl.ordinal()) {
               case 0 -> var10000 = this.IIIllIIliIIl(v);
               case 1 -> var10000 = this.IlIlllIlilIl(v);
               case 2 -> var10000 = this.IiIlliIliiIl(v);
               case 3 -> var10000 = this.Illlllllilll(v);
               case 4 -> var10000 = this.Iilllilliill(v);
               case 5 -> var10000 = this.Ililllililil(v);
               case 6 -> var10000 = this.Iiilliiliiil(v);
               case 7 -> var10000 = this.IIIilIIiiIIi(v);
               case 8 -> var10000 = lIiIiIiiIiIiIi.Illlilliillllillii;
               default -> throw new MatchException((String)null, (Throwable)null);
            }

            return var10000;
         }
      } else {
         return lIiIiIiiIiIiIi.Illlilliillllillii;
      }
   }
}
