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

public final class lliliillililiill {
   public final long iililiiill;
   private String lIiiliiill;
   public final int Iililiiill;
   public final int lililiiill;
   final long Iliiliiill;
   public final int illiliiill;
   public final long IIiiliiill;
   private iIiIIIIlIliIIIIl iIiiliiill;

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) << 7 | (char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) >>> 9) >>> 15 | (char)((char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) << 7 | (char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) >>> 9) << 1))) - '\uda8c') >>> 13 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) << 7 | (char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) >>> 9) >>> 15 | (char)((char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) << 7 | (char)((char)((char)(var4[var5] ^ 12818) + var5) + var5) >>> 9) << 1))) - '\uda8c') << 3) + 601) - var5) ^ 'ꡗ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   lliliillililiill(int z, int y, int x, String state, iIiIIIIlIliIIIIl mobId, long stamp) {
      this.illiliiill = z;
      this.Iililiiill = y;
      this.lililiiill = x;
      this.iililiiill = iIiIiiIlIliIiiIl.lIiiIiIlilli(z, y, x);
      this.IIiiliiill = iIiIiiIlIliIiiIl.liiiIIllIl(z, x);
      this.lIiiliiill = state;
      this.iIiiliiill = mobId;
      this.Iliiliiill = stamp;
   }

   void iliIiiliiiii(iIiIIIIlIliIIIIl state) {
      this.iIiiliiill = state;
   }

   public boolean liiiIIllIl() {
      return this.lIiiliiill != null;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - '鋙') + 30696) + var5) + var5) ^ '\udf57') ^ '鬻') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - '鋙') + 30696) + var5) + var5) ^ '\udf57') ^ '鬻') << 10) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - '鋙') + 30696) + var5) + var5) ^ '\udf57') ^ '鬻') >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - '鋙') + 30696) + var5) + var5) ^ '\udf57') ^ '鬻') << 10) >>> 11))))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) << 9) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) << 9) << 14) >>> 13 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) << 9) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) << 12 | (char)((char)(var4[var5] << 3 | var4[var5] >>> 13) ^ var5) >>> 4) + 4634) ^ var5)) + 23617))) << 9) << 14) << 3) + var5) + var5) ^ 902));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IliIlllilIi() {
      return this.lIiiliiill;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1006500137760078224L ^ Long.rotateLeft(8219831366553941056L, 10) ^ 6925923136076609233L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8994989981576159718L ^ Long.rotateLeft(-3109358475011628798L, 29) ^ -2438507007733024644L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -6578383860233286469L ^ Long.rotateLeft(-8365410295366351028L, 58) ^ -2197411482106695644L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3420136893298639091L ^ Long.rotateLeft(7699278233942142541L, 15) ^ -7594542408841035132L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2529112099761494019L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8064296544343341883L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7644621953810059449L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8916435181576384281L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5327851505048978199L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 623434151548656930L;
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

   public String toString() {
      return IIIllIIliIIl<invokedynamic>() + this.illiliiill + IIIllIIliIIl<invokedynamic>() + this.Iililiiill + IIIllIIliIIl<invokedynamic>() + this.lililiiill + IIIllIIliIIl<invokedynamic>() + (this.lIiiliiill == null ? IIIllIIliIIl<invokedynamic>() : this.lIiiliiill) + IIIllIIliIIl<invokedynamic>() + this.iIiiliiill + IIIllIIliIIl<invokedynamic>();
   }

   public boolean IilliliilIIi() {
      return this.iIiiliiill == iIiIIIIlIliIIIIl.lllIliIlIl;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) << 15 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) >>> 1))) >>> 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) << 15 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) >>> 1))) << 13) + var5) << 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) << 15 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) >>> 1))) >>> 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) << 15 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) >>> 3 | (char)(~((char)((char)((char)((char)((char)var4[var5] ^ 25574) + var5) - '鞼') + 'ꔗ'))) << 13) ^ var5) - var5) + 30362) + '蹭') >>> 14) >>> 1))) << 13) + var5) >>> 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIiIIIIlIliIIIIl iIlIlllllill() {
      return this.iIiiliiill;
   }

   void lIiiIiIlilli(String mobId) {
      this.lIiiliiill = mobId;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) >>> 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) << 13))) << 13 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) >>> 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) << 13))) >>> 3))) ^ var5) >>> 6 | (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) >>> 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) << 13))) << 13 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) >>> 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) << 1 | (char)((char)((char)((char)(var4[var5] + 9430) >>> 7 | (char)(var4[var5] + 9430) << 9) - var5) ^ 12276) >>> 15) + '령') ^ var5) + '먊'))) + var5) + var5) ^ 3086) << 13))) >>> 3))) ^ var5) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
