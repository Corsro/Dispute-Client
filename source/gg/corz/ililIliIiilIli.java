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
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.IntConsumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;
import org.joml.Matrix3x2fStack;

public class ililIliIiilIli extends Iliilliiilii {
   private int IllIIlIIIl;
   private static final int lIillIIIIl = 4;
   private static final float liiilIIIIl = 26.0F;
   private static final float lIlIiIIIIl = 150.0F;
   private static final float IIIIiIIIIl = 14.0F;
   private static final int IlIliIIIIl = 3;
   private static final float iliilIIIIl = 16.0F;
   private float IlIIIlIIIl;
   private static final int IiIIiIIIIl = 2;
   private final boolean illliIIIIl;
   private static final float llIIiIIIIl = 0.92F;
   private static final int lIlliIIIIl;
   private static final float IiiilIIIIl = 12.0F;
   private float ilIIIlIIIl;
   private static final float IlIIiIIIIl = 2.5F;
   private static final float iIIilIIIIl = 4.0F;
   private String IiliiIIIIl;
   private final Runnable iiIiiIIIIl;
   private long liiiiIIIIl;
   private String lllIIlIIIl;
   private final float iIiliIIIIl;
   private static final float iiIIiIIIIl = 3.0F;
   private float lIiIIlIIIl;
   private boolean IIlIIlIIIl;
   private static final String[] IlillIIIIl;
   private static final float lllilIIIIl = 0.9F;
   private float liIIIlIIIl;
   private final iiiilIIiIIIIiIIi liiliIIIIl;
   private static final float lilIiIIIIl = 200.0F;
   private final float[] ilIiiIIIIl;
   private final float[] liIiiIIIIl;
   private static final float lIIIiIIIIl = 10.0F;
   private static final float IiiIiIIIIl = 420.0F;
   private String IiiiiIIIIl;
   private final List<ilillIllIiillIll> lliliIIIIl;
   private static final float iiiilIIIIl = 14.0F;
   private final float IliliIIIIl;
   private long IilIIlIIIl;
   private final Map<class_1792, ilillIllIiillIll> ililiIIIIl;
   private static final float lliIiIIIIl = 500.0F;
   private boolean lIlIIlIIIl;
   private String liliiIIIIl;
   private static final int lllllIIIIl = 1;
   private static final int IiIliIIIIl = -11117467;
   private static boolean IIllIlIIIl;
   private static final int IilllIIIIl = 0;
   private static final int liIliIIIIl = -5854026;
   private static final int lllliIIIIl;
   private float lliIIlIIIl;
   private long IIIIIlIIIl;
   private static final float IliIiIIIIl = 2600.0F;
   private float IiIlIlIIIl;
   private final float[] llIiiIIIIl;
   private static final String[] iiillIIIIl;
   private float IliIIlIIIl;
   private final String[] lIiliIIIIl;
   private static final int illllIIIIl = 2;
   private String iIiiiIIIIl;
   private final iiiIiIIlIIIliIIl iiiliIIIIl;
   private iliIIIiIiiIIIi<class_1792> iIliiIIIIl;
   private static final float lllIiIIIIl = 4.0F;
   private float iIIIIlIIIl;
   private static final String[] llillIIIIl;
   private float iliIIlIIIl;
   private static final int lIlllIIIIl = -1;
   private float iiiIIlIIIl;
   private float IIIlIlIIIl;
   private static final float iIlilIIIIl = 5.0F;
   private String iiliiIIIIl;
   private static final float IiIilIIIIl = 4.0F;
   private static final float liiIiIIIIl = 480.0F;
   private static final float lIIilIIIIl = 11.0F;
   private static final long lIiIiIIIIl = 160000000L;
   private final Runnable IIliiIIIIl;
   private static final float IllilIIIIl = 6.0F;
   private static final int lilllIIIIl = 1;
   private static final int IllliIIIIl;
   private final String IIiliIIIIl;
   private static final float iiiIiIIIIl = 166.0F;
   private static final float illilIIIIl = 0.72F;
   private final int[] iIIiiIIIIl;
   private static final float IllIiIIIIl = 220.0F;
   private static final float lililIIIIl = 0.8F;
   private float iIiIIlIIIl;
   private float ilIlIlIIIl;
   private float llIIIlIIIl;
   private static final String liillIIIIl = "Done";
   private String lliiiIIIIl;
   private iiIlIiIIllIi llliiIIIIl;
   private String IIiiiIIIIl;
   private final liIilIiliiIilIil[] IIIiiIIIIl;
   private boolean iiIIIlIIIl;
   private static final float IIlIiIIIIl = 0.045F;
   private float liIlIlIIIl;
   private float liiIIlIIIl;
   private String IliiiIIIIl;
   private static final float iIIIiIIIIl = 8.0F;
   private static final float iiIilIIIIl = 16.0F;
   private String illIIlIIIl;
   private static final float IliilIIIIl = 3.0F;
   private static final float IIIliIIIIl = 6.0F;
   private static final int iIlllIIIIl = Integer.MIN_VALUE;
   private static final float lIiilIIIIl = 10.0F;
   private static final float IIIilIIIIl = 12.0F;
   private float IiIIIlIIIl;
   private float llIlIlIIIl;
   private static final float lIlilIIIIl = 8.0F;
   private final liIilIiliiIilIil lIIiiIIIIl;
   private static final int iiIliIIIIl;
   private static final int iilIiIIIIl = 12;
   private float iIIlIlIIIl;
   private static final float ilIilIIIIl = 16.0F;
   private float IlIlIlIIIl;
   private long iiiiiIIIIl;
   private final List<ilillIllIiillIll> IiiliIIIIl;
   private static final String IiillIIIIl = "No price";
   private static final String ilillIIIIl = "MATERIAL";
   private float iilIIlIIIl;
   private static final float iIlIiIIIIl = 18.0F;
   private long lilIIlIIIl;
   private static final float IilIiIIIIl = 30.0F;
   private static final int IIillIIIIl = 3;
   private static final float ilIIiIIIIl = 0.45F;
   private String iliiiIIIIl;
   private static final float IIlilIIIIl = 12.0F;
   private static final int lIIliIIIIl = 9;
   private static final int iIIliIIIIl = 7;
   private float IiiIIlIIIl;
   private static final float liIilIIIIl = 7.0F;
   private static final float IIiilIIIIl = 14.0F;
   private final String IilliIIIIl;
   private static final float iIiilIIIIl = 2.0F;
   private static final int ilIliIIIIl = -7630437;
   private static final int iIlliIIIIl;
   private int illiiIIIIl;
   private String lIiiiIIIIl;
   private static final float lliilIIIIl = 184.0F;
   private static final int iIillIIIIl = 5;
   private static final float iililIIIIl = 2.0F;
   private static final int iilllIIIIl = 2;
   private static final int IIlliIIIIl;
   private long lIIIIlIIIl;
   private IIIIllillIIIllil<class_1792> IlliiIIIIl;
   private final float[] IiIiiIIIIl;
   private static final float iIiIiIIIIl = 180.0F;
   private final String[] iilliIIIIl;
   private static final float liIIiIIIIl = 170.0F;
   private int iIlIIlIIIl;
   private static final int llIliIIIIl = -920587;
   private final IntConsumer lIliiIIIIl;
   private final float[] IlIiiIIIIl;
   private final int lilliIIIIl;
   private static final float iliIiIIIIl = 7.0F;
   private static final int IIiIiIIIIl = 24;
   private float iiIlIlIIIl;
   private static final float llIilIIIIl = 5.0F;
   private static final int IllllIIIIl = 0;
   private static final float IililIIIIl = 0.82F;
   private float lIIlIlIIIl;
   private static final int IIlllIIIIl = 6;
   private float IIiIIlIIIl;
   private static final float illIiIIIIl = 120.0F;
   private static final float IlIilIIIIl = 20.0F;

   public void lllllillll(IIIIllillIIIllil<class_1792> next) {
      if (!this.illliIIIIl && next != null) {
         this.iilllIIill(next, this.iiilllIIIill.iIlIlllllill());
      }
   }

