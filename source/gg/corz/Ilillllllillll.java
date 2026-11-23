package gg.corz;

import com.corz.client.mixins.AccessorClientPlayerInteractionManager;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1268;
import net.minecraft.class_1661;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_3532;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_742;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public class Ilillllllillll extends ilIllIiIll {
   private final Set<class_2338> IiilIIIIiliilIIIIi;
   private boolean liIiIIIIiiiIiIIIIi;
   private final iilliIlIIiliIl liiIIIIIiiiiIIIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 120, 5, 600, 5);
   private class_2350 ilIiIIIIiIiIiIIIIi;
   private final IIIIlilllIIIlill iilIIIIIiIIiIIIIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)5.0F, (double)2.0F, (double)6.0F, (double)0.5F);
   private final iiIiiilIIliiil lIiIIIIIiiIiIIIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private boolean iIiIlIIIiIliIlIIIi;
   private boolean IIliIIIIilIliIIIIi;
   private static final int lillIIIIiiillIIIIi = 60;
   private final IIIIlilllIIIlill IilIIIIIililIIIIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)24.0F, (double)4.0F, (double)96.0F, (double)1.0F);
   private final IIIIlilllIIIlill iIIlIIIIiIlIlIIIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)45.0F, (double)6.0F, (double)180.0F, (double)1.0F);
   private float IllIlIIIilllIlIIIi;
   private static final int IlllIIIIillllIIIIi = 2;
   private class_2338 iiilIIIIiIIIiIIIIi;
   private boolean IIIIlIIIilIIIlIIIi;
   private int llIIlIIIiilIIlIIIi;
   private static final int illlIIIIiIillIIIIi = 20;
   private int iliiIIIIiIiiiIIIIi;
   private int lIiiIIIIiiIiiIIIIi;
   private IiIIilliIIil lIllIIIIiiIllIIIIi;
   private static final int IIilIIIIilIilIIIIi = 300;
   private float illIlIIIiIilIlIIIi;
   private int iiliIIIIiIIiiIIIIi;
   private final iiIiiilIIliiil IIIlIIIIilIIlIIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IliIIIIIilliIIIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl llIlIIIIiilIlIIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 40, 0, 200, 5);
   private int IiIIlIIIiliIIlIIIi;
   private float IIiIlIIIilIiIlIIIi;
   private int IiliIIIIililiIIIIi;
   private int iIliIIIIiIlliIIIIi;
   private final iilliIlIIiliIl iliIIIIIiIiiIIIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 20, 10, 100, 5);
   private class_2338 lIIiIIIIiiIIiIIIIi;
   private final iiIiiilIIliiil IiIlIIIIiliIlIIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int liiiIIIIiiiiiIIIIi;
   private static final int llilIIIIiililIIIIi = 10;
   private static final int iIilIIIIiIlilIIIIi = 3;
   private int lIlIlIIIiiIlIlIIIi;
   private final IIiiIIIllIiiIIIl iiIlIIIIiIIllIIIIi = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private int IliiIIIIilliiIIIIi;
   private int iIIIlIIIiIlIIlIIIi;
   private float lilIlIIIiiilIlIIIi;
   private int iiIIlIIIiIIlIlIIIi;
   private class_2338 IlIiIIIIillIiIIIIi;
   private int llliIIIIiilliIIIIi;

   public Ilillllllillll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.lIllIIIIiiIllIIIIi = IiIIilliIIil.IlIilIlillIilIli;
      this.IiilIIIIiliilIIIIi = new HashSet();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IilIIIIIililIIIIIi, this.iilIIIIIiIIiIIIIIi, this.lIiIIIIIiiIiIIIIIi, this.IliIIIIIilliIIIIIi, this.iliIIIIIiIiiIIIIIi, this.liiIIIIIiiiiIIIIIi, this.IIIlIIIIilIIlIIIIi, this.iIIlIIIIiIlIlIIIIi, this.llIlIIIIiilIlIIIIi, this.IiIlIIIIiliIlIIIIi, this.iiIlIIIIiIIllIIIIi});
   }

   public boolean lIIlliIIll() {
      return this.IliIlllilIi() && this.liIiIIIIiiiIiIIIIi;
   }

   private void IIIillIIil(boolean want) {
      if (want || this.IIliIIIIilIliIIIIi) {
         illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1832, want);
         this.IIliIIIIilIliIIIIi = want;
      }
   }

   private void IiIilliIil() {
      this.liilliiill();
      this.IIIillIIil(false);
      this.lIllIIIIiiIllIIIIi = IiIIilliIIil.liIilIliiiIilIli;
      this.llIIlIIIiilIIlIIIi = 0;
      this.IiIIlIIIiliIIlIIIi = 0;
      this.iiIIlIIIiIIlIlIIIi = this.llIililIil();
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) + 23767) - var5)))))) + 6198))) >>> 12 | (char)(~((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) + 23767) - var5)))))) + 6198))) << 4) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean iIlllIllll(class_2338 p) {
      return Iiiilllliiilll.field_1687.method_8320(p).method_27852(class_2246.field_10260);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ var5) - var5) + var5))) >>> 3 | (char)(~((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) ^ var5) - var5) + var5))) << 13) + '끮') + var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll() {
      this.IiilIIIIiliilIIIIi.clear();
      this.iiilIIIIiIIIiIIIIi = null;
      this.lIIiIIIIiiIIiIIIIi = null;
      this.iIliIIIIiIlliIIIIi = 0;
      this.llliIIIIiilliIIIIi = 0;
      this.IiliIIIIililiIIIIi = 0;
      this.iiliIIIIiIIiiIIIIi = 0;
      this.lIiiIIIIiiIiiIIIIi = 0;
      this.IliiIIIIilliiIIIIi = 0;
      this.iliiIIIIiIiiiIIIIi = 0;
      this.liiiIIIIiiiiiIIIIi = 0;
      this.IIIIlIIIilIIIlIIIi = false;
      if (this.iilllIIill() == null) {
         this.IiIilliIil();
      } else {
         this.lIllIIIIiiIllIIIIi = IiIIilliIIil.ilIilIliIiIilIli;
         this.Illillllil(IliIlllilIi<invokedynamic>());
      }
   }

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2299094533801742497L ^ Long.rotateLeft(-3629402545017028587L, 29) ^ 8859871150674627590L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4050395830311225728L ^ Long.rotateLeft(6386271764267169550L, 25) ^ -5223683867392261049L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3030859336172663668L ^ Long.rotateLeft(-9166336516652294921L, 4) ^ 3277070899145012521L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4375998831409566967L ^ Long.rotateLeft(-4417350761042158029L, 39) ^ -1628721834400157299L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3822179838355420814L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4210145642259081079L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4016202743994068829L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7770208097727287615L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 767834716975206645L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6783906435601151368L;
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

   private void iIIilIlIil(class_2338 t) {
      class_1661 var2 = Iiiilllliiilll.field_1724.method_31548();
      class_2680 var3 = Iiiilllliiilll.field_1687.method_8320(t);
      float[] var4 = new float[class_1661.method_7368()];
      boolean[] var5 = new boolean[var4.length];

      for(int var6 = 0; var6 < var4.length; ++var6) {
         class_1799 var7 = var2.method_5438(var6);
         var4[var6] = var7.method_7924(var3);
         var5[var6] = var7.method_7951(var3);
      }

      int var8 = IIiiIlilIiiIli.IliIlllilIi(var4, var5, var2.method_67532());
      if (var8 != var2.method_67532()) {
         var2.method_61496(var8);
      }

   }

   private void lIilliIill(class_2338 pos, class_2350 f) {
      if (!this.iIlllIllll(pos)) {
         this.liilliiill();
         this.iiilIIIIiIIIiIIIIi = null;
      } else {
         if (!pos.equals(this.IlIiIIIIillIiIIIIi)) {
            this.liilliiill();
            this.IlIiIIIIillIiIIIIi = pos;
            this.ilIiIIIIiIiIiIIIIi = f;
         }

         AccessorClientPlayerInteractionManager var3 = (AccessorClientPlayerInteractionManager)Iiiilllliiilll.field_1761;
         this.iIIIlIIIiIlIIlIIIi = this.llIililIil();
         if (Iiiilllliiilll.field_1761.method_2902(pos, this.ilIiIIIIiIiIiIIIIi)) {
            Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         }

         this.liIiIIIIiiiIiIIIIi = true;
         if (var3.getBlockBreakingCooldown() > 0) {
            this.Ilillllill();
         }

      }
   }

   private void ilillIiill() {
      long var2 = -5363627506110073257L;
      this.IIIIlIIIilIIIlIIIi = false;
      var2 ^= ((long)(this.llIililIil() - this.iIIIlIIIiIlIIlIIIi) << 32 ^ var2) & -1L << 32;
      if ((int)(var2 >>> 32) > 0) {
         this.liiiIIIIiiiiiIIIIi += (int)(var2 >>> 32);
         this.IliiIIIIilliiIIIIi = 0;
         this.Illillllil(IliIlllilIi<invokedynamic>() + (int)(var2 >>> 32) + IliIlllilIi<invokedynamic>() + this.liiiIIIIiiiiiIIIIi + IliIlllilIi<invokedynamic>());
      } else if (this.liiiIIIIiiiiiIIIIi > 0 && ++this.IliiIIIIilliiIIIIi >= (694974345 - -31 ^ -17 ^ -694974396)) {
         if (this.lIIiIIIIiiIIiIIIIi != null) {
            this.IiilIIIIiliilIIIIi.add(this.lIIiIIIIiiIIiIIIIi);
         }

         this.IliiIIIIilliiIIIIi = 0;
         this.iiilIIIIiIIIiIIIIi = null;
      }

   }

   private class_2338 lllllillll() {
      return this.lIIiIIIIiiIIiIIIIi != null && !this.IiilIIIIiliilIIIIi.contains(this.lIIiIIIIiiIIiIIIIi) && this.iIlllIllll(this.lIIiIIIIiiIIiIIIIi) && this.Iillllilll(this.lIIiIIIIiiIIiIIIIi) ? this.lIIiIIIIiiIIiIIIIi : this.iilllIIill();
   }

   protected void Iilililiiili() {
      this.liilliiill();
      this.IIIillIIil(false);
      this.iiiIlIIIll();
   }

   private class_3965 IIiillIiil(class_243 reach, float eye, float pitch, double yaw) {
      double var6 = Math.toRadians((double)eye);
      double var8 = Math.toRadians((double)pitch);
      class_243 var10 = new class_243(-Math.sin(var6) * Math.cos(var8), -Math.sin(var8), Math.cos(var6) * Math.cos(var8));
      class_243 var11 = reach.method_1019(var10.method_1021(yaw));
      return Iiiilllliiilll.field_1687.method_17742(new class_3959(reach, var11, class_3960.field_17558, class_242.field_1348, Iiiilllliiilll.field_1724));
   }

   private void Ilillllill() {
      this.liIiIIIIiiiIiIIIIi = false;
      this.IlIiIIIIillIiIIIIi = null;
      this.ilIiIIIIiIiIiIIIIi = null;
      ++this.iliiIIIIiIiiiIIIIi;
      this.IIIIlIIIilIIIlIIIi = true;
      this.iiilIIIIiIIIiIIIIi = null;
      this.llliIIIIiilliIIIIi = 0;
      this.IiliIIIIililiIIIIi = 0;
      this.iIliIIIIiIlliIIIIi = Math.max((1303789158 * 252645135 - -85) * -49 ^ -1547571477, this.iliIIIIIiIiiIIIIIi.Iilllilliill());
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1761 != null) {
         this.iIiIlIIIiIliIlIIIi = false;
         if (this.lIlIlIIIiiIlIlIIIi > 0) {
            --this.lIlIlIIIiiIlIlIIIi;
         } else {
            switch (this.lIllIIIIiiIllIIIIi.ordinal()) {
               case 0:
                  if (this.IlIllllIll()) {
                     this.ilIllIiIll();
                  }
                  break;
               case 1:
                  this.liIlliiIll();
                  break;
               case 2:
                  this.iiIilIIlil();
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(-((char)(var4[var5] + 16349))) ^ var5) ^ '뼕'))) ^ '\ue2ae') >>> 3 | (char)((char)(~((char)((char)((char)(-((char)(var4[var5] + 16349))) ^ var5) ^ '뼕'))) ^ '\ue2ae') << 13))) ^ 7248) - var5))) ^ var5))) + 31473) + '\uf2cd') - '\uf681'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private float[] illilIilil(class_243 point) {
      float[] var2 = ilIiiIiIii.Ililllililil(Iiiilllliiilll.field_1724.method_33571(), point);
      return this.lililiilil(var2[0], var2[1]);
   }

   private void liilliiill() {
      if (this.liIiIIIIiiiIiIIIIi) {
         Iiiilllliiilll.field_1761.method_2925();
         this.liIiIIIIiiiIiIIIIi = false;
      }

      this.IlIiIIIIillIiIIIIi = null;
      this.ilIiIIIIiIiIiIIIIi = null;
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      if (this.iIiIlIIIiIliIlIIIi && Iiiilllliiilll.field_1724 != null) {
         float var2 = e.Illlllllilll();
         e.IlIlllIlilIl(class_3532.method_17821(var2, this.IllIlIIIilllIlIIIi, this.lilIlIIIiiilIlIIIi));
         e.IIlllIlliIll(class_3532.method_16439(var2, this.illIlIIIiIilIlIIIi, this.IIiIlIIIilIiIlIIIi));
      }
   }

   private void liIlliiIll() {
      if (++this.iiliIIIIiIIiiIIIIi > this.liiIIIIIiiiiIIIIIi.Iilllilliill() * 20) {
         this.Illillllil(IliIlllilIi<invokedynamic>() + this.liiiIIIIiiiiiIIIIi);
         this.IiIilliIil();
      } else {
         this.IIIillIIil(this.IliIIIIIilliIIIIIi.Iilllilliill());
         ((AccessorClientPlayerInteractionManager)Iiiilllliiilll.field_1761).setBlockBreakingCooldown(0);
         if (this.iIliIIIIiIlliIIIIi > 0) {
            --this.iIliIIIIiIlliIIIIi;
         } else {
            if (this.IIIIlIIIilIIIlIIIi) {
               this.ilillIiill();
            }

            if (this.liIiIIIIiiiIiIIIIi && this.IlIiIIIIillIiIIIIi != null && !this.iIlllIllll(this.IlIiIIIIillIiIIIIi)) {
               this.Ilillllill();
            } else {
               if (this.iiilIIIIiIIIiIIIIi == null || !this.iIlllIllll(this.iiilIIIIiIIIiIIIIi) || this.IiilIIIIiliilIIIIi.contains(this.iiilIIIIiIIIiIIIIi)) {
                  this.iiilIIIIiIIIiIIIIi = this.lllllillll();
                  this.llliIIIIiilliIIIIi = 0;
                  this.IiliIIIIililiIIIIi = 0;
                  if (this.iiilIIIIiIIIiIIIIi == null) {
                     if (++this.lIiiIIIIiiIiiIIIIi >= 2) {
                        this.Illillllil(IliIlllilIi<invokedynamic>() + this.liiiIIIIiiiiiIIIIi + IliIlllilIi<invokedynamic>());
                        this.IiIilliIil();
                        return;
                     }

                     this.iIliIIIIiIlliIIIIi = 20;
                     return;
                  }

                  this.lIiiIIIIiiIiiIIIIi = 0;
                  if (!this.iiilIIIIiIIIiIIIIi.equals(this.lIIiIIIIiiIIiIIIIi)) {
                     this.lIIiIIIIiiIIiIIIIi = this.iiilIIIIiIIIiIIIIi;
                     this.IliiIIIIilliiIIIIi = 0;
                  }
               }

               if (!this.IliIIIIIilliIIIIIi.Iilllilliill() || Iiiilllliiilll.field_1724.method_5715()) {
                  if (this.IIIlIIIIilIIlIIIIi.Iilllilliill()) {
                     this.iIIilIlIil(this.iiilIIIIiIIIiIIIIi);
                  }

                  float[] var1 = this.illilIilil(class_243.method_24953(this.iiilIIIIiIIIiIIIIi));
                  if (this.liIiIIIIiiiIiIIIIi && this.iiilIIIIiIIIiIIIIi.equals(this.IlIiIIIIillIiIIIIi)) {
                     if (++this.IiliIIIIililiIIIIi > 300) {
                        this.IIllllIlll();
                     } else {
                        this.lIilliIill(this.iiilIIIIiIIIiIIIIi, this.ilIiIIIIiIiIiIIIIi);
                     }
                  } else if (++this.llliIIIIiilliIIIIi > 60) {
                     this.IIllllIlll();
                  } else {
                     class_3965 var2 = this.IIiillIiil(Iiiilllliiilll.field_1724.method_33571(), var1[0], var1[1], (double)6.0F);
                     if (var2.method_17783() == class_240.field_1332 && var2.method_17777().equals(this.iiilIIIIiIIIiIIIIi)) {
                        this.lIilliIill(this.iiilIIIIiIIIiIIIIi, var2.method_17780());
                     }

                  }
               }
            }
         }
      }
   }

   private void iiIilIIlil() {
      long var2 = -6003418232842647738L;
      this.liilliiill();
      this.IIIillIIil(false);
      if (this.iliiIIIIiIiiiIIIIi == 0) {
         this.lIliliIlil();
      } else {
         var2 ^= ((long)this.llIililIil() << 32 ^ var2) & -1L << 32;
         if ((int)(var2 >>> 32) != this.iiIIlIIIiIIlIlIIIi) {
            this.iiIIlIIIiIIlIlIIIi = (int)(var2 >>> 32);
            this.IiIIlIIIiliIIlIIIi = 0;
         } else {
            ++this.IiIIlIIIiliIIlIIIi;
         }

         if (++this.llIIlIIIiilIIlIIIi >= this.llIlIIIIiilIlIIIIi.Iilllilliill() || this.liiiIIIIiiiiiIIIIi > 0 && this.IiIIlIIIiliIIlIIIi >= (-452299960 * -29 * 7 ^ 1622578658)) {
            this.lIliliIlil();
         }

      }
   }

   private int llIililIil() {
      int var1 = 0;

      for(class_1799 var3 : Iiiilllliiilll.field_1724.method_31548().method_67533()) {
         if (var3.method_31574(class_1802.field_8849)) {
            var1 += var3.method_7947();
         }
      }

      return var1;
   }

   private void IIllllIlll() {
      if (this.iiilIIIIiIIIiIIIIi != null) {
         this.IiilIIIIiliilIIIIi.add(this.iiilIIIIiIIIiIIIIi);
      }

      this.liilliiill();
      this.iiilIIIIiIIIiIIIIi = null;
      this.llliIIIIiilliIIIIi = 0;
      this.IiliIIIIililiIIIIi = 0;
   }

   private float[] lililiilil(float wantPitch, float wantYaw) {
      this.IllIlIIIilllIlIIIi = Iiiilllliiilll.field_1724.method_36454();
      this.illIlIIIiIilIlIIIi = Iiiilllliiilll.field_1724.method_36455();
      this.iIiIlIIIiIliIlIIIi = true;
      float var3 = (float)this.iIIlIIIIiIlIlIIIIi.Iilllilliill();
      float var4 = class_3532.method_15363(var3 / 150.0F, 0.08F, 0.9F);
      float var5 = lilllliillll.liiiIIllIl(this.IllIlIIIilllIlIIIi, wantPitch, var4, var3, 0.05F);
      float var6 = class_3532.method_15363(lilllliillll.liiiIIllIl(this.illIlIIIiIilIlIIIi, wantYaw, var4, var3, 0.05F), -90.0F, 90.0F);
      Iiiilllliiilll.field_1724.method_36456(var5);
      Iiiilllliiilll.field_1724.method_36457(var6);
      this.lilIlIIIiiilIlIIIi = var5;
      this.IIiIlIIIilIiIlIIIi = var6;
      return new float[]{var5, var6};
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) - 24876) >>> 15 | (char)((char)(-((char)(var4[var5] - var5))) - 24876) << 1))))) - 13011))) << 10 | (char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) - 24876) >>> 15 | (char)((char)(-((char)(var4[var5] - var5))) - 24876) << 1))))) - 13011))) >>> 6))) >>> 9 | (char)(-((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) - 24876) >>> 15 | (char)((char)(-((char)(var4[var5] - var5))) - 24876) << 1))))) - 13011))) << 10 | (char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] - var5))) - 24876) >>> 15 | (char)((char)(-((char)(var4[var5] - var5))) - 24876) << 1))))) - 13011))) >>> 6))) << 7)))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIliliIlil() {
      this.liilliiill();
      this.IIIillIIil(false);
      String var1 = this.iiIlIIIIiIIllIIIIi.Iilllilliill();
      if (var1 == null || var1.isBlank()) {
         var1 = IliIlllilIi<invokedynamic>();
      }

      if (Iiiilllliiilll.method_1562() != null) {
         Iiiilllliiilll.method_1562().method_48296().method_10747(class_2561.method_43470(var1));
      }

      this.lIllIIIIiiIllIIIIi = IiIIilliIIil.IlIilIlillIilIli;
      this.iiilIIIIiIIIiIIIIi = null;
      this.lIIiIIIIiiIIiIIIIi = null;
      this.IlIiIIIIillIiIIIIi = null;
      this.ilIiIIIIiIiIiIIIIi = null;
      this.liIiIIIIiiiIiIIIIi = false;
      this.iliiIIIIiIiiiIIIIi = 0;
      this.liiiIIIIiiiiiIIIIi = 0;
      this.IIIIlIIIilIIIlIIIi = false;
      this.IliiIIIIilliiIIIIi = 0;
      this.lIiiIIIIiiIiiIIIIi = 0;
      this.iIliIIIIiIlliIIIIi = 0;
      this.IiilIIIIiliilIIIIi.clear();
      this.lIlIlIIIiiIlIlIIIi = (1274389220 * 51 * -51 << 13 | 1274389220 * 51 * -51 >>> 19) * 97 ^ -1845336267;
   }

   private boolean Iillllilll(class_2338 p) {
      double var2 = this.iilIIIIIiIIiIIIIIi.Iilllilliill();
      return Iiiilllliiilll.field_1724.method_33571().method_1025(class_243.method_24953(p)) <= var2 * var2;
   }

   private void iiiIlIIIll() {
      this.lIllIIIIiiIllIIIIi = IiIIilliIIil.IlIilIlillIilIli;
      this.iiilIIIIiIIIiIIIIi = null;
      this.lIIiIIIIiiIIiIIIIi = null;
      this.IlIiIIIIillIiIIIIi = null;
      this.ilIiIIIIiIiIiIIIIi = null;
      this.liIiIIIIiiiIiIIIIi = false;
      this.iIliIIIIiIlliIIIIi = 0;
      this.llliIIIIiilliIIIIi = 0;
      this.IiliIIIIililiIIIIi = 0;
      this.iiliIIIIiIIiiIIIIi = 0;
      this.lIiiIIIIiiIiiIIIIi = 0;
      this.IliiIIIIilliiIIIIi = 0;
      this.iliiIIIIiIiiiIIIIi = 0;
      this.liiiIIIIiiiiiIIIIi = 0;
      this.IIIIlIIIilIIIlIIIi = false;
      this.iIIIlIIIiIlIIlIIIi = 0;
      this.llIIlIIIiilIIlIIIi = 0;
      this.IiIIlIIIiliIIlIIIi = 0;
      this.iiIIlIIIiIIlIlIIIi = 0;
      this.lIlIlIIIiiIlIlIIIi = 0;
      this.IiilIIIIiliilIIIIi.clear();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) << 7) + var5) ^ 'ꗫ'))) - var5) + var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) << 7) + var5) ^ 'ꗫ'))) - var5) + var5) << 2) << 10 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) << 7) + var5) ^ 'ꗫ'))) - var5) + var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) << 4 | (char)((char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] + 31610) + var5) >>> 10 | (char)((char)(var4[var5] + 31610) + var5) << 6) - var5) - var5) << 6) >>> 12) + 24653) << 7) + var5) ^ 'ꗫ'))) - var5) + var5) << 2) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean IlIllllIll() {
      double var1 = this.IilIIIIIililIIIIIi.Iilllilliill();
      double var3 = var1 * var1;

      for(class_742 var6 : Iiiilllliiilll.field_1687.method_18456()) {
         if (var6 != Iiiilllliiilll.field_1724 && !var6.method_7325() && (!this.lIiIIIIIiiIiIIIIIi.Iilllilliill() || !iIIiIiIlIlIiIiIl.liiiIIllIl(var6)) && var6.method_5858(Iiiilllliiilll.field_1724) <= var3) {
            return true;
         }
      }

      return false;
   }

   private void Illillllil(String s) {
      if (this.IiIlIIIIiliIlIIIIi.Iilllilliill() && Iiiilllliiilll.field_1705 != null) {
         Iiiilllliiilll.field_1705.method_1743().method_1812(IlIllllllIllll.lllllillll(class_2561.method_43470(IliIlllilIi<invokedynamic>() + s)));
      }
   }

   private class_2338 iilllIIill() {
      class_243 var1 = Iiiilllliiilll.field_1724.method_33571();
      double var2 = this.iilIIIIIiIIiIIIIIi.Iilllilliill();
      double var4 = var2 * var2;
      int var6 = (int)Math.ceil(var2);
      class_2338 var7 = Iiiilllliiilll.field_1724.method_24515();
      class_2338 var8 = null;
      double var9 = Double.MAX_VALUE;

      for(int var11 = -var6; var11 <= var6; ++var11) {
         for(int var12 = -var6; var12 <= var6; ++var12) {
            for(int var13 = -var6; var13 <= var6; ++var13) {
               class_2338 var14 = var7.method_10069(var11, var12, var13);
               if (!this.IiilIIIIiliilIIIIi.contains(var14) && Iiiilllliiilll.field_1687.method_8320(var14).method_27852(class_2246.field_10260)) {
                  double var15 = var1.method_1025(class_243.method_24953(var14));
                  if (!(var15 > var4) && var15 < var9) {
                     var9 = var15;
                     var8 = var14;
                  }
               }
            }
         }
      }

      return var8;
   }
}
