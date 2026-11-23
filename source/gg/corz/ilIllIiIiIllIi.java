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

public final class ilIllIiIiIllIi {
   public final String iIilllIiiIlilllIii;
   public final long IiilllIiiliilllIii;
   public final IlIiIlIlllIiIlIl IIilllIiilIilllIii;
   public final long llilllIiiililllIii;
   public final JsonObject iiilllIiiIIIillIii;

   public static ilIllIiIiIllIi IliIlllilIi(IlIiIlIlllIiIlIl payload, String senderId, JsonObject type) {
      return new ilIllIiIiIllIi(payload, senderId, -1L, System.currentTimeMillis(), type);
   }

   public String IilliliilIIi(String k) {
      return this.iiilllIiiIIIillIii.has(k) ? this.iiilllIiiIIIillIii.get(k).getAsString() : null;
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -8551289579357541234L ^ Long.rotateLeft(-6399247661469152475L, 26) ^ 4874250933788568626L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -1317927384284519556L ^ Long.rotateLeft(-5755531537570409351L, 54) ^ -5244456924667799800L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1983078754953934146L ^ Long.rotateLeft(-464015818916784779L, 41) ^ -7708073923894241411L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -4595247125318699258L ^ Long.rotateLeft(2057539930622697773L, 7) ^ 4154398121920387716L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 985627140865412219L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5106644242773094058L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8124707283668268564L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3383917246490116223L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6975413908736010520L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3610070308642126713L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IiIlliIliiIl<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIlllIlliIll<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, Illlllllilll<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iilllilliill<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIillIiliIil<invokedynamic>());
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
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) - var5) << 4 | (char)((char)(var4[var5] - var5) - var5) >>> 12) + 16832))) - var5) + var5))) >>> 8 | (char)(~((char)((char)((char)(~((char)((char)((char)((char)(var4[var5] - var5) - var5) << 4 | (char)((char)(var4[var5] - var5) - var5) >>> 12) + 16832))) - var5) + var5))) << 8) ^ 18621))))) + 8833));
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
         var4[var5] = (char)((char)((char)(~((char)(~((char)(-((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '눷')) << 9 | (char)((char)(var4[var5] - '눷')) >>> 7) ^ 18950)))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - '눷')) << 9 | (char)((char)(var4[var5] - '눷')) >>> 7) ^ 18950)))) << 8) ^ '\ue5f5') << 9 | (char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - '눷')) << 9 | (char)((char)(var4[var5] - '눷')) >>> 7) ^ 18950)))) >>> 8 | (char)(~((char)((char)((char)((char)((char)(var4[var5] - '눷')) << 9 | (char)((char)(var4[var5] - '눷')) >>> 7) ^ 18950)))) << 8) ^ '\ue5f5') >>> 7) ^ var5) - '\ud960'))))))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static ilIllIiIiIllIi iIlIlllllill(JsonObject o) {
      if (o == null) {
         return null;
      } else {
         IlIiIlIlllIiIlIl var1 = IlIiIlIlllIiIlIl.IliIlllilIi(o.has(IlIlllIlilIl<invokedynamic>()) ? o.get(IlIlllIlilIl<invokedynamic>()).getAsString() : null);
         if (var1 == null) {
            return null;
         } else {
            String var2 = o.has(IlIlllIlilIl<invokedynamic>()) ? o.get(IlIlllIlilIl<invokedynamic>()).getAsString() : "";
            long var3 = o.has(IlIlllIlilIl<invokedynamic>()) ? o.get(IlIlllIlilIl<invokedynamic>()).getAsLong() : -1L;
            long var5 = o.has(IlIlllIlilIl<invokedynamic>()) ? o.get(IlIlllIlilIl<invokedynamic>()).getAsLong() : System.currentTimeMillis();
            JsonObject var7 = o.has(IlIlllIlilIl<invokedynamic>()) && o.get(IlIlllIlilIl<invokedynamic>()).isJsonObject() ? o.getAsJsonObject(IlIlllIlilIl<invokedynamic>()) : new JsonObject();
            return new ilIllIiIiIllIi(var1, var2, var3, var5, var7);
         }
      }
   }

   public String lIiiIiIlilli(String def, String k) {
      String var3 = this.IilliliilIIi(def);
      return var3 == null ? k : var3;
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ 28532) << 2 | (char)((char)(var4[var5] + var5) ^ 28532) >>> 14) << 15 | (char)((char)((char)(var4[var5] + var5) ^ 28532) << 2 | (char)((char)(var4[var5] + var5) ^ 28532) >>> 14) >>> 1) - var5) - var5))) ^ '뀢') - var5) ^ 5933) ^ '莘') ^ 22209) ^ var5) + var5) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 22883) + '휍') - '빲') ^ 21040) + 4633))) ^ var5) + var5) << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 22883) + '휍') - '빲') ^ 21040) + 4633))) ^ var5) + var5) >>> 8) + 9485) ^ 8073) >>> 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 22883) + '휍') - '빲') ^ 21040) + 4633))) ^ var5) + var5) << 8 | (char)((char)((char)(-((char)((char)((char)((char)((char)(var4[var5] + 22883) + '휍') - '빲') ^ 21040) + 4633))) ^ var5) + var5) >>> 8) + 9485) ^ 8073) << 11) + 7113))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public int iliIiiliiiii(String k, int def) {
      try {
         return this.iiilllIiiIIIillIii.has(k) ? this.iiilllIiiIIIillIii.get(k).getAsInt() : def;
      } catch (Exception var4) {
         return def;
      }
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) ^ '쵡') ^ '\uf1bf') + var5) ^ var5) - 24010) + var5) ^ var5))) ^ 3199) - var5) + 945) + var5) ^ '콎'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public JsonObject liiiIIllIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IlIlllIlilIl<invokedynamic>(), this.IIilllIiilIilllIii.name());
      var1.addProperty(IlIlllIlilIl<invokedynamic>(), this.iIilllIiiIlilllIii);
      if (this.llilllIiiililllIii >= 0L) {
         var1.addProperty(IlIlllIlilIl<invokedynamic>(), this.llilllIiiililllIii);
      }

      var1.addProperty(IlIlllIlilIl<invokedynamic>(), this.IiilllIiiliilllIii);
      var1.add(IlIlllIlilIl<invokedynamic>(), this.iiilllIiiIIIillIii);
      return var1;
   }

   public ilIllIiIiIllIi(IlIiIlIlllIiIlIl payload, String type, long tsMs, long seq, JsonObject senderId) {
      this.IIilllIiilIilllIii = payload;
      this.iIilllIiiIlilllIii = type;
      this.llilllIiiililllIii = tsMs;
      this.IiilllIiiliilllIii = seq;
      this.iiilllIiiIIIillIii = senderId != null ? senderId : new JsonObject();
   }

   public long IIIllIIliIIl(String def, long k) {
      try {
         return this.iiilllIiiIIIillIii.has(def) ? this.iiilllIiiIIIillIii.get(def).getAsLong() : k;
      } catch (Exception var5) {
         return k;
      }
   }
}
