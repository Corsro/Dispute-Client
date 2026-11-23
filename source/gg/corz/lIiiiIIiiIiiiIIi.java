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
import net.minecraft.class_1656;
import net.minecraft.class_746;

public class lIiiiIIiiIiiiIIi extends ilIllIiIll {
   private float liilliiiil = 0.05F;
   private final IIIIlilllIIIlill ililliiiil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.5F, 0.1, (double)5.0F, 0.05);
   private static final float iIilliiiil = 0.05F;
   private final IIIIlilllIIIlill llilliiiil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.8, 0.1, (double)5.0F, 0.05);
   private boolean Iiilliiiil = false;
   private final lliliIIiililiIIi Ililliiiil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 20698) << 5 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) - 20698) >>> 11))))) - '맪') + '졎')))) - 6060) - var5))) ^ '쳋') >>> 12 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - 20698) << 5 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) - 20698) >>> 11))))) - '맪') + '졎')))) - 6060) - var5))) ^ '쳋') << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null) {
         class_1656 var2 = var1.method_31549();
         if (this.iiiIlIIIll()) {
            if (!this.Iiilliiiil) {
               this.liilliiiil = var2.method_7252();
               this.Iiilliiiil = true;
            }

            var2.field_7478 = true;
            var2.field_7479 = true;
            var2.method_7248((float)((double)0.05F * this.llilliiiil.Iilllilliill()));
         } else {
            this.IlIllllIll(var2);
         }

         var1.field_6017 = (double)0.0F;
      }
   }

   public lIiiiIIiiIiiiIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.Ililliiiil, this.llilliiiil, this.ililliiiil});
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3447456259668964298L ^ Long.rotateLeft(4458424267662756192L, 59) ^ -1096856964857501313L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8611858672462307655L ^ Long.rotateLeft(-6718020631055483223L, 12) ^ -4233243862775509267L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5484949189706376596L ^ Long.rotateLeft(8588253704689540978L, 61) ^ 9002058383444676726L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1718666200974814652L ^ Long.rotateLeft(8599228082161608081L, 27) ^ -7405433451393742380L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -88758281359977406L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2947143110950770852L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3466733755714161661L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5428397893258153585L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4001564342528521164L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5422039933616803692L;
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

   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         this.IlIllllIll(Iiiilllliiilll.field_1724.method_31549());
      }

   }

   private void IlIllllIll(class_1656 ab) {
      if (this.Iiilliiiil) {
         ab.method_7248(this.liilliiiil);
         if (!ab.field_7477) {
            ab.field_7478 = false;
            ab.field_7479 = false;
         }

         this.Iiilliiiil = false;
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9) + '靏') - var5) << 8 | (char)((char)((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9) + '靏') - var5) >>> 8) ^ var5) + '꜎') + var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9) + '靏') - var5) << 8 | (char)((char)((char)((char)(var4[var5] + var5) << 7 | (char)(var4[var5] + var5) >>> 9) + '靏') - var5) >>> 8) ^ var5) + '꜎') + var5) << 2))))))) + var5))) + var5) + 21482));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iiiIlIIIll() {
      return IliIlllilIi<invokedynamic>().equals(this.Ililliiiil.Iilllilliill());
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 1683) + var5))) << 10 | (char)(-((char)((char)(var4[var5] + 1683) + var5))) >>> 6) - 16666))))) - var5))))) << 3 | (char)(-((char)(~((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 1683) + var5))) << 10 | (char)(-((char)((char)(var4[var5] + 1683) + var5))) >>> 6) - 16666))))) - var5))))) >>> 13) - '鱱') << 14 | (char)((char)((char)(-((char)(~((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 1683) + var5))) << 10 | (char)(-((char)((char)(var4[var5] + 1683) + var5))) >>> 6) - 16666))))) - var5))))) << 3 | (char)(-((char)(~((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 1683) + var5))) << 10 | (char)(-((char)((char)(var4[var5] + 1683) + var5))) >>> 6) - 16666))))) - var5))))) >>> 13) - '鱱') >>> 2) + '衟') - var5) + var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIIlliIIll(class_746 p) {
      if (this.iiiIlIIIll()) {
         return false;
      } else if (p.method_5765()) {
         return false;
      } else {
         class_10185 var2 = p.field_3913.field_54155;
         double var3 = (var2.comp_3159() ? (double)1.0F : (double)0.0F) - (var2.comp_3160() ? (double)1.0F : (double)0.0F);
         double var5 = (var2.comp_3161() ? (double)1.0F : (double)0.0F) - (var2.comp_3162() ? (double)1.0F : (double)0.0F);
         double[] var7 = IilIililIi.IliIlllilIi(var5, var3, this.llilliiiil.Iilllilliill(), p.method_36454());
         double var8 = (double)0.0F;
         boolean var10 = Iiiilllliiilll.field_1690.field_1903.method_1434();
         boolean var11 = Iiiilllliiilll.field_1690.field_1832.method_1434();
         if (var10 != var11) {
            var8 = var10 ? this.ililliiiil.Iilllilliill() : -this.ililliiiil.Iilllilliill();
         }

         p.method_18800(var7[0], var8, var7[1]);
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) >>> 3) + var5))) - 9589) + var5))) >>> 8 | (char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) >>> 3) + var5))) - 9589) + var5))) << 8) - 28545) + var5) ^ var5) >>> 7 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) >>> 3) + var5))) - 9589) + var5))) >>> 8 | (char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) << 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 24304) + var5) - var5)) - 2197) >>> 15))) >>> 3) + var5))) - 9589) + var5))) << 8) - 28545) + var5) ^ var5) << 9));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '阷') >>> 4 | (char)(var4[var5] + '阷') << 12) ^ '辟') - '飴') ^ var5) ^ var5) + var5) ^ 20970) + '\uf042'))))) ^ var5) ^ 8188))) ^ 28008));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
