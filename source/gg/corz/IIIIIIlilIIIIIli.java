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
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1802;

public class IIIIIIlilIIIIIli extends ilIllIiIll {
   private final iilliIlIIiliIl llIiiIIlIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 1, 5);
   private int ilIiiIIlIi;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) >>> 15 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) << 1) ^ '퐙') ^ var5) ^ 32080) ^ var5) + '\ue9aa') ^ 10339) - var5))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) >>> 15 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) << 1) ^ '퐙') ^ var5) ^ 32080) ^ var5) + '\ue9aa') ^ 10339) - var5))) >>> 2) - var5)) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) >>> 15 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) << 1) ^ '퐙') ^ var5) ^ 32080) ^ var5) + '\ue9aa') ^ 10339) - var5))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) >>> 15 | (char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) << 1) ^ '퐙') ^ var5) ^ 32080) ^ var5) + '\ue9aa') ^ 10339) - var5))) >>> 2) - var5)) << 7))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) << 2 | (char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) >>> 14) ^ 32270) + var5) - var5) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) << 2 | (char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) >>> 14) ^ 32270) + var5) - var5) >>> 3))))) << 6 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) << 2 | (char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) >>> 14) ^ 32270) + var5) - var5) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) << 2 | (char)((char)(~((char)((char)(var4[var5] + 25600) + '絛'))) >>> 5 | (char)(~((char)((char)(var4[var5] + 25600) + '絛'))) << 11) >>> 14) ^ 32270) + var5) - var5) >>> 3))))) >>> 10) - 7025) ^ 1433) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Illillliilli() {
      this.ilIiiIIlIi = 0;
   }

   public void Iilililiiili() {
      this.ilIiiIIlIi = 0;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2257669637520126544L ^ Long.rotateLeft(-8349063328516669824L, 4) ^ 8408809923938824291L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4729738900209051549L ^ Long.rotateLeft(171137304283418013L, 55) ^ 4329460341297723472L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3811682271860616533L ^ Long.rotateLeft(-5787566716234394882L, 48) ^ -8244279421484229779L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4286524850438825921L ^ Long.rotateLeft(286949855906576918L, 57) ^ -982622482787622824L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6398950955049867612L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1189124414688612132L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5832169595140000881L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8058927190846028273L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4949831673107541283L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2844864421209122403L;
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

   private static int iiiIlIIIll(int slotIndex) {
      return slotIndex < ((-1067875226 >>> 25 | -1067875226 << 7) * 723362913 ^ 1348401001) ? (((-498269770 - 121) * -2083697005 << 13 | (-498269770 - 121) * -2083697005 >>> 19) ^ 696316810) + slotIndex : slotIndex;
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(40).method_31574(class_1802.field_8288)) {
            this.ilIiiIIlIi = this.llIiiIIlIi.Iilllilliill();
         } else if (this.ilIiiIIlIi > 0) {
            --this.ilIiiIIlIi;
         } else {
            int var1 = this.lIIlliIIll(class_1802.field_8288);
            if (var1 != -1) {
               if (lIlillliIlilll.IliIlllilIi(this)) {
                  try {
                     Iiiilllliiilll.field_1761.method_2906(Iiiilllliiilll.field_1724.field_7512.field_7763, iiiIlIIIll(var1), 40, class_1713.field_7791, Iiiilllliiilll.field_1724);
                  } finally {
                     lIlillliIlilll.liiiIIllIl(this);
                  }

                  this.ilIiiIIlIi = this.llIiiIIlIi.Iilllilliill();
               }
            }
         }
      }
   }

   public IIIIIIlilIIIIIli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.llIiiIIlIi});
      this.ilIiiIIlIi = 0;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) << 11) ^ '촣') + var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) << 11) ^ '촣') + var5) ^ var5) >>> 11) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) << 11) ^ '촣') + var5) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') << 10 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + '똶') - 6250) ^ var5))) ^ '쟇') ^ var5))) - '\ud9a0') + '꾖') >>> 6) << 11) ^ '촣') + var5) ^ var5) >>> 11) << 5) ^ var5) ^ 22721) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) << 5 | (char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) >>> 11) << 4 | (char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) << 5 | (char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) >>> 11) >>> 12))) >>> 11 | (char)(~((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) << 5 | (char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) >>> 11) << 4 | (char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) << 5 | (char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) >>> 11 | (char)((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5) + var5) ^ var5) << 5))) - 24471))))) >>> 11) >>> 12))) << 5) - 30219) + 27504) + '쀸'))) + var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) >>> 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) << 7))) + var5) << 7 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) >>> 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) << 7))) + var5) >>> 9))) - 'ꪙ') >>> 5 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) >>> 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) << 7))) + var5) << 7 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) >>> 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) >>> 2 | (char)((char)(~((char)((char)(-((char)(var4[var5] + 11076))) ^ var5))) - var5) << 14) ^ var5) ^ '돩'))) ^ 25511) + var5) << 7))) + var5) >>> 9))) - 'ꪙ') << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int lIIlliIIll(class_1792 item) {
      if (Iiiilllliiilll.field_1724 == null) {
         return -1;
      } else {
         for(int var2 = 0; var2 < 36; ++var2) {
            if (Iiiilllliiilll.field_1724.method_31548().method_5438(var2).method_31574(item)) {
               return var2;
            }
         }

         return -1;
      }
   }
}
