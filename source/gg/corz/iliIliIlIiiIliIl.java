package gg.corz;

import com.corz.client.CorzClient;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10799;
import net.minecraft.class_124;
import net.minecraft.class_1293;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1887;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_268;
import net.minecraft.class_2960;
import net.minecraft.class_329;
import net.minecraft.class_332;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import net.minecraft.class_634;
import net.minecraft.class_640;
import net.minecraft.class_6880;
import net.minecraft.class_742;
import net.minecraft.class_9304;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix3x2fStack;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public class iliIliIlIiiIliIl extends ilIllIiIll {
   private final int[] illlliiIll;
   private static final float iiliIiiIll = 0.7F;
   private float IlilliiIll;
   private static final float iiIiIiiIll = 3.0F;
   private final ConcurrentLinkedQueue<class_2663> liiIliiIll;
   private static final int IlIlIiiIll = 3;
   private static final Color[] llIlliiIll;
   private static final float IlIIliiIll = 0.55F;
   private final iiIiiilIIliiil iillIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float iIIiIiiIll = 5.0F;
   private final Matrix4f llllliiIll;
   private static final int lIIlIiiIll = 1;
   private final iiIiiilIIliiil lIilIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iiIlIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int illIliiIll = 15922423;
   private static final int iIIlIiiIll = 2;
   private static final String[] liilliiIll;
   private static final float lIliIiiIll = 7.0F;
   private static final int lilIliiIll = 658190;
   private final iiIiiilIIliiil iIilIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi IIIiIiiIll;
   private static final float IlIiIiiIll = 3.0F;
   private final IIIIlilllIIIlill IiilIiiIll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)0.5F, (double)2.0F, 0.05);
   private static final float IIliIiiIll = 5.0F;
   private final Map<Object, String[]> IIIlliiIll;
   private static final float llIIliiIll = 1.0F;
   private final lliliIIiililiIIi lIIiIiiIll;
   private static final int lIiIliiIll = 13225430;
   private float IiilliiIll;
   private static final int ilIlIiiIll = 1;
   private boolean iIllliiIll;
   private final iiIiiilIIliiil llllIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String[] IlIlliiIll;
   private static final float iIiiIiiIll = 12.0F;
   private final iiIiiilIIliiil IlilIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final int lllIliiIll = 14699339;
   private static final float llliIiiIll = 0.82F;
   private static final float lIIIliiIll = 0.92F;
   private static final float ilIiIiiIll = 4.0F;
   private final iiIiiilIIliiil ililIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private long lIllliiIll;
   private final iiIiiilIIliiil lillIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   public static final String lliIIiiIll = "Top";
   private static final int IllIliiIll = 14731304;
   private static final int iilIliiIll = 5562506;
   private static final float iliiIiiIll = 6.0F;
   private static final int iIiIliiIll = 0;
   private static final int lIlIliiIll = 14;
   private final iiIiiilIIliiil IIilIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   public static final String IiiIIiiIll = "Left";
   private boolean IlllliiIll;
   private final iiIiiilIIliiil IillIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float iiiiIiiIll = 80.0F;
   private static final int[] ilIlliiIll;
   public static final String liiIIiiIll = "Right";
   private final List<llllliilllli> lillliiIll;
   public static Matrix4f lIiIIiiIll = new Matrix4f();
   private final class_4587 iiIlliiIll;
   private static final float illiIiiIll = 0.8F;
   private static final int IiIlIiiIll = 2;
   private static final Map<String, Integer> lliIliiIll = new HashMap();
   private static final int IIlIliiIll = 512;
   public static Matrix4f iIiIIiiIll = new Matrix4f();
   private static final int IiIIliiIll = 6;
   private final iilliIlIIiliIl IIllIiiIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 96, 8, 256);
   private static final float IIIIliiIll = 180.0F;
   private static final Map<String, String> IliIliiIll = new HashMap();
   private float ililliiIll;
   private static final float IiliIiiIll = 0.55F;
   private static final float llIiIiiIll = 3.0F;
   private static final int IIiIliiIll = 15909198;
   private static final float liIiIiiIll = 4.0F;
   private static final float IIiiIiiIll = 3.0F;
   private final Int2ObjectOpenHashMap<String> lIIlliiIll;
   private final Map<UUID, iilIllIIiIll> IiiIliiIll;
   private class_1799 iIilliiIll;
   private static final float iIliIiiIll = 9.0F;
   private static final int liIIliiIll = 4;
   private final iiIiiilIIliiil llilIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final List<llllliilllli> iillliiIll;
   private final llllliilllli IIilliiIll;
   private final Vector3f IillliiIll;
   private final ArrayList<Object[]> lIilliiIll;
   private static final float IlliIiiIll = 7.0F;
   private final iiIiiilIIliiil IlllIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float IiIiIiiIll = 4.0F;
   private static final float liliIiiIll = 0.52F;
   private float llilliiIll;
   public static Matrix4f IliIIiiIll = new Matrix4f();
   private static final int IIIlIiiIll = 0;
   private final class_4587 IIllliiIll;
   private final iiIiiilIIliiil iIllIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil illlIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String[] iiiIIiiIll = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private static final int IilIliiIll = 9080728;
   private static final int iiIIliiIll = 6;
   private static final float lliiIiiIll = 8.0F;
   private final Map<UUID, IlIllIllllIllIll> iliIliiIll;
   private final lliliIIiililiIIi iiilIiiIll;
   private static final float iIIIliiIll = 130.0F;
   private static final float IliiIiiIll = 3.0F;
   private static final int iIlIliiIll = 6282350;
   private WeakReference<Object> iiiIliiIll;
   private static final int liIlIiiIll = 3;
   private final iiIiiilIIliiil lIllIiiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String[] iIIlliiIll;
   private long IiIlliiIll;
   private static final int llIlIiiIll = 0;
   private static final float IiiiIiiIll = 2.5F;
   private final lliliIIiililiIIi liilIiiIll;
   public static final String iliIIiiIll = "Bottom";
   private static final float ilIIliiIll = 0.72F;
   private static final float lIiiIiiIll = 9.0F;
   private static final float liiiIiiIll = 34.0F;

   private float IIIillIIil(llllliilllli t, IIliiIlllIliiIll font) {
      IlIllIllllIllIll var3 = t.IIIlIIlIllIIlIIlIl;
      float var4 = this.liilliiill(t, font);
      float var5 = font.iIlIlllllill(var3.Illliillll) * 0.8F;
      float var6 = var3.lllliillll.isEmpty() ? 0.0F : font.iIlIlllllill(var3.lllliillll) * 0.8F;
      float var7 = var3.iilliillll.isEmpty() ? 0.0F : var3.iIiliillll + 6.0F;
      float var8 = var3.lIiliillll > 0.0F ? (t.iiilIIlIlIIIiIIlIl >= 0 ? 8.5F : 0.0F) + var3.lIiliillll : 0.0F;
      return 10.0F + (var4 > 0.0F ? var4 + 5.0F : 0.0F) + (t.IIilIIlIllIilIIlIl ? 7.0F : 0.0F) + var3.IIiliillll + (var7 > 0.0F ? 5.0F + var7 : 0.0F) + (var8 > 0.0F ? 5.0F + var8 : 0.0F) + 5.0F + var5 + (var6 > 0.0F ? 1.5F + var6 : 0.0F) + 1.5F + 7.0F;
   }

   private void illilIilil(llllliilllli icons, class_4587 font, class_332 m, IIliiIlllIliiIll t, boolean ctx) {
      float var6 = icons.lIlIlIlIliIlIlIlIl[1];
      float var7 = icons.IllIlIlIllllIlIlIl[1];
      float var8 = icons.IiIlIIlIlliIlIIlIl;
      boolean var9 = icons.liiiIIlIliiiiIIlIl[1];
      this.ilillIiill(font, var6, var7, icons.llilIIlIlililIIlIl, var8);
      float var10 = Math.max(8.0F, icons.iiIlIIlIlIIllIIlIl * 0.8F) + 2.0F;
      float var11 = 5.0F;
      float var12 = 3.0F;

      for(int var13 = 0; var13 < icons.IliiIIlIllliiIIlIl; ++var13) {
         class_1293 var14 = icons.IiliIIlIlliliIIlIl[var13];
         if (ctx) {
            class_2960 var15 = null;

            try {
               var15 = class_329.method_71644(var14.method_5579());
            } catch (Throwable var17) {
            }

            if (var15 != null) {
               m.method_52707(class_10799.field_56883, var15, Math.round(var11), Math.round(var12 + (var10 - 8.0F) / 2.0F), 8, 8, IiIliliIli(16777215, var8).getRGB());
               this.IlllliiIll = true;
            }
         }

         boolean var18 = var14.method_5584() >= 0 && var14.method_5584() < 200 && !var14.method_48559();
         IilIililIi(t, font, icons.iiliIIlIlIIiiIIlIl[var13], var11 + 8.0F + 2.0F, this.lllIiillIi(var12, var10, 0.8F), 0.8F, IiIliliIli(var18 ? 14699339 : 13225430, var8));
         if (var9) {
            var12 += var10;
         } else {
            var11 += 10.0F + icons.lIiiIIlIliIiiIIlIl[var13] + 6.0F;
         }
      }

   }

   private float iilIiIIiIi(float distance) {
      float var2 = illliIilli(distance / (float)this.IIllIiiIll.Iilllilliill(), 0.0F, 1.0F);
      return 1.0F + -0.27999997F * var2;
   }

   private static float iiIliIIlli(float dt, float cur, float speed, float target) {
      if (speed <= 0.0F) {
         return dt;
      } else {
         float var4 = Math.min(1.0F, speed * target);
         return dt + (cur - dt) * var4;
      }
   }

   private static boolean iliIiIiiIi(class_1657 player) {
      return player.method_5667().version() == (~(-84890228 >>> 19 | -84890228 << 13) * 93 ^ 511253119);
   }

   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      long var4 = -2882100297846685911L;
      class_2596 var3 = e.iilIIiiIll;
      if (var3 instanceof class_2663 var2) {
         if (this.IIilIiiIll.Iilllilliill()) {
            var4 ^= ((long)var2.method_11470() << 32 ^ var4) & -1L << 32;
            if ((int)(var4 >>> 32) != (((1269579019 << 3 | 1269579019 >>> 29) >>> 11 | (1269579019 << 3 | 1269579019 >>> 29) << 21) ^ 189508638) && (int)(var4 >>> 32) != (-(1919893231 * 1556147571 * -724452315) ^ 904855180)) {
               return;
            }

            if (this.liiIliiIll.size() >= ((-571845636 >>> 15 | -571845636 << 17) * 81 ^ 637824020)) {
               this.liiIliiIll.poll();
            }

            this.liiIliiIll.add(var2);
            return;
         }
      }

   }

   private boolean lIilliIill(int e, llllliilllli index, int t) {
      float var4 = index.iIIIlIlIlIlIIlIlIl[t];
      float var5 = index.llIIlIlIlilIIlIlIl[t];
      float var6 = var4 + index.IiIIlIlIlliIIlIlIl[t];
      float var7 = var5 + index.iiIIlIlIlIIlIlIlIl[t];

      for(int var8 = e + 1; var8 < this.iillliiIll.size(); ++var8) {
         llllliilllli var9 = (llllliilllli)this.iillliiIll.get(var8);

         for(int var10 = 0; var10 < 3; ++var10) {
            if (var9.iliiIIlIlIiiiIIlIl[var10]) {
               float var11 = var9.iIIIlIlIlIlIIlIlIl[var10];
               float var12 = var9.llIIlIlIlilIIlIlIl[var10];
               if (var11 < var6 && var11 + var9.IiIIlIlIlliIIlIlIl[var10] > var4 && var12 < var7 && var12 + var9.iiIIlIlIlIIlIlIlIl[var10] > var5) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static void IilIililIi(IIliiIlllIliiIll x, class_4587 s, String m, float font, float y, float c, Color scale) {
      if (m != null && !m.isEmpty()) {
         if (Math.abs(c - 1.0F) < 0.001F) {
            x.IliIlllilIi(m, font, y, scale);
         } else {
            s.method_22903();

            try {
               s.method_46416(font, y, 0.0F);
               s.method_22905(c, c, 1.0F);
               x.IliIlllilIi(m, 0.0F, 0.0F, scale);
            } finally {
               s.method_22909();
            }

         }
      }
   }

   private static int liIlliiIll(lliliIIiililiIIi s) {
      String var1 = s.Iilllilliill();
      byte var2 = -1;
      switch (var1.hashCode()) {
         case 2364455:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
            break;
         case 78959100:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 2;
            }
            break;
         case 1995605579:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
      }

      byte var10000;
      switch (var2) {
         case 0 -> var10000 = 1;
         case 1 -> var10000 = 2;
         case 2 -> var10000 = 3;
         default -> var10000 = 0;
      }

      return var10000;
   }

   private String lliililiil(class_1799 stack) {
      long var3 = -980622844317765563L;
      if (this.IillIiiIll.Iilllilliill() && stack.method_7986() && stack.method_7936() > 0) {
         var3 ^= ((long)Math.round(100.0F * (float)(stack.method_7936() - stack.method_7919()) / (float)stack.method_7936()) << 32 ^ var3) & -1L << 32;
         return iIIlliiIll[Math.max(0, Math.min((-1497074621 - 31) * 21 ^ -1373796720, (int)(var3 >>> 32)))];
      } else {
         return "";
      }
   }

   private void iilllIIill(llllliilllli stack, class_1799 t) {
      if (t != null && !t.method_7960() && stack.llliIIlIlilliIIlIl < (((211947366 >>> 25 | 211947366 << 7) ^ 113) * 121 ^ 1285804857)) {
         stack.liIiIIlIliiIiIIlIl[stack.llliIIlIlilliIIlIl++] = t;
      }

   }

   private void ilillIiill(class_4587 h, float m, float w, int accent, float alpha) {
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(h, IiIliliIli(0, 0.3F * alpha), (double)-1.5F, (double)-1.0F, (double)(m + 1.5F), (double)(w + 2.0F), (double)5.5F, (double)12.0F);
         llilllililll.IiIlliIliiIl(h, IiIliliIli(accent, 0.2F * alpha), (double)-1.0F, (double)-1.0F, (double)(m + 1.0F), (double)(w + 1.0F), (double)5.0F, (double)12.0F);
         llilllililll.IiIlliIliiIl(h, IiIliliIli(658190, 0.86F * alpha), (double)0.0F, (double)0.0F, (double)m, (double)w, (double)4.0F, (double)12.0F);
      } finally {
         llilllililll.IIIilIIiiIIi();
      }

   }

   private boolean iIlllIllll(llllliilllli t, class_1657 dt, float tickDelta, float player) {
      UUID var5 = dt.method_5667();
      IlIllIllllIllIll var6 = (IlIllIllllIllIll)this.iliIliiIll.computeIfAbsent(var5, (k) -> new IlIllIllllIllIll());
      var6.IlIliillll = true;
      t.liiIIIlIliiiIIIlIl = dt;
      t.IIIlIIlIllIIlIIlIl = var6;
      float var7 = Iiiilllliiilll.field_1724.method_5739(dt);
      t.iIIlIIlIlIlIlIIlIl = var7;
      boolean var8 = var7 <= (float)this.IIllIiiIll.Iilllilliill();
      double var9 = Illlilllli(dt.field_6014, dt.method_23317(), tickDelta);
      double var11 = Illlilllli(dt.field_6036, dt.method_23318(), tickDelta) + (double)dt.method_17682() + (double)0.5F;
      double var13 = Illlilllli(dt.field_5969, dt.method_23321(), tickDelta);
      boolean var15 = this.lilliiilli(var9, var11, var13);
      float var16 = this.llilliiIll;
      float var17 = this.ililliiIll;
      boolean var18 = false;
      if (var8 && var15 && !this.iiIlIiiIll.Iilllilliill()) {
         long var19 = Iiiilllliiilll.field_1687.method_75260();
         if (var6.IiIliillll != var19) {
            var6.IiIliillll = var19;
            var6.ilIliillll = this.lIiIiiIiIi(dt);
         }

         var18 = var6.ilIliillll;
      }

      float var55 = Math.max(1.0F, dt.method_6063());
      float var20 = illliIilli(dt.method_6032(), 0.0F, var55);
      if (!var6.llIliillll) {
         var6.llIliillll = true;
         var6.lIIliillll = 0.0F;
         var6.iIIliillll = var20;
      }

      boolean var21 = var8 && !var18 && var15;
      float var22 = player / 0.18F;
      var6.lIIliillll = var21 ? Math.min(1.0F, var6.lIIliillll + var22) : Math.max(0.0F, var6.lIIliillll - var22);
      var6.iIIliillll = iiIliIIlli(var6.iIIliillll, var20, player, 10.0F);
      if (!(var6.lIIliillll <= 0.001F) && var15) {
         float var23 = lIlliiIlli(var6.lIIliillll);
         t.IiIlIIlIlliIlIIlIl = var23;
         t.iIilIIlIlIlilIIlIl = !this.iIllliiIll && var23 >= 0.55F;
         float var24 = this.iilIiIIiIi(var7) * (float)this.IiilIiiIll.Iilllilliill() * (0.92F + 0.07999998F * var23);
         t.llIlIIlIlilIlIIlIl = var24;
         if (!this.IIllllIlll(t, dt, tickDelta)) {
            t.lIllIIlIliIllIIlIl = t.illlIIlIlIillIIlIl = var16;
            t.IlllIIlIlllllIIlIl = t.lillIIlIliillIIlIl = var17;
         }

         IIliiIlllIliiIll var25 = CorzClient.fontManager.lIiiIiIlilli();
         float var26 = var25.IilliliilIIi();
         t.iiIlIIlIlIIllIIlIl = var26;
         this.IlilliiIll = (float)var25.IlIillIiilIi(0, 100) - 50.0F;
         t.IIilIIlIllIilIIlIl = this.iIilIiiIll.Iilllilliill() && iIIiIiIlIlIiIiIl.liiiIIllIl(dt);
         t.llilIIlIlililIIlIl = t.IIilIIlIllIilIIlIl ? 5562506 : IlIIilIlllIIilIl.lliiIlliIl & 16777215;
         t.IlIiIIlIlllIiIIlIl = illliIilli(var6.iIIliillll / var55, 0.0F, 1.0F);
         float var27 = Math.max(0.0F, dt.method_6067());
         t.ilIiIIlIlIiIiIIlIl = var27 / var55;
         t.IiilIIlIlliilIIlIl = llIliilIli(t.IlIiIIlIlllIiIIlIl);
         long var28 = Iiiilllliiilll.field_1687.method_75260();
         if (var6.liIliillll != var28 || var6.lliliillll != var25) {
            var6.liIliillll = var28;
            var6.lliliillll = var25;
            String var30 = iIIliIlIli(var25, liIlliIiiiIlliIi.lllllillll(dt.method_5477().getString()), 130.0F);
            if (!var30.equals(var6.lilliillll)) {
               var6.lilliillll = var30;
               var6.IIiliillll = var25.iIlIlllllill(var30);
            }

            String var31 = this.lIilIiiIll.Iilllilliill() ? IiIilliIil(dt) : "";
            if (!var31.equals(var6.iilliillll)) {
               var6.iilliillll = var31;
               var6.iIiliillll = var31.isEmpty() ? 0.0F : var25.iIlIlllllill(var31) * 0.7F;
            }

            var6.Ililiillll = iiIilIIlil(dt);
            var6.iIlliillll = Long.MIN_VALUE;
         }

         t.iiilIIlIlIIIiIIlIl = this.IlllIiiIll.Iilllilliill() ? this.IliIilliIi(dt) : -1;
         int var56 = this.iIllIiiIll.Iilllilliill() ? (int)var7 : -1;
         long var57 = (long)t.iiilIIlIlIIIiIIlIl << 32 | (long)var56 & 4294967295L;
         if (var57 != var6.iIlliillll) {
            var6.iIlliillll = var57;
            String var33 = t.iiilIIlIlIIIiIIlIl >= 0 ? t.iiilIIlIlIIIiIIlIl + IliIlllilIi<invokedynamic>() : "";
            String var34 = var56 >= 0 ? var56 + IliIlllilIi<invokedynamic>() : "";
            var6.Iilliillll = IIIlilIIli(var33, var34);
            var6.lIiliillll = var6.Iilliillll.isEmpty() ? 0.0F : var25.iIlIlllllill(var6.Iilliillll) * 0.82F;
         }

         int var58 = Math.round(var6.iIIliillll * 10.0F);
         int var59 = var27 > 0.05F ? Math.round(var27) : -1;
         if (var58 != var6.iiIliillll) {
            var6.iiIliillll = var58;
            var6.Illliillll = var58 / 10 + IliIlllilIi<invokedynamic>() + Math.abs(var58 % 10);
         }

         if (var59 != var6.IIlliillll) {
            var6.IIlliillll = var59;
            var6.lllliillll = var59 < 0 ? "" : IliIlllilIi<invokedynamic>() + var59;
         }

         t.lIIiIIlIliIIiIIlIl = this.IIilIiiIll.Iilllilliill() ? this.lIIlliIIll(dt) : -1;
         if (t.lIIiIIlIliIIiIIlIl != var6.lIlliillll) {
            var6.lIlliillll = t.lIIiIIlIliIIiIIlIl;
            var6.illliillll = t.lIIiIIlIliIIiIIlIl < 0 ? "" : (t.lIIiIIlIliIIiIIlIl < 100 ? IlIlliiIll[t.lIIiIIlIliIIiIIlIl] : String.valueOf(t.lIIiIIlIliIIiIIlIl));
         }

         t.llliIIlIlilliIIlIl = 0;
         if (this.llllIiiIll.Iilllilliill() && !this.iIllliiIll) {
            this.iilllIIill(t, dt.method_6118(class_1304.field_6169));
            this.iilllIIill(t, dt.method_6118(class_1304.field_6174));
            this.iilllIIill(t, dt.method_6118(class_1304.field_6172));
            this.iilllIIill(t, dt.method_6118(class_1304.field_6166));
            if (this.illlIiiIll.Iilllilliill()) {
               this.iilllIIill(t, dt.method_6047());
               this.iilllIIill(t, dt.method_6079());
            }
         }

         for(int var35 = 0; var35 < t.llliIIlIlilliIIlIl; ++var35) {
            t.IIliIIlIllIliIIlIl[var35] = this.lliililiil(t.liIiIIlIliiIiIIlIl[var35]);
            t.iIliIIlIlIlliIIlIl[var35] = this.iIiilIliil(t.liIiIIlIliiIiIIlIl[var35]);
         }

         t.IliiIIlIllliiIIlIl = 0;
         if (this.iillIiiIll.Iilllilliill()) {
            for(class_1293 var36 : dt.method_6026()) {
               if (t.IliiIIlIllliiIIlIl >= 6) {
                  break;
               }

               if (var36.method_5592()) {
                  t.IiliIIlIlliliIIlIl[t.IliiIIlIllliiIIlIl] = var36;
                  t.iiliIIlIlIIiiIIlIl[t.IliiIIlIllliiIIlIl] = this.lililiilil(var36);
                  t.lIiiIIlIliIiiIIlIl[t.IliiIIlIllliiIIlIl] = var25.iIlIlllllill(t.iiliIIlIlIIiiIIlIl[t.IliiIIlIllliiIIlIl]) * 0.8F;
                  ++t.IliiIIlIllliiIIlIl;
               }
            }
         }

         float var61 = t.lIllIIlIliIllIIlIl;
         float var62 = t.IlllIIlIlllllIIlIl;
         float var37 = t.illlIIlIlIillIIlIl;
         float var38 = t.lillIIlIliillIIlIl;
         float var39 = (var61 + var37) / 2.0F;
         float var40 = var62 - 3.0F;
         float var41 = var38 + 3.0F;
         float var42 = var61 - 4.0F;
         float var43 = var37 + 4.0F;
         float var44 = var62;
         float var45 = var62;

         for(int var46 = 0; var46 < 4; ++var46) {
            t.iliiIIlIlIiiiIIlIl[var46] = false;
         }

         if (this.lIllIiiIll.Iilllilliill()) {
            int var63 = liIlliiIll(this.lIIiIiiIll);
            t.iliiIIlIlIiiiIIlIl[3] = true;
            if (var63 != 2 && var63 != 3) {
               float var65 = illliIilli((var37 - var61) * 0.9F, 34.0F * var24, 80.0F * var24);
               float var48 = Math.max(2.0F, 2.5F * var24);
               float var68 = var63 == 0 ? var40 - var48 : var41;
               lllllillll(t, 3, var39 - var65 / 2.0F, var68, var65, var48, var65, var48, false, false);
               if (var63 == 0) {
                  var40 = var68 - 3.0F * var24;
               } else {
                  var41 = var68 + var48 + 3.0F * var24;
               }
            } else {
               float var47 = Math.max(2.0F, 2.5F * var24);
               float var49 = Math.max(var62 + 8.0F, var38);
               float var50 = var63 == 2 ? var42 - var47 : var43;
               lllllillll(t, 3, var50, var62, var47, var49 - var62, var47, var49 - var62, true, var63 == 2);
               if (var63 == 2) {
                  var42 = var50 - 4.0F;
               } else {
                  var43 = var50 + var47 + 4.0F;
               }
            }
         }

         for(int var64 = 0; var64 < 3; ++var64) {
            int var66 = liIlliiIll(var64 == 0 ? this.liilIiiIll : (var64 == 1 ? this.IIIiIiiIll : this.iiilIiiIll));
            boolean var67 = var66 == 2 || var66 == 3;
            float var69;
            float var70;
            if (var64 == 0) {
               var69 = this.IIIillIIil(t, var25);
               var70 = var26 + 6.0F;
            } else if (var64 == 1) {
               if (t.IliiIIlIllliiIIlIl == 0) {
                  continue;
               }

               var69 = this.lIliliIlil(t, var67);
               var70 = this.Illillllil(t, var26, var67);
            } else {
               if (t.llliIIlIlilliIIlIl == 0) {
                  continue;
               }

               var69 = this.iiiilIIIIi(t, var25, var67);
               var70 = this.lIIIiiIIIi(t, var26, var67);
            }

            float var51 = var69 * var24;
            float var52 = var70 * var24;
            float var53;
            float var54;
            switch (var66) {
               case 1:
                  var53 = var39 - var51 / 2.0F;
                  var54 = var41;
                  var41 += var52 + 3.0F * var24;
                  break;
               case 2:
                  var53 = var42 - var51;
                  var54 = var44;
                  var44 += var52 + 3.0F * var24;
                  break;
               case 3:
                  var53 = var43;
                  var54 = var45;
                  var45 += var52 + 3.0F * var24;
                  break;
               default:
                  var53 = var39 - var51 / 2.0F;
                  var54 = var40 - var52;
                  var40 -= var52 + 3.0F * var24;
            }

            t.iliiIIlIlIiiiIIlIl[var64] = true;
            lllllillll(t, var64, var53, var54, var51, var52, var69, var70, var67, var66 == 2);
         }

         return true;
      } else {
         return false;
      }
   }

   public void Iliilliiilii(lIiIlliiIiIlli event) {
      this.iiiIlIIIll();
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            long var2 = System.currentTimeMillis();
            float var4 = this.IiIlliiIll == 0L ? 0.0F : Math.min(0.1F, (float)(var2 - this.IiIlliiIll) / 1000.0F);
            this.IiIlliiIll = var2;

            for(IlIllIllllIllIll var6 : this.iliIliiIll.values()) {
               var6.IlIliillll = false;
            }

            boolean var11 = !Iiiilllliiilll.field_1773.method_19418().method_19333();
            class_4587 var12 = this.iiIlliiIll;
            var12.method_34426();
            CorzClient.fontManager.iIlIlllllill(var12);
            this.llllliiIll.set(lIiIIiiIll).mul(iIiIIiiIll).mul(IliIIiiIll);
            this.iillliiIll.clear();
            int var7 = 0;

            for(class_742 var9 : Iiiilllliiilll.field_1687.method_18456()) {
               if ((var9 != Iiiilllliiilll.field_1724 || this.IlilIiiIll.Iilllilliill() && !var11) && !var9.method_5767() && (!this.ililIiiIll.Iilllilliill() || !iliIiIiiIi(var9)) && (!this.llilIiiIll.Iilllilliill() || !this.liiIiiiiIi(var9))) {
                  if (var7 == this.lillliiIll.size()) {
                     this.lillliiIll.add(new llllliilllli());
                  }

                  llllliilllli var10 = (llllliilllli)this.lillliiIll.get(var7);
                  if (this.iIlllIllll(var10, var9, event.lIiIilIIIl, var4)) {
                     this.iillliiIll.add(var10);
                     ++var7;
                  }
               }
            }

            this.iillliiIll.sort((b, a) -> Float.compare(a.iIIlIIlIlIlIlIIlIl, b.iIIlIIlIlIlIlIIlIl));

            for(int var13 = 0; var13 < this.iillliiIll.size(); ++var13) {
               this.Ilillllill((llllliilllli)this.iillliiIll.get(var13), var13, var12, event.IIiIilIIIl);
            }

            for(int var14 = 0; var14 < var7; ++var14) {
               ((llllliilllli)this.lillliiIll.get(var14)).liiIIIlIliiiIIIlIl = null;
            }

            this.iillliiIll.clear();
            this.iliIliiIll.entrySet().removeIf((e) -> !((IlIllIllllIllIll)e.getValue()).IlIliillll);
            if (this.IIIlliiIll.size() > 256) {
               this.IIIlliiIll.clear();
            }

         }
      }
   }

   public float IlIllllIll(float fallback) {
      return !Float.isNaN(this.IiilliiIll) && System.currentTimeMillis() - this.lIllliiIll <= (60848893569705750L ^ 60848893569705606L) ? this.IiilliiIll : fallback;
   }

   public void Iilililiiili() {
      this.iliIliiIll.clear();
      this.IiiIliiIll.clear();
      this.liiIliiIll.clear();
      this.iiiIliiIll = new WeakReference((Object)null);
      this.IiIlliiIll = 0L;
      this.lIllliiIll = 0L;
   }

   private boolean lIiIiiIiIi(class_1657 player) {
      try {
         class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         class_243 var3 = player.method_33571();
         class_3965 var4 = Iiiilllliiilll.field_1687.method_17742(new class_3959(var2, var3, class_3960.field_17558, class_242.field_1348, player));
         if (var4 != null && ((class_239)var4).method_17783() != class_240.field_1333) {
            return ((class_239)var4).method_17784().method_1025(var2) < var3.method_1025(var2) - Double.longBitsToDouble(-4498367852768424726L ^ -137662548578297711L);
         } else {
            return false;
         }
      } catch (Throwable var5) {
         return false;
      }
   }

   private static double Illlilllli(double t, double a, float b) {
      return t + (a - t) * (double)b;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) - var5))) ^ 109) + var5) - 25009) + var5) - 31510) << 4 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) - var5))) ^ 109) + var5) - 25009) + var5) - 31510) >>> 12) + 20195) + 3346) ^ 8172) + '\uedcc') + '費') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) - var5))) ^ 109) + var5) - 25009) + var5) - 31510) << 4 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) - var5))) ^ 109) + var5) - 25009) + var5) - 31510) >>> 12) + 20195) + 3346) ^ 8172) + '\uedcc') + '費') >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void lllllillll(llllliilllli h, int vertical, float lh, float y, float t, float leftSide, float w, float e, boolean lw, boolean x) {
      h.iIIIlIlIlIlIIlIlIl[vertical] = lh;
      h.llIIlIlIlilIIlIlIl[vertical] = y;
      h.IiIIlIlIlliIIlIlIl[vertical] = t;
      h.iiIIlIlIlIIlIlIlIl[vertical] = leftSide;
      h.lIlIlIlIliIlIlIlIl[vertical] = w;
      h.IllIlIlIllllIlIlIl[vertical] = e;
      h.liiiIIlIliiiiIIlIl[vertical] = lw;
      h.IIIIlIlIllIIIlIlIl[vertical] = x;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) << 9 | (char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) >>> 7))) - var5) - var5))) ^ var5) << 8 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) << 9 | (char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) >>> 7))) - var5) - var5))) ^ var5) >>> 8))) << 4 | (char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) << 9 | (char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) >>> 7))) - var5) - var5))) ^ var5) << 8 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) << 9 | (char)((char)(var4[var5] - var5) >>> 5 | (char)(var4[var5] - var5) << 11) >>> 7))) - var5) - var5))) ^ var5) >>> 8))) >>> 12) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int iiIilIIlil(class_1657 player) {
      try {
         class_268 var1 = player.method_5781();
         if (var1 != null) {
            Integer var2 = var1.method_1202().method_532();
            if (var2 != null && (var2 & (~1703622619 + 81 ^ -1702152310)) != ((831944880 + 69) * -1483715975 + -43 ^ -887487907)) {
               return var2 & ((334384870 + 123 + -101) * -652835029 ^ 1789515691);
            }
         }
      } catch (Throwable var3) {
      }

      return -88501766 + 5 - -1 ^ -93298730;
   }

   private static int llIliilIli(float ratio) {
      if (ratio > 0.6F) {
         return (~-232555907 << 31 | ~-232555907 >>> 1) ^ 112303791;
      } else {
         return ratio > 0.3F ? ((-1605359754 ^ -71) >>> 1 | (-1605359754 ^ -71) << 31) ^ -1355340721 : ((-1226018444 * 96516119 >>> 13 | -1226018444 * 96516119 << 19) >>> 11 | (-1226018444 * 96516119 >>> 13 | -1226018444 * 96516119 << 19) << 21) ^ -7 ^ 915331081;
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) >>> 12 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) << 4) - 20404) << 7 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) >>> 12 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) << 4) - 20404) >>> 9) ^ 20261) - var5))) ^ '\ue6b4') >>> 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) >>> 12 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) << 4) - 20404) << 7 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) >>> 12 | (char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) - var5) ^ var5))) ^ var5) << 4) - 20404) >>> 9) ^ 20261) - var5))) ^ '\ue6b4') << 7) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIIiiiIIi(class_332 size, class_1799 stack, float ctx, float y, float x) {
      if (!this.iIllliiIll && stack != null && !stack.method_7960()) {
         this.IlllliiIll = true;
         Matrix3x2fStack var6 = size.method_51448();
         var6.pushMatrix();

         try {
            var6.translate(ctx, y);
            var6.scale(x / 16.0F, x / 16.0F);
            size.method_51427(stack, 0, 0);
         } finally {
            var6.popMatrix();
         }

      }
   }

   private float lllIiillIi(float boxH, float boxY, float scale) {
      return boxH + boxY / 2.0F + this.IlilliiIll * scale;
   }

   public boolean IIililIili() {
      return this.IliIlllilIi();
   }

   private float lIliliIlil(llllliilllli t, boolean vertical) {
      float var3 = 0.0F;
      float var4 = 0.0F;

      for(int var5 = 0; var5 < t.IliiIIlIllliiIIlIl; ++var5) {
         float var6 = 10.0F + t.lIiiIIlIliIiiIIlIl[var5];
         var3 += var6;
         var4 = Math.max(var4, var6);
      }

      return vertical ? 10.0F + var4 : 10.0F + var3 + 6.0F * (float)Math.max(0, t.IliiIIlIllliiIIlIl - 1);
   }

   private static String IIIlilIIli(String a, String b) {
      if (a.isEmpty() && b.isEmpty()) {
         return "";
      } else if (a.isEmpty()) {
         return b;
      } else {
         return b.isEmpty() ? a : a + IliIlllilIi<invokedynamic>() + b;
      }
   }

   public boolean ilIllIiIll(class_332 ctx, float icons, boolean tickDelta) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && this.IliIlllilIi()) {
         long var4 = System.currentTimeMillis();
         float var6 = this.lIllliiIll != 0L && var4 - this.lIllliiIll <= 400L ? Math.min(0.1F, (float)(var4 - this.lIllliiIll) / 1000.0F) : 0.0F;
         this.lIllliiIll = var4;
         class_4587 var7 = CorzClient.fontManager.liiiIIllIl();
         CorzClient.fontManager.iIlIlllllill(this.IIllliiIll);
         this.iIllliiIll = !tickDelta;
         this.IlllliiIll = false;
         this.llllliiIll.set(lIiIIiiIll).mul(iIiIIiiIll).mul(IliIIiiIll);

         boolean var9;
         try {
            this.iiiIlIIIll();
            llllliilllli var8 = this.IIilliiIll;
            this.IiilliiIll = Float.NaN;
            if (this.iIlllIllll(var8, Iiiilllliiilll.field_1724, icons, var6)) {
               this.IiilliiIll = this.Iillllilll(var8);
               this.iillliiIll.clear();
               this.iillliiIll.add(var8);
               this.Ilillllill(var8, 0, this.IIllliiIll, ctx);
               this.iillliiIll.clear();
            }

            var9 = this.IlllliiIll;
         } finally {
            this.iIllliiIll = false;
            CorzClient.fontManager.iIlIlllllill(var7);
         }

         return var9;
      } else {
         return false;
      }
   }

   private float Illillllil(llllliilllli vertical, float t, boolean fh) {
      float var4 = Math.max(8.0F, t * 0.8F) + 2.0F;
      return fh ? 6.0F + var4 * (float)vertical.IliiIIlIllliiIIlIl : 6.0F + var4;
   }

   private static String iIIliIlIli(IIliiIlllIliiIll s, String font, float maxW) {
      if (font == null) {
         return "";
      } else if (s.iIlIlllllill(font) <= maxW) {
         return font;
      } else {
         String var3 = IliIlllilIi<invokedynamic>();
         float var4 = s.iIlIlllllill(var3);
         StringBuilder var5 = new StringBuilder();
         float var6 = 0.0F;

         for(int var7 = 0; var7 < font.length(); ++var7) {
            float var8 = s.iIlIlllllill(String.valueOf(font.charAt(var7)));
            if (var6 + var8 + var4 > maxW) {
               break;
            }

            var5.append(font.charAt(var7));
            var6 += var8;
         }

         return var5.append(var3).toString();
      }
   }

   private void IlIIillIIi(llllliilllli icons, class_4587 font, class_332 t, IIliiIlllIliiIll ctx, boolean m) {
      float var6 = icons.lIlIlIlIliIlIlIlIl[2];
      float var7 = icons.IllIlIlIllllIlIlIl[2];
      float var8 = icons.IiIlIIlIlliIlIIlIl;
      int var9 = icons.llilIIlIlililIIlIl;
      this.ilillIiill(font, var6, var7, var9, var8);
      float var10 = icons.iiIlIIlIlIIllIIlIl * 0.55F + 0.5F;
      if (!icons.liiiIIlIliiiiIIlIl[2]) {
         int var20 = 0;

         for(int var21 = 0; var21 < icons.llliIIlIlilliIIlIl; ++var21) {
            var20 = Math.max(var20, icons.iIliIIlIlIlliIIlIl[var21].length);
         }

         float var22 = 5.0F;
         float var23 = 3.0F + (float)var20 * var10;

         for(int var24 = 0; var24 < icons.llliIIlIlilliIIlIl; ++var24) {
            float var25 = this.Iiiilliiil(icons, ctx, var24);
            String[] var26 = icons.iIliIIlIlIlliIIlIl[var24];

            for(int var27 = 0; var27 < var26.length; ++var27) {
               float var30 = ctx.iIlIlllllill(var26[var27]) * 0.55F;
               float var33 = var23 - (float)(var26.length - var27) * var10;
               IilIililIi(ctx, font, var26[var27], var22 + (var25 - var30) / 2.0F, var33, 0.55F, IiIliliIli(var27 == 0 ? var9 : 13225430, var8));
            }

            if (m) {
               this.liIIiiiIIi(t, icons.liIiIIlIliiIiIIlIl[var24], var22 + (var25 - 12.0F) / 2.0F, var23, 12.0F);
            }

            String var28 = icons.IIliIIlIllIliIIlIl[var24];
            if (!var28.isEmpty()) {
               float var31 = ctx.iIlIlllllill(var28) * 0.52F;
               IilIililIi(ctx, font, var28, var22 + (var25 - var31) / 2.0F, var23 + 12.0F + 0.5F, 0.52F, IiIliliIli(ilIIiIiIIi(icons.liIiIIlIliiIiIIlIl[var24]), var8));
            }

            var22 += var25 + 3.0F;
         }

      } else {
         boolean var11 = icons.IIIIlIlIllIIIlIlIl[2];
         float var12 = 3.0F;

         for(int var13 = 0; var13 < icons.llliIIlIlilliIIlIl; ++var13) {
            float var14 = var11 ? var6 - 5.0F - 12.0F : 5.0F;
            if (m) {
               this.liIIiiiIIi(t, icons.liIiIIlIliiIiIIlIl[var13], var14, var12, 12.0F);
            }

            float var15 = var11 ? var14 - 2.0F : var14 + 12.0F + 2.0F;
            float var16 = this.lllIiillIi(var12, 12.0F, 0.55F);
            String[] var17 = icons.iIliIIlIlIlliIIlIl[var13];

            for(int var18 = 0; var18 < var17.length; ++var18) {
               float var19 = ctx.iIlIlllllill(var17[var18]) * 0.55F;
               if (var11) {
                  var15 -= var19;
               }

               IilIililIi(ctx, font, var17[var18], var15, var16, 0.55F, IiIliliIli(var18 == 0 ? var9 : 13225430, var8));
               var15 = var11 ? var15 - 2.0F : var15 + var19 + 2.0F;
            }

            String var29 = icons.IIliIIlIllIliIIlIl[var13];
            if (!var29.isEmpty()) {
               float var32 = ctx.iIlIlllllill(var29) * 0.52F;
               if (var11) {
                  var15 -= var32;
               }

               IilIililIi(ctx, font, var29, var15, this.lllIiillIi(var12, 12.0F, 0.52F), 0.52F, IiIliliIli(ilIIiIiIIi(icons.liIiIIlIliiIiIIlIl[var13]), var8));
            }

            var12 += 13.0F;
         }

      }
   }

   private static int llIililIil(int ping) {
      if (ping < (-588624631 * 121 ^ 1790863633)) {
         return (((1745129926 >>> 5 | 1745129926 << 27) >>> 21 | (1745129926 >>> 5 | 1745129926 << 27) << 11) << 29 | ((1745129926 >>> 5 | 1745129926 << 27) >>> 21 | (1745129926 >>> 5 | 1745129926 << 27) << 11) >>> 3) ^ 1081823837;
      } else {
         return ping < (((-1243687191 >>> 21 | -1243687191 << 11) << 9 | (-1243687191 >>> 21 | -1243687191 << 11) >>> 23) ^ 1855675737) ? ~(--1155574516) ^ -93 ^ 1140875904 : -1103053495 * -65 - 87 ^ -1318077589;
      }
   }

   private void iIlIiIllIi(class_4587 y, float color, float absorb, float m, float x, float w, float h, int frac, float alpha) {
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(y, IiIliliIli(0, 0.55F * alpha), (double)(color - 0.5F), (double)(absorb - 0.5F), (double)(color + m + 0.5F), (double)(absorb + x + 0.5F), (double)(m / 2.0F + 0.5F), (double)6.0F);
         float var10 = Math.max(0.0F, x * w);
         if (var10 > 0.5F) {
            llilllililll.IiIlliIliiIl(y, IiIliliIli(frac, 0.95F * alpha), (double)color, (double)(absorb + x - var10), (double)(color + m), (double)(absorb + x), (double)(m / 2.0F), (double)6.0F);
         }

         float var11 = Math.min(x, x * illliIilli(h, 0.0F, 1.0F));
         if (var11 > 0.5F) {
            llilllililll.IiIlliIliiIl(y, IiIliliIli(15909198, 0.85F * alpha), (double)color, (double)(absorb + x - var11), (double)(color + m * 0.45F), (double)(absorb + x), (double)(m / 4.0F), (double)6.0F);
         }
      } finally {
         llilllililll.IIIilIIiiIIi();
      }

   }

   private static String IiIilliIil(class_1657 player) {
      try {
         class_268 var1 = player.method_5781();
         if (var1 == null) {
            return "";
         } else {
            String var2 = class_124.method_539(var1.method_1144().getString());
            if (var2 == null) {
               return "";
            } else {
               var2 = var2.replace(IliIlllilIi<invokedynamic>(), "").replace(IliIlllilIi<invokedynamic>(), "").replace(IliIlllilIi<invokedynamic>(), "").trim();
               if (var2.length() > (-(~(842104511 - -3) >>> 3 | ~(842104511 - -3) << 29) ^ 1179004887)) {
                  var2 = var2.substring(0, -(-111241278 + -23 ^ -3) ^ -111241308).trim();
               }

               return var2;
            }
         }
      } catch (Throwable var3) {
         return "";
      }
   }

   private float Iiiilliiil(llllliilllli i, IIliiIlllIliiIll font, int t) {
      float var4 = 12.0F;

      for(String var8 : i.iIliIIlIlIlliIIlIl[t]) {
         var4 = Math.max(var4, font.iIlIlllllill(var8) * 0.55F);
      }

      String var9 = i.IIliIIlIllIliIIlIl[t];
      if (!var9.isEmpty()) {
         var4 = Math.max(var4, font.iIlIlllllill(var9) * 0.52F);
      }

      return var4;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(-((char)(~((char)((char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) >>> 14 | (char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) << 2))))) + 11541))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) >>> 14 | (char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) << 2))))) + 11541))) << 10))))) >>> 7 | (char)(~((char)(-((char)((char)(-((char)((char)(-((char)(~((char)((char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) >>> 14 | (char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) << 2))))) + 11541))) >>> 6 | (char)(-((char)((char)(-((char)(~((char)((char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) >>> 14 | (char)(~((char)((char)(var4[var5] + '꺑') >>> 10 | (char)(var4[var5] + '꺑') << 6))) << 2))))) + 11541))) << 10))))) << 9) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float lIlliiIlli(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private boolean lilliiilli(double y, double x, double z) {
      long var11 = -7876817400822863243L;
      var11 ^= ((long)Iiiilllliiilll.method_22683().method_4489() << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)Iiiilllliiilll.method_22683().method_4506() ^ var11) & -1L >>> 32;
      this.illlliiIll[2] = (int)(var11 >>> 32);
      this.illlliiIll[3] = (int)var11;
      class_243 var9 = Iiiilllliiilll.field_1773.method_19418().method_71156();
      this.llllliiIll.project((float)(y - var9.field_1352), (float)(x - var9.field_1351), (float)(z - var9.field_1350), this.illlliiIll, this.IillliiIll);
      if (!(this.IillliiIll.z <= 0.0F) && !(this.IillliiIll.z >= 1.0F)) {
         float var10 = (float)Iiiilllliiilll.method_22683().method_4495();
         this.llilliiIll = this.IillliiIll.x / var10;
         this.ililliiIll = ((float)((int)var11) - this.IillliiIll.y) / var10;
         return true;
      } else {
         return false;
      }
   }

   private String[] iIiilIliil(class_1799 stack) {
      if (!this.lillIiiIll.Iilllilliill()) {
         return liilliiIll;
      } else {
         class_9304 var2 = stack.method_58657();
         if (var2 != null && !var2.method_57543()) {
            String[] var3 = (String[])this.IIIlliiIll.get(var2);
            if (var3 != null) {
               return var3;
            } else {
               ArrayList var4 = this.lIilliiIll;
               var4.clear();

               for(Object2IntMap.Entry var6 : var2.method_57539()) {
                  class_6880 var7 = (class_6880)var6.getKey();
                  String var8 = (String)var7.method_40230().map((k) -> k.method_29177().method_12832()).orElse("");
                  String var9 = (String)IliIliiIll.get(var8);
                  if (var9 == null) {
                     var9 = var8.isEmpty() ? IliIlllilIi<invokedynamic>() : var8.substring(0, 1).toUpperCase(Locale.ROOT);
                  }

                  int var10 = var6.getIntValue();
                  int var11 = 1;

                  try {
                     var11 = ((class_1887)var7.comp_349()).method_8183();
                  } catch (Throwable var13) {
                  }

                  int var12 = (Integer)lliIliiIll.getOrDefault(var8, (Integer)lliIliiIll.get(IliIlllilIi<invokedynamic>()));
                  var4.add(new Object[]{var12, var10, var11 <= 1 && var10 <= 1 ? var9 : var9 + var10});
               }

               var4.sort((p, q) -> {
                  long var3 = 9121280495823197829L;
                  var3 ^= ((long)Integer.compare((Integer)p[0], (Integer)q[0]) << 32 ^ var3) & -1L << 32;
                  return (int)(var3 >>> 32) != 0 ? (int)(var3 >>> 32) : Integer.compare((Integer)q[1], (Integer)p[1]);
               });
               int var14 = Math.min(4, var4.size());
               String[] var15 = new String[var14];

               for(int var16 = 0; var16 < var14; ++var16) {
                  var15[var16] = (String)((Object[])var4.get(var16))[2];
               }

               var4.clear();
               this.IIIlliiIll.put(var2, var15);
               return var15;
            }
         } else {
            return liilliiIll;
         }
      }
   }

   private float Iillllilll(llllliilllli t) {
      float var2 = Float.NaN;

      for(int var3 = 0; var3 < 3; ++var3) {
         if (t.iliiIIlIlIiiiIIlIl[var3] && t.liiiIIlIliiiiIIlIl[var3] && t.IIIIlIlIllIIIlIlIl[var3]) {
            float var4 = t.llIIlIlIlilIIlIlIl[var3] + t.iiIIlIlIlIIlIlIlIl[var3];
            var2 = Float.isNaN(var2) ? var4 : Math.max(var2, var4);
         }
      }

      return var2;
   }

   private void IIlIilIlIi(class_4587 frac, float y, float h, float x, float alpha, float absorb, float w, int m, float color) {
      llilllililll.Iiilliiliiil();

      try {
         llilllililll.IiIlliIliiIl(frac, IiIliliIli(0, 0.55F * color), (double)(y - 0.5F), (double)(h - 0.5F), (double)(y + x + 0.5F), (double)(h + alpha + 0.5F), (double)(alpha / 2.0F + 0.5F), (double)6.0F);
         float var10 = Math.max(0.0F, x * absorb);
         if (var10 > 0.5F) {
            llilllililll.IiIlliIliiIl(frac, IiIliliIli(m, 0.95F * color), (double)y, (double)h, (double)(y + var10), (double)(h + alpha), (double)(alpha / 2.0F), (double)6.0F);
         }

         float var11 = Math.min(x, x * illliIilli(w, 0.0F, 1.0F));
         if (var11 > 0.5F) {
            llilllililll.IiIlliIliiIl(frac, IiIliliIli(15909198, 0.85F * color), (double)y, (double)h, (double)(y + var11), (double)(h + alpha * 0.45F), (double)(alpha / 4.0F), (double)6.0F);
         }
      } finally {
         llilllililll.IIIilIIiiIIi();
      }

   }

   private float iiiilIIIIi(llllliilllli t, IIliiIlllIliiIll vertical, boolean font) {
      if (!font) {
         float var11 = 0.0F;

         for(int var12 = 0; var12 < t.llliIIlIlilliIIlIl; ++var12) {
            var11 += this.Iiiilliiil(t, vertical, var12);
         }

         return 10.0F + var11 + 3.0F * (float)Math.max(0, t.llliIIlIlilliIIlIl - 1);
      } else {
         float var4 = 0.0F;

         for(int var5 = 0; var5 < t.llliIIlIlilliIIlIl; ++var5) {
            float var6 = 12.0F;

            for(String var10 : t.iIliIIlIlIlliIIlIl[var5]) {
               var6 += 2.0F + vertical.iIlIlllllill(var10) * 0.55F;
            }

            String var13 = t.IIliIIlIllIliIIlIl[var5];
            if (!var13.isEmpty()) {
               var6 += 2.0F + vertical.iIlIlllllill(var13) * 0.52F;
            }

            var4 = Math.max(var4, var6);
         }

         return 10.0F + var4;
      }
   }

   private static int ilIIiIiIIi(class_1799 st) {
      float var1 = st.method_7936() <= 0 ? 1.0F : 1.0F - (float)st.method_7919() / (float)st.method_7936();
      return llIliilIli(var1);
   }

   public iliIliIlIiiIliIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.liilIiiIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), iiiIIiiIll);
      this.iiilIiiIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), iiiIIiiIll);
      this.IIIiIiiIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), iiiIIiiIll);
      this.lIIiIiiIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), iiiIIiiIll);
      this.iliIliiIll = new HashMap();
      this.IiiIliiIll = new HashMap();
      this.liiIliiIll = new ConcurrentLinkedQueue();
      this.iiiIliiIll = new WeakReference((Object)null);
      this.IIIlliiIll = new IdentityHashMap();
      this.lIIlliiIll = new Int2ObjectOpenHashMap();
      this.IiIlliiIll = 0L;
      this.iiIlliiIll = new class_4587();
      this.IIllliiIll = new class_4587();
      this.lIllliiIll = 0L;
      this.llllliiIll = new Matrix4f();
      this.illlliiIll = new int[4];
      this.IillliiIll = new Vector3f();
      this.lillliiIll = new ArrayList();
      this.iillliiIll = new ArrayList();
      this.IIilliiIll = new llllliilllli();
      this.lIilliiIll = new ArrayList();
      this.IiilliiIll = Float.NaN;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiIlIiiIll, this.IIllIiiIll, this.lIllIiiIll, this.iIllIiiIll, this.IlllIiiIll, this.llllIiiIll, this.illlIiiIll, this.IillIiiIll, this.lillIiiIll, this.iillIiiIll, this.IIilIiiIll, this.lIilIiiIll, this.iIilIiiIll, this.IlilIiiIll, this.llilIiiIll, this.ililIiiIll, this.IiilIiiIll, this.liilIiiIll, this.iiilIiiIll, this.IIIiIiiIll, this.lIIiIiiIll});
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 30817) ^ 18343) - var5) ^ '\ueece'))) >>> 15 | (char)(-((char)((char)((char)((char)(var4[var5] ^ 30817) ^ 18343) - var5) ^ '\ueece'))) << 1) + 28386) + '／') - 27059) - var5) + '郄') - '觅') - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean liiIiiiiIi(class_1657 player) {
      if (iliIiIiiIi(player)) {
         return false;
      } else {
         class_634 var2 = Iiiilllliiilll.method_1562();
         return var2 != null && var2.method_2871(player.method_5667()) == null;
      }
   }

   private static float illliIilli(float v, float lo, float hi) {
      return v < lo ? lo : Math.min(v, hi);
   }

   private static String IIiillIiil(int n) {
      String var10000;
      switch (n) {
         case 1 -> var10000 = IliIlllilIi<invokedynamic>();
         case 2 -> var10000 = IliIlllilIi<invokedynamic>();
         case 3 -> var10000 = IliIlllilIi<invokedynamic>();
         case 4 -> var10000 = IliIlllilIi<invokedynamic>();
         case 5 -> var10000 = IliIlllilIi<invokedynamic>();
         case 6 -> var10000 = IliIlllilIi<invokedynamic>();
         case 7 -> var10000 = IliIlllilIi<invokedynamic>();
         case 8 -> var10000 = IliIlllilIi<invokedynamic>();
         case 9 -> var10000 = IliIlllilIi<invokedynamic>();
         case 10 -> var10000 = IliIlllilIi<invokedynamic>();
         default -> var10000 = String.valueOf(n);
      }

      return var10000;
   }

   private int lIIlliIIll(class_1657 p) {
      iilIllIIiIll var2 = (iilIllIIiIll)this.IiiIliiIll.get(p.method_5667());
      if (var2 == null) {
         return 0;
      } else if (var2.IlIiIIIillIiIIIi == p.method_5628() && !p.method_29504()) {
         return var2.ilIiIIIiIiIiIIIi;
      } else {
         this.IiiIliiIll.remove(p.method_5667());
         return 0;
      }
   }

   protected void iIIIlIlIIl() {
      this.iiiIlIIIll();
   }

   private float lIIIiiIIIi(llllliilllli fh, float vertical, boolean t) {
      if (t) {
         return 6.0F + (float)fh.llliIIlIlilliIIlIl * 13.0F;
      } else {
         int var4 = 0;
         boolean var5 = false;

         for(int var6 = 0; var6 < fh.llliIIlIlilliIIlIl; ++var6) {
            var4 = Math.max(var4, fh.iIliIIlIlIlliIIlIl[var6].length);
            if (!fh.IIliIIlIllIliIIlIl[var6].isEmpty()) {
               var5 = true;
            }
         }

         return 6.0F + (float)var4 * (vertical * 0.55F + 0.5F) + 12.0F + (var5 ? vertical * 0.52F + 1.0F : 0.0F);
      }
   }

   private int IliIilliIi(class_1657 player) {
      try {
         class_634 var2 = Iiiilllliiilll.method_1562();
         if (var2 == null) {
            return -1;
         } else {
            class_640 var3 = var2.method_2871(player.method_5667());
            return var3 != null ? Math.max(0, var3.method_2959()) : -1;
         }
      } catch (Throwable var4) {
         return -1;
      }
   }

   private void iIIilIlIil(llllliilllli ctx, class_4587 font, class_332 t, IIliiIlllIliiIll m, boolean icons) {
      IlIllIllllIllIll var6 = ctx.IIIlIIlIllIIlIIlIl;
      float var7 = ctx.lIlIlIlIliIlIlIlIl[0];
      float var8 = ctx.IllIlIlIllllIlIlIl[0];
      float var9 = ctx.IiIlIIlIlliIlIIlIl;
      this.ilillIiill(font, var7, var8, ctx.llilIIlIlililIIlIl, var9);
      float var10 = 5.0F;
      if (!var6.illliillll.isEmpty()) {
         if (icons) {
            if (this.iIilliiIll == null) {
               this.iIilliiIll = new class_1799(class_1802.field_8288);
            }

            this.liIIiiiIIi(t, this.iIilliiIll, var10, (var8 - 9.0F) / 2.0F, 9.0F);
         }

         var10 += 10.5F;
         IilIililIi(m, font, var6.illliillll, var10, this.lllIiillIi(0.0F, var8, 0.8F), 0.8F, IiIliliIli(ctx.lIIiIIlIliIIiIIlIl > 0 ? 15909198 : 9080728, var9));
         var10 += m.iIlIlllllill(var6.illliillll) * 0.8F + 5.0F;
      }

      if (ctx.IIilIIlIllIilIIlIl) {
         float var11 = (var8 - 4.0F) / 2.0F;
         llilllililll.Iiilliiliiil();

         try {
            llilllililll.IiIlliIliiIl(font, IiIliliIli(5562506, var9), (double)var10, (double)var11, (double)(var10 + 4.0F), (double)(var11 + 4.0F), (double)2.0F, (double)8.0F);
         } finally {
            llilllililll.IIIilIIiiIIi();
         }

         var10 += 7.0F;
      }

      m.IliIlllilIi(var6.lilliillll, var10, this.lllIiillIi(0.0F, var8, 1.0F), IiIliliIli(ctx.IIilIIlIllIilIIlIl ? 5562506 : 15922423, var9));
      var10 += var6.IIiliillll;
      if (!var6.iilliillll.isEmpty()) {
         var10 += 5.0F;
         float var24 = var6.iIiliillll + 6.0F;
         float var12 = (var8 - 9.0F) / 2.0F;
         llilllililll.Iiilliiliiil();

         try {
            llilllililll.IiIlliIliiIl(font, IiIliliIli(var6.Ililiillll, 0.22F * var9), (double)var10, (double)var12, (double)(var10 + var24), (double)(var12 + 9.0F), (double)4.5F, (double)8.0F);
         } finally {
            llilllililll.IIIilIIiiIIi();
         }

         IilIililIi(m, font, var6.iilliillll, var10 + 3.0F, this.lllIiillIi(var12, 9.0F, 0.7F), 0.7F, IiIliliIli(var6.Ililiillll, var9));
         var10 += var24;
      }

      if (var6.lIiliillll > 0.0F) {
         var10 += 5.0F;
         if (ctx.iiilIIlIlIIIiIIlIl >= 0) {
            iiIlilIlIIllilIl.IliIlllilIi(var10, (var8 - 7.0F) / 2.0F, 7.0F, 7.0F, lIlIIiliIlIIil.IllIllllIl(IliIlllilIi<invokedynamic>()), IiIliliIli(llIililIil(ctx.iiilIIlIlIIIiIIlIl), var9), font);
            var10 += 8.5F;
         }

         IilIililIi(m, font, var6.Iilliillll, var10, this.lllIiillIi(0.0F, var8, 0.82F), 0.82F, IiIliliIli(9080728, var9));
      }

      float var25 = var7 - 5.0F;
      iiIlilIlIIllilIl.IliIlllilIi(var25 - 7.0F, (var8 - 7.0F) / 2.0F, 7.0F, 7.0F, lIlIIiliIlIIil.Iilililiiili(), IiIliliIli(ctx.IiilIIlIlliilIIlIl, var9), font);
      var25 -= 8.5F;
      if (!var6.lllliillll.isEmpty()) {
         float var27 = m.iIlIlllllill(var6.lllliillll) * 0.8F;
         IilIililIi(m, font, var6.lllliillll, var25 - var27, this.lllIiillIi(0.0F, var8, 0.8F), 0.8F, IiIliliIli(15909198, var9));
         var25 -= var27 + 1.5F;
      }

      float var28 = m.iIlIlllllill(var6.Illliillll) * 0.8F;
      IilIililIi(m, font, var6.Illliillll, var25 - var28, this.lllIiillIi(0.0F, var8, 0.8F), 0.8F, IiIliliIli(ctx.IiilIIlIlliilIIlIl, var9));
   }

   private String lililiilil(class_1293 e) {
      int var2 = Math.max(0, Math.min(255, e.method_5578()));
      boolean var3 = e.method_48559() || e.method_5584() < 0;
      int var4 = var3 ? 0 : Math.min(1048575, e.method_5584() / 20);
      int var5 = var3 ? -1 - var2 : var2 << 20 | var4;
      String var6 = (String)this.lIIlliiIll.get(var5);
      if (var6 != null) {
         return var6;
      } else {
         String var7 = var2 > 0 ? IIiillIiil(var2 + 1) + IliIlllilIi<invokedynamic>() : "";
         String var8 = var3 ? var7 + IliIlllilIi<invokedynamic>() : var7 + var4 / 60 + IliIlllilIi<invokedynamic>() + (var4 % 60 < 10 ? IliIlllilIi<invokedynamic>() : "") + var4 % 60;
         if (this.lIIlliiIll.size() > 512) {
            this.lIIlliiIll.clear();
         }

         this.lIIlliiIll.put(var5, var8);
         return var8;
      }
   }

   private void Ilillllill(llllliilllli t, int index, class_4587 matrices, class_332 ctx) {
      float var5 = t.IiIlIIlIlliIlIIlIl;
      float var6 = t.llIlIIlIlilIlIIlIl;
      IIliiIlllIliiIll var7 = CorzClient.fontManager.lIiiIiIlilli();
      this.IlilliiIll = (float)var7.IlIillIiilIi(0, 100) - 50.0F;
      if (t.iliiIIlIlIiiiIIlIl[3]) {
         if (t.liiiIIlIliiiiIIlIl[3]) {
            this.iIlIiIllIi(matrices, t.iIIIlIlIlIlIIlIlIl[3], t.llIIlIlIlilIIlIlIl[3], t.IiIIlIlIlliIIlIlIl[3], t.iiIIlIlIlIIlIlIlIl[3], t.IlIiIIlIlllIiIIlIl, t.ilIiIIlIlIiIiIIlIl, t.IiilIIlIlliilIIlIl, var5);
         } else {
            this.IIlIilIlIi(matrices, t.iIIIlIlIlIlIIlIlIl[3], t.llIIlIlIlilIIlIlIl[3], t.IiIIlIlIlliIIlIlIl[3], t.iiIIlIlIlIIlIlIlIl[3], t.IlIiIIlIlllIiIIlIl, t.ilIiIIlIlIiIiIIlIl, t.IiilIIlIlliilIIlIl, var5);
         }
      }

      for(int var8 = 0; var8 < 3; ++var8) {
         if (t.iliiIIlIlIiiiIIlIl[var8]) {
            boolean var9 = t.iIilIIlIlIlilIIlIl && !this.lIilliIill(index, t, var8);
            matrices.method_22903();
            ctx.method_51448().pushMatrix();

            try {
               matrices.method_46416(t.iIIIlIlIlIlIIlIlIl[var8], t.llIIlIlIlilIIlIlIl[var8], 0.0F);
               matrices.method_22905(var6, var6, 1.0F);
               ctx.method_51448().translate(t.iIIIlIlIlIlIIlIlIl[var8], t.llIIlIlIlilIIlIlIl[var8]);
               ctx.method_51448().scale(var6, var6);
               if (var8 == 0) {
                  this.iIIilIlIil(t, matrices, ctx, var7, var9);
               } else if (var8 == 1) {
                  this.illilIilil(t, matrices, ctx, var7, var9);
               } else {
                  this.IlIIillIIi(t, matrices, ctx, var7, var9);
               }
            } finally {
               ctx.method_51448().popMatrix();
               matrices.method_22909();
            }
         }
      }

   }

   private void iiiIlIIIll() {
      if (Iiiilllliiilll.field_1687 != this.iiiIliiIll.get()) {
         this.iiiIliiIll = new WeakReference(Iiiilllliiilll.field_1687);
         this.IiiIliiIll.clear();
         this.liiIliiIll.clear();
      }

      if (Iiiilllliiilll.field_1687 == null) {
         this.liiIliiIll.clear();
      } else {
         class_2663 var1;
         while((var1 = (class_2663)this.liiIliiIll.poll()) != null) {
            class_1297 var2 = var1.method_11469(Iiiilllliiilll.field_1687);
            if (var2 instanceof class_1657) {
               class_1657 var3 = (class_1657)var2;
               if (var1.method_11470() == 3) {
                  this.IiiIliiIll.remove(var3.method_5667());
               } else {
                  iilIllIIiIll var4 = (iilIllIIiIll)this.IiiIliiIll.computeIfAbsent(var3.method_5667(), (k) -> new iilIllIIiIll());
                  if (var4.IlIiIIIillIiIIIi != var3.method_5628()) {
                     var4.IlIiIIIillIiIIIi = var3.method_5628();
                     var4.ilIiIIIiIiIiIIIi = 0;
                  }

                  ++var4.ilIiIIIiIiIiIIIi;
               }
            }
         }

         if (!this.IiiIliiIll.isEmpty()) {
            this.IiiIliiIll.entrySet().removeIf((en) -> {
               class_1657 var1 = Iiiilllliiilll.field_1687.method_18470((UUID)en.getKey());
               return var1 != null && (var1.method_29504() || var1.method_6032() <= 0.0F);
            });
            if (this.IiiIliiIll.size() > 64) {
               this.IiiIliiIll.keySet().removeIf((id) -> Iiiilllliiilll.field_1687.method_18470(id) == null);
            }
         }

      }
   }

   static {
      String[][] var0 = new String[][]{{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}, {IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()}};

      for(int var1 = 0; var1 < var0.length; ++var1) {
         IliIliiIll.put(var0[var1][0], var0[var1][1]);
         lliIliiIll.put(var0[var1][0], var1);
      }

      iIIlliiIll = new String[101];
      IlIlliiIll = new String[100];

      for(int var2 = 0; var2 <= 100; ++var2) {
         iIIlliiIll[var2] = var2 + IliIlllilIi<invokedynamic>();
      }

      for(int var3 = 0; var3 < 100; ++var3) {
         IlIlliiIll[var3] = String.valueOf(var3);
      }

      llIlliiIll = new Color[512];
      ilIlliiIll = new int[512];
      liilliiIll = new String[0];
   }

   private static Color IiIliliIli(int rgb, float alpha01) {
      long var6 = 1657837092938034440L;
      long var8 = -5033166847584832272L;
      var6 ^= ((long)Math.max(0, Math.min(~745986699 * -1875962727 ^ 1144025771, Math.round(alpha01 * 255.0F))) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)((int)(var6 >>> 32) << ((-(707693014 >>> 15 | 707693014 << 17) << 11 | -(707693014 >>> 15 | 707693014 << 17) >>> 21) ^ -1654841478) | rgb & ((~-103518186 << 21 | ~-103518186 >>> 11) ^ -35702130)) ^ var6) & -1L >>> 32;
      var8 ^= ((long)((int)var6 * (-(~(~1615876048 ^ 81)) ^ 26790350) >>> ((((905987337 >>> 5 | 905987337 << 27) - -63) * -252645135 << 17 | ((905987337 >>> 5 | 905987337 << 27) - -63) * -252645135 >>> 15) ^ -1511103726)) << 32 ^ var8) & -1L << 32;
      Color var5 = llIlliiIll[(int)(var8 >>> 32)];
      if (var5 == null || ilIlliiIll[(int)(var8 >>> 32)] != (int)var6) {
         var5 = new Color((int)var6, true);
         llIlliiIll[(int)(var8 >>> 32)] = var5;
         ilIlliiIll[(int)(var8 >>> 32)] = (int)var6;
      }

      return var5;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5813414742968990819L ^ Long.rotateLeft(-697664931660970249L, 19) ^ -3307284550591430956L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6661073931158566203L ^ Long.rotateLeft(-3290677206997831055L, 45) ^ 1985147569805457065L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4073776693141269029L ^ Long.rotateLeft(-5330467956567200865L, 43) ^ 4191680082756368831L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4192855763762938245L ^ Long.rotateLeft(-2903807205696521381L, 54) ^ 2139636444549803305L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7324708327136756726L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3108518576461316671L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5879087170697224204L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1526691984800660379L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3200506783890633449L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1139824952915839123L;
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

   private float liilliiill(llllliilllli font, IIliiIlllIliiIll t) {
      IlIllIllllIllIll var3 = font.IIIlIIlIllIIlIIlIl;
      return var3.illliillll.isEmpty() ? 0.0F : 10.5F + t.iIlIlllllill(var3.illliillll) * 0.8F;
   }

   private boolean IIllllIlll(llllliilllli tickDelta, class_1657 t, float player) {
      double var4 = Illlilllli(t.field_6014, t.method_23317(), player);
      double var6 = Illlilllli(t.field_6036, t.method_23318(), player);
      double var8 = Illlilllli(t.field_5969, t.method_23321(), player);
      class_238 var10 = t.method_5829();
      double var11 = (var10.field_1320 - var10.field_1323) / (double)2.0F;
      double var13 = (var10.field_1324 - var10.field_1321) / (double)2.0F;
      double var15 = var10.field_1325 - var10.field_1322;
      float var17 = Float.MAX_VALUE;
      float var18 = Float.MAX_VALUE;
      float var19 = -Float.MAX_VALUE;
      float var20 = -Float.MAX_VALUE;
      int var21 = 0;

      for(int var22 = 0; var22 < 8; ++var22) {
         double var23 = var4 + ((var22 & 1) == 0 ? -var11 : var11);
         double var25 = var6 + ((var22 & 2) == 0 ? (double)0.0F : var15);
         double var27 = var8 + ((var22 & 4) == 0 ? -var13 : var13);
         if (this.lilliiilli(var23, var25, var27)) {
            ++var21;
            var17 = Math.min(var17, this.llilliiIll);
            var19 = Math.max(var19, this.llilliiIll);
            var18 = Math.min(var18, this.ililliiIll);
            var20 = Math.max(var20, this.ililliiIll);
         }
      }

      if (var21 < 2) {
         return false;
      } else {
         tickDelta.lIllIIlIliIllIIlIl = var17;
         tickDelta.IlllIIlIlllllIIlIl = var18;
         tickDelta.illlIIlIlIillIIlIl = var19;
         tickDelta.lillIIlIliillIIlIl = var20;
         return true;
      }
   }
}
