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

public final class IiIlIIIiliIlIIIi {
   public final int lIIiIIliil;
   public final int iIIiIIliil;
   public final boolean iiilIIliil;
   public final String IlilIIliil;
   public int IlIiIIliil = -1;
   public final int llilIIliil;
   public int llIiIIliil = -1;
   public int liIiIIliil;
   public int ilIiIIliil = -1;
   public int IiIiIIliil = -1;
   public final long lIilIIliil;
   public IlilIiIlllilIiIl iiIiIIliil;
   public final double ililIIliil;
   public final int IIIiIIliil;
   public final double IiilIIliil;
   public String IIliIIliil;
   public final long iIilIIliil;
   public final double liilIIliil;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3020217102600806327L ^ Long.rotateLeft(-8606622178058721049L, 43) ^ 2109123156084013688L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5945356079382162271L ^ Long.rotateLeft(-2626808543785859866L, 29) ^ 9185415696292404648L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6542230344857178037L ^ Long.rotateLeft(4505152831452486885L, 40) ^ 4397457616527269267L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5142371076542741496L ^ Long.rotateLeft(-1022039374934422065L, 59) ^ -4025525612307120039L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2301213392309014674L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2974012459556147552L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2495546288024192675L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5430666554790082431L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1337338922454981332L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5551706890979010678L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 9 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 7) - '웰'))) << 14 | (char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 9 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 7) - '웰'))) >>> 2) >>> 14 | (char)((char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 9 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 7) - '웰'))) << 14 | (char)(-((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 9 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 7) - '웰'))) >>> 2) << 2) ^ var5) - 26372))) + '끝'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String liiiIIllIl() {
      return String.format(Locale.ROOT, iIlIlllllill<invokedynamic>(), llIiIiililIiIiil.IlIlllIlilIl(this.lIilIIliil), llIiIiililIiIiil.IlIlllIlilIl(this.iIilIIliil), this.IlilIIliil, this.llilIIliil, this.ililIIliil, this.IiilIIliil, this.liilIIliil, this.iiilIIliil, this.IIIiIIliil, this.IliIlllilIi(), this.iiIiIIliil == IlilIiIlllilIiIl.lIliIliIll, this.iiIiIIliil == IlilIiIlllilIiIl.iIliIliIll, this.ilIiIIliil, this.iIIiIIliil, this.IlIiIIliil, this.IIliIIliil);
   }

   public boolean IliIlllilIi() {
      return this.llIiIIliil >= 0;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '퓇'))))) ^ 10772) >>> 11 | (char)((char)(-((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '퓇'))))) ^ 10772) << 5) - var5))) - '覊') ^ 2410) << 14 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '퓇'))))) ^ 10772) >>> 11 | (char)((char)(-((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) ^ '퓇'))))) ^ 10772) << 5) - var5))) - '覊') ^ 2410) >>> 2) ^ var5) + var5) - '\ua630') ^ var5) + '칡'));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) >>> 11 | (char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) << 5) + var5) ^ 24528))) << 2 | (char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) >>> 11 | (char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) << 5) + var5) ^ 24528))) >>> 14) << 9 | (char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) >>> 11 | (char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) << 5) + var5) ^ 24528))) << 2 | (char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) >>> 11 | (char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 24520) ^ var5) + '뤖') + var5) - var5))) + var5) - 18619))))) - var5) << 5) + var5) ^ 24528))) >>> 14) >>> 7) ^ 23698));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   IiIlIIIiliIlIIIi(long clickTick, long hitY, String target, int hitX, double face, double hitZ, double supportType, boolean sneak, int invBefore, int ping, int support) {
      this.iiIiIIliil = IlilIiIlllilIiIl.iiIiIliIll;
      this.IIliIIliil = "";
      this.lIilIIliil = clickTick;
      this.iIilIIliil = hitY;
      this.IlilIIliil = target;
      this.llilIIliil = hitX;
      this.ililIIliil = face;
      this.IiilIIliil = hitZ;
      this.liilIIliil = supportType;
      this.iiilIIliil = sneak;
      this.IIIiIIliil = invBefore;
      this.lIIiIIliil = ping;
      this.iIIiIIliil = support;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - '꿇') + var5) >>> 15 | (char)((char)(var4[var5] - '꿇') + var5) << 1) - var5) >>> 7 | (char)((char)((char)((char)(var4[var5] - '꿇') + var5) >>> 15 | (char)((char)(var4[var5] - '꿇') + var5) << 1) - var5) << 9) - var5))) ^ 16028) - var5) - '촅') ^ '鉁'))) + 'ꘖ'))) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] ^ 16591) - '\udf4d') - var5) + '뜥'))) + var5) ^ var5) ^ var5)))) ^ var5) + var5) ^ var5) + 3952) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
