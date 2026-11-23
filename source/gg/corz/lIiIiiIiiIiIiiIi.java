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
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class lIiIiiIiiIiIiiIi {
   private static final long IlliiiiIIi = 1800000000L;
   private static final float lIliiiiIIi = ((float)Math.PI * 2F);
   private long liiiiiiIIi;
   private static final long iIliiiiIIi = 220000000L;
   private liIIiilliiIIiill ilIIIIIlIi;
   private final llliiiiilliiii iliiiiiIIi = new llliiiiilliiii();
   private static final String IIIiiiiIIi = "Next RTP";
   private static final float ilIiiiiIIi = 10.0F;
   private float IIlIIIIlIi;
   private final llliiiiilliiii iIiiiiiIIi = new llliiiiilliiii();
   private static final int iIIiiiiIIi = iilIllIiIIiIllIi.IlIlllIlilIl(0, (~(-4280129 ^ 31) - 57) * 45 ^ 192604593);
   private final llliiiiilliiii IliiiiiIIi = new llliiiiilliiii();
   private static final float llIiiiiIIi = 230.0F;
   private static final String lIIiiiiIIi = "...";
   private final iiIiIliIIliIli lIiiiiiIIi = new iiIiIliIIliIli();
   private static final float IIliiiiIIi = 0.22F;
   private static final String IiiliiiIIi = "Anchor Hunter";
   private boolean lIIIIIIlIi = true;
   private int llIIIIIlIi;
   private final llliiiiilliiii lliiiiiIIi = new llliiiiilliiii();
   private static final float IiIiiiiIIi = 4.0F;
   private static final float liIiiiiIIi = 6.0F;
   private final iiIIlIIiIIlIlIIi iiliiiiIIi = new iiIIlIIiIIlIlIIi();
   private final iiIiIliIIliIli IIiiiiiIIi = new iiIiIliIIliIli();
   private long IIIIIIIlIi;
   private static final String liiliiiIIi = "Anchors";
   private String IiIIIIIlIi = "";
   private static final String iiiliiiIIi = "Per hour";
   private final llliiiiilliiii IiiiiiiIIi = new llliiiiilliiii();
   private static final float IlIiiiiIIi = 160.0F;
   private static final float iiIiiiiIIi = 2.5F;
   private IIliiIlllIliiIll liIIIIIlIi;
   private final class_4587 IiliiiiIIi = new class_4587();
   private static final Color llliiiiIIi = new Color(935502960 * 59 * -17 ^ 2004940157, true);
   private boolean iIIIIIIlIi;
   private final iiIIlillIIlIlill liliiiiIIi = new iiIIlillIIlIlill();
   private long iiiiiiiIIi;
   private int IlIIIIIlIi;
   public static final String ililiiiIIi = "anchorhunter";
   private static class_2960 illiiiiIIi;
   private float lIlIIIIlIi;
   private float iIlIIIIlIi;
   private float iiIIIIIlIi;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + var5) ^ var5))) - var5) - 245) + var5) - '葒') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int IlIlllIlilIl(long now) {
      int var10000;
      if (this.ilIIIIIlIi == null) {
         var10000 = llliIlIlilliIlIl.Illlllllilll();
      } else {
         switch (this.ilIIIIIlIi) {
            case IIlIiliill -> var10000 = -8393375;
            case lIlIiliill -> var10000 = -1535700;
            case iIlIiliill -> var10000 = -1750963;
            default -> var10000 = llliIlIlilliIlIl.Illlllllilll();
         }
      }

      int var3 = var10000;
      float var4 = this.IIIIIIIlIi == 0L ? 1.0F : llliIlIlilliIlIl.liiiIIllIl((float)(now - this.IIIIIIIlIi) / 2.2E8F);
      if (var4 >= 1.0F) {
         this.IIIIIIIlIi = 0L;
      }

      this.llIIIIIlIi = var4 >= 1.0F ? var3 : IilIIIIililIIIIi.Illlllllilll(this.IlIIIIIlIi, var3, (double)llliIlIlilliIlIl.iIlIlllllill(var4));
      return this.llIIIIIlIi;
   }

   private void iIlIlllllill(IlillIIillillIIi anchors, int warn, int nextRtp, String perHour, String now, long s) {
      boolean var8 = !this.lIIIIIIlIi;
      String var9 = anchors.iIlIlllllill();
      this.IiIIIIIlIi = var9 == null ? "" : var9;
      String var10 = now == null ? "" : now;
      if (this.iIiiiiiIIi.IliIlllilIi((long)var10.hashCode())) {
         this.iIiiiiiIIi.liiiIIllIl(var10, 0.8F, true, false);
         boolean var11 = !var10.isEmpty();
         if (var11 && !this.iIIIIIIlIi) {
            this.iiliiiiIIi.IliIlllilIi();
         }

         this.iIIIIIIlIi = var11;
      }

      if (anchors.liiiIIllIl() != this.ilIIIIIlIi) {
         boolean var12 = this.ilIIIIIlIi == null || this.lIIIIIIlIi;
         this.IlIIIIIlIi = this.llIIIIIlIi;
         this.ilIIIIIlIi = anchors.liiiIIllIl();
         this.IIIIIIIlIi = var12 ? 0L : s;
      }

      if (this.lliiiiiIIi.IliIlllilIi((long)warn)) {
         this.lliiiiiIIi.liiiIIllIl(String.valueOf(Math.max(0, warn)), 0.9F, true, var8);
      }

      if (this.iliiiiiIIi.IliIlllilIi((long)nextRtp)) {
         this.iliiiiiIIi.liiiIIllIl(String.valueOf(Math.max(0, nextRtp)), 0.9F, true, var8);
      }

      String var13 = perHour == null ? Iilllilliill<invokedynamic>() : perHour;
      if (this.IiiiiiiIIi.IliIlllilIi((long)var13.hashCode())) {
         this.IiiiiiiIIi.liiiIIllIl(var13, 0.9F, true, var8);
      }

   }

   private static String[] lIiiIiIlilli() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(iIIiIlIlIiIl.class);
      ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(iiIlIIIiIIllIIIi.class);
      boolean var2 = var0 != null && var0.IliIlllilIi();
      boolean var3 = var1 != null && var1.IliIlllilIi();
      if (var2 && var3) {
         return new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()};
      } else if (var2) {
         return new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()};
      } else {
         return var3 ? new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()} : new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()};
      }
   }

   public void liiiIIllIl(class_332 nextRtp, IlillIIillillIIi perHour, int s, int anchors, String ctx, String warn) {
      class_310 var7 = class_310.method_1551();
      if (nextRtp != null && var7.field_1724 != null && perHour != null) {
         CorzClient.fontManager.iIlIlllllill(this.IiliiiiIIi);
         IIIiiIillIIiiIil.IliIlllilIi(this.IiliiiiIIi);
         double var8 = (double)var7.method_22683().method_4495();
         int var10 = var7.method_22683().method_4476(IIililillIililil.iiiIlIIIll(var7), var7.method_1573());
         float var11 = (float)((double)var10 / var8);
         boolean var12 = Math.abs(var11 - 1.0F) > 1.0E-4F;
         int var13 = var12 ? Math.round((float)var7.method_22683().method_4486() / var11) : var7.method_22683().method_4486();
         if (var12) {
            IliiIilliiIi.lIIlllIIliIIlllIIl = (float)var13;
            IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)var7.method_22683().method_4502() / var11);
         }

         try {
            float var14 = IIililillIililil.ilIllIiIll();
            if (!(var14 < 0.004F)) {
               long var15 = System.nanoTime();
               float var17 = this.iiiiiiiIIi == 0L ? 0.016F : Math.min(0.05F, (float)(var15 - this.iiiiiiiIIi) / 1.0E9F);
               this.iiiiiiiIIi = var15;
               this.iIlIlllllill(perHour, s, anchors, ctx, warn, var15);
               if (!this.liliiiiIIi.IilliliilIIi(true, ++this.liiiiiiIIi)) {
                  return;
               }

               float var18 = IliiIilliiIi.IilliliilIIi(var14);

               try {
                  this.IilliliilIIi(nextRtp, var13, var17, var15);
               } finally {
                  IliiIilliiIi.lIiiIiIlilli(var18);
               }

               this.lIIIIIIlIi = false;
               return;
            }
         } finally {
            if (var12) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
               IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
            }

         }

      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 9065326173778116335L ^ Long.rotateLeft(7360519782488867955L, 3) ^ -9019186297518041414L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5900535064683974104L ^ Long.rotateLeft(1869034722721604882L, 52) ^ 2715361388677360704L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6329574085972822972L ^ Long.rotateLeft(4720214601075824194L, 62) ^ 6515636122404234010L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4492945119725645070L ^ Long.rotateLeft(-1637359334441617186L, 34) ^ -3124890202498113068L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -157426644525515959L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6829777860233738631L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2242661715089179506L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1881034041549633989L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7266351633515785628L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2338658824699954331L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   private static String Illlllllilll(String avail, float s) {
      if (avail != null && !avail.isEmpty()) {
         if (llliIlIlilliIlIl.lIliliIlil(avail, 0.9F) <= s) {
            return avail;
         } else {
            int var2 = 0;
            int var3 = avail.length();

            while(var2 < var3) {
               int var4 = var2 + var3 + 1 >>> 1;
               if (llliIlIlilliIlIl.lIliliIlil(avail.substring(0, var4) + Iilllilliill<invokedynamic>(), 0.9F) <= s) {
                  var2 = var4;
               } else {
                  var3 = var4 - 1;
               }
            }

            return avail.substring(0, var2).stripTrailing() + Iilllilliill<invokedynamic>();
         }
      } else {
         return "";
      }
   }

   public void IliIlllilIi() {
      this.liiiiiiIIi += 2L;
      this.lIIIIIIlIi = true;
      this.iiiiiiiIIi = 0L;
      this.IIIIIIIlIi = 0L;
      this.iIIIIIIlIi = false;
      this.ilIIIIIlIi = null;
      this.IIiiiiiIIi.iIlIlllllill();
      this.lIiiiiiIIi.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) << 1) - 17643))) ^ var5) + var5) - var5))) << 10 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) << 1) - 17643))) ^ var5) + var5) - var5))) >>> 6))) - var5))) + 9258) ^ var5) ^ var5) << 13 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) << 1) - 17643))) ^ var5) + var5) - var5))) << 10 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) >>> 15 | (char)((char)((char)(-((char)(var4[var5] ^ 28292))) ^ 32020) + var5) << 1) - 17643))) ^ var5) + var5) - var5))) >>> 6))) - var5))) + 9258) ^ var5) ^ var5) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIIllIIliIIl(float y, float x, int now, long argb) {
      float var6 = llliIlIlilliIlIl.IIIllIIliIIl(y);
      float var7 = llliIlIlilliIlIl.IIIllIIliIIl(x);
      float var8 = 0.5F + 0.5F * (float)Math.cos((double)((float)(argb % 1800000000L) * 3.4906587E-9F));
      llliIlIlilliIlIl.Ililllililil(var6, var7, 4.0F, 4.0F, 2.0F, llliIlIlilliIlIl.iliIiiliiiii(now, 0.22F * (0.35F + 0.65F * var8)), 2.5F, true);
      llliIlIlilliIlIl.IIillIiliIil(var6, var7, 4.0F, 4.0F, 2.0F, 0.0F, now);
   }

   private void IilliliilIIi(class_332 sw, int now, float ctx, long dt) {
      IIliiIlllIliiIll var6 = llliIlIlilliIlIl.IliIlllilIi();
      if (var6 != this.liIIIIIlIi) {
         this.liIIIIIlIi = var6;
         this.iiIIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.95F);
         this.IIlIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.78F);
         this.lIlIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.78F);
         this.iIlIIIIlIi = llliIlIlilliIlIl.lIliliIlil(Iilllilliill<invokedynamic>(), 0.78F);
      }

      if (this.IliiiiiIIi.IliIlllilIi((long)this.IiIIIIIlIi.hashCode() * 31L + (long)System.identityHashCode(var6))) {
         float var7 = 206.0F;
         this.IliiiiiIIi.liiiIIllIl(Illlllllilll(IiiIliiliiIlii.liiiIIllIl(this.IiIIIIIlIi), var7), 0.9F, false, !this.lIIIIIIlIi);
      }

      float var32 = 7.0F;
      float var8 = 4.0F;
      float var9 = 15.0F;
      float var10 = var32 + this.IIlIIIIlIi + var8 + this.lliiiiiIIi.iliillIlIl + 10.0F + this.lIlIIIIlIi + var8 + this.iliiiiiIIi.iliillIlIl + 10.0F + this.iIlIIIIlIi + var8 + this.IiiiiiiIIi.iliillIlIl + var32;
      float var11 = Math.max(llliIlIlilliIlIl.lIlIliIlIl(this.iiIIIIIlIi, this.iIiiiiiIIi.iliillIlIl), Math.max(var32 + 4.0F + 6.0F + this.IliiiiiIIi.IliillIlIl + var32, var10));
      float var12 = this.IIiiiiiIIi.IilliliilIIi(Math.max(160.0F, Math.min(230.0F, (float)Math.ceil((double)var11))), ctx, 0.08F);
      float var13 = llliIlIlilliIlIl.IlIlllIlilIl(30.0F + 2.0F * var9 + 5.0F);
      float var14 = ((float)now - var12) / 2.0F;
      float var15 = this.lIiiiiiIIi.IliIlllilIi(IIililillIililil.liIIlliiIIll(var14, IiIlliIliiIl(), var12, var13, lIiiIiIlilli()), ctx, 0.08F);
      float var16 = IIililillIililil.IiiiIlliiiIl(Iilllilliill<invokedynamic>());
      float var17 = IIililillIililil.iiiiIlIIIIll(Iilllilliill<invokedynamic>());
      iiIliiiIIlliii var18 = IIililillIililil.ilIIllIiIIll(Iilllilliill<invokedynamic>(), var14 + var16, var15 + var17, var12, var13);
      float var19 = llliIlIlilliIlIl.IIIllIIliIIl(var14 + var16);
      float var20 = llliIlIlilliIlIl.IIIllIIliIIl(var15 + var17);
      if (var18 != null) {
         var18.IilliliilIIi(this.IiliiiiIIi);
      }

      float var21 = IliiIilliiIi.IilliliilIIi(this.liliiiiIIi.IliIlllilIi());
      boolean var22 = llliIlIlilliIlIl.lIIIiiIIIi(sw, var19 + var12 / 2.0F, var20 + var13 / 2.0F, this.liliiiiIIi.liiiIIllIl());

      try {
         llliIlIlilliIlIl.Iiilliiliiil(iIIiiiiIIi, var19, var20, var12, var13, 1.0F);
         float var23 = llliIlIlilliIlIl.IllIllllIl(sw, var19, var20, var12, IIlllIlliIll(), Iilllilliill<invokedynamic>(), this.iIiiiiiIIi, this.iiliiiiIIi, 1.0F);
         float var24 = var19 + var32;
         this.IIIllIIliIIl(var24, var23 + llliIlIlilliIlIl.IIIllIIliIIl((var9 - 4.0F) / 2.0F), this.IlIlllIlilIl(dt), dt);
         llliIlIlilliIlIl.lliililiil(this.IliiiiiIIi, var24 + 4.0F + 6.0F, llliIlIlilliIlIl.illilIilil(var23, var9, 0.9F), 0.9F, this.ilIIIIIlIi == liIIiilliiIIiill.iIlIiliill ? llliiiiIIi : llliIlIlilliIlIl.liIlIlIiIl);
         float var25 = var23 + var9;
         float var26 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.78F);
         float var27 = llliIlIlilliIlIl.illilIilil(var25, var9, 0.9F);
         float var28 = iliIiiliiiii(Iilllilliill<invokedynamic>(), this.IIlIIIIlIi, this.lliiiiiIIi, var24, var26, var27) + 10.0F;
         var28 = iliIiiliiiii(Iilllilliill<invokedynamic>(), this.lIlIIIIlIi, this.iliiiiiIIi, var28, var26, var27) + 10.0F;
         iliIiiliiiii(Iilllilliill<invokedynamic>(), this.iIlIIIIlIi, this.IiiiiiiIIi, var28, var26, var27);
      } finally {
         llliIlIlilliIlIl.IlIIillIIi(sw, var22);
         IliiIilliiIi.lIiiIiIlilli(var21);
         if (var18 != null) {
            this.IiliiiiIIi.method_22909();
         }

      }

   }

   private static class_2960 IIlllIlliIll() {
      if (illiiiiIIi == null) {
         illiiiiIIi = lIlIIiliIlIIil.illIlIilIl(Iilllilliill<invokedynamic>());
      }

      return illiiiiIIi;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) >>> 7 | (char)((char)(var4[var5] - var5) >>> 14 | (char)(var4[var5] - var5) << 2) << 9) - var5) ^ '鄌') + '됊') - var5) + var5))) - var5) + var5) - 1052) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float IiIlliIliiIl() {
      long var3 = -8883465562226459890L;
      var3 ^= ((long)IiIiIIliliIiIIli.iIlllIllll() << 32 ^ var3) & -1L << 32;
      float var1 = (int)(var3 >>> 32) > 0 ? (float)((int)(var3 >>> 32)) + 5.0F : 6.0F;
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(IIililillIililil.class);
      if (var2 != null && var2.IliIlllilIi() && IiIlIiIiliIlIiIi.Illlllllilll().iIlIlllllill()) {
         var1 += 26.0F * IIililillIililil.iIlIllIllIll(Iilllilliill<invokedynamic>()) + 6.0F;
      }

      return var1;
   }

   private static float iliIiiliiiii(String ly, float v, llliiiiilliiii label, float x, float vy, float labelW) {
      llliIlIlilliIlIl.lililiilil(ly, x, vy, 0.78F, llliIlIlilliIlIl.iiIlIlIiIl);
      float var6 = x + v + 4.0F + label.iliillIlIl;
      llliIlIlilliIlIl.iIiilIliil(label, var6, labelW, 0.9F, llliIlIlilliIlIl.liIlIlIiIl);
      return var6;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 2693) ^ '\uf39d') ^ var5) - var5) + 8578) + '촕')) - 26752) - var5))) + var5) - '\ufdcd'))) + 30141) - var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '꧕') ^ '镥') << 9 | (char)((char)(var4[var5] - '꧕') ^ '镥') >>> 7) ^ '\uf447') >>> 6 | (char)((char)((char)((char)(var4[var5] - '꧕') ^ '镥') << 9 | (char)((char)(var4[var5] - '꧕') ^ '镥') >>> 7) ^ '\uf447') << 10))) + '\ue365') - 'ꥩ') ^ var5) - var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '꧕') ^ '镥') << 9 | (char)((char)(var4[var5] - '꧕') ^ '镥') >>> 7) ^ '\uf447') >>> 6 | (char)((char)((char)((char)(var4[var5] - '꧕') ^ '镥') << 9 | (char)((char)(var4[var5] - '꧕') ^ '镥') >>> 7) ^ '\uf447') << 10))) + '\ue365') - 'ꥩ') ^ var5) - var5) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
