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

public class lilllIliiilllIli extends ilIllIiIll {
   private static boolean IliilIllIi;

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3285563346568287553L ^ Long.rotateLeft(-1083213773625623188L, 6) ^ 270349831787596727L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7914639826289514104L ^ Long.rotateLeft(-4600549899488948756L, 50) ^ -4303472666501513955L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5308009257584715443L ^ Long.rotateLeft(-1184817332448968541L, 32) ^ -4390808597207417664L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4093931027151291881L ^ Long.rotateLeft(1743813226722838515L, 40) ^ 420779629163421734L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8097910691114359450L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2439819953075801217L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4570740072239971527L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7711310327184852571L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5058137046923971085L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -828459661754730710L;
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(-var4[var5]) >>> 14 | (char)(-var4[var5]) << 2) ^ var5) - var5) ^ var5))))) + var5) ^ '썪') ^ var5) - var5) << 11 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(-var4[var5]) >>> 14 | (char)(-var4[var5]) << 2) ^ var5) - var5) ^ var5))))) + var5) ^ '썪') ^ var5) - var5) >>> 5) - var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\ude98') ^ var5)) - var5) ^ var5) << 12 | (char)((char)((char)((char)((char)(var4[var5] - '\ude98') ^ var5)) - var5) ^ var5) >>> 4))) - 20727) - var5) >>> 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '\ude98') ^ var5)) - var5) ^ var5) << 12 | (char)((char)((char)((char)((char)(var4[var5] - '\ude98') ^ var5)) - var5) ^ var5) >>> 4))) - 20727) - var5) << 3) - var5) + var5) ^ '輻'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean Iilllilliill() {
      return true;
   }

   public lilllIliiilllIli() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IlllIIIillllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{(new ililliIiIiilliIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), this::lIIlliIIll)).Ililllililil()});
   }

   public static boolean iiiIlIIIll() {
      return IliilIllIi;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] + '쓗') ^ 24242))))) + 10677) + var5) ^ '섖') + '\udb21') ^ var5) - var5))) ^ '萝') + var5))) >>> 4 | (char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(var4[var5] + '쓗') ^ 24242))))) + 10677) + var5) ^ '섖') + '\udb21') ^ var5) - var5))) ^ '萝') + var5))) << 12) + 'ꈗ') - '뉵') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void lIIlliIIll() {
      ilIllIiIll var2 = llilIllililIll.iliIiiliiiii(iIlIilIlIllIilIl.class);
      if (var2 instanceof iIlIilIlIllIilIl var1) {
         var1.lIIIiIlliIIIiIll();
      }

      List var14 = lllIIiillIIi.IliIlllilIi(llilIllililIll.IilliliilIIi());
      if (var14.isEmpty()) {
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
      } else {
         IliilIllIi = true;

         try {
            AutoCloseable var15 = Iliiiiilliiiii.IliIlllilIi().liiiIIllIl();

            try {
               for(ilIllIiIll var4 : var14) {
                  var4.IIillIiliIil(false);
               }
            } catch (Throwable var11) {
               if (var15 != null) {
                  try {
                     var15.close();
                  } catch (Throwable var10) {
                     var11.addSuppressed(var10);
                  }
               }

               throw var11;
            }

            if (var15 != null) {
               var15.close();
            }
         } catch (Exception var12) {
         } finally {
            IliilIllIi = false;
         }

         iiiIIIlIIIlIIl.IilliliilIIi();
         Iliiiiilliiiii.IliIlllilIi().iIlIlllllill(IliIlllilIi<invokedynamic>(), var14.size() == 1 ? IliIlllilIi<invokedynamic>() : IliIlllilIi<invokedynamic>() + var14.size() + IliIlllilIi<invokedynamic>(), false);
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5))) >>> 3 | (char)(~((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5))) << 13))) - var5))) ^ '錳') - var5))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(~var4[var5]))))) - var5) ^ 19370) >>> 13 | (char)((char)((char)(~((char)(-((char)(~var4[var5]))))) - var5) ^ 19370) << 3))) ^ '뻮') >>> 7 | (char)((char)(-((char)((char)((char)((char)(~((char)(-((char)(~var4[var5]))))) - var5) ^ 19370) >>> 13 | (char)((char)((char)(~((char)(-((char)(~var4[var5]))))) - var5) ^ 19370) << 3))) ^ '뻮') << 9) - '﵍') ^ 8704) + '흔'))) - 10427) ^ var5) - '쿠'))) - '齽'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Ililllililil() {
      this.lIIlliIIll();
   }
}
