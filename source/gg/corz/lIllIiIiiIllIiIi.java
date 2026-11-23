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
import net.minecraft.class_1268;
import net.minecraft.class_1802;
import net.minecraft.class_3532;

public class lIllIiIiiIllIiIi extends ilIllIiIll {
   private final iiIiiilIIliiil lIIlIIiIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int liIlIIiIIi = -1;
   private float IillIIiIIi;
   private final IIIIlilllIIIlill iIIlIIiIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)-80.0F, (double)-90.0F, (double)0.0F, (double)1.0F);
   private boolean iIllIIiIIi;
   private float IlllIIiIIi;
   private float llllIIiIIi;
   private float illlIIiIIi;
   private int IiIlIIiIIi;
   private float lIllIIiIIi;
   private boolean ilIlIIiIIi;
   private final iilliIlIIiliIl IlIlIIiIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2, 0, 20);
   private static final float IIilIIiIIi = 8.0F;
   private float IIllIIiIIi;
   private static final float lillIIiIIi = 0.5F;
   private boolean iiIlIIiIIi;
   private final iiIiiilIIliiil llIlIIiIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final float lIilIIiIIi = 0.8F;
   private static final float iillIIiIIi = 60.0F;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) << 11 | (char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 5) - 29906))))))) ^ var5) ^ var5) >>> 6 | (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) << 11 | (char)(var4[var5] >>> 3 | var4[var5] << 13) >>> 5) - 29906))))))) ^ var5) ^ var5) << 10) ^ '뻩'))) - var5) + 28645))) - var5));
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
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + var5))))) + 16766) + var5) + '\ueb31') ^ '銂') + 28716) - var5) + var5) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(var4[var5] + var5))))) + 16766) + var5) + '\ueb31') ^ '銂') + 28716) - var5) + var5) >>> 11))) ^ var5) + '聘'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7031223511955810575L ^ Long.rotateLeft(-4237157180023530138L, 29) ^ -334081140298811488L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7255084834043785792L ^ Long.rotateLeft(973173832276848956L, 12) ^ 7715486283144856258L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1878304512491101712L ^ Long.rotateLeft(-2282896561903516836L, 33) ^ -7670585539029874501L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1164044187684597258L ^ Long.rotateLeft(2863536901548075142L, 35) ^ -7731045467336231127L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1804067125427349618L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2393845216241955344L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6840818019172407949L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7587991491787039489L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5247906874319190664L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1701925768260132273L;
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + '\uec96') - var5) ^ '\ue2ba') - var5) + var5))) - var5) ^ '젟') ^ var5) - var5))) - '쨸'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      if (this.iIllIIiIIi && Iiiilllliiilll.field_1724 != null) {
         float var2 = e.Illlllllilll();
         e.IlIlllIlilIl(class_3532.method_17821(var2, this.IlllIIiIIi, this.illlIIiIIi));
         e.IIlllIlliIll(class_3532.method_16439(var2, this.llllIIiIIi, this.IillIIiIIi));
         e.IIillIiliIil();
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)(~((char)(~((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))))))) - var5) - '뻼'))) << 9 | (char)(-((char)((char)((char)(~((char)(~((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))))))) - var5) - '뻼'))) >>> 7))))) + 12309) + var5) << 12 | (char)((char)((char)(-((char)(~((char)((char)(-((char)((char)((char)(~((char)(~((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))))))) - var5) - '뻼'))) << 9 | (char)(-((char)((char)((char)(~((char)(~((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))))))) - var5) - '뻼'))) >>> 7))))) + 12309) + var5) >>> 4))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll(int slot) {
      Iiiilllliiilll.field_1724.method_31548().method_61496(slot);
      Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
      Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724.field_3944 != null) {
         if (Iiiilllliiilll.field_1755 != null) {
            this.IIillIiliIil(false);
         } else {
            boolean var1 = true;
            if (this.lIIlIIiIIi.Iilllilliill()) {
               if (!this.iiIlIIiIIi) {
                  this.IIllIIiIIi = Iiiilllliiilll.field_1724.method_36454();
                  this.lIllIIiIIi = (float)this.iIIlIIiIIi.Iilllilliill();
                  this.iiIlIIiIIi = true;
               }

               var1 = this.IlIllllIll();
            }

            if (!this.ilIlIIiIIi) {
               int var2 = IilIIililIIi.lIiiIiIlilli(class_1802.field_8634);
               int var3 = IilIIililIIi.lIiiIiIlilli(class_1802.field_49098);
               if (var2 == -1 || var3 == -1) {
                  Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), var2 == -1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>(), false);
                  this.IIillIiliIil(false);
                  return;
               }

               if (Iiiilllliiilll.field_1724.method_7357().method_7904(Iiiilllliiilll.field_1724.method_31548().method_5438(var2))) {
                  this.IIillIiliIil(false);
                  return;
               }

               if (this.lIIlIIiIIi.Iilllilliill() && !var1) {
                  return;
               }

               this.liIlIIiIIi = Iiiilllliiilll.field_1724.method_31548().method_67532();
               this.lIIlliIIll(var2);
               this.ilIlIIiIIi = true;
               this.IiIlIIiIIi = this.IlIlIIiIIi.Iilllilliill();
               if (this.IiIlIIiIIi > 0) {
                  return;
               }
            } else if (this.IiIlIIiIIi > 0) {
               --this.IiIlIIiIIi;
               if (this.IiIlIIiIIi > 0) {
                  return;
               }
            }

            int var4 = IilIIililIIi.lIiiIiIlilli(class_1802.field_49098);
            if (var4 != -1) {
               this.lIIlliIIll(var4);
            }

            this.IIillIiliIil(false);
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(-((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ var5))))) + 29607) << 9 | (char)((char)(-((char)(~((char)((char)(-((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ var5))))) + 29607) >>> 7) + 9532) - '싌') - '읪') + 29112))) + var5))) - 29902) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiIlIIIll() {
      this.ilIlIIiIIi = false;
      this.IiIlIIiIIi = 0;
      this.liIlIIiIIi = -1;
      this.iiIlIIiIIi = false;
      this.iIllIIiIIi = false;
   }

   private boolean IlIllllIll() {
      this.IlllIIiIIi = Iiiilllliiilll.field_1724.method_36454();
      this.llllIIiIIi = Iiiilllliiilll.field_1724.method_36455();
      this.iIllIIiIIi = true;
      float var1 = class_3532.method_15393(lilllliillll.liiiIIllIl(this.IlllIIiIIi, this.IIllIIiIIi, 0.5F, 60.0F, 8.0F));
      float var2 = class_3532.method_15363(lilllliillll.liiiIIllIl(this.llllIIiIIi, this.lIllIIiIIi, 0.5F, 60.0F, 8.0F), -90.0F, 90.0F);
      Iiiilllliiilll.field_1724.method_36456(var1);
      Iiiilllliiilll.field_1724.method_36457(var2);
      this.illlIIiIIi = var1;
      this.IillIIiIIi = var2;
      return Math.abs(class_3532.method_15393(this.IIllIIiIIi - var1)) <= 0.8F && Math.abs(this.lIllIIiIIi - var2) <= 0.8F;
   }

   protected void Illillliilli() {
      this.iiiIlIIIll();
   }

   public lIllIiIiiIllIiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IIIlIIIilIIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIlIIiIIi, this.iIIlIIiIIi, this.IlIlIIiIIi, this.llIlIIiIIi});
   }

   protected void Iilililiiili() {
      if (this.liIlIIiIIi != ((-988469792 >>> 11 | -988469792 << 21) ^ 1139236187) && this.llIlIIiIIi.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_31548().method_61496(this.liIlIIiIIi);
      }

      this.iiiIlIIIll();
   }
}
