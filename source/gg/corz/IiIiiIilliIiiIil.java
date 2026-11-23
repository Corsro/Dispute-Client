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
import net.minecraft.class_1799;
import net.minecraft.class_332;
import org.joml.Matrix3x2fStack;

public final class IiIiiIilliIiiIil {
   private int iIIililIil = -1;
   private String[] illllilIil = new String[0];
   private class_1799[] lllllilIil = new class_1799[0];
   private final iIliililIlliilil llillilIil = new iIliililIlliilil();
   private static final float ilIllilIil = 16.0F;
   private float[] iilllilIil = new float[0];
   private static final int IlIllilIil = 385875967;
   private double iiillilIil;
   private String[] lilllilIil = new String[0];
   private float liIililIil;
   private static final float iiIllilIil = 22.0F;
   private float IiIililIil;
   private static final float liIllilIil = 14.0F;
   private static final double IIlllilIil = 0.035;
   private static final int llIllilIil = -1946157056;
   private String[] IilllilIil = new String[0];
   private static final float IiIllilIil = 25.0F;
   private int IlIililIil = -1;
   private float[] IIillilIil = new float[0];
   private float[] lIillilIil = new float[0];
   private float iiIililIil;
   private float liillilIil = 1.0F;
   private boolean IiillilIil;
   private liiIIlIliiiIIlIl IllllilIil = IiIlIllliIlIll.liiiIIllIl(0, 0);
   private static final double lIlllilIil = 0.045;
   private boolean[] IlillilIil = new boolean[0];
   private static final int iIIllilIil = -65990120;
   private final llIIiililIIiil ilillilIil = new llIIiililIIiil((double)0.0F);
   private float[] iIillilIil = new float[0];
   private int lIIililIil = -1;
   private long ilIililIil;
   private llIiliilIili iIlllilIil = new llIiliilIili(List.of(), 0, 0);
   private static final String lIIllilIil = " · Soon";
   private double IIIililIil;

