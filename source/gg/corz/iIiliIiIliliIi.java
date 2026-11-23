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
import net.minecraft.class_243;

public class iIiliIiIliliIi extends ilIllIiIll {
   private final iiIiiilIIliiil lilIiiliiiilIiilii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   private static final double IiIIiiliiliIIiilii = (double)12.0F;
   private double iIiIiiliiIliIiilii = (double)-1.0F;
   private final IIIIlilllIIIlill IIiIiiliilIiIiilii = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)12.0F, (double)0.0F, (double)30.0F, (double)1.0F);
   private final IIIIlilllIIIlill lIlIiiliiiIlIiilii = new IIIIlilllIIIlill(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), (double)95.0F, (double)30.0F, (double)140.0F, (double)1.0F);
   private final iiIiiilIIliiil illIiiliiIilIiilii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private final iiIiiilIIliiil IllIiiliilllIiilii = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), true);
   private long lliIiiliiiliIiilii = 0L;
   private static final double iiIIiiliiIIlIiilii = 0.2825;

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 3116) << 11 | (char)((char)(-var4[var5]) - 3116) >>> 5) ^ var5) + var5) ^ 22496) - 22102) << 4 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 3116) << 11 | (char)((char)(-var4[var5]) - 3116) >>> 5) ^ var5) + var5) ^ 22496) - 22102) >>> 12) + 20038) + var5) - var5) - 21769) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 3116) << 11 | (char)((char)(-var4[var5]) - 3116) >>> 5) ^ var5) + var5) ^ 22496) - 22102) << 4 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - 3116) << 11 | (char)((char)(-var4[var5]) - 3116) >>> 5) ^ var5) + var5) ^ 22496) - 22102) >>> 12) + 20038) + var5) - var5) - 21769) >>> 3))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private double lIIlliIIll() {
      if (this.lilIiiliiiilIiilii.Iilllilliill() && Iiiilllliiilll.field_1724 != null) {
         class_243 var1 = Iiiilllliiilll.field_1724.method_18798();
         double var2 = Math.sqrt(var1.field_1352 * var1.field_1352 + var1.field_1350 * var1.field_1350);
         double var4 = Math.min((double)1.0F, var2 / Double.longBitsToDouble(658330603547529365L ^ 3958884287385681537L));
         return this.IIiIiiliilIiIiilii.Iilllilliill() * var4;
      } else {
         return (double)0.0F;
      }
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6915584473332334739L ^ Long.rotateLeft(858426816413520202L, 32) ^ -817709156282596805L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 234916293321037113L ^ Long.rotateLeft(-549847265758215254L, 10) ^ -8883250998814277143L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 2514256275523807638L ^ Long.rotateLeft(5824894962374751982L, 53) ^ 2454573065078828755L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6956628214898401726L ^ Long.rotateLeft(-2317256350490609813L, 3) ^ -3321498798658954258L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3730197534523655706L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -3149995260940883867L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 8438142628480256350L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4002475071405139255L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3330579170321405251L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -7432092901110066202L;
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
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) << 8) ^ var5) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) << 8) ^ var5) + var5) << 3) >>> 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) << 8) ^ var5) + var5) >>> 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) >>> 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') >>> 14 | (char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) >>> 3 | (char)((char)(~((char)(var4[var5] >>> 1 | var4[var5] << 15))) - var5) << 13) - '\ue09f') ^ var5) + var5) ^ '찬') << 2) + var5) + var5) << 10) << 8) ^ var5) + var5) << 3) << 9) - '輲'));
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
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 2171))) - var5) ^ var5) >>> 11 | (char)((char)((char)(~((char)(var4[var5] - 2171))) - var5) ^ var5) << 5) ^ 3493) + 28474) + var5) - '\uee81') >>> 4 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] - 2171))) - var5) ^ var5) >>> 11 | (char)((char)((char)(~((char)(var4[var5] - 2171))) - var5) ^ var5) << 5) ^ 3493) + 28474) + var5) - '\uee81') << 12))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIiliIiIliliIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IiIlIIIiliIlIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.lIlIiiliiiIlIiilii, this.IllIiiliilllIiilii, this.illIiiliiIilIiilii, this.lilIiiliiiilIiilii, this.IIiIiiliilIiIiilii});
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) + '\ude50') + var5) - 30218) - var5) - var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) + '\ude50') + var5) - 30218) - var5) - var5) + var5) >>> 6) << 10 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) + '\ude50') + var5) - 30218) - var5) - var5) + var5) << 10 | (char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] << 6 | var4[var5] >>> 10))) + '\ude50') + var5) - 30218) - var5) - var5) + var5) >>> 6) >>> 6))) ^ var5) ^ 12786))))))) - var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) << 8) - var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) << 8) - var5) >>> 13) - var5) - '﨓') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) << 8) - var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) >>> 8 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) >>> 12 | (char)((char)((char)((char)((char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) >>> 4 | (char)((char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) >>> 3 | (char)((char)(-var4[var5]) >>> 5 | (char)(-var4[var5]) << 11) << 13) << 12) ^ '饕') + var5) + var5) << 4) - 27468) + '鍐') - 4569) >>> 10) << 8) - var5) >>> 13) - var5) - '﨓') >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public float iiiIlIIIll(float original) {
      long var11 = 1236617332118632834L;
      var11 ^= ((long)(Integer)Iiiilllliiilll.field_1690.method_41808().method_41753() << 32 ^ var11) & -1L << 32;
      if ((int)(var11 >>> 32) <= 0) {
         return original;
      } else {
         double var3 = this.lIlIiiliiiIlIiilii.Iilllilliill() + this.lIIlliIIll();
         long var5 = System.nanoTime();
         double var7 = this.lliIiiliiiliIiilii == (4268714930647133255L ^ 4268714930647133255L) ? (double)0.0F : (double)(var5 - this.lliIiiliiiliIiilii) / Double.longBitsToDouble(-5574165264861863519L ^ -907093396884659807L);
         this.lliIiiliiiliIiilii = var5;
         if (this.iIiIiiliiIliIiilii < Double.longBitsToDouble(4036871790820170980L ^ 4036871790820170980L)) {
            this.iIiIiiliiIliIiilii = (double)((int)(var11 >>> 32));
         }

         if (!this.IllIiiliilllIiilii.Iilllilliill()) {
            this.iIiIiiliiIliIiilii = var3;
         } else {
            double var9 = (double)1.0F - Math.exp(Double.longBitsToDouble(5483985486877980678L ^ -8344317168963127290L) * Math.max((double)0.0F, var7));
            this.iIiIiiliiIliIiilii += (var3 - this.iIiIiiliiIliIiilii) * var9;
            if (Math.abs(this.iIiIiiliiIliIiilii - var3) < Double.longBitsToDouble(8503180806833345221L ^ 5307708205321751391L)) {
               this.iIiIiiliiIliIiilii = var3;
            }
         }

         if (this.illIiiliiIilIiilii.Iilllilliill()) {
            return (float)this.iIiIiiliiIliIiilii;
         } else {
            double var13 = (double)original / (double)((int)(var11 >>> 32));
            return (float)(this.iIiIiiliiIliIiilii * var13);
         }
      }
   }
}
