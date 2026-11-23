package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1294;
import net.minecraft.class_1713;
import net.minecraft.class_1723;
import net.minecraft.class_1802;
import net.minecraft.class_437;
import net.minecraft.class_490;

public class IIlIIilIlIIi extends ilIllIiIll {
   public final Iiiliillliiliill IIIIiliilIIIilii = new Iiiliillliiliill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), Double.longBitsToDouble(4928439718861812581L ^ 313938950667318117L), Double.longBitsToDouble(8638248905482959397L ^ 4010518813383064101L), (double)0.0F, Double.longBitsToDouble(5672632463873664621L ^ 1066224101259601517L), (double)1.0F);
   private double IiIIiliiliIIilii = Double.longBitsToDouble(-8322028098386267285L ^ -3694016531309661333L);
   private final IIilIIilIilIIi llIIiliiilIIilii = new IIilIIilIilIIi();
   public final iiIiiilIIliiil iIIIiliiIlIIilii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);

   public IIlIIilIlIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.IIIIiliilIIIilii, this.iIIIiliiIlIIilii});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) >>> 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) << 1) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) >>> 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) << 1) >>> 1) + 413) ^ var5) ^ 23141) + var5) << 7 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) >>> 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) << 1) << 15 | (char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) >>> 15 | (char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) >>> 6 | (char)((char)((char)((char)(var4[var5] - 11292) >>> 7 | (char)(var4[var5] - 11292) << 9) + '\uf056') + var5) << 10) - 10445) + 9711))) << 1) >>> 1) + 413) ^ var5) ^ 23141) + var5) >>> 9));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 3 | (char)(var4[var5] + var5) << 13) - var5))) - var5))) ^ var5))) - var5) - var5))) << 10 | (char)(~((char)((char)((char)(-((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] + var5) >>> 3 | (char)(var4[var5] + var5) << 13) - var5))) - var5))) ^ var5))) - var5) - var5))) >>> 6));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 661))) + var5))) + var5) - '\ue7c1'))) + var5) + 3899))) - var5) + 7248) - 1553) - var5) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 661))) + var5))) + var5) - '\ue7c1'))) + var5) + 3899))) - var5) + 7248) - 1553) - var5) << 11) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 661))) + var5))) + var5) - '\ue7c1'))) + var5) + 3899))) - var5) + 7248) - 1553) - var5) >>> 5 | (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-((char)(var4[var5] + 661))) + var5))) + var5) - '\ue7c1'))) + var5) + 3899))) - var5) + 7248) - 1553) - var5) << 11) - var5) << 5) - '蔎'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private void iiiIlIIIll() {
      this.IiIIiliiliIIilii = this.IIIIiliilIIIilii.Iilllilliill() + ThreadLocalRandom.current().nextDouble() * (this.IIIIiliilIIIilii.Ililllililil() - this.IIIIiliilIIIilii.Iilllilliill());
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) >>> 9 | (char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) << 7) >>> 6 | (char)((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) >>> 9 | (char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) << 7) << 10) >>> 8 | (char)((char)((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) >>> 9 | (char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) << 7) >>> 6 | (char)((char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) >>> 9 | (char)((char)((char)(-((char)((char)(~((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) << 3 | (char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) >>> 4 | (char)((char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) >>> 5 | (char)((char)((char)(var4[var5] ^ var5) ^ '\ue9cb') + 18748) << 11) << 12) >>> 13) - 4572))))))) + var5))) - var5) ^ var5) << 7) << 10) << 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 19475) - '\ue243') ^ 769) - '\ue990') + 5445) ^ 'ꁕ') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 19475) - '\ue243') ^ 769) - '\ue990') + 5445) ^ 'ꁕ') >>> 8))) << 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 19475) - '\ue243') ^ 769) - '\ue990') + 5445) ^ 'ꁕ') << 8 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + var5))) - var5) - 19475) - '\ue243') ^ 769) - '\ue990') + 5445) ^ 'ꁕ') >>> 8))) >>> 14))) - 727))) ^ '섚')))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8352413794886767627L ^ Long.rotateLeft(-147888289359406473L, 22) ^ 2316497662329568354L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 9088360593451007962L ^ Long.rotateLeft(2033191039430376480L, 50) ^ -745078459431988684L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 91204973591646922L ^ Long.rotateLeft(8542975170608923289L, 37) ^ 8829864617129186521L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 614168310325372754L ^ Long.rotateLeft(-2614086120647175328L, 24) ^ -8585951958693923704L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 935826835284436908L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5938359429708874206L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4583286773084909758L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5202581099243510545L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6831224335137556438L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -9081358337813603996L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null) {
         class_437 var2 = Iiiilllliiilll.field_1755;
         if (var2 instanceof class_490) {
            class_490 var1 = (class_490)var2;
            if (this.lIIlliIIll() != -1 && this.llIIiliiilIIilii.iIlIlllllill(this.IiIIiliiliIIilii)) {
               int var3 = IllIiIillllIiIil.IliIlllilIi(9, 36, this.iIIIiliiIlIIilii.Iilllilliill() ? class_1294.field_5915 : null);
               if (var3 != -1) {
                  Iiiilllliiilll.field_1761.method_2906(((class_1723)var1.method_17577()).field_7763, var3, 0, class_1713.field_7794, Iiiilllliiilll.field_1724);
                  this.iiiIlIIIll();
                  this.llIIiliiilIIilii.IliIlllilIi();
               }
            }
         } else {
            this.iiiIlIIIll();
            this.llIIiliiilIIilii.IliIlllilIi();
         }
      }
   }

   private int lIIlliIIll() {
      for(int var1 = 0; var1 < 9; ++var1) {
         if (Iiiilllliiilll.field_1724.method_31548().method_5438(var1).method_7909() == class_1802.field_8162) {
            return var1;
         }
      }

      return -1;
   }
}
