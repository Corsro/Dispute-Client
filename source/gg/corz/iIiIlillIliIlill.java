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
import net.minecraft.class_1297;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_3532;
import net.minecraft.class_239.class_240;
import org.lwjgl.glfw.GLFW;

public class iIiIlillIliIlill extends ilIllIiIll {
   private float iIIlIIiill;
   private static volatile float iiiIIIiill;
   private final IilIIilllilIIill IiIlIIiill = new IilIIilllilIIill();
   private float lIIlIIiill;
   private boolean ilIlIIiill;
   private final iiIiiilIIliiil IliIIIiill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IIiIIIiill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iliIIIiill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static volatile float liiIIIiill;
   private final IIIIlilllIIIlill IilIIIiill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)4.5F, (double)2.0F, (double)6.0F, 0.1);
   private static volatile boolean IiiIIIiill;
   private static volatile class_1657 IIIlIIiill;
   private final IIIIlilllIIIlill lilIIIiill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)90.0F, (double)10.0F, (double)180.0F, (double)1.0F);
   private final lliliIIiililiIIi iIiIIIiill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final lliliIIiililiIIi iilIIIiill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final lliliIIiililiIIi lIiIIIiill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private float llIlIIiill;
   private final iiIiiilIIliiil lliIIIiill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float IlIlIIiill;

   public iIiIlillIliIlill() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IilIIIiill, this.lilIIIiill, this.iilIIIiill, this.IIiIIIiill, this.lIiIIIiill, this.iIiIIIiill, this.IliIIIiill, this.lliIIIiill, this.iliIIIiill});
   }

   public static float Ilillllill() {
      return iiiIIIiill;
   }

   protected void iiIIlIIlIl(iIIlIlIlIlIlIlIl e) {
      if (this.ilIlIIiill) {
         float var2 = e.Illlllllilll();
         e.IlIlllIlilIl(class_3532.method_16439(var2, this.IlIlIIiill, this.lIIlIIiill));
         e.IIlllIlliIll(class_3532.method_16439(var2, this.llIlIIiill, this.iIIlIIiill));
         e.IIillIiliIil();
      }
   }

   private static boolean llIililIil(class_1297 target) {
      double var1 = Iiiilllliiilll.field_1724.method_55755();
      class_243 var3 = Iiiilllliiilll.field_1724.method_33571();
      class_238 var4 = target.method_5829();
      double var5 = Math.max(var4.field_1323, Math.min(var3.field_1352, var4.field_1320));
      double var7 = Math.max(var4.field_1322, Math.min(var3.field_1351, var4.field_1325));
      double var9 = Math.max(var4.field_1321, Math.min(var3.field_1350, var4.field_1324));
      return var3.method_1028(var5, var7, var9) <= var1 * var1;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) << 10 | (char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) >>> 6) >>> 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) << 10 | (char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) >>> 6) << 15) + '\uf4ad') ^ '셗') ^ var5))) + var5) - var5) >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) << 10 | (char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) >>> 6) >>> 1 | (char)((char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) << 10 | (char)((char)((char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') >>> 8 | (char)((char)((char)(var4[var5] + '퀂') - 26003) ^ '︨') << 8) - 7219) >>> 6) << 15) + '\uf4ad') ^ '셗') ^ var5))) + var5) - var5) << 12) + var5) - '젷') ^ 'ꄂ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_1657 IIIillIIil() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      if (var0 != null && var0.IliIlllilIi() && var0.iliIIIiill.Iilllilliill()) {
         class_1657 var1 = IIIlIIiill;
         if (var1 != null && var1.method_5805() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1761 != null) {
            if (!llIililIil(var1)) {
               return null;
            } else if (Iiiilllliiilll.field_1765 != null && Iiiilllliiilll.field_1765.method_17783() == class_240.field_1332) {
               return null;
            } else if (lIIIIIlliIIIIIll.lIiiIiIlilli()) {
               return null;
            } else {
               class_243 var2 = Iiiilllliiilll.field_1724.method_33571();
               class_243 var3 = var2.method_1019(ilIiiIiIii.Iiilliiliiil(liiIIIiill, iiiIIIiill).method_1021(Iiiilllliiilll.field_1724.method_55755()));
               return var1.method_5829().method_992(var2, var3).isEmpty() ? null : var1;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void IIllllIlll() {
      if (this.ilIlIIiill) {
         this.ilIlIIiill = false;
         if (Iiiilllliiilll.field_1724 != null) {
            Iiiilllliiilll.field_1724.method_36456(this.lIIlIIiill);
            Iiiilllliiilll.field_1724.method_36457(this.iIIlIIiill);
            Iiiilllliiilll.field_1724.field_5982 = this.lIIlIIiill;
            Iiiilllliiilll.field_1724.field_6004 = this.iIIlIIiill;
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5) - 24481) + var5))) - var5))) + var5) ^ '頳') + 18004) >>> 1 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5) - 24481) + var5))) - var5))) + var5) ^ '頳') + 18004) << 15) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5) - 24481) + var5))) - var5))) + var5) ^ '頳') + 18004) >>> 1 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5) - 24481) + var5))) - var5))) + var5) ^ '頳') + 18004) << 15) + var5) >>> 6) - '꽜'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIIilIlIil(boolean humanPress) {
      class_1657 var1 = IIIillIIil();
      if (var1 == null) {
         return false;
      } else {
         if (humanPress) {
            lIIIIIlliIIIIIll.IilliliilIIi(var1);
         } else {
            if (!lIIIIIlliIIIIIll.liiiIIllIl(var1)) {
               return false;
            }

            if (!IIllIIlilIllIIli.Iilllilliill(llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class), var1)) {
               return true;
            }

            lIIIIIlliIIIIIll.iIlIlllllill();
         }

         Iiiilllliiilll.field_1761.method_2918(Iiiilllliiilll.field_1724, var1);
         Iiiilllliiilll.field_1724.method_6104(class_1268.field_5808);
         Iiiilllliiilll.field_1724.method_75203();
         return true;
      }
   }

   private class_243 ilIllIiIll(class_1657 p) {
      double var2 = p.method_23317();
      double var4 = p.method_23318();
      double var6 = p.method_23321();
      double var8 = (double)p.method_17682();
      String var10 = this.iilIIIiill.Iilllilliill();
      byte var11 = -1;
      switch (var10.hashCode()) {
         case 2076098:
            if (var10.equals(IliIlllilIi<invokedynamic>())) {
               var11 = 1;
            }
            break;
         case 2245120:
            if (var10.equals(IliIlllilIi<invokedynamic>())) {
               var11 = 0;
            }
      }

      class_243 var10000;
      switch (var11) {
         case 0 -> var10000 = new class_243(var2, var4 + var8 - 0.1, var6);
         case 1 -> var10000 = new class_243(var2, var4 + var8 * (double)0.5F, var6);
         default -> var10000 = new class_243(var2, var4 + var8 - 0.35, var6);
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] + '\ude3f'))) + 26100) >>> 10 | (char)((char)(-((char)(var4[var5] + '\ude3f'))) + 26100) << 6))))) - var5) >>> 11 | (char)((char)(-((char)(-((char)((char)((char)(-((char)(var4[var5] + '\ude3f'))) + 26100) >>> 10 | (char)((char)(-((char)(var4[var5] + '\ude3f'))) + 26100) << 6))))) - var5) << 5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      IiiIIIiill = false;
      IIIlIIiill = null;
      this.IiIlIIiill.IliIlllilIi();
      this.IIllllIlll();
   }

   public void lllllillll(double deltaPitch, double deltaYaw) {
      this.IlIlIIiill = this.lIIlIIiill;
      this.llIlIIiill = this.iIIlIIiill;
      this.lIIlIIiill += (float)(deltaPitch * 0.15);
      this.iIIlIIiill = class_3532.method_15363(this.iIIlIIiill + (float)(deltaYaw * 0.15), -90.0F, 90.0F);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + 'ꗟ') + 17026) - var5) - var5) ^ 13724) - var5))) - 23525) << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + 'ꗟ') + 17026) - var5) - var5) ^ 13724) - var5))) - 23525) >>> 11) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + 'ꗟ') + 17026) - var5) - var5) ^ 13724) - var5))) - 23525) << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) + 'ꗟ') + 17026) - var5) - var5) ^ 13724) - var5))) - 23525) >>> 11) >>> 13) + 21639))) - var5) - var5) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void liIlliiIll() {
      this.lIIlIIiill = this.IlIlIIiill = Iiiilllliiilll.field_1724.method_36454();
      this.iIIlIIiill = this.llIlIIiill = Iiiilllliiilll.field_1724.method_36455();
      this.ilIlIIiill = true;
   }

   public static boolean Iillllilll() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      return var0 != null && var0.IliIlllilIi() && IiiIIIiill && var0.lliIIIiill.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~var4[var5]) + 6654) ^ var5) ^ '\uee29') + '\ue5aa') - 12570))) - 12386) ^ 7805))) ^ var5) ^ '\ue73d') ^ 15744) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float liilliiill() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      if (var0 != null && var0.IliIlllilIi() && var0.ilIlIIiill) {
         return var0.iIIlIIiill;
      } else {
         return Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_36455() : 0.0F;
      }
   }

   private class_1657 IlIllllIll() {
      double var1 = this.lilIIIiill.Iilllilliill() / (double)2.0F;
      class_1657 var3 = null;
      double var4 = Double.MAX_VALUE;

      for(class_1657 var7 : iillIiIlIIilIiIl.IliIlllilIi(this.IilIIIiill.Iilllilliill())) {
         class_243 var8 = this.ilIllIiIll(var7);
         double var9 = iillIiIlIIilIiIl.lIiiIiIlilli(var8, this.lIIlIIiill, this.iIIlIIiill);
         if (!(var9 > var1) && (!this.IIiIIIiill.Iilllilliill() || iillIiIlIIilIiIl.iliIiiliiiii(var8)) && var9 < var4) {
            var4 = var9;
            var3 = var7;
         }
      }

      return var3;
   }

   private boolean lIIlliIIll() {
      if (this.lIiIIIiill.Iilllilliill().equals(IliIlllilIi<invokedynamic>())) {
         return true;
      } else {
         return GLFW.glfwGetMouseButton(Iiiilllliiilll.method_22683().method_4490(), 0) == (1274144678 * -1 - 83 ^ -1274144762);
      }
   }

   public boolean iIlllIllll() {
      return this.IliIlllilIi() && this.ilIlIIiill;
   }

   private boolean iiiIlIIIll() {
      if (IIllIIlilIllIIli.IIIilIIiiIIi()) {
         return true;
      } else {
         ilIllIiIll var1 = llilIllililIll.iliIiiliiiii(iIIliIiIlIliIi.class);
         if (var1 instanceof iIIliIiIlIliIi) {
            iIIliIiIlIliIi var2 = (iIIliIiIlIliIi)var1;
            if (var2.liIlliiIll()) {
               return true;
            }
         }

         return false;
      }
   }

   public static boolean iilllIIill() {
      return IiiIIIiill;
   }

   public void iIIIlIlIIl() {
      IiiIIIiill = false;
      IIIlIIiill = null;
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1755 == null) {
         if (!this.ilIlIIiill) {
            this.lIIlIIiill = Iiiilllliiilll.field_1724.method_36454();
            this.iIIlIIiill = Iiiilllliiilll.field_1724.method_36455();
         }

         if (this.iiiIlIIIll()) {
            this.IIllllIlll();
            this.IiIlIIiill.IliIlllilIi();
         } else if (!this.lIIlliIIll()) {
            this.IIllllIlll();
            this.IiIlIIiill.IliIlllilIi();
         } else {
            class_1657 var1 = this.IlIllllIll();
            if (var1 == null) {
               this.IIllllIlll();
               this.IiIlIIiill.IliIlllilIi();
            } else {
               IIIlIIiill = var1;
               class_243 var2 = this.ilIllIiIll(var1);
               float[] var3 = ilIiiIiIii.Ililllililil(Iiiilllliiilll.field_1724.method_33571(), var2);
               if (this.IliIIIiill.Iilllilliill()) {
                  var3 = this.IiIlIIiill.liiiIIllIl(var3[0], var3[1]);
               } else {
                  this.IiIlIIiill.IliIlllilIi();
               }

               liiIIIiill = var3[0];
               iiiIIIiill = var3[1];
               IiiIIIiill = true;
               String var4 = this.iIiIIIiill.Iilllilliill();
               if (var4.equals(IliIlllilIi<invokedynamic>())) {
                  if (!this.ilIlIIiill) {
                     this.liIlliiIll();
                  }

                  ilIiiIiIii.IliIlllilIi(this, liiIIIiill, iiiIIIiill, 50, false);
               } else {
                  this.IIllllIlll();
                  boolean var5 = !var4.equals(IliIlllilIi<invokedynamic>());
                  boolean var6 = var4.equals(IliIlllilIi<invokedynamic>());
                  ilIiiIiIii.liiiIIllIl(this, liiIIIiill, iiiIIIiill, 50, var5, var6);
               }

            }
         }
      } else {
         this.IIllllIlll();
         this.IiIlIIiill.IliIlllilIi();
      }
   }

   public static float lIilliIill() {
      return liiIIIiill;
   }

   public static float ilillIiill() {
      iIiIlillIliIlill var0 = (iIiIlillIliIlill)llilIllililIll.iliIiiliiiii(iIiIlillIliIlill.class);
      if (var0 != null && var0.IliIlllilIi() && var0.ilIlIIiill) {
         return var0.lIIlIIiill;
      } else {
         return Iiiilllliiilll.field_1724 != null ? Iiiilllliiilll.field_1724.method_36454() : 0.0F;
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8507020102978699190L ^ Long.rotateLeft(8403632991323196616L, 14) ^ -1374367745314045903L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7052412162491651689L ^ Long.rotateLeft(-7757921627119045112L, 48) ^ 5653207662924458616L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6413946233567666421L ^ Long.rotateLeft(-9013475694073877767L, 35) ^ 6645751015026827945L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2497438100648824464L ^ Long.rotateLeft(-8846277102648771063L, 18) ^ 2305827718741715388L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4513762808266148399L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3863710475323857640L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8913028421363081991L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5420743888136127788L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4303109583539767854L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8421444685408269022L;
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
}
