package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiIllIilIIlllIil {
   private final int[] IililIlIil;
   private boolean iIiilIlIil;
   private final int illilIlIil;
   private int[] lililIlIil;
   public static final int iIlilIlIil = 24;
   private int lIiilIlIil = -1;
   public static final int lIlilIlIil = 6;
   private static final int[] IliilIlIil;
   private int iililIlIil;
   private int IIiilIlIil;
   public static final int IllilIlIil = 24;
   private static final boolean lllilIlIil;

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) >>> 8 | (char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) << 8))) << 5 | (char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) >>> 8 | (char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) << 8))) >>> 11) ^ 26451) + var5) >>> 13 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) >>> 8 | (char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) << 8))) << 5 | (char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) >>> 8 | (char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) << 10 | (char)(-var4[var5]) >>> 6))) + var5) + 17691))) ^ 26248) << 8))) >>> 11) ^ 26451) + var5) << 3) ^ '웬') + 9823) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(float color, float z, float x, float y, float v, int u) {
      long var9 = 8633943216420785350L;
      if (this.lIiilIlIil < 0) {
         this.iIlIlllllill(0);
      }

      if (this.iililIlIil + 6 > this.lililIlIil.length) {
         this.lIiiIiIlilli();
      }

      int[] var7 = this.lililIlIil;
      var9 ^= ((long)this.iililIlIil << 32 ^ var9) & -1L << 32;
      var7[(int)(var9 >>> 32)] = Float.floatToRawIntBits(color);
      var7[(int)(var9 >>> 32) + 1] = Float.floatToRawIntBits(z);
      var7[(int)(var9 >>> 32) + 2] = Float.floatToRawIntBits(x);
      var7[(int)(var9 >>> 32) + 3] = Float.floatToRawIntBits(y);
      var7[(int)(var9 >>> 32) + 4] = Float.floatToRawIntBits(v);
      var7[(int)(var9 >>> 32) + 5] = u;
      this.iililIlIil = (int)(var9 >>> 32) + 6;
      if (this.iililIlIil % 24 == 0) {
         ++this.IIiilIlIil;
      }

   }

   public int IIIllIIliIIl() {
      return this.illilIlIil;
   }

   public int IiIlliIliiIl() {
      return this.iililIlIil;
   }

   public void iliIiiliiiii() {
      if (!this.iIiilIlIil) {
         if (this.iililIlIil % 24 != 0) {
            throw new IllegalStateException(IIIilIIiiIIi<invokedynamic>());
         } else {
            while(this.lIiilIlIil < this.illilIlIil) {
               ++this.lIiilIlIil;
               this.IililIlIil[this.lIiilIlIil] = this.IIiilIlIil;
            }

            this.iIiilIlIil = true;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - '鰾') - var5) ^ var5))) + '삺') ^ var5) + 23021) ^ '핲'))) - var5) ^ var5) + 4835) - var5) ^ 23478) ^ '鐁'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1265576820852025890L ^ Long.rotateLeft(-5748180222104429772L, 36) ^ -5681257645991734014L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1844965494798466988L ^ Long.rotateLeft(-6005375738999138958L, 53) ^ -2140655745846325523L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8959607697654704042L ^ Long.rotateLeft(3850627225768756695L, 47) ^ 6537676298288787660L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7626388781194883398L ^ Long.rotateLeft(-9142873890517566429L, 43) ^ 4473359928033979848L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2936446767027849741L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8010749336924545639L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3235594208455574411L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2059948975402356120L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6972639543823828109L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2606097296057416345L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   private void lIiiIiIlilli() {
      long var1 = Math.max((long)this.lililIlIil.length + 24L, (long)this.lililIlIil.length * 2L);
      if (var1 > 2147483639L) {
         throw new IllegalStateException(IIIilIIiiIIi<invokedynamic>());
      } else {
         this.lililIlIil = Arrays.copyOf(this.lililIlIil, (int)var1);
      }
   }

   public int[] IIlllIlliIll() {
      return this.lililIlIil;
   }

   public iiIllIilIIlllIil(int initialQuads, int layers) {
      this.illilIlIil = Math.max(1, initialQuads);
      this.IililIlIil = new int[this.illilIlIil + 1];
      this.lililIlIil = new int[Math.max(1, layers) * 24];
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] >>> 14 | var4[var5] << 2))))) ^ var5) + var5) ^ '\uf3bf') ^ var5) ^ 26779))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl() {
      return this.IIiilIlIil;
   }

   public int Illlllllilll(int layer) {
      return this.IililIlIil[Math.max(0, Math.min(this.illilIlIil, layer))];
   }

   public int Iilllilliill(int layer) {
      return this.Illlllllilll(layer + 1);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) - var5) - var5) - var5))))) - var5) + var5) - 8285))))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iiilliiliiil() {
      this.lililIlIil = IliilIlIil;
      this.iililIlIil = 0;
   }

   public int IIillIiliIil(int lastLayer) {
      return lastLayer < 0 ? 0 : this.Illlllllilll(Math.min(this.illilIlIil - 1, lastLayer) + 1);
   }

   static {
      lllilIlIil = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
      IliilIlIil = new int[0];
   }

   public static int IliIlllilIi(int a, int r, int b, int g) {
      a &= 255;
      r &= 255;
      b &= 255;
      g &= 255;
      return lllilIlIil ? a | r << 8 | b << 16 | g << 24 : a << 24 | r << 16 | b << 8 | g;
   }

   public boolean Ililllililil() {
      return this.iIiilIlIil;
   }

   public static int liiiIIllIl(int rgb) {
      return IliIlllilIi(rgb >> 16, rgb >> 8, rgb, 255);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ 5502))) ^ var5)) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ 5502))) ^ var5)) << 4) + var5) ^ '꺬') + '띞') << 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ 5502))) ^ var5)) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ var5))) + var5) ^ 5502))) ^ var5)) << 4) + var5) ^ '꺬') + '띞') >>> 9) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(int k) {
      long var3 = -2970143202933039698L;
      if (this.iIiilIlIil) {
         throw new IllegalStateException(IIIilIIiiIIi<invokedynamic>());
      } else {
         var3 ^= ((long)Math.max(0, Math.min(this.illilIlIil - 1, k)) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) < this.lIiilIlIil) {
            throw new IllegalArgumentException(IIIilIIiiIIi<invokedynamic>() + (int)(var3 >>> 32) + IIIilIIiiIIi<invokedynamic>() + this.lIiilIlIil);
         } else {
            while(this.lIiilIlIil < (int)(var3 >>> 32)) {
               ++this.lIiilIlIil;
               this.IililIlIil[this.lIiilIlIil] = this.IIiilIlIil;
            }

         }
      }
   }
}
