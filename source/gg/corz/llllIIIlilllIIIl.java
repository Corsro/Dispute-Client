package gg.corz;

import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix3x2fStack;

public class llllIIIlilllIIIl {
   private static final float IIIIIIllIl = 10.0F;
   private static final int illIIIllIl = -4000;
   private static final float lIlIIIllIl = 2.5F;
   private static final int lIiiiiIlIl = 24;
   private static final int liliiiIlIl = 2;
   private int ilIlIIllIl;
   private static final String iilIIIllIl = "Corz Radio";
   private IIliliillIliliil[] llllIIllIl = new IIliliillIliliil[0];
   private static final String IIiIIIllIl = "On air";
   private static boolean IlIlIIllIl;
   private static final float IiiiiiIlIl = 35.0F;
   private static final String iIiIIIllIl = "Invalid link";
   private static final float lliiiiIlIl = 6.0F;
   private float lillIIllIl = -1.0F;
   private static final float[] IIIlIIllIl = new float[48];
   private static final float iiiiiiIlIl = 11.0F;
   private static final float lIIIIIllIl = 7.0F;
   public static final int illiiiIlIl = 24;
   private boolean IillIIllIl = true;
   private static final float IIlIIIllIl = 1.5F;
   private static final float liIIIIllIl = 1.3F;
   private static final String lIiIIIllIl = "Coming soon";
   private final iIliililIlliilil lIllIIllIl = new iIliililIlliilil();
   private final Runnable IlllIIllIl = this::iliIiiliiiii;
   private static final float iIIIIIllIl = 5.0F;
   private static final int iiiIIIllIl = 24;
   private static final float liiiiiIlIl = 47.0F;
   private final lIiiIiiiIiiIii llIlIIllIl;
   private static final String liiIIIllIl = "reload";
   private static final double[] lllIIIllIl = new double[]{(double)0.0F, 1.9, 4.1};
   private static final float IiIIIIllIl = 2.0F;
   private int iiIlIIllIl;
   private final IIllIIIllIllIIIl IIllIIllIl = new IIllIIIllIllIIIl();
   private int liIlIIllIl;
   private static final float iliiiiIlIl = 19.0F;
   private static final float[] lIIlIIllIl = new float[2];
   private static final float iIlIIIllIl = 8.0F;
   private static final String IiiIIIllIl = "on:";
   private static final int iIiiiiIlIl = 18;
   private static final float IlIIIIllIl = 12.0F;
   private static final String IliIIIllIl = "No playlist yet";
   private int illlIIllIl = -1;
   private static final String iliIIIllIl = "play:";
   private static final double[] IllIIIllIl = new double[]{7.1, 5.3, 8.6};
   private static final int IliiiiIlIl = 116;
   private static final float iiIIIIllIl = 2.0F;
   private static final float ilIIIIllIl = 0.46F;
   private static final float llIIIIllIl = 1.0F;
   private static final int IIiiiiIlIl = 6;
   public static final int IiliiiIlIl = -1;
   private static final String lliIIIllIl = "card:";
   private final iIIliiIiIlIliiIi iIllIIllIl = new iIIliiIiIlIliiIi();
   private static int iIIlIIllIl;
   private static final int iiliiiIlIl = 64;
   private static final String lilIIIllIl = "Staff playlists";
   private static final String IilIIIllIl = "Stations";
   private int IiIlIIllIl;

   private static float IiIlliIliiIl() {
      return 37.5F;
   }

