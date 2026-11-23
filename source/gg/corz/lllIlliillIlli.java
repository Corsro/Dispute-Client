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
import net.minecraft.class_1109;
import net.minecraft.class_2960;
import net.minecraft.class_3414;

public class lllIlliillIlli extends ilIllIiIll {
   private final IIIIlilllIIIlill llIIilIIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.45, 0.05, (double)1.0F, 0.05);
   private final iiIiiilIIliiil lIIIilIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill IIIIilIIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1.7, 0.1, (double)2.0F, 0.1);
   private final iiIiiilIIliiil ilIIilIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IiIIilIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi iiiillIIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iiIiiilIIliiil iIIIilIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final lliliIIiililiIIi IlIIilIIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});

   public static void liIlliiIll() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(lllIlliillIlli.class);
      if (var0 instanceof lllIlliillIlli var1) {
         if (var1.IiIIilIIIl.Iilllilliill()) {
            IIllllIlll(IliIlllilIi<invokedynamic>(), (float)var1.IIIIilIIIl.Iilllilliill());
            return;
         }
      }

   }

   public lllIlliillIlli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IlllIIIillllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiiillIIIl, this.IIIIilIIIl, this.lIIIilIIIl, this.iIIIilIIIl, this.IlIIilIIIl, this.llIIilIIIl, this.ilIIilIIIl, this.IiIIilIIIl});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') << 14) >>> 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') << 14) << 13) ^ var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') << 14) >>> 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) << 7 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) << 15 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) << 9 | (char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) >>> 7))) + var5) >>> 1) >>> 9) + var5) + '뵈') + 24182))) + '빅') << 14) << 13) ^ var5) - var5) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_3414 iiiIlIIIll(String name) {
      return class_3414.method_47908(class_2960.method_60655(IliIlllilIi<invokedynamic>(), name));
   }

   public static void iIlllIllll() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(lllIlliillIlli.class);
      if (var0 instanceof lllIlliillIlli var1) {
         if (var1.iIIIilIIIl.Iilllilliill()) {
            if (Iiiilllliiilll.method_1483() == null) {
               return;
            }

            class_3414 var2;
            float var3;
            if (IliIlllilIi<invokedynamic>().equals(var1.IlIIilIIIl.Iilllilliill())) {
               var2 = iiiIlIIIll(IliIlllilIi<invokedynamic>());
               var3 = 1.0F;
            } else {
               var2 = iiiIlIIIll(IliIlllilIi<invokedynamic>());
               var3 = 1.25F;
            }

            Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(var2, var3, (float)var1.llIIilIIIl.Iilllilliill()));
            return;
         }
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 866011819930172605L ^ Long.rotateLeft(8674198479708101977L, 34) ^ 426915424804091219L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4941893531232191223L ^ Long.rotateLeft(-8299074212642709439L, 25) ^ 3594023253792041159L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4408825421254489074L ^ Long.rotateLeft(123807129173493049L, 4) ^ 5927305818852612015L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5186266495787056090L ^ Long.rotateLeft(359715689992340177L, 23) ^ 4573092190003978240L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1348327778033444805L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3622209604540131907L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6419444146838220319L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1342340261578981380L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3979053940874196598L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8887506582018979824L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   private class_3414[] lIIlliIIll() {
      String var1 = this.iiiillIIIl.Iilllilliill();
      byte var2 = -1;
      switch (var1.hashCode()) {
         case -1912000502:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
            break;
         case -1912000501:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
            break;
         case -1912000500:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 2;
            }
            break;
         case -1912000499:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 4;
            }
            break;
         case 857527739:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 3;
            }
      }

      class_3414[] var10000;
      switch (var2) {
         case 0 -> var10000 = new class_3414[]{iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())};
         case 1 -> var10000 = new class_3414[]{iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())};
         case 2 -> var10000 = new class_3414[]{iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())};
         case 3 -> var10000 = new class_3414[]{iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())};
         case 4 -> var10000 = new class_3414[]{iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())};
         default -> var10000 = new class_3414[]{iiiIlIIIll(IliIlllilIi<invokedynamic>()), iiiIlIIIll(IliIlllilIi<invokedynamic>())};
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) + var5))) - var5) ^ 17918) << 3 | (char)((char)((char)(-((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) + var5))) - var5) ^ 17918) >>> 13))))))) - 687) ^ 11571) ^ '홧') + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void IlIllllIll(ilIllIiIll module, boolean enabled) {
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(lllIlliillIlli.class);
      if (var2 instanceof lllIlliillIlli var3) {
         if (var3.lIIIilIIIl.Iilllilliill()) {
            if (!IIiliilllIiliill.iIlIlllllill()) {
               return;
            }

            if (Iiiilllliiilll.field_1724 == null) {
               return;
            }

            class_3414[] var4 = var3.lIIlliIIll();
            Iiiilllliiilll.field_1724.method_5783(enabled ? var4[0] : var4[1], (float)var3.IIIIilIIIl.Iilllilliill(), 1.0F);
            return;
         }
      }

   }

   public static void ilIllIiIll() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(lllIlliillIlli.class);
      if (var0 instanceof lllIlliillIlli var1) {
         if (var1.ilIIilIIIl.Iilllilliill()) {
            IIllllIlll(IliIlllilIi<invokedynamic>(), (float)var1.IIIIilIIIl.Iilllilliill());
            return;
         }
      }

   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 25252) ^ 5698) ^ var5))) >>> 2 | (char)(-((char)((char)((char)(var4[var5] + 25252) ^ 5698) ^ var5))) << 14) - 17954) - var5))) >>> 6 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 25252) ^ 5698) ^ var5))) >>> 2 | (char)(-((char)((char)((char)(var4[var5] + 25252) ^ 5698) ^ var5))) << 14) - 17954) - var5))) << 10))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) << 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) >>> 8) - '\ue7db') << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) << 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) >>> 8) - '\ue7db') >>> 10) >>> 6 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) << 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) >>> 8) - '\ue7db') << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) << 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] ^ '馫') - var5))) << 8 | (char)(~((char)((char)(var4[var5] ^ '馫') - var5))) >>> 8) ^ 19333))) - var5) + var5) - '\ue5c3'))) + '黸') + 22190) - var5) >>> 8) - '\ue7db') >>> 10) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + 19778) - 17466)))))) - var5) ^ '鑨'))))) - '遗')))) + 21771) >>> 4 | (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + 19778) - 17466)))))) - var5) ^ '鑨'))))) - '遗')))) + 21771) << 12) + var5))))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIllllIlll(String event, float volume) {
      if (Iiiilllliiilll.method_1483() != null) {
         Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(iiiIlIIIll(event), 1.0F, volume));
      }
   }
}
