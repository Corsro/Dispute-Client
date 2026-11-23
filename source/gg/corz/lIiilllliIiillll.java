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
import java.util.Objects;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class lIiilllliIiillll {
   private String llliliIill = "";
   private int liIiliIill;
   private String IlliliIill;
   private int IIliliIill;
   private static final String iiilliIill = "Pick a schematic, place it, then press Start.";
   private static final int llilliIill = 4;
   public static final int IlilliIill = 44;
   private int IiIiliIill;
   private static final Color iIIiliIill = new Color(-7630437, true);
   private static final int ililliIill = 18;
   private int lIliliIill = -1;
   private final lIIiiIiiIIiiIi ilIiliIill;
   private static final String IIIiliIill = "Add trades, mark your chests, then press Start.";
   private final String llIiliIill;
   private static final float liilliIill = 0.82F;
   private static final String lIIiliIill = "Compare /ah shard tool deals and buy the best one.";
   private String iIliliIill;
   private static final int IiilliIill = 24;
   private int iiIiliIill;
   private final iIlIilIlIllIilIl IlIiliIill;

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) + 3481) << 1 | (char)((char)(-((char)((char)(var4[var5] + var5) - var5))) + 3481) >>> 15) - var5) ^ var5) + 13423))) - var5) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private Integer iliIiiliiiii() {
      return this.IlIiliIill.IliIlllilIi() && this.IlIiliIill.iiililliIl.lIiiIiIlilli() != null ? -8393375 : 0;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) << 6 | (char)((char)(-((char)(~var4[var5]))) ^ var5) >>> 10) - var5) + var5) - var5) ^ '\uf534') << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) << 6 | (char)((char)(-((char)(~var4[var5]))) ^ var5) >>> 10) - var5) + var5) - var5) ^ '\uf534') >>> 5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) << 6 | (char)((char)(-((char)(~var4[var5]))) ^ var5) >>> 10) - var5) + var5) - var5) ^ '\uf534') << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) << 6 | (char)((char)(-((char)(~var4[var5]))) ^ var5) >>> 10) - var5) + var5) - var5) ^ '\uf534') >>> 5) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String lIiiIiIlilli() {
      long var8 = 1245727200937773840L;
      long var10 = -1616924223246928569L;
      iIilliIlIlilliIl var1 = this.IlIiliIill.iiililliIl.lIiiIiIlilli();
      String var2 = this.IlIiliIill.iiililliIl.iliIiiliiiii();
      var8 ^= ((long)(var1 != null ? 1 : 0) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(this.IlIiliIill.IliIlllilIi() && (int)(var8 >>> 32) != 0 ? 1 : 0) ^ var8) & -1L >>> 32;
      var10 ^= ((long)((int)var8 != 0 ? IiIlIiIiliIlIiIi.IIillIiliIil() : -1) << 32 ^ var10) & -1L << 32;
      String var6 = ((int)(var8 >>> 32) != 0 ? var2 + IIlllIlliIll<invokedynamic>() + var1.iliIiiiIll : "") + IIlllIlliIll<invokedynamic>() + (int)(var10 >>> 32);
      if (!var6.equals(this.IlliliIill)) {
         this.IlliliIill = var6;
         if ((int)(var8 >>> 32) == 0) {
            this.llliliIill = IIlllIlliIll<invokedynamic>();
         } else {
            String var7 = var2 != null && !var2.isBlank() ? Iiiiliiiiiii.iilllIIill(var2) : (var1.iliIiiiIll != null && !var1.iliIiiiIll.isBlank() ? var1.iliIiiiIll : IIlllIlliIll<invokedynamic>());
            this.llliliIill = (int)var8 != 0 ? var7 + IIlllIlliIll<invokedynamic>() + (int)(var10 >>> 32) + IIlllIlliIll<invokedynamic>() : var7;
         }
      }

      return this.llliliIill;
   }

   public boolean IilliliilIIi(double mx, double my, int button) {
      return this.ilIiliIill.lIiiIiIlilli(mx, my, button);
   }

   private lIiilllliIiillll(String tip, String act, String label, Runnable desc, Supplier<String> status, Supplier<Integer> dot) {
      this.IlIiliIill = null;
      this.llIiliIill = tip;
      this.iIliliIill = tip;
      this.IIliliIill = 44;
      ililliIiIiilliIi var7 = (new ililliIiIiilliIi(act, label, act, desc)).IIillIiliIil(status).IIIilIIiiIIi(dot);
      this.ilIiliIill = new lIIiiIiiIIiiIi(var7, 0, 0, 0, 24);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5140271993179204770L ^ Long.rotateLeft(4428855966627370447L, 51) ^ -4714537213004523563L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -9147157501878926036L ^ Long.rotateLeft(-1591031165699962086L, 15) ^ -3542062337721990300L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3798125199436510583L ^ Long.rotateLeft(-624665205658663384L, 34) ^ 5232259364907357244L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 158187096001655626L ^ Long.rotateLeft(5545688527156626731L, 1) ^ -1951574025133674498L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6414332381127319027L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5131917504224786264L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -513928112096768610L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2482729692382268643L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7663566465218264346L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6683121289161994309L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '螤') - var5))) << 9 | (char)(~((char)((char)(var4[var5] ^ '螤') - var5))) >>> 7) + var5) + var5) ^ '혊') ^ 'ꊍ') ^ var5)) ^ var5) - '难') + 835))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(int height, int width, int x, int y) {
      this.IiIiliIill = height;
      this.liIiliIill = width;
      this.iiIiliIill = x;
      this.IIliliIill = y;
      this.ilIiliIill.IIIllIIliIIl(height, width + 18, x, 24);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) << 9) - var5) ^ 19694) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) << 9) - var5) ^ 19694) ^ var5) >>> 11) + '覲') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) << 9) - var5) ^ 19694) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 23584) + '권') + 4838) - 11263) + 11164) ^ 16486) + var5))) - 8680) >>> 2) << 9) - var5) ^ 19694) ^ var5) >>> 11) + '覲') >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIiilllliIiillll IliIlllilIi(ilIllIiIll m) {
      if (m instanceof iIlIilIlIllIilIl var3) {
         return new lIiilllliIiillll(var3);
      } else if (m instanceof llIiIlilIiIl var2) {
         String var4 = IIlllIlliIll<invokedynamic>();
         String var5 = IIlllIlliIll<invokedynamic>();
         String var6 = IIlllIlliIll<invokedynamic>();
         Runnable var7 = () -> iIIiIIIlIlIiIIIl.IIllllIlll(var2);
         Objects.requireNonNull(var2);
         Supplier var8 = var2::iIllilIlllil;
         Objects.requireNonNull(var2);
         return new lIiilllliIiillll(var4, var5, var6, var7, var8, var2::llllililllil);
      } else if (m instanceof IIlilIllIlilIl var1) {
         String var10002 = IIlllIlliIll<invokedynamic>();
         String var10003 = IIlllIlliIll<invokedynamic>();
         String var10004 = IIlllIlliIll<invokedynamic>();
         Runnable var10005 = () -> llIIlIllilIIlIll.IIllllIlll(var1);
         Objects.requireNonNull(var1);
         Supplier var10006 = var1::illiIlIiliIl;
         Objects.requireNonNull(var1);
         return new lIiilllliIiillll(var10002, var10003, var10004, var10005, var10006, var1::liliIliiliIl);
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 2 | (char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 14) ^ 15913) ^ var5) - 27683) ^ var5) + 3735) + 5682) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 2 | (char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 14) ^ 15913) ^ var5) - 27683) ^ var5) + 3735) + 5682) << 15) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 2 | (char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 14) ^ 15913) ^ var5) - 27683) ^ var5) + 3735) + 5682) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) >>> 2 | (char)(~((char)(var4[var5] >>> 10 | var4[var5] << 6))) << 14) ^ 15913) ^ var5) - 27683) ^ var5) + 3735) + 5682) << 15) >>> 8) - 20373))))) + '\uf4f6') - '픢') + 23959) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(class_332 ctx, int mouseY, int mouseX) {
      IIliiIlllIliiIll var4 = CorzClient.fontRenderer();
      if (this.iiIiliIill != this.lIliliIill) {
         this.lIliliIill = this.iiIiliIill;
         this.iIliliIill = var4.Iiilliiliiil(this.llIiliIill, (float)(this.iiIiliIill - 8) / 0.82F);
      }

      class_4587 var5 = IIIiiIillIIiiIil.liiiIIllIl();
      var5.method_22903();
      var5.method_22905(0.82F, 0.82F, 1.0F);
      var4.IliIlllilIi(this.iIliliIill, (float)(this.IiIiliIill + 4) / 0.82F, ((float)this.liIiliIill + 2.0F) / 0.82F, iIIiliIill);
      var5.method_22909();
      this.ilIiliIill.IIIllIIliIIl(this.IiIiliIill, this.liIiliIill + 18, this.iiIiliIill, 24);
      this.ilIiliIill.liiiIIllIl(ctx, mouseY, mouseX);
   }

   private lIiilllliIiillll(iIlIilIlIllIilIl builder) {
      this.IlIiliIill = builder;
      this.llIiliIill = IIlllIlliIll<invokedynamic>();
      this.iIliliIill = IIlllIlliIll<invokedynamic>();
      this.IIliliIill = 44;
      ililliIiIiilliIi var2 = (new ililliIiIiilliIi(IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), () -> IIIIllIIIl.Iiliililii(builder))).IIillIiliIil(this::lIiiIiIlilli).IIIilIIiiIIi(this::iliIiiliiiii);
      this.ilIiliIill = new lIIiiIiiIIiiIi(var2, 0, 0, 0, 24);
   }
}
