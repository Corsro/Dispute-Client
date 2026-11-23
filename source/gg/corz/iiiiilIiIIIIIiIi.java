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
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2960;
import net.minecraft.class_332;

public class iiiiilIiIIIIIiIi {
   private String IiiiIilIIi = "";
   private static final int IiilIilIIi = 7;
   private boolean liiiIilIIi = false;
   private boolean lIlIlilIIi;
   private static final int IIIiIilIIi = 3;
   private int IIiiIilIIi;
   private long iIlIlilIIi;
   private static final int lIIiIilIIi = 5;
   private String lliiIilIIi = IIiilIiiiIii<invokedynamic>();
   private static final int IlilIilIIi = 7;
   private static final int ilIiIilIIi = 4;
   private float iiIIlilIIi;
   private static final int llilIilIIi = 8;
   private static final boolean liliIilIIi;
   private static final int llIiIilIIi = 4;
   private final iliiIiIiIiiiIiIi IIIIlilIIi = new iliiIiIiIiiiIiIi();
   private static final float liIiIilIIi = 10.0F;
   private static final String lIliIilIIi = "clear";
   private boolean lIIIlilIIi = false;
   private float IIlIlilIIi;
   private static final int IlIiIilIIi = 12;
   private int lIiiIilIIi;
   private static final long iIliIilIIi = 300000000L;
   private static final int liilIilIIi = 7;
   private float liIIlilIIi;
   private static final int ililIilIIi = 12;
   private float IiIIlilIIi;
   private static final int iIIiIilIIi = 6;
   private boolean iliiIilIIi = true;
   private static final int illiIilIIi = 2;
   private static final int iiilIilIIi = 5;
   private static final int IiIiIilIIi = 2;
   private final liIliIliiIliIl llIIlilIIi;
   private final liIliIliiIliIl iIIIlilIIi;
   private static final float iiIiIilIIi = 0.8F;
   private static final int IiliIilIIi = 2;
   private int iIiiIilIIi;
   private int IliiIilIIi = 7;
   private static final float IIliIilIIi = 0.14F;
   private static final class_2960 llliIilIIi = class_2960.method_60655(IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>());
   private static final class_2960 IlliIilIIi = class_2960.method_60655(IIiilIiiiIii<invokedynamic>(), IIiilIiiiIii<invokedynamic>());
   private final iIliililIlliilil ilIIlilIIi;
   private final liIliIliiIliIl IlIIlilIIi;
   private boolean iiiiIilIIi = false;
   private int iiliIilIIi;

