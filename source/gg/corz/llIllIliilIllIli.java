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
import net.minecraft.class_2960;
import net.minecraft.class_3532;

final class llIllIliilIllIli {
   final llIllIliilIllIli iiliIIllIi;
   float iilIlIllIi;
   float illIlIllIi;
   float[] ilIIlIllIi;
   float[] IiIIlIllIi;
   float lliIlIllIi;
   float llIllIllIi;
   float liIIlIllIi = -1.0F;
   boolean iiIIlIllIi;
   float lilIlIllIi;
   float iIiIlIllIi;
   final int IlliIIllIi;
   final String iIliIIllIi;
   boolean lIlIlIllIi;
   float lIIllIllIi;
   String liiiIIllIi;
   iiIiiilIIliiil lliiIIllIi;
   final String liliIIllIi;
   String iiiiIIllIi;
   float ilIllIllIi;
   float IlIllIllIi;
   final String illiIIllIi;
   ilIllIiIll IliiIIllIi;
   float IliIlIllIi;
   float IIIllIllIi;
   lliliIIiililiIIi IiiiIIllIi;
   float IIiIlIllIi;
   class_2960 lIIIlIllIi;
   boolean IIlIlIllIi;
   float lllIlIllIi;
   final Class<? extends ilIllIiIll> IiliIIllIi;
   float lIiIlIllIi;
   final String lIliIIllIi;
   int iIIIlIllIi;
   lliliIIiililiIIi iliiIIllIi;
   boolean iIlIlIllIi;
   float iiiIlIllIi;
   String[] llIIlIllIi;
   float liiIlIllIi;
   final boolean IIiiIIllIi;
   final int llliIIllIi;
   float iIIllIllIi;
   boolean iIiiIIllIi;
   float IilIlIllIi;
   float iliIlIllIi = -1.0F;
   boolean IllIlIllIi;
   float IIIIlIllIi = -1.0F;
   float IiiIlIllIi;
   String lIiiIIllIi;
   int[] IlIIlIllIi;

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) + 19717))) - var5))) ^ '깷') << 4 | (char)((char)(-((char)((char)(-((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) + 19717))) - var5))) ^ '깷') >>> 12) - var5) + '鐦') + '섍') + var5) - 18894))) + 'ꭞ') + 430))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   void Iilllilliill(int z) {
      if (this.IiiiIIllIi != null && z >= 0) {
         if (!llIlIiiilIlIii.IiilIilIIl[z].equalsIgnoreCase(this.IiiiIIllIi.Iilllilliill())) {
            this.IiiiIIllIi.IIillIiliIil(llIlIiiilIlIii.IiilIilIIl[z]);
         }

      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) << 1 | (char)(var4[var5] << 7 | var4[var5] >>> 9) >>> 15))))) << 5 | (char)(~((char)(~((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) << 1 | (char)(var4[var5] << 7 | var4[var5] >>> 9) >>> 15))))) >>> 11) + 9052))) + 19892) - 10910) ^ 23527))))))))) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   float IlIillIiilIi() {
      return 16.0F + this.Ililllililil() * 0.82F + 2.0F + 12.0F;
   }

   boolean IilliliilIIi() {
      if (!this.liiiIIllIl()) {
         return false;
      } else if (this.iiliIIllIi == null) {
         return !this.IliiIIllIi.IliIlllilIi();
      } else {
         return this.iiliIIllIi.iIlIlllllill() && !this.lliiIIllIi.Iilllilliill();
      }
   }

   class_2960 IIIllIIliIIl() {
      if (this.lIIIlIllIi == null) {
         class_2960 var10001;
         switch (this.IlliIIllIi) {
            case 1 -> var10001 = lIlIIiliIlIIil.IllIllllIl(this.illiIIllIi);
            case 2 -> var10001 = lIlIIiliIlIIil.Iilililiiili();
            case 3 -> var10001 = lIlIIiliIlIIil.illIlIilIl(this.illiIIllIi);
            default -> var10001 = lIlIIiliIlIIil.IIIIllIIIl(this.illiIIllIi);
         }

         this.lIIIlIllIi = var10001;
      }

      return this.lIIIlIllIi;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - 9399) ^ '똱'))))))))) - var5) ^ var5) << 11 | (char)((char)((char)(-((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)(~var4[var5]) - var5) + var5) - 9399) ^ '똱'))))))))) - var5) ^ var5) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   String IIillIiliIil() {
      if (this.IiiiIIllIi == null) {
         return this.IiIlliIliiIl();
      } else {
         String var1 = this.IiiiIIllIi.Iilllilliill();
         if (!var1.equals(this.liiiIIllIi)) {
            this.liiiIIllIi = var1;
            this.iiiiIIllIi = this.lIliIIllIi + Illillliilli<invokedynamic>() + var1;
            this.IIIIlIllIi = -1.0F;
         }

         return this.iiiiIIllIi;
      }
   }

   float IlIlllIlilIl() {
      if (this.liIIlIllIi < 0.0F) {
         this.liIIlIllIi = llilliilililliil.llIIlilIIl(this.lIliIIllIi);
      }

      return this.liIIlIllIi;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') >>> 11 | (char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') << 5) ^ '\uf33a') + '\ud9fc') << 3 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') >>> 11 | (char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') << 5) ^ '\uf33a') + '\ud9fc') >>> 13) ^ var5))) << 8 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') >>> 11 | (char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') << 5) ^ '\uf33a') + '\ud9fc') << 3 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') >>> 11 | (char)((char)((char)(~((char)(var4[var5] - 21290))) - var5) - '鐖') << 5) ^ '\uf33a') + '\ud9fc') >>> 13) ^ var5))) >>> 8))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   int iliIiiliiiii() {
      return this.IIiiIIllIi && this.iIIIlIllIi > 0 ? class_3532.method_15340(this.iliiIIllIi.Ililllililil(), 0, this.iIIIlIllIi - 1) : 0;
   }

   float Ililllililil() {
      if (this.IiiiIIllIi == null) {
         return this.Iiilliiliiil();
      } else {
         String var1 = this.IIillIiliIil();
         if (this.IIIIlIllIi < 0.0F) {
            this.IIIIlIllIi = llilliilililliil.llIIlilIIl(var1);
         }

         return this.IIIIlIllIi;
      }
   }

   int Illlllllilll() {
      long var3 = 3745661996240696201L;
      if (this.IiiiIIllIi == null) {
         return -1;
      } else {
         String var1 = this.IiiiIIllIi.Iilllilliill();

         for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < llIlIiiilIlIii.IiilIilIIl.length; var5 += 4294967296L) {
            if (llIlIiiilIlIii.IiilIilIIl[(int)(var5 >>> 32)].equalsIgnoreCase(var1)) {
               return (int)(var5 >>> 32);
            }
         }

         return 0;
      }
   }

   boolean iIlIlllllill() {
      if (!this.liiiIIllIl()) {
         return false;
      } else if (this.iiliIIllIi == null) {
         return this.IliiIIllIi.IliIlllilIi();
      } else {
         return this.iiliIIllIi.iIlIlllllill() && this.lliiIIllIi.Iilllilliill();
      }
   }

   String IiIlliIliiIl() {
      return this.IIiiIIllIi && this.iIIIlIllIi > 0 ? this.llIIlIllIi[this.iliIiiliiiii()] : this.lIliIIllIi;
   }

   llIllIliilIllIli IIlilIliiIli() {
      for(llIllIliilIllIli var1 = this; var1 != null; var1 = var1.iiliIIllIi) {
         if (var1.IIlllIlliIll()) {
            return var1;
         }
      }

      return null;
   }

   float IIIilIIiiIIi() {
      return this.IIiiIIllIi ? 43.0F : 24.0F;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) << 13))))) - var5))) ^ var5))) ^ 4144) - 'ힾ') << 1 | (char)((char)((char)(-((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) << 13))))) - var5))) ^ var5))) ^ 4144) - 'ힾ') >>> 15) << 8 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) << 13))))) - var5))) ^ var5))) ^ 4144) - 'ힾ') << 1 | (char)((char)((char)(-((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) >>> 3 | (char)((char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) << 12 | (char)(~((char)((char)((char)((char)(var4[var5] - 19470) ^ '둆') ^ 6451) - '\udbc8'))) >>> 4) << 13))))) - var5))) ^ var5))) ^ 4144) - 'ힾ') >>> 15) >>> 8) - var5) ^ 'ꒁ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3001352181782194344L ^ Long.rotateLeft(6309405902034164801L, 4) ^ 6961097050773915401L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -593169986667365048L ^ Long.rotateLeft(-8593033537855134443L, 17) ^ -3406246254923347142L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7291141223468158273L ^ Long.rotateLeft(-3431925382104779639L, 8) ^ -38514706744977123L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7133359620282376568L ^ Long.rotateLeft(5660980016780866809L, 21) ^ 7472853824613555846L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1224874610755961701L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7277921146913671133L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9062951105514314468L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3774611559871290514L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6403912526259388038L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7916161078011582768L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iiiiliiiiiii<invokedynamic>());
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

   llIllIliilIllIli IiIiliIiiiIi(String settingName) {
      this.lIiiIIllIi = settingName;
      return this;
   }

   void IliIlllilIi() {
      long var5 = -1303580915273278350L;
      if (!this.iIiiIIllIi) {
         this.iIiiIIllIi = true;
         this.IliiIIllIi = llilIllililIll.iliIiiliiiii(this.IiliIIllIi);
         if (this.IliiIIllIi != null) {
            for(IilliIllilliIl var2 : this.IliiIIllIi.IiIlliIliiIl()) {
               if (this.liliIIllIi != null && var2 instanceof iiIiiilIIliiil) {
                  iiIiiilIIliiil var3 = (iiIiiilIIliiil)var2;
                  if (var2.IliIlllilIi().equalsIgnoreCase(this.liliIIllIi)) {
                     this.lliiIIllIi = var3;
                  }
               }

               if (this.IIiiIIllIi && var2 instanceof lliliIIiililiIIi) {
                  lliliIIiililiIIi var8 = (lliliIIiililiIIi)var2;
                  if (var2.IliIlllilIi().equalsIgnoreCase(Illillliilli<invokedynamic>())) {
                     this.iliiIIllIi = var8;
                  }
               }

               if (this.lIiiIIllIi != null && var2 instanceof lliliIIiililiIIi) {
                  lliliIIiililiIIi var9 = (lliliIIiililiIIi)var2;
                  if (var2.IliIlllilIi().equalsIgnoreCase(this.lIiiIIllIi)) {
                     this.IiiiIIllIi = var9;
                  }
               }
            }

            if (this.iliiIIllIi != null) {
               List var7 = this.iliiIIllIi.IiIiliIiiiIi();
               this.iIIIlIllIi = var7.size();
               this.IlIIlIllIi = new int[this.iIIIlIllIi];
               this.llIIlIllIi = new String[this.iIIIlIllIi];
               this.ilIIlIllIi = new float[this.iIIIlIllIi];
               this.IiIIlIllIi = new float[this.iIIIlIllIi];

               for(var5 ^= (0L ^ var5) & -1L << 32; (int)(var5 >>> 32) < this.iIIIlIllIi; var5 += 4294967296L) {
                  String var10 = (String)var7.get((int)(var5 >>> 32));
                  this.IlIIlIllIi[(int)(var5 >>> 32)] = 2;
                  this.llIIlIllIi[(int)(var5 >>> 32)] = var10;
                  this.ilIIlIllIi[(int)(var5 >>> 32)] = -1.0F;

                  for(var5 ^= (0L ^ var5) & -1L >>> 32; (int)var5 < llIlIiiilIlIii.iiliIilIIl.length; var5 ^= (var5 ^ var5 + (long)1) & -1L >>> 32) {
                     if (llIlIiiilIlIii.iiliIilIIl[(int)var5].equalsIgnoreCase(var10)) {
                        this.IlIIlIllIi[(int)(var5 >>> 32)] = (int)var5;
                        this.llIIlIllIi[(int)(var5 >>> 32)] = llIlIiiilIlIii.IIiiIilIIl[(int)var5];
                     }
                  }
               }
            }

         }
      }
   }

   boolean liiiIIllIl() {
      if (this.IliiIIllIi == null) {
         return false;
      } else if (this.liliIIllIi != null && this.lliiIIllIi == null) {
         return false;
      } else {
         return !this.IIiiIIllIi || this.iliiIIllIi != null && this.iIIIlIllIi > 0;
      }
   }

   llIllIliilIllIli(String type, int parent, String glyph, int iconKind, Class<? extends ilIllIiIll> radio, String iconName, llIllIliilIllIli name, boolean setting) {
      this.lIliIIllIi = type;
      this.iIliIIllIi = llIlIiiilIlIii.IilliliilIIi(type);
      this.IlliIIllIi = parent;
      this.illiIIllIi = glyph;
      this.llliIIllIi = iconKind;
      this.IiliIIllIi = radio;
      this.liliIIllIi = iconName;
      this.iiliIIllIi = name;
      this.IIiiIIllIi = setting;
   }

   void lIiiIiIlilli(boolean on) {
      if (this.liiiIIllIl()) {
         if (this.iiliIIllIi != null) {
            if (on && !this.iiliIIllIi.iIlIlllllill()) {
               this.iiliIIllIi.lIiiIiIlilli(true);
            }

            if (this.lliiIIllIi.Iilllilliill() != on) {
               this.lliiIIllIi.IIillIiliIil(on);
            }
         } else if (this.IliiIIllIi.IliIlllilIi() != on) {
            this.IliiIIllIi.IIillIiliIil(on);
         }

      }
   }

   float Iiilliiliiil() {
      long var2 = 5719501132431322520L;
      if (this.IIiiIIllIi && this.iIIIlIllIi != 0) {
         var2 ^= ((long)this.iliIiiliiiii() << 32 ^ var2) & -1L << 32;
         if (this.ilIIlIllIi[(int)(var2 >>> 32)] < 0.0F) {
            this.ilIIlIllIi[(int)(var2 >>> 32)] = llilliilililliil.llIIlilIIl(this.llIIlIllIi[(int)(var2 >>> 32)]);
         }

         return this.ilIIlIllIi[(int)(var2 >>> 32)];
      } else {
         return this.IlIlllIlilIl();
      }
   }

   boolean IIlllIlliIll() {
      return this.IiiiIIllIi != null;
   }
}
