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
import net.minecraft.class_12125;
import net.minecraft.class_1268;
import net.minecraft.class_1799;
import net.minecraft.class_9334;

public class liIIIliliiIIIlil extends ilIllIiIll {
   private final iiIiiilIIliiil IIlliilIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iiIliilIil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int iIlliilIil = -1;
   private int lIlliilIil;
   private final iilliIlIIiliIl liIliilIil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 1, (-490709469 >>> 31 | -490709469 << 1) * -1056139499 ^ 2096190170);

   private void iiiIlIIIll() {
      class_1799 var1 = Iiiilllliiilll.field_1724.method_6047();
      class_12125 var2 = (class_12125)var1.method_58694(class_9334.field_63631);
      if (var2 != null) {
         Iiiilllliiilll.field_1761.method_75407(var2);
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1154306432208109096L ^ Long.rotateLeft(-6755531939052507662L, 50) ^ -1987618740454082004L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2230171290457137605L ^ Long.rotateLeft(-8861585980973690584L, 23) ^ 6283784420285100846L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5261339281057223210L ^ Long.rotateLeft(924773444820181180L, 13) ^ -792270896035586881L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8202055140192717539L ^ Long.rotateLeft(-6710272120719408766L, 47) ^ -2025164687564236765L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6083381799211504253L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1781208185506974179L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7077434491370944487L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6049866588495018570L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1551293907144909920L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8210405596881457625L;
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
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 12 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 4) ^ '鷍'))) >>> 11 | (char)(~((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 12 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 4) ^ '鷍'))) << 5) ^ var5) + 25882) - '\uf739') + '蕬') - var5))) >>> 15 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 12 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 4) ^ '鷍'))) >>> 11 | (char)(~((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) << 12 | (char)(var4[var5] >>> 11 | var4[var5] << 5) >>> 4) ^ '鷍'))) << 5) ^ var5) + 25882) - '\uf739') + '蕬') - var5))) << 1));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) << 6 | (char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) >>> 10) + var5))) ^ '췼') + 28777) - 6225) << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) << 6 | (char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) >>> 10) + var5))) ^ '췼') + 28777) - 6225) >>> 7) << 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) << 6 | (char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) >>> 10) + var5))) ^ '췼') + 28777) - 6225) << 9 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) << 6 | (char)((char)(-((char)((char)(var4[var5] ^ '\ue327') << 1 | (char)(var4[var5] ^ '\ue327') >>> 15))) + var5) >>> 10) + var5))) ^ '췼') + 28777) - 6225) >>> 7) >>> 14))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '\ue684') - var5) ^ var5) - 29395) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '\ue684') - var5) ^ var5) - 29395) - var5) << 1) + '\ua8cc') - var5))) ^ var5) + var5))) + var5) + '왢') + var5) >>> 8 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '\ue684') - var5) ^ var5) - 29395) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ '\ue684') - var5) ^ var5) - 29395) - var5) << 1) + '\ua8cc') - var5))) ^ var5) + var5))) + var5) + '왢') + var5) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      this.lIlliilIil = 0;
      this.iIlliilIil = -1;
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         if (Iiiilllliiilll.field_1755 != null) {
            this.IIillIiliIil(false);
         } else {
            switch (this.lIlliilIil) {
               case 0:
                  int var1 = this.liIliilIil.Iilllilliill() - 1;
                  this.iIlliilIil = Iiiilllliiilll.field_1724.method_31548().method_67532();
                  if (this.iiIliilIil.Iilllilliill() && Iiiilllliiilll.field_1724.method_24828()) {
                     Iiiilllliiilll.field_1690.field_1903.method_23481(true);
                  }

                  if (this.iIlliilIil != var1) {
                     this.lIIlliIIll(var1);
                  }

                  this.iiiIlIIIll();
                  this.lIlliilIil = 1;
                  return;
               default:
                  Iiiilllliiilll.field_1690.field_1903.method_23481(false);
                  if (this.IIlliilIil.Iilllilliill() && this.iIlliilIil != -1) {
                     this.lIIlliIIll(this.iIlliilIil);
                  }

                  this.iIlliilIil = -1;
                  this.IIillIiliIil(false);
            }
         }
      }
   }

   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1690 != null) {
         Iiiilllliiilll.field_1690.field_1903.method_23481(false);
      }

      if (this.IIlliilIil.Iilllilliill() && this.iIlliilIil != ((((~1531787993 ^ -99) >>> 1 | (~1531787993 ^ -99) << 31) << 29 | ((~1531787993 ^ -99) >>> 1 | (~1531787993 ^ -99) << 31) >>> 3) ^ 1246440532) && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         this.lIIlliIIll(this.iIlliilIil);
      }

      this.iIlliilIil = -1;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 'ﳓ') + 10815) << 8 | (char)((char)(var4[var5] - 'ﳓ') + 10815) >>> 8) - '틱') - 20753) - var5))) ^ var5) ^ '\uf6a8') << 5 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 'ﳓ') + 10815) << 8 | (char)((char)(var4[var5] - 'ﳓ') + 10815) >>> 8) - '틱') - 20753) - var5))) ^ var5) ^ '\uf6a8') >>> 11) + var5))))) - var5) ^ 11801) - '\ud80e') + var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liIIIliliiIIIlil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liIliilIil, this.iiIliilIil, this.IIlliilIil});
   }

   private void lIIlliIIll(int slot) {
      Iiiilllliiilll.field_1724.method_31548().method_61496(slot);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) << 6 | (char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) >>> 10) - '긭') + var5))) + '踤') << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) << 6 | (char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) >>> 10) - '긭') + var5))) + '踤') >>> 7) + var5))) + 12619) - 25163) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) << 6 | (char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) >>> 10) - '긭') + var5))) + '踤') << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) << 6 | (char)((char)((char)(~((char)(var4[var5] + var5))) << 5 | (char)(~((char)(var4[var5] + var5))) >>> 11) + var5) >>> 10) - '긭') + var5))) + '踤') >>> 7) + var5))) + 12619) - 25163) << 8) ^ 12919));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
