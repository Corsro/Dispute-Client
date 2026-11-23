package gg.corz;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Frame;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1041;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3675;
import org.joml.Matrix3x2fStack;
import org.joml.Vector2f;

public class IIIillIIil {
   private static final String[] lliilIiiliilIi;
   private static final float illilIiIililIi = 1.2E8F;
   private volatile String IllIIlilllIIli;
   private List<lliIiIliliIiIl> IliiiIilliiiIi;
   private Ilillillilli IIiIIlilIiIIli;
   private List<iiiliiiIIIiiii> iilIiIiIIiIiIi;
   private String IIllIlilIllIli;
   private static final int llIilIiilIilIi = 620756991;
   private static final int liIllIiiiIllIi = -2054070;
   private static final int iilllIiIIillIi = 6;
   private static final String iIiilIiIliilIi = "strip";
   private final IIllIIIllIllIIIl lliIIliiliIIli;
   private String iIliiIiIlliiIi;
   private final iIliililIlliilil iiiIIliIIIlIli;
   private static final int IIIilIilIIilIi = -45715;
   private String ilIiiIiIiIiiIi;
   private String lIilIliiIilIli;
   private static final int lilIlIiiilIlIi = 50;
   private boolean IlIiiIillIiiIi;
   private static final String lililIiiililIi = "Click again to delete";
   private static final String[] IIliIIilIliIIi;
   private static final long IiIilIiliIilIi = 2500L;
   private String IiiliIiliiliIi;
   private float ililIliIiilIli;
   private static final float iiIilIiIIlilIi = 190.0F;
   private float liilIliiiilIli;
   private static final Iilliiillilliiil[] ilIiIIiIiIiIIi;
   private String IIIIIlilIIIIli;
   private String iIIIIliIlIIIli;
   private static boolean iliiiIiIiiiiIi;
   private long llIliIiilIliIi;
   private volatile String IllliIilllliIi;
   private static final int ilIllIiIiIllIi = 10;
   private boolean lliliIiililiIi;
   private static final String[] iIliIIiIlliIIi;
   private int IlIIiIillIIiIi;
   private static final int iliiIIiIiiiIIi = 36;
   private String IIliiIilIliiIi;
   private boolean llliiIiilliiIi;
   private static final int liillIiiiillIi = -11755009;
   private long IiIiIliliIiIli;
   private int IIlIiIilIlIiIi;
   private List<iiiliiiIIIiiii> lIiIiIiiIiIiIi;
   private final IIllIIIllIllIIIl IiiIIliliiIIli;
   private String iIIliIiIlIliIi;
   private int liIIiIiiiIIiIi;
   private List<String> iIiIIliIliIIli;
   private static final long lIlilIiiIlilIi = 400000000L;
   private final iliiIiIiIiiiIiIi iIiliIiIliliIi;
   private boolean llIiIliilIiIli;
   private static final long IllilIilllilIi = 350000000L;
   private String liIiiIiiiIiiIi;
   private float iIIiIliIlIiIli;
   private String IiliiIililiiIi;
   private static final int illIlIiIilIlIi = 3;
   private static final int lliIlIiiliIlIi = 62;
   private static final int IiIIlIiliIIlIi = 6;
   private String lilliIiiilliIi;
   private Iilliiillilliiil iIlIiIiIllIiIi;
   private int ilIlIliIiIlIli;
   private float IIIiIlilIIiIli;
   private static final String IIiilIilIiilIi = "i:";
   private static final int lllllIiillllIi = 56;
   private static final int lIiiIIiiIiiIIi = 60;
   private static final String[] liIiIIiiiIiIIi;
   private int iliIiIiIiiIiIi;
   private static final int IIIIlIilIIIlIi = 10;
   private static final String[] IiliIIililiIIi;
   private final iIIliiIiIlIliiIi lIIlIliiIIlIli;
   private static final int liiiIIiiiiiIIi = 3;
   private static final int lIIllIiiIIllIi = 20;
   private static final int llIIlIiilIIlIi = 48;
   private static final int IIlllIilIlllIi = 88;
   private final List<iiiliiiIIIiiii> IliIiIilliIiIi;
   private volatile Ilillillilli lIlIIliiIlIIli;
   private int ilIIiIiIiIIiIi;
   private long iillIliIIilIli;
   private static final int iiliIIiIIiiIIi = 2;
   private long iIllIliIlllIli;
   private static final int lIlIlIiiIlIlIi = 16;
   private boolean illliIiIilliIi;
   private List<IlIIillllIIill> IilIiIililIiIi;
   private String IlilIlillilIli;
   private static final int IlillIillillIi = 16;
   private final Vector2f llllIliilllIli;
   private final llIiliiilIilii lIIIiIiiIIIiIi;
   private static final int IliiIIilliiIIi = 3;
   private int liIlIliiiIlIli;
   private static final int IiiIlIiliiIlIi = 24;
   private static final int iIIilIiIlIilIi = -65990120;
   private static final long IiiilIiliiilIi = 1400L;
   private static final int IlIllIillIllIi = 120;
   private List<IlIIillllIIill> lllIiIiillIiIi;
   private final iiiiilIiIIIIIiIi IiIIIliliIIIli;
   private static final int IilllIililllIi = 64;
   private static final int iIiIlIiIliIlIi = 4;
   private volatile String lIlliIiiIlliIi;
   private static final int iiIIlIiIIlIlIi = 4;
   private long IillIlilillIli;
   private long iiIliIiIIlliIi;
   private static final DateTimeFormatter iiiilIiIIIIiIi;
   private static final int iIlllIiIllllIi = 124;
   private String IiIliIiliIliIi;
   private volatile boolean illIIliIilIIli;
   private static final int IllIlIilllIlIi = 10;
   private static final int lIillIiiIillIi = 16;
   private String IIiliIilIiliIi;
   private final iliiIiIiIiiiIiIi iiiliIiIIIiiIi;
   private boolean iiIIIliIIlIIli;
   private static final float ilillIiIiillIi = 0.45F;
   private long llIIIliilIIIli;
   private volatile long lilIIliiilIIli;
   private String lIiiiIiiIiiiIi;
   private boolean lIIiiIiiIIiiIi;
   private static final int IIiIlIilIiIlIi = 12;
   private int IlIlIlillIlIli;
   private volatile List<lliIiIliliIiIl> iiliiIiIIiiiIi;
   private int liiiiIiiiiiiIi;
   private static final Integer[] llliIIiilliIIi;
   private static final int iIIIlIiIlIIlIi = 44;
   private static final int iiiIlIiIIIllIi = 14;
   private String IIIliIilIIliIi;
   private String liiIiIiiiiIiIi;

