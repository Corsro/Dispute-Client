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

public final class iliIilIlIiiIilIl {
   public static final String llliillIll = "lava-locked";
   public static final String iIliillIll = "lava";
   public static final int lIliillIll = 32;
   public static final String liliillIll = "deep";
   public static final String IlliillIll = "trap";
   public static final String illiillIll = "underwater";
   public static final String IiliillIll = "protected";
   public static final String lIiiillIll = "hidden";
   public static final String iiliillIll = "unreachable";
   public static final int IIliillIll = 4;
   public static final String IIiiillIll = "hard";

   public static boolean iIlIlllllill(lIilIiliIilIil z, int y, int x, int c) {
      for(int var4 = -4; var4 <= 4; ++var4) {
         for(int var5 = -4; var5 <= 4; ++var5) {
            for(int var6 = -4; var6 <= 4; ++var6) {
               if ((var4 != 0 || var5 != 0 || var6 != 0) && lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(y + var4, x + var5, c + var6), 16)) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) << 15 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) >>> 1) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) << 15 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) >>> 1) >>> 4) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) << 15 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) >>> 1) << 12 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) << 15 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') >>> 4 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) << 5 | (char)(-((char)((char)(var4[var5] - var5) ^ var5))) >>> 11) + 30858) ^ '걼') << 12) >>> 1) >>> 4) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 13129) + var5))) >>> 3 | (char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 13129) + var5))) << 13) >>> 7 | (char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 13129) + var5))) >>> 3 | (char)(-((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - 13129) + var5))) << 13) << 9))))) ^ var5) - var5))) ^ 8337));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1214381423640144904L ^ Long.rotateLeft(4322672261116975400L, 41) ^ -8093742895663507994L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3081293799441077349L ^ Long.rotateLeft(-7800691556267280793L, 11) ^ 4930917786025250835L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 219011240994605715L ^ Long.rotateLeft(-903758857181948192L, 28) ^ -7690850869862094357L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4765294065573406282L ^ Long.rotateLeft(-4150580289815745082L, 18) ^ 6591400046086369151L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6750377370719060884L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6995346572080466666L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5332626451069318002L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4948436913858519337L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2662204148842007078L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1757813894672323019L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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

   public static boolean liiiIIllIl(lIilIiliIilIil z, int x, int y, int c) {
      return lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x + 1, y, c), 2) || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x - 1, y, c), 2) || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y + 1, c), 2) || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y - 1, c), 2) || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y, c + 1), 2) || lIilIiliIilIil.liiiIIllIl(z.IliIlllilIi(x, y, c - 1), 2);
   }

   private iliIilIlIiiIilIl() {
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)(-((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ '螊'))))) - var5))))) >>> 1 | (char)(-((char)(-((char)((char)(-((char)(~((char)((char)(var4[var5] ^ var5) ^ '螊'))))) - var5))))) << 15) - '탏'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 'ꖼ') + 31828) << 6 | (char)((char)(var4[var5] - 'ꖼ') + 31828) >>> 10) >>> 2 | (char)((char)((char)(var4[var5] - 'ꖼ') + 31828) << 6 | (char)((char)(var4[var5] - 'ꖼ') + 31828) >>> 10) << 14) ^ '낕') - '쩮'))))) - var5) + 'ꖗ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') << 13 | (char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') >>> 3) - 'ﰧ') ^ '봅') - var5) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') << 13 | (char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') >>> 3) - 'ﰧ') ^ '봅') - var5) >>> 13) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') << 13 | (char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') >>> 3) - 'ﰧ') ^ '봅') - var5) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') << 13 | (char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) + var5) ^ '흱') >>> 3) - 'ﰧ') ^ '봅') - var5) >>> 13) << 10) + var5) ^ var5) + var5) - 'ｄ') - 17092))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Iiiililiiili IliIlllilIi(lIilIiliIilIil ay, int ax, int protectedSpot, int dig, int stands, lliIllliliIlll c, boolean feetY, boolean az) {
      if (az) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else if (liiiIIllIl(ay, ax, protectedSpot, dig)) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else if (iIlIlllllill(ay, ax, protectedSpot, dig)) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else if (stands - protectedSpot > ((964751809 ^ 109) * -19 ^ -1150414820)) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else if (c == null) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else if (!c.IilliliilIIi().isEmpty()) {
         return Iiiililiiili.llIllllIlilIllllIl;
      } else if (feetY && !c.lIiiIiIlilli().isEmpty()) {
         return Iiiililiiili.llIllllIlilIllllIl;
      } else if (!feetY && !c.lIiiIiIlilli().isEmpty()) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else if (c.IlIlllIlilIl() > 0 && c.iliIiiliiiii() <= c.IlIlllIlilIl() + c.IIIllIIliIIl()) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else if (c.IIIllIIliIIl() > 0) {
         return Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      } else {
         return c.IiIlliIliiIl() > 0 ? Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>()) : Iiiililiiili.IliIlllilIi(IilliliilIIi<invokedynamic>());
      }
   }
}
