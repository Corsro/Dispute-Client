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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.OptionalLong;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_11908;
import net.minecraft.class_1661;
import net.minecraft.class_1703;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2561;
import net.minecraft.class_465;
import net.minecraft.class_490;
import net.minecraft.class_7923;
import net.minecraft.class_9290;
import net.minecraft.class_9334;

public class llllililllil extends ilIllIiIll {
   private final IIiiIIIllIiiIIIl lIIIliliiIIIlili;
   private final IIiiIIIllIiiIIIl lllIliliillIlili;
   private final iilliIlIIiliIl iIllIiliIlllIili;
   private final List<Ilililllllililll> IIlilililIlilili;
   private final IIiiIIIllIiiIIIl IiiiIililiiiIili;
   private final ililliIiIiilliIi iillIiliIIilIili;
   private static final int lliIiiliiliIiili = 60;
   private final lliliIIiililiIIi IiIiIililiIiIili;
   private static final class_1792[] iilIliliIIiIlili;
   private final IIiiIIIllIiiIIIl iiiiIiliIIIIlili;
   private final Set<Integer> lIllliliiIlllili;
   private int iliIliliIiiIlili;
   private static final int iIiIiiliIliIiili = 40;
   private final IIiiIIIllIiiIIIl IIlIlililIlIlili;
   private static final int lilIiiliiilIiili = 200;
   private int liiIliliiiiIlili;
   private static volatile boolean IllIiililllIiili;
   private final iilliIlIIiliIl IlilIilillilIili;
   private int iiilliliIIIilili;
   private final ililliIiIiilliIi IillIililillIili;
   private static volatile String llIIiiliilIIiili;
   private static final int lIIliiliiIIliili = 3;
   private final IIIlIlIllIIlIlIl ilIlIiliIiIlIili;
   private final List<class_1792> IIIllililIIllili;
   private int Iliilililliilili;
   private final IIiiIIIllIiiIIIl liIIliliiiIIlili;
   private final lliliIIiililiIIi iIiiIiliIliiIili;
   private static final int IiiIiililiiIiili = 80;
   private int lIiililiiIiilili;
   private class_1792 llIlliliilIllili;
   private int liIililiiiIilili;
   private final IIiiIIIllIiiIIIl lliiIiliiliiIili;
   private final IIiiIIIllIiiIIIl IlIIlilillIIlili;
   private int iIIlliliIlIllili;
   private final iilliIlIIiliIl ilIIliliIiIIlili;
   private final IIiiIIIllIiiIIIl liliIiliiiliIili;
   private final iiIiiilIIliiil liIlIiliiiIlIili;
   private int iiIlliliIIlllili;
   private final Map<class_1792, Integer> iIlililiIllilili;
   private final lliliIIiililiIIi IIllIililIllIili;
   private final iilliIlIIiliIl liilIiliiiilIili;
   private static volatile boolean iiIIiiliIIlIiili;
   private static final class_1792[] IilIlilililIlili;
   private final iilliIlIIiliIl llIiIiliilIiIili;
   private final iilliIlIIiliIl lIliIiliiIliIili;
   private long IlIililillIilili;
   private int iilililiIIiilili;
   private final iilliIlIIiliIl iIIiIiliIlIiIili;
   private int lIIililiiIIilili;
   private long lillliliiilllili;
   private final IIiiIIIllIiiIIIl iIlIliliIllIlili;
   private static final int IIiIiililIiIiili = 5;
   private final iilliIlIIiliIl IIIiIililIIiIili;
   private final IIiiIIIllIiiIIIl IIiiIililIiiIili;
   private static final int illIiiliIilIiili = 100;
   private final iilliIlIIiliIl iiIiIiliIIliIili;
   private long IIillililIillili;
   private static volatile String IiIIiililiIIiili;
   private class_1792 Iiillililiillili;
   private liiiIiIiiiiiIiIi illlliliIilllili;
   private int iIilliliIlillili;
   private long Iililililililili;
   private static volatile boolean lIlIiiliiIlIiili;
   private String liiililiiiiilili;
   private long lllililiillilili;
   private final iilliIlIIiliIl illiIiliIiliIili;
   private final iilliIlIIiliIl lIilIiliiIilIili;
   private final iilliIlIIiliIl IlliIilillliIili;
   private final iiIiiilIIliiil llllIiliilllIili;
   private int IliIlililliIlili;
   private int llilliliilillili;
   private int Illllililllllili;
   private final iilliIlIIiliIl ililIiliIiilIili;
   private static final int iiiIiiliIIIliili = 100;
   private Illiliilllilii lIiIliliiIiIlili;
   private int ilIililiIiIilili;
   private int iliililiIiiilili;
   private boolean IIIIiililIIIiili;
   private int IiIllililiIllili;
   private static volatile String iIIIiiliIlIIiili;

   private int IlIiillIii() {
      return this.IliIlililliIlili - this.iliIliliIiiIlili;
   }

   private boolean IIililIili(class_1792 it) {
      class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();

      for(int var3 = 0; var3 < 36; ++var3) {
         class_1799 var4 = var2.method_5438(var3);
         if (var4.method_7960()) {
            return true;
         }

         if (var4.method_31574(it) && var4.method_7947() < var4.method_7914()) {
            return true;
         }
      }

      return false;
   }

   private void IiIilliIil(String why) {
      if (this.illlliliIilllili != null) {
         this.lIllliliiIlllili.add(this.illlliliIilllili.IliIlllilIi());
      }

      this.illlliliIilllili = null;
      ++this.Illllililllllili;
      if (this.Illllililllllili >= ((2124831055 + 115 + -103) * -678152731 * -1736263375 ^ 1387542452)) {
         this.iiIilIIlil(IliIlllilIi<invokedynamic>());
      } else {
         if (this.iIIliIlIli()) {
            this.ilIiiIiIii(Illiliilllilii.IliilliIIl);
         } else {
            this.ilIiiIiIii(Illiliilllilii.iIiilliIIl);
         }

      }
   }

   private String iilIiIIiIi(class_1792 item) {
      String var2 = IIliilIlii(item);
      String var3 = this.iIiiIiliIliiIili.Iilllilliill();
      byte var4 = -1;
      switch (var3.hashCode()) {
         case -958549854:
            if (var3.equals(IliIlllilIi<invokedynamic>())) {
               var4 = 1;
            }
            break;
         case 2363:
            if (var3.equals(IliIlllilIi<invokedynamic>())) {
               var4 = 0;
            }
      }

      String var10000;
      switch (var4) {
         case 0 -> var10000 = var2;
         case 1 -> var10000 = (new class_1799(item)).method_7964().getString();
         default -> var10000 = var2.replace('_', ' ');
      }

      return var10000;
   }

   private int lIIiiiIIii() {
      return Math.max(20, this.illiIiliIiliIili.Iilllilliill() * 20);
   }

   private void Illillllil() {
      if (this.iiilliliIIIilili >= 0) {
         Iiiilllliiilll.field_1724.method_31548().method_61496(this.iiilliliIIIilili);
      }

      this.lIIililiiIIilili = 0;
      this.llilliliilillili = 0;
      this.liiIliliiiiIlili = this.IliIlililliIlili;
      this.ilIiiIiIii(Illiliilllilii.IIIIiliIIl);
   }

