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
import net.minecraft.class_1109;
import net.minecraft.class_11905;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3414;
import net.minecraft.class_437;
import net.minecraft.class_4587;

public class IIIiiiIllIIiiiIl extends class_437 implements Iilililiiili, Illillliilli {
   private static final int iIiiilIlll = 14;
   private static final int iliiilIlll = 16;
   private String liiIIiIlll;
   private final StringBuilder lilIIiIlll;
   private float IlIlIiIlll;
   private static final int liIIIiIlll = -12922502;
   private static final int lliiilIlll = 97;
   private float llIlIiIlll;
   private static final int IiIiilIlll = 18;
   private volatile boolean IiiIIiIlll;
   private static final int iIliilIlll = 91;
   private boolean IiIlIiIlll;
   private static final int iiIIIiIlll = -16050415;
   private float iIIlIiIlll;
   private boolean IilIIiIlll;
   private long ilIlIiIlll;
   private static final int iiliilIlll = 175;
   private final boolean IliIIiIlll;
   private long iIllIiIlll;
   private final iIliililIlliilil IIIlIiIlll;
   private static final String IIlIIiIlll = "Corz Client";
   private static final int IiiiilIlll = -4000;
   private static final int llIiilIlll = 18;
   private static final class_2960 iIlIIiIlll = class_2960.method_60655(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final iliiIiIiIiiiIiIi lIIlIiIlll;
   private final long lliIIiIlll;
   private boolean IIiIIiIlll;
   private static final int lIiiilIlll = 10;
   private static final int illiilIlll = 14;
   private static final int IlIiilIlll = 300;
   private static final int IIiiilIlll = 9;
   private static final float liiiilIlll = 320.0F;
   private static final float iiiiilIlll = 120.0F;
   private static final int llliilIlll = 24;
   private final class_437 IllIIiIlll;
   private final class_4587 illIIiIlll;
   private String liIlIiIlll;
   private long iliIIiIlll;
   private static final float iIIIIiIlll = 230.0F;
   private static final float lIIIIiIlll = 38.0F;
   private boolean iilIIiIlll;
   private static final float IlIIIiIlll = 4.0F;
   private int IIllIiIlll;
   private static final float IIIIIiIlll = 70.0F;
   private static final float ilIIIiIlll = 0.78F;
   private static final float llIIIiIlll = 1.8E8F;
   private final boolean iIiIIiIlll;
   private final boolean lllIIiIlll;
   private static final int IlliilIlll = 22;
   private static final int liIiilIlll = 54;
   private static final int IliiilIlll = 79;
   private final IIllIIIllIllIIIl iiiIIiIlll;
   private static final int IIliilIlll = 10;
   private static final int ilIiilIlll = 28;
   private static final long IiIIIiIlll = 1500L;
   private static final int IiliilIlll = 18;
   private static final int liliilIlll = 143;
   private static final int iiIiilIlll = 14;
   private static final int lIliilIlll = 69;
   private volatile boolean lIiIIiIlll;
   private static final class_3414 lIlIIiIlll = class_3414.method_47908(class_2960.method_60655(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()));
   private int lIllIiIlll;
   private String iiIlIiIlll;

   private void Iiiiliiiiiii(boolean toClient) {
      class_310 var2 = class_310.method_1551();
      if (toClient) {
         var2.method_1507(new lillliiliillliil());
      } else {
         var2.method_1507(this.IllIIiIlll);
      }

      if (!(var2.field_1755 instanceof Iilililiiili)) {
         var2.method_15993();
      }

   }

   protected void method_25426() {
      if (!this.IilIIiIlll) {
         this.IilIIiIlll = true;
         class_310.method_1551().method_15993();
      } else {
         super.method_25426();
      }
   }

   private void IiIlliIliiIl(class_332 ctx, float cx, float now, long y) {
      long var12 = -5682808800498653326L;
      String var6;
      if (this.lIiIIiIlll) {
         var6 = IliIlllilIi<invokedynamic>();
         var12 ^= (-32772477369188352L ^ var12) & -1L << 32;
      } else if (this.liiIIiIlll != null) {
         var6 = this.liiIIiIlll;
         var12 ^= (-32772477369188352L ^ var12) & -1L << 32;
      } else if (this.IiiIIiIlll && !IIIIIllllIIIIlll.IIIilIIiiIIi()) {
         var6 = this.IlIillIiilIi();
         var12 ^= (-7520328821506048L ^ var12) & -1L << 32;
      } else if (this.IiiIIiIlll) {
         var6 = IIIIIllllIIIIlll.Iiilliiliiil();
         var12 ^= (-55501723472494592L ^ var12) & -1L << 32;
      } else {
         var6 = IliIlllilIi<invokedynamic>();
         var12 ^= (-32772477369188352L ^ var12) & -1L << 32;
      }

      long var8 = System.nanoTime();
      if (this.liIlIiIlll == null) {
         this.liIlIiIlll = var6;
         this.IIllIiIlll = (int)(var12 >>> 32);
      } else if (!var6.equals(this.liIlIiIlll) || (int)(var12 >>> 32) != this.IIllIiIlll) {
         this.iiIlIiIlll = this.liIlIiIlll;
         this.lIllIiIlll = this.IIllIiIlll;
         this.liIlIiIlll = var6;
         this.IIllIiIlll = (int)(var12 >>> 32);
         this.iIllIiIlll = var8;
      }

      float var10 = this.iIllIiIlll == 0L ? 1.0F : llilliilililliil.liiiIIllIl((float)(var8 - this.iIllIiIlll) / 1.8E8F);
      if (var10 >= 1.0F) {
         this.iiIlIiIlll = null;
      }

      float var11 = llilliilililliil.IllIllllIl(now, 10.0F, 0.82F);
      if (this.iiIlIiIlll != null) {
         this.IIlllIlliIll(ctx, this.iiIlIiIlll, this.lIllIiIlll, cx, var11 - 3.0F * var10, 1.0F - var10, "");
      }

      this.IIlllIlliIll(ctx, this.liIlIiIlll, this.IIllIiIlll, cx, var11 + 3.0F * (1.0F - var10), var10, this.lIiIIiIlll ? IIIilIIiiIIi(y) : "");
   }

   private static String IIIilIIiiIIi(long now) {
      long var3 = 308566371886917089L;
      var3 ^= ((long)((int)(now / 350L % 4L)) << 32 ^ var3) & -1L << 32;
      return IliIlllilIi<invokedynamic>().repeat((int)(var3 >>> 32));
   }

   private void IlIlllIlilIl(class_332 w, int ctx, int mx, int y, int x, int my) {
      long var16 = -4366050820615315931L;
      long var14 = 8324893005245175430L;
      IIliiIlllIliiIll var7 = llilliilililliil.IIiilIiiiIii();
      var14 ^= ((long)(!this.lIiIIiIlll && llilliilililliil.Iliilliiilii((double)x, (double)my, (float)ctx, (float)mx, (float)y, 24.0F) ? 1 : 0) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)(this.IiiIIiIlll && !this.lIiIIiIlll && this.liiIIiIlll == null && !IIIIIllllIIIIlll.IIIilIIiiIIi() ? 1 : 0) ^ var14) & -1L >>> 32;
      float var10 = llilliilililliil.IlIillIiilIi(w, (float)ctx, (float)mx, (float)y, 24.0F, lIlIIiliIlIIil.IIIIllIIIl(IliIlllilIi<invokedynamic>()), this.IIIlIiIlll.iliIiiliiiii(IliIlllilIi<invokedynamic>(), this.iilIIiIlll ? 1.0F : 0.0F, 16.0F), this.IIIlIiIlll.IIIllIIliIIl(IliIlllilIi<invokedynamic>(), (boolean)((int)(var14 >>> 32))), this.IIIlIiIlll.iliIiiliiiii(IliIlllilIi<invokedynamic>(), (int)var14 != 0 ? 1.0F : 0.0F, 12.0F));
      var16 ^= ((long)var7.IlIillIiilIi(mx, 24) << 32 ^ var16) & -1L << 32;
      String var12 = this.Iiilliiliiil(this.lilIIiIlll.toString(), (float)(ctx + y) - 9.0F - var10);
      if (this.lilIIiIlll.length() == 0) {
         llilliilililliil.iiIIlIIlIl(IliIlllilIi<invokedynamic>(), var10, (float)((int)(var16 >>> 32)), llilliilililliil.IIIIllIIIl(-7630437, 0.55F));
      } else {
         if (this.IIiIIiIlll) {
            float var13 = (float)((int)var7.IilliliilIIi() + 2);
            IIIiiIillIIiiIil.IlIlllIlilIl(w, var10 - 1.5F, (float)mx + (24.0F - var13) / 2.0F, llilliilililliil.llIIlilIIl(var12) + 3.0F, var13, 2.0F, IilIIIIililIIIIi.IIlllIlliIll(0.32));
         }

         llilliilililliil.iiIIlIIlIl(var12, var10, (float)((int)(var16 >>> 32)), -920587);
      }

      if (this.iilIIiIlll && !this.lIiIIiIlll && !this.IIiIIiIlll) {
         var16 ^= ((long)((int)var7.IilliliilIIi() - 2) ^ var16) & -1L >>> 32;
         this.lIIlIiIlll.iIlIlllllill(w, var10 + (this.lilIIiIlll.length() == 0 ? 0.0F : llilliilililliil.llIIlilIIl(var12) + 1.0F), mx + (24 - (int)var16) / 2, (int)var16, IlIIilIlllIIilIl.lliiIlliIl, llIilillilIilill.liiiIIllIl());
      }

      this.iiiIIiIlll.liiiIIllIl((float)ctx, (float)mx, (float)y, 24.0F, this::IIlilIliiIli);
   }

