package gg.corz;

import com.corz.client.CorzClient;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import org.joml.Matrix3x2fStack;

public class liiiIIiiiiiIIi extends ilIllIiIll {
   private boolean IIiilIIiilIiilIIii;
   private final liIliIliiIliIl lililIIiiiililIIii;
   private static final float IiiIlIIiiliiIlIIii = 0.92F;
   private final liIliIliiIliIl IllilIIiilllilIIii;
   private final liIliIliiIliIl IiIilIIiiliIilIIii;
   private Color iilIiIIiiIIiIiIIii;
   private boolean iIiilIIiiIliilIIii;
   private static final Color lIillIIiiiIillIIii;
   private final liIliIliiIliIl illilIIiiIililIIii;
   private int lliilIIiiiliilIIii;
   private static final String llIIlIIiiilIIlIIii = "totems";
   private static final float ilIllIIiiIiIllIIii = 8.0F;
   private static final int lIIllIIiiiIIllIIii = 1021659213;
   private String iiiilIIiiIIIIiIIii;
   private int IilIiIIiililIiIIii;
   private int lllIiIIiiillIiIIii;
   private final liIliIliiIliIl llIilIIiiilIilIIii;
   private float ilIIiIIiiIiIIiIIii;
   private IIliiIlllIliiIll lIIIiIIiiiIIIiIIii;
   private static final float iIlllIIiiIllllIIii = 12.0F;
   private static final String[] IilllIIiililllIIii = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private final liIliIliiIliIl lIlilIIiiiIlilIIii;
   private static final float lilIlIIiiiilIlIIii = 0.95F;
   private final liIliIliiIliIl iiIilIIiiIIlilIIii;
   private final iiIiiilIIliiil liillIIiiiiillIIii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil ilillIIiiIiillIIii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float iIiIlIIiiIliIlIIii = 0.15F;
   private static final float liIllIIiiiiIllIIii = 5.0F;
   private final liIliIliiIliIl iIIilIIiiIlIilIIii;
   private static final float lIlIlIIiiiIlIlIIii = 5.0F;
   private static final String lllllIIiiillllIIii = "TOTEMS";
   private static final float lliIlIIiiiliIlIIii = 0.22F;
   private final class_4587 IIIilIIiilIIilIIii = new class_4587();
   private final lliliIIiililiIIi IlillIIiillillIIii = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final float iiIIlIIiiIIlIlIIii = 6.0F;
   private float iIlIiIIiiIllIiIIii;
   private static final float IlIllIIiillIllIIii = 20.0F;
   private static final class_1799 iilllIIiiIIillIIii;
   private final float[] IlIIiIIiillIIiIIii;
   private static final float IIiIlIIiilIiIlIIii = 0.7F;
   private float IIlIiIIiilIlIiIIii;
   private String IiiilIIiiliiilIIii;
   private static final float iiiIlIIiiIIIllIIii = 140.0F;
   private static final float IllIlIIiilllIlIIii = 6.0F;
   private static final float IiIIlIIiiliIIlIIii = 16.0F;
   private static final float illIlIIiiIilIlIIii = 8.0F;
   private float liIIiIIiiiiIIiIIii;
   private static final float IIlllIIiilIlllIIii = 12.0F;

   private static void iIlllIllll(class_4587 s, float cy, float cx, float ms) {
      s.method_22903();
      s.method_46416(cy, cx, 0.0F);
      s.method_22905(ms, ms, 1.0F);
      s.method_46416(-cy, -cx, 0.0F);
   }

   private void IIllllIlll(IIliiIlllIliiIll f) {
      if (f != this.lIIIiIIiiiIIIiIIii) {
         this.lIIIiIIiiiIIIiIIii = f;
         float var2 = 0.0F;

         for(int var3 = 0; var3 < 10; ++var3) {
            this.IlIIiIIiillIIiIIii[var3] = f.iIlIlllllill(IilllIIiililllIIii[var3]) * 0.95F;
            var2 = Math.max(var2, this.IlIIiIIiillIIiIIii[var3]);
         }

         this.ilIIiIIiiIiIIiIIii = (float)Math.ceil((double)var2);
         this.liIIiIIiiiiIIiIIii = f.iIlIlllllill(IliIlllilIi<invokedynamic>()) * 0.7F;
         this.IIlIiIIiilIlIiIIii = llilliilililliil.IllIllllIl(0.0F, 16.0F, 0.95F);
         this.iIlIiIIiiIllIiIIii = llilliilililliil.IllIllllIl(0.0F, 16.0F, 0.7F);
         this.lllIiIIiiillIiIIii = 0;
      }
   }

