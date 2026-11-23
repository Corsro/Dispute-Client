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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IllIllllIl {
   private int iIIiIIlIlIiIIl;
   private int lIilIIliIilIIl = -1;
   private int liilIIliiilIIl;
   public static final int llllIIlilllIIl = 100;
   public static final int IillIIllillIIl = 200;
   private int IlilIIlllilIIl;
   private int iillIIlIIilIIl = -1073741824;
   private int IIIiIIllIIiIIl;
   private int ililIIlIiilIIl;

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5235427329324826661L ^ Long.rotateLeft(-6074140372154587662L, 48) ^ -3476515431058408656L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -9144204884920685954L ^ Long.rotateLeft(3527659764478761788L, 6) ^ 2764844783926626126L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3439351579730883022L ^ Long.rotateLeft(7815358479576333111L, 14) ^ 1631151005301455903L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7333267416160459937L ^ Long.rotateLeft(944238388483927214L, 46) ^ -2920959266867259379L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5323665374400672589L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8792034848240814691L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9100422777320691140L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2562886011219237031L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8578939827391488587L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8465418101878928953L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - 17279) >>> 9 | (char)((char)(var4[var5] - var5) - 17279) << 7) ^ 30249) ^ 2658) << 12 | (char)((char)((char)((char)((char)(var4[var5] - var5) - 17279) >>> 9 | (char)((char)(var4[var5] - var5) - 17279) << 7) ^ 30249) ^ 2658) >>> 4) ^ '袝') ^ 29790) + '頛') ^ var5) + '\ue730'))) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill() {
      ++this.iillIIlIIilIIl;
      if (this.lIilIIliIilIIl >= 0) {
         ++this.lIilIIliIilIIl;
      }

   }

   public int IIlllIlliIll() {
      return this.IIIiIIllIIiIIl;
   }

   public int iliIiiliiiii(int tick) {
      return tick - this.iillIIlIIilIIl;
   }

   public String Iilllilliill(int tick) {
      return String.format(Locale.ROOT, IIillIiliIil<invokedynamic>(), this.iliIiiliiiii(tick), this.IlilIIlllilIIl, this.ililIIlIiilIIl, this.liilIIliiilIIl, this.IIIiIIllIIiIIl, this.iIIiIIlIlIiIIl);
   }

   public static boolean IilliliilIIi(lIIiIIiiIIiIIi type, Iiilillliilill phase) {
      if (type == lIIiIIiiIIiIIi.lIlIiiiliiIlIiiili) {
         return false;
      } else if (type == lIIiIIiiIIiIIi.iiIIiiiliIIlIiiili) {
         return phase == Iiilillliilill.IliilIlIilliilIlIi;
      } else {
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '顥') ^ var5) - 9045) + var5) ^ 21605) - var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '顥') ^ var5) - 9045) + var5) ^ 21605) - var5) >>> 5))) + 10395))))) >>> 8 | (char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '顥') ^ var5) - 9045) + var5) ^ 21605) - var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '顥') ^ var5) - 9045) + var5) ^ 21605) - var5) >>> 5))) + 10395))))) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llIiIIIlilIiIIIl lIiiIiIlilli(lIIiIIiiIIiIIi tick, Iiilillliilill phase, int type) {
      if (IilliliilIIi(tick, phase)) {
         ++this.ililIIlIiilIIl;
         if (type - this.iillIIlIIilIIl > 100) {
            ++this.IIIiIIllIIiIIl;
            return llIiIIIlilIiIIIl.IIiliIllIl;
         } else {
            return llIiIIIlilIiIIIl.iilliIllIl;
         }
      } else {
         if (this.lIilIIliIilIIl < 0) {
            this.lIilIIliIilIIl = type;
         }

         ++this.liilIIliiilIIl;
         if (type - this.lIilIIliIilIIl > 200) {
            ++this.iIIiIIlIlIiIIl;
            return llIiIIIlilIiIIIl.lIiliIllIl;
         } else {
            return llIiIIIlilIiIIIl.iilliIllIl;
         }
      }
   }

   public int IIIllIIliIIl() {
      return this.liilIIliiilIIl;
   }

   public int IlIlllIlilIl() {
      return this.ililIIlIiilIIl;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 11903) >>> 3 | (char)((char)(-var4[var5]) - 11903) << 13) + var5) - var5) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - 11903) >>> 3 | (char)((char)(-var4[var5]) - 11903) << 13) + var5) - var5) << 4) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 11903) >>> 3 | (char)((char)(-var4[var5]) - 11903) << 13) + var5) - var5) >>> 12 | (char)((char)((char)((char)((char)(-var4[var5]) - 11903) >>> 3 | (char)((char)(-var4[var5]) - 11903) << 13) + var5) - var5) << 4) ^ var5) << 7) - 26390) - '蘚') ^ '器') - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(int tick) {
      this.iillIIlIIilIIl = tick;
      ++this.IlilIIlllilIIl;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) >>> 7))) << 11 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) >>> 7))) >>> 5) + var5) << 4 | (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) >>> 7))) << 11 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) << 9 | (char)((char)((char)(~((char)((char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) << 12 | (char)((char)(~var4[var5]) << 1 | (char)(~var4[var5]) >>> 15) >>> 4))) ^ var5) + var5) >>> 7))) >>> 5) + var5) >>> 12))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(int tick) {
      this.iillIIlIIilIIl = tick;
      this.lIilIIliIilIIl = -1;
      this.IlilIIlllilIIl = 0;
      this.ililIIlIiilIIl = 0;
      this.liilIIliiilIIl = 0;
   }

   public int Illlllllilll() {
      return this.iIIiIIlIlIiIIl;
   }

   public int IiIlliIliiIl() {
      return this.IlilIIlllilIIl;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 2979))) - var5) - 9578) >>> 13 | (char)((char)((char)(~((char)(var4[var5] + 2979))) - var5) - 9578) << 3) ^ var5) + var5) + 32147))))) >>> 10 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 2979))) - var5) - 9578) >>> 13 | (char)((char)((char)(~((char)(var4[var5] + 2979))) - var5) - 9578) << 3) ^ var5) + var5) + 32147))))) << 6))) - 14499) + 6470)))) + 8912))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
