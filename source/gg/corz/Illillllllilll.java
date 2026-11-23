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
import net.minecraft.class_11719;
import net.minecraft.class_2583;
import net.minecraft.class_5224;
import net.minecraft.class_5251;

final class Illillllllilll implements class_5224 {
   private String lIiIllIIiiIiIllIIi;
   final ArrayList<llllIlllilllIlll> iIlIllIIiIllIllIIi = new ArrayList();
   private class_11719 iilIllIIiIIiIllIIi;
   private int IilIllIIililIllIIi = -1;
   private final StringBuilder lllIllIIiillIllIIi = new StringBuilder(518863853 - -105 + -71 + 91 ^ 518863962);

   void liiiIIllIl() {
      if (this.lllIllIIiillIllIIi.length() != 0) {
         this.iIlIllIIiIllIllIIi.add(new llllIlllilllIlll(this.lllIllIIiillIllIIi.toString(), this.IilIllIIililIllIIi, this.lIiIllIIiiIiIllIIi));
         this.lllIllIIiillIllIIi.setLength(0);
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ 2147))) ^ '캭') ^ var5) - var5) - var5) - 9654))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ 2147))) ^ '캭') ^ var5) - var5) - var5) - 9654))) << 2) - var5) << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ 2147))) ^ '캭') ^ var5) - var5) - var5) - 9654))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ 2147))) ^ '캭') ^ var5) - var5) - var5) - 9654))) << 2) - var5) >>> 8) - 580) - var5))))) + var5) + var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5914316404051289475L ^ Long.rotateLeft(-2083228884351203153L, 21) ^ 2584613704875567803L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -342186892650111149L ^ Long.rotateLeft(-1601115164888813863L, 4) ^ 8978454110462984183L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2171728335837707158L ^ Long.rotateLeft(1920356338955117520L, 41) ^ -1151846130633296690L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7562306429025874082L ^ Long.rotateLeft(-6862811726273317413L, 29) ^ -2826277505957438974L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7960708625152274519L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 898188962782034167L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5016080345011221686L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7737737814924001999L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 9006660530734823473L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -709566167098688524L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') >>> 5) - 19948) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') >>> 5) - 19948) << 14) + '骓') ^ 'ꘒ'))) >>> 3 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') >>> 5) - 19948) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] + '葅') ^ 18367) + var5) ^ var5) - var5) + '\udb61') >>> 5) - 19948) << 14) + '骓') ^ 'ꘒ'))) << 13) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) << 4 | (char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) >>> 12) ^ var5) - var5))) + '\ue84d') >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) << 4 | (char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) >>> 12) ^ var5) - var5))) + '\ue84d') << 6) << 14 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) << 4 | (char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) >>> 12) ^ var5) - var5))) + '\ue84d') >>> 10 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) << 4 | (char)((char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) << 4 | (char)((char)((char)((char)(var4[var5] + 14596) + var5) - 491) ^ var5) >>> 12) >>> 12) ^ var5) - var5))) + '\ue84d') << 6) >>> 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) << 7)))) >>> 15 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) << 7)))) << 1) + '鹰') - var5) - '뢣') >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) << 7)))) >>> 15 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) >>> 9 | (char)((char)((char)((char)(var4[var5] ^ 14134) + var5) - 1911) + var5) << 7)))) << 1) + '鹰') - var5) - '뢣') << 14) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) >>> 12) + 28106) ^ 29212))) ^ '\ue760') + '鸰') ^ '쳮') << 12 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) >>> 12) + 28106) ^ 29212))) ^ '\ue760') + '鸰') ^ '쳮') >>> 4) << 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) >>> 12) + 28106) ^ 29212))) ^ '\ue760') + '鸰') ^ '쳮') << 12 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) << 4 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + 6728) - var5) ^ var5) - var5) + var5) - var5) >>> 12) + 28106) ^ 29212))) ^ '\ue760') + '鸰') ^ '쳮') >>> 4) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean accept(int codePoint, class_2583 index, int style) {
      long var7 = -8781446073727787267L;
      class_5251 var4 = index.method_10973();
      var7 ^= ((long)(var4 == null ? -1 : var4.method_27716() & (~-335636606 * 117 * -1594008481 ^ 1289189568)) << 32 ^ var7) & -1L << 32;
      class_11719 var6 = index.method_27708();
      if (this.lllIllIIiillIllIIi.length() > 0 && ((int)(var7 >>> 32) != this.IilIllIIililIllIIi || !var6.equals(this.iilIllIIiIIiIllIIi))) {
         this.liiiIIllIl();
      }

      if (this.lllIllIIiillIllIIi.length() == 0) {
         this.IilIllIIililIllIIi = (int)(var7 >>> 32);
         if (!var6.equals(this.iilIllIIiIIiIllIIi)) {
            this.iilIllIIiIIiIllIIi = var6;
            this.lIiIllIIiiIiIllIIi = iIlIlllllill(var6);
         }
      }

      this.lllIllIIiillIllIIi.appendCodePoint(style);
      return true;
   }

   private Illillllllilll() {
   }

   private static String iIlIlllllill(class_11719 f) {
      if (f instanceof class_11719.class_11721 var2) {
         return var2.comp_4590().toString();
      } else if (f instanceof class_11719.class_11720 var1) {
         return IilliliilIIi<invokedynamic>() + var1.comp_4588() + IilliliilIIi<invokedynamic>() + var1.comp_4589();
      } else {
         return IilliliilIIi<invokedynamic>();
      }
   }

   void IliIlllilIi() {
      this.iIlIllIIiIllIllIIi.clear();
      this.lllIllIIiillIllIIi.setLength(0);
      this.IilIllIIililIllIIi = -1;
      this.iilIllIIiIIiIllIIi = null;
      this.lIiIllIIiiIiIllIIi = null;
   }
}
