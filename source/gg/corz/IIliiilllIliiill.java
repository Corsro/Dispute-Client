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

public final class IIliiilllIliiill {
   public static float iIlIlllllill(int tickDelta, float ticksLeft) {
      return Math.max(0.0F, (float)tickDelta - ticksLeft) / 20.0F;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) << 2) ^ 6550) ^ 19701))) ^ 18169) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) << 2) ^ 6550) ^ 19701))) ^ 18169) << 3) - '픂') ^ var5) - '\uf028') ^ '\uf5e3') << 4 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) << 2) ^ 6550) ^ 19701))) ^ 18169) >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) - var5) ^ var5) ^ 9567) ^ 23944) - var5) << 2) ^ 6550) ^ 19701))) ^ 18169) << 3) - '픂') ^ var5) - '\uf028') ^ '\uf5e3') >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7426534209527718611L ^ Long.rotateLeft(3995273331934767716L, 16) ^ -6048378834526348306L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1246808292030123418L ^ Long.rotateLeft(1796061740161532581L, 6) ^ 4637670581026796398L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3463167550634223851L ^ Long.rotateLeft(614030729543946421L, 57) ^ 32281950838432740L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6322649198514958148L ^ Long.rotateLeft(-3870723229170474840L, 34) ^ 2458701662377927537L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -903528109335386962L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2632736309848792793L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6479603895046158843L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6014553707944024086L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1449108850205943239L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1020319072311589595L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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

   public static float iliIiiliiiii(float fraction) {
      return -90.0F + 180.0F * fraction;
   }

   public static float IIIllIIliIIl(float fraction) {
      return 360.0F * fraction;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 12680) << 12 | (char)((char)(var4[var5] - var5) ^ 12680) >>> 4) - var5) - '엝'))) >>> 9 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ 12680) << 12 | (char)((char)(var4[var5] - var5) ^ 12680) >>> 4) - var5) - '엝'))) << 7) - 7307))) + 'ꓒ') - var5) + '隝') - var5)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 3705))) << 3 | (char)(~((char)(var4[var5] - 3705))) >>> 13))) + var5) - 24533) << 3 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 3705))) << 3 | (char)(~((char)(var4[var5] - 3705))) >>> 13))) + var5) - 24533) >>> 13) ^ var5) ^ 15265) ^ var5) - 20631) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 3705))) << 3 | (char)(~((char)(var4[var5] - 3705))) >>> 13))) + var5) - 24533) << 3 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] - 3705))) << 3 | (char)(~((char)(var4[var5] - 3705))) >>> 13))) + var5) - 24533) >>> 13) ^ var5) ^ 15265) ^ var5) - 20631) << 15) ^ '팹') + '뢡') + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String lIiiIiIlilli(int tenths) {
      return tenths / (((~-1734193921 << 11 | ~-1734193921 >>> 21) >>> 15 | (~-1734193921 << 11 | ~-1734193921 >>> 21) << 17) ^ 108387130) + IiIlliIliiIl<invokedynamic>() + tenths % (((~(-624805962 * -654471207) << 7 | ~(-624805962 * -654471207) >>> 25) << 29 | (~(-624805962 * -654471207) << 7 | ~(-624805962 * -654471207) >>> 25) >>> 3) ^ 1445055389);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '궹') >>> 8 | (char)(var4[var5] ^ '궹') << 8) + 22802) - var5) + '\ue0bb') + var5) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '궹') >>> 8 | (char)(var4[var5] ^ '궹') << 8) + 22802) - var5) + '\ue0bb') + var5) >>> 1) - var5) ^ 24574))) + '\ue420') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float liiiIIllIl(int age, float ticksLeft, int tickDelta) {
      float var3 = (float)(age + tickDelta);
      return var3 <= 0.0F ? 1.0F : Illiiiilllliiiil.lIiiIiIlilli(((float)age + ticksLeft) / var3);
   }

   public static float IlIlllIlilIl(float arcLength, float totalLength) {
      return (1.0F - IliIlllilIi(arcLength / 7.0F)) * IliIlllilIi((totalLength - arcLength) / 2.0F);
   }

   public static float IliIlllilIi(float t) {
      t = Illiiiilllliiiil.lIiiIiIlilli(t);
      return t * t * (3.0F - 2.0F * t);
   }

   private IIliiilllIliiill() {
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 14 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 2) + var5))) ^ var5) >>> 3 | (char)((char)(~((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 14 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 2) + var5))) ^ var5) << 13) + var5) ^ 24372) << 9 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 14 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 2) + var5))) ^ var5) >>> 3 | (char)((char)(~((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) << 14 | (char)(var4[var5] << 5 | var4[var5] >>> 11) >>> 2) + var5))) ^ var5) << 13) + var5) ^ 24372) >>> 7))))) - '\ud8d8'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IilliliilIIi(float seconds) {
      return Math.max(0, Math.round(seconds * 10.0F));
   }
}
