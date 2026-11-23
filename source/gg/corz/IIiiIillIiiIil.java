package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2269;
import net.minecraft.class_2272;
import net.minecraft.class_2312;
import net.minecraft.class_2323;
import net.minecraft.class_2328;
import net.minecraft.class_2338;
import net.minecraft.class_2349;
import net.minecraft.class_2350;
import net.minecraft.class_2362;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_2401;
import net.minecraft.class_2428;
import net.minecraft.class_243;
import net.minecraft.class_2457;
import net.minecraft.class_2533;
import net.minecraft.class_2561;
import net.minecraft.class_265;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3532;
import net.minecraft.class_3675;
import net.minecraft.class_3959;
import net.minecraft.class_3962;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_5545;
import net.minecraft.class_9334;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.lwjgl.glfw.GLFW;

public class IIiiIillIiiIil extends ilIllIiIll implements liliIiliiliIil {
   private class_3965 lIililiIiiIililiIi;
   private iiIiIIliIIliIIli iiiiiliIiIIIIIiiIi;
   private static final double lIlIiliIiiIlIiliIi = 0.1;
   private class_3965 ilililiIiIiililiIi;
   private boolean lIliiliIiiIliiliIi;
   private int lliiiliIiiliiiliIi;
   private boolean liiIIiiIiiiiIIiiIi;
   private static final double IiIIiliIiliIIiliIi = (double)5.0F;
   private final iiIiiilIIliiil IiiIiliIiliiIiliIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private boolean IiiiiliIiliiiiliIi;
   private boolean iliIIiiIiIiiIIiiIi;
   private static final double IllIiliIilllIiliIi = (double)1.0F;
   private class_2338 IlliiliIillliiliIi;
   private boolean IilIIiiIililIIiiIi;
   private final iiIiiilIIliiil liIliliIiiiIliliIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>().concat(IliIlllilIi<invokedynamic>()).concat(IliIlllilIi<invokedynamic>()), true);
   private class_3965 liililiIiiiililiIi;
   private int liIIIiiIiiiIIIiiIi;
   private int IIIiiliIilIIiiliIi = -1;
   private final iiIiiilIIliiil IlIliliIillIliliIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int illIiliIiIilIiliIi = 12;
   private static final double iIIlIiiIiIlIlIiiIi = 0.15;
   private final illlIlIlIillIlIl iiiIiliIiIIIliliIi = new illlIlIlIillIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 86);
   private IilliIillilliIil illiiliIiIiliiliIi;
   private final lliliIIiililiIIi lilIiliIiiilIiliIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iiIiiilIIliiil iIiIiliIiIliIiliIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private boolean lllIIiiIiillIIiiIi;
   private int IiIiiliIiliIiiliIi;
   private boolean iilIIiiIiIIiIIiiIi;
   private class_2338 IlIIIiiIillIIIiiIi;
   private final iiIiiilIIliiil ilIliliIiIiIliliIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private class_2338 lllliliIiillliliIi;
   private class_2338 lIIIIiiIiiIIIIiiIi;
   private boolean IIIlIiiIilIIlIiiIi;
   private class_2338 IilliliIililliliIi;
   private final iilliIlIIiliIl lliIiliIiiliIiliIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 10, 2, 40);
   private final IiilIllliilIll iIlliliIiIllliliIi = new IiilIllliilIll();
   private boolean liliiliIiiiliiliIi;
   private boolean iiIiiliIiIIliiliIi;
   private static final Random IIlliliIilIlliliIi = new Random();
   private final iilliIlIIiliIl lIIliliIiiIIliliIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 9, 1, 9);
   private final iiIiiilIIliiil IIiIiliIilIiIiliIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int iIIiiliIiIlIiiliIi = -1;
   private boolean IliIIiiIilliIIiiIi;
   private boolean lIiIIiiIiiIiIIiiIi;
   private int IIiiiliIilIiiiliIi;
   private class_3965 IlililiIillililiIi;
   private class_3965 ilIIIiiIiIiIIIiiIi;
   private int iIlIIiiIiIllIIiiIi;
   private static final double iiIIiliIiIIlIiliIi = 0.45;
   private boolean iilliliIiIIililiIi;
   private int iIiiiliIiIliiiliIi;
   private int llIiiliIiilIiiliIi = -1;
   private int IIlIIiiIilIlIIiiIi;

   private class_238 IlIIillIIi(class_2338 block) {
      class_265 var2 = Iiiilllliiilll.field_1687.method_8320(block).method_26218(Iiiilllliiilll.field_1687, block);
      return var2.method_1110() ? null : var2.method_1107().method_996(block);
   }

   private boolean iiiIIlIIIlIl(class_2338 pos) {
      return lliiIliliiIl.IiIiliIiiiIi(pos, Double.longBitsToDouble(938968425667291006L ^ 5558535743442577278L));
   }

   private class_3965 IIIlilIIli() {
      class_243 var1 = Iiiilllliiilll.field_1724.method_33571();
      double var2 = Math.min(Double.longBitsToDouble(5330432585970363023L ^ 714805917869025935L), Iiiilllliiilll.field_1724.method_55754());
      class_243 var4 = var1.method_1019(this.liiIiiiiIi().method_1021(var2));
      return Iiiilllliiilll.field_1687.method_17742(new class_3959(var1, var4, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
   }

   private boolean lIlIIliIlIIl() {
      class_239 var1 = Iiiilllliiilll.field_1765;
      if (var1 != null && var1.method_17783() == class_240.field_1332) {
         class_3965 var2 = (class_3965)var1;
         class_2338 var3 = var2.method_17777();
         class_2338 var4 = this.Iiililiili(var3) ? var3 : var3.method_10093(var2.method_17780());
         class_2338 var5 = Iiiilllliiilll.field_1724.method_24515();
         if (!var4.equals(var5) && !var4.equals(var5.method_10084()) && !var4.equals(var5.method_10074())) {
            if (!this.lliliilili(class_243.method_24953(var4))) {
               return false;
            } else {
               this.lIIIIiiIiiIIIIiiIi = var4;
               this.IlIIIiiIillIIIiiIi = this.IllIIllllIIl(var4);
               this.ilIIIiiIiIiIIIiiIi = this.iIiilIliil(var2) ? var2 : this.illilIilil(var4, (class_2338)null);
               return true;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) >>> 14 | (char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) << 2) - var5) + 13018) + 19703) ^ var5) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) >>> 14 | (char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) << 2) - var5) + 13018) + 19703) ^ var5) - var5) << 5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) >>> 14 | (char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) << 2) - var5) + 13018) + 19703) ^ var5) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) >>> 14 | (char)(~((char)((char)(~((char)(~var4[var5]))) << 8 | (char)(~((char)(~var4[var5]))) >>> 8))) << 2) - var5) + 13018) + 19703) ^ var5) - var5) << 5) >>> 5) - 12975) - var5) - var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private class_3965 lIlliiIlli(class_3965 planned) {
      if (planned != null && this.iiIliIIlli()) {
         class_3965 var2 = this.iIIliIlIli(planned.method_17777());
         if (var2 == null) {
            return null;
         } else {
            return !this.Iiililiili(planned.method_17777()) && var2.method_17780() != planned.method_17780() ? null : var2;
         }
      } else {
         return null;
      }
   }

   private boolean iilIiIIiIi(class_2680 pos, class_2338 st) {
      class_2248 var3 = pos.method_26204();
      return pos.method_31709() || var3 instanceof class_4969 || var3 instanceof class_2323 || var3 instanceof class_2533 || var3 instanceof class_2349 || var3 instanceof class_2269 || var3 instanceof class_2401 || var3 instanceof class_2428 || var3 instanceof class_2312 || var3 instanceof class_2272 || var3 instanceof class_5545 || var3 instanceof class_2328 || var3 instanceof class_2457 || var3 instanceof class_3962 || var3 instanceof class_2362 || pos.method_26196(Iiiilllliiilll.field_1687, st) != null;
   }

   private void llIililIil() {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(iIIliIiIlIliIi.class);
      if (var1 instanceof iIIliIiIlIliIi var2) {
         if (var2.IliIlllilIi()) {
            var2.iiIilIIlil();
         }
      }

   }

   private boolean illliIilli(class_2338 detonate, boolean anchor) {
      long var5 = -2970627446614618256L;
      var5 ^= ((long)(Iiiilllliiilll.field_1724.method_6047().method_7960() && Iiiilllliiilll.field_1724.method_6079().method_7960() ? 0 : 1) << 32 ^ var5) & -1L << 32;
      if (Iiiilllliiilll.field_1724.method_21823() && (int)(var5 >>> 32) != 0) {
         return true;
      } else if (!anchor) {
         return false;
      } else {
         class_2680 var4 = Iiiilllliiilll.field_1687.method_8320(detonate);
         return (Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8801) || Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801)) && var4.method_27852(class_2246.field_23152) && (Integer)var4.method_11654(class_4969.field_23153) < (~(367183797 - -21) ^ -367183823);
      }
   }

   private class_1269 ilillIiill(class_3965 hit, String state) {
      this.liilliiill(hit.method_17784());
      this.IiiiiliIiliiiiliIi = true;

      class_1269 var3;
      try {
         var3 = Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, hit);
      } finally {
         this.IiiiiliIiliiiiliIi = false;
      }

      this.lliiiliIiiliiiliIi = Iiiilllliiilll.field_1724.field_6012;
      return var3;
   }

   private boolean iiiliIIIii(class_2338 pos) {
      return lliiIliliiIl.iliIiiliiiii(pos, class_2246.field_10171.method_9564());
   }

   private int lIIiiiIIii() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for(int var2 = 0; var2 < 9; ++var2) {
         if (var1.method_5438(var2).method_31574(class_1802.field_8801)) {
            return var2;
         }
      }

      return -1;
   }

   private void Iliiilliii() {
      this.iIlliliIiIllliliIi.iliIiiliiiii();
      this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      this.IlliiliIillliiliIi = null;
      this.lIiiiiIiii();
      this.IlIlIlllIlIl();
      this.liiIIiiIiiiiIIiiIi = true;
      this.IIIlIiiIilIIlIiiIi = false;
   }

   private class_243 llIliilIli(class_3965 hit) {
      class_2338 var2 = hit.method_17777();
      class_265 var3 = Iiiilllliiilll.field_1687.method_8320(var2).method_26218(Iiiilllliiilll.field_1687, var2);
      class_238 var4 = var3.method_1110() ? new class_238(var2) : var3.method_1107().method_996(var2);
      class_243 var5 = hit.method_17784();
      class_2350.class_2351 var6 = hit.method_17780().method_10166();
      double var7 = var6 == class_2351.field_11048 ? var5.field_1352 : IiIliliIli(var5.field_1352, var4.field_1323, var4.field_1320);
      double var9 = var6 == class_2351.field_11052 ? var5.field_1351 : IiIliliIli(var5.field_1351, var4.field_1322, var4.field_1325);
      double var11 = var6 == class_2351.field_11051 ? var5.field_1350 : IiIliliIli(var5.field_1350, var4.field_1321, var4.field_1324);
      return new class_243(var7, var9, var11);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 2867) << 2 | (char)((char)(var4[var5] ^ var5) + 2867) >>> 14) - 15900))) << 3 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 2867) << 2 | (char)((char)(var4[var5] ^ var5) + 2867) >>> 14) - 15900))) >>> 13) ^ var5) - '퍩') - 7256) ^ var5))) + var5) - var5) + 26548) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 2867) << 2 | (char)((char)(var4[var5] ^ var5) + 2867) >>> 14) - 15900))) << 3 | (char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 2867) << 2 | (char)((char)(var4[var5] ^ var5) + 2867) >>> 14) - 15900))) >>> 13) ^ var5) - '퍩') - 7256) ^ var5))) + var5) - var5) + 26548) << 8) + var5) - 21485) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private class_3965 IiIIIlliIIIl(class_3965 ray, class_3965 hit) {
      if (hit != null) {
         this.iIlIIiiIiIllIIiiIi = 0;
         return hit;
      } else {
         this.ilIIIiiIiIiIIIiiIi = ray;
         this.liilliiill(this.llIliilIli(ray));
         ++this.iIlIIiiIiIllIIiiIi;
         return null;
      }
   }

   public boolean iIiIIlIliIIl() {
      return this.IiiIiliIiliiIiliIi.Iilllilliill() && this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi;
   }

   public void Iilililiiili() {
      this.Iliiilliii();
   }

   private ilIiliIlIiIiliIl Iillllilll() {
      ilIiliIlIiIiliIl var1 = new ilIiliIlIiIiliIl();
      var1.ilIiiiiIll = false;
      return var1;
   }

   private void iilllIIill(liIIlIiliiIIlIil action) {
      switch (null.lIIliliiIIlili[action.ordinal()]) {
         case 1:
            this.Ilillllill(this.IIIiiliIilIIiiliIi, IliIlllilIi<invokedynamic>());
            if (this.lIililiIiiIililiIi != null) {
               this.liilliiill(this.lIililiIiiIililiIi.method_17784());
            }
            break;
         case 2:
            if (this.ilililiIiIiililiIi != null) {
               this.ilillIiill(this.ilililiIiIiililiIi, IliIlllilIi<invokedynamic>());
               this.iiIiiliIiIIliiliIi = iliilliIiiilli.lIiiIiIlilli(this.IilliliIililliliIi);
            }
            break;
         case 3:
            this.Ilillllill(this.iIIiiliIiIlIiiliIi, IliIlllilIi<invokedynamic>());
            if (this.lllliliIiillliliIi != null) {
               if (!this.IIiillIiil(this.IlililiIillililiIi)) {
                  this.IlililiIillililiIi = this.lililiilil(this.lllliliIiillliliIi);
               }

               if (this.IlililiIillililiIi != null) {
                  this.liilliiill(this.IlililiIillililiIi.method_17784());
               }
            }
            break;
         case 4:
            this.iIIilIlIil();
            break;
         case 5:
            this.Ilillllill(this.IlIiillIii(), IliIlllilIi<invokedynamic>());
         case 6:
      }

   }

   public boolean IlIllllIll() {
      if (Iiiilllliiilll.field_1724 == null) {
         return false;
      } else if (this.iiiiiliIiIIIIIiiIi == iiIiIIliIIliIIli.IIIlIiIlIi && Iiiilllliiilll.field_1724.field_6012 != this.lliiiliIiiliiiliIi) {
         IilliIillilliIil var1 = this.iIlliliIiIllliliIi.IliIlllilIi();
         return var1 != IilliIillilliIil.lIllIilIil && var1 != IilliIillilliIil.IillIilIil && var1 != IilliIillilliIil.lillIilIil;
      } else {
         return true;
      }
   }

   private ilIiliIlIiIiliIl lllllillll(boolean rmb) {
      ilIiliIlIiIiliIl var2 = new ilIiliIlIiIiliIl();
      var2.ilIiiiiIll = rmb;
      var2.liliiiiIll = this.IiIiiliIiliIiiliIi > 0 ? this.IiIiiliIiliIiiliIi : this.lliIiliIiiliIiliIi.Iilllilliill();
      var2.IiIiiiiIll = this.iIiliIlili();
      var2.liIiiiiIll = this.lllliliIiillliliIi != null && this.IilliliIililliliIi == null && this.iilliliIiIIililiIi;
      this.IIIiiliIilIIiiliIi = this.lIIiiiIIii();
      var2.lIliiiiIll = this.IIIiiliIilIIiiliIi != -1;
      this.iIIiiliIiIlIiiliIi = this.liIiiiiIii();
      var2.llliiiiIll = this.iIIiiliIiIlIiiliIi != -1;
      this.ilililiIiIiililiIi = null;
      if (this.IilliliIililliliIi != null) {
         var2.iiIiiiiIll = this.Iiililiili(this.IilliliIililliliIi) && this.iiiliIIIii(this.IilliliIililliliIi) && !IIililIili(this.IilliliIililliliIi);
         if (!this.iIiilIliil(this.lIililiIiiIililiIi)) {
            this.lIililiIiiIililiIi = this.illilIilil(this.IilliliIililliliIi, this.lllliliIiillliliIi);
         }

         var2.IIliiiiIll = this.lIililiIiiIililiIi != null;
         boolean var3 = Iiiilllliiilll.field_1687.method_8320(this.IilliliIililliliIi).method_27852(class_2246.field_10171);
         boolean var4 = iliilliIiiilli.lIiiIiIlilli(this.IilliliIililliliIi);
         var2.iIliiiiIll = var3 && !var4;
         var2.IlliiiiIll = this.iiIiiliIiIIliiliIi && !var4 && !var3;
         this.ilililiIiIiililiIi = this.lIlliiIlli(this.lIililiIiiIililiIi);
         var2.illiiiiIll = this.ilililiIiIiililiIi != null;
      }

      this.liililiIiiiililiIi = this.lllliliIiillliliIi == null ? null : this.Illlilllli(this.lllliliIiillliliIi, true);
      var2.IiliiiiIll = this.liililiIiiiililiIi != null;
      this.lIliiliIiiIliiliIi = this.iIlliliIiIllliliIi.IliIlllilIi() == IilliIillilliIil.llllIilIil;
      return var2;
   }

   private boolean llliiillii() {
      return GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 1) == (-913928659 * 50529027 - 17 ^ 566571383);
   }

   private class_3965 Iiiilliiil(class_2338 avoid, class_2338 target) {
      class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var4 = this.liiIiiiiIi();
      class_3965 var5 = null;
      double var6 = (double)-2.0F;

      for(class_2350 var11 : class_2350.values()) {
         class_2338 var12 = avoid.method_10093(var11);
         if (!var12.equals(target) && this.IilIililIi(var12)) {
            class_2350 var13 = var11.method_10153();
            class_243 var14 = this.iiiilIIIIi(var12, var13, var3);
            if (var14 != null) {
               class_3965 var15 = new class_3965(var14, var13, var12, false);
               if (this.liIIiiiIIi(var15) && this.IIlIilIlIi(var15)) {
                  double var16 = var14.method_1020(var3).method_1029().method_1026(var4);
                  if (var16 > var6) {
                     var6 = var16;
                     var5 = var15;
                  }
               }
            }
         }
      }

      return var5;
   }

   private boolean iIiliIlili() {
      if (this.lllliliIiillliliIi == null) {
         return false;
      } else {
         class_2680 var1 = Iiiilllliiilll.field_1687.method_8320(this.lllliliIiillliliIi);
         if (!var1.method_27852(class_2246.field_23152)) {
            return false;
         } else {
            return (Integer)var1.method_11654(class_4969.field_23153) == 0 ? false : this.lliliilili(class_243.method_24953(this.lllliliIiillliliIi));
         }
      }
   }

   private lIIliiiliIIliiil iiIilIIlil(class_2338 supportOk, Predicate<class_2338> anchor) {
      return lliiIliliiIl.IlIlllIlilIl(supportOk, Iiiilllliiilll.field_1724.method_5829(), anchor, class_2246.field_10171.method_9564());
   }

   private void Ilillllill(int slot, String why) {
      if (slot >= 0 && slot <= (-(--1830289091 + -113 + 93) ^ -1830289063) && Iiiilllliiilll.field_1724 != null) {
         class_1661 var3 = Iiiilllliiilll.field_1724.method_31548();
         if (var3.method_67532() != slot) {
            IIiIIIlilIiIIIli.IliIlllilIi(slot);
         }
      }
   }

   private class_3965 iIIliIlIli(class_2338 block) {
      if (block != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         class_3965 var2 = this.IIIlilIIli();
         if (var2 != null && var2.method_17783() == class_240.field_1332 && var2.method_17777().equals(block)) {
            return this.iliIiIiiIi(var2) && this.llIliilIli(var2).method_1025(var2.method_17784()) < Double.longBitsToDouble(892546025923035263L ^ 3614011635815205957L) ? var2 : null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -9035839032852010797L ^ Long.rotateLeft(-1738125401834416809L, 16) ^ 4764400038269121149L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2331696517655647892L ^ Long.rotateLeft(-2978009189060699523L, 23) ^ 808257842128260252L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4853981888537710168L ^ Long.rotateLeft(-7085472224596691279L, 8) ^ -7873053619940238786L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4414819762087225694L ^ Long.rotateLeft(5175153319138066984L, 21) ^ -6763881800561278278L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -179550956997745870L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2583391469586353292L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7128580663480148053L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4391354701031389379L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -269264677979971346L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6323427204498816678L;
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

   private boolean lliliilili(class_243 point) {
      return Iiiilllliiilll.field_1724.method_33571().method_1025(point) <= Double.longBitsToDouble(7585659538238225171L ^ 2989454643529923347L);
   }

   private boolean iIlIiIllIi(class_3965 hit) {
      if (hit != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
         class_243 var3 = hit.method_17784().method_1020(var2);
         double var4 = var3.method_1033();
         if (var4 < Double.longBitsToDouble(-8870717039996234880L ^ -4900242696077487955L)) {
            return false;
         } else {
            class_243 var6 = hit.method_17784().method_1019(var3.method_1021(Double.longBitsToDouble(-7011961911172324950L ^ -6838407812618864592L) / var4));
            class_3965 var7 = Iiiilllliiilll.field_1687.method_17742(new class_3959(var2, var6, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
            return var7 != null && var7.method_17783() == class_240.field_1332 && var7.method_17777().equals(hit.method_17777()) && var7.method_17780() == hit.method_17780();
         }
      } else {
         return false;
      }
   }

   private boolean IIlIilIlIi(class_3965 hit) {
      return this.iliIiIiiIi(hit) && this.iIlIiIllIi(hit);
   }

   private int liIiiiiIii() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      if (this.llIiiliIiilIiiliIi >= 0 && this.llIiiliIiilIiiliIi <= 8 && IIliilIlii(var1.method_5438(this.llIiiliIiilIiiliIi))) {
         return this.llIiiliIiilIiiliIi;
      } else {
         for(int var2 = 0; var2 < 9; ++var2) {
            if (IIliilIlii(var1.method_5438(var2))) {
               return var2;
            }
         }

         return -1;
      }
   }

   private class_243 iiiilIIIIi(class_2338 block, class_2350 side, class_243 eye) {
      class_238 var4 = this.IlIIillIIi(block);
      if (var4 == null) {
         return null;
      } else {
         double var5 = (var4.field_1323 + var4.field_1320) / (double)2.0F;
         double var7 = (var4.field_1322 + var4.field_1325) / (double)2.0F;
         double var9 = (var4.field_1321 + var4.field_1324) / (double)2.0F;
         class_243 var10000;
         switch (null.IlIlilillIlili[side.ordinal()]) {
            case 1 -> var10000 = new class_243(var5, var4.field_1322, var9);
            case 2 -> var10000 = new class_243(var5, var4.field_1325, var9);
            case 3 -> var10000 = new class_243(var5, var7, var4.field_1321);
            case 4 -> var10000 = new class_243(var5, var7, var4.field_1324);
            case 5 -> var10000 = new class_243(var4.field_1323, var7, var9);
            case 6 -> var10000 = new class_243(var4.field_1320, var7, var9);
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         class_243 var11 = var10000;
         double var12 = lliiIliliiIl.liiiIIllIl();
         if (eye.method_1025(var11) <= var12 * var12) {
            return var11;
         } else {
            class_2350.class_2351 var14 = side.method_10166();
            class_243 var15 = new class_243(var14 == class_2351.field_11048 ? var11.field_1352 : lIIIiiIIIi(eye.field_1352, var4.field_1323, var4.field_1320, var5), var14 == class_2351.field_11052 ? var11.field_1351 : lIIIiiIIIi(eye.field_1351, var4.field_1322, var4.field_1325, var7), var14 == class_2351.field_11051 ? var11.field_1350 : lIIIiiIIIi(eye.field_1350, var4.field_1321, var4.field_1324, var9));
            return eye.method_1025(var15) <= var12 * var12 ? var15 : null;
         }
      }
   }

   private void iiIIIlIIlIIl(boolean use) {
      if (this.iIlIIiiIiIllIIiiIi > ((442553591 * -47 * 115 << 15 | 442553591 * -47 * 115 >>> 17) ^ -830306101)) {
         this.iIlllIllll(this.lilliiilli(use));
         this.IlIlIlllIlIl();
      }
   }

   private int IlIiillIii() {
      long var2 = -5503958169503032462L;
      if (this.iIiIiliIiIliIiliIi.Iilllilliill() && this.liliiliIiiiliiliIi) {
         var2 ^= ((long)this.ilIiiIiIii() << 32 ^ var2) & -1L << 32;
         if ((int)(var2 >>> 32) != (2072495461 + -67 + -51 ^ -2072495344)) {
            return (int)(var2 >>> 32);
         }
      }

      return this.llIiiliIiilIiiliIi;
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_18854()) {
         if (event.lIiilIIIIi instanceof class_2885 && !this.IiiiiliIiliiiiliIi && !event.lIiiIiIlilli()) {
            this.iIiiiliIiIliiiliIi = Iiiilllliiilll.field_1724.field_6012;
         }

         if (event.lIiilIIIIi instanceof class_2885 && !event.lIiiIiIlilli()) {
            iiilIiIIIiIi.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) - '젤'))) - '궖') + var5) + var5) + var5) ^ var5))) ^ var5) + 14392))))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private class_3965 lililiilil(class_2338 block) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var3 = Iiiilllliiilll.field_1724.method_5828(1.0F);
      class_3965 var4 = this.lIiIiiIiIi(lliiIliliiIl.IIlllIlliIll(block, var2, var3, lliiIliliiIl.liiiIIllIl(), IIlliliIilIlliliIi));
      if (!this.IIiillIiil(var4)) {
         var4 = this.lIiIiiIiIi(lliiIliliiIl.IIlllIlliIll(block, var2, var3, Double.longBitsToDouble(-8017056660777295821L ^ -3411000141884121037L), IIlliliIilIlliliIi));
      }

      if (!this.IIiillIiil(var4)) {
         var4 = this.lliililiil(block);
      }

      if (var4 == null) {
         class_239 var6 = Iiiilllliiilll.field_1765;
         if (var6 instanceof class_3965) {
            class_3965 var5 = (class_3965)var6;
            if (var5.method_17783() == class_240.field_1332 && var5.method_17777().equals(block) && this.IIiillIiil(var5)) {
               var4 = var5;
            }
         }
      }

      return var4;
   }

   private void iIIIIlIlIIIl() {
      switch (this.iiiiiliIiIIIIIiiIi.ordinal()) {
         case 1:
            if (!this.Iiililiili(this.lIIIIiiIiiIIIIiiIi)) {
               if (Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi).method_27852(class_2246.field_23152)) {
                  this.iiiiiliIiIIIIIiiIi = this.IlIliliIillIliliIi.Iilllilliill() ? iiIiIIliIIliIIli.iIIlIiIlIi : iiIiIIliIIliIIli.llIlIiIlIi;
                  this.IIlIIiiIilIlIIiiIi = 0;
                  this.ilIIIiiIiIiIIIiiIi = null;
               } else {
                  this.IlIlIlllIlIl();
               }

               return;
            }

            class_3965 var9 = this.iIiilIliil(this.ilIIIiiIiIiIIIiiIi) ? this.ilIIIiiIiIiIIIiiIi : this.illilIilil(this.lIIIIiiIiiIIIIiiIi, (class_2338)null);
            if (var9 == null) {
               this.IlIlIlllIlIl();
               return;
            }

            if (IIililIili(this.lIIIIiiIiiIIIIiiIi)) {
               this.iIlllIllll(IliIlllilIi<invokedynamic>());
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(this.ilIiiIiIii(), IliIlllilIi<invokedynamic>());
            class_3965 var14 = this.IiIIIlliIIIl(var9, this.lIlliiIlli(var9));
            if (var14 == null) {
               this.iiIIIlIIlIIl(false);
               return;
            }

            this.llIIIlilIIIl(var14, IliIlllilIi<invokedynamic>());
            this.lllIIiiIiillIIiiIi = iliilliIiiilli.lIiiIiIlilli(this.lIIIIiiIiiIIIIiiIi);
            this.iiiiiliIiIIIIIiiIi = this.IlIliliIillIliliIi.Iilllilliill() ? iiIiIIliIIliIIli.iIIlIiIlIi : iiIiIIliIIliIIli.llIlIiIlIi;
            this.IIlIIiiIilIlIIiiIi = 0;
            this.ilIIIiiIiIiIIIiiIi = null;
            break;
         case 2:
            int var8 = this.lIIiiiIIii();
            this.ilIIIiiIiIiIIIiiIi = this.IlIIIiiIillIIIiiIi == null ? null : this.illilIilil(this.IlIIIiiIillIIIiiIi, this.lIIIIiiIiiIIIIiiIi);
            if (this.ilIIIiiIiIiIIIiiIi == null || var8 == -1 || !this.illIIlIilIIl()) {
               this.ilIIIiiIiIiIIIiiIi = null;
               this.iiiiiliIiIIIIIiiIi = this.lilIIliilIIl();
               this.IIlIIiiIilIlIIiiIi = 0;
               return;
            }

            this.Ilillllill(var8, IliIlllilIi<invokedynamic>());
            this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
            this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IlIlIiIlIi;
            break;
         case 3:
            int var7 = this.lIIiiiIIii();
            class_3965 var13 = this.iIiilIliil(this.ilIIIiiIiIiIIIiiIi) ? this.ilIIIiiIiIiIIIiiIi : (this.IlIIIiiIillIIIiiIi == null ? null : this.illilIilil(this.IlIIIiiIillIIIiiIi, this.lIIIIiiIiiIIIIiiIi));
            if (var13 != null && var7 != -1 && this.illIIlIilIIl()) {
               this.Ilillllill(var7, IliIlllilIi<invokedynamic>());
               class_3965 var17 = this.IiIIIlliIIIl(var13, this.lIlliiIlli(var13));
               if (var17 == null && this.iIlIIiiIiIllIIiiIi <= 12) {
                  return;
               }

               if (var17 != null) {
                  this.llIIIlilIIIl(var17, IliIlllilIi<invokedynamic>());
                  this.IilIIiiIililIIiiIi = iliilliIiiilli.lIiiIiIlilli(this.IlIIIiiIillIIIiiIi);
               }
            }

            this.iiiiiliIiIIIIIiiIi = this.lilIIliilIIl();
            this.IIlIIiiIilIlIIiiIi = 0;
            this.iIlIIiiIiIllIIiiIi = 0;
            this.ilIIIiiIiIiIIIiiIi = null;
            break;
         case 4:
            int var6 = this.lIIiiiIIii();
            if (var6 == -1) {
               this.IlIlIlllIlIl();
               return;
            }

            boolean var12 = !iliilliIiiilli.lIiiIiIlilli(this.lIIIIiiIiiIIIIiiIi);
            boolean var16 = Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi).method_27852(class_2246.field_23152);
            if (var12 && !var16 && this.lllIIiiIiillIIiiIi) {
               this.iIlllIllll(IliIlllilIi<invokedynamic>());
               this.IlIlIlllIlIl();
               return;
            }

            if (!var16) {
               if (++this.IIlIIiiIilIlIIiiIi > this.lliIiliIiiliIiliIi.Iilllilliill()) {
                  this.IlIlIlllIlIl();
               }

               return;
            }

            if (!this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi)) {
               this.ilIIIiiIiIiIIIiiIi = this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            }

            if (this.ilIIIiiIiIiIIIiiIi == null) {
               this.iIlllIllll(IliIlllilIi<invokedynamic>());
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(var6, IliIlllilIi<invokedynamic>());
            this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
            if (var12) {
               this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.ilIlIiIlIi;
            } else if (++this.IIlIIiiIilIlIIiiIi > this.lliIiliIiiliIiliIi.Iilllilliill()) {
               this.IlIlIlllIlIl();
            }
            break;
         case 5:
            int var5 = this.lIIiiiIIii();
            if (var5 == -1) {
               this.IlIlIlllIlIl();
               return;
            }

            class_3965 var11 = this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi) ? this.ilIIIiiIiIiIIIiiIi : this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            if (var11 == null) {
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(var5, IliIlllilIi<invokedynamic>());
            class_3965 var15 = this.IiIIIlliIIIl(var11, this.Illlilllli(this.lIIIIiiIiiIIIIiiIi, false));
            if (var15 == null) {
               this.iiIIIlIIlIIl(true);
               return;
            }

            this.llIIIlilIIIl(var15, IliIlllilIi<invokedynamic>());
            this.ilIIIiiIiIiIIIiiIi = var11;
            this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IiIlIiIlIi;
            this.IIlIIiiIilIlIIiiIi = 0;
            break;
         case 6:
            if (!this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi)) {
               this.ilIIIiiIiIiIIIiiIi = this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            }

            if (this.ilIIIiiIiIiIIIiiIi == null) {
               this.IlIlIlllIlIl();
               return;
            }

            this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
            int var4 = this.IIiIIllIiIIl();
            if (var4 == -1) {
               if (++this.IIlIIiiIilIlIIiiIi <= this.lliIiliIiiliIiliIi.Iilllilliill()) {
                  return;
               }

               if (!Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8288) || IIIIilIilIIIilIi.iiiIlIIIll(40)) {
                  this.iIlllIllll(IliIlllilIi<invokedynamic>());
                  this.IlIlIlllIlIl();
                  return;
               }

               var4 = this.lIIliliIiiIIliliIi.Iilllilliill() - 1;
               if (Iiiilllliiilll.field_1724.method_31548().method_5438(var4).method_31574(class_1802.field_8801)) {
                  var4 = this.liIiiiiIii();
               }

               if (var4 == -1) {
                  this.iIlllIllll(IliIlllilIi<invokedynamic>());
                  this.IlIlIlllIlIl();
                  return;
               }
            }

            this.liIIIiiIiiiIIIiiIi = var4;
            this.Ilillllill(var4, IliIlllilIi<invokedynamic>());
            if (iliilliIiiilli.lIiiIiIlilli(this.lIIIIiiIiiIIIIiiIi) || this.IlIIIiiIillIIIiiIi != null && iliilliIiiilli.lIiiIiIlilli(this.IlIIIiiIillIIIiiIi)) {
               if (++this.IIlIIiiIilIlIIiiIi > this.lliIiliIiiliIiliIi.Iilllilliill()) {
                  this.iIlllIllll(IliIlllilIi<invokedynamic>());
                  this.IlIlIlllIlIl();
               }

               return;
            }

            if (this.IiiIIlliiIIl() <= 0) {
               boolean var10 = Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi).method_27852(class_2246.field_23152);
               if (!this.lIiIIiiIiiIiIIiiIi && var10) {
                  this.lIiIIiiIiiIiIIiiIi = true;
                  this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.llIlIiIlIi;
                  this.IIlIIiiIilIlIIiiIi = 0;
                  this.ilIIIiiIiIiIIIiiIi = null;
               } else {
                  if (var10) {
                     this.iIlllIllll(IliIlllilIi<invokedynamic>());
                  }

                  this.IlIlIlllIlIl();
               }

               return;
            }

            this.iilIIiiIiIIiIIiiIi = true;
            if (this.IilIIiiIililIIiiIi && !this.IliIIiiIilliIIiiIi && !Iiiilllliiilll.field_1687.method_8320(this.IlIIIiiIillIIIiiIi).method_27852(class_2246.field_10171)) {
               this.IliIIiiIilliIIiiIi = true;
               this.IilIIiiIililIIiiIi = false;
               this.IlIIIiiIillIIIiiIi = this.IllIIllllIIl(this.lIIIIiiIiiIIIIiiIi);
               if (this.IlIIIiiIillIIIiiIi != null) {
                  this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.iIIlIiIlIi;
                  this.IIlIIiiIilIlIIiiIi = 0;
                  this.ilIIIiiIiIiIIIiiIi = null;
                  return;
               }
            }

            this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.liIlIiIlIi;
            break;
         case 7:
            if (this.IiiIIlliiIIl() == 0) {
               this.IlIlIlllIlIl();
               return;
            }

            if (this.ilIliliIiIiIliliIi.Iilllilliill() && this.iiiIIlIIIlIl(this.lIIIIiiIiiIIIIiiIi)) {
               this.iIlllIllll(IliIlllilIi<invokedynamic>());
               this.IlIlIlllIlIl();
               return;
            }

            boolean var1 = this.liIIIiiIiiiIIIiiIi >= 0 && Iiiilllliiilll.field_1724.method_31548().method_5438(this.liIIIiiIiiiIIIiiIi).method_31574(class_1802.field_8288);
            if (!var1 && !Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8288)) {
               this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IiIlIiIlIi;
               this.IIlIIiiIilIlIIiiIi = 0;
               return;
            }

            class_3965 var2 = this.IIiillIiil(this.ilIIIiiIiIiIIIiiIi) ? this.ilIIIiiIiIiIIIiiIi : this.lililiilil(this.lIIIIiiIiiIIIIiiIi);
            if (var2 == null) {
               this.IlIlIlllIlIl();
               return;
            }

            this.Ilillllill(this.liIIIiiIiiiIIIiiIi, IliIlllilIi<invokedynamic>());
            class_3965 var3 = this.IiIIIlliIIIl(var2, this.Illlilllli(this.lIIIIiiIiiIIIIiiIi, true));
            if (var3 == null) {
               this.iiIIIlIIlIIl(true);
               return;
            }

            this.llIIIlilIIIl(var3, IliIlllilIi<invokedynamic>());
            this.IlIlIlllIlIl();
      }

   }

   public IIiiIillIiiIil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      this.IIiiiliIilIiiiliIi = Integer.MIN_VALUE;
      this.iIiiiliIiIliiiliIi = Integer.MIN_VALUE;
      this.lliiiliIiiliiiliIi = Integer.MIN_VALUE;
      this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IIIlIiIlIi;
      this.liIIIiiIiiiIIIiiIi = -1;
      this.liiIIiiIiiiiIIiiIi = true;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiiIiliIiliiIiliIi, this.iiiIiliIiIIIliliIi, this.lIIliliIiiIIliliIi, this.IlIliliIillIliliIi, this.ilIliliIiIiIliliIi, this.liIliliIiiiIliliIi, this.lilIiliIiiilIiliIi, this.IIiIiliIilIiIiliIi, this.iIiIiliIiIliIiliIi, this.lliIiliIiiliIiliIi});
   }

   private class_3965 lIiIiiIiIi(class_3965 hit) {
      if (hit == null) {
         return null;
      } else {
         class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
         double var3 = lliiIliliiIl.liiiIIllIl();
         if (var2.method_1025(hit.method_17784()) <= var3 * var3) {
            return hit;
         } else {
            class_243 var5 = IliIilliIi(hit.method_17777(), hit.method_17780(), var2);
            return var2.method_1025(var5) > var3 * var3 ? null : new class_3965(var5, hit.method_17780(), hit.method_17777(), false);
         }
      }
   }

   private boolean lIliliIlil(class_2338 cover, class_2338 anchor) {
      return !IIililIili(anchor) && this.illilIilil(anchor, cover) != null && this.lllIiillIi(cover, anchor);
   }

   private int IiiIIlliiIIl() {
      class_2680 var1 = Iiiilllliiilll.field_1687.method_8320(this.lIIIIiiIiiIIIIiiIi);
      return var1.method_27852(class_2246.field_23152) ? (Integer)var1.method_11654(class_4969.field_23153) : 0;
   }

   private void Iiliililii(String reason) {
      if (IliIlllilIi<invokedynamic>().equals(reason)) {
         this.iIlllIllll(IliIlllilIi<invokedynamic>());
      } else if (IliIlllilIi<invokedynamic>().equals(reason)) {
         this.iIlllIllll(this.lilliiilli(this.lIliiliIiiIliiliIi));
      } else if (IliIlllilIi<invokedynamic>().equals(reason)) {
         this.iIlllIllll(IliIlllilIi<invokedynamic>());
      }

   }

   private class_3965 illilIilil(class_2338 target, class_2338 avoid) {
      if (this.Iiililiili(target) && this.ilIIiIiIIi(target)) {
         return this.lliililiil(target);
      } else {
         class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
         class_243 var4 = Iiiilllliiilll.field_1724.method_5828(1.0F);
         class_3965 var5 = this.lIiIiiIiIi(lliiIliliiIl.IiIlliIliiIl(target, avoid, var3, var4, lliiIliliiIl.liiiIIllIl(), IIlliliIilIlliliIi));
         if (!this.iIiilIliil(var5)) {
            var5 = this.lIiIiiIiIi(lliiIliliiIl.IiIlliIliiIl(target, avoid, var3, var4, Double.longBitsToDouble(-8803361770644762596L ^ -4197305251751587812L), IIlliliIilIlliliIi));
         }

         if (!this.iIiilIliil(var5)) {
            var5 = this.Iiiilliiil(target, avoid);
         }

         return var5;
      }
   }

   private static double lIIIiiIIIi(double mid, double v, double min, double max) {
      return class_3532.method_15350(mid, Math.min(v + Double.longBitsToDouble(-3109827228115887935L ^ -1482188930512518821L), max), Math.max(min - Double.longBitsToDouble(-7367716867024521784L ^ -6451119416116450222L), max));
   }

   private iiIiIIliIIliIIli lilIIliilIIl() {
      return this.iilIIiiIiIIiIIiiIi ? iiIiIIliIIliIIli.IiIlIiIlIi : iiIiIIliIIliIIli.llIlIiIlIi;
   }

   private static class_2338 Illillllil(class_2338 i, int anchor) {
      return lliiIliliiIl.IIIllIIliIIl(i, anchor);
   }

   private String lilliiilli(boolean use) {
      if (use && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.method_5715()) {
         return IliIlllilIi<invokedynamic>();
      } else {
         return IliIlllilIi<invokedynamic>().equals(this.lilIiliIiiilIiliIi.Iilllilliill()) && !this.IiiIiliIiliiIiliIi.Iilllilliill() ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
      }
   }

   public boolean liIlliiIll(class_2338 pos) {
      return this.IliIlllilIi() && this.lliIIliliIIl();
   }

   private void llIIIlilIIIl(class_3965 what, String ray) {
      this.liilliiill(what.method_17784());
      this.IiiiiliIiliiiiliIi = true;

      try {
         Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, what);
      } finally {
         this.IiiiiliIiliiiiliIi = false;
      }

      this.lliiiliIiiliiiliIi = Iiiilllliiilll.field_1724.field_6012;
      this.iliIIiiIiIiiIIiiIi = true;
   }

   private void liiiiiiiii() {
      iiIiIIliIIliIIli var1 = this.iiiiiliIiIIIIIiiIi;
      this.iIIIIlIlIIIl();
      if (this.liIliliIiiiIliliIi.Iilllilliill() && !this.iliIIiiIiIiiIIiiIi && this.iiiiiliIiIIIIIiiIi != var1 && IIIIIllIIIIl(this.iiiiiliIiIIIIIiiIi)) {
         this.iIIIIlIlIIIl();
      }

   }

   private class_3965 Illlilllli(class_2338 detonate, boolean block) {
      return this.iiIliIIlli() && !iliilliIiiilli.lIiiIiIlilli(detonate) && !this.illliIilli(detonate, block) ? this.iIIliIlIli(detonate) : null;
   }

   protected void IiIIlliIIl(IliIliIllliIliIl event) {
   }

   public boolean iiliiIIiii(class_2338 pos) {
      return this.IIiIiliIilIiIiliIi.Iilllilliill() && pos != null && pos.equals(this.IlliiliIillliiliIi);
   }

   private void iliiiIiiii() {
      if (this.iIlliliIiIllliliIi.IliIlllilIi() != IilliIillilliIil.lIllIilIil) {
         this.iIlliliIiIllliliIi.iliIiiliiiii();
         this.lIiiiiIiii();
         this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      }

      if (Iiiilllliiilll.field_1755 != null) {
         this.IlIlIlllIlIl();
      } else {
         this.iliIIiiIiIiiIIiiIi = false;
         boolean var1 = this.lIIlIliIIlIl();
         boolean var2 = var1 && !this.liiIIiiIiiiiIIiiIi;
         this.liiIIiiIiiiiIIiiIi = var1;
         if (this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi) {
            this.liiiiiiiii();
         } else if (var2) {
            if (!IIIIilIilIIIilIi.lIIlliIIll()) {
               if (!lliiIliliiIl.iIlIlllllill()) {
                  this.iIlllIllll(IliIlllilIi<invokedynamic>());
               } else if (this.ilIiiIiIii() != -1 && this.lIIiiiIIii() != -1) {
                  if (this.lIlIIliIlIIl()) {
                     if (this.ilIIIiiIiIiIIIiiIi == null) {
                        this.iIlllIllll(IliIlllilIi<invokedynamic>());
                        this.IlIlIlllIlIl();
                     } else {
                        this.Ilillllill(this.ilIiiIiIii(), IliIlllilIi<invokedynamic>());
                        this.liilliiill(this.ilIIIiiIiIiIIIiiIi.method_17784());
                        this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.lIIlIiIlIi;
                        this.IIlIIiiIilIlIIiiIi = 0;
                        if (this.liIliliIiiiIliliIi.Iilllilliill()) {
                           this.iIIIIlIlIIIl();
                        }

                     }
                  }
               } else {
                  this.iIlllIllll(IliIlllilIi<invokedynamic>());
               }
            }
         }
      }
   }

   private boolean iIiilIliil(class_3965 hit) {
      if (hit == null) {
         return false;
      } else if (this.Iiililiili(hit.method_17777())) {
         return this.ilIIiIiIIi(hit.method_17777()) && this.IIiillIiil(hit);
      } else {
         return (lliiIliliiIl.IIillIiliIil(hit, Iiiilllliiilll.field_1724.method_33571(), Double.longBitsToDouble(-9117855918229807225L ^ -4511799399336632441L)) || this.liIIiiiIIi(hit)) && this.IilIililIi(hit.method_17777()) && this.IIlIilIlIi(hit);
      }
   }

   private class_243 liiIiiiiIi() {
      return ilIiiIiIii.Iiilliiliiil(ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil());
   }

   public boolean lliIIliliIIl() {
      return this.IliIlllilIi() && (this.iIlliliIiIllliliIi.IliIlllilIi() != IilliIillilliIil.lIllIilIil || this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi);
   }

   private boolean iIliiIllii() {
      long var3 = 7670651309985386054L;
      var3 ^= ((long)(!Iiiilllliiilll.field_1724.method_6047().method_7909().method_57347().method_57832(class_9334.field_50075) && !Iiiilllliiilll.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075) ? 0 : 1) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(!(Iiiilllliiilll.field_1724.method_6047().method_7909() instanceof class_1819) && !(Iiiilllliiilll.field_1724.method_6079().method_7909() instanceof class_1819) ? 0 : 1) ^ var3) & -1L >>> 32;
      return ((int)(var3 >>> 32) != 0 || (int)var3 != 0) && this.llliiillii();
   }

   private class_3965 lliililiil(class_2338 block) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var3 = this.liiIiiiiIi();
      class_3965 var4 = null;
      double var5 = (double)-2.0F;

      for(class_2350 var10 : class_2350.values()) {
         class_243 var11 = this.iiiilIIIIi(block, var10, var2);
         if (var11 != null) {
            class_3965 var12 = new class_3965(var11, var10, block, false);
            if (this.liIIiiiIIi(var12) && this.IIlIilIlIi(var12)) {
               double var13 = var11.method_1020(var2).method_1029().method_1026(var3);
               if (var13 > var5) {
                  var5 = var13;
                  var4 = var12;
               }
            }
         }
      }

      return var4;
   }

   private void liilliiill(class_243 spot) {
      if (Iiiilllliiilll.field_1724 != null) {
         class_243 var2 = this.IIIillIIil(spot);
         String var3 = this.lilIiliIiiilIiliIi.Iilllilliill();
         boolean var4 = this.IiiIiliIiliiIiliIi.Iilllilliill();
         if (IliIlllilIi<invokedynamic>().equals(var3) && var4) {
            var3 = IliIlllilIi<invokedynamic>();
            if (!this.IIIlIiiIilIIlIiiIi) {
               this.IIIlIiiIilIIlIiiIi = true;
               this.iIlllIllll(IliIlllilIi<invokedynamic>());
            }
         }

         byte var6 = -1;
         switch (var3.hashCode()) {
            case -1818460043:
               if (var3.equals(IliIlllilIi<invokedynamic>())) {
                  var6 = 1;
               }
               break;
            case 2131396690:
               if (var3.equals(IliIlllilIi<invokedynamic>())) {
                  var6 = 0;
               }
         }

         switch (var6) {
            case 0:
               if (var4) {
                  ilIiiIiIii.lIiiIiIlilli(this, var2, 90, false, false, true);
               } else {
                  ilIiiIiIii.IilliliilIIi(this, var2, 90, false);
               }
               break;
            case 1:
               if (var4) {
                  ilIiiIiIii.lIiiIiIlilli(this, var2, 90, true, true, false);
               } else {
                  ilIiiIiIii.lIiiIiIlilli(this, var2, 90, true, false, true);
               }
         }

      }
   }

   private int ilIiiIiIii() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for(int var2 = 0; var2 < 9; ++var2) {
         if (var1.method_5438(var2).method_31574(class_1802.field_23141)) {
            return var2;
         }
      }

      return -1;
   }

   private int IIiIIllIiIIl() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      int var2 = this.lIIliliIiiIIliliIi.Iilllilliill() - 1;
      if (var1.method_5438(var2).method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(var2)) {
         return var2;
      } else {
         for(int var3 = 0; var3 < 9; ++var3) {
            if (var1.method_5438(var3).method_31574(class_1802.field_8288) && !IIIIilIilIIIilIi.iiiIlIIIll(var3)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private boolean IilIililIi(class_2338 pos) {
      if (!this.Iiililiili(pos) && !iliilliIiiilli.lIiiIiIlilli(pos)) {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(pos);
         if (this.IlIIillIIi(pos) == null) {
            return false;
         } else {
            return Iiiilllliiilll.field_1724.method_5715() || !this.iilIiIIiIi(var2, pos);
         }
      } else {
         return false;
      }
   }

   private static double IiIliliIli(double lo, double v, double hi) {
      double var6 = Math.min(Double.longBitsToDouble(-9221066796951995025L ^ -4626600166488158628L), Math.max((double)0.0F, (hi - v) / Double.longBitsToDouble(-3500866690733659030L ^ -8112552709161046934L) - Double.longBitsToDouble(6756769933308395456L ^ 7079839577578204091L)));
      return Math.max(v + var6, Math.min(hi - var6, lo));
   }

   private void iIIilIlIil() {
      if (this.lllliliIiillliliIi != null && Iiiilllliiilll.field_1761 != null && this.liililiIiiiililiIi != null) {
         this.ilillIiill(this.liililiIiiiililiIi, IliIlllilIi<invokedynamic>());
         this.liliiliIiiiliiliIi = true;
      }
   }

   private static boolean IIIIIllIIIIl(iiIiIIliIIliIIli s) {
      return s == iiIiIIliIIliIIli.lIIlIiIlIi || s == iiIiIIliIIliIIli.ilIlIiIlIi || s == iiIiIIliIIliIIli.IlIlIiIlIi || s == iiIiIIliIIliIIli.liIlIiIlIi;
   }

   private void IlIlIlllIlIl() {
      this.iiiiiliIiIIIIIiiIi = iiIiIIliIIliIIli.IIIlIiIlIi;
      this.lIIIIiiIiiIIIIiiIi = null;
      this.IlIIIiiIillIIIiiIi = null;
      this.ilIIIiiIiIiIIIiiIi = null;
      this.liIIIiiIiiiIIIiiIi = -1;
      this.IIlIIiiIilIlIIiiIi = 0;
      this.iIlIIiiIiIllIIiiIi = 0;
      this.lllIIiiIiillIIiiIi = false;
      this.IilIIiiIililIIiiIi = false;
      this.iilIIiiIiIIiIIiiIi = false;
      this.lIiIIiiIiiIiIIiiIi = false;
      this.IliIIiiIilliIIiiIi = false;
   }

   private static class_243 IliIilliIi(class_2338 eye, class_2350 side, class_243 block) {
      class_243 var3 = class_243.method_24953(eye).method_1031((double)side.method_10148() * Double.longBitsToDouble(1604904772692782874L ^ 3001020657177636634L), (double)side.method_10164() * Double.longBitsToDouble(3224326578990438013L ^ 1395865130278016637L), (double)side.method_10165() * Double.longBitsToDouble(3662052534068907331L ^ 950885558391868739L));
      class_2350.class_2351 var4 = side.method_10166();
      return new class_243(var4 == class_2351.field_11048 ? var3.field_1352 : class_3532.method_15350(block.field_1352, var3.field_1352 - Double.longBitsToDouble(1500349222841315793L ^ 3102561674103733532L), var3.field_1352 + Double.longBitsToDouble(-6933412372069905874L ^ -6909824876405242141L)), var4 == class_2351.field_11052 ? var3.field_1351 : class_3532.method_15350(block.field_1351, var3.field_1351 - Double.longBitsToDouble(1803517565549123458L ^ 2800022253053893455L), var3.field_1351 + Double.longBitsToDouble(-4156796057014296528L ^ -464762679003190019L)), var4 == class_2351.field_11051 ? var3.field_1350 : class_3532.method_15350(block.field_1350, var3.field_1350 - Double.longBitsToDouble(-4975913362669853612L ^ -8849909830878664551L), var3.field_1350 + Double.longBitsToDouble(-6175186264497453337L ^ -7669181549265368534L)));
   }

   private boolean Iiililiili(class_2338 pos) {
      return lliiIliliiIl.lIiiIiIlilli(pos);
   }

   private void lIilliIill() {
      IilliIillilliIil var1 = this.iIlliliIiIllliliIi.IliIlllilIi();
      if (var1 == IilliIillilliIil.lillIilIil && this.illiiliIiIiliiliIi != IilliIillilliIil.lillIilIil) {
         this.Iiliililii(this.iIlliliIiIllliliIi.liiiIIllIl());
         if (this.lllliliIiillliliIi != null) {
            this.IlliiliIillliiliIi = this.lllliliIiillliliIi;
         }

         this.iIlliliIiIllliliIi.iliIiiliiiii();
         this.lIiiiiIiii();
         this.illiiliIiIiliiliIi = IilliIillilliIil.lIllIilIil;
      } else {
         if (var1 == IilliIillilliIil.IillIilIil && this.illiiliIiIiliiliIi != IilliIillilliIil.IillIilIil && this.liliiliIiiiliiliIi) {
            this.llIililIil();
         }

         this.illiiliIiIiliiliIi = var1;
         if (var1 == IilliIillilliIil.lIllIilIil) {
            this.lIiiiiIiii();
         }

      }
   }

   private boolean IIiillIiil(class_3965 hit) {
      return hit != null && (lliiIliliiIl.Iilllilliill(hit, Iiiilllliiilll.field_1724.method_33571(), Double.longBitsToDouble(528555799478569335L ^ 5134612318371744119L)) || this.liIIiiiIIi(hit)) && this.IIlIilIlIi(hit);
   }

   private boolean liIIiiiIIi(class_3965 hit) {
      if (hit == null) {
         return false;
      } else {
         class_238 var2 = this.IlIIillIIi(hit.method_17777());
         if (var2 == null) {
            return false;
         } else {
            class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
            double var10000;
            switch (null.IlIlilillIlili[hit.method_17780().ordinal()]) {
               case 1 -> var10000 = var2.field_1322 - var3.field_1351;
               case 2 -> var10000 = var3.field_1351 - var2.field_1325;
               case 3 -> var10000 = var2.field_1321 - var3.field_1350;
               case 4 -> var10000 = var3.field_1350 - var2.field_1324;
               case 5 -> var10000 = var2.field_1323 - var3.field_1352;
               case 6 -> var10000 = var3.field_1352 - var2.field_1320;
               default -> throw new MatchException((String)null, (Throwable)null);
            }

            double var4 = var10000;
            return var4 >= 0.1;
         }
      }
   }

   private boolean ilIIiIiIIi(class_2338 pos) {
      return !Iiiilllliiilll.field_1687.method_8320(pos).method_26215() && this.IlIIillIIi(pos) != null;
   }

   private boolean iiIliIIlli() {
      return Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_6012 != this.iIiiiliIiIliiiliIi && Iiiilllliiilll.field_1724.field_6012 != this.lliiiliIiiliiiliIi && iiilIiIIIiIi.IliIlllilIi(IIllIIlilIllIIli.IlIlllIlilIl());
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ '\ue75c') - 4172) + var5))) ^ 28191) ^ '齲') - 596) - var5) - 28005) - 15269) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 32297) ^ 24827) + var5) << 3 | (char)((char)((char)(var4[var5] - 32297) ^ 24827) + var5) >>> 13))) ^ 2565) + 16073) + 20691) >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 32297) ^ 24827) + var5) << 3 | (char)((char)((char)(var4[var5] - 32297) ^ 24827) + var5) >>> 13))) ^ 2565) + 16073) + 20691) << 2))) + 23934))) - var5) ^ 25079) + 15550) ^ var5) + 14055));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean illIIlIilIIl() {
      return this.IlIIIiiIillIIIiiIi != null && this.Iiililiili(this.IlIIIiiIillIIIiiIi) && this.iiiliIIIii(this.IlIIIiiIillIIIiiIi) && !IIililIili(this.IlIIIiiIillIIIiiIi);
   }

   public void Illillliilli() {
      this.Iliiilliii();
   }

   private boolean lllIiillIi(class_2338 anchor, class_2338 cover) {
      class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
      class_238 var4 = new class_238(cover);
      double var5 = lliiIliliiIl.liiiIIllIl();

      for(class_2350 var10 : class_2350.values()) {
         if (!anchor.method_10093(var10).equals(cover)) {
            class_243 var11 = class_243.method_24953(anchor).method_1031((double)var10.method_10148() * (double)0.5F, (double)var10.method_10164() * (double)0.5F, (double)var10.method_10165() * (double)0.5F);
            double var12 = (var3.field_1352 - var11.field_1352) * (double)var10.method_10148() + (var3.field_1351 - var11.field_1351) * (double)var10.method_10164() + (var3.field_1350 - var11.field_1350) * (double)var10.method_10165();
            if (!(var12 < 0.1)) {
               class_243 var14 = var3.method_1025(var11) <= var5 * var5 ? var11 : IliIilliIi(anchor, var10, var3);
               if (!(var3.method_1025(var14) > var5 * var5) && !var4.method_992(var3, var14).isPresent()) {
                  class_3965 var15 = Iiiilllliiilll.field_1687.method_17742(new class_3959(var3, var14, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
                  if (var15 == null || var15.method_17783() == class_240.field_1333 || var15.method_17777().equals(anchor)) {
                     return true;
                  }
               }
            }
         }
      }

      return false;
   }

   private void IiIilliIil() {
      class_239 var1 = Iiiilllliiilll.field_1765;
      if (var1 != null && var1.method_17783() == class_240.field_1332) {
         class_2338 var2 = ((class_3965)var1).method_17777();
         class_2680 var3 = Iiiilllliiilll.field_1687.method_8320(var2);
         if (var3.method_27852(class_2246.field_23152)) {
            if ((Integer)var3.method_11654(class_4969.field_23153) != 0) {
               if (!var2.equals(this.IlliiliIillliiliIi)) {
                  if (lliiIliliiIl.iIlIlllllill()) {
                     this.lllliliIiillliliIi = var2;
                     lIIliiiliIIliiil var4 = this.iiIilIIlil(this.lllliliIiillliliIi, (p) -> this.lIliliIlil(this.lllliliIiillliliIi, p));
                     this.IilliliIililliliIi = var4.IliIlllilIi() ? Illillllil(this.lllliliIiillliliIi, var4.iIlIlllllill()) : null;
                     this.iilliliIiIIililiIi = var4.liiiIIllIl();
                     this.lIililiIiiIililiIi = this.IilliliIililliliIi == null ? null : this.illilIilil(this.IilliliIililliliIi, this.lllliliIiillliliIi);
                     this.llIiiliIiilIiiliIi = Iiiilllliiilll.field_1724.method_31548().method_67532();
                     this.IiIiiliIiliIiiliIi = this.lliIiliIiiliIiliIi.Iilllilliill() + IIlliliIilIlliliIi.nextInt(3);
                  }
               }
            }
         }
      }
   }

   private void lIiiiiIiii() {
      this.lllliliIiillliliIi = null;
      this.IilliliIililliliIi = null;
      this.iilliliIiIIililiIi = false;
      this.lIililiIiiIililiIi = null;
      this.IlililiIillililiIi = null;
      this.ilililiIiIiililiIi = null;
      this.liililiIiiiililiIi = null;
      this.IIIiiliIilIIiiliIi = -1;
      this.iIIiiliIiIlIiiliIi = -1;
      this.llIiiliIiilIiiliIi = -1;
      this.IiIiiliIiliIiiliIi = 0;
      this.iiIiiliIiIIliiliIi = false;
      this.lIliiliIiiIliiliIi = false;
      this.liliiliIiiiliiliIi = false;
   }

   private boolean iliIiIiiIi(class_3965 hit) {
      double var2 = Math.min(Double.longBitsToDouble(6225687319635214093L ^ 1617941950881775373L), Iiiilllliiilll.field_1724.method_55754());
      return hit != null && Iiiilllliiilll.field_1724.method_33571().method_1025(hit.method_17784()) <= var2 * var2;
   }

   private class_2338 IllIIllllIIl(class_2338 anchor) {
      lIIliiiliIIliiil var2 = this.iiIilIIlil(anchor, (anchorx) -> this.lIliliIlil(anchor, anchorx));
      return var2.IliIlllilIi() && !var2.liiiIIllIl() ? Illillllil(anchor, var2.iIlIlllllill()) : null;
   }

   private boolean lIIlIliIIlIl() {
      long var2 = 8405210446587565884L;
      var2 ^= ((long)this.iiiIiliIiIIIliliIi.Ililllililil() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) < 0) {
         return false;
      } else if (IlIiliIlllIiliIl.IliIlllilIi((int)(var2 >>> 32))) {
         return GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), IlIiliIlllIiliIl.liiiIIllIl((int)(var2 >>> 32))) == (~((694750142 << 17 | 694750142 >>> 15) >>> 23 | (694750142 << 17 | 694750142 >>> 15) << 9) ^ 77 ^ 123362205);
      } else {
         return class_3675.method_15987(Iiiilllliiilll.method_22683(), (int)(var2 >>> 32));
      }
   }

   private static boolean IIililIili(class_2338 cell) {
      return iliilliIiiilli.Iiilliiliiil(cell, iliilliIiiilli.IIillIiliIil());
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         int var1 = Iiiilllliiilll.field_1724.field_6012;
         if (var1 != this.IIiiiliIilIiiiliIi) {
            this.IIiiiliIilIiiiliIi = var1;
            if (this.IiiIiliIiliiIiliIi.Iilllilliill()) {
               this.iliiiIiiii();
            } else {
               if (this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi) {
                  this.IlIlIlllIlIl();
               }

               if (Iiiilllliiilll.field_1755 == null && !this.iIliiIllii()) {
                  boolean var2 = this.llliiillii();
                  if (!var2) {
                     this.IlliiliIillliiliIi = null;
                  }

                  if (this.iIlliliIiIllliliIi.IliIlllilIi() == IilliIillilliIil.lIllIilIil && var2) {
                     this.IiIilliIil();
                  }

                  if (this.lllliliIiillliliIi != null && var2) {
                     Iiiilllliiilll.field_1690.field_1904.method_23481(false);
                  }

                  this.iilllIIill(this.iIlliliIiIllliliIi.IIIllIIliIIl(this.lllllillll(var2)));
                  this.lIilliIill();
               } else {
                  this.iilllIIill(this.iIlliliIiIllliliIi.IIIllIIliIIl(this.Iillllilll()));
                  this.lIilliIill();
               }
            }
         }
      } else {
         this.Iliiilliii();
      }
   }

   public boolean IIllllIlll(class_2338 pos) {
      if (!this.IiiIiliIiliiIiliIi.Iilllilliill()) {
         return !this.iiliiIIiii(pos);
      } else {
         return this.iiiiiliIiIIIIIiiIi != iiIiIIliIIliIIli.IIIlIiIlIi || !this.IIiIiliIilIiIiliIi.Iilllilliill();
      }
   }

   private void iIlllIllll(String msg) {
      if (!IliiliIllliiliIl.iiiIlIIIll()) {
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + msg), false);
         }

      } else {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), msg, false);
      }
   }

   private class_243 IIIillIIil(class_243 spot) {
      class_243 var2 = new class_243(Iiiilllliiilll.field_1724.method_23317() - Iiiilllliiilll.field_1724.field_6014, Iiiilllliiilll.field_1724.method_23318() - Iiiilllliiilll.field_1724.field_6036, Iiiilllliiilll.field_1724.method_23321() - Iiiilllliiilll.field_1724.field_5969);
      return var2.method_1027() > Double.longBitsToDouble(-2210407312778418906L ^ -2404062096755350234L) ? spot : spot.method_1020(var2);
   }

   private static boolean IIliilIlii(class_1799 stack) {
      return lliiIliliiIl.IlIillIiilIi(stack);
   }
}
