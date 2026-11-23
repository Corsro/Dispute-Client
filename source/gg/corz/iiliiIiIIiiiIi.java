package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Base64;
import java.util.Deque;
import java.util.Iterator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2390;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_5819;
import org.joml.Matrix4f;

public class iiliiIiIIiiiIi extends ilIllIiIll {
   private final iIIlilIlIlIlilIl IlIlIliiillIlIliii = new iIIlilIlIlIlilIl();
   private final iliiliilIiiiliil iiIIIliiiIIlIIliii = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -5204993);
   private final IIIIlilllIIIlill lIlIIliiiiIlIIliii = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.5F, (double)0.5F, (double)4.0F, 0.1);
   private int liIlIliiiiiIlIliii;
   private double iIllIliiiIlllIliii = Double.NaN;
   private final IIIIlilllIIIlill lliIIliiiiliIIliii = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)9.0F, (double)2.0F, (double)20.0F, (double)0.5F);
   private final iiIiiilIIliiil illIIliiiIilIIliii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final Deque<iIilIiIlilIi> lIIlIliiiiIIlIliii = new ArrayDeque();
   private static final float IliiiIiiilliiiIiii = 0.45F;
   private final iiIiiilIIliiil iiiIIliiiIIIlIliii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float lIiiiIiiiiIiiiIiii = 0.4F;
   private static final int IIIIIliiilIIIIliii = 40;
   private double iillIliiiIIilIliii;
   private final IIIIlilllIIIlill iIiIIliiiIliIIliii = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.45, 0.1, (double)1.0F, 0.05);
   private static final float iliiiIiiiIiiiiIiii = 10.0F;
   private final iiIiiilIIliiil lilIIliiiiilIIliii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl IIiIIliiilIiIIliii = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 10, 1, 30);
   private final IIIIlilllIIIlill IiiIIliiiliiIIliii = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)6.0F, (double)2.0F, (double)10.0F, (double)0.5F);
   private final iiIiiilIIliiil IllIIliiilllIIliii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final IIIIlilllIIIlill IiIIIliiiliIIIliii = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)0.5F, (double)3.0F, 0.1);
   private final lliliIIiililiIIi iIIIIliiiIlIIIliii = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final int liiiiIiiiiiiiiIiii = 16756958;
   private double llllIliiiilllIliii = Double.NaN;
   private double IillIliiilillIliii = Double.NaN;
   private boolean ilIlIliiiIiIlIliii = true;
   private final lliliIIiililiIIi llIIIliiiilIIIliii = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private int IIllIliiilIllIliii;
   private static final float iiliiIiiiIIiiiIiii = 0.25F;

   private void lllllillll(Matrix4f matrix, iIilIiIlilIi life, long now, float baseRgb, float c, int sz) {
      float var8 = life.IliIlllilIi(now);
      float var9;
      float var10;
      if (var8 < 0.25F) {
         float var11 = var8 / 0.25F;
         var9 = llIililIil(var11);
         var10 = IIIillIIil(Math.min(1.0F, var11 * 2.0F));
      } else if (var8 > baseRgb - 0.4F) {
         float var15 = (var8 - (baseRgb - 0.4F)) / 0.4F;
         var9 = liilliiill(IIIillIIil(var15), 1.0F, 1.3F);
         var10 = 1.0F - iIIilIlIil(var15);
      } else {
         var9 = 1.0F;
         var10 = 1.0F;
      }

      float var16 = 0.5F + 0.5F * (float)Math.sin((double)(var8 * 10.0F));
      int var12 = Ilillllill(sz, 16756958, var16 * 0.35F);
      int var13 = lIilliIill(var12, var10 * (0.82F + 0.18F * var16));
      float var14 = 0.5F * c * var9;
      this.iilllIIill(matrix, life.IiillIIIlliillIIIl, life.iiillIIIlIIIilIIIl + (double)life.ilIilIIIlIiIilIIIl, life.lIIilIIIliIIilIIIl, var14, var13, 2.0F);
      this.iilllIIill(matrix, life.IiillIIIlliillIIIl, life.iiillIIIlIIIilIIIl + (double)life.ilIilIIIlIiIilIIIl, life.lIIilIIIliIIilIIIl, var14 * 0.6F, lIilliIill(var12, var10 * 0.4F * (0.82F + 0.18F * var16)), 1.5F);
   }

   public iiliiIiIIiiiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iIiIIliiiIliIIliii.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lliIIliiiiliIIliii.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IiiIIliiiliiIIliii.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iiiIIliiiIIIlIliii.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIIIIliiiIlIIIliii, this.llIIIliiiilIIIliii, this.IiIIIliiiliIIIliii, this.iiIIIliiiIIlIIliii, this.lIlIIliiiiIlIIliii, this.IllIIliiilllIIliii, this.illIIliiiIilIIliii, this.lilIIliiiiilIIliii, this.IIiIIliiilIiIIliii, this.iIiIIliiiIliIIliii, this.lliIIliiiiliIIliii, this.IiiIIliiiliiIIliii, this.iiiIIliiiIIIlIliii});
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) << 2 | (char)(var4[var5] - var5) >>> 14))) + var5) ^ var5) ^ 28191) ^ var5) + 25802) + var5)) + var5) - var5) - var5))) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!this.IlIlIliiillIlIliii.IliIlllilIi()) {
            this.iIlllIllll(event, System.nanoTime());
         }

         if (!this.lIIlIliiiiIIlIliii.isEmpty()) {
            long var2 = System.nanoTime();
            float var4 = Math.max(0.1F, (float)this.lIlIIliiiiIlIIliii.Iilllilliill());
            Iterator var5 = this.lIIlIliiiiIIlIliii.iterator();

            while(var5.hasNext()) {
               if (((iIilIiIlilIi)var5.next()).IliIlllilIi(var2) > var4) {
                  var5.remove();
               }
            }

            if (!this.lIIlIliiiiIIlIliii.isEmpty()) {
               class_243 var12 = Iiiilllliiilll.field_1773.method_19418().method_71156();
               class_4587 var6 = event.IliiiIIilliiiIIi;
               var6.method_22903();
               var6.method_22904(-var12.field_1352, -var12.field_1351, -var12.field_1350);
               Matrix4f var7 = var6.method_23760().method_23761();
               float var8 = (float)this.IiIIIliiiliIIIliii.Iilllilliill();
               int var9 = this.IIllllIlll();

               for(iIilIiIlilIi var11 : this.lIIlIliiiiIIlIliii) {
                  this.lllllillll(var7, var11, var2, var4, var8, var9);
                  if (this.illIIliiiIilIIliii.Iilllilliill()) {
                     this.Iillllilll(var7, var11, var2, var8, var9);
                  }
               }

               var6.method_22909();
               iIiiIIilIliiIIil.IiIiliIiiiIi();
            }
         }
      }
   }

   private void ilIllIiIll() {
      int var1 = this.liIlliiIll();
      class_5819 var2 = Iiiilllliiilll.field_1724.method_59922();

      for(int var3 = 0; var3 < 10; ++var3) {
         double var4 = var2.method_43058() * Math.PI * (double)2.0F;
         double var6 = 0.15 + var2.method_43058() * 0.45;
         Iiiilllliiilll.field_1687.method_8406(new class_2390(var1, 0.9F), Iiiilllliiilll.field_1724.method_23317() + Math.cos(var4) * var6, Iiiilllliiilll.field_1724.method_23318() + 0.05, Iiiilllliiilll.field_1724.method_23321() + Math.sin(var4) * var6, (double)0.0F, 0.6 + var2.method_43058() * 0.4, (double)0.0F);
      }

   }

   private int liIlliiIll() {
      return this.iiIIIliiiIIlIIliii.Iilllilliill() & (236219646 * -991146299 * 1056139499 * 1926714301 ^ 1258751093);
   }

   private static float llIililIil(float t) {
      t = ilillIiill(t);
      float var1 = 3.2F;
      float var2 = t - 1.0F;
      return 1.0F + var1 * var2 * var2 * var2 + 2.2F * var2 * var2;
   }

   private void iIlllIllll(illlllIillll event, long now) {
      if (Iiiilllliiilll.field_1687 != this.IlIlIliiillIlIliii.liiiIIllIl()) {
         this.IlIlIliiillIlIliii.iIlIlllllill();
      } else {
         class_243 var4 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         float var5 = (float)(System.currentTimeMillis() % 4000L) / 4000.0F;
         this.IlIlIliiillIlIliii.IlIlllIlilIl(event.IliiiIIilliiiIIi, var4, now, this.iIiIIliiiIliIIliii.Iilllilliill(), this.lliIIliiiiliIIliii.Iilllilliill(), this.iiiIlIIIll(), this.iiiIIliiiIIIlIliii.Iilllilliill(), this.liIlliiIll(), this.IllIIliiilllIIliii.Iilllilliill(), var5);
      }
   }

   private static float ilillIiill(float t) {
      return t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
   }

   private void lIIlliIIll(double waveGain) {
      String var3 = this.iIIIIliiiIlIIIliii.Iilllilliill();
      if (IiIiIilliIiIil.IliIlllilIi(var3)) {
         float var4 = 0.01F + (float)(this.IIllIliiilIllIliii % 8) * 0.001F;
         ++this.IIllIliiilIllIliii;
         boolean var5 = IiIiIilliIiIil.IIIllIIliIIl(this.iIllIliiiIlllIliii, this.llllIliiiilllIliii, this.IillIliiilillIliii, Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23318(), Iiiilllliiilll.field_1724.method_23321());
         this.lIIlIliiiiIIlIliii.addLast(new iIilIiIlilIi(var5 ? this.iIllIliiiIlllIliii : Iiiilllliiilll.field_1724.method_23317(), var5 ? this.llllIliiiilllIliii : Iiiilllliiilll.field_1724.method_23318(), var5 ? this.IillIliiilillIliii : Iiiilllliiilll.field_1724.method_23321(), Iiiilllliiilll.field_1724.method_36454(), var4, System.nanoTime()));
         int var6 = Math.max(1, this.IIiIIliiilIiIIliii.Iilllilliill());

         while(this.lIIlIliiiiIIlIliii.size() > var6) {
            this.lIIlIliiiiIIlIliii.removeFirst();
         }
      }

      if (IiIiIilliIiIil.liiiIIllIl(var3)) {
         this.IlIllllIll(waveGain);
      }

      if (this.lilIIliiiiilIIliii.Iilllilliill()) {
         this.ilIllIiIll();
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) << 13 | (char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) >>> 3))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) << 13 | (char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) >>> 3))) >>> 11) >>> 9 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) << 13 | (char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) >>> 3))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) << 13 | (char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) >>> 15 | (char)((char)(-((char)(-((char)(-((char)(var4[var5] << 4 | var4[var5] >>> 12))))))) - var5) << 1) ^ var5) - 3028) >>> 3))) >>> 11) << 7) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iillllilll(Matrix4f sz, iIilIiIlilIi matrix, long c, float baseRgb, int now) {
      float var7 = matrix.IliIlllilIi(c);
      if (!(var7 >= 0.45F)) {
         float var8 = var7 / 0.45F;
         float var9 = liilliiill(IIIillIIil(var8), 0.35F, 2.2F) * baseRgb;
         float var10 = 0.85F * (1.0F - iIIilIlIil(var8));
         this.iilllIIill(sz, matrix.IiillIIIlliillIIIl, matrix.iiillIIIlIIIilIIIl + (double)(matrix.ilIilIIIlIiIilIIIl * 0.5F) + 0.004, matrix.lIIilIIIliIIilIIIl, var9, lIilliIill(now, var10), 1.5F);
      }
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!IiIiIilliIiIil.liiiIIllIl(this.iIIIIliiiIlIIIliii.Iilllilliill())) {
            if (!this.IlIlIliiillIlIliii.IliIlllilIi()) {
               this.IlIlIliiillIlIliii.iIlIlllllill();
            }
         } else {
            this.IlIlIliiillIlIliii.iliIiiliiiii(Iiiilllliiilll.field_1687, System.nanoTime(), this.lliIIliiiiliIIliii.Iilllilliill(), this.iiiIlIIIll());
         }

         boolean var1 = Iiiilllliiilll.field_1724.method_24828();
         double var2 = Iiiilllliiilll.field_1724.method_18798().field_1351;
         if (var1) {
            this.iIllIliiiIlllIliii = Iiiilllliiilll.field_1724.method_23317();
            this.llllIliiiilllIliii = Iiiilllliiilll.field_1724.method_23318();
            this.IillIliiilillIliii = Iiiilllliiilll.field_1724.method_23321();
         }

         boolean var4 = IiIiIilliIiIil.iIlIlllllill(this.ilIlIliiiIiIlIliii, var1, var2);
         boolean var5 = IiIiIilliIiIil.IilliliilIIi(this.ilIlIliiiIiIlIliii, var1, this.liIlIliiiiiIlIliii);
         double var6 = var5 ? IiIiIilliIiIil.iliIiiliiiii(this.iillIliiiIIilIliii) : (double)1.0F;
         if (!var1) {
            this.iillIliiiIIilIliii = var2;
         }

         this.liIlIliiiiiIlIliii = var1 ? 0 : this.liIlIliiiiiIlIliii + 1;
         if (IiIiIilliIiIil.lIiiIiIlilli(this.llIIIliiiilIIIliii.Iilllilliill(), var4, var5)) {
            this.lIIlliIIll(var6);
         }

         this.ilIlIliiiIiIlIliii = var1;
      } else {
         this.IlIlIliiillIlIliii.iIlIlllllill();
      }
   }

   private static int lIilliIill(int alpha, float rgb) {
      long var3 = 8142859709677581898L;
      var3 ^= ((long)((int)(ilillIiill(rgb) * 255.0F)) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (~(929729214 >>> 21 | 929729214 << 11) ^ -1414918564) | alpha & ((-496098534 - -115 << 23 | -496098534 - -115 >>> 9) ^ -972109586);
   }

   private double iiiIlIIIll() {
      return Math.max(Double.longBitsToDouble(2387098183216943936L ^ 2204851491531508442L), this.lIlIIliiiiIlIIliii.Iilllilliill());
   }

   private static float liilliiill(float t, float b, float a) {
      return b + (a - b) * t;
   }

   protected void Iilililiiili() {
      this.lIIlIliiiiIIlIliii.clear();
      this.IlIlIliiillIlIliii.iIlIlllllill();
      this.ilIlIliiiIiIlIliii = true;
      this.liIlIliiiiiIlIliii = 0;
      this.iIllIliiiIlllIliii = this.llllIliiiilllIliii = this.IillIliiilillIliii = Double.longBitsToDouble(-7154009382335870922L ^ -2067193603220895690L);
      this.iillIliiiIIilIliii = (double)0.0F;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '훮') << 15 | (char)(var4[var5] + '훮') >>> 1) - 'ꡍ'))) - var5) - var5) - var5) << 11 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + '훮') << 15 | (char)(var4[var5] + '훮') >>> 1) - 'ꡍ'))) - var5) - var5) - var5) >>> 5) - var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float iIIilIlIil(float t) {
      t = ilillIiill(t);
      return t * t;
   }

   private int IIllllIlll() {
      if (this.IllIIliiilllIIliii.Iilllilliill()) {
         float var1 = (float)(System.currentTimeMillis() % (6047188196210982045L ^ 6047188196210979645L)) / 4000.0F;
         return class_3532.method_15369(var1, 0.75F, 1.0F) & (-35310168 - -75 - 75 ^ -48575913);
      } else {
         return this.liIlliiIll();
      }
   }

   private void IlIllllIll(double gain) {
      if (!Iiiilllliiilll.field_1724.method_7325() && !Iiiilllliiilll.field_1724.method_5799() && !Iiiilllliiilll.field_1724.method_5771() && !Iiiilllliiilll.field_1724.method_5765()) {
         if (IiIiIilliIiIil.IIIllIIliIIl(this.iIllIliiiIlllIliii, this.llllIliiiilllIliii, this.IillIliiilillIliii, Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23318(), Iiiilllliiilll.field_1724.method_23321())) {
            this.IlIlIliiillIlIliii.IilliliilIIi(Iiiilllliiilll.field_1687, this.iIllIliiiIlllIliii, this.llllIliiiilllIliii, this.IillIliiilillIliii, this.IiiIIliiiliiIIliii.Iilllilliill(), this.IIiIIliiilIiIIliii.Iilllilliill(), gain, System.nanoTime());
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 26519) >>> 12 | (char)(var4[var5] ^ 26519) << 4) - '찲')))) - var5))) ^ var5))) ^ '诤') << 9 | (char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ 26519) >>> 12 | (char)(var4[var5] ^ 26519) << 4) - '찲')))) - var5))) ^ var5))) ^ '诤') >>> 7) - var5) ^ var5) - '蛋') ^ var5))) ^ '銬'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iilllIIill(Matrix4f cx, double cz, double radius, double argb, float matrix, int width, float cy) {
      float var11 = 0.0F;
      float var12 = 0.0F;

      for(int var13 = 0; var13 <= 40; ++var13) {
         double var14 = (double)var13 / (double)40.0F * Math.PI * (double)2.0F;
         float var16 = (float)(cz + Math.cos(var14) * (double)matrix);
         float var17 = (float)(argb + Math.sin(var14) * (double)matrix);
         if (var13 > 0) {
            iIiiIIilIliiIIil.Iliilliiilii(cx, var11, (float)radius, var12, var16, (float)radius, var17, width, cy);
         }

         var11 = var16;
         var12 = var17;
      }

   }

   private static float IIIillIIil(float t) {
      t = ilillIiill(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8200535497902330969L ^ Long.rotateLeft(1790833996738230838L, 53) ^ -4386438804511488615L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4322247989134707478L ^ Long.rotateLeft(-2369270756167048758L, 29) ^ 9186457741262992283L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6667694817061881040L ^ Long.rotateLeft(-1738945392182765122L, 40) ^ -9101729406465846970L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5269240530366813469L ^ Long.rotateLeft(-4361017579856164390L, 63) ^ 2147348475719796753L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6390346369388106349L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2397003013686581309L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7419219331659220855L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5090165652274471960L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1676504807048930071L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3698541571483169858L;
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

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 7) << 10 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 7) >>> 6) << 1 | (char)((char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 7) << 10 | (char)((char)(var4[var5] >>> 8 | var4[var5] << 8) >>> 9 | (char)(var4[var5] >>> 8 | var4[var5] << 8) << 7) >>> 6) >>> 15) ^ 6606) ^ 8727) + 18412) ^ var5) ^ 14759) ^ var5) ^ var5) ^ 10386) - 18249) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int Ilillllill(int to, int t, float from) {
      long var6 = 2290307959482495916L;
      long var8 = -3363837482726520411L;
      var6 ^= ((long)((int)liilliiill(from, (float)(to >> ((-1523541453 << 15 | -1523541453 >>> 17) - 31 ^ 1293537897) & (-(~(-959185263)) ^ -959185299)), (float)(t >> ((((2110163154 << 27 | 2110163154 >>> 5) >>> 21 | (2110163154 << 27 | 2110163154 >>> 5) << 11) * -95 >>> 27 | ((2110163154 << 27 | 2110163154 >>> 5) >>> 21 | (2110163154 << 27 | 2110163154 >>> 5) << 11) * -95 << 5) ^ -1714479126) & ((-(-975754259 - 99) >>> 23 | -(-975754259 - 99) << 9) ^ 1370025099)))) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)((int)liilliiill(from, (float)(to >> ((-342519634 * 7 << 9 | -342519634 * 7 >>> 23) + 67 - 77 ^ 770278608) & ((1738334463 * 3 + 25) * 43 ^ -31 ^ -906847316)), (float)(t >> ((89917381 << 1 | 89917381 >>> 31) ^ 99 ^ 109 ^ -95 ^ -179834835) & (-1873518065 + -97 - 117 + -87 ^ -1873518563)))) ^ var6) & -1L >>> 32;
      var8 ^= ((long)((int)liilliiill(from, (float)(to & ((1092874734 - -45 << 19 | 1092874734 - -45 >>> 13) * 1594008481 ^ -2144568960)), (float)(t & (~((-857026813 - -19) * 63) ^ -1841886870)))) << 32 ^ var8) & -1L << 32;
      return (int)(var6 >>> 32) << (~(-1014966314 - -89) ^ -55 ^ -1014966263) | (int)var6 << ((-511582304 - -41) * -107 ^ -1095272715) | (int)(var8 >>> 32);
   }
}