   public void Ililllililil(class_332 entrance, float h, float x, float selected, int interactive, int y, int ctx, iIIliiIiIlIliiIi my, int base, boolean mx) {
      long var19 = 845141583053171758L;
      long var21 = -2365214502488994217L;
      long var23 = -7351674521540128974L;
      this.IiIililIil = h;
      this.liIililIil = x;
      this.iiIililIil = selected;
      this.IlIililIil = ctx;
      double var11 = llIilillilIilill.liiiIIllIl();
      var19 ^= ((long)this.iIlllilIil.IliIlllilIi() << 32 ^ var19) & -1L << 32;
      this.iiillilIil = IiIlIllliIlIll.IIiilIiiiIii(this.iiillilIil, (double)this.IllllilIil.IIIllIIliIIl(), (double)selected);
      this.IIIililIil = IiiIIIIlliiIIIIl.iIlIlllllill(this.IIIililIil, this.iiillilIil, (double)18.0F, var11);
      if (Math.abs(this.IIIililIil - this.iiillilIil) < 0.05) {
         this.IIIililIil = this.iiillilIil;
      }

      var19 ^= ((long)(mx ? this.IIlllIlliIll((double)interactive, (double)y) : -1) ^ var19) & -1L >>> 32;
      if ((int)var19 != this.lIIililIil) {
         this.lIIililIil = (int)var19;
         this.ilIililIil = System.nanoTime();
      }

      if (this.lIIililIil >= 0 && this.lIIililIil != this.iIIililIil) {
         lllIlliillIlli.iIlllIllll();
      }

      this.iIIililIil = this.lIIililIil;
      if ((int)(var19 >>> 32) != 0) {
         var21 ^= ((long)this.Illlllllilll() << 32 ^ var21) & -1L << 32;
         if ((int)(var21 >>> 32) != 0) {
            entrance.method_44379((int)Math.floor((double)h), (int)Math.floor((double)x), (int)Math.ceil((double)(h + 32.0F)), (int)Math.ceil((double)(x + selected)));
         }

         try {
            for(var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < (int)(var19 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
               var23 ^= ((long)((int)var21 == ctx ? 1 : 0) << 32 ^ var23) & -1L << 32;
               this.iilllilIil[(int)var21] = iIIIlIlIIl(this.iilllilIil[(int)var21], (int)var21 == this.lIIililIil && (int)(var23 >>> 32) == 0 ? 1.0F : 0.0F, (int)var21 == this.lIIililIil ? (double)16.0F : (double)11.0F, var11);
               this.IIillilIil[(int)var21] = iIIIlIlIIl(this.IIillilIil[(int)var21], (int)(var23 >>> 32) != 0 ? 1.0F : 0.0F, (double)14.0F, var11);
            }

            this.Iiilliiliiil(entrance, ctx, my, base, var11);

            for(var21 ^= (0L ^ var21) & -1L >>> 32; (int)var21 < (int)(var19 >>> 32); var21 ^= (var21 ^ var21 + (long)1) & -1L >>> 32) {
               this.IIIilIIiiIIi(entrance, (int)var21, my.lIiiIiIlilli(base + (int)var21), var11);
            }

            this.IIlilIliiIli(entrance, my, base);
         } finally {
            if ((int)(var21 >>> 32) != 0) {
               entrance.method_44380();
            }

         }

      }
   }

   public void IliIlllilIi(llIiliilIili rail) {
      long var6 = 6464842089061096425L;
      this.iIlllilIil = rail == null ? new llIiliilIili(List.of(), 0, 0) : rail;
      this.IllllilIil = IiIlIllliIlIll.liiiIIllIl(this.iIlllilIil.iliIiiliiiii(), this.iIlllilIil.IIIllIIliIIl());
      var6 ^= ((long)this.iIlllilIil.IliIlllilIi() << 32 ^ var6) & -1L << 32;
      this.lllllilIil = new class_1799[(int)(var6 >>> 32)];
      this.illllilIil = new String[(int)(var6 >>> 32)];
      this.IilllilIil = new String[(int)(var6 >>> 32)];
      this.lilllilIil = new String[(int)(var6 >>> 32)];
      this.iilllilIil = new float[(int)(var6 >>> 32)];
      this.IIillilIil = new float[(int)(var6 >>> 32)];
      this.lIillilIil = new float[(int)(var6 >>> 32)];
      this.iIillilIil = new float[(int)(var6 >>> 32)];
      this.IlillilIil = new boolean[(int)(var6 >>> 32)];

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         iIillIlIlillIl var4 = this.iIlllilIil.liiiIIllIl((int)var9);
         this.lllllilIil[(int)var9] = liiiIIllIl(var4.iIlIlllllill());
         this.illllilIil[(int)var9] = llIIlilIIl<invokedynamic>() + var4.liiiIIllIl();
         this.IilllilIil[(int)var9] = llIIlilIIl<invokedynamic>() + var4.liiiIIllIl();
         ilIllIiIll var5 = var4.IilliliilIIi();
         this.IlillilIil[(int)var9] = var5 != null && var5.IliIlllilIi();
         this.lIillilIil[(int)var9] = this.IlillilIil[(int)var9] ? 1.0F : 0.0F;
      }

      this.lIIililIil = -1;
      this.iIIililIil = -1;
      this.IiillilIil = false;
      this.iiillilIil = (double)0.0F;
      this.IIIililIil = this.iiillilIil;
   }

