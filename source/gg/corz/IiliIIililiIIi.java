package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IiliIIililiIIi {
   public static final int IIIlIIIiilIIlIIIii = 2;
   public static final int IilIIIIiililIIIIii = 2;
   public static final int iilIIIIiiIIiIIIIii = 3;
   public static final int iliIIIIiiIiiIIIIii = 6;
   public static final int IliIIIIiilliIIIIii = 5;
   public static final int lIiIIIIiiiIiIIIIii = 4;
   private static final long iIIlIIIiiIlIlIIIii = -3750763034362895579L;
   private static final long llIlIIIiiilIlIIIii = 1099511628211L;
   public static final int lllIIIIiiillIIIIii = 1;
   public static final int iIlIIIIiiIllIIIIii = 0;
   public static final int liiIIIIiiiiiIIIIii = 4;

   private IiliIIililiIIi() {
   }

   private static long IiIlliIliiIl(long h, int v) {
      h = (h ^ (long)v & 4294967295L) * 1099511628211L;
      return h ^ h >>> 29;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 9 | (char)(var4[var5] << 11 | var4[var5] >>> 5) << 7) + var5) + var5))) ^ 30906) + var5) + '逹') >>> 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 9 | (char)(var4[var5] << 11 | var4[var5] >>> 5) << 7) + var5) + var5))) ^ 30906) + var5) + '逹') << 13) - '훪'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 12 | (char)(var4[var5] ^ var5) >>> 4) - var5) ^ var5) ^ var5) ^ 7347) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 12 | (char)(var4[var5] ^ var5) >>> 4) - var5) ^ var5) ^ var5) ^ 7347) >>> 1) - var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 12 | (char)(var4[var5] ^ var5) >>> 4) - var5) ^ var5) ^ var5) ^ 7347) << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 12 | (char)(var4[var5] ^ var5) >>> 4) - var5) ^ var5) ^ var5) ^ 7347) >>> 1) - var5))) >>> 11) + '阢'))) ^ var5) - '謝'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int IlIlllIlilIl(StringBuilder b, int sb, String written, String name, String a, boolean changed) {
      if (!changed) {
         return sb;
      } else {
         if (sb > 0) {
            b.append(Illlllllilll<invokedynamic>());
         }

         b.append(written).append(Illlllllilll<invokedynamic>()).append(name).append(Illlllllilll<invokedynamic>()).append(a);
         return sb + 1;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') << 3 | (char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') >>> 13))) - var5) >>> 6 | (char)((char)(~((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') << 3 | (char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') >>> 13))) - var5) << 10))))) ^ var5) << 9 | (char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') << 3 | (char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') >>> 13))) - var5) >>> 6 | (char)((char)(~((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') << 3 | (char)((char)((char)(~((char)(~((char)(var4[var5] + 16369))))) ^ '\uda1f') - '\uebb8') >>> 13))) - var5) << 10))))) ^ var5) >>> 7) - var5) + var5) - '\uabee'))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 10753) ^ 28870) - var5) ^ var5))))) << 6 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 10753) ^ 28870) - var5) ^ var5))))) >>> 10))) ^ var5) ^ 8574) ^ var5) << 10 | (char)((char)((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 10753) ^ 28870) - var5) ^ var5))))) << 6 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] - 10753) ^ 28870) - var5) ^ var5))))) >>> 10))) ^ var5) ^ 8574) ^ var5) >>> 6) ^ '씋'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static long IilliliilIIi(long... dependencyClocks) {
      long var8 = 3628422335240377984L;
      if (dependencyClocks != null && dependencyClocks.length != 0) {
         long var1 = 0L;
         long[] var3 = dependencyClocks;
         var8 ^= ((long)dependencyClocks.length << 32 ^ var8) & -1L << 32;

         for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
            long var6 = var3[(int)var11];
            var1 += IIlllIlliIll(var6);
         }

         return IIlllIlliIll(var1 ^ (long)dependencyClocks.length * 1099511628211L);
      } else {
         return -3750763034362895579L;
      }
   }

   public static int iIlIlllllill(int y) {
      return Math.floorDiv(y, 2);
   }

   public static int lIiiIiIlilli(int dx, int dy, int dz) {
      long var6 = -8473877992345607952L;
      long var8 = -3556576962529964893L;
      var6 ^= ((long)Math.abs(dx) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)Math.abs(dy) ^ var6) & -1L >>> 32;
      var8 ^= ((long)Math.abs(dz) << 32 ^ var8) & -1L << 32;
      if ((int)(var6 >>> 32) == 0 && (int)var6 == 0 && (int)(var8 >>> 32) == 0) {
         return 6;
      } else if ((int)var6 > (int)(var6 >>> 32) && (int)var6 > (int)(var8 >>> 32)) {
         return dy > 0 ? 4 : 5;
      } else if ((int)(var6 >>> 32) >= (int)(var8 >>> 32)) {
         return dx > 0 ? 2 : 3;
      } else {
         return dz > 0 ? 1 : 0;
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) << 12 | (char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) >>> 4))) ^ '꣑') - 29805) - 22737) ^ 17077) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) << 12 | (char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) >>> 4))) ^ '꣑') - 29805) - 22737) ^ 17077) << 8) << 9 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) << 12 | (char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) >>> 4))) ^ '꣑') - 29805) - 22737) ^ 17077) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) << 12 | (char)((char)((char)(var4[var5] ^ var5) + 31463) + var5) >>> 4))) ^ '꣑') - 29805) - 22737) ^ 17077) << 8) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static long IIlllIlliIll(long z) {
      z += -7046029254386353131L;
      z = (z ^ z >>> 30) * -4658895280553007687L;
      z = (z ^ z >>> 27) * -7723592293110705685L;
      return z ^ z >>> 31;
   }

   public static String IIIllIIliIIl(int side) {
      String var10000;
      switch (side) {
         case 0 -> var10000 = Illlllllilll<invokedynamic>();
         case 1 -> var10000 = Illlllllilll<invokedynamic>();
         case 2 -> var10000 = Illlllllilll<invokedynamic>();
         case 3 -> var10000 = Illlllllilll<invokedynamic>();
         case 4 -> var10000 = Illlllllilll<invokedynamic>();
         case 5 -> var10000 = Illlllllilll<invokedynamic>();
         case 6 -> var10000 = Illlllllilll<invokedynamic>();
         default -> var10000 = Illlllllilll<invokedynamic>() + side;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -704020669143546915L ^ Long.rotateLeft(9143672386417687514L, 4) ^ -8390644190979381694L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4399243199207256300L ^ Long.rotateLeft(-7340788240165623973L, 2) ^ -3440093568470850552L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3230670403178002118L ^ Long.rotateLeft(-5669931994684169673L, 18) ^ -4507488753846156810L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4422107450602699847L ^ Long.rotateLeft(-5846487731092931013L, 46) ^ -1487679859671897567L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6017514086840874466L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4807748987061483816L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3087574198355358132L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4138012943331904174L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4775383143815025832L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2945023455014057385L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   public static long IliIlllilIi(int clusterY, int entrySide, int clusterZ, int clusterX, int kind, int heightBand) {
      long var6 = -3750763034362895579L;
      var6 = IiIlliIliiIl(var6, clusterY);
      var6 = IiIlliIliiIl(var6, entrySide);
      var6 = IiIlliIliiIl(var6, clusterZ);
      var6 = IiIlliIliiIl(var6, clusterX);
      var6 = IiIlliIliiIl(var6, kind);
      var6 = IiIlliIliiIl(var6, heightBand);
      return var6;
   }

   public static int liiiIIllIl(int v) {
      return Math.floorDiv(v, 4);
   }

   public static String iliIiiliiiii(int cxA, int bandB, int sideA, int bandA, int kindB, int cxB, int cyA, int cyB, int czB, int sideB, int czA, int kindA) {
      long var14 = 5990095264304865007L;
      StringBuilder var12 = new StringBuilder(Illlllllilll<invokedynamic>());
      var14 ^= (0L ^ var14) & -1L << 32;
      var14 ^= ((long)IlIlllIlilIl(var12, (int)(var14 >>> 32), Illlllllilll<invokedynamic>(), Integer.toString(cxA), Integer.toString(cyA), cxA != cyA) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)IlIlllIlilIl(var12, (int)(var14 >>> 32), Illlllllilll<invokedynamic>(), Integer.toString(bandB), Integer.toString(cyB), bandB != cyB) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)IlIlllIlilIl(var12, (int)(var14 >>> 32), Illlllllilll<invokedynamic>(), Integer.toString(sideA), Integer.toString(czB), sideA != czB) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)IlIlllIlilIl(var12, (int)(var14 >>> 32), Illlllllilll<invokedynamic>(), Integer.toString(bandA), Integer.toString(sideB), bandA != sideB) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)IlIlllIlilIl(var12, (int)(var14 >>> 32), Illlllllilll<invokedynamic>(), Integer.toString(kindB), Integer.toString(czA), kindB != czA) << 32 ^ var14) & -1L << 32;
      IlIlllIlilIl(var12, (int)(var14 >>> 32), Illlllllilll<invokedynamic>(), IIIllIIliIIl(cxB), IIIllIIliIIl(kindA), cxB != kindA);
      return var12.append('}').toString();
   }
}
