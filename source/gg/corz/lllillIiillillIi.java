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
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lllillIiillillIi {
   public static final double IiilIIlIIi = (double)1.0F;
   public static final double liilIIlIIi = (double)0.125F;
   public static final double iiilIIlIIi = (double)0.875F;
   public static final double lIIiIIlIIi = (double)0.3125F;
   public static final double IIIiIIlIIi = (double)0.6875F;
   public static final double llilIIlIIi = 0.3;
   public static final double ililIIlIIi = 0.6;

   public static List<iIiliillIliliill> liiiIIllIl() {
      return List.of(new iIiliillIliliill((double)0.0F, (double)0.0F, (double)0.0F, (double)1.0F, (double)1.0F, (double)1.0F));
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(-((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))) + '鶰') >>> 4 | (char)((char)(-((char)((char)(-var4[var5]) >>> 2 | (char)(-var4[var5]) << 14))) + '鶰') << 12))) ^ 19500) + '걡'))) - '뮧'));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 3 | var4[var5] << 13))) ^ 27859) - 9883) + '\ue5e3') - 20369))) >>> 1 | (char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 3 | var4[var5] << 13))) ^ 27859) - 9883) + '\ue5e3') - 20369))) << 15) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IlIlllIlilIl(String boxes, List<iIiliillIliliill> block) {
      double var2 = IIIllIIliIIl(block, true);
      return String.format(Locale.ROOT, IiIlliIliiIl<invokedynamic>(), boxes, iIlIlllllill(block, (double)0.5F, (double)0.5F), var2, iliIiiliiiii(var2));
   }

   public static boolean lIiiIiIlilli(double cz, double cx) {
      return cz - 0.3 >= (double)0.125F && cz + 0.3 <= (double)0.875F && cx - 0.3 >= (double)0.125F && cx + 0.3 <= (double)0.875F;
   }

   public static List<iIiliillIliliill> IliIlllilIi() {
      double var0 = (double)0.125F;
      double var2 = (double)0.875F;
      double var4 = (double)0.6875F;
      double var6 = (double)0.625F;
      return List.of(new iIiliillIliliill((double)0.0F, var6, (double)0.0F, var0, (double)1.0F, (double)1.0F), new iIiliillIliliill(var2, var6, (double)0.0F, (double)1.0F, (double)1.0F, (double)1.0F), new iIiliillIliliill(var0, var6, (double)0.0F, var2, (double)1.0F, var0), new iIiliillIliliill(var0, var6, var2, var2, (double)1.0F, (double)1.0F), new iIiliillIliliill(var0, var6, var0, var2, var4, var2), new iIiliillIliliill((double)0.25F, (double)0.25F, (double)0.25F, (double)0.75F, var6, (double)0.75F), new iIiliillIliliill((double)0.375F, (double)0.0F, (double)0.375F, (double)0.625F, (double)0.25F, (double)0.625F));
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 11 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 5) ^ '鞕') + var5))) - 'ꓘ'))) - var5) + '頱') ^ var5) + 30260) - 18337) + 'ꕤ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 11 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 5) ^ '鞕') + var5))) - 'ꓘ'))) - var5) + '頱') ^ var5) + 30260) - 18337) + 'ꕤ') << 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 11 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 5) ^ '鞕') + var5))) - 'ꓘ'))) - var5) + '頱') ^ var5) + 30260) - 18337) + 'ꕤ') >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) << 11 | (char)((char)(~var4[var5]) >>> 15 | (char)(~var4[var5]) << 1) >>> 5) ^ '鞕') + var5))) - 'ꓘ'))) - var5) + '頱') ^ var5) + 30260) - 18337) + 'ꕤ') << 4) << 8) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lllillIiillillIi() {
   }

   public static boolean iliIiiliiiii(double drop) {
      return drop > 0.6;
   }

   public static double IIIllIIliIIl(List<iIiliillIliliill> alongX, boolean boxes) {
      long var9 = 5971560393581078751L;
      double var2 = (double)0.0F;

      for(long var11 = var9 ^ (0L ^ var9) & -1L << 32; (int)(var11 >>> 32) <= 100; var11 += 4294967296L) {
         double var5 = (double)((int)(var11 >>> 32)) / (double)100.0F;
         double var7 = boxes ? iIlIlllllill(alongX, var5, (double)0.5F) : iIlIlllllill(alongX, (double)0.5F, var5);
         var2 = Math.max(var2, (double)1.0F - var7);
      }

      return var2;
   }

   public static double IilliliilIIi(double cz, double cx) {
      return (double)1.0F - iIlIlllllill(IliIlllilIi(), cz, cx);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) + '졍') ^ 16026) - var5) << 1 | (char)((char)((char)((char)((char)(var4[var5] - var5) << 3 | (char)(var4[var5] - var5) >>> 13) + '졍') ^ 16026) - var5) >>> 15) + 12860) + var5) + 'Ɡ')) - var5) + var5) - var5) + 2957));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '隸') - var5))) - var5) + '\uf7a4') - var5) + '\ue03a') ^ 5885) - 7825) ^ var5))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '隸') - var5))) - var5) + '\uf7a4') - var5) + '\ue03a') ^ 5885) - 7825) ^ var5))) >>> 6) - '쨨') + 12054) >>> 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '隸') - var5))) - var5) + '\uf7a4') - var5) + '\ue03a') ^ 5885) - 7825) ^ var5))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ '隸') - var5))) - var5) + '\uf7a4') - var5) + '\ue03a') ^ 5885) - 7825) ^ var5))) >>> 6) - '쨨') + 12054) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static double iIlIlllllill(List<iIiliillIliliill> boxes, double cz, double cx) {
      double var5 = cz - 0.3;
      double var7 = cz + 0.3;
      double var9 = cx - 0.3;
      double var11 = cx + 0.3;
      double var13 = (double)0.0F;

      for(iIiliillIliliill var16 : boxes) {
         if (var16.IliIlllilIi(var5, var9, var7, var11)) {
            var13 = Math.max(var13, var16.Illiliiill);
         }
      }

      return var13;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2429400301230919519L ^ Long.rotateLeft(-3439121679686815344L, 7) ^ -521538450611345386L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8554896582828120016L ^ Long.rotateLeft(-831124852183379132L, 61) ^ 3448282499912653301L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3914349252548337483L ^ Long.rotateLeft(-3931711300369591953L, 51) ^ 5637674570430922230L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2383598101338086754L ^ Long.rotateLeft(3085345984082368684L, 51) ^ 3037516758325784345L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 250479324780454422L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3740057796553951435L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1543955456804726782L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4279510679092954298L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -956393149369043689L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3168869374371536844L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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
}
