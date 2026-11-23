package gg.corz;

import java.io.IOException;
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

public record illIIIliIilIIIli(short[] samples, int channels, int rate) {
   private final short[] IIIlIlIlIi;
   static final double IlIlIlIlIi = (double)3.0F;
   private final int iIIlIlIlIi;
   private final int lIIlIlIlIi;

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) >>> 8 | (char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) << 8) ^ '섔') ^ '銝'))) + var5) + '찁') - var5) - var5) + '茸') - '킰') << 3 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) >>> 8 | (char)((char)(var4[var5] - var5) >>> 11 | (char)(var4[var5] - var5) << 5) << 8) ^ '섔') ^ '銝'))) + var5) + '찁') - var5) - var5) + '茸') - '킰') >>> 13) ^ 18361) - '펺'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.lIIlIlIlIi;
   }

   public illIIIliIilIIIli iIlIlllllill(int startMs, int lengthMs) {
      long var8 = -7259240782879665966L;
      long var10 = -6605744410543021638L;
      var8 ^= ((long)this.IliIlllilIi() << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)lIiiIiIlilli((int)Math.round((double)startMs * (double)this.iIIlIlIlIi / Double.longBitsToDouble(20679771829272167L ^ 4667479793601314407L)), (int)(var8 >>> 32)) ^ var8) & -1L >>> 32;
      var10 ^= ((long)lIiiIiIlilli((int)var8 + (int)Math.round((double)lengthMs * (double)this.iIIlIlIlIi / Double.longBitsToDouble(-933405540454627745L ^ -5511103455444203937L)), (int)(var8 >>> 32)) << 32 ^ var10) & -1L << 32;
      short[] var6 = new short[((int)(var10 >>> 32) - (int)var8) * this.lIIlIlIlIi];
      System.arraycopy(this.IIIlIlIlIi, (int)var8 * this.lIIlIlIlIi, var6, 0, var6.length);
      illIIIliIilIIIli var7 = new illIIIliIilIIIli(var6, this.lIIlIlIlIi, this.iIIlIlIlIi);
      var7.IilliliilIIi();
      return var7;
   }

   public int Iilllilliill() {
      return this.iIIlIlIlIi;
   }

   private static short[] iliIiiliiiii(byte[] size, int off, int d, int bits) {
      switch (bits) {
         case 8:
            short[] var7 = new short[d];

            for(int var9 = 0; var9 < d; ++var9) {
               var7[var9] = (short)((size[off + var9] & 255) - 128 << 8);
            }

            return var7;
         case 16:
            short[] var6 = new short[d / 2];

            for(int var8 = 0; var8 < var6.length; ++var8) {
               var6[var8] = (short)IlIlllIlilIl(size, off + var8 * 2);
            }

            return var6;
         case 24:
            short[] var4 = new short[d / 3];

            for(int var5 = 0; var5 < var4.length; ++var5) {
               var4[var5] = (short)(size[off + var5 * 3 + 1] & 255 | size[off + var5 * 3 + 2] << 8);
            }

            return var4;
         default:
            throw new IOException(IIillIiliIil<invokedynamic>() + bits);
      }
   }

   private static int IlIlllIlilIl(byte[] d, int off) {
      return d[off] & (-1382430663 + 39 + 3 ^ -1382430564) | (d[off + 1] & ((1211367173 + 69) * 21 * 1084587701 ^ 1565150533)) << (--935070496 * 1227133513 + -83 ^ -747148347);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) >>> 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) >>> 6) << 12) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) >>> 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + 5346) ^ var5) ^ '\ue957') ^ var5) ^ '\uf389') - var5) ^ var5) - 21786) + var5) >>> 6) << 12) << 9) + '뽷'))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IliIlllilIi() {
      return this.lIIlIlIlIi <= 0 ? 0 : this.IIIlIlIlIi.length / this.lIIlIlIlIi;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7894450479220642765L ^ Long.rotateLeft(-8295716329927603398L, 3) ^ 1002138994848389613L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7039879899790636433L ^ Long.rotateLeft(4462727878049597298L, 19) ^ 7862340832008457069L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 327917897547358573L ^ Long.rotateLeft(6620843973894420880L, 57) ^ -3459041874181832038L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -104067227081072760L ^ Long.rotateLeft(8684846001649710174L, 39) ^ 5072182801953402689L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4836710364910342270L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1742596354791769747L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7294520718316756426L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7391559779557430208L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8524389806984951512L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2097248496769560967L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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

   public short[] IIlllIlliIll() {
      return this.IIIlIlIlIi;
   }

   void IilliliilIIi() {
      int var1 = this.IliIlllilIi();
      int var2 = Math.min(var1, (int)Math.round((double)3.0F * (double)this.iIIlIlIlIi / (double)1000.0F));

      for(int var3 = 0; var3 < var2; ++var3) {
         int var4 = var1 - var2 + var3;
         double var5 = (double)(var2 - 1 - var3) / (double)var2;

         for(int var7 = 0; var7 < this.lIIlIlIlIi; ++var7) {
            int var8 = var4 * this.lIIlIlIlIi + var7;
            this.IIIlIlIlIi[var8] = (short)((int)Math.round((double)this.IIIlIlIlIi[var8] * var5));
         }
      }

   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(-var4[var5]))) >>> 2 | (char)(~((char)(-var4[var5]))) << 14))) + var5))) + 16537) - var5) - var5) << 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)(-var4[var5]))) >>> 2 | (char)(~((char)(-var4[var5]))) << 14))) + var5))) + 16537) - var5) - var5) >>> 2) ^ '됁') - var5) + var5) + '죋'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int lIiiIiIlilli(int max, int v) {
      return Math.max(0, Math.min(v, max));
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 12957) << 5 | (char)(var4[var5] - 12957) >>> 11) - var5) + '뿫') >>> 8 | (char)((char)((char)((char)(var4[var5] - 12957) << 5 | (char)(var4[var5] - 12957) >>> 11) - var5) + '뿫') << 8) - var5) >>> 3 | (char)((char)((char)((char)((char)((char)(var4[var5] - 12957) << 5 | (char)(var4[var5] - 12957) >>> 11) - var5) + '뿫') >>> 8 | (char)((char)((char)((char)(var4[var5] - 12957) << 5 | (char)(var4[var5] - 12957) >>> 11) - var5) + '뿫') << 8) - var5) << 13) - '쨥') - '\ua9ff'))) + var5))) ^ var5) ^ 26051) - '\udeae') ^ var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ 30099) - '\uecfb'))) ^ 15936))) << 2 | (char)(~((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) ^ 30099) - '\uecfb'))) ^ 15936))) >>> 14) + var5) ^ 13541) ^ 20528) - '\ued03'))) + 6279) + 726));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IiIlliIliiIl(byte[] d, int off) {
      return d[off] & (((1788447713 >>> 9 | 1788447713 << 23) + -95 - 73 << 27 | (1788447713 >>> 9 | 1788447713 << 23) + -95 - 73 >>> 5) ^ -276452705) | (d[off + 1] & (~(1344587305 + 57) ^ -1344587422)) << (~(-1806502569 << 5 | -1806502569 >>> 27) + 113 ^ 1973507446) | (d[off + 2] & ((934821112 ^ -105) * -630453915 * -63 ^ -1035825164)) << ((~839607458 ^ -99) + 13 ^ 839607517) | (d[off + 3] & ((-1003608032 >>> 27 | -1003608032 << 5) + -45 ^ -2050686188)) << (-(-(-1110014455 ^ -87)) * 43 ^ 485977592);
   }

   public illIIIliIilIIIli(short[] samples, int channels, int rate) {
      this.IIIlIlIlIi = samples;
      this.lIIlIlIlIi = channels;
      this.iIIlIlIlIi = rate;
   }

   public static illIIIliIilIIIli liiiIIllIl(byte[] data) {
      if (data.length >= 12 && IIIllIIliIIl(data, 0, IIillIiliIil<invokedynamic>()) && IIIllIIliIIl(data, 8, IIillIiliIil<invokedynamic>())) {
         int var1 = 0;
         int var2 = 0;
         int var3 = 0;
         int var4 = 0;

         int var6;
         int var7;
         for(int var5 = 12; var5 + 8 <= data.length; var5 = var7 + var6 + (var6 & 1)) {
            var6 = IiIlliIliiIl(data, var5 + 4);
            var7 = var5 + 8;
            if (var6 < 0 || var7 + var6 > data.length) {
               var6 = data.length - var7;
            }

            if (IIIllIIliIIl(data, var5, IIillIiliIil<invokedynamic>()) && var6 >= 16) {
               var4 = IlIlllIlilIl(data, var7);
               var1 = IlIlllIlilIl(data, var7 + 2);
               var2 = IiIlliIliiIl(data, var7 + 4);
               var3 = IlIlllIlilIl(data, var7 + 14);
               if (var4 == 65534 && var6 >= 26) {
                  var4 = IlIlllIlilIl(data, var7 + 24);
               }
            } else if (IIIllIIliIIl(data, var5, IIillIiliIil<invokedynamic>())) {
               if (var4 != 1) {
                  throw new IOException(IIillIiliIil<invokedynamic>() + var4 + IIillIiliIil<invokedynamic>());
               }

               if (var1 >= 1 && var1 <= 2 && var2 > 0) {
                  return new illIIIliIilIIIli(iliIiiliiiii(data, var7, var6, var3), var1, var2);
               }

               throw new IOException(IIillIiliIil<invokedynamic>());
            }
         }

         throw new IOException(IIillIiliIil<invokedynamic>());
      } else {
         throw new IOException(IIillIiliIil<invokedynamic>());
      }
   }

   private static boolean IIIllIIliIIl(byte[] t, int off, String d) {
      if (off + 4 > t.length) {
         return false;
      } else {
         for(int var3 = 0; var3 < 4; ++var3) {
            if (t[off + var3] != d.charAt(var3)) {
               return false;
            }
         }

         return true;
      }
   }
}
