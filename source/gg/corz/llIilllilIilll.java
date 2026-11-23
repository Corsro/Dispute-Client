package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1542;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3965;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;

public final class llIilllilIilll {
   private static final int ilIlIlIIiIiIlIlIIi = 300;
   private long llIiIlIIiilIiIlIIi = 2902909082203483531L ^ -4014619945437598325L;
   public static final Set<class_2248> IlIlIlIIillIlIlIIi;
   private final IIiIiIillIiIiIil iIllIlIIiIlllIlIIi;
   private boolean iIiiIlIIiIliiIlIIi;
   private boolean lIliIlIIiiIliIlIIi;
   private int IIIiIlIIilIIiIlIIi = -1;
   private final IIiIIlilIiIIli IIllIlIIilIllIlIIi;
   private long iIIiIlIIiIlIiIlIIi = -1L;
   private String iiIiIlIIiIIliIlIIi = "";
   private boolean IlliIlIIillliIlIIi;
   private int illiIlIIiIiliIlIIi;
   private int liilIlIIiiiilIlIIi = -1;
   private long lIilIlIIiiIilIlIIi;
   private final class_310 liIlIlIIiiiIlIlIIi = class_310.method_1551();
   private final Object IillIlIIilillIlIIi;
   private long IlilIlIIillilIlIIi;
   private class_2338 ililIlIIiIiilIlIIi;
   private final llIlIiilIlIi llllIlIIiilllIlIIi;
   private String IIiiIlIIilIiiIlIIi;
   private int IiIiIlIIiliIiIlIIi;
   private int iillIlIIiIIilIlIIi;
   private int liliIlIIiiiliIlIIi;

   private class_2338 IlIillIiilIi() {
      class_2338 var1 = this.IIllIlIIilIllIlIIi.Iiilliiliiil();
      class_2338 var2 = null;
      double var3 = Double.MAX_VALUE;

      for(int var5 = -2; var5 <= 2; ++var5) {
         for(int var6 = -2; var6 <= 2; ++var6) {
            for(int var7 = -1; var7 <= 1; ++var7) {
               class_2338 var8 = var1.method_10069(var5, var7, var6);
               if (this.IiIiliIiiiIi(var8)) {
                  double var9 = this.liIlIlIIiiiIlIlIIi.field_1724.method_33571().method_1022(class_243.method_24953(var8)) + (double)Math.abs(var7) * (double)0.5F;
                  if (!(var9 < 1.4) && !(var9 > 3.4) && var9 < var3) {
                     var3 = var9;
                     var2 = var8;
                  }
               }
            }
         }
      }

      return var2;
   }

   public String liiiIIllIl() {
      return this.iiIiIlIIiIIliIlIIi;
   }

   private void Illillliilli(class_2338 pos) {
      class_746 var2 = this.liIlIlIIiiiIlIlIIi.field_1724;
      if (var2.method_33571().method_1022(class_243.method_24953(pos)) > Double.longBitsToDouble(-5408194858402184463L ^ -801012439602167055L)) {
         this.llllIlIIiilllIlIIi.Iilllilliill(this.lIilIlIIiiIilIlIIi, IIiIllIiIl<invokedynamic>() + pos.method_10063(), (posx) -> class_243.method_24953(posx.method_10084()).method_1025(class_243.method_24953(pos)) <= Double.longBitsToDouble(8843859442549484047L ^ 4224316729541230195L) && !posx.equals(pos), pos, pos, false);
      } else {
         class_243 var3 = this.IIllIlIIilIllIlIIi.Iliilliiilii(pos, Double.longBitsToDouble(4308056220360283747L ^ 8924245838415042147L));
         if (var3 != null) {
            this.IIllIlIIilIllIlIIi.IIlllIlliIll(var3, 1);
            if (!var2.method_5715() && this.IIllIlIIilIllIlIIi.IIIIllIIIl(var3, 6.0F) && this.lIilIlIIiiIilIlIIi - this.llIiIlIIiilIiIlIIi >= (-8695866941267991532L ^ -8695866941267991534L)) {
               class_3965 var4 = this.IIllIlIIilIllIlIIi.IIiilIiiiIii(Double.longBitsToDouble(-6918066913440291912L ^ -2310884494640274504L));
               if (var4.method_17783() == class_240.field_1332 && var4.method_17777().equals(pos)) {
                  if (this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(pos).method_27852(class_2246.field_10443)) {
                     this.llIiIlIIiilIiIlIIi = this.lIilIlIIiiIilIlIIi;
                     this.IlliIlIIillliIlIIi = true;
                     this.liIlIlIIiiiIlIlIIi.field_1761.method_2896(var2, class_1268.field_5808, var4);
                     var2.method_6104(class_1268.field_5808);
                  }
               }
            }
         }
      }
   }

