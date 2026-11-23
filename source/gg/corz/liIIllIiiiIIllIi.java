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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2663;
import net.minecraft.class_4184;
import net.minecraft.class_4588;
import org.joml.Matrix4f;

public class liIIllIiiiIIllIi extends ilIllIiIll {
   private final IIIIlilllIIIlill ilIlilIIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.1, 0.04, 0.3, 0.01);
   private final iiIiiilIIliiil iIIlilIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final Map<Integer, Integer> lIllilIIIi = new HashMap();
   private static final double[] illlilIIIi = new double[10];
   private final iilliIlIIiliIl IlIlilIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 14, 4, 40, 1);
   private static final int llllilIIIi = 9;
   private final List<liIililiiIilil> IIllilIIIi = new ArrayList();
   private static final double[] IillilIIIi = new double[10];
   private final iiIiiilIIliiil lIIlilIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int liIlilIIIi = -12130194;
   private long IlllilIIIi = 0L;
   private final iiIiiilIIliiil IIIlilIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IiIlilIIIi = -403876;
   private final iiIiiilIIliiil iiiIilIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final Queue<class_2663> iIllilIIIi = new ConcurrentLinkedQueue();
   private final IIIIlilllIIIlill llIlilIIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.8, 0.3, (double)2.0F, 0.1);
   private static final int iiIlilIIIi = 700;

   public void IiIIlliIIl(IliIliIllliIliIl event) {
      if (this.IIIlilIIIi.Iilllilliill()) {
         class_2596 var3 = event.iilIIiiIll;
         if (var3 instanceof class_2663) {
            class_2663 var2 = (class_2663)var3;
            if (var2.method_11470() == (((-1767502637 << 13 | -1767502637 >>> 19) * -373475417 >>> 1 | (-1767502637 << 13 | -1767502637 >>> 19) * -373475417 << 31) * -1527099483 ^ 1250636893)) {
               this.iIllilIIIi.add(var2);
            }
         }

      }
   }

   public void Iilililiiili() {
      this.IIllilIIIi.clear();
      this.lIllilIIIi.clear();
      this.iIllilIIIi.clear();
      this.IlllilIIIi = 0L;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + 'ꦏ') << 1 | (char)(var4[var5] + 'ꦏ') >>> 15) + var5) + 1458))) + var5) + 2502) - var5) - 'ꁊ') + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int ilIllIiIll(int t, float rgb) {
      long var5 = -196866116719642868L;
      long var7 = 4522427808205970782L;
      var5 ^= ((long)(t >> (-(~(1856857617 ^ 113)) ^ 1856857713) & (((586487728 >>> 19 | 586487728 << 13) << 9 | (586487728 >>> 19 | 586487728 << 13) >>> 23) ^ -334971462)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)(t >> ((--633764291 << 29 | --633764291 >>> 3) ^ -7 ^ -1689833271) & (~157184256 * -121 ^ 1839425926)) ^ var5) & -1L >>> 32;
      var7 ^= ((long)(t & ((-(-266215530 << 3 | -266215530 >>> 29) + 99 >>> 11 | -(-266215530 << 3 | -266215530 >>> 29) + 99 << 21) ^ 1972362975)) << 32 ^ var7) & -1L << 32;
      var5 ^= ((long)Math.round((float)((int)(var5 >>> 32)) + (float)(((357835973 + 99 >>> 29 | 357835973 + 99 << 3) ^ -1432278593) - (int)(var5 >>> 32)) * rgb) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)Math.round((float)((int)var5) + (float)(((-1543885693 + -47) * -799063683 ^ 1234500091) - (int)var5) * rgb) ^ var5) & -1L >>> 32;
      var7 ^= ((long)Math.round((float)((int)(var7 >>> 32)) + (float)((((817537721 ^ 53) - 83) * 19 * -2083697005 ^ 1972427038) - (int)(var7 >>> 32)) * rgb) << 32 ^ var7) & -1L << 32;
      return (int)(var5 >>> 32) << ((465692976 - 37 ^ 41) * -1762037865 + -21 ^ 562577641) | (int)var5 << (((1596092372 << 3 | 1596092372 >>> 29) << 11 | (1596092372 << 3 | 1596092372 >>> 29) >>> 21) - -87 ^ -1678436329) | (int)(var7 >>> 32);
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         class_2663 var1;
         while((var1 = (class_2663)this.iIllilIIIi.poll()) != null) {
            if (this.IIIlilIIIi.Iilllilliill()) {
               try {
                  class_1297 var2 = var1.method_11469(Iiiilllliiilll.field_1687);
                  if (var2 != null) {
                     this.lIIlliIIll(var2.method_23317(), var2.method_23318() + (double)var2.method_17682() * 0.6, var2.method_23321(), this.IlIlilIIIi.Iilllilliill() * 2, true);
                  }
               } catch (Throwable var12) {
               }
            }
         }

         HashSet var13 = new HashSet();
         if (this.iiiIilIIIi.Iilllilliill()) {
            double var3 = (double)1024.0F;

            for(class_1297 var6 : Iiiilllliiilll.field_1687.method_18112()) {
               if (var6 instanceof class_1309) {
                  class_1309 var7 = (class_1309)var6;
                  if (var6 != Iiiilllliiilll.field_1724) {
                     int var8 = var6.method_5628();
                     var13.add(var8);
                     int var9 = var7.field_6235;
                     Integer var10 = (Integer)this.lIllilIIIi.put(var8, var9);
                     int var11 = var10 == null ? 0 : var10;
                     if (var9 == var7.field_6254 && var11 != var7.field_6254 && var6.method_5858(Iiiilllliiilll.field_1724) < var3) {
                        this.lIIlliIIll(var6.method_23317(), var6.method_23318() + (double)var6.method_17682() * (double)0.5F, var6.method_23321(), this.IlIlilIIIi.Iilllilliill(), false);
                     }
                  }
               }
            }
         }

         this.lIllilIIIi.keySet().retainAll(var13);
      }
   }

   private void IlIllllIll(class_4588 py, Matrix4f camPos, class_243 m, double pz, double coreArgb, double vc, float s, int px) {
      double var12 = m.field_1352 - pz;
      double var14 = m.field_1351 - coreArgb;
      double var16 = m.field_1350 - vc;
      double var18 = Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
      if (!(var18 < 1.0E-4)) {
         var12 /= var18;
         var14 /= var18;
         var16 /= var18;
         double var20 = var16;
         double var22 = -var12;
         double var24 = Math.sqrt(var16 * var16 + var22 * var22);
         if (var24 < 1.0E-4) {
            var20 = (double)1.0F;
            var22 = (double)0.0F;
            var24 = (double)1.0F;
         }

         var20 /= var24;
         var22 /= var24;
         double var26 = (double)0.0F;
         double var28 = var14 * var22 - var16 * var26;
         double var30 = var16 * var20 - var12 * var22;
         double var32 = var12 * var26 - var14 * var20;
         float var34 = (float)pz;
         float var35 = (float)coreArgb;
         float var36 = (float)vc;
         int var37 = -16777216;
         float var38 = 0.0F;
         float var39 = 0.0F;
         float var40 = 0.0F;

         for(int var41 = 0; var41 <= 9; ++var41) {
            double var42 = illlilIIIi[var41];
            double var44 = IillilIIIi[var41];
            float var46 = (float)((var20 * var42 + var28 * var44) * (double)s);
            float var47 = (float)((var26 * var42 + var30 * var44) * (double)s);
            float var48 = (float)((var22 * var42 + var32 * var44) * (double)s);
            float var49 = var34 + var46;
            float var50 = var35 + var47;
            float var51 = var36 + var48;
            if (var41 > 0) {
               iIiiIIilIliiIIil.IiIlliIliiIl(py, camPos, var34, var35, var36, px, var38, var39, var40, -16777216, var49, var50, var51, -16777216);
            }

            var38 = var49;
            var39 = var50;
            var40 = var51;
         }

      }
   }

   public boolean iiiIlIIIll() {
      return this.IliIlllilIi() && this.iiiIilIIIi.Iilllilliill() && this.lIIlilIIIi.Iilllilliill();
   }

   private static int IIllllIlll(int v) {
      return v < 0 ? 0 : Math.min(v, (((-715734514 << 13 | -715734514 >>> 19) << 21 | (-715734514 << 13 | -715734514 >>> 19) >>> 11) * -1556147571 << 21 | ((-715734514 << 13 | -715734514 >>> 19) << 21 | (-715734514 << 13 | -715734514 >>> 19) >>> 11) * -1556147571 >>> 11) ^ -807393430);
   }

   public liIIllIiiiIIllIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iiiIilIIIi, this.IIIlilIIIi, this.lIIlilIIIi, this.iIIlilIIIi, this.IlIlilIIIi, this.llIlilIIIi, this.ilIlilIIIi});
   }

   static {
      for(int var0 = 0; var0 <= 9; ++var0) {
         double var1 = (Math.PI * 2D) * (double)var0 / (double)9.0F;
         illlilIIIi[var0] = Math.cos(var1);
         IillilIIIi[var0] = Math.sin(var1);
      }

   }

   public void IIiilIiiiIii(illlllIillll event) {
      if (!this.IIllilIIIi.isEmpty() && Iiiilllliiilll.field_1687 != null) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         if (var2 != null) {
            class_243 var3 = var2.method_71156();
            long var4 = System.nanoTime();
            float var6 = this.IlllilIIIi == 0L ? 0.0F : (float)Math.min(0.1, (double)(var4 - this.IlllilIIIi) / (double)1.0E9F);
            this.IlllilIIIi = var4;
            event.IliiiIIilliiiIIi.method_22903();
            event.IliiiIIilliiiIIi.method_22904(-var3.field_1352, -var3.field_1351, -var3.field_1350);
            Matrix4f var7 = event.IliiiIIilliiiIIi.method_23760().method_23761();
            class_4588 var8 = this.iIIlilIIIi.Iilllilliill() ? iIiiIIilIliiIIil.iliIiiliiiii() : iIiiIIilIliiIIil.IIIllIIliIIl();
            float var9 = (float)Math.exp(-1.8 * (double)var6);
            Iterator var10 = this.IIllilIIIi.iterator();

            while(var10.hasNext()) {
               liIililiiIilil var11 = (liIililiiIilil)var10.next();
               if (var6 > 0.0F) {
                  var11.llllllIliilllllIli *= (double)var9;
                  var11.iillllIliIIilllIli *= (double)var9;
                  var11.IillllIlilillllIli = var11.IillllIlilillllIli * (double)var9 - (double)(7.0F * var6);
                  var11.liIlllIliiiIlllIli += var11.llllllIliilllllIli * (double)var6;
                  var11.IIllllIlilIllllIli += var11.IillllIlilillllIli * (double)var6;
                  var11.iIllllIliIlllllIli += var11.iillllIliIIilllIli * (double)var6;
                  var11.lIilllIliiIilllIli += var6;
               }

               if (var11.lIilllIliiIilllIli >= var11.IlilllIlillilllIli) {
                  var10.remove();
               } else {
                  float var12 = var11.lIilllIliiIilllIli / var11.IlilllIlillilllIli;
                  float var13 = 1.0F - var12;
                  var13 *= var13;
                  if (!(var13 <= 0.012F)) {
                     int var14 = liIlliiIll(ilIllIiIll(var11.ililllIliIiilllIli, 0.35F), var13);
                     float var15 = var11.liilllIliiiilllIli * (0.6F + 0.4F * (1.0F - var12));
                     this.IlIllllIll(var8, var7, var3, var11.liIlllIliiiIlllIli, var11.IIllllIlilIllllIli, var11.iIllllIliIlllllIli, var15, var14);
                  }
               }
            }

            event.IliiiIIilliiiIIi.method_22909();
         }
      }
   }

   private static int liIlliiIll(int rgb, float f) {
      long var5 = -1782137612708500878L;
      long var7 = -3839806775064521835L;
      var5 ^= ((long)IIllllIlll(Math.round((float)(rgb >> ((--1624929018 ^ -7) * -2014922929 ^ 974498045) & ((~(1522886725 * -75) + 35) * 49 ^ 266329590)) * f)) << 32 ^ var5) & -1L << 32;
      var5 ^= ((long)IIllllIlll(Math.round((float)(rgb >> ((-116061100 * -5 >>> 29 | -116061100 * -5 << 3) ^ 347476713) & (~(41374087 * 286331153) ^ -2001559561)) * f)) ^ var5) & -1L >>> 32;
      var7 ^= ((long)IIllllIlll(Math.round((float)(rgb & (((2119715139 ^ 119) >>> 29 | (2119715139 ^ 119) << 3) ^ -222148260)) * f)) << 32 ^ var7) & -1L << 32;
      return (-1930534000 >>> 23 | -1930534000 << 9) * -73 * 858993459 ^ -1691871635 | (int)(var5 >>> 32) << (-((-1844463333 >>> 7 | -1844463333 << 25) + -51) ^ -925114159) | (int)var5 << (~(1983950643 + 69) ^ -1983950705) | (int)(var7 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(var4[var5] - var5))))) >>> 15 | (char)(~((char)(-((char)(var4[var5] - var5))))) << 1) - '화') - 347))) + var5) + '\ueb50'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) >>> 9) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) >>> 9) >>> 12) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) >>> 9) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') << 10 | (char)((char)((char)((char)(var4[var5] ^ '邓') - var5) << 11 | (char)((char)(var4[var5] ^ '邓') - var5) >>> 5) ^ '齅') >>> 6)) + var5) >>> 9) >>> 9) >>> 12) << 15) - 25751))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll(double z, double y, double x, int totem, boolean count) {
      ThreadLocalRandom var9 = ThreadLocalRandom.current();
      int var10 = -16777216 | IlIIilIlllIIilIl.lliiIlliIl & 16777215;

      for(int var11 = 0; var11 < totem && this.IIllilIIIi.size() < 700; ++var11) {
         liIililiiIilil var12 = new liIililiiIilil();
         var12.liIlllIliiiIlllIli = z;
         var12.IIllllIlilIllllIli = y;
         var12.iIllllIliIlllllIli = x;
         double var13 = var9.nextDouble() * Math.PI * (double)2.0F;
         double var15 = (double)2.0F * var9.nextDouble() - (double)1.0F;
         double var17 = Math.sqrt(Math.max((double)0.0F, (double)1.0F - var15 * var15));
         double var19 = var17 * Math.cos(var13);
         double var21 = var17 * Math.sin(var13);
         if (count) {
            var15 = Math.abs(var15) * 0.6 + (double)0.5F;
         }

         double var23 = count ? 2.2 + var9.nextDouble() * 3.2 : 2.8 + var9.nextDouble() * 2.6;
         var12.llllllIliilllllIli = var19 * var23;
         var12.IillllIlilillllIli = var15 * var23 + (count ? 1.6 : (double)0.0F);
         var12.iillllIliIIilllIli = var21 * var23;
         var12.lIilllIliiIilllIli = 0.0F;
         var12.IlilllIlillilllIli = (float)this.llIlilIIIi.Iilllilliill() * (count ? 1.25F : 1.0F) * (0.75F + var9.nextFloat() * 0.5F);
         var12.liilllIliiiilllIli = (float)this.ilIlilIIIi.Iilllilliill() * (0.7F + var9.nextFloat() * 0.6F);
         if (count) {
            var12.ililllIliIiilllIli = var9.nextFloat() < 0.3F ? -12130194 : -403876;
         } else {
            var12.ililllIliIiilllIli = var9.nextFloat() < 0.4F ? -1 : var10;
         }

         this.IIllilIIIi.add(var12);
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14))) + var5) + 5104) << 11 | (char)((char)((char)(-((char)((char)(-((char)(var4[var5] - var5))) << 2 | (char)(-((char)(var4[var5] - var5))) >>> 14))) + var5) + 5104) >>> 5) ^ var5) ^ 7841) ^ var5) - var5) + '뫭'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 9 | (char)(-((char)(var4[var5] ^ var5))) >>> 7) - var5) + '\ue602') + '텊') << 5 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 9 | (char)(-((char)(var4[var5] ^ var5))) >>> 7) - var5) + '\ue602') + '텊') >>> 11)))))))) >>> 12 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 9 | (char)(-((char)(var4[var5] ^ var5))) >>> 7) - var5) + '\ue602') + '텊') << 5 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 9 | (char)(-((char)(var4[var5] ^ var5))) >>> 7) - var5) + '\ue602') + '텊') >>> 11)))))))) << 4) ^ '\ue2f6') + var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1566559092877264769L ^ Long.rotateLeft(2915108180146146204L, 23) ^ 8236027980343343230L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5361734682834245788L ^ Long.rotateLeft(-4434890908273421211L, 18) ^ 5431711733803656773L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8748484404127077529L ^ Long.rotateLeft(2729792687181538648L, 43) ^ -8995124552859626514L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4151203334655502218L ^ Long.rotateLeft(2983894912317662901L, 7) ^ 6190943082923404807L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3422310927680319457L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4397201241299402837L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4366541216977743225L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -978107017726717897L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8368209547143176059L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8407803529168805501L;
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
}
