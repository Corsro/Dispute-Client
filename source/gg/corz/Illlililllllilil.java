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

public final class Illlililllllilil {
   private long iliiIlIlil;
   private long IliiIlIlil;
   private long IiiiIlIlil;
   private long lliiIlIlil;
   private int iiiiIlIlil;
   private int liiiIlIlil;

   public void lIiiIiIlilli(IiiiiiIlliiiiiIl nowNs, long t) {
      if (nowNs != null && !nowNs.iiiiIiIlll) {
         nowNs.iiiiIiIlll = true;
         this.IiiiIlIlil += Math.max(0L, t - nowNs.iliiIiIlll);
         ++this.iiiiIlIlil;
      }
   }

   public long IIIllIIliIIl() {
      return this.lliiIlIlil / 1000000L;
   }

   public void liiiIIllIl(IiiiiiIlliiiiiIl nowNs, long t) {
      if (nowNs != null && nowNs.IiiiIiIlll == 0L) {
         nowNs.IiiiIiIlll = t;
      }

   }

   public int Illlllllilll() {
      return this.iiiiIlIlil;
   }

   public String Iilllilliill() {
      return IIillIiliIil<invokedynamic>() + this.iliIiiliiiii() + IIillIiliIil<invokedynamic>() + this.IIIllIIliIIl() + IIillIiliIil<invokedynamic>() + this.IlIlllIlilIl() + IIillIiliIil<invokedynamic>() + this.IiIlliIliiIl() + IIillIiliIil<invokedynamic>() + this.liiiIlIlil + IIillIiliIil<invokedynamic>() + this.iiiiIlIlil;
   }

   public IiiiiiIlliiiiiIl IliIlllilIi(long nowNs) {
      return new IiiiiiIlliiiiiIl(nowNs);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6804060251052998754L ^ Long.rotateLeft(-7949664826112453068L, 13) ^ 5909228677749885076L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5698019836228448070L ^ Long.rotateLeft(8409926396527179024L, 15) ^ 7565439118451623384L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3000449579223031409L ^ Long.rotateLeft(-2386440756747061683L, 51) ^ -920946019401023098L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7751416349818924433L ^ Long.rotateLeft(-926571418525086206L, 34) ^ -1772703718188784555L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2166194873003813887L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3492911442009847702L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8359869615745688663L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3334332802839264531L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1442058452063350254L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1869157175805189395L;
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
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(-((char)(~((char)(-((char)((char)(~((char)((char)(~((char)((char)(~var4[var5]) ^ '\uf17d'))) >>> 13 | (char)(~((char)((char)(~var4[var5]) ^ '\uf17d'))) << 3))) + '퍑'))))))) + var5))))) + '쇲') + '띠') - var5) + '\ueafc') ^ '\udca5'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) >>> 3 | (char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) << 13) + var5) + 6985) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) >>> 3 | (char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) << 13) + var5) + 6985) << 4) ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) >>> 3 | (char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) << 13) + var5) + 6985) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) >>> 3 | (char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) ^ var5))))) - var5) + '뿥') - 15519))) << 13) + var5) + 6985) << 4) ^ var5) << 6) + 12063));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IiIlliIliiIl() {
      return this.IiiiIlIlil / 1000000L;
   }

   public long IlIlllIlilIl() {
      return this.iliiIlIlil / 1000000L;
   }

   public long iliIiiliiiii() {
      return this.IliiIlIlil / 1000000L;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 4 | var4[var5] << 12))) + var5) ^ var5) ^ 19076) ^ var5))) >>> 7 | (char)(~((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 4 | var4[var5] << 12))) + var5) ^ var5) ^ 19076) ^ var5))) << 9) + '\ue238') - '腍') ^ '\uf70e'))))) ^ var5) ^ var5) - 32293));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(IiiiiiIlliiiiiIl nowNs, long t) {
      if (nowNs != null && !nowNs.iiiiIiIlll) {
         nowNs.iiiiIiIlll = true;
         long var4 = nowNs.IiiiIiIlll == 0L ? t : nowNs.IiiiIiIlll;
         long var6 = nowNs.liiiIiIlll == 0L ? t : nowNs.liiiIiIlll;
         this.iliiIlIlil += Math.max(0L, var4 - nowNs.iliiIiIlll);
         this.IliiIlIlil += Math.max(0L, var6 - var4);
         this.lliiIlIlil += Math.max(0L, t - nowNs.iliiIiIlll);
         ++this.liiiIlIlil;
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '룬') ^ var5) - var5) + var5) + var5) - 15935) + var5) + var5) - 29739) ^ '졫') ^ '\ude6f') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) - var5) << 8 | (char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) - var5) >>> 8) + var5) - 5582))))) ^ 15587) >>> 2 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) - var5) << 8 | (char)((char)((char)((char)(var4[var5] + var5) - var5) << 5 | (char)((char)(var4[var5] + var5) - var5) >>> 11) - var5) >>> 8) + var5) - 5582))))) ^ 15587) << 14) ^ '묲'))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(IiiiiiIlliiiiiIl nowNs, long t) {
      if (nowNs != null && nowNs.liiiIiIlll == 0L) {
         nowNs.liiiIiIlll = t;
      }

   }

   public int IIlllIlliIll() {
      return this.liiiIlIlil;
   }
}
