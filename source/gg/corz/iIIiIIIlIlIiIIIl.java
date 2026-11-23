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
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.IntConsumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_1889;
import net.minecraft.class_1890;
import net.minecraft.class_1914;
import net.minecraft.class_2378;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import net.minecraft.class_5321;
import net.minecraft.class_6880;
import net.minecraft.class_7924;
import net.minecraft.class_9306;
import org.joml.Matrix3x2fStack;

public final class iIIiIIIlIlIiIIIl extends Iliilliiilii {
   private final iiIiiilIIliiil lIillIllIl;
   private static final float IIIIlIllIl = 104.0F;
   private iIiilIliil IilliIllIl;
   private final Runnable llIilIllIl;
   private float lilIiIllIl;
   private static final float iIIllIllIl = 14.0F;
   private boolean iIlliIllIl;
   private final Runnable IIlilIllIl;
   private final Runnable lllilIllIl;
   private static final float iIIIlIllIl = 2.0F;
   private List<lIllIilliIllIill> IIlIiIllIl;
   private static final float llliIIllIl = 16.0F;
   private String lIlIiIllIl;
   private static final String lIlllIllIl = "Use this trade";
   private static final float IIliIIllIl = 600.0F;
   private static final IlliliIillliliIi[] IlIllIllIl;
   private static final float IIiiIIllIl = 13.0F;
   private final Runnable iiillIllIl;
   private static final float lIlIlIllIl = 84.0F;
   private final Runnable[] iIiilIllIl;
   private static final float lIliIIllIl = 360.0F;
   private final llIiIlilIiIl IIillIllIl;
   private IlIlIlllIlIl IiiIiIllIl;
   private static final int IIiIlIllIl = 4;
   private static final float IiIIlIllIl = 124.0F;
   private static final int iilIlIllIl = 64;
   private final Runnable IlIilIllIl;
   private int lliIiIllIl;
   private static final float iIlIlIllIl = 13.0F;
   private final float[] llIIiIllIl;
   private final Runnable IIIilIllIl;
   private iiilIiiIIIiIii ilIIiIllIl;
   private static final long iIiIlIllIl = 250L;
   private boolean lllliIllIl;
   private final Runnable lIIilIllIl;
   private static final float IlIIlIllIl = 460.0F;
   private String iIIliIllIl;
   private static final String IIlllIllIl = "Level at least";
   private static final float IllIlIllIl = 62.0F;
   private static final float liIIlIllIl = 132.0F;
   private final Map<String, class_1799> iliilIllIl;
   private float iiIliIllIl;
   private final String[] lIIIiIllIl;
   private final Runnable iiIilIllIl;
   private static final float IlliIIllIl = 176.0F;
   private final Runnable liIilIllIl;
   private int iIlIiIllIl;
   private static final float lIiiIIllIl = 8.0F;
   private static final int[] iliIlIllIl = new int[]{0, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
   private int llIliIllIl;
   private static final float IIlIlIllIl = 10.0F;
   private static final float iiiiIIllIl = 30.0F;
   private static final float lllIlIllIl = 70.0F;
   private float IiIliIllIl;
   private final Runnable lIlilIllIl;
   private static final String iiIllIllIl = "Stop after";
   private final IntConsumer iililIllIl;
   private static final float ilIIlIllIl = 96.0F;
   private final Runnable iIIilIllIl;
   private static final Set<String> lilllIllIl;
   private final String[] iIIIiIllIl;
   private final IntConsumer IIiilIllIl;
   private final List<Runnable> lliilIllIl;
   private final iiIiiilIIliiil llillIllIl;
   private static final float iliiIIllIl = 5.0F;
   private String IIIliIllIl;
   private static final float iIiiIIllIl = 24.0F;
   private static final String lIIllIllIl = "Add XP bottles";
   private static final String IIIllIllIl = "Or start with";
   private static final float lliiIIllIl = 0.05F;
   private static final String[] IilllIllIl;
   private final float[] IlIIiIllIl;
   private final Runnable liillIllIl;
   private float IIiIiIllIl;
   private static final float iiliIIllIl = 20.0F;
   private final class_1799 IiiilIllIl;
   private static final float lIIIlIllIl = 30.0F;
   private static final int IliIlIllIl = IilIIIIililIIIIi.Illlllllilll(-7630437, -1750963, 0.65);
   private int IlIliIllIl;
   private static final String[] IiIllIllIl;
   private static final float iiIIlIllIl = 180.0F;
   private static final float illiIIllIl = 4.0F;
   private final iiIiiilIIliiil ilillIllIl;
   private static final float IiliIIllIl = 12.0F;
   private static final String[] lllllIllIl;
   private long IliIiIllIl;
   private static final float liliIIllIl = 5.0F;
   private static final String iilllIllIl = "General";
   private static final String[] llIllIllIl;
   private float IllIiIllIl;
   private static final float lilIlIllIl = 5.0F;
   private boolean IllliIllIl;
   private float IIlliIllIl;
   private float illIiIllIl;
   private String lIIliIllIl;
   private final Runnable[] IliilIllIl;
   private final IntConsumer lIiilIllIl;
   private static final float IliiIIllIl = 18.0F;
   private float ilIliIllIl;
   private IIlliIillIlliIil iiIIiIllIl;
   private static final String iiiIlIllIl = "From Master Clerics  ·  about 3 emeralds each";
   private IiIlIIiliIlIIi liiIiIllIl;
   private final Runnable IiIilIllIl;
   private static final float IiiiIIllIl = 14.0F;
   private static final String liIllIllIl = "Max price";
   private float iilIiIllIl;
   private final Runnable ilIilIllIl;
   private long iiiIiIllIl;
   private float lllIiIllIl;
   private final iiiilIIiIIIIiIIi IIIIiIllIl;
   private static final String iIlllIllIl = "Set up your trader";
   private boolean IiIIiIllIl;
   private static final float llIIlIllIl = 234.0F;
   private long iIiIiIllIl;
   private float lIiIiIllIl;
   private boolean liIIiIllIl;
   private final IntConsumer IililIllIl;
   private final IntConsumer illilIllIl;
   private static final String[] illllIllIl;
   private static final String[] ilIllIllIl;
   private final iiIiiilIIliiil iIillIllIl;
   private final Map<String, Integer> iiiilIllIl;
   private final IntConsumer lililIllIl;
   private IiIlIIiliIlIIi illliIllIl;
   private static final String liiIlIllIl = "XP bottles";
   private float liIliIllIl;
   private final Runnable IllilIllIl;
   private static final float illIlIllIl = 40.0F;
   private final Runnable IiillIllIl;
   private iIIiliiIlIilii lilliIllIl;
   private final iiIiiilIIliiil IlillIllIl;
   private int iliIiIllIl;
   private static final long lIiIlIllIl = 2500L;
   private float IilIiIllIl;
   private static final int[] IiiIlIllIl = new int[]{0, 16, 32, 64, 128, 256, 512, 1024, 1728, 3456};
   private static final float IilIlIllIl = 36.0F;
   private final Runnable iIlilIllIl;
   private static final String IllllIllIl = "Stop trading to change chests";
   private static final float iIliIIllIl = 150.0F;
   private final Map<String, String[]> liiilIllIl;
   private float lIlliIllIl;
   private static final int lliIlIllIl = IilIIIIililIIIIi.Illlllllilll(-7630437, -8393375, 0.45);

   private void iiliiIIiii(class_332 armed, String on, float key, float x, float ctx, boolean act, boolean y, Runnable w) {
      long var14 = 9121590451553056115L;
      float var9 = y ? this.lIIiiiIIii(on, key, x, ctx, 16.0F) : 0.0F;
      var14 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(armed, key + ctx / 2.0F, x + 8.0F, this.iiilllIIIill.IiIlliIliiIl().IiIlliIliiIl(on, 0.05F), 0.0F) << 32 ^ var14) & -1L << 32;

      try {
         lIlIIIliIlIIIl.iliIiiliiiii(armed, key, x, ctx, 16.0F, var9, 0.0F);
         if (act) {
            IIIiiIillIIiiIil.IlIlllIlilIl(armed, key + 1.0F, x + 1.0F, ctx - 2.0F, 14.0F, 4.0F, lIlIIIliIlIIIl.Iiiiliiiiiii(-1750963, 0.14F));
            String var11 = IliIlllilIi<invokedynamic>();
            float var12 = lIlIIIliIlIIIl.IIlllIlliIll(var11, 0.82F);
            lIlIIIliIlIIIl.Illlllllilll(var11, llilliilililliil.IIIllIIliIIl(key + (ctx - var12) / 2.0F), x, 16.0F, 0.82F, IliIlIllIl);
         } else {
            var14 ^= ((long)(y ? IilIIIIililIIIIi.Illlllllilll(-7630437, IliIlIllIl, (double)var9) : -11117467) ^ var14) & -1L >>> 32;
            lIlIIIliIlIIIl.IIIilIIiiIIi(lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), llilliilililliil.IIIllIIliIIl(key + (ctx - 8.0F) / 2.0F), llilliilililliil.IIIllIIliIIl(x + 4.0F), 8.0F, (int)var14);
         }
      } finally {
         lIlIIIliIlIIIl.IIlilIliiIli(armed, (boolean)((int)(var14 >>> 32)));
      }

