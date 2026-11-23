package gg.corz;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.class_156;

public final class llIliiIiilIliiIi {
   private static final int iIliIIIlIi = 512;
   private static final long IiIiIIIlIi = 262144L;
   private static final int iiIiIIIlIi = 16;
   private static int liliIIIlIi;
   private static List<IIIlliIllIIlliIl> IlliIIIlIi = List.of();
   public static final String iIIiIIIlIi = "radio.json";
   private static IllIliilllIlii llliIIIlIi;
   private static final int lIliIIIlIi = 16;
   private static boolean IiliIIIlIi;
   private static final int ilIiIIIlIi = 24;
   private static final int liIiIIIlIi = 24;
   private static final int IIliIIIlIi = 64;
   private static final String IlIiIIIlIi = "/assets/corzclient/radio/stations.json";
   private static boolean illiIIIlIi;
   private static final String llIiIIIlIi = "corzclient";

   public static synchronized IllIliilllIlii iIlIlllllill() {
      return llliIIIlIi;
   }

   private static String IIillIiliIil(JsonObject o, String name, int max) {
      long var9 = 6823565430287332112L;
      long var11 = -2143138729841470962L;
      JsonElement var3 = o.get(name);
      if (var3 != null && var3.isJsonPrimitive()) {
         String var4 = var3.getAsString();
         if (var4 == null) {
            return "";
         } else {
            StringBuilder var5 = new StringBuilder(Math.min(var4.length(), max));
            var9 ^= (0L ^ var9) & -1L << 32;

            for(var9 ^= (0L ^ var9) & -1L >>> 32; (int)var9 < var4.length(); var9 ^= (var9 ^ var9 + (long)1) & -1L >>> 32) {
               var11 ^= ((long)var4.charAt((int)var9) << 32 ^ var11) & -1L << 32;
               if ((int)(var11 >>> 32) >= 32 && (int)(var11 >>> 32) != 127 && !Character.isWhitespace((char)((int)(var11 >>> 32)))) {
                  if ((int)(var9 >>> 32) != 0) {
                     var5.append(' ');
                  }

                  var9 ^= (0L ^ var9) & -1L << 32;
                  var5.append((char)((int)(var11 >>> 32)));
               } else {
                  var9 ^= ((long)(var5.length() > 0 ? 1 : 0) << 32 ^ var9) & -1L << 32;
               }
            }

            String var7 = IiiIliiliiIlii.liiiIIllIl(var5.toString());
            if (var7 == null) {
               return "";
            } else {
               var7 = var7.trim();
               return var7.length() > max ? var7.substring(0, max).trim() : var7;
            }
         }
      } else {
         return "";
      }
   }

   private static int Ililllililil(JsonObject name, String o) {
      JsonElement var2 = name.get(o);
      if (var2 != null && var2.isJsonPrimitive()) {
         try {
            JsonPrimitive var3 = var2.getAsJsonPrimitive();
            double var4 = var3.isNumber() ? var3.getAsDouble() : Double.parseDouble(var3.getAsString().trim());
            return !Double.isNaN(var4) && !(var4 < (double)1.0F) ? (int)Math.min((double)99999.0F, Math.floor(var4)) : 0;
         } catch (Throwable var6) {
            return 0;
         }
      } else {
         return 0;
      }
   }

   private static String IiIlliIliiIl() {
      try {
         InputStream var0 = llIliiIiilIliiIi.class.getResourceAsStream(IIIilIIiiIIi<invokedynamic>());

         String var1;
         try {
            var1 = var0 == null ? null : new String(var0.readAllBytes(), StandardCharsets.UTF_8);
         } catch (Throwable var4) {
            if (var0 != null) {
               try {
                  var0.close();
               } catch (Throwable var3) {
                  var4.addSuppressed(var3);
               }
            }

            throw var4;
         }

         if (var0 != null) {
            var0.close();
         }

         return var1;
      } catch (Throwable var5) {
         return null;
      }
   }

   private static Path IIIllIIliIIl() {
      try {
         FabricLoader var0 = FabricLoader.getInstance();
         Path var1 = var0.getGameDir().resolve(IIIilIIiiIIi<invokedynamic>()).resolve(IIIilIIiiIIi<invokedynamic>());
         if (Files.isRegularFile(var1, new LinkOption[0])) {
            return var1;
         }

         Path var2 = var0.getConfigDir().resolve(IIIilIIiiIIi<invokedynamic>()).resolve(IIIilIIiiIIi<invokedynamic>());
         if (Files.isRegularFile(var2, new LinkOption[0])) {
            return var2;
         }
      } catch (Throwable var3) {
      }

      return null;
   }

