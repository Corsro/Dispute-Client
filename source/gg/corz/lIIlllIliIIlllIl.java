package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIIlllIliIIlllIl {
   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - '쫪'))) ^ var5) ^ '걖') - 'ꐄ'))) - 13210))))) + var5) >>> 11 | (char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - '쫪'))) ^ var5) ^ '걖') - 'ꐄ'))) - 13210))))) + var5) << 5) - var5) + '\ue323') - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6086193145825673257L ^ Long.rotateLeft(-8244241171532574483L, 34) ^ 4302295444785907583L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2054632922162420260L ^ Long.rotateLeft(1151231920155842021L, 53) ^ 7754813003361681520L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7060221929159231337L ^ Long.rotateLeft(2311959293568313312L, 10) ^ 687983415912000778L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3097039431745909089L ^ Long.rotateLeft(8454351669912407739L, 54) ^ -3146681444607772132L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 9214306738350435816L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2750443837699765715L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3226358961520908836L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2676629901176235945L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4225662134426409760L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3745110387089102795L;
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
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) - 285))) - var5) + var5) + var5) + var5) ^ var5))) - var5) + var5))) ^ var5) ^ var5) << 6 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) - 285))) - var5) + var5) + var5) + var5) ^ var5))) - var5) + var5))) ^ var5) ^ var5) >>> 10) << 2 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) - 285))) - var5) + var5) + var5) + var5) ^ var5))) - var5) + var5))) ^ var5) ^ var5) << 6 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) - 285))) - var5) + var5) + var5) + var5) ^ var5))) - var5) + var5))) ^ var5) ^ var5) >>> 10) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iiIillIlIIlillIl IliIlllilIi(lIIiiiiIIiii otherMissionOwns, ilIililIiIilil cap, int entryFailedContext, int recentExit, int horizon, int radius, lliiiliiliiili cz, boolean p, boolean cx, boolean stats, boolean enabled) {
      return liiiIIllIl(otherMissionOwns, cap, entryFailedContext, recentExit, horizon, radius, cz, p, cx, stats, (d) -> enabled);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) ^ '덽') + var5))) + '\ueb68') - 18748) - var5) ^ var5) + var5) - 19019) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) << 4 | (char)(var4[var5] + var5) >>> 12) ^ '덽') + var5))) + '\ueb68') - 18748) - var5) ^ var5) + var5) - 19019) ^ var5) << 2)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iiIillIlIIlillIl iIlIlllllill(lIIiiiiIIiii otherMissionOwns, ilIililIiIilil p, int radius, int cz, int cap, int entryGate, lliiiliiliiili enabled, boolean recentExit, boolean cx, boolean horizon, Function<Iiilliiliiil, Iiiiilllliiiilll> stats) {
      iiIillIlIIlillIl var11 = IilliliilIIi(otherMissionOwns, p, radius, cz, cap, entryGate, enabled, recentExit, cx, horizon, stats);
      if (enabled != null) {
         enabled.liiiIIllIl(var11);
      }

      return var11;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - '臓'))) + 3060) + var5) - '퉫') << 12 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - '臓'))) + 3060) + var5) - '퉫') >>> 4) - var5) ^ '諣') ^ var5) ^ 30897) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - '臓'))) + 3060) + var5) - '퉫') << 12 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - '臓'))) + 3060) + var5) - '퉫') >>> 4) - var5) ^ '諣') ^ var5) ^ 30897) << 8) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static iiIillIlIIlillIl IilliliilIIi(lIIiiiiIIiii enabled, ilIililIiIilil otherMissionOwns, int stats, int entryGate, int cz, int p, lliiiliiliiili recentExit, boolean radius, boolean horizon, boolean cap, Function<Iiilliiliiil, Iiiiilllliiiilll> cx) {
      long var21 = 5914044292333422497L;
      long var23 = -7349614420975896388L;
      long var25 = 2440844262951985437L;
      if (!radius) {
         return new iiIillIlIIlillIl(Iiiiilllliiiilll.iiiIlllill, Integer.MIN_VALUE, (Iiilliiliiil)null, (iIlillIllill)null, IlIlllIlilIl<invokedynamic>());
      } else if (horizon) {
         return new iiIillIlIIlillIl(Iiiiilllliiiilll.liIllllill, Integer.MIN_VALUE, (Iiilliiliiil)null, (iIlillIllill)null, IlIlllIlilIl<invokedynamic>());
      } else {
         List var11 = otherMissionOwns == null ? List.of() : otherMissionOwns.IilliliilIIi();
         if (var11.isEmpty()) {
            return new iiIillIlIIlillIl(Iiiiilllliiiilll.IIIllllill, Integer.MIN_VALUE, (Iiilliiliiil)null, (iIlillIllill)null, IlIlllIlilIl<invokedynamic>());
         } else {
            iIlillIllill var12 = null;
            var21 ^= (Long.MIN_VALUE ^ var21) & -1L << 32;
            var21 ^= ~var21 & -1L >>> 32;
            iIlillIllill var15 = null;
            var23 ^= (Long.MIN_VALUE ^ var23) & -1L << 32;
            Iterator var17 = var11.iterator();

            while(var17.hasNext()) {
               var23 ^= ((long)(Integer)var17.next() ^ var23) & -1L >>> 32;
               iIlillIllill var19 = iIiIilIiIliIilIi.lIiiIiIlilli(enabled, (int)var23, stats, entryGate, cz, p);
               if (var19.liliilIiiiliilIi != null && var19.liliilIiiiliilIi.IliIlllilIi()) {
                  if (recentExit != null) {
                     ++recentExit.llllIllIIl;
                  }

                  var25 ^= ((long)(var19.liliilIiiiliilIi.IilliliilIIi() * 4 + Math.min(var19.liliilIiiiliilIi.IlIIllllIIll, 400)) << 32 ^ var25) & -1L << 32;
                  if ((int)(var25 >>> 32) > (int)var21) {
                     var21 ^= ((long)((int)(var25 >>> 32)) ^ var21) & -1L >>> 32;
                     var12 = var19;
                     var21 ^= ((long)((int)var23) << 32 ^ var21) & -1L << 32;
                  }
               }

               if (var15 == null || lIiiIiIlilli(var19) > lIiiIiIlilli(var15)) {
                  var15 = var19;
                  var23 ^= ((long)((int)var23) << 32 ^ var23) & -1L << 32;
               }
            }

            if (var12 == null) {
               Iiiiilllliiiilll var18 = var15.llIiilIiilIiilIi == 0 ? Iiiiilllliiiilll.lIIllllill : (var15.IiIiilIiliIiilIi == 0 ? Iiiiilllliiiilll.iIIllllill : (var15.liliilIiiiliilIi == null ? Iiiiilllliiiilll.lIIllllill : (var15.liliilIiiiliilIi.IilliliilIIi() == 0 ? Iiiiilllliiiilll.IlIllllill : Iiiiilllliiiilll.llIllllill)));
               return new iiIillIlIIlillIl(var18, (int)(var23 >>> 32), (Iiilliiliiil)null, var15, IlIlllIlilIl<invokedynamic>() + (int)(var23 >>> 32) + IlIlllIlilIl<invokedynamic>() + var15.IliIlllilIi());
            } else if (cap) {
               return new iiIillIlIIlillIl(Iiiiilllliiiilll.iiIllllill, (int)(var21 >>> 32), (Iiilliiliiil)null, var12, IlIlllIlilIl<invokedynamic>());
            } else {
               if (!var12.liliilIiiiliilIi.iIlIlllllill(llIiIiililIiIiil.IIIllIIliIIl(stats, otherMissionOwns.IiIlliIliiIl(), entryGate))) {
                  Iiiiilllliiiilll var27 = (Iiiiilllliiiilll)cx.apply(var12.liliilIiiiliilIi);
                  if (var27 == null) {
                     var27 = Iiiiilllliiiilll.liiIlllill;
                  }

                  if (var27 == Iiiiilllliiiilll.iIlllllill) {
                     return new iiIillIlIIlillIl(var27, (int)(var21 >>> 32), var12.liliilIiiiliilIi, var12, IlIlllIlilIl<invokedynamic>());
                  }

                  if (var27 != Iiiiilllliiiilll.liiIlllill) {
                     return new iiIillIlIIlillIl(var27, (int)(var21 >>> 32), (Iiilliiliiil)null, var12, var27 == Iiiiilllliiiilll.IIlllllill ? IlIlllIlilIl<invokedynamic>() : var27.name().toLowerCase(Locale.ROOT).replace('_', ' '));
                  }
               }

               return new iiIillIlIIlillIl(Iiiiilllliiiilll.liiIlllill, (int)(var21 >>> 32), var12.liliilIiiiliilIi, var12, IlIlllIlilIl<invokedynamic>() + (int)(var21 >>> 32) + IlIlllIlilIl<invokedynamic>() + var12.IliIlllilIi());
            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) ^ var5))) << 8 | (char)(~((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) ^ var5))) >>> 8))) << 8 | (char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) ^ var5))) << 8 | (char)(~((char)((char)((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) ^ var5) + var5) ^ var5))) >>> 8))) >>> 8) - var5) - '쑐') ^ var5) + '胺') + 19369))) - var5))) - '누'))) + 'ﳖ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int lIiiIiIlilli(iIlillIllill r) {
      if (r.liliilIiiiliilIi != null && r.liliilIiiiliilIi.IilliliilIIi() > 0) {
         return 4;
      } else if (r.liliilIiiiliilIi != null) {
         return 3;
      } else if (r.IiIiilIiliIiilIi > 0) {
         return 2;
      } else {
         return r.llIiilIiilIiilIi > 0 ? 1 : 0;
      }
   }

   private lIIlllIliIIlllIl() {
   }

   public static iiIillIlIIlillIl liiiIIllIl(lIIiiiiIIiii horizon, ilIililIiIilil stats, int recentExit, int entryFailed, int cx, int p, lliiiliiliiili radius, boolean otherMissionOwns, boolean cz, boolean enabled, Predicate<Iiilliiliiil> cap) {
      return iIlIlllllill(horizon, stats, recentExit, entryFailed, cx, p, radius, otherMissionOwns, cz, enabled, (entryFailedx) -> cap.test(entryFailedx) ? Iiiiilllliiiilll.IIlllllill : Iiiiilllliiiilll.liiIlllill);
   }
}
