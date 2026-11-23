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
import net.minecraft.class_10185;
import net.minecraft.class_746;

public class iillIIliIIilIIli extends ilIllIiIll {
   private final iiIiiilIIliiil iilIilIlIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil lilIilIlIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final double lllIilIlIi = 0.42;
   private final lliliIIiililiIIi illIilIlIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final IIIIlilllIIIlill IilIilIlIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1.4, (double)1.0F, (double)5.0F, 0.1);
   private static final double IllIilIlIi = 0.2873;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + 20691) + var5))) - '썵') + var5) + var5) ^ var5))))) + var5) + var5) ^ var5) - 9133) << 15 | (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + 20691) + var5))) - '썵') + var5) + var5) ^ var5))))) + var5) + var5) ^ var5) - 9133) >>> 1) ^ var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)(var4[var5] + '놦') - var5))) ^ '퍺')))))) << 2 | (char)((char)(-((char)(-((char)((char)(-((char)((char)(var4[var5] + '놦') - var5))) ^ '퍺')))))) >>> 14) ^ var5) + '쭈'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -286667735759457312L ^ Long.rotateLeft(3132461522689027336L, 47) ^ -351490128610979091L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3534420159396924954L ^ Long.rotateLeft(3280258304823630068L, 30) ^ 7031895015293203249L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7439085653699603205L ^ Long.rotateLeft(3420090710301209647L, 30) ^ 3770076662330109111L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8571895817082171524L ^ Long.rotateLeft(-8824062390985144508L, 10) ^ 186710896918479793L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6963205778725562988L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8068134413978092880L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7282934675897291008L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6943259103370174738L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7388437922264597761L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8419256211018590935L;
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) >>> 10 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) << 6) << 3 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) >>> 10 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) << 6) >>> 13))))) ^ 25459))) << 14 | (char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) >>> 10 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) << 6) << 3 | (char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) >>> 10 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) << 9 | (char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 7) << 6) >>> 13))))) ^ 25459))) >>> 2) - '툮'))) + var5) - '\ue7ef') - 22338) - 8560) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lIIlliIIll() {
      return IliIlllilIi<invokedynamic>().equals(this.illIilIlIi.Iilllilliill());
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) + var5) ^ 23503) ^ 1933) + 15357) >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) + var5) ^ 23503) ^ 1933) + 15357) << 5) + 13972))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iillIIliIIilIIli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illIilIlIi, this.IilIilIlIi, this.lilIilIlIi, this.iilIilIlIi});
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + var5))) ^ var5) ^ 14641) + 13898) + '뙚'))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iiiIlIIIll(class_746 p) {
      if (!p.method_31549().field_7479 && !p.method_6128() && !p.method_5765()) {
         if (!p.method_5799() && !p.method_5771() && !p.method_6101()) {
            if (!this.lilIilIlIi.Iilllilliill() || p.method_5624()) {
               class_10185 var2 = p.field_3913.field_54155;
               double var3 = (var2.comp_3159() ? (double)1.0F : (double)0.0F) - (var2.comp_3160() ? (double)1.0F : (double)0.0F);
               double var5 = (var2.comp_3161() ? (double)1.0F : (double)0.0F) - (var2.comp_3162() ? (double)1.0F : (double)0.0F);
               if (var3 != (double)0.0F || var5 != (double)0.0F) {
                  double var7 = 0.2873 * this.IilIilIlIi.Iilllilliill();
                  double[] var9 = IilIililIi.IliIlllilIi(var5, var3, var7, p.method_36454());
                  double var10 = p.method_18798().field_1351;
                  if (this.lIIlliIIll() && this.iilIilIlIi.Iilllilliill() && p.method_24828()) {
                     var10 = 0.42;
                  }

                  p.method_18800(var9[0], var10, var9[1]);
               }
            }
         }
      }
   }
}
