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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1657;
import net.minecraft.class_1764;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3489;
import net.minecraft.class_638;
import net.minecraft.class_746;
import net.minecraft.class_9334;

public final class IIIIillllIIIilll {
   public static final int IilliiIill = 3;
   public static final double lllliiIill = (double)5.0F;
   public static final int IllliiIill = 28;
   private List<liiilIiliiiilIil> liiliiIill = List.of();
   public static final float illIiiIill = 0.6F;
   public static final int IIIliiIill = 25;
   public static final float iliIiiIill = 5.0F;
   public static final float ilIliiIill = 4.0F;
   public static final float IiiIiiIill = 6.0F;
   public static final float iIiliiIill = 10.0F;
   public static final int lIiIiiIill = 100;
   public static final double iiIliiIill = (double)6.0F;
   public static final float lliIiiIill = 20.0F;
   public static final int iIlliiIill = 60;
   public static final int lilliiIill = 4;
   public static final float liIliiIill = 8.0F;
   private final ArrayDeque<iIiiIlIiIliiIlIi> IIIiiiIill = new ArrayDeque();
   private final ArrayDeque<iIIliIlIli> iIIiiiIill = new ArrayDeque();
   private class_1937 IIliiiIill;
   public static final float iIiIiiIill = 1.0F;
   public static final float llIliiIill = 40.0F;
   public static final double lIlliiIill = (double)6.0F;
   public static final int[] IiIIiiIill = new int[]{2, 4, 6};
   private final Map<Integer, liiilIiliiiilIil> IiiliiIill = new HashMap();
   private llIIIlilIIIl iiIiiiIill;
   public static final int lIIliiIill = 900;
   public static final float iIIliiIill = 20.0F;
   private double llIiiiIill = Double.POSITIVE_INFINITY;
   public static final float IilIiiIill = 1.4F;
   private static final class_1304[] lliliiIill;
   public static final double iiiIiiIill = (double)6.0F;
   public static final int IliIiiIill = 2;
   public static final float IllIiiIill = 1024.0F;
   private final Map<Integer, liIlIIliiiIlIIli> ililiiIill = new HashMap();
   private int IiIiiiIill = -1;
   public static final int IliliiIill = -2;
   public static final int iiIIiiIill = 40;
   private Predicate<class_2338> IlIiiiIill;
   public static final int iilIiiIill = 2;
   private final Map<Integer, iIiiIlIiIliiIlIi> iiiliiIill = new HashMap();
   public static final float lilIiiIill = 0.5F;
   public static final long lIlIiiIill = 6000L;
   public static final float IlIliiIill = 1.0F;
   public static final int IIlIiiIill = 2;
   public static final float liiIiiIill = 0.01F;
   public static final int IIiliiIill = 8;
   public static final float lllIiiIill = 0.3F;
   public static final int lIiliiIill = 64;
   public static final int liIIiiIill = 4;
   public static final float IiIliiIill = 16.0F;
   public static final int iilliiIill = 200;
   public static final int IIiIiiIill = 6;
   public static final int illliiIill = 4;
   public static final int iIlIiiIill = 3;
   public static final int ilIIiiIill = 32;
   public static final double IIlliiIill = (double)0.5F;
   private int ilIiiiIill;
   private final ArrayDeque<llIIlilIIl> lIIiiiIill = new ArrayDeque();
   private ilIliliIiIlili liIiiiIill;

