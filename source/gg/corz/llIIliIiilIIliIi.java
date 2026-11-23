package gg.corz;

import com.google.gson.JsonObject;
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

public record llIIliIiilIIliIi(iIliIlIlIlliIlIl placement, String dimension) {
   private final String IllIIliIIi;
   private final iIliIlIlIlliIlIl iIlIIliIIi;

   public JsonObject IilliliilIIi() {
      JsonObject var1 = this.iIlIIliIIi.iIlIlllllill();
      var1.addProperty(IiIlliIliiIl<invokedynamic>(), this.IllIIliIIi);
      return var1;
   }

   public boolean liiiIIllIl(llIIliIiilIIliIi o) {
      return o != null && this.IllIIliIIi.equals(o.IllIIliIIi) && this.iIlIIliIIi != null && this.iIlIIliIIi.equals(o.iIlIIliIIi);
   }

   public String IlIlllIlilIl() {
      return this.IllIIliIIi;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 2 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 14) - '\uf1b8') + 21615) + var5))) ^ var5) ^ 23737) + '빯') << 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 2 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 14) - '\uf1b8') + 21615) + var5))) ^ var5) ^ 23737) + '빯') >>> 13)))) << 3 | (char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 2 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 14) - '\uf1b8') + 21615) + var5))) ^ var5) ^ 23737) + '빯') << 3 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) - var5) + var5) << 2 | (char)((char)((char)(var4[var5] + var5) - var5) + var5) >>> 14) - '\uf1b8') + 21615) + var5))) ^ var5) ^ 23737) + '빯') >>> 13)))) >>> 13) + var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean IliIlllilIi() {
      return this.iIlIIliIIi != null && !this.IllIIliIIi.isEmpty();
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - 5336) >>> 1 | (char)(var4[var5] - 5336) << 15) - 28362))) + var5))) - var5) + var5) + 17005) ^ '뷴'))) >>> 7 | (char)(-((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)((char)(var4[var5] - 5336) >>> 1 | (char)(var4[var5] - 5336) << 15) - 28362))) + var5))) - var5) + var5) + 17005) ^ '뷴'))) << 9) ^ var5))) ^ 2761) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -178396496262041728L ^ Long.rotateLeft(2943321978072941445L, 6) ^ -6218331881606434341L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -2667142896223579919L ^ Long.rotateLeft(-1778969219042315709L, 13) ^ -2367307610644787100L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2263286469803569287L ^ Long.rotateLeft(1353738184680463622L, 58) ^ 4570151732366556794L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 4864068912684233279L ^ Long.rotateLeft(4487746490526628953L, 30) ^ -5300937690675839529L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6673694084569853055L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -6622510122975204067L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 469288477005590862L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -8218530690809697561L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 751578315942981240L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 1303374492646029507L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IIlllIlliIll<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Illlllllilll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Iilllilliill<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, IIillIiliIil<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Ililllililil<invokedynamic>());
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

   public String iliIiiliiiii() {
      return this.iIlIIliIIi.lIiiIiIlilli() + IiIlliIliiIl<invokedynamic>() + this.IllIIliIIi;
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) << 12 | (char)((char)((char)(~var4[var5]) + var5) + var5) >>> 4) - 22785) + var5) << 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) << 12 | (char)((char)((char)(~var4[var5]) + var5) + var5) >>> 4) - 22785) + var5) >>> 12) << 11 | (char)((char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) << 12 | (char)((char)((char)(~var4[var5]) + var5) + var5) >>> 4) - 22785) + var5) << 4 | (char)((char)((char)((char)((char)((char)(~var4[var5]) + var5) + var5) << 12 | (char)((char)((char)(~var4[var5]) + var5) + var5) >>> 4) - 22785) + var5) >>> 12) >>> 5) ^ var5) - var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public iIliIlIlIlliIlIl IIIllIIliIIl() {
      return this.iIlIIliIIi;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) - var5) ^ '튢') + 14096) ^ var5) ^ var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] + var5) ^ var5))) - var5) ^ '튢') + 14096) ^ var5) ^ var5) - var5) << 7) + 11365));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public llIIliIiilIIliIi(iIliIlIlIlliIlIl placement, String dimension) {
      dimension = dimension == null ? "" : dimension;
      this.iIlIIliIIi = placement;
      this.IllIIliIIi = dimension;
   }

   public String iIlIlllllill() {
      if (!this.IliIlllilIi()) {
         return "";
      } else {
         iIliIlIlIlliIlIl var1 = this.iIlIIliIIi;
         return Integer.toHexString(this.IllIIliIIi.hashCode() * 31 + var1.hashCode());
      }
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) ^ var5) >>> 15 | (char)((char)(var4[var5] + var5) ^ var5) << 1) - 8493))))) ^ '봸') << 13 | (char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] + var5) ^ var5) >>> 15 | (char)((char)(var4[var5] + var5) ^ var5) << 1) - 8493))))) ^ '봸') >>> 3) + var5) ^ 8203))))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static llIIliIiilIIliIi lIiiIiIlilli(JsonObject o) {
      if (o == null) {
         return null;
      } else {
         iIliIlIlIlliIlIl var1 = iIliIlIlIlliIlIl.IilliliilIIi(o);
         if (var1 == null) {
            return null;
         } else {
            String var2 = o.has(IiIlliIliiIl<invokedynamic>()) ? o.get(IiIlliIliiIl<invokedynamic>()).getAsString() : "";
            return var2 != null && !var2.isEmpty() ? new llIIliIiilIIliIi(var1, var2) : null;
         }
      }
   }
}
