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
import net.minecraft.class_2338;
import net.minecraft.class_243;

public final class IlIiiIIillIiiIIi {
   public transient long iiIiIiiiil;
   public int iIIiIiiiil;
   public transient long liIiIiiiil;
   public int IlIiIiiiil;
   public String llIiIiiiil = Illlllllilll<invokedynamic>();
   public int lIIiIiiiil;
   public transient boolean IiIiIiiiil;
   public IlliliIillliliIi ilIiIiiiil;

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 11 | (char)(var4[var5] >>> 7 | var4[var5] << 9) << 5))) - '鷺') - 10744))) ^ '鼓') << 9 | (char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] >>> 7 | var4[var5] << 9) >>> 11 | (char)(var4[var5] >>> 7 | var4[var5] << 9) << 5))) - '鷺') - 10744))) ^ '鼓') >>> 7) ^ 1334) - '虜') + 'ꀥ') ^ '鯢') - 13877) ^ var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7198180924457162574L ^ Long.rotateLeft(6179438392178310753L, 15) ^ -4008699273985531668L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -5630771901486999109L ^ Long.rotateLeft(-2478543060882069772L, 15) ^ 3224566214527557769L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 3376962233244619973L ^ Long.rotateLeft(-1607933845070239184L, 19) ^ 3325643893799907327L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2368003742077716851L ^ Long.rotateLeft(6265904477809150788L, 32) ^ -6876130938732281721L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5120527887734009628L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -5963025513769092679L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -2377868929828727834L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -1375668600322776584L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7036567854543499672L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3449980267231406961L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Iiilliiliiil<invokedynamic>());
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

   public boolean IIIllIIliIIl() {
      return this.ilIiIiiiil == IlliliIillliliIi.llllIiiIIi || this.ilIiIiiiil == IlliliIillliliIi.illlIiiIIi;
   }

   public IlIiiIIillIiiIIi() {
      this.ilIiIiiiil = IlliliIillliliIi.illlIiiIIi;
      this.liIiIiiiil = -4611686018427387904L;
      this.iiIiIiiiil = -4611686018427387904L;
   }

   public String IlIlllIlilIl() {
      return this.ilIiIiiiil + Illlllllilll<invokedynamic>() + this.lIIiIiiiil + Illlllllilll<invokedynamic>() + this.iIIiIiiiil + Illlllllilll<invokedynamic>() + this.IlIiIiiiil;
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 8024) ^ var5))) - var5) ^ 31697))) >>> 10 | (char)(~((char)((char)((char)(~((char)((char)(var4[var5] ^ 8024) ^ var5))) - var5) ^ 31697))) << 6) ^ 539) + 20208) - var5) ^ var5) + 15480) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IliIlllilIi(boolean tick, long full) {
      this.IiIiIiiiil = tick;
      if (tick) {
         this.liIiIiiiil = full;
      }

   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ 18896) + 8780) + '칻') ^ '떪') + '鶁') >>> 9 | (char)((char)((char)((char)((char)(var4[var5] ^ 18896) + 8780) + '칻') ^ '떪') + '鶁') << 7) - 18472) ^ 13276) - var5) + var5) - 10094))) - 26398))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static IlIiiIIillIiiIIi IIlllIlliIll(JsonObject o) {
      IlIiiIIillIiiIIi var1 = new IlIiiIIillIiiIIi();

      try {
         var1.lIIiIiiiil = o.get(Illlllllilll<invokedynamic>()).getAsInt();
         var1.iIIiIiiiil = o.get(Illlllllilll<invokedynamic>()).getAsInt();
         var1.IlIiIiiiil = o.get(Illlllllilll<invokedynamic>()).getAsInt();
         if (o.has(Illlllllilll<invokedynamic>())) {
            var1.llIiIiiiil = o.get(Illlllllilll<invokedynamic>()).getAsString();
         }

         if (o.has(Illlllllilll<invokedynamic>())) {
            var1.ilIiIiiiil = IlliliIillliliIi.valueOf(o.get(Illlllllilll<invokedynamic>()).getAsString());
         }
      } catch (Exception var3) {
      }

      return var1;
   }

   public JsonObject IiIlliIliiIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(Illlllllilll<invokedynamic>(), this.lIIiIiiiil);
      var1.addProperty(Illlllllilll<invokedynamic>(), this.iIIiIiiiil);
      var1.addProperty(Illlllllilll<invokedynamic>(), this.IlIiIiiiil);
      var1.addProperty(Illlllllilll<invokedynamic>(), this.llIiIiiiil);
      var1.addProperty(Illlllllilll<invokedynamic>(), this.ilIiIiiiil.name());
      return var1;
   }

   public boolean iliIiiliiiii() {
      return this.ilIiIiiiil == IlliliIillliliIi.iIllIiiIIi || this.ilIiIiiiil == IlliliIillliliIi.illlIiiIIi;
   }

   public class_243 iIlIlllllill() {
      return new class_243((double)this.lIIiIiiiil + (double)0.5F, (double)this.iIIiIiiiil + (double)0.5F, (double)this.IlIiIiiiil + (double)0.5F);
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ 27321))) << 5 | (char)(~((char)(var4[var5] ^ 27321))) >>> 11) - '蘇'))) >>> 4 | (char)(~((char)((char)((char)(~((char)(var4[var5] ^ 27321))) << 5 | (char)(~((char)(var4[var5] ^ 27321))) >>> 11) - '蘇'))) << 12) ^ var5))))) + '\ued13'))) - 'ﺈ') - var5) + var5) + 14328) << 12 | (char)((char)((char)((char)((char)(-((char)((char)(-((char)(~((char)((char)((char)(~((char)((char)((char)(~((char)(var4[var5] ^ 27321))) << 5 | (char)(~((char)(var4[var5] ^ 27321))) >>> 11) - '蘇'))) >>> 4 | (char)(~((char)((char)((char)(~((char)(var4[var5] ^ 27321))) << 5 | (char)(~((char)(var4[var5] ^ 27321))) >>> 11) - '蘇'))) << 12) ^ var5))))) + '\ued13'))) - 'ﺈ') - var5) + var5) + 14328) >>> 4) ^ '췬') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public boolean lIiiIiIlilli() {
      return this.ilIiIiiiil == IlliliIillliliIi.IlllIiiIIi || this.ilIiIiiiil == IlliliIillliliIi.illlIiiIIi;
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31041) >>> 11 | (char)(var4[var5] + 31041) << 5) ^ var5) + var5) + var5) ^ '\uddf0') ^ var5) - 'ｋ') + var5) + '\uda27') - var5) ^ var5) << 7 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + 31041) >>> 11 | (char)(var4[var5] + 31041) << 5) ^ var5) + var5) + var5) ^ '\uddf0') ^ var5) - 'ｋ') + var5) + '\uda27') - var5) ^ var5) >>> 9) + var5) + var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public class_2338 liiiIIllIl() {
      return new class_2338(this.lIIiIiiiil, this.iIIiIiiiil, this.IlIiIiiiil);
   }

   public IlIiiIIillIiiIIi(class_2338 pos, String dimension, IlliliIillliliIi role) {
      this.ilIiIiiiil = IlliliIillliliIi.illlIiiIIi;
      this.liIiIiiiil = -4611686018427387904L;
      this.iiIiIiiiil = -4611686018427387904L;
      this.lIIiIiiiil = pos.method_10263();
      this.iIIiIiiiil = pos.method_10264();
      this.IlIiIiiiil = pos.method_10260();
      this.llIiIiiiil = dimension;
      this.ilIiIiiiil = role;
   }

   public boolean IilliliilIIi(String dim) {
      return this.llIiIiiiil != null && this.llIiIiiiil.equals(dim);
   }
}
