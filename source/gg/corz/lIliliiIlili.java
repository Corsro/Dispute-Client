package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_3489;

public enum lIliliiIlili {
   lIIlIllIliIIlIllIl((s) -> s.method_31574(class_1802.field_23141), true, true),
   iIiIIllIlIliIIllIl((s) -> s.method_31574(class_1802.field_8301), false, true);

   public final Predicate<class_1799> iIllIllIlIlllIllIl;
   lliIIllIliliIIllIl((s) -> s.method_31574(class_1802.field_8281), false, true),
   ilIlIllIlIiIlIllIl((s) -> s.method_31573(class_3489.field_42614), false, true);

   public final boolean llllIllIlilllIllIl;
   IlIlIllIlllIlIllIl((s) -> s.method_31574(class_1802.field_8801), true, true),
   IIllIllIllIllIllIl((s) -> s.method_31574(class_1802.field_8287), false, false);

   public final boolean IillIllIllillIllIl;
   IiiIIllIlliiIIllIl((s) -> lIlllIliIlllIl.iIlIlllllill(s), false, true),
   iiiIIllIlIIIlIllIl((s) -> s.method_31574(class_1802.field_8634), false, true),
   liIlIllIliiIlIllIl((s) -> s.method_31574(class_1802.field_8463) || s.method_31574(class_1802.field_8367), false, false);

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -2373480911392909747L ^ Long.rotateLeft(2999237322964460478L, 46) ^ 2867893249747009905L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -7934587837924201088L ^ Long.rotateLeft(215334805959488678L, 1) ^ -7649592282415447355L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2352656231385141450L ^ Long.rotateLeft(-3609005568746624078L, 58) ^ -9010455410084198875L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -7119467573716975637L ^ Long.rotateLeft(-220963722509949391L, 36) ^ 1831829512704959414L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1924389408730154444L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -168484615425071593L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 524488318730101400L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5690831743959516332L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8326116087143186233L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -4745691100157316068L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iilllilliill<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIillIiliIil<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Ililllililil<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iiilliiliiil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIIilIIiiIIi<invokedynamic>());
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
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) << 1) - 'ﰐ') ^ var5) << 9 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) << 1) - 'ﰐ') ^ var5) >>> 7))) << 15 | (char)(~((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) << 1) - 'ﰐ') ^ var5) << 9 | (char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) >>> 15 | (char)((char)(-((char)(-((char)((char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) << 9 | (char)((char)(~((char)((char)(var4[var5] << 10 | var4[var5] >>> 6) - '뾚'))) + var5) >>> 7))))) ^ var5) << 1) - 'ﰐ') ^ var5) >>> 7))) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) << 14 | (char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) >>> 2) >>> 14 | (char)((char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) << 14 | (char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) >>> 2) << 2) - var5))))))) >>> 3 | (char)(~((char)(-((char)(~((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) << 14 | (char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) >>> 2) >>> 14 | (char)((char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) << 14 | (char)(-((char)((char)(var4[var5] ^ '폟') - 19490))) >>> 2) << 2) - var5))))))) << 13) - '쑇'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') << 3) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') << 3) << 12) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') << 3) >>> 4 | (char)((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') >>> 13 | (char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) << 15 | (char)((char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) >>> 9 | (char)((char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) >>> 10 | (char)(~((char)((char)(var4[var5] >>> 2 | var4[var5] << 14) >>> 7 | (char)(var4[var5] >>> 2 | var4[var5] << 14) << 9))) << 6) << 7) >>> 1) + var5) ^ '釋') << 3) << 12) << 15) - '솫') ^ '췴') + '퍲') ^ 27059) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private lIliliiIlili(Predicate<class_1799> test, boolean overworldOnly, boolean var5) {
      this.iIllIllIlIlllIllIl = test;
      this.llllIllIlilllIllIl = overworldOnly;
      this.IillIllIllillIllIl = var5;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) << 2 | (char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) >>> 14) + 12085) + '뙹') ^ var5) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) << 2 | (char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) >>> 14) + 12085) + '뙹') ^ var5) - var5) << 5))) << 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) << 2 | (char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) >>> 14) + 12085) + '뙹') ^ var5) - var5) >>> 11 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) << 2 | (char)((char)((char)((char)(var4[var5] - '쿥') + '\uea72') << 10 | (char)((char)(var4[var5] - '쿥') + '\uea72') >>> 6) + 22818) >>> 14) + 12085) + '뙹') ^ var5) - var5) << 5))) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static lIliliiIlili[] IIlllIlliIll() {
      return new lIliliiIlili[]{iIiIIllIlIliIIllIl, lliIIllIliliIIllIl, IiiIIllIlliiIIllIl, iiiIIllIlIIIlIllIl, lIIlIllIliIIlIllIl, IlIlIllIlllIlIllIl, ilIlIllIlIiIlIllIl, liIlIllIliiIlIllIl, IIllIllIllIllIllIl};
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 23550))) >>> 7 | (char)(~((char)(var4[var5] + 23550))) << 9) - '쩱') + var5) >>> 14 | (char)((char)((char)((char)(~((char)(var4[var5] + 23550))) >>> 7 | (char)(~((char)(var4[var5] + 23550))) << 9) - '쩱') + var5) << 2) + var5) ^ var5) - var5) + 786) + var5) >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] + 23550))) >>> 7 | (char)(~((char)(var4[var5] + 23550))) << 9) - '쩱') + var5) >>> 14 | (char)((char)((char)((char)(~((char)(var4[var5] + 23550))) >>> 7 | (char)(~((char)(var4[var5] + 23550))) << 9) - '쩱') + var5) << 2) + var5) ^ var5) - var5) + 786) + var5) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
