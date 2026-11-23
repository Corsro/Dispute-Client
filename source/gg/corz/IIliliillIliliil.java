package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class IIliliillIliliil {
   String iIiiIIIiil = "";
   final IIIlliIllIIlliIl lIliIIIiil;
   Runnable IIiiIIIiil;
   String lIiiIIIiil = "";
   final String llliIIIiil;
   final String IiliIIIiil;
   float liiiIIIiil;
   float iliiIIIiil = -1.0F;
   final String IlliIIIiil;
   final boolean iiliIIIiil;
   String IliiIIIiil = "";
   String lliiIIIiil = "";
   final String iIliIIIiil;
   float IiiiIIIiil = -1.0F;
   final String illiIIIiil;
   final String liliIIIiil;

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) - 21023) - var5) - var5))) ^ var5) + var5) - '\ue7af') ^ 23496) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1846184818502636602L ^ Long.rotateLeft(-6623016156976170640L, 21) ^ 400557351825344578L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 621966949244871023L ^ Long.rotateLeft(926536710717020244L, 21) ^ -4144399721748933148L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6614016411292610296L ^ Long.rotateLeft(3843578268785145363L, 3) ^ -3792643229530686485L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7335073333554859372L ^ Long.rotateLeft(7329627486277255994L, 57) ^ -970208866695071129L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1875119816010968945L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -295382809606589781L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8680636631160810044L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5958145272693090453L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7035333764677421722L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 113482097098182560L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iIlIlllllill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IilliliilIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, lIiiIiIlilli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, iliIiiliiiii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIllIIliIIl<invokedynamic>());
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

   void IliIlllilIi(IIliiIlllIliiIll nameW, float font, float lineW) {
      if (font != this.iliiIIIiil || lineW != this.IiiiIIIiil) {
         this.iliiIIIiil = font;
         this.IiiiIIIiil = lineW;
         this.lIiiIIIiil = nameW.Iiilliiliiil(this.lIliIIIiil.liiiIIllIl(), font);
         this.iIiiIIIiil = this.lIliIIIiil.IilliliilIIi().isEmpty() ? "" : nameW.Iiilliiliiil(this.lIliIIIiil.IilliliilIIi(), (font - 10.0F) / 0.78F);
         this.IliiIIIiil = nameW.Iiilliiliiil(this.lIliIIIiil.lIiiIiIlilli().isEmpty() ? liiiIIllIl<invokedynamic>() : this.lIliIIIiil.lIiiIiIlilli(), lineW / 0.82F);
         this.lliiIIIiil = llilliilililliil.IiIilliIil(this.IiliIIIiil) <= lineW ? this.IiliIIIiil : this.liliIIIiil;
         this.liiiIIIiil = nameW.iIlIlllllill(this.illiIIIiil);
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) + '뛷') ^ var5) + var5))) + '샄'))) + var5) + '쯊') + '\uf1e2') + var5) ^ var5) ^ '郼') + var5) + var5) ^ '\ue6a6'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') >>> 1 | (char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') << 15))) ^ 30514) ^ '\uf7e8') ^ '싵') + var5) << 3 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') >>> 1 | (char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') << 15))) ^ 30514) ^ '\uf7e8') ^ '싵') + var5) >>> 13) << 2 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') >>> 1 | (char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') << 15))) ^ 30514) ^ '\uf7e8') ^ '싵') + var5) << 3 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') >>> 1 | (char)((char)((char)(var4[var5] - 15683) + var5) - '\uda08') << 15))) ^ 30514) ^ '\uf7e8') ^ '싵') + var5) >>> 13) >>> 14) + 4544) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   IIliliillIliliil(IIIlliIllIIlliIl station, int index) {
      this.lIliIIIiil = station;
      this.iIliIIIiil = liiiIIllIl<invokedynamic>() + index;
      this.IlliIIIiil = liiiIIllIl<invokedynamic>() + index;
      this.llliIIIiil = liiiIIllIl<invokedynamic>() + index;
      this.illiIIIiil = station.liiiIIllIl().substring(0, 1).toUpperCase(Locale.ROOT);
      this.iiliIIIiil = station.IilliliilIIi().equalsIgnoreCase(liiiIIllIl<invokedynamic>()) || station.IilliliilIIi().equalsIgnoreCase(liiiIIllIl<invokedynamic>());
      String var3 = station.IIIllIIliIIl() <= 0 ? "" : (station.IIIllIIliIIl() == 1 ? liiiIIllIl<invokedynamic>() : station.IIIllIIliIIl() + liiiIIllIl<invokedynamic>());
      String var4 = station.IlIlllIlilIl();
      if (!var3.isEmpty() && !var4.isEmpty()) {
         this.IiliIIIiil = var3 + liiiIIllIl<invokedynamic>() + var4;
         this.liliIIIiil = var3;
      } else if (var3.isEmpty() && var4.isEmpty()) {
         this.IiliIIIiil = llllIIIlilllIIIl.Iiilliiliiil(station.iliIiiliiiii());
         this.liliIIIiil = this.IiliIIIiil;
      } else {
         this.IiliIIIiil = var3.isEmpty() ? var4 : var3;
         this.liliIIIiil = this.IiliIIIiil;
      }

   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') << 11) ^ '\ue79c') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') << 11) ^ '\ue79c') >>> 6) + var5) + '頑') + '꼬') << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') << 11) ^ '\ue79c') << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') >>> 5 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) >>> 15 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) >>> 5 | (char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) << 14 | (char)((char)((char)(var4[var5] + var5) - 27534) >>> 6 | (char)((char)(var4[var5] + var5) - 27534) << 10) >>> 2))) - var5) + '\uda45') - 7836) << 11) << 1) ^ var5) + '씅') << 11) ^ '\ue79c') >>> 6) + var5) + '頑') + '꼬') >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5))) << 13 | (char)(~((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5))) >>> 3))) ^ var5) ^ var5) >>> 10 | (char)((char)((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5))) << 13 | (char)(~((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) + var5))) >>> 3))) ^ var5) ^ var5) << 6) ^ '騝') + var5) - '邟'))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
