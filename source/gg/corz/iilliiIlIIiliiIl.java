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
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1542;
import net.minecraft.class_1802;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2561;
import net.minecraft.class_2680;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_4587;
import org.joml.Matrix4f;

public class iilliiIlIIiliiIl extends ilIllIiIll {
   static final String iIlIilIlll = "Box";
   private final iiIiiilIIliiil lllIilIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int ilIIilIlll = 256;
   static final String lIlIilIlll = "Block";
   private static final double llIIilIlll = (double)64.0F;
   private static final int liIIilIlll = 3;
   private final iilliIlIIiliIl illIilIlll = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 8, 1, 64);
   private ExecutorService IliIilIlll;
   private final iiIiiilIIliiil lilIilIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final AtomicBoolean lIiIilIlll = new AtomicBoolean();
   private volatile int iliIilIlll;
   private int lliIilIlll;
   private final Set<Long> iIiIilIlll = new HashSet();
   private final lliliIIiililiIIi IllIilIlll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   static final String IIlIilIlll = "Block + Box";
   private static final int IiIIilIlll = 512;
   private static final int iiIIilIlll = 8192;
   private volatile List<lliiIliiliiIli> iilIilIlll = List.of();
   private final iiIiiilIIliiil IilIilIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private volatile List<class_2338> IIiIilIlll = List.of();

   private void iIlllIllll() {
      List var1 = this.iilIilIlll;
      if (!var1.isEmpty()) {
         int var2 = 0;

         for(lliiIliiliiIli var4 : var1) {
            long var5 = class_2338.method_10064((int)var4.IliIlllilIi(), (int)var4.liiiIIllIl(), (int)var4.iIlIlllllill());
            if (this.iIiIilIlll.add(var5) && var2 < 3 && Iiiilllliiilll.field_1724 != null) {
               String var7 = var4.IIIllIIliIIl() ? (int)var4.IliIlllilIi() + IliIlllilIi<invokedynamic>() + (int)var4.liiiIIllIl() + IliIlllilIi<invokedynamic>() + (int)var4.iIlIlllllill() : IliIlllilIi<invokedynamic>() + (int)((var4.IliIlllilIi() + var4.IilliliilIIi()) / (double)2.0F) + IliIlllilIi<invokedynamic>() + (int)((var4.liiiIIllIl() + var4.lIiiIiIlilli()) / (double)2.0F) + IliIlllilIi<invokedynamic>() + (int)((var4.iIlIlllllill() + var4.iliIiiliiiii()) / (double)2.0F);
               Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470(IliIlllilIi<invokedynamic>() + var7), false);
               ++var2;
            }
         }

         if (this.iIiIilIlll.size() > 8192) {
            this.iIiIilIlll.clear();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] ^ 13903))))) - '肓') ^ var5))) ^ var5) - var5) + 'ꎿ') + var5) >>> 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] ^ 13903))))) - '肓') ^ var5))) ^ var5) - var5) + 'ꎿ') + var5) << 8) ^ '鱿') ^ '튫') + 28449))) >>> 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] ^ 13903))))) - '肓') ^ var5))) ^ var5) - var5) + 'ꎿ') + var5) >>> 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)(var4[var5] ^ 13903))))) - '肓') ^ var5))) ^ var5) - var5) + 'ꎿ') + var5) << 8) ^ '鱿') ^ '튫') + 28449))) << 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         String var2 = this.IllIilIlll.Iilllilliill();
         boolean var3 = iilllIIill(var2);
         class_243 var4 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         double var5 = Iiiilllliiilll.field_1724.method_23317();
         double var7 = Iiiilllliiilll.field_1724.method_23318();
         double var9 = Iiiilllliiilll.field_1724.method_23321();
         class_4587 var11 = event.IliiiIIilliiiIIi;
         var11.method_22903();
         var11.method_22904(-var4.field_1352, -var4.field_1351, -var4.field_1350);
         Matrix4f var12 = var11.method_23760().method_23761();
         int var13 = lIilliIill(255, 60, 255, 90);
         int var14 = lIilliIill(235, 80, 220, 255);
         int var15 = lIilliIill(150, 60, 150, 200);
         int var16 = lIilliIill(200, 255, 60, 220);
         boolean var17 = this.IilIilIlll.Iilllilliill();

         for(lliiIliiliiIli var19 : this.iilIilIlll) {
            double var20 = (var19.IliIlllilIi() + var19.IilliliilIIi()) / (double)2.0F;
            double var22 = (var19.liiiIIllIl() + var19.lIiiIiIlilli()) / (double)2.0F;
            double var24 = (var19.iIlIlllllill() + var19.iliIiiliiiii()) / (double)2.0F;
            double var26 = var20 - var5;
            double var28 = var22 - var7;
            double var30 = var24 - var9;
            boolean var32 = var26 * var26 + var28 * var28 + var30 * var30 <= (double)4096.0F;
            if (!var19.IIIllIIliIIl() || var3) {
               int var33;
               float var34;
               float var35;
               if (var19.IIIllIIliIIl()) {
                  var33 = var13;
                  var34 = 3.0F;
                  var35 = 0.01F;
               } else {
                  var33 = var32 ? var14 : var15;
                  var34 = var32 ? 2.0F : 1.2F;
                  var35 = -0.4F;
               }

               iIiiIIilIliiIIil.iIIIlIlIIl(var12, (float)var19.IliIlllilIi() - var35, (float)var19.liiiIIllIl() - var35, (float)var19.iIlIlllllill() - var35, (float)var19.IilliliilIIi() + var35, (float)var19.lIiiIiIlilli() + var35, (float)var19.iliIiiliiiii() + var35, var33, var34);
            }

            if (var17) {
               Iillllilll.IIlllIlliIll(var20, var22, var24, var16, 1.2F);
            }
         }

         for(class_1297 var37 : Iiiilllliiilll.field_1687.method_18112()) {
            if (var37 instanceof class_1542) {
               class_1542 var38 = (class_1542)var37;
               if (var38.method_6983().method_31574(class_1802.field_22019)) {
                  class_238 var21 = var38.method_5829();
                  iIiiIIilIliiIIil.iIIIlIlIIl(var12, (float)var21.field_1323, (float)var21.field_1322, (float)var21.field_1321, (float)var21.field_1320, (float)var21.field_1325, (float)var21.field_1324, var13, 3.0F);
                  if (var17) {
                     Iillllilll.IIlllIlliIll(var38.method_23317(), var38.method_23318(), var38.method_23321(), var16, 1.2F);
                  }
               }
            }
         }

         var11.method_22909();
         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   protected void Iilililiiili() {
      if (this.IliIilIlll != null) {
         this.IliIilIlll.shutdownNow();
      }

      this.IliIilIlll = null;
      this.iilIilIlll = List.of();
      this.IIiIilIlll = List.of();
      this.iIiIilIlll.clear();
   }

   private static List<lliiIliiliiIli> IIllllIlll(List<class_2338> positions) {
      boolean[] var1 = new boolean[positions.size()];
      ArrayList var2 = new ArrayList();

      for(int var3 = 0; var3 < positions.size(); ++var3) {
         if (!var1[var3]) {
            int var4 = Integer.MAX_VALUE;
            int var5 = Integer.MAX_VALUE;
            int var6 = Integer.MAX_VALUE;
            int var7 = Integer.MIN_VALUE;
            int var8 = Integer.MIN_VALUE;
            int var9 = Integer.MIN_VALUE;
            ArrayDeque var10 = new ArrayDeque();
            var10.add(var3);
            var1[var3] = true;

            while(!var10.isEmpty()) {
               int var11 = (Integer)var10.poll();
               class_2338 var12 = (class_2338)positions.get(var11);
               var4 = Math.min(var4, var12.method_10263());
               var5 = Math.min(var5, var12.method_10264());
               var6 = Math.min(var6, var12.method_10260());
               var7 = Math.max(var7, var12.method_10263() + 1);
               var8 = Math.max(var8, var12.method_10264() + 1);
               var9 = Math.max(var9, var12.method_10260() + 1);

               for(int var13 = 0; var13 < positions.size(); ++var13) {
                  if (!var1[var13]) {
                     class_2338 var14 = (class_2338)positions.get(var13);
                     int var15 = Math.max(Math.abs(var12.method_10263() - var14.method_10263()), Math.max(Math.abs(var12.method_10264() - var14.method_10264()), Math.abs(var12.method_10260() - var14.method_10260())));
                     if (var15 <= 2) {
                        var1[var13] = true;
                        var10.add(var13);
                     }
                  }
               }
            }

            var2.add(new lliiIliiliiIli((double)var4, (double)var5, (double)var6, (double)var7, (double)var8, (double)var9, true));
         }
      }

      return var2;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 5957) ^ var5) - '꒰'))) + var5) + var5) + 19288) ^ var5))) - '舉') ^ var5) + var5) - '馨') << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 5957) ^ var5) - '꒰'))) + var5) + var5) + 19288) ^ var5))) - '舉') ^ var5) + var5) - '馨') >>> 11))) + var5) - '讑') >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 5957) ^ var5) - '꒰'))) + var5) + var5) + 19288) ^ var5))) - '舉') ^ var5) + var5) - '馨') << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 5957) ^ var5) - '꒰'))) + var5) + var5) + 19288) ^ var5))) - '舉') ^ var5) + var5) - '馨') >>> 11))) + var5) - '讑') << 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) << 6) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) << 6) << 15))))) << 11 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) << 6) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') >>> 4 | (char)((char)((char)(~((char)(-((char)((char)(var4[var5] - 2916) + var5))))) ^ 12453) - '膃') << 12) + 7316) ^ var5) - '芿') ^ var5) << 6) << 15))))) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean Iillllilll(String mode) {
      return !IliIlllilIi<invokedynamic>().equals(mode);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var1 = System.identityHashCode(Iiiilllliiilll.field_1687);
         if (var1 != this.iliIilIlll) {
            this.iliIilIlll = var1;
            this.iilIilIlll = List.of();
            this.IIiIilIlll = List.of();
         }

         if (this.lilIilIlll.Iilllilliill()) {
            this.iIlllIllll();
         } else if (!this.iIiIilIlll.isEmpty()) {
            this.iIiIilIlll.clear();
         }

         if (++this.lliIilIlll >= 20) {
            this.lliIilIlll = 0;
            ExecutorService var2 = this.IliIilIlll;
            if (var2 != null && !var2.isShutdown()) {
               if (this.lIiIilIlll.compareAndSet(false, true)) {
                  double var3 = Iiiilllliiilll.field_1724.method_23317();
                  double var5 = Iiiilllliiilll.field_1724.method_23318();
                  double var7 = Iiiilllliiilll.field_1724.method_23321();
                  ArrayList var9 = new ArrayList();
                  int var10 = (Integer)Iiiilllliiilll.field_1690.method_42503().method_41753();
                  class_1923 var11 = Iiiilllliiilll.field_1724.method_31476();

                  for(int var12 = var11.field_9181 - var10; var12 <= var11.field_9181 + var10; ++var12) {
                     for(int var13 = var11.field_9180 - var10; var13 <= var11.field_9180 + var10; ++var13) {
                        if (Iiiilllliiilll.field_1687.method_8393(var12, var13)) {
                           var9.add(Iiiilllliiilll.field_1687.method_8497(var12, var13));
                        }
                     }
                  }

                  boolean var14 = this.lllIilIlll.Iilllilliill();
                  int var15 = this.illIilIlll.Iilllilliill();
                  var2.submit(() -> {
                     try {
                        iiiIlillIIIllill var11 = iiiIlIIIll(var9, var14, var15, var3, var5, var7);
                        if (var1 == this.iliIilIlll) {
                           this.iilIilIlll = var11.IliIlllilIi();
                           this.IIiIilIlll = var11.liiiIIllIl();
                        }
                     } catch (Throwable var15x) {
                     } finally {
                        this.lIiIilIlll.set(false);
                     }

                  });
               }
            }
         }
      }
   }

   protected void Illillliilli() {
      this.iilIilIlll = List.of();
      this.IIiIilIlll = List.of();
      this.lliIilIlll = 0;
      this.lIiIilIlll.set(false);
      this.iIiIilIlll.clear();
      this.IliIilIlll = Executors.newSingleThreadExecutor((task) -> {
         Thread var1 = new Thread(task, IliIlllilIi<invokedynamic>());
         var1.setDaemon(true);
         return var1;
      });
   }

   private static iiiIlillIIIllill iiiIlIIIll(List<class_2818> chunks, boolean ghostCap, int playerX, double exposedOnly, double playerZ, double playerY) {
      HashMap var9 = new HashMap();

      for(class_2818 var11 : chunks) {
         var9.put(var11.method_12004().method_8324(), var11);
      }

      ArrayList var24 = new ArrayList();
      ArrayList var25 = new ArrayList();
      ArrayList var12 = new ArrayList();
      int var13 = 0;
      int var14 = 0;

      for(class_2818 var16 : chunks) {
         class_2826[] var17 = var16.method_12006();
         int var18 = var16.method_32891();
         class_1923 var19 = var16.method_12004();

         for(int var20 = 0; var20 < var17.length; ++var20) {
            class_2826 var21 = var17[var20];
            if (var21 != null && !var21.method_38292() && var21.method_19523((state) -> state.method_27852(class_2246.field_22109))) {
               int var22 = var18 + var20 << 4;
               List var23 = IlIllllIll(var21, var19.method_8326(), var22, var19.method_8328());
               var13 += var23.size();
               if (var23.isEmpty()) {
                  var25.add(new lliiIliiliiIli((double)var19.method_8326(), (double)var22, (double)var19.method_8328(), (double)(var19.method_8326() + 16), (double)(var22 + 16), (double)(var19.method_8328() + 16), false));
               } else {
                  if (ghostCap) {
                     var23.removeIf((pos) -> !ilIllIiIll(var9, pos.method_10263(), pos.method_10264(), pos.method_10260()));
                  }

                  var14 += var23.size();
                  if (!var23.isEmpty()) {
                     var12.addAll(var23);
                     var24.addAll(IIllllIlll(var23));
                  }
               }
            }
         }
      }

      Comparator var26 = Comparator.comparingDouble((playerXx) -> lIIlliIIll((playerXx.IliIlllilIi() + playerXx.IilliliilIIi()) / (double)2.0F, (playerXx.liiiIIllIl() + playerXx.lIiiIiIlilli()) / (double)2.0F, (playerXx.iIlIlllllill() + playerXx.iliIiiliiiii()) / (double)2.0F, exposedOnly, playerZ, playerY));
      var24.sort(var26);
      var25.sort(var26);
      var12.sort(Comparator.comparingDouble((playerYx) -> lIIlliIIll((double)playerYx.method_10263() + (double)0.5F, (double)playerYx.method_10264() + (double)0.5F, (double)playerYx.method_10260() + (double)0.5F, exposedOnly, playerZ, playerY)));
      ArrayList var27 = new ArrayList();
      var27.addAll(var24.subList(0, Math.min(256, var24.size())));
      var27.addAll(var25.subList(0, Math.min(Math.max(0, playerX), var25.size())));
      List var28 = List.copyOf(var12.subList(0, Math.min(512, var12.size())));
      return new iiiIlillIIIllill(List.copyOf(var27), var28, var13, var14, var25.size());
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) << 13 | (char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) >>> 3) - var5))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) << 13 | (char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) >>> 3) - var5))) >>> 8) ^ 10542))) >>> 12 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) << 13 | (char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) >>> 3) - var5))) << 8 | (char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) << 13 | (char)((char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) >>> 1 | (char)((char)((char)(~((char)(-((char)(~((char)((char)(var4[var5] - 16817) - var5))))))) + var5) - 6369) << 15) >>> 3) - var5))) >>> 8) ^ 10542))) << 4) - 31712));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static List<class_2338> IlIllllIll(class_2826 originZ, int originY, int section, int originX) {
      ArrayList var4 = new ArrayList();

      for(int var5 = 0; var5 < 16; ++var5) {
         for(int var6 = 0; var6 < 16; ++var6) {
            for(int var7 = 0; var7 < 16; ++var7) {
               if (originZ.method_12254(var7, var5, var6).method_27852(class_2246.field_22109)) {
                  var4.add(new class_2338(originY + var7, section + var5, originX + var6));
               }
            }
         }
      }

      return var4;
   }

   static boolean iilllIIill(String mode) {
      return !IliIlllilIi<invokedynamic>().equals(mode);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] ^ 28217) + 3840))))) ^ var5))) >>> 4 | (char)(~((char)((char)(~((char)(-((char)((char)(var4[var5] ^ 28217) + 3840))))) ^ var5))) << 12) ^ 15794))) + var5) ^ var5) + var5) - 'ꛣ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static boolean ilIllIiIll(Map<Long, class_2818> x, int z, int byPos, int y) {
      return liIlliiIll(x, z + 1, byPos, y) || liIlliiIll(x, z - 1, byPos, y) || liIlliiIll(x, z, byPos + 1, y) || liIlliiIll(x, z, byPos - 1, y) || liIlliiIll(x, z, byPos, y + 1) || liIlliiIll(x, z, byPos, y - 1);
   }

   public int lllllillll() {
      return this.iilIilIlll.size();
   }

   private static boolean liIlliiIll(Map<Long, class_2818> z, int y, int byPos, int x) {
      class_2818 var4 = (class_2818)z.get(class_1923.method_8331(y >> 4, x >> 4));
      if (var4 == null) {
         return false;
      } else {
         class_2680 var5 = var4.method_8320(new class_2338(y, byPos, x));
         return var5.method_26215() || var5.method_27852(class_2246.field_10164);
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8778050572417767718L ^ Long.rotateLeft(9085253114546562845L, 8) ^ 8965202711127317941L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5091813657316691039L ^ Long.rotateLeft(157826802384045507L, 16) ^ -7404586649803407553L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6967452368166327180L ^ Long.rotateLeft(8519883358554328563L, 25) ^ 8373033740340196390L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1155814145837754989L ^ Long.rotateLeft(3641196048625875001L, 9) ^ -5326414971120808810L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8187089152583863123L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1759928278896973769L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8685755667234452860L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2490806168982485911L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6934543222297100659L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9083466633488683699L;
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

   private static int lIilliIill(int r, int g, int b, int a) {
      return (r & ((~(-240665592 * -69) ^ 63) - -121 ^ 573943406)) << (-(1111476077 << 19 | 1111476077 >>> 13) ^ -996807142) | (g & (((-967948486 << 11 | -967948486 >>> 21) << 11 | (-967948486 << 11 | -967948486 >>> 21) >>> 21) - -75 ^ -827223261)) << (((-631179845 * -991146299 << 3 | -631179845 * -991146299 >>> 29) >>> 31 | (-631179845 * -991146299 << 3 | -631179845 * -991146299 >>> 29) << 1) ^ -1107218844) | (b & (((-1537765068 ^ 49 ^ 127) << 21 | (-1537765068 ^ 49 ^ 127) >>> 11) ^ 794069517)) << (((2033799852 >>> 1 | 2033799852 << 31) ^ 23) * 1205604855 ^ 1564516031) | a & (-220476746 * -71 ^ -1526020231);
   }

   public iilliiIlIIiliiIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IllIilIlll, this.lllIilIlll, this.illIilIlll, this.IilIilIlll, this.lilIilIlll});
   }

   private static double lIIlliIIll(double px, double y, double pz, double x, double z, double py) {
      double var12 = px - x;
      double var14 = y - z;
      double var16 = pz - py;
      return var12 * var12 + var14 * var14 + var16 * var16;
   }
}
