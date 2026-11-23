package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_10370;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1675;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2797;
import net.minecraft.class_2805;
import net.minecraft.class_2811;
import net.minecraft.class_2813;
import net.minecraft.class_2820;
import net.minecraft.class_2824;
import net.minecraft.class_2828;
import net.minecraft.class_2840;
import net.minecraft.class_2846;
import net.minecraft.class_2863;
import net.minecraft.class_2873;
import net.minecraft.class_2877;
import net.minecraft.class_2885;
import net.minecraft.class_2886;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_3966;
import net.minecraft.class_7472;
import net.minecraft.class_9449;
import net.minecraft.class_239.class_240;
import net.minecraft.class_2846.class_2847;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;
import org.joml.Matrix4f;

public class llIIIIIlilIIIIIl extends ilIllIiIll {
   private static final double ilIlIiIlIl = (double)3.0F;
   private int lillIiIlIl = -1;
   private static final double IlIlIiIlIl = (double)10.0F;
   private static final int liIlIiIlIl = 1078233343;
   private class_243 iillIiIlIl;
   private long lIilIiIlIl;
   private static final double IiIlIiIlIl = 0.0025;
   private final lliliIIiililiIIi iIllIiIlIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private long iIilIiIlIl = Long.MIN_VALUE;
   private final IiIllliliIllli IillIiIlIl = new IiIllliliIllli();
   private final ArrayDeque<lIIllIlliIIllIll> illlIiIlIl = new ArrayDeque();
   private long llilIiIlIl = -1L;
   private final iiIiiilIIliiil llllIiIlIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final long llIlIiIlIl = 500L;
   private class_243 IIilIiIlIl;
   private static final float IIllIiIlIl = 1.5F;
   private static final int iiIlIiIlIl = -1438349057;
   private final iilliIlIIiliIl IlllIiIlIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 100, 10, 1000, 10);
   private long IlilIiIlIl;
   private static final lilllliiilllli lIllIiIlIl;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 29794) << 4 | (char)(var4[var5] ^ 29794) >>> 12) << 10 | (char)((char)(var4[var5] ^ 29794) << 4 | (char)(var4[var5] ^ 29794) >>> 12) >>> 6) + var5) ^ 12588))))) - '쾦') + var5))) + var5) + var5) << 1 | (char)((char)((char)(~((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 29794) << 4 | (char)(var4[var5] ^ 29794) >>> 12) << 10 | (char)((char)(var4[var5] ^ 29794) << 4 | (char)(var4[var5] ^ 29794) >>> 12) >>> 6) + var5) ^ 12588))))) - '쾦') + var5))) + var5) + var5) >>> 15) ^ 5925) ^ '遼'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iIlllIllll(IiIiIlIiliIiIlIi moved, class_243 event) {
      if (event != null && !moved.IilliliilIIi()) {
         if (this.illlIiIlIl.isEmpty()) {
            this.IIilIiIlIl = event;
         } else {
            this.illlIiIlIl.addLast(new lIIllIlliIIllIll(event, 0L));
         }

      }
   }

   private void iilllIIill() {
      this.illlIiIlIl.clear();
      this.lillIiIlIl = -1;
      this.iillIiIlIl = null;
      this.IIilIiIlIl = null;
      this.lIilIiIlIl = 0L;
      this.iIilIiIlIl = -246764351101195405L ^ 8976607685753580403L;
      this.IlilIiIlIl = 0L;
   }

   private static boolean ilIllIiIll(class_2596<?> p) {
      return p instanceof class_2824 || p instanceof class_2885 || p instanceof class_2886 || p instanceof class_2846 || p instanceof class_2797 || p instanceof class_7472 || p instanceof class_9449 || p instanceof class_2805 || p instanceof class_2873 || p instanceof class_2811 || p instanceof class_2863 || p instanceof class_2840 || p instanceof class_2877 || p instanceof class_2820 || p instanceof class_10370;
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (this.llllIiIlIl.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         this.lllllillll(IIIiillllIIiilll.IliIlllilIi());
         class_243 var2 = this.IIilIiIlIl;
         if (var2 != null && iiIliillIIlliill.iIlIlllllill(this)) {
            if (!(var2.method_1025(Iiiilllliiilll.field_1724.method_73189()) < 0.0025)) {
               float var3 = Iiiilllliiilll.field_1724.method_17681() / 2.0F;
               float var4 = Iiiilllliiilll.field_1724.method_17682();
               if (!iIiiIIilIliiIIil.IlIillIiilIi(var2.field_1352, var2.field_1351 + (double)var4 / (double)2.0F, var2.field_1350, var4)) {
                  Matrix4f var5 = iIiiIIilIliiIIil.IIillIiliIil();
                  float var6 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 - (double)var3);
                  float var7 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351);
                  float var8 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 - (double)var3);
                  float var9 = iIiiIIilIliiIIil.Ililllililil(var2.field_1352 + (double)var3);
                  float var10 = iIiiIIilIliiIIil.Iiilliiliiil(var2.field_1351 + (double)var4);
                  float var11 = iIiiIIilIliiIIil.IIIilIIiiIIi(var2.field_1350 + (double)var3);
                  iIiiIIilIliiIIil.IIlilIliiIli(var5, var6, var7, var8, var9, var10, var11, 0.26666668F, 0.53333336F, 1.0F, 0.2509804F);
                  iIiiIIilIliiIIil.iIIIlIlIIl(var5, var6, var7, var8, var9, var10, var11, -1438349057, 1.5F);
               }
            }
         }
      }
   }

   protected void Illillliilli() {
      this.iilllIIill();
      this.IillIiIlIl.IliIlllilIi(Iiiilllliiilll.field_1687);
      this.llilIiIlIl = IIIiillllIIiilll.iIlIlllllill();
      this.IIilIiIlIl = Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_73189() : null;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) ^ '\uf612') + var5))) + 2729))))))) ^ 19455))) ^ 29785) >>> 7 | (char)((char)(~((char)((char)(-((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 6 | (char)(var4[var5] + var5) << 10) ^ '\uf612') + var5))) + 2729))))))) ^ 19455))) ^ 29785) << 9) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IIllllIlll() {
      this.lIilIiIlIl = 0L;
      if (iiIliillIIlliill.iIlIlllllill(this)) {
         iiIliillIIlliill.iliIiiliiiii(this);
      }

      this.Iillllilll();
   }

   private void Iillllilll() {
      lIIllIlliIIllIll var1 = (lIIllIlliIIllIll)this.illlIiIlIl.peekLast();
      if (var1 != null) {
         this.IIilIiIlIl = var1.IliIlllilIi();
      }

      this.illlIiIlIl.clear();
   }

   private static boolean IlIllllIll(class_2596<?> p) {
      if (p instanceof class_2824 var2) {
         return IIIliiIilIIliiIi.IliIlllilIi(var2);
      } else if (p instanceof class_2813) {
         return true;
      } else {
         boolean var10000;
         if (p instanceof class_2846) {
            class_2846 var1 = (class_2846)p;
            if (var1.method_12363() == class_2847.field_12969) {
               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      }
   }

   private boolean iiiIlIIIll() {
      return IliIlllilIi<invokedynamic>().equals(this.iIllIiIlIl.Iilllilliill());
   }

   private boolean lIIlliIIll(long previous, class_243 now, class_243 moved) {
      if (previous < this.IlilIiIlIl) {
         return false;
      } else if (Iiiilllliiilll.field_1724.method_6115() && !Iiiilllliiilll.field_1724.method_6039()) {
         return false;
      } else if (!Iiiilllliiilll.field_1724.method_24828() && Iiiilllliiilll.field_1724.field_6017 > Double.longBitsToDouble(7181978356480884175L ^ 2568040538239811023L)) {
         return false;
      } else {
         class_1297 var5 = this.lillIiIlIl == (-453077031 * 49 ^ 89 ^ 725937967) ? null : Iiiilllliiilll.field_1687.method_8469(this.lillIiIlIl);
         if (var5 instanceof class_1309) {
            class_1309 var6 = (class_1309)var5;
            if (!var6.method_31481() && var6.method_5805()) {
               if (moved != null && now != null) {
                  double var7 = Iiiilllliiilll.field_1724.method_23320() - Iiiilllliiilll.field_1724.method_23318();
                  double var9 = (double)var6.method_17681() / Double.longBitsToDouble(-5234543533902931928L ^ -622857515475544024L);
                  double var11 = (double)var6.method_17682();
                  double var13 = lIlIlIIiiIlIlIIi.IliIlllilIi(now.field_1352, now.field_1351 + var7, now.field_1350, var6.method_23317(), var6.method_23318(), var6.method_23321(), var9, var11);
                  double var15 = lIlIlIIiiIlIlIIi.IliIlllilIi(moved.field_1352, moved.field_1351 + var7, moved.field_1350, var6.method_23317(), var6.method_23318(), var6.method_23321(), var9, var11);
                  return !IllIIlIilllIIlIi.liiiIIllIl(var13, var15);
               }

               return true;
            }
         }

         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 2 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 14) - '詇') - '꾪') + '쾭') ^ var5))) ^ var5) ^ var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 2 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 14) - '詇') - '꾪') + '쾭') ^ var5))) ^ var5) ^ var5) << 8) - '鮃') << 14 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 2 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 14) - '詇') - '꾪') + '쾭') ^ var5))) ^ var5) ^ var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) << 2 | (char)(var4[var5] << 10 | var4[var5] >>> 6) >>> 14) - '詇') - '꾪') + '쾭') ^ var5))) ^ var5) ^ var5) << 8) - '鮃') >>> 2) ^ '뮉')) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(-((char)(var4[var5] ^ 28011))))) + 'ꁃ')))) + var5) ^ '蒧') ^ '닛') ^ '褟'))) << 8 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(-((char)(var4[var5] ^ 28011))))) + 'ꁃ')))) + var5) ^ '蒧') ^ '닛') ^ '褟'))) >>> 8)))) ^ '꼳'))) - 28748));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      lIllIiIlIl = lilllliiilllli.IIliIiIIIl.IilliliilIIi(true);
   }

   public llIIIIIlilIIIIIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iiIlIIIiIIllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIllIiIlIl, this.IlllIiIlIl, this.llllIiIlIl});
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ 17939))) + 11849) << 5 | (char)((char)(-((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ 17939))) + 11849) >>> 11) - var5) ^ var5) + 27907))) ^ 1849) ^ '푂') >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ 17939))) + 11849) << 5 | (char)((char)(-((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ 17939))) + 11849) >>> 11) - var5) ^ var5) + 27907))) ^ 1849) ^ '푂') << 4) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1765873402773037378L ^ Long.rotateLeft(-2019884252027272277L, 43) ^ -3354140734195979813L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -576789430779068801L ^ Long.rotateLeft(-8196160817253774819L, 38) ^ -3959312298902301924L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2951253042474046166L ^ Long.rotateLeft(-743956359049873015L, 27) ^ 8899857491861326574L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2274638468111830093L ^ Long.rotateLeft(-6046143088977320683L, 17) ^ 1201032311878566956L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3004980952320906490L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3532165899312205378L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5414243345732124598L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6370236031108470208L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -278696000695274345L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5813838502718986212L;
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

   private void lllllillll(long now) {
      if (!this.illlIiIlIl.isEmpty()) {
         if (!iiIliillIIlliill.iIlIlllllill(this)) {
            this.Iillllilll();
         } else {
            while(!this.illlIiIlIl.isEmpty() && ((lIIllIlliIIllIll)this.illlIiIlIl.peekFirst()).liiiIIllIl() <= now) {
               this.IIilIiIlIl = ((lIIllIlliIIllIll)this.illlIiIlIl.pollFirst()).IliIlllilIi();
            }

         }
      }
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (!this.IillIiIlIl.liiiIIllIl(Iiiilllliiilll.field_1687)) {
            iiIliillIIlliill.iliIiiliiiii(this);
            this.iilllIIill();
            this.IillIiIlIl.IliIlllilIi(Iiiilllliiilll.field_1687);
            this.IIilIiIlIl = Iiiilllliiilll.field_1724.method_73189();
         }

         long var1 = IIIiillllIIiilll.iIlIlllllill();
         if (var1 != this.llilIiIlIl) {
            this.llilIiIlIl = var1;
            this.iillIiIlIl = null;
            this.lIilIiIlIl = 0L;
            this.illlIiIlIl.clear();
            this.IIilIiIlIl = Iiiilllliiilll.field_1724.method_73189();
         }

         boolean var3 = this.iiiIlIIIll();
         this.lillIiIlIl = var3 ? this.liIlliiIll() : -1;
         if (var3 && this.lillIiIlIl == -1) {
            this.IIllllIlll();
         }

         this.lllllillll(IIIiillllIIiilll.IliIlllilIi());
      }
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      if (Iiiilllliiilll.method_18854() && Iiiilllliiilll.field_1724 != null && this.IillIiIlIl.liiiIIllIl(Iiiilllliiilll.field_1687)) {
         if (!event.lIiiIiIlilli()) {
            class_2596 var2;
            long var3;
            long var5;
            class_243 var7;
            class_243 var10000;
            label60: {
               var2 = event.lIiilIIIIi;
               var3 = IIIiillllIIiilll.IliIlllilIi();
               var5 = IIllIIlilIllIIli.IlIlllIlilIl();
               var7 = this.iillIiIlIl;
               if (var2 instanceof class_2828) {
                  class_2828 var9 = (class_2828)var2;
                  if (var9.method_36171()) {
                     var10000 = new class_243(var9.method_12269((double)0.0F), var9.method_12268((double)0.0F), var9.method_12274((double)0.0F));
                     break label60;
                  }
               }

               var10000 = null;
            }

            class_243 var8 = var10000;
            if (var8 != null) {
               this.iillIiIlIl = var8;
            }

            if (IlIllllIll(var2)) {
               this.IIllllIlll();
               this.iIilIiIlIl = var5;
               this.iIlllIllll(event, var8);
            } else if (this.iIilIiIlIl != var5 && !Iiiilllliiilll.field_1724.method_29504()) {
               long var11;
               if (this.iiiIlIIIll()) {
                  if (ilIllIiIll(var2)) {
                     this.IIllllIlll();
                     this.iIilIiIlIl = var5;
                     if (var2 instanceof class_2885) {
                        this.IlilIiIlIl = var3 + 500L;
                     }

                     this.iIlllIllll(event, var8);
                     return;
                  }

                  if (!this.lIIlliIIll(var3, var7, var8)) {
                     this.IIllllIlll();
                     this.iIlllIllll(event, var8);
                     return;
                  }

                  var11 = IllIIlIilllIIlIi.IliIlllilIi(var3, (long)this.IlllIiIlIl.Iilllilliill(), this.lIilIiIlIl);
               } else {
                  var11 = var3 + (long)this.IlllIiIlIl.Iilllilliill();
               }

               if (var11 > var3 && iiIliillIIlliill.IliIlllilIi(this, event, var11)) {
                  if (var8 != null) {
                     this.lIilIiIlIl = var11;
                     this.illlIiIlIl.addLast(new lIIllIlliIIllIll(var8, var11));
                  }

               } else {
                  this.iIlllIllll(event, var8);
               }
            } else {
               this.iIlllIllll(event, var8);
            }
         }
      }
   }

   private int liIlliiIll() {
      class_243 var1 = Iiiilllliiilll.field_1724.method_33571();
      class_243 var2 = ilIiiIiIii.Iiilliiliiil(iIiIlillIliIlill.ilillIiill(), iIiIlillIliIlill.liilliiill());
      class_243 var3 = var1.method_1019(var2.method_1021(Double.longBitsToDouble(-5448532694783934543L ^ -844727975704445007L)));
      class_3965 var4 = Iiiilllliiilll.field_1687.method_17742(new class_3959(var1, var3, class_3960.field_17558, class_242.field_1348, Iiiilllliiilll.field_1724));
      if (var4 != null && var4.method_17783() != class_240.field_1333) {
         var3 = var4.method_17784();
      }

      class_238 var5 = Iiiilllliiilll.field_1724.method_5829().method_18804(var3.method_1020(var1)).method_1014((double)1.0F);
      class_3966 var6 = class_1675.method_18075(Iiiilllliiilll.field_1724, var1, var3, var5, (e) -> e != Iiiilllliiilll.field_1724 && !e.method_7325() && e.method_5863() && liiIIIlliiiIIIll.IliIlllilIi(e, lIllIiIlIl), var1.method_1025(var3));
      int var10000;
      if (var6 != null) {
         class_1297 var8 = var6.method_17782();
         if (var8 instanceof class_1309) {
            class_1309 var7 = (class_1309)var8;
            var10000 = var7.method_5628();
            return var10000;
         }
      }

      var10000 = -1;
      return var10000;
   }

   protected void Iilililiiili() {
      iiIliillIIlliill.iliIiiliiiii(this);
      this.iilllIIill();
      this.IillIiIlIl.iIlIlllllill();
   }
}
