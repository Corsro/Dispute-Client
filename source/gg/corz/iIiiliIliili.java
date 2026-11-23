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

public final class iIiiliIliili {
   public static final int lIIIlllIliIIIlllIl = 10;
   public static final float ilIIlllIlIiIIlllIl = 12.0F;
   public static final double liIIlllIliiIIlllIl = 0.6;
   public static final int IIlIlllIllIlIlllIl = 6;
   private static final iiiiiIIlIIIIIlIl iIlIlllIlIllIlllIl = new iiiiiIIlIIIIIlIl(true, IIIllIIliIIl<invokedynamic>());
   public static final int IlIIlllIlllIIlllIl = 3;

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ 8179) + var5) - '몋') ^ var5) + '落') - 15115) + var5) ^ var5) - var5))) ^ '\ue741') - var5))) ^ var5) - var5) - var5) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ 8179) + var5) - '몋') ^ var5) + '落') - 15115) + var5) ^ var5) - var5))) ^ '\ue741') - var5))) ^ var5) - var5) - var5) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(IlIIIlilllIIIlil style, lliiilIiiliiilIi fightRange, liiilIiliiiilIil target, boolean self, double defensiveOrEscape, double keepRange) {
      if (fightRange != null && IilliliilIIi(target) && !target.lliIliliIl()) {
         if (!(target.Illlllllilll() <= keepRange)) {
            return false;
         } else if (fightRange.IIillIiliIil() >= 1 && !self) {
            return style != IlIIIlilllIIIlil.liiIiilIil || target.Illlllllilll() <= defensiveOrEscape;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private static boolean lIiiIiIlilli(iIliIiIiIlliIiIi s) {
      return s == iIliIiIiIlliIiIi.iilIiIiIIi || s == iIliIiIiIlliIiIi.IIiIiIiIIi || s == iIliIiIiIlliIiIi.iIiIiIiIIi;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') >>> 7 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') << 9) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') >>> 7 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') << 9) >>> 3) - 1366) << 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') >>> 7 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') << 9) << 13 | (char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') >>> 7 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) >>> 8 | (char)((char)((char)(var4[var5] - var5) + '\uf823') - var5) << 8))) - '쨦') << 9) >>> 3) - 1366) >>> 14) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) ^ '벱') ^ 19763))) + var5) + 23730) + 19585))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - var5) ^ '벱') ^ 19763))) + var5) + 23730) + 19585))) << 14))) - '裂') ^ 26261) - var5) - var5))) + 29266) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3910558834500389991L ^ Long.rotateLeft(4128382690083262821L, 1) ^ -3466521379256033308L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4256775026077872626L ^ Long.rotateLeft(6988775460286287976L, 34) ^ -4893009811416862502L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5816427251097060110L ^ Long.rotateLeft(7686145041327391049L, 51) ^ 1025175284415778198L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4234800739063130966L ^ Long.rotateLeft(-3393590775713222522L, 10) ^ -8183226491169441397L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7449960094773043769L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1499446022373987632L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5408611297828651247L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1117469281760189300L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5321157620614059898L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6395642083722707906L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) >>> 2 | (char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) << 14) - var5) >>> 6 | (char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) >>> 2 | (char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) << 14) - var5) << 10) + var5) + var5) + var5) + '遁'))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) >>> 2 | (char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) << 14) - var5) >>> 6 | (char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) >>> 2 | (char)((char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) >>> 10 | (char)(~((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5))))) << 6) << 14) - var5) << 10) + var5) + var5) + var5) + '遁'))) << 11) ^ '\uf7d7') ^ 25637));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean IilliliilIIi(liiilIiliiiilIil target) {
      if (target == null) {
         return false;
      } else if (target.lIiiIiIlilli() == null) {
         return true;
      } else {
         return target.lIiiIiIlilli().method_5805() && !target.lIiiIiIlilli().method_31481();
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') << 3) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') << 3) >>> 10) - '鼡') + 2138) - var5))) << 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') << 3) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) << 15 | (char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) << 11 | (char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 5) + var5) - var5)) >>> 1) ^ '\ua4c7') << 3) >>> 10) - '鼡') + 2138) - var5))) >>> 15))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iiiIiiIlIIIliiIl IliIlllilIi(iIliiiiIlliiii in) {
      long var2 = -6221768196890086421L;
      if (in != null && in.IliIlllilIi() != null && in.IliIlllilIi() != iIliIiIiIlliIiIi.lllIiIiIIi) {
         var2 ^= ((long)iliIiiliiiii(in.IIillIiliIil()) << 32 ^ var2) & -1L << 32;
         if (in.liiiIIllIl()) {
            return iiiIiiIlIIIliiIl.iliiIlIlll;
         } else if (in.iIlIlllllill() > 10 || in.IliIlllilIi() == iIliIiIiIlliIiIi.IliIiIiIIi && in.IilliliilIIi() <= 3) {
            if ((double)in.lIiiIiIlilli() > ililiilIiiliil.llIiIllliilIiIllli[(int)(var2 >>> 32)] && (!(in.lIiiIiIlilli() <= 12.0F) || in.iliIiiliiiii())) {
               if (in.IiIlliIliiIl()) {
                  return iiiIiiIlIIIliiIl.iiiiIlIlll;
               } else if (in.IIlllIlliIll()) {
                  return iiiIiiIlIIIliiIl.IIIIllIlll;
               } else if (!in.Illlllllilll()) {
                  return iiiIiiIlIIIliiIl.lIIIllIlll;
               } else if (in.IIIllIIliIIl() > 0 && (in.IlIlllIlilIl() > 0 || lIiiIiIlilli(in.IliIlllilIi()))) {
                  return in.Iilllilliill() >= 600 ? iiiIiiIlIIIliiIl.IlIIllIlll : iiiIiiIlIIIliiIl.lliiIlIlll;
               } else {
                  return iiiIiiIlIIIliiIl.iIIIllIlll;
               }
            } else {
               return iiiIiiIlIIIliiIl.liiiIlIlll;
            }
         } else {
            return iiiIiiIlIIIliiIl.IiiiIlIlll;
         }
      } else {
         return iiiIiiIlIIIliiIl.lliiIlIlll;
      }
   }

   private iIiiliIliili() {
   }

   private static int iliIiiliiiii(IlIIIlilllIIIlil style) {
      return (style == null ? IlIIIlilllIIIlil.iliIiilIil : style).ordinal();
   }

   public static iiiiiIIlIIIIIlIl liiiIIllIl(IlIIIlilllIIIlil target, lliiilIiiliiilIi lift, IlIillllIill friendNearTarget, liiilIiliiiilIil threat, boolean self, boolean launchVariant, boolean style, IiIllIilliIllIil inLiquidOrWeb) {
      long var10 = -6694806928585384900L;
      if (lift == null) {
         return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
      } else {
         var10 ^= ((long)iliIiiliiiii(target) << 32 ^ var10) & -1L << 32;
         IlIillllIill var9 = friendNearTarget == null ? IlIillllIill.IIIIilIilIIIilIi : friendNearTarget;
         if (!lift.Iilllilliill()) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (!((double)lift.IliIlllilIi() >= ililiilIiiliil.liilIllliiiilIllli[(int)(var10 >>> 32)])) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (lift.IIillIiliIil() < ililiilIiiliil.IIIiIlllilIIiIllli[(int)(var10 >>> 32)]) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (lift.Ililllililil() < 8) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (!((double)var9.IliIlllilIi() <= 0.6 * (double)lift.IliIlllilIi())) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (lift.iiIIlIIlIl()) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (lift.Iiiiliiiiiii() <= 6) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (launchVariant) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (!IilliliilIIi(threat)) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (threat.lliIliliIl()) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else if (self) {
            return new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         } else {
            return !style || inLiquidOrWeb != null && inLiquidOrWeb != IiIllIilliIllIil.iiIilIlIil ? iIlIlllIlIllIlllIl : new iiiiiIIlIIIIIlIl(false, IIIllIIliIIl<invokedynamic>());
         }
      }
   }
}
