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
import net.minecraft.class_3417;
import net.minecraft.class_5250;
import net.minecraft.class_638;

public class lIiIllIiiIiIllIi extends ilIllIiIll {
   private final iiIiiilIIliiil IillliIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil lillliIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil illlliIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private Boolean IIilliIIIi;
   private final lliliIIiililiIIi iillliIIIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private Boolean lIilliIIIi;

   protected void iIIIlIlIIl() {
      class_638 var1 = Iiiilllliiilll.field_1687;
      if (var1 != null && Iiiilllliiilll.field_1724 != null) {
         boolean var2 = var1.method_8419();
         boolean var3 = var1.method_8546();
         if (this.IIilliIIIi != null && this.lIilliIIIi != null) {
            if (var3 != this.lIilliIIIi) {
               this.lIilliIIIi = var3;
               if (this.IillliIIIi.Iilllilliill()) {
                  if (var3) {
                     this.iiiIlIIIll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
                  } else {
                     this.iiiIlIIIll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
                  }
               }
            }

            if (var2 != this.IIilliIIIi) {
               this.IIilliIIIi = var2;
               if (this.illlliIIIi.Iilllilliill() && !var3) {
                  if (var2) {
                     this.iiiIlIIIll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
                  } else {
                     this.iiiIlIIIll(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
                  }
               }
            }

         } else {
            this.IIilliIIIi = var2;
            this.lIilliIIIi = var3;
         }
      }
   }

   protected void Illillliilli() {
      this.IIilliIIIi = null;
      this.lIilliIIIi = null;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) ^ '윈') - '\udead') + var5) ^ 9827) - '\uf7a4'))) - 16352) ^ 5332) - 6081));
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
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)var4[var5])) + 2025) + var5) >>> 1 | (char)((char)((char)(~((char)var4[var5])) + 2025) + var5) << 15) ^ var5) - var5) << 13 | (char)((char)((char)((char)((char)((char)(~((char)var4[var5])) + 2025) + var5) >>> 1 | (char)((char)((char)(~((char)var4[var5])) + 2025) + var5) << 15) ^ var5) - var5) >>> 3) ^ '궧'))) + var5))) >>> 11 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)var4[var5])) + 2025) + var5) >>> 1 | (char)((char)((char)(~((char)var4[var5])) + 2025) + var5) << 15) ^ var5) - var5) << 13 | (char)((char)((char)((char)((char)((char)(~((char)var4[var5])) + 2025) + var5) >>> 1 | (char)((char)((char)(~((char)var4[var5])) + 2025) + var5) << 15) ^ var5) - var5) >>> 3) ^ '궧'))) + var5))) << 5))) - 'ꫵ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5976278992308504795L ^ Long.rotateLeft(254568922205140560L, 49) ^ 2646933608103968165L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5179775592910351802L ^ Long.rotateLeft(-2052882283858149353L, 12) ^ 7500598210043217285L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3036546799759430255L ^ Long.rotateLeft(-2437040224548889323L, 11) ^ 8710061323690418085L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5092455290552419886L ^ Long.rotateLeft(7095048593826731384L, 15) ^ 6589885769527206526L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8684047384174232060L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5453278071256986770L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -297971605168958553L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2500370311166166053L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1207075021132828552L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6069336597364226990L;
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] - 30595) + 23930) << 14 | (char)((char)(var4[var5] - 30595) + 23930) >>> 2) >>> 11 | (char)((char)((char)(var4[var5] - 30595) + 23930) << 14 | (char)((char)(var4[var5] - 30595) + 23930) >>> 2) << 5) - '铝'))))))) + var5) ^ var5) - 11202) - var5) << 6 | (char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] - 30595) + 23930) << 14 | (char)((char)(var4[var5] - 30595) + 23930) >>> 2) >>> 11 | (char)((char)((char)(var4[var5] - 30595) + 23930) << 14 | (char)((char)(var4[var5] - 30595) + 23930) >>> 2) << 5) - '铝'))))))) + var5) ^ var5) - 11202) - var5) >>> 10) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIiIllIiiIiIllIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illlliIIIi, this.IillliIIIi, this.lillliIIIi, this.iillliIIIi});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) << 7 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) >>> 9))) << 8 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) << 7 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) >>> 9))) >>> 8) + 26926) - var5) + var5) + 1790) >>> 1 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) << 7 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) >>> 9))) << 8 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) << 7 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) >>> 15 | (char)((char)((char)(-((char)((char)(~var4[var5]) + var5))) + '\ue526') ^ var5) << 1))) + var5) >>> 9))) >>> 8) + 26926) - var5) + var5) + 1790) << 15));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8714) + '郡'))) - var5) + var5) + 14206) ^ var5))) >>> 10 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) + 8714) + '郡'))) - var5) + var5) + 14206) ^ var5))) << 6) + '놝') + '蚰'))) - var5) - '뗄') ^ 18343) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiIlIIIll(String title, String subtitle, boolean started) {
      long var7 = 3863225819510867695L;
      String var4 = this.iillliIIIi.Iilllilliill();
      if (IliIlllilIi<invokedynamic>().equals(var4)) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(title, subtitle, started);
      } else {
         var7 ^= ((long)IliIlllilIi<invokedynamic>().equals(var4) << 32 ^ var7) & -1L << 32;
         class_5250 var6 = class_2561.method_43470(IliIlllilIi<invokedynamic>() + title + IliIlllilIi<invokedynamic>() + subtitle);
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_7353(var6, (boolean)((int)(var7 >>> 32)));
         }
      }

      if (this.lillliIIIi.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_5783(class_3417.field_14627, 0.6F, started ? 1.2F : 0.8F);
      }

   }
}
