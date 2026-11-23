package gg.corz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.ConstantCallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import net.fabricmc.loader.api.FabricLoader;

public final class Iiiilliiil {
   public static final String ilIliliIiIlili = "modules.json";
   private static final String liIliliiiIlili = "corz-live-state-v1";
   private static final Map<String, String> lllliliilllili = Map.of(IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>(), IIlilIliiIli<invokedynamic>());
   private static final Gson iIlliliIlllili = (new GsonBuilder()).setPrettyPrinting().create();
   private static final String IIllililIllili = "live-state";

   static iilIiIiIIiIiIi IilliliilIIi(Path modules, List<ilIllIiIll> persist, Runnable verify, boolean dir) {
      Path var4 = modules.resolve(IIlilIliiIli<invokedynamic>());
      if (!Files.exists(var4, new LinkOption[0])) {
         return iilIiIiIIiIiIi.IliIilliilliIillii;
      } else {
         byte[] var5;
         try {
            var5 = Files.readAllBytes(var4);
         } catch (IOException var10) {
            System.err.println(IIlilIliiIli<invokedynamic>() + var10.getMessage());
            return iilIiIiIIiIiIi.IliIilliilliIillii;
         }

         JsonObject var6 = lIiiIiIlilli(var5);
         if (!dir) {
            if (var6 != null) {
               IlIlllIlilIl(var6, persist);
            }

            return iilIiIiIIiIiIi.iliIilliiIiiIillii;
         } else {
            byte[] var7 = Illlllllilll(modules);
            if (var7 == null) {
               if (var6 == null) {
                  return iilIiIiIIiIiIi.IliIilliilliIillii;
               } else {
                  IlIlllIlilIl(var6, persist);
                  IIlllIlliIll(modules, var5);
                  return iilIiIiIIiIiIi.liiIilliiiiiIillii;
               }
            } else if (Arrays.equals(var7, var5)) {
               if (var6 != null) {
                  IlIlllIlilIl(var6, persist);
               }

               return iilIiIiIIiIiIi.IIIlilliilIIlillii;
            } else {
               JsonObject var8 = lIiiIiIlilli(var7);
               if (var8 != null) {
                  IlIlllIlilIl(var8, persist);
               }

               if (var6 == null) {
                  verify.run();
                  return iilIiIiIIiIiIi.iIIlilliiIlIlillii;
               } else {
                  IIIllllllIIlllll var9 = iilIliIlIIiIliIl.Iiiiliiiiiii(iilIliIlIIiIliIl.Iilllilliill(var6, persist), llliiillilliiill.iIlIlllllill(), persist, verify);
                  if (var9.IlililIill != null) {
                     System.err.println(IIlilIliiIli<invokedynamic>() + var9.IlililIill);
                  } else if (var9.iIlIlllllill() != null) {
                  }

                  return iilIiIiIIiIiIi.iIIlilliiIlIlillii;
               }
            }
         }
      }
   }

   static byte[] Illlllllilll(Path dir) {
      try {
         String var1 = Ililllililil(dir);
         Path var2 = IIillIiliIil(var1);
         if (!Files.isRegularFile(var2, new LinkOption[0])) {
            return null;
         } else {
            JsonObject var3 = JsonParser.parseString(Files.readString(var2, StandardCharsets.UTF_8)).getAsJsonObject();
            if (!var1.equals(Iiilliiliiil(var3, IIlilIliiIli<invokedynamic>()))) {
               return null;
            } else {
               String var4 = Iiilliiliiil(var3, IIlilIliiIli<invokedynamic>());
               String var5 = Iiilliiliiil(var3, IIlilIliiIli<invokedynamic>());
               if (var4 != null && var5 != null) {
                  byte[] var6 = IlIillIiilIi(Base64.getDecoder().decode(var4));
                  String var7 = lilllIiliilllIil.IiiIlliiIl(IIlilIliiIli<invokedynamic>(), var1, var6);
                  if (var7 == null) {
                     return null;
                  } else {
                     return MessageDigest.isEqual(var7.getBytes(StandardCharsets.UTF_8), var5.getBytes(StandardCharsets.UTF_8)) ? var6 : null;
                  }
               } else {
                  return null;
               }
            }
         }
      } catch (Exception var8) {
         return null;
      }
   }

   private static byte[] IlIillIiilIi(byte[] packed) {
      GZIPInputStream var1 = new GZIPInputStream(new ByteArrayInputStream(packed));

      byte[] var2;
      try {
         var2 = var1.readAllBytes();
      } catch (Throwable var5) {
         try {
            var1.close();
         } catch (Throwable var4) {
            var5.addSuppressed(var4);
         }

         throw var5;
      }

      var1.close();
      return var2;
   }

