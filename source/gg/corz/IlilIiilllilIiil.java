package gg.corz;

import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_1044;
import net.minecraft.class_2960;
import net.minecraft.class_310;

public final class IlilIiilllilIiil {
   private static final String IIIlIIilil = "corzclient";
   private static final LinkedHashMap<String, class_2960> IlIlIIilil = new LinkedHashMap(64, 0.75F, true);
   private static final int iiiIIIilil = 160;
   private static final Set<class_2960> iIIlIIilil = new HashSet();
   private static final Map<class_2960, class_1011> lIIlIIilil = new HashMap();

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) << 11) - '춽'))) - 29903))))) + '싢') ^ 13572) << 8 | (char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) << 11) - '춽'))) - 29903))))) + '싢') ^ 13572) >>> 8) ^ '铯') << 8 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) << 11) - '춽'))) - 29903))))) + '싢') ^ 13572) << 8 | (char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) - 14463) - var5) << 11) - '춽'))) - 29903))))) + '싢') ^ 13572) >>> 8) ^ '铯') >>> 8) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6539121240291586480L ^ Long.rotateLeft(-7646374987177769647L, 6) ^ -2734086043431570362L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5620616336274364782L ^ Long.rotateLeft(-6623333346656298014L, 15) ^ 4099884840696073860L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3949457742903255974L ^ Long.rotateLeft(-7218934139552299752L, 5) ^ -5928442178650609867L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2111580026044312146L ^ Long.rotateLeft(-717232552402587585L, 53) ^ -6584088566354762918L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 520032144539819094L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3965005869559669036L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3324771884328258944L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1128233492474279292L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7330819885565326840L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4067322480251884085L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIillIiliIil<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) << 14 | (char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) >>> 2) ^ var5) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) << 14 | (char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) >>> 2) ^ var5) ^ var5) << 6) - var5)) + var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) << 14 | (char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) >>> 2) ^ var5) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) << 14 | (char)((char)((char)((char)((char)(var4[var5] + '츜') + '됮') + 30247) - var5) ^ var5) >>> 2) ^ var5) ^ var5) << 6) - var5)) + var5) ^ var5) >>> 10) ^ 27059) + 11405));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static class_1011 iIlIlllllill(class_2960 src) {
      if (src.method_12832().startsWith(IiIlliIliiIl<invokedynamic>())) {
         class_1044 var8 = class_310.method_1551().method_1531().method_4619(src);
         class_1011 var10000;
         if (var8 instanceof class_1043) {
            class_1043 var9 = (class_1043)var8;
            var10000 = var9.method_4525();
         } else {
            var10000 = null;
         }

         return var10000;
      } else {
         class_1011 var1 = (class_1011)lIIlIIilil.get(src);
         if (var1 != null) {
            return var1;
         } else {
            try {
               InputStream var2 = class_310.method_1551().method_1478().open(src);

               class_1011 var4;
               try {
                  class_1011 var3 = class_1011.method_4309(var2);
                  lIIlIIilil.put(src, var3);
                  var4 = var3;
               } catch (Throwable var6) {
                  if (var2 != null) {
                     try {
                        var2.close();
                     } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                     }
                  }

                  throw var6;
               }

               if (var2 != null) {
                  var2.close();
               }

               return var4;
            } catch (Throwable var7) {
               iIIlIIilil.add(src);
               return null;
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) >>> 1) - var5) + var5))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) >>> 1) - var5) + var5))) >>> 2) + 21054) - 8984) >>> 6 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) >>> 1) - var5) + var5))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) << 15 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5)) << 11 | (char)((char)((char)(-var4[var5]) + var5)) >>> 5) ^ var5) + var5) >>> 1) - var5) + var5))) >>> 2) + 21054) - 8984) << 10) ^ var5) - var5) ^ 16464));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIIllIIliIIl() {
      if (IlIlIIilil.size() > 160) {
         Iterator var0 = IlIlIIilil.entrySet().iterator();

         while(IlIlIIilil.size() > 160 && var0.hasNext()) {
            class_2960 var1 = (class_2960)((Map.Entry)var0.next()).getValue();
            var0.remove();
            class_310.method_1551().method_1531().method_4615(var1);
         }

      }
   }

   private static int lIiiIiIlilli(double v) {
      long var3 = 8278476585566633621L;
      var3 ^= ((long)((int)Math.round(v)) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) < 0 ? 0 : Math.min(255, (int)(var3 >>> 32));
   }

   private static class_1011 IilliliilIIi(class_1011 src, int dh, int dw) {
      long var49 = -3687297472698498770L;
      long var51 = -4903267753900721219L;
      long var53 = 1865172128304070730L;
      long var55 = 5566867951202104744L;
      long var57 = -3351254656457953016L;
      long var45 = -6031719008022558568L;
      long var47 = -8762264819249623350L;
      var45 ^= ((long)src.method_4307() << 32 ^ var45) & -1L << 32;
      var45 ^= ((long)src.method_4323() ^ var45) & -1L >>> 32;
      double var5 = (double)((int)(var45 >>> 32)) / (double)dh;
      double var7 = (double)((int)var45) / (double)dw;
      class_1011 var9 = new class_1011(dh, dw, false);

      for(var47 ^= (0L ^ var47) & -1L << 32; (int)(var47 >>> 32) < dw; var47 += 4294967296L) {
         double var11 = (double)((int)(var47 >>> 32)) * var7;
         double var13 = (double)((int)(var47 >>> 32) + 1) * var7;
         var47 ^= ((long)((int)Math.floor(var11)) ^ var47) & -1L >>> 32;
         var49 ^= ((long)Math.min((int)var45, (int)Math.ceil(var13)) << 32 ^ var49) & -1L << 32;

         for(var49 ^= (0L ^ var49) & -1L >>> 32; (int)var49 < dh; var49 ^= (var49 ^ var49 + (long)1) & -1L >>> 32) {
            double var18 = (double)((int)var49) * var5;
            double var20 = (double)((int)var49 + 1) * var5;
            var51 ^= ((long)((int)Math.floor(var18)) << 32 ^ var51) & -1L << 32;
            var51 ^= ((long)Math.min((int)(var45 >>> 32), (int)Math.ceil(var20)) ^ var51) & -1L >>> 32;
            double var24 = (double)0.0F;
            double var26 = (double)0.0F;
            double var28 = (double)0.0F;
            double var30 = (double)0.0F;
            double var32 = (double)0.0F;

            for(var53 ^= ((long)((int)var47) << 32 ^ var53) & -1L << 32; (int)(var53 >>> 32) < (int)(var49 >>> 32); var53 += 4294967296L) {
               double var35 = Math.min(var13, (double)((int)(var53 >>> 32) + 1)) - Math.max(var11, (double)((int)(var53 >>> 32)));
               if (!(var35 <= (double)0.0F)) {
                  for(var53 ^= ((long)((int)(var51 >>> 32)) ^ var53) & -1L >>> 32; (int)var53 < (int)var51; var53 ^= (var53 ^ var53 + (long)1) & -1L >>> 32) {
                     double var38 = Math.min(var20, (double)((int)var53 + 1)) - Math.max(var18, (double)((int)var53));
                     if (!(var38 <= (double)0.0F)) {
                        double var40 = var38 * var35;
                        var55 ^= ((long)src.method_61940((int)var53, (int)(var53 >>> 32)) << 32 ^ var55) & -1L << 32;
                        double var43 = (double)((int)(var55 >>> 32) >>> 24 & 255) / (double)255.0F;
                        var24 += var40;
                        var26 += var40 * var43;
                        var28 += var40 * var43 * (double)((int)(var55 >>> 32) >> 16 & 255);
                        var30 += var40 * var43 * (double)((int)(var55 >>> 32) >> 8 & 255);
                        var32 += var40 * var43 * (double)((int)(var55 >>> 32) & 255);
                     }
                  }
               }
            }

            var53 ^= ((long)(var24 <= (double)0.0F ? 0 : (int)Math.round(var26 / var24 * (double)255.0F)) << 32 ^ var53) & -1L << 32;
            var55 ^= (255L ^ var55) & -1L >>> 32;
            var57 ^= (1095216660480L ^ var57) & -1L << 32;
            var53 ^= (255L ^ var53) & -1L >>> 32;
            if (var26 > 1.0E-9) {
               var55 ^= ((long)lIiiIiIlilli(var28 / var26) ^ var55) & -1L >>> 32;
               var57 ^= ((long)lIiiIiIlilli(var30 / var26) << 32 ^ var57) & -1L << 32;
               var53 ^= ((long)lIiiIiIlilli(var32 / var26) ^ var53) & -1L >>> 32;
            }

            var9.method_61941((int)var49, (int)(var47 >>> 32), lIiiIiIlilli((double)((int)(var53 >>> 32))) << 24 | (int)var55 << 16 | (int)(var57 >>> 32) << 8 | (int)var53);
         }
      }

      return var9;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) << 8) - var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) << 8) - var5) >>> 8) - var5))) + var5) - var5) << 15 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) << 8) - var5) << 8 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + var5) >>> 13 | (char)((char)((char)(var4[var5] ^ var5) - var5) + var5) << 3) ^ '馼'))) + var5) + '칧') ^ 3905) << 8) - var5) >>> 8) - var5))) + var5) - var5) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String iliIiiliiiii(class_2960 id) {
      long var5 = 5923962352623242796L;
      String var1 = id.method_12832().toLowerCase(Locale.ROOT);
      StringBuilder var2 = new StringBuilder(var1.length());

      for(var5 ^= (0L ^ var5) & -1L << 32; (int)(var5 >>> 32) < var1.length(); var5 += 4294967296L) {
         var5 ^= ((long)var1.charAt((int)(var5 >>> 32)) ^ var5) & -1L >>> 32;
         var2.append((char)(((int)var5 < 97 || (int)var5 > 122) && ((int)var5 < 48 || (int)var5 > 57) && (int)var5 != 95 && (int)var5 != 45 ? '_' : (int)var5));
      }

      return var2.toString();
   }

   private static boolean liiiIIllIl(class_2960 id) {
      if (!IiIlliIliiIl<invokedynamic>().equals(id.method_12836())) {
         return false;
      } else {
         String var1 = id.method_12832();
         return var1.startsWith(IiIlliIliiIl<invokedynamic>()) || var1.startsWith(IiIlliIliiIl<invokedynamic>());
      }
   }

   private IlilIiilllilIiil() {
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) << 13 | (char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) >>> 3) - 7607))))))))) << 3 | (char)(-((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) << 13 | (char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) >>> 3) - 7607))))))))) >>> 13) << 2 | (char)((char)(-((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) << 13 | (char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) >>> 3) - 7607))))))))) << 3 | (char)(-((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) << 13 | (char)((char)(~((char)(~var4[var5]))) >>> 2 | (char)(~((char)(~var4[var5]))) << 14) >>> 3) - 7607))))))))) >>> 13) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_2960 IliIlllilIi(class_2960 devW, int src, int devH) {
      long var10 = 7723522491349713202L;
      if (devW != null && src > 0 && devH > 0 && liiiIIllIl(devW) && !iIIlIIilil.contains(devW)) {
         class_1011 var3 = iIlIlllllill(devW);
         if (var3 == null) {
            return devW;
         } else {
            var10 ^= ((long)var3.method_4307() << 32 ^ var10) & -1L << 32;
            var10 ^= ((long)var3.method_4323() ^ var10) & -1L >>> 32;
            if (src >= (int)(var10 >>> 32) && devH >= (int)var10) {
               return devW;
            } else if (src <= (int)(var10 >>> 32) && devH <= (int)var10) {
               String var6 = devW + IiIlliIliiIl<invokedynamic>() + src + IiIlliIliiIl<invokedynamic>() + devH;
               class_2960 var7 = (class_2960)IlIlIIilil.get(var6);
               if (var7 != null) {
                  return var7;
               } else {
                  try {
                     class_1011 var8 = IilliliilIIi(var3, src, devH);
                     class_2960 var9 = class_2960.method_60655(IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>() + iliIiiliiiii(devW) + IiIlliIliiIl<invokedynamic>() + src + IiIlliIliiIl<invokedynamic>() + devH);
                     class_310.method_1551().method_1531().method_4616(var9, new class_1043(() -> IiIlliIliiIl<invokedynamic>() + var6, var8));
                     IlIlIIilil.put(var6, var9);
                     IIIllIIliIIl();
                     return var9;
                  } catch (Throwable var12) {
                     iIIlIIilil.add(devW);
                     return devW;
                  }
               }
            } else {
               return devW;
            }
         }
      } else {
         return devW;
      }
   }
}
