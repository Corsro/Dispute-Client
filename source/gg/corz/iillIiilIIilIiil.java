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

public record iillIiilIIilIiil(String blocker, iiIiIlllIIliIlll action, String changed) {
   private final String iIiIIIilil;
   private final iiIiIlllIIliIlll IliIIIilil;
   private final String lliIIIilil;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '艝'))) << 3 | (char)(~((char)(var4[var5] + '艝'))) >>> 13) >>> 13 | (char)((char)(~((char)(var4[var5] + '艝'))) << 3 | (char)(~((char)(var4[var5] + '艝'))) >>> 13) << 3) + 632) ^ var5) - var5) + '뜟') ^ var5))) ^ 23330) - var5) ^ var5) ^ 515) << 7 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + '艝'))) << 3 | (char)(~((char)(var4[var5] + '艝'))) >>> 13) >>> 13 | (char)((char)(~((char)(var4[var5] + '艝'))) << 3 | (char)(~((char)(var4[var5] + '艝'))) >>> 13) << 3) + 632) ^ var5) - var5) + '뜟') ^ var5))) ^ 23330) - var5) ^ var5) ^ 515) >>> 9));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') >>> 10) + 4058) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') >>> 10) + 4058) << 14))) >>> 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') >>> 10) + 4058) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '핸') ^ '躔') >>> 12 | (char)((char)(var4[var5] + '핸') ^ '躔') << 4) ^ var5) + var5) - 6669) - '\uf6a5') ^ var5) - '녀') - 21181) - 2751) ^ '쉶') >>> 10) + 4058) << 14))) << 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3829434907506681857L ^ Long.rotateLeft(1613690682443350625L, 50) ^ 8474414450235998682L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8829963256452263005L ^ Long.rotateLeft(3246138297267325659L, 22) ^ -3698882148798473215L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7033772763056452226L ^ Long.rotateLeft(-4218464159977957060L, 9) ^ -3864393370997669005L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2492350769517226876L ^ Long.rotateLeft(7416540220065133182L, 28) ^ -3040685172397296413L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1329076067945485306L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5368871450939544678L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -423966027201411799L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8151093843405978365L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5047831213193464335L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4062667796198258218L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
         var4[var5] = (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 30119))) ^ var5) >>> 13 | (char)((char)(~((char)(var4[var5] - 30119))) ^ var5) << 3) ^ '豍') ^ var5) ^ var5) - var5))) ^ '賖'))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String toString() {
      return this.iIiIIIilil + IilliliilIIi<invokedynamic>() + this.IliIIIilil + IilliliilIIi<invokedynamic>() + this.lliIIIilil + IilliliilIIi<invokedynamic>();
   }

   public String IliIlllilIi() {
      return this.iIiIIIilil;
   }

   public iillIiilIIilIiil(String changed, iiIiIlllIIliIlll action, String blocker) {
      this.iIiIIIilil = changed;
      this.IliIIIilil = action;
      this.lliIIIilil = blocker;
   }

   public String iIlIlllllill() {
      return this.lliIIIilil;
   }

   public iiIiIlllIIliIlll liiiIIllIl() {
      return this.IliIIIilil;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) >>> 2) ^ '\uda80') + '邍') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) >>> 2) ^ '\uda80') + '邍') >>> 8) - '蠬'))) - 14560))))) << 8 | (char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) >>> 2) ^ '\uda80') + '邍') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) << 3 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ '郠') >>> 11 | (char)(var4[var5] ^ '郠') << 5) - var5) + '쁊') ^ var5) ^ 6124) >>> 14) >>> 13) >>> 2) ^ '\uda80') + '邍') >>> 8) - '蠬'))) - 14560))))) >>> 8) + var5));
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
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) >>> 5 | (char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) << 11) ^ 18155) ^ '랶') >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) >>> 5 | (char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) << 11) ^ 18155) ^ '랶') << 10) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) >>> 5 | (char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) << 11) ^ 18155) ^ '랶') >>> 6 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) >>> 5 | (char)((char)((char)(var4[var5] ^ 23891) + var5) - 4808) << 11) ^ 18155) ^ '랶') << 10) + var5) >>> 12))) - var5) - 'ꕫ'))))))) - '\uda62') + 24459));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