   protected void iIIIlIlIIl() {
      this.lIIlliIIll();
   }

   private void lIilliIill(IIliiIlllIliiIll y, String c, float s, float scale, float f, Color x) {
      this.IIIilIIiilIIilIIii.method_22903();

      try {
         this.IIIilIIiilIIilIIii.method_22905(f, f, 1.0F);
         y.IliIlllilIi(c, s / f, scale / f, x);
      } finally {
         this.IIIilIIiilIIilIIii.method_22909();
      }

   }

   private void iilllIIill(IIliiIlllIliiIll c, String x, float y, float s, Color f) {
      this.IIIilIIiilIIilIIii.method_22903();

      try {
         this.IIIilIIiilIIilIIii.method_22905(0.95F, 0.95F, 1.0F);

         for(int var6 = 0; var6 < x.length(); ++var6) {
            int var7 = x.charAt(var6) - 48;
            if (var7 >= 0 && var7 <= 9) {
               c.IliIlllilIi(IilllIIiililllIIii[var7], (y + (this.ilIIiIIiiIiIIiIIii - this.IlIIiIIiillIIiIIii[var7]) / 2.0F) / 0.95F, s / 0.95F, f);
               y += this.ilIIiIIiiIiIIiIIii;
            }
         }
      } finally {
         this.IIIilIIiilIIilIIii.method_22909();
      }

   }

   static {
      iilllIIiiIIillIIii = new class_1799(class_1802.field_8288);
      lIillIIiiiIillIIii = new Color(-7630437, true);
   }

   private static float liIlliiIll(int tgtScale) {
      long var2 = -5500138103200322533L;
      var2 ^= ((long)Math.max(1, Math.round(8.0F * (float)tgtScale / 16.0F)) << 32 ^ var2) & -1L << 32;
      return 16.0F * (float)((int)(var2 >>> 32)) / (float)tgtScale;
   }

