package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class Iiilliilliilliil {
   private final int llliiiilil;
   private final String iiIiiiilil;
   private final lilIllIliilIllIl illiiiilil;
   private final int iiliiiilil;
   private final long IIiiiiilil;
   private final boolean Illiiiilil;
   private final String Iiliiiilil;
   private static final Set<String> IlIiiiilil = Set.of(Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>(), Iiiiliiiiiii<invokedynamic>());
   private final lilliiilli IIliiiilil;
   private final int liliiiilil;
   private final iiiiIiIlIIIIliIl lIliiiilil;
   private final String ilIiiiilil;
   private final long llIiiiilil;
   private final lilIllIliilIllIl IiIiiiilil;
   private final lilIllIliilIllIl liIiiiilil;
   private final IiIlllliIlll iIliiiilil;

   public static long Illillliilli(String phase, lilIllIliilIllIl stand, lilIllIliilIllIl face, String support, lilIllIliilIllIl target) {
      long var5 = -3750763034362895579L;
      var5 = Iilililiiili(var5, (long)phase.hashCode());
      var5 = Iilililiiili(var5, (long)stand.hashCode());
      var5 = Iilililiiili(var5, (long)face.hashCode());
      var5 = Iilililiiili(var5, (long)support.hashCode());
      return Iilililiiili(var5, (long)target.hashCode());
   }

   public boolean IiIlliIliiIl() {
      return this.Illiiiilil;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 1 | (char)((char)(-var4[var5]) - var5) >>> 15) - var5) ^ var5))) + 11258) ^ var5) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 1 | (char)((char)(-var4[var5]) - var5) >>> 15) - var5) ^ var5))) + 11258) ^ var5) + var5) + var5) << 10) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long Iiilliiliiil() {
      return this.IIiiiiilil;
   }

   private static long Iilililiiili(long h, long v) {
      return (h ^ v) * 1099511628211L;
   }

   public int Ililllililil() {
      return this.iiliiiilil;
   }

   public String liiiIIllIl() {
      return this.ilIiiiilil;
   }

   public lilIllIliilIllIl iIlIlllllill() {
      return this.IiIiiiilil;
   }

   // $FF: synthetic method
   private static CallSite llIIlilIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) << 11 | (char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) >>> 5) >>> 4 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) << 11 | (char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) >>> 5) << 12) >>> 12 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) << 11 | (char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) >>> 5) >>> 4 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) << 11 | (char)(-((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) << 4 | (char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) << 8 | (char)((char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) >>> 2 | (char)(-((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) + var5))) << 14) >>> 8))) + 14620) + 29379) >>> 12) ^ 12560))))) >>> 5) << 12) << 4) - var5) + 'ﾚ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIlllIlliIll() {
      return this.llliiiilil;
   }

   public lilIllIliilIllIl Illlllllilll() {
      return this.illiiiilil;
   }

   // $FF: synthetic method
   private static CallSite iIIIlIlIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] >>> 15 | var4[var5] << 1) - var5) + 12590))) - 2117) + var5) + var5))) - var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iiiiIiIlIIIIliIl IiIiliIiiiIi(String blockId, Map<String, String> state) {
      return new iiiiIiIlIIIIliIl(blockId, IIlilIliiIli(state));
   }

   public static boolean Iliilliiilii(int tempSolvable, int directBuildable, int heldHere) {
      return tempSolvable <= 0 && directBuildable <= 0 && heldHere <= 0;
   }

   public boolean IlIillIiilIi(String actualState, Map<String, String> blockId) {
      if (!this.lIliiiilil.IliIlllilIi().equals(actualState)) {
         return false;
      } else {
         Map var3 = IIlilIliiIli(blockId);
         return this.lIliiiilil.liiiIIllIl().equals(var3);
      }
   }

   public static boolean IIiilIiiiIii(int tempSolvable, int directBuildable) {
      return Iliilliiilii(tempSolvable, directBuildable, 0);
   }

   public int IIillIiliIil() {
      return this.liliiiilil;
   }

   public String lIiiIiIlilli() {
      return this.iiIiiiilil;
   }

   public lilIllIliilIllIl IilliliilIIi() {
      return this.liIiiiilil;
   }

   public String Iilllilliill() {
      return this.Iiliiiilil;
   }

   public static boolean IIIilIIiiIIi(lilIllIliilIllIl required, lilIllIliilIllIl actual, boolean verticalJumpPlacement) {
      if (required != null && actual != null) {
         if (required.equals(actual)) {
            return true;
         } else {
            return verticalJumpPlacement && required.IliIlllilIi() == actual.IliIlllilIi() && required.iIlIlllllill() == actual.iIlIlllllill() && Math.abs(required.liiiIIllIl() - actual.liiiIIllIl()) <= 1;
         }
      } else {
         return false;
      }
   }

   public lilliiilli iliIiiliiiii() {
      return this.IIliiiilil;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4210091597506437672L ^ Long.rotateLeft(-7169396730158061519L, 40) ^ 3677852714212495603L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5291655397042542630L ^ Long.rotateLeft(9044857163605909602L, 33) ^ 5790397734180761099L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2322609324693465867L ^ Long.rotateLeft(-3454032284652964090L, 33) ^ 6388642869125614698L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1772115623775655492L ^ Long.rotateLeft(7953014614714551604L, 4) ^ 4209417929500468830L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6938072710567237093L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 253654815709016173L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8933206156702572958L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8280372219715526999L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 106188660761158784L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8829040325939003198L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIIllIIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIIIlIlIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, llIIlilIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIIlliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iiIIlIIlIl<invokedynamic>());
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
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~var4[var5]) - 21298) + var5))))) - 'ꎰ') >>> 15 | (char)((char)(-((char)(~((char)((char)((char)(~var4[var5]) - 21298) + var5))))) - 'ꎰ') << 1) ^ '꧰') + 7085))) >>> 9 | (char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(~var4[var5]) - 21298) + var5))))) - 'ꎰ') >>> 15 | (char)((char)(-((char)(~((char)((char)((char)(~var4[var5]) - 21298) + var5))))) - 'ꎰ') << 1) ^ '꧰') + 7085))) << 7) + var5))) + var5))))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiiiIiIlIIIIliIl IIIllIIliIIl() {
      return this.lIliiiilil;
   }

   public static Map<String, String> IIlilIliiIli(Map<String, String> state) {
      LinkedHashMap var1 = new LinkedHashMap();
      if (state != null) {
         for(Map.Entry var3 : state.entrySet()) {
            if (!IlIiiiilil.contains(var3.getKey())) {
               var1.put((String)var3.getKey(), (String)var3.getValue());
            }
         }
      }

      return Map.copyOf(var1);
   }

   public IiIlllliIlll IlIlllIlilIl() {
      return this.iIliiiilil;
   }

   public long IliIlllilIi() {
      return this.llIiiiilil;
   }

   public Iiilliilliilliil(long supportPos, String sneakSettleTicks, lilIllIliilIllIl supportSnapshot, lilIllIliilIllIl interaction, String requiredStand, lilliiilli timeoutTicks, iiiiIiIlIIIIliIl hit, IiIlllliIlll supportFace, boolean planId, int expectedBlockId, lilIllIliilIllIl phase, String confirmationTicks, int targetCell, int requiresSneak) {
      this.llIiiiilil = supportPos;
      this.ilIiiiilil = (String)Objects.requireNonNull(sneakSettleTicks, Iiiiliiiiiii<invokedynamic>());
      this.IiIiiiilil = (lilIllIliilIllIl)Objects.requireNonNull(supportSnapshot, Iiiiliiiiiii<invokedynamic>());
      this.liIiiiilil = (lilIllIliilIllIl)Objects.requireNonNull(interaction, Iiiiliiiiiii<invokedynamic>());
      this.iiIiiiilil = (String)Objects.requireNonNull(requiredStand, Iiiiliiiiiii<invokedynamic>());
      this.IIliiiilil = (lilliiilli)Objects.requireNonNull(timeoutTicks, Iiiiliiiiiii<invokedynamic>());
      this.lIliiiilil = (iiiiIiIlIIIIliIl)Objects.requireNonNull(hit, Iiiiliiiiiii<invokedynamic>());
      this.iIliiiilil = (IiIlllliIlll)Objects.requireNonNull(supportFace, Iiiiliiiiiii<invokedynamic>());
      this.Illiiiilil = planId;
      this.llliiiilil = Math.max(0, expectedBlockId);
      this.illiiiilil = (lilIllIliilIllIl)Objects.requireNonNull(phase, Iiiiliiiiiii<invokedynamic>());
      this.Iiliiiilil = (String)Objects.requireNonNull(confirmationTicks, Iiiiliiiiiii<invokedynamic>());
      this.liliiiilil = Math.max(1, targetCell);
      this.iiliiiilil = Math.max(this.liliiiilil, requiresSneak);
      this.IIiiiiilil = Illillliilli(sneakSettleTicks, supportSnapshot, interaction, requiredStand, phase);
   }

   // $FF: synthetic method
   private static CallSite IIIIllIIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 13 | (char)((char)(var4[var5] - var5) ^ var5) << 3) - '郣') ^ 18079))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 13 | (char)((char)(var4[var5] - var5) ^ var5) << 3) - '郣') ^ 18079))) << 8) + 15214) - '럲') << 8 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 13 | (char)((char)(var4[var5] - var5) ^ var5) << 3) - '郣') ^ 18079))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) >>> 13 | (char)((char)(var4[var5] - var5) ^ var5) << 3) - '郣') ^ 18079))) << 8) + 15214) - '럲') >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
