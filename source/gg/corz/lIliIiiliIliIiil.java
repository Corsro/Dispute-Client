package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class lIliIiiliIliIiil {
   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ 5538))) + var5) >>> 1 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ 5538))) + var5) << 15) ^ 6957) ^ var5) << 6 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ 5538))) + var5) >>> 1 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ 5538))) + var5) << 15) ^ 6957) ^ var5) >>> 10) + var5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static List<IIIllIllIIllIl> IliIlllilIi(liiIiiiiiIii reason) {
      ArrayList var1 = new ArrayList();
      var1.add(IIIllIllIIllIl.IiilllIllliilllIll);
      var1.add(IIIllIllIIllIl.iiilllIllIIIillIll);
      var1.add(IIIllIllIIllIl.lIIillIlliIIillIll);
      if (reason == liiIiiiiiIii.IIIIlilIllIIIlilIl) {
         var1.add(IIIllIllIIllIl.IlIillIllllIillIll);
      }

      var1.add(IIIllIllIIllIl.ilIillIllIiIillIll);
      return var1;
   }

   public static boolean IilliliilIIi(liiIiiiiiIii reason, Set<IIIllIllIIllIl> rejected) {
      return rejected != null && rejected.containsAll(IliIlllilIi(reason));
   }

   public static Set<IIIllIllIIllIl> IIIllIIliIIl() {
      return EnumSet.noneOf(IIIllIllIIllIl.class);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)var4[var5] - var5)))) + '\uf6b8'))) + '\uef3d') ^ 'ꢲ') - var5))) << 8 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)var4[var5] - var5)))) + '\uf6b8'))) + '\uef3d') ^ 'ꢲ') - var5))) >>> 8) - '脟') - var5) ^ 'ꆕ') - var5))) ^ '芇'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String iliIiiliiiii(liIIlIIliiIIlIIl firstAction, Set<IIIllIllIIllIl> req, IIIllIllIIllIl result, String selected, IilIlIllilIlIl tried) {
      return String.format(Locale.ROOT, IlIlllIlilIl<invokedynamic>(), firstAction.IilliliilIIi(), firstAction.lIiiIiIlilli().size(), firstAction.liiiIIllIl().iliIiiliiiii(), firstAction.iliIiiliiiii(), IliIlllilIi(firstAction.IilliliilIIi()), result == null ? IlIlllIlilIl<invokedynamic>() : result, selected == null ? IlIlllIlilIl<invokedynamic>() : selected, tried);
   }

   public static boolean liiiIIllIl(liIIlIIliiIIlIIl req, long stand) {
      return !req.IIIllIIliIIl().contains(stand);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3060237016182056916L ^ Long.rotateLeft(4905956952574582541L, 26) ^ 192017262126230045L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -178675787255459742L ^ Long.rotateLeft(-5797569518481146469L, 43) ^ 8268624047309511741L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7898872920050703188L ^ Long.rotateLeft(-8824311152533565710L, 16) ^ 1893915844608601685L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8934082256183805707L ^ Long.rotateLeft(6896877565944757331L, 38) ^ -6485623128333898812L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6482676363579649208L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3877189164467007522L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5850429994186792153L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4703361938896478386L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -917734388485706568L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7968607814874970030L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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

   private lIliIiiliIliIiil() {
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) ^ var5))) << 2 | (char)(-((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) ^ var5))) >>> 14) - var5) + var5) - '봔'))) - 17468) - 16294))))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) + '\uf8bc') + var5) ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) + '\uf8bc') + var5) ^ var5) - var5) - var5) << 7) + var5) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) + '\uf8bc') + var5) ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) + '\uf8bc') + var5) ^ var5) - var5) - var5) << 7) + var5) >>> 3))) ^ 23167) - 29982))) - var5))) - '\ue90c'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IilIlIllilIlIl lIiiIiIlilli(liiIiiiiiIii reason, Set<IIIllIllIIllIl> rejected, boolean solved) {
      if (solved) {
         return IilIlIllilIlIl.lIllIIIlliIllIIIll;
      } else {
         return IilliliilIIi(reason, rejected) ? IilIlIllilIlIl.illlIIIllIillIIIll : IilIlIllilIlIl.IlllIIIllllllIIIll;
      }
   }

   public static Optional<IIIllIllIIllIl> iIlIlllllill(liiIiiiiiIii tried, Set<IIIllIllIIllIl> reason) {
      for(IIIllIllIIllIl var3 : IliIlllilIi(tried)) {
         if (reason == null || !reason.contains(var3)) {
            return Optional.of(var3);
         }
      }

      return Optional.empty();
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) >>> 8 | (char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) << 8) >>> 12 | (char)((char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) >>> 8 | (char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) << 8) << 4))) >>> 14 | (char)(~((char)((char)((char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) >>> 8 | (char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) << 8) >>> 12 | (char)((char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) >>> 8 | (char)((char)(-((char)((char)(~var4[var5]) << 7 | (char)(~var4[var5]) >>> 9))) + var5) << 8) << 4))) << 2) - '슖') - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
