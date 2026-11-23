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
import net.minecraft.class_12247;
import net.minecraft.class_1921;
import net.minecraft.class_4597;
import net.minecraft.class_9799;

final class liIilIIliiIilIIl {
   static final class_1921 lIiiiillIl;
   static final class_4597.class_4598 iIiiiillIl;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '꼨'))) >>> 9 | (char)(-((char)((char)(-var4[var5]) ^ '꼨'))) << 7) - 24077) - '댕') << 1 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '꼨'))) >>> 9 | (char)(-((char)((char)(-var4[var5]) ^ '꼨'))) << 7) - 24077) - '댕') >>> 15) - '\udbf6') + var5) + 'ꂓ') + 129) - var5) ^ var5) ^ var5) - 27485) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '꼨'))) >>> 9 | (char)(-((char)((char)(-var4[var5]) ^ '꼨'))) << 7) - 24077) - '댕') << 1 | (char)((char)((char)((char)(-((char)((char)(-var4[var5]) ^ '꼨'))) >>> 9 | (char)(-((char)((char)(-var4[var5]) ^ '꼨'))) << 7) - 24077) - '댕') >>> 15) - '\udbf6') + var5) + 'ꂓ') + 129) - var5) ^ var5) ^ var5) - 27485) << 15));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ var5) ^ var5) << 12) - '\ue2dc') ^ 9952) + 4177) ^ var5))) + var5) - 23253))) << 10 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ var5) ^ var5) << 12) - '\ue2dc') ^ 9952) + 4177) ^ var5))) + var5) - 23253))) >>> 6) >>> 2 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ var5) ^ var5) << 12) - '\ue2dc') ^ 9952) + 4177) ^ var5))) + var5) - 23253))) << 10 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) >>> 4 | (char)((char)(var4[var5] ^ var5) ^ var5) << 12) - '\ue2dc') ^ 9952) + 4177) ^ var5))) + var5) - 23253))) >>> 6) << 14));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 696) ^ 14792) ^ var5) - 5161) + var5) - 22882))))) - var5) + var5))) ^ 16140) >>> 2 | (char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + 696) ^ 14792) ^ var5) - 5161) + var5) - 22882))))) - var5) + var5))) ^ 16140) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8667773084507699404L ^ Long.rotateLeft(-1524700980466942914L, 27) ^ 3384903423409546472L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -972156133637549172L ^ Long.rotateLeft(-8215010009407797162L, 14) ^ 8337546713632764469L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 694334649382293937L ^ Long.rotateLeft(-192380117446034924L, 44) ^ -5662558679899777173L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1399867945512159586L ^ Long.rotateLeft(1784817357044637175L, 1) ^ 2750496575267145460L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2266775926414867055L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2942459722492715241L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8965436962285985611L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1176176260219281713L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5932705917266951953L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -19020122282868337L;
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

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + '뀧') ^ var5))) << 6 | (char)(~((char)((char)((char)(var4[var5] - var5) + '뀧') ^ var5))) >>> 10) ^ var5))) ^ 28921) ^ var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) + '뀧') ^ var5))) << 6 | (char)(~((char)((char)((char)(var4[var5] - var5) + '뀧') ^ var5))) >>> 10) ^ var5))) ^ 28921) ^ var5) << 8) - 12225) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      lIiiiillIl = class_1921.method_75940(IliIlllilIi<invokedynamic>(), class_12247.method_75927(iIiiIIilIliiIIil.llIlliIIil).method_75938());
      iIiiiillIl = class_4597.method_22991(new class_9799(262144));
   }

   private liIilIIliiIilIIl() {
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') >>> 14 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') << 2) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') >>> 14 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') << 2) ^ var5) >>> 8) + var5) - var5) - '믖'))) - var5) << 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') >>> 14 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') << 2) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') >>> 14 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) ^ var5) - 'ꡅ') << 2) ^ var5) >>> 8) + var5) - var5) - '믖'))) - var5) >>> 8) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
