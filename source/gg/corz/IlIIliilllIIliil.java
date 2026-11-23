package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1109;
import net.minecraft.class_1937;
import net.minecraft.class_2561;
import net.minecraft.class_2596;
import net.minecraft.class_2678;
import net.minecraft.class_2724;
import net.minecraft.class_2761;
import net.minecraft.class_3417;
import net.minecraft.class_6373;
import net.minecraft.class_638;
import net.minecraft.class_642;
import net.minecraft.class_8038;

public class IlIIliilllIIliil extends ilIllIiIll {
   private boolean lIillIilil;
   private final iiIiiilIIliiil IilllIilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   static final String IllllIilil = "Anticheat Back On";
   private final iiIiiilIIliiil lilllIilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private final iiIiiilIIliiil illllIilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   static final String iIlllIilil = "Anticheat Off";
   private final lIlIlIiiIlIlIi iilllIilil = new lIlIlIiiIlIlIi();
   private final Map<String, llIIlillilIIlill> IIillIilil = new HashMap();
   static final String lllllIilil = "Anticheat On";

   public IlIIliilllIIliil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.illllIilil, this.IilllIilil, this.lilllIilil});
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '농') + var5))) + var5) - var5) + '땠') ^ var5) - var5) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - '농') + var5))) + var5) - var5) + '땠') ^ var5) - var5) >>> 4) - '鼨'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null && Iiiilllliiilll.field_1687 != null && !Iiiilllliiilll.method_1542()) {
         liIIililiiIIilil var1 = this.iilllIilil.lIiiIiIlilli();
         if (var1 != liIIililiiIIilil.iiIliIIlil) {
            String var2 = this.lIIlliIIll();
            llIIlillilIIlill var3 = (llIIlillilIIlill)this.IIillIilil.put(var2, this.iilllIilil.IilliliilIIi());
            boolean var4 = this.lIillIilil;
            this.lIillIilil = false;
            if (var1 == liIIililiiIIilil.lIlliIIlil) {
               if (var3 != llIIlillilIIlill.ilIIiilill) {
                  this.IlIllllIll(true, IliIlllilIi<invokedynamic>(), var2, iiIIlllIIlIlll.IliIlllilIi());
               }
            } else if (var3 == llIIlillilIIlill.ilIIiilill) {
               if (this.illllIilil.Iilllilliill()) {
                  this.IlIllllIll(false, IliIlllilIi<invokedynamic>(), var2, iiIIlllIIlIlll.liiiIIllIl());
               }
            } else if (var4) {
               this.IlIllllIll(false, IliIlllilIi<invokedynamic>(), var2, iiIIlllIIlIlll.iIlIlllllill());
            }

         }
      }
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ '贞') ^ var5))) << 15 | (char)(-((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ '贞') ^ var5))) >>> 1) << 3 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ '贞') ^ var5))) << 15 | (char)(-((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ '贞') ^ var5))) >>> 1) >>> 13) ^ var5) + 24597) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Illillliilli() {
      this.iilllIilil.iIlIlllllill();
      this.IIillIilil.clear();
      this.lIillIilil = true;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ 'ﳙ') - 24268) + '鐬'))) - var5))) - var5) + var5) - 10013))) ^ 20159) - var5))) >>> 5 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] ^ 'ﳙ') - 24268) + '鐬'))) - var5))) - var5) + var5) - 10013))) ^ 20159) - var5))) << 11))))) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -716524542318014702L ^ Long.rotateLeft(-1184778917949247629L, 47) ^ -1452879396641910010L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7373978454955451984L ^ Long.rotateLeft(4764458673039325016L, 2) ^ -8026256453691737830L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7938981804146977327L ^ Long.rotateLeft(2728660009826980187L, 15) ^ -7956275946120335408L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5180540326564103131L ^ Long.rotateLeft(-3055835036389266877L, 60) ^ 7268952633093106861L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7104734733991389369L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4297341690665585262L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3453563623868015121L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -306106591213651522L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5161198964790339995L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1757877186202610970L;
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 25109) + 24560) << 13 | (char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 25109) + 24560) >>> 3))) ^ var5) << 8 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 25109) + 24560) << 13 | (char)((char)((char)(~((char)((char)(~var4[var5]) + var5))) + 25109) + 24560) >>> 3))) ^ var5) >>> 8) + var5))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) + 6358))) ^ 'ﰕ') + var5) << 5 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 4 | (char)(~var4[var5]) >>> 12) + 6358))) ^ 'ﰕ') + var5) >>> 11) - '鿂') - '\ud853'))))) - var5) ^ var5) + '헖') + var5) + var5) - var5) ^ '袌'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void Iilililiiili() {
      iiillilIIIilil.iIlIlllllill();
   }

   protected void IiIIlliIIl(IliIliIllliIliIl event) {
      class_2596 var3 = event.iilIIiiIll;
      if (var3 instanceof class_8038 var2) {
         for(class_2596 var4 : var2.method_48324()) {
            this.iiiIlIIIll(var4);
         }
      } else {
         this.iiiIlIIIll(event.iilIIiiIll);
      }

   }

   private String lIIlliIIll() {
      long var6 = 1664148467597082260L;
      class_638 var1 = Iiiilllliiilll.field_1687;
      var6 ^= ((long)lllIIIIiillIIIIi.iIlllIllll() << 32 ^ var6) & -1L << 32;
      String var3 = class_1937.field_25180.equals(var1.method_27983()) ? IliIlllilIi<invokedynamic>() : (class_1937.field_25181.equals(var1.method_27983()) ? IliIlllilIi<invokedynamic>() : null);
      if ((int)(var6 >>> 32) != 0) {
         if (var3 != null) {
            return var3;
         } else {
            String var8 = IIllllllIlllll.IliIlllilIi(Iiiilllliiilll.field_1724.method_23317(), Iiiilllliiilll.field_1724.method_23321());
            return var8 == null ? IliIlllilIi<invokedynamic>() : var8;
         }
      } else {
         class_642 var4 = Iiiilllliiilll.method_1558();
         String var5 = var4 == null ? IliIlllilIi<invokedynamic>() : (var4.field_3761 != null && !var4.field_3761.isBlank() ? var4.field_3761.trim() : var4.field_3752);
         return var3 == null ? var5 : var5 + IliIlllilIi<invokedynamic>() + var3;
      }
   }

   private void IlIllllIll(boolean line, String title, String place, String off) {
      iiillilIIIilil.IliIlllilIi(new iIiiIlllIliiIlll(title, place, off, line));
      if (this.IilllIilil.Iilllilliill()) {
         Iiiilllliiilll.method_1483().method_4873(class_1109.method_4757(class_3417.field_14561, line ? 1.15F : 0.8F, 1.0F));
      }

      if (this.lilllIilil.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1724.method_7353(class_2561.method_43470((line ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>()) + title + IliIlllilIi<invokedynamic>() + place + IliIlllilIi<invokedynamic>() + off), false);
      }

   }

   private void iiiIlIIIll(class_2596<?> p) {
      if (p instanceof class_6373) {
         this.iilllIilil.IliIlllilIi();
      } else if (p instanceof class_2761) {
         this.iilllIilil.liiiIIllIl();
      } else if (p instanceof class_2678 || p instanceof class_2724) {
         this.iilllIilil.iIlIlllllill();
      }

   }
}