   // $FF: synthetic method
   private static CallSite llIililIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] ^ 32665) << 4 | (char)(var4[var5] ^ 32665) >>> 12) >>> 10 | (char)((char)(var4[var5] ^ 32665) << 4 | (char)(var4[var5] ^ 32665) >>> 12) << 6))) ^ var5) ^ 28330) + '뽖'))))) - 26845))) ^ var5) + 22811) + '츕') ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static double Ililllililil(liIlIIliiiIlIIli t) {
      if (t.lilIllIlIi != null && t.lIIlllIlIi && !Float.isNaN(t.iIIlllIlIi)) {
         float var1 = t.lilIllIlIi.method_6032() + t.lilIllIlIi.method_6067();
         return (double)Iilllilliill(t.iIIlllIlIi, var1, 20.0F, IIlllIlliIll(t));
      } else {
         return Double.NaN;
      }
   }

   static iIIiIIliIlIiIIli IIllllIlll(class_1799 s) {
      if (s != null && !s.method_7960()) {
         if (s.method_31574(class_1802.field_8301)) {
            return iIIiIIliIlIiIIli.ilililIlIi;
         } else if (s.method_31574(class_1802.field_8281)) {
            return iIIiIIliIlIiIIli.IiililIlIi;
         } else if (s.method_31574(class_1802.field_23141)) {
            return iIIiIIliIlIiIIli.liililIlIi;
         } else if (s.method_31574(class_1802.field_8801)) {
            return iIIiIIliIlIiIIli.iiililIlIi;
         } else if (s.method_31574(class_1802.field_8288)) {
            return iIIiIIliIlIiIIli.liIiilIlIi;
         } else if (s.method_31574(class_1802.field_8634)) {
            return iIIiIIliIlIiIIli.IlIiilIlIi;
         } else if (s.method_31574(class_1802.field_8255)) {
            return iIIiIIliIlIiIIli.iiIiilIlIi;
         } else if (!s.method_31574(class_1802.field_8463) && !s.method_31574(class_1802.field_8367)) {
            if (lIlllIliIlllIl.IliIlllilIi(s)) {
               return iIIiIIliIlIiIIli.iIIiilIlIi;
            } else if (lIlllIliIlllIl.iIlIlllllill(s)) {
               return iIIiIIliIlIiIIli.IIIiilIlIi;
            } else if (s.method_31573(class_3489.field_42612)) {
               return iIIiIIliIlIiIIli.lIIiilIlIi;
            } else if (!s.method_31574(class_1802.field_8102) && !(s.method_7909() instanceof class_1764)) {
               return s.method_57826(class_9334.field_50075) ? iIIiIIliIlIiIIli.ilIiilIlIi : iIIiIIliIlIiIIli.IIliilIlIi;
            } else {
               return iIIiIIliIlIiIIli.IiIiilIlIi;
            }
         } else {
            return iIIiIIliIlIiIIli.llIiilIlIi;
         }
      } else {
         return iIIiIIliIlIiIIli.lIliilIlIi;
      }
   }

   private void lilIliilIl(iIIIiilIlIIiil spawn, long tick) {
      long var14 = 1108877719436160115L;
      class_243 var4 = new class_243(spawn.iIlIlllllill(), spawn.IilliliilIIi(), spawn.lIiiIiIlilli());
      class_2338 var5 = class_2338.method_49637(spawn.iIlIlllllill(), spawn.IilliliilIIi() - (double)0.5F, spawn.lIiiIiIlilli());
      var14 ^= (Long.MIN_VALUE ^ var14) & -1L << 32;
      if (this.IlIiiiIill != null && this.IlIiiiIill.test(var5)) {
         var14 ^= (-8589934592L ^ var14) & -1L << 32;
      } else {
         liIlIIliiiIlIIli var7 = null;
         double var8 = (double)5.0F;

         for(liIlIIliiiIlIIli var11 : this.ililiiIill.values()) {
            if (var11.lilIllIlIi != null && var11.IiilllIlIi && var11.llIillIlIi != null && (this.IlIiiiIill != null || var11.llIillIlIi.IIiilIiiiIii() == iIIiIIliIlIiIIli.ilililIlIi || var11.llIillIlIi.Iliilliiilii() == iIIiIIliIlIiIIli.ilililIlIi)) {
               double var12 = var11.lilIllIlIi.method_33571().method_1022(var4);
               if (var12 <= var8) {
                  var8 = var12;
                  var7 = var11;
               }
            }
         }

         if (var7 != null) {
            var14 ^= ((long)var7.IilIllIlIi << 32 ^ var14) & -1L << 32;
         }
      }

      if ((int)(var14 >>> 32) != Integer.MIN_VALUE) {
         this.iiiliiIill.put(spawn.IliIlllilIi(), new iIiiIlIiIliiIlIi(spawn.IliIlllilIi(), var4, (int)(var14 >>> 32), tick));

         while(this.iiiliiIill.size() > 256) {
            Iterator var16 = this.iiiliiIill.keySet().iterator();
            var16.next();
            var16.remove();
         }

         if ((int)(var14 >>> 32) >= 0) {
            liIlIIliiiIlIIli var17 = (liIlIIliiiIlIIli)this.ililiiIill.get((int)(var14 >>> 32));
            if (var17 != null) {
               var17.lIiIllIlIi.iliIiiliiiii(spawn.IliIlllilIi(), tick);
            }
         }

      }
   }

   public void IlIillIiilIi(Predicate<class_2338> placedByUs) {
      this.IlIiiiIill = placedByUs;
   }

   public int iIIIlIlIIl() {
      return this.ilIiiiIill;
   }

   public void IilliliilIIi(int tick, long targetId, float predictedScaled) {
      liIlIIliiiIlIIli var5 = (liIlIIliiiIlIIli)this.ililiiIill.get(tick);
      if (var5 != null) {
         var5.iiIlllIlIi = lIiiIiIlilli(var5.iiIlllIlIi, illIllilIilIllil.Iilllilliill(tick), predictedScaled);
      }
   }

   static int IiiIlliiIl(lliiilIiiliiilIi self) {
      long var6 = -7424735399688221000L;
      long var8 = -150743412333902676L;
      if (self == null) {
         return -99;
      } else {
         var6 ^= ((long)self.IIIIllIIIl() << 32 ^ var6) & -1L << 32;
         if ((int)(var6 >>> 32) == Integer.MAX_VALUE) {
            return -99;
         } else {
            double var2 = Double.isFinite(self.IIiIllIiIl()) ? Math.max((double)0.0F, self.IIiIllIiIl()) : (double)0.0F;
            var6 ^= ((long)lIiiililiIiiilil.liiiIIllIl((int)(var6 >>> 32), var2) ^ var6) & -1L >>> 32;
            if ((int)var6 > 0) {
               return (int)var6;
            } else {
               var8 ^= ((long)((int)Math.floor((double)10.0F - var2 / (double)50.0F) - 1) << 32 ^ var8) & -1L << 32;
               return -Math.max(0, (int)(var6 >>> 32) - (int)(var8 >>> 32));
            }
         }
      }
   }

   public void iIlIlllllill(int targetId, long predictedScaled, float predictedDamage, float tick) {
      long var9 = -4058421025178813019L;
      liIlIIliiiIlIIli var6 = (liIlIIliiiIlIIli)this.ililiiIill.get(targetId);
      if (var6 != null) {
         var9 ^= ((long)((int)Math.ceil(Math.max((double)0.0F, (double)illIllilIilIllil.IIIllIIliIIl()) / (double)50.0F)) << 32 ^ var9) & -1L << 32;
         float var8 = var6.lilIllIlIi == null ? Float.NaN : var6.lilIllIlIi.method_6032() + var6.lilIllIlIi.method_6067();
         var6.IIilllIlIi.addLast(new lIlillIliIlillIl(predictedScaled, predictedDamage, tick, var8, predictedScaled + (long)((int)(var9 >>> 32)) + 3L));

         while(var6.IIilllIlIi.size() > 8) {
            var6.IIilllIlIi.removeFirst();
         }

      }
   }

   private void IiIIlliIIl() {
      this.ililiiIill.clear();
      this.IiiliiIill.clear();
      this.liiliiIill = List.of();
      this.iiiliiIill.clear();
      this.IIIiiiIill.clear();
      this.lIIiiiIill.clear();
      this.iIIiiiIill.clear();
      this.llIiiiIill = Double.POSITIVE_INFINITY;
      if (this.iiIiiiIill != null) {
         this.iiIiiiIill.lIiiIiIlilli();
      }

   }

   private void iiiIlIIIll(long tick) {
      for(liIlIIliiiIlIIli var4 : this.ililiiIill.values()) {
         if (var4.lilIllIlIi != null && var4.IiilllIlIi && (var4.lilIllIlIi.method_29504() || var4.lilIllIlIi.method_6032() <= 0.0F)) {
            var4.IiilllIlIi = false;
            if (var4.lIllllIlIi != Long.MIN_VALUE && tick - var4.lIllllIlIi <= 60L) {
               ++this.ilIiiiIill;
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite IIIillIIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) - var5) ^ '雕') ^ 14481) ^ '\uaad7'))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) - var5) ^ '雕') ^ 14481) ^ '\uaad7'))) >>> 5) + 22668) - var5) + '냞'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private float IIIllIIliIIl(IIlilIIllIlilIIl f, liIlIIliiiIlIIli tick, long t) {
      float var5 = Illlllllilll(f.lIiiIiIlilli(), () -> Ililllililil(tick), () -> this.Iiilliiliiil(f, tick));
      tick.IlllllIlIi = Long.MIN_VALUE;
      if (var5 == Float.MAX_VALUE && IlIlllIlilIl(f.lIiiIiIlilli()) && tick.lIIlllIlIi && !Float.isNaN(tick.iIIlllIlIi)) {
         tick.IlllllIlIi = t;
         tick.llllllIlIi = tick.iIIlllIlIi;
      }

      return var5;
   }

   public void llIIlilIIl() {
      this.IiIIlliIIl();
      this.ilIiiiIill = 0;
      this.IiIiiiIill = -1;
      this.liIiiiIill = null;
      this.iiIiiiIill = null;
      this.IIliiiIill = null;
   }

   static class_243 liIlliiIll(class_1309 e) {
      return e.method_66233() != null && e.method_66233().method_66270() ? e.method_66233().method_66265() : e.method_73189();
   }

   private void lIlIliIlIl(liIlIIliiiIlIIli tick, long t) {
      if (tick.lillllIlIi == class_1802.field_8367) {
         tick.illlllIlIi = t + 6000L;
         tick.iiiIllIlIi = iIlllIllll(Math.max(tick.iiiIllIlIi, Math.min(20.0F, tick.iiiIllIlIi) + 16.0F), 1.0F, 40.0F);
      } else if (tick.lillllIlIi == class_1802.field_8463) {
         tick.iiiIllIlIi = iIlllIllll(Math.max(tick.iiiIllIlIi, Math.min(20.0F, tick.iiiIllIlIi) + 4.0F), 1.0F, 40.0F);
      }

   }

   private double Iiilliiliiil(IIlilIIllIlilIIl t, liIlIIliiiIlIIli f) {
      if (f.lilIllIlIi == null) {
         return Double.NaN;
      } else {
         class_243 var3 = t.IilliliilIIi();
         if (var3 == null) {
            iIiiIlIiIliiIlIi var4 = (iIiiIlIiIliiIlIi)this.iiiliiIill.get(t.iIlIlllllill());
            if (var4 == null) {
               for(iIiiIlIiIliiIlIi var6 : this.IIIiiiIill) {
                  if (var6.IliIlllilIi() == t.iIlIlllllill()) {
                     var4 = var6;
                  }
               }
            }

            var3 = var4 == null ? null : var4.liiiIIllIl();
         }

         return var3 == null ? Double.NaN : (double)lllIliIlillIliIl.IlIllllIll(f.lilIllIlIi, var3, f.lilIllIlIi.method_73189(), f.lilIllIlIi.method_5829(), (class_2338)null, (class_2338)null, 6.0F);
      }
   }

   public IiIIIlliIIIl IIIIllIIIl(int id) {
      return this.liIiiiIill != null && id == this.IiIiiiIill ? this.liIiiiIill.IilliliilIIi() : null;
   }

   // $FF: synthetic method
   private static CallSite ilillIiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') >>> 3 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') << 13) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') >>> 3 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') << 13) >>> 13))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') >>> 3 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') << 13) << 3 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') >>> 3 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) >>> 7 | (char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') << 9 | (char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) >>> 14 | (char)(var4[var5] << 14 | var4[var5] >>> 2) << 2) - '컭') >>> 7) << 9) ^ 13653) - 4361))) + var5))) + var5) ^ '莈') ^ '螨') << 13) >>> 13))) >>> 2) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIIilIIiiIIi(class_243 tick, long center) {
      if (tick != null) {
         this.iIIiiiIill.addLast(new iIIliIlIli(tick, center));

         while(this.iIIiiiIill.size() > 64) {
            this.iIIiiiIill.removeFirst();
         }

      }
   }

   public void IiIiliIiiiIi(int profile, ilIliliIiIlili id) {
      if (profile != this.IiIiiiIill || id != this.liIiiiIill) {
         this.iiIiiiIill = id == null ? null : new llIIIlilIIIl(32);
      }

      this.IiIiiiIill = id == null ? -1 : profile;
      this.liIiiiIill = id;
   }

   private static int IIlllIlliIll(liIlIIliiiIlIIli t) {
      return t.llIillIlIi != null && t.llIillIlIi.IlIillIiilIi() != null ? t.llIillIlIi.IlIillIiilIi().iIlIlllllill() : -1;
   }

   static boolean IlIlllIlilIl(String type) {
      return Ilillllill<invokedynamic>().equals(type) || Ilillllill<invokedynamic>().equals(type);
   }

   private void lIIlliIIll(long tick) {
      this.ililiiIill.values().removeIf((t) -> t.IlilllIlIi != Long.MIN_VALUE && tick - t.IlilllIlIi > 200L && t.IilIllIlIi != this.IiIiiiIill);
   }

   private static float iIlllIllll(float lo, float v, float hi) {
      return lo < v ? v : Math.min(lo, hi);
   }

   private void illIlIilIl(liIlIIliiiIlIIli serverPos, long t, class_243 hole, boolean onGround, IlillIllllillIll tick) {
      long var17 = 3750029961404232539L;
      long var19 = 3226561764591679037L;
      long var21 = -3003908682697796692L;
      long var23 = -9144145457012855494L;
      IiIIIlliIIIl var7 = this.liIiiiIill.IilliliilIIi();
      if (onGround) {
         this.liIiiiIill.lIiiIiIlilli().lIiiIiIlilli(tick != null && tick.liiiIIllIl() != iiIIiilIIlIiil.IliIliIlilliIliIli && tick.iIlIlllllill() == 0);
      }

      class_243 var8 = serverPos.IIiIllIlIi.Illlllllilll();
      if (this.iiIiiiIill != null) {
         this.iiIiiiIill.liiiIIllIl(t, hole.field_1352, hole.field_1350, var7);
         if (onGround) {
            double var9 = var7.lIiiIiIlilli();
            int[] var11 = IiIIiiIill;
            var17 ^= ((long)var11.length << 32 ^ var17) & -1L << 32;

            for(var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < (int)(var17 >>> 32); var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
               var19 ^= ((long)var11[(int)var17] << 32 ^ var19) & -1L << 32;
               this.iiIiiiIill.IliIlllilIi(t, (int)(var19 >>> 32), hole.field_1352 + var8.field_1352 * (double)((int)(var19 >>> 32)) * var9, hole.field_1350 + var8.field_1350 * (double)((int)(var19 >>> 32)) * var9, var8.field_1352, var8.field_1350);
            }
         }
      }

      var19 ^= ((long)serverPos.iIIillIlIi ^ var19) & -1L >>> 32;
      serverPos.liilllIlIi[(int)var19] = hole;
      serverPos.iiilllIlIi[(int)var19] = Math.hypot(var8.field_1352, var8.field_1350);
      serverPos.IIIillIlIi[(int)var19] = onGround;
      serverPos.iIIillIlIi = ((int)var19 + 1) % serverPos.liilllIlIi.length;
      if (serverPos.lIIillIlIi < serverPos.liilllIlIi.length) {
         ++serverPos.lIIillIlIi;
      }

      if (serverPos.lIIillIlIi == serverPos.liilllIlIi.length && (serverPos.IlIillIlIi == Long.MIN_VALUE || t - serverPos.IlIillIlIi >= 4L)) {
         var21 ^= ((long)serverPos.iIIillIlIi << 32 ^ var21) & -1L << 32;
         var21 ^= (1L ^ var21) & -1L >>> 32;
         boolean[] var12 = serverPos.IIIillIlIi;
         var17 ^= ((long)var12.length ^ var17) & -1L >>> 32;

         for(long var29 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var29 >>> 32) < (int)var17; var29 += 4294967296L) {
            var23 ^= ((long)var12[(int)(var29 >>> 32)] << 32 ^ var23) & -1L << 32;
            var21 ^= ((long)((int)var21 & (int)(var23 >>> 32)) ^ var21) & -1L >>> 32;
         }

         if ((int)var21 != 0) {
            class_243 var25 = serverPos.liilllIlIi[(int)(var21 >>> 32)];
            double var13 = Math.hypot(hole.field_1352 - var25.field_1352, hole.field_1350 - var25.field_1350);
            double var15 = serverPos.iiilllIlIi[(int)(var21 >>> 32)] * (double)4.0F;
            var7.IilliliilIIi(var15, var13);
            serverPos.IlIillIlIi = t;
         }
      }

   }

   private liiilIiliiiilIil iiIIlIIlIl(liIlIIliiiIlIIli selfPos, class_1309 serverPos, long loopTicks, class_243 dist, class_243 le, class_243 tick, double selfEye, int world, class_1937 t) {
      long var35 = -3816539966642936273L;
      long var37 = 8541076750813511923L;
      long var39 = 8327296190182431448L;
      long var41 = 5660051637462173394L;
      selfPos.iilIllIlIi = serverPos.method_5477().getString();
      class_243 var12 = serverPos.method_73189();
      class_243 var13 = serverPos.method_33571();
      var35 ^= ((long)serverPos.method_24828() << 32 ^ var35) & -1L << 32;
      class_243 var15 = new class_243(dist.field_1352 - tick.field_1352, (double)0.0F, dist.field_1350 - tick.field_1350);
      selfPos.IIiIllIlIi.IliIlllilIi(tick, (boolean)((int)(var35 >>> 32)), var15);
      float var16 = serverPos.method_6032();
      float var17 = serverPos.method_6067();
      if (!Float.isFinite(var16) || !Float.isFinite(var17) || var16 < 0.0F || var16 > 1024.0F || var17 < 0.0F || var17 > 1024.0F) {
         selfPos.lIIlllIlIi = false;
      }

      float var18 = var16 + var17;
      if (!Float.isNaN(selfPos.iIIlllIlIi) && Math.abs(var18 - selfPos.iIIlllIlIi) > 0.001F) {
         selfPos.IlIlllIlIi = 0;
      }

      this.IiIlliIliiIl(selfPos, loopTicks, var18);
      selfPos.iIIlllIlIi = var18;
      if (selfPos.ilIlllIlIi != Long.MIN_VALUE && loopTicks >= selfPos.ilIlllIlIi) {
         float var19 = selfPos.IiIlllIlIi - var18;
         if (Math.abs(var19) <= 0.001F) {
            ++selfPos.IlIlllIlIi;
            if (selfPos.IlIlllIlIi >= 3) {
               selfPos.lIIlllIlIi = false;
            }
         } else if (selfPos.lIIlllIlIi && selfPos.liIlllIlIi >= 0.5F && var19 > 0.0F) {
            float var20 = var19 / selfPos.liIlllIlIi;
            selfPos.llIlllIlIi = iIlllIllll(selfPos.llIlllIlIi + 0.3F * (var20 - selfPos.llIlllIlIi), 0.6F, 1.4F);
         }

         selfPos.ilIlllIlIi = Long.MIN_VALUE;
      }

      if (selfPos.iliIllIlIi != Long.MIN_VALUE && loopTicks - selfPos.iliIllIlIi <= 900L) {
         if (selfPos.IIIlllIlIi == Long.MIN_VALUE) {
            selfPos.IIIlllIlIi = loopTicks;
         }

         while(loopTicks - selfPos.IIIlllIlIi >= 25L) {
            selfPos.IIIlllIlIi += 25L;
            selfPos.iiiIllIlIi = iIlllIllll(selfPos.iiiIllIlIi + 1.0F, 1.0F, 40.0F);
         }
      }

      var35 ^= ((long)serverPos.method_6115() ^ var35) & -1L >>> 32;
      class_1799 var43 = (int)var35 != 0 ? serverPos.method_6030() : class_1799.field_8037;
      var37 ^= ((long)((int)var35 != 0 && var43.method_57826(class_9334.field_50075) ? 1 : 0) << 32 ^ var37) & -1L << 32;
      if ((int)var35 != 0) {
         class_1792 var22 = var43.method_7909();
         if (selfPos.IillllIlIi && var22 == selfPos.lillllIlIi) {
            ++selfPos.iillllIlIi;
         } else {
            selfPos.lillllIlIi = var22;
            selfPos.iillllIlIi = 1;
         }
      } else if (selfPos.IillllIlIi) {
         if (selfPos.iillllIlIi >= 28) {
            this.lIlIliIlIl(selfPos, loopTicks);
         }

         selfPos.iillllIlIi = 0;
         selfPos.lillllIlIi = null;
      }

      selfPos.IillllIlIi = (boolean)((int)var35);
      iiIllIlIIlllIl var44 = lllIliIlillIliIl.iiiIlIIIll(serverPos);
      if (selfPos.illlllIlIi != Long.MIN_VALUE && loopTicks < selfPos.illlllIlIi) {
         var44 = new iiIllIlIIlllIl(var44.IliIlllilIi(), var44.liiiIIllIl(), Math.max(var44.iIlIlllllill(), 0), var44.IilliliilIIi(), var44.lIiiIiIlilli());
      }

      float var23 = lllIliIlillIliIl.iIiIlIliIl(serverPos);
      float var24 = 1.0F;
      class_1304[] var25 = lliliiIill;
      var37 ^= ((long)var25.length ^ var37) & -1L >>> 32;

      for(var39 ^= (0L ^ var39) & -1L << 32; (int)(var39 >>> 32) < (int)var37; var39 += 4294967296L) {
         class_1304 var28 = var25[(int)(var39 >>> 32)];
         class_1799 var29 = serverPos.method_6118(var28);
         var24 = Math.min(var24, var29.method_7960() ? 0.0F : (float)iIliilIlIlliilIl.IilliliilIIi(var29));
      }

      var39 ^= ((long)lllIliIlillIliIl.liIlliiIll(serverPos) ^ var39) & -1L >>> 32;
      if (selfPos.IiiIllIlIi) {
         if ((int)var39 != 0 && loopTicks - selfPos.liiIllIlIi >= 2L) {
            selfPos.IiiIllIlIi = false;
            if (this.ilIllIiIll(selfPos)) {
               this.liIiiiIill.lIiiIiIlilli().IIIllIIliIIl(loopTicks);
            }
         } else if (loopTicks - selfPos.liiIllIlIi >= 40L) {
            selfPos.IiiIllIlIi = false;
         }
      }

      iIIiIIliIlIiIIli var26 = IIllllIlll(serverPos.method_6047());
      iIIiIIliIlIiIIli var27 = IIllllIlll(serverPos.method_6079());
      if (selfPos.IliIllIlIi == Long.MIN_VALUE || loopTicks - selfPos.IliIllIlIi >= 4L) {
         selfPos.IliIllIlIi = loopTicks;
         selfPos.iIiIllIlIi = lllIliIlillIliIl.IiIIlliIIl(le, var13);
      }

      IlillIllllillIll var45 = IilIilllilIill.liiiIIllIl(t, class_2338.method_49638(tick));
      this.IllIllllIl(selfPos, loopTicks, selfEye);
      var41 ^= ((long)(selfPos.iIilllIlIi != Long.MIN_VALUE && loopTicks < selfPos.iIilllIlIi ? 1 : 0) << 32 ^ var41) & -1L << 32;
      var41 ^= ((long)Math.min(8, 2 + world) ^ var41) & -1L >>> 32;
      double var31 = selfPos.IIiIllIlIi.IIIllIIliIIl((int)var41);
      class_243 var33 = selfPos.IIiIllIlIi.IlIlllIlilIl((int)var41);
      if (this.ilIllIiIll(selfPos)) {
         this.illIlIilIl(selfPos, loopTicks, tick, (boolean)((int)(var35 >>> 32)), var45);
      }

      float var34 = selfPos.lIIlllIlIi ? var18 : selfPos.iiiIllIlIi;
      if (this.ilIllIiIll(selfPos) && var34 <= 10.0F) {
         this.liIiiiIill.lIiiIiIlilli().IilliliilIIi(loopTicks);
      }

      return new liiilIiliiiilIil(selfPos.IilIllIlIi, selfPos.iilIllIlIi, serverPos, var12, tick, selfPos.IIiIllIlIi.Illlllllilll(), var13, (boolean)((int)(var35 >>> 32)), selfEye, selfPos.iIiIllIlIi, var16, var17, selfPos.lIIlllIlIi, selfPos.iiiIllIlIi, var44, var23, var24, selfPos.llIlllIlIi, (boolean)((int)var39), var26, var27, (boolean)((int)(var37 >>> 32)), serverPos.method_6039(), illIllilIilIllil.Iilllilliill(selfPos.IilIllIlIi), selfPos.iiIlllIlIi, selfPos.IIllllIlIi, selfPos.lliIllIlIi, selfPos.iliIllIlIi, selfPos.IiiIllIlIi, var45, selfPos.IIiIllIlIi.Iilllilliill(), var31, var33, (boolean)((int)(var41 >>> 32)));
   }

   static boolean iliIiiliiiii(float damage, long lastFreshAny, long fireTick) {
      if (!(damage >= 1.0F)) {
         return false;
      } else {
         return fireTick == Long.MIN_VALUE || fireTick < lastFreshAny - 10L || fireTick > lastFreshAny;
      }
   }

   static float Iilllilliill(float ehpBefore, float ehpNow, float resistanceAmp, int epf) {
      float var4 = ehpBefore - ehpNow;
      if (Float.isFinite(var4) && var4 > 0.01F) {
         float var5 = epf < 0 ? 1.0F : 1.0F - 0.2F * (float)(epf + 1);
         float var6 = 1.0F - Math.min(20.0F, Math.max(0.0F, Float.isFinite(resistanceAmp) ? resistanceAmp : 0.0F)) / 25.0F;
         return var5 > 0.0F && var6 > 0.0F ? var4 / (var5 * var6) : Float.MAX_VALUE;
      } else {
         return Float.MAX_VALUE;
      }
   }

   static float Illlllllilll(String type, DoubleSupplier blastRaw, DoubleSupplier fallRaw) {
      long var5 = -5372888656972113044L;
      if (type == null) {
         return Float.MAX_VALUE;
      } else {
         var5 ^= (-4294967296L ^ var5) & -1L << 32;
         switch (type.hashCode()) {
            case -1368035283:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (17179869184L ^ var5) & -1L << 32;
               }
               break;
            case -1326222186:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (4294967296L ^ var5) & -1L << 32;
               }
               break;
            case -1266402665:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (30064771072L ^ var5) & -1L << 32;
               }
               break;
            case -1260300768:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (25769803776L ^ var5) & -1L << 32;
               }
               break;
            case -892483455:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (34359738368L ^ var5) & -1L << 32;
               }
               break;
            case -749231089:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (47244640256L ^ var5) & -1L << 32;
               }
               break;
            case -424743526:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (21474836480L ^ var5) & -1L << 32;
               }
               break;
            case -139769801:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (8589934592L ^ var5) & -1L << 32;
               }
               break;
            case -76782793:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (68719476736L ^ var5) & -1L << 32;
               }
               break;
            case 3135355:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (55834574848L ^ var5) & -1L << 32;
               }
               break;
            case 3314400:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (42949672960L ^ var5) & -1L << 32;
               }
               break;
            case 95858744:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (38654705664L ^ var5) & -1L << 32;
               }
               break;
            case 333722389:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (64424509440L ^ var5) & -1L << 32;
               }
               break;
            case 564029695:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (73014444032L ^ var5) & -1L << 32;
               }
               break;
            case 1716778928:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (51539607552L ^ var5) & -1L << 32;
               }
               break;
            case 1938690320:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (0L ^ var5) & -1L << 32;
               }
               break;
            case 1939188900:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (12884901888L ^ var5) & -1L << 32;
               }
               break;
            case 2088874877:
               if (type.equals(Ilillllill<invokedynamic>())) {
                  var5 ^= (60129542144L ^ var5) & -1L << 32;
               }
         }

         float var10000;
         switch ((int)(var5 >>> 32)) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
               var10000 = 1.0F;
               break;
            case 9:
               var10000 = 2.0F;
               break;
            case 10:
               var10000 = 4.0F;
               break;
            case 11:
               var10000 = 5.0F;
               break;
            case 12:
               var10000 = 6.0F;
               break;
            case 13:
            case 14:
               var10000 = IIillIiliIil(blastRaw);
               break;
            case 15:
            case 16:
            case 17:
               var10000 = IIillIiliIil(fallRaw);
               break;
            default:
               var10000 = Float.MAX_VALUE;
         }

         return var10000;
      }
   }

   private void IIiIllIiIl(long selfPos, lliiilIiiliiilIi tick, class_243 self, int loopTicks) {
      long var17 = 8311702767735461419L;

      while(!this.lIIiiiIill.isEmpty()) {
         llIIlilIIl var6 = (llIIlilIIl)this.lIIiiiIill.removeFirst();
         class_243 var7 = var6.IliIlllilIi();
         var17 ^= (0L ^ var17) & -1L << 32;

         for(iIIliIlIli var10 : this.iIIiiiIill) {
            if (selfPos - var10.liiiIIllIl() <= (long)(loopTicks + 2) && var10.IliIlllilIi().method_1022(var7) <= (double)0.5F) {
               var17 ^= (4294967296L ^ var17) & -1L << 32;
               break;
            }
         }

         iIiiIlIiIliiIlIi var19 = (int)(var17 >>> 32) != 0 ? null : this.iIiIlIliIl(var7);
         if ((int)(var17 >>> 32) == 0 && var19 != null && var19.iIlIlllllill() == -2 && !this.lliIliliIl(var7, selfPos)) {
            var17 ^= (4294967296L ^ var17) & -1L << 32;
         }

         if ((int)(var17 >>> 32) == 0) {
            liIlIIliiiIlIIli var20 = null;
            if (var19 != null && var19.iIlIlllllill() >= 0) {
               var20 = (liIlIIliiiIlIIli)this.ililiiIill.get(var19.iIlIlllllill());
            }

            if (var20 == null) {
               double var11 = (double)6.0F;

               for(liIlIIliiiIlIIli var14 : this.ililiiIill.values()) {
                  if (var14.llIillIlIi != null && var14.IlilllIlIi == selfPos && var14.llIillIlIi.IIIllIIliIIl() != null) {
                     double var15 = var14.llIillIlIi.IIIllIIliIIl().method_1022(var7);
                     if (var15 <= var11) {
                        var11 = var15;
                        var20 = var14;
                     }
                  }
               }
            }

            if (var20 != null) {
               long var21 = var20.lIiIllIlIi.Ililllililil();
               var17 ^= ((long)(self != null && var7.method_1022(self) <= (double)6.0F ? 1 : 0) ^ var17) & -1L >>> 32;
               var20.lIiIllIlIi.liiiIIllIl(selfPos, (boolean)((int)var17), IiiIlliiIl(tick), var7.field_1352, var7.field_1351, var7.field_1350, var6.liiiIIllIl());
               if (this.ilIllIiIll(var20) && var21 != Long.MIN_VALUE) {
                  long var22 = selfPos - var21;
                  if (var22 > 0L && var22 <= 80L) {
                     this.liIiiiIill.lIiiIiIlilli().IlIlllIlilIl((double)var22);
                  }
               }
            }
         }
      }

      while(!this.iIIiiiIill.isEmpty() && selfPos - ((iIIliIlIli)this.iIIiiiIill.peekFirst()).liiiIIllIl() > (long)(loopTicks + 2)) {
         this.iIIiiiIill.removeFirst();
      }

   }

   static {
      lliliiIill = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
   }

   // $FF: synthetic method
   private static CallSite liilliiill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) >>> 10 | (char)(-((char)(-var4[var5]))) << 6) + 'ꄂ') + var5) - '觔'))) + var5)) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static float lIiiIiIlilli(float predictedScaled, int lastScaledTaken, float ticksSinceHurt) {
      return lastScaledTaken < 10 && Float.isFinite(ticksSinceHurt) && ticksSinceHurt > 0.0F ? Math.max(predictedScaled, ticksSinceHurt) : predictedScaled;
   }

   private void IlIllllIll(long tick) {
      while(!this.IIIiiiIill.isEmpty() && tick - ((iIiiIlIiIliiIlIi)this.IIIiiiIill.peekFirst()).IilliliilIIi() > 4L) {
         this.IIIiiiIill.removeFirst();
      }

   }

   public double Illillliilli() {
      return this.llIiiiIill;
   }

   // $FF: synthetic method
   private static CallSite iIIilIlIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(-((char)((char)((char)(~var4[var5]) ^ var5) << 9 | (char)((char)(~var4[var5]) ^ var5) >>> 7))))))))) ^ 3353) - 23654) + 6798) + '뾃') ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)(-((char)(-((char)((char)((char)(~var4[var5]) ^ var5) << 9 | (char)((char)(~var4[var5]) ^ var5) >>> 7))))))))) ^ 3353) - 23654) + 6798) + '뾃') ^ var5) << 10) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(long tick, lliiilIiiliiilIi options, lilllliiilllli range, double self, int keepId, double keepRange) {
      long var32 = 4898699377434350383L;
      long var34 = -2902972719708206123L;
      class_310 var10 = class_310.method_1551();
      class_638 var11 = var10.field_1687;
      class_746 var12 = var10.field_1724;
      if (var11 != null && var12 != null) {
         if (var11 != this.IIliiiIill) {
            this.IiIIlliIIl();
            this.IIliiiIill = var11;
         }

         lilllliiilllli var13 = range == null ? lilllliiilllli.iiIiIiIIIl : range;
         class_243 var14 = options != null ? options.liiiIIllIl() : var12.method_73189();
         class_243 var15 = options != null ? options.iIlIlllllill() : var12.method_33571();
         double var16 = options != null ? options.IIiIllIiIl() : (double)illIllilIilIllil.IIIllIIliIIl();
         var32 ^= ((long)((int)Math.ceil(Math.max((double)0.0F, var16) / (double)50.0F)) << 32 ^ var32) & -1L << 32;
         this.iiiIlIIIll(tick);
         double var19 = Double.POSITIVE_INFINITY;
         ArrayList var21 = new ArrayList();
         this.IiiliiIill.clear();

         for(class_1297 var24 : !var13.IlIlllIlilIl() && !var13.IiIlliIliiIl() ? var11.method_18456() : var11.method_18112()) {
            if (var24 instanceof class_1309) {
               class_1309 var25 = (class_1309)var24;
               if (var24 != var12 && liiIIIlliiiIIIll.IliIlllilIi(var24, var13)) {
                  if (var24 instanceof class_1657) {
                     class_1657 var26 = (class_1657)var24;
                     if (var26.method_68878() || var26.method_7325()) {
                        continue;
                     }
                  }

                  class_243 var39 = liIlliiIll(var25);
                  double var27 = var14.method_1022(var39);
                  var19 = Math.min(var19, var27);
                  var32 ^= ((long)var25.method_5628() ^ var32) & -1L >>> 32;
                  liIlIIliiiIlIIli var30 = (liIlIIliiiIlIIli)this.ililiiIill.get((int)var32);
                  var34 ^= ((long)((int)var32 == keepId && keepId >= 0 ? 1 : 0) << 32 ^ var34) & -1L << 32;
                  if ((int)(var34 >>> 32) != 0 && Double.isFinite(keepRange) && var27 > keepRange) {
                     if (var30 == null) {
                        continue;
                     }

                     if (var30.llilllIlIi == Long.MIN_VALUE) {
                        var30.llilllIlIi = tick;
                     }

                     if (tick - var30.llilllIlIi >= 40L) {
                        continue;
                     }
                  } else {
                     if ((int)(var34 >>> 32) == 0 && var27 > self) {
                        continue;
                     }

                     if (var30 != null) {
                        var30.llilllIlIi = Long.MIN_VALUE;
                     }
                  }

                  var21.add(new llllIlIiilllIlIi(var25, var39, var27, (boolean)((int)(var34 >>> 32))));
               }
            }
         }

         var21.sort(Comparator.comparing((c) -> !c.IilliliilIIi()).thenComparingDouble(llllIlIiilllIlIi::iIlIlllllill));
         ArrayList var36 = new ArrayList();

         for(llllIlIiilllIlIi var38 : var21) {
            if (var36.size() >= 64) {
               break;
            }

            var34 ^= ((long)var38.IliIlllilIi().method_5628() ^ var34) & -1L >>> 32;
            liIlIIliiiIlIIli var40 = (liIlIIliiiIlIIli)this.ililiiIill.computeIfAbsent((int)var34, liIlIIliiiIlIIli::new);
            var40.lilIllIlIi = var38.IliIlllilIi();
            var40.IlilllIlIi = tick;
            var40.IiilllIlIi = true;
            liiilIiliiiilIil var28 = this.iiIIlIIlIl(var40, var38.IliIlllilIi(), tick, var14, var15, var38.liiiIIllIl(), var38.iIlIlllllill(), (int)(var32 >>> 32), var11);
            var40.llIillIlIi = var28;
            this.IiiliiIill.put((int)var34, var28);
            var36.add(var28);
         }

         this.llIiiiIill = var19;
         var36.sort(Comparator.comparingDouble(liiilIiliiiilIil::Illlllllilll));
         this.liiliiIill = Collections.unmodifiableList(var36);
         this.IIiIllIiIl(tick, options, var14, (int)(var32 >>> 32));
         this.lIIlliIIll(tick);
         this.IlIllllIll(tick);
      } else {
         this.liiliiIill = List.of();
         this.IiiliiIill.clear();
         this.llIiiiIill = Double.POSITIVE_INFINITY;
      }
   }

   public List<liiilIiliiiilIil> Iilililiiili() {
      return this.liiliiIill;
   }

   private boolean ilIllIiIll(liIlIIliiiIlIIli t) {
      return this.liIiiiIill != null && t.IilIllIlIi == this.IiIiiiIill;
   }

   private static float IIillIiliIil(DoubleSupplier raw) {
      double var1 = raw == null ? Double.NaN : raw.getAsDouble();
      return Double.isFinite(var1) && var1 > (double)0.0F && var1 < (double)Float.MAX_VALUE ? (float)var1 : Float.MAX_VALUE;
   }

   // $FF: synthetic method
   private static CallSite Ilillllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3406243635323863134L ^ Long.rotateLeft(1013847224831014551L, 25) ^ -7817094529869634064L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2545377822599436673L ^ Long.rotateLeft(5993671737506930639L, 22) ^ 7859178042542748547L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9014173228808240349L ^ Long.rotateLeft(-337613004515862949L, 52) ^ 1466248473806677213L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 570289815083333118L ^ Long.rotateLeft(-5346726024756373331L, 10) ^ -1848850728735699249L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7977880418919051269L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8612381553134223060L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4651931107551100662L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5738045140452804466L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6313190080996008892L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7800707019689125327L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(ilillIiill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, liilliiill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIillIIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iIIilIlIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIililIil<invokedynamic>());
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

   public void IIlilIliiIli(int id) {
      liIlIIliiiIlIIli var2 = (liIlIIliiiIlIIli)this.ililiiIill.get(id);
      if (var2 != null) {
         var2.lliIllIlIi = 0;
      }

   }

   private iIiiIlIiIliiIlIi iIiIlIliIl(class_243 c) {
      iIiiIlIiIliiIlIi var2 = null;
      double var3 = (double)0.5F;

      for(iIiiIlIiIliiIlIi var6 : this.iiiliiIill.values()) {
         double var7 = var6.liiiIIllIl().method_1022(c);
         if (var7 <= var3) {
            var3 = var7;
            var2 = var6;
         }
      }

      for(iIiiIlIiIliiIlIi var10 : this.IIIiiiIill) {
         double var11 = var10.liiiIIllIl().method_1022(c);
         if (var11 <= var3) {
            var3 = var11;
            var2 = var10;
         }
      }

      return var2;
   }

   private void IllIllllIl(liIlIIliiiIlIIli tick, long dist, double t) {
      Iterator var6 = tick.IIilllIlIi.iterator();

      while(var6.hasNext()) {
         lIlillIliIlillIl var7 = (lIlillIliIlillIl)var6.next();
         if (dist > var7.lIiiIiIlilli()) {
            var6.remove();
            if (t <= (double)6.0F && tick.IiilllIlIi && iliIiiliiiii(var7.iIlIlllllill(), var7.IliIlllilIi(), tick.iIllllIlIi)) {
               ++tick.lIilllIlIi;
               if (tick.lIilllIlIi >= 6) {
                  tick.iIilllIlIi = dist + 100L;
                  tick.lIilllIlIi = 0;
               }
            }
         }
      }

   }

   private void IiIlliIliiIl(liIlIIliiiIlIIli t, long tick, float ehpNow) {
      if (t.IlllllIlIi != Long.MIN_VALUE) {
         if (t.iIllllIlIi == t.IlllllIlIi && tick - t.IlllllIlIi <= 2L && t.lIIlllIlIi) {
            float var5 = Iilllilliill(t.llllllIlIi, ehpNow, 20.0F, IIlllIlliIll(t));
            if (var5 != Float.MAX_VALUE) {
               t.iiIlllIlIi = var5;
               t.IlllllIlIi = Long.MIN_VALUE;
            }
         } else {
            t.IlllllIlIi = Long.MIN_VALUE;
         }
      }
   }

   private boolean lliIliliIl(class_243 c, long tick) {
      for(liIlIIliiiIlIIli var5 : this.ililiiIill.values()) {
         if (var5.ililllIlIi != Long.MIN_VALUE && tick - var5.ililllIlIi <= 3L && var5.llIillIlIi != null && var5.llIillIlIi.IIIllIIliIIl() != null && var5.llIillIlIi.IIIllIIliIIl().method_1022(c) <= (double)6.0F) {
            return true;
         }
      }

      return false;
   }

   public void liiiIIllIl(IlIillIiilIi e, long selfId, int tick) {
      long var17 = 62920529721865349L;
      long var19 = 642569213112941439L;
      if (e instanceof llIiIIliilIiIIli var5) {
         liIlIIliiiIlIIli var11 = (liIlIIliiiIlIIli)this.ililiiIill.get(var5.IliIlllilIi());
         if (var11 == null) {
            return;
         }

         ++var11.lliIllIlIi;
         var11.iliIllIlIi = selfId;
         var11.IiiIllIlIi = true;
         var11.liiIllIlIi = selfId;
         var11.iiiIllIlIi = 9.0F;
         var11.IIIlllIlIi = selfId;
         var11.llIlllIlIi = 1.0F;
         var11.ilIlllIlIi = Long.MIN_VALUE;
         var11.illlllIlIi = Long.MIN_VALUE;
         if (this.ilIllIiIll(var11)) {
            this.liIiiiIill.lIiiIiIlilli().iliIiiliiiii(selfId);
         }
      } else if (e instanceof IIlilIIllIlilIIl var6) {
         liIlIIliiiIlIIli var21 = (liIlIIliiiIlIIli)this.ililiiIill.get(var6.IliIlllilIi());
         if (var21 == null) {
            return;
         }

         var17 ^= ((long)(var6.liiiIIllIl() == tick && tick >= 0 ? 1 : 0) << 32 ^ var17) & -1L << 32;
         var21.IIllllIlIi = (boolean)((int)(var17 >>> 32));
         var21.iIllllIlIi = selfId;
         if ((int)(var17 >>> 32) == 0) {
            var21.iiIlllIlIi = this.IIIllIIliIIl(var6, var21, selfId);
            return;
         }

         var21.lIllllIlIi = selfId;
         var21.lIilllIlIi = 0;
         var21.iIilllIlIi = Long.MIN_VALUE;
         lIlillIliIlillIl var13 = null;
         Iterator var14 = var21.IIilllIlIi.iterator();

         while(var14.hasNext()) {
            lIlillIliIlillIl var15 = (lIlillIliIlillIl)var14.next();
            if (selfId >= var15.IliIlllilIi() && selfId <= var15.lIiiIiIlilli()) {
               var13 = var15;
               var14.remove();
               break;
            }
         }

         if (var13 == null) {
            var21.iiIlllIlIi = Float.MAX_VALUE;
            return;
         }

         var21.iiIlllIlIi = var13.liiiIIllIl();
         var21.iiiIllIlIi = iIlllIllll(var21.iiiIllIlIi - var13.iIlIlllllill(), 1.0F, 40.0F);
         if (var13.iIlIlllllill() >= 0.5F && Float.isFinite(var13.IilliliilIIi())) {
            var21.ilIlllIlIi = selfId + 2L;
            var21.IiIlllIlIi = var13.IilliliilIIi();
            var21.liIlllIlIi = var13.iIlIlllllill();
         }
      } else if (e instanceof iIIIiilIlIIiil var7) {
         if (var7.liiiIIllIl() != class_1299.field_6110) {
            return;
         }

         this.lilIliilIl(var7, selfId);
      } else if (e instanceof liIIlliiiIIlli var8) {
         if (var8.IliIlllilIi() == null) {
            return;
         }

         int[] var22 = var8.IliIlllilIi();
         var17 ^= ((long)var22.length << 32 ^ var17) & -1L << 32;

         for(long var27 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var27 < (int)(var27 >>> 32); var27 ^= (var27 ^ var27 + (long)1) & -1L >>> 32) {
            var19 ^= ((long)var22[(int)var27] << 32 ^ var19) & -1L << 32;
            iIiiIlIiIliiIlIi var24 = (iIiiIlIiIliiIlIi)this.iiiliiIill.remove((int)(var19 >>> 32));
            if (var24 != null) {
               if (var24.iIlIlllllill() >= 0) {
                  liIlIIliiiIlIIli var16 = (liIlIIliiiIlIIli)this.ililiiIill.get(var24.iIlIlllllill());
                  if (var16 != null) {
                     var16.lIiIllIlIi.IIIllIIliIIl((int)(var19 >>> 32), selfId);
                  }
               }

               this.IIIiiiIill.addLast(new iIiiIlIiIliiIlIi((int)(var19 >>> 32), var24.liiiIIllIl(), var24.iIlIlllllill(), selfId));

               while(this.IIIiiiIill.size() > 64) {
                  this.IIIiiiIill.removeFirst();
               }
            }
         }
      } else if (e instanceof iIIlIlilIlIlIlil var9) {
         if (var9.IliIlllilIi() != null) {
            this.lIIiiiIill.addLast(new llIIlilIIl(var9.IliIlllilIi(), var9.liiiIIllIl()));
         }

         while(this.lIIiiiIill.size() > 64) {
            this.lIIiiiIill.removeFirst();
         }
      } else if (e instanceof ilIiIiIiIiIiIiIi var10) {
         liIlIIliiiIlIIli var23 = (liIlIIliiiIlIIli)this.ililiiIill.get(var10.IliIlllilIi());
         if (var23 == null) {
            return;
         }

         var23.ililllIlIi = selfId;
         var23.lIiIllIlIi.IlIlllIlilIl(selfId);
      }

   }

   public liiilIiliiiilIil IIiilIiiiIii(int id) {
      return (liiilIiliiiilIil)this.IiiliiIill.get(id);
   }

   public iillilIIilil Iiiiliiiiiii(int id) {
      liIlIIliiiIlIIli var2 = (liIlIIliiiIlIIli)this.ililiiIill.get(id);
      return var2 != null ? var2.lIiIllIlIi : new iillilIIilil();
   }

   public lililIlliililIll Iliilliiilii(int id) {
      liIlIIliiiIlIIli var2 = (liIlIIliiiIlIIli)this.ililiiIill.get(id);
      return var2 != null ? var2.IIiIllIlIi : new lililIlliililIll();
   }
}
