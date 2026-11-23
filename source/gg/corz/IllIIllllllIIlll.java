package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.jetbrains.annotations.NotNull;

public class IllIIllllllIIlll implements CharSequence, AutoCloseable {
   private final char[] Iiliiiilll;
   private boolean IIiiiiilll = false;
   private final char[] liliiiilll;
   private static final SecureRandom illiiiilll = new SecureRandom();
   private final int iiliiiilll;

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -7074100051105383082L ^ Long.rotateLeft(6641820532588195546L, 5) ^ 3014143175154202495L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5291849509704786429L ^ Long.rotateLeft(-5959057734152068595L, 35) ^ -7778817146307264560L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1741755333935360573L ^ Long.rotateLeft(3369318932920348771L, 61) ^ -6083577431234962580L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -569639011519160594L ^ Long.rotateLeft(-2576324333949817278L, 41) ^ -3318970743663533872L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5887604952673384527L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1540731790225289609L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7913101463913874288L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 969237882466549896L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5771920413584906399L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5020978909636047621L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
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

   public @NotNull String lIiiIiIlilli() {
      this.IIIllIIliIIl();
      return this.toString();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 5791) - '\ue842') ^ var5) - var5) ^ var5) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 5791) - '\ue842') ^ var5) - var5) ^ var5) + var5) << 3))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int hashCode() {
      long var3 = 547583149039587398L;
      this.IIIllIIliIIl();
      var3 ^= (0L ^ var3) & -1L << 32;

      for(var3 ^= (0L ^ var3) & -1L >>> 32; (int)var3 < this.iiliiiilll; var3 ^= (var3 ^ var3 + (long)1) & -1L >>> 32) {
         var3 ^= ((long)(31 * (int)(var3 >>> 32) + this.charAt((int)var3)) << 32 ^ var3) & -1L << 32;
      }

      return (int)(var3 >>> 32);
   }

   private void IIIllIIliIIl() {
      if (this.IIiiiiilll) {
         throw new IllegalStateException(IlIlllIlilIl<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) << 8 | (char)(var4[var5] ^ var5) >>> 8) << 10 | (char)((char)(var4[var5] ^ var5) << 8 | (char)(var4[var5] ^ var5) >>> 8) >>> 6))) + '\uf87d') - var5))) - 1644) - 1195) + var5) + '螜') + var5) + var5) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(var4[var5] ^ var5) << 8 | (char)(var4[var5] ^ var5) >>> 8) << 10 | (char)((char)(var4[var5] ^ var5) << 8 | (char)(var4[var5] ^ var5) >>> 8) >>> 6))) + '\uf87d') - var5))) - 1644) - 1195) + var5) + '螜') + var5) + var5) << 14))) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) >>> 8))) - var5) >>> 15 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) >>> 8))) - var5) << 1) ^ '鷷') ^ '雞') >>> 1 | (char)((char)((char)((char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) >>> 8))) - var5) >>> 15 | (char)((char)(~((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) << 8 | (char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 12 | var4[var5] << 4) + '\uead9') + var5) - var5))))) >>> 8))) - var5) << 1) ^ '鷷') ^ '雞') << 15) - var5) + '\uee49') ^ var5) - var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IllIIllllllIIlll IliIlllilIi(String s) {
      return new IllIIllllllIIlll(s);
   }

   public IllIIllllllIIlll(char[] original, char[] original2) {
      if (original != null && original2 != null) {
         if (original2.length == 0) {
            throw new IllegalArgumentException(IlIlllIlilIl<invokedynamic>());
         } else {
            this.iiliiiilll = original.length;
            this.liliiiilll = Arrays.copyOf(original, original.length);
            this.Iiliiiilll = Arrays.copyOf(original2, original2.length);
         }
      } else {
         throw new IllegalArgumentException(IlIlllIlilIl<invokedynamic>());
      }
   }

   public CharBuffer iliIiiliiiii() {
      long var3 = -2010733045326530934L;
      this.IIIllIIliIIl();
      CharBuffer var1 = CharBuffer.allocate(this.iiliiiilll);

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.iiliiiilll; var5 += 4294967296L) {
         var1.put((int)(var5 >>> 32), this.charAt((int)(var5 >>> 32)));
      }

      var1.flip();
      return var1.asReadOnlyBuffer();
   }

   public boolean equals(Object o) {
      long var3 = 2400275622931706877L;
      this.IIIllIIliIIl();
      if (this == o) {
         return true;
      } else if (!(o instanceof CharSequence)) {
         return false;
      } else if (this.iiliiiilll != ((CharSequence)o).length()) {
         return false;
      } else {
         for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.iiliiiilll; var5 += 4294967296L) {
            if (this.charAt((int)(var5 >>> 32)) != ((CharSequence)o).charAt((int)(var5 >>> 32))) {
               return false;
            }
         }

         return true;
      }
   }

   public @NotNull CharSequence subSequence(int n2, int n) {
      long var7 = 2424222539166086246L;
      this.IIIllIIliIIl();
      if (n2 >= 0 && n <= this.iiliiiilll && n2 <= n) {
         var7 ^= ((long)(n - n2) << 32 ^ var7) & -1L << 32;
         char[] var4 = new char[(int)(var7 >>> 32)];
         System.arraycopy(this.liliiiilll, n2, var4, 0, (int)(var7 >>> 32));
         char[] var5 = new char[(int)(var7 >>> 32)];

         for(var7 ^= (0L ^ var7) & -1L >>> 32; (int)var7 < (int)(var7 >>> 32); var7 ^= (var7 ^ var7 + (long)1) & -1L >>> 32) {
            var5[(int)var7] = this.Iiliiiilll[(n2 + (int)var7) % this.Iiliiiilll.length];
         }

         IilliliilIIi(var4, this.Iiliiiilll, 0, (int)(var7 >>> 32));
         IilliliilIIi(var4, var5, 0, (int)(var7 >>> 32));
         return new IllIIllllllIIlll(var4, var5);
      } else {
         throw new IndexOutOfBoundsException(IlIlllIlilIl<invokedynamic>() + n2 + IlIlllIlilIl<invokedynamic>() + n + IlIlllIlilIl<invokedynamic>() + this.iiliiiilll);
      }
   }

   public int length() {
      this.IIIllIIliIIl();
      return this.iiliiiilll;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 12 | (char)((char)(-var4[var5]) + var5) >>> 4) - var5) - '望') ^ var5) - '꯸') - 10983) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 12 | (char)((char)(-var4[var5]) + var5) >>> 4) - var5) - '望') ^ var5) - '꯸') - 10983) >>> 12) + var5) - var5) ^ 'ꭹ') - var5) ^ '鏕') - var5) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 12 | (char)((char)(-var4[var5]) + var5) >>> 4) - var5) - '望') ^ var5) - '꯸') - 10983) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 12 | (char)((char)(-var4[var5]) + var5) >>> 4) - var5) - '望') ^ var5) - '꯸') - 10983) >>> 12) + var5) - var5) ^ 'ꭹ') - var5) ^ '鏕') - var5) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void close() {
      if (!this.IIiiiiilll) {
         Arrays.fill(this.liliiiilll, '\u0000');
         Arrays.fill(this.Iiliiiilll, '\u0000');
         this.IIiiiiilll = true;
      }

   }

   public char charAt(int n) {
      this.IIIllIIliIIl();
      if (n >= 0 && n < this.iiliiiilll) {
         return (char)(this.liliiiilll[n] ^ this.Iiliiiilll[n % this.Iiliiiilll.length]);
      } else {
         throw new IndexOutOfBoundsException(IlIlllIlilIl<invokedynamic>() + n + IlIlllIlilIl<invokedynamic>() + this.iiliiiilll);
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) << 15))))) + 14210) << 5 | (char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) << 15))))) + 14210) >>> 11) - var5) + var5) << 11 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) << 15))))) + 14210) << 5 | (char)((char)(-((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) >>> 1 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + 'ꟲ') - var5) - var5) + var5))) << 15))))) + 14210) >>> 11) - var5) + var5) >>> 5)) - '싇'))) - 22312));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IllIIllllllIIlll liiiIIllIl(String s, String s2) {
      if (s != null && s2 != null) {
         return new IllIIllllllIIlll(s.toCharArray(), s2.toCharArray());
      } else {
         throw new IllegalArgumentException(IlIlllIlilIl<invokedynamic>());
      }
   }

   public @NotNull String toString() {
      long var3 = -1810747334052347845L;
      this.IIIllIIliIIl();
      char[] var1 = new char[this.iiliiiilll];

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < this.iiliiiilll; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = this.charAt((int)(var5 >>> 32));
      }

      String var2 = new String(var1);
      Arrays.fill(var1, '\u0000');
      return var2;
   }

   private static void IilliliilIIi(char[] n, char[] array, int array2, int n2) {
      long var6 = -8082341363589825852L;

      for(var6 ^= (0L ^ var6) & -1L << 32; (int)(var6 >>> 32) < n2; var6 += 4294967296L) {
         var6 ^= ((long)(array2 + (int)(var6 >>> 32)) ^ var6) & -1L >>> 32;
         n[(int)var6] ^= array[(int)(var6 >>> 32) % array.length];
      }

   }

   private static char[] iIlIlllllill(int n) {
      long var3 = -1484061873934207563L;
      char[] var1 = new char[n];

      for(long var5 = var3 ^ (0L ^ var3) & -1L << 32; (int)(var5 >>> 32) < n; var5 += 4294967296L) {
         var1[(int)(var5 >>> 32)] = (char)illiiiilll.nextInt(65536);
      }

      return var1;
   }

   public IllIIllllllIIlll(String string) {
      if (string == null) {
         throw new IllegalArgumentException(IlIlllIlilIl<invokedynamic>());
      } else {
         this.iiliiiilll = string.length();
         this.Iiliiiilll = iIlIlllllill(Math.min(this.iiliiiilll, 128));
         this.liliiiilll = new char[this.iiliiiilll];
         string.getChars(0, this.iiliiiilll, this.liliiiilll, 0);
         IilliliilIIi(this.liliiiilll, this.Iiliiiilll, 0, this.iiliiiilll);
      }
   }
}
