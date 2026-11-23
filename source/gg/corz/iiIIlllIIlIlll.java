package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class iiIIlllIIlIlll {
   public static final String lliliililililiilil = " - corz";
   static final List<String> lIIiiililiIIiiilil = List.of(iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>());
   private static String IlIiiililllIiiilil;
   static final List<String> iiiliililIIIiiilil = List.of(iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>());
   static final List<String> Iiiliililliiliilil = List.of(iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>(), iliIiiliiiii<invokedynamic>());

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) >>> 13 | (char)(-((char)((char)(var4[var5] + var5) - var5))) << 3) - 32375) - 'ꬖ') - '궕') >>> 7 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) >>> 13 | (char)(-((char)((char)(var4[var5] + var5) - var5))) << 3) - 32375) - 'ꬖ') - '궕') << 9) + '\uf473') - var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) >>> 13 | (char)(-((char)((char)(var4[var5] + var5) - var5))) << 3) - 32375) - 'ꬖ') - '궕') >>> 7 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) - var5))) >>> 13 | (char)(-((char)((char)(var4[var5] + var5) - var5))) << 3) - 32375) - 'ꬖ') - '궕') << 9) + '\uf473') - var5) << 15) - 6702));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String iIlIlllllill() {
      return lIiiIiIlilli(lIIiiililiIIiiilil);
   }

   public static String liiiIIllIl() {
      return lIiiIiIlilli(iiiliililIIIiiilil);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4456603379633270174L ^ Long.rotateLeft(3241708205589926765L, 27) ^ 6980295263033086839L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -485059683915871912L ^ Long.rotateLeft(4507417605048698640L, 59) ^ 3678675743218254904L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2708698136602614908L ^ Long.rotateLeft(1443459065826452658L, 8) ^ -7864113313630320149L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3037935140451627403L ^ Long.rotateLeft(8872393894933809322L, 37) ^ -3244797125277467666L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1831214837878189371L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4774284393237680805L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -648239462522359595L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1399481515403200386L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6160215114629800425L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1796438505011456811L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) - var5) << 15 | (char)((char)((char)(~((char)(var4[var5] - var5))) + var5) - var5) >>> 1) + var5) - var5) ^ var5) - var5) + var5))) << 9 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) - var5) << 15 | (char)((char)((char)(~((char)(var4[var5] - var5))) + var5) - var5) >>> 1) + var5) - var5) ^ var5) - var5) + var5))) >>> 7));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\ue56d') >>> 15 | (char)(var4[var5] - '\ue56d') << 1) ^ '鋺') + 2875) ^ var5))) - var5))) << 8 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\ue56d') >>> 15 | (char)(var4[var5] - '\ue56d') << 1) ^ '鋺') + 2875) ^ var5))) - var5))) >>> 8) - '뾡') ^ 15128) - var5) ^ var5) ^ '脪'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String lIiiIiIlilli(List<String> lines) {
      String var1 = (String)lines.get(ThreadLocalRandom.current().nextInt(lines.size()));
      if (var1.equals(IlIiiililllIiiilil)) {
         var1 = (String)lines.get((lines.indexOf(var1) + 1) % lines.size());
      }

      IlIiiililllIiiilil = var1;
      return IilliliilIIi(var1);
   }

   private iiIIlllIIlIlll() {
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - 5273) >>> 11 | (char)((char)(-((char)(var4[var5] + var5))) - 5273) << 5) - '\uf38c') + var5))) >>> 4 | (char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - 5273) >>> 11 | (char)((char)(-((char)(var4[var5] + var5))) - 5273) << 5) - '\uf38c') + var5))) << 12) ^ var5) + var5) - '\ude86'))) << 11 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - 5273) >>> 11 | (char)((char)(-((char)(var4[var5] + var5))) - 5273) << 5) - '\uf38c') + var5))) >>> 4 | (char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) - 5273) >>> 11 | (char)((char)(-((char)(var4[var5] + var5))) - 5273) << 5) - '\uf38c') + var5))) << 12) ^ var5) + var5) - '\ude86'))) >>> 5) ^ 10484));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 5 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 11) ^ '趐') - '鮤'))) + 32473) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 5 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 11) ^ '趐') - '鮤'))) + 32473) << 13) ^ var5) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 5 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 11) ^ '趐') - '鮤'))) + 32473) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) ^ var5) >>> 5 | (char)((char)(~((char)(-var4[var5]))) ^ var5) << 11) ^ '趐') - '鮤'))) + 32473) << 13) ^ var5) << 15) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IilliliilIIi(String line) {
      return line.endsWith(iliIiiliiiii<invokedynamic>()) ? line : line + iliIiiliiiii<invokedynamic>();
   }

   public static String IliIlllilIi() {
      return lIiiIiIlilli(Iiiliililliiliilil);
   }
}
