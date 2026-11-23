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

public final class lIiiIIlliIiiIIll {
   public static final double liilIlllll = (double)1.0F;
   public static final double lIIiIlllll = (double)6.0F;
   public static final double iiilIlllll = (double)3.0F;
   public static final double IlIiIlllll = (double)8.0F;
   public static final double iIIiIlllll = (double)4.0F;
   public static final double IIIiIlllll = (double)2.0F;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '魨') ^ 30244) << 4 | (char)((char)(var4[var5] - '魨') ^ 30244) >>> 12) + var5))) ^ 31549) - var5) - 31332) - var5) - 17888));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8242452745485203460L ^ Long.rotateLeft(-479770445585748530L, 20) ^ -5312188711458014429L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1356684938196596809L ^ Long.rotateLeft(4867194611021852276L, 33) ^ 7783215393695408117L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7356564920915583291L ^ Long.rotateLeft(-7894224139237303074L, 30) ^ 2517595502991739362L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7271670300764736679L ^ Long.rotateLeft(-368368997802544329L, 35) ^ -3012188176542455162L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2472890754139012044L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7358337127246058578L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5483262142404506092L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2513992894919470275L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3346094003476901566L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4902646787094682286L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
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

   public static boolean IliIlllilIi(int recentreUnlocks, int hereConfirms, lIliiIIliIliiIIl bestElsewhere) {
      long var4 = -100353316132115379L;
      var4 ^= ((long)(Math.max(0, recentreUnlocks) + Math.max(0, hereConfirms)) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) <= 0) {
         return false;
      } else if (bestElsewhere == null) {
         return true;
      } else {
         return (new lIliiIIliIliiIIl(0L, (int)(var4 >>> 32), (double)0.0F, 0, 0, 0, 0, 0)).liiiIIllIl() >= bestElsewhere.liiiIIllIl();
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) + var5))) - 10646) + var5) ^ 10679) ^ var5) + 30372) + '\ue046') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) + var5))) - 10646) + var5) ^ 10679) ^ var5) + 30372) + '\ue046') << 7))) - 32299))) ^ var5) << 4 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) + var5))) - 10646) + var5) ^ 10679) ^ var5) + 30372) + '\ue046') >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) + var5))) - 10646) + var5) ^ 10679) ^ var5) + 30372) + '\ue046') << 7))) - 32299))) ^ var5) >>> 12))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lIliiIIliIliiIIl iIlIlllllill(lIliiIIliIliiIIl a, lIliiIIliIliiIIl b) {
      if (a == null) {
         return b;
      } else if (b == null) {
         return a;
      } else {
         double var2 = a.liiiIIllIl();
         double var4 = b.liiiIIllIl();
         if (Math.abs(var2 - var4) > 1.0E-9) {
            return var2 > var4 ? a : b;
         } else if (a.IlIlllIlilIl() != b.IlIlllIlilIl()) {
            return a.IlIlllIlilIl() < b.IlIlllIlilIl() ? a : b;
         } else {
            return a.iliIiiliiiii() <= b.iliIiiliiiii() ? a : b;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) << 14 | (char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) >>> 2))))) - 15445) >>> 3 | (char)((char)(-((char)(~((char)((char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) << 14 | (char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) >>> 2))))) - 15445) << 13) + var5) << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) << 14 | (char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) >>> 2))))) - 15445) >>> 3 | (char)((char)(-((char)(~((char)((char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) << 14 | (char)(-((char)(-((char)((char)(var4[var5] - var5) ^ 5364))))) >>> 2))))) - 15445) << 13) + var5) >>> 12))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl(int nextDelta, int previousDelta) {
      return nextDelta != 0 && previousDelta != 0 && Integer.signum(nextDelta) != Integer.signum(previousDelta);
   }

   public static String IilliliilIIi(lIliiIIliIliiIIl runnerUp, lIliiIIliIliiIIl stayed, boolean chosen) {
      return lIiiIiIlilli<invokedynamic>() + (runnerUp == null ? lIiiIiIlilli<invokedynamic>() : runnerUp.iIlIlllllill()) + lIiiIiIlilli<invokedynamic>() + (stayed == null ? lIiiIiIlilli<invokedynamic>() : stayed.iIlIlllllill()) + lIiiIiIlilli<invokedynamic>() + (chosen ? lIiiIiIlilli<invokedynamic>() : lIiiIiIlilli<invokedynamic>());
   }

   private lIiiIIlliIiiIIll() {
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 27220) + var5) + 24504) << 7 | (char)((char)((char)(var4[var5] - 27220) + var5) + 24504) >>> 9))) - var5) >>> 1 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - 27220) + var5) + 24504) << 7 | (char)((char)((char)(var4[var5] - 27220) + var5) + 24504) >>> 9))) - var5) << 15) - var5) + '\uf486') + var5))) << 1 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 27220) + var5) + 24504) << 7 | (char)((char)((char)(var4[var5] - 27220) + var5) + 24504) >>> 9))) - var5) >>> 1 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - 27220) + var5) + 24504) << 7 | (char)((char)((char)(var4[var5] - 27220) + var5) + 24504) >>> 9))) - var5) << 15) - var5) + '\uf486') + var5))) >>> 15))))) + var5) + 9550));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - '뼰') << 12 | (char)((char)(~((char)(-var4[var5]))) - '뼰') >>> 4) - var5) << 6 | (char)((char)((char)((char)(~((char)(-var4[var5]))) - '뼰') << 12 | (char)((char)(~((char)(-var4[var5]))) - '뼰') >>> 4) - var5) >>> 10) + var5) - var5) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - '뼰') << 12 | (char)((char)(~((char)(-var4[var5]))) - '뼰') >>> 4) - var5) << 6 | (char)((char)((char)((char)(~((char)(-var4[var5]))) - '뼰') << 12 | (char)((char)(~((char)(-var4[var5]))) - '뼰') >>> 4) - var5) >>> 10) + var5) - var5) + var5) << 9))) + var5) ^ var5) ^ 11613));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