   private boolean IlIlllIlilIl(double my, double mx) {
      return this.lIlIlilIIi && !this.IiiiIilIIi.isEmpty() && System.nanoTime() - this.iIlIlilIIi < 300000000L && llilliilililliil.Iliilliiilii(my, mx, this.IiIIlilIIi, this.liIIlilIIi, this.iiIIlilIIi, this.IIlIlilIIi);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) << 8 | (char)((char)(~var4[var5]) ^ var5) >>> 8) ^ var5) - '꩝') + var5) - 645) + var5) + 'ﮤ') - 25141) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) << 8 | (char)((char)(~var4[var5]) ^ var5) >>> 8) ^ var5) - '꩝') + var5) - 645) + var5) + 'ﮤ') - 25141) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      liliIilIIi = System.getProperty(IIiilIiiiIii<invokedynamic>(), "").toLowerCase(Locale.ROOT).contains(IIiilIiiiIii<invokedynamic>());
   }

   private void IIIllIIliIIl(class_332 shown, int ctx, int boxX, int my, float mx) {
      long var15 = 2803151954176390962L;
      float var6 = (float)this.IIiiIilIIi + (float)(this.iIiiIilIIi - 12) / 2.0F;
      this.IiIIlilIIi = (float)(ctx - 2);
      this.liIIlilIIi = (float)this.IIiiIilIIi;
      this.iiIIlilIIi = (float)(this.iiliIilIIi + this.lIiiIilIIi) - this.IiIIlilIIi;
      this.IIlIlilIIi = (float)this.iIiiIilIIi;
      this.lIlIlilIIi = mx > 0.5F;
      var15 ^= ((long)(this.lIlIlilIIi && llilliilililliil.Iliilliiilii((double)boxX, (double)my, this.IiIIlilIIi, this.liIIlilIIi, this.iiIIlilIIi, this.IIlIlilIIi) ? 1 : 0) << 32 ^ var15) & -1L << 32;
      float var8 = this.ilIIlilIIi.IIIllIIliIIl(IIiilIiiiIii<invokedynamic>(), (boolean)((int)(var15 >>> 32)));
      if (!(mx <= 0.01F)) {
         float var9 = (float)ctx + 6.0F;
         float var10 = var6 + 6.0F;
         float var11 = (0.8F + 0.19999999F * llilliilililliil.liiiIIllIl(mx)) * this.ilIIlilIIi.IilliliilIIi(IIiilIiiiIii<invokedynamic>(), 0.14F);
         var15 ^= ((long)llilliilililliil.IlIlllIlilIl(shown, var9, var10, var11) ^ var15) & -1L >>> 32;
         float var13 = IliiIilliiIi.IilliliilIIi(mx);

         try {
            if (var8 > 0.01F) {
               IIIiiIillIIiiIil.IlIlllIlilIl(shown, (float)ctx, var6, 12.0F, 12.0F, 6.0F, llilliilililliil.IIIIllIIIl(-1, 0.08F * var8));
            }

            iiIlilIlIIllilIl.IliIlllilIi(var9 - 5.0F, var10 - 5.0F, 10.0F, 10.0F, lIlIIiliIlIIil.IIIIllIIIl(IIiilIiiiIii<invokedynamic>()), new Color(IilIIIIililIIIIi.Illlllllilll(-7630437, -920587, (double)var8), true), IIIiiIillIIiiIil.liiiIIllIl());
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var13);
            llilliilililliil.IiIlliIliiIl(shown, (boolean)((int)var15));
         }

      }
   }

   private static int Ililllililil(int alpha, int argb) {
      return (argb & 255) << 24 | alpha & 16777215;
   }

   public boolean IiIlliIliiIl(double button, double my, int mx) {
      long var7 = 7706440892732125086L;
      var7 ^= ((long)(button >= (double)this.iiliIilIIi && button <= (double)(this.iiliIilIIi + this.lIiiIilIIi) && my >= (double)this.IIiiIilIIi && my <= (double)(this.IIiiIilIIi + this.iIiiIilIIi) ? 1 : 0) << 32 ^ var7) & -1L << 32;
      if ((int)(var7 >>> 32) != 0 && mx == 0 && this.IlIlllIlilIl(button, my)) {
         this.IiiiIilIIi = "";
         this.lIIIlilIIi = false;
         this.liiiIilIIi = true;
         this.IIIIlilIIi.IliIlllilIi();
         this.ilIIlilIIi.liiiIIllIl(IIiilIiiiIii<invokedynamic>());
         return true;
      } else {
         this.liiiIilIIi = (boolean)((int)(var7 >>> 32));
         this.lIIIlilIIi = false;
         if (this.liiiIilIIi) {
            this.IIIIlilIIi.IliIlllilIi();
         }

         return (boolean)((int)(var7 >>> 32));
      }
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) + '荌') >>> 13 | (char)((char)(-var4[var5]) + '荌') << 3) + 28903) - 28663))) ^ 26104) - 29484) + var5) ^ var5) ^ 2992) - '蜰'))) + var5) ^ 24693) ^ var5) + var5) << 9 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) + '荌') >>> 13 | (char)((char)(-var4[var5]) + '荌') << 3) + 28903) - 28663))) ^ 26104) - 29484) + var5) ^ var5) ^ 2992) - '蜰'))) + var5) ^ 24693) ^ var5) + var5) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(int radius) {
      this.IliiIilIIi = radius;
   }

   public iiiiilIiIIIIIiIi(int y, int height, int x, int width) {
      this.iIIIlilIIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 200);
      this.IlIIlilIIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 180, (double)1.0F);
      this.llIIlilIIi = new liIliIliiIliIl(llIIIliilIIIli.iiillliiiIIIilliii, 150, (double)1.0F);
      this.ilIIlilIIi = new iIliililIlliilil();
      this.iiliIilIIi = y;
      this.IIiiIilIIi = height;
      this.lIiiIilIIi = x;
      this.iIiiIilIIi = width;
   }

   private static void Iilllilliill(liIliIliiIliIl a, double target) {
      if (Math.abs(a.IiIlliIliiIl() - target) > 0.001) {
         a.lIiiIiIlilli(target);
      }

   }

   public boolean Illlllllilll(char modifiers, int chr) {
      if (!this.liiiIilIIi) {
         return false;
      } else if (modifiers >= ' ' && modifiers != 127) {
         this.IiiiIilIIi = lIiIililiIiIilil.liiiIIllIl(this.IiiiIilIIi, this.lIIIlilIIi, modifiers);
         this.lIIIlilIIi = false;
         this.IIIIlilIIi.IliIlllilIi();
         return true;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) ^ 18675) << 7 | (char)((char)(var4[var5] - var5) ^ 18675) >>> 9))))))) ^ 13046))) + var5) ^ '줙'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String IIIilIIiiIIi(String avail, float s) {
      IIliiIlllIliiIll var2 = CorzClient.fontRenderer();
      if (s <= 0.0F) {
         return "";
      } else if (var2.iIlIlllllill(avail) <= s) {
         return avail;
      } else {
         String var3;
         for(var3 = avail; var3.length() > 1 && var2.iIlIlllllill(var3) > s; var3 = var3.substring(1)) {
         }

         return var3;
      }
   }

   public void iIlIlllllill(boolean shortcut) {
      this.iliiIilIIi = shortcut;
   }

   public boolean IIlilIliiIli() {
      return this.liiiIilIIi;
   }

   public void IiIiliIiiiIi(String text) {
      this.IiiiIilIIi = text;
      this.lIIIlilIIi = false;
   }

   private static double IIillIiliIil(double v) {
      return v < (double)0.0F ? (double)0.0F : (v > (double)1.0F ? (double)1.0F : v);
   }

   public void IliIlllilIi(int height, int x, int y, int width) {
      this.iiliIilIIi = height;
      this.IIiiIilIIi = x;
      this.lIiiIilIIi = y;
      this.iIiiIilIIi = width;
   }

   public void liiiIIllIl(String placeholder) {
      this.lliiIilIIi = placeholder == null ? "" : placeholder;
   }

   public boolean Illillliilli(double mx, double my) {
      return mx >= (double)this.iiliIilIIi && mx <= (double)(this.iiliIilIIi + this.lIiiIilIIi) && my >= (double)this.IIiiIilIIi && my <= (double)(this.IIiiIilIIi + this.iIiiIilIIi);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 9022813952441100677L ^ Long.rotateLeft(-1277448850560766357L, 58) ^ 4822787453989423177L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1584730878105925724L ^ Long.rotateLeft(-7029736331646345480L, 14) ^ 7754783703642287121L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -692565045848863624L ^ Long.rotateLeft(-6968807193196068813L, 38) ^ -6637533003515367845L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6315646296534464047L ^ Long.rotateLeft(-1770524512900065132L, 29) ^ -4983154804681057998L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2120198200441181549L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 262145138978140425L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1345960307224345190L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6375669199470418720L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7856071938543208001L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1110167574184365901L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iliilliiilii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiiiliiiiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIIllIIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iIIIlIlIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIIlilIIl<invokedynamic>());
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

   public boolean IIlllIlliIll(int keyCode, int scanCode, int modifiers) {
      long var7 = 8375492125733531323L;
      if (!this.iliiIilIIi || keyCode != 75 || (!liliIilIIi || (modifiers & 8) == 0) && (liliIilIIi || (modifiers & 2) == 0)) {
         if (!this.liiiIilIIi) {
            return false;
         } else if (lIiIililiIiIilil.IliIlllilIi(liliIilIIi, keyCode, modifiers)) {
            this.lIIIlilIIi = !this.IiiiIilIIi.isEmpty();
            return true;
         } else if (keyCode != 259 && keyCode != 261) {
            if (keyCode == 256) {
               this.lIIIlilIIi = false;
               this.liiiIilIIi = false;
               return true;
            } else if (keyCode != 263 && keyCode != 262 && keyCode != 268 && keyCode != 269) {
               return false;
            } else {
               this.lIIIlilIIi = false;
               return true;
            }
         } else {
            var7 ^= ((long)(keyCode == 261 ? 1 : 0) << 32 ^ var7) & -1L << 32;
            String var5 = lIiIililiIiIilil.iIlIlllllill(this.IiiiIilIIi, this.lIIIlilIIi, (boolean)((int)(var7 >>> 32)));
            var7 ^= ((long)(var5.equals(this.IiiiIilIIi) && !this.lIIIlilIIi ? 0 : 1) ^ var7) & -1L >>> 32;
            this.IiiiIilIIi = var5;
            this.lIIIlilIIi = false;
            this.IIIIlilIIi.IliIlllilIi();
            if ((int)var7 != 0) {
               return true;
            } else {
               return (int)(var7 >>> 32) == 0;
            }
         }
      } else {
         this.liiiIilIIi = true;
         this.IIIIlilIIi.IliIlllilIi();
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)var4[var5])) ^ 3881) >>> 15 | (char)((char)(~((char)var4[var5])) ^ 3881) << 1))) - var5) ^ 1636) + '\ueba6') ^ var5) + var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)var4[var5])) ^ 3881) >>> 15 | (char)((char)(~((char)var4[var5])) ^ 3881) << 1))) - var5) ^ 1636) + '\ueba6') ^ var5) + var5) - var5) << 15) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IlIillIiilIi() {
      return this.IiiiIilIIi;
   }

   public void lIiiIiIlilli() {
      this.Iilililiiili(false);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 27670) ^ var5) + var5) + 13992))) >>> 8 | (char)(-((char)((char)((char)((char)(var4[var5] - 27670) ^ var5) + var5) + 13992))) << 8) + var5))))))) >>> 14 | (char)(~((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 27670) ^ var5) + var5) + 13992))) >>> 8 | (char)(-((char)((char)((char)((char)(var4[var5] - 27670) ^ var5) + var5) + 13992))) << 8) + var5))))))) << 2) - 'ꈀ') ^ 10607))) ^ 27718))) ^ 18436) + '쐱'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String Iiilliiliiil(String avail, float s) {
      IIliiIlllIliiIll var2 = CorzClient.fontRenderer();
      if (s <= 0.0F) {
         return "";
      } else if (var2.iIlIlllllill(avail) <= s) {
         return avail;
      } else {
         String var3;
         for(var3 = avail; var3.length() > 1 && var2.iIlIlllllill(var3) > s; var3 = var3.substring(0, var3.length() - 1)) {
         }

         return var3;
      }
   }

   public void Iilililiiili(boolean focused) {
      this.liiiIilIIi = focused;
      if (!focused) {
         this.lIIIlilIIi = false;
      }

   }

   public void iliIiiliiiii(class_332 my, int ctx, int delta, float mx) {
      long var49 = 3578593435244450431L;
      long var35 = -218581430877195088L;
      long var51 = 3870305821417583449L;
      long var37 = 3204630249066341117L;
      long var53 = -157440829697061150L;
      long var39 = -8220709819333494485L;
      long var41 = -5947964838590363127L;
      long var43 = -449211760659406708L;
      long var45 = 4012810000121564889L;
      long var47 = 1291937918358312133L;
      this.iIlIlilIIi = System.nanoTime();
      this.iiiiIilIIi = ctx >= this.iiliIilIIi && ctx <= this.iiliIilIIi + this.lIiiIilIIi && delta >= this.IIiiIilIIi && delta <= this.IIiiIilIIi + this.iIiiIilIIi;
      Iilllilliill(this.iIIIlilIIi, !this.liiiIilIIi && !this.iiiiIilIIi ? (double)0.0F : (double)1.0F);
      Iilllilliill(this.IlIIlilIIi, this.IiiiIilIIi.isEmpty() ? (double)1.0F : (double)0.0F);
      Iilllilliill(this.llIIlilIIi, this.liiiIilIIi ? (double)0.0F : (double)1.0F);
      double var5 = IIillIiliIil(this.iIIIlilIIi.iIlIlllllill());
      double var7 = (double)1.0F - IIillIiliIil(this.IlIIlilIIi.iIlIlllllill());
      double var9 = IIillIiliIil((double)1.0F - var7 / 0.6);
      float var11 = (float)IIillIiliIil((var7 - 0.4) / 0.6);
      double var12 = IIillIiliIil(this.llIIlilIIi.iIlIlllllill());
      IIliiIlllIliiIll var14 = CorzClient.fontRenderer();
      var35 ^= ((long)IilIIIIililIIIIi.Illlllllilll(Ililllililil(16777215, 18), Ililllililil(IlIIilIlllIIilIl.lliiIlliIl, 255), var5) << 32 ^ var35) & -1L << 32;
      IIIiiIillIIiiIil.IIillIiliIil(my, this.iiliIilIIi, this.IIiiIilIIi, this.lIiiIilIIi, this.iIiiIilIIi, this.IliiIilIIi, IilIIIIililIIIIi.IlIlllIlilIl(), (int)(var35 >>> 32));
      var35 ^= ((long)(this.IIiiIilIIi + (this.iIiiIilIIi - 12) / 2) ^ var35) & -1L >>> 32;
      var37 ^= ((long)IilIIIIililIIIIi.Illlllllilll(-8421505, -1, var5) << 32 ^ var37) & -1L << 32;
      iiIlilIlIIllilIl.IliIlllilIi((float)(this.iiliIilIIi + 8), (float)((int)var35), 12.0F, 12.0F, IlliIilIIi, new Color((int)(var37 >>> 32), true), IIIiiIillIIiiIil.liiiIIllIl());
      var37 ^= ((long)(this.iiliIilIIi + this.lIiiIilIIi - 7) ^ var37) & -1L >>> 32;
      if (this.iliiIilIIi) {
         long var59 = var39 ^ ((long)((int)var14.IilliliilIIi()) << 32 ^ var39) & -1L << 32;
         var39 = var59 ^ ((long)((int)var14.iIlIlllllill(IIiilIiiiIii<invokedynamic>())) ^ var59) & -1L >>> 32;
         long var62 = var41 ^ ((long)lliliIllililiIll.IliIlllilIi((int)(var39 >>> 32)) << 32 ^ var41) & -1L << 32;
         var41 = var62 ^ ((long)lliliIllililiIll.liiiIIllIl((int)(var62 >>> 32)) ^ var62) & -1L >>> 32;
         long var64 = var43 ^ ((long)((int)var41 + 2 + (int)var39 + 10) << 32 ^ var43) & -1L << 32;
         var43 = var64 ^ ((long)(this.iIiiIilIIi - 6) ^ var64) & -1L >>> 32;
         var45 ^= ((long)(this.iiliIilIIi + this.lIiiIilIIi - 7 - (int)(var43 >>> 32)) << 32 ^ var45) & -1L << 32;
         var45 ^= ((long)(this.IIiiIilIIi + (this.iIiiIilIIi - (int)var43) / 2) ^ var45) & -1L >>> 32;
         if (var9 > 0.01) {
            var47 ^= ((long)Ililllililil(-15461350, (int)((double)255.0F * var9)) << 32 ^ var47) & -1L << 32;
            var47 ^= ((long)Ililllililil(-1, (int)((double)24.0F * var9)) ^ var47) & -1L >>> 32;
            IIIiiIillIIiiIil.IIillIiliIil(my, (int)(var45 >>> 32), (int)var45, (int)(var43 >>> 32), (int)var43, 5, (int)(var47 >>> 32), (int)var47);
            var49 ^= ((long)Ililllililil(-7630437, (int)((double)255.0F * var9)) << 32 ^ var49) & -1L << 32;
            var49 ^= ((long)var14.IlIillIiilIi((int)var45, (int)var43) ^ var49) & -1L >>> 32;
            float var31 = (float)((int)var49) + (float)((int)(var39 >>> 32)) / 2.0F;
            var51 ^= ((long)((int)(var45 >>> 32) + 5) << 32 ^ var51) & -1L << 32;
            var51 ^= ((long)Math.round((float)((int)(var51 >>> 32)) - 0.203125F * (float)((int)(var41 >>> 32))) ^ var51) & -1L >>> 32;
            var53 ^= ((long)(Math.round(var31 - 0.453125F * (float)((int)(var41 >>> 32))) + 2) << 32 ^ var53) & -1L << 32;
            iiIlilIlIIllilIl.IliIlllilIi((float)((int)var51), (float)((int)(var53 >>> 32)), (float)((int)(var41 >>> 32)), (float)((int)(var41 >>> 32)), llliIilIIi, new Color((int)(var49 >>> 32), true), IIIiiIillIIiiIil.liiiIIllIl());
            var14.liiiIIllIl(IIiilIiiiIii<invokedynamic>(), (float)((int)(var51 >>> 32) + (int)var41 + 2), (float)((int)var49), new Color((int)(var49 >>> 32), true));
         }

         var37 ^= ((long)((int)(var45 >>> 32) - 6) ^ var37) & -1L >>> 32;
      }

      var39 ^= ((long)(this.iiliIilIIi + this.lIiiIilIIi - 4 - 12) << 32 ^ var39) & -1L << 32;
      this.IIIllIIliIIl(my, (int)(var39 >>> 32), ctx, delta, var11);
      var39 ^= ((long)(this.iiliIilIIi + 8 + 12 + 7) ^ var39) & -1L >>> 32;
      var41 ^= ((long)var14.IlIillIiilIi(this.IIiiIilIIi, this.iIiiIilIIi) << 32 ^ var41) & -1L << 32;
      float var22 = (float)((this.IiiiIilIIi.isEmpty() ? (int)var37 : (int)(var39 >>> 32) - 4) - (int)var39);
      if (this.IiiiIilIIi.isEmpty()) {
         if (var12 > 0.01) {
            var43 ^= ((long)Ililllililil(-8421505, (int)Math.round((double)255.0F * var12)) << 32 ^ var43) & -1L << 32;
            var14.IliIlllilIi(Iiilliiliiil(this.lliiIilIIi, var22), (float)((int)var39), (float)((int)(var41 >>> 32)), new Color((int)(var43 >>> 32), true));
         }
      } else {
         String var23 = IIIilIIiiIIi(this.IiiiIilIIi, var22);
         if (this.liiiIilIIi && this.lIIIlilIIi) {
            var43 ^= ((long)((int)var14.iIlIlllllill(var23)) ^ var43) & -1L >>> 32;
            var45 ^= ((long)((int)var14.IilliliilIIi() + 2) << 32 ^ var45) & -1L << 32;
            IIIiiIillIIiiIil.lIiiIiIlilli(my, (int)var39 - 1, this.IIiiIilIIi + (this.iIiiIilIIi - (int)(var45 >>> 32)) / 2, (int)var43 + 2, (int)(var45 >>> 32), 2, IilIIIIililIIIIi.IIlllIlliIll(0.32));
         }

         var14.IliIlllilIi(var23, (float)((int)var39), (float)((int)(var41 >>> 32)), new Color(-1));
         if (this.liiiIilIIi && !this.lIIIlilIIi) {
            float var24 = (float)((int)var39) + var14.iIlIlllllill(var23) + 1.0F;
            var45 ^= ((long)((int)var14.IilliliilIIi() - 2) << 32 ^ var45) & -1L << 32;
            this.IIIIlilIIi.iIlIlllllill(my, var24, this.IIiiIilIIi + (this.iIiiIilIIi - (int)(var45 >>> 32)) / 2, (int)(var45 >>> 32), IlIIilIlllIIilIl.lliiIlliIl, llIilillilIilill.liiiIIllIl());
         }
      }

      if (this.liiiIilIIi && this.IiiiIilIIi.isEmpty()) {
         var43 ^= ((long)((int)var14.IilliliilIIi() - 2) << 32 ^ var43) & -1L << 32;
         this.IIIIlilIIi.iIlIlllllill(my, (float)((int)var39), this.IIiiIilIIi + (this.iIiiIilIIi - (int)(var43 >>> 32)) / 2, (int)(var43 >>> 32), IlIIilIlllIIilIl.lliiIlliIl, llIilillilIilill.liiiIIllIl());
      }

   }
}
