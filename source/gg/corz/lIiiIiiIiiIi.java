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
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public class lIiiIiiIiiIi extends ilIllIiIll {
   private final iilliIlIIiliIl lIIiIlIIliIIiIlIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 150, 100, 500, 10);
   private final iiIiiilIIliiil iiilIlIIlIIIiIlIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   static final String[] llilIlIIlililIlIIl;
   private final lliliIIiililiIIi IiilIlIIlliilIlIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final int iIilIlIIlIlilIlIIl = 100;
   private Object iiliIlIIlIIiiIlIIl;
   private final IiIliIiliIliIi llliIlIIlilliIlIIl;
   private final iiIiiilIIliiil IlIiIlIIlllIiIlIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final class_1799[] iIliIlIIlIlliIlIIl;
   private final lllliliilllili IIliIlIIllIliIlIIl;
   private int IiliIlIIlliliIlIIl;
   private final IIIlIlIllIIlIlIl ilIiIlIIlIiIiIlIIl;
   private static final String IIilIlIIllIilIlIIl = "On Key";
   private final lliliIIiililiIIi[] liIiIlIIliiIiIlIIl;
   private static final String lillIlIIliillIlIIl = "Toggle";

   private void iiiIlIIIll() {
      this.IIliIlIIllIliIlIIl.IliIlllilIi();
      Arrays.fill(this.iIliIlIIlIlliIlIIl, (Object)null);
      this.IiliIlIIlliliIlIIl = 0;
      this.iiliIlIIlIIiiIlIIl = null;
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (Iiiilllliiilll.field_1687 != this.iiliIlIIlIIiiIlIIl) {
            this.iiliIlIIlIIiiIlIIl = Iiiilllliiilll.field_1687;
            Arrays.fill(this.iIliIlIIlIlliIlIIl, (Object)null);
         }

         this.ilIllIiIll(var1);
         if (this.IIliIlIIllIliIlIIl.liiiIIllIl(Iiiilllliiilll)) {
            boolean var2 = IliIlllilIi<invokedynamic>().equals(this.IiilIlIIlliilIlIIl.Iilllilliill());
            boolean var3 = this.IIliIlIIllIliIlIIl.IIlllIlliIll();
            if (!var2 || !var3 && this.IIliIlIIllIliIlIIl.IIillIiliIil() <= 200) {
               if (var3) {
                  this.IiliIlIIlliliIlIIl = 100;
               }

               if (this.IiliIlIIlliliIlIIl > 0) {
                  --this.IiliIlIIlliliIlIIl;
               }

               if (iillilIiIIililIi.liiiIIllIl(Iiiilllliiilll, this)) {
                  this.llliIlIIlilliIlIIl.IIIilIIiiIIi(var1);
                  boolean var4 = iillilIiIIililIi.IiIlliIliiIl(var1) && (var2 || !this.IIliIlIIllIliIlIIl.lIiiIiIlilli());
                  illlIlilIillIlil var5 = IlIIlIlillIIlIli.liiiIIllIl(this.llliIlIIlilliIlIIl, var4);
                  if (var5 == null) {
                     if (this.IIliIlIIllIliIlIIl.IIIilIIiiIIi(Iiiilllliiilll) && var2) {
                        this.IIillIiliIil(false);
                     }

                  } else {
                     this.IIliIlIIllIliIlIIl.Iiilliiliiil();
                     IlllIlilllllIlil var6 = this.IIliIlIIllIliIlIIl.IiIlliIliiIl(IlIIlIlillIIlIli.IliIlllilIi(var5.IliIlllilIi(), var5.liiiIIllIl()), var1.method_31548().method_5438(var5.IliIlllilIi()));
                     if (var6 == IlllIlilllllIlil.llliIIiIil) {
                        this.IIliIlIIllIliIlIIl.IlIillIiilIi(Iiiilllliiilll);
                        if (var2) {
                           this.IIillIiliIil(false);
                        }

                     } else if (var6 != IlllIlilllllIlil.IlliIIiIil) {
                        boolean var7 = Iiiilllliiilll.field_1755 instanceof class_490;
                        if (this.iiilIlIIlIIIiIlIIl.Iilllilliill() && !var7 && !var5.iIlIlllllill()) {
                           if (var2 || this.IiliIlIIlliliIlIIl == 0 && !this.IIliIlIIllIliIlIIl.lIiiIiIlilli() && iillilIiIIililIi.Illlllllilll(var1)) {
                              this.IIliIlIIllIliIlIIl.Ililllililil(Iiiilllliiilll);
                           }

                        } else if (!var7 || this.IIliIlIIllIliIlIIl.Illlllllilll()) {
                           boolean var8 = IlIllllIll(var1.method_31548().method_5438(var5.IliIlllilIi()));
                           boolean var9 = var5.iIlIlllllill() && (!this.IIliIlIIllIliIlIIl.lIiiIiIlilli() || var8);
                           boolean var10 = !var7 && this.IlIiIlIIlllIiIlIIl.Iilllilliill() && (var9 || var2) && !var1.method_5715() && iillilIiIIililIi.IlIlllIlilIl();
                           if (var7 || var10 || iillilIiIIililIi.Illlllllilll(var1)) {
                              this.iIlllIllll(var1, var5, var10);
                           }
                        }
                     }
                  }
               }
            } else {
               this.lIIlliIIll();
            }
         }
      } else {
         this.IIliIlIIllIliIlIIl.IliIlllilIi();
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 1 | (char)((char)(~var4[var5]) ^ var5) << 15) + var5) << 14 | (char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 1 | (char)((char)(~var4[var5]) ^ var5) << 15) + var5) >>> 2) ^ 2561) ^ var5) - 12710) + '얲') + var5) + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IIilIiilIilIii IIllllIlll(int hotbar) {
      return IIilIiilIilIii.IilliliilIIi(this.liIiIlIIliiIiIlIIl[hotbar].Iilllilliill());
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) >>> 1) + var5) ^ var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) >>> 1) + var5) ^ var5) ^ var5))) << 11) << 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) >>> 1) + var5) ^ var5) ^ var5))) >>> 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) >>> 13 | (char)((char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) + '︂') << 8 | (char)((char)((char)(-var4[var5]) ^ var5) + '︂') >>> 8) << 8) << 3) - var5) + var5) >>> 1) + var5) ^ var5) ^ var5))) << 11) >>> 9) + var5) - var5) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) - var5) - var5) + '\uef2e') - var5)) - 26280) + var5) + var5))) >>> 12 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) - var5) - var5) + '\uef2e') - var5)) - 26280) + var5) + var5))) << 4) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 27490) << 11 | (char)(var4[var5] ^ 27490) >>> 5) ^ var5) ^ 27914))) + var5) ^ 11374) ^ '뗰') << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 27490) << 11 | (char)(var4[var5] ^ 27490) >>> 5) ^ var5) ^ 27914))) + var5) ^ 11374) ^ '뗰') >>> 7) - 19908) ^ 'אּ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean IlIllllIll(class_1799 s) {
      return s.method_31574(class_1802.field_8634) || s.method_31574(class_1802.field_49098);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      class_2596 var3 = event.lIiilIIIIi;
      if (var3 instanceof class_2824 var2) {
         if (Iiiilllliiilll.method_18854() && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
            this.IIliIlIIllIliIlIIl.IilliliilIIi();
         }
      }

   }

   static {
      String[] var10000 = new String[((-1700128077 - 95 ^ 53) >>> 3 | (-1700128077 - 95 ^ 53) << 29) ^ 861225797];
      var10000[0] = IliIlllilIi<invokedynamic>();
      var10000[1] = IliIlllilIi<invokedynamic>();
      var10000[2] = IliIlllilIi<invokedynamic>();
      var10000[3] = IliIlllilIi<invokedynamic>();
      var10000[4] = IliIlllilIi<invokedynamic>();
      var10000[5] = IliIlllilIi<invokedynamic>();
      var10000[-(-910636737 >>> 3 | -910636737 << 29) * -50529027 ^ 1365622899] = IliIlllilIi<invokedynamic>();
      var10000[-(-284346921 + -127) * 31 ^ 224823903] = IliIlllilIi<invokedynamic>();
      var10000[-(-1444223710 * -1601513229) - -65 ^ -1067462413] = IliIlllilIi<invokedynamic>();
      llilIlIIlililIlIIl = var10000;
   }

   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.IIliIlIIllIliIlIIl.IlIillIiilIi(Iiiilllliiilll);
      }

      this.iiiIlIIIll();
   }

   private void iIlllIllll(class_746 mask, illlIlilIillIlil move, boolean p) {
      long var8 = 329437828936233022L;
      var8 ^= ((long)move.IliIlllilIi() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)move.liiiIIllIl() ^ var8) & -1L >>> 32;
      class_1799 var6 = mask.method_31548().method_5438((int)(var8 >>> 32)).method_7972();
      class_1799 var7 = mask.method_31548().method_5438((int)var8).method_7972();
      this.IIliIlIIllIliIlIIl.IiIiliIiiiIi(() -> {
         if (this.IliIlllilIi() && iillilIiIIililIi.iIlIlllllill(Iiiilllliiilll, this)) {
            class_746 var5 = Iiiilllliiilll.field_1724;
            if (!lllIIllillIIll.liiiIIllIl(sourceSnapshot) && !lllIIllillIIll.liiiIIllIl(target) && !lllIIllillIIll.IliIlllilIi(target)) {
               class_1661 var6x = var5.method_31548();
               int var7x = var6x.method_67532();
               if (sourceSnapshot >= 9 || sourceSnapshot != var7x && !this.IIliIlIIllIliIlIIl.iliIiiliiiii(sourceSnapshot)) {
                  class_1799 var8 = var6x.method_5438(sourceSnapshot);
                  class_1799 var9 = var6x.method_5438(target);
                  if (iillilIiIIililIi.Iilllilliill(var8, var6) && iillilIiIIililIi.Iilllilliill(var9, var7)) {
                     if (!var8.method_31574(class_1802.field_8288) && !var9.method_31574(class_1802.field_8288)) {
                        if (target != var7x || var9.method_7960() || this.IIllllIlll(target).lIiiIiIlilli(var9)) {
                           if (lIlillliIlilll.IliIlllilIi(this)) {
                              try {
                                 int var10 = var5.field_7498.field_7763;
                                 Iiiilllliiilll.field_1761.method_2906(var10, iillilIiIIililIi.IliIlllilIi(sourceSnapshot), target, class_1713.field_7791, var5);
                                 this.IIliIlIIllIliIlIIl.IIlilIliiIli();
                                 this.IIliIlIIllIliIlIIl.IIIllIIliIIl(IlIIlIlillIIlIli.IliIlllilIi(sourceSnapshot, target), var6);
                                 iillilIiIIililIi.Ililllililil(Iiiilllliiilll, var10);
                              } finally {
                                 lIlillliIlilll.liiiIIllIl(this);
                              }

                              if (sourceSnapshot < 9 && var6x.method_5438(sourceSnapshot).method_7960()) {
                                 this.iIliIlIIlIlliIlIIl[sourceSnapshot] = null;
                              }

                           }
                        }
                     }
                  }
               }
            }
         }
      }, p, this.lIIiIlIIliIIiIlIIl.Iilllilliill());
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1459980547700018476L ^ Long.rotateLeft(3646839181078977859L, 43) ^ -5754934334868687011L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -33051143657315288L ^ Long.rotateLeft(5599794547911089465L, 9) ^ -6264692474300823581L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4367172516740470610L ^ Long.rotateLeft(-9112835401584179404L, 14) ^ 2285964031575850908L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6252402559085091300L ^ Long.rotateLeft(-4055554942058278678L, 56) ^ 6360680265159233526L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6826623060889657094L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7575400469665507947L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6465021892078396242L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7132258833621776343L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7987477271969296816L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 193806644260811006L;
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

   static boolean liIlliiIll(class_1799 b, class_1799 a) {
      return !b.method_7960() && !a.method_7960() && a.method_31574(b.method_7909()) ? Objects.equals(b.method_58694(class_9334.field_49651), a.method_58694(class_9334.field_49651)) : false;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 5843) - 10457) - var5) - var5) ^ '雧') - 'ꖈ') + 26991) ^ '쮠') - 'ꮃ') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 5843) - 10457) - var5) - var5) ^ '雧') - 'ꖈ') + 26991) ^ '쮠') - 'ꮃ') << 10))) - 19888) ^ '\udc00'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIiiIiiIiiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.ilIiIlIIlIiIiIlIIl = new IIIlIlIllIIlIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), List.of(class_1802.field_8634));
      this.liIiIlIIliiIiIlIIl = new lliliIIiililiIIi[9];
      this.IIliIlIIllIliIlIIl = new lllliliilllili(this);
      this.iIliIlIIlIlliIlIIl = new class_1799[9];
      this.llliIlIIlilliIlIIl = new IiIliIiliIliIi(this);
      String[] var1 = IIilIiilIilIii.iIlIlllllill();

      for(int var2 = 0; var2 < 9; ++var2) {
         this.liIiIlIIliiIiIlIIl[var2] = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>() + (var2 + 1), IliIlllilIi<invokedynamic>() + (var2 + 1) + IliIlllilIi<invokedynamic>(), llilIlIIlililIlIIl[var2], var1);
         this.liIiIlIIliiIiIlIIl[var2].iIlIlllllill(IliIlllilIi<invokedynamic>());
      }

      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IiilIlIIlliilIlIIl, this.iiilIlIIlIIIiIlIIl, this.lIIiIlIIliIIiIlIIl, this.IlIiIlIIlllIiIlIIl, this.ilIiIlIIlIiIiIlIIl});
      this.IlIlllIlilIl(this.liIiIlIIliiIiIlIIl);
   }

   private void ilIllIiIll(class_746 p) {
      boolean var2 = Iiiilllliiilll.field_1755 instanceof class_465 && !this.IIliIlIIllIliIlIIl.Iilllilliill();
      class_1661 var3 = p.method_31548();

      for(int var4 = 0; var4 < 9; ++var4) {
         class_1799 var5 = var3.method_5438(var4);
         if (!var5.method_7960()) {
            if (this.iIliIlIIlIlliIlIIl[var4] == null || !liIlliiIll(this.iIliIlIIlIlliIlIIl[var4], var5)) {
               this.iIliIlIIlIlliIlIIl[var4] = var5.method_46651(1);
            }
         } else if (var2) {
            this.iIliIlIIlIlliIlIIl[var4] = null;
         }
      }

   }

   private void lIIlliIIll() {
      this.IIliIlIIllIliIlIIl.IlIillIiilIi(Iiiilllliiilll);
      this.IIillIiliIil(false);
   }
}
