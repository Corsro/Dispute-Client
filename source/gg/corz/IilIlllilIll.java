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
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3414;

public final class IilIlllilIll {
   private static final class_310 iiilIIIiIIIiIIIi = class_310.method_1551();
   public static final class_3414 lIIiIIIiiIIiIIIi = class_3414.method_47908(class_2960.method_60655(IilliliilIIi<invokedynamic>(), IilliliilIIi<invokedynamic>()));

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 7744) ^ 28204) - var5) ^ 21178) >>> 12 | (char)((char)((char)((char)(var4[var5] - 7744) ^ 28204) - var5) ^ 21178) << 4) + var5) + 31489) + var5) + '묕') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 7744) ^ 28204) - var5) ^ 21178) >>> 12 | (char)((char)((char)((char)(var4[var5] - 7744) ^ 28204) - var5) ^ 21178) << 4) + var5) + 31489) + var5) + '묕') << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1493785596443189352L ^ Long.rotateLeft(476757549141754235L, 55) ^ -8136848110959207128L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8317983592047519800L ^ Long.rotateLeft(1474252547588160554L, 19) ^ 6026437853490986033L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4590211380489693970L ^ Long.rotateLeft(2418187407517823742L, 26) ^ -7685041451253378021L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3217055082146788060L ^ Long.rotateLeft(-7222729072880340801L, 18) ^ 618330834044960569L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4547096587033463815L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8144801339068191166L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3930881186435802380L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2135941435918437720L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6885000685394958126L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2963840615504529994L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) << 13) + 25086))) - 8706) << 4 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) << 13) + 25086))) - 8706) >>> 12))) << 15 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) << 13) + 25086))) - 8706) << 4 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) << 6 | (char)((char)(var4[var5] + var5) + var5) >>> 10) ^ var5))) + 22725) << 13) + 25086))) - 8706) >>> 12))) >>> 1) + 16042))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void liiiIIllIl() {
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + '\uda31') ^ 7175) + var5) + var5))) ^ var5) + var5) - var5))) + var5) ^ 2883) ^ '\udc6c'))) + 12483) ^ '쌌') - var5) ^ var5) << 11 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + '\uda31') ^ 7175) + var5) + var5))) ^ var5) + var5) - var5))) + var5) ^ 2883) ^ '\udc6c'))) + 12483) ^ '쌌') - var5) ^ var5) >>> 5));
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
         var4[var5] = (char)((char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) ^ '퇝') + var5)))))))))) << 13 | (char)(~((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) ^ '퇝') + var5)))))))))) >>> 3));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '뤨') << 13 | (char)((char)(var4[var5] + var5) ^ '뤨') >>> 3) << 15 | (char)((char)((char)(var4[var5] + var5) ^ '뤨') << 13 | (char)((char)(var4[var5] + var5) ^ '뤨') >>> 3) >>> 1) - var5) + 1627))) + '輟') + '\ue9fc'))) >>> 8 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '뤨') << 13 | (char)((char)(var4[var5] + var5) ^ '뤨') >>> 3) << 15 | (char)((char)((char)(var4[var5] + var5) ^ '뤨') << 13 | (char)((char)(var4[var5] + var5) ^ '뤨') >>> 3) >>> 1) - var5) + 1627))) + '輟') + '\ue9fc'))) << 8))) - var5) - 15716));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill() {
      return false;
   }

   public static void IliIlllilIi() {
      if (iiilIIIiIIIiIIIi.field_1724 != null) {
         iiilIIIiIIIiIIIi.field_1724.method_5783(lIIiIIIiiIIiIIIi, 1.0F, 1.0F);
      }
   }
}
