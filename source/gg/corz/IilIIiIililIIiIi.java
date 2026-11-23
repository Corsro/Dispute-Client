package gg.corz;

import com.corz.client.CorzClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1921;
import net.minecraft.class_243;
import net.minecraft.class_2960;
import net.minecraft.class_3532;
import net.minecraft.class_4184;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4597;
import net.minecraft.class_9799;
import org.joml.Matrix4f;

public class IilIIiIililIIiIi extends ilIllIiIll {
   private static final int liIililIIi = 64;
   private static final int iiIililIIi = -670364398;
   private final illlIlIlIillIlIl illililIIi = new illlIlIlIillIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final IIiiIIIllIiiIIIl IllililIIi = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final ililliIiIiilliIi lilililIIi = (new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::IlIllllIll)).Ililllililil();
   private final iiIiiilIIliiil IIiililIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil iilililIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private static final Color lIlililIIi = new Color((-315317433 * 71 - -123 >>> 5 | -315317433 * 71 - -123 << 27) ^ 1716308665, -1166929523 - -65 ^ -95 ^ 1166929564, ~(-(~861863494) >>> 5 | -(~861863494) << 27) ^ -966457099, -(-941644170) - -59 ^ 941644090);
   private final iiIiiilIIliiil lIiililIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final List<IIliIIIilIliIIIi> iliililIIi = new ArrayList();
   private static final Color iIlililIIi = new Color((-1906340061 ^ -31 ^ -3) * -1631000239 ^ -791369393, ~(~843323095) - -123 ^ 843323380, ~((-383215536 ^ -29) + -87 >>> 31 | (-383215536 ^ -29) + -87 << 1) ^ -766430731, -((213249202 >>> 1 | 213249202 << 31) + 115) ^ -106624545);
   private final IIIIlilllIIIlill IliililIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0.9, 0.3, (double)3.0F, 0.1);
   private final IIIIlilllIIIlill lliililIIi = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)40.0F, (double)4.0F, (double)128.0F, (double)1.0F);
   private final iiIiiilIIliiil iIiililIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private class_4597.class_4598 liiililIIi;
   private static final int IIlililIIi = 620756991;
   private class_9799 IiiililIIi;
   private static final class_2960 IiIililIIi = class_2960.method_60655(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final ililliIiIiilliIi IilililIIi = (new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::lIIlliIIll)).Ililllililil();
   private final ililliIiIiilliIi lllililIIi = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::iiiIlIIIll);

   protected void lilIliilIl(IiiIlllliiIlll e) {
      if (this.IliIlllilIi() && e.liiiIIllIl() == (~(-892031095 * 270549121) ^ 500255735)) {
         if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1755 == null) {
            if (this.illililIIi.IiIiliIiiiIi(e.IliIlllilIi())) {
               this.iiiIlIIIll();
            }
         }
      }
   }

   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var2 = element.getAsJsonObject();
         if (var2.has(IliIlllilIi<invokedynamic>()) && var2.get(IliIlllilIi<invokedynamic>()).isJsonArray()) {
            this.iliililIIi.clear();

            for(JsonElement var4 : var2.getAsJsonArray(IliIlllilIi<invokedynamic>())) {
               if (var4.isJsonObject()) {
                  JsonObject var5 = var4.getAsJsonObject();

                  try {
                     this.iliililIIi.add(new IIliIIIilIliIIIi(var5.get(IliIlllilIi<invokedynamic>()).getAsDouble(), var5.get(IliIlllilIi<invokedynamic>()).getAsDouble(), var5.get(IliIlllilIi<invokedynamic>()).getAsDouble(), var5.has(IliIlllilIi<invokedynamic>()) ? var5.get(IliIlllilIi<invokedynamic>()).getAsString() : IliIlllilIi<invokedynamic>(), var5.has(IliIlllilIi<invokedynamic>()) ? var5.get(IliIlllilIi<invokedynamic>()).getAsInt() & 16777215 : '\uaaff'));
                     if (this.iliililIIi.size() >= 64) {
                        break;
                     }
                  } catch (Exception var7) {
                  }
               }
            }

         }
      }
   }

   public void Iilililiiili() {
      if (this.IiiililIIi != null) {
         this.IiiililIIi.close();
         this.IiiililIIi = null;
         this.liiililIIi = null;
      }

   }

   private void IlIllllIll() {
      long var2 = 1529896411761203855L;
      if (!this.iliililIIi.isEmpty()) {
         var2 ^= ((long)this.iliililIIi.size() << 32 ^ var2) & -1L << 32;
         this.iliililIIi.clear();
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), (int)(var2 >>> 32) + IliIlllilIi<invokedynamic>(), false);
         iiiIIIlIIIlIIl.liiiIIllIl();
      }
   }

   public void IIiilIiiiIii(illlllIillll event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !this.iliililIIi.isEmpty()) {
         class_4184 var2 = Iiiilllliiilll.field_1773.method_19418();
         class_243 var3 = var2.method_71156();
         long var4 = System.currentTimeMillis();
         float var6 = 0.85F + 0.15F * (float)Math.sin((double)((float)(var4 % 10000L) / 1000.0F * 3.0F));
         Matrix4f var7 = event.IliiiIIilliiiIIi.method_23760().method_23761();
         if (this.iilililIIi.Iilllilliill()) {
            float var8 = (float)this.lliililIIi.Iilllilliill();
            class_4588 var9 = iIiiIIilIliiIIil.IilliliilIIi();

            for(IIliIIIilIliIIIi var11 : this.iliililIIi) {
               float var12 = (float)(var11.illiiIliil - var3.field_1352);
               float var13 = (float)(var11.liliiIliil - var3.field_1350);
               float var14 = (float)(var11.IiliiIliil - var3.field_1351);
               double var15 = Math.sqrt((double)(var12 * var12 + var13 * var13));
               float var17 = var15 > 0.001 ? (float)((double)var13 / var15) : 1.0F;
               float var18 = var15 > 0.001 ? (float)((double)(-var12) / var15) : 0.0F;
               float var19 = 0.12F;
               int var20 = iIillliIlillli.IIIilIIiiIIi(var11.IIiiiIliil, 0.55F * var6);
               int var21 = iIillliIlillli.IIIilIIiiIIi(var11.IIiiiIliil, 0.0F);
               iIiiIIilIliiIIil.IlIlllIlilIl(var9, var7, var12 + var17 * var19, var14, var13 + var18 * var19, var20, var12 - var17 * var19, var14, var13 - var18 * var19, var20, var12 - var17 * var19, var14 + var8, var13 - var18 * var19, var21, var12 + var17 * var19, var14 + var8, var13 + var18 * var19, var21);
            }
         }

         if (this.IIiililIIi.Iilllilliill()) {
            if (this.IiiililIIi == null) {
               this.IiiililIIi = new class_9799(524288);
               this.liiililIIi = class_4597.method_22991(this.IiiililIIi);
            }

            class_1921 var22 = (class_1921)llIlliIlilIlliIl.lililiiIll.apply(IiIililIIi);
            class_4588 var23 = this.liiililIIi.method_73477(var22);
            float var24 = (float)this.IliililIIi.Iilllilliill() * var6;
            class_4587 var25 = event.IliiiIIilliiiIIi;

            for(IIliIIIilIliIIIi var27 : this.iliililIIi) {
               int var28 = var27.IIiiiIliil >> 16 & 255;
               int var29 = var27.IIiiiIliil >> 8 & 255;
               int var16 = var27.IIiiiIliil & 255;
               int var30 = (int)(255.0F * var6);
               var25.method_22903();
               var25.method_22904(var27.illiiIliil - var3.field_1352, var27.IiliiIliil - var3.field_1351 + 1.2, var27.liliiIliil - var3.field_1350);
               var25.method_22907(var2.method_23767());
               var25.method_22905(var24, var24, 1.0F);
               Matrix4f var31 = var25.method_23760().method_23761();
               var23.method_22918(var31, -1.0F, -1.0F, 0.0F).method_22913(0.0F, 1.0F).method_1336(var28, var29, var16, var30);
               var23.method_22918(var31, 1.0F, -1.0F, 0.0F).method_22913(1.0F, 1.0F).method_1336(var28, var29, var16, var30);
               var23.method_22918(var31, 1.0F, 1.0F, 0.0F).method_22913(1.0F, 0.0F).method_1336(var28, var29, var16, var30);
               var23.method_22918(var31, -1.0F, 1.0F, 0.0F).method_22913(0.0F, 0.0F).method_1336(var28, var29, var16, var30);
               var25.method_22909();
            }

            this.liiililIIi.method_22993();
         }

      }
   }

   private void iiiIlIIIll() {
      if (Iiiilllliiilll.field_1724 != null) {
         if (this.iliililIIi.size() >= 64) {
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
         } else {
            class_243 var1 = Iiiilllliiilll.field_1724.method_73189();
            String var2 = this.IllililIIi.Iilllilliill() != null && !this.IllililIIi.Iilllilliill().isBlank() ? this.IllililIIi.Iilllilliill().trim() : IliIlllilIi<invokedynamic>() + (this.iliililIIi.size() + 1);
            int var3 = Color.HSBtoRGB((float)this.iliililIIi.size() * 0.37F % 1.0F, 0.85F, 1.0F) & 16777215;
            this.iliililIIi.add(new IIliIIIilIliIIIi(var1.field_1352, var1.field_1351, var1.field_1350, var2, var3));
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), String.format(IliIlllilIi<invokedynamic>(), var2, var1.field_1352, var1.field_1351, var1.field_1350), true);
            iiiIIIlIIIlIIl.liiiIIllIl();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) >>> 7) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) >>> 7) << 5) ^ var5) ^ '\ud872') >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) >>> 7) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) << 9 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') >>> 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) << 11 | (char)(~((char)((char)(~((char)((char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) << 8 | (char)(-((char)(~((char)(-((char)((char)(-var4[var5]) << 2 | (char)(-var4[var5]) >>> 14))))))) >>> 8))) + '麦'))) >>> 5) + '閡') << 3) >>> 7) << 5) ^ var5) ^ '\ud872') << 13) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIIlliIIll() {
      if (Iiiilllliiilll.field_1724 != null && !this.iliililIIi.isEmpty()) {
         class_243 var1 = Iiiilllliiilll.field_1724.method_73189();
         int var2 = -1;
         double var3 = Double.MAX_VALUE;

         for(int var5 = 0; var5 < this.iliililIIi.size(); ++var5) {
            double var6 = var1.method_1025(((IIliIIIilIliIIIi)this.iliililIIi.get(var5)).IliIlllilIi());
            if (var6 < var3) {
               var3 = var6;
               var2 = var5;
            }
         }

         if (var2 >= 0) {
            IIliIIIilIliIIIi var8 = (IIliIIIilIliIIIi)this.iliililIIi.remove(var2);
            Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), var8.iiliiIliil, false);
            iiiIIIlIIIlIIl.liiiIIllIl();
         }

      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 8580) >>> 4 | (char)(var4[var5] ^ 8580) << 12) - '蹣') + 5725))) + 3701) - var5) ^ var5) - 10180) - '擄') ^ 1385))))) - var5) >>> 9 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 8580) >>> 4 | (char)(var4[var5] ^ 8580) << 12) - '蹣') + 5725))) + 3701) - var5) ^ var5) - 10180) - '擄') ^ 1385))))) - var5) << 7) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static float ilIllIiIll(float v, float hi, float lo) {
      return v < hi ? hi : Math.min(v, lo);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5671848703304813827L ^ Long.rotateLeft(2225069751907797990L, 33) ^ -2207295360054393890L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6756879443760214270L ^ Long.rotateLeft(-327686162243851042L, 47) ^ 1772363146672318695L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -86570270665916145L ^ Long.rotateLeft(-1010013331934769730L, 5) ^ -4721843280929058540L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3733527928067910211L ^ Long.rotateLeft(1648267863392032211L, 55) ^ -9168221512175099168L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4895090367323823268L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8442833443053804386L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 73879538027025270L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3140845038346500093L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5424048740358518502L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8966973479972602405L;
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
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5)))))) - 17434) - '\ue0ed') ^ var5) ^ var5) ^ var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] ^ var5) + var5) - var5)))))) - 17434) - '\ue0ed') ^ var5) ^ var5) ^ var5) >>> 12) + 29511))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IilIIiIililIIiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IllililIIi, this.lllililIIi, this.illililIIi, this.IilililIIi, this.lilililIIi, this.iilililIIi, this.IIiililIIi, this.lIiililIIi, this.iIiililIIi, this.IliililIIi, this.lliililIIi});
   }

   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      JsonArray var2 = new JsonArray();

      for(IIliIIIilIliIIIi var4 : this.iliililIIi) {
         JsonObject var5 = new JsonObject();
         var5.addProperty(IliIlllilIi<invokedynamic>(), var4.illiiIliil);
         var5.addProperty(IliIlllilIi<invokedynamic>(), var4.IiliiIliil);
         var5.addProperty(IliIlllilIi<invokedynamic>(), var4.liliiIliil);
         var5.addProperty(IliIlllilIi<invokedynamic>(), var4.iiliiIliil);
         var5.addProperty(IliIlllilIi<invokedynamic>(), var4.IIiiiIliil);
         var2.add(var5);
      }

      var1.add(IliIlllilIi<invokedynamic>(), var2);
      return var1;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 15 | (char)(var4[var5] - var5) << 1) - '\ue504') - var5) + 1037) - 25161) + var5) - var5) ^ 2903) ^ var5))) ^ '서'));
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
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '鯳') - var5) + var5) - var5))) ^ var5) + var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '鯳') - var5) + var5) - var5))) ^ var5) + var5))) ^ var5) - var5) >>> 7))) + '\uf35a') + var5) << 2 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '鯳') - var5) + var5) - var5))) ^ var5) + var5))) ^ var5) - var5) << 9 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + '鯳') - var5) + var5) - var5))) ^ var5) + var5))) ^ var5) - var5) >>> 7))) + '\uf35a') + var5) >>> 14) - 31558))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (this.IliIlllilIi() && Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !this.iliililIIi.isEmpty()) {
         if (this.lIiililIIi.Iilllilliill() && Iiiilllliiilll.field_1755 == null) {
            class_243 var2 = Iiiilllliiilll.field_1773.method_19418().method_71156();
            int var3 = Iiiilllliiilll.method_22683().method_4486();
            int var4 = Iiiilllliiilll.method_22683().method_4502();
            float var5 = (float)Math.toRadians((double)Iiiilllliiilll.field_1773.method_19418().method_19330());
            float var6 = (float)Math.toRadians((double)Iiiilllliiilll.field_1773.method_19418().method_19329());
            float var7 = (float)Math.toRadians((double)IiilIIiliilIIi.liiiIIllIl());
            float var8 = var7 * ((float)var3 / (float)var4);
            float var9 = 18.0F;
            float var10 = (float)var3 / 2.0F - var9;
            float var11 = (float)var4 / 2.0F - var9;
            class_4587 var12 = new class_4587();
            CorzClient.fontManager.iIlIlllllill(var12);
            IIIiiIillIIiiIil.IliIlllilIi(var12);
            IIliiIlllIliiIll var13 = CorzClient.fontManager.lIiiIiIlilli();
            int var14 = Math.round(var13.IilliliilIIi());

            for(IIliIIIilIliIIIi var16 : this.iliililIIi) {
               double var17 = var2.method_1022(var16.IliIlllilIi());
               class_243 var19 = new class_243(var16.illiiIliil, var16.IiliiIliil + 1.2, var16.liliiIliil);
               class_243 var20 = llilllililll.iIlIlllllill(var19);
               boolean var21 = var20 != null && var20.field_1350 > (double)0.0F && var20.field_1350 < (double)1.0F;
               float var22;
               float var23;
               if (var21 && var20.field_1352 >= (double)var9 && var20.field_1352 <= (double)((float)var3 - var9) && var20.field_1351 >= (double)var9 && var20.field_1351 <= (double)((float)var4 - var9)) {
                  var22 = (float)var20.field_1352;
                  var23 = (float)var20.field_1351;
               } else {
                  if (!this.iIiililIIi.Iilllilliill()) {
                     continue;
                  }

                  double var24;
                  double var26;
                  if (var21) {
                     var24 = var20.field_1352 - (double)var3 / (double)2.0F;
                     var26 = var20.field_1351 - (double)var4 / (double)2.0F;
                  } else {
                     double var28 = var19.field_1352 - var2.field_1352;
                     double var30 = var19.field_1351 - var2.field_1351;
                     double var32 = var19.field_1350 - var2.field_1350;
                     double var34 = Math.sqrt(var28 * var28 + var32 * var32);
                     double var36 = class_3532.method_15338(Math.toDegrees(Math.atan2(-var28, var32)) - Math.toDegrees((double)var5)) * Math.PI / (double)180.0F;
                     double var38 = -Math.atan2(var30, var34) - (double)var6;
                     boolean var40 = Math.abs(var36) < (Math.PI / 2D);
                     var24 = (var40 ? var36 / ((double)var8 / (double)2.0F) : (var36 >= (double)0.0F ? (double)1.0F : (double)-1.0F)) * (double)var10;
                     var26 = var38 / ((double)var7 / (double)2.0F) * (double)var11;
                  }

                  double var43 = Math.max(Math.abs(var24) / (double)var10, Math.abs(var26) / (double)var11);
                  if (var43 < 0.001) {
                     continue;
                  }

                  var22 = (float)((double)((float)var3 / 2.0F) + var24 / var43);
                  var23 = (float)((double)((float)var4 / 2.0F) + var26 / var43);
               }

               String var41 = (int)var17 + IliIlllilIi<invokedynamic>();
               byte var25 = 7;
               byte var42 = 5;
               byte var27 = 5;
               byte var44 = 5;
               int var29 = Math.round(var13.iIlIlllllill(var16.iiliiIliil));
               int var45 = Math.round(var13.iIlIlllllill(var41));
               int var31 = var25 + var42 + var27 + var29 + var44 + var45 + var25;
               int var46 = var14 + 8;
               int var33 = var46 / 2;
               int var47 = Math.round(ilIllIiIll(var22 - (float)var31 / 2.0F, 2.0F, (float)(var3 - var31) - 2.0F));
               int var35 = Math.round(ilIllIiIll(var23 - (float)var46 / 2.0F, 2.0F, (float)(var4 - var46) - 2.0F));
               IIIiiIillIIiiIil.lIiiIiIlilli(event.IIiIilIIIl, var47 - 1, var35 - 1, var31 + 2, var46 + 2, var33 + 1, 620756991);
               IIIiiIillIIiiIil.lIiiIiIlilli(event.IIiIilIIIl, var47, var35, var31, var46, var33, -670364398);
               IIIiiIillIIiiIil.lIiiIiIlilli(event.IIiIilIIIl, var47 + var25, var35 + (var46 - var42) / 2, var42, var42, 2, -16777216 | var16.IIiiiIliil & 16777215);
               int var48 = var47 + var25 + var42 + var27;
               int var37 = var13.IlIillIiilIi(var35, var46);
               var13.IliIlllilIi(var16.iiliiIliil, (float)var48, (float)var37, lIlililIIi);
               var13.IliIlllilIi(var41, (float)(var48 + var29 + var44), (float)var37, iIlililIIi);
            }

         }
      }
   }
}
