package gg.corz;

import com.mojang.blaze3d.systems.RenderSystem;
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
import net.minecraft.class_310;
import net.minecraft.class_6367;

public final class lIllIiiIllIi {
   private static boolean IllllIIIllllllIIIl;
   private static class_276 lIlllIIIliIlllIIIl;
   private static class_6367 iiIllIIIlIIlllIIIl;
   private static boolean illllIIIlIilllIIIl;
   private static class_6367 IiIllIIIlliIllIIIl;

   static boolean iliIiiliiiii() {
      if (IllllIIIllllllIIIl && lIlllIIIliIlllIIIl == IiIllIIIlliIllIIIl) {
         iiIllIIIlIIlllIIIl = IiIlliIliiIl(iiIllIIIlIIlllIIIl, IIlllIlliIll<invokedynamic>(), IiIllIIIlliIllIIIl.field_1482, IiIllIIIlliIllIIIl.field_1481);
         if (!illllIIIlIilllIIIl) {
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(iiIllIIIlIIlllIIIl.method_30277(), 0, iiIllIIIlIIlllIIIl.method_30278(), (double)1.0F);
            illllIIIlIilllIIIl = true;
         }

         lIlllIIIliIlllIIIl = iiIllIIIlIIlllIIIl;
         return true;
      } else {
         return false;
      }
   }

   private lIllIiiIllIi() {
   }

   public static void iIlIlllllill() {
      long var4 = -4476424161628094604L;
      if (!IllllIIIllllllIIIl && !iIIlIllIlIlIll.IliIlllilIi()) {
         try {
            if (!iIIlIllIlIlIll.liIlliiIll()) {
               return;
            }

            class_310 var0 = class_310.method_1551();
            class_276 var1 = var0.method_1522();
            var4 ^= ((long)var1.field_1482 << 32 ^ var4) & -1L << 32;
            var4 ^= ((long)var1.field_1481 ^ var4) & -1L >>> 32;
            if ((int)(var4 >>> 32) <= 0 || (int)var4 <= 0 || var1.method_30277() == null) {
               return;
            }

            if ((int)(var4 >>> 32) != var0.method_22683().method_4489() || (int)var4 != var0.method_22683().method_4506()) {
               return;
            }

            IiIllIIIlliIllIIIl = IiIlliIliiIl(IiIllIIIlliIllIIIl, IIlllIlliIll<invokedynamic>(), (int)(var4 >>> 32), (int)var4);
            RenderSystem.getDevice().createCommandEncoder().clearColorAndDepthTextures(IiIllIIIlliIllIIIl.method_30277(), 0, IiIllIIIlliIllIIIl.method_30278(), (double)1.0F);
            illllIIIlIilllIIIl = false;
            iIIlIllIlIlIll.lIilliIill();
            lIlllIIIliIlllIIIl = IiIllIIIlliIllIIIl;
            IllllIIIllllllIIIl = true;
         } catch (Throwable var6) {
            iIIlIllIlIlIll.lliIliliIl(IIlllIlliIll<invokedynamic>(), var6);
         }

      }
   }

   public static class_276 IliIlllilIi() {
      return lIlllIIIliIlllIIIl;
   }

   private static class_6367 IiIlliIliiIl(class_6367 name, String w, int h, int fb) {
      if (name == null) {
         return new class_6367(w, h, fb, true);
      } else {
         if (name.field_1482 != h || name.field_1481 != fb) {
            name.method_1234(h, fb);
         }

         return name;
      }
   }

   public static void lIiiIiIlilli() {
      IllllIIIllllllIIIl = false;
      lIlllIIIliIlllIIIl = null;
   }

   public static void IlIlllIlilIl() {
      if (!IllllIIIllllllIIIl) {
         if (IiIllIIIlliIllIIIl != null) {
            IiIllIIIlliIllIIIl.method_1238();
            IiIllIIIlliIllIIIl = null;
         }

         if (iiIllIIIlIIlllIIIl != null) {
            iiIllIIIlIIlllIIIl.method_1238();
            iiIllIIIlIIlllIIIl = null;
         }

      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) + 25909) - 32027) << 12 | (char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) + 25909) - 32027) >>> 4) + var5) + '鶴') ^ var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) + 25909) - 32027) << 12 | (char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) + 25909) - 32027) >>> 4) + var5) + '鶴') ^ var5) >>> 4) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl() {
      return IllllIIIllllllIIIl;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) + var5) ^ 31780) + var5) ^ 5074))) + var5) ^ '\uf4d5'))) + '\ue074'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static void IIIllIIliIIl() {
      if (IllllIIIllllllIIIl && lIlllIIIliIlllIIIl == iiIllIIIlIIlllIIIl) {
         lIlllIIIliIlllIIIl = IiIllIIIlliIllIIIl;
      }

   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4990111404247482434L ^ Long.rotateLeft(-8558790739962308761L, 10) ^ 2716333594750065743L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7280809127880998890L ^ Long.rotateLeft(1734202853562451985L, 54) ^ -3466372761919728974L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3142784630164486524L ^ Long.rotateLeft(-6216757744326839894L, 18) ^ 305647420812109977L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8186392633184038035L ^ Long.rotateLeft(5038905517719175299L, 19) ^ -7492521632363893764L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8003727085493030241L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4595187620301194078L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4128639309523812754L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8535035256580699228L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6075095085245498693L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4368630545832784313L;
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) ^ '鎣') - 29518) >>> 1 | (char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) ^ '鎣') - 29518) << 15) + '胋') - 25979) + 26373) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) ^ '鎣') - 29518) >>> 1 | (char)((char)((char)(-((char)(var4[var5] >>> 6 | var4[var5] << 10))) ^ '鎣') - 29518) << 15) + '胋') - 25979) + 26373) >>> 5) + '螲') + 26080) + '\ued8e') ^ 24123) ^ var5) - '턃'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) >>> 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) << 2) - var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) >>> 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) << 2) - var5) >>> 8) - 13327) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) >>> 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) << 2) - var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) >>> 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) >>> 7 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) << 8 | (char)(-((char)((char)(var4[var5] + var5) ^ '츞'))) >>> 8) - 2871))) - var5) ^ var5) << 9) - 4447) << 2) - var5) >>> 8) - 13327) >>> 10) - 16705) ^ '𤋮') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void IilliliilIIi() {
      if (IllllIIIllllllIIIl) {
         IllllIIIllllllIIIl = false;
         lIlllIIIliIlllIIIl = null;

         try {
            iIIlIllIlIlIll.IiIilliIil(IiIllIIIlliIllIIIl, illllIIIlIilllIIIl ? iiIllIIIlIIlllIIIl : null);
         } catch (Throwable var1) {
            iIIlIllIlIlIll.lliIliliIl(IIlllIlliIll<invokedynamic>(), var1);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) >>> 1) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) >>> 1) >>> 9) + 15829))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) >>> 1) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + 'ꖣ') + var5) - '锇') ^ var5) - var5) ^ var5) >>> 1) >>> 9) + 15829))) << 7) + 13475) - 6979) - '음') + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
