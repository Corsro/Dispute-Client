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
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_2338;
import net.minecraft.class_239;
import net.minecraft.class_2680;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;

public class IllillIllllillIl extends ilIllIiIll {
   private int llIlIlliIl = -1;
   private final iiIiiilIIliiil IlIlIlliIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         class_2338 var1 = this.iiiIlIIIll();
         if (var1 == null) {
            this.lIIlliIIll();
         } else {
            class_2680 var2 = Iiiilllliiilll.field_1687.method_8320(var1);
            if (var2.method_26215()) {
               this.lIIlliIIll();
            } else {
               class_1661 var3 = Iiiilllliiilll.field_1724.method_31548();
               int var4 = var3.method_67532();
               float[] var5 = new float[class_1661.method_7368()];
               boolean[] var6 = new boolean[var5.length];

               for(int var7 = 0; var7 < var5.length; ++var7) {
                  class_1799 var8 = var3.method_5438(var7);
                  var5[var7] = var8.method_7924(var2);
                  var6[var7] = var8.method_7951(var2);
               }

               int var9 = IIiiIlilIiiIli.IliIlllilIi(var5, var6, var4);
               if (var9 != var4) {
                  if (this.llIlIlliIl < 0) {
                     this.llIlIlliIl = var4;
                  }

                  var3.method_61496(var9);
               }

            }
         }
      }
   }

   public IllillIllllillIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IlIlIlliIl});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 28080) - var5) + 8001))) - var5) + var5) ^ 17881) ^ '鮈') + 27646) ^ 'ꨀ'))));
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
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) << 5))) - '\uf16c')) << 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) << 5))) - '\uf16c')) >>> 6))))) >>> 15 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) << 5))) - '\uf16c')) << 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) >>> 11 | (char)((char)((char)((char)(var4[var5] - var5) + var5) ^ var5) + var5) << 5))) - '\uf16c')) >>> 6))))) << 1) - 4437));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ 1431) + 13250) - var5) + var5) << 14 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) + var5) ^ 1431) + 13250) - var5) + var5) >>> 2) + 'ﶦ') ^ 367) - var5) + '쪔'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll() {
      if (!this.IlIlIlliIl.Iilllilliill()) {
         this.llIlIlliIl = -1;
      } else if (this.llIlIlliIl >= 0 && Iiiilllliiilll.field_1724 != null) {
         if (this.llIlIlliIl >= 0 && this.llIlIlliIl < class_1661.method_7368()) {
            Iiiilllliiilll.field_1724.method_31548().method_61496(this.llIlIlliIl);
         }

         this.llIlIlliIl = -1;
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4804111490700931003L ^ Long.rotateLeft(-912010494742499927L, 26) ^ -5285539962576079653L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1112760493400012200L ^ Long.rotateLeft(-961301090389227104L, 4) ^ -2753388880346636710L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7641714797119720229L ^ Long.rotateLeft(968263212173430170L, 21) ^ 1748158817519262149L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6563624291177362094L ^ Long.rotateLeft(-5747935899915035601L, 51) ^ -808895699608092225L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5716389006994443850L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -993480167368066200L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5702307244379372680L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7458848118839376344L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7673440054714525536L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4216762995385273792L;
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

   private class_2338 iiiIlIIIll() {
      if (!Iiiilllliiilll.field_1690.field_1886.method_1434()) {
         return null;
      } else {
         class_239 var2 = Iiiilllliiilll.field_1765;
         if (var2 instanceof class_3965) {
            class_3965 var1 = (class_3965)var2;
            return var1.method_17783() != class_240.field_1332 ? null : var1.method_17777();
         } else {
            return null;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) >>> 9 | (char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) << 7) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) >>> 9 | (char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) << 7) << 10) ^ var5))))) + var5) - 'ꃡ') - 4388) + 7677) - var5) >>> 6 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) >>> 9 | (char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) << 7) >>> 6 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) >>> 9 | (char)((char)((char)(~((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') >>> 10 | (char)((char)(var4[var5] << 7 | var4[var5] >>> 9) + '즻') << 6))) - '\ueb51') + var5) << 7) << 10) ^ var5))))) + var5) - 'ꃡ') - 4388) + 7677) - var5) << 10) ^ 24794));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.lIIlliIIll();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 32643) ^ var5) << 9 | (char)((char)((char)(-var4[var5]) + 32643) ^ var5) >>> 7) + '쫵') >>> 6 | (char)((char)((char)((char)((char)(-var4[var5]) + 32643) ^ var5) << 9 | (char)((char)((char)(-var4[var5]) + 32643) ^ var5) >>> 7) + '쫵') << 10) ^ '팿') ^ '졛')) + 3390))) + '햸') << 14 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 32643) ^ var5) << 9 | (char)((char)((char)(-var4[var5]) + 32643) ^ var5) >>> 7) + '쫵') >>> 6 | (char)((char)((char)((char)((char)(-var4[var5]) + 32643) ^ var5) << 9 | (char)((char)((char)(-var4[var5]) + 32643) ^ var5) >>> 7) + '쫵') << 10) ^ '팿') ^ '졛')) + 3390))) + '햸') >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
