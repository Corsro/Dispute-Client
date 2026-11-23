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
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2885;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_9334;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.lwjgl.glfw.GLFW;

public class iIIliIiIlIliIi extends ilIllIiIll implements liliIiliiliIil {
   private final iilliIlIIiliIl llllIiliiilllIilii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 10, 0, 60);
   private class_2338 ililIiliiIiilIilii;
   private int IlilIiliillilIilii;
   private int lIilIiliiiIilIilii;
   private final iilliIlIIiliIl IlIlIiliillIlIilii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 1, 9);
   private int lIliIiliiiIliIilii = Integer.MIN_VALUE;
   private final iilliIlIIiliIl iiiIIiliiIIIlIilii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 20);
   private int iIIiIiliiIlIiIilii;
   private final iilliIlIIiliIl iIllIiliiIlllIilii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 80, 0, 90);
   private static final int IillIiliilillIilii = 10;
   private final iiIlIiIiIIllIiIi IlliIiliillliIilii = new iiIlIiIiIIllIiIi();
   private final iiIiiilIIliiil ilIlIiliiIiIlIilii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int llIiIiliiilIiIilii = -1;
   private int IIIiIiliilIIiIilii;
   private final iiIiiilIIliiil IIllIiliilIllIilii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil liIlIiliiiiIlIilii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private long IiIiIiliiliIiIilii;
   private int liilIiliiiiilIilii = -1;
   private final iilliIlIIiliIl IiiIIiliiliiIIilii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 20);
   private boolean iiIiIiliiIIliIilii;
   private final iilliIlIIiliIl lIIlIiliiiIIlIilii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 20);
   private int iillIiliiIIilIilii;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) - '\uf42b') + '\ude16') >>> 10 | (char)((char)((char)((char)(var4[var5] ^ var5) + var5) - '\uf42b') + '\ude16') << 6) - var5) + var5) - '\ue983') ^ var5) - '막'))) ^ '벓') >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) - '\uf42b') + '\ude16') >>> 10 | (char)((char)((char)((char)(var4[var5] ^ var5) + var5) - '\uf42b') + '\ude16') << 6) - var5) + var5) - '\ue983') ^ var5) - '막'))) ^ '벓') << 4) - 'ꁴ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.method_18854()) {
         if (event.lIiilIIIIi instanceof class_2885 && !event.lIiiIiIlilli()) {
            iiilIiIIIiIi.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         }

      }
   }

   private void iIIilIlIil(String msg) {
      if (IliiliIllliiliIl.iiiIlIIIll()) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), msg, false);
      } else if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + msg), false);
      }

   }

   private void IIiillIiil(class_2338 pos, int charge) {
      this.ililIiliiIiilIilii = pos;
      this.liilIiliiiiilIilii = charge;
      this.IIIiIiliilIIiIilii = 0;
   }

   protected void IiIIlliIIl(IliIliIllliIliIl event) {
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) << 6 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) >>> 10) + '쁒') - 6393) ^ 11772) + var5) - var5) ^ '뻷') - var5))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) << 6 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) >>> 10) + '쁒') - 6393) ^ 11772) + var5) - var5) ^ '뻷') - var5))) >>> 6) - 'ﶪ'))) + 8852) >>> 9 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) << 6 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) >>> 10) + '쁒') - 6393) ^ 11772) + var5) - var5) ^ '뻷') - var5))) << 10 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) << 6 | (char)((char)((char)(-var4[var5]) << 6 | (char)(-var4[var5]) >>> 10)) >>> 10) + '쁒') - 6393) ^ 11772) + var5) - var5) ^ '뻷') - var5))) >>> 6) - 'ﶪ'))) + 8852) << 7) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIIliIiIlIliIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiiIIiliiliiIIilii, this.iiiIIiliiIIIlIilii, this.lIIlIiliiiIIlIilii, this.IlIlIiliillIlIilii, this.ilIlIiliiIiIlIilii, this.liIlIiliiiiIlIilii, this.IIllIiliilIllIilii, this.iIllIiliiIlllIilii, this.llllIiliiilllIilii});
   }

   public void Iilililiiili() {
      this.lliililiil();
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         this.lIliliIlil();
         this.lililiilil();
         if (!this.iIlllIllll()) {
            this.IlliIiliillliIilii.lIiiIiIlilli();
         }

         if (Iiiilllliiilll.field_1755 == null && !this.IIllllIlll() && this.iIlllIllll()) {
            this.Iillllilll();
         } else {
            this.iIiilIliil();
         }
      } else {
         this.iIiilIliil();
         this.illilIilil();
         this.iiIiIiliiIIliIilii = false;
      }
   }

   private boolean IiIilliIil(class_2338 pos) {
      int var2 = this.IlIlIiliillIlIilii.Iilllilliill() - 1;
      if (Iiiilllliiilll.field_1724.method_31548().method_67532() != var2) {
         if (this.iillIiliiIIilIilii < this.IiiIIiliiliiIIilii.Iilllilliill()) {
            ++this.iillIiliiIIilIilii;
            return false;
         }

         this.iillIiliiIIilIilii = 0;
         Iiiilllliiilll.field_1724.method_31548().method_61496(var2);
      }

      if (this.IlilIiliillilIilii < this.lIIlIiliiiIIlIilii.Iilllilliill()) {
         ++this.IlilIiliillilIilii;
         return false;
      } else {
         boolean var3 = Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801) || Iiiilllliiilll.field_1724.method_6079().method_31574(class_1802.field_8801);
         if (var3 && (Integer)Iiiilllliiilll.field_1687.method_8320(pos).method_11654(class_4969.field_23153) < 4) {
            return false;
         } else if (this.liilliiill(pos) && this.IIIillIIil(pos, IliIlllilIi<invokedynamic>())) {
            this.IlilIiliillilIilii = 0;
            return true;
         } else {
            return false;
         }
      }
   }

   private void illilIilil() {
      this.iIIiIiliiIlIiIilii = 0;
      this.llIiIiliiilIiIilii = -1;
   }

   private void iIiilIliil() {
      this.ililIiliiIiilIilii = null;
      this.liilIiliiiiilIilii = -1;
      this.IIIiIiliilIIiIilii = 0;
   }

   private boolean IIllllIlll() {
      long var3 = -3367846388713437523L;
      var3 ^= ((long)(!Iiiilllliiilll.field_1724.method_6047().method_7909().method_57347().method_57832(class_9334.field_50075) && !Iiiilllliiilll.field_1724.method_6079().method_7909().method_57347().method_57832(class_9334.field_50075) ? 0 : 1) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)(!(Iiiilllliiilll.field_1724.method_6047().method_7909() instanceof class_1819) && !(Iiiilllliiilll.field_1724.method_6079().method_7909() instanceof class_1819) ? 0 : 1) ^ var3) & -1L >>> 32;
      return ((int)(var3 >>> 32) != 0 || (int)var3 != 0) && this.iIlllIllll();
   }

   private void Iillllilll() {
      long var6 = 2773304980191578377L;
      long var8 = -2075488780393102615L;
      class_2338 var1 = this.lllllillll();
      if (var1 != null) {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(var1);
         Iiiilllliiilll.field_1690.field_1904.method_23481(false);
         if (this.lIilliIill(var1)) {
            this.iIiilIliil();
         } else {
            var6 ^= ((long)(Integer)var2.method_11654(class_4969.field_23153) << 32 ^ var6) & -1L << 32;
            var6 ^= ((long)iliilliIiiilli.lIiiIiIlilli(var1) ^ var6) & -1L >>> 32;
            if (this.ililIiliiIiilIilii != null) {
               var8 ^= ((long)((int)var6 == 0 && (this.liilIiliiiiilIilii <= 0 || (int)(var6 >>> 32) != this.liilIiliiiiilIilii) ? 0 : 1) << 32 ^ var8) & -1L << 32;
               if (this.ililIiliiIiilIilii.equals(var1) && (int)(var8 >>> 32) != 0 && this.IIIiIiliilIIiIilii < ((-357645155 << 27 | -357645155 >>> 5) * 109 * 29 ^ 910148238)) {
                  ++this.IIIiIiliilIIiIilii;
                  return;
               }

               this.iilllIIill(var1, (int)(var6 >>> 32), (boolean)((int)var6));
            }

            if ((int)var6 == 0) {
               if (!this.IlliIiliillliIilii.iIlIlllllill(var1)) {
                  if ((int)(var6 >>> 32) == 0) {
                     if (this.llIililIil(var1)) {
                        this.IIiillIiil(var1, (int)(var6 >>> 32));
                     }
                  } else {
                     if (this.Ilillllill(var1)) {
                        return;
                     }

                     if (this.IiIilliIil(var1)) {
                        this.IIiillIiil(var1, (int)(var6 >>> 32));
                        this.iiIiIiliiIIliIilii = true;
                        this.iiIilIIlil();
                     }
                  }

               }
            }
         }
      }
   }

   private void iilllIIill(class_2338 pending, int charge, boolean pos) {
      long var5 = 3244078513885863438L;
      if (this.ililIiliiIiilIilii.equals(pending) && this.liilIiliiiiilIilii == 0 && !pos) {
         if (charge > 0) {
            this.IlliIiliillliIilii.liiiIIllIl(pending);
         } else {
            var5 ^= ((long)this.IlliIiliillliIilii.IliIlllilIi(pending) << 32 ^ var5) & -1L << 32;
            if ((int)(var5 >>> 32) != 0) {
               this.iIIilIlIil(IliIlllilIi<invokedynamic>());
            }
         }
      } else if (pos) {
      }

      this.iIiilIliil();
   }

   public void Illillliilli() {
      this.lliililiil();
   }

   private class_2338 lllllillll() {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1755 == null) {
         if (this.iIlllIllll() && !this.IIllllIlll()) {
            class_239 var2 = Iiiilllliiilll.field_1765;
            if (var2 instanceof class_3965) {
               class_3965 var1 = (class_3965)var2;
               if (var1.method_17783() == class_240.field_1332) {
                  return Iiiilllliiilll.field_1687.method_8320(var1.method_17777()).method_27852(class_2246.field_23152) ? var1.method_17777() : null;
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private boolean IIIillIIil(class_2338 anchor, String what) {
      class_3965 var3 = this.ilillIiill(anchor);
      if (var3 == null) {
         return false;
      } else {
         Iiiilllliiilll.field_1761.method_2896(Iiiilllliiilll.field_1724, class_1268.field_5808, var3);
         this.lIliIiliiiIliIilii = Iiiilllliiilll.field_1724.field_6012;
         iiilIiIIIiIi.liiiIIllIl(IIllIIlilIllIIli.IlIlllIlilIl());
         return true;
      }
   }

   private void lliililiil() {
      this.iillIiliiIIilIilii = 0;
      this.lIilIiliiiIilIilii = 0;
      this.IlilIiliillilIilii = 0;
      this.iiIiIiliiIIliIilii = false;
      this.lIliIiliiiIliIilii = (879236028 + -123) * -1944890851 ^ 13 ^ -1077411760;
      this.IlliIiliillliIilii.lIiiIiIlilli();
      this.iIiilIliil();
      this.illilIilil();
   }

   private boolean iIlllIllll() {
      return GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 1) == ((-717854524 - -69 << 17 | -717854524 - -69 >>> 15) ^ -770463123);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) << 7) ^ 6806) - var5) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) << 7) ^ 6806) - var5) ^ var5) >>> 2) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) << 7) ^ 6806) - var5) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) >>> 5 | (char)((char)((char)((char)(var4[var5] ^ 10301) >>> 3 | (char)(var4[var5] ^ 10301) << 13) + 'Ꙭ') + var5) << 11))))))) + var5) + 'ﴀ') - var5) ^ var5) << 7) ^ 6806) - var5) ^ var5) >>> 2) << 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean Ilillllill(class_2338 pos) {
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class);
      boolean var10000;
      if (var2 instanceof IIiiIillIiiIil var3) {
         if (var3.IliIlllilIi() && var3.IIllllIlll(pos)) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   private void Illillllil() {
      if (this.IIllIiliilIllIilii.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         ilIiiIiIii.IliIlllilIi(this, Iiiilllliiilll.field_1724.method_36454(), (float)this.iIllIiliiIlllIilii.Iilllilliill(), (561734924 * 1332920885 * 1084587701 >>> 19 | 561734924 * 1332920885 * 1084587701 << 13) ^ 265655043, true);
      }
   }

   private void lililiilil() {
      if (this.iiIiIiliiIIliIilii && Iiiilllliiilll.field_1724 != null) {
         if (this.iIIiIiliiIlIiIilii == 0) {
            if (Iiiilllliiilll.field_1755 == null) {
               this.iiIiIiliiIIliIilii = false;
               if (this.ilIlIiliiIiIlIilii.Iilllilliill()) {
                  int var1 = IilIIililIIi.lIiiIiIlilli(class_1802.field_23141);
                  if (var1 != -1) {
                     Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
                  }

               }
            }
         }
      }
   }

   private void lIliliIlil() {
      if (this.iIIiIiliiIlIiIilii != 0) {
         if (Iiiilllliiilll.field_1755 == null) {
            int var1 = IilIIililIIi.lIiiIiIlilli(class_1802.field_8634);
            if (var1 == -1) {
               this.illilIilil();
            } else {
               Iiiilllliiilll.field_1690.field_1904.method_23481(false);
               switch (this.iIIiIiliiIlIiIilii) {
                  case 1:
                     Iiiilllliiilll.field_1724.method_31548().method_61496(var1);
                     this.Illillllil();
                     this.iIIiIiliiIlIiIilii = 2;
                     break;
                  case 2:
                     this.Illillllil();
                     float var2 = Iiiilllliiilll.field_1724.method_36455();
                     if (this.IIllIiliilIllIilii.Iilllilliill()) {
                        Iiiilllliiilll.field_1724.method_36457((float)this.iIllIiliiIlllIilii.Iilllilliill());
                     }

                     Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
                     Iiiilllliiilll.field_1724.method_36457(var2);
                     this.IiIiIiliiliIiIilii = System.currentTimeMillis();
                     this.iIIiIiliiIlIiIilii = 3;
                     break;
                  default:
                     if (this.llIiIiliiilIiIilii >= 0 && this.llIiIiliiilIiIilii <= 8) {
                        Iiiilllliiilll.field_1724.method_31548().method_61496(this.llIiIiliiilIiIilii);
                     }

                     this.illilIilil();
               }

            }
         }
      }
   }

   public void iiIilIIlil() {
      if (this.liIlIiliiiiIlIilii.Iilllilliill() && this.iIIiIiliiIlIiIilii == 0 && Iiiilllliiilll.field_1724 != null) {
         if (System.currentTimeMillis() - this.IiIiIiliiliIiIilii >= (long)this.llllIiliiilllIilii.Iilllilliill() * (8326654153185650933L ^ 8326654153185651485L)) {
            if (IilIIililIIi.lIiiIiIlilli(class_1802.field_8634) != (~(-1903513290 + 103) * -1057222719 + 57 ^ -293590556)) {
               this.llIiIiliiilIiIilii = Iiiilllliiilll.field_1724.method_31548().method_67532();
               this.iIIiIiliiIlIiIilii = 1;
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7623167551878092744L ^ Long.rotateLeft(4447618815233506299L, 43) ^ 7709576696568416299L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1961481760206526491L ^ Long.rotateLeft(-2866188746636303919L, 52) ^ -1125147245947224937L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7966395374701656522L ^ Long.rotateLeft(-3995922031930906413L, 48) ^ 3802936786022780629L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2405005434318283200L ^ Long.rotateLeft(5831595647607767362L, 1) ^ -5619226488049353670L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3250414194328956970L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8966925031773668500L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3755336434388145562L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 581373111305443696L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3765780735712641962L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7953960001189514641L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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

   public boolean IlIllllIll() {
      return this.lllllillll() != null || Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_6012 == this.lIliIiliiiIliIilii;
   }

   private boolean llIililIil(class_2338 pos) {
      long var3 = -3938792084808366953L;
      if (!Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801)) {
         if (this.iillIiliiIIilIilii < this.IiiIIiliiliiIIilii.Iilllilliill()) {
            ++this.iillIiliiIIilIilii;
            return false;
         }

         this.iillIiliiIIilIilii = 0;
         var3 ^= ((long)IilIIililIIi.lIiiIiIlilli(class_1802.field_8801) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) == (~(~(~879224939)) * -41 ^ -1688484173)) {
            return false;
         }

         Iiiilllliiilll.field_1724.method_31548().method_61496((int)(var3 >>> 32));
      }

      if (this.lIilIiliiiIilIilii < this.iiiIIiliiIIIlIilii.Iilllilliill()) {
         ++this.lIilIiliiiIilIilii;
         return false;
      } else if (Iiiilllliiilll.field_1724.method_6047().method_31574(class_1802.field_8801) && this.liilliiill(pos) && this.IIIillIIil(pos, IliIlllilIi<invokedynamic>())) {
         this.lIilIiliiiIilIilii = 0;
         return true;
      } else {
         return false;
      }
   }

   private boolean liilliiill(class_2338 anchor) {
      if (!iiilIiIIIiIi.IliIlllilIi(IIllIIlilIllIIli.IlIlllIlilIl())) {
         return false;
      } else {
         return !Iiiilllliiilll.field_1724.method_21823() || Iiiilllliiilll.field_1724.method_6047().method_7960() && Iiiilllliiilll.field_1724.method_6079().method_7960();
      }
   }

   private boolean lIilliIill(class_2338 pos) {
      ilIllIiIll var3 = llilIllililIll.iliIiiliiiii(IIiiIillIiiIil.class);
      boolean var10000;
      if (var3 instanceof IIiiIillIiiIil var2) {
         if (var2.liIlliiIll(pos)) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '\uf1e0') ^ '\ufbca') ^ var5) + var5) + var5))))) << 10 | (char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ '\uf1e0') ^ '\ufbca') ^ var5) + var5) + var5))))) >>> 6))))))) ^ '붊') ^ var5) - 29610) - 6410));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private class_3965 ilillIiill(class_2338 anchor) {
      class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
      double var3 = Math.min(Double.longBitsToDouble(4923464849450048572L ^ 306712281441868860L), Iiiilllliiilll.field_1724.method_55754());
      class_243 var5 = var2.method_1019(ilIiiIiIii.Iiilliiliiil(ilIiiIiIii.Iilllilliill(), ilIiiIiIii.IIillIiliIil()).method_1021(var3));
      class_3965 var6 = Iiiilllliiilll.field_1687.method_17742(new class_3959(var2, var5, class_3960.field_17559, class_242.field_1348, Iiiilllliiilll.field_1724));
      if (var6 != null && var6.method_17783() == class_240.field_1332 && var6.method_17777().equals(anchor)) {
         return var2.method_1025(var6.method_17784()) <= var3 * var3 ? var6 : null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') >>> 7) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') >>> 7) << 13) + var5) + var5) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') >>> 7) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) ^ '넔') - var5))) ^ var5))) + '폰') + 32534) + '듞') >>> 7) << 13) + var5) + var5) - var5) >>> 2) - var5) + '큺'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liIlliiIll() {
      return this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && this.iIlllIllll() && !this.IIllllIlll();
   }
}
