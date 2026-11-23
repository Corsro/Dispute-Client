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
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iIiIliIliIli(ilIIlliIiIIlli kind, long semanticKey, long target, long stand, int transitionKind, long support, long accessFamily, long dependencyFingerprint, long[] dependencyCells, String reason) {
   private final long lIliIiIIliIliIiIIl;
   private final int IlliIiIIlllliIiIIl;
   private final String lliiIiIIliliiIiIIl;
   private final long illiIiIIlIiliIiIIl;
   private final long IIiiIiIIllIiiIiIIl;
   private final long IiIiIiIIlliIiIiIIl;
   private final long[] iIiiIiIIlIliiIiIIl;
   private final long iiIiIiIIlIIliIiIIl;
   private final ilIIlliIiIIlli llIiIiIIlilIiIiIIl;
   private final long liliIiIIliiliIiIIl;

   public String iliIiiliiiii() {
      return String.format(Locale.ROOT, IIIilIIiiIIi<invokedynamic>(), this.llIiIiIIlilIiIiIIl, this.IiIiIiIIlliIiIiIIl, this.iIiiIiIIlIliiIiIIl.length, this.lliiIiIIliliiIiIIl);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\ua8cd') - 19006) - 25687) >>> 4 | (char)((char)((char)(var4[var5] - '\ua8cd') - 19006) - 25687) << 12) ^ '븰') ^ var5)) + 30207))))) ^ var5) ^ 14517) + 25581) - 15242) ^ var5) - 19024) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long Ililllililil() {
      return this.IIiiIiIIllIiiIiIIl;
   }

   public static long lIiiIiIlilli(long from, long to, int transitionKind) {
      return from * 1099511628211L ^ Long.rotateLeft(to, 31) ^ (long)transitionKind * 2870177450012600261L;
   }

   public long IlIlllIlilIl() {
      return this.IiIiIiIIlliIiIiIIl;
   }

   public ilIIlliIiIIlli IIIllIIliIIl() {
      return this.llIiIiIIlilIiIiIIl;
   }

   public long IIillIiliIil() {
      return this.liliIiIIliiliIiIIl;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(-var4[var5]) ^ '\uf84f'))))))) + var5) + var5) + var5) + var5) ^ '쮑'))))) >>> 5 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(-var4[var5]) ^ '\uf84f'))))))) + var5) + var5) + var5) + var5) ^ '쮑'))))) << 11))) >>> 13 | (char)(~((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(-var4[var5]) ^ '\uf84f'))))))) + var5) + var5) + var5) + var5) ^ '쮑'))))) >>> 5 | (char)(-((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)(-var4[var5]) ^ '\uf84f'))))))) + var5) + var5) + var5) + var5) ^ '쮑'))))) << 11))) << 3) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.IlliIiIIlllliIiIIl;
   }

   public long IIlllIlliIll() {
      return this.lIliIiIIliIliIiIIl;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)(~((char)(-((char)(~((char)((char)(-((char)(~((char)((char)(~((char)((char)(var4[var5] ^ '獵') << 8 | (char)(var4[var5] ^ '獵') >>> 8))) << 13 | (char)(~((char)((char)(var4[var5] ^ '獵') << 8 | (char)(var4[var5] ^ '獵') >>> 8))) >>> 3))))) + var5))))))) + 26204))))) + var5) << 4 | (char)((char)(~((char)(-((char)((char)(~((char)(-((char)(~((char)((char)(-((char)(~((char)((char)(~((char)((char)(var4[var5] ^ '獵') << 8 | (char)(var4[var5] ^ '獵') >>> 8))) << 13 | (char)(~((char)((char)(var4[var5] ^ '獵') << 8 | (char)(var4[var5] ^ '獵') >>> 8))) >>> 3))))) + var5))))))) + 26204))))) + var5) >>> 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Iiilliiliiil() {
      return this.lliiIiIIliliiIiIIl;
   }

   public boolean iIlIlllllill(LongUnaryOperator stateOf) {
      return this.iIiiIiIIlIliiIiIIl.length == 0 || liiiIIllIl(this.iIiiIiIIlIliiIiIIl, stateOf) == this.IIiiIiIIllIiiIiIIl;
   }

   public long Iilllilliill() {
      return this.illiIiIIlIiliIiIIl;
   }

   public static long IilliliilIIi(long target, long stand) {
      return 2585217853L ^ target * -7046029254386353131L ^ Long.rotateLeft(stand * -4417276706812531889L, 29);
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - '즒') ^ '푳') >>> 6 | (char)((char)(var4[var5] - '즒') ^ '푳') << 10))) - var5) + var5) ^ var5))))) >>> 2 | (char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - '즒') ^ '푳') >>> 6 | (char)((char)(var4[var5] - '즒') ^ '푳') << 10))) - var5) + var5) ^ var5))))) << 14) ^ '\ueb60') >>> 8 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - '즒') ^ '푳') >>> 6 | (char)((char)(var4[var5] - '즒') ^ '푳') << 10))) - var5) + var5) ^ var5))))) >>> 2 | (char)(~((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] - '즒') ^ '푳') >>> 6 | (char)((char)(var4[var5] - '즒') ^ '푳') << 10))) - var5) + var5) ^ var5))))) << 14) ^ '\ueb60') << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1756399957574214008L ^ Long.rotateLeft(804347392992651197L, 24) ^ 8915412190854670475L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1489003107079443154L ^ Long.rotateLeft(8819806695729858932L, 53) ^ 1451655506694749164L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4993297599678445257L ^ Long.rotateLeft(-485805969752924190L, 36) ^ 2287120247603562952L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3590033123119680567L ^ Long.rotateLeft(-8460236250475831470L, 22) ^ 7523486911949540305L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2772884887570798252L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3350805097353025204L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8417115170000487782L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3174401275640043022L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4196171383611657781L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2552756151589534695L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   public long[] IliIlllilIi() {
      return (long[])this.iIiiIiIIlIliiIiIIl.clone();
   }

   public iIiIliIliIli(ilIIlliIiIIlli reason, long semanticKey, long transitionKind, long dependencyCells, int target, long stand, long support, long accessFamily, long[] kind, String dependencyFingerprint) {
      kind = kind == null ? new long[0] : (long[])(([J)kind).clone();
      dependencyFingerprint = dependencyFingerprint != null && !dependencyFingerprint.isBlank() ? dependencyFingerprint : reason.name();
      this.llIiIiIIlilIiIiIIl = reason;
      this.IiIiIiIIlliIiIiIIl = semanticKey;
      this.iiIiIiIIlIIliIiIIl = transitionKind;
      this.lIliIiIIliIliIiIIl = dependencyCells;
      this.IlliIiIIlllliIiIIl = target;
      this.illiIiIIlIiliIiIIl = stand;
      this.liliIiIIliiliIiIIl = support;
      this.IIiiIiIIllIiiIiIIl = accessFamily;
      this.iIiiIiIIlIliiIiIIl = kind;
      this.lliiIiIIliliiIiIIl = dependencyFingerprint;
   }

   public long IiIlliIliiIl() {
      return this.iiIiIiIIlIIliIiIIl;
   }

   public static long liiiIIllIl(long[] stateOf, LongUnaryOperator cells) {
      long var9 = -743237448146434599L;
      long var2 = -3750763034362895579L;
      long[] var4 = stateOf;
      var9 ^= ((long)stateOf.length << 32 ^ var9) & -1L << 32;

      for(long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
         long var7 = var4[(int)var12];
         var2 = (var2 ^ var7 * -7046029254386353131L + cells.applyAsLong(var7)) * 1099511628211L;
      }

      return var2;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) >>> 3 | (char)(var4[var5] << 7 | var4[var5] >>> 9) << 13) ^ '蕸') - var5) - '\ueb5b') >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) >>> 3 | (char)(var4[var5] << 7 | var4[var5] >>> 9) << 13) ^ '蕸') - var5) - '\ueb5b') << 4))) + '닪') ^ 21250) + var5))) - '黒') + var5) << 1 | (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) >>> 3 | (char)(var4[var5] << 7 | var4[var5] >>> 9) << 13) ^ '蕸') - var5) - '\ueb5b') >>> 12 | (char)((char)((char)((char)((char)(var4[var5] << 7 | var4[var5] >>> 9) >>> 3 | (char)(var4[var5] << 7 | var4[var5] >>> 9) << 13) ^ '蕸') - var5) - '\ueb5b') << 4))) + '닪') ^ 21250) + var5))) - '黒') + var5) >>> 15) - 1496));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
