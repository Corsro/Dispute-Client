package gg.corz;

import com.corz.client.mixins.AccessorKeyBinding;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_2596;
import net.minecraft.class_2824;
import net.minecraft.class_304;
import net.minecraft.class_3675;
import net.minecraft.class_746;
import net.minecraft.class_3675.class_307;
import org.lwjgl.glfw.GLFW;

public class IiiliIIiliiliIIi extends ilIllIiIll {
   private long iilliliiil;
   private final lIillliliIilllil Iilliliiil = new lIillliliIilllil();
   private final iiIiiilIIliiil illliliiil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final lilllliiilllli lIlliliiil;
   private final Iiiliillliiliill lllliliiil = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)50.0F, (double)100.0F, (double)0.0F, (double)400.0F, (double)10.0F);
   private class_746 lilliliiil;
   private final iilliIlIIiliIl Illliliiil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 500, 50);
   private final iilliIlIIiliIl iIlliliiil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 90, 0, 100);

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') >>> 7 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') << 9) + 29809) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') >>> 7 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') << 9) + 29809) << 4))))) ^ var5) << 15 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') >>> 7 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') << 9) + 29809) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') >>> 7 | (char)((char)((char)((char)((char)((char)(-var4[var5]) + 25403) + var5) + var5) ^ var5) + '邅') << 9) + 29809) << 4))))) ^ var5) >>> 1))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean lIIlliIIll(class_304 binding) {
      if (Iiiilllliiilll.method_22683() != null && Iiiilllliiilll.method_1569()) {
         class_3675.class_306 var1 = ((AccessorKeyBinding)binding).getBoundKey();
         long var2 = Iiiilllliiilll.method_22683().method_4490();
         if (var1.method_1442() != class_307.field_1668) {
            if (var1.method_1442() == class_307.field_1672) {
               return GLFW.glfwGetMouseButton(var2, var1.method_1444()) == (-((805158101 ^ -49) * -1736263375 << 5 | (805158101 ^ -49) * -1736263375 >>> 27) ^ 1005306019);
            } else {
               return false;
            }
         } else {
            return var1.method_1444() != class_3675.field_16237.method_1444() && GLFW.glfwGetKey(var2, var1.method_1444()) == (((1643866751 ^ 73) + -45) * -252645135 ^ -913882504);
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) << 11) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) << 11) << 4) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) << 11) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) << 14 | (char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) >>> 11 | (char)((char)((char)(var4[var5] + '鲑') - 4254) ^ 8226) << 5) + '隍') ^ '힆') - var5))))))) >>> 2) + 4515) + var5) - 9414) ^ var5) << 14) << 11) << 4) << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void llIIlilIIl(IiIiIlIiliIiIlIi event) {
      class_2596 var3 = event.lIiilIIIIi;
      if (var3 instanceof class_2824 var2) {
         class_746 var11 = Iiiilllliiilll.field_1724;
         if (var11 != null && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1690 != null && Iiiilllliiilll.method_18854()) {
            if (Iiiilllliiilll.field_1755 == null && IIIliiIilIIliiIi.IliIlllilIi(var2)) {
               int var4 = IIIliiIilIIliiIi.liiiIIllIl(var2);
               if (!event.lIiiIiIlilli() && this.Iilliliiil.lIiiIiIlilli(var4, this.iilliliiil)) {
                  this.lilliliiil = var11;
               } else if (this.Iilliliiil.IliIlllilIi()) {
                  class_1297 var5 = Iiiilllliiilll.field_1687.method_8469(var4);
                  if (liiIIIlliiiIIIll.IliIlllilIi(var5, lIlliliiil)) {
                     if (illllIlIilllIl.IIlllIlliIll(var11.method_5624(), var11.method_7261(0.5F))) {
                        if (Iiiilllliiilll.field_1690.field_1894.method_1434() && lIIlliIIll(Iiiilllliiilll.field_1690.field_1894)) {
                           if (!this.illliliiil.Iilllilliill() || illllIlIilllIl.Illlllllilll(illIllilIilIllil.Ililllililil((class_1309)var5), illIllilIilIllil.IlIlllIlilIl())) {
                              ThreadLocalRandom var6 = ThreadLocalRandom.current();
                              if (illllIlIilllIl.IliIlllilIi((double)this.iIlliliiil.Iilllilliill(), var6.nextDouble())) {
                                 double var7 = illllIlIilllIl.liiiIIllIl(this.lllliliiil.Iilllilliill(), this.lllliliiil.Ililllililil(), var6.nextDouble());
                                 int var9 = illllIlIilllIl.iIlIlllllill((double)this.Illliliiil.Iilllilliill());
                                 int var10 = illllIlIilllIl.iIlIlllllill(var7);
                                 if (event.lIiiIiIlilli()) {
                                    this.Iilliliiil.IilliliilIIi(var4, this.iilliliiil, var9, var10);
                                 } else {
                                    if (this.Iilliliiil.iIlIlllllill(this.iilliliiil, var9, var10)) {
                                       this.lilliliiil = var11;
                                    }

                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   protected void Iilililiiili() {
      this.iiiIlIIIll();
      this.Iilliliiil.IIIllIIliIIl();
      this.lilliliiil = null;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) >>> 13) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) >>> 13) << 15) ^ var5) + 31929) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) >>> 13) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) << 10 | (char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 5 | (char)((char)(-var4[var5]) - var5) >>> 11) - var5) ^ 24796) << 4) >>> 6) << 4) ^ var5) - 7651) ^ var5) >>> 13) << 15) ^ var5) + 31929) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      ++this.iilliliiil;
      if (!this.Iilliliiil.IliIlllilIi()) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1724 == this.lilliliiil && Iiiilllliiilll.field_1690 != null) {
            if (Iiiilllliiilll.field_1755 != null) {
               this.Iilliliiil.IIIllIIliIIl();
            } else {
               class_304 var1 = Iiiilllliiilll.field_1690.field_1894;
               switch (this.Iilliliiil.iliIiiliiiii(this.iilliliiil, lIIlliIIll(var1))) {
                  case lIilillIIi:
                  case iIilillIIi:
                     illIilIilIil.IliIlllilIi(var1, false);
                     break;
                  case IlilillIIi:
                     illIilIilIil.IliIlllilIi(var1, lIIlliIIll(var1));
               }

            }
         } else {
            this.iiiIlIIIll();
            this.Iilliliiil.IIIllIIliIIl();
         }
      }
   }

   protected void Illillliilli() {
      this.Iilliliiil.IIIllIIliIIl();
      this.lilliliiil = null;
   }

   private void iiiIlIIIll() {
      if (this.Iilliliiil.liiiIIllIl() && Iiiilllliiilll.field_1690 != null) {
         illIilIilIil.IliIlllilIi(Iiiilllliiilll.field_1690.field_1894, Iiiilllliiilll.field_1755 == null && lIIlliIIll(Iiiilllliiilll.field_1690.field_1894));
      }
   }

   static {
      lIlliliiil = lilllliiilllli.iiIiIiIIIl.IilliliilIIi(true).iliIiiliiiii(true);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 12275) - 29754) ^ 5992) ^ var5) + '\uf4bc'))) ^ 32713) - 17974) - 23191))))) >>> 15 | (char)(-((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 12275) - 29754) ^ 5992) ^ var5) + '\uf4bc'))) ^ 32713) - 17974) - 23191))))) << 1))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8086954720087814441L ^ Long.rotateLeft(2684727120013884222L, 44) ^ 3335633523580526133L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3988392642086506329L ^ Long.rotateLeft(-7982940944055017857L, 25) ^ 22341258547882185L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3709846426058244933L ^ Long.rotateLeft(-2402186296299082137L, 29) ^ -5607860619988321745L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7519686258397257736L ^ Long.rotateLeft(-7091656264887138933L, 10) ^ -1276218322005947302L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4670502122094956772L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1807748473040434198L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6618459890316470235L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8217976515700555378L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8360983553485961203L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3401983483137108228L;
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 19157) ^ var5) - var5))) + 15262) ^ '餈') ^ 534) - 13965) + '뾬') >>> 14 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 19157) ^ var5) - var5))) + 15262) ^ '餈') ^ 534) - 13965) + '뾬') << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IiiliIIiliiliIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIlliliiil, this.Illliliiil, this.lllliliiil, this.illliliiil});
   }
}
