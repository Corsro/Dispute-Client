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
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_265;
import net.minecraft.class_3965;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iiIlIillIIllIill extends ilIllIiIll {
   private final IIIIlilllIIIlill IlllIilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)0.0F, (double)5.0F, 0.1);
   private final iliiliilIiiiliil IiIlIilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -11884289);
   private final IIIIlilllIIIlill iiIlIilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.22, (double)0.0F, (double)1.0F, 0.02);
   private final IIIIlilllIIIlill lIllIilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)2.0F, (double)0.5F, (double)5.0F, (double)0.5F);
   private final IIIIlilllIIIlill IIllIilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.95, (double)0.0F, (double)1.0F, 0.02);
   private final lliliIIiililiIIi llIlIilill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final lliliIIiililiIIi ilIlIilill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iliiliilIiiiliil liIlIilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -4961537);
   private final IIIIlilllIIIlill iIllIilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.5F, (double)0.0F, (double)1.0F, 0.05);

   private int ilIllIiIll() {
      float var1 = (float)this.IlllIilill.Iilllilliill();
      String var2 = this.ilIlIilill.Iilllilliill();
      byte var3 = -1;
      switch (var2.hashCode()) {
         case -1808614770:
            if (var2.equals(IliIlllilIi<invokedynamic>())) {
               var3 = 0;
            }
            break;
         case -1656737386:
            if (var2.equals(IliIlllilIi<invokedynamic>())) {
               var3 = 2;
            }
            break;
         case 154295120:
            if (var2.equals(IliIlllilIi<invokedynamic>())) {
               var3 = 1;
            }
      }

      int var10000;
      switch (var3) {
         case 0 -> var10000 = this.IiIlIilill.Iilllilliill();
         case 1 -> var10000 = iIillliIlillli.Iiilliiliiil(this.IiIlIilill.Iilllilliill(), this.liIlIilill.Iilllilliill(), var1, 0.0F);
         case 2 -> var10000 = iIillliIlillli.lIiiIiIlilli(var1, 0.0F);
         default -> var10000 = IlIIilIlllIIilIl.lliiIlliIl;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) << 15 | (char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) >>> 1) ^ var5)))) + var5) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) << 15 | (char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) >>> 1) ^ var5)))) + var5) >>> 12) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) << 15 | (char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) >>> 1) ^ var5)))) + var5) << 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) << 15 | (char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) << 7 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) << 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') >>> 8 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '\uef7c') << 8) >>> 14) >>> 9) >>> 1) ^ var5)))) + var5) >>> 12) >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float[] IlIllllIll(class_238 box) {
      class_243 var1 = Iiiilllliiilll.method_1561().field_4686.method_71156();
      float[] var10000 = new float[(-1193990058 * -1631000239 + 45) * 31 ^ 1990796027];
      var10000[0] = (float)(box.field_1323 - var1.method_10216());
      var10000[1] = (float)(box.field_1322 - var1.method_10214());
      var10000[2] = (float)(box.field_1321 - var1.method_10215());
      var10000[3] = (float)(box.field_1320 - var1.method_10216());
      var10000[4] = (float)(box.field_1325 - var1.method_10214());
      var10000[5] = (float)(box.field_1324 - var1.method_10215());
      return var10000;
   }

   public static void iiiIlIIIll(class_4587 c, class_238 box, int lineWidth, double stack) {
      float[] var5 = IlIllllIll(box);
      iIiiIIilIliiIIil.iIIIlIlIIl(c.method_23760().method_23761(), var5[0], var5[1], var5[2], var5[3], var5[4], var5[5], lineWidth, (float)stack);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3576256253837659131L ^ Long.rotateLeft(7433793361602288927L, 21) ^ 8373316428843680649L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6598390940527266740L ^ Long.rotateLeft(-1287820431683383422L, 32) ^ -3579035247391089149L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9017627573338469434L ^ Long.rotateLeft(-3979684504853594970L, 29) ^ 4270962159986325012L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4558812308002200208L ^ Long.rotateLeft(738028140076989065L, 48) ^ 2947543698999288309L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6694585105701569854L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6643710543519522017L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9032041433827304816L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1667530897145253919L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6226642971759579741L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8992892682359710335L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) >>> 3))) - var5) + '\ue78f') + '\ue44c') ^ var5) << 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) >>> 3))) - var5) + '\ue78f') + '\ue44c') ^ var5) >>> 5))) - 7521) ^ var5) - var5) - 6177) << 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) >>> 3))) - var5) + '\ue78f') + '\ue44c') ^ var5) << 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) << 13 | (char)((char)((char)((char)(~var4[var5]) - var5) + '舖') + var5) >>> 3))) - var5) + '\ue78f') + '\ue44c') ^ var5) >>> 5))) - 7521) ^ var5) - var5) - 6177) >>> 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void lIIlliIIll(class_4587 c, class_238 box, int stack) {
      float[] var3 = IlIllllIll(box);
      iIiiIIilIliiIIil.IIlilIliiIli(c.method_23760().method_23761(), var3[0], var3[1], var3[2], var3[3], var3[4], var3[5], iIillliIlillli.IiIiliIiiiIi(stack), iIillliIlillli.IIlilIliiIli(stack), iIillliIlillli.Illillliilli(stack), iIillliIlillli.Iilililiiili(stack));
   }

   private void liIlliiIll(Matrix4f m, float[] b, int width, float argb, boolean shader) {
      if (shader) {
         this.IIllllIlll(m, b, argb, iIillliIlillli.Iilililiiili(width));
      } else {
         iIiiIIilIliiIIil.iIIIlIlIIl(m, b[0], b[1], b[2], b[3], b[4], b[5], width, argb);
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) + var5) - var5) >>> 9 | (char)((char)((char)(var4[var5] - var5) + var5) - var5) << 7))) ^ var5) - var5) + '꒵'))) ^ '\uf040') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIiilIiiiIii(illlllIillll event) {
      if (!lilIliIiiilIliIi.iiiIlIIIll() && !iIIlIllIlIlIll.IIIllIIliIIl()) {
         class_239 var3 = Iiiilllliiilll.field_1765;
         if (var3 instanceof class_3965) {
            class_3965 var2 = (class_3965)var3;
            if (Iiiilllliiilll.field_1687 != null) {
               class_265 var16 = Iiiilllliiilll.field_1687.method_8320(var2.method_17777()).method_26218(Iiiilllliiilll.field_1687, var2.method_17777());
               if (var16.method_1110()) {
                  return;
               }

               class_238 var4 = var16.method_1107().method_996(var2.method_17777());
               float[] var5 = IlIllllIll(var4);
               Matrix4f var6 = event.IliiiIIilliiiIIi.method_23760().method_23761();
               String var7 = this.llIlIilill.Iilllilliill();
               boolean var8 = var7.equals(IliIlllilIi<invokedynamic>()) || var7.equals(IliIlllilIi<invokedynamic>()) || var7.equals(IliIlllilIi<invokedynamic>()) || var7.equals(IliIlllilIi<invokedynamic>());
               boolean var9 = !var7.equals(IliIlllilIi<invokedynamic>());
               boolean var10 = var7.equals(IliIlllilIi<invokedynamic>());
               boolean var11 = var7.equals(IliIlllilIi<invokedynamic>()) || var10;
               int var12 = this.ilIllIiIll();
               if (var8) {
                  int var13 = iIillliIlillli.IIIilIIiiIIi(var12, (float)this.iiIlIilill.Iilllilliill());
                  iIiiIIilIliiIIil.IIlilIliiIli(var6, var5[0], var5[1], var5[2], var5[3], var5[4], var5[5], iIillliIlillli.IiIiliIiiiIi(var13), iIillliIlillli.IIlilIliiIli(var13), iIillliIlillli.Illillliilli(var13), iIillliIlillli.Iilililiiili(var13));
               }

               if (var9) {
                  float var17 = (float)this.lIllIilill.Iilllilliill();
                  float var14 = (float)this.IIllIilill.Iilllilliill();
                  if (var11 && this.iIllIilill.Iilllilliill() > 0.001) {
                     float var15 = (float)this.iIllIilill.Iilllilliill();
                     this.liIlliiIll(var6, var5, iIillliIlillli.IIIilIIiiIIi(var12, 0.1F * var15 * var14), var17 * 3.2F, var10);
                     this.liIlliiIll(var6, var5, iIillliIlillli.IIIilIIiiIIi(var12, 0.2F * var15 * var14), var17 * 1.9F, var10);
                  }

                  if (var10) {
                     this.IIllllIlll(var6, var5, var17, var14);
                  } else {
                     iIiiIIilIliiIIil.iIIIlIlIIl(var6, var5[0], var5[1], var5[2], var5[3], var5[4], var5[5], iIillliIlillli.IIIilIIiiIIi(var12, var14), var17);
                  }
               }

               iIiiIIilIliiIIil.IiIiliIiiiIi();
               return;
            }
         }

      }
   }

   public void Iilililiiili() {
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) << 12) + var5))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) << 12) + var5))) << 9) + 13012))) >>> 6 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) << 12) + var5))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') << 2 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] - var5) << 14 | (char)(var4[var5] - var5) >>> 2))))) + '\uee12') - var5) - var5) + '釨') >>> 14) ^ 10495) << 12) + var5))) << 9) + 13012))) << 10) ^ 11067))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\uf76a') + var5) << 2 | (char)((char)((char)(var4[var5] - var5) - '\uf76a') + var5) >>> 14) + var5) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) - '\uf76a') + var5) << 2 | (char)((char)((char)(var4[var5] - var5) - '\uf76a') + var5) >>> 14) + var5) ^ var5) << 9))) + var5))) + var5) + 'ꇜ') + var5) - var5) + var5) ^ '갯'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIllllIlll(Matrix4f m, float[] width, float alpha, float b) {
      float var5 = (float)this.IlllIilill.Iilllilliill();
      float var6 = width[0];
      float var7 = width[1];
      float var8 = width[2];
      float var9 = width[3];
      float var10 = width[4];
      float var11 = width[5];
      float[][] var12 = new float[][]{{var6, var7, var8, var9, var7, var8}, {var9, var7, var8, var9, var7, var11}, {var9, var7, var11, var6, var7, var11}, {var6, var7, var11, var6, var7, var8}, {var6, var10, var8, var9, var10, var8}, {var9, var10, var8, var9, var10, var11}, {var9, var10, var11, var6, var10, var11}, {var6, var10, var11, var6, var10, var8}, {var6, var7, var8, var6, var10, var8}, {var9, var7, var8, var9, var10, var8}, {var9, var7, var11, var9, var10, var11}, {var6, var7, var11, var6, var10, var11}};

      for(int var13 = 0; var13 < var12.length; ++var13) {
         int var14 = iIillliIlillli.IIIilIIiiIIi(iIillliIlillli.lIiiIiIlilli(var5, (float)var13 * 0.06F), b);
         int var15 = iIillliIlillli.IIIilIIiiIIi(iIillliIlillli.lIiiIiIlilli(var5, (float)(var13 + 1) * 0.06F), b);
         iIiiIIilIliiIIil.Iiiiliiiiiii(m, var12[var13][0], var12[var13][1], var12[var13][2], var12[var13][3], var12[var13][4], var12[var13][5], var14, var15, alpha);
      }

   }

   public iiIlIillIIllIill() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIlIilill, this.ilIlIilill, this.IiIlIilill, this.liIlIilill, this.iiIlIilill, this.IIllIilill, this.lIllIilill, this.iIllIilill, this.IlllIilill});
   }

   public void Illillliilli() {
   }
}
