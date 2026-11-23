package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class illillilIilillil {
   private int IIillIIlil;
   private int lIlilIIlil;
   private int IilllIIlil;
   private int IIlilIIlil;
   private long IllilIIlil = Long.MIN_VALUE;
   private int IlillIIlil;
   private int lllllIIlil;
   private int lIlllIIlil;
   private double IlIilIIlil = Double.NaN;
   private int lIIilIIlil;
   private int iIlllIIlil;
   public static final double IIlllIIlil = 999.9;
   private boolean iIlilIIlil;
   private int llillIIlil;
   private int lIillIIlil;
   private int iilllIIlil;
   private double iiillIIlil;
   private int IiillIIlil;
   private int liillIIlil;
   private int IIIilIIlil;
   private double ilIilIIlil;
   public static final int iiIllIIlil = 6;
   private int lilllIIlil;
   private int IiIilIIlil;
   private int ilillIIlil;
   private int llIilIIlil;
   private int IllllIIlil;
   private int liIilIIlil;
   private int iIillIIlil;
   private int iIIilIIlil;
   private int lllilIIlil;
   private int illllIIlil;

   public void IIillIiliIil(float hp) {
      if (Float.isFinite(hp)) {
         this.iiillIIlil += (double)Math.max(0.0F, hp);
         ++this.IIIilIIlil;
      }
   }

   public void Iiilliiliiil() {
      ++this.llIilIIlil;
   }

   private static String IiIIlliIIl(double sum, int n) {
      return iiIIlIIlIl(n <= 0 ? (double)0.0F : sum / (double)n);
   }

   private void llIIlilIIl() {
      if (this.lIlilIIlil >= 2) {
         ++this.IllllIIlil;
      }

      this.lllllIIlil = Math.max(this.lllllIIlil, this.lIlilIIlil);
      this.lIlilIIlil = 0;
      this.IIlilIIlil = 0;
   }

   public void IilliliilIIi(boolean tick, long targetAirborne) {
      ++this.illllIIlil;
      if (tick && this.iIlilIIlil) {
         ++this.lIlilIIlil;
         this.lllllIIlil = Math.max(this.lllllIIlil, this.lIlilIIlil);
      } else {
         this.IllilIIlil = targetAirborne;
         this.lllilIIlil = 0;
      }

   }

   public void lIiiIiIlilli(boolean nowAirborne) {
      long var3 = 25306536890963409L;
      if (!nowAirborne) {
         if (this.iIlilIIlil) {
            this.llIIlilIIl();
         }

         this.iIlilIIlil = false;
         if (this.IllilIIlil != Long.MIN_VALUE && ++this.lllilIIlil > 6) {
            this.IllilIIlil = Long.MIN_VALUE;
         }

      } else {
         if (!this.iIlilIIlil) {
            this.IIlilIIlil = 0;
            var3 ^= ((long)(this.IllilIIlil != Long.MIN_VALUE && this.lllilIIlil <= 6 ? 1 : 0) << 32 ^ var3) & -1L << 32;
            this.lIlilIIlil = (int)(var3 >>> 32) != 0 ? 1 : 0;
            this.IllilIIlil = Long.MIN_VALUE;
            this.lllllIIlil = Math.max(this.lllllIIlil, this.lIlilIIlil);
         }

         this.iIlilIIlil = true;
         ++this.IIlilIIlil;
      }
   }

   public void IiIlliIliiIl() {
      ++this.iIillIIlil;
   }

   public void iliIiiliiiii(boolean aggro, boolean landedNear) {
      if (aggro) {
         ++this.lilllIIlil;
      } else {
         ++this.IilllIIlil;
      }

      if (landedNear) {
         ++this.iilllIIlil;
      }

   }

   public int IIlilIliiIli() {
      return this.IllllIIlil + (this.iIlilIIlil && this.lIlilIIlil >= 2 ? 1 : 0);
   }

   public int IiIiliIiiiIi() {
      return this.lIlllIIlil;
   }

   public void IlIillIiilIi() {
      ++this.liIilIIlil;
   }

   public int Illillliilli() {
      return this.IIillIIlil;
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 1518) ^ '銀') >>> 3 | (char)((char)(var4[var5] + 1518) ^ '銀') << 13) >>> 4 | (char)((char)((char)(var4[var5] + 1518) ^ '銀') >>> 3 | (char)((char)(var4[var5] + 1518) ^ '銀') << 13) << 12) ^ 25810) - var5))) - 18583) - 17467) - var5) - '顗') << 12 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 1518) ^ '銀') >>> 3 | (char)((char)(var4[var5] + 1518) ^ '銀') << 13) >>> 4 | (char)((char)((char)(var4[var5] + 1518) ^ '銀') >>> 3 | (char)((char)(var4[var5] + 1518) ^ '銀') << 13) << 12) ^ 25810) - var5))) - 18583) - 17467) - var5) - '顗') >>> 4) - '\uf7c2'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iliilliiilii() {
      return this.liillIIlil;
   }

   public int IIiilIiiiIii() {
      return this.iIIilIIlil;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] - '\ued8d') + 5525))) + '뙮') - '맆') + var5))) ^ var5) << 15 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)(var4[var5] - '\ued8d') + 5525))) + '뙮') - '맆') + var5))) ^ var5) >>> 1) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIlllIlilIl() {
      ++this.lIillIIlil;
   }

   public String iIIIlIlIIl(String state, String arm, String learn) {
      StringBuilder var4 = new StringBuilder(256);
      var4.append(IllIllllIl<invokedynamic>()).append(lIlIliIlIl(state) ? IllIllllIl<invokedynamic>() : state.trim());
      var4.append(IllIllllIl<invokedynamic>()).append(lIlIliIlIl(arm) ? IllIllllIl<invokedynamic>() : arm.trim());
      var4.append(IllIllllIl<invokedynamic>()).append(this.Iiiiliiiiiii());
      var4.append(IllIllllIl<invokedynamic>()).append(this.lIlllIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.iIlllIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.IIlilIliiIli());
      var4.append(IllIllllIl<invokedynamic>()).append(this.lllllIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.illllIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.IilllIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.lilllIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.iilllIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.IIillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.lIillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.iIillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.IlillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.llillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.ilillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.IiillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.liillIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(IiIIlliIIl(this.iiillIIlil, this.IIIilIIlil));
      var4.append(IllIllllIl<invokedynamic>()).append(this.lIIilIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(this.iIIilIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(Double.isNaN(this.IlIilIIlil) ? IllIllllIl<invokedynamic>() : iiIIlIIlIl(this.IlIilIIlil));
      var4.append(IllIllllIl<invokedynamic>()).append(this.llIilIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(IiIIlliIIl(this.ilIilIIlil, this.IiIilIIlil));
      var4.append(IllIllllIl<invokedynamic>()).append(this.liIilIIlil);
      var4.append(IllIllllIl<invokedynamic>()).append(lIlIliIlIl(learn) ? IllIllllIl<invokedynamic>() : learn.trim());
      return var4.toString();
   }

   public void iIlIlllllill() {
      ++this.lIlllIIlil;
   }

   public int Iilililiiili() {
      return this.IilllIIlil + this.lilllIIlil;
   }

   private static boolean lIlIliIlIl(String s) {
      return s == null || s.isBlank();
   }

   public int Iiiiliiiiiii() {
      return this.iIlilIIlil ? this.IIlilIIlil : 0;
   }

   public void IIlllIlliIll() {
      ++this.IlillIIlil;
   }

   public void Iilllilliill(boolean withoutStart) {
      ++this.IiillIIlil;
      if (withoutStart) {
         ++this.liillIIlil;
      }

   }

   public void liiiIIllIl() {
      ++this.iIlllIIlil;
   }

   // $FF: synthetic method
   private static CallSite iIiIlIliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) << 3 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) >>> 13))) >>> 14 | (char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) << 3 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) >>> 13))) << 2))))))) ^ var5))) + var5) >>> 14 | (char)((char)(~((char)((char)(~((char)(~((char)(~((char)((char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) << 3 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) >>> 13))) >>> 14 | (char)(-((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) << 3 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ 2884) + 13213) + 'ﬤ') - 11449))))) >>> 13))) << 2))))))) ^ var5))) + var5) << 2) - var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Ililllililil(boolean minEnemyDistance, double unsafe) {
      ++this.lIIilIIlil;
      if (minEnemyDistance) {
         ++this.iIIilIIlil;
      }

      this.IlIilIIlil = Double.isNaN(unsafe) ? (double)0.0F : Math.min(999.9, Math.max((double)0.0F, unsafe));
   }

   public int IIIIllIIIl() {
      return this.illllIIlil;
   }

   // $FF: synthetic method
   private static CallSite lliIliliIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) << 4 | (char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) >>> 12))) ^ var5))) - '\ue648') + var5) << 13 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) << 4 | (char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) >>> 12))) ^ var5))) - '\ue648') + var5) >>> 3) >>> 1 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) << 4 | (char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) >>> 12))) ^ var5))) - '\ue648') + var5) << 13 | (char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) << 4 | (char)((char)((char)((char)((char)(var4[var5] - 1324) + 9812) + var5) + '颍') + 6634) >>> 12))) ^ var5))) - '\ue648') + var5) >>> 3) << 15) ^ '뫩') ^ 15783) ^ '顜'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIiIllIiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + '駶') - var5))) >>> 1 | (char)(-((char)((char)(var4[var5] + '駶') - var5))) << 15) ^ var5) + var5))))) >>> 14 | (char)(-((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] + '駶') - var5))) >>> 1 | (char)(-((char)((char)(var4[var5] + '駶') - var5))) << 15) ^ var5) + var5))))) << 2))) + var5) - var5) - var5) ^ '뒦'))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IIIilIIiiIIi(float hp) {
      if (Float.isFinite(hp)) {
         this.ilIilIIlil += (double)Math.max(0.0F, hp);
         ++this.IiIilIIlil;
      }
   }

   private static String iiIIlIIlIl(double v) {
      return String.format(Locale.ROOT, IllIllllIl<invokedynamic>(), v);
   }

   public void IliIlllilIi() {
      this.lIlllIIlil = 0;
      this.iIlllIIlil = 0;
      this.IllllIIlil = 0;
      this.lllllIIlil = 0;
      this.illllIIlil = 0;
      this.IilllIIlil = 0;
      this.lilllIIlil = 0;
      this.iilllIIlil = 0;
      this.IIillIIlil = 0;
      this.lIillIIlil = 0;
      this.iIillIIlil = 0;
      this.IlillIIlil = 0;
      this.llillIIlil = 0;
      this.ilillIIlil = 0;
      this.IiillIIlil = 0;
      this.liillIIlil = 0;
      this.iiillIIlil = (double)0.0F;
      this.IIIilIIlil = 0;
      this.lIIilIIlil = 0;
      this.iIIilIIlil = 0;
      this.IlIilIIlil = Double.NaN;
      this.llIilIIlil = 0;
      this.ilIilIIlil = (double)0.0F;
      this.IiIilIIlil = 0;
      this.liIilIIlil = 0;
      this.IIlilIIlil = 0;
      this.lIlilIIlil = 0;
      this.iIlilIIlil = false;
      this.IllilIIlil = Long.MIN_VALUE;
      this.lllilIIlil = 0;
   }

   public void Illlllllilll(boolean aborted) {
      ++this.llillIIlil;
      if (aborted) {
         ++this.ilillIIlil;
      }

   }

   public void IIIllIIliIIl() {
      ++this.IIillIIlil;
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8992898554469283101L ^ Long.rotateLeft(5336145751260470882L, 33) ^ 1156071025067348366L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1555477181530441454L ^ Long.rotateLeft(-2779871042556952148L, 44) ^ -8278706264261119375L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2279248420687487692L ^ Long.rotateLeft(109333291164313027L, 41) ^ -4885378632374434348L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5862045730045329971L ^ Long.rotateLeft(258472683790282849L, 38) ^ -5389010836632005618L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -710116448189697419L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5400545917978429831L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7833570618377099292L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3783829789503187086L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 997269041826300536L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2361892632830921478L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(illIlIilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lilIliilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiIllIiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iIiIlIliIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lliIliliIl<invokedynamic>());
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
