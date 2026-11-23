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

public enum IliilIillliilIil {
   llilIllIil,
   IIilIllIil,
   IlilIllIil,
   lIilIllIil,
   ililIllIil,
   iIilIllIil;

   public static IliilIillliilIil liiiIIllIl(String name) {
      long var5 = -7751924150364634851L;
      if (name != null) {
         IliilIillliilIil[] var1 = values();
         var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

         for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
            IliilIillliilIil var4 = var1[(int)var8];
            if (var4.name().equalsIgnoreCase(name)) {
               return var4;
            }
         }
      }

      return IIilIllIil;
   }

   // $FF: synthetic method
   private static IliilIillliilIil[] iIlIlllllill() {
      return new IliilIillliilIil[]{IIilIllIil, lIilIllIil, iIilIllIil, IlilIllIil, llilIllIil, ililIllIil};
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) >>> 4) + 5682) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) >>> 4) + 5682) << 15) >>> 1 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) >>> 4) + 5682) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) << 12 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) << 9 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) << 14 | (char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 19600))) >>> 5 | (char)(~((char)(var4[var5] ^ 19600))) << 11))) - var5) ^ var5) >>> 2) - 405) >>> 7) - var5) - var5) >>> 14) - '莿'))) >>> 4) + 5682) << 15) << 15) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this == IIilIllIil || this == IlilIllIil || this == llilIllIil;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) << 9 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) >>> 7) >>> 9 | (char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) << 9 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) >>> 7) << 7) + var5) >>> 10 | (char)((char)((char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) << 9 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) >>> 7) >>> 9 | (char)((char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) << 9 | (char)((char)(var4[var5] << 11 | var4[var5] >>> 5) << 10 | (char)(var4[var5] << 11 | var4[var5] >>> 5) >>> 6) >>> 7) << 7) + var5) << 6) ^ '쁾') + var5))) + var5) + var5) ^ '耎'))));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))))) - var5) >>> 4 | (char)((char)(~((char)(-((char)((char)((char)(-var4[var5]) ^ var5) ^ var5))))) - var5) << 12))) + var5) + var5))) - 5963) ^ 2278) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] << 4 | var4[var5] >>> 12) - 16516) ^ var5) + 'ꔐ') ^ '\uf46d') ^ 21326))))) ^ var5))))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '萕') ^ '裃') - 1598) >>> 15 | (char)((char)((char)((char)(var4[var5] + var5) + '萕') ^ '裃') - 1598) << 1) ^ '빻'))))))) - '︔')) << 5 | (char)((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + '萕') ^ '裃') - 1598) >>> 15 | (char)((char)((char)((char)(var4[var5] + var5) + '萕') ^ '裃') - 1598) << 1) ^ '빻'))))))) - '︔')) >>> 11) + var5) ^ 31073));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -206771148201107604L ^ Long.rotateLeft(3730104079013473129L, 5) ^ 1178318207271241663L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1222643340104571796L ^ Long.rotateLeft(8192940999115622667L, 29) ^ 7524377556813296978L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6390937368050496259L ^ Long.rotateLeft(-1591042497647410218L, 43) ^ -5176195660338279383L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2298165601535596955L ^ Long.rotateLeft(-1301491929697485278L, 19) ^ -1126066537562220075L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7061420827324799363L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -7838469348284518311L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 643491919278184937L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1076868202282083254L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6043228105586737557L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6041448980415936205L;
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
}
