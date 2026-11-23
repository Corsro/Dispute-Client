package gg.corz;

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
import net.minecraft.class_1058;
import net.minecraft.class_11659;
import net.minecraft.class_11683;
import net.minecraft.class_12249;
import net.minecraft.class_1921;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_4587;
import net.minecraft.class_4608;
import net.minecraft.class_630;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

final class ilIIillIiIIill {
   private static class_630 lliIilIIiiliIilIIi;
   static final String[] IiIIilIIiliIIilIIi = new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()};
   static final String[] llIiilIIiilIiilIIi = new String[]{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()};
   private static final long[] lIililIIiiIililIIi = new long[3];
   static final long ilililIIiIiililIIi = 2500000000L;
   private static final float[] IIllilIIilIllilIIi = new float[2];
   static final String[][] llIIilIIiilIIilIIi = new String[][]{{Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}, {Iilllilliill<invokedynamic>(), Iilllilliill<invokedynamic>()}};
   static final float[][] iIIiilIIiIlIiilIIi = new float[][]{{0.35F, 1.55F, 0.0F}, {1.6F, 2.8F, 1.0F}, {3.2F, 4.4F, 0.0F}, {4.5F, 5.8F, 1.0F}};
   private static final Matrix4f IIIiilIIilIIiilIIi = new Matrix4f();
   private static float IlIlilIIillIlilIIi;
   private static class_630 IiiIilIIiliiIilIIi;
   static final float illIilIIiIilIilIIi = 2.9F;
   private static float iillilIIiIIililIIi;
   private static float ilIlilIIiIiIlilIIi = -0.8F;
   private static int liIlilIIiiiIlilIIi;
   private static llIIiIililIIiIil iIiIilIIiIliIilIIi;
   static final float IllIilIIilllIilIIi = 1100.0F;
   private static final String[] llllilIIiilllilIIi = new String[2];
   private static boolean lIIlilIIiiIIlilIIi;
   static final float iiIIilIIiIIlIilIIi = 1.9F;
   private static int IlililIIillililIIi;
   private static boolean liililIIiiiililIIi;
   static final float lIlIilIIiiIlIilIIi = 31.0F;
   private static float IillilIIilillilIIi;
   static final float lilIilIIiiilIilIIi = 0.45F;
   private static final float[] iIllilIIiIlllilIIi = new float[]{-1.0F, -1.0F};
   static final float IIiIilIIilIiIilIIi = 4.8F;
   private static class_1921 iiiIilIIiIIIlilIIi;

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) << 11 | (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) >>> 5) >>> 9 | (char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) << 11 | (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) >>> 5) << 7) << 13 | (char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) << 11 | (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) >>> 5) >>> 9 | (char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) << 11 | (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)(~((char)(var4[var5] - 2315))))) + '讵') - '\uf12b'))))))) + var5) + 16768) >>> 5) << 7) >>> 3) + 'ﮊ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private ilIIillIiIIill() {
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) - 31737) >>> 7 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) - 31737) << 9) ^ var5))) << 3 | (char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) - 31737) >>> 7 | (char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) - 31737) << 9) ^ var5))) >>> 13) ^ 6419) ^ 25064) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static int lIiiIiIlilli() {
      long var2 = 7165592969544040897L;
      if (!ilIIllIiIIll.IliIlllilIi()) {
         return -1;
      } else {
         float var0 = ilIIllIiIIll.liilliiill();

         for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < iIIiilIIiIlIiilIIi.length; var4 += 4294967296L) {
            if (var0 >= iIIiilIIiIlIiilIIi[(int)(var4 >>> 32)][0] && var0 < iIIiilIIiIlIiilIIi[(int)(var4 >>> 32)][1]) {
               return (int)(var4 >>> 32);
            }
         }

         return -1;
      }
   }

   private static int iliIiiliiiii() {
      long var1 = 8533137369267792061L;
      if (ilIIllIiIIll.IliIlllilIi()) {
         var1 ^= ((long)lIiiIiIlilli() << 32 ^ var1) & -1L << 32;
         return (int)(var1 >>> 32) < 0 ? -1 : (int)iIIiilIIiIlIiilIIi[(int)(var1 >>> 32)][2];
      } else if (ilIlilIIiIiIlilIIi < 0.0F) {
         return -1;
      } else if (ilIlilIIiIiIlilIIi < 2.9F) {
         return 0;
      } else if (ilIlilIIiIiIlilIIi < 3.3500001F) {
         return -1;
      } else {
         return ilIlilIIiIiIlilIIi < 6.25F ? 1 : -1;
      }
   }

   static boolean IIlllIlliIll(double my, double mx) {
      long var10 = -4251786806241006744L;
      if (liililIIiiiililIIi && !(IlIlilIIillIlilIIi < 0.5F)) {
         for(long var12 = var10 ^ (0L ^ var10) & -1L << 32; (int)(var12 >>> 32) < 2; var12 += 4294967296L) {
            float var5 = IillilIIilillilIIi - 96.0F + (float)((int)(var12 >>> 32)) * 31.0F;
            if (my >= (double)(var5 - 10.0F) && my <= (double)(var5 + 10.0F) && mx >= (double)(iillilIIiIIililIIi - 30.0F) && mx <= (double)(iillilIIiIIililIIi + 10.0F)) {
               IIllilIIilIllilIIi[(int)(var12 >>> 32)] = 1.0F;
               iIllilIIiIlllilIIi[(int)(var12 >>> 32)] = 0.0F;
               llllilIIiilllilIIi[(int)(var12 >>> 32)] = IiIIilIIiliIIilIIi[(int)(IIIiIillIIiIil.IiiIlliiIl((int)(IIIiIillIIiIil.liiIiIiIiiiiIiIiIi * (double)7.0F), (int)(var12 >>> 32)) * (float)IiIIilIIiliIIilIIi.length) % IiIIilIIiliIIilIIi.length];
               long var6 = System.nanoTime();
               lIililIIiiIililIIi[IlililIIillililIIi] = var6;
               IlililIIillililIIi = (IlililIIillililIIi + 1) % lIililIIiiIililIIi.length;
               long var8 = lIililIIiiIililIIi[IlililIIillililIIi];
               if (var8 != 0L && var6 - var8 <= 2500000000L && ilIIllIiIIll.IIIllIIliIIl()) {
                  Arrays.fill(lIililIIiiIililIIi, 0L);
                  llllilIIiilllilIIi[(int)(var12 >>> 32)] = Iilllilliill<invokedynamic>();
               }

               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) << 14 | (char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) >>> 2) ^ var5))) - var5) - 'ꑀ') ^ 'ꦢ') + var5) << 7 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) << 14 | (char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) >>> 2) ^ var5))) - var5) - 'ꑀ') ^ 'ꦢ') + var5) >>> 9) - var5))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) << 14 | (char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) >>> 2) ^ var5))) - var5) - 'ꑀ') ^ 'ꦢ') + var5) << 7 | (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) << 14 | (char)(~((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) + var5))) >>> 2) ^ var5))) - var5) - 'ꑀ') ^ 'ꦢ') + var5) >>> 9) - var5))) >>> 4) + var5) ^ var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IlIlllIlilIl(class_630 talk, int phase, boolean i, float g, float t) {
      class_630 var5 = talk.method_32086(Iilllilliill<invokedynamic>());
      class_630 var6 = talk.method_32086(Iilllilliill<invokedynamic>());
      class_630 var7 = talk.method_32086(Iilllilliill<invokedynamic>());
      class_630 var8 = talk.method_32086(Iilllilliill<invokedynamic>());
      class_630 var9 = talk.method_32086(Iilllilliill<invokedynamic>());
      float var10 = (float)Math.sin((double)(g * 1.6F));
      var8.field_3654 = -1.2F + 0.28F * var10;
      var9.field_3654 = -1.2F - 0.28F * var10;
      float var11 = phase == 0 ? 1.0F : -1.0F;
      var5.field_3674 = var11 * (i ? 0.16F + 0.05F * (float)Math.sin((double)(t * 9.0F)) : 0.05F);
      var5.field_3654 = i ? 0.08F * (float)Math.sin((double)(t * 7.3F)) : 0.04F * (float)Math.sin((double)g);
      var6.field_3654 = i && phase == 1 ? -1.2F - 0.35F * (float)Math.sin((double)(t * 6.0F)) : -0.25F;
      var7.field_3654 = i && phase == 0 ? -1.2F - 0.35F * (float)Math.sin((double)(t * 6.0F)) : -0.25F;
      var6.field_3674 = -0.35F;
      var7.field_3674 = 0.35F;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1419185648294575122L ^ Long.rotateLeft(-7611443293791670865L, 38) ^ 4239821816314423443L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5344005524564705516L ^ Long.rotateLeft(-4342848716923656409L, 2) ^ 843303879382718911L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4939690192168799522L ^ Long.rotateLeft(-6614877072513680900L, 59) ^ -7500987610892403476L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6968672760844613510L ^ Long.rotateLeft(734715055726373803L, 54) ^ -6523621942267521417L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2914464974507495237L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5459976595508209442L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8574881563739105281L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8814885990831201816L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6337826185389020193L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6011106717314949814L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + '\uebd8') - 29585) << 10 | (char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) + '\uebd8') - 29585) >>> 6))) - var5))) - '齈') ^ var5) + var5) ^ var5) + 'ퟤ') - '헔') + 17443) + 2208))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IiIlliIliiIl(class_332 px, int w, int ctx, int alpha, float py) {
      long var13 = 2986394018285417243L;
      long var15 = -9169807173955954200L;
      if (ctx >= 46) {
         var13 ^= ((long)iliIiiliiiii() << 32 ^ var13) & -1L << 32;

         for(long var20 = var13 ^ (0L ^ var13) & -1L >>> 32; (int)var20 < 2; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
            String var7 = null;
            float var8 = 0.0F;
            float var9 = 1.0F;
            if (iIllilIIiIlllilIIi[(int)var20] >= 0.0F && iIllilIIiIlllilIIi[(int)var20] < 1.6F) {
               var7 = llllilIIiilllilIIi[(int)var20];
               var8 = ilIIllIiIIll.llIililIil(Math.min(1.0F, iIllilIIiIlllilIIi[(int)var20] / 0.12F)) * ilIIllIiIIll.llIililIil(Math.min(1.0F, (1.6F - iIllilIIiIlllilIIi[(int)var20]) / 0.25F));
               var9 = 0.85F + 0.15F * ilIIllIiIIll.llIililIil(Math.min(1.0F, iIllilIIiIlllilIIi[(int)var20] / 0.15F));
            } else if ((int)(var20 >>> 32) == (int)var20 && lIiiIiIlilli() >= 0) {
               var15 ^= ((long)lIiiIiIlilli() << 32 ^ var15) & -1L << 32;
               float var11 = ilIIllIiIIll.liilliiill() - iIIiilIIiIlIiilIIi[(int)(var15 >>> 32)][0];
               float var12 = iIIiilIIiIlIiilIIi[(int)(var15 >>> 32)][1] - iIIiilIIiIlIiilIIi[(int)(var15 >>> 32)][0];
               var7 = llIiilIIiilIiilIIi[(int)(var15 >>> 32)];
               var8 = ilIIllIiIIll.llIililIil(Math.min(1.0F, var11 / 0.14F)) * ilIIllIiIIll.llIililIil(Math.min(1.0F, (var12 - var11) / 0.18F));
               var9 = 0.86F + 0.14F * ilIIllIiIIll.llIililIil(Math.min(1.0F, var11 / 0.16F));
            } else if ((int)(var20 >>> 32) == (int)var20) {
               float var10 = ilIlilIIiIiIlilIIi - ((int)var20 == 0 ? 0.0F : 3.3500001F);
               var7 = llIIilIIiilIIilIIi[liIlilIIiiiIlilIIi][(int)var20];
               var8 = ilIIllIiIIll.llIililIil(Math.min(1.0F, var10 / 0.16F)) * ilIIllIiIIll.llIililIil(Math.min(1.0F, (2.9F - var10) / 0.22F));
               var9 = 0.86F + 0.14F * ilIIllIiIIll.llIililIil(Math.min(1.0F, var10 / 0.18F));
            }

            if (var7 != null && !(var8 <= 0.01F)) {
               float var17 = iIlIlllllill(w, alpha, (int)var20) + ((int)var20 == 0 ? -2.0F : 2.0F);
               float var18 = (float)ctx - 2.2F - 22.8F - 4.0F - 9.0F * (float)Math.sin((double)Math.min(1.0F, IIllilIIilIllilIIi[(int)var20]) * Math.PI);
               iiilIillIIIiIill.IliIlllilIi(px, var7, var17, var18, 0.72F, var8 * py, (int)var20 == 1, var9);
            }
         }

      }
   }

   static float iIlIlllllill(int px, int who, int w) {
      return (float)(px + who) - 96.0F + (float)w * 31.0F;
   }

   static void IliIlllilIi() {
      if (iIiIilIIiIliIilIIi != null) {
         iIiIilIIiIliIilIIi.IiIiliIiiiIi();
      }

      iIiIilIIiIliIilIIi = null;
      IlIlilIIillIlilIIi = 0.0F;
      ilIlilIIiIiIlilIIi = -0.8F;
      Arrays.fill(lIililIIiiIililIIi, 0L);
      iIllilIIiIlllilIIi[0] = iIllilIIiIlllilIIi[1] = -1.0F;
      IIllilIIilIllilIIi[0] = IIllilIIilIllilIIi[1] = 0.0F;
   }

   static void IilliliilIIi(class_332 sw, int w, int ctx, int px, int py, int sh) {
      long var21 = 7410553828935057966L;
      long var23 = 1177134637770781660L;
      float var6 = IIIiIillIIiIil.IIIliIiIilIIliIiIi;
      var21 ^= ((long)(IIIiIillIIiIil.liiiIIllIl() && liiiIIllIl(ctx) && IIIiIillIIiIil.IliIlllilIi() > 0.5F ? 1 : 0) << 32 ^ var21) & -1L << 32;
      float var8 = (int)(var21 >>> 32) != 0 ? 1.0F : 0.0F;
      IlIlilIIillIlilIIi += (var8 - IlIlilIIillIlilIIi) * (1.0F - (float)Math.exp((double)(-5.0F * var6)));
      if ((int)(var21 >>> 32) == 0 && IlIlilIIillIlilIIi < 0.01F) {
         IlIlilIIillIlilIIi = 0.0F;
      }

      liililIIiiiililIIi = false;
      if (!(IlIlilIIillIlilIIi <= 0.01F) && !lIIlilIIiiIIlilIIi) {
         float var9 = IlIlilIIillIlilIIi * IliiIilliiIi.IIIllIIliIIl();
         if (!(var9 <= 0.01F)) {
            if (!ilIIllIiIIll.IliIlllilIi()) {
               ilIlilIIiIiIlilIIi += var6;
            }

            float var10 = 11.05F;
            if (ilIlilIIiIiIlilIIi > var10) {
               ilIlilIIiIiIlilIIi -= var10;
               liIlilIIiiiIlilIIi = (liIlilIIiiiIlilIIi + 1) % llIIilIIiilIIilIIi.length;
            }

            for(long var28 = var21 ^ (0L ^ var21) & -1L >>> 32; (int)var28 < 2; var28 ^= (var28 ^ var28 + (long)1) & -1L >>> 32) {
               IIllilIIilIllilIIi[(int)var28] = Math.max(0.0F, IIllilIIilIllilIIi[(int)var28] - var6 * 2.6F);
               if (iIllilIIiIlllilIIi[(int)var28] >= 0.0F) {
                  float[] var10000 = iIllilIIiIlllilIIi;
                  var10000[(int)var28] += var6;
                  if (iIllilIIiIlllilIIi[(int)var28] > 2.0F) {
                     iIllilIIiIlllilIIi[(int)var28] = -1.0F;
                  }
               }
            }

            float var11 = (float)(w + px) - 150.0F;
            float var12 = (float)(w + px) - 16.0F;
            float var13 = (float)ctx - 56.0F;
            float var14 = (float)ctx + 22.0F;
            IillilIIilillilIIi = (float)(w + px);
            iillilIIiIIililIIi = (float)ctx;
            liililIIiiiililIIi = true;

            try {
               class_310 var15 = class_310.method_1551();
               if (lliIilIIiiliIilIIi == null) {
                  liiIiIIiiiiIiIIi.liiiIIllIl(var15);
                  lliIilIIiiliIilIIi = liiIiIIiiiiIiIIi.lIiiIiIlilli();
                  IiiIilIIiliiIilIIi = liiIiIIiiiiIiIIi.lIiiIiIlilli();
                  iiiIilIIiIIIlilIIi = class_12249.method_75994(liiIiIIiiiiIiIIi.lilllliiil);
               }

               float var16 = (float)var15.method_22683().method_4489() / (float)Math.max(1, py);
               var23 ^= ((long)Math.max(8, Math.round((var12 - var11) * var16)) << 32 ^ var23) & -1L << 32;
               var23 ^= ((long)Math.max(8, Math.round((var14 - var13) * var16)) ^ var23) & -1L >>> 32;
               float var19 = 55.0F;
               IIIiilIIilIIiilIIi.setFrustum((var11 - (float)py / 2.0F) * var19 / 1100.0F, (var12 - (float)py / 2.0F) * var19 / 1100.0F, -(var14 - (float)sh / 2.0F) * var19 / 1100.0F, -(var13 - (float)sh / 2.0F) * var19 / 1100.0F, var19, 22000.0F);
               IliiIilliiIi.lilIliilIl();
               if (iIiIilIIiIliIilIIi == null) {
                  iIiIilIIiIliIilIIi = new llIIiIililIIiIil(Iilllilliill<invokedynamic>(), IIIiIillIIiIil.IiIilIiIiliIilIiIi, IIIiIillIIiIil.iiIilIiIiIIlilIiIi);
               }

               iIiIilIIiIliIilIIi.iliIiiliiiii((int)(var23 >>> 32), (int)var23);
               iIiIilIIiIliIilIIi.IiIlliIliiIl(0, 0, (int)(var23 >>> 32), (int)var23, IIIiilIIilIIiilIIi, (q, swx) -> IIIllIIliIIl(q, swx, w, ctx, px, py, sh));
               Matrix4f var20 = IIIiiIillIIiiIil.liiiIIllIl().method_23760().method_23761();
               iIiIilIIiIliIilIIi.IIlllIlliIll(var20, var11, var13, var12 - var11, var14 - var13, iIiIilIIiIliIilIIi.Ililllililil(0.0F), iIiIilIIiIliIilIIi.Iiilliiliiil(0.0F), iIiIilIIiIliIilIIi.Ililllililil((float)((int)(var23 >>> 32))), iIiIilIIiIliIilIIi.Iiilliiliiil((float)((int)var23)), var11, var13, var12, var14, 0.0F, var9);
               IiIlliIliiIl(sw, w, ctx, px, IlIlilIIillIlilIIi);
            } catch (Throwable var26) {
               lIIlilIIiiIIlilIIi = true;

               try {
                  class_310.method_1551().field_1773.method_72911().method_73003().method_72953();
               } catch (Throwable var25) {
               }
            }

         }
      }
   }

   static boolean liiiIIllIl(int py) {
      return py >= 26;
   }

   private static void IIIllIIliIIl(class_4587 px, class_11659 sw, int m, int w, int q, int py, int sh) {
      long var17 = 6615444254920496453L;
      long var15 = 7048986070582325759L;
      px.method_46416(0.0F, 0.0F, -1100.0F);
      px.method_22905(1.0F, -1.0F, 1.0F);
      px.method_46416((float)(-py) / 2.0F, (float)(-sh) / 2.0F, 0.0F);
      var15 ^= ((long)iliIiiliiiii() << 32 ^ var15) & -1L << 32;
      float var8 = (float)IIIiIillIIiIil.liiIiIiIiiiiIiIiIi;

      for(long var20 = var15 ^ (0L ^ var15) & -1L >>> 32; (int)var20 < 2; var20 ^= (var20 ^ var20 + (long)1) & -1L >>> 32) {
         class_630 var10 = (int)var20 == 0 ? lliIilIIiiliIilIIi : IiiIilIIiliiIilIIi;
         var17 ^= ((long)((int)(var20 >>> 32) != (int)var20 && (!(iIllilIIiIlllilIIi[(int)var20] >= 0.0F) || !(iIllilIIiIlllilIIi[(int)var20] < 1.4F)) ? 0 : 1) << 32 ^ var17) & -1L << 32;
         float var12 = var8 * 1.7F + (float)((int)var20) * 1.9F;
         float var13 = -9.0F * (float)Math.sin((double)Math.min(1.0F, IIllilIIilIllilIIi[(int)var20]) * Math.PI);
         IlIlllIlilIl(var10, (int)var20, (boolean)((int)(var17 >>> 32)), var12, var8);
         px.method_22903();
         px.method_46416(iIlIlllllill(m, q, (int)var20), (float)w - 2.2F + var13, 6.0F);
         px.method_22907((new Quaternionf()).rotateY((float)Math.toRadians((int)var20 == 0 ? (double)-24.0F : (double)24.0F)));
         px.method_22907((new Quaternionf()).rotateX(-0.12F));
         float var14 = 30.4F;
         px.method_22905(var14, var14, -var14);
         sw.method_73492(var10, px, iiiIilIIiIIIlilIIi, 15728880, class_4608.field_21444, (class_1058)null, -5678, (class_11683.class_11792)null);
         px.method_22909();
      }

   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ 2412) ^ 120) - '찟') + var5) ^ '긥') + 21397) ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ 2412) ^ 120) - '찟') + var5) ^ '긥') + 21397) ^ var5) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
