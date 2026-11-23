package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_11908;
import net.minecraft.class_11909;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_342;
import net.minecraft.class_4185;
import net.minecraft.class_437;

public class lIIIiiIiiIIIiiIi extends class_437 implements Illillliilli {
   private int IlIIiiiIIi;
   private int ilIIiiiIIi = 22;
   private int llIIiiiIIi;
   private int lliiliiIIi;
   private class_342 IiiiliiIIi;
   private final llIIIlIiilIIIlIi IliiliiIIi;
   private int iiiiliiIIi;
   private String liiiliiIIi = "";
   private int iIIIiiiIIi = 14;
   private int IIIIiiiIIi;
   private final class_437 iIiiliiIIi;
   private String iliiliiIIi;
   private int lIIIiiiIIi;

   private String IliIlllilIi() {
      return Ililllililil<invokedynamic>() + (this.IliiliiIIi.IilliliilIIi() ? Ililllililil<invokedynamic>() : Ililllililil<invokedynamic>());
   }

   public boolean method_25402(class_11909 doubled, boolean click) {
      long var9 = 1653179984757662088L;
      long var11 = 6054274100870845218L;
      long var13 = 6946099761352225652L;
      var9 ^= ((long)((int)doubled.comp_4798()) << 32 ^ var9) & -1L << 32;
      var9 ^= ((long)((int)doubled.comp_4799()) ^ var9) & -1L >>> 32;

      for(var11 ^= (0L ^ var11) & -1L << 32; (int)(var11 >>> 32) < 9; var11 += 4294967296L) {
         var11 ^= ((long)(this.IlIIiiiIIi + (int)(var11 >>> 32) % 3 * this.ilIIiiiIIi) ^ var11) & -1L >>> 32;
         var13 ^= ((long)(this.llIIiiiIIi + (int)(var11 >>> 32) / 3 * this.ilIIiiiIIi) << 32 ^ var13) & -1L << 32;
         if ((int)(var9 >>> 32) >= (int)var11 && (int)(var9 >>> 32) < (int)var11 + this.ilIIiiiIIi - 2 && (int)var9 >= (int)(var13 >>> 32) && (int)var9 < (int)(var13 >>> 32) + this.ilIIiiiIIi - 2) {
            this.lliiliiIIi ^= 1 << (int)(var11 >>> 32);
            return true;
         }
      }

      List var5 = this.IliiliiIIi.IliIlllilIi();

      for(long var19 = var11 ^ (0L ^ var11) & -1L >>> 32; (int)var19 < var5.size() && (int)var19 < 12; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
         var13 ^= ((long)(this.IIIIiiiIIi + (int)var19 * this.iIIIiiiIIi) << 32 ^ var13) & -1L << 32;
         if ((int)(var9 >>> 32) >= this.iiiiliiIIi && (int)(var9 >>> 32) <= this.iiiiliiIIi + this.lIIIiiiIIi && (int)var9 >= (int)(var13 >>> 32) && (int)var9 < (int)(var13 >>> 32) + this.iIIIiiiIIi) {
            illiiIIlIiliiIIl var8 = (illiiIIlIiliiIIl)var5.get((int)var19);
            this.iliiliiIIi = var8.liiiIIllIl();
            this.lliiliiIIi = var8.iIlIlllllill();
            this.IiiiliiIIi.method_1852(var8.liiiIIllIl());
            if (click) {
               this.IliiliiIIi.IIillIiliIil(var8.liiiIIllIl());
               this.liiiliiIIi = Ililllililil<invokedynamic>() + var8.liiiIIllIl() + Ililllililil<invokedynamic>();
               liiiIIllIl();
            }

            return true;
         }
      }

      return super.method_25402(doubled, click);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '\uf2d5') ^ var5) + var5) - 17824) ^ 16330)))))) ^ var5) + var5) ^ var5) + '같'))) + var5) - 15184) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean method_25404(class_11908 input) {
      if (input.comp_4795() == 256) {
         this.method_25419();
         return true;
      } else {
         return super.method_25404(input);
      }
   }

   private void IilliliilIIi() {
      if (this.iliiliiIIi == null) {
         this.liiiliiIIi = Ililllililil<invokedynamic>();
      } else {
         String var1 = this.IiiiliiIIi.method_1882();
         if (this.IliiliiIIi.Illlllllilll(this.iliiliiIIi, var1)) {
            this.iliiliiIIi = llIIIlIiilIIIlIi.IiIlliIliiIl(var1);
            this.liiiliiIIi = Ililllililil<invokedynamic>() + this.iliiliiIIi + Ililllililil<invokedynamic>();
            liiiIIllIl();
         } else {
            this.liiiliiIIi = Ililllililil<invokedynamic>();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6632097189361296901L ^ Long.rotateLeft(1302960094853714876L, 17) ^ -3044529435884944043L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5331384253159670366L ^ Long.rotateLeft(7860147916231695755L, 53) ^ -8533049378642771960L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2863733239882949113L ^ Long.rotateLeft(-8361919283343325083L, 59) ^ 945714424929781931L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8194070366970284190L ^ Long.rotateLeft(2288365480871622418L, 13) ^ 5414856577216835796L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4475640673363164380L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2498438057814723432L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7175738351636830112L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1769937155663134656L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6582978129095651176L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2285263103277662277L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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

   public void method_25394(class_332 ctx, int my, int delta, float mx) {
      long var17 = 5741981383860788817L;
      long var19 = 6201737395639266459L;
      long var21 = -9050327703977132373L;
      long var23 = -459754142332618833L;
      long var25 = -8152973975469996185L;
      var17 ^= ((long)Math.min(400, this.field_22789 - 20) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)Math.min(230, this.field_22790 - 20) ^ var17) & -1L >>> 32;
      var19 ^= ((long)((this.field_22789 - (int)(var17 >>> 32)) / 2) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)((this.field_22790 - (int)var17) / 2) ^ var19) & -1L >>> 32;
      ctx.method_25294(0, 0, this.field_22789, this.field_22790, -1610612736);
      ctx.method_25294((int)(var19 >>> 32), (int)var19, (int)(var19 >>> 32) + (int)(var17 >>> 32), (int)var19 + (int)var17, -267119072);
      ctx.method_25294((int)(var19 >>> 32), (int)var19, (int)(var19 >>> 32) + (int)(var17 >>> 32), (int)var19 + 1, 1090519039);
      ctx.method_51433(this.field_22793, Ililllililil<invokedynamic>() + this.IliiliiIIi.IlIillIiilIi(), (int)(var19 >>> 32) + 10, (int)var19 + 9, -1, false);
      List var9 = this.IliiliiIIi.IliIlllilIi();
      String var10 = this.IliiliiIIi.iIlIlllllill();

      for(var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < var9.size() && (int)(var21 >>> 32) < 12; var21 += 4294967296L) {
         illiiIIlIiliiIIl var12 = (illiiIIlIiliiIIl)var9.get((int)(var21 >>> 32));
         var21 ^= ((long)(this.IIIIiiiIIi + (int)(var21 >>> 32) * this.iIIIiiiIIi) ^ var21) & -1L >>> 32;
         var23 ^= ((long)(my >= this.iiiiliiIIi && my <= this.iiiiliiIIi + this.lIIIiiiIIi && delta >= (int)var21 && delta < (int)var21 + this.iIIIiiiIIi ? 1 : 0) << 32 ^ var23) & -1L << 32;
         var23 ^= ((long)var12.liiiIIllIl().equalsIgnoreCase(this.iliiliiIIi) ^ var23) & -1L >>> 32;
         var25 ^= ((long)var12.liiiIIllIl().equalsIgnoreCase(var10) << 32 ^ var25) & -1L << 32;
         if ((int)(var23 >>> 32) != 0 || (int)var23 != 0) {
            ctx.method_25294(this.iiiiliiIIi - 2, (int)var21 - 1, this.iiiiliiIIi + this.lIIIiiiIIi, (int)var21 + this.iIIIiiiIIi - 1, (int)var23 != 0 ? 1346412799 : 822083583);
         }

         ctx.method_51433(this.field_22793, ((int)(var25 >>> 32) != 0 ? Ililllililil<invokedynamic>() : Ililllililil<invokedynamic>()) + var12.liiiIIllIl(), this.iiiiliiIIi, (int)var21 + 2, (int)(var25 >>> 32) != 0 ? -10406 : -1644826, false);
         ctx.method_51433(this.field_22793, IiliIIllliliIIll.iliIiiliiiii(var12.iIlIlllllill()), this.iiiiliiIIi + this.lIIIiiiIIi - 60, (int)var21 + 2, -6643540, false);
      }

      if (var9.isEmpty()) {
         ctx.method_51433(this.field_22793, Ililllililil<invokedynamic>(), this.iiiiliiIIi, this.IIIIiiiIIi + 2, -6643540, false);
      }

      for(var21 ^= (0L ^ var21) & -1L << 32; (int)(var21 >>> 32) < 9; var21 += 4294967296L) {
         var25 ^= ((long)(this.IlIIiiiIIi + (int)(var21 >>> 32) % 3 * this.ilIIiiiIIi) ^ var25) & -1L >>> 32;
         var21 ^= ((long)(this.llIIiiiIIi + (int)(var21 >>> 32) / 3 * this.ilIIiiiIIi) ^ var21) & -1L >>> 32;
         long var36 = var23 ^ ((long)IiliIIllliliIIll.IilliliilIIi(this.lliiliiIIi, (int)(var21 >>> 32)) << 32 ^ var23) & -1L << 32;
         var23 = var36 ^ ((long)(my >= (int)var25 && my < (int)var25 + this.ilIIiiiIIi - 2 && delta >= (int)var21 && delta < (int)var21 + this.ilIIiiiIIi - 2 ? 1 : 0) ^ var36) & -1L >>> 32;
         ctx.method_25294((int)var25, (int)var21, (int)var25 + this.ilIIiiiIIi - 2, (int)var21 + this.ilIIiiiIIi - 2, (int)(var23 >>> 32) != 0 ? -8376272 : -12957126);
         if ((int)var23 != 0) {
            ctx.method_25294((int)var25, (int)var21, (int)var25 + this.ilIIiiiIIi - 2, (int)var21 + this.ilIIiiiIIi - 2, 822083583);
         }

         ctx.method_51433(this.field_22793, (int)(var23 >>> 32) != 0 ? Ililllililil<invokedynamic>() : "" + ((int)(var21 >>> 32) + 1), (int)var25 + 7, (int)var21 + 6, -1, false);
      }

      ctx.method_51433(this.field_22793, Ililllililil<invokedynamic>() + IiliIIllliliIIll.iliIiiliiiii(this.lliiliiIIi) + (this.iliiliiIIi == null ? Ililllililil<invokedynamic>() : Ililllililil<invokedynamic>() + this.iliiliiIIi + Ililllililil<invokedynamic>()), this.IlIIiiiIIi + 3 * this.ilIIiiiIIi + 8, this.llIIiiiIIi + 2, -5195576, false);
      ctx.method_51433(this.field_22793, Ililllililil<invokedynamic>(), this.IlIIiiiIIi + 3 * this.ilIIiiiIIi + 8, this.llIIiiiIIi + 14, -6643540, false);
      ctx.method_51433(this.field_22793, this.liiiliiIIi, (int)(var19 >>> 32) + 10, (int)var19 + (int)var17 - 38, -6631169, false);
      super.method_25394(ctx, my, delta, mx);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) >>> 5 | (char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) << 11) << 10 | (char)((char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) >>> 5 | (char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) << 11) >>> 6) - 'ﷴ')) + var5) + 24853) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) >>> 5 | (char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) << 11) << 10 | (char)((char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) >>> 5 | (char)((char)(var4[var5] ^ var5) << 14 | (char)(var4[var5] ^ var5) >>> 2) << 11) >>> 6) - 'ﷴ')) + var5) + 24853) << 12) + 23098) + 16693))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void liiiIIllIl() {
      try {
         iiiIIIlIIIlIIl.liiiIIllIl();
      } catch (Throwable var1) {
      }

   }

   public boolean method_25421() {
      return false;
   }

   protected void method_25426() {
      long var8 = -2427348078423106355L;
      long var10 = 8658904147719162622L;
      long var12 = 7521798151508172128L;
      long var14 = -8165021954923506830L;
      var8 ^= ((long)Math.min(400, this.field_22789 - 20) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)Math.min(230, this.field_22790 - 20) ^ var8) & -1L >>> 32;
      var10 ^= ((long)((this.field_22789 - (int)(var8 >>> 32)) / 2) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)((this.field_22790 - (int)var8) / 2) ^ var10) & -1L >>> 32;
      this.iiiiliiIIi = (int)(var10 >>> 32) + 10;
      this.IIIIiiiIIi = (int)var10 + 28;
      this.lIIIiiiIIi = 150;
      this.IlIIiiiIIi = (int)(var10 >>> 32) + 190;
      this.llIIiiiIIi = (int)var10 + 28;
      this.IiiiliiIIi = new class_342(this.field_22793, this.IlIIiiiIIi, this.llIIiiiIIi + 3 * this.ilIIiiiIIi + 8, 190, 16, class_2561.method_43470(Ililllililil<invokedynamic>()));
      this.IiiiliiIIi.method_1880(24);
      if (this.iliiliiIIi != null) {
         this.IiiiliiIIi.method_1852(this.iliiliiIIi);
      }

      this.method_37063(this.IiiiliiIIi);
      var12 ^= ((long)(this.llIIiiiIIi + 3 * this.ilIIiiiIIi + 30) << 32 ^ var12) & -1L << 32;
      var12 ^= (60L ^ var12) & -1L >>> 32;
      var14 ^= (68719476736L ^ var14) & -1L << 32;
      this.method_37063(class_4185.method_46430(class_2561.method_43470(Ililllililil<invokedynamic>()), (b) -> this.iIlIlllllill()).method_46434(this.IlIIiiiIIi, (int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32)).method_46431());
      this.method_37063(class_4185.method_46430(class_2561.method_43470(Ililllililil<invokedynamic>()), (b) -> this.IilliliilIIi()).method_46434(this.IlIIiiiIIi + 65, (int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32)).method_46431());
      this.method_37063(class_4185.method_46430(class_2561.method_43470(Ililllililil<invokedynamic>()), (b) -> this.lIiiIiIlilli()).method_46434(this.IlIIiiiIIi + 130, (int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32)).method_46431());
      this.method_37063(class_4185.method_46430(class_2561.method_43470(Ililllililil<invokedynamic>()), (b) -> this.iliIiiliiiii()).method_46434(this.IlIIiiiIIi, (int)(var12 >>> 32) + 20, (int)var12, (int)(var14 >>> 32)).method_46431());
      this.method_37063(class_4185.method_46430(class_2561.method_43470(this.IliIlllilIi()), (b) -> {
         this.IliiliiIIi.lIiiIiIlilli(!this.IliiliiIIi.IilliliilIIi());
         b.method_25355(class_2561.method_43470(this.IliIlllilIi()));
         liiiIIllIl();
      }).method_46434(this.IlIIiiiIIi + 65, (int)(var12 >>> 32) + 20, 90, (int)(var14 >>> 32)).method_46431());
      this.method_37063(class_4185.method_46430(class_2561.method_43470(Ililllililil<invokedynamic>()), (b) -> this.method_25419()).method_46434((int)(var10 >>> 32) + (int)(var8 >>> 32) - 60, (int)var10 + (int)var8 - 24, 50, (int)(var14 >>> 32)).method_46431());
      this.method_37063(class_4185.method_46430(class_2561.method_43470(Ililllililil<invokedynamic>()), (b) -> {
         this.iliiliiIIi = null;
         this.lliiliiIIi = 0;
         this.IiiiliiIIi.method_1852("");
         this.liiiliiIIi = Ililllililil<invokedynamic>();
      }).method_46434(this.iiiiliiIIi, (int)var10 + (int)var8 - 24, 50, (int)(var14 >>> 32)).method_46431());
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '됐'))))) + 8398) - 'ﶴ'))) - var5))) ^ var5) >>> 15 | (char)((char)(~((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - '됐'))))) + 8398) - 'ﶴ'))) - var5))) ^ var5) << 1) + var5) - var5) ^ var5) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) << 12 | (char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) >>> 4) << 9 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) << 12 | (char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) >>> 4) >>> 7) + var5) ^ var5))) - 29603) ^ var5) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) << 12 | (char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) >>> 4) << 9 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) << 12 | (char)(-((char)((char)(~((char)((char)(var4[var5] - '쎃') - var5))) ^ var5))) >>> 4) >>> 7) + var5) ^ var5))) - 29603) ^ var5) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIIIiiIiiIIIiiIi(class_437 initialMask, llIIIlIiilIIIlIi parent, Integer lib) {
      super(class_2561.method_43470(Ililllililil<invokedynamic>()));
      this.iIiiliiIIi = initialMask;
      this.IliiliiIIi = parent;
      illiiIIlIiliiIIl var4 = parent.IIIllIIliIIl();
      if (lib != null) {
         this.lliiliiIIi = lib & 511;
         this.iliiliiIIi = null;
      } else if (var4 != null) {
         this.lliiliiIIi = var4.iIlIlllllill();
         this.iliiliiIIi = var4.liiiIIllIl();
      }

   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 19535)))) + var5) ^ '뛜'))))) >>> 13 | (char)(-((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 19535)))) + var5) ^ '뛜'))))) << 3))) - var5))) - var5) << 11 | (char)((char)(-((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 19535)))) + var5) ^ '뛜'))))) >>> 13 | (char)(-((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + 19535)))) + var5) ^ '뛜'))))) << 3))) - var5))) - var5) >>> 5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlIlllllill() {
      String var1 = this.IiiiliiIIi.method_1882();
      if (this.IliiliiIIi.IIlllIlliIll(var1, this.lliiliiIIi)) {
         this.iliiliiIIi = llIIIlIiilIIIlIi.IiIlliIliiIl(var1);
         this.liiiliiIIi = Ililllililil<invokedynamic>() + this.iliiliiIIi + Ililllililil<invokedynamic>();
         liiiIIllIl();
      } else {
         this.liiiliiIIi = Ililllililil<invokedynamic>();
      }

   }

   private void iliIiiliiiii() {
      if (this.iliiliiIIi == null) {
         this.liiiliiIIi = Ililllililil<invokedynamic>();
      } else {
         if (this.IliiliiIIi.IIillIiliIil(this.iliiliiIIi)) {
            this.liiiliiIIi = Ililllililil<invokedynamic>() + this.iliiliiIIi + Ililllililil<invokedynamic>();
            liiiIIllIl();
         }

      }
   }

   private void lIiiIiIlilli() {
      if (this.iliiliiIIi == null) {
         this.liiiliiIIi = Ililllililil<invokedynamic>();
      } else {
         if (this.IliiliiIIi.Iilllilliill(this.iliiliiIIi)) {
            this.liiiliiIIi = Ililllililil<invokedynamic>() + this.iliiliiIIi + Ililllililil<invokedynamic>();
            this.iliiliiIIi = null;
            this.IiiiliiIIi.method_1852("");
            this.lliiliiIIi = 0;
            liiiIIllIl();
         }

      }
   }

   public void method_25419() {
      class_310.method_1551().method_1507(this.iIiiliiIIi);
   }
}
