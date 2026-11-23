package gg.corz;

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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_1684;
import net.minecraft.class_1802;
import net.minecraft.class_239;
import net.minecraft.class_243;
import net.minecraft.class_2828;
import net.minecraft.class_3959;
import net.minecraft.class_3965;
import net.minecraft.class_239.class_240;
import net.minecraft.class_3959.class_242;
import net.minecraft.class_3959.class_3960;

public class liiIlliiiiIlli extends ilIllIiIll {
   private final IIIIlilllIIIlill lIllilIIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)60.0F, (double)10.0F, (double)120.0F, (double)5.0F);
   private final IIIIlilllIIIlill illlilIIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)3.0F, (double)0.5F, (double)12.0F, (double)0.5F);
   private final Set<Integer> lillilIIIl = new HashSet();
   private final IllIIiIllllIIiIl IillilIIIl = new IllIIiIllllIIiIl();
   private final iilliIlIIiliIl iIllilIIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 500, 100, 3000);
   private final iiIiiilIIliiil llllilIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil IlllilIIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) + '뱕') + var5))) ^ 18277) + 13556) + var5) - var5) - 4192) >>> 11 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) + '뱕') + var5))) ^ 18277) + 13556) + var5) - var5) - 4192) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll(float yaw, float pitch) {
      float var3 = Iiiilllliiilll.field_1724.method_36454();
      float var4 = Iiiilllliiilll.field_1724.method_36455();
      Iiiilllliiilll.field_1724.method_36456(yaw);
      Iiiilllliiilll.field_1724.method_36457(pitch);
      Iiiilllliiilll.field_1724.field_3944.method_52787(new class_2828.class_2831(yaw, pitch, Iiiilllliiilll.field_1724.method_24828(), Iiiilllliiilll.field_1724.field_5976));
      Iiiilllliiilll.field_1761.method_2919(Iiiilllliiilll.field_1724, class_1268.field_5808);
      Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
      Iiiilllliiilll.field_1724.method_36456(var3);
      Iiiilllliiilll.field_1724.method_36457(var4);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) - '\ufb0d'))) << 6 | (char)(-((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) - '\ufb0d'))) >>> 10) + 16554))) ^ '\uef5d') - var5) + 4354) - '쟨') ^ '븍') >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) - '\ufb0d'))) << 6 | (char)(-((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) - '\ufb0d'))) >>> 10) + 16554))) ^ '\uef5d') - var5) + 4354) - '쟨') ^ '븍') << 15) + 27887) ^ var5) + 19316))) + var5) ^ '\uf327') - 6976));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 324834407875346611L ^ Long.rotateLeft(-1003332198068002096L, 21) ^ 8657924560894648361L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5545993261743386062L ^ Long.rotateLeft(8460502042763419363L, 54) ^ 5777265965615632886L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7323403756679662004L ^ Long.rotateLeft(8187175077269754671L, 1) ^ -2333920780426528324L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2056882264300757542L ^ Long.rotateLeft(-4624913645652117432L, 27) ^ 2717500548259783294L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 258340465052494687L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2638774414315012432L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -847060846946152590L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5920948189014626180L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5154209430956641315L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6204733335175318483L;
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) >>> 2) - var5) >>> 14 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) >>> 2) - var5) << 2) - '褼') ^ var5) ^ var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) >>> 2) - var5) >>> 14 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) << 14 | (char)((char)((char)(~((char)(var4[var5] + '쒎'))) - var5) + var5) >>> 2) - var5) << 2) - '褼') ^ var5) ^ var5) + var5) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Illillliilli() {
      this.lillilIIIl.clear();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + '퀊'))) ^ var5) + 16180) ^ var5) ^ '찓') - var5))) << 15 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + '퀊'))) ^ var5) + 16180) ^ var5) ^ '찓') - var5))) >>> 1) + '\ue9cf'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private boolean lIIlliIIll(class_243 to, class_243 from) {
      class_3965 var3 = Iiiilllliiilll.field_1687.method_17742(new class_3959(to, from, class_3960.field_17558, class_242.field_1348, Iiiilllliiilll.field_1724));
      return ((class_239)var3).method_17783() != class_240.field_1332 || ((class_239)var3).method_17784().method_1022(from) <= Double.longBitsToDouble(-106632009956492472L ^ -4718318028383880376L);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 18487) - var5) + 16896) ^ var5) + '\udb91') - '頹') >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + 18487) - var5) + 16896) ^ var5) + '\udb91') - '頹') << 5) ^ var5) + 5290)) + var5) - var5) ^ '\ufdee'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null && Iiiilllliiilll.field_1687 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            this.lillilIIIl.removeIf((id) -> Iiiilllliiilll.field_1687.method_8469(id) == null);
            if (this.IillilIIIl.iIlIlllllill((long)this.iIllilIIIl.Iilllilliill())) {
               class_1684 var1 = this.IlIllllIll();
               if (var1 != null) {
                  lIililiIilil var2 = liIiililiiIiilil.liiiIIllIl(var1.method_73189(), var1.method_18798(), 300);
                  class_243 var3 = var2.IIIlIIiilIIlIIii;
                  class_243 var4 = Iiiilllliiilll.field_1724.method_33571();
                  if (var4.method_1022(var3) > this.lIllilIIIl.Iilllilliill()) {
                     this.lillilIIIl.add(var1.method_5628());
                  } else {
                     int var5 = IilIIililIIi.lIiiIiIlilli(class_1802.field_8634);
                     if (var5 != -1) {
                        float var6 = liIiililiiIiilil.IiIlliIliiIl(var4, var3, (double)1.5F, 0.03);
                        if (Float.isNaN(var6)) {
                           this.lillilIIIl.add(var1.method_5628());
                        } else {
                           float var7 = ilIiiIiIii.Ililllililil(var4, var3)[0];
                           if (this.IlllilIIIl.Iilllilliill()) {
                              lIililiIilil var8 = liIiililiiIiilil.liiiIIllIl(var4, this.iiiIlIIIll(var7, var6), 300);
                              double var9 = var8.IIIlIIiilIIlIIii.method_1022(var3);
                              if (var8.iIIlIIiiIlIlIIii && var9 > this.illlilIIIl.Iilllilliill()) {
                                 return;
                              }
                           }

                           if (!this.llllilIIIl.Iilllilliill() || this.lIIlliIIll(var4, var3)) {
                              int var11 = Iiiilllliiilll.field_1724.method_31548().method_67532();
                              Iiiilllliiilll.field_1724.method_31548().method_61496(var5);
                              this.ilIllIiIll(var7, var6);
                              Iiiilllliiilll.field_1724.method_31548().method_61496(var11);
                              this.lillilIIIl.add(var1.method_5628());
                              this.IillilIIIl.IliIlllilIi();
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private class_1684 IlIllllIll() {
      for(class_1297 var2 : Iiiilllliiilll.field_1687.method_18112()) {
         if (var2 instanceof class_1684 var3) {
            if (!this.lillilIIIl.contains(var3.method_5628())) {
               class_1297 var4 = var3.method_24921();
               if (var4 instanceof class_1657 && var4 != Iiiilllliiilll.field_1724 && !iIIiIiIlIlIiIiIl.liiiIIllIl(var4)) {
                  return var3;
               }
            }
         }
      }

      return null;
   }

   public liiIlliiiiIlli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIllilIIIl, this.iIllilIIIl, this.IlllilIIIl, this.llllilIIIl, this.illlilIIIl});
   }

   private class_243 iiiIlIIIll(float yaw, float pitch) {
      double var3 = Math.toRadians((double)yaw);
      double var5 = Math.toRadians((double)pitch);
      class_243 var7 = (new class_243(-Math.sin(var3) * Math.cos(var5), -Math.sin(var5), Math.cos(var3) * Math.cos(var5))).method_1029();
      return var7.method_1021(Double.longBitsToDouble(1807395011368621645L ^ 2804942328831186509L)).method_1019(Iiiilllliiilll.field_1724.method_18798());
   }
}
