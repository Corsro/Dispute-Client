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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2879;
import net.minecraft.class_239.class_240;

public class IllilIIilllilIIi extends ilIllIiIll {
   private boolean lIiilIiiil;
   private int IIiilIiiil;
   public final lliliIIiililiIIi lililIiiil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private class_2824 iililIiiil;

   protected void Iilililiiili() {
      this.iililIiiil = null;
      this.IIiilIiiil = 0;
      this.lIiilIiiil = false;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - 30636) - var5) - var5))) >>> 6 | (char)(-((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - 30636) - var5) - var5))) << 10) ^ var5) - '챞') << 15 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - 30636) - var5) - var5))) >>> 6 | (char)(-((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - 30636) - var5) - var5))) << 10) ^ var5) - '챞') >>> 1) - var5) - var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IllilIIilllilIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lililIiiil});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] >>> 9 | var4[var5] << 7))) ^ '\udf49') - var5))) ^ var5) + var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] >>> 9 | var4[var5] << 7))) ^ '\udf49') - var5))) ^ var5) + var5) << 8) ^ 16868) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7848843661848883629L ^ Long.rotateLeft(1071712283256195286L, 11) ^ -5156713625499380207L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -645394141035365391L ^ Long.rotateLeft(6779284205958918418L, 31) ^ -83565303053576729L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8103182650975435196L ^ Long.rotateLeft(-5626716466590668147L, 45) ^ 9032632265064550802L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8391030493246176210L ^ Long.rotateLeft(6036856014209659943L, 41) ^ 7267156678059747960L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6716968504220938947L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1263670273850383152L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4664062928462578738L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8852896408013231700L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7806481062067237253L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2689127748021700589L;
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

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (this.iiiIlIIIll() && !this.lIiilIiiil) {
         class_2596 var3 = event.lIiilIIIIi;
         if (var3 instanceof class_2824) {
            class_2824 var2 = (class_2824)var3;
            if (IIIliiIilIIliiIi.IliIlllilIi(var2)) {
               class_1297 var5 = Iiiilllliiilll.field_1687.method_8469(IIIliiIilIIliiIi.liiiIIllIl(var2));
               if (!(var5 instanceof class_1657)) {
                  return;
               }

               if (this.lililIiiil.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
                  this.lIIlliIIll(0.0625F);
                  this.lIIlliIIll(0.0F);
               } else {
                  this.iililIiiil = var2;
                  if (this.lililIiiil.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
                     Iiiilllliiilll.field_1724.method_6043();
                  } else {
                     class_243 var4 = Iiiilllliiilll.field_1724.method_18798();
                     Iiiilllliiilll.field_1724.method_18799(new class_243(var4.field_1352, var4.field_1351 + Double.longBitsToDouble(-1256261084195756056L ^ -3363082812538333989L), var4.field_1350));
                  }

                  this.IIiilIiiil = this.lililIiiil.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) ? (((-1903891471 << 3 | -1903891471 >>> 29) << 19 | (-1903891471 << 3 | -1903891471 >>> 29) >>> 13) << 1 | ((-1903891471 << 3 | -1903891471 >>> 29) << 19 | (-1903891471 << 3 | -1903891471 >>> 29) >>> 13) >>> 31) ^ -121159053 : 1;
                  event.IliIlllilIi();
               }
            }
         }

         if (event.lIiilIIIIi instanceof class_2879 && !this.lililIiiil.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) && this.iililIiiil != null) {
            event.IliIlllilIi();
         }

      }
   }

   private void lIIlliIIll(float dy) {
      Iiiilllliiilll.field_1724.field_3944.method_52787(new class_2828.class_2829(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23318() + (double)dy, Iiiilllliiilll.field_1724.method_23321(), false, Iiiilllliiilll.field_1724.field_5976));
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) >>> 12) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) >>> 12) ^ var5) >>> 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) >>> 12) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') << 8 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + '蚮') ^ 28899) - var5) + var5) + '뻱') >>> 8) + var5) + 8267) ^ 17066) >>> 12) ^ var5) >>> 8) << 6) ^ 20511));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) << 11 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) >>> 5) - var5) ^ var5) + var5) + '\uf49e'))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) << 11 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) >>> 5) - var5) ^ var5) + var5) + '\uf49e'))) >>> 5) - var5))) ^ 1403) >>> 4 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) << 11 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) >>> 5) - var5) ^ var5) + var5) + '\uf49e'))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) << 11 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) >>> 13 | (char)((char)((char)((char)(-var4[var5]) >>> 7 | (char)(-var4[var5]) << 9) - 1435) - var5) << 3) ^ var5) >>> 13) >>> 5) - var5) ^ var5) + var5) + '\uf49e'))) >>> 5) - var5))) ^ 1403) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      if (this.iililIiiil != null) {
         if (this.IIiilIiiil > 0) {
            --this.IIiilIiiil;
         } else {
            this.lIiilIiiil = true;
            class_239 var1 = Iiiilllliiilll.field_1765;
            if (var1 != null && var1.method_17783() == class_240.field_1331 && Iiiilllliiilll.field_1724 != null) {
               Iiiilllliiilll.field_1724.field_3944.method_52787(this.iililIiiil);
               Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
            }

            this.lIiilIiiil = false;
            this.iililIiiil = null;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(var4[var5] - var5))))) << 13 | (char)(~((char)(~((char)(var4[var5] - var5))))) >>> 3))) ^ 28338) ^ 30947) + 6793) + '鋲') - var5) ^ var5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(var4[var5] - var5))))) << 13 | (char)(~((char)(~((char)(var4[var5] - var5))))) >>> 3))) ^ 28338) ^ 30947) + 6793) + '鋲') - var5) ^ var5) - var5) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iiiIlIIIll() {
      return Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724.method_24828() && !Iiiilllliiilll.field_1724.method_5869() && !Iiiilllliiilll.field_1724.method_5771() && !Iiiilllliiilll.field_1724.method_6101();
   }
}
