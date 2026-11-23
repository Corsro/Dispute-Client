package gg.corz;

import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
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
import net.minecraft.class_1923;
import org.joml.Matrix4f;

public class lliIIiililiIIiil extends ilIllIiIll {
   private int Iiillillil = Integer.MIN_VALUE;
   private final iiIiiilIIliiil Illllillil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IIlllillil = 4096;
   private int iiillillil = -1;
   private final iilliIlIIiliIl Iilllillil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 8, 1, 32);
   private static final int ilIllillil = 16;
   private int lIIilillil;
   private static final int liIllillil = 8;
   private final iiIiiilIIliiil iilllillil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int iiIllillil = 4;
   private long[] lIillillil = new long[0];
   private boolean ilillillil = true;
   private final iilliIlIIiliIl iIlllillil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 16, 1, 32);
   private final iilliIlIIiliIl illllillil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 200, 0, 255);
   private final iiIiiilIIliiil lllllillil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int lIlllillil = 64;
   private int[] iIillillil = new int[0];
   private static final int IiIllillil = 256;
   private int liillillil = Integer.MIN_VALUE;
   private int IIIilillil;
   private int llillillil;
   private final LongOpenHashSet IIillillil = new LongOpenHashSet();
   private int[] Ilillillil = new int[0];
   private final iliiliilIiiiliil lilllillil = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -52686);

   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var1 = System.identityHashCode(Iiiilllliiilll.field_1687);
         if (var1 != this.lIIilillil) {
            this.lIIilillil = var1;
            this.iiiIlIIIll();
         }

         int var2 = Iiiilllliiilll.field_1724.method_31477() >> 4;
         int var3 = Iiiilllliiilll.field_1724.method_31479() >> 4;
         if (this.IIIilillil++ % 4 == 0) {
            int var4 = this.iIlllillil.Iilllilliill();

            for(iIiilIllIliilIll var6 : liilliIiiiilliIi.ilIiiliIIi.iIliiliIIi.values()) {
               if (Math.abs(var6.liIiIlilll - var2) <= var4 && Math.abs(var6.iiIiIlilll - var3) <= var4) {
                  long var7 = class_1923.method_8331(var6.liIiIlilll, var6.iiIiIlilll);
                  if (!this.IIillillil.contains(var7) && this.ilIllIiIll(var6)) {
                     this.IIillillil.add(var7);
                     this.ilillillil = true;
                     this.liIlliiIll(var6.liIiIlilll, var6.iiIiIlilll);
                  }
               }
            }

            if (this.IIillillil.size() > 4096) {
               this.lIIlliIIll(var2, var3);
            }
         }

         int var9 = this.Iilllillil.Iilllilliill();
         if (this.ilillillil || var2 != this.Iiillillil || var3 != this.liillillil || var9 != this.iiillillil) {
            this.IlIllllIll(var2, var3, var9);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) << 9) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) << 9) >>> 4) ^ var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) << 9) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + '왃') ^ var5) << 8 | (char)((char)(var4[var5] + '왃') ^ var5) >>> 8) + 25064) + 131) << 9) >>> 4) ^ var5) >>> 7) ^ var5) ^ var5) + 22159));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) << 5 | (char)((char)(-((char)(var4[var5] ^ var5))) - var5) >>> 11) + var5))) ^ var5) ^ '갭') + var5) + var5) ^ 17321) ^ var5))) ^ 17228) ^ var5) + '\ued9a') - 9941) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIlliiIll(int cz, int cx) {
      long var5 = -698728277398830211L;
      var5 ^= ((long)((cz << 4) + (~(-110436090 * 1483715975 - 11) ^ 1173362664)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)((cx << 4) + ((-1884310058 ^ 41) * 1749801491 - -105 - 53 ^ 884647977)) ^ var5) & -1L >>> 32;
      if (this.Illllillil.Iilllilliill()) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), String.format(IliIlllilIi<invokedynamic>(), cz, cx, (int)(var5 >>> 32), (int)var5), true);
      }

      if (this.lllllillil.Iilllilliill()) {
         IilIlllilIll.IliIlllilIi();
      }

   }

   private void lIIlliIIll(int px, int pz) {
      LongIterator var3 = this.IIillillil.iterator();

      while(var3.hasNext()) {
         long var4 = var3.nextLong();
         if (Math.abs(class_1923.method_8325(var4) - px) > 64 || Math.abs(class_1923.method_8332(var4) - pz) > 64) {
            var3.remove();
         }
      }

      this.ilillillil = true;
   }

   private void iiiIlIIIll() {
      this.IIillillil.clear();
      this.llillillil = 0;
      this.ilillillil = true;
      this.IIIilillil = 0;
   }

   private void IlIllllIll(int rd, int pz, int px) {
      this.ilillillil = false;
      this.Iiillillil = rd;
      this.liillillil = pz;
      this.iiillillil = px;
      if (this.lIillillil.length < this.IIillillil.size()) {
         this.lIillillil = new long[Math.max(16, this.IIillillil.size() * 2)];
      }

      int var4 = 0;
      LongIterator var5 = this.IIillillil.iterator();

      while(var5.hasNext()) {
         long var6 = var5.nextLong();
         int var8 = class_1923.method_8325(var6) - rd;
         int var9 = class_1923.method_8332(var6) - pz;
         if (Math.abs(var8) <= px && Math.abs(var9) <= px) {
            long var10 = (long)var8 * (long)var8 + (long)var9 * (long)var9;
            this.lIillillil[var4++] = var10 << 16 | (long)(var8 + px) << 8 | (long)(var9 + px);
         }
      }

      Arrays.sort(this.lIillillil, 0, var4);
      int var12 = Math.min(var4, 256);
      if (this.iIillillil.length < var12) {
         this.iIillillil = new int[var12];
         this.Ilillillil = new int[var12];
      }

      for(int var7 = 0; var7 < var12; ++var7) {
         this.iIillillil[var7] = rd + (int)(this.lIillillil[var7] >> 8 & 255L) - px;
         this.Ilillillil[var7] = pz + (int)(this.lIillillil[var7] & 255L) - px;
      }

      this.llillillil = var12;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) << 6 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) >>> 10))) ^ var5) + 882))) + var5) ^ var5) + 'ﻸ') ^ 20946) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) << 6 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) >>> 10))) ^ var5) + 882))) + var5) ^ var5) + 'ﻸ') ^ 20946) << 1) - var5) + 997) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) << 6 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) >>> 10))) ^ var5) + 882))) + var5) ^ var5) + 'ﻸ') ^ 20946) >>> 15 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) << 6 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uefd5') << 10 | (char)((char)(var4[var5] ^ var5) ^ '\uefd5') >>> 6) >>> 10))) ^ var5) + 882))) + var5) ^ var5) + 'ﻸ') ^ 20946) << 1) - var5) + 997) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(~((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) >>> 15 | (char)((char)(-((char)(var4[var5] + var5))) - var5) << 1))) << 1 | (char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) >>> 15 | (char)((char)(-((char)(var4[var5] + var5))) - var5) << 1))) >>> 15) + '鍨') ^ var5))))) - var5))))) << 8 | (char)(~((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) >>> 15 | (char)((char)(-((char)(var4[var5] + var5))) - var5) << 1))) << 1 | (char)(-((char)((char)((char)(-((char)(var4[var5] + var5))) - var5) >>> 15 | (char)((char)(-((char)(var4[var5] + var5))) - var5) << 1))) >>> 15) + '鍨') ^ var5))))) - var5))))) >>> 8))))))) + 'ꞇ') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.llillillil != 0 && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var2 = Math.max(20, Math.min(255, this.illllillil.Iilllilliill()));
         int var3 = Math.max(5, var2 / 6);
         int var4 = this.lilllillil.Iilllilliill();
         int var5 = var4 >> 16 & 255;
         int var6 = var4 >> 8 & 255;
         int var7 = var4 & 255;
         int var8 = var2 << 24 | var5 << 16 | var6 << 8 | var7;
         float var9 = (float)var5 / 255.0F;
         float var10 = (float)var6 / 255.0F;
         float var11 = (float)var7 / 255.0F;
         float var12 = (float)var3 / 255.0F;
         boolean var13 = this.iilllillil.Iilllilliill();
         Matrix4f var14 = iIiiIIilIliiIIil.IIillIiliIil();
         float var15 = iIiiIIilIliiIIil.Iiilliiliiil((double)59.0F);
         float var16 = iIiiIIilIliiIIil.Iiilliiliiil((double)61.0F);
         int var17 = this.llillillil;

         for(int var18 = 0; var18 < var17; ++var18) {
            double var19 = (double)this.iIillillil[var18] * (double)16.0F;
            double var21 = (double)this.Ilillillil[var18] * (double)16.0F;
            if (!iIiiIIilIliiIIil.IlIillIiilIi(var19 + (double)8.0F, (double)60.0F, var21 + (double)8.0F, 12.0F)) {
               float var23 = iIiiIIilIliiIIil.Ililllililil(var19);
               float var24 = iIiiIIilIliiIIil.IIIilIIiiIIi(var21);
               iIiiIIilIliiIIil.IIlilIliiIli(var14, var23, var15, var24, var23 + 16.0F, var16, var24 + 16.0F, var9, var10, var11, var12);
               iIiiIIilIliiIIil.iIIIlIlIIl(var14, var23, var15, var24, var23 + 16.0F, var16, var24 + 16.0F, var8, 2.0F);
            }

            if (var13 && var18 < 8) {
               Iillllilll.Iilllilliill(var19 + (double)8.0F, (double)60.0F, var21 + (double)8.0F, var4, false);
            }
         }

         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5504288695775131540L ^ Long.rotateLeft(-4056830983927642984L, 54) ^ -701329564429925457L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2056545654652041636L ^ Long.rotateLeft(2143004625828236503L, 8) ^ -3029656865419570990L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2748247569943466501L ^ Long.rotateLeft(-5752923546656778337L, 56) ^ -7524871953989299971L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3507779468933421595L ^ Long.rotateLeft(3799270301436708378L, 20) ^ -1046033531820795219L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3371907611753540549L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2625820721638006114L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1570796827170155580L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5134557198986490329L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5014012626844311878L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1479996063762670775L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   public lliIIiililiIIiil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIlllillil, this.Illllillil, this.lllllillil, this.illllillil, this.Iilllillil, this.lilllillil, this.iilllillil});
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) << 8 | (char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) >>> 8) >>> 4 | (char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) << 8 | (char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) >>> 8) << 12) >>> 2 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) << 8 | (char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) >>> 8) >>> 4 | (char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) << 8 | (char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) >>> 8 | (char)(~((char)((char)(-((char)(var4[var5] ^ var5))) + var5))) << 8) + 5586))) >>> 8) << 12) << 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean ilIllIiIll(iIiilIllIliilIll snap) {
      for(int var2 = 1; var2 <= snap.IIliIlilll; ++var2) {
         int var3 = (snap.lIliIlilll + (var2 - 1)) * 16;
         if (var3 >= 16) {
            break;
         }

         if (snap.iIliIlilll[var2] == lilIlIiiilIlIi.IlIlIlIiillIlIlIii) {
            return true;
         }
      }

      return false;
   }

   public int IIllllIlll() {
      return this.IIillillil.size();
   }
}