   public static boolean IIIllIIliIIl(class_746 p, IIiIiIillIiIiIil breaker) {
      class_1661 var2 = p.method_31548();
      boolean var3 = false;
      boolean var4 = false;

      for(int var5 = 0; var5 <= 35; ++var5) {
         class_1799 var6 = var2.method_5438(var5);
         if (var6.method_31574(class_1802.field_8466)) {
            var3 = true;
         }

         if (breaker.Illlllllilll(var6)) {
            var4 = true;
         }
      }

      return var3 && var4;
   }

   public boolean Illlllllilll() {
      class_746 var1 = this.liIlIlIIiiiIlIlIIi.field_1724;
      if (var1 != null && var1.field_7512 == var1.field_7498 && !lIlIiIliIlIiIl.Illlllllilll()) {
         class_1661 var2 = var1.method_31548();

         for(int var3 = 0; var3 <= 35; ++var3) {
            if (IIlllIlliIll(var2.method_5438(var3))) {
               if (!lIlillliIlilll.IliIlllilIi(this.IillIlIIilillIlIIi)) {
                  return false;
               }

               lIlIiIliIlIiIl.iIlIlllllill(() -> {
                  class_746 var2 = this.liIlIlIIiiiIlIlIIi.field_1724;
                  if (var2 != null && this.liIlIlIIiiiIlIlIIi.field_1761 != null && var2.field_7512 == var2.field_7498) {
                     if (IIlllIlliIll(var2.method_31548().method_5438(var3))) {
                        this.liIlIlIIiiiIlIlIIi.field_1761.method_2906(var2.field_7498.field_7763, iiilIiIiIIIiIiIi.IliIlllilIi(var3), 1, class_1713.field_7795, var2);
                     }
                  }
               }, true);
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private boolean IiIiliIiiiIi(class_2338 c) {
      class_2680 var2 = this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(c);
      class_2680 var3 = this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(c.method_10074());
      class_2680 var4 = this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(c.method_10084());
      if (!var2.method_26215()) {
         return false;
      } else if (!var3.method_27852(class_2246.field_23152) && !var3.method_31709() && !var3.method_26220(this.liIlIlIIiiiIlIlIIi.field_1687, c.method_10074()).method_1110()) {
         if (!var3.method_26216()) {
            return false;
         } else if (!var4.method_26220(this.liIlIlIIiiiIlIlIIi.field_1687, c.method_10084()).method_1110()) {
            return false;
         } else {
            class_238 var5 = new class_238(c);
            return !this.liIlIlIIiiiIlIlIIi.field_1724.method_5829().method_994(var5) && !this.liIlIlIIiiiIlIlIIi.field_1724.method_5829().method_994(new class_238(c.method_10084())) ? this.liIlIlIIiiiIlIlIIi.field_1687.method_8335(this.liIlIlIIiiiIlIlIIi.field_1724, var5.method_1014(Double.longBitsToDouble(9170187508414071623L ^ 4682219060592073437L))).isEmpty() : false;
         }
      } else {
         return false;
      }
   }

   public iiiIiilIIIliil Iilllilliill(long nowTick) {
      this.lIilIlIIiiIilIlIIi = nowTick;
      class_746 var3 = this.liIlIlIIiiiIlIlIIi.field_1724;
      if (var3 != null && this.liIlIlIIiiiIlIlIIi.field_1687 != null && this.liIlIlIIiiiIlIlIIi.field_1761 != null) {
         if (this.lIilIlIIiiIilIlIIi - this.IlilIlIIillilIlIIi > 300L) {
            return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>() + this.iillIlIIiIIilIlIIi + IIiIllIiIl<invokedynamic>());
         } else {
            if (this.iIiiIlIIiIliiIlIIi) {
               this.iIiiIlIIiIliiIlIIi = false;
               if (this.iillIlIIiIIilIlIIi <= 1) {
                  return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
               }
            }

            if (!var3.method_24828() && this.iillIlIIiIIilIlIIi != 1) {
               return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
            } else {
               switch (this.iillIlIIiIIilIlIIi) {
                  case 0:
                     boolean var10 = this.ililIlIIiIiilIlIIi != null && this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(this.ililIlIIiIiilIlIIi).method_27852(class_2246.field_10443);
                     boolean var12 = var10 || IIIllIIliIIl(var3, this.iIllIlIIiIlllIlIIi);
                     if (!var10 && var12 && this.ililIlIIiIiilIlIIi == null) {
                        this.ililIlIIiIiilIlIIi = this.IlIillIiilIi();
                     }

                     switch (IliiIIlllliiIIll.IliIlllilIi(var10, var12, this.ililIlIIiIiilIlIIi != null)) {
                        case lillIilIIi:
                           this.IIillIiliIil(1);
                           return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                        case IIilIilIIi:
                           return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                        case lIilIilIIi:
                           return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                        default:
                           if (!this.IIlilIliiIli(this.ililIlIIiIiilIlIIi) && this.lIilIlIIiiIilIlIIi - this.IlilIlIIillilIlIIi > 120L) {
                              this.ililIlIIiIiilIlIIi = null;
                              if (++this.IiIiIlIIiliIiIlIIi >= 3) {
                                 return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                              }

                              this.IlilIlIIillilIlIIi = this.lIilIlIIiiIilIlIIi;
                           }

                           return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }
                  case 1:
                     if (this.IIIilIIiiIIi()) {
                        this.liilIlIIiiiilIlIIi = var3.field_7512.field_7763;
                        this.lIliIlIIiiIliIlIIi = true;
                        this.IIillIiliIil(2);
                        return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }

                     if (!this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(this.ililIlIIiIiilIlIIi).method_27852(class_2246.field_10443)) {
                        if (++this.IiIiIlIIiliIiIlIIi >= 3) {
                           return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                        }

                        this.IIillIiliIil(0);
                        this.ililIlIIiIiilIlIIi = null;
                        return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }

                     this.Illillliilli(this.ililIlIIiIiilIlIIi);
                     break;
                  case 2:
                     if (!this.IIIilIIiiIIi()) {
                        this.IIillIiliIil(1);
                        return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }

                     class_1703 var9 = var3.field_7512;
                     int var11 = IIiilIiiiIii(var9, (s) -> s.method_31574(class_1802.field_23141));
                     if (var11 >= 0 && Iliilliiilii(var9, class_1799::method_7960) >= 0) {
                        if (this.lIilIlIIiiIilIlIIi - this.llIiIlIIiilIiIlIIi >= 4L) {
                           this.llIiIlIIiilIiIlIIi = this.lIilIlIIiiIilIlIIi;
                           this.liIlIlIIiiiIlIlIIi.field_1761.method_2906(var9.field_7763, var11, 0, class_1713.field_7794, var3);
                        }
                        break;
                     }

                     this.liliIlIIiiiliIlIIi = Math.max(0, this.illiIlIIiIiliIlIIi - Iiiiliiiiiii(var3, class_1802.field_23141));
                     if (this.liliIlIIiiiliIlIIi == 0) {
                        this.IIiiIlIIilIiiIlIIi = var11 < 0 ? IIiIllIiIl<invokedynamic>() : IIiIllIiIl<invokedynamic>();
                     }

                     this.IIillIiliIil(3);
                     return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                  case 3:
                     if (this.IIIilIIiiIIi()) {
                        var3.method_7346();
                        this.lIliIlIIiiIliIlIIi = false;
                        return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }

                     this.IIIiIlIIilIIiIlIIi = Iiiiliiiiiii(var3, class_1802.field_8466);
                     this.IIillIiliIil(4);
                     break;
                  case 4:
                     if (!this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(this.ililIlIIiIiilIlIIi).method_27852(class_2246.field_10443)) {
                        this.IIillIiliIil(5);
                        this.iIIiIlIIiIlIiIlIIi = this.lIilIlIIiiIilIlIIi;
                        return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }

                     if (IlIlllIlilIl(var3) < 1 && !this.Illlllllilll()) {
                        return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                     }

                     if (var3.method_33571().method_1022(class_243.method_24953(this.ililIlIIiIiilIlIIi)) > (double)4.0F) {
                        liIIIilliiIIIill var8 = this.llllIlIIiilllIlIIi.Iilllilliill(this.lIilIlIIiiIilIlIIi, IIiIllIiIl<invokedynamic>() + this.ililIlIIiIiilIlIIi.method_10063(), (c) -> class_243.method_24953(c.method_10084()).method_1025(class_243.method_24953(this.ililIlIIiIiilIlIIi)) <= 10.240000000000002 && !c.equals(this.ililIlIIiIiilIlIIi), this.ililIlIIiIiilIlIIi, this.ililIlIIiIiilIlIIi, false);
                        if (var8 == liIIIilliiIIIill.iIlilllill) {
                           return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                        }

                        return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }

                     lIlIiiiliIlIiiil var7 = this.iIllIlIIiIlllIlIIi.IIIllIIliIIl(this.ililIlIIiIiilIlIIi, true);
                     if (var7 == lIlIiiiliIlIiiil.liIiiIIiil) {
                        return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                     }

                     if (var7 == lIlIiiiliIlIiiil.ilIiiIIiil) {
                        this.iIllIlIIiIlllIlIIi.lIiiIiIlilli(true);
                     }
                     break;
                  case 5:
                     if (Iiiiliiiiiii(var3, class_1802.field_8466) > this.IIIiIlIIilIIiIlIIi) {
                        return this.IIiiIlIIilIiiIlIIi != null ? this.Iiilliiliiil(this.IIiiIlIIilIiiIlIIi) : this.Ililllililil();
                     }

                     class_1542 var4 = IIIIllIIIl(var3, (double)8.0F, (it) -> it.method_6983().method_31574(class_1802.field_8466));
                     if (var4 != null && this.lIilIlIIiiIilIlIIi - this.iIIiIlIIiIlIiIlIIi < 200L) {
                        class_2338 var5 = var4.method_24515();
                        liIIIilliiIIIill var6 = this.llllIlIIiilllIlIIi.Iilllilliill(this.lIilIlIIiiIilIlIIi, IIiIllIiIl<invokedynamic>() + var5.method_10063(), (c) -> c.method_10263() == var5.method_10263() && c.method_10260() == var5.method_10260() && Math.abs(c.method_10264() - var5.method_10264()) <= 1, var5, var5, false);
                        if (var6 == liIIIilliiIIIill.lllilllill) {
                           this.IIllIlIIilIllIlIIi.IIlilIliiIli(var4.method_73189(), false);
                        }

                        return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
                     }

                     if (this.lIilIlIIiiIilIlIIi - this.iIIiIlIIiIlIiIlIIi > 60L) {
                        return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
                     }
                     break;
                  default:
                     return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
               }

               return iiiIiilIIIliil.iIlIiIlliIllIiIlli;
            }
         }
      } else {
         return this.Iiilliiliiil(IIiIllIiIl<invokedynamic>());
      }
   }

   public void IliIlllilIi(long nowTick) {
      this.iillIlIIiIIilIlIIi = 0;
      this.lIilIlIIiiIilIlIIi = nowTick;
      this.IlilIlIIillilIlIIi = nowTick;
      this.ililIlIIiIiilIlIIi = null;
      this.liilIlIIiiiilIlIIi = -1;
      this.IIIiIlIIilIIiIlIIi = -1;
      this.iIIiIlIIiIlIiIlIIi = -1L;
      this.IiIiIlIIiliIiIlIIi = 0;
      this.iiIiIlIIiIIliIlIIi = "";
      this.lIliIlIIiiIliIlIIi = false;
      this.IlliIlIIillliIlIIi = false;
      this.illiIlIIiIiliIlIIi = this.liIlIlIIiiiIlIlIIi.field_1724 == null ? 0 : Iiiiliiiiiii(this.liIlIlIIiiiIlIlIIi.field_1724, class_1802.field_23141);
      this.liliIlIIiiiliIlIIi = 0;
      this.IIiiIlIIilIiiIlIIi = null;
      this.iIiiIlIIiIliiIlIIi = false;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) >>> 4 | (char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) << 12) << 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) >>> 4 | (char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) << 12) >>> 12) ^ '츄') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) >>> 4 | (char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) << 12) << 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) >>> 4 | (char)((char)((char)((char)((char)(~var4[var5]) - '먌')) >>> 12 | (char)((char)((char)(~var4[var5]) - '먌')) << 4) - 28955) << 12) >>> 12) ^ '츄') >>> 2) + var5))) - 8290));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      IlIlIlIIillIlIlIIi = Set.of(class_2246.field_10445, class_2246.field_29031, class_2246.field_10566, class_2246.field_10340, class_2246.field_27165, class_2246.field_10115, class_2246.field_10508, class_2246.field_10474, class_2246.field_10255, class_2246.field_28888, class_2246.field_10515, class_2246.field_10102, class_2246.field_10219);
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) >>> 5 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) << 11) + 'ꀑ') << 8 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) >>> 5 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) << 11) + 'ꀑ') >>> 8) ^ 461) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) >>> 5 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) << 11) + 'ꀑ') << 8 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) >>> 5 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] - '\uddef') ^ '\uf15b'))) - 9811) + 14118))) ^ 31476) << 11) + 'ꀑ') >>> 8) ^ 461) >>> 4) - 978) - var5))) ^ '큒'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii() {
      if (this.lIiiIiIlilli() && this.liIlIlIIiiiIlIlIIi.field_1724 != null) {
         this.liIlIlIIiiiIlIlIIi.field_1724.method_7346();
      }

      this.lIliIlIIiiIliIlIIi = false;
      this.IlliIlIIillliIlIIi = false;
      lIlillliIlilll.liiiIIllIl(this.IillIlIIilillIlIIi);
   }

   private void Iilililiiili(Predicate<class_1799> match) {
      class_746 var2 = this.liIlIlIIiiiIlIlIIi.field_1724;
      if (!lIlIiIliIlIiIl.Illlllllilll() && var2.field_7512 == var2.field_7498) {
         class_1661 var3 = var2.method_31548();

         for(int var4 = 9; var4 <= 35; ++var4) {
            if (match.test(var3.method_5438(var4))) {
               if (!lIlillliIlilll.IliIlllilIi(this.IillIlIIilillIlIIi)) {
                  return;
               }

               int var6 = IIiIiIillIiIiIil.IIIilIIiiIIi(var3);
               lIlIiIliIlIiIl.iIlIlllllill(() -> {
                  class_746 var4x = this.liIlIlIIiiiIlIlIIi.field_1724;
                  if (var4x != null && this.liIlIlIIiiiIlIlIIi.field_1761 != null && var4x.field_7512 == var4x.field_7498) {
                     if (match.test(var4x.method_31548().method_5438(var4))) {
                        this.liIlIlIIiiiIlIlIIi.field_1761.method_2906(var4x.field_7498.field_7763, iiilIiIiIIIiIiIi.IliIlllilIi(var4), iiilIiIiIIIiIiIi.iIlIlllllill(var6), class_1713.field_7791, var4x);
                     }
                  }
               }, true);
               return;
            }
         }

      }
   }

   private iiiIiilIIIliil Ililllililil() {
      this.iliIiiliiiii();
      return iiiIiilIIIliil.lllIiIlliillIiIlli;
   }

   private boolean IIlilIliiIli(class_2338 pos) {
      class_746 var2 = this.liIlIlIIiiiIlIlIIi.field_1724;
      int var3 = -1;

      for(int var4 = 0; var4 < 9; ++var4) {
         if (var2.method_31548().method_5438(var4).method_31574(class_1802.field_8466)) {
            var3 = var4;
         }
      }

      if (var3 < 0) {
         this.Iilililiiili((s) -> s.method_31574(class_1802.field_8466));
         return false;
      } else {
         this.IIllIlIIilIllIlIIi.IilliliilIIi(32);
         class_2338 var7 = pos.method_10074();
         class_243 var5 = class_243.method_24953(var7).method_1031((double)0.0F, (double)0.5F, (double)0.0F);
         this.IIllIlIIilIllIlIIi.IIlllIlliIll(var5, 1);
         if (var2.method_31548().method_67532() != var3) {
            this.IIllIlIIilIllIlIIi.Ililllililil(var3);
            return false;
         } else if (var2.method_5715() && this.IIllIlIIilIllIlIIi.IIIIllIIIl(var5, 5.0F) && this.IIllIlIIilIllIlIIi.IIillIiliIil(var3) && this.lIilIlIIiiIilIlIIi - this.llIiIlIIiilIiIlIIi >= 6L) {
            class_3965 var6 = this.IIllIlIIilIllIlIIi.IIiilIiiiIii((double)4.0F);
            if (var6.method_17783() == class_240.field_1332 && var6.method_17777().equals(var7) && var6.method_17780() == class_2350.field_11036) {
               if (this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(var6.method_17777()).method_27852(class_2246.field_23152)) {
                  return false;
               } else {
                  this.llIiIlIIiilIiIlIIi = this.lIilIlIIiiIilIlIIi;
                  this.liIlIlIIiiiIlIlIIi.field_1761.method_2896(var2, class_1268.field_5808, var6);
                  var2.method_6104(class_1268.field_5808);
                  return this.liIlIlIIiiiIlIlIIi.field_1687.method_8320(pos).method_27852(class_2246.field_10443);
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) << 8 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) >>> 8) << 12 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) << 8 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) >>> 8) >>> 4) - 15674) << 12 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) << 8 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) >>> 8) << 12 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) << 8 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ 30542))))) << 13 | (char)(-((char)(~((char)(var4[var5] ^ 30542))))) >>> 3) ^ var5) >>> 8) >>> 4) - 15674) >>> 4))) - '艹') - '\ue931'))) + 27245) + 2510));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iiiIiilIIIliil Iiilliiliiil(String why) {
      this.iiIiIlIIiIIliIlIIi = why;
      this.iliIiiliiiii();
      return iiiIiilIIIliil.IilIiIllililIiIlli;
   }

   public boolean lIiiIiIlilli() {
      return IliiIIlllliiIIll.liiiIIllIl(this.IIIilIIiiIIi(), this.lIliIlIIiiIliIlIIi, this.IlliIlIIillliIlIIi, this.iillIlIIiIIilIlIIi);
   }

   private static int Iliilliiilii(class_1703 h, Predicate<class_1799> match) {
      int var2 = h.field_7761.size() - 36;

      for(int var3 = 0; var3 < var2; ++var3) {
         if (match.test(h.method_7611(var3).method_7677())) {
            return var3;
         }
      }

      return -1;
   }

   public llIilllilIilll(IIiIIlilIiIIli owner, IIiIiIillIiIiIil mover, llIlIiilIlIi breaker, Object body) {
      this.IIllIlIIilIllIlIIi = owner;
      this.iIllIlIIiIlllIlIIi = mover;
      this.llllIlIIiilllIlIIi = breaker;
      this.IillIlIIilillIlIIi = body;
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) + 14565))))) - var5) + 22376) - var5) ^ var5) << 7 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) + 14565))))) - var5) + 22376) - var5) ^ var5) >>> 9) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) + 14565))))) - var5) + 22376) - var5) ^ var5) << 7 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) + 14565))))) - var5) + 22376) - var5) ^ var5) >>> 9) ^ var5) >>> 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi() {
      this.iIiiIlIIiIliiIlIIi = true;
   }

   private void IIillIiliIil(int s) {
      this.iillIlIIiIIilIlIIi = s;
      this.IlilIlIIillilIlIIi = this.lIilIlIIiiIilIlIIi;
   }

   public boolean IIIilIIiiIIi() {
      class_746 var1 = this.liIlIlIIiiiIlIlIIi.field_1724;
      return var1 != null && this.liIlIlIIiiiIlIlIIi.field_1755 instanceof class_465 && !(this.liIlIlIIiiiIlIlIIi.field_1755 instanceof class_490) && var1.field_7512 != null && var1.field_7512 != var1.field_7498;
   }

   public int iIlIlllllill() {
      return this.liliIlIIiiiliIlIIi;
   }

   public static class_1542 IIIIllIIIl(class_746 match, double range, Predicate<class_1542> p) {
      class_243 var4 = match.method_73189();
      class_238 var5 = new class_238(var4.field_1352 - range, var4.field_1351 - range, var4.field_1350 - range, var4.field_1352 + range, var4.field_1351 + range, var4.field_1350 + range);
      class_1542 var6 = null;
      double var7 = Double.MAX_VALUE;

      for(class_1542 var10 : match.method_73183().method_8390(class_1542.class, var5, p)) {
         double var11 = var10.method_5858(match);
         if (var11 < var7) {
            var7 = var11;
            var6 = var10;
         }
      }

      return var6;
   }

   public static int IlIlllIlilIl(class_746 p) {
      int var1 = 0;
      class_1661 var2 = p.method_31548();

      for(int var3 = 0; var3 <= 35; ++var3) {
         if (var2.method_5438(var3).method_7960()) {
            ++var1;
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) << 11))) ^ var5) + '뻸') << 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) << 11))) ^ var5) + '뻸') >>> 7))) + var5) ^ '麼') + var5) << 5 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) << 11))) ^ var5) + '뻸') << 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) >>> 5 | (char)((char)((char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) << 11 | (char)((char)((char)((char)(var4[var5] + '놘')) ^ var5) + 13920) >>> 5) ^ 31030) << 11))) ^ var5) + '뻸') >>> 7))) + var5) ^ '麼') + var5) >>> 11) - '\uefbb'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IIiilIiiiIii(class_1703 h, Predicate<class_1799> match) {
      int var2 = h.field_7761.size() - 36;
      if (var2 < 0) {
         return -1;
      } else {
         for(int var3 = h.field_7761.size() - 1; var3 >= var2; --var3) {
            if (match.test(h.method_7611(var3).method_7677())) {
               return var3;
            }
         }

         return -1;
      }
   }

   public static int Iiiiliiiiiii(class_746 item, class_1792 p) {
      int var2 = 0;
      class_1661 var3 = item.method_31548();

      for(int var4 = 0; var4 <= 35; ++var4) {
         class_1799 var5 = var3.method_5438(var4);
         if (var5.method_31574(p)) {
            var2 += var5.method_7947();
         }
      }

      class_1799 var6 = item.method_6079();
      if (var6.method_31574(p)) {
         var2 += var6.method_7947();
      }

      return var2;
   }

   public static boolean IiIlliIliiIl(class_746 p) {
      class_1661 var1 = p.method_31548();

      for(int var2 = 0; var2 <= 35; ++var2) {
         class_1799 var3 = var1.method_5438(var2);
         if (var3.method_7960()) {
            return true;
         }

         if (var3.method_31574(class_1802.field_23141) && var3.method_7947() < var3.method_7914()) {
            return true;
         }
      }

      return false;
   }

   public static boolean IIlllIlliIll(class_1799 s) {
      boolean var10000;
      if (!s.method_7960()) {
         class_1792 var2 = s.method_7909();
         if (var2 instanceof class_1747) {
            class_1747 var1 = (class_1747)var2;
            if (IlIlIlIIillIlIlIIi.contains(var1.method_7711())) {
               var10000 = true;
               return var10000;
            }
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5905358939791405948L ^ Long.rotateLeft(4716982863216773446L, 53) ^ -6161123576535602810L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1637231554273235590L ^ Long.rotateLeft(2461561266141492927L, 22) ^ -3634945229050328023L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1512393182604229947L ^ Long.rotateLeft(-511486122358953704L, 33) ^ 1334729588357930474L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 457888929251990199L ^ Long.rotateLeft(-4305713471969030501L, 36) ^ -3529319218375409381L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4565447097919561517L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8401165177423787325L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3425147456166304919L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 540797559601232760L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3771644686810515736L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3840296846201120553L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIiIlIliIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lliIliliIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiiIlliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iiiIlIIIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lIIlliIIll<invokedynamic>());
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
}
