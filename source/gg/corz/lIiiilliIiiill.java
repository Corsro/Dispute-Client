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

public enum lIiiilliIiiill {
   IIIilllIilIIilllIi(lIiiIiIlilli<invokedynamic>()),
   iIIilllIiIlIilllIi(lIiiIiIlilli<invokedynamic>()),
   llIilllIiilIilllIi(lIiiIiIlilli<invokedynamic>());

   private final String IiIilllIiliIilllIi;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8161039963449154443L ^ Long.rotateLeft(4404061314213160793L, 39) ^ -4749101876485701626L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2697328774511471947L ^ Long.rotateLeft(7726384172819150811L, 63) ^ -7318771530852064473L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6854351152914628271L ^ Long.rotateLeft(-7435723223581299661L, 55) ^ 2320244600403087909L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1693963823703329260L ^ Long.rotateLeft(7321704218485030948L, 39) ^ 4275108265308671589L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6315718944713900994L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3382564825711124043L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4140109444902433706L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3599665843327354252L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 943049801304301154L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7185447853197143076L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IiIlliIliiIl<invokedynamic>());
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
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - '홂') - var5) ^ 12939) - var5) - 25486))) ^ var5) << 13 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - '홂') - var5) ^ 12939) - var5) - 25486))) ^ var5) >>> 3) >>> 8 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - '홂') - var5) ^ 12939) - var5) - 25486))) ^ var5) << 13 | (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) - '홂') - var5) ^ 12939) - var5) - 25486))) ^ var5) >>> 3) << 8));
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
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(~((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 2242) ^ var5) >>> 7 | (char)((char)(var4[var5] - 2242) ^ var5) << 9) - '얅') - '\ue6a5') + 28266) ^ var5))))))) ^ 16143))) - 13021))) + var5))))) - var5));
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
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '蜗') >>> 6 | (char)(var4[var5] - '蜗') << 10) >>> 13 | (char)((char)(var4[var5] - '蜗') >>> 6 | (char)(var4[var5] - '蜗') << 10) << 3) << 13 | (char)((char)((char)(var4[var5] - '蜗') >>> 6 | (char)(var4[var5] - '蜗') << 10) >>> 13 | (char)((char)(var4[var5] - '蜗') >>> 6 | (char)(var4[var5] - '蜗') << 10) << 3) >>> 3) - 11900) + 23003) - var5))) - '麑'))));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + 4299) ^ var5) ^ var5) ^ var5) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + 4299) ^ var5) ^ var5) ^ var5) << 8) ^ var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + 4299) ^ var5) ^ var5) ^ var5) >>> 8 | (char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + 4299) ^ var5) ^ var5) ^ var5) << 8) ^ var5) << 12))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIiiilliIiiill(String var3) {
      this.IiIilllIiliIilllIi = var3;
   }

   public String IliIlllilIi() {
      return this.IiIilllIiliIilllIi;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) - 25918) - var5) ^ 13019) - var5) + '\uec43') << 3 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) - 25918) - var5) ^ 13019) - var5) + '\uec43') >>> 13) - 8117) ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) - 25918) - var5) ^ 13019) - var5) + '\uec43') << 3 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) ^ var5) - 25918) - var5) ^ 13019) - var5) + '\uec43') >>> 13) - 8117) ^ var5) >>> 2) + 25509) ^ 6592));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static lIiiilliIiiill[] IilliliilIIi() {
      return new lIiiilliIiiill[]{IIIilllIilIIilllIi, iIIilllIiIlIilllIi, llIilllIiilIilllIi};
   }

   public static String[] liiiIIllIl() {
      long var3 = -3269987758798218924L;
      lIiiilliIiiill[] var0 = values();
      String[] var1 = new String[var0.length];

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < var0.length; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = var0[(int)(var5 >>> 32)].IiIilllIiliIilllIi;
      }

      return var1;
   }

   public static lIiiilliIiiill iIlIlllllill(String label) {
      long var5 = 7545761485213455171L;
      lIiiilliIiiill[] var1 = values();
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         lIiiilliIiiill var4 = var1[(int)var8];
         if (var4.IiIilllIiliIilllIi.equalsIgnoreCase(label)) {
            return var4;
         }
      }

      return IIIilllIilIIilllIi;
   }
}
