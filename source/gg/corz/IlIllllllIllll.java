package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;
import net.minecraft.class_2561;
import net.minecraft.class_2568;
import net.minecraft.class_2583;
import net.minecraft.class_5250;
import net.minecraft.class_634;
import net.minecraft.class_746;

public class IlIllllllIllll extends ilIllIiIll {
   static final Pattern lilliliiliilliliil = Pattern.compile(IliIlllilIi<invokedynamic>());
   static final Pattern llililiililililiil = Pattern.compile(IliIlllilIi<invokedynamic>());
   private int liIiiliiliiIiiliil;
   static final int llIliliililIliliil = 24000;
   private static final String illliliilIilliliil = "(?![\\p{L}\\p{N}\\p{Sc}_%]|\\.\\d)";
   private static final String Illliliillllliliil = "(?:(?<=§[0-9a-fk-orA-FK-OR])|(?<![\\p{L}\\p{N}\\p{Sc}_.\\-]))";
   private static final String lIlliliiliIlliliil = "(-?\\d{1,8}(?:\\.\\d+)?)";
   static final Pattern iIililiilIlililiil = Pattern.compile(IliIlllilIi<invokedynamic>());
   private double iIliiliilIlliiliil;
   private class_634 IlIiiliilllIiiliil;
   private int ilIiiliilIiIiiliil;
   private double IIliiliillIliiliil;
   private static IlIllllllIllll iiililiilIIIiiliil;
   static final int IiIliliilliIliliil = 1024;
   static final double iiIliliilIIlliliil = (double)256.0F;
   private final iiIiiilIIliiil lIIiiliiliIIiiliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final String IIililiillIililiil = "§[0-9a-fk-orA-FK-OR]";
   private static final SecureRandom Iiililiilliililiil = new SecureRandom();

   static String IiIilliIil(String s, int dx, int dz) {
      ArrayList var3 = new ArrayList();
      ArrayList var4 = new ArrayList();
      iiIilIIlil(s, dx, dz, var3, var4);
      if (var3.isEmpty()) {
         return s;
      } else {
         StringBuilder var5 = new StringBuilder(s.length() + 8);
         int var6 = 0;

         for(int var7 = 0; var7 < var3.size(); ++var7) {
            int[] var8 = (int[])var3.get(var7);
            var5.append(s, var6, var8[0]).append((String)var4.get(var7));
            var6 = var8[1];
         }

         return var5.append(s, var6, s.length()).toString();
      }
   }

   static String illilIilil(String delta, int number) {
      try {
         return (new BigDecimal(delta)).add(BigDecimal.valueOf((long)number)).toPlainString();
      } catch (NumberFormatException var3) {
         return delta;
      }
   }

