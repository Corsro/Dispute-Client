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
import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_1309;
import net.minecraft.class_1799;
import net.minecraft.class_310;
import net.minecraft.class_742;

public final class lliIIililiIIil {
   private static liIlIiliiIlIil iiiIiilIiIIIliilIi;
   private static lliIiiililiIiiil lllliilIiillliilIi;
   private static class_742 lIIliilIiiIIliilIi;
   private static float[] ililiilIiIiiliilIi;
   private static float[] IliliilIilliliilIi;
   private static final float IiiIiilIiliiIiilIi = 0.12F;
   private static class_1306 iIlliilIiIllliilIi;
   private static class_1799 IlIliilIillIliilIi;
   private static int IIlliilIilIlliilIi;
   private static long iilliilIiIIiliilIi;
   private static int ilIliilIiIiIliilIi;
   private static long lIiliilIiiIiliilIi;
   private static String IilliilIililliilIi;
   private static int liIliilIiiiIliilIi;

   private static void IiIiliIiiiIi(float[] a, float[] out, float t, float[] b) {
      for(int var4 = 0; var4 < a.length; ++var4) {
         float var5 = out[var4] - a[var4];
         int var6 = var4 % 9;
         if (var6 >= 3 && var6 < 6) {
            var5 -= (float)Math.floor((double)((var5 + 180.0F) / 360.0F)) * 360.0F;
         }

         b[var4] = a[var4] + var5 * t;
      }

   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 1 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 15))) + 20169) ^ '쨿') + var5) ^ '\uf43f') ^ var5) + 4087))) - 26917) + var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 1 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 15))) + 20169) ^ '쨿') + var5) ^ '\uf43f') ^ var5) + 4087))) - 26917) + var5) << 2))) ^ '\ue063') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iiIiliiIIlilii iIlIlllllill() {
      return iiiIiilIiIIIliilIi == null ? null : iiiIiilIiIIIliilIi.IliIlllilIi();
   }

   public static boolean Ililllililil(class_1309 entity, class_1268 hand) {
      class_310 var2 = class_310.method_1551();
      return entity == var2.field_1724 && var2.field_1755 == null && var2.method_1569() && hand == class_1268.field_5808 && IIililIili.IliIlllilIi(var2.field_1724, hand, var2.field_1724.method_5998(hand)) && Iilllilliill() ? Iiilliiliiil(iIIIIilIlIIIil.IilliliilIIi(iiiIiilIiIIIliilIi.IliIlllilIi(), iiiIiilIiIIIliilIi.liiiIIllIl(), var2.field_1690.field_1904.method_1434(), liIliilIiiiIliilIi++)) : false;
   }

   private lliIIililiIIil() {
   }

   public static long lIiiIiIlilli() {
      return lllliilIiillliilIi == null ? 0L : iilliilIiIIiliilIi;
   }

   static {
      IlIliilIillIliilIi = class_1799.field_8037;
      IilliilIililliilIi = IIlilIliiIli<invokedynamic>();
   }

   private static void IlIillIiilIi() {
      if (iiiIiilIiIIIliilIi != null) {
         Arrays.fill(IliliilIilliliilIi, 0.0F);

         for(int var0 = 0; var0 < iiiIiilIiIIIliilIi.liiiIIllIl().liiililIll.length; ++var0) {
            Arrays.fill(IliliilIilliliilIi, var0 * 9 + 6, var0 * 9 + 9, 1.0F);
         }

         lliIiiililiIiiil var7 = (lliIiiililiIiiil)iiiIiilIiIIIliilIi.liiiIIllIl().iiiililIll.get(IilliilIililliilIi);
         if (var7 == null) {
            var7 = (lliIiiililiIiiil)iiiIiilIiIIIliilIi.liiiIIllIl().iiiililIll.get(IIlilIliiIli<invokedynamic>());
         }

         long var1 = System.nanoTime();
         var7.IliIlllilIi((float)(var1 - lIiliilIiiIiliilIi) / 1.0E9F % var7.iIlIlllllill(), IliliilIilliliilIi);
         if (lllliilIiillliilIi != null) {
            float var3 = (float)(var1 - iilliilIiIIiliilIi) / 1.0E9F;
            if (var3 > lllliilIiillliilIi.iIlIlllllill() + 0.12F) {
               lllliilIiillliilIi = null;
            } else {
               float[] var4 = null;
               if (var3 > lllliilIiillliilIi.iIlIlllllill()) {
                  var4 = (float[])IliliilIilliliilIi.clone();
                  lllliilIiillliilIi.IliIlllilIi(lllliilIiillliilIi.iIlIlllllill(), IliliilIilliliilIi);
               } else {
                  lllliilIiillliilIi.IliIlllilIi(var3, IliliilIilliliilIi);
               }

               float var5 = Math.clamp(var3 / 0.12F, 0.0F, 1.0F);
               var5 = var5 * var5 * (3.0F - 2.0F * var5);
               if (var4 != null) {
                  float var6 = Math.clamp((var3 - lllliilIiillliilIi.iIlIlllllill()) / 0.12F, 0.0F, 1.0F);
                  var6 = var6 * var6 * (3.0F - 2.0F * var6);
                  IiIiliIiiiIi(IliliilIilliliilIi, var4, var6, IliliilIilliliilIi);
               } else if (var5 < 1.0F) {
                  IiIiliIiiiIi(ililiilIiIiiliilIi, IliliilIilliliilIi, var5, IliliilIilliliilIi);
               }

            }
         }
      }
   }

   public static List<iIiiiilIliiiil> IiIlliIliiIl() {
      if (iiiIiilIiIIIliilIi != null && lllliilIiillliilIi != null) {
         List var0 = IillIlilillIli.IiIiliIiiiIi(iiiIiilIiIIIliilIi.IliIlllilIi(), lllliilIiillliilIi);
         if (var0 != null) {
            return var0;
         } else {
            return !IlIlllIlilIl() ? List.of() : IllIiiillllIiiil.IliIlllilIi(iiiIiilIiIIIliilIi.liiiIIllIl(), lllliilIiillliilIi);
         }
      } else {
         return List.of();
      }
   }

   public static void IliIlllilIi() {
      iiiIiilIiIIIliilIi = null;
      lIIliilIiiIIliilIi = null;
      lllliilIiillliilIi = null;
      IlIliilIillIliilIi = class_1799.field_8037;
      IliliilIilliliilIi = null;
      ililiilIiIiiliilIi = null;
      liIliilIiiiIliilIi = 0;
      IIlliilIilIlliilIi = 0;
      IilliilIililliilIi = IIlilIliiIli<invokedynamic>();
   }

   public static boolean IlIlllIlilIl() {
      return lllliilIiillliilIi != null && lllliilIiillliilIi.liiiIIllIl().startsWith(IIlilIliiIli<invokedynamic>());
   }

   public static void IIlllIlliIll(class_310 c, boolean pressed) {
      if (c.field_1724 != null && IIililIili.IliIlllilIi(c.field_1724, class_1268.field_5808, c.field_1724.method_6047())) {
         Iilllilliill();
         if (c.field_1755 == null && c.method_1569()) {
            if (pressed) {
               IIillIiliIil();
            }

         } else {
            lllliilIiillliilIi = null;
         }
      } else {
         IliIlllilIi();
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) >>> 15 | (char)(~((char)(var4[var5] + var5))) << 1) - 22326) ^ 23198) + 15042) << 12 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) >>> 15 | (char)(~((char)(var4[var5] + var5))) << 1) - 22326) ^ 23198) + 15042) >>> 4))) + '퐀') << 5 | (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) >>> 15 | (char)(~((char)(var4[var5] + var5))) << 1) - 22326) ^ 23198) + 15042) << 12 | (char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) >>> 15 | (char)(~((char)(var4[var5] + var5))) << 1) - 22326) ^ 23198) + 15042) >>> 4))) + '퐀') >>> 11))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void liiiIIllIl() {
      if (lllliilIiillliilIi != null && lllliilIiillliilIi.liiiIIllIl().startsWith(IIlilIliiIli<invokedynamic>())) {
         lllliilIiillliilIi = null;
      }

   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 'ꀶ') - 3675))) ^ '냅') + var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 'ꀶ') - 3675))) ^ '냅') + var5) >>> 5) + var5))))) ^ var5))) - 8725) - 366) << 11 | (char)((char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 'ꀶ') - 3675))) ^ '냅') + var5) << 11 | (char)((char)((char)(-((char)((char)((char)(var4[var5] - var5) + 'ꀶ') - 3675))) ^ '냅') + var5) >>> 5) + var5))))) ^ var5))) - 8725) - 366) >>> 5) - var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) << 1 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) >>> 15) << 4 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) << 1 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) >>> 15) >>> 12)))) + 7097) << 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) << 1 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) >>> 15) << 4 | (char)((char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) << 1 | (char)((char)((char)(-((char)(~((char)(var4[var5] ^ var5))))) + var5) ^ 12368) >>> 15) >>> 12)))) + 7097) >>> 6))))) - 2280))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float[] IIIilIIiiIIi() {
      Iilllilliill();
      IlIillIiilIi();
      return IliliilIilliliilIi;
   }

   public static float iliIiiliiiii() {
      return lllliilIiillliilIi == null ? 0.0F : (float)(System.nanoTime() - iilliilIiIIiliilIi) / 1.0E9F;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6446372941803769411L ^ Long.rotateLeft(357319035424507590L, 30) ^ -8383190932154535806L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8817952795214182462L ^ Long.rotateLeft(-5679180594960930870L, 14) ^ 6654743643606863731L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8188077269134075024L ^ Long.rotateLeft(-8281210281008420252L, 43) ^ -8257365145062821942L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 337302189575116367L ^ Long.rotateLeft(-3601763667745998081L, 50) ^ -7492587224655654033L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6761974106006721334L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7684017444990419817L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2405957464690522051L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -689511396955101983L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4671824039131577085L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1654804549273242775L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illillliilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilililiiili<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiilIiiiIii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iliilliiilii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiiiliiiiiii<invokedynamic>());
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

   private static boolean Iiilliiliiil(String name) {
      lliIiiililiIiiil var1 = (lliIiiililiIiiil)iiiIiilIiIIIliilIi.liiiIIllIl().iiiililIll.get(name);
      if (var1 == null) {
         return false;
      } else {
         IlIillIiilIi();
         System.arraycopy(IliliilIilliliilIi, 0, ililiilIiIiiliilIi, 0, IliliilIilliliilIi.length);
         lllliilIiillliilIi = var1;
         iilliilIiIIiliilIi = System.nanoTime();
         return true;
      }
   }

   public static float IIIllIIliIIl() {
      return lllliilIiillliilIi == null ? 0.0F : lllliilIiillliilIi.iIlIlllllill();
   }

   static liIlIiliiIlIil Illlllllilll() {
      return iiiIiilIiIIIliilIi;
   }

   public static String IilliliilIIi() {
      return lllliilIiillliilIi == null ? IilliilIililliilIi : lllliilIiillliilIi.liiiIIllIl();
   }

   private static boolean Iilllilliill() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 == null) {
         return false;
      } else {
         liIlIiliiIlIil var1 = iIllliIlllli.iliIiiliiiii(iIiIiliIliIili.lIiiIiIlilli());
         if (var1 == null) {
            return false;
         } else {
            if (iiiIiilIiIIIliilIi != var1 || lIIliilIiiIIliilIi != var0.field_1724 || ilIliilIiIiIliilIi != var0.field_1724.method_31548().method_67532() || iIlliilIiIllliilIi != var0.field_1724.method_6068() || !class_1799.method_7984(IlIliilIillIliilIi, var0.field_1724.method_6047())) {
               IliIlllilIi();
               iiiIiilIiIIIliilIi = var1;
               lIIliilIiiIIliilIi = var0.field_1724;
               ilIliilIiIiIliilIi = lIIliilIiiIIliilIi.method_31548().method_67532();
               iIlliilIiIllliilIi = lIIliilIiiIIliilIi.method_6068();
               IlIliilIillIliilIi = lIIliilIiiIIliilIi.method_6047().method_7972();
               IilliilIililliilIi = iIIIIilIlIIIil.IliIlllilIi(var1.IliIlllilIi(), var1.liiiIIllIl());
               IliliilIilliliilIi = iiiIiilIiIIIliilIi.liiiIIllIl().Illlllllilll();
               ililiilIiIiiliilIi = (float[])IliliilIilliliilIi.clone();
               lIiliilIiiIiliilIi = System.nanoTime();
               IlIillIiilIi();
               Iiilliiliiil(iIIIIilIlIIIil.liiiIIllIl(var1.IliIlllilIi(), var1.liiiIIllIl()));
            }

            return true;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) << 5) + var5) - '콋') << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) << 5) + var5) - '콋') >>> 5) << 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) << 5) + var5) - '콋') << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) >>> 11 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) + 10018) - 20364))) + var5) ^ '끪') ^ '쇕') << 7) + 8230))) << 5) + var5) - '콋') >>> 5) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void IIillIiliIil() {
      class_310 var0 = class_310.method_1551();
      if (var0.field_1724 != null && IIililIili.IliIlllilIi(var0.field_1724, class_1268.field_5808, var0.field_1724.method_6047()) && Iilllilliill() && !IlIlllIlilIl()) {
         List var1 = iIIIIilIlIIIil.iIlIlllllill(iiiIiilIiIIIliilIi.IliIlllilIi(), iiiIiilIiIIIliilIi.liiiIIllIl());
         if (!var1.isEmpty()) {
            Iiilliiliiil((String)var1.get(Math.floorMod(IIlliilIilIlliilIi++, var1.size())));
         }
      }
   }
}
