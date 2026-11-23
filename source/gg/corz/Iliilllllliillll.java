package gg.corz;

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
import net.minecraft.class_1802;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_746;

public final class Iliilllllliillll {
   private final class_310 iililiIill = class_310.method_1551();
   private final IIiIIlilIiIIli IIiiliIill;
   private int liiiliIill;
   public static final double lililiIill = (double)2.0F;
   private class_243 lliiliIill;
   private final IllIllIllllIllIl IliiliIill = new IllIllIllllIllIl();
   public static final double illiliIill = 1.2;
   private int IiiiliIill;
   private iIIIllilIlIIllil lIiiliIill;
   public static final int IililiIill = 12;
   private final liliilIiiiliilIi iIiiliIill = new liliilIiiiliilIi();
   private int iliiliIill;

   public Iliilllllliillll(IIiIIlilIiIIli body) {
      this.IIiiliIill = body;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3164692115003837918L ^ Long.rotateLeft(4460626704353210000L, 52) ^ -7910592183394925040L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7551626397787944115L ^ Long.rotateLeft(5147076975217120255L, 34) ^ 443850472933692896L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1440531564240604064L ^ Long.rotateLeft(-8438423032241261467L, 9) ^ 4397385148226381273L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3758971983119821184L ^ Long.rotateLeft(1600370028381433024L, 40) ^ 3147413513416487200L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4473018156649039856L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3944735815108508920L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7871275501534948550L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7404112717897356349L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2038055269566486754L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3817580637897451016L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlllIlliIll<invokedynamic>());
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

