package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liIlilIiiiIlilIi {
   public final float IililllIIi;
   public final float lililllIIi;
   public final int[] iiIilllIIi;
   public final float illilllIIi;
   public static final int IIIilllIIi = 21;
   public final int iIlilllIIi;
   public final float iililllIIi;
   public final int[] llIilllIIi;
   public final float[] IIlilllIIi;
   public final String lIIilllIIi;
   public final String[] liIilllIIi;
   public final float lllilllIIi;
   public final int iIIilllIIi;
   public final int IlIilllIIi;
   public final int ilIilllIIi;
   public final int IiIilllIIi;
   public final float[][] lIlilllIIi;
   public final int IllilllIIi;
   public final float IIiilllIIi;

   public boolean IilliliilIIi(int ancestor, int bone) {
      long var4 = 957589632451029098L;

      for(long var6 = var4 ^ ((long)ancestor << 32 ^ var4) & -1L << 32; (int)(var6 >>> 32) >= 0; var6 ^= ((long)this.iiIilllIIi[(int)(var6 >>> 32)] << 32 ^ var6) & -1L << 32) {
         if ((int)(var6 >>> 32) == bone) {
            return true;
         }
      }

      return false;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '闸') + 12958) + var5) + 23470) >>> 6 | (char)((char)((char)((char)(var4[var5] - '闸') + 12958) + var5) + 23470) << 10) - var5))) ^ 11427)) - 4596) << 1 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - '闸') + 12958) + var5) + 23470) >>> 6 | (char)((char)((char)((char)(var4[var5] - '闸') + 12958) + var5) + 23470) << 10) - var5))) ^ 11427)) - 4596) >>> 15) ^ 29537)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 4741172533689468635L ^ Long.rotateLeft(6270502012106900967L, 33) ^ -279126556932115279L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -606545596922786919L ^ Long.rotateLeft(4524403869183571590L, 26) ^ -7457400239789371295L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8200647425328770511L ^ Long.rotateLeft(-420060917299614055L, 22) ^ 7660253870496617757L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6356223962629394524L ^ Long.rotateLeft(-1603543423964172771L, 31) ^ -4710393350325828995L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1160078672865358482L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4185038738225945384L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6148903873611721125L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8556463202508156846L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7259591679873635845L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8634597938910447541L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Iilllilliill<invokedynamic>());
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

   private static iIIiiiilIlIiiiil IIIllIIliIIl(float[] o, int into, iIIiiiilIlIiiiil m) {
      m.iIIIIiIiil = o[into];
      m.IlIIIiIiil = o[into + 1];
      m.llIIIiIiil = o[into + 2];
      m.ilIIIiIiil = o[into + 3];
      m.IiIIIiIiil = o[into + 4];
      m.liIIIiIiil = o[into + 5];
      m.iiIIIiIiil = o[into + 6];
      m.IIlIIiIiil = o[into + 7];
      m.lIlIIiIiil = o[into + 8];
      m.iIlIIiIiil = o[into + 9];
      m.IllIIiIiil = o[into + 10];
      m.lllIIiIiil = o[into + 11];
      return m;
   }

   public float lIiiIiIlilli() {
      long var6 = -7052056532662460474L;
      if (this.IllilllIIi < 0) {
         return 0.0F;
      } else {
         float var1 = this.IIlilllIIi[3 * this.IllilllIIi + 1];
         float var2 = 0.0F;

         for(long var8 = var6 ^ (0L ^ var6) & -1L << 32; (int)(var8 >>> 32) < this.IiIilllIIi; var8 += 4294967296L) {
            if (this.IilliliilIIi((int)(var8 >>> 32), this.IllilllIIi)) {
               float[] var4 = this.lIlilllIIi[(int)(var8 >>> 32)];

               for(var8 ^= (0L ^ var8) & -1L >>> 32; (int)var8 < var4.length; var8 ^= (var8 ^ var8 + (long)9) & -1L >>> 32) {
                  var2 = Math.max(var2, var1 - var4[(int)var8 + 1]);
               }
            }
         }

         return var2;
      }
   }

   public void iliIiiliiiii(IIlllilllIlllill out, float[] p) {
      long var10 = -2989612167196665683L;
      iIIiiiilIlIiiiil var3 = new iIIiiiilIlIiiiil();
      iIIiiiilIlIiiiil var4 = new iIIiiiilIlIiiiil();

      for(var10 ^= (0L ^ var10) & -1L << 32; (int)(var10 >>> 32) < this.IiIilllIIi; var10 += 4294967296L) {
         float var6 = this.IIlilllIIi[3 * (int)(var10 >>> 32)];
         float var7 = this.IIlilllIIi[3 * (int)(var10 >>> 32) + 1];
         float var8 = this.IIlilllIIi[3 * (int)(var10 >>> 32) + 2];
         var4.IliIlllilIi().IilliliilIIi(var6 + out.iIIIlIiill[(int)(var10 >>> 32)], var7 + out.IlIIlIiill[(int)(var10 >>> 32)], var8 + out.llIIlIiill[(int)(var10 >>> 32)]).IlIlllIlilIl(out.lIIIlIiill[(int)(var10 >>> 32)]).IIIllIIliIIl(out.IIIIlIiill[(int)(var10 >>> 32)]).iliIiiliiiii(out.iiiiIIiill[(int)(var10 >>> 32)]).lIiiIiIlilli(out.ilIIlIiill[(int)(var10 >>> 32)], out.IiIIlIiill[(int)(var10 >>> 32)], out.liIIlIiill[(int)(var10 >>> 32)]).IilliliilIIi(-var6, -var7, -var8);
         var10 ^= ((long)this.iiIilllIIi[(int)(var10 >>> 32)] ^ var10) & -1L >>> 32;
         if ((int)var10 < 0) {
            var3.liiiIIllIl(var4);
         } else {
            IIIllIIliIIl(p, (int)var10 * 21, var3).iIlIlllllill(var4);
         }

         var3.IIillIiliIil(p, (int)(var10 >>> 32) * 21);
         var3.Iilllilliill(p, (int)(var10 >>> 32) * 21 + 12);
      }

   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)var4[var5] ^ 20005) << 2 | (char)((char)var4[var5] ^ 20005) >>> 14))))) + var5) << 4 | (char)((char)(~((char)(~((char)((char)((char)var4[var5] ^ 20005) << 2 | (char)((char)var4[var5] ^ 20005) >>> 14))))) + var5) >>> 12) + var5))) << 11 | (char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)var4[var5] ^ 20005) << 2 | (char)((char)var4[var5] ^ 20005) >>> 14))))) + var5) << 4 | (char)((char)(~((char)(~((char)((char)((char)var4[var5] ^ 20005) << 2 | (char)((char)var4[var5] ^ 20005) >>> 14))))) + var5) >>> 12) + var5))) >>> 5))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill(String name) {
      long var3 = 9077718912219695030L;

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.IiIilllIIi; var5 += 4294967296L) {
         if (this.liIilllIIi[(int)(var5 >>> 32)].equals(name)) {
            return (int)(var5 >>> 32);
         }
      }

      return -1;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) + '먾') << 4 | (char)((char)((char)(var4[var5] ^ var5) + var5) + '먾') >>> 12))))) << 1 | (char)(~((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) + '먾') << 4 | (char)((char)((char)(var4[var5] ^ var5) + var5) + '먾') >>> 12))))) >>> 15)) - 'ﻸ') - 31066) + 13651) ^ var5))) + 16501))) + 9872));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   liIlilIiiiIlilIi(String firstPerson, llIIliilIIli bones, int[] id, List<lIillIlliIillIll> atlas, lIillIlliIillIll sharedAtlas) {
      long var17 = -1173349435195936370L;
      long var19 = -3596551463022281042L;
      super();
      this.lIIilllIIi = firstPerson;
      this.iIIilllIIi = bones.ilIiilIIlIiIiilIIl;
      this.IlIilllIIi = bones.liIiilIIliiIiilIIl;
      this.llIilllIIi = id != null ? id : bones.IIliilIIllIliilIIl;
      this.ilIilllIIi = bones.liiiIIllIl();
      this.IiIilllIIi = atlas.size();
      this.liIilllIIi = new String[this.IiIilllIIi];
      this.iiIilllIIi = new int[this.IiIilllIIi];
      this.IIlilllIIi = new float[3 * this.IiIilllIIi];
      this.lIlilllIIi = new float[this.IiIilllIIi][];
      var17 ^= (0L ^ var17) & -1L << 32;
      float var7 = Float.MAX_VALUE;
      float var8 = Float.MAX_VALUE;
      float var9 = Float.MAX_VALUE;
      float var10 = -Float.MAX_VALUE;
      float var11 = -Float.MAX_VALUE;
      float var12 = -Float.MAX_VALUE;

      for(var17 ^= (0L ^ var17) & -1L >>> 32; (int)var17 < this.IiIilllIIi; var17 ^= (var17 ^ var17 + (long)1) & -1L >>> 32) {
         lIillIlliIillIll var14 = (lIillIlliIillIll)atlas.get((int)var17);
         this.liIilllIIi[(int)var17] = var14.lIlIIIilll;
         this.iiIilllIIi[(int)var17] = var14.iIlIIIilll == null ? -1 : var14.iIlIIIilll.IIlIIIilll;
         if (this.iiIilllIIi[(int)var17] >= (int)var17) {
            throw new IllegalStateException(IlIlllIlilIl<invokedynamic>() + var14.lIlIIIilll + IlIlllIlilIl<invokedynamic>());
         }

         this.IIlilllIIi[3 * (int)var17] = var14.IllIIIilll;
         this.IIlilllIIi[3 * (int)var17 + 1] = var14.lllIIIilll;
         this.IIlilllIIi[3 * (int)var17 + 2] = var14.illIIIilll;
         this.lIlilllIIi[(int)var17] = var14.IilIIIilll.iIlIlllllill();
         var17 ^= ((long)((int)(var17 >>> 32) + var14.IilIIIilll.liiiIIllIl()) << 32 ^ var17) & -1L << 32;
         float[] var15 = this.lIlilllIIi[(int)var17];

         for(var19 ^= (0L ^ var19) & -1L << 32; (int)(var19 >>> 32) < var15.length; var19 += 38654705664L) {
            var7 = Math.min(var7, var15[(int)(var19 >>> 32)]);
            var10 = Math.max(var10, var15[(int)(var19 >>> 32)]);
            var8 = Math.min(var8, var15[(int)(var19 >>> 32) + 1]);
            var11 = Math.max(var11, var15[(int)(var19 >>> 32) + 1]);
            var9 = Math.min(var9, var15[(int)(var19 >>> 32) + 2]);
            var12 = Math.max(var12, var15[(int)(var19 >>> 32) + 2]);
         }
      }

      this.iIlilllIIi = (int)(var17 >>> 32);
      this.IllilllIIi = sharedAtlas == null ? -1 : sharedAtlas.IIlIIIilll;
      if ((int)(var17 >>> 32) == 0) {
         var12 = 0.0F;
         var11 = 0.0F;
         var10 = 0.0F;
         var9 = 0.0F;
         var8 = 0.0F;
         var7 = 0.0F;
      }

      this.lllilllIIi = var7;
      this.illilllIIi = var8;
      this.IililllIIi = var9;
      this.lililllIIi = var10;
      this.iililllIIi = var11;
      this.IIiilllIIi = var12;
   }

   public IIlllilllIlllill IliIlllilIi() {
      return new IIlllilllIlllill(this.IiIilllIIi);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 30086) + var5))) << 2 | (char)(-((char)((char)(var4[var5] + 30086) + var5))) >>> 14) ^ 10821) ^ '\uf3f0') - '꼩') + 2942))) - var5) + var5) ^ var5) - var5) + var5) - 29857) << 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + 30086) + var5))) << 2 | (char)(-((char)((char)(var4[var5] + 30086) + var5))) >>> 14) ^ 10821) ^ '\uf3f0') - '꼩') + 2942))) - var5) + var5) ^ var5) - var5) + var5) - 29857) >>> 5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float[] liiiIIllIl() {
      return new float[this.IiIilllIIi * 21];
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - var5) + var5))) << 12) - 15633) + 21037) ^ 1145) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - var5) + var5))) << 12) - 15633) + 21037) ^ 1145) - var5) << 12) + 31000))))) << 1 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - var5) + var5))) << 12) - 15633) + 21037) ^ 1145) - var5) >>> 4 | (char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - var5) + var5))) >>> 4 | (char)(-((char)((char)(var4[var5] - var5) + var5))) << 12) - 15633) + 21037) ^ 1145) - var5) << 12) + 31000))))) >>> 15));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
