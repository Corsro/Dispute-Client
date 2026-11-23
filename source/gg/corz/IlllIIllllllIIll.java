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
import net.minecraft.class_1306;
import net.minecraft.class_310;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;

public class IlllIIllllllIIll extends ilIllIiIll {
   private final lliliIIiililiIIi lIliIIllll = (lliliIIiililiIIi)(new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()})).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill liIiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)10.0F, (double)1.0F, (double)20.0F)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final lliliIIiililiIIi llIiIIllll = (lliliIIiililiIIi)(new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()})).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill illiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)0.0F, (double)-180.0F, (double)180.0F, (double)5.0F)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill llliIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)-3.0F, (double)3.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill iiliIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), "", (double)0.0F, (double)-2.0F, (double)2.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill ilIiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)5.0F, (double)1.0F, (double)20.0F)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill liliIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), "", (double)0.0F, (double)-2.0F, (double)2.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final iiIiiilIIliiil IiIiIIllll = (iiIiiilIIliiil)(new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill iiIiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)10.0F, (double)1.0F, (double)20.0F)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill iIiiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), "", (double)0.0F, (double)-2.0F, (double)2.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill IliiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), "", (double)0.0F, (double)-2.0F, (double)2.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final iiIiiilIIliiil lIIiIIllll = (iiIiiilIIliiil)(new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final lliliIIiililiIIi IlIiIIllll = (lliliIIiililiIIi)(new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()})).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final lliliIIiililiIIi IIliIIllll = (lliliIIiililiIIi)(new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()})).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill iIliIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)-3.0F, (double)3.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final iiIiiilIIliiil IiliIIllll = (iiIiiilIIliiil)(new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill IlliIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)1.0F, (double)-3.0F, (double)3.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final iiIiiilIIliiil iIIiIIllll = (iiIiiilIIliiil)(new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill IIiiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), "", (double)0.0F, (double)-2.0F, (double)2.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());
   private final IIIIlilllIIIlill lIiiIIllll = (IIIIlilllIIIlill)(new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), "", (double)0.0F, (double)-2.0F, (double)2.0F, 0.1)).iIlIlllllill(IliIlllilIi<invokedynamic>());

   public boolean iiiIlIIIll() {
      if (!this.IliIlllilIi()) {
         return false;
      } else if (this.lIIiIIllll.Iilllilliill()) {
         return iillIiIlIIilIiIl.liiiIIllIl(Double.longBitsToDouble(5498110984511822931L ^ 888676765898120275L)) != null;
      } else {
         return true;
      }
   }

   private void ilIllIiIll(class_4587 factor, class_1306 matrices, float swingProgress, float arm) {
      long var8 = -6058973447686686728L;
      var8 ^= ((long)(matrices == class_1306.field_6183 ? 1 : -1) << 32 ^ var8) & -1L << 32;
      float var6 = class_3532.method_15374((double)(swingProgress * swingProgress * (float)Math.PI));
      factor.method_22907(class_7833.field_40716.rotationDegrees((float)((int)(var8 >>> 32)) * (45.0F + var6 * -20.0F * arm)));
      float var7 = class_3532.method_15374((double)(class_3532.method_15355(swingProgress) * (float)Math.PI));
      factor.method_22907(class_7833.field_40718.rotationDegrees((float)((int)(var8 >>> 32)) * var7 * -20.0F * arm));
      factor.method_22907(class_7833.field_40714.rotationDegrees(var7 * -80.0F * arm));
      factor.method_22907(class_7833.field_40716.rotationDegrees((float)((int)(var8 >>> 32)) * -45.0F));
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) >>> 11 | (char)((char)(-var4[var5]) - var5) << 5) - '뚛'))) - var5) ^ var5) + 30630) ^ var5))))) + '뉦') - var5) - var5) << 11 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) - var5) >>> 11 | (char)((char)(-var4[var5]) - var5) << 5) - '뚛'))) - var5) ^ var5) + 30630) ^ var5))))) + '뉦') - var5) - var5) >>> 5))) - 18154) + var5) - 7171));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlllIIllllllIIll() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIiIIllll, this.iIIiIIllll, this.IlIiIIllll, this.llIiIIllll, this.ilIiIIllll, this.IiIiIIllll, this.liIiIIllll, this.iiIiIIllll, this.IIliIIllll, this.lIliIIllll, this.iIliIIllll, this.IlliIIllll, this.llliIIllll, this.illiIIllll, this.IiliIIllll, this.liliIIllll, this.iiliIIllll, this.IIiiIIllll, this.lIiiIIllll, this.iIiiIIllll, this.IliiIIllll});
   }

   public void lIIlliIIll(class_4587 arm, class_1306 matrices) {
      if (this.iiiIlIIIll() && this.IiliIIllll.Iilllilliill()) {
         if (matrices == class_1306.field_6183) {
            arm.method_46416((float)this.liliIIllll.Iilllilliill(), (float)this.iiliIIllll.Iilllilliill(), (float)this.IIiiIIllll.Iilllilliill());
         } else {
            arm.method_46416(-((float)this.lIiiIIllll.Iilllilliill()), (float)this.iIiiIIllll.Iilllilliill(), (float)this.IliiIIllll.Iilllilliill());
         }
      }

   }

   public boolean IlIllllIll(float arm, float armX, class_4587 swingProgress, float matrices, class_1306 equipProgress) {
      if (!this.iiiIlIIIll()) {
         return false;
      } else {
         boolean var6 = false;
         if (this.IiliIIllll.Iilllilliill()) {
            this.lIIlliIIll(swingProgress, equipProgress);
            var6 = true;
         }

         if (!this.IiIiIIllll.Iilllilliill()) {
            if (this.IiliIIllll.Iilllilliill()) {
               this.ilIllIiIll(swingProgress, equipProgress, arm, 1.0F);
               return true;
            } else {
               return false;
            }
         } else {
            var6 = true;
            boolean var7 = equipProgress == class_1306.field_6183;
            int var8 = var7 ? 1 : -1;
            class_1306 var9 = (class_1306)class_310.method_1551().field_1690.method_42552().method_41753();
            boolean var10 = equipProgress == var9;
            swingProgress.method_46416((float)var8 * 0.56F, -0.52F, -0.72F);
            if (this.iIIiIIllll.Iilllilliill()) {
               boolean var11 = false;
               if (this.IlIiIIllll.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
                  var11 = true;
               } else if (this.IlIiIIllll.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) && var7) {
                  var11 = true;
               } else if (this.IlIiIIllll.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) && !var7) {
                  var11 = true;
               }

               if (var11) {
                  float var12 = (float)(System.currentTimeMillis() % 360000L) / 1000.0F;
                  float var13 = this.llIiIIllll.Iilllilliill().equals(IliIlllilIi<invokedynamic>()) ? 1.0F : -1.0F;
                  float var14 = var12 * ((float)this.ilIiIIllll.Iilllilliill() / 5.0F) * var13;
                  swingProgress.method_22907(class_7833.field_40714.rotationDegrees(360.0F * var14));
               }
            }

            if (var10) {
               float var40 = (float)liIlliiIll(this.lIliIIllll.Iilllilliill()).liiiIIllIl((double)arm);
               float var41 = (float)(this.iiIiIIllll.Iilllilliill() / this.iiIiIIllll.Iiilliiliiil());
               String var42 = this.IIliIIllll.Iilllilliill();
               byte var43 = -1;
               switch (var42.hashCode()) {
                  case -1911677324:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 16;
                     }
                     break;
                  case -1814666802:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 2;
                     }
                     break;
                  case -599960602:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 17;
                     }
                     break;
                  case -420095964:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 9;
                     }
                     break;
                  case 2112084:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 15;
                     }
                     break;
                  case 2136258:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 7;
                     }
                     break;
                  case 2433880:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 0;
                     }
                     break;
                  case 2573164:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 10;
                     }
                     break;
                  case 2583650:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 5;
                     }
                     break;
                  case 2587234:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 4;
                     }
                     break;
                  case 64279661:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 1;
                     }
                     break;
                  case 66224048:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 13;
                     }
                     break;
                  case 77476110:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 6;
                     }
                     break;
                  case 79768134:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 12;
                     }
                     break;
                  case 80998175:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 14;
                     }
                     break;
                  case 987507365:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 11;
                     }
                     break;
                  case 1963211882:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 3;
                     }
                     break;
                  case 2029746065:
                     if (var42.equals(IliIlllilIi<invokedynamic>())) {
                        var43 = 8;
                     }
               }

               switch (var43) {
                  case 0:
                  default:
                     break;
                  case 1:
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees((float)(var8 * -45)));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees((float)((double)(var8 * 45) + (double)(90.0F * var41) * Math.sin((double)var40 * Math.PI))));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees((float)var8 * -90.0F));
                     break;
                  case 2:
                     this.ilIllIiIll(swingProgress, equipProgress, var40, var41);
                     break;
                  case 3:
                     if (var40 > 0.0F) {
                        float var44 = class_3532.method_15374((double)(class_3532.method_15355(var40) * (float)Math.PI));
                        swingProgress.method_46416(0.0F, armX * -0.2F + 0.02F, 0.02F);
                        swingProgress.method_22907(class_7833.field_40716.rotationDegrees((float)(45 * var8)));
                        swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var44 * -85.0F * var41));
                        swingProgress.method_46416(-0.1F * (float)var8, 0.28F, 0.2F);
                        swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-85.0F));
                     } else {
                        this.ilIllIiIll(swingProgress, equipProgress, var40, var41);
                     }
                     break;
                  case 4:
                     float var15 = (float)Math.sin((double)var40 * (Math.PI / 2D) * (double)2.0F);
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees((float)(90 * var8)));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees((float)(-70 * var8)));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-100.0F - 60.0F * var41 * var15));
                     break;
                  case 5:
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-var40 * 360.0F * var41 * 3.3F));
                     break;
                  case 6:
                     float var16 = (float)Math.sin((double)var40 * (Math.PI / 2D) * (double)2.0F);
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(45.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var16 * -40.0F * var41));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(30.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-80.0F));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(60.0F));
                     break;
                  case 7:
                     float var17 = class_3532.method_15374((double)(var40 * (float)Math.PI));
                     swingProgress.method_46416(0.0F, -var17 * 0.8F * var41, 0.0F);
                     break;
                  case 8:
                     float var18 = class_3532.method_15374((double)(class_3532.method_15355(var40) * (float)Math.PI));
                     float var19 = (float)this.iIliIIllll.Iilllilliill();
                     float var20 = (float)this.IlliIIllll.Iilllilliill();
                     float var21 = (float)this.llliIIllll.Iilllilliill();
                     float var22 = (float)this.illiIIllll.Iilllilliill();
                     if (var22 != 0.0F) {
                        swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var22));
                     }

                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees((float)var8 * (45.0F + var18 * -20.0F * var19)));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees((float)var8 * var18 * -20.0F * var20));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var18 * -80.0F * var21));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees((float)var8 * -45.0F));
                     break;
                  case 9:
                     float var23 = (float)this.iiIiIIllll.Iilllilliill() * 10.0F;
                     float var24 = class_3532.method_15374((double)(var40 * var40 * (float)Math.PI));
                     float var25 = class_3532.method_15374((double)(class_3532.method_15355(var40) * (float)Math.PI));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(45.0F + var24 * (-var23 / 4.0F)));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(var25 * -(var23 / 4.0F)));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var25 * -var23));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(-45.0F));
                     break;
                  case 10:
                     float var26 = class_3532.method_15374((double)(var40 * (float)Math.PI));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(90.0F));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(-30.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-45.0F - (float)this.iiIiIIllll.Iilllilliill() * 10.0F * var26));
                     break;
                  case 11:
                     float var27 = class_3532.method_15374((double)(class_3532.method_15355(var40) * (float)Math.PI));
                     swingProgress.method_22904((double)0.0F, (double)0.0F, -0.3 * (double)var27);
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var27 * -35.0F));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(var27 * 35.0F));
                     break;
                  case 12:
                     float var28 = class_3532.method_15374((double)(var40 * (float)Math.PI));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(90.0F));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(-60.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-45.0F - (float)this.iiIiIIllll.Iilllilliill() * 10.0F * var28));
                     break;
                  case 13:
                     float var29 = class_3532.method_15374((double)(var40 * (float)Math.PI));
                     swingProgress.method_46416(0.0F, -(var29 * (float)this.iiIiIIllll.Iilllilliill() / 24.0F), 0.0F);
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(90.0F));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(-30.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-90.0F));
                     break;
                  case 14:
                     float var30 = class_3532.method_15374((double)(var40 * (float)Math.PI));
                     swingProgress.method_22905(1.0F, 1.0F, (float)((double)1.0F + (double)var30 * this.iiIiIIllll.Iilllilliill() / (double)4.0F));
                     swingProgress.method_46416(0.0F, 0.0F, -0.265F);
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-100.0F));
                     break;
                  case 15:
                     float var31 = class_3532.method_15355(var40);
                     float var32 = class_3532.method_15374((double)(var31 * (float)Math.PI));
                     float var33 = class_3532.method_15374((double)(var40 * (float)Math.PI));
                     swingProgress.method_46416(0.4F - var32 * 0.2F, -0.2F + var32 * 0.3F, -0.5F - var33 * 0.2F);
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(91.0F));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(-40.0F + var32 * -100.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-60.0F));
                     break;
                  case 16:
                     swingProgress.method_22905(0.8F, 0.8F, 0.8F);
                     float var34 = 1.0F - armX;
                     float var35 = class_3532.method_15374((double)(var40 * (float)Math.PI));
                     swingProgress.method_22904(0.3 - (double)(var35 * 0.15F), (double)(0.2F - var34 * 0.12F), (double)(-0.15F - var35 * 0.13F));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(76.0F - 10.0F * var35));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(-16.0F - 8.0F * var35));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-83.0F - 26.0F * var35));
                     break;
                  case 17:
                     float var36 = class_3532.method_15374((double)((float)((double)(var40 * var40) * Math.PI)));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(45.0F));
                     float var37 = class_3532.method_15374((double)((float)((double)class_3532.method_15355(var40) * Math.PI)));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var36 * -20.0F));
                     swingProgress.method_22907(class_7833.field_40718.rotationDegrees(var37 * -20.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(var37 * -80.0F));
                     swingProgress.method_46416(0.4F, 0.2F, 0.2F);
                     swingProgress.method_46416(-0.5F, 0.08F, 0.0F);
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(20.0F));
                     swingProgress.method_22907(class_7833.field_40714.rotationDegrees(-80.0F));
                     swingProgress.method_22907(class_7833.field_40716.rotationDegrees(20.0F));
               }
            } else {
               this.ilIllIiIll(swingProgress, equipProgress, arm, 1.0F);
            }

            return var6;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) >>> 3) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) >>> 3) << 8) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) >>> 3) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) << 13 | (char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] - var5))) >>> 2 | (char)(~((char)(var4[var5] - var5))) << 14))) + var5) ^ var5) + var5) >>> 3) << 8) >>> 6) + '饕') + '\uf81f'))) ^ '럊'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static llIIIliilIIIli liIlliiIll(String name) {
      byte var2 = -1;
      switch (name.hashCode()) {
         case -1979408738:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 6;
            }
            break;
         case -1555570004:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 8;
            }
            break;
         case -1346489463:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 5;
            }
            break;
         case -1232122635:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 7;
            }
            break;
         case -535915624:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 0;
            }
            break;
         case 173532667:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 3;
            }
            break;
         case 566490939:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 1;
            }
            break;
         case 1084551480:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 4;
            }
            break;
         case 1224395430:
            if (name.equals(IliIlllilIi<invokedynamic>())) {
               var2 = 2;
            }
      }

      llIIIliilIIIli var10000;
      switch (var2) {
         case 0 -> var10000 = llIIIliilIIIli.IIillliiilIillliii;
         case 1 -> var10000 = llIIIliilIIIli.iIillliiiIlillliii;
         case 2 -> var10000 = llIIIliilIIIli.llillliiiilillliii;
         case 3 -> var10000 = llIIIliilIIIli.Iiillliiiliillliii;
         case 4 -> var10000 = llIIIliilIIIli.iiillliiiIIIilliii;
         case 5 -> var10000 = llIIIliilIIIli.lIIilliiiiIIilliii;
         case 6 -> var10000 = llIIIliilIIIli.IlIilliiillIilliii;
         case 7 -> var10000 = llIIIliilIIIli.ilIilliiiIiIilliii;
         case 8 -> var10000 = llIIIliilIIIli.liIilliiiiiIilliii;
         default -> var10000 = llIIIliilIIIli.lilllliiiiilllliii;
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8188706786626114607L ^ Long.rotateLeft(-2407186897664115012L, 56) ^ 2583137534425233897L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3023399591613474914L ^ Long.rotateLeft(3997756025311472873L, 2) ^ -592302335357244678L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7862830831327084982L ^ Long.rotateLeft(5881885557863536186L, 61) ^ 2318947705412434958L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7015141302130792434L ^ Long.rotateLeft(2235541060986857976L, 26) ^ -6123224088324870445L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3621339359868650594L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7761166382497839179L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -751578223162136398L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3724459543856573546L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4775703302250975252L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4571000012638649602L;
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) << 6 | (char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) >>> 10))))) - 31401))))) + '袯') ^ 26779) + var5) ^ 29022) - 15689) << 9 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) << 6 | (char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) >>> 10))))) - 31401))))) + '袯') ^ 26779) + var5) ^ 29022) - 15689) >>> 7) - '鷽') >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) << 6 | (char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) >>> 10))))) - 31401))))) + '袯') ^ 26779) + var5) ^ 29022) - 15689) << 9 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)(~((char)(-((char)((char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) << 6 | (char)((char)(var4[var5] - var5) << 10 | (char)(var4[var5] - var5) >>> 6) >>> 10))))) - 31401))))) + '袯') ^ 26779) + var5) ^ 29022) - 15689) >>> 7) - '鷽') << 5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) ^ '륆') - 7364) ^ var5) + var5) << 2 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) ^ '륆') - 7364) ^ var5) + var5) >>> 14) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) ^ '륆') - 7364) ^ var5) + var5) << 2 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) ^ '륆') - 7364) ^ var5) + var5) >>> 14) << 9) - var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) >>> 10 | (char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) << 6))) << 11 | (char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) >>> 10 | (char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) << 6))) >>> 5) ^ var5) + 2607) + 30121) - var5) + '陣') + 15084) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) >>> 10 | (char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) << 6))) << 11 | (char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) >>> 10 | (char)(~((char)((char)((char)((char)(var4[var5] - 'ꔙ') ^ var5) ^ var5) ^ var5))) << 6))) >>> 5) ^ var5) + 2607) + 30121) - var5) + '陣') + 15084) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
