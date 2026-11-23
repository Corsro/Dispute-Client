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
import java.util.Collection;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_2561;
import net.minecraft.class_3965;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_239.class_240;

public class iiliililIIiiilil extends ilIllIiIll {
   private final iiIiiilIIliiil IIIIilllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final ililliIiIiilliIi Iilillllil = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), () -> this.lililiilil(1, true));
   private final iiIiiilIIliiil llIIilllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private class_2338 ilIlilllil;
   private final ililliIiIiilliIi lilillllil = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), () -> this.lililiilil(2, false));
   private final iilliIlIIiliIl lIiillllil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 1, 6);
   private boolean liiIilllil;
   private int lIiIilllil;
   private final ililliIiIiilliIi illillllil = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), () -> this.lililiilil(1, false));
   private final iilliIlIIiliIl iIiillllil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 1, 5);
   private final iiIiiilIIliiil ilIIilllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil liiillllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int iIiIilllil;
   private final IIIIlilllIIIlill Iliillllil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)4.5F, (double)3.0F, (double)6.0F, (double)0.5F);
   private final IIiiIIIllIiiIIIl lllillllil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private final lllIiiillIii IIIlilllil = new lllIiiillIii();
   private static boolean iiIIilllil;
   private int iilIilllil;
   private boolean IllIilllil;
   private boolean IiiIilllil;
   private boolean iliIilllil;
   private static final int IiIIilllil = 4;
   private final IIiiIIIllIiiIIIl iIlillllil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private List<class_2338> llIlilllil;
   private int lilIilllil;
   private final llilIIIiililIIIi lIlIilllil = new llilIIIiililIIIi();
   private final List<class_2338> lliIilllil = new ArrayList();
   private long iIIlilllil = Long.MIN_VALUE;
   private iIiIlIliIl iIlIilllil;
   private iIiiiIIlIliiiIIl lIIlilllil;
   private final iiIiiilIIliiil lliillllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int IlIlilllil;
   private static final long liIIilllil = 160000000L;
   private final iiIiiilIIliiil iliillllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final ilIIIIiIiIIIIi IIlIilllil = new ilIIIIiIiIIIIi();
   private final iiIiiilIIliiil iIIIilllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private Object lllIilllil;
   private final iilliIlIIiliIl lIIIilllil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 50, 1, 1000);
   private final iilliIlIIiliIl iiiillllil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2, 1, 10);
   private final iiIiiilIIliiil IlIIilllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private Object illIilllil;
   private final iiIiiilIIliiil Iiiillllil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final ililliIiIiilliIi iilillllil = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), () -> this.lililiilil(2, true));
   private final IIiiIIIllIiiIIIl IIiillllil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private boolean IliIilllil;
   private int IIiIilllil;
   private String iiiIilllil;
   private int IilIilllil;

   private void iIIilIlIil(IiiIIiilliiIIiil f) {
      f.IliIlllilIi();
      f.iIIilillil = this.iIIIilllil.Iilllilliill();
      f.IlIilillil = this.IlIIilllil.Iilllilliill();
      if (this.IliIilllil) {
         f.liiiIIllIl(this.IilIilllil, this.lilIilllil, this.iilIilllil, this.IIiIilllil, this.lIiIilllil, this.iIiIilllil);
      }

      if (this.iIlIilllil != null && this.iIlIilllil.liiiIIllIl()) {
         iIiiiIIlIliiiIIl var2 = this.iIlIilllil.IilliliilIIi();
         if (var2 != null && !var2.Iilililiiili() && this.lIlIilllil.IIIllIIliIIl()) {
            this.llIililIil(f, var2);
         } else {
            class_2338 var3 = this.iIlIilllil.lIiiIiIlilli();
            if (var3 != null) {
               f.iIlIlllllill(var3.method_10263(), var3.method_10264(), var3.method_10260(), var3.method_10263(), var3.method_10264(), var3.method_10260());
            }
         }

         f.iliilillil = this.iIlIilllil.iliIiiliiiii();
         lllIlIIlillIlIIl var5 = this.iIlIilllil.IlIlllIlilIl();
         if (var5 != null && var5.IlIillIiilIi() != null && System.nanoTime() - var5.IiIiliIiiiIi() < (2783479109299109451L ^ 2783479109156017739L)) {
            f.liiilillil = var5.IlIillIiilIi();
            f.iiiilillil = true;
            List var4 = var5.Iiilliiliiil();
            if (var4 != null && f.liiilillil.equals(var5.IIIilIIiiIIi())) {
               f.Iiiilillil = var4;
            }
         }
      }

      if (iiIIilllil) {
         this.IiIilliIil(f);
      } else {
         this.llIlilllil = null;
      }

   }

   public void iiiIlIIIll(Collection<class_2338> source, String cells) {
      this.Ilillllill();
      this.Iillllilll().iIlIlllllill();
      this.iiiIilllil = cells;
      this.iliIilllil = true;
      this.lliIilllil.clear();
      if (source != null) {
         for(class_2338 var4 : source) {
            this.lliIilllil.add(var4.method_10062());
         }
      }

      this.IiiIilllil = this.lliIilllil.isEmpty();
      this.liiIilllil = false;
      this.lllllillll();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) << 11 | (char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) >>> 5))) ^ 5900) ^ var5) << 7 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) << 11 | (char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) >>> 5))) ^ 5900) ^ var5) >>> 9) << 7 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) << 11 | (char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) >>> 5))) ^ 5900) ^ var5) << 7 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) << 11 | (char)(-((char)((char)((char)(var4[var5] - var5) - var5) ^ 9156))) >>> 5))) ^ 5900) ^ var5) >>> 9) >>> 9) - 9317))) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Ilillllill() {
      if (this.iIlIilllil != null && this.iIlIilllil.liiiIIllIl()) {
         this.iIlIilllil.lilIliilIl();
      }

      this.IllIilllil = false;
   }

   private void lIilliIill() {
      this.iilllIIill();
      iIiIlIliIl var1 = this.Iillllilll();
      if (!var1.liiiIIllIl() || Iiiilllliiilll.field_1687 == this.lllIilllil && Iiiilllliiilll.field_1724 == this.illIilllil && Iiiilllliiilll.field_1724.method_5805()) {
         if (!var1.liiiIIllIl()) {
            if (this.IllIilllil) {
               this.IllIilllil = false;
               boolean var3 = var1.IliIlllilIi() == lilIIliiilIIli.IIiIliiiilIiIliiii;
               if (this.iliIilllil) {
                  this.iIlllIllll(!var3);
               } else if (var3 && this.ilIIilllil.Iilllilliill()) {
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
               }

               this.IIillIiliIil(false);
            } else if (this.IliIilllil) {
               this.ilillIiill();
               this.lIlIilllil.IliIlllilIi(new class_2338(this.IilIilllil, this.lilIilllil, this.iilIilllil), new class_2338(this.IIiIilllil, this.lIiIilllil, this.iIiIilllil));
               if (this.iliIilllil) {
                  this.lIlIilllil.iIlIlllllill(this.lliIilllil);
               } else {
                  this.lIlIilllil.IilliliilIIi();
               }

               String var2 = var1.llIIlilIIl();
               if (var2 != null) {
                  this.liilliiill(IliIlllilIi<invokedynamic>() + var2);
                  this.iIlllIllll(true);
                  this.IIillIiliIil(false);
               } else {
                  this.IllIilllil = true;
                  this.lllIilllil = Iiiilllliiilll.field_1687;
                  this.illIilllil = Iiiilllliiilll.field_1724;
               }
            }
         } else if (this.llIIilllil.Iilllilliill() && Iiiilllliiilll.field_1755 != null) {
            var1.IiiIlliiIl();
         } else {
            var1.lliIliliIl();
         }
      } else {
         var1.lilIliilIl();
         this.IllIilllil = false;
         this.liilliiill(IliIlllilIi<invokedynamic>());
         this.iIlllIllll(true);
         this.IIillIiliIil(false);
      }
   }

   public void lIIlliIIll(String source) {
      if (this.iliIilllil && (this.iiiIilllil == null || this.iiiIilllil.equals(source))) {
         this.Ilillllill();
         this.lIlIilllil.IilliliilIIi();
         this.Iillllilll().iIlIlllllill();
         this.iliIilllil = false;
         this.IiiIilllil = false;
         this.liiIilllil = false;
         this.iiiIilllil = null;
         this.lliIilllil.clear();
         this.iIiilIliil();
      }
   }

   private static int[] lliililiil(String s) {
      if (s == null) {
         return null;
      } else {
         String[] var1 = s.trim().replace(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()).split(IliIlllilIi<invokedynamic>());
         if (var1.length != ((--602496691 + -59 >>> 17 | --602496691 + -59 << 15) ^ -45 ^ 1355017764)) {
            return null;
         } else {
            try {
               return new int[]{Integer.parseInt(var1[0]), Integer.parseInt(var1[1]), Integer.parseInt(var1[2])};
            } catch (NumberFormatException var3) {
               return null;
            }
         }
      }
   }

   private void iIiilIliil() {
      int[] var1 = lliililiil(this.iIlillllil.Iilllilliill());
      int[] var2 = lliililiil(this.lllillllil.Iilllilliill());
      this.IliIilllil = var1 != null && var2 != null;
      if (this.IliIilllil) {
         this.IilIilllil = Math.min(var1[0], var2[0]);
         this.IIiIilllil = Math.max(var1[0], var2[0]);
         this.lilIilllil = Math.min(var1[1], var2[1]);
         this.lIiIilllil = Math.max(var1[1], var2[1]);
         this.iilIilllil = Math.min(var1[2], var2[2]);
         this.iIiIilllil = Math.max(var1[2], var2[2]);
      }
   }

   private void llIililIil(IiiIIiilliiIIiil plan, iIiiiIIlIliiiIIl f) {
      long var16 = -9148204812385270313L;
      long var18 = 2727330678900732380L;
      long var12 = -3084893573839547991L;
      long var14 = -3323577626923321034L;
      var12 ^= ((long)f.IiIlliIliiIl() << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)f.Iiilliiliiil() ^ var12) & -1L >>> 32;
      long var5 = (((long)f.iiIIlIIlIl() * (7442685556297008003L ^ 7442685556297012096L) + (long)f.IllIllllIl()) * (-9085220896879305640L ^ -9085220896880009701L) + (long)((int)(var12 >>> 32))) * (-2783436121980460629L ^ -2783436121981164598L) + (long)((int)var12);
      if (f != this.lIIlilllil || var5 != this.iIIlilllil) {
         this.lIIlilllil = f;
         this.iIIlilllil = var5;
         this.IlIlilllil = f.Ililllililil().method_10264();
      }

      var14 ^= ((long)Math.max((int)var12 - 1, f.llIIlilIIl()) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)Math.min((int)var12 + 1, f.IiIIlliIIl()) ^ var14) & -1L >>> 32;
      var16 ^= ((long)Math.max(this.IlIlilllil - 1, this.lIlIilllil.IiIlliIliiIl()) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)Math.min(this.IlIlilllil + 1, this.lIlIilllil.Iilllilliill()) ^ var16) & -1L >>> 32;
      if ((int)(var14 >>> 32) <= (int)var14 && (int)(var16 >>> 32) <= (int)var16) {
         var18 ^= ((long)(f.lIIlllilIl == class_2351.field_11048 ? 1 : 0) << 32 ^ var18) & -1L << 32;
         if ((int)(var18 >>> 32) != 0) {
            plan.iIlIlllllill((int)(var12 >>> 32), (int)(var16 >>> 32), (int)(var14 >>> 32), (int)(var12 >>> 32), (int)var16, (int)var14);
         } else {
            plan.iIlIlllllill((int)(var14 >>> 32), (int)(var16 >>> 32), (int)(var12 >>> 32), (int)var14, (int)var16, (int)(var12 >>> 32));
         }

         plan.IilliliilIIi((int)(var18 >>> 32) != 0 ? 0 : 2, f.IlIlllIlilIl(), 4, f.IIIIllIIIl(), f.iIIIlIlIIl());
      }
   }

   public iiliililIIiiilil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IIiillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lIiillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iIiillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.Iliillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lliillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iliillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.Iiiillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.liiillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iiiillllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IIIIilllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lIIIilllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iIIIilllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlIIilllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.llIIilllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.ilIIilllil.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIlillllil, this.lllillllil, this.illillllil, this.Iilillllil, this.lilillllil, this.iilillllil, this.IIiillllil, this.lIiillllil, this.iIiillllil, this.Iliillllil, this.lliillllil, this.iliillllil, this.Iiiillllil, this.liiillllil, this.iiiillllil, this.IIIIilllil, this.lIIIilllil, this.iIIIilllil, this.IlIIilllil, this.llIIilllil, this.ilIIilllil, new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.lIiillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.iIiillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.Iliillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.iliillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.Iiiillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.lliillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.liiillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.iiiillllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.IIIIilllil), new iiIliIllIIlliIll(IliIlllilIi<invokedynamic>(), this.lIIIilllil)});
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      this.iIIilIlIil(this.IIIlilllil.IliIlllilIi());
      this.IIIlilllil.liiiIIllIl(true, event.liiiiIIiiiiiiIIi);
   }

   public boolean liIlliiIll() {
      return this.iliIilllil && this.IiiIilllil && this.liiIilllil;
   }

   public boolean IlIllllIll() {
      return this.iliIilllil;
   }

   private void iilllIIill() {
      this.IIlIilllil.lIliIIiliiIliIIili = this.lIiillllil.Iilllilliill();
      this.IIlIilllil.IlliIIilillliIIili = this.iIiillllil.Iilllilliill();
      this.IIlIilllil.iIiiIIiliIliiIIili = this.Iliillllil.Iilllilliill();
      this.IIlIilllil.illiIIiliIiliIIili = this.iliillllil.Iilllilliill();
      this.IIlIilllil.liliIIiliiiliIIili = this.Iiiillllil.Iilllilliill();
      this.IIlIilllil.IIiiIIililIiiIIili = this.lliillllil.Iilllilliill();
      this.IIlIilllil.lliiIIiliiliiIIili = this.liiillllil.Iilllilliill();
      this.IIlIilllil.IiiiIIililiiiIIili = this.iiiillllil.Iilllilliill();
      this.IIlIilllil.iiiiIIiliIIIIlIili = this.IIIIilllil.Iilllilliill();
      this.IIlIilllil.lIIIlIiliiIIIlIili = this.lIIIilllil.Iilllilliill();
      this.IIlIilllil.IlIIlIilillIIlIili = this.IIiillllil.Iilllilliill();
      this.IIlIilllil.ilIIlIiliIiIIlIili = this.iliIilllil;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 9815) + var5))) ^ 26069))))))) ^ var5) - var5) << 12 | (char)((char)((char)(-((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ 9815) + var5))) ^ 26069))))))) ^ var5) - var5) >>> 4) + '輸') ^ var5) - '\ue455'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      if (this.iliIilllil) {
         this.lllllillll();
      } else {
         this.iIiilIliil();
      }

      if (!this.IliIilllil && !this.iliIilllil) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      }

      this.IllIilllil = false;
   }

   private void ilillIiill() {
      Iiiilllliiilll.field_1690.field_1894.method_23481(false);
      illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1867, false);
      illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1832, false);
      Iiiilllliiilll.field_1690.field_1903.method_23481(false);
      Iiiilllliiilll.field_1690.field_1904.method_23481(false);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         if (!this.iliIilllil || !this.IiiIilllil) {
            this.lIilliIill();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) << 14) ^ '\ud8f4') - 20913))) + 24714) ^ var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) << 14) ^ '\ud8f4') - 20913))) + 24714) ^ var5) << 2) ^ var5) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) << 14) ^ '\ud8f4') - 20913))) + 24714) ^ var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) >>> 2 | (char)((char)((char)((char)(var4[var5] + var5) + var5) << 8 | (char)((char)(var4[var5] + var5) + var5) >>> 8) ^ var5) << 14) ^ '\ud8f4') - 20913))) + 24714) ^ var5) << 2) ^ var5) << 10) - '\ue8d2') ^ var5) + '\uf73f') - 20958));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lililiilil(int looking, boolean which) {
      if (Iiiilllliiilll.field_1724 != null) {
         label45: {
            class_2338 var3 = Iiiilllliiilll.field_1724.method_24515();
            if (which) {
               class_239 var5 = Iiiilllliiilll.field_1765;
               if (!(var5 instanceof class_3965)) {
                  break label45;
               }

               class_3965 var4 = (class_3965)var5;
               if (var4.method_17783() != class_240.field_1332) {
                  break label45;
               }

               var3 = var4.method_17777();
            }

            String var6 = var3.method_10263() + IliIlllilIi<invokedynamic>() + var3.method_10264() + IliIlllilIi<invokedynamic>() + var3.method_10260();
            if (looking == (-(~1624395272 * -1556147571) * -33 ^ 1650705514)) {
               this.iIlillllil.IIillIiliIil(var6);
            } else {
               this.lllillllil.IIillIiliIil(var6);
            }

            iiiIIIlIIIlIIl.IilliliilIIi();
            if (!this.iliIilllil) {
               this.iIiilIliil();
            }

            if (this.IliIilllil && !this.iliIilllil) {
               Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + (long)this.IIiillIiil() + IliIlllilIi<invokedynamic>(), true);
            } else {
               Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + looking + IliIlllilIi<invokedynamic>(), true);
            }

            return;
         }

         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      }
   }

   private void lllllillll() {
      this.IliIilllil = !this.lliIilllil.isEmpty();
      if (this.IliIilllil) {
         this.IilIilllil = this.lilIilllil = this.iilIilllil = Integer.MAX_VALUE;
         this.IIiIilllil = this.lIiIilllil = this.iIiIilllil = Integer.MIN_VALUE;

         for(class_2338 var2 : this.lliIilllil) {
            this.IilIilllil = Math.min(this.IilIilllil, var2.method_10263());
            this.lilIilllil = Math.min(this.lilIilllil, var2.method_10264());
            this.iilIilllil = Math.min(this.iilIilllil, var2.method_10260());
            this.IIiIilllil = Math.max(this.IIiIilllil, var2.method_10263());
            this.lIiIilllil = Math.max(this.lIiIilllil, var2.method_10264());
            this.iIiIilllil = Math.max(this.iIiIilllil, var2.method_10260());
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6539414559657919996L ^ Long.rotateLeft(-4010321834507528814L, 52) ^ 6551671595608753250L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1451573127493983715L ^ Long.rotateLeft(-33642248153686655L, 41) ^ -1021031634298904024L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5384924711245403447L ^ Long.rotateLeft(-208837867221528616L, 10) ^ -4370682882575256247L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -868235130112561270L ^ Long.rotateLeft(551926571839176962L, 25) ^ 5659291180504379650L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6610327808067208396L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5128683061787629401L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2283786293430841589L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4237474691462396139L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1382322825397075218L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1147387826932879203L;
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

   private void iIlllIllll(boolean failed) {
      if (this.iliIilllil) {
         this.IiiIilllil = true;
         this.liiIilllil = failed;
      }
   }

   public boolean ilIllIiIll(String source) {
      return this.iliIilllil && this.IiiIilllil && (this.iiiIilllil == null || this.iiiIilllil.equals(source));
   }

   protected void Iilililiiili() {
      this.Ilillllill();
      this.ilillIiill();
      if (Iiiilllliiilll.field_1761 != null) {
         Iiiilllliiilll.field_1761.method_2925();
      }

   }

   private void IiIilliIil(IiiIIiilliiIIiil f) {
      if (Iiiilllliiilll.field_1724 != null) {
         if (this.llIlilllil == null) {
            class_2338 var2 = Iiiilllliiilll.field_1724.method_24515();
            class_2350 var3 = Iiiilllliiilll.field_1724.method_5735();
            class_2350 var4 = var3.method_10170();
            ArrayList var5 = new ArrayList();
            class_2338 var6 = var2;

            for(int var7 = 0; var7 < 6; ++var7) {
               var5.add(var6 = var6.method_10093(var3));
            }

            for(int var8 = 0; var8 < 4; ++var8) {
               var5.add(var6 = var6.method_10093(var4));
            }

            this.llIlilllil = var5;
            this.ilIlilllil = var6;
         }

         f.IlIilillil = true;
         f.Iiiilillil = this.llIlilllil;
         f.liiilillil = this.ilIlilllil;
         f.iiiilillil = true;
      }
   }

   private iIiIlIliIl Iillllilll() {
      if (this.iIlIilllil == null) {
         this.iIlIilllil = new iIiIlIliIl(Iiiilllliiilll, this.IIlIilllil, this.lIlIilllil);
      }

      return this.iIlIilllil;
   }

   public String Illillllil() {
      return this.iIlIilllil == null ? IliIlllilIi<invokedynamic>() : this.iIlIilllil.Iilililiiili();
   }

   public void IIIillIIil(illlllIillll event) {
      this.IIIlilllil.liiiIIllIl(false, event.liiiiIIiiiiiiIIi);
   }

   private double IIiillIiil() {
      return (double)(this.IIiIilllil - this.IilIilllil + 1) * (double)(this.lIiIilllil - this.lilIilllil + 1) * (double)(this.iIiIilllil - this.iilIilllil + 1);
   }

   public String lIliliIlil() {
      return this.iIlIilllil == null ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + this.iIlIilllil.IliIlllilIi() + IliIlllilIi<invokedynamic>() + this.iIlIilllil.IIillIiliIil() + (this.iIlIilllil.liiiIIllIl() ? IliIlllilIi<invokedynamic>() + this.iIlIilllil.Illillliilli() : "");
   }

   private void liilliiill(String msg) {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(msg), false);
      }

   }

   public boolean IIllllIlll() {
      return this.IliIlllilIi() && this.iIlIilllil != null && this.iIlIilllil.Ililllililil();
   }

   public static void iiIilIIlil(boolean on) {
      iiIIilllil = on;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - '豼') ^ var5) - var5))) + 32627) + '탃') - var5) + var5) - 2318) - '\uf3bc') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 22204) + 8245) + '胁') - var5) ^ var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - 22204) + 8245) + '胁') - var5) ^ var5) << 15) - '苴') ^ '螵'))) + 14390) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void illilIilil(String spec) {
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(iiliililIIiiilil.class);
      if (var2 instanceof iiliililIIiiilil var1) {
         if (Iiiilllliiilll.field_1724 != null) {
            String[] var11 = spec.trim().split(IliIlllilIi<invokedynamic>());
            if (var11.length != 6) {
               return;
            }

            class_2338 var3 = Iiiilllliiilll.field_1724.method_24515();
            int[] var4 = new int[]{var3.method_10263(), var3.method_10264(), var3.method_10260(), var3.method_10263(), var3.method_10264(), var3.method_10260()};
            int[] var5 = new int[6];

            for(int var6 = 0; var6 < 6; ++var6) {
               String var7 = var11[var6];
               boolean var8 = var7.startsWith(IliIlllilIi<invokedynamic>());
               String var9 = var8 ? var7.substring(1) : var7;
               int var10 = var9.isEmpty() ? 0 : Integer.parseInt(var9);
               var5[var6] = var8 ? var4[var6] + var10 : var10;
            }

            var1.iIlillllil.IIillIiliIil(var5[0] + IliIlllilIi<invokedynamic>() + var5[1] + IliIlllilIi<invokedynamic>() + var5[2]);
            var1.lllillllil.IIillIiliIil(var5[3] + IliIlllilIi<invokedynamic>() + var5[4] + IliIlllilIi<invokedynamic>() + var5[5]);
            if (!var1.iliIilllil) {
               var1.iIiilIliil();
            }

            return;
         }
      }

   }
}
