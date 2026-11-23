package gg.corz;

import [Ljava.lang.String;;
import java.awt.Color;
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
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public class iIlllIllll {
   private static final int ililIilIiilIil = 6;
   private static final int illiIilIiliIil = 34;
   private final List<lIiiIiIiiIiiIiIi> lillliliilllil;
   private double Iililillililil;
   private float iIlililIllilil;
   private static final int liilIiliiilIil = 24;
   private String[] lIiililiIiilil;
   private final llliiIllilliiIll lIllliliIlllil;
   private static final int liliIiliiliIil = 7;
   private static final float llllIililllIil = 5.0F;
   private static final float llIiIililIiIil = 14.0F;
   private static final String[] iiIIIilIIlIIil;
   private static final float iIllIilIlllIil = 10.0F;
   private static final class_2960 liIIliliiIIlil;
   private static final long iIIllilIlIllil = 2500L;
   private float liiililiiiilil;
   private static final int lliIIililiIIil = 4;
   private final Iiliililliliilil iiIllilIIlllil;
   private static final long llIllililIllil = 300L;
   private iIiiilIiIliiilIi IIillillIillil;
   private IIIIlilllIIIlill ilIililIiIilil;
   private static final float ilIlIilIiIlIil = 0.5F;
   private static final int iiIiIilIIliIil = 92;
   private static final float IiIiIilliIiIil = 4.0F;
   private final IIllIIIllIllIIIl llillililillil;
   private static final int lIilIiliIilIil = 24;
   private static final int IlliIilllliIil = 2;
   private static final String lIiIliliIiIlil = "lock:season";
   private long IIIIiillIIIiil;
   private static final float iilIlilIIiIlil = 5.0F;
   private static final float IilIlillilIlil = 5.0F;
   private static final float IIiiIillIiiIil = 4.0F;
   private static final float IlIlIilllIlIil = 11.0F;
   private static final int lilIIiliilIIil = 3;
   private int IlIililllIilil;
   private static final float lliiIililiiIil = 9.0F;
   private static final String[] ilIIlilIiIIlil;
   private static final float lllIlilillIlil = 7.0F;
   private static final float IIIiIillIIiIil = 1.1E8F;
   private static final float iiiiIilIIIIlil = 10.0F;
   private final List<lIiiIiIiiIiiIiIi> illllilIilllil;
   private static final int liIlIiliiIlIil = 16;
   private static final float iIIiIilIlIiIil = 22.0F;
   private int iIIIiilIlIIiil;
   private static final int IllIIillllIIil = 1;
   private double iilililIIiilil;
   private static final float lIIlIiliIIlIil = 18.0F;
   private static final String[] IiIIIilliIIIil;
   private static final float iIiiIilIliiIil = 19.0F;
   private final List<List<lIiiIiIiiIiiIiIi>> Illllillllllil;
   private static final float iIlIlilIllIlil = 2.0F;
   private static final String IIIllillIIllil = "Reset all?";
   private static final String IliIlillliIlil = "lock:tip";
   private int lIIililiIIilil;
   private static final String liiIliliiiIlil = "reset";
   private static final float IIlIlillIlIlil = 8.0F;
   private int iIillilIlillil;
   private static final int lIlIIiliIlIIil = 0;
   private static final int IlilIilllilIil = 16;
   private static final float iillIilIIilIil = 4.0F;
   private int IIlilillIlilil;
   private static final float IIllIillIllIil = 14.0F;
   private int liIililiiIilil;
   private static final float IiiiIilliiiIil = 3.0F;
   private final iIIliiIiIlIliiIi iiillilIIIilil;
   private final iIliililIlliilil Iiillilliillil;
   private static final float iiiIIilIIIlIil = 7.0F;
   private static final float lIIIliliIIIlil = 8.0F;
   private static final int iIiIIilIliIIil = 2;
   private static final String[] IlIIlilllIIlil;
   private static final int lIliIiliIliIil = 6;
   private static final int IiiIIilliiIIil = 36;
   private long lllililillilil;
   private float iliililIiiilil;
   private static final float IillIillillIil = 0.45F;
   private static final int IIiIIillIiIIil = 4;
   private boolean Iliilillliilil;
   private static final int illIIilIilIIil = 2;
   private static final String iliIlilIiiIlil = "tabs";
   private static int IiIllilliIllil;

   public void lIlIliIlIl(double btn, double my, int mx) {
      for(lIiiIiIiiIiiIiIi var7 : this.illllilIilllil) {
         if (var7.lllliIiIIi != null) {
            var7.lllliIiIIi.IIiilIiiiIii(btn, my, mx);
         }
      }

      this.ilIililIiIilil = null;
   }

   private static boolean Illlllllilll(class_332 ctx, float dy) {
      if (dy < 0.001F) {
         return false;
      } else {
         class_4587 var2 = IIIiiIillIIiiIil.liiiIIllIl();
         var2.method_22903();
         var2.method_46416(0.0F, dy, 0.0F);
         ctx.method_51448().pushMatrix();
         ctx.method_51448().translate(0.0F, dy);
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) >>> 1 | (char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) << 15) + var5) ^ var5) - var5) ^ var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) >>> 1 | (char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) << 15) + var5) ^ var5) - var5) ^ var5) ^ var5) << 14) - 14013) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) >>> 1 | (char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) << 15) + var5) ^ var5) - var5) ^ var5) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) >>> 1 | (char)(-((char)(~((char)((char)(var4[var5] ^ var5) << 7 | (char)(var4[var5] ^ var5) >>> 9))))) << 15) + var5) ^ var5) - var5) ^ var5) ^ var5) << 14) - 14013) >>> 8))) + '껛'))) + '\ueea0') + '鎸'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private float IIillIiliIil(class_332 my, int w, float ctx, int x, int top, int mx) {
      long var21 = -2228710505150619563L;
      long var23 = -254939891193520994L;
      long var25 = 2484952489833338968L;
      long var27 = -8000974136502866496L;
      long var29 = 7566180879200319212L;
      long var31 = 8254746213142653219L;
      iiliIillIIiiIill[] var7 = liIliiiliiIliiil.IliIlllilIi();
      var21 ^= ((long)liIliiiliiIliiil.IilliliilIIi() << 32 ^ var21) & -1L << 32;
      float var9 = llilliilililliil.IIIllIIliIIl(ctx);
      var21 ^= ((long)((int)Math.floor((double)(var9 + 0.001F))) ^ var21) & -1L >>> 32;
      var23 ^= ((long)Illlllllilll(my, var9 - (float)((int)var21)) << 32 ^ var23) & -1L << 32;

      try {
         for(var23 ^= (0L ^ var23) & -1L >>> 32; (int)var23 < var7.length; var23 ^= (var23 ^ var23 + (long)1) & -1L >>> 32) {
            long var39 = var25 ^ ((long)((int)var23 % 4) << 32 ^ var25) & -1L << 32;
            var25 = var39 ^ ((long)((int)var23) ^ var39) & -1L >>> 32;
            long var40 = var27 ^ ((long)((int)(var25 >>> 32) == 0 && (int)var23 == var7.length - 1 ? 1 : 0) << 32 ^ var27) & -1L << 32;
            var27 = var40 ^ ((long)llilliilililliil.iIiIlIliIl(w, x, 4, 4, (int)(var25 >>> 32)) ^ var40) & -1L >>> 32;
            long var41 = var29 ^ ((long)((int)(var27 >>> 32) != 0 ? x : llilliilililliil.lliIliliIl(w, x, 4, 4, (int)(var25 >>> 32))) << 32 ^ var29) & -1L << 32;
            var29 = var41 ^ ((long)((int)var21 + (int)var23 / 4 * 38) ^ var41) & -1L >>> 32;
            var31 ^= ((long)((int)var23 == (int)(var21 >>> 32) ? 1 : 0) << 32 ^ var31) & -1L << 32;
            this.Iilllilliill(my, IlIIlilllIIlil[(int)var23], (int)var27, (int)var29, (int)(var29 >>> 32), 34.0F, top, (myx, active) -> this.Ililllililil(my, myx, index, target, cmx, cy, cx, active, mx));
         }
      } finally {
         llilliilililliil.IiIlliIliiIl(my, (boolean)((int)(var23 >>> 32)));
      }

      var23 ^= ((long)((var7.length + 4 - 1) / 4) ^ var23) & -1L >>> 32;
      return (int)var23 == 0 ? 0.0F : (float)((int)var23 * 38 - 4);
   }

   private void iIIIlIlIIl() {
      long var1 = System.currentTimeMillis();
      if (var1 < this.IIIIiillIIIiil) {
         if (var1 < this.IIIIiillIIIiil - 2500L + 300L) {
            return;
         }

         this.IIIIiillIIIiil = 0L;
         IlIIilIlllIIilIl.IliIlllilIi();

         for(lIiiIiIiiIiiIiIi var4 : this.illllilIilllil) {
            IIIIllIIIl(var4);
         }

         IlIIilIlllIIilIl.IilliliilIIi();
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), true);
      } else {
         this.IIIIiillIIIiil = var1 + 2500L;
      }

   }

   private void IIlllIlliIll(int index) {
      this.iIillilIlillil = index;
      IiIllilliIllil = index;
      this.IIIIiillIIIiil = 0L;
   }

   private void Ililllililil(class_332 x, IIllIIIllIllIIIl index, int active, boolean target, int w, int y, int mx, int ctx, int my) {
      long var25 = -8867413386684750100L;
      long var27 = -609000794799750905L;
      iiliIillIIiiIill var10 = liIliiiliiIliiil.IliIlllilIi()[active];
      String var11 = IlIIlilllIIlil[active];
      float var12 = this.Iiillilliillil.IIIllIIliIIl(var11, llilliilililliil.Iliilliiilii((double)ctx, (double)my, (float)w, (float)y, (float)mx, 34.0F));
      float var13 = this.Iiillilliillil.iliIiiliiiii(ilIIlilIiIIlil[active], target ? 1.0F : 0.0F, 9.0F);
      llilliilililliil.illilIilil(x, (float)w, (float)y, (float)mx, 34.0F, var12, 0.0F, var13);
      float var14 = (float)(w + 7);
      float var15 = (float)mx - 14.0F;
      var25 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, 0.55 * (double)var12), -920587, (double)var13) << 32 ^ var25) & -1L << 32;
      llilliilililliil.iiIIlIIlIl(llilliilililliil.IIiilIiiiIii().Iiilliiliiil(var10.iIlIlllllill(), var15 - 10.0F - 4.0F), var14, llilliilililliil.IllIllllIl((float)y + 4.0F, 11.0F, 1.0F), (int)(var25 >>> 32));
      if (var13 > 0.01F) {
         float var17 = var14 + var15 - 10.0F;
         float var18 = (float)y + 4.0F + 0.5F;
         float var19 = 1.0F;
         float var20 = IliiIilliiIi.IilliliilIIi(var13);
         var25 ^= ((long)llilliilililliil.IlIlllIlilIl(x, var17 + 5.0F, var18 + 5.0F, 0.6F + 0.4F * var13) ^ var25) & -1L >>> 32;

         try {
            IIIiiIillIIiiIil.IlIlllIlilIl(x, var17, var18, 10.0F, 10.0F, 5.0F, llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F));
            iiIlilIlIIllilIl.IliIlllilIi(var17 + var19, var18 + var19, 8.0F, 8.0F, gg.corz.lIlIIiliIlIIil.liiiIIllIl(), new Color(llilliilililliil.Iiiiliiiiiii(), true), IIIiiIillIIiiIil.liiiIIllIl());
         } finally {
            llilliilililliil.IiIlliIliiIl(x, (boolean)((int)var25));
            IliiIilliiIi.lIiiIiIlilli(var20);
         }
      }

      float var31 = (float)y + 19.0F;
      int[] var32 = var10.IilliliilIIi();
      var27 ^= ((long)var32.length << 32 ^ var27) & -1L << 32;

      for(long var36 = var27 ^ (0L ^ var27) & -1L >>> 32; (int)var36 < (int)(var36 >>> 32); var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
         float var21 = llilliilililliil.IIIllIIliIIl(var14 + var15 * (float)((int)var36) / (float)((int)(var36 >>> 32)));
         float var22 = llilliilililliil.IIIllIIliIIl(var14 + var15 * (float)((int)var36 + 1) / (float)((int)(var36 >>> 32)));
         float var23 = (int)var36 == 0 ? var21 - 1.0F : var21;
         float var24 = (int)var36 == (int)(var36 >>> 32) - 1 ? var22 + 1.0F : var22;
         IIIiiIillIIiiIil.IIIllIIliIIl(x, var14, var31, var15, 9.0F, 3.0F, IilIIIIililIIIIi.Illlllllilll(-16777216 | var32[(int)var36], -1, 0.1 * (double)var12), var23, var31 - 1.0F, var24 - var23, 11.0F);
      }

      IIIiiIillIIiiIil.Iiilliiliiil(x, var14, var31, var15, 9.0F, 3.0F, IIIiiIillIIiiIil.Illlllllilll(), llilliilililliil.IIIIllIIIl(-1, 0.1F + 0.06F * var12));
      index.iIlIlllllill((float)w, (float)y, (float)mx, 34.0F, () -> {
         liIliiiliiIliiil.iIlIlllllill(var10);
         this.lIllliliIlllil.Iiilliiliiil();
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(ilIllIiIll<invokedynamic>(), var10.iIlIlllllill() + ilIllIiIll<invokedynamic>(), true);
      }, this.Iiillilliillil, var11);
   }

   private void lIiiIiIlilli(int r, lIiiIiIiiIiiIiIi section) {
      ((List)this.Illllillllllil.get(r)).add(section);
      this.illllilIilllil.add(section);
   }

   // $FF: synthetic method
   private static CallSite IIllllIlll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 14376) - 'ꈵ') << 14 | (char)((char)(var4[var5] - 14376) - 'ꈵ') >>> 2) - var5) - var5) + 31215))) + var5) ^ '驪') ^ 'ꮙ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iilililiiili(class_332 color, float ctx, float lit, int y, float x, float scale) {
      long var9 = -3973008401003080412L;
      float var7 = IIIiiIillIIiiIil.Illlllllilll();
      var9 ^= ((long)llilliilililliil.IlIlllIlilIl(color, ctx + 11.0F, lit + 7.0F, scale) << 32 ^ var9) & -1L << 32;
      IIIiiIillIIiiIil.IlIlllIlilIl(color, ctx, lit, 22.0F, 14.0F, 4.0F, llilliilililliil.IIIIllIIIl(-1, 0.22F + 0.3F * x));
      IIIiiIillIIiiIil.IlIlllIlilIl(color, ctx + var7, lit + var7, 22.0F - var7 * 2.0F, 14.0F - var7 * 2.0F, 4.0F - var7, -16118769);
      IIIiiIillIIiiIil.IlIlllIlilIl(color, ctx + var7, lit + var7, 22.0F - var7 * 2.0F, 14.0F - var7 * 2.0F, 4.0F - var7, y);
      llilliilililliil.IiIlliIliiIl(color, (boolean)((int)(var9 >>> 32)));
   }

   private float IIIilIIiiIIi(class_332 ctx, List<lIiiIiIiiIiiIiIi> my, int x, float list, int mx, int top, int w) {
      long var21 = -2304935199749223446L;
      long var23 = 1836585903166455427L;
      long var25 = 2999642832426750018L;
      long var27 = 3492177715174887357L;
      float var8 = list;

      for(var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < my.size(); var21 += 8589934592L) {
         var21 ^= ((long)Math.min(2, my.size() - (int)(var21 >>> 32)) ^ var21) & -1L >>> 32;
         float var11 = 36.0F;

         for(var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
            var11 = Math.max(var11, Iiilliiliiil((lIiiIiIiiIiiIiIi)my.get((int)(var21 >>> 32) + (int)(var23 >>> 32))));
         }

         float var12 = llilliilililliil.IIIllIIliIIl(var8);
         var23 ^= ((long)((int)Math.floor((double)(var12 + 0.001F))) ^ var23) & -1L >>> 32;
         var25 ^= ((long)Illlllllilll(ctx, var12 - (float)((int)var23)) << 32 ^ var25) & -1L << 32;

         try {
            for(var25 ^= (0L ^ var25) & -1L >>> 32; (int)var25 < (int)var21; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
               lIiiIiIiiIiiIiIi var16 = (lIiiIiIiiIiiIiIi)my.get((int)(var21 >>> 32) + (int)var25);
               long var34 = var27 ^ ((long)llilliilililliil.iIiIlIliIl(x, mx, 2, 4, (int)var25) << 32 ^ var27) & -1L << 32;
               var27 = var34 ^ ((long)llilliilililliil.lliIliliIl(x, mx, 2, 4, (int)var25) ^ var34) & -1L >>> 32;
               float var19 = Iiilliiliiil(var16);
               this.Iilllilliill(ctx, var16.lilliIiIIi, (int)(var27 >>> 32), (int)var23, (int)var27, var19, top, (y, target) -> this.IlIillIiilIi(ctx, var16, y, r, my, ctxx, var19, target, w));
            }
         } finally {
            llilliilililliil.IiIlliIliiIl(ctx, (boolean)((int)(var25 >>> 32)));
         }

         var8 += var11 + 4.0F;
      }

      return my.isEmpty() ? 0.0F : var8 - 4.0F - list;
   }

   private void llIIlilIIl(double mx) {
      if (this.ilIililIiIilil != null && this.IIlilillIlilil > 0) {
         double var3 = Math.max((double)0.0F, Math.min((double)1.0F, (mx - (double)this.liIililiiIilil) / (double)this.IIlilillIlilil));
         this.ilIililIiIilil.IIillIiliIil(this.ilIililIiIilil.Ililllililil() + var3 * (this.ilIililIiIilil.Iiilliiliiil() - this.ilIililIiIilil.Ililllililil()));
         iiiIIIlIIIlIIl.liiiIIllIl();
         IlIIilIlllIIilIl.IilliliilIIi();
      }
   }

   private void Illillliilli(class_332 my, IIllIIIllIllIIIl ctx, lIiiIiIiiIiiIiIi w, int r, int y, int labelY, float target, int mx, int x) {
      long var25 = -1560527591439890542L;
      long var27 = -3060477009726295263L;
      long var29 = 4469504944823968098L;
      long var31 = 8650301320577148959L;
      IIIIlilllIIIlill var10 = (IIIIlilllIIIlill)w.IllliIiIIi;
      var25 ^= ((long)(r + 8) << 32 ^ var25) & -1L << 32;
      var25 ^= ((long)(labelY - 16) ^ var25) & -1L >>> 32;
      var27 ^= ((long)((int)(var25 >>> 32) - 6) << 32 ^ var27) & -1L << 32;
      var27 ^= ((long)(y + 16) ^ var27) & -1L >>> 32;
      var29 ^= ((long)((int)var25 + 12) << 32 ^ var29) & -1L << 32;
      var29 ^= (20L ^ var29) & -1L >>> 32;
      var31 ^= ((long)(this.ilIililIiIilil == var10 ? 1 : 0) << 32 ^ var31) & -1L << 32;
      float var18 = this.Iiillilliillil.IIIllIIliIIl(w.iilliIiIIi, (int)(var31 >>> 32) != 0 || llilliilililliil.Iliilliiilii((double)mx, (double)x, (float)((int)(var27 >>> 32)), (float)((int)var27), (float)((int)(var29 >>> 32)), (float)((int)var29)));
      double var19 = var10.Iiilliiliiil() - var10.Ililllililil();
      float var21 = (float)var10.Iilllilliill();
      float var22;
      if ((int)(var31 >>> 32) != 0) {
         float var23 = llilliilililliil.liiiIIllIl((float)(System.nanoTime() - this.lllililillilil) / 1.1E8F);
         var22 = var23 >= 1.0F ? var21 : this.iIlililIllilil + (var21 - this.iIlililIllilil) * var23;
         this.Iiillilliillil.IiIlliIliiIl(w.iIiliIiIIi, var22);
      } else {
         var22 = this.Iiillilliillil.iliIiiliiiii(w.iIiliIiIIi, var21, 12.0F);
      }

      float var33 = var19 <= (double)0.0F ? 0.0F : (float)(((double)var22 - var10.Ililllililil()) / var19);
      llilliilililliil.ilIllIiIll(my, (float)((int)(var25 >>> 32)), (float)(y + 24), (float)((int)var25), var33, var18);
      String var24 = w.IilliIiIIi ? Math.round(var22 * 100.0F) + ilIllIiIll<invokedynamic>() : String.format(Locale.ROOT, ilIllIiIll<invokedynamic>(), var22);
      llilliilililliil.iiIIlIIlIl(var24, llilliilililliil.IIIllIIliIIl((float)(r + labelY - 8) - llilliilililliil.llIIlilIIl(var24)), target, IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var18));
      ctx.liiiIIllIl((float)((int)(var27 >>> 32)), (float)((int)var27), (float)((int)(var29 >>> 32)), (float)((int)var29), () -> {
         this.ilIililIiIilil = var10;
         this.liIililiiIilil = trackW;
         this.IIlilillIlilil = r;
         this.iIlililIllilil = this.Iiillilliillil.IlIlllIlilIl(w.iIiliIiIIi);
         this.lllililillilil = System.nanoTime();
         this.llIIlilIIl(this.Iililillililil);
      });
   }

   private void IlIillIiilIi(class_332 r, lIiiIiIiiIiiIiIi y, IIllIIIllIllIIIl w, int h, int mx, int my, float target, int ctx, int x) {
      long var21 = 6136793373296656492L;
      IIliiIlllIliiIll var10 = llilliilililliil.IIiilIiiiIii();
      float var11 = this.Iiillilliillil.IIIllIIliIIl(y.lilliIiIIi, llilliilililliil.Iliilliiilii((double)ctx, (double)x, (float)h, (float)mx, (float)my, target));
      float var12 = (float)(h + my - 8);
      float var13 = (float)mx + 10.0F;
      float var14 = (float)(h + 8);
      float var15 = llilliilililliil.IllIllllIl((float)mx + 7.0F, 11.0F, 1.0F);
      float var10000;
      switch (y.IIlliIiIIi.ordinal()) {
         case 0:
            iiIiiilIIliiil var24 = (iiIiiilIIliiil)y.IllliIiIIi;
            float var26 = this.Iiillilliillil.iliIiiliiiii(y.IIiliIiIIi, var24.Iilllilliill() ? 1.0F : 0.0F, 16.0F);
            llilliilililliil.illilIilil(r, (float)h, (float)mx, (float)my, target, var11, this.Iiillilliillil.iliIiiliiiii(y.lIiliIiIIi, 0.0F, 10.0F), var26);
            iIiIIlIiIliIIlIi.iliIiiliiiii(r, h + my, mx, 36, 8, (double)var26, (double)var11);
            w.iIlIlllllill((float)h, (float)mx, (float)my, 36.0F, () -> {
               this.Iiillilliillil.IiIlliIliiIl(y.lIiliIiIIi, 1.0F);
               var24.Ililllililil();
               IlIIilIlllIIilIl.IilliliilIIi();
            }, this.Iiillilliillil, y.lilliIiIIi);
            var10000 = var12 - 22.0F;
            break;
         case 1:
            lliliIIiililiIIi var23 = (lliliIIiililiIIi)y.IllliIiIIi;
            llilliilililliil.illilIilil(r, (float)h, (float)mx, (float)my, target, var11 * 0.5F, 0.0F, 0.0F);
            var21 ^= ((long)(var23 == this.iiIllilIIlllil.iIIillllil && !iIiiilIiIliiilIi.lIiiIiIlilli() ? var23.IiIiliIiiiIi().indexOf(ilIllIiIll<invokedynamic>()) : -1) << 32 ^ var21) & -1L << 32;
            String[] var28 = (int)(var21 >>> 32) < 0 ? y.illliIiIIi : this.IiIiliIiiiIi(y.illliIiIIi, (int)(var21 >>> 32));
            float var20 = llilliilililliil.lIIlliIIll(r, w, this.Iiillilliillil, y.iilliIiIIi, var28, var23.Ililllililil(), var12, var13, 16.0F, ctx, x, (index) -> {
               if (index != s) {
                  var23.Iiilliiliiil(index);
                  IlIIilIlllIIilIl.IilliliilIIi();
               }
            });
            if ((int)(var21 >>> 32) >= 0) {
               this.IIlilIliiIli(var28, (int)(var21 >>> 32), var20, var13, ctx, x);
            }

            var10000 = var20;
            break;
         case 2:
            llilliilililliil.illilIilil(r, (float)h, (float)mx, (float)my, target, var11 * 0.5F, 0.0F, 0.0F);
            this.Illillliilli(r, w, y, h, mx, my, var15, ctx, x);
            var10000 = var12 - 24.0F;
            break;
         case 3:
            llilliilililliil.illilIilil(r, (float)h, (float)mx, (float)my, target, var11 * 0.5F, 0.0F, 0.0F);
            float var17 = var12 - 22.0F;
            float var18 = (float)mx + 11.0F;
            float var19 = Math.max(this.Iiillilliillil.IIIllIIliIIl(y.iilliIiIIi, llilliilililliil.Iliilliiilii((double)ctx, (double)x, (float)h, (float)mx, (float)my, 36.0F)), y.liiliIiIIi);
            this.Iilililiiili(r, var17, var18, y.lllliIiIIi.liiiIIllIl(), var19, this.Iiillilliillil.IilliliilIIi(y.iilliIiIIi, 0.07F));
            w.iIlIlllllill((float)h, (float)mx, (float)my, 36.0F, () -> {
               y.IiiliIiIIi = !y.IiiliIiIIi;
               if (y.IiiliIiIIi) {
                  y.lllliIiIIi.Iiilliiliiil();
               }

            }, this.Iiillilliillil, y.iilliIiIIi);
            if (y.liiliIiIIi > 0.004F) {
               this.IIiilIiiiIii(r, w, y, h, mx, my, target);
            }

            var10000 = var17;
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      float var16 = var10000;
      float var25 = var16 - 5.0F - 14.0F;
      float var27 = y.IIlliIiIIi == llIillililIillil.IilliiiIil ? (float)mx + 7.0F + -1.5F : (float)mx + 11.0F;
      this.Iliilliiilii(r, w, y, var25, var27, var11, ctx, x);
      float var29 = var25 - 4.0F - var14;
      llilliilililliil.iiIIlIIlIl(var10.Iiilliiliiil(y.lIlliIiIIi, var29), var14, var15, -920587);
      if (y.iIlliIiIIi != null) {
         llilliilililliil.lIlIliIlIl(var10.Iiilliiliiil(y.iIlliIiIIi, var29 / 0.82F), var14, llilliilililliil.IllIllllIl((float)mx + 18.0F, 11.0F, 0.82F), 0.82F, -7630437);
      }

   }

   public boolean IIIllIIliIIl() {
      return false;
   }

   private static void IIIIllIIIl(lIiiIiIiiIiiIiIi r) {
      IilliIllilliIl var1 = r.IllliIiIIi;
      if (var1 instanceof iiIiiilIIliiil var2) {
         var2.IIillIiliIil(var2.Iiilliiliiil());
      } else if (var1 instanceof lliliIIiililiIIi var3) {
         var3.Iiilliiliiil(var3.IIIilIIiiIIi());
      } else if (var1 instanceof IIIIlilllIIIlill var4) {
         var4.IIillIiliIil(var4.IIIilIIiiIIi());
         iiiIIIlIIIlIIl.liiiIIllIl();
      } else if (var1 instanceof iliiliilIiiiliil var5) {
         var5.IIillIiliIil(var5.Ililllililil());
         r.lllliIiIIi.Iiilliiliiil();
      }

   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - '\uda9b') ^ var5))) >>> 7 | (char)(-((char)((char)((char)(var4[var5] - var5) - '\uda9b') ^ var5))) << 9) + '폆') + var5) - '\ue3c2'))))) ^ var5) - 19417));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iillllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) << 8) ^ var5) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) << 8) ^ var5) >>> 3) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) << 8) ^ var5) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) >>> 8 | (char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - var5) ^ '쉼') - var5) + var5) ^ 25800) << 8) ^ var5) >>> 3) << 4) - var5) ^ '궦') ^ var5) - 8224) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iilllilliill(class_332 id, String body, int h, int y, int x, float ctx, int w, lIIIlIliIIIlIl mx) {
      long var19 = -6338995923051428001L;
      iIIliiIiIlIliiIi var9 = this.iiillilIIIilil.lIiiIiIlilli(this.IlIililllIilil++);
      if (!var9.iliIiiliiiii()) {
         float var10 = var9.IiilIIIlIi;
         float var11 = var9.liilIIIlIi;
         IIllIIIllIllIIIl var12 = var9.lIIiIIIlIi ? this.llillililillil : IIllIIIllIllIIIl.ililiiIlIl;
         var19 ^= ((long)(var9.IIIiIIIlIi ? w : h - 4000) << 32 ^ var19) & -1L << 32;
         var19 ^= ((long)llilliilililliil.IlIlllIlilIl(id, (float)h + (float)x / 2.0F, (float)y + Math.min(ctx, 36.0F) / 2.0F, var9.iiilIIIlIi * this.Iiillilliillil.IilliliilIIi(body, 0.025F)) ^ var19) & -1L >>> 32;

         try {
            if (var10 > 0.004F) {
               float var15 = IliiIilliiIi.IilliliilIIi(var10);

               try {
                  llilliilililliil.illilIilil(id, (float)h, (float)y, (float)x, ctx, 0.0F, 0.0F, 0.0F);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var15);
               }
            }

            if (var11 > 0.002F) {
               float var33 = IliiIilliiIi.IilliliilIIi(var11);

               try {
                  mx.draw(var12, (int)(var19 >>> 32));
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var33);
               }
            }
         } finally {
            llilliilililliil.IiIlliIliiIl(id, (boolean)((int)var19));
         }

      }
   }

   private void IIlilIliiIli(String[] left, int labels, float my, float idx, int mx, int y) {
      long var13 = -2919731524131961515L;
      float var7 = my + 1.0F;

      for(var13 ^= (0L ^ var13) & -1L << 32; (int)(var13 >>> 32) < labels; var13 += 4294967296L) {
         var7 += (float)Math.ceil((double)llilliilililliil.llIIlilIIl(left[(int)(var13 >>> 32)])) + 12.0F + 1.0F;
      }

      float var8 = (float)Math.ceil((double)llilliilililliil.llIIlilIIl(left[labels])) + 12.0F;
      float var9 = var7 + 6.0F + llilliilililliil.llIIlilIIl(left[labels].trim()) + 2.0F;
      float var10 = idx + 4.0F;
      var13 ^= ((long)llilliilililliil.Iliilliiilii((double)mx, (double)y, var7, idx, var8, 16.0F) ^ var13) & -1L >>> 32;
      float var12 = this.Iiillilliillil.IIIllIIliIIl(ilIllIiIll<invokedynamic>(), (boolean)((int)var13));
      iiIlilIlIIllilIl.IliIlllilIi(var9, var10, 8.0F, 8.0F, liIIliliiIIlil, new Color(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var12), true), IIIiiIillIIiiIil.liiiIIllIl());
      if ((int)var13 != 0) {
         this.Iliilillliilil = true;
         this.iliililIiiilil = var7 + var8 / 2.0F;
         this.liiililiiiilil = idx;
      }

   }

   public void IlIlllIlilIl(class_332 ctx) {
      float var2 = this.Iiillilliillil.iliIiiliiiii(ilIllIiIll<invokedynamic>(), this.Iliilillliilil ? 1.0F : 0.0F, 14.0F);
      if (!(var2 < 0.01F)) {
         String var3 = ilIllIiIll<invokedynamic>();
         float var4 = llilliilililliil.llIIlilIIl(var3) + 14.0F;
         float var5 = 21.0F;
         float var6 = llilliilililliil.IIIllIIliIIl(this.iliililIiiilil - var4 / 2.0F);
         float var7 = llilliilililliil.IIIllIIliIIl(this.liiililiiiilil - var5 - 5.0F);
         float var8 = IliiIilliiIi.IilliliilIIi(var2);

         try {
            IIIiiIillIIiiIil.Ililllililil(ctx, var6, var7, var4, var5, 8.0F, -65990120, llilliilililliil.IIIIllIIIl(-1, 0.09F));
            llilliilililliil.iiIIlIIlIl(var3, var6 + 7.0F, llilliilililliil.IllIllllIl(var7 + 5.0F, 11.0F, 1.0F), -920587);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var8);
         }

      }
   }

   private void Iliilliiilii(class_332 target, IIllIIIllIllIIIl y, lIiiIiIiiIiiIiIi ctx, float my, float cardHover, float r, int mx, int x) {
      long var15 = -4396796324700314409L;
      float var9 = this.Iiillilliillil.IIIllIIliIIl(ctx.lliliIiIIi, llilliilililliil.Iliilliiilii((double)mx, (double)x, my, cardHover, 14.0F, 14.0F));
      float var10 = r * this.Iiillilliillil.iliIiiliiiii(ctx.ililiIiIIi, Iiiiliiiiiii(ctx) ? 1.0F : 0.45F, 12.0F);
      if (var10 > 0.01F) {
         float var11 = 2.0F;
         float var12 = IliiIilliiIi.IilliliilIIi(var10);
         var15 ^= ((long)llilliilililliil.IlIlllIlilIl(target, my + 7.0F, cardHover + 7.0F, this.Iiillilliillil.IilliliilIIi(ctx.lliliIiIIi, 0.07F)) << 32 ^ var15) & -1L << 32;

         try {
            if (var9 > 0.01F) {
               IIIiiIillIIiiIil.IlIlllIlilIl(target, my, cardHover, 14.0F, 14.0F, 4.0F, llilliilililliil.IIIIllIIIl(-1, 0.09F * var9));
            }

            iiIlilIlIIllilIl.IliIlllilIi(my + var11, cardHover + var11, 10.0F, 10.0F, gg.corz.lIlIIiliIlIIil.IIIilIIiiIIi(), new Color(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var9), true), IIIiiIillIIiiIil.liiiIIllIl());
         } finally {
            llilliilililliil.IiIlliIliiIl(target, (boolean)((int)(var15 >>> 32)));
            IliiIilliiIi.lIiiIiIlilli(var12);
         }
      }

      y.iIlIlllllill(my - 1.0F, cardHover - 1.0F, 16.0F, 16.0F, () -> {
         IlIIilIlllIIilIl.IliIlllilIi();
         IIIIllIIIl(ctx);
         IlIIilIlllIIilIl.IilliliilIIi();
      }, this.Iiillilliillil, ctx.lliliIiIIi);
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7530773029058360244L ^ Long.rotateLeft(413633305606389280L, 3) ^ -6329314199797334051L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4802446222252621471L ^ Long.rotateLeft(-7049578782708044685L, 20) ^ -2984133119043376258L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8325326699362036720L ^ Long.rotateLeft(-7254197869699060767L, 47) ^ -189086420853479993L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7246144691139006398L ^ Long.rotateLeft(-8555716570834346874L, 56) ^ 3972188163091190235L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -509806390486122433L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7890664425489786852L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1597847695234727203L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4389471926519333493L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2353160392848309877L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5180946511211647964L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liIlliiIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIllllIlll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIlllIllll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lllllillll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iillllilll<invokedynamic>());
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

   public void IiIlliIliiIl(class_332 my, int mx, int w, int ctx, int x, int top) {
      long var17 = 3629356088016156629L;
      long var15 = -6419016531115489305L;
      if (iIiiilIiIliiilIi.IliIlllilIi() != this.IIillillIillil) {
         this.IliIlllilIi();
      }

      this.llillililillil.IliIlllilIi();
      this.Iliilillliilil = false;
      var15 ^= ((long)this.iiillilIIIilil.iIlIlllllill() << 32 ^ var15) & -1L << 32;
      if ((int)(var15 >>> 32) != 0) {
         this.ilIililIiIilil = null;
         this.IIIIiillIIIiil = 0L;
         this.Iiillilliillil.IiIlliIliiIl(ilIllIiIll<invokedynamic>(), 0.0F);
      }

      if ((int)(var15 >>> 32) != 0 || this.iIillilIlillil != this.lIIililiIIilil) {
         this.iiillilIIIilil.IliIlllilIi();
      }

      this.lIIililiIIilil = this.iIillilIlillil;
      this.IlIililllIilil = 0;

      for(lIiiIiIiiIiiIiIi var9 : this.illllilIilllil) {
         if (var9.IIlliIiIIi == llIillililIillil.lilliiiIil) {
            var9.liiliIiIIi = this.Iiillilliillil.iliIiiliiiii(var9.IliliIiIIi, var9.IiiliIiIIi ? 1.0F : 0.0F, 16.0F);
         }
      }

      float var21 = llilliilililliil.IiiIlliiIl(my, ilIllIiIll<invokedynamic>(), (float)mx, (float)w, 22.0F);
      llilliilililliil.iiiIlIIIll(my, this.llillililillil, this.Iiillilliillil, ilIllIiIll<invokedynamic>(), iiIIIilIIlIIil, this.iIillilIlillil, var21 + 10.0F, (float)w, 22.0F, x, top, this::IIlllIlliIll);
      llilliilililliil.liIlliiIll(my, this.llillililillil, this.Iiillilliillil, ilIllIiIll<invokedynamic>(), gg.corz.lIlIIiliIlIIil.IIIilIIiiIIi(), ilIllIiIll<invokedynamic>(), (float)(mx + ctx), (float)w, 22.0F, x, top, System.currentTimeMillis() < this.IIIIiillIIIiil, this::iIIIlIlIIl);
      float var22 = (float)(w + 22 + 6);
      var15 ^= ((long)(this.iIillilIlillil == 0 ? 1 : 0) ^ var15) & -1L >>> 32;
      var17 ^= (4294967296L ^ var17) & -1L << 32;

      for(long var26 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var26 < IiIIIilliIIIil.length; var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
         if ((int)var15 != 0 || (int)var26 == this.iIillilIlillil - 1) {
            if ((int)var15 != 0) {
               if ((int)(var26 >>> 32) == 0) {
                  var22 += 9.0F;
               }

               var26 ^= (0L ^ var26) & -1L << 32;
               float var13 = IliiIilliiIi.IilliliilIIi(this.iiillilIIIilil.IIIllIIliIIl(this.IlIililllIilil));

               try {
                  llilliilililliil.lllIiillIi(my, IiIIIilliIIIil[(int)var26], (float)mx, llilliilililliil.IIIllIIliIIl(var22), (float)ctx);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var13);
               }

               var22 += 12.0F;
            }

            var22 += (int)var26 == 0 ? this.IIillIiliIil(my, mx, var22, ctx, x, top) : this.IIIilIIiiIIi(my, (List)this.Illllillllllil.get((int)var26), mx, var22, ctx, x, top);
         }
      }

      this.iIIIiilIlIIiil = (int)Math.ceil((double)(var22 - (float)w));
   }

   private void IIiilIiiiIii(class_332 r, IIllIIIllIllIIIl h, lIiiIiIiiIiiIiIi w, int ctx, int x, int y, float target) {
      long var17 = -1574795500267867737L;
      long var19 = -6672010032037442034L;
      long var15 = -7762946374161146400L;
      var15 ^= ((long)(ctx + 8) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(x + 36) ^ var15) & -1L >>> 32;
      var17 ^= ((long)(y - 16) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)((int)var15 - 6) ^ var17) & -1L >>> 32;
      var19 ^= ((long)((int)Math.floor((double)((float)x + target - 2.0F))) << 32 ^ var19) & -1L << 32;
      w.lllliIiIIi.iIlIlllllill((int)(var15 >>> 32), (int)var15, (int)(var17 >>> 32));
      if ((int)(var19 >>> 32) > (int)var17) {
         r.method_44379(ctx, (int)var17, ctx + y, (int)(var19 >>> 32));
         float var13 = IliiIilliiIi.IilliliilIIi(llilliilililliil.IliIlllilIi(w.liiliIiIIi * 1.5F));

         try {
            w.lllliIiIIi.IIIllIIliIIl(r);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var13);
            r.method_44380();
         }
      }

      if (w.IiiliIiIIi && w.liiliIiIIi > 0.3F) {
         h.liiiIIllIl((float)((int)(var15 >>> 32)), (float)((int)var15), (float)((int)(var17 >>> 32)), 84.0F, () -> w.lllliIiIIi.IiIlliIliiIl(this.Iililillililil, this.iilililIIiilil));
      }

   }

   // $FF: synthetic method
   private static CallSite lllllillll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') << 8 | (char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') >>> 8))) + '풾') >>> 2 | (char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') << 8 | (char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') >>> 8))) + '풾') << 14))) - 12055) >>> 6 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') << 8 | (char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') >>> 8))) + '풾') >>> 2 | (char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') << 8 | (char)((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10) + '\ueb73') >>> 8))) + '풾') << 14))) - 12055) << 10))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IilliliilIIi(int percent, String setting, String label, IIIIlilllIIIlill key, boolean section) {
      this.lIiiIiIlilli(percent, new lIiiIiIiiIiiIiIi(setting, llIillililIillil.IilliiiIil, label, (String)null, key, (llliiIllilliiIll)null, section));
   }

   private String[] IiIiliIiiiIi(String[] idx, int options) {
      if (this.lIiililiIiilil == null) {
         String var3;
         for(var3 = ilIllIiIll<invokedynamic>(); llilliilililliil.llIIlilIIl(var3) < 10.0F && var3.length() < 8; var3 = var3 + ilIllIiIll<invokedynamic>()) {
         }

         this.lIiililiIiilil = (String[])((String;)idx).clone();
         this.lIiililiIiilil[options] = idx[options] + var3;
      }

      return this.lIiililiIiilil;
   }

   private void iIlIlllllill(int label, String section, String picker, String desc, iliiliilIiiiliil key, llliiIllilliiIll setting) {
      this.lIiiIiIlilli(label, new lIiiIiIiiIiiIiIi(section, llIillililIillil.lilliiiIil, picker, desc, key, setting, false));
   }

   public void iiIIlIIlIl(double btn, double my, int mx) {
      for(lIiiIiIiiIiiIiIi var7 : this.illllilIilllil) {
         if (var7.lllliIiIIi != null) {
            var7.lllliIiIIi.Iilililiiili(btn, my, mx);
         }
      }

      if (this.ilIililIiIilil != null) {
         this.llIIlilIIl(btn);
      }

   }

   public iIlllIllll(Iiliililliliilil tc) {
      long var3 = -2746386438394939507L;
      super();
      this.Illllillllllil = new ArrayList();
      this.illllilIilllil = new ArrayList();
      this.lillliliilllil = new ArrayList();
      this.llillililillil = new IIllIIIllIllIIIl();
      this.Iiillilliillil = new iIliililIlliilil();
      this.iiillilIIIilil = new iIIliiIiIlIliiIi();
      this.lIIililiIIilil = -1;
      this.IlIililllIilil = 0;
      this.ilIililIiIilil = null;
      this.IIIIiillIIIiil = 0L;
      this.iIIIiilIlIIiil = 200;
      this.iiIllilIIlllil = tc;

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < IiIIIilliIIIil.length; var5 += 4294967296L) {
         this.Illllillllllil.add(new ArrayList());
      }

      this.iIillilIlillil = Math.max(0, Math.min(iiIIIilIIlIIil.length - 1, IiIllilliIllil));
      this.lIllliliIlllil = new llliiIllilliiIll(tc.Iillllllil, 0, 0, 100, 0);
      this.lIllliliIlllil.IliIlllilIi(() -> tc.Iillllllil.Iilllilliill() & -16777216 | IlIIilIlllIIilIl.lliiIlliIl & 16777215);
      this.iIlIlllllill(1, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.Iillllllil, this.lIllliliIlllil);
      this.liiiIIllIl(1, ilIllIiIll<invokedynamic>(), llIillililIillil.illliiiIil, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.lillllllil);
      this.liiiIIllIl(2, ilIllIiIll<invokedynamic>(), llIillililIillil.lllliiiIil, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.iillllllil);
      this.liiiIIllIl(2, ilIllIiIll<invokedynamic>(), llIillililIillil.lllliiiIil, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.IIilllllil);
      this.liiiIIllIl(2, ilIllIiIll<invokedynamic>(), llIillililIillil.illliiiIil, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.iIIillllil);
      this.IliIlllilIi();
      this.liiiIIllIl(3, ilIllIiIll<invokedynamic>(), llIillililIillil.lllliiiIil, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.lIilllllil);
      this.liiiIIllIl(3, ilIllIiIll<invokedynamic>(), llIillililIillil.illliiiIil, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.ililllllil);
      this.iIlIlllllill(3, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.Iiilllllil, new llliiIllilliiIll(tc.Iiilllllil, 0, 0, 100, 0));
      this.iIlIlllllill(3, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.liilllllil, new llliiIllilliiIll(tc.liilllllil, 0, 0, 100, 0));
      this.IilliliilIIi(3, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.iIilllllil, true);
      this.IilliliilIIi(3, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.Ililllllil, true);
      this.IilliliilIIi(3, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.llilllllil, false);
      this.liiiIIllIl(4, ilIllIiIll<invokedynamic>(), llIillililIillil.lllliiiIil, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.iiilllllil);
      this.IilliliilIIi(4, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), tc.IIIillllil, false);
   }

   public boolean IiIIlliIIl(double my, double btn, int mx) {
      if (mx != 0) {
         return false;
      } else {
         this.Iililillililil = my;
         this.iilililIIiilil = btn;
         return this.llillililillil.IilliliilIIi(my, btn);
      }
   }

   private void liiiIIllIl(int label, String setting, llIillililIillil desc, String kind, String section, IilliIllilliIl key) {
      this.lIiiIiIlilli(label, new lIiiIiIiiIiiIiIi(setting, desc, kind, section, key, (llliiIllilliiIll)null, false));
   }

   public int iliIiiliiiii() {
      return this.iIIIiilIlIIiil;
   }

   private static boolean Iiiiliiiiiii(lIiiIiIiiIiiIiIi r) {
      IilliIllilliIl var1 = r.IllliIiIIi;
      if (var1 instanceof iiIiiilIIliiil var5) {
         return var5.Iilllilliill() != var5.Iiilliiliiil();
      } else if (var1 instanceof lliliIIiililiIIi var4) {
         return var4.Ililllililil() != var4.IIIilIIiiIIi();
      } else if (var1 instanceof IIIIlilllIIIlill var3) {
         return Math.abs(var3.Iilllilliill() - var3.IIIilIIiiIIi()) > 1.0E-6;
      } else if (var1 instanceof iliiliilIiiiliil var2) {
         return var2.Iilllilliill() != var2.Ililllililil();
      } else {
         return false;
      }
   }

   static {
      long var1 = 5366912655142564212L;
      IiIIIilliIIIil = new String[]{ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>()};
      iiIIIilIIlIIil = new String[]{ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>()};
      IlIIlilllIIlil = new String[liIliiiliiIliiil.lllillIiil];
      ilIIlilIiIIlil = new String[liIliiiliiIliiil.lllillIiil];
      liIIliliiIIlil = class_2960.method_60655(ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>());

      for(long var3 = var1 ^ (0L ^ var1) & -1L << 32; (int)(var3 >>> 32) < IlIIlilllIIlil.length; var3 += 4294967296L) {
         IlIIlilllIIlil[(int)(var3 >>> 32)] = ilIllIiIll<invokedynamic>() + (int)(var3 >>> 32);
         ilIIlilIiIIlil[(int)(var3 >>> 32)] = ilIllIiIll<invokedynamic>() + (int)(var3 >>> 32);
      }

      IiIllilliIllil = 0;
   }

   private static float Iiilliiliiil(lIiiIiIiiIiiIiIi r) {
      return r.IIlliIiIIi == llIillililIillil.lilliiiIil ? llilliilililliil.IIIllIIliIIl(36.0F + 92.0F * r.liiliIiIIi) : 36.0F;
   }

   private void IliIlllilIi() {
      long var3 = -5926722194368037793L;
      ((List)this.Illllillllllil.get(2)).removeAll(this.lillliliilllil);
      this.illllilIilllil.removeAll(this.lillliliilllil);
      this.lillliliilllil.clear();
      iIiiilIiIliiilIi var1 = iIiiilIiIliiilIi.IliIlllilIi();
      this.IIillillIillil = var1;
      var3 ^= ((long)this.illllilIilllil.size() << 32 ^ var3) & -1L << 32;
      if (var1 == iIiiilIiIliiilIi.lIIIIilIIi) {
         this.liiiIIllIl(2, ilIllIiIll<invokedynamic>(), llIillililIillil.lllliiiIil, lIliIllliIliIlll.iliiiIIill, ilIllIiIll<invokedynamic>(), this.iiIllilIIlllil.lIIillllil);
      } else if (var1 == iIiiilIiIliiilIi.iIIIIilIIi) {
         this.liiiIIllIl(2, ilIllIiIll<invokedynamic>(), llIillililIillil.lllliiiIil, iilIIiIIiIIi.iIiIiliiIliIilii, ilIllIiIll<invokedynamic>(), this.iiIllilIIlllil.IlIillllil);
      }

      if (var1 != iIiiilIiIliiilIi.IIIIIilIIi) {
         this.liiiIIllIl(2, ilIllIiIll<invokedynamic>(), llIillililIillil.lllliiiIil, ilIllIiIll<invokedynamic>(), var1 == iIiiilIiIliiilIi.lIIIIilIIi ? ilIllIiIll<invokedynamic>() : ilIllIiIll<invokedynamic>(), this.iiIllilIIlllil.llIillllil);
         this.IilliliilIIi(2, ilIllIiIll<invokedynamic>(), ilIllIiIll<invokedynamic>(), this.iiIllilIIlllil.ilIillllil, true);
      }

      this.lillliliilllil.addAll(this.illllilIilllil.subList((int)(var3 >>> 32), this.illllilIilllil.size()));
   }
}
