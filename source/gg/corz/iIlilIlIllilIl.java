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

public class iIlilIlIllilIl extends ilIllIiIll {
   private final IIIIlilllIIIlill iillIIlllIIilIIlll = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)4.0F, (double)2.0F, (double)10.0F, (double)0.5F);
   private final lliliIIiililiIIi ililIIlllIiilIIlll = new lliliIIiililiIIi(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), new String[]{IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>()});
   private static final double IillIIllllillIIlll = (double)14.0F;
   private long IIIiIIllllIIiIIlll = 0L;
   private final iiIiiilIIliiil IlilIIlllllilIIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil lIilIIllliIilIIlll = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private double liilIIllliiilIIlll = (double)1.0F;

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(~var4[var5]) - 15925))) - var5) - '쬳'))))) + 899) >>> 11 | (char)((char)(-((char)(-((char)((char)((char)(-((char)((char)(~var4[var5]) - 15925))) - var5) - '쬳'))))) + 899) << 5) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   protected void illIlIilIl(iilIIlilIIiIIlil event) {
      if (this.IliIlllilIi() && this.IlilIIlllllilIIlll.Iilllilliill()) {
         double var2 = event.IliIlllilIi() > Double.longBitsToDouble(3891284618658858341L ^ 3891284618658858341L) ? Double.longBitsToDouble(-4677036690105382925L ^ -9153614719711655949L) : Double.longBitsToDouble(-6731577881016360856L ^ 2122498986394034280L);
         double var4 = Math.max(Double.longBitsToDouble(1264182223638259903L ^ 5875868242065647807L), Math.min(Double.longBitsToDouble(2621103080080159690L ^ 7224907799159649226L), this.iillIIlllIIilIIlll.Iilllilliill() + var2));
         this.iillIIlllIIilIIlll.IIillIiliIil(var4);
         event.iIlIlllllill();
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 6 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 10) - '휹') ^ '뀹') << 5 | (char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 6 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 10) - '휹') ^ '뀹') >>> 11))) ^ '\udcdc') + var5) - '鑘'))))) ^ 29401))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double iiiIlIIIll() {
      long var1 = System.nanoTime();
      double var3 = this.IIIiIIllllIIiIIlll == (5347480858614878098L ^ 5347480858614878098L) ? (double)0.0F : (double)(var1 - this.IIIiIIllllIIiIIlll) / Double.longBitsToDouble(4892908371660060216L ^ 156173912258197048L);
      this.IIIiIIllllIIiIIlll = var1;
      double var5 = this.IliIlllilIi() ? this.iillIIlllIIilIIlll.Iilllilliill() : (double)1.0F;
      if (!this.lIilIIllliIilIIlll.Iilllilliill()) {
         this.liilIIllliiilIIlll = var5;
         return this.liilIIllliiilIIlll;
      } else {
         double var7 = (double)1.0F - Math.exp(Double.longBitsToDouble(-3206820367260979513L ^ 1392480752191139527L) * Math.max((double)0.0F, var3));
         this.liilIIllliiilIIlll += (var5 - this.liilIIllliiilIIlll) * var7;
         if (Math.abs(this.liilIIllliiilIIlll - var5) < Double.longBitsToDouble(-8011786238562856470L ^ -5800626903053715434L)) {
            this.liilIIllliiilIIlll = var5;
         }

         return this.liilIIllliiilIIlll;
      }
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) << 2 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) >>> 14) - 'ꈻ') - var5))) << 11 | (char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) << 2 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) >>> 14) - 'ꈻ') - var5))) >>> 5) << 9 | (char)((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) << 2 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) >>> 14) - 'ꈻ') - var5))) << 11 | (char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) << 2 | (char)(~((char)((char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) << 12 | (char)(-((char)((char)((char)(var4[var5] - '샷') - '홀') << 3 | (char)((char)(var4[var5] - '샷') - '홀') >>> 13))) >>> 4))) >>> 14) - 'ꈻ') - var5))) >>> 5) >>> 7))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIlilIlIllilIl() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iillIIlllIIilIIlll, this.lIilIIllliIilIIlll, this.IlilIIlllllilIIlll, this.ililIIlllIiilIIlll});
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) << 12 | (char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) >>> 4) ^ var5) - '덅')) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) << 12 | (char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) >>> 4) ^ var5) - '덅')) << 9))) + 30352) << 4 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) << 12 | (char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) >>> 4) ^ var5) - '덅')) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) << 12 | (char)((char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) >>> 11 | (char)((char)((char)(~((char)(~((char)(~((char)(var4[var5] << 11 | var4[var5] >>> 5))))))) ^ 32626) ^ var5) << 5) >>> 4) ^ var5) - '덅')) << 9))) + 30352) >>> 12) ^ var5) ^ '\ue6d3'));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) ^ 19571) + '꣒') ^ 30916))) - var5) + var5) << 8 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) ^ 19571) + '꣒') ^ 30916))) - var5) + var5) >>> 8))) << 8 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) ^ 19571) + '꣒') ^ 30916))) - var5) + var5) << 8 | (char)((char)((char)(~((char)((char)((char)((char)(var4[var5] ^ var5) ^ 19571) + '꣒') ^ 30916))) - var5) + var5) >>> 8))) >>> 8) - var5) ^ 15958));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIlIliIiIlIli IiIiliIiiiIi() {
      return IliIlllilIi<invokedynamic>().equals(this.ililIIlllIiilIIlll.Iilllilliill()) ? ilIlIliIiIlIli.llilIIIIIl : ilIlIliIiIlIli.IlilIIIIIl;
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8890811308722520184L ^ Long.rotateLeft(2090200686943228552L, 50) ^ 7655061277125278695L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5612477530787800021L ^ Long.rotateLeft(-5182864885716739546L, 23) ^ -8653643643111646484L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 9184320559856135017L ^ Long.rotateLeft(3232962294302462014L, 18) ^ -7691965870999359082L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1215971870691932878L ^ Long.rotateLeft(-7955392343875464717L, 48) ^ 4697560633020029939L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3193798677653048318L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3061278147944400870L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6811067648761967218L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8485336426289051407L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1074493930113574076L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6964694281381452551L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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
}
