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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iilIIIllIIiIIIll {
   static final double illIiiIlll = (double)5000.0F;
   static final long iiIIiiIlll = 45000L;
   static final int lIlIiiIlll = 8;
   static final double lllIiiIlll = (double)1000.0F;
   static final int IIlIiiIlll = 4;
   static final long iIlIiiIlll = 30000L;
   static final int IllIiiIlll = 2;

   private static Map<String, Set<Long>> IIlilIliiIli(liIliliiIlil state) {
      HashMap var1 = new HashMap();

      for(IiiiIiIlliiiIiIl var3 : state.Iilllilliill()) {
         if (var3.IlIIiliIll != null && !var3.IilliliilIIi()) {
            ((Set)var1.computeIfAbsent(var3.IlIIiliIll, (k) -> new HashSet())).add(iIlIlllllill(var3.IIiilliIll, var3.lIiilliIll, var3.iIiilliIll));
         }
      }

      return var1;
   }

   public static int iliIiiliiiii(liIliliiIlil state) {
      return IIIllIIliIIl(state, System.currentTimeMillis());
   }

   private static void Illillliilli(IiiiIiIlliiiIiIl nowMs, IIliIiIilIliIiIi owner, long job) {
      long var6 = -5713348651681579259L;
      var6 ^= ((long)(!owner.lIiilIiIIi.equals(nowMs.IlIIiliIll) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)(!owner.lIiilIiIIi.equals(nowMs.lIlIiliIll) && (int)(var6 >>> 32) != 0 ? 1 : 0) ^ var6) & -1L >>> 32;
      nowMs.IlIIiliIll = owner.lIiilIiIIi;
      nowMs.llIIiliIll = IliilIillliilIil.lIilIllIil;
      nowMs.iiIIiliIll = job;
      nowMs.liIIiliIll = job;
      if ((int)(var6 >>> 32) != 0) {
         ++nowMs.IIlIiliIll;
      }

      if ((int)var6 != 0) {
         nowMs.IiIIiliIll = 0;
      }

   }

   // $FF: synthetic method
   private static CallSite lIilliIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) << 8 | (char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) >>> 8) ^ '겖') - var5) << 2 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) << 8 | (char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) >>> 8) ^ '겖') - var5) >>> 14) << 14 | (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) << 8 | (char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) >>> 8) ^ '겖') - var5) << 2 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) << 8 | (char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) << 9 | (char)(~((char)(var4[var5] - var5))) >>> 7))) + 16125) >>> 8) ^ '겖') - var5) >>> 14) >>> 2) + var5) + '驳')))) ^ 4645));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static double Iiiiliiiiiii(IIliIiIilIliIiIi p, IiiiIiIlliiiIiIl sharedMaterials, boolean j) {
      long var8 = -3709356227511723525L;
      if (j && p.iIlIiIiIIi != null && !p.iIlIiIiIIi.IilliliilIIi() && !sharedMaterials.lIIIiliIll.IilliliilIIi()) {
         String var3 = null;
         var8 ^= (0L ^ var8) & -1L << 32;

         for(Map.Entry var6 : sharedMaterials.lIIIiliIll.lIiiIiIlilli().entrySet()) {
            if ((Integer)var6.getValue() > (int)(var8 >>> 32)) {
               var8 ^= ((long)(Integer)var6.getValue() << 32 ^ var8) & -1L << 32;
               var3 = (String)var6.getKey();
            }
         }

         if (var3 != null && (int)(var8 >>> 32) > 0) {
            var8 ^= ((long)p.iIlIiIiIIi.liiiIIllIl(var3) ^ var8) & -1L >>> 32;
            if ((int)var8 >= (int)(var8 >>> 32)) {
               return (double)0.0F;
            } else {
               double var10 = (double)((int)(var8 >>> 32) - (int)var8) / (double)((int)(var8 >>> 32));
               return (double)200.0F * var10;
            }
         } else {
            return (double)0.0F;
         }
      } else {
         return (double)0.0F;
      }
   }

   private static int Iilllilliill(liIliliiIlil state, List<IIliIiIilIliIiIi> nowMs, long sharedMaterials, boolean online) {
      long var28 = -1013896166740433357L;
      long var30 = 3971936763686231240L;
      Map var5 = IIlllIlliIll(state);
      if (var5.isEmpty()) {
         return 0;
      } else {
         HashMap var6 = new HashMap();
         HashMap var7 = new HashMap();

         for(IIliIiIilIliIiIi var9 : nowMs) {
            var6.put(var9.lIiilIiIIi, new HashSet());
            var7.put(var9.lIiilIiIIi, 0);
         }

         for(IiiiIiIlliiiIiIl var34 : state.Iilllilliill()) {
            if (var34.IilliliilIIi() && var34.IlIIiliIll != null && var6.containsKey(var34.IlIIiliIll)) {
               ((Set)var6.get(var34.IlIIiliIll)).add(iIlIlllllill(var34.IIiilliIll, 0, var34.iIiilliIll));
            }
         }

         ArrayList var33 = new ArrayList();
         var28 ^= (0L ^ var28) & -1L << 32;

         for(ilIlilIiIiIlilIi var11 : var5.values()) {
            HashMap var12 = new HashMap();

            for(IiiiIiIlliiiIiIl var14 : var11.liillllIIi) {
               if (var14.IlIIiliIll != null && var6.containsKey(var14.IlIIiliIll)) {
                  var12.merge(var14.IlIIiliIll, var14.IIIIiliIll, Integer::sum);
               }
            }

            String var38 = null;
            var28 ^= (0L ^ var28) & -1L >>> 32;

            for(Map.Entry var16 : var12.entrySet()) {
               if ((Integer)var16.getValue() > (int)var28) {
                  var28 ^= ((long)(Integer)var16.getValue() ^ var28) & -1L >>> 32;
                  var38 = (String)var16.getKey();
               }
            }

            if (var38 == null) {
               var33.add(var11);
            } else {
               IIliIiIilIliIiIi var41 = null;

               for(IIliIiIilIliIiIi var17 : nowMs) {
                  if (var17.lIiilIiIIi.equals(var38)) {
                     var41 = var17;
                  }
               }

               for(IiiiIiIlliiiIiIl var45 : var11.liillllIIi) {
                  if (var45.lIiiIiIlilli()) {
                     Illillliilli(var45, var41, sharedMaterials);
                     var28 += 4294967296L;
                  }
               }

               ((Set)var6.get(var38)).add(var11.llillllIIi);
               var7.merge(var38, var11.iiillllIIi, Integer::sum);
            }
         }

         ArrayList var35 = new ArrayList(nowMs);

         while(!var33.isEmpty()) {
            var35.sort(Comparator.comparingInt((p) -> (Integer)var7.get(p.lIiilIiIIi)).thenComparing((p) -> p.lIiilIiIIi));
            IIliIiIilIliIiIi var36 = null;
            ilIlilIiIiIlilIi var37 = null;
            IIliIiIilIliIiIi var39 = null;
            ilIlilIiIiIlilIi var40 = null;
            double var42 = Double.MAX_VALUE;

            for(IIliIiIilIliIiIi var18 : var35) {
               Set var19 = (Set)var6.get(var18.lIiilIiIIi);
               var30 ^= ((long)(!var19.isEmpty() ? 1 : 0) << 32 ^ var30) & -1L << 32;
               ilIlilIiIiIlilIi var21 = null;
               double var22 = Double.MAX_VALUE;

               for(ilIlilIiIiIlilIi var25 : var33) {
                  if ((int)(var30 >>> 32) == 0 || Illlllllilll(var25, var19)) {
                     double var26 = IIillIiliIil(var18, var25, nowMs, var6, online);
                     if (var26 < var22) {
                        var22 = var26;
                        var21 = var25;
                     }
                  }
               }

               if (var21 != null) {
                  if (var22 < (double)1000.0F) {
                     var36 = var18;
                     var37 = var21;
                     break;
                  }

                  if (var22 < var42) {
                     var42 = var22;
                     var39 = var18;
                     var40 = var21;
                  }
               }
            }

            if (var36 == null) {
               var36 = var39;
               var37 = var40;
            }

            if (var36 == null || var37 == null) {
               break;
            }

            for(IiiiIiIlliiiIiIl var48 : var37.liillllIIi) {
               if (var48.lIiiIiIlilli()) {
                  Illillliilli(var48, var36, sharedMaterials);
                  var28 += 4294967296L;
               }
            }

            ((Set)var6.get(var36.lIiilIiIIi)).add(var37.llillllIIi);
            var7.merge(var36.lIiilIiIIi, var37.iiillllIIi, Integer::sum);
            var33.remove(var37);
         }

         return (int)(var28 >>> 32);
      }
   }

   // $FF: synthetic method
   private static CallSite lllllillll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - '믶') - '샬') ^ var5) + 506) + var5) - 19976) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - '믶') - '샬') ^ var5) + 506) + var5) - 19976) << 1))) >>> 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - '믶') - '샬') ^ var5) + 506) + var5) - 19976) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) >>> 13 | (char)(~var4[var5]) << 3) - '믶') - '샬') ^ var5) + 506) + var5) - 19976) << 1))) << 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static double Iliilliiilii(IIliIiIilIliIiIi j, IiiiIiIlliiiIiIl peerLoad, int sharedMaterials, boolean peerOwned, Set<Long> p) {
      double var5 = j.IlIIiIiIIi ? j.llIIiIiIIi : peerLoad.IliIlllilIi();
      double var7 = j.IlIIiIiIIi ? j.IiIIiIiIIi : peerLoad.liiiIIllIl();
      double var9 = j.IlIIiIiIIi ? j.liIIiIiIIi : peerLoad.iIlIlllllill();
      double var11 = peerLoad.IliIlllilIi() - var5;
      double var13 = peerLoad.iIlIlllllill() - var9;
      double var15 = peerLoad.liiiIIllIl() - var7;
      double var17 = Math.sqrt(var11 * var11 + var13 * var13);
      double var19 = Math.abs(var15);
      double var21 = var17 + (double)2.0F * var19;
      var21 += (double)sharedMaterials * (double)40.0F;
      var21 += (double)peerLoad.ilIIiliIll * (double)25.0F;
      var21 += Iiiiliiiiiii(j, peerLoad, peerOwned);
      if (p != null && IiIiliIiiiIi(peerLoad, p)) {
         var21 -= (double)30.0F;
      }

      return var21;
   }

   private static boolean Illlllllilll(ilIlilIiIiIlilIi c, Set<Long> region) {
      return region.contains(iIlIlllllill(c.ilillllIIi + 1, 0, c.IiillllIIi)) || region.contains(iIlIlllllill(c.ilillllIIi - 1, 0, c.IiillllIIi)) || region.contains(iIlIlllllill(c.ilillllIIi, 0, c.IiillllIIi + 1)) || region.contains(iIlIlllllill(c.ilillllIIi, 0, c.IiillllIIi - 1));
   }

   public static String IilliliilIIi(int cx, int cy, int cz) {
      return iIlllIllll<invokedynamic>() + cx + iIlllIllll<invokedynamic>() + cy + iIlllIllll<invokedynamic>() + cz;
   }

   private static boolean IiIiliIiiiIi(IiiiIiIlliiiIiIl cubes, Set<Long> j) {
      if (j.isEmpty()) {
         return false;
      } else {
         return j.contains(iIlIlllllill(cubes.IIiilliIll + 1, cubes.lIiilliIll, cubes.iIiilliIll)) || j.contains(iIlIlllllill(cubes.IIiilliIll - 1, cubes.lIiilliIll, cubes.iIiilliIll)) || j.contains(iIlIlllllill(cubes.IIiilliIll, cubes.lIiilliIll + 1, cubes.iIiilliIll)) || j.contains(iIlIlllllill(cubes.IIiilliIll, cubes.lIiilliIll - 1, cubes.iIiilliIll)) || j.contains(iIlIlllllill(cubes.IIiilliIll, cubes.lIiilliIll, cubes.iIiilliIll + 1)) || j.contains(iIlIlllllill(cubes.IIiilliIll, cubes.lIiilliIll, cubes.iIiilliIll - 1));
      }
   }

   private iilIIIllIIiIIIll() {
   }

   public static int IIIllIIliIIl(liIliliiIlil state, long nowMs) {
      long var8 = -1425696593620077988L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for(IiiiIiIlliiiIiIl var5 : state.Iilllilliill()) {
         if (var5.IlIIiliIll != null && !var5.IilliliilIIi()) {
            IIliIiIilIliIiIi var6 = state.iIlIlllllill(var5.IlIIiliIll);
            var8 ^= ((long)(var6 != null && var6.liiilIiIIi && var6.IliIlllilIi() && var6.IIIIiIiIIi && (var6.iliilIiIIi || var6.IiiilIiIIi != 0L && nowMs - var6.IiiilIiIIi < 30000L) ? 0 : 1) ^ var8) & -1L >>> 32;
            if ((int)var8 != 0) {
               var5.iliIiiliiiii(IliilIillliilIil.IIilIllIil);
               var8 += 4294967296L;
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   private static int Iiilliiliiil(liIliliiIlil nowMs, List<IIliIiIilIliIiIi> online, long state, boolean sharedMaterials) {
      long var19 = -9155611142327871501L;
      HashMap var5 = new HashMap();
      Map var6 = IIlilIliiIli(nowMs);

      for(Map.Entry var8 : var6.entrySet()) {
         var5.put((String)var8.getKey(), ((Set)var8.getValue()).size());
      }

      ArrayList var21 = new ArrayList();

      for(IiiiIiIlliiiIiIl var9 : nowMs.Iilllilliill()) {
         if (var9.lIiiIiIlilli()) {
            var21.add(var9);
         }
      }

      for(var19 ^= (0L ^ var19) & -1L << 32; !var21.isEmpty(); var19 += 4294967296L) {
         IiiiIiIlliiiIiIl var23 = null;
         IIliIiIilIliIiIi var10 = null;
         double var11 = Double.MAX_VALUE;

         for(IiiiIiIlliiiIiIl var14 : var21) {
            for(IIliIiIilIliIiIi var16 : online) {
               double var17 = Iliilliiilii(var16, var14, (Integer)var5.getOrDefault(var16.lIiilIiIIi, 0), sharedMaterials, (Set)var6.get(var16.lIiilIiIIi));
               if (var17 < var11) {
                  var11 = var17;
                  var23 = var14;
                  var10 = var16;
               }
            }
         }

         if (var23 == null) {
            break;
         }

         Illillliilli(var23, var10, state);
         var5.merge(var10.lIiilIiIIi, 1, Integer::sum);
         ((Set)var6.computeIfAbsent(var10.lIiilIiIIi, (k) -> new HashSet())).add(iIlIlllllill(var23.IIiilliIll, var23.lIiilliIll, var23.iIiilliIll));
         var21.remove(var23);
      }

      return (int)(var19 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8334393648393689949L ^ Long.rotateLeft(-3289703508594655928L, 29) ^ -8686315463059632321L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8911951512733662118L ^ Long.rotateLeft(-2014844737561571638L, 59) ^ 675049164292354910L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2751330356240854L ^ Long.rotateLeft(-2812898743734591448L, 43) ^ -6280810692306246949L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2355533565190017138L ^ Long.rotateLeft(-5928451471729781898L, 21) ^ 5539835788194120444L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1233482854674349107L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1697503290546986373L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1008765089013286866L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5217604083371839703L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3494841688644209845L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6649907831760628971L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lllllillll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iillllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iilllIIill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIilliIill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ilillllill<invokedynamic>());
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

   static int IIIilIIiiIIi(liIliliiIlil nowMs, List<IIliIiIilIliIiIi> sharedMaterials, long online, boolean state) {
      long var24 = -526438735540193392L;
      long var26 = -31286953086006278L;
      if (sharedMaterials.size() < 2) {
         return 0;
      } else {
         Map var5 = IIlllIlliIll(nowMs);
         HashSet var6 = new HashSet();

         for(IiiiIiIlliiiIiIl var8 : nowMs.Iilllilliill()) {
            if (var8.IilliliilIIi() && online - var8.liIIiliIll < 45000L) {
               var6.add(iIlIlllllill(var8.IIiilliIll, 0, var8.iIiilliIll));
            }
         }

         HashMap var28 = new HashMap();
         HashMap var29 = new HashMap();
         HashMap var9 = new HashMap();
         HashMap var10 = new HashMap();

         for(IIliIiIilIliIiIi var12 : sharedMaterials) {
            var28.put(var12.lIiilIiIIi, new HashSet());
            var29.put(var12.lIiilIiIIi, new ArrayList());
            var9.put(var12.lIiilIiIIi, new HashSet());
            var10.put(var12.lIiilIiIIi, 0);
         }

         for(ilIlilIiIiIlilIi var32 : var5.values()) {
            String var13 = null;

            for(IiiiIiIlliiiIiIl var15 : var32.liillllIIi) {
               if (var15.IlIIiliIll != null && var28.containsKey(var15.IlIIiliIll)) {
                  var13 = var15.IlIIiliIll;
                  break;
               }
            }

            if (var13 != null) {
               ((Set)var28.get(var13)).add(var32.llillllIIi);
               var10.merge(var13, var32.liillllIIi.size(), Integer::sum);
               if (var32.iIlIlllllill()) {
                  ((List)var29.get(var13)).add(var32);
               } else {
                  ((Set)var9.get(var13)).add(var32.llillllIIi);
               }
            }
         }

         HashSet var31 = new HashSet();

         for(IIliIiIilIliIiIi var34 : sharedMaterials) {
            if ((Integer)var10.get(var34.lIiilIiIIi) == 0) {
               var31.add(var34.lIiilIiIIi);
            }
         }

         ilIlilIiIiIlilIi var17;
         for(var24 ^= (0L ^ var24) & -1L << 32; (int)(var24 >>> 32) < 8; var24 ^= ((long)((int)(var24 >>> 32) + var17.liillllIIi.size()) << 32 ^ var24) & -1L << 32) {
            IIliIiIilIliIiIi var35 = null;
            IIliIiIilIliIiIi var36 = null;

            for(IIliIiIilIliIiIi var16 : sharedMaterials) {
               if (var35 == null || (Integer)var10.get(var16.lIiilIiIIi) < (Integer)var10.get(var35.lIiilIiIIi)) {
                  var35 = var16;
               }

               if (var36 == null || IlIillIiilIi((List)var29.get(var16.lIiilIiIIi)) > IlIillIiilIi((List)var29.get(var36.lIiilIiIIi))) {
                  var36 = var16;
               }
            }

            if (var35 == null || var36 == null || var35.lIiilIiIIi.equals(var36.lIiilIiIIi)) {
               break;
            }

            var24 ^= ((long)(IlIillIiilIi((List)var29.get(var36.lIiilIiIIi)) - IlIillIiilIi((List)var29.get(var35.lIiilIiIIi))) ^ var24) & -1L >>> 32;
            var26 ^= ((long)((Integer)var10.get(var35.lIiilIiIIi) == 0 ? 1 : 0) << 32 ^ var26) & -1L << 32;
            if ((int)(var26 >>> 32) == 0 && (int)var24 < 4 || ((List)var29.get(var36.lIiilIiIIi)).isEmpty()) {
               break;
            }

            var17 = null;
            double var18 = Double.MAX_VALUE;

            for(ilIlilIiIiIlilIi var21 : (List)var29.get(var36.lIiilIiIIi)) {
               if (!Illlllllilll(var21, (Set)var9.get(var36.lIiilIiIIi)) && (var31.contains(var35.lIiilIiIIi) || !var6.contains(var21.llillllIIi))) {
                  double var22 = IIillIiliIil(var35, var21, sharedMaterials, var28, state);
                  if (!(var22 >= (double)1000.0F)) {
                     var22 -= Illlllllilll(var21, (Set)var28.get(var35.lIiilIiIIi)) ? (double)30.0F : (double)0.0F;
                     if (var22 < var18) {
                        var18 = var22;
                        var17 = var21;
                     }
                  }
               }
            }

            if (var17 == null) {
               break;
            }

            for(IiiiIiIlliiiIiIl var39 : var17.liillllIIi) {
               var39.lIlIiliIll = var36.lIiilIiIIi;
               Illillliilli(var39, var35, online);
            }

            ((List)var29.get(var36.lIiilIiIIi)).remove(var17);
            ((List)var29.get(var35.lIiilIiIIi)).add(var17);
            ((Set)var28.get(var36.lIiilIiIIi)).remove(var17.llillllIIi);
            ((Set)var28.get(var35.lIiilIiIIi)).add(var17.llillllIIi);
            var10.merge(var36.lIiilIiIIi, -var17.liillllIIi.size(), Integer::sum);
            var10.merge(var35.lIiilIiIIi, var17.liillllIIi.size(), Integer::sum);
         }

         return (int)(var24 >>> 32);
      }
   }

   private static int Ililllililil(liIliliiIlil online, List<IIliIiIilIliIiIi> nowMs, long state, IiIlllIiliIlllIi axis) {
      long var16 = -7387309809449013742L;
      long var12 = 180883249947171097L;
      long var14 = 4317394432450629640L;
      ArrayList var5 = new ArrayList();

      for(IiiiIiIlliiiIiIl var7 : online.Iilllilliill()) {
         if (var7.lIiiIiIlilli()) {
            var5.add(var7);
         }
      }

      if (var5.isEmpty()) {
         return 0;
      } else {
         var5.sort(axis == IiIlllIiliIlllIi.lliiliIIIi ? Comparator.comparingInt((j) -> j.IIiilliIll).thenComparingInt((j) -> j.iIiilliIll).thenComparing((j) -> j.iililliIll) : Comparator.comparingInt((j) -> j.lIiilliIll).thenComparingInt((j) -> j.IIiilliIll).thenComparing((j) -> j.iililliIll));
         var12 ^= ((long)nowMs.size() << 32 ^ var12) & -1L << 32;
         var12 ^= ((long)var5.size() ^ var12) & -1L >>> 32;
         var14 ^= (0L ^ var14) & -1L << 32;

         for(var14 ^= (0L ^ var14) & -1L >>> 32; (int)var14 < (int)var12; var14 ^= (var14 ^ var14 + (long)1) & -1L >>> 32) {
            var16 ^= ((long)Math.min((int)(var12 >>> 32) - 1, (int)((long)((int)var14) * (long)((int)(var12 >>> 32)) / (long)((int)var12))) << 32 ^ var16) & -1L << 32;
            IIliIiIilIliIiIi var11 = (IIliIiIilIliIiIi)nowMs.get((int)(var16 >>> 32));
            Illillliilli((IiiiIiIlliiiIiIl)var5.get((int)var14), var11, state);
            var14 += 4294967296L;
         }

         return (int)(var14 >>> 32);
      }
   }

   public static long Iilililiiili(IiiiIiIlliiiIiIl job, long nowMs) {
      long var3 = Math.max(job.iiIIiliIll, job.liIIiliIll);
      return var3 <= 0L ? Long.MAX_VALUE : nowMs - var3;
   }

   private static int IlIillIiilIi(List<ilIlilIiIiIlilIi> cols) {
      long var4 = -5629644175248282244L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(ilIlilIiIiIlilIi var3 : cols) {
         var4 ^= ((long)((int)(var4 >>> 32) + var3.liillllIIi.size()) << 32 ^ var4) & -1L << 32;
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite Ilillllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) << 11 | (char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) >>> 5) << 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) << 11 | (char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) >>> 5) >>> 15) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) << 11 | (char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) >>> 5) << 1 | (char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) << 11 | (char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - '섶') + 29538) >>> 5) >>> 15) << 11))) - var5) + 31250) + 18969));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static long iIlIlllllill(int cx, int cy, int cz) {
      return (long)(cx & 2097151) << 42 | (long)(cy & 2097151) << 21 | (long)(cz & 2097151);
   }

   // $FF: synthetic method
   private static CallSite iilllIIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) << 4) - var5) >>> 13 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) << 4) - var5) << 3) + '鴙') + var5)))))) >>> 13 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) << 4) - var5) >>> 13 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] + 6619) + 28904) << 3 | (char)((char)(var4[var5] + 6619) + 28904) >>> 13))))))) ^ var5))) - 29623) ^ var5) << 4) - var5) << 3) + '鴙') + var5)))))) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIiilIiiiIii(IiiiIiIlliiiIiIl nowMs, String memberId, long staleMs, long job) {
      if (nowMs != null && memberId != null && !nowMs.IilliliilIIi() && !memberId.equals(nowMs.IlIIiliIll)) {
         if (nowMs.IlIIiliIll != null && Iilililiiili(nowMs, staleMs) < job) {
            return false;
         } else {
            nowMs.lIlIiliIll = nowMs.IlIIiliIll;
            nowMs.IlIIiliIll = memberId;
            nowMs.llIIiliIll = IliilIillliilIil.lIilIllIil;
            nowMs.iiIIiliIll = staleMs;
            nowMs.liIIiliIll = staleMs;
            ++nowMs.ilIIiliIll;
            ++nowMs.IIlIiliIll;
            nowMs.IiIIiliIll = 0;
            return true;
         }
      } else {
         return false;
      }
   }

   public static int IiIlliIliiIl(liIliliiIlil sharedMaterials, long nowMs, boolean state) {
      List var4 = sharedMaterials.IIIllIIliIIl();
      if (var4.isEmpty()) {
         return 0;
      } else {
         var4.sort(Comparator.comparing((p) -> p.lIiilIiIIi));
         int var10000;
         switch (sharedMaterials.lIiiilliiIiiilli) {
            case lilillliiiililllii -> var10000 = Ililllililil(sharedMaterials, var4, nowMs, IiIlllIiliIlllIi.lliiliIIIi);
            case IIiillliilIiilllii -> var10000 = Ililllililil(sharedMaterials, var4, nowMs, IiIlllIiliIlllIi.iliiliIIIi);
            case iIiillliiIliilllii -> var10000 = Iiilliiliiil(sharedMaterials, var4, nowMs, state);
            case illillliiIililllii -> var10000 = Iilllilliill(sharedMaterials, var4, nowMs, state) + IIIilIIiiIIi(sharedMaterials, var4, nowMs, state);
            default -> throw new MatchException((String)null, (Throwable)null);
         }

         return var10000;
      }
   }

   // $FF: synthetic method
   private static CallSite Iillllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 'ﭗ') << 14 | (char)(var4[var5] + 'ﭗ') >>> 2))) ^ var5) ^ '몵'))) - '찫') >>> 9 | (char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 'ﭗ') << 14 | (char)(var4[var5] + 'ﭗ') >>> 2))) ^ var5) ^ '몵'))) - '찫') << 7) + var5))))))) + 12404) - '괒') - 21928))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IlIlllIlilIl(liIliliiIlil state, long nowMs) {
      long var13 = 5478475341301825275L;
      if (state.IIIllIIliIIl().size() < 2) {
         return 0;
      } else {
         HashMap var3 = new HashMap();

         for(IiiiIiIlliiiIiIl var5 : state.Iilllilliill()) {
            if (var5.IlIIiliIll != null && !var5.IilliliilIIi()) {
               ((List)var3.computeIfAbsent(var5.IlIIiliIll, (k) -> new ArrayList())).add(var5);
            }
         }

         HashMap var15 = new HashMap();

         for(Map.Entry var6 : var3.entrySet()) {
            long var7 = 0L;

            for(IiiiIiIlliiiIiIl var10 : (List)var6.getValue()) {
               var7 = Math.max(var7, Math.max(var10.iiIIiliIll, var10.liIIiliIll));
            }

            var15.put((String)var6.getKey(), var7);
         }

         var13 ^= (0L ^ var13) & -1L << 32;

         for(IIliIiIilIliIiIi var18 : state.IIIllIIliIIl()) {
            Long var8 = (Long)var15.get(var18.lIiilIiIIi);
            if (var8 == null || var8 > 0L && nowMs - var8 < 45000L) {
               var13 += 4294967296L;
            }
         }

         var13 ^= (0L ^ var13) & -1L >>> 32;

         for(Map.Entry var20 : var3.entrySet()) {
            long var21 = (Long)var15.get(var20.getKey());
            if (var21 > 0L && nowMs - var21 >= 45000L && (int)(var13 >>> 32) >= 1) {
               for(IiiiIiIlliiiIiIl var12 : (List)var20.getValue()) {
                  if (var12.IiIIiliIll <= 0 && var12.ilIIiliIll < 2) {
                     ++var12.ilIIiliIll;
                     var12.iliIiiliiiii(IliilIillliilIil.IIilIllIil);
                     var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32;
                  }
               }
            }
         }

         return (int)var13;
      }
   }

   public static int liiiIIllIl(int side, int origin, int world) {
      return Math.floorDiv(side - origin, world);
   }

   public static int IliIlllilIi(int height, int length, int width) {
      long var5 = -5936226519292826048L;
      var5 ^= ((long)Math.max(height, Math.max(length, width)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Math.round((float)((int)(var5 >>> 32)) / 8.0F) ^ var5) & -1L >>> 32;
      return Math.max(2, Math.min(16, (int)var5));
   }

   public static List<IiiiIiIlliiiIiIl> lIiiIiIlilli(int originY, int cells, int originX, int side, liIlIIiliiIlIIil originZ) {
      HashMap var5 = new HashMap();
      originZ.forEach((z, originYx, originXx, mat) -> {
         long var12 = -4642478949359562373L;
         long var14 = 2365785052609483601L;
         var12 ^= ((long)liiiIIllIl(z, originY, side) << 32 ^ var12) & -1L << 32;
         var12 ^= ((long)liiiIIllIl(originYx, cells, side) ^ var12) & -1L >>> 32;
         var14 ^= ((long)liiiIIllIl(originXx, originX, side) << 32 ^ var14) & -1L << 32;
         ((iiilIIllIIIiIIll)var5.computeIfAbsent(iIlIlllllill((int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32)), (k) -> new iiilIIllIIIiIIll(cy, cz, cx))).IliIlllilIi(z, originYx, originXx, mat);
      });
      ArrayList var6 = new ArrayList(var5.size());

      for(iiilIIllIIIiIIll var8 : var5.values()) {
         IiiIIlllliiIIlll var9 = new IiiIIlllliiIIlll();

         for(Map.Entry var11 : var8.IIlllIllll.entrySet()) {
            var9.IliIlllilIi((String)var11.getKey(), (Integer)var11.getValue());
         }

         var6.add(new IiiiIiIlliiiIiIl(IilliliilIIi(var8.iiiIlIllll, var8.IIIllIllll, var8.lIIllIllll), var8.iiiIlIllll, var8.IIIllIllll, var8.lIIllIllll, var8.iIIllIllll, var8.IlIllIllll, var8.llIllIllll, var8.ilIllIllll, var8.IiIllIllll, var8.liIllIllll, var8.iiIllIllll, var9, var8.IlIllIllll));
      }

      var6.sort(Comparator.comparingInt((j) -> j.iIIIiliIll).thenComparingInt((j) -> j.IIiilliIll).thenComparingInt((j) -> j.iIiilliIll).thenComparing((j) -> j.iililliIll));
      return var6;
   }

   private static double IIillIiliIil(IIliIiIilIliIiIi c, ilIlilIiIiIlilIi online, List<IIliIiIilIliIiIi> p, Map<String, Set<Long>> sharedMaterials, boolean region) {
      long var12 = 8129197554464874900L;
      double var5 = (double)0.0F;
      if (c.IlIIiIiIIi) {
         double var7 = online.IliIlllilIi() - c.llIIiIiIIi;
         double var9 = online.liiiIIllIl() - c.liIIiIiIIi;
         var5 += Math.sqrt(var7 * var7 + var9 * var9);
      }

      for(IiiiIiIlliiiIiIl var8 : online.liillllIIi) {
         if (var8.ilIIiliIll > 0 && c.lIiilIiIIi.equals(var8.lIlIiliIll)) {
            var5 += (double)1000.0F;
            break;
         }
      }

      if (region && c.iIlIiIiIIi != null && !c.iIlIiIiIIi.IilliliilIIi()) {
         Map.Entry var15 = online.IilliliilIIi();
         if (var15 != null && (Integer)var15.getValue() > 0) {
            var12 ^= ((long)c.iIlIiIiIIi.liiiIIllIl((String)var15.getKey()) << 32 ^ var12) & -1L << 32;
            if ((int)(var12 >>> 32) <= 0) {
               var12 ^= (0L ^ var12) & -1L >>> 32;

               for(IIliIiIilIliIiIi var11 : p) {
                  if (!var11.lIiilIiIIi.equals(c.lIiilIiIIi) && var11.iIlIiIiIIi != null && var11.iIlIiIiIIi.liiiIIllIl((String)var15.getKey()) > 0) {
                     var12 ^= (1L ^ var12) & -1L >>> 32;
                  }
               }

               var5 += (int)var12 != 0 ? (double)5000.0F : (double)0.0F;
            } else if ((int)(var12 >>> 32) < (Integer)var15.getValue()) {
               var5 += (double)200.0F * (double)((Integer)var15.getValue() - (int)(var12 >>> 32)) / (double)(Integer)var15.getValue();
            }
         }
      }

      return var5;
   }

   private static Map<Long, ilIlilIiIiIlilIi> IIlllIlliIll(liIliliiIlil state) {
      LinkedHashMap var1 = new LinkedHashMap();

      for(IiiiIiIlliiiIiIl var3 : state.Iilllilliill()) {
         if (!var3.IilliliilIIi()) {
            ilIlilIiIiIlilIi var4 = (ilIlilIiIiIlilIi)var1.computeIfAbsent(iIlIlllllill(var3.IIiilliIll, 0, var3.iIiilliIll), (j) -> new ilIlilIiIiIlilIi(var3.IIiilliIll, var3.iIiilliIll));
            var4.liillllIIi.add(var3);
            var4.iiillllIIi += var3.IIIIiliIll;
         }
      }

      return var1;
   }
}
