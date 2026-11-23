package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiiiIiilIIIIliil {
   public static float liiiIIllIl(float currentYaw, float desiredWrappedYaw) {
      return currentYaw + IliIlllilIi(desiredWrappedYaw - currentYaw);
   }

   public static float IliIlllilIi(float degrees) {
      float var1 = degrees % 360.0F;
      if (var1 >= 180.0F) {
         var1 -= 360.0F;
      }

      if (var1 < -180.0F) {
         var1 += 360.0F;
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ var5) << 6 | (char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ var5) >>> 10) - var5))) ^ 'ﴑ'))) << 1 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ var5) << 6 | (char)((char)((char)((char)(var4[var5] ^ var5) << 6 | (char)(var4[var5] ^ var5) >>> 10) + var5) ^ var5) >>> 10) - var5))) ^ 'ﴑ'))) >>> 15) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String iliIiiliiiii(String owner, float desiredWrapped, float chosenContinuous, float currentYaw) {
      return String.format(Locale.ROOT, IIIllIIliIIl<invokedynamic>(), owner, desiredWrapped, chosenContinuous, currentYaw, iIlIlllllill(desiredWrapped, chosenContinuous), currentYaw - desiredWrapped, IilliliilIIi(desiredWrapped, chosenContinuous));
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 24762) + var5) ^ 10393) ^ '\uead3') ^ var5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] ^ 24762) + var5) ^ 10393) ^ '\uead3') ^ var5) << 9) + var5) - 3827))) - 23107) - var5) << 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 24762) + var5) ^ 10393) ^ '\uead3') ^ var5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] ^ 24762) + var5) ^ 10393) ^ '\uead3') ^ var5) << 9) + var5) - 3827))) - 23107) - var5) >>> 9) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float iIlIlllllill(float desiredWrappedYaw, float currentYaw) {
      return IliIlllilIi(currentYaw - desiredWrappedYaw);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5885193623133119614L ^ Long.rotateLeft(3342730595217877892L, 40) ^ -4174926268862596123L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2312089884252850781L ^ Long.rotateLeft(-1311138524021078674L, 24) ^ 1471156167705729634L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7153411550286904154L ^ Long.rotateLeft(-4140856303788103537L, 63) ^ -3189117973368512330L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7382594111587208751L ^ Long.rotateLeft(-1111428964187962620L, 45) ^ 3994826489796137050L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5131592036204645900L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7957599981804616030L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4834246152522874915L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7138670289351503469L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4620221222433344289L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6276487895626766295L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '鎅') >>> 4 | (char)((char)((char)(var4[var5] ^ var5) + var5) ^ '鎅') << 12) + 26681) - var5) - var5) - 11000) + 6588))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ '鎅') >>> 4 | (char)((char)((char)(var4[var5] ^ var5) + var5) ^ '鎅') << 12) + 26681) - var5) - var5) - 11000) + 6588))) >>> 3) + 28778) ^ var5))) - 27866));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IilliliilIIi(float rawRequestedYaw, float currentYaw) {
      return (int)Math.floor((double)(Math.abs(currentYaw - liiiIIllIl(rawRequestedYaw, currentYaw)) / 360.0F));
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ var5))))) + var5) + var5) - var5) ^ var5) + var5) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ var5))))) + var5) + var5) - var5) ^ var5) + var5) + var5) >>> 2) ^ '\uede0') - '鉖') - 11841) ^ '\ueb93') ^ var5) + 27806) + 'ﮖ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) >>> 13) - 22889) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) >>> 13) - 22889) << 12) ^ 20511) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) >>> 13) - 22889) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') >>> 14 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) >>> 14 | (char)((char)((char)(var4[var5] + 584) - '쐚') << 5 | (char)((char)(var4[var5] + 584) - '쐚') >>> 11) << 2) + var5))) ^ var5))) + 12012) ^ var5) ^ '饹') << 2) >>> 13) - 22889) << 12) ^ 20511) >>> 11) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean lIiiIiIlilli(float requestedContinuousYaw, float currentYaw) {
      return Math.abs(currentYaw - requestedContinuousYaw) <= 180.001F;
   }

   private iiiiIiilIIIIliil() {
   }
}
