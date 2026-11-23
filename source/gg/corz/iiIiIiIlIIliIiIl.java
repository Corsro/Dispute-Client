package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1665;
import net.minecraft.class_1685;
import net.minecraft.class_1701;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_3481;
import net.minecraft.class_3486;
import net.minecraft.class_3610;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public class iiIiIiIlIIliIiIl extends ilIllIiIll {
   private static final int lllIlliIll = 80;
   private static final double IilIlliIll = (double)25.0F;
   private static final long illIlliIll = 100L;
   private final Set<Integer> lilIlliIll = new HashSet();
   private long iilIlliIll;

   private class_2338 IlIllllIll(class_1665 arrow) {
      class_243 var2 = arrow.method_73189();
      class_243 var3 = arrow.method_18798();

      for(int var4 = 1; var4 <= 80; ++var4) {
         class_243 var5 = var2;
         var2 = var2.method_1019(var3);
         var3 = this.ilIllIiIll(var5, var3);
         class_3965 var6 = this.liIlliiIll(var5, var2, arrow);
         if (var6.method_17783() != class_240.field_1333) {
            return this.IIllllIlll(var6);
         }

         if (var2.field_1351 < (double)(Iiiilllliiilll.field_1687.method_31607() - 2)) {
            break;
         }
      }

      return null;
   }

   protected void Illillliilli() {
      this.lilIlliIll.clear();
      this.iilIlliIll = 0L;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 4 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 12) ^ var5))))) - '\ude3d'))) - 26948) + var5) - var5) << 6 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 4 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 12) ^ var5))))) - '\ude3d'))) - 26948) + var5) - var5) >>> 10))) + var5) ^ 13719) - var5) - var5) - '胾') ^ 436));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiIiIiIlIIliIiIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         HashSet var1 = new HashSet();

         for(class_1297 var3 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var3 instanceof class_1665) {
               class_1665 var4 = (class_1665)var3;
               if (!(var4 instanceof class_1685) && var4.method_24921() == Iiiilllliiilll.field_1724) {
                  int var5 = var4.method_5628();
                  var1.add(var5);
                  if (!this.lilIlliIll.contains(var5) && this.iiiIlIIIll() && this.lIIlliIIll(var4)) {
                     class_2338 var6 = this.IlIllllIll(var4);
                     if (var6 != null) {
                        if (Iiiilllliiilll.field_1724.method_5707(class_243.method_24953(var6)) > (double)25.0F) {
                           this.lilIlliIll.add(var5);
                        } else if (this.iIlllIllll(var6) || var4.method_24828()) {
                           this.lilIlliIll.add(var5);
                        }
                     }
                  }
               }
            }
         }

         this.lilIlliIll.retainAll(var1);
      }
   }

   protected void Iilililiiili() {
      this.lilIlliIll.clear();
      this.iilIlliIll = 0L;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) << 9) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) << 9) >>> 11) - 2483) ^ var5) - 14456) ^ 325) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) << 9) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) ^ 'ꩿ') ^ '\uf237') << 10) << 9) >>> 11) - 2483) ^ var5) - 14456) ^ 325) >>> 13) + var5))) ^ '\uea7a')))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilillIiill(int hotbarSlot) {
      long var3 = -8404000899944457532L;
      if (hotbarSlot >= 0 && hotbarSlot <= (((845299348 - -67 >>> 3 | 845299348 - -67 << 29) << 19 | (845299348 - -67 >>> 3 | 845299348 - -67 << 29) >>> 13) ^ 1054290538)) {
         if (!Iiiilllliiilll.field_1724.method_31548().method_5438(hotbarSlot).method_31574(class_1802.field_8069)) {
            var3 ^= ((long)this.iIIilIlIil(class_1802.field_8069, (--1427116284 * 954437177 >>> 19 | --1427116284 * 954437177 << 13) * -1527099483 ^ 806057135, ~1622719757 * -95 ^ -460445674) << 32 ^ var3) & -1L << 32;
            if ((int)(var3 >>> 32) != (~(-(-579304155 ^ 27) * -799063683) ^ 1884304058)) {
               Iiiilllliiilll.field_1761.method_2906(Iiiilllliiilll.field_1724.field_7512.field_7763, (int)(var3 >>> 32), hotbarSlot, class_1713.field_7791, Iiiilllliiilll.field_1724);
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) >>> 2) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) >>> 2) << 5) ^ 7886)))))) >>> 6 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) >>> 2) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) << 15 | (char)((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) - 13406) + 21472) >>> 1) - var5) - var5) >>> 2) << 5) ^ 7886)))))) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean liilliiill(class_2338 railPos) {
      class_238 var2 = (new class_238(railPos)).method_1009(0.2, (double)1.0F, 0.2);

      for(class_1297 var4 : Iiiilllliiilll.field_1687.method_8335((class_1297)null, var2)) {
         if (var4 instanceof class_1701) {
            return true;
         }
      }

      return false;
   }

   private class_2338 IIllllIlll(class_3965 hit) {
      class_2338 var2 = hit.method_17777();
      if (this.lllllillll(var2)) {
         return var2;
      } else {
         class_2338 var3 = hit.method_17780() == class_2350.field_11036 ? var2.method_10084() : var2;
         if (this.Iillllilll(var3)) {
            return var3;
         } else {
            class_2338 var4 = var2.method_10084();
            if (this.Iillllilll(var4)) {
               return var4;
            } else {
               class_2338 var5 = var2.method_10074();
               return this.Iillllilll(var5) ? var5 : null;
            }
         }
      }
   }

   private int iIIilIlIil(class_1792 item, int startInclusive, int endExclusive) {
      for(int var4 = startInclusive; var4 < endExclusive; ++var4) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(var4).method_31574(item)) {
            return var4;
         }
      }

      return -1;
   }

   private boolean Iillllilll(class_2338 pos) {
      if (this.lllllillll(pos)) {
         return true;
      } else {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(pos);
         if (!this.iilllIIill(var2)) {
            return false;
         } else {
            class_2338 var3 = pos.method_10074();
            return Iiiilllliiilll.field_1687.method_8320(var3).method_26206(Iiiilllliiilll.field_1687, var3, class_2350.field_11036);
         }
      }
   }

   private boolean iIlllIllll(class_2338 placePos) {
      long var7 = 4625315733146751938L;
      long var9 = -4879544812018886337L;
      var7 ^= ((long)this.IIIillIIil(class_1802.field_8129) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)this.IIIillIIil(class_1802.field_8069) ^ var7) & -1L >>> 32;
      if ((int)(var7 >>> 32) != (2094101474 * -1047552999 ^ 107 ^ 263190150) && (int)var7 != (~((-1580474413 - 125 << 31 | -1580474413 - 125 >>> 1) - 85) ^ 1357246294)) {
         var9 ^= ((long)Iiiilllliiilll.field_1724.method_31548().method_67532() << 32 ^ var9) & -1L << 32;

         try {
            if (this.lllllillll(placePos) || this.lIilliIill(placePos, (int)(var7 >>> 32))) {
               if (this.liilliiill(placePos)) {
                  var9 ^= (1L ^ var9) & -1L >>> 32;
                  return (boolean)((int)var9);
               }

               if (System.currentTimeMillis() < this.iilIlliIll) {
                  var9 ^= (0L ^ var9) & -1L >>> 32;
                  return (boolean)((int)var9);
               }

               if (this.Ilillllill(placePos, (int)var7)) {
                  this.iilIlliIll = System.currentTimeMillis() + (-2681400694461910532L ^ -2681400694461910632L);
                  this.ilillIiill((int)var7);
               }

               var9 ^= ((long)this.liilliiill(placePos) ^ var9) & -1L >>> 32;
               return (boolean)((int)var9);
            }

            var9 ^= (0L ^ var9) & -1L >>> 32;
         } finally {
            Iiiilllliiilll.field_1724.method_31548().method_61496((int)(var9 >>> 32));
         }

         return (boolean)((int)var9);
      } else {
         return false;
      }
   }

   private int IIIillIIil(class_1792 item) {
      return this.iIIilIlIil(item, 0, (-22551351 << 3 | -22551351 >>> 29) * 750576809 ^ -623729106);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) << 10) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) << 10) << 14))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) << 10) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') << 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - '\ud89c') ^ var5) ^ var5) - var5))) ^ var5) ^ var5) ^ var5) - '탒') >>> 7) << 10) << 14))) << 15) - var5) ^ '꾗') + '\uea1f'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lIIlliIIll(class_1665 arrow) {
      return !arrow.method_24828() && arrow.method_18798().method_1027() > Double.longBitsToDouble(-1025968449351063225L ^ -3541744916302943638L);
   }

   private boolean iiiIlIIIll() {
      return this.IIIillIIil(class_1802.field_8129) != (-961675503 - -49 ^ 19 ^ -97 ^ 49 ^ -961675520) && this.IIIillIIil(class_1802.field_8069) != (--944022362 * -750576809 ^ -1260126615);
   }

   private boolean Ilillllill(class_2338 cartSlot, int railPos) {
      Iiiilllliiilll.field_1724.method_31548().method_61496(railPos);
      class_3965 var3 = new class_3965(new class_243((double)cartSlot.method_10263() + Double.longBitsToDouble(3051033865634344401L ^ 1564845988602080721L), (double)cartSlot.method_10264() + Double.longBitsToDouble(-6132695224748319735L ^ -7699051875490369734L), (double)cartSlot.method_10260() + Double.longBitsToDouble(-1212723332782588618L ^ -3401472751684649674L)), class_2350.field_11036, cartSlot, false);
      class_1269 var4 = Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var3);
      if (var4.method_23665()) {
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         return true;
      } else {
         return false;
      }
   }

   private class_3965 liIlliiIll(class_243 start, class_243 end, class_1297 entity) {
      return Iiiilllliiilll.field_1687.method_17742(new class_3959(start, end, class_3960.field_17558, class_242.field_1348, entity));
   }

   private class_243 ilIllIiIll(class_243 motion, class_243 pos) {
      class_3610 var3 = Iiiilllliiilll.field_1687.method_8320(class_2338.method_49638(motion)).method_26227();
      double var4 = var3.method_15767(class_3486.field_15517) ? Double.longBitsToDouble(-4048865246835901332L ^ -563871680484028577L) : Double.longBitsToDouble(4325898647369705705L ^ 281197839788355399L);
      return pos.method_1021(var4).method_1031((double)0.0F, Double.longBitsToDouble(7543186064632397358L ^ -2952287284834162764L), (double)0.0F);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 588885608855803057L ^ Long.rotateLeft(-2970659661012856117L, 59) ^ 7769109224501036402L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1888282366034211998L ^ Long.rotateLeft(-2765103659942411183L, 19) ^ -4908490308722120055L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6540808577941446576L ^ Long.rotateLeft(6195990287607641105L, 57) ^ -1692681498965887242L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3547849226175097374L ^ Long.rotateLeft(-6321732876637636265L, 48) ^ 7505391009227729961L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8545440231225526191L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3542146797476545107L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1286771763228394701L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8122832074639794726L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5825215253028428918L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6310089769663019136L;
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

   private boolean lIilliIill(class_2338 railSlot, int placePos) {
      Iiiilllliiilll.field_1724.method_31548().method_61496(placePos);
      class_2338 var3 = railSlot.method_10074();
      class_3965 var4 = new class_3965(new class_243((double)railSlot.method_10263() + Double.longBitsToDouble(5976876321262963329L ^ 7859380965503830657L), (double)railSlot.method_10264(), (double)railSlot.method_10260() + Double.longBitsToDouble(6403944908179944502L ^ 7439772822475158582L)), class_2350.field_11036, var3, false);
      class_1269 var5 = Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var4);
      if (var5.method_23665()) {
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         return true;
      } else {
         return this.lllllillll(railSlot);
      }
   }

   private boolean iilllIIill(class_2680 state) {
      if (state.method_45474()) {
         return true;
      } else if (state.method_26164(class_3481.field_29823)) {
         return true;
      } else if (state.method_26164(class_3481.field_44469)) {
         return true;
      } else {
         return state.method_27852(class_2246.field_10479) || state.method_27852(class_2246.field_10214) || state.method_27852(class_2246.field_10112) || state.method_27852(class_2246.field_10313) || state.method_27852(class_2246.field_10428) || state.method_27852(class_2246.field_10597) || state.method_27852(class_2246.field_10477);
      }
   }

   private boolean lllllillll(class_2338 pos) {
      return Iiiilllliiilll.field_1687.method_8320(pos).method_26164(class_3481.field_15463);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 'ꂪ') ^ var5) ^ var5) >>> 6 | (char)((char)((char)(var4[var5] - 'ꂪ') ^ var5) ^ var5) << 10) - '룄') ^ var5) + var5)) + 31495) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 'ꂪ') ^ var5) ^ var5) >>> 6 | (char)((char)((char)(var4[var5] - 'ꂪ') ^ var5) ^ var5) << 10) - '룄') ^ var5) + var5)) + 31495) >>> 8))) ^ var5))))) - var5) ^ 27736));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
