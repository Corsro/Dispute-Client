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

public enum IIlIIlillIlIIlil {
   public final float IliliilIil;
   lllliilIil(1600, 15.0F, 6.0F, 12.0F, 0.85F, 0.85F, 2.2F, 0.95F, 0.025F);

   public final float lIiliilIil;
   public final int illliilIil;
   public final float lilliilIil;
   public final float iIiliilIil;
   public final float IilliilIil;
   public final float IIiliilIil;
   public final float iilliilIil;
   public final float lliliilIil;
   IllliilIil(5000, 16.0F, 6.0F, 12.0F, 0.55F, 1.0F, 1.1F, 0.96F, 0.05F);

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(~var4[var5]) >>> 7 | (char)(~var4[var5]) << 9) ^ var5) + var5))))) ^ 23683))) ^ var5))) - '\uddf5'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4420267393390528839L ^ Long.rotateLeft(-8993998883452780242L, 15) ^ 113512301112723742L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4411266271231293373L ^ Long.rotateLeft(-6958601826755395613L, 36) ^ 6655144878766989895L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7732096878420298943L ^ Long.rotateLeft(6786655041025930877L, 45) ^ -8767354018387636217L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5325581932635535481L ^ Long.rotateLeft(-8378257908554608189L, 59) ^ 6562558479725122092L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5615914646746166385L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9004029217681303216L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -340472983372573912L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4822791555409378453L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6281500600565281834L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5166199509918036491L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) << 7) - var5) - '莇') ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) << 7) - var5) - '莇') ^ var5) << 6) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) << 7) - var5) - '莇') ^ var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) >>> 9 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - var5))) << 8 | (char)(~((char)(var4[var5] - var5))) >>> 8) + var5))) + 28456) - var5) << 4) << 7) - var5) - '莇') ^ var5) << 6) << 5) - var5));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) >>> 3 | (char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) << 13) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) >>> 3 | (char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) << 13) << 3) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) >>> 3 | (char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) << 13) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) >>> 3 | (char)((char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') << 12 | (char)((char)((char)(var4[var5] - 31819) << 7 | (char)(var4[var5] - 31819) >>> 9) - '싕') >>> 4) << 13) << 3) >>> 10) + '\udbac') ^ var5) - var5) ^ var5) - var5) - '쌐'))) + var5) ^ 18341));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill(float amount01) {
      float var2 = amount01 < 0.0F ? 0.0F : (amount01 > 1.0F ? 1.0F : amount01);
      return Math.round((float)this.illliilIil * var2);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] + 16804))) + var5))) - var5) ^ var5) - 10071) << 6 | (char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] + 16804))) + var5))) - var5) ^ var5) - 10071) >>> 10) + '껣') - '뺼'))))) << 9 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] + 16804))) + var5))) - var5) ^ var5) - 10071) << 6 | (char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] + 16804))) + var5))) - var5) ^ var5) - 10071) >>> 10) + '껣') - '뺼'))))) >>> 7) - 29619) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float IliIlllilIi() {
      return this.IilliilIil * 2.0F;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 15526))) >>> 7 | (char)(~((char)(var4[var5] - 15526))) << 9) - var5) - var5) << 2 | (char)((char)((char)((char)(~((char)(var4[var5] - 15526))) >>> 7 | (char)(~((char)(var4[var5] - 15526))) << 9) - var5) - var5) >>> 14) ^ 7434) ^ 'ﴍ')) ^ 11361))) - var5) + var5) - var5) ^ 7914))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float liiiIIllIl() {
      return this.lilliilIil + this.iilliilIil;
   }

   // $FF: synthetic method
   private static IIlIIlillIlIIlil[] IilliliilIIi() {
      return new IIlIIlillIlIIlil[]{IllliilIil, lllliilIil};
   }

   private IIlIIlillIlIIlil(int above, float alpha, float var5, float maxCount, float relax, float var8, float restLift, float landFade, float windResponse) {
      this.illliilIil = above;
      this.IilliilIil = alpha;
      this.lilliilIil = var5;
      this.iilliilIil = maxCount;
      this.IIiliilIil = relax;
      this.lIiliilIil = var8;
      this.iIiliilIil = restLift;
      this.IliliilIil = landFade;
      this.lliliilIil = windResponse;
   }
}
