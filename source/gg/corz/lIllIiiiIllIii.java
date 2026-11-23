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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1304;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_490;
import net.minecraft.class_746;

public class lIllIiiiIllIii extends ilIllIiIll {
   private final iiIiiilIIliiil iilIiilIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private Object iliIiilIIl;
   private static final String iIlIiilIIl = "Toggle";
   private final iiIiiilIIliiil lIiIiilIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iilliIlIIiliIl lilIiilIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 150, 100, 500, 10);
   private final lliliIIiililiIIi illIiilIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iiIiiilIIliiil IilIiilIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final llliIIiilliIIi lliIiilIIl;
   private final iiIiiilIIliiil IIiIiilIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String IllIiilIIl = "On Key";
   private final IIIlIlIllIIlIlIl iIiIiilIIl;
   private final lllliliilllili IliIiilIIl;
   private static final class_1304[] lllIiilIIl;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 27094) >>> 9 | (char)((char)(var4[var5] ^ var5) + 27094) << 7) ^ var5) ^ '觭') - var5) ^ 2192) ^ '뤠') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 27094) >>> 9 | (char)((char)(var4[var5] ^ var5) + 27094) << 7) ^ var5) ^ '觭') - var5) ^ 2192) ^ '뤠') >>> 12) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 27094) >>> 9 | (char)((char)(var4[var5] ^ var5) + 27094) << 7) ^ var5) ^ '觭') - var5) ^ 2192) ^ '뤠') << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 27094) >>> 9 | (char)((char)(var4[var5] ^ var5) + 27094) << 7) ^ var5) ^ '觭') - var5) ^ 2192) ^ '뤠') >>> 12) ^ var5) << 7) ^ var5))) - '\udaf0') - 5368) - '굇'));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) << 4 | (char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) >>> 12) - var5) >>> 15 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) << 4 | (char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) >>> 12) - var5) << 1) ^ var5) >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) << 4 | (char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) >>> 12) - var5) >>> 15 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) << 4 | (char)(-((char)((char)((char)(var4[var5] - '辶') + '\uf634') - 2408))) >>> 12) - var5) << 1) ^ var5) << 6) - var5) ^ 'ꄿ') - var5))) - 21823));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll(List<lIliIlIiiIliIlIi> stack, class_1799 entries) {
      ilIlIiilIiIlIiil var3 = ilIlIiilIiIlIiil.iIlIlllllill(entries);
      if (var3 != null) {
         stack.add(IIllllIlll(-1, entries, var3, true, false));
      }

   }

   static {
      lllIiilIIl = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166, class_1304.field_6171};
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (Iiiilllliiilll.field_1687 != this.iliIiilIIl) {
            this.iliIiilIIl = Iiiilllliiilll.field_1687;
            this.lliIiilIIl.IliIlllilIi();
         }

         boolean var2 = this.IliIiilIIl.liiiIIllIl(Iiiilllliiilll);
         this.lliIiilIIl.iIlIlllllill((kind) -> iillilIiIIililIi.IIillIiliIil(var1, kind), this.IliIiilIIl.iIlIlllllill(), var1.method_23317(), var1.method_23318(), var1.method_23321());
         if (var2) {
            boolean var3 = IliIlllilIi<invokedynamic>().equals(this.illIiilIIl.Iilllilliill());
            boolean var4 = this.IliIiilIIl.IIlllIlliIll();
            if (!var3 || !var4 && this.IliIiilIIl.IIillIiliIil() <= 200) {
               if (iillilIiIIililIi.liiiIIllIl(Iiiilllliiilll, this) && iillilIiIIililIi.IiIlliIliiIl(var1) && var1.method_64271()) {
                  int var5 = this.IlIllllIll(var1);
                  if (var5 < 0) {
                     if (this.IliIiilIIl.IIIilIIiiIIi(Iiiilllliiilll) && var3) {
                        this.IIillIiliIil(false);
                     }

                  } else {
                     this.IliIiilIIl.Iiilliiliiil();
                     IlllIlilllllIlil var6 = this.IliIiilIIl.IiIlliIliiIl(var5, var1.method_31548().method_5438(var5));
                     if (var6 == IlllIlilllllIlil.llliIIiIil) {
                        this.IliIiilIIl.IlIillIiilIi(Iiiilllliiilll);
                        if (var3) {
                           this.IIillIiliIil(false);
                        }

                     } else if (var6 != IlllIlilllllIlil.IlliIIiIil) {
                        boolean var7 = Iiiilllliiilll.field_1755 instanceof class_490;
                        if (var3 || !this.IliIiilIIl.lIiiIiIlilli()) {
                           if (this.IilIiilIIl.Iilllilliill() && !var7) {
                              if (var3) {
                                 this.IliIiilIIl.Ililllililil(Iiiilllliiilll);
                              }

                           } else if (!var7 || this.IliIiilIIl.Illlllllilll()) {
                              boolean var8 = !var7 && var3 && !var1.method_5715() && iillilIiIIililIi.IlIlllIlilIl();
                              if (var7 || var8 || iillilIiIIililIi.Illlllllilll(var1)) {
                                 this.iIlllIllll(var1, var5, var8);
                              }
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
         this.IliIiilIIl.IliIlllilIi();
      }
   }

   public lIllIiiiIllIii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.iIiIiilIIl = new IIIlIlIllIIlIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), List.of(class_1802.field_8600, class_1802.field_8276, class_1802.field_8145, class_1802.field_8153, class_1802.field_8469, class_1802.field_8511, class_1802.field_8635));
      this.IliIiilIIl = new lllliliilllili(this);
      this.lliIiilIIl = new llliIIiilliIIi();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illIiilIIl, this.IilIiilIIl, this.lilIiilIIl, this.iilIiilIIl, this.IIiIiilIIl, this.lIiIiilIIl, this.iIiIiilIIl});
   }

   private void liIlliiIll(List<lIliIlIiiIliIlIi> entries, int slot, class_1799 best, boolean stack) {
      long var8 = -6993603519962789855L;
      if (!best.method_7960()) {
         var8 ^= ((long)(!iillilIiIIililIi.IIIilIIiiIIi(best) && !lllIIllillIIll.IliIlllilIi(slot) && !lllIIllillIIll.liiiIIllIl(slot) ? 0 : 1) << 32 ^ var8) & -1L << 32;
         var8 ^= ((long)((int)(var8 >>> 32) == 0 && this.iiiIlIIIll(best) ? 1 : 0) ^ var8) & -1L >>> 32;
         ilIlIiilIiIlIiil var7 = stack ? ilIlIiilIiIlIiil.iIlIlllllill(best) : null;
         if ((int)var8 != 0 || var7 != null) {
            entries.add(IIllllIlll(slot, best, var7, (boolean)((int)(var8 >>> 32)), (boolean)((int)var8)));
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 1676) >>> 6 | (char)(var4[var5] + 1676) << 10))) + var5) - var5) ^ var5) - 31228) + var5) ^ var5) + var5) - 2674))))) ^ var5) << 10 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 1676) >>> 6 | (char)(var4[var5] + 1676) << 10))) + var5) - var5) ^ var5) - 31228) + var5) ^ var5) + var5) - 2674))))) ^ var5) >>> 6) - var5) + '﹖') >>> 8 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 1676) >>> 6 | (char)(var4[var5] + 1676) << 10))) + var5) - var5) ^ var5) - 31228) + var5) ^ var5) + var5) - 2674))))) ^ var5) << 10 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 1676) >>> 6 | (char)(var4[var5] + 1676) << 10))) + var5) - var5) ^ var5) - 31228) + var5) ^ var5) + var5) - 2674))))) ^ var5) >>> 6) - var5) + '﹖') << 8) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      this.IliIiilIIl.IliIlllilIi();
      this.lliIiilIIl.IliIlllilIi();
      this.iliIiilIIl = null;
   }

   private void lIIlliIIll() {
      this.IliIiilIIl.IlIillIiilIi(Iiiilllliiilll);
      this.IIillIiliIil(false);
   }

   private static lIliIlIiiIliIlIi IIllllIlll(int stack, class_1799 slot, ilIlIiilIiIlIiil keep, boolean kind, boolean junk) {
      double var5 = iIliilIlIlliilIl.IilliliilIIi(slot);
      return keep == null ? new lIliIlIiiIliIlIi(stack, -1, (double)0.0F, kind, junk, var5) : new lIliIlIiiIliIlIi(stack, keep.ordinal(), iIliilIlIlliilIl.IliIlllilIi(slot, keep), kind, junk, var5, iIliilIlIlliilIl.liiiIIllIl(slot, keep), iIliilIlIlliilIl.iIlIlllllill(slot, false), iIliilIlIlliilIl.iIlIlllllill(slot, true));
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) >>> 3) + '韅') << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) >>> 3) + '韅') >>> 8) << 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) >>> 3) + '韅') << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) >>> 7 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) + var5) << 9) - var5))) - '\udd6b') + 30894) - '齜') << 9) ^ 'ﯯ'))) >>> 3) + '韅') >>> 8) >>> 3) ^ var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int IlIllllIll(class_746 p) {
      class_1661 var2 = p.method_31548();
      boolean var3 = this.iilIiilIIl.Iilllilliill();
      ArrayList var4 = new ArrayList(41);
      if (var3) {
         for(class_1304 var8 : lllIiilIIl) {
            this.ilIllIiIll(var4, p.method_6118(var8));
         }
      }

      for(int var9 = 0; var9 < 36; ++var9) {
         this.liIlliiIll(var4, var9, var2.method_5438(var9), var3);
      }

      for(int var11 : iiilIlIlIIIiIlIl.IliIlllilIi(var4, var3)) {
         class_1799 var12 = var2.method_5438(var11);
         if (!this.IliIiilIIl.IlIlllIlilIl(var11, var12) && !this.lliIiilIIl.IilliliilIIi(var12)) {
            return var11;
         }
      }

      return -1;
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      class_2596 var3 = event.lIiilIIIIi;
      if (var3 instanceof class_2824 var2) {
         if (Iiiilllliiilll.method_18854() && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
            this.IliIiilIIl.IilliliilIIi();
         }
      }

   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '걎') >>> 3 | (char)((char)(-((char)(var4[var5] + var5))) - '걎') << 13) >>> 11 | (char)((char)((char)(-((char)(var4[var5] + var5))) - '걎') >>> 3 | (char)((char)(-((char)(var4[var5] + var5))) - '걎') << 13) << 5))) ^ var5) - var5) ^ var5) << 15 | (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '걎') >>> 3 | (char)((char)(-((char)(var4[var5] + var5))) - '걎') << 13) >>> 11 | (char)((char)((char)(-((char)(var4[var5] + var5))) - '걎') >>> 3 | (char)((char)(-((char)(var4[var5] + var5))) - '걎') << 13) << 5))) ^ var5) - var5) ^ var5) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -888301959271755489L ^ Long.rotateLeft(2431595725445754008L, 7) ^ 3255146101031012181L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3768415048226735638L ^ Long.rotateLeft(502649692836415001L, 36) ^ 7972371754989576523L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 547067492439543452L ^ Long.rotateLeft(1415508007855026699L, 55) ^ 5552425931267267799L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -389510215096412291L ^ Long.rotateLeft(-7469751867302818201L, 16) ^ 141040448179246463L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1086285818383313374L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2121506184254055800L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -962320619808246030L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -9120804226882039396L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4941690556119022037L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9085337253885730249L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   public boolean iiiIlIIIll(class_1799 stack) {
      if (stack != null && !stack.method_7960() && !iillilIiIIililIi.IIIilIIiiIIi(stack)) {
         if (this.iIiIiilIIl.Iiilliiliiil(stack.method_7909())) {
            return true;
         } else if (this.IIiIiilIIl.Iilllilliill() && iillilIiIIililIi.IlIillIiilIi(stack)) {
            return true;
         } else {
            return this.lIiIiilIIl.Iilllilliill() && iillilIiIIililIi.IiIiliIiiiIi(stack);
         }
      } else {
         return false;
      }
   }

   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.IliIiilIIl.IlIillIiilIi(Iiiilllliiilll);
      }

      this.IliIiilIIl.IliIlllilIi();
      this.lliIiilIIl.IliIlllilIi();
      this.iliIiilIIl = null;
   }

   private void iIlllIllll(class_746 slot, int p, boolean mask) {
      class_1799 var4 = slot.method_31548().method_5438(p).method_7972();
      this.IliIiilIIl.IiIiliIiiiIi(() -> {
         long var7 = 684191868640223204L;
         if (this.IliIlllilIi() && iillilIiIIililIi.iIlIlllllill(Iiiilllliiilll, this)) {
            class_746 var3 = Iiiilllliiilll.field_1724;
            if (var3.method_64271() && iillilIiIIililIi.IiIlliIliiIl(var3)) {
               if (!lllIIllillIIll.liiiIIllIl(p) && !lllIIllillIIll.IliIlllilIi(p)) {
                  class_1799 var4x = var3.method_31548().method_5438(p);
                  if (iillilIiIIililIi.Iilllilliill(var4x, var4) && !iillilIiIIililIi.IIIilIIiiIIi(var4x)) {
                     if (lIlillliIlilll.IliIlllilIi(this)) {
                        try {
                           var7 ^= ((long)var3.field_7498.field_7763 << 32 ^ var7) & -1L << 32;
                           Iiiilllliiilll.field_1761.method_2906((int)(var7 >>> 32), iillilIiIIililIi.IliIlllilIi(p), 1, class_1713.field_7795, var3);
                           this.IliIiilIIl.IIlilIliiIli();
                           this.IliIiilIIl.IIIllIIliIIl(p, var4);
                           this.lliIiilIIl.liiiIIllIl(var4, iillilIiIIililIi.IIillIiliIil(var3, var4), this.IliIiilIIl.iIlIlllllill(), var3.method_23317(), var3.method_23318(), var3.method_23321());
                           iillilIiIIililIi.Ililllililil(Iiiilllliiilll, (int)(var7 >>> 32));
                        } finally {
                           lIlillliIlilll.liiiIIllIl(this);
                        }

                     }
                  }
               }
            }
         }
      }, mask, this.lilIiilIIl.Iilllilliill());
   }
}
