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
import net.minecraft.class_11515;
import net.minecraft.class_2338;
import net.minecraft.class_238;

final class IlilIlIillilIlIi implements AutoCloseable {
   Iililllllilillll lIIIlIIIIi;
   int IliiIIIIIi;
   final int lIliIIIIIi;
   int liliIIIIIi;
   int[] IiliIIIIIi;
   Iililllllilillll IIIIlIIIIi;
   Iililllllilillll iIIIlIIIIi;
   double llIIlIIIIi;
   final long iiIiIIIIIi;
   private static final byte[] IiIIlIIIIi = new byte[0];
   long[] iiliIIIIIi;
   int iliiIIIIIi;
   final int iIliIIIIIi;
   int[] llliIIIIIi;
   final int IIliIIIIIi;
   boolean IlIIlIIIIi;
   byte[] illiIIIIIi;
   private static final int[] ilIIlIIIIi = new int[0];
   int IIiiIIIIIi;
   boolean liiiIIIIIi;
   boolean IiiiIIIIIi;
   final class_238 IlliIIIIIi;
   final Iililllllilillll[] iiiiIIIIIi;
   int iIiiIIIIIi;
   static final long[] liIIlIIIIi = new long[0];
   int lIiiIIIIIi;
   int lliiIIIIIi;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 26513))))) + '踴') ^ var5) - 16509) + var5))) + var5) ^ var5) ^ 21888))))) << 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 26513))))) + '踴') ^ var5) - 16509) + var5))) + var5) ^ var5) ^ 21888))))) >>> 1) >>> 11 | (char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 26513))))) + '踴') ^ var5) - 16509) + var5))) + var5) ^ var5) ^ 21888))))) << 15 | (char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)(-((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) - 26513))))) + '踴') ^ var5) - 16509) + var5))) + var5) ^ var5) ^ 21888))))) >>> 1) << 5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') >>> 5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') >>> 5) >>> 10) + '骉') - 30387) - var5) + var5) ^ 32546) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') >>> 5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) << 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') >>> 8 | (char)((char)((char)(var4[var5] ^ var5) >>> 11 | (char)(var4[var5] ^ var5) << 5) + 'ꨧ') << 8) + var5) - '굕') ^ var5) >>> 2) ^ '鲋') >>> 5) >>> 10) + '骉') - 30387) - var5) + var5) ^ 32546) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   Iililllllilillll lIiiIiIlilli() {
      if (this.lIIIlIIIIi == null) {
         this.lIIIlIIIIi = new Iililllllilillll(IlIlllIlilIl<invokedynamic>());
      }

      return this.lIIIlIIIIi;
   }

   double liiiIIllIl(double camX, double camY, double camZ) {
      double var7 = (double)this.IIliIIIIIi + (double)8.0F - camX;
      double var9 = (double)this.lIliIIIIIi + (double)8.0F - camY;
      double var11 = (double)this.iIliIIIIIi + (double)8.0F - camZ;
      return var7 * var7 + var9 * var9 + var11 * var11;
   }

   public void close() {
      long var2 = 2882074506325240643L;

      for(long var4 = var2 ^ (0L ^ var2) & -1L << 32; (int)(var4 >>> 32) < this.iiiiIIIIIi.length; var4 += 4294967296L) {
         if (this.iiiiIIIIIi[(int)(var4 >>> 32)] != null) {
            this.iiiiIIIIIi[(int)(var4 >>> 32)].close();
            this.iiiiIIIIIi[(int)(var4 >>> 32)] = null;
         }
      }

      if (this.IIIIlIIIIi != null) {
         this.IIIIlIIIIi.close();
         this.IIIIlIIIIi = null;
      }

      if (this.lIIIlIIIIi != null) {
         this.lIIIlIIIIi.close();
         this.lIIIlIIIIi = null;
      }

      if (this.iIIIlIIIIi != null) {
         this.iIIIlIIIIi.close();
         this.iIIIlIIIIi = null;
      }

   }

   Iililllllilillll IilliliilIIi() {
      if (this.IIIIlIIIIi == null) {
         this.IIIIlIIIIi = new Iililllllilillll(IlIlllIlilIl<invokedynamic>());
      }

      return this.IIIIlIIIIi;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + 20049) - var5) - 25473) + var5))))))) ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) << 14) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) << 14) >>> 8) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) << 14) << 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) << 5 | (char)((char)((char)(var4[var5] + var5) + 28427) << 13 | (char)((char)(var4[var5] + var5) + 28427) >>> 3) >>> 11) - 13097) << 15) + 21945) + var5) + '녢') + 'ﰚ') ^ var5) << 11) << 15) ^ var5) << 14) >>> 8) << 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   Iililllllilillll iIlIlllllill(class_11515 layer) {
      long var4 = 8659254308873050927L;
      var4 ^= ((long)layer.ordinal() << 32 ^ var4) & -1L << 32;
      Iililllllilillll var3 = this.iiiiIIIIIi[(int)(var4 >>> 32)];
      if (var3 == null) {
         var3 = new Iililllllilillll(IlIlllIlilIl<invokedynamic>() + layer.method_72022());
         this.iiiiIIIIIi[(int)(var4 >>> 32)] = var3;
      }

      return var3;
   }

   IlilIlIillilIlIi(long originX, int key, int originZ, int originY) {
      this.llliIIIIIi = ilIIlIIIIi;
      this.illiIIIIIi = IiIIlIIIIi;
      this.IiliIIIIIi = ilIIlIIIIi;
      this.iiliIIIIIi = liIIlIIIIi;
      this.IiiiIIIIIi = true;
      this.iiiiIIIIIi = new Iililllllilillll[class_11515.values().length];
      this.iiIiIIIIIi = originX;
      this.IIliIIIIIi = key;
      this.lIliIIIIIi = originZ;
      this.iIliIIIIIi = originY;
      this.IlliIIIIIi = new class_238((double)key, (double)originZ, (double)originY, (double)(key + 16), (double)(originZ + 16), (double)(originY + 16));
   }

   static long IliIlllilIi(int z, int y, int x) {
      return class_2338.method_10064(z >> 4, y >> 4, x >> 4);
   }

   boolean IIIllIIliIIl() {
      long var5 = 9170742083092853430L;
      Iililllllilillll[] var1 = this.iiiiIIIIIi;
      var5 ^= ((long)var1.length << 32 ^ var5) & -1L << 32;

      for(long var8 = var5 ^ (0L ^ var5) & -1L >>> 32; (int)var8 < (int)(var8 >>> 32); var8 ^= (var8 ^ var8 + (long)1) & -1L >>> 32) {
         Iililllllilillll var4 = var1[(int)var8];
         if (var4 != null && !var4.IliIlllilIi()) {
            return false;
         }
      }

      if (this.IIIIlIIIIi != null && !this.IIIIlIIIIi.IliIlllilIi()) {
         return false;
      } else {
         return (this.lIIIlIIIIi == null || this.lIIIlIIIIi.IliIlllilIi()) && (this.iIIIlIIIIi == null || this.iIIIlIIIIi.IliIlllilIi());
      }
   }

   Iililllllilillll iliIiiliiiii() {
      if (this.iIIIlIIIIi == null) {
         this.iIIIlIIIIi = new Iililllllilillll(IlIlllIlilIl<invokedynamic>());
      }

      return this.iIIIlIIIIi;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) << 2) ^ '쀖') - 4879) ^ 20248) - 24031) >>> 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) << 2) ^ '쀖') - 4879) ^ 20248) - 24031) << 12))) << 11 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) << 2) ^ '쀖') - 4879) ^ 20248) - 24031) >>> 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) >>> 14 | (char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) << 14 | (char)((char)((char)((char)((char)(~var4[var5]) + var5) << 13 | (char)((char)(~var4[var5]) + var5) >>> 3) ^ var5)) >>> 2) ^ '걘'))) << 2) ^ '쀖') - 4879) ^ 20248) - 24031) << 12))) >>> 5) ^ var5) - '鿬'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -5362058818200914101L ^ Long.rotateLeft(-7527339561962729664L, 43) ^ -6597975130424091778L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -331826868495241422L ^ Long.rotateLeft(-7998080579401018896L, 13) ^ 8484406466734147817L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2564701240862243876L ^ Long.rotateLeft(4267371765255764955L, 5) ^ 273104415212037674L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1927618553386235884L ^ Long.rotateLeft(-5279896171023362260L, 56) ^ 3361064482500415215L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7962162704798770369L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4536961249468343676L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9170332720322640424L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7989475666740021402L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8729890256537114851L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4380814316667929999L;
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
}
