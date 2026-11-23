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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1111;
import net.minecraft.class_1144;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_3414;
import net.minecraft.class_1111.class_1112;

public final class IIiiIIlilIiiIIli {
   private static long IiliIiIlIi = 2522541218757483671L ^ -6700830818097292137L;
   public static final String ilIiIiIlIi = "deploy";
   static final float IIliIiIlIi = 0.01F;
   public static final String IiIiIiIlIi = "deploy_butterfly";
   static final int lIliIiIlIi = 24;
   static final float iiIiIiIlIi = 0.3F;
   public static final String liIiIiIlIi = "swish";
   private static final Map<String, class_3414> illiIiIlIi = new HashMap();
   private static final IiIIlliIIl IlliIiIlIi = new IiIIlliIIl();
   private static final List<IiliIiIililiIiIi> llliIiIlIi = new ArrayList();
   static final String iIliIiIlIi = "corzclient:knife.deploy";

   public static void iliIiiliiiii() {
      for(IiliIiIililiIiIi var1 : llliIiIlIi) {
         var1.IliIlllilIi();
      }

      llliIiIlIi.clear();
   }

   public static void liiiIIllIl(String sound, String run, float volume, float pitch, long style) {
      if (!IIillIiliIil<invokedynamic>().equals(sound) && volume > 0.0F) {
         class_310 var6 = class_310.method_1551();
         if (var6 != null) {
            class_1144 var7 = var6.method_1483();
            if (var7 != null) {
               ThreadLocalRandom var8 = ThreadLocalRandom.current();
               if (IillIlilillIli.Illlllllilll(run)) {
                  iIlIlllllill(var7, run, volume, style, var8);
               } else if (!IillIlilillIli.Illillliilli(run)) {
                  float var9 = IiIIlliIIl.IilliliilIIi(volume, var8.nextDouble());
                  float var10 = IiIIlliIIl.lIiiIiIlilli(pitch, iilliliIIilili.liiiIIllIl(run), var8.nextDouble());
                  String var11;
                  if (IIillIiliIil<invokedynamic>().equals(sound)) {
                     lIiIilliIiIill var12 = (lIiIilliIiIill)iilliliIIilili.iiliIIlIIl.get(run);
                     if (var12 == null) {
                        return;
                     }

                     var11 = var12.IliIlllilIi();
                     var9 *= var12.iIlIlllllill();
                     var10 *= var12.liiiIIllIl();
                  } else {
                     var11 = IIillIiliIil<invokedynamic>() + run;
                  }

                  class_3414 var14 = (class_3414)illiIiIlIi.computeIfAbsent(var11, (k) -> class_3414.method_47908(class_2960.method_60654(k)));
                  IiliIiIililiIiIi var13 = new IiliIiIililiIiIi(var14, Math.min(1.0F, var9), Math.max(0.5F, Math.min(2.0F, var10)), style, var11, var8.nextDouble(), var8.nextLong());
                  IIIllIIliIIl(var7);
                  var7.method_4873(var13);
                  if (style != (6340776286600632541L ^ 6340776286600632541L)) {
                     llliIiIlIi.add(var13);
                  }

               }
            }
         }
      }
   }

