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

public final class IllIilIilllIilIi {
   private boolean IlIIIllIIi;
   private static final int iIliiIlIIi = 20;
   private boolean lIiiiIlIIi;
   private final int[] illiiIlIIi = new int[IIlIilillIlIilil.values().length];
   private boolean lIIIIllIIi;
   private int IIiiiIlIIi;
   private float iiiiiIlIIi;
   private int liliiIlIIi;
   private static final float lIliiIlIIi = 89.9999F;
   private int IliiiIlIIi;
   private static final int IlliiIlIIi = 16;
   private boolean lliiiIlIIi;
   private final int[] IiliiIlIIi = new int[20];
   private boolean ilIIIllIIi;
   private int iIiiiIlIIi;
   private int iiliiIlIIi;
   private static final float iiIiiIlIIi = 0.02F;
   private boolean llIIIllIIi;
   private final int[] llliiIlIIi = new int[IIlIilillIlIilil.values().length];
   private boolean iIIIIllIIi;
   private boolean liiiiIlIIi;
   private int IiiiiIlIIi = -1;
   private float IIIIIllIIi;
   private boolean iliiiIlIIi;
   private static final float IIliiIlIIi = 1.0E-4F;

   public void IlIlllIlilIl(float yaw, float pitch) {
      long var4 = 2134689996556229999L;
      var4 ^= ((long)(!this.liiiiIlIIi || !(Math.abs(yaw - this.iiiiiIlIIi) > 1.0E-4F) && !(Math.abs(pitch - this.IIIIIllIIi) > 1.0E-4F) ? 0 : 1) << 32 ^ var4) & -1L << 32;
      if (this.llIIIllIIi) {
         this.llIIIllIIi = false;
         if ((int)(var4 >>> 32) != 0) {
            this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, this.ilIIIllIIi);
         }

      } else {
         if (this.iIIIIllIIi && this.IlIIIllIIi) {
            this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, false);
         }