   private void IIillIiliIil(class_332 bx, IIliliillIliliil mx, float my, float ctx, float card, float playable, boolean hover, int by, int on) {
      long var19 = 5737791008591459346L;
      long var21 = 3505930045643595081L;
      long var23 = 6768209395284233350L;
      float var10 = this.lIllIIllIl.IIIllIIliIIl(mx.IlliIIIiil, hover && llilliilililliil.Iliilliiilii((double)by, (double)on, my, ctx, 18.0F, 18.0F));
      float var11 = Math.max(card * 0.55F, var10);
      var19 ^= ((long)llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.92F) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.04 + 0.08 * (double)var11), IilIIIIililIIIIi.Illlllllilll((int)(var19 >>> 32), -1, 0.1 * (double)var10), (double)playable) ^ var19) & -1L >>> 32;
      var21 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, (double)var11), (int)(var19 >>> 32), (double)playable) << 32 ^ var21) & -1L << 32;
      var21 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var11), llilliilililliil.Iiiiliiiiiii(), (double)playable) ^ var21) & -1L >>> 32;
      var23 ^= ((long)llilliilililliil.IlIlllIlilIl(bx, my + 9.0F, ctx + 9.0F, this.lIllIIllIl.IilliliilIIi(mx.IlliIIIiil, 0.07F)) << 32 ^ var23) & -1L << 32;

      try {
         if (playable > 0.01F) {
            IIIiiIillIIiiIil.IiIlliIliiIl(bx, my, ctx, 18.0F, 18.0F, 9.0F, IilIIIIililIIIIi.IIlllIlliIll(0.2 * (double)playable), 4.0F, 0.5F);
         }

         IIIiiIillIIiiIil.Ililllililil(bx, my, ctx, 18.0F, 18.0F, 9.0F, (int)var19, (int)(var21 >>> 32));
         float var17 = 3.0F;
         iiIlilIlIIllilIl.IliIlllilIi(my + var17, ctx + var17, 12.0F, 12.0F, lIlIIiliIlIIil.illIlIilIl(Iilililiiili<invokedynamic>()), new Color((int)var21, true), IIIiiIillIIiiIil.liiiIIllIl());
      } finally {
         llilliilililliil.IiIlliIliiIl(bx, (boolean)((int)(var23 >>> 32)));
      }

   }

   private float IilliliilIIi() {
      long var2 = -2137671909301019331L;
      if (this.llllIIllIl.length == 0) {
         return 116.0F;
      } else {
         var2 ^= ((long)((this.llllIIllIl.length + 2 - 1) / 2) << 32 ^ var2) & -1L << 32;
         return (float)((int)(var2 >>> 32) * 64 + ((int)(var2 >>> 32) - 1) * 4);
      }
   }

   public int liiiIIllIl() {
      this.lIiiIiIlilli();
      if (this.lillIIllIl < 0.0F) {
         this.lillIIllIl = this.IilliliilIIi();
      }

      return 28 + Math.round(this.lillIIllIl);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6) + '\uf203') ^ '\ufde6') - var5) - var5))) ^ var5) << 1 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 10 | (char)((char)(var4[var5] - var5) - var5) >>> 6) + '\uf203') ^ '\ufde6') - var5) - var5))) ^ var5) >>> 15))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void Iilllilliill(class_332 ax, IIliiIlllIliiIll font, IIliliillIliliil card, float ay, float ctx) {
      String var5 = card.lIliIIIiil.iIlIlllllill();
      if (!var5.isEmpty() && IiIiiIIlliIiiIIl.IilliliilIIi(var5) != null) {
         llilliilililliil.lIIIiiIIIi(ax, var5, ay, ctx, 24.0F);
      } else {
         IIIiiIillIIiiIil.Ililllililil(ax, ay, ctx, 24.0F, 24.0F, 6.0F, IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), IlIIilIlllIIilIl.lliiIlliIl, 0.16), IilIIIIililIIIIi.IIlllIlliIll(0.3));
         llilliilililliil.iiIIlIIlIl(card.illiIIIiil, ay + (24.0F - card.liiiIIIiil) / 2.0F - 1.3F, (float)font.IlIillIiilIi(Math.round(ctx), 24), IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, (double)0.25F));
      }
   }

   private static void IlIillIiilIi(class_332 ctx) {
      ctx.method_51448().popMatrix();
      IIIiiIillIIiiIil.liiiIIllIl().method_22909();
   }

   private static void IIIilIIiiIIi(class_332 dy, float ctx, float cy, float cx, float scale) {
      class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
      var5.method_22903();
      var5.method_46416(ctx, cy + scale, 0.0F);
      var5.method_22905(cx, cx, 1.0F);
      var5.method_46416(-ctx, -cy, 0.0F);
      Matrix3x2fStack var6 = dy.method_51448();
      var6.pushMatrix();
      var6.translate(ctx, cy + scale);
      var6.scale(cx, cx);
      var6.translate(-ctx, -cy);
   }

   private void IIlllIlliIll(class_332 hover, IIliiIlllIliiIll my, IIliliillIliliil cardW, int time, int card, int mx, float ctx, int cardX, int font, double cardY) {
      long var26 = 8687790617405847333L;
      IIIlliIllIIlliIl var12 = cardW.lIliIIIiil;
      var26 ^= ((long)var12.IliIlllilIi() << 32 ^ var26) & -1L << 32;
      float var14 = this.lIllIIllIl.iliIiiliiiii(cardW.llliIIIiil, this.llIlIIllIl.Ililllililil(var12) ? 1.0F : 0.0F, 11.0F);
      Illlllllilll(hover, (float)time, (float)card, (float)mx, ctx, var14);
      float var15 = (float)(time + 6);
      float var16 = (float)(time + mx - 6);
      float var17 = var15 + 24.0F + 7.0F;
      float var18 = var16 - 18.0F;
      float var19 = (float)card + IiIlliIliiIl();
      float var20 = var18 - 5.0F - var15;
      cardW.IliIlllilIi(my, var16 - var17, var20);
      float var21 = IliiIilliiIi.IilliliilIIi((int)(var26 >>> 32) != 0 ? 1.0F : 0.46F);

      try {
         Iilllilliill(hover, my, cardW, var15, (float)(card + 6));
         llilliilililliil.iiIIlIIlIl(cardW.lIiiIIIiil, var17, llilliilililliil.IllIllllIl((float)card + 6.0F, 11.0F, 1.0F), -920587);
         if (!cardW.iIiiIIIiil.isEmpty()) {
            llilliilililliil.iiIilIIlil(hover, cardW.iIiiIIIiil, var17, (float)card + 19.0F, cardW.iiliIIIiil ? IlIIilIlllIIilIl.lliiIlliIl : -5854026);
         }

         llilliilililliil.lIlIliIlIl(cardW.IliiIIIiil, var15, llilliilililliil.IllIllllIl((float)card + 35.0F, 10.0F, 0.82F), 0.82F, IilIIIIililIIIIi.Illlllllilll(-7630437, -5854026, (double)Math.max(ctx, var14)));
         this.IIillIiliIil(hover, cardW, var18, var19, ctx, var14, (boolean)((int)(var26 >>> 32)), cardX, font);
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var21);
      }

      float var22 = (float)card + 47.0F;
      if ((int)(var26 >>> 32) == 0) {
         if (var12.IIlllIlliIll()) {
            llilliilililliil.iiIilIIlil(hover, Iilililiiili<invokedynamic>(), var15, var22, -1535700);
         } else {
            llilliilililliil.Illillllil(hover, Iilililiiili<invokedynamic>(), var15, var22, var20);
         }

      } else {
         if (var14 < 0.998F && !cardW.lliiIIIiil.isEmpty()) {
            float var23 = IliiIilliiIi.IilliliilIIi(1.0F - var14);

            try {
               llilliilililliil.Illillllil(hover, cardW.lliiIIIiil, var15, var22 - 2.0F * var14, var20);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var23);
            }
         }

         if (var14 > 0.002F) {
            float var40 = IliiIilliiIi.IilliliilIIi(var14);

            try {
               Ililllililil(hover, var15, var22 + 2.0F * (1.0F - var14), cardY);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var40);
            }
         }

      }
   }

   private static String Iiilliiliiil(String url) {
      if (url.isEmpty()) {
         return "";
      } else if (url.startsWith(Iilililiiili<invokedynamic>())) {
         return Iilililiiili<invokedynamic>();
      } else {
         try {
            String var1 = (new URI(url)).getHost();
            if (var1 == null) {
               return "";
            } else {
               var1 = var1.toLowerCase(Locale.ROOT);
               if (var1.startsWith(Iilililiiili<invokedynamic>())) {
                  var1 = var1.substring(4);
               }

               if (var1.endsWith(Iilililiiili<invokedynamic>())) {
                  return Iilililiiili<invokedynamic>();
               } else if (var1.equals(Iilililiiili<invokedynamic>())) {
                  return Iilililiiili<invokedynamic>();
               } else if (!var1.endsWith(Iilililiiili<invokedynamic>()) && !var1.equals(Iilililiiili<invokedynamic>())) {
                  if (var1.endsWith(Iilililiiili<invokedynamic>())) {
                     return Iilililiiili<invokedynamic>();
                  } else if (var1.equals(Iilililiiili<invokedynamic>())) {
                     return Iilililiiili<invokedynamic>();
                  } else if (var1.endsWith(Iilililiiili<invokedynamic>())) {
                     return Iilililiiili<invokedynamic>();
                  } else {
                     return var1.endsWith(Iilililiiili<invokedynamic>()) ? Iilililiiili<invokedynamic>() : var1;
                  }
               } else {
                  return Iilililiiili<invokedynamic>();
               }
            }
         } catch (Exception var2) {
            return "";
         }
      }
   }

   private static void Ililllililil(class_332 ctx, float x, float time, double y) {
      long var15 = -4661139991950216200L;
      var15 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.22) << 32 ^ var15) & -1L << 32;
      float var6 = time + 11.0F - 1.5F;
      float var7 = llilliilililliil.IIIllIIliIIl(3.5F);
      float var8 = llilliilililliil.IIIllIIliIIl(x + 1.0F);

      for(var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < IllIIIllIl.length; var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
         double var10 = (double)0.5F + (double)0.5F * Math.sin(y * IllIIIllIl[(int)var15] + lllIIIllIl[(int)var15]);
         double var12 = 0.72 + 0.28 * Math.sin(y * IllIIIllIl[(int)var15] * 0.37 + lllIIIllIl[(int)var15] * 1.7);
         float var14 = 2.5F + 5.5F * (float)(var10 * var12);
         IIIiiIillIIiiIil.IlIlllIlilIl(ctx, var8 + (float)((int)var15) * var7, var6 - var14, 2.0F, var14, 1.0F, (int)(var15 >>> 32));
      }

      llilliilililliil.lIlIliIlIl(Iilililiiili<invokedynamic>(), var8 + (float)(IllIIIllIl.length - 1) * var7 + 2.0F + 5.0F, llilliilililliil.IllIllllIl(time, 11.0F, 0.82F), 0.82F, (int)(var15 >>> 32));
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) << 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) << 14) << 2) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) << 14) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) << 1 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) << 15 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) >>> 10 | (char)((char)((char)((char)(var4[var5] + var5) - '떀') - var5) - 5585) << 6))))) + var5) >>> 1) ^ '跼') ^ var5) - 17025) >>> 15) - 25092) << 3) << 14) << 2) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(int out, float[] index) {
      if (index != null && index.length >= 2) {
         if (out == -1) {
            if (!IlIlIIllIl) {
               return false;
            } else {
               index[0] = lIIlIIllIl[0];
               index[1] = lIIlIIllIl[1];
               return true;
            }
         } else if (out >= 0 && out < iIIlIIllIl) {
            index[0] = IIIlIIllIl[out * 2];
            index[1] = IIIlIIllIl[out * 2 + 1];
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public llllIIIlilllIIIl(lIiiIiiiIiiIii setting, int w, int h, int x, int y) {
      this.llIlIIllIl = setting;
      this.ilIlIIllIl = w;
      this.IiIlIIllIl = h;
      this.liIlIIllIl = x;
      this.iiIlIIllIl = y;
      this.lIiiIiIlilli();
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') >>> 11) + var5) - 25851) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') >>> 11) + var5) - 25851) >>> 4) << 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') >>> 11) + var5) - 25851) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 1 | (char)((char)(-var4[var5]) + var5) >>> 15) - var5) - var5) + var5) + var5)))) + '釰') >>> 11) + var5) - 25851) >>> 4) >>> 15) - var5) ^ 23622));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4955078922751352759L ^ Long.rotateLeft(6579613991511849290L, 43) ^ 4618102433034366908L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1543758312925389699L ^ Long.rotateLeft(5034496445725610839L, 9) ^ -7543874675361796469L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1933972918009116601L ^ Long.rotateLeft(-1650096040239591241L, 15) ^ -810864567408625450L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4343893506666494406L ^ Long.rotateLeft(5009536142552054330L, 61) ^ 1517453313223505135L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8753176820027647382L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4078757464973806752L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6512451294095484181L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2484293801617295974L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3393570763674826783L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4326515419993715068L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiilIiiiIii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iliilliiilii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiiiliiiiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIIllIIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIIIlIlIIl<invokedynamic>());
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

   private void lIiiIiIlilli() {
      long var6 = -1153348009431828254L;
      var6 ^= ((long)llIliiIiilIliiIi.liiiIIllIl() << 32 ^ var6) & -1L << 32;
      if ((int)(var6 >>> 32) != this.illlIIllIl) {
         this.illlIIllIl = (int)(var6 >>> 32);
         List var2 = this.llIlIIllIl.Iilllilliill();
         IIliliillIliliil[] var3 = new IIliliillIliliil[var2.size()];

         for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < var3.length; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            IIliliillIliliil var5 = new IIliliillIliliil((IIIlliIllIIlliIl)var2.get((int)var9), (int)var9);
            var5.IIiiIIIiil = () -> this.IIIllIIliIIl(var5);
            var3[(int)var9] = var5;
         }

         this.llllIIllIl = var3;
         this.lIllIIllIl.IIlllIlliIll((k) -> !k.startsWith(Iilililiiili<invokedynamic>()) && !k.startsWith(Iilililiiili<invokedynamic>()) && !k.startsWith(Iilililiiili<invokedynamic>()));
         this.IillIIllIl = true;
      }
   }

   public void IliIlllilIi(int h, int w, int x, int y) {
      this.ilIlIIllIl = h;
      this.IiIlIIllIl = w;
      this.liIlIIllIl = x;
      this.iiIlIIllIl = y;
   }

   private void iliIiiliiiii() {
      long var2 = 1736327843635154017L;
      llIliiIiilIliiIi.lIiiIiIlilli();
      this.lIllIIllIl.iIlIlllllill(Iilililiiili<invokedynamic>());
      var2 ^= ((long)llIliiIiilIliiIi.IliIlllilIi().size() << 32 ^ var2) & -1L << 32;
      if (llIliiIiilIliiIi.IilliliilIIi()) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), false);
      } else if ((int)(var2 >>> 32) == 0) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), false);
      } else {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(Iilililiiili<invokedynamic>(), (int)(var2 >>> 32) == 1 ? Iilililiiili<invokedynamic>() : (int)(var2 >>> 32) + Iilililiiili<invokedynamic>(), true);
      }

   }

   private void IIIllIIliIIl(IIliliillIliliil card) {
      IIIlliIllIIlliIl var2 = card.lIliIIIiil;
      if (var2.IliIlllilIi()) {
         if (!llIliiIiilIliiIi.iliIiiliiiii(var2)) {
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>() + var2.liiiIIllIl(), false);
         } else {
            this.llIlIIllIl.Iiilliiliiil(var2.IiIlliIliiIl());
            this.lIllIIllIl.iIlIlllllill(card.IlliIIIiil);
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>() + var2.liiiIIllIl(), true);
         }
      }
   }

   private static void Illlllllilll(class_332 w, float hover, float ctx, float x, float on, float y) {
      long var8 = 459972903550421686L;
      var8 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.025 + 0.04 * (double)on), IlIIilIlllIIilIl.lliiIlliIl, 0.07 * (double)y) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, 0.6 * (double)on), IilIIIIililIIIIi.IIlllIlliIll(0.62), (double)y) ^ var8) & -1L >>> 32;
      if (y > 0.02F && !IilIIIIililIIIIi.liiiIIllIl()) {
         IIIiiIillIIiiIil.IIlllIlliIll(w, hover, ctx, x, 64.0F, 7.0F, IilIIIIililIIIIi.IIlllIlliIll(0.2 * (double)y), 3.0F, 0.85F);
      }

      IIIiiIillIIiiIil.Ililllililil(w, hover, ctx, x, 64.0F, 7.0F, (int)(var8 >>> 32), (int)var8);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) >>> 1))) - 11492) ^ 23408) ^ var5))) - var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) >>> 1))) - 11492) ^ 23408) ^ var5))) - var5) << 6) << 2 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) >>> 1))) - 11492) ^ 23408) ^ var5))) - var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - var5) + 4122) + '计') + var5) + var5) >>> 1))) - 11492) ^ 23408) ^ var5))) - var5) << 6) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIlllIlilIl(class_332 mx, int ctx, int my) {
      long var33 = 5457035513196422799L;
      long var35 = -4389955635984783381L;
      long var37 = -5889986770709888777L;
      long var39 = -4577333302715061840L;
      long var31 = -4483352507621157738L;
      this.lIiiIiIlilli();
      this.IIllIIllIl.IliIlllilIi();
      float var4 = this.IilliliilIIi();
      this.lillIIllIl = this.lillIIllIl < 0.0F ? var4 : (float)IiiIIIIlliiIIIIl.iIlIlllllill((double)this.lillIIllIl, (double)var4, (double)16.0F, llIilillilIilill.liiiIIllIl());
      if (Math.abs(this.lillIIllIl - var4) < 0.5F) {
         this.lillIIllIl = var4;
      }

      var31 ^= ((long)this.iIllIIllIl.iIlIlllllill() << 32 ^ var31) & -1L << 32;
      if ((int)(var31 >>> 32) != 0 || this.IillIIllIl) {
         this.iIllIIllIl.IliIlllilIi();
      }

      this.IillIIllIl = false;
      float var6 = llilliilililliil.IiiIlliiIl(mx, Iilililiiili<invokedynamic>(), (float)this.ilIlIIllIl, (float)this.IiIlIIllIl, 22.0F);
      llilliilililliil.lIlIliIlIl(Iilililiiili<invokedynamic>(), var6 + 6.0F, llilliilililliil.IllIllllIl((float)this.IiIlIIllIl, 22.0F, 0.82F) + 1.25F, 0.82F, -7630437);
      float var7 = 18.0F;
      float var8 = (float)(this.ilIlIIllIl + this.liIlIIllIl) - var7;
      float var9 = (float)this.IiIlIIllIl + (22.0F - var7) / 2.0F;
      llilliilililliil.IIllllIlll(mx, this.IIllIIllIl, this.lIllIIllIl, Iilililiiili<invokedynamic>(), lIlIIiliIlIIil.IIIilIIiiIIi(), var8, var9, var7, 12.0F, ctx, my, false, this.IlllIIllIl);
      lIIlIIllIl[0] = var8 + var7 / 2.0F;
      lIIlIIllIl[1] = var9 + var7 / 2.0F;
      IlIlIIllIl = true;
      var31 ^= ((long)(this.IiIlIIllIl + 22 + 6) ^ var31) & -1L >>> 32;
      iIIlIIllIl = 0;
      if (this.llllIIllIl.length == 0) {
         llilliilililliil.IilIililIi(mx, this.IIllIIllIl, this.lIllIIllIl, Iilililiiili<invokedynamic>(), (float)this.ilIlIIllIl, (float)((int)var31), (float)this.liIlIIllIl, 116.0F, lIlIIiliIlIIil.illIlIilIl(Iilililiiili<invokedynamic>()), Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), Iilililiiili<invokedynamic>(), ctx, my, this.IlllIIllIl);
      } else {
         IIliiIlllIliiIll var11 = llilliilililliil.IIiilIiiiIii();
         double var12 = (double)System.nanoTime() / (double)1.0E9F;

         for(var33 ^= (0L ^ var33) & -1L << 32; (int)(var33 >>> 32) < this.llllIIllIl.length; var33 += 4294967296L) {
            IIliliillIliliil var15 = this.llllIIllIl[(int)(var33 >>> 32)];
            var33 ^= ((long)((int)(var33 >>> 32) % 2) ^ var33) & -1L >>> 32;
            var35 ^= ((long)llilliilililliil.iIiIlIliIl(this.ilIlIIllIl, this.liIlIIllIl, 2, 4, (int)var33) << 32 ^ var35) & -1L << 32;
            var35 ^= ((long)llilliilililliil.lliIliliIl(this.ilIlIIllIl, this.liIlIIllIl, 2, 4, (int)var33) ^ var35) & -1L >>> 32;
            var37 ^= ((long)((int)var31 + (int)(var33 >>> 32) / 2 * 68) << 32 ^ var37) & -1L << 32;
            if ((int)(var33 >>> 32) < 24) {
               IIIlIIllIl[(int)(var33 >>> 32) * 2] = (float)((int)(var35 >>> 32) + (int)var35 - 6) - 9.0F;
               IIIlIIllIl[(int)(var33 >>> 32) * 2 + 1] = (float)((int)(var37 >>> 32)) + IiIlliIliiIl() + 9.0F;
               iIIlIIllIl = (int)(var33 >>> 32) + 1;
            }

            iIIliiIiIlIliiIi var20 = this.iIllIIllIl.lIiiIiIlilli((int)(var33 >>> 32));
            if (!var20.iliIiiliiiii()) {
               float var21 = var20.IiilIIIlIi;
               float var22 = var20.liilIIIlIi;
               var37 ^= ((long)var15.lIliIIIiil.IliIlllilIi() ^ var37) & -1L >>> 32;
               long var59 = var39 ^ ((long)((int)var37 != 0 && var20.lIIiIIIlIi ? 1 : 0) << 32 ^ var39) & -1L << 32;
               var39 = var59 ^ ((long)((int)var37 != 0 && var20.IIIiIIIlIi ? ctx : -4000) ^ var59) & -1L >>> 32;
               float var26 = this.lIllIIllIl.IIIllIIliIIl(var15.iIliIIIiil, llilliilililliil.Iliilliiilii((double)((int)var39), (double)my, (float)((int)(var35 >>> 32)), (float)((int)(var37 >>> 32)), (float)((int)var35), 64.0F));
               IIIilIIiiIIi(mx, (float)((int)(var35 >>> 32)) + (float)((int)var35) / 2.0F, (float)((int)(var37 >>> 32)) + 32.0F, var20.iiilIIIlIi * this.lIllIIllIl.IilliliilIIi(var15.iIliIIIiil, 0.025F), -1.0F * var26);

               try {
                  if (var21 > 0.004F) {
                     float var27 = IliiIilliiIi.IilliliilIIi(var21);

                     try {
                        Illlllllilll(mx, (float)((int)(var35 >>> 32)), (float)((int)(var37 >>> 32)), (float)((int)var35), 0.0F, 0.0F);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var27);
                     }
                  }

                  if (var22 > 0.002F) {
                     float var53 = IliiIilliiIi.IilliliilIIi(var22);

                     try {
                        this.IIlllIlliIll(mx, var11, var15, (int)(var35 >>> 32), (int)(var37 >>> 32), (int)var35, var26, (int)var39, my, var12);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var53);
                     }
                  }
               } finally {
                  IlIillIiilIi(mx);
               }

               if ((int)(var39 >>> 32) != 0) {
                  this.IIllIIllIl.iIlIlllllill((float)((int)(var35 >>> 32)), (float)((int)(var37 >>> 32)), (float)((int)var35), 64.0F, var15.IIiiIIIiil, this.lIllIIllIl, var15.iIliIIIiil);
               }
            }
         }

      }
   }

   public boolean IiIiliIiiiIi(double my, double mx, int btn) {
      return btn == 0 && this.IIllIIllIl.IilliliilIIi(my, mx);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) << 4 | (char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) >>> 12) ^ '\uf48a') + '\ued06') + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) << 4 | (char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) >>> 12) ^ '\uf48a') + '\ued06') + var5) << 9))))) << 10 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) << 4 | (char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) >>> 12) ^ '\uf48a') + '\ued06') + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) << 4 | (char)((char)((char)var4[var5] - 13897) << 1 | (char)((char)var4[var5] - 13897) >>> 15) >>> 12) ^ '\uf48a') + '\ued06') + var5) << 9))))) >>> 6) - '볾'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
