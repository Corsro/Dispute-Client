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
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_8881;

public final class IlIliIIlllIliIIl {
   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) - var5) >>> 12 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) - var5) << 4) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) - var5) >>> 12 | (char)((char)((char)(var4[var5] ^ var5) >>> 5 | (char)(var4[var5] ^ var5) << 11) - var5) << 4) << 8) + var5) + 3280) + var5) - 'ힱ'))) ^ 25651) + var5) - 5146) ^ '맩') + 25955));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static iIlIilIlIllIilIl IliIlllilIi() {
      try {
         return (iIlIilIlIllIilIl)llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
      } catch (Throwable var1) {
         return null;
      }
   }

   public static llIIIlIiilIIIlIi liiiIIllIl() {
      iIlIilIlIllIilIl var0 = IliIlllilIi();
      return var0 == null ? null : var0.iIIlIllIlIlIll();
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) ^ '\ud8a3') + var5))) >>> 8 | (char)(~((char)((char)((char)(var4[var5] + var5) ^ '\ud8a3') + var5))) << 8) ^ var5) + var5) ^ var5) + 1296) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) << 10 | (char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) >>> 6) << 14 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) << 10 | (char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) >>> 6) >>> 2) - var5) + '몗') >>> 10 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) << 10 | (char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) >>> 6) << 14 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) << 10 | (char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ var5) ^ '蠵') - '藳'))) - var5) ^ 30361))) >>> 6) >>> 2) - var5) + '몗') << 6) - var5) - var5) ^ 6771) + 1594));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int lIiiIiIlilli(class_8881 mask, int h) {
      long var8 = -3621762961645997214L;
      long var10 = -5500074535732012181L;
      long var12 = 4594851094826002418L;
      var8 ^= (0L ^ var8) & -1L << 32;
      int[] var3 = IiliIIllliliIIll.lIiiIiIlilli(IilliliilIIi(mask), h);
      var8 ^= ((long)var3.length ^ var8) & -1L >>> 32;

      for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < (int)var8; var10 += 4294967296L) {
         var10 ^= ((long)var3[(int)(var10 >>> 32)] ^ var10) & -1L >>> 32;
         var12 ^= ((long)(!IiliIIllliliIIll.IilliliilIIi(h, (int)var10) ? 1 : 0) << 32 ^ var12) & -1L << 32;
         iIlIilIlIllIilIl.lillIlliillIll(mask, (int)var10, (boolean)((int)(var12 >>> 32)));
         mask.method_54458((int)var10, (boolean)((int)(var12 >>> 32)));
         var8 += 4294967296L;
      }

      return (int)(var8 >>> 32);
   }

   public static void IIIllIIliIIl(class_8881 h) {
      long var5 = -5401255144095223696L;
      llIIIlIiilIIIlIi var1 = liiiIIllIl();
      if (var1 != null) {
         illiiIIlIiliiIIl var2 = var1.IIIllIIliIIl();
         class_310 var3 = class_310.method_1551();
         if (var2 == null) {
            var3.method_1507(new lIIIiiIiiIIIiiIi(var3.field_1755, var1, (Integer)null));
         } else {
            var5 ^= ((long)lIiiIiIlilli(h, var2.iIlIlllllill()) << 32 ^ var5) & -1L << 32;
            if (var3.field_1724 != null) {
               var3.field_1724.method_7353(class_2561.method_43470(IlIlllIlilIl<invokedynamic>() + var2.liiiIIllIl() + IlIlllIlilIl<invokedynamic>() + IiliIIllliliIIll.iliIiiliiiii(var2.iIlIlllllill()) + IlIlllIlilIl<invokedynamic>() + (int)(var5 >>> 32) + IlIlllIlilIl<invokedynamic>() + ((int)(var5 >>> 32) == 1 ? "" : IlIlllIlilIl<invokedynamic>()) + IlIlllIlilIl<invokedynamic>()), true);
            }

         }
      }
   }

   public static boolean iIlIlllllill() {
      return liiiIIllIl() != null;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) << 11 | (char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) >>> 5) >>> 3 | (char)((char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) << 11 | (char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) >>> 5) << 13) + var5))))))) ^ var5) - 576) >>> 7 | (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) << 11 | (char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) >>> 5) >>> 3 | (char)((char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) << 11 | (char)(-((char)(-((char)(-((char)((char)(~((char)((char)(-var4[var5]) + 'ꪸ'))) - var5))))))) >>> 5) << 13) + var5))))))) ^ var5) - 576) << 9) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7903293921177554486L ^ Long.rotateLeft(-2266803825540657104L, 9) ^ -3758971158918775247L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6206003845356514913L ^ Long.rotateLeft(-7444675197306031513L, 48) ^ -469566641047082872L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5829619478409753813L ^ Long.rotateLeft(3657926385086885560L, 13) ^ -8761867209268063766L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8998274541209683058L ^ Long.rotateLeft(4724853733235073162L, 47) ^ 3332502416436161905L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7184583383367529181L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7091867860543781125L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4773824852697201201L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1159223290672281214L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2434730218839422696L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8894485666263391050L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - '끃') << 6 | (char)(var4[var5] - '끃') >>> 10))) - '릗'))) ^ var5) - 'ꨱ') - var5))) + '\udb5e') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void iliIiiliiiii(class_8881 h) {
      llIIIlIiilIIIlIi var1 = liiiIIllIl();
      if (var1 != null) {
         class_310 var2 = class_310.method_1551();
         var2.method_1507(new lIIIiiIiiIIIiiIi(var2.field_1755, var1, IilliliilIIi(h)));
      }
   }

   public static int IilliliilIIi(class_8881 h) {
      long var3 = -6480808338120207257L;
      var3 ^= (0L ^ var3) & -1L << 32;

      for(var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < 9; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
         if (h.method_54461((int)var3)) {
            var3 ^= ((long)((int)(var3 >>> 32) | 1 << (int)var3) << 32 ^ var3) & -1L << 32;
         }
      }

      return (int)(var3 >>> 32);
   }

   private IlIliIIlllIliIIl() {
   }
}
