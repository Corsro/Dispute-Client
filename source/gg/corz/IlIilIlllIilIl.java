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

public final class IlIilIlllIilIl {
   public static final int ilIiIiIllIiIiIiIll = 6;
   public static final int iiilIiIllIIIiIiIll = 30;
   public static final int liIiIiIlliiIiIiIll = 8;
   public static final double IlIiIiIllllIiIiIll = 1.15;
   public static final int lIIiIiIlliIIiIiIll = 3;
   public static final int IiilIiIllliilIiIll = 6;

   public static boolean liiiIIllIl(liilllIliiilllIl k) {
      return k == liilllIliiilllIl.liiIIIliIl || k == liilllIliiilllIl.iiiIIIliIl || k == liilllIliiilllIl.IIIlIIliIl || k == liilllIliiilllIl.lIIlIIliIl || k == liilllIliiilllIl.iIIlIIliIl;
   }

   public static lllIliilillIliil iliIiiliiiii(liilllIliiilllIl directionalMembers, long confirmTicks, int slippery, int entryTravelTicks, double expectedPlacements, boolean clusterKey, int sneakPulses, int kind) {
      long var12 = -6636622870212924697L;
      var12 ^= ((long)Math.max(1, slippery) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(2 + (int)Math.round(((double)6.0F * (double)Math.max(0, sneakPulses) + (double)8.0F * (double)Math.max(0, kind)) / (double)((int)(var12 >>> 32)))) ^ var12) & -1L >>> 32;
      return new lllIliilillIliil(directionalMembers, confirmTicks, entryTravelTicks, slippery, (double)slippery, (double)1.0F, (int)var12, 0, 0, 0, clusterKey ? 4 : 0, (int)Math.round(expectedPlacements), clusterKey ? 0.1 : 0.05, 10, directionalMembers.name().toLowerCase(Locale.ROOT) + IlIlllIlilIl<invokedynamic>());
   }