   private void IIillIiliIil(class_332 px, int now, int py, int ctx, long cardH) {
      long var14 = -7084288147409642367L;
      float var7 = (float)(cardH - this.iliIIiIlll);
      float var8 = (float)now + 150.0F;
      float var9 = (float)py + (float)ctx / 2.0F - 24.0F;
      float var10 = 22.0F * llilliilililliil.IilliliilIIi((var7 - 60.0F) / 340.0F, 1.7F);
      if (var10 > 0.25F) {
         IIIiiIillIIiiIil.IiIlliIliiIl(px, var8 - var10, var9 - var10, var10 * 2.0F, var10 * 2.0F, var10, llilliilililliil.IIIIllIIIl(-12922502, 0.34F), 16.0F, 0.9F);
         IIIiiIillIIiiIil.IlIlllIlilIl(px, var8 - var10, var9 - var10, var10 * 2.0F, var10 * 2.0F, var10, -12922502);
         float var11 = llilliilililliil.liiiIIllIl((var7 - 220.0F) / 200.0F);
         if (var11 > 0.002F) {
            float var12 = 24.0F;
            var14 ^= ((long)llilliilililliil.IlIlllIlilIl(px, var8, var9, 0.6F + 0.4F * llilliilililliil.IilliliilIIi((var7 - 220.0F) / 300.0F, 2.0F)) << 32 ^ var14) & -1L << 32;
            iiIlilIlIIllilIl.IliIlllilIi(var8 - var12 / 2.0F, var9 - var12 / 2.0F, var12, var12, lIlIIiliIlIIil.liiiIIllIl(), new Color(llilliilililliil.IIIIllIIIl(-1, var11), true), IIIiiIillIIiiIil.liiiIIllIl());
            llilliilililliil.IiIlliIliiIl(px, (boolean)((int)(var14 >>> 32)));
         }
      }

      float var16 = var9 + 22.0F + 14.0F;
      this.Ililllililil(liiiIIllIl((var7 - 360.0F) / 300.0F), () -> llilliilililliil.IiiIlliiIl(px, IliIlllilIi<invokedynamic>(), llilliilililliil.IIIllIIliIIl(var8 - llilliilililliil.IiIIlliIIl(IliIlllilIi<invokedynamic>(), 1.22F) / 2.0F), var16, 14.0F));
      this.Ililllililil(liiiIIllIl((var7 - 560.0F) / 300.0F), () -> this.Iilllilliill(IliIlllilIi<invokedynamic>(), var8, var16 + 14.0F + 3.0F, -7630437));
   }

