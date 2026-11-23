package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.minecraft.class_1299;
import net.minecraft.class_1923;
import net.minecraft.class_2246;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2806;
import net.minecraft.class_2818;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_638;
import net.minecraft.class_642;
import org.joml.Matrix4f;

public class IIiIlilllIiIlill extends ilIllIiIll {
   private int iiiiiilill = -1;
   private final iiIiiilIIliiil ililiilill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IIlIIIiill = 48;
   private final iiIiiilIIliiil Iiiliilill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final int IiIIIIiill = 16;
   private final int[] illIIIiill = new int[4];
   private int liiiiilill;
   private final IIIiIiIllIIiIiIl liliiilill = new IIIiIiIllIIiIiIl();
   private final iliiliilIiiiliil llliiilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -4819969);
   private final IIIIlilllIIIlill liIiiilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.45, 0.1, (double)1.0F, 0.05);
   private final iliiliilIiiiliil IIliiilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -1644826);
   private final iiIiiilIIliiil lliliilill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iIiliilill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iilliIlIIiliIl lIIiiilill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 320, -64, 320);
   private final iilliIlIIiliIl IlIiiilill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 256, 16, 1024);
   private final iilliIlIIiliIl iiiliilill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 12, 2, 32);
   private final iiIiiilIIliiil liiliilill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final int iiIIIIiill = 64;
   private final String[] iIlIIIiill = new String[4];
   private final llliiillii lIiiiilill = new llliiillii();
   private volatile List<lliliillililiill> IIIIIIiill = List.of();
   private final iilliIlIIiliIl iIIiiilill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 16, 1, 64);
   private final iliiliilIiiiliil Illiiilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -22746);
   private static final int liIIIIiill = 100;
   private final IIIIlilllIIIlill IiIiiilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)24.0F, (double)4.0F, (double)128.0F, (double)1.0F);
   private final iiIiiilIIliiil IIiliilill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final Map<Long, Integer> iIiiiilill = new HashMap();
   private final iilliIlIIiliIl llIiiilill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 60, 1, 255);
   private final ililliIiIiilliIi Iiliiilill = (new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::iiiIlIIIll)).Ililllililil();
   private final IIillIillIillIil iiliiilill = new IIillIillIillIil();
   private static final long lIlIIIiill = 30000L;
   private static final int IlIIIIiill = 100;
   private int Iiiiiilill = Integer.MIN_VALUE;
   public static volatile IIiIlilllIiIlill iilliilill;
   private int iliiiilill = Integer.MIN_VALUE;
   private static final int ilIIIIiill = 32;
   private final Map<String, String> Iliiiilill = new HashMap();
   private final iliiliilIiiiliil iiIiiilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -11218092);
   private final iliiliilIiiiliil lIliiilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -4169668);
   private final iiIiiilIIliiil Ililiilill = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final IIIIlilllIIIlill ilIiiilill = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)2.0F, (double)1.0F, (double)4.0F, (double)0.5F);
   private class_638 lliiiilill;
   private final float[] IllIIIiill = new float[4];
   private final iliiliilIiiiliil illiiilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -6516796);
   private long iIIIIIiill;
   private final lliliIIiililiIIi lIiliilill = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private final Set<Long> IIiiiilill = new HashSet();
   private boolean lIIIIIiill;
   private final iilliIlIIiliIl IIIiiilill = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -64, -64, 320);
   private static final int llIIIIiill = 100;
   private final iliiliilIiiiliil iIliiilill = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -13649736);
   private final float[] lllIIIiill = new float[4];

   protected void Iilililiiili() {
      this.liliiilill.Iilllilliill();
      this.iiliiilill.IiIlliIliiIl();
      this.IIiiiilill.clear();
      this.iIiiiilill.clear();
      this.lliiiilill = null;
      this.IIIIIIiill = List.of();
      this.iiiiiilill = -1;
      this.lIIIIIiill = false;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - 2013) - var5) + 29430) + var5))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - 2013) - var5) + 29430) + var5))))) + var5))) ^ var5) >>> 11) - 30469) ^ var5) + 15841) << 3 | (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - 2013) - var5) + 29430) + var5))))) + var5))) ^ var5) << 5 | (char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - 2013) - var5) + 29430) + var5))))) + var5))) ^ var5) >>> 11) - 30469) ^ var5) + 15841) >>> 13));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) >>> 12 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) << 4)))) + '냙'))) >>> 3 | (char)(-((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) >>> 12 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) << 4)))) + '냙'))) << 13) << 5 | (char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) >>> 12 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) << 4)))) + '냙'))) >>> 3 | (char)(-((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) >>> 12 | (char)(~((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) << 11 | (char)(~((char)(-((char)((char)(-((char)((char)(var4[var5] + '蕀') >>> 13 | (char)(var4[var5] + '蕀') << 3))) - var5))))) >>> 5) + var5))) ^ '谒'))) << 4)))) + '냙'))) << 13) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll(class_638 world) {
      this.liliiilill.Iilllilliill();
      this.iiliiilill.IiIlliIliiIl();
      this.IIiiiilill.clear();
      this.iIiiiilill.clear();
      this.lliiiilill = world;
      this.iliiiilill = this.Iiiiiilill = -(--2091896439) ^ 55587209;
      if (world != null) {
         this.liliiilill.lIiiIiIlilli(this.IIllllIlll(world));
         this.iliiiilill = Math.max(world.method_31607(), Math.min(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         this.Iiiiiilill = Math.min(world.method_31600(), Math.max(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         this.liIlliiIll(world);
      }

      this.lIIIIIiill = false;
      iiiIIIlIIIlIIl.liiiIIllIl();
   }

   private void iiiIlIIIll() {
      this.liliiilill.IIillIiliIil();
      iiiIIIlIIIlIIl.liiiIIllIl();
      Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   }

   private void ilillIiill(class_332 ctx, IIlIiIlllIlIiIll factor, float f) {
      List var4 = this.IIIIIIiill;
      if (!var4.isEmpty()) {
         class_243 var5 = Iiiilllliiilll.field_1773.method_19418().method_71156();
         double var6 = (double)this.IlIiiilill.Iilllilliill();
         double var8 = var6 * var6;
         ArrayList var10 = new ArrayList();

         for(lliliillililiill var12 : var4) {
            double var13 = (double)var12.illiliiill + (double)0.5F - var5.field_1352;
            double var15 = (double)var12.Iililiiill + (double)0.5F - var5.field_1351;
            double var17 = (double)var12.lililiiill + (double)0.5F - var5.field_1350;
            double var19 = var13 * var13 + var15 * var15 + var17 * var17;
            if (!(var19 > var8)) {
               class_243 var21 = llilllililll.iIlIlllllill(new class_243((double)var12.illiliiill + (double)0.5F, (double)var12.Iililiiill + 1.18, (double)var12.lililiiill + (double)0.5F));
               if (var21 != null && !(var21.field_1350 <= (double)0.0F) && !(var21.field_1350 >= (double)1.0F)) {
                  iliiIlIlIiiiIlIl var22 = new iliiIlIlIiiiIlIl();
                  var22.iiIlllIiIl = var12;
                  var22.IIllllIiIl = Math.sqrt(var19);
                  var22.lIllllIiIl = (float)(var21.field_1352 / (double)f);
                  var22.iIllllIiIl = (float)(var21.field_1351 / (double)f);
                  var10.add(var22);
               }
            }
         }

         if (!var10.isEmpty()) {
            var10.sort((a, b) -> Double.compare(a.IIllllIiIl, b.IIllllIiIl));
            int var23 = Math.min(48, var10.size());
            float var24 = IliiIilliiIi.lIIlllIIliIIlllIIl > 0.0F ? IliiIilliiIi.lIIlllIIliIIlllIIl : (float)Iiiilllliiilll.method_22683().method_4489() / (float)Iiiilllliiilll.method_22683().method_4495();
            float var25 = IliiIilliiIi.IlIlllIIlllIlllIIl > 0.0F ? IliiIilliiIi.IlIlllIIlllIlllIIl : (float)Iiiilllliiilll.method_22683().method_4506() / (float)Iiiilllliiilll.method_22683().method_4495();

            for(int var14 = var23 - 1; var14 >= 0; --var14) {
               this.liilliiill(ctx, factor, (iliiIlIlIiiiIlIl)var10.get(var14), var24, var25);
            }

         }
      }
   }

   public static void iIlllIllll(class_638 pos, class_2338 world, class_2680 oldState, class_2680 newState) {
      IIiIlilllIiIlill var4 = iilliilill;
      if (var4 != null && var4.IliIlllilIi()) {
         var4.lllllillll(pos, world, oldState, newState);
      }
   }

   private String IIIillIIil(String mobId) {
      if (mobId == null) {
         return IliIlllilIi<invokedynamic>();
      } else {
         String var2 = (String)this.Iliiiilill.get(mobId);
         if (var2 != null) {
            return var2;
         } else {
            String var3;
            try {
               var3 = (String)class_1299.method_5898(mobId).map((t) -> t.method_5897().getString()).orElse(lIIlilIiiIIlilIi.iIlIlllllill(mobId));
            } catch (Throwable var5) {
               var3 = lIIlilIiiIIlilIi.iIlIlllllill(mobId);
            }

            this.Iliiiilill.put(mobId, var3);
            return var3;
         }
      }
   }

   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonObject()) {
            for(Map.Entry var4 : var2.getAsJsonObject(IliIlllilIi<invokedynamic>()).entrySet()) {
               if (((JsonElement)var4.getValue()).isJsonArray()) {
                  ArrayList var5 = new ArrayList();
                  ArrayList var6 = new ArrayList();

                  for(JsonElement var8 : ((JsonElement)var4.getValue()).getAsJsonArray()) {
                     if (var8.isJsonArray()) {
                        JsonArray var9 = var8.getAsJsonArray();
                        if (var9.size() >= 3) {
                           try {
                              var5.add(new int[]{var9.get(0).getAsInt(), var9.get(1).getAsInt(), var9.get(2).getAsInt()});
                              String var10 = var9.size() > 3 ? var9.get(3).getAsString() : "";
                              var6.add(var10.isEmpty() ? null : var10);
                           } catch (Exception var11) {
                           }

                           if (var5.size() >= 4096) {
                              break;
                           }
                        }
                     }
                  }

                  this.liliiilill.Iliilliiilii((String)var4.getKey(), var5, var6);
               }
            }

            this.iiiiiilill = -1;
         }
      }
   }

   public int iIIilIlIil() {
      return this.IIIIIIiill.size();
   }

   private void lllllillll(class_638 world, class_2338 pos, class_2680 newState, class_2680 oldState) {
      boolean var5 = newState.method_27852(class_2246.field_10260);
      boolean var6 = oldState.method_27852(class_2246.field_10260);
      if (var5 || var6) {
         if (world != this.lliiiilill) {
            this.ilIllIiIll(world);
         }

         int var7 = pos.method_10263();
         int var8 = pos.method_10264();
         int var9 = pos.method_10260();
         if (var6) {
            if (var8 < this.iliiiilill || var8 > this.Iiiiiilill) {
               return;
            }

            this.liliiilill.iliIiiliiiii(var7, var8, var9, (String)null);
            this.iIiiiilill.put(iIiIiiIlIliIiiIl.lIiiIiIlilli(var7, var8, var9), 100);
         } else {
            this.iIiiiilill.remove(iIiIiiIlIliIiiIl.lIiiIiIlilli(var7, var8, var9));
            this.liliiilill.IIIllIIliIIl(var7, var8, var9);
         }

      }
   }

   private int lIilliIill(lliliillililiill e) {
      int var10000;
      switch (null.lllIIIlilillIIIlil[lIIlilIiiIIlilIi.liiiIIllIl(e.IliIlllilIi()).ordinal()]) {
         case 1 -> var10000 = this.iiIiiilill.Iilllilliill();
         case 2 -> var10000 = this.IIliiilill.Iilllilliill();
         case 3 -> var10000 = this.lIliiilill.Iilllilliill();
         case 4 -> var10000 = this.iIliiilill.Iilllilliill();
         case 5 -> var10000 = this.Illiiilill.Iilllilliill();
         case 6 -> var10000 = this.llliiilill.Iilllilliill();
         case 7 -> var10000 = this.illiiilill.Iilllilliill();
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   private static int Ilillllill(int rgb, float alpha255) {
      long var3 = -3968657535323602007L;
      var3 ^= ((long)class_3532.method_15340(Math.round(alpha255), 0, (~((1243426636 >>> 1 | 1243426636 << 31) << 17 | (1243426636 >>> 1 | 1243426636 << 31) >>> 15) << 31 | ~((1243426636 >>> 1 | 1243426636 << 31) << 17 | (1243426636 >>> 1 | 1243426636 << 31) >>> 15) >>> 1) ^ 1750718990) << 32 ^ var3) & -1L << 32;
      return (int)(var3 >>> 32) << (-(1962641325 * 43) ^ 1505768937) | rgb & (-(-(-795646230 * 1944890851 * -87)) ^ 392810449);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3671983996693371966L ^ Long.rotateLeft(8987003844495077058L, 1) ^ 4297162973069935384L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2087638818437389784L ^ Long.rotateLeft(6509806874283077288L, 12) ^ -7729946344945556613L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6813332738260919726L ^ Long.rotateLeft(-849077970536019576L, 30) ^ 8922158523363366961L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 876855183795659044L ^ Long.rotateLeft(9088853759122213935L, 31) ^ 4020447502135811218L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7181389901160208151L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7172001800702203548L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3580780919289356870L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4001592014157904335L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4684964999841718825L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9184717423587702564L;
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

   private void lIIlliIIll(class_638 world) {
      if (!this.iIiiiilill.isEmpty()) {
         int var2 = 0;

         for(Iterator var3 = this.iIiiiilill.entrySet().iterator(); var3.hasNext() && var2 < 16; ++var2) {
            Map.Entry var4 = (Map.Entry)var3.next();
            long var5 = (Long)var4.getKey();
            lliliillililiill var7 = this.liliiilill.Iiilliiliiil(var5);
            if (var7 != null && !var7.liiiIIllIl() && var7.IilliliilIIi()) {
               String var8 = illiliIilili.liiiIIllIl(world.method_8321(new class_2338(var7.illiliiill, var7.Iililiiill, var7.lililiiill)));
               if (var8 != null) {
                  this.liliiilill.IIlllIlliIll(var5, var8);
                  var3.remove();
               } else if ((Integer)var4.getValue() <= 1) {
                  var3.remove();
               } else {
                  var4.setValue((Integer)var4.getValue() - 1);
               }
            } else {
               var3.remove();
            }
         }

      }
   }

   public static void Iillllilll(class_2338 pos) {
      IIiIlilllIiIlill var1 = iilliilill;
      if (var1 != null && var1.IliIlllilIi() && pos != null) {
         var1.iilllIIill(pos);
      }
   }

   private void liIlliiIll(class_638 world) {
      if (Iiiilllliiilll.field_1724 != null) {
         int var2 = Math.min(this.iiiliilill.Iilllilliill(), Iiiilllliiilll.field_1690.method_38521() + 2);
         class_1923 var3 = Iiiilllliiilll.field_1724.method_31476();
         this.iiliiilill.lIiiIiIlilli(var3.field_9181, var3.field_9180);

         for(int var4 = -var2; var4 <= var2; ++var4) {
            for(int var5 = -var2; var5 <= var2; ++var5) {
               int var6 = var3.field_9181 + var4;
               int var7 = var3.field_9180 + var5;
               if (world.method_8393(var6, var7)) {
                  long var8 = iIiIiiIlIliIiiIl.IliIlllilIi(var6, var7);
                  if (!this.IIiiiilill.contains(var8)) {
                     this.iiliiilill.liiiIIllIl(var8);
                  }
               }
            }
         }

      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') << 10 | (char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') >>> 6))))))) << 15 | (char)(~((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') << 10 | (char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') >>> 6))))))) >>> 1))) ^ var5) << 1 | (char)((char)(~((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') << 10 | (char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') >>> 6))))))) << 15 | (char)(~((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') << 10 | (char)((char)((char)(var4[var5] + 22007) >>> 6 | (char)(var4[var5] + 22007) << 10) - '鰾') >>> 6))))))) >>> 1))) ^ var5) >>> 15))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      this.lliiiilill = null;
      this.iliiiilill = this.Iiiiiilill = ~1394309677 * 654471207 + 75 ^ -620739767;
      this.liiiiilill = 0;
      this.iiiiiilill = -1;
      this.IIIIIIiill = List.of();
   }

   private void iilllIIill(class_2338 pos) {
      class_638 var2 = Iiiilllliiilll.field_1687;
      if (var2 != null && var2 == this.lliiiilill && Iiiilllliiilll.method_18854()) {
         long var3 = iIiIiiIlIliIiiIl.lIiiIiIlilli(pos.method_10263(), pos.method_10264(), pos.method_10260());
         if (this.liliiilill.Iiilliiliiil(var3) != null) {
            String var5 = illiliIilili.liiiIIllIl(var2.method_8321(pos));
            if (var5 != null) {
               this.liliiilill.IIlllIlliIll(var3, var5);
               this.iIiiiilill.remove(var3);
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ var5) ^ '\udb01'))) - var5))) + var5) ^ var5) - var5))) << 6 | (char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ var5) ^ '\udb01'))) - var5))) + var5) ^ var5) - var5))) >>> 10) - 9654))) - 7448) >>> 15 | (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ var5) ^ '\udb01'))) - var5))) + var5) ^ var5) - var5))) << 6 | (char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) ^ var5) ^ '\udb01'))) - var5))) + var5) ^ var5) - var5))) >>> 10) - 9654))) - 7448) << 1) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private String IIllllIlll(class_638 world) {
      class_642 var3 = Iiiilllliiilll.method_1558();
      String var2;
      if (var3 != null && var3.field_3761 != null && !var3.field_3761.isBlank()) {
         var2 = IliIlllilIi<invokedynamic>() + var3.field_3761.trim().toLowerCase(Locale.ROOT);
      } else if (Iiiilllliiilll.method_1542() && Iiiilllliiilll.method_1576() != null) {
         var2 = IliIlllilIi<invokedynamic>() + Iiiilllliiilll.method_1576().method_27728().method_150();
      } else {
         var2 = IliIlllilIi<invokedynamic>();
      }

      return var2 + IliIlllilIi<invokedynamic>() + world.method_27983().method_29177();
   }

   public JsonElement IIiIllIiIl() {
      Map var1 = this.liliiilill.IIiilIiiiIii();
      if (var1.isEmpty()) {
         return null;
      } else {
         JsonObject var2 = new JsonObject();

         for(Map.Entry var4 : var1.entrySet()) {
            JsonArray var5 = new JsonArray();

            for(lliliillililiill var7 : (List)var4.getValue()) {
               JsonArray var8 = new JsonArray();
               var8.add(var7.illiliiill);
               var8.add(var7.Iililiiill);
               var8.add(var7.lililiiill);
               var8.add(var7.IliIlllilIi() == null ? "" : var7.IliIlllilIi());
               var5.add(var8);
            }

            var2.add((String)var4.getKey(), var5);
         }

         JsonObject var9 = new JsonObject();
         var9.add(IliIlllilIi<invokedynamic>(), var2);
         return var9;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + 16858) >>> 4 | (char)(var4[var5] + 16858) << 12) << 8 | (char)((char)(var4[var5] + 16858) >>> 4 | (char)(var4[var5] + 16858) << 12) >>> 8) - '龲'))) - 17077) + var5))) - '鲱') - 24838) + '礪'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIiIlilllIiIlill() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.ililiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.Iiiliilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.liiliilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iiiliilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IIIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lIIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iIIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.llIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.ilIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IiIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.liIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iiIiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IIliiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.lIliiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.iIliiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.Illiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.llliiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.illiiilill.iIlIlllllill(IliIlllilIi<invokedynamic>());
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIiliilill, this.lIiliilill, this.iIiliilill, this.Ililiilill, this.lliliilill, this.ililiilill, this.Iiiliilill, this.liiliilill, this.iiiliilill, this.IIIiiilill, this.lIIiiilill, this.iIIiiilill, this.IlIiiilill, this.llIiiilill, this.ilIiiilill, this.IiIiiilill, this.liIiiilill, this.iiIiiilill, this.IIliiilill, this.lIliiilill, this.iIliiilill, this.Illiiilill, this.llliiilill, this.illiiilill, this.Iiliiilill});
      iilliilill = this;
      ClientChunkEvents.CHUNK_LOAD.register((ClientChunkEvents.Load)(chunk, world) -> {
         if (this.IliIlllilIi()) {
            if (chunk != this.lliiiilill) {
               this.ilIllIiIll(chunk);
            }

            long var3 = iIiIiiIlIliIiiIl.IliIlllilIi(world.method_12004().field_9181, world.method_12004().field_9180);
            this.IIiiiilill.remove(var3);
            this.iiliiilill.liiiIIllIl(var3);
         }
      });
      ClientChunkEvents.CHUNK_UNLOAD.register((ClientChunkEvents.Unload)(chunk, world) -> {
         if (this.IliIlllilIi() && chunk == this.lliiiilill) {
            long var3 = iIiIiiIlIliIiiIl.IliIlllilIi(world.method_12004().field_9181, world.method_12004().field_9180);
            this.iiliiilill.iIlIlllllill(var3);
            this.IIiiiilill.remove(var3);
            this.liliiilill.Illlllllilll(var3);
            this.lIIIIIiill = true;
         }
      });
   }

   protected void iIIIlIlIIl() {
      class_638 var1 = Iiiilllliiilll.field_1687;
      if (var1 != this.lliiiilill) {
         this.ilIllIiIll(var1);
      }

      if (var1 != null && Iiiilllliiilll.field_1724 != null) {
         ++this.liiiiilill;
         this.liliiilill.IilliliilIIi(this.IIiliilill.Iilllilliill());
         int var2 = Math.max(var1.method_31607(), Math.min(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         int var3 = Math.min(var1.method_31600(), Math.max(this.IIIiiilill.Iilllilliill(), this.lIIiiilill.Iilllilliill()));
         if (var2 != this.iliiiilill || var3 != this.Iiiiiilill) {
            this.iliiiilill = var2;
            this.Iiiiiilill = var3;
            this.IIiiiilill.clear();
            this.liIlliiIll(var1);
         }

         class_1923 var4 = Iiiilllliiilll.field_1724.method_31476();
         this.iiliiilill.lIiiIiIlilli(var4.field_9181, var4.field_9180);
         if (this.liiiiilill % 100 == 0) {
            this.liIlliiIll(var1);
         }

         int var5 = this.iIIiiilill.Iilllilliill();
         int var6 = 0;
         int var7 = 0;

         Long var8;
         while(var6 < var5 && var7 < 64 && (var8 = this.iiliiilill.iliIiiliiiii()) != null) {
            class_2818 var9 = var1.method_2935().method_2857(iIiIiiIlIliIiiIl.iIlIlllllill(var8), iIiIiiIlIliIiiIl.IilliliilIIi(var8), class_2806.field_12803, false);
            if (var9 != null) {
               illiliIilili.IliIlllilIi(var9, var2, var3, this.lIiiiilill);
               this.liliiilill.IlIlllIlilIl(var8, this.lIiiiilill.liIIilIliiIIilIl);
               this.IIiiiilill.add(var8);
               ++var6;
               var7 += this.lIiiiilill.IIlIilIllIlIilIl;
            }
         }

         this.lIIlliIIll(var1);
         if (this.liiiiilill % 100 == 0) {
            for(lliliillililiill var10 : this.liliiilill.IiIiliIiiiIi(32)) {
               String var11 = illiliIilili.liiiIIllIl(var1.method_8321(new class_2338(var10.illiliiill, var10.Iililiiill, var10.lililiiill)));
               if (var11 != null) {
                  this.liliiilill.IIlllIlliIll(var10.iililiiill, var11);
               }
            }
         }

         this.IlIllllIll();
         if (this.lIIIIIiill && System.currentTimeMillis() - this.iIIIIIiill > 30000L) {
            this.lIIIIIiill = false;
            this.iIIIIIiill = System.currentTimeMillis();
            iiiIIIlIIIlIIl.liiiIIllIl();
         }

      } else {
         this.IlIllllIll();
      }
   }

   private void IlIllllIll() {
      if (this.liliiilill.liiiIIllIl() != this.iiiiiilill) {
         this.iiiiiilill = this.liliiilill.liiiIIllIl();
         this.IIIIIIiill = this.liliiilill.IlIillIiilIi();
      }
   }

   protected void Iliilliiilii(lIiIlliiIiIlli event) {
      if (this.lliliilill.Iilllilliill()) {
         if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
            class_332 var2 = event.IIiIilIIIl;
            class_4587 var3 = new class_4587();
            CorzClient.fontManager.iIlIlllllill(var3);
            IIIiiIillIIiiIil.IliIlllilIi(var3);
            double var4 = (double)Iiiilllliiilll.method_22683().method_4495();
            int var6 = Iiiilllliiilll.method_22683().method_4476(IIililillIililil.iiiIlIIIll(Iiiilllliiilll), Iiiilllliiilll.method_1573());
            float var7 = (float)((double)var6 / var4);
            boolean var8 = Math.abs(var7 - 1.0F) > 1.0E-4F;
            if (var8) {
               IliiIilliiIi.lIIlllIIliIIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4486() / var7);
               IliiIilliiIi.IlIlllIIlllIlllIIl = (float)Math.round((float)Iiiilllliiilll.method_22683().method_4502() / var7);
            }

            IIlIiIlllIlIiIll var9 = IIlIiIlllIlIiIll.lIiiIiIlilli();
            IIlIiIlllIlIiIll var10 = var9.IIillIiliIil() ? var9 : IIlIiIlllIlIiIll.liiiIIllIl();

            try {
               if (var10.IIillIiliIil()) {
                  this.ilillIiill(var2, var10, var7);
                  return;
               }
            } finally {
               if (var8) {
                  IliiIilliiIi.lIIlllIIliIIlllIIl = 0.0F;
                  IliiIilliiIi.IlIlllIIlllIlllIIl = 0.0F;
               }

            }

         }
      }
   }

   private void liilliiill(class_332 ctx, IIlIiIlllIlIiIll visW, iliiIlIlIiiiIlIl visH, float l, float f) {
      lliliillililiill var6 = visH.iiIlllIiIl;
      float var7 = class_3532.method_15363(1.12F - (float)visH.IIllllIiIl / 96.0F, 0.72F, 1.0F);
      float var8 = 18.0F * var7;
      float var9 = 7.0F * var7;
      float var10 = 11.0F * var7;
      float var11 = 5.0F * var7;
      String var12 = this.ililiilill.Iilllilliill() ? this.IIIillIIil(var6.IliIlllilIi()) : IliIlllilIi<invokedynamic>();
      String var13 = this.Iiiliilill.Iilllilliill() ? IliIlllilIi<invokedynamic>() + Math.round(visH.IIllllIiIl) + IliIlllilIi<invokedynamic>() : "";
      String var14 = this.liiliilill.Iilllilliill() ? IliIlllilIi<invokedynamic>() + var6.illiliiill + IliIlllilIi<invokedynamic>() + var6.Iililiiill + IliIlllilIi<invokedynamic>() + var6.lililiiill : "";
      String var15 = var6.IilliliilIIi() ? "" : IliIlllilIi<invokedynamic>();
      float var16 = visW.Iiilliiliiil(var12, var10);
      float var17 = visW.Iiilliiliiil(var13, var10);
      float var18 = visW.Iiilliiliiil(var14, var10);
      float var19 = visW.Iiilliiliiil(var15, var10);
      float var20 = var9 + var16 + var17 + var18 + var19 + var9;
      float var21 = visH.lIllllIiIl - var20 / 2.0F;
      float var22 = visH.iIllllIiIl - var8;
      if (!(var21 + var20 + 16.0F < 0.0F) && !(var21 - 16.0F > l) && !(var22 + var8 + 16.0F < 0.0F) && !(var22 - 16.0F > f)) {
         float var23 = var6.IilliliilIIi() ? 1.0F : (float)this.liIiiilill.Iilllilliill();
         float var24 = IliiIilliiIi.IilliliilIIi(var23);

         try {
            IIIiiIillIIiiIil.Ililllililil(ctx, var21, var22, var20, var8, var11, -233499369, 620756991);
            float var25 = var21 + var9;
            float var26 = var22 + (var8 - visW.IlIillIiilIi(var10)) / 2.0F;
            int var27 = 0;
            this.iIlIIIiill[var27] = var12;
            this.IllIIIiill[var27] = var25;
            this.illIIIiill[var27++] = this.lIilliIill(var6) | -16777216;
            var25 += var16;
            if (!var13.isEmpty()) {
               this.iIlIIIiill[var27] = var13;
               this.IllIIIiill[var27] = var25;
               this.illIIIiill[var27++] = -6645087;
               var25 += var17;
            }

            if (!var14.isEmpty()) {
               this.iIlIIIiill[var27] = var14;
               this.IllIIIiill[var27] = var25;
               this.illIIIiill[var27++] = -6645087;
               var25 += var18;
            }

            if (!var15.isEmpty()) {
               this.iIlIIIiill[var27] = var15;
               this.IllIIIiill[var27] = var25;
               this.illIIIiill[var27++] = -6645087;
            }

            for(int var28 = 0; var28 < var27; ++var28) {
               this.lllIIIiill[var28] = var26;
            }

            visW.Iilililiiili(this.iIlIIIiill, this.IllIIIiill, this.lllIIIiill, this.illIIIiill, var27, var10);
         } finally {
            IliiIilliiIi.lIiiIiIlilli(var24);
         }

      }
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      List var2 = this.IIIIIIiill;
      if (!var2.isEmpty() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         int var3 = this.lIiliilill.Ililllililil();
         boolean var4 = var3 == 1 || var3 == 3;
         boolean var5 = var3 == 2 || var3 == 3;
         boolean var6 = this.iIiliilill.Iilllilliill();
         boolean var7 = this.Ililiilill.Iilllilliill();
         if (var4 || var5 || var6 || var7) {
            class_4184 var8 = Iiiilllliiilll.field_1773.method_19418();
            class_243 var9 = var8.method_71156();
            double var10 = (double)this.IlIiiilill.Iilllilliill();
            double var12 = var10 * var10;
            float var14 = (float)this.ilIiiilill.Iilllilliill();
            int var15 = this.llIiiilill.Iilllilliill();
            float var16 = (float)this.liIiiilill.Iilllilliill();
            float var17 = (float)this.IiIiiilill.Iilllilliill();
            float var18 = 0.85F + 0.15F * (float)Math.sin((double)((float)(System.currentTimeMillis() % 10000L) / 1000.0F * 3.0F));
            class_4587 var19 = event.IliiiIIilliiiIIi;
            var19.method_22903();
            var19.method_22904(-var9.field_1352, -var9.field_1351, -var9.field_1350);
            Matrix4f var20 = var19.method_23760().method_23761();
            class_4588 var21 = var7 ? iIiiIIilIliiIIil.IilliliilIIi() : null;

            for(lliliillililiill var23 : var2) {
               double var24 = (double)var23.illiliiill + (double)0.5F;
               double var26 = (double)var23.Iililiiill + (double)0.5F;
               double var28 = (double)var23.lililiiill + (double)0.5F;
               double var30 = var24 - var9.field_1352;
               double var32 = var26 - var9.field_1351;
               double var34 = var28 - var9.field_1350;
               if (!(var30 * var30 + var32 * var32 + var34 * var34 > var12)) {
                  int var36 = this.lIilliIill(var23) & 16777215;
                  float var37 = var23.IilliliilIIi() ? 1.0F : var16;
                  float var38 = (float)var23.illiliiill + 0.002F;
                  float var39 = (float)var23.Iililiiill + 0.002F;
                  float var40 = (float)var23.lililiiill + 0.002F;
                  float var41 = (float)var23.illiliiill + 0.998F;
                  float var42 = (float)var23.Iililiiill + 0.998F;
                  float var43 = (float)var23.lililiiill + 0.998F;
                  if (var5) {
                     iIiiIIilIliiIIil.IIlilIliiIli(var20, var38, var39, var40, var41, var42, var43, (float)(var36 >> 16 & 255) / 255.0F, (float)(var36 >> 8 & 255) / 255.0F, (float)(var36 & 255) / 255.0F, (float)var15 / 255.0F * var37);
                  }

                  if (var4) {
                     iIiiIIilIliiIIil.iIIIlIlIIl(var20, var38, var39, var40, var41, var42, var43, Ilillllill(var36, 255.0F * var37), var14);
                  }

                  if (var6) {
                     Iillllilll.IIlllIlliIll(var24, var26, var28, Ilillllill(var36, 200.0F * var37), Math.max(1.0F, var14 * 0.6F));
                  }

                  if (var21 != null) {
                     double var44 = Math.sqrt(var30 * var30 + var34 * var34);
                     float var46 = var44 > 0.001 ? (float)(var34 / var44) : 1.0F;
                     float var47 = var44 > 0.001 ? (float)(-var30 / var44) : 0.0F;
                     float var48 = 0.14F;
                     float var49 = (float)var23.Iililiiill + 1.0F;
                     int var50 = Ilillllill(var36, 140.0F * var37 * var18);
                     int var51 = Ilillllill(var36, 0.0F);
                     iIiiIIilIliiIIil.IlIlllIlilIl(var21, var20, (float)var24 + var46 * var48, var49, (float)var28 + var47 * var48, var50, (float)var24 - var46 * var48, var49, (float)var28 - var47 * var48, var50, (float)var24 - var46 * var48, var49 + var17, (float)var28 - var47 * var48, var51, (float)var24 + var46 * var48, var49 + var17, (float)var28 + var47 * var48, var51);
                  }
               }
            }

            var19.method_22909();
         }
      }
   }
}
