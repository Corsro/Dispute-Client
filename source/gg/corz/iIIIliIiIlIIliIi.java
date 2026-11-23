package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_2246;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public final class iIIIliIiIlIIliIi {
   public static final String IlIIIliIIi = "kit";
   public static final int IiiiiIiIIi = 9;
   public static final int lIIIIliIIi = 4;
   public static final double IIIIIliIIi = (double)1.0F;
   private lIliliiIlili IIlIIliIIi;
   public static final int liiiiIiIIi = 35;
   private final long[] ilIIIliIIi = new long[lIliliiIlili.values().length];
   private long lIlIIliIIi;
   private long liIIIliIIi = Long.MIN_VALUE;
   private final Object llIIIliIIi;
   public static final int iiiiiIiIIi = 36;
   private Runnable iiIIIliIIi;
   public static final int iIIIIliIIi = 2;
   private boolean IiIIIliIIi = true;

   public static double IIlilIliiIli(float efficiency, int suitableObsidian, boolean speed) {
      long var4 = 7223291235693001204L;
      var4 ^= ((long)IIiiililIiiili.iliIiiliiiii(efficiency, suitableObsidian, speed) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) == Integer.MAX_VALUE ? (double)-1.0E9F : (double)(-((int)(var4 >>> 32)));
   }

   private static double Iliilliiilii(class_1799 s) {
      long var7 = -605594034166681576L;
      double var1 = s.method_7963() && s.method_7936() > 0 ? (double)1.0F - (double)s.method_7919() / (double)s.method_7936() : (double)1.0F;
      var7 ^= ((long)lIlllIliIlllIl.lIiiIiIlilli(s, class_1893.field_9121) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)lIlllIliIlllIl.lIiiIiIlilli(s, class_1893.field_9118) ^ var7) & -1L >>> 32;
      double var5 = s.method_31574(class_1802.field_22022) ? (double)3.0F : (s.method_31574(class_1802.field_8802) ? (double)2.0F : (s.method_31574(class_1802.field_8371) ? (double)1.0F : (double)0.0F));
      return var5 * (double)4.0F + (double)((int)(var7 >>> 32)) * (double)3.0F + (double)((int)var7) + var1;
   }

   static int IiIiliIiiiIi(iIllliIiIlllliIi[] inv, int k, lIliliiIlili selected) {
      long var7 = 4739032804762154620L;
      long var9 = 2886076107106715890L;
      var7 ^= (-4294967296L ^ var7) & -1L << 32;
      var7 ^= ~var7 & -1L >>> 32;

      for(var9 ^= (0L ^ var9) & -1L << 32; (int)(var9 >>> 32) < 9; var9 += 4294967296L) {
         iIllliIiIlllliIi var6 = inv[(int)(var9 >>> 32)];
         if (var6 != null && var6.liiiIIllIl() == selected && var6.iIlIlllllill() > (int)var7) {
            var7 ^= ((long)var6.iIlIlllllill() ^ var7) & -1L >>> 32;
            var7 ^= ((long)((int)(var9 >>> 32)) << 32 ^ var7) & -1L << 32;
         }
      }

      if ((int)(var7 >>> 32) < 0) {
         return -1;
      } else {
         iIllliIiIlllliIi var5 = inv[(int)(var7 >>> 32)];
         var9 ^= ((long)Math.max(1, var5.IilliliilIIi() / 4) ^ var9) & -1L >>> 32;
         if (var5.iIlIlllllill() >= (int)var9) {
            return -1;
         } else if ((int)(var7 >>> 32) != k && !var5.iliIiiliiiii()) {
            return (int)(var7 >>> 32);
         } else {
            return -1;
         }
      }
   }

   Runnable IlIlllIlilIl(Runnable kind, lIliliiIlili body) {
      long var3 = ++this.lIlIIliIIi;
      Runnable var5 = () -> {
         if (var3 == this.lIlIIliIIi) {
            this.iiIIIliIIi = null;
            this.IIlIIliIIi = null;
            kind.run();
         }
      };
      this.iiIIIliIIi = var5;
      this.IIlIIliIIi = body;
      if (!lIlIiIliIlIiIl.IilliliilIIi(var5, true, false, iIIIlIlIIl<invokedynamic>())) {
         this.iiIIIliIIi = null;
         this.IIlIIliIIi = null;
         return null;
      } else {
         return var5;
      }
   }

   Runnable IIIllIIliIIl(Runnable body) {
      return this.IlIlllIlilIl(body, (lIliliiIlili)null);
   }

   static int Ililllililil(iIllliIiIlllliIi[] gappleWanted, int maxRank, boolean inv, boolean xpWanted, int selected) {
      long var10 = 1673134281019077638L;
      long var12 = 8544956661475246759L;
      var10 ^= (-4294967296L ^ var10) & -1L << 32;
      var10 ^= (2147483647L ^ var10) & -1L >>> 32;

      for(long var17 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var17 >>> 32) < 9; var17 += 4294967296L) {
         iIllliIiIlllliIi var8 = gappleWanted[(int)(var17 >>> 32)] == null ? iIllliIiIlllliIi.liIliliIIi : gappleWanted[(int)(var17 >>> 32)];
         if ((int)(var17 >>> 32) != maxRank && !var8.iliIiiliiiii()) {
            var17 ^= ((long)IIillIiliIil(var8.IliIlllilIi(), inv, xpWanted) ^ var17) & -1L >>> 32;
            if ((int)var17 >= 0 && (int)var17 <= selected && (int)var17 < (int)var10) {
               var10 ^= ((long)((int)var17) ^ var10) & -1L >>> 32;
               var10 ^= ((long)((int)(var17 >>> 32)) << 32 ^ var10) & -1L << 32;
            }
         }
      }

      return (int)(var10 >>> 32);
   }

   static iIllliIiIlllliIi Iilililiiili(class_1799 s, boolean blocked) {
      long var7 = 4051372995474238293L;
      if (s != null && !s.method_7960()) {
         if (s.method_31574(class_1802.field_8288)) {
            return new iIllliIiIlllliIi(iilillIiIIiillIi.liliIIlIIi, (lIliliiIlili)null, s.method_7947(), s.method_7914(), (double)0.0F, blocked);
         } else {
            lIliliiIlili var2 = null;
            lIliliiIlili[] var3 = lIliliiIlili.values();
            var7 ^= ((long)var3.length << 32 ^ var7) & -1L << 32;

            for(long var11 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
               lIliliiIlili var6 = var3[(int)var11];
               if (var6.iIllIllIlIlllIllIl.test(s)) {
                  var2 = var6;
                  break;
               }
            }

            iilillIiIIiillIi var9;
            if (var2 != null && var2.IillIllIllillIllIl) {
               var9 = iilillIiIIiillIi.lIiiIIlIIi;
            } else if (var2 == lIliliiIlili.liIlIllIliiIlIllIl) {
               var9 = iilillIiIIiillIi.iIiiIIlIIi;
            } else if (var2 == lIliliiIlili.IIllIllIllIllIllIl) {
               var9 = iilillIiIIiillIi.IliiIIlIIi;
            } else if (!lIlllIliIlllIl.IilliliilIIi(s) && !s.method_31574(class_1802.field_8255)) {
               if (iillilIiIIililIi.IIIilIIiiIIi(s)) {
                  var9 = iilillIiIIiillIi.IIiiIIlIIi;
               } else if (s.method_57826(class_9334.field_50075)) {
                  var9 = iilillIiIIiillIi.lliiIIlIIi;
               } else {
                  var9 = iilillIiIIiillIi.iliiIIlIIi;
               }
            } else {
               var9 = iilillIiIIiillIi.iiliIIlIIi;
            }

            double var4 = var2 == lIliliiIlili.IiiIIllIlliiIIllIl ? Iliilliiilii(s) : (var2 == lIliliiIlili.ilIlIllIlIiIlIllIl ? IIiilIiiiIii(s) : (double)s.method_7947());
            return new iIllliIiIlllliIi(var9, var2, s.method_7947(), s.method_7914(), var4, blocked);
         }
      } else {
         return new iIllliIiIlllliIi(iilillIiIIiillIi.IiliIIlIIi, (lIliliiIlili)null, 0, 64, (double)0.0F, blocked);
      }
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 24874) + '蒱') << 8 | (char)((char)((char)(var4[var5] + var5) ^ 24874) + '蒱') >>> 8) + var5) ^ var5) ^ 2902) ^ 29596) + 18335) - '빬') - var5) + var5) - 31192))) + var5) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) >>> 13) - var5) ^ 30404) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) >>> 13) - var5) ^ 30404) << 8) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) >>> 13) - var5) ^ 30404) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) << 3 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '\uab1f') - '\ue256') ^ 29166) + 'Ｌ') + var5) >>> 13) - var5) ^ 30404) << 8) >>> 7) ^ var5) + '폴'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liiiIIllIl(lIliliiIlili tick, long kind) {
      return tick != null && this.ilIIIliIIi[tick.ordinal()] > kind;
   }

   public static Iililllilill Iilllilliill(iIllliIiIlllliIi[] selected, int inv, boolean gappleWanted, boolean skipAnchors, boolean only, lIliliiIlili xpWanted) {
      long var17 = 2721826047156316979L;
      long var13 = -7797439854967767194L;
      long var15 = -2934311771983486501L;
      if (selected != null && selected.length >= 36) {
         lIliliiIlili[] var6 = lIliliiIlili.values();
         var13 ^= ((long)var6.length << 32 ^ var13) & -1L << 32;

         for(var13 ^= (0L ^ var13) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
            lIliliiIlili var9 = var6[(int)var13];
            if ((xpWanted == null || var9 == xpWanted) && (!var9.llllIllIlilllIllIl || !gappleWanted) && (xpWanted != null || var9 != lIliliiIlili.IIllIllIllIllIllIl || skipAnchors) && !Iiilliiliiil(selected, var9)) {
               var15 ^= ((long)IIIilIIiiIIi(selected, var9) << 32 ^ var15) & -1L << 32;
               if ((int)(var15 >>> 32) >= 0) {
                  var15 ^= ((long)(var9 == lIliliiIlili.liIlIllIliiIlIllIl && !only && xpWanted == null ? 2 : Integer.MAX_VALUE) ^ var15) & -1L >>> 32;
                  var17 ^= ((long)Ililllililil(selected, inv, skipAnchors, only, (int)var15) << 32 ^ var17) & -1L << 32;
                  if ((int)(var17 >>> 32) >= 0) {
                     return new Iililllilill(var9, (int)(var15 >>> 32), (int)(var17 >>> 32));
                  }
               }
            }
         }

         if (xpWanted != null) {
            return null;
         } else {
            var6 = new lIliliiIlili[]{lIliliiIlili.iIiIIllIlIliIIllIl, lIliliiIlili.lliIIllIliliIIllIl, lIliliiIlili.iiiIIllIlIIIlIllIl};
            var13 ^= ((long)var6.length << 32 ^ var13) & -1L << 32;

            for(long var24 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var24 < (int)(var24 >>> 32); var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
               lIliliiIlili var20 = var6[(int)var24];
               var15 ^= ((long)IiIiliIiiiIi(selected, inv, var20) << 32 ^ var15) & -1L << 32;
               if ((int)(var15 >>> 32) >= 0) {
                  var15 ^= ((long)IIIilIIiiIIi(selected, var20) ^ var15) & -1L >>> 32;
                  if ((int)var15 >= 0 && selected[(int)var15].iIlIlllllill() > selected[(int)(var15 >>> 32)].iIlIlllllill()) {
                     return new Iililllilill(var20, (int)var15, (int)(var15 >>> 32));
                  }
               }
            }

            return null;
         }
      } else {
         return null;
      }
   }

   public boolean lIiiIiIlilli(lIliliiIlili kind) {
      long var9 = -7936116836513004798L;
      if (kind == null) {
         return false;
      } else {
         class_310 var2 = class_310.method_1551();
         class_746 var3 = var2.field_1724;
         if (var3 != null && var2.field_1687 != null && var2.field_1761 != null) {
            iIllliIiIlllliIi[] var4 = Illillliilli(var3);
            if (Iiilliiliiil(var4, kind)) {
               return true;
            } else if (this.iiIIIliIIi != null && this.IIlIIliIIi == kind) {
               return true;
            } else if (!iillilIiIIililIi.iliIiiliiiii(var2, this.llIIIliIIi)) {
               return false;
            } else {
               long var5 = IIllIIlilIllIIli.IlIlllIlilIl();
               var9 ^= ((long)(!lliiIliliiIl.iIlIlllllill() ? 1 : 0) << 32 ^ var9) & -1L << 32;
               Iililllilill var8 = Iilllilliill(var4, var3.method_31548().method_67532(), (int)(var9 >>> 32) != 0 || !this.IiIIIliIIi, this.liiiIIllIl(lIliliiIlili.IIllIllIllIllIllIl, var5) || kind == lIliliiIlili.IIllIllIllIllIllIl, this.liiiIIllIl(lIliliiIlili.liIlIllIliiIlIllIl, var5) || kind == lIliliiIlili.liIlIllIliiIlIllIl, kind);
               return var8 == null ? false : this.iliIiiliiiii(var3, var8);
            }
         } else {
            return false;
         }
      }
   }

   public static int IIillIiliIil(iilillIiIIiillIi gappleWanted, boolean cls, boolean xpWanted) {
      if (gappleWanted == null) {
         return -1;
      } else {
         int var10000;
         switch (gappleWanted.ordinal()) {
            case 0:
               var10000 = 0;
               break;
            case 1:
            case 2:
            case 3:
            case 4:
               var10000 = -1;
               break;
            case 5:
               var10000 = xpWanted ? -1 : 3;
               break;
            case 6:
               var10000 = cls ? -1 : 1;
               break;
            case 7:
               var10000 = 3;
               break;
            case 8:
               var10000 = 2;
               break;
            default:
               throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }

   private boolean iliIiiliiiii(class_746 p, Iililllilill m) {
      long var8 = -469545172226534261L;
      var8 ^= ((long)m.liiiIIllIl() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)m.iIlIlllllill() ^ var8) & -1L >>> 32;
      class_1799 var5 = p.method_31548().method_5438((int)(var8 >>> 32)).method_7972();
      class_1799 var6 = p.method_31548().method_5438((int)var8).method_7972();
      Runnable var7 = this.IlIlllIlilIl(() -> {
         long var12 = 515300494001407571L;
         class_310 var5x = class_310.method_1551();
         class_746 var6x = var5x.field_1724;
         if (var6x != null && var5x.field_1761 != null) {
            if (iillilIiIIililIi.iliIiiliiiii(var5x, this.llIIIliIIi)) {
               if (!lllIIllillIIll.liiiIIllIl(sourceSnapshot) && !lllIIllillIIll.liiiIIllIl(source) && !lllIIllillIIll.IliIlllilIi(source)) {
                  class_1661 var7 = var6x.method_31548();
                  if (source != var7.method_67532()) {
                     class_1799 var8 = var7.method_5438(sourceSnapshot);
                     class_1799 var9 = var7.method_5438(source);
                     if (iillilIiIIililIi.Iilllilliill(var8, var5) && iillilIiIIililIi.Iilllilliill(var9, var6)) {
                        if (!var8.method_31574(class_1802.field_8288) && !var9.method_31574(class_1802.field_8288)) {
                           if (lIlillliIlilll.IliIlllilIi(this.llIIIliIIi)) {
                              try {
                                 var12 ^= ((long)var6x.field_7498.field_7763 << 32 ^ var12) & -1L << 32;
                                 var5x.field_1761.method_2906((int)(var12 >>> 32), iillilIiIIililIi.IliIlllilIi(sourceSnapshot), source, class_1713.field_7791, var6x);
                                 iillilIiIIililIi.Ililllililil(var5x, (int)(var12 >>> 32));
                              } finally {
                                 lIlillliIlilll.liiiIIllIl(this.llIIIliIIi);
                              }

                           }
                        }
                     }
                  }
               }
            }
         }
      }, m.IliIlllilIi());
      if (var7 == null) {
         return false;
      } else {
         this.liIIIliIIi = IIllIIlilIllIIli.IlIlllIlilIl();
         return true;
      }
   }

   public void IliIlllilIi(lIliliiIlili untilTick, long kind) {
      long var5 = -6675293046903360289L;
      if (untilTick != null) {
         var5 ^= ((long)untilTick.ordinal() << 32 ^ var5) & -1L << 32;
         if (kind > this.ilIIIliIIi[(int)(var5 >>> 32)]) {
            this.ilIIIliIIi[(int)(var5 >>> 32)] = kind;
         }

      }
   }

   public IilliIIllilliIIl iIlIlllllill(IIllIIllIllIIl s) {
      long var8 = -8747143686831279212L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      if (var3 == null) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IlIIiiIiil, iIIIlIlIIl<invokedynamic>());
      } else if (!iillilIiIIililIi.iliIiiliiiii(var2, this.llIIIliIIi)) {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IlIIiiIiil, iIIIlIlIIl<invokedynamic>());
      } else {
         if (s != null && s.Iiilliiliiil() != null) {
            this.IiIIIliIIi = s.Iiilliiliiil().iliIiiliiiii();
         }

         var8 ^= ((long)(s != null ? s.Ililllililil() : (!lliiIliliiIl.iIlIlllllill() ? 1 : 0)) << 32 ^ var8) & -1L << 32;
         long var5 = s != null ? s.IIIllIIliIIl() : IIllIIlilIllIIli.IlIlllIlilIl();
         Iililllilill var7 = Iilllilliill(Illillliilli(var3), var3.method_31548().method_67532(), (int)(var8 >>> 32) != 0 || !this.IiIIIliIIi, this.liiiIIllIl(lIliliiIlili.IIllIllIllIllIllIl, var5), this.liiiIIllIl(lIliliiIlili.liIlIllIliiIlIllIl, var5), (lIliliiIlili)null);
         return var7 == null ? IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.IlIIiiIiil, iIIIlIlIIl<invokedynamic>()) : new IilliIIllilliIIl(iIlIIIIiIllIIIIi.IlIIiiIiil, true, (double)1.0F, 1, false, false, var7.IliIlllilIi().name().toLowerCase(Locale.ROOT));
      }
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 8209) >>> 2 | (char)((char)((char)(-var4[var5]) - var5) - 8209) << 14) + var5) - var5) + '\udd98') ^ 3892) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - '\uf4a0') ^ var5) << 10 | (char)((char)(var4[var5] - '\uf4a0') ^ var5) >>> 6) - var5) >>> 8 | (char)((char)((char)((char)(var4[var5] - '\uf4a0') ^ var5) << 10 | (char)((char)(var4[var5] - '\uf4a0') ^ var5) >>> 6) - var5) << 8))))) >>> 4 | (char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] - '\uf4a0') ^ var5) << 10 | (char)((char)(var4[var5] - '\uf4a0') ^ var5) >>> 6) - var5) >>> 8 | (char)((char)((char)((char)(var4[var5] - '\uf4a0') ^ var5) << 10 | (char)((char)(var4[var5] - '\uf4a0') ^ var5) >>> 6) - var5) << 8))))) << 12) + var5))) ^ 687))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Iililllilill Illlllllilll(class_746 p, boolean skipAnchors) {
      return p == null ? null : Iilllilliill(Illillliilli(p), p.method_31548().method_67532(), skipAnchors, false, false, (lIliliiIlili)null);
   }

   static boolean Iiilliiliiil(iIllliIiIlllliIi[] inv, lIliliiIlili k) {
      long var4 = 1859684542620031385L;

      for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 9; var6 += 4294967296L) {
         iIllliIiIlllliIi var3 = inv[(int)(var6 >>> 32)];
         if (var3 != null && var3.liiiIIllIl() == k) {
            return true;
         }
      }

      return false;
   }

   static iIllliIiIlllliIi[] Illillliilli(class_746 p) {
      long var5 = 5097738979394732047L;
      class_1661 var1 = p.method_31548();
      iIllliIiIlllliIi[] var2 = new iIllliIiIlllliIi[36];

      for(var5 ^= (0L ^ var5) & -1L << 32; (int)(var5 >>> 32) < 36; var5 += 4294967296L) {
         var5 ^= ((long)(!lllIIllillIIll.liiiIIllIl((int)(var5 >>> 32)) && ((int)(var5 >>> 32) >= 9 || !lllIIllillIIll.IliIlllilIi((int)(var5 >>> 32))) ? 0 : 1) ^ var5) & -1L >>> 32;
         var2[(int)(var5 >>> 32)] = Iilililiiili(var1.method_5438((int)(var5 >>> 32)), (boolean)((int)var5));
      }

      return var2;
   }

   public void IiIlliIliiIl() {
      ++this.lIlIIliIIi;
      Runnable var1 = this.iiIIIliIIi;
      this.iiIIIliIIi = null;
      this.IIlIIliIIi = null;
      if (var1 != null) {
         lIlIiIliIlIiIl.Iiilliiliiil(var1);
      }

   }

   public long IIlllIlliIll() {
      return this.liIIIliIIi;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2807517104044320800L ^ Long.rotateLeft(-6404042319061109191L, 55) ^ -7731210772093947140L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -198436420064851454L ^ Long.rotateLeft(-3844291571871181087L, 43) ^ -7982118294284211589L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3363056651669747365L ^ Long.rotateLeft(1158469875507111540L, 63) ^ -3467669531849807199L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3584737328638513125L ^ Long.rotateLeft(-4643746441119061282L, 55) ^ 4146286009932182260L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4143326031013890839L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7391909398100760581L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6942202156516683295L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2753467557566616022L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8935404301936327576L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8163208634044799370L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(llIIlilIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIIlliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iiIIlIIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIlIliIlIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IllIllllIl<invokedynamic>());
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

   public boolean IilliliilIIi(boolean window) {
      long var8 = 7774728589176855554L;
      if (!window) {
         return false;
      } else {
         class_310 var2 = class_310.method_1551();
         class_746 var3 = var2.field_1724;
         if (var3 != null && var2.field_1687 != null && var2.field_1761 != null) {
            if (!iillilIiIIililIi.iliIiiliiiii(var2, this.llIIIliIIi)) {
               return false;
            } else {
               var8 ^= ((long)(!lliiIliliiIl.iIlIlllllill() ? 1 : 0) << 32 ^ var8) & -1L << 32;
               long var5 = IIllIIlilIllIIli.IlIlllIlilIl();
               Iililllilill var7 = Iilllilliill(Illillliilli(var3), var3.method_31548().method_67532(), (int)(var8 >>> 32) != 0 || !this.IiIIIliIIi, this.liiiIIllIl(lIliliiIlili.IIllIllIllIllIllIl, var5), this.liiiIIllIl(lIliliiIlili.liIlIllIliiIlIllIl, var5), (lIliliiIlili)null);
               return var7 == null ? false : this.iliIiiliiiii(var3, var7);
            }
         } else {
            return false;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '퓎') >>> 2 | (char)(var4[var5] + '퓎') << 14) - '\ue489'))) - '녏') ^ '\uf07a') + '赶') - var5) ^ var5) + var5) + 28332) + 3113))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIIIliIiIlIIliIi(Object owner) {
      this.llIIIliIIi = owner;
      Arrays.fill(this.ilIIIliIIi, Long.MIN_VALUE);
   }

   public static int IlIillIiilIi(iIllliIiIlllliIi[] inv) {
      long var6 = -6295873219920158851L;
      var6 ^= (-4294967296L ^ var6) & -1L << 32;
      double var2 = Double.NEGATIVE_INFINITY;

      for(var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < inv.length && (int)var6 <= 35; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         iIllliIiIlllliIi var5 = inv[(int)var6];
         if (var5 != null && var5.liiiIIllIl() == lIliliiIlili.ilIlIllIlIiIlIllIl && (var5.lIiiIiIlilli() > var2 || var5.lIiiIiIlilli() == var2 && (int)var6 < 9 && (int)(var6 >>> 32) >= 9)) {
            var2 = var5.lIiiIiIlilli();
            var6 ^= ((long)((int)var6) << 32 ^ var6) & -1L << 32;
         }
      }

      return (int)(var6 >>> 32);
   }

   private static double IIiilIiiiIii(class_1799 s) {
      long var3 = -4807898920187010054L;
      class_2680 var1 = class_2246.field_10540.method_9564();
      var3 ^= ((long)lIlllIliIlllIl.lIiiIiIlilli(s, class_1893.field_9131) << 32 ^ var3) & -1L << 32;
      return IIlilIliiIli(s.method_7924(var1), (int)(var3 >>> 32), s.method_7951(var1));
   }

   static int IIIilIIiiIIi(iIllliIiIlllliIi[] k, lIliliiIlili inv) {
      long var7 = -2442946372040462957L;
      var7 ^= (-4294967296L ^ var7) & -1L << 32;
      double var3 = Double.NEGATIVE_INFINITY;

      for(var7 ^= (9L ^ var7) & -1L >>> 32; (int)var7 <= 35 && (int)var7 < k.length; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
         iIllliIiIlllliIi var6 = k[(int)var7];
         if (var6 != null && var6.liiiIIllIl() == inv && !var6.iliIiiliiiii() && var6.lIiiIiIlilli() > var3) {
            var3 = var6.lIiiIiIlilli();
            var7 ^= ((long)((int)var7) << 32 ^ var7) & -1L << 32;
         }
      }

      return (int)(var7 >>> 32);
   }
}
