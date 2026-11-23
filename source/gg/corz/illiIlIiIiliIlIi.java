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
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.LongSupplier;
import java.util.function.LongUnaryOperator;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class illiIlIiIiliIlIi {
   public static final int iIiIiIIIIi = 3;
   private int IlIliIIIIi;
   private int iIIliIIIIi;
   private final Map<Long, liiIliliiiIlil> liiIiIIIIi = new LinkedHashMap();
   public static final int iilIiIIIIi = 0;
   public static final int lIiIiIIIIi = 2;
   public static final int iliIiIIIIi = 6;
   private final Map<String, Integer> iiiIiIIIIi = new HashMap();
   public static final int IIiIiIIIIi = 1;
   private String IIIliIIIIi = "";
   public static final int lliIiIIIIi = 5;
   private int lIIliIIIIi;
   private static final String[] IiiIiIIIIi = new String[]{IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>(), IiIiliIiiiIi<invokedynamic>()};
   public static final int IliIiIIIIi = 4;

   private boolean IIIllIIliIIl(long why, String region) {
      this.liiIiIIIIi.remove(why);
      this.IIIliIIIIi = region;
      ++this.iIIliIIIIi;
      this.iiiIiIIIIi.merge(region, 1, Integer::sum);
      return false;
   }

   public liiIliliiiIlil Iiilliiliiil(long region) {
      return (liiIliliiiIlil)this.liiIiIIIIi.get(region);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7216163893217259955L ^ Long.rotateLeft(-2822404807881723548L, 13) ^ 7535818228608193803L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7634376499953610064L ^ Long.rotateLeft(2235250554428383305L, 8) ^ 466506402794330521L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -209007900599434112L ^ Long.rotateLeft(-362829388894628625L, 14) ^ -5884415521838208900L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8993676648954076911L ^ Long.rotateLeft(8636930526929805423L, 33) ^ 761964852187687684L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5714492217360505663L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -9079293707677884483L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8715186310753085991L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -7120564926152449243L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4803766749114326785L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4131850044800237425L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   public int Illlllllilll() {
      return this.iIIliIIIIi;
   }

   public int IIlllIlliIll() {
      return this.lIIliIIIIi;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 7 | (char)(var4[var5] ^ var5) << 9)))) + var5) ^ 16741))))) >>> 8 | (char)(~((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 7 | (char)(var4[var5] ^ var5) << 9)))) + var5) ^ 16741))))) << 8) - var5) - var5))) ^ 10222) + var5) - var5) - '貦'));
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
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '\uda28') - var5))) << 13 | (char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '\uda28') - var5))) >>> 3) << 11 | (char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '\uda28') - var5))) << 13 | (char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '\uda28') - var5))) >>> 3) >>> 5) ^ '镩') - 22936))) + var5) + '錰'))) + '풴') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(long targets, ilIllIllIiIllIll reason, long[] tick, long[] targetSigs, int side, String regionRev, int region, long ctx) {
      liiIliliiiIlil var11 = (liiIliliiiIlil)this.liiIiIIIIi.get(targets);
      if (var11 != null && var11.iiIliiiIiIIlliiiIi.equals(reason)) {
         var11.illliiiIiIilliiiIi |= 1 << side;
         var11.iIiliiiIiIliliiiIi = ctx;
         ++this.IlIliIIIIi;
      } else {
         this.liiIiIIIIi.put(targets, new liiIliliiiIlil(targets, reason, (long[])(([J)tick).clone(), (long[])(([J)targetSigs).clone(), 1 << side, regionRev, region, ctx));
         ++this.lIIliIIIIi;
      }
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) >>> 10))) + var5))) - var5))) << 10 | (char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) >>> 10))) + var5))) - var5))) >>> 6) - var5) + '\udf55') + 2531) << 14 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) >>> 10))) + var5))) - var5))) << 10 | (char)(~((char)((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) << 6 | (char)((char)((char)(var4[var5] - var5) >>> 10 | (char)(var4[var5] - var5) << 6) + var5) >>> 10))) + var5))) - var5))) >>> 6) - var5) + '\udf55') + 2531) >>> 2) ^ var5) + 27113) ^ 117) ^ '詋'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iliIiiliiiii(long region) {
      if (this.liiIiIIIIi.containsKey(region)) {
         this.IIIllIIliIIl(region, IiIiliIiiiIi<invokedynamic>());
      }

   }

   public Collection<liiIliliiiIlil> Ililllililil() {
      return this.liiIiIIIIi.values();
   }

   public Map<String, Integer> IIillIiliIil() {
      return this.iiiIiIIIIi;
   }

   public String IIIilIIiiIIi() {
      if (this.liiIiIIIIi.isEmpty()) {
         return IiIiliIiiiIi<invokedynamic>();
      } else {
         ArrayList var1 = new ArrayList();

         for(liiIliliiiIlil var3 : this.liiIiIIIIi.values()) {
            var1.add(var3.IliIlllilIi());
         }

         return String.join(IiIiliIiiiIi<invokedynamic>(), var1);
      }
   }

   public int IiIlliIliiIl() {
      return this.liiIiIIIIi.size();
   }

   public static boolean iIlIlllllill(lIilIIIliIilIIIl c) {
      return c == lIilIIIliIilIIIl.iIilIIllIl;
   }

   public String IlIlllIlilIl() {
      return this.IIIliIIIIi;
   }

   public int Iilllilliill() {
      return this.IlIliIIIIi;
   }

   public void IlIillIiilIi() {
      this.liiIiIIIIi.clear();
   }

   public static String IliIlllilIi(int side) {
      return side >= 0 && side < IiiIiIIIIi.length ? IiiIiIIIIi[side] : IiIiliIiiiIi<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '辆') ^ '骟') ^ var5) + var5) + var5) ^ var5) + var5) - 14742) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '辆') ^ '骟') ^ var5) + var5) + var5) ^ var5) + var5) - 14742) + var5) << 3) - 16942) - var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - var5) - '腵') ^ var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - var5) - '腵') ^ var5) ^ var5) >>> 10) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - var5) - '腵') ^ var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) ^ var5) - var5) - '腵') ^ var5) ^ var5) >>> 10) << 11))) - '齋'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli(long now, ilIllIllIiIllIll sigOf, int region, LongSupplier side, LongUnaryOperator regionRevNow) {
      long var11 = 1627745855025295603L;
      liiIliliiiIlil var7 = (liiIliliiiIlil)this.liiIiIIIIi.get(now);
      if (var7 == null) {
         return false;
      } else if (var7.iiIliiiIiIIlliiiIi.liiiIIllIl() == sigOf.liiiIIllIl() && var7.iiIliiiIiIIlliiiIi.iIlIlllllill() == sigOf.iIlIlllllill()) {
         if (var7.iiIliiiIiIIlliiiIi.IilliliilIIi() != sigOf.IilliliilIIi()) {
            return this.IIIllIIliIIl(now, IiIiliIiiiIi<invokedynamic>());
         } else if (var7.iiIliiiIiIIlliiiIi.lIiiIiIlilli() != sigOf.lIiiIiIlilli()) {
            return this.IIIllIIliIIl(now, IiIiliIiiiIi<invokedynamic>());
         } else if ((var7.illliiiIiIilliiiIi & 1 << region) == 0) {
            return false;
         } else {
            long var8 = side.getAsLong();
            if (var8 != var7.iIiliiiIiIliliiiIi) {
               for(long var13 = var11 ^ (0L ^ var11) & -1L << 32; (int)(var13 >>> 32) < var7.lIlliiiIiiIlliiiIi.length; var13 += 4294967296L) {
                  if (regionRevNow.applyAsLong(var7.lIlliiiIiiIlliiiIi[(int)(var13 >>> 32)]) != var7.IllliiiIilllliiiIi[(int)(var13 >>> 32)]) {
                     return this.IIIllIIliIIl(now, IiIiliIiiiIi<invokedynamic>());
                  }
               }

               var7.iIiliiiIiIliliiiIi = var8;
            }

            return true;
         }
      } else {
         return this.IIIllIIliIIl(now, IiIiliIiiiIi<invokedynamic>());
      }
   }

   public static int liiiIIllIl(int fz, int tx, int fy, int tz, int fx, int ty) {
      long var16 = 380994545792774487L;
      long var12 = -1087531584467979650L;
      long var14 = -965598209267976333L;
      var12 ^= ((long)(tz - fz) << 32 ^ var12) & -1L << 32;
      var12 ^= ((long)(fx - tx) ^ var12) & -1L >>> 32;
      var14 ^= ((long)(ty - fy) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)Math.abs((int)(var12 >>> 32)) ^ var14) & -1L >>> 32;
      var16 ^= ((long)Math.abs((int)var12) << 32 ^ var16) & -1L << 32;
      var16 ^= ((long)Math.abs((int)(var14 >>> 32)) ^ var16) & -1L >>> 32;
      if ((int)var14 <= 2 && (int)(var16 >>> 32) <= 2 && (int)var16 <= 2) {
         return 6;
      } else if ((int)(var16 >>> 32) > (int)var14 && (int)(var16 >>> 32) > (int)var16) {
         return (int)var12 > 0 ? 4 : 5;
      } else if ((int)var14 >= (int)var16) {
         return (int)(var12 >>> 32) > 0 ? 0 : 1;
      } else {
         return (int)(var14 >>> 32) > 0 ? 2 : 3;
      }
   }
}
