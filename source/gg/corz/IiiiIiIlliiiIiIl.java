package gg.corz;

import com.google.gson.JsonObject;
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

public final class IiiiIiIlliiiIiIl {
   public final int iIIIiliIll;
   public final int IIIIiliIll;
   public final int IIiilliIll;
   public final int liiilliIll;
   public final String iililliIll;
   public final int IiiilliIll;
   public int IiIIiliIll;
   public long liIIiliIll;
   public long IIlIiliIll;
   public final int iiiilliIll;
   public final int lIiilliIll;
   public IliilIillliilIil llIIiliIll;
   public long iiIIiliIll;
   public final int lliilliIll;
   public int ilIIiliIll;
   public String IlIIiliIll;
   public final int iliilliIll;
   public final IiiIIlllliiIIlll lIIIiliIll;
   public final int IliilliIll;
   public String lIlIiliIll;
   public final int iIiilliIll;

   public double iIlIlllllill() {
      return (double)(this.iliilliIll + this.iiiilliIll) / (double)2.0F + (double)0.5F;
   }

   public boolean IIIllIIliIIl(String member, long generation) {
      return member != null && member.equals(this.IlIIiliIll) && generation == this.IIlIiliIll && !this.IilliliilIIi();
   }

   public double IliIlllilIi() {
      return (double)(this.IliilliIll + this.IiiilliIll) / (double)2.0F + (double)0.5F;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + var5) + var5) - var5) ^ var5) << 15 | (char)((char)((char)((char)(var4[var5] + var5) + var5) - var5) ^ var5) >>> 1))) + var5) ^ var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli() {
      return this.llIIiliIll.IliIlllilIi();
   }

   public void iliIiiliiiii(IliilIillliilIil to) {
      if (this.IlIIiliIll != null) {
         ++this.IIlIiliIll;
         this.lIlIiliIll = this.IlIIiliIll;
      }

      this.IlIIiliIll = null;
      this.llIIiliIll = to == null ? IliilIillliilIil.IIilIllIil : to;
      this.iiIIiliIll = 0L;
   }

   public void IiIlliIliiIl(JsonObject o) {
      if (o != null) {
         this.IlIIiliIll = o.has(IIlllIlliIll<invokedynamic>()) ? o.get(IIlllIlliIll<invokedynamic>()).getAsString() : null;
         this.llIIiliIll = IliilIillliilIil.liiiIIllIl(o.has(IIlllIlliIll<invokedynamic>()) ? o.get(IIlllIlliIll<invokedynamic>()).getAsString() : null);
         this.ilIIiliIll = o.has(IIlllIlliIll<invokedynamic>()) ? o.get(IIlllIlliIll<invokedynamic>()).getAsInt() : 0;
         this.IiIIiliIll = o.has(IIlllIlliIll<invokedynamic>()) ? o.get(IIlllIlliIll<invokedynamic>()).getAsInt() : 0;
         this.iiIIiliIll = o.has(IIlllIlliIll<invokedynamic>()) ? o.get(IIlllIlliIll<invokedynamic>()).getAsLong() : 0L;
         this.liIIiliIll = o.has(IIlllIlliIll<invokedynamic>()) ? o.get(IIlllIlliIll<invokedynamic>()).getAsLong() : 0L;
         this.IIlIiliIll = o.has(IIlllIlliIll<invokedynamic>()) ? o.get(IIlllIlliIll<invokedynamic>()).getAsLong() : 0L;
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - '\uf285') - 15899)))))) - var5) >>> 6 | (char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] << 3 | var4[var5] >>> 13) - '\uf285') - 15899)))))) - var5) << 10) + var5))) - '超'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1352083444913756351L ^ Long.rotateLeft(-2300778794266001754L, 49) ^ -6747864813274070747L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6687859860863034162L ^ Long.rotateLeft(-9191374388904041064L, 29) ^ -3722627877819629154L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8746933024711818683L ^ Long.rotateLeft(3044576742899652054L, 20) ^ -255002911154988693L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -723527920579021557L ^ Long.rotateLeft(-3103326603536399368L, 18) ^ -4392966705717719111L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6559492197533198999L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4693480263346818319L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -1501688026005062993L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3363672106907229150L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1995252535389006736L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7226344545131181386L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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

   public double liiiIIllIl() {
      return (double)(this.lliilliIll + this.liiilliIll) / (double)2.0F + (double)0.5F;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) >>> 12) << 1 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) >>> 12) >>> 15) >>> 10 | (char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) >>> 12) << 1 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) << 4 | (char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) << 9 | (char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '\ue418') ^ var5) << 7 | (char)((char)(var4[var5] ^ '\ue418') ^ var5) >>> 9) - '蹲') - '풴'))))) >>> 7)) >>> 2) >>> 12) >>> 15) << 6) - var5) - '\uf015'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonObject IlIlllIlilIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IIlllIlliIll<invokedynamic>(), this.iililliIll);
      if (this.IlIIiliIll != null) {
         var1.addProperty(IIlllIlliIll<invokedynamic>(), this.IlIIiliIll);
      }

      var1.addProperty(IIlllIlliIll<invokedynamic>(), this.llIIiliIll.name());
      if (this.ilIIiliIll > 0) {
         var1.addProperty(IIlllIlliIll<invokedynamic>(), this.ilIIiliIll);
      }

      if (this.IiIIiliIll > 0) {
         var1.addProperty(IIlllIlliIll<invokedynamic>(), this.IiIIiliIll);
      }

      if (this.iiIIiliIll > 0L) {
         var1.addProperty(IIlllIlliIll<invokedynamic>(), this.iiIIiliIll);
      }

      if (this.liIIiliIll > 0L) {
         var1.addProperty(IIlllIlliIll<invokedynamic>(), this.liIIiliIll);
      }

      if (this.IIlIiliIll > 0L) {
         var1.addProperty(IIlllIlliIll<invokedynamic>(), this.IIlIiliIll);
      }

      return var1;
   }

   public IiiiIiIlliiiIiIl(String maxY, int cubeZ, int materials, int cubeX, int minX, int id, int maxZ, int cubeY, int cellCount, int minY, int minZ, IiiIIlllliiIIlll maxX, int layer) {
      this.llIIiliIll = IliilIillliilIil.IIilIllIil;
      this.iililliIll = maxY;
      this.IIiilliIll = cubeZ;
      this.lIiilliIll = materials;
      this.iIiilliIll = cubeX;
      this.IliilliIll = minX;
      this.lliilliIll = id;
      this.iliilliIll = maxZ;
      this.IiiilliIll = cubeY;
      this.liiilliIll = cellCount;
      this.iiiilliIll = minY;
      this.IIIIiliIll = minZ;
      this.lIIIiliIll = maxX;
      this.iIIIiliIll = layer;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ '鯸') ^ var5) - var5))) + var5) - var5))) - 30678) + var5) >>> 10 | (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ '鯸') ^ var5) - var5))) + var5) - var5))) - 30678) + var5) << 6) ^ 20215) + 23393));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - '錟') >>> 5 | (char)(var4[var5] - '錟') << 11) >>> 15 | (char)((char)(var4[var5] - '錟') >>> 5 | (char)(var4[var5] - '錟') << 11) << 1))) + 23894))) << 3 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] - '錟') >>> 5 | (char)(var4[var5] - '錟') << 11) >>> 15 | (char)((char)(var4[var5] - '錟') >>> 5 | (char)(var4[var5] - '錟') << 11) << 1))) + 23894))) >>> 13) ^ 26307))) + 25553))))) - '퉇'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi() {
      return this.llIIiliIll == IliilIillliilIil.ililIllIil;
   }
}
