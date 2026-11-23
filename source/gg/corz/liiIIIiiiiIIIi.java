package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liiIIIiiiiIIIi {
   public static final int IIiIiIililIiIiIili = 12;
   public static final int IiiIiIililiiIiIili = 3;
   public static final double lliIiIiliiliIiIili = (double)1.5F;
   public static final double iIiIiIiliIliIiIili = 0.05;

   public static double iIlIlllllill(int tempBlocks, int routeLen, int expectedBlocks) {
      return (double)tempBlocks / ((double)1.0F + (double)routeLen + (double)expectedBlocks * (double)6.0F);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 18217) + var5) ^ 3389) ^ '\uf706') + 20243) - var5) + var5) ^ 14765) ^ '葘') ^ var5) + '\ud94b') - '\ud7ff'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIIllIIliIIl(int expectedBlocks, int routeLen, int tempBlocks, boolean localWorkExists, boolean bottleneckOrCompletion) {
      List var5 = bottleneckOrCompletion ? List.of(new IiiIlIiliiIlIi(IlIlllIlilIl<invokedynamic>(), 1, (double)1.0F, 0L)) : List.of();
      return !IilliliilIIi(expectedBlocks, routeLen, tempBlocks, localWorkExists, 0, var5).liiiIIllIl();
   }

   public static IliiIlIllliiIlIl lIiiIiIlilli(int alternatives, int tempBlocks, int dependencyUnlocks, boolean bottleneckOrCompletion, int expectedBlocks, List<IiiIlIiliiIlIi> target, long proof, IlliIIlillliIIli routeLen) {
      return iliIiiliiiii(alternatives, tempBlocks, dependencyUnlocks, bottleneckOrCompletion, expectedBlocks, target, proof, routeLen, true);
   }

   private liiIIIiiiiIIIi() {
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8560636208814368586L ^ Long.rotateLeft(-4934840764870803521L, 5) ^ 7686648993948922785L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 763320109002599901L ^ Long.rotateLeft(7717847330818104629L, 25) ^ 8281431249369457569L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4096951826344133227L ^ Long.rotateLeft(1339586298847044936L, 33) ^ 9084582697231581332L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5019651863895549360L ^ Long.rotateLeft(-3206820954478575206L, 2) ^ -2090403347260935426L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4196246211220864894L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7305466068017185111L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7639099839235716315L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6779159348486584092L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6322711765088262748L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6288720562191696231L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) << 15) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) << 15) << 2))) + 28173) ^ 11019) + var5) << 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) << 15) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) >>> 1 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~var4[var5]) + 18690))) << 7 | (char)(~((char)((char)(~var4[var5]) + 18690))) >>> 9))) + var5) ^ 1739) - var5) - var5)))) << 15) << 2))) + 28173) ^ 11019) + var5) >>> 11) ^ '뒭'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IliiIlIllliiIlIl IilliliilIIi(int dependencyUnlocks, int tempBlocks, int expectedBlocks, boolean routeLen, int bottleneckOrCompletion, List<IiiIlIiliiIlIi> alternatives) {
      return lIiiIiIlilli(dependencyUnlocks, tempBlocks, expectedBlocks, routeLen, bottleneckOrCompletion, alternatives, 0L, (IlliIIlillliIIli)null);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) << 2 | (char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) >>> 14) + '푡') << 13 | (char)((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) << 2 | (char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) >>> 14) + '푡') >>> 3) - 22990))) - var5))))) << 5 | (char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) << 2 | (char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) >>> 14) + '푡') << 13 | (char)((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) << 2 | (char)(~((char)(~((char)((char)(-((char)(var4[var5] - '웶'))) ^ '첓'))))) >>> 14) + '푡') >>> 3) - 22990))) - var5))))) >>> 11))) + var5))));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - '茍') - var5) << 8 | (char)((char)(var4[var5] - '茍') - var5) >>> 8) ^ var5))) + '\uffd8') - 12552) ^ 11092) + 30912) << 3 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - '茍') - var5) << 8 | (char)((char)(var4[var5] - '茍') - var5) >>> 8) ^ var5))) + '\uffd8') - 12552) ^ 11092) + 30912) >>> 13) ^ var5) - 16288) - var5) + '\uec1d') + var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IliiIlIllliiIlIl iliIiiliiiii(int alternativesProven, int alternatives, int bottleneckOrCompletion, boolean proof, int routeLen, List<IiiIlIiliiIlIi> target, long dependencyUnlocks, IlliIIlillliIIli expectedBlocks, boolean tempBlocks) {
      double var10 = iIlIlllllill(alternativesProven, alternatives, bottleneckOrCompletion);
      IiiIlIiliiIlIi var12 = null;
      if (target != null) {
         for(IiiIlIiliiIlIi var14 : target) {
            if (var14.lIiiIiIlilli() > 0 && (var12 == null || var14.liiiIIllIl() > var12.liiiIIllIl())) {
               var12 = var14;
            }
         }
      }

      if (expectedBlocks != null && expectedBlocks.IliIlllilIi(dependencyUnlocks, var12)) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.IlllIIliIl, var10, var12);
      } else if (var12 != null && var12.liiiIIllIl() > var10 * (double)1.5F) {
         return new IliiIlIllliiIlIl(false, IIIillIllIIillIl.IillIIliIl, var10, var12);
      } else if (!tempBlocks && var12 == null && alternativesProven < IliIlllilIi(alternatives)) {
         return new IliiIlIllliiIlIl(false, IIIillIllIIillIl.lillIIliIl, var10, (IiiIlIiliiIlIi)null);
      } else if (alternatives <= 12) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.iiIlIIliIl, var10, var12);
      } else if (var10 >= 0.05) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.IIllIIliIl, var10, var12);
      } else if (proof) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.lIllIIliIl, var10, var12);
      } else if (routeLen >= 3) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.iIllIIliIl, var10, var12);
      } else if (var12 == null) {
         return new IliiIlIllliiIlIl(true, IIIillIllIIillIl.llllIIliIl, var10, (IiiIlIiliiIlIi)null);
      } else {
         return var12.liiiIIllIl() < var10 * (double)1.5F ? new IliiIlIllliiIlIl(true, IIIillIllIIillIl.illlIIliIl, var10, var12) : new IliiIlIllliiIlIl(false, IIIillIllIIillIl.IillIIliIl, var10, var12);
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) << 3 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) >>> 13))))) << 6 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) << 3 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) >>> 13))))) >>> 10) >>> 14 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) << 3 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) >>> 13))))) << 6 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) << 3 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) >>> 12 | (char)(~((char)((char)((char)(var4[var5] - var5) ^ 1102) << 4 | (char)((char)(var4[var5] - var5) ^ 1102) >>> 12))) << 4) + var5) + '됉'))) - 8806) + var5) - 28402) + 3214) >>> 13))))) >>> 10) << 2) ^ 10793));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl(int dz, int dx, int dy) {
      return Math.max(Math.abs(dz), Math.abs(dy)) <= 8 && Math.abs(dx) <= 2;
   }

   public static int IliIlllilIi(int routeLen) {
      if (routeLen <= 5) {
         return 1;
      } else if (routeLen <= 12) {
         return 3;
      } else {
         return routeLen <= 24 ? 6 : 10;
      }
   }
}
