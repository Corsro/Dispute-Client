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

public record liIliIiliiIliIil(long expectedFinalComponent, int usefulTargetsAfterConfirm, boolean reusableSurface, boolean safeDescent, long returnAnchor) {
   private final boolean lliIIilIil;
   private final long iIiIIilIil;
   public static final liIliIiliiIliIil liiIIilIil = new liIliIiliiIliIil(0L, 0, false, false, 0L);
   private final boolean iliIIilIil;
   private final int IliIIilIil;
   private final long IiiIIilIil;

   public long IlIlllIlilIl() {
      return this.IiiIIilIil;
   }

   public liIliIiliiIliIil(long reusableSurface, int expectedFinalComponent, boolean usefulTargetsAfterConfirm, boolean returnAnchor, long safeDescent) {
      this.iIiIIilIil = reusableSurface;
      this.IliIIilIil = expectedFinalComponent;
      this.lliIIilIil = usefulTargetsAfterConfirm;
      this.iliIIilIil = returnAnchor;
      this.IiiIIilIil = safeDescent;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '魅') - var5)))) + '덓') - '혲') + 13388) - var5))))) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long IilliliilIIi() {
      return this.iIiIIilIil;
   }

   public String iIlIlllllill() {
      return String.format(Locale.ROOT, IiIlliIliiIl<invokedynamic>(), this.iIiIIilIil, this.IliIIilIil, this.lliIIilIil, this.iliIIilIil, this.IiiIIilIil);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)(var4[var5] - 29328))) << 12 | (char)(~((char)(var4[var5] - 29328))) >>> 4))) - var5))) + 30777) - var5) - 1730) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) >>> 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) << 10) - 15300) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) >>> 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) << 10) - 15300) << 9) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) >>> 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) << 10) - 15300) >>> 7 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) >>> 6 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)(var4[var5] - '\uda99') - 13569) - var5) - var5) + var5))))) + var5) ^ '꼽') ^ '\ue669') + 27527) << 10) - 15300) << 9) + var5) << 10));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static liIliIiliiIliIil IliIlllilIi(long base, long baseComponent, boolean ownColumn) {
      return new liIliIiliiIliIil(base, 0, false, ownColumn, baseComponent);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) >>> 13 | (char)((char)(~var4[var5]) + var5) << 3) >>> 3 | (char)((char)((char)(~var4[var5]) + var5) >>> 13 | (char)((char)(~var4[var5]) + var5) << 3) << 13)) ^ 7171))) ^ var5) - var5) >>> 3 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) >>> 13 | (char)((char)(~var4[var5]) + var5) << 3) >>> 3 | (char)((char)((char)(~var4[var5]) + var5) >>> 13 | (char)((char)(~var4[var5]) + var5) << 3) << 13)) ^ 7171))) ^ var5) - var5) << 13) - var5) - 7671))))))) - 31382) + var5) - 24700) - 3993));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIIllIIliIIl() {
      return this.iliIIilIil;
   }

   public boolean iliIiiliiiii() {
      return this.lliIIilIil;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 9 | (char)((char)(var4[var5] ^ var5) + var5) << 7) - 8508) - '\ud8e8') - 3443) ^ var5))) ^ var5) - var5) ^ '览'))) ^ var5) >>> 6 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) + var5) >>> 9 | (char)((char)(var4[var5] ^ var5) + var5) << 7) - 8508) - '\ud8e8') - 3443) ^ var5))) ^ var5) - var5) ^ '览'))) ^ var5) << 10) + 'ꦰ') ^ var5) - var5) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int lIiiIiIlilli() {
      return this.IliIIilIil;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3948663446706799784L ^ Long.rotateLeft(2194808921419181660L, 3) ^ -2338175977064825282L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 3654519957435857542L ^ Long.rotateLeft(4276976299987731727L, 44) ^ 458843096476725136L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5687997477943054181L ^ Long.rotateLeft(3953646545322615524L, 5) ^ -4679559827372742523L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6017527302115922344L ^ Long.rotateLeft(-2156251529457864045L, 33) ^ -4357480503798206486L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 9084770355614060720L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6283236417265612470L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6948033155085309094L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3000980340103113212L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4568318965484742501L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -8402257096445826406L;
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

   public static liIliIiliiIliIil liiiIIllIl(long base, int ownColumn, long unlocks, boolean surfaceComponent) {
      return new liIliIiliiIliIil(base, Math.max(0, ownColumn), true, surfaceComponent, unlocks);
   }
}
