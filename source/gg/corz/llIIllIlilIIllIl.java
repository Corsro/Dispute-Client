package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class llIIllIlilIIllIl {
   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4526366332514752540L ^ Long.rotateLeft(8590378258044454697L, 3) ^ 8977659828994338322L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6836098718674502021L ^ Long.rotateLeft(4778518774214602509L, 18) ^ 1803602128891460723L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5187059926015605203L ^ Long.rotateLeft(3986072592476375696L, 30) ^ -3334696376575402308L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5373720521503358128L ^ Long.rotateLeft(-3161841217842277932L, 50) ^ 2852232845144528052L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8313520970493834033L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4461435607576581681L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8197235753909061220L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -9212032422646395339L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4786739381721009469L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6117367657409674462L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIllIIliIIl<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ '뵏'))) ^ '꜎'))) + var5) + var5) - var5) - 25872) ^ var5) - 28196) ^ 4369) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ '뵏'))) ^ '꜎'))) + var5) + var5) - var5) - 25872) ^ var5) - 28196) ^ 4369) >>> 3) - '\ued23') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ '뵏'))) ^ '꜎'))) + var5) + var5) - var5) - 25872) ^ var5) - 28196) ^ 4369) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ '뵏'))) ^ '꜎'))) + var5) + var5) - var5) - 25872) ^ var5) - 28196) ^ 4369) >>> 3) - '\ued23') >>> 9))) - '\ufafc'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) ^ var5) << 9 | (char)((char)(~var4[var5]) ^ var5) >>> 7))) + var5))) - var5) << 2 | (char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) ^ var5) << 9 | (char)((char)(~var4[var5]) ^ var5) >>> 7))) + var5))) - var5) >>> 14))))))) ^ 8133) ^ 24147) - 1638) ^ 6774) + var5) >>> 7 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)(-((char)((char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) ^ var5) << 9 | (char)((char)(~var4[var5]) ^ var5) >>> 7))) + var5))) - var5) << 2 | (char)((char)(~((char)((char)(-((char)((char)((char)(~var4[var5]) ^ var5) << 9 | (char)((char)(~var4[var5]) ^ var5) >>> 7))) + var5))) - var5) >>> 14))))))) ^ 8133) ^ 24147) - 1638) ^ 6774) + var5) << 9) ^ '읚') - 14209));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Path IliIlllilIi(String schematicFile) {
      long var3 = 7565485220608491695L;
      String var1 = schematicFile != null && !schematicFile.isBlank() ? schematicFile : iIlIlllllill<invokedynamic>();
      var3 ^= ((long)var1.lastIndexOf(46) << 32 ^ var3) & -1L << 32;
      if ((int)(var3 >>> 32) > 0) {
         var1 = var1.substring(0, (int)(var3 >>> 32));
      }

      return lIIiIiIiiIIiIiIi.IliIlllilIi().resolve(iIlIlllllill<invokedynamic>()).resolve(var1 + iIlIlllllill<invokedynamic>());
   }

   private llIIllIlilIIllIl() {
   }

   public static lIliIIliiIliIIli liiiIIllIl(String schematicFile) {
      try {
         Path var1 = IliIlllilIi(schematicFile);
         return !Files.exists(var1, new LinkOption[0]) ? null : lIliIIliiIliIIli.Illillliilli(Files.readString(var1));
      } catch (Exception var2) {
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) << 2 | (char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) >>> 14) >>> 9 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) << 2 | (char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) >>> 14) << 7))) - var5) >>> 3 | (char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) << 2 | (char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) >>> 14) >>> 9 | (char)((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) << 2 | (char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) ^ var5))) ^ 16989) + var5) - var5))) >>> 14) << 7))) - var5) << 13) - '\ue8ed') - '킶'))))))) + 2210) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) >>> 1) + var5) + 3516) + var5) << 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) >>> 1) + var5) + 3516) + var5) >>> 11) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) >>> 1) + var5) + 3516) + var5) << 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) ^ var5) ^ '軱'))) - var5) - '깛') ^ 4630) + 25043) + 14435))) ^ 22365) >>> 1) + var5) + 3516) + var5) >>> 11) << 4) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] + 406)))))) ^ 16835) + 5043) >>> 13 | (char)((char)((char)((char)(-((char)(-((char)(var4[var5] + 406)))))) ^ 16835) + 5043) << 3) ^ var5) ^ var5) << 8 | (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] + 406)))))) ^ 16835) + 5043) >>> 13 | (char)((char)((char)((char)(-((char)(-((char)(var4[var5] + 406)))))) ^ 16835) + 5043) << 3) ^ var5) ^ var5) >>> 8) - 315) ^ var5) - 'ꖁ') - var5) - var5) - var5) ^ 288) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
