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

public record IllIillllIil(String kind, int members, boolean firstExecutable, llIiiIililIiiIil firstRejectReason, boolean dependencyChainValid, int predictedFirstActionTicks) {
   private final String lIIliIliiIIliIli;
   private final boolean IIlliIlilIlliIli;
   private final llIiiIililIiiIil liIliIliiiIliIli;
   private final int iIlliIliIllliIli;
   private final boolean ilIliIliIiIliIli;
   private final int IlIliIlillIliIli;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + '띖') - 30773) - 9938) ^ var5) ^ var5))) + '\uf633') - var5))) >>> 15 | (char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + '띖') - 30773) - 9938) ^ var5) ^ var5))) + '\uf633') - var5))) << 1) - var5) << 4 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + '띖') - 30773) - 9938) ^ var5) ^ var5))) + '\uf633') - var5))) >>> 15 | (char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + '띖') - 30773) - 9938) ^ var5) ^ var5))) + '\uf633') - var5))) << 1) - var5) >>> 12) + '\uf7f6') + var5) + var5) ^ var5));
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
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5)) ^ 9430) + var5) ^ 4620) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] - var5)) ^ 9430) + var5) ^ 4620) << 14) ^ '霾'))) ^ var5))) - '혒'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IilliliilIIi() {
      return this.IlIliIlillIliIli;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6948099444162889960L ^ Long.rotateLeft(-5420442316996244665L, 12) ^ 638074655475042758L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6933764011899793723L ^ Long.rotateLeft(2047036440876420143L, 29) ^ 8482161966804289824L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 789972359093109886L ^ Long.rotateLeft(-8695185167088437937L, 23) ^ 8084436081219880092L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3692705925110793882L ^ Long.rotateLeft(-1069456385368871204L, 24) ^ 2031942836621711421L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7598526739393460468L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4979712456198663064L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1274670304875967774L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7298701377108607264L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7151019910791656324L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3390314520849783467L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIillIiliIil<invokedynamic>());
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

   public String iIlIlllllill() {
      return this.lIIliIliiIIliIli;
   }

   public boolean IIIllIIliIIl() {
      return this.IIlliIlilIlliIli;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) << 4 | (char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) >>> 12) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) << 4 | (char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) >>> 12) ^ var5))) << 4) + var5) - var5))) ^ var5) - var5) << 8 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) << 4 | (char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) >>> 12) ^ var5))) >>> 12 | (char)(-((char)((char)((char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) << 4 | (char)(-((char)((char)(~((char)(~var4[var5]))) + var5))) >>> 12) ^ var5))) << 4) + var5) - var5))) ^ var5) - var5) >>> 8) ^ 1879) + '齁') ^ var5)));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli() {
      return this.ilIliIliIiIliIli;
   }

   public String liiiIIllIl() {
      return String.format(Locale.ROOT, IiIlliIliiIl<invokedynamic>(), this.lIIliIliiIIliIli, this.IlIliIlillIliIli, this.ilIliIliIiIliIli, this.liIliIliiiIliIli, this.IIlliIlilIlliIli, this.iIlliIliIllliIli, this.IliIlllilIi() ? IiIlliIliiIl<invokedynamic>() : IiIlliIliiIl<invokedynamic>());
   }

   public boolean IliIlllilIi() {
      return this.ilIliIliIiIliIli && this.liIliIliiiIliIli == llIiiIililIiiIil.iilIlilIil;
   }

   public llIiiIililIiiIil iliIiiliiiii() {
      return this.liIliIliiiIliIli;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) >>> 4 | (char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) << 12) ^ var5) << 10 | (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) >>> 4 | (char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) << 12) ^ var5) >>> 6) << 14 | (char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) >>> 4 | (char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) << 12) ^ var5) << 10 | (char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) >>> 4 | (char)(~((char)(-((char)((char)(~((char)((char)(var4[var5] ^ var5) - 8790))) - 4123))))) << 12) ^ var5) >>> 6) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IllIillllIil(String dependencyChainValid, int predictedFirstActionTicks, boolean kind, llIiiIililIiiIil firstRejectReason, boolean firstExecutable, int members) {
      this.lIIliIliiIIliIli = dependencyChainValid;
      this.IlIliIlillIliIli = predictedFirstActionTicks;
      this.ilIliIliIiIliIli = kind;
      this.liIliIliiiIliIli = firstRejectReason;
      this.IIlliIlilIlliIli = firstExecutable;
      this.iIlliIliIllliIli = members;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30716) - 12220) + 25060) + '꩐') - var5) + '\uefb6'))))) << 13 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30716) - 12220) + 25060) + '꩐') - var5) + '\uefb6'))))) >>> 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl() {
      return this.iIlliIliIllliIli;
   }
}
