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
import java.util.Locale;
import java.util.Map;
import java.util.function.LongSupplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlliilIillliilIi {
   public long IlIiillIIi;
   public static final int ililillIIi = 256;
   public long llIiillIIi;
   public long ilIiillIIi;
   public static final int IiilillIIi = 3;
   private long iiilillIIi = 1L;
   public long IIIiillIIi;
   private final Map<Long, IIllIiillIllIiil> liilillIIi = new HashMap();
   public long lIIiillIIi;
   public long iIIiillIIi;

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7511158058055253011L ^ Long.rotateLeft(4550548696416179696L, 16) ^ -6420419774899050366L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1963173977692689777L ^ Long.rotateLeft(-6940657462649351709L, 12) ^ 1550148570397452533L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2697129068475893258L ^ Long.rotateLeft(1994217584732008444L, 53) ^ -7627198111682411703L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3865806379074794269L ^ Long.rotateLeft(-7133874613174689734L, 2) ^ -6733974732336556827L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6566900158035227287L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4714854167244957764L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -3897039528190818049L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6802781917065660163L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7927328819486429802L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6599475274601008042L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIiliIiiiIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlilIliiIli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illillliilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilililiiili<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIiilIiiiIii<invokedynamic>());
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

   public IIllIiillIllIiil Illlllllilll(long target) {
      return (IIllIiillIllIiil)this.liilillIIi.get(target);
   }

   public illliiIiIilliiIi IliIlllilIi(long target, String feetNow, String clockNow, liliIliiliIl observed, String owner, long fingerprintNow, LongSupplier kind, long desired) {
      IIllIiillIllIiil var12 = (IIllIiillIllIiil)this.liilillIIi.get(target);
      if (var12 == null) {
         if (this.liilillIIi.size() >= 256) {
            this.Ililllililil();
         }

         var12 = new IIllIiillIllIiil((long)(this.iiilillIIi++), target, observed, feetNow, clockNow);
         this.liilillIIi.put(target, var12);
         ++this.IIIiillIIi;
      }

      switch (var12.lllliillil.ordinal()) {
         case 1:
            if (!var12.illliillil.equals(owner)) {
               ++this.ilIiillIIi;
               ++var12.Iiiliillil;
               return illliiIiIilliiIi.liiIlIIlIi;
            } else {
               if (var12.lliliillil >= 3) {
                  this.lIiiIiIlilli(var12, IlIillIiilIi<invokedynamic>(), var12.lilliillil, new ilillIiill(fingerprintNow, kind.getAsLong(), (long[])null));
                  return illliiIiIilliiIi.IIIllIIlIi;
               }

               ++var12.lliliillil;
               return illliiIiIilliiIi.IiiIlIIlIi;
            }
         case 2:
            String var14 = liiiIIllIl(var12, fingerprintNow, kind, desired);
            if (var14 == null) {
               ++this.IlIiillIIi;
               ++var12.ililiillil;
               return illliiIiIilliiIi.iiiIlIIlIi;
            }

            ++this.llIiillIIi;
            ++var12.Ililiillil;
            var12.IIiliillil = var14;
            var12.iilliillil = "";
            var12.lilliillil = IlIillIiilIi<invokedynamic>();
            var12.lllliillil = lIliiiIliIliiiIl.lIIiIiIlll;
            var12.illliillil = owner;
            var12.lliliillil = 1;
            var12.ililiillil = 0;
            var12.Iiiliillil = 0;
            return illliiIiIilliiIi.lIIllIIlIi;
         case 3:
            IIllIiillIllIiil var13 = new IIllIiillIllIiil((long)(this.iiilillIIi++), target, observed, feetNow, clockNow);
            this.liilillIIi.put(target, var13);
            ++this.IIIiillIIi;
            var13.lllliillil = lIliiiIliIliiiIl.lIIiIiIlll;
            var13.illliillil = owner;
            var13.lliliillil = 1;
            return illliiIiIilliiIi.IiiIlIIlIi;
         default:
            if (var12.lliliillil >= 3) {
               this.lIiiIiIlilli(var12, IlIillIiilIi<invokedynamic>(), var12.lilliillil, new ilillIiill(fingerprintNow, kind.getAsLong(), (long[])null));
               return illliiIiIilliiIi.IIIllIIlIi;
            } else {
               var12.lllliillil = lIliiiIliIliiiIl.lIIiIiIlll;
               var12.illliillil = owner;
               ++var12.lliliillil;
               return illliiIiIilliiIi.IiiIlIIlIi;
            }
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '頛') ^ '阛') ^ '襣') << 10 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '頛') ^ '阛') ^ '襣') >>> 6) >>> 9 | (char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '頛') ^ '阛') ^ '襣') << 10 | (char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) ^ '頛') ^ '阛') ^ '襣') >>> 6) << 7))) + 32756))) + var5) ^ 29672) - var5) + '\uf5ec') ^ 844));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill(long accessProof, long target, String executableStand) {
      IIllIiillIllIiil var6 = (IIllIiillIllIiil)this.liilillIIi.get(accessProof);
      if (var6 != null) {
         var6.Iilliillil = target;
         var6.lilliillil = executableStand == null ? IlIillIiilIi<invokedynamic>() : executableStand;
      }
   }

   public void IiIlliIliiIl(long target) {
      this.liilillIIi.remove(target);
   }

   private static String liiiIIllIl(IIllIiillIllIiil clockNow, long fingerprintNow, LongSupplier t, long feetNow) {
      ilillIiill var6 = clockNow.lIiliillil;
      if (var6 == null) {
         return IlIillIiilIi<invokedynamic>();
      } else if (!var6.iIlIlllllill(feetNow)) {
         return IlIillIiilIi<invokedynamic>();
      } else {
         if (fingerprintNow != var6.IiilIIiliilIIi) {
            long var7 = t.getAsLong();
            if (var7 != var6.iiilIIiIIIiIIi) {
               return IlIillIiilIi<invokedynamic>();
            }

            clockNow.lIiliillil = var6.IilliliilIIi(fingerprintNow);
         }

         return null;
      }
   }

   public void IIillIiliIil() {
      this.liilillIIi.clear();
   }

   public int IlIlllIlilIl(String owner) {
      long var5 = 426837054734499186L;
      var5 ^= (0L ^ var5) & -1L << 32;

      for(IIllIiillIllIiil var4 : this.liilillIIi.values()) {
         if (var4.lllliillil == lIliiiIliIliiiIl.lIIiIiIlll && var4.illliillil.equals(owner)) {
            var4.lllliillil = lIliiiIliIliiiIl.IIIiIiIlll;
            var4.illliillil = "";
            var5 += 4294967296L;
         }
      }

      return (int)(var5 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(-var4[var5]) ^ var5) + var5))))) >>> 7 | (char)(-((char)(~((char)((char)((char)(-var4[var5]) ^ var5) + var5))))) << 9) + 5368))) >>> 1 | (char)(~((char)((char)((char)(-((char)(~((char)((char)((char)(-var4[var5]) ^ var5) + var5))))) >>> 7 | (char)(-((char)(~((char)((char)((char)(-var4[var5]) ^ var5) + var5))))) << 9) + 5368))) << 15) ^ var5) ^ var5) + var5))) - var5) ^ var5) + 32087) - 24252) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void lIiiIiIlilli(IIllIiillIllIiil reason, String t, String dependency, ilillIiill accessProof) {
      reason.lllliillil = lIliiiIliIliiiIl.iIIiIiIlll;
      reason.iilliillil = t == null ? "" : t;
      reason.lilliillil = dependency == null ? IlIillIiilIi<invokedynamic>() : dependency;
      reason.lIiliillil = accessProof;
      ++reason.iIiliillil;
      reason.lliliillil = 0;
      reason.ililiillil = 0;
      reason.illliillil = "";
      ++this.iIIiillIIi;
   }

   public void iliIiiliiiii(long target) {
      IIllIiillIllIiil var3 = (IIllIiillIllIiil)this.liilillIIi.get(target);
      if (var3 != null) {
         var3.lllliillil = lIliiiIliIliiiIl.IlIiIiIlll;
         var3.illliillil = "";
         ++this.lIIiillIIi;
      }
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') >>> 8 | (char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') << 8) ^ '뾏'))))) - 29151) - var5) >>> 2 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') >>> 8 | (char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') << 8) ^ '뾏'))))) - 29151) - var5) << 14) + var5))))))) ^ var5) + var5) ^ '곹') >>> 4 | (char)((char)((char)((char)(-((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') >>> 8 | (char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') << 8) ^ '뾏'))))) - 29151) - var5) >>> 2 | (char)((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') >>> 8 | (char)((char)(~((char)(var4[var5] ^ 10741))) - '\uec52') << 8) ^ '뾏'))))) - 29151) - var5) << 14) + var5))))))) ^ var5) + var5) ^ '곹') << 12) + '芀'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilllilliill() {
      return this.liilillIIi.size();
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) << 1 | (char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) >>> 15) + var5) >>> 14 | (char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) << 1 | (char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) >>> 15) + var5) << 2) + 20526))) - var5) + var5))) ^ 'ﴍ') - '\udcd9') - var5) << 3 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) << 1 | (char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) >>> 15) + var5) >>> 14 | (char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) << 1 | (char)(-((char)((char)(var4[var5] ^ var5) ^ '螡'))) >>> 15) + var5) << 2) + 20526))) - var5) + var5))) ^ 'ﴍ') - '\udcd9') - var5) >>> 13) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Iiilliiliiil() {
      return IlIillIiilIi<invokedynamic>() + this.IIIiillIIi + IlIillIiilIi<invokedynamic>() + this.lIIiillIIi + IlIillIiilIi<invokedynamic>() + this.iIIiillIIi + IlIillIiilIi<invokedynamic>() + this.IlIiillIIi + IlIillIiilIi<invokedynamic>() + this.llIiillIIi + IlIillIiilIi<invokedynamic>() + this.ilIiillIIi;
   }

   public void IIIllIIliIIl(long target) {
      IIllIiillIllIiil var3 = (IIllIiillIllIiil)this.liilillIIi.get(target);
      if (var3 != null && var3.lllliillil == lIliiiIliIliiiIl.lIIiIiIlll) {
         var3.lllliillil = lIliiiIliIliiiIl.IIIiIiIlll;
         var3.illliillil = "";
      }

   }

   public boolean IIlllIlliIll(long target, long fingerprintNow, LongSupplier feetNow, long clockNow) {
      IIllIiillIllIiil var8 = (IIllIiillIllIiil)this.liilillIIi.get(target);
      return var8 != null && var8.lllliillil == lIliiiIliIliiiIl.iIIiIiIlll && liiiIIllIl(var8, fingerprintNow, feetNow, clockNow) == null;
   }

   public void IilliliilIIi(long accessProof, String dependency, String target, ilillIiill reason) {
      IIllIiillIllIiil var6 = (IIllIiillIllIiil)this.liilillIIi.get(accessProof);
      if (var6 != null) {
         this.lIiiIiIlilli(var6, dependency, target, reason);
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 24705) ^ var5) + 14804) >>> 2 | (char)((char)((char)(var4[var5] - 24705) ^ var5) + 14804) << 14))) - 20103) + var5))) + '뤊'))) - var5) - '튧'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IIIilIIiiIIi(IIllIiillIllIiil memoryHit, boolean t) {
      return String.format(Locale.ROOT, IlIillIiilIi<invokedynamic>(), memoryHit.lIlliillil, memoryHit.lllliillil, memoryHit.lilliillil, memoryHit.iilliillil.isEmpty() ? IlIillIiilIi<invokedynamic>() : memoryHit.iilliillil, memoryHit.lIiliillil == null ? IlIillIiilIi<invokedynamic>() : Long.toUnsignedString(memoryHit.lIiliillil.iiilIIiIIIiIIi) + (memoryHit.lIiliillil.IliIlllilIi() ? IlIillIiilIi<invokedynamic>() + memoryHit.lIiliillil.liiiIIllIl() + IlIillIiilIi<invokedynamic>() : ""), t, memoryHit.IIiliillil.isEmpty() ? IlIillIiilIi<invokedynamic>() : memoryHit.IIiliillil, memoryHit.iiIliillil, memoryHit.lliliillil, memoryHit.iIiliillil);
   }

   private void Ililllililil() {
      long var6 = 3418075456422957306L;
      long var1 = 0L;
      var6 ^= (0L ^ var6) & -1L << 32;

      for(Map.Entry var5 : this.liilillIIi.entrySet()) {
         if (((IIllIiillIllIiil)var5.getValue()).lllliillil == lIliiiIliIliiiIl.IlIiIiIlll || ((IIllIiillIllIiil)var5.getValue()).lllliillil == lIliiiIliIliiiIl.iIIiIiIlll) {
            var1 = (Long)var5.getKey();
            var6 ^= (4294967296L ^ var6) & -1L << 32;
            break;
         }
      }

      if ((int)(var6 >>> 32) == 0) {
         var1 = (Long)this.liilillIIi.keySet().iterator().next();
      }

      this.liilillIIi.remove(var1);
   }
}
