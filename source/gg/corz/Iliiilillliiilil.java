package gg.corz;

import com.mojang.authlib.GameProfile;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_745;
import net.minecraft.class_1297.class_5529;

public class Iliiilillliiilil extends ilIllIiIll {
   private class_745 Iillilllil;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) >>> 3 | (char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) << 13) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) >>> 3 | (char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) << 13) >>> 1))) - var5))) - '뱅') + var5) ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) >>> 3 | (char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) << 13) << 15 | (char)((char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) >>> 3 | (char)((char)((char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) << 11 | (char)(~((char)(var4[var5] << 15 | var4[var5] >>> 1))) >>> 5) + var5) << 13) >>> 1))) - var5))) - '뱅') + var5) ^ var5))) << 2) + '맓'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) << 12) - '豾') << 10 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) << 12) - '豾') >>> 6) + var5) ^ '騨'))) ^ '阦') - '씟') << 12 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) << 12) - '豾') << 10 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) >>> 4 | (char)(~((char)((char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) >>> 11 | (char)((char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ 14764) << 10 | (char)(var4[var5] ^ 14764) >>> 6) ^ var5) - 11776) << 12) << 5))) << 12) - '豾') >>> 6) + var5) ^ '騨'))) ^ '阦') - '씟') >>> 4) - var5))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public Iliiilillliiilil() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2401892872971677525L ^ Long.rotateLeft(7342988803166665058L, 54) ^ 2566407756895863475L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 1253633610677289502L ^ Long.rotateLeft(-736661525693757770L, 47) ^ -1013461928094517193L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5105258277900033869L ^ Long.rotateLeft(-839117415010754042L, 61) ^ 2874177555467459553L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -384642178627622779L ^ Long.rotateLeft(-391495116488963643L, 47) ^ -7924906567714229269L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 1831512386648022010L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 3120396163228852188L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8328881645767766992L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3746990614174779274L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 750071440782887524L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -6211441235380095833L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) << 11) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) << 11) << 1))) ^ 8218) << 2 | (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) << 11) >>> 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) >>> 5 | (char)(-((char)((char)((char)((char)((char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') >>> 5 | (char)((char)(var4[var5] >>> 11 | var4[var5] << 5) + '\uedd5') << 11) + 26189)) - 15887))) << 11) << 1))) ^ 8218) >>> 14));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iilililiiili() {
      if (this.Iillilllil != null && Iiiilllliiilll.field_1687 != null) {
         Iiiilllliiilll.field_1687.method_2945(this.Iillilllil.method_5628(), class_5529.field_26999);
         this.Iillilllil = null;
      }

   }

   public void Illillliilli() {
      if (Iiiilllliiilll.field_1687 != null && Iiiilllliiilll.field_1724 != null) {
         GameProfile var1 = new GameProfile(UUID.randomUUID(), IliIlllilIi<invokedynamic>());
         this.Iillilllil = new class_745(Iiiilllliiilll.field_1687, var1);
         this.Iillilllil.method_5719(Iiiilllliiilll.field_1724);
         this.Iillilllil.method_31548().method_7377(Iiiilllliiilll.field_1724.method_31548());
         Iiiilllliiilll.field_1687.method_53875(this.Iillilllil);
      } else {
         this.IIillIiliIil(false);
      }
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) >>> 9) + 9981) << 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) >>> 9) + 9981) >>> 15) << 13 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) >>> 9) + 9981) << 1 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) << 7 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) >>> 14 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 11853) ^ var5))) - '\ueed2') ^ var5) ^ 5801))) << 2) - var5) >>> 9) + 9981) >>> 15) >>> 3) - var5) ^ 30970));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) >>> 8 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) << 8) + var5) + 28813) + '쮎') - var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) >>> 8 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) << 8) + var5) + 28813) + '쮎') - var5) << 14))) + var5))) - 27235) >>> 4 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) >>> 8 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) << 8) + var5) + 28813) + '쮎') - var5) >>> 2 | (char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) >>> 8 | (char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) + var5) - var5))) + var5))) << 8) + var5) + 28813) + '쮎') - var5) << 14))) + var5))) - 27235) << 12) - '\ue794'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
