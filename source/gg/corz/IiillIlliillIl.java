package gg.corz;

import com.corz.client.CorzClient;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.awt.Color;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_332;
import net.minecraft.class_4587;

public final class IiillIlliillIl {
   private static final Color iIlIIiIllIllIIiIll = new Color(-7630437, true);
   private static final String[] lllIIiIllillIIiIll = new String[]{IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>(), IIlllIlliIll<invokedynamic>()};
   public static final float IiiiilIllliiiilIll = 0.9F;
   private static final Color IIlIIiIlllIlIIiIll = new Color(-920587, true);
   private static final Int2ObjectOpenHashMap<Color> IilIIiIlllilIIiIll = new Int2ObjectOpenHashMap();
   public static final float illiilIllIiliilIll = 8.0F;
   public static final float lliiilIlliliiilIll = 5.0F;
   public static final float IIiiilIlllIiiilIll = 6.0F;
   private static final int lIIIIiIlliIIIIiIll = 184;
   private static final int IlIIIiIllllIIIiIll = 102;
   public static final float IlliilIllllliilIll = 6.0F;
   public static final float liliilIlliiliilIll = 5.0F;
   private static final int liIIIiIlliiIIIiIll = 654311423;
   public static final float iIiiilIllIliiilIll = 2.0F;
   public static final float lIliilIlliIliilIll = 6.0F;
   public static final float iiIiilIllIIliilIll = 16.0F;
   private static final int ilIIIiIllIiIIIiIll = 788529151;
   public static final float iiiiilIllIIIIIiIll = 0.8F;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] + var5) >>> 11 | (char)(var4[var5] + var5) << 5))) - '궻') ^ '쓉'))) - var5) - var5))))))) + 27517));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) >>> 1 | (char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) << 15) ^ 9033) + '졿'))) - 1869))) + '\udae9') << 7 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) >>> 1 | (char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) << 15) ^ 9033) + '졿'))) - 1869))) + '\udae9') >>> 9) - var5) ^ 27407) - var5)) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) >>> 1 | (char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) << 15) ^ 9033) + '졿'))) - 1869))) + '\udae9') << 7 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) >>> 1 | (char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) << 15) ^ 9033) + '졿'))) - 1869))) + '\udae9') >>> 9) - var5) ^ 27407) - var5)) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void iliIiiliiiii(IIliiIlllIliiIll font, String s, float c, float x, float y, Color scale) {
      if (!s.isEmpty()) {
         if (Math.abs(y - 1.0F) < 5.0E-4F) {
            font.IliIlllilIi(s, c, x, scale);
         } else {
            class_4587 var6 = CorzClient.fontManager.liiiIIllIl();
            var6.method_22903();
            var6.method_22905(y, y, 1.0F);
            font.IliIlllilIi(s, c / y, x / y, scale);
            var6.method_22909();
         }
      }
   }

   private IiillIlliillIl() {
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) << 2) + var5) + '풒') << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) << 2) + var5) + '풒') >>> 3) - 11606) - var5) - var5) + 23554) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) << 2) + var5) + '풒') << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) << 6 | (char)((char)((char)(var4[var5] ^ '︉') - var5) << 8 | (char)((char)(var4[var5] ^ '︉') - var5) >>> 8) >>> 10) + var5) - '込'))) << 2) + var5) + '풒') >>> 3) - 11606) - var5) - var5) + 23554) << 2) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1858397997719261574L ^ Long.rotateLeft(1543390539706619211L, 37) ^ -1382422799909465359L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8577120352277784298L ^ Long.rotateLeft(-7105290074623431466L, 26) ^ 6463173924349635332L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2544316271964477521L ^ Long.rotateLeft(1016719053458055636L, 34) ^ 6956005738124499397L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3169520168348439003L ^ Long.rotateLeft(-3973784125094145560L, 46) ^ -7634175966055507628L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3964418953523481681L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2497429032693175692L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -261695695586415178L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2987629020179038579L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2211178371631707608L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -215983657008812445L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   private static float lIiiIiIlilli(IIliiIlllIliiIll scale, String font, float s) {
      float var3 = scale.iIlIlllllill(IIlllIlliIll<invokedynamic>()) * s;
      float var4 = 0.0F;

      for(int var5 = 0; var5 < font.length(); ++var5) {
         char var6 = font.charAt(var5);
         var4 += var6 >= '0' && var6 <= '9' ? var3 : scale.iIlIlllllill(var6 == '.' ? IIlllIlliIll<invokedynamic>() : String.valueOf(var6)) * s;
      }

      return var4;
   }

   public static void liiiIIllIl(class_332 name, float ay, float s, float ctx, String progress, String accent, float ax, int time) {
      IIliiIlllIliiIll var8 = CorzClient.fontRenderer();
      float var9 = 0.9F * ctx;
      float var10 = 0.8F * ctx;
      float var11 = IlIlllIlilIl(16.0F * ctx);
      float var12 = 6.0F * ctx;
      float var13 = 8.0F * ctx;
      boolean var14 = progress != null && !progress.isEmpty();
      float var15 = var14 ? var8.iIlIlllllill(progress) * var9 + 6.0F * ctx : 0.0F;
      float var16 = lIiiIiIlilli(var8, accent, var9);
      float var17 = IliIlllilIi(ctx, progress, accent);
      float var18 = IlIlllIlilIl(ay - var17 / 2.0F);
      float var19 = IlIlllIlilIl(s + 5.0F * ctx);
      int var20 = (IilIIIIililIIIIi.liiiIIllIl() ? 102 : 184) << 24 | 1053465;
      IIIiiIillIIiiIil.Iilllilliill(name, var18, var19, var17, var11, Math.min(6.0F * ctx, var11 / 2.0F), var20, 788529151);
      float var21 = var18 + var12;
      iIlIlllllill(var21 + var13 / 2.0F, var19 + var11 / 2.0F, var13, ax, time);
      var21 += var13 + 5.0F * ctx;
      float var22 = IIIllIIliIIl(var8, var19, var11, var9);
      if (var14) {
         iliIiiliiiii(var8, progress, var21, var22, var9, IIlIIiIlllIlIIiIll);
         var21 += var15;
      }

      IilliliilIIi(var8, accent, var21, var22, var9, IiIlliIliiIl(time));
      var21 += var16 + 2.0F * ctx;
      iliIiiliiiii(var8, IIlllIlliIll<invokedynamic>(), var21, IIIllIIliIIl(var8, var19, var11, var10), var10, iIlIIiIllIllIIiIll);
   }

   private static float IIIllIIliIIl(IIliiIlllIliiIll scale, float boxH, float boxY, float font) {
      float var4 = (float)scale.IlIillIiilIi(0, --56615551 - 13 ^ 56615446) - 50.0F;
      return IlIlllIlilIl(boxH + boxY / 2.0F + var4 * font);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) << 2 | (char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) >>> 14) ^ 'ﾔ') ^ '\ue891') << 6 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) << 2 | (char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) >>> 14) ^ 'ﾔ') ^ '\ue891') >>> 10) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) << 2 | (char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) >>> 14) ^ 'ﾔ') ^ '\ue891') << 6 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) << 2 | (char)((char)((char)((char)(-var4[var5]) - '\uf04b') + var5) << 2 | (char)((char)((char)(-var4[var5]) - '\uf04b') + var5) >>> 14) >>> 14) ^ 'ﾔ') ^ '\ue891') >>> 10) >>> 15) - 24689));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) >>> 9) - var5) - var5) ^ 26712) ^ 5734) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) >>> 9) - var5) - var5) ^ 26712) ^ 5734) >>> 13))))) + 'ꤩ') << 1 | (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) >>> 9) - var5) - var5) ^ 26712) ^ 5734) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) << 7 | (char)((char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) >>> 5 | (char)((char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) >>> 9 | (char)((char)((char)(var4[var5] + '뭉') ^ var5) ^ var5) << 7) << 11) << 15) >>> 9) - var5) - var5) ^ 26712) ^ 5734) >>> 13))))) + 'ꤩ') >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float IliIlllilIi(float name, String s, String time) {
      IIliiIlllIliiIll var3 = CorzClient.fontRenderer();
      float var4 = 0.9F * name;
      float var5 = 6.0F * name;
      float var6 = s != null && !s.isEmpty() ? var3.iIlIlllllill(s) * var4 + 6.0F * name : 0.0F;
      return (float)Math.ceil((double)(var5 + 8.0F * name + 5.0F * name + var6 + lIiiIiIlilli(var3, time, var4) + 2.0F * name + var3.iIlIlllllill(IIlllIlliIll<invokedynamic>()) * 0.8F * name + var5));
   }

   private static Color IiIlliIliiIl(int argb) {
      Color var1 = (Color)IilIIiIlllilIIiIll.get(argb);
      if (var1 == null) {
         if (IilIIiIlllilIIiIll.size() > (~(565437200 - -87) ^ -565437224)) {
            IilIIiIlllilIIiIll.clear();
         }

         var1 = new Color(argb, true);
         IilIIiIlllilIIiIll.put(argb, var1);
      }

      return var1;
   }

   private static void iIlIlllllill(float accent, float cx, float cy, float fraction, int d) {
      float var5 = IIIiiIillIIiiIil.Illlllllilll();
      float var6 = Math.max(2.0F, (float)Math.round(1.5F * cy / 8.0F / var5)) * var5;
      float var7 = cy / 2.0F - var6 / 2.0F;
      float var8 = IlIlllIlilIl(accent);
      float var9 = IlIlllIlilIl(cx);
      iiiIiIlIIIliIl var10 = new iiiIiIlIIIliIl(var8, var9, 654311423, false, false, true, false);
      var10.iliIiiliiiii(var7, var6);
      var10.Iilllilliill();
      float var11 = Illiiiilllliiiil.lIiiIiIlilli(fraction);
      if (!(var11 <= 0.003F)) {
         iiiIiIlIIIliIl var12 = new iiiIiIlIIIliIl(var8, var9, d, false, false, true, false);
         if (var11 >= 0.997F) {
            var12.iliIiiliiiii(var7, var6);
         } else {
            var12.IIIllIIliIIl(var7, var6, IIliiilllIliiill.iliIiiliiiii(var11), IIliiilllIliiill.IIIllIIliIIl(var11));
         }

         var12.Iilllilliill();
      }
   }

   private static float IlIlllIlilIl(float v) {
      float var1 = IIIiiIillIIiiIil.Illlllllilll();
      return (float)Math.round(v / var1) * var1;
   }

   private static void IilliliilIIi(IIliiIlllIliiIll scale, String x, float font, float c, float s, Color y) {
      float var6 = scale.iIlIlllllill(IIlllIlliIll<invokedynamic>()) * s;

      for(int var7 = 0; var7 < x.length(); ++var7) {
         char var8 = x.charAt(var7);
         if (var8 >= '0' && var8 <= '9') {
            String var10 = lllIIiIllillIIiIll[var8 - 48];
            iliIiiliiiii(scale, var10, font + (var6 - scale.iIlIlllllill(var10) * s) / 2.0F, c, s, y);
            font += var6;
         } else {
            String var9 = var8 == '.' ? IIlllIlliIll<invokedynamic>() : String.valueOf(var8);
            iliIiiliiiii(scale, var9, font, c, s, y);
            font += scale.iIlIlllllill(var9) * s;
         }
      }

   }
}
