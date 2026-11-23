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

public class ilIlilIiIlil extends ilIllIiIll {
   private static final float Illlillillllilli = 2.2222222E-9F;
   private long IlIiillillIiilli = -1L;
   private static ilIlilIiIlil Iiililliliililli;
   private float IIliillilIliilli;
   private float iIliilliIlliilli;
   private static final double illlilliIillilli = 0.16;
   private float ilIiilliIiIiilli = -1.0F;
   private final iilliIlIIiliIl lillilliiillilli = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 70, 0, 100);
   private final iiIiiilIIliiil IIilillilIililli = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private float iiililliIIIiilli;
   private final iilliIlIIiliIl llililliilililli = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 70, 0, 100);
   private long lIIiilliiIIiilli = -1L;
   private final iilliIlIIiliIl iIililliIlililli = new iilliIlIIiliIl(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), 55, 0, 100);
   private float liIiilliiiIiilli;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-var4[var5]) + var5) - var5) + var5))))) ^ var5) - var5)) << 2 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)(-var4[var5]) + var5) - var5) + var5))))) ^ var5) - var5)) >>> 14) - '駮') + 9558) ^ 18602))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static ilIlilIiIlil iiiIlIIIll() {
      ilIlilIiIlil var0 = Iiililliliililli;
      return var0 != null ? var0 : (ilIlilIiIlil)llilIllililIll.iliIiiliiiii(ilIlilIiIlil.class);
   }

   public void IlIllllIll(long now) {
      float var3 = (float)this.lillilliiillilli.Iilllilliill() / 100.0F;
      float var4 = (float)this.iIililliIlililli.Iilllilliill() / 100.0F;
      float var5 = (float)this.llililliilililli.Iilllilliill() / 100.0F;
      IiIliIllliIliIll var6 = IiIliIllliIliIll.iiiIlIIIll();
      float var7 = this.IIilillilIililli.Iilllilliill() && var6 != null ? var6.lIIlliIIll() : 0.0F;
      if (!(this.ilIiilliIiIiilli < 0.0F) && this.IlIiillillIiilli >= 0L) {
         double var8 = Math.max((double)0.0F, Math.min((double)(now - this.IlIiillillIiilli) / (double)1.0E9F, (double)0.25F));
         this.IlIiillillIiilli = now;
         float var10 = (float)((double)1.0F - Math.exp(-var8 / 0.16));
         this.ilIiilliIiIiilli += (var3 - this.ilIiilliIiIiilli) * var10;
         this.liIiilliiiIiilli += (var4 - this.liIiilliiiIiilli) * var10;
         this.IIliillilIliilli += (var5 - this.IIliillilIliilli) * var10;
         this.iIliilliIlliilli += (var7 - this.iIliilliIlliilli) * var10;
         if (Math.abs(var7 - this.iIliilliIlliilli) < 0.002F) {
            this.iIliilliIlliilli = var7;
         }

      } else {
         this.ilIiilliIiIiilli = var3;
         this.liIiilliiiIiilli = var4;
         this.IIliillilIliilli = var5;
         this.iIliilliIlliilli = var7;
         this.IlIiillillIiilli = now;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') >>> 15 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') << 1) << 13 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') >>> 15 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') << 1) >>> 3) >>> 4 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') >>> 15 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') << 1) << 13 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') >>> 15 | (char)((char)(~((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) << 14 | (char)((char)(var4[var5] << 15 | var4[var5] >>> 1) - 8261) >>> 2) ^ var5))) ^ var5) - 10877))) + 17317))) + '褡') << 1) >>> 3) << 12) - var5) ^ '贁'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iilililiiili() {
      this.lIIiilliiIIiilli = System.nanoTime();
   }

   public void Illillliilli() {
      this.lIIiilliiIIiilli = System.nanoTime();
   }

   public float liIlliiIll() {
      return this.liIiilliiiIiilli;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -228075335051458844L ^ Long.rotateLeft(1648715153498932836L, 31) ^ -4857862951444592061L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8324900616816439362L ^ Long.rotateLeft(-3706840941987394746L, 6) ^ 4910889766136262828L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -8483890151504495201L ^ Long.rotateLeft(-6534658386858458200L, 23) ^ -7383109045649654660L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 8122042923782374309L ^ Long.rotateLeft(1144750329601683758L, 30) ^ 5692960023722520298L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3434286207333109829L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6248490316847330974L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 147655322012882871L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4631752518964428555L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6493202529938521828L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -787766053070771718L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(liiiIIllIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iIlIlllllill<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IilliliilIIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(iliIiiliiiii<invokedynamic>());
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

   public float lIIlliIIll(long now) {
      long var7 = 7031783988989714037L;
      if (this.lIIiilliiIIiilli < (-7287795307340467508L ^ -7287795307340467508L)) {
         this.lIIiilliiIIiilli = now;
      }

      long var3 = Math.max(0L, Math.min(now - this.lIIiilliiIIiilli, 4918461392616817409L ^ 4918461392719229313L));
      this.lIIiilliiIIiilli = now;
      var7 ^= ((long)(this.IliIlllilIi() && Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null && !iiliiIllIIiiiIll.liiiIIllIl() ? 1 : 0) << 32 ^ var7) & -1L << 32;
      float var6 = (float)var3 * 2.2222222E-9F;
      this.iiililliIIIiilli = (int)(var7 >>> 32) != 0 ? Math.min(1.0F, this.iiililliIIIiilli + var6) : Math.max(0.0F, this.iiililliIIIiilli - var6);
      return this.iiililliIIIiilli * this.iiililliIIIiilli * (3.0F - 2.0F * this.iiililliIIIiilli);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 12656) >>> 5 | (char)(var4[var5] ^ 12656) << 11))) + '铤') ^ var5) << 9 | (char)((char)((char)(~((char)((char)(var4[var5] ^ 12656) >>> 5 | (char)(var4[var5] ^ 12656) << 11))) + '铤') ^ var5) >>> 7) + var5) + 13737) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] ^ 12656) >>> 5 | (char)(var4[var5] ^ 12656) << 11))) + '铤') ^ var5) << 9 | (char)((char)((char)(~((char)((char)(var4[var5] ^ 12656) >>> 5 | (char)(var4[var5] ^ 12656) << 11))) + '铤') ^ var5) >>> 7) + var5) + 13737) >>> 12))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float ilIllIiIll() {
      return Math.max(0.0F, this.ilIiilliIiIiilli);
   }

   public float IIllllIlll() {
      return this.IIliillilIliilli;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)(-((char)(~((char)((char)(-((char)((char)(var4[var5] - 31189) - var5))) ^ 1889))))))) << 13 | (char)(-((char)(-((char)(~((char)((char)(-((char)((char)(var4[var5] - 31189) - var5))) ^ 1889))))))) >>> 3) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void iIIIlIlIIl() {
      iiliiIllIIiiiIll.IilliliilIIi(Iiiilllliiilll);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) << 1 | (char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) >>> 15) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) << 1 | (char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) >>> 15) >>> 3) ^ var5) - var5) ^ var5) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) << 1 | (char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) >>> 15) << 13 | (char)((char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) << 1 | (char)((char)((char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) << 2 | (char)(~((char)((char)((char)(-((char)(~((char)(~((char)(-((char)(~((char)(-var4[var5]))))))))))) + '鰷') ^ var5))) >>> 14) - var5) >>> 15) >>> 3) ^ var5) - var5) ^ var5) << 2) + '걮'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float iIlllIllll() {
      return this.iIliilliIlliilli;
   }

   public ilIlilIiIlil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.llIlIIIiilIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lillilliiillilli, this.IIilillilIililli, this.iIililliIlililli, this.llililliilililli});
      Iiililliliililli = this;
      iiliiIllIIiiiIll.IliIlllilIi();
   }
}
