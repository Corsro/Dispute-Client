package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1269;
import net.minecraft.class_1304;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1893;
import net.minecraft.class_310;
import net.minecraft.class_746;
import net.minecraft.class_1269.class_9861;

public final class illllliIilllli {
   public static final int IillIiIIIl = 50;
   private iIIIliIiIlIIliIi IlilIiIIIl;
   public static final int IIllIiIIIl = 20;
   private float lIIiIiIIIl = 85.0F;
   public static final int IiIlIiIIIl = 4;
   private static final class_1304[] iillIiIIIl;
   public static final double illlIiIIIl = (double)2.0F;
   private long IiilIiIIIl = Long.MIN_VALUE;
   private long iiilIiIIIl = Long.MIN_VALUE;
   private BooleanSupplier llilIiIIIl;
   private long IIIiIiIIIl = Long.MIN_VALUE;
   private final iilllIiIIillIi IIilIiIIIl;
   private final illillIlIilillIl lIilIiIIIl;
   public static final float lIllIiIIIl = 82.0F;
   private int liilIiIIIl;
   public static final float IlllIiIIIl = 75.0F;
   public static final int liIlIiIIIl = 32;
   public static final double llllIiIIIl = (double)8.0F;
   public static final int lillIiIIIl = 60;
   public static final int iiIlIiIIIl = 40;
   private boolean ililIiIIIl;
   public static final float iIllIiIIIl = 88.0F;
   private final lIlIiIIliIlIiIIl iIilIiIIIl;

   private void IlIlllIlilIl(long tick, boolean rest) {
      this.ililIiIIIl = false;
      this.liilIiIIIl = 0;
      this.IiilIiIIIl = Long.MIN_VALUE;
      if (rest) {
         this.IIIiIiIIIl = tick + 20L;
      }

   }

   static {
      iillIiIIIl = new class_1304[]{class_1304.field_6169, class_1304.field_6174, class_1304.field_6172, class_1304.field_6166};
   }

