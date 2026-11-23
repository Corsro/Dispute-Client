package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlIiiiIillIiiiIi {
   public long illilIIlIi;
   public long IIiilIIlIi;
   public long IililIIlIi;
   public long lIiilIIlIi;
   public long lllilIIlIi;
   public long lililIIlIi;
   public long iIiilIIlIi;
   private final HashMap<Long, Boolean> iIlilIIlIi = new HashMap();
   private static final int IIlilIIlIi = 512;
   private final HashMap<Long, iIiiliiIliilii> lIlilIIlIi = new HashMap();
   public long iililIIlIi;
   private long IllilIIlIi = 1L;

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) >>> 5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) >>> 5) << 8) - var5) ^ 27368) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) >>> 5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) >>> 9 | (char)((char)((char)(var4[var5] + var5) ^ var5) ^ 20208) << 7) - '\uec2a') ^ var5) >>> 5) << 8) - var5) ^ 27368) << 8))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIlllIlliIll(long stateOf, long mode, IIlIiiIilIlIiiIi stand, LongSupplier fingerprintNow, LongUnaryOperator target) {
      if (this.IlIlllIlilIl(IliIlllilIi(stateOf, mode, stand), fingerprintNow, target) == null) {
         return false;
      } else {
         ++this.IIiilIIlIi;
         return true;
      }
   }

   public void IIIllIIliIIl(long cells, long certificateId, IIlIiiIilIlIiiIi fingerprint, long mode, String stand, long reason, long[] target) {
      if (this.lIlilIIlIi.size() >= 512) {
         this.lIlilIIlIi.clear();
         this.iIlilIIlIi.clear();
      }

      long var12 = IliIlllilIi(cells, certificateId, fingerprint);
      this.lIlilIIlIi.put(var12, new iIiiliiIliilii(cells, certificateId, fingerprint, mode, stand, reason, target));
      this.iIlilIIlIi.remove(var12);
      ++this.iililIIlIi;
   }

   public iIiiliiIliilii IIillIiliIil(long mode, long stand, IIlIiiIilIlIiiIi target, LongSupplier fingerprintNow) {
      return this.IlIlllIlilIl(IliIlllilIi(mode, stand, target), fingerprintNow, (LongUnaryOperator)null);
   }

   public String IiIiliIiiiIi() {
      return IIlilIliiIli<invokedynamic>() + this.lllilIIlIi + IIlilIliiIli<invokedynamic>() + this.illilIIlIi + IIlilIliiIli<invokedynamic>() + this.IililIIlIi + IIlilIliiIli<invokedynamic>() + this.lililIIlIi + IIlilIliiIli<invokedynamic>() + this.iililIIlIi + IIlilIliiIli<invokedynamic>() + this.IIiilIIlIi + IIlilIliiIli<invokedynamic>() + this.lIlilIIlIi.size() + IIlilIliiIli<invokedynamic>() + this.lIiilIIlIi + IIlilIliiIli<invokedynamic>() + this.iIiilIIlIi;
   }

   public void lIiiIiIlilli(IiIilillliIilill reason, String cert) {
      ++this.lililIIlIi;
      this.iliIiiliiiii(reason.IIillIiliIil(), reason.Ililllililil(), reason.Iiilliiliiil(), reason.IIiilIiiiIii(), cert, reason.Iilllilliill());
   }

   public static long IliIlllilIi(long target, long stand, IIlIiiIilIlIiiIi mode) {
      return target * -7046029254386353131L ^ Long.rotateLeft(stand * -4417276706812531889L, 21) ^ ((long)mode.ordinal() + 1L) * 1609587929392839161L;
   }

   public void iIlIlllllill() {
      ++this.illilIIlIi;
   }

   public boolean Illlllllilll(long fingerprintNow, long stand, LongSupplier target) {
      return this.Iilllilliill(fingerprintNow, stand, target, (LongUnaryOperator)null);
   }

   public void IilliliilIIi() {
      ++this.IililIIlIi;
   }

   private iIiiliiIliilii IlIlllIlilIl(long k, LongSupplier fingerprintNow, LongUnaryOperator stateOf) {
      iIiiliiIliilii var5 = (iIiiliiIliilii)this.lIlilIIlIi.get(k);
      if (var5 == null) {
         return null;
      } else {
         long var6 = var5.IIIllIIliIIl() != null && stateOf != null ? iIliiIiIlliiIi.IliIlllilIi(var5.IIIllIIliIIl(), stateOf) : fingerprintNow.getAsLong();
         if (var5.IilliliilIIi() != var6) {
            this.lIlilIIlIi.remove(k);
            this.iIlilIIlIi.remove(k);
            return null;
         } else {
            return var5;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3878172628484979796L ^ Long.rotateLeft(-1882389216018052857L, 19) ^ -2241119728266402388L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4544026802853501029L ^ Long.rotateLeft(136500700772837408L, 3) ^ -7585288071884630991L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7518101406123759403L ^ Long.rotateLeft(-7403726241253339466L, 35) ^ -7189165247736317529L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6306067911636121595L ^ Long.rotateLeft(2238495549962761578L, 51) ^ 5925977027006258773L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2979226340203690634L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1718149554909854018L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8443959257663668562L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4385859116714046613L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2264910605938236193L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8836626119210101810L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illillliilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilililiiili<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiilIiiiIii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iliilliiilii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiiiliiiiiii<invokedynamic>());
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
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] + 27345) - 'ꪚ') << 10 | (char)((char)(var4[var5] + 27345) - 'ꪚ') >>> 6))))) ^ '잉') ^ var5))) ^ 197) + '뮪'))) << 10 | (char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] + 27345) - 'ꪚ') << 10 | (char)((char)(var4[var5] + 27345) - 'ꪚ') >>> 6))))) ^ '잉') ^ var5))) ^ 197) + '뮪'))) >>> 6) + var5) << 7 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] + 27345) - 'ꪚ') << 10 | (char)((char)(var4[var5] + 27345) - 'ꪚ') >>> 6))))) ^ '잉') ^ var5))) ^ 197) + '뮪'))) << 10 | (char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)((char)((char)(var4[var5] + 27345) - 'ꪚ') << 10 | (char)((char)(var4[var5] + 27345) - 'ꪚ') >>> 6))))) ^ '잉') ^ var5))) ^ 197) + '뮪'))) >>> 6) + var5) >>> 9) ^ '芍') - 942) + 28434) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIiiliiIliilii Ililllililil(long fingerprintNow, long stand, IIlIiiIilIlIiiIi mode, LongSupplier stateOf, LongUnaryOperator target) {
      return this.IlIlllIlilIl(IliIlllilIi(fingerprintNow, stand, mode), stateOf, target);
   }

   public long liiiIIllIl() {
      ++this.lllilIIlIi;
      return (long)(this.IllilIIlIi++);
   }

   public boolean Iiilliiliiil(long target, long stand, IIlIiiIilIlIiiIi mode) {
      return this.iIlilIIlIi.putIfAbsent(IliIlllilIi(target, stand, mode), Boolean.TRUE) == null;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) + 'ꟾ') >>> 15 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) + 'ꟾ') << 1) - 'ﴰ') + var5) + '꛵') >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) + 'ꟾ') >>> 15 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) + 'ꟾ') << 1) - 'ﴰ') + var5) + '꛵') << 11) ^ var5) - 22176));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIilIIiiIIi() {
      return this.lIlilIIlIi.size();
   }

   public void IlIillIiilIi() {
      this.lIlilIIlIi.clear();
      this.iIlilIIlIi.clear();
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 8565) + var5) + 17535) + '\ue35a') - '诺')) - '諷') ^ var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)(var4[var5] ^ '鉠'))) >>> 9 | (char)(-((char)(var4[var5] ^ '鉠'))) << 7) - var5) + var5))) - var5) ^ '︘') + '\uf541') - var5))))) - '\ue49d') ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIlliIliiIl(long target, long fingerprintNow, IIlIiiIilIlIiiIi mode, LongSupplier stand) {
      return this.IIlllIlliIll(target, fingerprintNow, mode, stand, (LongUnaryOperator)null);
   }

   public boolean Iilllilliill(long stand, long target, LongSupplier stateOf, LongUnaryOperator fingerprintNow) {
      long var8 = 4829675877948064799L;
      var8 ^= ((long)(this.IlIlllIlilIl(IliIlllilIi(stand, target, IIlIiiIilIlIiiIi.lllIiiiIIi), stateOf, fingerprintNow) != null && this.IlIlllIlilIl(IliIlllilIi(stand, target, IIlIiiIilIlIiiIi.illIiiiIIi), stateOf, fingerprintNow) != null ? 1 : 0) << 32 ^ var8) & -1L << 32;
      if ((int)(var8 >>> 32) != 0) {
         ++this.IIiilIIlIi;
      }

      return (boolean)((int)(var8 >>> 32));
   }

   public void iliIiiliiiii(long stand, long target, IIlIiiIilIlIiiIi certificateId, long fingerprint, String reason, long mode) {
      this.IIIllIIliIIl(stand, target, certificateId, fingerprint, reason, mode, (long[])null);
   }
}