   private void iIIilIlIil(class_332 mx, IIllIIIllIllIIIl my, lliIiIliliIiIl cardX, int ctx, int target, int cardY, int sc, int cardW) {
      long var18 = 7040213303951764641L;
      IIliiIlllIliiIll var9 = llilliilililliil.IIiilIiiiIii();
      String var10 = cardX.lIillIilliIillIill;
      var18 ^= ((long)llilliilililliil.Iliilliiilii((double)sc, (double)cardW, (float)ctx, (float)target, (float)cardY, 36.0F) << 32 ^ var18) & -1L << 32;
      llilliilililliil.illilIilil(mx, (float)ctx, (float)target, (float)cardY, 36.0F, this.iiiIIliIIIlIli.IIIllIIliIIl(IIlilIliiIli(var10, liIlIliiIlIl<invokedynamic>()), (boolean)((int)(var18 >>> 32))), 0.0F, 0.0F);
      float var12 = (float)(ctx + 8);
      float var13 = (float)(ctx + cardY - 8);
      float var14 = (float)target + 10.0F;
      float var15 = var13 - 16.0F;
      llilliilililliil.IIllllIlll(mx, my, this.iiiIIliIIIlIli, IIlilIliiIli(var10, liIlIliiIlIl<invokedynamic>()), lIlIIiliIlIIil.iIlIlllllill(), var15, var14, 16.0F, 10.0F, sc, cardW, true, () -> this.IilIililIi(var10));
      this.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), var15, var14, 16.0F, 16.0F, sc, cardW, false);
      float var16 = var15 - 6.0F;
      if (!cardX.liillIilliiillIill) {
         var18 ^= ((long)(var10.equals(this.IIllIlilIllIli) && System.currentTimeMillis() < this.iIllIliIlllIli ? 1 : 0) ^ var18) & -1L >>> 32;
         var16 = llilliilililliil.lIilliIill(mx, my, this.iiiIIliIIIlIli, IIlilIliiIli(var10, liIlIliiIlIl<invokedynamic>()), (int)var18 != 0 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>(), var15 - 3.0F, var14, 16.0F, sc, cardW, false, () -> this.llIililIil(var10)) - 6.0F;
      }

      var18 ^= ((long)(cardX.liillIilliiillIill ? -7630437 : (var10.equals(this.lIiiiIiiIiiiIi) ? IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.3) : -920587)) ^ var18) & -1L >>> 32;
      llilliilililliil.iiIIlIIlIl(var10, var12, llilliilililliil.IllIllllIl((float)target + 7.0F, 11.0F, 1.0F), (int)var18);
      if (cardX.liillIilliiillIill) {
         llilliilililliil.iiIilIIlil(mx, liIlIliiIlIl<invokedynamic>(), var12 + llilliilililliil.llIIlilIIl(var10) + 5.0F, (float)target + 7.0F, -1750963);
      }

      llilliilililliil.lIlIliIlIl(var9.Iiilliiliiil(liIlIliiIlIl<invokedynamic>() + cardX.IliIlllilIi(), (var16 - var12) / 0.82F), var12, llilliilililliil.IllIllllIl((float)target + 18.0F, 11.0F, 0.82F), 0.82F, -7630437);
   }

   private float liilliiill(class_332 xRight, IIllIIIllIllIIIl mx, lllililillilil my, float target, float ctx, int c, int by) {
      long var16 = -1290398737342229815L;
      String var8 = String.valueOf(Math.max(0L, my.llIlilIliilIlilIli));
      float var9 = 18.0F + (float)Math.ceil((double)llilliilililliil.IiIIlliIIl(var8, 0.82F)) + 6.0F;
      float var10 = target - var9;
      String var11 = IIlilIliiIli(my.IlIIilIlillIIilIli, liIlIliiIlIl<invokedynamic>());
      float var12 = this.iiiIIliIIIlIli.IIIllIIliIIl(var11, llilliilililliil.Iliilliiilii((double)c, (double)by, var10, ctx, var9, 16.0F));
      float var13 = this.iiiIIliIIIlIli.iliIiiliiiii(var11 + liIlIliiIlIl<invokedynamic>(), my.lIllilIliiIllilIli ? 1.0F : 0.0F, 16.0F);
      var16 ^= ((long)llilliilililliil.IlIlllIlilIl(xRight, var10 + var9 / 2.0F, ctx + 8.0F, this.iiiIIliIIIlIli.IilliliilIIi(var11, 0.05F)) << 32 ^ var16) & -1L << 32;
      IIIiiIillIIiiIil.Ililllililil(xRight, var10, ctx, var9, 16.0F, 5.0F, IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.03 + 0.06 * (double)var12), -45715, 0.12 * (double)var13), IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IIillIiliIil(), 1040187391, (double)var12), llilliilililliil.IIIIllIIIl(-45715, 0.5F), (double)var13));
      var16 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -45715, (double)var12), -45715, (double)var13) ^ var16) & -1L >>> 32;
      iiIlilIlIIllilIl.IliIlllilIi(var10 + 5.0F, ctx + 3.0F, 10.0F, 10.0F, lIlIIiliIlIIil.Iilililiiili(), new Color((int)var16, true), IIIiiIillIIiiIil.liiiIIllIl());
      llilliilililliil.lIlIliIlIl(var8, var10 + 5.0F + 10.0F + 3.0F, llilliilililliil.IllIllllIl(ctx, 16.0F, 0.82F), 0.82F, IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var12), IilIIIIililIIIIi.Illlllllilll(-45715, -1, 0.3), (double)var13));
      llilliilililliil.IiIlliIliiIl(xRight, (boolean)((int)(var16 >>> 32)));
      mx.liiiIIllIl(var10 - 1.0F, ctx - 1.0F, var9 + 2.0F, 18.0F, () -> {
         if (my.lIllilIliiIllilIli) {
            this.iiiIIliIIIlIli.liiiIIllIl(var11);
         } else {
            this.iiiIIliIIIlIli.iIlIlllllill(var11);
         }

         this.liiIiiiiIi(my);
      });
      this.iliIiiliiiii(my.lIllilIliiIllilIli ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>(), var10, ctx, var9, 16.0F, c, by, false);
      return var10;
   }

   public boolean illilIilil(int scan, int mod, int key) {
      long var5 = 462236683847912155L;
      var5 ^= ((long)(scan != 257 && scan != 335 ? 0 : 1) << 32 ^ var5) & -1L << 32;
      if ((this.illliIiIilliIi || this.lliliIiililiIi) && this.lIIiiIiiIIiiIi) {
         if (scan == 256) {
            this.IllIllllIl();
            return true;
         } else if (this.illliIiIilliIi) {
            if ((int)(var5 >>> 32) != 0) {
               this.lliililiil();
               return true;
            } else {
               if (scan == 259 && !this.IIiliIilIiliIi.isEmpty()) {
                  this.IIiliIilIiliIi = this.IIiliIilIiliIi.substring(0, this.IIiliIilIiliIi.length() - 1);
                  this.iIiliIiIliliIi.IliIlllilIi();
               }

               return true;
            }
         } else if ((int)(var5 >>> 32) != 0) {
            this.iilIiIIiIi();
            return true;
         } else {
            if (scan == 259 && !this.IiiliIiliiliIi.isEmpty()) {
               this.IiiliIiliiliIi = this.IiiliIiliiliIi.substring(0, this.IiiliIiliiliIi.length() - 1);
               this.iiiliIiIIIiiIi.IliIlllilIi();
            }

            return true;
         }
      } else if (this.liIiiIiiiIiiIi != null) {
         if (scan == 256) {
            this.IIlIilIlIi();
         }

         return true;
      } else if (this.IiIIIliliIIIli.IIlilIliiIli()) {
         if ((int)(var5 >>> 32) != 0) {
            if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
               this.llIIIliilIIIli = 0L;
               this.Iilililiiili();
            }

            return true;
         } else {
            this.IiIIIliliIIIli.IIlllIlliIll(scan, mod, key);
            this.illIlIilIl();
            return true;
         }
      } else if ((this.illliIiIilliIi || this.lliliIiililiIi) && scan == 256) {
         this.IllIllllIl();
         return true;
      } else {
         return false;
      }
   }

   private void IIIlilIIli(lllililillilil c) {
      this.llIliilIli(liIlIliiIlIl<invokedynamic>(), lIlliiIlli(c.ilIIilIliIiIIilIli), true);
      IlliIilllliIil.Iilllilliill(c.IlIIilIlillIIilIli, (cx) -> {
         if (cx.iiiIilIllIIIlilIll) {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), lIlliiIlli(c.ilIIilIliIiIIilIli) + liIlIliiIlIl<invokedynamic>(), true);
            this.Iilililiiili();
         } else {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), cx.ilIlilIllIiIlilIll != null ? cx.ilIlilIllIiIlilIll : cx.IlIlilIllllIlilIll, false);
         }

      });
   }

   private void IlIlllIlilIl() {
      if (!iliiiIiIiiiiIi && IIllliIilIllliIi.IliIlllilIi()) {
         iliiiIiIiiiiIi = true;
         IIllliIilIllliIi.iIlIlllllill((added) -> {
            if (added != null && added > 0) {
               this.IIIllIIliIIl();
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), added + (added == 1 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>()) + liIlIliiIlIl<invokedynamic>(), true);
            }

         });
      }
   }

   private float IIllllIlll(class_332 my, String mx, String loaded, float cardX, int cardY, int cardW, int id, int ctx, int name) {
      long var23 = -6467352818244384982L;
      var23 ^= (68719476736L ^ var23) & -1L << 32;
      float var11 = 30.0F;
      float var12 = (llilliilililliil.IiIilliIil(liIlIliiIlIl<invokedynamic>()) + 5.0F) * cardX;
      String var13 = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(loaded, (float)(id - 48) - var11 - var12);
      float var14 = llilliilililliil.llIIlilIIl(var13);
      float var15 = Math.max(44.0F, (float)Math.ceil((double)((var11 + var14 + var12) * 2.0F)) / 2.0F);
      var23 ^= ((long)(!llilliilililliil.Iliilliiilii((double)ctx, (double)name, (float)cardY, (float)(cardW + (int)(var23 >>> 32)), (float)id, (float)(60 - (int)(var23 >>> 32))) && !llilliilililliil.Iliilliiilii((double)ctx, (double)name, (float)cardY, (float)cardW, var15, (float)((int)(var23 >>> 32))) ? 0 : 1) ^ var23) & -1L >>> 32;
      float var17 = llilliilililliil.lililiilil(my, (float)cardY, (float)cardW, (float)id, 60.0F, var15, this.iiiIIliIIIlIli.IIIllIIliIIl(IIlilIliiIli(mx, liIlIliiIlIl<invokedynamic>()), (boolean)((int)var23)), cardX);
      float var18 = (float)(cardY + 8);
      float var19 = var18 + 10.0F + 4.0F;
      iiIlilIlIIllilIl.IliIlllilIi(var18, (float)(cardW + 3) + 0.5F, 10.0F, 10.0F, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), new Color(IilIIIIililIIIIi.Illlllllilll(-7630437, IlIIilIlllIIilIl.lliiIlliIl, (double)cardX), true), IIIiiIillIIiiIil.liiiIIllIl());
      llilliilililliil.iiIIlIIlIl(var13, var19, llilliilililliil.IllIllllIl((float)(cardW + 3), 11.0F, 1.0F), -920587);
      float var20 = illliIilli((cardX - 0.8F) / 0.2F);
      if (var20 > 0.01F) {
         float var21 = IliiIilliiIi.IilliliilIIi(var20);

         try {
            llilliilililliil.lIliliIlil(my, liIlIliiIlIl<invokedynamic>(), var19 + var14 + 5.0F, (float)(cardW + 3));
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var21);
         }
      }

      return var17;
   }

   private IlIIililllIIilil lIIIiiIIIi() {
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(IlIIililllIIilil.class);
      IlIIililllIIilil var10000;
      if (var1 instanceof IlIIililllIIilil var2) {
         var10000 = var2;
      } else {
         var10000 = null;
      }

      return var10000;
   }

   public boolean iiIilIIlil(double my, double mx, double amt) {
      return false;
   }

   private static String Iilllilliill(long seconds) {
      if (seconds <= 0L) {
         return null;
      } else {
         try {
            return Instant.ofEpochSecond(seconds).atZone(ZoneId.systemDefault()).format(iiiilIiIIIIiIi);
         } catch (RuntimeException var3) {
            return null;
         }
      }
   }

   public boolean IiIilliIil(double mx, double my, int btn) {
      long var8 = -5036283494299978456L;
      if (btn != 0) {
         return false;
      } else {
         var8 ^= ((long)(this.iiIIIliIIlIIli && this.IiIIIliliIIIli.Illillliilli(mx, my) ? 1 : 0) << 32 ^ var8) & -1L << 32;
         this.IiIIIliliIIIli.IiIlliIliiIl(mx, my, btn);
         if (!this.iiIIIliIIlIIli) {
            this.IiIIIliliIIIli.lIiiIiIlilli();
         }

         this.lIIiiIiiIIiiIi = false;
         if ((int)(var8 >>> 32) != 0) {
            return true;
         } else {
            var8 ^= ((long)this.lliIIliiliIIli.IilliliilIIi(mx, my) ^ var8) & -1L >>> 32;
            if (this.illliIiIilliIi || this.lliliIiililiIi) {
               this.iiIIlIIlIl();
            }

            return (int)var8 != 0 || this.illliIiIilliIi || this.lliliIiililiIi || this.liIiiIiiiIiiIi != null;
         }
      }
   }

   private void lIilliIill(class_332 top, int my, int now, int ctx, long mx) {
      long var32 = -6356961736865071157L;
      long var34 = 4106258180104746481L;
      long var36 = -8605192255021802568L;
      long var38 = -8269946151411879680L;
      long var40 = -5166627847589161287L;
      long var30 = 2674711317842308898L;
      if (this.lIlIIliiIlIIli == null && this.IllIIlilllIIli == null && !this.illIIliIilIIli) {
         this.Iilililiiili();
      }

      if (this.llIIIliilIIIli != 0L && mx - this.llIIIliilIIIli > 400L) {
         this.llIIIliilIIIli = 0L;
         this.Iilililiiili();
      }

      var30 ^= ((long)this.illIIliIilIIli << 32 ^ var30) & -1L << 32;
      String var8 = this.IllIIlilllIIli;
      Ilillillilli var9 = this.lIlIIliiIlIIli;
      if (var9 != this.IIiIIlilIiIIli) {
         this.IIiIIlilIiIIli = var9;
         HashSet var10 = new HashSet();
         ArrayList var11 = new ArrayList();
         if (var9 != null) {
            for(lllililillilil var13 : var9.ilillIlIlIiillIlIl) {
               var10.add(var13.IlIIilIlillIIilIli);
               String var14 = Iilllilliill(var13.IiIlilIliliIlilIli);
               var11.add(var14 != null ? var14 : Iilllilliill(var13.iiIlilIliIIllilIli));
            }
         }

         this.iIiIIliIliIIli = var11;
         this.Illillliilli(var10);
      }

      IIliiIlllIliiIll var48 = llilliilililliil.IIiilIiiiIii();
      this.ilillIiill(top, my, now, ctx, (int)(var30 >>> 32) == 0 && var8 == null ? var9 : null);
      var30 ^= ((long)(my + 20) ^ var30) & -1L >>> 32;
      if ((int)(var30 >>> 32) == 0) {
         if (var8 != null) {
            llilliilililliil.IilIililIi(top, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var30), (float)this.liIIiIiiiIIiIi, 120.0F, lIlIIiliIlIIil.IiIlliIliiIl(), liIlIliiIlIl<invokedynamic>(), var48.Iiilliiliiil(var8, (float)this.liIIiIiiiIIiIi / 0.82F), liIlIliiIlIl<invokedynamic>(), now, ctx, this::Iilililiiili);
         } else if (var9 != null && !var9.ilillIlIlIiillIlIl.isEmpty()) {
            this.Iliilliiilii(Iilliiillilliiil.iIIIilIiil.ordinal(), System.identityHashCode(var9), 0);
            float var49 = llilliilililliil.IiIilliIil(liIlIliiIlIl<invokedynamic>());
            float var50 = llilliilililliil.IiIilliIil(liIlIliiIlIl<invokedynamic>());
            var34 ^= (4294967296L ^ var34) & -1L << 32;

            for(long var56 = var34 ^ (0L ^ var34) & -1L >>> 32; (int)var56 < var9.ilillIlIlIiillIlIl.size(); var56 ^= (var56 ^ var56 + (long)1) & -1L >>> 32) {
               long var57 = var36 ^ ((long)((int)var56 % 2) << 32 ^ var36) & -1L << 32;
               var36 = var57 ^ ((long)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)(var57 >>> 32)) ^ var57) & -1L >>> 32;
               var38 ^= ((long)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)(var36 >>> 32)) << 32 ^ var38) & -1L << 32;
               var38 ^= ((long)((int)var30 + (int)var56 / 2 * 64) ^ var38) & -1L >>> 32;
               if ((int)(var36 >>> 32) == 0) {
                  var56 ^= ((long)this.liIlliiIll(top, (int)var38, 60) << 32 ^ var56) & -1L << 32;
               }

               if ((int)(var56 >>> 32) != 0) {
                  iIIliiIiIlIliiIi var20 = this.lIIlIliiIIlIli.lIiiIiIlilli((int)var56);
                  if (!var20.iliIiiliiiii()) {
                     float var21 = var20.IiilIIIlIi;
                     float var22 = var20.liilIIIlIi;
                     IIllIIIllIllIIIl var23 = var20.lIIiIIIlIi ? this.lliIIliiliIIli : IIllIIIllIllIIIl.ililiiIlIl;
                     var40 ^= ((long)(var20.IIIiIIIlIi ? now : this.IlIIiIillIIiIi - 4000) << 32 ^ var40) & -1L << 32;
                     lllililillilil var25 = (lllililillilil)var9.ilillIlIlIiillIlIl.get((int)var56);
                     var40 ^= ((long)llilliilililliil.IlIlllIlilIl(top, (float)((int)var36) + (float)((int)(var38 >>> 32)) / 2.0F, (float)((int)var38) + 30.0F, var20.iiilIIIlIi) ^ var40) & -1L >>> 32;

                     try {
                        this.Iiiiliiiiiii(top, lIlliiIlli(var25.ilIIilIliIiIIilIli), 0.0F, var21, (int)var36, (int)var38, (int)(var38 >>> 32));
                        if (var22 > 0.002F) {
                           float var27 = IliiIilliiIi.IilliliilIIi(var22);

                           try {
                              this.Ilillllill(top, var23, var25, (int)var56 < this.iIiIIliIliIIli.size() ? (String)this.iIiIIliIliIIli.get((int)var56) : null, (int)var36, (int)var38, (int)(var38 >>> 32), (int)(var40 >>> 32), ctx, var49, var50);
                           } finally {
                              IliiIilliiIi.lIiiIiIlilli(var27);
                           }
                        }
                     } finally {
                        llilliilililliil.IiIlliIliiIl(top, (boolean)((int)var40));
                     }
                  }
               }
            }

         } else {
            llilliilililliil.IilIililIi(top, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var30), (float)this.liIIiIiiiIIiIi, 120.0F, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), (String)null, now, ctx, (Runnable)null);
         }
      } else {
         for(var32 ^= (0L ^ var32) & -1L << 32; (int)(var32 >>> 32) < 6; var32 += 4294967296L) {
            var32 ^= ((long)((int)(var32 >>> 32) % 2) ^ var32) & -1L >>> 32;
            llilliilililliil.iilIiIIiIi(top, (float)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var32), (float)((int)var30 + (int)(var32 >>> 32) / 2 * 64), (float)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var32), 60.0F, 64.0F + (float)((int)(var32 >>> 32) % 3) * 14.0F, (int)(var32 >>> 32));
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iIllIlIlllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') << 4 | (char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') >>> 12) + var5) >>> 9 | (char)((char)((char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') << 4 | (char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') >>> 12) + var5) << 7) >>> 6 | (char)((char)((char)((char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') << 4 | (char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') >>> 12) + var5) >>> 9 | (char)((char)((char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') << 4 | (char)((char)(~((char)(var4[var5] - '肣'))) ^ 'ꇋ') >>> 12) + var5) << 7) << 10))) + '뻯') + 7754) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lIliliIlil(double btn, double mx, int my) {
   }

   public boolean lililiilil(char chr, int mod) {
      if ((this.illliIiIilliIi || this.lliliIiililiIi) && this.lIIiiIiiIIiiIi) {
         if (this.illliIiIilliIi) {
            if (Illlilllli(chr) && this.IIiliIilIiliIi.length() < 64) {
               this.IIiliIilIiliIi = this.IIiliIilIiliIi + chr;
               this.iIiliIiIliliIi.IliIlllilIi();
            }
         } else if (IIiillIiil(chr) && this.IiiliIiliiliIi.length() < 12) {
            this.IiiliIiliiliIi = this.IiiliIiliiliIi + Character.toUpperCase(chr);
            this.iiiliIiIIIiiIi.IliIlllilIi();
         }

         return true;
      } else if (this.liIiiIiiiIiiIi == null && this.IiIIIliliIIIli.IIlilIliiIli()) {
         this.IiIIIliliIIIli.Illlllllilll(chr, mod);
         this.illIlIilIl();
         return true;
      } else {
         return false;
      }
   }

   private void iliIiiliiiii(String my, float text, float ah, float ay, float mx, int ax, int below, boolean aw) {
      if (llilliilililliil.Iliilliiilii((double)ax, (double)below, text, ah, ay, mx)) {
         this.lIilIliiIilIli = my;
         this.ililIliIiilIli = text + ay / 2.0F;
         this.liilIliiiilIli = aw ? ah + mx + 4.0F : ah - 4.0F;
         this.llIiIliilIiIli = aw;
      }
   }

   private int lIIlliIIll() {
      long var2 = 1237735979612850673L;
      var2 ^= ((long)this.iiiIlIIIll().size() << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) == 0 ? 0 : (int)(var2 >>> 32) * 10 + 6;
   }

   private void IllIllllIl() {
      this.illliIiIilliIi = false;
      this.IIiliIilIiliIi = "";
      this.lilliIiiilliIi = null;
      this.lliliIiililiIi = false;
      this.IiiliIiliiliIi = "";
      this.lIIiiIiiIIiiIi = false;
   }

   private void iliIiIiiIi() {
      Thread var1 = new Thread(() -> {
         try {
            FileDialog var1 = new FileDialog((Frame)null, liIlIliiIlIl<invokedynamic>(), 0);
            var1.setFile(liIlIliiIlIl<invokedynamic>());
            var1.setVisible(true);
            String var2 = var1.getDirectory();
            String var3 = var1.getFile();
            if (var2 == null || var3 == null) {
               return;
            }

            byte[] var4 = Files.readAllBytes(Path.of(var2, var3));
            iliiIIllIiiiIIll[] var5 = new iliiIIllIiiiIIll[1];
            String[] var6 = new String[1];
            lIlIllIliIlIllIl var7 = lilllIiliilllIil.Iliilliiilii(var4, var5, var6);
            if (var7 == null) {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var5[0] != null && var5[0].IilliliilIIi() != null ? var5[0].IilliliilIIi() : liIlIliiIlIl<invokedynamic>(), false);
               return;
            }

            String var8 = var6[0];
            IillilIilillilIi var9 = new IillilIilillilIi();
            var9.lllIillIIi = ilIIIllIiIIIll.ilIIlIIilIiIIlIIil;

            try {
               lilllIiliilllIil.iilllIIill(var8, var9);
            } catch (IOException var11) {
            }

            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var7.iiililIiIl, true);
            this.IIIllIIliIIl();
         } catch (Throwable var12) {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
         }

      }, liIlIliiIlIl<invokedynamic>());
      var1.setDaemon(true);
      var1.start();
   }

   public void IliIlllilIi(int y, int w, int x, int h) {
      this.IlIIiIillIIiIi = y;
      this.ilIIiIiIiIIiIi = w;
      this.liIIiIiiiIIiIi = x;
      this.IIlIiIilIlIiIi = h;
   }

   private void IiIlliIliiIl(List<IlIIillllIIill> source) {
      long var11 = -2441814465492995253L;
      ArrayList var2 = new ArrayList(source.size());

      for(IlIIillllIIill var4 : source) {
         ilIIIllIiIIIll var5 = lilllIiliilllIil.lllllillll(var4.iIIIilIIiIlIIilIIi).lllIillIIi;
         String var6 = var4.IIIIilIIilIIIilIIi.iiililIiIl != null ? var4.IIIIilIIilIIIilIIi.iiililIiIl : var4.iIIIilIIiIlIIilIIi;
         var11 ^= ((long)IIlllIlliIll(var4.IIIIilIIilIIIilIIi.ilIiilIiIl) << 32 ^ var11) & -1L << 32;
         String var8 = lIlliiIlli(var4.IIIIilIIilIIIilIIi.lIIiilIiIl);
         String var9 = null;
         if (var5 == ilIIIllIiIIIll.ilIIlIIilIiIIlIIil) {
            var9 = liIlIliiIlIl<invokedynamic>();
         } else if (var5 == ilIIIllIiIIIll.liIIlIIiliiIIlIIil && !var8.isEmpty()) {
            var9 = liIlIliiIlIl<invokedynamic>() + var8;
         }

         String var10 = Illlllllilll(var4.IIIIilIIilIIIilIIi.IlIiilIiIl);
         if (var10 == null) {
            var10 = Illlllllilll(var4.IIIIilIIilIIIilIIi.iIIiilIiIl);
         }

         var2.add(new iiiliiiIIIiiii(var4.iIIIilIIiIlIIilIIi, var6, (var6 + liIlIliiIlIl<invokedynamic>() + var8).toLowerCase(Locale.ROOT), (int)(var11 >>> 32) + ((int)(var11 >>> 32) == 1 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>()), var9, var10, var5 == ilIIIllIiIIIll.IlIIlIIilllIIlIIil, var5 == ilIIIllIiIIIll.liIIlIIiliiIIlIIil));
      }

      this.iilIiIiIIiIiIi = var2;
      this.IilIiIililIiIi = source;
      this.liiIiIiiiiIiIi = lilllIiliilllIil.IIIIllIIIl();
   }

   private void IIlIilIlIi() {
      this.liIiiIiiiIiiIi = null;
      this.IIliiIilIliiIi = null;
      this.iIliiIiIlliiIi = null;
      this.IiliiIililiiIi = null;
      this.llliiIiilliiIi = false;
      this.iiliiIiIIiiiIi = new ArrayList();
      this.lIiiiIiiIiiiIi = null;
      this.IlIlIlillIlIli = -1;
      this.IIIllIIliIIl();
   }

   // $FF: synthetic method
   private static CallSite llllIlilllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 16486) - '\ue1a3'))) + '謐') + 12590) - 13047))) - '릿') - var5) + '\ue1cd'))))) + var5) >>> 12 | (char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - 16486) - '\ue1a3'))) + '謐') + 12590) - 13047))) - '릿') - var5) + '\ue1cd'))))) + var5) << 4) + '첄') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lliililiil() {
      String var1 = this.IIiliIilIiliIi.trim();
      if (var1.length() < 3) {
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
      } else {
         try {
            if (this.lilliIiiilliIi == null) {
               String var2 = iilIliIlIIiIliIl.iIlIlllllill(var1, liIlIliiIlIl<invokedynamic>(), IiIliliIli());
               lilllIiliilllIil.Iiiiliiiiiii(var2);
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var1 + liIlIliiIlIl<invokedynamic>(), true);
               if (IIllliIilIllliIi.IliIlllilIi()) {
                  IIllliIilIllliIi.liiiIIllIl(var2, (r) -> {
                  });
               }
            } else {
               lilllIiliilllIil.Illillliilli(this.lilliIiiilliIi, var1);
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var1, true);
            }

            this.IIIllIIliIIl();
         } catch (IOException var3) {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>() + var3.getMessage(), false);
         }

         this.illliIiIilliIi = false;
         this.IIiliIilIiliIi = "";
         this.lilliIiiilliIi = null;
      }
   }

   private void IilIililIi(String code) {
      if (this.iIliiIiIlliiIi != null) {
         IlliIilllliIil.IIIilIIiiIIi(this.iIliiIiIlliiIi, code, (res) -> {
            if (res.iiiIilIllIIIlilIll) {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), code + liIlIliiIlIl<invokedynamic>(), false);
               this.iIlIiIllIi();
            } else {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), res.ilIlilIllIiIlilIll != null ? res.ilIlilIllIiIlilIll : liIlIliiIlIl<invokedynamic>(), false);
            }

         });
      }
   }

   private void iIlIiIllIi() {
      if (this.iIliiIiIlliiIi != null) {
         this.llliiIiilliiIi = true;
         IlliIilllliIil.Iiilliiliiil(this.iIliiIiIlliiIi, (res) -> {
            this.llliiIiilliiIi = false;
            if (res.iiiIilIllIIIlilIll) {
               this.iiliiIiIIiiiIi = (List)res.lIIlilIlliIIlilIll;
               this.IiliiIililiiIi = null;
            } else {
               this.IiliiIililiiIi = res.ilIlilIllIiIlilIll != null ? res.ilIlilIllIiIlilIll : liIlIliiIlIl<invokedynamic>();
            }

         });
      }
   }

   private boolean liIlliiIll(class_332 rowY, int ctx, int rowH) {
      long var8 = -8242906262037441821L;
      Matrix3x2fStack var4 = rowY.method_51448();
      float var5 = (float)this.IlIIiIillIIiIi + (float)this.liIIiIiiiIIiIi / 2.0F;
      var8 ^= ((long)(rowH + 16) << 32 ^ var8) & -1L << 32;

      for(long var11 = var8 ^ (-16L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32) + 16; var11 ^= (var11 ^ var11 + (long)16) & -1L >>> 32) {
         var4.transformPosition(var5, (float)(ctx + Math.min((int)var11, (int)(var11 >>> 32))), this.llllIliilllIli);
         if (rowY.method_58135(Math.round(this.llllIliilllIli.x), Math.round(this.llllIliilllIli.y))) {
            return true;
         }
      }

      return false;
   }

   private void llIIlilIIl() {
      if (!this.illliIiIilliIi) {
         this.IIiliIilIiliIi = "";
      }

      this.illliIiIilliIi = true;
      this.lilliIiiilliIi = null;
      this.lliliIiililiIi = false;
      this.IiiliIiliiliIi = "";
      this.iiIIlIIlIl();
   }

   private static String Illlllllilll(String iso) {
      if (iso != null && !iso.isEmpty()) {
         try {
            return OffsetDateTime.parse(iso).atZoneSameInstant(ZoneId.systemDefault()).format(iiiilIiIIIIiIi);
         } catch (RuntimeException var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite iillIlIIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 21036) >>> 1 | (char)((char)(var4[var5] - var5) + 21036) << 15))) ^ '難') << 3 | (char)((char)(-((char)((char)((char)(var4[var5] - var5) + 21036) >>> 1 | (char)((char)(var4[var5] - var5) + 21036) << 15))) ^ '難') >>> 13) ^ 11954) - 14873) ^ '죮') ^ 28419) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 21036) >>> 1 | (char)((char)(var4[var5] - var5) + 21036) << 15))) ^ '難') << 3 | (char)((char)(-((char)((char)((char)(var4[var5] - var5) + 21036) >>> 1 | (char)((char)(var4[var5] - var5) + 21036) << 15))) ^ '難') >>> 13) ^ 11954) - 14873) ^ '죮') ^ 28419) ^ var5) << 13) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIIIlIlIIl(int index) {
      this.IiIIIliliIIIli.lIiiIiIlilli();
      if (this.liiiiIiiiiiiIi != index) {
         this.liiiiIiiiiiiIi = index;
         this.Iilililiiili();
      }
   }

   private boolean Ililllililil() {
      return this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil && this.liIiiIiiiIiiIi != null;
   }

   private static String iiIliIIlli(String avail, float s) {
      String var2;
      for(var2 = avail; var2.length() > 1 && llilliilililliil.llIIlilIIl(var2) > s; var2 = var2.substring(1)) {
      }

      return var2;
   }

   private static float IIIIllIIIl(String cardW, float loaded, int name) {
      float var3 = 30.0F;
      float var4 = (llilliilililliil.IiIilliIil(liIlIliiIlIl<invokedynamic>()) + 5.0F) * loaded;
      String var5 = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(cardW, (float)(name - 48) - var3 - var4);
      return Math.max(44.0F, (float)Math.ceil((double)((var3 + llilliilililliil.llIIlilIIl(var5) + var4) * 2.0F)) / 2.0F);
   }

   private void IIiilIiiiIii(Iilliiillilliiil t) {
      if (this.iIlIiIiIllIiIi != t) {
         if (this.iIlIiIiIllIiIi != Iilliiillilliiil.iIIIilIiil) {
            this.iIIIIliIlIIIli = this.IiIIIliliIIIli.IlIillIiilIi();
         }

         this.iIlIiIiIllIiIi = t;
         this.IillIlilillIli = System.currentTimeMillis();
         this.IiIIIliliIIIli.lIiiIiIlilli();
         this.IiIIIliliIIIli.IiIiliIiiiIi(t == Iilliiillilliiil.iIIIilIiil ? this.IIIIIlilIIIIli : this.iIIIIliIlIIIli);
         this.illliIiIilliIi = false;
         this.IIiliIilIiliIi = "";
         this.lilliIiiilliIi = null;
         this.lliliIiililiIi = false;
         this.IiiliIiliiliIi = "";
         this.lIIiiIiiIIiiIi = false;
         this.liIiiIiiiIiiIi = null;
         this.iiliiIiIIiiiIi = new ArrayList();
         this.iIliiIiIlliiIi = null;
         this.IiliiIililiiIi = null;
         this.llliiIiilliiIi = false;
         this.iiiIIliIIIlIli.IiIlliIliiIl(liIlIliiIlIl<invokedynamic>(), 0.0F);
         this.Illillliilli(Set.of());
         this.lIiIiIiiIiIiIi = null;
         this.IIiIIlilIiIIli = null;
         this.IliiiIilliiiIi = null;
         this.IlIlIlillIlIli = -1;
         this.lIIlIliiIIlIli.IliIlllilIi();
         if (t != Iilliiillilliiil.iIIIilIiil) {
            this.IIIllIIliIIl();
         }

      }
   }

   public void IilliliilIIi() {
      this.IiIIIliliIIIli.lIiiIiIlilli();
      this.lIIiiIiiIIiiIi = false;
   }

   public boolean iIlIlllllill() {
      return false;
   }

   private static boolean Illlilllli(char c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == ' ' || c == '_' || c == '-';
   }

   private void iIiIlIliIl(class_332 ctx, int mx, int my) {
      long var16 = -5912461915151671256L;
      long var12 = -5619900779122087141L;
      long var14 = -5046087940990572996L;
      float var4 = llilliilililliil.IiiIlliiIl(ctx, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)this.ilIIiIiIiIIiIi, 22.0F);
      float var5 = llilliilililliil.iiiIlIIIll(ctx, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), liIiIIiiiIiIIi, this.iIlIiIiIllIiIi.ordinal(), var4 + 10.0F, (float)this.ilIIiIiIiIIiIi, 22.0F, mx, my, (i) -> this.IIiilIiiiIii(ilIiIIiIiIiIIi[i]));
      var12 ^= ((long)this.Ililllililil() << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil && (int)(var12 >>> 32) == 0 ? 1 : 0) ^ var12) & -1L >>> 32;
      float var8 = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi);
      if ((int)var12 != 0) {
         var8 = llilliilililliil.lllllillll(ctx, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi), (float)this.ilIIiIiIiIIiIi + 2.0F, 18.0F, mx, my, true, this::llIIlilIIl) - 8.0F - 62.0F;
      }

      var14 ^= ((long)((int)Math.ceil((double)(var5 + 8.0F))) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)((int)var12 != 0 ? (int)Math.floor((double)(var8 - 6.0F)) : this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi) ^ var14) & -1L >>> 32;
      var16 ^= ((long)Math.min(124, (int)var14 - (int)(var14 >>> 32)) << 32 ^ var16) & -1L << 32;
      this.iiIIIliIIlIIli = (int)(var12 >>> 32) == 0 && (int)(var16 >>> 32) >= 56;
      if (this.iiIIIliIIlIIli) {
         this.IiIIIliliIIIli.IliIlllilIi((int)(var14 >>> 32), this.ilIIiIiIiIIiIi + 2, (int)(var16 >>> 32), 18);
         this.IiIIIliliIIIli.iliIiiliiiii(ctx, mx, my, 0.0F);
      } else {
         this.IiIIIliliIIIli.lIiiIiIlilli();
      }

      if ((int)var12 != 0) {
         this.lliIliliIl(ctx, Math.min(var8, this.iiIIIliIIlIIli ? (float)((int)(var14 >>> 32) + (int)(var16 >>> 32)) + 6.0F : var5 + 8.0F), mx, my);
      }

   }

   private void lllllillll(class_332 now, IIllIIIllIllIIIl my, int mx, int top, int ctx, long mine, boolean target) {
      long var33 = 4545264821476725441L;
      long var35 = 1167180545334837699L;
      long var27 = -1218889613783728125L;
      long var29 = 3781226040320356815L;
      long var31 = 3061683258839680421L;
      var27 ^= (4294967296L ^ var27) & -1L << 32;

      for(var27 ^= (0L ^ var27) & -1L >>> 32; (int)var27 < this.IliIiIilliIiIi.size(); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
         var27 ^= ((long)((int)(var27 >>> 32) * 31 + ((iiiliiiIIIiiii)this.IliIiIilliIiIi.get((int)var27)).IliIlllilIi().hashCode()) << 32 ^ var27) & -1L << 32;
      }

      this.Iliilliiilii(this.iIlIiIiIllIiIi.ordinal(), (int)(var27 >>> 32), this.IliIiIilliIiIi.size());
      var27 ^= (1L ^ var27) & -1L >>> 32;

      for(var29 ^= (0L ^ var29) & -1L << 32; (int)(var29 >>> 32) < this.IliIiIilliIiIi.size(); var29 += 4294967296L) {
         var29 ^= ((long)((int)(var29 >>> 32) % 2) ^ var29) & -1L >>> 32;
         var31 ^= ((long)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var29) << 32 ^ var31) & -1L << 32;
         var31 ^= ((long)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 2, 4, (int)var29) ^ var31) & -1L >>> 32;
         var33 ^= ((long)(mx + (int)(var29 >>> 32) / 2 * 64) << 32 ^ var33) & -1L << 32;
         if ((int)var29 == 0) {
            var27 ^= ((long)this.liIlliiIll(now, (int)(var33 >>> 32), 60) ^ var27) & -1L >>> 32;
         }

         if ((int)var27 != 0) {
            iIIliiIiIlIliiIi var16 = this.lIIlIliiIIlIli.lIiiIiIlilli((int)(var29 >>> 32));
            if (!var16.iliIiiliiiii()) {
               float var17 = var16.IiilIIIlIi;
               float var18 = var16.liilIIIlIi;
               IIllIIIllIllIIIl var19 = var16.lIIiIIIlIi ? my : IIllIIIllIllIIIl.ililiiIlIl;
               var33 ^= ((long)(var16.IIIiIIIlIi ? top : this.IlIIiIillIIiIi - 4000) ^ var33) & -1L >>> 32;
               iiiliiiIIIiiii var21 = (iiiliiiIIIiiii)this.IliIiIilliIiIi.get((int)(var29 >>> 32));
               float var22 = this.iiiIIliIIIlIli.iliIiiliiiii(IIlilIliiIli(var21.IliIlllilIi(), liIlIliiIlIl<invokedynamic>()), var21.IliIlllilIi().equals(this.liiIiIiiiiIiIi) ? 1.0F : 0.0F, 14.0F);
               var35 ^= ((long)llilliilililliil.IlIlllIlilIl(now, (float)((int)(var31 >>> 32)) + (float)((int)var31) / 2.0F, (float)((int)(var33 >>> 32)) + 30.0F, var16.iiilIIIlIi) << 32 ^ var35) & -1L << 32;

               try {
                  this.Iiiiliiiiiii(now, var21.liiiIIllIl(), var22, var17, (int)(var31 >>> 32), (int)(var33 >>> 32), (int)var31);
                  if (var18 > 0.002F) {
                     float var24 = IliiIilliiIi.IilliliilIIi(var18);

                     try {
                        this.Iillllilll(now, var19, var21, var22, (int)(var31 >>> 32), (int)(var33 >>> 32), (int)var31, (int)var33, ctx, mine, target);
                     } finally {
                        IliiIilliiIi.lIiiIiIlilli(var24);
                     }
                  }
               } finally {
                  llilliilililliil.IiIlliIliiIl(now, (boolean)((int)(var35 >>> 32)));
               }
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite IIllIllIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) << 11) << 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) << 11) >>> 4) + 7311) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) << 11) << 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) >>> 13 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') << 11 | (char)((char)((char)((char)(~var4[var5]) - 21565) ^ var5) - 'ﮠ') >>> 5))) ^ var5) - var5) << 3) >>> 13) << 11) >>> 4) + 7311) << 5) ^ 18143));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIlIliIlIl() {
      if (this.illliIiIilliIi) {
         this.lliililiil();
      } else {
         this.iilIiIIiIi();
      }

      if (this.illliIiIilliIi || this.lliliIiililiIi) {
         this.iiIIlIIlIl();
      }

   }

   public int liiiIIllIl() {
      return 28 + this.IiIiliIiiiIi();
   }

   private int IIIilIIiiIIi() {
      return Math.round(this.iiiIIliIIIlIli.IlIlllIlilIl(liIlIliiIlIl<invokedynamic>()) * 24.0F);
   }

   private static float lilliiilli(float t) {
      t = illliIilli(t);
      float var1 = 1.0F - t;
      return 1.0F - var1 * var1 * var1;
   }

   private void IIIllIIliIIl() {
      this.lllIiIiillIiIi = lilllIiliilllIil.lIiiIiIlilli();
   }

   private void Ilillllill(class_332 cardX, IIllIIIllIllIIIl ctx, lllililillilil stamp, String target, int verifiedW, int c, int my, int cardY, int yoursW, float cardW, float mx) {
      float var12 = this.IIllllIlll(cardX, stamp.IlIIilIlillIIilIli, lIlliiIlli(stamp.ilIIilIliIiIIilIli), 0.0F, verifiedW, c, my, cardY, yoursW);
      float var13 = (float)(verifiedW + 8);
      float var14 = (float)(verifiedW + my - 8);
      float var15 = var13;
      float var16 = var12 + 6.0F;
      String var17 = stamp.iIIlilIliIlIlilIli + (stamp.iIIlilIliIlIlilIli == 1L ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>());
      float var18 = llilliilililliil.IiIilliIil(var17) + (stamp.iliIilIliIiiIilIli ? 4.0F + cardW : 0.0F) + (stamp.IlllilIlillllilIli ? 4.0F + mx : 0.0F);
      String var19 = lIlliiIlli(stamp.IIlIilIlilIlIilIli);
      if (!var19.isEmpty()) {
         var15 = var13 + llilliilililliil.Illillllil(cardX, liIlIliiIlIl<invokedynamic>() + var19, var13, var16, var14 - var13 - var18 - 4.0F) + 4.0F;
      }

      var15 += llilliilililliil.Illillllil(cardX, var17, var15, var16, var14 - var15) + 4.0F;
      if (stamp.iliIilIliIiiIilIli) {
         var15 += llilliilililliil.iiIilIIlil(cardX, liIlIliiIlIl<invokedynamic>(), var15, var16, -11755009) + 4.0F;
      }

      if (stamp.IlllilIlillllilIli) {
         llilliilililliil.iiIilIIlil(cardX, liIlIliiIlIl<invokedynamic>(), var15, var16, IlIIilIlllIIilIl.lliiIlliIl);
      }

      float var20 = (float)(c + 60) - 6.0F - 16.0F;
      float var21 = llilliilililliil.lllllillll(cardX, ctx, this.iiiIIliIIIlIli, IIlilIliiIli(stamp.IlIIilIlillIIilIli, liIlIliiIlIl<invokedynamic>()), liIlIliiIlIl<invokedynamic>(), lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), var14, var20, 16.0F, cardY, yoursW, true, () -> this.iIIliIlIli(stamp));
      if (stamp.IlllilIlillllilIli) {
         var21 -= 19.0F;
         this.iilllIIill(cardX, ctx, IIlilIliiIli(stamp.IlIIilIlillIIilIli, liIlIliiIlIl<invokedynamic>()), var21, var20, stamp.IlIIilIlillIIilIli != null && stamp.IlIIilIlillIIilIli.equals(this.IIIliIilIIliIi) && liIlIliiIlIl<invokedynamic>().equals(this.iIIliIiIlIliIi), cardY, yoursW, () -> this.iIiilIliil(stamp.IlIIilIlillIIilIli, liIlIliiIlIl<invokedynamic>(), () -> this.IIIlilIIli(stamp)));
      }

      var21 = this.liilliiill(cardX, ctx, stamp, var21 - 3.0F, var20, cardY, yoursW);
      this.iIlllIllll(cardX, target, var13, var20, var21 - 6.0F);
   }

   private void liIIiiiIIi(String slug) {
      lIlIllIliIlIllIl var2;
      try {
         var2 = lilllIiliilllIil.iliIiiliiiii(slug);
      } catch (IOException var4) {
         var2 = null;
      }

      this.liIiiIiiiIiiIi = slug;
      this.IIliiIilIliiIi = var2 != null && var2.iiililIiIl != null ? var2.iiililIiIl : slug;
      this.IlIlIlillIlIli = -1;
      this.iiiIIliIIIlIli.IiIlliIliiIl(liIlIliiIlIl<invokedynamic>(), 0.0F);
      this.iIliiIiIlliiIi = null;
      this.IiliiIililiiIi = null;
      this.llliiIiilliiIi = true;
      this.lIiiiIiiIiiiIi = null;
      this.iiliiIiIIiiiIi = new ArrayList();
      if (!IIllliIilIllliIi.IliIlllilIi()) {
         this.llliiIiilliiIi = false;
         this.IiliiIililiiIi = liIlIliiIlIl<invokedynamic>();
      } else {
         IIllliIilIllliIi.liiiIIllIl(slug, (res) -> {
            if (!res.IllililIllllililIl) {
               this.llliiIiilliiIi = false;
               this.IiliiIililiiIi = res.lilililIliilililIl != null ? res.lilililIliilililIl : liIlIliiIlIl<invokedynamic>();
            } else {
               this.iIliiIiIlliiIi = res.illililIlIilililIl;
               this.iIlIiIllIi();
            }
         });
      }
   }

   private void llIliilIli(String sub, String title, boolean good) {
      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(sub, title, good);
   }

   private void Iilililiiili() {
      this.illIIliIilIIli = true;
      this.IllIIlilllIIli = null;
      this.lIlIIliiIlIIli = null;
      long var1 = ++this.lilIIliiilIIli;
      LinkedHashMap var3 = new LinkedHashMap();
      var3.put(liIlIliiIlIl<invokedynamic>(), IIliIIilIliIIi[this.liiiiIiiiiiiIi]);
      if (!this.IIIIIlilIIIIli.isBlank()) {
         var3.put(liIlIliiIlIl<invokedynamic>(), this.IIIIIlilIIIIli.trim());
      }

      var3.put(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>());
      IlliIilllliIil.iIlIlllllill(var3, (req) -> {
         if (var1 == this.lilIIliiilIIli) {
            this.illIIliIilIIli = false;
            if (req.iiiIilIllIIIlilIll) {
               this.lIlIIliiIlIIli = (Ilillillilli)req.lIIlilIlliIIlilIll;
               this.IllIIlilllIIli = null;
            } else {
               this.IllIIlilllIIli = req.ilIlilIllIiIlilIll != null ? req.ilIlilIllIiIlilIll : liIlIliiIlIl<invokedynamic>();
            }

         }
      });
   }

   private void Iliilliiilii(int count, int kind, int sig) {
      if (count != this.IlIlIlillIlIli || kind != this.ilIlIliIiIlIli) {
         if (count == this.IlIlIlillIlIli && sig > 0 && sig <= this.liIlIliiiIlIli) {
            this.lIIlIliiIIlIli.liiiIIllIl();
         } else {
            this.lIIlIliiIIlIli.IliIlllilIi();
         }

         this.IlIlIlillIlIli = count;
         this.ilIlIliIiIlIli = kind;
         this.liIlIliiiIlIli = sig;
      }
   }

   private static String IIlilIliiIli(String kind, String id) {
      return liIlIliiIlIl<invokedynamic>() + kind + '|' + id;
   }

   public void lIiiIiIlilli(class_332 ctx) {
      long var2 = System.nanoTime();
      if (this.lIilIliiIilIli != null && var2 - this.iillIliIIilIli <= 400000000L) {
         if (!this.lIilIliiIilIli.equals(this.IlilIlillilIli)) {
            this.IlilIlillilIli = this.lIilIliiIilIli;
            this.IiIiIliliIiIli = liIlIliiIlIl<invokedynamic>().equals(this.lIilIliiIilIli) ? var2 - 350000000L : var2;
         }

         float var4 = illliIilli((float)(var2 - this.IiIiIliliIiIli - 350000000L) / 1.2E8F);
         if (!(var4 <= 0.0F)) {
            float var5 = (float)Math.ceil((double)llilliilililliil.IiIIlliIIl(this.lIilIliiIilIli, 0.82F)) + 12.0F;
            float var6 = 15.0F;
            float var7 = Math.max(this.IIIiIlilIIiIli, Math.min(this.iIIiIliIlIiIli - var5, this.ililIliIiilIli - var5 / 2.0F));
            float var8 = this.llIiIliilIiIli ? this.liilIliiiilIli : this.liilIliiiilIli - var6;
            float var9 = IliiIilliiIi.IilliliilIIi(var4);

            try {
               IIIiiIillIIiiIil.Ililllililil(ctx, var7, var8, var5, var6, 5.0F, -65990120, 620756991);
               llilliilililliil.lIlIliIlIl(this.lIilIliiIilIli, var7 + 6.0F, llilliilililliil.IllIllllIl(var8, var6, 0.82F), 0.82F, -920587);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var9);
            }

         }
      } else {
         this.IlilIlillilIli = null;
      }
   }

   private void illIlIilIl() {
      if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
         String var1 = this.IiIIIliliIIIli.IlIillIiilIi();
         if (var1.length() > 64) {
            var1 = var1.substring(0, 64);
            this.IiIIIliliIIIli.IiIiliIiiiIi(var1);
         }

         if (!var1.equals(this.IIIIIlilIIIIli)) {
            this.IIIIIlilIIIIli = var1;
            this.llIIIliilIIIli = System.currentTimeMillis();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liIlIliiIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4409587771207728296L ^ Long.rotateLeft(5584107889323210378L, 23) ^ -4562852738380471889L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7099770186689348694L ^ Long.rotateLeft(8290114610087408802L, 60) ^ 3976889592429410919L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 531688866469963771L ^ Long.rotateLeft(-8297941212712644884L, 55) ^ -2107645930790663991L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5879165835059221420L ^ Long.rotateLeft(-456738755944607721L, 22) ^ 3092168872958268092L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2833906826182085832L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6664074252575105884L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5506392375069845403L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4687507104903435466L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5067749277771634712L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1475743893814950401L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIllIllIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIllIlIlllIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, llllIlilllIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IillIllillIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iillIlIIilIl<invokedynamic>());
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

   private void lliIliliIl(class_332 left, float my, int mx, int ctx) {
      long var11 = 4956105561221413613L;
      float var5 = 18.0F;
      float var6 = (float)this.ilIIiIiIiIIiIi + (22.0F - var5) / 2.0F;
      float var7 = var5 + 4.0F;
      llilliilililliil.IIllllIlll(left, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), my, var6, var5, 12.0F, mx, ctx, false, this::iliIiIiiIi);
      this.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), my, var6, var5, var5, mx, ctx, true);
      float var8 = my + var7;
      llilliilililliil.IIllllIlll(left, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), var8, var6, var5, 12.0F, mx, ctx, false, this::IiIIlliIIl);
      this.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), var8, var6, var5, var5, mx, ctx, true);
      var11 ^= ((long)this.IlIIillIIi() << 32 ^ var11) & -1L << 32;
      float var10 = var8 + var7;
      llilliilililliil.iIlllIllll(left, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), var10, var6, var5, 12.0F, mx, ctx, false, this.iiiIIliIIIlIli.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), (int)(var11 >>> 32) != 0 ? 1.0F : 0.0F, 16.0F), this::ilIIiIiIIi);
      this.iliIiiliiiii((int)(var11 >>> 32) != 0 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>(), var10, var6, var5, var5, mx, ctx, true);
   }

   public void Illillllil(double my, double mx, int btn) {
   }

   private void liiIiiiiIi(lllililillilil c) {
      long var3 = -3656010351205146548L;
      var3 ^= ((long)(!c.lIllilIliiIllilIli ? 1 : 0) << 32 ^ var3) & -1L << 32;
      c.lIllilIliiIllilIli = (boolean)((int)(var3 >>> 32));
      c.llIlilIliilIlilIli = Math.max(0L, c.llIlilIliilIlilIli + (long)((int)(var3 >>> 32) != 0 ? 1 : -1));
      IlliIilllliIil.Illlllllilll(c.IlIIilIlillIIilIli, (boolean)((int)(var3 >>> 32)), (cx) -> {
         if (cx.iiiIilIllIIIlilIll) {
            c.lIllilIliiIllilIli = want;
            c.llIlilIliilIlilIli = (Long)cx.lIIlilIlliIIlilIll;
         } else {
            c.lIllilIliiIllilIli = !want;
            c.llIlilIliilIlilIli = Math.max(0L, c.llIlilIliilIlilIli + (long)(want ? -1 : 1));
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), cx.ilIlilIllIiIlilIll != null ? cx.ilIlilIllIiIlilIll : liIlIliiIlIl<invokedynamic>(), false);
         }

      });
   }

   private void IliIilliIi(String slug) {
      if (!IIllliIilIllliIi.IliIlllilIi()) {
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
      } else {
         lIlIllIliIlIllIl var2;
         try {
            var2 = lilllIiliilllIil.iliIiiliiiii(slug);
         } catch (IOException var4) {
            var2 = null;
         }

         if (var2 == null) {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
         } else {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var2.iiililIiIl, true);
            IIllliIilIllliIi.liiiIIllIl(slug, (local) -> {
               if (!local.IllililIllllililIl) {
                  this.llIliilIli(liIlIliiIlIl<invokedynamic>(), local.lilililIliilililIl != null ? local.lilililIliilililIl : liIlIliiIlIl<invokedynamic>(), false);
               } else {
                  String var3 = local.illililIlIilililIl;
                  Runnable var4 = () -> IlliIilllliIil.IIlllIlliIll(var3, liIlIliiIlIl<invokedynamic>(), (localx) -> {
                        if (localx.iiiIilIllIIIlilIll) {
                           this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var2.iiililIiIl + liIlIliiIlIl<invokedynamic>(), true);
                        } else {
                           this.llIliilIli(liIlIliiIlIl<invokedynamic>(), localx.ilIlilIllIiIlilIll != null ? localx.ilIlilIllIiIlilIll : localx.IlIlilIllllIlilIll, false);
                        }

                     });
                  IlliIilllliIil.IilliliilIIi(var3, (got) -> {
                     String var5 = got.iiiIilIllIIIlilIll && got.lIIlilIlliIIlilIll != null ? ((lllililillilil)got.lIIlilIlliIIlilIll).lIiIilIliiIiIilIli : null;
                     lIlIllIliIlIllIl var6 = IlliIilllliIil.IliIlllilIi(var2);
                     if (var5 != null && var6 != null && var5.equalsIgnoreCase(var6.IIIllIIliIIl())) {
                        var4.run();
                     } else {
                        IlliIilllliIil.IiIlliIliiIl(var3, var2, liIlIliiIlIl<invokedynamic>(), (promote) -> {
                           if (!promote.iiiIilIllIIIlilIll) {
                              this.llIliilIli(liIlIliiIlIl<invokedynamic>(), promote.ilIlilIllIiIlilIll != null ? promote.ilIlilIllIiIlilIll : promote.IlIlilIllllIlilIll, false);
                           } else {
                              var4.run();
                           }
                        });
                     }
                  });
               }
            });
         }
      }
   }

   private void IlIllllIll(class_332 my, IIllIIIllIllIIIl top, int mx, int ctx, int target) {
      long var10 = 5062537017062007419L;
      List var6 = this.iiiIlIIIll();
      if (!var6.isEmpty()) {
         float var7 = llilliilililliil.iIlIiIllIi("");

         for(long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < var6.size(); var12 += 4294967296L) {
            float var9 = (float)(mx + (int)(var12 >>> 32) * 10);
            if ((int)(var12 >>> 32) == 0) {
               llilliilililliil.liIIiiiIIi(my, -2054070, -5854026, (String)var6.get((int)(var12 >>> 32)), (float)this.IlIIiIillIIiIi, var9);
            } else {
               llilliilililliil.lIlIliIlIl((String)var6.get((int)(var12 >>> 32)), (float)this.IlIIiIillIIiIi + var7, var9, 0.82F, -5854026);
            }
         }

         float var8 = (float)(var6.size() * 10);
         top.liiiIIllIl((float)this.IlIIiIillIIiIi, (float)mx, (float)this.liIIiIiiiIIiIi, var8, () -> {
            this.lIlliIiiIlliIi = null;
            this.IllliIilllliIi = null;
         });
         this.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)mx, (float)this.liIIiIiiiIIiIi, var8, ctx, target, true);
      }
   }

   private void Iillllilll(class_332 now, IIllIIIllIllIIIl mine, iiiliiiIIIiiii cardX, float my, int target, int mx, int loaded, int cardW, int cardY, long ctx, boolean v) {
      long var23 = -5600851324314754793L;
      long var25 = -3955765849478444949L;
      String var13 = cardX.IliIlllilIi();
      float var14 = this.IIllllIlll(now, var13, cardX.liiiIIllIl(), my, target, mx, loaded, cardW, cardY);
      float var15 = (float)(target + 8);
      float var16 = (float)(target + loaded - 8);
      float var17 = var15 + llilliilililliil.Illillllil(now, cardX.IilliliilIIi(), var15, var14 + 6.0F, var16 - var15) + 4.0F;
      if (cardX.lIiiIiIlilli() != null) {
         llilliilililliil.Illillllil(now, cardX.lIiiIiIlilli(), var17, var14 + 6.0F, var16 - var17);
      }

      float var18 = (float)(mx + 60) - 6.0F - 16.0F;
      var23 ^= ((long)var13.equals(this.IIIliIilIIliIi) << 32 ^ var23) & -1L << 32;
      var23 ^= ((long)((int)(var23 >>> 32) != 0 && liIlIliiIlIl<invokedynamic>().equals(this.iIIliIiIlIliIi) ? 1 : 0) ^ var23) & -1L >>> 32;
      var25 ^= ((long)(var13.equals(this.IiIliIiliIliIi) && ctx < this.iiIliIiIIlliIi ? 1 : 0) << 32 ^ var25) & -1L << 32;
      float var22 = llilliilililliil.iilllIIill(now, mine, this.iiiIIliIIIlIli, IIlilIliiIli(var13, liIlIliiIlIl<invokedynamic>()), (int)var23 != 0 ? liIlIliiIlIl<invokedynamic>() : ((int)(var25 >>> 32) != 0 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>()), (int)var23 == 0 && (int)(var25 >>> 32) == 0 ? lIlIIiliIlIIil.IIillIiliIil() : null, var16, var18, 16.0F, 50.0F, cardW, cardY, true, this.iiiIIliIIIlIli.iliIiiliiiii(IIlilIliiIli(var13, liIlIliiIlIl<invokedynamic>()), (int)var23 != 0 ? 1.0F : 0.0F, 16.0F), () -> this.iIiilIliil(var13, liIlIliiIlIl<invokedynamic>(), () -> this.Iiiilliiil(var13)));
      var22 -= 19.0F;
      this.iilllIIill(now, mine, IIlilIliiIli(var13, liIlIliiIlIl<invokedynamic>()), var22, var18, (int)(var23 >>> 32) != 0 && liIlIliiIlIl<invokedynamic>().equals(this.iIIliIiIlIliIi), cardW, cardY, () -> this.iIiilIliil(var13, liIlIliiIlIl<invokedynamic>(), () -> this.iiiilIIIIi(var13)));
      if (v && cardX.IIIllIIliIIl()) {
         var22 -= 19.0F;
         llilliilililliil.IIllllIlll(now, mine, this.iiiIIliIIIlIli, IIlilIliiIli(var13, liIlIliiIlIl<invokedynamic>()), lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), var22, var18, 16.0F, 10.0F, cardW, cardY, false, () -> this.IliIilliIi(var13));
         this.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), var22, var18, 16.0F, 16.0F, cardW, cardY, false);
      }

      if (v) {
         var22 -= 19.0F;
         llilliilililliil.IIllllIlll(now, mine, this.iiiIIliIIIlIli, IIlilIliiIli(var13, liIlIliiIlIl<invokedynamic>()), lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), var22, var18, 16.0F, 10.0F, cardW, cardY, false, () -> this.liIIiiiIIi(var13));
         this.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), var22, var18, 16.0F, 16.0F, cardW, cardY, false);
      }

      this.iIlllIllll(now, cardX.iliIiiliiiii(), var15, var18, var22 - 6.0F);
   }

   private static boolean lilIliilIl() {
      class_1041 var0 = class_310.method_1551().method_22683();
      if (!class_3675.method_15987(var0, 75)) {
         return false;
      } else {
         return class_3675.method_15987(var0, 341) || class_3675.method_15987(var0, 345) || class_3675.method_15987(var0, 343) || class_3675.method_15987(var0, 347);
      }
   }

   private void ilIIiIiIIi() {
      IlIIililllIIilil var1 = this.lIIIiiIIIi();
      if (var1 != null) {
         var1.IlIliIIlil.IIillIiliIil(!var1.IlIliIIlil.Iilllilliill());
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var1.IlIliIIlil.Iilllilliill() ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>(), var1.IlIliIIlil.Iilllilliill());
      }
   }

   private static String IiIliliIli() {
      try {
         return class_310.method_1551().method_1548().method_1676();
      } catch (Throwable var1) {
         return liIlIliiIlIl<invokedynamic>();
      }
   }

   private List<String> iiiIlIIIll() {
      long var13 = 4571850143875956019L;
      long var15 = 1718225387105255069L;
      ArrayList var1 = new ArrayList();
      if (this.iIlIiIiIllIiIi != Iilliiillilliiil.iIIIilIiil && !this.Ililllililil()) {
         float var2 = Math.max(40.0F, (float)this.liIIiIiiiIIiIi - llilliilililliil.iIlIiIllIi("") - 2.0F);
         String[] var3 = new String[]{this.lIlliIiiIlliIi, this.IllliIilllliIi};
         var13 ^= ((long)var3.length << 32 ^ var13) & -1L << 32;

         for(long var18 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var18 < (int)(var18 >>> 32); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            String var6 = var3[(int)var18];
            if (var6 != null) {
               StringBuilder var7 = new StringBuilder();
               String[] var8 = var6.split(liIlIliiIlIl<invokedynamic>());
               var15 ^= ((long)var8.length << 32 ^ var15) & -1L << 32;

               for(var15 ^= (0L ^ var15) & -1L >>> 32; (int)var15 < (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
                  String var11 = var8[(int)var15];
                  String var12 = var7.length() == 0 ? var11 : var7 + liIlIliiIlIl<invokedynamic>() + var11;
                  if (var7.length() > 0 && llilliilililliil.IiIIlliIIl(var12, 0.82F) > var2) {
                     var1.add(var7.toString());
                     var7 = new StringBuilder(var11);
                  } else {
                     var7 = new StringBuilder(var12);
                  }
               }

               if (var7.length() > 0) {
                  var1.add(var7.toString());
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   private void IIillIiliIil() {
      List var1 = this.lllIiIiillIiIi;
      if (var1 != this.IilIiIililIiIi) {
         this.IiIlliIliiIl(var1);
      }

      String var2 = this.IiIIIliliIIIli.IlIillIiilIi().trim().toLowerCase(Locale.ROOT);
      this.IliIiIilliIiIi.clear();
      this.iliIiIiIiiIiIi = 0;

      for(iiiliiiIIIiiii var4 : this.iilIiIiIIiIiIi) {
         if (this.iIlIiIiIllIiIi != Iilliiillilliiil.IlIIilIiil || var4.IlIlllIlilIl()) {
            ++this.iliIiIiIiiIiIi;
            if (var2.isEmpty() || var4.iIlIlllllill().contains(var2)) {
               this.IliIiIilliIiIi.add(var4);
            }
         }
      }

   }

   private void Iiiiliiiiiii(class_332 ghost, String name, float loaded, float cardW, int cardX, int cardY, int ctx) {
      if (!(cardW <= 0.004F)) {
         float var8 = IliiIilliiIi.IilliliilIIi(cardW);

         try {
            llilliilililliil.lililiilil(ghost, (float)cardX, (float)cardY, (float)ctx, 60.0F, IIIIllIIIl(name, loaded, ctx), 0.0F, 0.0F);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var8);
         }

      }
   }

   private boolean Iiilliiliiil(List<lliIiIliliIiIl> codes) {
      return this.llliiIiilliiIi && this.iIliiIiIlliiIi == null || this.IiliiIililiiIi != null || codes.isEmpty();
   }

   private void llIililIil(String code) {
      this.lIiIiiIiIi(code);
      this.IIllIlilIllIli = code;
      this.iIllIliIlllIli = System.currentTimeMillis() + 1400L;
      this.llIliilIli(liIlIliiIlIl<invokedynamic>(), code + liIlIliiIlIl<invokedynamic>(), true);
   }

   private void Illillliilli(Set<String> live) {
      this.iiiIIliIIIlIli.IIlllIlliIll((livex) -> {
         long var3 = -1950159481534097398L;
         if (!livex.startsWith(liIlIliiIlIl<invokedynamic>())) {
            return true;
         } else {
            var3 ^= ((long)livex.indexOf(124) << 32 ^ var3) & -1L << 32;
            return (int)(var3 >>> 32) > 0 && live.contains(livex.substring(liIlIliiIlIl<invokedynamic>().length(), (int)(var3 >>> 32)));
         }
      });
   }

   private void iilllIIill(class_332 armed, IIllIIIllIllIIIl by, String mx, float act, float bx, boolean id, int my, int target, Runnable ctx) {
      llilliilililliil.iIlllIllll(armed, by, this.iiiIIliIIIlIli, mx, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), act, bx, 16.0F, 10.0F, my, target, true, this.iiiIIliIIIlIli.iliIiiliiiii(mx + liIlIliiIlIl<invokedynamic>(), id ? 1.0F : 0.0F, 18.0F), ctx);
      this.iliIiiliiiii(id ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>(), act, bx, 16.0F, 16.0F, my, target, false);
   }

   private void ilillIiill(class_332 mx, int top, int my, int l, Ilillillilli ctx) {
      long var16 = -4906185497188315026L;
      long var18 = -4751987771066033289L;
      long var20 = -1943741861820451028L;
      float var6 = (float)this.IlIIiIillIIiIi;
      var16 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IlIIilIlllIIilIl.lliiIlliIl, -1, 0.3) << 32 ^ var16) & -1L << 32;

      for(var16 ^= (0L ^ var16) & -1L >>> 32; (int)var16 < iIliIIiIlliIIi.length; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
         String var9 = iIliIIiIlliIIi[(int)var16];
         float var10 = (float)Math.ceil((double)llilliilililliil.IiIIlliIIl(var9, 0.82F)) + 14.0F;
         var18 ^= ((long)(this.liiiiIiiiiiiIi == (int)var16 ? 1 : 0) << 32 ^ var18) & -1L << 32;
         float var12 = this.iiiIIliIIIlIli.IIIllIIliIIl(liIlIliiIlIl<invokedynamic>() + (int)var16, (int)(var18 >>> 32) == 0 && llilliilililliil.Iliilliiilii((double)my, (double)l, var6, (float)top, var10, 14.0F));
         float var13 = this.iiiIIliIIIlIli.iliIiiliiiii(liIlIliiIlIl<invokedynamic>() + (int)var16, (int)(var18 >>> 32) != 0 ? 1.0F : 0.0F, 16.0F);
         var18 ^= ((long)llilliilililliil.IlIlllIlilIl(mx, var6 + var10 / 2.0F, (float)top + 7.0F, this.iiiIIliIIIlIli.IilliliilIIi(lliilIiiliilIi[(int)var16], 0.07F)) ^ var18) & -1L >>> 32;
         if (var13 > 0.01F) {
            IIIiiIillIIiiIil.Ililllililil(mx, var6, (float)top, var10, 14.0F, 5.0F, llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.16F * var13), llilliilililliil.IIIIllIIIl(IlIIilIlllIIilIl.lliiIlliIl, 0.42F * var13));
         } else if (var12 > 0.01F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(mx, var6, (float)top, var10, 14.0F, 5.0F, llilliilililliil.IIIIllIIIl(-1, 0.06F * var12));
         }

         llilliilililliil.lIlIliIlIl(var9, var6 + 7.0F, llilliilililliil.IllIllllIl((float)top, 14.0F, 0.82F), 0.82F, IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var12), (int)(var16 >>> 32), (double)var13));
         llilliilililliil.IiIlliIliiIl(mx, (boolean)((int)var18));
         var20 ^= ((long)((int)var16) << 32 ^ var20) & -1L << 32;
         this.lliIIliiliIIli.iIlIlllllill(var6, (float)top - 1.0F, var10, 16.0F, () -> this.iIIIlIlIIl(index), this.iiiIIliIIIlIli, lliilIiiliilIi[(int)var16]);
         var6 += var10 + 3.0F;
      }

      if (ctx != null && !ctx.ilillIlIlIiillIlIl.isEmpty()) {
         var16 ^= ((long)ctx.ilillIlIlIiillIlIl.size() ^ var16) & -1L >>> 32;
         String var22 = ctx.llIilIlIlilIilIlIl > (int)var16 ? liIlIliiIlIl<invokedynamic>() + (int)var16 + liIlIliiIlIl<invokedynamic>() + ctx.llIilIlIlilIilIlIl : (int)var16 + ((int)var16 == 1 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>());
         llilliilililliil.lIlIliIlIl(var22, (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi) - llilliilililliil.IiIIlliIIl(var22, 0.82F), llilliilililliil.IllIllllIl((float)top, 14.0F, 0.82F), 0.82F, -11117467);
      }
   }

   private void iIiilIliil(String action, String run, Runnable slug) {
      long var4 = System.currentTimeMillis();
      if (action.equals(this.IIIliIilIIliIi) && run.equals(this.iIIliIiIlIliIi) && var4 <= this.llIliIiilIliIi) {
         this.IIIliIilIIliIi = null;
         this.iIIliIiIlIliIi = null;
         slug.run();
      } else {
         this.IIIliIilIIliIi = action;
         this.iIIliIiIlIliIi = run;
         this.llIliIiilIliIi = var4 + 2500L;
      }

   }

   private void iilIiIIiIi() {
      String var1 = this.IiiliIiliiliIi.trim();
      if (var1.length() < 4) {
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
      } else {
         this.lliliIiililiIi = false;
         this.IiiliIiliiliIi = "";
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var1, true);
         IlliIilllliIil.IlIillIiilIi(var1, (res) -> {
            if (!res.iiiIilIllIIIlilIll) {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), res.ilIlilIllIiIlilIll != null ? res.ilIlilIllIiIlilIll : res.IlIlilIllllIlilIll, false);
            } else {
               try {
                  iliiIIllIiiiIIll[] var2 = new iliiIIllIiiiIIll[1];
                  lIlIllIliIlIllIl var3 = lIlIllIliIlIllIl.lIiiIiIlilli(((iIlIiillIllIiill)res.lIIlilIlliIIlilIll).iIIliliill, var2);
                  if (var3 == null) {
                     this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
                     return;
                  }

                  String var4 = lilllIiliilllIil.IIlllIlliIll(var3);
                  IillilIilillilIi var5 = new IillilIilillilIi();
                  var5.lllIillIIi = ilIIIllIiIIIll.ilIIlIIilIiIIlIIil;

                  try {
                     lilllIiliilllIil.iilllIIill(var4, var5);
                  } catch (IOException var7) {
                  }

                  this.llIliilIli(liIlIliiIlIl<invokedynamic>(), lIlliiIlli(var3.iiililIiIl) + liIlIliiIlIl<invokedynamic>(), true);
                  this.IIIllIIliIIl();
               } catch (IOException var8) {
                  this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var8.getMessage(), false);
               }

            }
         });
      }
   }

   private static int IIlllIlliIll(JsonObject content) {
      long var7 = 6924861682645180842L;
      if (content != null && content.has(liIlIliiIlIl<invokedynamic>()) && content.get(liIlIliiIlIl<invokedynamic>()).isJsonObject()) {
         lIiIiIlliIiIiIll var1 = lIiIiIlliIiIiIll.IliIlllilIi();
         var7 ^= (0L ^ var7) & -1L << 32;

         for(Map.Entry var4 : content.getAsJsonObject(liIlIliiIlIl<invokedynamic>()).entrySet()) {
            if (((JsonElement)var4.getValue()).isJsonObject() && !IIiiIllIiiIl.iIlIlllllill((String)var4.getKey())) {
               String var5 = IIiiIllIiiIl.liiiIIllIl((String)var4.getKey());
               if (!var1.IIiilIiiiIii(var5) && var1.IiIiliIiiiIi(var1.Ililllililil(var5, false), true)) {
                  JsonElement var6 = ((JsonElement)var4.getValue()).getAsJsonObject().get(liIlIliiIlIl<invokedynamic>());
                  if (var6 != null && var6.isJsonPrimitive() && var6.getAsJsonPrimitive().isBoolean() && var6.getAsBoolean()) {
                     var7 += 4294967296L;
                  }
               }
            }
         }

         return (int)(var7 >>> 32);
      } else {
         return 0;
      }
   }

   static {
      ilIiIIiIiIiIIi = new Iilliiillilliiil[]{Iilliiillilliiil.lIIIilIiil, Iilliiillilliiil.iIIIilIiil, Iilliiillilliiil.IlIIilIiil};
      liIiIIiiiIiIIi = new String[]{liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>()};
      IIliIIilIliIIi = new String[]{liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>()};
      iIliIIiIlliIIi = new String[]{liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>()};
      llliIIiilliIIi = new Integer[]{1, 5, 25, null};
      IiliIIililiIIi = new String[]{liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>()};
      lliilIiiliilIi = new String[]{liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>()};
      iiiilIiIIIIiIi = DateTimeFormatter.ofPattern(liIlIliiIlIl<invokedynamic>());
      iliiiIiIiiiiIi = false;
   }

   private boolean IlIIillIIi() {
      IlIIililllIIilil var1 = this.lIIIiiIIIi();
      return var1 != null && var1.IlIliIIlil.Iilllilliill();
   }

   private static int IlIillIiilIi(int count, int cols, int cardH) {
      long var4 = -2515102648741470009L;
      var4 ^= ((long)((count + cols - 1) / cols) << 32 ^ var4) & -1L << 32;
      return (int)(var4 >>> 32) * cardH + Math.max(0, (int)(var4 >>> 32) - 1) * 4;
   }

   private void lllIiillIi(Integer maxUses) {
      if (this.iIliiIiIlliiIi == null) {
         this.IiliiIililiiIi = liIlIliiIlIl<invokedynamic>();
      } else {
         this.llliiIiilliiIi = true;
         IlliIilllliIil.Ililllililil(this.iIliiIiIlliiIi, maxUses, (res) -> {
            this.llliiIiilliiIi = false;
            if (res.iiiIilIllIIIlilIll) {
               this.lIiiiIiiIiiiIi = ((lliIiIliliIiIl)res.lIIlilIlliIIlilIll).lIillIilliIillIill;
               this.lIiIiiIiIi(((lliIiIliliIiIl)res.lIIlilIlliIIlilIll).lIillIilliIillIill);
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), ((lliIiIliliIiIl)res.lIIlilIlliIIlilIll).lIillIilliIillIill + liIlIliiIlIl<invokedynamic>() + ((lliIiIliliIiIl)res.lIIlilIlliIIlilIll).IliIlllilIi(), true);
               this.iIlIiIllIi();
            } else {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), res.ilIlilIllIiIlilIll != null ? res.ilIlilIllIiIlilIll : liIlIliiIlIl<invokedynamic>(), false);
            }

         });
      }
   }

   private void IiiIlliiIl(class_332 mx, int ctx, int my, int now, long top) {
      long var16 = -1744234445934120378L;
      long var18 = 7442654222770969704L;
      long var20 = -1282822255608868847L;
      this.IIillIiliIil();
      if (this.iilIiIiIIiIiIi != this.lIiIiIiiIiIiIi) {
         this.lIiIiIiiIiIiIi = this.iilIiIiIIiIiIi;
         HashSet var7 = new HashSet();

         for(iiiliiiIIIiiii var9 : this.iilIiIiIIiIiIi) {
            var7.add(var9.IliIlllilIi());
         }

         this.Illillliilli(var7);
      }

      var16 ^= ((long)(this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil ? 1 : 0) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)((int)(var16 >>> 32) == 0 || !this.illliIiIilliIi && !this.lliliIiililiIi ? 0 : 1) ^ var16) & -1L >>> 32;
      float var24 = (int)(var16 >>> 32) != 0 ? this.iiiIIliIIIlIli.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), (int)var16 != 0 ? 1.0F : 0.0F, 20.0F) : 0.0F;
      if ((int)var16 != 0) {
         this.IlIiiIillIiiIi = this.illliIiIilliIi;
         this.ilIiiIiIiIiiIi = this.illliIiIilliIi ? this.IIiliIilIiliIi : this.IiiliIiliiliIi;
      }

      if ((int)var16 != 0 || var24 > 0.01F) {
         this.ilIllIiIll(mx, ctx, my, now, var24, (boolean)((int)var16));
      }

      var18 ^= ((long)(ctx + ((int)(var16 >>> 32) != 0 ? this.IIIilIIiiIIi() : 0)) << 32 ^ var18) & -1L << 32;
      this.IlIllllIll(mx, (int)var16 != 0 ? this.IiiIIliliiIIli : this.lliIIliiliIIli, (int)(var18 >>> 32), (int)var16 != 0 ? this.IlIIiIillIIiIi - 4000 : my, now);
      var18 ^= ((long)((int)(var18 >>> 32) + this.lIIlliIIll()) ^ var18) & -1L >>> 32;
      IIllIIIllIllIIIl var12 = (int)var16 != 0 ? this.IiiIIliliiIIli : this.lliIIliiliIIli;
      var20 ^= ((long)((int)var16 != 0 ? this.IlIIiIillIIiIi - 4000 : my) << 32 ^ var20) & -1L << 32;
      float var14 = IliiIilliiIi.IilliliilIIi(1.0F - 0.45F * var24);

      try {
         if (this.IliIiIilliIiIi.isEmpty()) {
            this.IlIlIlillIlIli = -1;
         }

         if (this.iliIiIiIiiIiIi == 0) {
            if ((int)(var16 >>> 32) != 0) {
               llilliilililliil.IilIililIi(mx, var12, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var18), (float)this.liIIiIiiiIIiIi, 120.0F, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), (int)(var20 >>> 32), now, this::llIIlilIIl);
            } else {
               llilliilililliil.IilIililIi(mx, var12, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var18), (float)this.liIIiIiiiIIiIi, 120.0F, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), (int)(var20 >>> 32), now, () -> this.IIiilIiiiIii(Iilliiillilliiil.iIIIilIiil));
            }
         } else if (this.IliIiIilliIiIi.isEmpty()) {
            llilliilililliil.IilIililIi(mx, var12, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var18), (float)this.liIIiIiiiIIiIi, 88.0F, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), (String)null, (int)(var20 >>> 32), now, (Runnable)null);
         } else {
            this.lllllillll(mx, var12, (int)var18, (int)(var20 >>> 32), now, top, (boolean)((int)(var16 >>> 32)));
         }
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var14);
      }

   }

   // $FF: synthetic method
   private static CallSite IillIllillIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) >>> 7 | (char)((char)(~var4[var5]) << 9 | (char)(~var4[var5]) >>> 7) << 9) - 12311) + var5) + '\uef9d') - var5) + var5) ^ '黒') - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiilIIIIi(String slug) {
      try {
         IIllliIilIllliIi.IilliliilIIi(slug);
         lilllIiliilllIil.IIlilIliiIli(slug);
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), slug, false);
         this.IIIllIIliIIl();
      } catch (IOException var3) {
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
      }

   }

   private int IiIiliIiiiIi() {
      long var2 = 1445913721830183528L;
      if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
         Ilillillilli var4 = this.lIlIIliiIlIIli;
         if (this.illIIliIilIIli) {
            return 20 + IlIillIiilIi(6, 2, 60);
         } else {
            return this.IllIIlilllIIli == null && var4 != null && !var4.ilillIlIlIiillIlIl.isEmpty() ? 20 + IlIillIiilIi(var4.ilillIlIlIiillIlIl.size(), 2, 60) : 140;
         }
      } else if (this.Ililllililil()) {
         List var1 = this.iiliiIiIIiiiIi;
         return 24 + (this.Iiilliiliiil(var1) ? 88 : IlIillIiilIi(var1.size(), 3, 36));
      } else {
         this.IIillIiliIil();
         var2 ^= ((long)((this.iIlIiIiIllIiIi == Iilliiillilliiil.lIIIilIiil ? this.IIIilIIiiIIi() : 0) + this.lIIlliIIll()) << 32 ^ var2) & -1L << 32;
         if (this.iliIiIiIiiIiIi == 0) {
            return (int)(var2 >>> 32) + 120;
         } else {
            return this.IliIiIilliIiIi.isEmpty() ? (int)(var2 >>> 32) + 88 : (int)(var2 >>> 32) + IlIillIiilIi(this.IliIiIilliIiIi.size(), 2, 60);
         }
      }
   }

   private void IIIillIIil(class_332 my, int top, int mx, int ctx) {
      long var33 = 2730291110589199411L;
      long var35 = -2851996927560037154L;
      long var37 = -1790644986952489178L;
      long var39 = 5118657640849508110L;
      long var29 = -1624066584067087177L;
      long var31 = -5223782259762822124L;
      IIliiIlllIliiIll var5 = llilliilililliil.IIiilIiiiIii();
      float var6 = llilliilililliil.lIilliIill(my, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi + 40.0F, (float)top, 18.0F, mx, ctx, false, this::IIlIilIlIi) + 48.0F;
      float var7 = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi);

      for(var29 ^= ((long)(IiliIIililiIIi.length - 1) << 32 ^ var29) & -1L << 32; (int)(var29 >>> 32) >= 0; var29 += -4294967296L) {
         Integer var9 = llliIIiilliIIi[(int)(var29 >>> 32)];
         var7 = llilliilililliil.lIilliIill(my, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>() + (int)(var29 >>> 32), IiliIIililiIIi[(int)(var29 >>> 32)], var7, (float)top, 18.0F, mx, ctx, false, () -> this.lllIiillIi(var9)) - 4.0F;
      }

      String var8 = liIlIliiIlIl<invokedynamic>();
      float var53 = var7 - 4.0F - llilliilililliil.IiIIlliIIl(var8, 0.82F);
      llilliilililliil.lIlIliIlIl(var8, var53, llilliilililliil.IllIllllIl((float)top, 18.0F, 0.82F), 0.82F, -7630437);
      llilliilililliil.iiIIlIIlIl(var5.Iiilliiliiil(lIlliiIlli(this.IIliiIilIliiIi), var53 - 8.0F - var6), var6, (float)var5.IlIillIiilIi(top, 18), -920587);
      var29 ^= ((long)(top + 24) ^ var29) & -1L >>> 32;
      List var11 = this.iiliiIiIIiiiIi;
      if (this.llliiIiilliiIi && this.iIliiIiIlliiIi == null) {
         llilliilililliil.IilIililIi(my, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var29), (float)this.liIIiIiiiIIiIi, 88.0F, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), (String)null, mx, ctx, (Runnable)null);
      } else if (this.IiliiIililiiIi != null) {
         llilliilililliil.IilIililIi(my, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var29), (float)this.liIIiIiiiIIiIi, 88.0F, lIlIIiliIlIIil.IiIlliIliiIl(), liIlIliiIlIl<invokedynamic>(), var5.Iiilliiliiil(this.IiliiIililiiIi, (float)this.liIIiIiiiIIiIi / 0.82F), (String)null, mx, ctx, (Runnable)null);
      } else if (var11.isEmpty()) {
         llilliilililliil.IilIililIi(my, this.lliIIliiliIIli, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (float)this.IlIIiIillIIiIi, (float)((int)var29), (float)this.liIIiIiiiIIiIi, 88.0F, lIlIIiliIlIIil.IIIIllIIIl(liIlIliiIlIl<invokedynamic>()), liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), (String)null, mx, ctx, (Runnable)null);
      } else {
         if (var11 != this.IliiiIilliiiIi) {
            this.IliiiIilliiiIi = var11;
            HashSet var12 = new HashSet();

            for(lliIiIliliIiIl var14 : var11) {
               var12.add(var14.lIillIilliIillIill);
            }

            this.Illillliilli(var12);
         }

         var31 ^= (4294967296L ^ var31) & -1L << 32;

         for(var31 ^= (0L ^ var31) & -1L >>> 32; (int)var31 < var11.size(); var31 ^= (var31 ^ var31 + (long)1) & -1L >>> 32) {
            var31 ^= ((long)((int)(var31 >>> 32) * 31 + String.valueOf(((lliIiIliliIiIl)var11.get((int)var31)).lIillIilliIillIill).hashCode()) << 32 ^ var31) & -1L << 32;
         }

         this.Iliilliiilii(ilIiIIiIiIiIIi.length, (int)(var31 >>> 32), var11.size());
         var31 ^= (1L ^ var31) & -1L >>> 32;

         for(var33 ^= (0L ^ var33) & -1L << 32; (int)(var33 >>> 32) < var11.size(); var33 += 4294967296L) {
            var33 ^= ((long)((int)(var33 >>> 32) % 3) ^ var33) & -1L >>> 32;
            var35 ^= ((long)llilliilililliil.iIiIlIliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 3, 4, (int)var33) << 32 ^ var35) & -1L << 32;
            var35 ^= ((long)llilliilililliil.lliIliliIl(this.IlIIiIillIIiIi, this.liIIiIiiiIIiIi, 3, 4, (int)var33) ^ var35) & -1L >>> 32;
            var37 ^= ((long)((int)var29 + (int)(var33 >>> 32) / 3 * 40) << 32 ^ var37) & -1L << 32;
            if ((int)var33 == 0) {
               var31 ^= ((long)this.liIlliiIll(my, (int)(var37 >>> 32), 36) ^ var31) & -1L >>> 32;
            }

            if ((int)var31 != 0) {
               iIIliiIiIlIliiIi var19 = this.lIIlIliiIIlIli.lIiiIiIlilli((int)(var33 >>> 32));
               if (!var19.iliIiiliiiii()) {
                  float var20 = var19.IiilIIIlIi;
                  float var21 = var19.liilIIIlIi;
                  IIllIIIllIllIIIl var22 = var19.lIIiIIIlIi ? this.lliIIliiliIIli : IIllIIIllIllIIIl.ililiiIlIl;
                  var37 ^= ((long)(var19.IIIiIIIlIi ? mx : this.IlIIiIillIIiIi - 4000) ^ var37) & -1L >>> 32;
                  var39 ^= ((long)llilliilililliil.IlIlllIlilIl(my, (float)((int)(var35 >>> 32)) + (float)((int)var35) / 2.0F, (float)((int)(var37 >>> 32)) + 18.0F, var19.iiilIIIlIi) << 32 ^ var39) & -1L << 32;

                  try {
                     if (var20 > 0.004F) {
                        float var25 = IliiIilliiIi.IilliliilIIi(var20);

                        try {
                           llilliilililliil.illilIilil(my, (float)((int)(var35 >>> 32)), (float)((int)(var37 >>> 32)), (float)((int)var35), 36.0F, 0.0F, 0.0F, 0.0F);
                        } finally {
                           IliiIilliiIi.lIiiIiIlilli(var25);
                        }
                     }

                     if (var21 > 0.002F) {
                        float var54 = IliiIilliiIi.IilliliilIIi(var21);

                        try {
                           this.iIIilIlIil(my, var22, (lliIiIliliIiIl)var11.get((int)(var33 >>> 32)), (int)(var35 >>> 32), (int)(var37 >>> 32), (int)var35, (int)var37, ctx);
                        } finally {
                           IliiIilliiIi.lIiiIiIlilli(var54);
                        }
                     }
                  } finally {
                     llilliilililliil.IiIlliIliiIl(my, (boolean)((int)(var39 >>> 32)));
                  }
               }
            }
         }

      }
   }

   private void ilIllIiIll(class_332 ctx, int live, int my, int mx, float top, boolean alpha) {
      long var32 = 3571969759001434802L;
      long var28 = 7053695538875337051L;
      long var30 = 2920648567966560940L;
      IIliiIlllIliiIll var7 = llilliilililliil.IIiilIiiiIii();
      var28 ^= ((long)this.IlIiiIillIiiIi << 32 ^ var28) & -1L << 32;
      String var9 = this.ilIiiIiIiIiiIi;
      var28 ^= ((long)(var9.trim().length() >= ((int)(var28 >>> 32) != 0 ? 3 : 4) ? 1 : 0) ^ var28) & -1L >>> 32;
      Runnable var11 = this::lIlIliIlIl;
      String var12 = (int)(var28 >>> 32) != 0 ? (this.lilliIiiilliIi == null ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>()) : liIlIliiIlIl<invokedynamic>();
      iliiIiIiIiiiIiIi var13 = (int)(var28 >>> 32) != 0 ? this.iIiliIiIliliIi : this.iiiliIiIIIiiIi;
      IIllIIIllIllIIIl var14 = alpha ? this.lliIIliiliIIli : this.IiiIIliliiIIli;
      var30 ^= ((long)(alpha ? my : this.IlIIiIillIIiIi - 4000) << 32 ^ var30) & -1L << 32;
      float var16 = IliiIilliiIi.IilliliilIIi(top);

      try {
         float var17 = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi);
         float var18 = llilliilililliil.lllllillll(ctx, var14, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), (int)(var28 >>> 32) != 0 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>(), (class_2960)null, var17, (float)live, 18.0F, (int)(var30 >>> 32), mx, (boolean)((int)var28), var11);
         if ((int)var28 == 0) {
            var14.liiiIIllIl(var18, (float)live - 1.0F, var17 - var18, 20.0F, var11);
         }

         float var19 = llilliilililliil.lIilliIill(ctx, var14, this.iiiIIliIIIlIli, liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), var18 - 4.0F, (float)live, 18.0F, (int)(var30 >>> 32), mx, false, this::IllIllllIl);
         float var20 = var19 - 6.0F - (float)this.IlIIiIillIIiIi;
         float var21 = alpha ? this.iiiIIliIIIlIli.iliIiiliiiii(liIlIliiIlIl<invokedynamic>(), this.lIIiiIiiIIiiIi ? 1.0F : 0.0F, 16.0F) : this.iiiIIliIIIlIli.IlIlllIlilIl(liIlIliiIlIl<invokedynamic>());
         IIIiiIillIIiiIil.Ililllililil(ctx, (float)this.IlIIiIillIIiIi, (float)live, var20, 18.0F, 5.0F, IilIIIIililIIIIi.IlIlllIlilIl(), IIIiiIillIIiiIil.IlIillIiilIi((double)var21));
         iiIlilIlIIllilIl.IliIlllilIi((float)this.IlIIiIillIIiIi + 6.0F, (float)live + 3.0F, 12.0F, 12.0F, lIlIIiliIlIIil.IIIIllIIIl((int)(var28 >>> 32) != 0 ? liIlIliiIlIl<invokedynamic>() : liIlIliiIlIl<invokedynamic>()), new Color(IilIIIIililIIIIi.Illlllllilll(-10722709, -920587, (double)var21), true), IIIiiIillIIiiIil.liiiIIllIl());
         float var22 = (float)this.IlIIiIillIIiIi + 24.0F;
         float var23 = var20 - 24.0F - 8.0F;
         var30 ^= ((long)var7.IlIillIiilIi(live, 18) ^ var30) & -1L >>> 32;
         String var25 = iiIliIIlli(var9, var23);
         if (var9.isEmpty()) {
            llilliilililliil.iiIIlIIlIl(var12, var22, (float)((int)var30), -7630437);
         } else {
            llilliilililliil.iiIIlIIlIl(var25, var22, (float)((int)var30), -920587);
         }

         if (alpha && this.lIIiiIiiIIiiIi) {
            var32 ^= ((long)((int)var7.IilliliilIIi() - 2) << 32 ^ var32) & -1L << 32;
            var13.iIlIlllllill(ctx, var22 + llilliilililliil.llIIlilIIl(var25) + 1.0F, live + (18 - (int)(var32 >>> 32)) / 2, (int)(var32 >>> 32), IlIIilIlllIIilIl.lliiIlliIl, llIilillilIilill.liiiIIllIl());
         }

         var14.liiiIIllIl((float)this.IlIIiIillIIiIi, (float)live - 1.0F, var20, 20.0F, this::iiIIlIIlIl);
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var16);
      }

   }

   private void iIIliIlIli(lllililillilil c) {
      this.llIliilIli(liIlIliiIlIl<invokedynamic>(), lIlliiIlli(c.ilIIilIliIiIIilIli), true);
      IlliIilllliIil.iliIiiliiiii(c.IlIIilIlillIIilIli, (String)null, (cx) -> {
         if (!cx.iiiIilIllIIIlilIll) {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), cx.ilIlilIllIiIlilIll != null ? cx.ilIlilIllIiIlilIll : cx.IlIlilIllllIlilIll, false);
         } else {
            try {
               iliiIIllIiiiIIll[] var3 = new iliiIIllIiiiIIll[1];
               lIlIllIliIlIllIl var4 = lIlIllIliIlIllIl.lIiiIiIlilli(((iIlIiillIllIiill)cx.lIIlilIlliIIlilIll).iIIliliill, var3);
               if (var4 == null) {
                  this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
                  return;
               }

               String var5 = lilllIiliilllIil.Illlllllilll(var4, c.IlIIilIlillIIilIli);
               IillilIilillilIi var6 = new IillilIilillilIi();
               var6.lllIillIIi = ilIIIllIiIIIll.liIIlIIiliiIIlIIil;
               var6.illIillIIi = c.IlIIilIlillIIilIli;
               var6.lilIillIIi = ((iIlIiillIllIiill)cx.lIIlilIlliIIlilIll).IlIliliill.has(liIlIliiIlIl<invokedynamic>()) ? ((iIlIiillIllIiill)cx.lIIlilIlliIIlilIll).IlIliliill.get(liIlIliiIlIl<invokedynamic>()).getAsString() : null;
               var6.IilIillIIi = ((iIlIiillIllIiill)cx.lIIlilIlliIIlilIll).IlIliliill.has(liIlIliiIlIl<invokedynamic>()) ? ((iIlIiillIllIiill)cx.lIIlilIlliIIlilIll).IlIliliill.get(liIlIliiIlIl<invokedynamic>()).getAsString() : null;
               var6.iilIillIIi = OffsetDateTime.now(ZoneOffset.UTC).toString();
               lilllIiliilllIil.iilllIIill(var5, var6);
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), lIlliiIlli(c.ilIIilIliIiIIilIli) + liIlIliiIlIl<invokedynamic>(), true);
               this.IIIllIIliIIl();
            } catch (IOException var7) {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var7.getMessage(), false);
            }

         }
      });
   }

   private void IiIIlliIIl() {
      if (!this.lliliIiililiIi) {
         this.IiiliIiliiliIi = "";
      }

      this.lliliIiililiIi = true;
      this.illliIiIilliIi = false;
      this.IIiliIilIiliIi = "";
      this.lilliIiiilliIi = null;
      this.iiIIlIIlIl();
   }

   private static float illliIilli(float v) {
      return v < 0.0F ? 0.0F : (v > 1.0F ? 1.0F : v);
   }

   private void iIlllIllll(class_332 ctx, String left, float limit, float rowY, float stamp) {
      if (left != null) {
         float var6 = limit + 12.0F;
         if (!(var6 + llilliilililliil.IiIIlliIIl(left, 0.82F) > stamp)) {
            iiIlilIlIIllilIl.IliIlllilIi(limit, rowY + 3.5F, 9.0F, 9.0F, lIlIIiliIlIIil.IIiilIiiiIii(), new Color(-10722709, true), IIIiiIillIIiiIil.liiiIIllIl());
            llilliilililliil.lIlIliIlIl(left, var6, llilliilililliil.IllIllllIl(rowY, 16.0F, 0.82F), 0.82F, -7630437);
         }
      }
   }

   public IIIillIIil(llIiliiilIilii y, int w, int x, int setting, int h) {
      this.iIlIiIiIllIiIi = Iilliiillilliiil.lIIIilIiil;
      this.lllIiIiillIiIi = new ArrayList();
      this.IilIiIililIiIi = null;
      this.iilIiIiIIiIiIi = new ArrayList();
      this.lIiIiIiiIiIiIi = null;
      this.IliIiIilliIiIi = new ArrayList();
      this.iliIiIiIiiIiIi = 0;
      this.liiIiIiiiiIiIi = null;
      this.IIIliIilIIliIi = null;
      this.iIIliIiIlIliIi = null;
      this.llIliIiilIliIi = 0L;
      this.IiIliIiliIliIi = null;
      this.iiIliIiIIlliIi = 0L;
      this.lIlliIiiIlliIi = null;
      this.IllliIilllliIi = null;
      this.illliIiIilliIi = false;
      this.lilliIiiilliIi = null;
      this.IIiliIilIiliIi = "";
      this.iIiliIiIliliIi = new iliiIiIiIiiiIiIi();
      this.lliliIiililiIi = false;
      this.IiiliIiliiliIi = "";
      this.iiiliIiIIIiiIi = new iliiIiIiIiiiIiIi();
      this.lIIiiIiiIIiiIi = false;
      this.IlIiiIillIiiIi = true;
      this.ilIiiIiIiIiiIi = "";
      this.liIiiIiiiIiiIi = null;
      this.IIliiIilIliiIi = null;
      this.iIliiIiIlliiIi = null;
      this.llliiIiilliiIi = false;
      this.IiliiIililiiIi = null;
      this.iiliiIiIIiiiIi = new ArrayList();
      this.lIiiiIiiIiiiIi = null;
      this.IliiiIilliiiIi = null;
      this.liiiiIiiiiiiIi = 0;
      this.IIIIIlilIIIIli = "";
      this.iIIIIliIlIIIli = "";
      this.llIIIliilIIIli = 0L;
      this.IiIIIliliIIIli = new iiiiilIiIIIIIiIi(0, 0, 0, 18);
      this.iiIIIliIIlIIli = false;
      this.lIlIIliiIlIIli = null;
      this.IllIIlilllIIli = null;
      this.illIIliIilIIli = false;
      this.lilIIliiilIIli = 0L;
      this.IIiIIlilIiIIli = null;
      this.iIiIIliIliIIli = new ArrayList();
      this.lliIIliiliIIli = new IIllIIIllIllIIIl();
      this.IiiIIliliiIIli = new IIllIIIllIllIIIl();
      this.iiiIIliIIIlIli = new iIliililIlliilil();
      this.lIIlIliiIIlIli = new iIIliiIiIlIliiIi();
      this.IlIlIlillIlIli = -1;
      this.ilIlIliIiIlIli = 0;
      this.liIlIliiiIlIli = 0;
      this.IIllIlilIllIli = null;
      this.iIllIliIlllIli = 0L;
      this.llllIliilllIli = new Vector2f();
      this.IillIlilillIli = 0L;
      this.iillIliIIilIli = 0L;
      this.lIilIliiIilIli = null;
      this.IlilIlillilIli = null;
      this.llIiIliilIiIli = false;
      this.IiIiIliliIiIli = 0L;
      this.lIIIiIiiIIIiIi = y;
      this.IlIIiIillIIiIi = w;
      this.ilIIiIiIiIIiIi = x;
      this.liIIiIiiiIIiIi = setting;
      this.IIlIiIilIlIiIi = h;
      this.IiIIIliliIIIli.liiiIIllIl(liIlIliiIlIl<invokedynamic>());
      this.IiIIIliliIIIli.iIlIlllllill(false);
      this.IiIIIliliIIIli.IilliliilIIi(6);
      this.IIIllIIliIIl();
      this.IlIlllIlilIl();
   }

   private void lIiIiiIiIi(String s) {
      try {
         class_310.method_1551().field_1774.method_1455(s);
      } catch (Throwable var3) {
      }

   }

   private static boolean IIiillIiil(char c) {
      return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
   }

   private static String lIlliiIlli(String s) {
      return s == null ? "" : s;
   }

   private void Iiiilliiil(String slug) {
      try {
         liiilIliiiilIl var2 = lilllIiliilllIil.IIIllIIliIIl(slug);
         if (var2 == null) {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
            return;
         }

         lIlIllIliIlIllIl var3 = var2.IIIillllllIIilllll;
         IIIllllllIIlllll var4 = iilIliIlIIiIliIl.IIiilIiiiIii(var2);
         lilllIiliilllIil.Iiiiliiiiiii(slug);
         if (var4.IlllilIill) {
            this.IiIliIiliIliIi = slug;
            this.iiIliIiIIlliIi = System.currentTimeMillis() + 1800L;
            String var5 = var4.illlilIill + liIlIliiIlIl<invokedynamic>() + (var4.lillilIill > 0 ? var4.lillilIill + liIlIliiIlIl<invokedynamic>() : "") + liIlIliiIlIl<invokedynamic>();
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var3.iiililIiIl + liIlIliiIlIl<invokedynamic>() + var5, true);
            this.lIlliIiiIlliIi = var4.IliIlllilIi();
            this.IllliIilllliIi = var4.liiiIIllIl();
            if (this.lIlliIiiIlliIi != null) {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), this.lIlliIiiIlliIi, false);
            }

            if (this.IllliIilllliIi != null) {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), this.IllliIilllliIi, false);
            }

            if (this.lIlliIiiIlliIi == null && this.IllliIilllliIi == null && !var4.iIililIill.isEmpty()) {
               this.llIliilIli(liIlIliiIlIl<invokedynamic>(), (String)var4.iIililIill.get(0), false);
            }
         } else if (var4.llllilIill) {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>(), false);
         } else {
            this.llIliilIli(liIlIliiIlIl<invokedynamic>(), var4.IlililIill != null ? var4.IlililIill : liIlIliiIlIl<invokedynamic>(), false);
         }

         this.IIIllIIliIIl();
      } catch (IOException var6) {
         this.llIliilIli(liIlIliiIlIl<invokedynamic>(), liIlIliiIlIl<invokedynamic>() + var6.getMessage(), false);
      }

   }

   public void IIiIllIiIl(class_332 my, int mx, int ctx) {
      long var12 = 3658145291828588819L;
      long var4 = System.nanoTime();
      if (this.iillIliIIilIli != 0L && var4 - this.iillIliIIilIli > 400000000L) {
         this.IilliliilIIi();
         if (!this.illliIiIilliIi && !this.lliliIiililiIi) {
            this.iiiIIliIIIlIli.IiIlliIliiIl(liIlIliiIlIl<invokedynamic>(), 0.0F);
         }
      }

      this.iillIliIIilIli = var4;
      if (this.lIIlIliiIIlIli.iIlIlllllill()) {
         this.IlIlIlillIlIli = -1;
         this.lIIlIliiIIlIli.IliIlllilIi();
      }

      if ((this.IiIIIliliIIIli.IIlilIliiIli() || this.lIIiiIiiIIiiIi) && lilIliilIl()) {
         this.IilliliilIIi();
      }

      long var6 = System.currentTimeMillis();
      if (this.IIIliIilIIliIi != null && var6 > this.llIliIiilIliIi) {
         this.IIIliIilIIliIi = null;
         this.iIIliIiIlIliIi = null;
      }

      this.lliIIliiliIIli.IliIlllilIi();
      this.IiiIIliliiIIli.IliIlllilIi();
      this.lIilIliiIilIli = null;
      this.IIIiIlilIIiIli = (float)this.IlIIiIillIIiIi + 1.0F;
      this.iIIiIliIlIiIli = (float)(this.IlIIiIillIIiIi + this.liIIiIiiiIIiIi) - 1.0F;
      this.iIiIlIliIl(my, mx, ctx);
      var12 ^= ((long)(this.ilIIiIiIiIIiIi + 22 + 6) << 32 ^ var12) & -1L << 32;
      float var9 = lilliiilli((float)(var6 - this.IillIlilillIli) / 190.0F);
      float var10 = IliiIilliiIi.IilliliilIIi(Math.max(1.0E-4F, var9));

      try {
         if (this.iIlIiIiIllIiIi == Iilliiillilliiil.iIIIilIiil) {
            this.lIilliIill(my, (int)(var12 >>> 32), mx, ctx, var6);
         } else if (this.Ililllililil()) {
            this.IIIillIIil(my, (int)(var12 >>> 32), mx, ctx);
         } else {
            this.IiiIlliiIl(my, (int)(var12 >>> 32), mx, ctx, var6);
         }
      } finally {
         IliiIilliiIi.lIiiIiIlilli(var10);
      }

   }

   private void iiIIlIIlIl() {
      this.lIIiiIiiIIiiIi = true;
      this.IiIIIliliIIIli.lIiiIiIlilli();
      (this.illliIiIilliIi ? this.iIiliIiIliliIi : this.iiiliIiIIIiiIi).IliIlllilIi();
   }
}
