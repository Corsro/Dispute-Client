package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IIiilIIilIiilIIi {
   public static final Set<String> iIlIiIiiil = Set.of(liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>());
   public static final Set<String> lIlIiIiiil = Set.of(liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>(), liiiIIllIl<invokedynamic>());
   public static final Set<String> IllIiIiiil = Set.of(liiiIIllIl<invokedynamic>());

   public static IIilIiIilIilIiIi IliIlllilIi(String isOtherBot, boolean simpleName) {
      if (simpleName) {
         return IIilIiIilIilIiIi.llliIIiIIi;
      } else if (isOtherBot == null) {
         return IIilIiIilIilIiIi.lIliIIiIIi;
      } else if (IllIiIiiil.contains(isOtherBot)) {
         return IIilIiIilIilIiIi.llliIIiIIi;
      } else if (lIlIiIiiil.contains(isOtherBot)) {
         return IIilIiIilIilIiIi.iIliIIiIIi;
      } else {
         return iIlIiIiiil.contains(isOtherBot) ? IIilIiIilIilIiIi.IlliIIiIIi : IIilIiIilIilIiIi.lIliIIiIIi;
      }
   }

   private IIiilIIilIiilIIi() {
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ 4435))))) - 'ꀿ'))) + 'ퟒ') >>> 5 | (char)((char)(-((char)((char)(-((char)(-((char)((char)(~((char)(var4[var5] << 13 | var4[var5] >>> 3))) ^ 4435))))) - 'ꀿ'))) + 'ퟒ') << 11))));
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
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '郆') << 8 | (char)((char)(var4[var5] ^ var5) ^ '郆') >>> 8) ^ var5) << 1 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '郆') << 8 | (char)((char)(var4[var5] ^ var5) ^ '郆') >>> 8) ^ var5) >>> 15))) + '룓') ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) << 8) ^ var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) << 8) ^ var5) ^ var5) << 7) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) << 8) ^ var5) ^ var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) >>> 11 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) - var5) ^ 31963) ^ 7487))) + var5) ^ 31095) ^ '蝕'))) - 4311) << 5) + var5) << 8) ^ var5) ^ var5) << 7) >>> 2) ^ '\uf5c5'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6609192528845954669L ^ Long.rotateLeft(5506758544830387745L, 40) ^ -4599043057435024535L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1305844209351726247L ^ Long.rotateLeft(3650418193879916837L, 9) ^ 3979684278156396300L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6114804194732952119L ^ Long.rotateLeft(-6598790015581493157L, 9) ^ -5105235502353245803L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4042659834831519048L ^ Long.rotateLeft(-6163284311133650890L, 7) ^ 3132977524878467904L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8967277331982699377L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8506710215602235463L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1995795007102053836L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5367140647632957849L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1104744350050115669L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5086730580103779680L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, iliIiiliiiii<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5) ^ var5) + var5) - var5) ^ var5) ^ '\ue1a7'))) ^ var5) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) << 13 | (char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) >>> 3) + 'ﶩ'))) + var5) - 5453) - 8831) >>> 15 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) << 13 | (char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) >>> 3) + 'ﶩ'))) + var5) - 5453) - 8831) << 1) ^ 19563) ^ var5) - '鏸') - var5) << 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) << 13 | (char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) >>> 3) + 'ﶩ'))) + var5) - 5453) - 8831) >>> 15 | (char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) << 13 | (char)((char)(var4[var5] ^ var5) >>> 10 | (char)(var4[var5] ^ var5) << 6) >>> 3) + 'ﶩ'))) + var5) - 5453) - 8831) << 1) ^ 19563) ^ var5) - '鏸') - var5) >>> 1) ^ 10272) + '슉') + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
