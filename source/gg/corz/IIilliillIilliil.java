package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_124;
import net.minecraft.class_2561;
import net.minecraft.class_5250;

public class IIilliillIilliil extends ilIllIiIll {
   private final iiIiiilIIliiil Illlliilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl llIlliilil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 2, 0, 15);
   private String illlliilil;
   private String Ililliilil;
   private final IIiiIIIllIiiIIIl liIlliilil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private final iilliIlIIiliIl lIllliilil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 5, 0, 15);
   private static final String[] iiiIliilil = new String[]{IliIlllilIi<invokedynamic>()};
   private final iilliIlIIiliIl iiIlliilil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 4, 0, 15);
   private final iilliIlIIiliIl IiIlliilil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 3, 0, 15);
   private static final String[] iliIliilil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private int lillliilil;
   private final iiIiiilIIliiil llllliilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private int iillliilil;
   private double iIilliilil;
   private String IIilliilil;
   private static final Pattern lliIliilil = Pattern.compile(IliIlllilIi<invokedynamic>());
   private static final String[] liiIliilil = new String[]{IliIlllilIi<invokedynamic>()};
   private static final String[] IIIlliilil = new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()};
   private final IIiiIIIllIiiIIIl IIllliilil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private final IIiiIIIllIiiIIIl ilIlliilil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private final IIiiIIIllIiiIIIl IlIlliilil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), "");
   private final IIiiIIIllIiiIIIl lIIlliilil = new IIiiIIIllIiiIIIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());
   private final iiIiiilIIliiil iIllliilil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iilliIlIIiliIl iIIlliilil = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 1, 0, 15);
   private String lIilliilil;
   private double Iillliilil;
   private static final String[] IiiIliilil = new String[]{IliIlllilIi<invokedynamic>()};

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) << 15) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) << 15) << 3))) + var5))))) + 5180) >>> 9 | (char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) << 15) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) >>> 1 | (char)(-((char)(var4[var5] << 3 | var4[var5] >>> 13))) << 15) + 'ꢚ') - 18650) ^ var5) ^ 9882) - var5) + var5) - var5) << 15) << 3))) + var5))))) + 5180) << 7))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1223472761200062597L ^ Long.rotateLeft(4628586456338940820L, 61) ^ -9174532231273688509L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5597545485957169264L ^ Long.rotateLeft(3481052511592494668L, 18) ^ -5650884342648663928L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7170408428460349167L ^ Long.rotateLeft(8368933854106644451L, 40) ^ -1425415744259927395L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -161012168121187262L ^ Long.rotateLeft(4536394462458942820L, 56) ^ 7288156366063230374L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5819812347968522025L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2399209866078431681L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -253427177885661649L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3492573562514371966L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8476708371207252652L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -691005837386162894L;
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

   private static String IIIillIIil(String s) {
      return s == null ? "" : (s.indexOf(2039797761 * 43 - 117 ^ 1811957521) < 0 ? s : lliIliilil.matcher(s).replaceAll(""));
   }

   private String Ilillllill(String text) {
      if (text != this.IIilliilil) {
         this.lIilliilil = text.toLowerCase(Locale.ROOT);
         this.IIilliilil = text;
      }

      return this.lIilliilil;
   }

   private void iiiIlIIIll() {
      String var1 = this.lIIlliilil.Iilllilliill();
      if (!Objects.equals(var1, this.illlliilil)) {
         this.illlliilil = var1;
         double var2 = Iiiiililiiiili.IliIlllilIi(var1);
         this.Iillliilil = Double.isNaN(var2) ? (double)0.0F : Math.max((double)0.0F, var2);
      }

   }

   public double lIIlliIIll() {
      this.iiiIlIIIll();
      return this.Iillliilil;
   }

   private String iilllIIill() {
      double var1 = this.lIIlliIIll();
      if (this.Ililliilil == null || Double.compare(var1, this.iIilliilil) != 0) {
         this.Ililliilil = Iiiiililiiiili.liiiIIllIl(var1);
         this.iIilliilil = var1;
      }

      return this.Ililliilil;
   }

   public boolean liilliiill(String command) {
      if (this.IliIlllilIi() && this.Illlliilil.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         String[] var2 = command.trim().split(IliIlllilIi<invokedynamic>());
         if (var2.length == 0) {
            return false;
         } else {
            String var3 = var2[0];
            if (var3.startsWith(IliIlllilIi<invokedynamic>())) {
               var3 = var3.substring(1);
            }

            if (!var3.equalsIgnoreCase(IliIlllilIi<invokedynamic>()) && !var3.equalsIgnoreCase(IliIlllilIi<invokedynamic>())) {
               return false;
            } else if (var2.length >= (~(~-2137904420 * -1047552999) * 29 ^ 1316216774) && !var2[1].equalsIgnoreCase(Iiiilllliiilll.field_1724.method_5477().getString())) {
               return false;
            } else {
               String var4 = Iiiiililiiiili.liiiIIllIl(this.lIIlliIIll());
               class_5250 var5 = class_2561.method_43473().method_10852(class_2561.method_43470(IliIlllilIi<invokedynamic>()).method_27692(class_124.field_1080)).method_10852(class_2561.method_43470(var4).method_27692(class_124.field_1060));
               Iiiilllliiilll.field_1724.method_7353(var5, false);
               Iiiilllliiilll.field_1724.method_7353(var5, true);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   private class_2561 lllllillll(class_2561 comp, boolean widthPass) {
      long var5 = -2517265172662888020L;
      if (this.IliIlllilIi() && this.iIllliilil.Iilllilliill()) {
         String var3 = IIIillIIil(comp.getString());
         if (var3.isBlank()) {
            return comp;
         } else {
            int var10000;
            if (widthPass) {
               int var10002 = this.lillliilil;
               var10000 = var10002;
               this.lillliilil = var10002 + 1;
            } else {
               int var8 = this.iillliilil;
               var10000 = var8;
               this.iillliilil = var8 + 1;
            }

            var5 ^= ((long)var10000 << 32 ^ var5) & -1L << 32;
            return this.Iillllilll((int)(var5 >>> 32), var3, comp);
         }
      } else {
         return comp;
      }
   }

   public class_2561 IIllllIlll(class_2561 comp) {
      return this.lllllillll(comp, true);
   }

   private boolean lIilliIill(int line, int configured, String keys, String[] text) {
      if (line > 0) {
         return configured + 1 == line;
      } else {
         return ilillIiill(this.Ilillllill(keys), text);
      }
   }

   private static boolean ilillIiill(String keys, String[] haystack) {
      for(String var5 : haystack) {
         if (keys.contains(var5)) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) << 12 | (char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) >>> 4) - var5))))))))))) >>> 4 | (char)(~((char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) << 12 | (char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) >>> 4) - var5))))))))))) << 12) >>> 13 | (char)((char)(~((char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) << 12 | (char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) >>> 4) - var5))))))))))) >>> 4 | (char)(~((char)(~((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) << 12 | (char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) - var5))) - var5) >>> 4) - var5))))))))))) << 12) << 3));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) >>> 15) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) >>> 15) >>> 4) + '슋') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) >>> 15) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) << 5 | (char)((char)((char)((char)(~var4[var5]) + '첶') + 28305) + var5) >>> 11) + 18400) + var5) ^ 7673) + var5) >>> 9) >>> 15) >>> 4) + '슋') >>> 14) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIilliillIilliil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.iIIlIIIiIlIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIIlliilil, this.iIIlliilil, this.IlIlliilil, this.llIlliilil, this.ilIlliilil, this.IiIlliilil, this.liIlliilil, this.iiIlliilil, this.IIllliilil, this.lIllliilil, this.iIllliilil, this.Illlliilil, this.llllliilil});
   }

   public void liIlliiIll() {
      this.lillliilil = 0;
      this.iillliilil = 0;
   }

   public void IlIllllIll(double amount) {
      this.iiiIlIIIll();
      this.Iillliilil = Math.max((double)0.0F, this.Iillliilil - Math.max((double)0.0F, amount));
   }

   private class_2561 Iillllilll(int line, String comp, class_2561 text) {
      if (!this.lIIlliilil.Iilllilliill().isBlank() && this.lIilliIill(this.iIIlliilil.Iilllilliill(), line, comp, iliIliilil)) {
         return Iiiiililiiiili.IIIllIIliIIl(text, this.iilllIIill());
      } else if (!this.IlIlliilil.Iilllilliill().isBlank() && this.lIilliIill(this.llIlliilil.Iilllilliill(), line, comp, IiiIliilil)) {
         return Iiiiililiiiili.IIIllIIliIIl(text, this.IlIlliilil.Iilllilliill().trim());
      } else if (!this.ilIlliilil.Iilllilliill().isBlank() && this.lIilliIill(this.IiIlliilil.Iilllilliill(), line, comp, liiIliilil)) {
         return Iiiiililiiiili.IIIllIIliIIl(text, this.ilIlliilil.Iilllilliill().trim());
      } else if (!this.liIlliilil.Iilllilliill().isBlank() && this.lIilliIill(this.iiIlliilil.Iilllilliill(), line, comp, iiiIliilil)) {
         return Iiiiililiiiili.IIIllIIliIIl(text, this.liIlliilil.Iilllilliill().trim());
      } else {
         return !this.IIllliilil.Iilllilliill().isBlank() && this.lIilliIill(this.lIllliilil.Iilllilliill(), line, comp, IIIlliilil) ? Iiiiililiiiili.IlIlllIlilIl(text, this.IIllliilil.Iilllilliill().trim()) : text;
      }
   }

   public boolean ilIllIiIll() {
      return this.llllliilil.Iilllilliill();
   }

   protected void Illillliilli() {
      this.illlliilil = null;
      this.iiiIlIIIll();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ 'ꮡ') - '뱞'))) ^ var5) << 7 | (char)((char)(~((char)((char)((char)((char)(-var4[var5]) ^ var5) ^ 'ꮡ') - '뱞'))) ^ var5) >>> 9) + 1656))) - var5) ^ 4979))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public class_2561 iIlllIllll(class_2561 comp) {
      return this.lllllillll(comp, false);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) << 11 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) >>> 5) << 2 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) << 11 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) >>> 5) >>> 14) + var5) - '\ueec8') + '\udc33') + 32577) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) << 11 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) >>> 5) << 2 | (char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) << 11 | (char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + var5) >>> 5) >>> 14) + var5) - '\ueec8') + '\udc33') + 32577) << 13) ^ var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
