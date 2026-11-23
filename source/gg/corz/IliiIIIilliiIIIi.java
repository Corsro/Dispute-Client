package gg.corz;

import com.google.gson.JsonElement;
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

public class IliiIIIilliiIIIi extends ilIllIiIll {
   private static final String IIilIlliil = "sidebarCollapsed";
   private static IliiIIIilliiIIIi lIilIlliil;
   private final iiIiiilIIliiil iIilIlliil = new iiIiiilIIliiil(IliIlllilIi<invokedynamic>(), IliIlllilIi<invokedynamic>(), false);
   public static final int iillIlliil = 344;

   public static boolean iiiIlIIIll() {
      return lIilIlliil != null && lIilIlliil.iIilIlliil.Iilllilliill();
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -6683670474000359685L ^ Long.rotateLeft(-6499122985517338987L, 47) ^ 784503064098018598L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5381614492787112827L ^ Long.rotateLeft(-4717150395491169210L, 31) ^ 2575336015107108605L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -572208290100899624L ^ Long.rotateLeft(2899270671985631602L, 3) ^ -3719191810800995426L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 5686466528801293380L ^ Long.rotateLeft(4579529104911190027L, 34) ^ 3746750188135782616L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2593367252677385300L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 5852177153020547182L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -4851489878273408841L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -2790580454623982317L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 3997870893723793228L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8026529790334996463L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, lIiiIiIlilli<invokedynamic>());
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
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) - var5) ^ var5) - 30875) << 4 | (char)((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) - var5) ^ var5) - 30875) >>> 12) + var5) - 19401) ^ '藄') ^ '퀧') - 24298))) + var5) - var5) ^ var5) >>> 7 | (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) - var5) ^ var5) - 30875) << 4 | (char)((char)((char)((char)((char)(var4[var5] + var5) >>> 8 | (char)(var4[var5] + var5) << 8) - var5) ^ var5) - 30875) >>> 12) + var5) - 19401) ^ '藄') ^ '퀧') - 24298))) + var5) - var5) ^ var5) << 9));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void Iilililiiili() {
      this.Ililllililil();
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] >>> 5 | var4[var5] << 11))) >>> 2 | (char)(-((char)(var4[var5] >>> 5 | var4[var5] << 11))) << 14))) + var5) - 'ꌃ') ^ var5) >>> 14 | (char)((char)((char)((char)(-((char)((char)(-((char)(var4[var5] >>> 5 | var4[var5] << 11))) >>> 2 | (char)(-((char)(var4[var5] >>> 5 | var4[var5] << 11))) << 14))) + var5) - 'ꌃ') ^ var5) << 2))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void iIiIlIliIl(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonElement var2 = element.getAsJsonObject().get(IliIlllilIi<invokedynamic>());
         if (var2 != null && var2.isJsonPrimitive() && var2.getAsJsonPrimitive().isBoolean()) {
            IIIiliIilIIiliIi.IliIlllilIi().Iilllilliill(var2.getAsBoolean());
         }

      }
   }

   public IliiIIIilliiIIIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IlllIIIillllIIIi);
      this.IlIlllIlilIl(new IilliIllilliIl[]{this.iIilIlliil});
      this.IlIillIiilIi(-(~-781561189) + -33 ^ -781561053);
      this.IIillIiliIil(true);
      lIilIlliil = this;
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 'ꎖ') + var5) << 14 | (char)((char)((char)(~var4[var5]) - 'ꎖ') + var5) >>> 2) + var5) - var5) ^ var5) + var5) - var5) - 29030) ^ var5) ^ var5) ^ var5) ^ 616) ^ 23862) + var5)))) - '\udd0e'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public void IlIillIiilIi(int bindKey) {
      super.IlIillIiilIi(bindKey < 0 ? ((407520062 >>> 3 | 407520062 << 29) >>> 9 | (407520062 >>> 3 | 407520062 << 29) << 23) ^ -119 ^ -93 ^ 870417878 : bindKey);
   }

   public boolean Iilllilliill() {
      return true;
   }

   public JsonElement IIiIllIiIl() {
      JsonObject var1 = new JsonObject();
      var1.addProperty(IliIlllilIi<invokedynamic>(), IIIiliIilIIiliIi.IliIlllilIi().Illlllllilll());
      return var1;
   }

   // $FF: synthetic method
   private static CallSite iIlIlllllill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) >>> 10) - 20373) - 'ﲮ') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) >>> 10) - 20373) - 'ﲮ') << 7) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) >>> 10) - 20373) - 'ﲮ') >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) << 6 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)(var4[var5] + 'ꇑ') + var5) >>> 12 | (char)((char)(var4[var5] + 'ꇑ') + var5) << 4))) + 28386) - var5)) + var5) ^ var5) >>> 10) - 20373) - 'ﲮ') << 7) << 7));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) << 5 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) >>> 11) ^ var5) - '껽') ^ var5) ^ 5667))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) << 5 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) >>> 11) ^ var5) - '껽') ^ var5) ^ 5667))) << 3) << 8 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) << 5 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) >>> 11) ^ var5) - '껽') ^ var5) ^ 5667))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) << 5 | (char)((char)(-((char)((char)(~((char)((char)(var4[var5] ^ '\ue4ed') + var5))) + '遇'))) ^ 2060) >>> 11) ^ var5) - '껽') ^ var5) ^ 5667))) << 3) >>> 8) ^ var5))) - var5) - '\ue71a') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
