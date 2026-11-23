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

final class iliilIilIiiilIil {
   static final illiiliIiliili liIiIllIil = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.18F, 0.35F, 0.51F, 0.64F, 0.75F, 0.9F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(5436132), liIilIliiIilIl.IiIIlliIIl(1101024), liIilIliiIilIl.IiIIlliIIl(1349360), liIilIliiIilIl.IiIIlliIIl(2064383), liIilIliiIilIl.IiIIlliIIl(4018930), liIilIliiIilIl.IiIIlliIIl(6961390), liIilIliiIilIl.IiIIlliIIl(9189610), liIilIliiIilIl.IiIIlliIIl(10369764)});
   static final illiiliIiliili llIiIllIil = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.14F, 0.3F, 0.46F, 0.6F, 0.74F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(16765514), liIilIliiIilIl.IiIIlliIIl(16758830), liIilIliiIilIl.IiIIlliIIl(16751134), liIilIliiIilIl.IiIIlliIIl(16743958), liIilIliiIilIl.IiIIlliIIl(16738834), liIilIliiIilIl.IiIIlliIIl(16733706), liIilIliiIilIl.IiIIlliIIl(15614982)});
   static final int iIIiIllIil = liIilIliiIilIl.IiIIlliIIl(16777215);
   static final illiiliIiliili IIIiIllIil = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.26F, 0.5F, 0.64F, 0.74F, 0.83F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(16726546), liIilIliiIilIl.IiIIlliIIl(16741396), liIilIliiIilIl.IiIIlliIIl(16756258), liIilIliiIilIl.IiIIlliIIl(16766042), liIilIliiIilIl.IiIIlliIIl(16772536), liIilIliiIilIl.IiIIlliIIl(10277631), liIilIliiIilIl.IiIIlliIIl(3438847)});
   static final illiiliIiliili iiIiIllIil = liIilIliiIilIl.iIlllIllll(liIilIliiIilIl.IiIIlliIIl(4873471), liIilIliiIilIl.IiIIlliIIl(2006015), liIilIliiIilIl.IiIIlliIIl(1369056));
   static final int IiIiIllIil = liIilIliiIilIl.IiIIlliIIl(16761960);
   static final illiiliIiliili iiilIllIil = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.3F, 0.62F, 0.86F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(1455280), liIilIliiIilIl.IiIIlliIIl(1854694), liIilIliiIilIl.IiIIlliIIl(4032255), liIilIliiIilIl.IiIIlliIIl(6795007), liIilIliiIilIl.IiIIlliIIl(10144767)});
   static final int IlIiIllIil = liIilIliiIilIl.IiIIlliIIl(16770720);
   static final illiiliIiliili ilIiIllIil = liIilIliiIilIl.iIlllIllll(liIilIliiIilIl.IiIIlliIIl(16734730), liIilIliiIilIl.IiIIlliIIl(16747036), liIilIliiIilIl.IiIIlliIIl(16758832));
   static final int lIIiIllIil = liIilIliiIilIl.IiIIlliIIl(16775918);
   static final illiiliIiliili liilIllIil = liIilIliiIilIl.lllllillll(new float[]{0.0F, 0.28F, 0.52F, 0.76F, 1.0F}, new int[]{liIilIliiIilIl.IiIIlliIIl(10487832), liIilIliiIilIl.IiIIlliIIl(14881822), liIilIliiIilIl.IiIIlliIIl(16734738), liIilIliiIilIl.IiIIlliIIl(16756736), liIilIliiIilIl.IiIIlliIIl(16767032)});

   static lIIllIiiIIllIi IIIilIIiiIIi() {
      long var3 = 1707369533795772209L;
      var3 ^= ((long)liIilIliiIilIl.IiIIlliIIl(~(--61572180) * 1171354717 - -39 ^ 7556715) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)liIilIliiIilIl.IiIIlliIIl(1620151821 + 15 ^ 121 ^ 1621474137) ^ var3) & -1L >>> 32;
      ililIiIlIiilIiIl var2 = IlIliIlllIliIl.iIlIlllllill(IiiIlliiIl<invokedynamic>()).seed(((-1678431033 ^ 17) * 630453915 >>> 21 | (-1678431033 ^ 17) * 630453915 << 11) ^ 1313641865).paint(IlIliIlllIliIl.lliliIillililiIill, iliilIilIiiilIil::Ililllililil).paint(IlIliIlllIliIl.IliIlllilIi(3) | IlIliIlllIliIl.IliIlllilIi(4), (t) -> liIilIliiIilIl.iiIilIIlil(t, grip, 0.7F)).paint(IlIliIlllIliIl.IliIlllilIi(5), (t) -> liIilIliiIilIl.IIIillIIil(t, rim, 0.5F, 0.3F)).recolor(IlIliIlllIliIl.IliIlllilIi((-1087147312 * -123 ^ 9) * 587345955 ^ 1059648877), -1279427939 * 27 ^ -187375943).recolor(IlIliIlllIliIl.IliIlllilIi(266379367 * 57 - 111 - -115 ^ -1996245260), (878751766 << 9 | 878751766 >>> 23) - -51 ^ -1041318655).glow(IlIliIlllIliIl.lliliIillililiIill, (t) -> liIilIliiIilIl.lIliliIlil(t, IIillIiliIil(t), 0.2F));
      return lIiiIiIlilli(var2, iliilIilIiiilIil::Iiilliiliiil, IlIiIllIil, 0.3F).build();
   }

   // $FF: synthetic method
   private static CallSite IiiIlliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -69349585980160983L ^ Long.rotateLeft(-3312642040060546853L, 39) ^ -8184183582690360762L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4601258820636684395L ^ Long.rotateLeft(4672324889360299739L, 33) ^ 8446026662652568463L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1831067635881097481L ^ Long.rotateLeft(8687236063476582186L, 14) ^ -9054022101028382493L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7080700204526203216L ^ Long.rotateLeft(-5479140835342975705L, 18) ^ -7334386948293260053L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -7650996138733295972L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 440332184862311450L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5361419815486182316L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2816074090443717047L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8948190384914585308L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1260423954706420336L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, ilIllIiIll<invokedynamic>());
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
   private static CallSite ilIllIiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + '舏') ^ var5) + 5291) - var5) >>> 15 | (char)((char)((char)((char)(var4[var5] + '舏') ^ var5) + 5291) - var5) << 1))) + '酒'))) ^ 'ꖵ') ^ var5) + var5) + var5) - 'ꗾ'))) - '\ue583'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private iliilIilIiiilIil() {
   }

   static float IIIllIIliIIl(long f) {
      return Float.intBitsToFloat((int)(f >>> (~((1002097677 >>> 25 | 1002097677 << 7) >>> 25 | (1002097677 >>> 25 | 1002097677 << 7) << 7) ^ 1291628849)));
   }

   static float IiIlliIliiIl(float a) {
      return liIilIliiIilIl.IilliliilIIi(-0.03F, 0.03F, a);
   }

   // $FF: synthetic method
   private static CallSite iiiIlIIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) ^ 19197) + var5) >>> 10 | (char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) ^ 19197) + var5) << 6) ^ '얘') ^ var5))) - 25028))) >>> 1 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) ^ 19197) + var5) >>> 10 | (char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) ^ 19197) + var5) << 6) ^ '얘') ^ var5))) - 25028))) << 15) ^ var5))) - var5))) + var5))) ^ '請'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static int Ililllililil(illliIllIilliIll t) {
      long var1 = iliIiiliiiii(t.lIiIIiilll, t.iIiIIiilll, t.lilIIiilll);
      float var3 = IIIllIIliIIl(var1);
      float var4 = IIlllIlliIll(t, var3);
      float var5 = Illlllllilll(t, var3);
      int var6 = Iilllilliill(var3, IlIlllIlilIl(var1), var4, var5);
      var6 = liIilIliiIilIl.IIiIllIiIl(var6, 1.0F + 0.05F * liIilIliiIilIl.Iiilliiliiil(t.lIiIIiilll * 0.9F, t.iIiIIiilll * 0.35F, 2, t.lilIIiilll + 71));
      if (t.IIiIIiilll == 2) {
         var6 = liIilIliiIilIl.iiiIlIIIll(var6, 0.12F);
      }

      int var7 = liIilIliiIilIl.llIililIil(t, var6, 0.95F, liIilIliiIilIl.lilIliilIl(var6, iIIiIllIil, 0.45F));
      var7 = liIilIliiIilIl.lliIliliIl(var7, var6, 0.12F + 0.16F * IiIlliIliiIl(var3));
      float var8 = liIilIliiIilIl.lIiiIiIlilli(liIilIliiIilIl.iilllIIill(t));
      float var9 = 0.32F * liIilIliiIilIl.IIIllIIliIIl(var8, 0.205F, 0.03F) + 0.15F * liIilIliiIilIl.IIIllIIliIIl(var8, 0.6F, 0.016F);
      var7 = liIilIliiIilIl.lliIliliIl(var7, iIIiIllIil, var9);
      return liIilIliiIilIl.lilIliilIl(var7, lIIiIllIil, Math.max(0.4F * var4, 0.5F * var5));
   }

   static float IIlilIliiIli(illliIllIilliIll t) {
      return liiiIIllIl(t, -0.1F, 0.03F, 578673289 * -97 ^ 115 ^ -73 ^ 296734158);
   }

   static long iliIiiliiiii(float y, float seed, int x) {
      float var3 = y * 0.25F;
      float var4 = seed * 0.1F;
      float var5 = liIilIliiIilIl.Iiilliiliiil(var3, var4, 2, x + 11);
      float var6 = liIilIliiIilIl.Iiilliiliiil(var3 + 5.2F, var4 + 1.3F, 2, x + 23);
      float var7 = liIilIliiIilIl.Iiilliiliiil(var3 + 1.5F * var5 + 1.7F, var4 + 1.5F * var6 + 9.2F, 2, x + 37);
      float var8 = liIilIliiIilIl.Iiilliiliiil(var3 + 1.5F * var5 + 8.3F, var4 + 1.5F * var6 + 2.8F, 2, x + 41);
      float var9 = var3 + 1.6F * var7;
      float var10 = var4 + 1.6F * var8;
      float var11 = liIilIliiIilIl.IIIilIIiiIIi(var9, var10, 3, 2.03F, 0.42F, x);
      float var12 = liIilIliiIilIl.Iiilliiliiil(var9 * 1.7F + 3.3F, var10 * 1.7F - 4.1F, 2, x + 59);
      return (long)Float.floatToRawIntBits(var11) << 32 | (long)Float.floatToRawIntBits(var12) & 4294967295L;
   }

   static lIIllIiiIIllIi IiIiliIiiiIi() {
      long var3 = 7707844535443131851L;
      var3 ^= ((long)liIilIliiIilIl.IiIIlliIIl(-1734254980 - -11 ^ 125 ^ -1735756068) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)liIilIliiIilIl.IiIIlliIIl((1047109203 << 23 | 1047109203 >>> 9) * -1643291835 - -11 ^ 1074258680) ^ var3) & -1L >>> 32;
      ililIiIlIiilIiIl var2 = IlIliIlllIliIl.iIlIlllllill(IiiIlliiIl<invokedynamic>()).paint(IlIliIlllIliIl.lliliIillililiIill, (t) -> IilliliilIIi(t, llIiIllIil.IliIlllilIi(IlIillIiilIi(t)), 0.7F, 0.22F, IiIiIllIil)).paint(IlIliIlllIliIl.IliIlllilIi(3) | IlIliIlllIliIl.IliIlllilIi(4), (grip) -> liIilIliiIilIl.iiIilIIlil(grip, t, 0.65F)).paint(IlIliIlllIliIl.IliIlllilIi(5), (rim) -> liIilIliiIilIl.IIIillIIil(rim, t, 0.5F, 0.35F)).recolor(IlIliIlllIliIl.IliIlllilIi(-(-400044589 - 21) ^ 400044612), ((-844206571 << 17 | -844206571 >>> 15) << 9 | (-844206571 << 17 | -844206571 >>> 15) >>> 23) ^ 1459784083).recolor(IlIliIlllIliIl.IliIlllilIi(215844354 * -1944890851 * -678152731 * 678152731 * -652835029 ^ 1292959221), (-1724374150 >>> 19 | -1724374150 << 13) ^ 80205175).glow(IlIliIlllIliIl.lliliIillililiIill, (t) -> liIilIliiIilIl.lIliliIlil(t, llIiIllIil.IliIlllilIi(IlIillIiilIi(t)), 0.2F));
      return lIiiIiIlilli(var2, (t) -> ilIiIllIil.IliIlllilIi(t.lliIIiilll), liIilIliiIilIl.IiIIlliIIl(((-862333217 << 9 | -862333217 >>> 23) - 125 >>> 23 | (-862333217 << 9 | -862333217 >>> 23) - 125 << 9) ^ -5 ^ -1535236330), 1.0F).build();
   }

   static float liiiIIllIl(illliIllIilliIll t, float salt, float tilt, int wobble) {
      float var4 = 1.06F * t.lliIIiilll - 0.05F + salt * (0.5F - t.liiIIiilll) + tilt * liIilIliiIilIl.Iiilliiliiil(t.lIiIIiilll * 0.7F, t.iIiIIiilll * 0.25F, 3, t.lilIIiilll + wobble) + 0.05F * t.IlIlIiilll;
      return liIilIliiIilIl.IliIlllilIi(var4);
   }

   static float IIlllIlliIll(illliIllIilliIll a, float t) {
      return (1.0F - liIilIliiIilIl.IilliliilIIi(0.007F, 0.018F, Math.abs(t))) * liIilIliiIilIl.IilliliilIIi(-0.06F, 0.1F, liIilIliiIilIl.Iiilliiliiil(a.lIiIIiilll * 0.9F, a.iIiIIiilll * 0.4F, 2, a.lilIIiilll + (~(((1756412286 >>> 27 | 1756412286 << 5) << 11 | (1756412286 >>> 27 | 1756412286 << 5) >>> 21) + 99) ^ 1182897825)));
   }

   static int Iilllilliill(float seam, float a, float filament, float b) {
      long var7 = 6689167029352262924L;
      long var9 = -8370356981369366457L;
      var7 ^= ((long)liilIllIil.IliIlllilIi(liIilIliiIilIl.IliIlllilIi(0.4F + 1.35F * a + 0.5F * seam)) << 32 ^ var7) & -1L << 32;
      var7 ^= ((long)iiilIllIil.IliIlllilIi(liIilIliiIilIl.IliIlllilIi(0.4F + 1.3F * a + 1.1F * seam)) ^ var7) & -1L >>> 32;
      var9 ^= ((long)liIilIliiIilIl.lilIliilIl(liIilIliiIilIl.lilIliilIl((int)var7, (int)(var7 >>> 32), IiIlliIliiIl(seam)), lIIiIllIil, 0.85F * filament) << 32 ^ var9) & -1L << 32;
      return liIilIliiIilIl.lilIliilIl((int)(var9 >>> 32), lIIiIllIil, 0.6F * b);
   }

   static int IilliliilIIi(illliIllIilliIll hi, int lift, float t, float grain, int c) {
      lift = liIilIliiIilIl.IIiIllIiIl(lift, 1.0F + 0.06F * liIilIliiIilIl.Iiilliiliiil(hi.lIiIIiilll * 0.9F, hi.iIiIIiilll * 0.35F, 2, hi.lilIIiilll + 71));
      if (hi.IIiIIiilll == 2) {
         lift = liIilIliiIilIl.lilIliilIl(lift, c, 0.3F);
      }

      int var5 = liIilIliiIilIl.lilIliilIl(lift, c, 0.55F);
      float var6 = liIilIliiIilIl.Ilillllill(hi);
      float var7 = liIilIliiIilIl.ilillIiill(hi);
      int var8 = liIilIliiIilIl.IIiIllIiIl(lift, (1.0F + t * 0.06F * liIilIliiIilIl.IIIIllIIIl(hi, 1.0F, hi.lilIIiilll)) * (0.9F + 0.558F * (var6 - 0.62F)));
      var8 = liIilIliiIilIl.lliIliliIl(var8, var5, 0.54F * var7);
      var8 = liIilIliiIilIl.lliIliliIl(var8, var5, 0.3F * liIilIliiIilIl.liilliiill(hi, 0.08F));
      return liIilIliiIilIl.lliIliliIl(var8, lift, grain);
   }

   static int IIillIiliIil(illliIllIilliIll t) {
      long var1 = iliIiiliiiii(t.lIiIIiilll, t.iIiIIiilll, t.lilIIiilll);
      float var3 = IIIllIIliIIl(var1);
      return Iilllilliill(var3, IlIlllIlilIl(var1), IIlllIlliIll(t, var3), Illlllllilll(t, var3));
   }

   static float IlIillIiilIi(illliIllIilliIll t) {
      return liiiIIllIl(t, 0.1F, 0.03F, ~(~(-1642871517 ^ -11)) ^ 1642871515);
   }

   // $FF: synthetic method
   private static CallSite lIIlliIIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - 19340) + 22621) ^ var5))) ^ var5) << 3 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - 19340) + 22621) ^ var5))) ^ var5) >>> 13) - var5))))) ^ var5) - var5) >>> 8 | (char)((char)((char)(~((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)(~var4[var5]) - 19340) + 22621) ^ var5))) ^ var5) << 3 | (char)((char)(~((char)((char)((char)((char)(~var4[var5]) - 19340) + 22621) ^ var5))) ^ var5) >>> 13) - var5))))) ^ var5) - var5) << 8) + 20670) - 9779) ^ '툽'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static float IlIlllIlilIl(long f) {
      return Float.intBitsToFloat((int)f);
   }

   static int iIlIlllllill(illliIllIilliIll lift, int c, float t, float grain) {
      c = liIilIliiIilIl.IIiIllIiIl(c, 1.0F + 0.06F * liIilIliiIilIl.Iiilliiliiil(lift.lIiIIiilll * 0.9F, lift.iIiIIiilll * 0.35F, 2, lift.lilIIiilll + ((-(-496438962 * -37) >>> 29 | -(-496438962 * -37) << 3) ^ -917044622)));
      if (lift.IIiIIiilll == (~377566960 * 41 ^ 1699623781)) {
         c = liIilIliiIilIl.iiiIlIIIll(c, 0.22F);
      }

      return liIilIliiIilIl.lliIliliIl(liIilIliiIilIl.IIIillIIil(lift, c, 0.9F, t), c, grain);
   }

   static int Iiilliiliiil(illliIllIilliIll t) {
      return IIIiIllIil.IliIlllilIi(t.lliIIiilll);
   }

   // $FF: synthetic method
   private static CallSite liIlliiIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + var5))) - '顝') ^ var5) ^ 20288) ^ '鸌'))))) << 2 | (char)(~((char)(-((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + var5))) - '顝') ^ var5) ^ 20288) ^ '鸌'))))) >>> 14) + 18181) + 14976))) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static ililIiIlIiilIiIl lIiiIiIlilli(ililIiIlIiilIiIl glow, lilIiiiliilIiiil heat, int b, float hot) {
      return glow.glow(IlIliIlllIliIl.IliIlllilIi(5), (glowx) -> liIilIliiIilIl.IllIllllIl(liIilIliiIilIl.lilIliilIl(heat.paint(glowx), b, hot * 0.3F * liIilIliiIilIl.lliililiil(glowx, 0.05F)), IiIlilIlliIlilIl.iIlIlllllill(glowx))).glow(IlIliIlllIliIl.IliIlllilIi(4), (hotx) -> liIilIliiIilIl.IllIllllIl(liIilIliiIilIl.lilIliilIl(heat.paint(hotx), b, hot * 0.35F * liIilIliiIilIl.lliililiil(hotx, 0.12F)), 0.07F + 0.93F * liIilIliiIilIl.lliililiil(hotx, 0.16F))).glow(IlIliIlllIliIl.IliIlllilIi(3), (glowx) -> liIilIliiIilIl.IllIllllIl(heat.paint(glowx), IiIlilIlliIlilIl.liiiIIllIl(glowx, false)));
   }

   // $FF: synthetic method
   private static CallSite IlIllllIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~var4[var5]) ^ '맪') - var5))) + '莩') >>> 14 | (char)((char)(-((char)((char)((char)(~var4[var5]) ^ '맪') - var5))) + '莩') << 2))) ^ '\uf8a9') + var5) ^ var5) ^ 4986))) - '뎟') - '薹') - var5) << 13 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~var4[var5]) ^ '맪') - var5))) + '莩') >>> 14 | (char)((char)(-((char)((char)((char)(~var4[var5]) ^ '맪') - var5))) + '莩') << 2))) ^ '\uf8a9') + var5) ^ var5) ^ 4986))) - '뎟') - '薹') - var5) >>> 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static List<lIIllIiiIIllIi> IliIlllilIi() {
      return List.of(IIIilIIiiIIi(), IiIiliIiiiIi(), Illillliilli());
   }

   static float Illlllllilll(illliIllIilliIll t, float a) {
      float var2 = Math.min(Math.abs(a - 0.06F), Math.abs(a + 0.08F));
      return (1.0F - liIilIliiIilIl.IilliliilIIi(0.004F, 0.011F, var2)) * liIilIliiIilIl.IilliliilIIi(0.04F, 0.2F, liIilIliiIilIl.Iiilliiliiil(t.lIiIIiilll * 0.55F, t.iIiIIiilll * 0.22F, 2, t.lilIIiilll + (~(-1765252104 * 103 >>> 3 | -1765252104 * 103 << 29) * -991146299 ^ -2009817947)));
   }

   static lIIllIiiIIllIi Illillliilli() {
      long var3 = 764823571245175309L;
      var3 ^= ((long)liIilIliiIilIl.IiIIlliIIl((-((-225809416 ^ -85) - 57) >>> 11 | -((-225809416 ^ -85) - 57) << 21) ^ 2096985698) << 32 ^ var3) & -1L << 32;
      var3 ^= ((long)liIilIliiIilIl.IiIIlliIIl((((1777507976 >>> 11 | 1777507976 << 21) ^ -9) * -1431655765 >>> 17 | ((1777507976 >>> 11 | 1777507976 << 21) ^ -9) * -1431655765 << 15) ^ 544028650) ^ var3) & -1L >>> 32;
      ililIiIlIiilIiIl var2 = IlIliIlllIliIl.iIlIlllllill(IiiIlliiIl<invokedynamic>()).paint(IlIliIlllIliIl.lliliIillililiIill, (t) -> iIlIlllllill(t, liIiIllIil.IliIlllilIi(IIlilIliiIli(t)), 0.7F, 0.14F)).paint(IlIliIlllIliIl.IliIlllilIi(3) | IlIliIlllIliIl.IliIlllilIi(4), (grip) -> liIilIliiIilIl.iiIilIIlil(grip, t, 0.65F)).paint(IlIliIlllIliIl.IliIlllilIi(5), (t) -> liIilIliiIilIl.IIIillIIil(t, rim, 0.5F, 0.35F)).recolor(IlIliIlllIliIl.IliIlllilIi(-(757087268 * 83 ^ -65) ^ -1586266133), -(-1819841366 >>> 3 | -1819841366 << 29) ^ -1381817773).recolor(IlIliIlllIliIl.IliIlllilIi((~-1042576926 + -53 - -25) * 941362695 ^ -779139072), (1585366942 << 29 | 1585366942 >>> 3) * 35 ^ -572113763).glow(IlIliIlllIliIl.lliliIillililiIill, (t) -> liIilIliiIilIl.lIliliIlil(t, liIiIllIil.IliIlllilIi(IIlilIliiIli(t)), 0.2F));
      return lIiiIiIlilli(var2, (t) -> iiIiIllIil.IliIlllilIi(t.lliIIiilll), liIilIliiIilIl.IiIIlliIIl(~(-2100769483 * 128207979 + -87) ^ -795180837), 1.0F).build();
   }
}
