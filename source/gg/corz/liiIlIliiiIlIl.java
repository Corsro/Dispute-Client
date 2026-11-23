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

public final class liiIlIliiiIlIl {
   public static final double lillllIlliillllIll = 0.08;
   public static final double illlllIllIillllIll = 0.98;
   public static final double llilllIllililllIll = 1.0E-4;
   private final IlilIIIlllilIIIl iiIlllIllIIllllIll;
   public static final double iIilllIllIlilllIll = 0.08;
   public static final double IIilllIlllIilllIll = -0.0784;
   private static final liiIlIliiiIlIl lIllllIlliIllllIll;
   public static final long IlllllIllllllllIll = Long.MIN_VALUE;

   static {
      lIllllIlliIllllIll = new liiIlIliiiIlIl(IlilIIIlllilIIIl.llilIIllIl);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) ^ '鄩') + '꠨') - var5) ^ var5) - 10871) + '\ue33d'))) - var5) << 6 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) ^ '鄩') + '꠨') - var5) ^ var5) - 10871) + '\ue33d'))) - var5) >>> 10) - '褶') + 1297)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlilIIIlllilIIIl IliIlllilIi() {
      return this.iiIlllIllIIllllIll;
   }

   public static boolean lIiiIiIlilli(boolean onGround, double verticalSpeed) {
      return onGround && verticalSpeed <= 0.08;
   }

   public static liiIlIliiiIlIl IilliliilIIi(long stand, long feetCell, boolean verticalSpeed, double routeRemaining, int onGround) {
      if (feetCell == Long.MIN_VALUE) {
         return new liiIlIliiiIlIl(IlilIIIlllilIIIl.iiilIIllIl);
      } else if (!lIiiIiIlilli(verticalSpeed, routeRemaining)) {
         return new liiIlIliiiIlIl(IlilIIIlllilIIIl.ililIIllIl);
      } else if (onGround > 0) {
         return new liiIlIliiiIlIl(IlilIIIlllilIIIl.liilIIllIl);
      } else {
         return stand != feetCell ? new liiIlIliiiIlIl(IlilIIIlllilIIIl.IiilIIllIl) : lIllllIlliIllllIll;
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 4566) >>> 8 | (char)(var4[var5] - 4566) << 8) - 9425) - 30773) << 12 | (char)((char)((char)((char)(var4[var5] - 4566) >>> 8 | (char)(var4[var5] - 4566) << 8) - 9425) - 30773) >>> 4) + 5900) + 21434) - var5))) + '춑') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) - '\ueb50') << 4 | (char)((char)(~((char)(-var4[var5]))) - '\ueb50') >>> 12) >>> 4 | (char)((char)((char)(~((char)(-var4[var5]))) - '\ueb50') << 4 | (char)((char)(~((char)(-var4[var5]))) - '\ueb50') >>> 12) << 12) - var5))) ^ var5) - var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7486720118541321160L ^ Long.rotateLeft(7300084177369366688L, 4) ^ 7204775790939084824L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3963410568230978534L ^ Long.rotateLeft(-2262632774494135893L, 30) ^ -7846031990692082141L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 343923851359935564L ^ Long.rotateLeft(8486856800617652593L, 46) ^ 5130570030278386732L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1194329949630147477L ^ Long.rotateLeft(286194816769576531L, 38) ^ -3038416392009653755L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5804663845079262632L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 181875907652643967L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2272174708358763256L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8930221450654179937L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7138513101623179731L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1519729165406331058L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') << 4) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') << 4) >>> 15) + 29145) - '臘'))) - 23530) >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') << 4) << 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') >>> 12 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') << 6 | (char)((char)((char)((char)(var4[var5] + var5) ^ '\ueff5') << 2 | (char)((char)(var4[var5] + var5) ^ '\ueff5') >>> 14) - '\uefb2') >>> 10) - '줄') << 4) >>> 15) + 29145) - '臘'))) - 23530) << 6) + '\uea4c') ^ var5) - var5) + 4976));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15) << 6 | (char)((char)var4[var5] >>> 1 | (char)var4[var5] << 15) >>> 10) + '벻')))))) + var5) + '鐋'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return IIIllIIliIIl<invokedynamic>() + this.iiIlllIllIIllllIll + IIIllIIliIIl<invokedynamic>();
   }

   public boolean iIlIlllllill() {
      return this.iiIlllIllIIllllIll == IlilIIIlllilIIIl.ililIIllIl || this.iiIlllIllIIllllIll == IlilIIIlllilIIIl.liilIIllIl;
   }

   private liiIlIliiiIlIl(IlilIIIlllilIIIl reason) {
      this.iiIlllIllIIllllIll = reason;
   }

   public boolean liiiIIllIl() {
      return this.iiIlllIllIIllllIll == IlilIIIlllilIIIl.llilIIllIl;
   }

   public static boolean iliIiiliiiii(double horizontalLengthSquared) {
      return horizontalLengthSquared <= 1.0E-4;
   }
}
