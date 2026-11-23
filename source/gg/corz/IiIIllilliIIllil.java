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
import net.minecraft.class_4587;

public final class IiIIllilliIIllil {
   private static float lliIlliIil;
   private static float IliIlliIil;
   private static final float[] lIiIlliIil;
   private static final Int2ObjectOpenHashMap<Color> iIiIlliIil;
   private static final String[] IIiIlliIil;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 25245) - 31216) << 9 | (char)((char)((char)(var4[var5] - var5) - 25245) - 31216) >>> 7) + var5) ^ '볟') - var5) - var5))) ^ var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float IIIllIIliIIl(String s, float y, float scale, float right, int argb) {
      float var5 = IilliliilIIi(s, right);
      iliIiiliiiii(s, llilliilililliil.IIIllIIliIIl(y - var5), scale, right, argb, argb);
      return var5;
   }

   public static float lIiiIiIlilli(String y, float scale, float x, float s, int argb) {
      return iliIiiliiiii(y, scale, x, s, argb, argb);
   }

   static {
      long var1 = -6193320329707492527L;
      IIiIlliIil = new String[128];
      lIiIlliIil = new float[10];
      iIiIlliIil = new Int2ObjectOpenHashMap();
      IliIlliIil = -1.0F;
      lliIlliIil = -1.0F;

      for(long var3 = var1 ^ (137438953472L ^ var1) & -1L << 32; (int)(var3 >>> 32) < 128; var3 += 4294967296L) {
         IIiIlliIil[(int)(var3 >>> 32)] = String.valueOf((char)((int)(var3 >>> 32)));
      }

   }

   private static float iIlIlllllill(IIliiIlllIliiIll f) {
      long var4 = 4129510661729582039L;
      float var1 = f.iIlIlllllill(IiIlliIliiIl<invokedynamic>());
      if (var1 != lliIlliIil || IliIlliIil <= 0.0F) {
         lliIlliIil = var1;
         float var2 = 0.0F;

         for(long var6 = var4 ^ (0L ^ var4) & -1L << 32; (int)(var6 >>> 32) < 10; var6 += 4294967296L) {
            lIiIlliIil[(int)(var6 >>> 32)] = f.iIlIlllllill(IIiIlliIil[48 + (int)(var6 >>> 32)]);
            if ((int)(var6 >>> 32) >= 2) {
               var2 = Math.max(var2, lIiIlliIil[(int)(var6 >>> 32)]);
            }
         }

         IliIlliIil = var2;
      }

      return IliIlliIil;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5158512951349252066L ^ Long.rotateLeft(-2921006522188006385L, 62) ^ 8991483624466949661L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5003080387180767808L ^ Long.rotateLeft(-6383793769914057153L, 30) ^ 3828258594134136120L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -9199108698067579677L ^ Long.rotateLeft(5258959036122024356L, 35) ^ 3232277400423996443L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5963088133743598441L ^ Long.rotateLeft(3304771133121808335L, 2) ^ -2099134166460889518L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6687850925381878810L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2734384753200234581L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7987345959676927258L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1284289839039896297L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1614719003366361042L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1883207395593976802L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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

   private static boolean IliIlllilIi(char c) {
      return c >= '0' && c <= '9';
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 10 | (char)(~var4[var5]) << 6) >>> 8 | (char)((char)(~var4[var5]) >>> 10 | (char)(~var4[var5]) << 6) << 8))) ^ '끀') + var5))) << 6 | (char)(-((char)((char)((char)(~((char)((char)((char)(~var4[var5]) >>> 10 | (char)(~var4[var5]) << 6) >>> 8 | (char)((char)(~var4[var5]) >>> 10 | (char)(~var4[var5]) << 6) << 8))) ^ '끀') + var5))) >>> 10))) ^ var5) - var5) ^ 302) + var5) ^ var5) + 15075) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + 9635))) - 26052) ^ var5) ^ '鬰') - 17086) + 2549))) >>> 15 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ var5) + 9635))) - 26052) ^ var5) ^ '鬰') - 17086) + 2549))) << 1))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static Color IlIlllIlilIl(int argb) {
      Color var1 = (Color)iIiIlliIil.get(argb);
      if (var1 == null) {
         if (iIiIlliIil.size() > 96) {
            iIiIlliIil.clear();
         }

         var1 = new Color(argb, true);
         iIiIlliIil.put(argb, var1);
      }

      return var1;
   }

   private IiIIllilliIIllil() {
   }

   public static float IilliliilIIi(String s, float scale) {
      long var8 = -7329745256713318693L;
      long var10 = -163214672027509384L;
      if (s != null && !s.isEmpty()) {
         IIliiIlllIliiIll var2 = llilliilililliil.IIiilIiiiIii();
         float var3 = iIlIlllllill(var2);
         float var4 = 0.0F;
         var8 ^= ((long)s.length() << 32 ^ var8) & -1L << 32;

         for(long var13 = var8 ^ (0L ^ var8) & -1L >>> 32; (int)var13 < (int)(var13 >>> 32); var13 ^= (var13 ^ var13 + (long)1) & -1L >>> 32) {
            var10 ^= ((long)s.charAt((int)var13) << 32 ^ var10) & -1L << 32;
            var4 += IliIlllilIi((char)((int)(var10 >>> 32))) ? var3 : var2.iIlIlllllill(liiiIIllIl((char)((int)(var10 >>> 32))));
         }

         return var4 * scale;
      } else {
         return 0.0F;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '詋') ^ 15033))) ^ 16759) ^ '列') - 24628) << 2 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '詋') ^ 15033))) ^ 16759) ^ '列') - 24628) >>> 14) - var5) - var5) ^ '靈') ^ var5) + '쓹') + 29773) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '詋') ^ 15033))) ^ 16759) ^ '列') - 24628) << 2 | (char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) + '詋') ^ 15033))) ^ 16759) ^ '列') - 24628) >>> 14) - var5) - var5) ^ '靈') ^ var5) + '쓹') + 29773) << 12) - var5) + var5) ^ var5) ^ '쾔'));
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
         var4[var5] = (char)((char)(-((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) << 11 | (char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) >>> 5) >>> 8 | (char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) << 11 | (char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) >>> 5) << 8) + var5))) << 1 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) << 11 | (char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) >>> 5) >>> 8 | (char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) << 11 | (char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) >>> 6 | (char)((char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) >>> 11 | (char)((char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) >>> 13 | (char)(~((char)(~((char)(~((char)((char)(var4[var5] + 3645) << 11 | (char)(var4[var5] + 3645) >>> 5))))))) << 3) << 5) << 10) >>> 5) << 8) + var5))) >>> 15))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static float iliIiiliiiii(String s, float argb, float signArgb, float x, int scale, int y) {
      long var21 = -2981241752521711559L;
      long var23 = 8196604317630992306L;
      if (s != null && !s.isEmpty()) {
         IIliiIlllIliiIll var6 = llilliilililliil.IIiilIiiiIii();
         float var7 = iIlIlllllill(var6);
         Color var8 = IlIlllIlilIl(scale);
         Color var9 = IlIlllIlilIl(y);
         class_4587 var10 = CorzClient.fontManager.liiiIIllIl();
         var10.method_22903();
         lliIIllliliIIlll var11 = null;

         float var15;
         try {
            lliIIllliliIIlll var10000;
            label275: {
               var10.method_22905(x, x, 1.0F);
               if (var6 instanceof lliIIllliliIIlll) {
                  lliIIllliliIIlll var12 = (lliIIllliliIIlll)var6;
                  if (var12.IiIIlliIIl()) {
                     var10000 = var12;
                     break label275;
                  }
               }

               var10000 = null;
            }

            var11 = var10000;
            float var36 = argb / x;
            float var13 = signArgb / x;
            var21 ^= ((long)s.length() << 32 ^ var21) & -1L << 32;

            for(long var38 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var38 < (int)(var38 >>> 32); var38 ^= (var38 ^ var38 + (long)1) & -1L >>> 32) {
               var23 ^= ((long)s.charAt((int)var38) << 32 ^ var23) & -1L << 32;
               String var17 = liiiIIllIl((char)((int)(var23 >>> 32)));
               if (IliIlllilIi((char)((int)(var23 >>> 32)))) {
                  var6.IliIlllilIi(var17, var36 + (var7 - lIiIlliIil[(int)(var23 >>> 32) - 48]) / 2.0F, var13, var8);
                  var36 += var7;
               } else {
                  var6.IliIlllilIi(var17, var36, var13, (int)(var23 >>> 32) != 36 && (int)(var23 >>> 32) != 43 && (int)(var23 >>> 32) != 45 ? var8 : var9);
                  var36 += var6.iIlIlllllill(var17);
               }
            }

            var15 = var36 * x - argb;
         } finally {
            try {
               if (var11 != null) {
                  var11.iiIIlIIlIl();
               }
            } finally {
               var10.method_22909();
            }

         }

         return var15;
      } else {
         return 0.0F;
      }
   }

   private static String liiiIIllIl(char c) {
      return c < 128 && IIiIlliIil[c] != null ? IIiIlliIil[c] : String.valueOf(c);
   }
}
