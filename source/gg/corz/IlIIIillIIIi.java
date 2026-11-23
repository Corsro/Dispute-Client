package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlIIIillIIIi {
   public static final int iiiiIliiIIIIllii = 0;
   public static final double iIillliiIlilllii = 0.35;
   public static final double liiIlliiiiiIllii = 0.2;
   public static final float iiillliiIIIillii = 0.002F;
   public static final double IIIllliilIIlllii = (double)1.5F;
   public static final double iiIllliiIIllllii = 0.2;
   public static final int IlIIlliillIIllii = 2;
   public static final double IIillliilIilllii = (double)1.0F;
   public static final double llillliiililllii = 0.16;
   public static final double llIllliiilIlllii = (double)0.0F;
   public static final double lIlllliiiIllllii = 0.2;
   public static final double lIiIlliiiIiIllii = 0.2;
   public static final double lilllliiiillllii = (double)0.0F;
   public static final double IiIllliiliIlllii = (double)1.0F;
   public static final double IliIlliilliIllii = (double)2.5F;
   public static final String[] ilIIlliiIiIIllii = new String[]{IiIIlliIIl<invokedynamic>(), IiIIlliIIl<invokedynamic>(), IiIIlliIIl<invokedynamic>()};
   public static final int lIIIlliiiIIIllii = 1;
   public static final double IIlIlliilIlIllii = 0.35;
   public static final int lIIilliiiIIillii = 3;
   public static final double iIIllliiIlIlllii = (double)0.75F;
   public static final double Iiillliiliilllii = 0.24;
   public static final double lllIlliiillIllii = 0.1;
   public static final double liIIlliiiiIIllii = 0.08;
   public static final double iIlIlliiIllIllii = 0.18;
   public static final double iilIlliiIIiIllii = 0.55;
   public static final double illllliiIillllii = 0.55;
   public static final double Illllliillllllii = 0.8;
   public static final double iliIlliiIiiIllii = (double)1.0F;
   public static final double IilIlliililIllii = (double)1.0F;

   public static int Illlllllilll(String name) {
      long var3 = -6124664988284305560L;
      if (name == null) {
         return 0;
      } else {
         var3 ^= (-4294967296L ^ var3) & -1L << 32;
         switch (name.hashCode()) {
            case -1968751561:
               if (name.equals(IiIIlliIIl<invokedynamic>())) {
                  var3 ^= (8589934592L ^ var3) & -1L << 32;
               }
               break;
            case -1565776511:
               if (name.equals(IiIIlliIIl<invokedynamic>())) {
                  var3 ^= (0L ^ var3) & -1L << 32;
               }
               break;
            case 79847370:
               if (name.equals(IiIIlliIIl<invokedynamic>())) {
                  var3 ^= (4294967296L ^ var3) & -1L << 32;
               }
         }

         switch ((int)(var3 >>> 32)) {
            case 0:
               return 1;
            case 1:
               return 2;
            case 2:
            default:
               return 0;
         }
      }
   }

   public static float IIlllIlliIll(double v) {
      return (float)liiiIIllIl(v, (double)0.0F, (double)1.0F);
   }

   public static float IIIllIIliIIl(double v) {
      return (float)liiiIIllIl(v, 0.2, (double)1.5F);
   }

   public static boolean IIIilIIiiIIi(boolean screenOpen, boolean firstPerson, boolean enabled, float fadeAlpha) {
      return screenOpen && firstPerson && !enabled && fadeAlpha > 0.002F;
   }

   public static float IliIlllilIi(float v, float hi, float lo) {
      return v < hi ? hi : (v > lo ? lo : v);
   }

   private IlIIIillIIIi() {
   }

   private static float Iilililiiili(float x) {
      return x - (float)Math.floor((double)x);
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) << 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) >>> 10))))) ^ var5) - 8743)) + 'Ꙭ') << 8 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) << 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) >>> 10))))) ^ var5) - 8743)) + 'Ꙭ') >>> 8) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) << 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) >>> 10))))) ^ var5) - 8743)) + 'Ꙭ') << 8 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) << 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') >>> 12 | (char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) + 24595) >>> 11 | (char)((char)(var4[var5] - var5) + 24595) << 5))))) ^ '웣') << 4) + '럏') + var5) >>> 10))))) ^ var5) - 8743)) + 'Ꙭ') >>> 8) << 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double liiiIIllIl(double lo, double hi, double v) {
      return lo < hi ? hi : (lo > v ? v : lo);
   }

   public static boolean IlIillIiilIi(boolean flameEnabled, boolean noFlameEnabled, boolean hideVanilla, boolean firstPerson) {
      return firstPerson || flameEnabled && noFlameEnabled && hideVanilla;
   }

   public static float IlIlllIlilIl(double v) {
      return (float)liiiIIllIl(v, (double)0.0F, (double)1.0F);
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 22456) + '\uf609'))) ^ var5) + var5) >>> 14 | (char)((char)((char)(~((char)((char)(var4[var5] ^ 22456) + '\uf609'))) ^ var5) + var5) << 2))) + '\uf400'))) ^ '\ued97') >>> 11 | (char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 22456) + '\uf609'))) ^ var5) + var5) >>> 14 | (char)((char)((char)(~((char)((char)(var4[var5] ^ 22456) + '\uf609'))) ^ var5) + var5) << 2))) + '\uf400'))) ^ '\ued97') << 5))) ^ var5)))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float Iiiiliiiiiii(float intensity, float u, int style, float t) {
      float var4 = style == 2 ? 3.0F : (style == 1 ? 1.7F : 2.2F);
      float var5 = Iliilliiilii(intensity * 5.0F + u * 0.9F);
      var5 = var5 * 0.65F + Iliilliiilii(intensity * 11.0F - u * 1.3F) * 0.35F;
      float var6 = 0.55F + 0.45F * Iliilliiilii(intensity * 2.1F + u * 0.25F);
      var5 *= var6;
      float var7 = IliIlllilIi((t - 0.2F) / 1.3F, 0.0F, 1.0F);
      var5 = Math.max(var5, 0.15F * var7);
      float var8 = Math.max(0.8F, var4 - var7 * 0.7F);
      float var9 = (float)Math.pow((double)IliIlllilIi(var5, 0.0F, 1.0F), (double)var8);
      return IliIlllilIi(var9, 0.0F, 1.0F);
   }

   public static int Ililllililil(int argb) {
      long var8 = -3272040867874760403L;
      long var10 = -7659684795306795273L;
      long var12 = -2791030671898158928L;
      long var14 = -4187713133120327899L;
      var8 ^= ((long)(argb >>> 24 & 255) << 32 ^ var8) & -1L << 32;
      var8 ^= ((long)(argb >> 16 & 255) ^ var8) & -1L >>> 32;
      var10 ^= ((long)(argb >> 8 & 255) << 32 ^ var10) & -1L << 32;
      var10 ^= ((long)(argb & 255) ^ var10) & -1L >>> 32;
      var12 ^= ((long)IIillIiliIil(Math.round((float)((int)var8) + (float)(255 - (int)var8) * 0.55F)) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)IIillIiliIil(Math.round((float)((int)(var10 >>> 32)) + (float)(255 - (int)(var10 >>> 32)) * 0.72F)) ^ var12) & -1L >>> 32;
      var14 ^= ((long)IIillIiliIil(Math.round((float)((int)var10) + (float)(255 - (int)var10) * 0.38F)) << 32 ^ var14) & -1L << 32;
      return (int)(var8 >>> 32) << 24 | (int)(var12 >>> 32) << 16 | (int)var12 << 8 | (int)(var14 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1221520468130532240L ^ Long.rotateLeft(670201281776127823L, 38) ^ -1619087657320657193L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5399553017737310715L ^ Long.rotateLeft(-1173583789310824192L, 49) ^ -4369087713314862744L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5517205190380782143L ^ Long.rotateLeft(-42857858507754070L, 54) ^ 5152464574912433718L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8194888104396538237L ^ Long.rotateLeft(-4361021021025138751L, 30) ^ -9118045604275205501L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8719572777724674334L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 660064671606353165L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6526497428464861454L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7436728201019678377L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2547492979460500456L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4403158191379953902L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iiIIlIIlIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIlIliIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IllIllllIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, illIlIilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lilIliilIl<invokedynamic>());
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

   public static float lIiiIiIlilli(double v) {
      return (float)liiiIIllIl(v, 0.1, (double)1.0F);
   }

   private static float iIlIlllllill(float e1, float e0, float x) {
      if (e0 <= e1) {
         return x < e1 ? 0.0F : 1.0F;
      } else {
         float var3 = IliIlllilIi((x - e1) / (e0 - e1), 0.0F, 1.0F);
         return var3 * var3 * (3.0F - 2.0F * var3);
      }
   }

   public static boolean IIlilIliiIli(boolean shaderFailed) {
      return shaderFailed;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) >>> 1 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) << 15) - var5)) + '놅') - var5) - 18892) ^ 17190) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) >>> 1 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) << 15) - var5)) + '놅') - var5) - 18892) ^ 17190) >>> 10) + '\ued19') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) >>> 1 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) << 15) - var5)) + '놅') - var5) - 18892) ^ 17190) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) >>> 1 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) >>> 2 | (char)(var4[var5] << 15 | var4[var5] >>> 1) << 14) << 15) - var5)) + '놅') - var5) - 18892) ^ 17190) >>> 10) + '\ued19') >>> 5) - 'ꋴ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float IIiilIiiiIii(float p) {
      p = Iilililiiili(p * 0.1031F);
      p *= p + 33.33F;
      p *= p + p;
      return Iilililiiili(p);
   }

   public static boolean iIIIlIlIIl(BooleanSupplier op) {
      try {
         return op.getAsBoolean();
      } catch (Throwable var2) {
         return false;
      }
   }

   public static boolean IiIiliIiiiIi(int consecutiveFailures) {
      return consecutiveFailures >= 3;
   }

   public static float IiIlliIliiIl(double v) {
      return (float)liiiIIllIl(v, 0.2, 0.8);
   }

   public static void llIIlilIIl(Runnable restore, Runnable body) {
      try {
         restore.run();
      } finally {
         body.run();
      }

   }

   public static float Iiilliiliiil(float visibleTarget, boolean dt, double current) {
      if (current < (double)0.0F) {
         current = (double)0.0F;
      }

      float var4 = IliIlllilIi(visibleTarget, 0.0F, 1.0F);
      return dt ? Math.min(1.0F, var4 + (float)(current / 0.16)) : Math.max(0.0F, var4 - (float)(current / 0.24));
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ var5))) - 99) - var5))) ^ 22484) + var5) >>> 9 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ var5))) - 99) - var5))) ^ 22484) + var5) << 7) + var5) + var5) + var5) + '\uebf2'))) - var5) + 4336))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float iliIiiliiiii(double v) {
      return (float)liiiIIllIl(v, 0.2, (double)2.5F);
   }

   public static float Iliilliiilii(float x) {
      float var1 = (float)Math.floor((double)x);
      float var2 = x - var1;
      float var3 = var2 * var2 * (3.0F - 2.0F * var2);
      return IIiilIiiiIii(var1) * (1.0F - var3) + IIiilIiiiIii(var1 + 1.0F) * var3;
   }

   public static boolean IIIIllIIIl(boolean alreadyRegistered) {
      return !alreadyRegistered;
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) << 15 | (char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) >>> 1) ^ var5) - '옲') >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) << 15 | (char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) >>> 1) ^ var5) - '옲') << 10) + '鼶') >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) << 15 | (char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) >>> 1) ^ var5) - '옲') >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) << 15 | (char)((char)((char)(-((char)(var4[var5] ^ 4975))) << 13 | (char)(-((char)(var4[var5] ^ 4975))) >>> 3) + var5) >>> 1) ^ var5) - '옲') << 10) + '鼶') << 14) ^ var5) - var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float Iilllilliill(float centerClear, float uvx) {
      float var2 = Math.abs(centerClear - 0.5F) * 2.0F;
      float var3 = iIlIlllllill(0.15F, 0.75F, var2);
      float var4 = Math.max(0.0F, 1.0F - uvx * 1.6F);
      return var4 + (1.0F - var4) * var3;
   }

   private static int IIillIiliIil(int v) {
      return v < 0 ? 0 : (v > 255 ? 255 : v);
   }

   public static float IilliliilIIi(double v) {
      return (float)liiiIIllIl(v, 0.08, 0.35);
   }

   public static float[] Illillliilli(float framebufferH, float framebufferW) {
      return new float[]{framebufferH, framebufferW};
   }
}
