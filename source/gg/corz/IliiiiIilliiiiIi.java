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
import net.minecraft.class_1887;
import net.minecraft.class_1893;
import net.minecraft.class_2960;
import net.minecraft.class_5321;
import net.minecraft.class_6880;

public final class IliiiiIilliiiiIi {
   private static final Map<String, class_5321<class_1887>> liiliIIlIi = new LinkedHashMap();
   public static final String iiiliIIlIi = "Any";

   public static class_5321<class_1887> liiiIIllIl(String displayName) {
      return displayName == null ? null : (class_5321)liiliIIlIi.get(displayName);
   }

   public static String[] IliIlllilIi() {
      long var4 = -5246243590002295972L;
      String[] var0 = new String[liiliIIlIi.size() + 1];
      var0[0] = IiIlliIliiIl<invokedynamic>();
      var4 ^= (4294967296L ^ var4) & -1L << 32;

      for(String var3 : liiliIIlIi.keySet()) {
         int var10001 = (int)(var4 >>> 32);
         var4 += 4294967296L;
         var0[var10001] = var3;
      }

      return var0;
   }

   private IliiiiIilliiiiIi() {
   }

   // $FF: synthetic method
   private static CallSite Illlllllilll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) << 8) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) << 8) - var5) << 2))) + var5) - var5) ^ var5))) >>> 13 | (char)(-((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) << 8) - var5) >>> 14 | (char)((char)((char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) >>> 8 | (char)((char)((char)((char)(-((char)(var4[var5] ^ var5))) << 11 | (char)(-((char)(var4[var5] ^ var5))) >>> 5) ^ var5) + var5) << 8) - var5) << 2))) + var5) - var5) ^ var5))) << 3))) + 15199) + '툓'))));
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
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) << 2))) ^ var5) ^ var5) - '푕') + '\uedb1') >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) << 2))) ^ var5) ^ var5) - '푕') + '\uedb1') << 11) << 5 | (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) << 2))) ^ var5) ^ var5) - '푕') + '\uedb1') >>> 5 | (char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) >>> 14 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(~((char)(~var4[var5]))) ^ 14416) ^ 29890) + '\uf153') + '\uf352') + '赶')) - var5) - 10140) << 2))) ^ var5) ^ var5) - '푕') + '\uedb1') << 11) >>> 11));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIlllIlliIll(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(-((char)((char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - '뽓') ^ 2839))) ^ 8122) + 12180))) >>> 10 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] - '뽓') ^ 2839))) ^ 8122) + 12180))) << 6) << 2 | (char)((char)(~((char)((char)((char)(-((char)((char)(var4[var5] - '뽓') ^ 2839))) ^ 8122) + 12180))) >>> 10 | (char)(~((char)((char)((char)(-((char)((char)(var4[var5] - '뽓') ^ 2839))) ^ 8122) + 12180))) << 6) >>> 14))))) - 28031));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] - 9613) >>> 5 | (char)(var4[var5] - 9613) << 11) + var5) ^ var5) + '齪') - 31286))) ^ var5) - var5))) + 6909) + 30289) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite IIillIiliIil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) >>> 14 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) << 2) - var5) << 15 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) >>> 14 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) << 2) - var5) >>> 1) + var5))) << 1 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) >>> 14 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) << 2) - var5) << 15 | (char)((char)((char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) >>> 14 | (char)(~((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) >>> 14 | (char)(~((char)((char)((char)((char)((char)(var4[var5] ^ 4647) ^ var5) ^ var5) - '謡') ^ var5))) << 2))) << 2) - var5) >>> 1) + var5))) >>> 15) - var5) + var5) + var5) - '藜') ^ 5200));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static String IIIllIIliIIl(String path) {
      long var7 = -8540118814790326136L;
      if (path != null && !path.isEmpty()) {
         String[] var1 = path.replace('_', ' ').split(IiIlliIliiIl<invokedynamic>());
         StringBuilder var2 = new StringBuilder();
         String[] var3 = var1;
         var7 ^= ((long)var1.length << 32 ^ var7) & -1L << 32;

         for(long var10 = var7 ^ (0L ^ var7) & -1L >>> 32; (int)var10 < (int)(var10 >>> 32); var10 ^= (var10 ^ var10 + (long)1) & -1L >>> 32) {
            String var6 = var3[(int)var10];
            if (!var6.isEmpty()) {
               if (var2.length() > 0) {
                  var2.append(' ');
               }

               var2.append(Character.toUpperCase(var6.charAt(0))).append(var6.substring(1));
            }
         }

         return var2.toString();
      } else {
         return "";
      }
   }

   public static boolean iIlIlllllill(class_6880<class_1887> displayName, String entry) {
      if (entry != null && !entry.equals(IiIlliIliiIl<invokedynamic>())) {
         if (displayName == null) {
            return false;
         } else {
            class_5321 var2 = (class_5321)liiliIIlIi.get(entry);
            if (var2 == null) {
               return false;
            } else if (displayName.method_40225(var2)) {
               return true;
            } else {
               class_2960 var3 = (class_2960)displayName.method_40230().map(class_5321::method_29177).orElse((Object)null);
               return var3 != null && var3.equals(var2.method_29177());
            }
         }
      } else {
         return true;
      }
   }

   public static String lIiiIiIlilli(class_6880<class_1887> entry) {
      if (entry == null) {
         return "";
      } else {
         String var1 = IilliliilIIi(entry);

         for(Map.Entry var3 : liiliIIlIi.entrySet()) {
            if (((class_5321)var3.getValue()).method_29177().method_12832().equals(var1)) {
               return (String)var3.getKey();
            }
         }

         return IIIllIIliIIl(var1);
      }
   }

   public static String iliIiiliiiii(int level) {
      String var10000;
      switch (level) {
         case 1 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 2 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 3 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 4 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 5 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 6 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 7 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 8 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 9 -> var10000 = IiIlliIliiIl<invokedynamic>();
         case 10 -> var10000 = IiIlliIliiIl<invokedynamic>();
         default -> var10000 = Integer.toString(level);
      }

      return var10000;
   }

   // $FF: synthetic method
   private static CallSite IiIlliIliiIl(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = -1478235947139683240L ^ Long.rotateLeft(3678973731545736798L, 51) ^ -6475405496521383982L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -4742589538061824622L ^ Long.rotateLeft(6382554902945219228L, 58) ^ -1400621078442528113L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7111575446565945705L ^ Long.rotateLeft(2394234382811986686L, 27) ^ 239916951011122595L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8145104874288855372L ^ Long.rotateLeft(4421725862577426651L, 11) ^ -7548048185884367080L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 6129534596700735511L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = -1385875023110510645L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = -8621441411506344161L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = -3852446949895209709L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6859298793645815780L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 4414607141387424252L;
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
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 24, IIillIiliIil<invokedynamic>());
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

   public static String IilliliilIIi(class_6880<class_1887> entry) {
      return entry == null ? "" : (String)entry.method_40230().map((k) -> k.method_29177().method_12832()).orElse("");
   }

   static {
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9101);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9119);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9131);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9130);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9099);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9118);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9123);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9112);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9110);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9115);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9124);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9121);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9111);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9095);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9107);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9096);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9129);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9097);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9127);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9105);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9128);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9122);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_23071);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_38223);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9103);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9116);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9126);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9125);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9108);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9132);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9098);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9120);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9106);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9104);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9117);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9114);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9100);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_50157);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_50158);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_50159);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9109);
      liiliIIlIi.put(IiIlliIliiIl<invokedynamic>(), class_1893.field_9113);
   }
}