   static JsonElement IIIllIIliIIl(JsonObject module, ilIllIiIll root) {
      JsonElement var2 = module.get(root.IilliliilIIi());
      if (var2 != null) {
         return var2;
      } else {
         String var3 = (String)lllliliilllili.get(root.IilliliilIIi());
         return var3 == null ? null : module.get(var3);
      }
   }

   // $FF: synthetic method
   private static CallSite Iliilliiilii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(~((char)(~((char)((char)(~((char)((char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 'ꖭ') + var5) + '褦') - var5) + var5) + '즸') + '訔') - var5))) + '胓') + 14783) >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 'ꖭ') + var5) + '褦') - var5) + var5) + '즸') + '訔') - var5))) + '胓') + 14783) << 12))) >>> 2 | (char)(-((char)((char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 'ꖭ') + var5) + '褦') - var5) + var5) + '즸') + '訔') - var5))) + '胓') + 14783) >>> 4 | (char)((char)((char)(~((char)((char)((char)((char)((char)((char)((char)((char)((char)(~var4[var5]) - 'ꖭ') + var5) + '褦') - var5) + var5) + '즸') + '訔') - var5))) + '胓') + 14783) << 12))) << 14))) + '\ue827'))))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   public static iilIiIiIIiIiIi iIlIlllllill(Path persist, List<ilIllIiIll> dir, Runnable modules) {
      return IilliliilIIi(persist, dir, modules, !IiIiliIiiiIi());
   }

   private static byte[] IIIilIIiiIIi(byte[] raw) {
      ByteArrayOutputStream var1 = new ByteArrayOutputStream();
      GZIPOutputStream var2 = new GZIPOutputStream(var1);

      try {
         var2.write(raw);
      } catch (Throwable var6) {
         try {
            var2.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      var2.close();
      return var1.toByteArray();
   }

   static Path Iilllilliill(Path dir) {
      return IIillIiliIil(Ililllililil(dir));
   }

   // $FF: synthetic method
   private static CallSite Iilililiiili(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 3 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 13) - var5) ^ '꒢'))))) + var5) ^ 12003) + 1116) + var5) + var5) + 'Ꝼ') ^ '颜') << 14 | (char)((char)((char)((char)((char)((char)((char)((char)(-((char)(~((char)((char)((char)((char)(var4[var5] >>> 14 | var4[var5] << 2) << 3 | (char)(var4[var5] >>> 14 | var4[var5] << 2) >>> 13) - var5) ^ '꒢'))))) + var5) ^ 12003) + 1116) + var5) + var5) + 'Ꝼ') ^ '颜') >>> 2));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   static synchronized void liiiIIllIl(Path dir, List<ilIllIiIll> seal, boolean modules) {
      Files.createDirectories(dir);
      byte[] var3 = iIlliliIlllili.toJson(iliIiiliiiii(seal)).getBytes(StandardCharsets.UTF_8);
      Files.write(dir.resolve(IIlilIliiIli<invokedynamic>()), var3, new OpenOption[0]);
      if (modules) {
         IIlllIlliIll(dir, var3);
      }

   }

   // $FF: synthetic method
   private static CallSite IIlilIliiIli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      byte[] var4 = new byte[32];
      long var14 = 5365431487436821082L ^ Long.rotateLeft(-1290194712703812734L, 44) ^ 4609133235830282480L;
      var4[0] = (byte)((int)(var14 >>> 0));
      var4[1] = (byte)((int)(var14 >>> 8));
      var4[2] = (byte)((int)(var14 >>> 16));
      var4[3] = (byte)((int)(var14 >>> 24));
      var4[4] = (byte)((int)(var14 >>> 32));
      var4[5] = (byte)((int)(var14 >>> 40));
      var4[6] = (byte)((int)(var14 >>> 48));
      var4[7] = (byte)((int)(var14 >>> 56));
      var14 = 2033129855909533567L ^ Long.rotateLeft(5050860226082871811L, 25) ^ 1496665159594427540L;
      var4[8] = (byte)((int)(var14 >>> 0));
      var4[9] = (byte)((int)(var14 >>> 8));
      var4[10] = (byte)((int)(var14 >>> 16));
      var4[11] = (byte)((int)(var14 >>> 24));
      var4[12] = (byte)((int)(var14 >>> 32));
      var4[13] = (byte)((int)(var14 >>> 40));
      var4[14] = (byte)((int)(var14 >>> 48));
      var4[15] = (byte)((int)(var14 >>> 56));
      var14 = -4491639253564213925L ^ Long.rotateLeft(-398834873977585827L, 16) ^ 4897883537298842043L;
      var4[16] = (byte)((int)(var14 >>> 0));
      var4[17] = (byte)((int)(var14 >>> 8));
      var4[18] = (byte)((int)(var14 >>> 16));
      var4[19] = (byte)((int)(var14 >>> 24));
      var4[20] = (byte)((int)(var14 >>> 32));
      var4[21] = (byte)((int)(var14 >>> 40));
      var4[22] = (byte)((int)(var14 >>> 48));
      var4[23] = (byte)((int)(var14 >>> 56));
      var14 = -5555326839523094810L ^ Long.rotateLeft(8155286293457511361L, 27) ^ -6390504803747568786L;
      var4[24] = (byte)((int)(var14 >>> 0));
      var4[25] = (byte)((int)(var14 >>> 8));
      var4[26] = (byte)((int)(var14 >>> 16));
      var4[27] = (byte)((int)(var14 >>> 24));
      var4[28] = (byte)((int)(var14 >>> 32));
      var4[29] = (byte)((int)(var14 >>> 40));
      var4[30] = (byte)((int)(var14 >>> 48));
      var4[31] = (byte)((int)(var14 >>> 56));
      byte[] var5 = new byte[32];
      var14 = 152557703599853748L;
      var5[0] = (byte)((int)(var14 >>> 0));
      var5[1] = (byte)((int)(var14 >>> 8));
      var5[2] = (byte)((int)(var14 >>> 16));
      var5[3] = (byte)((int)(var14 >>> 24));
      var5[4] = (byte)((int)(var14 >>> 32));
      var5[5] = (byte)((int)(var14 >>> 40));
      var5[6] = (byte)((int)(var14 >>> 48));
      var5[7] = (byte)((int)(var14 >>> 56));
      var14 = 4077120078488330873L;
      var5[8] = (byte)((int)(var14 >>> 0));
      var5[9] = (byte)((int)(var14 >>> 8));
      var5[10] = (byte)((int)(var14 >>> 16));
      var5[11] = (byte)((int)(var14 >>> 24));
      var5[12] = (byte)((int)(var14 >>> 32));
      var5[13] = (byte)((int)(var14 >>> 40));
      var5[14] = (byte)((int)(var14 >>> 48));
      var5[15] = (byte)((int)(var14 >>> 56));
      var14 = 4686770023329625797L;
      var5[16] = (byte)((int)(var14 >>> 0));
      var5[17] = (byte)((int)(var14 >>> 8));
      var5[18] = (byte)((int)(var14 >>> 16));
      var5[19] = (byte)((int)(var14 >>> 24));
      var5[20] = (byte)((int)(var14 >>> 32));
      var5[21] = (byte)((int)(var14 >>> 40));
      var5[22] = (byte)((int)(var14 >>> 48));
      var5[23] = (byte)((int)(var14 >>> 56));
      var14 = 436621432419265041L;
      var5[24] = (byte)((int)(var14 >>> 0));
      var5[25] = (byte)((int)(var14 >>> 8));
      var5[26] = (byte)((int)(var14 >>> 16));
      var5[27] = (byte)((int)(var14 >>> 24));
      var5[28] = (byte)((int)(var14 >>> 32));
      var5[29] = (byte)((int)(var14 >>> 40));
      var5[30] = (byte)((int)(var14 >>> 48));
      var5[31] = (byte)((int)(var14 >>> 56));
      byte[] var6 = new byte[16];
      var14 = -7363761200348740569L;
      var6[0] = (byte)((int)(var14 >>> 0));
      var6[1] = (byte)((int)(var14 >>> 8));
      var6[2] = (byte)((int)(var14 >>> 16));
      var6[3] = (byte)((int)(var14 >>> 24));
      var6[4] = (byte)((int)(var14 >>> 32));
      var6[5] = (byte)((int)(var14 >>> 40));
      var6[6] = (byte)((int)(var14 >>> 48));
      var6[7] = (byte)((int)(var14 >>> 56));
      var14 = 8779578897092813545L;
      var6[8] = (byte)((int)(var14 >>> 0));
      var6[9] = (byte)((int)(var14 >>> 8));
      var6[10] = (byte)((int)(var14 >>> 16));
      var6[11] = (byte)((int)(var14 >>> 24));
      var6[12] = (byte)((int)(var14 >>> 32));
      var6[13] = (byte)((int)(var14 >>> 40));
      var6[14] = (byte)((int)(var14 >>> 48));
      var6[15] = (byte)((int)(var14 >>> 56));
      Mac var7 = Mac.getInstance(Illillliilli<invokedynamic>());
      var7.init(new SecretKeySpec(var5, Iilililiiili<invokedynamic>()));
      byte[] var8 = var7.doFinal(var4);
      var7.init(new SecretKeySpec(var8, IIiilIiiiIii<invokedynamic>()));
      var7.update(var6);
      var7.update((byte)1);
      byte[] var9 = var7.doFinal();
      SecretKeySpec var10 = new SecretKeySpec(var9, 0, 16, Iliilliiilii<invokedynamic>());
      Base64.Decoder var11 = Base64.getDecoder();
      Cipher var12 = Cipher.getInstance(Iiiiliiiiiii<invokedynamic>());
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

   private static JsonObject iliIiiliiiii(List<ilIllIiIll> modules) {
      JsonObject var1 = new JsonObject();

      for(ilIllIiIll var3 : modules) {
         JsonObject var4 = new JsonObject();
         var4.addProperty(IIlilIliiIli<invokedynamic>(), var3.IliIlllilIi());
         var4.addProperty(IIlilIliiIli<invokedynamic>(), var3.IIIilIIiiIIi());
         JsonObject var5 = new JsonObject();

         for(IilliIllilliIl var7 : var3.IiIlliIliiIl()) {
            JsonElement var8 = var7.IIlllIlliIll();
            var5.add(var7.IliIlllilIi(), (JsonElement)(var8 != null ? var8 : JsonNull.INSTANCE));
         }

         var4.add(IIlilIliiIli<invokedynamic>(), var5);
         JsonElement var9 = var3.IIiIllIiIl();
         if (var9 != null) {
            var4.add(IIlilIliiIli<invokedynamic>(), var9);
         }

         var1.add(var3.IilliliilIIi(), var4);
      }

      return var1;
   }

   private static String Iiilliiliiil(JsonObject o, String k) {
      return o.has(k) && o.get(k).isJsonPrimitive() ? o.get(k).getAsString() : null;
   }

   private static boolean IiIiliIiiiIi() {
      try {
         return FabricLoader.getInstance().isDevelopmentEnvironment();
      } catch (Throwable var1) {
         return false;
      }
   }

   private static void IiIlliIliiIl(IilliIllilliIl element, JsonElement setting) {
      if (!element.IlIlllIlilIl()) {
         try {
            element.Illlllllilll(setting);
         } catch (Exception var3) {
            System.err.println(IIlilIliiIli<invokedynamic>() + element.IliIlllilIi() + IIlilIliiIli<invokedynamic>() + var3.getMessage());
         }

      }
   }

   public static void IliIlllilIi(Path modules, List<ilIllIiIll> dir) {
      liiiIIllIl(modules, dir, !IiIiliIiiiIi());
   }

   // $FF: synthetic method
   private static CallSite Illillliilli(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)(-((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) ^ '\ue435') + var5) >>> 13 | (char)((char)((char)(-((char)(var4[var5] - var5))) ^ '\ue435') + var5) << 3) - '\ue9ed'))))))) - var5))) << 1 | (char)(-((char)((char)(~((char)(-((char)(-((char)((char)((char)((char)((char)(-((char)(var4[var5] - var5))) ^ '\ue435') + var5) >>> 13 | (char)((char)((char)(-((char)(var4[var5] - var5))) ^ '\ue435') + var5) << 3) - '\ue9ed'))))))) - var5))) >>> 15) ^ var5))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static JsonObject lIiiIiIlilli(byte[] bytes) {
      try {
         return (JsonObject)iIlliliIlllili.fromJson(new String(bytes, StandardCharsets.UTF_8), JsonObject.class);
      } catch (Exception var2) {
         System.err.println(IIlilIliiIli<invokedynamic>() + var2.getMessage());
         return null;
      }
   }

   // $FF: synthetic method
   private static CallSite IIiilIiiiIii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)((char)((char)((char)((char)(-((char)((char)((char)((char)(~((char)((char)(var4[var5] + 9750) << 12 | (char)(var4[var5] + 9750) >>> 4))) << 4 | (char)(~((char)((char)(var4[var5] + 9750) << 12 | (char)(var4[var5] + 9750) >>> 4))) >>> 12) - var5) - '輩'))) + 31250) - '軄') + 22790) - var5));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static Path IIillIiliIil(String label) {
      String var1 = lIlIllIliIlIllIl.IlIlllIlilIl(label.getBytes(StandardCharsets.UTF_8)).substring(0, 32);
      return lilllIiliilllIil.iiiIlIIIll().resolve(IIlilIliiIli<invokedynamic>()).resolve(var1 + IIlilIliiIli<invokedynamic>());
   }

   // $FF: synthetic method
   private static CallSite Iiiiliiiiiii(MethodHandles.Lookup var0, String var1, MethodType var2, String var3) {
      char[] var4 = var3.toCharArray();

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var4[var5] = (char)((char)(-((char)((char)((char)((char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) >>> 8 | (char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) << 8) >>> 2 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) >>> 8 | (char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) << 8) << 14) ^ var5))) + 'ꉧ') << 6 | (char)((char)(-((char)((char)((char)((char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) >>> 8 | (char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) << 8) >>> 2 | (char)((char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) >>> 8 | (char)((char)((char)(var4[var5] + var5) ^ var5) >>> 12 | (char)((char)(var4[var5] + var5) ^ var5) << 4) << 8) << 14) ^ var5))) + 'ꉧ') >>> 10) ^ var5) + 15001))));
      }

      String var6 = new String(var4);
      Arrays.fill(var4, (char)0);
      MethodHandle var7 = MethodHandles.constant(String.class, var6);
      return new ConstantCallSite(var7);
   }

   private static void IIlllIlliIll(Path bytes, byte[] dir) {
      try {
         String var2 = Ililllililil(bytes);
         String var3 = lilllIiliilllIil.IiiIlliiIl(IIlilIliiIli<invokedynamic>(), var2, dir);
         if (var3 == null) {
            return;
         }

         JsonObject var4 = new JsonObject();
         var4.addProperty(IIlilIliiIli<invokedynamic>(), var2);
         var4.addProperty(IIlilIliiIli<invokedynamic>(), var3);
         var4.addProperty(IIlilIliiIli<invokedynamic>(), Base64.getEncoder().encodeToString(IIIilIIiiIIi(dir)));
         lilllIiliilllIil.iiIIlIIlIl(IIillIiliIil(var2), var4.toString().getBytes(StandardCharsets.UTF_8));
      } catch (Exception var5) {
         System.err.println(IIlilIliiIli<invokedynamic>() + var5.getMessage());
      }

   }

   private static void IlIlllIlilIl(JsonObject modules, List<ilIllIiIll> root) {
      long var9 = -7014600424310033780L;

      try {
         for(ilIllIiIll var3 : root) {
            JsonElement var4 = IIIllIIliIIl(modules, var3);
            if (var4 != null) {
               JsonObject var5 = var4.getAsJsonObject();
               if (var5.has(IIlilIliiIli<invokedynamic>())) {
                  var3.IlIillIiilIi(var5.get(IIlilIliiIli<invokedynamic>()).getAsInt());
               }

               if (var5.has(IIlilIliiIli<invokedynamic>())) {
                  JsonObject var6 = var5.getAsJsonObject(IIlilIliiIli<invokedynamic>());

                  for(IilliIllilliIl var8 : var3.IiIlliIliiIl()) {
                     if (var6.has(var8.IliIlllilIi())) {
                        IiIlliIliiIl(var8, var6.get(var8.IliIlllilIi()));
                     }
                  }
               }

               if (var5.has(IIlilIliiIli<invokedynamic>())) {
                  var3.iIiIlIliIl(var5.get(IIlilIliiIli<invokedynamic>()));
               }

               var3.IiiIlliiIl();
               if (var5.has(IIlilIliiIli<invokedynamic>())) {
                  var9 ^= ((long)var5.get(IIlilIliiIli<invokedynamic>()).getAsBoolean() << 32 ^ var9) & -1L << 32;
                  if ((int)(var9 >>> 32) != var3.IliIlllilIi()) {
                     var3.IIillIiliIil((boolean)((int)(var9 >>> 32)));
                  }
               }
            }
         }
      } catch (Exception var11) {
         System.err.println(IIlilIliiIli<invokedynamic>() + var11.getMessage());
      }

   }

   private static String Ililllililil(Path dir) {
      Path var1 = dir.toAbsolutePath().normalize();

      try {
         var1 = var1.toRealPath();
      } catch (IOException var3) {
      }

      return var1.toString();
   }

   private Iiiilliiil() {
   }
}
