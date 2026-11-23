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

public final class IiiiIIliliiiIIli {
   public int IIIIliIlIi;
   public int liiiIiIlIi;
   public int iliiIiIlIi;
   public int lliiIiIlIi;
   private IiIlIIIiliIlIIIi IliiIiIlIi;
   public int IiiiIiIlIi;
   public int iiiiIiIlIi;

   public IiIlIIIiliIlIIIi iIlIlllllill() {
      return this.IliiIiIlIi;
   }

   public static int IliIlllilIi(int pingMs) {
      return Math.max(2, Math.min(10, (int)Math.ceil((double)2.0F * (double)Math.max(0, pingMs) / (double)50.0F) + 1));
   }

   public void iliIiiliiiii() {
      this.IliiIiIlIi = null;
   }

   public IiIlIIIiliIlIIIi liiiIIllIl(long sneak, long clickTick, String face, int hitY, double invBefore, double hitZ, double ping, boolean supportType, int target, int hitX, int support) {
      this.IliiIiIlIi = new IiIlIIIiliIlIIIi(sneak, clickTick, face, hitY, invBefore, hitZ, ping, supportType, target, hitX, support);
      ++this.lliiIiIlIi;
      return this.IliiIiIlIi;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 2 | (char)(var4[var5] + var5) >>> 14))) + var5) + '諀') ^ 4180) ^ 5418) ^ var5) ^ var5) + var5))) - '\uf0bd') - 7309) >>> 11 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) << 2 | (char)(var4[var5] + var5) >>> 14))) + var5) + '諀') ^ 4180) ^ 5418) ^ var5) ^ var5) + var5))) - '\uf0bd') - 7309) << 5) + '뀎'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlilIiIlllilIiIl lIiiIiIlilli(int timeout, boolean grace, boolean serverAcked, int blockPresent, int tick, int invNow) {
      IiIlIIIiliIlIIIi var7 = this.IliiIiIlIi;
      if (var7 == null) {
         return IlilIiIlllilIiIl.iiIiIliIll;
      } else if (var7.iiIiIIliil != IlilIiIlllilIiIl.lIliIliIll && var7.iiIiIIliil != IlilIiIlllilIiIl.iIliIliIll && var7.iiIiIIliil != IlilIiIlllilIiIl.IlliIliIll) {
         if (grace) {
            if (var7.liIiIIliil > 0) {
               ++this.IIIIliIlIi;
               var7.liIiIIliil = 0;
               var7.IIliIIliil = IlIlllIlilIl<invokedynamic>();
            }

            if (!var7.IliIlllilIi()) {
               var7.llIiIIliil = timeout;
               if (var7.iiIiIIliil == IlilIiIlllilIiIl.iiIiIliIll) {
                  var7.iiIiIIliil = IlilIiIlllilIiIl.IIliIliIll;
                  ++this.iliiIiIlIi;
               }
            }

            if (serverAcked) {
               var7.iiIiIIliil = IlilIiIlllilIiIl.lIliIliIll;
               var7.IiIiIIliil = timeout;
               var7.IlIiIIliil = blockPresent;
               var7.IIliIIliil = IlIlllIlilIl<invokedynamic>();
               ++this.IiiiIiIlIi;
            }

            return var7.iiIiIIliil;
         } else if (var7.IliIlllilIi()) {
            if (++var7.liIiIIliil < Math.max(1, invNow)) {
               var7.iiIiIIliil = IlilIiIlllilIiIl.IIliIliIll;
               return var7.iiIiIIliil;
            } else {
               var7.iiIiIIliil = IlilIiIlllilIiIl.iIliIliIll;
               var7.IiIiIIliil = timeout;
               var7.ilIiIIliil = timeout - var7.llIiIIliil;
               var7.IlIiIIliil = blockPresent;
               var7.IIliIIliil = blockPresent >= var7.iIIiIIliil ? IlIlllIlilIl<invokedynamic>() : IlIlllIlilIl<invokedynamic>();
               ++this.liiiIiIlIi;
               return var7.iiIiIIliil;
            }
         } else {
            if (timeout - var7.lIIiIIliil > tick) {
               var7.iiIiIIliil = IlilIiIlllilIiIl.IlliIliIll;
               var7.IiIiIIliil = timeout;
               var7.IlIiIIliil = blockPresent;
               var7.IIliIIliil = blockPresent < var7.iIIiIIliil ? IlIlllIlilIl<invokedynamic>() : IlIlllIlilIl<invokedynamic>();
               ++this.iiiiIiIlIi;
            }

            return var7.iiIiIIliil;
         }
      } else {
         return var7.iiIiIIliil;
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] + '蝊'))))) - var5) << 14 | (char)((char)(-((char)(~((char)(var4[var5] + '蝊'))))) - var5) >>> 2) + var5) + var5) - '鬹'))))) << 8 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)(var4[var5] + '蝊'))))) - var5) << 14 | (char)((char)(-((char)(~((char)(var4[var5] + '蝊'))))) - var5) >>> 2) + var5) + var5) - '鬹'))))) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlilIiIlllilIiIl IilliliilIIi(int tick, boolean invNow, boolean serverAcked, int timeout, int blockPresent) {
      return this.lIiiIiIlilli(tick, invNow, serverAcked, timeout, blockPresent, 1);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8806487699703624602L ^ Long.rotateLeft(814494330993666323L, 11) ^ 214173242060597229L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2944980017020148189L ^ Long.rotateLeft(6654806197801433838L, 37) ^ -385960649728362131L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 5769570827705721869L ^ Long.rotateLeft(3286122581989752503L, 42) ^ -9024871505740195517L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 851279476570431795L ^ Long.rotateLeft(-3414821124171742301L, 37) ^ 8822733955096406300L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5988278623573216165L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4279476200369592842L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1793463170077861623L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7645087609060069552L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7662625996748146956L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2321745035838269363L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '逕') ^ 'ꁖ') + var5) ^ 25143) - 15804) - 9203) + var5) - '鯐') << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '逕') ^ 'ꁖ') + var5) ^ 25143) - 15804) - 9203) + var5) - '鯐') >>> 11) + var5) + 'ꕤ'))) - 3958) >>> 4 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '逕') ^ 'ꁖ') + var5) ^ 25143) - 15804) - 9203) + var5) - '鯐') << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + '逕') ^ 'ꁖ') + var5) ^ 25143) - 15804) - 9203) + var5) - '鯐') >>> 11) + var5) + 'ꕤ'))) - 3958) << 12) - 20586));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIIllIIliIIl() {
      return IlIlllIlilIl<invokedynamic>() + this.lliiIiIlIi + IlIlllIlilIl<invokedynamic>() + this.iliiIiIlIi + IlIlllIlilIl<invokedynamic>() + this.IiiiIiIlIi + IlIlllIlilIl<invokedynamic>() + this.liiiIiIlIi + IlIlllIlilIl<invokedynamic>() + this.iiiiIiIlIi + IlIlllIlilIl<invokedynamic>() + this.IIIIliIlIi;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 9313) << 3 | (char)(var4[var5] - 9313) >>> 13) ^ 25114) >>> 11 | (char)((char)((char)(var4[var5] - 9313) << 3 | (char)(var4[var5] - 9313) >>> 13) ^ 25114) << 5) - var5) << 5 | (char)((char)((char)((char)((char)(var4[var5] - 9313) << 3 | (char)(var4[var5] - 9313) >>> 13) ^ 25114) >>> 11 | (char)((char)((char)(var4[var5] - 9313) << 3 | (char)(var4[var5] - 9313) >>> 13) ^ 25114) << 5) - var5) >>> 11) + var5) ^ var5))) - var5) - var5) ^ '躴') ^ var5) + var5) ^ 'ꘜ')) + var5))) + '腳'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) >>> 13 | (char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) << 3) + 32233) ^ var5) >>> 13 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) >>> 13 | (char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) << 3) + 32233) ^ var5) << 3) - var5) << 13 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) >>> 13 | (char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) << 3) + 32233) ^ var5) >>> 13 | (char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) >>> 13 | (char)(-((char)((char)(var4[var5] ^ var5) + '銯'))) << 3) + 32233) ^ var5) << 3) - var5) >>> 3) + '鰧'))) + var5) - var5) ^ '锷')));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
