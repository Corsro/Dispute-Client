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
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record ilIililIiIilil(int trueLowestUnfinishedY, int effectiveWorkLayerY, int lookahead, int playerFeetY, long componentKey, int componentSize, int tick) {
   private final long IiiIllIliliiIllIli;
   public static final ilIililIiIilil ilIlllIliIiIlllIli = new ilIililIiIilil(Integer.MIN_VALUE, Integer.MIN_VALUE, 3, Integer.MIN_VALUE, 0L, 0, -1);
   private final int lIIlllIliiIIlllIli;
   private final int lilIllIliiilIllIli;
   private final int IIiIllIlilIiIllIli;
   private final int iIiIllIliIliIllIli;
   public static final int IlIlllIlillIlllIli = 3;
   private final int iiiIllIliIIIlllIli;
   private final int lliIllIliiliIllIli;

   public List<Integer> IilliliilIIi() {
      long var3 = 3569978863858968660L;
      ArrayList var1 = new ArrayList();
      if (!this.IliIlllilIi()) {
         return var1;
      } else {
         var1.add(this.IIiIllIlilIiIllIli);
         if (this.lilIllIliiilIllIli != Integer.MIN_VALUE) {
            for(long var5 = var3 ^ ((long)(this.IIiIllIlilIiIllIli - 1) << 32 ^ var3) & -1L << 32; (int)(var5 >>> 32) >= this.lilIllIliiilIllIli && var1.size() < 6; var5 += -4294967296L) {
               var1.add((int)(var5 >>> 32));
            }
         }

         return var1;
      }
   }

   public long IIlllIlliIll() {
      return this.IiiIllIliliiIllIli;
   }

   public int IiIlliIliiIl() {
      return this.lliIllIliiliIllIli;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) << 11) - var5) >>> 6 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) << 11) - var5) << 10) + 18324) << 8 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) << 11) - var5) >>> 6 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) >>> 5 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) << 5 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) << 6 | (char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) ^ var5) ^ var5) - var5) ^ var5) >>> 10) + var5) << 4) ^ var5))) >>> 11))) << 11) - var5) << 10) + 18324) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IlIlllIlilIl() {
      return this.iIiIllIliIliIllIli;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) << 3 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) >>> 13) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) << 3 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) >>> 13) << 13) ^ var5) + var5) + 10349) - var5) - '鳓') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) << 3 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) >>> 13) >>> 3 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) << 3 | (char)((char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') >>> 4 | (char)((char)((char)(~((char)((char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) >>> 7 | (char)(-((char)(~((char)(-((char)(var4[var5] << 10 | var4[var5] >>> 6))))))) << 9))) ^ 18242) + '툍') << 12) >>> 13) << 13) ^ var5) + var5) + 10349) - var5) - '鳓') << 1) ^ '\ude0b'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilllilliill() {
      return this.lIIlllIliiIIlllIli;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 5141) ^ 27013) + '齴') + 15478) >>> 12 | (char)((char)((char)((char)(var4[var5] ^ 5141) ^ 27013) + '齴') + 15478) << 4) + var5) + '龞'))))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.iiiIllIliIIIlllIli;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) >>> 6) - 'ꫜ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) >>> 6) - 'ꫜ') << 3) << 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) >>> 6) - 'ꫜ') >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) << 12 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) << 10 | (char)((char)((char)((char)(var4[var5] ^ 30095) >>> 15 | (char)(var4[var5] ^ 30095) << 1) ^ var5) ^ 17176) >>> 6) + var5) >>> 4) << 8) << 6) >>> 6) - 'ꫜ') << 3) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIililIiIilil(int componentKey, int trueLowestUnfinishedY, int componentSize, int playerFeetY, long lookahead, int tick, int effectiveWorkLayerY) {
      this.lilIllIliiilIllIli = componentKey;
      this.IIiIllIlilIiIllIli = trueLowestUnfinishedY;
      this.iIiIllIliIliIllIli = componentSize;
      this.lliIllIliiliIllIli = playerFeetY;
      this.IiiIllIliliiIllIli = lookahead;
      this.iiiIllIliIIIlllIli = tick;
      this.lIIlllIliiIIlllIli = effectiveWorkLayerY;
   }

   public boolean IliIlllilIi() {
      return this.IIiIllIlilIiIllIli != Integer.MIN_VALUE;
   }

   public ilIililIiIilil liiiIIllIl(IiillIilliillIil live) {
      return new ilIililIiIilil(this.lilIllIliiilIllIli, this.IIiIllIlilIiIllIli, this.iIiIllIliIliIllIli, live.IliIlllilIi(), live.IIIllIIliIIl(), live.IlIlllIlilIl(), live.IIlllIlliIll());
   }

   public boolean iIlIlllllill() {
      return this.IliIlllilIi() && this.lilIllIliiilIllIli != Integer.MIN_VALUE && this.IIiIllIlilIiIllIli > this.lilIllIliiilIllIli;
   }

   public int IIIllIIliIIl() {
      return this.IIiIllIlilIiIllIli;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) << 3) + 8319) + '鄙'))) + '꛲') << 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) << 3) + 8319) + '鄙'))) + '꛲') >>> 8))) << 9 | (char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) << 3) + 8319) + '鄙'))) + '꛲') << 8 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + var5)) ^ '\uf76b') ^ var5) - 9386) - 22712) + 24048) << 3) + 8319) + '鄙'))) + '꛲') >>> 8))) >>> 7) + '밅') + 6558) - 'ꈹ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7881408299962690167L ^ Long.rotateLeft(-959214499141105750L, 31) ^ 367010684596205110L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8473190508128551250L ^ Long.rotateLeft(-2193739141901214771L, 7) ^ -1456164876996117652L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2054994008025522401L ^ Long.rotateLeft(-1587187134953633106L, 35) ^ -8620017214867088654L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8632726573174518916L ^ Long.rotateLeft(-3601129592192215441L, 59) ^ 1032421819216094138L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1814895611167559803L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1118732722585563965L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -362001746662974532L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5671327638966767530L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 5404751894049601903L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7623458431030241092L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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

   public int iliIiiliiiii() {
      return this.lilIllIliiilIllIli;
   }

   public String lIiiIiIlilli() {
      return String.format(Locale.ROOT, IIillIiliIil<invokedynamic>(), this.lilIllIliiilIllIli, this.IIiIllIlilIiIllIli, this.IilliliilIIi(), this.lliIllIliiliIllIli, this.IiiIllIliliiIllIli, this.iiiIllIliIIIlllIli);
   }
}
