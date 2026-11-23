package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iilliliIIilili {
   public static final String ilIiIIlIIl = "deploy";
   static final int IIiiIIlIIl = 4000;
   public static final double llliIIlIIl = 0.8;
   static final double iiIIlIlIIl = (double)200.0F;
   static final double IIlIlIlIIl = (double)25.0F;
   static final double liIIlIlIIl = (double)4.0F;
   static final double lIiiIIlIIl = 0.12;
   static final double lliiIIlIIl = 0.3;
   static final double illIlIlIIl = 0.09;
   static final double iIlIlIlIIl = (double)250.0F;
   public static final String IlIiIIlIIl = "keys_land";
   private static final Map<lliIIIIliliIIIIl, List<iIIIIIliIlIIIIli>> lIiIlIlIIl = new ConcurrentHashMap();
   public static final int illiIIlIIl = 4;
   static final double lilIlIlIIl = 0.12;
   public static final String liIiIIlIIl = "swish";
   static final double IliiIIlIIl = 2.7;
   static final double iiiiIIlIIl = 0.45;
   public static final String IIIiIIlIIl = "tick";
   public static final double IlliIIlIIl = 0.09;
   static final double IllIlIlIIl = (double)500.0F;
   static final double liiiIIlIIl = 0.85;
   public static final Map<String, lIiIilliIiIill> iiliIIlIIl = Map.of(IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.5F, 0.8F), IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.6F, 0.4F), IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.9F, 4.5F), IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.8F, 0.75F), IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.8F, 0.45F), IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.3F, 0.65F), IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.9F, 0.3F), IIiilIiiiIii<invokedynamic>(), new lIiIilliIiIill(IIiilIiiiIii<invokedynamic>(), 1.6F, 0.55F));
   static final int IIIIlIlIIl = 10;
   public static final String IiIiIIlIIl = "deploy_butterfly";
   static final double IiiiIIlIIl = 0.3;
   static final double iilIlIlIIl = (double)150.0F;
   static final double lllIlIlIIl = (double)80.0F;
   static final int lIIIlIlIIl = 2;
   public static final String iIIiIIlIIl = "keys";
   public static final double IiliIIlIIl = 0.8;
   static final double iIiiIIlIIl = 0.06;
   public static final long liliIIlIIl = 300L;
   static final int ilIIlIlIIl = 1;
   public static final float IIliIIlIIl = 0.45F;
   static final int llIIlIlIIl = 2;
   static final double IIiIlIlIIl = 0.18;
   static final double lIlIlIlIIl = (double)3.0F;
   public static final String llIiIIlIIl = "ring";
   static final double iliiIIlIIl = (double)1.0F;
   static final int IlIIlIlIIl = 6;
   static final double IilIlIlIIl = (double)600.0F;
   public static final float iiIiIIlIIl = 0.26F;
   public static final String lIIiIIlIIl = "lock";
   static final double IiIIlIlIIl = (double)30.0F;
   public static final float lIliIIlIIl = 0.5F;
   public static final double iIliIIlIIl = 0.05;

   static iIIIIIliIlIIIIli IIIllIIliIIl(float p, double speed) {
      return new iIIIIIliIlIIIIli(p, IIiilIiiiIii<invokedynamic>(), (float)(0.3 + 0.12 * IiIiliIiiiIi((speed - (double)200.0F) / (double)1300.0F, (double)0.0F, (double)1.0F)), (float)((double)1.0F + 0.05 * IiIiliIiiiIi(speed / (double)2000.0F, (double)0.0F, (double)1.0F)));
   }

   static void IiIlliIliiIl(List<iIIIIIliIlIIIIli> out, float[] bl, float[] bh, double dt) {
      int var5 = bl.length - 1;
      int var6 = Math.max(1, (int)Math.round(0.06 / dt));
      boolean var7 = false;

      for(int var8 = 1; var8 <= var5; ++var8) {
         double var9 = IlIillIiilIi((double)(bl[var8] + bh[var8]));
         if (var9 > (double)30.0F) {
            var7 = true;
         }

         if (var7 && var9 < (double)4.0F) {
            var7 = false;
            double var11 = (double)0.0F;

            for(int var13 = Math.max(1, var8 - var6); var13 <= var8; ++var13) {
               var11 = Math.max(var11, (double)Math.abs(bl[var13] + bh[var13] - (bl[var13 - 1] + bh[var13 - 1])) / dt);
            }

            out.add(var11 > (double)200.0F ? iliIiiliiiii((float)var8 / (float)var5, var11) : IIIllIIliIIl((float)var8 / (float)var5, var11));
         }
      }

      IIlllIlliIll(out, bl, dt);
      IIlllIlliIll(out, bh, dt);
   }

   static List<iIIIIIliIlIIIIli> IIillIiliIil(float[] a, double dt) {
      ArrayList var3 = new ArrayList();
      int var4 = a.length - 1;
      int var5 = Math.max(1, (int)Math.round(0.09 / dt));
      int var6 = -1;
      double var7 = (double)0.0F;

      for(int var9 = 1; var9 <= var4; ++var9) {
         double var10 = IlIlllIlilIl(a, var9, dt);
         if (var10 > (double)500.0F) {
            var6 = var9;
            var7 = Math.max(var7, var10);
         } else if (var10 < (double)80.0F && var6 >= 0) {
            if (var9 - var6 <= var5) {
               var3.add(new iIIIIIliIlIIIIli((float)var9 / (float)var4, IIiilIiiiIii<invokedynamic>(), (float)(0.28 + 0.06 * IiIiliIiiiIi(var7 / (double)2000.0F, (double)0.0F, (double)1.0F)), 0.92F));
            }

            var6 = -1;
            var7 = (double)0.0F;
         }
      }

      return var3;
   }

   public static List<iIIIIIliIlIIIIli> IilliliilIIi(String seconds, iliiiIiiii style, double clip) {
      if (style != null && clip > Double.longBitsToDouble(-3803831811494998518L ^ -3803831811494998518L)) {
         lliIIIIliliIIIIl var4 = new lliIIIIliliIIIIl(seconds, style, Double.doubleToLongBits(clip));
         List var5 = (List)lIiIlIlIIl.get(var4);
         if (var5 != null) {
            return var5;
         } else {
            List var6 = List.copyOf(lIiiIiIlilli(seconds, style, clip));
            if (lIiIlIlIIl.size() > (~(~(865871089 + 43)) ^ 865871196)) {
               lIiIlIlIIl.clear();
            }

            List var7 = (List)lIiIlIlIIl.putIfAbsent(var4, var6);
            return var7 != null ? var7 : var6;
         }
      } else {
         return new ArrayList();
      }
   }

   public static float IliIlllilIi(double knifeVolume) {
      double var2 = IiIiliIiiiIi(knifeVolume, (double)0.0F, (double)1.0F);
      return var2 <= Double.longBitsToDouble(4375355963267381185L ^ 239247720436067931L) ? (float)(Double.longBitsToDouble(-1723869941797621496L ^ -2900135259597258181L) * var2 / Double.longBitsToDouble(6492742631832762638L ^ 7346288670354481300L)) : (float)(Double.longBitsToDouble(4282755392419766128L ^ 341240466993491011L) + Double.longBitsToDouble(213068060824065057L ^ 4400753662679331399L) * (var2 - Double.longBitsToDouble(-180495949225518648L ^ -4425025801584541614L)) / Double.longBitsToDouble(-968071549382748286L ^ -3649849088092369382L));
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) >>> 5) ^ 20808) << 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) >>> 5) ^ 20808) >>> 10) ^ 28460) ^ var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) >>> 5) ^ 20808) << 6 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) << 11 | (char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) >>> 2 | (char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) ^ var5) ^ var5))) ^ var5) - var5) >>> 7) << 14) + var5))) >>> 5) ^ 20808) >>> 10) ^ 28460) ^ var5))) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) << 10) + 5403) + var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) << 10) + 5403) + var5) << 2))) + var5) << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) << 10) + 5403) + var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)var4[var5] >>> 13 | (char)var4[var5] << 3) + var5) - 10965) ^ var5) + '蘙') + var5) + var5) << 10) + 5403) + var5) << 2))) + var5) >>> 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6639477070832650450L ^ Long.rotateLeft(7850804821519057149L, 49) ^ -4811203113064607100L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4365024358552742990L ^ Long.rotateLeft(8378122729683730132L, 16) ^ 5048977705504381023L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5923514102527946924L ^ Long.rotateLeft(-5374393214532958836L, 13) ^ 5013220781303058463L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6296605111919123325L ^ Long.rotateLeft(-2974913141783794696L, 30) ^ 4670475090439718553L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4652596658044401898L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1429169510824683847L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2405033278688388001L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3104332396152233242L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4917567153377985899L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3862821585633331644L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iliilliiilii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiiiliiiiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIIllIIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iIIIlIlIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIIlilIIl<invokedynamic>());
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

   static double IiIiliIiiiIi(double hi, double lo, double v) {
      return hi < lo ? lo : (hi > v ? v : hi);
   }

   static List<iIIIIIliIlIIIIli> IIIilIIiiIIi(List<iIIIIIliIlIIIIli> cues, double seconds) {
      ArrayList var3 = new ArrayList(cues.size());
      double var4 = Double.NEGATIVE_INFINITY;
      int var6 = 0;

      for(iIIIIIliIlIIIIli var8 : cues) {
         if (!IIiilIiiiIii<invokedynamic>().equals(var8.liiiIIllIl())) {
            var3.add(var8);
         } else {
            double var9 = (double)var8.IliIlllilIi() * seconds;
            var6 = var9 - var4 < 0.3 ? var6 + 1 : 0;
            var4 = var9;
            double var11 = Math.max(Math.min(0.45, (double)var8.iIlIlllllill()), (double)var8.iIlIlllllill() * Math.pow(0.85, (double)(var6 / 2)));
            var3.add(new iIIIIIliIlIIIIli(var8.IliIlllilIi(), var8.liiiIIllIl(), (float)var11, var8.IilliliilIIi()));
         }
      }

      return var3;
   }

   static void IIlllIlliIll(List<iIIIIIliIlIIIIli> dt, float[] out, double a) {
      int var4 = out.length - 1;
      int var5 = Math.max(1, (int)Math.round(0.04 / a));

      for(double var9 : new double[]{(double)0.0F, (double)180.0F}) {
         boolean var11 = false;

         for(int var12 = 1; var12 <= var4; ++var12) {
            double var13 = Math.abs((double)out[var12] - var9);
            if (var13 > (double)25.0F) {
               var11 = true;
            }

            if (var11 && var13 < (double)3.0F) {
               var11 = false;
               double var15 = (double)0.0F;

               for(int var17 = Math.max(1, var12 - var5); var17 <= var12; ++var17) {
                  var15 = Math.max(var15, IlIlllIlilIl(out, var17, a));
               }

               if (var15 >= (double)250.0F) {
                  dt.add(IIIllIIliIIl((float)var12 / (float)var4, var15));
               }
            }
         }
      }

   }

   static void Ililllililil(List<iIIIIIliIlIIIIli> dt, float[] out, double sb) {
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = out[0] >= 170.0F;
      boolean var7 = out[0] < 1.0F;
      int var8 = out.length - 1;
      int var9 = Math.max(1, (int)Math.round(0.03 / sb));

      for(int var10 = 1; var10 <= var8; ++var10) {
         float var11 = out[var10];
         float var12 = (float)var10 / (float)var8;
         if (var7 && var11 > 3.0F) {
            dt.add(new iIIIIIliIlIIIIli(var12, IIiilIiiiIii<invokedynamic>(), 0.36F, 1.04F));
            var7 = false;
         }

         if (var11 < 1.0F) {
            var7 = true;
         }

         if (var11 > 25.0F) {
            var4 = true;
         }

         if (var11 < 140.0F) {
            var5 = true;
         }

         if (var4 && var11 < 3.0F) {
            double var13 = (double)Math.abs(out[var10] - out[Math.max(0, var10 - var9)]) / ((double)var9 * sb);
            dt.add(new iIIIIIliIlIIIIli(var12, IIiilIiiiIii<invokedynamic>(), (float)(0.45 + 0.07 * IiIiliIiiiIi(var13 / (double)2500.0F, (double)0.0F, (double)1.0F)), 1.0F));
            var4 = false;
         }

         if (var5 && var11 > 168.0F) {
            dt.add(new iIIIIIliIlIIIIli(var12, IIiilIiiiIii<invokedynamic>(), 0.4F, 0.94F));
            var5 = false;
            var6 = true;
         }

         if (var6 && var11 < 166.0F) {
            dt.add(new iIIIIIliIlIIIIli(var12, IIiilIiiiIii<invokedynamic>(), 0.36F, 1.04F));
            var6 = false;
         }
      }

   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 15 | (char)(var4[var5] + var5) << 1) << 3 | (char)((char)(var4[var5] + var5) >>> 15 | (char)(var4[var5] + var5) << 1) >>> 13))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] + var5) >>> 15 | (char)(var4[var5] + var5) << 1) << 3 | (char)((char)(var4[var5] + var5) >>> 15 | (char)(var4[var5] + var5) << 1) >>> 13))) << 4) ^ 30732) + 9135) ^ 'ꏬ') - var5) - var5) + 31544) - '鶫'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static double IlIlllIlilIl(float[] i, int dt, double a) {
      return (double)Math.abs(i[dt] - i[dt - 1]) / a;
   }

   static List<iIIIIIliIlIIIIli> Iilllilliill(List<iIIIIIliIlIIIIli> contacts, List<iIIIIIliIlIIIIli> seconds, double swings) {
      ArrayList var4 = new ArrayList();
      ArrayList var5 = new ArrayList(contacts);
      var5.sort(Comparator.comparingDouble((c) -> (double)(-c.iIlIlllllill())).thenComparingDouble(iIIIIIliIlIIIIli::IliIlllilIi));

      for(iIIIIIliIlIIIIli var7 : var5) {
         if (var4.size() >= 1) {
            break;
         }

         boolean var8 = true;

         for(iIIIIIliIlIIIIli var10 : seconds) {
            if ((double)Math.abs(var7.IliIlllilIi() - var10.IliIlllilIi()) * swings < 0.18) {
               var8 = false;
            }
         }

         if (var8) {
            var4.add(var7);
         }
      }

      return var4;
   }

   private iilliliIIilili() {
   }

   static List<iIIIIIliIlIIIIli> Iiilliiliiil(List<iIIIIIliIlIIIIli> seconds, double cues, int budget) {
      ArrayList var4 = new ArrayList(seconds);
      var4.sort(Comparator.comparingDouble((c) -> (double)(-c.iIlIlllllill())).thenComparingDouble(iIIIIIliIlIIIIli::IliIlllilIi));
      ArrayList var5 = new ArrayList();
      double var6 = (double)1.0F - 0.06 / cues;

      for(iIIIIIliIlIIIIli var9 : var4) {
         if (var5.size() >= budget) {
            break;
         }

         if (!(var9.IliIlllilIi() < 0.0F) && !((double)var9.IliIlllilIi() > var6)) {
            boolean var10 = true;

            for(iIIIIIliIlIIIIli var12 : var5) {
               if ((double)Math.abs(var9.IliIlllilIi() - var12.IliIlllilIi()) * cues < 0.12) {
                  var10 = false;
               }
            }

            if (var10) {
               var5.add(var9);
            }
         }
      }

      var5.sort(Comparator.comparingDouble(iIIIIIliIlIIIIli::IliIlllilIi));
      return var5;
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~var4[var5]))) + var5) >>> 10 | (char)((char)(-((char)(~var4[var5]))) + var5) << 6))) ^ '뷱'))) - 24001) - var5) ^ var5) << 1 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~var4[var5]))) + var5) >>> 10 | (char)((char)(-((char)(~var4[var5]))) + var5) << 6))) ^ '뷱'))) - 24001) - var5) ^ var5) >>> 15)) ^ var5) + var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~var4[var5]))) + var5) >>> 10 | (char)((char)(-((char)(~var4[var5]))) + var5) << 6))) ^ '뷱'))) - 24001) - var5) ^ var5) << 1 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~var4[var5]))) + var5) >>> 10 | (char)((char)(-((char)(~var4[var5]))) + var5) << 6))) ^ '뷱'))) - 24001) - var5) ^ var5) >>> 15)) ^ var5) + var5) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static List<iIIIIIliIlIIIIli> lIiiIiIlilli(String seconds, iliiiIiiii clip, double style) {
      ArrayList var4 = new ArrayList();
      if (clip != null && style > (double)0.0F) {
         float[][] var5 = new float[17][4001];

         for(int var6 = 0; var6 < 17; ++var6) {
            for(int var7 = 0; var7 <= 4000; ++var7) {
               var5[var6][var7] = clip.IliIlllilIi(var6, (float)var7 / 4000.0F);
            }
         }

         double var12 = style / (double)4000.0F;
         if (IIiilIiiiIii<invokedynamic>().equals(seconds)) {
            int var13 = Math.max(1, Math.min(10, (int)Math.floor(2.7 * style)));
            IiIlliIliiIl(var4, var5[15], var5[16], var12);
            var4.sort(Comparator.comparingDouble(iIIIIIliIlIIIIli::IliIlllilIi));
            List var9 = Iiilliiliiil(IIIilIIiiIIi(var4, style), style, var13);
            List var10 = Illlllllilll(var5[12], var12);
            var10.addAll(Illlllllilll(var5[11], var12));
            ArrayList var11 = new ArrayList(var9);
            var11.addAll(Iilllilliill(var10, var9, style));
            return Iiilliiliiil(var11, style, var13);
         } else {
            List var8 = IIillIiliIil(var5[11], var12);
            var8.addAll(IIillIiliIil(var5[12], var12));
            var8.sort(Comparator.comparingDouble((c) -> (double)(-c.iIlIlllllill())).thenComparingDouble(iIIIIIliIlIIIIli::IliIlllilIi));
            var4.addAll(var8.subList(0, Math.min(2, var8.size())));
            if (IIiilIiiiIii<invokedynamic>().equals(seconds)) {
               Ililllililil(var4, var5[14], var12);
               return Iiilliiliiil(var4, style, 6);
            } else {
               return Iiilliiliiil(var4, style, 2);
            }
         }
      } else {
         return var4;
      }
   }

   static List<iIIIIIliIlIIIIli> Illlllllilll(float[] dt, double a) {
      ArrayList var3 = new ArrayList();
      int var4 = dt.length - 1;
      int var5 = 1;

      while(var5 <= var4) {
         if (IlIlllIlilIl(dt, var5, a) < (double)600.0F) {
            ++var5;
         } else {
            int var6 = var5;

            double var7;
            for(var7 = (double)0.0F; var5 <= var4 && IlIlllIlilIl(dt, var5, a) >= (double)600.0F; var7 = Math.max(var7, IlIlllIlilIl(dt, var5++, a))) {
            }

            if ((double)(var5 - var6) * a >= 0.12 && (double)Math.abs(dt[var5 - 1] - dt[var6 - 1]) >= (double)150.0F) {
               var3.add(new iIIIIIliIlIIIIli((float)(var6 + var5 - 1) * 0.5F / (float)var4, IIiilIiiiIii<invokedynamic>(), (float)(0.32 + 0.04 * IiIiliIiiiIi(var7 / (double)2000.0F, (double)0.0F, (double)1.0F)), 1.0F));
            }
         }
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 7126) >>> 12 | (char)(var4[var5] - 7126) << 4) ^ '魋'))) << 12 | (char)(~((char)((char)((char)(var4[var5] - 7126) >>> 12 | (char)(var4[var5] - 7126) << 4) ^ '魋'))) >>> 4) - var5) + '\ue32b') + var5))) ^ var5) >>> 8 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 7126) >>> 12 | (char)(var4[var5] - 7126) << 4) ^ '魋'))) << 12 | (char)(~((char)((char)((char)(var4[var5] - 7126) >>> 12 | (char)(var4[var5] - 7126) << 4) ^ '魋'))) >>> 4) - var5) + '\ue32b') + var5))) ^ var5) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double liiiIIllIl(String sound) {
      return !IIiilIiiiIii<invokedynamic>().equals(sound) && !IIiilIiiiIii<invokedynamic>().equals(sound) && !IIiilIiiiIii<invokedynamic>().equals(sound) ? Double.longBitsToDouble(-5475799882504616347L ^ -8382442878051917825L) : Double.longBitsToDouble(1687170065998043159L ^ 2944511935156031261L);
   }

   static double IlIillIiilIi(double a) {
      double var2 = a % Double.longBitsToDouble(5142270221473113716L ^ 516651191698548340L);
      if (var2 < Double.longBitsToDouble(-3299783830872215433L ^ -3299783830872215433L)) {
         var2 += Double.longBitsToDouble(-5810233100881304418L ^ -1212761568777804642L);
      }

      return Math.min(var2, Double.longBitsToDouble(4086240172416045707L ^ 8702007578005738123L) - var2);
   }

   static iIIIIIliIlIIIIli iliIiiliiiii(float speed, double p) {
      return new iIIIIIliIlIIIIli(speed, IIiilIiiiIii<invokedynamic>(), (float)(Double.longBitsToDouble(5675574887710145660L ^ 8151371869251694769L) + Double.longBitsToDouble(-4408264606242331238L ^ -208525490612978688L) * IiIiliIiiiIi((p - Double.longBitsToDouble(8429543717505527998L ^ 3781054845873221822L)) / Double.longBitsToDouble(-8210610233487925261L ^ -3554240062507720717L), (double)0.0F, (double)1.0F)), (float)(Double.longBitsToDouble(3723996803154457500L ^ 883058890367165590L) + Double.longBitsToDouble(-723841292929803561L ^ -3873064014447194452L) * IiIiliIiiiIi(p / Double.longBitsToDouble(-8818495431892240427L ^ -4235326347042850859L), (double)0.0F, (double)1.0F)));
   }

   public static double iIlIlllllill(int savedSoundVersion, double savedVolume) {
      return savedSoundVersion == ((~-1845415330 >>> 17 | ~-1845415330 << 15) * 41 ^ 2003652307) ? savedVolume : Double.longBitsToDouble(6699714245061235988L ^ 7139246657109380238L);
   }
}
