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

public final class ilIIIIiIiIIIIi {
   public double iIiiIIiliIliiIIili = (double)4.5F;
   public int IlliIIilillliIIili = 3;
   public int lIliIIiliiIliIIili = 3;
   public boolean IIiiIIililIiiIIili = true;
   public int lIIIlIiliiIIIlIili = 50;
   public int IiiiIIililiiiIIili = 2;
   public boolean illiIIiliIiliIIili = true;
   public boolean liliIIiliiiliIIili = true;
   public String IlIIlIilillIIlIili = IliIlllilIi<invokedynamic>();
   public boolean iiiiIIiliIIIIlIili = true;
   public boolean ilIIlIiliIiIIlIili;
   public boolean lliiIIiliiliiIIili = true;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 28623) << 10 | (char)((char)(var4[var5] ^ var5) ^ 28623) >>> 6) ^ '\udd24') + var5))) + 7381) ^ var5) ^ var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4365697389654466387L ^ Long.rotateLeft(-9136548315275182185L, 16) ^ -5870010967067067488L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7803184678125950581L ^ Long.rotateLeft(-3967835848005314608L, 43) ^ -6526569094467731782L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6644705755735766526L ^ Long.rotateLeft(7809665591512295719L, 24) ^ -8427883264523534148L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4590536786024214891L ^ Long.rotateLeft(-5581390733537952070L, 20) ^ -6076478091097640360L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2043880649909617858L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6445989735997743734L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4714804276742305516L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6672180700018348424L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6155914793727335629L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8450593316365911526L;
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~var4[var5]) >>> 8 | (char)(~var4[var5]) << 8))) - 17267) ^ var5) ^ var5))) ^ var5) + var5) ^ '\ue173') ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 29752) + 6057) + var5) + var5))) << 10 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ var5) - 29752) + 6057) + var5) + var5))) >>> 6) + var5) ^ 7447) - var5) - var5) + 15030) + 20910) - 'ￎ') - var5) - var5) ^ 29219) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) >>> 3 | (char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) << 13))) << 15 | (char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) >>> 3 | (char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) << 13))) >>> 1) ^ 960) >>> 10 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) >>> 3 | (char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) << 13))) << 15 | (char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) >>> 3 | (char)(-((char)((char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) << 2 | (char)((char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) << 10 | (char)((char)(~((char)((char)(~var4[var5]) + '쨸'))) + 25115) >>> 6) >>> 14))) << 13))) >>> 1) ^ 960) << 6))))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 'ﯤ'))) - var5) + var5) - '阌') - '닮') ^ var5) >>> 3 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + 'ﯤ'))) - var5) + var5) - '阌') - '닮') ^ var5) << 13) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
