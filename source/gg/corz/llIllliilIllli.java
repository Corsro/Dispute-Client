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

public record llIllliilIllli(IIiIlIilIiIlIi ticket, String why) {
   private final IIiIlIilIiIlIi ilililIIIl;
   private final String IiililIIIl;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3251668280772442390L ^ Long.rotateLeft(23917043239436523L, 46) ^ -4220419282688407641L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5633406156561802937L ^ Long.rotateLeft(5881788324623577874L, 6) ^ 2956714210207998024L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7551461642986852939L ^ Long.rotateLeft(4623874573403881087L, 40) ^ -5287894630451954353L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5472030536359674446L ^ Long.rotateLeft(6862517344413628928L, 49) ^ 5310704702085776029L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1522805524300654865L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 159841420518166530L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3313364542466481600L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5258026252980370087L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3697213548867250752L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6349783283178559646L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
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

   public String iIlIlllllill() {
      return this.IiililIIIl;
   }

   public llIllliilIllli(IIiIlIilIiIlIi why, String ticket) {
      this.ilililIIIl = why;
      this.IiililIIIl = ticket;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) >>> 13) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) >>> 13) >>> 5) - 'ꁏ') - 27370) ^ 11923) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) >>> 13) << 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') >>> 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) >>> 10 | (char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) + 8984) >>> 9 | (char)((char)(-((char)(var4[var5] ^ var5))) + 8984) << 7) ^ 19570) + 219) << 6) + '贈') << 9))) - var5) ^ var5) >>> 13) >>> 5) - 'ꁏ') - 27370) ^ 11923) << 10) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIiIlIilIiIlIi liiiIIllIl() {
      return this.ilililIIIl;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 29637) ^ var5) + 4760) - 9555) - var5) ^ 'ꪃ') ^ 3142) - var5) - 14385))) + '谹') + '\udd48') + 25276))))));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(var4[var5] - '똈'))))))))) + var5) >>> 15 | (char)((char)(-((char)(~((char)(~((char)(-((char)(var4[var5] - '똈'))))))))) + var5) << 1) - var5) << 2 | (char)((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(var4[var5] - '똈'))))))))) + var5) >>> 15 | (char)((char)(-((char)(~((char)(~((char)(-((char)(var4[var5] - '똈'))))))))) + var5) << 1) - var5) >>> 14) - var5) + var5) ^ var5) ^ 5153) + 11607))) - '귗')) + '餸'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) << 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) >>> 3) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) << 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) >>> 3) >>> 9) ^ var5) ^ '魆') ^ 28637) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) << 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) >>> 3) << 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) << 13 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) << 3 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - '\uedd0') - var5) - '쿪') - '\ude2d') - var5) >>> 13))) ^ 32150) >>> 3) >>> 9) ^ var5) ^ '魆') ^ 28637) << 13) - 26516));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      return this.ilililIIIl.lIiiIiIlilli() + IilliliilIIi<invokedynamic>() + this.ilililIIIl.iliIiiliiiii() + IilliliilIIi<invokedynamic>() + this.IiililIIIl;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) + var5) + 29021) ^ '핾') << 1 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) + var5) + 29021) ^ '핾') >>> 15) ^ var5) - var5))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) + var5) + 29021) ^ '핾') << 1 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] ^ var5))) << 2 | (char)(-((char)(var4[var5] ^ var5))) >>> 14))) - var5) + var5) + 29021) ^ '핾') >>> 15) ^ var5) - var5))) << 11) + var5) ^ '\uea75')) + '跇') + 6365) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