   public static long IilliliilIIi() {
      return ++IiliIiIlIi;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6533795790653970784L ^ Long.rotateLeft(-2958865204173691108L, 15) ^ 2109483727502811811L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8143776588069560158L ^ Long.rotateLeft(982808387167481725L, 24) ^ -4767185478525031305L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1632058413466427868L ^ Long.rotateLeft(9199995462350092642L, 55) ^ 7602462853442675758L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8925868561640715153L ^ Long.rotateLeft(-3575997516899771394L, 9) ^ 6843747090971576418L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7868090928438821107L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4702371080533472460L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6663510492849179243L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4053878281034138482L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6761994841588673485L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3281523430826964886L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15))) ^ var5))) + var5))) << 12 | (char)(~((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15))) ^ var5))) + var5))) >>> 4) - var5) ^ var5) + '鴮') - 158) + var5) ^ '蕾') + var5))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15))) ^ var5))) + var5))) << 12 | (char)(~((char)((char)(~((char)((char)(-((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15))) ^ var5))) + var5))) >>> 4) - var5) ^ var5) + '鴮') - 158) + var5) ^ '蕾') + var5))) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IIiiIIlilIiiIIli() {
   }

   private static void iIlIlllllill(class_1144 key, String sounds, float volume, long run, ThreadLocalRandom random) {
      class_2960 var6 = IillIlilillIli.Iilililiiili(sounds);
      if (var6 != null) {
         class_3414 var7 = (class_3414)illiIiIlIi.computeIfAbsent(IIillIiliIil<invokedynamic>(), (k) -> class_3414.method_47908(class_2960.method_60654(k)));
         IiliIiIililiIiIi var8 = new IiliIiIililiIiIi(var7, Math.min(1.0F, volume), 1.0F, run, IIillIiliIil<invokedynamic>(), random.nextDouble(), random.nextLong());
         var8.llIliIiIIi = new class_1111(var6, (r) -> 1.0F, (r) -> 1.0F, 1, class_1112.field_5474, false, false, (~-1515879956 * -349184333 - -73) * 107 ^ -1998551018);
         IIIllIIliIIl(key);
         key.method_4873(var8);
         IillIlilillIli.Iiiiliiiiiii();
         if (run != (-4921095916020196596L ^ -4921095916020196596L)) {
            llliIiIlIi.add(var8);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) >>> 6 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) << 10) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) >>> 6 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) << 10) + var5) << 15) ^ var5) + var5)) ^ 24983) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) >>> 6 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) << 10) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) >>> 6 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + '銫'))) ^ '鋰') - var5) >>> 5) - var5) << 10) + var5) << 15) ^ var5) + var5)) ^ 24983) >>> 14) + 5614) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void lIiiIiIlilli(long run) {
      if (run != 0L) {
         for(IiliIiIililiIiIi var3 : llliIiIlIi) {
            if (var3.iIIliIiIIi == run) {
               var3.IliIlllilIi();
            }
         }

         class_310 var4 = class_310.method_1551();
         if (var4 != null && var4.method_1483() != null) {
            IIIllIIliIIl(var4.method_1483());
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) >>> 9 | (char)(-var4[var5]) << 7))))) ^ 14326) + var5))))) + '超') ^ var5) >>> 9 | (char)((char)((char)(~((char)(~((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) >>> 9 | (char)(-var4[var5]) << 7))))) ^ 14326) + var5))))) + '超') ^ var5) << 7) + '멓'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 5250) << 14 | (char)(var4[var5] + 5250) >>> 2))))))))) ^ var5) + 10323) >>> 1 | (char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 5250) << 14 | (char)(var4[var5] + 5250) >>> 2))))))))) ^ var5) + 10323) << 15) ^ var5))) + var5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 5250) << 14 | (char)(var4[var5] + 5250) >>> 2))))))))) ^ var5) + 10323) >>> 1 | (char)((char)((char)(-((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 5250) << 14 | (char)(var4[var5] + 5250) >>> 2))))))))) ^ var5) + 10323) << 15) ^ var5))) + var5) << 13))) ^ var5) - 'ꆀ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIIllIIliIIl(class_1144 sounds) {
      llliIiIlIi.removeIf((soundsx) -> soundsx.method_4793() || !sounds.method_4877(soundsx));

      while(llliIiIlIi.size() > 24) {
         llliIiIlIi.remove(0);
      }

   }

   public static void IliIlllilIi(String style, String sound, float pitch, float volume) {
      liiiIIllIl(style, sound, pitch, volume, 0L);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '踚') >>> 2 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '踚') << 14) + '蓁') + var5))) - 6060))) << 6 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '踚') >>> 2 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '踚') << 14) + '蓁') + var5))) - 6060))) >>> 10) + 'ﺸ') - var5) + '텈'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
