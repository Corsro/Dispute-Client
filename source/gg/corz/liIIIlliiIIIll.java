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

public record liIIIlliiIIIll(ilIlIilIiIlIil op, lIiliiliIiliil cell, lIiliiliIiliil stand, int count, IlIillillIilli intent, String why) {
   private final lIiliiliIiliil lllIlIIilillIlIIil;
   private final int iilIlIIilIIiIlIIil;
   private final ilIlIilIiIlIil iIlIlIIilIllIlIIil;
   private final lIiliiliIiliil IilIlIIillilIlIIil;
   private final String IliIlIIillliIlIIil;
   private final IlIillillIilli lIiIlIIiliIiIlIIil;

   public String toString() {
      String var10000;
      switch (this.iIlIlIIilIllIlIIil.ordinal()) {
         case 0 -> var10000 = IIIllIIliIIl<invokedynamic>() + this.IilIlIIillilIlIIil;
         case 1 -> var10000 = IIIllIIliIIl<invokedynamic>() + this.iilIlIIilIIiIlIIil + IIIllIIliIIl<invokedynamic>() + this.lllIlIIilillIlIIil + IIIllIIliIIl<invokedynamic>() + this.IilIlIIillilIlIIil;
         case 2 -> var10000 = IIIllIIliIIl<invokedynamic>() + this.lllIlIIilillIlIIil + IIIllIIliIIl<invokedynamic>() + this.IilIlIIillilIlIIil + IIIllIIliIIl<invokedynamic>() + this.IliIlIIillliIlIIil + IIIllIIliIIl<invokedynamic>() + (this.lIiIlIIiliIiIlIIil != null ? (this.lIiIlIIiliIiIlIIil.iilIliIIIl ? IIIllIIliIIl<invokedynamic>() : "") + IIIllIIliIIl<invokedynamic>() + this.lIiIlIIiliIiIlIIil.IIiIliIIIl + IIIllIIliIIl<invokedynamic>() + iIlllIIiIllllIIi.liIlliiIll(this.lIiIlIIiliIiIlIIil.lIiIliIIIl) + String.format(Locale.ROOT, IIIllIIliIIl<invokedynamic>(), this.lIiIlIIiliIiIlIIil.iIiIliIIIl, this.lIiIlIIiliIiIlIIil.IliIliIIIl, this.lIiIlIIiliIiIlIIil.lliIliIIIl) : "");
         case 3 -> var10000 = IIIllIIliIIl<invokedynamic>() + this.lllIlIIilillIlIIil + IIIllIIliIIl<invokedynamic>() + this.IilIlIIillilIlIIil;
         case 4 -> var10000 = IIIllIIliIIl<invokedynamic>() + this.lllIlIIilillIlIIil + IIIllIIliIIl<invokedynamic>() + this.IilIlIIillilIlIIil;
         case 5 -> var10000 = IIIllIIliIIl<invokedynamic>() + this.lllIlIIilillIlIIil + IIIllIIliIIl<invokedynamic>() + this.IliIlIIillliIlIIil + IIIllIIliIIl<invokedynamic>();
         case 6 -> var10000 = IIIllIIliIIl<invokedynamic>() + this.IliIlIIillliIlIIil + IIIllIIliIIl<invokedynamic>() + this.lllIlIIilillIlIIil + IIIllIIliIIl<invokedynamic>() + this.IilIlIIillilIlIIil + (this.lIiIlIIiliIiIlIIil != null ? (this.lIiIlIIiliIiIlIIil.iilIliIIIl ? IIIllIIliIIl<invokedynamic>() : "") + IIIllIIliIIl<invokedynamic>() + this.lIiIlIIiliIiIlIIil.IIiIliIIIl + IIIllIIliIIl<invokedynamic>() + iIlllIIiIllllIIi.liIlliiIll(this.lIiIlIIiliIiIlIIil.lIiIliIIIl) + String.format(Locale.ROOT, IIIllIIliIIl<invokedynamic>(), this.lIiIlIIiliIiIlIIil.iIiIliIIIl, this.lIiIlIIiliIiIlIIil.IliIliIIIl, this.lIiIlIIiliIiIlIIil.lliIliIIIl, iIlllIIiIllllIIi.liIlliiIll(this.lIiIlIIiliIiIlIIil.iliIliIIIl), this.lIiIlIIiliIiIlIIil.IiiIliIIIl) : "");
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   public String iliIiiliiiii() {
      return this.IliIlIIillliIlIIil;
   }

   public lIiliiliIiliil iIlIlllllill() {
      return this.IilIlIIillilIlIIil;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~var4[var5]) ^ '\ueace') + var5) >>> 10 | (char)((char)((char)(~var4[var5]) ^ '\ueace') + var5) << 6) ^ var5))) ^ var5))) + '鴡') - '\uee6a') ^ var5) - 16805));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lIiliiliIiliil liiiIIllIl() {
      return this.lllIlIIilillIlIIil;
   }

   public ilIlIilIiIlIil IliIlllilIi() {
      return this.iIlIlIIilIllIlIIil;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ 29164) - var5) - var5) + var5) ^ 'Ꚍ') + '귁') ^ var5))))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IlIillillIilli lIiiIiIlilli() {
      return this.lIiIlIIiliIiIlIIil;
   }

   public int IilliliilIIi() {
      return this.iilIlIIilIIiIlIIil;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ '萲') + var5) >>> 8 | (char)((char)((char)(~((char)(~var4[var5]))) ^ '萲') + var5) << 8) ^ '쪼') - 28243) - 22789) + '\ue221') - 'Ɬ'))) << 10 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ '萲') + var5) >>> 8 | (char)((char)((char)(~((char)(~var4[var5]))) ^ '萲') + var5) << 8) ^ '쪼') - 28243) - 22789) + '\ue221') - 'Ɬ'))) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6542239518264088433L ^ Long.rotateLeft(3601145914560493768L, 52) ^ -5271074686915685187L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 4026330195305892014L ^ Long.rotateLeft(3325770384368463982L, 53) ^ 3586144460466229149L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3543898479524814306L ^ Long.rotateLeft(8183319529192419113L, 45) ^ -6495197603640580887L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 480964017172245245L ^ Long.rotateLeft(-5198492880802260652L, 54) ^ 5108952277893818135L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -6458257471526725715L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1842527595790039253L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4357240309335550040L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -816856473180573358L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3036244028987818057L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4069445995909605369L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIlllIlilIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIlliIliiIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlllIlliIll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, Illlllllilll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilllilliill<invokedynamic>());
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

   public liIIIlliiIIIll(ilIlIilIiIlIil cell, lIiliiliIiliil count, lIiliiliIiliil stand, int op, IlIillillIilli intent, String why) {
      this.iIlIlIIilIllIlIIil = cell;
      this.lllIlIIilillIlIIil = count;
      this.IilIlIIillilIlIIil = stand;
      this.iilIlIIilIIiIlIIil = op;
      this.lIiIlIIiliIiIlIIil = intent;
      this.IliIlIIillliIlIIil = why;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) << 6 | (char)(var4[var5] - var5) >>> 10) - var5) ^ var5))) - var5) + var5) - 13422) + var5))) + '\ue220') - 'ꀟ') ^ var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + 10758) - var5))) - 'ꩅ'))) - 'ꉇ'))) << 9 | (char)(-((char)((char)(-((char)((char)(~((char)((char)(var4[var5] + 10758) - var5))) - 'ꩅ'))) - 'ꉇ'))) >>> 7))) ^ 14769) + var5) + 10637) - var5) ^ var5) ^ var5) + var5) - 25394));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
