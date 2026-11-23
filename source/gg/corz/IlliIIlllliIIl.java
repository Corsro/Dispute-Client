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

public record IlliIIlllliIIl(long target, long support, boolean supportTopFull, boolean headroomClear, boolean feetOnTarget, boolean materialInHand, boolean plainOrExactState, String reject) {
   private final long IIilliiIllIilliiIl;
   private final String IlIiliiIlllIiliiIl;
   private final boolean lIIiliiIliIIiliiIl;
   private final boolean llilliiIlililliiIl;
   private final boolean iIilliiIlIlilliiIl;
   private final boolean IiilliiIlliilliiIl;
   private final boolean iiilliiIlIIIiliiIl;
   private final long lillliiIliillliiIl;

   public static IlliIIlllliIIl liiiIIllIl(long headroomClear, long feetOnTarget, boolean support, boolean materialInHand, boolean target, boolean plainOrExactState, boolean supportTopFull) {
      String var9 = null;
      if (!target) {
         var9 = Illlllllilll<invokedynamic>();
      } else if (!support) {
         var9 = Illlllllilll<invokedynamic>();
      } else if (!materialInHand) {
         var9 = Illlllllilll<invokedynamic>();
      } else if (!plainOrExactState) {
         var9 = Illlllllilll<invokedynamic>();
      } else if (!supportTopFull) {
         var9 = Illlllllilll<invokedynamic>();
      }

      return new IlliIIlllliIIl(headroomClear, feetOnTarget, support, materialInHand, target, plainOrExactState, supportTopFull, var9);
   }

   public boolean IIIllIIliIIl() {
      return this.IiilliiIlliilliiIl;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) << 13) >>> 2 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) << 13) << 14) >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) << 13) >>> 2 | (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) >>> 3 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) >>> 3 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '곷') - '键') - var5) << 13) ^ var5))) + var5) + var5) ^ 2831) ^ 9767))) ^ var5) << 13) << 14) << 4) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '뜯'))) ^ var5) >>> 11 | (char)((char)(~((char)((char)(var4[var5] + var5) + '뜯'))) ^ var5) << 5) ^ var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] + var5) + '뜯'))) ^ var5) >>> 11 | (char)((char)(~((char)((char)(var4[var5] + var5) + '뜯'))) ^ var5) << 5) ^ var5) << 6) + '췮'))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long iIlIlllllill() {
      return this.lillliiIliillliiIl;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4681581416553934568L ^ Long.rotateLeft(-5957999939324178239L, 1) ^ -7536791867490890282L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1994133991592055510L ^ Long.rotateLeft(-2034069989096142906L, 37) ^ 9142233029815143114L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4264151806093523478L ^ Long.rotateLeft(3642472656454303402L, 45) ^ -3504581073634125686L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7276002915144022860L ^ Long.rotateLeft(2848509095387663430L, 2) ^ -7239996335837362940L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4728036898588921569L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2307565977288193329L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4238614342796794276L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7212422736535874444L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7515350119728775209L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3205719617447464669L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   public long IilliliilIIi() {
      return this.IIilliiIllIilliiIl;
   }

   public boolean lIiiIiIlilli() {
      return this.iIilliiIlIlilliiIl;
   }

   public boolean IlIlllIlilIl() {
      return this.iiilliiIlIIIiliiIl;
   }

   public boolean iliIiiliiiii() {
      return this.llilliiIlililliiIl;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '\ud9e7') + var5) ^ 12497) + var5))) ^ '\ue496') ^ 'ꉈ') ^ var5))) >>> 5 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '\ud9e7') + var5) ^ 12497) + var5))) ^ '\ue496') ^ 'ꉈ') ^ var5))) << 11))) ^ 6419) >>> 11 | (char)((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '\ud9e7') + var5) ^ 12497) + var5))) ^ '\ue496') ^ 'ꉈ') ^ var5))) >>> 5 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - '\ud9e7') + var5) ^ 12497) + var5))) ^ '\ue496') ^ 'ꉈ') ^ var5))) << 11))) ^ 6419) << 5) ^ 3767));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIlliIliiIl() {
      return this.lIIiliiIliIIiliiIl;
   }

   public IlliIIlllliIIl(long support, long supportTopFull, boolean reject, boolean plainOrExactState, boolean target, boolean materialInHand, boolean feetOnTarget, String headroomClear) {
      this.lillliiIliillliiIl = support;
      this.IIilliiIllIilliiIl = supportTopFull;
      this.iIilliiIlIlilliiIl = reject;
      this.llilliiIlililliiIl = plainOrExactState;
      this.IiilliiIlliilliiIl = target;
      this.iiilliiIlIIIiliiIl = materialInHand;
      this.lIIiliiIliIIiliiIl = feetOnTarget;
      this.IlIiliiIlllIiliiIl = headroomClear;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ 30109) - var5))) << 9 | (char)(-((char)((char)((char)(var4[var5] << 13 | var4[var5] >>> 3) ^ 30109) - var5))) >>> 7) - var5) ^ var5) ^ '\uef56') - 26211) + 22463));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this.IlIiliiIlllIiliiIl == null;
   }

   public String IIlllIlliIll() {
      return this.IlIiliiIlllIiliiIl;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ '뚓') >>> 15 | (char)((char)(-var4[var5]) ^ '뚓') << 1))) ^ 21671) + var5) << 4 | (char)((char)((char)(-((char)((char)((char)(-var4[var5]) ^ '뚓') >>> 15 | (char)((char)(-var4[var5]) ^ '뚓') << 1))) ^ 21671) + var5) >>> 12) + 21853) - '꿗'))) - var5))) - var5) + '藊') + 26236));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
