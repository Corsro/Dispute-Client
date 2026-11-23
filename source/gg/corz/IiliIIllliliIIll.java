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
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record IiliIIllliliIIll(long target, int disabledMask, String schematicBlockState) {
   private final long lillIlllll;
   public static final int iIilIlllll = 511;
   private final String IIilIlllll;
   public static final int lIilIlllll = 9;
   private final int iillIlllll;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5))))) - var5) ^ var5) + '캦') ^ '띱') ^ 7547) ^ 4689) ^ 22404) ^ var5) ^ 4987))) - var5) + '\ue326') ^ '詉'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') >>> 9) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') >>> 9) - var5) << 4) - '鑖') - 26669) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') >>> 9) - var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') << 7 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) >>> 9 | (char)((char)((char)((char)(var4[var5] - var5) + '茵') >>> 11 | (char)((char)(var4[var5] - var5) + '茵') << 5) + 31107) << 7) ^ '씥') + 14420) - '\uea10') >>> 9) - var5) << 4) - '鑖') - 26669) << 13))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int IliIlllilIi(int[] disabledSlots) {
      long var6 = 6953503102544094929L;
      long var8 = 2531543273512028244L;
      var6 ^= (0L ^ var6) & -1L << 32;
      if (disabledSlots != null) {
         int[] var2 = disabledSlots;
         var6 ^= ((long)disabledSlots.length ^ var6) & -1L >>> 32;

         for(var8 ^= (0L ^ var8) & -1L << 32; (int)(var8 >>> 32) < (int)var6; var8 += 4294967296L) {
            var8 ^= ((long)var2[(int)(var8 >>> 32)] ^ var8) & -1L >>> 32;
            if ((int)var8 >= 0 && (int)var8 < 9) {
               var6 ^= ((long)((int)(var6 >>> 32) | 1 << (int)var8) << 32 ^ var6) & -1L << 32;
            }
         }
      }

      return (int)(var6 >>> 32);
   }

   public static String iliIiiliiiii(int mask) {
      long var3 = -6309950885718897733L;
      StringBuilder var1 = new StringBuilder();

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
         if ((int)(var5 >>> 32) > 0 && (int)(var5 >>> 32) % 3 == 0) {
            var1.append('/');
         }

         var1.append((char)(IilliliilIIi(mask, (int)(var5 >>> 32)) ? '#' : '.'));
      }

      return var1.toString();
   }

   public String IIIllIIliIIl() {
      return Illlllllilll<invokedynamic>() + llIiIiililIiIiil.IlIlllIlilIl(this.lillIlllll) + Illlllllilll<invokedynamic>() + iliIiiliiiii(this.iillIlllll) + Illlllllilll<invokedynamic>() + this.IIilIlllll;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ '듫') << 15 | (char)((char)((char)(var4[var5] ^ var5) ^ var5) ^ '듫') >>> 1) + var5) - var5) + var5) + 'ꔑ')) + var5))) + '靮') + var5))) - '谨') ^ '蛡') - 14818));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int liiiIIllIl(boolean[] disabled) {
      long var3 = -282766659593793247L;
      var3 ^= (0L ^ var3) & -1L << 32;
      if (disabled != null) {
         for(var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < Math.min(9, disabled.length); var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
            if (disabled[(int)var3]) {
               var3 ^= ((long)((int)(var3 >>> 32) | 1 << (int)var3) << 32 ^ var3) & -1L << 32;
            }
         }
      }

      return (int)(var3 >>> 32);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) >>> 7 | (char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) << 9) ^ '\uf78b') + var5) >>> 15 | (char)((char)((char)((char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) >>> 7 | (char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) << 9) ^ '\uf78b') + var5) << 1) - var5) >>> 1 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) >>> 7 | (char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) << 9) ^ '\uf78b') + var5) >>> 15 | (char)((char)((char)((char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) >>> 7 | (char)(~((char)(var4[var5] >>> 11 | var4[var5] << 5))) << 9) ^ '\uf78b') + var5) << 1) - var5) << 15) - var5) - 28028) ^ var5) ^ '飯') + var5) - '颠'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IlIlllIlilIl() {
      return this.lillIlllll;
   }

   public static int[] lIiiIiIlilli(int current, int desired) {
      return iIlIlllllill((current ^ desired) & 511);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1481546859226923405L ^ Long.rotateLeft(-5533763497689175493L, 12) ^ -7436379035706039458L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -559273211864410256L ^ Long.rotateLeft(-5745493070470321876L, 10) ^ 1768147843084206695L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8695873739363197084L ^ Long.rotateLeft(3452902964273191575L, 55) ^ -6562692015930995220L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2336567125083985897L ^ Long.rotateLeft(3061245778567809263L, 29) ^ -5929291607715367604L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -620326876421848776L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3028160754773404938L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3784620703047989523L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -4999075644276054821L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4096459268959172815L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7682171579234391597L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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

   public IiliIIllliliIIll(long schematicBlockState, int disabledMask, String target) {
      this.lillIlllll = schematicBlockState;
      this.iillIlllll = disabledMask;
      this.IIilIlllll = target;
   }

   public static int[] iIlIlllllill(int mask) {
      long var3 = -3837934522338355088L;
      ArrayList var1 = new ArrayList();

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < 9; var5 += 4294967296L) {
         if ((mask & 1 << (int)(var5 >>> 32)) != 0) {
            var1.add((int)(var5 >>> 32));
         }
      }

      return var1.stream().mapToInt(Integer::intValue).toArray();
   }

   public int IiIlliIliiIl() {
      return this.iillIlllll;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 'ꀯ') ^ var5) - var5) - '콃') ^ 3862) ^ 20139) + var5) ^ 4724) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 'ꀯ') ^ var5) - var5) - '콃') ^ 3862) ^ 20139) + var5) ^ 4724) >>> 6))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIlllIlliIll() {
      return this.IIilIlllll;
   }

   public static boolean IilliliilIIi(int mask, int slot) {
      return (mask & 1 << slot) != 0;
   }
}
