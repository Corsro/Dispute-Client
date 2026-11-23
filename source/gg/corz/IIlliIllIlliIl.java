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
import net.minecraft.class_1268;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_2680;

public class IIlliIllIlliIl extends ilIllIiIll {
   private float lIliIlilliIliIlill = 0.0F;
   private final iiIiiilIIliiil llIiIlillilIiIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IiIiIlillliIiIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iIIiIlillIlIiIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill liilIlilliiilIlill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.0F, (double)-90.0F, (double)90.0F, (double)1.0F);
   private int IlliIlillllliIlill = 0;
   private final iiIiiilIIliiil ililIlillIiilIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IIIiIlilllIIiIlill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl iiIiIlillIIliIlill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 4, 1, 8);
   private class_2338 liliIlilliiliIlill = null;
   private class_2350 illiIlillIiliIlill = null;

   private void iiiIlIIIll() {
      class_2350 var1 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      if (this.liliIlilliiliIlill != null) {
         class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(this.liliIlilliiliIlill);
         if (this.lIIlliIIll(var2, this.liliIlilliiliIlill)) {
            Iiiilllliiilll.field_1761.method_2902(this.liliIlilliiliIlill, var1.method_10153());
            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
            return;
         }

         this.liliIlilliiliIlill = null;
      }

      class_2338 var3 = Iiiilllliiilll.field_1724.method_24515().method_10093(var1);
      if (this.lIIlliIIll(Iiiilllliiilll.field_1687.method_8320(var3), var3)) {
         this.liliIlilliiliIlill = var3;
         Iiiilllliiilll.field_1761.method_2910(this.liliIlilliiliIlill, var1.method_10153());
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }

   }

   private boolean ilIllIiIll(class_2338 pos) {
      class_2248 var2 = Iiiilllliiilll.field_1687.method_8320(pos).method_26204();
      return var2 == class_2246.field_10164 || var2 == class_2246.field_10036 || var2 == class_2246.field_22089;
   }

   private class_2350 IlIllllIll() {
      class_2338 var1 = Iiiilllliiilll.field_1724.method_24515();
      class_2350 var2 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      int var3 = this.iiIiIlillIIliIlill.Iilllilliill();

      for(int var4 = 1; var4 <= var3; ++var4) {
         class_2338 var5 = var1.method_10079(var2, var4);

         for(int var6 = -1; var6 <= 2; ++var6) {
            if (this.ilIllIiIll(var5.method_10086(var6))) {
               return var2;
            }
         }

         class_2350 var9 = var2.method_10160();
         class_2350 var7 = var2.method_10170();

         for(int var8 = -1; var8 <= 2; ++var8) {
            if (this.ilIllIiIll(var5.method_10093(var9).method_10086(var8))) {
               return var2;
            }

            if (this.ilIllIiIll(var5.method_10093(var7).method_10086(var8))) {
               return var2;
            }
         }
      }

      return null;
   }

   protected void Illillliilli() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.lIliIlilliIliIlill = Iiiilllliiilll.field_1724.method_36454();
      }

      this.IlliIlillllliIlill = 0;
      this.illiIlillIiliIlill = null;
      this.liliIlilliiliIlill = null;
   }

   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1690.field_1894.method_23481(false);
         Iiiilllliiilll.field_1690.field_1913.method_23481(false);
         Iiiilllliiilll.field_1690.field_1849.method_23481(false);
         Iiiilllliiilll.field_1690.field_1886.method_23481(false);
      }

      this.IlliIlillllliIlill = 0;
      this.illiIlillIiliIlill = null;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) << 7))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) << 7))) ^ var5) << 6) << 9 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) << 7))) ^ var5) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) + '藜') ^ 27899) + var5) << 7))) ^ var5) << 6) >>> 7) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Iillllilll() {
      Iiiilllliiilll.field_1690.field_1913.method_23481(false);
      Iiiilllliiilll.field_1690.field_1849.method_23481(false);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 12 | (char)(var4[var5] >>> 3 | var4[var5] << 13) << 4))) - var5) ^ '陉') >>> 2 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 12 | (char)(var4[var5] >>> 3 | var4[var5] << 13) << 4))) - var5) ^ '陉') << 14) - var5) ^ '\ua4c7') ^ var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int iIlllIllll(class_2338 origin, class_2350 side) {
      int var3 = 0;
      class_2350 var4 = class_2350.method_10150((double)this.lIliIlilliIliIlill);

      for(int var5 = 0; var5 <= this.iiIiIlillIIliIlill.Iilllilliill(); ++var5) {
         class_2338 var6 = origin.method_10079(var4, var5).method_10079(side, 2);

         for(int var7 = -1; var7 <= 2; ++var7) {
            if (this.ilIllIiIll(var6.method_10086(var7))) {
               ++var3;
            }
         }
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5343901065205572335L ^ Long.rotateLeft(-8406810696137471896L, 5) ^ 6281948257302669716L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8343583512055372262L ^ Long.rotateLeft(86269574026279678L, 42) ^ -4046945058107173915L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5138742812628618058L ^ Long.rotateLeft(-4598859399509505386L, 52) ^ -5142060062591403749L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5313644569102940355L ^ Long.rotateLeft(8659552661872553812L, 39) ^ 1348458331520352474L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7121143346697256825L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8882845823514184804L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8920421831086191228L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8433659011551277981L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1562620677785233235L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4068577509835218516L;
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

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '虛') + var5) + var5) - var5) ^ 11358) + 28950) ^ var5) + '郰') - var5))) ^ var5) - var5) - '袡') + var5) << 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '虛') + var5) + var5) - var5) ^ 11358) + 28950) ^ var5) + '郰') - var5))) ^ var5) - var5) - '袡') + var5) >>> 11) + var5))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)(var4[var5] + '\udbb8'))) - var5))))) ^ 7793) + var5) ^ '\uea8e') - '쭅') - 955) ^ '눤'))) + 3550) + var5) ^ '셃') - '횱') ^ var5) + var5) ^ 'ꋎ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private class_2350 IIllllIlll() {
      long var7 = -4512500839653742985L;
      class_2338 var1 = Iiiilllliiilll.field_1724.method_24515();
      class_2350 var2 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      class_2350 var3 = var2.method_10160();
      class_2350 var4 = var2.method_10170();
      var7 ^= ((long)this.iIlllIllll(var1, var3) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)this.iIlllIllll(var1, var4) ^ var7) & -1L >>> 32;
      return (int)(var7 >>> 32) <= (int)var7 ? var3 : var4;
   }

   public IIlliIllIlliIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.ililIlillIiilIlill, this.liilIlilliiilIlill, this.IIIiIlilllIIiIlill, this.iIIiIlillIlIiIlill, this.llIiIlillilIiIlill, this.IiIiIlillliIiIlill, this.iiIiIlillIIliIlill});
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)var4[var5])) >>> 6 | (char)(~((char)var4[var5])) << 10) + 7710) << 4 | (char)((char)((char)(~((char)var4[var5])) >>> 6 | (char)(~((char)var4[var5])) << 10) + 7710) >>> 12))) << 14 | (char)(~((char)((char)((char)((char)(~((char)var4[var5])) >>> 6 | (char)(~((char)var4[var5])) << 10) + 7710) << 4 | (char)((char)((char)(~((char)var4[var5])) >>> 6 | (char)(~((char)var4[var5])) << 10) + 7710) >>> 12))) >>> 2) - 7286))))))) ^ 28576))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lIIlliIIll(class_2680 state, class_2338 pos) {
      return !state.method_26215() && !this.liIlliiIll(state) && state.method_26214(Iiiilllliiilll.field_1687, pos) >= 0.0F;
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         if (this.ililIlillIiilIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1724.method_36457((float)this.liilIlilliiilIlill.Iilllilliill());
         }

         if (this.IIIiIlilllIIiIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1724.method_36456(this.lIliIlilliIliIlill);
         }

         if (this.IiIiIlillliIiIlill.Iilllilliill()) {
            if (this.IlliIlillllliIlill > 0) {
               this.lllllillll();
               return;
            }

            class_2350 var1 = this.IlIllllIll();
            if (var1 != null) {
               this.illiIlillIiliIlill = this.IIllllIlll();
               this.IlliIlillllliIlill = 8;
               this.lllllillll();
               return;
            }
         }

         this.Iillllilll();
         if (this.llIiIlillilIiIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1690.field_1886.method_23481(true);
         }

         if (this.iIIiIlillIlIiIlill.Iilllilliill()) {
            Iiiilllliiilll.field_1690.field_1894.method_23481(true);
         }

      }
   }

   private void lllllillll() {
      --this.IlliIlillllliIlill;
      if (this.ililIlillIiilIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1724.method_36457((float)this.liilIlilliiilIlill.Iilllilliill());
      }

      if (this.IIIiIlilllIIiIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1724.method_36456(this.lIliIlilliIliIlill);
      }

      class_2350 var1 = class_2350.method_10150((double)this.lIliIlilliIliIlill);
      class_2350 var2 = var1.method_10160();
      if (this.illiIlillIiliIlill == var2) {
         Iiiilllliiilll.field_1690.field_1913.method_23481(true);
         Iiiilllliiilll.field_1690.field_1849.method_23481(false);
      } else {
         Iiiilllliiilll.field_1690.field_1849.method_23481(true);
         Iiiilllliiilll.field_1690.field_1913.method_23481(false);
      }

      if (this.iIIiIlillIlIiIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1690.field_1894.method_23481(true);
      }

      if (this.llIiIlillilIiIlill.Iilllilliill()) {
         Iiiilllliiilll.field_1690.field_1886.method_23481(true);
      }

      if (this.IlliIlillllliIlill <= 0) {
         this.Iillllilll();
         this.illiIlillIiliIlill = null;
      }

   }

   private boolean liIlliiIll(class_2680 state) {
      class_2248 var2 = state.method_26204();
      return var2 == class_2246.field_10382 || var2 == class_2246.field_10164;
   }
}
