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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liilIiiliiilIiil {
   public static final int iIllIIilil = 1;
   private int llllIIilil;
   private int IillIIilil;
   private final Map<iiiiilIIIIIi, IIiIIIllIiIIIl> IlllIIilil = new LinkedHashMap();
   private int illlIIilil;
   public static final int lIllIIilil = 0;

   public boolean iIlIlllllill(iiiiilIIIIIi c, long geometryFingerprint) {
      if (c == null) {
         return false;
      } else {
         IIiIIIllIiIIIl var4 = (IIiIIIllIiIIIl)this.IlllIIilil.get(c);
         if (var4 == null) {
            return false;
         } else if (var4.IliIlllilIi() != geometryFingerprint) {
            this.IlllIIilil.remove(c);
            return false;
         } else {
            ++this.illlIIilil;
            return true;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) - var5))))) ^ 22337) - var5) << 5 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) - var5))))) ^ 22337) - var5) >>> 11) >>> 6 | (char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) - var5))))) ^ 22337) - var5) << 5 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)(-var4[var5]) - var5))) - var5))))) ^ 22337) - var5) >>> 11) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli() {
      return this.IillIIilil;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) ^ '\udb80') ^ 24675) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) ^ '\udb80') ^ 24675) >>> 13) + var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) ^ '\udb80') ^ 24675) << 3 | (char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) ^ '\udb80') ^ 24675) >>> 13) + var5) + var5) >>> 6) ^ '틚') ^ var5) ^ var5) ^ 3092) + var5) + 'ﶅ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IliIlllilIi(double v, double u) {
      return v >= 0.3 && v <= 0.7 && u >= 0.3 && u <= 0.7 ? 0 : 1;
   }

   public int IIIllIIliIIl() {
      return this.IlllIIilil.size();
   }

   public void liiiIIllIl(iiiiilIIIIIi tick, long geometryFingerprint, int c) {
      if (tick != null) {
         ++this.IillIIilil;
         if (this.IlllIIilil.put(tick, new IIiIIIllIiIIIl(geometryFingerprint, c)) == null) {
            ++this.llllIIilil;
         }

      }
   }

   public void IlIlllIlilIl() {
      this.IlllIIilil.clear();
      this.llllIIilil = 0;
      this.illlIIilil = 0;
      this.IillIIilil = 0;
   }

   public int IilliliilIIi() {
      return this.llllIIilil;
   }

   public int iliIiiliiiii() {
      return this.illlIIilil;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '햷') + var5) - 23509) + '귺') ^ '괙'))) ^ 'ﮊ') - var5) - '豥') ^ '\ud960') + 15723) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '햷') + var5) - 23509) + '귺') ^ '괙'))) ^ 'ﮊ') - var5) - '豥') ^ '\ud960') + 15723) >>> 11) << 8 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '햷') + var5) - 23509) + '귺') ^ '괙'))) ^ 'ﮊ') - var5) - '豥') ^ '\ud960') + 15723) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '햷') + var5) - 23509) + '귺') ^ '괙'))) ^ 'ﮊ') - var5) - '豥') ^ '\ud960') + 15723) >>> 11) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IiIlliIliiIl() {
      return IIlllIlliIll<invokedynamic>() + this.llllIIilil + IIlllIlliIll<invokedynamic>() + this.IillIIilil + IIlllIlliIll<invokedynamic>() + this.illlIIilil + IIlllIlliIll<invokedynamic>() + this.IlllIIilil.size();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -791610462769556798L ^ Long.rotateLeft(3297761605898415982L, 29) ^ 2259150579783857627L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -8442200645385132180L ^ Long.rotateLeft(-8812662691907703772L, 63) ^ 5775555719769119719L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4747165576984335181L ^ Long.rotateLeft(-8528049903449846640L, 37) ^ -9223096978840471799L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 77461955497753170L ^ Long.rotateLeft(-7515615378473466715L, 46) ^ 3720710210691046807L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3850706365741912655L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6866970017183823102L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8868345917279410275L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4803175412450128922L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 973425307876878146L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1974642056312540226L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illlllllilll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilllilliill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIillIiliIil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Ililllililil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiilliiliiil<invokedynamic>());
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
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - '밪') ^ 20431) ^ '\ue900') ^ var5))) ^ var5) ^ var5) - var5) ^ var5))) + '\udeaf'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) >>> 2) - '탅') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) >>> 2) - '탅') << 1) + var5) + var5) - var5) + '훐') >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) >>> 2) - '탅') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) << 14 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(var4[var5] - 14697) + var5))) - 15107))) - '\ud870') ^ 29377) - var5) - 28284) >>> 2) - '탅') << 1) + var5) + var5) - var5) + '훐') << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
