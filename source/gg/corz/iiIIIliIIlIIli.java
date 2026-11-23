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
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1542;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1742;
import net.minecraft.class_1747;
import net.minecraft.class_1749;
import net.minecraft.class_1755;
import net.minecraft.class_1774;
import net.minecraft.class_1778;
import net.minecraft.class_1786;
import net.minecraft.class_1790;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1808;
import net.minecraft.class_1826;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2815;
import net.minecraft.class_3965;
import net.minecraft.class_437;
import net.minecraft.class_465;
import net.minecraft.class_638;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;

public class iiIIIliIIlIIli extends ilIllIiIll {
   private int iilIIiiiiIIiIIiiii;
   private class_2338 illiiliiiIiliiliii;
   private final lliliIIiililiIIi iIlliliiiIllliliii = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private int IIIlIiiiilIIlIiiii;
   private int lIiIIiiiiiIiIIiiii;
   private iilIIllIIiIIll llIiiliiiilIiiliii;
   private boolean iIiiiliiiIliiiliii;
   private static final long iIIiiliiiIlIiiliii = 3000L;
   private long iiIiiliiiIIliiliii;
   private long lIliiliiiiIliiliii;
   private int IilIIiiiililIIiiii;
   private int llIlIiiiiilIlIiiii;
   private int iIIlIiiiiIlIlIiiii;
   private class_1703 liliiliiiiiliiliii;
   private long IIlIIiiiilIlIIiiii;
   private boolean lIllIiiiiiIllIiiii;
   private static final int liililiiiiiililiii = 3;
   private static final int Ilililiiillililiii = 50;
   private class_638 Illiiliiillliiliii;
   private int iIlIIiiiiIllIIiiii;
   private String IiIiiliiiliIiiliii;
   private boolean Iiiiiliiiliiiiliii;
   private int lllIIiiiiillIIiiii;
   private boolean IIiiiliiilIiiiliii;
   private boolean lIIIIiiiiiIIIIiiii;
   private class_1703 IlIIIiiiillIIIiiii;
   private static final int lIililiiiiIililiii = 3;
   private int IliIIiiiilliIIiiii;
   private boolean iiiiiliiiIIIIIiiii;
   private boolean lliiiliiiiliiiliii;
   private int liiIIiiiiiiiIIiiii;
   private int iiIlIiiiiIIllIiiii;
   private int liIIIiiiiiiIIIiiii;
   private static final int iilliliiiIIililiii = 200;
   private int ilIIIiiiiIiIIIiiii;
   private final iiIiiilIIliiil Iilliliiililliliii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private boolean IlllIiiiillllIiiii;
   private boolean illlIiiiiIillIiiii;
   private static final int ilililiiiIiililiii = 300;
   private int IiIlIiiiiliIlIiiii;
   private final iilliIlIIiliIl lllliliiiillliliii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (-(--983159115) >>> 7 | -(--983159115) << 25) ^ 1804258673, -(((282192477 >>> 9 | 282192477 << 23) << 11 | (282192477 >>> 9 | 282192477 << 23) >>> 21) * -99) ^ 79071160, 464510641 * 69 * 1736263375 ^ -2059527029);
   private static final int IIIiiliiilIIiiliii = 3;
   private int iliIIiiiiIiiIIiiii;

   public boolean IIlilIliiIli() {
      return this.iIlIiIllIi() || this.IliIlllilIi();
   }

   private void llIliilIli(String cmd) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         String var2 = cmd.startsWith(IliIlllilIi<invokedynamic>()) ? cmd.substring(1) : cmd;
         Iiiilllliiilll.field_1724.field_3944.method_45730(var2);
      }
   }

   private String IiIilliIil(String why) {
      return this.IiIlIiiiiliIlIiiii == 0 ? why + IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + this.iiIlIiiiiIIllIiiii + IliIlllilIi<invokedynamic>() + this.IiIlIiiiiliIlIiiii + (this.IiIlIiiiiliIlIiiii == ((-1920741839 * -97 << 5 | -1920741839 * -97 >>> 27) ^ 568061421) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 18097) ^ var5) + var5) + 1404) << 5 | (char)((char)((char)((char)(var4[var5] ^ 18097) ^ var5) + var5) + 1404) >>> 11) ^ '씂')))))))) << 8 | (char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 18097) ^ var5) + var5) + 1404) << 5 | (char)((char)((char)((char)(var4[var5] ^ 18097) ^ var5) + var5) + 1404) >>> 11) ^ '씂')))))))) >>> 8))))) + 28328) ^ 4602) - 10727));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) << 8 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) >>> 8) - '駥') + var5) + 23883))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) << 8 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) >>> 8) - '駥') + var5) + 23883))) << 10) << 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) << 8 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) >>> 8) - '駥') + var5) + 23883))) >>> 6 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) << 8 | (char)((char)((char)(~((char)(var4[var5] ^ var5))) - '켊') - 17960) >>> 8) - '駥') + var5) + 23883))) << 10) >>> 8) - var5) - var5) + '耭'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iIlIiIllIi() {
      return IliIlllilIi<invokedynamic>().equalsIgnoreCase(this.iIlliliiiIllliliii.Iilllilliill());
   }

   private int lililiilil() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var1 = 0;

         for(class_1542 var3 : Iiiilllliiilll.field_1687.method_8390(class_1542.class, Iiiilllliiilll.field_1724.method_5829().method_1014((double)12.0F), (e) -> e.method_6983().method_31574(class_1802.field_8606))) {
            var1 += var3.method_6983().method_7947();
         }

         return var1;
      } else {
         return 0;
      }
   }

   private boolean liiIiiiiIi(class_1799 st, ilIiIillIiIiIill cat) {
      if (st != null && !st.method_7960()) {
         class_1792 var3 = st.method_7909();
         String var4 = st.method_7964().getString().toLowerCase(Locale.ROOT);
         boolean var10000;
         switch (cat.ordinal()) {
            case 0 -> var10000 = var3 == class_1802.field_8606 || var4.contains(IliIlllilIi<invokedynamic>());
            case 1 -> var10000 = var3 == class_1802.field_8106 || var3 == class_1802.field_8247 || var3 == class_1802.field_8466 || var4.contains(IliIlllilIi<invokedynamic>()) || var4.contains(IliIlllilIi<invokedynamic>());
            case 2 -> var10000 = var3 == class_1802.field_8878 || var4.contains(IliIlllilIi<invokedynamic>());
            case 3 -> var10000 = var3 == class_1802.field_8107 || var4.contains(IliIlllilIi<invokedynamic>()) || var4.contains(IliIlllilIi<invokedynamic>());
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      } else {
         return false;
      }
   }

   private int IIiillIiil() {
      if (Iiiilllliiilll.field_1724 == null) {
         return 0;
      } else {
         class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
         int var2 = 0;

         for(int var3 = 0; var3 < var1.method_5439(); ++var3) {
            class_1799 var4 = var1.method_5438(var3);
            if (var4.method_31574(class_1802.field_8606)) {
               var2 += var4.method_7947();
            }
         }

         return var2;
      }
   }

   private void iiIliIIlli(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }

   }

   public void Iilililiiili() {
      this.lllIiillIi();
      this.Illiiliiillliiliii = null;
   }

   private void IIllllIlll(class_1703 h) {
      if (h == null) {
         this.Iillllilll();
      } else if (h == this.liliiliiiiiliiliii || this.iilllIIill(h)) {
         iIlIiIllIllIiIll var2 = this.iIiilIliil(h);
         if (var2.iIIIililll < 0) {
            if (this.IlIIillIIi() > this.ilIIiIiIIi()) {
               this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
            } else {
               this.IilIililIi();
            }

         } else {
            int var3 = this.illilIilil(h);
            if (var2.llIIililll > 0) {
               this.iilIIiiiiIIiIIiiii = var2.llIIililll;
               this.lIiIIiiiiiIiIIiiii = var3;
               this.iIlIIiiiiIllIIiiii = this.lllIIiiiiillIIiiii = this.lililiilil();
               this.IilIIiiiililIIiiii = this.IIiillIiil();
               this.lIliliIlil(h, var2, var2.iIIIililll, iilIIllIIiIIll.iililIIilIIiilIIil);
            } else {
               boolean var10000;
               label67: {
                  label66: {
                     if (var2.IlIIililll >= 0 && this.IliIIiiiilliIIiiii < 200 && !this.lIIIIiiiiiIIIIiiii) {
                        if (var3 > 0) {
                           if (this.iliIIiiiiIiiIIiiii < 50) {
                              break label66;
                           }
                        } else if (var3 < 0 && this.iliIIiiiiIiiIIiiii < 3) {
                           break label66;
                        }
                     }

                     var10000 = false;
                     break label67;
                  }

                  var10000 = true;
               }

               boolean var4 = var10000;
               if (var4) {
                  ++this.IliIIiiiilliIIiiii;
                  this.lIliliIlil(h, var2, var2.IlIIililll, iilIIllIIiIIll.lIiilIIiliIiilIIil);
               } else {
                  this.iiiiiliiiIIIIIiiii = var2.IlIIililll >= 0 && this.IliIIiiiilliIIiiii >= 200;
                  this.Iiiiiliiiliiiiliii = var2.IlIIililll >= 0 && this.iliIIiiiiIiiIIiiii > 0 && !this.iiiiiliiiIIIIIiiii;
                  this.liilliiill(var3);
               }

            }
         }
      }
   }

   private void IilIililIi() {
      this.iiIiiliiiIIliiliii = System.currentTimeMillis() + (long)this.lllliliiiillliliii.Iilllilliill();
   }

   private void iIIilIlIil() {
      this.iiIilIIlil((class_1703)null);
      if (++this.IIIlIiiiilIIlIiiii >= (~1361836196 + 11 ^ -1361836470)) {
         this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
      } else {
         this.lIllIiiiiiIllIiiii = false;
         this.lIIIiiIIIi(iilIIllIIiIIll.iIlilIIilIllilIIil);
         this.IilIililIi();
      }
   }

   private class_1703 lIiIiiIiIi() {
      return this.iilIiIIiIi() ? Iiiilllliiilll.field_1724.field_7512 : null;
   }

   private boolean Iiiilliiil() {
      if (!iiiilIIIIi(Iiiilllliiilll.field_1724.method_6047())) {
         return true;
      } else {
         class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

         for(int var2 = 0; var2 < 9; ++var2) {
            if (var1.method_5438(var2).method_7960()) {
               IIiIIIlilIiIIIli.IliIlllilIi(var2);
               return true;
            }
         }

         for(int var3 = 0; var3 < 9; ++var3) {
            if (!iiiilIIIIi(var1.method_5438(var3))) {
               IIiIIIlilIiIIIli.IliIlllilIi(var3);
               return true;
            }
         }

         return false;
      }
   }

   private void liilliiill(int stored) {
      if (this.liiIIiiiiiiiIIiiii <= 0 && this.IIiiiliiilIiiiliii) {
         if (stored > 0) {
            this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>() + stored + IliIlllilIi<invokedynamic>()), true);
         } else if (this.iiiiiliiiIIIIIiiii && stored < 0) {
            this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
         } else if (this.Iiiiiliiiliiiiliii && stored < 0) {
            this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
         } else {
            this.llIililIil(this.IiIlIiiiiliIlIiiii > 0 ? IliIlllilIi<invokedynamic>() + this.iiIlIiiiiIIllIiiii + IliIlllilIi<invokedynamic>() + this.IiIlIiiiiliIlIiiii + (this.IiIlIiiiiliIlIiiii == ((1730611969 ^ -19) * -47 + -43 ^ -265615232) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) : IliIlllilIi<invokedynamic>(), false);
         }
      } else {
         this.IIIillIIil();
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] ^ 27105) >>> 15 | (char)(var4[var5] ^ 27105) << 1))))) + 7295) << 1 | (char)((char)(~((char)(~((char)((char)(var4[var5] ^ 27105) >>> 15 | (char)(var4[var5] ^ 27105) << 1))))) + 7295) >>> 15) - 11323) + var5))) - var5))) ^ var5))) - 29530) + 19416) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private long ilIIiIiIIi() {
      return Math.max(6914129623069061825L ^ 6914129623069062941L, 4L * (long)this.lllliliiiillliliii.Iilllilliill());
   }

   private void lIliliIlil(class_1703 slot, iIlIiIllIllIiIll h, int l, iilIIllIIiIIll next) {
      this.IlIIIiiiillIIIiiii = slot;
      this.ilIIIiiiiIiIIIiiii = slot.field_7763;
      this.liIIIiiiiiiIIIiiii = l;
      this.IIlIIiiiilIlIIiiii = h.iIlIlllllill(l);
      this.IIIlilIIli(slot, l);
      this.lIIIiiIIIi(next);
      this.IilIililIi();
   }

   private void ilIllIiIll(class_1703 h) {
      this.IilIililIi();
      class_3965 var2 = this.lliililiil();
      if (h != null) {
         if (this.iIiilIliil(h).iIIIililll < 0 || var2 == null && !this.Illillllil()) {
            if (var2 == null || this.illiiliiiIiliiliii != null && !var2.method_17777().equals(this.illiiliiiIiliiliii)) {
               if (!this.illlIiiiiIillIiiii) {
                  this.illlIiiiiIillIiiii = true;
                  this.IiIliliIli(IliIlllilIi<invokedynamic>());
               }
            } else {
               this.iIIliIlIli();
            }
         } else {
            this.iiIilIIlil(h);
            if (this.illiiliiiIiliiliii == null && var2 != null) {
               this.illiiliiiIiliiliii = var2.method_17777();
            }

            this.lIilliIill(false);
         }

      } else if (Iiiilllliiilll.field_1755 == null) {
         if (var2 == null || this.illiiliiiIiliiliii != null && !var2.method_17777().equals(this.illiiliiiIiliiliii)) {
            if (this.illiiliiiIiliiliii != null && this.IIIlIiiiilIIlIiiii > 0 && this.IlIIillIIi() > 3000L) {
               this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
            } else {
               if (!this.lIllIiiiiiIllIiiii) {
                  this.lIllIiiiiiIllIiiii = true;
                  this.IiIliliIli(this.illiiliiiIiliiliii == null ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
               }

            }
         } else if (Iiiilllliiilll.field_1724.method_5715()) {
            if (!this.IlllIiiiillllIiiii) {
               this.IlllIiiiillllIiiii = true;
               this.IiIliliIli(IliIlllilIi<invokedynamic>());
            }

         } else if (!this.Iiiilliiil()) {
            this.llIililIil(IliIlllilIi<invokedynamic>(), true);
         } else {
            this.illiiliiiIiliiliii = var2.method_17777();
            Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var2);
            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
            this.lIIIiiIIIi(iilIIllIIiIIll.lllilIIilillilIIil);
         }
      }
   }

   private void iIlllIllll(class_1703 h) {
      boolean var2 = this.lllIIiiiiillIIiiii > this.iIlIIiiiiIllIIiiii || this.IIiillIiil() > this.IilIIiiiililIIiiii;
      if (h == null) {
         if (var2) {
            this.Ilillllill();
            this.iIIilIlIil();
         } else if (this.IlIIillIIi() > this.ilIIiIiIIi()) {
            this.ilillIiill();
         } else {
            this.IilIililIi();
         }

      } else if (h == this.liliiliiiiiliiliii || this.iilllIIill(h)) {
         iIlIiIllIllIiIll var3 = this.iIiilIliil(h);
         int var4 = this.illilIilil(h);
         boolean var5 = h == this.IlIIIiiiillIIIiiii && h.field_7763 == this.ilIIIiiiiIiIIIiiii;
         if (var2 || var5 && var3.llIIililll < this.iilIIiiiiIIiIIiiii || this.lIiIIiiiiiIiIIiiii >= 0 && var4 >= 0 && var4 < this.lIiIIiiiiiIiIIiiii) {
            this.Ilillllill();
            if (var5 && var3.llIIililll > 0) {
               this.lIIIIiiiiiIIIIiiii = true;
            }

            if (var3.llIIililll > 0 && var3.IlIIililll >= 0 && this.IliIIiiiilliIIiiii < 200) {
               ++this.IliIIiiiilliIIiiii;
               this.lIliliIlil(h, var3, var3.IlIIililll, iilIIllIIiIIll.lIiilIIiliIiilIIil);
            } else if (var3.llIIililll > 0) {
               this.IIIillIIil();
            } else {
               this.lIIIiiIIIi(iilIIllIIiIIll.IililIIillililIIil);
               this.IilIililIi();
            }
         } else if (this.IlIIillIIi() > this.ilIIiIiIIi()) {
            this.ilillIiill();
         } else {
            this.IilIililIi();
         }

      }
   }

   private void liIIiiiIIi() {
      switch (this.llIiiliiiilIiiliii.ordinal()) {
         case 6:
            if (!this.iilIiIIiIi()) {
               this.llIliilIli(IliIlllilIi<invokedynamic>());
               this.llIiiliiiilIiiliii = iilIIllIIiIIll.liiilIIiliiiilIIil;
            } else {
               this.llIiiliiiilIiiliii = iilIIllIIiIIll.IIIIiIIillIIIiIIil;
            }

            this.IilIililIi();
            break;
         case 7:
            if (!this.iilIiIIiIi()) {
               this.llIliilIli(IliIlllilIi<invokedynamic>());
            } else {
               this.llIiiliiiilIiiliii = iilIIllIIiIIll.IIIIiIIillIIIiIIil;
            }

            this.IilIililIi();
            break;
         case 8:
            this.IIlIilIlIi(ilIiIillIiIiIill.ilillilill, iilIIllIIiIIll.iIIIiIIilIlIIiIIil);
            break;
         case 9:
            this.IIlIilIlIi(ilIiIillIiIiIill.llillilill, iilIIllIIiIIll.llIIiIIililIIiIIil);
            break;
         case 10:
            this.IIlIilIlIi(ilIiIillIiIiIill.ilillilill, iilIIllIIiIIll.IiIIiIIilliIIiIIil);
            break;
         case 11:
            this.IIlIilIlIi(ilIiIillIiIiIill.Iiillilill, iilIIllIIiIIll.iiIIiIIilIIlIiIIil);
            break;
         case 12:
            this.IIlIilIlIi(ilIiIillIiIiIill.liillilill, iilIIllIIiIIll.lIlIiIIiliIlIiIIil);
            break;
         case 13:
            this.IIlIilIlIi(ilIiIillIiIiIill.Iiillilill, iilIIllIIiIIll.IIIIiIIillIIIiIIil);
            break;
         default:
            this.llIiiliiiilIiiliii = iilIIllIIiIIll.iliilIIilIiiilIIil;
            this.IilIililIi();
      }

   }

   private void lIIIiiIIIi(iilIIllIIiIIll s) {
      this.llIiiliiiilIiiliii = s;
      this.lIliiliiiiIliiliii = System.currentTimeMillis();
   }

   private int illilIilil(class_1703 h) {
      int var2 = this.IliIilliIi(h);

      for(int var3 = 0; var3 < var2; ++var3) {
         class_9290 var4 = (class_9290)h.method_7611(var3).method_7677().method_58694(class_9334.field_49632);
         if (var4 != null) {
            ArrayList var5 = new ArrayList(var4.comp_2400().size());

            for(class_2561 var7 : var4.comp_2400()) {
               var5.add(var7.getString());
            }

            int var8 = iIlIiIllIllIiIll.IilliliilIIi(var5);
            if (var8 >= 0) {
               return var8;
            }
         }
      }

      return -1;
   }

   private void iiIilIIlil(class_1703 h) {
      this.liliiliiiiiliiliii = h;
   }

   private void lllllillll(class_1703 h) {
      if (h == null) {
         this.Iillllilll();
      } else if (h == this.liliiliiiiiliiliii || this.iilllIIill(h)) {
         if (h == this.IlIIIiiiillIIIiiii && h.field_7763 == this.ilIIIiiiiIiIIIiiii && this.iIiilIliil(h).iIlIlllllill(this.liIIIiiiiiiIIIiiii) == this.IIlIIiiiilIlIIiiii) {
            if (this.IlIIillIIi() > this.ilIIiIiIIi()) {
               ++this.iliIIiiiiIiiIIiiii;
               this.lIIIiiIIIi(iilIIllIIiIIll.IililIIillililIIil);
            }
         } else {
            this.iliIIiiiiIiiIIiiii = 0;
            this.lIIIiiIIIi(iilIIllIIiIIll.IililIIillililIIil);
         }

         this.IilIililIi();
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)(~var4[var5]))) ^ var5))) + 10165) + '\ud9bf') + var5))) ^ 'ꇺ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iilIiIIiIi() {
      return Iiiilllliiilll.field_1755 instanceof class_465 && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_7512 != null && Iiiilllliiilll.field_1724.field_7512 != Iiiilllliiilll.field_1724.field_7498;
   }

   public void Illillliilli() {
      this.lllIiillIi();
      this.Illiiliiillliiliii = Iiiilllliiilll.field_1687;
   }

   private void IIIillIIil() {
      if (this.illiiliiiIiliiliii == null) {
         this.llIililIil(this.IiIilliIil(this.IiIlIiiiiliIlIiiii > 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()), true);
      } else {
         if (this.iilIiIIiIi()) {
            this.iIIliIlIli();
         }

         this.iIIilIlIil();
      }
   }

   private void iIIliIlIli() {
      this.iIiiiliiiIliiiliii = true;

      try {
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_7346();
         }

         Iiiilllliiilll.method_1507((class_437)null);
      } finally {
         this.iIiiiliiiIliiiliii = false;
      }

   }

   private void Ilillllill() {
      ++this.IiIlIiiiiliIlIiiii;
      ++this.liiIIiiiiiiiIIiiii;
      this.iiIlIiiiiIIllIiiii += this.iilIIiiiiIIiIIiiii;
      this.iIIlIiiiiIlIlIiiii = 0;
      this.iliIIiiiiIiiIIiiii = 0;
   }

   private boolean Illillllil() {
      return Iiiilllliiilll.field_1755 != null && iIlIiIllIllIiIll.iliIiiliiiii(Iiiilllliiilll.field_1755.method_25440().getString()).contains(IliIlllilIi<invokedynamic>());
   }

   private iIlIiIllIllIiIll iIiilIliil(class_1703 h) {
      int var2 = this.IliIilliIi(h);
      ArrayList var3 = new ArrayList(var2);

      for(int var4 = 0; var4 < var2; ++var4) {
         class_1735 var5 = h.method_7611(var4);
         class_1799 var6 = var5.method_7677();
         IilIIIlllilIIIll var7 = iIlIiIllIllIiIll.liiiIIllIl(var6.method_7960(), var6.method_31574(class_1802.field_8606), var6.method_7964().getString());
         var3.add(new IiIiIIIlliIiIIIl(var4, var5.field_7873, var5.field_7872, var7, var6.method_7947(), class_1799.method_57355(var6)));
      }

      return iIlIiIllIllIiIll.IliIlllilIi(var3);
   }

   private void llIililIil(String msg, boolean problem) {
      if (this.liliiliiiiiliiliii != null && this.lIiIiiIiIi() == this.liliiliiiiiliiliii) {
         this.iIIliIlIli();
      }

      if (problem || this.Iilliliiililliliii.Iilllilliill()) {
         this.iiIliIIlli(IliIlllilIi<invokedynamic>() + msg);
      }

      this.iiIilIIlil((class_1703)null);
      this.llIiiliiiilIiiliii = iilIIllIIiIIll.IliilIIillliilIIil;
      this.iiIiiliiiIIliiliii = 4451814162481142804L ^ 4771557874373633003L;
      this.IIillIiliIil(false);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '訑'))) + 32079) << 11 | (char)((char)(-((char)(var4[var5] - '訑'))) + 32079) >>> 5) + '\ue4c4') ^ var5) + var5))) ^ var5) + var5) ^ var5))) + 26333) - var5) - 'ퟟ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIlliiIll(class_1703 h) {
      this.IilIililIi();
      if (h != null) {
         if (this.iIiilIliil(h).iIIIililll >= 0) {
            this.iiIilIIlil(h);
            this.llIlIiiiiilIlIiiii = 0;
            this.lIilliIill(true);
         } else if (this.IlIIillIIi() > 3000L) {
            this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
         }

      } else if (this.IlIIillIIi() > 3000L) {
         if (++this.llIlIiiiiilIlIiiii >= 3) {
            this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
         } else {
            this.lIIIiiIIIi(iilIIllIIiIIll.iIlilIIilIllilIIil);
         }

      }
   }

   private class_3965 lliililiil() {
      if (Iiiilllliiilll.field_1687 == null) {
         return null;
      } else {
         class_239 var2 = Iiiilllliiilll.field_1765;
         if (var2 instanceof class_3965) {
            class_3965 var1 = (class_3965)var2;
            if (var1.method_17783() == class_240.field_1332 && Iiiilllliiilll.field_1687.method_8320(var1.method_17777()).method_27852(class_2246.field_10260)) {
               return var1;
            }
         }

         return null;
      }
   }

   public iiIIIliIIlIIli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.llIiiliiiilIiiliii = iilIIllIIiIIll.iIlilIIilIllilIIil;
      this.liIIIiiiiiiIIIiiii = -1;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIlliliiiIllliliii, this.lllliliiiillliliii, this.Iilliliiililliliii});
   }

   private void IlIllllIll() {
      if (this.lliiiliiiiliiiliii) {
         this.lliiiliiiiliiiliii = false;
         this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), false);
      } else {
         class_1703 var1 = this.lIiIiiIiIi();
         switch (this.llIiiliiiilIiiliii.ordinal()) {
            case 0:
               this.ilIllIiIll(var1);
               break;
            case 1:
               this.liIlliiIll(var1);
               break;
            case 2:
               this.IIllllIlll(var1);
               break;
            case 3:
               this.iIlllIllll(var1);
               break;
            case 4:
               this.lllllillll(var1);
            case 5:
               break;
            default:
               this.lIIIiiIIIi(iilIIllIIiIIll.iIlilIIilIllilIIil);
               this.IilIililIi();
         }

      }
   }

   private void Iillllilll() {
      if (this.IlIIillIIi() > this.ilIIiIiIIi()) {
         this.iIIilIlIil();
      } else {
         this.IilIililIi();
      }

   }

   private int IliIilliIi(class_1703 h) {
      long var4 = 168976967438702987L;
      var4 ^= ((long)h.field_7761.size() << 32 ^ var4) & -1L << 32;
      var4 ^= ((long)Math.max(0, (int)(var4 >>> 32) - (~(1257787218 + -107) ^ -1257787076)) ^ var4) & -1L >>> 32;
      return (int)var4 == 0 ? (int)(var4 >>> 32) : (int)var4;
   }

   private boolean iilllIIill(class_1703 h) {
      if (this.iIiilIliil(h).iIIIililll >= 0) {
         this.iiIilIIlil(h);
         return true;
      } else {
         if (this.IlIIillIIi() > this.ilIIiIiIIi()) {
            this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
         } else {
            this.IilIililIi();
         }

         return false;
      }
   }

   private void IiIliliIli(String msg) {
      this.iiIliIIlli(IliIlllilIi<invokedynamic>() + msg);
   }

   private int iliIiIiiIi(class_1703 preferLast, ilIiIillIiIiIill h, boolean cat) {
      int var4 = this.IliIilliIi(preferLast);
      int var5 = -1;

      for(int var6 = 0; var6 < var4; ++var6) {
         class_1799 var7 = preferLast.method_7611(var6).method_7677();
         if (!var7.method_7960() && this.liiIiiiiIi(var7, h)) {
            var5 = var6;
            if (!cat) {
               break;
            }
         }
      }

      return var5;
   }

   private void iiiIlIIIll() {
      if (this.iIlIiIllIi()) {
         this.llIililIil(this.IiIlIiiiiliIlIiiii > 0 ? this.IiIilliIil(IliIlllilIi<invokedynamic>()) : IliIlllilIi<invokedynamic>(), true);
      } else {
         this.iiIliIIlli(IliIlllilIi<invokedynamic>());
         this.IIillIiliIil(false);
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7538964357024582349L ^ Long.rotateLeft(7084040128088769438L, 3) ^ 4034110187245554438L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8751782690053205435L ^ Long.rotateLeft(-3387931234145435014L, 14) ^ -9109544310288713547L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -704673814615038493L ^ Long.rotateLeft(-2936343718717810439L, 16) ^ 4102544691013157363L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8697306235849010308L ^ Long.rotateLeft(-8705363465565239495L, 13) ^ -3510218400189788321L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1356482545364653399L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6580915746195393131L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5898924498690910197L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3790047585014683800L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 89640750819454614L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7352135248728175676L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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

   private void lIilliIill(boolean fresh) {
      this.IIiiiliiilIiiiliii = fresh;
      this.IliIIiiiilliIIiiii = 0;
      this.iliIIiiiiIiiIIiiii = 0;
      this.liiIIiiiiiiiIIiiii = 0;
      this.lIIIIiiiiiIIIIiiii = false;
      this.iiiiiliiiIIIIIiiii = false;
      this.Iiiiiliiiliiiiliii = false;
      this.lIIIiiIIIi(iilIIllIIiIIll.IililIIillililIIil);
   }

   private long IlIIillIIi() {
      return System.currentTimeMillis() - this.lIliiliiiiIliiliii;
   }

   private void ilillIiill() {
      if (++this.iIIlIiiiiIlIlIiiii >= (~(~(-61643914 >>> 21 | -61643914 << 11)) * -67 ^ 1740562393)) {
         this.llIililIil(this.IiIilliIil(IliIlllilIi<invokedynamic>()), true);
      } else {
         this.IIIillIIil();
      }

   }

   private void lllIiillIi() {
      this.IiIiiliiiliIiiliii = this.iIlliliiiIllliliii.Iilllilliill();
      this.lIIIiiIIIi(this.iIlIiIllIi() ? iilIIllIIiIIll.iIlilIIilIllilIIil : iilIIllIIiIIll.iliilIIilIiiilIIil);
      this.iiIiiliiiIIliiliii = 0L;
      this.illiiliiiIiliiliii = null;
      this.iiIilIIlil((class_1703)null);
      this.IIiiiliiilIiiiliii = false;
      this.iIiiiliiiIliiiliii = false;
      this.lliiiliiiiliiiliii = false;
      this.Iiiiiliiiliiiiliii = false;
      this.iiiiiliiiIIIIIiiii = false;
      this.lIIIIiiiiiIIIIiiii = false;
      this.IlIIIiiiillIIIiiii = null;
      this.ilIIIiiiiIiIIIiiii = 0;
      this.liIIIiiiiiiIIIiiii = -1;
      this.IIlIIiiiilIlIIiiii = 0L;
      this.iIlIIiiiiIllIIiiii = 0;
      this.lllIIiiiiillIIiiii = 0;
      this.IilIIiiiililIIiiii = 0;
      this.iilIIiiiiIIiIIiiii = 0;
      this.lIiIIiiiiiIiIIiiii = -1;
      this.IliIIiiiilliIIiiii = 0;
      this.iliIIiiiiIiiIIiiii = 0;
      this.liiIIiiiiiiiIIiiii = 0;
      this.IIIlIiiiilIIlIiiii = 0;
      this.iIIlIiiiiIlIlIiiii = 0;
      this.llIlIiiiiilIlIiiii = 0;
      this.IiIlIiiiiliIlIiiii = 0;
      this.iiIlIiiiiIIllIiiii = 0;
      this.lIllIiiiiiIllIiiii = false;
      this.IlllIiiiillllIiiii = false;
      this.illlIiiiiIillIiiii = false;
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         if (!this.iIlliliiiIllliliii.Iilllilliill().equalsIgnoreCase(this.IiIiiliiiliIiiliii)) {
            this.lllIiillIi();
         }

         if (Iiiilllliiilll.field_1687 != this.Illiiliiillliiliii) {
            this.iiiIlIIIll();
         } else {
            if (this.iIlIiIllIi()) {
               this.lIIlliIIll();
            }

            if (Iiiilllliiilll.field_1755 == null || Iiiilllliiilll.field_1755 instanceof class_465) {
               if (System.currentTimeMillis() >= this.iiIiiliiiIIliiliii) {
                  if (this.iIlIiIllIi()) {
                     this.IlIllllIll();
                  } else {
                     this.liIIiiiIIi();
                  }

               }
            }
         }
      }
   }

   private void IIlIilIlIi(ilIiIillIiIiIill cat, iilIIllIIiIIll next) {
      class_1703 var3 = this.lIiIiiIiIi();
      if (var3 == null) {
         this.llIliilIli(IliIlllilIi<invokedynamic>());
         this.IilIililIi();
      } else {
         int var4 = this.iliIiIiiIi(var3, cat, cat == ilIiIillIiIiIill.Iiillilill || cat == ilIiIillIiIiIill.liillilill);
         if (var4 < 0) {
            this.IilIililIi();
         } else {
            this.IIIlilIIli(var3, var4);
            this.llIiiliiiilIiiliii = next;
            this.IilIililIi();
         }
      }
   }

   private void IIIlilIIli(class_1703 slot, int h) {
      if (Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1761.method_2906(slot.field_7763, h, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
      }
   }

   private void lIIlliIIll() {
      if (this.llIiiliiiilIiiliii == iilIIllIIiIIll.iililIIilIIiilIIil) {
         this.lllIIiiiiillIIiiii = Math.max(this.lllIIiiiiillIIiiii, this.lililiilil());
      }

   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi e) {
      if (!this.iIiiiliiiIliiiliii && this.iIlIiIllIi() && this.llIiiliiiilIiiliii != iilIIllIIiIIll.IliilIIillliilIIil) {
         class_2596 var3 = e.lIiilIIIIi;
         if (var3 instanceof class_2815) {
            class_2815 var2 = (class_2815)var3;
            if (var2.method_36168() != 0) {
               if (this.liliiliiiiiliiliii != null || this.illiiliiiIiliiliii != null || this.llIiiliiiilIiiliii == iilIIllIIiIIll.lllilIIilillilIIil) {
                  this.lliiiliiiiliiiliii = true;
               }

               return;
            }
         }

      }
   }

   private static boolean iiiilIIIIi(class_1799 st) {
      if (st.method_7960()) {
         return false;
      } else {
         class_1792 var1 = st.method_7909();
         return var1 instanceof class_1747 || var1 instanceof class_1826 || var1 instanceof class_1786 || var1 instanceof class_1778 || var1 instanceof class_1755 || var1 instanceof class_1742 || var1 instanceof class_1749 || var1 instanceof class_1808 || var1 instanceof class_1774 || var1 instanceof class_1790;
      }
   }
}
