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
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public enum iIiiIIlIliiIIl {
   lIlIiiiIliIlIiiiIl(IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), lIillIIiiIillIIi.lIlIIIiiil, IiIlliIliiIl<invokedynamic>()),
   IiIIiiiIlliIIiiiIl(IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), lIillIIiiIillIIi.IIlIIIiiil, IiIlliIliiIl<invokedynamic>()),
   llIIiiiIlilIIiiiIl(IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), lIillIIiiIillIIi.iiIIIIiiil, IiIlliIliiIl<invokedynamic>());

   private final String illIiiiIlIilIiiiIl;
   private final String iIiIiiiIlIliIiiiIl;
   private final String IllIiiiIllllIiiiIl;
   iiIIiiiIlIIlIiiiIl(IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), IiIlliIliiIl<invokedynamic>(), lIillIIiiIillIIi.IIlIIIiiil, IiIlliIliiIl<invokedynamic>());

   private final lIillIIiiIillIIi IIiIiiiIllIiIiiiIl;
   private final String lilIiiiIliilIiiiIl;
   private final String lliIiiiIliliIiiiIl;

   static String IIIllIIliIIl(String s) {
      long var6 = -3023954022204856296L;
      long var8 = 1156581501929611948L;
      StringBuilder var1 = new StringBuilder();
      char[] var2 = iIIiiilIlIiiil.IliIlllilIi(s).toLowerCase(Locale.ROOT).toCharArray();
      var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

      for(long var11 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var11 < (int)(var11 >>> 32); var11 ^= (var11 ^ var11 + (long)1) & -1L >>> 32) {
         var8 ^= ((long)var2[(int)var11] << 32 ^ var8) & -1L << 32;
         if (Character.isLetterOrDigit((char)((int)(var8 >>> 32)))) {
            var1.append((char)((int)(var8 >>> 32)));
         }
      }

      return var1.toString();
   }

   public String lIiiIiIlilli() {
      return this.iIiIiiiIlIliIiiiIl;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - 10694) ^ 19302) - var5))) >>> 13 | (char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - 10694) ^ 19302) - var5))) << 3))) + '釋') ^ var5) ^ var5) + var5) + 15100) << 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - 10694) ^ 19302) - var5))) >>> 13 | (char)(-((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - 10694) ^ 19302) - var5))) << 3))) + '釋') ^ var5) ^ var5) + var5) + 15100) >>> 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1067025740127262741L ^ Long.rotateLeft(4374329523392713375L, 9) ^ -7497975038519589156L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5316725975593503697L ^ Long.rotateLeft(7063696954760519080L, 27) ^ 1443403038027147698L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2548022831060583611L ^ Long.rotateLeft(-245373010337954616L, 6) ^ 2203287008379430844L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1554322405867115604L ^ Long.rotateLeft(-7861137975006408504L, 12) ^ 3921329549419640038L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2122113140501064463L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1565076507540211478L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -180824662520984466L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4515412391666450745L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -3271551857185971626L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 581017351183644555L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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

   public String liiiIIllIl() {
      return this.illIiiiIlIilIiiiIl;
   }

   // $FF: synthetic method
   private static iIiiIIlIliiIIl[] IlIlllIlilIl() {
      return new iIiiIIlIliiIIl[]{llIIiiiIlilIIiiiIl, IiIIiiiIlliIIiiiIl, iiIIiiiIlIIlIiiiIl, lIlIiiiIliIlIiiiIl};
   }

   public static Optional<iIiiIIlIliiIIl> iliIiiliiiii(String displayName) {
      long var6 = -978856825254705174L;
      String var1 = IIIllIIliIIl(displayName);
      if (var1.isEmpty()) {
         return Optional.empty();
      } else {
         iIiiIIlIliiIIl[] var2 = values();
         var6 ^= ((long)var2.length << 32 ^ var6) & -1L << 32;

         for(long var9 = var6 ^ (0L ^ var6) & -1L >>> 32; (int)var9 < (int)(var9 >>> 32); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
            iIiiIIlIliiIIl var5 = var2[(int)var9];
            if (var5.lliIiiiIliliIiiiIl.equals(var1)) {
               return Optional.of(var5);
            }
         }

         return Optional.empty();
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) + '蛰') << 7 | (char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) + '蛰') >>> 9) >>> 9 | (char)((char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) + '蛰') << 7 | (char)((char)((char)(var4[var5] ^ var5) << 4 | (char)(var4[var5] ^ var5) >>> 12) + '蛰') >>> 9) << 7) - var5) + var5) ^ var5) ^ var5))))) - var5) ^ 13970) ^ '\udcd3') + 'Ꚅ'))) ^ '\ud8c2') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIillIIiiIillIIi IilliliilIIi() {
      return this.IIiIiiiIllIiIiiiIl;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') << 5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') << 5) << 15) ^ var5))) + 26170) << 9 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') << 5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') >>> 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 16790) ^ var5) >>> 6 | (char)((char)(var4[var5] ^ 16790) ^ var5) << 10) - '譑') + 16718) + '镉') << 5) << 15) ^ var5))) + 26170) >>> 7) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return this.lilIiiiIliilIiiiIl;
   }

   public String IliIlllilIi() {
      return this.IllIiiiIllllIiiiIl;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] - var5))))) + var5))) + 4874) >>> 10 | (char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] - var5))))) + var5))) + 4874) << 6))))) + var5) << 5 | (char)((char)(~((char)(~((char)((char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] - var5))))) + var5))) + 4874) >>> 10 | (char)((char)(-((char)((char)(-((char)(-((char)(var4[var5] - var5))))) + var5))) + 4874) << 6))))) + var5) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '醎') + 382) + var5) - 17748) + 19139) ^ var5) ^ var5) + var5) ^ 30791) - 17728));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iIiiIIlIliiIIl(String var3, String label, String var5, lIillIIiiIillIIi itemName, String tool) {
      this.IllIiiiIllllIiiiIl = var3;
      this.illIiiiIlIilIiiiIl = label;
      this.lilIiiiIliilIiiiIl = var5;
      this.IIiIiiiIllIiIiiiIl = itemName;
      this.iIiIiiiIlIliIiiiIl = tool;
      this.lliIiiiIliliIiiiIl = IIIllIIliIIl(label);
   }
}
