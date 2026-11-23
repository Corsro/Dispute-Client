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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_239;
import net.minecraft.class_3966;

public class llIilIiilIilIi extends ilIllIiIll {
   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) << 4 | (char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) >>> 12) - '쇉'))) + '윯') >>> 6 | (char)((char)(~((char)((char)((char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) << 4 | (char)(-((char)(-((char)((char)(var4[var5] ^ var5) - var5))))) >>> 12) - '쇉'))) + '윯') << 10) - var5) ^ '흧'))) + var5) - '\ue3b4') ^ 5574) ^ 9011))) + '궂'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) >>> 11 | (char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) << 5) ^ 9662) << 3 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) >>> 11 | (char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) << 5) ^ 9662) >>> 13) << 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) >>> 11 | (char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) << 5) ^ 9662) << 3 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) >>> 11 | (char)((char)((char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) << 14 | (char)((char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) >>> 11 | (char)(~((char)(var4[var5] >>> 15 | var4[var5] << 1))) << 5) >>> 2) - 17924) << 5) ^ 9662) >>> 13) >>> 11) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IllIllllIl(IiiiIIIlliiiIIIl event) {
      long var6 = 3621067466933513105L;
      if (event.liiiIIllIl() == ((-(287276759 ^ -99) + 23) * -1643291835 ^ -973534144)) {
         if (event.IliIlllilIi() == (~(-1261315135 * 53 * 5 * -678152731) ^ 944147760)) {
            if (Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.field_1724 != null) {
               class_239 var3 = Iiiilllliiilll.field_1765;
               if (var3 instanceof class_3966) {
                  class_3966 var2 = (class_3966)var3;
                  class_1297 var8 = var2.method_17782();
                  if (var8 instanceof class_1657 && var8 != Iiiilllliiilll.field_1724) {
                     String var4 = var8.method_5477().getString();
                     var6 ^= ((long)iIIiIiIlIlIiIiIl.IliIlllilIi(var4) << 32 ^ var6) & -1L << 32;
                     iIIiIiIlIlIiIiIl.IiIlliIliiIl(var4);
                     Iliiiiilliiiii.IliIlllilIi().iIlIlllllill((int)(var6 >>> 32) != 0 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), var4, (int)(var6 >>> 32) == 0);
                  }
               }
            }
         }
      }
   }

   public llIilIiilIilIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IlllIIIillllIIIi);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ '\uee11') + var5) ^ var5)) - '轸'))) >>> 2 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ '\uee11') + var5) ^ var5)) - '轸'))) << 14) - var5) + '향') - 13905))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) << 10))) >>> 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) << 10))) << 15) + var5))) - var5) - 27125) ^ var5) ^ var5) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) << 10))) >>> 1 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + 18537) ^ 20793) + 7514) ^ 22071) - 1852) << 10))) << 15) + var5))) - var5) - 27125) ^ var5) ^ var5) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5022587192551611117L ^ Long.rotateLeft(-5798329708826433246L, 19) ^ -6577887303242604884L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5065399463791413574L ^ Long.rotateLeft(7233646267429241011L, 26) ^ 1297588395356018026L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8078350213054676077L ^ Long.rotateLeft(2105727348209294374L, 53) ^ 2701679428644873122L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2092966025526279349L ^ Long.rotateLeft(5408085806676354174L, 12) ^ -7466524849536342388L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5605181701532785757L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4061128732983084779L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -68360818988990864L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4283457803945668083L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7436565802989758224L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8038699536240050581L;
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') >>> 1) - var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') >>> 1) - var5) >>> 5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') >>> 1) - var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) << 8 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ 31735) << 4 | (char)((char)(~var4[var5]) ^ 31735) >>> 12) ^ var5))) >>> 8) << 13) >>> 8) - var5) ^ var5) - 7491) ^ '괥') >>> 1) - var5) >>> 5))) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
