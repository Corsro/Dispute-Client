package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1792;
import net.minecraft.class_7923;

final class Iliillilliilli {
   int IiiiliIIIl;
   int IIiiliIIIl;
   int IliiliIIIl;
   int lililiIIIl;
   int iliiliIIIl;
   int lliiliIIIl;
   int iIiiliIIIl;
   int lIiiliIIIl;
   int iililiIIIl;
   final LinkedHashMap<class_1792, Integer> liiiliIIIl = new LinkedHashMap();

   String IliIlllilIi() {
      if (this.liiiliIIIl.isEmpty()) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(IilliliilIIi<invokedynamic>());
         int var2 = 0;

         for(Map.Entry var4 : this.liiiliIIIl.entrySet()) {
            if (var2++ > 0) {
               var1.append(IilliliilIIi<invokedynamic>());
            }

            if (var2 > 4) {
               var1.append(IilliliilIIi<invokedynamic>()).append(this.liiiliIIIl.size() - 4).append(IilliliilIIi<invokedynamic>());
               break;
            }

            var1.append(class_7923.field_41178.method_10221((class_1792)var4.getKey()).method_12832()).append(IilliliilIIi<invokedynamic>()).append(var4.getValue());
         }

         return var1.append(IilliliilIIi<invokedynamic>()).toString();
      }
   }

   private Iliillilliilli() {
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '\uf3f8') ^ '궶') - var5) ^ var5)) + var5) - var5) ^ var5) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '\uf3f8') ^ '궶') - var5) ^ var5)) + var5) - var5) ^ var5) ^ var5) >>> 4) - 1161) - '鄶') >>> 15 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '\uf3f8') ^ '궶') - var5) ^ var5)) + var5) - var5) ^ var5) ^ var5) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) + '\uf3f8') ^ '궶') - var5) ^ var5)) + var5) - var5) ^ var5) ^ var5) >>> 4) - 1161) - '鄶') << 1) + var5));
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
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(-((char)((char)((char)(~((char)((char)(var4[var5] - 6762) + '蚑'))) - var5) ^ '\ud961'))) - var5) + 'ﶘ'))) + '걪'));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) << 1 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) >>> 15) ^ '鵓') + var5) - var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) << 1 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) >>> 15) ^ '鵓') + var5) - var5) >>> 13))))) - 25987) - var5) >>> 2 | (char)((char)((char)(-((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) << 1 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) >>> 15) ^ '鵓') + var5) - var5) << 3 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) << 1 | (char)((char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) << 3 | (char)((char)((char)((char)(-var4[var5]) - var5) << 3 | (char)((char)(-var4[var5]) - var5) >>> 13) ^ var5) >>> 13) >>> 15) ^ '鵓') + var5) - var5) >>> 13))))) - 25987) - var5) << 14) - var5) + 13561) ^ '\udad1') - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   int liiiIIllIl() {
      return this.iIiiliIIIl + this.IliiliIIIl + this.lliiliIIIl + this.iliiliIIIl + this.IiiiliIIIl;
   }

   String iIlIlllllill() {
      return IilliliilIIi<invokedynamic>() + this.IIiiliIIIl + IilliliilIIi<invokedynamic>() + this.lIiiliIIIl + IilliliilIIi<invokedynamic>() + this.iIiiliIIIl + IilliliilIIi<invokedynamic>() + this.IliiliIIIl + IilliliilIIi<invokedynamic>() + this.lliiliIIIl + IilliliilIIi<invokedynamic>() + this.iliiliIIIl + (this.IiiiliIIIl > 0 ? IilliliilIIi<invokedynamic>() + this.IiiiliIIIl : "") + this.IliIlllilIi() + IilliliilIIi<invokedynamic>();
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] - var5) - var5) ^ 19536))))) << 8 | (char)(-((char)(~((char)((char)((char)(var4[var5] - var5) - var5) ^ 19536))))) >>> 8) - var5))) + '\ue4dc'))));
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
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 28583) + '눑') + '\ued34') ^ '욀') + var5))) ^ var5) ^ 13850) + 8107))) << 5 | (char)(~((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] - 28583) + '눑') + '\ued34') ^ '욀') + var5))) ^ var5) ^ 13850) + 8107))) >>> 11) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IilliliilIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 2479151168777686394L ^ Long.rotateLeft(-5588020859009493762L, 25) ^ 3839074385438108910L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 5606932672111273678L ^ Long.rotateLeft(-8343019494269011245L, 35) ^ 1690865614592183183L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -1261748725202950911L ^ Long.rotateLeft(8651865619819409994L, 10) ^ 2224864766292860072L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 6637206571680358334L ^ Long.rotateLeft(315269131671269904L, 1) ^ 444232297538692018L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -1466869531542390567L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8424997019683245602L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4016872504854825843L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 6937260209229108347L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6014170563871656926L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 498565412961565046L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(lIiiIiIlilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, iliIiiliiiii<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIIllIIliIIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IlIlllIlilIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IiIlliIliiIl<invokedynamic>());
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
}