   public static boolean iIlllIllll() {
      return iiiIlIIIll() && iiililiilIIIiiliil.lIIiiliiliIIiiliil.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6908248041456167692L ^ Long.rotateLeft(1881330300276603265L, 12) ^ 8703107239408989409L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1102362749970722731L ^ Long.rotateLeft(-4544780409514312172L, 36) ^ 255607791290849451L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6094416240465190147L ^ Long.rotateLeft(1993044002686412551L, 14) ^ 9126499804673461191L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5646395826098089716L ^ Long.rotateLeft(8575185568770680616L, 56) ^ -8401570843354307764L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4120389465302232308L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7910237574101181184L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6759040412869868408L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2986403126572839187L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 396096632404197054L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5443991084945722410L;
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

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] + 20121) >>> 8 | (char)((char)var4[var5] + 20121) << 8) ^ var5) << 14 | (char)((char)((char)((char)var4[var5] + 20121) >>> 8 | (char)((char)var4[var5] + 20121) << 8) ^ var5) >>> 2)) + '늧') + 3555) + '鏱') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] + 20121) >>> 8 | (char)((char)var4[var5] + 20121) << 8) ^ var5) << 14 | (char)((char)((char)((char)var4[var5] + 20121) >>> 8 | (char)((char)var4[var5] + 20121) << 8) ^ var5) >>> 2)) + '늧') + 3555) + '鏱') >>> 1))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2338 IIllllIlll(class_2338 real) {
      return real != null && iiiIlIIIll() ? real.method_10069(iiililiilIIIiiliil.ilIiiliilIiIiiliil, 0, iiililiilIIIiiliil.liIiiliiliiIiiliil) : real;
   }

   public static String Iillllilll(String s) {
      return s != null && !s.isEmpty() && iiiIlIIIll() ? IiIilliIil(s, iiililiilIIIiiliil.ilIiiliilIiIiiliil, iiililiilIIIiiliil.liIiiliiliiIiiliil) : s;
   }

   private static class_2583 iIIilIlIil(class_2583 dz, int style, int dx) {
      class_2568 var4 = dz.method_10969();
      if (var4 instanceof class_2568.class_10613 var3) {
         if (var3.comp_3510() != null) {
            class_2561 var5 = IIIillIIil(var3.comp_3510(), style, dx);
            return var5 == var3.comp_3510() ? dz : dz.method_10949(new class_2568.class_10613(var5));
         }
      }

      return dz;
   }

   protected void iIIIlIlIIl() {
      this.lIilliIill();
   }

   public static double IlIllllIll(double realZ) {
      return iiiIlIIIll() ? realZ + (double)iiililiilIIIiiliil.liIiiliiliiIiiliil : realZ;
   }

   public static String iilllIIill(String s) {
      return s != null && !s.isEmpty() && iiiIlIIIll() ? llIililIil(s, iiililiilIIIiiliil.ilIiiliilIiIiiliil, iiililiilIIIiiliil.liIiiliiliiIiiliil) : s;
   }

   static String llIililIil(String dx, int dz, int s) {
      String[] var3 = dx.split(IliIlllilIi<invokedynamic>(), -1);
      byte var4 = -1;
      if (var3.length >= 9 && var3[0].equals(IliIlllilIi<invokedynamic>()) && var3[1].equals(IliIlllilIi<invokedynamic>()) && var3[3].equals(IliIlllilIi<invokedynamic>()) && var3[4].equals(IliIlllilIi<invokedynamic>()) && var3[5].equals(IliIlllilIi<invokedynamic>())) {
         var4 = 6;
      } else if (var3.length >= 4 && var3[0].equals(IliIlllilIi<invokedynamic>())) {
         var4 = 1;
      } else if (var3.length >= 5 && var3[0].equals(IliIlllilIi<invokedynamic>())) {
         var4 = 2;
      }

      if (var4 < 0) {
         return IiIilliIil(dx, dz, s);
      } else {
         var3[var4] = illilIilil(var3[var4], dz);
         var3[var4 + 2] = illilIilil(var3[var4 + 2], s);
         return String.join(IliIlllilIi<invokedynamic>(), var3);
      }
   }

   private static boolean lIliliIlil(List<int[]> a, int spans, int b) {
      for(int[] var4 : a) {
         if (spans < var4[1] && var4[0] < b) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + var5))) + 32278) - var5) ^ var5) ^ var5))) >>> 9 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + var5))) + 32278) - var5) ^ var5) ^ var5))) << 7))) - '\ueaa3')))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int[] ilillIiill(double realX, double random, Random realZ) {
      int var5 = 0;
      int var6 = 0;

      for(int var7 = 0; var7 < 32; ++var7) {
         var5 = liilliiill((double)(realZ.nextInt(48001) - 24000) - realX);
         var6 = liilliiill((double)(realZ.nextInt(48001) - 24000) - random);
         if (Math.abs(var5) >= 1024 && Math.abs(var6) >= 1024) {
            break;
         }
      }

      if (Math.abs(var5) < 1024) {
         var5 = var5 < 0 ? var5 - 1024 : var5 + 1024;
      }

      if (Math.abs(var6) < 1024) {
         var6 = var6 < 0 ? var6 - 1024 : var6 + 1024;
      }

      return new int[]{var5, var6};
   }

   public static boolean iiiIlIIIll() {
      IlIllllllIllll var0 = iiililiilIIIiiliil;
      return var0 != null && var0.IliIlllilIi() && var0.lIilliIill();
   }

   public static class_2561 lllllillll(class_2561 message) {
      return message != null && iiiIlIIIll() ? IIIillIIil(message, iiililiilIIIiiliil.ilIiiliilIiIiiliil, iiililiilIIIiiliil.liIiiliiliiIiiliil) : message;
   }

   public static int ilIllIiIll(int realX) {
      return iiiIlIIIll() ? realX + iiililiilIIIiiliil.ilIiiliilIiIiiliil : realX;
   }

   static void iiIilIIlil(String s, int spans, int values, List<int[]> dz, List<String> dx) {
      if (s != null && !s.isEmpty()) {
         ArrayList var5 = new ArrayList();
         ArrayList var6 = new ArrayList();
         Matcher var7 = lilliliiliilliliil.matcher(s);
         int var8 = 0;

         while(var8 < s.length() && var7.find(var8)) {
            if (!Illillllil(var7.group(3))) {
               var8 = var7.end(1);
            } else {
               var5.add(new int[]{var7.start(1), var7.end(1)});
               var6.add(illilIilil(var7.group(1), spans));
               var5.add(new int[]{var7.start(4), var7.end(4)});
               var6.add(illilIilil(var7.group(4), values));
               var8 = var7.end();
            }
         }

         Matcher var9 = iIililiilIlililiil.matcher(s);

         while(var9.find()) {
            int var10 = var9.start(2);
            int var11 = var9.end(2);
            if (!lIliliIlil(var5, var10, var11)) {
               char var12 = Character.toLowerCase(var9.group(1).charAt(0));
               var5.add(new int[]{var10, var11});
               var6.add(illilIilil(var9.group(2), var12 == 'x' ? spans : values));
            }
         }

         Matcher var16 = llililiililililiil.matcher(s);

         while(var16.find()) {
            if (!lIliliIlil(var5, var16.start(1), var16.end(2))) {
               var5.add(new int[]{var16.start(1), var16.end(1)});
               var6.add(illilIilil(var16.group(1), spans));
               var5.add(new int[]{var16.start(2), var16.end(2)});
               var6.add(illilIilil(var16.group(2), values));
            }
         }

         Integer[] var17 = new Integer[var5.size()];

         for(int var18 = 0; var18 < var17.length; ++var18) {
            var17[var18] = var18;
         }

         Arrays.sort(var17, (found, p) -> Integer.compare(((int[])var5.get(found))[0], ((int[])var5.get(p))[0]));

         for(Integer var15 : var17) {
            dz.add((int[])var5.get(var15));
            dx.add((String)var6.get(var15));
         }

      }
   }

   static int liilliiill(double v) {
      return (int)Math.floor(v / Double.longBitsToDouble(4472349702920168169L ^ 9088539320974926569L)) * (348752824 * 1 - -29 ^ 348752837);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) >>> 5 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) << 11))) + var5) >>> 8 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) >>> 5 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) << 11))) + var5) << 8) - '헓') << 8 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) >>> 5 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) << 11))) + var5) >>> 8 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) >>> 5 | (char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') >>> 5 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ 32690) - 17528))) - '蓓') << 11))) << 11))) + var5) << 8) - '헓') >>> 8))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlIllllllIllll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIiiliiliIIiiliil});
      iiililiilIIIiiliil = this;
   }

   public static double lIIlliIIll(double realX) {
      return iiiIlIIIll() ? realX + (double)iiililiilIIIiiliil.ilIiiliilIiIiiliil : realX;
   }

   static class_2561 IIIillIIil(class_2561 dx, int dz, int message) {
      String var3 = dx.getString();
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList();
      iiIilIIlil(var3, dz, message, var4, var5);
      ArrayList var6 = new ArrayList();
      ArrayList var7 = new ArrayList();
      boolean[] var8 = new boolean[]{false};
      dx.method_27658((hovers, parts) -> {
         var6.add(hovers);
         var7.add(parts);
         if (hovers.method_10969() instanceof class_2568.class_10613) {
            var8[0] = true;
         }

         return Optional.empty();
      }, class_2583.field_24360);
      if (var4.isEmpty() && !var8[0]) {
         return dx;
      } else {
         class_5250 var9 = class_2561.method_43473();
         int var10 = 0;
         int var11 = 0;
         boolean var12 = false;

         for(int var13 = 0; var13 < var7.size(); ++var13) {
            String var14 = (String)var7.get(var13);
            int var15 = var10 + var14.length();
            StringBuilder var16 = null;

            int var17;
            for(var17 = 0; var11 < var4.size() && ((int[])var4.get(var11))[0] < var15; ++var11) {
               int[] var18 = (int[])var4.get(var11);
               if (var18[0] >= var10 && var18[1] <= var15) {
                  if (var16 == null) {
                     var16 = new StringBuilder(var14.length() + 8);
                  }

                  var16.append(var14, var17, var18[0] - var10).append((String)var5.get(var11));
                  var17 = var18[1] - var10;
               }
            }

            if (var16 != null) {
               var16.append(var14, var17, var14.length());
               var14 = var16.toString();
               var12 = true;
            }

            class_2583 var20 = (class_2583)var6.get(var13);
            class_2583 var19 = var8[0] ? iIIilIlIil(var20, dz, message) : var20;
            if (var19 != var20) {
               var12 = true;
            }

            var9.method_10852(class_2561.method_43470(var14).method_10862(var19));
            var10 = var15;
         }

         return (class_2561)(var12 ? var9 : dx);
      }
   }

   private boolean lIilliIill() {
      class_634 var1 = Iiiilllliiilll.method_1562();
      if (var1 == null) {
         return false;
      } else {
         class_746 var2 = Iiiilllliiilll.field_1724;
         if (var2 == null) {
            return var1 == this.IlIiiliilllIiiliil;
         } else {
            double var3 = var2.method_23317();
            double var5 = var2.method_23321();
            if (var1 != this.IlIiiliilllIiiliil || Ilillllill(this.IIliiliillIliiliil, this.iIliiliilIlliiliil, var3, var5)) {
               this.IlIiiliilllIiiliil = var1;
               int[] var7 = ilillIiill(var3, var5, Iiililiilliililiil);
               this.ilIiiliilIiIiiliil = var7[0];
               this.liIiiliiliiIiiliil = var7[1];
            }

            this.IIliiliillIliiliil = var3;
            this.iIliiliilIlliiliil = var5;
            return true;
         }
      }
   }

   static boolean Ilillllill(double fromX, double fromZ, double toX, double toZ) {
      double var8 = toX - fromX;
      double var10 = toZ - fromZ;
      return var8 * var8 + var10 * var10 > Double.longBitsToDouble(6752631522039671200L ^ 2109420306220689824L);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 20174) - var5) ^ 22120) - var5))) ^ '흪') ^ 13875))) ^ '蹫'))) << 4 | (char)(-((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 20174) - var5) ^ 22120) - var5))) ^ '흪') ^ 13875))) ^ '蹫'))) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int liIlliiIll(int realZ) {
      return iiiIlIIIll() ? realZ + iiililiilIIIiiliil.liIiiliiliiIiiliil : realZ;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] + var5))))) + var5) ^ 17301) - '蚹') + var5))) ^ 24226))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean Illillllil(String y) {
      try {
         double var1 = Double.parseDouble(y);
         return var1 >= Double.longBitsToDouble(7450234766577481934L ^ -6398334087586793266L) && var1 <= Double.longBitsToDouble(-1632206813904421477L ^ -6256277731307078245L);
      } catch (NumberFormatException var3) {
         return false;
      }
   }
}
