package gg.corz;

import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10936;
import net.minecraft.class_10938;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1735;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2649;
import net.minecraft.class_2653;
import net.minecraft.class_2724;
import net.minecraft.class_2813;
import net.minecraft.class_2815;
import net.minecraft.class_2824;
import net.minecraft.class_2846;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_418;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_9835;
import net.minecraft.class_2846.class_2847;

public class IIIIilIilIIIilIi extends ilIllIiIll {
   private final boolean[] lIIliIlIIi;
   private static volatile int IlIIiIlIIi = -1;
   private boolean liIilIlIIi;
   private boolean iIlilIlIIi;
   private int illIiIlIIi;
   private final Random IiIilIlIIi = new Random();
   private int IIiIiIlIIi;
   private int liiIiIlIIi;
   private static volatile BooleanSupplier llIliIlIIi;
   private static volatile Object iIIliIlIIi;
   private static final long IIIliIlIIi = 600L;
   private int IliIiIlIIi;
   private long IIiilIlIIi;
   private static final long iiIIiIlIIi = 150L;
   private int lIlilIlIIi;
   private final IIiIlilIiIli IliilIlIIi;
   private static final long lilIiIlIIi = 600L;
   static final int ilIliIlIIi = 0;
   private final iiIiiilIIliiil IlIilIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int IIlilIlIIi;
   private long iIiilIlIIi;
   private float IililIlIIi;
   private static final int iIillIlIIi = 40;
   private boolean iililIlIIi;
   private static final long liIIiIlIIi = 500L;
   private boolean lllilIlIIi;
   private long illilIlIIi;
   private final iilliIlIIiliIl IIIilIlIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 0, 10);
   private int IIlIiIlIIi;
   private int IiiIiIlIIi;
   private Runnable iiiIiIlIIi;
   static final int IIlliIlIIi = 1;
   private static volatile String IiIIiIlIIi = "";
   private int lililIlIIi = Integer.MIN_VALUE;
   private volatile long liiilIlIIi;
   private static volatile long llIIiIlIIi;
   private static volatile boolean IilIiIlIIi;
   static final int iiIliIlIIi = 0;
   static final int IiIliIlIIi = 1;
   private volatile long IiiilIlIIi;
   private int lllIiIlIIi;
   private static final long IllIiIlIIi = 150L;
   static final int lIlliIlIIi = 2;
   private final iiIiiilIIliiil llillIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final long lliilIlIIi = 1500L;
   private static volatile int iIIIiIlIIi = -1;
   private long lIlIiIlIIi;
   private static final long IIIIiIlIIi = 60L;
   private IIlllilIllli lIIIiIlIIi;
   private final iiIiiilIIliiil lIIilIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final int IllliIlIIi = 4;
   private IiIlIillliIlIill iilIiIlIIi;
   private final iilliIlIIiliIl iiillIlIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + IliIlllilIi<invokedynamic>(), 300, 60, 900);
   private boolean iiiilIlIIi;
   private long iIlIiIlIIi;
   private static final int iliIiIlIIi = 10;
   static final float iIlliIlIIi = 1.0F;
   private static final AtomicIntegerArray ilIIiIlIIi = new AtomicIntegerArray((-78467222 + 117 << 19 | -78467222 + 117 >>> 13) - 89 + -81 ^ 2130696645);
   private final iiIiiilIIliiil iIIilIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final long lIiilIlIIi = 400L;
   private static final int lIillIlIIi = 40;
   private final iiIiiilIIliiil IiillIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int iiIilIlIIi;
   private final iiIiiilIIliiil llIilIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl liillIlIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 45, 20, 500);
   private int lIiIiIlIIi;
   private final iilliIlIIiliIl ilillIlIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 9, 1, 9);
   private boolean IllilIlIIi;
   private final iiIiiilIIliiil ilIilIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>().concat(IliIlllilIi<invokedynamic>()), true);
   private static final long iliilIlIIi = 250L;
   private final iiIiiilIIliiil IlillIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private int iIiIiIlIIi;
   private static volatile BooleanSupplier IlIliIlIIi;
   private static final int lliIiIlIIi = 40;
   static final int liIliIlIIi = 2;

   public static boolean ilIllIiIll(int hotbarSlot) {
      IIIIilIilIIIilIi var1 = liIlliiIll();
      return var1 != null && hotbarSlot >= 0 && hotbarSlot < ((-329346504 * -1171354717 * 3 << 25 | -329346504 * -1171354717 * 3 >>> 7) ^ -253885184) && var1.lIIliIlIIi[hotbarSlot];
   }

   private void liIIiiiIIi(long now) {
      IIlllilIllli var3 = this.lIIIiIlIIi;
      if (var3 != null) {
         class_1661 var4 = Iiiilllliiilll.field_1724.method_31548();
         long var5 = now - var3.IliIlllilIi();
         boolean var7 = ilIIiIlIIi.get(var3.lIiiIiIlilli()) > var3.IiIlliIliiIl();
         boolean var8 = ilIIiIlIIi.get(var3.iliIiiliiiii()) > var3.IIlllIlliIll();
         boolean var9 = llIIiIlIIi > var3.Illlllllilll();
         boolean var10 = var7 || var8 || var9;
         boolean var11 = var4.method_5438(var3.IilliliilIIi()).method_31574(class_1802.field_8288);
         if (var10 && var11) {
            this.iIlIiIllIi();
         } else if (var10 && var5 >= 60L) {
            this.IIlIilIlIi(now, var3, IliIlllilIi<invokedynamic>() + (var9 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + var5 + IliIlllilIi<invokedynamic>() + iliIiIiiIi(var3.IilliliilIIi()) + IliIlllilIi<invokedynamic>() + Illillllil(var4.method_5438(var3.IilliliilIIi())) + IliIlllilIi<invokedynamic>() + var3.iIlIlllllill() + IliIlllilIi<invokedynamic>() + Illillllil(var4.method_5438(var3.iIlIlllllill())) + IliIlllilIi<invokedynamic>() + IiIIiIlIIi);
            this.iIlIiIllIi();
         } else {
            if (var5 > 500L) {
               if (!var10) {
                  var4.method_5447(var3.iIlIlllllill(), var3.IIIllIIliIIl());
                  var4.method_5447(var3.IilliliilIIi(), var3.IlIlllIlilIl());
                  this.IIlIilIlIi(now, var3, IliIlllilIi<invokedynamic>() + var5 + IliIlllilIi<invokedynamic>() + IiIIiIlIIi);
               } else {
                  this.IIlIilIlIi(now, var3, IliIlllilIi<invokedynamic>() + var5 + IliIlllilIi<invokedynamic>() + iliIiIiiIi(var3.IilliliilIIi()) + IliIlllilIi<invokedynamic>() + Illillllil(var4.method_5438(var3.IilliliilIIi())) + IliIlllilIi<invokedynamic>() + IiIIiIlIIi);
               }

               this.iIlIiIllIi();
            }

         }
      }
   }

   private int IliIilliIi() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      int var2 = this.IIililIili();
      if (var1.method_5438(var2).method_31574(class_1802.field_8288) && !iiiIlIIIll(var2)) {
         return var2;
      } else {
         for(int var3 = 0; var3 < 9; ++var3) {
            if (var1.method_5438(var3).method_31574(class_1802.field_8288) && !iiiIlIIIll(var3)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private void iiIilIIlil() {
      this.liIilIlIIi = false;
      this.lIlilIlIIi = 0;
      this.IIlilIlIIi = 0;
      this.iIlilIlIIi = false;
      this.IllilIlIIi = false;
      this.lllilIlIIi = false;
      this.iiiilIlIIi = false;
      this.iIiilIlIIi = 0L;
      this.IliilIlIIi.lIiiIiIlilli();
      this.iililIlIIi = false;
      this.IIiilIlIIi = 0L;
      this.illilIlIIi = 0L;
      this.IililIlIIi = 0.0F;
      this.lililIlIIi = Integer.MIN_VALUE;
      this.iIlIiIllIi();
      this.lIiIiiIiIi();
      this.iIlIiIlIIi = -1L;
      this.liiIiIlIIi = -1;
      this.iiiIiIlIIi = null;
      this.IiiIiIlIIi = Integer.MIN_VALUE;
      Arrays.fill(this.lIIliIlIIi, false);
   }

   public static boolean lIIlliIIll() {
      return IilIiIlIIi;
   }

   private void IlIIillIIi(int syncId, int fromHandlerSlot, int button) {
      this.ilIIiIiIIi(syncId, fromHandlerSlot, button, button == (-(-297645078) * -83 ^ 1065262326) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
      if (this.IlIilIlIIi.Iilllilliill() && Iiiilllliiilll.method_1562() != null && !(Iiiilllliiilll.field_1755 instanceof class_465)) {
         Iiiilllliiilll.method_1562().method_52787(new class_2815(syncId));
      }

   }

   public static boolean iiiIlIIIll(int invSlot) {
      return invSlot == iIIIiIlIIi || invSlot == IlIIiIlIIi;
   }

   private void iIiilIliil(boolean fast) {
      if (this.iilIiIlIIi == null && Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.field_1724 != null) {
         if (this.iiIilIlIIi >= this.IliIiIlIIi && !this.IiIliliIli(System.currentTimeMillis())) {
            ilIllIiIll var3 = llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class);
            if (var3 instanceof IIiiIillIiiIil) {
               IIiiIillIiiIil var2 = (IIiiIillIiiIil)var3;
               if (var2.lliIIliliIIl()) {
                  return;
               }
            }

            if (lIlillliIlilll.IliIlllilIi(this)) {
               IiIlIillliIlIill var4 = new IiIlIillliIlIill(Iiiilllliiilll.field_1724, this);
               Iiiilllliiilll.method_1507(var4);
               if (Iiiilllliiilll.field_1755 != var4) {
                  lIlillliIlilll.liiiIIllIl(this);
               } else {
                  this.iilIiIlIIi = var4;
                  this.IIiIiIlIIi = this.iiIilIlIIi;
                  this.lIiIiIlIIi = this.iiIilIlIIi + (fast ? 1 : 2) + this.IiIilIlIIi.nextInt(2);
                  this.iIiIiIlIIi = -1;
               }
            }
         }
      }
   }

   private boolean lllIiillIi(long now) {
      long var6 = 1817037930741571785L;
      if (Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.method_1562() != null) {
         var6 ^= ((long)this.IliIilliIi() << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) == (~2117908801 ^ 21 ^ 2117908820)) {
            return false;
         } else if (this.IiiIiIlIIi == Iiiilllliiilll.field_1724.field_6012) {
            return false;
         } else {
            ilIllIiIll var5 = llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class);
            if (var5 instanceof IIiiIillIiiIil) {
               IIiiIillIiiIil var4 = (IIiiIillIiiIil)var5;
               if (var4.IliIlllilIi() && var4.iIiIIlIliIIl()) {
                  return false;
               }
            }

            this.lllIiIlIIi = Iiiilllliiilll.field_1724.method_31548().method_67532();
            this.illIiIlIIi = (int)(var6 >>> 32);
            this.IIlIiIlIIi = 1;
            this.lIlIiIlIIi = now;
            IilIiIlIIi = true;
            IIiIIIlilIiIIIli.IliIlllilIi((int)(var6 >>> 32));
            Iiiilllliiilll.method_1562().method_52787(new class_2846(class_2847.field_12969, class_2338.field_10980, class_2350.field_11033));
            return true;
         }
      } else {
         return false;
      }
   }

   private static String Illillllil(class_1799 stack) {
      return stack != null && !stack.method_7960() ? stack.method_7909().toString() + IliIlllilIi<invokedynamic>() + stack.method_7947() : IliIlllilIi<invokedynamic>();
   }

   private static String iliIiIiiIi(int invSlot) {
      return invSlot == (-(~-535071260 ^ 55 ^ 25) ^ -535071261) ? IliIlllilIi<invokedynamic>() : (invSlot < (-1090190944 * -1205604855 - -107 ^ -1752183038) ? IliIlllilIi<invokedynamic>() + (invSlot + 1) : IliIlllilIi<invokedynamic>() + invSlot);
   }

   public void IiIilliIil(IliIliIllliIliIl event) {
      if (!this.IliIlllilIi() && iIIliIlIIi != null) {
         this.IiIIlliIIl(event);
      }

   }

   private boolean illilIilil(int button, int now, long sourceSlot) {
      long var11 = 3622778434107295880L;
      long var13 = 6501741440429969016L;
      long var15 = -6572881088160351870L;
      if (this.lIIIiIlIIi != null) {
         return false;
      } else if (lIlIiIliIlIiIl.Illlllllilll() && now != ((-(--1554046846) << 21 | -(--1554046846) >>> 11) ^ 273968076)) {
         return false;
      } else if (this.IiIliliIli(sourceSlot)) {
         return false;
      } else {
         var11 ^= ((long)this.lililiilil() << 32 ^ var11) & -1L << 32;
         if ((int)(var11 >>> 32) != 0 && !this.IIiillIiil()) {
            return false;
         } else {
            var11 ^= ((long)(this.iIIilIlIIi.Iilllilliill() && !this.lIIilIlIIi.Iilllilliill() && !liiIIiIiiiiIIiIi.iIlllIllll() ? 1 : 0) ^ var11) & -1L >>> 32;
            var13 ^= ((long)Iiiilllliiilll.field_1724.field_7498.field_7763 << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)iIiliIlili(button) ^ var13) & -1L >>> 32;
            var15 ^= ((long)(now == (~(((-1107953513 << 13 | -1107953513 >>> 19) ^ -87) << 5 | ((-1107953513 << 13 | -1107953513 >>> 19) ^ -87) >>> 27) ^ -497091265) ? -(~-1958877341) ^ -91 ^ 1958877417 : now) << 32 ^ var15) & -1L << 32;
            this.iIiilIlIIi = sourceSlot + this.iiIliIIlli();
            this.liiIiIlIIi = (int)(var15 >>> 32);
            Runnable var10 = () -> {
               long var9 = 2560496525238906614L;
               if (this.IliIlllilIi() || iIIliIlIIi != null) {
                  if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1724.method_5805()) {
                     if (Iiiilllliiilll.field_1724.field_7512 == Iiiilllliiilll.field_1724.field_7498) {
                        if (Iiiilllliiilll.field_1724.field_7512.method_34255().method_7960()) {
                           if (this.lIIIiIlIIi == null) {
                              if (!this.IiIliliIli(System.currentTimeMillis())) {
                                 if (!Iiiilllliiilll.field_1724.method_31548().method_5438(syncId).method_31574(class_1802.field_8288)) {
                                    if (Iiiilllliiilll.field_1724.method_31548().method_5438(button).method_31574(class_1802.field_8288)) {
                                       if (!sourceSlot || Iiiilllliiilll.field_1755 instanceof class_490) {
                                          var9 ^= ((long)lIlillliIlilll.IilliliilIIi(this) << 32 ^ var9) & -1L << 32;
                                          if ((int)(var9 >>> 32) != 0 || lIlillliIlilll.IliIlllilIi(this)) {
                                             try {
                                                this.IlIIillIIi(buttonx, fromHandlerSlot, now);
                                             } finally {
                                                if ((int)(var9 >>> 32) == 0) {
                                                   lIlillliIlilll.liiiIIllIl(this);
                                                }

                                             }

                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            };
            this.iiiIiIlIIi = var10;
            lIlIiIliIlIiIl.iIlIlllllill(var10, (boolean)((int)var11));
            return true;
         }
      }
   }

   static boolean IIIillIIil(float ehp, float peak) {
      return ehp <= peak - 1.0F;
   }

   private static int liiIiiiiIi(int handlerSlot) {
      return handlerSlot >= (((1151585516 ^ 1) >>> 5 | (1151585516 ^ 1) << 27) - 23 ^ 1780817524) && handlerSlot <= (-1893200677 + -57 ^ 59 ^ -1893200715) ? handlerSlot - (-(--620546157) ^ -620546121) : (handlerSlot == ((-(--1968504129) + 41 << 7 | -(--1968504129) + 41 >>> 25) ^ 1434547304) ? ~(~2046002758 >>> 31 | ~2046002758 << 1) + 117 ^ -202961623 : handlerSlot);
   }

   private void ilIIiIiIIi(int fromHandlerSlot, int kind, int button, String syncId) {
      class_1703 var5 = Iiiilllliiilll.field_1724.field_7512;
      if (fromHandlerSlot == var5.field_7763 && Iiiilllliiilll.method_1562() != null) {
         int var6 = liiIiiiiIi(kind);
         int var7 = button == 40 ? 40 : button;
         int var8 = lIliliIlil(var7);
         class_1661 var9 = Iiiilllliiilll.field_1724.method_31548();
         class_1799 var10 = var9.method_5438(var6).method_7972();
         class_1799 var11 = var9.method_5438(var7).method_7972();
         int var12 = ilIIiIlIIi.get(kind);
         int var13 = ilIIiIlIIi.get(var8);
         ArrayList var14 = new ArrayList(var5.field_7761.size());

         for(class_1735 var16 : var5.field_7761) {
            var14.add(var16.method_7677().method_7972());
         }

         var5.method_7593(kind, button, class_1713.field_7791, Iiiilllliiilll.field_1724);
         class_10936.class_10937 var19 = Iiiilllliiilll.method_1562().method_68823();
         Int2ObjectOpenHashMap var20 = new Int2ObjectOpenHashMap();

         for(int var17 = 0; var17 < var14.size(); ++var17) {
            class_1799 var18 = ((class_1735)var5.field_7761.get(var17)).method_7677();
            if (!class_1799.method_7973((class_1799)var14.get(var17), var18)) {
               var20.put(var17, class_10938.method_68853(var18, var19));
            }
         }

         var20.put(kind, class_10938.method_68853((class_1799)var14.get(kind), var19));
         Iiiilllliiilll.method_1562().method_52787(new class_2813(fromHandlerSlot, var5.method_37421(), (short)kind, (byte)button, class_1713.field_7791, var20, class_10938.method_68853(var5.method_34255(), var19)));
         this.lIIIiIlIIi = new IIlllilIllli(System.currentTimeMillis(), syncId, var6, var7, kind, var8, var10, var11, var12, var13, llIIiIlIIi);
         this.iIlIiIlIIi = this.lIIIiIlIIi.IliIlllilIi();
         iIIIiIlIIi = var6;
         IlIIiIlIIi = var7;
         if (var7 == 40) {
            this.iililIlIIi = true;
            this.IIiilIlIIi = this.lIIIiIlIIi.IliIlllilIi();
         }

      }
   }

   static int Ilillllill(boolean reserveGate, BooleanSupplier leased, BooleanSupplier restockGate) {
      if (reserveGate && leased != null && !leased.getAsBoolean()) {
         return restockGate != null && restockGate.getAsBoolean() ? 1 : 0;
      } else {
         return 2;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) << 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) >>> 14) >>> 4 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) << 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) >>> 14) << 12) >>> 6 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) << 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) >>> 14) >>> 4 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) << 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) >>> 9 | (char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) << 12 | (char)(var4[var5] >>> 10 | var4[var5] << 6) >>> 4) - var5) << 7) - var5) << 15))) + var5) - 15278) >>> 14) << 12) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Illlilllli(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }

   }

   static int ilillIiill(boolean urgent, boolean noHotbar, boolean rapid) {
      if (!urgent && !noHotbar) {
         return rapid ? 1 : 2;
      } else {
         return 0;
      }
   }

   public static synchronized void lllllillll(Object owner) {
      if (owner != null && iIIliIlIIi == owner) {
         iIIliIlIIi = null;
         IlIliIlIIi = null;
         llIliIlIIi = null;
         ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class);
         if (var2 instanceof IIIIilIilIIIilIi) {
            IIIIilIilIIIilIi var1 = (IIIIilIilIIIilIi)var2;
            if (!var1.IliIlllilIi()) {
               lIlIiIliIlIiIl.Iiilliiliiil(var1.iiiIiIlIIi);
               var1.iiIilIIlil();
               lIlillliIlilll.liiiIIllIl(var1);
            }
         }

      }
   }

   public void Illillliilli() {
      this.iiIilIIlil();
   }

   private boolean llIliilIli() {
      if (!this.IllilIlIIi) {
         return false;
      } else {
         this.IllilIlIIi = false;
         this.IliilIlIIi.iIlIlllllill(this.iiIilIlIIi - this.IIlilIlIIi);
         return true;
      }
   }

   public static void iilllIIill(Object ticks, int owner) {
      if (Iillllilll(ticks)) {
         ilIllIiIll var3 = llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class);
         if (var3 instanceof IIIIilIilIIIilIi) {
            IIIIilIilIIIilIi var2 = (IIIIilIilIIIilIi)var3;
            var2.lililIlIIi = var2.iiIilIlIIi + Math.max(0, owner);
         }
      }
   }

   private int IIIlilIIli() {
      return !this.IiillIlIIi.Iilllilliill() ? 1 : Math.max(1, (this.liillIlIIi.Iilllilliill() + 49) / 50);
   }

   private static IIIIilIilIIIilIi liIlliiIll() {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class);
      IIIIilIilIIIilIi var10000;
      if (var1 instanceof IIIIilIilIIIilIi var0) {
         if (var0.IliIlllilIi() || iIIliIlIIi != null) {
            var10000 = var0;
            return var10000;
         }
      }

      var10000 = null;
      return var10000;
   }

   private void iiiilIIIIi() {
      IiIlIillliIlIill var1 = this.iilIiIlIIi;
      this.lIIIiiIIIi();
      if (var1 != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == var1 && Iiiilllliiilll.field_1724.field_7512.method_34255().method_7960()) {
         Iiiilllliiilll.field_1724.method_7346();
      }

   }

   private long iiIliIIlli() {
      return (long)this.IIIilIlIIi.Iilllilliill() * (3068753110374931836L ^ 3068753110374931790L);
   }

   private int IIililIili() {
      return this.ilillIlIIi.Iilllilliill() - 1;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) << 12) >>> 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) << 12) << 12))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) << 12) >>> 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) << 6 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) >>> 6 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + 19895))) ^ 211))) << 10) >>> 10) ^ 18367) ^ var5) << 12) << 12))) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iilililiiili() {
      if (iIIliIlIIi == null) {
         lIlIiIliIlIiIl.Iiilliiliiil(this.iiiIiIlIIi);
      }

      this.iiIilIIlil();
      this.iiiilIIIIi();
      lIlillliIlilll.liiiIIllIl(this);
   }

   private void lIiIiiIiIi() {
      if (this.IIlIiIlIIi == (~(-2072366011 * -755159085 ^ -37) ^ -494747654) && this.lllIiIlIIi >= 0 && this.lllIiIlIIi != this.illIiIlIIi && Iiiilllliiilll.field_1724 != null) {
         IIiIIIlilIiIIIli.IliIlllilIi(this.lllIiIlIIi);
      }

      this.IIlIiIlIIi = 0;
      IilIiIlIIi = false;
      this.lllIiIlIIi = -1;
      this.illIiIlIIi = -1;
   }

   private void iilIiIIiIi(long now, boolean ok) {
      long var5 = -3014735076672664051L;
      this.lIiIiiIiIi();
      if (ok) {
         this.iIiilIlIIi = now + this.iiIliIIlli();
      } else {
         var5 ^= ((long)this.lilliiilli() << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) != ((~-716517931 >>> 13 | ~-716517931 << 19) ^ 1856940630) && !Iiiilllliiilll.field_1724.method_31548().method_5438(~((-61749902 << 13 | -61749902 >>> 19) * -1857283155) ^ -954343019).method_31574(class_1802.field_8288)) {
            this.illilIilil((int)(var5 >>> 32), ((~-1278473311 >>> 13 | ~-1278473311 << 19) + 21) * 125 ^ -1873169204, now);
         }

      }
   }

   private int iIIliIlIli() {
      return !this.IiillIlIIi.Iilllilliill() ? 1 : Math.max(this.IIIlilIIli() + 4 - 1, (this.iiillIlIIi.Iilllilliill() + 25) / 50);
   }

   private boolean lililiilil() {
      return this.IlillIlIIi.Iilllilliill() && iIIliIlIIi == null && Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1724.method_56992();
   }

   public static int IlIllllIll() {
      long var2 = -4525764448527474977L;
      IIIIilIilIIIilIi var0 = liIlliiIll();
      if (var0 != null && var0.llillIlIIi.Iilllilliill()) {
         var2 ^= ((long)var0.IIililIili() << 32 ^ var2) & -1L << 32;
         return (int)(var2 >>> 32) >= 0 && (int)(var2 >>> 32) < ((1776707750 - 45 ^ -77) + -71 + 91 ^ -1776707625) ? (int)(var2 >>> 32) : -1;
      } else {
         return -1;
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6015240269338885414L ^ Long.rotateLeft(7278069749294019199L, 19) ^ 4786921758685340876L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3867852145073883302L ^ Long.rotateLeft(2272050641229600789L, 1) ^ -1297206749917935009L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4503089453379948556L ^ Long.rotateLeft(-2619022890895838293L, 18) ^ -2070846522290082498L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5863773697839340047L ^ Long.rotateLeft(-6390515807451759492L, 29) ^ 3316394668706274961L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4779963877360431009L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8403486364298862131L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2779246586875481367L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4064539995980660047L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8846315886615904920L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1537000608151821487L;
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

   private void lliililiil() {
      if (this.iilIiIlIIi != null) {
         if (this.lIIIiIlIIi == null && !lIlIiIliIlIiIl.Illlllllilll() && !this.Iiiilliiil()) {
            if (this.iIiIiIlIIi < 0) {
               this.iIiIiIlIIi = this.iiIilIlIIi + 1 + this.IiIilIlIIi.nextInt(3);
            } else if (this.iiIilIlIIi >= this.iIiIiIlIIi) {
               this.iiiilIIIIi();
            }

         } else {
            this.iIiIiIlIIi = -1;
         }
      }
   }

   private void IilIililIi(long now) {
      if (this.IIlIiIlIIi == 1) {
         if (this.lllIiIlIIi >= 0 && this.lllIiIlIIi != this.illIiIlIIi) {
            IIiIIIlilIiIIIli.IliIlllilIi(this.lllIiIlIIi);
         }

         IilIiIlIIi = false;
         this.IIlIiIlIIi = 2;
      }

      if (Iiiilllliiilll.field_1724.method_31548().method_5438(40).method_31574(class_1802.field_8288)) {
         this.iilIiIIiIi(now, true);
      } else if (now - this.lIlIiIlIIi > 600L) {
         this.iilIiIIiIi(now, false);
      }

   }

   public static boolean Iillllilll(Object owner) {
      return owner != null && iIIliIlIIi == owner;
   }

   public void iIIilIlIil() {
      if (!this.IliIlllilIi() && iIIliIlIIi != null) {
         this.iIIIlIlIIl();
      }

   }

   private boolean IIiillIiil() {
      if (this.iilIiIlIIi == null) {
         if (Iiiilllliiilll.field_1755 instanceof class_490) {
            return true;
         } else {
            this.iIiilIliil(false);
            return false;
         }
      } else {
         return Iiiilllliiilll.field_1755 == this.iilIiIlIIi && this.iiIilIlIIi >= this.lIiIiIlIIi;
      }
   }

   private boolean IiIliliIli(long now) {
      if (Iiiilllliiilll.field_1724 != null && !Iiiilllliiilll.field_1724.method_7325()) {
         long var3 = this.IiiilIlIIi;
         long var5 = this.liiilIlIIi;
         return var3 > (-1773656945429253553L ^ -1773656945429253553L) && now - var3 < (7976372080919229004L ^ 7976372080919230352L) || var5 > (3033161687276331686L ^ 3033161687276331686L) && now - var5 < (-5616102385177538734L ^ -5616102385177538648L);
      } else {
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) << 4) ^ '읱') ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) << 4) ^ '읱') ^ var5) ^ var5) << 15) ^ var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) << 4) ^ '읱') ^ var5) ^ var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) >>> 1 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 2 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 14) - var5))) + var5) + '꒕'))) ^ var5) << 15) - var5) << 4) ^ '읱') ^ var5) ^ var5) << 15) ^ var5) << 5) + '\ud886') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   boolean lIilliIill() {
      return iIIliIlIIi != null && this.lililIlIIi != (~((-517141629 << 9 | -517141629 >>> 23) >>> 7 | (-517141629 << 9 | -517141629 >>> 23) << 25) ^ -78917136) && this.iiIilIlIIi <= this.lililIlIIi;
   }

   public static synchronized boolean iIlllIllll(Object owner, BooleanSupplier restockGate, BooleanSupplier reserveGate) {
      if (owner == null) {
         return false;
      } else {
         ilIllIiIll var4 = llilIllililIll.iliIiiliiiii(IIIIilIilIIIilIi.class);
         if (var4 instanceof IIIIilIilIIIilIi) {
            IIIIilIilIIIilIi var3 = (IIIIilIilIIIilIi)var4;
            if (ilIIlilIiIIlil.lIiiIiIlilli(var3)) {
               return false;
            } else {
               Object var5 = iIIliIlIIi;
               if (var5 != null && var5 != owner) {
                  return false;
               } else {
                  IlIliIlIIi = restockGate;
                  llIliIlIIi = reserveGate;
                  if (var5 == null) {
                     if (!var3.IliIlllilIi()) {
                        var3.iiIilIIlil();
                     }

                     iIIliIlIIi = owner;
                  }

                  return true;
               }
            }
         } else {
            return false;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + 23543) - 18831) ^ 27519) + var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + 23543) - 18831) ^ 27519) + var5) << 15) + var5) ^ var5) - var5) + var5))) ^ var5) ^ '\ue2ab') - var5) << 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + 23543) - 18831) ^ 27519) + var5) >>> 1 | (char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + 23543) - 18831) ^ 27519) + var5) << 15) + var5) ^ var5) - var5) + var5))) ^ var5) ^ '\ue2ab') - var5) >>> 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIiIllIi() {
      this.lIIIiIlIIi = null;
      iIIIiIlIIi = -1;
      IlIIiIlIIi = -1;
   }

   public void iIIIlIlIIl() {
      ++this.iiIilIlIIi;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (this.iilIiIlIIi != null && Iiiilllliiilll.field_1755 != this.iilIiIlIIi) {
            this.lIIIiiIIIi();
         }

         if (this.iilIiIlIIi != null && this.iiIilIlIIi - this.IIiIiIlIIi > 40) {
            this.IliIiIlIIi = this.iiIilIlIIi + 10;
            this.iiiilIIIIi();
         }

         if (Iiiilllliiilll.field_1724.field_7512 == Iiiilllliiilll.field_1724.field_7498 && Iiiilllliiilll.field_1724.field_7512.method_34255().method_7960()) {
            long var1 = System.currentTimeMillis();
            if (Iiiilllliiilll.field_1724.method_5805() && !(Iiiilllliiilll.field_1755 instanceof class_418)) {
               if (this.iiiilIlIIi) {
                  this.iiiilIlIIi = false;
                  this.IiiilIlIIi = var1;
               }

               for(int var3 = 0; var3 < 9; ++var3) {
                  class_1799 var4 = Iiiilllliiilll.field_1724.method_31548().method_5438(var3);
                  if (var4.method_31574(class_1802.field_8288)) {
                     this.lIIliIlIIi[var3] = true;
                  } else if (!var4.method_7960()) {
                     this.lIIliIlIIi[var3] = false;
                  }
               }

               this.liIIiiiIIi(var1);
               if (!lIlIiIliIlIiIl.Illlllllilll()) {
                  this.liiIiIlIIi = -1;
               }

               this.lliililiil();
               if (this.IIlIiIlIIi != 0) {
                  this.IilIililIi(var1);
               } else {
                  boolean var9 = Iiiilllliiilll.field_1724.method_31548().method_5438(40).method_31574(class_1802.field_8288);
                  boolean var10 = this.lllilIlIIi;
                  this.lllilIlIIi = var9;
                  if (var9) {
                     this.liIilIlIIi = false;
                     this.iililIlIIi = false;
                  } else if ((!this.iililIlIIi || var1 - this.IIiilIlIIi >= 400L) && this.liiIiIlIIi != 40) {
                     this.iililIlIIi = false;
                     if (this.liIilIlIIi) {
                        if (this.llIilIlIIi.Iilllilliill() && this.lIilliIill() && this.lIlilIlIIi > this.iiIilIlIIi) {
                           this.lIlilIlIIi = liilliiill(this.lIlilIlIIi, this.IIlilIlIIi, this.iiIilIlIIi, this.IliilIlIIi.liiiIIllIl());
                        }
                     } else {
                        this.liIilIlIIi = true;
                        boolean var5 = this.llIilIlIIi.Iilllilliill() && this.illilIlIIi > 0L && var1 - this.illilIlIIi < 600L;
                        boolean var6 = this.llIilIlIIi.Iilllilliill() && this.lIilliIill();
                        boolean var7 = this.ilIilIlIIi.Iilllilliill() && !this.lililiilil() && this.IliIilliIi() == -1;
                        this.illilIlIIi = var1;
                        this.IIlilIlIIi = this.iiIilIlIIi;
                        this.iIlilIlIIi = var10 && !Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8288);
                        this.IllilIlIIi = this.iIlilIlIIi;
                        this.IililIlIIi = Iiiilllliiilll.field_1724.method_6032() + Iiiilllliiilll.field_1724.method_6067();
                        int var8 = ilillIiill(var5, var6, var7);
                        if (var8 == 0) {
                           this.lIlilIlIIi = this.iiIilIlIIi + this.IliilIlIIi.liiiIIllIl();
                        } else if (var8 == 1) {
                           this.lIlilIlIIi = this.iiIilIlIIi;
                        } else {
                           this.lIlilIlIIi = this.iiIilIlIIi + this.IliilIlIIi.IliIlllilIi(this.IIIlilIIli(), this.iIIliIlIli());
                        }

                        if (this.lililiilil() && this.lilliiilli() != -1) {
                           this.iIiilIliil(var8 == 0);
                        }
                     }

                     if (this.iiIilIlIIi >= this.lIlilIlIIi || this.lIlliiIlli()) {
                        boolean var11 = this.ilIilIlIIi.Iilllilliill() && !this.lililiilil();
                        if (var11 && this.IliIilliIi() != -1 && this.iIlIiIlIIi > 0L && var1 - this.iIlIiIlIIi < 150L) {
                           return;
                        }

                        if (var11 && this.lllIiillIi(var1)) {
                           this.llIliilIli();
                           this.liIilIlIIi = false;
                           return;
                        }

                        int var13 = this.lilliiilli();
                        if (var13 != -1 && this.illilIilil(var13, 40, var1)) {
                           this.liIilIlIIi = false;
                           return;
                        }
                     }
                  }

                  int var12 = Ilillllill(iIIliIlIIi != null, IlIliIlIIi, llIliIlIIi);
                  if (var12 != 0) {
                     if (var1 >= this.iIiilIlIIi) {
                        if (this.llillIlIIi.Iilllilliill()) {
                           int var14 = this.IIililIili();
                           if (!Iiiilllliiilll.field_1724.method_31548().method_5438(var14).method_31574(class_1802.field_8288)) {
                              int var15 = this.illliIilli();
                              if (var15 != -1) {
                                 this.illilIilil(var15, var14, var1);
                                 return;
                              }
                           }

                           if (var12 != 2) {
                              return;
                           }

                           for(int var16 = 0; var16 < 9; ++var16) {
                              if (var16 != var14 && this.lIIliIlIIi[var16] && Iiiilllliiilll.field_1724.method_31548().method_5438(var16).method_7960()) {
                                 int var17 = this.illliIilli();
                                 if (var17 != -1) {
                                    this.illilIilil(var17, var16, var1);
                                    return;
                                 }
                              }
                           }
                        }

                     }
                  }
               }
            } else {
               this.iIlIiIllIi();
               this.iiiilIIIIi();
               if (this.IIlIiIlIIi != 0) {
                  this.lIiIiiIiIi();
               }

               this.liIilIlIIi = false;
               this.iililIlIIi = false;
               this.IllilIlIIi = false;
               this.lllilIlIIi = false;
               this.iiiilIlIIi = true;
            }
         }
      } else {
         this.liIilIlIIi = false;
         this.iilIiIlIIi = null;
         this.iIiIiIlIIi = -1;
         lIlillliIlilll.liiiIIllIl(this);
      }
   }

   private void IIlIilIlIi(long now, IIlllilIllli why, String p) {
      this.iililIlIIi = false;
      this.iIiilIlIIi = Math.max(this.iIiilIlIIi, now + (-4782576121354836938L ^ -4782576121354836832L));
   }

   public void llIililIil(IiIiIlIiliIiIlIi event) {
      if (!this.IliIlllilIi() && iIIliIlIIi != null) {
         this.llIIlilIIl(event);
      }

   }

   private boolean lIlliiIlli() {
      if (this.llIilIlIIi.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         float var1 = Iiiilllliiilll.field_1724.method_6032() + Iiiilllliiilll.field_1724.method_6067();
         if (var1 > this.IililIlIIi) {
            this.IililIlIIi = var1;
            return false;
         } else {
            return IIIillIIil(var1, this.IililIlIIi);
         }
      } else {
         return false;
      }
   }

   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      class_2596 var5 = event.iilIIiiIll;
      if (var5 instanceof class_2649 var2) {
         if (var2.comp_3837() == 0) {
            ++llIIiIlIIi;
            if (IlIIiIlIIi == -1) {
               this.liiilIlIIi = System.currentTimeMillis();
            }
         }
      } else if (event.iilIIiiIll instanceof class_2724) {
         this.IiiilIlIIi = System.currentTimeMillis();
      } else {
         var5 = event.iilIIiiIll;
         if (var5 instanceof class_2653) {
            class_2653 var3 = (class_2653)var5;
            int var9 = var3.method_11450();
            if (var3.method_11452() == 0) {
               if (var9 >= 0 && var9 < 46) {
                  ilIIiIlIIi.incrementAndGet(var9);
               }

               String var6 = var9 == 45 ? IliIlllilIi<invokedynamic>() : (var9 >= 36 && var9 <= 44 ? IliIlllilIi<invokedynamic>() + (var9 - 35) : IliIlllilIi<invokedynamic>() + var9);
               IiIIiIlIIi = IliIlllilIi<invokedynamic>() + var6 + IliIlllilIi<invokedynamic>() + Illillllil(var3.method_11449()) + IliIlllilIi<invokedynamic>();
            } else if (var3.method_11452() == -2) {
               int var12 = lIliliIlil(var9);
               if (var12 >= 0 && var12 < 46) {
                  ilIIiIlIIi.incrementAndGet(var12);
               }

               String var7 = var9 == 40 ? IliIlllilIi<invokedynamic>() : (var9 < 9 ? IliIlllilIi<invokedynamic>() + (var9 + 1) : IliIlllilIi<invokedynamic>() + var9);
               IiIIiIlIIi = IliIlllilIi<invokedynamic>() + var7 + IliIlllilIi<invokedynamic>() + Illillllil(var3.method_11449()) + IliIlllilIi<invokedynamic>();
            }
         } else {
            var5 = event.iilIIiiIll;
            if (var5 instanceof class_9835) {
               class_9835 var4 = (class_9835)var5;
               int var11 = var4.comp_2891();
               int var13 = lIliliIlil(var11);
               if (var13 >= 0 && var13 < 46) {
                  ilIIiIlIIi.incrementAndGet(var13);
               }

               if (var11 == 40 || var11 < 9) {
                  IiIIiIlIIi = IliIlllilIi<invokedynamic>() + (var11 == 40 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + (var11 + 1)) + IliIlllilIi<invokedynamic>() + Illillllil(var4.comp_2892()) + IliIlllilIi<invokedynamic>();
               }
            }
         }
      }

   }

   private static int lIliliIlil(int invSlot) {
      if (invSlot >= 0 && invSlot < (1570173636 * 5 + -107 ^ -739066528)) {
         return (-(~(2082846842 << 11 | 2082846842 >>> 21) ^ -5) ^ -767808449) + invSlot;
      } else {
         return invSlot == (~(1104897534 >>> 3 | 1104897534 << 29) ^ 935629672) ? (-605130655 - -9 ^ -67) * 128207979 * 41 ^ -270736056 : invSlot;
      }
   }

   private int lilliiilli() {
      int var1 = this.illliIilli();
      if (var1 != -1) {
         return var1;
      } else {
         class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
         int var3 = this.IIililIili();

         for(int var4 = 0; var4 < 9; ++var4) {
            if (var4 != var3 && var2.method_5438(var4).method_31574(class_1802.field_8288) && !iiiIlIIIll(var4)) {
               return var4;
            }
         }

         return var2.method_5438(var3).method_31574(class_1802.field_8288) && !iiiIlIIIll(var3) ? var3 : -1;
      }
   }

   private static int iIiliIlili(int inventorySlot) {
      return inventorySlot < (-((189740631 - 23 << 17 | 189740631 - 23 >>> 15) >>> 25 | (189740631 - 23 << 17 | 189740631 - 23 >>> 15) << 7) ^ -1074483005) ? (557057184 * 119 * 25 ^ -612253884) + inventorySlot : inventorySlot;
   }

   private void lIIIiiIIIi() {
      this.iilIiIlIIi = null;
      this.iIiIiIlIIi = -1;
      lIlillliIlilll.liiiIIllIl(this);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      long var5 = 7433384641850689053L;
      if (Iiiilllliiilll.field_1724 != null) {
         byte var10000;
         label39: {
            class_2596 var2 = event.lIiilIIIIi;
            if (!(var2 instanceof class_2824) && !(var2 instanceof class_2885) && !(var2 instanceof class_2886)) {
               label38: {
                  if (var2 instanceof class_2846) {
                     class_2846 var4 = (class_2846)var2;
                     if (var4.method_12363() != class_2847.field_12969) {
                        break label38;
                     }
                  }

                  var10000 = 0;
                  break label39;
               }
            }

            var10000 = 1;
         }

         var5 ^= ((long)var10000 << 32 ^ var5) & -1L << 32;
         if ((int)(var5 >>> 32) != 0) {
            this.IiiIiIlIIi = Iiiilllliiilll.field_1724.field_6012;
         }

      }
   }

   private int illliIilli() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for(int var2 = 9; var2 < 36; ++var2) {
         if (var1.method_5438(var2).method_31574(class_1802.field_8288)) {
            return var2;
         }
      }

      return -1;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) << 11 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) >>> 5) - var5))) << 2 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) << 11 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) >>> 5) - var5))) >>> 14) ^ 11788) + var5) << 2 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) << 11 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) >>> 5) - var5))) << 2 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) << 11 | (char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) << 8 | (char)((char)(var4[var5] + var5) ^ var5) >>> 8) ^ 1657))) >>> 5) - var5))) >>> 14) ^ 11788) + var5) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIIIilIilIIIilIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IliilIlIIi = new IIiIlilIiIli(this.IiIilIlIIi);
      this.IiiilIlIIi = -1L;
      this.liiilIlIIi = -1L;
      this.iIlIiIlIIi = -1L;
      this.lllIiIlIIi = -1;
      this.illIiIlIIi = -1;
      this.iIiIiIlIIi = -1;
      this.IliIiIlIIi = Integer.MIN_VALUE;
      this.IiiIiIlIIi = Integer.MIN_VALUE;
      this.liiIiIlIIi = -1;
      this.lIIliIlIIi = new boolean[9];
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlillIlIIi, this.llillIlIIi, this.ilillIlIIi, this.IiillIlIIi, this.liillIlIIi, this.iiillIlIIi, this.IIIilIlIIi, this.lIIilIlIIi, this.iIIilIlIIi, this.IlIilIlIIi, this.llIilIlIIi, this.ilIilIlIIi});
   }

   public static synchronized boolean IIllllIlll(Object owner, BooleanSupplier restockGate) {
      return iIlllIllll(owner, restockGate, (BooleanSupplier)null);
   }

   private boolean Iiiilliiil() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();
      if (!var1.method_5438(40).method_31574(class_1802.field_8288) && this.lilliiilli() != -1) {
         return true;
      } else if (this.llillIlIIi.Iilllilliill() && this.illliIilli() != -1) {
         if (!var1.method_5438(this.IIililIili()).method_31574(class_1802.field_8288)) {
            return true;
         } else {
            for(int var2 = 0; var2 < 9; ++var2) {
               if (this.lIIliIlIIi[var2] && var1.method_5438(var2).method_7960()) {
                  return true;
               }
            }

            return false;
         }
      } else {
         return false;
      }
   }

   static int liilliiill(int fast, int deadline, int popTick, int tickCount) {
      return Math.min(fast, Math.max(popTick, deadline + tickCount));
   }
}
