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
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1657;
import net.minecraft.class_1937;
import net.minecraft.class_310;
import net.minecraft.class_638;
import net.minecraft.class_640;
import net.minecraft.class_746;

public final class iIilliilIlilliil {
   private static final int[][] iiIiliilil = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
   static final float liIiliilil = 8.0F;
   private double Iliiliilil;
   private final List<double[]> llliliilil = new ArrayList();
   static final long iIIiliilil = 25000L;
   private double lIiiliilil;
   private long iliiliilil;
   private long liiiliilil;
   private double ilIIiiilil;
   public static final double Iiilliilil = (double)640.0F;
   private lliiIIliliiIIl Iililiilil;
   private class_638 lliiliilil;
   private final iliIIlilIiiIIlil lIliliilil = new iliIIlilIiiIIlil();
   private IIIIiIIllIIIiIIl illiliilil;
   private int IiIIiiilil;
   private final liiilllliiiillll IIliliilil;
   private final ConcurrentLinkedQueue<String> Illiliilil = new ConcurrentLinkedQueue();
   static final int llIiliilil = 80;
   private double iIiiliilil;
   private int lIIIiiilil;
   public static final double ililliilil = (double)320.0F;
   public static final double liilliilil = (double)24.0F;
   public static final double llilliilil = (double)64.0F;
   static final int IiIiliilil = 64;
   private iiliIiiIIiiIii iiIIiiilil;
   private long liIIiiilil;
   private long Iiiiliilil;
   public static final double IIIiliilil = (double)200.0F;
   private double llIIiiilil;
   private int iIIIiiilil;
   private String IlIIiiilil;
   static final long lIIiliilil = 10000L;
   private final iiiIIIIlIIIlIIIl iIliliilil = new iiiIIIIlIIIlIIIl();
   private long iiiiliilil;
   private String iililiilil;
   static final long IlIiliilil = 30000L;
   private double IIiiliilil;
   private int IIIIiiilil;
   static final int ilIiliilil = 40;
   public static final double iiilliilil = (double)6000.0F;

   private boolean IiIlliIliiIl(iiliIiiIIiiIii s) {
      double var2 = (double)576.0F;

      for(double[] var5 : this.llliliilil) {
         double var6 = var5[0] - s.IliIlllilIi();
         double var8 = var5[1] - s.iIlIlllllill();
         if (var6 * var6 + var8 * var8 <= var2) {
            return true;
         }
      }

      return false;
   }

   private static lIIIlIIliIIIlIIl Iiiiliiiiiii() {
      ilIllIiIll var0 = llilIllililIll.iliIiiliiiii(lIIIlIIliIIIlIIl.class);
      lIIIlIIliIIIlIIl var10000;
      if (var0 instanceof lIIIlIIliIIIlIIl var1) {
         var10000 = var1;
      } else {
         var10000 = null;
      }

      return var10000;
   }