   public void IIIllIIliIIl(class_332 s, iIIiliiIlIilii ctx) {
      long var6 = -4571132002137800371L;
      long var3 = System.nanoTime();
      var6 ^= ((long)(this.IllIIlIIIl != this.iIlIIlIIIl ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.IllIIlIIIl = this.iIlIIlIIIl;
      this.Illillllil(ctx);
      if (this.IIlIIlIIIl) {
         this.lIliliIlil();
      }

      this.illilIilil();
      this.lililiilil(s, var3);
      this.lliililiil(s, ctx, (boolean)((int)(var6 >>> 32)));
      this.lIIIiiIIIi(s, ctx, var3, (boolean)((int)(var6 >>> 32)));
   }

   public ililIliIiilIli(class_437 cost, IIIIllillIIIllil<class_1792> parent, String plan, iliIIIiIiiIIIi<class_1792> schemName) {
      long var8 = -1339671294899105690L;
      long var10 = -8080140628630494033L;
      super(cost, schemName != null ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
      this.lliliIIIIl = new ArrayList();
      this.ililiIIIIl = new HashMap();
      this.IiiliIIIIl = new ArrayList();
      this.liiliIIIIl = new iiiilIIiIIIIiIIi();
      this.iiiliIIIIl = new iiiIiIIlIIIliIIl(0L);
      this.IIIiiIIIIl = new liIilIiliiIilIil[]{new liIilIiliiIilIil(), new liIilIiliiIilIil(), new liIilIiliiIilIil()};
      this.lIIiiIIIIl = new liIilIiliiIilIil();
      this.iIIiiIIIIl = new int[]{-5854026, -5854026, -5854026};
      this.IlIiiIIIIl = new float[6];
      this.llIiiIIIIl = new float[6];
      this.ilIiiIIIIl = new float[6];
      this.IiIiiIIIIl = new float[7];
      this.liIiiIIIIl = new float[7];
      this.iiIiiIIIIl = () -> this.iIiIlIliIl();
      this.IIliiIIIIl = this::llIliilIli;
      this.lIliiIIIIl = this::iIIliIlIli;
      this.llliiIIIIl = iiIlIiIIllIi.IilIlIIIllilIlIIIl;
      this.IiliiIIIIl = "";
      this.liliiIIIIl = "";
      this.iiliiIIIIl = "";
      this.lliiiIIIIl = "";
      this.iliiiIIIIl = "";
      this.liiiiIIIIl = Long.MIN_VALUE;
      this.iiiiiIIIIl = Long.MIN_VALUE;
      this.lIIIIlIIIl = System.nanoTime();
      this.IIlIIlIIIl = true;
      this.IllIIlIIIl = -1;
      this.IilIIlIIIl = -1L;
      this.lilIIlIIIl = Long.MIN_VALUE;
      this.iilIIlIIIl = -1.0F;
      this.IIiIIlIIIl = Float.NaN;
      this.illliIIIIl = schemName != null;
      this.IilliIIIIl = plan != null && !plan.isBlank() ? plan.trim() : null;
      this.lilliIIIIl = this.illliIIIIl ? IlillIIIIl.length : llillIIIIl.length;
      this.iilliIIIIl = this.illliIIIIl ? IlillIIIIl : llillIIIIl;
      this.IIiliIIIIl = this.illliIIIIl ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
      this.lIiliIIIIl = this.illliIIIIl ? new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()} : new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      this.illiiIIIIl = this.illliIIIIl ? 2 : 2;
      this.IlliiIIIIl = parent;
      if (this.illliIIIIl) {
         this.Iillllilll(schemName, false);
      } else {
         this.iilllIIill(parent, false);
      }

      var8 ^= ((long)this.IiiliIIIIl.size() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(cost instanceof Illillliilli ? 7 : 9) ^ var8) & -1L >>> 32;
      var10 ^= ((long)((int)(var8 >>> 32) == 0 ? 3 : Math.max(1, Math.min((int)var8, (int)(var8 >>> 32)))) << 32 ^ var10) & -1L << 32;
      this.iIiliIIIIl = this.illliIIIIl ? 420.0F : 480.0F;
      this.IliliIIIIl = 166.0F + (this.illliIIIIl ? 0.0F : 6.0F) + (float)((int)(var10 >>> 32)) * 20.0F;
      this.llIIIlIIIl = this.IiiliIIIIl.isEmpty() ? 1.0F : 0.0F;
      this.IlIIIlIIIl = this.illliIIIIl && llIIilIiilIIilIi.iliIiiliiiii(this.iiiliIIIIl.IilliliilIIi()) ? 1.0F : 0.0F;
      this.IiIiiIIIIl[this.illiiIIIIl + 1] = 1.0F;
   }

   private void iIiilIliil(float x, float y, long now) {
      long var11 = 7474231931055422892L;
      if (this.IiiiiIIIIl != null && !this.IiiiiIIIIl.isEmpty()) {
         float var5 = (float)(now - this.IIIIIlIIIl) / 1000000.0F;
         float var6;
         if (var5 < 180.0F) {
            var6 = lliiiIliliiiIl.liiiIIllIl(var5 / 180.0F);
         } else if (var5 < 2780.0F) {
            var6 = 1.0F;
         } else {
            var6 = 1.0F - lliiiIliliiiIl.iIlIlllllill((var5 - 180.0F - 2600.0F) / 500.0F);
         }

         if (var6 <= 0.002F && var5 > 180.0F) {
            this.IiiiiIIIIl = null;
         } else {
            float var7 = var5 < 180.0F ? 3.0F * (1.0F - var6) : 0.0F;
            float var8 = IliiIilliiIi.IilliliilIIi(var6);

            try {
               var11 ^= ((long)(this.iiIIIlIIIl ? iiIliIIIIl : lIlliIIIIl) << 32 ^ var11) & -1L << 32;
               IiIIllilliIIllil.iliIiiliiiii(this.IiiiiIIIIl, x - var7, y, 0.82F, (int)(var11 >>> 32), (int)(var11 >>> 32));
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var8);
            }

         }
      }
   }

   public String iIlIlllllill() {
      return this.iiliiIIIIl;
   }

   private int lIlliiIlli(String name) {
      long var4 = 2579708006862496484L;
      String var2 = name.toUpperCase(Locale.ROOT);
      if (!var2.equals(IliIlllilIi<invokedynamic>()) && !var2.equals(IliIlllilIi<invokedynamic>())) {
         for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < this.lilliIIIIl; var6 += 4294967296L) {
            if (this.iilliIIIIl[(int)(var6 >>> 32)].equals(var2)) {
               return (int)(var6 >>> 32);
            }
         }

         return this.illiiIIIIl;
      } else {
         return -1;
      }
   }

   private static float IlIIillIIi(ilillIllIiillIll l) {
      if (!l.ilIlIIilll) {
         return 1.0F;
      } else {
         float var1 = lliiiIliliiiIl.IliIlllilIi(Math.abs(l.iiIlIIilll - l.IIllIIilll) / 20.0F * 2.5F);
         return 1.0F - 0.92F * ilIIiIiIIi(var1);
      }
   }

