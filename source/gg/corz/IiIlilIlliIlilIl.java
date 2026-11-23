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

final class IiIlilIlliIlilIl {
   static final float IlliIilIll = 0.6F;
   static final int ilIiIilIll = liIilIliiIilIl.IiIIlliIIl(16742930);
   static final int IIliIilIll = liIilIliiIilIl.IiIIlliIIl(16765600);
   static final int lIliIilIll = liIilIliiIilIl.IiIIlliIIl(16747050);
   static final int liIiIilIll = liIilIliiIilIl.IiIIlliIIl(5899794);
   static final int IiIiIilIll = liIilIliiIilIl.IiIIlliIIl(16757276);
   static final int iiIiIilIll = liIilIliiIilIl.IiIIlliIIl(16751706);
   static final illiiliIiliili llIiIilIll = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.22F, 0.46F, 0.68F, 0.86F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(3801611), liIilIliiIilIl.IiIIlliIIl(8127760), liIilIliiIilIl.IiIIlliIIl(12192537), liIilIliiIilIl.IiIIlliIIl(14881822), liIilIliiIilIl.IiIIlliIIl(16726566), liIilIliiIilIl.IiIIlliIIl(16743482)});
   static final illiiliIiliili IlIiIilIll = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.26F, 0.36F, 0.45F, 0.64F, 0.84F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(16769126), liIilIliiIilIl.IiIIlliIIl(16763194), liIilIliiIilIl.IiIIlliIIl(16742960), liIilIliiIilIl.IiIIlliIIl(16730776), liIilIliiIilIl.IiIIlliIIl(15611064), liIilIliiIilIl.IiIIlliIIl(10632422), liIilIliiIilIl.IiIIlliIIl(7221472)});
   static final illiiliIiliili iIliIilIll = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.3F, 0.55F, 0.8F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(16727733), liIilIliiIilIl.IiIIlliIIl(13777919), liIilIliiIilIl.IiIIlliIIl(9063935), liIilIliiIilIl.IiIIlliIIl(3841023), liIilIliiIilIl.IiIIlliIIl(1697535)});

   static float liiiIIllIl(illliIllIilliIll t, boolean pinstripe) {
      if (t.iIIlIiilll < 1.0E9F) {
         return 0.4F * liIilIliiIilIl.lliililiil(t, 0.14F);
      } else {
         return pinstripe && t.IilIIiilll == illIIlllIilIIlll.IiIIIIIill ? liIilIliiIilIl.lililiilil(t, 0.2F, 0.045F) : 0.0F;
      }
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8737400779564281254L ^ Long.rotateLeft(8695036171714110827L, 43) ^ -8724412069050123972L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6593862279529465523L ^ Long.rotateLeft(6154865538292132256L, 28) ^ -2529638908492645834L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4118041198464938102L ^ Long.rotateLeft(-4918247579786721469L, 20) ^ 6632672928940885160L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8701680307961773385L ^ Long.rotateLeft(-2640275668377526159L, 21) ^ -244647424065290616L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5198463935733515600L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -2712056975086864257L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4402163961015239055L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3256331843655415412L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 7758070271088775709L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7810082200424418194L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iiiIlIIIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIIlliIIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIllllIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, ilIllIiIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(liIlliiIll<invokedynamic>());
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
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ '\uebe7') - var5) >>> 9 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ '\uebe7') - var5) << 7) + var5) - 23159) - var5) + var5) << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ '\uebe7') - var5) >>> 9 | (char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) - var5) ^ '\uebe7') - var5) << 7) + var5) - 23159) - var5) + var5) >>> 2) - '쉀') - 11648));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 22063) - var5) - var5) ^ var5))) ^ var5) + var5) ^ var5) + '\ue949') ^ var5) + var5) + 20774))) + 31777) ^ var5) << 12 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - 22063) - var5) - var5) ^ var5))) ^ var5) + var5) ^ var5) + '\ue949') ^ var5) + var5) + 20774))) + 31777) ^ var5) >>> 4))) ^ '턬'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static lIIllIiiIIllIi Iiilliiliiil() {
      int var0 = liIilIliiIilIl.IiIIlliIIl(1052693);
      return IlIliIlllIliIl.iIlIlllllill(IiiIlliiIl<invokedynamic>()).paint(IlIliIlllIliIl.IliIlllilIi(0) | IlIliIlllIliIl.IliIlllilIi(2), IiIlilIlliIlilIl::Ililllililil).paint(IlIliIlllIliIl.IliIlllilIi(1), (t) -> liIilIliiIilIl.lilIliilIl(Ililllililil(t), IIlllIlliIll(t), Iilllilliill(t))).paint(IlIliIlllIliIl.IliIlllilIi(3) | IlIliIlllIliIl.IliIlllilIi(4), (t) -> liIilIliiIilIl.iiIilIIlil(t, liIilIliiIilIl.IiIIlliIIl(-(-577597788 - 93 ^ -47) ^ -578576516), 0.6F)).paint(IlIliIlllIliIl.IliIlllilIi(5), (t) -> liIilIliiIilIl.lilIliilIl(liIilIliiIilIl.iIIilIlIil(t, var0, 0.6F), Illlllllilll(t), 0.6F * iIlIlllllill(t))).recolor(IlIliIlllIliIl.IliIlllilIi(6), 1447707).recolor(IlIliIlllIliIl.IliIlllilIi(7), 3816516).glow(IlIliIlllIliIl.IliIlllilIi(1), (t) -> liIilIliiIilIl.IllIllllIl(liIilIliiIilIl.iiiIlIIIll(IIlllIlliIll(t), 0.12F), Iilllilliill(t))).glow(IlIliIlllIliIl.IliIlllilIi(0), (t) -> liIilIliiIilIl.IllIllllIl(IIlllIlliIll(t), 0.85F * IIillIiliIil(t))).glow(IlIliIlllIliIl.IliIlllilIi(5), (t) -> liIilIliiIilIl.IllIllllIl(Illlllllilll(t), iIlIlllllill(t))).glow(IlIliIlllIliIl.IliIlllilIi(4), (t) -> liIilIliiIilIl.IllIllllIl(Illlllllilll(t), 0.1F + 0.85F * liIilIliiIilIl.lliililiil(t, 0.16F))).glow(IlIliIlllIliIl.IliIlllilIi(3), (t) -> liIilIliiIilIl.IllIllllIl(Illlllllilll(t), liiiIIllIl(t, true))).build();
   }

   private IiIlilIlliIlilIl() {
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 3 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 13) + var5) - var5) - '蟧') ^ var5) + 18093) + 11149) + 15528) - var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 9 | var4[var5] << 7) >>> 3 | (char)(var4[var5] >>> 9 | var4[var5] << 7) << 13) + var5) - var5) - '蟧') ^ var5) + 18093) + 11149) + 15528) - var5) << 6) + var5) - 1808) + var5))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 26945) << 5 | (char)(var4[var5] ^ 26945) >>> 11) + 22435) - var5) + 16173))) ^ var5))) + var5) - var5) ^ 8581));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int IlIlllIlilIl(illliIllIilliIll t) {
      long var5 = 3995588155686950889L;
      float var1 = liIilIliiIilIl.IliIlllilIi(0.2F * liIilIliiIilIl.ilillIiill(t));
      float var2 = 0.1F * iliIiiliiiii(t);
      float var3 = Math.min(0.2F, var1 + var2 * (1.0F - var1));
      var5 ^= ((long)liIilIliiIilIl.iiiIlIIIll(liIilIliiIilIl.IiIIlliIIl(((-357073857 * -755159085 << 11 | -357073857 * -755159085 >>> 21) << 19 | (-357073857 * -755159085 << 11 | -357073857 * -755159085 >>> 21) >>> 13) - -19 ^ 1739334772), 0.55F) << 32 ^ var5) & -1L << 32;
      return liIilIliiIilIl.IllIllllIl(var3 <= 1.0E-4F ? (int)(var5 >>> 32) : liIilIliiIilIl.lilIliilIl((int)(var5 >>> 32), lIliIilIll, var2 * (1.0F - var1) / var3), var3);
   }

   static int Illlllllilll(illliIllIilliIll t) {
      return iIliIilIll.IliIlllilIi(liIilIliiIilIl.IliIlllilIi((t.lliIIiilll - 0.06F) / 0.8F));
   }

   static int IIIllIIliIIl(illliIllIilliIll t) {
      float var1 = liIilIliiIilIl.IIlilIliiIli(t.lIiIIiilll * 0.33F, t.iIiIIiilll * 0.14F, 0.9F, 2, t.lilIIiilll);
      float var2 = iliIiiliiiii(t);
      float var3 = 0.66F + 0.44F * var1 * (1.0F - 0.5F * var2) + 0.06F * (t.lliIIiilll - 0.5F) + 0.3F * var2;
      int var4 = llIiIilIll.IliIlllilIi(liIilIliiIilIl.IliIlllilIi(var3));
      var4 = liIilIliiIilIl.lliIliliIl(var4, ilIiIilIll, 0.5F * var2);
      var4 = liIilIliiIilIl.lliIliliIl(var4, IiIiIilIll, 0.45F * var2 * var2);
      var4 = liIilIliiIilIl.lilIliilIl(var4, liIiIilIll, 0.55F * liIilIliiIilIl.IIiillIiil(t, 0.25F));
      if (t.lIIlIiilll > -1.0E9F) {
         var4 = liIilIliiIilIl.lilIliilIl(var4, liIilIliiIilIl.IiIIlliIIl(4719371), 0.3F * (1.0F - liIilIliiIilIl.IilliliilIIi(0.0F, 0.2F, t.lIIlIiilll)));
      }

      return var4;
   }

   static int Ililllililil(illliIllIilliIll t) {
      long var3 = 932115836974167309L;
      var3 ^= ((long)IIlllIlliIll(t) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)liIilIliiIilIl.lliIliliIl(liIilIliiIilIl.iIIilIlIil(t, liIilIliiIilIl.IiIIlliIIl((--896502076 << 13 | --896502076 >>> 19) ^ -248869953), 0.7F), (int)(var3 >>> 32), 0.3F * liIilIliiIilIl.ilillIiill(t)) ^ var3) & -1L >>> 32;
      return liIilIliiIilIl.lilIliilIl((int)var3, (int)(var3 >>> 32), 0.5F * IIillIiliIil(t));
   }

   static lIIllIiiIIllIi IiIlliIliiIl() {
      int var0 = liIilIliiIilIl.IiIIlliIIl(4869461);
      int var1 = liIilIliiIilIl.IiIIlliIIl(15212558);
      int var2 = liIilIliiIilIl.IiIIlliIIl(16734740);
      int var3 = liIilIliiIilIl.IiIIlliIIl(16747556);
      return IlIliIlllIliIl.iIlIlllllill(IiiIlliiIl<invokedynamic>()).paint(IlIliIlllIliIl.lliliIillililiIill, (t) -> {
         long var2 = -5813898855854917935L;
         var2 ^= ((long)IIIllIIliIIl(t) << 32 ^ var2) & -1L << 32;
         if (t.IIiIIiilll == (((-1403585981 ^ 93) >>> 17 | (-1403585981 ^ 93) << 15) ^ 2098157097)) {
            var2 ^= ((long)liIilIliiIilIl.iiiIlIIIll((int)(var2 >>> 32), 0.16F) << 32 ^ var2) & -1L << 32;
         }

         return liIilIliiIilIl.IiIilliIil(t, (int)(var2 >>> 32), 0.95F, liIilIliiIilIl.lilIliilIl((int)(var2 >>> 32), iiIiIilIll, 0.7F), IIliIilIll);
      }).paint(IlIliIlllIliIl.IliIlllilIi(3) | IlIliIlllIliIl.IliIlllilIi(4), (t) -> liIilIliiIilIl.IIIillIIil(t, var0, 0.4F, 0.8F)).paint(IlIliIlllIliIl.IliIlllilIi(5), (t) -> liIilIliiIilIl.IIIillIIil(t, liIilIliiIilIl.IiIIlliIIl(~(-1805088417 * 59 >>> 27 | -1805088417 * 59 << 5) ^ 2103031047), 0.5F, 0.6F)).recolor(IlIliIlllIliIl.IliIlllilIi(6), 3816514).recolor(IlIliIlllIliIl.IliIlllilIi(7), 10133160).glow(IlIliIlllIliIl.lliliIillililiIill, IiIlilIlliIlilIl::IlIlllIlilIl).glow(IlIliIlllIliIl.IliIlllilIi(5), (t) -> liIilIliiIilIl.IllIllllIl(liIilIliiIilIl.lilIliilIl(var1, var2, 0.6F * liIilIliiIilIl.IliIlllilIi(t.lliIIiilll)), iIlIlllllill(t))).glow(IlIliIlllIliIl.IliIlllilIi(4), (t) -> liIilIliiIilIl.IllIllllIl(liIilIliiIilIl.lilIliilIl(var2, var3, 0.5F * liIilIliiIilIl.lliililiil(t, 0.12F) + 0.3F * liIilIliiIilIl.IliIlllilIi(t.lliIIiilll)), 0.07F + 0.93F * liIilIliiIilIl.lliililiil(t, 0.16F))).glow(IlIliIlllIliIl.IliIlllilIi(3), (ember) -> liIilIliiIilIl.IllIllllIl(var1, liiiIIllIl(ember, false))).build();
   }

   static List<lIIllIiiIIllIi> IliIlllilIi() {
      return List.of(lIiiIiIlilli(), IiIlliIliiIl(), Iiilliiliiil());
   }

   static lIIllIiiIIllIi lIiiIiIlilli() {
      int var0 = liIilIliiIilIl.IiIIlliIIl(2895155);
      int var1 = liIilIliiIilIl.IiIIlliIIl(16727982);
      int var2 = liIilIliiIilIl.IiIIlliIIl(16747222);
      return IlIliIlllIliIl.iIlIlllllill(IiiIlliiIl<invokedynamic>()).paint(IlIliIlllIliIl.lliliIillililiIill, (t) -> {
         long var2 = 8174828413699562365L;
         var2 ^= ((long)IlIiIilIll.IliIlllilIi(IilliliilIIi(t)) << 32 ^ var2) & -1L << 32;
         if (t.IIiIIiilll == ((305909110 << 27 | 305909110 >>> 5) * 105 ^ 1809070561)) {
            var2 ^= ((long)liIilIliiIilIl.iiiIlIIIll((int)(var2 >>> 32), 0.22F) << 32 ^ var2) & -1L << 32;
         }

         return liIilIliiIilIl.IIIillIIil(t, (int)(var2 >>> 32), 0.9F, 0.5F);
      }).paint(IlIliIlllIliIl.IliIlllilIi(3) | IlIliIlllIliIl.IliIlllilIi(4), (grip) -> liIilIliiIilIl.iiIilIIlil(grip, var0, 0.7F)).paint(IlIliIlllIliIl.IliIlllilIi(5), (t) -> liIilIliiIilIl.IIIillIIil(t, liIilIliiIilIl.IiIIlliIIl(--1787490554 + 71 ^ 73 ^ 1790953268), 0.5F, 0.3F)).recolor(IlIliIlllIliIl.IliIlllilIi(6), 3224120).recolor(IlIliIlllIliIl.IliIlllilIi(7), 9080214).glow(IlIliIlllIliIl.lliliIillililiIill, (t) -> liIilIliiIilIl.lIliliIlil(t, IlIiIilIll.IliIlllilIi(IilliliilIIi(t)), 0.2F)).glow(IlIliIlllIliIl.IliIlllilIi(5), (hot) -> liIilIliiIilIl.IllIllllIl(liIilIliiIilIl.lilIliilIl(var1, var2, 0.3F * liIilIliiIilIl.lliililiil(hot, 0.05F)), iIlIlllllill(hot))).glow(IlIliIlllIliIl.IliIlllilIi(4), (pink) -> liIilIliiIilIl.IllIllllIl(liIilIliiIilIl.lilIliilIl(var1, var2, 0.35F * liIilIliiIilIl.lliililiil(pink, 0.12F)), 0.07F + 0.93F * liIilIliiIilIl.lliililiil(pink, 0.16F))).glow(IlIliIlllIliIl.IliIlllilIi(3), (pink) -> liIilIliiIilIl.IllIllllIl(var1, liiiIIllIl(pink, false))).build();
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) << 10) - var5) + '锊') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) << 10) - var5) + '锊') << 4) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) << 10) - var5) + '锊') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) >>> 9 | (char)((char)(-var4[var5]) + var5) << 7) - var5) ^ 4772) ^ '릣') ^ var5) ^ '\ue4f6') + var5) << 10) - var5) + '锊') << 4) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static float IilliliilIIi(illliIllIilliIll t) {
      float var1 = 1.06F * t.lliIIiilll - 0.05F + 0.1F * (0.5F - t.liiIIiilll) + 0.025F * liIilIliiIilIl.Iiilliiliiil(t.lIiIIiilll * 0.7F, t.iIiIIiilll * 0.25F, 3, t.lilIIiilll);
      return liIilIliiIilIl.IliIlllilIi(var1);
   }

   static float iIlIlllllill(illliIllIilliIll t) {
      return t.iIIlIiilll >= 1.0E9F ? 1.0F : liIilIliiIilIl.lliililiil(t, 0.09F);
   }

   static float iliIiiliiiii(illliIllIilliIll t) {
      float var1 = 0.05F * liIilIliiIilIl.Iiilliiliiil(t.lIiIIiilll * 0.4F, t.iIiIIiilll * 0.35F, 2, t.lilIIiilll + 71);
      float var2 = 0.8F + 0.2F * liIilIliiIilIl.Iiilliiliiil(t.lIiIIiilll * 0.9F, t.iIiIIiilll * 0.22F, 3, t.lilIIiilll + 83);
      return liIilIliiIilIl.IIIllIIliIIl(t.liiIIiilll, 0.45F + var1, 0.2F) * liIilIliiIilIl.IilliliilIIi(0.1F, 0.5F, t.lliIIiilll) * var2;
   }

   static float IIillIiliIil(illliIllIilliIll t) {
      float var1 = 1.0F - liIilIliiIilIl.IilliliilIIi(0.04F, 0.42F, t.iiiIIiilll);
      return var1 * var1 * liIilIliiIilIl.IilliliilIIi(0.04F, 0.16F, t.lliIIiilll) * Iilllilliill(t);
   }

   static int IIlllIlliIll(illliIllIilliIll t) {
      return iIliIilIll.IliIlllilIi(0.1F + 0.9F * liIilIliiIilIl.IliIlllilIi(t.lliIIiilll));
   }

   static float Iilllilliill(illliIllIilliIll t) {
      IllIIiillllIIiil var1 = iiiilIiIIIIiIi.liiiIIllIl(t.IilIIiilll);
      float[] var2 = var1 == null ? null : var1.llIIlillil[1];
      float var3 = var2 == null ? 1.0F : liIilIliiIilIl.IilliliilIIi(var2[1], var2[1] + 0.6F, t.iIiIIiilll);
      return var3 * liIilIliiIilIl.IilliliilIIi(0.02F, 0.08F, t.lliIIiilll);
   }
}
