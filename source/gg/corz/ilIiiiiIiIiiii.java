package gg.corz;

import com.mojang.blaze3d.textures.GpuTextureView;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.CompletableFuture;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1011;
import net.minecraft.class_1043;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_332;

public final class ilIiiiiIiIiiii {
   public static final int ililllIlIl = 3;
   public static final int llilllIlIl = 2;
   private static final class_1043[] iiilllIlIl = new class_1043[4];
   public static final int IiilllIlIl = 4;
   public static final int IlilllIlIl = 1;
   private static final CompletableFuture<int[]>[] lIIillIlIl = new CompletableFuture[4];
   public static final int iIilllIlIl = 0;
   private static final long[] IIIillIlIl = new long[4];
   private static boolean iIIillIlIl;
   private static final float liilllIlIl = 220.0F;

   public static void iIlIlllllill() {
      long var3 = -1805025174525909954L;
      if (!iIIillIlIl) {
         for(long var6 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var6 >>> 32) < 4; var6 += 4294967296L) {
            if (iiilllIlIl[(int)(var6 >>> 32)] == null && lIIillIlIl[(int)(var6 >>> 32)] == null) {
               var6 ^= ((long)((int)(var6 >>> 32)) ^ var6) & -1L >>> 32;

               try {
                  lIIillIlIl[(int)(var6 >>> 32)] = CompletableFuture.supplyAsync(() -> IIIllIIliIIl(kind));
               } catch (Throwable var5) {
                  IlIlllIlilIl(var5);
                  return;
               }
            }
         }

      }
   }

   public static void IilliliilIIi(class_332 y, int w, float h, float radius, float x, float ctx, float kind) {
      long var15 = -6295998923429447228L;
      if (!(x <= 0.0F) && !(ctx <= 0.0F)) {
         w = IiIlliIliiIl(w);
         var15 ^= ((long)liiIIiiiiIIi.iIiliiiiIliliiii[w] << 32 ^ var15) & -1L << 32;
         float var8 = lIiiIiIlilli(w);
         if (var8 < 0.999F) {
            IIIiiIillIIiiIil.IlIlllIlilIl(y, h, radius, x, ctx, kind, (int)(var15 >>> 32));
         }

         if (!(var8 <= 0.001F)) {
            try {
               GpuTextureView var9 = iiilllIlIl[w].method_71659();
               float var10 = x / ctx;
               float var11 = liiIIiiiiIIi.liiiIIllIl(var10);
               float var12 = liiIIiiiiIIi.iIlIlllllill(var10);
               float var13 = (1.0F - var11) / 2.0F;
               float var14 = (1.0F - var12) / 2.0F;
               IliiIilliiIi.Iiiiliiiiiii(IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761(), h, radius, h + x, radius + ctx, var13, var14, var13 + var11, var14 + var12, var9, kind, var8);
            } catch (Throwable var17) {
               IlIlllIlilIl(var17);
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5))))) ^ '툰') - var5))) >>> 15 | (char)(~((char)((char)((char)(-((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5))))) ^ '툰') - var5))) << 1) ^ '촹') ^ var5) ^ var5) ^ var5) - var5) + 18593))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5))))) ^ '툰') - var5))) >>> 15 | (char)(~((char)((char)((char)(-((char)(~((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) + var5))))) ^ '툰') - var5))) << 1) ^ '촹') ^ var5) ^ var5) ^ var5) - var5) + 18593))) << 5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int[] IIIllIIliIIl(int kind) {
      long var6 = -4543701402160957982L;
      long var8 = -7884464499841917392L;
      var6 ^= (1099511627776L ^ var6) & -1L << 32;
      var6 ^= (160L ^ var6) & -1L >>> 32;
      int[] var3 = new int[(int)(var6 >>> 32) * (int)var6];

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < (int)var6; var8 += 4294967296L) {
         for(var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < (int)(var6 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            var3[(int)(var8 >>> 32) * (int)(var6 >>> 32) + (int)var8] = liiIIiiiiIIi.IliIlllilIi(kind, (int)var8, (int)(var8 >>> 32), (int)(var6 >>> 32), (int)var6);
         }
      }

      return var3;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6873120413397161679L ^ Long.rotateLeft(8228058433052502071L, 42) ^ 273124976667563833L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7999329628688198791L ^ Long.rotateLeft(2050625525704606439L, 55) ^ -8892036344618541614L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7574538851140523907L ^ Long.rotateLeft(-2716887197965113279L, 34) ^ -8812211199881389559L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8788052300572271377L ^ Long.rotateLeft(4596320894086355086L, 16) ^ 912334393135921960L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5610909734759882823L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8463920013706773402L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3123493126372569920L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1500140052127741095L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8364407544405452401L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5792473120559706876L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public static int liiiIIllIl(int kind) {
      return liiIIiiiiIIi.iIiliiiiIliliiii[IiIlliIliiIl(kind)];
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) << 3) << 1 | (char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) << 3) >>> 15) << 4 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) << 3) << 1 | (char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) >>> 13 | (char)((char)(-((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) << 12 | (char)(-((char)((char)(~((char)(-((char)(var4[var5] + 15836))))) + '췄'))) >>> 4))) ^ var5) << 3) >>> 15) >>> 12) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 29522) >>> 14 | (char)(var4[var5] ^ 29522) << 2) - var5) ^ 102) - var5))) + 29865))))) << 8 | (char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 29522) >>> 14 | (char)(var4[var5] ^ 29522) << 2) - var5) ^ 102) - var5))) + 29865))))) >>> 8))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float lIiiIiIlilli(int kind) {
      if (iIIillIlIl) {
         return 0.0F;
      } else if (iiilllIlIl[kind] == null && !iliIiiliiiii(kind)) {
         return 0.0F;
      } else {
         long var1 = IIIillIlIl[kind];
         float var3 = (float)(System.nanoTime() - var1) / 1000000.0F;
         return lliiiIliliiiIl.liiiIIllIl(var3 / 220.0F);
      }
   }

   private ilIiiiiIiIiiii() {
   }

   private static int IiIlliIliiIl(int kind) {
      return kind < 0 ? 0 : (kind >= 4 ? 3 : kind);
   }

   public static String IliIlllilIi(int kind) {
      return liiIIiiiiIIi.IIiliiiilIiliiii[IiIlliIliiIl(kind)];
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) << 15 | (char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) >>> 1) - var5))))) ^ '蟌') - 29724) ^ var5) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) << 15 | (char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) >>> 1) - var5))))) ^ '蟌') - 29724) ^ var5) ^ var5) << 1) + var5) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) << 15 | (char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) >>> 1) - var5))))) ^ '蟌') - 29724) ^ var5) ^ var5) >>> 15 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) << 15 | (char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - 31791))) - var5) >>> 1) - var5))))) ^ '蟌') - 29724) ^ var5) ^ var5) << 1) + var5) ^ var5) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean iliIiiliiiii(int kind) {
      long var7 = -9220254618831020126L;
      CompletableFuture var1 = lIIillIlIl[kind];
      if (var1 == null) {
         iIlIlllllill();
         return false;
      } else if (!var1.isDone()) {
         return false;
      } else {
         lIIillIlIl[kind] = null;

         try {
            int[] var2 = (int[])var1.join();
            class_1011 var3 = new class_1011(256, 160, false);

            for(long var10 = var7 ^ (0L ^ var7) & -1L << 32; (int)(var10 >>> 32) < var2.length; var10 += 4294967296L) {
               var3.method_61941((int)(var10 >>> 32) % 256, (int)(var10 >>> 32) / 256, var2[(int)(var10 >>> 32)]);
            }

            String var4 = Iilllilliill<invokedynamic>() + kind;
            class_1043 var5 = new class_1043(() -> var4, var3);
            class_2960 var6 = class_2960.method_60655(Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>() + kind);
            class_310.method_1551().method_1531().method_4616(var6, var5);
            iiilllIlIl[kind] = var5;
            IIIillIlIl[kind] = System.nanoTime();
            return true;
         } catch (Throwable var9) {
            IlIlllIlilIl(var9);
            return false;
         }
      }
   }

   private static void IlIlllIlilIl(Throwable t) {
      if (!iIIillIlIl) {
         iIIillIlIl = true;
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 2440) ^ '먐') - '锠') + var5) - var5))) + var5) - var5) >>> 5 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 2440) ^ '먐') - '锠') + var5) - var5))) + var5) - var5) << 11) + var5))) ^ '\uf5e0'))) + var5) >>> 8 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 2440) ^ '먐') - '锠') + var5) - var5))) + var5) - var5) >>> 5 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 2440) ^ '먐') - '锠') + var5) - var5))) + var5) - var5) << 11) + var5))) ^ '\uf5e0'))) + var5) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
