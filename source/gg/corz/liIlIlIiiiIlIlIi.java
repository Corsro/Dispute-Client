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
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.LongPredicate;
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liIlIlIiiiIlIlIi {
   private int IIIlIIIIIi;
   private int iIllIIIIIi;
   public static final int IilIIIIIIi = 2;
   private long iliIIIIIIi;
   private long llIlIIIIIi;
   public static final int lilIIIIIIi = 3;
   private int IIllIIIIIi;
   public static final long iIiIIIIIIi = Long.MIN_VALUE;
   public static final int IllIIIIIIi = 1024;
   private int lIllIIIIIi;
   private final Map<Long, Long> ilIlIIIIIi = new HashMap();
   public static final int IIiIIIIIIi = 2;
   private long IiIlIIIIIi;
   public static final int IliIIIIIIi = 2;
   private final LinkedHashMap<Long, iiIlllIIllll> lliIIIIIIi = new LinkedHashMap();
   private int liiIIIIIIi;
   public static final int lllIIIIIIi = 3;
   private int iIIlIIIIIi;
   private int iiiIIIIIIi;
   private int IiiIIIIIIi;
   public static final int iilIIIIIIi = 4;
   private long IlIlIIIIIi;
   private final ArrayList<Long> liIlIIIIIi = new ArrayList();
   private String iiIlIIIIIi = "";
   public static final int illIIIIIIi = 2;
   public static final int lIiIIIIIIi = 2;
   private int lIIlIIIIIi;

   public int lilIliilIl(long same, lIllIIIiiIllIIIi... root) {
      long var10 = 6395442534871416941L;
      long var12 = 8113816228720738054L;
      iiIlllIIllll var4 = (iiIlllIIllll)this.lliIIIIIIi.get(same);
      if (var4 != null && !var4.IliIlllilIi()) {
         var10 ^= (0L ^ var10) & -1L << 32;
         lIllIIIiiIllIIIi[] var6 = root;
         var10 ^= ((long)root.length ^ var10) & -1L >>> 32;

         for(long var16 = var12 ^ (0L ^ var12) & -1L << 32; (int)(var16 >>> 32) < (int)var10; var16 += 4294967296L) {
            lIllIIIiiIllIIIi var9 = var6[(int)(var16 >>> 32)];
            if (var4.IllilIIilllilIIi.add(var9)) {
               var10 += 4294967296L;
            }
         }

         if ((int)(var10 >>> 32) > 0) {
            ++this.IiIlIIIIIi;
         }

         if ((int)(var10 >>> 32) > 0) {
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + Arrays.toString(root) + iliIiIiiIi<invokedynamic>() + iIlIiIllIi(same) + iliIiIiiIi<invokedynamic>();
         }

         return (int)(var10 >>> 32);
      } else {
         return 0;
      }
   }

   public IiilliIlliilliIl iiIIlIIlIl(long dependencyKey, boolean built) {
      ++this.IiIlIIIIIi;

      for(iiIlllIIllll var5 : this.lliIIIIIIi.values()) {
         if (var5.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.llIiilliil && var5.lililIIiiililIIi == dependencyKey) {
            iiiIlIIiIIIllIIi var6 = var5.iiIilIIiIIlilIIi;
            if (built) {
               var5.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IiIiilliil;
               var5.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               ++this.iiiIIIIIIi;
               var5.iiiilIIiIIIIiIIi = 0;
               var5.IIlIiIIilIlIiIIi = 0;
               var5.iIlIiIIiIllIiIIi = 0;
               var5.IlIIiIIillIIiIIi = 0;
               var5.IliIiIIilliIiIIi = this.IlIlIIIIIi;
               var5.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>();
               this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(var5.llIilIIiilIilIIi) + iliIiIiiIi<invokedynamic>();
            } else {
               var5.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var5.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var5.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + dependencyKey + iliIiIiiIi<invokedynamic>();
               this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(var5.llIilIIiilIilIIi) + iliIiIiiIi<invokedynamic>() + var5.lIlilIIiiIlilIIi + iliIiIiiIi<invokedynamic>() + IlIIillIIi(var5);
            }

            return new IiilliIlliilliIl(var6, var5.iiIilIIiIIlilIIi, built ? null : IlIIillIIi(var5), var5.IllliIIilllliIIi);
         }
      }

      this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + dependencyKey + iliIiIiiIi<invokedynamic>() + (built ? iliIiIiiIi<invokedynamic>() : iliIiIiiIi<invokedynamic>()) + iliIiIiiIi<invokedynamic>();
      return null;
   }

   public int liIIiiiIIi() {
      return this.IIllIIIIIi;
   }

   private static boolean iliIiiliiiii(long[] v, long a) {
      long var8 = -3518259076833904322L;
      long[] var3 = v;
      var8 ^= ((long)v.length << 32 ^ var8) & -1L << 32;

      for(long var11 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         long var6 = var3[(int)var11];
         if (var6 == a) {
            return true;
         }
      }

      return false;
   }

   private void lIiiIiIlilli(iiIlllIIllll e) {
      ArrayList var2 = null;

      for(long var4 : e.IilIiIIililIiIIi) {
         Long var6 = (Long)this.ilIlIIIIIi.get(var4);
         if (var6 == null || var6 != e.llIilIIiilIilIIi) {
            iiIlllIIllll var7 = var6 == null ? null : (iiIlllIIllll)this.lliIIIIIIi.get(var6);
            if (var7 == null || var7.IliIlllilIi()) {
               if (var2 == null) {
                  var2 = new ArrayList(e.IiIilIIiliIilIIi);
               }

               var2.add(var4);
            }
         }
      }

      if (var2 != null) {
         e.IilIiIIililIiIIi = var2;
      } else {
         e.IilIiIIililIiIIi = null;
         e.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
      }

   }

   public int iiIilIIlil() {
      return this.liiIIIIIIi;
   }

   private void IiIlliIliiIl(long root) {
      iiIlllIIllll var3 = (iiIlllIIllll)this.lliIIIIIIi.remove(root);
      if (var3 != null) {
         for(long var5 : var3.IiIilIIiliIilIIi) {
            this.ilIlIIIIIi.remove(var5, root);
         }

         this.liIlIIIIIi.addAll(var3.IiIilIIiliIilIIi);
         if (var3.IilIiIIililIiIIi != null) {
            this.liIlIIIIIi.addAll(var3.IilIiIIililIiIIi);
         }

      }
   }

   public IiilliIlliilliIl IllIllllIl(long why, String root) {
      ++this.IiIlIIIIIi;
      iiIlllIIllll var4 = (iiIlllIIllll)this.lliIIIIIIi.get(why);
      if (var4 != null && !var4.IliIlllilIi()) {
         iiiIlIIiIIIllIIi var5 = var4.iiIilIIiIIlilIIi;
         var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IiIiilliil;
         var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
         ++this.iiiIIIIIIi;
         var4.iiiilIIiIIIIiIIi = 0;
         var4.IIlIiIIilIlIiIIi = 0;
         var4.iIlIiIIiIllIiIIi = 0;
         var4.IlIIiIIillIIiIIi = 0;
         var4.IliIiIIilliIiIIi = this.IlIlIIIIIi;
         var4.IllliIIilllliIIi = root == null ? "" : root;
         this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(why) + iliIiIiiIi<invokedynamic>() + var4.IllliIIilllliIIi + iliIiIiiIi<invokedynamic>();
         return new IiilliIlliilliIl(var5, var4.iiIilIIiIIlilIIi, (lIllIIIiiIllIIIi)null, var4.IllliIIilllliIIi);
      } else {
         return null;
      }
   }

   private IiilliIlliilliIl lIIIiiIIIi(long r, lIllIIIiiIllIIIi s, lIliiIiliIliiIil t, IiilliIlliilliIl root) {
      this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(r) + iliIiIiiIi<invokedynamic>() + s + iliIiIiiIi<invokedynamic>() + t + iliIiIiiIi<invokedynamic>() + (root == null ? iliIiIiiIi<invokedynamic>() : (root.iIlIlllllill() == null ? root.liiiIIllIl() : root.iIlIlllllill()));
      return root;
   }

   public int ilillIiill() {
      return this.lliIIIIIIi.size();
   }

   public Long Iilililiiili() {
      iiIlllIIllll var1 = null;

      for(iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         if (var3.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil && (var1 == null || var3.lIlliIIiiIlliIIi < var1.lIlliIIiiIlliIIi)) {
            var1 = var3;
         }
      }

      return var1 == null ? null : var1.llIilIIiilIilIIi;
   }

   public int lIliliIlil() {
      return this.iiiIIIIIIi;
   }

   public int lliIliliIl(long epoch, LongPredicate reconsider) {
      return this.iiiIlIIIll(epoch, (r) -> Long.MIN_VALUE, reconsider);
   }

   public int lililiilil() {
      return this.iIIlIIIIIi;
   }

   private static int[] liiiIIllIl(List<Long> members) {
      long var17 = 8603650993160332975L;
      long var19 = -8259632255507130324L;
      long var21 = -7330280950417803483L;
      long var13 = -4602716935841294748L;
      long var15 = -104913505299859802L;
      if (members.isEmpty()) {
         return new int[0];
      } else {
         var13 ^= (9223372032559808512L ^ var13) & -1L << 32;
         var13 ^= (2147483647L ^ var13) & -1L >>> 32;
         var15 ^= (9223372032559808512L ^ var15) & -1L << 32;
         var15 ^= (-2147483648L ^ var15) & -1L >>> 32;
         var17 ^= (Long.MIN_VALUE ^ var17) & -1L << 32;
         var17 ^= (-2147483648L ^ var17) & -1L >>> 32;

         for(long var8 : members) {
            var19 ^= ((long)llIiIiililIiIiil.IiIlliIliiIl(var8) << 32 ^ var19) & -1L << 32;
            var19 ^= ((long)llIiIiililIiIiil.IIlllIlliIll(var8) ^ var19) & -1L >>> 32;
            var21 ^= ((long)llIiIiililIiIiil.Illlllllilll(var8) << 32 ^ var21) & -1L << 32;
            if ((int)(var19 >>> 32) < (int)(var13 >>> 32)) {
               var13 ^= ((long)((int)(var19 >>> 32)) << 32 ^ var13) & -1L << 32;
            }

            if ((int)(var19 >>> 32) > (int)var15) {
               var15 ^= ((long)((int)(var19 >>> 32)) ^ var15) & -1L >>> 32;
            }

            if ((int)var19 < (int)var13) {
               var13 ^= ((long)((int)var19) ^ var13) & -1L >>> 32;
            }

            if ((int)var19 > (int)(var17 >>> 32)) {
               var17 ^= ((long)((int)var19) << 32 ^ var17) & -1L << 32;
            }

            if ((int)(var21 >>> 32) < (int)(var15 >>> 32)) {
               var15 ^= ((long)((int)(var21 >>> 32)) << 32 ^ var15) & -1L << 32;
            }

            if ((int)(var21 >>> 32) > (int)var17) {
               var17 ^= ((long)((int)(var21 >>> 32)) ^ var17) & -1L >>> 32;
            }
         }

         return new int[]{(int)(var13 >>> 32), (int)var13, (int)(var15 >>> 32), (int)var15, (int)(var17 >>> 32), (int)var17};
      }
   }

   public IIIllllIIlll iilllIIill(long root) {
      iiIlllIIllll var3 = (iiIlllIIllll)this.lliIIIIIIi.get(root);
      return var3 == null ? null : var3.liiiIIllIl();
   }

   public int IIIillIIil(ilIiIlIlIiIiIlIl d) {
      long var5 = -1220818972759798937L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil && var4.illilIIiIililIIi == d) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public long IIIilIIiiIIi(long root) {
      iiIlllIIllll var3 = (iiIlllIIllll)this.lliIIIIIIi.get(root);
      return var3 == null ? Long.MIN_VALUE : var3.iIIliIIiIlIliIIi;
   }

   public boolean Illillliilli(long stampKey, Collection<Long> epoch, long originKey, long members, long root, String reason) {
      long var21 = -1461968913987681215L;
      long var23 = 966681500006524982L;
      long var25 = -9145361673809352029L;
      long var27 = 7213412504886869492L;
      iiIlllIIllll var11 = (iiIlllIIllll)this.lliIIIIIIi.get(stampKey);
      if (var11 == null) {
         if (this.lliIIIIIIi.size() >= 1024 && !this.ilIIiIiIIi()) {
            ++this.IIllIIIIIi;
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + 1024 + iliIiIiiIi<invokedynamic>();
            return false;
         } else {
            var11 = new iiIlllIIllll(stampKey, new ArrayList(), originKey);
            this.lliIIIIIIi.put(stampKey, var11);
            ++this.IiIlIIIIIi;
            this.iIlIlllllill(var11, epoch);
            IlIlllIlilIl(var11, members);
            var11.IliIiIIilliIiIIi = this.IlIlIIIIIi;
            var11.lllIiIIiillIiIIi = var11.IiIilIIiliIilIIi.size();
            if (root != Long.MIN_VALUE) {
               var11.iIIliIIiIlIliIIi = root;
               var11.llIliIIiilIliIIi = new long[]{root};
            }

            var11.IllliIIilllliIIi = reason == null ? "" : reason;
            ++this.IiiIIIIIIi;
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + this.lliIIIIIIi.size() + iliIiIiiIi<invokedynamic>() + var11.IllliIIilllliIIi;
            return true;
         }
      } else if (!var11.IliIlllilIi()) {
         if (epoch != null && !epoch.isEmpty() && !this.Iilllilliill(var11, epoch)) {
            var21 ^= ((long)this.Illlllllilll(var11, epoch) << 32 ^ var21) & -1L << 32;
            var21 ^= ((long)this.iIlIlllllill(var11, epoch) ^ var21) & -1L >>> 32;
            if ((int)(var21 >>> 32) != 0 && var11.iIlIiIIiIllIiIIi < 2) {
               ++var11.iIlIiIIiIllIiIIi;
               var11.lllIiIIiillIiIIi = var11.IiIilIIiliIilIIi.size();
            }

            ++this.IiIlIIIIIi;
            if ((int)var21 != 0 && var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil && !var11.IllilIIilllilIIi.isEmpty() && var11.lIIIiIIiiIIIiIIi < 2) {
               ++var11.lIIIiIIiiIIIiIIi;
               var11.IllilIIilllilIIi.clear();
               IlIlllIlilIl(var11, Long.MIN_VALUE);
            }
         }

         if (var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil && var11.illilIIiIililIIi == ilIiIlIlIiIiIlIl.llIiIIIiIl && originKey != var11.IIiilIIilIiilIIi) {
            var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var11.IIiilIIilIiilIIi = originKey;
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + reason + iliIiIiiIi<invokedynamic>();
            ++this.IiIlIIIIIi;
            return true;
         } else {
            return var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil;
         }
      } else {
         var21 ^= ((long)(members != Long.MIN_VALUE && var11.lIiIiIIiiIiIiIIi != Long.MIN_VALUE && members != var11.lIiIiIIiiIiIiIIi ? 1 : 0) << 32 ^ var21) & -1L << 32;
         var21 ^= ((long)(epoch != null && !epoch.isEmpty() && this.Illlllllilll(var11, epoch) ? 1 : 0) ^ var21) & -1L >>> 32;
         var23 ^= ((long)(root != Long.MIN_VALUE && var11.iIIliIIiIlIliIIi != Long.MIN_VALUE && root != var11.iIIliIIiIlIliIIi && !iliIiiliiiii(var11.llIliIIiilIliIIi, root) && var11.llIliIIiilIliIIi.length < 4 ? 1 : 0) << 32 ^ var23) & -1L << 32;
         var23 ^= ((long)((int)(var21 >>> 32) == 0 && (int)var21 == 0 && (int)(var23 >>> 32) == 0 ? 0 : 1) ^ var23) & -1L >>> 32;
         String var16 = (int)(var21 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() : ((int)var21 != 0 ? iliIiIiiIi<invokedynamic>() : ((int)(var23 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() + (var11.llIliIIiilIliIIi.length + 1) + iliIiIiiIi<invokedynamic>() + 4 + iliIiIiiIi<invokedynamic>() : ""));
         iiiIlIIiIIIllIIi var17 = var11.iiIilIIiIIlilIIi;
         if (var11.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil) {
            if ((int)var23 == 0 && originKey == var11.IIiilIIilIiilIIi) {
               this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + var11.iiIilIIiIIlilIIi + iliIiIiiIi<invokedynamic>();
               return false;
            } else {
               String var18;
               if ((int)var23 != 0) {
                  if (((int)(var21 >>> 32) != 0 || (int)var21 != 0) && !this.IIillIiliIil(var11)) {
                     if ((int)var21 != 0) {
                        var11.IilIiIIililIiIIi = new ArrayList(epoch);
                        var11.iilIiIIiIIiIiIIi = root;
                     }

                     if ((int)(var21 >>> 32) != 0) {
                        var11.liiIiIIiiiiIiIIi = members;
                        var11.iliIiIIiIiiIiIIi = -1L;
                     }

                     this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + ((int)(var21 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() : iliIiIiiIi<invokedynamic>()) + iliIiIiiIi<invokedynamic>() + var11.iiiilIIiIIIIiIIi + iliIiIiiIi<invokedynamic>();
                     return false;
                  }

                  var11.IilIiIIililIiIIi = null;
                  var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
                  if ((int)(var21 >>> 32) == 0 && (int)var21 == 0) {
                     if ((int)(var23 >>> 32) != 0) {
                        var11.llIliIIiilIliIIi = IIIllIIliIIl(var11.llIliIIiilIliIIi, root);
                     }
                  } else {
                     ++var11.iiiilIIiIIIIiIIi;
                     var11.ilIIiIIiIiIIiIIi = 0;
                     var11.llIliIIiilIliIIi = root != Long.MIN_VALUE ? new long[]{root} : new long[0];
                  }

                  var11.IiiilIIiliiilIIi = 0;
                  var11.IlIIiIIillIIiIIi = 0;
                  var18 = iliIiIiiIi<invokedynamic>() + var16 + iliIiIiiIi<invokedynamic>() + ((int)(var21 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() + var11.iiiilIIiIIIIiIIi + iliIiIiiIi<invokedynamic>() : "");
               } else {
                  if (++var11.IiiilIIiliiilIIi > 3) {
                     var25 ^= ((long)(var11.IiiilIIiliiilIIi == 4 ? 1 : 0) << 32 ^ var25) & -1L << 32;
                     if ((int)(var25 >>> 32) != 0) {
                        ++this.iIllIIIIIi;
                     }

                     this.iiIlIIIIIi = ((int)(var25 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() : iliIiIiiIi<invokedynamic>()) + iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + 3 + iliIiIiiIi<invokedynamic>();
                     return false;
                  }

                  var18 = iliIiIiiIi<invokedynamic>() + var11.IiiilIIiliiilIIi + iliIiIiiIi<invokedynamic>() + 3 + iliIiIiiIi<invokedynamic>();
               }

               this.iIlIlllllill(var11, (Collection)(epoch != null && !epoch.isEmpty() ? epoch : var11.IiIilIIiliIilIIi));
               var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var11.IllilIIilllilIIi.clear();
               var11.lIlilIIiiIlilIIi = null;
               var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var11.lililIIiiililIIi = 0L;
               var11.lliilIIiiliilIIi = 0;
               var11.lIIIiIIiiIIIiIIi = 0;
               var11.IIlIiIIilIlIiIIi = 0;
               var11.iIlIiIIiIllIiIIi = 0;
               var11.lllIiIIiillIiIIi = var11.IiIilIIiliIilIIi.size();
               if ((int)var23 == 0) {
                  var11.IilIiIIililIiIIi = null;
                  var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
               }

               var11.IIiilIIilIiilIIi = originKey;
               IlIlllIlilIl(var11, members);
               if (root != Long.MIN_VALUE) {
                  var11.iIIliIIiIlIliIIi = root;
               }

               var11.IllliIIilllliIIi = var18 + iliIiIiiIi<invokedynamic>() + reason + iliIiIiiIi<invokedynamic>();
               this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + this.lliIIIIIIi.size() + iliIiIiiIi<invokedynamic>() + var11.IllliIIilllliIIi;
               ++this.IlIlIIIIIi;
               ++this.IiIlIIIIIi;
               return true;
            }
         } else {
            var25 ^= ((long)((int)var21 == 0 && epoch != null && !epoch.isEmpty() && epoch.size() < Math.min(var11.IiIilIIiliIilIIi.size(), var11.lllIiIIiillIiIIi) ? 1 : 0) ^ var25) & -1L >>> 32;
            if ((int)var23 == 0 && (int)var25 == 0) {
               if (++var11.lliilIIiiliilIIi > 2) {
                  var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
                  var11.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
                  var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                  ++this.lIIlIIIIIi;
                  var11.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + var17 + iliIiIiiIi<invokedynamic>() + var11.lliilIIiiliilIIi + iliIiIiiIi<invokedynamic>() + reason + iliIiIiiIi<invokedynamic>();
                  var11.IIiilIIilIiilIIi = originKey;
                  var11.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                  this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + var11.IllliIIilllliIIi + iliIiIiiIi<invokedynamic>();
                  ++this.IiIlIIIIIi;
                  return false;
               } else {
                  if (this.iIlIlllllill(var11, (Collection)(epoch != null && !epoch.isEmpty() ? epoch : var11.IiIilIIiliIilIIi))) {
                     IlIlllIlilIl(var11, Long.MIN_VALUE);
                  }

                  var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
                  var11.lIlilIIiiIlilIIi = null;
                  var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                  var11.lililIIiiililIIi = 0L;
                  var11.IIiilIIilIiilIIi = originKey;
                  var11.IilIiIIililIiIIi = null;
                  var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
                  var11.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + var17 + iliIiIiiIi<invokedynamic>() + var11.lliilIIiiliilIIi + iliIiIiiIi<invokedynamic>() + 2 + iliIiIiiIi<invokedynamic>() + reason;
                  this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + this.lliIIIIIIi.size() + iliIiIiiIi<invokedynamic>() + var11.IllliIIilllliIIi;
                  ++this.IlIlIIIIIi;
                  ++this.IiIlIIIIIi;
                  return true;
               }
            } else {
               var25 ^= ((long)(var11.IIlIiIIilIlIiIIi >= 2 && this.IlIlIIIIIi - var11.IliIiIIilliIiIIi < 1L << Math.min(var11.IIlIiIIilIlIiIIi, 12) ? 0 : 1) << 32 ^ var25) & -1L << 32;
               var27 ^= (0L ^ var27) & -1L << 32;
               if ((int)var25 != 0) {
                  var16 = (var16.isEmpty() ? "" : var16 + iliIiIiiIi<invokedynamic>()) + (var11.IiIilIIiliIilIIi.size() - epoch.size()) + iliIiIiiIi<invokedynamic>();
               } else if (((int)(var21 >>> 32) != 0 || (int)var21 != 0) && (int)(var25 >>> 32) == 0) {
                  if (++var11.lliilIIiiliilIIi > 2) {
                     var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
                     var11.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
                     var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                     ++this.lIIlIIIIIi;
                     var11.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + var17 + iliIiIiiIi<invokedynamic>() + var11.lliilIIiiliilIIi + iliIiIiiIi<invokedynamic>() + reason + iliIiIiiIi<invokedynamic>();
                     var11.IIiilIIilIiilIIi = originKey;
                     var11.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                     var11.lIiIiIIiiIiIiIIi = members;
                     var11.iliIiIIiIiiIiIIi = -1L;
                     var11.liiIiIIiiiiIiIIi = Long.MIN_VALUE;
                     if (root != Long.MIN_VALUE && !iliIiiliiiii(var11.llIliIIiilIliIIi, root) && var11.llIliIIiilIliIIi.length < 4) {
                        var11.llIliIIiilIliIIi = IIIllIIliIIl(var11.llIliIIiilIliIIi, root);
                     }

                     if ((int)var21 != 0) {
                        var11.IilIiIIililIiIIi = new ArrayList(epoch);
                        var11.iilIiIIiIIiIiIIi = root;
                     }

                     this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + var11.IllliIIilllliIIi + iliIiIiiIi<invokedynamic>();
                     ++this.IiIlIIIIIi;
                     return false;
                  }

                  var16 = var16 + iliIiIiiIi<invokedynamic>() + var11.lliilIIiiliilIIi + iliIiIiiIi<invokedynamic>() + 2;
               } else if ((int)(var21 >>> 32) != 0 || (int)var21 != 0) {
                  var11.lliilIIiiliilIIi = 0;
                  var27 ^= (4294967296L ^ var27) & -1L << 32;
               }

               if (((int)(var21 >>> 32) != 0 || (int)var21 != 0) && (int)var25 == 0) {
                  ++var11.IIlIiIIilIlIiIIi;
               }

               this.iIlIlllllill(var11, (Collection)(epoch != null && !epoch.isEmpty() ? epoch : var11.IiIilIIiliIilIIi));
               var11.lllIiIIiillIiIIi = (int)(var27 >>> 32) != 0 ? var11.IiIilIIiliIilIIi.size() : Math.min(var11.lllIiIIiillIiIIi, var11.IiIilIIiliIilIIi.size());
               var11.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var11.IllilIIilllilIIi.clear();
               var11.lIlilIIiiIlilIIi = null;
               var11.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var11.lililIIiiililIIi = 0L;
               var11.IiiilIIiliiilIIi = 0;
               var11.lIIIiIIiiIIIiIIi = 0;
               var11.IlIIiIIillIIiIIi = 0;
               var11.IilIiIIililIiIIi = null;
               var11.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
               if ((int)(var27 >>> 32) != 0 || (int)var25 != 0 && (int)(var21 >>> 32) != 0) {
                  var11.ilIIiIIiIiIIiIIi = 0;
                  var11.llIliIIiilIliIIi = root != Long.MIN_VALUE ? new long[]{root} : new long[0];
               } else if (root != Long.MIN_VALUE && !iliIiiliiiii(var11.llIliIIiilIliIIi, root) && var11.llIliIIiilIliIIi.length < 4) {
                  var11.llIliIIiilIliIIi = IIIllIIliIIl(var11.llIliIIiilIliIIi, root);
               }

               var11.IIiilIIilIiilIIi = originKey;
               IlIlllIlilIl(var11, members);
               if (root != Long.MIN_VALUE) {
                  var11.iIIliIIiIlIliIIi = root;
               }

               var11.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + var16 + iliIiIiiIi<invokedynamic>() + var17 + iliIiIiiIi<invokedynamic>() + reason + iliIiIiiIi<invokedynamic>();
               this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(stampKey) + iliIiIiiIi<invokedynamic>() + this.lliIIIIIIi.size() + iliIiIiiIi<invokedynamic>() + var11.IllliIIilllliIIi;
               ++this.IlIlIIIIIi;
               ++this.IiIlIIIIIi;
               return true;
            }
         }
      }
   }

   public IiilliIlliilliIl llIililIil(long root, long lapseKey, String why) {
      ++this.IiIlIIIIIi;
      iiIlllIIllll var6 = (iiIlllIIllll)this.lliIIIIIIi.get(root);
      if (var6 != null && var6.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil) {
         if (var6.ilIIiIIiIiIIiIIi >= 2) {
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(root) + iliIiIiiIi<invokedynamic>() + 2 + iliIiIiiIi<invokedynamic>();
            return null;
         } else {
            ++var6.ilIIiIIiIiIIiIIi;
            iiiIlIIiIIIllIIi var7 = var6.iiIilIIiIIlilIIi;
            var6.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.ilIiilliil;
            var6.illilIIiIililIIi = ilIiIlIlIiIiIlIl.ilIiIIIiIl;
            var6.lililIIiiililIIi = lapseKey;
            var6.IllilIIilllilIIi.clear();
            var6.lIIIiIIiiIIIiIIi = 0;
            var6.lIlilIIiiIlilIIi = null;
            var6.IllliIIilllliIIi = why == null ? "" : why;
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(root) + iliIiIiiIi<invokedynamic>() + lapseKey + iliIiIiiIi<invokedynamic>() + var6.ilIIiIIiIiIIiIIi + iliIiIiiIi<invokedynamic>() + 2 + iliIiIiiIi<invokedynamic>() + var6.IllliIIilllliIIi + iliIiIiiIi<invokedynamic>();
            return new IiilliIlliilliIl(var7, var6.iiIilIIiIIlilIIi, (lIllIIIiiIllIIIi)null, var6.IllliIIilllliIIi);
         }
      } else {
         return null;
      }
   }

   public boolean IIlilIliiIli(long epoch, Collection<Long> members, long reason, long root, String stampKey) {
      return this.Illillliilli(epoch, members, reason, root, Long.MIN_VALUE, stampKey);
   }

   private boolean iIlIlllllill(iiIlllIIllll members, Collection<Long> e) {
      int[] var3 = members.IiIliIIiliIliIIi;

      for(long var5 : members.IiIilIIiliIilIIi) {
         this.ilIlIIIIIi.remove(var5, members.llIilIIiilIilIIi);
      }

      members.IiIilIIiliIilIIi = new ArrayList(e);

      for(long var9 : members.IiIilIIiliIilIIi) {
         Long var7 = (Long)this.ilIlIIIIIi.put(var9, members.llIilIIiilIilIIi);
         if (var7 != null && var7 != members.llIilIIiilIilIIi) {
            this.IilliliilIIi(var7, var9);
         }
      }

      members.IiIliIIiliIliIIi = liiiIIllIl(members.IiIilIIiliIilIIi);
      return !Arrays.equals(var3, members.IiIliIIiliIliIIi);
   }

   public iiiIlIIiIIIllIIi lIilliIill(long root) {
      iiIlllIIllll var3 = (iiIlllIIllll)this.lliIIIIIIi.get(root);
      return var3 == null ? null : var3.iiIilIIiIIlilIIi;
   }

   private static lIllIIIiiIllIIIi IlIIillIIi(iiIlllIIllll e) {
      long var5 = 3671375783079041716L;
      lIllIIIiiIllIIIi[] var1 = IllIililllIili.liiiIIllIl();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         lIllIIIiiIllIIIi var4 = var1[(int)var8];
         if (var4 == lIllIIIiiIllIIIi.iilIlIliil) {
            break;
         }

         if (!e.IllilIIilllilIIi.contains(var4)) {
            return var4;
         }
      }

      return null;
   }

   public List<IIIllllIIlll> lliililiil() {
      ArrayList var1 = new ArrayList();

      for(iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         var1.add(var3.liiiIIllIl());
      }

      return var1;
   }

   public int Iillllilll(boolean completionMissionActive, boolean materialAvailable, boolean serviceMissionActive, boolean banLive, boolean planInFlight) {
      long var10 = 132894678276075828L;
      ++this.IiIlIIIIIi;
      var10 ^= (0L ^ var10) & -1L << 32;

      for(iiIlllIIllll var8 : this.lliIIIIIIi.values()) {
         byte var10000;
         label64: {
            if ((var8.iiIilIIiIIlilIIi != iiiIlIIiIIIllIIi.IlIiilliil || banLive) && (var8.iiIilIIiIIlilIIi != iiiIlIIiIIIllIIi.llIiilliil || completionMissionActive)) {
               label63: {
                  if (var8.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil) {
                     switch (var8.illilIIiIililIIi.ordinal()) {
                        case 1:
                           if (!completionMissionActive) {
                              break label63;
                           }
                           break;
                        case 2:
                           if (!materialAvailable) {
                              break label63;
                           }
                           break;
                        case 3:
                           if (serviceMissionActive) {
                              break label63;
                           }
                           break;
                        case 4:
                           if (!completionMissionActive && !materialAvailable) {
                              break label63;
                           }
                           break;
                        case 5:
                           if (!planInFlight) {
                              break label63;
                           }
                           break;
                        default:
                           break label63;
                     }
                  }

                  var10000 = 0;
                  break label64;
               }
            }

            var10000 = 1;
         }

         var10 ^= ((long)var10000 ^ var10) & -1L >>> 32;
         if ((int)var10 != 0) {
            var8.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var8.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var8.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>();
            var10 += 4294967296L;
         }
      }

      if ((int)(var10 >>> 32) > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + (int)(var10 >>> 32);
      }

      return (int)(var10 >>> 32);
   }

   public int[] Ililllililil(long root) {
      iiIlllIIllll var3 = (iiIlllIIllll)this.lliIIIIIIi.get(root);
      return var3 == null ? new int[0] : (var3.iiIliIIiIIlliIIi.length == 6 ? (int[])var3.iiIliIIiIIlliIIi.clone() : (int[])var3.IiIliIIiliIliIIi.clone());
   }

   public int IIiIllIiIl(ilIiIlIlIiIiIlIl dep) {
      long var5 = -8614609888405152375L;
      ++this.IiIlIIIIIi;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil && var4.illilIIiIililIIi == dep) {
            var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var4.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + dep + iliIiIiiIi<invokedynamic>();
            var5 += 4294967296L;
         }
      }

      if ((int)(var5 >>> 32) > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + dep + iliIiIiiIi<invokedynamic>() + (int)(var5 >>> 32);
      }

      return (int)(var5 >>> 32);
   }

   public List<Long> IIlllIlliIll() {
      if (this.liIlIIIIIi.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList(this.liIlIIIIIi);
         this.liIlIIIIIi.clear();
         return var1;
      }
   }

   public IiilliIlliilliIl IiIIlliIIl(long waitOn, lIllIIIiiIllIIIi strategy, lIliiIiliIliiIil epoch, ilIiIlIlIiIiIlIl root, long r, long dependencyKey) {
      iiIlllIIllll var10 = (iiIlllIIllll)this.lliIIIIIIi.get(waitOn);
      if (var10 == null) {
         return null;
      } else {
         ++this.IlIlIIIIIi;
         if (var10.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.IlIiilliil && dependencyKey != Long.MIN_VALUE) {
            var10.IIiilIIilIiilIIi = dependencyKey;
         }

         if (var10.iiIilIIiIIlilIIi != iiiIlIIiIIIllIIi.IlIiilliil) {
            ++this.lIllIIIIIi;
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(waitOn) + iliIiIiiIi<invokedynamic>() + strategy + iliIiIiiIi<invokedynamic>() + epoch + iliIiIiiIi<invokedynamic>() + var10.iiIilIIiIIlilIIi + iliIiIiiIi<invokedynamic>();
            return null;
         } else {
            ++this.IiIlIIIIIi;
            iiiIlIIiIIIllIIi var11 = var10.iiIilIIiIIlilIIi;
            if (strategy != null) {
               var10.IllilIIilllilIIi.add(strategy);
            }

            switch (epoch.ordinal()) {
               case 0:
                  var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.llIiilliil;
                  var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.lIIiIIIiIl;
                  var10.lililIIiiililIIi = r;
                  var10.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + r + iliIiIiiIi<invokedynamic>();
                  return this.lIIIiiIIIi(waitOn, strategy, epoch, new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, (lIllIIIiiIllIIIi)null, var10.IllliIIilllliIIi));
               case 1:
                  var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.liIiilliil;
                  var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                  ++this.IIIlIIIIIi;
                  var10.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                  var10.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>();
                  this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(waitOn) + iliIiIiiIi<invokedynamic>();
                  return new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, (lIllIIIiiIllIIIi)null, var10.IllliIIilllliIIi);
               case 5:
                  if (root != null && root != ilIiIlIlIiIiIlIl.IIIiIIIiIl) {
                     var10.IllilIIilllilIIi.remove(strategy);
                     var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.ilIiilliil;
                     var10.illilIIiIililIIi = root;
                     var10.lililIIiiililIIi = r;
                     var10.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + root;
                     return this.lIIIiiIIIi(waitOn, strategy, epoch, new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, strategy, var10.IllliIIilllliIIi));
                  }

                  return this.llIIlilIIl(waitOn, strategy, lIliiIiliIliiIil.lilililIil, ilIiIlIlIiIiIlIl.IIIiIIIiIl, 0L);
               default:
                  lIllIIIiiIllIIIi var12 = IlIIillIIi(var10);
                  if (var12 == null) {
                     var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
                     var10.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
                     var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                     ++this.lIIlIIIIIi;
                     var10.IliIiIIilliIiIIi = this.IlIlIIIIIi;
                     var10.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + var10.IIiilIIilIiilIIi + iliIiIiiIi<invokedynamic>() + strategy + iliIiIiiIi<invokedynamic>() + epoch + iliIiIiiIi<invokedynamic>();
                     this.lIIIiiIIIi(waitOn, strategy, epoch, (IiilliIlliilliIl)null);
                     this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(waitOn) + iliIiIiiIi<invokedynamic>() + var10.IllliIIilllliIIi + iliIiIiiIi<invokedynamic>();
                     return new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, (lIllIIIiiIllIIIi)null, var10.IllliIIilllliIIi);
                  } else {
                     var10.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
                     var10.lIlilIIiiIlilIIi = null;
                     var10.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
                     var10.IllliIIilllliIIi = strategy + iliIiIiiIi<invokedynamic>() + epoch + iliIiIiiIi<invokedynamic>() + var12;
                     return this.lIIIiiIIIi(waitOn, strategy, epoch, new IiilliIlliilliIl(var11, var10.iiIilIIiIIlilIIi, var12, var10.IllliIIilllliIIi));
                  }
            }
         }
      }
   }

   public int IlIllllIll(long forceDeferred, long reconsider, LongUnaryOperator stampOf, LongPredicate admitDeferred, boolean epoch, boolean topologyRev) {
      long var33 = -8844016998617352190L;
      long var35 = 8120789200950455294L;
      long var37 = -290323042541594497L;
      long var39 = -8735667382787084725L;
      long var41 = 7445773742820142004L;
      long var29 = -566422507455829499L;
      long var31 = -3999572360216592322L;
      ++this.IiIlIIIIIi;
      ++this.IlIlIIIIIi;
      ++this.llIlIIIIIi;
      var29 ^= (0L ^ var29) & -1L << 32;
      var29 ^= (0L ^ var29) & -1L >>> 32;
      var31 ^= (0L ^ var31) & -1L << 32;
      long var12 = 0L;

      for(iiIlllIIllll var15 : this.lliIIIIIIi.values()) {
         if (!var15.IiIilIIiliIilIIi.isEmpty()) {
            var31 ^= ((long)(var15.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.ilIiilliil && var15.illilIIiIililIIi == ilIiIlIlIiIiIlIl.llIiIIIiIl ? 1 : 0) ^ var31) & -1L >>> 32;
            var33 ^= (0L ^ var33) & -1L << 32;
            var33 ^= (0L ^ var33) & -1L >>> 32;
            var35 ^= (0L ^ var35) & -1L << 32;
            var35 ^= (0L ^ var35) & -1L >>> 32;
            var37 ^= (0L ^ var37) & -1L << 32;
            long var22 = Long.MIN_VALUE;
            if (var15.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil) {
               if (reconsider >= 0L && var15.iliIiIIiIiiIiIIi == reconsider) {
                  var22 = var15.liiIiIIiiiiIiIIi;
               } else {
                  var22 = stampOf.applyAsLong(var15.llIilIIiilIilIIi);
                  var15.liiIiIIiiiiIiIIi = var22;
                  var15.iliIiIIiIiiIiIIi = reconsider;
               }

               var37 ^= ((long)(var22 != Long.MIN_VALUE && var15.lIiIiIIiiIiIiIIi != Long.MIN_VALUE && var22 != var15.lIiIiIIiiIiIiIIi ? 1 : 0) << 32 ^ var37) & -1L << 32;
               if (var15.IilIiIIililIiIIi != null) {
                  this.lIiiIiIlilli(var15);
               }

               var35 ^= ((long)(var15.IilIiIIililIiIIi != null ? 1 : 0) << 32 ^ var35) & -1L << 32;
               var37 ^= ((long)((int)(var37 >>> 32) == 0 && (int)(var35 >>> 32) == 0 ? 0 : 1) ^ var37) & -1L >>> 32;
               var39 ^= (0L ^ var39) & -1L << 32;
               var39 ^= (0L ^ var39) & -1L >>> 32;
               var41 ^= (0L ^ var41) & -1L << 32;
               if ((int)var37 != 0 && !this.IIillIiliIil(var15)) {
                  var41 ^= ((long)(epoch && this.llIlIIIIIi - var15.IIIliIIilIIliIIi >= 1L << Math.min(var15.iiiilIIiIIIIiIIi, 12) ? 1 : 0) ^ var41) & -1L >>> 32;
                  var35 ^= ((long)((int)var41 == 0 && topologyRev && var15.liIIiIIiiiIIiIIi < 2 ? 1 : 0) ^ var35) & -1L >>> 32;
                  var41 ^= ((long)((int)var41 == 0 && (int)var35 == 0 ? 0 : 1) << 32 ^ var41) & -1L << 32;
                  if ((int)(var41 >>> 32) == 0) {
                     var39 ^= ((long)(var15.IlIIiIIillIIiIIi < 3 && admitDeferred.test(var15.llIilIIiilIilIIi) ? 1 : 0) << 32 ^ var39) & -1L << 32;
                     var39 ^= (1L ^ var39) & -1L >>> 32;
                     if ((int)(var39 >>> 32) == 0) {
                        var29 ^= (var29 ^ var29 + (long)1) & -1L >>> 32;
                        var12 = var15.llIilIIiilIilIIi;
                        if ((int)(var35 >>> 32) != 0) {
                           var31 += 4294967296L;
                        }
                        continue;
                     }

                     var37 ^= (0L ^ var37) & -1L >>> 32;
                     var35 ^= (0L ^ var35) & -1L << 32;
                  }
               }

               if ((int)var39 == 0 && (int)var37 == 0) {
                  var39 ^= ((long)(var15.IlIIiIIillIIiIIi < 3 && admitDeferred.test(var15.llIilIIiilIilIIi) ? 1 : 0) << 32 ^ var39) & -1L << 32;
               }

               var33 ^= ((long)((int)(var39 >>> 32) != 0 && (int)var37 == 0 ? 1 : 0) ^ var33) & -1L >>> 32;
               var33 ^= ((long)((int)var37 == 0 && (int)var33 == 0 ? 0 : 1) << 32 ^ var33) & -1L << 32;
               if ((int)(var41 >>> 32) != 0) {
                  var15.IIIliIIilIIliIIi = this.llIlIIIIIi;
               }

               if ((int)var35 != 0) {
                  ++var15.liIIiIIiiiIIiIIi;
               }
            }

            if ((int)var31 != 0 || (int)(var33 >>> 32) != 0) {
               if ((int)(var33 >>> 32) != 0) {
                  if ((int)var33 != 0) {
                     ++var15.IlIIiIIillIIiIIi;
                     if ((int)(var37 >>> 32) != 0) {
                        var15.lliilIIiiliilIIi = 0;
                        var15.ilIIiIIiIiIIiIIi = 0;
                        var15.llIliIIiilIliIIi = var15.iIIliIIiIlIliIIi != Long.MIN_VALUE ? new long[]{var15.iIIliIIiIlIliIIi} : new long[0];
                     }
                  } else {
                     ++var15.iiiilIIiIIIIiIIi;
                     var15.IlIIiIIillIIiIIi = 0;
                     var15.lliilIIiiliilIIi = 0;
                     var15.ilIIiIIiIiIIiIIi = 0;
                     var15.llIliIIiilIliIIi = var15.iIIliIIiIlIliIIi != Long.MIN_VALUE ? new long[]{var15.iIIliIIiIlIliIIi} : new long[0];
                  }
               }

               if ((int)(var35 >>> 32) != 0) {
                  this.iIlIlllllill(var15, var15.IilIiIIililIiIIi);
                  if (var15.iilIiIIiIIiIiIIi != Long.MIN_VALUE) {
                     var15.iIIliIIiIlIliIIi = var15.iilIiIIiIIiIiIIi;
                     var15.llIliIIiilIliIIi = new long[]{var15.iilIiIIiIIiIiIIi};
                  }

                  var15.IilIiIIililIiIIi = null;
                  var15.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
               }

               var15.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
               var15.IllilIIilllilIIi.clear();
               var15.lIlilIIiiIlilIIi = null;
               var15.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
               var15.IIiilIIilIiilIIi = forceDeferred;
               var15.IiiilIIiliiilIIi = 0;
               var15.lIIIiIIiiIIIiIIi = 0;
               var15.IIlIiIIilIlIiIIi = 0;
               var15.iIlIiIIiIllIiIIi = 0;
               var15.lllIiIIiillIiIIi = var15.IiIilIIiliIilIIi.size();
               if ((int)(var35 >>> 32) != 0) {
                  IlIlllIlilIl(var15, Long.MIN_VALUE);
               } else if (var22 != Long.MIN_VALUE) {
                  IlIlllIlilIl(var15, var22);
               }

               var15.IllliIIilllliIIi = (int)var33 != 0 ? iliIiIiiIi<invokedynamic>() + var15.IlIIiIIillIIiIIi + iliIiIiiIi<invokedynamic>() + 3 + ((int)(var37 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() : "") + iliIiIiiIi<invokedynamic>() : ((int)(var33 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() + ((int)(var35 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() : iliIiIiiIi<invokedynamic>()) + iliIiIiiIi<invokedynamic>() + var15.iiiilIIiIIIIiIIi + ((int)var35 != 0 ? iliIiIiiIi<invokedynamic>() + var15.liIIiIIiiiIIiIIi + iliIiIiiIi<invokedynamic>() + 2 : (epoch && this.llIlIIIIIi == var15.IIIliIIilIIliIIi ? iliIiIiiIi<invokedynamic>() : "")) + iliIiIiiIi<invokedynamic>() : iliIiIiiIi<invokedynamic>());
               var29 += 4294967296L;
            }
         }
      }

      if ((int)(var29 >>> 32) > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + (int)(var29 >>> 32);
      } else if ((int)var29 > 0) {
         this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(var12) + ((int)var29 > 1 ? iliIiIiiIi<invokedynamic>() + ((int)var29 - 1) + iliIiIiiIi<invokedynamic>() : "") + iliIiIiiIi<invokedynamic>() + ((int)(var31 >>> 32) == (int)var29 ? iliIiIiiIi<invokedynamic>() : ((int)(var31 >>> 32) > 0 ? iliIiIiiIi<invokedynamic>() : iliIiIiiIi<invokedynamic>())) + iliIiIiiIi<invokedynamic>();
      }

      return (int)(var29 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IiIliliIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) >>> 12 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) << 4) + var5) + 31669) - var5))) ^ '豠') << 5 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) >>> 12 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) << 4) + var5) + 31669) - var5))) ^ '豠') >>> 11) << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) >>> 12 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) << 4) + var5) + 31669) - var5))) ^ '豠') << 5 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) >>> 12 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') << 8 | (char)((char)((char)((char)(var4[var5] - '읹') - var5) ^ var5) ^ 'ꞈ') >>> 8))) << 4) + var5) + 31669) - var5))) ^ '豠') >>> 11) >>> 4) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Long IIiilIiiiIii(LongPredicate preferred) {
      iiIlllIIllll var2 = null;

      for(iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil && preferred.test(var4.llIilIIiilIilIIi) && (var2 == null || var4.lIlliIIiiIlliIIi < var2.lIlliIIiiIlliIIi)) {
            var2 = var4;
         }
      }

      return var2 == null ? null : var2.llIilIIiilIilIIi;
   }

   public boolean ilIllIiIll(boolean serviceMissionActive, boolean materialAvailable, boolean completionMissionActive) {
      return this.liIlliiIll(serviceMissionActive, materialAvailable, completionMissionActive, true);
   }

   public int IIlIilIlIi() {
      return this.lIllIIIIIi;
   }

   public lIllIIIiiIllIIIi Iiiiliiiiiii(long root, long epoch) {
      return this.iIIIlIlIIl(root, epoch, (r) -> Long.MIN_VALUE, Long.MIN_VALUE);
   }

   public boolean IlIillIiilIi() {
      for(iiIlllIIllll var2 : this.lliIIIIIIi.values()) {
         if (var2.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil || var2.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.IlIiilliil || var2.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.llIiilliil) {
            return false;
         }
      }

      return true;
   }

   public int iiiIlIIIll(long stampOf, LongUnaryOperator reconsider, LongPredicate epoch) {
      return this.lIIlliIIll(stampOf, -1L, reconsider, epoch, false);
   }

   public String iiiilIIIIi() {
      return String.format(Locale.ROOT, iliIiIiiIi<invokedynamic>(), this.lliIIIIIIi.size(), this.Ilillllill(), this.liilliiill(iiiIlIIiIIIllIIi.iIIiilliil), this.liilliiill(iiiIlIIiIIIllIIi.IlIiilliil), this.liilliiill(iiiIlIIiIIIllIIi.llIiilliil), this.liilliiill(iiiIlIIiIIIllIIi.ilIiilliil), this.iiiIIIIIIi, this.IIIlIIIIIi, this.lIIlIIIIIi, this.liiIIIIIIi, this.iIIlIIIIIi, this.IIllIIIIIi, this.lIllIIIIIi, this.iIllIIIIIi);
   }

   private boolean ilIIiIiIIi() {
      for(Map.Entry var2 : this.lliIIIIIIi.entrySet()) {
         iiiIlIIiIIIllIIi var3 = ((iiIlllIIllll)var2.getValue()).iiIilIIiIIlilIIi;
         if (var3 == iiiIlIIiIIIllIIi.IiIiilliil || var3 == iiiIlIIiIIIllIIi.liIiilliil) {
            this.IiIlliIliiIl((Long)var2.getKey());
            return true;
         }
      }

      for(Map.Entry var6 : this.lliIIIIIIi.entrySet()) {
         if (((iiIlllIIllll)var6.getValue()).IliIlllilIi() && ((iiIlllIIllll)var6.getValue()).IilIiIIililIiIIi == null) {
            this.IiIlliIliiIl((Long)var6.getKey());
            return true;
         }
      }

      for(Map.Entry var7 : this.lliIIIIIIi.entrySet()) {
         if (((iiIlllIIllll)var7.getValue()).IliIlllilIi()) {
            this.IiIlliIliiIl((Long)var7.getKey());
            return true;
         }
      }

      return false;
   }

   public int iIiIlIliIl(long epoch) {
      return this.lliIliliIl(epoch, (r) -> true);
   }

   public int IiIilliIil() {
      return this.IiiIIIIIIi;
   }

   private boolean IIillIiliIil(iiIlllIIllll e) {
      return e.iiiilIIiIIIIiIIi < 2 || this.IlIlIIIIIi - e.IliIiIIilliIiIIi >= 1L << Math.min(e.iiiilIIiIIIIiIIi, 12);
   }

   public IiilliIlliilliIl illIlIilIl(long why, String root) {
      ++this.IiIlIIIIIi;
      iiIlllIIllll var4 = (iiIlllIIllll)this.lliIIIIIIi.get(why);
      if (var4 != null && !var4.IliIlllilIi()) {
         iiiIlIIiIIIllIIi var5 = var4.iiIilIIiIIlilIIi;
         var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
         var4.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
         var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
         ++this.lIIlIIIIIi;
         var4.IliIiIIilliIiIIi = this.IlIlIIIIIi;
         var4.IllliIIilllliIIi = root == null ? "" : root;
         this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(why) + iliIiIiiIi<invokedynamic>() + var4.IllliIIilllliIIi + iliIiIiiIi<invokedynamic>();
         return new IiilliIlliilliIl(var5, var4.iiIilIIiIIlilIIi, (lIllIIIiiIllIIIi)null, var4.IllliIIilllliIIi);
      } else {
         return null;
      }
   }

   public IiilliIlliilliIl llIIlilIIl(long strategy, lIllIIIiiIllIIIi waitOn, lIliiIiliIliiIil root, ilIiIlIlIiIiIlIl r, long dependencyKey) {
      return this.IiIIlliIIl(strategy, waitOn, root, r, dependencyKey, Long.MIN_VALUE);
   }

   private void IilliliilIIi(long otherRoot, long member) {
      iiIlllIIllll var5 = (iiIlllIIllll)this.lliIIIIIIi.get(otherRoot);
      if (var5 != null) {
         var5.IiIilIIiliIilIIi.remove(member);
         var5.IiIliIIiliIliIIi = liiiIIllIl(var5.IiIilIIiliIilIIi);
         if (var5.IiIilIIiliIilIIi.isEmpty()) {
            if (!var5.IliIlllilIi()) {
               ++this.iiiIIIIIIi;
            }

            var5.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IiIiilliil;
            var5.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var5.iiIliIIiIIlliIIi = new int[0];
            var5.IilIiIIililIiIIi = null;
            var5.iilIiIIiIIiIiIIi = Long.MIN_VALUE;
            var5.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iliIiIiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 425305316387317636L ^ Long.rotateLeft(3232118664559117889L, 42) ^ 5983285694337526454L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6329033476041503838L ^ Long.rotateLeft(5805311965493212747L, 11) ^ -8372469135018276274L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1143116921718006491L ^ Long.rotateLeft(-3133110404427825953L, 49) ^ 8843934963543531939L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3984560078454632027L ^ Long.rotateLeft(-139711608039268729L, 43) ^ -876144584951914569L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4272450772514772601L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5116392453994931419L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7882982100481851642L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7852183882232415641L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7990035258334408545L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3368444287007487835L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiIiiiiIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIlilIIli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iIIliIlIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, llIliilIli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIliliIli<invokedynamic>());
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

   public lIllIIIiiIllIIIi IIIIllIIIl(long root, long stampKey, long epoch) {
      return this.iIIIlIlIIl(root, stampKey, (stampKeyx) -> epoch, Long.MIN_VALUE);
   }

   private boolean Illlllllilll(iiIlllIIllll members, Collection<Long> e) {
      for(long var4 : e) {
         Long var6 = (Long)this.ilIlIIIIIi.get(var4);
         if (var6 == null || var6 != members.llIilIIiilIilIIi) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite iIIliIlIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) + var5) + 'ꚢ') + var5) + '赨') ^ var5) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) + var5) + 'ꚢ') + var5) + '赨') ^ var5) ^ var5) >>> 9) - 31512))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIiliIiiiIi(long epoch, Collection<Long> members, long root, String reason) {
      return this.IIlilIliiIli(epoch, members, root, Long.MIN_VALUE, reason);
   }

   private static void IlIlllIlilIl(iiIlllIIllll key, long e) {
      key.lIiIiIIiiIiIiIIi = e;
      key.iliIiIIiIiiIiIIi = -1L;
      key.liiIiIIiiiiIiIIi = Long.MIN_VALUE;
      key.iiIliIIiIIlliIIi = (int[])key.IiIliIIiliIliIIi.clone();
   }

   public boolean IIllllIlll(boolean banLive, boolean materialAvailable, boolean serviceMissionActive, boolean completionMissionActive, boolean planInFlight) {
      long var9 = 607243538082020806L;
      var9 ^= (0L ^ var9) & -1L << 32;

      for(iiIlllIIllll var8 : this.lliIIIIIIi.values()) {
         if (!var8.IliIlllilIi()) {
            var9 ^= (4294967296L ^ var9) & -1L << 32;
            switch (var8.iiIilIIiIIlilIIi.ordinal()) {
               case 0:
                  return false;
               case 1:
                  if (completionMissionActive) {
                     return false;
                  }
                  break;
               case 2:
                  if (banLive) {
                     return false;
                  }
                  break;
               case 3:
                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.lIIiIIIiIl && banLive) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.iIIiIIIiIl && materialAvailable) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.IlIiIIIiIl && !serviceMissionActive) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.llIiIIIiIl && (banLive || materialAvailable)) {
                     return false;
                  }

                  if (var8.illilIIiIililIIi == ilIiIlIlIiIiIlIl.ilIiIIIiIl && planInFlight) {
                     return false;
                  }
            }
         }
      }

      if ((int)(var9 >>> 32) != 0) {
         ++this.iIIlIIIIIi;
      }

      return (boolean)((int)(var9 >>> 32));
   }

   public int illilIilil() {
      return this.lIIlIIIIIi;
   }

   public Long Iiilliiliiil(long member) {
      return (Long)this.ilIlIIIIIi.get(member);
   }

   public String iIiilIliil() {
      return this.iiIlIIIIIi;
   }

   public boolean Iliilliiilii() {
      return this.Iilililiiili() != null;
   }

   public int lllllillll(boolean materialAvailable, boolean serviceMissionActive, boolean completionMissionActive, boolean planInFlight) {
      return this.Iillllilll(materialAvailable, serviceMissionActive, completionMissionActive, planInFlight, false);
   }

   public static String iIlIiIllIi(long packed) {
      return llIiIiililIiIiil.IiIlliIliiIl(packed) + iliIiIiiIi<invokedynamic>() + llIiIiililIiIiil.IIlllIlliIll(packed) + iliIiIiiIi<invokedynamic>() + llIiIiililIiIiil.Illlllllilll(packed);
   }

   private static long[] IIIllIIliIIl(long[] a, long v) {
      long[] var3 = Arrays.copyOf(a, a.length + 1);
      var3[a.length] = v;
      return var3;
   }

   public long IliIlllilIi() {
      return this.IiIlIIIIIi;
   }

   public int iIIilIlIil() {
      long var4 = -1404801913284982193L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         if (var3.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iiIiilliil && (var3.IilIiIIililIiIIi != null || var3.liiIiIIiiiiIiIIi != Long.MIN_VALUE && var3.lIiIiIIiiIiIiIIi != Long.MIN_VALUE && var3.liiIiIIiiiiIiIIi != var3.lIiIiIIiiIiIiIIi)) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   public IiilliIlliilliIl lIlIliIlIl(long dependencyKey) {
      ++this.IiIlIIIIIi;

      for(iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.llIiilliil && var4.lililIIiiililIIi == dependencyKey) {
            iiiIlIIiIIIllIIi var5 = var4.iiIilIIiIIlilIIi;
            if (var4.lIlilIIiiIlilIIi != null) {
               var4.IllilIIilllilIIi.remove(var4.lIlilIIiiIlilIIi);
            }

            var4.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iIIiilliil;
            var4.illilIIiIililIIi = ilIiIlIlIiIiIlIl.IIIiIIIiIl;
            var4.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + dependencyKey + iliIiIiiIi<invokedynamic>();
            this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(var4.llIilIIiilIilIIi) + iliIiIiiIi<invokedynamic>() + var4.lIlilIIiiIlilIIi + iliIiIiiIi<invokedynamic>() + IlIIillIIi(var4);
            return new IiilliIlliilliIl(var5, var4.iiIilIIiIIlilIIi, IlIIillIIi(var4), var4.IllliIIilllliIIi);
         }
      }

      this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + dependencyKey + iliIiIiiIi<invokedynamic>();
      return null;
   }

   // $FF: synthetic method
   private static CallSite liiIiiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) >>> 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) << 15) >>> 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) >>> 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) << 15) << 11) ^ var5) >>> 12 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) >>> 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) << 15) >>> 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) >>> 1 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) << 14 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) >>> 2 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) << 12 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) >>> 14 | (char)((char)(-((char)(~((char)(var4[var5] ^ '舘'))))) >>> 9 | (char)(-((char)(~((char)(var4[var5] ^ '舘'))))) << 7) << 2) >>> 4) << 14) - var5) >>> 2))))) - var5) << 15) << 11) ^ var5) << 4))) - 15663))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iiiilliiil() {
      ++this.IiIlIIIIIi;
      this.lliIIIIIIi.clear();
      this.ilIlIIIIIi.clear();
      this.iliIIIIIIi = 0L;
      this.IlIlIIIIIi = 0L;
      this.llIlIIIIIi = 0L;
      this.IiiIIIIIIi = this.liiIIIIIIi = this.iiiIIIIIIi = this.IIIlIIIIIi = this.lIIlIIIIIi = this.iIIlIIIIIi = this.IIllIIIIIi = this.lIllIIIIIi = this.iIllIIIIIi = 0;
      this.iiIlIIIIIi = "";
   }

   private boolean Iilllilliill(iiIlllIIllll e, Collection<Long> members) {
      return members.size() == e.IiIilIIiliIilIIi.size() && !this.Illlllllilll(e, members);
   }

   // $FF: synthetic method
   private static CallSite llIliilIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) << 11 | (char)((char)((char)(~var4[var5]) ^ var5) - var5) >>> 5) - var5) + '騫') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) << 11 | (char)((char)((char)(~var4[var5]) ^ var5) - var5) >>> 5) - var5) + '騫') - var5) << 5))) + 14877))))))) ^ var5) + 21597) - 18674))) << 10 | (char)(~((char)((char)((char)((char)(~((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) << 11 | (char)((char)((char)(~var4[var5]) ^ var5) - var5) >>> 5) - var5) + '騫') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) << 11 | (char)((char)((char)(~var4[var5]) ^ var5) - var5) >>> 5) - var5) + '騫') - var5) << 5))) + 14877))))))) ^ var5) + 21597) - 18674))) >>> 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Ilillllill() {
      long var4 = -6228455942784671131L;
      var4 ^= (0L ^ var4) & -1L << 32;

      for(iiIlllIIllll var3 : this.lliIIIIIIi.values()) {
         if (!var3.IliIlllilIi()) {
            var4 += 4294967296L;
         }
      }

      return (int)(var4 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IIIlilIIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2856) ^ 4167) ^ var5) ^ var5) - var5))))) >>> 13 | (char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2856) ^ 4167) ^ var5) ^ var5) - var5))))) << 3) << 5 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2856) ^ 4167) ^ var5) ^ var5) - var5))))) >>> 13 | (char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] + 2856) ^ 4167) ^ var5) ^ var5) - var5))))) << 3) >>> 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IiiIlliiIl(long reconsider, long stampKey, LongPredicate epoch) {
      return this.iiiIlIIIll(reconsider, (r) -> stampKey, epoch);
   }

   public int IIiillIiil() {
      return this.iIllIIIIIi;
   }

   public int iIlllIllll(boolean serviceMissionActive, boolean completionMissionActive, boolean materialAvailable) {
      return this.lllllillll(serviceMissionActive, completionMissionActive, materialAvailable, true);
   }

   public int Illillllil() {
      return this.IIIlIIIIIi;
   }

   public int liilliiill(iiiIlIIiIIIllIIi s) {
      long var5 = -760980445290189704L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(iiIlllIIllll var4 : this.lliIIIIIIi.values()) {
         if (var4.iiIilIIiIIlilIIi == s) {
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   public int lIIlliIIll(long topologyRev, long stampOf, LongUnaryOperator reconsider, LongPredicate epoch, boolean admitDeferred) {
      return this.IlIllllIll(topologyRev, stampOf, reconsider, epoch, admitDeferred, false);
   }

   public lIllIIIiiIllIIIi iIIIlIlIIl(long root, long stampOf, LongUnaryOperator originKey, long epoch) {
      long var17 = 7341151347105642119L;
      long var19 = 4445178491265058276L;
      ++this.IiIlIIIIIi;
      iiIlllIIllll var8 = (iiIlllIIllll)this.lliIIIIIIi.get(root);
      if (var8 != null && var8.iiIilIIiIIlilIIi == iiiIlIIiIIIllIIi.iIIiilliil) {
         var17 ^= ((long)(epoch != Long.MIN_VALUE && var8.iIIliIIiIlIliIIi != Long.MIN_VALUE && epoch != var8.iIIliIIiIlIliIIi && !var8.IllilIIilllilIIi.isEmpty() ? 1 : 0) << 32 ^ var17) & -1L << 32;
         if (epoch != Long.MIN_VALUE && (var8.IllilIIilllilIIi.isEmpty() || (int)(var17 >>> 32) != 0 && var8.lIIIiIIiiIIIiIIi < 2)) {
            var8.iIIliIIiIlIliIIi = epoch;
            if (!iliIiiliiiii(var8.llIliIIiilIliIIi, epoch) && var8.llIliIIiilIliIIi.length < 4) {
               var8.llIliIIiilIliIIi = IIIllIIliIIl(var8.llIliIIiilIliIIi, epoch);
            }
         }

         if (var8.IllilIIilllilIIi.isEmpty()) {
            var8.iiIliIIiIIlliIIi = (int[])var8.IiIliIIiliIliIIi.clone();
         }

         long var10 = originKey.applyAsLong(root);
         String var12 = "";
         if (var10 != Long.MIN_VALUE) {
            if (!var8.IllilIIilllilIIi.isEmpty() && var8.lIiIiIIiiIiIiIIi != Long.MIN_VALUE) {
               if ((var10 != var8.lIiIiIIiiIiIiIIi || (int)(var17 >>> 32) != 0) && var8.lIIIiIIiiIIIiIIi < 2) {
                  ++var8.lIIIiIIiiIIIiIIi;
                  var8.IllilIIilllilIIi.clear();
                  var8.iiIliIIiIIlliIIi = (int[])var8.IiIliIIiliIliIIi.clone();
                  IlIlllIlilIl(var8, originKey.applyAsLong(root));
                  var12 = iliIiIiiIi<invokedynamic>() + ((int)(var17 >>> 32) != 0 ? iliIiIiiIi<invokedynamic>() : iliIiIiiIi<invokedynamic>()) + iliIiIiiIi<invokedynamic>() + var8.lIIIiIIiiIIIiIIi + iliIiIiiIi<invokedynamic>() + 2 + iliIiIiiIi<invokedynamic>();
               }
            } else {
               IlIlllIlilIl(var8, var10);
            }
         }

         var8.lIlliIIiiIlliIIi = ++this.iliIIIIIIi;
         ++this.IlIlIIIIIi;
         ++var8.iIiilIIiIliilIIi;
         ++this.liiIIIIIIi;
         lIllIIIiiIllIIIi[] var13 = IllIililllIili.liiiIIllIl();
         var17 ^= ((long)var13.length ^ var17) & -1L >>> 32;

         for(long var23 = var19 ^ (0L ^ var19) & -1L << 32; (int)(var23 >>> 32) < (int)var17; var23 += 4294967296L) {
            lIllIIIiiIllIIIi var16 = var13[(int)(var23 >>> 32)];
            if (var16 == lIllIIIiiIllIIIi.iilIlIliil) {
               break;
            }

            if (!var8.IllilIIilllilIIi.contains(var16)) {
               var8.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.IlIiilliil;
               var8.lIlilIIiiIlilIIi = var16;
               var8.IIiilIIilIiilIIi = stampOf;
               this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(root) + iliIiIiiIi<invokedynamic>() + var16 + iliIiIiiIi<invokedynamic>() + var8.iIiilIIiIliilIIi + var12;
               return var16;
            }
         }

         var8.iiIilIIiIIlilIIi = iiiIlIIiIIIllIIi.iiIiilliil;
         var8.lIlilIIiiIlilIIi = lIllIIIiiIllIIIi.iilIlIliil;
         var8.IIiilIIilIiilIIi = stampOf;
         var8.IliIiIIilliIiIIi = this.IlIlIIIIIi;
         var8.IllliIIilllliIIi = iliIiIiiIi<invokedynamic>() + stampOf;
         ++this.lIIlIIIIIi;
         this.iiIlIIIIIi = iliIiIiiIi<invokedynamic>() + iIlIiIllIi(root) + iliIiIiiIi<invokedynamic>() + var8.IllliIIilllliIIi + iliIiIiiIi<invokedynamic>();
         return null;
      } else {
         return null;
      }
   }

   public boolean liIlliiIll(boolean materialAvailable, boolean serviceMissionActive, boolean planInFlight, boolean completionMissionActive) {
      return this.IIllllIlll(materialAvailable, serviceMissionActive, planInFlight, completionMissionActive, false);
   }
}
