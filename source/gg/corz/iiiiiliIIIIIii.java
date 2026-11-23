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

public final class iiiiiliIIIIIii {
   public static String lIiiIiIlilli(IiIillIlliIillIl l) {
      return l == null ? "" : IilliliilIIi(l.iliIiiliiiii(), l.IlIlllIlilIl());
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + var5))) ^ var5) << 12 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + var5))) ^ var5) >>> 4) - var5) + var5) << 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + var5))) ^ var5) << 12 | (char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 4 | (char)(var4[var5] ^ var5) << 12) + var5))) ^ var5) >>> 4) - var5) + var5) >>> 8))) + '覨'));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '\ue437') ^ 4693) - '땟') + var5))) - var5) + var5))))))))) + var5) << 8 | (char)((char)(-((char)(~((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '\ue437') ^ 4693) - '땟') + var5))) - var5) + var5))))))))) + var5) >>> 8) ^ '\uf79f'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iiiiiliIIIIIii() {
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) >>> 3 | (char)((char)(~var4[var5]) + var5) << 13) + 23005) + var5) - 4647) ^ var5) ^ var5))) + var5) ^ var5) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) >>> 3 | (char)((char)(~var4[var5]) + var5) << 13) + 23005) + var5) - 4647) ^ var5) ^ var5))) + var5) ^ var5) >>> 10) ^ '콣') ^ 21482) << 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) >>> 3 | (char)((char)(~var4[var5]) + var5) << 13) + 23005) + var5) - 4647) ^ var5) ^ var5))) + var5) ^ var5) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) >>> 3 | (char)((char)(~var4[var5]) + var5) << 13) + 23005) + var5) - 4647) ^ var5) ^ var5))) + var5) ^ var5) >>> 10) ^ '콣') ^ 21482) >>> 11) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IilliliilIIi(long secondsLeft, long price) {
      long var4 = Math.round((double)secondsLeft * (double)3600.0F / (double)Math.max(1L, price));
      String var6 = llIIilIiilIIilIi.iIlIlllllill(var4, var4 < 1000000L ? 0 : 2);
      return (var6.startsWith(IIIllIIliIIl<invokedynamic>()) ? var6.substring(1) : var6) + IIIllIIliIIl<invokedynamic>();
   }

   public static long IliIlllilIi(IiIillIlliIillIl scannedAtMs, long l, long nowMs) {
      if (scannedAtMs == null) {
         return 0L;
      } else {
         long var5 = Math.max(0L, nowMs - l) / 1000L;
         return Math.max(0L, scannedAtMs.IlIlllIlilIl() - var5);
      }
   }

   public static String liiiIIllIl(long nowMs, long scannedAtMs) {
      if (nowMs <= 0L) {
         return IIIllIIliIIl<invokedynamic>();
      } else {
         long var4 = Math.max(0L, scannedAtMs - nowMs) / 1000L;
         return var4 < 60L ? IIIllIIliIIl<invokedynamic>() : iIIiIiilIlIiIiil.iIlIlllllill(var4 - var4 % 60L) + IIIllIIliIIl<invokedynamic>();
      }
   }

   public static String iliIiiliiiii(IiIillIlliIillIl l, long scannedAtMs, long nowMs) {
      return l == null ? "" : IilliliilIIi(l.iliIiiliiiii(), IliIlllilIi(l, scannedAtMs, nowMs));
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - var5) - 5589) + var5) - var5) + 30854) ^ 413) + var5) + 15822) ^ 7467)) - var5) + '밚') + 25735));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4280341793050716758L ^ Long.rotateLeft(7020277480754526896L, 24) ^ -1795990537037736302L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4187140567560639327L ^ Long.rotateLeft(-1139846943874934425L, 59) ^ 6402122191872334777L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1782300413606902082L ^ Long.rotateLeft(6537172605588913515L, 39) ^ -2679694901413773828L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3321907596666211767L ^ Long.rotateLeft(989936170956160720L, 27) ^ 4274649444883401733L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6815724789459268694L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2437577256082954965L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6648920637146035760L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4169304722378184124L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1307493173984855089L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4142137725661294233L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illlllllilll<invokedynamic>());
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

   public static float iIlIlllllill(long secondsLeft) {
      return (float)Math.max((double)0.0F, Math.min((double)1.0F, (double)secondsLeft / (double)86400.0F));
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) >>> 15 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) << 1) - '\ue237') >>> 7 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) >>> 15 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) << 1) - '\ue237') << 9) + '꒪') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) >>> 15 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) << 1) - '\ue237') >>> 7 | (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) >>> 15 | (char)((char)((char)((char)(~((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) ^ '푨') + '영') - var5) + '趥') + '붍'))) ^ '餜') - '폲'))))) ^ '뫢') + var5) ^ var5) << 1) - '\ue237') << 9) + '꒪') >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
