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
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record liiIIilliiiIIill(long container, long stand, int interactionFace, double hitX, double hitY, double hitZ, String routeProof, String screenType) {
   private final double iiliillill;
   private final double IIiiillill;
   private final int liliillill;
   private final long illiillill;
   private final String iIiiillill;
   private final String Iliiillill;
   private final double lIiiillill;
   private static final int[][] lliiillill = new int[][]{{0, -1, 2}, {0, 1, 3}, {-1, 0, 4}, {1, 0, 5}};
   private final long Iiliillill;

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ var5))) + 'ꈀ') + 22396) - '鶸') + var5))) + var5) - 29799) ^ var5) - 17416) + var5))))) + 14469) << 9 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ var5))) + 'ꈀ') + 22396) - '鶸') + var5))) + var5) - 29799) ^ var5) - 17416) + var5))))) + 14469) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl() {
      return this.liliillill;
   }

   public long IIIllIIliIIl() {
      return this.Iiliillill;
   }

   public String Iilllilliill() {
      return this.iIiiillill;
   }

   public double IiIlliIliiIl() {
      return this.iiliillill;
   }

   public String IIillIiliIil() {
      return this.Iliiillill;
   }

   public double Illlllllilll() {
      return this.lIiiillill;
   }

   public static double[] iIlIlllllill(long container, int face) {
      double var3 = (double)llIiIiililIiIiil.IiIlliIliiIl(container) + (double)0.5F;
      double var5 = (double)llIiIiililIiIiil.IIlllIlliIll(container) + 0.45;
      double var7 = (double)llIiIiililIiIiil.Illlllllilll(container) + (double)0.5F;
      switch (face) {
         case 1 -> var5 = (double)llIiIiililIiIiil.IIlllIlliIll(container) + 0.85;
         case 2 -> var7 -= 0.42;
         case 3 -> var7 += 0.42;
         case 4 -> var3 -= 0.42;
         case 5 -> var3 += 0.42;
      }

      return new double[]{var3, var5, var7};
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) >>> 4 | (char)((char)(-((char)(~var4[var5]))) ^ var5) << 12) >>> 6 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5) >>> 4 | (char)((char)(-((char)(~var4[var5]))) ^ var5) << 12) << 10) + var5) ^ var5))))) - var5) - 9601) ^ var5) ^ var5) ^ var5) + '좷') - var5) ^ 896));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iliIiiliiiii() {
      return this.illiillill;
   }

   public static liiIIilliiiIIill IilliliilIIi(long stand, long routeProof, int container, String screenType, String face) {
      double[] var7 = iIlIlllllill(stand, container);
      return new liiIIilliiiIIill(stand, routeProof, container, var7[0], var7[1], var7[2], screenType, face);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] ^ '\ud824') ^ 32375))) ^ '胊'))) ^ 'ꢙ') + var5))) ^ var5) >>> 5 | (char)((char)(~((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] ^ '\ud824') ^ 32375))) ^ '胊'))) ^ 'ꢙ') + var5))) ^ var5) << 11) - var5) + var5) - 22900) - var5) ^ var5) ^ 16712) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12))))) ^ '\ue7b7'))) + '麊') - '쒤') + '섹') >>> 13 | (char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12))))) ^ '\ue7b7'))) + '麊') - '쒤') + '섹') << 3) ^ '\udc66') - var5))))) << 10 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12))))) ^ '\ue7b7'))) + '麊') - '쒤') + '섹') >>> 13 | (char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12))))) ^ '\ue7b7'))) + '麊') - '쒤') + '섹') << 3) ^ '\udc66') - var5))))) >>> 6) - '켿') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String lIiiIiIlilli() {
      return String.format(Locale.ROOT, Ililllililil<invokedynamic>(), llIiIiililIiIiil.IlIlllIlilIl(this.illiillill), llIiIiililIiIiil.IlIlllIlilIl(this.Iiliillill), this.liliillill, this.iiliillill, this.IIiiillill, this.lIiiillill, this.iIiiillill, this.Iliiillill);
   }

   public static List<long[]> liiiIIllIl(long frontFaceOrdinal, Integer container, lIIlIIliIIlIIl g) {
      long var19 = 1471851411603528637L;
      long var21 = 4999802249546450729L;
      long var23 = 1855176641946621782L;
      long var25 = 6808327833444072712L;
      long var27 = 4698421957251832010L;
      long var29 = 3753528530350466070L;
      var19 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(frontFaceOrdinal) << 32 ^ var19) & -1L << 32;
      var19 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(frontFaceOrdinal) ^ var19) & -1L >>> 32;
      var21 ^= ((long)llIiIiililIiIiil.Illlllllilll(frontFaceOrdinal) << 32 ^ var21) & -1L << 32;
      ArrayList var7 = new ArrayList();
      ArrayList var8 = new ArrayList();
      int[][] var9 = lliiillill;
      var21 ^= ((long)var9.length ^ var21) & -1L >>> 32;

      for(var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
         int[] var12 = var9[(int)(var23 >>> 32)];
         if (container != null && var12[2] == container) {
            var8.add(var12);
         }
      }

      var9 = lliiillill;
      var21 ^= ((long)var9.length ^ var21) & -1L >>> 32;

      for(var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
         int[] var34 = var9[(int)(var23 >>> 32)];
         if (container == null || var34[2] != container) {
            var8.add(var34);
         }
      }

      var9 = new int[]{0, -1, 1};
      var21 ^= ((long)var9.length ^ var21) & -1L >>> 32;

      for(var23 ^= (0L ^ var23) & -1L << 32; (int)(var23 >>> 32) < (int)var21; var23 += 4294967296L) {
         var23 ^= ((long)var9[(int)(var23 >>> 32)] ^ var23) & -1L >>> 32;

         for(int[] var14 : var8) {
            long var15 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + var14[0], (int)var19, (int)(var21 >>> 32) + var14[1]);
            if (!g.liiiIIllIl(var15)) {
               long var17 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + var14[0], (int)var19 + (int)var23, (int)(var21 >>> 32) + var14[1]);
               if (g.IliIlllilIi(var17)) {
                  var7.add(new long[]{var17, (long)var14[2]});
               }
            }
         }
      }

      if (!g.liiiIIllIl(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32), (int)var19 + 1, (int)(var21 >>> 32)))) {
         var9 = lliiillill;
         var21 ^= ((long)var9.length ^ var21) & -1L >>> 32;

         for(long var48 = var23 ^ (0L ^ var23) & -1L << 32; (int)(var48 >>> 32) < (int)var21; var48 += 4294967296L) {
            int[] var35 = var9[(int)(var48 >>> 32)];
            long var36 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + var35[0], (int)var19 + 1, (int)(var21 >>> 32) + var35[1]);
            if (g.IliIlllilIi(var36)) {
               var25 ^= (0L ^ var25) & -1L << 32;

               for(long[] var37 : var7) {
                  if (var37[0] == var36) {
                     var25 ^= (4294967296L ^ var25) & -1L << 32;
                     break;
                  }
               }

               if ((int)(var25 >>> 32) == 0) {
                  var7.add(new long[]{var36, 1L});
               }
            }
         }
      }

      for(long var49 = var25 ^ ~var25 & -1L >>> 32; (int)var49 <= 1; var49 ^= (var49 ^ var49 + (long)2) & -1L >>> 32) {
         for(var21 ^= ~var21 & -1L >>> 32; (int)var21 <= 1; var21 ^= (var21 ^ var21 + (long)2) & -1L >>> 32) {
            long var11 = llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + (int)var49, (int)var19, (int)(var21 >>> 32) + (int)var21);
            if (g.IliIlllilIi(var11)) {
               var27 ^= ((long)((int)var49 < 0 ? 4 : 5) << 32 ^ var27) & -1L << 32;
               var27 ^= ((long)((int)var21 < 0 ? 2 : 3) ^ var27) & -1L >>> 32;
               var49 ^= ((long)(!g.liiiIIllIl(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32) + (int)var49, (int)var19, (int)(var21 >>> 32))) ? 1 : 0) << 32 ^ var49) & -1L << 32;
               var29 ^= ((long)(!g.liiiIIllIl(llIiIiililIiIiil.IIIllIIliIIl((int)(var19 >>> 32), (int)var19, (int)(var21 >>> 32) + (int)var21)) ? 1 : 0) << 32 ^ var29) & -1L << 32;
               if ((int)(var49 >>> 32) != 0) {
                  var7.add(new long[]{var11, (long)((int)(var27 >>> 32))});
               } else if ((int)(var29 >>> 32) != 0) {
                  var7.add(new long[]{var11, (long)((int)var27)});
               }
            }
         }
      }

      return var7;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 19768))) ^ '韫') ^ '\uf70b') - var5) + var5) ^ 28999) - 4956) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 19768))) ^ '韫') ^ '\uf70b') - var5) + var5) ^ 28999) - 4956) << 5) - var5) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 19768))) ^ '韫') ^ '\uf70b') - var5) + var5) ^ 28999) - 4956) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 19768))) ^ '韫') ^ '\uf70b') - var5) + var5) ^ 28999) - 4956) << 5) - var5) - var5) << 2) ^ '\uaa5a') + 20006));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IliIlllilIi(boolean chestLike, boolean aboveSolid) {
      return !chestLike || !aboveSolid;
   }

   public liiIIilliiiIIill(long hitX, long interactionFace, int screenType, double stand, double hitZ, double hitY, String routeProof, String container) {
      this.illiillill = hitX;
      this.Iiliillill = interactionFace;
      this.liliillill = screenType;
      this.iiliillill = stand;
      this.IIiiillill = hitZ;
      this.lIiiillill = hitY;
      this.iIiiillill = routeProof;
      this.Iliiillill = container;
   }

   public double IIlllIlliIll() {
      return this.IIiiillill;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7516946421001370076L ^ Long.rotateLeft(-3638651456559039950L, 58) ^ -2567571708016758960L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4810360454994620407L ^ Long.rotateLeft(-6189556386458205905L, 7) ^ 6514229025181538768L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6118349280083717392L ^ Long.rotateLeft(-9056884682333412102L, 41) ^ 8038947695078236030L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3105628938751677287L ^ Long.rotateLeft(8098923942027794220L, 8) ^ -1519498345113936701L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1862456458442996627L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7893218902717271793L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4652154637797938789L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8171434824951267006L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -540619306107667718L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1352312948980575797L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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
