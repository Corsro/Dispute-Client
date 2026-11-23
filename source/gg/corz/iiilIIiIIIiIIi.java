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
import net.minecraft.class_2338;
import net.minecraft.class_2350;
import net.minecraft.class_243;

public final class iiilIIiIIIiIIi {
   public static final int liiIliiliiiiIliili = 20;
   private static final class_2350[] iIIlliiliIlIlliili = class_2350.values();
   private String liiiliiliiiiiliili;
   private int illlliiliIillliili;
   private class_2338 iIliliiliIlliliili;
   private class_2338 Illlliilillllliili;
   private int Iililiililililiili;
   private int lillliiliiillliili;
   public static final int IliIliililliIliili = 6;
   private float Iiilliililiilliili;
   private long IlIiliilillIiliili;
   private boolean Iliiliililliiliili;
   private String iliiliiliIiiiliili;
   public static final float llIlliiliilIlliili = 0.7F;
   private int llliliiliilliliili;
   public static final String IIIlliililIIlliili = "breaking";
   private final lIliiliiIliili iiIlliiliIIllliili;
   private float llilliiliililliili;
   private long ilIiliiliIiIiliili;
   public static final float IiIlliililiIlliili = 1.15F;
   public static final double lIiIliiliiIiIliili = (double)4.5F;
   private int lIIiliiliiIIiliili;
   private long liIiliiliiiIiliili;
   private class_243 iIilliiliIlilliili;
   private Object iiilliiliIIIiliili;
   public static final int iliIliiliIiiIliili = 3;
   private long IIliliililIliliili;
   private boolean lIiiliiliiIiiliili;
   private int iililiiliIIiiliili;
   private IliiIlllliiIll lIllliiliiIllliili;
   private class_2350 IIilliililIilliili;

   private void iIIIlIlIIl(long t, String why) {
      this.iIliliiliIlliliili = this.Illlliilillllliili;
      this.IIliliililIliliili = t;
      this.llIIlilIIl();
      this.iliiliiliIiiiliili = null;
      this.liiiliiliiiiiliili = why;
   }

   // $FF: synthetic method
   private static CallSite IiIIlliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4882604842933252871L ^ Long.rotateLeft(-2235068450180302661L, 12) ^ -2544949783817070611L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7939233204952585383L ^ Long.rotateLeft(-6259023815681741197L, 12) ^ -4739328698772998453L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -3710985135647759811L ^ Long.rotateLeft(8036689050726169891L, 23) ^ -6203066383625532128L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 470390172774918400L ^ Long.rotateLeft(5692359681656278427L, 61) ^ -7950581896558022962L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -662944339467585149L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 6825393724011535211L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -7380743095842677200L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1535373844566740638L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -5696620300242306182L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -287237156716235465L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iiIIlIIlIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIlIliIlIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IllIllllIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, illIlIilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(lilIliilIl<invokedynamic>());
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

   public long Illillliilli() {
      return this.IIliliililIliliili;
   }

   public static boolean IliIlllilIi(float elapsed, float progress, int delta) {
      return !(elapsed + progress >= 1.0F) ? true : liiiIIllIl(progress, delta);
   }

   public class_2350 Iiilliiliiil() {
      return this.IIilliililIilliili;
   }

