package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_4969;
import net.minecraft.class_638;
import net.minecraft.class_746;

public final class iliIliilIiiIliil {
   public static final int lIliiIilil = 300;
   public static final float lIlIIlilil = 0.95F;
   public static final double IiliiIilil = (double)6.0F;
   private long lIIlIlilil;
   public static final float ilIIIlilil = 0.5F;
   public static final int liiiiIilil = -1;
   private final Map<Long, IliIiiIilliIiiIi> IilIIlilil = new HashMap();
   private int IlIlIlilil;
   private final Map<Long, Long> iilIIlilil = new HashMap();
   public static final int iiIiiIilil = 2;
   public static final int ilIiiIilil = 3;
   public static final float iIiiiIilil = 0.05F;
   public static final double lliiiIilil = 0.28;
   public static final int iiiiiIilil = 99;
   public static final float lIiiiIilil = 5.0F;
   public static final float lIIIIlilil = 0.8F;
   public static final int IIliiIilil = 4;
   static final int lllIIlilil = 4;
   private final Map<Long, Long> lilIIlilil = new HashMap();
   private final Map<Integer, liilIIiliiilIIil> lIiIIlilil = new HashMap();
   public static final double IiiiiIilil = 1.62;
   public static final double iliiiIilil = (double)8.0F;
   public static final int liIiiIilil = 2;
   private long IIIlIlilil;
   public static final int IIlIIlilil = 3;
   public static final int IIIiiIilil = 10;
   public static final double IliiiIilil = (double)4.5F;
   private class_1937 iIIlIlilil;
   private List<IIIilIIiiIIi> iliIIlilil = List.of();
   private class_2338 iiiIIlilil;
   private IIIilIIiiIIi IiiIIlilil;
   public static final float IIIIIlilil = 0.9F;
   public static final double illiiIilil = (double)5.5F;
   public static final double IIiiiIilil = (double)1.5F;
   private final Map<Integer, Long> IIiIIlilil = new HashMap();
   public static final int IiIiiIilil = 200;
   public static final int IlliiIilil = 4;
   private int lliIIlilil;
   public static final int iiIIIlilil = 2;
   public static final double IiIIIlilil = (double)0.5F;
   public static final float iIIIIlilil = 0.6F;
   public static final double llliiIilil = 0.3;
   public static final float IlIIIlilil = 0.5F;
   public static final float llIIIlilil = 0.1F;
   public static final double liiliIilil = (double)8.0F;
   static final int IllIIlilil = 3;
   public static final int liliiIilil = 3;
   static final int iIlIIlilil = 32;
   public static final int llIiiIilil = -3;
   private final ArrayDeque<IIIiiIllIIiiIl> iIiIIlilil = new ArrayDeque();
   public static final int liIIIlilil = 8;
   private long liiIIlilil;
   public static final int iIliiIilil = 3;
   public static final double iiiliIilil = (double)12.0F;
   private final StringBuilder IliIIlilil = new StringBuilder();
   private final IilIllililIlli illIIlilil;
   public static final int lIIiiIilil = 2;
   public static final int iiliiIilil = 3;
   public static final int IlIiiIilil = 6;
   public static final int iIIiiIilil = 200;

   void llIIlilIIl(long tick, List<liiilIiliiiilIil> enemies) {
      this.liiIIlilil = Math.max(this.liiIIlilil, tick);

      for(liilIIiliiilIIil var5 : this.lIiIIlilil.values()) {
         var5.liIillIIil = false;
      }

      if (enemies != null) {
         for(liiilIiliiiilIil var8 : enemies) {
            if (var8 != null) {
               liilIIiliiilIIil var6 = (liilIIiliiilIIil)this.lIiIIlilil.computeIfAbsent(var8.iIlIlllllill(), liilIIiliiilIIil::new);
               var6.liIillIIil = true;
               var6.lIlillIIil = tick;
               var6.llIillIIil = illilIilil(var8);
               var6.ilIillIIil = var8.IIiilIiiiIii() == null ? iIIiIIliIlIiIIli.lIliilIlIi : var8.IIiilIiiiIii();
               var6.IiIillIIil = var8.Iliilliiilii() == null ? iIIiIIliIlIiIIli.lIliilIlIi : var8.Iliilliiilii();
               if (lIliliIlil(var6.ilIillIIil) || lIliliIlil(var6.IiIillIIil)) {
                  var6.iiIillIIil = tick;
               }
            }
         }
      }

      this.lIiIIlilil.values().removeIf((f) -> !f.liIillIIil && !iiIilIIlil(tick, f.lIlillIIil, 600));
      this.IIiIIlilil.values().removeIf((tickx) -> tick - tickx > 12L);
   }

   private static class_243 illilIilil(liiilIiliiiilIil e) {
      if (e.IiIlliIliiIl() != null) {
         return e.IiIlliIliiIl();
      } else {
         class_243 var1 = e.IIIllIIliIIl() != null ? e.IIIllIIliIIl() : e.iliIiiliiiii();
         return var1 == null ? null : var1.method_1031((double)0.0F, 1.62, (double)0.0F);
      }
   }

   private lIIiIiiiIIiIii lllllillll(IliIiiIilliIiiIi t) {
      long var10 = -1737635118853485109L;
      if (t.lllIIIIlIi != -1) {
         liilIIiliiilIIil var2 = (liilIIiliiilIIil)this.lIiIIlilil.get(t.lllIIIIlIi);
         if (var2 != null && var2.liIillIIil && var2.llIillIIil != null) {
            return new lIIiIiiiIIiIii(var2.llIillIIil, Illillllil(var2));
         }
      }

      class_243 var12 = null;
      var10 ^= (0L ^ var10) & -1L << 32;
      double var4 = Double.MAX_VALUE;

      for(liilIIiliiilIIil var7 : this.lIiIIlilil.values()) {
         if (var7.liIillIIil && var7.llIillIIil != null) {
            double var8 = iIIIlIlIIl(var7.llIillIIil, t.IllIIIIlIi);
            if (var8 < var4) {
               var4 = var8;
               var12 = var7.llIillIIil;
               var10 ^= ((long)Illillllil(var7) << 32 ^ var10) & -1L << 32;
            }
         }
      }

      return new lIIiIiiiIIiIii(var12, (boolean)((int)(var10 >>> 32)));
   }

