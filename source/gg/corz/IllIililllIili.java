package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IllIililllIili {
   private int IIlliiIIIl;
   private int lIlliiIIIl;
   public static final int IiIliiIIIl = 1024;
   private final LinkedHashMap<Long, lIlllIliiIlllIli> iiIliiIIIl = new LinkedHashMap<Long, lIlllIliiIlllIli>(16, 0.75F, false) {
      protected boolean removeEldestEntry(Map.Entry<Long, lIlllIliiIlllIli> e) {
         return this.size() > 1024;
      }
   };
   private liliiliiliil iIlliiIIIl;
   private static final lIllIIIiiIllIIIi[] liIliiIIIl;
   public static final String ilIliiIIIl = "COMPLETION_ACCESS_ESCALATION_REQUIRED";

   public int IlIlllIlilIl() {
      return this.iiIliiIIIl.size();
   }

   public static liliiliiliil IliIlllilIi(int epochAdvancedSinceLastPlan, int remaining, boolean triedThisEpoch, Set<lIllIIIiiIllIIIi> steps) {
      long var9 = -3740843229553196550L;
      if (epochAdvancedSinceLastPlan <= 0) {
         return new liliiliiliil(IlililIillililIi.IliIillIIi, (lIllIIIiiIllIIIi)null, Iilllilliill<invokedynamic>());
      } else if (remaining > 0) {
         return new liliiliiliil(IlililIillililIi.iIiIillIIi, (lIllIIIiiIllIIIi)null, Iilllilliill<invokedynamic>() + remaining + Iilllilliill<invokedynamic>() + epochAdvancedSinceLastPlan);
      } else if (triedThisEpoch) {
         return new liliiliiliil(IlililIillililIi.IliIillIIi, (lIllIIIiiIllIIIi)null, Iilllilliill<invokedynamic>() + epochAdvancedSinceLastPlan);
      } else {
         Set var4 = steps == null ? Set.of() : steps;
         lIllIIIiiIllIIIi[] var5 = liIliiIIIl;
         var9 ^= ((long)var5.length << 32 ^ var9) & -1L << 32;

         for(long var12 = var9 ^ (0L ^ var9) & -1L >>> 32; (int)var12 < (int)(var12 >>> 32); var12 ^= (var12 ^ var12 + (long)1) & -1L >>> 32) {
            lIllIIIiiIllIIIi var8 = var5[(int)var12];
            if (var8 == lIllIIIiiIllIIIi.iilIlIliil) {
               break;
            }

            if (!var4.contains(var8)) {
               return new liliiliiliil(IlililIillililIi.lliIillIIi, var8, Iilllilliill<invokedynamic>() + epochAdvancedSinceLastPlan + Iilllilliill<invokedynamic>() + var8 + Iilllilliill<invokedynamic>() + var4.size());
            }
         }

         return new liliiliiliil(IlililIillililIi.iliIillIIi, lIllIIIiiIllIIIi.iilIlIliil, Iilllilliill<invokedynamic>() + epochAdvancedSinceLastPlan + Iilllilliill<invokedynamic>() + lIllIIIiiIllIIIi.iilIlIliil);
      }
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] ^ var5))) - var5))) + var5) - var5) - 31093))) ^ '\ue147') + var5) - 13369));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.IIlliiIIIl;
   }

   public liliiliiliil IiIlliIliiIl() {
      return this.iIlliiIIIl;
   }

   public static lIllIIIiiIllIIIi[] liiiIIllIl() {
      return (lIllIIIiiIllIIIi[])liIliiIIIl.clone();
   }

   public void IIlllIlliIll() {
      this.iiIliiIIIl.clear();
      this.IIlliiIIIl = 0;
      this.lIlliiIIIl = 0;
      this.iIlliiIIIl = null;
   }

   public liliiliiliil lIiiIiIlilli(long remaining, long steps, int epochAdvancedSinceLastPlan, int familyKey, boolean epoch) {
      liliiliiliil var8 = IliIlllilIi(epochAdvancedSinceLastPlan, familyKey, epoch, this.iIlIlllllill(remaining, steps));
      if (var8.liiiIIllIl() == IlililIillililIi.lliIillIIi) {
         this.IilliliilIIi(remaining, steps, var8.iIlIlllllill());
         ++this.IIlliiIIIl;
      } else if (var8.liiiIIllIl() == IlililIillililIi.iliIillIIi) {
         this.IilliliilIIi(remaining, steps, var8.iIlIlllllill());
         ++this.lIlliiIIIl;
      }

      this.iIlliiIIIl = var8;
      return var8;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) << 14) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) << 14) >>> 10) - 6699) ^ var5) ^ var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) << 14) << 6 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) >>> 2 | (char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - 11162) ^ var5) ^ 23630) - var5))) >>> 3) << 14) >>> 10) - 6699) ^ var5) ^ var5) ^ var5) >>> 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2312702628955807608L ^ Long.rotateLeft(560529792912491262L, 33) ^ -8427297648207576345L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4541620075119192653L ^ Long.rotateLeft(2236274293493505973L, 13) ^ -8048096300603687016L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4023353108203271087L ^ Long.rotateLeft(-122942994942205902L, 30) ^ -5534961864133115035L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2829700245299086406L ^ Long.rotateLeft(6032974016435081026L, 60) ^ 4176302779665896227L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5431708409522135949L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -4480552754703525932L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8180782294878361106L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5089916380400309326L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7906749154913261424L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1477057267608739737L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIillIiliIil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Ililllililil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iiilliiliiil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIIilIIiiIIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIillIiilIi<invokedynamic>());
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

   public Set<lIllIIIiiIllIIIi> iIlIlllllill(long epoch, long familyKey) {
      lIlllIliiIlllIli var5 = (lIlllIliiIlllIli)this.iiIliiIIIl.get(epoch);
      return var5 != null && var5.lIIilIllIi == familyKey ? Collections.unmodifiableSet(var5.iIIilIllIi) : Set.of();
   }

   public String Illlllllilll() {
      return Iilllilliill<invokedynamic>() + this.iiIliiIIIl.size() + Iilllilliill<invokedynamic>() + this.IIlliiIIIl + Iilllilliill<invokedynamic>() + this.lIlliiIIIl + Iilllilliill<invokedynamic>() + (this.iIlliiIIIl == null ? Iilllilliill<invokedynamic>() : this.iIlliiIIIl.liiiIIllIl() + (this.iIlliiIIIl.iIlIlllllill() == null ? "" : Iilllilliill<invokedynamic>() + this.iIlliiIIIl.iIlIlllllill()));
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') >>> 14 | (char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') << 2) ^ var5))) ^ 23537) << 4 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') >>> 14 | (char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') << 2) ^ var5))) ^ 23537) >>> 12) - '쿊') << 3 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') >>> 14 | (char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') << 2) ^ var5))) ^ 23537) << 4 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') >>> 14 | (char)((char)((char)(var4[var5] ^ '꽧') + var5) - 'ꂇ') << 2) ^ var5))) ^ 23537) >>> 12) - '쿊') >>> 13) ^ var5) ^ var5) - '돽') - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(long epoch, long s, lIllIIIiiIllIIIi familyKey) {
      if (familyKey != null) {
         lIlllIliiIlllIli var6 = (lIlllIliiIlllIli)this.iiIliiIIIl.get(epoch);
         if (var6 == null) {
            var6 = new lIlllIliiIlllIli(s);
            this.iiIliiIIIl.put(epoch, var6);
         } else if (var6.lIIilIllIi != s) {
            var6.lIIilIllIi = s;
            var6.iIIilIllIi.clear();
         }

         var6.iIIilIllIi.add(familyKey);
      }
   }

   public int IIIllIIliIIl() {
      return this.lIlliiIIIl;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - '\uf290') - 22405) - var5) + var5))) - var5) ^ var5) - var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static {
      liIliiIIIl = new lIllIIIiiIllIIIi[]{lIllIIIiiIllIIIi.lIlIlIliil, lIllIIIiiIllIIIi.iIlIlIliil, lIllIIIiiIllIIIi.IllIlIliil, lIllIIIiiIllIIIi.lllIlIliil, lIllIIIiiIllIIIi.illIlIliil, lIllIIIiiIllIIIi.IilIlIliil, lIllIIIiiIllIIIi.lilIlIliil, lIllIIIiiIllIIIi.iilIlIliil};
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) - 15891))))) - '흍') + var5) + 12450))) - var5) + '멮') + '饕') ^ 27246) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) - 15891))))) - '흍') + var5) + 12450))) - var5) + '멮') + '饕') ^ 27246) << 3) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) - 15891))))) - '흍') + var5) + 12450))) - var5) + '멮') + '饕') ^ 27246) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)((char)(var4[var5] ^ var5) - 15891))))) - '흍') + var5) + 12450))) - var5) + '멮') + '饕') ^ 27246) << 3) >>> 12) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
