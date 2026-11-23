package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Base64;
import java.util.Deque;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IiiIlIIiliiIlIIi {
   private static long Iiililliil;
   private static volatile int IIIiilliil = 1;
   private static final Deque<iIiliiIiIliliiIi> lIililliil = new ArrayDeque();
   private static final double lillilliil = 1.0E-4;
   private static volatile boolean lIIiilliil;
   private static int llililliil = -1;
   private static final long illlilliil = 15000L;
   private static final long Iillilliil = 1000L;
   private static volatile double liililliil = (double)-1.0F;
   private static int ilililliil;
   private static long Ilililliil;
   private static final int IIililliil = 8;
   private static long iIililliil;
   private static final long iillilliil = 6000L;
   private static volatile double iiililliil;

   public static void iIlIlllllill() {
      lIililliil.clear();
      iIililliil = 0L;
      Ilililliil = 0L;
      llililliil = -1;
      ilililliil = 0;
      Iiililliil = 0L;
      liililliil = (double)-1.0F;
      iiililliil = (double)0.0F;
      lIIiilliil = false;
      IIIiilliil = 1;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) ^ 17240) + var5) + var5) ^ var5))))) ^ var5))))) << 3 | (char)(~((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) ^ 17240) + var5) + var5) ^ var5))))) ^ var5))))) >>> 13))) ^ 30443) ^ 'ꌓ') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void liiiIIllIl(int placed, int total) {
      lIililliil.clear();
      lIililliil.addLast(new iIiliiIiIliliiIi(0L, placed));
      iIililliil = 0L;
      Iiililliil = 0L;
      llililliil = placed;
      ilililliil = total;
      liililliil = (double)-1.0F;
      iiililliil = (double)0.0F;
      lIIiilliil = false;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4028285105839494748L ^ Long.rotateLeft(-2069549064783157249L, 45) ^ 1926663310361800428L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7342228135167312367L ^ Long.rotateLeft(-389058274797842032L, 28) ^ -3674667045179418263L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 620145768039627113L ^ Long.rotateLeft(-4186626772064397070L, 60) ^ -6923554700870351511L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6160513995047672309L ^ Long.rotateLeft(8336631870159774030L, 59) ^ -4863125183862099737L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7187836140165975209L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5808769345835905060L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5333697199991623575L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3470083684995908768L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -9078676432937854073L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8195046702913617868L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) << 10 | (char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) >>> 6) >>> 2 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) << 10 | (char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) >>> 6) << 14) + 19665) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) << 10 | (char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) >>> 6) >>> 2 | (char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) << 10 | (char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) ^ var5) ^ '\udc48') + var5) << 10) >>> 6) << 14) + 19665) << 6) - '祖'))))) + var5) ^ '\uf489'))) + var5) ^ '\uf3fb'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double IilliliilIIi() {
      return liililliil;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uf4ec') + '識') - var5) ^ var5) + var5) + var5) ^ 'ꑷ') - var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '\uf4ec') + '識') - var5) ^ var5) + var5) + var5) ^ 'ꑷ') - var5) << 3) ^ var5) - 'ꀻ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double lIiiIiIlilli() {
      return iiililliil;
   }

   public static void IliIlllilIi(int nowMs, int active, int builderCount, boolean total, long placed) {
      long var15 = 2053830298476747234L;
      IIIiilliil = Math.max(1, builderCount);
      if (active <= 0) {
         iIlIlllllill();
      } else {
         nowMs = Math.max(0, Math.min(nowMs, active));
         long var6 = Ilililliil == 0L ? 0L : Math.max(0L, Math.min(1000L, placed - Ilililliil));
         Ilililliil = placed;
         if (llililliil >= 0 && active == ilililliil && nowMs >= llililliil - 8) {
            if (total) {
               iIililliil += var6;
               if (nowMs > llililliil) {
                  Iiililliil = iIililliil;
               }

               llililliil = nowMs;
               lIililliil.addLast(new iIiliiIiIliliiIi(iIililliil, nowMs));

               while(lIililliil.size() > 2 && iIililliil - ((iIiliiIiIliliiIi)lIililliil.peekFirst()).IliIlllilIi() > 15000L) {
                  lIililliil.removeFirst();
               }

               iIiliiIiIliliiIi var8 = (iIiliiIiIliliiIi)lIililliil.peekFirst();
               long var9 = iIililliil - var8.IliIlllilIi();
               var15 ^= ((long)(nowMs - var8.liiiIIllIl()) << 32 ^ var15) & -1L << 32;
               double var12 = var9 > 0L ? Math.max((double)0.0F, (double)((int)(var15 >>> 32)) / (double)var9) : (double)0.0F;
               iiililliil = var12 * (double)1000.0F;
               var15 ^= ((long)(active - nowMs) ^ var15) & -1L >>> 32;
               lIIiilliil = (int)var15 > 0 && iIililliil - Iiililliil > 6000L;
               if ((int)var15 <= 0) {
                  liililliil = (double)0.0F;
               } else if (!(var12 <= 1.0E-4) && !lIIiilliil) {
                  liililliil = (double)((int)var15) / var12 / (double)1000.0F;
               } else {
                  liililliil = (double)-1.0F;
               }

            }
         } else {
            liiiIIllIl(nowMs, active);
         }
      }
   }

   public static String IIlllIlliIll(double seconds) {
      if (seconds <= (double)0.0F) {
         return Illlllllilll<invokedynamic>();
      } else {
         long var2 = (long)Math.ceil(seconds);
         long var4 = var2 / 3600L;
         long var6 = var2 % 3600L / 60L;
         long var8 = var2 % 60L;
         if (var4 > 0L) {
            return var4 + Illlllllilll<invokedynamic>() + var6 + Illlllllilll<invokedynamic>();
         } else {
            return var6 > 0L ? var6 + Illlllllilll<invokedynamic>() + var8 + Illlllllilll<invokedynamic>() : var8 + Illlllllilll<invokedynamic>();
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) << 12) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) << 12) << 3))))) + var5) - 22725) >>> 4 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) << 12) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) >>> 4 | (char)((char)((char)((char)(var4[var5] + 31457) + var5) + var5) - var5) << 12) << 3))))) + var5) - 22725) << 12) + var5) - var5))) ^ 14302))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IiIlliIliiIl() {
      double var0 = liililliil;
      return var0 < (double)0.0F ? "" : IIlllIlliIll(var0);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 7 | (char)((char)(-var4[var5]) ^ var5) << 9) - var5) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 7 | (char)((char)(-var4[var5]) ^ var5) << 9) - var5) << 8) ^ '꥓') ^ var5) + '퐶') - '\ue5e9') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 7 | (char)((char)(-var4[var5]) ^ var5) << 9) - var5) >>> 8 | (char)((char)((char)((char)(-var4[var5]) ^ var5) >>> 7 | (char)((char)(-var4[var5]) ^ var5) << 9) - var5) << 8) ^ '꥓') ^ var5) + '퐶') - '\ue5e9') >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private IiiIlIIiliiIlIIi() {
   }

   public static boolean IIIllIIliIIl() {
      return lIIiilliil;
   }

   public static int iliIiiliiiii() {
      return IIIiilliil;
   }

   public static boolean IlIlllIlilIl() {
      return liililliil >= (double)0.0F;
   }
}
