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
import net.minecraft.class_1297;
import net.minecraft.class_1301;
import net.minecraft.class_1675;
import net.minecraft.class_238;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;

public class IilillIililillIi extends ilIllIiIll {
   private final iilliIlIIiliIl iiIiIIlIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 50, 0, 100);
   private final iIiIlIIiIliIlIIi IlliIIlIIi = new iIiIlIIiIliIlIIi();
   static final int IlIiIIlIIi = Integer.MIN_VALUE;
   private double llliIIlIIi;
   private final lliliIIiililiIIi IIliIIlIIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   static final String llIiIIlIIi = "Advanced";
   private final iiIiiilIIliiil lIliIIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   static final String ilIiIIlIIi = "Normal";
   private final Iiiliillliiliill liIiIIlIIi = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)3.0F, 3.1, (double)3.0F, (double)6.0F, 0.05);
   private static boolean IiIiIIlIIi;
   private final iiIiiilIIliiil iIliIIlIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   static final int iIIiIIlIIi = 10;
   private double illiIIlIIi;

   public double iiiIlIIIll() {
      return this.illiIIlIIi;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ var5) - var5) + '\udb9d'))) - var5) << 14 | (char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ var5) - var5) + '\udb9d'))) - var5) >>> 2) + var5) ^ var5) + 30304) << 15 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ var5) - var5) + '\udb9d'))) - var5) << 14 | (char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ var5) - var5) + '\udb9d'))) - var5) >>> 2) + var5) ^ var5) + 30304) >>> 1) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5511174631544286525L ^ Long.rotateLeft(-2339820260592639467L, 39) ^ 3963433399409440858L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7744198070435182312L ^ Long.rotateLeft(-329431357856491480L, 56) ^ 3268651084092007825L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8558450186001147879L ^ Long.rotateLeft(2321562032641157088L, 1) ^ 1774860625522154729L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -925036358603683320L ^ Long.rotateLeft(8503688030594114545L, 26) ^ -5388152901829249792L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1608865829648225419L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -369706997315417434L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5214115344307373147L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5346507875120100798L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3689472040843735082L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4553252529062705021L;
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + var5) ^ 17254))) + var5))) + var5) - var5) + var5) + '論'))) << 14 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + var5) ^ 17254))) + var5))) + var5) - var5) + var5) + '論'))) >>> 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IilillIililillIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liIiIIlIIi, this.iiIiIIlIIi, this.IIliIIlIIi, this.lIliIIlIIi, this.iIliIIlIIi});
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      class_2596 var3 = event.lIiilIIIIi;
      if (var3 instanceof class_2824 var2) {
         if (!event.lIiiIiIlilli()) {
            if (Iiiilllliiilll != null && Iiiilllliiilll.method_18854() && IliIlllilIi<invokedynamic>().equals(this.IIliIIlIIi.Iilllilliill())) {
               if (!IIIliiIilIIliiIi.IliIlllilIi(var2)) {
                  return;
               }

               this.IlliIIlIIi.liiiIIllIl();
               this.illiIIlIIi = (double)0.0F;
               return;
            }

            return;
         }
      }

   }

   private boolean lIIlliIIll(class_746 player) {
      if (!this.iIliIIlIIi.Iilllilliill() || !player.method_5799() && !player.method_5771()) {
         return !this.lIliIIlIIi.Iilllilliill() || player.method_5624();
      } else {
         return false;
      }
   }

   protected void Illillliilli() {
      this.ilIllIiIll();
      if (!IiIiIIlIIi && Iiiilllliiilll != null && Iiiilllliiilll.field_1724 != null) {
         IiIiIIlIIi = true;
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-var4[var5]) + '찊') - var5) ^ var5))))) + '쭟') << 11 | (char)((char)(~((char)(-((char)((char)((char)((char)(-var4[var5]) + '찊') - var5) ^ var5))))) + '쭟') >>> 5))) + var5))) - var5) << 4 | (char)((char)(-((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-var4[var5]) + '찊') - var5) ^ var5))))) + '쭟') << 11 | (char)((char)(~((char)(-((char)((char)((char)((char)(-var4[var5]) + '찊') - var5) ^ var5))))) + '쭟') >>> 5))) + var5))) - var5) >>> 12) - '쉡'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll() {
      this.IlliIIlIIi.lIiiIiIlilli();
      this.llliIIlIIi = (double)0.0F;
      this.illiIIlIIi = (double)0.0F;
   }

   protected void Iilililiiili() {
      this.ilIllIiIll();
   }

   private boolean IlIllllIll() {
      return ThreadLocalRandom.current().nextInt((~((1203966901 ^ -55) << 9 | (1203966901 ^ -55) >>> 23) >>> 23 | ~((1203966901 ^ -55) << 9 | (1203966901 ^ -55) >>> 23) << 9) ^ 1309482856) < this.iiIiIIlIIi.Iilllilliill();
   }

   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1687 != null) {
         boolean var2 = this.lIIlliIIll(var1);
         double var3 = Math.min(this.liIiIIlIIi.Iilllilliill(), this.liIiIIlIIi.Ililllililil());
         double var5 = Math.max(this.liIiIIlIIi.Iilllilliill(), this.liIiIIlIIi.Ililllililil());
         if (IliIlllilIi<invokedynamic>().equals(this.IIliIIlIIi.Iilllilliill())) {
            this.IlliIIlIIi.lIiiIiIlilli();
            this.illiIIlIIi = var2 && this.IlIllllIll() ? liIlliiIll(var3, var5) : (double)0.0F;
         } else {
            Object var7 = Iiiilllliiilll.method_1560() != null ? Iiiilllliiilll.method_1560() : var1;
            class_1297 var8 = IIllllIlll((class_1297)var7, var1.method_55754(), var5);
            if (this.IlliIIlIIi.IliIlllilIi(var8 == null ? Integer.MIN_VALUE : var8.method_5628(), var2, this::IlIllllIll)) {
               this.llliIIlIIi = liIlliiIll(var3, var5);
            }

            this.illiIIlIIi = var2 && this.IlliIIlIIi.iIlIlllllill() ? Math.max(var3, Math.min(var5, this.llliIIlIIi)) : (double)0.0F;
         }
      } else {
         this.ilIllIiIll();
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - var5) - var5) - var5))) - '钕') + '붯') - '슱') - 4359))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static class_1297 IIllllIlll(class_1297 blockRange, double camera, double entityRange) {
      double var5 = Math.max(camera, entityRange);
      double var7 = var5 * var5;
      class_243 var9 = blockRange.method_5836(1.0F);
      class_239 var10 = blockRange.method_5745(var5, 1.0F, false);
      double var11 = var10.method_17784().method_1025(var9);
      if (var10.method_17783() != class_240.field_1333) {
         var7 = var11;
         var5 = Math.sqrt(var11);
      }

      class_243 var13 = blockRange.method_5828(1.0F);
      class_243 var14 = var9.method_1031(var13.field_1352 * var5, var13.field_1351 * var5, var13.field_1350 * var5);
      class_238 var15 = blockRange.method_5829().method_18804(var13.method_1021(var5)).method_1009((double)1.0F, (double)1.0F, (double)1.0F);
      class_3966 var16 = class_1675.method_18075(blockRange, var9, var14, var15, class_1301.field_52443, var7);
      if (var16 != null && !(var16.method_17784().method_1025(var9) >= var11)) {
         return var16.method_17784().method_24802(var9, entityRange) ? var16.method_17782() : null;
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(-((char)(~((char)((char)(var4[var5] + '霉') - var5))))))))) - 'ꖱ') ^ 17666))) >>> 13 | (char)(~((char)((char)((char)(-((char)(~((char)(-((char)(~((char)((char)(var4[var5] + '霉') - var5))))))))) - 'ꖱ') ^ 17666))) << 3) + '\uf002') - var5) << 2 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(-((char)(~((char)((char)(var4[var5] + '霉') - var5))))))))) - 'ꖱ') ^ 17666))) >>> 13 | (char)(~((char)((char)((char)(-((char)(~((char)(-((char)(~((char)((char)(var4[var5] + '霉') - var5))))))))) - 'ꖱ') ^ 17666))) << 3) + '\uf002') - var5) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static double liIlliiIll(double hi, double lo) {
      return lo <= hi ? hi : hi + ThreadLocalRandom.current().nextDouble() * (lo - hi);
   }
}
