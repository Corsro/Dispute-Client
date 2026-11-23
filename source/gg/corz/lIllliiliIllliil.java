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
import net.minecraft.class_437;

public class lIllliiliIllliil extends ilIllIiIll {
   private final iiIiiilIIliiil IIIlIiilil;
   private final iiIiiilIIliiil iiiIIiilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) << 3 | (char)(var4[var5] << 3 | var4[var5] >>> 13) >>> 13) + '韁'))))) + 30465) - var5))))) + 13880) >>> 1 | (char)((char)(-((char)(~((char)((char)((char)(-((char)(-((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) << 3 | (char)(var4[var5] << 3 | var4[var5] >>> 13) >>> 13) + '韁'))))) + 30465) - var5))))) + 13880) << 15) + '챃') + '\ud92d'));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) ^ '鋦'))) >>> 11 | (char)(~((char)((char)(~((char)(var4[var5] + var5))) ^ '鋦'))) << 5))) >>> 8 | (char)(-((char)((char)(~((char)((char)(~((char)(var4[var5] + var5))) ^ '鋦'))) >>> 11 | (char)(~((char)((char)(~((char)(var4[var5] + var5))) ^ '鋦'))) << 5))) << 8))) + var5) - var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIllliiliIllliil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IlllIIIillllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiiIIiilil});
      this.IIIlIiilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIlIiilil});
      this.IlIlllIlilIl(new IilliIllilliIl[]{(new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::iiiIlIIIll)).Ililllililil()});
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) >>> 3 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) << 13) + var5) + '\ue4c8'))) << 8 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) >>> 3 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) << 13) + var5) + '\ue4c8'))) >>> 8) ^ 32697) << 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) >>> 3 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) << 13) + var5) + '\ue4c8'))) << 8 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) >>> 3 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') << 10 | (char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) << 8 | (char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 10 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 6))) >>> 8) + '階') >>> 6))) - 17804) << 13) + var5) + '\ue4c8'))) >>> 8) ^ 32697) >>> 2))) + var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) << 12 | (char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) >>> 4))) - var5) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) << 12 | (char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) >>> 4))) - var5) << 15))) ^ var5) + var5))) >>> 13 | (char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) << 12 | (char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) >>> 4))) - var5) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) << 12 | (char)((char)((char)((char)(var4[var5] - 18073) >>> 4 | (char)(var4[var5] - 18073) << 12) - 25821) - var5) >>> 4))) - var5) << 15))) ^ var5) + var5))) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5833672889757399677L ^ Long.rotateLeft(-1759784978408609038L, 19) ^ 8989312923890121953L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2498097859594284271L ^ Long.rotateLeft(8984948569360654243L, 17) ^ -5268612086704936581L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 561296356534277518L ^ Long.rotateLeft(-7476407208887028350L, 16) ^ -9222930432273580882L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7782179271032128363L ^ Long.rotateLeft(6266599632183105207L, 59) ^ -3812262364302401233L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6701668193253627058L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 242606379309082331L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4417446572401808988L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 19680622800254882L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8143143011111407832L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -595398675201563034L;
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

   public boolean Iilllilliill() {
      return true;
   }

   public void Ililllililil() {
      this.iiiIlIIIll();
   }

   private void iiiIlIIIll() {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         IIiIIllIiIIl.liiiIIllIl();
         if (Iiiilllliiilll.field_1755 != null) {
            Iiiilllliiilll.method_1507((class_437)null);
         }

         try (AutoCloseable var1 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            ilIllIiIll var3 = llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
            if (var3 instanceof iIlIilIlIllIilIl) {
               iIlIilIlIllIilIl var2 = (iIlIilIlIllIilIl)var3;
               var2.lIIIiIlliIIIiIll();
            }

            for(ilIllIiIll var9 : lllIIiillIIi.IliIlllilIi(llilIllililIll.IilliliilIIi())) {
               var9.IIillIiliIil(false);
            }
         } catch (Exception var6) {
         }

         if (this.iiiIIiilil.Iilllilliill()) {
            Iilliillilliil.IilliliilIIi();
         }

         if (this.IIIlIiilil.Iilllilliill()) {
            IliIIiIilliIIiIi.iliIiiliiiii();
         }

         Thread var7 = new Thread(() -> {
            for(int var0 = 1; var0 <= 4; ++var0) {
               System.gc();

               try {
                  Thread.sleep(100L * (long)var0);
               } catch (InterruptedException var2) {
                  Thread.currentThread().interrupt();
                  return;
               }
            }

            System.gc();
         }, IliIlllilIi<invokedynamic>());
         var7.setDaemon(true);
         var7.start();
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - '닣') - var5)) >>> 10 | (char)((char)((char)((char)(~var4[var5]) - '닣') - var5)) << 6) << 3 | (char)((char)((char)((char)((char)(~var4[var5]) - '닣') - var5)) >>> 10 | (char)((char)((char)((char)(~var4[var5]) - '닣') - var5)) << 6) >>> 13) - 4897) ^ var5))))) - '\udd59') ^ var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
