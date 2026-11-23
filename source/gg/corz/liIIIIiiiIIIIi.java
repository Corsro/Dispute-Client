package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_2338;

final class liIIIIiiiIIIIi implements iIlIiIllIi {
   // $FF: synthetic field
   final iIlIilIlIllIilIl liIIlIiliiiIIlIili;

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') << 11))) - '\uda30') >>> 8 | (char)((char)(-((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') << 11))) - '\uda30') << 8) ^ 16510) - '﹋'))) + var5) + 23490) << 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') << 11))) - '\uda30') >>> 8 | (char)((char)(-((char)((char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') >>> 5 | (char)((char)((char)(-((char)(~var4[var5]))) ^ var5) + '쯢') << 11))) - '\uda30') << 8) ^ 16510) - '﹋'))) + var5) + 23490) >>> 2) - 98) + 'ꂥ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IlIlllIlilIl() {
      return System.nanoTime();
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - 16992))) ^ var5) - '课') << 1 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - 16992))) ^ var5) - '课') >>> 15) ^ var5))) ^ var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long liiiIIllIl(Iiilliiliiil deck) {
      class_2338 var2 = this.liIIlIiliiiIIlIili.iillilIIilil(deck);
      return var2 == null ? 0L : var2.method_10063();
   }

   private liIIIIiiiIIIIi(final iIlIilIlIllIilIl var1) {
      this.liIIlIiliiiIIlIili = var1;
   }

   public iIIiIlllIlIiIlll lIiiIiIlilli() {
      return this.liIIlIiliiiIIlIili.iIllilIlllil();
   }

   public List<long[]> IliIlllilIi(Iiilliiliiil deck) {
      return iIiIilIiIliIilIi.IIIilIIiiIIi(this.liIIlIiliiiIIlIili.IliIlllIll, deck);
   }

   public Illlllllllllllll iIlIlllllill() {
      return this.liIIlIiliiiIIlIili.llllililllil();
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)((char)(~var4[var5]) ^ var5) >>> 4 | (char)((char)(~var4[var5]) ^ var5) << 12))) >>> 13 | (char)(-((char)((char)((char)(~var4[var5]) ^ var5) >>> 4 | (char)((char)(~var4[var5]) ^ var5) << 12))) << 3))) + var5) - var5))) - var5) - var5) ^ var5) - 2193) + var5))) - '鞻'))))) - 15057));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7330250369303952357L ^ Long.rotateLeft(5971770994351325314L, 11) ^ 146052917433779813L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2116048188145082595L ^ Long.rotateLeft(1813666720574043468L, 27) ^ 6719973549802850247L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1337804548036819036L ^ Long.rotateLeft(6274741211541611362L, 6) ^ 5763771640108204806L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1367684705225213196L ^ Long.rotateLeft(-686621022520535700L, 1) ^ -1913772300488228187L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1069065279558464461L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3309356107995272716L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -532129265969217167L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 688986762820309304L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6233248362775768506L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1910749941410663028L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 22788)) >>> 13 | (char)((char)(var4[var5] - 22788)) << 3) - var5) + 'ꨛ') >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - 22788)) >>> 13 | (char)((char)(var4[var5] - 22788)) << 3) - var5) + 'ꨛ') << 15) ^ '\ue416') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(var4[var5] - 22788)) >>> 13 | (char)((char)(var4[var5] - 22788)) << 3) - var5) + 'ꨛ') >>> 1 | (char)((char)((char)((char)((char)(var4[var5] - 22788)) >>> 13 | (char)((char)(var4[var5] - 22788)) << 3) - var5) + 'ꨛ') << 15) ^ '\ue416') << 2) + '졛') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIIllIIliIIl(int deckY) {
      return this.liIIlIiliiiIIlIili.illIIIIIll != null && this.liIIlIiliiiIIlIili.illIIIIIll.IilliliilIIi().contains(deckY);
   }

   public boolean IilliliilIIi() {
      if (!this.liIIlIiliiiIIlIili.IillIIllillIIl()) {
         return false;
      } else {
         this.liIIlIiliiiIIlIili.IiilIiiliilIii(IiIlliIliiIl<invokedynamic>());
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) + '袭') ^ var5) - 24653) ^ var5))) + var5) ^ var5) + var5))) + '律') ^ 'ꉰ') - var5) << 8 | (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) + '袭') ^ var5) - 24653) ^ var5))) + var5) ^ var5) + var5))) + '律') ^ 'ꉰ') - var5) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IllIiillllIiil iliIiiliiiii(illIIIilIilIIIil astarAllowed, boolean c) {
      return this.liIIlIiliiiIIlIili.ilililIiilil(astarAllowed, c);
   }
}
