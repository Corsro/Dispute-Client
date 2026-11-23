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

public enum IlIiIlIlllIiIlIl {
   IIllIIIiIl,
   liilIIIiIl,
   IlilIIIiIl,
   lIilIIIiIl,
   lIllIIIiIl,
   IlllIIIiIl,
   iIllIIIiIl,
   llllIIIiIl,
   IIilIIIiIl,
   iillIIIiIl,
   IillIIIiIl,
   illlIIIiIl,
   ililIIIiIl,
   iIilIIIiIl,
   IiilIIIiIl,
   lillIIIiIl,
   llilIIIiIl;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-var4[var5]) - 'ﶹ'))))) + '깳') >>> 8 | (char)((char)(-((char)(~((char)((char)(-var4[var5]) - 'ﶹ'))))) + '깳') << 8) - 23304) - '줮'))) ^ var5) ^ var5)) << 6 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-var4[var5]) - 'ﶹ'))))) + '깳') >>> 8 | (char)((char)(-((char)(~((char)((char)(-var4[var5]) - 'ﶹ'))))) + '깳') << 8) - 23304) - '줮'))) ^ var5) ^ var5)) >>> 10) ^ var5) ^ 29824) - var5) ^ var5) - 6090) ^ '잎'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static IlIiIlIlllIiIlIl[] liiiIIllIl() {
      return new IlIiIlIlllIiIlIl[]{IIllIIIiIl, lIllIIIiIl, iIllIIIiIl, IlllIIIiIl, llllIIIiIl, illlIIIiIl, IillIIIiIl, lillIIIiIl, iillIIIiIl, IIilIIIiIl, lIilIIIiIl, iIilIIIiIl, IlilIIIiIl, llilIIIiIl, ililIIIiIl, IiilIIIiIl, liilIIIiIl};
   }

   public static IlIiIlIlllIiIlIl IliIlllilIi(String name) {
      long var5 = -2884909735137570680L;
      if (name != null) {
         IlIiIlIlllIiIlIl[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            IlIiIlIlllIiIlIl var4 = var1[(int)var8];
            if (var4.name().equalsIgnoreCase(name)) {
               return var4;
            }
         }
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') << 2 | (char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') >>> 14) >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') << 2 | (char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') >>> 14) << 12) ^ var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') << 2 | (char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') >>> 14) >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') << 2 | (char)((char)(~((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 4 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 12))))) ^ '쵱') >>> 14) << 12) ^ var5) - var5) << 7) ^ var5) ^ var5) ^ '꠵') ^ '\uebfe'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) << 2))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) << 2))) + var5) << 15) - 10638) << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) << 2))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) >>> 14 | (char)((char)((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14) + var5) - var5) << 2))) + var5) << 15) - 10638) >>> 3) + var5) + 10356) ^ 24381))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4401235722433249354L ^ Long.rotateLeft(7894297571589115890L, 29) ^ -2961889977949747267L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8560117426540201498L ^ Long.rotateLeft(-8530657239454521227L, 32) ^ -6715927740487158556L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6683659028353195164L ^ Long.rotateLeft(5523491514537783653L, 28) ^ -6086420721731019067L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4399068188120122383L ^ Long.rotateLeft(-2525705488318266226L, 8) ^ 6010108733158263686L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3454446666045230554L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5823434774979797311L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6073631715109835794L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6330414279020220084L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7667405838969164880L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 107270122188241530L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) >>> 3 | (char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) << 13) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) >>> 3 | (char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) << 13) >>> 8) ^ '뢗') + var5) << 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) >>> 3 | (char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) << 13) << 8 | (char)((char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) >>> 3 | (char)((char)((char)(-((char)(var4[var5] - var5))) ^ 8968) << 9 | (char)((char)(-((char)(var4[var5] - var5))) ^ 8968) >>> 7) << 13) >>> 8) ^ '뢗') + var5) >>> 13) + var5) ^ var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') << 1 | (char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') >>> 15))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') << 1 | (char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') >>> 15))))) >>> 12))) >>> 1 | (char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') << 1 | (char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') >>> 15))))) << 4 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') << 1 | (char)((char)((char)((char)((char)((char)var4[var5] + '\ueb9e') + var5) + '믲') - var5) ^ '햌') >>> 15))))) >>> 12))) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
