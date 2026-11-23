package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2248;
import net.minecraft.class_2487;
import net.minecraft.class_2499;
import net.minecraft.class_2505;
import net.minecraft.class_2507;
import net.minecraft.class_2680;
import net.minecraft.class_2960;
import net.minecraft.class_7923;

public final class lliillIliliillIl {
   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) << 10) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) << 10) >>> 7) ^ 24106) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) << 10) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ 'ꛮ') ^ 32571) ^ 8552) ^ '衋') + '讉') << 1) << 10) >>> 7) ^ 24106) ^ var5) >>> 14))))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lliillIliliillIl() {
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') >>> 6) - var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') >>> 6) - var5) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') >>> 6) - var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 28255) + var5) >>> 1 | (char)((char)(var4[var5] ^ 28255) + var5) << 15) + var5) - var5) - var5) - '\ue558') ^ 14962) ^ '뇛') >>> 6) - var5) >>> 6) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iIilliIlIlilliIl IliIlllilIi(Path file) {
      long var32 = 7250203634880220693L;
      long var34 = -3388653684982661958L;
      long var36 = 2729768029008434778L;
      long var38 = -8629712391972511976L;
      long var40 = 1317439886057870605L;
      long var42 = 893295525952396529L;
      long var28 = 779151671775107555L;
      long var30 = -8278461869029775001L;
      class_2487 var1 = class_2507.method_30613(file, class_2505.method_53898());
      class_2487 var2 = var1.method_10545(lIiiIiIlilli<invokedynamic>()) ? var1.method_68568(lIiiIiIlilli<invokedynamic>()) : var1;
      var28 ^= ((long)liiiIIllIl(var2, lIiiIiIlilli<invokedynamic>()) << 32 ^ var28) & -1L << 32;
      var28 ^= ((long)liiiIIllIl(var2, lIiiIiIlilli<invokedynamic>()) ^ var28) & -1L >>> 32;
      var30 ^= ((long)liiiIIllIl(var2, lIiiIiIlilli<invokedynamic>()) << 32 ^ var30) & -1L << 32;
      if ((int)(var28 >>> 32) > 0 && (int)var28 > 0 && (int)(var30 >>> 32) > 0) {
         class_2487 var6 = var2.method_68568(lIiiIiIlilli<invokedynamic>());
         class_2487 var7 = var6.method_10545(lIiiIiIlilli<invokedynamic>()) ? var6.method_68568(lIiiIiIlilli<invokedynamic>()) : var2.method_68568(lIiiIiIlilli<invokedynamic>());
         byte[] var8 = var6.method_10545(lIiiIiIlilli<invokedynamic>()) ? (byte[])var6.method_10547(lIiiIiIlilli<invokedynamic>()).orElse(new byte[0]) : (byte[])var2.method_10547(lIiiIiIlilli<invokedynamic>()).orElse(new byte[0]);
         ArrayList var9 = new ArrayList();
         var30 ^= ~var30 & -1L >>> 32;

         for(String var12 : var7.method_10541()) {
            var30 ^= ((long)Math.max((int)var30, (Integer)var7.method_10550(var12).orElse(0)) ^ var30) & -1L >>> 32;
         }

         class_2680[] var44 = new class_2680[(int)var30 + 1];

         for(String var13 : var7.method_10541()) {
            var32 ^= ((long)(Integer)var7.method_10550(var13).orElse(0) << 32 ^ var32) & -1L << 32;
            if ((int)(var32 >>> 32) >= 0 && (int)(var32 >>> 32) < var44.length) {
               String var15 = var13.contains(lIiiIiIlilli<invokedynamic>()) ? var13.substring(0, var13.indexOf(91)) : var13;
               class_2960 var16 = class_2960.method_12829(var15);
               Optional var17 = var16 == null ? Optional.empty() : class_7923.field_41175.method_17966(var16);
               if (var17.isPresent()) {
                  var44[(int)(var32 >>> 32)] = illIiIilIilIiIil.liiiIIllIl((class_2248)var17.get(), var13, (prop, blk, reason, val) -> {
                  });
               } else {
                  var44[(int)(var32 >>> 32)] = null;
                  if (!lIiiIiIlilli<invokedynamic>().equals(var15) && !var9.contains(var15)) {
                     var9.add(var15);
                  }
               }
            }
         }

         var32 ^= ((long)((int)(var28 >>> 32) * (int)var28 * (int)(var30 >>> 32)) ^ var32) & -1L >>> 32;
         int[] var46 = new int[(int)var32];
         var32 ^= (0L ^ var32) & -1L << 32;

         int var62;
         for(var34 ^= (0L ^ var34) & -1L << 32; (int)(var34 >>> 32) < (int)var32 && (int)(var32 >>> 32) < var8.length; var46[var62] = (int)var34) {
            var34 ^= (0L ^ var34) & -1L >>> 32;
            var36 ^= (0L ^ var36) & -1L << 32;

            while((int)(var32 >>> 32) < var8.length) {
               var62 = (int)(var32 >>> 32);
               var32 += 4294967296L;
               var36 ^= ((long)var8[var62] ^ var36) & -1L >>> 32;
               var34 ^= ((long)((int)var34 | ((int)var36 & 127) << (int)(var36 >>> 32)) ^ var34) & -1L >>> 32;
               if (((int)var36 & 128) == 0) {
                  break;
               }

               var36 += 30064771072L;
               if ((int)(var36 >>> 32) > 35) {
                  break;
               }
            }

            var62 = (int)(var34 >>> 32);
            var34 += 4294967296L;
         }

         LinkedHashMap var47 = new LinkedHashMap();
         var36 ^= (0L ^ var36) & -1L << 32;

         for(var36 ^= (0L ^ var36) & -1L >>> 32; (int)var36 < (int)var32; var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32) {
            var38 ^= ((long)var46[(int)var36] << 32 ^ var38) & -1L << 32;
            class_2680 var20 = (int)(var38 >>> 32) >= 0 && (int)(var38 >>> 32) < var44.length ? var44[(int)(var38 >>> 32)] : null;
            if (var20 != null && !var20.method_26215()) {
               var47.merge(var20.method_26204(), 1, Integer::sum);
               var36 += 4294967296L;
            }
         }

         HashMap var18 = new HashMap();
         class_2499 var19 = var6.method_10545(lIiiIiIlilli<invokedynamic>()) ? var6.method_68569(lIiiIiIlilli<invokedynamic>()) : var2.method_68569(lIiiIiIlilli<invokedynamic>());

         for(long var60 = var38 ^ (0L ^ var38) & -1L >>> 32; (int)var60 < var19.size(); var60 ^= (var60 ^ var60 + (long)1) & -1L >>> 32) {
            class_2487 var21 = (class_2487)var19.method_10602((int)var60).orElse((Object)null);
            if (var21 != null) {
               int[] var22 = (int[])var21.method_10561(lIiiIiIlilli<invokedynamic>()).orElse((Object)null);
               if (var22 != null && var22.length >= 3) {
                  class_2487 var23 = var21.method_10545(lIiiIiIlilli<invokedynamic>()) ? var21.method_68568(lIiiIiIlilli<invokedynamic>()) : var21;
                  int[] var24 = (int[])var23.method_10561(lIiiIiIlilli<invokedynamic>()).orElse((Object)null);
                  if (var24 != null) {
                     var40 ^= ((long)var22[0] << 32 ^ var40) & -1L << 32;
                     var40 ^= ((long)var22[1] ^ var40) & -1L >>> 32;
                     var42 ^= ((long)var22[2] << 32 ^ var42) & -1L << 32;
                     if ((int)(var40 >>> 32) >= 0 && (int)var40 >= 0 && (int)(var42 >>> 32) >= 0 && (int)(var40 >>> 32) < (int)(var28 >>> 32) && (int)var40 < (int)var28 && (int)(var42 >>> 32) < (int)(var30 >>> 32)) {
                        var18.put(((int)var40 * (int)(var30 >>> 32) + (int)(var42 >>> 32)) * (int)(var28 >>> 32) + (int)(var40 >>> 32), IiliIIllliliIIll.IliIlllilIi(var24));
                     }
                  }
               }
            }
         }

         ArrayList var48 = new ArrayList();
         var48.add(new IiliIIIililiIIIi(0, 0, 0, (int)(var28 >>> 32), (int)var28, (int)(var30 >>> 32), var44, var46, var18));
         String var49 = file.getFileName().toString().replaceFirst(lIiiIiIlilli<invokedynamic>(), "");
         return new iIilliIlIlilliIl(var49, (int)(var28 >>> 32), (int)var28, (int)(var30 >>> 32), var48, var47, (int)(var36 >>> 32), var9);
      } else {
         throw new IllegalStateException(lIiiIiIlilli<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 11 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 5) - var5) >>> 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 11 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 5) - var5) << 14))))) ^ var5) ^ '\ueb85') ^ var5) ^ var5) + var5) ^ var5) + var5) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 11 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 5) - var5) >>> 2 | (char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 11 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 5) - var5) << 14))))) ^ var5) ^ '\ueb85') ^ var5) ^ var5) + var5) ^ var5) + var5) - var5) << 2) + '\ue313'))) - 1690));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)var4[var5] + '\udca3') ^ '쵌'))) << 4 | (char)(-((char)((char)((char)var4[var5] + '\udca3') ^ '쵌'))) >>> 12))) + 'Ｄ') ^ 25038) - var5) ^ var5))) ^ 20083) - var5) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)var4[var5] + '\udca3') ^ '쵌'))) << 4 | (char)(-((char)((char)((char)var4[var5] + '\udca3') ^ '쵌'))) >>> 12))) + 'Ｄ') ^ 25038) - var5) ^ var5))) ^ 20083) - var5) << 8));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) ^ 25920) ^ 29574))) - 12989) - var5) + 9180) - '넆'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int liiiIIllIl(class_2487 c, String key) {
      return (Integer)c.method_10568(key).map(Short::intValue).or(() -> c.method_10550(key)).orElse(0);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7039133619953999675L ^ Long.rotateLeft(7529299299765404759L, 5) ^ -5222099128197511439L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3320616071729066393L ^ Long.rotateLeft(6888752218389637193L, 10) ^ -5673758014695218501L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1189019158056470619L ^ Long.rotateLeft(-8772225106526762649L, 11) ^ 4635252996770410003L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8963662405090073551L ^ Long.rotateLeft(1081207951163600787L, 41) ^ -5325559984356854871L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3604399546765348262L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4177147804030537103L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6427845976500357630L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5093056142011860426L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8811433727713059516L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8627713225159690078L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
}
