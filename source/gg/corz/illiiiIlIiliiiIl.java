package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class illiiiIlIiliiiIl {
   private final LinkedHashMap<Long, liIIiiiIIi> liIiIiIlll = new LinkedHashMap<Long, liIIiiiIIi>(this, 16, false) {
      protected boolean removeEldestEntry(Map.Entry<Long, liIIiiiIIi> e) {
         return this.size() > 256;
      }
   };
   public static final long ilIiIiIlll = Long.MIN_VALUE;
   public static final int IiIiIiIlll = 256;
   private liIIiiiIIi IIliIiIlll;
   private final int[] iiIiIiIlll = new int[IiiIiIIlliiIiIIl.values().length];

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - '춲') << 1 | (char)((char)(var4[var5] + var5) - '춲') >>> 15) + 19884) >>> 11 | (char)((char)((char)((char)(var4[var5] + var5) - '춲') << 1 | (char)((char)(var4[var5] + var5) - '춲') >>> 15) + 19884) << 5) + var5))) - var5) + 23662) ^ '\uf3ea') - 822));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.liIiIiIlll.size();
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) >>> 5 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) << 11) >>> 2 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) >>> 5 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) << 11) << 14) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) >>> 5 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) << 11) >>> 2 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) >>> 5 | (char)(-((char)((char)((char)((char)(-((char)((char)(var4[var5] - '쎄') ^ var5))) + var5) + var5) - 19623))) << 11) << 14) << 2) + '\ued17') ^ var5) - var5) ^ 18920))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int IIIllIIliIIl(IiiIiIIlliiIiIIl cls) {
      return cls == null ? 0 : this.iiIiIiIlll[cls.ordinal()];
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) >>> 14 | (char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) << 2) - 31908) ^ 25305) >>> 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) >>> 14 | (char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) << 2) - 31908) ^ 25305) << 15) - var5) + var5))) + var5) + var5) ^ 29775) ^ '鸑') ^ '쇳') - var5) << 12 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) >>> 14 | (char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) << 2) - 31908) ^ 25305) >>> 1 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) >>> 14 | (char)((char)(~((char)((char)((char)(-var4[var5]) + var5) - var5))) - 12645) << 2) - 31908) ^ 25305) << 15) - var5) + var5))) + var5) + var5) ^ 29775) ^ '鸑') ^ '쇳') - var5) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static liIIiiiIIi liiiIIllIl(String why) {
      return new liIIiiiIIi(IiiIiIIlliiIiIIl.lllllIilIl, Long.MIN_VALUE, why);
   }

   public String IiIlliIliiIl() {
      return String.format(Locale.ROOT, Illlllllilll<invokedynamic>(), this.liIiIiIlll.size(), this.IIIllIIliIIl(IiiIiIIlliiIiIIl.IIlllIilIl), this.IIIllIIliIIl(IiiIiIIlliiIiIIl.lIlllIilIl), this.IIIllIIliIIl(IiiIiIIlliiIiIIl.iIlllIilIl), this.IIIllIIliIIl(IiiIiIIlliiIiIIl.IllllIilIl), this.IIIllIIliIIl(IiiIiIIlliiIiIIl.lllllIilIl), this.IIliIiIlll == null ? Illlllllilll<invokedynamic>() : iIlIlllllill(this.IIliIiIlll));
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3533181202662154265L ^ Long.rotateLeft(-6703721155848354838L, 58) ^ -1302597438799038155L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7260718272911274370L ^ Long.rotateLeft(5257649754585868132L, 17) ^ -87259684481863120L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8695051146772076640L ^ Long.rotateLeft(4863982647729903909L, 18) ^ -4274390493665596099L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 1659717221704957111L ^ Long.rotateLeft(1846614530950556781L, 32) ^ -605663665298246190L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6196935895588307601L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5894913363341157573L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -5753618958398075154L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -5243045673144705354L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 128472637197030279L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2323138035061051107L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 11 | (char)(-var4[var5]) << 5) - 14383) ^ '믉') ^ '챆') - var5))) - var5) - '졢') ^ '芟') >>> 15 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 11 | (char)(-var4[var5]) << 5) - 14383) ^ '믉') ^ '챆') - var5))) - var5) - '졢') ^ '芟') << 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - 13315))) + 15266) - 19437) ^ 22744) + var5) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - 13315))) + 15266) - 19437) ^ 22744) + var5) << 14) + var5))) - 13227) - var5) >>> 10 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - 13315))) + 15266) - 19437) ^ 22744) + var5) >>> 2 | (char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 4 | var4[var5] << 12) - 13315))) + 15266) - 19437) ^ 22744) + var5) << 14) + var5))) - 13227) - var5) << 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liIIiiiIIi IlIlllIlilIl() {
      return this.IIliIiIlll;
   }

   public static liIIiiiIIi IliIlllilIi(long inWalkComponent, boolean futureSchematicCell, boolean routeCertified, boolean stand, boolean standableNow, boolean constructivePlanCertified) {
      if (inWalkComponent == Long.MIN_VALUE) {
         return liiiIIllIl(Illlllllilll<invokedynamic>());
      } else if (futureSchematicCell && stand) {
         return new liIIiiiIIi(IiiIiIIlliiIiIIl.IIlllIilIl, inWalkComponent, Illlllllilll<invokedynamic>());
      } else if (futureSchematicCell && standableNow) {
         return new liIIiiiIIi(IiiIiIIlliiIiIIl.IIlllIilIl, inWalkComponent, Illlllllilll<invokedynamic>());
      } else if (routeCertified) {
         return new liIIiiiIIi(IiiIiIIlliiIiIIl.IllllIilIl, inWalkComponent, Illlllllilll<invokedynamic>());
      } else if (futureSchematicCell) {
         return constructivePlanCertified ? new liIIiiiIIi(IiiIiIIlliiIiIIl.lIlllIilIl, inWalkComponent, Illlllllilll<invokedynamic>()) : new liIIiiiIIi(IiiIiIIlliiIiIIl.iIlllIilIl, inWalkComponent, Illlllllilll<invokedynamic>());
      } else {
         return constructivePlanCertified ? new liIIiiiIIi(IiiIiIIlliiIiIIl.lIlllIilIl, inWalkComponent, Illlllllilll<invokedynamic>()) : liiiIIllIl(Illlllllilll<invokedynamic>());
      }
   }

   public void IIlllIlliIll() {
      this.liIiIiIlll.clear();
      Arrays.fill(this.iiIiIiIlll, 0);
      this.IIliIiIlll = null;
   }

   public liIIiiiIIi lIiiIiIlilli(long stand) {
      return (liIIiiiIIi)this.liIiIiIlll.get(stand);
   }

   public static String iIlIlllllill(liIIiiiIIi v) {
      if (v == null) {
         return Illlllllilll<invokedynamic>();
      } else {
         String var1 = v.IilliliilIIi() ? llIiIiililIiIiil.IiIlliIliiIl(v.iliIiiliiiii()) + Illlllllilll<invokedynamic>() + llIiIiililIiIiil.IIlllIlliIll(v.iliIiiliiiii()) + Illlllllilll<invokedynamic>() + llIiIiililIiIiil.Illlllllilll(v.iliIiiliiiii()) : Illlllllilll<invokedynamic>();
         return v.lIiiIiIlilli() + Illlllllilll<invokedynamic>() + var1 + Illlllllilll<invokedynamic>() + v.IIIllIIliIIl() + Illlllllilll<invokedynamic>();
      }
   }

   public liIIiiiIIi IilliliilIIi(liIIiiiIIi v) {
      if (v == null) {
         return null;
      } else {
         this.IIliIiIlll = v;
         int var10002 = this.iiIiIiIlll[v.lIiiIiIlilli().ordinal()]++;
         if (v.IilliliilIIi()) {
            this.liIiIiIlll.put(v.iliIiiliiiii(), v);
         }

         return v;
      }
   }
}