   public boolean method_25421() {
      return false;
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) >>> 5))) << 7 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) >>> 5))) >>> 9) << 6 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) >>> 5))) << 7 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') >>> 12 | (char)((char)((char)((char)(var4[var5] - var5) - var5) ^ var5) - '菼') << 4) - var5) - var5) ^ 18319) - var5) - 'ﳀ') << 3) + var5) ^ var5))) >>> 5))) >>> 9) >>> 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Illillliilli() {
      if (!this.lIiIIiIlll && this.iliIIiIlll <= 0L) {
         String var1 = this.lilIIiIlll.toString().trim();
         if (var1.isEmpty()) {
            this.liiIIiIlll = IliIlllilIi<invokedynamic>();
         } else {
            this.liiIIiIlll = null;
            this.lIiIIiIlll = true;
            Thread var2 = new Thread(() -> {
               try {
                  IIIIIllllIIIIlll.iIlIlllllill(var1);
               } finally {
                  this.lIiIIiIlll = false;
                  this.IiiIIiIlll = true;
               }

            }, IliIlllilIi<invokedynamic>());
            var2.setDaemon(true);
            var2.start();
         }
      }
   }

   public boolean method_25404(class_11908 input) {
      long var5 = -403763878856109750L;
      if (this.iliIIiIlll <= 0L && this.ilIlIiIlll == 0L) {
         var5 ^= ((long)input.comp_4795() << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)((input.comp_4797() & 10) != 0 ? 1 : 0) ^ var5) & -1L >>> 32;
         if ((int)(var5 >>> 32) == 256) {
            this.Iliilliiilii();
            return true;
         } else if (this.iIiIIiIlll) {
            return true;
         } else if ((int)(var5 >>> 32) != 257 && (int)(var5 >>> 32) != 335) {
            if (!this.iilIIiIlll) {
               return true;
            } else if ((int)(var5 >>> 32) == 65 && (int)var5 != 0) {
               this.IIiIIiIlll = this.lilIIiIlll.length() > 0;
               return true;
            } else if ((int)(var5 >>> 32) != 259 && (int)(var5 >>> 32) != 261) {
               if ((int)(var5 >>> 32) == 86 && (int)var5 != 0) {
                  try {
                     String var4 = class_310.method_1551().field_1774.method_1460();
                     if (var4 != null) {
                        if (this.IIiIIiIlll) {
                           this.Iilililiiili();
                           this.IIiIIiIlll = false;
                        }

                        this.IIiilIiiiIii(var4.trim());
                        this.IiIiliIiiiIi();
                     }
                  } catch (Exception var7) {
                  }

                  return true;
               } else {
                  return true;
               }
            } else {
               if (!this.IIiIIiIlll && (int)var5 == 0) {
                  if (this.lilIIiIlll.length() > 0) {
                     this.lilIIiIlll.deleteCharAt(this.lilIIiIlll.length() - 1);
                     this.IiIiliIiiiIi();
                  }
               } else {
                  if (this.lilIIiIlll.length() > 0) {
                     this.Iilililiiili();
                     this.IiIiliIiiiIi();
                  }

                  this.IIiIIiIlll = false;
               }

               return true;
            }
         } else {
            this.Illillliilli();
            return true;
         }
      } else {
         return true;
      }
   }

   private String Iiilliiliiil(String maxW, float s) {
      long var5 = -8056332606996879740L;
      IIliiIlllIliiIll var3 = llilliilililliil.IIiilIiiiIii();
      if (!maxW.isEmpty() && !(var3.iIlIlllllill(maxW) <= s)) {
         for(var5 ^= (0L ^ var5) & -1L << 32; (int)(var5 >>> 32) < maxW.length() && var3.iIlIlllllill(maxW.substring((int)(var5 >>> 32))) > s; var5 += 4294967296L) {
         }

         return maxW.substring((int)(var5 >>> 32));
      } else {
         return maxW;
      }
   }

   private void IIlllIlliIll(class_332 cx, String alpha, int label, float y, float color, float ctx, String tail) {
      if (!(ctx <= 0.002F)) {
         if (label == -7630437) {
            float var9 = llilliilililliil.IIIllIIliIIl(y - llilliilililliil.IiIIlliIIl(alpha, 0.82F) / 2.0F);
            llilliilililliil.lIlIliIlIl(alpha + tail, var9, color, 0.82F, llilliilililliil.IIIIllIIIl(label, ctx));
         } else {
            float var8 = llilliilililliil.IIIllIIliIIl(y - llilliilililliil.iIlIiIllIi(alpha) / 2.0F);
            llilliilililliil.IIlIilIlIi(cx, llilliilililliil.IIIIllIIIl(label, ctx), llilliilililliil.IIIIllIIIl(IilIIIIililIIIIi.Illlllllilll(label, -1, 0.22), ctx), alpha, var8, color, ctx >= 1.0F);
         }
      }
   }

   private void iliIiiliiiii(class_332 ctx, int px, int entry, boolean mx, int now, int my, long py) {
      long var17 = -11299530781958722L;
      long var19 = -9088730036330029058L;
      long var15 = -2220155719495197629L;
      var15 ^= ((long)(px + 150) << 32 ^ var15) & -1L << 32;
      var15 ^= ((long)(px + 18) ^ var15) & -1L >>> 32;
      var17 ^= (1133871366144L ^ var17) & -1L << 32;
      this.lIiiIiIlilli(0, () -> {
         long var6 = 3428886086457757789L;
         float var4 = (float)(entry + 18) + 14.0F;
         IIIiiIillIIiiIil.IiIlliIliiIl(ctx, (float)cx - 1.0F, var4 - 1.0F, 2.0F, 2.0F, 1.0F, IilIIIIililIIIIi.IIlllIlliIll(0.2 + 0.06 * (double)iIlIlllllill(3.6)), 30.0F, 1.0F);
         var6 ^= ((long)llilliilililliil.IlIlllIlilIl(ctx, (float)cx, var4, 0.82F + 0.18F * llilliilililliil.IilliliilIIi((this.iIIlIiIlll - 70.0F) / 380.0F, 1.8F)) << 32 ^ var6) & -1L << 32;
         iiIlilIlIIllilIl.IliIlllilIi((float)cx - 14.0F, (float)(entry + 18), 28.0F, 28.0F, iIlIIiIlll, new Color(-920587, true), IIIiiIillIIiiIil.liiiIIllIl());
         llilliilililliil.IiIlliIliiIl(ctx, (boolean)((int)(var6 >>> 32)));
      });
      this.lIiiIiIlilli(1, () -> {
         llilliilililliil.IiiIlliiIl(ctx, IliIlllilIi<invokedynamic>(), llilliilililliil.IIIllIIliIIl((float)cx - llilliilililliil.IiIIlliIIl(IliIlllilIi<invokedynamic>(), 1.22F) / 2.0F), (float)(entry + 54), 14.0F);
         this.Iilllilliill(mx ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), (float)cx, (float)(entry + 69), -7630437);
      });
      if (mx) {
         var17 ^= ((long)(entry + 91) ^ var17) & -1L >>> 32;
         var19 ^= ((long)((int)var17 + 24 + 6) << 32 ^ var19) & -1L << 32;
         this.lIiiIiIlilli(2, () -> this.IlIlllIlilIl(ctx, x, fieldY, w, now, my));
         this.lIiiIiIlilli(3, () -> llilliilililliil.Iillllilll(ctx, this.iiiIIiIlll, this.IIIlIiIlll, IliIlllilIi<invokedynamic>(), this.lIiIIiIlll ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), (class_2960)null, (float)(ctxx + buttonY), (float)myx, 24.0F, (float)buttonY, now, my, !this.lIiIIiIlll, this::Illillliilli));
         this.lIiiIiIlilli(4, () -> this.IiIlliIliiIl(ctx, (float)buttonY, (float)(cx + 24 + 8), py));
         var19 ^= ((long)(entry + 175) ^ var19) & -1L >>> 32;
      } else {
         String var13 = IIIIIllllIIIIlll.Iiilliiliiil();
         var19 ^= ((long)IIIIIllllIIIIlll.IIIilIIiiIIi() << 32 ^ var19) & -1L << 32;
         this.lIiiIiIlilli(2, () -> this.IIIllIIliIIl(ctx, var13, ctxx, (float)cx, (float)(entry + 91)));
         this.lIiiIiIlilli(3, () -> this.Iilllilliill(IliIlllilIi<invokedynamic>(), (float)py, (float)(entry + 91 + 22 + 8), -7630437));
         var19 ^= ((long)(entry + 143) ^ var19) & -1L >>> 32;
      }

      var17 ^= ((long)((int)var19 + 9) ^ var17) & -1L >>> 32;
      this.lIiiIiIlilli(5, () -> {
         IIIiiIillIIiiIil.IilliliilIIi(ctx, (float)ctxx, (float)tailY, (float)x, IIIiiIillIIiiIil.Illlllllilll(), IilIIIIililIIIIi.IIillIiliIil());
         String var6 = "MogWarts on Top";
         String var10000;
         if (var6 == null) {
            var10000 = IliIlllilIi<invokedynamic>();
         } else if (var6.length() > 10) {
            var10000 = var6;
            boolean var10001 = false;
            boolean var10002 = true;
         } else {
            var10000 = var6;
         }

         String var7 = var10000;
         this.Illlllllilll(IliIlllilIi<invokedynamic>(), var7, ctxx, w, x);
         this.Illlllllilll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>() + IIIIIllllIIIIlll.IIillIiliIil(), ctxx, w + 14, x);
      });
      this.lIiiIiIlilli(6, () -> llilliilililliil.lIilliIill(ctx, this.iiiIIiIlll, this.IIIlIiIlll, IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (float)(mx + w), (float)(myx + 28 + 10), 18.0F, now, my, false, this::Iliilliiilii));
   }

   public IIIiiiIllIIiiiIl(class_437 preview, boolean parent, boolean openClientOnSuccess) {
      super(class_2561.method_43470(IliIlllilIi<invokedynamic>()));
      this.illIIiIlll = new class_4587();
      this.IilIIiIlll = false;
      this.lilIIiIlll = new StringBuilder();
      this.iilIIiIlll = true;
      this.IIiIIiIlll = false;
      this.lIiIIiIlll = false;
      this.lliIIiIlll = System.nanoTime();
      this.iliIIiIlll = -1L;
      this.IiiIIiIlll = false;
      this.liiIIiIlll = null;
      this.iiiIIiIlll = new IIllIIIllIllIIIl();
      this.IIIlIiIlll = new iIliililIlliilil();
      this.lIIlIiIlll = new iliiIiIiIiiiIiIi();
      this.iIIlIiIlll = 0.0F;
      this.IlIlIiIlll = 1.0F;
      this.llIlIiIlll = 1.0F;
      this.ilIlIiIlll = 0L;
      this.IiIlIiIlll = false;
      this.liIlIiIlll = null;
      this.iiIlIiIlll = null;
      this.IIllIiIlll = 0;
      this.lIllIiIlll = 0;
      this.iIllIiIlll = 0L;
      this.IllIIiIlll = preview;
      this.lllIIiIlll = parent;
      this.IliIIiIlll = openClientOnSuccess;
      this.iIiIIiIlll = !openClientOnSuccess && IIIIIllllIIIIlll.IiIlliIliiIl();
      liIIIIIiiiIIIIIi.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) << 15 | (char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 1) ^ var5) - '误') + '輹') + '륹') + '輂'))))) >>> 13 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) << 15 | (char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 1) ^ var5) - '误') + '輹') + '륹') + '輂'))))) << 3))) - 1370))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiIiliIiiiIi() {
      this.IiiIIiIlll = false;
      this.liiIIiIlll = null;
      this.lIIlIiIlll.IliIlllilIi();
   }

   private void Iilililiiili() {
      long var2 = -3951753839491808358L;

      for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.lilIIiIlll.length(); var4 += 4294967296L) {
         this.lilIIiIlll.setCharAt((int)(var4 >>> 32), '\u0000');
      }

      this.lilIIiIlll.setLength(0);
   }

   public boolean method_25402(class_11909 doubled, boolean click) {
      if (this.iliIIiIlll <= 0L && this.ilIlIiIlll == 0L) {
         if (this.iiiIIiIlll.IilliliilIIi((double)this.IilliliilIIi(doubled.comp_4798(), this.field_22789), (double)this.IilliliilIIi(doubled.comp_4799(), this.field_22790))) {
            return true;
         } else if (this.iIiIIiIlll) {
            return true;
         } else {
            this.iilIIiIlll = false;
            this.IIiIIiIlll = false;
            return true;
         }
      } else {
         return true;
      }
   }

   public void method_25394(class_332 my, int delta, int ctx, float mx) {
      long var23 = 415323616429366127L;
      long var25 = 740725443517707612L;
      long var27 = 448769316973171485L;
      long var29 = -7625982885339526527L;
      long var31 = 1860789707276339216L;
      llIilillilIilill.IliIlllilIi();
      IlIIilIlllIIilIl.IilliliilIIi();
      CorzClient.fontManager.iIlIlllllill(this.illIIiIlll);
      IIIiiIillIIiiIil.IliIlllilIi(this.illIIiIlll);
      IliiIilliiIi.ilIlllIIlIiIlllIIl = 1.0F;
      long var5 = System.currentTimeMillis();
      long var7 = System.nanoTime();
      if (this.ilIlIiIlll != 0L && (float)(var7 - this.ilIlIiIlll) / 1000000.0F >= 120.0F) {
         this.Iiiiliiiiiii(this.IiIlIiIlll);
      } else {
         if (this.ilIlIiIlll == 0L && this.iliIIiIlll < 0L && !this.iIiIIiIlll && (!this.IliIIiIlll || this.IiiIIiIlll) && IIIIIllllIIIIlll.IiIlliIliiIl()) {
            this.iliIIiIlll = var5;
            this.lIiIIiIlll = false;
            this.Iilililiiili();
            class_310.method_1551().method_1483().method_4873(class_1109.method_4757(lIlIIiIlll, 1.0F, 1.0F));
         }

         if (this.iliIIiIlll > 0L && var5 - this.iliIIiIlll > 1500L) {
            this.method_25419();
         } else {
            var23 ^= ((long)(this.ilIlIiIlll != 0L ? 1 : 0) << 32 ^ var23) & -1L << 32;
            this.iIIlIiIlll = (float)(var7 - this.lliIIiIlll) / 1000000.0F;
            float var10 = (int)(var23 >>> 32) != 0 ? (float)(var7 - this.ilIlIiIlll) / 1.2E8F : this.iIIlIiIlll / 320.0F;
            float var11 = this.iliIIiIlll > 0L ? 1.0F - liiiIIllIl((float)(var5 - this.iliIIiIlll - 1200L) / 300.0F) : 1.0F;
            var23 ^= ((long)(!this.iIiIIiIlll ? 1 : 0) ^ var23) & -1L >>> 32;
            var25 ^= ((long)(((int)var23 != 0 ? 175 : 143) + 79) << 32 ^ var25) & -1L << 32;
            this.llIlIiIlll = Math.min(1.0F, Math.min((float)(this.field_22789 - 16) / 300.0F, (float)(this.field_22790 - 16) / (float)((int)(var25 >>> 32))));
            var25 ^= ((long)((this.field_22789 - 300) / 2) ^ var25) & -1L >>> 32;
            var27 ^= ((long)((this.field_22790 - (int)(var25 >>> 32)) / 2) << 32 ^ var27) & -1L << 32;
            var27 ^= ((long)((int)(var23 >>> 32) == 0 && this.iliIIiIlll <= 0L ? 1 : 0) ^ var27) & -1L >>> 32;
            var29 ^= ((long)((int)var27 != 0 ? this.IilliliilIIi((double)delta, this.field_22789) : -4000) << 32 ^ var29) & -1L << 32;
            var29 ^= ((long)this.IilliliilIIi((double)ctx, this.field_22790) ^ var29) & -1L >>> 32;
            float var19 = this.iliIIiIlll > 0L ? llilliilililliil.liiiIIllIl((float)(var5 - this.iliIIiIlll) / 260.0F) : 0.0F;
            this.IlIlIiIlll = this.iliIIiIlll > 0L ? 1.0F - llilliilililliil.IliIlllilIi((float)(var5 - this.iliIIiIlll) / 140.0F) : 1.0F;
            llilliilililliil.Ililllililil(my, (float)this.field_22789, (float)this.field_22790, 0.78F * llilliilililliil.Iilllilliill(var10, (boolean)((int)(var23 >>> 32))) * var11);
            this.iiiIIiIlll.IliIlllilIi();
            var31 ^= ((long)llilliilililliil.IlIlllIlilIl(my, (float)this.field_22789 / 2.0F, (float)this.field_22790 / 2.0F, llilliilililliil.Illlllllilll(var10, (boolean)((int)(var23 >>> 32))) * (0.97F + 0.03F * var11) * this.llIlIiIlll) << 32 ^ var31) & -1L << 32;
            float var21 = IliiIilliiIi.IilliliilIIi(llilliilililliil.IIlllIlliIll(var10, (boolean)((int)(var23 >>> 32))) * var11);

            try {
               llilliilililliil.IIIilIIiiIIi(my, (float)((int)var25), (float)((int)(var27 >>> 32)), 300.0F, (float)((int)(var25 >>> 32)), IilIIIIililIIIIi.Illlllllilll(llilliilililliil.IIillIiliIil(), -16050415, (double)var19), IilIIIIililIIIIi.Illlllllilll(352321535, llilliilililliil.IIIIllIIIl(-12922502, 0.42F), (double)var19));
               iilIllIiIIiIllIi.IIIllIIliIIl(my, 2, (float)((int)var25), (float)((int)(var27 >>> 32)), 300.0F, 97.0F, 10.0F, 0.85F * (1.0F - var19));
               if (this.IlIlIiIlll > 0.002F) {
                  this.iliIiiliiiii(my, (int)var25, (int)(var27 >>> 32), (boolean)((int)var23), (int)(var29 >>> 32), (int)var29, var5);
               }

               if (this.iliIIiIlll > 0L) {
                  this.IIillIiliIil(my, (int)var25, (int)(var27 >>> 32), (int)(var25 >>> 32), var5);
               }
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var21);
               llilliilililliil.IiIlliIliiIl(my, (boolean)((int)(var31 >>> 32)));
            }

            super.method_25394(my, delta, ctx, mx);
         }
      }
   }

   private void IIlilIliiIli() {
      this.iilIIiIlll = true;
      this.IIiIIiIlll = false;
      this.lIIlIiIlll.IliIlllilIi();
   }

   public IIIiiiIllIIiiiIl(class_437 parent) {
      this(parent, false);
   }

   private void Ililllililil(float body, Runnable shown) {
      if (!(body <= 0.002F)) {
         class_4587 var3 = IIIiiIillIIiiIil.liiiIIllIl();
         var3.method_22903();
         var3.method_46416(0.0F, (1.0F - body) * 4.0F, 0.0F);
         float var4 = IliiIilliiIi.IilliliilIIi(body);

         try {
            shown.run();
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var4);
            var3.method_22909();
         }

      }
   }

   private void lIiiIiIlilli(int index, Runnable body) {
      float var3 = llilliilililliil.liiiIIllIl((this.iIIlIiIlll - 70.0F - (float)index * 38.0F) / 230.0F);
      float var4 = var3 * this.IlIlIiIlll;
      if (!(var4 <= 0.002F)) {
         class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
         var5.method_22903();
         var5.method_46416(0.0F, (1.0F - var3) * 4.0F, 0.0F);
         float var6 = IliiIilliiIi.IilliliilIIi(var4);

         try {
            body.run();
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var6);
            var5.method_22909();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) ^ '\ue786'))) ^ 32168) >>> 14 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) + var5) ^ '\ue786'))) ^ 32168) << 2) + '\uf683') - 5833) ^ var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) << 15 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) >>> 1) ^ var5) ^ 24571) ^ 'ꕅ') ^ '맆') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) << 15 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) >>> 1) ^ var5) ^ 24571) ^ 'ꕅ') ^ '맆') << 3) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) << 15 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) >>> 1) ^ var5) ^ 24571) ^ 'ꕅ') ^ '맆') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) << 15 | (char)((char)((char)((char)(-((char)(var4[var5] + var5))) - '딠') ^ '껌') - 7113) >>> 1) ^ var5) ^ 24571) ^ 'ꕅ') ^ '맆') << 3) + var5) << 13) + '蘞'))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 13 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 3))) - '\uee6f') ^ var5) ^ 15112))))) - 9456) ^ var5) >>> 15 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) << 13 | (char)((char)(var4[var5] - var5) >>> 2 | (char)(var4[var5] - var5) << 14) >>> 3))) - '\uee6f') ^ var5) ^ 15112))))) - 9456) ^ var5) << 1) - '踏') + 5655) + 22138));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean method_25400(class_11905 input) {
      long var3 = 6478961959688000932L;
      if (this.iliIIiIlll <= 0L && !this.iIiIIiIlll && this.ilIlIiIlll == 0L) {
         if (!this.iilIIiIlll) {
            return false;
         } else {
            var3 ^= ((long)((char)input.comp_4793()) << 32 ^ var3) & -1L << 32;
            if ((int)(var3 >>> 32) >= 32 && (int)(var3 >>> 32) != 127) {
               if (this.IIiIIiIlll) {
                  this.Iilililiiili();
                  this.IIiIIiIlll = false;
               }

               if (this.lilIIiIlll.length() < 128) {
                  this.lilIIiIlll.append((char)((int)(var3 >>> 32)));
                  this.IiIiliIiiiIi();
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   private static float liiiIIllIl(float t) {
      t = llilliilililliil.IliIlllilIi(t);
      return t * t * (3.0F - 2.0F * t);
   }

   private void IIIllIIliIIl(class_332 y, String ctx, boolean ok, float cx, float label) {
      long var16 = -7511160878249640139L;
      var16 ^= ((long)(ok ? -12922502 : -1750963) << 32 ^ var16) & -1L << 32;
      float var7 = 6.0F;
      float var8 = 6.0F;
      float var9 = 10.0F;
      float var10 = 12.0F;
      float var11 = var9 + var7 + var8 + (float)Math.ceil((double)llilliilililliil.llIIlilIIl(ctx)) + var10;
      float var12 = llilliilililliil.IIIllIIliIIl(cx - var11 / 2.0F);
      float var13 = iIlIlllllill(ok ? 2.4 : 3.4);
      IIIiiIillIIiiIil.Iilllilliill(y, var12, label, var11, 22.0F, 11.0F, llilliilililliil.IIIIllIIIl((int)(var16 >>> 32), 0.13F), llilliilililliil.IIIIllIIIl((int)(var16 >>> 32), 0.42F));
      float var14 = var12 + var9;
      float var15 = label + (22.0F - var7) / 2.0F + 0.5F;
      IIIiiIillIIiiIil.IIlllIlliIll(y, var14, var15, var7, var7, var7 / 2.0F, llilliilililliil.IIIIllIIIl((int)(var16 >>> 32), 0.3F + 0.34F * var13), 3.0F + 2.5F * var13, 0.8F);
      IIIiiIillIIiiIil.IlIlllIlilIl(y, var14, var15, var7, var7, var7 / 2.0F, (int)(var16 >>> 32));
      llilliilililliil.iiIIlIIlIl(ctx, var14 + var7 + var8, (float)llilliilililliil.IIiilIiiiIii().IlIillIiilIi(Math.round(label), 22), IilIIIIililIIIIi.Illlllllilll((int)(var16 >>> 32), -1, 0.3));
   }

   private String IlIillIiilIi() {
      String var1 = IIIIIllllIIIIlll.Iiilliiliiil();
      String var2 = IIIIIllllIIIIlll.Iilllilliill();
      return !IIIIIllllIIIIlll.IIIilIIiiIIi() && var2 != null && !var2.isEmpty() ? var2 : var1;
   }

   private int IilliliilIIi(double span, int v) {
      return (int)Math.round((double)v / (double)2.0F + (span - (double)v / (double)2.0F) / (double)this.llIlIiIlll);
   }

   public IIIiiiIllIIiiiIl(class_437 parent, boolean openClientOnSuccess) {
      this(parent, openClientOnSuccess, false);
   }

   private void Iliilliiilii() {
      if (this.ilIlIiIlll == 0L) {
         this.ilIlIiIlll = System.nanoTime();
         this.IiIlIiIlll = this.lllIIiIlll && IIIIIllllIIIIlll.IiIlliIliiIl();
      }
   }

   private void Illlllllilll(String label, String y, int x, int value, int w) {
      float var6 = llilliilililliil.IllIllllIl((float)value, 14.0F, 0.82F);
      llilliilililliil.lIlIliIlIl(label, (float)x, var6, 0.82F, -7630437);
      llilliilililliil.lIlIliIlIl(y, llilliilililliil.IIIllIIliIIl((float)(x + w) - llilliilililliil.IiIIlliIIl(y, 0.82F)), var6, 0.82F, -920587);
   }

   private static float iIlIlllllill(double seconds) {
      return (float)((Math.sin((double)System.nanoTime() / (double)1.0E9F * Math.PI * (double)2.0F / seconds) + (double)1.0F) / (double)2.0F);
   }

   private void IIiilIiiiIii(String s) {
      long var4 = 6682753750745020977L;

      for(var4 ^= (0L ^ var4) & -1L << 32; (int)(var4 >>> 32) < s.length() && this.lilIIiIlll.length() < 128; var4 += 4294967296L) {
         var4 ^= ((long)s.charAt((int)(var4 >>> 32)) ^ var4) & -1L >>> 32;
         if ((int)var4 >= 32 && (int)var4 != 127) {
            this.lilIIiIlll.append((char)((int)var4));
         }
      }

   }

   private void Iilllilliill(String s, float y, float cx, int argb) {
      llilliilililliil.lIlIliIlIl(s, llilliilililliil.IIIllIIliIIl(y - llilliilililliil.IiIIlliIIl(s, 0.82F) / 2.0F), llilliilililliil.IllIllllIl(cx, 10.0F, 0.82F), 0.82F, argb);
   }

   public void method_25420(class_332 delta, int mx, int ctx, float my) {
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2427034071965779087L ^ Long.rotateLeft(3500461281951833905L, 42) ^ -2773194153520784549L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4420604845436824354L ^ Long.rotateLeft(864966460170703273L, 13) ^ -2560617921485361455L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2525956890685444373L ^ Long.rotateLeft(-729654153748671548L, 25) ^ 4345198731393504327L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4935650661109485220L ^ Long.rotateLeft(-8983509773934192276L, 27) ^ 8529760354190497628L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8838707135811803905L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7797034474612680817L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 514833020994917604L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1664925063648042206L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4953317587380546291L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7407207115440524250L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiiIlliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiiIlIIIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIIlliIIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIllllIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(ilIllIiIll<invokedynamic>());
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

   public void method_25419() {
      this.Iiiiliiiiiii(this.lllIIiIlll && IIIIIllllIIIIlll.IiIlliIliiIl());
   }
}
