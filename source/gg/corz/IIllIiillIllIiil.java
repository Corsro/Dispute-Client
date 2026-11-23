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

public final class IIllIiillIllIiil {
   public final long iiIliillil;
   public String illliillil;
   public int ililiillil;
   public final long IIlliillil;
   public String lilliillil;
   public int iIiliillil;
   public int lliliillil;
   public final String Illliillil;
   public final liliIliiliIl lIlliillil;
   public String IIiliillil;
   public int Ililiillil;
   public lIliiiIliIliiiIl lllliillil;
   public ilillIiill lIiliillil;
   public int Iiiliillil;
   public final String iIlliillil;
   public long Iilliillil;
   public String iilliillil;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) >>> 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) << 1) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) >>> 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) << 1) << 15) + var5) - var5))) >>> 6 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) >>> 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) << 1) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) >>> 15 | (char)((char)((char)((char)((char)((char)(var4[var5] + '鍓') ^ var5) ^ var5) - '생') - var5) + 23186) << 1) << 15) + var5) - var5))) << 10))) - 16599))) - '赟') + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8480132192608437090L ^ Long.rotateLeft(2270461851533728576L, 20) ^ -5565802670157645873L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4522697240821258663L ^ Long.rotateLeft(-3318044399317707665L, 22) ^ 4849741173879539033L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3046353536375460044L ^ Long.rotateLeft(-4393975013634585656L, 18) ^ -2382545188082862845L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4819951987263645373L ^ Long.rotateLeft(7061019844102770575L, 56) ^ 6526138393054847565L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8642788335492438129L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3731753689049767971L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3508476585516064765L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8321099312166946982L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8068031936527555206L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2109434987553907911L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIlIlllllill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IilliliilIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIiiIiIlilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iliIiiliiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIllIIliIIl<invokedynamic>());
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

   public boolean IliIlllilIi() {
      return this.lllliillil == lIliiiIliIliiiIl.iIIiIiIlll;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + '\udcbe') << 1 | (char)(var4[var5] + '\udcbe') >>> 15))) + var5))) ^ 9828) << 11 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] + '\udcbe') << 1 | (char)(var4[var5] + '\udcbe') >>> 15))) + var5))) ^ 9828) >>> 5) << 9 | (char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + '\udcbe') << 1 | (char)(var4[var5] + '\udcbe') >>> 15))) + var5))) ^ 9828) << 11 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] + '\udcbe') << 1 | (char)(var4[var5] + '\udcbe') >>> 15))) + var5))) ^ 9828) >>> 5) >>> 7) ^ var5))) + 2356))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) << 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) >>> 4) + '죟') + '뛕') + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) << 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) >>> 4) + '죟') + '뛕') + var5) >>> 1) + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) << 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) >>> 4) + '죟') + '뛕') + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) << 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) ^ var5) - var5))) - 10068) - '褺') << 12) >>> 4) + '죟') + '뛕') + var5) >>> 1) + var5) << 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   IIllIiillIllIiil(long id, long desired, liliIliiliIl observed, String target, String kind) {
      this.lllliillil = lIliiiIliIliiiIl.IIIiIiIlll;
      this.illliillil = "";
      this.lilliillil = liiiIIllIl<invokedynamic>();
      this.iilliillil = "";
      this.IIiliillil = "";
      this.iiIliillil = id;
      this.IIlliillil = desired;
      this.lIlliillil = observed;
      this.iIlliillil = target;
      this.Illliillil = kind;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) << 6 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) >>> 10) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) << 6 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) >>> 10) ^ var5) >>> 15))) >>> 6 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) << 6 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) >>> 10) ^ var5) << 1 | (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) << 6 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) << 8 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) ^ var5))))) ^ var5) + '굳') + 21188) >>> 8) >>> 10) ^ var5) >>> 15))) << 10) + var5))))) - 896));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5 | (char)((char)(~((char)(~var4[var5]))) ^ var5) << 11) - '\uf4ce') - 6561) - var5) + 856) - var5) ^ 845) - 9434) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ var5) >>> 5 | (char)((char)(~((char)(~var4[var5]))) ^ var5) << 11) - '\uf4ce') - 6561) - var5) + 856) - var5) ^ 845) - 9434) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
