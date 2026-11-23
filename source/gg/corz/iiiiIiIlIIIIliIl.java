package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public record iiiiIiIlIIIIliIl(String blockId, Map<String, String> protectedState) {
   private final Map<String, String> IllIiliIll;
   private final String iIlIiliIll;

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) << 9 | (char)((char)(~var4[var5]) + var5) >>> 7))) ^ var5) ^ var5) + var5))) + 30474))) - 24031) - var5) ^ '髕'))) ^ 15323) << 15 | (char)((char)(-((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(~var4[var5]) + var5) << 9 | (char)((char)(~var4[var5]) + var5) >>> 7))) ^ var5) ^ var5) + var5))) + 30474))) - 24031) - var5) ^ '髕'))) ^ 15323) >>> 1));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iiiiIiIlIIIIliIl(String protectedState, Map<String, String> blockId) {
      protectedState = (String)Objects.requireNonNull(protectedState, iIlIlllllill<invokedynamic>());
      blockId = Map.copyOf(blockId == null ? Map.of() : blockId);
      this.iIlIiliIll = protectedState;
      this.IllIiliIll = blockId;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -3573205310668820933L ^ Long.rotateLeft(-1047924909690953939L, 49) ^ -792489270833907845L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2246163239643102216L ^ Long.rotateLeft(8659952257871013670L, 6) ^ -1255737746469403981L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 386313886713117020L ^ Long.rotateLeft(-8815044911740034710L, 15) ^ -7437839377367930541L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 3293230034204714170L ^ Long.rotateLeft(1230641377078673586L, 45) ^ 5377857800343679477L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 4415612580237494640L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 7119026616733234423L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7416550263408814513L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6959699866987879642L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6064427379545208915L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1410225962769678766L;
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

   public Map<String, String> liiiIIllIl() {
      return this.IllIiliIll;
   }

   public String IliIlllilIi() {
      return this.iIlIiliIll;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) << 5 | (char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) >>> 11))) + var5) - var5) >>> 13 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) << 5 | (char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) >>> 11))) + var5) - var5) << 3) >>> 12 | (char)((char)((char)((char)(-((char)((char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) << 5 | (char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) >>> 11))) + var5) - var5) >>> 13 | (char)((char)((char)(-((char)((char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) << 5 | (char)((char)(~((char)((char)(-var4[var5]) << 8 | (char)(-var4[var5]) >>> 8))) + var5) >>> 11))) + var5) - var5) << 3) << 4))) - '\uf7fd'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) << 8 | (char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) >>> 8))) - '讪') + var5) - var5) >>> 7 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) << 8 | (char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) >>> 8))) - '讪') + var5) - var5) << 9) - 'ꨔ') ^ 24669) >>> 5 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) << 8 | (char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) >>> 8))) - '讪') + var5) - var5) >>> 7 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) << 8 | (char)(-((char)((char)((char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) >>> 13 | (char)((char)(~((char)((char)(-var4[var5]) ^ var5))) - var5) << 3) - var5))) >>> 8))) - '讪') + var5) - var5) << 9) - 'ꨔ') ^ 24669) << 11));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 31215) ^ var5) + var5) ^ 27903) - '\ued78') - 1076) + 31345) << 2 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) + 31215) ^ var5) + var5) ^ 27903) - '\ued78') - 1076) + 31345) >>> 14) - 'ꬆ'));
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
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))))) - 5266) + '訫'))) + 10520) + 20918) + var5))) ^ var5) - var5) + var5) + 25392) >>> 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))))) - 5266) + '訫'))) + 10520) + 20918) + var5))) ^ var5) - var5) + var5) + 25392) << 6) << 12 | (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))))) - 5266) + '訫'))) + 10520) + 20918) + var5))) ^ var5) - var5) + var5) + 25392) >>> 10 | (char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-((char)((char)((char)(-((char)(~((char)(var4[var5] >>> 2 | var4[var5] << 14))))) - 5266) + '訫'))) + 10520) + 20918) + var5))) ^ var5) - var5) + var5) + 25392) << 6) >>> 4) + var5))) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
