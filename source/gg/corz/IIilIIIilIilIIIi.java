package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_638;
import net.minecraft.class_742;

public class IIilIIIilIilIIIi extends ilIllIiIll {
   private final IIIIlilllIIIlill illllIliil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)0.0F, (double)1.0F, 0.05);
   private final IliiiIIilliiiIIi llillIliil = new IliiiIIilliiiIIi();
   private static final double llIllIliil = (double)16.0F;
   private static final double IlIllIliil = (double)9216.0F;
   private long iiIilIliil;
   private final iiIilIIiIIlilIIi IlillIliil = new iiIilIIiIIlilIIi();
   private static final int liiIlIliil = 16;
   private class_1657 IlIilIliil;
   private double ilIilIliil;
   private final iIIIilllIlIIilll IIillIliil = new iIIIilllIlIIilll();
   private final iliiliilIiiiliil iIlllIliil = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -5204993);
   private boolean llIilIliil;
   private final IIIIlilllIIIlill IilllIliil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)0.0F, (double)1.0F, 0.05);
   private static final int lIIllIliil = 1600;
   private final iiIiiilIIliiil iilllIliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final lliliIIiililiIIi lIlllIliil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final lliliIIiililiIIi IIlllIliil = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final double iiIllIliil = (double)64.0F;
   private static final int IIIllIliil = 3200;
   private final ArrayList<iIIIilllIlIIilll> lIillIliil = new ArrayList(16);
   private static final int iIIllIliil = 24;
   private final ArrayDeque<iIIIilllIlIIilll> iIillIliil = new ArrayDeque();
   private static final float ilIllIliil = 20.0F;
   private class_638 iIIilIliil;
   private double IiIilIliil;
   private final iIIIilllIlIIilll[] iiillIliil = new iIIIilllIlIIilll[16];
   private final IIIIlilllIIIlill lllllIliil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.3, 0.05, (double)1.0F, 0.01);
   private int lIIilIliil;
   private final liilIIliiiilIIli ilillIliil = new liilIIliiiilIIli();
   private final IIIIlilllIIIlill IllllIliil = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.5F, 0.3, (double)5.0F, 0.1);
   private final class_742[] IiillIliil = new class_742[16];
   private static final float liIllIliil = 4.0F;
   private final double[] liillIliil = new double[16];
   private static final int iiiIlIliil = 20;
   private static final long IiiIlIliil = System.nanoTime();
   private final boolean[] IIIilIliil = new boolean[16];
   private double liIilIliil;
   private static final float IiIllIliil = 28.0F;
   private final iiIiiilIIliiil lilllIliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   private void liIlliiIll() {
      for(int var1 = 0; var1 < this.lIIilIliil; ++var1) {
         iIIIilllIlIIilll var2 = this.IIllllIlll(this.IiillIliil[var1].method_5628());
         this.iiillIliil[var1] = var2;
         this.IIIilIliil[var1] = false;
         if (var2 != null) {
            this.IIIilIliil[var1] = var2.lIlIIIlill != this.iiIilIliil - 1L;
            var2.lIlIIIlill = this.iiIilIliil;
         }
      }

      for(int var3 = 0; var3 < this.lIIilIliil; ++var3) {
         if (this.iiillIliil[var3] == null) {
            iIIIilllIlIIilll var4 = this.iIlllIllll();
            if (var4 != null) {
               var4.IilliliilIIi();
               var4.IIlIIIlill = this.IiillIliil[var3].method_5628();
               var4.lIlIIIlill = this.iiIilIliil;
               this.iiillIliil[var3] = var4;
            }
         }
      }

   }

   private iIIIilllIlIIilll IIllllIlll(int id) {
      for(int var2 = 0; var2 < this.lIillIliil.size(); ++var2) {
         iIIIilllIlIIilll var3 = (iIIIilllIlIIilll)this.lIillIliil.get(var2);
         if (var3.IIlIIIlill == id) {
            return var3;
         }
      }

      return null;
   }

   private iIIIilllIlIIilll iIlllIllll() {
      if (this.lIillIliil.size() < 20) {
         iIIIilllIlIIilll var4 = this.iIillIliil.isEmpty() ? new iIIIilllIlIIilll() : (iIIIilllIlIIilll)this.iIillIliil.pop();
         this.lIillIliil.add(var4);
         return var4;
      } else {
         iIIIilllIlIIilll var1 = null;

         for(int var2 = 0; var2 < this.lIillIliil.size(); ++var2) {
            iIIIilllIlIIilll var3 = (iIIIilllIlIIilll)this.lIillIliil.get(var2);
            if (var3.lIlIIIlill != this.iiIilIliil && (var1 == null || var3.lIlIIIlill < var1.lIlIIIlill)) {
               var1 = var3;
            }
         }

         return var1;
      }
   }

   private static void lllllillll(iIIIilllIlIIilll b, class_1297 td, float now, double len, double e) {
      double var7 = class_3532.method_16436((double)now, td.field_6014, td.method_23317());
      double var9 = class_3532.method_16436((double)now, td.field_6036, td.method_23318());
      double var11 = class_3532.method_16436((double)now, td.field_5969, td.method_23321());
      b.IiIlliIliiIl(len, var7, var9, var11, td.method_17682(), e);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8437640802873628829L ^ Long.rotateLeft(-3962133696542011848L, 48) ^ 1510263190998038404L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1531511435334448228L ^ Long.rotateLeft(4122780793649947313L, 58) ^ -6337072596254509303L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 839852586448078291L ^ Long.rotateLeft(-8439376486607130865L, 32) ^ 3621829064433376649L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5185226687877814662L ^ Long.rotateLeft(955032548230574485L, 46) ^ 2018458524109898546L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3126340405722877274L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5424162931010330739L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -849438989319103665L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2537726230611237700L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2066607364027428128L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1626670410293560313L;
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

   private void IlIllllIll() {
      if (Iiiilllliiilll.field_1687 != this.iIIilIliil) {
         this.IIillIliil.IilliliilIIi();
         this.lIIlliIIll();
         this.llIilIliil = false;
         this.iIIilIliil = Iiiilllliiilll.field_1687;
      }

      if (Iiiilllliiilll.field_1724 != this.IlIilIliil) {
         this.IIillIliil.IilliliilIIi();
         this.llIilIliil = false;
         this.IlIilIliil = Iiiilllliiilll.field_1724;
      }

   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 == null && this.iIIilIliil != null) {
         this.iiiIlIIIll();
      }

      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.IlIllllIll();
         double var1 = Iiiilllliiilll.field_1724.method_23317();
         double var3 = Iiiilllliiilll.field_1724.method_23318();
         double var5 = Iiiilllliiilll.field_1724.method_23321();
         if (this.llIilIliil) {
            double var7 = var1 - this.ilIilIliil;
            double var9 = var3 - this.IiIilIliil;
            double var11 = var5 - this.liIilIliil;
            if (var7 * var7 + var9 * var9 + var11 * var11 > (double)64.0F) {
               this.IIillIliil.lIiiIiIlilli();
            }
         }

         this.ilIilIliil = var1;
         this.IiIilIliil = var3;
         this.liIilIliil = var5;
         this.llIilIliil = true;
      }
   }

   private void lIIlliIIll() {
      for(int var1 = 0; var1 < this.lIillIliil.size(); ++var1) {
         iIIIilllIlIIilll var2 = (iIIIilllIlIIilll)this.lIillIliil.get(var1);
         var2.IilliliilIIi();
         var2.IIlIIIlill = Integer.MIN_VALUE;
         this.iIillIliil.push(var2);
      }

      this.lIillIliil.clear();
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) << 7) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) << 7) >>> 13) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) << 7) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) << 7 | (char)((char)((char)((char)(~((char)(var4[var5] + '趀'))) + var5) - var5) - 1073) >>> 9) ^ '\ue22b') - var5) << 5) - 12762) << 7) >>> 13) >>> 4))) - '\ued37') + '\ud97a') - var5) - 6742));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll() {
      this.lIIilIliil = 0;
      List var1 = Iiiilllliiilll.field_1687.method_18456();
      int var2 = 0;

      for(int var3 = var1.size(); var2 < var3; ++var2) {
         class_742 var4 = (class_742)var1.get(var2);
         if (var4 != Iiiilllliiilll.field_1724 && !var4.method_7325() && !var4.method_5756(Iiiilllliiilll.field_1724)) {
            double var5 = var4.method_5858(Iiiilllliiilll.field_1724);
            if (!(var5 > (double)9216.0F)) {
               int var7;
               if (this.lIIilIliil < 16) {
                  var7 = this.lIIilIliil++;
               } else {
                  if (var5 >= this.liillIliil[15]) {
                     continue;
                  }

                  var7 = 15;
               }

               while(var7 > 0 && this.liillIliil[var7 - 1] > var5) {
                  this.IiillIliil[var7] = this.IiillIliil[var7 - 1];
                  this.liillIliil[var7] = this.liillIliil[var7 - 1];
                  --var7;
               }

               this.IiillIliil[var7] = var4;
               this.liillIliil[var7] = var5;
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 14823) - 22519) ^ 19799) - var5) + '왊') - var5) - var5) + var5) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 14823) - 22519) ^ 19799) - var5) + '왊') - var5) - var5) + var5) + var5) << 9) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 14823) - 22519) ^ 19799) - var5) + '왊') - var5) - var5) + var5) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 14823) - 22519) ^ 19799) - var5) + '왊') - var5) - var5) + var5) + var5) << 9) >>> 14))) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiIlIIIll() {
      this.IIillIliil.IilliliilIIi();
      this.lIIlliIIll();
      this.iIIilIliil = null;
      this.IlIilIliil = null;
      this.llIilIliil = false;
   }

   private void Iillllilll(double now) {
      IliiiIIilliiiIIi var10000 = this.llillIliil;
      String var3 = this.IIlllIliil.Iilllilliill();
      int var4 = -1;
      switch (var3.hashCode()) {
         case 2136170:
            if (var3.equals(IliIlllilIi<invokedynamic>())) {
               var4 = 1;
            }
            break;
         case 2368532:
            if (var3.equals(IliIlllilIi<invokedynamic>())) {
               var4 = 0;
            }
      }

      IIIliIIilIIliIIi var10001;
      switch (var4) {
         case 0 -> var10001 = IIIliIIilIIliIIi.iIIilliiil;
         case 1 -> var10001 = IIIliIIilIIliIIi.IlIilliiil;
         default -> var10001 = IIIliIIilIIliIIi.lIIilliiil;
      }

      var10000.iiilliiiil = var10001;
      var3 = this.lIlllIliil.Iilllilliill();
      this.llillIliil.IIIiliiiil = var3.equals(IliIlllilIi<invokedynamic>());
      if (var3.equals(IliIlllilIi<invokedynamic>())) {
         var4 = this.iIlllIliil.Iilllilliill();
         this.llillIliil.lIIiliiiil = var4 & 16777215;
         this.llillIliil.iIIiliiiil = (float)(var4 >>> 24 & 255) / 255.0F;
      } else {
         this.llillIliil.lIIiliiiil = (var3.equals(IliIlllilIi<invokedynamic>()) ? IlIIilIlllIIilIl.lliiIlliIl : this.iIlllIliil.Iilllilliill()) & 16777215;
         this.llillIliil.iIIiliiiil = 1.0F;
      }

      this.llillIliil.IlIiliiiil = this.IllllIliil.Iilllilliill();
      this.llillIliil.llIiliiiil = (float)this.lllllIliil.Iilllilliill();
      this.llillIliil.ilIiliiiil = (float)this.illllIliil.Iilllilliill();
      this.llillIliil.IiIiliiiil = (float)this.IilllIliil.Iilllilliill();
      this.llillIliil.liIiliiiil = now;
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         this.IlIllllIll();
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         if (var2 != null) {
            class_243 var3 = var2.method_71156();
            double var4 = (double)(System.nanoTime() - IiiIlIliil) / (double)1.0E9F;
            double var6 = this.IllllIliil.Iilllilliill();
            float var8 = event.liiiiIIiiiiiiIIi;
            ++this.iiIilIliil;
            this.Iillllilll(var4);
            this.ilillIliil.iIlIlllllill(event.IliiiIIilliiiIIi.method_23760().method_23761());
            lllllillll(this.IIillIliil, Iiiilllliiilll.field_1724, var8, var4, var6);
            this.IIillIliil.IIlllIlliIll(var4, var6);
            boolean var9 = this.lilllIliil.Iilllilliill() && Iiiilllliiilll.field_1690.method_31044().method_31034() && !lilIliIiiilIliIi.iiiIlIIIll() && !iIIlIllIlIlIll.IIIllIIliIIl();
            this.llillIliil.IliIlllilIi();
            if (!var9) {
               this.IlillIliil.IIIilIIiiIIi(this.IIillIliil, var4, var3.field_1352, var3.field_1351, var3.field_1350, this.llillIliil, this.ilillIliil);
            }

            if (this.iilllIliil.Iilllilliill()) {
               this.ilIllIiIll();
               this.liIlliiIll();

               for(int var10 = 0; var10 < this.lIIilIliil; ++var10) {
                  iIIIilllIlIIilll var11 = this.iiillIliil[var10];
                  if (var11 != null) {
                     if (this.IIIilIliil[var10] && var11.iIlIlllllill()) {
                        var11.lIiiIiIlilli();
                     }

                     lllllillll(var11, this.IiillIliil[var10], var8, var4, var6);
                  }

                  this.IiillIliil[var10] = null;
                  this.iiillIliil[var10] = null;
               }

               int var23 = Math.max(1, this.lIillIliil.size());
               int var24 = class_3532.method_15340(3200 / var23, 64, this.IlillIliil.IliIlllilIi());
               int var12 = class_3532.method_15340(1600 / var23, 24, 400);

               for(int var13 = this.lIillIliil.size() - 1; var13 >= 0; --var13) {
                  iIIIilllIlIIilll var14 = (iIIIilllIlIIilll)this.lIillIliil.get(var13);
                  var14.IIlllIlliIll(var4, var6);
                  if (var14.lIlIIIlill != this.iiIilIliil && var14.Illlllllilll(var4, var6)) {
                     int var25 = this.lIillIliil.size() - 1;
                     this.lIillIliil.set(var13, (iIIIilllIlIIilll)this.lIillIliil.get(var25));
                     this.lIillIliil.remove(var25);
                     var14.IilliliilIIi();
                     var14.IIlIIIlill = Integer.MIN_VALUE;
                     this.iIillIliil.push(var14);
                  } else {
                     double var15 = var14.Iiiiliiiiiii() - var3.field_1352;
                     double var17 = var14.IIIIllIIIl() - var3.field_1351;
                     double var19 = var14.iIIIlIlIIl() - var3.field_1350;
                     double var21 = Math.sqrt(var15 * var15 + var17 * var17 + var19 * var19);
                     this.llillIliil.iiIiliiiil = (float)class_3532.method_15350(var21 / (double)16.0F, (double)1.0F, (double)4.0F);
                     this.llillIliil.IIliliiiil = iiIilIIiIIlilIIi.IIIillIIil(20.0F, 28.0F, (float)var21);
                     this.llillIliil.lIliliiiil = var24;
                     this.llillIliil.iIliliiiil = var12;
                     this.IlillIliil.IIIilIIiiIIi(var14, var4, var3.field_1352, var3.field_1351, var3.field_1350, this.llillIliil, this.ilillIliil);
                  }
               }

               this.llillIliil.IliIlllilIi();
            } else if (!this.lIillIliil.isEmpty()) {
               this.lIIlliIIll();
            }

            this.ilillIliil.IilliliilIIi();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) >>> 10 | (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) << 6) ^ '뿣') - '虷') >>> 4 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) >>> 10 | (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) << 6) ^ '뿣') - '虷') << 12) << 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) >>> 10 | (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) << 6) ^ '뿣') - '虷') >>> 4 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) >>> 10 | (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') << 15 | (char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + 9893) << 11 | (char)(var4[var5] + 9893) >>> 5))) ^ var5))))) + '\udcdb') >>> 1) << 6) ^ '뿣') - '虷') << 12) >>> 10) - 1008) - var5) ^ var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) >>> 3 | (char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) << 13) + var5))) - '\ue82b') << 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) >>> 3 | (char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) << 13) + var5))) - '\ue82b') >>> 14) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) >>> 3 | (char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) << 13) + var5))) - '\ue82b') << 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) >>> 3 | (char)((char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) << 5 | (char)((char)((char)(var4[var5] + 27717) + 31161) >>> 9 | (char)((char)(var4[var5] + 27717) + 31161) << 7) >>> 11) << 13) + var5))) - '\ue82b') >>> 14) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.iiiIlIIIll();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ var5) - var5) - var5) + 18766))) + 'ﯬ') + '첺') >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ var5) - var5) - var5) + 18766))) + 'ﯬ') + '첺') << 4) - '\ude2c') ^ '폍'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ var5) - var5) - var5) + 18766))) + 'ﯬ') + '첺') >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) ^ var5) - var5) - var5) + 18766))) + 'ﯬ') + '첺') << 4) - '\ude2c') ^ '폍'))) << 13) ^ '쌄') - 25880) + 26473) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIilIIIilIilIIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIlllIliil, this.lIlllIliil, this.iIlllIliil, this.IllllIliil, this.lllllIliil, this.illllIliil, this.IilllIliil, this.lilllIliil, this.iilllIliil});
   }

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }
}
