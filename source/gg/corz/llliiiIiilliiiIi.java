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
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record llliiiIiilliiiIi(String jobId, long leaseGeneration, int cellCount, int exactCount, int missingCount, int wrongCount, int unobservedCount, long worldRevision) {
   private final int lliIiIIlIi;
   private final long liiIiIIlIi;
   private final int iliIiIIlIi;
   private final long lIiIiIIlIi;
   private final int iIiIiIIlIi;
   private final String IIiIiIIlIi;
   private final int IiiIiIIlIi;
   private final int IliIiIIlIi;

   public boolean IilliliilIIi() {
      return this.iIiIiIIlIi == 0;
   }

   public boolean IliIlllilIi() {
      return this.iIiIiIIlIi >= 0 && this.lliIiIIlIi == 0 && this.iliIiIIlIi == 0 && this.IiiIiIIlIi == 0 && this.IliIiIIlIi == this.iIiIiIIlIi;
   }

   public int Iiilliiliiil() {
      return this.IiiIiIIlIi;
   }

   public int lIiiIiIlilli() {
      return Math.max(0, this.IliIiIIlIi);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) - 6586))) >>> 5 | (char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) - 6586))) << 11) + var5) - var5) + var5) ^ '뀽'))) - var5))))) << 1 | (char)(~((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) - 6586))) >>> 5 | (char)(-((char)((char)((char)(var4[var5] + var5) << 3 | (char)(var4[var5] + var5) >>> 13) - 6586))) << 11) + var5) - var5) + var5) ^ '뀽'))) - var5))))) >>> 15) - var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIillIiliIil() {
      return this.lliIiIIlIi;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5]) - 659) << 3 | (char)((char)(-var4[var5]) - 659) >>> 13) - 15732))) >>> 11 | (char)(-((char)((char)((char)((char)(-var4[var5]) - 659) << 3 | (char)((char)(-var4[var5]) - 659) >>> 13) - 15732))) << 5) + '这') + '\ud808') ^ 20025))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 8919) - var5) ^ var5) - '팉'))) - var5) ^ var5) ^ '盧') >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 8919) - var5) ^ var5) - '팉'))) - var5) ^ var5) ^ '盧') << 2) ^ '렲') >>> 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 8919) - var5) ^ var5) - '팉'))) - var5) ^ var5) ^ '盧') >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 8919) - var5) ^ var5) - '팉'))) - var5) ^ var5) ^ '盧') << 2) ^ '렲') << 10))) + '풉'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1959189917051788517L ^ Long.rotateLeft(-4649272657267136347L, 20) ^ -4681674083396582294L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4555575266010753053L ^ Long.rotateLeft(-7029659335271697205L, 28) ^ 3711860063602858939L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -782904065932989381L ^ Long.rotateLeft(-5219572617656310856L, 63) ^ 1909407502287068649L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4114332036780576891L ^ Long.rotateLeft(3729275252200908651L, 10) ^ 6608713625265778924L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5441834208615275130L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6980882830672405800L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5498805133597758334L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -548470348928262624L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6078463527812984728L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2158905574477818102L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIiliIiiiIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlilIliiIli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illillliilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilililiiili<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiilIiiiIii<invokedynamic>());
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

   public int Iilllilliill() {
      return this.IliIiIIlIi;
   }

   public long IIlllIlliIll() {
      return this.lIiIiIIlIi;
   }

   public static llliiiIiilliiiIi IlIlllIlilIl(JsonObject o) {
      if (o != null && o.has(IlIillIiilIi<invokedynamic>()) && o.has(IlIillIiilIi<invokedynamic>()) && o.has(IlIillIiilIi<invokedynamic>())) {
         try {
            return new llliiiIiilliiiIi(o.get(IlIillIiilIi<invokedynamic>()).getAsString(), o.has(IlIillIiilIi<invokedynamic>()) ? o.get(IlIillIiilIi<invokedynamic>()).getAsLong() : -1L, o.get(IlIillIiilIi<invokedynamic>()).getAsInt(), o.get(IlIillIiilIi<invokedynamic>()).getAsInt(), o.has(IlIillIiilIi<invokedynamic>()) ? o.get(IlIillIiilIi<invokedynamic>()).getAsInt() : 0, o.has(IlIillIiilIi<invokedynamic>()) ? o.get(IlIillIiilIi<invokedynamic>()).getAsInt() : 0, o.has(IlIillIiilIi<invokedynamic>()) ? o.get(IlIillIiilIi<invokedynamic>()).getAsInt() : 0, o.has(IlIillIiilIi<invokedynamic>()) ? o.get(IlIillIiilIi<invokedynamic>()).getAsLong() : 0L);
         } catch (Exception var2) {
            return null;
         }
      } else {
         return null;
      }
   }

   public int Illlllllilll() {
      return this.iIiIiIIlIi;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) ^ '뛻'))) ^ '홯') ^ '\ue644') ^ var5) - '밂') << 2 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) ^ '뛻'))) ^ '홯') ^ '\ue644') ^ var5) - '밂') >>> 14) >>> 14 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) ^ '뛻'))) ^ '홯') ^ '\ue644') ^ var5) - '밂') << 2 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) ^ '뛻'))) ^ '홯') ^ '\ue644') ^ var5) - '밂') >>> 14) << 2) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IiIlliIliiIl() {
      return this.IIiIiIIlIi;
   }

   public void IIIllIIliIIl(JsonObject o) {
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.IIiIiIIlIi);
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.lIiIiIIlIi);
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.iIiIiIIlIi);
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.IliIiIIlIi);
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.lliIiIIlIi);
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.iliIiIIlIi);
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.IiiIiIIlIi);
      o.addProperty(IlIillIiilIi<invokedynamic>(), this.liiIiIIlIi);
   }

   public String iliIiiliiiii() {
      return String.format(Locale.ROOT, IlIillIiilIi<invokedynamic>(), this.IIiIiIIlIi, this.lIiIiIIlIi, this.iIiIiIIlIi, this.IliIiIIlIi, this.lliIiIIlIi, this.iliIiIIlIi, this.IiiIiIIlIi, this.liiIiIIlIi, this.IliIlllilIi() ? IlIillIiilIi<invokedynamic>() : IlIillIiilIi<invokedynamic>());
   }

   public llliiiIiilliiiIi(String exactCount, long leaseGeneration, int jobId, int worldRevision, int wrongCount, int cellCount, int unobservedCount, long missingCount) {
      this.IIiIiIIlIi = exactCount;
      this.lIiIiIIlIi = leaseGeneration;
      this.iIiIiIIlIi = jobId;
      this.IliIiIIlIi = worldRevision;
      this.lliIiIIlIi = wrongCount;
      this.iliIiIIlIi = cellCount;
      this.IiiIiIIlIi = unobservedCount;
      this.liiIiIIlIi = missingCount;
   }

   public boolean liiiIIllIl() {
      return this.IiiIiIIlIi == 0;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '닲') - 17443) ^ 18176) - var5) + var5))))) + 'ꑗ') ^ var5) << 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '닲') - 17443) ^ 18176) - var5) + var5))))) + 'ꑗ') ^ var5) >>> 11) ^ '锦') - var5) + var5) + var5) + 19790))) + '\ud7ab') << 3 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '닲') - 17443) ^ 18176) - var5) + var5))))) + 'ꑗ') ^ var5) << 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '닲') - 17443) ^ 18176) - var5) + var5))))) + 'ꑗ') ^ var5) >>> 11) ^ '锦') - var5) + var5) + var5) + 19790))) + '\ud7ab') >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill(String expectedJobId, int expectedGeneration, long expectedCellCount) {
      return this.IIiIiIIlIi != null && this.IIiIiIIlIi.equals(expectedJobId) && this.iIiIiIIlIi == expectedGeneration && this.lIiIiIIlIi == expectedCellCount && this.IliIlllilIi();
   }

   public long IIIilIIiiIIi() {
      return this.liiIiIIlIi;
   }

   public int Ililllililil() {
      return this.iliIiIIlIi;
   }

   public llliiiIiilliiiIi(String jobId, long cellCount, int leaseGeneration, int wrongCount, int exactCount, int worldRevision, long missingCount) {
      this(jobId, cellCount, leaseGeneration, wrongCount, exactCount, worldRevision, 0, missingCount);
   }
}