   public void IlIllllIll(class_332 ctx) {
      if (Iiiilllliiilll.field_1724 != null && ctx != null) {
         if (this.lliilIIiiiliilIIii < 0) {
            this.lIIlliIIll();
         }

         if (this.lliilIIiiiliilIIii >= 0) {
            CorzClient.fontManager.iIlIlllllill(this.IIIilIIiilIIilIIii);
            IIIiiIillIIiiIil.IliIlllilIi(this.IIIilIIiilIIilIIii);
            double var2 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var4 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var5 = (float)((double)var4 / var2);
            boolean var6 = Math.abs(var5 - 1.0F) > 1.0E-4F;
            int var7 = Iiiilllliiilll.method_22683().method_4486();
            int var8 = Iiiilllliiilll.method_22683().method_4502();
            int var9 = var6 ? Math.round((float)var7 / var5) : var7;
            int var10 = var6 ? Math.round((float)var8 / var5) : var8;
            if (var6) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var9;
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)var10;
            }

            try {
               float var11 = IIililillIililil.ilIllIiIll();
               if (!(var11 < 0.004F)) {
                  String var12 = this.IlillIIiillillIIii.Iilllilliill();
                  boolean var13 = IliIlllilIi<invokedynamic>().equals(var12) || IliIlllilIi<invokedynamic>().equals(var12) && !IIililillIililil.liIlliiIll();
                  if (var13 != this.iIiilIIiiIliilIIii) {
                     this.iIiilIIiiIliilIIii = var13;
                     this.IIiilIIiilIiilIIii = true;
                  }

                  if (var13) {
                     float var30 = IliiIilliiIi.IilliliilIIi(var11);

                     try {
                        this.ilIllIiIll(ctx, var9, var5, var8, this.iiiIlIIIll());
                        return;
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var30);
                     }
                  }

                  if (this.IIiilIIiilIiilIIii) {
                     this.IIiilIIiilIiilIIii = false;
                     this.illilIIiiIililIIii.IilliliilIIi((double)0.0F);
                     this.illilIIiiIililIIii.lIiiIiIlilli((double)1.0F);
                     this.lililIIiiiililIIii.IilliliilIIi((double)0.0F);
                     this.lililIIiiiililIIii.lIiiIiIlilli((double)1.0F);
                  }

                  float var14 = IliiIilliiIi.IilliliilIIi(var11 * (float)this.illilIIiiIililIIii.iIlIlllllill());

                  try {
                     this.Iillllilll(ctx, var9, var5, var4, var8);
                     return;
                  } finally {
                     IliiIilliiIi.lIiiIiIlilli(var14);
                  }
               }
            } finally {
               if (var6) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }

            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) << 9) ^ 4955) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) << 9) ^ 4955) << 11) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) << 9) ^ 4955) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) + var5) - var5) ^ 2332) + var5) + 22458) ^ var5) + 16024) << 9) ^ 4955) << 11) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iillllilll(class_332 ctx, int realH, float tgtScale, int sw, int factor) {
      IIliiIlllIliiIll var6 = CorzClient.fontRenderer();
      this.IIllllIlll(var6);
      boolean var7 = this.ilillIIiiIiillIIii.Iilllilliill();
      boolean var8 = this.liillIIiiiiillIIii.Iilllilliill();
      float var9 = liIlliiIll(sw);
      int var10 = this.IiiilIIiiliiilIIii.length();
      double var11 = var7 ? (double)1.0F : (double)0.0F;
      double var13 = var8 && this.lliilIIiiiliilIIii == 0 ? (double)1.0F : (double)0.0F;
      double var15 = var8 && this.lliilIIiiiliilIIii == 1 ? (double)1.0F : (double)0.0F;
      int var17 = Math.round(6.0F + var9 + 5.0F + (float)var10 * this.ilIIiIIiiIiIIiIIii + (var7 ? 6.0F + this.liIIiIIiiiiIIiIIii : 0.0F) + 6.0F);
      if (this.lllIiIIiiillIiIIii == 0) {
         this.IiIilIIiiliIilIIii.IilliliilIIi((double)var17);
         this.iiIilIIiiIIlilIIii.IilliliilIIi(var11);
         this.lIlilIIiiiIlilIIii.IilliliilIIi(var13);
         this.IllilIIiilllilIIii.IilliliilIIi(var15);
         this.lllIiIIiiillIiIIii = var17;
      } else if (var17 != this.lllIiIIiiillIiIIii) {
         this.IiIilIIiiliIilIIii.lIiiIiIlilli((double)var17);
         this.lllIiIIiiillIiIIii = var17;
      }

      if (this.iiIilIIiiIIlilIIii.IiIlliIliiIl() != var11) {
         this.iiIilIIiiIIlilIIii.lIiiIiIlilli(var11);
      }

      if (this.lIlilIIiiiIlilIIii.IiIlliIliiIl() != var13) {
         this.lIlilIIiiiIlilIIii.lIiiIiIlilli(var13);
      }

      if (this.IllilIIiilllilIIii.IiIlliIliiIl() != var15) {
         this.IllilIIiilllilIIii.lIiiIiIlilli(var15);
      }

      float var18 = (float)this.IiIilIIiiliIilIIii.iIlIlllllill();
      float var19 = ((float)factor - 22.0F) / tgtScale - IIililillIililil.iilllIIill();
      float var20 = (float)Math.round((float)(realH - var17) / 2.0F);
      float var21 = var19 - Math.max(16.0F, IIililillIililil.iIiIilIliIil() + 6.0F) - 16.0F;
      float var22 = IIililillIililil.IiiiIlliiiIl(IliIlllilIi<invokedynamic>());
      float var23 = IIililillIililil.iiiiIlIIIIll(IliIlllilIi<invokedynamic>());
      iiIliiiIIlliii var24 = IIililillIililil.ilIIllIiIIll(IliIlllilIi<invokedynamic>(), var20 + var22, var21 + var23, (float)var17, 16.0F);
      float var25 = var20 + (float)Math.round(var22) + ((float)var17 - var18) / 2.0F;
      float var26 = var21 + (float)Math.round(var23);
      float var27 = var25 + var18 / 2.0F;
      float var28 = var26 + 8.0F;
      float var29 = 0.92F + 0.07999998F * (float)this.lililIIiiiililIIii.iIlIlllllill();
      boolean var30 = Math.abs(var29 - 1.0F) > 5.0E-4F;
      if (var24 != null) {
         var24.IilliliilIIi(this.IIIilIIiilIIilIIii);
      }

      if (var30) {
         iIlllIllll(this.IIIilIIiilIIilIIii, var27, var28, var29);
      }

      try {
         float var31 = (float)this.lIlilIIiiiIlilIIii.iIlIlllllill();
         float var32 = (float)this.IllilIIiilllilIIii.iIlIlllllill();
         llliIlIlilliIlIl.Iiilliiliiil(llliIlIlilliIlIl.iIIlIlIiIl, var25, var26, var18, 16.0F, 1.0F);
         if (var31 > 0.004F) {
            llliIlIlilliIlIl.IIillIiliIil(var25, var26, var18, 16.0F, 8.0F, IIIiiIillIIiiIil.Illlllllilll(), llliIlIlilliIlIl.iliIiiliiiii(1021659213, var31));
         }

         float var33 = var25 + 6.0F;
         float var34 = var26 + (16.0F - var9) / 2.0F;
         float var35 = 1.0F + 0.22F * (1.0F - (float)this.llIilIIiiilIilIIii.iIlIlllllill());
         Matrix3x2fStack var36 = ctx.method_51448();
         var36.pushMatrix();

         try {
            var36.scale(tgtScale, tgtScale);
            if (var24 != null) {
               var24.IIIllIIliIIl(var36);
            }

            if (var30) {
               var36.translate(var27, var28);
               var36.scale(var29, var29);
               var36.translate(-var27, -var28);
            }

            if (Math.abs(var35 - 1.0F) > 5.0E-4F) {
               float var37 = var33 + var9 / 2.0F;
               float var38 = var34 + var9 / 2.0F;
               var36.translate(var37, var38);
               var36.scale(var35, var35);
               var36.translate(-var37, -var38);
            }

            var36.translate(var33, var34);
            var36.scale(var9 / 16.0F, var9 / 16.0F);
            llllIIlilllIIl.iIlIlllllill(ctx, iilllIIiiIIillIIii, 0, 0, 16);
         } finally {
            var36.popMatrix();
         }

         int var79 = IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-920587, -1750963, (double)var31), -1535700, (double)var32);
         if (this.iilIiIIiiIIiIiIIii == null || var79 != this.IilIiIIiililIiIIii) {
            this.IilIiIIiililIiIIii = var79;
            this.iilIiIIiiIIiIiIIii = new Color(var79, true);
         }

         float var80 = var33 + var9 + 5.0F;
         float var39 = llliIlIlilliIlIl.IIIllIIliIIl(var26 + this.IIlIiIIiilIlIiIIii);
         float var40 = (float)var10 * this.ilIIiIIiiIiIIiIIii;
         float var41 = var80 + var40 / 2.0F;
         float var42 = (float)this.iIIilIIiiIlIilIIii.iIlIlllllill();
         if (var42 != 1.0F) {
            float var43 = Math.min(1.0F, (float)this.iIIilIIiiIlIilIIii.IlIlllIlilIl() / 140.0F);
            float var44 = IliiIilliiIi.IilliliilIIi(1.0F - var43 * var43);

            try {
               this.iilllIIill(var6, this.iiiilIIiiIIIIiIIii, var41 - (float)this.iiiilIIiiIIIIiIIii.length() * this.ilIIiIIiiIiIIiIIii / 2.0F, var39, this.iilIiIIiiIIiIiIIii);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var44);
            }

            float var45 = IliiIilliiIi.IilliliilIIi(lllllillll(var43));
            iIlllIllll(this.IIIilIIiilIIilIIii, var41, var28, 1.0F + 0.15F * (1.0F - var42));

            try {
               this.iilllIIill(var6, this.IiiilIIiiliiilIIii, var80, var39, this.iilIiIIiiIIiIiIIii);
            } finally {
               this.IIIilIIiilIIilIIii.method_22909();
               IliiIilliiIi.lIiiIiIlilli(var45);
            }
         } else {
            this.iilllIIill(var6, this.IiiilIIiiliiilIIii, var80, var39, this.iilIiIIiiIIiIiIIii);
         }

         float var81 = var80 + var40 + 6.0F;
         float var82 = Math.min((float)this.iiIilIIiiIIlilIIii.iIlIlllllill(), llliIlIlilliIlIl.liiiIIllIl((var25 + var18 - 6.0F - var81 + 0.5F) / this.liIIiIIiiiiIIiIIii));
         if (var82 > 0.004F) {
            float var83 = IliiIilliiIi.IilliliilIIi(var82);

            try {
               this.lIilliIill(var6, IliIlllilIi<invokedynamic>(), var81, llliIlIlilliIlIl.IIIllIIliIIl(var26 + this.iIlIiIIiiIllIiIIii), 0.7F, lIillIIiiiIillIIii);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var83);
            }
         }
      } finally {
         if (var30) {
            this.IIIilIIiilIIilIIii.method_22909();
         }

         if (var24 != null) {
            this.IIIilIIiilIIilIIii.method_22909();
         }

      }

   }

   private void ilIllIiIll(class_332 sw, int factor, float realH, int count, int ctx) {
      IIlIiIlllIlIiIll var6 = IIlIiIlllIlIiIll.lIiiIiIlilli();
      IIlIiIlllIlIiIll var7 = var6.IIillIiliIil() ? var6 : IIlIiIlllIlIiIll.liiiIIllIl();
      if (var7.IIillIiliIil()) {
         String var8 = String.valueOf(ctx);
         float var9 = Math.max(var7.Iiilliiliiil(var8, 12.0F), var7.Iiilliiliiil(IliIlllilIi<invokedynamic>(), 12.0F));
         float var10 = 25.0F + var9 + 8.0F;
         float var11 = ((float)count - 22.0F) / realH;
         float var12 = ((float)factor - var10) / 2.0F;
         float var13 = var11 - 16.0F - 20.0F;
         float var14 = IIililillIililil.IiiiIlliiiIl(IliIlllilIi<invokedynamic>());
         float var15 = IIililillIililil.iiiiIlIIIIll(IliIlllilIi<invokedynamic>());
         float var16 = var12 + (float)Math.round(var14);
         float var17 = var13 + (float)Math.round(var15);
         iiIliiiIIlliii var18 = IIililillIililil.ilIIllIiIIll(IliIlllilIi<invokedynamic>(), var12 + var14, var13 + var15, var10, 20.0F);
         if (var18 != null) {
            var18.IilliliilIIi(this.IIIilIIiilIIilIIii);
         }

         try {
            IIililillIililil.ilIlIlIiIlIl(sw, var16, var17, var10, 20.0F, (String)null);
            float var19 = var16 + 8.0F;
            float var20 = var17 + 4.0F;
            sw.method_51448().pushMatrix();
            sw.method_51448().scale(realH, realH);
            if (var18 != null) {
               var18.IIIllIIliIIl(sw.method_51448());
            }

            sw.method_51448().translate(var19, var20);
            sw.method_51448().scale(0.75F, 0.75F);
            llllIIlilllIIl.iIlIlllllill(sw, iilllIIiiIIillIIii, 0, 0, 16);
            sw.method_51448().popMatrix();
            int var21 = ctx == 0 ? -42406 : -1;
            var7.IIlilIliiIli(var8, var19 + 12.0F + 5.0F, var17 + (20.0F - var7.IlIillIiilIi(12.0F)) / 2.0F, var21, 12.0F);
         } finally {
            if (var18 != null) {
               this.IIIilIIiilIIilIIii.method_22909();
            }

         }

      }
   }

   public liiiIIiiiiiIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iIIilIIiiIlIilIIii = new liIliIliiIliIl(llIIIliilIIIli.illIiliiiIilIiliii, 220, (double)1.0F);
      this.llIilIIiiilIilIIii = new liIliIliiIliIl(llIIIliilIIIli.illIiliiiIilIiliii, 240, (double)1.0F);
      this.IiIilIIiiliIilIIii = new liIliIliiIliIl(llIIIliilIIIli.iIlilliiiIllilliii, 220);
      this.iiIilIIiiIIlilIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200, (double)1.0F);
      this.lIlilIIiiiIlilIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 260);
      this.IllilIIiilllilIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 260);
      this.illilIIiiIililIIii = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 160, (double)1.0F);
      this.lililIIiiiililIIii = new liIliIliiIliIl(llIIIliilIIIli.illIiliiiIilIiliii, 240, (double)1.0F);
      this.IIiilIIiilIiilIIii = true;
      this.lliilIIiiiliilIIii = -1;
      this.IiiilIIiiliiilIIii = IliIlllilIi<invokedynamic>();
      this.iiiilIIiiIIIIiIIii = IliIlllilIi<invokedynamic>();
      this.IlIIiIIiillIIiIIii = new float[10];
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlillIIiillillIIii, this.ilillIIiiIiillIIii, this.liillIIiiiiillIIii});
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) >>> 4 | (char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) << 12))))) + var5))) << 10 | (char)(~((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) >>> 4 | (char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) << 12))))) + var5))) >>> 6) - var5) + var5) - var5) - var5) << 9 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) >>> 4 | (char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) << 12))))) + var5))) << 10 | (char)(~((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) >>> 4 | (char)(~((char)((char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) >>> 1 | (char)((char)(-var4[var5]) << 4 | (char)(-var4[var5]) >>> 12) << 15))) << 12))))) + var5))) >>> 6) - var5) + var5) - var5) - var5) >>> 7) ^ '过') - var5))))));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') << 13) - '녳') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') << 13) - '녳') ^ var5) >>> 5) + var5) + 12335) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') << 13) - '녳') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') >>> 3 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 21629) << 12 | (char)(var4[var5] + 21629) >>> 4) + 19940) + var5) + 21195) + var5) + var5))) + '\udd27') - '\ue7db') << 13) - '녳') ^ var5) >>> 5) + var5) + 12335) << 7))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) << 14 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) >>> 2) << 14 | (char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) << 14 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) >>> 2) >>> 2) ^ '\ue412') - '鱴') >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) << 14 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) >>> 2) << 14 | (char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) << 14 | (char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) << 14 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(~var4[var5]) - var5) - 12132) - '껟'))))) >>> 8) - 32389))) >>> 2) >>> 2) >>> 2) ^ '\ue412') - '鱴') << 3) - '，') - var5));
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
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)(var4[var5] + var5) - 31524) - var5))) ^ 20431))))) + var5) ^ '쒓'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3303717475029744803L ^ Long.rotateLeft(-1421421133944243796L, 47) ^ -9029986515594571761L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8176698896411004809L ^ Long.rotateLeft(-4567473668566321601L, 54) ^ -5443036678676271962L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9129520449050669815L ^ Long.rotateLeft(-5078918940955058512L, 15) ^ 2774537247177852455L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 582823619831632244L ^ Long.rotateLeft(3937646294435920418L, 43) ^ -2723709835839739557L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3423457672470080185L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5517373971797543826L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6405996946373650222L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3256930358540971664L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8927603263141619194L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2450401158288170181L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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

   public void Iliilliiilii(lIiIlliiIiIlli event) {
      this.IlIllllIll(event.IIiIilIIIl);
   }

   private static float lllllillll(float t) {
      t = t < 0.0F ? 0.0F : (t > 1.0F ? 1.0F : t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private void lIIlliIIll() {
      long var3 = -3174592939969651829L;
      if (Iiiilllliiilll.field_1724 != null) {
         var3 ^= ((long)this.iiiIlIIIll() << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != this.lliilIIiiiliilIIii) {
            var3 ^= ((long)(this.lliilIIiiiliilIIii < 0 ? 1 : 0) ^ var3) & -1L >>> 32;
            this.iiiilIIiiIIIIiIIii = this.IiiilIIiiliiilIIii;
            this.IiiilIIiiliiilIIii = (int)(var3 >>> 32) < ((1368697979 ^ 9) * 109 * -69 ^ 1059176132) ? IilllIIiililllIIii[(int)(var3 >>> 32)] : String.valueOf((int)(var3 >>> 32));
            if ((int)var3 == 0) {
               this.iIIilIIiiIlIilIIii.IilliliilIIi((double)0.0F);
               this.iIIilIIiiIlIilIIii.lIiiIiIlilli((double)1.0F);
               if ((int)(var3 >>> 32) < this.lliilIIiiiliilIIii) {
                  this.llIilIIiiilIilIIii.IilliliilIIi((double)0.0F);
                  this.llIilIIiiilIilIIii.lIiiIiIlilli((double)1.0F);
               }
            }

            this.lliilIIiiiliilIIii = (int)(var3 >>> 32);
         }
      }
   }

   private int iiiIlIIIll() {
      int var1 = 0;
      class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();

      for(int var3 = 0; var3 < 36; ++var3) {
         class_1799 var4 = var2.method_5438(var3);
         if (var4.method_31574(class_1802.field_8288)) {
            var1 += var4.method_7947();
         }
      }

      class_1799 var5 = var2.method_5438(40);
      if (var5.method_31574(class_1802.field_8288)) {
         var1 += var5.method_7947();
      }

      return var1;
   }

   protected void Illillliilli() {
      this.IIiilIIiilIiilIIii = true;
      this.lliilIIiiiliilIIii = -1;
      this.lIIlliIIll();
   }
}
