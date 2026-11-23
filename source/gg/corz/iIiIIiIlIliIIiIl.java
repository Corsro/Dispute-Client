package gg.corz;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1297;
import net.minecraft.class_1311;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2535;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2680;
import net.minecraft.class_304;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_418;
import net.minecraft.class_5894;
import net.minecraft.class_5903;
import net.minecraft.class_5904;
import net.minecraft.class_634;
import net.minecraft.class_638;
import net.minecraft.class_640;
import net.minecraft.class_742;
import net.minecraft.class_7439;
import net.minecraft.class_746;
import net.minecraft.class_8038;
import net.minecraft.class_8143;
import net.minecraft.class_9334;
import net.minecraft.class_1269.class_9861;

public class iIiIIiIlIliIIiIl extends ilIllIiIll implements IIiIliilIiIlii {
   private boolean iiiliIiIll;
   private long illliIiIll;
   private final ConcurrentLinkedQueue<int[]> iIiilIiIll;
   public static final int liillIiIll = 6;
   public static final double ilillIiIll = (double)8.0F;
   private List<class_2338> iIlIiIiIll;
   private String IIliiIiIll;
   private long llIliIiIll;
   private long lIIliIiIll;
   private final iiIiiilIIliiil IiIilIiIll;
   private final iiIiiilIIliiil iIIilIiIll;
   private class_2535 iIiIiIiIll;
   private final lliliIIiililiIIi iiIilIiIll;
   private final iiIiiilIIliiil llIilIiIll;
   private boolean IiIliIiIll;
   private final iiIiiilIIliiil IIlilIiIll;
   private final IIIIIIillIIIIIil iIlilIiIll;
   private boolean iIIiiIiIll;
   private int IilliIiIll;
   private boolean iiIIiIiIll;
   private boolean IlIliIiIll;
   public static final int iilllIiIll = 900;
   private class_2338 IIlliIiIll;
   public static final int iiillIiIll = 64;
   private long IlIiiIiIll;
   private String ililiIiIll;
   private final iilliIlIIiliIl lIIilIiIll;
   private String IIiIiIiIll;
   private class_1937 iiiIiIiIll;
   public static final List<Class<? extends ilIllIiIll>> iIliiIiIll = List.of(iIiIliiIliIlii.class, iIlIilIlIllIilIl.class, iiliililIIiiilil.class, iIIiIlIlIiIl.class, lIIIlIIliIIIlIIl.class, lliliiiililiii.class, llIiIlilIiIl.class, IlllilIlllllilIl.class, Ilillllllillll.class);
   public static final long IlIllIiIll = 30000L;
   private llIilllilIilll llIIiIiIll;
   public static final List<Class<? extends ilIllIiIll>> IlliiIiIll = List.of(iIIliIiIlIliIi.class, IIiiIillIiiIil.class, iiIIiiIlIIlIiiIl.class, IIlliIllIlliIl.class, lilIliIiiilIliIi.class);
   private final lliliIIiililiIIi IIIilIiIll;
   private final AtomicInteger IliilIiIll;
   public static final int lIillIiIll = 40;
   private IIiIIlilIiIIli IIIIiIiIll;
   private final Set<Long> liiilIiIll;
   private illiIiilIiliIiil IliIiIiIll;
   public static final double IilllIiIll = 0.6;
   private long lilIiIiIll;
   private long lIIiiIiIll;
   public static final long IIillIiIll = 3000L;
   private long lIliiIiIll;
   public static final double lilllIiIll = 2.1;
   private Iliilllllliillll IlIIiIiIll;
   private long IIIliIiIll;
   private IIiIiIillIiIiIil lIIIiIiIll;
   private long iIIliIiIll;
   private lIiIiiIiiIiIiiIi ilIIiIiIll;
   private final iiIiiilIIliiil lIlilIiIll;
   private boolean liIliIiIll;
   private int lllliIiIll;
   private boolean IllliIiIll;
   private final LongOpenHashSet lliilIiIll;
   private long IilIiIiIll;
   public static final long iIIllIiIll = 6000L;
   public static final float llillIiIll = 3.0F;
   public static final long iiiIlIiIll = 1000L;
   private int llIiiIiIll;
   public static final double illllIiIll = 1.1;
   public static final double lllllIiIll = (double)6.0F;
   private iiliIiIIiiIi IiiliIiIll;
   public static final long IIIllIiIll = 8000L;
   private String lIiIiIiIll;
   private long iilIiIiIll;
   private volatile IlillIIillillIIi iiIiiIiIll;
   private class_243 liiIiIiIll;
   private final List<iIiIIIlIliIIIl> iliilIiIll;
   public static final double lIIllIiIll = 0.95;
   private iillIIilIIilIIil illIiIiIll;
   private final ilIiilIlIiIiilIl lililIiIll;
   private final iIliiIIiIlliiIIi IIiilIiIll;
   private final List<ilIllIiIll> iiiilIiIll;
   private double iIiliIiIll;
   private final iIIilIlIil illilIiIll;
   private long lIlliIiIll;
   private final List<Iiiiiilliiiiil> IIIiiIiIll;
   public static final int IiillIiIll = 14;
   private class_243 IiiIiIiIll;
   private long lilliIiIll;
   public static final double llIllIiIll = (double)64.0F;
   public static final int lIlllIiIll = 20;
   private boolean iilliIiIll;
   private boolean lliIiIiIll;
   private long liiliIiIll;
   private final ConcurrentLinkedQueue<String> lIiilIiIll;
   private final iliIIlilIiiIIlil IllilIiIll;
   private boolean lIlIiIiIll;
   private llIlIiilIlIi iIIIiIiIll;
   private final Illliilllllliill IililIiIll;
   private ilIlllIlIiIlllIl IiIIiIiIll;
   private String iliIiIiIll;
   private final iilliIlIIiliIl liIilIiIll;
   private int iIlliIiIll;
   public static final double iIillIiIll = (double)4.0F;
   private final IiIIiIIlliIIiIIl iililIiIll;
   private final iiIiiilIIliiil IlIilIiIll;
   private int liIiiIiIll;
   private boolean lliliIiIll;
   public static final long IiIllIiIll = 10000L;
   private long lIiliIiIll;
   public static final float IlillIiIll = 6.0F;
   private iilillllIIiillll liIIiIiIll;
   private final iiIiiilIIliiil ilIilIiIll;
   private long IiIiiIiIll;
   private final iiiIIIIlIIIlIIIl lllilIiIll;
   private boolean IIlIiIiIll;
   private iIiIIIlIliIIIl iiIliIiIll;
   private final LongOpenHashSet ilIiiIiIll;
   private iillIIilIIilIIil lllIiIiIll;
   private long IIiliIiIll;
   public static final long iiIllIiIll = 2000000L;
   private boolean IliliIiIll;
   private final List<class_2338> IiiilIiIll;
   public static final int IllllIiIll = 60;
   public static final int iIlllIiIll = 10;
   private long ilIliIiIll;
   private long IllIiIiIll;
   public static final int IIlllIiIll = 2;
   public static final int liIllIiIll = 48;

   private String iIlllIllll() {
      long var4 = 7834708048988495386L;
      double var1 = Math.sqrt(Iiiilllliiilll.field_1724.method_5707(class_243.method_24953(this.IIlliIiIll)));
      var4 ^= ((long)(this.iiIliIiIll == null ? 0 : this.iiIliIiIll.IIlllIlliIll()) << 32 ^ var4) & -1L << 32;
      return Math.round(var1) + IliIlllilIi<invokedynamic>() + ((int)(var4 >>> 32) > 0 ? IliIlllilIi<invokedynamic>() + (int)(var4 >>> 32) + ((int)(var4 >>> 32) == (~(-2063887713 + -119 + -113) ^ 2063887945) ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) : "");
   }

   private void lIiIiiIiIi() {
      this.IiiIiIiIll = null;
      this.iiiIiIiIll = null;
      this.lIIliIiIll = -5781671604735238178L ^ 5747543441333231582L;
   }

   private void illilIilil(long reason, String now) {
      if (this.IIlliIiIll != null) {
         this.lliilIiIll.add(this.IIlliIiIll.method_10063());
      }

      this.iIlilIiIll.liiiIIllIl(now);
      this.lIIIiIiIll.IilliliilIIi();
      this.lililiilil();
      this.iliilIiIll.removeIf((e) -> this.lliilIiIll.contains(class_2338.method_10064(e.IIIllIIliIIl(), e.IlIlllIlilIl(), e.IiIlliIliiIl())));
      this.liIliIiIll = false;
      this.iiliiIIiii(iillIIilIIilIIil.iIlIllIIil, now);
   }

   private void IIllllIlll(String s) {
      if (s != null && !s.isBlank()) {
         if (this.IliilIiIll.get() < ((-1377817087 << 29 | -1377817087 >>> 3) ^ 901514624)) {
            this.lIiilIiIll.offer(s);
            this.IliilIiIll.incrementAndGet();
         }
      }
   }

   protected void IiIIlliIIl(IliIliIllliIliIl e) {
      if (e != null && e.iilIIiiIll != null) {
         class_2596 var3 = e.iilIIiiIll;
         if (!(var3 instanceof class_8038)) {
            this.ilIllIiIll(e.iilIIiiIll);
         } else {
            class_8038 var2 = (class_8038)var3;

            for(class_2596 var4 : var2.method_48324()) {
               this.ilIllIiIll(var4);
            }

         }
      }
   }

   private void IIIillIIil(long now, boolean act) {
      if (this.IllilIiIll.iIlIlllllill(now)) {
         this.iiliiIIiii(iillIIilIIilIIil.ilIIllIIil, IliIlllilIi<invokedynamic>());
         this.Ilillllill(now, act);
      } else {
         if (this.IilIiIiIll % (-4204194166560012987L ^ -4204194166560012935L) == (-32021036912381553L ^ -32021036912381553L)) {
            class_746 var4 = Iiiilllliiilll.field_1724;
            this.IIIIiIiIll.IiIlliIliiIl(var4.method_36454() + (float)(Math.sin((double)this.IilIiIiIll * Double.longBitsToDouble(5220685309522329535L ^ 8644947688198310790L)) * Double.longBitsToDouble(-6099764538072180597L ^ -1494833919085848437L)), Math.max(-10.0F, Math.min(20.0F, var4.method_36455())), 0);
         }

      }
   }

   private boolean lIlliiIlli(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      float var4 = var3.method_6032();
      if (var4 > 6.0F) {
         return false;
      } else {
         ArrayList var5 = new ArrayList();
         class_238 var6 = var3.method_5829().method_1014((double)8.0F);

         for(class_1297 var8 : Iiiilllliiilll.field_1687.method_8333(var3, var6, (en) -> en.method_5805() && en.method_5864().method_5891() == class_1311.field_6302)) {
            if (var8.method_5858(var3) <= (double)64.0F) {
               var5.add(new Iiiiiilliiiiil(var8.method_23317(), var8.method_23321()));
            }
         }

         if (var5.isEmpty()) {
            return false;
         } else if (var4 <= 3.0F && !IilIIlIllilIIlIl.liiiIIllIl(this.lIIiiIiIll < 0L ? -1L : now - this.lIIiiIiIll)) {
            ++this.iIlilIiIll.IllilIIIil;
            this.Iiliililii(IliIlllilIi<invokedynamic>());
            return true;
         } else if (this.IliliIiIll) {
            return false;
         } else {
            this.lIIIiIiIll.IilliliilIIi();
            if (this.IllilIiIll.IIlllIlliIll(now)) {
               this.lllilIiIll.lIiiIiIlilli(this.iliIiIiIll);
               if (this.IllilIiIll.IIIilIIiiIIi(now)) {
                  this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
                  return true;
               }

               if (this.lllIiIiIll == iillIIilIIilIIil.IiIIllIIil || this.lllIiIiIll == iillIIilIIilIIil.liIIllIIil) {
                  this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
               }
            }

            if (this.IllilIiIll.iIlIlllllill(now)) {
               this.ilillIiill(now);
               return true;
            } else {
               if (this.IliIiIiIll.lIiiIiIlilli()) {
                  this.illliIilli(var5);
               }

               if (this.IiiliIiIll == null || !this.IliIiIiIll.lIiiIiIlilli()) {
                  this.IIililIili(this.IliIiIiIll.IliIlllilIi() == IiIIilllliIIilll.iilIIIlill);
               }

               return true;
            }
         }
      }
   }

