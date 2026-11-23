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

public final class iiiIlIiIIIllIi {
   private static int liiiIIllIl(long[] bits, int index, long states) {
      long var12 = -4368386120235868533L;
      long var14 = -4228631297129338825L;
      if (index > 0 && bits.length != 0) {
         long var4 = states * (long)index;
         var12 ^= ((long)((int)(var4 >> 6)) << 32 ^ var12) & -1L << 32;
         var12 ^= ((long)((int)((states + 1L) * (long)index - 1L >> 6)) ^ var12) & -1L >>> 32;
         var14 ^= ((long)((int)(var4 & 63L)) << 32 ^ var14) & -1L << 32;
         long var9 = index >= 64 ? -1L : (1L << index) - 1L;
         if ((int)(var12 >>> 32) >= 0 && (int)(var12 >>> 32) < bits.length) {
            if ((int)(var12 >>> 32) == (int)var12) {
               return (int)(bits[(int)(var12 >>> 32)] >>> (int)(var14 >>> 32) & var9);
            } else if ((int)var12 >= bits.length) {
               return (int)(bits[(int)(var12 >>> 32)] >>> (int)(var14 >>> 32) & var9);
            } else {
               var14 ^= ((long)(64 - (int)(var14 >>> 32)) ^ var14) & -1L >>> 32;
               return (int)((bits[(int)(var12 >>> 32)] >>> (int)(var14 >>> 32) | bits[(int)var12] << (int)var14) & var9);
            }
         } else {
            return 0;
         }
      } else {
         return 0;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - '\uf12e') >>> 1 | (char)(var4[var5] - '\uf12e') << 15) - var5))))) << 8 | (char)(~((char)(-((char)((char)((char)(var4[var5] - '\uf12e') >>> 1 | (char)(var4[var5] - '\uf12e') << 15) - var5))))) >>> 8) ^ var5) ^ var5) + var5) + 29518) + 4748) + '냃') - '\udca0') ^ 22262) - 17640) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - '\uf12e') >>> 1 | (char)(var4[var5] - '\uf12e') << 15) - var5))))) << 8 | (char)(~((char)(-((char)((char)((char)(var4[var5] - '\uf12e') >>> 1 | (char)(var4[var5] - '\uf12e') << 15) - var5))))) >>> 8) ^ var5) ^ var5) + var5) + 29518) + 4748) + '냃') - '\udca0') ^ 22262) - 17640) >>> 13))) - 'ꍙ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iIilliIlIlilliIl IliIlllilIi(Path file) {
      long var48 = -3814773016147811913L;
      long var50 = 6971809575555766838L;
      long var52 = 779702041033486855L;
      long var54 = -7004936329474993099L;
      long var56 = 6410193622495264792L;
      long var42 = -2149093245064371158L;
      long var58 = -1031159713993460682L;
      long var44 = 1833848288519359995L;
      long var60 = -8107641021935531390L;
      long var46 = -6462879414541633616L;
      long var62 = -2943592095847074591L;
      class_2487 var1 = class_2507.method_30613(file, class_2505.method_53898());
      class_2487 var2 = var1.method_68568(lIiiIiIlilli<invokedynamic>());
      String var3 = file.getFileName().toString().replaceFirst(lIiiIiIlilli<invokedynamic>(), "");
      String var4 = (String)var2.method_10558(lIiiIiIlilli<invokedynamic>()).filter((s) -> !s.isBlank()).orElse(var3);
      class_2487 var5 = var2.method_68568(lIiiIiIlilli<invokedynamic>());
      var42 ^= ((long)Math.abs((Integer)var5.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0)) << 32 ^ var42) & -1L << 32;
      var42 ^= ((long)Math.abs((Integer)var5.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0)) ^ var42) & -1L >>> 32;
      var44 ^= ((long)Math.abs((Integer)var5.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0)) << 32 ^ var44) & -1L << 32;
      ArrayList var9 = new ArrayList();
      LinkedHashMap var10 = new LinkedHashMap();
      ArrayList var11 = new ArrayList();
      var44 ^= (0L ^ var44) & -1L >>> 32;
      class_2487 var13 = var1.method_68568(lIiiIiIlilli<invokedynamic>());

      for(String var15 : var13.method_10541()) {
         class_2487 var16 = var13.method_68568(var15);
         class_2487 var17 = var16.method_68568(lIiiIiIlilli<invokedynamic>());
         long var71 = var46 ^ ((long)(Integer)var17.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0) << 32 ^ var46) & -1L << 32;
         var46 = var71 ^ ((long)(Integer)var17.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0) ^ var71) & -1L >>> 32;
         long var72 = var48 ^ ((long)(Integer)var17.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0) << 32 ^ var48) & -1L << 32;
         var48 = var72 ^ ((long)Math.abs((int)(var46 >>> 32)) ^ var72) & -1L >>> 32;
         var50 ^= ((long)Math.abs((int)var46) << 32 ^ var50) & -1L << 32;
         var50 ^= ((long)Math.abs((int)(var48 >>> 32)) ^ var50) & -1L >>> 32;
         if ((int)var48 != 0 && (int)(var50 >>> 32) != 0 && (int)var50 != 0) {
            class_2487 var24 = var16.method_68568(lIiiIiIlilli<invokedynamic>());
            var52 ^= ((long)(Integer)var24.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0) << 32 ^ var52) & -1L << 32;
            var52 ^= ((long)(Integer)var24.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0) ^ var52) & -1L >>> 32;
            var54 ^= ((long)(Integer)var24.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(0) << 32 ^ var54) & -1L << 32;
            class_2499 var28 = var16.method_68569(lIiiIiIlilli<invokedynamic>());
            class_2680[] var29 = new class_2680[var28.size()];

            for(var54 ^= (0L ^ var54) & -1L >>> 32; (int)var54 < var28.size(); var54 ^= (var54 ^ var54 + (long)1) & -1L >>> 32) {
               class_2487 var31 = (class_2487)var28.method_10602((int)var54).orElse(new class_2487());
               String var32 = (String)var31.method_10558(lIiiIiIlilli<invokedynamic>()).orElse(lIiiIiIlilli<invokedynamic>());
               class_2960 var33 = class_2960.method_12829(var32);
               Optional var34 = var33 == null ? Optional.empty() : class_7923.field_41175.method_17966(var33);
               if (var34.isPresent()) {
                  class_2487 var35 = var31.method_68568(lIiiIiIlilli<invokedynamic>());
                  var29[(int)var54] = illIiIilIilIiIil.IliIlllilIi((class_2248)var34.get(), var35, (reason, val, blk, prop) -> {
                  });
               } else {
                  var29[(int)var54] = null;
                  if (!lIiiIiIlilli<invokedynamic>().equals(var32) && !var11.contains(var32)) {
                     var11.add(var32);
                  }
               }
            }

            long[] var30 = (long[])var16.method_10565(lIiiIiIlilli<invokedynamic>()).orElse(new long[0]);
            long var76 = var56 ^ ((long)Math.max(2, 32 - Integer.numberOfLeadingZeros(Math.max(1, var29.length - 1))) << 32 ^ var56) & -1L << 32;
            var56 = var76 ^ ((long)((int)var48 * (int)(var50 >>> 32) * (int)var50) ^ var76) & -1L >>> 32;
            int[] var64 = new int[(int)var56];

            for(var58 ^= (0L ^ var58) & -1L << 32; (int)(var58 >>> 32) < (int)var56; var58 += 4294967296L) {
               var64[(int)(var58 >>> 32)] = liiiIIllIl(var30, (int)(var56 >>> 32), (long)((int)(var58 >>> 32)));
            }

            HashMap var65 = new HashMap();
            class_2499 var66 = var16.method_68569(lIiiIiIlilli<invokedynamic>());

            for(var58 ^= (0L ^ var58) & -1L >>> 32; (int)var58 < var66.size(); var58 ^= (var58 ^ var58 + (long)1) & -1L >>> 32) {
               class_2487 var37 = (class_2487)var66.method_10602((int)var58).orElse((Object)null);
               if (var37 != null) {
                  var60 ^= ((long)(Integer)var37.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(-1) << 32 ^ var60) & -1L << 32;
                  var60 ^= ((long)(Integer)var37.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(-1) ^ var60) & -1L >>> 32;
                  var62 ^= ((long)(Integer)var37.method_10550(lIiiIiIlilli<invokedynamic>()).orElse(-1) << 32 ^ var62) & -1L << 32;
                  if ((int)(var60 >>> 32) >= 0 && (int)var60 >= 0 && (int)(var62 >>> 32) >= 0 && (int)(var60 >>> 32) < (int)var48 && (int)var60 < (int)(var50 >>> 32) && (int)(var62 >>> 32) < (int)var50) {
                     int[] var41 = (int[])var37.method_10561(lIiiIiIlilli<invokedynamic>()).orElse((Object)null);
                     if (var41 != null) {
                        var65.put(((int)var60 * (int)var50 + (int)(var62 >>> 32)) * (int)var48 + (int)(var60 >>> 32), IiliIIllliliIIll.IliIlllilIi(var41));
                     }
                  }
               }
            }

            IiliIIIililiIIIi var36 = new IiliIIIililiIIIi((int)(var52 >>> 32), (int)var52, (int)(var54 >>> 32), (int)(var46 >>> 32), (int)var46, (int)(var48 >>> 32), var29, var64, var65);
            var9.add(var36);

            for(var62 ^= (0L ^ var62) & -1L >>> 32; (int)var62 < (int)(var50 >>> 32); var62 ^= (var62 ^ var62 + (long)1) & -1L >>> 32) {
               for(var60 ^= (0L ^ var60) & -1L << 32; (int)(var60 >>> 32) < (int)var50; var60 += 4294967296L) {
                  for(var60 ^= (0L ^ var60) & -1L >>> 32; (int)var60 < (int)var48; var60 ^= (var60 ^ var60 + (long)1) & -1L >>> 32) {
                     class_2680 var40 = var36.IIIllIIliIIl((int)var60, (int)var62, (int)(var60 >>> 32));
                     if (var40 != null && !var40.method_26215()) {
                        var10.merge(var40.method_26204(), 1, Integer::sum);
                        var44 ^= (var44 ^ var44 + (long)1) & -1L >>> 32;
                     }
                  }
               }
            }
         }
      }

      return new iIilliIlIlilliIl(var4, (int)(var42 >>> 32), (int)var42, (int)(var44 >>> 32), var9, var10, (int)var44, var11);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 4 | var4[var5] << 12))))) + '鞒') + 2338) ^ 19996) + var5) ^ 6165) ^ 'ꌟ') + 12853) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 4 | var4[var5] << 12))))) + '鞒') + 2338) ^ 19996) + var5) ^ 6165) ^ 'ꌟ') + 12853) >>> 3) ^ var5) - var5))));
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
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) << 8 | (char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) >>> 8))) ^ var5) ^ 31907) + 'ꈖ') + 16729) + 23290) - 20969) << 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) << 8 | (char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) >>> 8))) ^ var5) ^ 31907) + 'ꈖ') + 16729) + 23290) - 20969) >>> 2) + 11925) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) << 8 | (char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) >>> 8))) ^ var5) ^ 31907) + 'ꈖ') + 16729) + 23290) - 20969) << 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) << 8 | (char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - 2380) >>> 8))) ^ var5) ^ 31907) + 'ꈖ') + 16729) + 23290) - 20969) >>> 2) + 11925) << 1) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) >>> 2 | (char)((char)(var4[var5] ^ var5) - var5) << 14) - var5) + var5))) - var5) ^ 11252) - '풢'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iiiIlIiIIIllIi() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) << 14 | (char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) >>> 2))) - 6886) ^ var5) + var5) - 21595) + var5) << 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) << 14 | (char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) >>> 2))) - 6886) ^ var5) + var5) - 21595) + var5) >>> 8) << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) << 14 | (char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) >>> 2))) - 6886) ^ var5) + var5) - 21595) + var5) << 8 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) << 14 | (char)((char)((char)((char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) >>> 1 | (char)((char)((char)(~var4[var5]) << 8 | (char)(~var4[var5]) >>> 8) + var5) << 15) + '쵈') - var5) >>> 2))) - 6886) ^ var5) + var5) - 21595) + var5) >>> 8) >>> 15) ^ '蓔'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 654041965400330092L ^ Long.rotateLeft(-6575012487560580738L, 41) ^ 896835870572013521L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5958754576075849691L ^ Long.rotateLeft(689894952555222470L, 33) ^ 3962044785199987931L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6468084203072561019L ^ Long.rotateLeft(1792520901271972556L, 32) ^ 5305417025492847848L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6051654425681996675L ^ Long.rotateLeft(-7597494282273667733L, 46) ^ -6347509254641565944L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6264229449767240388L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8586276831512554433L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9154564882019445539L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3726709939473685387L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4007045902828883780L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7985713355144207031L;
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
