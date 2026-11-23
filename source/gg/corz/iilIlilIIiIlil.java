package gg.corz;

import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.minecraft.class_1747;
import net.minecraft.class_1799;
import net.minecraft.class_1922;
import net.minecraft.class_2248;
import net.minecraft.class_2338;
import net.minecraft.class_2343;
import net.minecraft.class_2680;
import net.minecraft.class_2682;
import net.minecraft.class_5688;
import net.minecraft.class_7923;

public final class iilIlilIIiIlil {
   public static final Set<String> iIIiliiIiIlIiliiIi = Set.of(lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>());
   public static final Set<String> llIiliiIiilIiliiIi = Set.of(lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>(), lIiiIiIlilli<invokedynamic>());

   private iilIlilIIiIlil() {
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) >>> 9 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) << 7) - var5)) >>> 4 | (char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) >>> 9 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) << 7) - var5)) << 12) << 5 | (char)((char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) >>> 9 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) << 7) - var5)) >>> 4 | (char)((char)((char)((char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) >>> 9 | (char)((char)(var4[var5] << 1 | var4[var5] >>> 15) >>> 7 | (char)(var4[var5] << 1 | var4[var5] >>> 15) << 9) << 7) - var5)) << 12) >>> 11) ^ 16565) - 25970))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIIllIIliIIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) + var5) ^ '깺')) << 10 | (char)((char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) + var5) ^ '깺')) >>> 6) + 11875) - 4303) << 12 | (char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) + var5) ^ '깺')) << 10 | (char)((char)((char)((char)((char)(~((char)(~var4[var5]))) - var5) + var5) ^ '깺')) >>> 6) + 11875) - 4303) >>> 4));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite lIiiIiIlilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 357415407322861839L ^ Long.rotateLeft(2951078768357089000L, 22) ^ 1719559451561404473L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 8957271712881613851L ^ Long.rotateLeft(-831613247257694443L, 37) ^ -1553083884777810480L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -2416365896334189764L ^ Long.rotateLeft(-9044832682234130524L, 30) ^ 5204975478981349137L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -6825857037887136074L ^ Long.rotateLeft(-4804619969188462458L, 62) ^ -7145551254441345719L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -5125227350197355410L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -8042545862545297375L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 7371273826652794539L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1646106260771322566L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7714466663620741840L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 6870311020705336659L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(iliIiiliiiii<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIllIIliIIl<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIlllIlilIl<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIlliIliiIl<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlllIlliIll<invokedynamic>());
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

   public static boolean IliIlllilIi(String id) {
      return id != null && (llIiliiIiilIiliiIi.contains(id) || iIIiliiIiIlIiliiIi.contains(id));
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] + 1060) - '\ud93a') ^ var5) - var5))) - var5))) ^ 25709))) ^ 8856) << 8 | (char)((char)(~((char)((char)(-((char)((char)(~((char)((char)((char)((char)(var4[var5] + 1060) - '\ud93a') ^ var5) - var5))) - var5))) ^ 25709))) ^ 8856) >>> 8));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean liiiIIllIl(class_1799 stack) {
      return stack != null && !stack.method_7960() && stack.method_7909() instanceof class_1747;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) >>> 2 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) << 14) >>> 4 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) >>> 2 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) << 14) << 12) >>> 4 | (char)((char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) >>> 2 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) << 14) >>> 4 | (char)((char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) >>> 2 | (char)((char)(-((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) >>> 9 | (char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)(var4[var5] ^ var5) + var5))) ^ var5)) + 17950) - var5) ^ 28928) ^ var5) ^ '깑') + '곘') + var5))) << 7))) + var5) << 14) << 12) << 12));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(class_1799 stack) {
      if (!liiiIIllIl(stack)) {
         return false;
      } else if (IliIlllilIi(class_7923.field_41178.method_10221(stack.method_7909()).toString())) {
         return false;
      } else {
         class_2248 var1 = ((class_1747)stack.method_7909()).method_7711();
         return !(var1 instanceof class_5688) && !(var1 instanceof class_2343) ? var1.method_9564().method_26234(class_2682.field_12294, class_2338.field_10980) : false;
      }
   }

   public static boolean IilliliilIIi(class_2680 pos, class_1922 world, class_2338 state) {
      if (pos != null && !pos.method_26215()) {
         class_2248 var3 = pos.method_26204();
         if (var3 instanceof class_2343) {
            return false;
         } else {
            return iIIiliiIiIlIiliiIi.contains(class_7923.field_41175.method_10221(var3).toString()) ? false : pos.method_26234(world, state);
         }
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite iliIiiliiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 3 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 13) + var5) ^ var5) ^ 11168) ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 3 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 13) + var5) ^ var5) ^ 11168) ^ var5) - var5) - var5) << 7))) - 2614) >>> 12 | (char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 3 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 13) + var5) ^ var5) ^ 11168) ^ var5) - var5) - var5) >>> 9 | (char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] << 6 | var4[var5] >>> 10) >>> 3 | (char)(var4[var5] << 6 | var4[var5] >>> 10) << 13) + var5) ^ var5) ^ 11168) ^ var5) - var5) - var5) << 7))) - 2614) << 4))) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
