package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2680;
import net.minecraft.class_2769;

public enum IIlIlIllIlIlIl {
   iIlIIIIllIllIIIIll,
   iilIIIIllIIiIIIIll,
   IliIIIIlllliIIIIll,
   lllIIIIllillIIIIll,
   IilIIIIlllilIIIIll,
   lIiIIIIlliIiIIIIll;

   // $FF: synthetic method
   private static IIlIlIllIlIlIl[] IilliliilIIi() {
      return new IIlIlIllIlIlIl[]{iIlIIIIllIllIIIIll, lllIIIIllillIIIIll, IilIIIIlllilIIIIll, iilIIIIllIIiIIIIll, lIiIIIIlliIiIIIIll, IliIIIIlllliIIIIll};
   }

   public static IIlIlIllIlIlIl liiiIIllIl(class_2680 world, class_2680 want, boolean worldLoaded) {
      long var4 = 3776351159938632710L;
      if (!worldLoaded) {
         return IliIIIIlllliIIIIll;
      } else if (world == null) {
         return IliIIIIlllliIIIIll;
      } else if (world == want) {
         return iIlIIIIllIllIIIIll;
      } else {
         var4 ^= ((long)want.method_26215() << 32 ^ var4) & -1L << 32;
         if (world.method_26215()) {
            return (int)(var4 >>> 32) != 0 ? iIlIIIIllIllIIIIll : lIiIIIIlliIiIIIIll;
         } else if ((int)(var4 >>> 32) != 0) {
            return lllIIIIllillIIIIll;
         } else {
            return world.method_26204() != want.method_26204() ? IilIIIIlllilIIIIll : iilIIIIllIIiIIIIll;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 29322) ^ '鹈') + '뼽') + '辑') + var5))))))) + var5) - 19310) - var5) >>> 4 | (char)((char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 29322) ^ '鹈') + '뼽') + '辑') + var5))))))) + var5) - 19310) - var5) << 12) + '\uede6') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) - var5) >>> 9 | (char)((char)(~var4[var5]) - var5) << 7))) << 3 | (char)(-((char)((char)((char)(~var4[var5]) - var5) >>> 9 | (char)((char)(~var4[var5]) - var5) << 7))) >>> 13) + var5) - '핡'))))) + var5) - var5) - 26568) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8703714385690652763L ^ Long.rotateLeft(4596121848164849937L, 47) ^ -1998848106562237822L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1512746757601125139L ^ Long.rotateLeft(-6178431205054728561L, 59) ^ -7099109590551105990L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6286776521567821611L ^ Long.rotateLeft(-3569618669207031765L, 34) ^ 2528073062440832704L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6704374666334280444L ^ Long.rotateLeft(-3047050908263541493L, 36) ^ 1326854089159826805L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5285648327765809741L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5874242473582262379L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2046051814553064524L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5706457545747103734L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -990542443054246766L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2952082475706524298L;
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

   private static boolean iIlIlllllill(class_2680 want, class_2680 world) {
      for(class_2769 var3 : want.method_28501()) {
         if (!iIiiiIlIliiiIl.IilliliilIIi(var3.method_11899())) {
            if (!world.method_28498(var3)) {
               return true;
            }

            if (!Objects.equals(want.method_11654(var3), world.method_11654(var3))) {
               return true;
            }
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) << 12 | (char)((char)(var4[var5] - var5) ^ var5) >>> 4) + var5))) - '\uea86') - var5))) >>> 15 | (char)(-((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) << 12 | (char)((char)(var4[var5] - var5) ^ var5) >>> 4) + var5))) - '\uea86') - var5))) << 1) >>> 5 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) << 12 | (char)((char)(var4[var5] - var5) ^ var5) >>> 4) + var5))) - '\uea86') - var5))) >>> 15 | (char)(-((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) << 12 | (char)((char)(var4[var5] - var5) ^ var5) >>> 4) + var5))) - '\uea86') - var5))) << 1) << 11));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) << 15 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) >>> 1) ^ var5) >>> 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) << 15 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) >>> 1) ^ var5) << 12) << 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) << 15 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) >>> 1) ^ var5) >>> 4 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) << 15 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 13 | (char)(var4[var5] - var5) >>> 3) ^ var5) + '\ue6c6') ^ var5) << 3))) >>> 1) ^ var5) << 12) >>> 2) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IIlIlIllIlIlIl IliIlllilIi(class_2680 world, class_2680 worldLoaded, boolean want) {
      long var5 = -3854602206642214849L;
      if (!want) {
         return IliIIIIlllliIIIIll;
      } else if (world == null) {
         return IliIIIIlllliIIIIll;
      } else if (world == worldLoaded) {
         return iIlIIIIllIllIIIIll;
      } else {
         var5 ^= ((long)world.method_26215() << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)worldLoaded.method_26215() ^ var5) & -1L >>> 32;
         if ((int)(var5 >>> 32) != 0) {
            return (int)var5 == 0 && !worldLoaded.method_45474() ? lIiIIIIlliIiIIIIll : iIlIIIIllIllIIIIll;
         } else if ((int)var5 == 0 && !worldLoaded.method_45474()) {
            if (world.method_26204() != worldLoaded.method_26204()) {
               return IilIIIIlllilIIIIll;
            } else {
               return iIlIlllllill(world, worldLoaded) ? iilIIIIllIIiIIIIll : iIlIIIIllIllIIIIll;
            }
         } else {
            return lllIIIIllillIIIIll;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - 14369) ^ '\uf5fa') ^ var5) - '콰') + 31703) + '落'))) ^ '蓞') - 17608) - '흇'))) ^ var5) + 8356));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
