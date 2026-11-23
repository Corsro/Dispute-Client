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
import net.minecraft.class_1309;
import net.minecraft.class_1511;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_746;

final class IiiiliIiliiiliIi {
   boolean iIiiIiiIIi;
   final iIIlIIiIlIlIIi IlliIiiIIi;
   final ilIiliilIiIiliil IiIiIiiIIi;
   boolean iiliIiiIIi;
   final iiIllIlIIlllIl lIliIiiIIi;
   final IillIiillillIiil lIIiIiiIIi;
   final iIIlIIiIlIlIIi llliIiiIIi;
   boolean IliiIiiIIi;
   boolean lIiiIiiIIi;
   final float liIiIiiIIi;
   final int IiliIiiIIi;
   final iIIlIIiIlIlIIi iIliIiiIIi;
   final float iiIiIiiIIi;
   final int liliIiiIIi;
   final class_746 iIIiIiiIIi;
   final lIiillIiiIiillIi ilIiIiiIIi;
   final class_1309 llIiIiiIIi;
   final iIIlIIiIlIlIIi illiIiiIIi;
   final class_243 IlIiIiiIIi;
   boolean IIiiIiiIIi;
   final iiIllIlIIlllIl IIliIiiIIi;

   boolean IliIlllilIi(float full, float cost, boolean kills) {
      long var5 = 1813170640921875236L;
      if (this.IiIiIiiIIi.iiIIlIIlIl()) {
         return this.IiIiIiiIIi.lIiiIiIlilli(full, this.iiIiIiiIIi, this.IiIiIiiIIi.iliIiiliiiii(kills));
      } else {
         var5 ^= ((long)(full > 0.0F && full >= this.iiIiIiiIIi - 1.0F ? 1 : 0) << 32 ^ var5) & -1L << 32;
         return ((int)(var5 >>> 32) == 0 || this.lIIiIiiIIi.IIIIllIIIl() && kills) && cost <= this.lIIiIiiIIi.IlIlllIlilIl();
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4038255634995157981L ^ Long.rotateLeft(-6976430554470083091L, 36) ^ -5078566257170141786L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8762590975258986956L ^ Long.rotateLeft(285530176299604349L, 12) ^ -8103494420631000283L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8163473114490959271L ^ Long.rotateLeft(558767274010411786L, 47) ^ 7454726708425161921L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -9128497471498321654L ^ Long.rotateLeft(8705352552912357628L, 30) ^ -6215394052792145644L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 2577965470983008055L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8217022986194054663L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 2297430585755838406L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1214775771621924798L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6310296958430147869L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4139393316324662863L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   double IiIlliIliiIl(class_243 point) {
      float[] var2 = ilIiiIiIii.Ililllililil(this.IlIiIiiIIi, point);
      return liiIIliliiiIIlil.Iilllilliill(this.lIIiIiiIIi.Iiilliiliiil(), this.lIIiIiiIIi.IIIilIIiiIIi(), var2[0], var2[1]);
   }

   boolean IlIlllIlilIl(class_243 centre) {
      return this.lIIiIiiIIi.iIIIlIlIIl() != null && this.lIIiIiiIIi.iIIIlIlIIl().test(centre);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - '艿'))) ^ '킇') + '뤲'))) ^ var5) + 16997) - 27971))) ^ var5))))) + var5) + var5) >>> 1 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - '艿'))) ^ '킇') + '뤲'))) ^ var5) + 16997) - 27971))) ^ var5))))) + var5) + var5) << 15) << 1 | (char)((char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - '艿'))) ^ '킇') + '뤲'))) ^ var5) + 16997) - 27971))) ^ var5))))) + var5) + var5) >>> 1 | (char)((char)((char)(~((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(~((char)(var4[var5] - '艿'))) ^ '킇') + '뤲'))) ^ var5) + 16997) - 27971))) ^ var5))))) + var5) + var5) << 15) >>> 15) ^ var5) + '\uec8c'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) + var5) << 6 | (char)((char)(var4[var5] << 14 | var4[var5] >>> 2) + var5) >>> 10) ^ var5) ^ '膫'))) ^ var5)) - '錞') - var5) + '郀'))) + var5) ^ var5) ^ '髤'))))) << 5 | (char)(~((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 14 | var4[var5] >>> 2) + var5) << 6 | (char)((char)(var4[var5] << 14 | var4[var5] >>> 2) + var5) >>> 10) ^ var5) ^ '膫'))) ^ var5)) - '錞') - var5) + '郀'))) + var5) ^ var5) ^ '髤'))))) >>> 11))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   float Illlllllilll(class_243 virtualSolid, class_2338 centre) {
      float var3 = lllIliIlillIliIl.IlIllllIll(this.iIIiIiiIIi, virtualSolid, this.iIIiIiiIIi.method_73189(), this.iIIiIiiIIi.method_5829(), centre, (class_2338)null, 6.0F);
      return this.lIIiIiiIIi.IIlilIliiIli() == null ? var3 : Math.max(var3, lllIliIlillIliIl.IlIllllIll(this.iIIiIiiIIi, virtualSolid, this.IlliIiiIIi.IliIlllilIi(), this.IlliIiiIIi.liiiIIllIl(), centre, (class_2338)null, 6.0F));
   }

   boolean IIIllIIliIIl(class_1511 crystal) {
      long var5 = -7291644872692649694L;
      if (crystal != null && crystal.method_5805() && !crystal.method_31481() && this.lIiiIiIlilli(crystal)) {
         var5 ^= ((long)crystal.method_5628() << 32 ^ var5) & -1L << 32;
         if (!this.lIIiIiiIIi.Illlllllilll().IIlilIliiIli((int)(var5 >>> 32), this.lIIiIiiIIi.Iilllilliill()) && !this.lIIiIiiIIi.Illlllllilll().IiIiliIiiiIi((int)(var5 >>> 32), this.lIIiIiiIIi.IIillIiliIil(), this.lIIiIiiIIi.Ililllililil())) {
            class_238 var3 = crystal.method_5829();
            if (lllIliIlillIliIl.IIlilIliiIli(this.IlIiIiiIIi, var3) >= (double)3.0F) {
               return false;
            } else if (lllIliIlillIliIl.Iiiiliiiiiii(var3, crystal, this.IlIiIiiIIi, this.lIIiIiiIIi.Iiilliiliiil(), this.lIIiIiiIIi.IIIilIIiiIIi(), (double)3.0F) == null) {
               return false;
            } else if (this.IlIlllIlilIl(crystal.method_73189())) {
               return false;
            } else {
               IiIilIllliIilIll var4 = this.Ililllililil(crystal);
               return var4.IIIllIIliIIl() && (iiIiiliIIliili.Ililllililil(var4.IliIlllilIi(), var4.IilliliilIIi(), var4.iliIiiliiiii(), this.ilIiIiiIIi) || this.IiIiIiiIIi.Ililllililil(var4.IliIlllilIi(), var4.IiIlliIliiIl(), var4.IilliliilIIi()));
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 6787)) << 9 | (char)((char)((char)(var4[var5] + var5) - 6787)) >>> 7))))) - 24014))) ^ 22744) ^ '\uf6ad') + 24808) >>> 1 | (char)((char)((char)((char)(-((char)((char)(-((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 6787)) << 9 | (char)((char)((char)(var4[var5] + var5) - 6787)) >>> 7))))) - 24014))) ^ 22744) ^ '\uf6ad') + 24808) << 15) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   float IIillIiliIil(float sS, float knock, class_243 centre) {
      return !this.IiIiIiiIIi.iIIIlIlIIl() ? sS : this.IiIiIiiIIi.Iilililiiili(sS, iiIiiliIIliili.iIlIlllllill(knock, this.lIliIiiIIi, 6.0F), ilIiliilIiIiliil.IIiilIiiiIii(this.IlIiIiiIIi.field_1351 - centre.field_1351, this.IlIiIiiIIi.method_1022(centre)));
   }

   boolean IilliliilIIi(float full, float cost, float kills, float pops, boolean now, boolean dealt, boolean knock) {
      if (this.IiIiIiiIIi.iiIIlIIlIl()) {
         return this.IiIiIiiIIi.lIiiIiIlilli(full, this.iiIiIiiIIi, this.IiIiIiiIIi.IIIllIIliIIl(dealt, knock && now)) && this.IiIiIiiIIi.IIlllIlliIll(kills, now, full, cost, false);
      } else {
         return this.IiIiIiiIIi.IiIiliIiiiIi(kills, pops, now, this.liIiIiiIIi, full, cost, this.iiIiIiiIIi) || this.liiiIIllIl(full, cost, kills, now, dealt);
      }
   }

   IiiiliIiliiiliIi(IillIiillillIiil r) {
      long var4 = 3352521251082894831L;
      super();
      this.lIIiIiiIIi = r;
      this.iIIiIiiIIi = Ililiiillliliiil.IIllilIiil.field_1724;
      this.IlIiIiiIIi = this.iIIiIiiIIi.method_33571();
      this.llIiIiiIIi = r.IilliliilIIi();
      this.ilIiIiiIIi = r.IiIiliIiiiIi() != null ? r.IiIiliIiiiIi() : lIiillIiiIiillIi.IliIlllilIi();
      this.IiIiIiiIIi = this.ilIiIiiIIi.lIilliIill();
      this.liIiIiiIIi = Float.isNaN(r.Iliilliiilii()) ? this.llIiIiiIIi.method_6032() + this.llIiIiiIIi.method_6067() : r.Iliilliiilii();
      this.iiIiIiiIIi = this.iIIiIiiIIi.method_6032() + this.iIIiIiiIIi.method_6067();
      this.IIliIiiIIi = lllIliIlillIliIl.iiiIlIIIll(this.llIiIiiIIi);
      this.lIliIiiIIi = lllIliIlillIliIl.iiiIlIIIll(this.iIIiIiiIIi);
      this.iIliIiiIIi = r.lIiiIiIlilli() != null ? r.lIiiIiIlilli() : new iIIlIIiIlIlIIi(this.llIiIiiIIi.method_73189(), this.llIiIiiIIi.method_5829());
      this.IlliIiiIIi = r.IIlilIliiIli() != null ? r.IIlilIliiIli() : new iIIlIIiIlIlIIi(this.iIIiIiiIIi.method_73189(), this.iIIiIiiIIi.method_5829());
      class_243 var2 = r.Illillliilli();
      var4 ^= ((long)(var2 != null && var2.method_1033() > 0.001 ? 1 : 0) << 32 ^ var4) & -1L << 32;
      this.llliIiiIIi = (int)(var4 >>> 32) != 0 ? lllIliIlillIliIl.IIllllIlll(this.iIliIiiIIi, var2) : null;
      this.illiIiiIIi = (int)(var4 >>> 32) != 0 ? lllIliIlillIliIl.IIllllIlll(this.iIliIiiIIi, var2.method_1021((double)-1.0F)) : null;
      this.IiliIiiIIi = Math.max(0, r.Ililllililil());
      this.liliIiiIIi = this.IiliIiiIIi + 1;
   }

   boolean iIlIlllllill(float knock, float full, float pops, float dealt, boolean kills, boolean cost) {
      return this.IilliliilIIi(knock, full, pops, dealt, kills, cost, false);
   }

   IiIilIllliIilIll Ililllililil(class_1511 crystal) {
      long var17 = 8793961498727939133L;
      long var19 = -684634050970482581L;
      class_243 var2 = crystal.method_73189();
      float var3 = lllIliIlillIliIl.IlIllllIll(this.iIIiIiiIIi, var2, this.iIIiIiiIIi.method_73189(), this.iIIiIiiIIi.method_5829(), (class_2338)null, (class_2338)null, 6.0F);
      float var4 = iiIiiliIIliili.lIiiIiIlilli(var3, this.lIliIiiIIi);
      float var5 = iiIiiliIIliili.iliIiiliiiii(var3, this.lIliIiiIIi, this.lIIiIiiIIi.IIiilIiiiIii(), 0);
      float var6 = Ililiiillliliiil.Iliilliiilii(this.llIiIiiIIi, var2) ? 0.0F : lllIliIlillIliIl.IlIllllIll(this.llIiIiiIIi, var2, this.iIliIiiIIi.IliIlllilIi(), this.iIliIiiIIi.liiiIIllIl(), (class_2338)null, (class_2338)null, 6.0F);
      float var7 = iiIiiliIIliili.IilliliilIIi(var6, this.IIliIiiIIi, this.lIIiIiiIIi.Iilililiiili(), 0, this.IiIiIiiIIi.iIIIlIlIIl());
      float var8 = this.IiIiIiiIIi.iIIIlIlIIl() ? iiIiiliIIliili.iIlIlllllill(var6, this.IIliIiiIIi, 6.0F) : 0.0F;
      var17 ^= ((long)iiIiiliIIliili.IlIlllIlilIl(var7, this.liIiIiiIIi) << 32 ^ var17) & -1L << 32;
      var17 ^= ((long)((int)(var17 >>> 32) != 0 && !this.lIIiIiiIIi.Iiiiliiiiiii() ? 1 : 0) ^ var17) & -1L >>> 32;
      var19 ^= ((long)(this.lIIiIiiIIi.Illlllllilll() != null && this.lIIiIiiIIi.Illlllllilll().IIillIiliIil(lllIliIlillIliIl.iliIiiliiiii(crystal).method_10063(), this.lIIiIiiIIi.Iilllilliill()) ? 1 : 0) << 32 ^ var19) & -1L << 32;
      double var12 = iiIiiliIIliili.Iilllilliill((boolean)((int)(var19 >>> 32)), var4, var5, this.ilIiIiiIIi);
      var19 ^= ((long)this.IilliliilIIi(this.IiIiIiiIIi.IlIlllIlilIl(var4, var5), var5, var7, var8, (boolean)((int)(var17 >>> 32)), (boolean)((int)var17), true) ^ var19) & -1L >>> 32;
      if ((int)var19 == 0 && (int)(var19 >>> 32) == 0) {
         var19 ^= ((long)this.iliIiiliiiii(var4, var5, (boolean)((int)var17)) ^ var19) & -1L >>> 32;
      }

      double var15 = iiIiiliIIliili.IIillIiliIil(var7, (boolean)((int)(var17 >>> 32)), (boolean)((int)var17), var5, var12, this.ilIiIiiIIi) + Math.max((double)0.0F, Ililiiillliliiil.Iilililiiili(this, var2)) + (double)this.IiIiIiiIIi.Illillliilli(var8);
      return new IiIilIllliIilIll(var7, var4, var5, (boolean)((int)(var17 >>> 32)), (boolean)((int)var17), var12, (boolean)((int)var19), var15, var8);
   }

   boolean lIiiIiIlilli(class_1511 crystal) {
      return this.lIIiIiiIIi.Illlllllilll() != null && this.lIIiIiiIIi.Illlllllilll().IIillIiliIil(lllIliIlillIliIl.iliIiiliiiii(crystal).method_10063(), this.lIIiIiiIIi.Iilllilliill());
   }

   String Iiilliiliiil() {
      if (this.iiliIiiIIi) {
         return IIIilIIiiIIi<invokedynamic>();
      } else if (this.IIiiIiiIIi) {
         return IIIilIIiiIIi<invokedynamic>();
      } else if (this.lIiiIiiIIi) {
         return IIIilIIiiIIi<invokedynamic>();
      } else if (this.lIIiIiiIIi.IiIlliIliiIl() && !this.lIIiIiiIIi.IIlllIlliIll()) {
         return IIIilIIiiIIi<invokedynamic>();
      } else if (!lllIliIlillIliIl.IlIlllIlilIl()) {
         return IIIilIIiiIIi<invokedynamic>();
      } else if (this.iIiiIiiIIi) {
         return IIIilIIiiIIi<invokedynamic>();
      } else {
         return this.IliiIiiIIi ? IIIilIIiiIIi<invokedynamic>() : IIIilIIiiIIi<invokedynamic>();
      }
   }

   float IIlllIlliIll(class_243 centre, class_2338 virtualSolid, boolean robust) {
      if (Ililiiillliliiil.Iliilliiilii(this.llIiIiiIIi, centre)) {
         return 0.0F;
      } else {
         float var4 = lllIliIlillIliIl.IlIllllIll(this.llIiIiiIIi, centre, this.iIliIiiIIi.IliIlllilIi(), this.iIliIiiIIi.liiiIIllIl(), virtualSolid, (class_2338)null, 6.0F);
         if (robust && this.llliIiiIIi != null) {
            float var5 = lllIliIlillIliIl.IlIllllIll(this.llIiIiiIIi, centre, this.llliIiiIIi.IliIlllilIi(), this.llliIiiIIi.liiiIIllIl(), virtualSolid, (class_2338)null, 6.0F);
            float var6 = lllIliIlillIliIl.IlIllllIll(this.llIiIiiIIi, centre, this.illiIiiIIi.IliIlllilIi(), this.illiIiiIIi.liiiIIllIl(), virtualSolid, (class_2338)null, 6.0F);
            return 0.5F * var4 + 0.25F * var5 + 0.25F * var6;
         } else {
            return var4;
         }
      }
   }

   boolean iliIiiliiiii(float kills, float cost, boolean full) {
      return this.IiIiIiiIIi.IiIlliIliiIl(kills, cost) && this.IiIiIiiIIi.lIiiIiIlilli(this.IiIiIiiIIi.IlIlllIlilIl(kills, cost), this.iiIiIiiIIi, this.IiIiIiiIIi.iliIiiliiiii(full));
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) - '褀') - '얰') + 23635) ^ var5) ^ '\uf72f') - var5) - var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) - '褀') - '얰') + 23635) ^ var5) ^ '\uf72f') - var5) - var5) ^ var5) >>> 14) >>> 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) - '褀') - '얰') + 23635) ^ var5) ^ '\uf72f') - var5) - var5) ^ var5) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 2 | var4[var5] >>> 14) ^ var5) - '褀') - '얰') + 23635) ^ var5) ^ '\uf72f') - var5) - var5) ^ var5) >>> 14) << 14) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   ililIiilIiilIiil Iilllilliill(class_243 minFilter, class_2338 land, boolean centre, int virtualSolid, boolean robust) {
      long var14 = 1375304071368499604L;
      float var6 = this.IIlllIlliIll(minFilter, land, centre);
      float var7 = iiIiiliIIliili.IilliliilIIi(var6, this.IIliIiiIIi, this.lIIiIiiIIi.Iilililiiili(), virtualSolid, this.IiIiIiiIIi.iIIIlIlIIl());
      float var8 = this.IiIiIiiIIi.iIIIlIlIIl() ? iiIiiliIIliili.iIlIlllllill(var6, this.IIliIiiIIi, 6.0F) : 0.0F;
      var14 ^= ((long)iiIiiliIIliili.IlIlllIlilIl(var7, this.liIiIiiIIi) << 32 ^ var14) & -1L << 32;
      var14 ^= ((long)((int)(var14 >>> 32) != 0 && !this.lIIiIiiIIi.Iiiiliiiiiii() ? 1 : 0) ^ var14) & -1L >>> 32;
      if (robust && var7 < this.ilIiIiiIIi.Iiiiliiiiiii() && (int)(var14 >>> 32) == 0 && !this.IiIiIiiIIi.Ililllililil(var7, var8, false)) {
         this.iiliIiiIIi = true;
         return null;
      } else {
         float var11 = this.Illlllllilll(minFilter, land);
         float var12 = iiIiiliIIliili.lIiiIiIlilli(var11, this.lIliIiiIIi);
         float var13 = iiIiiliIIliili.iliIiiliiiii(var11, this.lIliIiiIIi, this.lIIiIiiIIi.IIiilIiiiIii(), virtualSolid);
         return new ililIiilIiilIiil(var7, var12, var13, (boolean)((int)(var14 >>> 32)), (boolean)((int)var14), this.IIillIiliIil(var8, var11, minFilter));
      }
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '鋾'))) ^ var5))) - 4005) - 29594) + 7041) + '\udfa2') - '\ud976') >>> 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '鋾'))) ^ var5))) - 4005) - 29594) + 7041) + '\udfa2') - '\ud976') << 11)) ^ var5) << 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '鋾'))) ^ var5))) - 4005) - 29594) + 7041) + '\udfa2') - '\ud976') >>> 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) ^ '鋾'))) ^ var5))) - 4005) - 29594) + 7041) + '\udfa2') - '\ud976') << 11)) ^ var5) >>> 5) - var5) - var5) - var5) - var5) + 25568));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   boolean liiiIIllIl(float pops, float cost, float dealt, boolean kills, boolean full) {
      if (this.IiIiIiiIIi.iiIIlIIlIl()) {
         return this.IiIiIiiIIi.lIiiIiIlilli(pops, this.iiIiIiiIIi, this.IiIiIiiIIi.iliIiiliiiii(full));
      } else if (!this.ilIiIiiIIi.iIlllIllll()) {
         return this.IliIlllilIi(pops, cost, full);
      } else {
         return iiIiiliIIliili.IiIlliIliiIl(dealt, cost, pops, kills, full, this.lIIiIiiIIi.IIIIllIIIl(), this.ilIiIiiIIi.Iillllilll(), this.iiIiIiiIIi, this.ilIiIiiIIi.lllllillll()) && cost <= this.lIIiIiiIIi.IlIlllIlilIl();
      }
   }
}
