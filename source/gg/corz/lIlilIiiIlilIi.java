package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1297;
import net.minecraft.class_1299;
import net.minecraft.class_1937;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2596;
import net.minecraft.class_2604;
import net.minecraft.class_2616;
import net.minecraft.class_2620;
import net.minecraft.class_2626;
import net.minecraft.class_2637;
import net.minecraft.class_2663;
import net.minecraft.class_2664;
import net.minecraft.class_2680;
import net.minecraft.class_2716;
import net.minecraft.class_2761;
import net.minecraft.class_6880;
import net.minecraft.class_8038;
import net.minecraft.class_8110;
import net.minecraft.class_8143;

public final class lIlilIiiIlilIi {
   private static final byte IiiliiIiiliiliiIii = 35;
   public static final String lliliiIiiililiiIii = "?";
   public static final int iIiliiIiiIliliiIii = 2048;
   private final AtomicInteger lIIiiiIiiiIIiiiIii = new AtomicInteger();
   private final ConcurrentLinkedQueue<Object> iiiliiIiiIIIiiiIii = new ConcurrentLinkedQueue();

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) >>> 9 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) << 7) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) >>> 9 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) << 7) << 14) << 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) >>> 9 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) << 7) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) >>> 9 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') >>> 13 | (char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) << 1 | (char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) << 8 | (char)(-((char)((char)(var4[var5] ^ 28406) + 11838))) >>> 8))) + 815) >>> 15) - '쟦') << 3) << 7) << 14) >>> 14))))) + var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIlllIlilIl(Object item) {
      if (this.lIIiiiIiiiIIiiiIii.incrementAndGet() > 2048) {
         this.lIIiiiIiiiIIiiiIii.decrementAndGet();
      } else {
         this.iiiliiIiiIIIiiiIii.add(item);
      }
   }

   public void iIlIlllllill() {
      while(this.iiiliiIiiIIIiiiIii.poll() != null) {
         this.lIIiiiIiiiIIiiiIii.decrementAndGet();
      }

   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - 814) + '괄'))) + 10650) + 10900) + var5) ^ var5) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - 814) + '괄'))) + 10650) + 10900) + var5) ^ var5) >>> 4) - '캂') >>> 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - 814) + '괄'))) + 10650) + 10900) + var5) ^ var5) << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) - 814) + '괄'))) + 10650) + 10900) + var5) ^ var5) >>> 4) - '캂') << 15))) + 20399) ^ var5) ^ 10235));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) - '\udc7d') + var5))) - var5) ^ var5))) + var5) - var5) << 6 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] + var5) - '\udc7d') + var5))) - var5) ^ var5))) + var5) - var5) >>> 10) - var5) + 13576));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static boolean iliIiiliiiii(class_2680 state) {
      if (state == null) {
         return false;
      } else {
         return state.method_26215() || state.method_27852(class_2246.field_23152) || state.method_27852(class_2246.field_10171) || state.method_27852(class_2246.field_10540) || state.method_27852(class_2246.field_22423);
      }
   }

   private void IilliliilIIi(class_2596<?> packet) {
      if (packet != null) {
         if (packet instanceof class_2663) {
            class_2663 var2 = (class_2663)packet;
            if (var2.method_11470() == 35) {
               this.IlIlllIlilIl(var2);
            }
         } else if (packet instanceof class_8143) {
            class_8143 var3 = (class_8143)packet;
            this.IlIlllIlilIl(new IIlilIIllIlilIIl(var3.comp_1267(), var3.comp_1269(), var3.comp_1270(), (class_243)var3.comp_1271().orElse((Object)null), IiIlliIliiIl(var3.comp_1268())));
         } else if (packet instanceof class_2604) {
            class_2604 var4 = (class_2604)packet;
            class_1299 var11 = var4.method_11169();
            if (var11 == class_1299.field_6110 || var11 == class_1299.field_6082) {
               this.IlIlllIlilIl(new iIIIiilIlIIiil(var4.method_11167(), var11, var4.method_11175(), var4.method_11174(), var4.method_11176(), var4.method_11166()));
            }
         } else if (packet instanceof class_2716) {
            class_2716 var5 = (class_2716)packet;
            this.IlIlllIlilIl(new liIIlliiiIIlli(var5.method_36548().toIntArray()));
         } else if (packet instanceof class_2664) {
            class_2664 var6 = (class_2664)packet;
            this.IlIlllIlilIl(new iIIlIlilIlIlIlil(var6.comp_2883(), var6.comp_4594()));
         } else if (packet instanceof class_2616) {
            class_2616 var7 = (class_2616)packet;
            if (var7.method_11267() == 0) {
               this.IlIlllIlilIl(new ilIiIiIiIiIiIiIi(var7.method_11269()));
            }
         } else if (packet instanceof class_2761) {
            this.IlIlllIlilIl(new IiIiliIiiiIi(IIIiillllIIiilll.IliIlllilIi()));
         } else if (packet instanceof class_2626) {
            class_2626 var8 = (class_2626)packet;
            this.lIiiIiIlilli(var8.method_11309(), var8.method_11308());
         } else if (packet instanceof class_2637) {
            class_2637 var9 = (class_2637)packet;
            var9.method_30621(this::lIiiIiIlilli);
         } else if (packet instanceof class_2620) {
            class_2620 var10 = (class_2620)packet;
            if (var10.method_11277() != null) {
               this.IlIlllIlilIl(new iIIlllllIlIlllll(var10.method_11280(), var10.method_11277().method_10062(), var10.method_11278()));
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 14 | (char)((char)(var4[var5] - var5) ^ var5) << 2) - var5) ^ var5) - var5))) + 30186) + '銜') ^ '\udea2') >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 14 | (char)((char)(var4[var5] - var5) ^ var5) << 2) - var5) ^ var5) - var5))) + 30186) + '銜') ^ '\udea2') << 2) ^ var5) - 4151) << 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 14 | (char)((char)(var4[var5] - var5) ^ var5) << 2) - var5) ^ var5) - var5))) + 30186) + '銜') ^ '\udea2') >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 14 | (char)((char)(var4[var5] - var5) ^ var5) << 2) - var5) ^ var5) - var5))) + 30186) + '銜') ^ '\udea2') << 2) ^ var5) - 4151) >>> 6) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int liiiIIllIl(class_1937 world, Consumer<IlIillIiilIi> sink, int max) {
      long var7 = 8198979175148206724L;
      if (sink == null) {
         return 0;
      } else {
         var7 ^= (0L ^ var7) & -1L << 32;

         while((int)(var7 >>> 32) < max) {
            Object var5 = this.iiiliiIiiIIIiiiIii.poll();
            if (var5 == null) {
               break;
            }

            this.lIIiiiIiiiIIiiiIii.decrementAndGet();
            IlIillIiilIi var6 = IIlllIlliIll(world, var5);
            if (var6 != null) {
               sink.accept(var6);
               var7 += 4294967296L;
            }
         }

         return (int)(var7 >>> 32);
      }
   }

   static String IiIlliIliiIl(class_6880<class_8110> type) {
      return type == null ? Iilllilliill<invokedynamic>() : (String)type.method_40230().map((k) -> k.method_29177().method_12832()).orElse(Iilllilliill<invokedynamic>());
   }

   public static boolean IIIllIIliIIl(int stage) {
      return stage < 0 || stage > 9;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) << 14 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) >>> 2) ^ var5) - 10478) << 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) << 14 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) >>> 2) ^ var5) - 10478) >>> 11) >>> 9 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) << 14 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) >>> 2) ^ var5) - 10478) << 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) << 14 | (char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) ^ var5) + 4404) + '쀇'))) >>> 2) ^ var5) - 10478) >>> 11) << 7) + var5) + '턠'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(class_2596<?> packet) {
      if (!(packet instanceof class_8038 var2)) {
         this.IilliliilIIi(packet);
      } else {
         for(class_2596 var4 : var2.method_48324()) {
            this.IilliliilIIi(var4);
         }

      }
   }

   private void lIiiIiIlilli(class_2338 state, class_2680 pos) {
      if (state != null && iliIiiliiiii(pos)) {
         this.IlIlllIlilIl(new IllIliIilllIliIi(state.method_10062(), pos));
      }
   }

   private static IlIillIiilIi IIlllIlliIll(class_1937 raw, Object world) {
      if (world instanceof IlIillIiilIi var4) {
         return var4;
      } else if (world instanceof class_2663 var2) {
         if (raw == null) {
            return null;
         } else {
            class_1297 var3 = var2.method_11469(raw);
            return var3 == null ? null : new llIiIIliilIiIIli(var3.method_5628());
         }
      } else {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7847508113335068631L ^ Long.rotateLeft(-4349223760762563646L, 62) ^ -3826307635995056808L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5432982365815921472L ^ Long.rotateLeft(2467194668614222782L, 55) ^ 4458339790006817124L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1279134055672557430L ^ Long.rotateLeft(-8751346494115669582L, 31) ^ -3221493249442761527L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3547865783405890404L ^ Long.rotateLeft(451923898269685214L, 42) ^ -1608303826524401892L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8053627221380128031L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3083150947743101268L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1373126315638398686L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1669121485429333154L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2262121851906571784L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4872655472562405141L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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
