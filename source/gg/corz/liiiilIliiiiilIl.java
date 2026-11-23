package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record liiiilIliiiiilIl(long planId, IIilliIllIilliIl schematicTarget, String expectedState, IIilliIllIilliIl dirtGoal, IIilliIllIilliIl start, IIilliIllIilliIl finalSchematicPlacementStand, int maxRadius, int maxVertical, int maxDirt, int maxSteps, int maxStates) {
   private final IIilliIllIilliIl IIIIlIiIll;
   private final IIilliIllIilliIl IlIIlIiIll;
   private final int ilIIlIiIll;
   private final int IIlIlIiIll;
   private final IIilliIllIilliIl llIIlIiIll;
   private final long iiiiIIiIll;
   private final int IiIIlIiIll;
   private final String lIIIlIiIll;
   private final int liIIlIiIll;
   private final IIilliIllIilliIl iIIIlIiIll;
   private final int iiIIlIiIll;

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) << 3 | (char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) >>> 13) - '숚') >>> 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) << 3 | (char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) >>> 13) - '숚') << 12) ^ '呂'))) ^ 32490))) ^ var5) ^ 21981) << 4 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) << 3 | (char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) >>> 13) - '숚') >>> 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) << 3 | (char)((char)((char)((char)(~var4[var5]) ^ var5) << 14 | (char)((char)(~var4[var5]) ^ var5) >>> 2) + var5) >>> 13) - '숚') << 12) ^ '呂'))) ^ 32490))) ^ var5) ^ 21981) >>> 12) + '쒤')))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IIilliIllIilliIl lIiiIiIlilli() {
      return this.IlIIlIiIll;
   }

   public IIilliIllIilliIl liiiIIllIl() {
      return this.IIIIlIiIll;
   }

   public liiiilIliiiiilIl(long dirtGoal, IIilliIllIilliIl finalSchematicPlacementStand, String maxSteps, IIilliIllIilliIl maxDirt, IIilliIllIilliIl schematicTarget, IIilliIllIilliIl expectedState, int planId, int start, int maxStates, int maxVertical, int maxRadius) {
      Objects.requireNonNull(finalSchematicPlacementStand, Iilllilliill<invokedynamic>());
      Objects.requireNonNull(maxSteps, Iilllilliill<invokedynamic>());
      Objects.requireNonNull(maxDirt, Iilllilliill<invokedynamic>());
      Objects.requireNonNull(schematicTarget, Iilllilliill<invokedynamic>());
      planId = Math.max(2, planId);
      start = Math.max(1, start);
      maxStates = Math.max(1, maxStates);
      maxVertical = Math.max(2, maxVertical);
      maxRadius = Math.max(32, maxRadius);
      this.iiiiIIiIll = dirtGoal;
      this.IIIIlIiIll = finalSchematicPlacementStand;
      this.lIIIlIiIll = maxSteps;
      this.iIIIlIiIll = maxDirt;
      this.IlIIlIiIll = schematicTarget;
      this.llIIlIiIll = expectedState;
      this.ilIIlIiIll = planId;
      this.IiIIlIiIll = start;
      this.liIIlIiIll = maxStates;
      this.iiIIlIiIll = maxVertical;
      this.IIlIlIiIll = maxRadius;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) >>> 9 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) << 7) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) >>> 9 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) << 7) << 8) + 3831) << 4 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) >>> 9 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) << 7) >>> 8 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) >>> 9 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) + var5) + '뜺') + '\ud8e1'))) << 14) << 7) << 8) + 3831) >>> 12) ^ '뺓'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl() {
      return this.IiIIlIiIll;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ '퀤') - var5) + var5) >>> 1 | (char)((char)((char)((char)(~((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ '퀤') - var5) + var5) << 15))) ^ 19844) ^ var5) >>> 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ '퀤') - var5) + var5) >>> 1 | (char)((char)((char)((char)(~((char)(var4[var5] << 8 | var4[var5] >>> 8))) ^ '퀤') - var5) + var5) << 15))) ^ 19844) ^ var5) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.IIlIlIiIll;
   }

   public int IIIllIIliIIl() {
      return this.ilIIlIiIll;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 8 | (char)((char)(var4[var5] - var5) - var5) >>> 8) - 30383) + '鲢') - var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 8 | (char)((char)(var4[var5] - var5) - var5) >>> 8) - 30383) + '鲢') - var5) + var5) >>> 6) - 10948) >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 8 | (char)((char)(var4[var5] - var5) - var5) >>> 8) - 30383) + '鲢') - var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) << 8 | (char)((char)(var4[var5] - var5) - var5) >>> 8) - 30383) + '鲢') - var5) + var5) >>> 6) - 10948) << 1) ^ var5) - var5) - var5) + var5) ^ var5) ^ var5) + var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIlllIlliIll() {
      return this.iiIIlIiIll;
   }

   public IIilliIllIilliIl iliIiiliiiii() {
      return this.llIIlIiIll;
   }

   public int IiIlliIliiIl() {
      return this.liIIlIiIll;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6032813240347871602L ^ Long.rotateLeft(8932631638600102544L, 55) ^ 6689143337362635332L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5952895227530751180L ^ Long.rotateLeft(-346836179103640474L, 37) ^ 866135394180308155L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5749709908302557974L ^ Long.rotateLeft(7938942079804263970L, 40) ^ 4767795590399629793L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3410332892224824797L ^ Long.rotateLeft(6751192387856844591L, 31) ^ 3903748475817740289L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4908404395921156546L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1230639881146191504L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3615101634200664435L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7103216352930724730L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5637998807073579075L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3750946365887001586L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public long IliIlllilIi() {
      return this.iiiiIIiIll;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) ^ var5))) << 14 | (char)(-((char)((char)((char)(var4[var5] + var5) >>> 5 | (char)(var4[var5] + var5) << 11) ^ var5))) >>> 2) - var5) ^ var5))) ^ 22785) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return this.lIIIlIiIll;
   }

   public IIilliIllIilliIl IilliliilIIi() {
      return this.iIIIlIiIll;
   }
}
