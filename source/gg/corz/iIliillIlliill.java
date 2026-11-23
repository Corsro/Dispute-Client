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

public record iIliillIlliill(iIilIIllIlilIIll status, lilllIIliilllIIl reason, long target, long stand, IIlIiiIilIlIiiIi eye, boolean sneak, lIlIIiiliIlIIiil hit, iilliIilIIiliIil interval, double requiredOffset, double safeLimit) {
   private final IIlIiiIilIlIiiIi iiliIllIiIIiiIllIi;
   private final lilllIIliilllIIl iIliIllIiIlliIllIi;
   private final iIilIIllIlilIIll IIliIllIilIliIllIi;
   private final double liiiIllIiiiiiIllIi;
   private final long IiliIllIililiIllIi;
   private final lIlIIiiliIlIIiil IliiIllIilliiIllIi;
   private final double IIIIlllIilIIIlllIi;
   private final iilliIilIIiliIil iliiIllIiIiiiIllIi;
   private final boolean lIiiIllIiiIiiIllIi;
   private final long llliIllIiilliIllIi;

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -4852977932488744436L ^ Long.rotateLeft(-3955498838337304637L, 27) ^ -8530600212736264133L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4476094181803705322L ^ Long.rotateLeft(6793913616423615228L, 56) ^ -4493194251965828946L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2091654952815396763L ^ Long.rotateLeft(-3478830437920761045L, 48) ^ -1276545979689688460L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5070086815166354041L ^ Long.rotateLeft(8043036457288191052L, 29) ^ 8767629308728540853L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -4421918827141493520L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5817379553618479275L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4297977615619789707L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1127620869135455363L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 2227076172195263485L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 7180118943453121513L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlilIliiIli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illillliilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilililiiili<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IIiilIiiiIii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iliilliiilii<invokedynamic>());
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

   public boolean liiiIIllIl() {
      return this.IIliIllIilIliIllIi != iIilIIllIlilIIll.iilIlIllll;
   }

   public String IIIllIIliIIl() {
      String var10000;
      switch (this.IIliIllIilIliIllIi.ordinal()) {
         case 0 -> var10000 = IiIiliIiiiIi<invokedynamic>();
         case 1 -> var10000 = IiIiliIiiiIi<invokedynamic>();
         case 2 -> var10000 = IiIiliIiiiIi<invokedynamic>();
         case 3 -> var10000 = IiIiliIiiiIi<invokedynamic>() + this.iIliIllIiIlliIllIi;
         default -> throw new MatchException((String)null, (Throwable)null);
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 27953) << 11 | (char)((char)((char)(var4[var5] + var5) - var5) - 27953) >>> 5) + var5) ^ var5))))) ^ var5) ^ 29090) ^ var5) ^ '驑')) - '胨') << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 27953) << 11 | (char)((char)((char)(var4[var5] + var5) - var5) - 27953) >>> 5) + var5) ^ var5))))) ^ var5) ^ 29090) ^ var5) ^ '驑')) - '胨') >>> 15))) << 5 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 27953) << 11 | (char)((char)((char)(var4[var5] + var5) - var5) - 27953) >>> 5) + var5) ^ var5))))) ^ var5) ^ 29090) ^ var5) ^ '驑')) - '胨') << 1 | (char)((char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) - 27953) << 11 | (char)((char)((char)(var4[var5] + var5) - var5) - 27953) >>> 5) + var5) ^ var5))))) ^ var5) ^ 29090) ^ var5) ^ '驑')) - '胨') >>> 15))) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IIillIiliIil() {
      return this.lIiiIllIiiIiiIllIi;
   }

   public long IIlllIlliIll() {
      return this.llliIllIiilliIllIi;
   }

   public static iIliillIlliill lIiiIiIlilli(long reason, long target, lilllIIliilllIIl stand) {
      return new iIliillIlliill(iIilIIllIlilIIll.iilIlIllll, stand, reason, target, IIlIiiIilIlIiiIi.lllIiiiIIi, false, (lIlIIiiliIlIIiil)null, (iilliIilIIiliIil)null, (double)0.0F, 0.29000000000000004);
   }

   public IIlIiiIilIlIiiIi Iilllilliill() {
      return this.iiliIllIiIIiiIllIi;
   }

   public boolean iIlIlllllill() {
      return this.IIliIllIilIliIllIi == iIilIIllIlilIIll.IilIlIllll;
   }

   public iilliIilIIiliIil Iiilliiliiil() {
      return this.iliiIllIiIiiiIllIi;
   }

   public boolean IliIlllilIi() {
      return this.IIliIllIilIliIllIi == iIilIIllIlilIIll.illIlIllll || this.IIliIllIilIliIllIi == iIilIIllIlilIIll.IilIlIllll;
   }

   public iIilIIllIlilIIll IlIlllIlilIl() {
      return this.IIliIllIilIliIllIi;
   }

   public double IIIilIIiiIIi() {
      return this.liiiIllIiiiiiIllIi;
   }

   public lIlIIiiliIlIIiil Ililllililil() {
      return this.IliiIllIilliiIllIi;
   }

   public boolean IilliliilIIi() {
      return this.IIliIllIilIliIllIi == iIilIIllIlilIIll.iilIlIllll && (this.iIliIllIiIlliIllIi == lilllIIliilllIIl.illliillIl || this.iIliIllIiIlliIllIi == lilllIIliilllIIl.IilliillIl || this.iIliIllIiIlliIllIi == lilllIIliilllIIl.iilliillIl);
   }

   public iIliillIlliill(iIilIIllIlilIIll hit, lilllIIliilllIIl eye, long status, long requiredOffset, IIlIiiIilIlIiiIi reason, boolean stand, lIlIIiiliIlIIiil interval, iilliIilIIiliIil sneak, double safeLimit, double target) {
      this.IIliIllIilIliIllIi = hit;
      this.iIliIllIiIlliIllIi = eye;
      this.llliIllIiilliIllIi = status;
      this.IiliIllIililiIllIi = requiredOffset;
      this.iiliIllIiIIiiIllIi = reason;
      this.lIiiIllIiiIiiIllIi = stand;
      this.IliiIllIilliiIllIi = interval;
      this.iliiIllIiIiiiIllIi = sneak;
      this.liiiIllIiiiiiIllIi = safeLimit;
      this.IIIIlllIilIIIlllIi = target;
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) >>> 7 | (char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) << 9) ^ var5)) - 28786) - var5) ^ '꾇') - '쳒') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) >>> 7 | (char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) << 9) ^ var5)) - 28786) - var5) ^ '꾇') - '쳒') >>> 10) ^ 2613) - '픘') >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) >>> 7 | (char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) << 9) ^ var5)) - 28786) - var5) ^ '꾇') - '쳒') << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) >>> 7 | (char)((char)((char)((char)(var4[var5] + '\ue8ce') - '鮷') >>> 13 | (char)((char)(var4[var5] + '\ue8ce') - '鮷') << 3) + var5) << 9) ^ var5)) - 28786) - var5) ^ '꾇') - '쳒') >>> 10) ^ 2613) - '픘') << 12) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) >>> 2) - '郦'))) - var5) - '鼆') >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) >>> 2) - '郦'))) - var5) - '鼆') << 11) ^ var5) - '\ueaaa') - var5) ^ var5) - var5) + '褯') - var5) << 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) >>> 2) - '郦'))) - var5) - '鼆') >>> 5 | (char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) << 14 | (char)((char)(~((char)((char)(var4[var5] - var5) - var5))) >>> 7 | (char)(~((char)((char)(var4[var5] - var5) - var5))) << 9) >>> 2) - '郦'))) - var5) - '鼆') << 11) ^ var5) - '\ueaaa') - var5) ^ var5) - var5) + '褯') - var5) >>> 7));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public double IlIillIiilIi() {
      return this.IIIIlllIilIIIlllIi;
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '섹') << 8 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '섹') >>> 8))) ^ 23962) >>> 10 | (char)((char)(-((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '섹') << 8 | (char)((char)((char)(-((char)(var4[var5] ^ var5))) - var5) - '섹') >>> 8))) ^ 23962) << 6) - 10912) + '鬺'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public long Illlllllilll() {
      return this.IiliIllIililiIllIi;
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) >>> 6))) - var5))) + '\ue0a7') >>> 6 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) >>> 6))) - var5))) + '\ue0a7') << 10) ^ 26818) - var5) ^ 2316) << 10 | (char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) >>> 6))) - var5))) + '\ue0a7') >>> 6 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) << 10 | (char)((char)(var4[var5] << 6 | var4[var5] >>> 10) << 9 | (char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 7) >>> 6))) - var5))) + '\ue0a7') << 10) ^ 26818) - var5) ^ 2316) >>> 6));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public lilllIIliilllIIl IiIlliIliiIl() {
      return this.iIliIllIiIlliIllIi;
   }

   iIliillIlliill iliIiiliiiii() {
      return new iIliillIlliill(iIilIIllIlilIIll.lilIlIllll, this.iIliIllIiIlliIllIi, this.llliIllIiilliIllIi, this.IiliIllIililiIllIi, this.iiliIllIiIIiiIllIi, this.lIiiIllIiiIiiIllIi, this.IliiIllIilliiIllIi, this.iliiIllIiIiiiIllIi, this.liiiIllIiiiiiIllIi, this.IIIIlllIilIIIlllIi);
   }
}
