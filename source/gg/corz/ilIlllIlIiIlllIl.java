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
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1661;
import net.minecraft.class_1713;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_746;

public final class ilIlllIlIiIlllIl {
   private lIIIlliIIIll IilIiiIiIl;
   public static final int IlIIiiIiIl = 60;
   private long IIiIiiIiIl;
   private final IiIIiIIlliIIiIIl IllIiiIiIl;
   public static final double IliiliIiIl = (double)45.0F;
   public static final double iiIIiiIiIl = (double)6.0F;
   private String IiiIiiIiIl;
   private final IIiIIlilIiIIli iIlIiiIiIl;
   public static final double lIiiliIiIl = (double)2.0F;
   private long IliIiiIiIl;
   private long iilIiiIiIl;
   public static final double iililiIiIl = (double)42.0F;
   private class_243 lIiIiiIiIl;
   private class_243 iIiIiiIiIl;
   public static final int ilIIiiIiIl = 3;
   public static final float IiiiliIiIl = 0.75F;
   public static final double lililiIiIl = (double)10.0F;
   public static final String IIlIiiIiIl = "anchor-hunter";
   private boolean iliIiiIiIl;
   public static final double lliiliIiIl = 0.003;
   public static final double IililiIiIl = (double)18.0F;
   public static final int iiiiliIiIl = 90;
   public static final int liIIiiIiIl = 100;
   public static final int llIIiiIiIl = 6;
   public static final double IIiiliIiIl = (double)34.0F;
   private int lliIiiIiIl;
   private long lilIiiIiIl;
   public static final int liiiliIiIl = 12;
   public static final float iliiliIiIl = 12.0F;
   private final class_310 lIlIiiIiIl = class_310.method_1551();
   public static final int iIIIiiIiIl = 20;
   public static final int IiIIiiIiIl = 3;
   public static final int IIIIiiIiIl = 30;
   private iiiiilllIIIIIill illIiiIiIl;
   public static final int lIIIiiIiIl = 40;
   public static final double iIiiliIiIl = (double)-55.0F;
   private final Object lllIiiIiIl;

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3931178747219408044L ^ Long.rotateLeft(-7899539093299261452L, 49) ^ -6641815540440870816L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7245468047665817915L ^ Long.rotateLeft(4023189290282313700L, 39) ^ -6580970538799761361L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3976146114381420126L ^ Long.rotateLeft(-6485319591825443601L, 62) ^ 356516941218216462L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2200449333739692663L ^ Long.rotateLeft(-5772392046042745337L, 59) ^ 8465450513962462284L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8388483835857832937L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5559362835879766149L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1679313420400101249L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2637250079403624146L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5951023627891795868L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2142440709890752464L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIIIlIlIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, llIIlilIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIIlliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, iiIIlIIlIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lIlIliIlIl<invokedynamic>());
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

   public iiiiilllIIIIIill liiiIIllIl() {
      return this.illIiiIiIl;
   }

   static int Iilililiiili(class_1661 inv) {
      for(int var1 = 8; var1 >= 0; --var1) {
         if (!IIiIiIillIiIiIil.IIlllIlliIll(inv.method_5438(var1)) && var1 != inv.method_67532()) {
            return var1;
         }
      }

      return -1;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) << 7 | (char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) >>> 9)) - '柳'))))))) << 14 | (char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) << 7 | (char)((char)(-var4[var5]) << 12 | (char)(-var4[var5]) >>> 4) >>> 9)) - '柳'))))))) >>> 2))))) ^ '骮') - 9545) ^ 24408))) + 15370) ^ 15354));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Illlllllilll(long tick) {
      class_746 var3 = this.lIlIiiIiIl.field_1724;
      this.illIiiIiIl = iiiiilllIIIIIill.lilllllill;
      this.iilIiiIiIl = tick;
      this.lIiIiiIiIl = var3 == null ? class_243.field_1353 : var3.method_73189();
      ++this.lliIiiIiIl;
      this.IiiIiiIiIl = IIIIllIIIl<invokedynamic>();
   }

   public ilIlllIlIiIlllIl(IIiIIlilIiIIli owner, IiIIiIIlliIIiIIl cells, Object body) {
      this.illIiiIiIl = iiiiilllIIIIIill.illllllill;
      this.IiiIiiIiIl = "";
      this.iIlIiiIiIl = owner;
      this.IllIiiIiIl = cells;
      this.lllIiiIiIl = body;
   }

   public boolean IiIlliIliiIl(class_746 p) {
      if (p != null && IIIllIIliIIl(p) && IlIlllIlilIl(p)) {
         if (p.method_24828() && !p.method_5799() && !p.method_6115() && !p.method_5715()) {
            if (p.method_7357().method_7904(new class_1799(class_1802.field_8634))) {
               return false;
            } else {
               return IIlilIliiIli(p.method_31548()) >= 0;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 4315) ^ 'ꉑ') + '\uebb7') ^ '뚞') + 29538) ^ 30307))) << 6 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 4315) ^ 'ꉑ') + '\uebb7') ^ '뚞') + 29538) ^ 30307))) >>> 10) + '襡'))) ^ var5))) + '뇒'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IlliIiilllliIiil IIillIiliIil(long tick, class_746 p) {
      if (tick - this.lilIiiIiIl > 40L) {
         this.Iilllilliill(tick, IIIIllIIIl<invokedynamic>());
         return IlliIiilllliIiil.llIiIIilil;
      } else if (!this.IiIlliIliiIl(p)) {
         this.Iilllilliill(tick, IIIIllIIIl<invokedynamic>());
         return IlliIiilllliIiil.llIiIIilil;
      } else {
         this.iIlIiiIiIl.IiIlliIliiIl(this.IilIiiIiIl.IliIlllilIi(), this.IilIiiIiIl.liiiIIllIl(), 2);
         class_1661 var4 = p.method_31548();
         int var5 = Illillliilli(var4);
         if (var5 < 0) {
            if (!this.IIiilIiiiIii(p, var4)) {
               this.iIiIiiIiIl = p.method_73189();
               this.IliIiiIiIl = tick;
               this.Iilllilliill(tick, IIIIllIIIl<invokedynamic>());
            }

            return IlliIiilllliIiil.ilIiIIilil;
         } else {
            this.iIlIiiIiIl.Ililllililil(var5);
            if (!this.iIlIiiIiIl.IIillIiliIil(var5)) {
               return IlliIiilllliIiil.ilIiIIilil;
            } else if (!(Math.abs(p.method_23317() - p.field_6014) > 0.003) && !(Math.abs(p.method_23321() - p.field_5969) > 0.003)) {
               if (!(Math.abs(class_3532.method_15393(this.IilIiiIiIl.IliIlllilIi() - p.method_36454())) > 0.75F) && !(Math.abs(this.IilIiiIiIl.liiiIIllIl() - p.method_36455()) > 0.75F)) {
                  lIililiIilil var6 = this.IlIillIiilIi(p, p.method_36454(), p.method_36455(), true);
                  if (var6 != null && var6.IIilIIiilIilIIii < 0 && var6.iIIlIIiiIlIlIIii && var6.IiIlIIiiliIlIIii != null && IIiiIIillIiiIIil.liiiIIllIl(var6.IiIlIIiiliIlIIii, this.IilIiiIiIl.iIlIlllllill(), (double)2.0F) && this.IIIilIIiiIIi(var6.IiIlIIiiliIlIIii) != null) {
                     return IlliIiilllliIiil.IiIiIIilil;
                  } else {
                     this.Iilllilliill(tick, IIIIllIIIl<invokedynamic>());
                     return IlliIiilllliIiil.llIiIIilil;
                  }
               } else {
                  return IlliIiilllliIiil.ilIiIIilil;
               }
            } else {
               return IlliIiilllliIiil.ilIiIIilil;
            }
         }
      }
   }

   public int IilliliilIIi() {
      return this.lliIiiIiIl;
   }

   public lIIIlliIIIll iIlIlllllill() {
      return this.IilIiiIiIl;
   }

   private List<class_2338> Iiilliiliiil(class_243 range, class_2338 me, double anchor) {
      ArrayList var5 = new ArrayList();
      if (!(anchor < (double)10.0F) && this.lIlIiiIiIl.field_1687 != null) {
         double var6 = (double)me.method_10263() + (double)0.5F - range.field_1352;
         double var8 = (double)me.method_10260() + (double)0.5F - range.field_1350;
         double var10 = Math.hypot(var6, var8);
         if (var10 < 0.001) {
            return var5;
         } else {
            int var12 = class_3532.method_15357(range.field_1352 + var6 / var10 * anchor);
            int var13 = class_3532.method_15357(range.field_1350 + var8 / var10 * anchor);
            ArrayList var14 = new ArrayList();

            for(int var15 = -3; var15 <= 3; ++var15) {
               for(int var16 = -3; var16 <= 3; ++var16) {
                  if (var15 * var15 + var16 * var16 <= 9) {
                     var14.add(new int[]{var15, var16});
                  }
               }
            }

            var14.sort((b, a) -> Integer.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]));

            for(int[] var19 : var14) {
               if (var5.size() >= 3) {
                  break;
               }

               class_2338 var17 = illIIiIlIilIIiIl.liiiIIllIl(this.IllIiiIiIl, this.lIlIiiIiIl.field_1687, var12 + var19[0], var13 + var19[1]);
               if (var17 != null) {
                  var5.add(var17);
               }
            }

            return var5;
         }
      } else {
         return var5;
      }
   }

   private lIIIlliIIIll Ililllililil(long p, class_746 tick, class_2338 goals, List<class_2338> anchor) {
      class_243 var6 = tick.method_73189();
      double var7 = IiIiliIiiiIi(var6, goals);
      if (var7 < (double)18.0F) {
         return null;
      } else {
         ArrayList var9 = new ArrayList();
         if (var7 <= (double)42.0F) {
            for(class_2338 var11 : anchor) {
               if (var9.size() >= 3) {
                  break;
               }

               if (var11 != null && IiIiliIiiiIi(var6, var11) <= (double)42.0F) {
                  var9.add(var11);
               }
            }
         }

         if (var9.isEmpty()) {
            var9.addAll(this.Iiilliiliiil(var6, goals, Math.min((double)34.0F, var7 - (double)10.0F)));
         }

         if (var9.isEmpty()) {
            return null;
         } else {
            class_243 var26 = liIiililiiIiilil.Illlllllilll(tick);
            double[] var27 = new double[]{(double)0.0F, (double)0.0F, (double)0.0F};
            lIIIlliIIIll var12 = null;
            double var13 = Double.NEGATIVE_INFINITY;

            for(class_2338 var16 : var9) {
               class_243 var17 = class_243.method_24955(var16);
               float var18 = liIiililiiIiilil.IiIlliIliiIl(var26, var17, (double)1.5F, 0.03);
               iIiIiilIliIiil var19 = Iiiiilliiiil.IIillIiliIil(var26, var27, var17, 90, (double)2.0F, p, IIIIllIIIl<invokedynamic>(), (double)-55.0F, (double)45.0F, var18);
               if (var19 != null && var19.iIlIlllllill() != null) {
                  class_2338 var20 = this.IIIilIIiiIIi(var19.iIlIlllllill());
                  if (var20 != null) {
                     double var21 = var7 - IiIiliIiiiIi(class_243.method_24955(var20), goals);
                     if (!(var21 < (double)10.0F)) {
                        lIililiIilil var23 = this.IlIillIiilIi(tick, var19.IliIlllilIi(), var19.liiiIIllIl(), true);
                        if (var23 != null && var23.IIilIIiilIilIIii < 0 && var23.IiIlIIiiliIlIIii != null && IIiiIIillIiiIIil.liiiIIllIl(var23.IiIlIIiiliIlIIii, var19.iIlIlllllill(), (double)2.0F)) {
                           double var24 = var21 - 0.05 * (double)var19.IilliliilIIi();
                           if (var24 > var13) {
                              var13 = var24;
                              var12 = new lIIIlliIIIll(var19.IliIlllilIi(), var19.liiiIIllIl(), var19.iIlIlllllill(), var20, var19.IilliliilIIi(), List.copyOf(var23.liiIIIiiiiiIIIii));
                           }
                        }
                     }
                  }
               }
            }

            return var12;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) << 5 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) >>> 11))) + 2388) << 14 | (char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) << 5 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) >>> 11))) + 2388) >>> 2))) ^ var5) - var5) ^ var5) - var5) - '슩') >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) << 5 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) >>> 11))) + 2388) << 14 | (char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) << 5 | (char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) + var5) >>> 11))) + 2388) >>> 2))) ^ var5) - var5) ^ var5) - var5) - '슩') << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIililiIilil IlIillIiilIi(class_746 pitch, float p, float yaw, boolean entities) {
      double var5 = pitch.method_23317() - pitch.field_6014;
      double var7 = pitch.method_23321() - pitch.field_5969;
      double var9 = pitch.method_24828() ? (double)0.0F : pitch.method_23318() - pitch.field_6036;
      double[] var11 = Iilllilillli.IliIlllilIi(p, yaw, var5, var9, var7);
      return liIiililiiIiilil.lIiiIiIlilli(liIiililiiIiilil.Illlllllilll(pitch), new class_243(var11[0], var11[1], var11[2]), false, 0, (class_1297)null, pitch, entities, (~2032010046 >>> 11 | ~2032010046 << 21) ^ -1741628169);
   }

   class_2338 IIIilIIiiIIi(class_243 landing) {
      long var5 = -20251991570180881L;
      class_2338 var2 = class_2338.method_49637(landing.field_1352, landing.field_1351 + Double.longBitsToDouble(-2360745848568103470L ^ -2253901213060781655L), landing.field_1350);
      if (lIilIiliIilIil.liiiIIllIl(this.IllIiiIiIl.IliIlllilIi(var2.method_10263(), var2.method_10264(), var2.method_10260()), 1)) {
         var2 = var2.method_10084();
      }

      var5 ^= ((long)IiIliillliIliill.iliIiiliiiii(this.IllIiiIiIl, var2.method_10263(), var2.method_10264(), var2.method_10260(), 4) << 32 ^ var5) & -1L << 32;
      if ((int)(var5 >>> 32) > (~1342094906 - -77 ^ -1342094831)) {
         return null;
      } else {
         class_2338 var4 = var2.method_10087((int)(var5 >>> 32));
         return illIIiIlIilIIiIl.IliIlllilIi(this.IllIiiIiIl, var4.method_10263(), var4.method_10264(), var4.method_10260()) ? var4 : null;
      }
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) << 2 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) >>> 14) - var5) + 'ꉷ') + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) << 2 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) >>> 14) - var5) + 'ꉷ') + var5) << 13) + var5) + 15962) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) << 2 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) >>> 14) - var5) + 'ꉷ') + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) << 2 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) << 3 | (char)((char)((char)(~((char)(var4[var5] + 18268))) ^ 11015) - 17672) >>> 13) - 16912) >>> 14) - var5) + 'ꉷ') + var5) << 13) + var5) + 15962) >>> 9) ^ 702));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int Illillliilli(class_1661 inv) {
      for(int var1 = 0; var1 <= 8; ++var1) {
         if (inv.method_5438(var1).method_31574(class_1802.field_8634)) {
            return var1;
         }
      }

      return -1;
   }

   private boolean IIiilIiiiIii(class_746 p, class_1661 inv) {
      if (!this.iliIiiIiIl && !lIlIiIliIlIiIl.Illlllllilll()) {
         if (p.field_7512 != p.field_7498) {
            return false;
         } else {
            for(int var3 = 9; var3 <= 35; ++var3) {
               if (inv.method_5438(var3).method_31574(class_1802.field_8634)) {
                  int var4 = IIiIiIillIiIiIil.IIIilIIiiIIi(inv);
                  if (IIiIiIillIiIiIil.IIlllIlliIll(inv.method_5438(var4))) {
                     var4 = Iilililiiili(inv);
                  }

                  if (var4 < 0) {
                     return false;
                  }

                  if (!lIlillliIlilll.IliIlllilIi(this.lllIiiIiIl)) {
                     return true;
                  }

                  lIlIiIliIlIiIl.iIlIlllllill(() -> {
                     class_746 var3x = this.lIlIiiIiIl.field_1724;
                     if (var3x != null && this.lIlIiiIiIl.field_1761 != null && var3x.field_7512 == var3x.field_7498) {
                        if (var3x.method_31548().method_5438(var3).method_31574(class_1802.field_8634)) {
                           if (!IIiIiIillIiIiIil.IIlllIlliIll(var3x.method_31548().method_5438(var4))) {
                              this.lIlIiiIiIl.field_1761.method_2906(var3x.field_7498.field_7763, iiilIiIiIIIiIiIi.IliIlllilIi(var3), iiilIiIiIIIiIiIi.iIlIlllllill(var4), class_1713.field_7791, var3x);
                           }
                        }
                     }
                  }, true);
                  this.iliIiiIiIl = true;
                  return true;
               }
            }

            return false;
         }
      } else {
         return true;
      }
   }

   static int IIlilIliiIli(class_1661 inv) {
      for(int var1 = 0; var1 <= 35; ++var1) {
         if (inv.method_5438(var1).method_31574(class_1802.field_8634)) {
            return var1;
         }
      }

      return -1;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(var4[var5] >>> 5 | var4[var5] << 11))) - var5))) - var5) ^ var5) + var5) ^ var5) - var5) ^ 13314) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IlIlllIlilIl(class_746 p) {
      return p != null && p.method_6032() + p.method_6067() >= 12.0F;
   }

   private static double IiIiliIiiiIi(class_243 b, class_2338 a) {
      return Math.hypot((double)a.method_10263() + Double.longBitsToDouble(7942812573631124357L ^ 5898178342804919173L) - b.field_1352, (double)a.method_10260() + Double.longBitsToDouble(-3385721272631706144L ^ -1233000650748609056L) - b.field_1350);
   }

   public static boolean IIIllIIliIIl(class_746 p) {
      return p != null && p.method_6096() >= ((-2016630221 * -587345955 ^ 65) * -59 ^ 1530857170);
   }

   public String lIiiIiIlilli() {
      return this.IiiIiiIiIl;
   }

   public void IliIlllilIi() {
      this.illIiiIiIl = iiiiilllIIIIIill.illllllill;
      this.IilIiiIiIl = null;
      this.lliIiiIiIl = 0;
      this.IIiIiiIiIl = 297319266984411741L ^ -2008523742229282211L;
      this.iIiIiiIiIl = null;
      this.iliIiiIiIl = false;
      this.IiiIiiIiIl = "";
   }

   public void Iilllilliill(long reason, String tick) {
      if (this.illIiiIiIl != iiiiilllIIIIIill.lilllllill) {
         this.illIiiIiIl = iiiiilllIIIIIill.illllllill;
         this.IIiIiiIiIl = reason + (1937563887295396556L ^ 1937563887295396592L);
         this.IiiIiiIiIl = tick;
      }
   }

   public boolean iliIiiliiiii() {
      return this.illIiiIiIl != iiiiilllIIIIIill.illllllill;
   }

   public IlliIiilllliIiil IIlllIlliIll(long goals, class_2338 anchor, Supplier<List<class_2338>> tick) {
      class_746 var5 = this.lIlIiiIiIl.field_1724;
      if (var5 != null && this.lIlIiiIiIl.field_1687 != null) {
         if (this.iliIiiIiIl && !lIlIiIliIlIiIl.Illlllllilll()) {
            this.iliIiiIiIl = false;
         }

         if (anchor == null && this.illIiiIiIl != iiiiilllIIIIIill.lilllllill) {
            if (this.illIiiIiIl == iiiiilllIIIIIill.Iilllllill) {
               this.Iilllilliill(goals, IIIIllIIIl<invokedynamic>());
            }

            return IlliIiilllliIiil.llIiIIilil;
         } else {
            switch (this.illIiiIiIl.ordinal()) {
               case 1:
                  return this.IIillIiliIil(goals, var5);
               case 2:
                  if (!(var5.method_73189().method_1022(this.lIiIiiIiIl) > (double)3.0F) && goals - this.iilIiiIiIl <= (long)(this.IilIiiIiIl.lIiiIiIlilli() + 30)) {
                     return IlliIiilllliIiil.ilIiIIilil;
                  }

                  this.illIiiIiIl = iiiiilllIIIIIill.illllllill;
                  this.IIiIiiIiIl = goals + 20L;
                  return IlliIiilllliIiil.llIiIIilil;
               default:
                  if (goals >= this.IIiIiiIiIl && this.lliIiiIiIl < 6 && this.IiIlliIliiIl(var5)) {
                     if (this.iIiIiiIiIl != null && var5.method_73189().method_1022(this.iIiIiiIiIl) < (double)6.0F && goals - this.IliIiiIiIl < 100L) {
                        return IlliIiilllliIiil.llIiIIilil;
                     } else {
                        this.IIiIiiIiIl = goals + 20L;
                        lIIIlliIIIll var6 = this.Ililllililil(goals, var5, anchor, tick == null ? List.of() : (List)tick.get());
                        if (var6 == null) {
                           this.iIiIiiIiIl = var5.method_73189();
                           this.IliIiiIiIl = goals;
                           return IlliIiilllliIiil.llIiIIilil;
                        } else {
                           this.iIiIiiIiIl = null;
                           this.IilIiiIiIl = var6;
                           this.illIiiIiIl = iiiiilllIIIIIill.Iilllllill;
                           this.lilIiiIiIl = goals;
                           this.IiiIiiIiIl = IIIIllIIIl<invokedynamic>();
                           return this.IIillIiliIil(goals, var5);
                        }
                     }
                  } else {
                     return IlliIiilllliIiil.llIiIIilil;
                  }
            }
         }
      } else {
         return IlliIiilllliIiil.llIiIIilil;
      }
   }
}