   private void Iilllilliill(class_310 s, iiliIiiIIiiIii mc) {
      long var5 = -1501975570383099875L;
      String var3 = lilIIiiliilIIiil.iIlIlllllill(mc.IliIlllilIi(), mc.liiiIIllIl(), mc.iIlIlllllill());
      if (this.illiliilil == IIIIiIIllIIIiIIl.lIllIIilIl) {
         var5 ^= ((long)IIiilIiiiIii(s, mc.IliIlllilIi(), mc.iIlIlllllill()) << 32 ^ var5) & -1L << 32;
         this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>() + mc.IilliliilIIi() + iiIIlIIlIl<invokedynamic>() + var3 + ((int)(var5 >>> 32) != 0 ? iiIIlIIlIl<invokedynamic>() : iiIIlIIlIl<invokedynamic>()));
      } else {
         this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>() + mc.IilliliilIIi() + iiIIlIIlIl<invokedynamic>() + var3 + iiIIlIIlIl<invokedynamic>());
      }

   }

   private static Set<String> IlIillIiilIi(class_310 mc) {
      HashSet var1 = new HashSet();
      if (mc.method_1562() == null) {
         return var1;
      } else {
         for(class_640 var3 : mc.method_1562().method_2880()) {
            var1.add(var3.method_2966().name().toLowerCase(Locale.ROOT));
         }

         return var1;
      }
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] + var5))))) >>> 10 | (char)(-((char)(~((char)(var4[var5] + var5))))) << 6) - var5))) + 18555) ^ '\ueb6a'))))) + 18258) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(String line) {
      if (this.illiliilil == IIIIiIIllIIIiIIl.IIllIIilIl && line != null && this.Illiliilil.size() < ((-868002305 * -95 * -1057222719 << 7 | -868002305 * -95 * -1057222719 >>> 25) ^ -1816703052)) {
         this.Illiliilil.offer(line);
      }

   }

   private boolean Illillliilli(class_310 mc) {
      int[] var2 = iiIiliilil[this.IiIIiiilil % 4];
      long var3 = this.liIIiiilil * (long)(this.IiIIiiilil / 2 + 1);
      return IIiilIiiiIii(mc, this.llIIiiilil + (double)var2[0] * ((double)var3 + Double.longBitsToDouble(-5778417967811507081L ^ -1190745283334747017L)), this.ilIIiiilil + (double)var2[1] * ((double)var3 + Double.longBitsToDouble(-7198576717182059747L ^ -2544827781922473187L)));
   }

   private void IIIllIIliIIl(String why) {
      this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
      this.Iililiilil = lliiIIliliiIIl.IIlliiiIllIlliiiIl;
      this.iililiilil = "";
      this.iiIIiiilil = null;
      this.IIliliilil.IIIllIIliIIl(why);
   }

   public boolean liiiIIllIl() {
      return this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl && this.Iililiilil != lliiIIliliiIIl.IIlliiiIllIlliiiIl && this.Iililiilil != lliiIIliliiIIl.iiiIiiiIlIIIliiiIl;
   }

   private void IIlilIliiIli(class_310 p, class_746 mc) {
      lIIIlIIliIIIlIIl var3 = Iiiiliiiiiii();
      if (var3 != null && var3.IliIlllilIi()) {
         int[] var4 = iiIiliilil[this.IiIIiiilil % 4];
         long var5 = this.liIIiiilil * (long)(this.IiIIiiilil / 2 + 1);
         double var7 = (mc.method_23317() - this.llIIiiilil) * (double)var4[0] + (mc.method_23321() - this.ilIIiiilil) * (double)var4[1];
         this.iililiilil = iiIIlIIlIl<invokedynamic>() + (this.IiIIiiilil + 1) + iiIIlIIlIl<invokedynamic>() + lilIIiiliilIIiil.IliIlllilIi(Math.max((double)0.0F, (double)var5 - var7)) + iiIIlIIlIl<invokedynamic>();
         if (!(var7 < (double)var5)) {
            if (this.iIIIiiilil + 1 >= 40) {
               double var17 = Math.toRadians((double)mc.method_36454());
               IIiilIiiiIii(p, mc.method_23317() - Math.sin(var17) * (double)200.0F, mc.method_23321() + Math.cos(var17) * (double)200.0F);
               this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>());
            } else {
               double var9 = this.llIIiiilil + (double)((long)var4[0] * var5);
               double var11 = this.ilIIiiilil + (double)((long)var4[1] * var5);
               int var13 = this.IiIIiiilil + 1;
               int[] var14 = iiIiliilil[var13 % 4];
               long var15 = this.liIIiiilil * (long)(var13 / 2 + 1);
               if (!var3.lllllillll((int)Math.round(var9 + (double)var14[0] * ((double)var15 + (double)6000.0F)), (int)Math.round(var11 + (double)var14[1] * ((double)var15 + (double)6000.0F)))) {
                  this.iililiilil = iiIIlIIlIl<invokedynamic>();
               } else {
                  this.llIIiiilil = var9;
                  this.ilIIiiilil = var11;
                  this.IiIIiiilil = var13;
                  ++this.iIIIiiilil;
               }
            }
         }
      } else {
         this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
         this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>());
      }
   }

   public iIilliilIlilliil(liiilllliiiillll host) {
      this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
      this.Iililiilil = lliiIIliliiIIl.iiiIiiiIlIIIliiiIl;
      this.iililiilil = "";
      this.IlIIiiilil = iiIIlIIlIl<invokedynamic>();
      this.IIliliilil = host;
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15))) - '觫'))) ^ var5) ^ var5) << 6 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15))) - '觫'))) ^ var5) ^ var5) >>> 10) + '轀') - '뚿'))) ^ var5))) - '덂') + '쑗') >>> 6 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15))) - '觫'))) ^ var5) ^ var5) << 6 | (char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15))) - '觫'))) ^ var5) ^ var5) >>> 10) + '轀') - '뚿'))) ^ var5))) - '덂') + '쑗') << 10) ^ 32263));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iiliIiiIIiiIii Illlllllilll(class_746 p) {
      iiliIiiIIiiIii var2 = null;
      int var3 = this.IIliliilil.liiiIIllIl();
      double var4 = this.illiliilil == IIIIiIIllIIIiIIl.lIllIIilIl ? (double)640.0F : (double)320.0F;

      for(iiliIiiIIiiIii var7 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
         if (!var7.lIlllIiIIl && var7.lIiiIiIlilli() >= var3 && !(var7.IIlilIliiIli(p.method_23317(), p.method_23321()) > var4 * var4) && !this.IiIlliIliiIl(var7) && (var2 == null || var7.IilliliilIIi() > var2.IilliliilIIi())) {
            var2 = var7;
         }
      }

      return var2;
   }

   public IIIIiIIllIIIiIIl IliIlllilIi() {
      return this.illiliilil;
   }

   private static boolean IiIiliIiiiIi(class_310 self, class_746 mc) {
      for(class_1657 var3 : self.field_1687.method_18456()) {
         if (var3 != mc && !var3.method_7325() && !iIIiIiIlIlIiIiIl.liiiIIllIl(var3) && var3.method_5858(mc) <= (double)576.0F) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) << 7) - var5) ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) << 7) - var5) ^ var5) << 11) ^ 'Ꜵ') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) << 7) - var5) ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) ^ 'ﴭ') ^ var5) - 18154) - var5) << 7) - var5) ^ var5) << 11) ^ 'Ꜵ') >>> 14) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4010285651009748586L ^ Long.rotateLeft(815123375174085149L, 47) ^ 304731137258032093L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8917004356000986376L ^ Long.rotateLeft(2055003460418562437L, 48) ^ -7782522317368962627L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7385637950881686476L ^ Long.rotateLeft(-8774350461396294040L, 53) ^ 6154734457344130242L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5892768626884524443L ^ Long.rotateLeft(-2384806431676516297L, 17) ^ -2252660805666366752L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2160615810020299511L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8956224155576267718L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5651003412160375752L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1385133417150079150L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 860532026488078379L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1229088668901788810L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIlIliIlIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IllIllllIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, illIlIilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lilIliilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiIllIiIl<invokedynamic>());
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

   public String iIlIlllllill() {
      return this.iililiilil;
   }

   private void Iiilliiliiil(class_310 now, class_746 mc, long p) {
      if (now.method_1562() != null) {
         String var5 = this.iIliliilil.IilliliilIIi(this.IIliliilil.IilliliilIIi());
         if (!iiiIIIIlIIIlIIIl.liiiIIllIl(var5)) {
            var5 = iiIIlIIlIl<invokedynamic>();
         }

         this.IlIIiiilil = var5;
         now.method_1562().method_45730(iiIIlIIlIl<invokedynamic>() + var5);
         this.lIliliilil.IlIlllIlilIl(p);
         this.iliiliilil = p;
         this.IIiiliilil = mc.method_23317();
         this.lIiiliilil = mc.method_23321();
         this.lliiliilil = now.field_1687;
         this.liiiliilil = p + (-1328361449969117077L ^ -1328361449969095333L);
         this.Iililiilil = lliiIIliliiIIl.IlIliiiIlllIliiiIl;
         this.iililiilil = iiIIlIIlIl<invokedynamic>() + var5 + iiIIlIIlIl<invokedynamic>();
      }
   }

   private void IIIilIIiiIIi(class_310 mc, long now) {
      Set var4 = null;

      String var5;
      while((var5 = (String)this.Illiliilil.poll()) != null) {
         if (var4 == null) {
            var4 = IlIillIiilIi(mc);
         }

         IllIIIIllllIIIIl var7 = iiilIllIIIiIll.IliIlllilIi(var5, this.iliiliilil > 0L ? now - this.iliiliilil : -1L, (names) -> var4.contains(names.toLowerCase(Locale.ROOT)));
         switch (null.llllIlIiil[var7.liiiIIllIl().ordinal()]) {
            case 1:
               this.lIliliilil.IiIlliIliiIl(now);
               break;
            case 2:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.lIliliilil.Illlllllilll(now, var7.iIlIlllllill());
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
               break;
            case 3:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.lIliliilil.Iilllilliill(now);
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
               break;
            case 4:
               if (this.lIliliilil.liiiIIllIl() && now - this.iliiliilil < 2000L) {
                  this.lIliliilil.IIillIiliIil(now);
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
               break;
            case 5:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.iliIiiliiiii(iiIIlIIlIl<invokedynamic>());
                  return;
               }
               break;
            case 6:
               if (this.lIliliilil.liiiIIllIl()) {
                  this.lIliliilil.Ililllililil(now);
                  if (this.Iililiilil == lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
               }
         }
      }

   }

   private void IlIlllIlilIl(iiliIiiIIiiIii s) {
      if (!this.IiIlliIliiIl(s)) {
         this.llliliilil.add(new double[]{s.IliIlllilIi(), s.iIlIlllllill()});
      }

   }

   public void lIiiIiIlilli(IIIIiIIllIIIiIIl now, class_310 radiusChunks, int mc, long m) {
      boolean var6 = this.illiliilil == IIIIiIIllIIIiIIl.lIllIIilIl;
      this.iliIiiliiiii((String)null);
      if (var6 && now != IIIIiIIllIIIiIIl.lIllIIilIl) {
         Iilililiiili(radiusChunks);
      }

      if (now != IIIIiIIllIIIiIIl.iiIlIIilIl && radiusChunks.field_1724 != null && radiusChunks.field_1687 != null) {
         this.illiliilil = now;
         this.lIIIiiilil = 0;
         this.iIIIiiilil = 0;
         this.iiIIiiilil = null;
         this.llliliilil.clear();

         for(iiliIiiIIiiIii var8 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
            this.IlIlllIlilIl(var8);
         }

         this.lIliliilil.IliIlllilIi();
         this.iIliliilil.IliIlllilIi();
         this.Illiliilil.clear();
         if (now == IIIIiIIllIIIiIIl.IIllIIilIl) {
            if (radiusChunks.field_1687.method_27983() != class_1937.field_25179) {
               this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>());
               return;
            }

            this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
            this.IIliliilil.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>());
         } else {
            if (Iiiiliiiiiii() == null) {
               this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>());
               return;
            }

            this.liIIiiilil = Math.max(160L, 2L * (long)mc * 16L - 32L);
            this.llIIiiilil = radiusChunks.field_1724.method_23317();
            this.ilIIiiilil = radiusChunks.field_1724.method_23321();
            this.IiIIiiilil = 0;
            this.Iililiilil = lliiIIliliiIIl.liIliiiIliiIliiiIl;
            this.IIliliilil.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>() + this.liIIiiilil + iiIIlIIlIl<invokedynamic>());
            if (!this.Illillliilli(radiusChunks)) {
               this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>());
            }
         }

      }
   }

   public static boolean IIiilIiiiIii(class_310 x, double z, double mc) {
      lIIIlIIliIIIlIIl var5 = Iiiiliiiiiii();
      if (var5 != null && x.field_1724 != null) {
         int var6 = (int)Math.round(z);
         int var7 = (int)Math.round(mc);
         if (var5.IliIlllilIi() && var5.lllllillll(var6, var7)) {
            var5.IlIllllIll(true);
            return true;
         } else {
            IIiiIIIllIiiIIIl var8 = null;

            for(IilliIllilliIl var10 : var5.IiIlliIliiIl()) {
               if (var10 instanceof IIiiIIIllIiiIIIl) {
                  IIiiIIIllIiiIIIl var11 = (IIiiIIIllIiiIIIl)var10;
                  if (iiIIlIIlIl<invokedynamic>().equals(var10.IliIlllilIi())) {
                     var8 = var11;
                  }
               }
            }

            if (var8 == null) {
               return false;
            } else {
               Iliilliiilii(() -> {
                  if (var5.IliIlllilIi()) {
                     var5.IIillIiliIil(false);
                  }

                  String var4 = var8.Iilllilliill();
                  var8.IIillIiliIil(var6 + iiIIlIIlIl<invokedynamic>() + var7);

                  try {
                     var5.IIillIiliIil(true);
                     var5.IlIllllIll(true);
                  } finally {
                     var8.IIillIiliIil(var4);
                  }

               });
               return var5.IliIlllilIi() && !var5.IIllllIlll();
            }
         }
      } else {
         return false;
      }
   }

   private static String IIIIllIIIl(long ms) {
      return (ms + (8485667420105192968L ^ 8485667420105192943L)) / (-6292160433269239163L ^ -6292160433269239443L) + iiIIlIIlIl<invokedynamic>();
   }

   private boolean Ililllililil() {
      for(iiliIiiIIiiIii var2 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
         if (var2.lIlllIiIIl && !(var2.IIlilIliiIli(this.iIiiliilil, this.Iliiliilil) > (double)102400.0F)) {
            for(IiIlililliIlilil var4 : var2.IIIilIIiiIIi()) {
               if (var4.IiIiIlIlil.iIlIIIIIiIllIIIIIi) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   private static void Iliilliiilii(Runnable r) {
      AutoCloseable var1 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

      try {
         r.run();
      } finally {
         try {
            var1.close();
         } catch (Exception var8) {
         }

      }

   }

   private static void Iilililiiili(class_310 mc) {
      long var6 = -7318183047023204507L;
      lIIIlIIliIIIlIIl var1 = Iiiiliiiiiii();
      if (var1 != null && var1.IliIlllilIi() && mc.field_1724 != null) {
         if (!mc.field_1724.method_6128()) {
            Iliilliiilii(() -> var1.IIillIiliIil(false));
         } else {
            var1.IlIllllIll(true);
            var1.ilIllIiIll();
            if (!var1.iIlllIllll()) {
               double var2 = Math.toRadians((double)mc.field_1724.method_36454());
               var6 ^= ((long)((int)Math.round(mc.field_1724.method_23317() - Math.sin(var2) * Double.longBitsToDouble(4517438867483571923L ^ 9140102410002675411L))) << 32 ^ var6) & -1L << 32;
               var6 ^= ((long)((int)Math.round(mc.field_1724.method_23321() + Math.cos(var2) * Double.longBitsToDouble(4929669485219721004L ^ 288428594237714220L))) ^ var6) & -1L >>> 32;
               if (!var1.lllllillll((int)(var6 >>> 32), (int)var6)) {
                  IIiilIiiiIii(mc, (double)((int)(var6 >>> 32)), (double)((int)var6));
               }

            }
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) << 15 | (char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) >>> 1) ^ 25836) + '붵') ^ 'ꑆ') >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) << 15 | (char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) >>> 1) ^ 25836) + '붵') ^ 'ꑆ') << 6) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) << 15 | (char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) >>> 1) ^ 25836) + '붵') ^ 'ꑆ') >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) << 15 | (char)((char)(var4[var5] << 14 | var4[var5] >>> 2) - 16459) >>> 1) ^ 25836) + '붵') ^ 'ꑆ') << 6) << 12) + var5) - var5) + var5) - '茫'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii(String why) {
      long var4 = 3577943705991206884L;
      var4 ^= ((long)(this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl ? 1 : 0) << 32 ^ var4) & -1L << 32;
      IIIIiIIllIIIiIIl var3 = this.illiliilil;
      this.illiliilil = IIIIiIIllIIIiIIl.iiIlIIilIl;
      this.Iililiilil = lliiIIliliiIIl.iiiIiiiIlIIIliiiIl;
      this.iililiilil = "";
      this.iiIIiiilil = null;
      this.Illiliilil.clear();
      this.lliiliilil = null;
      this.liiiliilil = 0L;
      this.IIiiliilil = (double)0.0F;
      this.lIiiliilil = (double)0.0F;
      if (var3 == IIIIiIIllIIIiIIl.lIllIIilIl && why != null) {
         Iilililiiili(class_310.method_1551());
      }

      if ((int)(var4 >>> 32) != 0 && why != null) {
         this.IIliliilil.IIIllIIliIIl(why);
      }

   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) ^ var5) ^ var5) - var5) + '\udadf'))))) ^ var5) ^ 8265) - var5) + '襑') ^ 28764));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIillIiliIil(class_310 p, class_746 mc, long now) {
      this.IIIilIIiiIIi(p, now);
      if (this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl && this.Iililiilil != lliiIIliliiIIl.IIlliiiIllIlliiiIl) {
         if (this.Iililiilil != lliiIIliliiIIl.ilIliiiIlIiIliiiIl && this.lliiliilil != null && now <= this.liiiliilil) {
            boolean var5 = p.field_1687 != this.lliiliilil;
            double var6 = mc.method_23317() - this.IIiiliilil;
            double var8 = mc.method_23321() - this.lIiiliilil;
            if (var5 || var6 * var6 + var8 * var8 > (double)4096.0F) {
               this.liiiliilil = 0L;
               if (this.iiIIiiilil != null) {
                  iiliIiiIIiiIii var20 = this.iiIIiiilil;
                  this.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>() + var20.IilliliilIIi() + iiIIlIIlIl<invokedynamic>() + lilIIiiliilIIiil.iIlIlllllill(var20.IliIlllilIi(), var20.liiiIIllIl(), var20.iIlIlllllill()) + iiIIlIIlIl<invokedynamic>());
                  return;
               }

               this.lIliliilil.Iiilliiliiil(now);
               this.iIliliilil.iliIiiliiiii(this.IlIIiiilil);
               this.Iiiiliilil = now;
               this.iIiiliilil = mc.method_23317();
               this.Iliiliilil = mc.method_23321();
               this.IIIIiiilil = this.IIliliilil.lIiiIiIlilli();
               this.iiiiliilil = 0L;
               ++this.lIIIiiilil;
               this.Iililiilil = lliiIIliliiIIl.ilIliiiIlIiIliiiIl;
            }
         }

         if (this.iiIIiiilil != null && this.Iililiilil != lliiIIliliiIIl.IlIliiiIlllIliiiIl) {
            iiliIiiIIiiIii var18 = this.iiIIiiilil;
            this.iiIIiiilil = null;
            this.Iilllilliill(p, var18);
         } else {
            switch (this.Iililiilil.ordinal()) {
               case 1:
                  lIIIlIIliIIIlIIl var17 = Iiiiliiiiiii();
                  if (var17 != null && var17.IliIlllilIi()) {
                     this.iililiilil = iiIIlIIlIl<invokedynamic>();
                  } else if (this.lIliliilil.iIlIlllllill(now)) {
                     this.Iiilliiliiil(p, mc, now);
                  } else {
                     this.iililiilil = iiIIlIIlIl<invokedynamic>() + IIIIllIIIl(this.lIliliilil.IIIllIIliIIl(now));
                  }
                  break;
               case 2:
                  if (this.lIliliilil.IIlllIlliIll(now)) {
                     this.iIliliilil.lIiiIiIlilli(this.IlIIiiilil);
                     if (this.lIliliilil.IIIilIIiiIIi(now)) {
                        this.iliIiiliiiii(iiIIlIIlIl<invokedynamic>());
                        return;
                     }

                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  } else {
                     this.iililiilil = iiIIlIIlIl<invokedynamic>() + this.IlIIiiilil + iiIIlIIlIl<invokedynamic>();
                  }
                  break;
               case 3:
                  long var16 = now - this.Iiiiliilil;
                  int var7 = this.IIliliilil.lIiiIiIlilli() - this.IIIIiiilil;
                  this.iililiilil = iiIIlIIlIl<invokedynamic>() + this.lIIIiiilil + iiIIlIIlIl<invokedynamic>() + var7 + iiIIlIIlIl<invokedynamic>();
                  boolean var19 = IiIiliIiiiIi(p, mc);
                  if (this.iiiiliilil == 0L && var16 >= 10000L && var7 >= 80) {
                     this.iiiiliilil = now;
                  }

                  boolean var9 = this.iiiiliilil != 0L && this.IIliliilil.iliIiiliiiii(this.iiiiliilil) && !this.Ililllililil();
                  if (var19 || var16 >= 25000L || var9) {
                     for(iiliIiiIIiiIii var11 : this.IIliliilil.IliIlllilIi().iIlIlllllill()) {
                        double var12 = var11.IliIlllilIi() - this.iIiiliilil;
                        double var14 = var11.iIlIlllllill() - this.Iliiliilil;
                        if (var12 * var12 + var14 * var14 <= (double)102400.0F) {
                           this.IlIlllIlilIl(var11);
                        }
                     }

                     if (var19) {
                        this.IIliliilil.IIIllIIliIIl(iiIIlIIlIl<invokedynamic>());
                     }

                     this.Iililiilil = lliiIIliliiIIl.lIIliiiIliIIliiiIl;
                  }
            }

         }
      }
   }

   public void IIlllIlliIll(class_310 now, long mc) {
      if (this.illiliilil != IIIIiIIllIIIiIIl.iiIlIIilIl && this.Iililiilil != lliiIIliliiIIl.IIlliiiIllIlliiiIl && now.field_1724 != null && now.field_1687 != null) {
         class_746 var4 = now.field_1724;
         if (var4.method_6032() > 0.0F && var4.method_6032() < 8.0F) {
            this.iliIiiliiiii(iiIIlIIlIl<invokedynamic>());
         } else {
            iiliIiiIIiiIii var5 = this.Illlllllilll(var4);
            if (var5 != null && this.IIliliilil.iIlIlllllill()) {
               if (this.illiliilil != IIIIiIIllIIIiIIl.IIllIIilIl || this.Iililiilil != lliiIIliliiIIl.IlIliiiIlllIliiiIl || !this.lIliliilil.liiiIIllIl()) {
                  this.Iilllilliill(now, var5);
                  return;
               }

               this.iiIIiiilil = var5;
            }

            if (this.illiliilil == IIIIiIIllIIIiIIl.IIllIIilIl) {
               this.IIillIiliIil(now, var4, mc);
            } else {
               this.IIlilIliiIli(now, var4);
            }

         }
      }
   }
}