   static {
      long var1 = -6705001606958923157L;
      IlillIIIIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      llillIIIIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
      iiillIIIIl = new String[101];
      iiIliIIIIl = IilIIIIililIIIIi.Illlllllilll(-7630437, -1535700, 0.55);
      IIlliIIIIl = IilIIIIililIIIIi.Illlllllilll(-7630437, -1750963, 0.65);
      lIlliIIIIl = IilIIIIililIIIIi.Illlllllilll(-7630437, -8393375, 0.45);
      iIlliIIIIl = IilIIIIililIIIIi.Illlllllilll(-920587, -7630437, 0.55);
      IllliIIIIl = llilliilililliil.IIIIllIIIl(-920587, 0.55F);
      lllliIIIIl = llilliilililliil.IIIIllIIIl(iIlliIIIIl, 0.55F);

      for(long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) <= 100; var3 += 4294967296L) {
         iiillIIIIl[(int)(var3 >>> 32)] = (int)(var3 >>> 32) + IliIlllilIi<invokedynamic>();
      }

   }

   public void iIlllIllll(iliIIIiIiiIIIi<class_1792> next) {
      if (this.illliIIIIl && next != null) {
         this.Iillllilll(next, this.iiilllIIIill.iIlIlllllill());
      }
   }

   private static float ilIIiIiIIi(float t) {
      t = lliiiIliliiiIl.IliIlllilIi(t);
      return t * t * (3.0F - 2.0F * t);
   }

   private int lIiIiiIiIi(ilillIllIiillIll l) {
      if (this.illliIIIIl) {
         return IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-920587, -7630437, 0.45), -920587, (double)l.liIlIIilll);
      } else {
         return l.iIIlIIilll == llliilIlilliilIl.lIliiilIll ? -7630437 : -920587;
      }
   }

   private static void iliIiIiiIi(liIilIiliiIilIil scale, float ink, float s, float now, int y, long right) {
      float var7 = scale.iIiiiIlIil == null ? 1.0F : (float)(right - scale.iliiiIlIil) / 1000000.0F / 170.0F;
      if (var7 >= 1.0F) {
         scale.iIiiiIlIil = null;
         llilliilililliil.lIlIliIlIl(scale.lIiiiIlIil, llilliilililliil.IIIllIIliIIl(ink - scale.liiiIIllIl(now)), s, now, y);
      } else {
         float var8 = lliiiIliliiiIl.IliIlllilIi(var7 / 0.55F);
         float var9 = lliiiIliliiiIl.liiiIIllIl((var7 - 0.25F) / 0.75F);
         if (var8 < 1.0F) {
            float var10 = scale.lliiiIlIil >= 0.0F ? scale.lliiiIlIil : llilliilililliil.IiIIlliIIl(scale.iIiiiIlIil, now);
            float var11 = IliiIilliiIi.IilliliilIIi(1.0F - var8);

            try {
               llilliilililliil.lIlIliIlIl(scale.iIiiiIlIil, llilliilililliil.IIIllIIliIIl(ink - var10), s - 3.0F * var8, now, y);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var11);
            }
         }

         if (var9 > 0.0F) {
            float var20 = IliiIilliiIi.IilliliilIIi(var9);

            try {
               llilliilililliil.lIlIliIlIl(scale.lIiiiIlIil, llilliilililliil.IIIllIIliIIl(ink - scale.liiiIIllIl(now)), s + 3.0F * (1.0F - var9), now, y);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var20);
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8584022069055625972L ^ Long.rotateLeft(8514506186289397023L, 62) ^ 2194877176475983710L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6131812112912155504L ^ Long.rotateLeft(-7651343615287854356L, 41) ^ -1623738263914713767L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7608115914587201937L ^ Long.rotateLeft(7834277881778796742L, 8) ^ -2437081500797089315L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4562564470444618584L ^ Long.rotateLeft(-291781141660710232L, 43) ^ -190725049866187300L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 972990913302907046L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3312744004807187254L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -692476604969285494L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8957594902275525293L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6122717289203475767L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 973495920433480462L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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

   private void Illillllil(iIIiliiIlIilii s) {
      if (s.lIIIlliIIl != this.IIiIIlIIIl || s.iIIIlliIIl != this.lIiIIlIIIl || s.IlIIlliIIl != this.iIiIIlIIIl || s.llIIlliIIl != this.IliIIlIIIl) {
         this.IIiIIlIIIl = s.lIIIlliIIl;
         this.lIiIIlIIIl = s.iIIIlliIIl;
         this.iIiIIlIIIl = s.IlIIlliIIl;
         this.IliIIlIIIl = s.llIIlliIIl;
         this.lliIIlIIIl = s.lIIIlliIIl + 12.0F;
         this.iliIIlIIIl = s.lIIIlliIIl + s.IlIIlliIIl - 12.0F;
         this.IiiIIlIIIl = this.lliIIlIIIl + 4.0F;
         this.liiIIlIIIl = this.iliIIlIIIl - 4.0F;
         this.iiiIIlIIIl = llilliilililliil.IIIllIIliIIl(s.iIIIlliIIl + 11.0F + 5.152F);
         this.IIIlIlIIIl = llilliilililliil.IIIllIIliIIl(this.iiiIIlIIIl + 6.0F + 12.88F);
         this.lIIlIlIIIl = llilliilililliil.IIIllIIliIIl(this.IIIlIlIIIl + 6.0F + 5.2808F);
         float var2 = this.lIIlIlIIIl + 4.0F;
         if (!this.illliIIIIl) {
            this.iIIlIlIIIl = llilliilililliil.IIIllIIliIIl(var2 + 3.0F);
            var2 = this.iIIlIlIIIl + 2.0F;
         }

         this.IlIlIlIIIl = llilliilililliil.IIIllIIliIIl(var2 + 10.0F);
         this.llIlIlIIIl = llilliilililliil.IIIllIIliIIl(this.IlIlIlIIIl + 14.0F + IIIiiIillIIiiIil.Illlllllilll());
         float var3 = Math.max(0.0F, s.iIIIlliIIl + s.llIIlliIIl - 4.0F - this.llIlIlIIIl);
         float var4 = (float)Math.floor((double)(var3 / 20.0F)) * 20.0F;
         this.ilIlIlIIIl = this.llIlIlIIIl + (var4 >= 20.0F ? var4 : var3);
         this.iiIlIlIIIl = this.liiIIlIIIl - Math.min(184.0F, (this.liiIIlIIIl - this.IiiIIlIIIl) * 0.46F);
         this.IiIlIlIIIl = this.IiiIIlIIIl + 16.0F + 7.0F;
         this.iilIIlIIIl = -1.0F;
      }
   }

   private void iilllIIill(IIIIllillIIIllil<class_1792> animate, boolean p) {
      long var12 = 3017892713867744958L;
      long var3 = System.nanoTime();
      this.IlliiIIIIl = animate;

      for(ilillIllIiillIll var6 : this.lliliIIIIl) {
         var6.llIlIIilll = false;
      }

      if (animate != null) {
         for(liIiIiiiiIiIii var16 : animate.IillIliIil) {
            ilillIllIiillIll var7 = this.Ilillllill((class_1792)var16.IIiiIIiIIl, p);
            var7.iIIlIIilll = var16.iiiiIIiIIl;
            ilillIiill(var7, 0, (long)var16.lIiiIIiIIl, p, var3);
            ilillIiill(var7, 1, (long)var16.iIiiIIiIIl, p, var3);
            ilillIiill(var7, 2, (long)var16.IliiIIiIIl, p, var3);
            ilillIiill(var7, 3, (long)var16.lliiIIiIIl, p, var3);
            ilillIiill(var7, 4, (long)var16.iliiIIiIIl, p, var3);
            ilillIiill(var7, 5, (long)var16.liiiIIiIIl, p, var3);
         }
      }

      iIIIlIlIIl var15 = animate == null ? null : animate.lillIliIil;
      double var17 = var15 == null ? (double)0.0F : Math.max((double)0.0F, Math.min((double)1.0F, var15.lilIIIliilIIIl));
      long var8 = (long)Math.floor(var17 * (double)10000.0F);
      if (p) {
         this.iiiliIIIIl.iIlIlllllill(var8, var3, 480000000L);
      } else {
         this.iiiliIIIIl.IliIlllilIi(var8);
      }

      var12 ^= ((long)(var15 == null ? 0 : var15.IllIIIllllIIIl) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(var15 == null ? 0 : var15.illIIIlIilIIIl) ^ var12) & -1L >>> 32;
      this.lIIiiIIIIl.IliIlllilIi(var15 == null ? IliIlllilIi<invokedynamic>() : llIIilIiilIIilIi.lIiiIiIlilli((long)var15.iiIIIIlIIlIIIl) + IliIlllilIi<invokedynamic>() + llIIilIiilIIilIi.lIiiIiIlilli((long)var15.IiIIIIlliIIIIl) + IliIlllilIi<invokedynamic>(), p);
      this.IIIiiIIIIl[0].IliIlllilIi(var15 == null ? IliIlllilIi<invokedynamic>() : llIIilIiilIIilIi.lIiiIiIlilli((long)var15.lIlIIIliIlIIIl), p);
      this.IIIiiIIIIl[1].IliIlllilIi((int)var12 == 0 ? IliIlllilIi<invokedynamic>() : (int)var12 + ((int)var12 == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()), p);
      this.IIIiiIIIIl[2].IliIlllilIi(llIIilIiilIIilIi.lIiiIiIlilli((long)((int)(var12 >>> 32))), p);
      this.iIIiiIIIIl[0] = -5854026;
      this.iIIiiIIIIl[1] = (int)var12 > 0 ? IIlliIIIIl : -5854026;
      this.iIIiiIIIIl[2] = -5854026;
      this.IIiiiIIIIl = null;
      this.iiliiIIIIl = this.lIilliIill((int)(var12 >>> 32));
      this.liilliiill(p);
   }

   public boolean IiIIlliIIl(iIIiliiIlIilii x, double s, double y, double amount) {
      long var9 = 6002414842842642334L;
      this.liIIIlIIIl += (float)amount;
      var9 ^= ((long)((int)this.liIIIlIIIl) << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) != 0) {
         this.liIIIlIIIl -= (float)((int)(var9 >>> 32));
         this.liiliIIIIl.lIiiIiIlilli((float)Math.round(this.liiliIIIIl.IIlllIlliIll() / 20.0F - (float)((int)(var9 >>> 32) * 2)) * 20.0F);
      }

      return true;
   }

   private void Iiiilliiil(int hot, String alignRight, float capMid, float x, float label, boolean step, int ty, boolean id) {
      long var18 = -7412284995685106679L;
      long var20 = 2875793521815643114L;
      var18 ^= ((long)(hot + 1) << 32 ^ var18) & -1L << 32;
      if (id) {
         var18 ^= ((long)(ty == hot ? 1 : 0) ^ var18) & -1L >>> 32;
         this.liIiiIIIIl[(int)(var18 >>> 32)] = lliiiIliliiiIl.IIIllIIliIIl(this.liIiiIIIIl[(int)(var18 >>> 32)], (int)var18 != 0 ? 1.0F : 0.0F, (int)var18 != 0 ? 16.0F : 11.0F, this.ilIIIlIIIl, 0.002F);
      }

      float var10 = this.IiIiiIIIIl[(int)(var18 >>> 32)];
      float var11 = this.liIiiIIIIl[(int)(var18 >>> 32)];
      var20 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-11117467, -7630437, (double)var11), -5854026, (double)var10) << 32 ^ var20) & -1L << 32;
      float var13 = llilliilililliil.IiIIlliIIl(alignRight, 0.72F);
      float var14 = step ? llilliilililliil.IIIllIIliIIl(capMid - var13) : capMid;
      llilliilililliil.lIlIliIlIl(alignRight, var14, x, 0.72F, (int)(var20 >>> 32));
      if (var10 > 0.01F) {
         float var15 = step ? var14 - 8.0F - 1.0F : var14 + var13 + 1.0F;
         float var16 = IliiIilliiIi.IilliliilIIi(var10);

         try {
            lIlIIIliIlIIIl.IIIilIIiiIIi(lIlIIiliIlIIil.IIlilIliiIli(), var15, llilliilililliil.IIIllIIliIIl(label - 4.0F), 8.0F, (int)(var20 >>> 32));
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var16);
         }
      }

   }

   private void liilliiill(boolean animate) {
      for(ilillIllIiillIll var3 : this.lliliIIIIl) {
         var3.IiIlIIilll = false;
      }

      if (!animate) {
         this.IIIillIIil(true);
      }

      this.IIlIIlIIIl = true;
      this.iIIilIlIil();
   }

   private void illilIilil() {
      long var3 = -5874208418483664105L;
      float var1 = this.liiIIlIIIl;

      for(long var5 = var3 ^ ((long)(this.lilliIIIIl - 1) << 32 ^ var3) & -1L << 32; (int)(var5 >>> 32) >= 0; var5 += -4294967296L) {
         this.ilIiiIIIIl[(int)(var5 >>> 32)] = var1;
         var1 -= this.IlIiiIIIIl[(int)(var5 >>> 32)] + 16.0F;
      }

      this.liIlIlIIIl = var1 + 16.0F - 12.0F;
   }

   private float liIIiiiIIi(int rank, long now) {
      float var4 = (float)(now - this.lIIIIlIIIl) / 1000000.0F - 150.0F - (float)Math.min(Math.max(rank, 0), 12) * 18.0F;
      return lliiiIliliiiIl.liiiIIllIl(var4 / 220.0F);
   }

   private String iilIiIIiIi(ilillIllIiillIll l) {
      float var2 = Math.max(0.0F, this.liIlIlIIIl - this.IiIlIlIIIl);
      if (var2 != l.IlllIIilll) {
         l.IlllIIilll = var2;
         l.illlIIilll = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(l.lliIIIilll, var2 / 0.9F);
      }

      return l.illlIIilll;
   }

   private void IiIliliIli(String text) {
      String var2 = text == null ? "" : text;
      if (var2.length() > 24) {
         var2 = var2.substring(0, 24);
      }

      if (!var2.equals(this.IiliiIIIIl)) {
         this.IiliiIIIIl = var2;
         this.liliiIIIIl = var2.trim().toLowerCase(Locale.ROOT);
         this.lIiiiIIIIl = IliIlllilIi<invokedynamic>() + var2 + IliIlllilIi<invokedynamic>();
         this.iIIilIlIil();
         this.liiliIIIIl.lIiiIiIlilli(0.0F);
      }
   }

   private void lililiilil(class_332 ctx, long now) {
      long var16 = 7252368593265151029L;
      llilliilililliil.lIlIliIlIl(this.IIiliIIIIl, this.IiiIIlIIIl + 1.0F, this.iiiIIlIIIl - 9.2F, 0.8F, -11117467);
      long var4 = this.iiiliIIIIl.IlIlllIlilIl(now);
      if (var4 != this.liiiiIIIIl) {
         this.liiiiIIIIl = var4;
         if (this.illliIIIIl) {
            this.lliiiIIIIl = llIIilIiilIIilIi.liiiIIllIl(var4);
            this.iliiiIIIIl = llIIilIiilIIilIi.IilliliilIIi(var4);
         } else {
            this.lliiiIIIIl = iiillIIIIl[(int)Math.max(0L, Math.min(100L, var4 / 100L))];
         }
      }

      float var6 = this.IIIlIlIIIl - 23.0F;
      IiIIllilliIIllil.iliIiiliiiii(this.lliiiIIIIl, this.IiiIIlIIIl, var6, 2.0F, -920587, this.illliIIIIl ? iIlliIIIIl : -920587);
      IiIIllilliIIllil.iliIiiliiiii(this.lliiiIIIIl, this.IiiIIlIIIl + IIIiiIillIIiiIil.Illlllllilll(), var6, 2.0F, IllliIIIIl, this.illliIIIIl ? lllliIIIIl : IllliIIIIl);
      float var7 = this.lIIlIlIIIl - 9.43F;
      if (this.illliIIIIl) {
         long var8 = this.iiiliIIIIl.IilliliilIIi();
         if (var8 != this.iiiiiIIIIl) {
            this.iiiiiIIIIl = var8;
            this.iIIIIlIIIl = IiIIllilliIIllil.IilliliilIIi(llIIilIiilIIilIi.IilliliilIIi(var8), 0.82F);
         }

         if (this.IlIIIlIIIl > 0.004F) {
            float var10 = IliiIilliiIi.IilliliilIIi(this.IlIIIlIIIl);

            try {
               IiIIllilliIIllil.lIiiIiIlilli(this.iliiiIIIIl, this.IiiIIlIIIl + 1.0F, var7, 0.82F, -7630437);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var10);
            }
         }

         this.iIiilIliil(this.IiiIIlIIIl + 1.0F + (this.iIIIIlIIIl + 7.0F) * this.IlIIIlIIIl, var7, now);
      } else {
         liiIiiiiIi(this.lIIiiIIIIl, this.IiiIIlIIIl + 1.0F, var7, 0.82F, -7630437, now);
         float var24 = this.liiIIlIIIl - this.IiiIIlIIIl;
         IIIiiIillIIiiIil.IlIlllIlilIl(ctx, this.IiiIIlIIIl, this.iIIlIlIIIl, var24, 2.0F, 1.0F, llilliilililliil.IIIIllIIIl(-1, 0.06F));
         float var9 = Math.max(0.0F, Math.min(1.0F, (float)var4 / 10000.0F));
         if (var9 > 5.0E-4F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(ctx, this.IiiIIlIIIl, this.iIIlIlIIIl, Math.max(2.0F, var24 * var9), 2.0F, 1.0F, llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.9F));
         }
      }

      if (this.illliIIIIl && this.lllIIlIIIl != null) {
         this.IIiillIiil();
      }

      float var25 = (float)(now - this.lIIIIlIIIl) / 1000000.0F;
      float var26 = llilliilililliil.IIIllIIliIIl((this.iiiIIlIIIl + this.lIIlIlIIIl) / 2.0F);

      for(long var27 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var27 >>> 32) < 3; var27 += 4294967296L) {
         float var11 = lliiiIliliiiIl.liiiIIllIl((var25 - 120.0F - (float)((int)(var27 >>> 32)) * 30.0F) / 200.0F);
         if (!(var11 <= 0.004F)) {
            float var12 = (int)(var27 >>> 32) == 0 ? this.iiiIIlIIIl : ((int)(var27 >>> 32) == 1 ? var26 : this.lIIlIlIIIl);
            float var13 = var12 - 9.43F;
            float var14 = IliiIilliiIi.IilliliilIIi(var11);

            try {
               llilliilililliil.lIlIliIlIl(this.lIiliIIIIl[(int)(var27 >>> 32)], this.iiIlIlIIIl, var13, 0.82F, -11117467);
               iliIiIiiIi(this.IIIiiIIIIl[(int)(var27 >>> 32)], this.liiIIlIIIl, var13, 0.82F, this.iIIiiIIIIl[(int)(var27 >>> 32)], now);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var14);
            }
         }
      }

   }

   public float lIiiIiIlilli() {
      return this.IliliIIIIl;
   }

   private void iIIilIlIil() {
      long var3 = 5136176580725107630L;
      this.IiiliIIIIl.clear();

      for(ilillIllIiillIll var2 : this.lliliIIIIl) {
         var2.ilIlIIilll = var2.llIlIIilll && this.llIililIil(var2);
         if (var2.ilIlIIilll) {
            this.IiiliIIIIl.add(var2);
         }
      }

      this.IiiliIIIIl.sort(this.IiIilliIil());

      for(long var6 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var6 >>> 32) < this.IiiliIIIIl.size(); var6 += 4294967296L) {
         ilillIllIiillIll var5 = (ilillIllIiillIll)this.IiiliIIIIl.get((int)(var6 >>> 32));
         var5.llllIIilll = (int)(var6 >>> 32);
         var5.IIllIIilll = (float)((int)(var6 >>> 32)) * 20.0F;
         if (Float.isNaN(var5.iiIlIIilll) || var5.lIllIIilll <= 0.01F) {
            var5.iiIlIIilll = var5.IIllIIilll;
         }
      }

      if (!this.liliiIIIIl.isEmpty()) {
         this.iIiiiIIIIl = IliIlllilIi<invokedynamic>();
         this.IliiiIIIIl = IliIlllilIi<invokedynamic>() + this.IiliiIIIIl + IliIlllilIi<invokedynamic>();
      } else if (this.illliIIIIl) {
         this.iIiiiIIIIl = IliIlllilIi<invokedynamic>();
         this.IliiiIIIIl = IliIlllilIi<invokedynamic>();
      } else if (this.llliiIIIIl != iiIlIiIIllIi.IilIlIIIllilIlIIIl && !this.lliliIIIIl.isEmpty()) {
         this.iIiiiIIIIl = IliIlllilIi<invokedynamic>();
         this.IliiiIIIIl = IliIlllilIi<invokedynamic>();
      } else {
         this.iIiiiIIIIl = IliIlllilIi<invokedynamic>();
         this.IliiiIIIIl = IliIlllilIi<invokedynamic>();
      }

   }

   private void lIIIiiIIIi(class_332 s, iIIiliiIlIilii now, long step, boolean ctx) {
      long var21 = 6705422580018672203L;
      long var23 = -130885507058609838L;
      long var25 = -8128221366320079802L;
      float var6 = Math.max(0.0F, this.ilIlIlIIIl - this.llIlIlIIIl);
      this.liiliIIIIl.IliIlllilIi((float)this.IiiliIIIIl.size() * 20.0F, var6);
      float var7 = llilliilililliil.IIIllIIliIIl(this.liiliIIIIl.IiIlliIliiIl());
      var21 ^= ((long)(now.iiIIlliIIl && now.ilIIlliIIl >= this.lliIIlIIIl && now.ilIIlliIIl <= this.iliIIlIIIl && now.liIIlliIIl >= this.llIlIlIIIl && now.liIIlliIIl < this.ilIlIlIIIl ? 1 : 0) << 32 ^ var21) & -1L << 32;
      var21 ^= ((long)(this.IiiliIIIIl.size() - 1) ^ var21) & -1L >>> 32;
      float var10 = IIIiiIillIIiiIil.Illlllllilll();
      if (var6 > 1.0F) {
         lIlIIIliIlIIIl.Iliilliiilii(s, now.lIIIlliIIl, this.llIlIlIIIl, now.IlIIlliIIl, var6);

         try {
            var23 ^= (0L ^ var23) & -1L << 32;

            for(long var36 = var23 ^ ((long)this.lliliIIIIl.size() ^ var23) & -1L >>> 32; (int)(var36 >>> 32) < (int)var36; var36 += 4294967296L) {
               ilillIllIiillIll var13 = (ilillIllIiillIll)this.lliliIIIIl.get((int)(var36 >>> 32));
               float var14 = llilliilililliil.IIIllIIliIIl(this.llIlIlIIIl + var13.iiIlIIilll - var7);
               var25 ^= ((long)(var13.lIllIIilll > 0.004F && var14 < this.ilIlIlIIIl && var14 + 20.0F > this.llIlIlIIIl ? 1 : 0) << 32 ^ var25) & -1L << 32;
               var25 ^= ((long)((int)(var25 >>> 32) != 0 && (int)(var21 >>> 32) != 0 && var13.ilIlIIilll && now.liIIlliIIl >= var14 && now.liIIlliIIl < var14 + 20.0F ? 1 : 0) ^ var25) & -1L >>> 32;
               if (ctx) {
                  var13.iIllIIilll = lliiiIliliiiIl.IIIllIIliIIl(var13.iIllIIilll, (int)var25 != 0 ? 1.0F : 0.0F, (int)var25 != 0 ? 16.0F : 11.0F, this.ilIIIlIIIl, 0.002F);
               }

               if ((int)(var25 >>> 32) != 0) {
                  float var17 = this.liIIiiiIIi(var13.llllIIilll, step);
                  float var18 = var13.lIllIIilll * var17 * IlIIillIIi(var13) * this.liiliIIIIl.Iiilliiliiil(var14, var14 + 20.0F, this.llIlIlIIIl, 8.0F);
                  if (!(var18 <= 0.004F)) {
                     this.IIlIilIlIi(s, var13, var14 + 4.0F * (1.0F - var17), var18, var13.ilIlIIilll && var13.llllIIilll < (int)var21, var10, step);
                  }
               }
            }
         } finally {
            s.method_44380();
         }

         lIlIIIliIlIIIl.Ililllililil(s, now.lIIIlliIIl + now.IlIIlliIIl - 6.0F, this.llIlIlIIIl + 2.0F, var6 - 4.0F, this.liiliIIIIl);
      }

      if (this.llIIIlIIIl > 0.01F) {
         float var11 = IliiIilliiIi.IilliliilIIi(this.llIIIlIIIl);

         try {
            lIlIIIliIlIIIl.Iiilliiliiil(s, this.lliIIlIIIl, this.llIlIlIIIl, this.iliIIlIIIl - this.lliIIlIIIl, var6, lIlIIIliIlIIIl.IlIillIiilIi(IliIlllilIi<invokedynamic>()), this.iIiiiIIIIl, this.IliiiIIIIl);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var11);
         }
      }

   }

   public boolean IIllllIlll() {
      return this.illliIIIIl;
   }

   private static void IIililIili(Map<class_1792, Integer> item, Map<class_1792, Long> qty, class_1792 unit, int need, long price) {
      item.put(unit, need);
      if (price >= 0L) {
         qty.put(unit, price);
      }

   }

   private void Iillllilll(iliIIIiIiiIIIi<class_1792> r, boolean animate) {
      long var17 = -3780903554584296016L;
      long var15 = 6823107796122597430L;
      long var3 = System.nanoTime();
      long var5 = this.iiiliIIIIl.IilliliilIIi();
      this.iIliiIIIIl = r;

      for(ilillIllIiillIll var8 : this.lliliIIIIl) {
         var8.llIlIIilll = false;
      }

      var15 ^= (0L ^ var15) & -1L << 32;
      var15 ^= (0L ^ var15) & -1L >>> 32;
      var17 ^= (0L ^ var17) & -1L << 32;
      long var10 = 0L;
      if (r != null) {
         for(IiIlliilliIlliil var13 : r.lIlIiIiliiIlIiIili) {
            ilillIllIiillIll var14 = this.Ilillllill((class_1792)var13.IIiIIiilil, animate);
            var14.IlIlIIilll = var13.lliIIiilil;
            ilillIiill(var14, 0, (long)var13.lIiIIiilil, animate, var3);
            ilillIiill(var14, 1, var13.lliIIiilil ? var13.iIiIIiilil : 0L, animate, var3);
            ilillIiill(var14, 2, var13.lliIIiilil ? var13.IliIIiilil : 0L, animate, var3);
            if (!animate || var14.IiIlIIilll) {
               var14.liIlIIilll = var13.lliIIiilil ? 1.0F : 0.0F;
            }
         }

         var15 ^= ((long)r.IliIlllilIi() << 32 ^ var15) & -1L << 32;
         var15 ^= ((long)r.lilIiIiliiilIiIili ^ var15) & -1L >>> 32;
         var17 ^= ((long)r.illIiIiliIilIiIili << 32 ^ var17) & -1L << 32;
         var10 = Math.max(0L, r.IllIiIililllIiIili);
      }

      if (animate) {
         if (this.iiiliIIIIl.iIlIlllllill(var10, var3, 480000000L)) {
            this.IiiiiIIIIl = llIIilIiilIIilIi.IIIllIIliIIl(var10 - var5);
            this.iiIIIlIIIl = var10 > var5;
            this.IIIIIlIIIl = var3;
         }
      } else {
         this.iiiliIIIIl.IliIlllilIi(var10);
      }

      this.IIIiiIIIIl[0].IliIlllilIi((int)(var15 >>> 32) == 0 ? IliIlllilIi<invokedynamic>() : ((int)var15 == 0 ? IliIlllilIi<invokedynamic>() + (int)(var15 >>> 32) : (int)(var17 >>> 32) + IliIlllilIi<invokedynamic>() + (int)(var15 >>> 32)), animate);
      this.IIIiiIIIIl[1].IliIlllilIi((int)var15 == 0 ? IliIlllilIi<invokedynamic>() : llIIilIiilIIilIi.lIiiIiIlilli((long)((int)var15)), animate);
      this.iIIiiIIIIl[1] = (int)var15 > 0 ? iiIliIIIIl : -5854026;
      IiIlliilliIlliil var19 = r == null ? null : r.liiiIIllIl();
      ilillIllIiillIll var20 = var19 == null ? null : (ilillIllIiillIll)this.ililiIIIIl.get(var19.IIiIIiilil);
      this.lllIIlIIIl = var20 == null ? null : var20.lliIIIilll;
      this.IilIIlIIIl = var19 == null ? -1L : var19.IliIIiilil;
      this.iilIIlIIIl = -1.0F;
      if (this.lllIIlIIIl == null) {
         this.IIIiiIIIIl[2].IliIlllilIi(IliIlllilIi<invokedynamic>(), animate);
      }

      this.iIIiiIIIIl[2] = -5854026;
      this.IIiiiIIIIl = (int)var15 > 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>();
      this.iiliiIIIIl = this.lIilliIill((int)(var15 >>> 32));
      this.liilliiill(animate);
   }

   private Comparator<ilillIllIiillIll> IiIilliIil() {
      long var4 = 7413071497194030821L;
      Comparator var1 = Comparator.comparing((l) -> l.iliIIIilll);
      if (this.illiiIIIIl == -1) {
         return var1;
      } else {
         var4 ^= ((long)this.illiiIIIIl << 32 ^ var4) & -1L << 32;
         Comparator var3 = Comparator.comparingLong((c) -> c.liiIIIilll[l]).reversed();
         return this.illliIIIIl && (int)(var4 >>> 32) != 0 ? Comparator.comparing((l) -> !l.IlIlIIilll).thenComparing(var3).thenComparing(var1) : var3.thenComparing(var1);
      }
   }

   private static iliIIIiIiiIIIi<class_1792> illliIilli() {
      LinkedHashMap var0 = new LinkedHashMap();
      LinkedHashMap var1 = new LinkedHashMap();
      IIililIili(var0, var1, class_1802.field_22018, 2304, 1450000L);
      IIililIili(var0, var1, class_1802.field_8668, 64, 2900000L);
      IIililIili(var0, var1, class_1802.field_8603, 1152, 41250L);
      IIililIili(var0, var1, class_1802.field_8281, 12800, 520L);
      IIililIili(var0, var1, class_1802.field_8494, 640, 9800L);
      IIililIili(var0, var1, class_1802.field_22421, 900, -1L);
      return llIIilIiilIIilIi.<class_1792>IliIlllilIi(var0, var1);
   }

   private static void ilillIiill(ilillIllIiillIll v, int animate, long now, boolean c, long l) {
      v.liiIIIilll[animate] = now;
      if (c && !v.IiIlIIilll) {
         v.lIIlIIilll[animate].iIlIlllllill(now, l, 480000000L);
      } else {
         v.lIIlIIilll[animate].IliIlllilIi(now);
      }

   }

   public boolean iiIIlIIlIl(int key, int modifiers) {
      switch (key) {
         case 259:
            if (this.IiliiIIIIl.isEmpty()) {
               return false;
            }

            this.IiIliliIli((modifiers & 2) != 0 ? "" : this.IiliiIIIIl.substring(0, this.IiliiIIIIl.length() - 1));
            return true;
         case 260:
         case 262:
         case 263:
         default:
            return false;
         case 261:
            if (this.IiliiIIIIl.isEmpty()) {
               return false;
            }

            this.IiIliliIli("");
            return true;
         case 264:
            this.liiliIIIIl.lIiiIiIlilli(this.liiliIIIIl.IIlllIlliIll() + 20.0F);
            break;
         case 265:
            this.liiliIIIIl.lIiiIiIlilli(this.liiliIIIIl.IIlllIlliIll() - 20.0F);
            break;
         case 266:
            this.liiliIIIIl.lIiiIiIlilli(this.liiliIIIIl.IIlllIlliIll() - Math.max(20.0F, this.ilIlIlIIIl - this.llIlIlIIIl - 20.0F));
            break;
         case 267:
            this.liiliIIIIl.lIiiIiIlilli(this.liiliIIIIl.IIlllIlliIll() + Math.max(20.0F, this.ilIlIlIIIl - this.llIlIlIIIl - 20.0F));
            break;
         case 268:
            this.liiliIIIIl.lIiiIiIlilli(0.0F);
            break;
         case 269:
            this.liiliIIIIl.lIiiIiIlilli(this.liiliIIIIl.liiiIIllIl());
      }

      return true;
   }

   private ilillIllIiillIll Ilillllill(class_1792 item, boolean animate) {
      ilillIllIiillIll var3 = (ilillIllIiillIll)this.ililiIIIIl.get(item);
      if (var3 == null) {
         var3 = new ilillIllIiillIll(item);
         var3.IiIlIIilll = true;
         var3.lIllIIilll = animate ? 0.0F : 1.0F;
         this.lliliIIIIl.add(var3);
         this.ililiIIIIl.put(item, var3);
      }

      var3.llIlIIilll = true;
      return var3;
   }

   private String IilIililIi(ilillIllIiillIll c, int now, long l) {
      long var5 = c.lIIlIIilll[now].IlIlllIlilIl(l);
      if (var5 != c.iiiIIIilll[now] || c.IIIlIIilll[now] == null) {
         c.iiiIIIilll[now] = var5;
         c.IIIlIIilll[now] = this.iiIilIIlil(now, var5);
      }

      return c.IIIlIIilll[now];
   }

   public ililIliIiilIli(class_437 plan, IIIIllillIIIllil<class_1792> parent, String schemName) {
      this(plan, parent, schemName, (iliIIIiIiiIIIi)null);
   }

   public float IilliliilIIi() {
      return this.iIiliIIIIl;
   }

   public void IIlllIlliIll(iiIiIlIIliIl f) {
      if (this.illliIIIIl) {
         f.iIlIlllllill(this.IIiiiIIIIl);
      } else if (this.IiliiIIIIl.isEmpty()) {
         f.iIlIlllllill(IliIlllilIi<invokedynamic>());
      }

      if (!this.illliIIIIl) {
         f.IiIlliIliiIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.llliiIIIIl.iIIllIIIlIlIllIIIl, this.lIliiIIIIl);
      }

      if (!this.IiliiIIIIl.isEmpty()) {
         f.iliIiiliiiii(IliIlllilIi<invokedynamic>(), this.lIiiiIIIIl, this.IIliiIIIIl);
      }

      f.IilliliilIIi().Iilllilliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this.iiIiiIIIIl);
   }

   private static IIIIllillIIIllil<class_1792> iIiliIlili(boolean changed) {
      LinkedHashMap var1 = new LinkedHashMap();
      LinkedHashMap var2 = new LinkedHashMap();
      LinkedHashMap var3 = new LinkedHashMap();
      LinkedHashMap var4 = new LinkedHashMap();
      lliliilili(var1, var2, var3, var4, class_1802.field_8281, 1280, changed ? 900 : 640, 64, 128);
      lliliilili(var1, var2, var3, var4, class_1802.field_8341, 4096, changed ? 3000 : 2400, 64, 512);
      lliliilili(var1, var2, var3, var4, class_1802.field_8305, 96, 96, 0, 0);
      lliliilili(var1, var2, var3, var4, class_1802.field_20402, 640, 120, 0, 0);
      lliliilili(var1, var2, var3, var4, class_1802.field_20395, 3200, changed ? 2900 : 2100, 128, 1300);
      lliliilili(var1, var2, var3, var4, class_1802.field_8280, 960, 300, 64, 64);
      lliliilili(var1, var2, var3, var4, class_1802.field_8113, 2304, 2304, 0, 0);
      lliliilili(var1, var2, var3, var4, class_1802.field_16539, 64, 10, 0, 12);
      lliliilili(var1, var2, var3, var4, class_1802.field_8821, 800, 0, 0, 0);
      lliliilili(var1, var2, var3, var4, class_1802.field_8230, 48, 0, 16, 0);
      return iIiIllIlIliIllIl.<class_1792>IliIlllilIi(var1, var2, var3, var4);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') << 11 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') >>> 5) ^ 28049) - 13077) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') << 11 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') >>> 5) ^ 28049) - 13077) - var5) << 8) << 13 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') << 11 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') >>> 5) ^ 28049) - 13077) - var5) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') << 11 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) << 10 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) >>> 14 | (char)((char)((char)((char)(~var4[var5]) - 11618) ^ '틑') ^ var5) << 2))) >>> 6) + var5) - '\udee4'))) ^ var5))) + '藒') >>> 5) ^ 28049) - 13077) - var5) << 8) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIiIllIi(class_332 l, ilillIllIiillIll ty, float ctx, float now, long hl) {
      IiIIllilliIIllil.IIIllIIliIIl(this.IilIililIi(ty, 0, hl), this.ilIiiIIIIl[0], ctx, 0.9F, -7630437);
      float var7 = ty.liIlIIilll;
      float var8 = ilIIiIiIIi((var7 - 0.45F) / 0.55F);
      float var9 = 1.0F - ilIIiIiIIi(var7 / 0.55F);
      if (var8 > 0.004F) {
         float var10 = IliiIilliiIi.IilliliilIIi(var8);

         try {
            IiIIllilliIIllil.IIIllIIliIIl(this.IilIililIi(ty, 1, hl), this.ilIiiIIIIl[1], ctx, 0.9F, -7630437);
            IiIIllilliIIllil.IIIllIIliIIl(this.IilIililIi(ty, 2, hl), this.ilIiiIIIIl[2], ctx, 0.9F, -920587);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var10);
         }
      }

      if (var9 > 0.004F) {
         float var19 = IliiIilliiIi.IilliliilIIi(var9);

         try {
            float var11 = ctx + 7.4519997F;
            IIIiiIillIIiiIil.IilliliilIIi(l, this.ilIiiIIIIl[1] - 5.0F, llilliilililliil.IIIllIIliIIl(var11 - now), 5.0F, now * 2.0F, -11117467);
            llilliilililliil.lIlIliIlIl(IliIlllilIi<invokedynamic>(), llilliilililliil.IIIllIIliIIl(this.ilIiiIIIIl[2] - this.IiIIIlIIIl), ctx, 0.9F, iiIliIIIIl);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var19);
         }
      }

   }

   private static iliIIIiIiiIIIi<class_1792> Illlilllli(boolean changed) {
      LinkedHashMap var1 = new LinkedHashMap();
      LinkedHashMap var2 = new LinkedHashMap();
      IIililIili(var1, var2, class_1802.field_8281, 1280, changed ? 610L : 520L);
      IIililIili(var1, var2, class_1802.field_8341, 4096, changed ? 41L : 38L);
      IIililIili(var1, var2, class_1802.field_8305, 96, changed ? 1320L : 1450L);
      IIililIili(var1, var2, class_1802.field_20402, 640, 85L);
      IIililIili(var1, var2, class_1802.field_20395, changed ? 3600 : 3200, changed ? 11L : 9L);
      IIililIili(var1, var2, class_1802.field_8280, 960, 12L);
      IIililIili(var1, var2, class_1802.field_8113, 2304, 4L);
      IIililIili(var1, var2, class_1802.field_16539, 64, 160L);
      IIililIili(var1, var2, class_1802.field_8821, 800, 22L);
      IIililIili(var1, var2, class_1802.field_8230, 48, changed ? 240L : -1L);
      IIililIili(var1, var2, class_1802.field_8668, 2, -1L);
      if (changed) {
         IIililIili(var1, var2, class_1802.field_8076, 120, 30L);
      } else {
         IIililIili(var1, var2, class_1802.field_8122, 300, 14L);
      }

      return llIIilIiilIIilIi.<class_1792>IliIlllilIi(var1, var2);
   }

   public boolean IIIIllIIIl(iIIiliiIlIilii button, double x, double s, int y) {
      long var8 = 2426173303949315190L;
      if (y == 0 && !(s < (double)this.IlIlIlIIIl) && !(s > (double)(this.IlIlIlIIIl + 14.0F + 2.0F))) {
         var8 ^= ((long)this.iiiilIIIIi(x) << 32 ^ var8) & -1L << 32;
         if ((int)(var8 >>> 32) != Integer.MIN_VALUE) {
            this.IIIlilIIli((int)(var8 >>> 32));
         }

         return true;
      } else {
         return true;
      }
   }

   private void lIliliIlil() {
      long var6 = 7918741316017034189L;
      this.IIlIIlIIIl = false;
      var6 ^= (0L ^ var6) & -1L << 32;
      this.IiIIIlIIIl = llilliilililliil.IiIIlliIIl(IliIlllilIi<invokedynamic>(), 0.9F);

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < this.lilliIIIIl; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         float var3 = llilliilililliil.IiIIlliIIl(this.iilliIIIIl[(int)var9], 0.72F);

         for(ilillIllIiillIll var5 : this.lliliIIIIl) {
            if (var5.llIlIIilll) {
               if (this.illliIIIIl && (int)var9 != 0 && !var5.IlIlIIilll) {
                  var9 ^= (4294967296L ^ var9) & -1L << 32;
               } else {
                  var3 = Math.max(var3, IiIIllilliIIllil.IilliliilIIi(this.iiIilIIlil((int)var9, var5.liiIIIilll[(int)var9]), 0.9F));
               }
            }
         }

         if (this.illliIIIIl && (int)var9 == 2 && (int)(var9 >>> 32) != 0) {
            var3 = Math.max(var3, this.IiIIIlIIIl);
         }

         this.llIiiIIIIl[(int)var9] = (float)Math.ceil((double)var3);
      }

      if (!this.lIlIIlIIIl) {
         this.lIlIIlIIIl = true;
         System.arraycopy(this.llIiiIIIIl, 0, this.IlIiiIIIIl, 0, 6);
      }

   }

   private void IIIlilIIli(int id) {
      if (id != this.illiiIIIIl && id >= -1 && id < this.lilliIIIIl) {
         this.illiiIIIIl = id;
         this.iIIilIlIil();
      }
   }

   private static void liiIiiiiIi(liIilIiliiIilIil now, float x, float y, float ink, int s, long scale) {
      float var7 = now.iIiiiIlIil == null ? 1.0F : (float)(scale - now.iliiiIlIil) / 1000000.0F / 170.0F;
      if (var7 >= 1.0F) {
         now.iIiiiIlIil = null;
         llilliilililliil.lIlIliIlIl(now.lIiiiIlIil, x, y, ink, s);
      } else {
         float var8 = lliiiIliliiiIl.IliIlllilIi(var7 / 0.55F);
         float var9 = lliiiIliliiiIl.liiiIIllIl((var7 - 0.25F) / 0.75F);
         if (var8 < 1.0F) {
            float var10 = IliiIilliiIi.IilliliilIIi(1.0F - var8);

            try {
               llilliilililliil.lIlIliIlIl(now.iIiiiIlIil, x, y - 3.0F * var8, ink, s);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var10);
            }
         }

         if (var9 > 0.0F) {
            float var19 = IliiIilliiIi.IilliliilIIi(var9);

            try {
               llilliilililliil.lIlIliIlIl(now.lIiiiIlIil, x, y + 3.0F * (1.0F - var9), ink, s);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var19);
            }
         }

      }
   }

   private String iiIilIIlil(int v, long c) {
      return this.illliIIIIl && v != 0 ? llIIilIiilIIilIi.liiiIIllIl(c) : llIIilIiilIIilIi.lIiiIiIlilli(c);
   }

   public boolean lIlIliIlIl(int codepoint, int modifiers) {
      if (codepoint >= 32 && codepoint <= 126) {
         if (this.IiliiIIIIl.isEmpty() && codepoint == 32) {
            return true;
         } else {
            this.IiIliliIli(this.IiliiIIIIl + (char)codepoint);
            return true;
         }
      } else {
         return false;
      }
   }

   private void lliililiil(class_332 s, iIIiliiIlIilii ctx, boolean step) {
      long var9 = -6550297474126122856L;
      long var11 = 7816712513128312170L;
      float var4 = llilliilililliil.IllIllllIl(this.IlIlIlIIIl, 14.0F, 0.72F);
      float var5 = var4 + 5.9616F;
      var9 ^= ((long)(ctx.iiIIlliIIl && ctx.liIIlliIIl >= this.IlIlIlIIIl && ctx.liIIlliIIl <= this.IlIlIlIIIl + 14.0F + 2.0F ? 1 : 0) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)((int)(var9 >>> 32) != 0 ? this.iiiilIIIIi((double)ctx.ilIIlliIIl) : Integer.MIN_VALUE) ^ var9) & -1L >>> 32;
      this.Iiiilliiil(-1, IliIlllilIi<invokedynamic>(), this.IiiIIlIIIl, var4, var5, false, (int)var9, step);

      for(long var15 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var15 >>> 32) < this.lilliIIIIl; var15 += 4294967296L) {
         this.Iiiilliiil((int)(var15 >>> 32), this.iilliIIIIl[(int)(var15 >>> 32)], this.ilIiiIIIIl[(int)(var15 >>> 32)], var4, var5, true, (int)var9, step);
      }

      IIIiiIillIIiiIil.IilliliilIIi(s, this.lliIIlIIIl, llilliilililliil.IIIllIIliIIl(this.IlIlIlIIIl + 14.0F), this.iliIIlIIIl - this.lliIIlIIIl, IIIiiIillIIiiIil.Illlllllilll(), IilIIIIililIIIIi.IIillIiliIil());
   }

   private void IIiillIiil() {
      if (!(this.iilIIlIIIl >= 0.0F) || this.lllIIlIIIl != this.illIIlIIIl || this.IilIIlIIIl != this.lilIIlIIIl) {
         float var1 = llilliilililliil.IiIIlliIIl(this.lIiliIIIIl[2], 0.82F);
         float var2 = this.liiIIlIIIl - this.iiIlIlIIIl - var1 - 10.0F;
         this.iilIIlIIIl = Math.max(0.0F, var2);
         this.illIIlIIIl = this.lllIIlIIIl;
         this.lilIIlIIIl = this.IilIIlIIIl;
         String var3 = IliIlllilIi<invokedynamic>() + llIIilIiilIIilIi.liiiIIllIl(this.IilIIlIIIl);
         float var4 = Math.max(0.0F, var2 / 0.82F - llilliilililliil.llIIlilIIl(var3));
         String var5 = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(this.lllIIlIIIl, var4);
         this.IIIiiIIIIl[2].IliIlllilIi(var5 + var3, this.iiilllIIIill.iIlIlllllill());
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) + var5))) + '퇿') - 17686) - var5) - var5) - var5))) + '\uf85a'))) ^ var5) - '뇵'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void llIliilIli() {
      this.IiIliliIli("");
   }

   private void IIIillIIil(boolean all) {
      long var4 = -7365502339576115846L;

      for(long var6 = var4 ^ ((long)(this.lliliIIIIl.size() - 1) << 32 ^ var4) & -1L << 32; (int)(var6 >>> 32) >= 0; var6 += -4294967296L) {
         ilillIllIiillIll var3 = (ilillIllIiillIll)this.lliliIIIIl.get((int)(var6 >>> 32));
         if (!var3.llIlIIilll && (all || var3.lIllIIilll <= 0.0F)) {
            this.lliliIIIIl.remove((int)(var6 >>> 32));
            this.ililiIIIIl.remove(var3.iIiIIIilll);
         }
      }

   }

   private void iIIliIlIli(int dir) {
      iiIlIiIIllIi[] var2 = iiIlIiIIllIi.values();
      this.llliiIIIIl = var2[Math.floorMod(this.llliiIIIIl.ordinal() + (dir < 0 ? -1 : 1), var2.length)];
      this.iIIilIlIil();
      this.liiliIIIIl.lIiiIiIlilli(0.0F);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 11296) - '鍮') - 31621))) - '퍝') + var5))) ^ 16447))) ^ 3857))) - 'ꊼ') - var5) ^ 17842) - var5) ^ '迷'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean llIililIil(ilillIllIiillIll l) {
      if (!this.liliiIIIIl.isEmpty() && !l.iliIIIilll.contains(this.liliiIIIIl) && !l.IiiIIIilll.contains(this.liliiIIIIl)) {
         return false;
      } else if (this.illliIIIIl) {
         return true;
      } else {
         boolean var10000;
         switch (this.llliiIIIIl.ordinal()) {
            case 0 -> var10000 = true;
            case 1 -> var10000 = l.iIIlIIilll == llliilIlilliilIl.llliiilIll || l.liiIIIilll[5] > 0L;
            case 2 -> var10000 = l.iIIlIIilll == llliilIlilliilIl.IlliiilIll;
            case 3 -> var10000 = l.iIIlIIilll == llliilIlilliilIl.iIliiilIll;
            case 4 -> var10000 = l.iIIlIIilll == llliilIlilliilIl.lIliiilIll;
            case 5 -> var10000 = l.liiIIIilll[3] > 0L;
            case 6 -> var10000 = l.liiIIIilll[4] > 0L;
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }

   private static void IliIilliIi(class_332 x, class_1799 stack, float y, float ctx) {
      long var11 = -458196607951325554L;
      long var13 = -3611177245667692002L;
      var11 ^= ((long)((int)Math.floor((double)y)) << 32 ^ var11) & -1L << 32;
      var11 ^= ((long)((int)Math.floor((double)ctx)) ^ var11) & -1L >>> 32;
      float var6 = y - (float)((int)(var11 >>> 32));
      float var7 = ctx - (float)((int)var11);
      var13 ^= ((long)(!(var6 > 0.001F) && !(var7 > 0.001F) ? 0 : 1) << 32 ^ var13) & -1L << 32;
      Matrix3x2fStack var9 = x.method_51448();
      if ((int)(var13 >>> 32) != 0) {
         var9.pushMatrix();
         var9.translate(var6, var7);
      }

      try {
         llllIIlilllIIl.iIlIlllllill(x, stack, (int)(var11 >>> 32), (int)var11, 16);
      } finally {
         if ((int)(var13 >>> 32) != 0) {
            var9.popMatrix();
         }

      }

   }

   private String lIilliIill(int types) {
      String var2 = types + (types == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
      return this.IilliIIIIl == null ? var2 : this.IilliIIIIl + IliIlllilIi<invokedynamic>() + var2;
   }

   private int iiiilIIIIi(double x) {
      long var4 = 7483972053592481358L;
      if (x >= (double)this.lliIIlIIIl && x <= (double)this.liIlIlIIIl) {
         return -1;
      } else {
         for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < this.lilliIIIIl; var6 += 4294967296L) {
            if (x >= (double)(this.ilIiiIIIIl[(int)(var6 >>> 32)] - this.IlIiiIIIIl[(int)(var6 >>> 32)] - 8.0F - 2.0F) && x <= (double)(this.ilIiiIIIIl[(int)(var6 >>> 32)] + 4.0F)) {
               return (int)(var6 >>> 32);
            }
         }

         return Integer.MIN_VALUE;
      }
   }

   private void lllIiillIi(ilillIllIiillIll l, float now, long ty) {
      long var8 = 438242903837379680L;
      long var10 = -4518898556577243009L;

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < this.lilliIIIIl; var8 += 4294967296L) {
         var8 ^= ((long)(l.liiIIIilll[(int)(var8 >>> 32)] > 0L ? 1 : 0) ^ var8) & -1L >>> 32;
         if ((int)var8 == 0) {
            var10 ^= (-47749157179359232L ^ var10) & -1L << 32;
         } else if ((int)(var8 >>> 32) == 2) {
            var10 ^= (-3953891058122752L ^ var10) & -1L << 32;
         } else if ((int)(var8 >>> 32) == 5) {
            var10 ^= ((long)IIlliIIIIl << 32 ^ var10) & -1L << 32;
         } else {
            var10 ^= (-32772477369188352L ^ var10) & -1L << 32;
         }

         IiIIllilliIIllil.IIIllIIliIIl(this.IilIililIi(l, (int)(var8 >>> 32), ty), this.ilIiiIIIIl[(int)(var8 >>> 32)], now, 0.9F, (int)(var10 >>> 32));
      }

   }

   private static void lliliilili(Map<class_1792, Integer> iv, Map<class_1792, Integer> item, Map<class_1792, Integer> placed, Map<class_1792, Integer> hotbar, class_1792 done, int hb, int required, int total, int inv) {
      iv.put(done, hb);
      item.put(done, required);
      placed.put(done, total);
      hotbar.put(done, inv);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 5 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 11))))) ^ 32196) << 1 | (char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 5 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 11))))) ^ 32196) >>> 15) + var5) >>> 13 | (char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 5 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 11))))) ^ 32196) << 1 | (char)((char)(-((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 5 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 11))))) ^ 32196) >>> 15) + var5) << 3) - 28609) + 3602) ^ 31202) - var5) - var5) + var5))) ^ 18472) + '\udff8'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static iliIIIiIiiIIIi<class_1792> lilliiilli() {
      LinkedHashMap var0 = new LinkedHashMap();
      LinkedHashMap var1 = new LinkedHashMap();
      IIililIili(var0, var1, class_1802.field_8281, 64, 520L);
      IIililIili(var0, var1, class_1802.field_8280, 32, 12L);
      return llIIilIiilIIilIi.<class_1792>IliIlllilIi(var0, var1);
   }

   private void IIlIilIlIi(class_332 rule, ilillIllIiillIll now, float l, float top, boolean a, float hl, long ctx) {
      float var9 = IliiIilliiIi.IilliliilIIi(top);

      try {
         if (now.iIllIIilll > 0.01F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(rule, this.lliIIlIIIl, l + 1.0F, this.iliIIlIIIl - this.lliIIlIIIl, 18.0F, 5.0F, llilliilililliil.IIIIllIIIl(-1, 0.045F * now.iIllIIilll));
         }

         if (a) {
            IIIiiIillIIiiIil.IilliliilIIi(rule, this.IiiIIlIIIl, l + 20.0F - hl, this.liiIIlIIIl - this.IiiIIlIIIl, hl, 234881023);
         }

         IliIilliIi(rule, now.IliIIIilll, this.IiiIIlIIIl, l + 2.0F);
         float var10 = llilliilililliil.IllIllllIl(l, 20.0F, 0.9F);
         llilliilililliil.lIlIliIlIl(this.iilIiIIiIi(now), this.IiIlIlIIIl, var10, 0.9F, this.lIiIiiIiIi(now));
         if (this.illliIIIIl) {
            this.iIlIiIllIi(rule, now, var10, hl, ctx);
         } else {
            this.lllIiillIi(now, var10, ctx);
         }
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var9);
      }

   }

   protected void illIlIilIl() {
      this.lIIIIlIIIl = System.nanoTime();
      this.iiiliIIIIl.liiiIIllIl(0L, this.iiiliIIIIl.IilliliilIIi(), this.lIIIIlIIIl + 160000000L, 900000000L);
   }

   public void iliIiiliiiii(float dt) {
      long var6 = 8162904512258339267L;
      ++this.iIlIIlIIIl;
      this.ilIIIlIIIl = dt;
      var6 ^= (0L ^ var6) & -1L << 32;

      for(ilillIllIiillIll var4 : this.lliliIIIIl) {
         var4.iiIlIIilll = lliiiIliliiiIl.IIIllIIliIIl(var4.iiIlIIilll, var4.IIllIIilll, 16.0F, dt, 0.01F);
         float var5 = var4.ilIlIIilll ? 1.0F : 0.0F;
         var4.lIllIIilll = lliiiIliliiiIl.IIIllIIliIIl(var4.lIllIIilll, var5, var5 > var4.lIllIIilll ? 12.0F : 26.0F, dt, 0.004F);
         var4.liIlIIilll = lliiiIliliiiIl.IIIllIIliIIl(var4.liIlIIilll, var4.IlIlIIilll ? 1.0F : 0.0F, 10.0F, dt, 0.004F);
         if (!var4.llIlIIilll && var4.lIllIIilll <= 0.0F) {
            var6 ^= (4294967296L ^ var6) & -1L << 32;
         }
      }

      if ((int)(var6 >>> 32) != 0) {
         this.IIIillIIil(false);
      }

      for(var6 ^= (0L ^ var6) & -1L >>> 32; (int)var6 < this.lilliIIIIl; var6 ^= (var6 ^ var6 + (long)1) & -1L >>> 32) {
         this.IlIiiIIIIl[(int)var6] = lliiiIliliiiIl.IIIllIIliIIl(this.IlIiiIIIIl[(int)var6], this.llIiiIIIIl[(int)var6], 14.0F, dt, 0.02F);
      }

      for(long var10 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var10 <= this.lilliIIIIl; var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
         this.IiIiiIIIIl[(int)var10] = lliiiIliliiiIl.IIIllIIliIIl(this.IiIiiIIIIl[(int)var10], this.illiiIIIIl + 1 == (int)var10 ? 1.0F : 0.0F, 14.0F, dt, 0.004F);
      }

      this.IlIIIlIIIl = lliiiIliliiiIl.IIIllIIliIIl(this.IlIIIlIIIl, this.illliIIIIl && llIIilIiilIIilIi.iliIiiliiiii(this.iiiliIIIIl.IilliliilIIi()) ? 1.0F : 0.0F, 10.0F, dt, 0.004F);
      this.llIIIlIIIl = lliiiIliliiiIl.IIIllIIliIIl(this.llIIIlIIIl, this.IiiliIIIIl.isEmpty() ? 1.0F : 0.0F, 10.0F, dt, 0.004F);
      this.liiliIIIIl.IlIlllIlilIl(dt, this.iiilllIIIill.IlIlllIlilIl().iiIIlliIIl);
   }

   public static void iiIliIIlli(String arg) {
      long var7 = 5433043464979017004L;
      class_310 var1 = class_310.method_1551();
      String var2 = arg == null ? "" : arg.trim();
      String var3 = var2.toLowerCase(Locale.ROOT);
      class_437 var6 = var1.field_1755;
      ililIliIiilIli var10000;
      if (var6 instanceof ililIliIiilIli var5) {
         var10000 = var5;
      } else {
         var10000 = null;
      }

      ililIliIiilIli var4 = var10000;
      if (var3.equals(IliIlllilIi<invokedynamic>())) {
         if (var4 == null) {
            return;
         }

         IIllIlIIIl = !IIllIlIIIl;
         if (var4.illliIIIIl) {
            var4.iIlllIllll(Illlilllli(IIllIlIIIl));
         } else {
            var4.lllllillll(iIiliIlili(IIllIlIIIl));
         }
      } else if (var3.equals(IliIlllilIi<invokedynamic>())) {
         IIllIlIIIl = false;
         var1.method_1507(new ililIliIiilIli(var1.field_1755, iIiliIlili(false), IliIlllilIi<invokedynamic>()));
      } else if (var3.startsWith(IliIlllilIi<invokedynamic>())) {
         if (var4 != null) {
            var4.IIIlilIIli(var4.lIlliiIlli(var2.substring(5).trim()));
         }
      } else if (var3.startsWith(IliIlllilIi<invokedynamic>())) {
         if (var4 != null) {
            var4.IiIliliIli(var2.length() > 6 ? var2.substring(6).trim() : "");
         }
      } else if (var3.equals(IliIlllilIi<invokedynamic>())) {
         if (var4 != null && !var4.illliIIIIl) {
            var4.iIIliIlIli(1);
         }
      } else if (!var3.equals(IliIlllilIi<invokedynamic>()) && !var3.equals(IliIlllilIi<invokedynamic>())) {
         IIllIlIIIl = false;
         var1.method_1507(new ililIliIiilIli(var1.field_1755, iIiliIlili(false), IliIlllilIi<invokedynamic>(), Illlilllli(false)));
      } else {
         IIllIlIIIl = false;
         var7 ^= ((long)var3.equals(IliIlllilIi<invokedynamic>()) << 32 ^ var7) & -1L << 32;
         var1.method_1507(new ililIliIiilIli(var1.field_1755, iIiliIlili(false), (int)(var7 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), (int)(var7 >>> 32) != 0 ? illliIilli() : lilliiilli()));
      }

   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') << 4 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') >>> 12) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') << 4 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') >>> 12) + var5) << 11) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') << 4 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') >>> 12) + var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') << 4 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + '膨') ^ var5) + 4086) + '콙') >>> 12) + var5) << 11) >>> 8))) ^ var5))) + '칔') ^ '頑') ^ '\udad4') ^ 1508) + 'ꌽ') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