   public void IIIIllIIIl(class_332 allowed, float contentX, boolean ctx) {
      long var17 = 242042512276238493L;
      var17 ^= ((long)this.lIIililIil << 32 ^ var17) & -1L << 32;
      if (ctx && this.Illillliilli((int)(var17 >>> 32))) {
         float var5 = (float)(System.nanoTime() - this.ilIililIil) / 1000000.0F - 150.0F;
         if (!(var5 <= 0.0F)) {
            float var6 = llilliilililliil.liiiIIllIl(var5 / 120.0F);
            iIillIlIlillIl var7 = this.iIlllilIil.liiiIIllIl((int)(var17 >>> 32));
            var17 ^= ((long)var7.IliIlllilIi() ^ var17) & -1L >>> 32;
            if (this.lilllilIil[(int)(var17 >>> 32)] == null) {
               String var9 = (int)var17 != 0 ? (var7.iIlIlllllill().IlIillIiilIi() == null ? var7.liiiIIllIl() : var7.iIlIlllllill().IlIillIiilIi()) : var7.IilliliilIIi().IilliliilIIi();
               float var10 = (int)var17 != 0 ? llilliilililliil.llIIlilIIl(llIIlilIIl<invokedynamic>()) : 0.0F;
               this.lilllilIil[(int)(var17 >>> 32)] = llilliilililliil.IIiilIiiiIii().Iiilliiliiil(var9, 140.0F - var10);
               this.iIillilIil[(int)(var17 >>> 32)] = IiIlIllliIlIll.Illlllllilll(llilliilililliil.llIIlilIIl(this.lilllilIil[(int)(var17 >>> 32)]) + var10);
            }

            float var21 = this.iIillilIil[(int)(var17 >>> 32)];
            float var22 = 16.0F;
            float var11 = contentX + IiIlIllliIlIll.IiIlliIliiIl() - 4.0F * (1.0F - var6);
            float var12 = this.Iiiiliiiiiii();
            float var13 = IliiIilliiIi.IilliliilIIi(var6);

            try {
               IIIiiIillIIiiIil.IiIlliIliiIl(allowed, var11 - 2.0F, var12, var21 + 4.0F, var22 + 3.0F, 6.0F, -1946157056, 6.0F, 0.5F);
               IIIiiIillIIiiIil.Ililllililil(allowed, var11, var12, var21, var22, 5.0F, -65990120, 385875967);
               float var14 = llilliilililliil.IllIllllIl(var12, var22, 1.0F);
               float var15 = var11 + 7.0F;
               llilliilililliil.iiIIlIIlIl(this.lilllilIil[(int)(var17 >>> 32)], var15, var14, -920587);
               if ((int)var17 != 0) {
                  llilliilililliil.iiIIlIIlIl(llIIlilIIl<invokedynamic>(), var15 + llilliilililliil.llIIlilIIl(this.lilllilIil[(int)(var17 >>> 32)]), var14, -7630437);
               }
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var13);
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) << 5 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) >>> 11) + var5) - '궁') << 4 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) << 5 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) >>> 11) + var5) - '궁') >>> 12) ^ var5))) >>> 2 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) << 5 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) >>> 11) + var5) - '궁') << 4 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) << 5 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) << 15 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) >>> 10 | (char)((char)(var4[var5] << 2 | var4[var5] >>> 14) >>> 5 | (char)(var4[var5] << 2 | var4[var5] >>> 14) << 11) << 6) ^ 22693) >>> 1))) >>> 11) + var5) - '궁') >>> 12) ^ var5))) << 14) - 29213) - '\ueeb9'))) - '轔'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -9079161022177061226L ^ Long.rotateLeft(1479894218153707301L, 16) ^ 4260706962525828128L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2970360522720836012L ^ Long.rotateLeft(2616743103892491440L, 18) ^ -1422690048990959869L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3181199492391592263L ^ Long.rotateLeft(7167285586052181383L, 29) ^ -3709540884428363426L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -979681264938665504L ^ Long.rotateLeft(699402167086554829L, 47) ^ -1448904780816108710L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8667442661025641656L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8844619926199078046L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5852645264368458830L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1562431576954731830L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4915854134823078629L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -9145093172796454741L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIIlliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iiIIlIIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIlIliIlIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IllIllllIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(illIlIilIl<invokedynamic>());
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

   public void iliIiiliiiii(int selected) {
      long var3 = 5350313299203710749L;
      if (selected >= 0 && selected < this.IllllilIil.IliIlllilIi()) {
         this.ilillilIil.liiiIIllIl((double)this.IllllilIil.IilliliilIIi(selected));
         this.IiillilIil = true;

         for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IIillilIil.length; var5 += 4294967296L) {
            this.IIillilIil[(int)(var5 >>> 32)] = (int)(var5 >>> 32) == selected ? 1.0F : 0.0F;
         }

         this.liillilIil = 1.0F;
      }
   }

   public int lIiiIiIlilli() {
      return this.lIIililIil;
   }

   public void IIillIiliIil(int i) {
      if (!(this.iiIililIil <= 0.0F)) {
         this.iiillilIil = IiIlIllliIlIll.IilliliilIIi(this.IllllilIil, i, this.iiillilIil, (double)this.iiIililIil);
      }
   }

   private boolean Illillliilli(int i) {
      return i >= 0 && i < this.iIlllilIil.IliIlllilIi() && i != this.IlIililIil;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 29069) ^ var5) + 25077) - '\ufdef') + 22682) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] - 29069) ^ var5) + 25077) - '\ufdef') + 22682) << 13) - var5) - 21603) - var5))) - var5)) << 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 29069) ^ var5) + 25077) - '\ufdef') + 22682) >>> 3 | (char)((char)((char)((char)((char)(var4[var5] - 29069) ^ var5) + 25077) - '\ufdef') + 22682) << 13) - var5) - 21603) - var5))) - var5)) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiIiliIiiiIi(class_332 sy, int i, float planned, float ctx, boolean sx) {
      class_1799 var6 = this.lllllilIil[i];
      if (var6 != null && !var6.method_7960()) {
         Matrix3x2fStack var7 = sy.method_51448();
         var7.pushMatrix();

         try {
            if (sx) {
               var7.translate(planned + 6.0F, ctx + 6.0F);
               var7.scale(0.75F, 0.75F);
            } else {
               var7.translate(planned + 4.0F, ctx + 4.0F);
            }

            llllIIlilllIIl.IilliliilIIi(sy, var6, 0, 0);
         } finally {
            var7.popMatrix();
         }

      }
   }

   public boolean IiIlliIliiIl(double mx, double my) {
      return mx >= (double)this.IiIililIil && mx < (double)(this.IiIililIil + 32.0F) && my >= (double)this.liIililIil && my < (double)(this.liIililIil + this.iiIililIil);
   }

   public void IIIllIIliIIl(int i) {
      if (i >= 0 && i < this.illllilIil.length) {
         this.llillilIil.liiiIIllIl(this.illllilIil[i]);
      }

   }

   public boolean Iilililiiili() {
      return this.Illillliilli(this.lIIililIil) && (float)(System.nanoTime() - this.ilIililIil) / 1000000.0F > 150.0F;
   }

   public void IlIlllIlilIl() {
      this.lIIililIil = -1;
      this.iIIililIil = -1;
   }

   private void IIIilIIiiIIi(class_332 i, int ctx, iIIliiIiIlIliiIi e, double dt) {
      long var18 = 3739790976058147187L;
      long var20 = 8074093905577083614L;
      iIillIlIlillIl var6 = this.iIlllilIil.liiiIIllIl(ctx);
      ilIllIiIll var7 = var6.IilliliilIIi();
      var18 ^= ((long)var6.IliIlllilIi() << 32 ^ var18) & -1L << 32;
      var18 ^= ((long)(var7 != null && var7.IliIlllilIi() ? 1 : 0) ^ var18) & -1L >>> 32;
      if ((int)var18 != 0 && !this.IlillilIil[ctx]) {
         this.llillilIil.iIlIlllllill(this.IilllilIil[ctx]);
      }

      this.IlillilIil[ctx] = (boolean)((int)var18);
      this.lIillilIil[ctx] = iIIIlIlIIl(this.lIillilIil[ctx], (int)var18 != 0 ? 1.0F : 0.0F, (int)var18 != 0 ? (double)16.0F : (double)25.0F, dt);
      float var10 = this.IiIililIil + 4.0F;
      float var11 = (float)((double)(this.liIililIil + (float)this.IllllilIil.IilliliilIIi(ctx)) - this.IIIililIil);
      if (!(var11 > this.liIililIil + this.iiIililIil) && !(var11 + 24.0F < this.liIililIil)) {
         if (!(e.liilIIIlIi <= 0.002F)) {
            float var12 = 12.0F;
            float var13 = this.iilllilIil[ctx] * ((int)(var18 >>> 32) != 0 ? 0.6F : 1.0F);
            var20 ^= ((long)llilliilililliil.IlIlllIlilIl(i, var10 + var12, var11 + var12, e.iiilIIIlIi * this.llillilIil.IilliliilIIi(this.illllilIil[ctx], 0.07F)) << 32 ^ var20) & -1L << 32;
            float var15 = IliiIilliiIi.IilliliilIIi(e.liilIIIlIi);

            try {
               if ((int)(var18 >>> 32) == 0 && this.IIillilIil[ctx] < 0.999F) {
                  IIIiiIillIIiiIil.IlIlllIlilIl(i, var10, var11, 24.0F, 24.0F, 5.0F, llilliilililliil.IIIIllIIIl(-1, (float)(0.035 * (double)(1.0F - this.IIillilIil[ctx]))));
               }

               IIiIllIllIiIllIl.IilliliilIIi(i, var10, var11, 24.0F, 24.0F, 5.0F, (double)var13);
               if (this.lIillilIil[ctx] > 0.01F && var7 != null) {
                  this.IlIillIiilIi(i, ctx, var7, var10, var11, var13);
               }

               float var16 = (int)(var18 >>> 32) != 0 ? 0.0F : 1.0F * this.iilllilIil[ctx];
               this.IiIiliIiiiIi(i, ctx, var10, var11 - var16, (boolean)((int)(var18 >>> 32)));
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var15);
               llilliilililliil.IiIlliIliiIl(i, (boolean)((int)(var20 >>> 32)));
            }

         }
      }
   }

   public llIiliilIili iIlIlllllill() {
      return this.iIlllilIil;
   }

   public liiIIlIliiiIIlIl IilliliilIIi() {
      return this.IllllilIil;
   }

   public float IIiilIiiiIii() {
      return !this.Iilililiiili() ? 0.0F : llilliilililliil.liiiIIllIl(((float)(System.nanoTime() - this.ilIililIil) / 1000000.0F - 150.0F) / 120.0F);
   }

   private void Iiilliiliiil(class_332 entrance, int selected, iIIliiIiIlIliiIi dt, int base, double ctx) {
      long var18 = 6206982754302777920L;
      long var20 = -4378923385132121662L;
      if (selected >= 0 && selected < this.IllllilIil.IliIlllilIi()) {
         double var7 = (double)this.IllllilIil.IilliliilIIi(selected);
         if (!this.IiillilIil) {
            this.ilillilIil.liiiIIllIl(var7);
            this.IiillilIil = true;
         } else if (this.ilillilIil.iiIiIiIliIIliIiIli != var7 || this.ilillilIil.lIliIiIliiIliIiIli != (double)0.0F) {
            var18 ^= ((long)Math.max(1, (int)Math.ceil(ctx / 0.004166666666666667)) << 32 ^ var18) & -1L << 32;
            double var10 = ctx / (double)((int)(var18 >>> 32));

            for(long var26 = var18 ^ (0L ^ var18) & -1L >>> 32; (int)var26 < (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
               this.ilillilIil.IliIlllilIi(var7, (double)784.0F, (double)42.0F, var10);
            }

            if (Math.abs(this.ilillilIil.iiIiIiIliIIliIiIli - var7) < 0.04 && Math.abs(this.ilillilIil.lIliIiIliiIliIiIli) < (double)1.5F) {
               this.ilillilIil.liiiIIllIl(var7);
            }
         }

         float var9 = llilliilililliil.IliIlllilIi((float)Math.abs(this.ilillilIil.iiIiIiIliIIliIiIli - var7) / 27.0F);
         this.liillilIil = iIIIlIlIIl(this.liillilIil, 1.0F - 0.6F * var9, (double)22.0F, ctx);
         iIIliiIiIlIliiIi var24 = dt.lIiiIiIlilli(base + selected);
         if (!(var24.liilIIIlIi <= 0.002F)) {
            float var11 = this.IiIililIil + 4.0F;
            float var12 = llilliilililliil.IIIllIIliIIl((float)((double)this.liIililIil + this.ilillilIil.iiIiIiIliIIliIiIli - this.IIIililIil));
            float var13 = 12.0F;
            var20 ^= ((long)llilliilililliil.IlIlllIlilIl(entrance, var11 + var13, var12 + var13, var24.iiilIIIlIi * this.llillilIil.IilliliilIIi(this.illllilIil[selected], 0.07F)) << 32 ^ var20) & -1L << 32;
            float var15 = IliiIilliiIi.IilliliilIIi(var24.liilIIIlIi);

            try {
               IIiIllIllIiIllIl.iliIiiliiiii(entrance, var11, var12, 24.0F, 24.0F, 5.0F);
               float var16 = (float)Math.round(12.0F * this.liillilIil);
               IIiIllIllIiIllIl.IIIllIIliIIl(entrance, this.IiIililIil + 1.25F, var12 + (24.0F - var16) / 2.0F, var16, (double)1.0F);
            } finally {
               IliiIilliiIi.lIiiIiIlilli(var15);
               llilliilililliil.IiIlliIliiIl(entrance, (boolean)((int)(var20 >>> 32)));
            }

         }
      }
   }

   public boolean Iilllilliill(double amt) {
      if (!this.Illlllllilll()) {
         return false;
      } else {
         this.iiillilIil = IiIlIllliIlIll.IIiilIiiiIii(this.iiillilIil - amt * (double)27.0F, (double)this.IllllilIil.IIIllIIliIIl(), (double)this.iiIililIil);
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) + '퀷') ^ var5) - '렇') + var5) ^ var5) ^ var5) ^ var5) - var5) ^ var5) + var5) ^ var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ 22324) - '뤌'))) << 13 | (char)(~((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ 22324) - '뤌'))) >>> 3) + 'Ｉ') ^ '\udbc3') + var5) - '\ud9d2') + var5) + 2119));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_1799 liiiIIllIl(liIlIliiIlIl look) {
      try {
         return Iliilillliilil.iIlIlllllill(look);
      } catch (RuntimeException var2) {
         return class_1799.field_8037;
      }
   }

   private void IlIillIiilIi(class_332 sx, int hv, ilIllIiIll sy, float ctx, float i, float m) {
      long var17 = -2977270205083336596L;
      long var19 = 4417605424035495780L;
      long var21 = 3063270902214805087L;
      var17 ^= (-46221776614588416L ^ var17) & -1L << 32;
      if (sy instanceof IIiIliilIiIlii var8) {
         if (ilIiiillIiIiiill.liiiIIllIl(var8).liiiIIllIl() == liIIiilliiIIiill.iIlIiliill) {
            var17 ^= (-7520328821506048L ^ var17) & -1L << 32;
         }
      }

      float var25 = this.lIillilIil[hv] * this.llillilIil.IilliliilIIi(this.IilllilIil[hv], 0.0F);
      float var9 = ctx + 19.0F + 2.0F;
      float var10 = i + 19.0F + 2.0F;
      var17 ^= ((long)llilliilililliil.IlIlllIlilIl(sx, var9, var10, var25) ^ var17) & -1L >>> 32;

      try {
         if (!IilIIIIililIIIIi.liiiIIllIl()) {
            var19 ^= ((long)IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.iliIiiliiiii(), -1, 0.035 * (double)(1.0F - this.IIillilIil[hv])) << 32 ^ var19) & -1L << 32;
            var19 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)(var19 >>> 32), -1, 0.045 * (double)m) ^ var19) & -1L >>> 32;
            var21 ^= ((long)IilIIIIililIIIIi.Illlllllilll((int)var19, IilIIIIililIIIIi.Illlllllilll(IilIIIIililIIIIi.IiIlliIliiIl(), IlIIilIlllIIilIl.lliiIlliIl, 0.08), (double)this.IIillilIil[hv]) << 32 ^ var21) & -1L << 32;
            float var15 = 2.5F;
            IIIiiIillIIiiIil.IlIlllIlilIl(sx, var9 - var15, var10 - var15, 5.0F, 5.0F, var15, (int)(var21 >>> 32));
         }

         float var12 = 4.0F;
         float var13 = var12 / 2.0F;
         float var14 = (float)((Math.sin((double)System.nanoTime() / (double)1.0E9F * Math.PI * (double)2.0F / 1.6) + (double)1.0F) / (double)2.0F);
         IIIiiIillIIiiIil.IIlllIlliIll(sx, var9 - var13, var10 - var13, var12, var12, var13, llilliilililliil.IIIIllIIIl((int)(var17 >>> 32), 0.35F * var14 * this.lIillilIil[hv]), 2.5F, 0.85F);
         IIIiiIillIIiiIil.IlIlllIlilIl(sx, var9 - var13, var10 - var13, var12, var12, var13, (int)(var17 >>> 32));
      } finally {
         llilliilililliil.IiIlliIliiIl(sx, (boolean)((int)var17));
      }

   }

   public float Iiiiliiiiiii() {
      return this.lIIililIil >= 0 && this.lIIililIil < this.iIlllilIil.IliIlllilIi() ? llilliilililliil.IIIllIIliIIl(this.liIililIil + IiIlIllliIlIll.IIlllIlliIll(this.IllllilIil, this.lIIililIil, this.IIIililIil)) : Float.NaN;
   }

   public boolean Illlllllilll() {
      return (float)this.IllllilIil.IIIllIIliIIl() > this.iiIililIil;
   }

   private void IIlilIliiIli(class_332 entrance, iIIliiIiIlIliiIi ctx, int base) {
      long var8 = -8822518297447594739L;
      var8 ^= ((long)this.IllllilIil.iliIiiliiiii() << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) >= 0) {
         iIIliiIiIlIliiIi var5 = ctx.lIiiIiIlilli(base + this.IllllilIil.liiiIIllIl());
         if (!(var5.liilIIIlIi <= 0.002F)) {
            float var6 = IIIiiIillIIiiIil.Illlllllilll();
            float var7 = llilliilililliil.IIIllIIliIIl((float)((double)(this.liIililIil + (float)((int)(var8 >>> 32))) - this.IIIililIil));
            if (!(var7 < this.liIililIil) && !(var7 > this.liIililIil + this.iiIililIil)) {
               IIIiiIillIIiiIil.IilliliilIIi(entrance, this.IiIililIil + 8.0F, var7, 16.0F, var6, llilliilililliil.IIIIllIIIl(IilIIIIililIIIIi.IIillIiliIil(), var5.liilIIIlIi));
            }
         }
      }
   }

   public int IIlllIlliIll(double mx, double my) {
      return this.IiIlliIliiIl(mx, my) && !(mx < (double)(this.IiIililIil + 4.0F)) && !(mx >= (double)(this.IiIililIil + 4.0F + 24.0F)) ? this.IllllilIil.IiIlliIliiIl(my - (double)this.liIililIil, this.IIIililIil) : -1;
   }

   private static float iIIIlIlIIl(float v, float rate, double dt, double target) {
      float var6 = (float)IiiIIIIlliiIIIIl.iIlIlllllill((double)v, (double)rate, dt, target);
      return Math.abs(var6 - rate) < 0.002F ? rate : var6;
   }

   public float Iliilliiilii() {
      long var2 = 8625911734069240644L;
      var2 ^= ((long)this.lIIililIil << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) >= 0 && (int)(var2 >>> 32) < this.iIillilIil.length ? this.iIillilIil[(int)(var2 >>> 32)] : 0.0F;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) >>> 11 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) << 5) >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) >>> 11 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) << 5) << 4) >>> 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) >>> 11 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) << 5) >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) >>> 11 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16442) + 32048) ^ '\uf7c6') - 20073) ^ var5) ^ var5))) ^ 22455) << 5) << 4) << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
