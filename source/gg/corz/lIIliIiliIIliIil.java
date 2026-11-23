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

public final class lIIliIiliIIliIil {
   private static final iIIllliIlIllli IllIIilIil;
   private static final iIIllliIlIllli lllIIilIil;
   private static final iIIllliIlIllli illIIilIil;
   private static final iIIllliIlIllli lilIIilIil;
   private static final iIIllliIlIllli IilIIilIil;
   public static final int iIlIIilIil = 4;

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 84834375653547114L ^ Long.rotateLeft(484762262880078704L, 63) ^ -2574350107866975118L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7408012592947921903L ^ Long.rotateLeft(3513593077894015219L, 42) ^ -2641462987275039527L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2126204154548083504L ^ Long.rotateLeft(617402833171596063L, 5) ^ -6934028957417808981L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1725606922926871085L ^ Long.rotateLeft(9161176901379823225L, 37) ^ 2997393722017462906L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3653651657668722756L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5186624096854206581L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8313670819535856098L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -831366382442176954L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6627846230921209415L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -124834036086050399L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꌎ') + '蓷') - 7501) + '\ue6b6') + var5) ^ '訣') - '闵') + 27391))))) ^ var5) ^ var5) >>> 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꌎ') + '蓷') - 7501) + '\ue6b6') + var5) ^ '訣') - '闵') + 27391))))) ^ var5) ^ var5) << 11) - '칠') >>> 14 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꌎ') + '蓷') - 7501) + '\ue6b6') + var5) ^ '訣') - '闵') + 27391))))) ^ var5) ^ var5) >>> 5 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꌎ') + '蓷') - 7501) + '\ue6b6') + var5) ^ '訣') - '闵') + 27391))))) ^ var5) ^ var5) << 11) - '칠') << 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - '\uf482') + var5) ^ var5) - var5))) - var5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - '\uf482') + var5) ^ var5) - var5))) - var5) << 13) + 564))) << 2 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - '\uf482') + var5) ^ var5) - var5))) - var5) >>> 3 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - '\uf482') + var5) ^ var5) - var5))) - var5) << 13) + 564))) >>> 14))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIIliIiliIIliIil() {
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ 'ꙙ') << 5 | (char)(var4[var5] ^ 'ꙙ') >>> 11))) ^ var5))) << 8 | (char)(-((char)((char)(~((char)((char)(var4[var5] ^ 'ꙙ') << 5 | (char)(var4[var5] ^ 'ꙙ') >>> 11))) ^ var5))) >>> 8) + var5) - 31890) + var5) + 6440) - var5) ^ var5))) ^ 28833) - 9733) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ 'ꙙ') << 5 | (char)(var4[var5] ^ 'ꙙ') >>> 11))) ^ var5))) << 8 | (char)(-((char)((char)(~((char)((char)(var4[var5] ^ 'ꙙ') << 5 | (char)(var4[var5] ^ 'ꙙ') >>> 11))) ^ var5))) >>> 8) + var5) - 31890) + var5) + 6440) - var5) ^ var5))) ^ 28833) - 9733) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iIIllliIlIllli IliIlllilIi(boolean verticalSpeed, boolean collided, boolean onGround, double airborneByDesign, boolean sourceMatches, boolean settleTicks, int freshCommitment, int maxSettleTicks) {
      if (settleTicks) {
         return IllIIilIil;
      } else if (!sourceMatches) {
         return IilIIilIil;
      } else if (!verticalSpeed || maxSettleTicks <= 0 || freshCommitment >= maxSettleTicks || liiIlIliiiIlIl.lIiiIiIlilli(collided, airborneByDesign) && !onGround) {
         return !verticalSpeed || maxSettleTicks <= 0 || freshCommitment < maxSettleTicks || liiIlIliiiIlIl.lIiiIiIlilli(collided, airborneByDesign) && !onGround ? lllIIilIil : illIIilIil;
      } else {
         return lilIIilIil;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) - var5)) + 19414) << 11 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) - var5)) + 19414) >>> 5) + var5) ^ 27098) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) - var5)) + 19414) << 11 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 12 | (char)(var4[var5] ^ var5) << 4) - var5)) + 19414) >>> 5) + var5) ^ 27098) << 2) ^ var5))) + var5) ^ 25333));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iIIllliIlIllli liiiIIllIl(boolean freshCommitment, boolean collided, boolean airborneByDesign, double sourceMatches, boolean onGround, boolean settleTicks, int verticalSpeed) {
      return IliIlllilIi(freshCommitment, collided, airborneByDesign, sourceMatches, onGround, settleTicks, verticalSpeed, 4);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-var4[var5]) + var5))) + '쉫') ^ var5) - 8719) ^ var5) ^ var5) + var5)))))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      IllIIilIil = new iIIllliIlIllli(lllllIiillllIi.liililIiiiiililIii, iIlIlllllill<invokedynamic>());
      lllIIilIil = new iIIllliIlIllli(lllllIiillllIi.liililIiiiiililIii, iIlIlllllill<invokedynamic>());
      illIIilIil = new iIIllliIlIllli(lllllIiillllIi.liililIiiiiililIii, iIlIlllllill<invokedynamic>());
      IilIIilIil = new iIIllliIlIllli(lllllIiillllIi.iIIiilIiiIlIiilIii, iIlIlllllill<invokedynamic>());
      lilIIilIil = new iIIllliIlIllli(lllllIiillllIi.IIIiilIiilIIiilIii, iIlIlllllill<invokedynamic>());
   }
}
