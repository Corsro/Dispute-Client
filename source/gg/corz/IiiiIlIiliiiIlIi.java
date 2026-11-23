package gg.corz;

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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_2246;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_243;
import net.minecraft.class_2818;
import net.minecraft.class_2826;
import net.minecraft.class_4587;
import net.minecraft.class_638;

public class IiiiIlIiliiiIlIi extends ilIllIiIll {
   private int lillIlIIIi;
   private int illlIlIIIi;
   private int llIlIlIIIi;
   private final List<class_2338> IiIlIlIIIi;
   private int IIilIlIIIi;
   private static final int ilIlIlIIIi = 12;
   private int IIllIlIIIi;
   private final iilliIlIIiliIl IiiIIlIIIi;
   private int iIllIlIIIi;
   private int IlllIlIIIi;
   private int IillIlIIIi;
   private final iilliIlIIiliIl iiiIIlIIIi;
   private int lIllIlIIIi;
   private static final int lliIIlIIIi = 6000;
   private int iillIlIIIi;
   private final iilliIlIIiliIl liiIIlIIIi;
   private final iilliIlIIiliIl IIIlIlIIIi;
   private int iIilIlIIIi;
   private boolean liIlIlIIIi;
   private static final int IliIIlIIIi = 8;
   private final IIIlIlIllIIlIlIl iliIIlIIIi;
   private final List<class_2338> IlIlIlIIIi;
   private int lIilIlIIIi;
   private final iilliIlIIiliIl lIIlIlIIIi;
   private final iiIiiilIIliiil iIIlIlIIIi;
   private int llllIlIIIi;
   private Set<class_2248> iiIlIlIIIi;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) << 9) ^ '諿') << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) << 9) ^ '諿') >>> 7) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) << 9) ^ '諿') << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 21819) - var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - 21819) - var5))) << 12) - var5) + 17291) ^ var5) + var5) >>> 6) ^ var5) << 9) ^ '諿') >>> 7) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null) {
         if (this.llIlIlIIIi > 0) {
            --this.llIlIlIIIi;
         }

         if (this.liIlIlIIIi) {
            this.lIIlliIIll();
         } else if (this.llIlIlIIIi <= 0) {
            this.llIlIlIIIi = 8;
            this.iiiIlIIIll();
            if (this.liIlIlIIIi) {
               this.lIIlliIIll();
            }

         }
      } else {
         this.liIlIlIIIi = false;
      }
   }

   protected void IIiilIiiiIii(illlllIillll event) {
      if (Iiiilllliiilll.field_1687 != null && !this.IlIlIlIIIi.isEmpty()) {
         class_243 var2 = llilllililll.IliIlllilIi();
         class_4587 var3 = event.IliiiIIilliiiIIi;
         var3.method_22903();
         var3.method_22904(-var2.field_1352, -var2.field_1351, -var2.field_1350);
         Color var4 = new Color(IIllllIlll(this.iiiIIlIIIi.Iilllilliill()), IIllllIlll(this.IIIlIlIIIi.Iilllilliill()), IIllllIlll(this.lIIlIlIIIi.Iilllilliill()), IIllllIlll(this.liiIIlIIIi.Iilllilliill()));
         Color var5 = new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), 255);
         boolean var6 = this.iIIlIlIIIi.Iilllilliill();
         int var7 = var5.getRGB();

         for(class_2338 var9 : this.IlIlIlIIIi) {
            llilllililll.Illillliilli(var3, (float)var9.method_10263() + 0.001F, (float)var9.method_10264() + 0.001F, (float)var9.method_10260() + 0.001F, (float)var9.method_10263() + 0.999F, (float)var9.method_10264() + 0.999F, (float)var9.method_10260() + 0.999F, var4);
            if (var6) {
               Iillllilll.IIlllIlliIll((double)var9.method_10263() + (double)0.5F, (double)var9.method_10264() + (double)0.5F, (double)var9.method_10260() + (double)0.5F, var7, 1.0F);
            }
         }

         var3.method_22909();
         iIiiIIilIliiIIil.IiIiliIiiiIi();
      }
   }

   private void iiiIlIIIll() {
      long var4 = -5159840349537010100L;
      Set var1 = this.liIlliiIll();
      if (var1.isEmpty()) {
         this.IlIlIlIIIi.clear();
      } else {
         var4 ^= ((long)this.IiiIIlIIIi.Iilllilliill() << 32 ^ var4) & -1L << 32;
         class_2338 var3 = Iiiilllliiilll.field_1724.method_24515();
         this.iiIlIlIIIi = var1;
         this.IIllIlIIIi = var3.method_10263() - (int)(var4 >>> 32);
         this.lIllIlIIIi = var3.method_10263() + (int)(var4 >>> 32);
         this.iIllIlIIIi = var3.method_10264() - (int)(var4 >>> 32);
         this.IlllIlIIIi = var3.method_10264() + (int)(var4 >>> 32);
         this.llllIlIIIi = var3.method_10260() - (int)(var4 >>> 32);
         this.illlIlIIIi = var3.method_10260() + (int)(var4 >>> 32);
         this.iillIlIIIi = this.IIllIlIIIi >> 4;
         this.IIilIlIIIi = this.lIllIlIIIi >> 4;
         this.lIilIlIIIi = this.llllIlIIIi >> 4;
         this.iIilIlIIIi = this.illlIlIIIi >> 4;
         this.IillIlIIIi = this.iillIlIIIi;
         this.lillIlIIIi = this.lIilIlIIIi;
         this.IiIlIlIIIi.clear();
         this.liIlIlIIIi = true;
      }
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)(~((char)(~var4[var5]))) - var5) >>> 13 | (char)((char)(~((char)(~var4[var5]))) - var5) << 3))))) - var5))) ^ var5)))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void ilIllIiIll() {
      this.liIlIlIIIi = false;
      this.IlIlIlIIIi.clear();
      this.IlIlIlIIIi.addAll(this.IiIlIlIIIi);
      this.IiIlIlIIIi.clear();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) - var5))) ^ var5) ^ var5))))) - '蹈'))) + 11573) + var5) + '諗') - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private int IlIllllIll(class_2818 chunk) {
      int var2 = 0;
      int var3 = chunk.method_12004().method_8326();
      int var4 = chunk.method_12004().method_8328();
      int var5 = Math.max(this.IIllIlIIIi, var3) & 15;
      int var6 = Math.min(this.lIllIlIIIi, var3 + 15) & 15;
      int var7 = Math.max(this.llllIlIIIi, var4) & 15;
      int var8 = Math.min(this.illlIlIIIi, var4 + 15) & 15;
      class_2826[] var9 = chunk.method_12006();
      int var10 = chunk.method_31607();

      for(int var11 = 0; var11 < var9.length; ++var11) {
         int var12 = var10 + (var11 << 4);
         if (var12 <= this.IlllIlIIIi && var12 + 15 >= this.iIllIlIIIi) {
            class_2826 var13 = var9[var11];
            if (var13 != null && !var13.method_38292() && var13.method_19523((st) -> this.iiIlIlIIIi.contains(st.method_26204()))) {
               ++var2;
               int var14 = Math.max(this.iIllIlIIIi, var12) & 15;
               int var15 = Math.min(this.IlllIlIIIi, var12 + 15) & 15;

               for(int var16 = var5; var16 <= var6; ++var16) {
                  for(int var17 = var14; var17 <= var15; ++var17) {
                     for(int var18 = var7; var18 <= var8; ++var18) {
                        if (this.iiIlIlIIIi.contains(var13.method_12254(var16, var17, var18).method_26204())) {
                           this.IiIlIlIIIi.add(new class_2338(var3 + var16, var12 + var17, var4 + var18));
                           if (this.IiIlIlIIIi.size() >= 6000) {
                              return var2;
                           }
                        }
                     }
                  }
               }
            }
         }
      }

      return var2;
   }

   public IiiiIlIiliiiIlIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.iliIIlIIIi = new IIIlIlIllIIlIlIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), List.of(class_1802.field_8787));
      this.IiiIIlIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 16, 1, 48);
      this.liiIIlIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 90, 1, 255);
      this.iiiIIlIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 0, 0, 255);
      this.IIIlIlIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 200, 0, 255);
      this.lIIlIlIIIi = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 255, 0, 255);
      this.iIIlIlIIIi = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      this.IlIlIlIIIi = new ArrayList();
      this.IiIlIlIIIi = new ArrayList();
      this.iiIlIlIIIi = Set.of();
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iliIIlIIIi, this.IiiIIlIIIi, this.liiIIlIIIi, this.iiiIIlIIIi, this.IIIlIlIIIi, this.lIIlIlIIIi, this.iIIlIlIIIi});
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] - 25747))) + var5) - var5))) ^ var5) - 6308) + 24873))) >>> 8 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] - 25747))) + var5) - var5))) ^ var5) - 6308) + 24873))) << 8) ^ 19798));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) ^ '荠'))) ^ var5) + '짠') + '\uee16') ^ var5) ^ 17083) ^ 30030) - var5))))) + var5) - var5) ^ '馓'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      this.IlIlIlIIIi.clear();
      this.IiIlIlIIIi.clear();
      this.liIlIlIIIi = false;
      this.llIlIlIIIi = 0;
   }

   private static int IIllllIlll(int v) {
      return Math.max(0, Math.min(-(~-1892946223) ^ -1892946387, v));
   }

   private void lIIlliIIll() {
      class_638 var1 = Iiiilllliiilll.field_1687;
      int var2 = 12;

      while(this.IillIlIIIi <= this.IIilIlIIIi) {
         if (var1.method_8393(this.IillIlIIIi, this.lillIlIIIi)) {
            class_2818 var3 = var1.method_8497(this.IillIlIIIi, this.lillIlIIIi);
            if (var3 != null) {
               var2 -= this.IlIllllIll(var3);
               if (this.IiIlIlIIIi.size() >= 6000) {
                  this.ilIllIiIll();
                  return;
               }
            }
         }

         if (++this.lillIlIIIi > this.iIilIlIIIi) {
            this.lillIlIIIi = this.lIilIlIIIi;
            ++this.IillIlIIIi;
         }

         if (var2 <= 0 && this.IillIlIIIi <= this.IIilIlIIIi) {
            return;
         }
      }

      this.ilIllIiIll();
   }

   private Set<class_2248> liIlliiIll() {
      HashSet var1 = new HashSet();

      for(class_1792 var3 : this.iliIIlIIIi.Iilllilliill()) {
         class_2248 var4 = class_2248.method_9503(var3);
         if (var4 != class_2246.field_10124) {
            var1.add(var4);
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 369418732941773820L ^ Long.rotateLeft(7830829467600243635L, 38) ^ 7702423471873413605L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5670663086483035575L ^ Long.rotateLeft(-7735168854033786883L, 42) ^ 7925767659826220708L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1992600098246145059L ^ Long.rotateLeft(2378411649066588845L, 40) ^ -6847214712336695398L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6925113952422191342L ^ Long.rotateLeft(4951599738320496845L, 59) ^ 545532166191836435L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5488791387467216100L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3592284590461263331L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6405305497792085638L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3583656082193630507L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1628001527756831991L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -784267907274141893L;
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
