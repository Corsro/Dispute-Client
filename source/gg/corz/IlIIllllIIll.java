package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.LongPredicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlIIllllIIll {
   private long ilIlIiilIiIlIiil = Long.MIN_VALUE;
   private int liIlIiiliiIlIiil;
   private final int IlIlIiilllIlIiil;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 12 | (char)(-var4[var5]) << 4) - var5) - 10402) >>> 10 | (char)((char)((char)((char)(-var4[var5]) >>> 12 | (char)(-var4[var5]) << 4) - var5) - 10402) << 6) + var5))) - var5) + var5) + 19314) - 'ힸ') + var5) + 3100));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill() {
      this.ilIlIiilIiIlIiil = Long.MIN_VALUE;
      this.liIlIiiliiIlIiil = 0;
   }

   public IlIIllllIIll(int maximum) {
      if (maximum < 1) {
         throw new IllegalArgumentException(iliIiiliiiii<invokedynamic>());
      } else {
         this.IlIlIiilllIlIiil = maximum;
      }
   }

   public Long IliIlllilIi(LongPredicate eligible) {
      if (this.ilIlIiilIiIlIiil != Long.MIN_VALUE && this.liIlIiiliiIlIiil < this.IlIlIiilllIlIiil && eligible.test(this.ilIlIiilIiIlIiil)) {
         return this.ilIlIiilIiIlIiil;
      } else {
         this.iIlIlllllill();
         return null;
      }
   }

   public void liiiIIllIl(long nextRoot) {
      if (this.ilIlIiilIiIlIiil != nextRoot) {
         this.ilIlIiilIiIlIiil = nextRoot;
         this.liIlIiiliiIlIiil = 0;
      }

      ++this.liIlIiiliiIlIiil;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) << 11 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) >>> 5) >>> 14 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) << 11 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) >>> 5) << 2) - '\ue126') << 1 | (char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) << 11 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) >>> 5) >>> 14 | (char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) << 11 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] + 16360) - var5) - var5))) + var5) + var5) ^ '膊') + 30502) << 10) ^ 4703))))) >>> 5) << 2) - '\ue126') >>> 15) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IilliliilIIi() {
      return this.ilIlIiilIiIlIiil;
   }

   public int lIiiIiIlilli() {
      return this.liIlIiiliiIlIiil;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') >>> 14 | (char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') << 2) - '铆') - 16125) ^ var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') >>> 14 | (char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') << 2) - '铆') - 16125) ^ var5) << 4) ^ 24352) + '䀘') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') >>> 14 | (char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') << 2) - '铆') - 16125) ^ var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') >>> 14 | (char)((char)((char)((char)(var4[var5] - var5) ^ '\uf413') + var5) ^ '\uf02b') << 2) - '铆') - 16125) ^ var5) << 4) ^ 24352) + '䀘') >>> 10))))) - 'ﴉ'))) - 32758) + '\uf703'));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2227) >>> 13 | (char)(var4[var5] ^ 2227) << 3) - '芄') ^ '맃') ^ var5) ^ var5) + var5) + var5) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 2227) >>> 13 | (char)(var4[var5] ^ 2227) << 3) - '芄') ^ '맃') ^ var5) ^ var5) + var5) + var5) << 1))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3627815134256215811L ^ Long.rotateLeft(8791083330884888249L, 6) ^ 4784999723598024833L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -187405260663246086L ^ Long.rotateLeft(-8539627891503596466L, 49) ^ 8457801876287075646L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7609970492669067885L ^ Long.rotateLeft(8378847951931055135L, 36) ^ -957688636030367165L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 9031749647281719063L ^ Long.rotateLeft(-3218079205531295722L, 2) ^ -5699883021478860066L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6440357670867394200L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7611623193901416279L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7750813509330547672L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1339702544428968235L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4407166551607391099L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5312298212881874837L;
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
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) - '騨'))) >>> 4 | (char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) - '騨'))) << 12))) ^ var5) - 1631) + var5) - var5) + var5) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) - '騨'))) >>> 4 | (char)(~((char)((char)(~((char)((char)(-var4[var5]) - var5))) - '騨'))) << 12))) ^ var5) - 1631) + var5) - var5) + var5) << 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
