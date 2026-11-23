package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2741;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import org.joml.Matrix4f;

public class lllIlIilillIlIil extends ilIllIiIll {
   private static final int iiliiiIIil = 6;
   private final iiIiiilIIliiil IIliiiIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int iIIIIIlIil = 40;
   private boolean lIlIIIlIil;
   private static final int lliiiiIIil = 4;
   private static final int lIiiiiIIil = 1;
   private final iiIiiilIIliiil liIiiiIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl iIliiiIIil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 100, -64, 320);
   private static final double IiliiiIIil = (double)2.0F;
   private static final int IlIIIIlIil = 10;
   private List<IiIIliiliIIlii> iiIIIIlIil = List.of();
   private final Long2ObjectOpenHashMap<Illlliilllllliil> llIIIIlIil = new Long2ObjectOpenHashMap();
   private static final int iliiiiIIil = 5;
   private static final long liiiiiIIil = 12000L;
   private final LongOpenHashSet IiIIIIlIil = new LongOpenHashSet();
   private final iIIlIIIiIlIlIIIi ilIIIIlIil = new iIIlIIIiIlIlIIIi();
   private static final int iiiiiiIIil = 400;
   private final iiIiiilIIliiil lIliiiIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IIIIIIlIil = 3;
   private final iiIiiilIIliiil IiIiiiIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int liliiiIIil = 16;
   private static final int lIIIIIlIil = 200;
   private static final int IIiiiiIIil = 0;
   private static final int iIiiiiIIil = 2;
   private final iilliIlIIiliIl llIiiiIIil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 1, 10);
   private final iilliIlIIiliIl IlliiiIIil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 90, 0, 255);
   private static final int IiiiiiIIil = 6;
   private List<IiIiIIlliIiIIl> liIIIIlIil = List.of();
   private final iiIiiilIIliiil iiIiiiIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final double illiiiIIil = (double)6.0F;
   private int IIlIIIlIil;
   private final iiIiiilIIliiil ilIiiiIIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IliiiiIIil = 3;
   private final lliliIIiililiIIi llliiiIIil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final int IlIiiiIIil = 5;
   private int iIlIIIlIil = -1;

   private static boolean Iillllilll(class_2826[] y, int lz, class_2680 st, int lx, int sections, int bottomY) {
      long var9 = -26037944413196832L;
      class_2248 var6 = lllllillll(y, lz, lx, sections + 1, bottomY);
      if (var6 != class_2246.field_9993 && var6 != class_2246.field_10463) {
         var9 ^= ((long)ilillIiill(y, lz, lx, sections, bottomY, -1, class_2246.field_9993, class_2246.field_10463) << 32 ^ var9) & -1L << 32;
         var9 ^= ((long)(st.method_27852(class_2246.field_9993) && st.method_28498(class_2741.field_12517) && (Integer)st.method_11654(class_2741.field_12517) == ((--377928548 * -23 >>> 3 | --377928548 * -23 << 29) * -1643291835 ^ 1582713433) ? 1 : 0) ^ var9) & -1L >>> 32;
         return (int)var9 != 0 && (int)(var9 >>> 32) >= (((1123728949 ^ 1) << 11 | (1123728949 ^ 1) >>> 21) ^ -705584609) || (int)(var9 >>> 32) >= ((-1831072948 * -1090785345 - -21 >>> 11 | -1831072948 * -1090785345 - -21 << 21) ^ 959416194);
      } else {
         return false;
      }
   }

   private static boolean iIlllIllll(class_2248 b) {
      return b == class_2246.field_27160 || b == class_2246.field_27161 || b == class_2246.field_27162 || b == class_2246.field_27163 || b == class_2246.field_27164;
   }

   private void ilIllIiIll(class_2818 chunk, long key) {
      Illlliilllllliil var4;
      try {
         var4 = this.liIlliiIll(chunk, chunk.method_12004());
      } catch (Throwable var6) {
         var4 = null;
      }

      Illlliilllllliil var5 = var4 != null ? (Illlliilllllliil)this.llIIIIlIil.put(key, var4) : (Illlliilllllliil)this.llIIIIlIil.remove(key);
      if (var5 == null) {
         if (var4 == null) {
            return;
         }
      } else if (var5.IliIlllilIi(var4)) {
         return;
      }

      this.lIlIIIlIil = true;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) >>> 12) << 7 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) >>> 12) >>> 9) - var5) ^ '퇿'))) ^ 1836))) >>> 14 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) >>> 12) << 7 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) << 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] ^ '뉄'))) - var5))) ^ var5) ^ var5) ^ 4596) >>> 12) >>> 9) - var5) ^ '퇿'))) ^ 1836))) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIllllIll() {
      this.llIIIIlIil.clear();
      this.ilIIIIlIil.liiiIIllIl();
      this.IiIIIIlIil.clear();
      this.liIIIIlIil = List.of();
      this.iiIIIIlIil = List.of();
      this.IIlIIIlIil = 0;
      this.lIlIIIlIil = false;
      this.iIlIIIlIil = -1;
   }

   public lllIlIilillIlIil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIiiiIIil, this.ilIiiiIIil, this.IiIiiiIIil, this.liIiiiIIil, this.iiIiiiIIil, this.IIliiiIIil, this.lIliiiIIil, this.iIliiiIIil, this.IlliiiIIil, this.llliiiIIil});
   }

   private static int IIllllIlll(class_2248 doKelp, boolean doBamboo, boolean doDrip, boolean doAme, boolean b, boolean doBerries, boolean doVines) {
      if (doBamboo && iIlllIllll(doKelp)) {
         return 1;
      } else if (!doDrip || doKelp != class_2246.field_9993 && doKelp != class_2246.field_10463) {
         if (doAme && doKelp == class_2246.field_10211) {
            return 3;
         } else if (b && doKelp == class_2246.field_16999) {
            return 4;
         } else if (doBerries && doKelp == class_2246.field_10597) {
            return 5;
         } else {
            return doVines && doKelp == class_2246.field_28048 ? ~(-1398928405 * -17) + 69 ^ 1988020953 : 0;
         }
      } else {
         return 2;
      }
   }

   private static boolean lIilliIill(class_2826[] y, int lx, int sections, int bottomY, int lz) {
      if (lllllillll(y, lx, sections, bottomY + 1, lz) == class_2246.field_10597) {
         return false;
      } else {
         return ilillIiill(y, lx, sections, bottomY, lz, -1, class_2246.field_10597, class_2246.field_10597) >= (717674175 * -125 - -103 ^ 485041443);
      }
   }

   private static boolean Ilillllill(class_2826[] lx, int lz, int sections, int bottomY, int y) {
      if (lllllillll(lx, lz, sections, bottomY + 1, y) != class_2246.field_28048 && lllllillll(lx, lz, sections, bottomY - 1, y) == class_2246.field_28048) {
         return ilillIiill(lx, lz, sections, bottomY, y, -1, class_2246.field_28048, class_2246.field_28048) >= (((-1996155985 ^ 91) + -63) * 107 ^ 1159675042);
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 12173) - 22943) << 1 | (char)((char)(var4[var5] + 12173) - 22943) >>> 15) + var5) ^ var5) + var5))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 12173) - 22943) << 1 | (char)((char)(var4[var5] + 12173) - 22943) >>> 15) + var5) ^ var5) + var5))) >>> 9) - var5) - 1779) + 19328));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int lIIlliIIll() {
      return this.llIiiiIIil.Iilllilliill() | (this.ilIiiiIIil.Iilllilliill() ? -(-785007644 >>> 31 | -785007644 << 1) ^ 1570015543 : 0) | (this.IiIiiiIIil.Iilllilliill() ? ~((1175151296 + -91) * 678152731 + -69) ^ -1192104035 : 0) | (this.liIiiiIIil.Iilllilliill() ? ~(1707322358 * 75) ^ 799841005 : 0) | (this.iiIiiiIIil.Iilllilliill() ? (1773636519 << 23 | 1773636519 >>> 9) * -858993459 + -51 + 93 ^ -1007619861 : 0) | (this.IIliiiIIil.Iilllilliill() ? (57496454 * -13 << 9 | 57496454 * -13 >>> 23) - 119 ^ -444304081 : 0) | (this.lIliiiIIil.Iilllilliill() ? (-1727103661 + 111) * -17 ^ 15 ^ -704018927 : 0);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) >>> 10) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) >>> 10) >>> 13))) + 14473) - '\uee78') ^ var5) ^ var5) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) >>> 10) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '싒') ^ var5) << 9 | (char)((char)(var4[var5] ^ '싒') ^ var5) >>> 7) ^ var5) + '餹') ^ 32515) >>> 10) >>> 13))) + 14473) - '\uee78') ^ var5) ^ var5) - var5) << 8) ^ var5))) + 22377) ^ 25865));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         List var2 = this.liIIIIlIil;
         if (!var2.isEmpty()) {
            Matrix4f var3 = iIiiIIilIliiIIil.IIillIiliIil();
            int var4 = IlIIilIlllIIilIl.lliiIlliIl & 16777215;
            double var5 = (double)this.iIliiiIIil.Iilllilliill();
            float var7 = iIiiIIilIliiIIil.Iiilliiliiil(var5);
            int var8 = IiIilliIil(this.IlliiiIIil.Iilllilliill()) << 24 | var4;
            int var9 = -939524096 | var4;
            int var10 = 0;

            for(int var11 = var2.size(); var10 < var11; ++var10) {
               IiIiIIlliIiIIl var12 = (IiIiIIlliIiIIl)var2.get(var10);
               double var13 = (double)(class_1923.method_8325(var12.llIliliIlilIliliIl) << 4);
               double var15 = (double)(class_1923.method_8332(var12.llIliliIlilIliliIl) << 4);
               if (!iIiiIIilIliiIIil.IlIillIiilIi(var13 + (double)8.0F, var5, var15 + (double)8.0F, 12.0F)) {
                  float var17 = iIiiIIilIliiIIil.Ililllililil(var13);
                  float var18 = iIiiIIilIliiIIil.IIIilIIiiIIi(var15);
                  float var19 = var17 + 16.0F;
                  float var20 = var18 + 16.0F;
                  iIiiIIilIliiIIil.Illillliilli(var3, var17, var7, var18, var17, var7, var20, var19, var7, var20, var19, var7, var18, var8);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var17, var7, var18, var19, var7, var18, var9, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var19, var7, var18, var19, var7, var20, var9, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var19, var7, var20, var17, var7, var20, var9, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var17, var7, var20, var17, var7, var18, var9, 2.0F);
               }
            }

            var10 = -234881024 | var4;
            List var22 = this.iiIIIIlIil;
            int var23 = 0;

            for(int var24 = var22.size(); var23 < var24; ++var23) {
               IiIIliiliIIlii var14 = (IiIIliiliIIlii)var22.get(var23);
               if (!iIiiIIilIliiIIil.IlIillIiilIi(var14.lliIiIiIIl, var5 + (double)3.0F, var14.iliIiIiIIl, 4.0F)) {
                  float var25 = iIiiIIilIliiIIil.Ililllililil(var14.lliIiIiIIl);
                  float var16 = iIiiIIilIliiIIil.IIIilIIiiIIi(var14.iliIiIiIIl);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var25, var7, var16, var25, var7 + 6.0F, var16, var10, 3.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var25 - 1.5F, var7 + 0.05F, var16, var25 + 1.5F, var7 + 0.05F, var16, var10, 2.0F);
                  iIiiIIilIliiIIil.Iliilliiilii(var3, var25, var7 + 0.05F, var16 - 1.5F, var25, var7 + 0.05F, var16 + 1.5F, var10, 2.0F);
               }
            }

            iIiiIIilIliiIIil.IiIiliIiiiIi();
         }
      }
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         try {
            int var1 = this.lIIlliIIll() ^ System.identityHashCode(Iiiilllliiilll.field_1687) << 14;
            if (var1 != this.iIlIIIlIil) {
               if (this.iIlIIIlIil != -1) {
                  this.llIIIIlIil.clear();
                  this.ilIIIIlIil.liiiIIllIl();
                  this.lIlIIIlIil = true;
               }

               this.iIlIIIlIil = var1;
            }

            class_1923 var2 = Iiiilllliiilll.field_1724.method_31476();
            int var3 = Math.min((Integer)Iiiilllliiilll.field_1690.method_42503().method_41753() + 1, 16);
            this.ilIIIIlIil.IIlllIlliIll(Iiiilllliiilll.field_1687, var2.field_9181, var2.field_9180, var3, 12000L, iIIlIIIiIlIlIIIi.IliIlllilIi(400), this::ilIllIiIll);
            ++this.IIlIIIlIil;
            if (this.IIlIIIlIil % 40 == 0) {
               int var4 = var3 + 2;
               ObjectIterator var5 = this.llIIIIlIil.long2ObjectEntrySet().fastIterator();

               while(var5.hasNext()) {
                  long var6 = ((Long2ObjectMap.Entry)var5.next()).getLongKey();
                  if (Math.abs(class_1923.method_8325(var6) - var2.field_9181) > var4 || Math.abs(class_1923.method_8332(var6) - var2.field_9180) > var4) {
                     var5.remove();
                     this.lIlIIIlIil = true;
                  }
               }

               this.ilIIIIlIil.IiIlliIliiIl(var2.field_9181, var2.field_9180, var4 + 2);
            }

            if (this.lIlIIIlIil && this.IIlIIIlIil % 10 == 0) {
               this.lIlIIIlIil = false;
               this.liilliiill();
            }
         } catch (Exception var8) {
         }

      }
   }

   private Illlliilllllliil liIlliiIll(class_2818 chunk, class_1923 cpos) {
      class_2826[] var3 = chunk.method_12006();
      int var4 = chunk.method_31607();
      boolean var5 = this.ilIiiiIIil.Iilllilliill();
      boolean var6 = this.IiIiiiIIil.Iilllilliill();
      boolean var7 = this.liIiiiIIil.Iilllilliill();
      boolean var8 = this.iiIiiiIIil.Iilllilliill();
      boolean var9 = this.IIliiiIIil.Iilllilliill();
      boolean var10 = this.lIliiiIIil.Iilllilliill();
      if (!var5 && !var6 && !var7 && !var8 && !var9 && !var10) {
         return null;
      } else {
         int var11 = 0;
         int var12 = 0;
         int var13 = 0;
         int var14 = 0;
         int var15 = 0;
         int var16 = 0;
         double var17 = (double)0.0F;
         double var19 = (double)0.0F;
         double var21 = (double)0.0F;
         class_2248 var23 = null;
         int var24 = 0;

         for(int var25 = 0; var25 < var3.length; ++var25) {
            class_2826 var26 = var3[var25];
            if (var26 != null && !var26.method_38292() && var26.method_19523((doVines) -> IIllllIlll(doVines.method_26204(), var5, var6, var7, var8, var9, var10) != 0)) {
               int var27 = var4 + (var25 << 4);

               for(int var28 = 0; var28 < 16; ++var28) {
                  for(int var29 = 0; var29 < 16; ++var29) {
                     for(int var30 = 0; var30 < 16; ++var30) {
                        class_2680 var31 = var26.method_12254(var30, var28, var29);
                        class_2248 var32 = var31.method_26204();
                        if (var32 != var23) {
                           var23 = var32;
                           var24 = IIllllIlll(var32, var5, var6, var7, var8, var9, var10);
                        }

                        if (var24 != 0) {
                           int var33 = var27 + var28;
                           double var34 = (double)0.0F;
                           switch (var24) {
                              case 1:
                                 if (var11 < 16) {
                                    ++var11;
                                    var34 = (double)6.0F;
                                 }
                                 break;
                              case 2:
                                 if (var12 < 6 && Iillllilll(var3, var4, var31, var30, var33, var29)) {
                                    ++var12;
                                    var34 = (double)2.0F;
                                 }
                                 break;
                              case 3:
                                 if (var13 < 6 && iilllIIill(var3, var4, var30, var33, var29)) {
                                    ++var13;
                                    var34 = (double)2.0F;
                                 }
                                 break;
                              case 4:
                                 if (var14 < 6 && var31.method_28498(class_2741.field_12497) && (Integer)var31.method_11654(class_2741.field_12497) == 3) {
                                    ++var14;
                                    var34 = (double)2.0F;
                                 }
                                 break;
                              case 5:
                                 if (var15 < 6 && lIilliIill(var3, var4, var30, var33, var29)) {
                                    ++var15;
                                    var34 = (double)2.0F;
                                 }
                                 break;
                              case 6:
                                 if (var16 < 6 && Ilillllill(var3, var4, var30, var33, var29)) {
                                    ++var16;
                                    var34 = (double)2.0F;
                                 }
                           }

                           if (var34 > (double)0.0F) {
                              var17 += var34;
                              var19 += ((double)((cpos.field_9181 << 4) + var30) + (double)0.5F) * var34;
                              var21 += ((double)((cpos.field_9180 << 4) + var29) + (double)0.5F) * var34;
                           }
                        }
                     }
                  }
               }
            }
         }

         double var36 = (double)var11 * (double)6.0F + (double)(var12 + var13 + var14 + var15 + var16) * (double)2.0F;
         if (var36 < (double)this.iiiIlIIIll()) {
            return null;
         } else {
            return new Illlliilllllliil(cpos.method_8324(), var36, var17, var19, var21);
         }
      }
   }

   private static int IiIilliIil(int v) {
      return Math.max(0, Math.min(-(~1841441979 - 19) ^ 27 ^ 1841441835, v));
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) + var5))) ^ '뙢'))) + var5) + var5) + 21025) + '\ue724'));
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
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) << 8) - '\uf34f') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) << 8) - '\uf34f') << 10))) + var5))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) << 8) - '\uf34f') >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') << 2 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 18650) - 26026) - '\udb9c'))) ^ '鸡') >>> 14) + '쯵'))) ^ var5)) - 18470) << 8) - '\uf34f') << 10))) + var5))) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private List<IiIIliiliIIlii> IIIillIIil(List<IiIiIIlliIiIIl> byKey, Map<Long, Illlliilllllliil> flagged) {
      byte var3 = 3;
      HashMap var4 = new HashMap();

      for(IiIiIIlliIiIIl var6 : byKey) {
         var4.put(var6.llIliliIlilIliliIl, var6);
      }

      ArrayList var17 = new ArrayList();
      HashSet var18 = new HashSet();

      for(IiIiIIlliIiIIl var8 : byKey) {
         if (var18.add(var8.llIliliIlilIliliIl)) {
            ArrayList var9 = new ArrayList();
            ArrayDeque var10 = new ArrayDeque();
            var10.add(var8);

            while(!var10.isEmpty()) {
               IiIiIIlliIiIIl var11 = (IiIiIIlliIiIIl)var10.poll();
               var9.add(var11);
               int var12 = class_1923.method_8325(var11.llIliliIlilIliliIl);
               int var13 = class_1923.method_8332(var11.llIliliIlilIliliIl);

               for(int var14 = -var3; var14 <= var3; ++var14) {
                  for(int var15 = -var3; var15 <= var3; ++var15) {
                     if (var14 != 0 || var15 != 0) {
                        IiIiIIlliIiIIl var16 = (IiIiIIlliIiIIl)var4.get(class_1923.method_8331(var12 + var14, var13 + var15));
                        if (var16 != null && var18.add(var16.llIliliIlilIliliIl)) {
                           var10.add(var16);
                        }
                     }
                  }
               }
            }

            var17.add(this.iIIilIlIil(var9, flagged));
         }
      }

      var17.sort(Comparator.comparingDouble((z) -> z.IiiIiIiIIl).reversed());
      return var17;
   }

   private void liilliiill() {
      int var1 = this.iiiIlIIIll();
      ArrayList var2 = new ArrayList();
      HashMap var3 = new HashMap();
      ObjectIterator var4 = this.llIIIIlIil.values().iterator();

      while(var4.hasNext()) {
         Illlliilllllliil var5 = (Illlliilllllliil)var4.next();
         if (!(var5.iIIlIiilil < (double)var1)) {
            var2.add(new IiIiIIlliIiIIl(var5.lIIlIiilil, var5.iIIlIiilil));
            var3.put(var5.lIIlIiilil, var5);
         }
      }

      this.liIIIIlIil = List.copyOf(var2);
      this.iiIIIIlIil = this.IIIillIIil(var2, var3);
      this.llIililIil();
   }

   private static boolean iilllIIill(class_2826[] y, int bottomY, int sections, int lz, int lx) {
      if (lllllillll(y, bottomY, sections, lz - 1, lx) == class_2246.field_10211) {
         return false;
      } else {
         return ilillIiill(y, bottomY, sections, lz, lx, 1, class_2246.field_10211, class_2246.field_10211) >= (-(-(-449385163)) ^ -449385159);
      }
   }

   private IiIIliiliIIlii iIIilIlIil(List<IiIiIIlliIiIIl> group, Map<Long, Illlliilllllliil> byKey) {
      HashSet var3 = new HashSet();
      double var4 = (double)0.0F;
      double var6 = (double)0.0F;
      double var8 = (double)0.0F;
      double var10 = (double)0.0F;
      double var12 = (double)0.0F;
      double var14 = (double)0.0F;

      for(IiIiIIlliIiIIl var17 : group) {
         var3.add(var17.llIliliIlilIliliIl);
         var4 += var17.IiIliliIlliIliliIl;
         Illlliilllllliil var18 = (Illlliilllllliil)byKey.get(var17.llIliliIlilIliliIl);
         if (var18 != null && var18.IlIlIiilil > (double)0.0F) {
            var6 += var18.IlIlIiilil;
            var8 += var18.llIlIiilil;
            var10 += var18.ilIlIiilil;
         }

         var12 += (double)(class_1923.method_8325(var17.llIliliIlilIliliIl) * 16 + 8) * var17.IiIliliIlliIliliIl;
         var14 += (double)(class_1923.method_8332(var17.llIliliIlilIliliIl) * 16 + 8) * var17.IiIliliIlliIliliIl;
      }

      double var20 = var6 > (double)0.0F ? var8 / var6 : var12 / var4;
      double var21 = var6 > (double)0.0F ? var10 / var6 : var14 / var4;
      return new IiIIliiliIIlii(Set.copyOf(var3), var20, var21, var4);
   }

   private void llIililIil() {
      if (Iiiilllliiilll.field_1724 != null) {
         for(IiIIliiliIIlii var2 : this.iiIIIIlIil) {
            boolean var3 = true;

            for(long var5 : var2.IliIiIiIIl) {
               if (this.IiIIIIlIil.contains(var5)) {
                  var3 = false;
                  break;
               }
            }

            for(long var10 : var2.IliIiIiIIl) {
               this.IiIIIIlIil.add(var10);
            }

            if (var3 && !this.llliiiIIil.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
               int var9 = (int)Math.round(var2.lliIiIiIIl);
               int var11 = (int)Math.round(var2.iliIiIiIIl);
               int var6 = (int)Math.hypot((double)var9 - Iiiilllliiilll.field_1724.method_23317(), (double)var11 - Iiiilllliiilll.field_1724.method_23321());
               String var7 = IliIlllilIi<invokedynamic>() + var6 + IliIlllilIi<invokedynamic>() + var9 + IliIlllilIi<invokedynamic>() + var11;
               if (this.llliiiIIil.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), var7, true);
               } else if (this.llliiiIIil.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
                  Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + var7), false);
               }
            }
         }

      }
   }

   private int iiiIlIIIll() {
      return this.llIiiiIIil.Iilllilliill() * 5;
   }

   protected void Illillliilli() {
      this.IlIllllIll();
   }

   private static int ilillIiill(class_2826[] bottomY, int sections, int a, int b, int step, int lx, class_2248 lz, class_2248 y) {
      int var8;
      for(var8 = 1; var8 < 40; ++var8) {
         b += lx;
         class_2248 var9 = lllllillll(bottomY, sections, a, b, step);
         if (var9 != lz && var9 != y) {
            break;
         }
      }

      return var8;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -521123856627376066L ^ Long.rotateLeft(-5132594348073012220L, 56) ^ -6414197223831991230L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3152783957285765011L ^ Long.rotateLeft(3875252929478241396L, 28) ^ -954233174701309296L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6930320996146874653L ^ Long.rotateLeft(-8636183871393829819L, 45) ^ 834488445223817289L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3853459313543346797L ^ Long.rotateLeft(303991140096466747L, 3) ^ -2061229756783595862L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8289659702343019405L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6328986111265355631L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5413245704392689264L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1789697729566812748L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4724054313218359085L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8026761370907212223L;
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

   private static class_2248 lllllillll(class_2826[] lx, int y, int bottomY, int sections, int lz) {
      long var7 = 2197749618314404252L;
      var7 ^= ((long)(sections - y >> 4) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) >= 0 && (int)(var7 >>> 32) < lx.length) {
         class_2826 var6 = lx[(int)(var7 >>> 32)];
         return var6 != null && !var6.method_38292() ? var6.method_12254(bottomY, sections & (~(575524362 + -89) ^ -575524287), lz).method_26204() : class_2246.field_10124;
      } else {
         return class_2246.field_10243;
      }
   }

   protected void Iilililiiili() {
      this.IlIllllIll();
   }
}
