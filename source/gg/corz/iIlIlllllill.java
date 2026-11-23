package gg.corz;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.TextAttribute;
import java.awt.geom.AffineTransform;
import java.awt.geom.Path2D;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class iIlIlllllill {
   final float IIIllIIliIIl;
   final int lIiiIiIlilli;
   private static FontRenderContext IilliliilIIi;
   private Font IlIlllIlilIl;
   final float iliIiiliiiii;

   private iliIiiliiiii IliIlllilIi(String var1) {
      long var5 = -3088078564621396676L;
      iliIiiliiiii var2 = gg.corz.IilliliilIIi.IlIillIiilIi(this.lIiiIiIlilli);
      if (var2 == null) {
         return null;
      } else {
         for(var5 ^= (0L ^ var5) & -1L << 32; (int)(var5 >>> 32) < var1.length(); var5 += 4294967296L) {
            var5 ^= ((long)gg.corz.iliIiiliiiii.IliIlllilIi(var1.charAt((int)(var5 >>> 32))) ^ var5) & -1L >>> 32;
            if ((int)var5 < 0 || var2.iiiliIIIii[(int)var5] < 0.0F) {
               return null;
            }
         }

         return var2;
      }
   }

   void lIiiIiIlilli(Graphics2D var1, Color var2, String var3, double var4, double var6, double var8) {
      long var29 = 8541001935893274348L;
      double var10 = Math.abs(var1.getTransform().getScaleY());
      if (var10 <= (double)0.0F) {
         var10 = (double)1.0F;
      }

      iliIiiliiiii var12 = this.IliIlllilIi(var3);
      double var13 = var12 != null ? var12.lIIiiiIIii * (double)this.iliIiiliiiii / (double)1000.0F : this.liiiIIllIl().createGlyphVector(iIlIlllllill(), iliIiiliiiii<invokedynamic>()).getVisualBounds().getHeight();
      double var15 = (double)Math.round((var6 + var13 * (double)0.5F) * var10) / var10;
      double var17 = Math.floor((var4 - this.IilliliilIIi(var3) * var8) * var10 + (double)0.5F) / var10;
      var1.setColor(var2);
      if (var12 == null) {
         var1.setFont(this.liiiIIllIl());
         var1.drawString(var3, (float)var17, (float)var15);
      } else {
         AffineTransform var19 = var1.getTransform();
         double var20 = (double)this.iliIiiliiiii / (double)1000.0F;
         double var22 = (double)(this.iliIiiliiiii * this.IIIllIIliIIl);
         double var24 = var17;

         for(var29 ^= (0L ^ var29) & -1L << 32; (int)(var29 >>> 32) < var3.length(); var29 += 4294967296L) {
            var29 ^= ((long)gg.corz.iliIiiliiiii.IliIlllilIi(var3.charAt((int)(var29 >>> 32))) ^ var29) & -1L >>> 32;
            Path2D.Float var28 = var12.Iiililiili[(int)var29];
            if (var28 != null) {
               var1.translate(var24, var15);
               var1.scale(var20, var20);
               var1.fill(var28);
               var1.setTransform(var19);
            }

            var24 += (double)var12.iiiliIIIii[(int)var29] * var20 + var22;
         }

      }
   }

   private Font liiiIIllIl() {
      if (this.IlIlllIlilIl == null) {
         Font var1 = gg.corz.IilliliilIIi.IIlilIliiIli(this.lIiiIiIlilli != 0, this.iliIiiliiiii);
         this.IlIlllIlilIl = this.IIIllIIliIIl == 0.0F ? var1 : var1.deriveFont(Map.of(TextAttribute.TRACKING, this.IIIllIIliIIl));
      }

      return this.IlIlllIlilIl;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) << 2 | (char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) >>> 14))) ^ '臧'))))) << 14 | (char)(~((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) << 2 | (char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) >>> 14))) ^ '臧'))))) >>> 2) - '봐') << 9 | (char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) << 2 | (char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) >>> 14))) ^ '臧'))))) << 14 | (char)(~((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) << 2 | (char)(-((char)((char)((char)(var4[var5] - var5) + var5) ^ var5))) >>> 14))) ^ '臧'))))) >>> 2) - '봐') >>> 7) + '냵') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꭒ') + var5) << 3 | (char)((char)(var4[var5] + 'ꭒ') + var5) >>> 13) << 9 | (char)((char)((char)(var4[var5] + 'ꭒ') + var5) << 3 | (char)((char)(var4[var5] + 'ꭒ') + var5) >>> 13) >>> 7) - var5) - var5))))) - var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   double IilliliilIIi(String var1) {
      long var6 = 5049396983731081712L;
      iliIiiliiiii var2 = this.IliIlllilIi(var1);
      if (var2 == null) {
         return this.liiiIIllIl().getStringBounds(var1, iIlIlllllill()).getWidth();
      } else {
         double var3 = (double)0.0F;

         for(long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < var1.length(); var8 += 4294967296L) {
            var3 += (double)var2.iiiliIIIii[gg.corz.iliIiiliiiii.IliIlllilIi(var1.charAt((int)(var8 >>> 32)))];
         }

         return var3 * (double)this.iliIiiliiiii / (double)1000.0F + (double)(this.iliIiiliiiii * this.IIIllIIliIIl * (float)Math.max(0, var1.length() - 1));
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) << 8 | (char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) >>> 8) ^ '\uf6f7') >>> 6 | (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) << 8 | (char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) >>> 8) ^ '\uf6f7') << 10) ^ var5) ^ var5) >>> 11 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) << 8 | (char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) >>> 8) ^ '\uf6f7') >>> 6 | (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) << 8 | (char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) >>> 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 7 | (char)(-((char)(var4[var5] - var5))) << 9) - var5) ^ var5))) ^ 16107))) << 8))) >>> 8) ^ '\uf6f7') << 10) ^ var5) ^ var5) << 5)) ^ 21983));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   iIlIlllllill(int var1, float var2, float var3) {
      this.lIiiIiIlilli = var1;
      this.iliIiiliiiii = var2;
      this.IIIllIIliIIl = var3;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -388958772546594080L ^ Long.rotateLeft(-3365639297904740562L, 4) ^ -7290635724024003016L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -841402689241543263L ^ Long.rotateLeft(8339445796137358746L, 59) ^ 7725941044821143419L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3422309901392403894L ^ Long.rotateLeft(9145193263162604972L, 51) ^ -6033679097041919888L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6116985763523490524L ^ Long.rotateLeft(7246134310580263176L, 14) ^ -5158003385780293964L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7078821596287762719L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1701904868480267206L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3351815571407986902L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6667352325428677775L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 652748169939008222L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4852410055637907183L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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

   private static FontRenderContext iIlIlllllill() {
      if (IilliliilIIi == null) {
         IilliliilIIi = new FontRenderContext((AffineTransform)null, true, true);
      }

      return IilliliilIIi;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 5348) << 4 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - 5348) >>> 12) + '뿅') + var5) ^ var5))) - var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) >>> 9) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) >>> 9) + var5) << 6) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) >>> 9) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 12737) ^ var5) << 5 | (char)((char)((char)(-var4[var5]) + 12737) ^ var5) >>> 11) - 31441) + 15391) + 'ꩵ') ^ '굶'))) >>> 9) + var5) << 6) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
