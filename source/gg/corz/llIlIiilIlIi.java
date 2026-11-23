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
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1294;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_3965;
import net.minecraft.class_5134;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;

public final class llIlIiilIlIi {
   public static final int iliiiiiiIiiiiiii = 32;
   private int liilIIIIliiilIIIIl;
   private boolean ililIIIIlIiilIIIIl;
   public static final double iIiIIIIIlIliIIIIIl = (double)3.0F;
   public static final double IiIIIIIIlliIIIIIIl = 0.3;
   private int IiiiIIIIlliiiIIIIl;
   public static final int Iliiiiiilliiiiii = 10;
   private long lIliIIIIliIliIIIIl;
   public static final float ilIlIIIIlIiIlIIIIl = 60.0F;
   public static final int Iiliiiiililiiiii = 140;
   private boolean illiIIIIlIiliIIIIl;
   public static final double lliIIIIIliliIIIIIl = 1.2;
   public static final int iiliiiiiIIiiiiii = 220;
   public static final double lIlIIIIIliIlIIIIIl = (double)8.0F;
   private final llillIililillIil iillIIIIlIIilIIIIl;
   private class_243 ilIIlIIIlIiIIlIIIl;
   private iIiIIlllIliIIlll iIIiIIIIlIlIiIIIIl;
   public static final int liiiiiiiiiiiiiii = 6;
   private class_2338 iIiiIIIIlIliiIIIIl;
   private class_2338 llIiIIIIlilIiIIIIl;
   private boolean liIIlIIIliiIIlIIIl;
   public static final int llliiiiiilliiiii = 80;
   private List<iiliilIlIIiiilIl> IlilIIIIlllilIIIIl;
   public static final int lIiiiiiiiIiiiiii = 8;
   private class_2338 lliiIIIIliliiIIIIl;
   public static final double lilIIIIIliilIIIIIl = (double)32.0F;
   public static final int IIIIIIIIllIIIIIIIl = 6;
   public static final double iiIIIIIIlIIlIIIIIl = (double)3.0F;
   private final IIiIiIillIiIiIil llllIIIIlilllIIIIl;
   private List<class_2338> IIlIlIIIllIlIlIIIl;
   private String lIilIIIIliIilIIIIl;
   private class_2338 IIIiIIIIllIIiIIIIl;
   private long iiIiIIIIlIIliIIIIl = -186408709441203771L ^ 2119434299772490181L;
   public static final float IiiIIIIIlliiIIIIIl = 10.0F;
   public static final double IllIIIIIllllIIIIIl = (double)24.0F;
   private int IIiiIIIIllIiiIIIIl;
   private int IlIIlIIIlllIIlIIIl;
   public static final double illIIIIIlIilIIIIIl = 1.6;
   public static final long IIliiiiilIliiiii = 2000000L;
   public static final float lIIlIIIIliIIlIIIIl = 18.0F;
   private static final double[] liIlIIIIliiIlIIIIl = new double[]{Double.longBitsToDouble(-243791733601031343L ^ 4850046423564785762L), Double.longBitsToDouble(4455203438570217687L ^ 146152441474225124L)};
   private long IiIiIIIIlliIiIIIIl;
   private int lIIIlIIIliIIIlIIIl;
   public static final int ilIiiiiiIiIiiiii = 40000;
   public static final int iIliiiiiIlliiiii = 10;
   private int liliIIIIliiliIIIIl;
   private final IIiIIlilIiIIli iIllIIIIlIlllIIIIl;
   private final IiIIiIIlliIIiIIl IillIIIIllillIIIIl;
   public static final float iiiIIIIIlIIIlIIIIl = 50.0F;
   public static final double iIIIIIIIlIlIIIIIIl = 0.06;
   public static final float IlIlIIIIlllIlIIIIl = 35.0F;
   public static final double llIIIIIIlilIIIIIIl = 2.6;
   private double iiiiIIIIlIIIIlIIIl = Double.longBitsToDouble(-3126797416820651614L ^ -6092071020406753699L);
   private long IlliIIIIlllliIIIIl = -4853841621798381521L ^ 6675373424270088239L;
   private final class_310 IIllIIIIllIllIIIIl = class_310.method_1551();
   public static final int liIiiiiiiiIiiiii = 200;
   private String iIlIlIIIlIllIlIIIl = "";
   public static final double IIiIIIIIllIiIIIIIl = (double)4.0F;

   private double IiIIlliIIl(class_746 c, class_2338 p) {
      return this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(class_243.method_24955(p)) + Double.longBitsToDouble(-1282305842510713134L ^ -3326940073336918318L) * Math.abs(c.method_23318() - (double)p.method_10264());
   }

   public int iIlIlllllill() {
      return this.IIiiIIIIllIiiIIIIl;
   }