   // $FF: synthetic method
   private static CallSite illIlIilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)(-((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - '\ue14e') + var5) ^ '\ue1d6') + '\ue10e'))) + 20834))))))) + var5) << 4 | (char)((char)(-((char)(~((char)(-((char)((char)(-((char)((char)((char)((char)(var4[var5] - '\ue14e') + var5) ^ '\ue1d6') + '\ue10e'))) + 20834))))))) + var5) >>> 12) ^ 3707))) ^ '쾹'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iilllilliill() {
      long var4 = -3626829731802535585L;
      var4 ^= ((long)(this.lIllliiliiIllliili != IliiIlllliiIll.liiIllliliiiIlllil && !this.lIiiliiliiIiiliili ? 0 : 1) << 32 ^ var4) & -1L << 32;
      long var2 = this.iiIlliiliIIllliili.liiiIIllIl();
      this.llIIlilIIl();
      this.lIiiliiliiIiiliili = false;
      if ((int)(var4 >>> 32) != 0) {
         if (this.iiIlliiliIIllliili.Illillliilli() && this.ilIiliiliIiIiliili != var2 && this.liIiliiliiiIiliili != var2 && this.iiIlliiliIIllliili.Iiilliiliiil()) {
            this.iiIlliiliIIllliili.IIiilIiiiIii();
            this.ilIiliiliIiIiliili = var2;
            this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>();
         } else if (this.iiIlliiliIIllliili.Illillliilli()) {
            this.lIiiliiliiIiiliili = true;
         }
      }

   }

   private iiIlIlIlIIllIlIl IIIIllIIIl(String why) {
      this.llIIlilIIl();
      this.iliiliiliIiiiliili = why;
      this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>() + why;
      return iiIlIlIlIIllIlIl.IiIlliilIl;
   }

   public class_2338 Ililllililil() {
      return this.Illlliilillllliili;
   }

   public String Iiiiliiiiiii() {
      String var1 = this.liiiliiliiiiiliili;
      this.liiiliiliiiiiliili = null;
      return var1;
   }

   // $FF: synthetic method
   private static CallSite lIlIliIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5))) + '鲅') - '딪'))) - var5) + '\uf35a'))))) - 5370) ^ var5) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] >>> 5 | var4[var5] << 11) - var5))) + '鲅') - '딪'))) - var5) + '\uf35a'))))) - 5370) ^ var5) >>> 2))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IllIllllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] ^ 20485))))) >>> 6 | (char)(-((char)(-((char)(var4[var5] ^ 20485))))) << 10) << 11 | (char)((char)(-((char)(-((char)(var4[var5] ^ 20485))))) >>> 6 | (char)(-((char)(-((char)(var4[var5] ^ 20485))))) << 10) >>> 5) - var5) ^ var5))) >>> 3 | (char)(-((char)((char)((char)((char)((char)(-((char)(-((char)(var4[var5] ^ 20485))))) >>> 6 | (char)(-((char)(-((char)(var4[var5] ^ 20485))))) << 10) << 11 | (char)((char)(-((char)(-((char)(var4[var5] ^ 20485))))) >>> 6 | (char)(-((char)(-((char)(var4[var5] ^ 20485))))) << 10) >>> 5) - var5) ^ var5))) << 13) - '鲄') - '쵐'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IiIlliIliiIl() {
      return this.lIllliiliiIllliili != IliiIlllliiIll.IliIlllillliIlllil;
   }

   public int IlIillIiilIi() {
      return this.llliliiliilliliili;
   }

   // $FF: synthetic method
   private static CallSite lilIliilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') >>> 3 | (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') << 13) << 15 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') >>> 3 | (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') << 13) >>> 1))) >>> 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') >>> 3 | (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') << 13) << 15 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') >>> 3 | (char)((char)((char)(~((char)((char)(~((char)((char)(~((char)((char)(var4[var5] - 27229) + var5))) + 5540))) - var5))) - 30358) ^ '赼') << 13) >>> 1))) << 13));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public class_243 IIIilIIiiIIi() {
      return this.iIilliiliIlilliili;
   }

   public long IIiilIiiiIii() {
      return this.liIiliiliiiIiliili;
   }

   public iiilIIiIIIiIIi(lIliiliiIliili io) {
      this.lIllliiliiIllliili = IliiIlllliiIll.IliIlllillliIlllil;
      this.illlliiliIillliili = -1;
      this.lIIiliiliiIIiliili = -1;
      this.IlIiliilillIiliili = Long.MIN_VALUE;
      this.ilIiliiliIiIiliili = Long.MIN_VALUE;
      this.liIiliiliiiIiliili = Long.MIN_VALUE;
      this.IIliliililIliliili = Long.MIN_VALUE;
      this.iiIlliiliIIllliili = io;
   }

   // $FF: synthetic method
   private static CallSite iiIIlIIlIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) >>> 11))) + var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) >>> 11))) + var5) << 8) + 6587) - var5) >>> 6 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) >>> 11))) + var5) >>> 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) << 5 | (char)((char)((char)((char)((char)((char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) >>> 14 | (char)(~((char)((char)var4[var5] << 5 | (char)var4[var5] >>> 11))) << 2) ^ var5) - var5) - 459) ^ var5) >>> 11))) + var5) << 8) + 6587) - var5) << 10) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiIlIlIlIIllIlIl lIiiIiIlilli() {
      long var1 = this.iiIlliiliIIllliili.liiiIIllIl();
      if (this.lIiiliiliiIiiliili) {
         if (this.iiIlliiliIIllliili.Illillliilli()) {
            if (this.ilIiliiliIiIiliili != var1 && this.liIiliiliiiIiliili != var1 && this.iiIlliiliIIllliili.Iiilliiliiil()) {
               this.iiIlliiliIIllliili.IIiilIiiiIii();
               this.lIiiliiliiIiiliili = false;
               this.ilIiliiliIiIiliili = var1;
               this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>();
               return iiIlIlIlIIllIlIl.llIlliilIl;
            }

            return iiIlIlIlIIllIlIl.lIIlliilIl;
         }

         this.lIiiliiliiIiiliili = false;
      }

      if (this.lIllliiliiIllliili == IliiIlllliiIll.IliIlllillliIlllil) {
         return iiIlIlIlIIllIlIl.iiiIliilIl;
      } else if (!this.iiIlliiliIIllliili.IliIlllilIi()) {
         return this.IIIIllIIIl(IiIIlliIIl<invokedynamic>());
      } else if (this.iiIlliiliIIllliili.lIiiIiIlilli(this.Illlliilillllliili)) {
         this.iIIIlIlIIl(var1, this.lIllliiliiIllliili == IliiIlllliiIll.liiIllliliiiIlllil ? IiIIlliIIl<invokedynamic>() : IiIIlliIIl<invokedynamic>());
         return iiIlIlIlIIllIlIl.ilIlliilIl;
      } else {
         return this.lIllliiliiIllliili == IliiIlllliiIll.liiIllliliiiIlllil ? this.IIIllIIliIIl(var1) : this.iliIiiliiiii(var1);
      }
   }

   public static boolean liiiIIllIl(float delta, int elapsed) {
      return delta * (float)(Math.max(0, elapsed) + 1) >= 0.80499995F;
   }

   public void IIillIiliIil() {
      long var2 = -7058433240419212295L;
      var2 ^= ((long)(this.lIllliiliiIllliili != IliiIlllliiIll.liiIllliliiiIlllil && !this.lIiiliiliiIiiliili ? 0 : 1) << 32 ^ var2) & -1L << 32;
      this.llIIlilIIl();
      this.lIiiliiliiIiiliili = false;
      if ((int)(var2 >>> 32) != 0 && this.iiIlliiliIIllliili.IliIlllilIi() && this.iiIlliiliIIllliili.Illillliilli()) {
         this.iiIlliiliIIllliili.IIiilIiiiIii();
         this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>();
      }

      this.ilIiliiliIiIiliili = Long.MIN_VALUE;
      this.liIiliiliiiIiliili = Long.MIN_VALUE;
      this.IIliliililIliliili = Long.MIN_VALUE;
      this.iIliliiliIlliliili = null;
   }

   private iiIlIlIlIIllIlIl IIIllIIliIIl(long t) {
      this.iiIlliiliIIllliili.IIillIiliIil(this.llilliiliililliili, this.Iiilliililiilliili);
      ++this.llliliiliilliliili;
      String var3 = null;
      if (!this.iiIlliiliIIllliili.Illillliilli()) {
         var3 = IiIIlliIIl<invokedynamic>();
      } else if (this.iiIlliiliIIllliili.IlIillIiilIi() == this.lIIiliiliiIIiliili && this.iiIlliiliIIllliili.IIlilIliiIli(this.iiilliiliIIIiliili)) {
         if (this.iiIlliiliIIllliili.IilliliilIIi()) {
            var3 = IiIIlliIIl<invokedynamic>();
         } else if (this.iiIlliiliIIllliili.IIIllIIliIIl(this.Illlliilillllliili) > (double)4.5F) {
            var3 = IiIIlliIIl<invokedynamic>();
         } else if (!this.iiIlliiliIIllliili.IiIlliIliiIl(this.Illlliilillllliili, this.IIilliililIilliili, this.iiIlliiliIIllliili.IIlllIlliIll(), this.iiIlliiliIIllliili.Illlllllilll())) {
            var3 = IiIIlliIIl<invokedynamic>();
         } else if (this.llliliiliilliliili > this.lillliiliiillliili + 20) {
            var3 = IiIIlliIIl<invokedynamic>();
         }
      } else {
         var3 = IiIIlliIIl<invokedynamic>();
      }

      if (var3 != null) {
         if (IiIIlliIIl<invokedynamic>().equals(var3)) {
            this.IlIlllIlilIl(IiIIlliIIl<invokedynamic>());
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         } else if (this.liIiliiliiiIiliili != t && this.iiIlliiliIIllliili.Iiilliiliiil()) {
            this.iiIlliiliIIllliili.IIiilIiiiIii();
            this.ilIiliiliIiIiliili = t;
            this.IlIlllIlilIl(var3);
            return ++this.iililiiliIIiiliili >= 3 ? this.IIIIllIIIl(var3) : iiIlIlIlIIllIlIl.llIlliilIl;
         } else {
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         }
      } else if (!this.iiIlliiliIIllliili.Iiilliiliiil()) {
         return iiIlIlIlIIllIlIl.lIIlliilIl;
      } else if (!this.iiIlliiliIIllliili.Iliilliiilii(this.Illlliilillllliili, (int)Math.min(2147483647L, t - this.IlIiliilillIiliili))) {
         if (!this.Iliiliililliiliili) {
            this.Iliiliililliiliili = true;
            this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>();
         }

         return iiIlIlIlIIllIlIl.IlIlliilIl;
      } else {
         this.iiIlliiliIIllliili.Iilililiiili(this.Illlliilillllliili, this.IIilliililIilliili);
         this.liIiliiliiiIiliili = t;
         if (!this.iiIlliiliIIllliili.lIiiIiIlilli(this.Illlliilillllliili) && this.iiIlliiliIIllliili.Illillliilli()) {
            return iiIlIlIlIIllIlIl.IlIlliilIl;
         } else {
            this.iIIIlIlIIl(t, IiIIlliIIl<invokedynamic>());
            return iiIlIlIlIIllIlIl.ilIlliilIl;
         }
      }
   }

   public class_2338 Iilililiiili() {
      return this.iIliliiliIlliliili;
   }

   public boolean IilliliilIIi(class_2338 toolSlot, int expectTicks, int target) {
      if (this.lIllliiliiIllliili == IliiIlllliiIll.IliIlllillliIlllil && toolSlot != null) {
         this.llIIlilIIl();
         this.iliiliiliIiiiliili = null;
         this.Illlliilillllliili = toolSlot.method_10062();
         this.illlliiliIillliili = expectTicks;
         this.lillliiliiillliili = Math.max(0, target);
         this.lIllliiliiIllliili = IliiIlllliiIll.iliIlllilIiiIlllil;
         return true;
      } else {
         return false;
      }
   }

   public boolean IIlllIlliIll() {
      return this.lIllliiliiIllliili == IliiIlllliiIll.liiIllliliiiIlllil || this.lIiiliiliiIiiliili;
   }

   public int IIlilIliiIli() {
      return this.illlliiliIillliili;
   }

   private void IlIlllIlilIl(String why) {
      this.lIllliiliiIllliili = IliiIlllliiIll.iliIlllilIiiIlllil;
      this.Iliiliililliiliili = false;
      this.IIilliililIilliili = null;
      this.iiilliiliIIIiliili = null;
      this.lIIiliiliiIIiliili = -1;
      this.llliliiliilliliili = 0;
      this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>() + why;
   }

   public int IiIiliIiiiIi() {
      return this.lillliiliiillliili;
   }

   public String Iliilliiilii() {
      return this.iliiliiliIiiiliili;
   }

   public static iiilIIiIIIiIIi iIlIlllllill(lilllllliillllll gates, illillIlIilillIl host) {
      return new iiilIIiIIIiIIi(new llIliiiilIliii(gates, host));
   }

   private iiIlIlIlIIllIlIl iliIiiliiiii(long t) {
      if (this.iiIlliiliIIllliili.Illillliilli()) {
         if (this.ilIiliiliIiIiliili != t && this.liIiliiliiiIiliili != t && this.iiIlliiliIIllliili.Iiilliiliiil()) {
            this.iiIlliiliIIllliili.IIiilIiiiIii();
            this.ilIiliiliIiIiliili = t;
            this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>();
            return iiIlIlIlIIllIlIl.llIlliilIl;
         } else {
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         }
      } else if (this.ilIiliiliIiIiliili != t && this.liIiliiliiiIiliili != t) {
         if (this.iiIlliiliIIllliili.IilliliilIIi()) {
            return iiIlIlIlIIllIlIl.lIIlliilIl;
         } else if (this.iiIlliiliIIllliili.iliIiiliiiii(this.Illlliilillllliili)) {
            return this.IIIIllIIIl(IiIIlliIIl<invokedynamic>());
         } else if (this.iiIlliiliIIllliili.IIIllIIliIIl(this.Illlliilillllliili) > (double)4.5F) {
            return this.IIIIllIIIl(IiIIlliIIl<invokedynamic>());
         } else {
            float var3 = this.iiIlliiliIIllliili.IIlllIlliIll();
            float var4 = this.iiIlliiliIIllliili.Illlllllilll();
            if (this.IIilliililIilliili == null || !this.iiIlliiliIIllliili.IiIlliIliiIl(this.Illlliilillllliili, this.IIilliililIilliili, var3, var4)) {
               IIIIiiIllIIIiiIl var5 = this.iiIlliiliIIllliili.IlIlllIlilIl(this.Illlliilillllliili, var3, var4);
               if (var5 == null) {
                  if (++this.Iililiililililiili >= 6) {
                     return this.IIIIllIIIl(IiIIlliIIl<invokedynamic>());
                  }

                  if (this.iIilliiliIlilliili != null) {
                     this.iiIlliiliIIllliili.Iilllilliill(this.iIilliiliIlilliili);
                  }

                  return iiIlIlIlIIllIlIl.IIIlliilIl;
               }

               this.IIilliililIilliili = var5.IliIlllilIi();
               this.iIilliiliIlilliili = var5.liiiIIllIl();
            }

            this.Iililiililililiili = 0;
            if (!this.iiIlliiliIIllliili.IiIlliIliiIl(this.Illlliilillllliili, this.IIilliililIilliili, var3, var4)) {
               this.iiIlliiliIIllliili.Iilllilliill(this.iIilliiliIlilliili);
               return iiIlIlIlIIllIlIl.IIIlliilIl;
            } else if (!this.iiIlliiliIIllliili.iIlIlllllill() && this.lillliiliiillliili > 0) {
               this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
               return iiIlIlIlIIllIlIl.lIIlliilIl;
            } else if (!this.iiIlliiliIIllliili.Ililllililil()) {
               this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
               return iiIlIlIlIIllIlIl.lIIlliilIl;
            } else if (this.illlliiliIillliili >= 0 && !this.iiIlliiliIIllliili.IIIilIIiiIIi(this.illlliiliIillliili)) {
               this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
               return iiIlIlIlIIllIlIl.lIIlliilIl;
            } else {
               this.iiIlliiliIIllliili.Iilililiiili(this.Illlliilillllliili, this.IIilliililIilliili);
               this.liIiliiliiiIiliili = t;
               this.llilliiliililliili = var3;
               this.Iiilliililiilliili = var4;
               this.iiIlliiliIIllliili.IIillIiliIil(var3, var4);
               if (this.iiIlliiliIIllliili.lIiiIiIlilli(this.Illlliilillllliili)) {
                  this.iIIIlIlIIl(t, IiIIlliIIl<invokedynamic>());
                  return iiIlIlIlIIllIlIl.ilIlliilIl;
               } else if (!this.iiIlliiliIIllliili.Illillliilli()) {
                  return iiIlIlIlIIllIlIl.lIIlliilIl;
               } else {
                  this.lIllliiliiIllliili = IliiIlllliiIll.liiIllliliiiIlllil;
                  this.IlIiliilillIiliili = t;
                  this.iiilliiliIIIiliili = this.iiIlliiliIIllliili.IiIiliIiiiIi();
                  this.lIIiliiliiIIiliili = this.iiIlliiliIIllliili.IlIillIiilIi();
                  this.llliliiliilliliili = 0;
                  this.liiiliiliiiiiliili = IiIIlliIIl<invokedynamic>();
                  return iiIlIlIlIIllIlIl.iIIlliilIl;
               }
            }
         }
      } else {
         return iiIlIlIlIIllIlIl.lIIlliilIl;
      }
   }

   public IliiIlllliiIll Illlllllilll() {
      return this.lIllliiliiIllliili;
   }

   private void llIIlilIIl() {
      this.lIllliiliiIllliili = IliiIlllliiIll.IliIlllillliIlllil;
      this.Illlliilillllliili = null;
      this.illlliiliIillliili = -1;
      this.lillliiliiillliili = 0;
      this.IIilliililIilliili = null;
      this.iIilliiliIlilliili = null;
      this.iiilliiliIIIiliili = null;
      this.lIIiliiliiIIiliili = -1;
      this.IlIiliilillIiliili = Long.MIN_VALUE;
      this.llliliiliilliliili = 0;
      this.Iililiililililiili = 0;
      this.iililiiliIIiiliili = 0;
      this.Iliiliililliiliili = false;
   }
}
