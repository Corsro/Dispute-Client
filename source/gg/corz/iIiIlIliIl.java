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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1303;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2338;
import net.minecraft.class_2346;
import net.minecraft.class_2350;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3610;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_638;
import net.minecraft.class_744;
import net.minecraft.class_746;
import net.minecraft.class_2350.class_2351;
import net.minecraft.class_2350.class_2353;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public final class iIiIlIliIl {
   private boolean iiiIiIlIIIliIl;
   private int IlIliIlllIliIl;
   private final ArrayDeque<class_2338> IIiiiIllIiiiIl;
   private int IIlliIllIlliIl;
   private final ilIIIIiIiIIIIi IililIllililIl;
   private final Set<class_2338> illIiIlIilIiIl;
   private final Map<class_2338, Integer> IlllIllllllIll;
   private double iiIiiIlIIliiIl;
   private final Map<class_2338, Integer> lIllIlliIllIll;
   private int lillIlliillIll;
   private int lilIllliilIlll;
   private static final int IIillIllIillIl = 160;
   private class_2338 IIlIIlllIlIIll;
   private int iIIIlllIlIIlll;
   private class_2338 lllIIllillIIll;
   private int lllliIlillliIl;
   private int IllIllllllIlll;
   private boolean lIIlllliIIllll;
   private final Map<class_2338, Integer> iiIlIllIIllIll;
   private int IiliIllliliIll;
   private double iIliIllIlliIll;
   private final Set<class_2338> IiIlIllliIlIll;
   private static final int liIilIliiIilIl = 60000;
   private class_744 IiIIiIlliIIiIl;
   private long liIiIlliiIiIll;
   private boolean ilIiIllIiIiIll;
   private class_2338 iliiIllIiiiIll;
   private final iIIiIliIlIiIli liiilIliiiilIl;
   private static final int iIillIlIlillIl = 60;
   private class_2338 lliiiIliliiiIl;
   private final Map<class_2338, Integer> illlIllIillIll;
   private int liiliIliiiliIl;
   private int iiIIlllIIlIlll;
   private int lliIllliliIlll;
   private final class_310 lllilIlillilIl;
   private int IilliIllilliIl;
   private class_2338 lIlIiIliIlIiIl;
   private int lIlIllliIlIlll;
   private final Set<class_2338> IIiIiIllIiIiIl;
   private int IlIiIllllIiIll;
   private static final int llillIlilillIl = 600;
   private boolean IiiIiIlliiIiIl;
   private int IiiiiIlliiiiIl;
   private boolean IiilIllliilIll;
   private iIiiiIIlIliiiIIl iIIIiIlIlIIiIl;
   private final llilIIIiililIIIi iililIlIIiilIl;
   private boolean IlliiIlllliiIl;
   private static final int iIlilIlIllilIl = 200;
   private final lIIIliiliIIIliil iliilIlIiiilIl;
   private boolean IiIIlllliIIlll;
   private final Set<class_2338> iIlliIlIllliIl;
   private int liliiIliiliiIl;
   private final List<class_2338> lIIliIliIIliIl;
   private static final int iiilIllIIIiIll = 300;
   private int iIiIiIlIliIiIl;
   private int illiiIlIiliiIl;
   private final Set<class_2338> lilIiIliilIiIl;
   private int liiiIlliiiiIll;
   private boolean illIlllIilIlll;
   private class_1792 IiiIlllliiIlll;
   private boolean IIIIllllIIIlll;
   private boolean ilIIIllIiIIIll;
   private lilIIliiilIIli llIIiIlilIIiIl;
   private class_746 iiiIlllIIIllll;
   private int llIIlllilIIlll;
   private static final int lIIilIliIIilIl = 70;
   private final liiiliIliiiiliIl IliilIllliilIl;
   private int liiIIlliiiIIll;
   private static final int iIIlIllIlIlIll = 60;
   private int IliIIlllliIIll;
   private int liIIIlliiIIIll;
   private int lIiIIlliIiIIll;
   private class_2338 lIIIIlliIIIIll;
   private class_1792 iIiIlllIliIlll;
   private llliIiIiilliIiIi lIiliIliIiliIl;
   private int llilIllililIll;
   private boolean lliIiIliliIiIl;
   private boolean iiIIiIlIIlIiIl;
   private class_2338 lIliiIliIliiIl;
   private class_2338 IIliIlllIliIll;
   private String iiliIllIIiiIll;
   private final iilIiiIiIIiIiiIi lIiilIliIiilIl = new iilIiiIiIIiIiiIi();
   private int IIIlIlllIIlIll;
   private static final int IlIilIlllIilIl = 20;
   private int liIliIliiIliIl;
   private lllIlIIlillIlIIl IIIIiIllIIIiIl;
   private int ililiIlIiiliIl;
   private static final int lIIiIlliIIiIll = 200;
   private int iIlIIllIllIIll;
   private double IiIiiIlliIiiIl;
   private int iiiiiIlIIIIIll;
   private boolean iIIiiIlIlIiiIl;
   private int IlIIIllllIIIll;
   private int llliIllilliIll;
   private int IilIIlllilIIll;
   private boolean iliIIllIiiIIll;
   private class_2338 IliliIllliliIl;
   private static final int IIlilIllIlilIl = 4;
   private int IIiIllllIiIlll;
   private int IIIiiIllIIiiIl;
   private class_2338 IliiIlllliiIll;
   private static final int IiillIlliillIl = 600;
   private boolean iilliIlIIiliIl;
   private static final int iiillIlIIIilIl = 1200;
   private int ilIliIlIiIliIl;
   private int IIilIlllIilIll;
   private boolean IllIiIllllIiIl;
   private static final int ilIilIlIiIilIl = 2;
   private double llIiiIlilIiiIl;
   private int iilIIllIIiIIll;
   private static final int llIlIllilIlIll = 3;
   private static final int lilllIliilllIl = 4096;
   private class_2338 iIiiiIlIliiiIl;
   private class_2338 lIiiIlliIiiIll;
   private final Set<class_2338> iIilIllIlilIll;

   private void lliliilili() {
      this.Iiililiili();
      if (this.IIIIiIllIIIiIl != null) {
         this.IIIIiIllIIIiIl.IliIlllilIi();
      }

   }

   public class_2338 iliIiiliiiii() {
      return this.IliilIllliilIl.IIiilIiiiIii();
   }

   private boolean IiIliliIli(class_1937 p, class_746 w) {
      long var8;
      for(var8 = 5086248071679531819L; !this.IIiiiIllIiiiIl.isEmpty() && !this.IlIiillIii(p, (class_2338)this.IIiiiIllIiiiIl.peek()); this.iiiiiIlIIIIIll = 0) {
         class_2338 var3 = (class_2338)this.IIiiiIllIiiiIl.poll();
         if (var3.equals(this.lliiiIliliiiIl)) {
            ++this.IiiiiIlliiiiIl;
            this.lliiiIliliiiIl = null;
         }
      }

      if (this.IiiiiIlliiiiIl >= 3) {
         this.IIiiiIllIiiiIl.clear();
         this.iIiiiIlIliiiIl = null;
         this.lliiiIliliiiIl = null;
         return false;
      } else if (this.IIiiiIllIiiiIl.isEmpty()) {
         return false;
      } else if (this.iiiiiIlIIIIIll > 600) {
         this.IIiiiIllIiiiIl.clear();
         this.iIiiiIlIliiiIl = null;
         this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
         return false;
      } else {
         class_2338 var10 = (class_2338)this.IIiiiIllIiiiIl.peek();
         if (this.lIllIlliIllIll.containsKey(var10)) {
            this.IIiiiIllIiiiIl.clear();
            this.iIiiiIlIliiiIl = null;
            this.lliiiIliliiiIl = null;
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
            return false;
         } else {
            double var4 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, w.method_55754());
            var8 ^= ((long)(this.IiiiiIlliiiiIl + 1) << 32 ^ var8) & -1L << 32;
            if (this.IliilIllliilIl.IIlllIlliIll(var10, var4)) {
               this.lliiiIliliiiIl = var10;
               this.Ilillllill(var10, var4, true);
               this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + (int)(var8 >>> 32) + iiIIIlIIlIIl<invokedynamic>();
               return true;
            } else if (this.IIIlilIIli(p, w, var10, var4)) {
               return true;
            } else {
               class_2338 var7 = this.iIliiIllii(p, w, var10);
               if (var7 == null) {
                  var7 = new class_2338(var10.method_10263(), this.iIIIiIlIlIIiIl.iIlIlllllill(), var10.method_10260());
               }

               this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + (int)(var8 >>> 32) + iiIIIlIIlIIl<invokedynamic>();
               if (!var7.equals(this.iIiiiIlIliiiIl)) {
                  this.iIiiiIlIliiiIl = var7.method_10062();
                  this.IIIIiIllIIIiIl.IliIlllilIi();
               }

               if (this.Iliilliiilii(p, w, var7)) {
                  if (this.lIiliIliIiliIl == llliIiIiilliIiIi.liiIiIiIIi) {
                     this.IIiiiIllIiiiIl.clear();
                     this.iIiiiIlIliiiIl = null;
                     return false;
                  } else {
                     return true;
                  }
               } else {
                  if (this.IIIIiIllIIIiIl.IIlilIliiIli(var7) == lillilliillill.IIlilIlIilIlilIlIi) {
                     this.iIilIllIlilIll.add(var7.method_10062());
                     this.iIiiiIlIliiiIl = null;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                  }

                  return true;
               }
            }
         }
      }
   }

   public List<class_2338> Illlllllilll() {
      return this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili() ? this.iIIIiIlIlIIiIl.IIillIiliIil() : List.of();
   }

   private boolean IlIiillIii(class_1937 pos, class_2338 w) {
      if (this.iililIlIIiilIl.IlIillIiilIi(w) && this.lIIiiiIIii(w) && !pos.method_8320(w).method_26215() && !this.IIlilIliiIli(pos, w)) {
         return this.iIlliIlIllliIl.contains(w) && !(pos.method_8320(w).method_26204() instanceof class_2346) ? false : lllIIlilillIIlil.IilliliilIIi(pos, w);
      } else {
         return false;
      }
   }

   private boolean ilIiiIiIii(class_2338 pos) {
      class_746 var2 = this.lllilIlillilIl.field_1724;
      if (var2 == null) {
         return false;
      } else {
         class_2338 var3 = var2.method_24515();
         if (pos.equals(var3.method_10074())) {
            return true;
         } else {
            return pos.method_10264() < var3.method_10264() && pos.method_10262(var3) <= (double)4.0F && this.IIIIiIllIIIiIl.iIlIlllllill().contains(pos);
         }
      }
   }

   private int liilliiill(class_1937 w, int limit) {
      long var7 = -3060608074086273798L;
      long var9 = 2665088705277469494L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for(var7 ^= ((long)this.iIIIiIlIlIIiIl.liiiIIllIl() ^ var7) & -1L >>> 32; (int)var7 >= this.iIIIiIlIlIIiIl.iIlIlllllill(); var7 ^= (var7 ^ var7 + (long)-1) & -1L >>> 32) {
         for(var9 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var9) & -1L << 32; (int)(var9 >>> 32) <= this.iIIIiIlIlIIiIl.iIIIlIlIIl(); var9 += 4294967296L) {
            for(var9 ^= ((long)this.iIIIiIlIlIIiIl.llIIlilIIl() ^ var9) & -1L >>> 32; (int)var9 <= this.iIIIiIlIlIIiIl.IiIIlliIIl(); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
               if (this.IlIiillIii(w, this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var9 >>> 32), (int)var9, (int)var7))) {
                  var7 += 4294967296L;
                  if ((int)(var7 >>> 32) >= limit) {
                     return (int)(var7 >>> 32);
                  }
               }
            }
         }
      }

      return (int)(var7 >>> 32);
   }

   private boolean illilIilil(class_746 p) {
      long var8 = -1800640692690699418L;
      long var10 = -5267819233579714738L;
      if (!this.IililIllililIl.liliIIiliiiliIIili) {
         this.IiilIllliilIll = false;
         return false;
      } else if (this.IlIiIllllIiIll > 0) {
         --this.IlIiIllllIiIll;
         this.IiilIllliilIll = false;
         return false;
      } else {
         var8 ^= (0L ^ var8) & -1L << 32;
         if (!this.iIIIiIlIlIIiIl.Iilililiiili()) {
            class_2338 var3 = this.iIIIiIlIlIIiIl.Ililllililil();
            double var4 = (double)var3.method_10263() + (double)0.5F - p.method_23317();
            double var6 = (double)var3.method_10260() + (double)0.5F - p.method_23321();
            var8 ^= ((long)(var4 * var4 + var6 * var6 <= (double)6.25F ? 1 : 0) << 32 ^ var8) & -1L << 32;
         }

         var8 ^= ((long)(!this.iIIIiIlIlIIiIl.Iilililiiili() && (this.lIiliIliIiliIl != llliIiIiilliIiIi.IiiIiIiIIi || (int)(var8 >>> 32) != 0) && this.lIiliIliIiliIl != llliIiIiilliIiIi.liiIiIiIIi && this.IliiIlllliiIll == null ? 0 : 1) ^ var8) & -1L >>> 32;
         if ((int)var8 != 0) {
            this.IiilIllliilIll = false;
            return false;
         } else {
            var10 ^= ((long)(p.method_31478() < this.iIIIiIlIlIIiIl.iIlIlllllill() ? 1 : 0) << 32 ^ var10) & -1L << 32;
            if (!this.IiilIllliilIll && (int)(var10 >>> 32) == 0) {
               return false;
            } else if (this.IiilIllliilIll && (int)(var10 >>> 32) == 0 && p.method_24828()) {
               this.IiilIllliilIll = false;
               this.llilIllililIll = 0;
               this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
               return false;
            } else {
               this.IiilIllliilIll = true;
               ++this.llilIllililIll;
               this.lIlIiIliIlIiIl = null;
               if (this.llilIllililIll > 300) {
                  this.IiilIllliilIll = false;
                  this.llilIllililIll = 0;
                  this.IlIiIllllIiIll = 200;
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.IIIIiIllIIIiIl.IliIlllilIi();
                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
                  return false;
               } else if (!this.IIIIiIllIIIiIl.IiIlliIliiIl(p)) {
                  if (!liliIliiiliIli.IIIllIIliIIl(p)) {
                     this.lIiilIliIiilIl.iIlIlllllill();
                     this.lilliiilli(iiIIIlIIlIIl<invokedynamic>());
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                     return true;
                  } else {
                     this.IiilIllliilIll = false;
                     return false;
                  }
               } else {
                  this.iiliIllIIiiIll = this.IIIIiIllIIIiIl.IlIlllIlilIl() ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>() + this.llilIllililIll / 20 + iiIIIlIIlIIl<invokedynamic>();
                  return true;
               }
            }
         }
      }
   }

   private void ilillIiill(class_2338 pos) {
      long var5 = 6900340097477064888L;
      long var7 = 5913827749594995263L;

      for(var5 ^= (-4294967296L ^ var5) & -1L << 32; (int)(var5 >>> 32) <= 1; var5 += 4294967296L) {
         for(var5 ^= ~var5 & -1L >>> 32; (int)var5 <= 1; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
            for(var7 ^= (-4294967296L ^ var7) & -1L << 32; (int)(var7 >>> 32) <= 1; var7 += 4294967296L) {
               this.IlllIllllllIll.put(pos.method_10069((int)(var5 >>> 32), (int)var5, (int)(var7 >>> 32)), 8);
            }
         }
      }

   }

   private void IllIllllIl() {
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii && this.iiIIiIlIIlIiIl) {
         this.llIIiIlilIIiIl = lilIIliiilIIli.illIliiiiIilIliiii;
         this.iiIIiIlIIlIiIl = false;
         this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
      }

   }

   private boolean iilIiIIiIi(class_1937 p, class_746 w) {
      long var8 = -8372964815114241008L;
      class_2338 var3 = this.IliilIllliilIl.IIiilIiiiIii();
      if (var3 != null && this.lIlIiIliIlIiIl != null && var3.equals(this.lIlIiIliIlIiIl)) {
         double var4 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, w.method_55754());
         if (this.IlIiillIii(p, var3) && this.IliilIllliilIl.IIlllIlliIll(var3, var4)) {
            this.lIiilIliIiilIl.IliliiiIIi = true;
            this.IIIlIlllIIlIll = this.iIiilIliil(var3) ? 0 : this.IIIlIlllIIlIll + 1;
            var8 ^= ((long)(this.IililIllililIl.ilIIlIiliIiIIlIili && this.IIIlIlllIIlIll > 60 ? 1 : 0) << 32 ^ var8) & -1L << 32;
            if (++this.liiIIlliiiIIll <= 1200 && (int)(var8 >>> 32) == 0) {
               this.Ilillllill(var3, var4, this.IllIiIllllIiIl);
               return true;
            } else {
               this.liiIIlliiiIIll = 0;
               this.IIIlIlllIIlIll = 0;
               this.lIllIlliIllIll.put(var3.method_10062(), 600);
               this.IliilIllliilIl.Iilililiiili();
               this.lIlIiIliIlIiIl = null;
               ++this.liliiIliiliiIl;
               this.lIiilIliIiilIl.IliliiiIIi = false;
               var8 ^= ((long)(Integer)this.iiIlIllIIllIll.merge(var3.method_10062(), 1, Integer::sum) ^ var8) & -1L >>> 32;
               if ((int)(var8 >>> 32) != 0) {
                  this.IliilIllliilIl.IliIlllilIi(var3);
               }

               if (this.IililIllililIl.ilIIlIiliIiIIlIili && (int)var8 >= 3) {
                  this.IiIlIllliIlIll.add(var3.method_10062());
                  this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + var3.method_23854() + iiIIIlIIlIIl<invokedynamic>() + (int)var8 + iiIIIlIIlIIl<invokedynamic>());
                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  return false;
               } else {
                  if ((int)(var8 >>> 32) != 0) {
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + var3.method_23854() + iiIIIlIIlIIl<invokedynamic>());
                  } else {
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + var3.method_23854() + iiIIIlIIlIIl<invokedynamic>());
                  }

                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  return false;
               }
            }
         } else {
            this.liiIIlliiiIIll = 0;
            this.IIIlIlllIIlIll = 0;
            this.lIiilIliIiilIl.IliliiiIIi = false;
            return false;
         }
      } else {
         this.liiIIlliiiIIll = 0;
         this.IIIlIlllIIlIll = 0;
         this.lIiilIliIiilIl.IliliiiIIi = false;
         return false;
      }
   }

   private boolean IIlilIliiIli(class_1937 pos, class_2338 w) {
      if (!this.illIiIlIilIiIl.contains(w) && !this.lilIiIliilIiIl.contains(w)) {
         return false;
      } else {
         boolean var10000;
         if (!pos.method_8320(w).method_26215()) {
            boolean var10002 = this.IIiIiIllIiIiIl.contains(w);
            llilIIIiililIIIi var10003 = this.iililIlIIiilIl;
            Objects.requireNonNull(var10003);
            if (liilIlIiiiilIlIi.IIlilIliiIli(pos, w, var10002, var10003::IlIillIiilIi)) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      }
   }

   private boolean IlIllllIll(class_746 w, class_1937 p) {
      long var4 = -2957489314187886235L;
      if (!this.IililIllililIl.IIiiIIililIiiIIili) {
         return false;
      } else if (this.ilIllIiIll(w, p, this.iIIIiIlIlIIiIl.iIlIlllllill(), this.iIIIiIlIlIIiIl.liiiIIllIl(), false)) {
         return true;
      } else {
         var4 ^= ((long)this.liIlliiIll(p, this.iIIIiIlIlIIiIl.iIlIlllllill(), this.iIIIiIlIlIIiIl.liiiIIllIl()) << 32 ^ var4) & -1L << 32;
         if ((int)(var4 >>> 32) > 0 && !this.IlllIllllllIll.isEmpty()) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            return true;
         } else if ((int)(var4 >>> 32) > 0 && this.iIiIiIlIliIiIl < 2) {
            ++this.iIiIiIlIliIiIl;
            this.lIllIlliIllIll.clear();
            this.iIilIllIlilIll.clear();
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1) + iiIIIlIIlIIl<invokedynamic>() + (int)(var4 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + ((int)(var4 >>> 32) == 1 ? "" : iiIIIlIIlIIl<invokedynamic>()) + iiIIIlIIlIIl<invokedynamic>() + this.iIiIiIlIliIiIl + iiIIIlIIlIIl<invokedynamic>() + 2 + iiIIIlIIlIIl<invokedynamic>());
            return true;
         } else {
            this.iIiIiIlIliIiIl = 0;
            this.lIllIlliIllIll.clear();
            return false;
         }
      }
   }

   private void Illlilllli(class_1937 pos, class_2338 w) {
      class_746 var3 = this.lllilIlillilIl.field_1724;
      if (var3 != null) {
         if (this.IliilIllliilIl.IIlllIlliIll(w, this.IililIllililIl.iIiiIIiliIliiIIili)) {
            if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.IIIIiIllIIIiIl.IIIllIIliIIl();
            }

            this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
         } else {
            if (this.lIliiIliIliiIl == null) {
               this.lIliiIliIliiIl = this.iIliiIllii(pos, var3, w);
               if (this.lIliiIliIliiIl == null) {
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                  this.iIilIllIlilIll.clear();
                  this.IIilIlllIilIll = 3;
                  this.IlliiIlllliiIl = true;
                  this.IIIIiIllIIIiIl.IliIlllilIi();
                  this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                  return;
               }

               this.IIIIiIllIIIiIl.IliIlllilIi();
            }

            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            lillilliillill var4 = this.IIIIiIllIIIiIl.IIlilIliiIli(this.lIliiIliIliiIl);
            if (var4 == lillilliillill.liIilIlIiiiIilIlIi) {
               if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
                  this.IIIIiIllIIIiIl.IIIllIIliIIl();
               }

               this.iIilIllIlilIll.add(this.lIliiIliIliiIl);
               this.lIliiIliIliiIl = null;
               this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
            } else if (var4 == lillilliillill.IIlilIlIilIlilIlIi) {
               if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
                  this.IIIIiIllIIIiIl.IIIllIIliIIl();
               }

               this.iIilIllIlilIll.add(this.lIliiIliIliiIl);
               this.lIliiIliIliiIl = null;
            }

         }
      }
   }

   private boolean IIIIllIIIl(class_2338 drill, boolean pos) {
      class_746 var3 = this.lllilIlillilIl.field_1724;
      class_638 var4 = this.lllilIlillilIl.field_1687;
      if (var3 != null && var4 != null) {
         if (this.IIlilIliiIli(var4, drill)) {
            return false;
         } else if (liilIlIiiiilIlIi.IIiilIiiiIii(var4, var3.method_5829(), drill, pos)) {
            this.iIIIlIlIIl(drill, iiIIIlIIlIIl<invokedynamic>());
            return false;
         } else if (liilIlIiiiilIlIi.Illillliilli(var4, drill, pos) && (!this.IililIllililIl.liliIIiliiiliIIili || !this.iliilIlIiiilIl.Iliilliiilii(var3, true))) {
            this.iIIIlIlIIl(drill, this.IililIllililIl.liliIIiliiiliIIili ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>());
            return false;
         } else {
            return true;
         }
      } else {
         return true;
      }
   }

   private boolean IliIilliIi(class_746 p) {
      long var25 = 3719786041390025955L;
      long var27 = -5849117211346292244L;
      if (p.method_24828() && this.iIIIiIlIlIIiIl != null) {
         double var2 = (double)this.iIIIiIlIlIIiIl.Iiilliiliiil() + (double)0.5F;
         double var4 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? p.method_23321() : p.method_23317();
         double var6 = var4 - var2;
         double var8 = Math.abs(var6);
         if (var8 <= 0.15) {
            return false;
         } else {
            double var10 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? (double)0.0F : -var6;
            double var12 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? -var6 : (double)0.0F;
            class_638 var14 = this.lllilIlillilIl.field_1687;
            if (var14 != null) {
               var25 ^= ((long)((int)Math.floor(p.method_23317() + Math.signum(var10) * 0.35)) << 32 ^ var25) & -1L << 32;
               var25 ^= ((long)((int)Math.floor(p.method_23321() + Math.signum(var12) * 0.35)) ^ var25) & -1L >>> 32;
               var27 ^= ((long)((int)Math.floor(p.method_23318() - 0.1)) << 32 ^ var27) & -1L << 32;
               if (!lllIIlilillIIlil.iliIiiliiiii(var14, new class_2338((int)(var25 >>> 32), (int)(var27 >>> 32), (int)var25))) {
                  return false;
               }

               var27 ^= ((long)((int)Math.floor(p.method_23318() + 0.01)) ^ var27) & -1L >>> 32;
               if (!lllIIlilillIIlil.lIiiIiIlilli(var14, new class_2338((int)(var25 >>> 32), (int)var27, (int)var25)) || !lllIIlilillIIlil.lIiiIiIlilli(var14, new class_2338((int)(var25 >>> 32), (int)var27 + 1, (int)var25))) {
                  return false;
               }
            }

            double var15 = Math.toRadians((double)p.method_36454());
            double var17 = Math.sin(var15);
            double var19 = Math.cos(var15);
            double var21 = var12 * var19 - var10 * var17;
            double var23 = var12 * var17 + var10 * var19;
            this.lIiilIliIiilIl.liiiIIllIl(iliIiIiiIi(var21), iliIiIiiIi(var23), false, false, false);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + String.format(iiIIIlIIlIIl<invokedynamic>(), var8) + iiIIIlIIlIIl<invokedynamic>();
            return true;
         }
      } else {
         return false;
      }
   }

   private void Ilillllill(class_2338 drill, double pos, boolean reach) {
      if (this.iililIlIIiilIl.IlIillIiilIi(drill)) {
         if (this.IililIllililIl.ilIIlIiliIiIIlIili) {
            reach = false;
         }

         class_746 var5 = this.lllilIlillilIl.field_1724;
         if (var5 != null) {
            this.lIiIiiIiIi(var5, drill);
         }

         if (!drill.equals(this.lIlIiIliIlIiIl)) {
            this.lIlIiIliIlIiIl = drill.method_10062();
         }

         this.IllIiIllllIiIl = reach;
         if (!this.IliilIllliilIl.iliIiiliiiii(drill, pos, reach)) {
            this.IliilIllliilIl.Illillliilli();
            this.lIlIiIliIlIiIl = null;
         }

      }
   }

   private void illliIilli(class_1937 w, class_2338 pos) {
      this.lIiilIliIiilIl.iIlIlllllill();
      if (!this.IlIiillIii(w, pos)) {
         this.IliilIllliilIl.Illillliilli();
         this.lIlIiIliIlIiIl = null;
      } else if (!this.iIiilIliil(pos)) {
         this.IliilIllliilIl.Illillliilli();
         this.lIlIiIliIlIiIl = null;
         this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
      } else {
         class_746 var3 = this.lllilIlillilIl.field_1724;
         this.Ilillllill(pos, Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, var3 != null ? var3.method_55754() : this.IililIllililIl.iIiiIIiliIliiIIili), true);
         if (this.lIlIiIliIlIiIl == null) {
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
         } else {
            this.iiliIllIIiiIll = this.ililiIlIiiliIl > 200 ? iiIIIlIIlIIl<invokedynamic>() + this.ililiIlIiiliIl / 20 + iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>() + this.iIIIiIlIlIIiIl.IIlllIlliIll() + iiIIIlIIlIIl<invokedynamic>() + this.iIIIiIlIlIIiIl.Illlllllilll() + iiIIIlIIlIIl<invokedynamic>();
         }

      }
   }

   private boolean lIIiiiIIii(class_2338 pos) {
      return !this.IiIlIllliIlIll.contains(pos) && (this.iililIlIIiilIl.iliIiiliiiii(pos) || this.IIIIiIllIIIiIl != null && this.IIIIiIllIIIiIl.iIlIlllllill().contains(pos));
   }

   private class_2338 Iillllilll(class_1937 pos, class_746 w, class_2338 p) {
      long var17 = 1397557694723406003L;
      long var15 = -3155302636900935644L;
      class_2338 var4 = w.method_24515();

      for(var15 ^= (4294967296L ^ var15) & -1L << 32; (int)(var15 >>> 32) <= 3; var15 += 4294967296L) {
         class_2338 var6 = null;
         double var7 = Double.MAX_VALUE;

         for(var15 ^= ((long)(-((int)(var15 >>> 32))) ^ var15) & -1L >>> 32; (int)var15 <= (int)(var15 >>> 32); var15 ^= (var15 ^ var15 + (long)1) & -1L >>> 32) {
            for(var17 ^= ((long)(-((int)(var15 >>> 32))) << 32 ^ var17) & -1L << 32; (int)(var17 >>> 32) <= (int)(var15 >>> 32); var17 += 4294967296L) {
               if (Math.max(Math.abs((int)var15), Math.abs((int)(var17 >>> 32))) == (int)(var15 >>> 32)) {
                  for(var17 ^= (-3L ^ var17) & -1L >>> 32; (int)var17 <= 1; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
                     class_2338 var12 = p.method_10069((int)var15, (int)var17, (int)(var17 >>> 32));
                     if (this.iililIlIIiilIl.IlIillIiilIi(var12) && !this.iIilIllIlilIll.contains(var12) && lllIIlilillIIlil.IIIllIIliIIl(pos, var12) && this.IliilIllliilIl.Illlllllilll(var12, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
                        double var13 = var12.method_10262(var4) + (double)(Math.abs(var12.method_10264() - var4.method_10264()) * 25);
                        if (var13 < var7) {
                           var7 = var13;
                           var6 = var12;
                        }
                     }
                  }
               }
            }
         }

         if (var6 != null) {
            return var6;
         }
      }

      for(long var22 = var15 ^ (-17179869184L ^ var15) & -1L << 32; (int)(var22 >>> 32) <= -2; var22 += 4294967296L) {
         class_2338 var19 = p.method_10086((int)(var22 >>> 32));
         if (this.iililIlIIiilIl.IlIillIiilIi(var19) && !this.iIilIllIlilIll.contains(var19) && lllIIlilillIIlil.IIIllIIliIIl(pos, var19) && this.IliilIllliilIl.Illlllllilll(var19, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
            return var19;
         }
      }

      return null;
   }

   private void ilIIiIiIIi(class_746 p) {
      long var9 = -4272824912111344429L;
      this.IilIililIi();
      if (p != null) {
         class_2338 var2 = this.iIIIiIlIlIIiIl.Ililllililil();
         var9 ^= ((long)this.iIIIiIlIlIIiIl.IiIlliIliiIl() << 32 ^ var9) & -1L << 32;
         if (this.iIIIiIlIlIIiIl.iIIIlIlIIl() - this.iIIIiIlIlIIiIl.IIIIllIIIl() >= 2) {
            var9 ^= ((long)Math.max(this.iIIIiIlIlIIiIl.IIIIllIIIl() + 1, Math.min(this.iIIIiIlIlIIiIl.iIIIlIlIIl() - 1, (int)(var9 >>> 32))) << 32 ^ var9) & -1L << 32;
         }

         class_2338 var4 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var9 >>> 32), this.iIIIiIlIlIIiIl.Iiilliiliiil(), var2.method_10264());
         class_638 var5 = this.lllilIlillilIl.field_1687;
         class_2338 var6 = null;
         if (var5 != null) {
            for(long var12 = var9 ^ ((long)(this.iIIIiIlIlIIiIl.liiiIIllIl() + 3) ^ var9) & -1L >>> 32; (int)var12 >= this.iIIIiIlIlIIiIl.liiiIIllIl(); var12 ^= (var12 ^ var12 + (long)-1) & -1L >>> 32) {
               class_2338 var8 = new class_2338(var4.method_10263(), (int)var12, var4.method_10260());
               if (lllIIlilillIIlil.IIIllIIliIIl(var5, var8)) {
                  var6 = var8;
                  break;
               }
            }
         }

         if (var6 == null) {
            var6 = new class_2338(var4.method_10263(), this.iIIIiIlIlIIiIl.liiiIIllIl() + 1, var4.method_10260());
         }

         this.lllIIllillIIll = var6.method_10062();
         this.lIIIIlliIIIIll = this.lllIIllillIIll;
         this.IilIIlllilIIll = var6.method_10264();
      }
   }

   iilIiiIiIIiIiiIi IIlllIlliIll() {
      return this.lIiilIliIiilIl;
   }

   private boolean iIIilIlIil(class_746 p) {
      long var7 = -2299137160914766451L;
      long var9 = 994059383679065602L;
      long var11 = 4045376705850078848L;
      if (!this.IililIllililIl.iiiiIIiliIIIIlIili) {
         this.IIIIllllIIIlll = false;
         return false;
      } else if (this.illIlllIilIlll) {
         var7 ^= ((long)(this.lllilIlillilIl.field_1687 != null && !this.lllilIlillilIl.field_1687.method_8390(class_1303.class, p.method_5829().method_1014((double)4.0F), (e) -> true).isEmpty() ? 1 : 0) << 32 ^ var7) & -1L << 32;
         if ((int)(var7 >>> 32) != 0 && ++this.lilIllliilIlll <= 200) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.IliilIllliilIl.Iilililiiili();
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            return true;
         } else {
            this.illIlllIilIlll = false;
            this.lilIllliilIlll = 0;
            return false;
         }
      } else {
         class_1661 var2 = p.method_31548();
         if (!this.IIIIllllIIIlll) {
            if (this.IIIIiIllIIIiIl.lIiiIiIlilli() || this.IiilIllliilIll) {
               return false;
            }

            var7 ^= ((long)var2.method_67532() ^ var7) & -1L >>> 32;
            class_1799 var4 = var2.method_5438((int)var7);
            if (!var4.method_7963() || var4.method_7936() - var4.method_7919() > this.IililIllililIl.lIIIlIiliiIIIlIili) {
               return false;
            }

            if (this.IiIIlllliIIlll) {
               if (lIliliIlil(var2, class_1802.field_8287) < 0 && Illillllil(var2, class_1802.field_8287) < 0) {
                  return false;
               }

               this.IiIIlllliIIlll = false;
            }

            this.IIIIllllIIIlll = true;
            this.iIIIlllIlIIlll = (int)var7;
            this.llIIlllilIIlll = 0;
            this.iiIIlllIIlIlll = 0;
            this.lIlIllliIlIlll = Integer.MAX_VALUE;
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + (var4.method_7936() - var4.method_7919()) + iiIIIlIIlIIl<invokedynamic>());
         }

         class_1799 var3 = var2.method_5438(this.iIIIlllIlIIlll);
         var9 ^= ((long)(var3.method_7960() ? -1 : var3.method_7919()) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) >= 0 && (int)(var9 >>> 32) < this.lIlIllliIlIlll) {
            this.iiIIlllIIlIlll = 0;
         } else if (++this.iiIIlllIIlIlll > 1200) {
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
            this.IiIIlllliIIlll = true;
            this.IiIilliIil(p);
            this.IIIIllllIIIlll = false;
            this.iiIIlllIIlIlll = 0;
            this.lIlIllliIlIlll = Integer.MAX_VALUE;
            return false;
         }

         this.lIlIllliIlIlll = (int)(var9 >>> 32) < 0 ? Integer.MAX_VALUE : (int)(var9 >>> 32);
         if (!var3.method_7960() && var3.method_7963() && var3.method_7919() != 0) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.IliilIllliilIl.Iilililiiili();
            this.lIlIiIliIlIiIl = null;
            if (var2.method_67532() != this.iIIIlllIlIIlll) {
               var2.method_61496(this.iIIIlllIlIIlll);
            }

            if (p.method_6079().method_7909() != class_1802.field_8287) {
               var9 ^= ((long)lIliliIlil(var2, class_1802.field_8287) ^ var9) & -1L >>> 32;
               var11 ^= ((long)((int)var9 >= 0 ? 36 + (int)var9 : Illillllil(var2, class_1802.field_8287)) << 32 ^ var11) & -1L << 32;
               if ((int)(var11 >>> 32) < 0) {
                  if (++this.IllIllllllIlll <= 20) {
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                     return true;
                  } else {
                     this.IllIllllllIlll = 0;
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + (var3.method_7936() - var3.method_7919()) + iiIIIlIIlIIl<invokedynamic>());
                     this.IiIIlllliIIlll = true;
                     this.IiIilliIil(p);
                     this.IIIIllllIIIlll = false;
                     this.illIlllIilIlll = true;
                     this.lilIllliilIlll = 0;
                     return true;
                  }
               } else {
                  this.IllIllllllIlll = 0;
                  this.llIililIil((int)(var11 >>> 32));
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                  return true;
               }
            } else {
               p.method_36457(Math.min(90.0F, p.method_36455() + 30.0F));
               if (++this.llIIlllilIIlll >= 4) {
                  this.llIIlllilIIlll = 0;
                  class_1269 var5 = this.lllilIlillilIl.field_1761.method_2919(p, class_1268.field_5810);
                  if (var5.method_23665()) {
                     p.method_6104(class_1268.field_5810);
                  }
               }

               this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + (var3.method_7936() - var3.method_7919()) + iiIIIlIIlIIl<invokedynamic>() + var3.method_7936();
               return true;
            }
         } else {
            var2.method_61496(this.iIIIlllIlIIlll);
            this.IiIilliIil(p);
            this.IIIIllllIIIlll = false;
            this.IllIllllllIlll = 0;
            if (!var3.method_7960() && var3.method_7963() && var3.method_7919() == 0) {
               this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
            }

            this.illIlllIilIlll = true;
            this.lilIllliilIlll = 0;
            return true;
         }
      }
   }

   public class_2338 Iilllilliill() {
      return this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili() ? this.iIIIiIlIlIIiIl.Ililllililil() : null;
   }

   private class_2338 lIilliIill(class_1937 w, class_746 p) {
      long var16 = 6916485899994570893L;
      long var18 = 415943286735687634L;
      long var20 = -5104045307591965143L;
      class_2338 var3 = p.method_24515();
      var16 ^= ((long)this.iIIIiIlIlIIiIl.Ililllililil().method_10264() << 32 ^ var16) & -1L << 32;
      class_2338 var5 = null;
      var16 ^= ~var16 & -1L >>> 32;
      double var7 = Double.MAX_VALUE;

      for(var18 ^= ((long)this.iIIIiIlIlIIiIl.liiiIIllIl() << 32 ^ var18) & -1L << 32; (int)(var18 >>> 32) >= this.iIIIiIlIlIIiIl.iIlIlllllill(); var18 += -4294967296L) {
         for(var18 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() ^ var18) & -1L >>> 32; (int)var18 <= this.iIIIiIlIlIIiIl.iIIIlIlIIl(); var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32) {
            for(var20 ^= ((long)this.iIIIiIlIlIIiIl.llIIlilIIl() << 32 ^ var20) & -1L << 32; (int)(var20 >>> 32) <= this.iIIIiIlIlIIiIl.IiIIlliIIl(); var20 += 4294967296L) {
               class_2338 var12 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)var18, (int)(var20 >>> 32), (int)(var18 >>> 32));
               if (this.IIliilIlii(w, var12) && !this.lIllIlliIllIll.containsKey(var12) && !this.IlllIllllllIll.containsKey(var12)) {
                  var20 ^= ((long)(this.IIIillIIil(w, var12) + ((int)(var18 >>> 32) == (int)(var16 >>> 32) ? 100 : 0)) ^ var20) & -1L >>> 32;
                  double var14 = var12.method_10262(var3);
                  if ((int)var20 > (int)var16 || (int)var20 == (int)var16 && var14 < var7) {
                     var16 ^= ((long)((int)var20) ^ var16) & -1L >>> 32;
                     var7 = var14;
                     var5 = var12.method_10062();
                  }
               }
            }
         }
      }

      return var5;
   }

   private boolean liIiiiiIii(class_1937 pos, class_2338 w) {
      return this.IIliilIlii(pos, w) && !this.ilIiiIiIii(w);
   }

   // $FF: synthetic method
   private static CallSite lIlIIliIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) >>> 3 | (char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) << 13) >>> 7 | (char)((char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) >>> 3 | (char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) << 13) << 9) + var5) >>> 11 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) >>> 3 | (char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) << 13) >>> 7 | (char)((char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) >>> 3 | (char)((char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) >>> 11 | (char)(-((char)((char)(-((char)(var4[var5] >>> 11 | var4[var5] << 5))) - var5))) << 5) << 13) << 9) + var5) << 5) - var5) ^ var5))))) ^ 15370));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIlliiIlli(class_1937 w, class_2338 pos) {
      this.lIiilIliIiilIl.iIlIlllllill();
      this.lIlIiIliIlIiIl = null;
      if (this.IlIiillIii(w, pos)) {
         class_746 var3 = this.lllilIlillilIl.field_1724;
         double var4 = var3 != null ? Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, var3.method_55754()) : this.IililIllililIl.iIiiIIiliIliiIIili;
         if (!this.IliilIllliilIl.IilliliilIIi(pos, var4)) {
            this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
         } else if (var3 == null || this.iiiilIIIIi(var3, pos) || !this.IliIilliIi(var3)) {
            if (this.iIiilIliil(pos)) {
               this.lililiilil(llliIiIiilliIiIi.IIIliIiIIi);
            } else {
               this.iiliIllIIiiIll = this.ililiIlIiiliIl > 200 ? iiIIIlIIlIIl<invokedynamic>() + this.ililiIlIiiliIl / 20 + iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>();
            }

         }
      }
   }

   public class_2338 lIiiIiIlilli() {
      return this.lIlIiIliIlIiIl;
   }

   void IIIilIIiiIIi() {
      this.lIlIiIliIlIiIl = null;
      this.IliilIllliilIl.Illillliilli();
   }

   public lllIlIIlillIlIIl IlIlllIlilIl() {
      return this.IIIIiIllIIIiIl;
   }

   public boolean Ililllililil() {
      if (this.llIIiIlilIIiIl != lilIIliiilIIli.illIliiiiIilIliiii) {
         return false;
      } else {
         class_2338 var1 = this.IliilIllliilIl.IIiilIiiiIii();
         return var1 != null && this.iIiilIliil(var1);
      }
   }

   void IiIiliIiiiIi() {
      this.lIlIiIliIlIiIl = null;
      this.IliilIllliilIl.Iilililiiili();
   }

   private void IIiillIiil() {
      this.lIiliIliIiliIl = llliIiIiilliIiIi.IiiIiIiIIi;
      this.ililiIlIiiliIl = 0;
      this.liiliIliiiliIl = 0;
      this.lIliiIliIliiIl = null;
      this.IlliiIlllliiIl = this.IIilIlllIilIll > 0;
      this.iIilIllIlilIll.clear();
   }

   private boolean iiiilIIIIi(class_746 pos, class_2338 p) {
      long var6 = -1398376562658687017L;
      var6 ^= ((long)this.iIIIiIlIlIIiIl.Iiilliiliiil() << 32 ^ var6) & -1L << 32;
      double var4 = this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? pos.method_23321() - ((double)((int)(var6 >>> 32)) + (double)0.5F) : pos.method_23317() - ((double)((int)(var6 >>> 32)) + (double)0.5F);
      if (Math.abs(var4) > 0.22) {
         return false;
      } else {
         return Math.abs(this.lIIIiiIIIi(pos, p)) >= 0.7;
      }
   }

   private void IIiIllIiIl() {
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (var1 != null && this.IiIIiIlliIIiIl != null && var1.field_3913 == this.lIiilIliIiilIl) {
         var1.field_3913 = this.IiIIiIlliIIiIl;
      }

      this.IiIIiIlliIIiIl = null;
      this.lIiilIliIiilIl.iIlIlllllill();
      this.lIiilIliIiilIl.IilliliilIIi();
   }

   public String llIIlilIIl() {
      long var17 = -1175568952834260982L;
      long var11 = -9022034770842351169L;
      long var13 = -1923738034190330336L;
      long var15 = 1504242385937280203L;
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (var1 != null && this.lllilIlillilIl.field_1687 != null) {
         if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
            return iiIIIlIIlIIl<invokedynamic>();
         } else if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii) {
            this.illIlIilIl();
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
            return null;
         } else if (!this.iililIlIIiilIl.IIIllIIliIIl()) {
            return iiIIIlIIlIIl<invokedynamic>();
         } else {
            var11 ^= ((long)(this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Illillliilli() && this.iIIIiIlIlIIiIl.IIiIllIiIl(this.iililIlIIiilIl) ? 1 : 0) << 32 ^ var11) & -1L << 32;
            if ((int)(var11 >>> 32) != 0) {
               this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + this.iIIIiIlIlIIiIl.lilIliilIl());
               this.IliliIllliliIl = null;
               this.IIilIlllIilIll = 0;
               this.IilIililIi();
               this.IIiiiIllIiiiIl.clear();
               this.iIiiiIlIliiiIl = null;
               this.lliiiIliliiiIl = null;
               this.IiiiiIlliiiiIl = 0;
               this.IIiillIiil();
               this.lliliilili();
            } else {
               this.lilIliilIl();
               var11 ^= ((long)(this.iililIlIIiilIl.Ililllililil() >= this.iililIlIIiilIl.IIIilIIiiIIi() ? 1 : 0) ^ var11) & -1L >>> 32;
               class_2338 var4 = var1.method_24515();
               var13 ^= ((long)((int)var11 != 0 ? var4.method_10263() : var4.method_10260()) << 32 ^ var13) & -1L << 32;
               var13 ^= ((long)((int)var11 != 0 ? var4.method_10260() : var4.method_10263()) ^ var13) & -1L >>> 32;
               var15 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.IlIlllIlilIl() : this.iililIlIIiilIl.IIlllIlliIll()) << 32 ^ var15) & -1L << 32;
               var15 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.Illlllllilll() : this.iililIlIIiilIl.IIillIiliIil()) ^ var15) & -1L >>> 32;
               var17 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.IIlllIlliIll() : this.iililIlIIiilIl.IlIlllIlilIl()) << 32 ^ var17) & -1L << 32;
               var17 ^= ((long)((int)var11 != 0 ? this.iililIlIIiilIl.IIillIiliIil() : this.iililIlIIiilIl.Illlllllilll()) ^ var17) & -1L >>> 32;
               this.iIIIiIlIlIIiIl = new iIiiiIIlIliiiIIl(this.iililIlIIiilIl, this.IililIllililIl.lIliIIiliiIliIIili, this.IililIllililIl.IlliIIilillliIIili, Math.abs((int)var13 - (int)var17) < Math.abs((int)var13 - (int)(var17 >>> 32)), Math.abs((int)(var13 >>> 32) - (int)var15) < Math.abs((int)(var13 >>> 32) - (int)(var15 >>> 32)));
               this.IIIIiIllIIIiIl = new lllIlIIlillIlIIl(this.lllilIlillilIl, this.IililIllililIl, this.lIiilIliIiilIl, this.IliilIllliilIl, this.iililIlIIiilIl);
               this.lllliIlillliIl = 0;
               this.IilliIllilliIl = 0;
               this.illiiIlIiliiIl = -1;
               this.iilliIlIIiliIl = false;
               this.lIiliIliIiliIl = llliIiIiilliIiIi.IiiIiIiIIi;
               this.IliliIllliliIl = null;
               this.ililiIlIiiliIl = 0;
               this.lIliiIliIliiIl = null;
               this.IIilIlllIilIll = 0;
               this.iIilIllIlilIll.clear();
               this.llilIllililIll = 0;
               this.IlIiIllllIiIll = 0;
               this.IiIlIllliIlIll.clear();
               this.iiIlIllIIllIll.clear();
               this.IliilIllliilIl.liiiIIllIl();
               this.IiilIllliilIll = false;
               this.ilIiIllIiIiIll = false;
               this.iiliIllIIiiIll = "";
               this.illIiIlIilIiIl.clear();
               this.lilIiIliilIiIl.clear();
               this.IIiIiIllIiIiIl.clear();
               this.iIlliIlIllliIl.clear();
               this.IIiiiIllIiiiIl.clear();
               this.iIiiiIlIliiiIl = null;
               this.IilIililIi();
               this.lliliilili();
            }

            this.IiIIlliIIl();
            this.iIiIiIlIliIiIl = 0;
            this.lliIiIliliIiIl = false;
            this.IiiIiIlliiIiIl = false;
            this.iiiIiIlIIIliIl = false;
            this.lIIliIliIIliIl.clear();
            this.IIIiiIllIIiiIl = 20;
            this.IiIIiIlliIIiIl = var1.field_3913;
            var1.field_3913 = this.lIiilIliIiilIl;
            this.llIIiIlilIIiIl = lilIIliiilIIli.illIliiiiIilIliiii;
            if (!this.IililIllililIl.ilIIlIiliIiIIlIili && this.IliilIllliilIl.IIIllIIliIIl(var1) < 0) {
               this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + this.IililIllililIl.IlIIlIilillIIlIili + iiIIIlIIlIIl<invokedynamic>());
            }

            return null;
         }
      } else {
         return iiIIIlIIlIIl<invokedynamic>();
      }
   }

   public void illIlIilIl() {
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii) {
         this.llIIiIlilIIiIl = lilIIliiilIIli.illIliiiiIilIliiii;
         this.iiIIiIlIIlIiIl = false;
         this.illIiIlIilIiIl.clear();
         this.iIlliIlIllliIl.clear();
         this.IIiiiIllIiiiIl.clear();
         this.iIiiiIlIliiiIl = null;
         this.IilIililIi();
         this.IliliIllliliIl = null;
         this.IIilIlllIilIll = 0;
         this.IIiillIiil();
         this.lliliilili();
      } else if (this.llIIiIlilIIiIl == lilIIliiilIIli.IllIliiiilllIliiii && this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Illillliilli()) {
         String var1 = this.llIIlilIIl();
         if (var1 != null) {
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + var1);
         }
      }

   }

   private boolean iIiilIliil(class_2338 pos) {
      class_239 var2 = this.lllilIlillilIl.field_1765;
      boolean var10000;
      if (var2 instanceof class_3965 var3) {
         if (var3.method_17783() == class_240.field_1332 && var3.method_17777().equals(pos)) {
            var10000 = true;
            return var10000;
         }
      }

      var10000 = false;
      return var10000;
   }

   private void iiIliIIlli(class_1937 fc, class_2338 w) {
      long var11 = -5799466550280555524L;
      long var13 = 5551207247706446362L;
      class_746 var3 = this.lllilIlillilIl.field_1724;
      var11 ^= ((long)(var3 != null && lllIIlilillIIlil.iliIiiliiiii(fc, var3.method_24515().method_10074()) ? 1 : 0) << 32 ^ var11) & -1L << 32;
      double var5 = (double)0.0F;
      if (var3 != null && this.iIIIiIlIlIIiIl != null) {
         double var7 = (double)this.iIIIiIlIlIIiIl.Iiilliiliiil() + (double)0.5F;
         var5 = (this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? var3.method_23321() : var3.method_23317()) - var7;
      }

      var11 ^= ((long)(var3 == null || (int)(var11 >>> 32) == 0 || this.IIIIiIllIIIiIl.lIiiIiIlilli() || !this.IliilIllliilIl.IIlllIlliIll(w, this.IililIllililIl.iIiiIIiliIliiIIili) || this.IIilIlllIilIll <= 0 && !this.Iiiilliiil(var3, w) ? 0 : 1) ^ var11) & -1L >>> 32;
      if ((int)var11 != 0 && Math.abs(var5) <= 0.22) {
         if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
            this.IIIIiIllIIIiIl.IIIllIIliIIl();
         }

         this.lIiilIliIiilIl.iIlIlllllill();
         this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
      } else {
         if ((int)var11 != 0 && Math.abs(var5) <= 0.35) {
            if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.IIIIiIllIIIiIl.IIIllIIliIIl();
            }

            if (this.IliIilliIi(var3)) {
               this.lIlIiIliIlIiIl = null;
               return;
            }

            if (Math.abs(var5) <= 0.22) {
               this.lIiilIliIiilIl.iIlIlllllill();
               this.IIilIlllIilIll = 0;
               this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
               return;
            }
         }

         class_2338 var8;
         if (this.IlliiIlllliiIl) {
            var8 = this.iIIIiIlIlIIiIl.IiIiliIiiiIi();
         } else {
            var13 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var13) & -1L << 32;
            var13 ^= ((long)this.iIIIiIlIlIIiIl.iIIIlIlIIl() ^ var13) & -1L >>> 32;
            if ((int)var13 - (int)(var13 >>> 32) >= 2 && (this.iIIIiIlIlIIiIl.IiIlliIliiIl() == (int)(var13 >>> 32) || this.iIIIiIlIlIIiIl.IiIlliIliiIl() == (int)var13)) {
               var8 = this.iIIIiIlIlIIiIl.IIlilIliiIli(this.iIIliIlIli(), this.iIIIiIlIlIIiIl.Iiilliiliiil(), this.iIIIiIlIlIIiIl.iIlIlllllill());
            } else {
               var8 = this.iIIIiIlIlIIiIl.IlIillIiilIi();
            }
         }

         if (var3 == null || !this.Iliilliiilii(fc, var3, var8)) {
            if (var3 == null || !lllIIlilillIIlil.liiiIIllIl(fc, var8.method_10074()) && !this.IIiilIiiiIii(var3, var8)) {
               lillilliillill var9 = this.IIIIiIllIIIiIl.IIlilIliiIli(var8);
               if (var9 == lillilliillill.ilIilIlIiIiIilIlIi) {
                  this.iiliIllIIiiIll = this.IIIIiIllIIIiIl.lIiiIiIlilli() ? iiIIIlIIlIIl<invokedynamic>() : (this.IIIIiIllIIIiIl.iliIiiliiiii() ? iiIIIlIIlIIl<invokedynamic>() : (this.IlliiIlllliiIl ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>()));
                  this.lIlIiIliIlIiIl = null;
               } else if (var9 == lillilliillill.IIlilIlIilIlilIlIi) {
                  if (var3 == null || !this.IIIlilIIli(fc, var3, w, Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, var3.method_55754()))) {
                     if (this.IIilIlllIilIll == 0 && !this.IlliiIlllliiIl) {
                        this.IIilIlllIilIll = 3;
                        this.IlliiIlllliiIl = true;
                        this.IIIIiIllIIIiIl.IliIlllilIi();
                        this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                     } else {
                        this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                        this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                     }
                  }
               } else {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.IIilIlllIilIll = 0;
                  this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
               }

            } else {
               this.iIilIllIlilIll.add(var8.method_10062());
               this.IIIIiIllIIIiIl.IliIlllilIi();
               this.IIliIlllIliIll = null;
               if (++this.IiliIllliliIll >= 3) {
                  this.IiliIllliliIll = 0;
                  this.lIllIlliIllIll.put(w.method_10062(), 1200);
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
               } else {
                  this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                  this.iiliIllIIiiIll = lllIIlilillIIlil.liiiIIllIl(fc, var8.method_10074()) ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>();
               }
            }
         }
      }
   }

   private void lIIlliIIll(class_746 p, class_1937 w) {
      long var4 = 7102846291726977586L;
      if (this.IiiIiIlliiIiIl) {
         this.iIlllIllll(p, w);
      } else if (!this.iIIIiIlIlIIiIl.Iilililiiili()) {
         this.lliililiil(w);
      } else if (!this.IlIllllIll(p, w)) {
         var4 ^= ((long)(this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1) << 32 ^ var4) & -1L << 32;
         this.lliliilili();
         this.illIiIlIilIiIl.clear();
         this.iIlliIlIllliIl.clear();
         this.IIIIiIllIIIiIl.IilliliilIIi();
         this.IIiiiIllIiiiIl.clear();
         this.lIIlllliIIllll = false;
         if (this.iIIIiIlIlIIiIl.Iliilliiilii()) {
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + (int)(var4 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1));
            this.iiliIllIIiiIll = "";
            this.IlIIIllllIIIll = 0;
            this.ilIIiIiIIi(p);
         } else if (this.IililIllililIl.IIiiIIililIiiIIili) {
            this.IIllllIlll();
         } else {
            this.iIiIlIliIl(-1);
         }

      }
   }

   public void iiIIlIIlIl() {
      this.iiIIiIlIIlIiIl = false;
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         this.llIIiIlilIIiIl = lilIIliiilIIli.lilIliiiiiilIliiii;
         this.lIiilIliIiilIl.iIlIlllllill();
         this.IliilIllliilIl.Iilililiiili();
      }

   }

   private void Iiililiili() {
      this.lIlIiIliIlIiIl = null;
      this.IliilIllliilIl.Iilililiiili();
   }

   // $FF: synthetic method
   private static CallSite lilIIliilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') << 4) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') << 4) >>> 2) ^ var5))) << 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') << 4) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) - '鎉')) + var5) ^ var5) ^ 19276) - var5) + '\udb7d') << 4) >>> 2) ^ var5))) >>> 2) + var5) + var5) + '\ue434'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lilIliilIl() {
      this.IIiIllIiIl();
      this.IliilIllliilIl.Iilililiiili();
      this.lIlIiIliIlIiIl = null;
      this.iiIIiIlIIlIiIl = false;
      this.liiilIliiiilIl.lIiiIiIlilli();
      this.iliilIlIiiilIl.IliIlllilIi();
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (var1 != null) {
         this.IiIilliIil(var1);
      }

      this.IIIIllllIIIlll = false;
      this.llIIiIlilIIiIl = this.iIIIiIlIlIIiIl != null && this.iIIIiIlIlIIiIl.Illillliilli() ? lilIIliiilIIli.IIiIliiiilIiIliiii : lilIIliiilIIli.IllIliiiilllIliiii;
   }

   public iIiIlIliIl(class_310 config, ilIIIIiIiIIIIi mc, llilIIIiililIIIi selection) {
      this.llIIiIlilIIiIl = lilIIliiilIIli.IllIliiiilllIliiii;
      this.illIiIlIilIiIl = new HashSet();
      this.lilIiIliilIiIl = new HashSet();
      this.IIiIiIllIiIiIl = new HashSet();
      this.lIIliIliIIliIl = new ArrayList();
      this.iIlliIlIllliIl = new HashSet();
      this.lIiliIliIiliIl = llliIiIiilliIiIi.IiiIiIiIIi;
      this.illiiIlIiliiIl = -1;
      this.IIiiiIllIiiiIl = new ArrayDeque();
      this.IiIlIllliIlIll = new HashSet();
      this.iiIlIllIIllIll = new HashMap();
      this.lIllIlliIllIll = new HashMap();
      this.IlllIllllllIll = new HashMap();
      this.illlIllIillIll = new HashMap();
      this.iIilIllIlilIll = new HashSet();
      this.iiliIllIIiiIll = "";
      this.iIIIlllIlIIlll = -1;
      this.lIlIllliIlIlll = Integer.MAX_VALUE;
      this.IIiIllllIiIlll = -1;
      this.lliIllliliIlll = -1;
      this.lllilIlillilIl = config;
      this.IililIllililIl = mc;
      this.iililIlIIiilIl = selection;
      this.IliilIllliilIl = new liiiliIliiiiliIl(config, mc);
      this.iliilIlIiiilIl = new lIIIliiliIIIliil(this, config);
      this.liiilIliiiilIl = new iIIiIliIlIiIli(config, mc);
      this.IIIIiIllIIIiIl = new lllIlIIlillIlIIl(config, mc, this.lIiilIliIiilIl, this.IliilIllliilIl, selection);
      this.IliilIllliilIl.iIlIlllllill(this::IIIIllIIIl);
      ClientTickEvents.END_CLIENT_TICK.register((ClientTickEvents.EndTick)(client) -> this.iiIilIIlil());
   }

   private class_2338 lllllillll(class_746 p) {
      class_2338 var2 = p.method_24515();
      class_2338 var3 = null;
      double var4 = Double.MAX_VALUE;

      for(class_2338 var7 : this.lIIliIliIIliIl) {
         if (!this.lIllIlliIllIll.containsKey(var7) && !this.IlllIllllllIll.containsKey(var7)) {
            double var8 = var7.method_10262(var2) - (double)var7.method_10264() * (double)0.5F;
            if (var8 < var4) {
               var4 = var8;
               var3 = var7;
            }
         }
      }

      return var3;
   }

   public lilIIliiilIIli IliIlllilIi() {
      return this.llIIiIlilIIiIl;
   }

   // $FF: synthetic method
   private static CallSite IIiIIllIiIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) << 4) + 20097))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) << 4) + 20097))))) >>> 7))))) + '\uda4a') >>> 10 | (char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) << 4) + 20097))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') >>> 4 | (char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) << 12 | (char)(var4[var5] >>> 4 | var4[var5] << 12) >>> 4) + var5) - 27053) ^ '\uf812') << 12) ^ 4507) - var5) << 4) + 20097))))) >>> 7))))) + '\uda4a') << 6) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private double lIIIiiIIIi(class_746 p, class_2338 pos) {
      return this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? p.method_23317() - ((double)pos.method_10263() + (double)0.5F) : p.method_23321() - ((double)pos.method_10260() + (double)0.5F);
   }

   private static float iliIiIiiIi(double v) {
      if (Math.abs(v) < 0.04) {
         return 0.0F;
      } else {
         return v > (double)0.0F ? 1.0F : -1.0F;
      }
   }

   private static boolean IlIIillIIi(class_746 p, class_2338 pos, double maxDeg) {
      class_243 var4 = p.method_33571();
      double var5 = (double)pos.method_10264() + (double)0.5F - var4.field_1351;
      double var7 = Math.hypot((double)pos.method_10263() + (double)0.5F - var4.field_1352, (double)pos.method_10260() + (double)0.5F - var4.field_1350);
      return Math.abs(Math.toDegrees(Math.atan2(var5, var7))) <= maxDeg;
   }

   public boolean liiiIIllIl() {
      return this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii || this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii;
   }

   private static int Illillllil(class_1661 inv, class_1792 item) {
      long var3 = 8118157587625206721L;

      for(long var5 = var3 ^ (38654705664L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 36; var5 += 4294967296L) {
         if (inv.method_5438((int)(var5 >>> 32)).method_7909() == item) {
            return (int)(var5 >>> 32);
         }
      }

      return -1;
   }

   private class_2350 IIlIilIlIi() {
      if (this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048) {
         return this.iIIIiIlIlIIiIl.IlIlllIlilIl() > 0 ? class_2350.field_11034 : class_2350.field_11039;
      } else {
         return this.iIIIiIlIlIIiIl.IlIlllIlilIl() > 0 ? class_2350.field_11035 : class_2350.field_11043;
      }
   }

   void Iiilliiliiil(String s) {
      this.iiliIllIIiiIll = s;
   }

   private class_2338 iIliiIllii(class_1937 w, class_746 pos, class_2338 p) {
      long var17 = -712683163615128895L;
      long var19 = -7887883092750334208L;
      long var21 = 5037015855467494728L;
      if (this.iIIIiIlIlIIiIl != null) {
         class_2338 var4 = !this.IIiiiIllIiiiIl.isEmpty() ? this.iIIIiIlIlIIiIl.IIlilIliiIli(this.iIIliIlIli(), this.iIIIiIlIlIIiIl.Iiilliiliiil(), this.iIIIiIlIlIIiIl.iIlIlllllill()) : this.iIIIiIlIlIIiIl.IlIillIiilIi();
         if (!this.iIilIllIlilIll.contains(var4) && lllIIlilillIIlil.IIIllIIliIIl(w, var4) && this.IliilIllliilIl.Illlllllilll(var4, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
            return var4;
         }
      }

      var17 ^= ((long)(this.iIIIiIlIlIIiIl != null ? this.iIIIiIlIlIIiIl.Iiilliiliiil() : -1) << 32 ^ var17) & -1L << 32;
      class_2338 var5 = null;
      double var6 = Double.MAX_VALUE;

      for(long var25 = var17 ^ (0L ^ var17) & -1L >>> 32; (int)var25 <= 2; var25 ^= (var25 ^ var25 + (long)1) & -1L >>> 32) {
         if ((int)var25 == 0) {
            for(var19 ^= (-17179869184L ^ var19) & -1L << 32; (int)(var19 >>> 32) <= -1; var19 += 4294967296L) {
               class_2338 var23 = p.method_10086((int)(var19 >>> 32));
               if (this.iililIlIIiilIl.IlIillIiilIi(var23) && !this.iIilIllIlilIll.contains(var23) && lllIIlilillIIlil.IIIllIIliIIl(w, var23) && this.IliilIllliilIl.Illlllllilll(var23, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
                  double var11 = var23.method_10262(pos.method_24515()) + (double)(Math.abs(var23.method_10264() - pos.method_31478()) * 25);
                  if (var11 < var6) {
                     var6 = var11;
                     var5 = var23;
                  }
               }
            }
         } else {
            for(class_2350 var10 : class_2353.field_11062) {
               for(var19 ^= (-4L ^ var19) & -1L >>> 32; (int)var19 <= 1; var19 ^= (var19 ^ var19 + (long)1) & -1L >>> 32) {
                  class_2338 var12 = p.method_10079(var10, (int)var25).method_10086((int)var19);
                  if (this.iililIlIIiilIl.IlIillIiilIi(var12) && !this.iIilIllIlilIll.contains(var12) && lllIIlilillIIlil.IIIllIIliIIl(w, var12) && this.IliilIllliilIl.Illlllllilll(var12, p, this.IililIllililIl.iIiiIIiliIliiIIili)) {
                     var21 ^= ((long)(this.iIIIiIlIlIIiIl != null && this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? var12.method_10260() : var12.method_10263()) << 32 ^ var21) & -1L << 32;
                     var21 ^= ((long)((int)(var25 >>> 32) != -1 ? Math.abs((int)(var21 >>> 32) - (int)(var25 >>> 32)) : 0) ^ var21) & -1L >>> 32;
                     if ((int)var21 <= 1) {
                        double var15 = var12.method_10262(pos.method_24515()) + (double)(Math.abs(var12.method_10264() - pos.method_31478()) * 25) + (double)((int)var21 * 500);
                        if (var15 < var6) {
                           var6 = var15;
                           var5 = var12;
                        }
                     }
                  }
               }
            }
         }

         if (var5 != null) {
            return var5;
         }
      }

      class_2338 var8 = p.method_10084();
      if (!this.iIilIllIlilIll.contains(var8) && lllIIlilillIIlil.IIIllIIliIIl(w, var8)) {
         return var8;
      } else {
         return null;
      }
   }

   private void iiiIlIIIll() {
      long var11 = 7776831084866997294L;
      long var13 = -5911616498509052020L;
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         class_746 var1 = this.lllilIlillilIl.field_1724;
         class_638 var2 = this.lllilIlillilIl.field_1687;
         if (var1 != null && var2 != null) {
            if (var1.field_3913 != this.lIiilIliIiilIl) {
               this.IiIIiIlliIIiIl = var1.field_3913;
               var1.field_3913 = this.lIiilIliIiilIl;
            }

            this.lIiilIliIiilIl.iIlIlllllill();
            if (!this.iliilIlIiiilIl.iIlIlllllill()) {
               if (this.lIlIiIliIlIiIl != null && var2.method_8320(this.lIlIiIliIlIiIl).method_26215()) {
                  ++this.lllliIlillliIl;
                  this.ilillIiill(this.lIlIiIliIlIiIl);
                  class_2338 var3 = this.lIlIiIliIlIiIl.method_10062();
                  var11 ^= ((long)(Integer)this.illlIllIillIll.merge(var3, 1, Integer::sum) << 32 ^ var11) & -1L << 32;
                  if ((int)(var11 >>> 32) >= 3) {
                     this.lIllIlliIllIll.put(var3, 2400);
                     this.illlIllIillIll.remove(var3);
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + var3.method_23854() + iiIIIlIIlIIl<invokedynamic>());
                  }

                  this.lIlIiIliIlIiIl = null;
                  this.IliilIllliilIl.Illillliilli();
               }

               if (!this.lIllIlliIllIll.isEmpty()) {
                  this.lIllIlliIllIll.replaceAll((k, v) -> v - 1);
                  this.lIllIlliIllIll.values().removeIf((v) -> v <= 0);
               }

               if (!this.IlllIllllllIll.isEmpty()) {
                  this.IlllIllllllIll.replaceAll((k, v) -> v - 1);
                  this.IlllIllllllIll.values().removeIf((v) -> v <= 0);
               }

               if (++this.lillIlliillIll >= 600) {
                  this.lillIlliillIll = 0;
                  this.illlIllIillIll.clear();
               }

               if (this.lIIIIlliIIIIll != null || this.ilIIIllIiIIIll) {
                  ++this.iIlIIllIllIIll;
               }

               if (!this.IIiiiIllIiiiIl.isEmpty()) {
                  ++this.iiiiiIlIIIIIll;
               }

               double var15 = var1.method_23317() - this.llIiiIlilIiiIl;
               double var5 = var1.method_23318() - this.IiIiiIlliIiiIl;
               double var7 = var1.method_23321() - this.iiIiiIlIIliiIl;
               this.iIIiiIlIlIiiIl = var15 * var15 + var5 * var5 + var7 * var7 > 0.0025;
               this.llIiiIlilIiiIl = var1.method_23317();
               this.IiIiiIlliIiiIl = var1.method_23318();
               this.iiIiiIlIIliiIl = var1.method_23321();
               if (this.IIIiiIllIIiiIl <= 0) {
                  this.IIIIiIllIIIiIl.IiIIlliIIl(this.iIIIiIlIlIIiIl.Ililllililil().method_10264());
                  this.IIIIiIllIIIiIl.iiIIlIIlIl(var1.method_55754());
                  if (!this.iIIilIlIil(var1)) {
                     if (!this.illilIilil(var1)) {
                        if (this.iilliIlIIiliIl && !this.IIIIiIllIIIiIl.lIiiIiIlilli()) {
                           this.lililiilil(llliIiIiilliIiIi.iiiIiIiIIi);
                        }

                        this.iilliIlIIiliIl = this.IIIIiIllIIIiIl.lIiiIiIlilli();
                        if (this.IililIllililIl.liliIIiliiiliIIili && !this.ilIiIllIiIiIll && this.IIIIiIllIIIiIl.lIiiIiIlilli() && !liliIliiiliIli.IIIllIIliIIl(var1)) {
                           this.ilIiIllIiIiIll = true;
                           this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
                        }

                        if (!this.iilIiIIiIi(var2, var1)) {
                           if (!this.liIIiiiIIi(var2, var1)) {
                              this.lIIlliIIll(var1, var2);
                           }
                        }
                     }
                  }
               } else {
                  --this.IIIiiIllIIiiIl;
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.IliilIllliilIl.Iilililiiili();
                  var11 ^= (0L ^ var11) & -1L >>> 32;

                  while(this.liilliiill(var2, 1) == 0) {
                     int var10000 = (int)var11;
                     var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32;
                     if (var10000 >= this.iIIIiIlIlIIiIl.lIlIliIlIl()) {
                        break;
                     }

                     var13 ^= ((long)(this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1) << 32 ^ var13) & -1L << 32;
                     if (!this.iIIIiIlIlIIiIl.Iliilliiilii()) {
                        this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
                        this.iIiIlIliIl(0);
                        return;
                     }

                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + (int)(var13 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1));
                     this.lliliilili();
                     this.IIiiiIllIiiiIl.clear();
                     this.IilIililIi();
                  }

                  if (this.IIIiiIllIIiiIl == 0 && this.iIIIiIlIlIIiIl.Iilililiiili() && !this.lIIlllliIIllll && this.liilliiill(var2, 20) >= 20) {
                     this.lIIlllliIIllll = true;
                     this.iIIIiIlIlIIiIl.Iiiiliiiiiii();
                     this.IliliIllliliIl = null;
                     this.IIilIlllIilIll = 0;
                     this.IIiillIiil();
                     this.lliliilili();
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1) + iiIIIlIIlIIl<invokedynamic>());
                  }

                  if (!this.iIIIiIlIlIIiIl.Iilililiiili()) {
                     var13 ^= (0L ^ var13) & -1L << 32;

                     while(!this.IIililIili(var2) && !this.iIIIiIlIlIIiIl.Iilililiiili()) {
                        int var18 = (int)(var13 >>> 32);
                        var13 += 4294967296L;
                        if (var18 >= 4096) {
                           break;
                        }

                        this.iIIIiIlIlIIiIl.IIiilIiiiIii();
                     }
                  }

                  if (this.IIIiiIllIIiiIl == 0 && !this.iIIIiIlIlIIiIl.Iilililiiili() && var1.method_31478() > this.iIIIiIlIlIIiIl.Ililllililil().method_10264()) {
                     var13 ^= (0L ^ var13) & -1L << 32;

                     while(!this.iIIIiIlIlIIiIl.Iilililiiili() && !this.iIlIiIllIi(var2)) {
                        int var19 = (int)(var13 >>> 32);
                        var13 += 4294967296L;
                        if (var19 >= 4096) {
                           break;
                        }

                        this.iIIIiIlIlIIiIl.IIiilIiiiIii();
                     }

                     if (!this.iIIIiIlIlIIiIl.Iilililiiili() && !this.lllIiillIi(var2)) {
                        this.IlIIIllllIIIll = 0;
                        this.ilIIiIiIIi(var1);
                        this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + (this.iIIIiIlIlIIiIl.iiIIlIIlIl() + 1) + iiIIIlIIlIIl<invokedynamic>());
                     }
                  }

                  this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
               }
            }
         } else {
            this.lilIliilIl();
         }
      }
   }

   private void iiiliIIIii(class_2338 center) {
      long var7 = -2608017166200562478L;
      long var9 = 8431017394425152396L;
      class_638 var2 = this.lllilIlillilIl.field_1687;
      if (var2 != null) {
         for(var7 ^= (-4294967296L ^ var7) & -1L << 32; (int)(var7 >>> 32) <= 1; var7 += 4294967296L) {
            for(var7 ^= ~var7 & -1L >>> 32; (int)var7 <= 1; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
               for(var9 ^= (-4294967296L ^ var9) & -1L << 32; (int)(var9 >>> 32) <= 1; var9 += 4294967296L) {
                  class_2338 var6 = center.method_10069((int)(var7 >>> 32), (int)var7, (int)(var9 >>> 32));
                  if (var2.method_8320(var6).method_26215()) {
                     this.iIlliIlIllliIl.add(var6);
                  }
               }
            }
         }

      }
   }

   private static int lIliliIlil(class_1661 inv, class_1792 item) {
      long var3 = 7131060371897754105L;

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
         if (inv.method_5438((int)(var5 >>> 32)).method_7909() == item) {
            return (int)(var5 >>> 32);
         }
      }

      return -1;
   }

   public String Iilililiiili() {
      long var16 = -9170085705771210285L;
      long var18 = 7121594018869135734L;
      long var20 = 3239681962184223797L;
      long var22 = -6150756465031074593L;
      long var24 = -8573441207346899646L;
      long var26 = -3507711788648439587L;
      class_638 var1 = this.lllilIlillilIl.field_1687;
      if (var1 != null && this.iililIlIIiilIl.IIIllIIliIIl()) {
         var16 ^= (0L ^ var16) & -1L << 32;
         var16 ^= (0L ^ var16) & -1L >>> 32;
         var18 ^= (0L ^ var18) & -1L << 32;
         var18 ^= (0L ^ var18) & -1L >>> 32;
         var20 ^= (0L ^ var20) & -1L << 32;
         var20 ^= (0L ^ var20) & -1L >>> 32;
         var22 ^= (0L ^ var22) & -1L << 32;
         class_2338.class_2339 var9 = new class_2338.class_2339();

         for(var22 ^= ((long)(this.iililIlIIiilIl.IlIlllIlilIl() - 1) ^ var22) & -1L >>> 32; (int)var22 <= this.iililIlIIiilIl.Illlllllilll() + 1; var22 ^= (var22 ^ var22 + (long)1) & -1L >>> 32) {
            for(var24 ^= ((long)(this.iililIlIIiilIl.IiIlliIliiIl() - 1) << 32 ^ var24) & -1L << 32; (int)(var24 >>> 32) <= this.iililIlIIiilIl.Iilllilliill() + 1; var24 += 4294967296L) {
               for(var24 ^= ((long)(this.iililIlIIiilIl.IIlllIlliIll() - 1) ^ var24) & -1L >>> 32; (int)var24 <= this.iililIlIIiilIl.IIillIiliIil() + 1; var24 ^= (var24 ^ var24 + (long)1) & -1L >>> 32) {
                  var9.method_10103((int)var22, (int)(var24 >>> 32), (int)var24);
                  class_3610 var13 = var1.method_8316(var9);
                  var26 ^= ((long)liilIlIiiiilIlIi.IliIlllilIi(var13) << 32 ^ var26) & -1L << 32;
                  if ((int)(var26 >>> 32) == 0 && !liilIlIiiiilIlIi.liiiIIllIl(var13)) {
                     if (this.iililIlIIiilIl.IlIillIiilIi(var9) && this.IIliilIlii(var1, var9)) {
                        var22 += 4294967296L;
                     }
                  } else {
                     var26 ^= ((long)(var13.method_15771() && liilIlIiiiilIlIi.iliIiiliiiii(var1, var9, var13) ? 1 : 0) ^ var26) & -1L >>> 32;
                     if ((int)(var26 >>> 32) != 0) {
                        if (var13.method_15771()) {
                           var16 += 4294967296L;
                        } else {
                           var16 ^= (var16 ^ var16 + (long)1) & -1L >>> 32;
                        }

                        if ((int)var26 != 0) {
                           var20 += 4294967296L;
                        }
                     } else {
                        if (var13.method_15771()) {
                           var18 += 4294967296L;
                        } else {
                           var18 ^= (var18 ^ var18 + (long)1) & -1L >>> 32;
                        }

                        if ((int)var26 != 0) {
                           var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32;
                        }
                     }
                  }
               }
            }
         }

         return iiIIIlIIlIIl<invokedynamic>() + (int)(var16 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + (int)var16 + iiIIIlIIlIIl<invokedynamic>() + (int)(var20 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + (int)(var18 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + (int)var18 + iiIIIlIIlIIl<invokedynamic>() + (int)var20 + iiIIIlIIlIIl<invokedynamic>() + (int)(var22 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + this.Iiiiliiiiiii(var1) + iiIIIlIIlIIl<invokedynamic>() + this.lilIiIliilIiIl.size();
      } else {
         return iiIIIlIIlIIl<invokedynamic>();
      }
   }

   private void lIiIiiIiIi(class_746 p, class_2338 pos) {
      long var26 = -8848295744503933243L;
      long var28 = -7251947304849143577L;
      long var30 = 5682963572424163564L;
      if (this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili() && p.method_24828()) {
         class_243 var3 = p.method_33571();
         double var4 = (double)pos.method_10263() + (double)0.5F - p.method_23317();
         double var6 = (double)pos.method_10260() + (double)0.5F - p.method_23321();
         double var8 = Math.hypot(var4, var6);
         double var10 = (double)pos.method_10264() + (double)0.5F - var3.field_1351;
         if (!(Math.abs(var10) > 1.6)) {
            var26 ^= ((long)(pos.method_10264() >= p.method_31478() ? 1 : 0) << 32 ^ var26) & -1L << 32;
            if ((int)(var26 >>> 32) != 0 || !(var8 < 1.1)) {
               class_638 var13 = this.lllilIlillilIl.field_1687;
               if (var13 != null) {
                  var26 ^= ((long)(var4 > 0.2 ? 1 : (var4 < -0.2 ? -1 : 0)) ^ var26) & -1L >>> 32;
                  var28 ^= ((long)(var6 > 0.2 ? 1 : (var6 < -0.2 ? -1 : 0)) << 32 ^ var28) & -1L << 32;
                  class_2338 var16 = p.method_24515();
                  if ((int)var26 != 0 && !lllIIlilillIIlil.iliIiiliiiii(var13, var16.method_10069((int)var26, -1, 0)) || (int)(var28 >>> 32) != 0 && !lllIIlilillIIlil.iliIiiliiiii(var13, var16.method_10069(0, -1, (int)(var28 >>> 32))) || (int)var26 != 0 && (int)(var28 >>> 32) != 0 && !lllIIlilillIIlil.iliIiiliiiii(var13, var16.method_10069((int)var26, -1, (int)(var28 >>> 32)))) {
                     return;
                  }
               }

               double var14 = Math.toRadians((double)p.method_36454());
               double var32 = Math.sin(var14);
               double var18 = Math.cos(var14);
               double var20 = var6 * var18 - var4 * var32;
               double var22 = var6 * var32 + var4 * var18;
               var28 ^= ((long)(Math.abs(var22) > Math.abs(var20) ? 1 : 0) ^ var28) & -1L >>> 32;
               var30 ^= ((long)(this.IililIllililIl.illiIIiliIiliIIili && var8 > 2.2 ? 1 : 0) << 32 ^ var30) & -1L << 32;
               this.lIiilIliIiilIl.IliIlllilIi(liiIiiiiIi(var20), (int)var28 != 0 ? liiIiiiiIi(var22) : 0.0F, false, (boolean)((int)(var30 >>> 32)));
            }
         }
      }
   }

   private boolean IIIlilIIli(class_1937 pos, class_746 p, class_2338 w, double reach) {
      class_3965 var6 = pos.method_17742(new class_3959(p.method_33571(), class_243.method_24953(w), class_3960.field_17559, class_242.field_1348, p));
      if (var6.method_17783() == class_240.field_1332 && !var6.method_17777().equals(w)) {
         class_2338 var7 = var6.method_17777();
         if (this.iililIlIIiilIl.IlIillIiilIi(var7) && lllIIlilillIIlil.IilliliilIIi(pos, var7) && this.IliilIllliilIl.IIlllIlliIll(var7, reach) && !this.ilIiiIiIii(var7) && !this.IIlilIliiIli(pos, var7) && !this.lIllIlliIllIll.containsKey(var7)) {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.Ilillllill(var7, reach, true);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean Iiiilliiil(class_746 p, class_2338 pos) {
      return p.method_31478() == this.iIIIiIlIlIIiIl.iIlIlllllill() || IlIIillIIi(p, pos, (double)30.0F);
   }

   private void IiIilliIil(class_746 p) {
      if (this.IIiIllllIiIlll >= 0) {
         this.lliIllliliIlll = this.IIiIllllIiIlll;
         this.IiiIlllliiIlll = this.iIiIlllIliIlll;
         this.iiiIlllIIIllll = p;
         this.IIiIllllIiIlll = -1;
         this.iIiIlllIliIlll = null;
         this.iiIilIIlil();
      }
   }

   void IlIillIiilIi(class_2338 pos, boolean replacedSource) {
      this.illIiIlIilIiIl.add(pos);
      this.lilIiIliilIiIl.add(pos);
      if (replacedSource) {
         this.IIiIiIllIiIiIl.add(pos);
      } else {
         this.IIiIiIllIiIiIl.remove(pos);
      }

      this.IIIIiIllIIIiIl.liiiIIllIl().IilliliilIIi(pos);
   }

   // $FF: synthetic method
   private static CallSite IllIIllllIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 7) + var5) + var5) ^ 7644) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 7) + var5) + var5) ^ 7644) ^ var5) >>> 1) - '\udac6') - var5) - var5) - '뵚') - '芻') << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 7) + var5) + var5) ^ 7644) ^ var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) >>> 9 | (char)((char)((char)(~var4[var5]) ^ var5) >>> 13 | (char)((char)(~var4[var5]) ^ var5) << 3) << 7) + var5) + var5) ^ 7644) ^ var5) >>> 1) - '\udac6') - var5) - var5) - '뵚') - '芻') >>> 1))) + '鐂') + '\ud915'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIiIlIliIl(int leftover) {
      long var4 = 5261966667258089409L;
      if (!this.IiIlIllliIlIll.isEmpty()) {
         leftover = Math.max(leftover, 0) + this.IiIlIllliIlIll.size();
      }

      this.IiiIiIlliiIiIl = false;
      this.iiiIiIlIIIliIl = false;
      this.lIIliIliIIliIl.clear();
      String var2;
      if (leftover > 0) {
         var2 = iiIIIlIIlIIl<invokedynamic>() + leftover + iiIIIlIIlIIl<invokedynamic>() + (leftover == 1 ? "" : iiIIIlIIlIIl<invokedynamic>()) + iiIIIlIIlIIl<invokedynamic>();
      } else if (leftover == 0) {
         var2 = iiIIIlIIlIIl<invokedynamic>();
      } else {
         var2 = "";
      }

      var4 ^= ((long)(this.lllilIlillilIl.field_1687 == null ? 0 : this.Iiiiliiiiiii(this.lllilIlillilIl.field_1687)) << 32 ^ var4) & -1L << 32;
      if ((int)(var4 >>> 32) > 0) {
         var2 = var2 + iiIIIlIIlIIl<invokedynamic>() + (int)(var4 >>> 32) + iiIIIlIIlIIl<invokedynamic>() + ((int)(var4 >>> 32) == 1 ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>()) + iiIIIlIIlIIl<invokedynamic>();
      }

      this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + this.lllliIlillliIl + iiIIIlIIlIIl<invokedynamic>() + var2 + iiIIIlIIlIIl<invokedynamic>());
      this.IIiIllIiIl();
      this.IliilIllliilIl.Iilililiiili();
      this.lIlIiIliIlIiIl = null;
      this.llIIiIlilIIiIl = lilIIliiilIIli.IIiIliiiilIiIliiii;
   }

   private boolean IIliilIlii(class_1937 pos, class_2338 w) {
      return this.iililIlIIiilIl.IlIillIiilIi(w) && this.lIIiiiIIii(w) && !pos.method_8320(w).method_26215() && !this.IIlilIliiIli(pos, w) ? lllIIlilillIIlil.IilliliilIIi(pos, w) : false;
   }

   private boolean IIiilIiiiIii(class_746 p, class_2338 dest) {
      double var3 = p.method_5707(class_243.method_24955(dest));
      if (dest.equals(this.IIliIlllIliIll) && !(var3 < this.iIliIllIlliIll - (double)1.0F)) {
         return ++this.llliIllilliIll > 200;
      } else {
         this.IIliIlllIliIll = dest.method_10062();
         this.iIliIllIlliIll = var3;
         this.llliIllilliIll = 0;
         return false;
      }
   }

   private class_2338 iIiliIlili(class_1937 w) {
      class_2338 var2 = this.iIIIiIlIlIIiIl.Ililllililil();
      return this.IlIiillIii(w, var2) && !this.lIllIlliIllIll.containsKey(var2) ? var2 : null;
   }

   public iIiiiIIlIliiiIIl IilliliilIIi() {
      return this.iIIIiIlIlIIiIl;
   }

   private void lililiilil(llliIiIiilliIiIi t) {
      if (this.lIiliIliIiliIl != t) {
         this.lIiliIliIiliIl = t;
         this.ililiIlIiiliIl = 0;
      }

   }

   private int Iiiiliiiiiii(class_1937 w) {
      long var5 = -1160626224440888185L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(class_2338 var4 : this.lilIiIliilIiIl) {
         if (this.iililIlIIiilIl.IlIillIiilIi(var4) && this.IIlilIliiIli(w, var4)) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public String IIillIiliIil() {
      String var10000;
      switch (this.llIIiIlilIIiIl.ordinal()) {
         case 0 -> var10000 = iiIIIlIIlIIl<invokedynamic>();
         case 1 -> var10000 = this.iIIIiIlIlIIiIl.lilIliilIl() + iiIIIlIIlIIl<invokedynamic>() + Math.round(this.iIIIiIlIlIIiIl.illIlIilIl() * 100.0F) + iiIIIlIIlIIl<invokedynamic>() + this.lllliIlillliIl + (this.IilliIllilliIl > 0 ? iiIIIlIIlIIl<invokedynamic>() + this.IilliIllilliIl : "") + (this.iiliIllIIiiIll.isEmpty() ? "" : iiIIIlIIlIIl<invokedynamic>() + this.iiliIllIIiiIll);
         case 2 -> var10000 = iiIIIlIIlIIl<invokedynamic>() + (this.iIIIiIlIlIIiIl != null ? this.iIIIiIlIlIIiIl.lilIliilIl() : "");
         case 3 -> var10000 = iiIIIlIIlIIl<invokedynamic>() + this.lllliIlillliIl + iiIIIlIIlIIl<invokedynamic>();
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public void iIlIlllllill() {
      if (!this.liiiIIllIl()) {
         this.iIIIiIlIlIIiIl = null;
         this.llIIiIlilIIiIl = lilIIliiilIIli.IllIliiiilllIliiii;
      }

   }

   private boolean IilIililIi() {
      this.ilIIIllIiIIIll = false;
      this.IIlIIlllIlIIll = null;
      this.lIIIIlliIIIIll = null;
      this.lllIIllillIIll = null;
      this.iIlIIllIllIIll = 0;
      this.iilIIllIIiIIll = 0;
      this.lIiIIlliIiIIll = 0;
      this.IliIIlllliIIll = 0;
      this.iliIIllIiiIIll = false;
      return false;
   }

   private boolean ilIllIiIll(class_746 w, class_1937 p, int finalMode, int lo, boolean hi) {
      double var6 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, w.method_55754());
      if (this.lIiiIlliIiiIll != null && (!this.liIiiiiIii(p, this.lIiiIlliIiiIll) || !this.iililIlIIiilIl.IlIillIiilIi(this.lIiiIlliIiiIll) || !this.IliilIllliilIl.IIlllIlliIll(this.lIiiIlliIiiIll, var6))) {
         this.lIiiIlliIiiIll = null;
         this.liiiIlliiiiIll = 0;
      }

      if (this.lIiiIlliIiiIll == null && !this.IIIIiIllIIIiIl.lIiiIiIlilli()) {
         this.lIiiIlliIiiIll = this.iilllIIill(p, w, var6, finalMode, lo, hi);
         if (this.lIiiIlliIiiIll != null) {
            this.liiiIlliiiiIll = 0;
         }
      }

      if (this.lIiiIlliIiiIll != null) {
         if (++this.liiiIlliiiiIll > 70) {
            this.lIllIlliIllIll.put(this.lIiiIlliIiiIll.method_10062(), 1200);
            this.lIiiIlliIiiIll = null;
            this.liiiIlliiiiIll = 0;
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            return true;
         } else {
            this.lIiilIliIiilIl.iIlIlllllill();
            this.Ilillllill(this.lIiiIlliIiiIll, var6, false);
            if (this.IliilIllliilIl.IiIlliIliiIl() && !this.lliIiIliliIiIl) {
               this.lliIiIliliIiIl = true;
               this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
            }

            this.iiliIllIIiiIll = hi ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>();
            return true;
         }
      } else {
         class_2338 var8 = hi ? this.lllllillll(w) : this.lIilliIill(p, w);
         if (var8 == null) {
            this.IliiIlllliiIll = null;
            this.iliiIllIiiiIll = null;
            return false;
         } else {
            if (this.IliiIlllliiIll == null || !var8.equals(this.iliiIllIiiiIll)) {
               this.iliiIllIiiiIll = var8;
               this.IliiIlllliiIll = this.Iillllilll(p, w, var8);
            }

            if (this.IliiIlllliiIll == null) {
               this.lIllIlliIllIll.put(var8.method_10062(), 2400);
               this.iliiIllIiiiIll = null;
               return true;
            } else {
               this.iiliIllIIiiIll = hi ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>();
               lillilliillill var9 = this.IIIIiIllIIIiIl.IIlilIliiIli(this.IliiIlllliiIll);
               if (var9 == lillilliillill.IIlilIlIilIlilIlIi) {
                  this.lIllIlliIllIll.put(var8.method_10062(), 1200);
                  this.iIilIllIlilIll.add(this.IliiIlllliiIll);
                  this.IliiIlllliiIll = null;
                  this.iliiIllIiiiIll = null;
               } else if (var9 == lillilliillill.liIilIlIiiiIilIlIi) {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.iIilIllIlilIll.add(this.IliiIlllliiIll);
                  this.IliiIlllliiIll = null;
                  this.iliiIllIiiiIll = null;
               }

               return true;
            }
         }
      }
   }

   private class_2338 iilllIIill(class_1937 finalMode, class_746 p, double w, int lo, int hi, boolean reach) {
      long var33 = 7807703182704436080L;
      long var35 = -7182107098380831120L;
      long var37 = -8185037606079230061L;
      long var39 = -2975792068247069168L;
      long var41 = 5962395734754265915L;
      long var43 = -4407114557622940842L;
      long var31 = -5278134527958266021L;
      class_2338 var8 = p.method_24515();
      class_243 var9 = p.method_33571();
      var31 ^= ((long)(reach ? Integer.MIN_VALUE : this.iIIIiIlIlIIiIl.Ililllililil().method_10264()) << 32 ^ var31) & -1L << 32;
      var31 ^= ((long)((int)Math.sqrt((double)100.0F) + 1) ^ var31) & -1L >>> 32;
      var33 ^= ((long)(this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? 1 : 0) << 32 ^ var33) & -1L << 32;
      var33 ^= ((long)((int)(var33 >>> 32) != 0 ? var8.method_10263() : var8.method_10260()) ^ var33) & -1L >>> 32;
      var35 ^= ((long)((int)(var33 >>> 32) != 0 ? var8.method_10260() : var8.method_10263()) << 32 ^ var35) & -1L << 32;
      var35 ^= ((long)Math.max(this.iIIIiIlIlIIiIl.IIIIllIIIl(), (int)var33 - (int)var31) ^ var35) & -1L >>> 32;
      var37 ^= ((long)Math.min(this.iIIIiIlIlIIiIl.iIIIlIlIIl(), (int)var33 + (int)var31) << 32 ^ var37) & -1L << 32;
      var37 ^= ((long)Math.max(this.iIIIiIlIlIIiIl.llIIlilIIl(), (int)(var35 >>> 32) - (int)var31) ^ var37) & -1L >>> 32;
      var39 ^= ((long)Math.min(this.iIIIiIlIlIIiIl.IiIIlliIIl(), (int)(var35 >>> 32) + (int)var31) << 32 ^ var39) & -1L << 32;
      class_2338 var19 = null;
      var39 ^= ~var39 & -1L >>> 32;
      double var21 = Double.MAX_VALUE;

      for(var41 ^= ((long)hi << 32 ^ var41) & -1L << 32; (int)(var41 >>> 32) >= lo; var41 += -4294967296L) {
         for(var41 ^= ((long)((int)var35) ^ var41) & -1L >>> 32; (int)var41 <= (int)(var37 >>> 32); var41 ^= (var41 ^ var41 + (long)1) & -1L >>> 32) {
            for(var43 ^= ((long)((int)var37) << 32 ^ var43) & -1L << 32; (int)(var43 >>> 32) <= (int)(var39 >>> 32); var43 += 4294967296L) {
               class_2338 var26 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)var41, (int)(var43 >>> 32), (int)(var41 >>> 32));
               if (this.iililIlIIiilIl.IlIillIiilIi(var26)) {
                  double var27 = var26.method_10262(var8);
                  if (!(var27 > (double)100.0F) && this.liIiiiiIii(finalMode, var26) && !this.lIllIlliIllIll.containsKey(var26) && !this.IlllIllllllIll.containsKey(var26) && this.IliilIllliilIl.IIlllIlliIll(var26, w)) {
                     class_3965 var29 = finalMode.method_17742(new class_3959(var9, class_243.method_24953(var26), class_3960.field_17559, class_242.field_1348, p));
                     if (var29.method_17783() != class_240.field_1332 || var29.method_17777().equals(var26)) {
                        var43 ^= ((long)(this.IIIillIIil(finalMode, var26) + ((int)(var41 >>> 32) == (int)(var31 >>> 32) ? 100 : 0)) ^ var43) & -1L >>> 32;
                        if ((int)var43 > (int)var39 || (int)var43 == (int)var39 && var27 < var21) {
                           var39 ^= ((long)((int)var43) ^ var39) & -1L >>> 32;
                           var21 = var27;
                           var19 = var26.method_10062();
                        }
                     }
                  }
               }
            }
         }
      }

      return var19;
   }

   private void iIlllIllll(class_746 p, class_1937 w) {
      long var5 = 3219217106669119451L;
      if (!this.iiiIiIlIIIliIl) {
         this.lIIliIliIIliIl.removeIf((c) -> !this.IIliilIlii(w, c));
         if (!this.ilIllIiIll(p, w, this.iililIlIIiilIl.IiIlliIliiIl(), this.iililIlIIiilIl.Iilllilliill(), true)) {
            if (!this.lIIliIliIIliIl.isEmpty() && !this.IlllIllllllIll.isEmpty()) {
               this.lIiilIliIiilIl.iIlIlllllill();
               this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            } else if (!this.lIIliIliIIliIl.isEmpty() && this.IIlliIllIlliIl < 2) {
               ++this.IIlliIllIlliIl;
               this.lIllIlliIllIll.clear();
               this.iIilIllIlilIll.clear();
               this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + this.lIIliIliIIliIl.size() + iiIIIlIIlIIl<invokedynamic>() + (this.lIIliIliIIliIl.size() == 1 ? "" : iiIIIlIIlIIl<invokedynamic>()) + iiIIIlIIlIIl<invokedynamic>() + this.IIlliIllIlliIl + iiIIIlIIlIIl<invokedynamic>() + 2 + iiIIIlIIlIIl<invokedynamic>());
            } else {
               this.iIiIlIliIl(this.lIIliIliIIliIl.size());
            }
         }
      } else {
         this.lIiilIliIiilIl.iIlIlllllill();
         var5 ^= (257698037760000L ^ var5) & -1L << 32;

         while(true) {
            int var10000 = (int)(var5 >>> 32);
            var5 += -4294967296L;
            if (var10000 <= 0 || this.ilIliIlIiIliIl < this.iililIlIIiilIl.IiIlliIliiIl()) {
               if (this.ilIliIlIiIliIl >= this.iililIlIIiilIl.IiIlliIliiIl()) {
                  return;
               } else {
                  this.iiiIiIlIIIliIl = false;
                  if (this.lIIliIliIIliIl.isEmpty()) {
                     this.iIiIlIliIl(0);
                     return;
                  } else {
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + this.lIIliIliIIliIl.size() + iiIIIlIIlIIl<invokedynamic>() + (this.lIIliIliIIliIl.size() == 1 ? "" : iiIIIlIIlIIl<invokedynamic>()) + iiIIIlIIlIIl<invokedynamic>());
                     return;
                  }
               }
            }

            class_2338 var4 = new class_2338(this.IlIliIlllIliIl, this.ilIliIlIiIliIl, this.liIliIliiIliIl);
            if (this.IIliilIlii(w, var4)) {
               this.lIIliIliIIliIl.add(var4);
            }

            if (++this.liIliIliiIliIl > this.iililIlIIiilIl.IIillIiliIil()) {
               this.liIliIliiIliIl = this.iililIlIIiilIl.IIlllIlliIll();
               if (++this.IlIliIlllIliIl > this.iililIlIIiilIl.Illlllllilll()) {
                  this.IlIliIlllIliIl = this.iililIlIIiilIl.IlIlllIlilIl();
                  --this.ilIliIlIiIliIl;
               }
            }
         }
      }
   }

   private boolean liIIiiiIIi(class_1937 w, class_746 p) {
      long var16 = -5024013592475415819L;
      if (this.lIIIIlliIIIIll != null) {
         if (this.iIlIIllIllIIll > 600) {
            if (++this.IlIIIllllIIIll <= 2) {
               this.ilIIiIiIIi(p);
               this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + this.IlIIIllllIIIll + iiIIIlIIlIIl<invokedynamic>());
               return true;
            } else {
               this.lIIIIlliIIIIll = null;
               this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
               return false;
            }
         } else {
            lillilliillill var3 = this.IIIIiIllIIIiIl.IIlilIliiIli(this.lIIIIlliIIIIll);
            if (var3 == lillilliillill.liIilIlIiiiIilIlIi) {
               this.lIIIIlliIIIIll = null;
               this.ilIIIllIiIIIll = true;
               this.liIIIlliiIIIll = 0;
               this.IIlIIlllIlIIll = null;
               this.iIlIIllIllIIll = 0;
               return true;
            } else if (var3 == lillilliillill.IIlilIlIilIlilIlIi) {
               double var20 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, p.method_55754());
               if (this.IIIlilIIli(w, p, this.lIIIIlliIIIIll, var20)) {
                  return true;
               } else if (++this.IlIIIllllIIIll <= 2) {
                  this.ilIIiIiIIi(p);
                  this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + this.IlIIIllllIIIll + iiIIIlIIlIIl<invokedynamic>());
                  return true;
               } else {
                  this.lIIIIlliIIIIll = null;
                  this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
                  return false;
               }
            } else {
               this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
               return true;
            }
         }
      } else if (!this.ilIIIllIiIIIll) {
         return false;
      } else {
         if (this.IIlIIlllIlIIll != null && !this.IlIiillIii(w, this.IIlIIlllIlIIll)) {
            ++this.liIIIlliiIIIll;
            this.IIlIIlllIlIIll = null;
            this.iIlIIllIllIIll = 0;
         }

         if (this.lllIIllillIIll == null || !p.method_24828() || p.method_31477() == this.lllIIllillIIll.method_10263() && p.method_31479() == this.lllIIllillIIll.method_10260()) {
            var16 ^= ((long)(this.liIIIlliiIIIll < 3 && this.IilIIlllilIIll - p.method_31478() < 4 && p.method_31478() > this.iIIIiIlIlIIiIl.iIlIlllllill() ? 0 : 1) << 32 ^ var16) & -1L << 32;
            if ((int)(var16 >>> 32) != 0) {
               if (this.iIlIIllIllIIll > 600) {
                  return this.IilIililIi();
               } else if (!p.method_24828()) {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                  return true;
               } else if (p.method_31478() < this.iIIIiIlIlIIiIl.iIlIlllllill()) {
                  if (this.IIIIiIllIIIiIl.IiIlliIliiIl(p)) {
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                     return true;
                  } else {
                     return this.IilIililIi();
                  }
               } else if (++this.lIiIIlliIiIIll <= 5) {
                  this.lIiilIliIiilIl.iIlIlllllill();
                  this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                  return true;
               } else {
                  return this.IilIililIi();
               }
            } else if (this.iIlIIllIllIIll > 600) {
               return this.IilIililIi();
            } else if (!p.method_24828()) {
               this.lIiilIliIiilIl.iIlIlllllill();
               this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + (this.liIIIlliiIIIll + 1) + iiIIIlIIlIIl<invokedynamic>();
               return true;
            } else {
               if (this.lllIIllillIIll != null) {
                  double var4 = p.method_23317() - ((double)this.lllIIllillIIll.method_10263() + (double)0.5F);
                  double var6 = p.method_23321() - ((double)this.lllIIllillIIll.method_10260() + (double)0.5F);
                  double var8 = Math.max(Math.abs(var4), Math.abs(var6));
                  if (this.iliIIllIiiIIll && var8 > 0.45) {
                     this.iliIIllIiiIIll = false;
                  }

                  if (!this.iliIIllIiiIIll) {
                     if (var8 <= 0.15) {
                        this.iliIIllIiiIIll = true;
                     } else if (++this.IliIIlllliIIll <= 60) {
                        double var10 = Math.toRadians((double)p.method_36454());
                        double var12 = Math.sin(var10);
                        double var14 = Math.cos(var10);
                        this.lIiilIliIiilIl.IliIlllilIi(iliIiIiiIi(-var6 * var14 - -var4 * var12), iliIiIiiIi(-var6 * var12 + -var4 * var14), false, false);
                        this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                        return true;
                     }
                  }
               }

               if (this.liIIIlliiIIIll == 0 && this.IIlIIlllIlIIll == null) {
                  class_2350 var18 = this.IIlIilIlIi();
                  if (IliIIlIllliIIlIl.liiiIIllIl(p, IliIIlIllliIIlIl.IliIlllilIi((double)var18.method_10148(), (double)var18.method_10165()), 20.0F)) {
                     this.lIiilIliIiilIl.iIlIlllllill();
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
                     return true;
                  }
               }

               class_2338 var19 = p.method_24515().method_10074();
               double var5 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, p.method_55754());
               if (!this.iililIlIIiilIl.IlIillIiilIi(var19)) {
                  return this.IilIililIi();
               } else if (w.method_8320(var19).method_26215()) {
                  if (++this.iilIIllIIiIIll > 30) {
                     return this.IilIililIi();
                  } else {
                     this.lIiilIliIiilIl.iIlIlllllill();
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + (this.liIIIlliiIIIll + 1) + iiIIIlIIlIIl<invokedynamic>();
                     return true;
                  }
               } else {
                  this.iilIIllIIiIIll = 0;
                  if (this.lIllIlliIllIll.containsKey(var19)) {
                     return this.IilIililIi();
                  } else if (this.IIIIiIllIIIiIl.iIlIlllllill().contains(var19)) {
                     return this.IilIililIi();
                  } else if (this.IlIiillIii(w, var19) && this.IliilIllliilIl.IIlllIlliIll(var19, var5)) {
                     this.IIlIIlllIlIIll = var19.method_10062();
                     this.lIiilIliIiilIl.iIlIlllllill();
                     this.Ilillllill(var19, var5, true);
                     this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + (this.liIIIlliiIIIll + 1) + iiIIIlIIlIIl<invokedynamic>();
                     return true;
                  } else {
                     return this.IilIililIi();
                  }
               }
            }
         } else {
            var16 ^= ((long)this.iIlIIllIllIIll << 32 ^ var16) & -1L << 32;
            this.ilIIiIiIIi(p);
            this.iIlIIllIllIIll = (int)(var16 >>> 32);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            return true;
         }
      }
   }

   private boolean lllIiillIi(class_1937 w) {
      long var5 = -1391668625030249821L;
      class_2338 var2 = this.iIIIiIlIlIIiIl.Ililllililil();

      for(long var7 = var5 ^ (0L ^ var5) & -1L << 32; (int)(var7 >>> 32) < 3; var7 += 4294967296L) {
         class_2338 var4 = new class_2338(var2.method_10263(), this.iIIIiIlIlIIiIl.liiiIIllIl() - (int)(var7 >>> 32), var2.method_10260());
         if (this.iililIlIIiilIl.IlIillIiilIi(var4) && !w.method_8320(var4).method_26215()) {
            return false;
         }
      }

      return true;
   }

   public int IIIllIIliIIl() {
      return this.lllliIlillliIl;
   }

   private void llIililIil(int slotId) {
      if (!gg.corz.lIlIiIliIlIiIl.Illlllllilll() && this.lliIllliliIlll < 0) {
         gg.corz.lIlIiIliIlIiIl.iIlIlllllill(() -> {
            long var5 = 8761511894499311893L;
            class_746 var2 = this.lllilIlillilIl.field_1724;
            if (var2 != null && this.lllilIlillilIl.field_1761 != null && this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && this.IIIIllllIIIlll) {
               if (var2.field_7512 == var2.field_7498) {
                  if (var2.method_6079().method_7909() != class_1802.field_8287) {
                     var5 ^= ((long)(slotId >= 36 ? slotId - 36 : slotId) << 32 ^ var5) & -1L << 32;
                     if (var2.method_31548().method_5438((int)(var5 >>> 32)).method_7909() == class_1802.field_8287) {
                        class_1792 var4 = var2.method_6079().method_7909();
                        this.lllilIlillilIl.field_1761.method_2906(var2.field_7498.field_7763, slotId, 40, class_1713.field_7791, var2);
                        if (this.IIiIllllIiIlll < 0) {
                           this.IIiIllllIiIlll = slotId;
                           this.iIiIlllIliIlll = var4;
                        }

                     }
                  }
               }
            }
         }, true);
      }
   }

   public String Illillliilli() {
      class_2338 var1 = this.iIIIiIlIlIIiIl != null && !this.iIIIiIlIlIIiIl.Iilililiiili() ? this.iIIIiIlIlIIiIl.Ililllililil() : null;
      class_2338 var2 = this.IIIIiIllIIIiIl == null ? null : this.IIIIiIllIIIiIl.IlIillIiilIi();
      StringBuilder var3 = new StringBuilder();
      class_638 var4 = this.lllilIlillilIl.field_1687;
      class_746 var5 = this.lllilIlillilIl.field_1724;
      if (var4 != null && var5 != null) {
         for(class_2338 var7 : this.lilIiIliilIiIl) {
            if (!(var7.method_10262(var5.method_24515()) > (double)16.0F)) {
               var3.append(var7.method_23854().replace(iiIIIlIIlIIl<invokedynamic>(), "")).append(var4.method_8320(var7).method_26215() ? iiIIIlIIlIIl<invokedynamic>() : (this.IIlilIliiIli(var4, var7) ? iiIIIlIIlIIl<invokedynamic>() : iiIIIlIIlIIl<invokedynamic>())).append(';');
            }
         }
      }

      return iiIIIlIIlIIl<invokedynamic>() + this.lIiliIliIiliIl + iiIIIlIIlIIl<invokedynamic>() + this.ililiIlIiiliIl + iiIIIlIIlIIl<invokedynamic>() + this.liiliIliiiliIl + iiIIIlIIlIIl<invokedynamic>() + this.liliiIliiliiIl + iiIIIlIIlIIl<invokedynamic>() + this.IlliiIlllliiIl + iiIIIlIIlIIl<invokedynamic>() + (var1 == null ? iiIIIlIIlIIl<invokedynamic>() : var1.method_23854()) + iiIIIlIIlIIl<invokedynamic>() + (this.iIIIiIlIlIIiIl == null ? iiIIIlIIlIIl<invokedynamic>() : this.iIIIiIlIlIIiIl.IlIillIiilIi().method_23854()) + iiIIIlIIlIIl<invokedynamic>() + (var2 == null ? iiIIIlIIlIIl<invokedynamic>() : var2.method_23854()) + iiIIIlIIlIIl<invokedynamic>() + (this.lIlIiIliIlIiIl == null ? iiIIIlIIlIIl<invokedynamic>() : this.lIlIiIliIlIiIl.method_23854()) + iiIIIlIIlIIl<invokedynamic>() + (this.IliilIllliilIl.IIiilIiiiIii() == null ? iiIIIlIIlIIl<invokedynamic>() : this.IliilIllliilIl.IIiilIiiiIii().method_23854()) + iiIIIlIIlIIl<invokedynamic>() + this.ilIIIllIiIIIll + iiIIIlIIlIIl<invokedynamic>() + (this.lIIIIlliIIIIll != null) + iiIIIlIIlIIl<invokedynamic>() + this.IIiiiIllIiiiIl.size() + iiIIIlIIlIIl<invokedynamic>() + (this.IliiIlllliiIll == null ? iiIIIlIIlIIl<invokedynamic>() : this.IliiIlllliiIll.method_23854()) + iiIIIlIIlIIl<invokedynamic>() + var3;
   }

   private boolean IIililIili(class_1937 w) {
      return !this.iIIIiIlIlIIiIl.Iilililiiili() && this.iIiliIlili(w) != null;
   }

   private void llIliilIli(class_2338 fc) {
      long var16 = -8481117035292050261L;
      long var18 = -2581328882124436966L;
      long var12 = -6039859496401020357L;
      long var14 = -4768849672303712898L;
      this.IIiiiIllIiiiIl.clear();
      this.iiiiiIlIIIIIll = 0;
      this.IiiiiIlliiiiIl = 0;
      this.lliiiIliliiiIl = null;
      this.iIiiiIlIliiiIl = null;
      class_746 var2 = this.lllilIlillilIl.field_1724;
      var12 ^= ((long)this.iIIliIlIli() << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)this.iIIIiIlIlIIiIl.Iiilliiliiil() ^ var12) & -1L >>> 32;
      var14 ^= ((long)this.iIIIiIlIlIIiIl.Ililllililil().method_10264() << 32 ^ var14) & -1L << 32;
      if (var2 != null) {
         var14 ^= ((long)(this.iIIIiIlIlIIiIl.lIIlllilIl == class_2351.field_11048 ? 1 : 0) ^ var14) & -1L >>> 32;
         var16 ^= ((long)((int)var14 != 0 ? var2.method_31479() : var2.method_31477()) << 32 ^ var16) & -1L << 32;
         var16 ^= ((long)Integer.signum((int)var12 - (int)(var16 >>> 32)) ^ var16) & -1L >>> 32;
         if ((int)var16 == 0) {
            var18 ^= ((long)(this.iIIIiIlIlIIiIl.iiIIlIIlIl() % 2 == 0 != this.iIIIiIlIlIIiIl.iIIlllilIl ? 1 : 0) << 32 ^ var18) & -1L << 32;
            var16 ^= ((long)((int)(var18 >>> 32) != 0 ? 1 : -1) ^ var16) & -1L >>> 32;
         }

         class_2338 var9 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var12 >>> 32), (int)var12 - (int)var16, (int)(var14 >>> 32));
         class_2338 var10 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var12 >>> 32), (int)var12, (int)(var14 >>> 32));
         class_2338 var11 = this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var12 >>> 32), (int)var12 + (int)var16, (int)(var14 >>> 32));
         if (this.iililIlIIiilIl.IlIillIiilIi(var9)) {
            this.IIiiiIllIiiiIl.add(var9.method_10062());
         }

         if (this.iililIlIIiilIl.IlIillIiilIi(var10)) {
            this.IIiiiIllIiiiIl.add(var10.method_10062());
         }

         if (this.iililIlIIiilIl.IlIillIiilIi(var11)) {
            this.IIiiiIllIiiiIl.add(var11.method_10062());
         }
      } else {
         class_2350 var6 = this.IIlIilIlIi();

         for(long var26 = var16 ^ (0L ^ var16) & -1L << 32; (int)(var26 >>> 32) < 3; var26 += 4294967296L) {
            class_2338 var8 = fc.method_10079(var6, (int)(var26 >>> 32));
            if (this.iililIlIIiilIl.IlIillIiilIi(var8)) {
               this.IIiiiIllIiiiIl.add(var8.method_10062());
            }
         }
      }

   }

   ilIIIIiIiIIIIi IiIlliIliiIl() {
      return this.IililIllililIl;
   }

   private void lilliiilli(String msg) {
      if (liliIliiiliIli.IIIllIIliIIl(this.lllilIlillilIl.field_1724)) {
         this.ilIiIllIiIiIll = false;
      } else if (!this.ilIiIllIiIiIll) {
         this.ilIiIllIiIiIll = true;
         this.llliiillii(msg);
      }

   }

   public void IiiIlliiIl() {
      class_746 var1 = this.lllilIlillilIl.field_1724;
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii && var1 != null && var1.field_3913 != this.lIiilIliIiilIl) {
         this.IiIIiIlliIIiIl = var1.field_3913;
         var1.field_3913 = this.lIiilIliIiilIl;
      }

      this.lIiilIliIiilIl.iIlIlllllill();
      this.IliilIllliilIl.Iilililiiili();
      this.lIlIiIliIlIiIl = null;
   }

   private void lliililiil(class_1937 w) {
      long var8 = -3993770090042691905L;
      long var10 = -9122980339624520225L;
      var8 ^= (0L ^ var8) & -1L << 32;

      while(!this.IIililIili(w) && !this.iIIIiIlIlIIiIl.Iilililiiili()) {
         int var10000 = (int)(var8 >>> 32);
         var8 += 4294967296L;
         if (var10000 >= 4096) {
            break;
         }

         this.iIIIiIlIlIIiIl.IIiilIiiiIii();
      }

      if (!this.IIililIili(w)) {
         this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
      } else {
         class_2338 var3 = this.iIIIiIlIlIIiIl.Ililllililil();
         if (!var3.equals(this.IliliIllliliIl)) {
            if (this.IIilIlllIilIll > 0) {
               --this.IIilIlllIilIll;
            }

            if (this.IliliIllliliIl != null) {
               this.iiiliIIIii(this.IliliIllliliIl);
            }

            this.IIiillIiil();
            this.lliliilili();
            this.IliliIllliliIl = var3.method_10062();
            this.liliiIliiliiIl = 0;
            this.IiliIllliliIll = 0;
            this.IIliIlllIliIll = null;
         }

         if (this.iIIIiIlIlIIiIl.IllIllllIl() != this.illiiIlIiliiIl) {
            this.illiiIlIiliiIl = this.iIIIiIlIlIIiIl.IllIllllIl();
            this.IIilIlllIilIll = 0;
            this.IlliiIlllliiIl = false;
            this.llIliilIli(var3);
            this.IIIIiIllIIIiIl.IliIlllilIi();
            this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
         }

         class_746 var4 = this.lllilIlillilIl.field_1724;
         if (var4 == null || !this.IiIliliIli(w, var4)) {
            ++this.ililiIlIiiliIl;
            var8 ^= ((long)(this.lIlIiIliIlIiIl == null && this.IliilIllliilIl.IIiilIiiiIii() == null && !this.IIIIiIllIIIiIl.lIiiIiIlilli() && !this.IIIIiIllIIIiIl.iliIiiliiiii() && !this.iIIiiIlIlIiiIl ? 0 : 1) ^ var8) & -1L >>> 32;
            this.liiliIliiiliIl = (int)var8 != 0 ? 0 : this.liiliIliiiliIl + 1;
            if (this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.liiliIliiiliIl = 0;
            }

            if (this.liiliIliiiliIl > 160 && !this.IIIIiIllIIIiIl.iliIiiliiiii()) {
               this.liiliIliiiliIl = 0;
               ++this.liliiIliiliiIl;
               this.Iiililiili();
               switch (this.liliiIliiliiIl % 3) {
                  case 1:
                     this.IIilIlllIilIll = 3;
                     this.IlliiIlllliiIl = true;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
                     break;
                  case 2:
                     this.iIilIllIlilIll.clear();
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
                     break;
                  default:
                     this.iIilIllIlilIll.clear();
                     this.IIilIlllIilIll = 0;
                     this.IlliiIlllliiIl = false;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
               }

            } else {
               var10 ^= ((long)(var4 != null && var3.method_10262(var4.method_24515()) <= (double)36.0F ? 1 : 0) << 32 ^ var10) & -1L << 32;
               if ((int)(var10 >>> 32) != 0 && this.liiliIliiiliIl > 60 && this.IIiiiIllIiiiIl.isEmpty() && !this.IIIIiIllIIIiIl.iliIiiliiiii()) {
                  this.llIliilIli(var3);
                  this.IIiiiIllIiiiIl.removeIf((wx) -> !this.IlIiillIii(w, wx));
                  if (!this.IIiiiIllIiiiIl.isEmpty()) {
                     this.IIilIlllIilIll = 0;
                     this.IlliiIlllliiIl = false;
                     this.IIIIiIllIIIiIl.IliIlllilIi();
                     this.liiliIliiiliIl = 0;
                     this.lililiilil(llliIiIiilliIiIi.IiiIiIiIIi);
                     this.llliiillii(iiIIIlIIlIIl<invokedynamic>());
                  }
               }

               class_2338 var7 = this.iIiliIlili(w);
               if (var7 != null) {
                  switch (this.lIiliIliIiliIl.ordinal()) {
                     case 0 -> this.iiIliIIlli(w, var3);
                     case 1 -> this.Illlilllli(w, var7);
                     case 2 -> this.lIlliiIlli(w, var7);
                     case 3 -> this.illliIilli(w, var7);
                  }

               }
            }
         }
      }
   }

   private int IIIillIIil(class_1937 pos, class_2338 w) {
      long var7 = -6337585766200845784L;
      long var9 = -6720432621364299329L;
      var7 ^= (0L ^ var7) & -1L << 32;

      for(var7 ^= ~var7 & -1L >>> 32; (int)var7 <= 1; var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
         for(var9 ^= (-4294967296L ^ var9) & -1L << 32; (int)(var9 >>> 32) <= 1; var9 += 4294967296L) {
            for(var9 ^= ~var9 & -1L >>> 32; (int)var9 <= 1; var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
               if (((int)var7 | (int)(var9 >>> 32) | (int)var9) != 0 && this.IlIiillIii(pos, w.method_10069((int)var7, (int)(var9 >>> 32), (int)var9))) {
                  var7 += 4294967296L;
               }
            }
         }
      }

      return (int)(var7 >>> 32);
   }

   private void lIlIliIlIl() {
      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         this.iiIIlIIlIl();
         this.iiIIiIlIIlIiIl = true;
      }

   }

   private boolean Iliilliiilii(class_1937 stand, class_746 p, class_2338 w) {
      long var10 = -8348455354123528297L;
      class_2338[] var4 = new class_2338[]{w, w.method_10084()};
      var10 ^= ((long)var4.length << 32 ^ var10) & -1L << 32;

      for(long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         class_2338 var7 = var4[(int)var13];
         if (this.lilIiIliilIiIl.contains(var7) && !stand.method_8320(var7).method_26215()) {
            if (!this.IIlilIliiIli(stand, var7) && this.iililIlIIiilIl.IlIillIiilIi(var7)) {
               double var8 = Math.max(this.IililIllililIl.iIiiIIiliIliiIIili, p.method_55754());
               if (!this.IliilIllliilIl.IIlllIlliIll(var7, var8)) {
                  return false;
               }

               this.lIiilIliIiilIl.iIlIlllllill();
               this.Ilillllill(var7, var8, false);
               this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
               return true;
            }

            this.iIilIllIlilIll.add(w.method_10062());
            this.IIIIiIllIIIiIl.IliIlllilIi();
            this.lililiilil(llliIiIiilliIiIi.liiIiIiIIi);
            this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
            return true;
         }
      }

      return false;
   }

   private boolean iIlIiIllIi(class_1937 w) {
      long var5 = -3442339015276176261L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(class_2338 var4 : this.iIIIiIlIlIIiIl.IIillIiliIil()) {
         if (!this.iililIlIIiilIl.IlIillIiilIi(var4) || !this.IlIiillIii(w, var4)) {
            return false;
         }

         var5 += 4294967296L;
      }

      return (int)(var5 >>> 32) == 9;
   }

   private static float liiIiiiiIi(double v) {
      if (Math.abs(v) < 0.18) {
         return 0.0F;
      } else {
         return v > (double)0.0F ? 1.0F : -1.0F;
      }
   }

   void llliiillii(String msg) {
      if (this.lllilIlillilIl.field_1724 != null) {
         this.lllilIlillilIl.field_1724.method_7353(class_2561.method_43470(iiIIIlIIlIIl<invokedynamic>() + msg), false);
      }

   }

   // $FF: synthetic method
   private static CallSite iiIIIlIIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3133883191159131389L ^ Long.rotateLeft(-4709906823643944447L, 40) ^ -5884660646499693567L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1498982473140213630L ^ Long.rotateLeft(4050623680110135668L, 51) ^ 756458735812332196L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2693354321496491687L ^ Long.rotateLeft(2622586740414353732L, 61) ^ 3261197457563290133L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1885247882272302552L ^ Long.rotateLeft(-3999001110435014701L, 41) ^ -4815029263162366818L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8629016601798628751L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6563546084638299758L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5982210312245686930L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8234115259017398709L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5882008949207898094L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4590875493705492817L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIlIIliIlIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IllIIllllIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, illIIlIilIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lilIIliilIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiIIllIiIIl<invokedynamic>());
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

   private void iIIIlIlIIl(class_2338 why, String pos) {
      class_2338 var3 = why.method_10062();
      if (!this.lIllIlliIllIll.containsKey(var3)) {
         long var4 = System.currentTimeMillis();
         if (var4 - this.liIiIlliiIiIll > 10000L) {
            this.liIiIlliiIiIll = var4;
            this.llliiillii(iiIIIlIIlIIl<invokedynamic>() + var3.method_23854() + iiIIIlIIlIIl<invokedynamic>() + pos);
         }
      }

      this.lIllIlliIllIll.put(var3, 600);
      this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>() + var3.method_23854() + iiIIIlIIlIIl<invokedynamic>() + pos;
   }

   private void IIllllIlll() {
      this.IiiIiIlliiIiIl = true;
      this.iiiIiIlIIIliIl = true;
      this.lIIliIliIIliIl.clear();
      this.ilIliIlIiIliIl = this.iililIlIIiilIl.Iilllilliill();
      this.IlIliIlllIliIl = this.iililIlIIiilIl.IlIlllIlilIl();
      this.liIliIliiIliIl = this.iililIlIIiilIl.IIlllIlliIll();
      this.IIlliIllIlliIl = 0;
      this.lIllIlliIllIll.clear();
      this.iIilIllIlilIll.clear();
      this.lliliilili();
      this.iiliIllIIiiIll = iiIIIlIIlIIl<invokedynamic>();
   }

   public void lliIliliIl() {
      long var2 = 4944075321096016163L;
      var2 ^= ((long)this.iliilIlIiiilIl.IIIllIIliIIl(this.lllilIlillilIl.field_1724, this.lllilIlillilIl.field_1687) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != 0 && (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii || this.iiIIiIlIIlIiIl)) {
         this.liiilIliiiilIl.lIiiIiIlilli();
         this.IllIllllIl();
      }

      if (this.llIIiIlilIIiIl == lilIIliiilIIli.illIliiiiIilIliiii) {
         if ((int)(var2 >>> 32) == 0 && this.liiilIliiiilIl.IliIlllilIi()) {
            this.lIlIliIlIl();
         }
      } else if (this.llIIiIlilIIiIl == lilIIliiilIIli.lilIliiiiiilIliiii && this.iiIIiIlIIlIiIl && !this.liiilIliiiilIl.IliIlllilIi()) {
         this.IllIllllIl();
      }

      this.iiiIlIIIll();
   }

   private void IiIIlliIIl() {
      this.lIiiIlliIiiIll = null;
      this.IliiIlllliiIll = null;
      this.iliiIllIiiiIll = null;
      this.liiiIlliiiiIll = 0;
      this.lIIlllliIIllll = false;
      this.IIIIllllIIIlll = false;
      this.IiIIlllliIIlll = false;
      this.IllIllllllIlll = 0;
      this.illIlllIilIlll = false;
      this.lilIllliilIlll = 0;
      this.llIIlllilIIlll = 0;
      this.IIiIllllIiIlll = -1;
      this.iIiIlllIliIlll = null;
   }

   private int iIIliIlIli() {
      long var3 = 7771932617419720746L;
      if (this.iIIIiIlIlIIiIl == null) {
         return 0;
      } else {
         var3 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var3) & -1L << 32;
         var3 ^= ((long)this.iIIIiIlIlIIiIl.iIIIlIlIIl() ^ var3) & -1L >>> 32;
         if ((int)var3 - (int)(var3 >>> 32) >= 2) {
            return this.iIIIiIlIlIIiIl.IlIlllIlilIl() > 0 ? (int)(var3 >>> 32) + 1 : (int)var3 - 1;
         } else {
            return this.iIIIiIlIlIIiIl.IiIlliIliiIl();
         }
      }
   }

   private int liIlliiIll(class_1937 lo, int w, int hi) {
      long var8 = 129433954512276887L;
      long var10 = 8160615751076001088L;
      var8 ^= (0L ^ var8) & -1L << 32;

      for(var8 ^= ((long)hi ^ var8) & -1L >>> 32; (int)var8 >= w; var8 ^= (var8 ^ var8 + (long)-1) & -1L >>> 32) {
         for(var10 ^= ((long)this.iIIIiIlIlIIiIl.IIIIllIIIl() << 32 ^ var10) & -1L << 32; (int)(var10 >>> 32) <= this.iIIIiIlIlIIiIl.iIIIlIlIIl(); var10 += 4294967296L) {
            for(var10 ^= ((long)this.iIIIiIlIlIIiIl.llIIlilIIl() ^ var10) & -1L >>> 32; (int)var10 <= this.iIIIiIlIlIIiIl.IiIIlliIIl(); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
               if (this.IIliilIlii(lo, this.iIIIiIlIlIIiIl.IIlilIliiIli((int)(var10 >>> 32), (int)var10, (int)var8))) {
                  var8 += 4294967296L;
               }
            }
         }
      }

      return (int)(var8 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite illIIlIilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '벊') ^ '앗'))) - var5) - 99) << 12 | (char)((char)((char)(-((char)((char)(var4[var5] ^ '벊') ^ '앗'))) - var5) - 99) >>> 4) << 12 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '벊') ^ '앗'))) - var5) - 99) << 12 | (char)((char)((char)(-((char)((char)(var4[var5] ^ '벊') ^ '앗'))) - var5) - 99) >>> 4) >>> 4) - 17209) ^ var5) - var5) + var5) - '\ue1c4') + var5) - var5))) ^ '\ue645') ^ var5) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiIilIIlil() {
      long var4 = -3617474035340465127L;
      if (this.lliIllliliIlll >= 0) {
         class_746 var1 = this.lllilIlillilIl.field_1724;
         if (var1 != null && var1 == this.iiiIlllIIIllll && this.lllilIlillilIl.field_1761 != null) {
            if (!gg.corz.lIlIiIliIlIiIl.Illlllllilll()) {
               var4 ^= ((long)this.lliIllliliIlll << 32 ^ var4) & -1L << 32;
               class_1792 var3 = this.IiiIlllliiIlll;
               gg.corz.lIlIiIliIlIiIl.iIlIlllllill(() -> {
                  long var7 = -3471755873787067071L;
                  class_746 var3x = this.lllilIlillilIl.field_1724;
                  if (var3x != null && this.lllilIlillilIl.field_1761 != null && this.lliIllliliIlll == slotId) {
                     if (var3x.field_7512 == var3x.field_7498) {
                        var7 ^= ((long)(slotId >= 36 ? slotId - 36 : slotId) << 32 ^ var7) & -1L << 32;
                        class_1799 var5 = var3x.method_31548().method_5438((int)(var7 >>> 32));
                        var7 ^= ((long)(var3 != null && var3 != class_1802.field_8162 ? (var5.method_7909() == var3 && var3x.method_6079().method_7909() != var3 ? 1 : 0) : (var3x.method_6079().method_7909() == class_1802.field_8287 && var5.method_7960() ? 1 : 0)) ^ var7) & -1L >>> 32;
                        if ((int)var7 != 0) {
                           this.lllilIlillilIl.field_1761.method_2906(var3x.field_7498.field_7763, slotId, 40, class_1713.field_7791, var3x);
                        }

                        this.lliIllliliIlll = -1;
                        this.IiiIlllliiIlll = null;
                        this.iiiIlllIIIllll = null;
                     }
                  }
               }, true);
            }
         } else {
            this.lliIllliliIlll = -1;
            this.IiiIlllliiIlll = null;
            this.iiiIlllIIIllll = null;
         }
      }
   }
}
