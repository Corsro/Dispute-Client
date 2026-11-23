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

public enum iliIIlIlIiiIIlIl {
   iiliIiilIl(1, 0),
   lIiiIiilIl(0, 1);

   private static final iliIIlIlIiiIIlIl[] iliiIiilIl = values();
   iIiiIiilIl(-1, 1),
   IiliIiilIl(0, -1),
   lliiIiilIl(-1, -1);

   public final int IiiiIiilIl;
   IIiiIiilIl(1, 1);

   public final int liiiIiilIl;
   IliiIiilIl(-1, 0),
   liliIiilIl(1, -1);

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) << 12 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) >>> 4))))) + 15878))) ^ 30575) << 2 | (char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) << 12 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) >>> 4))))) + 15878))) ^ 30575) >>> 14) << 5 | (char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) << 12 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) >>> 4))))) + 15878))) ^ 30575) << 2 | (char)((char)(~((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) << 12 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') << 14 | (char)((char)((char)(var4[var5] ^ 15552) - 6442) - '﷿') >>> 2))) - 15788) - var5) - var5))) >>> 5) >>> 4))))) + 15878))) ^ 30575) >>> 14) >>> 11));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)(-var4[var5]))) - var5) << 9 | (char)((char)(-((char)(-var4[var5]))) - var5) >>> 7))))) - '诸') ^ var5) + '茗') ^ var5) << 13 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)(-var4[var5]))) - var5) << 9 | (char)((char)(-((char)(-var4[var5]))) - var5) >>> 7))))) - '诸') ^ var5) + '茗') ^ var5) >>> 3) + '︿') - 26595) + '\uf509') - 3637))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)(-var4[var5]))) - var5) << 9 | (char)((char)(-((char)(-var4[var5]))) - var5) >>> 7))))) - '诸') ^ var5) + '茗') ^ var5) << 13 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)(-var4[var5]))) - var5) << 9 | (char)((char)(-((char)(-var4[var5]))) - var5) >>> 7))))) - '诸') ^ var5) + '茗') ^ var5) >>> 3) + '︿') - 26595) + '\uf509') - 3637))) >>> 7) ^ '횅'));
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
         var4[var5] = (char)((char)(-((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 29761) + '\uf447') + '똗') ^ var5) + 13700))) << 7 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - 29761) + '\uf447') + '똗') ^ var5) + 13700))) >>> 9) + 9358) + 23554))) >>> 1 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - 29761) + '\uf447') + '똗') ^ var5) + 13700))) << 7 | (char)(-((char)((char)((char)((char)((char)(var4[var5] - 29761) + '\uf447') + '똗') ^ var5) + 13700))) >>> 9) + 9358) + 23554))) << 15))) - '\ueb44'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8676390815583343645L ^ Long.rotateLeft(3115094953032006365L, 14) ^ 6857455879935961858L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5770642239089533622L ^ Long.rotateLeft(-996995598016064818L, 43) ^ -8875889687633938950L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6285863032075252479L ^ Long.rotateLeft(-6743168628144448254L, 49) ^ 8044421389500831104L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6142766295667458802L ^ Long.rotateLeft(8892602728466917151L, 50) ^ -5672768085735855459L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8770596192865505126L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2222150033552557561L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3786465247023297319L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -24813808660473644L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5809470133764758462L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1650215894024590607L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlllIlliIll<invokedynamic>());
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
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10) - 7329))) << 10 | (char)(~((char)((char)((char)(var4[var5] - var5) >>> 6 | (char)(var4[var5] - var5) << 10) - 7329))) >>> 6)) ^ '\uefe7') + 13004) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this.IiiiIiilIl == 0 || this.liiiIiilIl == 0;
   }

   public iliIIlIlIiiIIlIl liiiIIllIl(int steps) {
      return iliiIiilIl[Math.floorMod(this.ordinal() + steps, iliiIiilIl.length)];
   }

   public static iliIIlIlIiiIIlIl iIlIlllllill(double yaw) {
      double var2 = (yaw % (double)360.0F + (double)360.0F) % (double)360.0F;
      if (!(var2 > (double)315.0F) && !(var2 <= (double)45.0F)) {
         if (var2 <= (double)135.0F) {
            return IliiIiilIl;
         } else {
            return var2 <= (double)225.0F ? IiliIiilIl : iiliIiilIl;
         }
      } else {
         return lIiiIiilIl;
      }
   }

   // $FF: synthetic method
   private static iliIIlIlIiiIIlIl[] lIiiIiIlilli() {
      return new iliIIlIlIiiIIlIl[]{IiliIiilIl, liliIiilIl, iiliIiilIl, IIiiIiilIl, lIiiIiilIl, iIiiIiilIl, IliiIiilIl, lliiIiilIl};
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) >>> 8) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) >>> 8) >>> 1) ^ '왕') - var5) + '\ue30d') + 15688) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) >>> 8) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8)))) ^ 29027) ^ 27623) ^ var5) ^ '蚗') + 3571) >>> 8) >>> 1) ^ '왕') - var5) + '\ue30d') + 15688) >>> 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iliIIlIlIiiIIlIl IilliliilIIi(double yaw) {
      return iIlIlllllill(yaw + (double)180.0F);
   }

   private iliIIlIlIiiIIlIl(int dz, int var4) {
      this.IiiiIiilIl = dz;
      this.liiiIiilIl = var4;
   }
}