   private void ilillIiill() {
      if (!this.iIIliIlIli()) {
         this.ilIiiIiIii(Illiliilllilii.iIiilliIIl);
      } else if (this.IliIlililliIlili - this.liiIliliiiiIlili >= this.iiiliIIIii()) {
         int var1 = this.iiIliIIlli(this.liIIliliiiIIlili.Iilllilliill());
         if (var1 < 0) {
            if (this.lliliilili()) {
               this.lIIIiiIIIi();
               Iiiilllliiilll.field_1724.method_7346();
               this.lllllillll();
            } else {
               this.iiIilIIlil(IliIlllilIi<invokedynamic>());
            }

         } else {
            Iiiilllliiilll.field_1761.method_2906(Iiiilllliiilll.field_1724.field_7512.field_7763, var1, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
            this.liiIliliiiiIlili = this.IliIlililliIlili;
            ++this.iiIlliliIIlllili;
            this.ilIiiIiIii(Illiliilllilii.IliilliIIl);
         }
      }
   }

   private int iiiliIIIii() {
      return Math.max(2, this.IlliIilillliIili.Iilllilliill());
   }

   private void IlIIillIIi() {
      iIIIiiliIlIIiili = Iiliililii(this.IIlIlililIlIlili.Iilllilliill());
      llIIiiliilIIiili = Iiliililii(this.iIlIliliIllIlili.Iilllilliill());
      IiIIiililiIIiili = Iiliililii(this.lllIliliillIlili.Iilllilliill());
      iiIIiiliIIlIiili = false;
      lIlIiiliiIlIiili = false;
      IllIiililllIiili = false;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) >>> 3 | (char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) << 13) - 'ﰊ') >>> 6 | (char)((char)((char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) >>> 3 | (char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) << 13) - 'ﰊ') << 10) ^ '鵚') - var5) ^ 17046) - var5) + var5))) << 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) >>> 3 | (char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) << 13) - 'ﰊ') >>> 6 | (char)((char)((char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) >>> 3 | (char)((char)(var4[var5] + '面') >>> 8 | (char)(var4[var5] + '面') << 8) << 13) - 'ﰊ') << 10) ^ '鵚') - var5) ^ 17046) - var5) + var5))) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIiiiiIiii(String msg, String title, boolean good) {
      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(msg, title, good);
   }

   private boolean lliliilili() {
      return this.IIIIiililIIIiili || IliIlllilIi<invokedynamic>().equals(this.IIllIililIllIili.Iilllilliill());
   }

   private void Iiiilliiil() {
      lIlillliIlilll.liiiIIllIl(this);
      this.Iiillililiillili = null;
      this.iiilliliIIIilili = -1;
      this.lIIililiiIIilili = 0;
      this.Iillllilll();
   }

   private List<Ilililllllililll> IliIilliIi(class_1792 item) {
      ArrayList var2 = new ArrayList();
      if (!this.liiIiiiiIi()) {
         return var2;
      } else {
         class_1703 var3 = Iiiilllliiilll.field_1724.field_7512;
         int var4 = var3.field_7761.size() - 36;
         boolean var5 = IliIlllilIi<invokedynamic>().equals(this.IiIiIililiIiIili.Iilllilliill());

         for(int var6 = 0; var6 < var4; ++var6) {
            if (!this.lIllliliiIlllili.contains(var6)) {
               class_1799 var7 = var3.method_7611(var6).method_7677();
               if (!var7.method_7960() && var7.method_31574(item)) {
                  int var8 = Math.max(1, var7.method_7947());
                  OptionalLong var9 = iIIiiilIlIiiil.iIlIlllllill(iliIiIiiIi(var7), this.IiiiIililiiiIili.Iilllilliill());
                  if (!var9.isEmpty()) {
                     long var10 = var5 ? var9.getAsLong() * (long)var8 : var9.getAsLong();
                     var2.add(new Ilililllllililll(var6, var8, var10));
                  }
               }
            }
         }

         return var2;
      }
   }

   private void Ilillllill() {
      if (!this.IIIlilIIli()) {
         if (this.IlIiillIii() > 100) {
            if (this.lliliilili()) {
               this.lIIIiiIIIi();
               this.lllllillll();
            } else {
               this.iiIilIIlil(IliIlllilIi<invokedynamic>());
            }
         }

      } else {
         if (this.IiIllililiIllili < 0) {
            this.IiIllililiIllili = Iiiilllliiilll.field_1724.field_7512.field_7763;
         }

         if (this.IlIiillIii() >= 5) {
            List var1 = this.IliIilliIi(this.llIlliliilIllili);
            if (this.lliliilili()) {
               this.IIlilililIlilili.addAll(var1);
               if (this.IiIliliIli() && this.iiIlliliIIlllili + 1 < this.iiIiIiliIIliIili.Iilllilliill()) {
                  this.ilIiiIiIii(Illiliilllilii.lliilliIIl);
               } else {
                  this.lIIIiiIIIi();
                  Iiiilllliiilll.field_1724.method_7346();
                  this.lllllillll();
               }
            } else {
               long var2 = this.IIIiIililIIiIili.Iilllilliill() > 0 ? Math.max(1L, (long)this.IIIiIililIIiIili.Iilllilliill() - this.lllililiillilili) : 0L;
               lililIiiililIi var4 = iiliIlIlIIiiIlIl.IliIlllilIi(var1, this.iIlIiIllIi(var2));
               if (!var4.IliIlllilIi()) {
                  if (this.IiIliliIli() && this.iiIlliliIIlllili + 1 < this.iiIiIiliIIliIili.Iilllilliill()) {
                     this.ilIiiIiIii(Illiliilllilii.lliilliIIl);
                  } else {
                     this.lllIiillIi(var4);
                     this.iiIilIIlil(IliIlllilIi<invokedynamic>() + iIliiIllii(var4.iIlIlllllill()) + IliIlllilIi<invokedynamic>());
                  }
               } else {
                  this.illlliliIilllili = var4.liiiIIllIl();
                  this.lillliliiilllili = var4.iIlIlllllill();
                  this.IIillililIillili = this.illlliliIilllili.iliIiiliiiii();
                  this.ilIiiIiIii(Illiliilllilii.iliilliIIl);
               }
            }
         }
      }
   }

   private int illliIilli(class_1792 it) {
      if (Iiiilllliiilll.field_1724 == null) {
         return 0;
      } else {
         class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
         int var3 = 0;

         for(int var4 = 0; var4 <= 35; ++var4) {
            class_1799 var5 = var2.method_5438(var4);
            if (var5.method_31574(it)) {
               var3 += var5.method_7947();
            }
         }

         return var3;
      }
   }

   private boolean llIliilIli() {
      long var4 = 822594774348204016L;
      if (Iiiilllliiilll.field_1755 != null && this.liiIiiiiIi()) {
         String var1 = Iiliililii(this.IlIIlilillIIlili.Iilllilliill());
         if (!var1.isEmpty()) {
            String var2 = iIIiiilIlIiiil.IliIlllilIi(Iiiilllliiilll.field_1755.method_25440().getString()).toLowerCase(Locale.ROOT);
            if (var2.contains(var1)) {
               return true;
            }
         }

         var4 ^= ((long)(this.IIlIilIlIi(IilIlilililIlili) >= 0 ? 1 : 0) << 32 ^ var4) & -1L << 32;
         var4 ^= ((long)(this.IIlIilIlIi(class_1802.field_8879, class_1802.field_19058, class_1802.field_8077) >= 0 ? 1 : 0) ^ var4) & -1L >>> 32;
         return (int)(var4 >>> 32) != 0 && (int)var4 != 0;
      } else {
         return false;
      }
   }

   private static String liIiiiiIii(String s) {
      String var1 = s == null ? "" : s.trim();
      return var1.startsWith(IliIlllilIi<invokedynamic>()) ? var1.substring(1) : var1;
   }

   private static String IIliilIlii(class_1792 item) {
      return class_7923.field_41178.method_10221(item).method_12832();
   }

   private void iIiilIliil() {
      lIlIiiliiIlIiili = false;
      this.Iililililililili += this.IlIililillIilili;
      this.lIiililiiIiilili += this.ilIililiIiIilili;
      if (this.llllIiliilllIili.Iilllilliill()) {
         this.iiliiIIiii(IliIlllilIi<invokedynamic>() + this.ilIililiIiIilili + IliIlllilIi<invokedynamic>() + IIliilIlii(this.Iiillililiillili) + IliIlllilIi<invokedynamic>() + iIliiIllii(this.IlIililillIilili) + IliIlllilIi<invokedynamic>() + llliiillii(this.Iililililililili - this.lllililiillilili) + IliIlllilIi<invokedynamic>());
      }

      if (this.liiIiiiiIi()) {
         Iiiilllliiilll.field_1724.method_7346();
      }

      this.ilIiiIiIii(Illiliilllilii.iiiilliIIl);
   }

   private void Illlilllli(int glfwKey) {
      if (Iiiilllliiilll.field_1755 != null) {
         try {
            class_11908 var2 = new class_11908(glfwKey, 0, 0);
            Iiiilllliiilll.field_1755.method_25404(var2);
            Iiiilllliiilll.field_1755.method_16803(var2);
         } catch (Throwable var3) {
         }

      }
   }

   private boolean liiIiiiiIi() {
      return Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 instanceof class_465 && !(Iiiilllliiilll.field_1755 instanceof class_490) && Iiiilllliiilll.field_1724.field_7512 != null && Iiiilllliiilll.field_1724.field_7512 != Iiiilllliiilll.field_1724.field_7498;
   }

   private static String iIliiIllii(long coins) {
      return llIIilIiilIIilIi.liiiIIllIl(coins);
   }

   private int iiIliIIlli(String word) {
      if (word != null && !word.isEmpty() && this.liiIiiiiIi()) {
         String[] var2 = word.toLowerCase(Locale.ROOT).split(IliIlllilIi<invokedynamic>());
         class_1703 var3 = Iiiilllliiilll.field_1724.field_7512;
         int var4 = var3.field_7761.size() - 36;

         for(int var5 = 0; var5 < var4; ++var5) {
            class_1799 var6 = var3.method_7611(var5).method_7677();
            if (!var6.method_7960()) {
               String var7 = iIIiiilIlIiiil.IliIlllilIi(var6.method_7964().getString()).toLowerCase(Locale.ROOT);

               for(String var11 : var2) {
                  String var12 = var11.trim();
                  if (!var12.isEmpty() && var7.contains(var12)) {
                     return var5;
                  }
               }
            }
         }

         return -1;
      } else {
         return -1;
      }
   }

   private void lllIiillIi(lililIiiililIi res) {
      if (this.llllIiliilllIili.Iilllilliill() && this.llIlliliilIllili != null && res.lIiiIiIlilli() > 0) {
         long var2 = res.iIlIlllllill() * (long)Math.max(0, this.ililIiliIiilIili.Iilllilliill()) / 100L;
         long var4 = var2 * (100L - (long)Math.min(50, Math.max(0, this.IlilIilillilIili.Iilllilliill()))) / 100L;
         long var6 = var4 - res.IilliliilIIi();
         long var8 = (long)this.iIllIiliIlllIili.Iilllilliill();
         String var10 = IIliilIlii(this.llIlliliilIllili) + '|' + (var6 > 0L ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
         if (!var10.equals(this.liiililiiiiilili) || this.IliIlililliIlili - this.iliililiIiiilili >= 200) {
            this.liiililiiiiilili = var10;
            this.iliililiIiiilili = this.IliIlililliIlili;
            String var11 = var6 <= 0L ? IliIlllilIi<invokedynamic>() + iIliiIllii(var4) + IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + iIliiIllii(var6) + IliIlllilIi<invokedynamic>() + iIliiIllii(var8) + IliIlllilIi<invokedynamic>();
            this.iiliiIIiii(IliIlllilIi<invokedynamic>() + IIliilIlii(this.llIlliliilIllili) + IliIlllilIi<invokedynamic>() + res.lIiiIiIlilli() + IliIlllilIi<invokedynamic>() + iIliiIllii(res.iIlIlllllill()) + IliIlllilIi<invokedynamic>() + iIliiIllii(res.IilliliilIIi()) + IliIlllilIi<invokedynamic>() + var11);
         }
      }
   }

   public void Illillliilli() {
      this.IliIlililliIlili = 0;
      this.lllililiillilili = 0L;
      this.Iililililililili = 0L;
      this.iilililiIIiilili = 0;
      this.lIiililiiIiilili = 0;
      this.ilIllIiIll();
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.IlIllllIll();
         this.iIlllIllll();
      } else {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
         this.IIillIiliIil(false);
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3990231085608520895L ^ Long.rotateLeft(-6170030414368519774L, 48) ^ 6566100899972911629L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2296173710273222436L ^ Long.rotateLeft(-4495437762038837552L, 60) ^ 3505768898053828378L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6607825178955125929L ^ Long.rotateLeft(2781996430523697348L, 23) ^ 5070364374309807454L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6372862897526419169L ^ Long.rotateLeft(2955335815606613425L, 36) ^ 5001954934623925772L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5821258354217243424L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -797155239702031654L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 9125536751874235631L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8796781908320920817L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7836881524158297719L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5735911583097781284L;
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

   private static List<String> iliIiIiiIi(class_1799 st) {
      ArrayList var1 = new ArrayList();
      var1.add(st.method_7964().getString());
      class_9290 var2 = (class_9290)st.method_58694(class_9334.field_49632);
      if (var2 != null) {
         for(class_2561 var4 : var2.comp_2400()) {
            var1.add(var4.getString());
         }
      }

      return var1;
   }

   private boolean iIIliIlIli() {
      return this.IIIlilIIli() && Iiiilllliiilll.field_1724.field_7512.field_7763 == this.IiIllililiIllili;
   }

   private void iiliiIIiii(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }

   }

   private void ilIllIiIll() {
      this.lIiIliliiIiIlili = Illiliilllilii.lIiilliIIl;
      this.IIIllililIIllili.clear();
      this.iIlililiIllilili.clear();
      this.IIlilililIlilili.clear();
      this.lIllliliiIlllili.clear();
      this.iIIlliliIlIllili = -1;
      this.llIlliliilIllili = null;
      this.illlliliIilllili = null;
      this.Illllililllllili = 0;
      this.iiIlliliIIlllili = 0;
      this.IiIllililiIllili = -1;
      this.Iiillililiillili = null;
      this.iiilliliIIIilili = -1;
      this.lIIililiiIIilili = 0;
      this.llilliliilillili = 0;
      this.Iliilililliilili = 0;
      this.iliililiIiiilili = -((-585302805 ^ 99) * 654471207 ^ 43) ^ 250904077;
      this.liiililiiiiilili = "";
   }

   private static String Iiliililii(String s) {
      return s == null ? "" : s.toLowerCase(Locale.ROOT).trim();
   }

   private void liIlliiIll() {
      if (this.IliIlllilIi()) {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      } else if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.IIIIiililIIIiili = true;
         this.IIillIiliIil(true);
      } else {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      }
   }

   private void lIIIiiIIIi() {
      lililIiiililIi var1 = iiliIlIlIIiiIlIl.IliIlllilIi(this.IIlilililIlilili, this.iIlIiIllIi(0L));
      String var2 = IIliilIlii(this.llIlliliilIllili);
      if (var1.lIiiIiIlilli() == 0) {
         if (this.llllIiliilllIili.Iilllilliill()) {
            this.iiliiIIiii(IliIlllilIi<invokedynamic>() + var2 + IliIlllilIi<invokedynamic>());
         }

      } else {
         String var3 = var1.IliIlllilIi() ? IliIlllilIi<invokedynamic>() + var1.liiiIIllIl().liiiIIllIl() + IliIlllilIi<invokedynamic>() + iIliiIllii(var1.liiiIIllIl().iIlIlllllill()) + IliIlllilIi<invokedynamic>() + iIliiIllii(var1.liiiIIllIl().IlIlllIlilIl()) + IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + iIliiIllii(var1.IilliliilIIi()) + IliIlllilIi<invokedynamic>();
         if (this.llllIiliilllIili.Iilllilliill()) {
            this.iiliiIIiii(IliIlllilIi<invokedynamic>() + var2 + IliIlllilIi<invokedynamic>() + iIliiIllii(var1.iIlIlllllill()) + IliIlllilIi<invokedynamic>() + var1.lIiiIiIlilli() + IliIlllilIi<invokedynamic>() + var3 + IliIlllilIi<invokedynamic>());
         }

      }
   }

   private void IIllllIlll() {
      this.lllililiillilili = 0L;
      this.Iililililililili = 0L;
      this.iilililiIIiilili = 0;
      this.lIiililiiIiilili = 0;
      this.lIiiiiIiii(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   }

   private boolean liIIiiiIIi(boolean allowSlotFallback) {
      long var6 = -3406065721637555271L;
      long var8 = 6426496036968207016L;
      if (!this.liiIiiiiIi()) {
         return false;
      } else {
         class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
         var6 ^= ((long)(var2.field_7761.size() - ((~(2114019138 * -1944890851) - -3 >>> 5 | ~(2114019138 * -1944890851) - -3 << 27) ^ 1090222248)) << 32 ^ var6) & -1L << 32;
         var6 ^= ((long)this.iiIliIIlli(this.iiiiIiliIIIIlili.Iilllilliill()) ^ var6) & -1L >>> 32;
         if ((int)var6 < 0) {
            var6 ^= ((long)this.IIlIilIlIi(IilIlilililIlili) ^ var6) & -1L >>> 32;
         }

         if ((int)var6 < 0 && allowSlotFallback) {
            var8 ^= ((long)this.ilIIliliIiIIlili.Iilllilliill() << 32 ^ var8) & -1L << 32;
            if ((int)(var8 >>> 32) >= 0 && (int)(var8 >>> 32) < (int)(var6 >>> 32)) {
               var6 ^= ((long)((int)(var8 >>> 32)) ^ var6) & -1L >>> 32;
            }
         }

         if ((int)var6 >= 0 && (int)var6 < (int)(var6 >>> 32)) {
            Iiiilllliiilll.field_1761.method_2906(var2.field_7763, (int)var6, 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
            return true;
         } else {
            return false;
         }
      }
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         ++this.IliIlililliIlili;
         switch (this.lIiIliliiIiIlili.ordinal()) {
            case 1 -> this.lIilliIill();
            case 2 -> this.Ilillllill();
            case 3 -> this.ilillIiill();
            case 4 -> this.liilliiill();
            case 5 -> this.IIIillIIil();
            case 6 -> this.iIIilIlIil();
            case 7 -> this.lIliliIlil();
            case 8 -> this.illilIilil();
            case 9 -> this.lililiilil();
            case 10 -> this.IIiillIiil();
            case 11 -> this.iiiilIIIIi();
         }

      }
   }

   private boolean IiIliliIli() {
      return this.iiIliIIlli(this.liIIliliiiIIlili.Iilllilliill()) >= 0;
   }

   public llllililllil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.ilIlIiliIiIlIili = new IIIlIlIllIIlIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), List.of(class_1802.field_8367, class_1802.field_49814));
      this.liIlIiliiiIlIili = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.IIllIililIllIili = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
      this.iIllIiliIlllIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2000, 0, 10000000);
      this.llllIiliilllIili = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.IillIililillIili = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::liIlliiIll);
      this.iillIiliIIilIili = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::IIllllIlll);
      this.lIilIiliiIilIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 500);
      this.IlilIilillilIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 5, 0, 50);
      this.ililIiliIiilIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 100, 50, 200);
      this.liilIiliiiilIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 1000000000);
      this.IIIiIililIIiIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 1000000000);
      this.iIIiIiliIlIiIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 50, 0, 100);
      this.llIiIiliilIiIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 1, 30);
      this.IiIiIililiIiIili = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
      this.iiIiIiliIIliIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2, 1, 10);
      this.lIliIiliiIliIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 100);
      this.IlliIilillliIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 2, 20);
      this.illiIiliIiliIili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 0, 120);
      this.liliIiliiiliIili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.IIiiIililIiiIili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.iIiiIiliIliiIili = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
      this.lliiIiliiliiIili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.IiiiIililiiiIili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.iiiiIiliIIIIlili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.lIIIliliiIIIlili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.IlIIlilillIIlili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.ilIIliliIiIIlili = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 15, 0, 53);
      this.liIIliliiiIIlili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.IIlIlililIlIlili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.iIlIliliIllIlili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.lllIliliillIlili = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      this.lIiIliliiIiIlili = Illiliilllilii.lIiilliIIl;
      this.IIIllililIIllili = new ArrayList();
      this.IiIllililiIllili = -1;
      this.lIllliliiIlllili = new HashSet();
      this.iiilliliIIIilili = -1;
      this.IIlilililIlilili = new ArrayList();
      this.iIlililiIllilili = new HashMap();
      this.iliililiIiiilili = -100000;
      this.liiililiiiiilili = "";

      for(IilliIllilliIl var4 : new IilliIllilliIl[]{this.lIilIiliiIilIili, this.IlilIilillilIili, this.ililIiliIiilIili, this.liilIiliiiilIili, this.IIIiIililIIiIili, this.iIIiIiliIlIiIili, this.llIiIiliilIiIili, this.IiIiIililiIiIili, this.iiIiIiliIIliIili, this.lIliIiliiIliIili, this.IlliIilillliIili, this.illiIiliIiliIili}) {
         var4.iIlIlllllill(IliIlllilIi<invokedynamic>());
      }

      for(IilliIllilliIl var8 : new IilliIllilliIl[]{this.liliIiliiiliIili, this.IIiiIililIiiIili, this.iIiiIiliIliiIili, this.lliiIiliiliiIili, this.IiiiIililiiiIili, this.iiiiIiliIIIIlili, this.lIIIliliiIIIlili, this.IlIIlilillIIlili, this.ilIIliliIiIIlili, this.liIIliliiiIIlili, this.IIlIlililIlIlili, this.iIlIliliIllIlili, this.lllIliliillIlili}) {
         var8.iIlIlllllill(IliIlllilIi<invokedynamic>());
      }

      this.IlIlllIlilIl(new IilliIllilliIl[]{this.ilIlIiliIiIlIili, this.liIlIiliiiIlIili, this.IIllIililIllIili, this.iIllIiliIlllIili, this.llllIiliilllIili, this.IillIililillIili, this.iillIiliIIilIili, this.lIilIiliiIilIili, this.IlilIilillilIili, this.ililIiliIiilIili, this.liilIiliiiilIili, this.IIIiIililIIiIili, this.iIIiIiliIlIiIili, this.llIiIiliilIiIili, this.IiIiIililiIiIili, this.iiIiIiliIIliIili, this.lIliIiliiIliIili, this.IlliIilillliIili, this.illiIiliIiliIili, this.liliIiliiiliIili, this.IIiiIililIiiIili, this.iIiiIiliIliiIili, this.lliiIiliiliiIili, this.IiiiIililiiiIili, this.iiiiIiliIIIIlili, this.lIIIliliiIIIlili, this.IlIIlilillIIlili, this.ilIIliliIiIIlili, this.liIIliliiiIIlili, this.IIlIlililIlIlili, this.iIlIliliIllIlili, this.lllIliliillIlili});
   }

   private int IIlIilIlIi(class_1792... mats) {
      if (!this.liiIiiiiIi()) {
         return -1;
      } else {
         class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
         int var3 = var2.field_7761.size() - 36;

         for(int var4 = 0; var4 < var3; ++var4) {
            class_1799 var5 = var2.method_7611(var4).method_7677();
            if (!var5.method_7960()) {
               for(class_1792 var9 : mats) {
                  if (var5.method_31574(var9)) {
                     return var4;
                  }
               }
            }
         }

         return -1;
      }
   }

   private static String llliiillii(long coins) {
      return coins < (8068210048448642290L ^ 8068210048448642290L) ? IliIlllilIi<invokedynamic>() + llIIilIiilIIilIi.liiiIIllIl(-coins) : llIIilIiilIIilIi.liiiIIllIl(coins);
   }

   private IIlIIIlllIlIIIll iIlIiIllIi(long budgetLeft) {
      return new IIlIIIlllIlIIIll((double)this.iIIiIiliIlIiIili.Iilllilliill(), this.llIiIiliilIiIili.Iilllilliill(), this.lIilIiliiIilIili.Iilllilliill(), (long)this.liilIiliiiilIili.Iilllilliill(), budgetLeft, this.ililIiliIiilIili.Iilllilliill(), (long)this.iIllIiliIlllIili.Iilllilliill(), this.IlilIilillilIili.Iilllilliill());
   }

   private void ilIiiIiIii(Illiliilllilii ns) {
      this.lIiIliliiIiIlili = ns;
      this.iliIliliIiiIlili = this.IliIlililliIlili;
   }

   private int iIiliIlili() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for(int var2 = 0; var2 <= 8; ++var2) {
         if (var1.method_5438(var2).method_7960()) {
            return var2;
         }
      }

      return var1.method_67532();
   }

   private boolean IIIlilIIli() {
      if (!this.liiIiiiiIi()) {
         return false;
      } else {
         String var1 = Iiiilllliiilll.field_1755 != null ? iIIiiilIlIiiil.IliIlllilIi(Iiiilllliiilll.field_1755.method_25440().getString()).toLowerCase(Locale.ROOT) : "";
         String var2 = Iiliililii(this.lliiIiliiliiIili.Iilllilliill());
         if (!var2.isEmpty() && var1.contains(var2)) {
            return true;
         } else {
            return this.llIlliliilIllili != null && this.lIlliiIlli(this.llIlliliilIllili);
         }
      }
   }

   private void iIlllIllll() {
      this.IIIllililIIllili.clear();

      for(class_1792 var3 : this.liIlIiliiiIlIili.Iilllilliill() ? Arrays.asList(iilIliliIIiIlili) : this.ilIlIiliIiIlIili.Iilllilliill()) {
         if (var3 != null && var3 != class_1802.field_8162 && !this.IIIllililIIllili.contains(var3)) {
            this.IIIllililIIllili.add(var3);
         }
      }

      if (this.IIIllililIIllili.isEmpty()) {
         if (this.llllIiliilllIili.Iilllilliill()) {
            this.iiliiIIiii(IliIlllilIi<invokedynamic>());
         }

         this.lIiiiiIiii(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
         this.IIillIiliIil(false);
      } else {
         this.iIlililiIllilili.clear();

         for(class_1792 var5 : this.IIIllililIIllili) {
            this.iIlililiIllilili.put(var5, this.illliIilli(var5));
         }

         this.Iliilililliilili = 0;
         this.iIIlliliIlIllili = -1;
         this.IlIIillIIi();
         this.lllllillll();
      }
   }

   private void iilllIIill(String why) {
      if (Iiiilllliiilll.field_1724 != null && this.liiIiiiiIi()) {
         Iiiilllliiilll.field_1724.method_7346();
      }

      if (this.IIIIiililIIIiili) {
         if (this.llllIiliilllIili.Iilllilliill()) {
            this.iiliiIIiii(IliIlllilIi<invokedynamic>());
         }

         this.IIillIiliIil(false);
      } else {
         this.ilIiiIiIii(Illiliilllilii.IlIIiliIIl);
      }
   }

   public void Iilililiiili() {
      this.ilIIiIiIIi();
      if (Iiiilllliiilll.field_1724 != null && this.liiIiiiiIi()) {
         Iiiilllliiilll.field_1724.method_7346();
      }

      lIlillliIlilll.liiiIIllIl(this);
      if (this.llllIiliilllIili.Iilllilliill() && (this.iilililiIIiilili > 0 || this.lIiililiiIiilili > 0)) {
         this.iiliiIIiii(IliIlllilIi<invokedynamic>() + this.iilililiIIiilili + IliIlllilIi<invokedynamic>() + iIliiIllii(this.lllililiillilili) + IliIlllilIi<invokedynamic>() + this.lIiililiiIiilili + IliIlllilIi<invokedynamic>() + iIliiIllii(this.Iililililililili) + IliIlllilIi<invokedynamic>() + llliiillii(this.Iililililililili - this.lllililiillilili));
      }

      this.ilIllIiIll();
      this.IIIIiililIIIiili = false;
   }

   private void iiIilIIlil(String why) {
      this.lllllillll();
   }

   private boolean Iiililiili() {
      return !this.lliliilili() && IliIlllilIi<invokedynamic>().equals(this.IIllIililIllIili.Iilllilliill());
   }

   public static void lIIlliIIll(String line) {
      if (line != null) {
         String var1 = iIIiiilIlIiiil.IliIlllilIi(line).toLowerCase(Locale.ROOT);
         String var2 = iIIIiiliIlIIiili;
         if (var2 != null && !var2.isEmpty() && var1.contains(var2)) {
            iiIIiiliIIlIiili = true;
         }

         String var3 = llIIiiliilIIiili;
         if (var3 != null && !var3.isEmpty() && var1.contains(var3)) {
            lIlIiiliiIlIiili = true;
         }

         String var4 = IiIIiililiIIiili;
         if (var4 != null && !var4.isEmpty() && var1.contains(var4)) {
            IllIiililllIiili = true;
         }

      }
   }

   private void illilIilil() {
      class_1792 var1 = this.Iiillililiillili;
      class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
      if (this.iiilliliIIIilili < 0) {
         this.Iiiilliiil();
      } else if (this.liiIiiiiIi()) {
         Iiiilllliiilll.field_1724.method_7346();
         this.liiIliliiiiIlili = this.IliIlililliIlili;
      } else if (var2.method_67532() != this.iiilliliIIIilili) {
         var2.method_61496(this.iiilliliIIIilili);
      } else {
         class_1799 var3 = var2.method_5438(this.iiilliliIIIilili);
         if (!var3.method_7960() && var3.method_31574(var1)) {
            if (this.IliIlililliIlili - this.liiIliliiiiIlili >= this.iiiliIIIii()) {
               int var4 = var3.method_7947();
               long var5 = Math.max(1L, this.IIillililIillili * (long)var4);
               this.liIililiiiIilili = this.illliIilli(var1);
               this.IlIililillIilili = var5;
               this.ilIililiIiIilili = var4;
               lIlIiiliiIlIiili = false;
               IllIiililllIiili = false;
               Iiiilllliiilll.field_1724.field_3944.method_45730(this.lIiIiiIiIi(var5, var4));
               this.liiIliliiiiIlili = this.IliIlililliIlili;
               this.ilIiiIiIii(Illiliilllilii.lIIIiliIIl);
            }
         } else {
            this.Iiiilliiil();
         }
      }
   }

   private void Iillllilll() {
      this.illlliliIilllili = null;
      this.lIllliliiIlllili.clear();
      this.iiIlliliIIlllili = 0;
      this.IiIllililiIllili = -1;
      this.IIlilililIlilili.clear();
      this.Iiillililiillili = null;
      this.iiilliliIIIilili = -1;
      this.lIIililiiIIilili = 0;
      if (this.IIIiIililIIiIili.Iilllilliill() > 0 && this.lllililiillilili >= (long)this.IIIiIililIIiIili.Iilllilliill()) {
         if (this.llllIiliilllIili.Iilllilliill()) {
            this.iiliiIIiii(IliIlllilIi<invokedynamic>() + iIliiIllii(this.lllililiillilili) + IliIlllilIi<invokedynamic>());
         }

         this.IIillIiliIil(false);
      } else if (this.lIliIiliiIliIili.Iilllilliill() > 0 && this.Iliilililliilili >= this.lIliIiliiIliIili.Iilllilliill()) {
         this.iilllIIill(IliIlllilIi<invokedynamic>());
      } else {
         this.ilIiiIiIii(Illiliilllilii.iIiilliIIl);
      }
   }

   private void lIliliIlil() {
      class_1792 var1 = this.Iiillililiillili;
      if (var1 == null) {
         this.lllllillll();
      } else if (this.liiIiiiiIi()) {
         Iiiilllliiilll.field_1724.method_7346();
      } else if (Iiiilllliiilll.field_1755 == null) {
         int var2 = this.lilliiilli(var1);
         if (var2 <= 0) {
            this.Iiiilliiil();
         } else {
            class_1661 var3 = Iiiilllliiilll.field_1724.method_31548();

            for(int var4 = 0; var4 <= 8; ++var4) {
               class_1799 var5 = var3.method_5438(var4);
               if (var5.method_31574(var1) && var5.method_7947() > 0 && var5.method_7947() <= var2) {
                  this.iiilliliIIIilili = var4;
                  this.Illillllil();
                  return;
               }
            }

            if (this.lIIililiiIIilili == 1) {
               if (this.iiilliliIIIilili >= 0 && var3.method_5438(this.iiilliliIIIilili).method_31574(var1)) {
                  this.Illillllil();
               } else {
                  if (this.IlIiillIii() > 20) {
                     this.lIIililiiIIilili = 0;
                  }

               }
            } else {
               int var7 = -1;

               for(int var8 = 9; var8 <= 35; ++var8) {
                  class_1799 var6 = var3.method_5438(var8);
                  if (var6.method_31574(var1) && var6.method_7947() > 0 && var6.method_7947() <= var2) {
                     var7 = var8;
                     break;
                  }
               }

               if (var7 < 0) {
                  if (this.llllIiliilllIili.Iilllilliill()) {
                     this.iiliiIIiii(IliIlllilIi<invokedynamic>() + IIliilIlii(var1) + IliIlllilIi<invokedynamic>());
                  }

                  this.Iiiilliiil();
               } else if (lIlillliIlilll.IliIlllilIi(this)) {
                  int var9 = this.iIiliIlili();
                  Iiiilllliiilll.field_1761.method_2906(Iiiilllliiilll.field_1724.field_7498.field_7763, iiilIiIiIIIiIiIi.IliIlllilIi(var7), iiilIiIiIIIiIiIi.iIlIlllllill(var9), class_1713.field_7791, Iiiilllliiilll.field_1724);
                  this.iiilliliIIIilili = var9;
                  this.lIIililiiIIilili = 1;
                  this.liiIliliiiiIlili = this.IliIlililliIlili;
               }
            }
         }
      }
   }

   private String lIiIiiIiIi(long count, int price) {
      String var4 = liIiiiiIii(this.IIiiIililIiiIili.Iilllilliill());
      return var4.replace(IliIlllilIi<invokedynamic>(), Long.toString(count)).replace(IliIlllilIi<invokedynamic>(), Integer.toString(price)).replace(IliIlllilIi<invokedynamic>(), Integer.toString(price));
   }

   private void IIiillIiil() {
      class_1792 var1 = this.Iiillililiillili;
      if (IllIiililllIiili) {
         IllIiililllIiili = false;
         this.lliililiil(IliIlllilIi<invokedynamic>());
      } else if (this.illliIilli(var1) >= this.liIililiiiIilili && !lIlIiiliiIlIiili) {
         if (this.liiIiiiiIi() && this.IliIlililliIlili - this.liiIliliiiiIlili >= this.iiiliIIIii()) {
            this.liIIiiiIIi(true);
            this.liiIliliiiiIlili = this.IliIlililliIlili;
         } else {
            if (this.IlIiillIii() > 100) {
               this.lliililiil(IliIlllilIi<invokedynamic>());
            }

         }
      } else {
         this.iIiilIliil();
      }
   }

   private void liilliiill() {
      if (this.illlliliIilllili != null && this.iIIliIlIli()) {
         if (this.IliIlililliIlili - this.liiIliliiiiIlili >= this.iiiliIIIii()) {
            if (!this.IIililIili(this.llIlliliilIllili)) {
               this.iiIilIIlil(IliIlllilIi<invokedynamic>());
            } else {
               class_1799 var1 = Iiiilllliiilll.field_1724.field_7512.method_7611(this.illlliliIilllili.IliIlllilIi()).method_7677();
               if (!var1.method_7960() && var1.method_31574(this.llIlliliilIllili)) {
                  this.iIilliliIlillili = this.illliIilli(this.llIlliliilIllili);
                  iiIIiiliIIlIiili = false;
                  this.llilliliilillili = 0;
                  Iiiilllliiilll.field_1761.method_2906(this.IiIllililiIllili, this.illlliliIilllili.IliIlllilIi(), 0, class_1713.field_7790, Iiiilllliiilll.field_1724);
                  this.liiIliliiiiIlili = this.IliIlililliIlili;
                  this.ilIiiIiIii(Illiliilllilii.IiiilliIIl);
               } else {
                  this.lIllliliiIlllili.add(this.illlliliIilllili.IliIlllilIi());
                  this.ilIiiIiIii(Illiliilllilii.IliilliIIl);
               }
            }
         }
      } else {
         this.ilIiiIiIii(Illiliilllilii.IliilliIIl);
      }
   }

   private void iiiilIIIIi() {
      if (this.liiIiiiiIi()) {
         Iiiilllliiilll.field_1724.method_7346();
      } else {
         if (this.IlIiillIii() >= this.lIIiiiIIii()) {
            this.iIlllIllll();
         }

      }
   }

   private void lllllillll() {
      this.illlliliIilllili = null;
      this.lIllliliiIlllili.clear();
      this.iiIlliliIIlllili = 0;
      this.Illllililllllili = 0;
      this.IiIllililiIllili = -1;
      this.IIlilililIlilili.clear();
      this.Iiillililiillili = null;
      this.iiilliliIIIilili = -1;
      this.lIIililiiIIilili = 0;
      if (!this.lliliilili() && this.IIIiIililIIiIili.Iilllilliill() > 0 && this.lllililiillilili >= (long)this.IIIiIililIIiIili.Iilllilliill()) {
         if (this.llllIiliilllIili.Iilllilliill()) {
            this.iiliiIIiii(IliIlllilIi<invokedynamic>() + iIliiIllii(this.lllililiillilili) + IliIlllilIi<invokedynamic>());
         }

         this.IIillIiliIil(false);
      } else if (!this.lliliilili() && this.lIliIiliiIliIili.Iilllilliill() > 0 && this.Iliilililliilili >= this.lIliIiliiIliIili.Iilllilliill()) {
         this.iilllIIill(IliIlllilIi<invokedynamic>());
      } else {
         ++this.iIIlliliIlIllili;
         if (this.iIIlliliIlIllili >= this.IIIllililIIllili.size()) {
            this.iilllIIill(IliIlllilIi<invokedynamic>());
         } else {
            this.llIlliliilIllili = (class_1792)this.IIIllililIIllili.get(this.iIIlliliIlIllili);
            this.ilIiiIiIii(Illiliilllilii.iIiilliIIl);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) - var5) >>> 10 | (char)((char)(~((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) - var5) << 6) - var5) + 2906) ^ 3685) + '뮉') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lililiilil() {
      class_1792 var1 = this.Iiillililiillili;
      if (IllIiililllIiili) {
         IllIiililllIiili = false;
         this.lliililiil(IliIlllilIi<invokedynamic>());
      } else if (this.liiIiiiiIi()) {
         if (this.IliIlililliIlili - this.liiIliliiiiIlili >= this.iiiliIIIii()) {
            if (this.liIIiiiIIi(true)) {
               this.liiIliliiiiIlili = this.IliIlililliIlili;
               this.ilIiiIiIii(Illiliilllilii.iIIIiliIIl);
            }
         }
      } else if (this.illliIilli(var1) >= this.liIililiiiIilili && !lIlIiiliiIlIiili) {
         if (this.IlIiillIii() > 80) {
            this.lliililiil(IliIlllilIi<invokedynamic>());
         }

      } else {
         this.iIiilIliil();
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) >>> 2) - var5) - '辆') + var5) ^ '頸') ^ 28928) + 17110) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) >>> 2) - var5) - '辆') + var5) ^ '頸') ^ 28928) + 17110) >>> 11) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) >>> 2) - var5) - '辆') + var5) ^ '頸') ^ 28928) + 17110) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 6 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 10) + '꿟') - 29533))) ^ var5))) ^ 30984) ^ var5) >>> 2) - var5) - '辆') + var5) ^ '頸') ^ 28928) + 17110) >>> 11) ^ var5) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIllllIll() {
      if (this.llllIiliilllIili.Iilllilliill() && !this.IIIIiililIIIiili) {
         int var1 = 0;
         if (this.liIlIiliiiIlIili.Iilllilliill()) {
            var1 = iilIliliIIiIlili.length;
         } else {
            for(class_1792 var3 : this.ilIlIiliIiIlIili.Iilllilliill()) {
               if (var3 != null && var3 != class_1802.field_8162) {
                  ++var1;
               }
            }
         }

         String var4 = this.lliliilili() ? IliIlllilIi<invokedynamic>() : (IliIlllilIi<invokedynamic>().equals(this.IIllIililIllIili.Iilllilliill()) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
         String var5 = this.lIilIiliiIilIili.Iilllilliill() > 0 ? IliIlllilIi<invokedynamic>() + this.lIilIiliiIilIili.Iilllilliill() + IliIlllilIi<invokedynamic>() : "";
         this.iiliiIIiii(IliIlllilIi<invokedynamic>() + var4 + IliIlllilIi<invokedynamic>() + var1 + (this.liIlIiliiiIlIili.Iilllilliill() ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + iIliiIllii((long)this.iIllIiliIlllIili.Iilllilliill()) + IliIlllilIi<invokedynamic>() + var5 + IliIlllilIi<invokedynamic>() + this.ililIiliIiilIili.Iilllilliill() + IliIlllilIi<invokedynamic>() + this.IlilIilillilIili.Iilllilliill() + IliIlllilIi<invokedynamic>());
      }
   }

   static {
      IilIlilililIlili = new class_1792[]{class_1802.field_8581, class_1802.field_8656, class_1802.field_19049, class_1802.field_19057, class_1802.field_8131, class_1802.field_8687, class_1802.field_8733};
      iilIliliIIiIlili = new class_1792[]{class_1802.field_8367, class_1802.field_49814, class_1802.field_49813, class_1802.field_8833, class_1802.field_22020, class_1802.field_22018, class_1802.field_22021, class_1802.field_41946, class_1802.field_8791, class_1802.field_8668, class_1802.field_8545, class_1802.field_8626};
      iIIIiiliIlIIiili = null;
      llIIiiliilIIiili = null;
      IiIIiililiIIiili = null;
      iiIIiiliIIlIiili = false;
      lIlIiiliiIlIiili = false;
      IllIiililllIiili = false;
   }

   private void llIililIil() {
      long var2 = 7987016432069734988L;
      var2 ^= ((long)(this.illliIilli(this.llIlliliilIllili) - this.iIilliliIlillili) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) <= 0) {
         this.IiIilliIil(IliIlllilIi<invokedynamic>());
      } else {
         this.iilililiIIiilili += (int)(var2 >>> 32);
         this.lllililiillilili += this.illlliliIilllili.IilliliilIIi();
         ++this.Iliilililliilili;
         this.Illllililllllili = 0;
         if (this.llllIiliilllIili.Iilllilliill()) {
            this.iiliiIIiii(IliIlllilIi<invokedynamic>() + (int)(var2 >>> 32) + IliIlllilIi<invokedynamic>() + IIliilIlii(this.llIlliliilIllili) + IliIlllilIi<invokedynamic>() + iIliiIllii(this.illlliliIilllili.IilliliilIIi()) + IliIlllilIi<invokedynamic>() + iIliiIllii(this.lillliliiilllili) + IliIlllilIi<invokedynamic>() + iIliiIllii(this.illlliliIilllili.IlIlllIlilIl()) + IliIlllilIi<invokedynamic>());
         }

         this.lIiiiiIiii(IliIlllilIi<invokedynamic>(), (int)(var2 >>> 32) + IliIlllilIi<invokedynamic>() + IIliilIlii(this.llIlliliilIllili) + IliIlllilIi<invokedynamic>() + iIliiIllii(this.illlliliIilllili.IilliliilIIi()), true);
         if (this.Iiililiili()) {
            this.Iiillililiillili = this.llIlliliilIllili;
            this.lIIililiiIIilili = 0;
            this.iiilliliIIIilili = -1;
            this.ilIiiIiIii(Illiliilllilii.iiiilliIIl);
         } else {
            this.Iillllilll();
         }

      }
   }

   private void lIilliIill() {
      if (this.liiIiiiiIi()) {
         Iiiilllliiilll.field_1724.method_7346();
         this.liiIliliiiiIlili = this.IliIlililliIlili;
      } else if (Iiiilllliiilll.field_1755 == null) {
         if (this.IliIlililliIlili - this.liiIliliiiiIlili >= 4) {
            Iiiilllliiilll.field_1724.field_3944.method_45730(this.IilIililIi(this.llIlliliilIllili));
            this.liiIliliiiiIlili = this.IliIlililliIlili;
            this.IiIllililiIllili = -1;
            this.iiIlliliIIlllili = 0;
            this.lIllliliiIlllili.clear();
            this.ilIiiIiIii(Illiliilllilii.IliilliIIl);
         }
      }
   }

   private void IIIillIIil() {
      if (iiIIiiliIIlIiili) {
         iiIIiiliIIlIiili = false;
         this.IiIilliIil(IliIlllilIi<invokedynamic>());
      } else if (this.illliIilli(this.llIlliliilIllili) > this.iIilliliIlillili) {
         this.llIililIil();
      } else {
         if (this.liiIiiiiIi()) {
            boolean var1 = Iiiilllliiilll.field_1724.field_7512.field_7763 != this.IiIllililiIllili || this.llIliilIli();
            if (var1) {
               if (this.IliIlililliIlili - this.liiIliliiiiIlili < this.iiiliIIIii()) {
                  return;
               }

               if (this.liIIiiiIIi(false)) {
                  this.liiIliliiiiIlili = this.IliIlililliIlili;
                  this.ilIiiIiIii(Illiliilllilii.liiilliIIl);
                  return;
               }

               if (this.llilliliilillili == 0) {
                  this.Illlilllli(263);
                  this.llilliliilillili = 1;
                  this.liiIliliiiiIlili = this.IliIlililliIlili;
                  return;
               }

               this.Illlilllli(257);
               this.llilliliilillili = 0;
               this.liiIliliiiiIlili = this.IliIlililliIlili;
               this.ilIiiIiIii(Illiliilllilii.liiilliIIl);
               return;
            }

            if (this.illlliliIilllili != null) {
               class_1799 var2 = Iiiilllliiilll.field_1724.field_7512.method_7611(this.illlliliIilllili.IliIlllilIi()).method_7677();
               if (var2.method_7960() || !var2.method_31574(this.llIlliliilIllili)) {
                  this.IiIilliIil(IliIlllilIi<invokedynamic>());
                  return;
               }
            }
         }

         if (this.IlIiillIii() > 40) {
            this.IiIilliIil(IliIlllilIi<invokedynamic>());
         }

      }
   }

   private int lilliiilli(class_1792 it) {
      return Math.max(0, this.illliIilli(it) - (Integer)this.iIlililiIllilili.getOrDefault(it, 0));
   }

   private void iIIilIlIil() {
      if (iiIIiiliIIlIiili) {
         iiIIiiliIIlIiili = false;
         this.IiIilliIil(IliIlllilIi<invokedynamic>());
      } else if (this.illliIilli(this.llIlliliilIllili) > this.iIilliliIlillili) {
         this.llIililIil();
      } else {
         if (this.IlIiillIii() > 60) {
            this.IiIilliIil(IliIlllilIi<invokedynamic>());
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) << 9 | (char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) >>> 7) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) << 9 | (char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) >>> 7) << 14) + 15916) - var5) ^ var5) + '밟') + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) << 9 | (char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) >>> 7) >>> 2 | (char)((char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) << 9 | (char)((char)((char)(var4[var5] ^ '\ued36') - var5) + 8740) >>> 7) << 14) + 15916) - var5) ^ var5) + '밟') + var5) << 12))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') << 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') >>> 9))) + '샀') + '\ueea3') - var5) << 7 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') << 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') >>> 9))) + '샀') + '\ueea3') - var5) >>> 9) >>> 12 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') << 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') >>> 9))) + '샀') + '\ueea3') - var5) << 7 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') << 7 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) << 6 | (char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) >>> 6 | (char)((char)((char)((char)(var4[var5] - var5) - var5) << 3 | (char)((char)(var4[var5] - var5) - var5) >>> 13) + 6897) << 10) >>> 10))) + '苺') >>> 9))) + '샀') + '\ueea3') - var5) >>> 9) << 4) ^ var5) + 9278));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lIlliiIlli(class_1792 item) {
      if (!this.liiIiiiiIi()) {
         return false;
      } else {
         class_1703 var2 = Iiiilllliiilll.field_1724.field_7512;
         int var3 = var2.field_7761.size() - 36;

         for(int var4 = 0; var4 < var3; ++var4) {
            if (var2.method_7611(var4).method_7677().method_31574(item)) {
               return true;
            }
         }

         return false;
      }
   }

   private void ilIIiIiIIi() {
      iIIIiiliIlIIiili = null;
      llIIiiliilIIiili = null;
      IiIIiililiIIiili = null;
      iiIIiiliIIlIiili = false;
      lIlIiiliiIlIiili = false;
      IllIiililllIiili = false;
   }

   private void lliililiil(String why) {
      long var4 = -3824395714162063784L;
      if (this.llllIiliilllIili.Iilllilliill()) {
         String var2;
         if (!this.liiIiiiiIi()) {
            var2 = IliIlllilIi<invokedynamic>();
         } else {
            var4 ^= ((long)(this.iiIliIIlli(this.iiiiIiliIIIIlili.Iilllilliill()) < 0 && this.IIlIilIlIi(IilIlilililIlili) < 0 ? 0 : 1) << 32 ^ var4) & -1L << 32;
            var2 = (int)(var4 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
         }

         this.iiliiIIiii(IliIlllilIi<invokedynamic>() + IIliilIlii(this.Iiillililiillili) + IliIlllilIi<invokedynamic>() + why + IliIlllilIi<invokedynamic>() + var2);
      }

      this.Iiiilliiil();
   }

   private String IilIililIi(class_1792 item) {
      String var2 = liIiiiiIii(this.liliIiliiiliIili.Iilllilliill());
      return var2.replace(IliIlllilIi<invokedynamic>(), this.iilIiIIiIi(item));
   }

   public static boolean iiiIlIIIll() {
      return iIIIiiliIlIIiili != null || llIIiiliilIIiili != null || IiIIiililiIIiili != null;
   }
}