   protected void Iilililiiili() {
      this.iiIiiIiIll = IlillIIillillIIi.lIiIIIiiil;
      this.llliiillii();
      if (Iiiilllliiilll != null && this.IIIIiIiIll != null) {
         try {
            this.lIIIiIiIll.IilliliilIIi();
            this.llIIiIiIll.iliIiiliiiii();
            this.IIIIiIiIll.iIlIlllllill();
         } finally {
            lIlillliIlilll.liiiIIllIl(this);
         }

      }
   }

   private void iiIliIIlli(List<IiiIlillliiIlill> threats) {
      this.IIIiiIiIll.clear();

      for(IiiIlillliiIlill var3 : threats) {
         this.IIIiiIiIll.add(new Iiiiiilliiiiil(var3.liiiIIllIl(), var3.IilliliilIIi()));
      }

   }

   private void iIIilIlIil(long now) {
      long var8 = -1127272638106822145L;
      class_746 var3 = Iiiilllliiilll.field_1724;
      var8 ^= ((long)(Iiiilllliiilll.field_1687.method_27983() == class_1937.field_25179 ? 1 : 0) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) == 0) {
         if (this.llIliIiIll < (-6914506600244511200L ^ -6914506600244511200L)) {
            this.llIliIiIll = now;
         }

         if (now - this.llIliIiIll > (5594925247687527732L ^ 5594925247687535140L)) {
            this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
         }

      } else {
         this.llIliIiIll = -1L;
         var8 ^= ((long)(!var3.method_24828() && !var3.method_5799() ? 0 : 1) ^ var8) & -1L >>> 32;
         double var6 = this.IiIilliIil();
         if (IIIilIlllIIilIll.IliIlllilIi((boolean)((int)var8), now, this.IIiilIiIll.liiiIIllIl(), this.iIIliIiIll, var6, now - this.iilIiIiIll)) {
            this.iiliiIIiii(iillIIilIIilIIil.lIlIllIIil, IliIlllilIi<invokedynamic>() + Math.round(var6 * Double.longBitsToDouble(9214700833696503214L ^ 4591474341223978414L)));
         }

      }
   }

   private void lliliilili() {
      if (!lIlIiIliIlIiIl.Illlllllilll()) {
         class_746 var1 = Iiiilllliiilll.field_1724;
         if (var1.field_7512 == var1.field_7498) {
            class_1661 var2 = var1.method_31548();

            for(int var3 = 9; var3 <= 35; ++var3) {
               if (Iiililiili(var2.method_5438(var3))) {
                  if (!lIlillliIlilll.IliIlllilIi(this)) {
                     return;
                  }

                  int var5 = -1;

                  for(int var6 = 0; var6 <= 8; ++var6) {
                     if (var2.method_5438(var6).method_7960()) {
                        var5 = var6;
                        break;
                     }
                  }

                  if (var5 < 0) {
                     var5 = var2.method_67532() == 8 ? 7 : 8;
                  }

                  lIlIiIliIlIiIl.iIlIlllllill(() -> {
                     class_746 var2 = Iiiilllliiilll.field_1724;
                     if (var2 != null && Iiiilllliiilll.field_1761 != null && var2.field_7512 == var2.field_7498) {
                        if (Iiililiili(var2.method_31548().method_5438(var3))) {
                           if (!IIiIiIillIiIiIil.IIlllIlliIll(var2.method_31548().method_5438(var5))) {
                              Iiiilllliiilll.field_1761.method_2906(var2.field_7498.field_7763, iiilIiIiIIIiIiIi.IliIlllilIi(var3), iiilIiIiIIIiIiIi.iIlIlllllill(var5), class_1713.field_7791, var2);
                           }
                        }
                     }
                  }, true);
                  return;
               }
            }

         }
      }
   }

   private boolean iiiilIIIIi() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1761 != null && var1.method_6047().method_31574(class_1802.field_8634)) {
         class_1269 var2 = Iiiilllliiilll.field_1761.method_2919(var1, class_1268.field_5808);
         if (var2 instanceof class_1269.class_9860) {
            class_1269.class_9860 var3 = (class_1269.class_9860)var2;
            if (var3.comp_2909() == class_9861.field_52427) {
               var1.method_6104(class_1268.field_5808);
            }
         }

         return var2.method_23665();
      } else {
         return false;
      }
   }

   private void liilliiill(long now) {
      if (this.IllilIiIll.IIlllIlliIll(now)) {
         this.lllilIiIll.lIiiIiIlilli(this.iliIiIiIll);
         if (this.IllilIiIll.IIIilIIiiIIi(now)) {
            this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
         } else {
            this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
         }
      } else {
         if (!this.IllilIiIll.liiiIIllIl()) {
            this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
         }

      }
   }

   private void IlIIillIIi(class_746 p) {
      class_2338 var2 = this.iIIIiIiIll.IIIilIIiiIIi(p);
      int var3 = this.iIlIiIiIll == null ? -1 : this.iIlIiIiIll.indexOf(var2);
      if (this.IilIiIiIll - this.IllIiIiIll >= 4L || this.iIlIiIiIll != null && var3 < 0) {
         this.IllIiIiIll = this.IilIiIiIll;
         this.iIlIiIiIll = IiIiIlliIiIl.IIIllIIliIIl(this.iililIiIll, var2.method_10263(), var2.method_10264(), var2.method_10260(), 8000);
         var3 = this.iIlIiIiIll == null ? -1 : this.iIlIiIiIll.indexOf(var2);
      }

      if (this.iIlIiIiIll != null && var3 >= 0) {
         class_2338 var4 = (class_2338)this.iIlIiIiIll.get(Math.min(var3 + 1, this.iIlIiIiIll.size() - 1));
         if (var4.method_10263() == var2.method_10263() && var4.method_10260() == var2.method_10260()) {
            this.IIIIiIiIll.IiIlliIliiIl(p.method_36454(), var4.method_10264() < var2.method_10264() ? 20.0F : -30.0F, 2);
         } else {
            float var5 = this.IIIIiIiIll.IlIillIiilIi(class_243.method_24955(var4));
            this.IIIIiIiIll.IiIlliIliiIl(var5, var4.method_10264() >= var2.method_10264() ? -15.0F : 20.0F, 2);
            if (Math.abs(class_3532.method_15393(var5 - p.method_36454())) < 50.0F) {
               this.IIIIiIiIll.IilliliilIIi(1);
            }
         }

         if (var4.method_10264() < var2.method_10264()) {
            this.IIIIiIiIll.IilliliilIIi(32);
         } else {
            this.IIIIiIiIll.IilliliilIIi(16);
         }

      } else {
         this.IIIIiIiIll.IilliliilIIi(16);
         this.IIIIiIiIll.IiIlliIliiIl(p.method_36454(), -30.0F, 2);
      }
   }

   public boolean lIIlliIIll() {
      return this.IliIlllilIi() && this.lliIiIiIll && this.lIIIiIiIll != null && this.lIIIiIiIll.iliIiiliiiii();
   }

   private void iiiIlIIIll() {
      if (this.IIIIiIiIll == null) {
         this.IIIIiIiIll = new IIiIIlilIiIIli();
         this.lIIIiIiIll = new IIiIiIillIiIiIil(this.IIIIiIiIll, this);
         this.iIIIiIiIll = new llIlIiilIlIi(this.IIIIiIiIll, this.lIIIiIiIll, this.iililIiIll);
         this.IlIIiIiIll = new Iliilllllliillll(this.IIIIiIiIll);
         this.llIIiIiIll = new llIilllilIilll(this.IIIIiIiIll, this.lIIIiIiIll, this.iIIIiIiIll, this);
         this.ilIIiIiIll = new lIiIiiIiiIiIiiIi();
         this.IiIIiIiIll = new ilIlllIlIiIlllIl(this.IIIIiIiIll, this.iililIiIll, this);
         this.liIIiIiIll = new iilillllIIiillll();
      }
   }

   public IlillIIillillIIi liIlliiIll() {
      return this.IliIlllilIi() ? this.iiIiiIiIll : IlillIIillillIIi.lIiIIIiiil;
   }

   private void Iillllilll(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      class_638 var4 = Iiiilllliiilll.field_1687;
      ++this.IilIiIiIll;
      class_2535 var5 = Iiiilllliiilll.method_1562().method_48296();
      if (this.iIiIiIiIll == null) {
         this.iIiIiIiIll = var5;
         this.IililIiIll.IliIlllilIi(var5, now);
      } else if (var5 != this.iIiIiIiIll) {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
         return;
      }

      if (this.lIiIiIiIll != null) {
         String var12 = this.lIiIiIiIll;
         this.lIiIiIiIll = null;
         this.lIiiiiIiii(var12);
      } else {
         this.IIIIiIiIll.IliIlllilIi(this.IilIiIiIll);
         this.lIIIiIiIll.IliIlllilIi();
         this.iililIiIll.IlIlllIlilIl(var4, this.IilIiIiIll);
         this.lliIiIiIll = false;

         try {
            if (var3.method_5805() && !var3.method_29504() && !(Iiiilllliiilll.field_1755 instanceof class_418)) {
               String var6 = this.liIiiiiIii();
               if (var6 != null) {
                  this.lIiiiiIiii(this.lllIiIiIll == iillIIilIIilIIil.llIIllIIil ? IliIlllilIi<invokedynamic>() + var6 + IliIlllilIi<invokedynamic>() : var6 + IliIlllilIi<invokedynamic>());
                  return;
               }

               this.iIIliIlIli(now);
               this.IIiilIiIll.IlIlllIlilIl(var4);
               this.IliIilliIi(now);
               this.liiIiiiiIi(now);
               if (!this.IliIlllilIi()) {
                  return;
               }

               this.lililIiIll.lIiiIiIlilli(now, this.ilIiiIiIii());
               if (this.IiIIiIiIll.liiiIIllIl() == iiiiilllIIIIIill.lilllllill) {
                  this.IililIiIll.IilliliilIIi(now);
                  this.IiIIiIiIll.IIlllIlliIll(this.IilIiIiIll, this.IIlliIiIll, List::of);
               }

               this.IliIiIiIll = this.IililIiIll.iIlIlllllill(this.IlIiillIii(now));
               if (this.IliIiIiIll.IliIlllilIi() == IiIIilllliIIilll.iIiIIIlill) {
                  this.lIiiiiIiii(this.IliIiIiIll.liiiIIllIl().iliIliIlll);
                  return;
               }

               this.iiiliIIIii(now);
               if (this.lllIiIiIll == iillIIilIIilIIil.llIIllIIil) {
                  this.lIilliIill(now);
                  return;
               }

               List var7 = this.illilIiIll.iIlIlllllill(this.IilIiIiIll, var3.method_23317(), var3.method_23318(), var3.method_23321(), this.IiIliliIli(var3), (double)this.lIIilIiIll.Iilllilliill(), this.iIIilIiIll.Iilllilliill());
               this.iIlilIiIll.lIlilIIIil = this.illilIiIll.IlIlllIlilIl();
               this.lliliIiIll = !var7.isEmpty();
               if (this.lliliIiIll) {
                  IiiIlillliiIlill var8 = (IiiIlillliiIlill)var7.get(0);
                  this.ililiIiIll = var8.IliIlllilIi() + IliIlllilIi<invokedynamic>() + (int)Math.round(var8.lIiiIiIlilli());
                  this.iiIliIIlli(var7);
                  if (!this.IliliIiIll) {
                     this.IliliIiIll = true;
                     this.Iliiilliii(iiiliiIIIiii.illIIIiIlIilIIIiIl, IliIlllilIi<invokedynamic>() + var8.IliIlllilIi() + IliIlllilIi<invokedynamic>() + (int)Math.round(var8.lIiiIiIlilli()) + IliIlllilIi<invokedynamic>());
                  }
               } else if (!this.IliliIiIll) {
                  this.ililiIiIll = "";
               }

               if (this.IliIiIiIll.lIiiIiIlilli() && this.lIIIiiIIIi(now)) {
                  return;
               }

               if (this.lIlliiIlli(now)) {
                  return;
               }

               if (this.IliliIiIll) {
                  this.Illlilllli(now);
                  return;
               }

               if (this.IliIiIiIll.IliIlllilIi() == IiIIilllliIIilll.lIiIIIlill) {
                  this.lilliiilli();
                  return;
               }

               if (this.lllIiIiIll == iillIIilIIilIIil.IIiIllIIil) {
                  this.iiliiIIiii(this.illIiIiIll == iillIIilIIilIIil.lllIllIIil ? iillIIilIIilIIil.IllIllIIil : this.illIiIiIll, IliIlllilIi<invokedynamic>());
               }

               boolean var13 = this.IliIiIiIll.IliIlllilIi() == IiIIilllliIIilll.iilIIIlill;
               this.IIiilIiIll.IIlllIlliIll(var4, var3.method_31477() >> 4, var3.method_31479() >> 4);
               if (this.iilIiIIiIi() && IIIilIlllIIilIll.lIiiIiIlilli(now - this.ilIliIiIll)) {
                  this.IilIililIi(now, IliIlllilIi<invokedynamic>());
                  return;
               }

               if (this.IIililIili(var13)) {
                  return;
               }

               this.iilllIIill(now, var13);
               return;
            }

            this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
         } finally {
            if (this.IliIlllilIi()) {
               this.lIIiiiIIii();
               if (this.lllIiIiIll != iillIIilIIilIIil.IilIllIIil && !lIlIiIliIlIiIl.Illlllllilll()) {
                  lIlillliIlilll.liiiIIllIl(this);
               }

               this.IIIIiIiIll.Illlllllilll();
               this.IIIIiIiIll.liiiIIllIl();
               this.lIIIiIiIll.liiiIIllIl();
               this.iliiiIiiii(now);
            }

         }

      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ var5) ^ var5) - 'ꀵ') - var5) ^ var5))) ^ '袡') + '퇒') - var5) << 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ var5) ^ var5) - 'ꀵ') - var5) ^ var5))) ^ '袡') + '퇒') - var5) >>> 8) + 17887) - '\uf251'))) + '菭'))) + '赇'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilillIiill(long now) {
      class_634 var3 = Iiiilllliiilll.method_1562();
      if (var3 != null && Iiiilllliiilll.field_1724 != null) {
         this.lIIIiIiIll.IilliliilIIi();
         String var4 = this.lllilIiIll.IilliliilIIi(this.IIIilIiIll.Iilllilliill());
         if (!iiiIIIIlIIIlIIIl.liiiIIllIl(var4)) {
            var4 = IliIlllilIi<invokedynamic>();
         }

         this.iliIiIiIll = var4;
         var3.method_45730(IliIlllilIi<invokedynamic>() + var4);
         this.IllilIiIll.IlIlllIlilIl(now);
         this.IililIiIll.IilliliilIIi(now);
         this.IiiIiIiIll = Iiiilllliiilll.field_1724.method_73189();
         this.iiiIiIiIll = Iiiilllliiilll.field_1687;
         this.IIIliIiIll = now;
         this.lIIliIiIll = now + (1706650317389772763L ^ 1706650317389775595L);
         this.IlIliIiIll = false;
         ++this.iIlilIiIll.liIilIIIil;
         if (!this.IliliIiIll) {
            this.iiliiIIiii(iillIIilIIilIIil.IiIIllIIil, IliIlllilIi<invokedynamic>() + var4);
         }

      }
   }

   private void iiiliIIIii(long now) {
      long var6 = -5525972618392382382L;
      var6 ^= ((long)(this.lllIiIiIll != iillIIilIIilIIil.IIiIllIIil && this.lllIiIiIll != iillIIilIIilIIil.llIIllIIil ? 1 : 0) << 32 ^ var6) & -1L << 32;
      if (this.IiIiiIiIll >= (-5479020629847053832L ^ -5479020629847053832L)) {
         long var4 = Math.max(0L, Math.min(-2454623568931854561L ^ -2454623568931855113L, now - this.IiIiiIiIll));
         if ((int)(var6 >>> 32) != 0) {
            IIIIIIillIIIIIil var10000 = this.iIlilIiIll;
            var10000.IIiilIIIil += var4;
            if (this.lllIiIiIll.IliIlllilIi()) {
               var10000 = this.iIlilIiIll;
               var10000.lIiilIIIil += var4;
            } else {
               var10000 = this.iIlilIiIll;
               var10000.iIiilIIIil += var4;
            }
         }
      }

      this.IiIiiIiIll = now;
   }

   private void lIilliIill(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (Iiiilllliiilll.field_1687.method_27983() != class_1937.field_25179) {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
      } else if (IIiIiIillIiIiIil.IIillIiliIil(var3.method_31548()) == 0) {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
      } else if (this.iIiliIlili() < 0 && var3.method_7344().method_7586() < (--1825626354 + 91 ^ 1825626439)) {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
      } else if (llIilllilIilll.IlIlllIlilIl(var3) != 0 || llIilllilIilll.IiIlliIliiIl(var3) || this.IiIilIiIll.Iilllilliill() && llIilllilIilll.IIIllIIliIIl(var3, this.lIIIiIiIll)) {
         if (this.IliIiIiIll == null || this.IliIiIiIll.IliIlllilIi() != IiIIilllliIIilll.lIiIIIlill || this.IliIiIiIll.liiiIIllIl() != iiiiiiIlIIIIIIll.iIIIliIlll) {
            this.Iliiilliii(iiiliiIIIiii.lIlIIIiIliIlIIIiIl, IliIlllilIi<invokedynamic>());
            this.ilIliIiIll = now;
            this.iIlilIiIll.iililIIIil = 0;
            this.iiliiIIiii(iillIIilIIilIIil.ilIIllIIil, IliIlllilIi<invokedynamic>());
         }
      } else {
         this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
      }
   }

   private iIiIIIlIliIIIl lIliliIlil(class_2338 a, class_2680 feetY, lliIiIililiIiIil st, int sight) {
      this.iililIiIll.Illlllllilll(a.method_10263(), a.method_10264(), a.method_10260(), 4);
      lliIllliliIlll var5 = IiIliillliIliill.iIlIlllllill(this.iililIiIll, a.method_10263(), a.method_10264(), a.method_10260(), st);
      Iiiililiiili var6 = iliIilIlIiiIilIl.IliIlllilIi(this.iililIiIll, a.method_10263(), a.method_10264(), a.method_10260(), sight, var5, this.llIilIiIll.Iilllilliill(), this.IiIliIiIll);
      class_243 var7 = Iiiilllliiilll.field_1724.method_33571();
      return iIiIIIlIliIIIl.lIiiIiIlilli(a.method_10263(), a.method_10264(), a.method_10260(), iIliiIIiIlliiIIi.IIillIiliIil(feetY), var7.field_1352, var7.field_1351, var7.field_1350, sight, var5, var6, this.llIilIiIll.Iilllilliill());
   }

   private void ilIIiIiIIi(long now, boolean act) {
      class_746 var4 = Iiiilllliiilll.field_1724;
      if (this.IIlliIiIll == null) {
         this.iiliiIIiii(iillIIilIIilIIil.iIlIllIIil, IliIlllilIi<invokedynamic>());
      } else {
         class_638 var5 = Iiiilllliiilll.field_1687;
         class_2680 var6 = var5.method_8320(this.IIlliIiIll);
         if (!var6.method_27852(class_2246.field_23152)) {
            this.lIIIiIiIll.IilliliilIIi();
            if (!this.IllliIiIll) {
               this.IllliIiIll = true;
               this.lllliIiIll = 0;
            }

            ++this.lllliIiIll;
            if (!iliilliIiiilli.IilliliilIIi(var5, this.IIlliIiIll) || this.lllliIiIll > 20) {
               if (this.lllliIiIll >= 3) {
                  this.lilliIiIll = this.IilIiIiIll;
                  this.IIiilIiIll.lIiiIiIlilli(this.IIlliIiIll);
                  this.iiliiIIiii(iillIIilIIilIIil.illIllIIil, IliIlllilIi<invokedynamic>());
               }
            }
         } else {
            if (this.IllliIiIll) {
               this.IllliIiIll = false;
               ++this.iIlilIiIll.IililIIIil;
               ++this.iIlliIiIll;
               if (this.iIlliIiIll >= 2) {
                  this.iiliiIIiii(iillIIilIIilIIil.lilIllIIil, IliIlllilIi<invokedynamic>());
                  return;
               }
            }

            if (!llIilllilIilll.IiIlliIliiIl(var4)) {
               this.iIlIiIllIi(now);
            } else if (this.IilIiIiIll - this.illliIiIll > 900L) {
               this.illilIilil(now, IliIlllilIi<invokedynamic>());
            } else if (var4.method_33571().method_1022(class_243.method_24953(this.IIlliIiIll)) > (double)4.5F) {
               this.iiliiIIiii(iillIIilIIilIIil.IllIllIIil, IliIlllilIi<invokedynamic>());
            } else {
               lIlIiiiliIlIiiil var7 = this.lIIIiIiIll.IIIllIIliIIl(this.IIlliIiIll, false);
               switch (var7) {
                  case liIiiIIiil:
                     this.lIiiiiIiii(IliIlllilIi<invokedynamic>() + this.iIlilIiIll.ilIilIIIil + IliIlllilIi<invokedynamic>());
                     break;
                  case iiIiiIIiil:
                     this.ilIiiIiIll.add(this.IIIIiIiIll.Iiilliiliiil().method_10063());
                     if (this.ilIiiIiIll.size() >= 3) {
                        this.illilIilil(now, IliIlllilIi<invokedynamic>());
                        return;
                     }

                     this.liiilIiIll.clear();
                     this.iiliiIIiii(iillIIilIIilIIil.IllIllIIil, IliIlllilIi<invokedynamic>());
                     break;
                  case ilIiiIIiil:
                     if (act) {
                        this.lIIIiIiIll.lIiiIiIlilli(true);
                        this.lliIiIiIll = true;
                        this.IIiliIiIll = now;
                     }
               }

            }
         }
      }
   }

   public IIIIIIillIIIIIil IIIIIllIIIIl() {
      return this.iIlilIiIll;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 13547) - var5) ^ '\udae0') + '霯'))) ^ var5) - var5) ^ '\uf69f') >>> 13 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 13547) - var5) ^ '\udae0') + '霯'))) ^ var5) - var5) ^ '\uf69f') << 3) + var5) ^ 23418) ^ '꿚') + 32281));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIIliIlIli(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;

      int[] var4;
      while((var4 = (int[])this.iIiilIiIll.poll()) != null) {
         if (var4[0] == var3.method_5628()) {
            class_1297 var5 = var4[1] > 0 ? Iiiilllliiilll.field_1687.method_8469(var4[1]) : null;
            if (var5 instanceof class_1657 && var5 != var3) {
               this.lIIiiIiIll = now;
            }
         }
      }

   }

   private void lIIiiiIIii() {
      long var2 = 7115071988796103084L;
      var2 ^= ((long)this.iIIIiIiIll.iIlIlllllill() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) < this.llIiiIiIll) {
         this.llIiiIiIll = 0;
      }

      if ((int)(var2 >>> 32) > this.llIiiIiIll) {
         IIIIIIillIIIIIil var10000 = this.iIlilIiIll;
         var10000.lllilIIIil += (int)(var2 >>> 32) - this.llIiiIiIll;
         this.llIiiIiIll = (int)(var2 >>> 32);
      }

   }

   private void llliiillii() {
      if (!this.iiiilIiIll.isEmpty()) {
         ArrayList var1 = new ArrayList(this.iiiilIiIll);
         this.iiiilIiIll.clear();
         if (!lilllIliiilllIli.iiiIlIIIll() && !IIiIIllIiIIl.IliIlllilIi() && IIIIIllllIIIIlll.IiIlliIliiIl()) {
            try (AutoCloseable var2 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
               for(ilIllIiIll var4 : var1) {
                  if (!var4.IliIlllilIi()) {
                     var4.IIillIiliIil(true);
                  }
               }
            } catch (Exception var7) {
            }

         }
      }
   }

   private void lilliiilli() {
      if (this.lllIiIiIll != iillIIilIIilIIil.IIiIllIIil) {
         this.illIiIiIll = this.lllIiIiIll == iillIIilIIilIIil.IilIllIIil ? iillIIilIIilIIil.iIlIllIIil : this.lllIiIiIll;
         this.lIIIiIiIll.IilliliilIIi();
         if (this.llIIiIiIll.lIiiIiIlilli()) {
            this.llIIiIiIll.iliIiiliiiii();
         }

         this.IIIIiIiIll.iIlIlllllill();
         this.iiliiIIiii(iillIIilIIilIIil.IIiIllIIil, this.IliIiIiIll.liiiIIllIl().iliIliIlll);
      }

   }

   private boolean iilIiIIiIi() {
      return this.lllIiIiIll == iillIIilIIilIIil.lIlIllIIil || this.lllIiIiIll == iillIIilIIilIIil.iIlIllIIil || this.lllIiIiIll == iillIIilIIilIIil.IllIllIIil || this.lllIiIiIll == iillIIilIIilIIil.lllIllIIil || this.lllIiIiIll == iillIIilIIilIIil.illIllIIil;
   }

   protected void lIlIliIlIl(IIilllilIillli e) {
      if (e != null && Iiiilllliiilll != null && Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.field_1729 != null) {
         if (Iiiilllliiilll.field_1729.method_1613() && Iiiilllliiilll.method_1569() && !iIIilIIiIlIilIIi.lIIlliIIll() && !lilIliIiiilIliIi.iiiIlIIIll()) {
            this.lililIiIll.IilliliilIIi(e.IliIlllilIi(), e.liiiIIllIl());
         }
      }
   }

   private boolean ilIiiIiIii() {
      if (Iiiilllliiilll.field_1755 == null && Iiiilllliiilll.field_1690 != null) {
         for(class_304 var4 : IIiIIlilIiIIli.IlIlllIlilIl(Iiiilllliiilll.field_1690)) {
            if (IillIIIllillIIIl.IliIlllilIi(var4)) {
               return true;
            }
         }

         for(class_304 var8 : Iiiilllliiilll.field_1690.field_1852) {
            if (IillIIIllillIIIl.IliIlllilIi(var8)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void Illillllil(long now, iIiIIIlIliIIIl t) {
      this.iiIliIiIll = t;
      this.IIlliIiIll = new class_2338(t.IIIllIIliIIl(), t.IlIlllIlilIl(), t.IiIlliIliiIl());
      this.lIlliIiIll = now;
      this.iiIIiIiIll = false;
      this.iIlliIiIll = 0;
      this.IllliIiIll = false;
      this.lllliIiIll = 0;
      this.iilliIiIll = t.IIlllIlliIll() > 0;
      this.liiilIiIll.clear();
      this.ilIiiIiIll.clear();
      this.iIIIiIiIll.IliIlllilIi();
      this.IlIIiIiIll.IliIlllilIi();
      this.IiIIiIiIll.IliIlllilIi();
      this.iIIIiIiIll.IlIlllIlilIl(this.IIlliIiIll);
      this.iiliiIIiii(iillIIilIIilIIil.IllIllIIil, IliIlllilIi<invokedynamic>() + this.IIlliIiIll.method_23854());
   }

   protected void IIiilIiiiIii(illlllIillll e) {
      if (e != null && this.liIIiIiIll != null && this.iIIIiIiIll != null && Iiiilllliiilll.field_1724 != null) {
         List var2 = this.iIIIiIiIll.IiIlliIliiIl(this.IilIiIiIll) ? this.iIIIiIiIll.IIlllIlliIll() : null;
         lIIIlliIIIll var3 = this.IiIIiIiIll != null && this.IiIIiIiIll.liiiIIllIl() == iiiiilllIIIIIill.Iilllllill ? this.IiIIiIiIll.iIlIlllllill() : null;
         this.liIIiIiIll.IliIlllilIi(e.liiiiIIiiiiiiIIi, this.lIlilIiIll.Iilllilliill(), this.IIlliIiIll, var2, var2 == null ? null : this.iIIIiIiIll.Illlllllilll(), var3);
      }
   }

   private int iIiliIlili() {
      class_1661 var1 = Iiiilllliiilll.field_1724.method_31548();

      for(int var2 = 0; var2 <= 35; ++var2) {
         if (Iiililiili(var1.method_5438(var2))) {
            return var2;
         }
      }

      return -1;
   }

   private void IilIililIi(long now, String reason) {
      this.lIIIiIiIll.IilliliilIIi();
      this.lililiilil();
      this.iiliiIIiii(this.IllilIiIll.iIlIlllllill(now) ? iillIIilIIilIIil.ilIIllIIil : iillIIilIIilIIil.iiIIllIIil, reason);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) >>> 10) - var5))) - 8149) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) >>> 10) - var5))) - 8149) ^ var5) >>> 5) << 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) >>> 10) - var5))) - 8149) ^ var5) << 11 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) >>> 5 | (char)((char)((char)(var4[var5] - 13189) ^ 722) - var5) << 11) - var5) >>> 10) - var5))) - 8149) ^ var5) >>> 5) >>> 11))) + 11054))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lllIiillIi(long now, boolean act) {
      if (act) {
         iiiIiilIIIliil var4 = this.llIIiIiIll.Iilllilliill(this.IilIiIiIll);
         if (this.lIIIiIiIll.iIlIlllllill() != null) {
            this.lliIiIiIll = true;
         }

         if (var4 == iiiIiilIIIliil.lllIiIlliillIiIlli) {
            this.Iliiilliii(iiiliiIIIiii.IllIIIiIllllIIIiIl, this.llIIiIiIll.iIlIlllllill() + IliIlllilIi<invokedynamic>());
            this.iiliiIIiii(this.IIlliIiIll != null ? iillIIilIIilIIil.IllIllIIil : iillIIilIIilIIil.iIlIllIIil, IliIlllilIi<invokedynamic>());
         } else if (var4 == iiiIiilIIIliil.IilIiIllililIiIlli) {
            this.lIiiiiIiii(IliIlllilIi<invokedynamic>() + this.iIlilIiIll.ilIilIIIil + IliIlllilIi<invokedynamic>() + this.llIIiIiIll.liiiIIllIl() + IliIlllilIi<invokedynamic>());
         }

      }
   }

   protected void Iliilliiilii(lIiIlliiIiIlli e) {
      if (e != null && Iiiilllliiilll.field_1755 == null && !Iiiilllliiilll.field_1690.field_1842 && Iiiilllliiilll.field_1724 != null) {
         if (this.liIIiIiIll != null && this.lIlilIiIll.Iilllilliill() && this.IIlliIiIll != null) {
            this.liIIiIiIll.IilliliilIIi(e.IIiIilIIIl, this.IIlliIiIll, IliIlllilIi<invokedynamic>(), this.iIlllIllll());
         }

         if (this.ilIIiIiIll != null && this.IIlilIiIll.Iilllilliill()) {
            this.lllllillll(e.IIiIilIIIl);
         }
      }
   }

   protected void Illillliilli() {
      this.iIlilIiIll.IliIlllilIi();
      this.IllilIiIll.IliIlllilIi();
      this.lllilIiIll.IliIlllilIi();
      this.illilIiIll.IliIlllilIi();
      this.illilIiIll.liiiIIllIl();
      this.lililIiIll.IliIlllilIi();
      this.IIiilIiIll.IliIlllilIi();
      this.lIiilIiIll.clear();
      this.iIiilIiIll.clear();
      this.IliilIiIll.set(0);
      this.lliilIiIll.clear();
      this.iliilIiIll.clear();
      this.IiiilIiIll.clear();
      this.liiilIiIll.clear();
      this.lllIiIiIll = iillIIilIIilIIil.llIIllIIil;
      this.illIiIiIll = iillIIilIIilIIil.lIlIllIIil;
      this.IilIiIiIll = 0L;
      this.lilIiIiIll = 0L;
      this.iilIiIiIll = 0L;
      this.IIiIiIiIll = "";
      this.iIiIiIiIll = null;
      this.IliIiIiIll = null;
      this.lliIiIiIll = false;
      this.iliIiIiIll = null;
      this.IiiIiIiIll = null;
      this.liiIiIiIll = null;
      this.iiiIiIiIll = null;
      this.IIIliIiIll = -2305843009213693952L;
      this.lIIliIiIll = -2305843009213693952L;
      this.iIIliIiIll = -2305843009213693952L;
      this.IlIliIiIll = false;
      this.llIliIiIll = -1L;
      this.IiIliIiIll = false;
      this.liIliIiIll = false;
      this.lililiilil();
      this.IliliIiIll = false;
      this.lliliIiIll = false;
      this.ililiIiIll = "";
      this.IiiliIiIll = null;
      this.iiiliIiIll = false;
      this.IIIiiIiIll.clear();
      this.lIIiiIiIll = -1L;
      this.iIIiiIiIll = false;
      this.IlIiiIiIll = 0L;
      this.llIiiIiIll = 0;
      this.ilIiiIiIll.clear();
      this.IiIiiIiIll = -1L;
      this.liIiiIiIll = 0;
      this.IIliiIiIll = "";
      this.lIiIiIiIll = Iiiilllliiilll != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null ? null : IliIlllilIi<invokedynamic>();
      if (Iiiilllliiilll != null) {
         this.iiiIlIIIll();
         this.ilIIiIiIll.IliIlllilIi();
         this.iIIIiIiIll.IliIlllilIi();
         this.IlIIiIiIll.IliIlllilIi();
         this.IiIIiIiIll.IliIlllilIi();
         this.iiIIiIiIll = false;
         this.IIlIiIiIll = false;
         this.lIlIiIiIll = false;
         this.iIlIiIiIll = null;
         this.IllIiIiIll = -2305843009213693952L;
         this.iiIiiIiIll = new IlillIIillillIIi(liIIiilliiIIiill.iiIIiliill, iillIIilIIilIIil.llIIllIIil.iIiIllIIil, (String)null, 0, 0, this.iIlilIiIll.IiIlliIliiIl());
         if (this.lIiIiIiIll == null) {
            this.iIliiIllii();
         }

      }
   }

   private void lIiiiiIiii(String reason) {
      this.IIiIiIiIll = reason == null ? "" : reason;
      this.lllIiIiIll = iillIIilIIilIIil.lIiIllIIil;
      if (this.IliIlllilIi()) {
         AutoCloseable var2 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

         try {
            this.IIillIiliIil(false);
         } finally {
            try {
               var2.close();
            } catch (Exception var9) {
               this.IIiIiIiIll = reason == null ? "" : reason;
            }

         }

         if (reason != null && !reason.isBlank()) {
            String var3 = this.iIlilIiIll.ilIilIIIil <= 0 && this.iIlilIiIll.liIilIIIil <= 0 ? "" : IliIlllilIi<invokedynamic>() + this.iIlilIiIll.IiIlliIliiIl() + IliIlllilIi<invokedynamic>();
            this.Iliiilliii(iiiliiIIIiii.lilIIIiIliilIIIiIl, reason + var3);
         }

      }
   }

   public iIiIIiIlIliIIiIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IIIilIiIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (String[])iiiIIIIlIIIlIIIl.iIiIliIlIl.toArray(new String[0]));
      this.lIIilIiIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 96, 8, 160);
      this.iIIilIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.IlIilIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.llIilIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.ilIilIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.IiIilIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.liIilIiIll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 2304);
      this.iiIilIiIll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
      this.IIlilIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.lIlilIiIll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.iIlilIiIll = new IIIIIIillIIIIIil();
      this.IllilIiIll = new iliIIlilIiiIIlil();
      this.lllilIiIll = new iiiIIIIlIIIlIIIl();
      this.illilIiIll = new iIIilIlIil();
      this.IililIiIll = new Illliilllllliill();
      this.lililIiIll = new ilIiilIlIiIiilIl();
      this.iililIiIll = new IiIIiIIlliIIiIIl();
      this.IIiilIiIll = new iIliiIIiIlliiIIi();
      this.lIiilIiIll = new ConcurrentLinkedQueue();
      this.iIiilIiIll = new ConcurrentLinkedQueue();
      this.IliilIiIll = new AtomicInteger();
      this.lliilIiIll = new LongOpenHashSet();
      this.iliilIiIll = new ArrayList();
      this.IiiilIiIll = new ArrayList();
      this.liiilIiIll = new HashSet();
      this.iiiilIiIll = new ArrayList();
      this.IllIiIiIll = -2305843009213693952L;
      this.lllIiIiIll = iillIIilIIilIIil.llIIllIIil;
      this.illIiIiIll = iillIIilIIilIIil.lIlIllIIil;
      this.IIiIiIiIll = "";
      this.IIIliIiIll = -2305843009213693952L;
      this.lIIliIiIll = -2305843009213693952L;
      this.iIIliIiIll = -2305843009213693952L;
      this.llIliIiIll = -1L;
      this.IIiliIiIll = -2305843009213693952L;
      this.lIiliIiIll = -2305843009213693952L;
      this.ililiIiIll = "";
      this.liiliIiIll = -2305843009213693952L;
      this.IIIiiIiIll = new ArrayList();
      this.lIIiiIiIll = -1L;
      this.ilIiiIiIll = new LongOpenHashSet();
      this.IiIiiIiIll = -1L;
      this.iiIiiIiIll = IlillIIillillIIi.lIiIIIiiil;
      this.IIliiIiIll = "";
      this.lIliiIiIll = -2305843009213693952L;
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIilIiIll, this.lIIilIiIll, this.iIIilIiIll, this.IlIilIiIll, this.llIilIiIll, this.ilIilIiIll, this.IiIilIiIll, this.liIilIiIll, this.iiIilIiIll, this.IIlilIiIll, this.lIlilIiIll});
   }

   public void lllllillll(class_332 ctx) {
      if (ctx != null && this.ilIIiIiIll != null && this.IIlilIiIll.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         long var2 = IIIiillllIIiilll.IliIlllilIi();
         String var4 = this.IllilIiIll.liiiIIllIl() ? IliIlllilIi<invokedynamic>() : (this.IllilIiIll.iIlIlllllill(var2) ? IliIlllilIi<invokedynamic>() : (this.IllilIiIll.IIIllIIliIIl(var2) + 999L) / 1000L + IliIlllilIi<invokedynamic>());
         this.ilIIiIiIll.liiiIIllIl(ctx, this.iiIiiIiIll, this.iIlilIiIll.ilIilIIIil, this.iIlilIiIll.iliIiiliiiii(), var4, !this.lliliIiIll && !this.IliliIiIll ? "" : IliIlllilIi<invokedynamic>());
      }
   }

   private List<class_2338> lliililiil() {
      ArrayList var1 = new ArrayList();
      class_2338 var2 = this.IIlliIiIll;
      if (var2 == null) {
         return var1;
      } else {
         lliIllliliIlll var3 = IiIliillliIliill.iIlIlllllill(this.iililIiIll, var2.method_10263(), var2.method_10264(), var2.method_10260(), illIIiIlIilIIiIl.iIlIlllllill(this.IIIIiIiIll));

         for(Ilililllilil var5 : var3.IilliliilIIi()) {
            if (var1.size() >= 3) {
               return var1;
            }

            if (illIIiIlIilIIiIl.IliIlllilIi(this.iililIiIll, var5.IliIlllilIi(), var5.liiiIIllIl(), var5.iIlIlllllill())) {
               var1.add(new class_2338(var5.IliIlllilIi(), var5.liiiIIllIl(), var5.iIlIlllllill()));
            }
         }

         if (!var1.isEmpty()) {
            return var1;
         } else {
            ArrayList var11 = new ArrayList();
            byte var12 = 6;

            for(int var6 = -var12; var6 <= var12; ++var6) {
               for(int var7 = -var12; var7 <= var12; ++var7) {
                  int var8 = var2.method_10263() + var6;
                  int var9 = var2.method_10260() + var7;
                  if (IIIilIlllIIilIll.iliIiiliiiii(var8, var9, var2.method_10263(), var2.method_10260())) {
                     class_2338 var10 = illIIiIlIilIIiIl.liiiIIllIl(this.iililIiIll, Iiiilllliiilll.field_1687, var8, var9);
                     if (var10 != null) {
                        var11.add(var10);
                     }
                  }
               }
            }

            var11.sort((u, v) -> Double.compare(u.method_10262(var2), v.method_10262(var2)));

            for(int var13 = 0; var13 < var11.size() && var1.size() < 3; ++var13) {
               var1.add((class_2338)var11.get(var13));
            }

            return var1;
         }
      }
   }

   private iIlIllIiIllIllIi IlIiillIii(long now) {
      long var6 = -2631069746461159875L;
      class_746 var3 = Iiiilllliiilll.field_1724;
      var6 ^= ((long)(var3.method_5805() && !var3.method_29504() && !(Iiiilllliiilll.field_1755 instanceof class_418) ? 1 : 0) << 32 ^ var6) & -1L << 32;
      var6 ^= ((long)(Iiiilllliiilll.field_1755 != null && !this.llIIiIiIll.lIiiIiIlilli() ? 1 : 0) ^ var6) & -1L >>> 32;
      return new iIlIllIiIllIllIi(now, this.IilIiIiIll, this.iIiIiIiIll, Iiiilllliiilll.field_1687, var3, (boolean)((int)(var6 >>> 32)), (boolean)((int)var6), lilIliIiiilIliIi.iiiIlIIIll(), IIIiillllIIiilll.iIlIlllllill(), iiIliillIIlliill.liiiIIllIl(), iillIlllIIilIlll.IliIlllilIi(), false, Double.longBitsToDouble(7390115583830139656L ^ 1834925443468632840L), this.lililIiIll.iliIiiliiiii(now), false, (String)null, (String)null, var3.method_68878(), var3.method_7325(), var3.method_5765(), 0);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.method_1562() != null) {
         this.iiiIlIIIll();
         long var1 = IIIiillllIIiilll.IliIlllilIi();

         try {
            this.Iillllilll(var1);
            this.liIiiIiIll = 0;
         } catch (Throwable var4) {
            ++this.liIiiIiIll;
            ++this.iIlilIiIll.lililIIIil;
            this.lIIIiIiIll.IilliliilIIi();
            this.IIIIiIiIll.iIlIlllllill();
            this.IililIiIll.lIiiIiIlilli(var1);
            if (this.IililIiIll.iliIiiliiiii() || this.liIiiIiIll > 40) {
               this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
            }
         }

      }
   }

   private List<iliillllIiiillll> IiIliliIli(class_746 self) {
      ArrayList var2 = new ArrayList(4);

      for(class_742 var4 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var4 != self) {
            String var5 = var4.method_7334() == null ? var4.method_5477().getString() : var4.method_7334().name();
            var2.add(new iliillllIiiillll(var5, var4.method_23317(), var4.method_23318(), var4.method_23321(), iIIiIiIlIlIiIiIl.liiiIIllIl(var4), var4.method_7325()));
         }
      }

      return var2;
   }

   private void Iiliililii(String reason) {
      class_634 var2 = Iiiilllliiilll.method_1562();
      this.lIiiiiIiii(reason);
      if (var2 != null) {
         var2.method_48296().method_10747(class_2561.method_43470(reason));
      }

   }

   private void illliIilli(List<Iiiiiilliiiiil> threats) {
      long var5 = -4005469431642920264L;
      class_746 var2 = Iiiilllliiilll.field_1724;
      if (threats != null && !threats.isEmpty()) {
         if (!this.iiiliIiIll) {
            this.iiiliIiIll = true;
            ++this.iIlilIiIll.iIlilIIIil;
         }

         var5 ^= ((long)(this.IiiliIiIll != null && Math.hypot(this.IiiliIiIll.IliIlllilIi() - var2.method_23317(), this.IiiliIiIll.iIlIlllllill() - var2.method_23321()) <= Double.longBitsToDouble(-8579794357798130917L ^ -3963604739743372517L) ? 1 : 0) << 32 ^ var5) & -1L << 32;
         var5 ^= ((long)(this.IiiliIiIll != null && IliIiilllliIiill.IilliliilIIi(var2.method_23317(), var2.method_23321(), this.IiiliIiIll, threats) ? 1 : 0) ^ var5) & -1L >>> 32;
         if (this.IiiliIiIll == null || (int)(var5 >>> 32) != 0 || (int)var5 != 0 || this.IilIiIiIll - this.liiliIiIll >= (-9144015319120905916L ^ -9144015319120905876L)) {
            this.liiliIiIll = this.IilIiIiIll;
            this.IiiliIiIll = IliIiilllliIiill.liiiIIllIl(var2.method_23317(), this.IIIIiIiIll.Iiilliiliiil().method_10264(), var2.method_23321(), threats, illIIiIlIilIIiIl.IilliliilIIi(this.iililIiIll));
         }

         if (this.IiiliIiIll != null) {
            this.IlIIiIiIll.lIiiIiIlilli(this.IilIiIiIll, new class_243(this.IiiliIiIll.IliIlllilIi(), (double)this.IiiliIiIll.liiiIIllIl(), this.IiiliIiIll.iIlIlllllill()), true);
         }
      }
   }

   private void iiliiIIiii(iillIIilIIilIIil s, String reason) {
      if (s != null) {
         this.IIiIiIiIll = reason == null ? "" : reason;
         if (s != this.lllIiIiIll) {
            this.lllIiIiIll = s;
            this.lilIiIiIll = this.IilIiIiIll;
            this.iilIiIiIll = IIIiillllIIiilll.IliIlllilIi();
         }
      }
   }

   private void liIIiiiIIi(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      int var4 = llIilllilIilll.Iiiiliiiiiii(var3, class_1802.field_23141);
      if (var4 > this.IilliIiIll) {
         int var11 = var4 - this.IilliIiIll;
         this.iIlilIiIll.lIiiIiIlilli(var11, this.iilliIiIll);
         this.Iliiilliii(iiiliiIIIiii.IllIIIiIllllIIIiIl, IliIlllilIi<invokedynamic>() + var11 + IliIlllilIi<invokedynamic>() + (var11 == 1 ? "" : IliIlllilIi<invokedynamic>()) + IliIlllilIi<invokedynamic>() + this.iIlilIiIll.ilIilIIIil + IliIlllilIi<invokedynamic>());
         this.lililiilil();
         this.liIliIiIll = false;
         if (this.liIilIiIll.Iilllilliill() > 0 && this.iIlilIiIll.ilIilIIIil >= this.liIilIiIll.Iilllilliill()) {
            this.lIiiiiIiii(IliIlllilIi<invokedynamic>() + this.iIlilIiIll.ilIilIIIil + IliIlllilIi<invokedynamic>());
         } else {
            this.iiliiIIiii(iillIIilIIilIIil.iIlIllIIil, IliIlllilIi<invokedynamic>());
         }
      } else {
         long var5 = this.IilIiIiIll - this.lilliIiIll;
         if (var5 >= 10L) {
            if (var5 > 60L) {
               ++this.iIlilIiIll.illilIIIil;
               this.lililiilil();
               this.liIliIiIll = false;
               this.iiliiIIiii(iillIIilIIilIIil.iIlIllIIil, IliIlllilIi<invokedynamic>());
            } else {
               class_1542 var7 = llIilllilIilll.IIIIllIIIl(var3, (double)6.0F, (it) -> it.method_6983().method_31574(class_1802.field_23141));
               if (var7 != null) {
                  class_2338 var8 = var7.method_24515();
                  class_243 var9 = var7.method_73189();
                  liIIIilliiIIIill var10 = this.iIIIiIiIll.Iilllilliill(this.IilIiIiIll, IliIlllilIi<invokedynamic>() + var7.method_5628(), (c) -> IIlIilIlIi(c, var9), var8, var8, false);
                  if (var10 == liIIIilliiIIIill.lllilllill) {
                     this.IIIIiIiIll.IIlilIliiIli(var9, false);
                  }

               }
            }
         }
      }
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      if (this.IIIIiIiIll != null) {
         this.IIIIiIiIll.Iilllilliill(e);
      }

   }

   public static boolean IIlIilIlIi(class_2338 stand, class_243 item) {
      return Math.abs(item.field_1352 - ((double)stand.method_10263() + Double.longBitsToDouble(-446723315238187068L ^ -4166696607446216764L))) <= Double.longBitsToDouble(-4393324196092206324L ^ -218882587621180778L) && Math.abs(item.field_1350 - ((double)stand.method_10260() + Double.longBitsToDouble(862111525931713050L ^ 3753422486703571482L))) <= Double.longBitsToDouble(4725652576757501903L ^ 9107820385840387669L) && item.field_1351 >= (double)stand.method_10264() - Double.longBitsToDouble(2815597090649929156L ^ 1796990753683850999L) && item.field_1351 <= (double)stand.method_10264() + Double.longBitsToDouble(-460744370010123470L ^ -5072223460063322113L);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] ^ 10954))) + '鯹') - '더'))) - 8559) ^ '쒐'))) + 6259))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iliIiIiiIi(long jump, double now) {
      this.IllilIiIll.Iiilliiliiil(jump);
      this.lllilIiIll.iliIiiliiiii(this.iliIiIiIll);
      ++this.iIlilIiIll.iiIilIIIil;
      ++this.iIlilIiIll.iililIIIil;
      this.lIiIiiIiIi();
      this.IlIliIiIll = false;
      this.IliliIiIll = false;
      this.lliliIiIll = false;
      this.ililiIiIll = "";
      this.IiiliIiIll = null;
      this.iiiliIiIll = false;
      this.IIIiiIiIll.clear();
      this.illilIiIll.IliIlllilIi();
      this.IiIliIiIll = false;
      this.lliilIiIll.clear();
      this.iliilIiIll.clear();
      this.IiiilIiIll.clear();
      this.liIliIiIll = false;
      this.IIiilIiIll.IliIlllilIi();
      this.lIIIiIiIll.IilliliilIIi();
      this.lililiilil();
      this.iIIIiIiIll.IliIlllilIi();
      this.IlIIiIiIll.IliIlllilIi();
      this.IiIIiIiIll.IliIlllilIi();
      this.ilIliIiIll = jump;
      this.llIliIiIll = -1L;
      this.iiliiIIiii(iillIIilIIilIIil.IIlIllIIil, IliIlllilIi<invokedynamic>());
   }

   private void liiIiiiiIi(long now) {
      Set var3 = null;

      String var4;
      while((var4 = (String)this.lIiilIiIll.poll()) != null) {
         this.IliilIiIll.decrementAndGet();
         if (var3 == null) {
            var3 = this.llIliilIli();
         }

         IllIIIIllllIIIIl var6 = iiilIllIIIiIll.IliIlllilIi(var4, this.IIIliIiIll > -1152921504606846976L ? now - this.IIIliIiIll : -1L, (names) -> var3.contains(names.toLowerCase(Locale.ROOT)));
         if (var6.liiiIIllIl() != IIiIiillIiIiil.IlIiliIlillIiliIli) {
            this.IIIlilIIli(now, var6);
            if (!this.IliIlllilIi()) {
               return;
            }
         }
      }

   }

   private Set<String> llIliilIli() {
      HashSet var1 = new HashSet();
      class_634 var2 = Iiiilllliiilll.method_1562();
      if (var2 == null) {
         return var1;
      } else {
         for(class_640 var4 : var2.method_2880()) {
            if (var4 != null && var4.method_2966() != null && var4.method_2966().name() != null) {
               var1.add(var4.method_2966().name().toLowerCase(Locale.ROOT));
            }
         }

         return var1;
      }
   }

   private boolean IIililIili(boolean act) {
      class_746 var2 = Iiiilllliiilll.field_1724;
      int var3 = var2.method_7344().method_7586();
      if (this.iIIiiIiIll) {
         if (var2.method_6115()) {
            this.IIIIiIiIll.IilliliilIIi(128);
            return true;
         }

         this.iIIiiIiIll = false;
         this.IIIIiIiIll.lIiiIiIlilli(128);
      }

      if (!act) {
         return false;
      } else {
         boolean var4 = this.lllIiIiIll == iillIIilIIilIIil.iiIIllIIil || this.lllIiIiIll == iillIIilIIilIIil.IIlIllIIil || this.lllIiIiIll == iillIIilIIilIIil.lIlIllIIil || this.lllIiIiIll == iillIIilIIilIIil.iIlIllIIil || this.lllIiIiIll == iillIIilIIilIIil.IiIIllIIil;
         boolean var5 = var2.method_6032() <= 6.0F && var3 < 20;
         boolean var6 = var3 <= 14 && var4 || var3 <= 6 || var2.method_6032() < 14.0F && var3 < 20 && var4 || var5;
         if (var6 && this.lllIiIiIll != iillIIilIIilIIil.IilIllIIil && !this.llIIiIiIll.lIiiIiIlilli()) {
            if (this.lllIiIiIll == iillIIilIIilIIil.lllIllIIil && this.lIIIiIiIll.iIlIlllllill() != null && var3 > 6 && !var5) {
               return false;
            } else if (this.IilIiIiIll < this.IlIiiIiIll) {
               return false;
            } else {
               int var7 = this.iIiliIlili();
               if (var7 < 0) {
                  return false;
               } else if (var7 > 8) {
                  this.lliliilili();
                  return false;
               } else {
                  this.lIIIiIiIll.IilliliilIIi();
                  if (!this.IIIIiIiIll.IIillIiliIil(var7)) {
                     this.IIIIiIiIll.Ililllililil(var7);
                     return true;
                  } else if (!var2.method_6115() && Iiiilllliiilll.field_1761 != null) {
                     Iiiilllliiilll.field_1761.method_2919(var2, class_1268.field_5808);
                     if (var2.method_6115()) {
                        this.iIIiiIiIll = true;
                        this.IIIIiIiIll.IilliliilIIi(128);
                        return true;
                     } else {
                        this.IlIiiIiIll = this.IilIiIiIll + 40L;
                        return false;
                     }
                  } else {
                     return false;
                  }
               }
            }
         } else {
            return false;
         }
      }
   }

   private void iIliiIllii() {
      this.iiiilIiIll.clear();
      if (this.IIliilIlii(iIliiIiIll) == null) {
         ArrayList var1 = new ArrayList();

         try (AutoCloseable var2 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl()) {
            for(Class var4 : IlliiIiIll) {
               ilIllIiIll var5 = llilIllililIll.iliIiiliiiii(var4);
               if (var5 != null && var5 != this && var5.IliIlllilIi()) {
                  var5.IIillIiliIil(false);
                  if (!var5.IliIlllilIi()) {
                     var1.add(var5.IilliliilIIi());
                     if (!(var5 instanceof lilIliIiiilIliIi)) {
                        this.iiiilIiIll.add(var5);
                     }
                  }
               }
            }
         } catch (Exception var8) {
         }

         if (!var1.isEmpty()) {
            this.Iliiilliii(iiiliiIIIiii.illIIIiIlIilIIIiIl, IliIlllilIi<invokedynamic>() + String.join(IliIlllilIi<invokedynamic>(), var1) + IliIlllilIi<invokedynamic>() + (this.iiiilIiIll.isEmpty() ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()));
         }
      }
   }

   private boolean lIIIiiIIIi(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      boolean var4 = var3.method_5869();
      int[] var5 = llIlIiilIlIi.Iilililiiili(var3);
      boolean var6 = var5[1] >= 1000000;
      if (this.IIlIiIiIll) {
         if (var6 || IiIiIlliIiIl.IIillIiliIil(var5[0], var5[1], var4)) {
            this.IIlIiIiIll = false;
            this.lIlIiIiIll = false;
            this.iIlIiIiIll = null;
            this.iIIIiIiIll.iIIIlIlIIl();
            return false;
         }

         if (var4 && !this.lIlIiIiIll && IiIiIlliIiIl.Iilllilliill(var5[0], true, false, IiIiIlliIiIl.IIlllIlliIll(this.iIlIiIiIll), var3.method_5669() <= 0) == IIIlilillIIlilil.lIIiIlIlil) {
            this.lIlIiIiIll = true;
            this.Iliiilliii(iiiliiIIIiii.illIIIiIlIilIIIiIl, IliIlllilIi<invokedynamic>());
         }
      } else {
         if (!var4 || var6) {
            return false;
         }

         if (this.iIlIiIiIll == null || this.IilIiIiIll - this.IllIiIiIll >= 4L) {
            this.IllIiIiIll = this.IilIiIiIll;
            class_2338 var7 = this.iIIIiIiIll.IIIilIIiiIIi(var3);
            this.iIlIiIiIll = IiIiIlliIiIl.IIIllIIliIIl(this.iililIiIll, var7.method_10263(), var7.method_10264(), var7.method_10260(), 8000);
         }

         int var9 = IiIiIlliIiIl.IIlllIlliIll(this.iIlIiIiIll);
         IIIlilillIIlilil var8 = IiIiIlliIiIl.Iilllilliill(var5[0], true, false, var9, var3.method_5669() <= 0);
         if (var8 == IIIlilillIIlilil.iiilIlIlil) {
            if (!this.iIIIiIiIll.IiIlliIliiIl(this.IilIiIiIll) && this.lllIiIiIll != iillIIilIIilIIil.IilIllIIil) {
               this.IIIIiIiIll.IilliliilIIi(16);
            }

            return false;
         }

         this.IIlIiIiIll = true;
         this.lIlIiIiIll = var8 == IIIlilillIIlilil.lIIiIlIlil;
         this.iIIIiIiIll.iIIIlIlIIl();
         this.lIIIiIiIll.IilliliilIIi();
         if (this.llIIiIiIll.lIiiIiIlilli()) {
            this.llIIiIiIll.iliIiiliiiii();
         }

         this.IiIIiIiIll.Iilllilliill(this.IilIiIiIll, IliIlllilIi<invokedynamic>());
         this.iIIiiIiIll = false;
         this.IIIIiIiIll.lIiiIiIlilli(128);
         if (this.lIlIiIiIll) {
            this.Iliiilliii(iiiliiIIIiii.illIIIiIlIilIIIiIl, IliIlllilIi<invokedynamic>());
         }
      }

      if (this.lIlIiIiIll && this.iIlIiIiIll == null && var4) {
         if (this.IllilIiIll.iIlIlllllill(now) && !this.IllilIiIll.liiiIIllIl()) {
            this.ilillIiill(now);
         }

         if (this.IllilIiIll.liiiIIllIl()) {
            return true;
         }
      }

      this.IlIIillIIi(var3);
      return true;
   }

   private boolean Iiiilliiil(long act, boolean now) {
      if (this.IiIIiIiIll.liiiIIllIl() == iiiiilllIIIIIill.lilllllill) {
         this.IililIiIll.IilliliilIIi(act);
         return true;
      } else if (this.ilIilIiIll.Iilllilliill() && now) {
         boolean var4 = !this.iiIIiIiIll || this.iIIIiIiIll.liiiIIllIl() > 0;
         if (!var4 && !this.IiIIiIiIll.iliIiiliiiii()) {
            return false;
         } else {
            IlliIiilllliIiil var5 = this.IiIIiIiIll.IIlllIlliIll(this.IilIiIiIll, this.IIlliIiIll, this::lliililiil);
            if (var5 == IlliIiilllliIiil.IiIiIIilil) {
               this.lIIIiIiIll.IilliliilIIi();
               if (this.iiiilIIIIi()) {
                  this.IiIIiIiIll.Illlllllilll(this.IilIiIiIll);
                  this.IililIiIll.IilliliilIIi(act);
               } else {
                  this.IiIIiIiIll.Iilllilliill(this.IilIiIiIll, IliIlllilIi<invokedynamic>());
               }

               return true;
            } else {
               return var5 == IlliIiilllliIiil.ilIiIIilil;
            }
         }
      } else {
         if (this.IiIIiIiIll.iliIiiliiiii()) {
            this.IiIIiIiIll.Iilllilliill(this.IilIiIiIll, now ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>());
         }

         return false;
      }
   }

   private void IIIlilIIli(long r, IllIIIIllllIIIIl now) {
      switch (now.liiiIIllIl()) {
         case ilIiliIliIiIiliIli:
            this.IllilIiIll.IiIlliIliiIl(r);
            break;
         case IIliliIlilIliliIli:
            if (this.IllilIiIll.liiiIIllIl()) {
               this.IllilIiIll.Illlllllilll(r, now.iIlIlllllill());
               this.lIiIiiIiIi();
               if (this.lllIiIiIll == iillIIilIIilIIil.IiIIllIIil || this.lllIiIiIll == iillIIilIIilIIil.liIIllIIil) {
                  this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
               }
            }
            break;
         case llliliIliilliliIli:
            if (this.IllilIiIll.liiiIIllIl()) {
               this.IllilIiIll.Iilllilliill(r);
               this.lIiIiiIiIi();
               if (this.lllIiIiIll == iillIIilIIilIIil.IiIIllIIil || this.lllIiIiIll == iillIIilIIilIIil.liIIllIIil) {
                  this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
               }
            }
            break;
         case iIliliIliIlliliIli:
            if (this.IllilIiIll.liiiIIllIl() && r - this.IIIliIiIll < 2000L) {
               this.IllilIiIll.IIillIiliIil(r);
               this.lIiIiiIiIi();
               if (this.lllIiIiIll == iillIIilIIilIIil.IiIIllIIil) {
                  this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
               }
            }
            break;
         case iililiIliIIiiliIli:
            if (this.IllilIiIll.liiiIIllIl()) {
               this.lIiIiiIiIi();
               this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
            }
            break;
         case lIiiliIliiIiiliIli:
            if (this.IllilIiIll.liiiIIllIl()) {
               this.IlIliIiIll = true;
               if (this.lllIiIiIll == iillIIilIIilIIil.IiIIllIIil) {
                  this.iiliiIIiii(iillIIilIIilIIil.liIIllIIil, IliIlllilIi<invokedynamic>());
               }
            }
            break;
         case IliiliIlilliiliIli:
            if (this.IllilIiIll.liiiIIllIl() || this.IlIliIiIll) {
               this.IllilIiIll.Ililllililil(r);
               this.lIiIiiIiIi();
               this.IlIliIiIll = false;
               if (this.lllIiIiIll == iillIIilIIilIIil.IiIIllIIil || this.lllIiIiIll == iillIIilIIilIIil.liIIllIIil) {
                  this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
               }
            }
            break;
         case IililiIlilililiIli:
            if (this.lllIiIiIll == iillIIilIIilIIil.IilIllIIil) {
               this.llIIiIiIll.IilliliilIIi();
            } else if (r - this.IIiliIiIll <= 3000L && (this.lllIiIiIll == iillIIilIIilIIil.lllIllIIil || this.lllIiIiIll == iillIIilIIilIIil.IllIllIIil)) {
               this.lIIIiIiIll.IilliliilIIi();
               this.iiliiIIiii(iillIIilIIilIIil.lilIllIIil, IliIlllilIi<invokedynamic>());
            }
      }

   }

   private void iIlIiIllIi(long now) {
      this.lIIIiIiIll.IilliliilIIi();
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (!this.llIIiIiIll.Illlllllilll()) {
         if (!llIilllilIilll.IiIlliIliiIl(var3)) {
            if (this.IiIilIiIll.Iilllilliill() && llIilllilIilll.IIIllIIliIIl(var3, this.lIIIiIiIll)) {
               this.illIiIiIll = this.lllIiIiIll;
               this.llIIiIiIll.IliIlllilIi(this.IilIiIiIll);
               this.iiliiIIiii(iillIIilIIilIIil.IilIllIIil, IliIlllilIi<invokedynamic>());
            } else {
               this.lIiiiiIiii(IliIlllilIi<invokedynamic>() + this.iIlilIiIll.ilIilIIIil + IliIlllilIi<invokedynamic>());
            }
         }
      }
   }

   private void ilIllIiIll(class_2596<?> p) {
      if (p instanceof class_7439 var2) {
         if (var2.comp_763() != null) {
            this.IIllllIlll(var2.comp_763().getString());
         }
      } else if (p instanceof class_5894 var3) {
         if (var3.comp_2279() != null) {
            this.IIllllIlll(var3.comp_2279().getString());
         }
      } else if (p instanceof class_5904 var4) {
         if (var4.comp_2281() != null) {
            this.IIllllIlll(var4.comp_2281().getString());
         }
      } else if (p instanceof class_5903 var5) {
         if (var5.comp_2280() != null) {
            this.IIllllIlll(var5.comp_2280().getString());
         }
      } else if (p instanceof class_8143 var6) {
         if (this.iIiilIiIll.size() < ((-1032359252 >>> 13 | -1032359252 << 19) ^ -1788472325)) {
            this.iIiilIiIll.offer(new int[]{var6.comp_1267(), var6.comp_1269()});
         }
      } else {
         this.IIiilIiIll.iliIiiliiiii(p, IIIiillllIIiilll.IliIlllilIi());
      }

   }

   private String liIiiiiIii() {
      String var1 = this.IIliilIlii(iIliiIiIll);
      return var1 != null ? var1 : this.IIliilIlii(IlliiIiIll);
   }

   private static boolean Iiililiili(class_1799 s) {
      return s != null && !s.method_7960() && s.method_58694(class_9334.field_50075) != null && !s.method_31574(class_1802.field_8233) && !s.method_31574(class_1802.field_8511) && !s.method_31574(class_1802.field_8680) && !s.method_31574(class_1802.field_8635) && !s.method_31574(class_1802.field_8323) && !s.method_31574(class_1802.field_8766) && !s.method_31574(class_1802.field_8463) && !s.method_31574(class_1802.field_8367);
   }

   private void iiIilIIlil(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (!this.liIliIiIll) {
         this.liIliIiIll = true;
         this.iliilIiIll.clear();
         this.IiiilIiIll.clear();
         ArrayList var4 = new ArrayList();
         ObjectIterator var5 = this.IIiilIiIll.iIlIlllllill().long2ByteEntrySet().iterator();

         while(var5.hasNext()) {
            Long2ByteMap.Entry var6 = (Long2ByteMap.Entry)var5.next();
            if (!this.lliilIiIll.contains(var6.getLongKey())) {
               var4.add(class_2338.method_10092(var6.getLongKey()));
            }
         }

         class_243 var12 = var3.method_33571();
         var4.sort((b, a) -> Double.compare(var12.method_1025(class_243.method_24953(b)), var12.method_1025(class_243.method_24953(a))));

         for(int var13 = 0; var13 < var4.size() && var13 < 48; ++var13) {
            this.IiiilIiIll.add((class_2338)var4.get(var13));
         }
      }

      long var11 = System.nanoTime();
      lliIiIililiIiIil var14 = illIIiIlIilIIiIl.iIlIlllllill(this.IIIIiIiIll);
      int var7 = this.IIIIiIiIll.Iiilliiliiil().method_10264();

      while(!this.IiiilIiIll.isEmpty() && System.nanoTime() - var11 < 2000000L) {
         class_2338 var8 = (class_2338)this.IiiilIiIll.remove(0);
         class_2680 var9 = Iiiilllliiilll.field_1687.method_8320(var8);
         if (!var9.method_27852(class_2246.field_23152)) {
            this.IIiilIiIll.lIiiIiIlilli(var8);
         } else {
            iIiIIIlIliIIIl var10 = this.lIliliIlil(var8, var9, var14, var7);
            if (!var10.IliIlllilIi()) {
               this.lliilIiIll.add(var8.method_10063());
               this.iIlilIiIll.liiiIIllIl(var10.Iiilliiliiil().iIlIlllllill());
            } else {
               this.iliilIiIll.add(var10);
            }
         }
      }

      if (this.IiiilIiIll.isEmpty()) {
         List var15 = iIiIIIlIliIIIl.iliIiiliiiii(this.iliilIiIll);
         if (var15.isEmpty()) {
            this.IilIililIi(now, IliIlllilIi<invokedynamic>());
         } else {
            this.Illillllil(now, (iIiIIIlIliIIIl)var15.get(0));
         }
      }
   }

   private double IiIilliIil() {
      if (this.IilIiIiIll - this.lIiliIiIll >= (3668119918329753636L ^ 3668119918329753633L)) {
         this.lIiliIiIll = this.IilIiIiIll;
         this.iIiliIiIll = this.IIiilIiIll.Illlllllilll(Iiiilllliiilll.field_1687, Iiiilllliiilll.field_1724.method_31477() >> 4, Iiiilllliiilll.field_1724.method_31479() >> 4);
      }

      return this.iIiliIiIll;
   }

   private void Iliiilliii(iiiliiIIIiii kind, String msg) {
      if (kind != iiiliiIIIiii.lIlIIIiIliIlIIIiIl && msg != null) {
         if (kind == iiiliiIIIiii.lilIIIiIliilIIIiIl || !msg.equals(this.IIliiIiIll) || this.IilIiIiIll - this.lIliiIiIll >= (63307782084226157L ^ 63307782084226613L)) {
            this.IIliiIiIll = msg;
            this.lIliiIiIll = this.IilIiIiIll;
            String var3 = this.iiIilIiIll.Iilllilliill();
            if (!var3.equals(IliIlllilIi<invokedynamic>()) || kind == iiiliiIIIiii.lilIIIiIliilIIIiIl) {
               if (!var3.equals(IliIlllilIi<invokedynamic>()) && IliiliIllliiliIl.iiiIlIIIll()) {
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), msg, kind == iiiliiIIIiii.IllIIIiIllllIIIiIl);
               } else {
                  if (Iiiilllliiilll.field_1724 != null) {
                     Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + msg), false);
                  }

               }
            }
         }
      }
   }

   private String IIliilIlii(List<Class<? extends ilIllIiIll>> list) {
      for(Class var3 : list) {
         ilIllIiIll var4 = llilIllililIll.iliIiiliiiii(var3);
         if (var4 != null && var4 != this && var4.IliIlllilIi()) {
            return var4.IilliliilIIi();
         }
      }

      return null;
   }

   private void IliIilliIi(long now) {
      long var10 = -7184159711781664821L;
      class_746 var3 = Iiiilllliiilll.field_1724;
      class_243 var4 = var3.method_73189();
      class_243 var5 = this.liiIiIiIll;
      this.liiIiIiIll = var4;
      if (this.IiiIiIiIll != null && now <= this.lIIliIiIll) {
         var10 ^= ((long)(Iiiilllliiilll.field_1687 != this.iiiIiIiIll ? 1 : 0) << 32 ^ var10) & -1L << 32;
         double var7 = (int)(var10 >>> 32) != 0 ? Double.longBitsToDouble(2638783640768182955L ^ 6588440513972107947L) : (var5 == null ? (double)0.0F : var4.method_1022(var5));
         var10 ^= ((long)(IIIiillllIIiilll.iIlIlllllill() >= this.IIIliIiIll ? 1 : 0) ^ var10) & -1L >>> 32;
         if ((int)(var10 >>> 32) != 0 || var7 > Double.longBitsToDouble(1978845259605064982L ^ 6568013279895600406L) && (int)var10 != 0) {
            if ((int)var10 != 0) {
               this.IililIiIll.IilliliilIIi(IIIiillllIIiilll.iIlIlllllill());
            }

            this.iIIliIiIll = (int)(var10 >>> 32) != 0 ? 3761565465274372093L ^ -3155963562366709763L : IIIiillllIIiilll.iIlIlllllill();
            this.iliIiIiiIi(now, var7);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] - 10114))))) << 13 | (char)(~((char)(~((char)(var4[var5] - 10114))))) >>> 3) - var5) + 18486) - '雕') >>> 15 | (char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] - 10114))))) << 13 | (char)(~((char)(~((char)(var4[var5] - 10114))))) >>> 3) - var5) + 18486) - '雕') << 1))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iilllIIill(long act, boolean now) {
      switch (this.lllIiIiIll) {
         case ilIIllIIil:
            this.Ilillllill(act, now);
            break;
         case IiIIllIIil:
         case liIIllIIil:
            this.liilliiill(act);
            break;
         case iiIIllIIil:
            this.IIIillIIil(act, now);
            break;
         case IIlIllIIil:
            this.iIIilIlIil(act);
            break;
         case lIlIllIIil:
            this.llIililIil(act);
            break;
         case iIlIllIIil:
            this.iiIilIIlil(act);
            break;
         case IllIllIIil:
            this.iIiilIliil(act, now);
            break;
         case lllIllIIil:
            this.ilIIiIiIIi(act, now);
            break;
         case illIllIIil:
            this.liIIiiiIIi(act);
            break;
         case IilIllIIil:
            this.lllIiillIi(act, now);
            break;
         case lilIllIIil:
            this.IiIliIiIll = true;
            this.IilIililIi(act, IliIlllilIi<invokedynamic>());
            break;
         case iilIllIIil:
            this.iiliiIIiii(this.IllilIiIll.liiiIIllIl() ? iillIIilIIilIIil.IiIIllIIil : iillIIilIIilIIil.ilIIllIIil, IliIlllilIi<invokedynamic>());
            break;
         case IIiIllIIil:
            this.iiliiIIiii(this.illIiIiIll, IliIlllilIi<invokedynamic>());
            break;
         case lIiIllIIil:
            this.lIiiiiIiii(this.IIiIiIiIll.isBlank() ? IliIlllilIi<invokedynamic>() : this.IIiIiIiIll);
      }

   }

   public String IlIllllIll() {
      long var1 = IIIiillllIIiilll.IliIlllilIi();
      return this.iIlilIiIll.IIlllIlliIll(this.lllIiIiIll.name(), this.IllilIiIll.IIIllIIliIIl(var1), this.ililiIiIll, this.IIiIiIiIll);
   }

   private void Illlilllli(long now) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      this.lIIIiIiIll.IilliliilIIi();
      if (this.llIIiIiIll.lIiiIiIlilli()) {
         this.llIIiIiIll.iliIiiliiiii();
      }

      this.IIIIiIiIll.lIiiIiIlilli(128);
      this.iIIiiIiIll = false;
      if (this.lllIiIiIll != iillIIilIIilIIil.iilIllIIil && this.lllIiIiIll != iillIIilIIilIIil.IiIIllIIil && this.lllIiIiIll != iillIIilIIilIIil.liIIllIIil) {
         this.iiliiIIiii(iillIIilIIilIIil.iilIllIIil, IliIlllilIi<invokedynamic>() + this.ililiIiIll);
      }

      IiiIlillliiIlill var4 = this.illilIiIll.iliIiiliiiii();
      if (var4 == null) {
         var4 = this.illilIiIll.IIIllIIliIIl(this.IilIiIiIll);
      }

      double var5 = var4 == null ? Double.MAX_VALUE : var4.lIiiIiIlilli();
      if (!this.lliliIiIll && var4 != null) {
         var5 = Math.hypot(var4.liiiIIllIl() - var3.method_23317(), var4.IilliliilIIi() - var3.method_23321());
      }

      if (this.IllilIiIll.IIlllIlliIll(now)) {
         this.lllilIiIll.lIiiIiIlilli(this.iliIiIiIll);
         if (this.IllilIiIll.IIIilIIiiIIi(now)) {
            this.lIiiiiIiii(IliIlllilIi<invokedynamic>());
            return;
         }
      }

      boolean var7 = this.IllilIiIll.iIlIlllllill(now) || this.IllilIiIll.lIiiIiIlilli(now);
      iIillilIlillil var8 = IilIIlIllilIIlIl.IliIlllilIi(new liiiIiiiiiIi(true, var7, this.IllilIiIll.liiiIIllIl(), this.IlIliIiIll, var5, this.IllilIiIll.IIIllIIliIIl(now), this.IlIilIiIll.Iilllilliill(), this.lIIiiIiIll < 0L ? -1L : now - this.lIIiiIiIll));
      switch (var8) {
         case IililIIlilililIIli:
            this.ilillIiill(now);
            if (this.IliIiIiIll.lIiiIiIlilli() && !this.IlIliIiIll) {
               this.illliIilli(this.IIIiiIiIll);
            }
            break;
         case IliilIIlilliilIIli:
            ++this.iIlilIiIll.IllilIIIil;
            this.Iiliililii(IliIlllilIi<invokedynamic>());
            break;
         case lIiilIIliiIiilIIli:
            this.IIIIiIiIll.IiIlliIliiIl(var3.method_36454(), var3.method_36455(), 0);
            break;
         case iililIIliIIiilIIli:
            if (this.IliIiIiIll.lIiiIiIlilli()) {
               this.illliIilli(this.IIIiiIiIll);
            }
      }

   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6366463792273347083L ^ Long.rotateLeft(1270948295300277689L, 9) ^ 2949986062534208085L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3699109588231757701L ^ Long.rotateLeft(6079455339620085500L, 38) ^ 9166383860397299833L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4303266035506455631L ^ Long.rotateLeft(1605901112627999695L, 11) ^ -717932072283639807L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1697178462946265617L ^ Long.rotateLeft(5151958877975919897L, 34) ^ -3729076445668715630L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5923890950541702250L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7237193910641801520L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 735516662958026237L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6708317876758625639L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1840881954974099068L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4504526503043588756L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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

   private void Ilillllill(long now, boolean act) {
      if (!this.IllilIiIll.iIlIlllllill(now)) {
         this.iiliiIIiii(iillIIilIIilIIil.iiIIllIIil, IliIlllilIi<invokedynamic>());
      } else if (act || this.IliIiIiIll.IliIlllilIi() == IiIIilllliIIilll.IIiIIIlill) {
         this.ilillIiill(now);
      }
   }

   private void llIililIil(long now) {
      double var3 = this.IiIilliIil();
      boolean var5 = now - this.IIiilIiIll.liiiIIllIl() >= 1000L;
      if (var3 >= 0.95 && var5 || now - this.iilIiIiIll > 6000L) {
         if (this.IIiilIiIll.IilliliilIIi() == 0) {
            ++this.iIlilIiIll.IIlilIIIil;
            this.IilIililIi(now, IliIlllilIi<invokedynamic>());
            return;
         }

         this.liIliIiIll = false;
         this.iiliiIIiii(iillIIilIIilIIil.iIlIllIIil, this.IIiilIiIll.IilliliilIIi() + IliIlllilIi<invokedynamic>());
      }

   }

   private void iliiiIiiii(long now) {
      liIIiilliiIIiill var3;
      if (!this.IliliIiIll && !this.lliliIiIll) {
         if (this.lllIiIiIll == iillIIilIIilIIil.IIiIllIIil) {
            var3 = liIIiilliiIIiill.lIlIiliill;
         } else if (this.lllIiIiIll != iillIIilIIilIIil.iiIIllIIil && this.lllIiIiIll != iillIIilIIilIIil.llIIllIIil) {
            var3 = liIIiilliiIIiill.IIlIiliill;
         } else {
            var3 = liIIiilliiIIiill.iiIIiliill;
         }
      } else {
         var3 = liIIiilliiIIiill.iIlIiliill;
      }

      String var4 = this.lllIiIiIll.iIiIllIIil;
      if (this.lllIiIiIll == iillIIilIIilIIil.IIiIllIIil && this.IliIiIiIll != null) {
         var4 = this.IliIiIiIll.liiiIIllIl().iliIliIlll;
      } else if (this.IliliIiIll) {
         var4 = this.IllilIiIll.liiiIIllIl() ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + (this.IllilIiIll.IIIllIIliIIl(now) + 999L) / 1000L + IliIlllilIi<invokedynamic>();
      } else if (this.IIlIiIiIll) {
         var4 = IliIlllilIi<invokedynamic>();
      } else if (this.IiIIiIiIll != null && this.IiIIiIiIll.iliIiiliiiii() && this.lllIiIiIll == iillIIilIIilIIil.IllIllIIil) {
         var4 = IliIlllilIi<invokedynamic>();
      } else if (this.iIIIiIiIll != null && this.iIIIiIiIll.iliIiiliiiii()) {
         var4 = IliIlllilIi<invokedynamic>();
      } else if (this.lllIiIiIll != iillIIilIIilIIil.lllIllIIil && this.lllIiIiIll != iillIIilIIilIIil.IllIllIIil) {
         if (this.lllIiIiIll == iillIIilIIilIIil.iiIIllIIil) {
            var4 = IliIlllilIi<invokedynamic>() + (this.IllilIiIll.IIIllIIliIIl(now) + 999L) / 1000L + IliIlllilIi<invokedynamic>();
         }
      } else {
         int var5 = Math.max(0, this.iliilIiIll.size());
         var4 = this.lllIiIiIll.iIiIllIIil + (var5 > 0 ? IliIlllilIi<invokedynamic>() + var5 + IliIlllilIi<invokedynamic>() : "");
      }

      String var6 = null;
      if (this.IIlliIiIll != null && Iiiilllliiilll.field_1724 != null) {
         var6 = (int)Math.round(Math.sqrt(Iiiilllliiilll.field_1724.method_5707(class_243.method_24953(this.IIlliIiIll)))) + IliIlllilIi<invokedynamic>();
      }

      this.iiIiiIiIll = new IlillIIillillIIi(var3, var4, var6, this.iIlilIiIll.ilIilIIIil, 0, this.iIlilIiIll.IiIlliIliiIl());
   }

   private boolean IIiillIiil() {
      class_2680 var1 = Iiiilllliiilll.field_1687.method_8320(this.IIlliIiIll);
      if (!var1.method_27852(class_2246.field_23152)) {
         return false;
      } else {
         lliIllliliIlll var2 = IiIliillliIliill.iIlIlllllill(this.iililIiIll, this.IIlliIiIll.method_10263(), this.IIlliIiIll.method_10264(), this.IIlliIiIll.method_10260(), illIIiIlIilIIiIl.iIlIlllllill(this.IIIIiIiIll));
         Iiiililiiili var3 = iliIilIlIiiIilIl.IliIlllilIi(this.iililIiIll, this.IIlliIiIll.method_10263(), this.IIlliIiIll.method_10264(), this.IIlliIiIll.method_10260(), this.IIIIiIiIll.Iiilliiliiil().method_10264(), var2, this.llIilIiIll.Iilllilliill(), this.IiIliIiIll);
         this.liiilIiIll.clear();
         if (!var3.liiiIIllIl()) {
            this.IIiIiIiIll = var3.iIlIlllllill();
            return false;
         } else {
            for(Ilililllilil var5 : var2.iIlIlllllill(this.llIilIiIll.Iilllilliill())) {
               this.liiilIiIll.add(class_2338.method_10064(var5.IliIlllilIi(), var5.liiiIIllIl(), var5.iIlIlllllill()));
            }

            return !this.liiilIiIll.isEmpty();
         }
      }
   }

   public iillIIilIIilIIil liiiiiiiii() {
      return this.lllIiIiIll;
   }

   private void iIiilIliil(long act, boolean now) {
      class_746 var4 = Iiiilllliiilll.field_1724;
      if (this.IIlliIiIll == null) {
         this.iiliiIIiii(iillIIilIIilIIil.iIlIllIIil, IliIlllilIi<invokedynamic>());
      } else if (!Iiiilllliiilll.field_1687.method_8320(this.IIlliIiIll).method_27852(class_2246.field_23152)) {
         this.IIiilIiIll.lIiiIiIlilli(this.IIlliIiIll);
         this.lililiilil();
         this.liIliIiIll = false;
         this.iiliiIIiii(iillIIilIIilIIil.iIlIllIIil, IliIlllilIi<invokedynamic>());
      } else if (!llIilllilIilll.IiIlliIliiIl(var4)) {
         this.iIlIiIllIi(act);
      } else if (IIIilIlllIIilIll.IilliliilIIi(this.iIIIiIiIll.liiiIIllIl(), this.iIIIiIiIll.iIlIlllllill(), act - this.lIlliIiIll)) {
         this.illilIilil(act, IliIlllilIi<invokedynamic>());
      } else {
         double var5 = IIIilIlllIIilIll.iIlIlllllill(var4.method_23317(), var4.method_23321(), this.IIlliIiIll.method_10263(), this.IIlliIiIll.method_10260());
         if (!this.iiIIiIiIll && var5 <= (double)28.0F) {
            this.iiIIiIiIll = true;
         } else if (this.iiIIiIiIll && var5 > (double)38.0F) {
            this.iiIIiIiIll = false;
         }

         if (this.IliIiIiIll.lIiiIiIlilli()) {
            if (!this.Iiiilliiil(act, now)) {
               if (!this.iiIIiIiIll) {
                  class_2338 var9 = this.IIlliIiIll;
                  liIIIilliiIIIill var8 = this.iIIIiIiIll.Iilllilliill(this.IilIiIiIll, IliIlllilIi<invokedynamic>() + var9.method_10063(), (c) -> IIIilIlllIIilIll.iIlIlllllill((double)c.method_10263() + Double.longBitsToDouble(-6053487925727798685L ^ -7773862983383328157L), (double)c.method_10260() + Double.longBitsToDouble(-3741557190745461900L ^ -868260628483085452L), var9.method_10263(), var9.method_10260()) <= Double.longBitsToDouble(-4445019614458151431L ^ -9049950233444483591L), var9, var9, false);
                  if (var8 == liIIIilliiIIIill.lllilllill) {
                     this.iiIIiIiIll = true;
                  }

               } else if ((this.liiilIiIll.isEmpty() || (this.IilIiIiIll - this.lilIiIiIll) % 100L == 0L) && !this.IIiillIiil()) {
                  this.illilIilil(act, this.IIiIiIiIll.isBlank() ? IliIlllilIi<invokedynamic>() : this.IIiIiIiIll);
               } else if (now) {
                  liIIIilliiIIIill var7 = this.iIIIiIiIll.Iilllilliill(this.IilIiIiIll, IliIlllilIi<invokedynamic>() + this.IIlliIiIll.method_10063(), (c) -> this.liiilIiIll.contains(c.method_10063()) && !this.ilIiiIiIll.contains(c.method_10063()), this.IIlliIiIll, this.IIlliIiIll, this.llIilIiIll.Iilllilliill());
                  if (this.iIIIiIiIll.lIiiIiIlilli()) {
                     this.lliIiIiIll = true;
                  }

                  if (var7 == liIIIilliiIIIill.lllilllill) {
                     this.illliIiIll = this.IilIiIiIll;
                     this.IilliIiIll = llIilllilIilll.Iiiiliiiiiii(var4, class_1802.field_23141);
                     this.IllliIiIll = false;
                     this.iiliiIIiii(iillIIilIIilIIil.lllIllIIil, IliIlllilIi<invokedynamic>());
                  }

               }
            }
         }
      }
   }

   private void lililiilil() {
      this.iiIliIiIll = null;
      this.IIlliIiIll = null;
      this.iiIIiIiIll = false;
      this.liiilIiIll.clear();
      this.IllliIiIll = false;
      this.lllliIiIll = 0;
   }
}
