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

public final class iIlliIilIllliIil {
   private static final int llIlIilIil = -2051263;
   private static final int IlIlIilIil = -8750470;
   private static final int IiIlIilIil = -2076084;
   private static final int ilIlIilIil = -11740828;

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - '颺') - 14991) - 3864) - var5) - var5))))) ^ var5) ^ 12825) - 14873) + 15468) - 'ꨅ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 10 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 6) ^ var5) ^ 4201) + var5))) ^ 17667) >>> 1 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 10 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 6) ^ var5) ^ 4201) + var5))) ^ 17667) << 15))) ^ 25168) ^ '鲄'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int liiiIIllIl(IiilIillliilIill s) {
      int var10000;
      switch (s.IliIlllilIi().ordinal()) {
         case 0:
         case 1:
            var10000 = -8750470;
            break;
         case 2:
         case 6:
         case 8:
         case 9:
         case 10:
            var10000 = -2051263;
            break;
         case 3:
         case 4:
         case 5:
         case 7:
         case 12:
            var10000 = -2076084;
            break;
         case 11:
            var10000 = -11740828;
            break;
         default:
            throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7490943922982177200L ^ Long.rotateLeft(7614140555727784643L, 61) ^ 2908370943331751742L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6664850987130046186L ^ Long.rotateLeft(4365581283223373687L, 1) ^ 2303205577354034786L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7714567459173218959L ^ Long.rotateLeft(2876070575319491999L, 32) ^ 4128905240199696955L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 7763583336981578361L ^ Long.rotateLeft(-866548423591372295L, 49) ^ 1370305171394314554L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1955617220398459876L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6971810621521672612L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2336945153433807591L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6383697414917106448L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7954394927952533164L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6561736280056673458L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] + 22075) >>> 1 | (char)(var4[var5] + 22075) << 15) >>> 2 | (char)((char)(var4[var5] + 22075) >>> 1 | (char)(var4[var5] + 22075) << 15) << 14))) + var5) - 30084))) ^ var5))) ^ var5)) << 9 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)(~((char)((char)((char)(var4[var5] + 22075) >>> 1 | (char)(var4[var5] + 22075) << 15) >>> 2 | (char)((char)(var4[var5] + 22075) >>> 1 | (char)(var4[var5] + 22075) << 15) << 14))) + var5) - 30084))) ^ var5))) ^ var5)) >>> 7) + var5) ^ var5));
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
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)(~((char)((char)(-((char)((char)(var4[var5] ^ var5) << 9 | (char)(var4[var5] ^ var5) >>> 7))) >>> 6 | (char)(-((char)((char)(var4[var5] ^ var5) << 9 | (char)(var4[var5] ^ var5) >>> 7))) << 10))) ^ '봞'))) + var5) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iIlliIilIllliIil() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) ^ 15918) ^ 13541))))))) - var5) - var5))) - 24401) - var5) << 11 | (char)((char)((char)(-((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) ^ 15918) ^ 13541))))))) - var5) - var5))) - 24401) - var5) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(IlIlliIillIlliIi stage) {
      return stage == IlIlliIillIlliIi.iiiilliIIi || stage == IlIlliIillIlliIi.IlIIiliIIi;
   }

   public static String IliIlllilIi(IiilIillliilIill s) {
      String var1 = s.liiiIIllIl().isEmpty() ? "" : IilliliilIIi<invokedynamic>() + s.liiiIIllIl();
      String var10000;
      switch (s.IliIlllilIi().ordinal()) {
         case 0 -> var10000 = IilliliilIIi<invokedynamic>();
         case 1 -> var10000 = IilliliilIIi<invokedynamic>();
         case 2 -> var10000 = IilliliilIIi<invokedynamic>();
         case 3 -> var10000 = IilliliilIIi<invokedynamic>() + (s.lIiiIiIlilli().isEmpty() ? "" : IilliliilIIi<invokedynamic>() + s.lIiiIiIlilli() + IilliliilIIi<invokedynamic>());
         case 4 -> var10000 = IilliliilIIi<invokedynamic>() + (s.lIiiIiIlilli().isEmpty() ? "" : IilliliilIIi<invokedynamic>() + s.lIiiIiIlilli());
         case 5 -> var10000 = IilliliilIIi<invokedynamic>() + (s.lIiiIiIlilli().isEmpty() ? "" : IilliliilIIi<invokedynamic>() + s.lIiiIiIlilli());
         case 6 -> var10000 = IilliliilIIi<invokedynamic>();
         case 7 -> var10000 = IilliliilIIi<invokedynamic>() + s.lIiiIiIlilli() + IilliliilIIi<invokedynamic>();
         case 8 -> var10000 = IilliliilIIi<invokedynamic>() + (s.lIiiIiIlilli().isEmpty() ? "" : IilliliilIIi<invokedynamic>() + s.lIiiIiIlilli() + IilliliilIIi<invokedynamic>()) + IilliliilIIi<invokedynamic>();
         case 9 -> var10000 = IilliliilIIi<invokedynamic>() + (var1.isEmpty() ? IilliliilIIi<invokedynamic>() : var1) + IilliliilIIi<invokedynamic>();
         case 10 -> var10000 = s.IilliliilIIi() + IilliliilIIi<invokedynamic>();
         case 11 -> var10000 = (s.iIlIlllllill().isEmpty() ? "" : IilliliilIIi<invokedynamic>() + s.iIlIlllllill() + IilliliilIIi<invokedynamic>()) + s.IilliliilIIi() + IilliliilIIi<invokedynamic>() + (s.IilliliilIIi() == 1 ? "" : IilliliilIIi<invokedynamic>());
         case 12 -> var10000 = s.lIiiIiIlilli().isEmpty() ? IilliliilIIi<invokedynamic>() : IilliliilIIi<invokedynamic>() + s.lIiiIiIlilli();
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }
}
