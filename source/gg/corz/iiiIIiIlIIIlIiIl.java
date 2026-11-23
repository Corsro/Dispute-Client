package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iiiIIiIlIIIlIiIl(lllIliilillIliil selected, List<lllIliilillIliil> candidates, double ticksSaved, String reason) {
   private final String IIIIIliIll;
   private final List<lllIliilillIliil> liiiiIiIll;
   private final lllIliilillIliil IiiiiIiIll;
   private final double iiiiiIiIll;

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + '횮') ^ var5) ^ var5))) ^ var5) - '髪') + var5))) - 27991) << 8 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + '횮') ^ var5) ^ var5))) ^ var5) - '髪') + var5))) - 27991) >>> 8) ^ 17378) - var5) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2371882072011697363L ^ Long.rotateLeft(8605499335606860804L, 40) ^ -7054334118294772232L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -3499030686759885114L ^ Long.rotateLeft(-895728705502395568L, 47) ^ -107694333787434102L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -723671965790351875L ^ Long.rotateLeft(-8538363168337137053L, 60) ^ 8089240096485252596L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -2718842535990418816L ^ Long.rotateLeft(535110700832021516L, 17) ^ 8368937882469410328L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 8024311450926328491L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6299862592072062047L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 1979728545764745981L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 2095778065585971742L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 949837407431632231L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1981262250596343292L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIIllIIliIIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IlIlllIlilIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IiIlliIliiIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIlllIlliIll<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Illlllllilll<invokedynamic>());
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

   public lllIliilillIliil liiiIIllIl() {
      return this.IiiiiIiIll;
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) + 11459))) + var5) + var5) - var5) ^ var5) ^ 21235) + var5) ^ 32061) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)(~var4[var5]) ^ var5))) + 11459))) + var5) + var5) - var5) ^ var5) ^ 21235) + var5) ^ 32061) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IilliliilIIi() {
      return this.iiiiiIiIll;
   }

   public String IliIlllilIi() {
      StringBuilder var1 = new StringBuilder();

      for(lllIliilillIliil var3 : this.liiiiIiIll) {
         if (var1.length() > 0) {
            var1.append(',');
         }

         var1.append(var3.iIlIlllllill()).append('(').append(var3.iliIiiliiiii()).append('/').append(String.format(Locale.ROOT, iliIiiliiiii<invokedynamic>(), var3.IliIlllilIi(), var3.liiiIIllIl())).append(')');
      }

      return iliIiiliiiii<invokedynamic>() + var1 + iliIiiliiiii<invokedynamic>() + (this.IiiiiIiIll == null ? iliIiiliiiii<invokedynamic>() : this.IiiiiIiIll.iIlIlllllill()) + iliIiiliiiii<invokedynamic>() + (this.IiiiiIiIll == null ? 0 : this.IiiiiIiIll.iliIiiliiiii()) + String.format(Locale.ROOT, iliIiiliiiii<invokedynamic>(), this.IiiiiIiIll == null ? (double)0.0F : this.IiiiiIiIll.IliIlllilIi(), this.IiiiiIiIll == null ? (double)0.0F : this.IiiiiIiIll.liiiIIllIl(), this.iiiiiIiIll) + iliIiiliiiii<invokedynamic>() + this.IIIIIliIll;
   }

   public String lIiiIiIlilli() {
      return this.IIIIIliIll;
   }

   public List<lllIliilillIliil> iIlIlllllill() {
      return this.liiiiIiIll;
   }

   public iiiIIiIlIIIlIiIl(lllIliilillIliil candidates, List<lllIliilillIliil> ticksSaved, double selected, String reason) {
      this.IiiiiIiIll = candidates;
      this.liiiiIiIll = ticksSaved;
      this.iiiiiIiIll = selected;
      this.IIIIIliIll = reason;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 14 | (char)(var4[var5] ^ var5) << 2))) - 21049) - 25056) - '込') + var5) + var5) - 10892) - var5) ^ '蔯'))))) >>> 3 | (char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) >>> 14 | (char)(var4[var5] ^ var5) << 2))) - 21049) - 25056) - '込') + var5) + var5) - 10892) - var5) ^ '蔯'))))) << 13));
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
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) << 2) - var5) - '텽') + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) << 2) - var5) - '텽') + var5) << 6) + 26415) - 22404) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) << 2) - var5) - '텽') + var5) >>> 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) >>> 14 | (char)((char)((char)(-((char)((char)((char)((char)((char)(-var4[var5]) - 30592) + 28122) ^ '\ued7a') + var5))) ^ var5) + var5) << 2) - var5) - '텽') + var5) << 6) + 26415) - 22404) << 13))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) + var5) - var5) - var5) - 22562) ^ 24150) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) + var5) - var5) - var5) - 22562) ^ 24150) + var5) >>> 12)) + var5))))) - 182) >>> 13 | (char)((char)(-((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) + var5) - var5) - var5) - 22562) ^ 24150) + var5) << 4 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] >>> 13 | var4[var5] << 3) - var5) + var5) - var5) - var5) - 22562) ^ 24150) + var5) >>> 12)) + var5))))) - 182) << 3))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