         this.iIIIIllIIi = true;
         this.IlIIIllIIi = (boolean)((int)(var4 >>> 32));
      }
   }

   public void liiiIIllIl() {
      if (this.iIIIIllIIi) {
         if (this.IlIIIllIIi) {
            this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, false);
         }

         this.iIIIIllIIi = false;
      }

      this.IiIiliIiiiIi();
      this.liliiIlIIi = (this.liliiIlIIi + 1) % 20;
      this.iiliiIlIIi -= this.IiliiIlIIi[this.liliiIlIIi];
      this.IiliiIlIIi[this.liliiIlIIi] = 0;
   }

   public int IIillIiliIil() {
      long var6 = -935496948684824714L;
      long var8 = -2408958180499794531L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.illiiIlIIi;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < (int)var6; var8 += 4294967296L) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
      }

      return (int)(var6 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) << 9 | (char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) >>> 7) >>> 9 | (char)((char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) << 9 | (char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) >>> 7) << 7) + var5) >>> 15 | (char)((char)((char)((char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) << 9 | (char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) >>> 7) >>> 9 | (char)((char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) << 9 | (char)((char)(~((char)(-((char)(~((char)(var4[var5] ^ '\ue310'))))))) ^ var5) >>> 7) << 7) + var5) << 1) ^ var5) - var5) + var5) ^ 17806) - var5) + var5) - var5) + var5))) ^ 12673));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)(var4[var5] ^ 29498))))) - var5))) ^ var5) - var5) - var5) + 31202))))))))) ^ 'ﭽ') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IiIiliIiiiIi() {
      this.IIiiiIlIIi = 0;
      this.lIiiiIlIIi = false;
      this.iIiiiIlIIi = 0;
      this.IliiiIlIIi = 0;
      this.lliiiIlIIi = false;
      this.iliiiIlIIi = false;
      this.iIIIIllIIi = false;
      this.IlIIIllIIi = false;
      this.llIIIllIIi = false;
      this.ilIIIllIIi = false;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6913092594913393087L ^ Long.rotateLeft(4216306857445460098L, 29) ^ 5471549983979809684L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1545271279744617457L ^ Long.rotateLeft(-6083247191083059260L, 7) ^ 2737121764435934616L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8210760392546423094L ^ Long.rotateLeft(-3661495048901833679L, 54) ^ -7097748168271668215L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4179103790762975539L ^ Long.rotateLeft(-1838342918488726144L, 16) ^ 6173553325423314716L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7093746610173485804L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6529749869375989726L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7347977385979593521L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1814591067926861580L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3949085426271435846L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9219053553901730391L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iliilliiilii<invokedynamic>());
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
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '\uf768'))) - var5) - var5) - var5) - '탌') - '\uf4d0'))))) >>> 1 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '\uf768'))) - var5) - var5) - var5) - '탌') - '\uf4d0'))))) << 15) ^ var5) >>> 9 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '\uf768'))) - var5) - var5) - var5) - '탌') - '\uf4d0'))))) >>> 1 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) + '\uf768'))) - var5) - var5) - var5) - '탌') - '\uf4d0'))))) << 15) ^ var5) << 7))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Illlllllilll(double own, double distance, boolean limit) {
      if (Double.isNaN(own) || own > distance) {
         this.IlIillIiilIi(IIlIilillIlIilil.liiliIIlil, limit);
      }

   }

   public void IIIllIIliIIl(boolean yaw, float botDriving, float hasLook, float gcd, boolean pitch) {
      long var9 = 6420404985428873547L;
      if (this.lliiiIlIIi) {
         this.lliiiIlIIi = false;
      } else {
         ++this.IliiiIlIIi;
         if (this.IliiiIlIIi > 1) {
            this.IlIillIiilIi(IIlIilillIlIilil.illliIIlil, false);
         }
      }

      if (yaw) {
         if (Math.abs(hasLook) > 90.0F) {
            this.IlIillIiilIi(IIlIilillIlIilil.iIiliIIlil, pitch);
         }

         if (this.liiiiIlIIi) {
            float var6 = botDriving - this.iiiiiIlIIi;
            float var7 = hasLook - this.IIIIIllIIi;
            if (Math.abs(var6) >= 180.0F && !this.iliiiIlIIi) {
               this.IlIillIiilIi(IIlIilillIlIilil.lIiliIIlil, pitch);
            }

            var9 ^= ((long)(!(Math.abs(hasLook) >= 89.9999F) && !(Math.abs(this.IIIIIllIIi) >= 89.9999F) ? 0 : 1) << 32 ^ var9) & -1L << 32;
            if (pitch && !this.iliiiIlIIi && (int)(var9 >>> 32) == 0 && (!IIIilIIiiIIi(var6, gcd) || !IIIilIIiiIIi(var7, gcd))) {
               this.IlIillIiilIi(IIlIilillIlIilil.IIiliIIlil, true);
            }
         }

         this.liiiiIlIIi = true;
         this.iiiiiIlIIi = botDriving;
         this.IIIIIllIIi = hasLook;
      }
   }

   public void IliIlllilIi() {
      Arrays.fill(this.llliiIlIIi, 0);
      Arrays.fill(this.illiiIlIIi, 0);
      Arrays.fill(this.IiliiIlIIi, 0);
      this.liliiIlIIi = 0;
      this.iiliiIlIIi = 0;
      this.IiIiliIiiiIi();
      this.IiiiiIlIIi = -1;
      this.liiiiIlIIi = false;
      this.iiiiiIlIIi = 0.0F;
      this.IIIIIllIIi = 0.0F;
      this.lIIIIllIIi = false;
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 14 | (char)(-var4[var5]) << 2) + '칢') - 21334))) ^ var5))) + '輄') + '锯') + var5) << 9 | (char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-var4[var5]) >>> 14 | (char)(-var4[var5]) << 2) + '칢') - 21334))) ^ var5))) + '輄') + '锯') + var5) >>> 7) - var5))) ^ 8302));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Iilllilliill(IIlIilillIlIilil rule) {
      return rule == null ? 0 : this.llliiIlIIi[rule.ordinal()];
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) - var5))) - 'ﾗ'))) - var5) ^ var5) ^ 27841) >>> 8 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) + var5) - var5))) - 'ﾗ'))) - var5) ^ var5) ^ 27841) << 8))) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void IlIillIiilIi(IIlIilillIlIilil rule, boolean own) {
      int var10002 = this.llliiIlIIi[rule.ordinal()]++;
      if (own) {
         var10002 = this.illiiIlIIi[rule.ordinal()]++;
      }

   }

   public void IiIlliIliiIl(boolean own) {
      this.lIIIIllIIi = own;
      int var10002 = this.IiliiIlIIi[this.liliiIlIIi]++;
      ++this.iiliiIlIIi;
      if (this.iiliiIlIIi > 16) {
         this.IlIillIiilIi(IIlIilillIlIilil.lliliIIlil, own);
      }

   }

   public static boolean IIIilIIiiIIi(float gcd, float delta) {
      if (delta > 0.0F && Float.isFinite(delta)) {
         if (!Float.isFinite(gcd)) {
            return false;
         } else {
            double var2 = (double)gcd / (double)delta;
            return Math.abs(var2 - Math.rint(var2)) <= (double)0.02F;
         }
      } else {
         return true;
      }
   }

   public int Ililllililil() {
      long var6 = 830431797200936067L;
      long var8 = 356277705699758097L;
      var6 ^= (0L ^ var6) & -1L << 32;
      int[] var2 = this.llliiIlIIi;
      var6 ^= ((long)var2.length ^ var6) & -1L >>> 32;

      for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < (int)var6; var8 += 4294967296L) {
         var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
         var6 ^= ((long)((int)(var6 >>> 32) + (int)var8) << 32 ^ var6) & -1L << 32;
      }

      return (int)(var6 >>> 32);
   }

   public void lIiiIiIlilli() {
      this.IiiiiIlIIi = -1;
   }

   public void iIlIlllllill(llIIiiililIIiiil own, boolean kind, boolean screenOpen) {
      if (own != null && own.IliIlllilIi()) {
         if (this.IIiiiIlIIi > 0) {
            this.IlIillIiilIi(IIlIilillIlIilil.IllliIIlil, kind);
         }

         if (own == llIIiiililIIiiil.liIliIIiil && this.lIiiiIlIIi) {
            this.IlIillIiilIi(IIlIilillIlIilil.lllliIIlil, kind);
         }

         if (screenOpen) {
            this.IlIillIiilIi(IIlIilillIlIilil.ililiIIlil, kind);
         }

         ++this.IIiiiIlIIi;
         if (own == llIIiiililIIiiil.IIlliIIiil || own == llIIiiililIIiiil.iiIliIIiil || own == llIIiiililIIiiil.lIlliIIiil) {
            this.lIiiiIlIIi = true;
         }

         if (own == llIIiiililIIiiil.lIlliIIiil) {
            if (this.iIIIIllIIi) {
               if (this.IlIIIllIIi) {
                  this.IlIillIiilIi(IIlIilillIlIilil.IliliIIlil, kind);
               }

               this.iIIIIllIIi = false;
            } else {
               this.llIIIllIIi = true;
               this.ilIIIllIIi = kind;
            }
         }

      }
   }

   public void IIlllIlliIll(boolean forwardHeld) {
      if (!forwardHeld) {
         this.IlIillIiilIi(IIlIilillIlIilil.IiiliIIlil, this.lIIIIllIIi);
      }

   }

   public String Iiilliiliiil() {
      long var6 = 2742264336596548399L;
      StringBuilder var1 = new StringBuilder(160);
      var1.append(IIlilIliiIli<invokedynamic>()).append(this.Ililllililil()).append(IIlilIliiIli<invokedynamic>()).append(this.IIillIiliIil());
      IIlIilillIlIilil[] var2 = IIlIilillIlIilil.values();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
         IIlIilillIlIilil var5 = var2[(int)var9];
         var1.append(' ').append(var5.iiiliIIlil).append('=').append(this.llliiIlIIi[var5.ordinal()]);
      }

      return var1.toString();
   }

   public void iliIiiliiiii() {
      this.lliiiIlIIi = true;
      this.iliiiIlIIi = true;
   }

   public void IilliliilIIi(int own, boolean slot) {
      ++this.iIiiiIlIIi;
      if (this.iIiiiIlIIi > 1) {
         this.IlIillIiilIi(IIlIilillIlIilil.IilliIIlil, slot);
      }

      if (this.IIiiiIlIIi > 0) {
         this.IlIillIiilIi(IIlIilillIlIilil.lilliIIlil, slot);
      }

      if (own == this.IiiiiIlIIi) {
         this.IlIillIiilIi(IIlIilillIlIilil.iilliIIlil, slot);
      }

      this.IiiiiIlIIi = own;
   }
}