   private void IlIllllIll(class_746 p) {
      if (this.IlilIIIIlllilIIIIl != null && this.liilIIIIliiilIIIIl < this.IlilIIIIlllilIIIIl.size()) {
         iiliilIlIIiiilIl var2 = (iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(this.liilIIIIliiilIIIIl);
         class_243 var3 = class_243.method_24955(var2.IliIlllilIi());
         double var4 = this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(var3);
         if (var2.liiiIIllIl() != IllIllllllIlll.iIiiIIiilIliiIIiil && !(var4 < Double.longBitsToDouble(6571911240354263020L ^ 7266326307079019743L))) {
            float var6 = this.iIllIIIIlIlllIIIIl.IlIillIiilIi(var3);
            this.iIllIIIIlIlllIIIIl.IiIlliIliiIl(var6, 10.0F, 0);
            if (Math.abs(class_3532.method_15393(var6 - p.method_36454())) < 50.0F) {
               this.iIllIIIIlIlllIIIIl.IilliliilIIi(1);
            }

         } else {
            if (var4 > Double.longBitsToDouble(590134560074143199L ^ 4028173166324020153L)) {
               this.iIllIIIIlIlllIIIIl.IiIlliIliiIl(this.iIllIIIIlIlllIIIIl.IlIillIiilIi(var3), 10.0F, 0);
            }

            this.iIllIIIIlIlllIIIIl.IIlilIliiIli(var3, false);
         }
      }
   }

   private boolean IIiilIiiiIii(class_746 p) {
      int[] var2 = Iilililiiili(p);
      return var2[1] < (-(-1248996099 ^ 35 ^ 109) - -13 ^ 1249732890) && var2[0] < IiIiIlliIiIl.IliIlllilIi(var2[1]);
   }

   private void IIiIllIiIl(class_746 st, iiliilIlIIiiilIl p, class_243 c) {
      class_2338 var4 = p.IliIlllilIi();
      double var5 = (double)var4.method_10264();
      IllIllllllIlll var7 = p.liiiIIllIl();
      boolean var8 = p.IilliliilIIi() && !p.lIiiIiIlilli() && lIilIiliIilIil.liiiIIllIl(this.IillIIIIllillIIIIl.IliIlllilIi(var4.method_10263(), var4.method_10264() - 1, var4.method_10260()), 1);
      boolean var9 = var7 == IllIllllllIlll.lIIIlIiiliIIIlIiil || var7 == IllIllllllIlll.IIiiIIiillIiiIIiil || !p.IilliliilIIi() || st.method_23318() < var5 - 0.15 || !p.lIiiIiIlilli() && !var8;
      boolean var10 = !var9 && (var7 == IllIllllllIlll.IlIIlIiilllIIlIiil || st.method_23318() > var5 + (double)0.75F);
      double var11 = this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(c);
      if (var11 > (double)0.25F) {
         float var13 = this.iIllIIIIlIlllIIIIl.IlIillIiilIi(c);
         this.iIllIIIIlIlllIIIIl.IiIlliIliiIl(var13, 10.0F, 0);
         float var14 = Math.abs(class_3532.method_15393(var13 - st.method_36454()));
         if (var14 < 50.0F) {
            this.iIllIIIIlIlllIIIIl.IilliliilIIi(1);
         } else if (var11 < 0.9) {
            this.iIllIIIIlIlllIIIIl.IIlilIliiIli(c, false);
         }
      }

      if (var9) {
         this.iIllIIIIlIlllIIIIl.IilliliilIIi(16);
      } else if (var10) {
         this.iIllIIIIlIlllIIIIl.IilliliilIIi(32);
      }

   }

   private void Iiiiliiiiiii(class_746 feet, class_2338 p) {
      int var3 = Math.min(this.IlilIIIIlllilIIIIl.size(), this.liilIIIIliiilIIIIl + 6 + 1);
      int var4 = -1;

      for(int var5 = this.liilIIIIliiilIIIIl; var5 < var3; ++var5) {
         if (this.Iliilliiilii(feet, p, (iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(var5))) {
            var4 = var5;
         }

         if (this.IIIIllIIIl(var5) && var5 > var4) {
            break;
         }
      }

      if (var4 >= 0) {
         this.liilIIIIliiilIIIIl = var4 + 1;
         this.lIliIIIIliIliIIIIl = this.IiIiIIIIlliIiIIIIl;
         this.IIlIlIIIllIlIlIIIl = null;
         this.Iiilliiliiil();
      }
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2500148354070082020L ^ Long.rotateLeft(-2817486970306242844L, 13) ^ 1573551937828137153L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7786275629247571367L ^ Long.rotateLeft(3896718362678726050L, 56) ^ 6123305225791173381L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9059699524537720740L ^ Long.rotateLeft(5536136434060605145L, 18) ^ 3734969597880790049L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6728237785355998079L ^ Long.rotateLeft(5912800020028557365L, 18) ^ 2493194353020509472L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8320667336018479075L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4881762093581778738L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1890324714848766464L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 56015042531671803L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8407908072682587505L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1667262607550467964L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIllllIlll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlllIllll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lllllillll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iillllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iilllIIill<invokedynamic>());
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

   public int liiiIIllIl() {
      return this.liliIIIIliiliIIIIl;
   }

   private liIIIilliiIIIill IiIiliIiiiIi(class_746 focus, class_2338 goal, Predicate<class_2338> hint, class_2338 p, class_2338 allowDig, boolean feet) {
      if (this.iIIiIIIIlIlIiIIIIl == null) {
         if (this.illiIIIIlIiliIIIIl && this.IiIiIIIIlliIiIIIIl - this.iiIiIIIIlIIliIIIIl < 10L) {
            this.Illillliilli(focus, p);
            return liIIIilliiIIIill.iIlilllill;
         }

         this.iiIiIIIIlIIliIIIIl = this.IiIiIIIIlliIiIIIIl;
         this.IIIiIIIIllIIiIIIIl = goal;
         class_2338 var7 = allowDig == null ? goal : allowDig;
         int[] var8 = IIIilIlllIIilIll.IIIllIIliIIl(goal.method_10263(), goal.method_10264(), goal.method_10260(), var7.method_10263(), var7.method_10264(), var7.method_10260());
         Object var9 = feet ? this.iillIIIIlIIilIIIIl : new liIliiIliiIliiIl(this.iillIIIIlIIilIIIIl);
         int[] var10 = Iilililiiili(focus);
         double var11 = p == null ? (double)0.0F : Math.hypot((double)(p.method_10263() - goal.method_10263()), (double)(p.method_10260() - goal.method_10260()));
         class_2338 var13 = p;
         Predicate var14 = hint;
         if (var11 > (double)32.0F) {
            int var15 = goal.method_10263() + (int)Math.round((double)(p.method_10263() - goal.method_10263()) / var11 * (double)32.0F);
            int var16 = goal.method_10260() + (int)Math.round((double)(p.method_10260() - goal.method_10260()) / var11 * (double)32.0F);
            var13 = new class_2338(var15, goal.method_10264(), var16);
            var14 = (cx) -> hint.test(cx) || Math.hypot((double)(cx.method_10263() - var15), (double)(cx.method_10260() - var16)) <= Double.longBitsToDouble(5117759256589218838L ^ 510576837789201430L);
         }

         this.iIIiIIIIlIlIiIIIIl = IliliIillliliIil.lIiiIiIlilli((ilIliiIlIiIliiIl)var9, goal, var14, var13, new class_2338(var8[0], var8[1], var8[2]), new class_2338(var8[3], var8[4], var8[5]), 40000, new illlilIlIillilIl(var10[0], var10[1], var11 > (double)24.0F ? 1.6 : (double)1.0F, true));
         this.llIiIIIIlilIiIIIIl = var13;
      }

      long var17 = System.nanoTime();

      iiillliIIIilli var18;
      while((var18 = this.iIIiIIIIlIlIiIIIIl.lIiiIiIlilli(200)) == null && System.nanoTime() - var17 <= 2000000L) {
      }

      if (var18 == null) {
         this.Illillliilli(focus, p);
         return liIIIilliiIIIill.Illilllill;
      } else {
         this.iIIiIIIIlIlIiIIIIl = null;
         this.illiIIIIlIiliIIIIl = var18.IliIlllilIi().isEmpty();
         if (this.illiIIIIlIiliIIIIl) {
            this.Ililllililil();
            this.iiIIlIIlIl(focus, (class_2338)null, var18.liiiIIllIl() ? liIlliiIll<invokedynamic>() : liIlliiIll<invokedynamic>());
            return liIIIilliiIIIill.iIlilllill;
         } else {
            if (!var18.liiiIIllIl()) {
               class_2338 var19 = ((iiliilIlIIiiilIl)var18.IliIlllilIi().get(var18.IliIlllilIi().size() - 1)).IliIlllilIi();
               double var20 = this.llIiIIIIlilIiIIIIl == null ? (double)0.0F : IIlilIliiIli(this.IIIiIIIIllIIiIIIIl, this.llIiIIIIlilIiIIIIl) - IIlilIliiIli(var19, this.llIiIIIIlilIiIIIIl);
               if (var20 < (double)3.0F) {
                  this.iiIIlIIlIl(focus, (class_2338)null, liIlliiIll<invokedynamic>());
               }
            }

            this.IlilIIIIlllilIIIIl = var18.IliIlllilIi();
            this.ililIIIIlIiilIIIIl = var18.liiiIIllIl();
            this.liilIIIIliiilIIIIl = 0;
            this.IIlIlIIIllIlIlIIIl = null;
            this.lIliIIIIliIliIIIIl = this.IiIiIIIIlliIiIIIIl;
            this.Iiilliiliiil();
            this.Iiiiliiiiiii(focus, goal);
            if (this.liilIIIIliiilIIIIl >= this.IlilIIIIlllilIIIIl.size()) {
               this.Ililllililil();
               return liIIIilliiIIIill.Illilllill;
            } else {
               return null;
            }
         }
      }
   }

   private static double IIlilIliiIli(class_2338 b, class_2338 a) {
      double var2 = (double)(b.method_10263() - a.method_10263());
      double var4 = (double)(b.method_10264() - a.method_10264());
      double var6 = (double)(b.method_10260() - a.method_10260());
      return Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
   }

   public boolean IiIlliIliiIl(long nowTick) {
      return nowTick - this.IlliIIIIlllliIIIIl <= (6076382995079148581L ^ 6076382995079148583L);
   }

   private boolean iiiIlIIIll(class_746 p, class_243 aim) {
      return p.method_24828() && !p.method_5799() && this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(aim) >= Double.longBitsToDouble(673891540549790335L ^ 5283325759163492991L);
   }

   private void IIillIiliIil(String p, class_746 key) {
      this.lIilIIIIliIilIIIIl = p;
      this.iillIIIIlIIilIIIIl.IIlllIlliIll();
      this.liliIIIIliiliIIIIl = 0;
      this.IIiiIIIIllIiiIIIIl = 0;
      this.Ililllililil();
      this.iIIiIIIIlIlIiIIIIl = null;
      this.illiIIIIlIiliIIIIl = false;
      this.iiIiIIIIlIIliIIIIl = -7279638441894926794L ^ 8861262622600930870L;
      this.ilIIlIIIlIiIIlIIIl = key.method_73189();
      this.iIlIlIIIlIllIlIIIl = "";
   }

   public void IliIlllilIi() {
      this.lIilIIIIliIilIIIIl = null;
      this.Ililllililil();
      this.iIIiIIIIlIlIiIIIIl = null;
      this.llIiIIIIlilIiIIIIl = null;
      this.IIIiIIIIllIIiIIIIl = null;
      this.iiIiIIIIlIIliIIIIl = 3844096612379455446L ^ -3073432415261626410L;
      this.illiIIIIlIiliIIIIl = false;
      this.liliIIIIliiliIIIIl = 0;
      this.IIiiIIIIllIiiIIIIl = 0;
      this.iIiiIIIIlIliiIIIIl = null;
      this.lliiIIIIliliiIIIIl = null;
      this.IiiiIIIIlliiiIIIIl = 0;
      this.ilIIlIIIlIiIIlIIIl = null;
      this.liIIlIIIliiIIlIIIl = false;
      this.iillIIIIlIIilIIIIl.IIlllIlliIll();
      this.iillIIIIlIIilIIIIl.IlIlllIlilIl((class_2338)null);
      this.iIlIlIIIlIllIlIIIl = "";
   }

   public String IilliliilIIi() {
      return this.iIlIlIIIlIllIlIIIl;
   }

   private void Illillliilli(class_746 hint, class_2338 p) {
      if (p != null) {
         this.iIllIIIIlIlllIIIIl.IiIlliIliiIl(this.iIllIIIIlIlllIIIIl.IlIillIiilIi(class_243.method_24953(p)), 10.0F, 0);
      }

      if (hint.method_5869()) {
         this.iIllIIIIlIlllIIIIl.IilliliilIIi(-(1503070432 * 266059921) + -43 ^ 1126955237);
      }

   }

   public boolean IIIllIIliIIl() {
      return this.iIIiIIIIlIlIiIIIIl != null;
   }

   public static int[] Iilililiiili(class_746 p) {
      if (!p.method_6059(class_1294.field_5923) && !p.method_6059(class_1294.field_5927)) {
         double var1 = p.method_45325(class_5134.field_51583);
         return new int[]{IiIiIlliIiIl.Illlllllilll(Math.max(0, p.method_5669()), var1), IiIiIlliIiIl.Illlllllilll(p.method_5748(), var1)};
      } else {
         return new int[]{(-217724267 + -23 - 91) * -79 ^ 20569459, -(1791969819 * 53) * -1749801491 - 75 ^ -1254664278};
      }
   }

   public boolean iliIiiliiiii() {
      return this.liIIlIIIliiIIlIIIl;
   }

   public liIIIilliiIIIill Iilllilliill(long key, String nowTick, Predicate<class_2338> goal, class_2338 focus, class_2338 hint, boolean allowDig) {
      this.IiIiIIIIlliIiIIIIl = key;
      this.iIiiIIIIlIliiIIIIl = null;
      this.liIIlIIIliiIIlIIIl = false;
      class_746 var8 = this.IIllIIIIllIllIIIIl.field_1724;
      boolean var9 = var8.method_5799();
      class_2338 var10 = this.IlIillIiilIi(var8);
      if (this.IiIiIIIIlliIiIIIIl - this.IlliIIIIlllliIIIIl > 1L) {
         this.lIliIIIIliIliIIIIl = this.IiIiIIIIlliIiIIIIl;
         this.Iiilliiliiil();
      }

      this.IlliIIIIlllliIIIIl = this.IiIiIIIIlliIiIIIIl;
      if (!nowTick.equals(this.lIilIIIIliIilIIIIl)) {
         this.IIillIiliIil(nowTick, var8);
      }

      if (!goal.test(var10) || !var8.method_24828() && !var9) {
         if (!var8.method_24828() && !var9) {
            this.IlIllllIll(var8);
            return liIIIilliiIIIill.Illilllill;
         } else {
            this.lIlIliIlIl(var8);
            boolean var11 = this.IlilIIIIlllilIIIIl == null || this.liilIIIIliiilIIIIl >= this.IlilIIIIlllilIIIIl.size();
            if (!var11) {
               this.Iiiiliiiiiii(var8, var10);
               if (this.liilIIIIliiilIIIIl >= this.IlilIIIIlllilIIIIl.size()) {
                  this.Ililllililil();
                  if (goal.test(var10)) {
                     return liIIIilliiIIIill.Illilllill;
                  }

                  var11 = true;
               }
            }

            if (!var11) {
               iiliilIlIIiiilIl var12 = (iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(this.liilIIIIliiilIIIIl);
               int var13 = !var12.iIlIlllllill().isEmpty() ? 220 : (var12.IilliliilIIi() ? 140 : 80);
               if (this.IiIiIIIIlliIiIIIIl - this.lIliIIIIliIliIIIIl > (long)var13) {
                  this.iiIIlIIlIl(var8, var12.IliIlllilIi(), liIlliiIll<invokedynamic>());
                  this.Ililllililil();
                  var11 = true;
               } else if (this.llIIlilIIl(var8)) {
                  this.iIlIlIIIlIllIlIIIl = liIlliiIll<invokedynamic>();
                  this.Ililllililil();
                  var11 = true;
               }
            }

            if (var11) {
               liIIIilliiIIIill var16 = this.IiIiliIiiiIi(var8, var10, goal, focus, hint, allowDig);
               if (var16 != null) {
                  return var16;
               }
            }

            iiliilIlIIiiilIl var17 = (iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(this.liilIIIIliiilIIIIl);

            for(class_2338 var14 : var17.iIlIlllllill()) {
               class_2680 var15 = this.IIllIIIIllIllIIIIl.field_1687.method_8320(var14);
               if (!var15.method_26215() && (!var15.method_26220(this.IIllIIIIllIllIIIIl.field_1687, var14).method_1110() || !var15.method_45474())) {
                  if (allowDig && this.iillIIIIlIIilIIIIl.liiiIIllIl(var14.method_10263(), var14.method_10264(), var14.method_10260())) {
                     if (var17.liiiIIllIl() == IllIllllllIlll.lliiIIiililiiIIiil && var14.equals(var10.method_10074())) {
                        if (!this.iIllIIIIlIlllIIIIl.IiIiliIiiiIi(var10, 0.22)) {
                           this.iIllIIIIlIlllIIIIl.IIlilIliiIli(class_243.method_24955(var10), true);
                           return liIIIilliiIIIill.Illilllill;
                        }

                        if (liilIlIiiiilIlIi.Iilililiiili(this.IIllIIIIllIllIIIIl.field_1687, var14) || liilIlIiiiilIlIi.IIiilIiiiIii(this.IIllIIIIllIllIIIIl.field_1687, var8.method_5829(), var14, false)) {
                           this.iiIIlIIlIl(var8, var17.IliIlllilIi(), liIlliiIll<invokedynamic>());
                           this.Ililllililil();
                           return liIIIilliiIIIill.Illilllill;
                        }
                     }

                     this.lIIlliIIll(var8, var14, var17.IliIlllilIi());
                     return liIIIilliiIIIill.Illilllill;
                  } else {
                     this.iiIIlIIlIl(var8, var17.IliIlllilIi(), liIlliiIll<invokedynamic>() + var14.method_23854());
                     this.Ililllililil();
                     return liIIIilliiIIIill.Illilllill;
                  }
               }

               if (var14.equals(this.lliiIIIIliliiIIIIl)) {
                  ++this.IIiiIIIIllIiiIIIIl;
                  this.lliiIIIIliliiIIIIl = null;
               }
            }

            if (var17.lIiiIiIlilli() && !var8.method_5869() && this.IIiilIiiiIii(var8)) {
               this.liIIlIIIliiIIlIIIl = true;
               this.lIliIIIIliIliIIIIl = this.IiIiIIIIlliIiIIIIl;
               this.Iiilliiliiil();
               this.iIllIIIIlIlllIIIIl.IiIlliIliiIl(this.iIllIIIIlIlllIIIIl.IlIillIiilIi(class_243.method_24955(var17.IliIlllilIi())), 10.0F, 0);
               if (var9) {
                  this.iIllIIIIlIlllIIIIl.IilliliilIIi(16);
               }

               return liIIIilliiIIIill.Illilllill;
            } else {
               this.illIlIilIl(var8, var10, var17);
               this.IllIllllIl(var8, var17);
               return liIIIilliiIIIill.Illilllill;
            }
         }
      } else {
         this.Ililllililil();
         this.iIIiIIIIlIlIiIIIIl = null;
         if (!var9 && !this.iIllIIIIlIlllIIIIl.IiIiliIiiiIi(var10, 0.3)) {
            this.iIllIIIIlIlllIIIIl.IIlilIliiIli(class_243.method_24955(var10), IiIliillliIliill.lIiiIiIlilli(this.IillIIIIllillIIIIl, var10.method_10263(), var10.method_10264(), var10.method_10260()));
            return liIIIilliiIIIill.Illilllill;
         } else {
            return liIIIilliiIIIill.lllilllill;
         }
      }
   }

   private class_2338 IlIillIiilIi(class_746 p) {
      long var4 = -2841343902740720469L;
      if (p.method_5799()) {
         class_2338 var2 = class_2338.method_49637(p.method_23317(), p.method_23318() + Double.longBitsToDouble(7665887151014853936L ^ 6173074057305597098L), p.method_23321());
         var4 ^= ((long)this.IillIIIIllillIIIIl.IliIlllilIi(var2.method_10263(), var2.method_10264(), var2.method_10260()) << 32 ^ var4) & -1L << 32;
         if (lIilIiliIilIil.liiiIIllIl((int)(var4 >>> 32), 4) && lIilIiliIilIil.iIlIlllllill((int)(var4 >>> 32))) {
            return var2;
         }
      }

      return this.iIllIIIIlIlllIIIIl.Iiilliiliiil();
   }

   public List<class_2338> IIlllIlliIll() {
      if (this.IlilIIIIlllilIIIIl != null && this.liilIIIIliiilIIIIl < this.IlilIIIIlllilIIIIl.size()) {
         if (this.IIlIlIIIllIlIlIIIl == null) {
            ArrayList var1 = new ArrayList(this.IlilIIIIlllilIIIIl.size() - this.liilIIIIliiilIIIIl);

            for(int var2 = this.liilIIIIliiilIIIIl; var2 < this.IlilIIIIlllilIIIIl.size(); ++var2) {
               var1.add(((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(var2)).IliIlllilIi());
            }

            this.IIlIlIIIllIlIlIIIl = var1;
         }

         return this.IIlIlIIIllIlIlIIIl;
      } else {
         return null;
      }
   }

   public class_2338 Illlllllilll() {
      return this.IlilIIIIlllilIIIIl != null && !this.IlilIIIIlllilIIIIl.isEmpty() ? ((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(this.IlilIIIIlllilIIIIl.size() - 1)).IliIlllilIi() : null;
   }

   public void IlIlllIlilIl(class_2338 pos) {
      this.iillIIIIlIIilIIIIl.IlIlllIlilIl(pos);
   }

   // $FF: synthetic method
   private static CallSite iIlllIllll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - var5) ^ var5) << 15 | (char)((char)((char)(var4[var5] + var5) - var5) ^ var5) >>> 1))) - 14515) + var5))) - var5) ^ '헄') ^ var5))) + var5) ^ var5) ^ var5) + 2235) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int iIiIlIliIl(class_746 feet, class_2338 p) {
      int var3 = this.liilIIIIliiilIIIIl;
      class_243 var4 = feet.method_73189();
      int var5 = Math.min(this.IlilIIIIlllilIIIIl.size(), this.liilIIIIliiilIIIIl + 6);

      for(int var6 = this.liilIIIIliiilIIIIl; var6 < var5; var3 = var6++) {
         iiliilIlIIiiilIl var7 = (iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(var6);
         if (var7.liiiIIllIl() != IllIllllllIlll.liliIIiiliiliIIiil && var7.liiiIIllIl() != IllIllllllIlll.IiiiIIiilliiiIIiil || !var7.iIlIlllllill().isEmpty() || var7.IilliliilIIi() || var7.IliIlllilIi().method_10264() != p.method_10264() || !this.IiiIlliiIl(var4, class_243.method_24955(var7.IliIlllilIi()), p.method_10264())) {
            break;
         }
      }

      return var3;
   }

   public boolean lIiiIiIlilli() {
      return this.iIiiIIIIlIliiIIIIl != null;
   }

   // $FF: synthetic method
   private static CallSite iilllIIill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '쎑') ^ 29225) ^ 31564) + 23840) << 9 | (char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '쎑') ^ 29225) ^ 31564) + 23840) >>> 7))))))) ^ '輓') ^ var5))) + '톯') - var5) ^ '\udf2f') - var5) ^ '\uf75b') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIllllIlll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + 32121))))) - '鄾') ^ 20131) << 2 | (char)((char)((char)(~((char)(~((char)(var4[var5] + 32121))))) - '鄾') ^ 20131) >>> 14) - 1715))) - 15306))) >>> 14 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + 32121))))) - '鄾') ^ 20131) << 2 | (char)((char)((char)(~((char)(~((char)(var4[var5] + 32121))))) - '鄾') ^ 20131) >>> 14) - 1715))) - 15306))) << 2) ^ var5) + 29882));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIIIlIlIIl() {
      this.Ililllililil();
      this.iIIiIIIIlIlIiIIIIl = null;
   }

   private void iiIIlIIlIl(class_746 p, class_2338 cell, String reason) {
      if (cell != null) {
         this.iillIIIIlIIilIIIIl.IiIlliIliiIl(cell);
      }

      ++this.liliIIIIliiliIIIIl;
      this.iIlIlIIIlIllIlIIIl = reason;
      this.ilIIlIIIlIiIIlIIIl = p.method_73189();
   }

   public llIlIiilIlIi(IIiIIlilIiIIli body, IIiIiIillIiIiIil breaker, IiIIiIIlliIIiIIl cells) {
      this.iIllIIIIlIlllIIIIl = body;
      this.llllIIIIlilllIIIIl = breaker;
      this.IillIIIIllillIIIIl = cells;
      this.iillIIIIlIIilIIIIl = new llillIililillIil(cells);
   }

   // $FF: synthetic method
   private static CallSite lllllillll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) >>> 4 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) << 12))) ^ '\uef66'))) + '쭁') + '휷') << 12 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) >>> 4 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) << 12))) ^ '\uef66'))) + '쭁') + '휷') >>> 4) >>> 3 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) >>> 4 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) << 12))) ^ '\uef66'))) + '쭁') + '휷') << 12 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) >>> 4 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] - var5) ^ var5) ^ var5))) - var5))) - var5) << 12))) ^ '\uef66'))) + '쭁') + '휷') >>> 4) << 13) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean Iliilliiilii(class_746 s, class_2338 feet, iiliilIlIIiiilIl p) {
      if (!p.IilliliilIIi()) {
         return feet.equals(p.IliIlllilIi());
      } else {
         double var4 = s.method_23318() - (double)p.IliIlllilIi().method_10264();
         return this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(class_243.method_24955(p.IliIlllilIi())) <= Double.longBitsToDouble(-6273975498372197363L ^ -7561608508444193385L) && var4 > Double.longBitsToDouble(-4729989419994578105L ^ 123990405559431284L) && var4 < Double.longBitsToDouble(1964024217583712473L ^ 2643617409961746755L);
      }
   }

   private boolean llIIlilIIl(class_746 p) {
      int var2 = Math.max(0, this.liilIIIIliiilIIIIl - 1);
      int var3 = Math.min(this.IlilIIIIlllilIIIIl.size(), this.liilIIIIliiilIIIIl + 6);
      double var4 = Double.MAX_VALUE;

      for(int var6 = var2; var6 < var3; ++var6) {
         var4 = Math.min(var4, this.IiIIlliIIl(p, ((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(var6)).IliIlllilIi()));
      }

      if (this.liilIIIIliiilIIIIl == 0 && this.IIIiIIIIllIIiIIIIl != null) {
         var4 = Math.min(var4, this.IiIIlliIIl(p, this.IIIiIIIIllIIiIIIIl));
      }

      return var4 > 2.6;
   }

   private void lilIliilIl(class_746 p, class_243 jump, boolean aim, boolean coast, boolean run) {
      float var6 = this.iIllIIIIlIlllIIIIl.IlIillIiilIi(jump);
      this.iIllIIIIlIlllIIIIl.IiIlliIliiIl(var6, 10.0F, 0);
      float var7 = Math.abs(class_3532.method_15393(var6 - p.method_36454()));
      double var8 = this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(jump);
      if (var7 < 50.0F && !run) {
         this.iIllIIIIlIlllIIIIl.IilliliilIIi(1);
         if (aim && var7 < 18.0F && p.method_7344().method_7586() > ((~465133074 >>> 11 | ~465133074 << 21) ^ 1035765970)) {
            this.iIllIIIIlIlllIIIIl.IilliliilIIi(-(~91735945 - -17) ^ 91735865);
         }
      } else if (!run && var8 < Double.longBitsToDouble(-3986188355267266668L ^ -629666105866962087L)) {
         this.iIllIIIIlIlllIIIIl.IIlilIliiIli(jump, false);
      }

      if (coast && var7 < 35.0F) {
         this.iIllIIIIlIlllIIIIl.IilliliilIIi((~(~-982249210) - -123) * 483939977 ^ -1982417895);
      }

   }

   // $FF: synthetic method
   private static CallSite Iillllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 14208))) + 'ﰞ') - var5))) >>> 12 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 14208))) + 'ﰞ') - var5))) << 4) << 12 | (char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 14208))) + 'ﰞ') - var5))) >>> 12 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) - 14208))) + 'ﰞ') - var5))) << 4) >>> 4) + var5) + '馧') + var5) - var5) + var5))) - '쵰'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void Ililllililil() {
      this.IlilIIIIlllilIIIIl = null;
      this.liilIIIIliiilIIIIl = 0;
      this.IIlIlIIIllIlIlIIIl = null;
      this.Iiilliiliiil();
   }

   private void IllIllllIl(class_746 p, iiliilIlIIiiilIl st) {
      long var6 = 7359656469186364778L;
      double var3 = this.IiIIlliIIl(p, st.IliIlllilIi());
      if (var3 < this.iiiiIIIIlIIIIlIIIl - Double.longBitsToDouble(-6621908426550885689L ^ -7226877658133308289L)) {
         this.iiiiIIIIlIIIIlIIIl = var3;
         this.lIIIlIIIliIIIlIIIl = 0;
      } else {
         ++this.lIIIlIIIliIIIlIIIl;
      }

      var6 ^= ((long)(p.field_5976 && p.method_24828() && !p.method_5799() && st.IliIlllilIi().method_10264() == this.iIllIIIIlIlllIIIIl.Iiilliiliiil().method_10264() ? 1 : 0) << 32 ^ var6) & -1L << 32;
      this.IlIIlIIIlllIIlIIIl = (int)(var6 >>> 32) != 0 ? this.IlIIlIIIlllIIlIIIl + 1 : 0;
      if ((this.lIIIlIIIliIIIlIIIl == (~(-490178161 << 1 | -490178161 >>> 31) * -99 ^ 1728972138) || this.IlIIlIIIlllIIlIIIl == (((-(~-359200512) >>> 3 | -(~-359200512) << 29) << 17 | (-(~-359200512) >>> 3 | -(~-359200512) << 29) >>> 15) ^ -1035961693)) && p.method_24828()) {
         this.iIllIIIIlIlllIIIIl.IilliliilIIi(~(--432249345 >>> 5 | --432249345 << 27) - -13 ^ -147725524);
      }

      if (this.lIIIlIIIliIIIlIIIl >= (-1500590308 + 45 ^ -1500590231)) {
         this.iiIIlIIlIl(p, st.IliIlllilIi(), liIlliiIll<invokedynamic>());
         this.Ililllililil();
      }

   }

   private double lliIliliIl(int last) {
      if (last + 1 >= this.IlilIIIIlllilIIIIl.size()) {
         return (double)0.0F;
      } else {
         class_2338 var2 = last > 0 ? ((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(last - 1)).IliIlllilIi() : this.IIIiIIIIllIIiIIIIl;
         class_2338 var3 = ((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(last)).IliIlllilIi();
         class_2338 var4 = ((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(last + 1)).IliIlllilIi();
         if (var2 == null) {
            return (double)0.0F;
         } else {
            double var5 = Math.toDegrees(Math.atan2((double)(var3.method_10260() - var2.method_10260()), (double)(var3.method_10263() - var2.method_10263())));
            double var7 = Math.toDegrees(Math.atan2((double)(var4.method_10260() - var3.method_10260()), (double)(var4.method_10263() - var3.method_10263())));
            return Math.abs(class_3532.method_15338(var7 - var5));
         }
      }
   }

   private boolean IiiIlliiIl(class_243 y, class_243 to, int from) {
      double var4 = to.field_1352 - y.field_1352;
      double var6 = to.field_1350 - y.field_1350;
      double var8 = Math.hypot(var4, var6);
      int var10 = Math.max(1, (int)Math.ceil(var8 / 0.3));

      for(int var11 = 0; var11 <= var10; ++var11) {
         double var12 = (double)var11 / (double)var10;
         double var14 = y.field_1352 + var4 * var12;
         double var16 = y.field_1350 + var6 * var12;
         if (!lIilIiliIilIil.IilliliilIIi(this.IillIIIIllillIIIIl.IliIlllilIi(class_3532.method_15357(var14), from - 1, class_3532.method_15357(var16)))) {
            return false;
         }

         for(double var21 : liIlIIIIliiIlIIIIl) {
            for(double var26 : liIlIIIIliiIlIIIIl) {
               int var28 = class_3532.method_15357(var14 + var21);
               int var29 = class_3532.method_15357(var16 + var26);
               if (this.iillIIIIlIIilIIIIl.IliIlllilIi(var28, from, var29) || this.iillIIIIlIIilIIIIl.IliIlllilIi(var28, from + 1, var29) || this.iillIIIIlIIilIIIIl.IilliliilIIi(var28, from, var29) || this.iillIIIIlIIilIIIIl.IilliliilIIi(var28, from + 1, var29)) {
                  return false;
               }

               int var30 = this.IillIIIIllillIIIIl.IliIlllilIi(var28, from, var29);
               int var31 = this.IillIIIIllillIIIIl.IliIlllilIi(var28, from + 1, var29);
               int var32 = this.IillIIIIllillIIIIl.IliIlllilIi(var28, from - 1, var29);
               if (lIilIiliIilIil.liiiIIllIl(var30 | var31, 286)) {
                  return false;
               }

               if (lIilIiliIilIil.liiiIIllIl(var32, 26)) {
                  return false;
               }
            }
         }
      }

      return true;
   }

   private boolean IIIIllIIIl(int k) {
      iiliilIlIIiiilIl var2 = (iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(k);
      return var2.IilliliilIIi() && !var2.lIiiIiIlilli() && k + 1 < this.IlilIIIIlllilIIIIl.size() && ((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(k + 1)).lIiiIiIlilli();
   }

   public class_2338 IIIilIIiiIIi(class_746 p) {
      return this.IlIillIiilIi(p);
   }

   private void Iiilliiliiil() {
      this.iiiiIIIIlIIIIlIIIl = Double.longBitsToDouble(4820658112156813582L ^ 4398210325070591729L);
      this.lIIIlIIIliIIIlIIIl = 0;
      this.IlIIlIIIlllIIlIIIl = 0;
   }

   private void lIIlliIIll(class_746 b, class_2338 p, class_2338 stepFeet) {
      this.iIiiIIIIlIliiIIIIl = p;
      this.lliiIIIIliliiIIIIl = p;
      lIlIiiiliIlIiiil var4 = this.llllIIIIlilllIIIIl.IIIllIIliIIl(p, false);
      if (var4 == lIlIiiiliIlIiiil.IiIiiIIiil) {
         ++this.IIiiIIIIllIiiIIIIl;
         this.lliiIIIIliliiIIIIl = null;
         this.iIiiIIIIlIliiIIIIl = null;
      } else if (var4 == lIlIiiiliIlIiiil.iiIiiIIiil) {
         this.iiIIlIIlIl(b, stepFeet, liIlliiIll<invokedynamic>() + p.method_23854());
         this.Ililllililil();
         this.llllIIIIlilllIIIIl.IilliliilIIi();
         this.iIiiIIIIlIliiIIIIl = null;
      } else if (var4 == lIlIiiiliIlIiiil.ilIiiIIiil) {
         this.llllIIIIlilllIIIIl.lIiiIiIlilli(true);
         if (this.llllIIIIlilllIIIIl.IlIlllIlilIl()) {
            this.IiiiIIIIlliiiIIIIl = 0;
         } else {
            class_243 var5 = this.iIllIIIIlIlllIIIIl.Iliilliiilii(p, (double)4.5F);
            if (var5 != null && this.iIllIIIIlIlllIIIIl.IIIIllIIIl(var5, 2.5F)) {
               class_3965 var6 = this.iIllIIIIlIlllIIIIl.IIiilIiiiIii((double)4.5F);
               if (var6.method_17783() == class_240.field_1332 && var6.method_17777().equals(p)) {
                  this.IiiiIIIIlliiiIIIIl = 0;
               } else {
                  if (++this.IiiiIIIIlliiiIIIIl > 8) {
                     this.IiiiIIIIlliiiIIIIl = 0;
                     this.iiIIlIIlIl(b, stepFeet, liIlliiIll<invokedynamic>() + p.method_23854());
                     this.Ililllililil();
                     this.llllIIIIlilllIIIIl.IilliliilIIi();
                     this.iIiiIIIIlIliiIIIIl = null;
                  }

               }
            }
         }
      }
   }

   private void illIlIilIl(class_746 st, class_2338 p, iiliilIlIIiiilIl feet) {
      class_243 var4 = class_243.method_24955(feet.IliIlllilIi());
      IllIllllllIlll var5 = feet.liiiIIllIl();
      if (!st.method_5799() && !feet.IilliliilIIi() && var5 != IllIllllllIlll.iiiiIIiilIIIIlIiil && var5 != IllIllllllIlll.lIIIlIiiliIIIlIiil && var5 != IllIllllllIlll.IlIIlIiilllIIlIiil) {
         switch (var5) {
            case liliIIiiliiliIIiil:
            case IiiiIIiilliiiIIiil:
               int var6 = this.iIiIlIliIl(st, p);
               class_243 var7 = class_243.method_24955(((iiliilIlIIiiilIl)this.IlilIIIIlllilIIIIl.get(var6)).IliIlllilIi());
               boolean var8 = this.iiiIlIIIll(st, var7);
               boolean var9 = st.method_5624() && this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(var7) < 1.2 && this.lliIliliIl(var6) > (double)60.0F;
               this.lilIliilIl(st, var7, var8, false, var9);
               break;
            case IIiiIIiillIiiIIiil:
               this.lilIliilIl(st, var4, false, st.method_24828() && this.iIllIIIIlIlllIIIIl.IIIilIIiiIIi(var4) < (double)1.25F, false);
               break;
            case lliiIIiililiiIIiil:
               this.iIllIIIIlIlllIIIIl.IIlilIliiIli(var4, true);
               break;
            default:
               this.lilIliilIl(st, var4, false, false, false);
         }

      } else {
         this.IIiIllIiIl(st, feet, var4);
      }
   }

   private void lIlIliIlIl(class_746 p) {
      if (this.liliIIIIliiliIIIIl > 0 && this.ilIIlIIIlIiIIlIIIl != null) {
         if (!(p.method_73189().method_1022(this.ilIIlIIIlIiIIlIIIl) < Double.longBitsToDouble(-115440634629073944L ^ -4736133852311202840L))) {
            --this.liliIIIIliiliIIIIl;
            this.ilIIlIIIlIiIIlIIIl = p.method_73189();
         }
      }
   }
}
