package gg.corz;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
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
import net.minecraft.class_276;
import net.minecraft.class_6367;

public final class lliliilili {
   private static boolean IIIlIlIllIIlIlIl;
   private static boolean liiIIlIliiiIIlIl;
   private static class_6367 IliIIlIllliIIlIl;
   public static final int iilIIlIlIIiIIlIl = 512;
   private static long iliIIlIlIiiIIlIl;
   private static final long lIiIIlIliIiIIlIl = 33000000L;

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10)))) + '蹥') - var5) + var5) ^ var5))) ^ var5))) - var5) ^ 2456) >>> 9 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10)))) + '蹥') - var5) + var5) ^ var5))) ^ var5))) - var5) ^ 2456) << 7) - var5)) + 'ﻩ'))) << 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10)))) + '蹥') - var5) + var5) ^ var5))) ^ var5))) - var5) ^ 2456) >>> 9 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 6 | var4[var5] << 10)))) + '蹥') - var5) + var5) ^ var5))) ^ var5))) - var5) ^ 2456) << 7) - var5)) + 'ﻩ'))) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lliliilili() {
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) << 10 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) >>> 6))) << 7 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) << 10 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) >>> 6))) >>> 9) >>> 12 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) << 10 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) >>> 6))) << 7 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) << 10 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) << 3 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) >>> 3 | (char)((char)((char)(var4[var5] ^ var5) ^ '\uddc7') ^ var5) << 13) ^ var5)))) - var5) - 18561) + var5))) >>> 13) >>> 6))) >>> 9) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(long now) {
      if (liiIIlIliiiIIlIl) {
         return false;
      } else {
         IiIliIllliIliIll var2 = IiIliIllliIliIll.iiiIlIIIll();
         if (var2 == null) {
            return false;
         } else {
            try {
               if (IliIIlIllliIIlIl == null) {
                  IliIIlIllliIIlIl = new class_6367(lIiiIiIlilli<invokedynamic>(), 512, 512, false);
                  IIIlIlIllIIlIlIl = false;
               }

               if (!IIIlIlIllIIlIlIl || now - iliIIlIlIiiIIlIl >= 33000000L) {
                  RenderSystem.getDevice().createCommandEncoder().clearColorTexture(IliIIlIllliIIlIl.method_30277(), -16777216);
                  IIIlIlIllIIlIlIl = var2.liilliiill(IliIIlIllliIIlIl.method_71639(), 512);
                  iliIIlIlIiiIIlIl = now;
               }

               return IIIlIlIllIIlIlIl;
            } catch (Throwable var4) {
               liiIIlIliiiIIlIl = true;
               IilliliilIIi();
               return false;
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) << 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) >>> 6) ^ 20259) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) << 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) >>> 6) ^ 20259) - var5) >>> 2) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) << 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) >>> 6) ^ 20259) - var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) << 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) + var5) ^ var5) + var5) - var5) >>> 6) ^ 20259) - var5) >>> 2) << 4) + 29279));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static GpuTextureView IliIlllilIi() {
      return IliIIlIllliIIlIl == null ? null : IliIIlIllliIIlIl.method_71639();
   }

   public static void IilliliilIIi() {
      if (IliIIlIllliIIlIl != null) {
         IliIIlIllliIIlIl.method_1238();
         IliIIlIllliIIlIl = null;
      }

      IIIlIlIllIIlIlIl = false;
   }

   public static class_276 liiiIIllIl() {
      return IIIlIlIllIIlIlIl ? IliIIlIllliIIlIl : null;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6353764197474277098L ^ Long.rotateLeft(-5183344701100578047L, 27) ^ 6582130246333167822L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5942613803938880802L ^ Long.rotateLeft(5698384043681151818L, 2) ^ 3027754518719550499L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1988469799867201597L ^ Long.rotateLeft(-5851553368228534371L, 24) ^ -6115665648897083421L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1103164438179497097L ^ Long.rotateLeft(5577355911733146977L, 16) ^ -8193177232599347983L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6363811280632373922L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4172281569677792583L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4738864839776725965L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1448157082546727345L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4990913614463016599L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5867775982702634800L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) >>> 12) + 23627) ^ var5))) ^ var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) >>> 12) + 23627) ^ var5))) ^ var5) << 9) + '뛝') - var5) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) >>> 12) + 23627) ^ var5))) ^ var5) >>> 7 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) << 4 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~var4[var5]))) + '萙') << 10 | (char)((char)(~((char)(~var4[var5]))) + '萙') >>> 6))) + var5) - var5) ^ '\uf549') - var5) >>> 12) + 23627) ^ var5))) ^ var5) << 9) + '뛝') - var5) << 11) - var5));
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
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) << 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) >>> 11) + var5) ^ var5) ^ var5) - var5) ^ 2638) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) << 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) >>> 11) + var5) ^ var5) ^ var5) - var5) ^ 2638) >>> 11))) ^ 19818) << 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) << 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) >>> 11) + var5) ^ var5) ^ var5) - var5) ^ 2638) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) << 5 | (char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 7964))) - var5) + '뮇') + 'ﻂ') + 23213) >>> 11) + var5) ^ var5) ^ var5) - var5) ^ 2638) >>> 11))) ^ 19818) >>> 14) + 7706))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
