package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_243;
import net.minecraft.class_310;

public class liIlliiiIlli extends ilIllIiIll {
   private final lliliIIiililiIIi IIIiiiIIllIIiiiIIl;
   private static final String[] liiliiIIliiiliiIIl = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private final iiIiiilIIliiil liliiiIIliiliiiIIl;
   private final iiIiiilIIliiil lIliiiIIliIliiiIIl;
   private final iiIiiilIIliiil illiiiIIlIiliiiIIl;
   private final iilliIlIIiliIl llIiiiIIlilIiiiIIl;
   private final iliiliilIiiiliil iiIiiiIIlIIliiiIIl;
   private final iilliIlIIiliIl IiIiiiIIlliIiiiIIl;
   private final iilliIlIIiliIl iIIiiiIIlIlIiiiIIl;
   private float iIiiiiIIlIliiiiIIl;
   private final ililliIiIiilliIi IIiiiiIIllIiiiiIIl;
   private final iiIiiilIIliiil IlliiiIIlllliiiIIl;
   private long lliiiiIIliliiiiIIl;

   public void Iliilliiilii(lIiIlliiIiIlli event) {
      if (Iiiilllliiilll.field_1724 != null) {
         if (Iiiilllliiilll.field_1755 == null) {
            if (!Iiiilllliiilll.field_1690.field_1842) {
               if (Iiiilllliiilll.field_1690.method_31044().method_31034() || lilIliIiiilIliIi.lIIlliIIll()) {
                  if (!Iiiilllliiilll.method_53526().method_53536()) {
                     float var2 = (float)Iiiilllliiilll.method_22683().method_4486() / 2.0F;
                     float var3 = (float)Iiiilllliiilll.method_22683().method_4502() / 2.0F;
                     this.lIIlliIIll(var2, var3, 1.0F, this.Illillllil());
                  }
               }
            }
         }
      }
   }

