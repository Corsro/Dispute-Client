package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lliliiIiililiiIi {
   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 28843) + var5) + var5) - var5) + var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + 28843) + var5) + var5) - var5) + var5) << 3) + '밃') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + 28843) + var5) + var5) - var5) + var5) >>> 13 | (char)((char)((char)((char)((char)(var4[var5] + 28843) + var5) + var5) - var5) + var5) << 3) + '밃') << 2) ^ var5))) + '\uf764'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) << 13) ^ '츪') + var5) ^ 'ꄣ') >>> 14 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) << 13) ^ '츪') + var5) ^ 'ꄣ') << 2) << 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) << 13) ^ '츪') + var5) ^ 'ꄣ') >>> 14 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) << 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) >>> 7 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) - var5) << 9) ^ '곦') - var5) >>> 6) ^ var5) ^ var5))) >>> 5) << 13) ^ '츪') + var5) ^ 'ꄣ') << 2) >>> 7) ^ var5) + 28978) - '\ue0e1'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 21189) >>> 5 | (char)((char)(-((char)(-var4[var5]))) - 21189) << 11) + var5) ^ 16065) >>> 1 | (char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 21189) >>> 5 | (char)((char)(-((char)(-var4[var5]))) - 21189) << 11) + var5) ^ 16065) << 15) + var5) + var5))) + '뤢') + var5) + 21974) - var5) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 21189) >>> 5 | (char)((char)(-((char)(-var4[var5]))) - 21189) << 11) + var5) ^ 16065) >>> 1 | (char)((char)((char)((char)((char)(-((char)(-var4[var5]))) - 21189) >>> 5 | (char)((char)(-((char)(-var4[var5]))) - 21189) << 11) + var5) ^ 16065) << 15) + var5) + var5))) + '뤢') + var5) + 21974) - var5) - var5) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IiilIIllliilIIll IliIlllilIi(int tempBlocks, int dependencyUnlocks, int bottleneckOrCompletion, boolean expectedBlocks, int routeLen, List<IIiIlIilIiIlIi> validator, Iiliiiililiiii alternatives) {
      return liiiIIllIl(tempBlocks, dependencyUnlocks, bottleneckOrCompletion, expectedBlocks, routeLen, validator, alternatives, true);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) << 12) ^ var5) << 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) << 12) ^ var5) >>> 4) ^ var5) + 22692) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) << 12) ^ var5) << 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) >>> 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - 24941) - 28739) + 29714) - var5) - 27549) ^ 24063) ^ 26220))) - var5) << 12) ^ var5) >>> 4) ^ var5) + 22692) >>> 4))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5673496463096841687L ^ Long.rotateLeft(-1577584402473029262L, 17) ^ -4956680387532819500L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1661431716115073372L ^ Long.rotateLeft(4887933491749850609L, 57) ^ 2466895989981135975L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1762676326428919001L ^ Long.rotateLeft(-4124699297993634075L, 6) ^ -6735158121821678856L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4151241942238402902L ^ Long.rotateLeft(-7790621020165701570L, 51) ^ 8921906676991893655L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1707052908286815664L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2899871981552025780L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4648621803541276853L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2419734494905355120L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3611073883139442974L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -892767872967625408L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIllIIliIIl<invokedynamic>());
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

   public static IiilIIllliilIIll liiiIIllIl(int bottleneckOrCompletion, int alternatives, int routeLen, boolean tempBlocks, int validator, List<IIiIlIilIiIlIi> expectedBlocks, Iiliiiililiiii dependencyUnlocks, boolean alternativesProven) {
      long var15 = -6001112105958895162L;
      ArrayList var8 = new ArrayList(expectedBlocks == null ? List.of() : expectedBlocks);
      ArrayList var9 = new ArrayList();

      while(true) {
         ArrayList var10 = new ArrayList(var8.size());

         for(IIiIlIilIiIlIi var12 : var8) {
            var10.add(var12.liiiIIllIl());
         }

         IliiIlIllliiIlIl var17 = liiIIIiiiiIIIi.iliIiiliiiii(bottleneckOrCompletion, alternatives, routeLen, tempBlocks, validator, var10, 0L, (IlliIIlillliIIli)null, alternativesProven);
         if (var17.liiiIIllIl()) {
            return new IiilIIllliilIIll(var9.isEmpty() ? iiiillIlIIIIilIl.liilIlliIl : iiiillIlIIIIilIl.IIIiIlliIl, var17, (IIiIlIilIiIlIi)null, var9, var9.isEmpty() ? var17.iIlIlllllill().name() : var17.iIlIlllllill().name() + iIlIlllllill<invokedynamic>() + var9.size() + iIlIlllllill<invokedynamic>());
         }

         IIiIlIilIiIlIi var18 = null;

         for(IIiIlIilIiIlIi var14 : var8) {
            if (var17.lIiiIiIlilli() != null && var14.iliIiiliiiii() == var17.lIiiIiIlilli().IIIllIIliIIl() && var14.lIiiIiIlilli().equals(var17.lIiiIiIlilli().IilliliilIIi())) {
               var18 = var14;
               break;
            }
         }

         if (var18 == null) {
            return new IiilIIllliilIIll(iiiillIlIIIIilIl.IIIiIlliIl, var17, (IIiIlIilIiIlIi)null, var9, iIlIlllllill<invokedynamic>());
         }

         String var19 = dependencyUnlocks == null ? null : (String)dependencyUnlocks.apply(var18);
         if (var19 == null) {
            return new IiilIIllliilIIll(iiiillIlIIIIilIl.iiilIlliIl, var17, var18, var9, iIlIlllllill<invokedynamic>());
         }

         var9.add(new llIllliilIllli(var18, var19));
         var15 ^= ((long)var8.indexOf(var18) << 32 ^ var15) & -1L << 32;
         var8.remove((int)(var15 >>> 32));
         if (!var18.IIIilIIiiIIi().isEmpty()) {
            var8.add((int)(var15 >>> 32), var18.iIlIlllllill());
         }
      }
   }

   private lliliiIiililiiIi() {
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) ^ '\uf82d') ^ 5604) - 7586) - '誡') ^ var5) + 'ꡡ') - var5))) + var5))) - '\udcf8') ^ var5) ^ 20721) - var5) ^ 13931));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
