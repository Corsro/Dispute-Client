package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.Writer;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_1297;

public final class iIIiIiIlIlIiIiIl {
   private static final Gson liIIlliIll;
   private static final Path ilIIlliIll = FabricLoader.getInstance().getConfigDir().resolve(Ililllililil<invokedynamic>());
   private static final LinkedHashSet<String> iiIIlliIll;
   private static final Path IiIIlliIll;

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 14504) << 1 | (char)((char)((char)(-((char)(var4[var5] + var5))) + var5) ^ 14504) >>> 15) + var5) - var5) + 17900)) - var5) + '벧'));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static void IIlllIlliIll() {
      iiIIlliIll.clear();
      Iilllilliill();
   }

   public static boolean IlIlllIlilIl(String name) {
      long var3 = -3026704172365419351L;
      if (name == null) {
         return false;
      } else {
         String var1 = name.toLowerCase(Locale.ROOT);
         var3 ^= ((long)iiIIlliIll.removeIf((f) -> f.toLowerCase(Locale.ROOT).equals(var1)) << 32 ^ var3) & -1L << 32;
         if ((int)(var3 >>> 32) != 0) {
            Iilllilliill();
         }

         return (boolean)((int)(var3 >>> 32));
      }
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(~((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) >>> 11 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) << 5) + var5) << 12 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) >>> 11 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) << 5) + var5) >>> 4) >>> 11 | (char)((char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) >>> 11 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) << 5) + var5) << 12 | (char)((char)((char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) >>> 11 | (char)((char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) << 12 | (char)(~((char)((char)(~((char)((char)((char)(var4[var5] + '\uedf9') - 'ퟒ') - var5))) ^ var5))) >>> 4) << 5) + var5) >>> 4) << 5))) + var5) - var5))) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean IIIllIIliIIl(String name) {
      if (name == null) {
         return false;
      } else {
         name = name.trim();
         if (!name.isEmpty() && !IliIlllilIi(name)) {
            iiIIlliIll.add(name);
            Iilllilliill();
            return true;
         } else {
            return false;
         }
      }
   }

   public static List<String> IilliliilIIi() {
      return new ArrayList(iiIIlliIll);
   }

   private iIIiIiIlIlIiIiIl() {
   }

   static {
      IiIIlliIll = ilIIlliIll.resolve(Ililllililil<invokedynamic>());
      liIIlliIll = (new GsonBuilder()).setPrettyPrinting().create();
      iiIIlliIll = new LinkedHashSet();
   }

   public static void Iilllilliill() {
      try {
         Files.createDirectories(ilIIlliIll);
         JsonArray var0 = new JsonArray();

         for(String var2 : iiIIlliIll) {
            var0.add(var2);
         }

         BufferedWriter var7 = Files.newBufferedWriter(IiIIlliIll);

         try {
            liIIlliIll.toJson(var0, var7);
         } catch (Throwable var5) {
            if (var7 != null) {
               try {
                  ((Writer)var7).close();
               } catch (Throwable var4) {
                  var5.addSuppressed(var4);
               }
            }

            throw var5;
         }

         if (var7 != null) {
            ((Writer)var7).close();
         }
      } catch (Exception var6) {
         System.err.println(Ililllililil<invokedynamic>() + var6.getMessage());
      }

   }

   public static boolean iliIiiliiiii() {
      return iiIIlliIll.isEmpty();
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) >>> 13 | (char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) << 3))) ^ '홊') << 9 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) >>> 13 | (char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) << 3))) ^ '홊') >>> 7) + var5) ^ var5))) << 13 | (char)(-((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) >>> 13 | (char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) << 3))) ^ '홊') << 9 | (char)((char)(~((char)((char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) >>> 13 | (char)((char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) << 15 | (char)((char)((char)(var4[var5] + 732) >>> 2 | (char)(var4[var5] + 732) << 14) ^ var5) >>> 1) << 3))) ^ '홊') >>> 7) + var5) ^ var5))) >>> 3));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static boolean iIlIlllllill(String name) {
      return IliIlllilIi(name);
   }

   public static boolean liiiIIllIl(class_1297 entity) {
      if (entity == null) {
         return false;
      } else {
         String var1 = entity.method_5477().getString();
         return IliIlllilIi(var1);
      }
   }

   public static void Illlllllilll() {
      if (Files.exists(IiIIlliIll, new LinkOption[0])) {
         try {
            BufferedReader var0 = Files.newBufferedReader(IiIIlliIll);

            label72: {
               try {
                  JsonArray var1 = (JsonArray)liIIlliIll.fromJson(var0, JsonArray.class);
                  if (var1 == null) {
                     break label72;
                  }

                  iiIIlliIll.clear();

                  for(JsonElement var3 : var1) {
                     if (var3 != null && var3.isJsonPrimitive()) {
                        String var4 = var3.getAsString().trim();
                        if (!var4.isEmpty()) {
                           iiIIlliIll.add(var4);
                        }
                     }
                  }
               } catch (Throwable var6) {
                  if (var0 != null) {
                     try {
                        ((Reader)var0).close();
                     } catch (Throwable var5) {
                        var6.addSuppressed(var5);
                     }
                  }

                  throw var6;
               }

               if (var0 != null) {
                  ((Reader)var0).close();
               }

               return;
            }

            if (var0 != null) {
               ((Reader)var0).close();
            }

         } catch (Exception var7) {
            System.err.println(Ililllililil<invokedynamic>() + var7.getMessage());
         }
      }
   }

   public static boolean IliIlllilIi(String name) {
      if (name != null && !name.isEmpty()) {
         String var1 = name.toLowerCase(Locale.ROOT);

         for(String var3 : iiIIlliIll) {
            if (var3.toLowerCase(Locale.ROOT).equals(var1)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   // $FF: synthetic method
   private static CallSite Ililllililil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5079132796737601088L ^ Long.rotateLeft(6174500469920636453L, 31) ^ -7725186116438516952L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 6705301562211306765L ^ Long.rotateLeft(-3399012668523708037L, 40) ^ 1601267596768770754L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -7943307058621894084L ^ Long.rotateLeft(-6267352975039264843L, 18) ^ -6845920276271328636L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = 2141889721899733850L ^ Long.rotateLeft(-7803297234402207068L, 5) ^ 2767696304775992336L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 3502990602511821676L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 329083778541896629L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 915781758694428949L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 3738347979357985138L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = 6200328263600533554L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = -1022860563205528986L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Iiilliiliiil<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IIIilIIiiIIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IlIillIiilIi<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, IiIiliIiiiIi<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(IIlilIliiIli<invokedynamic>());
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

   public static void IiIlliIliiIl(String name) {
      if (IliIlllilIi(name)) {
         IlIlllIlilIl(name);
      } else {
         IIIllIIliIIl(name);
      }

   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '쒙') + '눦') ^ 30211) + 'ꀴ') ^ '齡') - 29656) - var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '쒙') + '눦') ^ 30211) + 'ꀴ') ^ '齡') - 29656) - var5))) << 3) ^ var5) + var5))) + var5) >>> 1 | (char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '쒙') + '눦') ^ 30211) + 'ꀴ') ^ '齡') - 29656) - var5))) >>> 13 | (char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] ^ var5) ^ var5) - '쒙') + '눦') ^ 30211) + 'ꀴ') ^ '齡') - 29656) - var5))) << 3) ^ var5) + var5))) + var5) << 15) - '\ue779') ^ var5) ^ 11185));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static int lIiiIiIlilli() {
      return iiIIlliIll.size();
   }

   // $FF: synthetic method
   private static CallSite Iiilliiliiil(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10))) - var5) - var5))) + var5) - '톏') + var5) + var5))) >>> 11 | (char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)(-((char)((char)(-var4[var5]) >>> 6 | (char)(-var4[var5]) << 10))) - var5) - var5))) + var5) - '톏') + var5) + var5))) << 5) ^ '顒') ^ '븻') ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }
}
