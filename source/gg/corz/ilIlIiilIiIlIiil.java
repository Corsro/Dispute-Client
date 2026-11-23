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
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3489;

public enum ilIlIiilIiIlIiil {
   IIIliillil(class_1304.field_6169),
   iIiIiillil((class_1304)null),
   lliIiillil((class_1304)null),
   liiIiillil((class_1304)null),
   IiiIiillil((class_1304)null),
   IlIliillil(class_1304.field_6166),
   IIiIiillil((class_1304)null),
   iiiIiillil((class_1304)null),
   lIIliillil(class_1304.field_6174),
   lIiIiillil((class_1304)null),
   IliIiillil((class_1304)null);

   private final class_1304 llIliillil;
   iIIliillil(class_1304.field_6172),
   iliIiillil((class_1304)null);

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)(~((char)(-((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) << 4 | (char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 12) >>> 6 | (char)((char)(var4[var5] >>> 3 | var4[var5] << 13) << 4 | (char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 12) << 10) - 'ꝴ') + var5) ^ var5) - var5) ^ var5))) ^ var5))))))))))))) ^ '耂') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean liiiIIllIl() {
      return this.llIliillil != null;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 4 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 12) - var5) - '쩣') ^ var5) >>> 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) << 4 | (char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 12) - var5) - '쩣') ^ var5) << 1) - var5) ^ var5) + 11326) + '芫') ^ var5))) - '齦'))) + 13036) + var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) << 2 | (char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) >>> 14) ^ 48) ^ 18266) + '듴') - '頔') ^ '\uf665') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) << 2 | (char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) >>> 14) ^ 48) ^ 18266) + '듴') - '頔') ^ '\uf665') >>> 9))) << 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) << 2 | (char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) >>> 14) ^ 48) ^ 18266) + '듴') - '頔') ^ '\uf665') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) << 2 | (char)((char)(~((char)((char)(~var4[var5]) ^ 18833))) + 26772) >>> 14) ^ 48) ^ 18266) + '듴') - '頔') ^ '\uf665') >>> 9))) >>> 13) ^ var5)))) + 23465));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private ilIlIiilIiIlIiil(class_1304 var3) {
      this.llIliillil = var3;
   }

   // $FF: synthetic method
   private static ilIlIiilIiIlIiil[] IilliliilIIi() {
      return new ilIlIiilIiIlIiil[]{IIiIiillil, lIiIiillil, iIiIiillil, IliIiillil, lliIiillil, iliIiillil, IiiIiillil, liiIiillil, iiiIiillil, IIIliillil, lIIliillil, iIIliillil, IlIliillil};
   }

   public class_1304 IliIlllilIi() {
      return this.llIliillil;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2430) + '\udf40') + 3433) + '연') + '\ud8dd') - 12793) ^ '띦') << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2430) + '\udf40') + 3433) + '연') + '\ud8dd') - 12793) ^ '띦') >>> 11))) ^ '졟'))))) + 'ꇦ') + 7549))) << 12 | (char)(~((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2430) + '\udf40') + 3433) + '연') + '\ud8dd') - 12793) ^ '띦') << 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2430) + '\udf40') + 3433) + '연') + '\ud8dd') - 12793) ^ '띦') >>> 11))) ^ '졟'))))) + 'ꇦ') + 7549))) >>> 4) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5269069430182579409L ^ Long.rotateLeft(-8881583795893022219L, 35) ^ 8869474776531343198L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6868126415192439183L ^ Long.rotateLeft(8899900344280476898L, 39) ^ -559481207716036004L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1493244457339854183L ^ Long.rotateLeft(-6457510565351592790L, 1) ^ 6042815732699286213L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -160108664149808479L ^ Long.rotateLeft(-7374194901276598421L, 28) ^ -6196746433799116677L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1574290532537879502L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1864167940964208156L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7316330330523770290L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2414570578351951825L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6242207105450352704L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8102257150665548449L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') << 6) << 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') << 6) >>> 2) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') << 6) << 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') >>> 10 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 9 | (char)((char)(var4[var5] + var5) - var5) >>> 7) - var5) + 20934) + 6017) - var5))) + var5) + '邥') << 6) >>> 2) << 8) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static ilIlIiilIiIlIiil iIlIlllllill(class_1799 s) {
      if (s != null && !s.method_7960() && s.method_7914() == 1) {
         if (s.method_31573(class_3489.field_42611)) {
            return IIiIiillil;
         } else if (s.method_31573(class_3489.field_42612)) {
            return lIiIiillil;
         } else if (s.method_31574(class_1802.field_49814)) {
            return iIiIiillil;
         } else if (s.method_31574(class_1802.field_8547)) {
            return IliIiillil;
         } else if (s.method_31573(class_3489.field_63257)) {
            return lliIiillil;
         } else if (s.method_31573(class_3489.field_42614)) {
            return iliIiillil;
         } else if (s.method_31573(class_3489.field_42615)) {
            return IiiIiillil;
         } else if (s.method_31574(class_1802.field_8102)) {
            return liiIiillil;
         } else if (s.method_31574(class_1802.field_8399)) {
            return iiiIiillil;
         } else if (s.method_31573(class_3489.field_48297)) {
            return IIIliillil;
         } else if (s.method_31573(class_3489.field_48296)) {
            return lIIliillil;
         } else if (s.method_31573(class_3489.field_48295)) {
            return iIIliillil;
         } else {
            return s.method_31573(class_3489.field_48294) ? IlIliillil : null;
         }
      } else {
         return null;
      }
   }
}
