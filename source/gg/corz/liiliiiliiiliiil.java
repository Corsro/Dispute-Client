package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class liiliiiliiiliiil implements Executor {
   private ThreadPoolExecutor IlllilIiil;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ '\ue0f5') ^ var5))) ^ var5) + var5))) ^ var5))) >>> 4 | (char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) ^ '\ue0f5') ^ var5))) ^ var5) + var5))) ^ var5))) << 12))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private liiliiiliiiliiil() {
   }

   public synchronized void execute(Runnable job) {
      if (this.IlllilIiil == null) {
         ThreadPoolExecutor var2 = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), liiliiiliiiliiil::IliIlllilIi);
         var2.allowCoreThreadTimeOut(true);
         this.IlllilIiil = var2;
      }

      this.IlllilIiil.execute(job);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 27156) ^ var5) + '躿') - 10648) - 13794) >>> 7 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - 27156) ^ var5) + '躿') - 10648) - 13794) << 9) + 16042))))))) >>> 10 | (char)(-((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 27156) ^ var5) + '躿') - 10648) - 13794) >>> 7 | (char)((char)((char)((char)((char)((char)(~var4[var5]) - 27156) ^ var5) + '躿') - 10648) - 13794) << 9) + 16042))))))) << 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static Thread IliIlllilIi(Runnable r) {
      Thread var1 = new Thread(r, liiiIIllIl<invokedynamic>());
      var1.setDaemon(true);
      return var1;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - '헭') << 11 | (char)(var4[var5] - '헭') >>> 5) ^ 16469))) + '蘆') - '숳'))) << 13 | (char)(-((char)((char)((char)(~((char)((char)((char)(var4[var5] - '헭') << 11 | (char)(var4[var5] - '헭') >>> 5) ^ 16469))) + '蘆') - '숳'))) >>> 3))) - 5892))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) << 8) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) << 8) << 4) ^ 27418) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) << 8) >>> 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(var4[var5] - '\uddef') ^ 29267) ^ '驍') - var5) ^ var5) >>> 10) ^ 11719))) + var5) - 31208) + 26200) << 8) << 4) ^ 27418) << 9) ^ '\uf1af'));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 4 | (char)(-((char)(var4[var5] - var5))) << 12) + '谕') + var5) - 18934) ^ var5) ^ var5) ^ '쵶') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 4 | (char)(-((char)(var4[var5] - var5))) << 12) + '谕') + var5) - 18934) ^ var5) ^ var5) ^ '쵶') >>> 9) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 4 | (char)(-((char)(var4[var5] - var5))) << 12) + '谕') + var5) - 18934) ^ var5) ^ var5) ^ '쵶') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) >>> 4 | (char)(-((char)(var4[var5] - var5))) << 12) + '谕') + var5) - 18934) ^ var5) ^ var5) ^ '쵶') >>> 9) << 10) ^ 21236))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4354144539704605099L ^ Long.rotateLeft(-2790676562545411449L, 13) ^ 7250504085101594285L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2200353276884931175L ^ Long.rotateLeft(-2537802851716095881L, 24) ^ -5629994161212566382L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6608689285399533394L ^ Long.rotateLeft(3734533921319061940L, 50) ^ -2669697318518047783L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4645489251991173444L ^ Long.rotateLeft(1905304416979269447L, 11) ^ 3922100486716943635L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3959231052145694697L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3731233256768921755L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 69369822525609291L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3640727825633111029L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4538592721894247091L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1666414543416776857L;
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
}
