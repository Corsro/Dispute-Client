package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.BitSet;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IliliiIllliliiIl {
   public static final byte IlIlilIlll = 2;
   private int IIllilIlll;
   private final byte[] IiIlilIlll;
   public static final byte lIIlilIlll = 0;
   private final BitSet liIlilIlll;
   private int iiIlilIlll;
   public static final byte iIIlilIlll = 1;
   private int lIllilIlll;
   public static final byte ilIlilIlll = 4;
   public static final byte llIlilIlll = 3;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - var5) ^ var5))) ^ var5))) + 26043) ^ 25066) ^ 2151) ^ 7654) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - var5) ^ var5))) ^ var5))) + 26043) ^ 25066) ^ 2151) ^ 7654) + var5) + var5) << 13))) << 7 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - var5) ^ var5))) ^ var5))) + 26043) ^ 25066) ^ 2151) ^ 7654) + var5) + var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) - var5) ^ var5))) ^ var5))) + 26043) ^ 25066) ^ 2151) ^ 7654) + var5) + var5) << 13))) >>> 9) + 22406) + 18783) ^ '왬') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IliliiIllliliiIl(int cells) {
      this.IiIlilIlll = new byte[cells];
      this.liIlilIlll = new BitSet(cells);
      this.liIlilIlll.set(0, cells);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6785263453316220712L ^ Long.rotateLeft(-4722761583598640374L, 24) ^ -4420660153920898559L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5386877927017069226L ^ Long.rotateLeft(-6969656467609549452L, 11) ^ -2106780741493623271L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3520801699204939623L ^ Long.rotateLeft(6486547709261930150L, 50) ^ 161202583150993589L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3239727844390985926L ^ Long.rotateLeft(-5027648546800110003L, 24) ^ 6715444291111168259L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4284632247002223091L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3589718161910777969L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -9070760867158550215L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2781462965479128561L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -300559928024236482L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -5594603749280319312L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Ililllililil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iiilliiliiil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIilIIiiIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIillIiilIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIiliIiiiIi<invokedynamic>());
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
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) << 12 | (char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) >>> 4) ^ '\ua954') >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) << 12 | (char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) >>> 4) ^ '\ua954') << 15) + var5) ^ var5))))) << 14 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) << 12 | (char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) >>> 4) ^ '\ua954') >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) << 12 | (char)(-((char)((char)((char)((char)(-var4[var5])) << 1 | (char)((char)(-var4[var5])) >>> 15) - 21770))) >>> 4) ^ '\ua954') << 15) + var5) ^ var5))))) >>> 2))))) ^ 19128) ^ 13167));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int Illlllllilll() {
      return this.liIlilIlll.cardinality();
   }

   public int IIlllIlliIll() {
      return this.lIllilIlll;
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)(-((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5))) ^ '覐'))) << 4 | (char)(~((char)((char)((char)((char)(var4[var5] - var5))) ^ '覐'))) >>> 12))) + var5) ^ '鄙') - var5) + 19376) ^ 8936))) ^ 14170) - '쩔'))))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String Iilllilliill() {
      return IIillIiliIil<invokedynamic>() + this.iiIlilIlll + IIillIiliIil<invokedynamic>() + this.IIllilIlll + IIillIiliIil<invokedynamic>() + this.lIllilIlll;
   }

   public boolean IilliliilIIi(int i) {
      return !this.liIlilIlll.get(i) && this.IiIlilIlll[i] != 0;
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) >>> 1 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) << 15))) << 4 | (char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) >>> 1 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) << 15))) >>> 12) ^ 32303) >>> 13 | (char)((char)((char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) >>> 1 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) << 15))) << 4 | (char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) >>> 1 | (char)(-((char)((char)(~((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) << 11 | (char)((char)((char)(~((char)(~((char)((char)((char)(-var4[var5]) ^ 550) >>> 15 | (char)((char)(-var4[var5]) ^ 550) << 1))))) + var5) - var5) >>> 5) + 18340))) ^ var5))) << 15))) >>> 12) ^ 32303) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIlIlllllill() {
      this.liIlilIlll.set(0, this.IiIlilIlll.length);
   }

   public int IliIlllilIi() {
      return this.IiIlilIlll.length;
   }

   public void liiiIIllIl(int i) {
      if (i >= 0 && i < this.IiIlilIlll.length && !this.liIlilIlll.get(i)) {
         this.liIlilIlll.set(i);
         ++this.lIllilIlll;
      }

   }

   public byte lIiiIiIlilli(int i) {
      ++this.iiIlilIlll;
      return this.IiIlilIlll[i];
   }

   public int IlIlllIlilIl() {
      return this.iiIlilIlll;
   }

   public void IIIllIIliIIl(int c, byte i) {
      this.IiIlilIlll[c] = i;
      this.liIlilIlll.clear(c);
      ++this.IIllilIlll;
   }

   public int IiIlliIliiIl() {
      return this.IIllilIlll;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '\udb03') << 10 | (char)(var4[var5] - '\udb03') >>> 6) ^ var5))) - 9514) + var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - '\udb03') << 10 | (char)(var4[var5] - '\udb03') >>> 6) ^ var5))) - 9514) + var5) << 8) << 3 | (char)((char)((char)((char)(~((char)((char)((char)(var4[var5] - '\udb03') << 10 | (char)(var4[var5] - '\udb03') >>> 6) ^ var5))) - 9514) + var5) >>> 8 | (char)((char)((char)(~((char)((char)((char)(var4[var5] - '\udb03') << 10 | (char)(var4[var5] - '\udb03') >>> 6) ^ var5))) - 9514) + var5) << 8) >>> 13) ^ 13224) - var5) ^ var5)))) ^ 2004) - var5))))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public byte iliIiiliiiii(int i) {
      return this.IiIlilIlll[i];
   }
}
