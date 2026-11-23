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
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class llIIliilIIli {
   public final int[] IIliilIIllIliilIIl;
   private static final int IlIiilIIlllIiilIIl = 2;
   private final List<iIlIliilIllIliil> lIiiilIIliIiiilIIl;
   public final int liIiilIIliiIiilIIl;
   private int IiliilIIlliliilIIl;
   final iIlIliilIllIliil IliiilIIllliiilIIl;
   public final boolean iIliilIIlIlliilIIl;
   private int iiliilIIlIIiiilIIl;
   public final int ilIiilIIlIiIiilIIl;
   private int llliilIIlilliilIIl;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8210412979960794842L ^ Long.rotateLeft(-4157224224924882594L, 60) ^ 7021368143194089976L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4942231300430235374L ^ Long.rotateLeft(5283277990582687083L, 45) ^ 5090419686603246619L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2628919604600931861L ^ Long.rotateLeft(1337935403946720746L, 53) ^ -8967515240855604841L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1985669866804339266L ^ Long.rotateLeft(-6029046554728601460L, 56) ^ 5407801961937493444L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2814008024870918393L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2477362871507665005L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5234602946578353348L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7082295402487318071L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1871748681894737139L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2218782488915838401L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)(~((char)(var4[var5] ^ 8908))) << 15 | (char)(~((char)(var4[var5] ^ 8908))) >>> 1))) + var5) << 8 | (char)((char)(-((char)((char)(~((char)(var4[var5] ^ 8908))) << 15 | (char)(~((char)(var4[var5] ^ 8908))) >>> 1))) + var5) >>> 8) - var5) ^ 8703))))) + '袡') + 10361) + var5) - '鎰') - 258))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   void iIlIlllllill() {
      if (!this.iIliilIIlIlliilIIl) {
         for(iIlIliilIllIliil var2 : this.lIiiilIIliIiiilIIl) {
            this.IilliliilIIi(var2);
         }

      }
   }

   public llIIliilIIli(int height, int width) {
      this(height, width, false);
   }

   private void IilliliilIIi(iIlIliilIllIliil r) {
      long var6 = -7865418754313131567L;
      long var8 = 6186609970579735459L;

      for(long var10 = var6 ^ ((long)(r.lIiilIilil - 2) << 32 ^ var6) & -1L << 32; (int)(var10 >>> 32) < r.lIiilIilil + r.IliilIilil + 2; var10 += 4294967296L) {
         if ((int)(var10 >>> 32) >= 0 && (int)(var10 >>> 32) < this.liIiilIIliiIiilIIl) {
            var10 ^= ((long)Math.max(r.lIiilIilil, Math.min(r.lIiilIilil + r.IliilIilil - 1, (int)(var10 >>> 32))) ^ var10) & -1L >>> 32;

            for(var8 ^= ((long)(r.IIiilIilil - 2) << 32 ^ var8) & -1L << 32; (int)(var8 >>> 32) < r.IIiilIilil + r.iIiilIilil + 2; var8 += 4294967296L) {
               if ((int)(var8 >>> 32) >= 0 && (int)(var8 >>> 32) < this.ilIiilIIlIiIiilIIl && ((int)(var8 >>> 32) < r.IIiilIilil || (int)(var8 >>> 32) >= r.IIiilIilil + r.iIiilIilil || (int)(var10 >>> 32) < r.lIiilIilil || (int)(var10 >>> 32) >= r.lIiilIilil + r.IliilIilil)) {
                  var8 ^= ((long)Math.max(r.IIiilIilil, Math.min(r.IIiilIilil + r.iIiilIilil - 1, (int)(var8 >>> 32))) ^ var8) & -1L >>> 32;
                  this.IIliilIIllIliilIIl[(int)(var10 >>> 32) * this.ilIiilIIlIiIiilIIl + (int)(var8 >>> 32)] = this.IIliilIIllIliilIIl[(int)var10 * this.ilIiilIIlIiIiilIIl + (int)var8];
               }
            }
         }
      }

   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) << 11))) - '都'))) << 5 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) << 11))) - '都'))) >>> 11))))))) << 4 | (char)(~((char)(-((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) << 11))) - '都'))) << 5 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) >>> 5 | (char)((char)((char)((char)((char)(var4[var5] + 'ꃭ') ^ 19481) + '쁧') - 18846) - var5) << 11))) - '都'))) >>> 11))))))) >>> 12));
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
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)(~var4[var5]))) ^ var5))) ^ var5))) ^ var5) ^ var5))) ^ var5) ^ var5) + var5))))) - 30156))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   llIIliilIIli(int width, int height, boolean dry) {
      this.llliilIIlilliilIIl = 2;
      this.IiliilIIlliliilIIl = 2;
      this.lIiiilIIliIiiilIIl = new ArrayList();
      this.ilIiilIIlIiIiilIIl = width;
      this.liIiilIIliiIiilIIl = height;
      this.iIliilIIlIlliilIIl = dry;
      this.IIliilIIllIliilIIl = dry ? new int[0] : new int[width * height];
      this.IliiilIIllliiilIIl = this.IliIlllilIi(4, 4);
      this.IliiilIIllliiilIIl.IliIlllilIi().IilliliilIIi(-1);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) - var5) ^ var5))) >>> 15 | (char)(~((char)((char)((char)((char)(var4[var5] ^ var5) + var5) - var5) ^ var5))) << 1) + 1491) - 25220) - 6283) ^ var5) + 19962))) - var5)))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int liiiIIllIl() {
      return this.IiliilIIlliliilIIl + this.iiliilIIlIIiiilIIl + 2;
   }

   public iIlIliilIllIliil IliIlllilIi(int w, int h) {
      if (w >= 1 && h >= 1) {
         if (w + 4 <= this.ilIiilIIlIiIiilIIl && h + 4 <= this.liIiilIIliiIiilIIl) {
            if (this.llliilIIlilliilIIl + w + 2 > this.ilIiilIIlIiIiilIIl) {
               this.llliilIIlilliilIIl = 2;
               this.IiliilIIlliliilIIl += this.iiliilIIlIIiiilIIl + 4;
               this.iiliilIIlIIiiilIIl = 0;
            }

            if (this.IiliilIIlliliilIIl + h + 2 > this.liIiilIIliiIiilIIl) {
               throw new IllegalStateException(lIiiIiIlilli<invokedynamic>() + this.ilIiilIIlIiIiilIIl + lIiiIiIlilli<invokedynamic>() + this.liIiilIIliiIiilIIl + lIiiIiIlilli<invokedynamic>());
            } else {
               iIlIliilIllIliil var3 = new iIlIliilIllIliil(this, this.llliilIIlilliilIIl, this.IiliilIIlliliilIIl, w, h);
               this.lIiiilIIliIiiilIIl.add(var3);
               this.llliilIIlilliilIIl += w + 4;
               this.iiliilIIlIIiiilIIl = Math.max(this.iiliilIIlIIiiilIIl, h);
               return var3;
            }
         } else {
            throw new IllegalStateException(lIiiIiIlilli<invokedynamic>() + w + lIiiIiIlilli<invokedynamic>() + h + lIiiIiIlilli<invokedynamic>() + this.ilIiilIIlIiIiilIIl + lIiiIiIlilli<invokedynamic>() + this.liIiilIIliiIiilIIl);
         }
      } else {
         throw new IllegalArgumentException(lIiiIiIlilli<invokedynamic>() + w + lIiiIiIlilli<invokedynamic>() + h);
      }
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) ^ '\uf606') + 10028) >>> 15 | (char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) ^ '\uf606') + 10028) << 1) - var5) ^ 6538) ^ var5)) + 24531) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) ^ '\uf606') + 10028) >>> 15 | (char)((char)((char)((char)((char)(~var4[var5]) ^ var5) ^ var5) ^ '\uf606') + 10028) << 1) - var5) ^ 6538) ^ var5)) + 24531) >>> 4) + var5) - var5) + var5))) + '폔')));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
