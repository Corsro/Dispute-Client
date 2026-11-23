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

public enum illiiilIiliiil {
   liiIIilliiiiIIilli(iliIiiliiiii<invokedynamic>(), 0.5F, IililIllililIl.liiiIIllIl(IIlIlIllIlIlIl.lllIIIIllillIIIIll), IililIllililIl.liiiIIllIl(IIlIlIllIlIlIl.IilIIIIlllilIIIIll), IililIllililIl.liiiIIllIl(IIlIlIllIlIlIl.iilIIIIllIIiIIIIll), 0.2F, 2.0F, false, 1.0F);

   public final float iiIlIilliIIllIilli;
   public final float llIlIilliilIlIilli;
   public final float illlIilliIillIilli;
   iilIIilliIIiIIilli(iliIiiliiiii<invokedynamic>(), 0.5F, 0.12F, 0.22F, 0.2F, 0.07F, 2.0F, false, 0.0F);

   public final boolean lillIilliiillIilli;
   lIiIIilliiIiIIilli(iliIiiliiiii<invokedynamic>(), 0.5F, 0.12F, 0.24F, 0.22F, 0.07F, 2.0F, false, 0.0F);

   public final String iIIlIilliIlIlIilli;
   iliIIilliIiiIIilli(iliIiiliiiii<invokedynamic>(), 0.45F, 0.12F, 0.24F, 0.22F, 0.05F, 4.0F, false, 0.9F),
   IIIlIillilIIlIilli(iliIiiliiiii<invokedynamic>(), -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, -1.0F, false, 0.0F);

   public final float IiIlIilliliIlIilli;
   public final float IlllIillillllIilli;
   IliIIillilliIIilli(iliIiiliiiii<invokedynamic>(), 0.28F, 0.1F, 0.18F, 0.16F, 0.05F, 1.5F, false, 0.9F);

   public final float IIilIillilIilIilli;
   public final float lIllIilliiIllIilli;

   public IIliIiilIliIii liiiIIllIl() {
      return this == liiIIilliiiiIIilli ? IIliIiilIliIii.lIIIlIiIIl : IIliIiilIliIii.IIIIlIiIIl;
   }

   public boolean IliIlllilIi() {
      return this != IIIlIillilIIlIilli;
   }

   private illiiilIiliiil(String renderCorrect, float wrongStateTint, float missingTint, float wrongBlockTint, float var7, float minOutlineOpacity, float interiorFadeRadius, boolean var10, float label) {
      this.iIIlIilliIlIlIilli = renderCorrect;
      this.llIlIilliilIlIilli = wrongStateTint;
      this.IiIlIilliliIlIilli = missingTint;
      this.iiIlIilliIIllIilli = wrongBlockTint;
      this.lIllIilliiIllIilli = var7;
      this.IlllIillillllIilli = minOutlineOpacity;
      this.illlIilliIillIilli = interiorFadeRadius;
      this.lillIilliiillIilli = var10;
      this.IIilIillilIilIilli = label;
   }

   // $FF: synthetic method
   private static illiiilIiliiil[] lIiiIiIlilli() {
      return new illiiilIiliiil[]{iilIIilliIIiIIilli, lIiIIilliiIiIIilli, IliIIillilliIIilli, iliIIilliIiiIIilli, liiIIilliiiiIIilli, IIIlIillilIIlIilli};
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) << 15))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) << 15))) >>> 3))) + 9272))) ^ var5))) ^ 26666) << 8 | (char)((char)(-((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) << 15))) << 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) ^ var5) + var5) + var5) + var5) ^ var5) - var5) << 15))) >>> 3))) + 9272))) ^ var5))) ^ 26666) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String[] IilliliilIIi() {
      long var3 = 974320878450980029L;
      illiiilIiliiil[] var0 = values();
      String[] var1 = new String[var0.length];

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < var0.length; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = var0[(int)(var5 >>> 32)].iIIlIilliIlIlIilli;
      }

      return var1;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8953379085640081208L ^ Long.rotateLeft(488186961849589369L, 16) ^ 299669499120220615L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1846180056015926532L ^ Long.rotateLeft(-7082212261834386631L, 34) ^ 8798346373109319584L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 219782410862680125L ^ Long.rotateLeft(-5250543142746433781L, 53) ^ 3539299119475896253L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6190028425871846556L ^ Long.rotateLeft(-932309400279410942L, 43) ^ -4008945898410632893L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8882550204127672535L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8671636790489570988L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3118831030104888453L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2131100203732002411L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6350910726798948453L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2024749396219766921L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 17750) >>> 12 | (char)(var4[var5] - 17750) << 4) + var5) - 18979) + 26119) + var5) - var5) ^ 183) ^ '\uda60'))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static illiiilIiliiil iIlIlllllill(String label) {
      long var5 = 5958805040073739050L;
      illiiilIiliiil[] var1 = values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         illiiilIiliiil var4 = var1[(int)var8];
         if (var4.iIIlIilliIlIlIilli.equals(label)) {
            return var4;
         }
      }

      return lIiIIilliiIiIIilli;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') >>> 4 | (char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') << 12) ^ '쪠') + '넂') ^ var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') >>> 4 | (char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') << 12) ^ '쪠') + '넂') ^ var5))) << 3) ^ '艪'))))) + '閳'))) >>> 12 | (char)(~((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') >>> 4 | (char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') << 12) ^ '쪠') + '넂') ^ var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') >>> 4 | (char)((char)((char)((char)(-((char)(~((char)(~var4[var5]))))) + '\udb21') + var5) ^ '첼') << 12) ^ '쪠') + '넂') ^ var5))) << 3) ^ '艪'))))) + '閳'))) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 1 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 15) - var5))) + '넲') ^ var5) ^ 26699) >>> 9 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) >>> 1 | (char)(var4[var5] << 4 | var4[var5] >>> 12) << 15) - var5))) + '넲') ^ var5) ^ 26699) << 7))) + 22601) + 32552));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 4243))) - var5) ^ 9850) ^ var5) + 24092) + 13222) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 4243))) - var5) ^ 9850) ^ var5) + 24092) + 13222) << 14) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 4243))) - var5) ^ 9850) ^ var5) + 24092) + 13222) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 4243))) - var5) ^ 9850) ^ var5) + 24092) + 13222) << 14) << 6) + '蟒') + '謷'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
