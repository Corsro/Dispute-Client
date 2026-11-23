package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1747;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1811;
import net.minecraft.class_9334;

public class liiiIliliiiiIlil extends ilIllIiIll {
   private final iiIiiilIIliiil iIllIliIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), "", true);
   private final iilliIlIIiliIl llllIliIil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), "", 0, 0, 10);
   private final iiIiiilIIliiil IlllIliIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), "", true);
   private final iiIiiilIIliiil lIllIliIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), "", false);
   private final iiIiiilIIliiil illlIliIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + var5) + var5) ^ '鬜'))) ^ '띠')) + var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + var5) + var5) ^ '鬜'))) ^ '띠')) + var5) << 2) + var5) - 11507) + 11878) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + var5) + var5) ^ '鬜'))) ^ '띠')) + var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + var5) + var5) ^ '鬜'))) ^ '띠')) + var5) << 2) + var5) - 11507) + 11878) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iiiiliiiiiii(iillIIIlIIilIIIl postItemUseEvent) {
      long var9 = 7330219789139530028L;
      class_1799 var2 = Iiiilllliiilll.field_1724.method_6047();
      class_1799 var3 = Iiiilllliiilll.field_1724.method_6079();
      class_1792 var4 = var2.method_7909();
      class_1792 var5 = Iiiilllliiilll.field_1724.method_6079().method_7909();
      if (var2.method_31574(class_1802.field_8287) || var3.method_31574(class_1802.field_8287) || !this.lIllIliIil.Iilllilliill()) {
         if (!this.lIllIliIil.Iilllilliill()) {
            if (!(var4 instanceof class_1747) && !(var5 instanceof class_1747)) {
               if (!this.IlllIliIil.Iilllilliill()) {
                  return;
               }
            } else if (!this.iIllIliIil.Iilllilliill()) {
               return;
            }
         }

         if (var4.method_57347().method_58694(class_9334.field_50075) == null) {
            if (var5.method_57347().method_58694(class_9334.field_50075) == null) {
               if (!var2.method_31574(class_1802.field_23141) && !var2.method_31574(class_1802.field_8801) && !var3.method_31574(class_1802.field_23141) && !var3.method_31574(class_1802.field_8801)) {
                  if (!(var4 instanceof class_1811) && !(var5 instanceof class_1811)) {
                     var9 ^= ((long)this.llllIliIil.Iilllilliill() << 32 ^ var9) & -1L << 32;
                     if (this.illlIliIil.Iilllilliill() && (int)(var9 >>> 32) < (((1647550336 << 15 | 1647550336 >>> 17) >>> 5 | (1647550336 << 15 | 1647550336 >>> 17) << 27) ^ -830602870)) {
                        double var7 = ThreadLocalRandom.current().nextDouble();
                        var9 ^= ((long)(var7 < Double.longBitsToDouble(-2504635550070227836L ^ -2120027032935586530L) ? 4 : (var7 < Double.longBitsToDouble(3532943879134111274L ^ 1068684132455732505L) ? 3 : 2)) << 32 ^ var9) & -1L << 32;
                     }

                     postItemUseEvent.iillIIllIl = (int)(var9 >>> 32);
                  }
               }
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) + '軍'))) + var5))) ^ var5) + '콟') ^ 7461))) ^ 'ꬅ') + var5) ^ var5) - var5) << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) + '軍'))) + var5))) ^ var5) + '콟') ^ 7461))) ^ 'ꬅ') + var5) ^ var5) - var5) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liiiIliliiiiIlil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIllIliIil, this.iIllIliIil, this.IlllIliIil, this.llllIliIil, this.illlIliIil});
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8480174519100363501L ^ Long.rotateLeft(-9161462381692679142L, 20) ^ 1694994003781446255L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 161763464655300401L ^ Long.rotateLeft(7466207285937965613L, 4) ^ -7072637116570490455L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 365297593595686838L ^ Long.rotateLeft(-5172329051831297337L, 32) ^ 7216160591870940561L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -52300717797050668L ^ Long.rotateLeft(-5179426538098758826L, 41) ^ 8659211797817901581L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 252879475727896752L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1413495940182674833L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4911421507350601602L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5076077947250866915L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8740653602269918859L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1335399913760405686L;
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '\ud95e') ^ '\udabc') << 5 | (char)((char)((char)(var4[var5] ^ var5) + '\ud95e') ^ '\udabc') >>> 11) ^ var5) - var5) ^ var5) + 4215) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '\ud95e') ^ '\udabc') << 5 | (char)((char)((char)(var4[var5] ^ var5) + '\ud95e') ^ '\udabc') >>> 11) ^ var5) - var5) ^ var5) + 4215) << 1) + var5) + var5) - '豓'))) - var5) ^ var5) + var5) + 26485));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) >>> 10 | (char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) << 6) + var5))) - '컒'))) - var5) ^ var5) - '\ue17f') >>> 1 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) >>> 10 | (char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) << 6) + var5))) - '컒'))) - var5) ^ var5) - '\ue17f') << 15) << 15 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) >>> 10 | (char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) << 6) + var5))) - '컒'))) - var5) ^ var5) - '\ue17f') >>> 1 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) >>> 10 | (char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9) << 6) + var5))) - '컒'))) - var5) ^ var5) - '\ue17f') << 15) >>> 1) + '\udbc6') ^ 6013) - 'ꀘ') - '锃'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) >>> 4 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) << 12))) + '멱') ^ var5) ^ '\uf32c') ^ var5)))))) - var5) << 4 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) >>> 4 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) << 12))) + '멱') ^ var5) ^ '\uf32c') ^ var5)))))) - var5) >>> 12))))) >>> 14 | (char)(~((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) >>> 4 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) << 12))) + '멱') ^ var5) ^ '\uf32c') ^ var5)))))) - var5) << 4 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) >>> 4 | (char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) << 8 | (char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) + var5) >>> 8) << 12))) + '멱') ^ var5) ^ '\uf32c') ^ var5)))))) - var5) >>> 12))))) << 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