   // $FF: synthetic method
   private static CallSite IlIillIiilIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(~((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)(-((char)((char)(var4[var5] - 30383) >>> 6 | (char)(var4[var5] - 30383) << 10))) - var5))) - '릺') ^ var5) ^ var5) + '핍') ^ var5))))) ^ 15094) + var5) + var5) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) << 4 | (char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) >>> 12) ^ '\uefd3') + var5) >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) << 4 | (char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) >>> 12) ^ '\uefd3') + var5) << 6) - var5) + 3248) << 13 | (char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) << 4 | (char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) >>> 12) ^ '\uefd3') + var5) >>> 10 | (char)((char)((char)((char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) << 4 | (char)((char)((char)(var4[var5] - '\ue51c') ^ var5) ^ 2528) >>> 12) ^ '\uefd3') + var5) << 6) - var5) + 3248) >>> 3) + var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)(~((char)((char)((char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) >>> 2) - var5) >>> 2 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) >>> 2) - var5) << 14))) - var5))) << 13 | (char)(~((char)((char)(-((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) >>> 2) - var5) >>> 2 | (char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) << 14 | (char)((char)((char)(-((char)(~((char)((char)((char)(var4[var5] + '\uf832') - '阺') + var5))))) - var5) + var5) >>> 2) - var5) << 14))) - var5))) >>> 3) - var5))) - var5) - 22927));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static synchronized int liiiIIllIl() {
      if (!IiliIIIlIi) {
         lIiiIiIlilli();
      }

      return liliIIIlIi;
   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(var4[var5] + var5)) ^ 11930) - '찅') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5)) ^ 11930) - '찅') ^ var5) << 15) << 6 | (char)((char)((char)((char)((char)((char)(var4[var5] + var5)) ^ 11930) - '찅') ^ var5) >>> 1 | (char)((char)((char)((char)((char)(var4[var5] + var5)) ^ 11930) - '찅') ^ var5) << 15) >>> 10) - var5) ^ 'ꦇ') + var5) - var5) - var5) ^ var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static String Iiilliiliiil(String raw) {
      if (raw != null && !raw.isEmpty()) {
         try {
            URI var1 = new URI(raw);
            String var2 = var1.getScheme();
            if (var2 == null) {
               return "";
            } else {
               var2 = var2.toLowerCase(Locale.ROOT);
               if (!var2.equals(IIIilIIiiIIi<invokedynamic>()) && !var2.equals(IIIilIIiiIIi<invokedynamic>())) {
                  if (!var2.equals(IIIilIIiiIIi<invokedynamic>())) {
                     return "";
                  } else {
                     String var6 = var1.getSchemeSpecificPart();
                     return var6 != null && var6.matches(IIIilIIiiIIi<invokedynamic>()) ? IIIilIIiiIIi<invokedynamic>() + var6 : "";
                  }
               } else {
                  String var3 = var1.getHost();
                  return var3 != null && !var3.isEmpty() ? var1.toASCIIString() : "";
               }
            }
         } catch (Throwable var4) {
            return "";
         }
      } else {
         return "";
      }
   }

   // $FF: synthetic method
   private static CallSite IiIiliIiiiIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)(-((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - var5) ^ '먍') - 9268) ^ 'ꖘ'))) - '퍞') + var5) ^ var5) + '\ue064') ^ var5))) + '\ue85b') >>> 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - var5) ^ '먍') - 9268) ^ 'ꖘ'))) - '퍞') + var5) ^ var5) + '\ue064') ^ var5))) + '\ue85b') << 5) + 15394)))))) << 14 | (char)(-((char)(~((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - var5) ^ '먍') - 9268) ^ 'ꖘ'))) - '퍞') + var5) ^ var5) + '\ue064') ^ var5))) + '\ue85b') >>> 11 | (char)((char)(~((char)((char)((char)((char)((char)((char)(~((char)((char)((char)((char)((char)(var4[var5] >>> 3 | var4[var5] << 13) - var5) ^ '먍') - 9268) ^ 'ꖘ'))) - '퍞') + var5) ^ var5) + '\ue064') ^ var5))) + '\ue85b') << 5) + 15394)))))) >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static synchronized void lIiiIiIlilli() {
      IiliIIIlIi = true;
      ++liliIIIlIi;
      illiIIIlIi = false;
      Path var0 = IIIllIIliIIl();
      if (var0 != null) {
         List var1 = IIlllIlliIll(IlIlllIlilIl(var0));
         if (var1 != null) {
            IlliIIIlIi = var1;
            llliIIIlIi = IllIliilllIlii.lllliIiIIl;
            return;
         }

         illiIIIlIi = true;
      }

      List var2 = IIlllIlliIll(IiIlliIliiIl());
      IlliIIIlIi = var2 == null ? List.of() : var2;
      llliIIIlIi = var2 == null ? IllIliilllIlii.iIlliIiIIl : IllIliilllIlii.IllliIiIIl;
   }

   static List<IIIlliIllIIlliIl> IIlllIlliIll(String json) {
      if (json == null) {
         return null;
      } else {
         try {
            if (!json.isEmpty() && json.charAt(0) == '\ufeff') {
               json = json.substring(1);
            }

            JsonElement var1 = JsonParser.parseString(json);
            JsonArray var2 = null;
            if (var1.isJsonArray()) {
               var2 = var1.getAsJsonArray();
            } else if (var1.isJsonObject()) {
               JsonElement var3 = var1.getAsJsonObject().get(IIIilIIiiIIi<invokedynamic>());
               if (var3 != null && var3.isJsonArray()) {
                  var2 = var3.getAsJsonArray();
               }
            }

            if (var2 == null) {
               return null;
            } else {
               ArrayList var8 = new ArrayList();

               for(JsonElement var5 : var2) {
                  if (var8.size() >= 24) {
                     break;
                  }

                  IIIlliIllIIlliIl var6 = Illlllllilll(var5);
                  if (var6 != null) {
                     var8.add(var6);
                  }
               }

               return var8.isEmpty() && !var2.isEmpty() ? null : List.copyOf(var8);
            }
         } catch (Throwable var7) {
            return null;
         }
      }
   }

   // $FF: synthetic method
   private static CallSite IIIilIIiiIIi(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 7704056450200026514L ^ Long.rotateLeft(-1013911290759784417L, 23) ^ -8988060548434668312L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = -6618123693474738167L ^ Long.rotateLeft(9207832482162573643L, 55) ^ 3973316074240329465L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = 7914698964432944180L ^ Long.rotateLeft(-5731231857819330399L, 25) ^ 945082624152595540L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -8671637476159809659L ^ Long.rotateLeft(-5396356579254905687L, 27) ^ 6624311487535878501L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = -3355446576836611554L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 2334311386789184266L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 5011322035947294794L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 1578978064392470532L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -8235121467072044321L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 3016784437216151470L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(IlIillIiilIi<invokedynamic>());
      var7.init(new SecretKeySpec(var5, IiIiliIiiiIi<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIlilIliiIli<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 32, Illillliilli<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iilililiiili<invokedynamic>());
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

   public static synchronized List<IIIlliIllIIlliIl> IliIlllilIi() {
      if (!IiliIIIlIi) {
         lIiiIiIlilli();
      }

      return IlliIIIlIi;
   }

   public static synchronized boolean IilliliilIIi() {
      return illiIIIlIi;
   }

   public static boolean iliIiiliiiii(IIIlliIllIIlliIl station) {
      if (station != null && station.IliIlllilIi()) {
         try {
            URI var1 = new URI(station.iliIiiliiiii());
            class_156.method_668().method_673(var1);
            return true;
         } catch (Throwable var2) {
            return false;
         }
      } else {
         return false;
      }
   }

   static {
      llliIIIlIi = IllIliilllIlii.iIlliIiIIl;
   }

   private llIliiIiilIliiIi() {
   }

   private static String Iilllilliill(JsonObject o, String max, int name) {
      JsonElement var3 = o.get(max);
      if (var3 != null && var3.isJsonPrimitive()) {
         String var4 = var3.getAsString();
         if (var4 == null) {
            return "";
         } else {
            var4 = var4.trim();
            return var4.length() > name ? "" : var4;
         }
      } else {
         return "";
      }
   }

   private static IIIlliIllIIlliIl Illlllllilll(JsonElement element) {
      if (element != null && element.isJsonObject()) {
         JsonObject var1 = element.getAsJsonObject();
         String var2 = IIillIiliIil(var1, IIIilIIiiIIi<invokedynamic>(), 24);
         if (var2.isEmpty()) {
            return null;
         } else {
            String var3 = IIillIiliIil(var1, IIIilIIiiIIi<invokedynamic>(), 16);
            if (!var3.matches(IIIilIIiiIIi<invokedynamic>())) {
               var3 = "";
            }

            String var4 = Iilllilliill(var1, IIIilIIiiIIi<invokedynamic>(), 512);
            String var5 = Iiilliiliiil(var4);
            String var6 = var2.toLowerCase(Locale.ROOT) + IIIilIIiiIIi<invokedynamic>() + var5;
            return new IIIlliIllIIlliIl(var2, var3, IIillIiliIil(var1, IIIilIIiiIIi<invokedynamic>(), 16), IIillIiliIil(var1, IIIilIIiiIIi<invokedynamic>(), 64), var5, Ililllililil(var1, IIIilIIiiIIi<invokedynamic>()), IIillIiliIil(var1, IIIilIIiiIIi<invokedynamic>(), 16), var6, var5.isEmpty() && !var4.isEmpty());
         }
      } else {
         return null;
      }
   }

   private static String IlIlllIlilIl(Path file) {
      try {
         return Files.size(file) > 262144L ? null : Files.readString(file, StandardCharsets.UTF_8);
      } catch (Throwable var2) {
         return null;
      }
   }
}
