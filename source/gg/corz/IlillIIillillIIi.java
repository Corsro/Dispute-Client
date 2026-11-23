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

public record IlillIIillillIIi(liIIiilliiIIiill tone, String state, String target, int pops, int popsTaken, String hint) {
   private final String illIIIiiil;
   private final int iilIIIiiil;
   private final String IilIIIiiil;
   public static final IlillIIillillIIi lIiIIIiiil;
   private final String IIiIIIiiil;
   private final int lilIIIiiil;
   private final liIIiilliiIIiill lllIIIiiil;

   public IlillIIillillIIi(liIIiilliiIIiill target, String hint, String tone, int popsTaken, int state, String pops) {
      target = target == null ? liIIiilliiIIiill.iiIIiliill : target;
      hint = hint != null && !hint.isBlank() ? hint : IlIlllIlilIl<invokedynamic>();
      tone = tone != null && !tone.isBlank() ? tone : null;
      popsTaken = Math.max(0, popsTaken);
      state = Math.max(0, state);
      pops = pops != null && !pops.isBlank() ? pops : null;
      this.lllIIIiiil = target;
      this.illIIIiiil = hint;
      this.IilIIIiiil = tone;
      this.lilIIIiiil = popsTaken;
      this.iilIIIiiil = state;
      this.IIiIIIiiil = pops;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) << 3) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) << 3) >>> 12) - var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) << 3) << 4 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) >>> 13 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) << 7 | (char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) ^ var5) >>> 9))) - '︁') + var5) + var5) + var5) << 3) >>> 12) - var5) - var5) << 7))) ^ 24112) + 20498) + var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8640540435117390483L ^ Long.rotateLeft(-5844539338268177380L, 7) ^ 7778326389452304805L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3140958086519819481L ^ Long.rotateLeft(3720410514073637755L, 15) ^ -7788811421317795648L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8736549936268932811L ^ Long.rotateLeft(2427204315676674973L, 8) ^ 5008187973055466979L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7796694066615081518L ^ Long.rotateLeft(4099032379573128219L, 49) ^ 1318434795627313789L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1859088799790128681L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2685280566578640229L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1624944683923866400L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -6303248242988539229L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -4842803368585268607L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1050516474486296773L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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

   static {
      lIiIIIiiil = new IlillIIillillIIi(liIIiilliiIIiill.iiIIiliill, IlIlllIlilIl<invokedynamic>(), (String)null, 0, 0, IlIlllIlilIl<invokedynamic>());
   }

   public String iIlIlllllill() {
      return this.illIIIiiil;
   }

   public int iliIiiliiiii() {
      return this.iilIIIiiil;
   }

   public liIIiilliiIIiill liiiIIllIl() {
      return this.lllIIIiiil;
   }

   public boolean IliIlllilIi() {
      return this.IilIIIiiil != null || this.lilIIIiiil > 0 || this.iilIIIiiil > 0;
   }

   public String IilliliilIIi() {
      return this.IilIIIiiil;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) << 10 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) >>> 6) << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) << 10 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) >>> 6) >>> 8) + '钘') + '왖') - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) << 10 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) >>> 6) << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) << 10 | (char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) << 7 | (char)(-var4[var5]) >>> 9) ^ var5) + var5) - var5) - var5))) + 32448) >>> 6) >>> 8) + '钘') + '왖') - var5) << 5))) - 32643));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) + var5) - var5))) ^ var5) + 272) >>> 7 | (char)((char)((char)(~((char)((char)((char)(~((char)(-((char)(var4[var5] << 14 | var4[var5] >>> 2))))) + var5) - var5))) ^ var5) + 272) << 9) - var5) - 5304) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli() {
      return this.lilIIIiiil;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 10105) + var5) << 2 | (char)((char)(var4[var5] ^ 10105) + var5) >>> 14) ^ var5) - 3383) - var5) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 10105) + var5) << 2 | (char)((char)(var4[var5] ^ 10105) + var5) >>> 14) ^ var5) - 3383) - var5) << 9))) ^ var5))) << 12 | (char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 10105) + var5) << 2 | (char)((char)(var4[var5] ^ 10105) + var5) >>> 14) ^ var5) - 3383) - var5) >>> 7 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 10105) + var5) << 2 | (char)((char)(var4[var5] ^ 10105) + var5) >>> 14) ^ var5) - 3383) - var5) << 9))) ^ var5))) >>> 4)))));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) << 4) + var5) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) << 4) + var5) ^ var5) >>> 9) + var5) + '뚲'))) + '蘋') + 24020) >>> 2 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) << 4) + var5) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) >>> 12 | (char)((char)((char)(-((char)((char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) << 6 | (char)((char)((char)var4[var5] + var5) >>> 11 | (char)((char)var4[var5] + var5) << 5) >>> 10))) - 25766) ^ var5) << 4) + var5) ^ var5) >>> 9) + var5) + '뚲'))) + '蘋') + 24020) << 14))) + 'ꔂ'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String IIIllIIliIIl() {
      return this.IIiIIIiiil;
   }
}
