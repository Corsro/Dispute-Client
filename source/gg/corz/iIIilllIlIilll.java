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

public final class iIIilllIlIilll {
   public int IiiIIlIIiliiIIlIIi;
   public int IIiIIlIIilIiIIlIIi;
   public int iIiIIlIIiIliIIlIIi;
   public int lilIIlIIiiilIIlIIi;
   public int iiiIIlIIiIIIlIlIIi;
   public int lliIIlIIiiliIIlIIi;
   public int illIIlIIiIilIIlIIi;
   public int lIIlIlIIiiIIlIlIIi;

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] + 26228))) << 14 | (char)(-((char)(var4[var5] + 26228))) >>> 2) << 1 | (char)((char)(-((char)(var4[var5] + 26228))) << 14 | (char)(-((char)(var4[var5] + 26228))) >>> 2) >>> 15) - '\ue5b1'))) ^ var5) ^ var5) + '둂') - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') >>> 1) ^ 7573))))) + 19272) ^ var5) + var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') >>> 1) ^ 7573))))) + 19272) ^ var5) + var5) >>> 14) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') >>> 1) ^ 7573))))) + 19272) ^ var5) + var5) << 2 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') << 15 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) >>> 2 | (char)((char)((char)(var4[var5] ^ var5) + 4977) >>> 2 | (char)((char)(var4[var5] ^ var5) + 4977) << 14) << 14) + var5) + 'ꎎ') >>> 1) ^ 7573))))) + 19272) ^ var5) + var5) >>> 14) ^ var5) << 2) - var5) + var5) - var5));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) << 14 | (char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) >>> 2))) << 7 | (char)(~((char)((char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) << 14 | (char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) >>> 2))) >>> 9) - 25928) ^ '騰') + 5721) + var5) ^ '霿') >>> 6 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) << 14 | (char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) >>> 2))) << 7 | (char)(~((char)((char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) << 14 | (char)((char)(var4[var5] - 1159) >>> 14 | (char)(var4[var5] - 1159) << 2) >>> 2))) >>> 9) - 25928) ^ '騰') + 5721) + var5) ^ '霿') << 10) + 'ꌙ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4286837522610992914L ^ Long.rotateLeft(3205594574830989643L, 20) ^ 1913913824387350423L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1205827813922176130L ^ Long.rotateLeft(5844384762044425890L, 47) ^ -2283254032603314057L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7325650502655117709L ^ Long.rotateLeft(4644518858353730781L, 9) ^ -3958906218923650710L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1329617364347043430L ^ Long.rotateLeft(-3377703000521116750L, 23) ^ 1342101603267671418L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7228077707024186938L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1758706449448019401L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7004450447168129994L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 552235516692099987L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 926184592211578787L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4599973619473456267L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
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

   public void IliIlllilIi() {
      this.illIIlIIiIilIIlIIi = this.lilIIlIIiiilIIlIIi = this.IIiIIlIIilIiIIlIIi = this.iIiIIlIIiIliIIlIIi = this.lliIIlIIiiliIIlIIi = this.IiiIIlIIiliiIIlIIi = this.iiiIIlIIiIIIlIlIIi = this.lIIlIlIIiiIIlIlIIi = 0;
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) << 12 | (char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) >>> 4) - '뮘') - '쒟') + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) << 12 | (char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) >>> 4) - '뮘') - '쒟') + var5) >>> 1) - '餘'))) ^ var5))) ^ var5))) << 2 | (char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) << 12 | (char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) >>> 4) - '뮘') - '쒟') + var5) << 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) << 12 | (char)((char)((char)(var4[var5] << 8 | var4[var5] >>> 8) - var5) + var5) >>> 4) - '뮘') - '쒟') + var5) >>> 1) - '餘'))) ^ var5))) ^ var5))) >>> 14))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return IilliliilIIi<invokedynamic>() + this.illIIlIIiIilIIlIIi + IilliliilIIi<invokedynamic>() + this.lilIIlIIiiilIIlIIi + IilliliilIIi<invokedynamic>() + this.IIiIIlIIilIiIIlIIi + IilliliilIIi<invokedynamic>() + this.iIiIIlIIiIliIIlIIi + IilliliilIIi<invokedynamic>() + this.lliIIlIIiiliIIlIIi + IilliliilIIi<invokedynamic>() + this.IiiIIlIIiliiIIlIIi + IilliliilIIi<invokedynamic>() + this.iiiIIlIIiIIIlIlIIi + IilliliilIIi<invokedynamic>() + this.lIIlIlIIiiIIlIlIIi;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 9862) ^ '셳') - var5))) ^ '蕍'))) - var5) >>> 15 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 9862) ^ '셳') - var5))) ^ '蕍'))) - var5) << 1) << 14 | (char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 9862) ^ '셳') - var5))) ^ '蕍'))) - var5) >>> 15 | (char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - 9862) ^ '셳') - var5))) ^ '蕍'))) - var5) << 1) >>> 2))) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void liiiIIllIl(IiilIIllliilIIll r) {
      ++this.illIIlIIiIilIIlIIi;
      this.iiiIIlIIiIIIlIlIIi += r.liiiIIllIl();
      if (r.IilliliilIIi() == iiiillIlIIIIilIl.iiilIlliIl) {
         ++this.IIiIIlIIilIiIIlIIi;
      } else {
         ++this.lilIIlIIiiilIIlIIi;
         if (r.liiiIIllIl() > 0) {
            ++this.lIIlIlIIiiIIlIlIIi;
         }
      }

   }
}
