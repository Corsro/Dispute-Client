package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class ililIIIlIiilIIIl {
   private ililIIIlIiilIIIl() {
   }

   public static Iliiilllliiill IliIlllilIi(int minSafeComponent, int hasSafeReturnPath, boolean postComponentSize, boolean hasSafeContinuation, boolean ownedRemovableEscape) {
      if (minSafeComponent < hasSafeReturnPath && !ownedRemovableEscape && !hasSafeContinuation) {
         return new Iliiilllliiill(IIIIlIilIIIlIi.iliIiIIiiIiiIiIIii, minSafeComponent, String.format(Locale.ROOT, iIlIlllllill<invokedynamic>(), minSafeComponent, hasSafeReturnPath));
      } else if (!postComponentSize && !hasSafeContinuation) {
         return ownedRemovableEscape ? new Iliiilllliiill(IIIIlIilIIIlIi.IliIiIIiilliIiIIii, minSafeComponent, iIlIlllllill<invokedynamic>()) : new Iliiilllliiill(IIIIlIilIIIlIi.iliIiIIiiIiiIiIIii, minSafeComponent, iIlIlllllill<invokedynamic>());
      } else {
         return new Iliiilllliiill(IIIIlIilIIIlIi.lIiIiIIiiiIiIiIIii, minSafeComponent, postComponentSize ? iIlIlllllill<invokedynamic>() : iIlIlllllill<invokedynamic>());
      }
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) << 14 | (char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) >>> 2) + var5) ^ 15326))) - var5) ^ var5) ^ 15679) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) << 14 | (char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) >>> 2) + var5) ^ 15326))) - var5) ^ var5) ^ 15679) << 5) + 12478)))) >>> 14 | (char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) << 14 | (char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) >>> 2) + var5) ^ 15326))) - var5) ^ var5) ^ 15679) >>> 11 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) << 14 | (char)((char)((char)((char)(var4[var5] + var5) + 18974) + '\uf47a') ^ var5) >>> 2) + var5) ^ 15326))) - var5) ^ var5) ^ 15679) << 5) + 12478)))) << 2) ^ 31005));
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
         var4[var5] = (char)((char)((char)(~((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ue53d'))) ^ var5) ^ var5) + '飥') + '\ued9d') + 17134) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ue53d'))) ^ var5) ^ var5) + '飥') + '\ued9d') + 17134) + var5) + var5) >>> 10) - var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ue53d'))) ^ var5) ^ var5) + '飥') + '\ued9d') + 17134) + var5) + var5) << 6 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - '\ue53d'))) ^ var5) ^ var5) + '飥') + '\ued9d') + 17134) + var5) + var5) >>> 10) - var5) >>> 9) - '薁') + var5) - 19518))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 6021797984541748644L ^ Long.rotateLeft(937928362383269972L, 34) ^ 1725992603052729342L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2176762114266046946L ^ Long.rotateLeft(6169601402486173200L, 34) ^ -4293340405075304180L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1112419080594265744L ^ Long.rotateLeft(2789420251678610688L, 8) ^ 2238020906497226024L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -1133595871304178228L ^ Long.rotateLeft(-6872668906165881559L, 50) ^ 7516748952557673959L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5433756515477890630L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5249835279535328748L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2115693941357968642L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2964204404509689214L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 32797944366259967L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 5524625813631925742L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IilliliilIIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, lIiiIiIlilli<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, iliIiiliiiii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIIllIIliIIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IlIlllIlilIl<invokedynamic>());
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
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) << 11 | (char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) >>> 5) << 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) << 11 | (char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) >>> 5) >>> 15))) >>> 5 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) << 11 | (char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) >>> 5) << 1 | (char)((char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) << 11 | (char)((char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) << 9 | (char)((char)(-((char)((char)(var4[var5] - 25554) ^ 29817))) + var5) >>> 7) >>> 5) >>> 15))) << 11) ^ var5))));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ 21482) ^ var5) - '뫤'))) ^ '쀀') << 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ 21482) ^ var5) - '뫤'))) ^ '쀀') >>> 6))) - var5) >>> 12 | (char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ 21482) ^ var5) - '뫤'))) ^ '쀀') << 10 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - var5) - var5) ^ 21482) ^ var5) - '뫤'))) ^ '쀀') >>> 6))) - var5) << 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static Iliiilllliiill liiiIIllIl(int hasSafeReturnPath, int minSafeComponent, boolean hasSafeContinuation, boolean postComponentSize, boolean ownedRemovableEscape) {
      Iliiilllliiill var5 = IliIlllilIi(hasSafeReturnPath, minSafeComponent, hasSafeContinuation, postComponentSize, ownedRemovableEscape);
      return new Iliiilllliiill(var5.IilliliilIIi(), var5.lIiiIiIlilli(), iIlIlllllill<invokedynamic>() + var5.iliIiiliiiii());
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)(var4[var5] - 3855) << 10 | (char)(var4[var5] - 3855) >>> 6))) ^ var5) + var5) ^ var5) ^ 29693) - var5))) + 22370))) ^ 23845) + '躶') - '\uefd0'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
