package gg.corz;

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

public record lIIlIIIliIIlIIIl(String jobId, String ownerId, long leaseGeneration, long assignmentEpoch, llllilllilllilll state, long lastHeartbeatMs, long lastProgressMs, int inFlightActions) {
   private final long lIIlliIlIl;
   private final long IIIlliIlIl;
   private final long llIlliIlIl;
   private final String iiiIliIlIl;
   private final llllilllilllilll iIIlliIlIl;
   private final int ilIlliIlIl;
   private final long IlIlliIlIl;
   private final String liiIliIlIl;

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) ^ var5))) ^ '騑') >>> 15 | (char)((char)(-((char)((char)(~((char)(-((char)(var4[var5] ^ var5))))) ^ var5))) ^ '騑') << 1) ^ 8656) - 10245))) + '궫'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7306509221753969722L ^ Long.rotateLeft(-177727527077087148L, 24) ^ 2549157012492566350L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8042233801866232683L ^ Long.rotateLeft(1571601787749098546L, 37) ^ -4933950453671334190L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3736252029448473928L ^ Long.rotateLeft(-5941064767293891920L, 32) ^ -6621397572270827712L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 959188405374689553L ^ Long.rotateLeft(5626073998551152871L, 31) ^ 8524187841555591709L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -8315564714614772324L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6455569345952735674L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7199717959777926430L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3738813027486115851L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -657727982298162909L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3152974433139365610L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   public long Iiilliiliiil() {
      return this.IlIlliIlIl;
   }

   public llllilllilllilll Ililllililil() {
      return this.iIIlliIlIl;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') << 15 | (char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') >>> 1) ^ var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') << 15 | (char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') >>> 1) ^ var5) - var5) << 1) + 9133) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') << 15 | (char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') >>> 1) ^ var5) - var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') << 15 | (char)((char)((char)((char)(var4[var5] - var5) << 11 | (char)(var4[var5] - var5) >>> 5) + var5) ^ '뇊') >>> 1) ^ var5) - var5) << 1) + 9133) + var5) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IIillIiliIil() {
      return this.lIIlliIlIl;
   }

   public long IIIilIIiiIIi() {
      return this.llIlliIlIl;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) << 2) - 7709) ^ 22396) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) << 2) - 7709) ^ 22396) << 14) + '芻') >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) << 2) - 7709) ^ 22396) >>> 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) >>> 14 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) + 1976) + 10179) - '졣'))) ^ '逌') + 20918) << 2) - 7709) ^ 22396) << 14) + '芻') << 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIIlIIIliIIlIIIl(String assignmentEpoch, String inFlightActions, long ownerId, long state, llllilllilllilll lastHeartbeatMs, long leaseGeneration, long jobId, int lastProgressMs) {
      this.liiIliIlIl = assignmentEpoch;
      this.iiiIliIlIl = inFlightActions;
      this.IIIlliIlIl = ownerId;
      this.lIIlliIlIl = state;
      this.iIIlliIlIl = lastHeartbeatMs;
      this.IlIlliIlIl = leaseGeneration;
      this.llIlliIlIl = jobId;
      this.ilIlliIlIl = lastProgressMs;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) >>> 9 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) << 7) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) >>> 9 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) << 7) << 9) ^ var5) - 'ꁮ') + '먠') + '镚') + 29580) ^ var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) >>> 9 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) << 7) >>> 7 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) >>> 9 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) << 15 | (char)((char)((char)(var4[var5] - var5) - 17450) << 12 | (char)((char)(var4[var5] - var5) - 17450) >>> 4) >>> 1) ^ var5))) << 8) << 7) << 9) ^ var5) - 'ꁮ') + '먠') + '镚') + 29580) ^ var5) << 10))) + 23619));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean iIlIlllllill() {
      return this.iIIlliIlIl == llllilllilllilll.iIIIiIlill || this.iIIlliIlIl == llllilllilllilll.IlIIiIlill;
   }

   public String IIlllIlliIll() {
      return this.liiIliIlIl;
   }

   public boolean liiiIIllIl(String epoch, long member, long gen) {
      return this.IliIlllilIi(epoch) && this.IIIlliIlIl == member && this.lIIlliIlIl == gen && (this.iIIlliIlIl == llllilllilllilll.iIIIiIlill || this.iIIlliIlIl == llllilllilllilll.IlIIiIlill);
   }

   public long Iilllilliill() {
      return this.IIIlliIlIl;
   }

   public boolean IliIlllilIi(String member) {
      return this.iiiIliIlIl != null && this.iiiIliIlIl.equals(member);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 11644) - var5) >>> 11 | (char)((char)((char)(-var4[var5]) + 11644) - var5) << 5) ^ var5) + var5) ^ var5) ^ var5) - 13027) - 24410) ^ 26086) - var5) ^ var5) - 17288) ^ '\ue8a7') - 20030) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 11644) - var5) >>> 11 | (char)((char)((char)(-var4[var5]) + 11644) - var5) << 5) ^ var5) + var5) ^ var5) ^ var5) - 13027) - 24410) ^ 26086) - var5) ^ var5) - 17288) ^ '\ue8a7') - 20030) << 3) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IilliliilIIi(long nowMs, long heartbeatTimeoutMs) {
      if (this.iIIlliIlIl != llllilllilllilll.IiIIiIlill && this.iIIlliIlIl != llllilllilllilll.liIIiIlill) {
         if (this.iIIlliIlIl == llllilllilllilll.llIIiIlill) {
            return false;
         } else if (this.ilIlliIlIl > 0) {
            return false;
         } else {
            return nowMs - this.IlIlliIlIl > heartbeatTimeoutMs;
         }
      } else {
         return false;
      }
   }

   public lIIlIIIliIIlIIIl lIiiIiIlilli(llllilllilllilll s) {
      return new lIIlIIIliIIlIIIl(this.liiIliIlIl, this.iiiIliIlIl, this.IIIlliIlIl, this.lIIlliIlIl, s, this.IlIlliIlIl, this.llIlliIlIl, this.ilIlliIlIl);
   }

   public lIIlIIIliIIlIIIl IIIllIIliIIl(String newOwner, long nowMs, long assignmentEpoch) {
      return new lIIlIIIliIIlIIIl(this.liiIliIlIl, newOwner, this.IIIlliIlIl + 1L, nowMs, newOwner == null ? llllilllilllilll.lIIIiIlill : llllilllilllilll.iIIIiIlill, assignmentEpoch, assignmentEpoch, 0);
   }

   public lIIlIIIliIIlIIIl iliIiiliiiii() {
      return this.lIiiIiIlilli(llllilllilllilll.liIIiIlill);
   }

   public int IlIillIiilIi() {
      return this.ilIlliIlIl;
   }

   public String IiIlliIliiIl() {
      return String.format(Locale.ROOT, IiIiliIiiiIi<invokedynamic>(), this.liiIliIlIl, this.iiiIliIlIl == null ? IiIiliIiiiIi<invokedynamic>() : this.iiiIliIlIl, this.IIIlliIlIl, this.lIIlliIlIl, this.iIIlliIlIl, this.ilIlliIlIl);
   }

   public static lIIlIIIliIIlIIIl IlIlllIlilIl(String jobId) {
      return new lIIlIIIliIIlIIIl(jobId, (String)null, 0L, 0L, llllilllilllilll.lIIIiIlill, 0L, 0L, 0);
   }

   public String Illlllllilll() {
      return this.iiiIliIlIl;
   }
}
