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

public final class illiiliIiliili {
   private static final int lIiIIllIIl = 1024;
   private final int[] iIiIIllIIl = new int[1025];

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) << 3) + 20494) - var5) - 1986) ^ 16830) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) << 3) + 20494) - var5) - 1986) ^ 16830) >>> 13) ^ '씨') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) << 3) + 20494) - var5) - 1986) ^ 16830) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) >>> 13 | (char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 7 | (char)((char)(~var4[var5]) ^ var5) << 9) + var5) << 3) + 20494) - var5) - 1986) ^ 16830) >>> 13) ^ '씨') >>> 2))) + var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IliIlllilIi(float t) {
      long var4 = 1500130344575886131L;
      if (!(t > 0.0F)) {
         return this.iIiIIllIIl[0];
      } else if (t >= 1.0F) {
         return this.iIiIIllIIl[(-(-1347820604 * 128207979) * 1062196213 >>> 25 | -(-1347820604 * 128207979) * 1062196213 << 7) ^ 711464544];
      } else {
         float var2 = t * 1024.0F;
         var4 ^= ((long)((int)var2) << 32 ^ var4) & -1L << 32;
         return liIilIliiIilIl.Iillllilll(this.iIiIIllIIl[(int)(var4 >>> 32)], this.iIiIIllIIl[(int)(var4 >>> 32) + 1], var2 - (float)((int)(var4 >>> 32)));
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') << 10 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') >>> 6) - 17046))) - var5) >>> 9 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') << 10 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') >>> 6) - 17046))) - var5) << 7) ^ var5))))) >>> 12 | (char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') << 10 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') >>> 6) - 17046))) - var5) >>> 9 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') << 10 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] + 32624) << 13 | (char)(var4[var5] + 32624) >>> 3) ^ var5) + '\udb30') - var5))))) - 30885))) + 'Ꙋ') >>> 6) - 17046))) - var5) << 7) ^ var5))))) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   illiiliIiliili(float[] pos, int[] colors) {
      if (pos.length == colors.length && pos.length != 0) {
         float[][] var3 = new float[colors.length][];

         for(int var4 = 0; var4 < colors.length; ++var4) {
            var3[var4] = liIilIliiIilIl.liIlliiIll(colors[var4]);
         }

         for(int var10 = 0; var10 <= 1024; ++var10) {
            float var5 = (float)var10 / 1024.0F;

            int var6;
            for(var6 = 0; var6 < pos.length - 1 && var5 > pos[var6 + 1]; ++var6) {
            }

            if (var5 <= pos[0]) {
               this.iIiIIllIIl[var10] = colors[0] | -16777216;
            } else if (var6 >= pos.length - 1) {
               this.iIiIIllIIl[var10] = colors[pos.length - 1] | -16777216;
            } else {
               float var7 = (var5 - pos[var6]) / Math.max(1.0E-6F, pos[var6 + 1] - pos[var6]);
               var7 = var7 * var7 * (3.0F - 2.0F * var7) * 0.35F + var7 * 0.65F;
               float[] var8 = var3[var6];
               float[] var9 = var3[var6 + 1];
               this.iIiIIllIIl[var10] = liIilIliiIilIl.IIllllIlll(new float[]{liIilIliiIilIl.iIlIlllllill(var8[0], var9[0], var7), liIilIliiIilIl.iIlIlllllill(var8[1], var9[1], var7), liIilIliiIilIl.iIlIlllllill(var8[2], var9[2], var7)}, 255);
            }
         }

      } else {
         throw new IllegalArgumentException(liiiIIllIl<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) << 7) + 26936))) ^ var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) << 7) + 26936))) ^ var5) << 14) ^ var5))) + 10915) ^ var5) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) << 7) + 26936))) ^ var5) >>> 2 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) + var5) + var5) - var5) + var5) - var5) - '髡') ^ var5) << 7) + 26936))) ^ var5) << 14) ^ var5))) + 10915) ^ var5) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6931702582050405140L ^ Long.rotateLeft(-5173285880735430481L, 11) ^ 5767771260183279112L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5881415112915397657L ^ Long.rotateLeft(-6867154698088877931L, 25) ^ -4047435113025913692L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6295078385498331649L ^ Long.rotateLeft(6315289153853108479L, 12) ^ -4829854338810191019L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5789740801545768986L ^ Long.rotateLeft(3372748341902600654L, 57) ^ -2316360822217409206L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5263250988582872377L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2853475418029386052L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6774863723932630108L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -253149798565594805L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3829329864704254126L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -9117253955115602978L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIlIlllllill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IilliliilIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIiiIiIlilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iliIiiliiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIllIIliIIl<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) + var5))) ^ var5))) ^ var5) - '랼') - var5) - 10239) ^ var5) ^ 9157) + var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) + var5))) ^ var5))) ^ var5) - '랼') - var5) - 10239) ^ var5) ^ 9157) + var5) >>> 13))) ^ '趗') ^ 24144) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5) + '톎') + 19341) - '쑓') << 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) + var5) + '톎') + 19341) - '쑓') >>> 14) - 29302))))) ^ 12976) + var5))) - var5))) - 25477));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
