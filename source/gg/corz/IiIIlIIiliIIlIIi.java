package gg.corz;

import com.corz.client.mixins.AccessorEntityS2CPacket;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10182;
import net.minecraft.class_10264;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2664;
import net.minecraft.class_2678;
import net.minecraft.class_2684;
import net.minecraft.class_2709;
import net.minecraft.class_2716;
import net.minecraft.class_2724;
import net.minecraft.class_2743;
import net.minecraft.class_2777;
import net.minecraft.class_2824;
import net.minecraft.class_3532;
import net.minecraft.class_4588;
import net.minecraft.class_8038;
import org.joml.Matrix4f;

public class IiIIlIIiliIIlIIi extends ilIllIiIll implements lIlliiIlli {
   private static final float llllllliil = 1.5F;
   private static final lilllliiilllli illlllliil;
   private long iIIillliil;
   private float iiIillliil;
   private final Iiiliillliiliill Iillllliil = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)50.0F, (double)100.0F, (double)0.0F, (double)500.0F, (double)5.0F);
   private volatile lIiIIIlliIiIIIll lIilllliil;
   private volatile long llilllliil;
   private int iiilllliil = -1;
   private float IIlillliil;
   private static final long iIllllliil = 1500L;
   private final AtomicReference<lIIlIlIiiIIlIlIi> IIilllliil = new AtomicReference();
   private final IiIllliliIllli liilllliil = new IiIllliliIllli();
   private long lIIillliil;
   private int IIIillliil = -1;
   private final iliiliilIiiiliil iillllliil = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1678083689);
   private class_243 IiIillliil;
   private static final int Illlllliil = 3;
   private class_243 llIillliil;
   private volatile boolean Iiilllliil;
   private static final double lIllllliil = (double)6.0F;
   private static final long IIllllliil = 3000L;
   private final iiIiiilIIliiil lillllliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private volatile long iIilllliil;
   private int liIillliil;
   private long IlIillliil = Long.MAX_VALUE;
   private class_243 ilIillliil;
   private volatile boolean ililllliil;
   private volatile class_2596<?> Ililllliil;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~var4[var5]) ^ var5) - '\ue62a') + var5))) ^ var5) - var5) ^ var5))))) + var5) + var5) - 10885))) + 1717) ^ '蔾') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll(IllliIlllllliIll q, class_2596<?> v, lIiIIIlliIiIIIll frame, long f) {
      int var6 = q.IllIIiilll.IIIllIIliIIl();
      if (v instanceof class_2684 var7) {
         if (var7.method_22826() && var7 instanceof AccessorEntityS2CPacket var14) {
            if (var14.corzGetEntityId() == var6) {
               q.IllIIiilll = q.IllIIiilll.IilliliilIIi((long)var7.method_36150(), (long)var7.method_36151(), (long)var7.method_36152(), f);
            }
         }
      } else if (v instanceof class_10264 var8) {
         if (var8.comp_3223() == var6) {
            q.IllIIiilll = q.IllIIiilll.lIiiIiIlilli(var8.comp_3224().comp_3148(), f);
         }
      } else if (v instanceof class_2777 var9) {
         if (var9.comp_3237() == var6) {
            q.IllIIiilll = q.IllIIiilll.iliIiiliiiii(ilIllIiIll(q.IllIIiilll.IiIlliIliiIl(), var9), f);
         }
      } else if (v instanceof class_2604 var10) {
         if (var10.method_11167() == var6) {
            q.IllIIiilll = q.IllIIiilll.lIiiIiIlilli(new class_243(var10.method_11175(), var10.method_11174(), var10.method_11176()), f);
         }
      } else if (v instanceof class_2716 var11) {
         if (var11.method_36548().contains(var6)) {
            q.illIIiilll = true;
         }
      } else if (v instanceof class_2743 var12) {
         if (var12.method_11818() == frame.liiiIIllIl()) {
            q.lllIIiilll = true;
         }
      } else if (v instanceof class_2664 var13) {
         if (var13.comp_2884().isPresent()) {
            q.lllIIiilll = true;
         }
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '렋') << 3 | (char)(var4[var5] + '렋') >>> 13))) ^ var5) + var5) - 749) + 5509) ^ 9610) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + '렋') << 3 | (char)(var4[var5] + '렋') >>> 13))) ^ var5) + var5) - 749) + 5509) ^ 9610) << 11) - var5))) ^ var5))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iiiIlIIIll(class_2596<?> queued, boolean packet, long nowMs) {
      if (queued != null && queued == this.Ililllliil) {
         this.Ililllliil = null;
         lIiIIIlliIiIIIll var5 = this.lIilllliil;
         if (var5 == null) {
            return 0L;
         } else {
            long var6 = lIiIlIiliIiIlIil.lIiiIiIlilli(var5.IlIlllIlilIl(), var5.IiIlliIliiIl(), ThreadLocalRandom.current().nextDouble());
            long var8 = lIiIlIiliIiIlIil.iliIiiliiiii(nowMs, var6, this.llilllliil);
            if (var8 <= nowMs) {
               return 0L;
            } else {
               this.llilllliil = var8;
               return var8;
            }
         }
      } else {
         return 0L;
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) << 2) - 6444) ^ '극') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) << 2) - 6444) ^ '극') << 1) ^ var5) - var5) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) << 2) - 6444) ^ '극') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) >>> 14 | (char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) - '팝') - '\ueea4') + 7287) << 4) << 2) - 6444) ^ '극') << 1) ^ var5) - var5) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIIillIIil(class_4588 by, Matrix4f cx, float dx, float bz, float m, float az, float vc, float cy, float argb, float dy, float bx, float dz, float cz, float ay, int ax) {
      by.method_22918(cx, dx, bz, m).method_39415(ax);
      by.method_22918(cx, az, vc, cy).method_39415(ax);
      by.method_22918(cx, argb, dy, bx).method_39415(ax);
      by.method_22918(cx, dz, cz, ay).method_39415(ax);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - var5) ^ var5))))))) + '큳') - var5) - var5) ^ var5) ^ var5) + 13065));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlllIllll(class_1309 target, long now) {
      if (this.IIIillliil != (((1647680687 >>> 9 | 1647680687 << 23) >>> 29 | (1647680687 >>> 9 | 1647680687 << 23) << 3) ^ 1115105677)) {
         this.Ilillllill();
      }

      this.IIIillliil = target.method_5628();
      this.iIIillliil = now;
      this.Iiilllliil = false;
      this.IlIillliil = -7627839306798055576L ^ -1595532730056720233L;
      this.IIilllliil.set(lIIlIlIiiIIlIlIi.IliIlllilIi(this.IIIillliil, this.iIilllliil));
   }

   protected void Iilililiiili() {
      this.Ilillllill();
      this.iiilllliil = -1;
      this.liilllliil.iIlIlllllill();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) >>> 12 | (char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) << 4) >>> 2 | (char)((char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) >>> 12 | (char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) << 4) << 14) ^ var5) + var5) + var5) - var5) - '阀') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) >>> 12 | (char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) << 4) >>> 2 | (char)((char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) >>> 12 | (char)((char)(-((char)((char)(var4[var5] - 'ꚭ') - '鋍'))) - var5) << 4) << 14) ^ var5) + var5) + var5) - var5) - '阀') >>> 6) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static double liIlliiIll(lIiIIIlliIiIIIll v, class_243 feet) {
      return lIlIlIIiiIlIlIIi.IliIlllilIi(v.iIlIlllllill(), v.IilliliilIIi(), v.lIiiIiIlilli(), feet.field_1352, feet.field_1351, feet.field_1350, v.iliIiiliiiii(), v.IIIllIIliIIl());
   }

   private static void liilliiill(Matrix4f argb, float y2, float x1, float y1, float m, float z2, float x2, int z1) {
      class_4588 var8 = iIiiIIilIliiIIil.lIiiIiIlilli();
      IIIillIIil(var8, argb, y2, x1, y1, m, x1, y1, m, x1, x2, y2, x1, x2, z1);
      IIIillIIil(var8, argb, y2, z2, y1, y2, z2, x2, m, z2, x2, m, z2, y1, z1);
      IIIillIIil(var8, argb, y2, x1, y1, y2, z2, y1, m, z2, y1, m, x1, y1, z1);
      IIIillIIil(var8, argb, y2, x1, x2, m, x1, x2, m, z2, x2, y2, z2, x2, z1);
      IIIillIIil(var8, argb, y2, x1, y1, y2, x1, x2, y2, z2, x2, y2, z2, y1, z1);
      IIIillIIil(var8, argb, m, x1, y1, m, z2, y1, m, z2, x2, m, x1, x2, z1);
   }

   private void IIllllIlll(int id, long now) {
      class_1297 var4 = Iiiilllliiilll.field_1687.method_8469(id);
      if (var4 instanceof class_1309 var5) {
         if (liiIIIlliiiIIIll.IliIlllilIi(var5, illlllliil)) {
            if (liiIIIlliiiIIIll.IIIllIIliIIl(var5) > Double.longBitsToDouble(2277903112541754593L ^ 6882833731528086753L)) {
               return;
            }

            if (id != this.IIIillliil) {
               this.iIlllIllll(var5, now);
            }

            this.lIIillliil = now;
            return;
         }
      }

   }

   private static int iIIilIlIil(int argb) {
      long var5 = 2780524173275814099L;
      long var7 = 4408720565603332477L;
      var5 ^= ((long)(argb >>> ((-1190640775 - 37) * 35 ^ -73 ^ -1277244461)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)((int)((float)(argb >> (-(~-791801938) ^ -791801921) & ((614894227 - -65 ^ -119) + 101 ^ -614894275)) * 0.49F)) ^ var5) & -1L >>> 32;
      var7 ^= ((long)((int)((float)(argb >> (~(~-9234099 - -33) ^ -9234140) & (((-1242096595 ^ -13) << 29 | (-1242096595 ^ -13) >>> 3) ^ -918479740)) * 0.49F)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)((int)((float)(argb & ((-659476590 - -63 + 53) * 1431655765 ^ -1211830527)) * 0.49F)) ^ var7) & -1L >>> 32;
      return (int)(var5 >>> 32) << ((-(117436323 >>> 19 | 117436323 << 13) * 941362695 >>> 25 | -(117436323 >>> 19 | 117436323 << 13) * 941362695 << 7) ^ 1351873456) | (int)var5 << (~(((-943229910 << 1 | -943229910 >>> 31) >>> 23 | (-943229910 << 1 | -943229910 >>> 31) << 9) + -45) ^ -500214499) | (int)(var7 >>> 32) << (332479371 - -107 + 11 ^ -51 ^ -332479548) | (int)var7;
   }

   private void ilillIiill() {
      this.IIIillliil = -1;
      this.lIilllliil = null;
      this.IIilllliil.set((Object)null);
      this.Ililllliil = null;
      this.llilllliil = 0L;
      this.Iiilllliil = false;
      this.llIillliil = null;
      this.ilIillliil = null;
      this.IiIillliil = null;
      this.liIillliil = 0;
   }

   private static class_243 ilIllIiIll(class_243 current, class_2777 teleport) {
      long var5 = -3230873007426598511L;
      Set var2 = teleport.comp_3239();
      var5 ^= ((long)(!var2.contains(class_2709.field_12400) && !var2.contains(class_2709.field_12398) && !var2.contains(class_2709.field_12403) ? 0 : 1) << 32 ^ var5) & -1L << 32;
      if (current == null && (int)(var5 >>> 32) != 0) {
         return null;
      } else {
         class_10182 var4 = new class_10182(current != null ? current : class_243.field_1353, class_243.field_1353, 0.0F, 0.0F);
         return class_10182.method_63639(var4, teleport.comp_3238(), var2).comp_3148();
      }
   }

   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      class_2596 var2 = event.iilIIiiIll;
      if (!(var2 instanceof class_2678) && !(var2 instanceof class_2724)) {
         lIiIIIlliIiIIIll var3 = this.lIilllliil;
         if (var3 != null && IIIiillllIIiilll.iliIiiliiiii(var2, IiIIlIIiliIIlIIi::IlIllllIll)) {
            long var4 = this.iIilllliil;
            IllliIlllllliIll var6 = new IllliIlllllliIll();

            while(true) {
               lIIlIlIiiIIlIlIi var7 = (lIIlIlIiiIIlIlIi)this.IIilllliil.get();
               if (var7 != null && var7.IIIllIIliIIl() == var3.IliIlllilIi()) {
                  var6.IllIIiilll = var7;
                  var6.lllIIiilll = false;
                  var6.illIIiilll = false;
                  if (var2 instanceof class_8038) {
                     class_8038 var8 = (class_8038)var2;

                     for(class_2596 var10 : var8.method_48324()) {
                        this.lIIlliIIll(var6, var10, var3, var4);
                     }
                  } else {
                     this.lIIlliIIll(var6, var2, var3, var4);
                  }

                  if (var6.IllIIiilll != var7 && !this.IIilllliil.compareAndSet(var7, var6.IllIIiilll)) {
                     continue;
                  }

                  if (var6.illIIiilll) {
                     this.Iiilllliil = true;
                     this.Ililllliil = null;
                     this.lIilliIill();
                     return;
                  }

                  if (var6.lllIIiilll) {
                     this.Ililllliil = null;
                     this.lIilliIill();
                     return;
                  }

                  lIIlIlIiiIIlIlIi var13 = var6.IllIIiilll;
                  if (var13.liiiIIllIl() && var7.IiIlliIliiIl() != null && !var13.IiIlliIliiIl().equals(var7.IiIlliIliiIl())) {
                     double var14 = liIlliiIll(var3, var7.IiIlliIliiIl());
                     double var11 = liIlliiIll(var3, var13.IiIlliIliiIl());
                     if (var11 <= (double)6.0F && lIiIlIiliIiIlIil.IilliliilIIi(var14, var11)) {
                        this.Ililllliil = var2;
                        return;
                     }

                     this.Ililllliil = null;
                     this.lIilliIill();
                     return;
                  }

                  return;
               }

               return;
            }
         }
      } else {
         this.ililllliil = true;
         this.Ililllliil = null;
      }
   }

   static {
      illlllliil = lilllliiilllli.IIliIiIIIl.IilliliilIIi(true).iliIiiliiiii(true);
   }

   private void lllllillll(class_1309 target, boolean now, long holding) {
      long var9 = -1537042899716821963L;
      lIIlIlIiiIIlIlIi var5 = (lIIlIlIiiIIlIlIi)this.IIilllliil.get();
      if (var5 != null && var5.IIIllIIliIIl() == target.method_5628()) {
         var9 ^= ((long)lIiIlIiliIiIlIil.IIIllIIliIIl(now, this.IlIillliil, var5.IIlllIlliIll(), this.iIilllliil) << 32 ^ var9) & -1L << 32;
         if ((int)(var9 >>> 32) != 0 || !var5.liiiIIllIl() && holding - this.iIIillliil >= (454532386518959482L ^ 454532386518958246L)) {
            class_243 var7 = target.method_43389().method_60933();
            class_243 var8 = class_10182.method_63638(target).comp_3148();
            if (!var5.liiiIIllIl() || !var7.equals(var5.IlIlllIlilIl()) || !var8.equals(var5.IiIlliIliiIl())) {
               this.IIilllliil.compareAndSet(var5, var5.iIlIlllllill(var7, var8));
            }
         }
      }
   }

   private boolean Iillllilll() {
      long var2 = 5908274884863766373L;
      var2 ^= ((long)iillIlllIIilIlll.IliIlllilIi() << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) != 0) {
         this.IlIillliil = -8528250991057642797L ^ -695121045797133012L;
      } else if (this.IlIillliil == (8480239178387708020L ^ 743132858467067787L)) {
         this.IlIillliil = this.iIilllliil;
      }

      return (boolean)((int)(var2 >>> 32));
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!this.liilllliil.liiiIIllIl(Iiiilllliiilll.field_1687) || this.ililllliil) {
            this.ililllliil = false;
            this.liilllliil.IliIlllilIi(Iiiilllliiilll.field_1687);
            this.Ilillllill();
         }

         boolean var1 = this.Iillllilll();
         long var2 = IIIiillllIIiilll.IliIlllilIi();
         int var4 = this.iiilllliil;
         this.iiilllliil = -1;
         if (var4 != -1) {
            this.IIllllIlll(var4, var2);
         }

         if (this.IIIillliil != -1) {
            class_1297 var5 = Iiiilllliiilll.field_1687.method_8469(this.IIIillliil);
            if (!this.Iiilllliil && var5 instanceof class_1309) {
               class_1309 var6 = (class_1309)var5;
               if (liiIIIlliiiIIIll.IliIlllilIi(var6, illlllliil) && !Iiiilllliiilll.field_1724.method_29504() && var2 - this.lIIillliil <= 3000L) {
                  this.lllllillll(var6, var1, var2);
                  lIIlIlIiiIIlIlIi var7 = (lIIlIlIiiIIlIlIi)this.IIilllliil.get();
                  class_243 var8 = var7 != null && var7.IIIllIIliIIl() == this.IIIillliil && var7.liiiIIllIl() ? var7.IiIlliIliiIl() : null;
                  class_243 var9 = var8 != null ? var8 : var6.method_73189();
                  class_243 var10 = Iiiilllliiilll.field_1724.method_33571();
                  double var11 = (double)var6.method_17681() / (double)2.0F;
                  double var13 = (double)var6.method_17682();
                  if (lIlIlIIiiIlIlIIi.IliIlllilIi(var10.field_1352, var10.field_1351, var10.field_1350, var9.field_1352, var9.field_1351, var9.field_1350, var11, var13) > (double)6.0F) {
                     this.Ilillllill();
                     return;
                  }

                  this.iiIillliil = var6.method_17681();
                  this.IIlillliil = var6.method_17682();
                  this.lIilllliil = new lIiIIIlliIiIIIll(this.IIIillliil, Iiiilllliiilll.field_1724.method_5628(), var10.field_1352, var10.field_1351, var10.field_1350, var11, var13, this.Iillllliil.Iilllilliill(), this.Iillllliil.Ililllililil());
                  this.iilllIIill(var8);
                  return;
               }
            }

            this.Ilillllill();
         }
      }
   }

   private void Ilillllill() {
      this.ilillIiill();
      iillIlllIIilIlll.lIiiIiIlilli(this);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.method_18854()) {
         class_2596 var3 = event.lIiilIIIIi;
         if (var3 instanceof class_2824) {
            class_2824 var2 = (class_2824)var3;
            if (IIIliiIilIIliiIi.IliIlllilIi(var2)) {
               this.iiilllliil = IIIliiIilIIliiIi.liiiIIllIl(var2);
            }
         }

      }
   }

   protected void Illillliilli() {
      this.ilillIiill();
      this.iiilllliil = -1;
      this.ililllliil = false;
      this.IlIillliil = 551935651304748471L ^ 8671436385550027336L;
      this.liilllliil.IliIlllilIi(Iiiilllliiilll.field_1687);
   }

   private void iilllIIill(class_243 server) {
      if (server != null) {
         if (this.ilIillliil == null) {
            this.llIillliil = server;
            this.ilIillliil = server;
            this.IiIillliil = server;
            this.liIillliil = 0;
         } else {
            if (!server.equals(this.IiIillliil)) {
               this.IiIillliil = server;
               this.liIillliil = 3;
            }

            this.llIillliil = this.ilIillliil;
            if (this.liIillliil > 0) {
               this.ilIillliil = this.ilIillliil.method_1019(this.IiIillliil.method_1020(this.ilIillliil).method_1021((double)1.0F / (double)this.liIillliil));
               --this.liIillliil;
            }

         }
      }
   }

   public IiIIlIIiliIIlIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.Iillllliil, this.lillllliil, this.iillllliil});
   }

   private static boolean IlIllllIll(class_2596<?> q) {
      return q instanceof class_2684 || q instanceof class_10264 || q instanceof class_2777 || q instanceof class_2604 || q instanceof class_2716 || q instanceof class_2743 || q instanceof class_2664;
   }

   private void lIilliIill() {
      this.llilllliil = 0L;
      if (iillIlllIIilIlll.liiiIIllIl(this)) {
         iillIlllIIilIlll.lIiiIiIlilli(this);
      }

   }

   protected void IIiilIiiiIii(illlllIillll event) {
      this.Iillllilll();
      ++this.iIilllliil;
      if (this.lillllliil.Iilllilliill() && this.IIIillliil != -1 && this.ilIillliil != null && this.llIillliil != null) {
         float var2 = event.liiiiIIiiiiiiIIi;
         double var3 = class_3532.method_16436((double)var2, this.llIillliil.field_1352, this.ilIillliil.field_1352);
         double var5 = class_3532.method_16436((double)var2, this.llIillliil.field_1351, this.ilIillliil.field_1351);
         double var7 = class_3532.method_16436((double)var2, this.llIillliil.field_1350, this.ilIillliil.field_1350);
         float var9 = this.iiIillliil / 2.0F;
         if (!iIiiIIilIliiIIil.IlIillIiilIi(var3, var5 + (double)this.IIlillliil / (double)2.0F, var7, this.IIlillliil)) {
            Matrix4f var10 = iIiiIIilIliiIIil.IIillIiliIil();
            float var11 = iIiiIIilIliiIIil.Ililllililil(var3 - (double)var9);
            float var12 = iIiiIIilIliiIIil.Iiilliiliiil(var5 + 0.01);
            float var13 = iIiiIIilIliiIIil.IIIilIIiiIIi(var7 - (double)var9);
            float var14 = iIiiIIilIliiIIil.Ililllililil(var3 + (double)var9);
            float var15 = iIiiIIilIliiIIil.Iiilliiliiil(var5 + (double)this.IIlillliil);
            float var16 = iIiiIIilIliiIIil.IIIilIIiiIIi(var7 + (double)var9);
            int var17 = this.iillllliil.Iilllilliill();
            liilliiill(var10, var11, var12, var13, var14, var15, var16, var17);
            iIiiIIilIliiIIil.iIIIlIlIIl(var10, var11, var12, var13, var14, var15, var16, iIIilIlIil(var17), 1.5F);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1394205639595274131L ^ Long.rotateLeft(-6003098213338642079L, 39) ^ 4568689683654217849L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3391903526422309512L ^ Long.rotateLeft(9115745288085551569L, 24) ^ 2716820316669326293L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2532804835311513124L ^ Long.rotateLeft(6883916684342093914L, 60) ^ 409969693108092177L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7582387249864256889L ^ Long.rotateLeft(-5808305434939317583L, 44) ^ 1481091316608911616L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5894563615834339428L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6999636590990899676L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7579166435725570497L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7231961403420220839L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7714962052437361469L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1478060659329361940L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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
}
