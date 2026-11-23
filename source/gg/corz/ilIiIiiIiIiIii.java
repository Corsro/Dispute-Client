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

public class ilIiIiiIiIiIii extends ilIllIiIll {
   private final IIIIlilllIIIlill liliIIiIIl = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), Double.longBitsToDouble(-15720538924093737L ^ -4608566205740786204L), (double)0.0F, (double)1.0F, Double.longBitsToDouble(8467197745627418877L ^ 5343554925001820519L));
   private final iiIiiilIIliiil iiliIIiIIl = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2770051845003371346L ^ Long.rotateLeft(-5129018199431990439L, 53) ^ -2658776392503349870L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8584395885891990855L ^ Long.rotateLeft(5260101074863316855L, 62) ^ -349713374294225708L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 8284269819089492782L ^ Long.rotateLeft(-76398825386460520L, 35) ^ 1497073084660323326L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5840915844346030006L ^ Long.rotateLeft(3106838142013551094L, 20) ^ 1382296814101457703L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3850493508714495882L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 1408100517482586615L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4852144346926879483L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8010842216875011939L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 305999859171049358L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1331939789780451489L;
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

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) - var5) + '좺') ^ 22226) + var5) - '\ufb3f') + '\uf753'))) - var5) ^ var5) ^ 28738) - '쑅'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 30506) ^ 12626) ^ 23814) ^ var5))) ^ var5) - var5) ^ '잊'))) >>> 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 30506) ^ 12626) ^ 23814) ^ var5))) ^ var5) - var5) ^ '잊'))) << 6) >>> 3 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 30506) ^ 12626) ^ 23814) ^ var5))) ^ var5) - var5) ^ '잊'))) >>> 10 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - 30506) ^ 12626) ^ 23814) ^ var5))) ^ var5) - var5) ^ '잊'))) << 6) << 13))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIIlliIIll() {
      return this.iiliIIiIIl.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 17286))) + '좻') + var5) - var5) + var5))) << 14 | (char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 17286))) + '좻') + var5) - var5) + var5))) >>> 2) + var5) >>> 1 | (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 17286))) + '좻') + var5) - var5) + var5))) << 14 | (char)(-((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ 17286))) + '좻') + var5) - var5) + var5))) >>> 2) + var5) << 15));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) << 12 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) >>> 4))) << 6 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) << 12 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) >>> 4))) >>> 10) - var5) + var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) << 12 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) >>> 4))) << 6 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) << 12 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 'ﴎ') >>> 12 | (char)(var4[var5] ^ 'ﴎ') << 4))) + 'ﻢ') - var5))) ^ var5) - var5) >>> 4))) >>> 10) - var5) + var5) << 2) - '勉') + var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)(~((char)(-((char)(~((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ 23246))) ^ 27335) - var5))))))))) + var5) ^ 'ꨱ') << 7 | (char)((char)((char)(~((char)(-((char)(~((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ 23246))) ^ 27335) - var5))))))))) + var5) ^ 'ꨱ') >>> 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float iiiIlIIIll() {
      return (float)this.liliIIiIIl.Iilllilliill();
   }

   public ilIiIiiIiIiIii() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.liiIIIIiiiiIIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.liliIIiIIl, this.iiliIIiIIl});
   }
}
