package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;

public class iiiIIIlIIIlIIl {
   private static boolean illlIliIlIillIliIl = false;
   private static long IlllIliIlllllIliIl = 0L;

   public static void lIiiIiIlilli() {
      if (!IIiIIllIiIIl.IliIlllilIi()) {
         try {
            Iiiilliiil.IliIlllilIi(IliIlllilIi(), llilIllililIll.IilliliilIIi());
            IlllIliIlllllIliIl = System.currentTimeMillis();
         } catch (Exception var1) {
            System.err.println(IIIllIIliIIl<invokedynamic>() + var1.getMessage());
         }

      }
   }

   private static Path IliIlllilIi() {
      try {
         return FabricLoader.getInstance().getConfigDir().resolve(IIIllIIliIIl<invokedynamic>());
      } catch (Throwable var1) {
         return Path.of(System.getProperty(IIIllIIliIIl<invokedynamic>()), IIIllIIliIIl<invokedynamic>(), IIIllIIliIIl<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6141475494077889776L ^ Long.rotateLeft(-1687065539350657924L, 35) ^ -3402348926577986235L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1080349223419874935L ^ Long.rotateLeft(7571582211686091795L, 26) ^ 3227275957564496347L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2594832526143404004L ^ Long.rotateLeft(-4447574327846829907L, 23) ^ 6809933355602457182L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1416200071782227825L ^ Long.rotateLeft(4508576278436659057L, 58) ^ -6686343580471339818L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4829565239373475745L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6377794062543166866L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3386828045855813347L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8272532620012561447L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 898747928619228879L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7283176543718315107L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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

   public static void IilliliilIIi() {
      lIiiIiIlilli();
      illlIliIlIillIliIl = false;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '跘') + '꿕') << 3 | (char)((char)(var4[var5] - '跘') + '꿕') >>> 13) - var5) - 31115) - var5) ^ var5) ^ 21585))) ^ 32155))) << 4 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '跘') + '꿕') << 3 | (char)((char)(var4[var5] - '跘') + '꿕') >>> 13) - var5) - 31115) - var5) ^ var5) ^ 21585))) ^ 32155))) >>> 12))) ^ var5) + 30743) << 13 | (char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '跘') + '꿕') << 3 | (char)((char)(var4[var5] - '跘') + '꿕') >>> 13) - var5) - 31115) - var5) ^ var5) ^ 21585))) ^ 32155))) << 4 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '跘') + '꿕') << 3 | (char)((char)(var4[var5] - '跘') + '꿕') >>> 13) - var5) - 31115) - var5) ^ var5) ^ 21585))) ^ 32155))) >>> 12))) ^ var5) + 30743) >>> 3))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void iliIiiliiiii() {
      Iiiilliiil.iIlIlllllill(IliIlllilIi(), llilIllililIll.IilliliilIIi(), iiiIIIlIIIlIIl::IilliliilIIi);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) >>> 1 | (char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) << 15) >>> 9 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) >>> 1 | (char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) << 15) << 7) >>> 10 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) >>> 1 | (char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) << 15) >>> 9 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) >>> 1 | (char)((char)((char)((char)(~var4[var5]) + var5) ^ '踊') - var5) << 15) << 7) << 6) - 3860))))))) - 26352));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 13 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 3))) - var5) + var5) + '鶩') ^ var5) - 30291))) - '퐭') + var5) + var5) << 11 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) << 13 | (char)((char)(var4[var5] ^ var5) >>> 2 | (char)(var4[var5] ^ var5) << 14) >>> 3))) - var5) + var5) + '鶩') ^ var5) - 30291))) - '퐭') + var5) + var5) >>> 5))) + var5) + '왙'));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 23880) + '脤'))) >>> 11 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 23880) + '脤'))) << 5) ^ var5))) + 20844))) ^ var5) - var5) << 5 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 23880) + '脤'))) >>> 11 | (char)(~((char)((char)((char)((char)(var4[var5] - var5) ^ var5) + 23880) + '脤'))) << 5) ^ var5))) + 20844))) ^ var5) - var5) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void liiiIIllIl() {
      illlIliIlIillIliIl = true;
   }

   public static void iIlIlllllill() {
      if (illlIliIlIillIliIl && System.currentTimeMillis() - IlllIliIlllllIliIl > 500L) {
         lIiiIiIlilli();
         illlIliIlIillIliIl = false;
      }

   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - var5) + 25079))) + var5) + '윰'))) ^ 24425) >>> 8 | (char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - var5) + 25079))) + var5) + '윰'))) ^ 24425) << 8))))))) << 14 | (char)(-((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - var5) + 25079))) + var5) + '윰'))) ^ 24425) >>> 8 | (char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - var5) + 25079))) + var5) + '윰'))) ^ 24425) << 8))))))) >>> 2) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
