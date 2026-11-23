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

record iIiiiiilIliiiiil(liliiiiliiliiiil r, int prep, int slot, class_2338 anchor, String why, int deadline) {
   static final iIiiiiilIliiiiil lilIliIiil;
   private final String illIliIiil;
   private final int iIlIliIiil;
   static final iIiiiiilIliiiiil iilIliIiil;
   private final int IllIliIiil;
   private final int IilIliIiil;
   private final class_2338 lllIliIiil;
   private final liliiiiliiliiiil lIlIliIiil;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 4988))) + 350) ^ 20189) >>> 1 | (char)((char)((char)(~((char)(var4[var5] + 4988))) + 350) ^ 20189) << 15) - 25256) - '홊') >>> 10 | (char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 4988))) + 350) ^ 20189) >>> 1 | (char)((char)((char)(~((char)(var4[var5] + 4988))) + 350) ^ 20189) << 15) - 25256) - '홊') << 6) - var5) ^ '륨') ^ var5) + var5) + var5))) + '\ude59') ^ var5) + var5) - var5) + '襤'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) << 14 | (char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) >>> 2) >>> 10 | (char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) << 14 | (char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) >>> 2) << 6) - 17439) ^ var5))) + 24043) ^ var5))) ^ var5) ^ var5) << 8 | (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) << 14 | (char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) >>> 2) >>> 10 | (char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) << 14 | (char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) - 8468))) + var5) - '\uf064'))) >>> 2) << 6) - 17439) ^ var5))) + 24043) ^ var5))) ^ var5) ^ var5) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iIlIlllllill() {
      return this.IllIliIiil;
   }

   public liliiiiliiliiiil IliIlllilIi() {
      return this.lIlIliIiil;
   }

   private iIiiiiilIliiiiil(liliiiiliiliiiil anchor, int slot, int deadline, class_2338 prep, String why, int r) {
      this.lIlIliIiil = anchor;
      this.iIlIliIiil = slot;
      this.IllIliIiil = deadline;
      this.lllIliIiil = prep;
      this.illIliIiil = why;
      this.IilIliIiil = r;
   }

   public int liiiIIllIl() {
      return this.iIlIliIiil;
   }

   public String lIiiIiIlilli() {
      return this.illIliIiil;
   }

   public class_2338 IilliliilIIi() {
      return this.lllIliIiil;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) - 21948))))) + 23385) ^ '뢨') >>> 12 | (char)((char)((char)(-((char)(-((char)((char)(-var4[var5]) - 21948))))) + 23385) ^ '뢨') << 4))) + var5))) ^ '썌') - 23502) + '뙞') ^ var5) + '푿') - '黢') ^ 4374) ^ '쉰'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - '\ufded') + 'ﰩ') - 27854))) ^ var5) ^ var5) ^ var5) - '\uf0ea') << 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - '\ufded') + 'ﰩ') - 27854))) ^ var5) ^ var5) ^ var5) - '\uf0ea') >>> 8) << 13 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - '\ufded') + 'ﰩ') - 27854))) ^ var5) ^ var5) ^ var5) - '\uf0ea') << 8 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(var4[var5] - var5) - '\ufded') + 'ﰩ') - 27854))) ^ var5) ^ var5) ^ var5) - '\uf0ea') >>> 8) >>> 3) + var5) ^ '設'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii() {
      return this.IilIliIiil;
   }

   static {
      lilIliIiil = new iIiiiiilIliiiiil(liliiiiliiliiiil.llIIliIiil, 0, -1, (class_2338)null, IIIllIIliIIl<invokedynamic>(), 0);
      iilIliIiil = new iIiiiiilIliiiiil(liliiiiliiliiiil.llIIliIiil, 0, -1, (class_2338)null, IIIllIIliIIl<invokedynamic>(), 0);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 1198171387123186156L ^ Long.rotateLeft(-1716282277513378433L, 60) ^ -3639797177745725113L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1332488027611092210L ^ Long.rotateLeft(787702505571008703L, 31) ^ -188094890499671478L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 6264877633219009555L ^ Long.rotateLeft(4985884056679997337L, 9) ^ -1204083696405543394L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 158114395254227130L ^ Long.rotateLeft(-2252074706464141586L, 22) ^ 8569872770990824329L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1202113767505441262L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 8588272652145876172L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7138538524926866365L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5554300841561306610L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 92491481983872787L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3593334251363140334L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illlllllilll<invokedynamic>());
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

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) << 4 | (char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) >>> 12))) + '逼') ^ '\udf2a') - '\udb1e') >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) << 4 | (char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) >>> 12))) + '逼') ^ '\udf2a') - '\udb1e') << 4) - var5) << 7 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) << 4 | (char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) >>> 12))) + '逼') ^ '\udf2a') - '\udb1e') >>> 12 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) << 4 | (char)((char)((char)((char)(-var4[var5]) - 11281) ^ '횖') + var5) >>> 12))) + '逼') ^ '\udf2a') - '\udb1e') << 4) - var5) >>> 9) ^ 4613) - '\ue29d') + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