   public void lIiiIiIlilli() {
      if (this.ililIiIIIl) {
         this.IlIlllIlilIl(IIllIIlilIllIIli.IlIlllIlilIl(), false);
      }

   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') >>> 4 | (char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') << 12) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') >>> 4 | (char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') << 12) << 10) << 10 | (char)((char)((char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') >>> 4 | (char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') << 12) >>> 6 | (char)((char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') >>> 4 | (char)((char)((char)((char)(var4[var5] + 22275) + var5) + 12661) + '켟') << 12) << 10) >>> 6) ^ '\uf716') - '龣') ^ 10846) + 'ꪵ')))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   boolean IiIlliIliiIl(IIllIIllIllIIl s) {
      if (s.Iliilliiilii()) {
         return false;
      } else if (this.llilIiIIIl != null && this.llilIiIIIl.getAsBoolean()) {
         return true;
      } else if (s.IIiilIiiiIii() >= (double)12.0F) {
         return true;
      } else {
         IlillIllllillIll var2 = s.IlIlllIlilIl().illIlIilIl();
         return var2 != null && var2.liiiIIllIl() != iiIIiilIIlIiil.IliIliIlilliIliIli && var2.iIlIlllllill() == 0 && s.IIiilIiiiIii() >= (double)8.0F;
      }
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) << 1 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) >>> 15) >>> 2 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) << 1 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) >>> 15) << 14) ^ 1785) - '鵙') - var5) + var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) << 1 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) >>> 15) >>> 2 | (char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) << 1 | (char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 15 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 1) >>> 15) << 14) ^ 1785) - '鵙') - var5) + var5) << 5) + var5) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) << 4 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) >>> 12))))) << 11 | (char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) << 4 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) >>> 12))))) >>> 5) << 3 | (char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) << 4 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) >>> 12))))) << 11 | (char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) << 4 | (char)((char)(-((char)((char)((char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) >>> 7 | (char)((char)(-var4[var5]) >>> 4 | (char)(-var4[var5]) << 12) << 9) - 21053))) ^ var5) >>> 12))))) >>> 5) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(iIIIliIiIlIIliIi kit) {
      this.IlilIiIIIl = kit;
   }

   public void IIIllIIliIIl() {
      this.ililIiIIIl = false;
      this.IiilIiIIIl = Long.MIN_VALUE;
      this.liilIiIIIl = 0;
      this.iiilIiIIIl = Long.MIN_VALUE;
      this.IIIiIiIIIl = Long.MIN_VALUE;
   }

   public boolean IilliliilIIi() {
      long var11 = 6140742898359189094L;
      class_310 var1 = class_310.method_1551();
      class_746 var2 = var1.field_1724;
      if (var2 != null && var1.field_1761 != null) {
         long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (var3 < this.IIIiIiIIIl) {
            return false;
         } else {
            if (!this.ililIiIIIl) {
               this.ililIiIIIl = true;
               this.IiilIiIIIl = var3;
               this.liilIiIIIl = 0;
               this.lIIiIiIIIl = 82.0F + ThreadLocalRandom.current().nextFloat() * 6.0F;
            }

            if (this.liilIiIIIl < 32 && var3 - this.IiilIiIIIl < 40L) {
               var11 ^= ((long)this.iIilIiIIIl.IilliliilIIi((st) -> st.method_31574(class_1802.field_8287), false) << 32 ^ var11) & -1L << 32;
               if ((int)(var11 >>> 32) < 0) {
                  this.IlIlllIlilIl(var3, true);
                  return false;
               } else {
                  this.IIilIiIIIl.IIlllIlliIll(IiilIiIiliilIiIi.IiIllIiIIi, this.IIilIiIIIl.IilliliilIIi(), this.lIIiIiIIIl, IIIliIilIIliIi.illIIiliiIilIIilii, 50);
                  if (!this.iIilIiIIIl.lIiiIiIlilli((int)(var11 >>> 32), false)) {
                     return false;
                  } else if (this.iiilIiIIIl != Long.MIN_VALUE && var3 - this.iiilIiIIIl < 4L) {
                     return false;
                  } else if (this.IIilIiIIIl.lIiiIiIlilli() < 75.0F) {
                     return false;
                  } else if (this.lIilIiIIIl.iIlIlllllill() && this.lIilIiIIIl.IiIlliIliiIl()) {
                     class_1799 var6 = var2.method_31548().method_5438((int)(var11 >>> 32));
                     if (var6.method_31574(class_1802.field_8287) && !var2.method_7357().method_7904(var6)) {
                        class_1269 var7;
                        try (IlIIiiIillIIiiIi var8 = this.lIilIiIIIl.IIlllIlliIll()) {
                           var7 = var1.field_1761.method_2919(var2, class_1268.field_5808);
                        }

                        if (var7 instanceof class_1269.class_9860) {
                           class_1269.class_9860 var15 = (class_1269.class_9860)var7;
                           if (var15.comp_2909() == class_9861.field_52427) {
                              var2.method_6104(class_1268.field_5808);
                           }
                        }

                        this.iiilIiIIIl = var3;
                        ++this.liilIiIIIl;
                        return true;
                     } else {
                        return false;
                     }
                  } else {
                     return false;
                  }
               }
            } else {
               this.IlIlllIlilIl(var3, true);
               return false;
            }
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 20976) << 3 | (char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 20976) >>> 13))) - '鈨') >>> 4 | (char)((char)(~((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 20976) << 3 | (char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 20976) >>> 13))) - '鈨') << 12) + var5)))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static double IIlllIlliIll(class_746 p) {
      long var10 = -1857889264340676784L;
      double var1 = Double.NaN;
      class_1304[] var3 = iillIiIIIl;
      var10 ^= ((long)var3.length << 32 ^ var10) & -1L << 32;

      for(long var13 = var10 ^ (0L ^ var10) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
         class_1304 var6 = var3[(int)var13];
         class_1799 var7 = p.method_6118(var6);
         if (!var7.method_7960() && var7.method_7963() && lIlllIliIlllIl.lIiiIiIlilli(var7, class_1893.field_9101) > 0) {
            double var8 = iIliilIlIlliilIl.IilliliilIIi(var7);
            var1 = Double.isNaN(var1) ? var8 : Math.min(var1, var8);
         }
      }

      return var1;
   }

   public IilliIIllilliIIl iIlIlllllill(IIllIIllIllIIl s) {
      long var9 = 8415165457736236547L;
      class_310 var2 = class_310.method_1551();
      class_746 var3 = var2.field_1724;
      if (var3 != null && s != null && s.IlIlllIlilIl() != null) {
         long var4 = IIllIIlilIllIIli.IlIlllIlilIl();
         if (!this.IiIlliIliiIl(s)) {
            if (this.ililIiIIIl) {
               this.IlIlllIlilIl(var4, false);
            }

            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
         } else if (s.IlIlllIlilIl().iiIIlIIlIl()) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
         } else if (var4 < this.IIIiIiIIIl) {
            return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
         } else {
            double var6 = IIlllIlliIll(var3);
            if (Double.isNaN(var6)) {
               return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
            } else {
               var9 ^= ((long)(this.ililIiIIIl ? (var6 < 0.9 ? 1 : 0) : (var6 < 0.35 ? 1 : 0)) << 32 ^ var9) & -1L << 32;
               if ((int)(var9 >>> 32) == 0) {
                  if (this.ililIiIIIl) {
                     this.IlIlllIlilIl(var4, false);
                  }

                  return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
               } else if (this.iIilIiIIIl.IilliliilIIi((st) -> st.method_31574(class_1802.field_8287), false) < 0) {
                  if (this.IlilIiIIIl != null && s.IlIlllIlilIl().Iilililiiili() > 0) {
                     this.IlilIiIIIl.IliIlllilIi(lIliliiIlili.IIllIllIllIllIllIl, var4 + 60L);
                     return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
                  } else {
                     return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
                  }
               } else {
                  return new IilliIIllilliIIl(iIlIIIIiIllIIIIi.iIIIiiIiil, true, (double)2.0F, this.ililIiIIIl ? 0 : 2, false, false, this.ililIiIIIl ? IIillIiliIil<invokedynamic>() : IIillIiliIil<invokedynamic>());
               }
            }
         }
      } else {
         return IilliIIllilliIIl.IliIlllilIi(iIlIIIIiIllIIIIi.iIIIiiIiil, IIillIiliIil<invokedynamic>());
      }
   }

   public boolean iliIiiliiiii() {
      return this.ililIiIIIl;
   }

   public void liiiIIllIl(BooleanSupplier quiet) {
      this.llilIiIIIl = quiet;
   }

   public illllliIilllli(iilllIiIIillIi slots, illillIlIilillIl gates, lIlIiIIliIlIiIIl aim) {
      this.IIilIiIIIl = slots;
      this.lIilIiIIIl = gates;
      this.iIilIiIIIl = aim;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1468470059257173908L ^ Long.rotateLeft(-1372040845926440361L, 30) ^ -7577842694543283247L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -462870529291126358L ^ Long.rotateLeft(-1516634215269662460L, 32) ^ 5109212003407344833L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 959846883784040174L ^ Long.rotateLeft(2591809695388673911L, 15) ^ -6016945725562132400L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6283899168034508011L ^ Long.rotateLeft(-5851692160001269295L, 42) ^ 4644567414570104645L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8808959268293359964L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2320697507758497061L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6379848154713877659L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5214150494262381920L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2387938477800661714L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2578418696674675102L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) ^ var5) ^ 26216))) + var5) ^ var5) - '\uece2'))))) + 14622) - 7834))) ^ '꽊') + var5) ^ '遐'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
