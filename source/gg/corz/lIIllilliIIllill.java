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
import net.minecraft.class_3852;
import net.minecraft.class_5321;
import net.minecraft.class_6880;

public final class lIIllilliIIllill {
   private static final Map<String, class_5321<class_3852>> llIiIIiill = new LinkedHashMap();
   public static final String ilIiIIiill = "Any";
   private static final String[] IiIiIIiill;

   public static boolean IilliliilIIi(class_6880<class_3852> entry, String displayName) {
      if (displayName != null && !displayName.equals(IlIlllIlilIl<invokedynamic>())) {
         class_5321 var2 = (class_5321)llIiIIiill.get(displayName);
         return var2 != null && entry != null && entry.method_40225(var2);
      } else {
         return true;
      }
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 3175) - '뜏') - '\uf10e') - '뛛') ^ 'ﾷ') ^ '费') - '\udeef'))))) >>> 6 | (char)(~((char)(~((char)((char)((char)((char)((char)((char)((char)(var4[var5] - 3175) - '뜏') - '\uf10e') - '뛛') ^ 'ﾷ') ^ '费') - '\udeef'))))) << 10) - 6827));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 12 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 4) + var5) - '鸸') ^ var5)))) << 7 | (char)(-((char)((char)((char)((char)((char)((char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) >>> 12 | (char)((char)(~((char)(var4[var5] ^ var5))) ^ var5) << 4) + var5) - '鸸') ^ var5)))) >>> 9) - 19423) ^ 5618) ^ var5) ^ 29734) - var5) ^ var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String IliIlllilIi(int level) {
      return level > 0 && level < IiIiIIiill.length ? IiIiIIiill[level] : IlIlllIlilIl<invokedynamic>() + level;
   }

   private lIIllilliIIllill() {
   }

   static {
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17060);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17056);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17058);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17055);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17052);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17064);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17065);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17054);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17061);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17063);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17059);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17053);
      llIiIIiill.put(IlIlllIlilIl<invokedynamic>(), class_3852.field_17057);
      IiIiIIiill = new String[]{"", IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>(), IlIlllIlilIl<invokedynamic>()};
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)(-((char)(~((char)((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] - 19828))) >>> 7 | (char)(-((char)(var4[var5] - 19828))) << 9) - var5) + 19969) + '빢') << 12 | (char)((char)((char)((char)((char)(-((char)(var4[var5] - 19828))) >>> 7 | (char)(-((char)(var4[var5] - 19828))) << 9) - var5) + 19969) + '빢') >>> 4) - var5))) - 20655))) ^ 2846) - var5) - var5))))) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static String lIiiIiIlilli(class_6880<class_3852> entry) {
      if (entry == null) {
         return IlIlllIlilIl<invokedynamic>();
      } else {
         String var1 = (String)entry.method_40230().map((k) -> k.method_29177().method_12832()).orElse(IlIlllIlilIl<invokedynamic>());

         for(Map.Entry var3 : llIiIIiill.entrySet()) {
            if (((class_5321)var3.getValue()).method_29177().method_12832().equals(var1)) {
               return (String)var3.getKey();
            }
         }

         return iliIiiliiiii(var1);
      }
   }

   public static String[] liiiIIllIl() {
      long var4 = 5237123167695607221L;
      String[] var0 = new String[llIiIIiill.size() + 1];
      var0[0] = IlIlllIlilIl<invokedynamic>();
      var4 ^= (4294967296L ^ var4) & -1L << 32;

      for(String var3 : llIiIIiill.keySet()) {
         int var10001 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var0[var10001] = var3;
      }

      return var0;
   }

   // $FF: synthetic method
   private static CallSite Iilllilliill(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)(-((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) - '슸') ^ 23175))) + 29097) << 14 | (char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) - '슸') ^ 23175))) + 29097) >>> 2) + var5) ^ var5))) << 14 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) - '슸') ^ 23175))) + 29097) << 14 | (char)((char)(~((char)((char)((char)((char)(-var4[var5]) + var5) - '슸') ^ 23175))) + 29097) >>> 2) + var5) ^ var5))) >>> 2))) - var5))))) ^ '붔') ^ '둬'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static class_5321<class_3852> iIlIlllllill(String displayName) {
      return displayName == null ? null : (class_5321)llIiIIiill.get(displayName);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) << 9) >>> 7 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) << 9) << 9))) << 2 | (char)(~((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) << 9) >>> 7 | (char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) >>> 7 | (char)((char)((char)(-((char)((char)((char)((char)((char)((char)(-var4[var5]) + var5) << 8 | (char)((char)(-var4[var5]) + var5) >>> 8) ^ 31954) - '\uf63c') ^ var5))) ^ '삐') - 22743) << 9) << 9))) >>> 14) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String iliIiiliiiii(String s) {
      if (s != null && !s.isEmpty()) {
         String var1 = s.replace('_', ' ');
         return Character.toUpperCase(var1.charAt(0)) + var1.substring(1);
      } else {
         return IlIlllIlilIl<invokedynamic>();
      }
   }

   // $FF: synthetic method
   private static CallSite IlIlllIlilIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 3500004845065390659L ^ Long.rotateLeft(-6783050375926721290L, 20) ^ 5635175050404539821L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2816489953415323470L ^ Long.rotateLeft(963738882158561160L, 17) ^ 9048269535905436058L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7016828806974324457L ^ Long.rotateLeft(-1850707256593713662L, 57) ^ -4757538571811909076L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2369572076778963049L ^ Long.rotateLeft(5033982622794813998L, 19) ^ -2421614605184751065L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -2665855985539442826L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -470584302712526601L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 410951126173576L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 5459294100718420486L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -6915465675021942840L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -2253779357021310692L;
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
}
