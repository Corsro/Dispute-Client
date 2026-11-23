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

public final class ililIiIlIiilIiIl {
   private final String illiIliIll;
   private final List<ilIIililIiIIilil> iIiiIliIll = new ArrayList();
   private final List<ilIIililIiIIilil> IliiIliIll = new ArrayList();
   private int IiliIliIll;
   private final int[] lIiiIliIll = new int[-201902922 - 1 + 109 ^ -201902806];
   private final int[] IIiiIliIll = new int[((-1696614433 * 81 << 7 | -1696614433 * 81 >>> 25) + 73) * -79 ^ -176662287];
   private final int[] iiliIliIll = new int[-(153318808 * -115) ^ 451793728];
   private final byte[] liliIliIll = new byte[(1402725193 ^ 15) + 63 ^ 1402725261];

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5102805863689862813L ^ Long.rotateLeft(7301447961733592137L, 10) ^ -5965203238333988568L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4122580698537633021L ^ Long.rotateLeft(-1072208620133303589L, 33) ^ -765590813523792464L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 4947949549871372944L ^ Long.rotateLeft(-3697689313167245631L, 28) ^ 7406055456987190163L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -751608697465414461L ^ Long.rotateLeft(24283715712912976L, 52) ^ 8411591603960590732L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6112147671172979720L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 649559728258865990L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2293905405979648578L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 7186736119307317510L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4038131701417830157L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5704079729452634651L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, lIiiIiIlilli<invokedynamic>());
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

   public ililIiIlIiilIiIl recolor(int argb, int classes) {
      for(int var3 = 0; var3 < 8; ++var3) {
         if ((argb & IlIliIlllIliIl.IliIlllilIi(var3)) != 0) {
            this.liliIliIll[var3] = 1;
            this.iiliIliIll[var3] = -16777216 | classes;
            this.IIiiIliIll[var3] = -1;
         }
      }

      return this;
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) + var5) - 5489) + 31564) >>> 13 | (char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) + var5) - 5489) + 31564) << 3) >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) + var5) - 5489) + 31564) >>> 13 | (char)((char)((char)((char)((char)(~((char)(var4[var5] - var5))) + var5) + var5) - 5489) + 31564) << 3) << 3) - 13907) - '蔟') + '褰'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ililIiIlIiilIiIl glow(int classes, lilIiiiliilIiiil p) {
      int var3 = this.IliiIliIll.size();
      this.IliiIliIll.add(new ilIIililIiIIilil(classes & IlIliIlllIliIl.lIIiiIilliIIiiIill, p));

      for(int var4 = 0; var4 < 8; ++var4) {
         if ((classes & IlIliIlllIliIl.IliIlllilIi(var4)) != 0) {
            this.lIiiIliIll[var4] = p == null ? -1 : var3;
         }
      }

      return this;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - '줲') >>> 11 | (char)((char)((char)(-((char)(~var4[var5]))) - var5) - '줲') << 5) + var5) - 22122) ^ var5))) - var5) + var5) << 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(~var4[var5]))) - var5) - '줲') >>> 11 | (char)((char)((char)(-((char)(~var4[var5]))) - var5) - '줲') << 5) + var5) - 22122) ^ var5))) - var5) + var5) >>> 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ililIiIlIiilIiIl paint(int classes, lilIiiiliilIiiil p) {
      if (p == null) {
         throw new IllegalArgumentException(IliIlllilIi<invokedynamic>());
      } else {
         int var3 = this.iIiiIliIll.size();
         this.iIiiIliIll.add(new ilIIililIiIIilil(classes & IlIliIlllIliIl.lIIiiIilliIIiiIill, p));

         for(int var4 = 0; var4 < 8; ++var4) {
            if ((classes & IlIliIlllIliIl.IliIlllilIi(var4)) != 0) {
               this.liliIliIll[var4] = 2;
               this.IIiiIliIll[var4] = var3;
            }
         }

         return this;
      }
   }

   private static ilIIililIiIIilil[] compact(List<ilIIililIiIIilil> map, int[] in) {
      ArrayList var2 = new ArrayList();
      int[] var3 = new int[map.size()];
      Arrays.fill(var3, -1);

      for(int var4 = 0; var4 < 8; ++var4) {
         int var5 = in[var4];
         if (var5 >= 0) {
            if (var3[var5] < 0) {
               var3[var5] = var2.size();
               var2.add(new ilIIililIiIIilil(0, ((ilIIililIiIIilil)map.get(var5)).liiiIIllIl()));
            }

            in[var4] = var3[var5];
         }
      }

      for(int var6 = 0; var6 < 8; ++var6) {
         if (in[var6] >= 0) {
            ilIIililIiIIilil var7 = (ilIIililIiIIilil)var2.get(in[var6]);
            var2.set(in[var6], new ilIIililIiIIilil(var7.IliIlllilIi() | IlIliIlllIliIl.IliIlllilIi(var6), var7.liiiIIllIl()));
         }
      }

      return (ilIIililIiIIilil[])var2.toArray(new ilIIililIiIIilil[0]);
   }

   private ililIiIlIiilIiIl(String name) {
      if (name != null && !name.isBlank()) {
         this.illiIliIll = name;
         this.IiliIliIll = name.hashCode() * ((2102047455 + -93 - -3 >>> 25 | 2102047455 + -93 - -3 << 7) ^ 997079823);
         Arrays.fill(this.IIiiIliIll, -1);
         Arrays.fill(this.lIiiIliIll, -1);
      } else {
         throw new IllegalArgumentException(IliIlllilIi<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '骠'))))) ^ '\uefa7'))) ^ var5) - 29738) >>> 12 | (char)((char)((char)(~((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '骠'))))) ^ '\uefa7'))) ^ var5) - 29738) << 4) >>> 4 | (char)((char)((char)((char)(~((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '骠'))))) ^ '\uefa7'))) ^ var5) - 29738) >>> 12 | (char)((char)((char)(~((char)((char)(~((char)(~((char)((char)(-((char)(var4[var5] + var5))) ^ '骠'))))) ^ '\uefa7'))) ^ var5) - 29738) << 4) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ililIiIlIiilIiIl seed(int seed) {
      this.IiliIliIll = seed;
      return this;
   }

   public ililIiIlIiilIiIl keep(int classes) {
      for(int var2 = 0; var2 < 8; ++var2) {
         if ((classes & IlIliIlllIliIl.IliIlllilIi(var2)) != 0) {
            this.liliIliIll[var2] = 0;
            this.IIiiIliIll[var2] = -1;
         }
      }

      return this;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) << 12) - var5) >>> 1 | (char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) << 12) - var5) << 15) + 3385) ^ 30615) + '鰡') + '틈') + 32711) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) << 12) - var5) >>> 1 | (char)((char)((char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 13 | (char)(-var4[var5]) << 3) - var5) << 12) - var5) << 15) + 3385) ^ 30615) + '鰡') + '틈') + 32711) >>> 4) ^ 16941) + var5) + 19014) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIIllIiiIIllIi build() {
      int[] var1 = (int[])this.IIiiIliIll.clone();
      int[] var2 = (int[])this.lIiiIliIll.clone();
      return new lIIllIiiIIllIi(this.illiIliIll, this.IiliIliIll, (byte[])this.liliIliIll.clone(), (int[])this.iiliIliIll.clone(), var1, var2, compact(this.iIiiIliIll, var1), compact(this.IliiIliIll, var2));
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) << 9) + 24607) ^ '폖') ^ var5))) ^ var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) << 9) + 24607) ^ '폖') ^ var5))) ^ var5) << 8))) - '鰁') ^ var5) - 19393) << 4 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) << 9) + 24607) ^ '폖') ^ var5))) ^ var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) >>> 7 | (char)((char)((char)((char)((char)(var4[var5] + var5) - '\ue2b4') + '餟') + var5) + var5) << 9) + 24607) ^ '폖') ^ var5))) ^ var5) << 8))) - '鰁') ^ var5) - 19393) >>> 12) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
