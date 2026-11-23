package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3726;
import net.minecraft.class_3965;
import net.minecraft.class_4969;
import net.minecraft.class_7923;

public final class lliiIliliiIl {
   public static boolean IiIiliIiiiIi(class_2338 radius, double pos) {
      class_238 var3 = (new class_238(radius)).method_1014(pos);

      for(class_1297 var5 : IliIlllilIi().field_1687.method_8335((class_1297)null, var3)) {
         if (var5 instanceof class_1542 var6) {
            class_1799 var7 = var6.method_6983();
            if (!var7.method_7960()) {
               if (var7.method_31574(class_1802.field_8626)) {
                  return true;
               }

               String var8 = class_7923.field_41178.method_10221(var7.method_7909()).method_12832();
               if (var8.contains(Iilililiiili<invokedynamic>()) || var8.contains(Iilililiiili<invokedynamic>()) || var8.contains(Iilililiiili<invokedynamic>()) || var8.contains(Iilililiiili<invokedynamic>()) || var8.contains(Iilililiiili<invokedynamic>())) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static double[] Illillliilli(class_243 look) {
      return new double[]{look.field_1352, look.field_1351, look.field_1350};
   }

   public static boolean Iilllilliill(class_3965 eye, class_243 hit, double reach) {
      return eye != null && IiilIllliilIll.IIIilIIiiIIi(IIlilIliiIli(hit, eye.method_17777()), IIIilIIiiIIi(eye.method_17780()), reach);
   }

   public static lIIliiiliIIliiil IlIlllIlilIl(class_2338 supportOk, class_238 anchor, Predicate<class_2338> selfBox, class_2680 coverState) {
      long var10 = 6477873794392044520L;
      double[] var4 = new double[]{anchor.field_1323 - (double)supportOk.method_10263(), anchor.field_1322 - (double)supportOk.method_10264(), anchor.field_1321 - (double)supportOk.method_10260(), anchor.field_1320 - (double)supportOk.method_10263(), anchor.field_1325 - (double)supportOk.method_10264(), anchor.field_1324 - (double)supportOk.method_10260()};
      var10 ^= ((long)IiilIllliilIll.lIIllIliliIIllIlil.length << 32 ^ var10) & -1L << 32;
      boolean[] var6 = new boolean[(int)(var10 >>> 32)];
      boolean[] var7 = new boolean[(int)(var10 >>> 32)];

      for(long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         class_2338 var9 = IIIllIIliIIl(supportOk, (int)var13);
         var6[(int)var13] = !lIiiIiIlilli(var9);
         var7[(int)var13] = !var6[(int)var13] && iliIiiliiiii(var9, coverState) && selfBox.test(var9);
      }

      return IiilIllliilIll.Iilllilliill(var4, var6, var7);
   }

   public static boolean iIlIlllllill() {
      class_310 var0 = IliIlllilIi();
      return var0.field_1687 != null && !class_1937.field_25180.equals(var0.field_1687.method_27983());
   }

   public static boolean iliIiiliiiii(class_2338 pos, class_2680 state) {
      return IliIlllilIi().field_1687.method_8628(state, pos, class_3726.method_16194());
   }

   public static double liiiIIllIl() {
      class_310 var0 = IliIlllilIi();
      double var1 = var0.field_1724 == null ? (double)4.5F : var0.field_1724.method_55754();
      return Math.min((double)4.5F, var1) - 0.1;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - var5) + var5))) >>> 5 | (char)(~((char)((char)(var4[var5] - var5) + var5))) << 11))) ^ '롙') - var5) - var5) + var5) - '샄') - var5) + var5) + 'ﳘ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIillIiliIil(class_3965 reach, class_243 eye, double hit) {
      return reach != null && !lIiiIiIlilli(reach.method_17777()) && Iilllilliill(reach, eye, hit);
   }

   public static boolean IlIillIiilIi(class_1799 stack) {
      return !stack.method_31574(class_1802.field_8801) && !stack.method_31574(class_1802.field_23141) && !(stack.method_7909() instanceof class_1747);
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 23274))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ var5) - 23274))) << 8) - 25280) ^ var5) + 30004))) ^ '칫') - var5))) + '킆'))))) << 12 | (char)(-((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - 23274))) >>> 8 | (char)(-((char)((char)(var4[var5] ^ var5) - 23274))) << 8) - 25280) ^ var5) + 30004))) ^ '칫') - var5))) + '킆'))))) >>> 4) + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_243 Illlllllilll(class_243 normal, class_2350 rng, Random centre) {
      double var3 = (centre.nextDouble() * (double)2.0F - (double)1.0F) * 0.3;
      double var5 = (centre.nextDouble() * (double)2.0F - (double)1.0F) * 0.3;
      class_243 var10000;
      switch (rng.method_10166()) {
         case field_11048 -> var10000 = normal.method_1031((double)0.0F, var3, var5);
         case field_11052 -> var10000 = normal.method_1031(var3, (double)0.0F, var5);
         case field_11051 -> var10000 = normal.method_1031(var3, var5, (double)0.0F);
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public static class_2338 IIIllIIliIIl(class_2338 anchor, int index) {
      int[] var2 = IiilIllliilIll.lIIllIliliIIllIlil[index];
      return anchor.method_10069(var2[0], 0, var2[1]);
   }

   public static class_2350 Ililllililil(class_2338 to, class_2338 from) {
      long var5 = -8211780940472057164L;
      long var7 = 2252592567097456406L;
      var5 ^= ((long)(from.method_10263() - to.method_10263()) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)(from.method_10264() - to.method_10264()) ^ var5) & -1L >>> 32;
      var7 ^= ((long)(from.method_10260() - to.method_10260()) << 32 ^ var7) & -1L << 32;
      if (Math.abs((int)(var5 >>> 32)) >= Math.abs((int)var5) && Math.abs((int)(var5 >>> 32)) >= Math.abs((int)(var7 >>> 32))) {
         return (int)(var5 >>> 32) > 0 ? class_2350.field_11034 : class_2350.field_11039;
      } else if (Math.abs((int)var5) >= Math.abs((int)(var5 >>> 32)) && Math.abs((int)var5) >= Math.abs((int)(var7 >>> 32))) {
         return (int)var5 > 0 ? class_2350.field_11036 : class_2350.field_11033;
      } else {
         return (int)(var7 >>> 32) > 0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   private static class_310 IliIlllilIi() {
      return class_310.method_1551();
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) + var5) - 17176) + var5) << 11 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) + var5) - 17176) + var5) >>> 5) ^ '혴') - 12673) + 15459) ^ '闡') ^ '邬'))) - '聙') ^ var5))) ^ var5) + var5) << 3 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) + var5) - 17176) + var5) << 11 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) + var5) - 17176) + var5) >>> 5) ^ '혴') - 12673) + 15459) ^ '闡') ^ '邬'))) - '聙') ^ var5))) ^ var5) + var5) >>> 13) - 10035) - 19364));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IilliliilIIi(class_2338 pos) {
      class_2680 var1 = IliIlllilIi().field_1687.method_8320(pos);
      return var1.method_27852(class_2246.field_23152) ? (Integer)var1.method_11654(class_4969.field_23153) : -1;
   }

   public static boolean lIiiIiIlilli(class_2338 pos) {
      class_2680 var1 = IliIlllilIi().field_1687.method_8320(pos);
      return var1.method_26215() || var1.method_45474();
   }

   private lliiIliliiIl() {
   }

   public static class_3965 IiIlliIliiIl(class_2338 rng, class_2338 target, class_243 avoid, class_243 eye, double look, Random reach) {
      long var14 = -1332032046764957357L;
      var14 ^= ((long)(target != null && rng.method_19455(target) == 1 ? IIIilIIiiIIi(Ililllililil(rng, target)) : -1) << 32 ^ var14) & -1L << 32;
      boolean[] var8 = new boolean[6];

      for(var14 ^= (0L ^ var14) & -1L >>> 32; (int)var14 < 6; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
         var8[(int)var14] = !lIiiIiIlilli(rng.method_10093(Iiilliiliiil((int)var14)));
      }

      var14 ^= ((long)IiilIllliilIll.IiIiliIiiiIi(var8, (int)(var14 >>> 32), IIlilIliiIli(avoid, rng), Illillliilli(eye), look) ^ var14) & -1L >>> 32;
      if ((int)var14 == -1) {
         return null;
      } else {
         class_2350 var10 = Iiilliiliiil((int)var14);
         class_2338 var11 = rng.method_10093(var10);
         class_2350 var12 = var10.method_10153();
         class_243 var13 = Illlllllilll(class_243.method_24953(rng).method_1031((double)var10.method_10148() * (double)0.5F, (double)var10.method_10164() * (double)0.5F, (double)var10.method_10165() * (double)0.5F), var10, reach);
         return new class_3965(var13, var12, var11, false);
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '鰔') ^ 5758) ^ var5) + 11884) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '鰔') ^ 5758) ^ var5) + 11884) << 3))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '鰔') ^ 5758) ^ var5) + 11884) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '鰔') ^ 5758) ^ var5) + 11884) << 3))) ^ var5))) >>> 4) - 16544));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IIIilIIiiIIi(class_2350 d) {
      byte var10000;
      switch (d) {
         case field_11033 -> var10000 = 0;
         case field_11036 -> var10000 = 1;
         case field_11043 -> var10000 = 2;
         case field_11035 -> var10000 = 3;
         case field_11039 -> var10000 = 4;
         case field_11034 -> var10000 = 5;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private static double[] IIlilIliiIli(class_243 eye, class_2338 block) {
      return new double[]{eye.field_1352 - (double)block.method_10263(), eye.field_1351 - (double)block.method_10264(), eye.field_1350 - (double)block.method_10260()};
   }

   public static class_3965 IIlllIlliIll(class_2338 eye, class_243 rng, class_243 reach, double block, Random look) {
      long var9 = 3597015333735440967L;
      var9 ^= ((long)IiilIllliilIll.IlIillIiilIi(IIlilIliiIli(rng, eye), Illillliilli(reach), block) << 32 ^ var9) & -1L << 32;
      if ((int)(var9 >>> 32) == -1) {
         return null;
      } else {
         class_2350 var7 = Iiilliiliiil((int)(var9 >>> 32));
         class_243 var8 = Illlllllilll(class_243.method_24953(eye).method_1031((double)var7.method_10148() * (double)0.5F, (double)var7.method_10164() * (double)0.5F, (double)var7.method_10165() * (double)0.5F), var7, look);
         return new class_3965(var8, var7, eye, false);
      }
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2891572461405431168L ^ Long.rotateLeft(8203791757387170678L, 36) ^ -5066545550746030200L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6895726018596131722L ^ Long.rotateLeft(-8930116347070711148L, 36) ^ 3349801063338391438L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1015714664602602210L ^ Long.rotateLeft(-1199149126855683770L, 43) ^ 5982279831993894989L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6706257058050116898L ^ Long.rotateLeft(3455996407095651539L, 38) ^ 1794798970982007378L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7656146464995637782L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4868524361836556568L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4006692914822817443L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3326802178034994219L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2473556684599060554L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3325702211155450735L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIiilIiiiIii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iliilliiilii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiiiliiiiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIIllIIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iIIIlIlIIl<invokedynamic>());
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

   public static class_2350 Iiilliiliiil(int index) {
      class_2350 var10000;
      switch (index) {
         case 0 -> var10000 = class_2350.field_11033;
         case 1 -> var10000 = class_2350.field_11036;
         case 2 -> var10000 = class_2350.field_11043;
         case 3 -> var10000 = class_2350.field_11035;
         case 4 -> var10000 = class_2350.field_11039;
         case 5 -> var10000 = class_2350.field_11034;
         default -> var10000 = class_2350.field_11036;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) >>> 8 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) << 8) ^ '鲍'))) - var5) - 26969) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) >>> 8 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) << 8) ^ '鲍'))) - var5) - 26969) >>> 12) - var5))) >>> 4 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) >>> 8 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) << 8) ^ '鲍'))) - var5) - 26969) << 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) >>> 8 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) >>> 5 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) - var5) + 8541) + var5))) - '逇'))) << 11) - 12612) << 8) ^ '鲍'))) - var5) - 26969) >>> 12) - var5))) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