      if (y) {
         this.IlIiillIii(on, key, x, ctx, 16.0F, w);
      }

   }

   private void IIiillIiil() {
      if (this.IIlIiIllIl != null) {
         this.IIlIiIllIl = null;
         this.lliilIllIl.clear();
         this.iiilllIIIill.Ililllililil();
      }
   }

   private void lIliliIlil(String msg, boolean good) {
      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), msg, good);
   }

   private int IiIIIlliIIIl(String enchant) {
      long var5 = 9029855332849154902L;
      if (enchant != null && !IliIlllilIi<invokedynamic>().equals(enchant)) {
         Integer var2 = (Integer)this.iiiilIllIl.get(enchant);
         if (var2 != null) {
            return var2;
         } else {
            try {
               Optional var4 = iIIIIlIlIIIl(enchant);
               var5 ^= ((long)(var4.isPresent() ? ((class_1887)((class_6880.class_6883)var4.get()).comp_349()).method_8183() : -1) << 32 ^ var5) & -1L << 32;
            } catch (Exception var7) {
               var5 ^= (-4294967296L ^ var5) & -1L << 32;
            }

            if ((int)(var5 >>> 32) < 1) {
               return 1;
            } else {
               this.iiiilIllIl.put(enchant, (int)(var5 >>> 32));
               return (int)(var5 >>> 32);
            }
         }
      } else {
         return 5;
      }
   }

   public void IlIlllIlilIl(class_332 stage, iIIiliiIlIilii ctx) {
   }

   private void illliIilli(float label, float ink, float y, String value, String x, int w) {
      lIlIIIliIlIIIl.Illlllllilll(value, label, ink, 13.0F, 0.82F, -7630437);
      float var7 = lIlIIIliIlIIIl.IIlllIlliIll(value, 0.82F) + 10.0F;
      String var8 = this.IIililIili(x, Math.max(10.0F, y - var7), 0.82F);
      float var9 = lIlIIIliIlIIIl.IIlllIlliIll(var8, 0.82F);
      lIlIIIliIlIIIl.Illlllllilll(var8, label + y - var9, ink, 13.0F, 0.82F, w);
   }

   private String iIIliIlIli(IiIlIIiliIlIIi t, boolean first) {
      long var6 = 517066674574219514L;
      if (t == this.illliIllIl && first == this.IllliIllIl && this.iIIliIllIl != null) {
         return this.iIIliIllIl;
      } else {
         this.illliIllIl = t;
         this.IllliIllIl = first;
         var6 ^= ((long)(t.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl ? t.IlIlllIlilIl() : 0) << 32 ^ var6) & -1L << 32;
         String var4 = (int)(var6 >>> 32) > 0 ? lIIllilliIIllill.IliIlllilIi((int)(var6 >>> 32)) + IliIlllilIi<invokedynamic>() + t.llIiiIiliilIiiIili : t.llIiiIiliilIiiIili;
         String var5 = t.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? IliIlllilIi<invokedynamic>() + t.llIiiIiliilIiiIili : (IliIlllilIi<invokedynamic>().equals(t.llIiiIiliilIiiIili) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + var4);
         this.iIIliIllIl = first ? var5 + IliIlllilIi<invokedynamic>() : var5;
         return this.iIIliIllIl;
      }
   }

   private static String llliiillii(List<IlIiiIIillIiiIIi> list) {
      class_310 var1 = class_310.method_1551();
      if (var1.field_1724 != null && !list.isEmpty()) {
         double var2 = Double.MAX_VALUE;

         for(IlIiiIIillIiiIIi var5 : list) {
            var2 = Math.min(var2, var5.iIlIlllllill().method_1022(var1.field_1724.method_33571()));
         }

         return var2 > (double)999.0F ? IliIlllilIi<invokedynamic>() : Math.round(var2) + IliIlllilIi<invokedynamic>();
      } else {
         return IliIlllilIi<invokedynamic>();
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) >>> 13) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) >>> 13) << 10) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) >>> 13) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) >>> 11 | (char)((char)((char)(var4[var5] ^ '轓') ^ '긅') << 9 | (char)((char)(var4[var5] ^ '轓') ^ '긅') >>> 7) << 5) + var5) - var5) + var5) >>> 8) ^ var5) >>> 13) << 10) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return !this.IiIIiIllIl && this.IIlIiIllIl == null ? this.IIillIllIl.iiilllIIIill().size() : 0;
   }

   private String IIililIili(String room, float scale, float text) {
      long var6 = 8447475631225023375L;
      if (room != null && !room.isEmpty()) {
         float var4 = Math.max(0.0F, scale) / text;

         for(var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < 64; var6 += 4294967296L) {
            if (this.IlIIiIllIl[(int)(var6 >>> 32)] == var4 && room.equals(this.lIIIiIllIl[(int)(var6 >>> 32)])) {
               return this.iIIIiIllIl[(int)(var6 >>> 32)];
            }
         }

         var6 ^= ((long)this.IlIliIllIl << 32 ^ var6) & -1L << 32;
         this.IlIliIllIl = (this.IlIliIllIl + 1) % 64;
         this.lIIIiIllIl[(int)(var6 >>> 32)] = room;
         this.IlIIiIllIl[(int)(var6 >>> 32)] = var4;
         this.iIIIiIllIl[(int)(var6 >>> 32)] = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(room, var4);
         return this.iIIIiIllIl[(int)(var6 >>> 32)];
      } else {
         return "";
      }
   }

   private float llIliilIli() {
      if (this.iiIliIllIl < 0.0F) {
         this.iiIliIllIl = Math.max(lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F), Math.max(lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F), lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F)));
      }

      return this.iiIliIllIl;
   }

   private void lliliilili(class_332 ctx, iIIiliiIlIilii live, boolean w, int i, lIllIilliIllIill s, float y, float ti, float top, float x) {
      long var33 = -2564258213129321088L;
      long var31 = -8332155003075004518L;
      IiIlIIiliIlIIi var10 = llIiIlilIiIl.Illlllllllll(s, this.lIlIiIllIl);
      var31 ^= ((long)(var10 != null ? 1 : 0) << 32 ^ var31) & -1L << 32;
      var31 ^= ((long)((int)(var31 >>> 32) != 0 && this.IIillIllIl.lIIilliIIill(var10) >= 0 ? 1 : 0) ^ var31) & -1L >>> 32;
      String var13 = IliIlllilIi<invokedynamic>() + i;
      float var14 = w && (int)(var31 >>> 32) != 0 ? live.lIiiIiIlilli(var13, y, Math.max(ti, x), top, 30.0F) : 0.0F;
      lIlIIIliIlIIIl.IIillIiliIil(ctx, y, ti, top, 30.0F, i, var14);
      class_1799 var15 = s.iIIiIilill ? IIIIIllIIIIl(s.illlIilill != class_1802.field_8687 ? s.illlIilill : s.lillIilill) : s.IIilIilill;
      iiIIIlIIlIIl(ctx, var15, y + 8.0F, ti + 7.0F, 1.0F);
      float var16 = y + 32.0F;
      String var17;
      String var18;
      if (s.iIIiIilill) {
         class_1792 var19 = s.illlIilill != class_1802.field_8687 ? s.illlIilill : s.lillIilill;
         var33 ^= ((long)(s.illlIilill != class_1802.field_8687 ? s.IillIilill : s.iillIilill) << 32 ^ var33) & -1L << 32;
         var17 = IliIlllilIi<invokedynamic>() + IiiIlliiIl.IlIlllIlilIl(var19);
         var18 = IliIlllilIi<invokedynamic>() + s.iIilIilill + (s.iIilIilill == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + (int)(var33 >>> 32);
      } else {
         var17 = s.iliIiiliiiii() + (s.iIilIilill > 1 ? IliIlllilIi<invokedynamic>() + s.iIilIilill : "");
         var18 = IliIlllilIi<invokedynamic>() + Iiililiili(s);
      }

      String var37;
      if ((int)(var31 >>> 32) == 0) {
         var37 = IliIlllilIi<invokedynamic>();
         var33 ^= (-47749157179359232L ^ var33) & -1L << 32;
      } else if ((int)var31 != 0) {
         var37 = IliIlllilIi<invokedynamic>();
         var33 ^= ((long)lliIlIllIl << 32 ^ var33) & -1L << 32;
      } else if (!s.iIlIlllllill()) {
         var37 = IliIlllilIi<invokedynamic>();
         var33 ^= ((long)IliIlIllIl << 32 ^ var33) & -1L << 32;
      } else {
         var37 = s.liiiIIllIl() + IliIlllilIi<invokedynamic>();
         var33 ^= (-32772477369188352L ^ var33) & -1L << 32;
      }

      float var21 = lIlIIIliIlIIIl.IIlllIlliIll(var37, 0.82F);
      float var22 = top - 32.0F - var21 - 18.0F;
      var33 ^= ((long)((int)(var31 >>> 32) != 0 ? IilIIIIililIIIIi.Illlllllilll(-920587, -1, 0.2 * (double)var14) : -7630437) ^ var33) & -1L >>> 32;
      lIlIIIliIlIIIl.Illlllllilll(llilliilililliil.IIiilIiiiIii().Iiilliiliiil(var17, var22 / 0.95F), var16, ti + 4.0F, 11.0F, 0.95F, (int)var33);
      lIlIIIliIlIIIl.Illlllllilll(llilliilililliil.IIiilIiiiIii().Iiilliiliiil(var18, var22 / 0.82F), var16, ti + 15.0F, 10.0F, 0.82F, -7630437);
      float var24 = y + top - 10.0F - var21;
      if ((int)(var31 >>> 32) != 0 && var14 > 0.01F && (int)var31 == 0) {
         String var25 = IliIlllilIi<invokedynamic>();
         float var26 = lIlIIIliIlIIIl.IIlllIlliIll(var25, 0.82F) + 14.0F;
         float var27 = y + top - 8.0F - var26;
         float var28 = llilliilililliil.IIIllIIliIIl(ti + 7.0F);
         float var29 = IliiIilliiIi.IilliliilIIi(var14);

         try {
            lIlIIIliIlIIIl.IlIlllIlilIl(ctx, var27, var28, var26, 16.0F, 1.0F);
            lIlIIIliIlIIIl.Illlllllilll(var25, llilliilililliil.IIIllIIliIIl(var27 + 7.0F), var28, 16.0F, 0.82F, llilliilililliil.Iiiiliiiiiii());
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var29);
         }

         var24 -= var26 * var14;
      }

      lIlIIIliIlIIIl.Illlllllilll(var37, var24, ti, 30.0F, 0.82F, (int)(var33 >>> 32));
      if (w && (int)(var31 >>> 32) != 0) {
         float var38 = Math.max(ti, x);
         float var39 = Math.min(ti + 30.0F, x + this.lIiIiIllIl) - var38;
         if (var39 > 1.0F && i < this.lliilIllIl.size()) {
            live.IIIllIIliIIl(var13, y, var38, top, var39, (Runnable)this.lliilIllIl.get(i));
         }
      }

   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 28549) ^ 'ꛠ') - 26575) ^ var5))) + var5))))) + '\uf748') + var5) + var5))))) - var5) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String iiiliIIIii(class_1792 count, int item) {
      return count == class_1802.field_8687 ? item + (item == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) : item + IliIlllilIi<invokedynamic>() + IiiIlliiIl.IlIlllIlilIl(count);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '艔'))))) >>> 13 | (char)(-((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '艔'))))) << 3) + 'ꘌ') ^ 17203) << 10 | (char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '艔'))))) >>> 13 | (char)(-((char)(~((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '艔'))))) << 3) + 'ꘌ') ^ 17203) >>> 6) - 22586) - var5) - var5) + '覼') + 2503) + var5) + var5))) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private float IIIlilIIli(class_332 ctx, iIIiliiIlIilii pad, IiIlIIiliIlIIi index, int y, float t, float s) {
      long var32 = 1162649884878804581L;
      long var34 = -6232417240764686197L;
      long var28 = 7286608758381659937L;
      long var30 = 3621205587753456962L;
      var28 ^= ((long)pad.lilIlliIIl << 32 ^ var28) & -1L << 32;
      float var8 = pad.lIIIlliIIl + t;
      float var9 = pad.IlIIlliIIl - t * 2.0F;
      lIlIIIliIlIIIl.lIiiIiIlilli(ctx, var8, s, 30.0F);
      iiIIIlIIlIIl(ctx, this.liiiiiiiii(index), var8 + 3.0F, s + 3.0F, 1.5F);
      float var10 = var8 + 30.0F + 10.0F;
      float var11 = var9 - 30.0F - 10.0F;
      llilliilililliil.lIlIliIlIl(this.IIililIili(index.Iilllilliill(), var11, 1.1F), var10, s + 3.0F, 1.1F, -920587);
      lIlIIIliIlIIIl.Illlllllilll(this.IIililIili(this.iIIliIlIli(index, y == 0 && this.IIillIllIl.iiilllIIIill().size() > 1), var11, 0.82F), var10, s + 17.0F, 11.0F, 0.82F, -7630437);
      float var12 = Math.min(104.0F, var9 - this.llIliilIli() - 8.0F);
      var28 ^= ((long)(var12 < 84.0F ? 1 : 0) ^ var28) & -1L >>> 32;
      if ((int)var28 != 0) {
         var12 = var9;
      }

      float var14 = s + 30.0F + 12.0F;
      if (index.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl) {
         var14 = this.lIlliiIlli(ctx, pad, (boolean)((int)(var28 >>> 32)), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), var14, var8, var9, var12, (boolean)((int)var28), IliIlllilIi<invokedynamic>(), index.IlliiIilillliiIili > 0 ? index.IlliiIilillliiIili + IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), this.illilIllIl, this.iililIllIl);
      }

      String var15 = index.liliiIiliiiliiIili <= 0 ? IliIlllilIi<invokedynamic>() : index.liliiIiliiiliiIili + (index.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
      var14 = this.lIlliiIlli(ctx, pad, (boolean)((int)(var28 >>> 32)), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), var14, var8, var9, var12, (boolean)((int)var28), IliIlllilIi<invokedynamic>(), var15, this.IililIllIl, this.IIiilIllIl);
      if (index.iIIiiIiliIlIiiIili == ililIlIiilIl.IliIIilllliIIill && this.IiIIIlliIIIl(index.IiIiiIililiIiiIili) > 1) {
         var14 = this.lIlliiIlli(ctx, pad, (boolean)((int)(var28 >>> 32)), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), var14, var8, var9, var12, (boolean)((int)var28), IliIlllilIi<invokedynamic>(), IliiiiIilliiiiIi.iliIiiliiiii(Math.max(1, index.iiIiiIiliIIliiIili)), this.lililIllIl, this.lIiilIllIl);
      }

      float var16 = (int)(var28 >>> 32) != 0 ? pad.lIiiIiIlilli(IliIlllilIi<invokedynamic>(), var8, var14, var9, 20.0F) : 0.0F;
      float var17 = this.iiilllIIIill.IiIlliIliiIl().IilliliilIIi(IliIlllilIi<invokedynamic>(), index.liiliIiliiiiliIili ? 1.0F : 0.0F, 16.0F);
      lilliiilli(var8, var14, this.IIililIili(IliIlllilIi<invokedynamic>(), var9 - 22.0F - 6.0F, 0.82F), var16);
      iIiIIlIiIliIIlIi.iIlIlllllill(ctx, Math.round(var8 + var9 - 22.0F), Math.round(var14 + 5.0F), (double)var17, (double)var16);
      if ((int)(var28 >>> 32) != 0) {
         pad.IIIllIIliIIl(IliIlllilIi<invokedynamic>(), var8, var14, var9, 20.0F, this.liIilIllIl);
      }

      var14 += 28.0F;
      var14 = this.IiIliliIli(ctx, pad, (boolean)((int)(var28 >>> 32)), var8, var14, var9, y);
      var14 += 12.0F;
      IIIiiIillIIiiIil.IilliliilIIi(ctx, var8, llilliilililliil.IIIllIIliIIl(var14), var9, IIIiiIillIIiiIil.Illlllllilll(), IilIIIIililIIIIi.IIillIiliIil());
      var14 += 8.0F;
      var30 ^= ((long)this.IIillIllIl.IliIlllilIi() << 32 ^ var30) & -1L << 32;
      String var19 = index.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
      this.illliIilli(var8, var14, var9, var19, index.liliiIiliiiliiIili > 0 ? index.lliiiIiliiliiiIili + IliIlllilIi<invokedynamic>() + index.liliiIiliiiliiIili : Integer.toString(index.lliiiIiliiliiiIili), index.lliiiIiliiliiiIili > 0 ? lliIlIllIl : -7630437);
      var14 += 13.0F;
      var30 ^= ((long)(index.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.IilIliilIl ? index.IlIlllIlilIl() : 0) ^ var30) & -1L >>> 32;
      if ((int)var30 > 0) {
         String var21 = IliIlllilIi<invokedynamic>().equals(index.llIiiIiliilIiiIili) ? IliIlllilIi<invokedynamic>() : index.llIiiIiliilIiiIili + IliIlllilIi<invokedynamic>();
         this.illliIilli(var8, var14, var9, IliIlllilIi<invokedynamic>(), lIIllilliIIllill.IliIlllilIi((int)var30) + IliIlllilIi<invokedynamic>() + var21, -7630437);
         var14 += 13.0F;
      }

      IlIlIlllIlIl var44 = this.liiIiIllIl == index ? this.IiiIiIllIl : null;
      if ((int)(var30 >>> 32) != 0 && var44 != null) {
         String var22 = var44.IliIlllilIi() >= 0 ? var44.IliIlllilIi() + IliIlllilIi<invokedynamic>() + var44.liiiIIllIl() : (var44.lIiiIiIlilli() > 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
         this.illliIilli(var8, var14, var9, index.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), var22, var44.IliIlllilIi() >= 0 ? -920587 : -7630437);
         var14 += 13.0F;
         String var23 = var44.iIlIlllllill() + IliIlllilIi<invokedynamic>() + var44.IilliliilIIi() + IliIlllilIi<invokedynamic>() + (var44.lIiiIiIlilli() > 0 ? IliIlllilIi<invokedynamic>() + var44.lIiiIiIlilli() + IliIlllilIi<invokedynamic>() : "");
         this.illliIilli(var8, var14, var9, IliIlllilIi<invokedynamic>(), var23, -7630437);
         var14 += 13.0F;
         if ((int)var30 > 0 && var44.iliIiiliiiii() > 0) {
            var32 ^= ((long)var44.iliIiiliiiii() << 32 ^ var32) & -1L << 32;
            this.illliIilli(var8, var14, var9, IliIlllilIi<invokedynamic>() + lIIllilliIIllill.IliIlllilIi((int)var30) + IliIlllilIi<invokedynamic>(), (int)(var32 >>> 32) + ((int)(var32 >>> 32) == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()), -7630437);
            var14 += 13.0F;
         }
      } else {
         this.illliIilli(var8, var14, var9, IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -11117467);
         var14 += 13.0F;
      }

      String var45 = this.IIillIllIl.lllillillill(index);
      if (!var45.isEmpty()) {
         String[] var46 = this.iliiiIiiii(IliIlllilIi<invokedynamic>() + var45, var9, 3, 0.82F);
         String[] var24 = var46;
         var32 ^= ((long)var46.length ^ var32) & -1L >>> 32;

         for(long var52 = var34 ^ (0L ^ var34) & -1L << 32; (int)(var52 >>> 32) < (int)var32; var52 += 4294967296L) {
            String var27 = var24[(int)(var52 >>> 32)];
            lIlIIIliIlIIIl.Illlllllilll(var27, var8, var14, 13.0F, 0.82F, IliIlIllIl);
            var14 += 11.0F;
         }
      }

      return var14;
   }

   private static int[] lIIIiiIIIi(IiIlIIiliIlIIi t) {
      class_1792 var1 = t.iliIiiliiiii();
      return var1 != null && var1.method_7882() >= 64 ? IiiIlIllIl : iliIlIllIl;
   }

   public boolean IIIIllIIIl(iIIiliiIlIilii button, double y, double stage, int x) {
      if (!this.IiIIiIllIl) {
         return false;
      } else {
         return this.ilIIiIllIl != null && this.ilIIiIllIl.Iiilliiliiil(y, stage, x);
      }
   }

   private float IliIilliIi(class_332 s, iIIiliiIlIilii stack, float off, float pad, boolean ctx) {
      long var17 = -2661038954249622194L;
      long var19 = -6117123355914716388L;
      long var15 = 4634237628120952163L;
      float var6 = Math.min(300.0F, stack.IlIIlliIIl - off * 2.0F);
      float var7 = stack.lIIIlliIIl + (stack.IlIIlliIIl - var6) / 2.0F;
      float var8 = var6 - 28.0F;
      if (var8 != this.lIlliIllIl) {
         this.lIlliIllIl = var8;

         for(var15 ^= (0L ^ var15) & -1L << 32; (int)(var15 >>> 32) < illllIllIl.length; var15 += 4294967296L) {
            this.llIIiIllIl[(int)(var15 >>> 32)] = Math.max(36.0F, 17.0F + (float)this.iliiiIiiii(illllIllIl[(int)(var15 >>> 32)], var8, 4, 0.82F).length * 9.5F);
         }
      }

      float var9 = 78.0F;
      float[] var10 = this.llIIiIllIl;
      var15 ^= ((long)var10.length ^ var15) & -1L >>> 32;

      for(var17 ^= (0L ^ var17) & -1L << 32; (int)(var17 >>> 32) < (int)var15; var17 += 4294967296L) {
         float var13 = var10[(int)(var17 >>> 32)];
         var9 += var13;
      }

      float var21 = !ctx && var9 + off * 2.0F <= stack.llIIlliIIl ? stack.iIIIlliIIl + Math.max(off, (stack.llIIlliIIl - var9) / 2.0F) : stack.iIIIlliIIl + off - pad;
      String var11 = this.IIililIili(IliIlllilIi<invokedynamic>(), stack.IlIIlliIIl - off * 2.0F, 1.1F);
      llilliilililliil.lIlIliIlIl(var11, llilliilililliil.IIIllIIliIIl(stack.lIIIlliIIl + (stack.IlIIlliIIl - llilliilililliil.IiIIlliIIl(var11, 1.1F)) / 2.0F), var21, 1.1F, -920587);
      float var12 = var21 + 22.0F;
      var17 ^= ((long)(this.IIillIllIl.lIiilliIiill(IlliliIillliliIi.llllIiiIIi).isEmpty() && this.IIillIllIl.lIiilliIiill(IlliliIillliliIi.IlllIiiIIi).isEmpty() && this.IIillIllIl.lIiilliIiill(IlliliIillliliIi.IillIiiIIi).isEmpty() ? 0 : 1) ^ var17) & -1L >>> 32;

      for(long var27 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var27 >>> 32) < lllllIllIl.length; var27 += 4294967296L) {
         this.liiIiiiiIi(s, var7, var12, var6, (int)(var27 >>> 32) + 1, lllllIllIl[(int)(var27 >>> 32)], illllIllIl[(int)(var27 >>> 32)], (int)(var27 >>> 32) == 1 && (int)var17 != 0);
         var12 += this.llIIiIllIl[(int)(var27 >>> 32)];
      }

      var12 += 12.0F;
      lIlIIIliIlIIIl.Illlllllilll(this.IIililIili(IliIlllilIi<invokedynamic>(), var6, 0.82F), var7, var12, 12.0F, 0.82F, -7630437);
      var12 += 14.0F;
      this.iliIiIiiIi(s, stack, var7, var12, var6);
      return var12 + 30.0F;
   }

   public boolean lIlIliIlIl(int codepoint, int modifiers) {
      return this.IiIIiIllIl && this.ilIIiIllIl != null && this.ilIIiIllIl.Iliilliiilii(codepoint, modifiers);
   }

   private IiIlIIiliIlIIi iIIilIlIil() {
      return this.IIIillIIil(this.iiilllIIIill.iliIiiliiiii());
   }

   private static void iiIIIlIIlIIl(class_332 scale, class_1799 ctx, float x, float y, float stack) {
      if (ctx != null && !ctx.method_7960()) {
         Matrix3x2fStack var5 = scale.method_51448();
         var5.pushMatrix();

         try {
            var5.translate(x, y);
            if (stack != 1.0F) {
               var5.scale(stack, stack);
            }

            llllIIlilllIIl.iIlIlllllill(scale, ctx, 0, 0, 16);
         } finally {
            var5.popMatrix();
         }

      }
   }

   private void ilIIiIiIIi() {
      long var6 = 6936922756325962407L;
      var6 ^= ((long)this.iiilllIIIill.iliIiiliiiii() << 32 ^ var6) & -1L << 32;
      IiIlIIiliIlIIi var2 = this.IIIillIIil((int)(var6 >>> 32));
      if (var2 != null) {
         if (this.IIillIllIl.IliIlllilIi()) {
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
         } else {
            long var3 = System.currentTimeMillis();
            if (this.lliIiIllIl == (int)(var6 >>> 32) && var3 - this.iIiIiIllIl <= 2500L) {
               this.lliIiIllIl = -1;
               this.IIillIllIl.ilIillIiIill((int)(var6 >>> 32));
               this.lIliliIlil(IliIlllilIi<invokedynamic>() + var2.Iilllilliill(), true);
               var6 ^= ((long)this.IIillIllIl.iiilllIIIill().size() ^ var6) & -1L >>> 32;
               if ((int)var6 > 0) {
                  this.iiilllIIIill.Iilllilliill(Math.min((int)(var6 >>> 32), (int)var6 - 1), false);
               }

               this.iiilllIIIill.Ililllililil();
            } else {
               this.lliIiIllIl = (int)(var6 >>> 32);
               this.iIiIiIllIl = var3;
            }
         }
      }
   }

   private static class_1799 IIIIIllIIIIl(class_1792 item) {
      return item == null ? new class_1799(class_1802.field_8687) : new class_1799(item);
   }

   private void liIIiiiIIi() {
      IiIlIIiliIlIIi var1 = this.iIIilIlIil();
      if (var1 != null) {
         var1.liiliIiliiiiliIili = !var1.liiliIiliiiiliIili;
         this.IIillIllIl.IIlilllIlill(var1);
      }
   }

   private void Illlilllli(class_332 s, iIIiliiIlIilii icon, boolean on, String w, float key, float y, float act, String ctx, String text, boolean x, Runnable live) {
      long var20 = -1573569116228563294L;
      float var12 = on && x ? icon.lIiiIiIlilli(w, key, y, act, 16.0F) : 0.0F;
      var20 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(s, key + act / 2.0F, y + 8.0F, icon.iliIiiliiiii(w, 0.05F), 0.0F) << 32 ^ var20) & -1L << 32;

      try {
         lIlIIIliIlIIIl.iliIiiliiiii(s, key, y, act, 16.0F, var12, 0.0F);
         var20 ^= ((long)(x ? lIlIIIliIlIIIl.IiIlliIliiIl(var12, 0.0F) : -11117467) ^ var20) & -1L >>> 32;
         String var15 = this.IIililIili(text, act - 8.0F, 0.82F);
         float var16 = lIlIIIliIlIIIl.IIlllIlliIll(var15, 0.82F);
         float var17 = ctx == null ? 0.0F : 12.0F;
         if (var17 + var16 > act - 10.0F) {
            var17 = 0.0F;
         }

         float var18 = llilliilililliil.IIIllIIliIIl(key + (act - var17 - var16) / 2.0F);
         if (var17 > 0.0F) {
            lIlIIIliIlIIIl.IIIilIIiiIIi(lIlIIiliIlIIil.IiiIlliiIl(ctx), var18, llilliilililliil.IIIllIIliIIl(y + 4.0F), 8.0F, (int)var20);
         }

         lIlIIIliIlIIIl.Illlllllilll(var15, var18 + var17, y, 16.0F, 0.82F, (int)var20);
      } finally {
         lIlIIIliIlIIIl.IIlilIliiIli(s, (boolean)((int)(var20 >>> 32)));
      }

      if (on && x) {
         icon.IIIllIIliIIl(w, key, y, act, 16.0F, live);
      }

   }

   public void iIIIlIlIIl(iIIiliiIlIilii dx, double stage, double button, double x, double y, int dy) {
      if (this.IiIIiIllIl && this.ilIIiIllIl != null) {
         this.ilIIiIllIl.IiIiliIiiiIi(stage, button, dy);
      }

   }

   public boolean Iiiiliiiiiii(iIiilIliil y, double side, double amount, double x) {
      this.lllIiIllIl = Math.max(0.0F, Math.min(Math.max(0.0F, this.illIiIllIl - this.IilIiIllIl), this.lllIiIllIl - (float)x * 24.0F));
      return true;
   }

   protected class_437 IIiIllIiIl() {
      return this.liIIiIllIl ? null : this.Iiilllliilll;
   }

   public float lIiiIiIlilli() {
      return 360.0F;
   }

   private static void lilliiilli(float y, float hv, String text, float x) {
      lIlIIIliIlIIIl.Illlllllilll(text, y, hv, 20.0F, 0.82F, IilIIIIililIIIIi.Illlllllilll(-5854026, -920587, (double)x));
   }

   private Map<String, List<IilliIllilliIl>> iiIilIIlil() {
      LinkedHashMap var1 = new LinkedHashMap();
      var1.put(IliIlllilIi<invokedynamic>(), new ArrayList());

      for(IilliIllilliIl var3 : this.IIillIllIl.IiIlliIliiIl()) {
         if (!var3.iliIiiliiiii() && !lilllIllIl.contains(var3.IliIlllilIi())) {
            String var4 = var3.IilliliilIIi();
            ((List)var1.computeIfAbsent(var4 == null ? IliIlllilIi<invokedynamic>() : var4, (k) -> new ArrayList())).add(var3);
         }
      }

      var1.values().removeIf(List::isEmpty);
      return var1;
   }

   private float IIliilIlii(class_332 ctx, float w, float x, float y) {
      long var11 = -6545752425282761521L;
      long var13 = 4545798855149761094L;
      float var5 = ilIiiIiIii(ctx, w, x, y, IliIlllilIi<invokedynamic>());
      var11 ^= ((long)this.IIillIllIl.IliIlllilIi() << 32 ^ var11) & -1L << 32;
      var11 ^= (0L ^ var11) & -1L >>> 32;
      float var8 = var5;

      for(long var17 = var13 ^ (0L ^ var13) & -1L << 32; (int)(var17 >>> 32) < IlIllIllIl.length; var17 += 4294967296L) {
         List var10 = this.IIillIllIl.lIiilliIiill(IlIllIllIl[(int)(var17 >>> 32)]);
         if (IlIllIllIl[(int)(var17 >>> 32)] == IlliliIillliliIi.IillIiiIIi && !var10.isEmpty()) {
            var11 ^= (1L ^ var11) & -1L >>> 32;
         }

         this.iIliiIllii(ctx, (int)(var17 >>> 32), var10, w, var8, x, (boolean)((int)(var11 >>> 32)));
         var8 += 20.0F;
      }

      if (this.lIillIllIl != null) {
         String var9 = (int)var11 != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
         this.Iliiilliii(ctx, IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), w, var8, x, var9, this.lIillIllIl, this.IIlilIllIl);
         var8 += 20.0F;
      }

      if ((int)(var11 >>> 32) != 0) {
         lIlIIIliIlIIIl.Illlllllilll(this.IIililIili(IliIlllilIi<invokedynamic>(), x, 0.82F), w, var8, 13.0F, 0.82F, -11117467);
         var8 += 13.0F;
      }

      return var8;
   }

   public void IIIllIIliIIl(class_332 ctx, iIIiliiIlIilii s) {
      long var8 = 1954419090409037570L;
      if (this.IiIIiIllIl) {
         if (this.ilIIiIllIl != null) {
            this.ilIIiIllIl.IilliliilIIi(ctx, s);
         }

      } else if (this.IIlIiIllIl != null) {
         this.iIiliIlili(ctx, s);
      } else {
         float var3 = s.IlIIlliIIl < 180.0F ? 10.0F : 14.0F;
         float var4 = llilliilililliil.IIIllIIliIIl(this.IIIIiIllIl.IiIlliIliiIl());
         var8 ^= ((long)(!this.iiilllIIIill.IIIllIIliIIl().iIlIlllllill() ? 1 : 0) << 32 ^ var8) & -1L << 32;
         float var6;
         if (this.IIillIllIl.iiilllIIIill().isEmpty()) {
            var6 = this.IliIilliIi(ctx, s, var3, var4, (boolean)((int)(var8 >>> 32)));
         } else {
            IiIlIIiliIlIIi var7 = this.IIIillIIil(s.iIlIlliIIl);
            var6 = var7 == null ? s.iIIIlliIIl + var3 - var4 : this.IIIlilIIli(ctx, s, var7, s.iIlIlliIIl, var3, s.iIIIlliIIl + var3 - var4);
         }

         if ((int)(var8 >>> 32) != 0) {
            var6 = this.lIiIiiIiIi(ctx, s, var3, var6);
         }

         if (s.lilIlliIIl) {
            this.IIIIiIllIl.IliIlllilIi(var6 + var4 + var3 - s.iIIIlliIIl, s.llIIlliIIl);
         }

      }
   }

   public void llIIlilIIl(iIIiliiIlIilii y, double stage, double x, int button) {
      if (this.IiIIiIllIl && this.ilIIiIllIl != null) {
         this.ilIIiIllIl.IIlilIliiIli(stage, x, button);
      }

   }

   private void IlIIillIIi(int dir) {
      long var4 = 1712478986417800440L;
      var4 ^= ((long)this.iiilllIIIill.iliIiiliiiii() << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) >= 0) {
         this.lliIiIllIl = -1;
         var4 ^= ((long)this.IIillIllIl.liIilliiIill((int)(var4 >>> 32), dir) ^ var4) & -1L >>> 32;
         if ((int)var4 != (int)(var4 >>> 32)) {
            this.iiilllIIIill.Iilllilliill((int)var4, false);
         }

      }
   }

   private void liiIiiiiIi(class_332 ctx, float x, float w, float title, int n, String y, String done, boolean sub) {
      long var19 = 7738621541733014945L;
      float var9 = 9.0F;
      float var10 = x + var9;
      float var11 = w + var9;
      var19 ^= ((long)(sub ? lliIlIllIl : lIlIIIliIlIIIl.Iiiiliiiiiii(IlIIilIlllIIilIl.lliiIlliIl, 0.85F)) << 32 ^ var19) & -1L << 32;
      IIIiiIillIIiiIil.IlIlllIlilIl(ctx, var10 - var9, var11 - var9, var9 * 2.0F, var9 * 2.0F, var9, lIlIIIliIlIIIl.Iiiiliiiiiii(sub ? -8393375 : IlIIilIlllIIilIl.lliiIlliIl, 0.12F));
      IIIiiIillIIiiIil.Iiilliiliiil(ctx, var10 - var9, var11 - var9, var9 * 2.0F, var9 * 2.0F, var9, IIIiiIillIIiiIil.Illlllllilll() * 1.5F, (int)(var19 >>> 32));
      String var13 = Integer.toString(n);
      float var14 = lIlIIIliIlIIIl.IIlllIlliIll(var13, 0.82F);
      lIlIIIliIlIIIl.Illlllllilll(var13, llilliilililliil.IIIllIIliIIl(var10 - var14 / 2.0F), var11 - var9, var9 * 2.0F, 0.82F, sub ? lliIlIllIl : -920587);
      float var15 = x + var9 * 2.0F + 10.0F;
      float var16 = title - (var15 - x);
      lIlIIIliIlIIIl.Illlllllilll(this.IIililIili(y, var16, 0.95F), var15, w, 11.0F, 0.95F, -920587);
      String[] var17 = this.iliiiIiiii(done, var16, 4, 0.82F);

      for(long var22 = var19 ^ (0L ^ var19) & -1L >>> 32; (int)var22 < var17.length; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
         lIlIIIliIlIIIl.Illlllllilll(var17[(int)var22], var15, w + 11.0F + (float)((int)var22) * 9.5F, 10.0F, 0.82F, -7630437);
      }

   }

   public static String lllllillll(String arg) {
      long var8 = 6611717565445803724L;
      class_310 var1 = class_310.method_1551();
      String var2 = arg == null ? "" : arg.trim().toLowerCase(Locale.ROOT);
      ilIllIiIll var5 = llilIllililIll.iliIiiliiiii(llIiIlilIiIl.class);
      llIiIlilIiIl var10000;
      if (var5 instanceof llIiIlilIiIl var4) {
         var10000 = var4;
      } else {
         var10000 = null;
      }

      llIiIlilIiIl var3 = var10000;
      if (var3 == null) {
         return IliIlllilIi<invokedynamic>();
      } else if (var2.equals(IliIlllilIi<invokedynamic>())) {
         IIllllIlll(var3);
         return IliIlllilIi<invokedynamic>();
      } else if (var2.equals(IliIlllilIi<invokedynamic>())) {
         iIlllIllll(var3, Iillllilll(), IliIlllilIi<invokedynamic>(), 4);
         return IliIlllilIi<invokedynamic>();
      } else if (var2.startsWith(IliIlllilIi<invokedynamic>())) {
         var8 ^= (21474836480L ^ var8) & -1L << 32;

         try {
            if (var2.length() > 11) {
               var8 ^= ((long)Math.max(1, Math.min(5, Integer.parseInt(var2.substring(11).trim()))) << 32 ^ var8) & -1L << 32;
            }
         } catch (NumberFormatException var10) {
         }

         iIlllIllll(var3, iilllIIill((int)(var8 >>> 32)), IliIlllilIi<invokedynamic>(), (int)(var8 >>> 32));
         return IliIlllilIi<invokedynamic>() + (int)(var8 >>> 32) + IliIlllilIi<invokedynamic>();
      } else {
         class_437 var13 = var1.field_1755;
         if (var13 instanceof iIIiIIIlIlIiIIIl) {
            iIIiIIIlIlIiIIIl var12 = (iIIiIIIlIlIiIIIl)var13;
            String[] var14 = var2.split(IliIlllilIi<invokedynamic>());

            try {
               String var6 = var14[0];
               var8 ^= ~var8 & -1L >>> 32;
               switch (var6.hashCode()) {
                  case -1367724422:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (5L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case -934610812:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (12L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 3739:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (10L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 3832:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (14L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 96417:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (2L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 113754:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (7L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 3015911:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (1L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 3089570:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (11L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 3344077:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (8L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 3440673:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (6L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 3540994:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (4L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 94746189:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (9L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 106934601:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (13L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 109757538:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (3L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 1434631203:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (0L ^ var8) & -1L >>> 32;
                     }
                     break;
                  case 1631563546:
                     if (var6.equals(IliIlllilIi<invokedynamic>())) {
                        var8 ^= (15L ^ var8) & -1L >>> 32;
                     }
               }

               switch ((int)var8) {
                  case 0 -> var12.llIililIil();
                  case 1 -> var12.IiIilliIil();
                  case 2 -> var12.lililiilil();
                  case 3 -> var12.Illillllil();
                  case 4 -> var12.illilIilil();
                  case 5 -> var12.IIiillIiil();
                  case 6 -> var12.iIiilIliil(Integer.parseInt(var14[1]));
                  case 7 -> var12.iiilllIIIill.Iilllilliill(Integer.parseInt(var14[1]), true);
                  case 8 -> var12.IilIililIi(Integer.parseInt(var14[1]));
                  case 9 -> var12.iilIiIIiIi(Integer.parseInt(var14[1]));
                  case 10 -> var12.IlIIillIIi(-1);
                  case 11 -> var12.IlIIillIIi(1);
                  case 12 -> var12.ilIIiIiIIi();
                  case 13 -> var12.IIlIilIlIi(Integer.parseInt(var14[1]));
                  case 14 -> var12.lliililiil();
                  case 15 -> var12.iIlIiIllIi(Integer.parseInt(var14[1]));
                  default -> {
                     return IliIlllilIi<invokedynamic>() + arg;
                  }
               }
            } catch (RuntimeException var11) {
               return IliIlllilIi<invokedynamic>() + arg;
            }

            return IliIlllilIi<invokedynamic>() + var2 + IliIlllilIi<invokedynamic>() + var12.iiIIiIllIl + IliIlllilIi<invokedynamic>() + var12.IiIIiIllIl + IliIlllilIi<invokedynamic>() + (var12.IIlIiIllIl != null) + IliIlllilIi<invokedynamic>() + var3.iiilllIIIill().size() + IliIlllilIi<invokedynamic>() + var12.iiilllIIIill.iliIiiliiiii();
         } else {
            return IliIlllilIi<invokedynamic>();
         }
      }
   }

   private void lililiilil() {
      if (this.IIillIllIl.IliIlllilIi()) {
         this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
      } else if (!this.IIillIllIl.llIIililIIil()) {
         this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
      } else {
         this.liIIiIllIl = true;
         this.iIiIlIliIl();
      }
   }

   private IiIlIIiliIlIIi IIIillIIil(int i) {
      List var2 = this.IIillIllIl.iiilllIIIill();
      return i >= 0 && i < var2.size() ? (IiIlIIiliIlIIi)var2.get(i) : null;
   }

   private float IiIliliIli(class_332 s, iIIiliiIlIilii y, boolean index, float w, float live, float ctx, int x) {
      long var16 = 7463716634802977815L;
      long var18 = 7605789932863790382L;
      float var8 = 62.0F;
      float var9 = w + 62.0F + 4.0F;
      float var10 = w + ctx - 70.0F;
      float var11 = 70.0F;
      float var12 = live;
      var16 ^= (4294967296L ^ var16) & -1L << 32;
      if (ctx < 206.0F) {
         float var14 = (ctx - 8.0F) / 3.0F;
         if (var14 >= 40.0F) {
            var11 = var14;
            var8 = var14;
            var9 = w + var14 + 4.0F;
            var10 = var9 + var14 + 4.0F;
         } else {
            var8 = (ctx - 4.0F) / 2.0F;
            var9 = w + var8 + 4.0F;
            var10 = w;
            var11 = ctx;
            var12 = live + 16.0F + 4.0F;
         }

         var16 ^= ((long)(12.0F + this.iiIliIIlli() <= Math.min(var8, var11) - 10.0F ? 1 : 0) << 32 ^ var16) & -1L << 32;
      }

      var16 ^= ((long)this.IIillIllIl.iiilllIIIill().size() ^ var16) & -1L >>> 32;
      this.Illlilllli(s, y, index, IliIlllilIi<invokedynamic>(), w, live, var8, (int)(var16 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : null, IliIlllilIi<invokedynamic>(), x > 0, this.llIilIllIl);
      this.Illlilllli(s, y, index, IliIlllilIi<invokedynamic>(), var9, live, var8, (int)(var16 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : null, IliIlllilIi<invokedynamic>(), x < (int)var16 - 1, this.ilIilIllIl);
      var18 ^= ((long)(this.lliIiIllIl == x ? 1 : 0) << 32 ^ var18) & -1L << 32;
      if ((int)(var18 >>> 32) != 0) {
         IIIiiIillIIiiIil.IlIlllIlilIl(s, var10 - 1.0F, var12 - 1.0F, var11 + 2.0F, 18.0F, 6.0F, lIlIIIliIlIIIl.Iiiiliiiiiii(-1750963, 0.16F));
      }

      this.Illlilllli(s, y, index, IliIlllilIi<invokedynamic>(), var10, var12, var11, (int)(var16 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : null, (int)(var18 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), true, this.IiIilIllIl);
      return var12 + 16.0F;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) - '\udcdf'))) - 30445) - 17399) + 21180) ^ var5))) ^ 19602))) >>> 6 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) - '\udcdf'))) - 30445) - 17399) + 21180) ^ var5))) ^ 19602))) << 10) - '졓'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIiIllIi(int dir) {
      long var6 = 5665728329352928236L;
      IiIlIIiliIlIIi var2 = this.iIIilIlIil();
      if (var2 != null) {
         int[] var3 = lIIIiiIIIi(var2);
         var6 ^= (0L ^ var6) & -1L << 32;

         for(var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < var3.length; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
            if (var3[(int)var6] <= var2.liliiIiliiiliiIili) {
               var6 ^= ((long)((int)var6) << 32 ^ var6) & -1L << 32;
            }
         }

         var6 ^= ((long)Math.max(0, Math.min(var3.length - 1, (int)(var6 >>> 32) + (dir > 0 ? 1 : -1))) ^ var6) & -1L >>> 32;
         if (dir < 0 && var3[(int)(var6 >>> 32)] < var2.liliiIiliiiliiIili) {
            var6 ^= ((long)((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
         }

         var2.liliiIiliiiliiIili = var3[(int)var6];
         this.IIillIllIl.IIlilllIlill(var2);
      }
   }

   public float IilliliilIIi() {
      return 600.0F;
   }

   public boolean Iilililiiili() {
      return this.IiIIiIllIl || this.IIlIiIllIl != null;
   }

   private static void Ilillllill(iiIiiilIIliiil b) {
      if (b != null) {
         b.IIillIiliIil(!b.Iilllilliill());
      }

   }

   private void iliIiIiiIi(class_332 s, iIIiliiIlIilii y, float w, float ctx, float x) {
      long var15 = -662806803271827651L;
      var15 ^= ((long)y.lilIlliIIl << 32 ^ var15) & -1L << 32;
      float var7 = (int)(var15 >>> 32) != 0 ? y.lIiiIiIlilli(IliIlllilIi<invokedynamic>(), w, ctx, x, 30.0F) : 0.0F;
      lIlIIIliIlIIIl.IIillIiliIil(s, w, ctx, x, 30.0F, 0, var7);
      iiIIIlIIlIIl(s, this.IiiilIllIl, w + 8.0F, ctx + 7.0F, 1.0F);
      String var8 = IliIlllilIi<invokedynamic>();
      float var9 = lIlIIIliIlIIIl.IIlllIlliIll(var8, 0.82F) + 14.0F;
      float var10 = w + x - 8.0F - var9;
      float var11 = llilliilililliil.IIIllIIliIIl(ctx + 7.0F);
      lIlIIIliIlIIIl.IlIlllIlilIl(s, var10, var11, var9, 16.0F, var7);
      lIlIIIliIlIIIl.Illlllllilll(var8, llilliilililliil.IIIllIIliIIl(var10 + 7.0F), var11, 16.0F, 0.82F, llilliilililliil.Iiiiliiiiiii());
      float var12 = w + 32.0F;
      float var13 = Math.max(0.0F, var10 - 8.0F - var12);
      var15 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-920587, -1, 0.2 * (double)var7) ^ var15) & -1L >>> 32;
      lIlIIIliIlIIIl.Illlllllilll(this.IIililIili(IliIlllilIi<invokedynamic>(), var13, 0.95F), var12, ctx + 4.0F, 11.0F, 0.95F, (int)var15);
      lIlIIIliIlIIIl.Illlllllilll(this.IIililIili(IliIlllilIi<invokedynamic>(), var13, 0.82F), var12, ctx + 15.0F, 10.0F, 0.82F, -7630437);
      if ((int)(var15 >>> 32) != 0) {
         y.IIIllIIliIIl(IliIlllilIi<invokedynamic>(), w, ctx, x, 30.0F, this.iiIilIllIl);
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) << 5 | (char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) >>> 11) >>> 10 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) << 5 | (char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) >>> 11) << 6) << 8 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) << 5 | (char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) >>> 11) >>> 10 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) << 5 | (char)((char)(-((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '춳') - var5) - '\ude70'))))) - var5) >>> 11) << 6) >>> 8) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void lilIliilIl() {
      super.lilIliilIl();
      if (this.ilIIiIllIl != null) {
         this.ilIIiIllIl.IIIIllIIIl();
      }

   }

   public static void IIllllIlll(llIiIlilIiIl bot) {
      if (bot != null) {
         class_310 var1 = class_310.method_1551();
         var1.method_1507(new iIIiIIIlIlIiIIIl(var1.field_1755, bot, (List)null, "", 0));
      }
   }

   static {
      IlIllIllIl = new IlliliIillliliIi[]{IlliliIillliliIi.llllIiiIIi, IlliliIillliliIi.iIllIiiIIi, IlliliIillliliIi.IlllIiiIIi, IlliliIillliliIi.IillIiiIIi};
      llIllIllIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      ilIllIllIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      IiIllIllIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      lllllIllIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      illllIllIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      IilllIllIl = new String[]{"", IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      lilllIllIl = Set.of(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   }

   public boolean Ililllililil() {
      return true;
   }

   public float IIIilIIiiIIi() {
      this.liilliiill();
      return this.IiIliIllIl;
   }

   private void IlIiillIii(String w, float act, float h, float key, float x, Runnable y) {
      if (this.lllliIllIl) {
         if (this.IilliIllIl != null) {
            this.IilliIllIl.lIiiIiIlilli(w, act, h, key, x, y);
         } else {
            this.lilliIllIl.IIIllIIliIIl(w, act, h, key, x, y);
         }

      }
   }

   private float lIIiiiIIii(String y, float x, float h, float key, float w) {
      if (!this.lllliIllIl) {
         return 0.0F;
      } else {
         return this.IilliIllIl != null ? this.IilliIllIl.liiiIIllIl(y, x, h, key, w) : this.lilliIllIl.lIiiIiIlilli(y, x, h, key, w);
      }
   }

   public void Iiilliiliiil(class_332 index, int y, float x, float size, float ctx) {
      IiIlIIiliIlIIi var6 = this.IIIillIIil(y);
      if (var6 != null) {
         iiIIIlIIlIIl(index, this.liiiiiiiii(var6), x + (ctx - 16.0F) / 2.0F, size + (ctx - 16.0F) / 2.0F, 1.0F);
      }
   }

   public static void iIlllIllll(llIiIlilIiIl profession, List<lIllIilliIllIill> offers, String bot, int level) {
      if (profession != null) {
         class_310 var4 = class_310.method_1551();
         var4.method_1507(new iIIiIIIlIlIiIIIl(var4.field_1755, profession, offers == null ? List.of() : offers, bot, level));
      }
   }

   private float lIlliiIlli(class_332 ctx, iIIiliiIlIilii step, boolean lower, String x, String value, float live, float stepW, float s, float y, boolean w, String key, String lowerKey, IntConsumer stack, IntConsumer text) {
      long var25 = 6000482281265336416L;
      float var15;
      float var16;
      float var17;
      if (w) {
         var15 = stepW;
         var16 = llilliilililliil.IIIllIIliIIl(live + 13.0F);
         var17 = var16 + 16.0F + 4.0F;
      } else {
         var15 = stepW + s - y;
         var16 = llilliilililliil.IIIllIIliIIl(live + 2.0F);
         var17 = live + 20.0F;
      }

      float var18 = lower ? step.lIiiIiIlilli(x, var15, var16, y, 16.0F) : 0.0F;
      if (w) {
         lIlIIIliIlIIIl.Illlllllilll(this.IIililIili(key, s, 0.82F), stepW, live, 13.0F, 0.82F, -5854026);
      } else {
         lilliiilli(stepW, live, this.IIililIili(key, s - y - 8.0F, 0.82F), 0.0F);
      }

      lIlIIIliIlIIIl.iliIiiliiiii(ctx, var15, var16, y, 16.0F, var18, 0.0F);
      float var19 = 7.0F;
      var25 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var18) << 32 ^ var25) & -1L << 32;
      lIlIIIliIlIIIl.IIIilIIiiIIi(lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), llilliilililliil.IIIllIIliIIl(var15 + 6.0F), llilliilililliil.IIIllIIliIIl(var16 + (16.0F - var19) / 2.0F), var19, (int)(var25 >>> 32));
      lIlIIIliIlIIIl.IIIilIIiiIIi(lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), llilliilililliil.IIIllIIliIIl(var15 + y - 6.0F - var19), llilliilililliil.IIIllIIliIIl(var16 + (16.0F - var19) / 2.0F), var19, (int)(var25 >>> 32));
      String var21 = this.IIililIili(lowerKey, y - (6.0F + var19 + 3.0F) * 2.0F, 0.82F);
      float var22 = lIlIIIliIlIIIl.IIlllIlliIll(var21, 0.82F);
      var25 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-920587, IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.22), (double)var18) ^ var25) & -1L >>> 32;
      lIlIIIliIlIIIl.Illlllllilll(var21, llilliilililliil.IIIllIIliIIl(var15 + (y - var22) / 2.0F), var16, 16.0F, 0.82F, (int)var25);
      if (!lower) {
         return var17;
      } else {
         float var24 = y / 2.0F;
         step.IlIlllIlilIl(x, var15 + var24, var16, var24, 16.0F, stack);
         step.IlIlllIlilIl(value, var15, var16, var24, 16.0F, text);
         return var17;
      }
   }

   private void iilIiIIiIi(int r) {
      long var5 = -2941304578568919736L;
      if (r >= 0 && r < IlIllIllIl.length) {
         if (this.IIillIllIl.IliIlllilIi()) {
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
         } else {
            long var2 = System.currentTimeMillis();
            if (this.iliIiIllIl == r && var2 - this.IliIiIllIl <= 2500L) {
               this.iliIiIllIl = -1;
               var5 ^= ((long)this.IIillIllIl.iliillIiiill(IlIllIllIl[r]) << 32 ^ var5) & -1L << 32;
               this.lIliliIlil((int)(var5 >>> 32) == 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + llIllIllIl[r].toLowerCase(Locale.ROOT) + ((int)(var5 >>> 32) > 1 ? IliIlllilIi<invokedynamic>() : ""), (int)(var5 >>> 32) > 0);
            } else {
               this.iliIiIllIl = r;
               this.IliIiIllIl = var2;
            }
         }
      }
   }

   private void Iiliililii(class_332 act, String key, float y, float text, float on, String accent, boolean w, boolean ctx, Runnable x) {
      long var15 = -4489439343709454473L;
      float var10 = w ? this.lIIiiiIIii(key, y, text, on, 16.0F) : 0.0F;
      var15 ^= ((long)lIlIIIliIlIIIl.IiIiliIiiiIi(act, y + on / 2.0F, text + 8.0F, this.iiilllIIIill.IiIlliIliiIl().IiIlliIliiIl(key, 0.05F), 0.0F) << 32 ^ var15) & -1L << 32;

      try {
         lIlIIIliIlIIIl.iliIiiliiiii(act, y, text, on, 16.0F, var10, ctx && w ? 0.55F : 0.0F);
         var15 ^= ((long)(w ? lIlIIIliIlIIIl.IiIlliIliiIl(var10, ctx ? 0.55F : 0.0F) : -11117467) ^ var15) & -1L >>> 32;
         float var13 = lIlIIIliIlIIIl.IIlllIlliIll(accent, 0.82F);
         lIlIIIliIlIIIl.Illlllllilll(accent, llilliilililliil.IIIllIIliIIl(y + (on - var13) / 2.0F), text, 16.0F, 0.82F, (int)var15);
      } finally {
         lIlIIIliIlIIIl.IIlilIliiIli(act, (boolean)((int)(var15 >>> 32)));
      }

      if (w) {
         this.IlIiillIii(key, y, text, on, 16.0F, x);
      }

   }

   public void IiIlliIliiIl(class_332 ctx, iIIiliiIlIilii stage) {
      if (!this.IiIIiIllIl && this.IIlIiIllIl == null) {
         lIlIIIliIlIIIl.Ililllililil(ctx, stage.lIIIlliIIl + stage.IlIIlliIIl - 5.0F, stage.iIIIlliIIl + 4.0F, stage.llIIlliIIl - 8.0F, this.IIIIiIllIl);
      }
   }

   private float iiIliIIlli() {
      if (this.IIlliIllIl < 0.0F) {
         this.IIlliIllIl = Math.max(Math.max(lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F), lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F)), Math.max(lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F), lIlIIIliIlIIIl.IIlllIlliIll(IliIlllilIi<invokedynamic>(), 0.82F)));
      }

      return this.IIlliIllIl;
   }

   public void Iliilliiilii(class_332 side, iIiilIliil ctx) {
      this.IilIiIllIl = ctx.illIiliIilIili;
      float var3 = Math.max(0.0F, this.illIiIllIl - ctx.illIiliIilIili);
      if (this.lllIiIllIl > var3) {
         this.lllIiIllIl = var3;
      }

      float var4 = ctx.lIlIiliiIlIili - llilliilililliil.IIIllIIliIIl(this.IllIiIllIl);
      this.IilliIllIl = ctx;
      this.lilliIllIl = null;
      this.lllliIllIl = true;
      lIlIIIliIlIIIl.Iliilliiilii(side, ctx.iiIIiliIIlIili - 2.0F, ctx.lIlIiliiIlIili, ctx.IllIililllIili + 4.0F, ctx.illIiliIilIili);

      try {
         var4 = this.liIiiiiIii(side, ctx.iiIIiliIIlIili, ctx.IllIililllIili, var4);
         var4 = this.IIliilIlii(side, ctx.iiIIiliIIlIili, ctx.IllIililllIili, var4 + 12.0F);
         var4 = this.lIiiiiIiii(side, ctx.iiIIiliIIlIili, ctx.IllIililllIili, var4 + 12.0F);
      } finally {
         side.method_44380();
      }

      this.illIiIllIl = var4 + llilliilililliil.IIIllIIliIIl(this.IllIiIllIl) - ctx.lIlIiliiIlIili;
   }

   public String Iilllilliill(int index) {
      IiIlIIiliIlIIi var2 = this.IIIillIIil(index);
      return var2 == null ? "" : var2.Iilllilliill();
   }

   private boolean iiiilIIIIi() {
      if (this.IIlIiIllIl != null && IliIlllilIi<invokedynamic>().equals(this.lIlIiIllIl)) {
         for(lIllIilliIllIill var2 : this.IIlIiIllIl) {
            if (IiiIlliiIl.iliIiiliiiii(var2.lIilIilill)) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static List<lIllIilliIllIill> Iillllilll() {
      long var3 = 5242388114032659214L;
      ArrayList var0 = new ArrayList();
      ArrayList var1 = new ArrayList();
      var1.add(new class_1914(new class_9306(class_1802.field_8407, 24), new class_1799(class_1802.field_8687), 16, 2, 0.05F));
      var1.add(new class_1914(new class_9306(class_1802.field_8687, 9), new class_1799(class_1802.field_8536), 12, 1, 0.05F));
      var1.add(new class_1914(new class_9306(class_1802.field_8687, 14), Optional.of(new class_9306(class_1802.field_8529, 1)), llIIIlilIIIl(IliIlllilIi<invokedynamic>(), 1), 12, 5, 0.2F));
      var1.add(new class_1914(new class_9306(class_1802.field_8687, 11), Optional.of(new class_9306(class_1802.field_8529, 1)), llIIIlilIIIl(IliIlllilIi<invokedynamic>(), 3), 12, 12, 10, 0.2F));
      var1.add(new class_1914(new class_9306(class_1802.field_8687, 1), new class_1799(class_1802.field_16539), 12, 5, 0.05F));
      var1.add(new class_1914(new class_9306(class_1802.field_8529, 4), new class_1799(class_1802.field_8687), 12, 10, 0.05F));

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < var1.size(); var5 += 4294967296L) {
         var0.add(lIllIilliIllIill.IliIlllilIi((class_1914)var1.get((int)(var5 >>> 32)), (int)(var5 >>> 32)));
      }

      return var0;
   }

   public String iIlIlllllill() {
      long var4 = -31745491655393273L;
      if (this.IiIIiIllIl) {
         return IliIlllilIi<invokedynamic>();
      } else {
         String var1;
         if (this.IIlIiIllIl != null) {
            var1 = IliIlllilIi<invokedynamic>() + this.lIlIiIllIl + IliIlllilIi<invokedynamic>() + this.iIlIiIllIl;
         } else if (this.iiIIiIllIl == IIlliIillIlliIil.lIIlIilIil) {
            var1 = IliIlllilIi<invokedynamic>() + this.IIillIllIl.IiiIilliiIil();
         } else {
            var1 = this.iiIIiIllIl + IliIlllilIi<invokedynamic>() + this.IIillIllIl.iiilllIIIill().size() + IliIlllilIi<invokedynamic>() + this.IIillIllIl.lilIiliilIil();
         }

         if (!var1.equals(this.IIIliIllIl)) {
            this.IIIliIllIl = var1;
            if (this.IIlIiIllIl != null) {
               var4 ^= ((long)(!this.lIlIiIllIl.isEmpty() && !IliIlllilIi<invokedynamic>().equals(this.lIlIiIllIl) ? 0 : 1) << 32 ^ var4) & -1L << 32;
               String var3 = this.iIlIiIllIl > 0 && this.iIlIiIllIl < IilllIllIl.length ? IilllIllIl[this.iIlIiIllIl] : "";
               this.lIIliIllIl = (int)(var4 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + var3 + this.lIlIiIllIl;
            } else if (this.iiIIiIllIl == IIlliIillIlliIil.lIIlIilIil) {
               this.lIIliIllIl = this.IIillIllIl.IiiIilliiIil();
            } else if (this.iiIIiIllIl == IIlliIillIlliIil.iiiIIilIil) {
               this.lIIliIllIl = IliIlllilIi<invokedynamic>();
            } else {
               var4 ^= ((long)this.IIillIllIl.iiilllIIIill().size() << 32 ^ var4) & -1L << 32;
               this.lIIliIllIl = (int)(var4 >>> 32) + ((int)(var4 >>> 32) == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + this.IIillIllIl.lilIiliilIil() + IliIlllilIi<invokedynamic>();
            }
         }

         return this.lIIliIllIl;
      }
   }

   private String[] iliiiIiiii(String width, float text, int scale, float maxLines) {
      long var17 = 6330419135431186443L;
      long var15 = 7824238317815340329L;
      if (width != null && !width.isEmpty()) {
         String var5 = width + '\u0000' + Math.round(text) + ':' + scale + ':' + maxLines;
         String[] var6 = (String[])this.liiilIllIl.get(var5);
         if (var6 != null) {
            return var6;
         } else {
            if (this.liiilIllIl.size() > 96) {
               this.liiilIllIl.clear();
            }

            ArrayList var7 = new ArrayList();
            String[] var8 = width.split(IliIlllilIi<invokedynamic>());
            StringBuilder var9 = new StringBuilder();
            var15 ^= (0L ^ var15) & -1L << 32;

            while((int)(var15 >>> 32) < var8.length) {
               String var11 = var8[(int)(var15 >>> 32)];
               String var12 = var9.length() == 0 ? var11 : var9 + IliIlllilIi<invokedynamic>() + var11;
               if (!(lIlIIIliIlIIIl.IIlllIlliIll(var12, maxLines) <= text) && var9.length() != 0) {
                  var7.add(var9.toString());
                  var9.setLength(0);
                  if (var7.size() == scale - 1) {
                     StringBuilder var13 = new StringBuilder();

                     for(long var21 = var15 ^ ((long)((int)(var15 >>> 32)) ^ var15) & -1L >>> 32; (int)var21 < var8.length; var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
                        var13.append((int)var21 > (int)(var21 >>> 32) ? IliIlllilIi<invokedynamic>() : "").append(var8[(int)var21]);
                     }

                     var9.append(var13);
                     break;
                  }
               } else {
                  var9.setLength(0);
                  var9.append(var12);
                  var15 += 4294967296L;
               }
            }

            if (var9.length() > 0) {
               var7.add(var9.toString());
            }

            for(long var22 = var17 ^ (0L ^ var17) & -1L << 32; (int)(var22 >>> 32) < var7.size(); var22 += 4294967296L) {
               if (lIlIIIliIlIIIl.IIlllIlliIll((String)var7.get((int)(var22 >>> 32)), maxLines) > text) {
                  var7.set((int)(var22 >>> 32), llilliilililliil.IIiilIiiiIii().Iiilliiliiil((String)var7.get((int)(var22 >>> 32)), text / maxLines));
               }
            }

            String[] var19 = (String[])var7.toArray(new String[0]);
            this.liiilIllIl.put(var5, var19);
            return var19;
         }
      } else {
         return new String[0];
      }
   }

   private float lIiiiiIiii(class_332 y, float ctx, float x, float w) {
      float var5 = ilIiiIiIii(y, ctx, x, w, IliIlllilIi<invokedynamic>()) - 2.0F;
      float var6 = var5;
      if (this.iIillIllIl != null) {
         this.Iliiilliii(y, IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), ctx, var5, x, IliIlllilIi<invokedynamic>(), this.iIillIllIl, this.lIlilIllIl);
         var6 = var5 + 20.0F;
      }

      if (this.IlillIllIl != null) {
         this.Iliiilliii(y, IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), ctx, var6, x, IliIlllilIi<invokedynamic>(), this.IlillIllIl, this.iIlilIllIl);
         var6 += 20.0F;
      }

      if (this.llillIllIl != null) {
         this.Iliiilliii(y, IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), ctx, var6, x, IliIlllilIi<invokedynamic>(), this.llillIllIl, this.IllilIllIl);
         var6 += 20.0F;
      }

      if (this.ilillIllIl != null) {
         this.Iliiilliii(y, IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), ctx, var6, x, IliIlllilIi<invokedynamic>(), this.ilillIllIl, this.lllilIllIl);
         var6 += 20.0F;
      }

      return var6;
   }

   private void Illillllil() {
      long var4 = 822732090347906708L;
      if (this.IIillIllIl.iiilllIIIill().isEmpty()) {
         this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
      } else {
         var4 ^= (0L ^ var4) & -1L << 32;

         for(IiIlIIiliIlIIi var3 : this.IIillIllIl.iiilllIIIill()) {
            var4 ^= ((long)((int)(var4 >>> 32) | var3.liiliIiliiiiliIili) << 32 ^ var4) & -1L << 32;
         }

         if ((int)(var4 >>> 32) == 0) {
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
         } else {
            if (!this.IIillIllIl.IliIlllilIi()) {
               this.IIillIllIl.IIillIiliIil(true);
            }

            if (this.IIillIllIl.IliIlllilIi()) {
               this.liIIiIllIl = true;
               this.iIiIlIliIl();
            }
         }
      }
   }

   private float liIiiiiIii(class_332 x, float y, float ctx, float w) {
      long var18 = -827644312887990767L;
      long var20 = -1206222552894166464L;
      long var22 = 2174266027597765623L;
      long var24 = -7497717891507444974L;
      float var5 = ilIiiIiIii(x, y, ctx, w, IliIlllilIi<invokedynamic>());
      var18 ^= ((long)this.IIillIllIl.IliIlllilIi() << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)((int)(var18 >>> 32) == 0 ? -11117467 : (this.IIillIllIl.lliIililiIil() ? -1535700 : -8393375)) ^ var18) & -1L >>> 32;
      String var8 = (int)(var18 >>> 32) != 0 ? this.IIillIllIl.IiiIilliiIil() : (this.iiIIiIllIl == IIlliIillIlliIil.iiiIIilIil ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
      String[] var9 = this.iliiiIiiii(var8, ctx - 5.0F - 6.0F, 2, 0.82F);
      float var10 = llilliilililliil.IIIllIIliIIl(var5 + 4.0F);
      IIIiiIillIIiiIil.IlIlllIlilIl(x, y, var10, 5.0F, 5.0F, 2.5F, (int)(var18 >>> 32) != 0 ? lIlIIIliIlIIIl.Iiiiliiiiiii((int)var18, 0.75F + 0.25F * iIIiiIlIlIiiIl.iIlIlllllill()) : (int)var18);
      float var11 = var5;
      String[] var12 = var9;
      var20 ^= ((long)var9.length << 32 ^ var20) & -1L << 32;

      for(long var32 = var20 ^ (0L ^ var20) & -1L >>> 32; (int)var32 < (int)(var32 >>> 32); var32 ^= (var32 ^ var32 + (long)1) & -1L >>> 32) {
         String var15 = var12[(int)var32];
         lIlIIIliIlIIIl.Illlllllilll(var15, y + 5.0F + 6.0F, var11, 13.0F, 0.82F, -920587);
         var11 += 12.0F;
      }

      var11 += 4.0F;
      this.illliIilli(y, var11, ctx, IliIlllilIi<invokedynamic>(), Integer.toString(this.IIillIllIl.lilIiliilIil()), -920587);
      var11 += 13.0F;
      var22 ^= ((long)this.IIillIllIl.IIiIillIiIil() << 32 ^ var22) & -1L << 32;
      this.illliIilli(y, var11, ctx, IliIlllilIi<invokedynamic>(), Integer.toString((int)(var22 >>> 32)), (int)(var22 >>> 32) > 0 ? lliIlIllIl : -7630437);
      var11 += 13.0F;
      String var13 = (int)(var18 >>> 32) != 0 ? this.IIillIllIl.iIiIilIliIil() : "";
      if (!var13.isEmpty()) {
         var11 += 2.0F;
         String[] var14 = this.iliiiIiiii(var13, ctx, 4, 0.82F);
         var22 ^= ((long)var14.length ^ var22) & -1L >>> 32;

         for(long var35 = var24 ^ (0L ^ var24) & -1L << 32; (int)(var35 >>> 32) < (int)var22; var35 += 4294967296L) {
            String var17 = var14[(int)(var35 >>> 32)];
            lIlIIIliIlIIIl.Illlllllilll(var17, y, var11, 13.0F, 0.82F, IliIlIllIl);
            var11 += 11.0F;
         }
      }

      return var11;
   }

   private float lIiIiiIiIi(class_332 pad, iIIiliiIlIilii s, float y, float ctx) {
      float var5 = s.lIIIlliIIl + y;
      float var6 = s.IlIIlliIIl - y * 2.0F;
      this.IilliIllIl = null;
      this.lilliIllIl = s;
      this.lllliIllIl = s.lilIlliIIl;
      ctx = this.liIiiiiIii(pad, var5, var6, ctx + 12.0F);
      ctx = this.IIliilIlii(pad, var5, var6, ctx + 12.0F);
      return this.lIiiiiIiii(pad, var5, var6, ctx + 12.0F);
   }

   public void IIlllIlliIll(iiIiIlIIliIl f) {
      long var3 = 3380825131262194728L;
      if (this.IiIIiIllIl) {
         f.Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.liillIllIl).IilliliilIIi().Iilllilliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.liillIllIl);
      } else if (this.IIlIiIllIl == null) {
         f.Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.IiillIllIl);
         switch (this.iiIIiIllIl.ordinal()) {
            case 0:
               f.IilliliilIIi().Iilllilliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIIilIllIl);
               break;
            case 1:
               f.Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.lIIilIllIl);
               if (!this.Iiiilliiil()) {
                  f.Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.iiIilIllIl);
               }

               f.IilliliilIIi().Iilllilliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.iiillIllIl);
               break;
            case 2:
               f.IilliliilIIi().Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.IIIilIllIl);
         }

      } else {
         var3 ^= ((long)(this.iiiilIIIIi() && !this.Iiiilliiil() ? 1 : 0) << 32 ^ var3) & -1L << 32;
         f.iIlIlllllill((int)(var3 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()).IilliliilIIi();
         if ((int)(var3 >>> 32) != 0) {
            f.Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.iiIilIllIl);
         }

         f.Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.IlIilIllIl).Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.iIIilIllIl);
      }
   }

   public void iliIiiliiiii(float dt) {
      long var6 = 4421616374501393780L;
      this.IllIiIllIl = lliiiIliliiiIl.IIIllIIliIIl(this.IllIiIllIl, this.lllIiIllIl, 18.0F, dt, 0.05F);
      this.lilIiIllIl = lliiiIliliiiIl.IIIllIIliIIl(this.lilIiIllIl, this.iilIiIllIl, 18.0F, dt, 0.05F);
      var6 ^= ((long)this.iiilllIIIill.iliIiiliiiii() << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) != this.llIliIllIl) {
         this.llIliIllIl = (int)(var6 >>> 32);
         this.IIIIiIllIl.iliIiiliiiii(0.0F);
      }

      this.IIIIiIllIl.IlIlllIlilIl(dt, this.iiilllIIIill.IlIlllIlilIl().iiIIlliIIl);
      if (this.IIillIllIl.IliIlllilIi()) {
         this.iiIIiIllIl = IIlliIillIlliIil.lIIlIilIil;
      } else {
         this.iiIIiIllIl = this.IIillIllIl.iiilllIIIill().isEmpty() ? IIlliIillIlliIil.iiiIIilIil : IIlliIillIlliIil.IIIlIilIil;
      }

      IiIlIIiliIlIIi var3 = this.iIIilIlIil();
      long var4 = System.currentTimeMillis();
      if (var3 != this.liiIiIllIl || var4 - this.iiiIiIllIl > 250L) {
         this.liiIiIllIl = var3;
         this.iiiIiIllIl = var4;
         this.IiiIiIllIl = var3 == null ? null : this.IIillIllIl.Iililllilill(var3);
      }

      if (this.lliIiIllIl >= 0 && var4 - this.iIiIiIllIl > 2500L) {
         this.lliIiIllIl = -1;
      }

      if (this.iliIiIllIl >= 0 && var4 - this.IliIiIllIl > 2500L) {
         this.iliIiIllIl = -1;
      }

   }

   private static class_1799 llIIIlilIIIl(String level, int enchant) {
      try {
         Optional var2 = iIIIIlIlIIIl(level);
         if (var2.isPresent()) {
            return class_1890.method_61711(new class_1889((class_6880)var2.get(), Math.max(1, enchant)));
         }
      } catch (Exception var3) {
      }

      return new class_1799(class_1802.field_8598);
   }

   public boolean method_25401(double horizontal, double mouseX, double mouseY, double vertical) {
      if (!this.IiIIiIllIl && this.IIlIiIllIl == null && this.IIIIiIllIl.iIlIlllllill() && this.iiilllIIIill.iIlIlllllill() && this.iiilllIIIill.IIIllIIliIIl().IIIllIIliIIl(horizontal, mouseX)) {
         this.IIIIiIllIl.IilliliilIIi(vertical, 24.0F);
         return true;
      } else {
         return super.method_25401(horizontal, mouseX, mouseY, vertical);
      }
   }

   private static Optional<class_6880.class_6883<class_1887>> iIIIIlIlIIIl(String enchant) {
      class_310 var1 = class_310.method_1551();
      class_5321 var2 = IliiiiIilliiiiIi.liiiIIllIl(enchant);
      if (var2 != null && var1.field_1687 != null) {
         try {
            Optional var3 = var1.field_1687.method_30349().method_46759(class_7924.field_41265);
            return var3.isEmpty() ? Optional.empty() : ((class_2378)var3.get()).method_46746(var2);
         } catch (Exception var4) {
            return Optional.empty();
         }
      } else {
         return Optional.empty();
      }
   }

   public String IIillIiliIil(int index) {
      IiIlIIiliIlIIi var2 = this.IIIillIIil(index);
      if (var2 == null) {
         return "";
      } else if (!var2.liiliIiliiiiliIili) {
         return IliIlllilIi<invokedynamic>();
      } else {
         String var3 = var2.liliiIiliiiliiIili > 0 ? var2.lliiiIiliiliiiIili + IliIlllilIi<invokedynamic>() + var2.liliiIiliiiliiIili : (var2.lliiiIiliiliiiIili > 0 ? var2.lliiiIiliiliiiIili + (var2.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) : null);
         String var4 = var2.IIIiiIililIIiiIili == llIlIlIlilIlIlIl.iilIliilIl ? IliIlllilIi<invokedynamic>() + var2.llIiiIiliilIiiIili : (var2.IlliiIilillliiIili > 0 ? IliIlllilIi<invokedynamic>() + var2.IlliiIilillliiIili + IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
         return var3 == null ? var4 : var4 + IliIlllilIi<invokedynamic>() + var3;
      }
   }

   public boolean iiIIlIIlIl(int modifiers, int key) {
      if (this.IiIIiIllIl) {
         if (this.ilIIiIllIl != null && this.ilIIiIllIl.IIiilIiiiIii(modifiers, key)) {
            return true;
         } else if (modifiers == 256) {
            this.IiIilliIil();
            return true;
         } else {
            return false;
         }
      } else if (this.IIlIiIllIl != null && modifiers == 256) {
         this.IIiillIiil();
         return true;
      } else {
         return false;
      }
   }

   private class_1799 liiiiiiiii(IiIlIIiliIlIIi t) {
      String var2 = t.iIIiiIiliIlIiiIili + IliIlllilIi<invokedynamic>() + t.IiIiiIililiIiiIili + IliIlllilIi<invokedynamic>() + t.iiIiiIiliIIliiIili + IliIlllilIi<invokedynamic>() + t.lIliiIiliiIliiIili;
      class_1799 var3 = (class_1799)this.iliilIllIl.get(var2);
      if (var3 != null) {
         return var3;
      } else {
         class_1799 var10000;
         switch (t.iIIiiIiliIlIiiIili) {
            case IliIIilllliIIill:
               var10000 = llIIIlilIIIl(t.IiIiiIililiIiiIili, t.iiIiiIiliIIliiIili);
               break;
            case liiIIilliiiIIill:
            case iliIIillIiiIIill:
               var10000 = IIIIIllIIIIl(IiiIlliiIl.iIlIlllllill(t.lIliiIiliiIliiIili));
               break;
            default:
               throw new MatchException((String)null, (Throwable)null);
         }

         class_1799 var4 = var10000;
         this.iliilIllIl.put(var2, var4);
         return var4;
      }
   }

   public float IIiilIiiiIii() {
      if (!this.IiIIiIllIl && this.IIlIiIllIl == null) {
         this.liilliiill();
         return this.liIliIllIl;
      } else {
         return 0.0F;
      }
   }

   private void IilIililIi(int r) {
      if (r >= 0 && r < IlIllIllIl.length) {
         if (this.IIillIllIl.IliIlllilIi()) {
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
         } else if (!this.IIillIllIl.IiIIilliIIil(IlIllIllIl[r])) {
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
         } else {
            this.liIIiIllIl = true;
            this.iIiIlIliIl();
         }
      }
   }

   private static float ilIiiIiIii(class_332 ctx, float y, float x, float w, String title) {
      llilliilililliil.lllIiillIi(ctx, title, y, w, x);
      return w + 12.0F + 5.0F;
   }

   private void IiIilliIil() {
      if (this.ilIIiIllIl != null) {
         this.ilIIiIllIl.IIIIllIIIl();
      }

      this.IiIIiIllIl = false;
      this.iiilllIIIill.Ililllililil();
   }

   private iiIiiilIIliiil lIilliIill(String name) {
      for(IilliIllilliIl var3 : this.IIillIllIl.IiIlliIliiIl()) {
         if (var3 instanceof iiIiiilIIliiil var4) {
            if (name.equals(var3.IliIlllilIi())) {
               return var4;
            }
         }
      }

      return null;
   }

   private void iIiliIlili(class_332 ctx, iIIiliiIlIilii s) {
      long var11 = 8584578686548098326L;
      var11 ^= ((long)s.lilIlliIIl << 32 ^ var11) & -1L << 32;
      if (this.IIlIiIllIl.isEmpty()) {
         lIlIIIliIlIIIl.Iiilliiliiil(ctx, s.lIIIlliIIl, s.iIIIlliIIl, s.IlIIlliIIl, s.llIIlliIIl, lIlIIiliIlIIil.IiiIlliiIl(IliIlllilIi<invokedynamic>()), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
      } else {
         float var4 = Math.min(460.0F, s.IlIIlliIIl - 28.0F);
         float var5 = s.lIIIlliIIl + (s.IlIIlliIIl - var4) / 2.0F;
         float var6 = s.iIIIlliIIl + 8.0F;
         this.lIiIiIllIl = s.llIIlliIIl - 16.0F;
         this.IIiIiIllIl = (float)this.IIlIiIllIl.size() * 32.0F - 2.0F;
         float var7 = Math.max(0.0F, this.IIiIiIllIl - this.lIiIiIllIl);
         if (this.iilIiIllIl > var7) {
            this.iilIiIllIl = var7;
         }

         float var8 = var6 - llilliilililliil.IIIllIIliIIl(this.lilIiIllIl);
         lIlIIIliIlIIIl.Iliilliiilii(ctx, s.lIIIlliIIl, var6, s.IlIIlliIIl, this.lIiIiIllIl);

         try {
            for(long var16 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var16 < this.IIlIiIllIl.size(); var8 += 32.0F) {
               if (!(var8 + 30.0F < var6) && !(var8 > var6 + this.lIiIiIllIl)) {
                  this.lliliilili(ctx, s, (boolean)((int)(var16 >>> 32)), (int)var16, (lIllIilliIllIill)this.IIlIiIllIl.get((int)var16), var5, var8, var4, var6);
               }

               var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32;
            }
         } finally {
            ctx.method_44380();
         }

      }
   }

   private iIIiIIIlIlIiIIIl(class_437 offers, llIiIlilIiIl level, List<lIllIilliIllIill> prof, String bot, int parent) {
      long var8 = -2879292503395745038L;
      super(offers, IliIlllilIi<invokedynamic>());
      this.IiillIllIl = this::llIililIil;
      this.liillIllIl = this::IiIilliIil;
      this.iiillIllIl = this::Illillllil;
      this.IIIilIllIl = this::illilIilil;
      this.lIIilIllIl = this::lililiilil;
      this.iIIilIllIl = this::IIiillIiil;
      this.IlIilIllIl = this::lililiilil;
      this.llIilIllIl = () -> this.IlIIillIIi(-1);
      this.ilIilIllIl = () -> this.IlIIillIIi(1);
      this.IiIilIllIl = this::ilIIiIiIIi;
      this.liIilIllIl = this::liIIiiiIIi;
      this.iiIilIllIl = this::lliililiil;
      this.illilIllIl = this::IIlIilIlIi;
      this.IililIllIl = this::iIlIiIllIi;
      this.lililIllIl = this::lllIiillIi;
      this.iililIllIl = (d) -> this.IIlIilIlIi(-d);
      this.IIiilIllIl = (d) -> this.iIlIiIllIi(-d);
      this.lIiilIllIl = (d) -> this.lllIiillIi(-d);
      this.iIiilIllIl = new Runnable[IlIllIllIl.length];
      this.IliilIllIl = new Runnable[IlIllIllIl.length];
      this.lliilIllIl = new ArrayList();
      this.iliilIllIl = new HashMap();
      this.IiiilIllIl = new class_1799(class_1802.field_8287);
      this.liiilIllIl = new HashMap();
      this.iiiilIllIl = new HashMap();
      this.IIIIiIllIl = new iiiilIIiIIIIiIIi();
      this.lIIIiIllIl = new String[64];
      this.iIIIiIllIl = new String[64];
      this.IlIIiIllIl = new float[64];
      this.llIIiIllIl = new float[lllllIllIl.length];
      this.iiIIiIllIl = IIlliIillIlliIil.iiiIIilIil;
      this.lIlIiIllIl = "";
      this.lliIiIllIl = -1;
      this.iliIiIllIl = -1;
      this.llIliIllIl = -1;
      this.ilIliIllIl = -1.0F;
      this.IiIliIllIl = 150.0F;
      this.liIliIllIl = 176.0F;
      this.iiIliIllIl = -1.0F;
      this.IIlliIllIl = -1.0F;
      this.lIlliIllIl = -1.0F;
      this.IIillIllIl = level;
      this.lIillIllIl = this.lIilliIill(IliIlllilIi<invokedynamic>());
      this.iIillIllIl = this.lIilliIill(IliIlllilIi<invokedynamic>());
      this.IlillIllIl = this.lIilliIill(IliIlllilIi<invokedynamic>());
      this.llillIllIl = this.lIilliIill(IliIlllilIi<invokedynamic>());
      this.ilillIllIl = this.lIilliIill(IliIlllilIi<invokedynamic>());
      this.IIlilIllIl = () -> Ilillllill(this.lIillIllIl);
      this.lIlilIllIl = () -> Ilillllill(this.iIillIllIl);
      this.iIlilIllIl = () -> Ilillllill(this.IlillIllIl);
      this.IllilIllIl = () -> Ilillllill(this.llillIllIl);
      this.lllilIllIl = () -> Ilillllill(this.ilillIllIl);

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < IlIllIllIl.length; var8 += 4294967296L) {
         var8 ^= ((long)((int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
         this.iIiilIllIl[(int)(var8 >>> 32)] = () -> this.IilIililIi(r);
         this.IliilIllIl[(int)(var8 >>> 32)] = () -> this.iilIiIIiIi(r);
      }

      if (prof != null) {
         this.ilillIiill(prof, bot, parent);
      }

   }

   private void llIililIil() {
      if (this.IIlIiIllIl == null) {
         if (this.ilIIiIllIl == null) {
            this.ilIIiIllIl = new iiilIiiIIIiIii(this.iiIilIIlil());
         }

         this.IiIIiIllIl = true;
         this.iiilllIIIill.Ililllililil();
      }
   }

   private void ilillIiill(List<lIllIilliIllIill> prof, String list, int level) {
      long var6 = 4325884993272988903L;
      this.IIlIiIllIl = new ArrayList(prof);
      this.lIlIiIllIl = list == null ? "" : list;
      this.iIlIiIllIl = level;
      this.lilIiIllIl = this.iilIiIllIl = 0.0F;
      this.lliilIllIl.clear();

      for(var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < this.IIlIiIllIl.size(); var6 += 4294967296L) {
         var6 ^= ((long)((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
         this.lliilIllIl.add((Runnable)() -> this.iIiilIliil(k));
      }

   }

   private void IIlIilIlIi(int dir) {
      IiIlIIiliIlIIi var2 = this.iIIilIlIil();
      if (var2 != null) {
         var2.IlliiIilillliiIili = Math.max(0, Math.min(64, var2.IlliiIilillliiIili + dir));
         this.IIillIllIl.IIlilllIlill(var2);
      }
   }

   private void iIiilIliil(int i) {
      long var4 = -7712400508006023563L;
      if (this.IIlIiIllIl != null && i >= 0 && i < this.IIlIiIllIl.size()) {
         IiIlIIiliIlIIi var2 = llIiIlilIiIl.Illlllllllll((lIllIilliIllIill)this.IIlIiIllIl.get(i), this.lIlIiIllIl);
         if (var2 == null) {
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
         } else {
            var4 ^= ((long)this.IIillIllIl.lIIilliIIill(var2) << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) >= 0) {
               this.lIliliIlil(var2.Iilllilliill() + IliIlllilIi<invokedynamic>(), false);
            } else {
               var4 ^= ((long)this.IIillIllIl.IlIillllIill(var2) << 32 ^ var4) & -1L << 32;
               this.lIliliIlil(IliIlllilIi<invokedynamic>() + var2.Iilllilliill(), true);
            }

            this.IIlIiIllIl = null;
            this.lliilIllIl.clear();
            this.iiilllIIIill.Ililllililil();
            this.iiilllIIIill.Iilllilliill(Math.max(0, (int)(var4 >>> 32)), false);
         }
      }
   }

   private void iIliiIllii(class_332 w, int r, List<IlIiiIIillIiiIIi> x, float locked, float list, float y, boolean ctx) {
      long var24 = -5637994903741812109L;
      long var26 = -1034389277504775760L;
      long var28 = -8733142598391064177L;
      var24 ^= ((long)(!x.isEmpty() ? 1 : 0) << 32 ^ var24) & -1L << 32;
      var24 ^= ((long)iIIiiIlIlIiiIl.IliIlllilIi(IlIllIllIl[r]) ^ var24) & -1L >>> 32;
      float var10 = llilliilililliil.IIIllIIliIIl(list + 7.5F);
      IIIiiIillIIiiIil.IlIlllIlilIl(w, locked, var10, 5.0F, 5.0F, 2.5F, (int)(var24 >>> 32) != 0 ? (int)var24 : lIlIIIliIlIIIl.Iiiiliiiiiii((int)var24, 0.35F));
      float var11 = locked + y;
      var26 ^= ((long)(!ctx ? 1 : 0) << 32 ^ var26) & -1L << 32;
      String var13 = (int)(var24 >>> 32) != 0 ? (IlIllIllIl[r] == IlliliIillliliIi.IillIiiIIi ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) : IliIlllilIi<invokedynamic>();
      float var14 = Math.max(34.0F, (float)Math.ceil((double)lIlIIIliIlIIIl.IIlllIlliIll(var13, 0.82F)) + 14.0F);
      float var15 = llilliilililliil.IIIllIIliIIl(list + 2.0F);
      this.Iiliililii(w, ilIllIllIl[r], var11 - var14, var15, var14, var13, (boolean)((int)(var26 >>> 32)), (int)(var24 >>> 32) == 0, this.iIiilIllIl[r]);
      var11 -= var14 + 4.0F;
      var26 ^= ((long)(this.iliIiIllIl == r ? 1 : 0) ^ var26) & -1L >>> 32;
      if ((int)(var24 >>> 32) != 0) {
         float var17 = (int)var26 != 0 ? 44.0F : 16.0F;
         this.iiliiIIiii(w, IiIllIllIl[r], var11 - var17, var15, var17, (boolean)((int)var26), (boolean)((int)(var26 >>> 32)), this.IliilIllIl[r]);
         var11 -= var17 + 4.0F;
      }

      float var31 = locked + 5.0F + 6.0F;
      String var18 = this.IIililIili(llIllIllIl[r], var11 - 4.0F - var31, 0.82F);
      lIlIIIliIlIIIl.Illlllllilll(var18, var31, list, 20.0F, 0.82F, (int)(var24 >>> 32) != 0 ? -5854026 : -7630437);
      String var19;
      if ((int)(var24 >>> 32) == 0) {
         var19 = IliIlllilIi<invokedynamic>();
         var28 ^= (-47749157179359232L ^ var28) & -1L << 32;
      } else {
         var28 ^= (0L ^ var28) & -1L >>> 32;

         for(IlIiiIIillIiiIIi var23 : x) {
            var28 ^= ((long)((int)var28 | this.IIillIllIl.Iliilllliill(var23)) ^ var28) & -1L >>> 32;
         }

         if ((int)var28 != 0) {
            var19 = IliIlllilIi<invokedynamic>();
            var28 ^= ((long)IliIlIllIl << 32 ^ var28) & -1L << 32;
         } else if (x.size() > 1 && IlIllIllIl[r] != IlliliIillliliIi.IillIiiIIi) {
            var19 = x.size() + IliIlllilIi<invokedynamic>();
            var28 ^= (-32772477369188352L ^ var28) & -1L << 32;
         } else {
            var19 = llliiillii(x);
            var28 ^= (-32772477369188352L ^ var28) & -1L << 32;
         }
      }

      float var21 = lIlIIIliIlIIIl.IIlllIlliIll(var19, 0.82F);
      float var32 = var31 + lIlIIIliIlIIIl.IIlllIlliIll(var18, 0.82F) + 4.0F;
      if (var11 - 4.0F - var21 >= var32) {
         lIlIIIliIlIIIl.Illlllllilll(var19, var11 - 4.0F - var21, list, 20.0F, 0.82F, (int)(var28 >>> 32));
      }

   }

   private void lliililiil() {
      long var3 = 7253529843836625545L;
      if (this.IIillIllIl.IliIlllilIi()) {
         this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
      } else {
         IiIlIIiliIlIIi var1 = IiIlIIiliIlIIi.IilliliilIIi();
         var3 ^= ((long)this.IIillIllIl.lIIilliIIill(var1) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) >= 0) {
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), false);
         } else {
            var3 ^= ((long)this.IIillIllIl.IlIillllIill(var1) << 32 ^ var3) & -1L << 32;
            this.lIliliIlil(IliIlllilIi<invokedynamic>(), true);
         }

         this.IIlIiIllIl = null;
         this.lliilIllIl.clear();
         this.iiilllIIIill.Ililllililil();
         this.iiilllIIIill.Iilllilliill(Math.max(0, (int)(var3 >>> 32)), false);
      }
   }

   private static List<lIllIilliIllIill> iilllIIill(int level) {
      long var4 = -3144490923928684774L;
      ArrayList var1 = new ArrayList();
      var1.add(new class_1914(new class_9306(class_1802.field_8511, 32), new class_1799(class_1802.field_8687), 16, 2, 0.05F));
      var1.add(new class_1914(new class_9306(class_1802.field_8687, 1), new class_1799(class_1802.field_8725, 2), 12, 1, 0.05F));
      if (level >= 2) {
         var1.add(new class_1914(new class_9306(class_1802.field_8695, 3), new class_1799(class_1802.field_8687), 12, 10, 0.05F));
         var1.add(new class_1914(new class_9306(class_1802.field_8687, 1), new class_1799(class_1802.field_8759), 12, 5, 0.05F));
      }

      if (level >= 3) {
         var1.add(new class_1914(new class_9306(class_1802.field_8073, 2), new class_1799(class_1802.field_8687), 12, 20, 0.05F));
         var1.add(new class_1914(new class_9306(class_1802.field_8687, 4), new class_1799(class_1802.field_8801), 12, 10, 0.05F));
      }

      if (level >= 4) {
         var1.add(new class_1914(new class_9306(class_1802.field_8469, 9), new class_1799(class_1802.field_8687), 12, 30, 0.05F));
         var1.add(new class_1914(new class_9306(class_1802.field_8687, 5), new class_1799(class_1802.field_8634), 12, 15, 0.05F));
      }

      if (level >= 5) {
         var1.add(new class_1914(new class_9306(class_1802.field_8790, 22), new class_1799(class_1802.field_8687), 12, 30, 0.05F));
         var1.add(new class_1914(new class_9306(class_1802.field_8687, 3), new class_1799(class_1802.field_8287), 12, 30, 0.05F));
      }

      ArrayList var2 = new ArrayList();

      for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < var1.size(); var6 += 4294967296L) {
         var2.add(lIllIilliIllIill.IliIlllilIi((class_1914)var1.get((int)(var6 >>> 32)), (int)(var6 >>> 32)));
      }

      return var2;
   }

   private void lllIiillIi(int dir) {
      IiIlIIiliIlIIi var2 = this.iIIilIlIil();
      if (var2 != null) {
         var2.iiIiiIiliIIliiIili = Math.max(1, Math.min(this.IiIIIlliIIIl(var2.IiIiiIililiIiiIili), var2.iiIiiIiliIIliiIili + dir));
         this.IIillIllIl.IIlilllIlill(var2);
      }
   }

   private void illilIilil() {
      if (this.IIillIllIl.IliIlllilIi()) {
         this.IIillIllIl.IIillIiliIil(false);
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6572408740342105986L ^ Long.rotateLeft(2080234569080436239L, 32) ^ -1489961768938295346L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8583412032993636897L ^ Long.rotateLeft(-7117267855693881983L, 12) ^ 3936239001268714547L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8767721324619543269L ^ Long.rotateLeft(-259456617022250212L, 25) ^ -8598291399206327967L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1141030806053867485L ^ Long.rotateLeft(-7333072629424309550L, 44) ^ 3945454540017830663L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2345448699173243359L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8624676388979013424L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6016367441648003194L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1003280767483067951L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6649559427488722008L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4559217070399049354L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIillIiilIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIiliIiiiIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlilIliiIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illillliilli<invokedynamic>());
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

   private void liilliiill() {
      long var7 = 3924058082552815797L;
      var7 ^= ((long)(!this.IIillIllIl.iiilllIIIill().isEmpty() ? 1 : 0) << 32 ^ var7) & -1L << 32;
      float var2 = Math.min(600.0F, Math.max(220.0F, (float)this.field_22789 - 24.0F)) - 24.0F;
      if (var2 != this.ilIliIllIl || (int)(var7 >>> 32) != this.iIlliIllIl) {
         this.ilIliIllIl = var2;
         this.iIlliIllIl = (boolean)((int)(var7 >>> 32));
         float var3 = (int)(var7 >>> 32) != 0 ? 16.0F : 8.0F;
         float var4 = Math.min(1.0F, (var2 - var3) / (((int)(var7 >>> 32) != 0 ? 150.0F : 0.0F) + 176.0F + 234.0F));
         float var5 = (float)Math.floor((double)Math.max(96.0F, 150.0F * var4));
         float var6 = (float)Math.floor((double)Math.max(124.0F, 176.0F * var4));
         if (var2 - var3 - ((int)(var7 >>> 32) != 0 ? var5 : 0.0F) - var6 >= 132.0F) {
            this.IiIliIllIl = var5;
            this.liIliIllIl = var6;
         } else {
            this.IiIliIllIl = (float)Math.floor((double)Math.max(96.0F, (var2 - 8.0F) * 150.0F / 384.0F));
            this.liIliIllIl = 0.0F;
         }
      }
   }

   private static String Iiililiili(lIllIilliIllIill ti) {
      StringBuilder var1 = new StringBuilder();
      if (ti.illlIilill != null) {
         var1.append(iiiliIIIii(ti.illlIilill, ti.IillIilill));
      }

      if (ti.IilliliilIIi()) {
         var1.append(IliIlllilIi<invokedynamic>()).append(iiiliIIIii(ti.lillIilill, ti.iillIilill));
      }

      return var1.length() == 0 ? IliIlllilIi<invokedynamic>() : var1.toString();
   }

   private boolean Iiiilliiil() {
      for(IiIlIIiliIlIIi var2 : this.IIillIllIl.iiilllIIIill()) {
         if (var2.IIIllIIliIIl()) {
            return true;
         }
      }

      return false;
   }

   private void Iliiilliii(class_332 act, String text, String w, float ctx, float setting, float onKey, String y, iiIiiilIIliiil key, Runnable x) {
      float var10 = this.lIIiiiIIii(text, ctx, setting, onKey, 20.0F);
      float var11 = this.iiilllIIIill.IiIlliIliiIl().IilliliilIIi(w, key.Iilllilliill() ? 1.0F : 0.0F, 16.0F);
      lilliiilli(ctx, setting, this.IIililIili(y, onKey - 22.0F - 6.0F, 0.82F), var10);
      iIiIIlIiIliIIlIi.iIlIlllllill(act, Math.round(ctx + onKey - 22.0F), Math.round(setting + 5.0F), (double)var11, (double)var10);
      this.IlIiillIii(text, ctx, setting, onKey, 20.0F, x);
   }

   public boolean IiIIlliIIl(iIIiliiIlIilii amount, double y, double stage, double x) {
      if (this.IiIIiIllIl) {
         if (this.ilIIiIllIl != null) {
            this.ilIIiIllIl.Illillliilli(x);
         }

         return true;
      } else if (this.IIlIiIllIl != null) {
         float var8 = Math.max(0.0F, this.IIiIiIllIl - this.lIiIiIllIl);
         this.iilIiIllIl = Math.max(0.0F, Math.min(var8, this.iilIiIllIl - (float)x * 24.0F));
         return true;
      } else {
         return false;
      }
   }
}
