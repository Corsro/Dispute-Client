package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1661;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_3966;
import net.minecraft.class_746;
import net.minecraft.class_9362;
import net.minecraft.class_239.class_240;

public class IiIIliIiliIIliIi extends ilIllIiIll implements ilIIIiiIiIIIii {
   private long liiIIliIIi = -1L;
   private static final float lilIIliIIi = 0.0F;
   private int IiiIIliIIi = -1;
   static final int lllIIliIIi = 10;
   private final iiIiiilIIliiil iIiIIliIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   static final int IilIIliIIi = 8;
   private final iiIiiilIIliiil IIiIIliIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int iliIIliIIi;
   private final iiIiiilIIliiil lIiIIliIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   static final int illIIliIIi = 24;
   private static final int iilIIliIIi = -1;
   private int IliIIliIIi = -1;
   private long lliIIliIIi;

   static boolean lIliliIlil(int useTicks) {
      return useTicks >= (767776903 + -71 + 5 + 121 ^ 767776948);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1528075588787713613L ^ Long.rotateLeft(-4374872689052337311L, 8) ^ 8582905881085132990L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -87642003344876873L ^ Long.rotateLeft(7691183968147345066L, 3) ^ 6523312183187280273L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7676268223108288777L ^ Long.rotateLeft(3041949201507649684L, 63) ^ 1879679967871827798L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2309760248032004797L ^ Long.rotateLeft(8675130470404675247L, 63) ^ -3407564570720296018L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7879417312378076325L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7744969576042794955L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3227573032428502605L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1276253904041793027L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4630113387310273645L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7097197040166674857L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   private void iiiIlIIIll(class_746 p) {
      long var3 = -1905995046952044578L;
      if (p.method_6115() && p.method_6030().method_31574(class_1802.field_8547)) {
         var3 ^= ((long)p.method_6048() << 32 ^ var3) & -1L << 32;
         if (lIliliIlil((int)(var3 >>> 32))) {
            Iiiilllliiilll.field_1761.method_2897(p);
            Iiiilllliiilll.field_1690.field_1904.method_23481(false);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)(-((char)((char)(~var4[var5]) - '차'))))) - 10909))))) + 30896) ^ var5) - '\uf69e'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiIIliIiliIIliIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiIIliIIi, this.lIiIIliIIi, this.iIiIIliIIi});
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) << 6 | (char)(var4[var5] - var5) >>> 10) - '좻'))))) + '輓'))) ^ 3985))) - var5) >>> 7 | (char)((char)(-((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) << 6 | (char)(var4[var5] - var5) >>> 10) - '좻'))))) + '輓'))) ^ 3985))) - var5) << 9) << 13 | (char)((char)((char)(-((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) << 6 | (char)(var4[var5] - var5) >>> 10) - '좻'))))) + '輓'))) ^ 3985))) - var5) >>> 7 | (char)((char)(-((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)(var4[var5] - var5) << 6 | (char)(var4[var5] - var5) >>> 10) - '좻'))))) + '輓'))) ^ 3985))) - var5) << 9) >>> 3) - var5) + 10157) - 29205) - 24445));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean Iillllilll(class_746 p) {
      return !p.method_24828() && !p.method_6101() && !p.method_5799() && !p.method_5771() && !p.method_5765() && !p.method_6128() && !p.method_31549().field_7479;
   }

   private void llIililIil() {
      this.iIIilIlIil();
      this.lliIIliIIi = 0L;
      this.IiiIIliIIi = -1;
      this.liiIIliIIi = -1L;
   }

   static boolean IiIilliIil(float progress) {
      return progress >= 1.0F;
   }

   protected void Iilililiiili() {
      this.llIililIil();
   }

   private static boolean IIIillIIil(class_746 p) {
      if (!class_9362.method_58659(p)) {
         return false;
      } else {
         for(int var1 = 0; var1 < class_1661.method_7368(); ++var1) {
            if (p.method_31548().method_5438(var1).method_7909() instanceof class_9362) {
               return true;
            }
         }

         return false;
      }
   }

   private void iIIilIlIil() {
      this.IliIIliIIi = -1;
      this.iliIIliIIi = 0;
   }

   static boolean Illillllil(long tick, long heldSince) {
      return tick - heldSince > (6642452160204590764L ^ 6642452160204590772L);
   }

   private boolean lIilliIill() {
      return Iiiilllliiilll.field_1771 > 0 || IIllIIlilIllIIli.IliIlllilIi() || IIllIIlilIllIIli.iliIiiliiiii() || IIllIIlilIllIIli.IIillIiliIil() || IIIIilIilIIIilIi.lIIlliIIll() || IilIIililIIi.IilliliilIIi();
   }

   public iilllIllIIillIll IIllllIlll(Object target, class_1297 presser) {
      long var5 = 7550071874719327643L;
      class_746 var3 = Iiiilllliiilll.field_1724;
      if (var3 != null && this.iIlllIllll() && liilliiill(var3)) {
         if (target != this) {
            if (target != null) {
               return iilllIllIIillIll.ilIIIIilll;
            } else if (presser == null) {
               return this.IIiIIliIIi.Iilllilliill() && this.Ilillllill() && !IiIilliIil(var3.method_7261(0.0F)) ? iilllIllIIillIll.IiIIIIilll : iilllIllIIillIll.ilIIIIilll;
            } else {
               if (presser instanceof class_1309) {
                  class_1309 var4 = (class_1309)presser;
                  if (var4.method_5805() && !IIIillIIil(var3)) {
                     if (this.ilIllIiIll(var3)) {
                        this.iIIilIlIil();
                        return iilllIllIIillIll.ilIIIIilll;
                     }

                     this.IlIllllIll(var3, var4);
                     return iilllIllIIillIll.IiIIIIilll;
                  }
               }

               return iilllIllIIillIll.ilIIIIilll;
            }
         } else {
            var5 ^= ((long)(presser != null && presser.method_5628() == this.IiiIIliIIi && this.liiIIliIIi == IIllIIlilIllIIli.IlIlllIlilIl() ? 1 : 0) << 32 ^ var5) & -1L << 32;
            this.IiiIIliIIi = -1;
            return (int)(var5 >>> 32) != 0 ? iilllIllIIillIll.ilIIIIilll : iilllIllIIillIll.IiIIIIilll;
         }
      } else {
         return iilllIllIIillIll.ilIIIIilll;
      }
   }

   private class_1309 ilillIiill() {
      class_239 var3 = Iiiilllliiilll.field_1765;
      class_1309 var10000;
      if (var3 instanceof class_3966 var2) {
         class_1297 var4 = var2.method_17782();
         if (var4 instanceof class_1309 var1) {
            var10000 = var1;
            return var10000;
         }
      }

      var10000 = null;
      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ 15933) - var5))) - 27553) ^ '闝') << 15 | (char)((char)((char)(~((char)((char)((char)(var4[var5] >>> 10 | var4[var5] << 6) ^ 15933) - var5))) - 27553) ^ '闝') >>> 1) - 9506)) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean illilIilil(boolean critAllowed, boolean fallDistance, double waitedTicks, int airborne) {
      return critAllowed && fallDistance && waitedTicks <= Double.longBitsToDouble(3704256659936134978L ^ 3704256659936134978L) && airborne < ((564759688 * -107 >>> 29 | 564759688 * -107 << 3) ^ 1897011535);
   }

   private void lIIlliIIll(class_746 p) {
      long var2 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (this.iIlllIllll() && liilliiill(p) && !p.method_6115() && Iiiilllliiilll.field_1755 == null && !Illillllil(var2, this.lliIIliIIi)) {
         class_1309 var4 = this.ilillIiill();
         if (var4 != null && var4.method_5628() == this.IliIIliIIi) {
            if (!var4.method_5805()) {
               this.iIIilIlIil();
            } else if (iiIilIIlil(this.IIiIIliIIi.Iilllilliill(), p.method_7261(0.0F))) {
               if (this.lllllillll(p)) {
                  ++this.iliIIliIIi;
               } else if (!this.lIilliIill() && !IIllIIlilIllIIli.IiIlliIliiIl()) {
                  if (IIllIIlilIllIIli.IIlllIlliIll(this)) {
                     this.IiiIIliIIi = this.IliIIliIIi;
                     this.liiIIliIIi = var2;
                  }

                  this.iIIilIlIil();
               }
            }
         }
      } else {
         this.iIIilIlIil();
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) >>> 11 | (char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) << 5) ^ var5))) ^ 3603) - '쏥') << 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) >>> 11 | (char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) << 5) ^ var5))) ^ 3603) - '쏥') >>> 5) - var5))) ^ var5) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) >>> 11 | (char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) << 5) ^ var5))) ^ 3603) - '쏥') << 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) >>> 11 | (char)((char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)(~var4[var5]))))) ^ var5) << 1) << 5) ^ var5))) ^ 3603) - '쏥') >>> 5) - var5))) ^ var5) << 1) ^ 10449) - 'ﵧ') ^ '퉌'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      class_746 var1 = Iiiilllliiilll.field_1724;
      if (var1 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1690 != null) {
         if (this.iIiIIliIIi.Iilllilliill()) {
            this.iiiIlIIIll(var1);
         }

         if (this.IliIIliIIi != -1) {
            this.lIIlliIIll(var1);
         }

      } else {
         this.llIililIil();
      }
   }

   private void IlIllllIll(class_746 target, class_1309 p) {
      long var3 = IIllIIlilIllIIli.IlIlllIlilIl();
      if (this.IliIIliIIi != p.method_5628()) {
         this.iliIIliIIi = 0;
      }

      this.IliIIliIIi = p.method_5628();
      this.lliIIliIIi = var3;
   }

   private boolean lllllillll(class_746 p) {
      return this.lIiIIliIIi.Iilllilliill() && illilIilil(Iillllilll(p), iilllIIill(p), p.field_6017, this.iliIIliIIi);
   }

   private boolean ilIllIiIll(class_746 p) {
      return iiIilIIlil(this.IIiIIliIIi.Iilllilliill(), p.method_7261(0.0F)) && !this.lllllillll(p);
   }

   static boolean iiIilIIlil(boolean progress, float meleeTiming) {
      return !progress || IiIilliIil(meleeTiming);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) << 2) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) << 2) << 3) - var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) << 2) >>> 13 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) >>> 14 | (char)((char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) << 14 | (char)((char)((char)((char)(var4[var5] ^ var5)) - 5276) ^ 24652) >>> 2) << 2) << 3) - var5) >>> 5) - var5) + 14090) - var5))) - var5) - 20842));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean Ilillllill() {
      class_239 var1 = Iiiilllliiilll.field_1765;
      return var1 == null || var1.method_17783() == class_240.field_1333;
   }

   private static boolean liilliiill(class_746 p) {
      return p.method_6047().method_31574(class_1802.field_8547);
   }

   protected void Illillliilli() {
      this.llIililIil();
   }

   private static boolean iilllIIill(class_746 p) {
      return !p.method_5624() && !p.method_74025() && !p.method_6059(class_1294.field_5906) && !p.method_6059(class_1294.field_5902);
   }

   private boolean iIlllIllll() {
      return this.IIiIIliIIi.Iilllilliill() || this.lIiIIliIIi.Iilllilliill();
   }
}
