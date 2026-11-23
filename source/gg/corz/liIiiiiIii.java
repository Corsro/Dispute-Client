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

public record liIiiiiIii(int failureTick, long missionId, long missionRevision, long target, long stand, String actionType, String failureClass, String failureReason, long routeStart, long routeGoal, long geometryFingerprint, long tempAssetFingerprint, long componentKey, long worldRevision, int equivalentRepeatCount, boolean constraintPublished, String constraintKind, long constraintKey, String nextDecisionAfterFailure) {
   private final int lIlIllIliIlIllIl;
   private final long IlIlllIlllIlllIl;
   private final String lliIllIliliIllIl;
   private final String lIilllIliIilllIl;
   private final long IllIllIllllIllIl;
   private final String iIiIllIlIliIllIl;
   private final String IiiIllIlliiIllIl;
   private final long iiiIllIlIIIlllIl;
   private final long liIlllIliiIlllIl;
   private final long lIIlllIliIIlllIl;
   private final int iIllllIlIlllllIl;
   private final long IIllllIllIllllIl;
   private final long lilIllIliilIllIl;
   private final boolean llllllIlilllllIl;
   private final long illIllIlIilIllIl;
   private final String IillllIllillllIl;
   private final long ilIlllIlIiIlllIl;
   private final long iillllIlIIilllIl;
   private final long IIiIllIllIiIllIl;

   public String IlIlllIlilIl() {
      return this.iIiIllIlIliIllIl;
   }

   public long iliIiiliiiii() {
      return this.lilIllIliilIllIl;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 6353) ^ 21378) + '챗') - var5) - 29243) ^ '\uef64') + var5))) - var5) ^ var5))) - var5))) + 18106) << 9 | (char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 6353) ^ 21378) + '챗') - var5) - 29243) ^ '\uef64') + var5))) - var5) ^ var5))) - var5))) + 18106) >>> 7) + 18596) ^ var5) - '踆'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) ^ 11973) ^ var5) - 26865) + var5) - '鈘'))))) - var5))) + 2674) ^ 28693) - var5) - '\uf334') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long Iiilliiliiil() {
      return this.liIlllIliiIlllIl;
   }

   public long Iilllilliill() {
      return this.lIIlllIliIIlllIl;
   }

   public long IIIllIIliIIl() {
      return this.IIiIllIllIiIllIl;
   }

   public long Ililllililil() {
      return this.ilIlllIlIiIlllIl;
   }

   public int iIlIlllllill() {
      return this.lIlIllIliIlIllIl;
   }

   public String IIlllIlliIll() {
      return this.IiiIllIlliiIllIl;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6534936923358599455L ^ Long.rotateLeft(-727904763278321748L, 27) ^ -210832197066232812L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5861641280628800749L ^ Long.rotateLeft(-2923018569606900450L, 53) ^ -3581704132466116348L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 129537751223254089L ^ Long.rotateLeft(9108120569942361153L, 43) ^ 1191863889536729570L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6831134036001327087L ^ Long.rotateLeft(-24836246496512622L, 9) ^ 6380380684520554338L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7157692915314618697L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 891589761648611538L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2057273430344530076L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2658217475665691429L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -1224285773059557890L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6056918393682353680L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iliilliiilii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiiiliiiiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIIllIIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iIIIlIlIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(llIIlilIIl<invokedynamic>());
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

   public long IIillIiliIil() {
      return this.IlIlllIlllIlllIl;
   }

   public long IIIilIIiiIIi() {
      return this.IIllllIllIllllIl;
   }

   public String IiIlliIliiIl() {
      return this.lliIllIliliIllIl;
   }

   public String IIlilIliiIli() {
      return this.IillllIllillllIl;
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) + var5) ^ 22582) - 31268))) + 4575) ^ var5) - '럠') ^ '\uebf2') + 7260) + '\uec7e') - 25832));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) + var5) - var5) ^ 26617) ^ var5) + 23039) >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) + var5) - var5) ^ 26617) ^ var5) + 23039) << 6))))) - 22004) - var5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long Illillliilli() {
      return this.iillllIlIIilllIl;
   }

   public long Illlllllilll() {
      return this.iiiIllIlIIIlllIl;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '鹂'))) ^ var5) + 'ꕦ') << 10 | (char)((char)((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '鹂'))) ^ var5) + 'ꕦ') >>> 6) + 20041) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIiliIiiiIi() {
      return this.llllllIlilllllIl;
   }

   public int IlIillIiilIi() {
      return this.iIllllIlIlllllIl;
   }

   public long lIiiIiIlilli() {
      return this.illIllIlIilIllIl;
   }

   public String Iilililiiili() {
      return this.lIilllIliIilllIl;
   }

   public long IilliliilIIi() {
      return this.IllIllIllllIllIl;
   }

   public boolean IliIlllilIi(liIiiiiIii o) {
      return o != null && this.lilIllIliilIllIl == o.lilIllIliilIllIl && this.IIiIllIllIiIllIl == o.IIiIllIllIiIllIl && this.iIiIllIlIliIllIl.equals(o.iIiIllIlIliIllIl) && this.IlIlllIlllIlllIl == o.IlIlllIlllIlllIl;
   }

   public liIiiiiIii(int failureClass, long componentKey, long tempAssetFingerprint, long worldRevision, long routeGoal, String stand, String missionRevision, String failureReason, long nextDecisionAfterFailure, long actionType, long constraintKind, long target, long geometryFingerprint, long failureTick, int constraintKey, boolean equivalentRepeatCount, String constraintPublished, long missionId, String routeStart) {
      this.lIlIllIliIlIllIl = failureClass;
      this.IllIllIllllIllIl = componentKey;
      this.illIllIlIilIllIl = tempAssetFingerprint;
      this.lilIllIliilIllIl = worldRevision;
      this.IIiIllIllIiIllIl = routeGoal;
      this.iIiIllIlIliIllIl = stand;
      this.lliIllIliliIllIl = missionRevision;
      this.IiiIllIlliiIllIl = failureReason;
      this.iiiIllIlIIIlllIl = nextDecisionAfterFailure;
      this.lIIlllIliIIlllIl = actionType;
      this.IlIlllIlllIlllIl = constraintKind;
      this.ilIlllIlIiIlllIl = target;
      this.liIlllIliiIlllIl = geometryFingerprint;
      this.IIllllIllIllllIl = failureTick;
      this.iIllllIlIlllllIl = constraintKey;
      this.llllllIlilllllIl = equivalentRepeatCount;
      this.IillllIllillllIl = constraintPublished;
      this.iillllIlIIilllIl = missionId;
      this.lIilllIliIilllIl = routeStart;
   }

   public String liiiIIllIl() {
      return String.format(Locale.ROOT, IIiilIiiiIii<invokedynamic>(), this.lIlIllIliIlIllIl, this.lilIllIliilIllIl, this.IIiIllIllIiIllIl, this.iIiIllIlIliIllIl, this.lliIllIliliIllIl, this.iIllllIlIlllllIl, this.llllllIlilllllIl ? this.IillllIllillllIl : IIiilIiiiIii<invokedynamic>(), this.IiiIllIlliiIllIl);
   }
}
