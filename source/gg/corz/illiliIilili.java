package gg.corz;

import com.corz.client.mixins.AccessorMobSpawnerLogic;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1952;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2487;
import net.minecraft.class_2586;
import net.minecraft.class_2636;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;

public final class illiliIilili {
   private static final Predicate<class_2680> llIiIllIlilIiIllIl = (state) -> state.method_27852(class_2246.field_10260);

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 23551) - var5) + var5) ^ 4034))))))) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String liiiIIllIl(class_2586 blockEntity) {
      if (blockEntity instanceof class_2636 var1) {
         try {
            class_1952 var2 = ((AccessorMobSpawnerLogic)var1.method_11390()).corz$getSpawnEntry();
            if (var2 == null) {
               return null;
            } else {
               class_2487 var3 = var2.comp_64();
               if (var3 == null) {
                  return null;
               } else {
                  String var4 = var3.method_68564(IilliliilIIi<invokedynamic>(), "");
                  return lIIlilIiiIIlilIi.IliIlllilIi(var4);
               }
            }
         } catch (Throwable var5) {
            return null;
         }
      } else {
         return null;
      }
   }

   private illiliIilili() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '똅'))) - var5) + var5) - '\uf0eb') + 15138) ^ 21743))) << 4 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '똅'))) - var5) + var5) - '\uf0eb') + 15138) ^ 21743))) >>> 12) ^ 18728) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '똅'))) - var5) + var5) - '\uf0eb') + 15138) ^ 21743))) << 4 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '똅'))) - var5) + var5) - '\uf0eb') + 15138) ^ 21743))) >>> 12) ^ 18728) << 8) + var5) - 18248) - var5) - var5) + var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static llliiillii IliIlllilIi(class_2818 maxY, int out, int chunk, llliiillii minY) {
      long var32 = 6845163415512642062L;
      long var20 = -3039308399660563173L;
      long var22 = 5145200562941615310L;
      long var24 = 6846933932881593122L;
      long var26 = 2369492654450504377L;
      long var28 = -6570482714852354333L;
      long var30 = -3743772777027064409L;
      minY.IliIlllilIi();
      class_2826[] var4 = maxY.method_12006();
      var20 ^= ((long)maxY.method_31607() << 32 ^ var20) & -1L << 32;
      var20 ^= ((long)maxY.method_12004().method_8326() ^ var20) & -1L >>> 32;
      var22 ^= ((long)maxY.method_12004().method_8328() << 32 ^ var22) & -1L << 32;

      for(long var39 = var22 ^ (0L ^ var22) & -1L >>> 32; (int)var39 < var4.length; var39 ^= (var39 ^ var39 + (long)1) & -1L >>> 32) {
         var24 ^= ((long)((int)(var20 >>> 32) + ((int)var39 << 4)) << 32 ^ var24) & -1L << 32;
         if ((int)(var24 >>> 32) <= chunk && (int)(var24 >>> 32) + 15 >= out) {
            class_2826 var10 = var4[(int)var39];
            if (var10 != null && !var10.method_38292() && var10.method_19523(llIiIllIlilIiIllIl)) {
               ++minY.IIlIilIllIlIilIl;
               var24 ^= ((long)(Math.max(out, (int)(var24 >>> 32)) - (int)(var24 >>> 32)) ^ var24) & -1L >>> 32;
               var26 ^= ((long)(Math.min(chunk, (int)(var24 >>> 32) + 15) - (int)(var24 >>> 32)) << 32 ^ var26) & -1L << 32;

               for(var26 ^= ((long)((int)var24) ^ var26) & -1L >>> 32; (int)var26 <= (int)(var26 >>> 32); var26 ^= (var26 ^ var26 + (long)1) & -1L >>> 32) {
                  for(var28 ^= (0L ^ var28) & -1L << 32; (int)(var28 >>> 32) < 16; var28 += 4294967296L) {
                     for(var28 ^= (0L ^ var28) & -1L >>> 32; (int)var28 < 16; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
                        if (var10.method_12254((int)var28, (int)var26, (int)(var28 >>> 32)).method_27852(class_2246.field_10260)) {
                           long var42 = var30 ^ ((long)((int)var20 + (int)var28) << 32 ^ var30) & -1L << 32;
                           var30 = var42 ^ ((long)((int)(var24 >>> 32) + (int)var26) ^ var42) & -1L >>> 32;
                           var32 ^= ((long)((int)(var39 >>> 32) + (int)(var28 >>> 32)) << 32 ^ var32) & -1L << 32;
                           class_2338 var19 = new class_2338((int)(var30 >>> 32), (int)var30, (int)(var32 >>> 32));
                           minY.liIIilIliiIIilIl.put(iIiIiiIlIliIiiIl.lIiiIiIlilli((int)(var30 >>> 32), (int)var30, (int)(var32 >>> 32)), liiiIIllIl(maxY.method_8321(var19)));
                        }
                     }
                  }
               }
            } else {
               ++minY.iIlIilIlIllIilIl;
            }
         }
      }

      for(Map.Entry var9 : maxY.method_12214().entrySet()) {
         Object var11 = var9.getValue();
         if (var11 instanceof class_2636 var34) {
            ++minY.lllIilIlillIilIl;
            class_2338 var35 = (class_2338)var9.getKey();
            if (var35.method_10264() >= out && var35.method_10264() <= chunk && maxY.method_8320(var35).method_27852(class_2246.field_10260)) {
               long var12 = iIiIiiIlIliIiiIl.lIiiIiIlilli(var35.method_10263(), var35.method_10264(), var35.method_10260());
               String var14 = liiiIIllIl(var34);
               if (!minY.liIIilIliiIIilIl.containsKey(var12) || var14 != null && minY.liIIilIliiIIilIl.get(var12) == null) {
                  minY.liIIilIliiIIilIl.put(var12, var14);
               }
            }
         }
      }

      return minY;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '錞'))) >>> 15 | (char)(~((char)(var4[var5] + '錞'))) << 1) ^ var5) + var5) + 3932) + var5) - var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '錞'))) >>> 15 | (char)(~((char)(var4[var5] + '錞'))) << 1) ^ var5) + var5) + 3932) + var5) - var5))) << 7) + 17566))) + 'ꌭ') + var5) >>> 11 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '錞'))) >>> 15 | (char)(~((char)(var4[var5] + '錞'))) << 1) ^ var5) + var5) + 3932) + var5) - var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '錞'))) >>> 15 | (char)(~((char)(var4[var5] + '錞'))) << 1) ^ var5) + var5) + 3932) + var5) - var5))) << 7) + 17566))) + 'ꌭ') + var5) << 5) ^ var5) + var5) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))))) - var5) >>> 1 | (char)((char)(~((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))))) - var5) << 15) ^ var5) << 12 | (char)((char)((char)((char)(~((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))))) - var5) >>> 1 | (char)((char)(~((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))))) - var5) << 15) ^ var5) >>> 4) - 21023) ^ '웲') - 13903) ^ var5) ^ '臞')) ^ var5) - 'ꡰ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1994042180408309736L ^ Long.rotateLeft(-6219261069395359791L, 60) ^ -7045162800025940903L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1945204330653139371L ^ Long.rotateLeft(7415019856059856261L, 12) ^ -7553059940129490262L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2872963018541484072L ^ Long.rotateLeft(1279804481563855261L, 10) ^ -5240935324838026583L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5339445840326422419L ^ Long.rotateLeft(4251845070875621100L, 14) ^ 9127949879091215392L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8495491391810744178L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8317570211545444650L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2047304178013837846L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -289039573222212022L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7793999076721594327L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4519352848398621591L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 1082) + var5) ^ 1656))) ^ 2568))) >>> 12 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - var5) - 1082) + var5) ^ 1656))) ^ 2568))) << 4) ^ var5))) ^ 7032))) ^ var5) ^ '镄'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
