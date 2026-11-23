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
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class IlIliIlllIliIl {
   public static final int IiIIIlillliIIIlill = 15;
   public static final float lilIIlilliilIIlill = 8.0F;
   public static final int iiliiIillIIiiiIill = 7;
   static final byte iIiIIlillIliIIlill = 0;
   public static final int iIIIIlillIlIIIlill = 13;
   public static final int IIliiIilllIliiIill = 3;
   public static final int IIIliIilllIIliIill = 1;
   public static final int iIliiIillIlliiIill = 4;
   public static final int IiIliIillliIliIill = 4;
   static final byte lliIIlilliliIIlill = 1;
   public static final int lIlliIilliIlliIill = 6;
   public static final int IIIIIlilllIIIIlill = 12;
   public static final int liIiiIilliiIiiIill = 2;
   public static final int ilIiiIillIiIiiIill = 1;
   public static final int IiiliIillliiliIill = IliIlllilIi(3) | IliIlllilIi(4) | IliIlllilIi(5);
   public static final String[] iIiliIillIliliIill = new String[]{Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>(), Ililllililil<invokedynamic>()};
   public static final int liiIiIilliiiIiIill = 0;
   public static final int iiIliIillIIlliIill = 5;
   public static final int lliliIillililiIill = IliIlllilIi(0) | IliIlllilIi(1) | IliIlllilIi(2);
   public static final int iliiiIillIiiiiIill = 10;
   private static volatile Map<String, lIIllIiiIIllIi> lIIlIlilliIIlIlill;
   public static final String illIIlillIilIIlill = "Vanilla";
   public static final int liiiiIilliiiiiIill = 11;
   private static volatile String[] IlIlIlillllIlIlill;
   public static final int llliiIillilliiIill = 5;
   private static volatile List<lIIllIiiIIllIi> iiiIIlillIIIlIlill;
   public static final int IlIiiIillllIiiIill = 0;
   public static final int IIiIIlilllIiIIlill = -5987164;
   public static final int IIiliIilllIiliIill = 255;
   public static final int IliiiIilllliiiIill = 9;
   public static final int IiliiIillliliiIill = 6;
   public static final int iIIliIillIlIliIill = 2;
   public static final int[] IllIIlilllllIIlill;
   public static final int lilliIilliilliIill = 256;
   public static final int lIlIIlilliIlIIlill = 16;
   public static final int iiiliIillIIIiiIill = IliIlllilIi(6) | IliIlllilIi(7);
   public static final int lIiiiIilliIiiiIill = 8;
   public static final int illliIillIilliIill = 8;
   public static final int llIIIlillilIIIlill = 14;
   public static final int IllliIilllllliIill = 7;
   static final byte IiiIIlillliiIIlill = 2;
   public static final int lIIiiIilliIIiiIill;
   public static final int iiIIIlillIIlIIlill = 16;
   public static final int llIliIillilIliIill = 3;

   public static int liiiIIllIl(int cls) {
      long var2 = -6801966521977070256L;
      var2 ^= ((long)(cls & (-((-1548324764 + -21) * 84215045 * 1171354717) ^ -1758100098)) << 32 ^ var2) & -1L << 32;
      return (lliliIillililiIill & IliIlllilIi((int)(var2 >>> 32))) != 0 ? lliliIillililiIill : ((IiiliIillliiliIill & IliIlllilIi((int)(var2 >>> 32))) != 0 ? IiiliIillliiliIill : iiiliIillIIIiiIill);
   }

   public static int IlIlllIlilIl(int argb, float v, float u) {
      int var3 = argb & 16777215;

      for(int var4 = 0; var4 < IllIIlilllllIIlill.length; ++var4) {
         if (IllIIlilllllIIlill[var4] == var3) {
            return var4;
         }
      }

      if (v >= 0.5F && u >= 0.5F) {
         return 9;
      } else {
         int var13 = 0;
         long var5 = Long.MAX_VALUE;

         for(int var7 = 0; var7 < 16; ++var7) {
            int var8 = (IllIIlilllllIIlill[var7] >> 16 & 255) - (var3 >> 16 & 255);
            int var9 = (IllIIlilllllIIlill[var7] >> 8 & 255) - (var3 >> 8 & 255);
            int var10 = (IllIIlilllllIIlill[var7] & 255) - (var3 & 255);
            long var11 = (long)var8 * (long)var8 + (long)var9 * (long)var9 + (long)var10 * (long)var10;
            if (var11 < var5) {
               var5 = var11;
               var13 = var7;
            }
         }

         return var13;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') << 11) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') << 11) << 5) << 2 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') << 11) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) >>> 2 | (char)((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) << 3 | (char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) >>> 14 | (char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) ^ var5) - var5) << 2) >>> 13) << 14) - '\uaa3b'))) + var5) - '볼') << 11) << 5) >>> 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4832513486681663986L ^ Long.rotateLeft(-7634587719319302521L, 54) ^ 5409431083689241018L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -294252972119818919L ^ Long.rotateLeft(3249744799913714823L, 58) ^ 6396193708944227569L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 437593368565210355L ^ Long.rotateLeft(3448283362971879047L, 18) ^ 1608270468743972157L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -3160244205170679411L ^ Long.rotateLeft(-3786725698263706422L, 2) ^ 5563695579245207282L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 7753101652199838654L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3732606399970468166L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 6020862043396677361L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5320032101585649709L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -2631629766541192193L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4755774611599909256L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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

   public static float[] IIlllIlliIll(illIIlllIilIIlll rig) {
      IllIIiillllIIiil var1 = iiiilIiIIIIiIi.liiiIIllIl(rig);
      return var1 == null ? null : (float[])var1.IlIIlillil.clone();
   }

   public static int IliIlllilIi(int cls) {
      return 1 << cls;
   }

   public static lIIllIiiIIllIi IIIllIIliIIl(String name) {
      IilliliilIIi();
      return name == null ? null : (lIIllIiiIIllIi)lIIlIlilliIIlIlill.get(name);
   }

   private static void lIiiIiIlilli(List<lIIllIiiIIllIi> family, String source, Supplier<List<lIIllIiiIIllIi>> out) {
      try {
         List var3 = (List)out.get();
         if (var3 != null) {
            family.addAll(var3);
         }
      } catch (Throwable var4) {
         System.err.println(Ililllililil<invokedynamic>() + source + Ililllililil<invokedynamic>() + var4);
      }

   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 10237) + var5) ^ var5) + '뺢') ^ var5) - 27179) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 10237) + var5) ^ var5) + '뺢') ^ var5) - 27179) - var5) << 3))) >>> 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 10237) + var5) ^ var5) + '뺢') ^ var5) - 27179) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) + 10237) + var5) ^ var5) + '뺢') ^ var5) - 27179) - var5) << 3))) << 9) - 'Ꙛ'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ '뙱'))) + var5) + 14971) + 19270) << 2 | (char)((char)((char)((char)(~((char)(var4[var5] ^ '뙱'))) + var5) + 14971) + 19270) >>> 14) + 9108) - '\ue363') ^ var5))) - '\ue64f') ^ var5) ^ 1701) + var5) ^ 20263));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String[] iliIiiliiiii() {
      IilliliilIIi();
      return (String[])IlIlIlillllIlIlill.clone();
   }

   public static int IiIlliIliiIl(illIIlllIilIIlll x, int nx, int z, float y, float part, float rig, float mat, float ny, float nz) {
      float var9 = Math.abs(nz);
      int var10000;
      switch (z) {
         case 0:
         case 1:
            var10000 = 0;
            break;
         case 2:
            var10000 = 1;
            break;
         case 3:
            var10000 = var9 > 0.85F ? 256 : 2;
            break;
         case 4:
            var10000 = x == illIIlllIilIIlll.ilIIIIIill && part > 6.26F ? 0 : (x == illIIlllIilIIlll.IiIIIIIill && nx == 0 && var9 < 0.3F && part > -3.05F && part < 5.0F ? (Math.abs(rig - 8.0F) < 0.3F ? 4 : 5) : 6);
            break;
         case 5:
         case 8:
         case 11:
         case 15:
         default:
            var10000 = 6;
            break;
         case 6:
         case 9:
         case 10:
            var10000 = 3;
            break;
         case 7:
            var10000 = x == illIIlllIilIIlll.ilIIIIIill ? 5 : 3;
            break;
         case 12:
            var10000 = (rig - 8.0F) * nz < 0.0F ? 4 : 3;
            break;
         case 13:
            var10000 = 5;
            break;
         case 14:
            var10000 = 7;
            break;
         case 16:
            var10000 = var9 > 0.5F ? 4 : 5;
      }

      return var10000;
   }

   static {
      lIIiiIilliIIiiIill = lliliIillililiIill | IiiliIillliiliIill | iiiliIillIIIiiIill;
      IllIIlilllllIIlill = new int[]{12239049, 14081252, 15922682, 8423057, 10660018, 6054251, 2500395, 3684928, 1579292, 5126188, 7361602, 13150308, 5527650, 11054778, 14607081, 13938522, 8097188};
   }

   public static List<lIIllIiiIIllIi> IilliliilIIi() {
      List var0 = iiiIIlillIIIlIlill;
      if (var0 != null) {
         return var0;
      } else {
         synchronized(IlIliIlllIliIl.class) {
            if (iiiIIlillIIIlIlill != null) {
               return iiiIIlillIIIlIlill;
            } else {
               ArrayList var2 = new ArrayList();
               var2.add(iIlIlllllill(Ililllililil<invokedynamic>()).build());
               lIiiIiIlilli(var2, Ililllililil<invokedynamic>(), IiIlilIlliIlilIl::IliIlllilIi);
               lIiiIiIlilli(var2, Ililllililil<invokedynamic>(), llIIIlllilIIIlll::IliIlllilIi);
               lIiiIiIlilli(var2, Ililllililil<invokedynamic>(), iliilIilIiiilIil::IliIlllilIi);
               lIiiIiIlilli(var2, Ililllililil<invokedynamic>(), IIlllIilIlllIi::IliIlllilIi);
               lIiiIiIlilli(var2, Ililllililil<invokedynamic>(), IlllIillllllIill::IliIlllilIi);
               HashMap var3 = new HashMap();
               ArrayList var4 = new ArrayList();

               for(lIIllIiiIIllIi var6 : var2) {
                  if (var6 != null && var6.iiIlllIiiIIllllIii < 0 && var3.putIfAbsent(var6.lIiIllIiiiIiIllIii, var6) == null) {
                     var6.iiIlllIiiIIllllIii = var4.size();
                     var4.add(var6);
                  }
               }

               String[] var9 = new String[var4.size()];

               for(int var10 = 0; var10 < var9.length; ++var10) {
                  var9[var10] = ((lIIllIiiIIllIi)var4.get(var10)).lIiIllIiiiIiIllIii;
               }

               lIIlIlilliIIlIlill = var3;
               IlIlIlillllIlIlill = var9;
               iiiIIlillIIIlIlill = Collections.unmodifiableList(var4);
               return iiiIIlillIIIlIlill;
            }
         }
      }
   }

   public static ililIiIlIiilIiIl iIlIlllllill(String name) {
      return new ililIiIlIiilIiIl(name);
   }

   public static int[] Illlllllilll(illIIlllIilIIlll f, lIIllIiiIIllIi rig) {
      liiilIIliiiilIIl var2 = iiiilIiIIIIiIi.IlIlllIlilIl(f, rig);
      return var2 == null ? null : new int[]{var2.IliIIIilIl, var2.lliIIIilIl, var2.iliIIIilIl, var2.IiiIIIilIl};
   }

   public static iliiillIiiiill IIillIiliIil(illIIlllIilIIlll f, lIIllIiiIIllIi rig) {
      return iiiilIiIIIIiIi.IlIllllIll(f, rig);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(~var4[var5]) ^ 3620) - var5))))) >>> 7 | (char)(~((char)(-((char)((char)((char)(~var4[var5]) ^ 3620) - var5))))) << 9) - var5) ^ 9389) ^ 6357) ^ var5))))) - '킔') ^ 28361) >>> 14 | (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)(~var4[var5]) ^ 3620) - var5))))) >>> 7 | (char)(~((char)(-((char)((char)((char)(~var4[var5]) ^ 3620) - var5))))) << 9) - var5) ^ 9389) ^ 6357) ^ var5))))) - '킔') ^ 28361) << 2) ^ var5) + '쁹'))) + '肚'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) >>> 8 | (char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) << 8) - '\uf044') << 6 | (char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) >>> 8 | (char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) << 8) - '\uf044') >>> 10) ^ var5) + '씡') ^ var5))) ^ '귥'))) ^ var5) ^ var5) - var5))) << 14 | (char)(~((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) >>> 8 | (char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) << 8) - '\uf044') << 6 | (char)((char)((char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) >>> 8 | (char)((char)((char)(-((char)(var4[var5] >>> 12 | var4[var5] << 4))) ^ var5) ^ var5) << 8) - '\uf044') >>> 10) ^ var5) + '씡') ^ var5))) ^ '귥'))) ^ var5) ^ var5) - var5))) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int[] Iilllilliill(illIIlllIilIIlll h, lIIllIiiIIllIi f, int rig, int w) {
      liiilIIliiiilIIl var4 = iiiilIiIIIIiIi.IiIlliIliiIl(h, f, rig, w);
      return var4 == null ? null : iiiilIiIIIIiIi.lIlIliIlIl(h, f, var4, false);
   }
}