   static float IiIiliIiiiIi(float placed, int detonated, int pDet) {
      return detonated < 3 ? placed : Math.max(placed, Math.min(0.95F, (float)pDet / (float)detonated));
   }

   public void Illlllllilll() {
      this.IilIIlilil.clear();
      this.lilIIlilil.clear();
      this.iilIIlilil.clear();
      this.IIiIIlilil.clear();
      this.lIiIIlilil.clear();
      this.iIiIIlilil.clear();
      this.IliIIlilil.setLength(0);
      this.lliIIlilil = 0;
      this.iliIIlilil = List.of();
      this.IiiIIlilil = IIIilIIiiIIi.IIIllllIIlll;
      this.liiIIlilil = Long.MIN_VALUE;
      this.iiiIIlilil = null;
      this.IIIlIlilil = Long.MIN_VALUE;
      this.lIIlIlilil = Long.MIN_VALUE;
      this.iIIlIlilil = null;
      this.IlIlIlilil = 0;
   }

   public int IIlllIlliIll() {
      long var4 = -2415451225219435684L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(IliIiiIilliIiiIi var3 : this.IilIIlilil.values()) {
         if (!var3.IIiIIIIlIi) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   private static float ilillIiill(class_243 difficulty, class_243 centre, int feet) {
      float var3 = (float)liiIIliliiiIIlil.IliIlllilIi(difficulty.method_1022(centre), (double)1.0F, (double)5.0F);
      return iiIiiliIIliili.IliIlllilIi(var3, feet);
   }

   private void iIiIlIliIl(class_2338 cell, int tick, long ownMark, long charges, boolean fromEvent, long placedTick) {
      IliIiiIilliIiiIi var10 = new IliIiiIilliIiiIi(cell, tick, charges);
      var10.iilIIIIlIi = charges;
      if (tick > 0 && fromEvent) {
         var10.lilIIIIlIi = ownMark;
      }

      this.IilIIlilil.put(cell.method_10063(), var10);
      if (placedTick != Long.MIN_VALUE) {
         var10.iIiIIIIlIi = true;
         var10.lliIIIIlIi = placedTick;
      } else {
         var10.lllIIIIlIi = Iliilliiilii(cell, ownMark, this.iiiIlIIIll());
         ++this.IlIlIlilil;
         if (var10.lllIIIIlIi != -1) {
            liilIIiliiilIIil var11 = (liilIIiliiilIIil)this.lIiIIlilil.computeIfAbsent(var10.lllIIIIlIi, liilIIiliiilIIil::new);
            var11.IIlillIIil = ownMark;
            if (fromEvent) {
               ++var11.IllillIIil;
               var10.IliIIIIlIi = true;
            }
         }

         this.Ilillllill(liIIiiiIIi<invokedynamic>(), cell, "");
      }
   }

   public boolean IlIlllIlilIl(int enemyId) {
      liilIIiliiilIIil var2 = (liilIIiliiilIIil)this.lIiIIlilil.get(enemyId);
      if (var2 == null) {
         return false;
      } else {
         return iiIilIIlil(this.liiIIlilil, var2.iiIillIIil, 300) || iiIilIIlil(this.liiIIlilil, var2.IIlillIIil, 300);
      }
   }

   private void lliIliliIl(IliIiiIilliIiiIi t) {
      if (t.IliIIIIlIi && !t.iIiIIIIlIi && t.lllIIIIlIi != -1) {
         liilIIiliiilIIil var2 = (liilIIiliiilIIil)this.lIiIIlilil.get(t.lllIIIIlIi);
         if (var2 != null) {
            long var3 = t.lIiIIIIlIi - t.IilIIIIlIi;
            if (var3 >= 1L && var3 <= 8L) {
               var2.iIlillIIil = IIlilIliiIli(var2.iIlillIIil, var3);
               ++var2.lllillIIil;
            }
         }
      }
   }

   private void lIIlliIIll(class_2338 state, class_2680 pos, long tick) {
      long var7 = 8618361731047229681L;
      if (state != null && pos != null) {
         this.lIIlIlilil = tick;
         var7 ^= (-4294967296L ^ var7) & -1L << 32;
         IIllIlIilIllIlIi var5;
         if (pos.method_27852(class_2246.field_23152)) {
            var5 = IIllIlIilIllIlIi.IlllIIIIIi;
            var7 ^= ((long)(Integer)pos.method_11654(class_4969.field_23153) << 32 ^ var7) & -1L << 32;
         } else if (pos.method_27852(class_2246.field_10171)) {
            var5 = IIllIlIilIllIlIi.llllIIIIIi;
         } else if (!pos.method_27852(class_2246.field_10540) && !pos.method_27852(class_2246.field_22423)) {
            if (pos.method_26215()) {
               var5 = IIllIlIilIllIlIi.IillIIIIIi;
            } else {
               var5 = IIllIlIilIllIlIi.lillIIIIIi;
            }
         } else {
            var5 = IIllIlIilIllIlIi.illlIIIIIi;
         }

         this.IiIIlliIIl(state, var5, (int)(var7 >>> 32), tick);
      }
   }

   private static boolean lIliliIlil(iIIiIIliIlIiIIli h) {
      return h == iIIiIIliIlIiIIli.liililIlIi || h == iIIiIIliIlIiIIli.iiililIlIi;
   }

   private static String lililiilil(float v) {
      return !Float.isFinite(v) ? liIIiiiIIi<invokedynamic>() : String.format(Locale.ROOT, liIIiiiIIi<invokedynamic>(), v);
   }

   public int IiIlliIliiIl() {
      return this.IlIlIlilil;
   }

   // $FF: synthetic method
   private static CallSite IilIililIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) << 15) + 13358))) >>> 4 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) << 15) + 13358))) << 12) ^ var5) - '괜') + var5))) << 4 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) << 15) + 13358))) >>> 4 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) + 30752) + var5) + '豱') + '\ued67'))) << 15) + 13358))) << 12) ^ var5) - '괜') + var5))) >>> 12) ^ var5) - '\ueb2e'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iilllIIill(class_2338 cell) {
      ArrayList var2 = new ArrayList(this.iliIIlilil.size());

      for(IIIilIIiiIIi var4 : this.iliIIlilil) {
         if (!cell.equals(var4.lIiiIiIlilli())) {
            var2.add(var4);
         }
      }

      this.iliIIlilil = List.copyOf(var2);
      this.IiiIIlilil = this.iliIIlilil.isEmpty() ? IIIilIIiiIIi.IIIllllIIlll : (IIIilIIiiIIi)this.iliIIlilil.get(0);
   }

   private void iIlllIllll(class_746 player, lliiilIiiliiilIi targetReadyIn, liiilIiliiiilIil tick, int self, int selfClosedFor, long target) {
      long var36 = 2683005052501507126L;
      long var38 = -2269787236964176482L;
      long var40 = 1179868790599776436L;
      long var42 = -7326117382689774365L;
      long var44 = 4308521946321592267L;
      class_243 var8 = targetReadyIn.liiiIIllIl();
      class_238 var9 = targetReadyIn.IilliliilIIi();
      iiIllIlIIlllIl var10 = targetReadyIn.IiIlliIliiIl() == null ? iiIllIlIIlllIl.lliIilIlliliIilIll : targetReadyIn.IiIlliIliiIl();
      IilIlIIllilIlIIl var11 = new IilIlIIllilIlIIl(Math.max(0, selfClosedFor), targetReadyIn.iIIIlIlIIl());
      ArrayList var12 = new ArrayList();

      for(IliIiiIilliIiiIi var14 : this.IilIIlilil.values()) {
         if (!var14.IIiIIIIlIi && !IIIillIIil(var14, target) && !(class_243.method_24953(var14.IllIIIIlIi).method_1022(var8) > (double)8.5F)) {
            var12.add(var14);
         }
      }

      if (var12.isEmpty()) {
         this.lIilliIill();
      } else {
         var12.sort(Comparator.comparingDouble((feet) -> class_243.method_24953(feet.IllIIIIlIi).method_1025(var8)));
         class_243 var46 = tick == null ? null : (tick.IIIllIIliIIl() != null ? tick.IIIllIIliIIl() : tick.iliIiiliiiii());
         var36 ^= ((long)(tick == null ? Integer.MIN_VALUE : tick.iIlIlllllill()) << 32 ^ var36) & -1L << 32;
         iiIllIlIIlllIl var15 = tick != null && tick.IlIillIiilIi() != null ? tick.IlIillIiilIi() : iiIllIlIIlllIl.lliIilIlliliIilIll;
         IilIlIIllilIlIIl var16 = tick == null ? IilIlIIllilIlIIl.IIIIlillIl : new IilIlIIllilIlIIl(Math.max(0, self), tick.llIIlilIIl());
         ArrayList var17 = new ArrayList(3);
         var36 ^= (0L ^ var36) & -1L >>> 32;

         for(IliIiiIilliIiiIi var20 : var12) {
            int var10000 = (int)var36;
            var36 ^= (var36 ^ var36 + (long)1) & -1L >>> 32;
            if (var10000 >= 3) {
               break;
            }

            class_243 var21 = class_243.method_24953(var20.IllIIIIlIi);
            lIIiIiiiIIiIii var22 = this.lllllillll(var20);
            long var50 = var38 ^ ((long)(var20.illIIIIlIi >= 1 ? 1 : 0) << 32 ^ var38) & -1L << 32;
            var38 = var50 ^ ((long)(var22.IIliIIiIIl == null ? 99 : Iiilliiliiil((boolean)((int)(var50 >>> 32)), iIIIlIlIIl(var22.IIliIIiIIl, var20.IllIIIIlIi), var22.lIliIIiIIl)) ^ var50) & -1L >>> 32;
            long var51 = var40 ^ ((long)(var20.lllIIIIlIi != -1 ? 1 : 0) << 32 ^ var40) & -1L << 32;
            liilIIiliiilIIil var26 = (int)(var51 >>> 32) != 0 ? (liilIIiliiilIIil)this.lIiIIlilil.get(var20.lllIIIIlIi) : null;
            var40 = var51 ^ ((long)((int)(var51 >>> 32) == 0 || var26 != null && var26.liIillIIil && var26.llIillIIil != null && !(var26.llIillIIil.method_1022(var21) > (double)8.0F) ? 0 : 1) ^ var51) & -1L >>> 32;
            var42 ^= ((long)(var22.IIliIIiIIl != null && iIIIlIlIIl(var22.IIliIIiIIl, var20.IllIIIIlIi) <= (double)4.5F ? 1 : 0) << 32 ^ var42) & -1L << 32;
            float var29 = IIIilIIiiIIi((boolean)((int)(var38 >>> 32)), (boolean)((int)(var42 >>> 32)), var22.lIliIIiIIl, (boolean)((int)(var40 >>> 32)), (boolean)((int)var40));
            if (var26 != null && var26.liIillIIil) {
               var38 ^= ((long)IlIillIiilIi((int)var38, (boolean)((int)(var38 >>> 32)), (boolean)((int)(var42 >>> 32)), var26.lllillIIil, var26.iIlillIIil, target - var20.IilIIIIlIi) ^ var38) & -1L >>> 32;
               if ((int)var40 == 0) {
                  var29 = IiIiliIiiiIi(var29, var26.IllillIIil, var26.lllillIIil);
               }
            }

            if (this.Iillllilll(var20, var8, var46, (int)(var36 >>> 32), target)) {
               if (this.illIIlilil != null && !this.illIIlilil.liiiIIllIl(45, 3)) {
                  var20.IiiIIIIlIi = true;
               } else {
                  var20.iIIlIIIlIi = lllIliIlillIliIl.IlIllllIll(player, var21, var8, var9, (class_2338)null, var20.IllIIIIlIi, 5.0F);
                  var20.iiiIIIIlIi = var8;
                  var20.liiIIIIlIi = target;
                  var20.IiiIIIIlIi = false;
                  if (tick != null && tick.lIiiIiIlilli() != null) {
                     if (this.illIIlilil != null && !this.illIIlilil.liiiIIllIl(45, 3)) {
                        var20.IiiIIIIlIi = true;
                     } else {
                        var42 ^= ((long)Math.max(1, Math.min(8, (int)var38)) ^ var42) & -1L >>> 32;
                        iIIlIIiIlIlIIi var31 = lllIliIlillIliIl.iIIilIlIil(tick.lIiiIiIlilli(), (int)var42, false, true);
                        var20.IlIlIIIlIi = IiliiIililiiIi.IliIlllilIi(tick.lIiiIiIlilli(), var31, var20.IllIIIIlIi, (class_2338)null);
                        var20.llIlIIIlIi = lllIliIlillIliIl.ilIllIiIll(tick.lIiiIiIlilli(), var31.IliIlllilIi().method_1022(var21), 5.0F);
                        var20.IIIlIIIlIi = var46;
                        var20.lIIlIIIlIi = (int)(var36 >>> 32);
                     }
                  } else {
                     var20.IlIlIIIlIi = Float.NaN;
                     var20.llIlIIIlIi = Float.NaN;
                     var20.IIIlIIIlIi = null;
                     var20.lIIlIIIlIi = (int)(var36 >>> 32);
                  }
               }
            }

            float var30 = Float.isNaN(var20.iIIlIIIlIi) ? ilillIiill(var8, var21, var10.lIiiIiIlilli()) : var20.iIIlIIIlIi;
            float var47 = iiIiiliIIliili.lIiiIiIlilli(var30, var10);
            float var32 = iiIiiliIIliili.IIIllIIliIIl(var30, var10, var11, (int)var38);
            long var52 = var44 ^ ((long)(tick != null && var20.lIIlIIIlIi == (int)(var36 >>> 32) && !Float.isNaN(var20.IlIlIIIlIi) ? 1 : 0) << 32 ^ var44) & -1L << 32;
            float var34 = (int)(var52 >>> 32) != 0 ? iiIiiliIIliili.IIIllIIliIIl(var20.IlIlIIIlIi, var15, var16, (int)var38) : 0.0F;
            var44 = var52 ^ ((long)((int)(var52 >>> 32) != 0 && var20.llIlIIIlIi > 0.0F && var20.IlIlIIIlIi < 0.5F * var20.llIlIIIlIi ? 1 : 0) ^ var52) & -1L >>> 32;
            var17.add(new IIIilIIiiIIi(var20.IllIIIIlIi, var20.illIIIIlIi, var30, var47, var32, var34, (int)var38, var29, var20.lllIIIIlIi, (boolean)((int)var44), this.IIIllIIliIIl(var20.lllIIIIlIi)));
         }

         var17.sort(Comparator.comparingDouble((a) -> (double)a.liiiIIllIl()).reversed().thenComparing(Comparator.comparingDouble((a) -> (double)a.IiIlliIliiIl()).reversed()));
         this.iliIIlilil = List.copyOf(var17);
         this.IiiIIlilil = this.iliIIlilil.isEmpty() ? IIIilIIiiIIi.IIIllllIIlll : (IIIilIIiiIIi)this.iliIIlilil.get(0);
      }
   }

   static float IIIilIIiiIIi(boolean ownerInReach, boolean ownerKnown, boolean ownerAway, boolean ownerHoldsGlowstone, boolean charged) {
      if (charged) {
         return 0.1F;
      } else if (!ownerHoldsGlowstone) {
         return 0.5F;
      } else if (ownerInReach) {
         return ownerKnown ? 0.9F : 0.6F;
      } else {
         return ownerAway ? 0.8F : 0.6F;
      }
   }

   void lIlIliIlIl(long tick) {
      long var8 = -7608962532475995077L;
      ArrayList var3 = new ArrayList(this.iIiIIlilil.size());
      ArrayList var4 = new ArrayList(this.iIiIIlilil.size());

      for(IIIiiIllIIiiIl var6 : this.iIiIIlilil) {
         var3.add(var6.IliIlllilIi());
         var4.add(var6.liiiIIllIl());
      }

      Iterator var10 = this.IilIIlilil.entrySet().iterator();

      while(var10.hasNext()) {
         IliIiiIilliIiiIi var11 = (IliIiiIilliIiiIi)((Map.Entry)var10.next()).getValue();
         if (var11.IIiIIIIlIi) {
            var8 ^= ((long)(var11.illIIIIlIi >= 1 && Iiiiliiiiiii(var11.IllIIIIlIi, var11.lIiIIIIlIi, var3, var4) ? 1 : 0) << 32 ^ var8) & -1L << 32;
            if ((int)(var8 >>> 32) != 0 || tick > var11.lIiIIIIlIi) {
               if ((int)(var8 >>> 32) != 0) {
                  this.lliIliliIl(var11);
               }

               this.Ilillllill(liIIiiiIIi<invokedynamic>(), var11.IllIIIIlIi, (int)(var8 >>> 32) != 0 ? liIIiiiIIi<invokedynamic>() : liIIiiiIIi<invokedynamic>());
               var10.remove();
            }
         }
      }

      this.iIiIIlilil.removeIf((b) -> tick - b.liiiIIllIl() > 3L);
   }

   boolean IllIllllIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : (IliIiiIilliIiiIi)this.IilIIlilil.get(cell.method_10063());
      return var2 != null && !var2.IIiIIIIlIi;
   }

   private void liIlliiIll(class_1937 world, long tick) {
      long var9 = -3178572931976750616L;
      Iterator var4 = this.IilIIlilil.entrySet().iterator();

      while(var4.hasNext()) {
         IliIiiIilliIiiIi var5 = (IliIiiIilliIiiIi)((Map.Entry)var4.next()).getValue();
         if (!var5.IIiIIIIlIi) {
            if (this.iiiIIlilil != null && class_243.method_24953(var5.IllIIIIlIi).method_1022(class_243.method_24953(this.iiiIIlilil)) > (double)12.0F) {
               var4.remove();
            } else {
               class_2680 var6 = world.method_8320(var5.IllIIIIlIi);
               if (!var6.method_27852(class_2246.field_23152)) {
                  var5.IIiIIIIlIi = true;
                  var5.lIiIIIIlIi = tick;

                  for(IliIiiIilliIiiIi var8 : this.IilIIlilil.values()) {
                     var8.IiiIIIIlIi = true;
                  }
               } else {
                  var9 ^= ((long)(Integer)var6.method_11654(class_4969.field_23153) << 32 ^ var9) & -1L << 32;
                  if ((int)(var9 >>> 32) != var5.illIIIIlIi) {
                     if ((int)(var9 >>> 32) > var5.illIIIIlIi) {
                        var5.lilIIIIlIi = tick;
                     }

                     var5.illIIIIlIi = (int)(var9 >>> 32);
                     var5.iilIIIIlIi = tick;
                     var5.IiiIIIIlIi = true;
                     if (!IIIillIIil(var5, tick)) {
                        this.Ilillllill(liIIiiiIIi<invokedynamic>(), var5.IllIIIIlIi, liIIiiiIIi<invokedynamic>() + (int)(var9 >>> 32));
                     }
                  }
               }
            }
         }
      }

   }

   List<class_2338> lilIliilIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : (IliIiiIilliIiiIi)this.IilIIlilil.get(cell.method_10063());
      return var2 == null ? List.of() : List.copyOf(var2.iliIIIIlIi);
   }

   int Iilililiiili(int enemyId) {
      liilIIiliiilIIil var2 = (liilIIiliiilIIil)this.lIiIIlilil.get(enemyId);
      return var2 == null ? 0 : var2.IllillIIil;
   }

   private static boolean IIIillIIil(IliIiiIilliIiiIi t, long tick) {
      return t.iIiIIIIlIi && iiIilIIlil(tick, t.lliIIIIlIi, 2);
   }

   private boolean IlIllllIll(long tick) {
      return this.lIIlIlilil != Long.MIN_VALUE && tick - this.lIIlIlilil <= 200L;
   }

   private static boolean Illillllil(liilIIiliiilIIil f) {
      return f.ilIillIIil == iIIiIIliIlIiIIli.iiililIlIi || f.IiIillIIil == iIIiIIliIlIiIIli.iiililIlIi;
   }

   public String Iilllilliill() {
      IIIilIIiiIIi var1 = this.IiiIIlilil;
      if (var1 != null && var1.IliIlllilIi()) {
         StringBuilder var2 = new StringBuilder(64);
         class_2338 var3 = this.iiiIIlilil == null ? class_2338.field_10980 : this.iiiIIlilil;
         var2.append(var1.lIiiIiIlilli().method_10263() - var3.method_10263()).append(',').append(var1.lIiiIiIlilli().method_10264() - var3.method_10264()).append(',').append(var1.lIiiIiIlilli().method_10260() - var3.method_10260());
         var2.append(liIIiiiIIi<invokedynamic>()).append(var1.iliIiiliiiii());
         var2.append(liIIiiiIIi<invokedynamic>()).append(lililiilil(var1.IiIlliIliiIl()));
         var2.append(liIIiiiIIi<invokedynamic>()).append(lililiilil(var1.IlIlllIlilIl()));
         var2.append(liIIiiiIIi<invokedynamic>()).append(lililiilil(var1.IIlllIlliIll()));
         var2.append(liIIiiiIIi<invokedynamic>()).append(var1.Illlllllilll());
         var2.append(liIIiiiIIi<invokedynamic>()).append(lililiilil(var1.Iilllilliill()));
         var2.append(liIIiiiIIi<invokedynamic>()).append((char)(var1.Ililllililil() ? '1' : '0'));
         var2.append(liIIiiiIIi<invokedynamic>()).append((char)(var1.Iiilliiliiil() ? '1' : '0'));
         return var2.toString();
      } else {
         return liIIiiiIIi<invokedynamic>();
      }
   }

   public String IIillIiliIil() {
      String var1 = this.IliIIlilil.toString();
      this.IliIIlilil.setLength(0);
      this.lliIIlilil = 0;
      return var1;
   }

   public iliIliilIiiIliil(IilIllililIlli rays) {
      this.IiiIIlilil = IIIilIIiiIIi.IIIllllIIlll;
      this.liiIIlilil = Long.MIN_VALUE;
      this.IIIlIlilil = Long.MIN_VALUE;
      this.lIIlIlilil = Long.MIN_VALUE;
      this.illIIlilil = rays;
   }

   // $FF: synthetic method
   private static CallSite iilIiIIiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) >>> 1 | (char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) << 15))) << 13 | (char)(~((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) >>> 1 | (char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) << 15))) >>> 3) + var5) << 2 | (char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) >>> 1 | (char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) << 15))) << 13 | (char)(~((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) >>> 1 | (char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) << 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ var5) ^ 6785) >>> 15) + '셓'))))))) - var5) << 15))) >>> 3) + var5) >>> 14) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(IlIillIiilIi e, long tick, int selfId) {
      if (e != null) {
         this.liiIIlilil = Math.max(this.liiIIlilil, tick);
         if (e instanceof IllIliIilllIliIi) {
            IllIliIilllIliIi var5 = (IllIliIilllIliIi)e;
            this.lIIlliIIll(var5.IliIlllilIi(), var5.liiiIIllIl(), tick);
         } else if (e instanceof iIIlIlilIlIlIlil) {
            iIIlIlilIlIlIlil var6 = (iIIlIlilIlIlIlil)e;
            this.iiIIlIIlIl(var6.IliIlllilIi(), var6.liiiIIllIl(), tick);
         } else if (e instanceof ilIiIiIiIiIiIiIi) {
            ilIiIiIiIiIiIiIi var7 = (ilIiIiIiIiIiIiIi)e;
            if (var7.IliIlllilIi() != selfId) {
               this.IIiIIlilil.put(var7.IliIlllilIi(), tick);
            }
         }

      }
   }

   int IIiIllIiIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : (IliIiiIilliIiiIi)this.IilIIlilil.get(cell.method_10063());
      return var2 != null && !var2.IIiIIIIlIi ? var2.illIIIIlIi : -1;
   }

   int IIiilIiiiIii(int enemyId) {
      liilIIiliiilIIil var2 = (liilIIiliiilIIil)this.lIiIIlilil.get(enemyId);
      return var2 == null ? 0 : var2.lllillIIil;
   }

   private void lIilliIill() {
      this.iliIIlilil = List.of();
      this.IiiIIlilil = IIIilIIiiIIi.IIIllllIIlll;
   }

   private void Ilillllill(String tail, class_2338 kind, String cell) {
      if (this.lliIIlilil < 32) {
         if (!this.IliIIlilil.isEmpty()) {
            this.IliIIlilil.append(' ');
         }

         this.IliIIlilil.append(tail).append(kind.method_10263()).append(',').append(kind.method_10264()).append(',').append(kind.method_10260()).append(cell);
         ++this.lliIIlilil;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlIilIlIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) + var5))))) << 3 | (char)(~((char)(-((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) + var5))))) >>> 13) ^ var5) + var5) ^ var5) ^ '숍') ^ var5))))))) ^ var5) - var5) ^ 280) - '迂'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   void IiIIlliIIl(class_2338 tick, IIllIlIilIllIlIi charges, int pos, long kind) {
      long var14 = -8561955938330829527L;
      if (tick != null && charges != null) {
         this.liiIIlilil = Math.max(this.liiIIlilil, kind);
         if (this.iiiIIlilil == null || !(class_243.method_24953(tick).method_1022(class_243.method_24953(this.iiiIIlilil)) > (double)12.0F)) {
            class_2338 var6 = tick.method_10062();
            long var7 = var6.method_10063();

            for(IliIiiIilliIiiIi var10 : this.IilIIlilil.values()) {
               var10.IiiIIIIlIi = true;
            }

            IliIiiIilliIiiIi var16 = (IliIiiIilliIiiIi)this.IilIIlilil.get(var7);
            if (charges == IIllIlIilIllIlIi.IlllIIIIIi) {
               if (var16 != null && !var16.IIiIIIIlIi) {
                  var14 ^= ((long)Math.max(0, pos) << 32 ^ var14) & -1L << 32;
                  if ((int)(var14 >>> 32) != var16.illIIIIlIi) {
                     if ((int)(var14 >>> 32) > var16.illIIIIlIi) {
                        var16.lilIIIIlIi = kind;
                     }

                     var16.illIIIIlIi = (int)(var14 >>> 32);
                     var16.iilIIIIlIi = kind;
                     if (!IIIillIIil(var16, kind)) {
                        this.Ilillllill(liIIiiiIIi<invokedynamic>(), var6, liIIiiiIIi<invokedynamic>() + (int)(var14 >>> 32));
                     }
                  }

               } else {
                  this.iIiIlIliIl(var6, Math.max(0, pos), kind, kind, true, this.liilliiill(var7, kind));
               }
            } else if (var16 != null && !var16.IIiIIIIlIi) {
               var16.IIiIIIIlIi = true;
               var16.lIiIIIIlIi = kind;
            } else {
               if (charges == IIllIlIilIllIlIi.llllIIIIIi || charges == IIllIlIilIllIlIi.illlIIIIIi) {
                  if (llIililIil(this.iilIIlilil, var7, kind)) {
                     return;
                  }

                  for(IliIiiIilliIiiIi var11 : this.IilIIlilil.values()) {
                     if (!var11.IIiIIIIlIi && !var11.iIiIIIIlIi && IiIilliIil(var11.IllIIIIlIi, var6)) {
                        long var12 = Math.max(var11.IilIIIIlIi, Math.max(var11.lilIIIIlIi, var11.iilIIIIlIi));
                        if (kind - var12 <= 3L) {
                           if (!var11.iliIIIIlIi.contains(var6) && var11.iliIIIIlIi.size() < 4) {
                              var11.iliIIIIlIi.add(var6);
                           }

                           this.Ilillllill(charges == IIllIlIilIllIlIi.llllIIIIIi ? liIIiiiIIi<invokedynamic>() : liIIiiiIIi<invokedynamic>(), var6, "");
                           break;
                        }
                     }
                  }
               }

            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIiIllIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] + var5) + var5))))) + '﹒') ^ '陮') + 25656) - var5)) + var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean IiIilliIil(class_2338 a, class_2338 b) {
      return !a.equals(b) && Math.abs(a.method_10263() - b.method_10263()) <= 1 && Math.abs(a.method_10264() - b.method_10264()) <= 1 && Math.abs(a.method_10260() - b.method_10260()) <= 1;
   }

   public void IilliliilIIi(long self, lliiilIiiliiilIi selfClosedFor, List<liiilIiliiiilIil> targetReadyIn, liiilIiliiiilIil tick, int target, int enemies) {
      long var12 = -3976332039684065081L;
      this.liiIIlilil = Math.max(this.liiIIlilil, self);
      class_310 var8 = class_310.method_1551();
      class_638 var9 = var8.field_1687;
      class_746 var10 = var8.field_1724;
      if (var9 != null && var10 != null && selfClosedFor != null && selfClosedFor.liiiIIllIl() != null && selfClosedFor.IilliliilIIi() != null) {
         if (var9 != this.iIIlIlilil) {
            this.Illlllllilll();
            this.iIIlIlilil = var9;
            this.liiIIlilil = self;
         }

         this.iiiIIlilil = class_2338.method_49638(selfClosedFor.liiiIIllIl());
         this.llIIlilIIl(self, targetReadyIn);
         this.ilIllIiIll(self);
         this.liIlliiIll(var9, self);
         var12 ^= ((long)(this.IlIllllIll(self) ? 10 : 2) << 32 ^ var12) & -1L << 32;
         if (this.IIIlIlilil == Long.MIN_VALUE || self - this.IIIlIlilil >= (long)((int)(var12 >>> 32)) || self < this.IIIlIlilil) {
            this.IIllllIlll(var9, self);
         }

         this.lIlIliIlIl(self);
         if (class_1937.field_25180.equals(((class_1937)var9).method_27983())) {
            this.lIilliIill();
         } else {
            this.iIlllIllll(var10, selfClosedFor, tick, target, enemies, self);
         }
      } else {
         this.lIilliIill();
      }
   }

   public IIIilIIiiIIi lIiiIiIlilli() {
      return this.IiiIIlilil;
   }

   // $FF: synthetic method
   private static CallSite liIIiiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5041363678757441871L ^ Long.rotateLeft(-2631908455395074899L, 62) ^ -581391317946062615L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7131386079114570017L ^ Long.rotateLeft(4053145156647637378L, 62) ^ -4502246491957693907L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2337006601284118027L ^ Long.rotateLeft(9010872972536009515L, 24) ^ 291632943582246755L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1365858949859677477L ^ Long.rotateLeft(8719311994422047932L, 39) ^ -8164087507887488057L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3086992527668316462L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2540185189663141998L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2901778639167457913L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7818691479609776155L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7916574427921732251L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6037005930410100796L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlIilIlIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIiIllIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lllIiillIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IilIililIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iilIiIIiIi<invokedynamic>());
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

   private void IIllllIlll(class_1937 world, long tick) {
      long var16 = -9187104542470335722L;
      long var18 = -3716819950288746608L;
      long var4 = this.IIIlIlilil;
      this.IIIlIlilil = tick;
      if (this.iiiIIlilil != null) {
         class_2338.class_2339 var6 = new class_2338.class_2339();

         for(var16 ^= (-12884901888L ^ var16) & -1L << 32; (int)(var16 >>> 32) <= 3; var16 += 4294967296L) {
            for(var16 ^= (-6L ^ var16) & -1L >>> 32; (int)var16 <= 6; var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32) {
               for(var18 ^= (-25769803776L ^ var18) & -1L << 32; (int)(var18 >>> 32) <= 6; var18 += 4294967296L) {
                  var6.method_10103(this.iiiIIlilil.method_10263() + (int)var16, this.iiiIIlilil.method_10264() + (int)(var16 >>> 32), this.iiiIIlilil.method_10260() + (int)(var18 >>> 32));
                  class_2680 var10 = world.method_8320(var6);
                  if (var10.method_27852(class_2246.field_23152)) {
                     long var11 = var6.method_10063();
                     IliIiiIilliIiiIi var13 = (IliIiiIilliIiiIi)this.IilIIlilil.get(var11);
                     if (var13 == null || var13.IIiIIIIlIi) {
                        if (var13 != null) {
                           this.IilIIlilil.remove(var11);
                        }

                        long var14 = var4 != Long.MIN_VALUE && var4 < tick ? var4 + 1L : tick - 4L - 1L;
                        this.iIiIlIliIl(var6.method_10062(), (Integer)var10.method_11654(class_4969.field_23153), tick, var14, false, this.liilliiill(var11, tick));
                     }
                  }
               }
            }
         }

      }
   }

   static int Iiilliiliiil(boolean eyeToBox, double holdsGlowstone, boolean charged) {
      if (!Double.isNaN(holdsGlowstone) && !Double.isInfinite(holdsGlowstone)) {
         long var4 = holdsGlowstone <= (double)4.5F ? 0L : (long)Math.ceil((holdsGlowstone - (double)4.5F) / 0.28);
         long var6 = (eyeToBox ? 1L : 2L + (charged ? 0L : 1L)) + var4;
         return (int)Math.min(99L, var6);
      } else {
         return 99;
      }
   }

   public void liiiIIllIl(class_2338 cell, long tick) {
      if (cell != null) {
         long var4 = cell.method_10063();
         this.lilIIlilil.put(var4, tick + 200L);
         IliIiiIilliIiiIi var6 = (IliIiiIilliIiiIi)this.IilIIlilil.get(var4);
         if (var6 != null && !var6.IIiIIIIlIi) {
            if (!var6.iIiIIIIlIi && tick >= var6.IilIIIIlIi && tick - var6.IilIIIIlIi <= 2L) {
               this.IiiIlliiIl(var6);
               var6.lllIIIIlIi = -1;
               if (this.IlIlIlilil > 0) {
                  --this.IlIlIlilil;
               }
            }

            var6.iIiIIIIlIi = true;
            var6.lliIIIIlIi = tick;
         }

         this.iilllIIill(cell);
      }
   }

   private void ilIllIiIll(long tick) {
      this.lilIIlilil.values().removeIf((until) -> until < tick);
      this.iilIIlilil.values().removeIf((until) -> until < tick);
   }

   boolean iIIilIlIil(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : (IliIiiIilliIiiIi)this.IilIIlilil.get(cell.method_10063());
      return var2 != null && !var2.IIiIIIIlIi && var2.iIiIIIIlIi;
   }

   private void IiiIlliiIl(IliIiiIilliIiiIi t) {
      if (t.IliIIIIlIi) {
         t.IliIIIIlIi = false;
         liilIIiliiilIIil var2 = t.lllIIIIlIi == -1 ? null : (liilIIiliiilIIil)this.lIiIIlilil.get(t.lllIIIIlIi);
         if (var2 != null && var2.IllillIIil > 0) {
            --var2.IllillIIil;
         }

      }
   }

   public void iIlIlllllill(class_2338 cell, long tick) {
      if (cell != null) {
         class_2338 var4 = cell.method_10062();
         this.iilIIlilil.put(var4.method_10063(), tick + 200L);

         for(IliIiiIilliIiiIi var6 : this.IilIIlilil.values()) {
            var6.iliIIIIlIi.remove(var4);
         }

      }
   }

   public boolean IIIllIIliIIl(int enemyId) {
      if (enemyId == -1) {
         return false;
      } else {
         for(IliIiiIilliIiiIi var3 : this.IilIIlilil.values()) {
            if (!var3.IIiIIIIlIi && var3.lllIIIIlIi == enemyId && !IIIillIIil(var3, this.liiIIlilil) && (iiIilIIlil(this.liiIIlilil, var3.IilIIIIlIi, 4) || iiIilIIlil(this.liiIIlilil, var3.lilIIIIlIi, 4))) {
               return true;
            }
         }

         liilIIiliiilIIil var5 = (liilIIiliiilIIil)this.lIiIIlilil.get(enemyId);
         if (var5 != null && var5.liIillIIil && var5.llIillIIil != null && (var5.ilIillIIil == iIIiIIliIlIiIIli.liililIlIi || var5.ilIillIIil == iIIiIIliIlIiIIli.iiililIlIi)) {
            for(IliIiiIilliIiiIi var4 : this.IilIIlilil.values()) {
               if (!var4.IIiIIIIlIi && (var4.illIIIIlIi == 0 || var4.lllIIIIlIi == -1) && iIIIlIlIIl(var5.llIillIIil, var4.IllIIIIlIi) <= (double)4.5F) {
                  return true;
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }

   private long liilliiill(long tick, long key) {
      Long var5 = (Long)this.lilIIlilil.get(tick);
      return var5 != null && var5 >= key ? var5 - 200L : Long.MIN_VALUE;
   }

   static boolean Iiiiliiiiiii(class_2338 boomCenters, long removedTick, List<class_243> cell, List<Long> boomTicks) {
      long var10 = -6457205831858836843L;
      if (boomCenters != null && cell != null && boomTicks != null) {
         class_243 var5 = class_243.method_24953(boomCenters);

         for(long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < cell.size() && (int)(var12 >>> 32) < boomTicks.size(); var12 += 4294967296L) {
            class_243 var7 = (class_243)cell.get((int)(var12 >>> 32));
            long var8 = (Long)boomTicks.get((int)(var12 >>> 32));
            if (var7 != null && Math.abs(var8 - removedTick) <= 1L && var7.method_1022(var5) <= (double)1.5F) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public List<IIIilIIiiIIi> iliIiiliiiii() {
      return this.iliIIlilil;
   }

   void iiIIlIIlIl(class_243 center, float radius, long tick) {
      if (center != null && IIIIllIIIl(radius)) {
         this.iIiIIlilil.addLast(new IIIiiIllIIiiIl(center, tick));

         while(this.iIiIIlilil.size() > 16) {
            this.iIiIIlilil.removeFirst();
         }

      }
   }

   static int Iliilliiilii(class_2338 tick, long cands, List<llIiliIiilIiliIi> cell) {
      long var15 = 2411947191726365970L;
      if (tick != null && cell != null) {
         class_243 var4 = class_243.method_24953(tick);
         var15 ^= (-4294967296L ^ var15) & -1L << 32;
         double var6 = Double.MAX_VALUE;
         var15 ^= ~var15 & -1L >>> 32;
         double var9 = Double.MAX_VALUE;

         for(llIiliIiilIiliIi var12 : cell) {
            if (var12 != null && var12.liiiIIllIl() != null) {
               double var13 = var12.liiiIIllIl().method_1022(var4);
               if (var12.iIlIlllllill() != Long.MIN_VALUE && cands >= var12.iIlIlllllill() && cands - var12.iIlIlllllill() <= 3L && var13 <= (double)5.5F && var13 < var6) {
                  var6 = var13;
                  var15 ^= ((long)var12.IliIlllilIi() << 32 ^ var15) & -1L << 32;
               }

               if (var13 <= (double)6.0F && var13 < var9) {
                  var9 = var13;
                  var15 ^= ((long)var12.IliIlllilIi() ^ var15) & -1L >>> 32;
               }
            }
         }

         return (int)(var15 >>> 32) != -1 ? (int)(var15 >>> 32) : (int)var15;
      } else {
         return -1;
      }
   }

   static double IIlilIliiIli(double detLag, long lag) {
      return Double.isNaN(detLag) ? (double)lag : detLag + (double)0.5F * ((double)lag - detLag);
   }

   float Ililllililil(class_2338 cell) {
      if (cell == null) {
         return Float.NaN;
      } else {
         IliIiiIilliIiiIi var2 = (IliIiiIilliIiiIi)this.IilIIlilil.get(cell.method_10063());
         return var2 != null && !var2.IIiIIIIlIi ? var2.IlIlIIIlIi : Float.NaN;
      }
   }

   static boolean IIIIllIIIl(float radius) {
      return Math.abs(radius - 5.0F) <= 0.05F;
   }

   // $FF: synthetic method
   private static CallSite lllIiillIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - 'ꮨ') + 'ￕ'))) ^ var5) - 'ꤚ') << 4 | (char)((char)((char)(~((char)((char)(var4[var5] - 'ꮨ') + 'ￕ'))) ^ var5) - 'ꤚ') >>> 12))) - 'ꡋ'))) - 24261))) ^ '\ue8d8') + var5))) >>> 14 | (char)(~((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - 'ꮨ') + 'ￕ'))) ^ var5) - 'ꤚ') << 4 | (char)((char)((char)(~((char)((char)(var4[var5] - 'ꮨ') + 'ￕ'))) ^ var5) - 'ꤚ') >>> 12))) - 'ꡋ'))) - 24261))) ^ '\ue8d8') + var5))) << 2))) ^ 17344) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean llIililIil(Map<Long, Long> own, long key, long tick) {
      Long var5 = (Long)own.get(key);
      return var5 != null && var5 >= tick;
   }

   double Illillliilli(int enemyId) {
      liilIIiliiilIIil var2 = (liilIIiliiilIIil)this.lIiIIlilil.get(enemyId);
      return var2 == null ? Double.NaN : var2.iIlillIIil;
   }

   private List<llIiliIiilIiliIi> iiiIlIIIll() {
      ArrayList var1 = new ArrayList(this.lIiIIlilil.size());

      for(liilIIiliiilIIil var3 : this.lIiIIlilil.values()) {
         if (var3.liIillIIil && var3.llIillIIil != null) {
            Long var4 = (Long)this.IIiIIlilil.get(var3.IlIillIIil);
            var1.add(new llIiliIiilIiliIi(var3.IlIillIIil, var3.llIillIIil, var4 == null ? Long.MIN_VALUE : var4));
         }
      }

      return var1;
   }

   int illIlIilIl(class_2338 cell) {
      IliIiiIilliIiiIi var2 = cell == null ? null : (IliIiiIilliIiiIi)this.IilIIlilil.get(cell.method_10063());
      return var2 == null ? -1 : var2.lllIIIIlIi;
   }

   static int IlIillIiilIi(int detLag, boolean detonated, boolean charged, int eta, double age, long inReach) {
      long var9 = 5297702076926365884L;
      if (!detonated && charged && eta >= 2 && Double.isFinite(age)) {
         var9 ^= ((long)((int)Math.round(age) - (int)Math.min(99L, Math.max(0L, inReach))) << 32 ^ var9) & -1L << 32;
         return Math.min(detLag, Math.max(1, (int)(var9 >>> 32)));
      } else {
         return detLag;
      }
   }

   private static boolean iiIilIIlil(long tick, long at, int window) {
      return at != Long.MIN_VALUE && tick != Long.MIN_VALUE && tick >= at && tick - at <= (long)window;
   }

   private boolean Iillllilll(IliIiiIilliIiiIi feet, class_243 t, class_243 tick, int himPos, long targetId) {
      if (!feet.IiiIIIIlIi && !Float.isNaN(feet.iIIlIIIlIi) && feet.liiIIIIlIi != Long.MIN_VALUE && targetId - feet.liiIIIIlIi < 4L && targetId >= feet.liiIIIIlIi) {
         if (feet.iiiIIIIlIi != null && !(feet.iiiIIIIlIi.method_1022(t) > 0.3)) {
            if (feet.lIIlIIIlIi != himPos) {
               return true;
            } else {
               return tick != null && (feet.IIIlIIIlIi == null || feet.IIIlIIIlIi.method_1022(tick) > 0.3);
            }
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   static double iIIIlIlIIl(class_243 eye, class_2338 cell) {
      if (eye != null && cell != null) {
         double var2 = Math.max(Math.max((double)cell.method_10263() - eye.field_1352, (double)0.0F), eye.field_1352 - ((double)cell.method_10263() + (double)1.0F));
         double var4 = Math.max(Math.max((double)cell.method_10264() - eye.field_1351, (double)0.0F), eye.field_1351 - ((double)cell.method_10264() + (double)1.0F));
         double var6 = Math.max(Math.max((double)cell.method_10260() - eye.field_1350, (double)0.0F), eye.field_1350 - ((double)cell.method_10260() + (double)1.0F));
         return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
      } else {
         return Double.POSITIVE_INFINITY;
      }
   }
}
