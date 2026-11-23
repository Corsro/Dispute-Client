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

public record iiiliIllIIIiiIll(ilIilIlIiIilIl verdict, iillliIIilli first, String why) {
   private final String IiilIiilll;
   private final iillliIIilli ililIiilll;
   private final ilIilIlIiIilIl llilIiilll;

   public boolean liiiIIllIl() {
      return this.llilIiilll == ilIilIlIiIilIl.llliIiIllilliIiIll;
   }

   public boolean IliIlllilIi() {
      return this.llilIiilll == ilIilIlIiIilIl.IIliIiIlllIliIiIll;
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 6560) << 6 | (char)(var4[var5] + 6560) >>> 10))) - var5) ^ '찦'))) << 13 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 6560) << 6 | (char)(var4[var5] + 6560) >>> 10))) - var5) ^ '찦'))) >>> 3) + '췉') + var5))) - 30958))) ^ var5) >>> 12 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 6560) << 6 | (char)(var4[var5] + 6560) >>> 10))) - var5) ^ '찦'))) << 13 | (char)(-((char)((char)((char)(-((char)((char)(var4[var5] + 6560) << 6 | (char)(var4[var5] + 6560) >>> 10))) - var5) ^ '찦'))) >>> 3) + '췉') + var5))) - 30958))) ^ var5) << 4) + '鍆') - var5) + 17797) + 10528) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iillliIIilli lIiiIiIlilli() {
      return this.ililIiilll;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - '觫') - var5) ^ var5))))))) ^ var5))) - var5) << 8 | (char)((char)(~((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)(var4[var5] << 5 | var4[var5] >>> 11) - '觫') - var5) ^ var5))))))) ^ var5))) - var5) >>> 8) + 6710));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6442855301331975960L ^ Long.rotateLeft(5314511970533480762L, 30) ^ -3609787238970241725L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 7627999025785000855L ^ Long.rotateLeft(-7623000827336381416L, 20) ^ 5372424304341839486L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -5531128372495802976L ^ Long.rotateLeft(6744748247762698470L, 43) ^ 5474552012793338531L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5333150064670872162L ^ Long.rotateLeft(-5019861784115476689L, 24) ^ -2869934173947747067L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3251131643999367556L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2451519883790017849L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 3881914647277411719L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3372128444586060807L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 1917909025755244739L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 9063695785338653261L;
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

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5) - 13940) ^ '\udd04') + 27710))) + var5) - '鱆') ^ var5) + 7390) ^ '\ue1a3') ^ 21843) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5) - 13940) ^ '\udd04') + 27710))) + var5) - '鱆') ^ var5) + 7390) ^ '\ue1a3') ^ 21843) << 14) ^ '킦') << 2 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5) - 13940) ^ '\udd04') + 27710))) + var5) - '鱆') ^ var5) + 7390) ^ '\ue1a3') ^ 21843) >>> 2 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] << 9 | var4[var5] >>> 7) + var5) - 13940) ^ '\udd04') + 27710))) + var5) - '鱆') ^ var5) + 7390) ^ '\ue1a3') ^ 21843) << 14) ^ '킦') >>> 14))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public String iIlIlllllill() {
      return this.llilIiilll + IIIllIIliIIl<invokedynamic>() + this.ililIiilll + IIIllIIliIIl<invokedynamic>() + this.IiilIiilll + IIIllIIliIIl<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '鵂') + var5) + 27316) ^ 28689) - var5) - 261)))))) ^ 31283))) << 9 | (char)(~((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '鵂') + var5) + 27316) ^ 28689) - var5) - 261)))))) ^ 31283))) >>> 7) ^ var5) - 23409) - var5) ^ 23197));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public ilIilIlIiIilIl IilliliilIIi() {
      return this.llilIiilll;
   }

   public iiiliIllIIIiiIll(ilIilIlIiIilIl first, iillliIIilli why, String verdict) {
      this.llilIiilll = first;
      this.ililIiilll = why;
      this.IiilIiilll = verdict;
   }

   public String iliIiiliiiii() {
      return this.IiilIiilll;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-var4[var5]) + var5) + var5) << 13 | (char)((char)((char)(-var4[var5]) + var5) + var5) >>> 3) >>> 10 | (char)((char)((char)((char)(-var4[var5]) + var5) + var5) << 13 | (char)((char)((char)(-var4[var5]) + var5) + var5) >>> 3) << 6))) + var5)) + 23648))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
