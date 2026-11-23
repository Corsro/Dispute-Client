package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_746;
import net.minecraft.class_239.class_240;

public class ilIIIiIiIiIIIiIi extends ilIllIiIll {
   private int iilllilIIi;
   private static final double IiiIlilIIi = (double)20.0F;
   private final iiIiiilIIliiil iIIllilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int lIiIlilIIi = 700;
   private static final double liiIlilIIi = 0.1;
   private final IIIIlilllIIIlill ilIllilIIi = new illiliIiIililiIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)5.0F, (double)1.0F, (double)10.0F, 0.1);
   private final iiIiiilIIliiil llIllilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final lliliIIiililiIIi lIIllilIIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iiIIIlIIlIIl iIlllilIIi = new iiIIIlIIlIIl(new Random());
   private final iiIiiilIIliiil IIlllilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil lIlllilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private long IIillilIIi;
   private final IIIIlilllIIIlill IiIllilIIi = new illiliIiIililiIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)180.0F, (double)1.0F, (double)360.0F, (double)1.0F);
   private static final double iliIlilIIi = (double)40.0F;
   private final IIIIlilllIIIlill IlIllilIIi = new illiliIiIililiIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)5.0F, (double)1.0F, (double)10.0F, 0.1);
   private int lilllilIIi;
   private final lliliIIiililiIIi IIIllilIIi = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final iiIiiilIIliiil iiIllilIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final long lliIlilIIi = 250L;
   private final IIIIlilllIIIlill liIllilIIi = new illiliIiIililiIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)5.0F, (double)1.0F, (double)8.0F, 0.1);
   private static final int iIiIlilIIi = 20;
   private final lIilIIliiIilIIli lllllilIIi = new lIilIIliiIilIIli(1000);
   private final ilIlIlIiIlIl IllllilIIi = new ilIlIlIiIlIl(new Random());
   private class_243 iIillilIIi;
   private class_1309 IilllilIIi;
   private static final double IliIlilIIi = (double)15.0F;
   private static final lilllliiilllli iiiIlilIIi;
   private final IiIiIIilliIiIIil illllilIIi = new IiIiIIilliIiIIil((double)40.0F, (double)20.0F);
   private String lIillilIIi = "";
   private static final int IIiIlilIIi = 1000;

   private void lIilliIill() {
      this.IilllilIIi = null;
      this.iilllilIIi = 0;
      this.iIillilIIi = null;
      this.iIlllilIIi.IliIlllilIi();
      this.IllllilIIi.IliIlllilIi();
   }

   private boolean IlIllllIll(class_1309 e) {
      if (liiIIIlliiiIIIll.IliIlllilIi(e, this.IIllllIlll()) && e != Iiiilllliiilll.field_1724.method_5854()) {
         if (liiIIIlliiiIIIll.IIIllIIliIIl(e) > this.liIllilIIi.Iilllilliill()) {
            return false;
         } else {
            double var2 = this.IiIllilIIi.Iilllilliill();
            if (var2 < Double.longBitsToDouble(1998085989907772056L ^ 6614697820427596440L) && this.liIlliiIll(e) > var2 / Double.longBitsToDouble(-9010996526607258281L ^ -4399310508179870377L) + Double.longBitsToDouble(-8548445104216391894L ^ -3930566636301369558L)) {
               return false;
            } else {
               return !this.iiIllilIIi.Iilllilliill() || liiIIIlliiiIIIll.Illlllllilll(e);
            }
         }
      } else {
         return false;
      }
   }

   private liIiiiIiiiIiiiIi lllllillll(int tickDelta, float steps) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      class_243 var4 = var3.method_5836(steps);
      class_243 var5 = this.IilllilIIi.method_30950(steps);
      class_238 var6 = this.IilllilIIi.method_5829();
      class_243 var7 = var3.method_18798();
      lliIliiliIli var8 = new lliIliiliIli(var4.field_1352, var4.field_1351, var4.field_1350, var3.method_24828(), var5.field_1352, var5.field_1350, var6.field_1322, var6.field_1325, this.IilllilIIi.method_23317() - this.IilllilIIi.field_6014, this.IilllilIIi.method_23318() - this.IilllilIIi.field_6036, this.IilllilIIi.method_23321() - this.IilllilIIi.field_5969, var7.field_1352, var7.field_1351, var7.field_1350, (double)var3.method_5739(this.IilllilIIi), (double)var3.method_36454(), (double)var3.method_36455(), (double)var3.field_3913.method_3128().field_1343);
      double var9 = (double)IilIIilllilIIill.iIlIlllllill();
      double var11 = this.IlIllilIIi.Iilllilliill();
      double var13 = this.ilIllilIIi.Iilllilliill();
      boolean var15 = this.llIllilIIi.Iilllilliill();
      boolean var16 = this.lIlllilIIi.Iilllilliill();

      for(int var17 = 0; var17 < tickDelta; ++var17) {
         this.IllllilIIi.liiiIIllIl(var8, var11, var13, var15, var16, var9);
      }

      return this.IllllilIIi.iIlIlllllill();
   }

   private void lIIlliIIll(int steps) {
      this.lilllilIIi += steps;
      if (this.IilllilIIi != null && !this.IlIllllIll(this.IilllilIIi)) {
         this.lIilliIill();
      }

      if (this.IilllilIIi == null) {
         if (this.iilllilIIi > 0) {
            this.iilllilIIi -= steps;
         } else {
            this.iilllilIIi = 20;
            class_1309 var3 = this.ilIllIiIll();
            if (var3 != null) {
               this.IilllilIIi = var3;
               this.lilllilIIi = 0;
               this.iilllIIill();
            }

         }
      } else if (!this.iIIllilIIi.Iilllilliill() && this.lilllilIIi > 700) {
         this.lilllilIIi = 0;
         class_1309 var2 = this.ilIllIiIll();
         if (var2 != null && var2 != this.IilllilIIi) {
            this.IilllilIIi = var2;
            this.iilllIIill();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) << 12 | (char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) >>> 4) - '\uf134') ^ 31013))) + '쟓') + '﹑') >>> 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) << 12 | (char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) >>> 4) - '\uf134') ^ 31013))) + '쟓') + '﹑') << 7) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) << 12 | (char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) >>> 4) - '\uf134') ^ 31013))) + '쟓') + '﹑') >>> 9 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) << 12 | (char)((char)((char)(var4[var5] + var5) >>> 1 | (char)(var4[var5] + var5) << 15) ^ var5) >>> 4) - '\uf134') ^ 31013))) + '쟓') + '﹑') << 7) << 5) + var5) - var5) + var5) - var5) + '흷') + '肈'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private class_1309 ilIllIiIll() {
      double var1 = this.IiIllilIIi.Iilllilliill();
      class_1297 var3 = Iiiilllliiilll.field_1724.method_5854();
      class_1309 var4 = null;
      double var5 = Double.MAX_VALUE;
      double var7 = Double.MAX_VALUE;

      for(class_1309 var10 : liiIIIlliiiIIIll.Iilllilliill(this.liIllilIIi.Iilllilliill(), this.IIllllIlll())) {
         if (var10 != var3) {
            double var11 = this.liIlliiIll(var10);
            if ((!(var1 < (double)360.0F) || !(var11 > var1 / (double)2.0F)) && (!this.iiIllilIIi.Iilllilliill() || liiIIIlliiiIIIll.Illlllllilll(var10))) {
               double var13 = liiIIIlliiiIIIll.IIIllIIliIIl(var10);
               if (var11 < var5 - 1.0E-6 || Math.abs(var11 - var5) <= 1.0E-6 && var13 < var7) {
                  var4 = var10;
                  var5 = var11;
                  var7 = var13;
               }
            }
         }
      }

      return var4;
   }

   private liIiiiIiiiIiiiIi iIlllIllll(int steps, float tickDelta) {
      class_746 var3 = Iiiilllliiilll.field_1724;
      class_243 var4 = var3.method_5836(tickDelta);
      class_243 var5 = this.IilllilIIi.method_30950(tickDelta);
      double var6 = (double)0.0F;
      double var8 = (double)0.0F;
      if (this.iIillilIIi != null) {
         var6 = (var5.field_1352 - this.iIillilIIi.field_1352) / (double)steps;
         var8 = (var5.field_1350 - this.iIillilIIi.field_1350) / (double)steps;
      }

      this.iIillilIIi = var5;
      double var10 = var5.field_1352 + var6 * 1.7;
      double var12 = var5.field_1350 + var8 * 1.7;
      float var14 = var3.method_36454();
      double var15 = lliillililiillil.IilliliilIIi((double)var14, var10 - var4.field_1352, var12 - var4.field_1350);
      double var17 = Math.abs(lliillililiillil.IilliliilIIi((double)var14, this.IilllilIIi.method_23317() - var3.method_23317(), this.IilllilIIi.method_23321() - var3.method_23321()));
      double var19 = class_3532.method_15350(var4.field_1351, var5.field_1351 + 0.1, var5.field_1351 + Math.max(0.1, (double)this.IilllilIIi.method_17682() - 0.1));
      double var21 = Math.hypot(var5.field_1352 - var4.field_1352, var5.field_1350 - var4.field_1350);
      double var23 = lliillililiillil.IliIlllilIi(lliillililiillil.iIlIlllllill(var19 - var4.field_1351, var21) - (double)var3.method_36455());
      double var25 = (double)var3.method_5739(this.IilllilIIi);
      double var27 = (double)var3.field_3913.method_3128().field_1343;
      double var29 = this.IlIllilIIi.Iilllilliill();
      double var31 = this.ilIllilIIi.Iilllilliill();
      boolean var33 = this.llIllilIIi.Iilllilliill();
      boolean var34 = this.lIlllilIIi.Iilllilliill();

      for(int var35 = 0; var35 < steps; ++var35) {
         this.iIlllilIIi.iIlIlllllill(var15, var17, var23, var25, var27, var29, var31, var33, var34);
      }

      return this.iIlllilIIi.IilliliilIIi();
   }

   private void Iillllilll(liIiiiIiiiIiiiIi counts) {
      long var11 = 4302919261927561481L;
      if (!counts.IliIlllilIi()) {
         float var2 = IilIIilllilIIill.iIlIlllllill();
         var11 ^= ((long)this.illllilIIi.liiiIIllIl(counts.iIlIlllllill(), (double)var2) << 32 ^ var11) & -1L << 32;
         var11 ^= ((long)this.illllilIIi.iIlIlllllill(counts.IilliliilIIi(), (double)var2) ^ var11) & -1L >>> 32;
         if ((int)(var11 >>> 32) != 0 || (int)var11 != 0) {
            class_746 var5 = Iiiilllliiilll.field_1724;
            float var6 = var5.method_36454();
            float var7 = var5.method_36455();
            float var8 = (float)((int)(var11 >>> 32)) * var2;
            float var9 = class_3532.method_15363(var7 + (float)((int)var11) * var2, -90.0F, 90.0F);
            float var10 = var9 - var7;
            var5.method_36456(var6 + var8);
            var5.method_36457(var9);
            var5.field_5982 += var8;
            var5.field_6004 += var10;
         }
      }
   }

   static {
      iiiIlilIIi = lilllliiilllli.IIliIiIIIl.IliIlllilIi(false);
   }

   protected void iIIIlIlIIl() {
      this.illllilIIi.IliIlllilIi();
      if (Iiiilllliiilll.field_1724 == null || Iiiilllliiilll.field_1687 == null || Iiiilllliiilll.field_1755 != null) {
         this.lIilliIill();
         this.lllllilIIi.liiiIIllIl();
      }

   }

   public ilIIIiIiIiIIIiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIllilIIi, this.lIIllilIIi, this.iIIllilIIi, this.IlIllilIIi, this.llIllilIIi, this.ilIllilIIi, this.IiIllilIIi, this.liIllilIIi, this.iiIllilIIi, this.IIlllilIIi, this.lIlllilIIi});
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2685558999888569640L ^ Long.rotateLeft(2728502699066372142L, 4) ^ -5285290352162234141L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7839360618789444552L ^ Long.rotateLeft(1960983742403982417L, 7) ^ 201596330970422973L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4018112643525481701L ^ Long.rotateLeft(6848190017895310412L, 46) ^ -2351664970704510871L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3885599097817465536L ^ Long.rotateLeft(-1775165686582741444L, 62) ^ -3323705323657375923L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6318673104593510739L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1095393970525192421L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1737732293473041143L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3522844499479599004L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5015499642443340463L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1887886949339817447L;
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

   protected void Iilililiiili() {
      this.Ilillllill();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') << 15) ^ var5) - var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') << 15) ^ var5) - var5) >>> 10))))) >>> 14 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') << 15) ^ var5) - var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) >>> 7 | (char)((char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) >>> 3 | (char)((char)(var4[var5] ^ var5) >>> 13 | (char)(var4[var5] ^ var5) << 3) << 13) << 9) ^ 32325) + var5) - '꿍') << 15) ^ var5) - var5) >>> 10))))) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      int var2 = this.lllllilIIi.IliIlllilIi(System.nanoTime());
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1690 != null && Iiiilllliiilll.field_1755 == null) {
         String var3 = this.IIIllilIIi.Iilllilliill();
         if (!var3.equals(this.lIillilIIi)) {
            this.lIillilIIi = var3;
            this.lIilliIill();
         }

         if (!this.iiiIlIIIll()) {
            this.lIilliIill();
         } else if (this.iIIllilIIi.Iilllilliill() && !IillIIIllillIIIl.IliIlllilIi(Iiiilllliiilll.field_1690.field_1886)) {
            this.lIilliIill();
         } else {
            this.lIIlliIIll(var2);
            if (this.IilllilIIi != null && var2 > 0) {
               liIiiiIiiiIiiiIi var4 = IliIlllilIi<invokedynamic>().equals(this.lIillilIIi) ? this.lllllillll(var2, event.lIiIilIIIl) : this.iIlllIllll(var2, event.lIiIilIIIl);
               this.Iillllilll(var4);
            }
         }
      } else {
         this.lIilliIill();
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) >>> 14 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) << 2) - 10230) + 17805))) << 15 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) >>> 14 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) << 2) - 10230) + 17805))) >>> 1) + var5) ^ '\ue74a'))) << 6 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) >>> 14 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) << 2) - 10230) + 17805))) << 15 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) >>> 14 | (char)((char)(~((char)((char)((char)(var4[var5] >>> 6 | var4[var5] << 10) >>> 8 | (char)(var4[var5] >>> 6 | var4[var5] << 10) << 8) + var5))) + var5) << 2) - 10230) + 17805))) >>> 1) + var5) ^ '\ue74a'))) >>> 10));
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
         var4[var5] = (char)((char)(-((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 21978) >>> 2 | (char)(var4[var5] ^ 21978) << 14) << 14 | (char)((char)(var4[var5] ^ 21978) >>> 2 | (char)(var4[var5] ^ 21978) << 14) >>> 2) ^ 17681) - var5) - var5) - var5) - 'ꚾ') + var5))) + var5) ^ var5))) << 11 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 21978) >>> 2 | (char)(var4[var5] ^ 21978) << 14) << 14 | (char)((char)(var4[var5] ^ 21978) >>> 2 | (char)(var4[var5] ^ 21978) << 14) >>> 2) ^ 17681) - var5) - var5) - var5) - 'ꚾ') + var5))) + var5) ^ var5))) >>> 5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iiiIlIIIll() {
      if (!lilIliIiiilIliIi.iiiIlIIIll() && !iIIilIIiIlIilIIi.lIIlliIIll()) {
         ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
         if (var2 instanceof iIiIlillIliIlill) {
            iIiIlillIliIlill var1 = (iIiIlillIliIlill)var2;
            if (var1.IliIlllilIi() && (var1.iIlllIllll() || iIiIlillIliIlill.iilllIIill())) {
               return false;
            }
         }

         if (IIllIIlilIllIIli.IIIilIIiiIIi()) {
            return false;
         } else {
            var2 = llilIllililIll.iliIiiliiiii(iIIliIiIlIliIi.class);
            if (var2 instanceof iIIliIiIlIliIi) {
               iIIliIiIlIliIi var4 = (iIIliIiIlIliIi)var2;
               if (var4.IliIlllilIi() && var4.liIlliiIll()) {
                  return false;
               }
            }

            if (iIlIilIlIllIilIl.illliiIillii()) {
               return false;
            } else if (ilIiiIiIii.IlIlllIlilIl() && !ilIiiIiIii.IiIlliIliiIl()) {
               return false;
            } else if (!ilIiiIiIii.IIlllIlliIll() && !ilIiiIiIii.Illlllllilll()) {
               if (this.IIlllilIIi.Iilllilliill() && !lliillliliilll.IliIlllilIi(Iiiilllliiilll.field_1724.method_6047())) {
                  return false;
               } else {
                  long var5 = System.currentTimeMillis();
                  boolean var3 = lliillliliilll.liiiIIllIl(Iiiilllliiilll.field_1724.method_6047()) && Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1332;
                  if (var3) {
                     this.IIillilIIi = var5 + 250L;
                     return false;
                  } else {
                     return var5 >= this.IIillilIIi;
                  }
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   protected void Illillliilli() {
      this.Ilillllill();
   }

   private void Ilillllill() {
      this.lIilliIill();
      this.iIlllilIIi.liiiIIllIl();
      this.lllllilIIi.liiiIIllIl();
      this.illllilIIi.IliIlllilIi();
      this.lilllilIIi = 0;
      this.IIillilIIi = 0L;
      this.lIillilIIi = this.IIIllilIIi.Iilllilliill();
   }

   private void iilllIIill() {
      this.iIillilIIi = null;
      this.IllllilIIi.IliIlllilIi();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~var4[var5]))))) + 'ꗍ') << 14 | (char)((char)(~((char)(~((char)(~var4[var5]))))) + 'ꗍ') >>> 2) + 27267) - '샀') - 27398))) - 1212) - 18137) ^ var5))) ^ var5) - var5) ^ var5) ^ 12984) + 19487));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lilllliiilllli IIllllIlll() {
      String var1 = this.lIIllilIIi.Iilllilliill();
      byte var2 = -1;
      switch (var1.hashCode()) {
         case 2403731:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
            break;
         case 2024244918:
            if (var1.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
      }

      lilllliiilllli var10000;
      switch (var2) {
         case 0 -> var10000 = lilllliiilllli.IIliIiIIIl;
         case 1 -> var10000 = iiiIlilIIi;
         default -> var10000 = lilllliiilllli.iiIiIiIIIl;
      }

      return var10000;
   }

   private double liIlliiIll(class_1297 e) {
      return Math.abs(lliillililiillil.IilliliilIIi((double)Iiiilllliiilll.field_1724.method_36454(), e.method_23317() - Iiiilllliiilll.field_1724.method_23317(), e.method_23321() - Iiiilllliiilll.field_1724.method_23321()));
   }
}