   public illiiIilIiliiIil lIiiIiIlilli(long target, class_243 sprint, boolean tick) {
      class_746 var5 = this.iililiIill.field_1724;
      if (var5 != null && sprint != null) {
         if (this.lIiiliIill == null) {
            this.lIiiliIill = iIIIllilIlIIllil.IIIllIIliIIl((IilIllililIlli)null, (iilIiiIIiIii)null);
         }

         if (this.lliiliIill == null || this.lliiliIill.method_1025(sprint) > (double)4.0F) {
            this.lliiliIill = sprint;
            this.IliiliIill.IliIlllilIi();
            this.liiiliIill = 0;
         }

         class_243 var6 = var5.method_73189();
         double var7 = Math.hypot(sprint.field_1352 - var6.field_1352, sprint.field_1350 - var6.field_1350);
         if (var7 <= 1.2 && Math.abs(sprint.field_1351 - var6.field_1351) <= (double)1.5F) {
            return illiiIilIiliiIil.iliililIil;
         } else {
            boolean var9 = var5.method_6079().method_31574(class_1802.field_8288) || var5.method_6047().method_31574(class_1802.field_8288);
            this.lIiiliIill.IiIlliIliiIl(new lIlIilIiiIlIilIi(Math.max(1.0F, var5.method_6032() + var5.method_6067()), var9, liliilIiiiliilIi.IiIlliIliiIl(var5), -1, var5.method_5753(), var5.method_7344().method_7586(), var5.method_6115(), 0, 2));
            iIllIlllIlllIlll var10 = iIllIlllIlllIlll.IliIlllilIi(sprint);
            boolean var15 = false;
            boolean var16 = tick;
            double var11;
            double var13;
            if (this.lIiiliIill.Iilllilliill(target, var6, var10)) {
               var11 = sprint.field_1352 - var6.field_1352;
               var13 = sprint.field_1350 - var6.field_1350;
            } else {
               illiIiIlIiliIiIl var17 = this.lIiiliIill.Ililllililil(target, var6, var5.method_18798(), var5.method_24828(), var5.field_5976, var5.method_5799(), var10);
               if (var17 == null) {
                  return illiiIilIiliiIil.IiiililIil;
               }

               if (var17.iliIiiliiiii() && this.lIiiliIill.IliIlllilIi() != iiilllIIIill.llilllIiililllIi) {
                  return var7 <= 2.4 ? illiiIilIiliiIil.iliililIil : illiiIilIiliiIil.IiiililIil;
               }

               if (!var17.IliIlllilIi()) {
                  if (this.lIiiliIill.IliIlllilIi() == iiilllIIIill.IiilllIiliilllIi && ++this.liiiliIill > 60) {
                     return illiiIilIiliiIil.IiiililIil;
                  }

                  return illiiIilIiliiIil.lliililIil;
               }

               var11 = var17.liiiIIllIl();
               var13 = var17.iIlIlllllill();
               var15 = var17.IilliliilIIi();
               var16 = tick || var17.lIiiIiIlilli();
            }

            iiiIilllIIIlilll var19 = this.IliiliIill.liiiIIllIl(true, var6.field_1352, var6.field_1350, var7, var5.field_5976, var5.method_24828());
            switch (var19) {
               case IlillIlill:
                  var15 = true;
                  break;
               case llillIlill:
                  int[] var20 = this.lIiiliIill.iIiIlIliIl();
                  if (var20 != null) {
                     this.lIiiliIill.illIlIilIl(var20[0], var20[1], var20[2], target);
                  }
                  break;
               case ilillIlill:
                  this.IiiiliIill = this.iIlIlllllill(var5, var6);
                  this.iliiliIill = this.IiiiliIill == 0 ? 0 : 12;
                  if (this.IiiiliIill == 0) {
                     int[] var18 = this.lIiiliIill.iIiIlIliIl();
                     if (var18 != null) {
                        this.lIiiliIill.illIlIilIl(var18[0], var18[1], var18[2], target);
                     }
                  }
                  break;
               case IiillIlill:
                  this.lIiiliIill.lilIliilIl(target);
                  return illiiIilIiliiIil.IiiililIil;
            }

            if (this.iliiliIill > 0) {
               --this.iliiliIill;
               if (this.liiiIIllIl(var5, var6, this.IiiiliIill == 4 ? 1 : -1)) {
                  this.IIiiliIill.IilliliilIIi(this.IiiiliIill | 32);
                  this.IIiiliIill.Iilililiiili(var11, var13, false, false);
                  return illiiIilIiliiIil.lliililIil;
               }

               this.iliiliIill = 0;
            }

            if (var5.method_5799()) {
               var15 = true;
            }

            this.IIiiliIill.Iilililiiili(var11, var13, var16, var15);
            return illiiIilIiliiIil.lliililIil;
         }
      } else {
         return illiiIilIiliiIil.IiiililIil;
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) << 1 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) >>> 15) ^ 16626) << 2 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) << 1 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) >>> 15) ^ 16626) >>> 14)) << 7 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) << 1 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) >>> 15) ^ 16626) << 2 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) << 1 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5)) ^ var5) ^ var5) ^ var5) >>> 13))))) >>> 15) ^ 16626) >>> 14)) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) >>> 5 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ var5) << 11) - var5))) - '钎') - 13637) + var5) - var5) + var5) + var5) - 20006) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + '\udb9f') - '醘'))))) - var5) >>> 2 | (char)((char)(~((char)(~((char)((char)((char)((char)(-((char)(~var4[var5]))) + var5) + '\udb9f') - '醘'))))) - var5) << 14))) - 5561) ^ var5) ^ '쵒') + '킵'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IilliliilIIi() {
      return this.lIiiliIill == null ? iliIiiliiiii<invokedynamic>() : this.lIiiliIill.IliIlllilIi().name();
   }

   private boolean liiiIIllIl(class_746 p, class_243 pos, int side) {
      double var4 = Math.toRadians((double)p.method_36454());
      double var6 = Math.cos(var4) * (double)side;
      double var8 = Math.sin(var4) * (double)side;
      class_243 var10 = new class_243(pos.field_1352 + var6 * Double.longBitsToDouble(4186730908178805963L ^ 8798416926606193867L), pos.field_1351, pos.field_1350 + var8 * Double.longBitsToDouble(2481789403289091275L ^ 7093475421716479179L));
      return iiliillIIiiill.lIiiIiIlilli(this.iIiiliIill, pos, var10, true, Double.longBitsToDouble(522013942019755439L ^ 5133699960447143343L), Math.min(this.lIiiliIill.lIiiIiIlilli(), 3));
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) << 7) + var5) - 8242) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) << 7) + var5) - 8242) << 6) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) << 7) + var5) - 8242) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) << 1 | (char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - var5) + var5) ^ var5))) + var5) >>> 15)) << 7) + var5) - 8242) << 6) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int iIlIlllllill(class_746 pos, class_243 p) {
      if (this.liiiIIllIl(pos, p, 1)) {
         return 4;
      } else {
         return this.liiiIIllIl(pos, p, -1) ? -(298921459 + 109) - 21 + 115 ^ -298921482 : 0;
      }
   }

   public void IliIlllilIi() {
      if (this.lIiiliIill != null) {
         this.lIiiliIill.IiiIlliiIl();
      }

      this.IliiliIill.IliIlllilIi();
      this.lliiliIill = null;
      this.iliiliIill = 0;
      this.IiiiliIill = 0;
      this.liiiliIill = 0;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 18541) >>> 13 | (char)(var4[var5] + 18541) << 3) ^ 699) ^ 28717)) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + 18541) >>> 13 | (char)(var4[var5] + 18541) << 3) ^ 699) ^ 28717)) + var5) << 4) + var5) ^ 289) ^ 18421) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