   public static lllIliilillIliil iIlIlllllill(long failureRisk, int clusterKey, int confirmTicks, double expectedPlacements, double accessTicks, double placementsPerStand) {
      return new lllIliilillIliil(liilllIliiilllIl.IiIlIIliIl, failureRisk, Math.max(0, confirmTicks), clusterKey, Math.max((double)1.0F, expectedPlacements), (double)2.0F, 3, 0, 4, 0, 0, (int)Math.round(accessTicks), Math.max((double)0.0F, placementsPerStand), 0, IlIlllIlilIl<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 9 | (char)(-var4[var5]) << 7) - var5) - var5))))) ^ 11532))) + var5) + var5) ^ var5) - '艤') + '勞'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2682942649734790908L ^ Long.rotateLeft(-3692237797712174948L, 48) ^ 2000945455177807372L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4682398196897355712L ^ Long.rotateLeft(-4864387343408387406L, 46) ^ -5482893768542924606L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 841404930998992174L ^ Long.rotateLeft(-1958814334177664013L, 22) ^ -1505148248263994022L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8100857712929677918L ^ Long.rotateLeft(1689777185458751049L, 29) ^ -6378581825227642400L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4102876204026680420L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5116280007441496101L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9134909280122100040L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8911070515098088766L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6024080844609740609L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2400515310233844568L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
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

   private IlIilIlllIilIl() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)(var4[var5] ^ 3110))))) + 1868) - var5) << 9 | (char)((char)((char)(~((char)(-((char)(var4[var5] ^ 3110))))) + 1868) - var5) >>> 7) ^ 10310))) + '鍙') + var5) + '鉒'))) - var5))) + var5) - 19644));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - 19877) - var5) ^ var5) >>> 5 | (char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - 19877) - var5) ^ var5) << 11))))))) + var5) + var5) ^ var5) ^ var5) - 10363) + '진') - '闉'))) + 7655) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue72b'))) + var5) + 18418) + var5) - 13228) << 4 | (char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue72b'))) + var5) + 18418) + var5) - 13228) >>> 12) - var5) ^ var5) ^ 9940) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue72b'))) + var5) + 18418) + var5) - 13228) << 4 | (char)((char)((char)((char)((char)(~((char)(var4[var5] - '\ue72b'))) + var5) + 18418) + var5) - 13228) >>> 12) - var5) ^ var5) ^ 9940) >>> 10) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lllIliilillIliil lIiiIiIlilli(liilllIliiilllIl confirmTicks, long expectedPlacements, int clusterKey, int slippery, double entryTravelTicks, boolean kind) {
      return iliIiiliiiii(confirmTicks, expectedPlacements, clusterKey, slippery, entryTravelTicks, kind, 0, 0);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '겦') + 8830))) - '빤') + 19868) - '틫') - var5) + 25793))) - var5))))) ^ 5741));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static lllIliilillIliil IIIllIIliIIl(long perPlacementTicks, int expectedPlacements, int entryTravelTicks, double clusterKey) {
      return new lllIliilillIliil(liilllIliiilllIl.llIlIIliIl, perPlacementTicks, entryTravelTicks, expectedPlacements, (double)expectedPlacements, (double)expectedPlacements, 4, 0, (int)Math.round(clusterKey), 0, 0, 3, 0.05, 0, IlIlllIlilIl<invokedynamic>());
   }

   public static iiiIIiIlIIIlIiIl IliIlllilIi(List<lllIliilillIliil> candidates) {
      ArrayList var1 = new ArrayList();

      for(lllIliilillIliil var3 : candidates) {
         if (var3 != null && var3.iliIiiliiiii() > 0) {
            var1.add(var3);
         }
      }

      if (var1.isEmpty()) {
         return new iiiIIiIlIIIlIiIl((lllIliilillIliil)null, var1, (double)0.0F, IlIlllIlilIl<invokedynamic>());
      } else {
         lllIliilillIliil var10 = null;
         double var11 = (double)-1.0F;

         for(lllIliilillIliil var6 : var1) {
            if (!liiiIIllIl(var6.iIlIlllllill()) || var6.iliIiiliiiii() >= 3) {
               double var7 = var6.liiiIIllIl();
               if (var7 > var11) {
                  var11 = var7;
                  var10 = var6;
               }
            }
         }

         if (var10 == null) {
            var10 = (lllIliilillIliil)var1.get(0);
            var11 = var10.liiiIIllIl();

            for(lllIliilillIliil var15 : var1) {
               if (var15.liiiIIllIl() > var11) {
                  var10 = var15;
                  var11 = var15.liiiIIllIl();
               }
            }
         }

         lllIliilillIliil var14 = null;

         for(lllIliilillIliil var18 : var1) {
            if (!liiiIIllIl(var18.iIlIlllllill()) && (var14 == null || var18.liiiIIllIl() > var14.liiiIIllIl())) {
               var14 = var18;
            }
         }

         if (liiiIIllIl(var10.iIlIlllllill()) && var14 != null && var10.liiiIIllIl() < var14.liiiIIllIl() * 1.15) {
            return new iiiIIiIlIIIlIiIl(var14, var1, (double)0.0F, IlIlllIlilIl<invokedynamic>() + var14.iIlIlllllill());
         } else {
            double var17 = (double)0.0F;

            for(lllIliilillIliil var9 : var1) {
               if (var9 != var10) {
                  var17 = Math.max(var17, var9.liiiIIllIl());
               }
            }

            double var19 = var17 <= (double)0.0F ? (double)0.0F : Math.max((double)0.0F, (double)var10.iliIiiliiiii() / var17 * (double)20.0F - var10.IliIlllilIi());
            return new iiiIIiIlIIIlIiIl(var10, var1, var19, var10.IlIillIiilIi());
         }
      }
   }

   public static lllIliilillIliil IilliliilIIi(long confirmTicks, int entryTravelTicks, int clusterKey, double expectedPlacements, double avgEdgeAdjustTicks, double rotationTicks, double placementsPerLocalMove, int avgCrouchTicks) {
      return new lllIliilillIliil(liilllIliiilllIl.IlIlIIliIl, confirmTicks, clusterKey, entryTravelTicks, (double)4.0F, Math.max((double)0.5F, avgEdgeAdjustTicks), avgCrouchTicks, 0, (int)Math.round(expectedPlacements), (int)Math.round(rotationTicks), 0, (int)Math.round(placementsPerLocalMove), 0.05, 20, IlIlllIlilIl<invokedynamic>());
   }
}
