package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_2960;
import net.minecraft.class_4587;
import net.minecraft.class_4588;
import net.minecraft.class_4608;

public final class IIIiIllllIIiIlll {
   final float[] IlIiiIIill;
   final int[] llIiiIIill;
   public static final class_2960 ililiIIill = class_2960.method_60655(Illillliilli<invokedynamic>(), Illillliilli<invokedynamic>());
   private static class_1921 iiiliIIill;
   final int[] ilIiiIIill;
   private static final Map<String, IIIiIllllIIiIlll> IiiliIIill = new ConcurrentHashMap();
   final int[] IiIiiIIill;
   public static final int lliliIIill = 826691147;
   private static final Set<String> liiliIIill = ConcurrentHashMap.newKeySet();
   final float[] lIIiiIIill;
   final lIillIiiIillIi IIIiiIIill;
   final float[] iIIiiIIill;

   public static class_1921 Iilllilliill(class_2960 texture) {
      return class_12249.method_75994(texture);
   }

   public void Ililllililil(class_4587.class_4665 light, class_4588 overlay, int vc, int e) {
      for(int var5 = 0; var5 < this.IiIiiIIill.length; ++var5) {
         int var6 = this.IiIiiIIill[var5];
         overlay.method_56824(light, this.lIIiiIIill[var6 * 3], this.lIIiiIIill[var6 * 3 + 1], this.lIIiiIIill[var6 * 3 + 2]).method_39415(this.llIiiIIill[var6]).method_22913(this.IlIiiIIill[var6 * 2], this.IlIiiIIill[var6 * 2 + 1]).method_22922(e).method_60803(vc).method_60831(light, this.iIIiiIIill[var6 * 3], this.iIIiiIIill[var6 * 3 + 1], this.iIIiiIIill[var6 * 3 + 2]);
      }

   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') >>> 8) >>> 3 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') >>> 8) << 13) ^ var5))) + var5) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') >>> 8) >>> 3 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') << 8 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) >>> 8 | (char)((char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) << 4 | (char)(~((char)((char)((char)(var4[var5] - '蟸') + 12970) - var5))) >>> 12) << 8) ^ '\udecd') ^ '\ue4a7') >>> 8) << 13) ^ var5))) + var5) << 4) ^ 29846) - '遄'))) ^ 21025));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - '옪') ^ '靚') >>> 6 | (char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - '옪') ^ '靚') << 10) - '\uf285') ^ var5) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - '옪') ^ '靚') >>> 6 | (char)((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - '옪') ^ '靚') << 10) - '\uf285') ^ var5) ^ var5) >>> 15) - var5) + '耴') ^ 20118) + 14652)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iiilliiliiil(iIiiliIiIliiliIi skin) {
      return skin != null && skin.IiilIiiIIi.length == this.IiIiiIIill.length && skin.ililIiiIIi.length == this.IiIiiIIill.length * 2 && skin.iiilIiiIIi.length == skin.liilIiiIIi.length * ((((-1644155584 << 19 | -1644155584 >>> 13) >>> 25 | (-1644155584 << 19 | -1644155584 >>> 13) << 7) ^ 35) + -13 ^ 41418881);
   }

   public static IIIiIllllIIiIlll iliIiiliiiii(String model) {
      IIIiIllllIIiIlll var1 = (IIIiIllllIIiIlll)IiiliIIill.get(model);
      if (var1 == null) {
         IlIlllIlilIl(model);
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) << 8) - var5) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) << 8) - var5) << 9) + '讕') >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) << 8) - var5) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '鳃') - var5) << 8) - var5) << 9) + '讕') << 12))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IIIiIllllIIiIlll(lIillIiiIillIi data) {
      this.IIIiiIIill = data;
      this.lIIiiIIill = data.IIiIliIiilIiIliIii;
      this.iIIiiIIill = data.iIiIliIiiIliIliIii;
      this.IlIiiIIill = data.lliIliIiiiliIliIii;
      this.llIiiIIill = data.IiiIliIiiliiIliIii;
      this.ilIiiIIill = data.iiiIliIiiIIIlliIii;
      this.IiIiiIIill = data.lIIlliIiiiIIlliIii;
   }

   public static class_1921 IIillIiliIil(class_2960 texture) {
      return class_12249.method_76014(texture);
   }

   public static class_1921 Illlllllilll() {
      if (iiiliIIill == null) {
         iiiliIIill = class_12249.method_75994(ililiIIill);
      }

      return iiiliIIill;
   }

   public void IlIillIiilIi(class_4587.class_4665 e, class_4588 vc, iIiiliIiIliiliIi skin) {
      if (skin != null) {
         int[] var4 = skin.liilIiiIIi;
         float[] var5 = skin.iiilIiiIIi;

         for(int var6 = 0; var6 < var4.length; ++var6) {
            int var7 = var4[var6] * 4;
            if (var7 + 3 >= this.IiIiiIIill.length) {
               return;
            }

            for(int var8 = 0; var8 < 4; ++var8) {
               this.IiIiliIiiiIi(e, vc, this.IiIiiIIill[var7 + var8], var5, (var6 * 4 + var8) * 2);
            }

            for(int var9 = 3; var9 >= 0; --var9) {
               this.IiIiliIiiiIi(e, vc, this.IiIiiIIill[var7 + var9], var5, (var6 * 4 + var9) * 2);
            }
         }

      }
   }

   public int IliIlllilIi() {
      return this.llIiiIIill.length;
   }

   public int iIlIlllllill() {
      return this.IiIiiIIill.length / 4;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7444778127830220703L ^ Long.rotateLeft(-1087022981276616256L, 22) ^ -741296293051727612L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3582081967480231622L ^ Long.rotateLeft(-4808406042634266719L, 54) ^ -1437937755745884486L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7331239441430571137L ^ Long.rotateLeft(-7146391673192302749L, 11) ^ -3855906107655483414L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6280439453240260569L ^ Long.rotateLeft(-471362422614510096L, 11) ^ -7233549213621706053L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -9102344655834605232L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8586295336234372191L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5914895880044465152L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8965749519745980859L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1965633880645231165L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2065355324063775616L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilililiiili<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIiilIiiiIii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iliilliiilii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiiiliiiiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIIllIIIl<invokedynamic>());
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

   public static void IlIlllIlilIl(String model) {
      if (liiliIIill.add(model)) {
         CompletableFuture.runAsync(() -> {
            IIIiIllllIIiIlll var1 = IIlllIlliIll(model);
            if (var1 != null) {
               IiiliIIill.put(model, var1);
            }

         });
      }
   }

   static IIIiIllllIIiIlll IIlllIlliIll(String model) {
      lIillIiiIillIi var1 = lIillIiiIillIi.lIiiIiIlilli(model);
      return var1 == null ? null : new IIIiIllllIIiIlll(var1);
   }

   public static void IiIlliIliiIl() {
      for(illIIlllIilIIlll var3 : new illIIlllIilIIlll[]{illIIlllIilIIlll.ilIIIIIill, illIIlllIilIIlll.IiIIIIIill, illIIlllIilIIlll.liIIIIIill, illIIlllIilIIlll.iiIIIIIill}) {
         for(int var4 = 0; var4 < var3.IlIlllIlilIl(); ++var4) {
            IlIlllIlilIl(var3.IiIlliIliiIl(var4).IliIlllilIi());
         }
      }

   }

   public static boolean IIIllIIliIIl(illIIlllIilIIlll rig) {
      boolean var1 = true;

      for(int var2 = 0; var2 < rig.IlIlllIlilIl(); ++var2) {
         if (iliIiiliiiii(rig.IiIlliIliiIl(var2).IliIlllilIi()) == null) {
            var1 = false;
         }
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) << 4 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) >>> 12) + var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) << 4 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) >>> 12) + var5) << 12) ^ var5))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) << 4 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) >>> 12) + var5) >>> 4 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) << 4 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5)) << 12 | (char)((char)(var4[var5] ^ var5)) >>> 4) + 'ꆢ') - var5))) - var5))) ^ var5) ^ var5) >>> 12) + var5) << 12) ^ var5))) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int liiiIIllIl() {
      return this.ilIiiIIill.length / 3;
   }

   public lIillIiiIillIi IilliliilIIi() {
      return this.IIIiiIIill;
   }

   private void IiIiliIiiiIi(class_4587.class_4665 i, class_4588 vc, int guv, float[] o, int e) {
      vc.method_56824(i, this.lIIiiIIill[guv * 3], this.lIIiiIIill[guv * 3 + 1], this.lIIiiIIill[guv * 3 + 2]).method_39415(-1).method_22913(o[e], o[e + 1]).method_22922(class_4608.field_21444).method_60803(15728880).method_60831(i, this.iIIiiIIill[guv * 3], this.iIIiiIIill[guv * 3 + 1], this.iIIiiIIill[guv * 3 + 2]);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)(var4[var5] + var5) ^ var5) << 3 | (char)((char)(var4[var5] + var5) ^ var5) >>> 13)))))))) - 17200) - 13775))) + '\uf48b') + 29981) - '\uaa38'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static IIIiIllllIIiIlll lIiiIiIlilli(byte[] data) {
      return new IIIiIllllIIiIlll(lIillIiiIillIi.IilliliilIIi(data));
   }

   public void IIIilIIiiIIi(class_4587.class_4665 overlay, class_4588 vc, int skin, int e, iIiiliIiIliiliIi light) {
      if (!this.Iiilliiliiil(light)) {
         this.Ililllililil(overlay, vc, skin, e);
      } else {
         float[] var6 = light.ililIiiIIi;
         int[] var7 = light.IiilIiiIIi;

         for(int var8 = 0; var8 < this.IiIiiIIill.length; ++var8) {
            int var9 = this.IiIiiIIill[var8];
            vc.method_56824(overlay, this.lIIiiIIill[var9 * 3], this.lIIiiIIill[var9 * 3 + 1], this.lIIiiIIill[var9 * 3 + 2]).method_39415(var7[var8]).method_22913(var6[var8 * 2], var6[var8 * 2 + 1]).method_22922(e).method_60803(skin).method_60831(overlay, this.iIIiiIIill[var9 * 3], this.iIIiiIIill[var9 * 3 + 1], this.iIIiiIIill[var9 * 3 + 2]);
         }

      }
   }
}
