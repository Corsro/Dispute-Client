package gg.corz;

import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.lwjgl.stb.STBVorbis;
import org.lwjgl.stb.STBVorbisAlloc;
import org.lwjgl.stb.STBVorbisInfo;
import org.lwjgl.system.MemoryUtil;

final class ilIliilIiIliil {
   private ilIliilIiIliil() {
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ 25831) << 6 | (char)((char)(var4[var5] << 12 | var4[var5] >>> 4) ^ 25831) >>> 10))) ^ 'ﻆ'))) + var5) + '쀅') ^ '삎') ^ 22424) - '\uea47'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static illIIIliIilIIIli IliIlllilIi(byte[] data) {
      ByteBuffer var1 = MemoryUtil.memAlloc(data.length);

      illIIIliIilIIIli var26;
      try {
         var1.put(data).flip();
         int[] var2 = new int[1];
         long var3 = STBVorbis.stb_vorbis_open_memory(var1, var2, (STBVorbisAlloc)null);
         if (var3 == 0L) {
            throw new IOException(liiiIIllIl<invokedynamic>() + var2[0]);
         }

         try {
            STBVorbisInfo var7 = STBVorbisInfo.malloc();

            int var5;
            int var6;
            try {
               STBVorbis.stb_vorbis_get_info(var3, var7);
               var5 = var7.channels();
               var6 = var7.sample_rate();
            } catch (Throwable var22) {
               if (var7 != null) {
                  try {
                     var7.close();
                  } catch (Throwable var21) {
                     var22.addSuppressed(var21);
                  }
               }

               throw var22;
            }

            if (var7 != null) {
               var7.close();
            }

            if (var5 < 1 || var5 > 2 || var6 <= 0) {
               throw new IOException(liiiIIllIl<invokedynamic>());
            }

            int var25 = STBVorbis.stb_vorbis_stream_length_in_samples(var3);
            if (var25 <= 0) {
               throw new IOException(liiiIIllIl<invokedynamic>());
            }

            short[] var8 = new short[var25 * var5];
            int var9 = STBVorbis.stb_vorbis_get_samples_short_interleaved(var3, var5, var8);
            if (var9 < var25) {
               short[] var10 = new short[Math.max(0, var9) * var5];
               System.arraycopy(var8, 0, var10, 0, var10.length);
               var8 = var10;
            }

            var26 = new illIIIliIilIIIli(var8, var5, var6);
         } finally {
            STBVorbis.stb_vorbis_close(var3);
         }
      } finally {
         MemoryUtil.memFree(var1);
      }

      return var26;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ var5))))) - var5))) ^ 19547) - 30783) - '\udc85') - var5) ^ var5) - 'ﳰ') - var5))))) ^ var5) << 11 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ var5))))) - var5))) ^ 19547) - 30783) - '\udc85') - var5) ^ var5) - 'ﳰ') - var5))))) ^ var5) >>> 5) + '쪘'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + 13689) - var5))) + 12512))) ^ 20267) + var5))) - var5) - var5) + '荍') + var5) - 14906) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + 13689) - var5))) + 12512))) ^ 20267) + var5))) - var5) - var5) + '荍') + var5) - 14906) >>> 12) + var5) + var5)) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + 13689) - var5))) + 12512))) ^ 20267) + var5))) - var5) - var5) + '荍') + var5) - 14906) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + 13689) - var5))) + 12512))) ^ 20267) + var5))) - var5) - var5) + '荍') + var5) - 14906) >>> 12) + var5) + var5)) << 13) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + 8211) + var5) ^ var5) - 11074))) ^ var5) ^ var5) + 26831) ^ 4443) - var5) - 12985))) << 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + 8211) + var5) ^ var5) - 11074))) ^ var5) ^ var5) + 26831) ^ 4443) - var5) - 12985))) >>> 2) + '鮢') ^ var5) - '\ueb67'));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) << 14 | (char)((char)((char)(~var4[var5]) ^ var5) ^ var5) >>> 2) - '\ue541'))) >>> 13 | (char)(~((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) << 14 | (char)((char)((char)(~var4[var5]) ^ var5) ^ var5) >>> 2) - '\ue541'))) << 3))) ^ 12419) ^ var5) >>> 1 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) << 14 | (char)((char)((char)(~var4[var5]) ^ var5) ^ var5) >>> 2) - '\ue541'))) >>> 13 | (char)(~((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) << 14 | (char)((char)((char)(~var4[var5]) ^ var5) ^ var5) >>> 2) - '\ue541'))) << 3))) ^ 12419) ^ var5) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7370980468960254723L ^ Long.rotateLeft(3938427751405446325L, 28) ^ -8621590142708545135L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1332254607219927105L ^ Long.rotateLeft(-3166799266001887360L, 59) ^ -3412917120319413860L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7271046179796127017L ^ Long.rotateLeft(8205917668655458378L, 28) ^ 587716039222388979L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6958874693339258723L ^ Long.rotateLeft(-3101315395352520813L, 37) ^ -8634754573804130119L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2871191353359270228L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -846846917326515199L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6649953454023415699L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2979076026139997769L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2967616695388234844L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1997632222627052791L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iliIiiliiiii<invokedynamic>());
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
}
