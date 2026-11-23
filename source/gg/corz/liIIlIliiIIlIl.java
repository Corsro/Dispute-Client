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
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class liIIlIliiIIlIl {
   private long lliiiiiIliliiiiiIl;
   public int ilIIIIIllIiIIIIIll;
   public final Map<iliiliIlIiiiliIl, Integer> IIlIIIIlllIlIIIIll = new LinkedHashMap();
   public int IiiiiiiIlliiiiiiIl;
   public int iiiiiiiIlIIIIIIIll;
   public int IlIIIIIllllIIIIIll;
   private ilillillIiillill iIiiiiiIlIliiiiiIl;
   public int lIIIIIIlliIIIIIIll;
   public String liIIIIIlliiIIIIIll = IiIlliIliiIl<invokedynamic>();

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '鄱') - var5) << 9 | (char)((char)(var4[var5] - '鄱') - var5) >>> 7) ^ '뙌') - '︓') - '퀞') ^ '\ude42'))))) << 12 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '鄱') - var5) << 9 | (char)((char)(var4[var5] - '鄱') - var5) >>> 7) ^ '뙌') - '︓') - '퀞') ^ '\ude42'))))) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - 4643) ^ var5))) >>> 4 | (char)(~((char)((char)((char)(var4[var5] << 12 | var4[var5] >>> 4) - 4643) ^ var5))) << 12) + 8019) + var5))) ^ 22177) ^ 19337));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIlllIlilIl() {
      this.iIiiiiiIlIliiiiiIl = null;
      this.lliiiiiIliliiiiiIl = 0L;
      this.IiiiiiiIlliiiiiiIl = this.iiiiiiiIlIIIIIIIll = this.lIIIIIIlliIIIIIIll = this.IlIIIIIllllIIIIIll = this.ilIIIIIllIiIIIIIll = 0;
      this.liIIIIIlliiIIIIIll = IiIlliIliiIl<invokedynamic>();
      this.IIlIIIIlllIlIIIIll.clear();
   }

   public void iliIiiliiiii(iliiliIlIiiiliIl failure) {
      this.IIlIIIIlllIlIIIIll.merge(failure, 1, Integer::sum);
   }

   public boolean liiiIIllIl() {
      return this.iIiiiiiIlIliiiiiIl != null;
   }

   public IlIiIiIillIiIiIi IIIllIIliIIl(ilIllillIiIllill<?> safeDestination, long action, boolean grounded, boolean placementProof, Long feet, BooleanSupplier surfaceCell) {
      if (grounded && action == safeDestination.lIiiIIiill) {
         if (!placementProof) {
            safeDestination.Illlllllilll(IiIlliIliiIl<invokedynamic>());
            return IlIiIiIillIiIiIi.iIIilIiIIi;
         } else if (!safeDestination.IlIlllIlilIl(action)) {
            return IlIiIiIillIiIiIi.iIIilIiIIi;
         } else if (safeDestination.liiiIIllIl()) {
            if (!surfaceCell.getAsBoolean()) {
               safeDestination.Illlllllilll(IiIlliIliiIl<invokedynamic>());
               return IlIiIiIillIiIiIi.iIIilIiIIi;
            } else {
               return IlIiIiIillIiIiIi.lIIilIiIIi;
            }
         } else if (safeDestination.IiliIIiill != lIIiIIiiIIiIIi.llIIiiiliilIIiiili || feet != null && feet == action) {
            safeDestination.IilliliilIIi(action);
            IlIiIiIillIiIiIi var10000;
            switch (safeDestination.IiliIIiill) {
               case IIIIiiililIIIiiili -> var10000 = IlIiIiIillIiIiIi.IiillIiIIi;
               case iIIIiiiliIlIIiiili -> var10000 = IlIiIiIillIiIiIi.liillIiIIi;
               case llIIiiiliilIIiiili -> var10000 = IlIiIiIillIiIiIi.iiillIiIIi;
               default -> var10000 = IlIiIiIillIiIiIi.IIIilIiIIi;
            }

            return var10000;
         } else {
            safeDestination.Illlllllilll(IiIlliIliiIl<invokedynamic>());
            return IlIiIiIillIiIiIi.iIIilIiIIi;
         }
      } else {
         return IlIiIiIillIiIiIi.ilillIiIIi;
      }
   }

   public boolean iIlIlllllill(Illillillllillil intent) {
      return this.iIiiiiiIlIliiiiiIl == intent.lIiiIiIlilli() && this.lliiiiiIliliiiiiIl == intent.iliIiiliiiii();
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) >>> 9 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) << 7) + 26608) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) >>> 9 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) << 7) + 26608) >>> 15) ^ '눃'))) + '첑'))) - 32221) + 27407) >>> 8 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) >>> 9 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) << 7) + 26608) << 1 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) >>> 9 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5)))) - var5) - var5) + 32651) ^ 29083) << 7) + 26608) >>> 15) ^ '눃'))) + '첑'))) - 32221) + 27407) << 8) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IilliliilIIi(String reason) {
      if (this.iIiiiiiIlIliiiiiIl != null) {
         ++this.lIIIIIIlliIIIIIIll;
         this.liIIIIIlliiIIIIIll = reason;
      }

      this.iIiiiiiIlIliiiiiIl = null;
      this.lliiiiiIliliiiiiIl = 0L;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1333573422716232952L ^ Long.rotateLeft(7730187159118642156L, 52) ^ -4543405326674000845L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5028689133438210873L ^ Long.rotateLeft(-6762248810104259874L, 18) ^ -3794641972213359652L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7911475832130454515L ^ Long.rotateLeft(7750090442479456279L, 30) ^ 3887279642445360397L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6561252234735639735L ^ Long.rotateLeft(1046895800203936766L, 43) ^ 496931642580236660L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3691899145359583453L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3036943445010917950L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4287545160414566268L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2402345748083296976L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2556804314125776201L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -928752446198471161L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIillIiliIil<invokedynamic>());
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

   public void IliIlllilIi(ilillillIiillill owner, long id) {
      if (this.iIiiiiiIlIliiiiiIl != null) {
         throw new IllegalStateException(IiIlliIliiIl<invokedynamic>());
      } else {
         this.iIiiiiiIlIliiiiiIl = owner;
         this.lliiiiiIliliiiiiIl = id;
         ++this.IiiiiiiIlliiiiiiIl;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') << 7 | (char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') >>> 9) - '\uf8fe') ^ var5) - 'ﱜ') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') << 7 | (char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') >>> 9) - '\uf8fe') ^ var5) - 'ﱜ') << 1))) >>> 13 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') << 7 | (char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') >>> 9) - '\uf8fe') ^ var5) - 'ﱜ') >>> 15 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') << 7 | (char)((char)((char)(-((char)((char)(var4[var5] ^ var5) ^ var5))) ^ var5) + '蔄') >>> 9) - '\uf8fe') ^ var5) - 'ﱜ') << 1))) << 3))) ^ 13765) ^ var5) + var5) ^ '蟂') - '\udd32'))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) >>> 14))) - var5) - var5))) - var5) ^ 'ꍅ') + var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) >>> 14))) - var5) - var5))) - var5) ^ 'ꍅ') + var5) >>> 5) - var5) >>> 13 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) >>> 14))) - var5) - var5))) - var5) ^ 'ꍅ') + var5) << 11 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)(var4[var5] - var5) >>> 8 | (char)(var4[var5] - var5) << 8) ^ '逼') + var5) - var5) ^ var5) >>> 14))) - var5) - var5))) - var5) ^ 'ꍅ') + var5) >>> 5) - var5) << 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iliiliIlIiiiliIl lIiiIiIlilli(Illillillllillil physical, Supplier<iliiliIlIiiiliIl> intent, BooleanSupplier globalRoi) {
      if (physical.IliIlllilIi() && !this.iIlIlllllill(physical)) {
         return iliiliIlIiiiliIl.lIIllIIlll;
      } else if (!physical.IliIlllilIi() && this.iIiiiiiIlIliiiiiIl != null) {
         return iliiliIlIiiiliIl.IIIllIIlll;
      } else {
         iliiliIlIiiiliIl var4 = (iliiliIlIiiiliIl)intent.get();
         if (var4 != iliiliIlIiiiliIl.IliIlIIlll) {
            return var4;
         } else if (physical.IliIlllilIi()) {
            ++this.iiiiiiiIlIIIIIIIll;
            return iliiliIlIiiiliIl.IliIlIIlll;
         } else {
            ++this.IiiiiiiIlliiiiiiIl;
            ++this.IlIIIIIllllIIIIIll;
            return globalRoi.getAsBoolean() ? iliiliIlIiiiliIl.IliIlIIlll : iliiliIlIiiiliIl.IIIllIIlll;
         }
      }
   }
}
