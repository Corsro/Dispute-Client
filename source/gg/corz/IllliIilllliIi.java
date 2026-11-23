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

public class IllliIilllliIi extends ilIllIiIll {
   private final iilIililIIiIilil iIIlliliiIlIllilii = new iilIililIIiIilil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>());

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5))) + 25199) - var5) + var5))) + var5) - var5) >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5))) + 25199) - var5) + var5))) + var5) - var5) << 10))) >>> 5 | (char)(~((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5))) + 25199) - var5) + var5))) + var5) - var5) >>> 6 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-((char)(var4[var5] >>> 9 | var4[var5] << 7))) + var5))) + 25199) - var5) + var5))) + var5) - var5) << 10))) << 11))) + var5) - '꺐') + 24727) - 8485))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1877444348189656628L ^ Long.rotateLeft(-6630553348091959498L, 18) ^ 3353981830371073249L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 276545513006154404L ^ Long.rotateLeft(-8523352891689166908L, 25) ^ -672755375479126839L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 1837989290980419375L ^ Long.rotateLeft(8774406754722738767L, 3) ^ 1439621990923399697L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5739358923079581212L ^ Long.rotateLeft(-4980675284818110440L, 19) ^ -2306955220596769588L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8729855038174747504L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -361484229353083244L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -6782970305742206334L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 8933399464428084468L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 4620506429221021897L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 2472312722371211021L;
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
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) >>> 5) ^ 20134) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) >>> 5) ^ 20134) >>> 6) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) >>> 5) ^ 20134) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) << 11 | (char)((char)((char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) << 11 | (char)((char)((char)((char)(var4[var5] ^ 12647) ^ var5) ^ var5) + var5) >>> 5) - 22936) >>> 5) ^ 20134) >>> 6) >>> 6) + var5) ^ 21066) + '즷') ^ var5));
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
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + '阱'))) - var5) - 24820) ^ var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + '阱'))) - var5) - 24820) ^ var5) << 6) - var5))) + '艡') ^ var5) - var5) ^ '\uddd1'))) << 3 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + '阱'))) - var5) - 24820) ^ var5) >>> 10 | (char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) + '阱'))) - var5) - 24820) ^ var5) << 6) - var5))) + '艡') ^ var5) - var5) ^ '\uddd1'))) >>> 13))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) - var5) ^ '\ue92d') << 11 | (char)((char)((char)(var4[var5] ^ var5) - var5) ^ '\ue92d') >>> 5) >>> 8 | (char)((char)((char)((char)(var4[var5] ^ var5) - var5) ^ '\ue92d') << 11 | (char)((char)((char)(var4[var5] ^ var5) - var5) ^ '\ue92d') >>> 5) << 8) + '饂') ^ var5) + '褹'))) + var5) - 22704) - var5) ^ '\ued7d') - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) << 7 | (char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) >>> 9))))) ^ 16723) >>> 6 | (char)((char)(~((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) << 7 | (char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) >>> 9))))) ^ 16723) << 10) << 10 | (char)((char)((char)(~((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) << 7 | (char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) >>> 9))))) ^ 16723) >>> 6 | (char)((char)(~((char)(~((char)((char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) << 7 | (char)(~((char)((char)(var4[var5] >>> 1 | var4[var5] << 15) >>> 15 | (char)(var4[var5] >>> 1 | var4[var5] << 15) << 1))) >>> 9))))) ^ 16723) << 10) >>> 6) ^ '鮵'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public IllliIilllliIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IIilIIIilIilIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIIlliliiIlIllilii});
      this.IIillIiliIil(true);
   }

   public boolean Iilllilliill() {
      return true;
   }
}