   public iilliIlIIiliIl iilllIIill() {
      return this.iIIiiiIIlIlIiiiIIl;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3))) - 26016) ^ '集') + var5) >>> 7 | (char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) << 13 | (char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 3))) - 26016) ^ '集') + var5) << 9) ^ 29559) ^ 11391) - 9104)));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - '\udbe0') - '쩃') ^ var5) + 19475) ^ var5) - 25710) - '難') ^ 19404))) >>> 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - '\udbe0') - '쩃') ^ var5) + 19475) ^ var5) - 25710) - '難') ^ 19404))) << 13) ^ '렍') - '\udd69') << 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - '\udbe0') - '쩃') ^ var5) + 19475) ^ var5) - 25710) - '難') ^ 19404))) >>> 3 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) - '\udbe0') - '쩃') ^ var5) + 19475) ^ var5) - 25710) - '難') ^ 19404))) << 13) ^ '렍') - '\udd69') >>> 8))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIllllIll(String cx, float spreadPx, float styleName, float cy, float scale) {
      iiiIiIlIIIliIl var6 = new iiiIiIlIIIliIl(spreadPx, styleName, this.iiIiiiIIlIIliiiIIl.Iilllilliill(), this.lIliiiIIliIliiiIIl.Iilllilliill(), this.illiiiIIlIiliiiIIl.Iilllilliill(), this.IlliiiIIlllliiiIIl.Iilllilliill(), false);
      this.llIililIil(var6, cx, cy, scale);
      var6.Iilllilliill();
   }

   private void llIililIil(iiiIiIlIIIliIl r, String styleName, float s, float spread) {
      float var5 = (float)this.iIIiiiIIlIlIiiiIIl.Iilllilliill() * s;
      float var6 = (float)this.llIiiiIIlilIiiiIIl.Iilllilliill() * s + spread;
      float var7 = (float)this.IiIiiiIIlliIiiiIIl.Iilllilliill() * s;
      float var8 = Math.max(1.0F, var7 * 0.5F);
      float var9 = Math.max(1.0F, var7 * 0.6F);
      boolean var10 = this.IlliiiIIlllliiiIIl.Iilllilliill();
      String var11 = styleName == null ? "" : styleName;
      byte var12 = -1;
      switch (var11.hashCode()) {
         case -1887427045:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 13;
            }
            break;
         case -1328042060:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 1;
            }
            break;
         case -975259340:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 10;
            }
            break;
         case 84:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 6;
            }
            break;
         case 88:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 5;
            }
            break;
         case 66987:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 11;
            }
            break;
         case 68905:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 0;
            }
            break;
         case 84363:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 9;
            }
            break;
         case 2049153:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 8;
            }
            break;
         case 2241628:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 4;
            }
            break;
         case 2547280:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 2;
            }
            break;
         case 29314283:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 7;
            }
            break;
         case 79711796:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 12;
            }
            break;
         case 872645092:
            if (var11.equals(IliIlllilIi<invokedynamic>())) {
               var12 = 3;
            }
      }

      switch (var12) {
         case 0:
            r.lIiiIiIlilli(Math.max(1.0F, var7 * 0.8F));
            break;
         case 1:
            IiIilliIil(r, var6, var5, var7);
            r.lIiiIiIlilli(Math.max(1.0F, var7 * 0.7F));
            break;
         case 2:
            r.iliIiiliiiii(var6 + var5 * 0.7F, var8);
            break;
         case 3:
            r.iliIiiliiiii(var6 + var5 * 0.7F, var8);
            r.lIiiIiIlilli(var9);
            break;
         case 4:
            float var21 = var6 + var5 * 0.6F;
            r.iliIiiliiiii(var21, var8);
            float var25 = var21 + Math.max(1.0F, var7 * 0.75F);

            for(int var26 = 0; var26 < 4; ++var26) {
               r.iIlIlllllill((float)var26 * 90.0F, var25, var25 + var5 * 0.6F, var7);
            }
            break;
         case 5:
            for(int var20 = 0; var20 < 4; ++var20) {
               r.iIlIlllllill(45.0F + (float)var20 * 90.0F, var6, var6 + var5, var7);
            }
            break;
         case 6:
            r.iIlIlllllill(0.0F, var6, var6 + var5, var7);
            r.iIlIlllllill(90.0F, var6, var6 + var5, var7);
            r.iIlIlllllill(180.0F, var6, var6 + var5, var7);
            break;
         case 7:
            iiIilIIlil(r, var6 + var5, Math.max(var7, var5 * 0.7F), var7);
            r.lIiiIiIlilli(var9);
            break;
         case 8:
            float var19 = var6 + var5 * 0.7F;

            for(int var24 = 0; var24 < 4; ++var24) {
               r.IIIllIIliIIl(var19, var8, 45.0F + (float)var24 * 90.0F, 50.0F);
            }

            r.lIiiIiIlilli(var9);
            break;
         case 9:
            float var18 = var6 + var5 * 0.6F;
            float var23 = Math.max(1.5F, var5 * 0.4F);
            r.IiIlliIliiIl(-90.0F, var18, var23);
            r.IiIlliIliiIl(30.0F, var18, var23);
            r.IiIlliIliiIl(150.0F, var18, var23);
            break;
         case 10:
            r.IlIlllIlilIl(var6 + var5 * 0.55F, var8, 45.0F, var10 ? var8 : 0.0F);
            r.lIiiIiIlilli(var9);
            break;
         case 11:
            r.IlIlllIlilIl(var6 + var5 * 0.5F, var8, 0.0F, var10 ? var8 * 1.5F : 0.0F);
            r.lIiiIiIlilli(var9);
            break;
         case 12:
            float var17 = var6 + var5 * 0.8F;
            r.iliIiiliiiii(var17, Math.max(1.0F, var7 * 0.4F));
            float var22 = var17 + Math.max(1.0F, var7 * 0.5F);
            float var15 = Math.max(0.5F, var7 * 0.35F);

            for(int var16 = 0; var16 < 4; ++var16) {
               r.iIlIlllllill((float)var16 * 90.0F, var22, var22 + var5 * 1.4F, var15);
            }

            r.lIiiIiIlilli(Math.max(1.0F, var7 * 0.5F));
            break;
         case 13:
            float var13 = var6 + var7 * 0.5F;
            float var14 = var5 * 0.9F;
            r.IilliliilIIi(0.0F, var13, -var14, var13 + var14, var7);
            r.IilliliilIIi(0.0F, var13, var14, var13 + var14, var7);
            break;
         default:
            IiIilliIil(r, var6, var5, var7);
      }

   }

   public iiIiiilIIliiil liilliiill() {
      return this.IlliiiIIlllliiiIIl;
   }

   private float Illillllil() {
      long var1 = System.nanoTime();
      float var3 = this.lliiiiIIliliiiiIIl == 0L ? 0.016F : Math.min(0.1F, (float)(var1 - this.lliiiiIIliliiiiIIl) / 1.0E9F);
      this.lliiiiIIliliiiiIIl = var1;
      if (!this.liliiiIIliiliiiIIl.Iilllilliill()) {
         this.iIiiiiIIlIliiiiIIl = 0.0F;
         return 0.0F;
      } else {
         class_243 var4 = Iiiilllliiilll.field_1724.method_18798();
         double var5 = Math.hypot(var4.field_1352, var4.field_1350);
         float var7 = var5 > 0.03 ? (float)Math.min((double)1.0F, var5 / 0.26) : 0.0F;
         if (!Iiiilllliiilll.field_1724.method_24828()) {
            var7 = Math.max(var7, 0.7F);
         }

         this.iIiiiiIIlIliiiiIIl += (var7 - this.iIiiiiIIlIliiiiIIl) * (1.0F - (float)Math.exp((double)(-var3 * 14.0F)));
         if (Math.abs(this.iIiiiiIIlIliiiiIIl) < 0.002F) {
            this.iIiiiiIIlIliiiiIIl = 0.0F;
         }

         return this.IIllllIlll(this.iIiiiiIIlIliiiiIIl);
      }
   }

   public iiIiiilIIliiil IIIillIIil() {
      return this.illiiiIIlIiliiiIIl;
   }

   public List<String> iIlllIllll() {
      return this.IIIiiiIIllIIiiiIIl.IiIiliIiiiIi();
   }

   public void lIIlliIIll(float scale, float cx, float spreadPx, float cy) {
      this.IlIllllIll(this.IIIiiiIIllIIiiiIIl.Iilllilliill(), scale, cx, spreadPx, cy);
   }

   public iiIiiilIIliiil iIIilIlIil() {
      return this.liliiiIIliiliiiIIl;
   }

   public static boolean lIliliIlil() {
      liIlliiiIlli var0 = (liIlliiiIlli)llilIllililIll.iliIiiliiiii(liIlliiiIlli.class);
      return var0 != null && var0.IliIlllilIi();
   }

   public iilliIlIIiliIl Ilillllill() {
      return this.IiIiiiIIlliIiiiIIl;
   }

   public float IIllllIlll(float amount) {
      return amount * (2.0F + (float)this.iIIiiiIIlIlIiiiIIl.Iilllilliill() * 0.5F);
   }

   public iilliIlIIiliIl lIilliIill() {
      return this.llIiiiIIlilIiiiIIl;
   }

   public liIlliiiIlli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IIIiiiIIllIIiiiIIl = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), liiliiIIliiiliiIIl);
      this.iIIiiiIIlIlIiiiIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 5, 1, 20);
      this.llIiiiIIlilIiiiIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2, 0, 10);
      this.IiIiiiIIlliIiiiIIl = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2, 1, 6);
      this.iiIiiiIIlIIliiiIIl = new iliiliilIiiiliil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), -1);
      this.lIliiiIIliIliiiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
      this.IlliiiIIlllliiiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.illiiiIIlIiliiiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.liliiiIIliiliiiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.IIiiiiIIllIiiiiIIl = new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::iiiIlIIIll);
      this.IIIiiiIIllIIiiiIIl.lIiiIiIlilli();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIiiiIIllIIiiiIIl, this.iIIiiiIIlIlIiiiIIl, this.llIiiiIIlilIiiiIIl, this.IiIiiiIIlliIiiiIIl, this.iiIiiiIIlIIliiiIIl, this.lIliiiIIliIliiiIIl, this.IlliiiIIlllliiiIIl, this.illiiiIIlIiliiiIIl, this.liliiiIIliiliiiIIl, this.IIiiiiIIllIiiiiIIl});
   }

   public iiIiiilIIliiil ilillIiill() {
      return this.lIliiiIIliIliiiIIl;
   }

   private static void IiIilliIil(iiiIiIlIIIliIl L, float g, float r, float t) {
      for(int var4 = 0; var4 < 4; ++var4) {
         L.iIlIlllllill((float)var4 * 90.0F, g, g + r, t);
      }

   }

   public void Iillllilll(int index) {
      if (index >= 0 && index < this.IIIiiiIIllIIiiiIIl.IiIiliIiiiIi().size()) {
         this.IIIiiiIIllIIiiiIIl.Iiilliiliiil(index);
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) + var5) << 4 | (char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) + var5) >>> 12) >>> 12 | (char)((char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) + var5) << 4 | (char)((char)((char)((char)(~var4[var5]) ^ var5) - var5) + var5) >>> 12) << 4) ^ 32645) ^ 23773))) ^ '렳') + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) >>> 12 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) << 4))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) >>> 12 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) << 4))) << 14) - '납') - 24821) + 32694) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) >>> 12 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) << 4))) >>> 2 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) >>> 12 | (char)((char)((char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) >>> 8 | (char)((char)(-((char)((char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) >>> 4 | (char)(-((char)(~((char)(~((char)(var4[var5] >>> 3 | var4[var5] << 13))))))) << 12))) ^ var5) << 8) - 22813) << 4))) << 14) - '납') - 24821) + 32694) << 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 930203031208799030L ^ Long.rotateLeft(-4886149848470790512L, 52) ^ 4097494008038875836L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5405008144343474884L ^ Long.rotateLeft(623713269891055343L, 26) ^ -4046221495472430382L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -850557695972573577L ^ Long.rotateLeft(-4547664794293177291L, 8) ^ -6579329988007478021L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2829869044348832063L ^ Long.rotateLeft(-6042994166732288699L, 59) ^ 3008936740226195721L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -385148877376624365L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5019605925334596598L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2246421165407652379L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 595828287350199247L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7754646357468901744L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6854654434353477390L;
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

   public int lllllillll() {
      return this.IIIiiiIIllIIiiiIIl.Ililllililil();
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\udeca') << 9 | (char)((char)(-var4[var5]) - '\udeca') >>> 7) + var5) >>> 9 | (char)((char)((char)((char)(-var4[var5]) - '\udeca') << 9 | (char)((char)(-var4[var5]) - '\udeca') >>> 7) + var5) << 7)) + 2926) ^ var5)) ^ var5) - 'ꦱ') ^ var5) ^ '駨') + 15669) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\udeca') << 9 | (char)((char)(-var4[var5]) - '\udeca') >>> 7) + var5) >>> 9 | (char)((char)((char)((char)(-var4[var5]) - '\udeca') << 9 | (char)((char)(-var4[var5]) - '\udeca') >>> 7) + var5) << 7)) + 2926) ^ var5)) ^ var5) - 'ꦱ') ^ var5) ^ '駨') + 15669) >>> 9))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void iiIilIIlil(iiiIiIlIIIliIl D, float leg, float r, float t) {
      float var4 = t / 2.0F;

      for(int var5 = -1; var5 <= 1; var5 += 2) {
         for(int var6 = -1; var6 <= 1; var6 += 2) {
            D.liiiIIllIl((float)var5 * (leg - r), (float)var6 * leg - var4, (float)var5 * leg, (float)var6 * leg + var4);
            D.liiiIIllIl((float)var5 * leg - var4, (float)var6 * (leg - r), (float)var5 * leg + var4, (float)var6 * (leg - var4));
         }
      }

   }

   public float ilIllIiIll(String styleName) {
      iiiIiIlIIIliIl var2 = new iiiIiIlIIIliIl(0.0F, 0.0F, this.iiIiiiIIlIIliiiIIl.Iilllilliill(), this.lIliiiIIliIliiiIIl.Iilllilliill(), this.illiiiIIlIiliiiIIl.Iilllilliill(), this.IlliiiIIlllliiiIIl.Iilllilliill(), true);
      this.llIililIil(var2, styleName, 1.0F, 0.0F);
      return Math.max(1.0F, var2.IliIlllilIi());
   }

   private void iiiIlIIIll() {
      class_310 var1 = class_310.method_1551();
      var1.method_1507(new llIlllllilIlllll(var1.field_1755, this));
   }

   public int liIlliiIll() {
      long var2 = -7615429116894922813L;
      var2 ^= ((long)((this.iIIiiiIIlIlIiiiIIl.Iilllilliill() * (-(1013269298 << 9 | 1013269298 >>> 23) ^ 897162135) + this.llIiiiIIlilIiiiIIl.Iilllilliill()) * (((1190915295 + 65 ^ 75) >>> 5 | (1190915295 + 65 ^ 75) << 27) ^ 1513611124) + this.IiIiiiIIlliIiiiIIl.Iilllilliill()) << 32 ^ var2) & -1L << 32;
      return (int)(var2 >>> 32) * ((-1636043720 - 89 >>> 27 | -1636043720 - 89 << 5) + -107 ^ -813794432) + (this.lIliiiIIliIliiiIIl.Iilllilliill() ? 4 : 0) + (this.illiiiIIlIiliiiIIl.Iilllilliill() ? 2 : 0) + (this.IlliiiIIlllliiiIIl.Iilllilliill() ? 1 : 0);
   }
}
