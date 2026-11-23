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

public class liiIiiIiiiiIiiIi extends ilIllIiIll {
   protected void Iilililiiili() {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1690.field_1894.method_23481(false);
      }

   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) << 7 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) >>> 9) << 4 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) << 7 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) >>> 9) >>> 12) << 10 | (char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) << 7 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) >>> 9) << 4 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) << 7 | (char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) << 4 | (char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') >>> 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) << 6 | (char)((char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) >>> 8 | (char)((char)(-((char)((char)(var4[var5] - '\udc89') + var5))) + var5) << 8) >>> 10) - '\ue01b') + var5) + var5) - var5) - '쾏') << 4)))))) >>> 12) >>> 9) >>> 12) >>> 6));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) << 13) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) << 13) << 13))) >>> 2 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) << 13) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) >>> 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') >>> 2 | (char)((char)((char)((char)((char)((char)((char)(~((char)(-var4[var5]))) + '蛎') + '\ude9c') ^ '\uf2e3') - var5) + '\uf2ff') ^ '藂') << 14) - '\ue0ae') - var5) << 13) << 13))) << 14) + 11814) - var5) + var5));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 26312) << 2 | (char)((char)(-((char)(var4[var5] + var5))) ^ 26312) >>> 14) + var5) ^ var5) - var5) + var5) ^ var5) + '\uf440') + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 26312) << 2 | (char)((char)(-((char)(var4[var5] + var5))) ^ 26312) >>> 14) + var5) ^ var5) - var5) + var5) ^ var5) + '\uf440') + var5) << 15) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 26312) << 2 | (char)((char)(-((char)(var4[var5] + var5))) ^ 26312) >>> 14) + var5) ^ var5) - var5) + var5) ^ var5) + '\uf440') + var5) >>> 1 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) ^ 26312) << 2 | (char)((char)(-((char)(var4[var5] + var5))) ^ 26312) >>> 14) + var5) ^ var5) - var5) + var5) ^ var5) + '\uf440') + var5) << 15) >>> 3) + 21811) + var5) - '잦'));
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
         var4[var5] = (char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) << 14 | (char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) >>> 2) << 14 | (char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) << 14 | (char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) >>> 2) >>> 2) ^ var5))) - 17841) << 15 | (char)((char)(-((char)((char)((char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) << 14 | (char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) >>> 2) << 14 | (char)((char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) << 14 | (char)(~((char)(~((char)(~((char)((char)((char)(var4[var5] ^ 8110) ^ '閧') + var5))))))) >>> 2) >>> 2) ^ var5))) - 17841) >>> 1) ^ 15444));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IliIlllilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 8895576942138348293L ^ Long.rotateLeft(-179770803377664849L, 25) ^ -6365512719942482613L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4202363286623624938L ^ Long.rotateLeft(-7614691202560163008L, 15) ^ 7466270888959260277L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4919109571214807354L ^ Long.rotateLeft(-5024418713917568705L, 49) ^ -3796748223645428064L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5000727866625705124L ^ Long.rotateLeft(9005717072730016740L, 51) ^ -5006791165126693815L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 5736798347272451985L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8227756759756266159L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8072475657233651102L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 4984250057702220552L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 8875187488468815356L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -3762575541357021877L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, lIiiIiIlilli<invokedynamic>());
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

   protected void iIIIlIlIIl() {
      if (Iiiilllliiilll.field_1724 != null) {
         Iiiilllliiilll.field_1690.field_1894.method_23481(true);
      }

   }

   // $FF: synthetic method
   private static CallSite liiiIIllIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - 27512) - var5) + var5) + '蜜'))))) + var5) << 13 | (char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - 27512) - var5) + var5) + '蜜'))))) + var5) >>> 3) + 26277) - '靬') >>> 4 | (char)((char)((char)((char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - 27512) - var5) + var5) + '蜜'))))) + var5) << 13 | (char)((char)(~((char)(-((char)((char)((char)((char)(var4[var5] - 27512) - var5) + var5) + '蜜'))))) + var5) >>> 3) + 26277) - '靬') << 12)) ^ '\uf751'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public liiIiiIiiiiIiiIi() {
      super(IliIlllilIi<invokedynamic>(), lllIllillIll.IIIlIIIilIIlIIIi);
   }
}
